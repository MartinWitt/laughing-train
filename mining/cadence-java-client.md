# cadence-java-client 
 
# Bad smells
I found 429 bad smells with 22 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldMayBeFinal | 77 | false |
| OptionalUsedAsFieldOrParameterType | 58 | false |
| JavadocDeclaration | 30 | false |
| ConstantValue | 26 | false |
| JavadocReference | 26 | false |
| SwitchStatementWithTooFewBranches | 15 | false |
| StringConcatenationInsideStringBufferAppend | 14 | false |
| UNCHECKED_WARNING | 13 | false |
| DuplicatedCode | 13 | false |
| DataFlowIssue | 12 | false |
| OptionalGetWithoutIsPresent | 10 | false |
| UnnecessaryLocalVariable | 10 | true |
| UnstableApiUsage | 8 | false |
| PlaceholderCountMatchesArgumentCount | 7 | false |
| DuplicateBranchesInSwitch | 6 | false |
| OptionalIsPresent | 6 | false |
| CatchMayIgnoreException | 6 | false |
| AutoCloseableResource | 6 | false |
| NullableProblems | 5 | false |
| FieldCanBeLocal | 5 | false |
| IgnoreResultOfCall | 5 | false |
| UnusedAssignment | 5 | false |
| UnnecessarySemicolon | 5 | false |
| ProtectedMemberInFinalClass | 5 | true |
| BusyWait | 5 | false |
| ConditionCoveredByFurtherCondition | 4 | false |
| CaughtExceptionImmediatelyRethrown | 4 | false |
| CommentedOutCode | 3 | false |
| CloneableImplementsClone | 3 | false |
| StringBufferReplaceableByString | 3 | false |
| EqualsBetweenInconvertibleTypes | 3 | false |
| UNUSED_IMPORT | 3 | false |
| UnnecessaryToStringCall | 3 | true |
| OptionalAssignedToNull | 2 | false |
| InnerClassMayBeStatic | 2 | true |
| TrivialIf | 2 | false |
| RedundantCast | 2 | false |
| WrapperTypeMayBePrimitive | 1 | false |
| UnnecessaryModifier | 1 | true |
| NonFinalFieldInEnum | 1 | false |
| FinalPrivateMethod | 1 | false |
| UnnecessaryReturn | 1 | true |
| RedundantTypeArguments | 1 | false |
| SuspiciousInvocationHandlerImplementation | 1 | false |
| JavadocLinkAsPlainText | 1 | false |
| FunctionalExpressionCanBeFolded | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| TypeParameterExtendsObject | 1 | false |
| MismatchedJavadocCode | 1 | false |
| ThreadRun | 1 | false |
| SuspiciousMethodCalls | 1 | false |
| ForwardCompatibility | 1 | false |
| ArraysAsListWithZeroOrOneArgument | 1 | false |
## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/com/uber/cadence/internal/testservice/SelfAdvancingTimerImpl.java`
#### Snippet
```java

    private void unlockFromHandleLocked() {
      Boolean removed = lockEvents.remove(event);
      if (!removed) {
        throw new IllegalStateException("Unbalanced lock and unlock calls");
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/uber/cadence/workflow/WorkflowInterceptor.java`
#### Snippet
```java
public interface WorkflowInterceptor {

  public final class WorkflowExecuteInput {
    private final WorkflowExecutionStartedEventAttributes workflowEventStart;
    private final WorkflowType workflowType;
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (41 lines)
in `src/main/java/com/uber/cadence/internal/replay/ExecuteActivityParameters.java`
#### Snippet
```java
  public ExecuteActivityParameters() {}

  //    /**
  //     * Returns the value of the Control property for this object.
  //     * <p>
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/com/uber/cadence/internal/sync/SyncDecisionContext.java`
#### Snippet
```java
  public void registerQuery(
      String queryType, Type[] argTypes, Functions.Func1<Object[], Object> callback) {
    //    if (queryCallbacks.containsKey(queryType)) {
    //      throw new IllegalStateException("Query \"" + queryType + "\" is already registered");
    //    }
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/com/uber/cadence/internal/replay/DecisionContext.java`
#### Snippet
```java
  void setContinueAsNewOnCompletion(ContinueAsNewWorkflowExecutionParameters continueParameters);

  //    com.uber.cadence.ChildPolicy getChildPolicy();

  //    String getContinuedExecutionRunId();
```

## RuleId[id=CloneableImplementsClone]
### CloneableImplementsClone
`ExecuteActivityParameters` is 'Cloneable' but does not define 'clone()' method
in `src/main/java/com/uber/cadence/internal/replay/ExecuteActivityParameters.java`
#### Snippet
```java
import java.util.Map;

public class ExecuteActivityParameters implements Cloneable {

  private String activityId;
```

### CloneableImplementsClone
`SignalExternalWorkflowParameters` is 'Cloneable' but does not define 'clone()' method
in `src/main/java/com/uber/cadence/internal/replay/SignalExternalWorkflowParameters.java`
#### Snippet
```java
import java.nio.charset.StandardCharsets;

public final class SignalExternalWorkflowParameters implements Cloneable {

  private String domain;
```

### CloneableImplementsClone
`QueryWorkflowParameters` is 'Cloneable' but does not define 'clone()' method
in `src/main/java/com/uber/cadence/internal/replay/QueryWorkflowParameters.java`
#### Snippet
```java
import java.nio.charset.StandardCharsets;

public class QueryWorkflowParameters implements Cloneable {

  private byte[] input;
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/com/uber/cadence/internal/replay/ReplayDecider.java`
#### Snippet
```java
      case DecisionTaskScheduled:
        // NOOP
        break;
      case DecisionTaskStarted:
        throw new IllegalArgumentException("not expected");
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/com/uber/cadence/internal/replay/ReplayDecider.java`
#### Snippet
```java
      case WorkflowExecutionTerminated:
        // NOOP
        break;
      case WorkflowExecutionTimedOut:
        // NOOP
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/com/uber/cadence/internal/replay/ReplayDecider.java`
#### Snippet
```java
      case WorkflowExecutionTimedOut:
        // NOOP
        break;
      case ActivityTaskScheduled:
        decisionsHelper.handleActivityTaskScheduled(event);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/com/uber/cadence/internal/replay/ReplayDecider.java`
#### Snippet
```java
        break;
      case WorkflowExecutionFailed:
        break;
      case WorkflowExecutionCanceled:
        break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/com/uber/cadence/internal/replay/ReplayDecider.java`
#### Snippet
```java
        break;
      case WorkflowExecutionCanceled:
        break;
      case WorkflowExecutionContinuedAsNew:
        break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/com/uber/cadence/internal/replay/ReplayDecider.java`
#### Snippet
```java
        break;
      case WorkflowExecutionContinuedAsNew:
        break;
      case TimerStarted:
        decisionsHelper.handleTimerStarted(event);
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `status` in enum 'WorkflowStatus'
in `src/main/java/com/uber/cadence/worker/WorkflowStatus.java`
#### Snippet
```java
  TIMED_OUT(WorkflowExecutionCloseStatus.TIMED_OUT.name());

  private String status;

  WorkflowStatus(String status) {
```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/com/uber/cadence/internal/replay/ReplayDecider.java`
#### Snippet
```java
    private Duration decisionTaskStartToCloseTimeout;

    private final Duration decisionTaskRemainingTime() {
      Duration passed = Duration.ofMillis(System.currentTimeMillis()).minus(paginationStart);
      return decisionTaskStartToCloseTimeout.minus(passed);
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/com/uber/cadence/internal/replay/ContinueAsNewWorkflowExecutionParameters.java`
#### Snippet
```java
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    sb.append("Input: " + new String(input, 0, 512, StandardCharsets.UTF_8) + ", ");
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/com/uber/cadence/internal/replay/SignalExternalWorkflowParameters.java`
#### Snippet
```java
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    sb.append("SignalName: " + signalName + ", ");
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/com/uber/cadence/internal/replay/QueryWorkflowParameters.java`
#### Snippet
```java
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    sb.append("QueryName: " + queryType + ", ");
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `src/main/java/com/uber/cadence/internal/replay/DecisionsHelper.java`
#### Snippet
```java
      return;
    }
    return;
  }

```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/com/uber/cadence/reporter/CadenceClientStatsReporter.java`
#### Snippet
```java
    tmpMap.put(MetricsTag.WORKFLOW_TYPE, Strings.nullToEmpty(tags.get(MetricsTag.WORKFLOW_TYPE)));

    final ImmutableList.Builder<Tag> builder = ImmutableList.<Tag>builder();
    for (Map.Entry<String, String> entry : tmpMap.entrySet()) {
      final Tag tag = Tag.of(entry.getKey(), entry.getValue());
```

## RuleId[id=SuspiciousInvocationHandlerImplementation]
### SuspiciousInvocationHandlerImplementation
Null might be returned when proxying method 'equals()': this may cause NullPointerException
in `src/main/java/com/uber/cadence/internal/sync/ExternalWorkflowInvocationHandler.java`
#### Snippet
```java
    if (signalMethod != null) {
      signalWorkflow(method, signalMethod, args);
      return null;
    }
    throw new IllegalArgumentException(
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `src/main/java/com/uber/cadence/internal/replay/DeciderCache.java`
#### Snippet
```java
                new CacheLoader<String, Decider>() {
                  @Override
                  public Decider load(String key) {
                    return null;
                  }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `src/main/java/com/uber/cadence/internal/replay/DeciderCache.java`
#### Snippet
```java
                new CacheLoader<String, Decider>() {
                  @Override
                  public Decider load(String key) {
                    return null;
                  }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/com/uber/cadence/internal/sync/DeterministicRunnerImpl.java`
#### Snippet
```java
        new ThreadFactory() {
          @Override
          public Thread newThread(Runnable r) {
            return new Thread(r, "deterministic runner thread");
          }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/com/uber/cadence/internal/worker/ExecutorThreadFactory.java`
#### Snippet
```java

  @Override
  public Thread newThread(Runnable r) {
    Thread result = new Thread(r);
    result.setName(threadPrefix + ": " + threadIndex.incrementAndGet());
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `src/main/java/com/uber/cadence/internal/compatibility/Thrift2ProtoAdapter.java`
#### Snippet
```java

          @Override
          public void onFailure(Throwable t) {
            completable.completeExceptionally(t);
          }
```

## RuleId[id=EqualsBetweenInconvertibleTypes]
### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class' and 'Class'
in `src/main/java/com/uber/cadence/internal/common/WorkflowExecutionUtils.java`
#### Snippet
```java
      return String.valueOf(object);
    }
    if (clz.equals(TaskList.class)) {
      return String.valueOf(((TaskList) object).getName());
    }
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class' and 'Class'
in `src/main/java/com/uber/cadence/internal/common/WorkflowExecutionUtils.java`
#### Snippet
```java
      return String.valueOf(((TaskList) object).getName());
    }
    if (clz.equals(ActivityType.class)) {
      return String.valueOf(((ActivityType) object).getName());
    }
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class' and 'Class'
in `src/main/java/com/uber/cadence/internal/common/WorkflowExecutionUtils.java`
#### Snippet
```java
      return String.valueOf(((ActivityType) object).getName());
    }
    if (clz.equals(WorkflowType.class)) {
      return String.valueOf(((WorkflowType) object).getName());
    }
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/uber/cadence/converter/JsonDataConverter.java`
#### Snippet
```java
   * then parse it back into StackTraceElement array.
   *
   * <p>Implementation idea is based on https://github.com/google/gson/issues/43
   */
  private static class ThrowableTypeAdapterFactory implements TypeAdapterFactory {
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/uber/cadence/internal/sync/WorkflowThreadImpl.java`
#### Snippet
```java
    private final WorkflowThreadContext threadContext;
    private final DecisionContext decisionContext;
    private String originalName;
    private String name;
    private CancellationScopeImpl cancellationScope;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/uber/cadence/internal/sync/TestActivityEnvironmentInternal.java`
#### Snippet
```java

    @SuppressWarnings("UnusedVariable")
    private final IWorkflowService workflowService;

    TestActivityExecutor(IWorkflowService workflowService, WorkflowInterceptorBase next) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
  private final Map<String, PollForDecisionTaskResponse> queryRequests = new ConcurrentHashMap<>();
  private final Map<String, WorkflowQuery> pendingQueries = new ConcurrentHashMap<>();
  private final Optional<String> continuedExecutionRunId;
  public StickyExecutionAttributes stickyExecutionAttributes;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/uber/cadence/internal/sync/SyncWorkflowWorker.java`
#### Snippet
```java
  private final DataConverter dataConverter;
  private final POJOActivityTaskHandler laTaskHandler;
  private final ScheduledExecutorService heartbeatExecutor = Executors.newScheduledThreadPool(4);
  private final ScheduledExecutorService ldaHeartbeatExecutor = Executors.newScheduledThreadPool(4);
  private SuspendableWorker ldaWorker;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/uber/cadence/workflow/WorkflowInterceptor.java`
#### Snippet
```java

  public final class WorkflowExecuteInput {
    private final WorkflowExecutionStartedEventAttributes workflowEventStart;
    private final WorkflowType workflowType;
    private final byte[] input;
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `ThreadPoolExecutor.awaitTermination()` is ignored
in `src/main/java/com/uber/cadence/internal/worker/Poller.java`
#### Snippet
```java
    pollExecutor.shutdownNow();
    try {
      pollExecutor.awaitTermination(1, TimeUnit.SECONDS);
    } catch (InterruptedException e) {
    }
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `src/main/java/com/uber/cadence/internal/common/InternalUtils.java`
#### Snippet
```java
        () -> {
          try {
            s.awaitTermination(timeoutMillis, TimeUnit.MILLISECONDS);
          } catch (InterruptedException e) {
          }
```

### IgnoreResultOfCall
Result of `BlockingQueue.offer()` is ignored
in `src/main/java/com/uber/cadence/internal/worker/LocalActivityPollTask.java`
#### Snippet
```java
  public Boolean apply(LocalActivityWorker.Task task, Duration maxWaitAllowed) {
    try {
      pendingTasks.offer(task, maxWaitAllowed.toMillis(), TimeUnit.MILLISECONDS);
      return true;
    } catch (InterruptedException e) {
```

### IgnoreResultOfCall
Result of `Condition.await()` is ignored
in `src/main/java/com/uber/cadence/internal/testservice/SelfAdvancingTimerImpl.java`
#### Snippet
```java
            peekedTask == null ? Long.MAX_VALUE : peekedTask.getExecutionTime() - currentTime;
        try {
          condition.await(timeToAwait, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
          break;
```

### IgnoreResultOfCall
Result of `Condition.awaitNanos()` is ignored
in `src/main/java/com/uber/cadence/internal/replay/ClockDecisionContext.java`
#### Snippet
```java
    while (!taskCompleted) {
      // This call is called from already locked object
      taskCondition.awaitNanos(duration.toNanos());
    }
    taskCompleted = false;
```

## RuleId[id=FunctionalExpressionCanBeFolded]
### FunctionalExpressionCanBeFolded
Lambda can be replaced with call qualifier
in `src/main/java/com/uber/cadence/internal/sync/AsyncInternal.java`
#### Snippet
```java
   */
  public static <R> Promise<R> function(Functions.Func<R> function) {
    return execute(isAsync(function), () -> function.apply());
  }

```

## RuleId[id=OptionalAssignedToNull]
### OptionalAssignedToNull
Optional value is compared with null
in `src/main/java/com/uber/cadence/internal/sync/ActivityExecutionContextImpl.java`
#### Snippet
```java
    lock.lock();
    try {
      if (lastDetails != null) {
        @SuppressWarnings("unchecked")
        Optional<V> result = (Optional<V>) this.lastDetails;
```

### OptionalAssignedToNull
Optional value is compared with null
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
            }
            workflow.action(StateMachines.Action.TIME_OUT, ctx, TimeoutType.START_TO_CLOSE, 0);
            if (parent != null) {
              ctx.lockTimer(); // unlocked by the parent
            }
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
task.decisionTimeoutSeconds \* 1000: integer multiplication implicitly cast to long
in `src/main/java/com/uber/cadence/internal/worker/LocalActivityWorker.java`
#### Snippet
```java

      // For small backoff we do local retry. Otherwise we will schedule timer on server side.
      if (elapsedTask + sleepMillis < task.decisionTimeoutSeconds * 1000) {
        Thread.sleep(sleepMillis);
        task.params.setAttempt(task.params.getAttempt() + 1);
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `src/main/java/com/uber/cadence/internal/shadowing/ReplayWorkflowActivityImpl.java`
#### Snippet
```java
    try {
      boolean isSuccess = replayWorkflowHistory(domain, execution, workflowHistory);
      if (isSuccess) {
        this.metricsScope.counter(MetricsType.REPLAY_SUCCESS_COUNTER).inc(1);
        result.setSucceeded(1);
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import com.uber.cadence.*;`
in `src/main/java/com/uber/cadence/internal/replay/WorkflowContext.java`
#### Snippet
```java
package com.uber.cadence.internal.replay;

import com.uber.cadence.*;
import com.uber.cadence.context.ContextPropagator;
import java.nio.ByteBuffer;
```

### UNUSED_IMPORT
Unused import `import com.uber.cadence.*;`
in `src/main/java/com/uber/cadence/internal/sync/TestActivityEnvironmentInternal.java`
#### Snippet
```java

import com.google.common.base.Defaults;
import com.uber.cadence.*;
import com.uber.cadence.GetTaskListsByDomainRequest;
import com.uber.cadence.GetTaskListsByDomainResponse;
```

### UNUSED_IMPORT
Unused import `import com.uber.cadence.*;`
in `src/main/java/com/uber/cadence/serviceclient/WorkflowServiceTChannel.java`
#### Snippet
```java
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.uber.cadence.*;
import com.uber.cadence.WorkflowService.GetWorkflowExecutionHistory_result;
import com.uber.cadence.internal.Version;
```

## RuleId[id=TypeParameterExtendsObject]
### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `src/main/java/com/uber/cadence/internal/common/WorkflowExecutionUtils.java`
#### Snippet
```java
      return "null";
    }
    Class<? extends Object> clz = object.getClass();
    if (Number.class.isAssignableFrom(clz)) {
      return String.valueOf(object);
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `status` initializer `null` is redundant
in `src/main/java/com/uber/cadence/internal/external/ManualActivityCompletionClientImpl.java`
#### Snippet
```java
      request.setDetails(dataConverter.toData(details));
      request.setTaskToken(taskToken);
      RecordActivityTaskHeartbeatResponse status = null;
      try {
        status = service.RecordActivityTaskHeartbeat(request);
```

### UnusedAssignment
Variable `mutableState` initializer `null` is redundant
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowService.java`
#### Snippet
```java
          BadRequestError {
    ExecutionId executionId = new ExecutionId(a.getDomain(), a.getExecution());
    TestWorkflowMutableState mutableState = null;
    try {
      mutableState = getMutableState(executionId);
```

### UnusedAssignment
Variable `retryState` initializer `Optional.empty()` is redundant
in `src/main/java/com/uber/cadence/internal/testservice/StateMachines.java`
#### Snippet
```java

  static final class WorkflowData {
    Optional<RetryState> retryState = Optional.empty();
    int backoffStartIntervalInSeconds;
    String cronSchedule;
```

### UnusedAssignment
Variable `response` initializer `null` is redundant
in `src/main/java/com/uber/cadence/serviceclient/WorkflowServiceTChannel.java`
#### Snippet
```java

  private <T> ThriftResponse<T> doRemoteCall(ThriftRequest<?> request) throws TException {
    ThriftResponse<T> response = null;
    try {
      TFuture<ThriftResponse<T>> future = subChannel.send(request);
```

### UnusedAssignment
Variable `executionDetail` initializer `null` is redundant
in `src/main/java/com/uber/cadence/internal/common/WorkflowExecutionUtils.java`
#### Snippet
```java
    describeRequest.setDomain(domain);
    describeRequest.setExecution(workflowExecution);
    DescribeWorkflowExecutionResponse executionDetail = null;
    try {
      executionDetail = service.DescribeWorkflowExecution(describeRequest);
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/uber/cadence/internal/sync/WorkflowStubImpl.java`
#### Snippet
```java
      WorkflowExecution execution =
          new WorkflowExecution().setWorkflowId(p.getWorkflowId()).setRunId(e.getRunId());
      throw new DuplicateWorkflowException(execution, workflowType.get(), e.getMessage());
    } catch (Exception e) {
      throw new WorkflowServiceException(execution.get(), workflowType, e);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/uber/cadence/internal/sync/WorkflowStubImpl.java`
#### Snippet
```java
      throw new DuplicateWorkflowException(
          execution.get(),
          workflowType.get(),
          "Cannot reuse a stub instance to start more than one workflow execution. The stub "
              + "points to already started execution.");
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/uber/cadence/internal/sync/WorkflowStubImpl.java`
#### Snippet
```java
    }
    p.setInput(dataConverter.toData(args));
    p.setWorkflowType(new WorkflowType().setName(workflowType.get()));
    p.setMemo(convertMemoFromObjectToBytes(o.getMemo()));
    p.setSearchAttributes(convertSearchAttributesFromObjectToBytes(o.getSearchAttributes()));
```

### OptionalGetWithoutIsPresent
`OptionalLong.getAsLong()` without 'isPresent()' check
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
      ChildWorkflowExecutionCompletedEventAttributes a =
          new ChildWorkflowExecutionCompletedEventAttributes()
              .setInitiatedEventId(parentChildInitiatedEventId.getAsLong())
              .setResult(d.getResult())
              .setDomain(ctx.getDomain())
```

### OptionalGetWithoutIsPresent
`OptionalLong.getAsLong()` without 'isPresent()' check
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
      ChildWorkflowExecutionFailedEventAttributes a =
          new ChildWorkflowExecutionFailedEventAttributes()
              .setInitiatedEventId(parentChildInitiatedEventId.getAsLong())
              .setDetails(d.getDetails())
              .setReason(d.getReason())
```

### OptionalGetWithoutIsPresent
`OptionalLong.getAsLong()` without 'isPresent()' check
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
      ChildWorkflowExecutionStartedEventAttributes a =
          new ChildWorkflowExecutionStartedEventAttributes()
              .setInitiatedEventId(parentChildInitiatedEventId.getAsLong())
              .setWorkflowExecution(getExecutionId().getExecution())
              .setDomain(getExecutionId().getDomain())
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
    ExecutionTime executionTime = ExecutionTime.forCron(cron);
    Optional<Duration> backoff = executionTime.timeToNextExecution(now);
    int backoffIntervalSeconds = (int) backoff.get().getSeconds();

    if (backoffIntervalSeconds == 0) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
    if (backoffIntervalSeconds == 0) {
      backoff = executionTime.timeToNextExecution(now.plusSeconds(1));
      backoffIntervalSeconds = (int) backoff.get().getSeconds() + 1;
    }

```

### OptionalGetWithoutIsPresent
`OptionalLong.getAsLong()` without 'isPresent()' check
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
      ChildWorkflowExecutionTimedOutEventAttributes a =
          new ChildWorkflowExecutionTimedOutEventAttributes()
              .setInitiatedEventId(parentChildInitiatedEventId.getAsLong())
              .setTimeoutType(TimeoutType.START_TO_CLOSE)
              .setWorkflowType(startRequest.getWorkflowType())
```

### OptionalGetWithoutIsPresent
`OptionalLong.getAsLong()` without 'isPresent()' check
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
      ChildWorkflowExecutionCanceledEventAttributes a =
          new ChildWorkflowExecutionCanceledEventAttributes()
              .setInitiatedEventId(parentChildInitiatedEventId.getAsLong())
              .setDetails(d.getDetails())
              .setDomain(ctx.getDomain())
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `unwrapped instanceof QueryFailedError` is always `false`
in `src/main/java/com/uber/cadence/internal/sync/WorkflowStubImpl.java`
#### Snippet
```java
        throw new WorkflowNotFoundException(execution.get(), workflowType, e.getMessage());
      }
      if (unwrapped instanceof QueryFailedError) {
        throw new WorkflowQueryException(execution.get(), unwrapped.getMessage());
      }
```

### ConstantValue
Value `unwrapped` is always 'null'
in `src/main/java/com/uber/cadence/internal/sync/WorkflowStubImpl.java`
#### Snippet
```java
        throw new WorkflowNotFoundException(execution.get(), workflowType, e.getMessage());
      }
      if (unwrapped instanceof QueryFailedError) {
        throw new WorkflowQueryException(execution.get(), unwrapped.getMessage());
      }
```

### ConstantValue
Condition `unwrapped instanceof InternalServiceError` is always `false`
in `src/main/java/com/uber/cadence/internal/sync/WorkflowStubImpl.java`
#### Snippet
```java
        throw new WorkflowQueryException(execution.get(), unwrapped.getMessage());
      }
      if (unwrapped instanceof InternalServiceError) {
        throw new WorkflowServiceException(execution.get(), workflowType, unwrapped);
      }
```

### ConstantValue
Value `unwrapped` is always 'null'
in `src/main/java/com/uber/cadence/internal/sync/WorkflowStubImpl.java`
#### Snippet
```java
        throw new WorkflowQueryException(execution.get(), unwrapped.getMessage());
      }
      if (unwrapped instanceof InternalServiceError) {
        throw new WorkflowServiceException(execution.get(), workflowType, unwrapped);
      }
```

### ConstantValue
Condition `failure instanceof WorkflowExecutionAlreadyCompletedError` is always `false`
in `src/main/java/com/uber/cadence/internal/sync/WorkflowStubImpl.java`
#### Snippet
```java
    } else if (failure instanceof EntityNotExistsError) {
      throw new WorkflowNotFoundException(execution.get(), workflowType, failure.getMessage());
    } else if (failure instanceof WorkflowExecutionAlreadyCompletedError) {
      throw new WorkflowAlreadyCompletedException(
          execution.get(), workflowType, failure.getMessage());
```

### ConstantValue
Value `failure` is always 'null'
in `src/main/java/com/uber/cadence/internal/sync/WorkflowStubImpl.java`
#### Snippet
```java
    } else if (failure instanceof EntityNotExistsError) {
      throw new WorkflowNotFoundException(execution.get(), workflowType, failure.getMessage());
    } else if (failure instanceof WorkflowExecutionAlreadyCompletedError) {
      throw new WorkflowAlreadyCompletedException(
          execution.get(), workflowType, failure.getMessage());
```

### ConstantValue
Condition `failure instanceof CancellationException` is always `false`
in `src/main/java/com/uber/cadence/internal/sync/WorkflowStubImpl.java`
#### Snippet
```java
      throw new WorkflowAlreadyCompletedException(
          execution.get(), workflowType, failure.getMessage());
    } else if (failure instanceof CancellationException) {
      throw (CancellationException) failure;
    } else if (failure instanceof WorkflowException) {
```

### ConstantValue
Value `failure` is always 'null'
in `src/main/java/com/uber/cadence/internal/sync/WorkflowStubImpl.java`
#### Snippet
```java
      throw new WorkflowAlreadyCompletedException(
          execution.get(), workflowType, failure.getMessage());
    } else if (failure instanceof CancellationException) {
      throw (CancellationException) failure;
    } else if (failure instanceof WorkflowException) {
```

### ConstantValue
Condition `failure instanceof WorkflowException` is always `false`
in `src/main/java/com/uber/cadence/internal/sync/WorkflowStubImpl.java`
#### Snippet
```java
    } else if (failure instanceof CancellationException) {
      throw (CancellationException) failure;
    } else if (failure instanceof WorkflowException) {
      throw (WorkflowException) failure;
    } else {
```

### ConstantValue
Value `failure` is always 'null'
in `src/main/java/com/uber/cadence/internal/sync/WorkflowStubImpl.java`
#### Snippet
```java
    } else if (failure instanceof CancellationException) {
      throw (CancellationException) failure;
    } else if (failure instanceof WorkflowException) {
      throw (WorkflowException) failure;
    } else {
```

### ConstantValue
Value `failure` is always 'null'
in `src/main/java/com/uber/cadence/internal/sync/WorkflowStubImpl.java`
#### Snippet
```java
      throw (WorkflowException) failure;
    } else {
      throw new WorkflowServiceException(execution.get(), workflowType, failure);
    }
  }
```

### ConstantValue
Condition `next != null && count < MAXIMUM_DECISIONS_PER_COMPLETION` is always `false`
in `src/main/java/com/uber/cadence/internal/replay/DecisionsHelper.java`
#### Snippet
```java
      decisionStateMachine = next;
    }
    if (next != null && count < MAXIMUM_DECISIONS_PER_COMPLETION) {
      next.handleDecisionTaskStartedEvent();
    }
```

### ConstantValue
Condition `count < MAXIMUM_DECISIONS_PER_COMPLETION` is always `false` when reached
in `src/main/java/com/uber/cadence/internal/replay/DecisionsHelper.java`
#### Snippet
```java
      decisionStateMachine = next;
    }
    if (next != null && count < MAXIMUM_DECISIONS_PER_COMPLETION) {
      next.handleDecisionTaskStartedEvent();
    }
```

### ConstantValue
Condition `history == null` is always `false`
in `src/main/java/com/uber/cadence/internal/common/InternalUtils.java`
#### Snippet
```java
        deSerializer.deserialize(history, dataByte);

        if (history == null || history.getEvents() == null || history.getEvents().size() == 0) {
          return null;
        }
```

### ConstantValue
Value `content` is always 'null'
in `src/main/java/com/uber/cadence/converter/JsonDataConverter.java`
#### Snippet
```java
        }
        throw new DataConverterException(
            "Content doesn't match expected arguments", content, valueTypes);
      }
      if (valueTypes.length == 1) {
```

### ConstantValue
Condition `events != null` is always `true`
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowStoreImpl.java`
#### Snippet
```java
    List<DataBlob> blobs = InternalUtils.SerializeFromHistoryEventToBlobData(events);
    GetWorkflowExecutionHistoryResponse result = new GetWorkflowExecutionHistoryResponse();
    if (events != null) {
      result.setHistory(new History().setEvents(events));
      result.setRawHistory(blobs);
```

### ConstantValue
Condition `request instanceof RespondActivityTaskCompletedByIDRequest` is always `false`
in `src/main/java/com/uber/cadence/internal/testservice/StateMachines.java`
#### Snippet
```java
    if (request instanceof RespondActivityTaskCompletedRequest) {
      completeActivityTaskByTaskToken(ctx, data, (RespondActivityTaskCompletedRequest) request);
    } else if (request instanceof RespondActivityTaskCompletedByIDRequest) {
      completeActivityTaskById(ctx, data, (RespondActivityTaskCompletedByIDRequest) request);
    } else {
```

### ConstantValue
Condition `request instanceof RespondActivityTaskCanceledByIDRequest` is always `false`
in `src/main/java/com/uber/cadence/internal/testservice/StateMachines.java`
#### Snippet
```java
    if (request instanceof RespondActivityTaskCanceledRequest) {
      details = ((RespondActivityTaskCanceledRequest) request).getDetails();
    } else if (request instanceof RespondActivityTaskCanceledByIDRequest) {
      details = ((RespondActivityTaskCanceledByIDRequest) request).getDetails();
    }
```

### ConstantValue
Condition `request instanceof RespondActivityTaskFailedByIDRequest` is always `false`
in `src/main/java/com/uber/cadence/internal/testservice/StateMachines.java`
#### Snippet
```java
    if (request instanceof RespondActivityTaskFailedRequest) {
      return failActivityTaskByTaskToken(ctx, data, (RespondActivityTaskFailedRequest) request);
    } else if (request instanceof RespondActivityTaskFailedByIDRequest) {
      return failActivityTaskById(ctx, data, (RespondActivityTaskFailedByIDRequest) request);
    } else {
```

### ConstantValue
Condition `replicationConfiguration != null` is always `true`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
    }
    DomainReplicationConfiguration replicationConfiguration = new DomainReplicationConfiguration();
    if (replicationConfiguration != null) {
      if (replicationConfiguration.getActiveClusterName() != null) {
        request.setActiveClusterName(replicationConfiguration.getActiveClusterName());
```

### ConstantValue
Condition `nextDecisionEventId == -1` is always `true` when reached
in `src/main/java/com/uber/cadence/internal/replay/HistoryHelper.java`
#### Snippet
```java

        // Sticky workers receive an event history that starts with DecisionTaskCompleted
        if (eventType == EventType.DecisionTaskCompleted && nextDecisionEventId == -1) {
          nextDecisionEventId = event.getEventId() + 1;
          break;
```

### ConstantValue
Condition `!VERSION_MARKER_NAME.equals(name)` is always `true` when reached
in `src/main/java/com/uber/cadence/internal/replay/ClockDecisionContext.java`
#### Snippet
```java
    } else if (VERSION_MARKER_NAME.equals(name)) {
      handleVersionMarker(attributes);
    } else if (!MUTABLE_SIDE_EFFECT_MARKER_NAME.equals(name) && !VERSION_MARKER_NAME.equals(name)) {
      if (log.isWarnEnabled()) {
        log.warn("Unexpected marker: " + event);
```

### ConstantValue
Condition `event != null` is always `true`
in `src/main/java/com/uber/cadence/internal/common/WorkflowExecutionUtils.java`
#### Snippet
```java
    EventType eventType = event.getEventType();
    boolean result =
        ((event != null)
            && (eventType == EventType.ActivityTaskScheduled
                || eventType == EventType.StartChildWorkflowExecutionInitiated
```

### ConstantValue
Condition `clz.equals(TaskList.class)` is always `false`
in `src/main/java/com/uber/cadence/internal/common/WorkflowExecutionUtils.java`
#### Snippet
```java
      return String.valueOf(object);
    }
    if (clz.equals(TaskList.class)) {
      return String.valueOf(((TaskList) object).getName());
    }
```

### ConstantValue
Condition `clz.equals(ActivityType.class)` is always `false`
in `src/main/java/com/uber/cadence/internal/common/WorkflowExecutionUtils.java`
#### Snippet
```java
      return String.valueOf(((TaskList) object).getName());
    }
    if (clz.equals(ActivityType.class)) {
      return String.valueOf(((ActivityType) object).getName());
    }
```

### ConstantValue
Condition `clz.equals(WorkflowType.class)` is always `false`
in `src/main/java/com/uber/cadence/internal/common/WorkflowExecutionUtils.java`
#### Snippet
```java
      return String.valueOf(((ActivityType) object).getName());
    }
    if (clz.equals(WorkflowType.class)) {
      return String.valueOf(((WorkflowType) object).getName());
    }
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/com/uber/cadence/internal/replay/ContinueAsNewWorkflowExecutionParameters.java`
#### Snippet
```java
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    sb.append("Input: " + new String(input, 0, 512, StandardCharsets.UTF_8) + ", ");
    sb.append("ExecutionStartToCloseTimeout: " + executionStartToCloseTimeoutSeconds + ", ");
    sb.append("TaskStartToCloseTimeout: " + taskStartToCloseTimeoutSeconds + ", ");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/com/uber/cadence/internal/replay/ContinueAsNewWorkflowExecutionParameters.java`
#### Snippet
```java
    sb.append("{");
    sb.append("Input: " + new String(input, 0, 512, StandardCharsets.UTF_8) + ", ");
    sb.append("ExecutionStartToCloseTimeout: " + executionStartToCloseTimeoutSeconds + ", ");
    sb.append("TaskStartToCloseTimeout: " + taskStartToCloseTimeoutSeconds + ", ");
    sb.append("TaskList: " + taskList + ", ");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/com/uber/cadence/internal/replay/ContinueAsNewWorkflowExecutionParameters.java`
#### Snippet
```java
    sb.append("Input: " + new String(input, 0, 512, StandardCharsets.UTF_8) + ", ");
    sb.append("ExecutionStartToCloseTimeout: " + executionStartToCloseTimeoutSeconds + ", ");
    sb.append("TaskStartToCloseTimeout: " + taskStartToCloseTimeoutSeconds + ", ");
    sb.append("TaskList: " + taskList + ", ");
    sb.append("}");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/com/uber/cadence/internal/replay/ContinueAsNewWorkflowExecutionParameters.java`
#### Snippet
```java
    sb.append("ExecutionStartToCloseTimeout: " + executionStartToCloseTimeoutSeconds + ", ");
    sb.append("TaskStartToCloseTimeout: " + taskStartToCloseTimeoutSeconds + ", ");
    sb.append("TaskList: " + taskList + ", ");
    sb.append("}");
    return sb.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/com/uber/cadence/internal/replay/SignalExternalWorkflowParameters.java`
#### Snippet
```java
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    sb.append("SignalName: " + signalName + ", ");
    sb.append("Input: " + new String(input, 0, 512, StandardCharsets.UTF_8) + ", ");
    sb.append("WorkflowId: " + workflowId + ", ");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/com/uber/cadence/internal/replay/SignalExternalWorkflowParameters.java`
#### Snippet
```java
    sb.append("{");
    sb.append("SignalName: " + signalName + ", ");
    sb.append("Input: " + new String(input, 0, 512, StandardCharsets.UTF_8) + ", ");
    sb.append("WorkflowId: " + workflowId + ", ");
    sb.append("RunId: " + runId + ", ");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/com/uber/cadence/internal/replay/SignalExternalWorkflowParameters.java`
#### Snippet
```java
    sb.append("SignalName: " + signalName + ", ");
    sb.append("Input: " + new String(input, 0, 512, StandardCharsets.UTF_8) + ", ");
    sb.append("WorkflowId: " + workflowId + ", ");
    sb.append("RunId: " + runId + ", ");
    sb.append("}");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/com/uber/cadence/internal/replay/SignalExternalWorkflowParameters.java`
#### Snippet
```java
    sb.append("Input: " + new String(input, 0, 512, StandardCharsets.UTF_8) + ", ");
    sb.append("WorkflowId: " + workflowId + ", ");
    sb.append("RunId: " + runId + ", ");
    sb.append("}");
    return sb.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/com/uber/cadence/internal/replay/QueryWorkflowParameters.java`
#### Snippet
```java
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    sb.append("QueryName: " + queryType + ", ");
    sb.append("Input: " + new String(input, 0, 512, StandardCharsets.UTF_8) + ", ");
    sb.append("WorkflowId: " + workflowId + ", ");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/com/uber/cadence/internal/replay/QueryWorkflowParameters.java`
#### Snippet
```java
    sb.append("{");
    sb.append("QueryName: " + queryType + ", ");
    sb.append("Input: " + new String(input, 0, 512, StandardCharsets.UTF_8) + ", ");
    sb.append("WorkflowId: " + workflowId + ", ");
    sb.append("RunId: " + runId + ", ");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/com/uber/cadence/internal/replay/QueryWorkflowParameters.java`
#### Snippet
```java
    sb.append("QueryName: " + queryType + ", ");
    sb.append("Input: " + new String(input, 0, 512, StandardCharsets.UTF_8) + ", ");
    sb.append("WorkflowId: " + workflowId + ", ");
    sb.append("RunId: " + runId + ", ");
    sb.append("QueryRejectCondition: " + queryRejectCondition + ", ");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/com/uber/cadence/internal/replay/QueryWorkflowParameters.java`
#### Snippet
```java
    sb.append("Input: " + new String(input, 0, 512, StandardCharsets.UTF_8) + ", ");
    sb.append("WorkflowId: " + workflowId + ", ");
    sb.append("RunId: " + runId + ", ");
    sb.append("QueryRejectCondition: " + queryRejectCondition + ", ");
    sb.append("queryConsistencyLevel: " + queryConsistencyLevel + ", ");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/com/uber/cadence/internal/replay/QueryWorkflowParameters.java`
#### Snippet
```java
    sb.append("WorkflowId: " + workflowId + ", ");
    sb.append("RunId: " + runId + ", ");
    sb.append("QueryRejectCondition: " + queryRejectCondition + ", ");
    sb.append("queryConsistencyLevel: " + queryConsistencyLevel + ", ");
    sb.append("}");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/com/uber/cadence/internal/replay/QueryWorkflowParameters.java`
#### Snippet
```java
    sb.append("RunId: " + runId + ", ");
    sb.append("QueryRejectCondition: " + queryRejectCondition + ", ");
    sb.append("queryConsistencyLevel: " + queryConsistencyLevel + ", ");
    sb.append("}");
    return sb.toString();
```

## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/uber/cadence/internal/sync/SyncDecisionContext.java`
#### Snippet
```java
    ContinueAsNewWorkflowExecutionParameters parameters =
        new ContinueAsNewWorkflowExecutionParameters();
    if (workflowType.isPresent()) {
      parameters.setWorkflowType(workflowType.get());
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/uber/cadence/internal/sync/WorkflowClientInternal.java`
#### Snippet
```java
      String workflowId, Optional<String> runId, Optional<String> workflowType) {
    WorkflowExecution execution = new WorkflowExecution().setWorkflowId(workflowId);
    if (runId.isPresent()) {
      execution.setRunId(runId.get());
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/uber/cadence/internal/sync/WorkflowClientInternal.java`
#### Snippet
```java
    WorkflowExecution execution = new WorkflowExecution();
    execution.setWorkflowId(workflowId);
    if (runId.isPresent()) {
      execution.setRunId(runId.get());
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/uber/cadence/internal/testservice/StateMachines.java`
#### Snippet
```java
      a.setInput(request.getInput());
    }
    if (data.retryState.isPresent()) {
      a.setAttempt(data.retryState.get().getAttempt());
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/uber/cadence/internal/testservice/StateMachines.java`
#### Snippet
```java
    }
    a.setOriginalExecutionRunId(data.originalExecutionRunId);
    if (data.continuedExecutionRunId.isPresent()) {
      a.setContinuedExecutionRunId(data.continuedExecutionRunId.get());
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
          ctx -> {
            workflow.action(StateMachines.Action.START, ctx, startRequest, 0);
            if (signalWithStartSignal.isPresent()) {
              addExecutionSignaledEvent(ctx, signalWithStartSignal.get());
            }
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.ArrayList'
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowStoreImpl.java`
#### Snippet
```java
        List<DataBlob> blobs = InternalUtils.SerializeFromHistoryEventToBlobData(events);
        // Copy the list as it is mutable. Individual events assumed immutable.
        ArrayList<HistoryEvent> eventsCopy = new ArrayList<>(events);
        return new GetWorkflowExecutionHistoryResponse()
            .setHistory(new History().setEvents(eventsCopy))
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowStoreImpl.java`
#### Snippet
```java
        List<DataBlob> blobs = InternalUtils.SerializeFromHistoryEventToBlobData(events);
        // Copy the list as it is mutable. Individual events assumed immutable.
        ArrayList<HistoryEvent> eventsCopy = new ArrayList<>(events);
        return new GetWorkflowExecutionHistoryResponse()
            .setHistory(new History().setEvents(eventsCopy))
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowStoreImpl.java`
#### Snippet
```java
    try {
      HistoryStore historyStore = getHistoryStore(executionId);
      List<HistoryEvent> events = new ArrayList<>(historyStore.getEventsLocked());
      History history = new History();
      if (taskList.getTaskListName().equals(task.getWorkflowExecutionTaskList().getName())) {
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowStoreImpl.java`
#### Snippet
```java
    try {
      HistoryStore historyStore = getHistoryStore(executionId);
      List<HistoryEvent> events = new ArrayList<>(historyStore.getEventsLocked());
      History history = new History();
      if (taskList.getTaskListName().equals(task.getWorkflowExecutionTaskList().getName())) {
```

### UNCHECKED_WARNING
Unchecked call to 'onComplete(T)' as a member of raw type 'org.apache.thrift.async.AsyncMethodCallback'
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowService.java`
#### Snippet
```java
          try {
            StartWorkflowExecutionResponse result = StartWorkflowExecution(startRequest);
            resultHandler.onComplete(result);
          } catch (TException e) {
            resultHandler.onError(e);
```

### UNCHECKED_WARNING
Unchecked call to 'onComplete(T)' as a member of raw type 'org.apache.thrift.async.AsyncMethodCallback'
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowService.java`
#### Snippet
```java
          try {
            SignalWorkflowExecution(signalRequest);
            resultHandler.onComplete(null);
          } catch (TException e) {
            resultHandler.onError(e);
```

### UNCHECKED_WARNING
Unchecked call to 'HashMap(Map)' as a member of raw type 'java.util.HashMap'
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
    TestWorkflowStore.DecisionTask decisionTask = ctx.getDecisionTask();
    if (decisionTask != null) {
      decisionTask.getTask().setQueries(new HashMap<>(pendingQueries));
    }
  }
```

### UNCHECKED_WARNING
Unchecked call to 'onComplete(T)' as a member of raw type 'org.apache.thrift.async.AsyncMethodCallback'
in `src/main/java/com/uber/cadence/serviceclient/WorkflowServiceTChannel.java`
#### Snippet
```java
                    r.getBody(WorkflowService.SignalWorkflowExecution_result.class);
                if (r.getResponseCode() == ResponseCode.OK) {
                  resultHandler.onComplete(null);
                  return;
                }
```

### UNCHECKED_WARNING
Unchecked call to 'onComplete(T)' as a member of raw type 'org.apache.thrift.async.AsyncMethodCallback'
in `src/main/java/com/uber/cadence/serviceclient/WorkflowServiceTChannel.java`
#### Snippet
```java
                    r.getBody(WorkflowService.StartWorkflowExecution_result.class);
                if (r.getResponseCode() == ResponseCode.OK) {
                  resultHandler.onComplete(result.getSuccess());
                  return;
                }
```

### UNCHECKED_WARNING
Unchecked call to 'onComplete(T)' as a member of raw type 'org.apache.thrift.async.AsyncMethodCallback'
in `src/main/java/com/uber/cadence/serviceclient/WorkflowServiceTChannel.java`
#### Snippet
```java
                    res.setHistory(history);
                  }
                  resultHandler.onComplete(res);
                  return;
                }
```

### UNCHECKED_WARNING
Unchecked call to 'onComplete(T)' as a member of raw type 'org.apache.thrift.async.AsyncMethodCallback'
in `src/main/java/com/uber/cadence/internal/compatibility/Thrift2ProtoAdapter.java`
#### Snippet
```java
              com.uber.cadence.api.v1.GetWorkflowExecutionHistoryResponse response =
                  resultFuture.get();
              resultHandler.onComplete(
                  ResponseMapper.getWorkflowExecutionHistoryResponse(response));
            } catch (Exception e) {
```

### UNCHECKED_WARNING
Unchecked call to 'onComplete(T)' as a member of raw type 'org.apache.thrift.async.AsyncMethodCallback'
in `src/main/java/com/uber/cadence/internal/compatibility/Thrift2ProtoAdapter.java`
#### Snippet
```java
            try {
              com.uber.cadence.api.v1.SignalWorkflowExecutionResponse response = resultFuture.get();
              resultHandler.onComplete(null);
            } catch (Exception e) {
              resultHandler.onError(e);
```

### UNCHECKED_WARNING
Unchecked call to 'onComplete(T)' as a member of raw type 'org.apache.thrift.async.AsyncMethodCallback'
in `src/main/java/com/uber/cadence/internal/compatibility/Thrift2ProtoAdapter.java`
#### Snippet
```java
            try {
              com.uber.cadence.api.v1.StartWorkflowExecutionResponse response = resultFuture.get();
              resultHandler.onComplete(ResponseMapper.startWorkflowExecutionResponse(response));
            } catch (Exception e) {
              resultHandler.onError(e);
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `com.uber.cadence.WorkflowIdReusePolicy`
in `src/main/java/com/uber/cadence/client/DuplicateWorkflowException.java`
#### Snippet
```java
 *   There is a closed workflow with the same ID and the {@link
 *   WorkflowOptions#getWorkflowIdReusePolicy()} is {@link
 *   com.uber.cadence.WorkflowIdReusePolicy#RejectDuplicate}.
 * </ul>
 *
```

### JavadocReference
Cannot resolve symbol `RejectDuplicate`
in `src/main/java/com/uber/cadence/client/DuplicateWorkflowException.java`
#### Snippet
```java
 *   There is a closed workflow with the same ID and the {@link
 *   WorkflowOptions#getWorkflowIdReusePolicy()} is {@link
 *   com.uber.cadence.WorkflowIdReusePolicy#RejectDuplicate}.
 * </ul>
 *
```

### JavadocReference
Cannot resolve symbol `WorkflowExecution`
in `src/main/java/com/uber/cadence/internal/sync/WorkflowStubMarker.java`
#### Snippet
```java
 * use this interface in any application code. Use {@link
 * com.uber.cadence.workflow.Workflow#getWorkflowExecution(Object)} to access {@link
 * WorkflowExecution} out of a workflow stub.
 */
public interface WorkflowStubMarker {
```

### JavadocReference
Cannot resolve symbol `com.uber.cadence.WorkflowIdReusePolicy`
in `src/main/java/com/uber/cadence/client/DuplicateWorkflowException.java`
#### Snippet
```java
 *   There is successfully closed workflow with the same ID and the {@link
 *   WorkflowOptions#getWorkflowIdReusePolicy()} is {@link
 *   com.uber.cadence.WorkflowIdReusePolicy#AllowDuplicateFailedOnly}.
 * </ul>
 *
```

### JavadocReference
Cannot resolve symbol `AllowDuplicateFailedOnly`
in `src/main/java/com/uber/cadence/client/DuplicateWorkflowException.java`
#### Snippet
```java
 *   There is successfully closed workflow with the same ID and the {@link
 *   WorkflowOptions#getWorkflowIdReusePolicy()} is {@link
 *   com.uber.cadence.WorkflowIdReusePolicy#AllowDuplicateFailedOnly}.
 * </ul>
 *
```

### JavadocReference
Cannot resolve symbol `com.uber.cadence.WorkflowIdReusePolicy`
in `src/main/java/com/uber/cadence/client/DuplicateWorkflowException.java`
#### Snippet
```java
 *   com.uber.cadence.workflow.Workflow#newChildWorkflowStub(Class)} and the {@link
 *   WorkflowOptions#getWorkflowIdReusePolicy()} is {@link
 *   com.uber.cadence.WorkflowIdReusePolicy#AllowDuplicate}
 * </ul>
 */
```

### JavadocReference
Cannot resolve symbol `AllowDuplicate`
in `src/main/java/com/uber/cadence/client/DuplicateWorkflowException.java`
#### Snippet
```java
 *   com.uber.cadence.workflow.Workflow#newChildWorkflowStub(Class)} and the {@link
 *   WorkflowOptions#getWorkflowIdReusePolicy()} is {@link
 *   com.uber.cadence.WorkflowIdReusePolicy#AllowDuplicate}
 * </ul>
 */
```

### JavadocReference
Cannot resolve symbol `WorkflowExecution`
in `src/main/java/com/uber/cadence/activity/ActivityTask.java`
#### Snippet
```java
  /**
   * ID of the activity. This ID can be used to complete the activity asynchronously through {@link
   * com.uber.cadence.client.ActivityCompletionClient#complete(WorkflowExecution, String, Object)}.
   */
  String getActivityId();
```

### JavadocReference
Cannot resolve symbol `com.uber.cadence.WorkflowExecution`
in `src/main/java/com/uber/cadence/internal/shadowing/WorkflowExecution.java`
#### Snippet
```java

/**
 * This class is the JSON serializable class of {@link com.uber.cadence.WorkflowExecution} Make sure
 * this class is sync with auto generated WorkflowExecution
 */
```

### JavadocReference
Cannot resolve symbol `TimeoutType`
in `src/main/java/com/uber/cadence/workflow/ActivityTimeoutException.java`
#### Snippet
```java
/**
 * ActivityTimeoutException indicates that an activity has timed out. If the timeout type is a
 * {@link TimeoutType#HEARTBEAT} then the {@link #getDetails(Class)} returns a value passed to the
 * latest successful {@link com.uber.cadence.activity.Activity#heartbeat(Object)} call.
 */
```

### JavadocReference
Cannot resolve symbol `HEARTBEAT`
in `src/main/java/com/uber/cadence/workflow/ActivityTimeoutException.java`
#### Snippet
```java
/**
 * ActivityTimeoutException indicates that an activity has timed out. If the timeout type is a
 * {@link TimeoutType#HEARTBEAT} then the {@link #getDetails(Class)} returns a value passed to the
 * latest successful {@link com.uber.cadence.activity.Activity#heartbeat(Object)} call.
 */
```

### JavadocReference
Cannot resolve symbol `com.uber.cadence.shadower.ReplayWorkflowActivityParams`
in `src/main/java/com/uber/cadence/internal/shadowing/ReplayWorkflowActivityParams.java`
#### Snippet
```java
/**
 * This class is the JSON serializable class of {@link
 * com.uber.cadence.shadower.ReplayWorkflowActivityParams} Make sure this class is sync with auto
 * generated ReplayWorkflowActivityParams
 */
```

### JavadocReference
Cannot resolve symbol `com.uber.cadence.shadower.ScanWorkflowActivityResult`
in `src/main/java/com/uber/cadence/internal/shadowing/ScanWorkflowActivityResult.java`
#### Snippet
```java
/**
 * This class is the JSON serializable class of {@link
 * com.uber.cadence.shadower.ScanWorkflowActivityResult} Make sure this class is sync with auto
 * generated ScanWorkflowActivityResult
 */
```

### JavadocReference
Cannot resolve symbol `com.uber.cadence.shadower.ReplayWorkflowActivityResult`
in `src/main/java/com/uber/cadence/internal/shadowing/ReplayWorkflowActivityResult.java`
#### Snippet
```java
/**
 * This class is the JSON serializable class of {@link
 * com.uber.cadence.shadower.ReplayWorkflowActivityResult} Make sure this class is sync with auto
 * generated ReplayWorkflowActivityResult
 */
```

### JavadocReference
Cannot resolve symbol `com.uber.cadence.PollForDecisionTaskResponse`
in `src/main/java/com/uber/cadence/internal/replay/DecisionContext.java`
#### Snippet
```java

  /**
   * @return time of the {@link com.uber.cadence.PollForDecisionTaskResponse} start event of the
   *     decision being processed or replayed.
   */
```

### JavadocReference
Cannot resolve symbol `WorkflowIdReusePolicy`
in `src/main/java/com/uber/cadence/workflow/WorkflowMethod.java`
#### Snippet
```java
   * Workflow ID to use. Default is random UUID. Specifying workflow in the annotation makes sense
   * only for singleton workflows that would ever have one instance per type running. Make sure that
   * {@link WorkflowIdReusePolicy} is AllowDuplicate in this case.
   */
  String workflowId() default "";
```

### JavadocReference
Cannot resolve symbol `com.uber.cadence.shadower.ScanWorkflowActivityParams`
in `src/main/java/com/uber/cadence/internal/shadowing/ScanWorkflowActivityParams.java`
#### Snippet
```java
/**
 * This class is the JSON serializable class of {@link
 * com.uber.cadence.shadower.ScanWorkflowActivityParams} Make sure this class is sync with auto
 * generated ScanWorkflowActivityParams
 */
```

### JavadocReference
Cannot resolve symbol `WorkflowExecution`
in `src/main/java/com/uber/cadence/client/WorkflowStub.java`
#### Snippet
```java
 * signal, query, wait for completion and cancel a workflow execution. Created through {@link
 * WorkflowClient#newUntypedWorkflowStub(String, WorkflowOptions)} or {@link
 * WorkflowClient#newUntypedWorkflowStub(WorkflowExecution, Optional)}.
 */
public interface WorkflowStub {
```

### JavadocReference
Cannot resolve symbol `QueryRejectCondition`
in `src/main/java/com/uber/cadence/client/WorkflowStub.java`
#### Snippet
```java
   * com.uber.cadence.workflow.QueryMethod}.
   *
   * @see WorkflowClientOptions.Builder#setQueryRejectCondition(QueryRejectCondition)
   * @param queryType name of the query handler. Usually it is a method name.
   * @param resultClass class of the query result type
```

### JavadocReference
Cannot resolve symbol `StartWorkflowExecution(StartWorkflowExecutionRequest)`
in `src/main/java/com/uber/cadence/internal/common/WorkflowExecutionUtils.java`
#### Snippet
```java
   *
   * @param workflowExecution result of {@link
   *     IWorkflowService#StartWorkflowExecution(StartWorkflowExecutionRequest)}
   * @return instance close status
   */
```

### JavadocReference
Cannot resolve symbol `StartWorkflowExecutionRequest`
in `src/main/java/com/uber/cadence/internal/common/WorkflowExecutionUtils.java`
#### Snippet
```java
   *
   * @param workflowExecution result of {@link
   *     IWorkflowService#StartWorkflowExecution(StartWorkflowExecutionRequest)}
   * @return instance close status
   */
```

### JavadocReference
Cannot resolve symbol `WorkflowExecution`
in `src/main/java/com/uber/cadence/internal/common/WorkflowExecutionUtils.java`
#### Snippet
```java

  /**
   * Like {@link #waitForWorkflowInstanceCompletion(IWorkflowService, String, WorkflowExecution,
   * long, TimeUnit)} , except will wait for continued generations of the original workflow
   * execution too.
```

### JavadocReference
Cannot resolve symbol `WorkflowExecution`
in `src/main/java/com/uber/cadence/internal/common/WorkflowExecutionUtils.java`
#### Snippet
```java
   * execution too.
   *
   * @see #waitForWorkflowInstanceCompletion(IWorkflowService, String, WorkflowExecution, long,
   *     TimeUnit)
   */
```

### JavadocReference
Cannot resolve symbol `StartWorkflowExecution(StartWorkflowExecutionRequest)`
in `src/main/java/com/uber/cadence/internal/common/WorkflowExecutionUtils.java`
#### Snippet
```java
   *
   * @param workflowExecution result of {@link
   *     IWorkflowService#StartWorkflowExecution(StartWorkflowExecutionRequest)}
   * @param timeout maximum time to wait for completion. 0 means wait forever.
   * @return instance close status
```

### JavadocReference
Cannot resolve symbol `StartWorkflowExecutionRequest`
in `src/main/java/com/uber/cadence/internal/common/WorkflowExecutionUtils.java`
#### Snippet
```java
   *
   * @param workflowExecution result of {@link
   *     IWorkflowService#StartWorkflowExecution(StartWorkflowExecutionRequest)}
   * @param timeout maximum time to wait for completion. 0 means wait forever.
   * @return instance close status
```

### JavadocReference
Cannot resolve symbol `WorkflowExecution`
in `src/main/java/com/uber/cadence/internal/common/WorkflowExecutionUtils.java`
#### Snippet
```java

  /**
   * Like {@link #waitForWorkflowInstanceCompletion(IWorkflowService, String, WorkflowExecution,
   * long, TimeUnit)} , but with no timeout.*
   */
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/com/uber/cadence/client/WorkflowClientOptions.java`
#### Snippet
```java
    private WorkflowClientInterceptor[] interceptors = EMPTY_INTERCEPTOR_ARRAY;
    private Scope metricsScope = NoopScope.getInstance();
    private String identity = ManagementFactory.getRuntimeMXBean().getName();;
    private List<ContextPropagator> contextPropagators = EMPTY_CONTEXT_PROPAGATORS;
    private QueryRejectCondition queryRejectCondition;
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      builder.setDelayStart(secondsToDuration(t.getDelayStartSeconds()));
    }
    ;
    if (t.getIdentity() != null) {
      builder.setIdentity(t.getIdentity());
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/com/uber/cadence/internal/worker/CircularLongBuffer.java`
#### Snippet
```java
  public void set(long i, long value) {
    values_[getArrayOffset(i)] = value;
  };

  public long get(long i) {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/com/uber/cadence/internal/worker/CircularLongBuffer.java`
#### Snippet
```java
  public long get(long i) {
    return values_[getArrayOffset(i)];
  };

  public int size() {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/com/uber/cadence/internal/worker/CircularLongBuffer.java`
#### Snippet
```java
  public int size() {
    return values_.length;
  };

  public CircularLongBuffer copy(long index1, int length) {
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Condition `unwrapped instanceof EntityNotExistsError` is redundant and can be replaced with a null check
in `src/main/java/com/uber/cadence/internal/sync/WorkflowStubImpl.java`
#### Snippet
```java
    } catch (RuntimeException e) {
      Exception unwrapped = CheckedExceptionWrapper.unwrap(e);
      if (unwrapped instanceof EntityNotExistsError) {
        throw new WorkflowNotFoundException(execution.get(), workflowType, e.getMessage());
      }
```

### DataFlowIssue
Condition `failure instanceof EntityNotExistsError` is redundant and can be replaced with a null check
in `src/main/java/com/uber/cadence/internal/sync/WorkflowStubImpl.java`
#### Snippet
```java
      throw new WorkflowFailureException(
          execution.get(), workflowType, executionFailed.getDecisionTaskCompletedEventId(), cause);
    } else if (failure instanceof EntityNotExistsError) {
      throw new WorkflowNotFoundException(execution.get(), workflowType, failure.getMessage());
    } else if (failure instanceof WorkflowExecutionAlreadyCompletedError) {
```

### DataFlowIssue
Method invocation `getWorkflowId` may produce `NullPointerException`
in `src/main/java/com/uber/cadence/internal/external/ManualActivityCompletionClientImpl.java`
#### Snippet
```java
      request.setDetails(dataConverter.toData(failure));
      request.setDomain(domain);
      request.setWorkflowID(execution.getWorkflowId());
      request.setRunID(execution.getRunId());
      try {
```

### DataFlowIssue
Method invocation `getWorkflowId` may produce `NullPointerException`
in `src/main/java/com/uber/cadence/internal/external/ManualActivityCompletionClientImpl.java`
#### Snippet
```java
      request.setDetails(dataConverter.toData(details));
      request.setDomain(domain);
      request.setWorkflowID(execution.getWorkflowId());
      request.setRunID(execution.getRunId());
      try {
```

### DataFlowIssue
Method invocation `getWorkflowId` may produce `NullPointerException`
in `src/main/java/com/uber/cadence/internal/external/ManualActivityCompletionClientImpl.java`
#### Snippet
```java
      request.setResult(convertedResult);
      request.setDomain(domain);
      request.setWorkflowID(execution.getWorkflowId());
      request.setRunID(execution.getRunId());
      try {
```

### DataFlowIssue
Dereference of `current` may produce `NullPointerException`
in `src/main/java/com/uber/cadence/internal/sync/CancellationScopeImpl.java`
#### Snippet
```java
      throw new Error("Unexpected scope");
    }
    if (!current.detached) {
      current.parent.removeChild(current);
    }
```

### DataFlowIssue
Method invocation `getRunnable` may produce `NullPointerException`
in `src/main/java/com/uber/cadence/internal/testservice/SelfAdvancingTimerImpl.java`
#### Snippet
```java
            LockHandle lockHandle = lockTimeSkippingLocked("runnable " + peekedTask.getTaskInfo());
            TimerTask polledTask = tasks.poll();
            Runnable runnable = polledTask.getRunnable();
            executor.execute(
                () -> {
```

### DataFlowIssue
Argument `events` might be null
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowStoreImpl.java`
#### Snippet
```java
    List<HistoryEvent> events =
        history.waitForNewEvents(expectedNextEventId, getRequest.getHistoryEventFilterType());
    List<DataBlob> blobs = InternalUtils.SerializeFromHistoryEventToBlobData(events);
    GetWorkflowExecutionHistoryResponse result = new GetWorkflowExecutionHistoryResponse();
    if (events != null) {
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `src/main/java/com/uber/cadence/common/RetryOptions.java`
#### Snippet
```java

  private static <G> G merge(G annotation, G options, Class<G> type) {
    if (!Defaults.defaultValue(type).equals(options)) {
      return options;
    }
```

### DataFlowIssue
Method invocation `addCallback` may produce `NullPointerException`
in `src/main/java/com/uber/cadence/serviceclient/WorkflowServiceTChannel.java`
#### Snippet
```java
      result.completeExceptionally(new TException(tChannelError));
    }
    future.addCallback(
        response -> {
          if (response.isError()) {
```

### DataFlowIssue
Method invocation `getErrorType` may produce `NullPointerException`
in `src/main/java/com/uber/cadence/serviceclient/WorkflowServiceTChannel.java`
#### Snippet
```java
  private void throwOnRpcError(ThriftResponse<?> response) throws TException {
    if (response.isError()) {
      if (response.getError().getErrorType() == ErrorType.Timeout) {
        throw new TTransportException(
            TTransportException.TIMED_OUT, response.getError().getMessage());
```

### DataFlowIssue
Method invocation `getFile` may produce `NullPointerException`
in `src/main/java/com/uber/cadence/internal/common/WorkflowExecutionUtils.java`
#### Snippet
```java
      throws IOException {
    ClassLoader classLoader = WorkflowExecutionUtils.class.getClassLoader();
    String historyUrl = classLoader.getResource(resourceFileName).getFile();
    File historyFile = new File(historyUrl);
    return readHistory(historyFile);
```

## RuleId[id=PlaceholderCountMatchesArgumentCount]
### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
                  // Parent might already close
                } catch (BadRequestError | InternalServiceError e) {
                  log.error("Failure reporting child completion", e);
                }
              });
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
                  // Parent might already close
                } catch (BadRequestError | InternalServiceError e) {
                  log.error("Failure reporting child completion", e);
                }
              });
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
        | WorkflowExecutionAlreadyCompletedError e) {
      // Cannot fail to timer threads
      log.error("Failure trying to timeout a workflow", e);
    }
  }
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
                  // Not a problem. Parent might just close by now.
                } catch (BadRequestError | InternalServiceError e) {
                  log.error("Failure reporting child completion", e);
                }
              });
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
        | WorkflowExecutionAlreadyCompletedError e) {
      // Cannot fail to timer threads
      log.error("Failure firing a timer", e);
    }
  }
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
      // Parent might already close
    } catch (BadRequestError | InternalServiceError e) {
      log.error("Failure reporting child timing out", e);
    }
  }
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
                  // Parent might already close
                } catch (BadRequestError | InternalServiceError e) {
                  log.error("Failure reporting child completion", e);
                }
              });
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/com/uber/cadence/internal/replay/SignalDecisionStateMachine.java`
#### Snippet
```java
  @Override
  public Decision getDecision() {
    switch (state) {
      case CREATED:
        return createSignalExternalWorkflowExecutionDecision();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/com/uber/cadence/internal/replay/ActivityDecisionStateMachine.java`
#### Snippet
```java
  @Override
  public void handleCancellationFailureEvent(HistoryEvent event) {
    switch (state) {
      case CANCELLATION_DECISION_SENT:
        stateHistory.add("handleCancellationFailureEvent");
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/com/uber/cadence/internal/replay/ActivityDecisionStateMachine.java`
#### Snippet
```java
  @Override
  public void handleDecisionTaskStartedEvent() {
    switch (state) {
      case CANCELED_AFTER_INITIATED:
        stateHistory.add("handleDecisionTaskStartedEvent");
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/com/uber/cadence/internal/replay/ChildWorkflowDecisionStateMachine.java`
#### Snippet
```java
  @Override
  public void handleCancellationEvent() {
    switch (state) {
      case STARTED:
        stateHistory.add("handleCancellationEvent");
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/com/uber/cadence/internal/replay/ChildWorkflowDecisionStateMachine.java`
#### Snippet
```java
  @Override
  public boolean cancel(Runnable immediateCancellationCallback) {
    switch (state) {
      case STARTED:
        stateHistory.add("cancel");
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/com/uber/cadence/internal/replay/ChildWorkflowDecisionStateMachine.java`
#### Snippet
```java
  @Override
  public void handleDecisionTaskStartedEvent() {
    switch (state) {
      case CANCELED_AFTER_STARTED:
        state = DecisionState.CANCELLATION_DECISION_SENT;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/com/uber/cadence/internal/replay/ChildWorkflowDecisionStateMachine.java`
#### Snippet
```java
  @Override
  public void handleCancellationFailureEvent(HistoryEvent event) {
    switch (state) {
      case CANCELLATION_DECISION_SENT:
        stateHistory.add("handleCancellationFailureEvent");
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/com/uber/cadence/internal/replay/TimerDecisionStateMachine.java`
#### Snippet
```java
  @Override
  public void handleDecisionTaskStartedEvent() {
    switch (state) {
      case CANCELED_AFTER_INITIATED:
        stateHistory.add("handleDecisionTaskStartedEvent");
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/com/uber/cadence/internal/replay/TimerDecisionStateMachine.java`
#### Snippet
```java
  @Override
  public void handleCancellationFailureEvent(HistoryEvent event) {
    switch (state) {
      case CANCELLATION_DECISION_SENT:
        stateHistory.add("handleCancellationFailureEvent");
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/com/uber/cadence/internal/replay/DecisionStateMachineBase.java`
#### Snippet
```java
  public void handleCancellationFailureEvent(HistoryEvent event) {
    stateHistory.add("handleCancellationFailureEvent");
    switch (state) {
      case COMPLETED_AFTER_CANCELLATION_DECISION_SENT:
        state = DecisionState.COMPLETED;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/com/uber/cadence/internal/replay/DecisionStateMachineBase.java`
#### Snippet
```java
  @Override
  public void handleDecisionTaskStartedEvent() {
    switch (state) {
      case CREATED:
        stateHistory.add("handleDecisionTaskStartedEvent");
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/com/uber/cadence/internal/replay/DecisionStateMachineBase.java`
#### Snippet
```java
  public void handleCancellationEvent() {
    stateHistory.add("handleCancellationEvent");
    switch (state) {
      case CANCELLATION_DECISION_SENT:
        state = DecisionState.COMPLETED;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/com/uber/cadence/internal/replay/DecisionStateMachineBase.java`
#### Snippet
```java
  public void handleCancellationInitiatedEvent() {
    stateHistory.add("handleCancellationInitiatedEvent");
    switch (state) {
      case CANCELLATION_DECISION_SENT:
        // No state change
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/com/uber/cadence/internal/replay/ExternalWorkflowCancellationDecisionStateMachine.java`
#### Snippet
```java
  public void handleInitiatedEvent(HistoryEvent event) {
    stateHistory.add("handleInitiatedEvent");
    switch (state) {
      case DECISION_SENT:
        state = DecisionState.INITIATED;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/com/uber/cadence/internal/replay/ExternalWorkflowCancellationDecisionStateMachine.java`
#### Snippet
```java
  @Override
  public Decision getDecision() {
    switch (state) {
      case CREATED:
        return createRequestCancelExternalWorkflowExecutionDecision();
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/com/uber/cadence/internal/compatibility/proto/EnumMapper.java`
#### Snippet
```java
    if (t == null) {
      return QUERY_RESULT_TYPE_INVALID;
    }
    switch (t) {
      case ANSWERED:
        return QUERY_RESULT_TYPE_ANSWERED;
      case FAILED:
        return QUERY_RESULT_TYPE_FAILED;
    }
    throw new IllegalArgumentException("unexpected enum value");
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
    if (t.getBinaryChecksum() != null) {
      builder.setBinaryChecksum(t.getBinaryChecksum());
    }
    if (t.getTaskToken() != null) {
      builder.setTaskToken(arrayToByteString(t.getTaskToken()));
    }
    if (t.getIdentity() != null) {
      builder.setIdentity(t.getIdentity());
    }
    return builder.build();
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/ResponseMapper.java`
#### Snippet
```java
DomainInfo domainInfo = new DomainInfo();
    updateDomainResponse.setDomainInfo(domainInfo);

    domainInfo.setName(t.getDomain().getName());
    domainInfo.setStatus(domainStatus(t.getDomain().getStatus()));
    domainInfo.setDescription(t.getDomain().getDescription());
    domainInfo.setOwnerEmail(t.getDomain().getOwnerEmail());
    domainInfo.setData(t.getDomain().getDataMap());
    domainInfo.setUuid(t.getDomain().getId());

    DomainConfiguration domainConfiguration = new DomainConfiguration();
    updateDomainResponse.setConfiguration(domainConfiguration);

    domainConfiguration.setWorkflowExecutionRetentionPeriodInDays(
        durationToDays(t.getDomain().getWorkflowExecutionRetentionPeriod()));
    domainConfiguration.setEmitMetric(true);
    domainConfiguration.setBadBinaries(badBinaries(t.getDomain().getBadBinaries()));
    domainConfiguration.setHistoryArchivalStatus(
        archivalStatus(t.getDomain().getHistoryArchivalStatus()));
    domainConfiguration.setHistoryArchivalURI(t.getDomain().getHistoryArchivalUri());
    domainConfiguration.setVisibilityArchivalStatus(
        archivalStatus(t.getDomain().getVisibilityArchivalStatus()));
    domainConfiguration.setVisibilityArchivalURI(t.getDomain().getVisibilityArchivalUri());

    DomainReplicationConfiguration domainReplicationConfiguration =
        new DomainReplicationConfiguration();
    updateDomainResponse.setReplicationConfiguration(domainReplicationConfiguration);

    domainReplicationConfiguration.setActiveClusterName(t.getDomain().getActiveClusterName());
    domainReplicationConfiguration.setClusters(
        clusterReplicationConfigurationArray(t.getDomain().getClustersList()));
    updateDomainResponse.setFailoverVersion(t.getDomain().getFailoverVersion());
    updateDomainResponse.setIsGlobalDomain(t.getDomain().getIsGlobalDomain());
    return updateDomainResponse;
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/ResponseMapper.java`
#### Snippet
```java
    domainInfo.setName(t.getDomain().getName());
    domainInfo.setStatus(domainStatus(t.getDomain().getStatus()));
    domainInfo.setDescription(t.getDomain().getDescription());
    domainInfo.setOwnerEmail(t.getDomain().getOwnerEmail());
    domainInfo.setData(t.getDomain().getDataMap());
    domainInfo.setUuid(t.getDomain().getId());

    DomainConfiguration domainConfiguration = new DomainConfiguration();
    response.setConfiguration(domainConfiguration);

    domainConfiguration.setWorkflowExecutionRetentionPeriodInDays(
        durationToDays(t.getDomain().getWorkflowExecutionRetentionPeriod()));
    domainConfiguration.setEmitMetric(true);
    domainConfiguration.setBadBinaries(badBinaries(t.getDomain().getBadBinaries()));
    domainConfiguration.setHistoryArchivalStatus(
        archivalStatus(t.getDomain().getHistoryArchivalStatus()));
    domainConfiguration.setHistoryArchivalURI(t.getDomain().getHistoryArchivalUri());
    domainConfiguration.setVisibilityArchivalStatus(
        archivalStatus(t.getDomain().getVisibilityArchivalStatus()));
    domainConfiguration.setVisibilityArchivalURI(t.getDomain().getVisibilityArchivalUri());

    DomainReplicationConfiguration replicationConfiguration = new DomainReplicationConfiguration();
    response.setReplicationConfiguration(replicationConfiguration);

    replicationConfiguration.setActiveClusterName(t.getDomain().getActiveClusterName());
    replicationConfiguration.setClusters(
        clusterReplicationConfigurationArray(t.getDomain().getClustersList()));

    response.setFailoverVersion(t.getDomain().getFailoverVersion());
    response.setIsGlobalDomain(t.getDomain().getIsGlobalDomain());
    return response;
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/uber/cadence/internal/external/GenericWorkflowClientExternalImpl.java`
#### Snippet
```java
    if (startParameters.getInput() != null) {
      request.setInput(startParameters.getInput());
    }
    request.setExecutionStartToCloseTimeoutSeconds(
        (int) startParameters.getExecutionStartToCloseTimeoutSeconds());
    request.setTaskStartToCloseTimeoutSeconds(
        (int) startParameters.getTaskStartToCloseTimeoutSeconds());
    request.setWorkflowIdReusePolicy(startParameters.getWorkflowIdReusePolicy());
    String taskList = startParameters.getTaskList();
    if (taskList != null && !taskList.isEmpty()) {
      TaskList tl = new TaskList();
      tl.setName(taskList);
      request.setTaskList(tl);
    }
    String workflowId = startParameters.getWorkflowId();
    if (workflowId == null) {
      workflowId = UUID.randomUUID().toString();
    }
    request.setWorkflowId(workflowId);
    request.setWorkflowType(startParameters.getWorkflowType());
    RetryParameters retryParameters = startParameters.getRetryParameters();
    if (retryParameters != null) {
      RetryPolicy retryPolicy = toRetryPolicy(retryParameters);
      request.setRetryPolicy(retryPolicy);
    }
    if (!Strings.isNullOrEmpty(startParameters.getCronSchedule())) {
      request.setCronSchedule(startParameters.getCronSchedule());
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/uber/cadence/internal/external/GenericWorkflowClientExternalImpl.java`
#### Snippet
```java
    if (memo == null || memo.isEmpty()) {
      return null;
    }

    Map<String, ByteBuffer> fields = new HashMap<>();
    for (Map.Entry<String, byte[]> item : memo.entrySet()) {
      fields.put(item.getKey(), ByteBuffer.wrap(item.getValue()));
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/uber/cadence/internal/replay/ActivityDecisionStateMachine.java`
#### Snippet
```java
    switch (state) {
      case CANCELLATION_DECISION_SENT:
        stateHistory.add("handleCancellationFailureEvent");
        state = DecisionState.INITIATED;
        stateHistory.add(state.toString());
        break;
      default:
        super.handleCancellationFailureEvent(event);
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/uber/cadence/internal/sync/ChildWorkflowInvocationHandler.java`
#### Snippet
```java
    if (method.getName().equals(WorkflowStubMarker.GET_EXECUTION_METHOD_NAME)) {
      return stub.getExecution();
    }
    WorkflowMethod workflowMethod = method.getAnnotation(WorkflowMethod.class);
    QueryMethod queryMethod = method.getAnnotation(QueryMethod.class);
    SignalMethod signalMethod = method.getAnnotation(SignalMethod.class);
    WorkflowInvocationHandler.checkAnnotations(method, workflowMethod, queryMethod, signalMethod);
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/uber/cadence/internal/sync/ContinueAsNewWorkflowInvocationHandler.java`
#### Snippet
```java
    WorkflowMethod workflowMethod = method.getAnnotation(WorkflowMethod.class);
    QueryMethod queryMethod = method.getAnnotation(QueryMethod.class);
    SignalMethod signalMethod = method.getAnnotation(SignalMethod.class);
    int count =
        (workflowMethod == null ? 0 : 1)
            + (queryMethod == null ? 0 : 1)
            + (signalMethod == null ? 0 : 1);
    if (count > 1) {
      throw new IllegalArgumentException(
          method
              + " must contain at most one annotation "
              + "from @WorkflowMethod, @QueryMethod or @SignalMethod");
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/uber/cadence/internal/testservice/StateMachines.java`
#### Snippet
```java
    if (attemptActivityRetry(ctx, request.getReason(), data)) {
      return INITIATED;
    }
    ActivityTaskFailedEventAttributes a =
        new ActivityTaskFailedEventAttributes()
            .setIdentity(request.getIdentity())
            .setScheduledEventId(data.scheduledEventId)
            .setDetails(request.getDetails())
            .setReason(request.getReason())
            .setIdentity(request.getIdentity())
            .setStartedEventId(data.startedEventId);
    HistoryEvent event =
        new HistoryEvent()
            .setEventType(EventType.ActivityTaskFailed)
            .setActivityTaskFailedEventAttributes(a);
    ctx.addEvent(event);
    return FAILED;
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
    update(
        ctx -> {
          StateMachine<ChildWorkflowData> child = getChildWorkflow(a.getInitiatedEventId());
          child.action(StateMachines.Action.FAIL, ctx, a, 0);
          childWorkflows.remove(a.getInitiatedEventId());
          scheduleDecision(ctx);
          ctx.unlockTimer();
        });
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
    update(
        ctx -> {
          StateMachine<ActivityTaskData> activity = getActivity(activityId);
          activity.action(StateMachines.Action.FAIL, ctx, request, 0);
          if (isTerminalState(activity.getState())) {
            activities.remove(activityId);
            scheduleDecision(ctx);
          } else {
            addActivityRetryTimer(ctx, activity);
          }
          // Allow time skipping when waiting for retry
          ctx.unlockTimer();
        });
```

### DuplicatedCode
Duplicated code
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowService.java`
#### Snippet
```java
    Optional<String> workflowIdFilter;
    WorkflowExecutionFilter executionFilter = listRequest.getExecutionFilter();
    if (executionFilter != null
        && executionFilter.isSetWorkflowId()
        && !executionFilter.getWorkflowId().isEmpty()) {
      workflowIdFilter = Optional.of(executionFilter.getWorkflowId());
    } else {
      workflowIdFilter = Optional.empty();
    }
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/com/uber/cadence/internal/worker/Poller.java`
#### Snippet
```java
    try {
      pollExecutor.awaitTermination(1, TimeUnit.SECONDS);
    } catch (InterruptedException e) {
    }
    taskExecutor.shutdown();
```

### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/com/uber/cadence/internal/common/InternalUtils.java`
#### Snippet
```java
          try {
            s.awaitTermination(timeoutMillis, TimeUnit.MILLISECONDS);
          } catch (InterruptedException e) {
          }
        });
```

### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/com/uber/cadence/converter/CustomThrowableTypeAdapter.java`
#### Snippet
```java
      try {
        lineNumber = Integer.parseInt(matcher.group("lineNumber"));
      } catch (NumberFormatException e) {
      }
    }
```

### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/com/uber/cadence/internal/common/LambdaUtils.java`
#### Snippet
```java
        if (!(replacement instanceof SerializedLambda)) break; // custom interface implementation
        return (SerializedLambda) replacement;
      } catch (NoSuchMethodException e) {
      } catch (IllegalAccessException | InvocationTargetException e) {
        break;
```

### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/com/uber/cadence/serviceclient/WorkflowServiceTChannel.java`
#### Snippet
```java
              try {
                this.resetSubchannelPeers();
              } catch (final Exception inner_e) {
              }
              result.completeExceptionally(new TException("Rpc error:" + response.getError()));
```

### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/com/uber/cadence/serviceclient/WorkflowServiceTChannel.java`
#### Snippet
```java
      try {
        this.resetSubchannelPeers();
      } catch (final Exception inner_e) {
      }
      result.complete(Boolean.FALSE);
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `src/main/java/com/uber/cadence/internal/replay/DecisionsHelper.java`
#### Snippet
```java

  /**
   * @return true if cancellation already happened as schedule event was found in the new decisions
   *     list
   */
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/com/uber/cadence/internal/shadowing/ReplayWorkflowActivityImpl.java`
#### Snippet
```java
  }

  protected boolean replayWorkflowHistory(
      String domain, WorkflowExecution execution, WorkflowExecutionHistory workflowHistory)
      throws Exception {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/com/uber/cadence/internal/shadowing/ReplayWorkflowActivityImpl.java`
#### Snippet
```java
  }

  protected WorkflowExecutionHistory getFullHistory(String domain, WorkflowExecution execution)
      throws Exception {
    byte[] pageToken = null;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/com/uber/cadence/internal/shadowing/ScanWorkflowActivityImpl.java`
#### Snippet
```java
  }

  protected ListWorkflowExecutionsResponse scanWorkflows(ListWorkflowExecutionsRequest request)
      throws Throwable {
    try {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/com/uber/cadence/internal/shadowing/ScanWorkflowActivityImpl.java`
#### Snippet
```java
  }

  protected List<WorkflowExecution> samplingWorkflows(
      List<WorkflowExecutionInfo> executionInfoList, double samplingRate) {
    int capacity = (int) (executionInfoList.size() * samplingRate);
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/com/uber/cadence/worker/ShadowingWorker.java`
#### Snippet
```java
  }

  protected void startShadowingWorkflow() throws Exception {
    TSerializer serializer = new TSerializer(new TSimpleJSONProtocol.Factory());
    WorkflowParams params =
```

## RuleId[id=ThreadRun]
### ThreadRun
Calls to `run()` should probably be replaced with 'start()'
in `src/main/java/com/uber/cadence/internal/worker/WorkerShutDownHandler.java`
#### Snippet
```java
  // Only for tests
  protected static void execute() {
    registeredHandler.run();
  }
}
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/uber/cadence/internal/worker/Poller.java`
#### Snippet
```java
  public void start() {
    if (log.isDebugEnabled()) {
      log.debug("start(): " + toString());
    }
    if (pollerOptions.getMaximumPollRatePerSecond() > 0.0) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/uber/cadence/converter/CustomThrowableTypeAdapter.java`
#### Snippet
```java
      // suppressed exceptions list.
      DataConverterException ee =
          new DataConverterException("Failure serializing exception: " + throwable.toString(), e);
      if (cause != null) {
        ee.addSuppressed(cause);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/uber/cadence/converter/CustomThrowableTypeAdapter.java`
#### Snippet
```java
      } catch (Throwable e) {
        DataConverterException ee =
            new DataConverterException("Failure serializing exception: " + cause.toString(), e);
        ee.setStackTrace(cause.getStackTrace());
        object.add("cause", causeTypeAdapter.toJsonTree(ee));
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
'Map' may not contain keys of type ''
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
                    (queryId, queryResult) -> {
                      completeQuery(queryId, queryResult);
                      pendingQueries.remove(queryId);
                    });
          }
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `TimeLockingWorkflowStub` may be 'static'
in `src/main/java/com/uber/cadence/internal/sync/TestWorkflowEnvironmentInternal.java`
#### Snippet
```java
    }

    private class TimeLockingWorkflowStub implements WorkflowStub {

      private final WorkflowServiceWrapper service;
```

### InnerClassMayBeStatic
Inner class `HeartbeatDetail` may be 'static'
in `src/main/java/com/uber/cadence/internal/shadowing/ReplayWorkflowActivityImpl.java`
#### Snippet
```java
  }

  private class HeartbeatDetail {
    private final ReplayWorkflowActivityResult replayResult;
    private final int replayExecutionIndex;
```

## RuleId[id=ForwardCompatibility]
### ForwardCompatibility
Unqualified call to 'yield' method is not supported in releases since Java 14
in `src/main/java/com/uber/cadence/internal/sync/WorkflowThreadContext.java`
#### Snippet
```java
      throw new IllegalStateException("not in RUNNING but in " + status + " state");
    }
    yield("created", () -> true);
  }

```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/main/java/com/uber/cadence/internal/shadowing/ReplayWorkflowActivityImpl.java`
#### Snippet
```java

  private boolean isWorkflowTypeNotRegisterError(Exception e) {
    if (e != null && e.getMessage() != null && e.getMessage().contains(UNKNOWN_WORKFLOW_TYPE)) {
      return true;
    } else {
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/com/uber/cadence/internal/shadowing/ReplayWorkflowActivityImpl.java`
#### Snippet
```java

  private boolean isNonDeterministicError(Exception e) {
    if (e != null && e.getMessage() != null && e.getMessage().contains("nondeterministic")) {
      return true;
    } else {
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'workflowType'
in `src/main/java/com/uber/cadence/internal/sync/WorkflowInternal.java`
#### Snippet
```java

  public static void continueAsNew(
      Optional<String> workflowType,
      Optional<ContinueAsNewOptions> options,
      Object[] args,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'options'
in `src/main/java/com/uber/cadence/internal/sync/WorkflowInternal.java`
#### Snippet
```java
  public static void continueAsNew(
      Optional<String> workflowType,
      Optional<ContinueAsNewOptions> options,
      Object[] args,
      WorkflowInterceptor decisionContext) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'workflowType'
in `src/main/java/com/uber/cadence/internal/sync/WorkflowInternal.java`
#### Snippet
```java

  public static void continueAsNew(
      Optional<String> workflowType, Optional<ContinueAsNewOptions> options, Object[] args) {
    getWorkflowInterceptor().continueAsNew(workflowType, options, args);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'options'
in `src/main/java/com/uber/cadence/internal/sync/WorkflowInternal.java`
#### Snippet
```java

  public static void continueAsNew(
      Optional<String> workflowType, Optional<ContinueAsNewOptions> options, Object[] args) {
    getWorkflowInterceptor().continueAsNew(workflowType, options, args);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'runId'
in `src/main/java/com/uber/cadence/client/WorkflowClient.java`
#### Snippet
```java
   */
  WorkflowStub newUntypedWorkflowStub(
      String workflowId, Optional<String> runId, Optional<String> workflowType);

  /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'workflowType'
in `src/main/java/com/uber/cadence/client/WorkflowClient.java`
#### Snippet
```java
   */
  WorkflowStub newUntypedWorkflowStub(
      String workflowId, Optional<String> runId, Optional<String> workflowType);

  /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'workflowType'
in `src/main/java/com/uber/cadence/client/WorkflowClient.java`
#### Snippet
```java
   * @return Stub that can be used to start workflow and later to signal or query it.
   */
  WorkflowStub newUntypedWorkflowStub(WorkflowExecution execution, Optional<String> workflowType);

  /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'runId'
in `src/main/java/com/uber/cadence/client/WorkflowClient.java`
#### Snippet
```java
   * @return Stub that implements workflowInterface and can be used to signal or query it.
   */
  <T> T newWorkflowStub(Class<T> workflowInterface, String workflowId, Optional<String> runId);

  /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'workflowType'
in `src/main/java/com/uber/cadence/internal/sync/WorkflowStubImpl.java`
#### Snippet
```java
      WorkflowClientOptions clientOptions,
      GenericWorkflowClientExternal genericClient,
      Optional<String> workflowType,
      WorkflowExecution execution) {
    this.clientOptions = clientOptions;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'options'
in `src/main/java/com/uber/cadence/internal/sync/WorkflowStubImpl.java`
#### Snippet
```java
  private final Optional<String> workflowType;
  private AtomicReference<WorkflowExecution> execution = new AtomicReference<>();
  private final Optional<WorkflowOptions> options;
  private final WorkflowClientOptions clientOptions;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'workflowType'
in `src/main/java/com/uber/cadence/internal/sync/WorkflowStubImpl.java`
#### Snippet
```java
  private final GenericWorkflowClientExternal genericClient;
  private final DataConverter dataConverter;
  private final Optional<String> workflowType;
  private AtomicReference<WorkflowExecution> execution = new AtomicReference<>();
  private final Optional<WorkflowOptions> options;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'workflowType'
in `src/main/java/com/uber/cadence/client/WorkflowServiceException.java`
#### Snippet
```java

  public WorkflowServiceException(
      WorkflowExecution execution, Optional<String> workflowType, Throwable failure) {
    super(null, execution, workflowType, CheckedExceptionWrapper.unwrap(failure));
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'workflowType'
in `src/main/java/com/uber/cadence/client/WorkflowException.java`
#### Snippet
```java

  private final WorkflowExecution execution;
  private final Optional<String> workflowType;

  protected WorkflowException(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'workflowType'
in `src/main/java/com/uber/cadence/client/WorkflowException.java`
#### Snippet
```java

  private static String getMessage(
      String message, WorkflowExecution execution, Optional<String> workflowType) {
    StringBuilder result = new StringBuilder();
    if (message != null) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'workflowType'
in `src/main/java/com/uber/cadence/client/WorkflowException.java`
#### Snippet
```java

  protected WorkflowException(
      String message, WorkflowExecution execution, Optional<String> workflowType, Throwable cause) {
    super(getMessage(message, execution, workflowType), cause);
    this.execution = execution;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'changeIdEquals'
in `src/main/java/com/uber/cadence/internal/replay/DecisionsHelper.java`
#### Snippet
```java
  void addAllMissingVersionMarker(
      boolean isNextDecisionVersionMarker,
      Optional<Predicate<MarkerRecordedEventAttributes>> changeIdEquals) {
    boolean added;
    do {
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'changeIdEquals'
in `src/main/java/com/uber/cadence/internal/replay/DecisionsHelper.java`
#### Snippet
```java
  private boolean addMissingVersionMarker(
      boolean isNextDecisionVersionMarker,
      Optional<Predicate<MarkerRecordedEventAttributes>> changeIdEquals) {
    Optional<HistoryEvent> optionalEvent = getOptionalDecisionEvent(nextDecisionEventId);
    if (!optionalEvent.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'workflowType'
in `src/main/java/com/uber/cadence/client/WorkflowTerminatedException.java`
#### Snippet
```java
  public WorkflowTerminatedException(
      WorkflowExecution execution,
      Optional<String> workflowType,
      String reason,
      String identity,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'workflowId'
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowStore.java`
#### Snippet
```java
  void getDiagnostics(StringBuilder result);

  List<WorkflowExecutionInfo> listWorkflows(WorkflowState state, Optional<String> workflowId);

  void close();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'signalWithStartSignal'
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableState.java`
#### Snippet
```java

  void startWorkflow(
      boolean continuedAsNew, Optional<SignalWorkflowExecutionRequest> signalWithStartSignal)
      throws InternalServiceError, BadRequestError;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'storedData'
in `src/main/java/com/uber/cadence/internal/replay/MarkerHandler.java`
#### Snippet
```java

  static final class HandleResult {
    private Optional<byte[]> storedData;
    private boolean isNewlyStored;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'storedData'
in `src/main/java/com/uber/cadence/internal/replay/MarkerHandler.java`
#### Snippet
```java
    private boolean isNewlyStored;

    HandleResult(final Optional<byte[]> storedData, final boolean isNewlyStored) {
      this.storedData = storedData;
      this.isNewlyStored = isNewlyStored;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'workflowType'
in `src/main/java/com/uber/cadence/client/WorkflowFailureException.java`
#### Snippet
```java
  }

  private static String getMessage(WorkflowExecution execution, Optional<String> workflowType) {
    StringBuilder result = new StringBuilder();
    if (workflowType.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'workflowType'
in `src/main/java/com/uber/cadence/client/WorkflowFailureException.java`
#### Snippet
```java
  public WorkflowFailureException(
      WorkflowExecution execution,
      Optional<String> workflowType,
      long decisionTaskCompletedEventId,
      Throwable failure) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'workflowType'
in `src/main/java/com/uber/cadence/client/WorkflowNotFoundException.java`
#### Snippet
```java

  public WorkflowNotFoundException(
      WorkflowExecution execution, Optional<String> workflowType, String message) {
    super(message, execution, workflowType, null);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'parent'
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowService.java`
#### Snippet
```java
      StartWorkflowExecutionRequest startRequest,
      int backoffStartIntervalInSeconds,
      Optional<TestWorkflowMutableState> parent,
      OptionalLong parentChildInitiatedEventId,
      Optional<SignalWorkflowExecutionRequest> signalWithStartSignal)
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'parentChildInitiatedEventId'
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowService.java`
#### Snippet
```java
      int backoffStartIntervalInSeconds,
      Optional<TestWorkflowMutableState> parent,
      OptionalLong parentChildInitiatedEventId,
      Optional<SignalWorkflowExecutionRequest> signalWithStartSignal)
      throws BadRequestError, WorkflowExecutionAlreadyStartedError, InternalServiceError {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'signalWithStartSignal'
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowService.java`
#### Snippet
```java
      Optional<TestWorkflowMutableState> parent,
      OptionalLong parentChildInitiatedEventId,
      Optional<SignalWorkflowExecutionRequest> signalWithStartSignal)
      throws BadRequestError, WorkflowExecutionAlreadyStartedError, InternalServiceError {
    String requestWorkflowId = requireNotNull("WorkflowId", startRequest.getWorkflowId());
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'retryState'
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowService.java`
#### Snippet
```java
      StartWorkflowExecutionRequest previousRunStartRequest,
      WorkflowExecutionContinuedAsNewEventAttributes a,
      Optional<RetryState> retryState,
      String identity,
      ExecutionId executionId,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'parent'
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowService.java`
#### Snippet
```java
      String identity,
      ExecutionId executionId,
      Optional<TestWorkflowMutableState> parent,
      OptionalLong parentChildInitiatedEventId)
      throws InternalServiceError, BadRequestError {
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'parentChildInitiatedEventId'
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowService.java`
#### Snippet
```java
      ExecutionId executionId,
      Optional<TestWorkflowMutableState> parent,
      OptionalLong parentChildInitiatedEventId)
      throws InternalServiceError, BadRequestError {
    StartWorkflowExecutionRequest startRequest =
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'continuedExecutionRunId'
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowService.java`
#### Snippet
```java
  private StartWorkflowExecutionResponse startWorkflowExecutionNoRunningCheckLocked(
      StartWorkflowExecutionRequest startRequest,
      Optional<String> continuedExecutionRunId,
      Optional<RetryState> retryState,
      int backoffStartIntervalInSeconds,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'retryState'
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowService.java`
#### Snippet
```java
      StartWorkflowExecutionRequest startRequest,
      Optional<String> continuedExecutionRunId,
      Optional<RetryState> retryState,
      int backoffStartIntervalInSeconds,
      byte[] lastCompletionResult,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'parent'
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowService.java`
#### Snippet
```java
      int backoffStartIntervalInSeconds,
      byte[] lastCompletionResult,
      Optional<TestWorkflowMutableState> parent,
      OptionalLong parentChildInitiatedEventId,
      Optional<SignalWorkflowExecutionRequest> signalWithStartSignal,
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'parentChildInitiatedEventId'
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowService.java`
#### Snippet
```java
      byte[] lastCompletionResult,
      Optional<TestWorkflowMutableState> parent,
      OptionalLong parentChildInitiatedEventId,
      Optional<SignalWorkflowExecutionRequest> signalWithStartSignal,
      WorkflowId workflowId)
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'signalWithStartSignal'
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowService.java`
#### Snippet
```java
      Optional<TestWorkflowMutableState> parent,
      OptionalLong parentChildInitiatedEventId,
      Optional<SignalWorkflowExecutionRequest> signalWithStartSignal,
      WorkflowId workflowId)
      throws InternalServiceError, BadRequestError {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'retryState'
in `src/main/java/com/uber/cadence/internal/testservice/StateMachines.java`
#### Snippet
```java

  static final class WorkflowData {
    Optional<RetryState> retryState = Optional.empty();
    int backoffStartIntervalInSeconds;
    String cronSchedule;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'continuedExecutionRunId'
in `src/main/java/com/uber/cadence/internal/testservice/StateMachines.java`
#### Snippet
```java
    byte[] lastCompletionResult;
    String originalExecutionRunId;
    Optional<String> continuedExecutionRunId;

    WorkflowData(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'retryState'
in `src/main/java/com/uber/cadence/internal/testservice/StateMachines.java`
#### Snippet
```java

    WorkflowData(
        Optional<RetryState> retryState,
        int backoffStartIntervalInSeconds,
        String cronSchedule,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'continuedExecutionRunId'
in `src/main/java/com/uber/cadence/internal/testservice/StateMachines.java`
#### Snippet
```java
        byte[] lastCompletionResult,
        String originalExecutionRunId,
        Optional<String> continuedExecutionRunId) {
      this.retryState = retryState;
      this.backoffStartIntervalInSeconds = backoffStartIntervalInSeconds;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'lastDetails'
in `src/main/java/com/uber/cadence/internal/sync/ActivityExecutionContextImpl.java`
#### Snippet
```java
  private boolean doNotCompleteOnReturn;
  private final long heartbeatIntervalMillis;
  private Optional<Object> lastDetails;
  private boolean hasOutstandingHeartbeat;
  private final ScheduledExecutorService heartbeatExecutor;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'retryState'
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
  TestWorkflowMutableStateImpl(
      StartWorkflowExecutionRequest startRequest,
      Optional<RetryState> retryState,
      int backoffStartIntervalInSeconds,
      byte[] lastCompletionResult,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'parent'
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
      int backoffStartIntervalInSeconds,
      byte[] lastCompletionResult,
      Optional<TestWorkflowMutableState> parent,
      OptionalLong parentChildInitiatedEventId,
      Optional<String> continuedExecutionRunId,
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'parentChildInitiatedEventId'
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
      byte[] lastCompletionResult,
      Optional<TestWorkflowMutableState> parent,
      OptionalLong parentChildInitiatedEventId,
      Optional<String> continuedExecutionRunId,
      TestWorkflowService service,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'continuedExecutionRunId'
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
      Optional<TestWorkflowMutableState> parent,
      OptionalLong parentChildInitiatedEventId,
      Optional<String> continuedExecutionRunId,
      TestWorkflowService service,
      TestWorkflowStore store) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'parent'
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
  private final LongSupplier clock;
  private final ExecutionId executionId;
  private final Optional<TestWorkflowMutableState> parent;
  private final OptionalLong parentChildInitiatedEventId;
  private final TestWorkflowStore store;
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'parentChildInitiatedEventId'
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
  private final ExecutionId executionId;
  private final Optional<TestWorkflowMutableState> parent;
  private final OptionalLong parentChildInitiatedEventId;
  private final TestWorkflowStore store;
  private final TestWorkflowService service;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'continuedExecutionRunId'
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
  private final Map<String, PollForDecisionTaskResponse> queryRequests = new ConcurrentHashMap<>();
  private final Map<String, WorkflowQuery> pendingQueries = new ConcurrentHashMap<>();
  private final Optional<String> continuedExecutionRunId;
  public StickyExecutionAttributes stickyExecutionAttributes;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'workflowType'
in `src/main/java/com/uber/cadence/client/WorkflowClientInterceptor.java`
#### Snippet
```java

  WorkflowStub newUntypedWorkflowStub(
      WorkflowExecution execution, Optional<String> workflowType, WorkflowStub next);

  ActivityCompletionClient newActivityCompletionClient(ActivityCompletionClient next);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'workflowType'
in `src/main/java/com/uber/cadence/client/WorkflowAlreadyCompletedException.java`
#### Snippet
```java

  public WorkflowAlreadyCompletedException(
      WorkflowExecution execution, Optional<String> workflowType, String message) {
    super(message, execution, workflowType, null);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'workflowType'
in `src/main/java/com/uber/cadence/client/WorkflowTimedOutException.java`
#### Snippet
```java

  public WorkflowTimedOutException(
      WorkflowExecution execution, Optional<String> workflowType, TimeoutType timeoutType) {
    super(String.valueOf(timeoutType) + " timeout type", execution, workflowType, null);
    this.timeoutType = timeoutType;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'workflowType'
in `src/main/java/com/uber/cadence/workflow/WorkflowInterceptor.java`
#### Snippet
```java

  void continueAsNew(
      Optional<String> workflowType, Optional<ContinueAsNewOptions> options, Object[] args);

  void registerQuery(String queryType, Type[] argTypes, Functions.Func1<Object[], Object> callback);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'options'
in `src/main/java/com/uber/cadence/workflow/WorkflowInterceptor.java`
#### Snippet
```java

  void continueAsNew(
      Optional<String> workflowType, Optional<ContinueAsNewOptions> options, Object[] args);

  void registerQuery(String queryType, Type[] argTypes, Functions.Func1<Object[], Object> callback);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'workflowType'
in `src/main/java/com/uber/cadence/workflow/Workflow.java`
#### Snippet
```java
   */
  public static void continueAsNew(
      Optional<String> workflowType, Optional<ContinueAsNewOptions> options, Object... args) {
    WorkflowInternal.continueAsNew(workflowType, options, args);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'options'
in `src/main/java/com/uber/cadence/workflow/Workflow.java`
#### Snippet
```java
   */
  public static void continueAsNew(
      Optional<String> workflowType, Optional<ContinueAsNewOptions> options, Object... args) {
    WorkflowInternal.continueAsNew(workflowType, options, args);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'workflowType'
in `src/main/java/com/uber/cadence/internal/common/WorkflowExecutionUtils.java`
#### Snippet
```java

  private static byte[] getResultFromCloseEvent(
      WorkflowExecution workflowExecution, Optional<String> workflowType, HistoryEvent closeEvent) {
    if (closeEvent == null) {
      throw new IllegalStateException("Workflow is still running");
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'workflowType'
in `src/main/java/com/uber/cadence/internal/common/WorkflowExecutionUtils.java`
#### Snippet
```java
      String domain,
      WorkflowExecution workflowExecution,
      Optional<String> workflowType,
      long timeout,
      TimeUnit unit)
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'workflowType'
in `src/main/java/com/uber/cadence/internal/common/WorkflowExecutionUtils.java`
#### Snippet
```java
      String domain,
      WorkflowExecution workflowExecution,
      Optional<String> workflowType,
      long timeout,
      TimeUnit unit) {
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'Scope' used without 'try'-with-resources statement
in `src/main/java/com/uber/cadence/internal/replay/DecisionsHelper.java`
#### Snippet
```java
          options
              .getMetricsScope()
              .tagged(ImmutableMap.of(MetricsTag.WORKFLOW_TYPE, task.getWorkflowType().getName()));
      metricsScope.counter(MetricsType.NON_DETERMINISTIC_ERROR).inc(1);
      throw new NonDeterminisicWorkflowError(
```

### AutoCloseableResource
'Scope' used without 'try'-with-resources statement
in `src/main/java/com/uber/cadence/internal/worker/WorkflowWorker.java`
#### Snippet
```java
          options
              .getMetricsScope()
              .tagged(ImmutableMap.of(MetricsTag.WORKFLOW_TYPE, task.getWorkflowType().getName()));

      MDC.put(LoggerTag.WORKFLOW_ID, task.getWorkflowExecution().getWorkflowId());
```

### AutoCloseableResource
'Scope' used without 'try'-with-resources statement
in `src/main/java/com/uber/cadence/internal/worker/ActivityPollTaskBase.java`
#### Snippet
```java
        options
            .getMetricsScope()
            .tagged(
                ImmutableMap.of(
                    MetricsTag.ACTIVITY_TYPE,
```

### AutoCloseableResource
'Scope' used without 'try'-with-resources statement
in `src/main/java/com/uber/cadence/internal/worker/ActivityPollTask.java`
#### Snippet
```java
      options
          .getMetricsScope()
          .tagged(ImmutableMap.of(MetricsTag.CAUSE, INTERNAL_SERVICE_ERROR))
          .counter(MetricsType.ACTIVITY_POLL_TRANSIENT_FAILED_COUNTER)
          .inc(1);
```

### AutoCloseableResource
'Scope' used without 'try'-with-resources statement
in `src/main/java/com/uber/cadence/internal/worker/ActivityPollTask.java`
#### Snippet
```java
      options
          .getMetricsScope()
          .tagged(ImmutableMap.of(MetricsTag.CAUSE, SERVICE_BUSY))
          .counter(MetricsType.ACTIVITY_POLL_TRANSIENT_FAILED_COUNTER)
          .inc(1);
```

### AutoCloseableResource
'Scope' used without 'try'-with-resources statement
in `src/main/java/com/uber/cadence/serviceclient/WorkflowServiceTChannel.java`
#### Snippet
```java
  private <T> T measureRemoteCallWithTags(
      String scopeName, RemoteCall<T> call, Map<String, String> tags) throws TException {
    Scope scope = options.getMetricsScope().subScope(scopeName);
    if (tags != null) {
      scope = scope.tagged(tags);
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'o == null' covered by subsequent condition '!(o instanceof DecisionId)'
in `src/main/java/com/uber/cadence/internal/replay/DecisionId.java`
#### Snippet
```java
      return true;
    }
    if (o == null || !(o instanceof DecisionId)) {
      return false;
    }
```

### ConditionCoveredByFurtherCondition
Condition 'o == null' covered by subsequent condition '!(o instanceof TaskListId)'
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowStore.java`
#### Snippet
```java
      }

      if (o == null || !(o instanceof TaskListId)) {
        return false;
      }
```

### ConditionCoveredByFurtherCondition
Condition 'o == null' covered by subsequent condition '!(o instanceof WorkflowId)'
in `src/main/java/com/uber/cadence/internal/testservice/WorkflowId.java`
#### Snippet
```java
      return true;
    }
    if (o == null || !(o instanceof WorkflowId)) {
      return false;
    }
```

### ConditionCoveredByFurtherCondition
Condition 'o == null' covered by subsequent condition '!(o instanceof Transition)'
in `src/main/java/com/uber/cadence/internal/testservice/StateMachine.java`
#### Snippet
```java
        return true;
      }
      if (o == null || !(o instanceof Transition)) {
        return false;
      }
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `e` to `Exception` is redundant
in `src/main/java/com/uber/cadence/internal/common/RpcRetryer.java`
#### Snippet
```java
      return new ValueExceptionPair<>(null, e);
    }
    e = unwrap((Exception) e);
    long elapsed = System.currentTimeMillis() - startTime;
    if (options.getDoNotRetry() != null) {
```

### RedundantCast
Casting `(capacity)` to `long` is redundant
in `src/main/java/com/uber/cadence/internal/shadowing/ScanWorkflowActivityImpl.java`
#### Snippet
```java
        .unordered()
        .map((executionInfo -> executionInfo.getExecution()))
        .limit((long) (capacity))
        .collect(Collectors.toList());
  }
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param runId` tag description is missing
in `src/main/java/com/uber/cadence/internal/worker/WorkflowRunLockManager.java`
#### Snippet
```java
   * serialized when sticky is on.
   *
   * @param runId
   * @return a lock to be used during decision task processing
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/com/uber/cadence/internal/sync/WorkflowThread.java`
#### Snippet
```java
   * @param runnable thread function to run
   * @param detached If this thread is detached from the parent {@link CancellationScope}
   * @return
   */
  static WorkflowThread newThread(Runnable runnable, boolean detached) {
```

### JavadocDeclaration
`@param parallelCompensation` tag description is missing
in `src/main/java/com/uber/cadence/workflow/Saga.java`
#### Snippet
```java
       * false, then the compensation operations will be run the reverse order as they are added.
       *
       * @param parallelCompensation
       * @return option builder
       */
```

### JavadocDeclaration
Tag `return` is not allowed here
in `src/main/java/com/uber/cadence/internal/replay/DecisionsHelper.java`
#### Snippet
```java

  /**
   * @return <code>false</code> means that cancel failed, <code>true</code> that
   *     CancelWorkflowExecution was created.
   */
```

### JavadocDeclaration
Javadoc pointing to itself
in `src/main/java/com/uber/cadence/activity/Activity.java`
#### Snippet
```java
   * options. If there was heartbeat details reported by the activity from the failed attempt, the
   * details would be delivered along with the activity task for the retry attempt. The activity
   * could extract the details by {@link #getHeartbeatDetails(Class)}() and resume from the
   * progress.
   *
```

### JavadocDeclaration
Tag `return` is not allowed here
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowStore.java`
#### Snippet
```java
      throws InterruptedException;

  /** @return queryId */
  void sendQueryTask(ExecutionId executionId, TaskListId taskList, PollForDecisionTaskResponse task)
      throws EntityNotExistsError;
```

### JavadocDeclaration
`@param startRequest` tag description is missing
in `src/main/java/com/uber/cadence/serviceclient/IWorkflowService.java`
#### Snippet
```java
   * timeout
   *
   * @param startRequest
   * @param resultHandler
   * @param timeoutInMillis
```

### JavadocDeclaration
`@param resultHandler` tag description is missing
in `src/main/java/com/uber/cadence/serviceclient/IWorkflowService.java`
#### Snippet
```java
   *
   * @param startRequest
   * @param resultHandler
   * @param timeoutInMillis
   * @throws TException
```

### JavadocDeclaration
`@param timeoutInMillis` tag description is missing
in `src/main/java/com/uber/cadence/serviceclient/IWorkflowService.java`
#### Snippet
```java
   * @param startRequest
   * @param resultHandler
   * @param timeoutInMillis
   * @throws TException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/uber/cadence/serviceclient/IWorkflowService.java`
#### Snippet
```java
   * @param resultHandler
   * @param timeoutInMillis
   * @throws TException
   */
  void StartWorkflowExecutionWithTimeout(
```

### JavadocDeclaration
`@param signalRequest` tag description is missing
in `src/main/java/com/uber/cadence/serviceclient/IWorkflowService.java`
#### Snippet
```java
   * timeout
   *
   * @param signalRequest
   * @param resultHandler
   * @param timeoutInMillis
```

### JavadocDeclaration
`@param resultHandler` tag description is missing
in `src/main/java/com/uber/cadence/serviceclient/IWorkflowService.java`
#### Snippet
```java
   *
   * @param signalRequest
   * @param resultHandler
   * @param timeoutInMillis
   * @throws TException
```

### JavadocDeclaration
`@param timeoutInMillis` tag description is missing
in `src/main/java/com/uber/cadence/serviceclient/IWorkflowService.java`
#### Snippet
```java
   * @param signalRequest
   * @param resultHandler
   * @param timeoutInMillis
   * @throws TException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/uber/cadence/serviceclient/IWorkflowService.java`
#### Snippet
```java
   * @param resultHandler
   * @param timeoutInMillis
   * @throws TException
   */
  void SignalWorkflowExecutionWithTimeout(
```

### JavadocDeclaration
`@param getRequest` tag description is missing
in `src/main/java/com/uber/cadence/serviceclient/IWorkflowService.java`
#### Snippet
```java
   * GetWorkflowExecutionHistory but with timeout.
   *
   * @param getRequest
   * @param resultHandler
   * @param timeoutInMillis
```

### JavadocDeclaration
`@param resultHandler` tag description is missing
in `src/main/java/com/uber/cadence/serviceclient/IWorkflowService.java`
#### Snippet
```java
   *
   * @param getRequest
   * @param resultHandler
   * @param timeoutInMillis
   * @throws org.apache.thrift.TException
```

### JavadocDeclaration
`@param timeoutInMillis` tag description is missing
in `src/main/java/com/uber/cadence/serviceclient/IWorkflowService.java`
#### Snippet
```java
   * @param getRequest
   * @param resultHandler
   * @param timeoutInMillis
   * @throws org.apache.thrift.TException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/uber/cadence/serviceclient/IWorkflowService.java`
#### Snippet
```java
   * @param resultHandler
   * @param timeoutInMillis
   * @throws org.apache.thrift.TException
   */
  void GetWorkflowExecutionHistoryWithTimeout(
```

### JavadocDeclaration
`@param getRequest` tag description is missing
in `src/main/java/com/uber/cadence/serviceclient/IWorkflowService.java`
#### Snippet
```java
   * but with timeout.
   *
   * @param getRequest
   * @param timeoutInMillis
   * @return GetWorkflowExecutionHistoryResponse
```

### JavadocDeclaration
`@param timeoutInMillis` tag description is missing
in `src/main/java/com/uber/cadence/serviceclient/IWorkflowService.java`
#### Snippet
```java
   *
   * @param getRequest
   * @param timeoutInMillis
   * @return GetWorkflowExecutionHistoryResponse
   * @throws TException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/uber/cadence/serviceclient/IWorkflowService.java`
#### Snippet
```java
   * @param timeoutInMillis
   * @return GetWorkflowExecutionHistoryResponse
   * @throws TException
   */
  GetWorkflowExecutionHistoryResponse GetWorkflowExecutionHistoryWithTimeout(
```

### JavadocDeclaration
`@param count` tag description is missing
in `src/main/java/com/uber/cadence/internal/testservice/SelfAdvancingTimer.java`
#### Snippet
```java
   * count and unlockTimeSkipping for negative count.
   *
   * @param count
   */
  void updateLocks(int count, String caller);
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/com/uber/cadence/internal/common/BackoffThrottler.java`
#### Snippet
```java
   * Sleep if there were failures since the last success call.
   *
   * @throws InterruptedException
   */
  public void throttle() throws InterruptedException {
```

### JavadocDeclaration
`@param valueClass` tag description is missing
in `src/main/java/com/uber/cadence/converter/DataConverter.java`
#### Snippet
```java
   *
   * @param content Serialized value to convert to a Java object.
   * @param valueClass
   * @param valueType
   * @return converted Java object
```

### JavadocDeclaration
`@param valueType` tag description is missing
in `src/main/java/com/uber/cadence/converter/DataConverter.java`
#### Snippet
```java
   * @param content Serialized value to convert to a Java object.
   * @param valueClass
   * @param valueType
   * @return converted Java object
   * @throws DataConverterException if conversion of the data passed as parameter failed for any
```

### JavadocDeclaration
`@param metricsScope` tag description is missing
in `src/main/java/com/uber/cadence/serviceclient/ClientOptions.java`
#### Snippet
```java
     * Sets the metrics scope to be used for metrics reporting.
     *
     * @param metricsScope
     * @return Builder for ClentOptions
     */
```

### JavadocDeclaration
`@param backoffStartIntervalInSeconds` tag description is missing
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
  /**
   * @param retryState present if workflow is a retry
   * @param backoffStartIntervalInSeconds
   * @param parentChildInitiatedEventId id of the child initiated event in the parent history
   */
```

### JavadocDeclaration
Javadoc pointing to itself
in `src/main/java/com/uber/cadence/workflow/WorkflowMethod.java`
#### Snippet
```java

  /**
   * Maximum workflow execution time. Must be specified either through {@link
   * WorkflowMethod#executionStartToCloseTimeoutSeconds()} or {@link
   * WorkflowOptions#getExecutionStartToCloseTimeout()}.
```

### JavadocDeclaration
`@param query` tag description is missing
in `src/main/java/com/uber/cadence/internal/replay/ReplayWorkflow.java`
#### Snippet
```java
   * a query.
   *
   * @param query
   */
  byte[] query(WorkflowQuery query);
```

### JavadocDeclaration
Tag `return` is not allowed here
in `src/main/java/com/uber/cadence/internal/sync/WorkflowTimers.java`
#### Snippet
```java
  }

  /** @return true if any timer fired */
  public void fireTimers(long currentTime) {
    boolean fired = false;
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `failureCause` may be 'final'
in `src/main/java/com/uber/cadence/workflow/CancelExternalWorkflowException.java`
#### Snippet
```java
public final class CancelExternalWorkflowException extends WorkflowOperationException {

  private SignalExternalWorkflowExecutionFailedCause failureCause;

  private WorkflowExecution signaledExecution;
```

### FieldMayBeFinal
Field `signaledExecution` may be 'final'
in `src/main/java/com/uber/cadence/workflow/CancelExternalWorkflowException.java`
#### Snippet
```java
  private SignalExternalWorkflowExecutionFailedCause failureCause;

  private WorkflowExecution signaledExecution;

  public CancelExternalWorkflowException(
```

### FieldMayBeFinal
Field `attributes` may be 'final'
in `src/main/java/com/uber/cadence/internal/replay/SignalDecisionStateMachine.java`
#### Snippet
```java
class SignalDecisionStateMachine extends DecisionStateMachineBase {

  private SignalExternalWorkflowExecutionDecisionAttributes attributes;

  private boolean canceled;
```

### FieldMayBeFinal
Field `eventId` may be 'final'
in `src/main/java/com/uber/cadence/workflow/WorkflowOperationException.java`
#### Snippet
```java
public abstract class WorkflowOperationException extends RuntimeException {

  private long eventId;

  protected WorkflowOperationException(String message, long eventId) {
```

### FieldMayBeFinal
Field `contextPropagators` may be 'final'
in `src/main/java/com/uber/cadence/workflow/ChildWorkflowOptions.java`
#### Snippet
```java
  private final Map<String, Object> searchAttributes;

  private List<ContextPropagator> contextPropagators;

  private ChildWorkflowOptions(
```

### FieldMayBeFinal
Field `execution` may be 'final'
in `src/main/java/com/uber/cadence/internal/sync/WorkflowStubImpl.java`
#### Snippet
```java
  private final DataConverter dataConverter;
  private final Optional<String> workflowType;
  private AtomicReference<WorkflowExecution> execution = new AtomicReference<>();
  private final Optional<WorkflowOptions> options;
  private final WorkflowClientOptions clientOptions;
```

### FieldMayBeFinal
Field `contextPropagators` may be 'final'
in `src/main/java/com/uber/cadence/internal/context/ContextThreadLocal.java`
#### Snippet
```java
public class ContextThreadLocal {

  private static WorkflowThreadLocal<List<ContextPropagator>> contextPropagators =
      WorkflowThreadLocal.withInitial(
          new Supplier<List<ContextPropagator>>() {
```

### FieldMayBeFinal
Field `result` may be 'final'
in `src/main/java/com/uber/cadence/internal/sync/SyncDecisionContext.java`
#### Snippet
```java

  private class ActivityCallback {
    private CompletablePromise<byte[]> result = Workflow.newPromise();

    public void invoke(byte[] output, Exception failure) {
```

### FieldMayBeFinal
Field `signaledExecution` may be 'final'
in `src/main/java/com/uber/cadence/workflow/SignalExternalWorkflowException.java`
#### Snippet
```java
  private SignalExternalWorkflowExecutionFailedCause failureCause;

  private WorkflowExecution signaledExecution;

  public SignalExternalWorkflowException(
```

### FieldMayBeFinal
Field `failureCause` may be 'final'
in `src/main/java/com/uber/cadence/workflow/SignalExternalWorkflowException.java`
#### Snippet
```java
public final class SignalExternalWorkflowException extends WorkflowOperationException {

  private SignalExternalWorkflowExecutionFailedCause failureCause;

  private WorkflowExecution signaledExecution;
```

### FieldMayBeFinal
Field `retryOptions` may be 'final'
in `src/main/java/com/uber/cadence/client/WorkflowOptions.java`
#### Snippet
```java
  private final String taskList;

  private RetryOptions retryOptions;

  private String cronSchedule;
```

### FieldMayBeFinal
Field `cronSchedule` may be 'final'
in `src/main/java/com/uber/cadence/client/WorkflowOptions.java`
#### Snippet
```java
  private RetryOptions retryOptions;

  private String cronSchedule;

  private Map<String, Object> memo;
```

### FieldMayBeFinal
Field `contextPropagators` may be 'final'
in `src/main/java/com/uber/cadence/client/WorkflowOptions.java`
#### Snippet
```java
  private Map<String, Object> searchAttributes;

  private List<ContextPropagator> contextPropagators;

  private Duration delayStart;
```

### FieldMayBeFinal
Field `searchAttributes` may be 'final'
in `src/main/java/com/uber/cadence/client/WorkflowOptions.java`
#### Snippet
```java
  private Map<String, Object> memo;

  private Map<String, Object> searchAttributes;

  private List<ContextPropagator> contextPropagators;
```

### FieldMayBeFinal
Field `memo` may be 'final'
in `src/main/java/com/uber/cadence/client/WorkflowOptions.java`
#### Snippet
```java
  private String cronSchedule;

  private Map<String, Object> memo;

  private Map<String, Object> searchAttributes;
```

### FieldMayBeFinal
Field `delayStart` may be 'final'
in `src/main/java/com/uber/cadence/client/WorkflowOptions.java`
#### Snippet
```java
  private List<ContextPropagator> contextPropagators;

  private Duration delayStart;

  private WorkflowOptions(
```

### FieldMayBeFinal
Field `cache` may be 'final'
in `src/main/java/com/uber/cadence/internal/sync/POJOWorkflowImplementationFactory.java`
#### Snippet
```java

  private final ExecutorService threadPool;
  private DeciderCache cache;

  POJOWorkflowImplementationFactory(
```

### FieldMayBeFinal
Field `implementationOptions` may be 'final'
in `src/main/java/com/uber/cadence/internal/sync/POJOWorkflowImplementationFactory.java`
#### Snippet
```java
      Collections.synchronizedMap(new HashMap<>());

  private Map<String, WorkflowImplementationOptions> implementationOptions =
      Collections.synchronizedMap(new HashMap<>());

```

### FieldMayBeFinal
Field `contextPropagators` may be 'final'
in `src/main/java/com/uber/cadence/internal/sync/POJOWorkflowImplementationFactory.java`
#### Snippet
```java

  private DataConverter dataConverter;
  private List<ContextPropagator> contextPropagators;

  /** Key: workflow type name, Value: function that creates SyncWorkflowDefinition instance. */
```

### FieldMayBeFinal
Field `memo` may be 'final'
in `src/main/java/com/uber/cadence/internal/replay/StartChildWorkflowExecutionParameters.java`
#### Snippet
```java
  private final String cronSchedule;

  private Map<String, Object> memo;

  private Map<String, Object> searchAttributes;
```

### FieldMayBeFinal
Field `context` may be 'final'
in `src/main/java/com/uber/cadence/internal/replay/StartChildWorkflowExecutionParameters.java`
#### Snippet
```java
  private Map<String, Object> searchAttributes;

  private Map<String, byte[]> context;

  private final ParentClosePolicy parentClosePolicy;
```

### FieldMayBeFinal
Field `searchAttributes` may be 'final'
in `src/main/java/com/uber/cadence/internal/replay/StartChildWorkflowExecutionParameters.java`
#### Snippet
```java
  private Map<String, Object> memo;

  private Map<String, Object> searchAttributes;

  private Map<String, byte[]> context;
```

### FieldMayBeFinal
Field `decisionTaskStartToCloseTimeout` may be 'final'
in `src/main/java/com/uber/cadence/internal/replay/ReplayDecider.java`
#### Snippet
```java
    private final Duration retryServiceOperationMaxInterval = Duration.ofSeconds(4);
    private final Duration paginationStart = Duration.ofMillis(System.currentTimeMillis());
    private Duration decisionTaskStartToCloseTimeout;

    private final Duration decisionTaskRemainingTime() {
```

### FieldMayBeFinal
Field `scheduleAttributes` may be 'final'
in `src/main/java/com/uber/cadence/internal/replay/ActivityDecisionStateMachine.java`
#### Snippet
```java
final class ActivityDecisionStateMachine extends DecisionStateMachineBase {

  private ScheduleActivityTaskDecisionAttributes scheduleAttributes;

  public ActivityDecisionStateMachine(
```

### FieldMayBeFinal
Field `cacheLock` may be 'final'
in `src/main/java/com/uber/cadence/internal/replay/DeciderCache.java`
#### Snippet
```java
  private final Scope metricsScope;
  private LoadingCache<String, Decider> cache;
  private Lock cacheLock = new ReentrantLock();
  private Set<String> inProcessing = new HashSet<>();

```

### FieldMayBeFinal
Field `cache` may be 'final'
in `src/main/java/com/uber/cadence/internal/replay/DeciderCache.java`
#### Snippet
```java
public final class DeciderCache {
  private final Scope metricsScope;
  private LoadingCache<String, Decider> cache;
  private Lock cacheLock = new ReentrantLock();
  private Set<String> inProcessing = new HashSet<>();
```

### FieldMayBeFinal
Field `inProcessing` may be 'final'
in `src/main/java/com/uber/cadence/internal/replay/DeciderCache.java`
#### Snippet
```java
  private LoadingCache<String, Decider> cache;
  private Lock cacheLock = new ReentrantLock();
  private Set<String> inProcessing = new HashSet<>();

  public DeciderCache(int maxCacheSize, Scope scope) {
```

### FieldMayBeFinal
Field `signalOptions` may be 'final'
in `src/main/java/com/uber/cadence/workflow/SignalOptions.java`
#### Snippet
```java

  public static class Builder {
    private SignalOptions signalOptions = new SignalOptions();

    public SignalOptions.Builder setDomain(String domain) {
```

### FieldMayBeFinal
Field `startAttributes` may be 'final'
in `src/main/java/com/uber/cadence/internal/replay/ChildWorkflowDecisionStateMachine.java`
#### Snippet
```java
final class ChildWorkflowDecisionStateMachine extends DecisionStateMachineBase {

  private StartChildWorkflowExecutionDecisionAttributes startAttributes;

  public ChildWorkflowDecisionStateMachine(
```

### FieldMayBeFinal
Field `actionableTaskCount` may be 'final'
in `src/main/java/com/uber/cadence/internal/worker/autoscaler/PollerUsageEstimator.java`
#### Snippet
```java

  private AtomicInteger noopTaskCount = new AtomicInteger();
  private AtomicInteger actionableTaskCount = new AtomicInteger();

  public void increaseNoopTaskCount() {
```

### FieldMayBeFinal
Field `noopTaskCount` may be 'final'
in `src/main/java/com/uber/cadence/internal/worker/autoscaler/PollerUsageEstimator.java`
#### Snippet
```java
public class PollerUsageEstimator {

  private AtomicInteger noopTaskCount = new AtomicInteger();
  private AtomicInteger actionableTaskCount = new AtomicInteger();

```

### FieldMayBeFinal
Field `metricScope` may be 'final'
in `src/main/java/com/uber/cadence/internal/metrics/ClientVersionEmitter.java`
#### Snippet
```java

  private static final Logger LOGGER = LoggerFactory.getLogger(ClientVersionEmitter.class);
  private Scope metricScope;

  public ClientVersionEmitter(Scope metricScope, String domain) {
```

### FieldMayBeFinal
Field `attributes` may be 'final'
in `src/main/java/com/uber/cadence/internal/replay/TimerDecisionStateMachine.java`
#### Snippet
```java
class TimerDecisionStateMachine extends DecisionStateMachineBase {

  private StartTimerDecisionAttributes attributes;

  private boolean canceled;
```

### FieldMayBeFinal
Field `queryRejectCondition` may be 'final'
in `src/main/java/com/uber/cadence/client/QueryOptions.java`
#### Snippet
```java
  }

  private QueryRejectCondition queryRejectCondition;
  private QueryConsistencyLevel queryConsistencyLevel;

```

### FieldMayBeFinal
Field `queryConsistencyLevel` may be 'final'
in `src/main/java/com/uber/cadence/client/QueryOptions.java`
#### Snippet
```java

  private QueryRejectCondition queryRejectCondition;
  private QueryConsistencyLevel queryConsistencyLevel;

  private QueryOptions(
```

### FieldMayBeFinal
Field `stringBuffer` may be 'final'
in `src/main/java/com/uber/cadence/internal/shadowing/QueryBuilder.java`
#### Snippet
```java
  private static final String CLOSE_TIME_PLACEHOLDER = "CloseTime";
  private static final long TIMESTAMP_SCALE = 1_000_000_000L;
  private StringBuffer stringBuffer;

  private QueryBuilder() {
```

### FieldMayBeFinal
Field `cache` may be 'final'
in `src/main/java/com/uber/cadence/internal/sync/DeterministicRunnerImpl.java`
#### Snippet
```java
  private final List<NamedRunnable> toExecuteInWorkflowThread = new ArrayList<>();
  private final Supplier<Long> clock;
  private DeciderCache cache;
  private boolean inRunUntilAllBlocked;
  private boolean closeRequested;
```

### FieldMayBeFinal
Field `rootWorkflowThread` may be 'final'
in `src/main/java/com/uber/cadence/internal/sync/DeterministicRunnerImpl.java`
#### Snippet
```java
  private boolean exitRequested;
  private Object exitValue;
  private WorkflowThread rootWorkflowThread;
  private final CancellationScopeImpl runnerCancellationScope;

```

### FieldMayBeFinal
Field `failedPromises` may be 'final'
in `src/main/java/com/uber/cadence/internal/sync/DeterministicRunnerImpl.java`
#### Snippet
```java
   * avoid failure swallowing by failedPromises which is very hard to troubleshoot.
   */
  private Set<Promise> failedPromises = new HashSet<>();

  private boolean exitRequested;
```

### FieldMayBeFinal
Field `startedAttributes` may be 'final'
in `src/main/java/com/uber/cadence/internal/replay/WorkflowContext.java`
#### Snippet
```java
  private boolean cancelRequested;
  private ContinueAsNewWorkflowExecutionParameters continueAsNewOnCompletion;
  private WorkflowExecutionStartedEventAttributes startedAttributes;
  private final String domain;
  // RunId can change when reset happens. This remembers the actual runId that is used
```

### FieldMayBeFinal
Field `contextPropagators` may be 'final'
in `src/main/java/com/uber/cadence/internal/replay/WorkflowContext.java`
#### Snippet
```java
  private String currentRunId;
  private SearchAttributes searchAttributes;
  private List<ContextPropagator> contextPropagators;

  WorkflowContext(
```

### FieldMayBeFinal
Field `contextPropagators` may be 'final'
in `src/main/java/com/uber/cadence/internal/worker/SingleWorkerOptions.java`
#### Snippet
```java
  private final Scope metricsScope;
  private final boolean enableLoggingInReplay;
  private List<ContextPropagator> contextPropagators;

  private SingleWorkerOptions(
```

### FieldMayBeFinal
Field `invoked` may be 'final'
in `src/main/java/com/uber/cadence/internal/sync/SignalWithStartBatchRequest.java`
#### Snippet
```java
  private Object[] signalArgs;
  private Object[] startArgs;
  private AtomicBoolean invoked = new AtomicBoolean();

  WorkflowExecution invoke() {
```

### FieldMayBeFinal
Field `attributes` may be 'final'
in `src/main/java/com/uber/cadence/internal/replay/ExternalWorkflowCancellationDecisionStateMachine.java`
#### Snippet
```java
final class ExternalWorkflowCancellationDecisionStateMachine extends DecisionStateMachineBase {

  private RequestCancelExternalWorkflowExecutionDecisionAttributes attributes;

  ExternalWorkflowCancellationDecisionStateMachine(
```

### FieldMayBeFinal
Field `shutdown` may be 'final'
in `src/main/java/com/uber/cadence/internal/worker/PollDecisionTaskDispatcher.java`
#### Snippet
```java
  private Thread.UncaughtExceptionHandler uncaughtExceptionHandler =
      (t, e) -> log.error("uncaught exception", e);
  private AtomicBoolean shutdown = new AtomicBoolean();

  public PollDecisionTaskDispatcher(IWorkflowService service) {
```

### FieldMayBeFinal
Field `service` may be 'final'
in `src/main/java/com/uber/cadence/internal/worker/PollDecisionTaskDispatcher.java`
#### Snippet
```java
  private final Map<String, Consumer<PollForDecisionTaskResponse>> subscribers =
      new ConcurrentHashMap<>();
  private IWorkflowService service;
  private Thread.UncaughtExceptionHandler uncaughtExceptionHandler =
      (t, e) -> log.error("uncaught exception", e);
```

### FieldMayBeFinal
Field `concurrency` may be 'final'
in `src/main/java/com/uber/cadence/worker/ShadowingOptions.java`
#### Snippet
```java
  private final double samplingRate;
  private final ExitCondition exitCondition;
  private int concurrency;

  private ShadowingOptions(
```

### FieldMayBeFinal
Field `service` may be 'final'
in `src/main/java/com/uber/cadence/internal/replay/ReplayDecisionTaskHandler.java`
#### Snippet
```java
  private final SingleWorkerOptions options;
  private final Duration stickyTaskListScheduleToStartTimeout;
  private IWorkflowService service;
  private String stickyTaskListName;
  private final BiFunction<LocalActivityWorker.Task, Duration, Boolean> laTaskPoller;
```

### FieldMayBeFinal
Field `stickyTaskListName` may be 'final'
in `src/main/java/com/uber/cadence/internal/replay/ReplayDecisionTaskHandler.java`
#### Snippet
```java
  private final Duration stickyTaskListScheduleToStartTimeout;
  private IWorkflowService service;
  private String stickyTaskListName;
  private final BiFunction<LocalActivityWorker.Task, Duration, Boolean> laTaskPoller;

```

### FieldMayBeFinal
Field `stickyPollerCount` may be 'final'
in `src/main/java/com/uber/cadence/worker/WorkerFactoryOptions.java`
#### Snippet
```java
  private Duration stickyTaskScheduleToStartTimeout;
  private boolean enableLoggingInReplay;
  private int stickyPollerCount;

  private WorkerFactoryOptions(
```

### FieldMayBeFinal
Field `enableLoggingInReplay` may be 'final'
in `src/main/java/com/uber/cadence/worker/WorkerFactoryOptions.java`
#### Snippet
```java
  private final int maxWorkflowThreadCount;
  private Duration stickyTaskScheduleToStartTimeout;
  private boolean enableLoggingInReplay;
  private int stickyPollerCount;

```

### FieldMayBeFinal
Field `stickyTaskScheduleToStartTimeout` may be 'final'
in `src/main/java/com/uber/cadence/worker/WorkerFactoryOptions.java`
#### Snippet
```java
  private final int cacheMaximumSize;
  private final int maxWorkflowThreadCount;
  private Duration stickyTaskScheduleToStartTimeout;
  private boolean enableLoggingInReplay;
  private int stickyPollerCount;
```

### FieldMayBeFinal
Field `status` may be 'final'
in `src/main/java/com/uber/cadence/worker/WorkflowStatus.java`
#### Snippet
```java
  TIMED_OUT(WorkflowExecutionCloseStatus.TIMED_OUT.name());

  private String status;

  WorkflowStatus(String status) {
```

### FieldMayBeFinal
Field `threadIndex` may be 'final'
in `src/main/java/com/uber/cadence/internal/worker/ExecutorThreadFactory.java`
#### Snippet
```java

  private final Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
  private AtomicInteger threadIndex = new AtomicInteger();

  private final String threadPrefix;
```

### FieldMayBeFinal
Field `uncaughtExceptionHandler` may be 'final'
in `src/main/java/com/uber/cadence/internal/worker/Poller.java`
#### Snippet
```java
  private Throttler pollRateThrottler;

  private Thread.UncaughtExceptionHandler uncaughtExceptionHandler =
      (t, e) -> {
        if (e instanceof TTransportException) {
```

### FieldMayBeFinal
Field `propagatedContexts` may be 'final'
in `src/main/java/com/uber/cadence/internal/sync/WorkflowThreadImpl.java`
#### Snippet
```java
    private CancellationScopeImpl cancellationScope;
    private List<ContextPropagator> contextPropagators;
    private Map<String, Object> propagatedContexts;

    RunnableWrapper(
```

### FieldMayBeFinal
Field `cache` may be 'final'
in `src/main/java/com/uber/cadence/internal/sync/WorkflowThreadImpl.java`
#### Snippet
```java
  private final ExecutorService threadPool;
  private final WorkflowThreadContext context;
  private DeciderCache cache;
  private final DeterministicRunnerImpl runner;
  private final RunnableWrapper task;
```

### FieldMayBeFinal
Field `contextPropagators` may be 'final'
in `src/main/java/com/uber/cadence/internal/sync/WorkflowThreadImpl.java`
#### Snippet
```java
    private String name;
    private CancellationScopeImpl cancellationScope;
    private List<ContextPropagator> contextPropagators;
    private Map<String, Object> propagatedContexts;

```

### FieldMayBeFinal
Field `cancellationScope` may be 'final'
in `src/main/java/com/uber/cadence/internal/sync/WorkflowThreadImpl.java`
#### Snippet
```java
    private String originalName;
    private String name;
    private CancellationScopeImpl cancellationScope;
    private List<ContextPropagator> contextPropagators;
    private Map<String, Object> propagatedContexts;
```

### FieldMayBeFinal
Field `supplier` may be 'final'
in `src/main/java/com/uber/cadence/workflow/WorkflowThreadLocal.java`
#### Snippet
```java

  private final WorkflowThreadLocalInternal<T> impl = new WorkflowThreadLocalInternal<>();
  private Supplier<? extends T> supplier;

  private WorkflowThreadLocal(Supplier<? extends T> supplier) {
```

### FieldMayBeFinal
Field `storedData` may be 'final'
in `src/main/java/com/uber/cadence/internal/replay/MarkerHandler.java`
#### Snippet
```java

  static final class HandleResult {
    private Optional<byte[]> storedData;
    private boolean isNewlyStored;

```

### FieldMayBeFinal
Field `isNewlyStored` may be 'final'
in `src/main/java/com/uber/cadence/internal/replay/MarkerHandler.java`
#### Snippet
```java
  static final class HandleResult {
    private Optional<byte[]> storedData;
    private boolean isNewlyStored;

    HandleResult(final Optional<byte[]> storedData, final boolean isNewlyStored) {
```

### FieldMayBeFinal
Field `ldaPollTask` may be 'final'
in `src/main/java/com/uber/cadence/internal/worker/LocallyDispatchedActivityWorker.java`
#### Snippet
```java
public final class LocallyDispatchedActivityWorker extends ActivityWorker {

  private LocallyDispatchedActivityPollTask ldaPollTask;

  public LocallyDispatchedActivityWorker(
```

### FieldMayBeFinal
Field `shutdown` may be 'final'
in `src/main/java/com/uber/cadence/internal/worker/NoopSuspendableWorker.java`
#### Snippet
```java
public class NoopSuspendableWorker implements SuspendableWorker {

  private AtomicBoolean shutdown = new AtomicBoolean();

  @Override
```

### FieldMayBeFinal
Field `pendingTasks` may be 'final'
in `src/main/java/com/uber/cadence/internal/worker/LocalActivityPollTask.java`
#### Snippet
```java
        BiFunction<LocalActivityWorker.Task, Duration, Boolean> {
  private static final int QUEUE_SIZE = 1000;
  private BlockingQueue<LocalActivityWorker.Task> pendingTasks =
      new ArrayBlockingQueue<>(QUEUE_SIZE);

```

### FieldMayBeFinal
Field `scopeStack` may be 'final'
in `src/main/java/com/uber/cadence/internal/sync/CancellationScopeImpl.java`
#### Snippet
```java
class CancellationScopeImpl implements CancellationScope {

  private static ThreadLocal<Deque<CancellationScopeImpl>> scopeStack =
      ThreadLocal.withInitial(ArrayDeque::new);
  private boolean detached;
```

### FieldMayBeFinal
Field `lock` may be 'final'
in `src/main/java/com/uber/cadence/internal/sync/ActivityExecutionContextImpl.java`
#### Snippet
```java
  private boolean hasOutstandingHeartbeat;
  private final ScheduledExecutorService heartbeatExecutor;
  private Lock lock = new ReentrantLock();
  private ScheduledFuture future;
  private ActivityCompletionException lastException;
```

### FieldMayBeFinal
Field `workflow` may be 'final'
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
  private final Map<String, StateMachine<TimerData>> timers = new HashMap<>();
  private final Map<String, StateMachine<SignalExternalData>> externalSignals = new HashMap<>();
  private StateMachine<WorkflowData> workflow;
  private volatile StateMachine<DecisionTaskData> decision;
  private long lastNonFailedDecisionStartEventId;
```

### FieldMayBeFinal
Field `ldaWorker` may be 'final'
in `src/main/java/com/uber/cadence/internal/sync/SyncWorkflowWorker.java`
#### Snippet
```java
  private final ScheduledExecutorService heartbeatExecutor = Executors.newScheduledThreadPool(4);
  private final ScheduledExecutorService ldaHeartbeatExecutor = Executors.newScheduledThreadPool(4);
  private SuspendableWorker ldaWorker;
  private POJOActivityTaskHandler ldaTaskHandler;
  private final IWorkflowService service;
```

### FieldMayBeFinal
Field `supplier` may be 'final'
in `src/main/java/com/uber/cadence/workflow/WorkflowLocal.java`
#### Snippet
```java

  private final RunnerLocalInternal<T> impl = new RunnerLocalInternal<>();
  private Supplier<? extends T> supplier;

  private WorkflowLocal(Supplier<? extends T> supplier) {
```

### FieldMayBeFinal
Field `failureCause` may be 'final'
in `src/main/java/com/uber/cadence/workflow/StartChildWorkflowFailedException.java`
#### Snippet
```java
public final class StartChildWorkflowFailedException extends ChildWorkflowException {

  private ChildWorkflowExecutionFailedCause failureCause;

  public StartChildWorkflowFailedException(
```

### FieldMayBeFinal
Field `events` may be 'final'
in `src/main/java/com/uber/cadence/internal/replay/HistoryHelper.java`
#### Snippet
```java
  static class DecisionEventsIterator implements Iterator<DecisionEvents> {

    private EventsIterator events;
    private long replayCurrentTimeMilliseconds;

```

### FieldMayBeFinal
Field `events` may be 'final'
in `src/main/java/com/uber/cadence/internal/replay/HistoryHelper.java`
#### Snippet
```java
  private static final class EventsIterator implements PeekingIterator<HistoryEvent> {

    private Iterator<HistoryEvent> events;
    private HistoryEvent next;

```

### FieldMayBeFinal
Field `cache` may be 'final'
in `src/main/java/com/uber/cadence/internal/sync/SyncWorkflow.java`
#### Snippet
```java
  WorkflowImplementationOptions workflowImplementationOptions;
  private final Function<WorkflowInterceptor, WorkflowInterceptor> interceptorFactory;
  private DeciderCache cache;
  private WorkflowRunnable workflowProc;
  private DeterministicRunner runner;
```

### FieldMayBeFinal
Field `values_` may be 'final'
in `src/main/java/com/uber/cadence/internal/worker/CircularLongBuffer.java`
#### Snippet
```java
class CircularLongBuffer {

  private long[] values_;

  public CircularLongBuffer(int size) {
```

### FieldMayBeFinal
Field `source` may be 'final'
in `src/main/java/com/uber/cadence/internal/sync/WorkflowQueueImpl.java`
#### Snippet
```java
  private static class MappedQueueConsumer<R, E> implements QueueConsumer<R> {

    private QueueConsumer<E> source;
    private final Functions.Func1<? super E, ? extends R> mapper;

```

### FieldMayBeFinal
Field `subChannel` may be 'final'
in `src/main/java/com/uber/cadence/serviceclient/WorkflowServiceTChannel.java`
#### Snippet
```java
  private final Map<String, String> thriftHeaders;
  private final TChannel tChannel;
  private SubChannel subChannel;

  /**
```

## RuleId[id=CaughtExceptionImmediatelyRethrown]
### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `src/main/java/com/uber/cadence/internal/external/GenericWorkflowClientExternalImpl.java`
#### Snippet
```java
          RpcRetryer.retryWithResult(
              RpcRetryer.DEFAULT_RPC_RETRY_OPTIONS, () -> service.StartWorkflowExecution(request));
    } catch (WorkflowExecutionAlreadyStartedError e) {
      throw e;
    } catch (TException e) {
```

### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
    } catch (InternalServiceError
        | EntityNotExistsError
        | WorkflowExecutionAlreadyCompletedError e) {
      throw e;
    } catch (Exception e) {
```

### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
        | EntityNotExistsError
        | WorkflowExecutionAlreadyCompletedError
        | BadRequestError e) {
      throw e;
    } catch (Exception e) {
```

### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `src/main/java/com/uber/cadence/internal/replay/ClockDecisionContext.java`
#### Snippet
```java
      try {
        result = func.apply();
      } catch (Error e) {
        throw e;
      } catch (Exception e) {
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `result` is redundant
in `src/main/java/com/uber/cadence/converter/TBaseTypeAdapterFactory.java`
#### Snippet
```java
      return null;
    }
    TypeAdapter<T> result =
        new TypeAdapter<T>() {
          @Override
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `src/main/java/com/uber/cadence/internal/common/OptionsUtils.java`
#### Snippet
```java
      return Duration.ZERO;
    }
    Duration result = Duration.ofMillis((long) (Math.ceil(duration.toMillis() / SECOND) * SECOND));
    return result;
  }
```

### UnnecessaryLocalVariable
Local variable `workflowId` is redundant
in `src/main/java/com/uber/cadence/internal/external/GenericWorkflowClientExternalImpl.java`
#### Snippet
```java
  @Override
  public String generateUniqueId() {
    String workflowId = UUID.randomUUID().toString();
    return workflowId;
  }
```

### UnnecessaryLocalVariable
Local variable `response` is redundant
in `src/main/java/com/uber/cadence/internal/external/GenericWorkflowClientExternalImpl.java`
#### Snippet
```java
    request.setQueryConsistencyLevel(queryParameters.getQueryConsistencyLevel());
    try {
      QueryWorkflowResponse response =
          RpcRetryer.retryWithResult(
              RpcRetryer.DEFAULT_RPC_RETRY_OPTIONS, () -> service.QueryWorkflow(request));
```

### UnnecessaryLocalVariable
Local variable `timeMillis` is redundant
in `src/main/java/com/uber/cadence/internal/testservice/SelfAdvancingTimerImpl.java`
#### Snippet
```java
  private final LongSupplier clock =
      () -> {
        long timeMillis = this.currentTimeMillis();
        return timeMillis;
      };
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `src/main/java/com/uber/cadence/converter/TEnumTypeAdapterFactory.java`
#### Snippet
```java
      return null;
    }
    TypeAdapter<T> result =
        new TypeAdapter<T>() {
          @Override
```

### UnnecessaryLocalVariable
Local variable `request` is redundant
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      return null;
    }
    RegisterDomainRequest request =
        RegisterDomainRequest.newBuilder()
            .setName(t.getName())
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `src/main/java/com/uber/cadence/internal/replay/HistoryHelper.java`
#### Snippet
```java
        decisionEvents.add(events.next());
      }
      DecisionEvents result =
          new DecisionEvents(
              newEvents,
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `src/main/java/com/uber/cadence/internal/common/WorkflowExecutionUtils.java`
#### Snippet
```java
  public static boolean isDecisionEvent(HistoryEvent event) {
    EventType eventType = event.getEventType();
    boolean result =
        ((event != null)
            && (eventType == EventType.ActivityTaskScheduled
```

### UnnecessaryLocalVariable
Local variable `instanceMetadata` is redundant
in `src/main/java/com/uber/cadence/internal/common/WorkflowExecutionUtils.java`
#### Snippet
```java
      throw new RuntimeException(e);
    }
    WorkflowExecutionInfo instanceMetadata = executionDetail.getWorkflowExecutionInfo();
    return instanceMetadata;
  }
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/com/uber/cadence/internal/worker/autoscaler/PollerAutoScaler.java`
#### Snippet
```java
                while (!shuttingDown) {
                  try {
                    Thread.sleep(coolDownTime.toMillis());
                    if (!shuttingDown) {
                      resizePollers();
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/com/uber/cadence/internal/worker/Poller.java`
#### Snippet
```java
          // sleep to avoid racing condition
          try {
            Thread.sleep(EXECUTOR_CAPACITY_CHECK_OFFSET_MS);
          } catch (InterruptedException ignored) {
          }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/com/uber/cadence/internal/worker/Poller.java`
#### Snippet
```java
            // sleep to avoid busy loop
            try {
              Thread.sleep(EXECUTOR_CAPACITY_CHECK_INTERVAL_MS);
            } catch (InterruptedException ignored) {
            }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/com/uber/cadence/testing/WorkflowShadower.java`
#### Snippet
```java

      if (nextPageToken == null && options.getShadowMode() == Mode.Continuous) {
        Thread.sleep(SLEEP_INTERVAL);
      }
    } while (nextPageToken != null && options.getShadowMode() == Mode.Normal);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/com/uber/cadence/internal/common/WorkflowExecutionUtils.java`
#### Snippet
```java

          try {
            Thread.sleep(ENTITY_NOT_EXIST_RETRY_WAIT_MILLIS);
          } catch (InterruptedException ie) {
            // Throw entity not exist here.
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `src/main/java/com/uber/cadence/client/WorkflowClientOptions.java`
#### Snippet
```java
  private static final WorkflowClientInterceptor[] EMPTY_INTERCEPTOR_ARRAY =
      new WorkflowClientInterceptor[0];
  private static final List<ContextPropagator> EMPTY_CONTEXT_PROPAGATORS = Arrays.asList();

  static {
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'tryAcquire(int)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `src/main/java/com/uber/cadence/internal/sync/WorkflowThreadImpl.java`
#### Snippet
```java
    context.setStatus(Status.RUNNING);

    if (metricsRateLimiter.tryAcquire(1)) {
      getDecisionContext()
          .getMetricsScope()
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `src/main/java/com/uber/cadence/internal/sync/WorkflowThreadImpl.java`
#### Snippet
```java

class WorkflowThreadImpl implements WorkflowThread {
  private static final RateLimiter metricsRateLimiter = RateLimiter.create(1);

  /**
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `src/main/java/com/uber/cadence/internal/sync/WorkflowThreadImpl.java`
#### Snippet
```java

class WorkflowThreadImpl implements WorkflowThread {
  private static final RateLimiter metricsRateLimiter = RateLimiter.create(1);

  /**
```

### UnstableApiUsage
'create(double)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `src/main/java/com/uber/cadence/internal/sync/WorkflowThreadImpl.java`
#### Snippet
```java

class WorkflowThreadImpl implements WorkflowThread {
  private static final RateLimiter metricsRateLimiter = RateLimiter.create(1);

  /**
```

### UnstableApiUsage
'tryAcquire(int)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `src/main/java/com/uber/cadence/internal/sync/POJOActivityTaskHandler.java`
#### Snippet
```java
          isLocalActivity);
    }
    if (metricsRateLimiter.tryAcquire(1)) {
      if (isLocalActivity) {
        metricsScope
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `src/main/java/com/uber/cadence/internal/sync/POJOActivityTaskHandler.java`
#### Snippet
```java

class POJOActivityTaskHandler implements ActivityTaskHandler {
  private static final RateLimiter metricsRateLimiter = RateLimiter.create(1);

  private final DataConverter dataConverter;
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `src/main/java/com/uber/cadence/internal/sync/POJOActivityTaskHandler.java`
#### Snippet
```java

class POJOActivityTaskHandler implements ActivityTaskHandler {
  private static final RateLimiter metricsRateLimiter = RateLimiter.create(1);

  private final DataConverter dataConverter;
```

### UnstableApiUsage
'create(double)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `src/main/java/com/uber/cadence/internal/sync/POJOActivityTaskHandler.java`
#### Snippet
```java

class POJOActivityTaskHandler implements ActivityTaskHandler {
  private static final RateLimiter metricsRateLimiter = RateLimiter.create(1);

  private final DataConverter dataConverter;
```

