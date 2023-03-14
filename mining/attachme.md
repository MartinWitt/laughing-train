# attachme 
 
# Bad smells
I found 42 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SystemOutErr | 15 | false |
| ThrowablePrintStackTrace | 7 | false |
| IOResource | 6 | false |
| NonSerializableFieldInSerializableClass | 2 | false |
| ReturnNull | 2 | false |
| UtilityClassWithoutPrivateConstructor | 2 | true |
| TrivialStringConcatenation | 2 | false |
| UnnecessarySuperQualifier | 1 | false |
| BusyWait | 1 | false |
| UNUSED_IMPORT | 1 | false |
| NestedAssignment | 1 | false |
| DialogTitleCapitalization | 1 | false |
| UnusedAssignment | 1 | false |
## RuleId[id=IOResource]
### IOResource
'ObjectOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `agent/src/main/java/com/attachme/agent/AttachmeClient.java`
#### Snippet
```java
    msg.setPid(pid);
    msg.setPorts(ports);
    ObjectOutputStream stream = new ObjectOutputStream(sock.getOutputStream());
    stream.writeObject(msg);
    System.err.println("[attachme] Successfully notified attachme listener");
```

### IOResource
'ObjectInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `agent/src/main/java/com/attachme/agent/AttachmeServer.java`
#### Snippet
```java
            String clientAddress = accept.getRemoteSocketAddress().toString().split("/")[1].split(":")[0];
            InputStream inputStream = accept.getInputStream();
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            ProcessRegisterMsg msg = (ProcessRegisterMsg) objectInputStream.readObject();
            listener.onDebuggeeProcess(msg, clientAddress);
```

### IOResource
'ObjectOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `agent/src/main/java/EchoServer.java`
#### Snippet
```java
  public static void send(String host, int port, String message) {
    try (Socket sock = new Socket(host, port)) {
      ObjectOutputStream outStream = new ObjectOutputStream(sock.getOutputStream());
      outStream.writeObject(message);
      System.out.println("Sent message " + message);
```

### IOResource
'ObjectInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `agent/src/main/java/EchoServer.java`
#### Snippet
```java
      outStream.writeObject(message);
      System.out.println("Sent message " + message);
      ObjectInputStream inputStream = new ObjectInputStream(sock.getInputStream());
      String echo = (String) inputStream.readObject();
      System.out.println("Received message " + echo);
```

### IOResource
'ObjectInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `agent/src/main/java/EchoServer.java`
#### Snippet
```java
        try (Socket client = sock.accept()) {
          InputStream inputStream = client.getInputStream();
          ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
          String msg = (String) objectInputStream.readObject();
          System.out.println("Received message " + msg);
```

### IOResource
'ObjectOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `agent/src/main/java/EchoServer.java`
#### Snippet
```java
          String msg = (String) objectInputStream.readObject();
          System.out.println("Received message " + msg);
          ObjectOutputStream objectOutputStream = new ObjectOutputStream(client.getOutputStream());
          objectOutputStream.writeObject(msg);
        }
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `agent/src/main/java/com/attachme/agent/AttachmeClient.java`
#### Snippet
```java
    ObjectOutputStream stream = new ObjectOutputStream(sock.getOutputStream());
    stream.writeObject(msg);
    System.err.println("[attachme] Successfully notified attachme listener");
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `agent/src/main/java/com/attachme/agent/AttachmeServer.java`
#### Snippet
```java
      @Override
      public void error(String str) {
        System.out.println(str);
      }
    };
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `agent/src/main/java/com/attachme/agent/AttachmeServer.java`
#### Snippet
```java
      @Override
      public void info(String str) {
        System.out.println(str);
      }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `agent/src/main/java/com/attachme/agent/CommandPortResolver.java`
#### Snippet
```java

    if (status != 0) {
      System.err.println("[attachme] The command " + command + " finished with status code " + status);
    }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `agent/src/main/java/com/attachme/agent/CommandPortResolver.java`
#### Snippet
```java

    if (ans.isEmpty()) {
      System.err.println("[attachme] Command " + command + " could not find open ports");
    }
    return ans;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `agent/src/main/java/EchoServer.java`
#### Snippet
```java
      ObjectOutputStream outStream = new ObjectOutputStream(sock.getOutputStream());
      outStream.writeObject(message);
      System.out.println("Sent message " + message);
      ObjectInputStream inputStream = new ObjectInputStream(sock.getInputStream());
      String echo = (String) inputStream.readObject();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `agent/src/main/java/EchoServer.java`
#### Snippet
```java
      ObjectInputStream inputStream = new ObjectInputStream(sock.getInputStream());
      String echo = (String) inputStream.readObject();
      System.out.println("Received message " + echo);
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `agent/src/main/java/EchoServer.java`
#### Snippet
```java
          ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
          String msg = (String) objectInputStream.readObject();
          System.out.println("Received message " + msg);
          ObjectOutputStream objectOutputStream = new ObjectOutputStream(client.getOutputStream());
          objectOutputStream.writeObject(msg);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `agent/src/main/java/com/attachme/agent/Agent.java`
#### Snippet
```java
      args = parseArgs(strArgs);
    } catch (IllegalArgumentException e) {
      System.err.println("[attachme] FATAL ERROR: " + e.getMessage());
      System.exit(1);
      return;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `agent/src/main/java/com/attachme/agent/Agent.java`
#### Snippet
```java
      int pid = getPid();
      if (pid == -1) {
        System.err.println("[attachme] Could not determine the pid of the process");
        System.exit(1);
        return;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `agent/src/main/java/com/attachme/agent/Agent.java`
#### Snippet
```java
      PortResolver portResolver = PortResolver.createPerOS();
      if (portResolver == null) {
        System.err.println("[attachme] Your OS is not supported os.name=" + System.getProperty("os.name"));
        System.exit(1);
        return;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `agent/src/main/java/com/attachme/agent/Agent.java`
#### Snippet
```java
        return;
      }
      System.err.println("[attachme] Initialized agent for process PID=" + pid);

      long start = System.currentTimeMillis();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `agent/src/main/java/com/attachme/agent/Agent.java`
#### Snippet
```java
            client.sendBoundPorts(ports, pid);
          } catch (IOException e) {
            System.err.println("[attachme] IOException: Please turn on attachme listener in IntelliJ IDEA");
            e.printStackTrace();
          } catch (Exception e) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `agent/src/main/java/com/attachme/agent/Agent.java`
#### Snippet
```java
            e.printStackTrace();
          } catch (Exception e) {
            System.err.println("[attachme] Unknown error happened, please report in github");
            e.printStackTrace();
          }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `agent/src/main/java/com/attachme/agent/Agent.java`
#### Snippet
```java
      }
      if (ports.isEmpty()) {
        System.err.println("[attachme] Could not find bound ports, maybe you did not attach a debugger");
      }
    }
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'connection' in a Serializable class
in `plugin/src/main/java/com/attachme/plugin/AttachmeDebugger.java`
#### Snippet
```java

  public static class ProcessAttachRunConfiguration extends RunConfigurationBase<Element> {
    RemoteConnection connection;

    protected ProcessAttachRunConfiguration(@NotNull Project project) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 't' in a Serializable class
in `plugin/src/main/java/com/attachme/plugin/AttachmeRunner.java`
#### Snippet
```java
  static class MProcHandler extends ProcessHandler {

    final Thread t;

    MProcHandler(Thread t) {
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `agent/src/main/java/com/attachme/agent/PortResolver.java`
#### Snippet
```java
      return CommandPortResolver.forUnix();
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `plugin/src/main/java/com/attachme/plugin/AttachmeDebugger.java`
#### Snippet
```java
    @Override
    public Icon getIcon() {
      return null;
    }

```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `EchoServer` has only 'static' members, and lacks a 'private' constructor
in `agent/src/main/java/EchoServer.java`
#### Snippet
```java
import java.util.Objects;

class EchoServer {

  public static void receive(int port) {
```

### UtilityClassWithoutPrivateConstructor
Class `Agent` has only 'static' members, and lacks a 'private' constructor
in `agent/src/main/java/com/attachme/agent/Agent.java`
#### Snippet
```java
import java.util.*;

public class Agent {

  static final String DEFAULT_PORT = "7857";
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/main/java/com/attachme/plugin/AttachmeRunner.java`
#### Snippet
```java

    public void shutdown() {
      super.notifyProcessTerminated(0);
    }
  }
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
in `plugin/src/main/java/com/attachme/plugin/AttachmeRunner.java`
#### Snippet
```java
      return;
    }
    RemoteConnection config = new RemoteConnection(true, debuggeeAddress, msg.getPorts().get(0) + "", false);
    AttachmeDebugger.attach(project, config, msg.getPid());
  }
```

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

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `agent/src/main/java/com/attachme/agent/AttachmeServer.java`
#### Snippet
```java
            this.log.info("Registered a debuggee process with pid " + msg.getPid() + " and possible ports " + msg.getPorts().toString());
          } catch (RuntimeException e) {
            e.printStackTrace();
            this.log.error(exceptionToString(e));
          }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `agent/src/main/java/EchoServer.java`
#### Snippet
```java
      System.out.println("Received message " + echo);
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
      throw new IllegalStateException(e);
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `agent/src/main/java/EchoServer.java`
#### Snippet
```java
      }
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
      throw new IllegalStateException(e);
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `agent/src/main/java/com/attachme/agent/Agent.java`
#### Snippet
```java
    Thread task = new Thread(new DebugPortTask(args), "AttachmeAgentTread");
    task.setDaemon(true);
    task.setUncaughtExceptionHandler((t, e) -> e.printStackTrace());
    task.start();
  }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `agent/src/main/java/com/attachme/agent/Agent.java`
#### Snippet
```java
            Thread.sleep(100);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        } else {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `agent/src/main/java/com/attachme/agent/Agent.java`
#### Snippet
```java
          } catch (IOException e) {
            System.err.println("[attachme] IOException: Please turn on attachme listener in IntelliJ IDEA");
            e.printStackTrace();
          } catch (Exception e) {
            System.err.println("[attachme] Unknown error happened, please report in github");
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `agent/src/main/java/com/attachme/agent/Agent.java`
#### Snippet
```java
          } catch (Exception e) {
            System.err.println("[attachme] Unknown error happened, please report in github");
            e.printStackTrace();
          }
        }
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `agent/src/main/java/com/attachme/agent/CommandPortResolver.java`
#### Snippet
```java
      String line;
      Function<String, Optional<Integer>> parser = portCommandHandler.outputParser(pid);
      while ((line = script.readLine()) != null) {
        parser.apply(line).ifPresent(ans::add);
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

