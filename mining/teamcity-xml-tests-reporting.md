# teamcity-xml-tests-reporting 
 
# Bad smells
I found 82 bad smells with 38 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 33 | true |
| SpringBeanNameConventionInspection | 14 | false |
| DuplicatedCode | 5 | false |
| RedundantMethodOverride | 4 | false |
| SpringBeanConstructorArgInspection | 3 | false |
| SpringXmlAutowireExplicitlyInspection | 3 | false |
| ManualMinMaxCalculation | 3 | false |
| InnerClassMayBeStatic | 3 | true |
| SpringXmlModelInspection | 2 | false |
| SpringFacetInspection | 2 | false |
| ProtectedMemberInFinalClass | 2 | true |
| DanglingJavadoc | 2 | false |
| IgnoreResultOfCall | 2 | false |
| CStyleArrayDeclaration | 1 | false |
| BusyWait | 1 | false |
| TrivialStringConcatenation | 1 | false |
| ArraysAsListWithZeroOrOneArgument | 1 | false |
## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `agent/src/jetbrains/buildServer/xmlReportPlugin/LogAction.java`
#### Snippet
```java
  private final String myName;

  private LogAction(@NotNull String name) {
    myName = name;
  }
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginConstants.java`
#### Snippet
```java
  static final String PARSE_OUT_OF_DATE = "xmlReportParsing.parse.outofdate";
  static final String WHEN_NO_DATA_PUBLISHED = "xmlReportParsing.whenNoDataPublished";
  static final String FAIL_BUILD_IF_PARSING_FAILED = "xmlReportParsing.failBuildIfParsingFailed";
  static final String LOG_AS_INTERNAL = "xmlReportParsing.logAsInternal";
  static final String LOG_INTERNAL_SYSTEM_ERROR = "xmlReportParsing.logInternalSystemError";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginConstants.java`
#### Snippet
```java
  static final String PARSE_OUT_OF_DATE = "xmlReportParsing.parse.outofdate";
  static final String WHEN_NO_DATA_PUBLISHED = "xmlReportParsing.whenNoDataPublished";
  static final String FAIL_BUILD_IF_PARSING_FAILED = "xmlReportParsing.failBuildIfParsingFailed";
  static final String LOG_AS_INTERNAL = "xmlReportParsing.logAsInternal";
  static final String LOG_INTERNAL_SYSTEM_ERROR = "xmlReportParsing.logInternalSystemError";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginConstants.java`
#### Snippet
```java
public interface XmlReportPluginConstants {
  static final String REPORT_TYPE = "xmlReportParsing.reportType";
  static final String REPORT_DIRS = "xmlReportParsing.reportDirs";

  static final String VERBOSE_OUTPUT = "xmlReportParsing.verboseOutput";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginConstants.java`
#### Snippet
```java
public interface XmlReportPluginConstants {
  static final String REPORT_TYPE = "xmlReportParsing.reportType";
  static final String REPORT_DIRS = "xmlReportParsing.reportDirs";

  static final String VERBOSE_OUTPUT = "xmlReportParsing.verboseOutput";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginConstants.java`
#### Snippet
```java
  static final String QUIET_MODE = "xmlReportParsing.quietMode";

  static final String SPLIT_REGEX = " *[,\n\r] *";

  static final String BUILD_PROBLEM_TYPE = "xmlReportParsing";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginConstants.java`
#### Snippet
```java
  static final String QUIET_MODE = "xmlReportParsing.quietMode";

  static final String SPLIT_REGEX = " *[,\n\r] *";

  static final String BUILD_PROBLEM_TYPE = "xmlReportParsing";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginConstants.java`
#### Snippet
```java
  static final String LOG_AS_INTERNAL = "xmlReportParsing.logAsInternal";
  static final String LOG_INTERNAL_SYSTEM_ERROR = "xmlReportParsing.logInternalSystemError";
  static final String REPARSE_UPDATED = "xmlReportParsing.reparse.updated";

  static final String QUIET_MODE = "xmlReportParsing.quietMode";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginConstants.java`
#### Snippet
```java
  static final String LOG_AS_INTERNAL = "xmlReportParsing.logAsInternal";
  static final String LOG_INTERNAL_SYSTEM_ERROR = "xmlReportParsing.logInternalSystemError";
  static final String REPARSE_UPDATED = "xmlReportParsing.reparse.updated";

  static final String QUIET_MODE = "xmlReportParsing.quietMode";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginConstants.java`
#### Snippet
```java

  static final String MAX_ERRORS = "xmlReportParsing.max.errors";
  static final String MAX_WARNINGS = "xmlReportParsing.max.warnings";

  static final String FINDBUGS_HOME = "xmlReportParsing.findBugs.home";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginConstants.java`
#### Snippet
```java

  static final String MAX_ERRORS = "xmlReportParsing.max.errors";
  static final String MAX_WARNINGS = "xmlReportParsing.max.warnings";

  static final String FINDBUGS_HOME = "xmlReportParsing.findBugs.home";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginConstants.java`
#### Snippet
```java
  static final String FINDBUGS_LOOKUP_FILES = "xmlReportParsing.findBugs.lookup.files";

  static final String PARSE_OUT_OF_DATE = "xmlReportParsing.parse.outofdate";
  static final String WHEN_NO_DATA_PUBLISHED = "xmlReportParsing.whenNoDataPublished";
  static final String FAIL_BUILD_IF_PARSING_FAILED = "xmlReportParsing.failBuildIfParsingFailed";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginConstants.java`
#### Snippet
```java
  static final String FINDBUGS_LOOKUP_FILES = "xmlReportParsing.findBugs.lookup.files";

  static final String PARSE_OUT_OF_DATE = "xmlReportParsing.parse.outofdate";
  static final String WHEN_NO_DATA_PUBLISHED = "xmlReportParsing.whenNoDataPublished";
  static final String FAIL_BUILD_IF_PARSING_FAILED = "xmlReportParsing.failBuildIfParsingFailed";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginConstants.java`
#### Snippet
```java

  static final String PARSE_OUT_OF_DATE = "xmlReportParsing.parse.outofdate";
  static final String WHEN_NO_DATA_PUBLISHED = "xmlReportParsing.whenNoDataPublished";
  static final String FAIL_BUILD_IF_PARSING_FAILED = "xmlReportParsing.failBuildIfParsingFailed";
  static final String LOG_AS_INTERNAL = "xmlReportParsing.logAsInternal";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginConstants.java`
#### Snippet
```java

  static final String PARSE_OUT_OF_DATE = "xmlReportParsing.parse.outofdate";
  static final String WHEN_NO_DATA_PUBLISHED = "xmlReportParsing.whenNoDataPublished";
  static final String FAIL_BUILD_IF_PARSING_FAILED = "xmlReportParsing.failBuildIfParsingFailed";
  static final String LOG_AS_INTERNAL = "xmlReportParsing.logAsInternal";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginConstants.java`
#### Snippet
```java
  static final String VERBOSE_OUTPUT = "xmlReportParsing.verboseOutput";

  static final String MAX_ERRORS = "xmlReportParsing.max.errors";
  static final String MAX_WARNINGS = "xmlReportParsing.max.warnings";

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginConstants.java`
#### Snippet
```java
  static final String VERBOSE_OUTPUT = "xmlReportParsing.verboseOutput";

  static final String MAX_ERRORS = "xmlReportParsing.max.errors";
  static final String MAX_WARNINGS = "xmlReportParsing.max.warnings";

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginConstants.java`
#### Snippet
```java
  static final String REPORT_DIRS = "xmlReportParsing.reportDirs";

  static final String VERBOSE_OUTPUT = "xmlReportParsing.verboseOutput";

  static final String MAX_ERRORS = "xmlReportParsing.max.errors";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginConstants.java`
#### Snippet
```java
  static final String REPORT_DIRS = "xmlReportParsing.reportDirs";

  static final String VERBOSE_OUTPUT = "xmlReportParsing.verboseOutput";

  static final String MAX_ERRORS = "xmlReportParsing.max.errors";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginConstants.java`
#### Snippet
```java
  static final String WHEN_NO_DATA_PUBLISHED = "xmlReportParsing.whenNoDataPublished";
  static final String FAIL_BUILD_IF_PARSING_FAILED = "xmlReportParsing.failBuildIfParsingFailed";
  static final String LOG_AS_INTERNAL = "xmlReportParsing.logAsInternal";
  static final String LOG_INTERNAL_SYSTEM_ERROR = "xmlReportParsing.logInternalSystemError";
  static final String REPARSE_UPDATED = "xmlReportParsing.reparse.updated";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginConstants.java`
#### Snippet
```java
  static final String WHEN_NO_DATA_PUBLISHED = "xmlReportParsing.whenNoDataPublished";
  static final String FAIL_BUILD_IF_PARSING_FAILED = "xmlReportParsing.failBuildIfParsingFailed";
  static final String LOG_AS_INTERNAL = "xmlReportParsing.logAsInternal";
  static final String LOG_INTERNAL_SYSTEM_ERROR = "xmlReportParsing.logInternalSystemError";
  static final String REPARSE_UPDATED = "xmlReportParsing.reparse.updated";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginConstants.java`
#### Snippet
```java
  static final String FAIL_BUILD_IF_PARSING_FAILED = "xmlReportParsing.failBuildIfParsingFailed";
  static final String LOG_AS_INTERNAL = "xmlReportParsing.logAsInternal";
  static final String LOG_INTERNAL_SYSTEM_ERROR = "xmlReportParsing.logInternalSystemError";
  static final String REPARSE_UPDATED = "xmlReportParsing.reparse.updated";

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginConstants.java`
#### Snippet
```java
  static final String FAIL_BUILD_IF_PARSING_FAILED = "xmlReportParsing.failBuildIfParsingFailed";
  static final String LOG_AS_INTERNAL = "xmlReportParsing.logAsInternal";
  static final String LOG_INTERNAL_SYSTEM_ERROR = "xmlReportParsing.logInternalSystemError";
  static final String REPARSE_UPDATED = "xmlReportParsing.reparse.updated";

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginConstants.java`
#### Snippet
```java

  static final String FINDBUGS_HOME = "xmlReportParsing.findBugs.home";
  static final String FINDBUGS_LOOKUP_FILES = "xmlReportParsing.findBugs.lookup.files";

  static final String PARSE_OUT_OF_DATE = "xmlReportParsing.parse.outofdate";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginConstants.java`
#### Snippet
```java

  static final String FINDBUGS_HOME = "xmlReportParsing.findBugs.home";
  static final String FINDBUGS_LOOKUP_FILES = "xmlReportParsing.findBugs.lookup.files";

  static final String PARSE_OUT_OF_DATE = "xmlReportParsing.parse.outofdate";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginConstants.java`
#### Snippet
```java
  static final String MAX_WARNINGS = "xmlReportParsing.max.warnings";

  static final String FINDBUGS_HOME = "xmlReportParsing.findBugs.home";
  static final String FINDBUGS_LOOKUP_FILES = "xmlReportParsing.findBugs.lookup.files";

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginConstants.java`
#### Snippet
```java
  static final String MAX_WARNINGS = "xmlReportParsing.max.warnings";

  static final String FINDBUGS_HOME = "xmlReportParsing.findBugs.home";
  static final String FINDBUGS_LOOKUP_FILES = "xmlReportParsing.findBugs.lookup.files";

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginConstants.java`
#### Snippet
```java
  static final String REPARSE_UPDATED = "xmlReportParsing.reparse.updated";

  static final String QUIET_MODE = "xmlReportParsing.quietMode";

  static final String SPLIT_REGEX = " *[,\n\r] *";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginConstants.java`
#### Snippet
```java
  static final String REPARSE_UPDATED = "xmlReportParsing.reparse.updated";

  static final String QUIET_MODE = "xmlReportParsing.quietMode";

  static final String SPLIT_REGEX = " *[,\n\r] *";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginConstants.java`
#### Snippet
```java
  static final String SPLIT_REGEX = " *[,\n\r] *";

  static final String BUILD_PROBLEM_TYPE = "xmlReportParsing";
}

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginConstants.java`
#### Snippet
```java
  static final String SPLIT_REGEX = " *[,\n\r] *";

  static final String BUILD_PROBLEM_TYPE = "xmlReportParsing";
}

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginConstants.java`
#### Snippet
```java
 */
public interface XmlReportPluginConstants {
  static final String REPORT_TYPE = "xmlReportParsing.reportType";
  static final String REPORT_DIRS = "xmlReportParsing.reportDirs";

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginConstants.java`
#### Snippet
```java
 */
public interface XmlReportPluginConstants {
  static final String REPORT_TYPE = "xmlReportParsing.reportType";
  static final String REPORT_DIRS = "xmlReportParsing.reportDirs";

```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `getParsingStage()` is identical to its super method
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/antJUnit/GTestFactory.java`
#### Snippet
```java
  @NotNull
  @Override
  public ParsingStage getParsingStage() {
    return ParsingStage.RUNTIME;
  }
```

### RedundantMethodOverride
Method `getParsingStage()` is identical to its super method
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/mstest/VSTestFactory.java`
#### Snippet
```java
  @NotNull
  @Override
  public ParsingStage getParsingStage() {
    return ParsingStage.RUNTIME;
  }
```

### RedundantMethodOverride
Method `getParsingStage()` is identical to its super method
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/antJUnit/SurefireFactory.java`
#### Snippet
```java
  @NotNull
  @Override
  public ParsingStage getParsingStage() {
    return ParsingStage.RUNTIME;
  }
```

### RedundantMethodOverride
Method `getParsingStage()` is identical to its super method
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/mstest/MSTestFactory.java`
#### Snippet
```java
  @NotNull
  @Override
  public ParsingStage getParsingStage() {
    return ParsingStage.RUNTIME;
  }
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of parameter `text`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/findBugs/DetailsParser.java`
#### Snippet
```java

  @Override
  protected void handleText(char text[]) {
    myStringBuffer.append(text);
  }
```

## RuleId[id=SpringXmlModelInspection]
### SpringXmlModelInspection
Cannot resolve property 'idFormat'
in `server/src/META-INF/build-server-plugin.xml`
#### Snippet
```java

    <bean id="xmlReportPluginReportTypeUsageStatisticsProvider" class="jetbrains.buildServer.xmlReportPlugin.XmlReportPluginReportTypeUsageStatisticsProvider">
        <property name="idFormat" value="jb.xmlReportPlugin.reportType[%s]"/>
        <property name="groupName" value="XML Report Processing Report Types"/>
    </bean>
```

### SpringXmlModelInspection
Cannot resolve property 'groupName'
in `server/src/META-INF/build-server-plugin.xml`
#### Snippet
```java
    <bean id="xmlReportPluginReportTypeUsageStatisticsProvider" class="jetbrains.buildServer.xmlReportPlugin.XmlReportPluginReportTypeUsageStatisticsProvider">
        <property name="idFormat" value="jb.xmlReportPlugin.reportType[%s]"/>
        <property name="groupName" value="XML Report Processing Report Types"/>
    </bean>
</beans>
```

## RuleId[id=SpringFacetInspection]
### SpringFacetInspection
Application context not configured for this file
in `server/src/META-INF/build-server-plugin.xml`
#### Snippet
```java
<?xml version="1.0" encoding="UTF-8"?>
<!--
  ~ Copyright 2000-2022 JetBrains s.r.o.
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
    <bean id="xmlReportPluginBuildFeature" class="jetbrains.buildServer.xmlReportPlugin.XmlReportPluginBuildFeature"/>
    <bean class="jetbrains.buildServer.xmlReportPlugin.XmlReportPluginBuildProblemTypeDetailsProvider"/>

    <bean id="xmlReportPluginReportTypeUsageStatisticsProvider" class="jetbrains.buildServer.xmlReportPlugin.XmlReportPluginReportTypeUsageStatisticsProvider">
        <property name="idFormat" value="jb.xmlReportPlugin.reportType[%s]"/>
        <property name="groupName" value="XML Report Processing Report Types"/>
    </bean>
</beans>
```

### SpringFacetInspection
Application context not configured for this file
in `agent/src/META-INF/build-agent-plugin.xml`
#### Snippet
```java
<?xml version="1.0" encoding="UTF-8" ?>
<!--
  ~ Copyright 2000-2022 JetBrains s.r.o.
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

<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor" default-lazy-init="false">
  <bean id="junitFactory"
        class="jetbrains.buildServer.xmlReportPlugin.parsers.antJUnit.AntJUnitFactory"/>
  <bean id="testngFactory"
        class="jetbrains.buildServer.xmlReportPlugin.parsers.testng.TestNGFactory"/>
  <bean id="gtestFactory"
        class="jetbrains.buildServer.xmlReportPlugin.parsers.antJUnit.GTestFactory"/>
  <bean id="surefireFactory"
        class="jetbrains.buildServer.xmlReportPlugin.parsers.antJUnit.SurefireFactory"/>
  <bean id="nunitFactory"
        class="jetbrains.buildServer.xmlReportPlugin.parsers.nUnit.NUnitFactory"/>
  <bean id="findBugsFactory"
        class="jetbrains.buildServer.xmlReportPlugin.parsers.findBugs.FindBugsFactory"/>
  <bean id="pmdFactory"
        class="jetbrains.buildServer.xmlReportPlugin.parsers.pmd.PmdFactory"/>
  <bean id="checkstyleFactory"
        class="jetbrains.buildServer.xmlReportPlugin.parsers.checkstyle.CheckstyleFactory"/>
  <bean id="pmdCpdFactory"
        class="jetbrains.buildServer.xmlReportPlugin.parsers.pmdCpd.PmdCpdFactory"/>
  <bean id="mstestFactory"
        class="jetbrains.buildServer.xmlReportPlugin.parsers.mstest.MSTestFactory"/>
  <bean id="vstestFactory"
        class="jetbrains.buildServer.xmlReportPlugin.parsers.mstest.VSTestFactory"/>
  <bean id="trxFactory"
        class="jetbrains.buildServer.xmlReportPlugin.parsers.mstest.TRXFactory"/>
  <bean id="jslintFactory"
        class="jetbrains.buildServer.xmlReportPlugin.parsers.jslint.JSLintFactory"/>
  <bean id="ctestFactory"
        class="jetbrains.buildServer.xmlReportPlugin.parsers.ctest.CTestFactory"/>

  <bean class="jetbrains.buildServer.xmlReportPlugin.XmlReportPlugin" lazy-init="default" autowire="default">
  </bean>

  <bean id="JUnitDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$JUnitDataProcessor"/>
  <bean id="TestNGDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$TestNGDataProcessor"/>
  <bean id="NUnitDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$NUnitDataProcessor"/>
  <bean id="SurefireDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$SurefireDataProcessor"/>
  <bean id="FindBugsDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$FindBugsDataProcessor"/>
  <bean id="PmdDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$PmdDataProcessor"/>
  <bean id="CheckstyleDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$CheckstyleDataProcessor"/>
  <bean id="PmdCpdDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$PmdCpdDataProcessor"/>
  <bean id="MSTestDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$MSTestDataProcessor"/>
  <bean id="VSTestDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$VSTestDataProcessor"/>
  <bean id="TRXDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$TRXDataProcessor"/>
  <bean id="GTestDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$GTestDataProcessor"/>
  <bean id="JSLintDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$JSLintDataProcessor"/>
  <bean id="CTestDataProcessor"
        class="jetbrains.b
```

## RuleId[id=SpringBeanConstructorArgInspection]
### SpringBeanConstructorArgInspection
No matching constructor found in class 'XmlReportPluginBuildFeature'#treeend

*** ** * ** ***

|---------------------------------------|---|-----------|
| **XmlReportPluginBuildFeature(...):** |   | **Bean:** |
| PluginDescriptor descriptor           |   | **???**   |
in `server/src/META-INF/build-server-plugin.xml`
#### Snippet
```java
           xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
           default-autowire="constructor">
    <bean id="xmlReportPluginBuildFeature" class="jetbrains.buildServer.xmlReportPlugin.XmlReportPluginBuildFeature"/>
    <bean class="jetbrains.buildServer.xmlReportPlugin.XmlReportPluginBuildProblemTypeDetailsProvider"/>

```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'XmlReportPluginReportTypeUsageStatisticsProvider'#treeend

*** ** * ** ***

|------------------------------------------------------------|---|-----------|
| **XmlReportPluginReportTypeUsageStatisticsProvider(...):** |   | **Bean:** |
| SBuildServer server                                        |   | **???**   |
in `server/src/META-INF/build-server-plugin.xml`
#### Snippet
```java
    <bean class="jetbrains.buildServer.xmlReportPlugin.XmlReportPluginBuildProblemTypeDetailsProvider"/>

    <bean id="xmlReportPluginReportTypeUsageStatisticsProvider" class="jetbrains.buildServer.xmlReportPlugin.XmlReportPluginReportTypeUsageStatisticsProvider">
        <property name="idFormat" value="jb.xmlReportPlugin.reportType[%s]"/>
        <property name="groupName" value="XML Report Processing Report Types"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'XmlReportPlugin'#treeend

*** ** * ** ***

|-----------------------------------------------------------|---|-----------|
| **XmlReportPlugin(...):**                                 |   | **Bean:** |
| ExtensionsProvider extensionsProvider                     |   | **???**   |
| EventDispatcher\<AgentLifeCycleListener\> agentDispatcher |   | **???**   |
| InspectionReporter inspectionReporter                     |   | **???**   |
| DuplicatesReporter duplicatesReporter                     |   | **???**   |
| BuildAgentConfiguration configuration                     |   | **???**   |
in `agent/src/META-INF/build-agent-plugin.xml`
#### Snippet
```java
        class="jetbrains.buildServer.xmlReportPlugin.parsers.ctest.CTestFactory"/>

  <bean class="jetbrains.buildServer.xmlReportPlugin.XmlReportPlugin" lazy-init="default" autowire="default">
  </bean>

```

## RuleId[id=SpringXmlAutowireExplicitlyInspection]
### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `server/src/META-INF/build-server-plugin.xml`
#### Snippet
```java
           xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
           xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
           default-autowire="constructor">
    <bean id="xmlReportPluginBuildFeature" class="jetbrains.buildServer.xmlReportPlugin.XmlReportPluginBuildFeature"/>
    <bean class="jetbrains.buildServer.xmlReportPlugin.XmlReportPluginBuildProblemTypeDetailsProvider"/>
```

### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `agent/src/META-INF/build-agent-plugin.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor" default-lazy-init="false">
  <bean id="junitFactory"
        class="jetbrains.buildServer.xmlReportPlugin.parsers.antJUnit.AntJUnitFactory"/>
```

### SpringXmlAutowireExplicitlyInspection
Unnecessary autowired dependency
in `agent/src/META-INF/build-agent-plugin.xml`
#### Snippet
```java
        class="jetbrains.buildServer.xmlReportPlugin.parsers.ctest.CTestFactory"/>

  <bean class="jetbrains.buildServer.xmlReportPlugin.XmlReportPlugin" lazy-init="default" autowire="default">
  </bean>

```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/antJUnit/AntJUnitReportParser.java`
#### Snippet
```java
        @Override
        public void suiteFound(@Nullable final String suiteName) {
          if (suiteName == null) {
            myTestReporter.warning(TestMessages.getFileContainsUnnamedMessage(file, "suite"));
            return;
          }

          myTestReporter.openTestSuite(suiteName);
          ++myLoggedSuites;
          mySuites.push(suiteName);
        }
```

### DuplicatedCode
Duplicated code
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/antJUnit/AntJUnitReportParser.java`
#### Snippet
```java
        @Override
        public void suiteSystemOutFound(@Nullable final String suiteName, @Nullable final String message) {
          if (mySuites.isEmpty() || !mySuites.peek().equals(suiteName)) {
            LOG.warn(TestMessages.getFailedToLogSuiteMessage("system out", suiteName));
            return;
          }
          if (message != null && message.length() > 0) {
            myTestReporter.info(TestMessages.getOutFromSuiteMessage("System out", suiteName, message));
          }
        }
```

### DuplicatedCode
Duplicated code
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/antJUnit/AntJUnitReportParser.java`
#### Snippet
```java
        @Override
        public void suiteFinished(@Nullable final String suiteName) {
          if (mySuites.isEmpty() || !mySuites.peek().equals(suiteName)) {
            LOG.warn(TestMessages.getFailedToLogSuiteMessage("finish", suiteName));
            return;
          }
          myTestReporter.closeTestSuite();
          mySuites.pop();
        }
```

### DuplicatedCode
Duplicated code
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/checkstyle/CheckstyleReportParser.java`
#### Snippet
```java
        public void reportInspection(@NotNull final InspectionResult inspection) {
          switch (inspection.getPriority()) {
            case 1:
              ++myErrors;
              break;
            case 2:
              ++myWarnings;
              break;
            default:
              ++myInfos;
          }
          myInspectionReporter.reportInspection(inspection);
        }
```

### DuplicatedCode
Duplicated code
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/nUnit/NUnitXmlReportParser.java`
#### Snippet
```java
            elementsPatternPath(new Handler() {
              public XmlReturn processElement(@NotNull final XmlElementInfo reader) {
                if ("failure".equals(reader.getLocalName())) testData.setSuccess(false);
                return reader.visitChildren(
                  elementsPath(new TextHandler() {
                    public void setText(@NotNull final String text) {
                      testData.setMessage(text.trim());
                    }
                  }, "message"),
                  elementsPath(new TextHandler() {
                    public void setText(@NotNull final String text) {
                      testData.setFailureStackTrace(text.trim());
                    }
                  }, "stack-trace")
                );
              }
            }, "failure|reason")
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/findBugs/FileFinder.java`
#### Snippet
```java
      myLookup = new MemorizingLookup<String, String, Entry>(myJars) {
        @Override
        protected String lookupInside(@NotNull final Entry entry, @NotNull final String path) {
          return entry.getFilePath(path);
        }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `agent/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPlugin.java`
#### Snippet
```java
    @NotNull
    @Override
    protected Map<String, ParserFactory> createValue() {
      final Collection<ParserFactory> factories = myExtensionProvider.getExtensions(ParserFactory.class);
      final Map<String, ParserFactory> map = new HashMap<String, ParserFactory>((int)(factories.size() / 0.75f) + 1);
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `agent/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPlugin.java`
#### Snippet
```java

          try {
            Thread.sleep(500L);
          } catch (InterruptedException e) {
            getBuild().getBuildLogger().exception(e);
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/antJUnit/AntJUnitReportParser.java`
#### Snippet
```java
  @Override
  public ParsingResult getParsingResult() {
    return new TestParsingResult(myLoggedSuites, (myLoggedTests > myTestsToSkip) ? myLoggedTests : myTestsToSkip, myParsingException);
  }

```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/nUnit/NUnitReportParser.java`
#### Snippet
```java

  public ParsingResult getParsingResult() {
    return new TestParsingResult(myLoggedSuites, (myLoggedTests > myTestsToSkip) ? myLoggedTests : myTestsToSkip, myParsingException);
  }

```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/testng/TestNGReportParser.java`
#### Snippet
```java
  @Override
  public ParsingResult getParsingResult() {
    return new TestParsingResult(myLoggedSuites, (myLoggedTests > myTestsToSkip) ? myLoggedTests : myTestsToSkip, myParsingException);
  }

```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `agent/src/jetbrains/buildServer/xmlReportPlugin/duplicates/DuplicationResult.java`
#### Snippet
```java
    final Set<Integer> used = new HashSet<Integer>();
    for (DuplicatingFragment fragment : myFragments) {
      int hash = ("" + fragment.getPath() + fragment.getLine() + myHash).hashCode();
      while (!used.add(hash)) {
        hash++;
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/BaseXmlXppAbstractParser.java`
#### Snippet
```java

    public ORHandler(XmlHandler... delegates) {
      myDelegates = Arrays.asList(delegates);
    }

```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `ORHandler` may be 'static'
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/BaseXmlXppAbstractParser.java`
#### Snippet
```java
public abstract class BaseXmlXppAbstractParser extends XmlXppAbstractParser {

  protected abstract class ORHandler implements CloseableHandler, XmlHandler {
    private final List<XmlHandler> myDelegates;
    private boolean myMatched = false;
```

### InnerClassMayBeStatic
Inner class `FailureDetails` may be 'static'
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/nUnit/NUnitXmlReportParser.java`
#### Snippet
```java
  }

  private final class FailureDetails {
    private String message; private String stackTrace;
  }
```

### InnerClassMayBeStatic
Inner class `ProcessingContext` may be 'static'
in `agent/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPlugin.java`
#### Snippet
```java
    return StringUtil.truncateStringValue(XmlReportPluginConstants.BUILD_PROBLEM_TYPE + StringUtil.capitalize(type) + suffix, BuildProblemData.MAX_TYPE_LENGTH);
  }
  private final class ProcessingContext {
    private final long startTime;
    private volatile boolean finished;
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `agent/src/jetbrains/buildServer/xmlReportPlugin/Parser.java`
#### Snippet
```java
import org.jetbrains.annotations.Nullable;

/**
 * User: vbedrosova
 * Date: 22.01.11
```

### DanglingJavadoc
Dangling Javadoc comment
in `agent/src/jetbrains/buildServer/xmlReportPlugin/ReportStateHolder.java`
#### Snippet
```java
import org.jetbrains.annotations.Nullable;

/**
 * User: vbedrosova
 * Date: 24.01.11
```

## RuleId[id=SpringBeanNameConventionInspection]
### SpringBeanNameConventionInspection
'JUnitDataProcessor' should start with lowercase letter
in `agent/src/META-INF/build-agent-plugin.xml`
#### Snippet
```java
  </bean>

  <bean id="JUnitDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$JUnitDataProcessor"/>
  <bean id="TestNGDataProcessor"
```

### SpringBeanNameConventionInspection
'TestNGDataProcessor' should start with lowercase letter
in `agent/src/META-INF/build-agent-plugin.xml`
#### Snippet
```java
  <bean id="JUnitDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$JUnitDataProcessor"/>
  <bean id="TestNGDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$TestNGDataProcessor"/>
  <bean id="NUnitDataProcessor"
```

### SpringBeanNameConventionInspection
'NUnitDataProcessor' should start with lowercase letter
in `agent/src/META-INF/build-agent-plugin.xml`
#### Snippet
```java
  <bean id="TestNGDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$TestNGDataProcessor"/>
  <bean id="NUnitDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$NUnitDataProcessor"/>
  <bean id="SurefireDataProcessor"
```

### SpringBeanNameConventionInspection
'SurefireDataProcessor' should start with lowercase letter
in `agent/src/META-INF/build-agent-plugin.xml`
#### Snippet
```java
  <bean id="NUnitDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$NUnitDataProcessor"/>
  <bean id="SurefireDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$SurefireDataProcessor"/>
  <bean id="FindBugsDataProcessor"
```

### SpringBeanNameConventionInspection
'FindBugsDataProcessor' should start with lowercase letter
in `agent/src/META-INF/build-agent-plugin.xml`
#### Snippet
```java
  <bean id="SurefireDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$SurefireDataProcessor"/>
  <bean id="FindBugsDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$FindBugsDataProcessor"/>
  <bean id="PmdDataProcessor"
```

### SpringBeanNameConventionInspection
'PmdDataProcessor' should start with lowercase letter
in `agent/src/META-INF/build-agent-plugin.xml`
#### Snippet
```java
  <bean id="FindBugsDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$FindBugsDataProcessor"/>
  <bean id="PmdDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$PmdDataProcessor"/>
  <bean id="CheckstyleDataProcessor"
```

### SpringBeanNameConventionInspection
'CheckstyleDataProcessor' should start with lowercase letter
in `agent/src/META-INF/build-agent-plugin.xml`
#### Snippet
```java
  <bean id="PmdDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$PmdDataProcessor"/>
  <bean id="CheckstyleDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$CheckstyleDataProcessor"/>
  <bean id="PmdCpdDataProcessor"
```

### SpringBeanNameConventionInspection
'PmdCpdDataProcessor' should start with lowercase letter
in `agent/src/META-INF/build-agent-plugin.xml`
#### Snippet
```java
  <bean id="CheckstyleDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$CheckstyleDataProcessor"/>
  <bean id="PmdCpdDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$PmdCpdDataProcessor"/>
  <bean id="MSTestDataProcessor"
```

### SpringBeanNameConventionInspection
'MSTestDataProcessor' should start with lowercase letter
in `agent/src/META-INF/build-agent-plugin.xml`
#### Snippet
```java
  <bean id="PmdCpdDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$PmdCpdDataProcessor"/>
  <bean id="MSTestDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$MSTestDataProcessor"/>
  <bean id="VSTestDataProcessor"
```

### SpringBeanNameConventionInspection
'VSTestDataProcessor' should start with lowercase letter
in `agent/src/META-INF/build-agent-plugin.xml`
#### Snippet
```java
  <bean id="MSTestDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$MSTestDataProcessor"/>
  <bean id="VSTestDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$VSTestDataProcessor"/>
  <bean id="TRXDataProcessor"
```

### SpringBeanNameConventionInspection
'TRXDataProcessor' should start with lowercase letter
in `agent/src/META-INF/build-agent-plugin.xml`
#### Snippet
```java
  <bean id="VSTestDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$VSTestDataProcessor"/>
  <bean id="TRXDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$TRXDataProcessor"/>
  <bean id="GTestDataProcessor"
```

### SpringBeanNameConventionInspection
'GTestDataProcessor' should start with lowercase letter
in `agent/src/META-INF/build-agent-plugin.xml`
#### Snippet
```java
  <bean id="TRXDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$TRXDataProcessor"/>
  <bean id="GTestDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$GTestDataProcessor"/>
  <bean id="JSLintDataProcessor"
```

### SpringBeanNameConventionInspection
'JSLintDataProcessor' should start with lowercase letter
in `agent/src/META-INF/build-agent-plugin.xml`
#### Snippet
```java
  <bean id="GTestDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$GTestDataProcessor"/>
  <bean id="JSLintDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$JSLintDataProcessor"/>
  <bean id="CTestDataProcessor"
```

### SpringBeanNameConventionInspection
'CTestDataProcessor' should start with lowercase letter
in `agent/src/META-INF/build-agent-plugin.xml`
#### Snippet
```java
  <bean id="JSLintDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$JSLintDataProcessor"/>
  <bean id="CTestDataProcessor"
        class="jetbrains.buildServer.xmlReportPlugin.XmlReportDataProcessor$CTestDataProcessor"/>
</beans>
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `agent/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPlugin.java`
#### Snippet
```java
    executor.shutdown();
    try {
      executor.awaitTermination(5, TimeUnit.SECONDS);
      if (!executor.isTerminated()) {
        LoggingUtils.LOG.warn("Waiting for one of xml-report-plugin executors to complete");
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `agent/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPlugin.java`
#### Snippet
```java
      executor.shutdownNow();

      executor.awaitTermination(30, TimeUnit.SECONDS);
    } catch (InterruptedException e) {
      LoggingUtils.LOG.warn(e.toString());
```

