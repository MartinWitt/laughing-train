# durabletask-java 
 
# Bad smells
I found 60 bad smells with 10 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=SizeReplaceableByIsEmpty] | 8 | true |
| RuleId[ruleID=BoundedWildcard] | 8 | false |
| RuleId[ruleID=SystemOutErr] | 7 | false |
| RuleId[ruleID=ReturnNull] | 6 | false |
| RuleId[ruleID=DataFlowIssue] | 5 | false |
| RuleId[ruleID=CommentedOutCode] | 5 | false |
| RuleId[ruleID=UtilityClassWithoutPrivateConstructor] | 3 | false |
| RuleId[ruleID=AssignmentToMethodParameter] | 3 | false |
| RuleId[ruleID=MissortedModifiers] | 3 | false |
| RuleId[ruleID=NonStaticFinalLogger] | 2 | false |
| RuleId[ruleID=AccessStaticViaInstance] | 1 | false |
| RuleId[ruleID=RedundantMethodOverride] | 1 | false |
| RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern] | 1 | false |
| RuleId[ruleID=UnnecessarySemicolon] | 1 | false |
| RuleId[ruleID=UNUSED_IMPORT] | 1 | false |
| RuleId[ruleID=CodeBlock2Expr] | 1 | false |
| RuleId[ruleID=NonSerializableFieldInSerializableClass] | 1 | false |
| RuleId[ruleID=UnnecessaryToStringCall] | 1 | true |
| RuleId[ruleID=BusyWait] | 1 | false |
| RuleId[ruleID=InnerClassMayBeStatic] | 1 | true |
## RuleId[ruleID=AccessStaticViaInstance]
### RuleId[ruleID=AccessStaticViaInstance]
Static member 'com.microsoft.durabletask.DurableTaskGrpcClient.logger' accessed via instance reference
in `client/src/main/java/com/microsoft/durabletask/DurableTaskGrpcClient.java`
#### Snippet
```java
        Helpers.throwIfArgumentNull(instanceId, "instanceId");
        String serializeOutput = this.dataConverter.serialize(output);
        this.logger.fine(() -> String.format(
                "Terminating instance %s and setting output to: %s",
                instanceId,
```

## RuleId[ruleID=SystemOutErr]
### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `samples/src/main/java/io/durabletask/samples/ChainingPattern.java`
#### Snippet
```java
                "ActivityChaining",
                new NewOrchestrationInstanceOptions().setInput("Hello, world!"));
        System.out.printf("Started new orchestration instance: %s%n", instanceId);

        // Block until the orchestration completes. Then print the final status, which includes the output.
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `samples/src/main/java/io/durabletask/samples/ChainingPattern.java`
#### Snippet
```java
                Duration.ofSeconds(30),
                true);
        System.out.printf("Orchestration completed: %s%n", completedInstance);
        System.out.printf("Output: %s%n", completedInstance.readOutputAs(String.class));

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `samples/src/main/java/io/durabletask/samples/ChainingPattern.java`
#### Snippet
```java
                true);
        System.out.printf("Orchestration completed: %s%n", completedInstance);
        System.out.printf("Output: %s%n", completedInstance.readOutputAs(String.class));

        // Shutdown the server and exit
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `samples/src/main/java/io/durabletask/samples/FanOutFanInPattern.java`
#### Snippet
```java
                "FanOutFanIn_WordCount",
                new NewOrchestrationInstanceOptions().setInput(listOfStrings));
        System.out.printf("Started new orchestration instance: %s%n", instanceId);

        // Block until the orchestration completes. Then print the final status, which includes the output.
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `samples/src/main/java/io/durabletask/samples/FanOutFanInPattern.java`
#### Snippet
```java
                Duration.ofSeconds(30),
                true);
        System.out.printf("Orchestration completed: %s%n", completedInstance);
        System.out.printf("Output: %d%n", completedInstance.readOutputAs(int.class));

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `samples/src/main/java/io/durabletask/samples/FanOutFanInPattern.java`
#### Snippet
```java
                true);
        System.out.printf("Orchestration completed: %s%n", completedInstance);
        System.out.printf("Output: %d%n", completedInstance.readOutputAs(int.class));

        // Shutdown the server and exit
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `samples/src/main/java/io/durabletask/samples/WebApplication.java`
#### Snippet
```java
        server.start();

        System.out.println("Starting up Spring web API...");
        SpringApplication.run(WebApplication.class, args);
    }
```

## RuleId[ruleID=RedundantMethodOverride]
### RuleId[ruleID=RedundantMethodOverride]
Method `isDone()` is identical to its super method
in `client/src/main/java/com/microsoft/durabletask/TaskOrchestrationExecutor.java`
#### Snippet
```java

            @Override
            public boolean isDone() {
                return this.future.isDone();
            }
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ChainingPattern` has only 'static' members, and lacks a 'private' constructor
in `samples/src/main/java/io/durabletask/samples/ChainingPattern.java`
#### Snippet
```java
import java.util.concurrent.TimeoutException;

final class ChainingPattern {
    public static void main(String[] args) throws IOException, InterruptedException, TimeoutException {
        // The TaskHubServer listens over gRPC for new orchestration and activity execution requests
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `FanOutFanInPattern` has only 'static' members, and lacks a 'private' constructor
in `samples/src/main/java/io/durabletask/samples/FanOutFanInPattern.java`
#### Snippet
```java
import java.util.stream.Collectors;

class FanOutFanInPattern {

    public static void main(String[] args) throws IOException, InterruptedException, TimeoutException {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `WebApplication` has only 'static' members, and lacks a 'private' constructor
in `samples/src/main/java/io/durabletask/samples/WebApplication.java`
#### Snippet
```java
 
@SpringBootApplication
public class WebApplication {
 
    public static void main(String[] args) throws InterruptedException {
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `samples/src/main/java/io/durabletask/samples/ChainingPattern.java`
#### Snippet
```java
                return ctx -> {
                    String input = ctx.getInput(String.class);
                    return input.trim().replaceAll("\\s", "-");
                };
            }
```

## RuleId[ruleID=UnnecessarySemicolon]
### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `client/src/main/java/com/microsoft/durabletask/TaskOrchestratorResult.java`
#### Snippet
```java

    public TaskOrchestratorResult(Collection<OrchestratorService.OrchestratorAction> actions, String customStatus) {
        this.actions = Collections.unmodifiableCollection(actions);;
        this.customStatus = customStatus;
    }
```

## RuleId[ruleID=DataFlowIssue]
### RuleId[ruleID=DataFlowIssue]
Method invocation `readOutputAs` may produce `NullPointerException`
in `samples/src/main/java/io/durabletask/samples/ChainingPattern.java`
#### Snippet
```java
                true);
        System.out.printf("Orchestration completed: %s%n", completedInstance);
        System.out.printf("Output: %s%n", completedInstance.readOutputAs(String.class));

        // Shutdown the server and exit
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `readOutputAs` may produce `NullPointerException`
in `samples/src/main/java/io/durabletask/samples/FanOutFanInPattern.java`
#### Snippet
```java
                true);
        System.out.printf("Orchestration completed: %s%n", completedInstance);
        System.out.printf("Output: %d%n", completedInstance.readOutputAs(int.class));

        // Shutdown the server and exit
```

### RuleId[ruleID=DataFlowIssue]
Argument `serializeOutput` might be null
in `client/src/main/java/com/microsoft/durabletask/DurableTaskGrpcClient.java`
#### Snippet
```java
                instanceId,
                serializeOutput != null ? serializeOutput : "(null)"));
        TerminateRequest.Builder builder = TerminateRequest.newBuilder().setInstanceId(instanceId).setOutput(StringValue.of(serializeOutput));
        this.sidecarClient.terminateInstance(builder.build());
    }
```

### RuleId[ruleID=DataFlowIssue]
Argument `serializedPayload` might be null
in `client/src/main/java/com/microsoft/durabletask/DurableTaskGrpcClient.java`
#### Snippet
```java
        if (eventPayload != null) {
            String serializedPayload = this.dataConverter.serialize(eventPayload);
            builder.setInput(StringValue.of(serializedPayload));
        }

```

### RuleId[ruleID=DataFlowIssue]
Argument `serializedInput` might be null
in `client/src/main/java/com/microsoft/durabletask/DurableTaskGrpcClient.java`
#### Snippet
```java
        if (input != null) {
            String serializedInput = this.dataConverter.serialize(input);
            builder.setInput(StringValue.of(serializedInput));
        }

```

## RuleId[ruleID=UNUSED_IMPORT]
### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.util.Objects;`
in `client/src/main/java/com/microsoft/durabletask/RetryPolicy.java`
#### Snippet
```java
import javax.annotation.Nullable;
import java.time.Duration;
import java.util.Objects;

/**
```

## RuleId[ruleID=CodeBlock2Expr]
### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `client/src/main/java/com/microsoft/durabletask/DurableTaskGrpcClient.java`
#### Snippet
```java
    private OrchestrationStatusQueryResult toQueryResult(QueryInstancesResponse queryInstancesResponse, boolean fetchInputsAndOutputs){
        List<OrchestrationMetadata> metadataList = new ArrayList<>();
        queryInstancesResponse.getOrchestrationStateList().forEach(state -> {
            metadataList.add(new OrchestrationMetadata(state, this.dataConverter, fetchInputsAndOutputs));
        });
```

## RuleId[ruleID=CommentedOutCode]
### RuleId[ruleID=CommentedOutCode]
Commented out code (8 lines)
in `samples/src/main/java/io/durabletask/samples/ChainingPattern.java`
#### Snippet
```java
    }

    // class OrderInfo {}

    // class ServicesAPIs {
```

### RuleId[ruleID=CommentedOutCode]
Commented out code (10 lines)
in `samples/src/main/java/io/durabletask/samples/ChainingPattern.java`
#### Snippet
```java
                    ctx.complete(z);

                    // var order = ctx.getInput(OrderInfo.class); // deserialize order info from JSON to an object
                    // var retryPolicy = RetryPolicy.newBuilder()
                    //         .setMaxRetries(100)
```

### RuleId[ruleID=CommentedOutCode]
Commented out code (4 lines)
in `client/src/main/java/com/microsoft/durabletask/TaskOrchestrationExecutor.java`
#### Snippet
```java
                    orchestrator.run(this);
                    break;
//                case EXECUTIONCOMPLETED:
//                    break;
//                case EXECUTIONFAILED:
```

### RuleId[ruleID=CommentedOutCode]
Commented out code (2 lines)
in `client/src/main/java/com/microsoft/durabletask/TaskOrchestrationExecutor.java`
#### Snippet
```java
                    this.handleSubOrchestrationFailed(e);
                    break;
//                case EVENTSENT:
//                    break;
                case EVENTRAISED:
```

### RuleId[ruleID=CommentedOutCode]
Commented out code (6 lines)
in `client/src/main/java/com/microsoft/durabletask/TaskOrchestrationExecutor.java`
#### Snippet
```java
                    this.handleEventRaised(e);
                    break;
//                case GENERICEVENT:
//                    break;
//                case HISTORYSTATE:
```

## RuleId[ruleID=AssignmentToMethodParameter]
### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `timeout`
in `client/src/main/java/com/microsoft/durabletask/DurableTaskGrpcClient.java`
#### Snippet
```java

        if (timeout == null || timeout.isNegative() || timeout.isZero()) {
            timeout = Duration.ofMinutes(10);
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `timeout`
in `client/src/main/java/com/microsoft/durabletask/DurableTaskGrpcClient.java`
#### Snippet
```java

        if (timeout == null || timeout.isNegative() || timeout.isZero()) {
            timeout = Duration.ofMinutes(10);
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `instanceId`
in `client/src/main/java/com/microsoft/durabletask/TaskOrchestrationExecutor.java`
#### Snippet
```java

            if (instanceId == null) {
                instanceId = UUID.randomUUID().toString();
            }
            createSubOrchestrationActionBuilder.setInstanceId(instanceId);
```

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'details' in a Serializable class
in `client/src/main/java/com/microsoft/durabletask/TaskFailedException.java`
#### Snippet
```java
 */
public class TaskFailedException extends RuntimeException {
    private final FailureDetails details;
    private final String taskName;
    private final int taskId;
```

## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
Return of `null`
in `client/src/main/java/com/microsoft/durabletask/DataConverter.java`
#### Snippet
```java
    static Instant getInstantFromTimestamp(Timestamp ts) {
        if (ts == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `client/src/main/java/com/microsoft/durabletask/DataConverter.java`
#### Snippet
```java
    static Timestamp getTimestampFromInstant(Instant instant) {
        if (instant == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `client/src/main/java/com/microsoft/durabletask/TaskActivityExecutor.java`
#### Snippet
```java
        public <T> T getInput(Class<T> targetType) {
            if (this.rawInput == null) {
                return null;
            }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `client/src/main/java/com/microsoft/durabletask/TaskActivityExecutor.java`
#### Snippet
```java
        }

        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `client/src/main/java/com/microsoft/durabletask/TaskOrchestrationExecutor.java`
#### Snippet
```java
        public <T> T getInput(Class<T> targetType) {
            if (this.rawInput == null || this.rawInput.length() == 0) {
                return null;
            }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `client/src/main/java/com/microsoft/durabletask/OrchestrationMetadata.java`
#### Snippet
```java
        // Note that the Java gRPC implementation converts null protobuf strings into empty Java strings
        if (payload == null || payload.isEmpty()) {
            return null;
        }

```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### RuleId[ruleID=SizeReplaceableByIsEmpty]
`argValue.trim().length() == 0` can be replaced with 'argValue.trim().isEmpty()'
in `client/src/main/java/com/microsoft/durabletask/Helpers.java`
#### Snippet
```java
    static @Nonnull String throwIfArgumentNullOrWhiteSpace(String argValue, String argName) {
        throwIfArgumentNull(argValue, argName);
        if (argValue.trim().length() == 0){
            throw new IllegalArgumentException("The argument '" + argName + "' was empty or contained only whitespace.");
        }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`this.rpcBaseUrl.length() == 0` can be replaced with 'this.rpcBaseUrl.isEmpty()'
in `azurefunctions/src/main/java/com/microsoft/durabletask/azurefunctions/DurableClientContext.java`
#### Snippet
```java
     */
    public DurableTaskClient getClient() {
        if (this.rpcBaseUrl == null || this.rpcBaseUrl.length() == 0) {
            throw new IllegalStateException("The client context wasn't populated with an RPC base URL!");
        }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`orchestratorName.length() == 0` can be replaced with 'orchestratorName.isEmpty()'
in `client/src/main/java/com/microsoft/durabletask/DurableTaskGrpcClient.java`
#### Snippet
```java
            String orchestratorName,
            NewOrchestrationInstanceOptions options) {
        if (orchestratorName == null || orchestratorName.length() == 0) {
            throw new IllegalArgumentException("A non-empty orchestrator name must be specified.");
        }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`key.length() == 0` can be replaced with 'key.isEmpty()'
in `client/src/main/java/com/microsoft/durabletask/DurableTaskGrpcWorkerBuilder.java`
#### Snippet
```java
    public DurableTaskGrpcWorkerBuilder addOrchestration(TaskOrchestrationFactory factory) {
        String key = factory.getName();
        if (key == null || key.length() == 0) {
            throw new IllegalArgumentException("A non-empty task orchestration name is required.");
        }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`key.length() == 0` can be replaced with 'key.isEmpty()'
in `client/src/main/java/com/microsoft/durabletask/DurableTaskGrpcWorkerBuilder.java`
#### Snippet
```java
        // TODO: Input validation
        String key = factory.getName();
        if (key == null || key.length() == 0) {
            throw new IllegalArgumentException("A non-empty task activity name is required.");
        }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`jsonText.length() == 0` can be replaced with 'jsonText.isEmpty()'
in `client/src/main/java/com/microsoft/durabletask/JacksonDataConverter.java`
#### Snippet
```java
    @Override
    public <T> T deserialize(String jsonText, Class<T> targetType) {
        if (jsonText == null || jsonText.length() == 0 || targetType == Void.class) {
            return null;
        }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`this.rawInput.length() == 0` can be replaced with 'this.rawInput.isEmpty()'
in `client/src/main/java/com/microsoft/durabletask/TaskOrchestrationExecutor.java`
#### Snippet
```java
        @Override
        public <T> T getInput(Class<T> targetType) {
            if (this.rawInput == null || this.rawInput.length() == 0) {
                return null;
            }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`this.outstandingEvents.size() > 0` can be replaced with '!this.outstandingEvents.isEmpty()'
in `client/src/main/java/com/microsoft/durabletask/TaskOrchestrationExecutor.java`
#### Snippet
```java
        
        private boolean waitingForEvents() {
            return this.outstandingEvents.size() > 0;
        }

```

## RuleId[ruleID=NonStaticFinalLogger]
### RuleId[ruleID=NonStaticFinalLogger]
Non-constant logger field `logger`
in `client/src/main/java/com/microsoft/durabletask/TaskActivityExecutor.java`
#### Snippet
```java
    private final HashMap<String, TaskActivityFactory> activityFactories;
    private final DataConverter dataConverter;
    private final Logger logger;

    public TaskActivityExecutor(
```

### RuleId[ruleID=NonStaticFinalLogger]
Non-constant logger field `logger`
in `client/src/main/java/com/microsoft/durabletask/TaskOrchestrationExecutor.java`
#### Snippet
```java
    private final HashMap<String, TaskOrchestrationFactory> orchestrationFactories;
    private final DataConverter dataConverter;
    private final Logger logger;

    public TaskOrchestrationExecutor(
```

## RuleId[ruleID=UnnecessaryToStringCall]
### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `client/src/main/java/com/microsoft/durabletask/TaskOrchestrationExecutor.java`
#### Snippet
```java
            // The orchestrator threw an unhandled exception - fail it
            // TODO: What's the right way to log this?
            logger.warning("The orchestrator failed with an unhandled exception: " + e.toString());
            context.fail(new FailureDetails(e));
        }
```

## RuleId[ruleID=BusyWait]
### RuleId[ruleID=BusyWait]
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `client/src/main/java/com/microsoft/durabletask/DurableTaskGrpcWorker.java`
#### Snippet
```java
                // Retry after 5 seconds
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    break;
```

## RuleId[ruleID=InnerClassMayBeStatic]
### RuleId[ruleID=InnerClassMayBeStatic]
Inner class `NewOrderResponse` may be 'static'
in `samples/src/main/java/io/durabletask/samples/OrchestrationController.java`
#### Snippet
```java
    }

    private class NewOrderResponse {
        private final String instanceId;

```

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Exception`
in `client/src/main/java/com/microsoft/durabletask/CompositeTaskFailedException.java`
#### Snippet
```java
    }

    CompositeTaskFailedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, List<Exception> exceptions) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.exceptions = exceptions;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Exception`
in `client/src/main/java/com/microsoft/durabletask/CompositeTaskFailedException.java`
#### Snippet
```java
    }

    CompositeTaskFailedException(String message, Throwable cause, List<Exception> exceptions) {
        super(message, cause);
        this.exceptions = exceptions;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Exception`
in `client/src/main/java/com/microsoft/durabletask/CompositeTaskFailedException.java`
#### Snippet
```java
    }

    CompositeTaskFailedException(List<Exception> exceptions) {
        this.exceptions = exceptions;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Exception`
in `client/src/main/java/com/microsoft/durabletask/CompositeTaskFailedException.java`
#### Snippet
```java
    }

    CompositeTaskFailedException(String message, List<Exception> exceptions) {
        super(message);
        this.exceptions = exceptions;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Exception`
in `client/src/main/java/com/microsoft/durabletask/CompositeTaskFailedException.java`
#### Snippet
```java
    }

    CompositeTaskFailedException(Throwable cause, List<Exception> exceptions) {
        super(cause);
        this.exceptions = exceptions;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TaskActivityFactory`
in `client/src/main/java/com/microsoft/durabletask/TaskActivityExecutor.java`
#### Snippet
```java

    public TaskActivityExecutor(
            HashMap<String, TaskActivityFactory> activityFactories,
            DataConverter dataConverter,
            Logger logger) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Task`
in `client/src/main/java/com/microsoft/durabletask/TaskOrchestrationExecutor.java`
#### Snippet
```java

        @Override
        public Task<Task<?>> anyOf(List<Task<?>> tasks) {
            Helpers.throwIfArgumentNull(tasks, "tasks");

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Task`
in `client/src/main/java/com/microsoft/durabletask/TaskOrchestrationExecutor.java`
#### Snippet
```java

        @Override
        public <V> Task<List<V>> allOf(List<Task<V>> tasks) {
            Helpers.throwIfArgumentNull(tasks, "tasks");

```

## RuleId[ruleID=MissortedModifiers]
### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `client/src/main/java/com/microsoft/durabletask/Helpers.java`
#### Snippet
```java

final class Helpers {
    final static Duration maxDuration = Duration.ofSeconds(Long.MAX_VALUE, 999999999L);

    static @Nonnull <V> V throwIfArgumentNull(@Nullable V argValue, String argName) {
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `static @Nonnull`
in `client/src/main/java/com/microsoft/durabletask/Helpers.java`
#### Snippet
```java
    }

    static @Nonnull String throwIfArgumentNullOrWhiteSpace(String argValue, String argName) {
        throwIfArgumentNull(argValue, argName);
        if (argValue.trim().length() == 0){
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `static @Nonnull`
in `client/src/main/java/com/microsoft/durabletask/Helpers.java`
#### Snippet
```java
    final static Duration maxDuration = Duration.ofSeconds(Long.MAX_VALUE, 999999999L);

    static @Nonnull <V> V throwIfArgumentNull(@Nullable V argValue, String argName) {
        if (argValue == null) {
            throw new IllegalArgumentException("The argument '" + argName + "' was null.");
```

