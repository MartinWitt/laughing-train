# teamcity-sakura-ui-plugins 
 
# Bad smells
I found 1 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UNUSED_IMPORT | 1 | false |
## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.web.openapi.PluginDescriptor;`
in `demoPlugin-server/src/main/java/com/demoDomain/teamcity/demoPlugin/controllers/SakuraUIPluginController.java`
#### Snippet
```java

import jetbrains.buildServer.web.openapi.*;
import jetbrains.buildServer.web.openapi.PluginDescriptor;
import org.jetbrains.annotations.NotNull;

```

