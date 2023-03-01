# teamcity-agent-info 
 
# Bad smells
I found 5 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 2 | false |
| UnnecessaryToStringCall | 2 | true |
| Convert2Lambda | 1 | false |
## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `src/jetbrains/buildserver/agentInfo/AgentSystemInfo.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/jetbrains/buildserver/agentInfo/AgentSystemInfo.java`
#### Snippet
```java
    }
    LOG.warn("Failed to get CPU count.");
    return null;
  }

```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildserver/agentInfo/AgentSystemInfo.java`
#### Snippet
```java
      }
    } catch (Throwable e) {
      LOG.info("Class 'com.sun.management.OperatingSystemMXBean' not found or another error, using alternative way to get total memory. Error encountered: " + e.toString());
      try {
        MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/jetbrains/buildserver/agentInfo/AgentSystemInfo.java`
#### Snippet
```java
        }
      } catch (Throwable e1) {
        LOG.warn("Failed to get total memory size: " + e1.toString());
      }
    }
```

## RuleId[ruleID=Convert2Lambda]
### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `src/jetbrains/buildserver/agentInfo/AgentSystemInfo.java`
#### Snippet
```java
    final ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor(new NamedDeamonThreadFactory("agent-info recent updates pool"));

    final Runnable action = ExceptionUtil.catchAll("update free space", new Runnable() {
      public void run() {
        if (agent.isRunning()) return;
```

