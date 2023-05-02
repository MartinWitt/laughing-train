# aws-teamcity-cfn-template-cdk 
 
# Bad smells
I found 1 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldCanBeLocal | 1 | false |
## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/jetbrains/teamcity/aws/template/services/ecs/AwsTeamCityTemplateEcs.java`
#### Snippet
```java
    private final ApplicationLoadBalancedFargateService myApplicationLoadBalancedFargateService;

    private final String startServerWithAgentCommand = "unzip /opt/teamcity/webapps/ROOT/update/buildAgent.zip -d /opt/teamcity/buildAgent; mv /opt/teamcity/buildAgent/conf/buildAgent.dist.properties /opt/teamcity/buildAgent/conf/buildAgent.properties; /opt/teamcity/bin/runAll.sh start; while ! tail -f /opt/teamcity/logs/teamcity-server.log ; do sleep 1 ; done";

    public AwsTeamCityTemplateEcs(@NotNull final Construct scope, @NotNull final Vpc vpc, @NotNull final AwsTeamCityTemplateEfs teamcityTemplateEfs) {
```

