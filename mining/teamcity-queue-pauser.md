# teamcity-queue-pauser 
 
# Bad smells
I found 6 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 3 | false |
| RedundantFieldInitialization | 1 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| DoubleBraceInitialization | 1 | false |
## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `server/src/jetbrains/buildServer/queueManager/server/FreeSpaceQueuePauser.java`
#### Snippet
```java
  private final ServerResponsibility myResponsibility;

  private Alarm myWatcher = null;

  public FreeSpaceQueuePauser(@NotNull final EventDispatcher<BuildServerListener> dispatcher,
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `server/src/jetbrains/buildServer/queueManager/server/QueueStateController.java`
#### Snippet
```java
                                  @NotNull final HttpServletResponse response) throws Exception {
    doAction(request, response, null);
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `server/src/jetbrains/buildServer/queueManager/server/QueuePausePrecondition.java`
#### Snippet
```java
    // check that we have already checked this precondition this cycle
    if (input.getCustomData(PROPERTY_CHECKED, Boolean.class) != null) {
      return null;
    }
    // no wait reason, haven't checked within this cycle
```

### ReturnNull
Return of `null`
in `server/src/jetbrains/buildServer/queueManager/server/QueuePausePrecondition.java`
#### Snippet
```java
      input.setCustomData(PROPERTY_CHECKED, Boolean.TRUE);
    }
    return null;
  }
}
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `MessageViewer` has only 'static' members, and lacks a 'private' constructor
in `server/src/jetbrains/buildServer/queueManager/server/MessageViewer.java`
#### Snippet
```java
 * @author Oleg Rybak <oleg.rybak@jetbrains.com>
 */
public class MessageViewer {

  private static final Map<Actor, String> DEFAULT_MESSAGES = new HashMap<Actor, String>() {{
```

## RuleId[id=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `server/src/jetbrains/buildServer/queueManager/server/MessageViewer.java`
#### Snippet
```java
public class MessageViewer {

  private static final Map<Actor, String> DEFAULT_MESSAGES = new HashMap<Actor, String>() {{
    put(Actor.FREE_SPACE_QUEUE_PAUSER, FreeSpaceQueuePauser.DEFAULT_REASON);
  }};
```

