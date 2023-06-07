# attachme 
 
# Bad smells
I found 7 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| TrivialStringConcatenation | 2 | false |
| Deprecation | 1 | false |
| UNUSED_IMPORT | 1 | false |
| BusyWait | 1 | false |
| DialogTitleCapitalization | 1 | false |
| UnusedAssignment | 1 | false |
## RuleId[id=Deprecation]
### Deprecation
'getPlugin(com.intellij.openapi.extensions.@org.jetbrains.annotations.Nullable PluginId)' is deprecated
in `plugin/src/main/java/com/attachme/plugin/AttachmeInstaller.java`
#### Snippet
```java

  private String packedJarName() {
    String version = Objects.requireNonNull(PluginManager.getPlugin(PluginId.getId("com.attachme")),
                                            "Plugin version cannot be null").getVersion();
    return String.format("attachme-agent-%s.jar", version);
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.net.InetSocketAddress;`
in `agent/src/main/java/com/attachme/agent/AttachmeServer.java`
#### Snippet
```java
import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetSocketAddress;

public class AttachmeServer implements Runnable {
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `agent/src/main/java/com/attachme/agent/Agent.java`
#### Snippet
```java
        if (ports.isEmpty()) {
          try {
            Thread.sleep(100);
          } catch (InterruptedException e) {
            e.printStackTrace();
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `plugin/src/main/java/com/attachme/plugin/AttachmeSettingsEditor.java`
#### Snippet
```java
  @Override
  protected void resetEditorFrom(@NotNull AttachmeRunConfig s) {
    portField.setText(s.getPort() + "");
  }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `plugin/src/main/java/com/attachme/plugin/AttachmeRunner.java`
#### Snippet
```java
      return;
    }
    RemoteConnection config = new RemoteConnection(true, debuggeeAddress, msg.getPorts().get(0) + "", false);
    AttachmeDebugger.attach(project, config, msg.getPid());
  }
```

## RuleId[id=DialogTitleCapitalization]
### DialogTitleCapitalization
String 'Attachme debugger registry' is not properly capitalized. It should have title capitalization
in `plugin/src/main/java/com/attachme/plugin/AttachmeRunConfType.java`
#### Snippet
```java
  @Override
  public String getDisplayName() {
    return "Attachme debugger registry";
  }

```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `status` initializer `0` is redundant
in `agent/src/main/java/com/attachme/agent/CommandPortResolver.java`
#### Snippet
```java
  @Override
  public List<Integer> getPortCandidates(int pid) {
    int status = 0;
    List<Integer> ans = new ArrayList<>();
    String command = portCommandHandler.createCommand(pid);
```

