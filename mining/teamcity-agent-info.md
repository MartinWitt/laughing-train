# teamcity-agent-info 
 
# Bad smells
I found 4 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 2 | true |
| SpringBeanConstructorArgInspection | 1 | false |
| SpringXmlAutowireExplicitlyInspection | 1 | false |
## RuleId[id=SpringBeanConstructorArgInspection]
### SpringBeanConstructorArgInspection
No matching constructor found in class 'AgentSystemInfo'#treeend

*** ** * ** ***

|--------------------------------------------------|---|-----------|
| **AgentSystemInfo(...):**                        |   | **Bean:** |
| BuildAgentConfiguration config                   |   | **???**   |
| BuildAgent agent                                 |   | **???**   |
| EventDispatcher\<AgentLifeCycleListener\> events |   | **???**   |
in `src/META-INF/build-agent-plugin-agentInfo.xml`
#### Snippet
```java
       default-autowire="constructor">

  <bean class="jetbrains.buildserver.agentInfo.AgentSystemInfo"/>
</beans>
```

## RuleId[id=SpringXmlAutowireExplicitlyInspection]
### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `src/META-INF/build-agent-plugin-agentInfo.xml`
#### Snippet
```java
                           http://www.springframework.org/schema/lang
                           http://www.springframework.org/schema/lang/spring-lang-2.0.xsd"
       default-autowire="constructor">

  <bean class="jetbrains.buildserver.agentInfo.AgentSystemInfo"/>
```

## RuleId[id=UnnecessaryToStringCall]
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

