# servicemix-bundles 
 
# Bad smells
I found 1 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| KotlinMavenPluginPhase | 1 | false |
## RuleId[id=KotlinMavenPluginPhase]
### KotlinMavenPluginPhase
You have kotlin-stdlib configured but no corresponding plugin execution
in `azure-core-http-okhttp-1.11.4/pom.xml`
#### Snippet
```java
	<dependency>
	    <groupId>org.jetbrains.kotlin</groupId>
 	    <artifactId>kotlin-stdlib</artifactId>
	    <version>1.6.10</version>
	</dependency>
```

