# teamcity-aws-sns-trigger-plugin 
 
# Bad smells
I found 7 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| DataFlowIssue | 1 | false |
| BoundedWildcard | 1 | false |
| MissortedModifiers | 1 | false |
| NonProtectedConstructorInAbstractClass | 1 | true |
| AssignmentToStaticFieldFromInstanceMethod | 1 | false |
## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `AwsSnsMessageDetailsHelper` has only 'static' members, and lacks a 'private' constructor
in `amazon-sns-trigger-server/src/main/java/jetbrains/buildServer/clouds/amazon/sns/trigger/utils/AwsSnsMessageDetailsHelper.java`
#### Snippet
```java
import java.util.Map;

public class AwsSnsMessageDetailsHelper {

  public static boolean isSubscription(@NotNull Map<String, Object> payload) {
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `amazon-sns-trigger-server/src/main/java/jetbrains/buildServer/clouds/amazon/sns/trigger/utils/parameters/AwsSnsTriggerConstants.java`
#### Snippet
```java
    @NotNull
    public static String getTriggerUrlPathPart() {
        return AwsSnsTriggerConstants.SNS_CONNECTION_CONTROLLER_URL.replace("/**", "");
    }
}
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `is` might be null
in `amazon-sns-trigger-server/src/main/java/jetbrains/buildServer/clouds/amazon/sns/trigger/service/SnsMessageParameterDescriptionProvider.java`
#### Snippet
```java
        InputStream is = getClass().getResourceAsStream(PARAM_DESCRIPTIONS_RES);
        try {
            Element parsed = FileUtil.parseDocument(is, false);
            List children = parsed.getChildren("description");

```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends SnsNotificationDto`
in `amazon-sns-trigger-server/src/main/java/jetbrains/buildServer/clouds/amazon/sns/trigger/service/SnsBuildTriggeringPolicy.java`
#### Snippet
```java
  }

  private SnsNotificationDto getLatest(Map<String, SnsNotificationDto> registeredMessages) {
    return registeredMessages.values().stream().max(Comparator.comparing(SnsNotificationDto::getTimestamp))
            .orElseThrow(() -> new IllegalStateException("Comparator returned null for list of messages. This should never happen"));
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `amazon-sns-trigger-server/src/main/java/jetbrains/buildServer/clouds/amazon/sns/trigger/service/SnsMessageParameterDescriptionProvider.java`
#### Snippet
```java

public class SnsMessageParameterDescriptionProvider extends AbstractParameterDescriptionProvider {
    private final static String PARAM_DESCRIPTIONS_RES = "/param-descriptions.xml";

    private final Map<Pattern, String> myDescriptions = new HashMap<>();
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `BaseAwsConnectionController()` of an abstract class should not be declared 'public'
in `amazon-sns-trigger-server/src/main/java/jetbrains/buildServer/clouds/amazon/sns/trigger/controllers/BaseAwsConnectionController.java`
#### Snippet
```java
  private final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

  public BaseAwsConnectionController(@NotNull final SBuildServer server) {
    super(server);
  }
```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `LOG` from instance context
in `amazon-sns-trigger-server/src/main/java/jetbrains/buildServer/clouds/amazon/sns/trigger/utils/AwsSnsSignatureVerification.java`
#### Snippet
```java
    @TestOnly
    public void setLogger(Logger newLogger) {
        LOG = newLogger;
    }

```

