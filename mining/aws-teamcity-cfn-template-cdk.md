# aws-teamcity-cfn-template-cdk 
 
# Bad smells
I found 6 bad smells with 4 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UtilityClassWithoutPrivateConstructor | 4 | true |
| FieldMayBeStatic | 1 | false |
| MissortedModifiers | 1 | false |
## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `startServerWithAgentCommand` may be 'static'
in `src/main/java/jetbrains/teamcity/aws/template/services/ecs/AwsTeamCityTemplateEcs.java`
#### Snippet
```java
    private final ApplicationLoadBalancedFargateService myApplicationLoadBalancedFargateService;

    private final String startServerWithAgentCommand = "unzip /opt/teamcity/webapps/ROOT/update/buildAgent.zip -d /opt/teamcity/buildAgent; mv /opt/teamcity/buildAgent/conf/buildAgent.dist.properties /opt/teamcity/buildAgent/conf/buildAgent.properties; /opt/teamcity/bin/runAll.sh start; while ! tail -f /opt/teamcity/logs/teamcity-server.log ; do sleep 1 ; done";

    public AwsTeamCityTemplateEcs(@NotNull final Construct scope, @NotNull final Vpc vpc, @NotNull final AwsTeamCityTemplateEfs teamcityTemplateEfs) {
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `AwsTeamcityCfnTemplateCdkApp` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/jetbrains/teamcity/aws/template/AwsTeamcityCfnTemplateCdkApp.java`
#### Snippet
```java
import software.amazon.awscdk.StackProps;

public class AwsTeamcityCfnTemplateCdkApp {
    public static void main(final String[] args) {
        App app = new App();
```

### UtilityClassWithoutPrivateConstructor
Class `AwsTeamCityTemplateVpc` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/jetbrains/teamcity/aws/template/services/vpc/AwsTeamCityTemplateVpc.java`
#### Snippet
```java
import java.util.List;

public class AwsTeamCityTemplateVpc {

    // VPC Configuration
```

### UtilityClassWithoutPrivateConstructor
Class `SetupContainerParameters` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/jetbrains/teamcity/aws/template/services/ecs/setup/SetupContainerParameters.java`
#### Snippet
```java
import java.util.Map;

public class SetupContainerParameters {
    public final static String createDatabaseSh =
            "# Define DATADIR env variable in ECS task\n" +
```

### UtilityClassWithoutPrivateConstructor
Class `SetupContainerTask` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/jetbrains/teamcity/aws/template/services/ecs/setup/SetupContainerTask.java`
#### Snippet
```java
import static jetbrains.teamcity.aws.template.services.ecs.setup.SetupContainerParameters.createDatabaseSh;

public class SetupContainerTask {

    public static void addSetupContainer(@NotNull final Construct scope,
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/jetbrains/teamcity/aws/template/services/ecs/setup/SetupContainerParameters.java`
#### Snippet
```java

public class SetupContainerParameters {
    public final static String createDatabaseSh =
            "# Define DATADIR env variable in ECS task\n" +
            "CONFDIR=${DATADIR}/config\n" +
```

