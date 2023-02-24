# teamcity-fxcop 
 
# Bad smells
I found 26 bad smells with 7 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ObsoleteCollection | 6 | false |
| DynamicRegexReplaceableByCompiledPattern | 5 | false |
| SizeReplaceableByIsEmpty | 3 | true |
| UtilityClassWithoutPrivateConstructor | 2 | true |
| BoundedWildcard | 2 | false |
| EmptyMethod | 1 | false |
| RedundantFieldInitialization | 1 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| CharsetObjectCanBeUsed | 1 | false |
| RegExpSimplifiable | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| ConstantValue | 1 | false |
## RuleId[ruleID=EmptyMethod]
### EmptyMethod
The method is empty
in `fxcop-agent/src/jetbrains/buildServer/fxcop/agent/FxCopFileProcessor.java`
#### Snippet
```java
  }

  private void handleLocalizedTag() {
    // Do nothing
  }
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `fxcop-agent/src/jetbrains/buildServer/fxcop/agent/FxCopFileProcessor.java`
#### Snippet
```java
  private final String mySourceFilePrefixLower;
  private final InspectionReporter myReporter;
  private HierarchicalStreamReader myStream = null;

  private int myErrorsCount, myWarningsCount;
```

## RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[split.size()\]'
in `fxcop-agent/src/jetbrains/buildServer/fxcop/agent/FxCopBuildService.java`
#### Snippet
```java
      final String filesStringWithSpaces = string.replace('\n', ' ').replace('\r', ' ').replace('\\', '/');
      final List<String> split = StringUtil.splitCommandArgumentsAndUnquote(filesStringWithSpaces);
      return split.toArray(new String[split.size()]);
    }

```

## RuleId[ruleID=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `fxcop-agent/src/jetbrains/buildServer/fxcop/agent/FxCopFileProcessor.java`
#### Snippet
```java
  private void handleFile() throws IOException {
    Reader reader = new BufferedReader(
      new InputStreamReader(new FileInputStream(myFxCopReport), "UTF8"));

    try {
```

## RuleId[ruleID=RegExpSimplifiable]
### RegExpSimplifiable
`[\\d]` can be simplified to '\\d'
in `fxcop-agent/src/jetbrains/buildServer/fxcop/agent/FxCopVisualStudioSearch.java`
#### Snippet
```java
  static final String FXCOP_RELATIVE_PATH = "../../Team Tools/Static Analysis Tools/FxCop/";
  private static final String FXCOP_EXE_RELATIVE_PATH = FXCOP_RELATIVE_PATH + FxCopConstants.FXCOPCMD_BINARY;
  private static final Pattern VISUAL_STUDIO_PATTERN = Pattern.compile("VS[\\d]+_Path");

  @NotNull
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`reportPath.length() > 0` can be replaced with '!reportPath.isEmpty()'
in `fxcop-agent/src/jetbrains/buildServer/fxcop/agent/FxCopFileProcessor.java`
#### Snippet
```java
        }

        if (reportPath.length() > 0) {
          inspectionFile += " :: " + reportPath + "|" + file;
        } else {
```

### SizeReplaceableByIsEmpty
`files.size() == 0` can be replaced with 'files.isEmpty()'
in `fxcop-agent/src/jetbrains/buildServer/fxcop/agent/FxCopBuildService.java`
#### Snippet
```java

    final List<String> result = new ArrayList<String>(files.size());
    if (files.size() == 0) {
      getLogger().logMessage(DefaultMessagesInfo.createTextMessage("  none"));
    } else {
```

### SizeReplaceableByIsEmpty
`files.size() == 0` can be replaced with 'files.isEmpty()'
in `fxcop-agent/src/jetbrains/buildServer/fxcop/agent/FxCopBuildService.java`
#### Snippet
```java
      files = matchFiles();

      if (files.size() == 0) {
        throw new RunBuildException("No files matched the pattern");
      }
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `ArtifactsUtil` has only 'static' members, and lacks a 'private' constructor
in `fxcop-common/src/jetbrains/buildServer/fxcop/common/ArtifactsUtil.java`
#### Snippet
```java
 * Time: 15:32
 */
public class ArtifactsUtil {
  public static String getInternalArtifactPath(final String relativePath){
    return String.format("%s/%s/%s", ".teamcity", FxCopConstants.RUNNER_TYPE, relativePath);
```

### UtilityClassWithoutPrivateConstructor
Class `FxCopRequirementsUtil` has only 'static' members, and lacks a 'private' constructor
in `fxcop-server/src/jetbrains/buildServer/fxcop/server/FxCopRequirementsUtil.java`
#### Snippet
```java
 * Time: 16:37
 */
public class FxCopRequirementsUtil {
  @NotNull
  public static List<Requirement> getFxCopRequirements(final Map<String, String> runParameters) {
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `fxcop-agent/src/jetbrains/buildServer/fxcop/agent/FxCopFileProcessor.java`
#### Snippet
```java
      case MEMBER:
      case ACCESSOR:
        return myCurrentTarget + "/" + myCurrentNamespace.replace(".", "/") + "/" + myCurrentType;
      default:
        return "_unknown_/_unknown_";
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `fxcop-agent/src/jetbrains/buildServer/fxcop/agent/FxCopFileProcessor.java`
#### Snippet
```java
        }

        reportPath = reportPath.replace('/', '|').replace("\\", "|");
        if (reportPath.startsWith("|")) {
          reportPath = reportPath.substring(1);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `fxcop-agent/src/jetbrains/buildServer/fxcop/agent/FxCopFileProcessor.java`
#### Snippet
```java

  private String reformatInOneLine(@NotNull final String source) {
    return source.replace("\r", "").replace("\n", " ").replaceAll("\\s+", " ").trim();
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `fxcop-agent/src/jetbrains/buildServer/fxcop/agent/FxCopFileProcessor.java`
#### Snippet
```java

  private String reformatInOneLine(@NotNull final String source) {
    return source.replace("\r", "").replace("\n", " ").replaceAll("\\s+", " ").trim();
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `fxcop-agent/src/jetbrains/buildServer/fxcop/agent/FxCopFileProcessor.java`
#### Snippet
```java

  private String reformatInOneLine(@NotNull final String source) {
    return source.replace("\r", "").replace("\n", " ").replaceAll("\\s+", " ").trim();
  }

```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `fxcop-agent/src/jetbrains/buildServer/fxcop/agent/FxCopBuildService.java`
#### Snippet
```java
    }

    return new String[0];
  }
}
```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `fxcop-agent/src/jetbrains/buildServer/fxcop/agent/FxCopFileProcessor.java`
#### Snippet
```java
      } catch (IllegalAccessException e) {
        Loggers.AGENT.debug(getMessage(nodeName), e);
        myLogger.error(getMessage(nodeName) + ":" + e.toString());
      } catch (RuntimeException e) {
        // Java 9
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super String`
in `fxcop-server/src/jetbrains/buildServer/fxcop/server/FxCopRunTypePropertiesProcessor.java`
#### Snippet
```java
  }

  private void resetProperty(@NotNull Map<String, String> properties, @NotNull String key) {
    if (myDefaultParameters.containsKey(key)) {
      properties.put(key, myDefaultParameters.get(key));
```

### BoundedWildcard
Can generalize to `? super String`
in `fxcop-server/src/jetbrains/buildServer/fxcop/server/FxCopRunTypePropertiesProcessor.java`
#### Snippet
```java
  }

  private void resetProperty(@NotNull Map<String, String> properties, @NotNull String key) {
    if (myDefaultParameters.containsKey(key)) {
      properties.put(key, myDefaultParameters.get(key));
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `fxcopBinary == null` is always `false`
in `fxcop-agent/src/jetbrains/buildServer/fxcop/agent/FxCopRegistrySearch.java`
#### Snippet
```java

    final String fxcopBinary = extractFxCopBinary(fxcopStartCmd);
    if (fxcopBinary == null) {
      LOG.warn("Can't extract fxcop binary from: " + fxcopStartCmd);
      return Collections.emptyList();
```

## RuleId[ruleID=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Vector` used
in `fxcop-server/src/jetbrains/buildServer/fxcop/server/FxCopRunTypePropertiesProcessor.java`
#### Snippet
```java

  public Collection<InvalidProperty> process(Map<String, String> properties) {
    List<InvalidProperty> result = new Vector<InvalidProperty>();

    final String files = properties.get(FxCopConstants.SETTINGS_FILES);
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `fxcop-agent/src/jetbrains/buildServer/fxcop/agent/FxCopFileProcessor.java`
#### Snippet
```java
  }

  private final Stack<String> myMessageInspectionId = new Stack<String>();
  private final Stack<EntityType> myCurrentEntity = new Stack<EntityType>();
  private String myCurrentTarget;
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `fxcop-agent/src/jetbrains/buildServer/fxcop/agent/FxCopFileProcessor.java`
#### Snippet
```java
  }

  private final Stack<String> myMessageInspectionId = new Stack<String>();
  private final Stack<EntityType> myCurrentEntity = new Stack<EntityType>();
  private String myCurrentTarget;
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `fxcop-agent/src/jetbrains/buildServer/fxcop/agent/FxCopFileProcessor.java`
#### Snippet
```java

  private final Stack<String> myMessageInspectionId = new Stack<String>();
  private final Stack<EntityType> myCurrentEntity = new Stack<EntityType>();
  private String myCurrentTarget;
  private String myCurrentResource;
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `fxcop-agent/src/jetbrains/buildServer/fxcop/agent/FxCopFileProcessor.java`
#### Snippet
```java

  private final Stack<String> myMessageInspectionId = new Stack<String>();
  private final Stack<EntityType> myCurrentEntity = new Stack<EntityType>();
  private String myCurrentTarget;
  private String myCurrentResource;
```

### ObsoleteCollection
Obsolete collection type `Vector` used
in `fxcop-agent/src/jetbrains/buildServer/fxcop/agent/FxCopCommandLineBuilder.java`
#### Snippet
```java
  @NotNull
  private List<String> getArguments(List<String> files, boolean escapeAdditionalProp) throws RunBuildException {
    List<String> arguments = new Vector<String>();

    arguments.add("/forceoutput");
```

