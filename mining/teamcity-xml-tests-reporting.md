# teamcity-xml-tests-reporting 
 
# Bad smells
I found 171 bad smells with 61 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 33 | true |
| ReturnNull | 20 | false |
| SizeReplaceableByIsEmpty | 14 | true |
| DynamicRegexReplaceableByCompiledPattern | 14 | false |
| AssignmentToMethodParameter | 14 | false |
| RedundantSuppression | 13 | false |
| MissortedModifiers | 7 | false |
| UtilityClassWithoutPrivateConstructor | 6 | true |
| Convert2Lambda | 6 | false |
| RedundantFieldInitialization | 6 | false |
| RedundantMethodOverride | 4 | false |
| ManualMinMaxCalculation | 3 | false |
| InnerClassMayBeStatic | 3 | true |
| NonProtectedConstructorInAbstractClass | 3 | true |
| CallToStringConcatCanBeReplacedByOperator | 3 | false |
| ProtectedMemberInFinalClass | 2 | true |
| StringEqualsEmptyString | 2 | false |
| UnnecessaryFullyQualifiedName | 2 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 2 | false |
| Java8MapApi | 2 | false |
| RedundantImplements | 2 | false |
| ZeroLengthArrayInitialization | 2 | false |
| CStyleArrayDeclaration | 1 | false |
| NonSynchronizedMethodOverridesSynchronizedMethod | 1 | false |
| TrivialStringConcatenation | 1 | false |
| NestedAssignment | 1 | false |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| EmptyMethod | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| BusyWait | 1 | false |
## RuleId[id=UnnecessaryModifier]
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
Modifier `private` is redundant for enum constructors
in `agent/src/jetbrains/buildServer/xmlReportPlugin/LogAction.java`
#### Snippet
```java
  private final String myName;

  private LogAction(@NotNull String name) {
    myName = name;
  }
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `TestMessages` has only 'static' members, and lacks a 'private' constructor
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/TestMessages.java`
#### Snippet
```java
import org.jetbrains.annotations.Nullable;

public class TestMessages {
  @NotNull
  public static String getFileContainsUnnamedMessage(@NotNull File file, @NotNull String type) {
```

### UtilityClassWithoutPrivateConstructor
Class `PathUtils` has only 'static' members, and lacks a 'private' constructor
in `agent/src/jetbrains/buildServer/xmlReportPlugin/utils/PathUtils.java`
#### Snippet
```java
 * Time: 15:42
 */
public class PathUtils {
  private static final char SEPARATOR = '/';

```

### UtilityClassWithoutPrivateConstructor
Class `ParserUtils` has only 'static' members, and lacks a 'private' constructor
in `agent/src/jetbrains/buildServer/xmlReportPlugin/utils/ParserUtils.java`
#### Snippet
```java
 * Time: 15:23
 */
public class ParserUtils {

  private static final Pattern HTML_SPACE = Pattern.compile("&nbsp;", Pattern.LITERAL);
```

### UtilityClassWithoutPrivateConstructor
Class `LoggingUtils` has only 'static' members, and lacks a 'private' constructor
in `agent/src/jetbrains/buildServer/xmlReportPlugin/utils/LoggingUtils.java`
#### Snippet
```java
 * Time: 14:46
 */
public class LoggingUtils {
  public static final Logger LOG = Logger.getInstance(XmlReportPlugin.class.getName());

```

### UtilityClassWithoutPrivateConstructor
Class `NameUtil` has only 'static' members, and lacks a 'private' constructor
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/mstest/NameUtil.java`
#### Snippet
```java
 *         Created: 20.01.2009 14:49:47
 */
class NameUtil {
  @Nullable
  public static String getTestName(String clazzFQ, String name) {
```

### UtilityClassWithoutPrivateConstructor
Class `XmlReportPluginUtil` has only 'static' members, and lacks a 'private' constructor
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginUtil.java`
#### Snippet
```java
import static jetbrains.buildServer.xmlReportPlugin.XmlReportPluginConstants.*;

public class XmlReportPluginUtil {
  public static final Map<String, String> SUPPORTED_REPORT_TYPES;
  private static final List<String> INSPECTIONS_TYPES = Arrays.asList("findBugs",
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

## RuleId[id=NonSynchronizedMethodOverridesSynchronizedMethod]
### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `parse()` overrides synchronized method
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/findBugs/DetailsParser.java`
#### Snippet
```java

  @Override
  public void parse(Reader in) throws java.io.IOException {
    myStringBuffer.delete(0, myStringBuffer.length());
    super.parse(in);
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

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`reason.length() > 0` can be replaced with '!reason.isEmpty()'
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/jslint/JSLintXmlReportParser.java`
#### Snippet
```java
  @Nullable
  private static String getMessage(@Nullable String reason, @Nullable String evidence) {
    final boolean hasReason = reason != null && reason.length() > 0;
    final boolean hasEvidence = evidence != null && evidence.length() > 0;
    if (hasReason && hasEvidence) {
```

### SizeReplaceableByIsEmpty
`evidence.length() > 0` can be replaced with '!evidence.isEmpty()'
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/jslint/JSLintXmlReportParser.java`
#### Snippet
```java
  private static String getMessage(@Nullable String reason, @Nullable String evidence) {
    final boolean hasReason = reason != null && reason.length() > 0;
    final boolean hasEvidence = evidence != null && evidence.length() > 0;
    if (hasReason && hasEvidence) {
      return "REASON: " + removeTrailingDot(reason) + ", EVIDENCE: " + evidence;
```

### SizeReplaceableByIsEmpty
`failureMessage.length() > 0` can be replaced with '!failureMessage.isEmpty()'
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/TestMessages.java`
#### Snippet
```java
    }
    if (message != null) {
      if (failureMessage.length() > 0) {
        failureMessage = failureMessage.concat(": ");
      }
```

### SizeReplaceableByIsEmpty
`myTestIdToName.size() == 0` can be replaced with 'myTestIdToName.isEmpty()'
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/mstest/TRXParser.java`
#### Snippet
```java
      myNamesParser.parse(file);

      if (myTestIdToName.size() == 0) {
        myLogger.error("There were no test definitions found. Wrong or broken .trx file?");
      } else {
```

### SizeReplaceableByIsEmpty
`testData.getParams().size() > 0` can be replaced with '!testData.getParams().isEmpty()'
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/testng/TestNGReportParser.java`
#### Snippet
```java
                                          : testData.getClassName() + ".") + testData.getMethodName();
            String methodParams = "";
            if (testData.getParams().size() > 0) {
              methodParams = "(" + StringUtil.join(testData.getParams(), ", ") + ")";
            }
```

### SizeReplaceableByIsEmpty
`msg.length() > 0` can be replaced with '!msg.isEmpty()'
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/testng/TestNGReportParser.java`
#### Snippet
```java

            String msg = testData.getTestMessage();
            if (msg.length() > 0) {
              myTestReporter.testStdOutput(msg);
            }
```

### SizeReplaceableByIsEmpty
`message.length() > 0` can be replaced with '!message.isEmpty()'
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/testng/TestNGReportParser.java`
#### Snippet
```java
            return;
          }
          if (message != null && message.length() > 0) {
            myTestReporter.info(TestMessages.getOutFromSuiteMessage("System out", suiteName, message));
          }
```

### SizeReplaceableByIsEmpty
`sourcepath.length() > 0` can be replaced with '!sourcepath.isEmpty()'
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/findBugs/FindBugsReportParser.java`
#### Snippet
```java
    String file = null;

    if (sourcepath != null && sourcepath.length() > 0) {
      file = myFileFinder.getVeryFullFilePath(sourcepath);
    }
```

### SizeReplaceableByIsEmpty
`clazz.length() > 0` can be replaced with '!clazz.isEmpty()'
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/findBugs/FindBugsReportParser.java`
#### Snippet
```java
    }

    if (file == null && clazz != null && clazz.length() > 0) {
      if (clazz.contains("$")) {
        clazz = clazz.substring(0, clazz.indexOf("$"));
```

### SizeReplaceableByIsEmpty
`message.length() > 0` can be replaced with '!message.isEmpty()'
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/antJUnit/AntJUnitReportParser.java`
#### Snippet
```java
            return;
          }
          if (message != null && message.length() > 0) {
            myTestReporter.info(TestMessages.getOutFromSuiteMessage("System out", suiteName, message));
          }
```

### SizeReplaceableByIsEmpty
`testData.getStdOut().length() > 0` can be replaced with '!testData.getStdOut().isEmpty()'
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/antJUnit/AntJUnitReportParser.java`
#### Snippet
```java
            myTestReporter.openTest(testName);
            if (!testData.isExecuted()) myTestReporter.testIgnored("");
            if (testData.getStdOut() != null && testData.getStdOut().length() > 0) {
              myTestReporter.testStdOutput(testData.getStdOut());
            }
```

### SizeReplaceableByIsEmpty
`testData.getStdErr().length() > 0` can be replaced with '!testData.getStdErr().isEmpty()'
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/antJUnit/AntJUnitReportParser.java`
#### Snippet
```java
              myTestReporter.testStdOutput(testData.getStdOut());
            }
            if (testData.getStdErr() != null && testData.getStdErr().length() > 0) {
              if (myLogInternalSystemError) {
                myTestReporter.info(testData.getStdErr());
```

### SizeReplaceableByIsEmpty
`message.length() > 0` can be replaced with '!message.isEmpty()'
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/antJUnit/AntJUnitReportParser.java`
#### Snippet
```java
            return;
          }
          if (message != null && message.length() > 0) {
            final String msg = TestMessages.getOutFromSuiteMessage("System error", suiteName, message);
            if (myLogInternalSystemError) {
```

### SizeReplaceableByIsEmpty
`val.trim().length() == 0` can be replaced with 'val.trim().isEmpty()'
in `agent/src/jetbrains/buildServer/xmlReportPlugin/inspections/TeamCityInspectionReporter.java`
#### Snippet
```java
  @NotNull
  private String getValueOrUnknown(@Nullable String val) {
    return val == null || val.trim().length() == 0 ? "<unknown>" : val;
  }
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

## RuleId[id=ManualMinMaxCalculation]
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

## RuleId[id=InnerClassMayBeStatic]
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

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final private`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/nUnit/NUnitReportParser.java`
#### Snippet
```java

  @NotNull
  final private Deque<String> mySuites = new ArrayDeque<String>();

  public NUnitReportParser(@NotNull TestReporter testReporter) {
```

### MissortedModifiers
Missorted modifiers `final private`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/ctest/TestData.java`
#### Snippet
```java

  @NotNull
  final private Status myStatus;
  private long myDuration;
  private String myExitCode;
```

### MissortedModifiers
Missorted modifiers `final static`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/testng/TestData.java`
#### Snippet
```java

final class TestData {
  private final static Object EMPTY_PARAM = new Object();
  @NotNull
  private final List<String> myTestMessage = new ArrayList<String>();
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/findBugs/FileFinder.java`
#### Snippet
```java
  }

  private static abstract class Entry {
    @Nullable
    public abstract String getFilePath(@NotNull String fileName);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPlugin.java`
#### Snippet
```java
  }

  private void initBuildProcessingContext(final @NotNull AgentRunningBuild runningBuild) {
    myBuildProcessingContext = new ProcessingContext(new ArrayList<RulesContext>());

```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPlugin.java`
#### Snippet
```java
  }

  private void processAllRules(final @NotNull ProcessingContext processingContext) {
    for (RulesContext rulesContext : processingContext.rulesContexts) {
      final MonitorRulesCommand monitorRules = rulesContext.getMonitorRulesCommand();
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPlugin.java`
#### Snippet
```java
  }

  private boolean isRulesEmpty(final @NotNull ProcessingContext processingContext) {
    return processingContext.rulesContexts.isEmpty();
  }
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `agent/src/jetbrains/buildServer/xmlReportPlugin/tests/SecondDurationParser.java`
#### Snippet
```java

  public long parseTestDuration(@Nullable String duration) {
    if (duration == null || "".equals(duration)) {
      return 0L;
    }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `server/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginBuildFeature.java`
#### Snippet
```java
          String prop;
          prop = properties.get(XmlReportPluginConstants.REPORT_DIRS);
          if (prop == null || ("".equals(prop))) {
            invalids.add(new InvalidProperty(XmlReportPluginConstants.REPORT_DIRS,
              "Monitoring rules must be specified"));
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `agent/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPlugin.java`
#### Snippet
```java

  @SuppressWarnings("ConstantConditions")
  private Rules getRules(@NotNull Map<String, String> parameters) {
    return getRules(getXmlReportPaths(parameters));
  }
```

### RedundantSuppression
Redundant suppression
in `agent/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPlugin.java`
#### Snippet
```java
  @NotNull
  @SuppressWarnings("ConstantConditions")
  private Rules getRules(@Nullable File rulesFile, @NotNull Map<String, String> parameters) {
    final String rulesStr = rulesFile == null ? getXmlReportPaths(parameters) : rulesFile.getAbsolutePath();
    return getRules(rulesStr);
```

### RedundantSuppression
Redundant suppression
in `agent/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPlugin.java`
#### Snippet
```java

  @Nullable Throwable getProblem(@NotNull ParsingResult parsingResult) {
    @SuppressWarnings({"ThrowableResultOfMethodCallIgnored"})
    final Throwable problem = parsingResult.getProblem();
    if (problem == null) return null;
    assert problem instanceof ParsingException;
```

### RedundantSuppression
Redundant suppression
in `agent/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPlugin.java`
#### Snippet
```java
  @SuppressWarnings({"NullableProblems"})
  @NotNull
  private AgentRunningBuild getBuild() {
    if (myBuild == null) {
      throw new IllegalStateException("Build is null");
```

### RedundantSuppression
Redundant suppression
in `agent/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPlugin.java`
#### Snippet
```java
  @SuppressWarnings({"NullableProblems"})
  @NotNull
  private ProcessingContext getBuildProcessingContext() {
    if (myBuildProcessingContext == null) {
      throw new IllegalStateException("Build processing context is null");
```

### RedundantSuppression
Redundant suppression
in `agent/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPlugin.java`
#### Snippet
```java
    @SuppressWarnings("ConstantConditions")
    @NotNull
    public String getType() {
      return getReportType(myParameters);
    }
```

### RedundantSuppression
Redundant suppression
in `agent/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPlugin.java`
#### Snippet
```java
        @NotNull
        @Override
        public String getType() {
          return getReportType(myParameters);
        }
```

### RedundantSuppression
Redundant suppression
in `agent/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPlugin.java`
#### Snippet
```java
        @NotNull
        @Override
        public String getType() {
          return getReportType(myParameters);
        }
```

### RedundantSuppression
Redundant suppression
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/findBugs/FindBugsReportParser.java`
#### Snippet
```java
        clazz = clazz.substring(0, clazz.indexOf("$"));
      }
      //noinspection ConstantConditions
      file = myFileFinder.getVeryFullFilePath(clazz.replace(".", File.separator) + ".class");
    }
```

### RedundantSuppression
Redundant suppression
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/findBugs/FindBugsReportParser.java`
#### Snippet
```java

  @SuppressWarnings({"ConstantConditions"})
  private String formatText(@NotNull String s) {
    if (myDetailsParser == null) return s;
    try {
```

### RedundantSuppression
Redundant suppression
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/findBugs/FindBugsReportXmlParser.java`
#### Snippet
```java
                elementsPatternPath(new Handler() {
                  public XmlReturn processElement(@NotNull final XmlElementInfo reader) {
                    //noinspection ConstantConditions
                    if (reader.getAttribute("classname").equals(clazz[0])) {
                      details.append(" ").append(reader.getLocalName())
```

### RedundantSuppression
Redundant suppression
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/mstest/TRXParser.java`
#### Snippet
```java
  private final String myDefaultSuiteName;

  @SuppressWarnings("FieldMayBeFinal") private int myReportedTestsCount = 0;

  public TRXParser(@NotNull final TestReporter logger, @NotNull final String defaultSuiteName) {
```

### RedundantSuppression
Redundant suppression
in `agent/src/jetbrains/buildServer/xmlReportPlugin/utils/PathUtils.java`
#### Snippet
```java

    if (resolved == null)
      //noinspection ConstantConditions
      return path;

```

## RuleId[id=RedundantMethodOverride]
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
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/mstest/MSTestFactory.java`
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
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/antJUnit/GTestFactory.java`
#### Snippet
```java
  @NotNull
  @Override
  public ParsingStage getParsingStage() {
    return ParsingStage.RUNTIME;
  }
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/ctest/TestData.java`
#### Snippet
```java

  public void setName(@NotNull final String name) {
    myName = name.replaceAll("\\.", "_");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/src/jetbrains/buildServer/xmlReportPlugin/tests/SecondDurationParser.java`
#### Snippet
```java
    String result;
    if (commaIndex > dotIndex) {
      result = str.replace(DOT, "").replace(COMMA, DOT);
    } else if (commaIndex < dotIndex) {
      result = str.replace(COMMA, "");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/src/jetbrains/buildServer/xmlReportPlugin/tests/SecondDurationParser.java`
#### Snippet
```java
    String result;
    if (commaIndex > dotIndex) {
      result = str.replace(DOT, "").replace(COMMA, DOT);
    } else if (commaIndex < dotIndex) {
      result = str.replace(COMMA, "");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/src/jetbrains/buildServer/xmlReportPlugin/tests/SecondDurationParser.java`
#### Snippet
```java
      result = str.replace(DOT, "").replace(COMMA, DOT);
    } else if (commaIndex < dotIndex) {
      result = str.replace(COMMA, "");
    } else {
      result = str;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/src/jetbrains/buildServer/xmlReportPlugin/tests/SecondDurationParser.java`
#### Snippet
```java
      result = str;
    }
    return result.replace(MARK, "").replace(NBSP, "");
  }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/src/jetbrains/buildServer/xmlReportPlugin/tests/SecondDurationParser.java`
#### Snippet
```java
      result = str;
    }
    return result.replace(MARK, "").replace(NBSP, "");
  }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/testng/TestData.java`
#### Snippet
```java

  public void addParam(@Nullable final String index, @Nullable final String value) {
    String trimValue = value == null ? "" : '"' + value.replace("\\", "\\\\").replace("\"", "\\\"") + '"';
    if (!ParserUtils.isNumber(index)) {
      myParamsWithoutIndex.add(trimValue);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/testng/TestData.java`
#### Snippet
```java

  public void addParam(@Nullable final String index, @Nullable final String value) {
    String trimValue = value == null ? "" : '"' + value.replace("\\", "\\\\").replace("\"", "\\\"") + '"';
    if (!ParserUtils.isNumber(index)) {
      myParamsWithoutIndex.add(trimValue);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/findBugs/FindBugsReportParser.java`
#### Snippet
```java
      LOG.warn("Couldn't format html description to text", e);
    }
    return myDetailsParser.getText().replace("&nbsp", "");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/findBugs/FindBugsReportParser.java`
#### Snippet
```java
      }
      //noinspection ConstantConditions
      file = myFileFinder.getVeryFullFilePath(clazz.replace(".", File.separator) + ".class");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/findBugs/FileFinder.java`
#### Snippet
```java
  @NotNull
  private static String getDependentPath(@NotNull String path) {
    return path.replace("\\", File.separator).replace("/", File.separator);
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/findBugs/FileFinder.java`
#### Snippet
```java
  @NotNull
  private static String getDependentPath(@NotNull String path) {
    return path.replace("\\", File.separator).replace("/", File.separator);
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/src/jetbrains/buildServer/xmlReportPlugin/BaseMessageLogger.java`
#### Snippet
```java
  @NotNull
  protected String makeRelativePaths(@NotNull final String message) {
    return message.replace(myBaseFolder.replace("\\", "/") + "/", "").replace(myBaseFolder.replace("/", "\\") + "\\", "");
  }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/src/jetbrains/buildServer/xmlReportPlugin/BaseMessageLogger.java`
#### Snippet
```java
  @NotNull
  protected String makeRelativePaths(@NotNull final String message) {
    return message.replace(myBaseFolder.replace("\\", "/") + "/", "").replace(myBaseFolder.replace("/", "\\") + "\\", "");
  }
}
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/findBugs/DetailsParser.java`
#### Snippet
```java

  @Override
  public void parse(Reader in) throws java.io.IOException {
    myStringBuffer.delete(0, myStringBuffer.length());
    super.parse(in);
```

### UnnecessaryFullyQualifiedName
Qualifier `jetbrains.buildServer.xmlReportPlugin.duplicates` is unnecessary and can be removed
in `agent/src/jetbrains/buildServer/xmlReportPlugin/duplicates/DuplicatingFragment.java`
#### Snippet
```java

  /**
   * Note: hash is set after all fragments withing one {@link jetbrains.buildServer.xmlReportPlugin.duplicates.DuplicationResult} collected
   */
  public int getHash() {
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `agent/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPlugin.java`
#### Snippet
```java
      }
    });
    (processingContext.monitorThread = monitor).start();
  }

```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`path = path + ": Report is incomplete or has unexpected structure"` could be simplified to 'path += ": Report is incomplete or has unexpected structure"'
in `agent/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPlugin.java`
#### Snippet
```java
                                           String path = getPathInCheckoutDir(file);

                                           if (problem == null) path = path + ": Report is incomplete or has unexpected structure";
                                           else if (StringUtil.isNotEmpty(problem.getMessage())) path = path + ": " + problem.getMessage();

```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `ProblemParsingResult()` of an abstract class should not be declared 'public'
in `agent/src/jetbrains/buildServer/xmlReportPlugin/ProblemParsingResult.java`
#### Snippet
```java
  }

  public ProblemParsingResult(@Nullable Throwable problem) {
    myProblem = problem;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `ProblemParsingResult()` of an abstract class should not be declared 'public'
in `agent/src/jetbrains/buildServer/xmlReportPlugin/ProblemParsingResult.java`
#### Snippet
```java
  private Throwable myProblem;

  public ProblemParsingResult() {
    this(null);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `ORHandler()` of an abstract class should not be declared 'public'
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/BaseXmlXppAbstractParser.java`
#### Snippet
```java
    private boolean myMatched = false;

    public ORHandler(XmlHandler... delegates) {
      myDelegates = Arrays.asList(delegates);
    }
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `myParseTask` is accessed in both synchronized and unsynchronized contexts
in `agent/src/jetbrains/buildServer/xmlReportPlugin/RulesContext.java`
#### Snippet
```java
    @NotNull private final ParseReportCommand myCommand;
    @NotNull private final ExecutorService myExecutor;
    @Nullable private Future<?> myParseTask;

    public CommandTask(@NotNull final ExecutorService executor, @NotNull final ParseReportCommand command) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `myQuietMode` is accessed in both synchronized and unsynchronized contexts
in `agent/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPlugin.java`
#### Snippet
```java
  @Nullable
  private ProcessingContext myStepProcessingContext;
  private boolean myQuietMode;

  public XmlReportPlugin(@NotNull ExtensionsProvider extensionsProvider,
```

## RuleId[id=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.getOrDefault' method call
in `agent/src/jetbrains/buildServer/xmlReportPlugin/XmlReportDataProcessor.java`
#### Snippet
```java
                           @NotNull final String sourceKey,
                           @Nullable final String defaultValue) {
    return source.containsKey(sourceKey) ? source.get(sourceKey) : defaultValue;
  }

```

### Java8MapApi
Can be replaced with single 'Map.getOrDefault' method call
in `common/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPluginUtil.java`
#### Snippet
```java
  @Nullable
  public static String whenNoDataPublished(@NotNull final Map<String, String> params) {
    return params.containsKey(WHEN_NO_DATA_PUBLISHED) ? params.get(WHEN_NO_DATA_PUBLISHED) : "error";
  }

```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `agent/src/jetbrains/buildServer/xmlReportPlugin/MonitorRulesCommand.java`
#### Snippet
```java
  public void logWatchingPaths() {
    LoggingUtils.logInTarget(LoggingUtils.getTypeDisplayName(myParameters.getType()) + " report watcher",
      new Runnable() {
        public void run() {
          String message = "Watching paths:";
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `agent/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPlugin.java`
#### Snippet
```java

    processingContext.finished = false;
    monitor = new Thread(new Runnable() {
      public void run() {
        while (!processingContext.finished) {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `agent/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPlugin.java`
#### Snippet
```java
          if (!failedToParse.isEmpty()) {
            LoggingUtils.logInTarget("Parsing errors",
                                     new Runnable() {
                                       public void run() {
                                         LoggingUtils
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `agent/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPlugin.java`
#### Snippet
```java
          if (!succeeded.isEmpty()) {
            LoggingUtils.logInTarget("Successfully parsed",
                                     new Runnable() {
                                       public void run() {
                                         LoggingUtils
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `agent/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPlugin.java`
#### Snippet
```java

          if (!outOfDate.isEmpty()) {
            LoggingUtils.logInTarget("Skipped as out-of-date", new Runnable() {
              @Override
              public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `agent/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPlugin.java`
#### Snippet
```java

    LoggingUtils.logInTarget(LoggingUtils.getTypeDisplayName(rulesContext.getRulesData().getType()) + " report watcher",
      new Runnable() {
        public void run() {
          final int totalFileCount = processedFileCount + outOfDate.size();
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/ctest/TestXmlReportParser.java`
#### Snippet
```java
          public XmlReturn processElement(@NotNull XmlElementInfo reader1) {
            return reader1.visitText(new TextHandler() {
              public void setText(@NotNull String text) {
//                myCallback.testInList(text);
              }
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/mstest/TRXParser.java`
#### Snippet
```java
  private final String myDefaultSuiteName;

  @SuppressWarnings("FieldMayBeFinal") private int myReportedTestsCount = 0;

  public TRXParser(@NotNull final TestReporter logger, @NotNull final String defaultSuiteName) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/findBugs/FindBugsReportXmlParser.java`
#### Snippet
```java

  private static class SourceLine {
    private boolean myPrimary = false;
    private String myFile;
    private int myLine;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `agent/src/jetbrains/buildServer/xmlReportPlugin/utils/ParserUtils.java`
#### Snippet
```java
  private static final class CompleteReportHandler extends DefaultHandler {
    private String myRootTag;
    private int myDepth = 0;
    private boolean myRightStart = false;
    private boolean myRightEnd = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `agent/src/jetbrains/buildServer/xmlReportPlugin/utils/ParserUtils.java`
#### Snippet
```java
    private int myDepth = 0;
    private boolean myRightStart = false;
    private boolean myRightEnd = false;

    private CompleteReportHandler(@Nullable String rootTag) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `agent/src/jetbrains/buildServer/xmlReportPlugin/utils/ParserUtils.java`
#### Snippet
```java
    private String myRootTag;
    private int myDepth = 0;
    private boolean myRightStart = false;
    private boolean myRightEnd = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/BaseXmlXppAbstractParser.java`
#### Snippet
```java
  protected abstract class ORHandler implements CloseableHandler, XmlHandler {
    private final List<XmlHandler> myDelegates;
    private boolean myMatched = false;

    public ORHandler(XmlHandler... delegates) {
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `base`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/utils/PathUtils.java`
#### Snippet
```java
    if (StringUtil.isEmptyOrSpaces(path)) return "<unknown>";

    base = unifySlashes(base);
    path = unifySlashes(path);

```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/utils/PathUtils.java`
#### Snippet
```java

    base = unifySlashes(base);
    path = unifySlashes(path);

    String resolved = FileUtil.getRelativePath(base, path, SEPARATOR);
```

### AssignmentToMethodParameter
Assignment to method parameter `status`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/testng/TestData.java`
#### Snippet
```java
        return SKIP;
      }
      status = status.toUpperCase();
      for (Status val: values()) {
        if (val.name().equals(status)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `error`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/tests/TeamCityTestReporter.java`
#### Snippet
```java

  public void testFail(@Nullable String error, @Nullable final String stacktrace) {
    if (error == null) error = "";
    myLogger.logTestFailed(myTests.peek(), error, stacktrace);
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `message`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/findBugs/FindBugsReportParser.java`
#### Snippet
```java
  @Nullable
  private static String getFullMessage(@Nullable String message, @Nullable String defaultMessage, @Nullable String details) {
    if (StringUtil.isEmpty(message)) message = defaultMessage;
    if (StringUtil.isEmpty(message)) return details;
    if (StringUtil.isEmpty(details)) return message;
```

### AssignmentToMethodParameter
Assignment to method parameter `clazz`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/findBugs/FindBugsReportParser.java`
#### Snippet
```java
    if (file == null && clazz != null && clazz.length() > 0) {
      if (clazz.contains("$")) {
        clazz = clazz.substring(0, clazz.indexOf("$"));
      }
      //noinspection ConstantConditions
```

### AssignmentToMethodParameter
Assignment to method parameter `jar`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/findBugs/FileFinder.java`
#### Snippet
```java

  public void addJar(@NotNull String jar) {
    jar = getDependentPath(jar);
    if (jar.endsWith(".zip") || jar.endsWith(".jar")) {
      try {
```

### AssignmentToMethodParameter
Assignment to method parameter `filePath`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/findBugs/FileFinder.java`
#### Snippet
```java
    if (filePath == null) return null;

    filePath = getDependentPath(filePath);

    if (myLookup == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `s`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/utils/ParserUtils.java`
#### Snippet
```java
  @NotNull
  public static String formatText(@NotNull String s) {
    s = replaceHtmlSpace(s);
    s = removeCarriageReturn(s);
    s = replaceNewLine(s);
```

### AssignmentToMethodParameter
Assignment to method parameter `s`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/utils/ParserUtils.java`
#### Snippet
```java
  public static String formatText(@NotNull String s) {
    s = replaceHtmlSpace(s);
    s = removeCarriageReturn(s);
    s = replaceNewLine(s);
    s = trimSpaces(s);
```

### AssignmentToMethodParameter
Assignment to method parameter `s`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/utils/ParserUtils.java`
#### Snippet
```java
    s = replaceHtmlSpace(s);
    s = removeCarriageReturn(s);
    s = replaceNewLine(s);
    s = trimSpaces(s);
    s = removeHtmlTags(s);
```

### AssignmentToMethodParameter
Assignment to method parameter `s`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/utils/ParserUtils.java`
#### Snippet
```java
    s = removeCarriageReturn(s);
    s = replaceNewLine(s);
    s = trimSpaces(s);
    s = removeHtmlTags(s);
    return s.trim();
```

### AssignmentToMethodParameter
Assignment to method parameter `s`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/utils/ParserUtils.java`
#### Snippet
```java
    s = replaceNewLine(s);
    s = trimSpaces(s);
    s = removeHtmlTags(s);
    return s.trim();
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `rule`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPlugin.java`
#### Snippet
```java
  private String resolveRule(@NotNull String rule, @NotNull File baseDir) {
    if (rule.startsWith("+:") || rule.startsWith("-:")) {
      rule = rule.substring(2);
    }
    return FileUtil.normalizeAbsolutePath(FileUtil.resolvePath(baseDir, rule).getAbsolutePath());
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `ParserFactory`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/mstest/VSTestFactory.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public class VSTestFactory extends TRXFactory implements ParserFactory {
  @NotNull
  @Override
```

### RedundantImplements
Redundant interface declaration `ParserFactory`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/mstest/MSTestFactory.java`
#### Snippet
```java
 * Time: 13:36
 */
public class MSTestFactory extends TRXFactory implements ParserFactory {
  @NotNull
  @Override
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-27-20-09-38.489.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/jslint/JSLintXmlReportParser.java`
#### Snippet
```java
    if (hasEvidence) return evidence;

    return null;
  }

```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/mstest/TestResult.java`
#### Snippet
```java

  public TestName getTestName() {
    return myTestId == null ? null : new TestName(myTestId, myDataRowInfo);
  }

```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/inspections/InspectionParsingResult.java`
#### Snippet
```java
  @Override
  public Throwable getProblem() {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/nUnit/NUnitXmlReportParser.java`
#### Snippet
```java
    @Nullable
    private String getSuiteName(@Nullable String name) {
      if (name == null) return null;
      final String patchedName = name.replace('\\', '/');
      if (patchedName.contains("/")) {
```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/ParserFactory.java`
#### Snippet
```java
    @Nullable
    public static ParsingStage of(@Nullable final String name) {
      if (StringUtil.isEmptyOrSpaces(name)) return null;
      for(ParsingStage stage: values()) {
        if (stage.name().equalsIgnoreCase(name)) {
```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/ParserFactory.java`
#### Snippet
```java
        }
      }
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/OptimizingIncludeExcludeRules.java`
#### Snippet
```java
      @Override
      public File createFrom(@NotNull final String source) {
        return isIncludeRule(source) ? new File(getRulePath(source)) : null;
      }
    });
```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/findBugs/FindBugsReportParser.java`
#### Snippet
```java
      public void addJar(@NotNull final String jar) {}
      @Override
      public String getVeryFullFilePath(@Nullable final String filePath) {return null;}
      @Override
      public void close() {}
```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/findBugs/FileFinder.java`
#### Snippet
```java
  @Contract("null -> null")
  public String getVeryFullFilePath(@Nullable String filePath) {
    if (filePath == null) return null;

    filePath = getDependentPath(filePath);
```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/findBugs/FileFinder.java`
#### Snippet
```java
    @Override
    public String getFilePath(@NotNull String fileName) {
      return myFile.endsWith(fileName) ? myFile : null;
    }
  }
```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/findBugs/FileFinder.java`
#### Snippet
```java
    public String getFilePath(@NotNull String fileName) {
      final File found = myLookup.lookup(myLookup.createFileInfo(fileName));
      return found == null ? null : found.getPath();
    }
  }
```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/BaseXmlXppAbstractParser.java`
#### Snippet
```java
        }
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/mstest/DurationParser.java`
#### Snippet
```java
    try {
      final Date date = sdf.parse(time);
      return date != null ? date.getTime() : null;
    } catch (ParseException e) {
      return null;
```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/mstest/DurationParser.java`
#### Snippet
```java
      return date != null ? date.getTime() : null;
    } catch (ParseException e) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/mstest/TestNamesTableParser.java`
#### Snippet
```java
    if (StringUtil.isNotEmpty(testDescription)) return testDescription;

    return null;
  }

```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/RulesState.java`
#### Snippet
```java
  public synchronized Long getLength(@NotNull final File report) {
    FileState store = myParsingResults.get(report);
    return store != null ? store.length : null;
  }

```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/RulesState.java`
#### Snippet
```java
  public synchronized ParsingResult getParsingResult(@NotNull File report) {
    final FileState state = myParsingResults.get(report);
    return state == null ? null : state.parsingResult;
  }

```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/RulesState.java`
#### Snippet
```java
  public synchronized Long getLastModified(@NotNull final File report) {
    FileState store = myParsingResults.get(report);
    return store != null ? store.lastModified : null;
  }

```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/mstest/NameUtil.java`
#### Snippet
```java
      return (fq > 0 ? clazzFQ.substring(0, fq) : clazzFQ) + "." + name;
    }
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `agent/src/jetbrains/buildServer/xmlReportPlugin/XmlReportPlugin.java`
#### Snippet
```java
    @SuppressWarnings({"ThrowableResultOfMethodCallIgnored"})
    final Throwable problem = parsingResult.getProblem();
    if (problem == null) return null;
    assert problem instanceof ParsingException;
    return problem.getCause();
```

## RuleId[id=CallToStringConcatCanBeReplacedByOperator]
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/TestMessages.java`
#### Snippet
```java
    String failureMessage = "";
    if (type != null) {
      failureMessage = failureMessage.concat(type);
    }
    if (message != null) {
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/TestMessages.java`
#### Snippet
```java
    if (message != null) {
      if (failureMessage.length() > 0) {
        failureMessage = failureMessage.concat(": ");
      }
      failureMessage = failureMessage.concat(message);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `agent/src/jetbrains/buildServer/xmlReportPlugin/parsers/TestMessages.java`
#### Snippet
```java
        failureMessage = failureMessage.concat(": ");
      }
      failureMessage = failureMessage.concat(message);
    }
    return failureMessage;
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `agent/src/jetbrains/buildServer/xmlReportPlugin/OptimizingIncludeExcludeRules.java`
#### Snippet
```java
  @NotNull
  private String[] getRulesArray() {
    return  myBody.toArray(new String[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `agent/src/jetbrains/buildServer/xmlReportPlugin/duplicates/TeamCityDuplicationReporter.java`
#### Snippet
```java
    }

    myDuplicatesReporter.addDuplicate(new DuplicateInfo(duplicate.getHash(), duplicate.getTokens(), fragmentsList.toArray(new DuplicateInfo.Fragment[0])));
  }

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

