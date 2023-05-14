# durabletask-java 
 
# Bad smells
I found 37 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| CommentedOutCode | 7 | false |
| EmptyStatementBody | 6 | false |
| AutoCloseableResource | 5 | false |
| DataFlowIssue | 5 | false |
| DuplicatedCode | 3 | false |
| UNUSED_IMPORT | 2 | false |
| AccessStaticViaInstance | 1 | false |
| RedundantMethodOverride | 1 | false |
| UNCHECKED_WARNING | 1 | false |
| UnnecessarySemicolon | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| BusyWait | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| FieldCanBeLocal | 1 | false |
| TrivialIf | 1 | false |
## RuleId[id=AccessStaticViaInstance]
### AccessStaticViaInstance
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

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `isDone()` is identical to its super method
in `client/src/main/java/com/microsoft/durabletask/TaskOrchestrationExecutor.java`
#### Snippet
```java

            @Override
            public boolean isDone() {
                return this.future.isDone();
            }
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked call to 'complete(V)' as a member of raw type 'com.microsoft.durabletask.TaskOrchestrationExecutor.ContextImplTask.CompletableTask'
in `client/src/main/java/com/microsoft/durabletask/TaskOrchestrationExecutor.java`
#### Snippet
```java
            Object result = this.dataConverter.deserialize(rawResult, record.getDataType());
            CompletableTask task = record.getTask();
            task.complete(result);
        }

```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'DurableTaskGrpcWorker' used without 'try'-with-resources statement
in `samples/src/main/java/io/durabletask/samples/FanOutFanInPattern.java`
#### Snippet
```java
    public static void main(String[] args) throws IOException, InterruptedException, TimeoutException {
        // The TaskHubServer listens over gRPC for new orchestration and activity execution requests
        final DurableTaskGrpcWorker worker = createWorker();

        // Start the server to begin processing orchestration and activity requests
```

### AutoCloseableResource
'DurableTaskClient' used without 'try'-with-resources statement
in `samples/src/main/java/io/durabletask/samples/FanOutFanInPattern.java`
#### Snippet
```java

        // Start a new instance of the registered "ActivityChaining" orchestration
        final DurableTaskClient client = new DurableTaskGrpcClientBuilder().build();

        // The input is an arbitrary list of strings.
```

### AutoCloseableResource
'DurableTaskGrpcWorker' used without 'try'-with-resources statement
in `samples/src/main/java/io/durabletask/samples/ChainingPattern.java`
#### Snippet
```java
    public static void main(String[] args) throws IOException, InterruptedException, TimeoutException {
        // The TaskHubServer listens over gRPC for new orchestration and activity execution requests
        final DurableTaskGrpcWorker server = createTaskHubServer();

        // Start the server to begin processing orchestration and activity requests
```

### AutoCloseableResource
'DurableTaskClient' used without 'try'-with-resources statement
in `samples/src/main/java/io/durabletask/samples/ChainingPattern.java`
#### Snippet
```java

        // Start a new instance of the registered "ActivityChaining" orchestration
        final DurableTaskClient client = new DurableTaskGrpcClientBuilder().build();
        String instanceId = client.scheduleNewOrchestrationInstance(
                "ActivityChaining",
```

### AutoCloseableResource
'DurableTaskGrpcWorker' used without 'try'-with-resources statement
in `samples/src/main/java/io/durabletask/samples/WebApplication.java`
#### Snippet
```java
 
    public static void main(String[] args) throws InterruptedException {
        DurableTaskGrpcWorker server = createTaskHubServer();
        server.start();

```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `client/src/main/java/com/microsoft/durabletask/TaskOrchestratorResult.java`
#### Snippet
```java

    public TaskOrchestratorResult(Collection<OrchestratorService.OrchestratorAction> actions, String customStatus) {
        this.actions = Collections.unmodifiableCollection(actions);;
        this.customStatus = customStatus;
    }
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `readOutputAs` may produce `NullPointerException`
in `samples/src/main/java/io/durabletask/samples/FanOutFanInPattern.java`
#### Snippet
```java
                true);
        System.out.printf("Orchestration completed: %s%n", completedInstance);
        System.out.printf("Output: %d%n", completedInstance.readOutputAs(int.class));

        // Shutdown the server and exit
```

### DataFlowIssue
Method invocation `getSerializedOutput` may produce `NullPointerException`
in `azurefunctions/src/main/java/com/microsoft/durabletask/azurefunctions/DurableClientContext.java`
#### Snippet
```java
            return request.createResponseBuilder(HttpStatus.ACCEPTED)
                    .header("Content-Type", "application/json")
                    .body(orchestration.getSerializedOutput())
                    .build();
        } catch (TimeoutException e) {
```

### DataFlowIssue
Method invocation `readOutputAs` may produce `NullPointerException`
in `samples/src/main/java/io/durabletask/samples/ChainingPattern.java`
#### Snippet
```java
                true);
        System.out.printf("Orchestration completed: %s%n", completedInstance);
        System.out.printf("Output: %s%n", completedInstance.readOutputAs(String.class));

        // Shutdown the server and exit
```

### DataFlowIssue
Argument `serializedPayload` might be null
in `client/src/main/java/com/microsoft/durabletask/DurableTaskGrpcClient.java`
#### Snippet
```java
        if (eventPayload != null) {
            String serializedPayload = this.dataConverter.serialize(eventPayload);
            builder.setInput(StringValue.of(serializedPayload));
        }

```

### DataFlowIssue
Argument `serializedInput` might be null
in `client/src/main/java/com/microsoft/durabletask/DurableTaskGrpcClient.java`
#### Snippet
```java
        if (input != null) {
            String serializedInput = this.dataConverter.serialize(input);
            builder.setInput(StringValue.of(serializedInput));
        }

```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import com.microsoft.durabletask.OrchestrationRuntimeStatus;`
in `azurefunctions/src/main/java/com/microsoft/durabletask/azurefunctions/DurableClientContext.java`
#### Snippet
```java
import com.microsoft.durabletask.DurableTaskGrpcClientBuilder;
import com.microsoft.durabletask.OrchestrationMetadata;
import com.microsoft.durabletask.OrchestrationRuntimeStatus;

import java.io.UnsupportedEncodingException;
```

### UNUSED_IMPORT
Unused import `import java.util.Objects;`
in `client/src/main/java/com/microsoft/durabletask/RetryPolicy.java`
#### Snippet
```java
import javax.annotation.Nullable;
import java.time.Duration;
import java.util.Objects;

/**
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `client/src/main/java/com/microsoft/durabletask/TaskOrchestrationExecutor.java`
#### Snippet
```java
            }

            if (!this.isReplaying) {
                // TODO: Log timer fired, including the scheduled fire-time
            }
```

### EmptyStatementBody
`if` statement has empty body
in `client/src/main/java/com/microsoft/durabletask/TaskOrchestrationExecutor.java`
#### Snippet
```java
                    .build());

            if (!this.isReplaying) {
                // TODO: Log timer creation, including the expected fire-time
            }
```

### EmptyStatementBody
`while` statement has empty body
in `client/src/main/java/com/microsoft/durabletask/TaskOrchestrationExecutor.java`
#### Snippet
```java
            // Play through the history events until either we've played through everything
            // or we receive a yield signal
            while (context.processNextEvent()) { /* no method body */ }
            completed = true;
        } catch (OrchestratorBlockedException orchestratorBlockedException) {
```

### EmptyStatementBody
`if` statement has empty body
in `client/src/main/java/com/microsoft/durabletask/TaskOrchestrationExecutor.java`
#### Snippet
```java
            FailureDetails details = new FailureDetails(failedEvent.getFailureDetails());

            if (!this.isReplaying) {
                // TODO: Log task failure, including the number of bytes in the result
            }
```

### EmptyStatementBody
`if` statement has empty body
in `client/src/main/java/com/microsoft/durabletask/TaskOrchestrationExecutor.java`
#### Snippet
```java
            FailureDetails details = new FailureDetails(subOrchestrationInstanceFailedEvent.getFailureDetails());

            if (!this.isReplaying) {
                // TODO: Log task failure, including the number of bytes in the result
            }
```

### EmptyStatementBody
`if` statement has empty body
in `client/src/main/java/com/microsoft/durabletask/TaskOrchestrationExecutor.java`
#### Snippet
```java
            }

            if (!this.isReplaying) {
                // TODO: Log completion, including the number of bytes in the output
            }
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (29 lines)
in `client/src/main/java/com/microsoft/durabletask/DurableTaskClient.java`
#### Snippet
```java
    public abstract PurgeResult purgeInstances(PurgeInstanceCriteria purgeInstanceCriteria) throws TimeoutException;

//    /**
//     * Suspends a running orchestration instance.
//     * @param instanceId the ID of the orchestration instance to suspend
```

### CommentedOutCode
Commented out code (10 lines)
in `samples/src/main/java/io/durabletask/samples/ChainingPattern.java`
#### Snippet
```java
                    ctx.complete(z);

                    // var order = ctx.getInput(OrderInfo.class); // deserialize order info from JSON to an object
                    // var retryPolicy = RetryPolicy.newBuilder()
                    //         .setMaxRetries(100)
```

### CommentedOutCode
Commented out code (8 lines)
in `samples/src/main/java/io/durabletask/samples/ChainingPattern.java`
#### Snippet
```java
    }

    // class OrderInfo {}

    // class ServicesAPIs {
```

### CommentedOutCode
Commented out code (19 lines)
in `client/src/main/java/com/microsoft/durabletask/DurableTaskGrpcClient.java`
#### Snippet
```java
    }

//    @Override
//    public void suspendInstance(String instanceId, @Nullable String reason) {
//        SuspendRequest.Builder suspendRequestBuilder = SuspendRequest.newBuilder();
```

### CommentedOutCode
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

### CommentedOutCode
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

### CommentedOutCode
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `client/src/main/java/com/microsoft/durabletask/DurableTaskGrpcClient.java`
#### Snippet
```java
        GetInstanceRequest request = GetInstanceRequest.newBuilder()
                .setInstanceId(instanceId)
                .setGetInputsAndOutputs(getInputsAndOutputs)
                .build();

        if (timeout == null || timeout.isNegative() || timeout.isZero()) {
            timeout = Duration.ofMinutes(10);
        }

        TaskHubSidecarServiceBlockingStub grpcClient = this.sidecarClient.withDeadlineAfter(
                timeout.toMillis(),
                TimeUnit.MILLISECONDS);

        GetInstanceResponse response;
```

### DuplicatedCode
Duplicated code
in `client/src/main/java/com/microsoft/durabletask/OrchestrationRuntimeStatus.java`
#### Snippet
```java
        switch (status) {
            case ORCHESTRATION_STATUS_RUNNING:
                return RUNNING;
            case ORCHESTRATION_STATUS_COMPLETED:
                return COMPLETED;
            case ORCHESTRATION_STATUS_CONTINUED_AS_NEW:
                return CONTINUED_AS_NEW;
            case ORCHESTRATION_STATUS_FAILED:
                return FAILED;
            case ORCHESTRATION_STATUS_CANCELED:
                return CANCELED;
            case ORCHESTRATION_STATUS_TERMINATED:
                return TERMINATED;
            case ORCHESTRATION_STATUS_PENDING:
                return PENDING;
            case ORCHESTRATION_STATUS_SUSPENDED:
                return SUSPENDED;
            default:
                throw new IllegalArgumentException(String.format("Unknown status value: %s", status));
        }
```

### DuplicatedCode
Duplicated code
in `client/src/main/java/com/microsoft/durabletask/TaskOrchestrationExecutor.java`
#### Snippet
```java
            int taskId = failedEvent.getTaskScheduledId();
            TaskRecord<?> record = this.openTasks.remove(taskId);
            if (record == null) {
                // TODO: Log a warning about a potential duplicate task completion event
                return;
            }

            FailureDetails details = new FailureDetails(failedEvent.getFailureDetails());

            if (!this.isReplaying) {
                // TODO: Log task failure, including the number of bytes in the result
            }

            CompletableTask<?> task = record.getTask();
            TaskFailedException exception = new TaskFailedException(
                record.taskName,
                taskId,
                details);
            task.completeExceptionally(exception);
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
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

## RuleId[id=BusyWait]
### BusyWait
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

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `NewOrderResponse` may be 'static'
in `samples/src/main/java/io/durabletask/samples/OrchestrationController.java`
#### Snippet
```java
    }

    private class NewOrderResponse {
        private final String instanceId;

```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `client/src/main/java/com/microsoft/durabletask/TaskActivityExecutor.java`
#### Snippet
```java
    private final HashMap<String, TaskActivityFactory> activityFactories;
    private final DataConverter dataConverter;
    private final Logger logger;

    public TaskActivityExecutor(
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `client/src/main/java/com/microsoft/durabletask/TaskOrchestrationExecutor.java`
#### Snippet
```java
                if (retryTimeout.compareTo(Duration.ZERO) > 0) {
                    Instant retryExpiration = this.firstAttempt.plus(retryTimeout);
                    if (this.context.getCurrentInstant().compareTo(retryExpiration) >= 0) {
                        // Max retry timeout exceeded
                        return false;
```

