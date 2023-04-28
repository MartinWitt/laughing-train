# cadence-java-client 
 
# Bad smells
I found 742 bad smells with 65 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 264 | false |
| OptionalUsedAsFieldOrParameterType | 58 | false |
| BoundedWildcard | 56 | false |
| UnnecessaryFullyQualifiedName | 29 | false |
| ConstantValue | 27 | false |
| AssignmentToMethodParameter | 27 | false |
| UtilityClassWithoutPrivateConstructor | 24 | true |
| OptionalContainsCollection | 22 | false |
| EmptyMethod | 17 | false |
| StringConcatenationInsideStringBufferAppend | 14 | false |
| DataFlowIssue | 12 | false |
| SizeReplaceableByIsEmpty | 11 | true |
| OptionalGetWithoutIsPresent | 10 | false |
| UnnecessaryLocalVariable | 10 | true |
| KeySetIterationMayUseEntrySet | 8 | false |
| NonFinalFieldOfException | 8 | false |
| UnstableApiUsage | 8 | false |
| ZeroLengthArrayInitialization | 7 | false |
| DuplicateBranchesInSwitch | 6 | false |
| CodeBlock2Expr | 6 | true |
| FieldAccessedSynchronizedAndUnsynchronized | 6 | false |
| OptionalIsPresent | 6 | false |
| CatchMayIgnoreException | 6 | false |
| RedundantSuppression | 6 | false |
| UnusedAssignment | 5 | false |
| UnnecessarySemicolon | 5 | false |
| ProtectedMemberInFinalClass | 5 | true |
| BusyWait | 5 | false |
| IOResource | 4 | false |
| ConditionCoveredByFurtherCondition | 4 | false |
| DynamicRegexReplaceableByCompiledPattern | 4 | false |
| CaughtExceptionImmediatelyRethrown | 4 | false |
| CommentedOutCode | 3 | false |
| StringBufferReplaceableByString | 3 | false |
| EqualsBetweenInconvertibleTypes | 3 | false |
| UNUSED_IMPORT | 3 | false |
| RedundantFieldInitialization | 3 | false |
| Convert2MethodRef | 3 | false |
| UnnecessaryToStringCall | 3 | true |
| WhileLoopSpinsOnField | 2 | false |
| OptionalAssignedToNull | 2 | false |
| ExceptionNameDoesntEndWithException | 2 | false |
| NonSerializableFieldInSerializableClass | 2 | false |
| InnerClassMayBeStatic | 2 | true |
| NonProtectedConstructorInAbstractClass | 2 | true |
| Convert2Lambda | 2 | false |
| WrapperTypeMayBePrimitive | 1 | false |
| UnnecessaryModifier | 1 | true |
| ConditionalBreakInInfiniteLoop | 1 | false |
| StaticCallOnSubclass | 1 | false |
| FinalPrivateMethod | 1 | false |
| UnnecessaryReturn | 1 | true |
| SuspiciousInvocationHandlerImplementation | 1 | false |
| FunctionalExpressionCanBeFolded | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| UnnecessarySuperQualifier | 1 | false |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| InstanceofCatchParameter | 1 | false |
| SynchronizeOnThis | 1 | false |
| TypeParameterExtendsObject | 1 | false |
| FieldMayBeStatic | 1 | false |
| MismatchedJavadocCode | 1 | false |
| ThreadRun | 1 | false |
| SuspiciousMethodCalls | 1 | false |
| ForwardCompatibility | 1 | false |
| SystemOutErr | 1 | false |
| Anonymous2MethodRef | 1 | false |
| AssignmentToLambdaParameter | 1 | false |
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

## RuleId[id=ConditionalBreakInInfiniteLoop]
### ConditionalBreakInInfiniteLoop
Conditional break inside loop
in `src/main/java/com/uber/cadence/internal/worker/Poller.java`
#### Snippet
```java
    private void checkIfTaskHasExecutorHasCapacity() {
      if (pollerOptions.getPollOnlyIfExecutorHasCapacity()) {
        while (true) {
          // sleep to avoid racing condition
          try {
```

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `from()` declared in class 'java.util.Date' but referenced via subclass 'java.sql.Date'
in `src/main/java/com/uber/cadence/serviceclient/auth/AdminJwtAuthorizationProvider.java`
#### Snippet
```java
    jwtBuilder.withClaim("admin", true);
    jwtBuilder.withClaim("ttl", 60 * 10);
    jwtBuilder.withIssuedAt(Date.from(Clock.systemUTC().instant()));
    return jwtBuilder
        .sign(Algorithm.RSA256(this.rsaPublicKey, this.rsaPrivateKey))
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

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `t.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
    }
    Map<String, ActivityLocalDispatchInfo> v = new HashMap<>();
    for (String key : t.keySet()) {
      v.put(key, activityLocalDispatchInfo(t.get(key)));
    }
```

### KeySetIterationMayUseEntrySet
Iteration over `t.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
    }
    Map<String, WorkflowQuery> v = new HashMap<>();
    for (String key : t.keySet()) {
      v.put(key, workflowQuery(t.get(key)));
    }
```

### KeySetIterationMayUseEntrySet
Iteration over `t.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
    }
    Map<String, BadBinaryInfo> v = new HashMap<>();
    for (String key : t.keySet()) {
      v.put(key, badBinaryInfo(t.get(key)));
    }
```

### KeySetIterationMayUseEntrySet
Iteration over `t.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
    }
    Map<String, ByteBuffer> v = new HashMap<>();
    for (String key : t.keySet()) {
      v.put(key, ByteBuffer.wrap(payload(t.get(key))));
    }
```

### KeySetIterationMayUseEntrySet
Iteration over `t.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
    }
    Map<String, IndexedValueType> v = new HashMap<>();
    for (String key : t.keySet()) {
      v.put(key, indexedValueType(t.get(key)));
    }
```

### KeySetIterationMayUseEntrySet
Iteration over `t.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/com/uber/cadence/internal/compatibility/proto/TypeMapper.java`
#### Snippet
```java
    }
    Map<String, WorkflowQueryResult> v = new HashMap<>();
    for (String key : t.keySet()) {
      v.put(key, workflowQueryResult(t.get(key)));
    }
```

### KeySetIterationMayUseEntrySet
Iteration over `t.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/com/uber/cadence/internal/compatibility/proto/TypeMapper.java`
#### Snippet
```java
    }
    Map<String, BadBinaryInfo> v = new HashMap<>();
    for (String key : t.keySet()) {
      v.put(key, badBinaryInfo(t.get(key)));
    }
```

### KeySetIterationMayUseEntrySet
Iteration over `t.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/com/uber/cadence/internal/compatibility/proto/TypeMapper.java`
#### Snippet
```java
    }
    Map<String, Payload> v = new HashMap<>();
    for (String key : t.keySet()) {
      v.put(key, payload(t.get(key).array()));
    }
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

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`events.size() == 0` can be replaced with 'events.isEmpty()'
in `src/main/java/com/uber/cadence/common/WorkflowExecutionHistory.java`
#### Snippet
```java

  private static void checkHistory(List<HistoryEvent> events) {
    if (events == null || events.size() == 0) {
      throw new IllegalArgumentException("Empty history");
    }
```

### SizeReplaceableByIsEmpty
`o1.size() > 0` can be replaced with '!o1.isEmpty()'
in `src/main/java/com/uber/cadence/common/RetryOptions.java`
#### Snippet
```java
      return o2.toArray(result);
    }
    if (o1.size() > 0) {
      @SuppressWarnings("unchecked")
      Class<? extends Throwable>[] result = new Class[o1.size()];
```

### SizeReplaceableByIsEmpty
`t.size() == 0` can be replaced with 't.isEmpty()'
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/Helpers.java`
#### Snippet
```java

  static byte[] byteStringToArray(ByteString t) {
    if (t == null || t.size() == 0) {
      return null;
    }
```

### SizeReplaceableByIsEmpty
`query.length() == 0` can be replaced with 'query.isEmpty()'
in `src/main/java/com/uber/cadence/internal/shadowing/QueryBuilder.java`
#### Snippet
```java

  private void appendPartialQuery(String query) {
    if (query == null || query.length() == 0) {
      return;
    }
```

### SizeReplaceableByIsEmpty
`t.size() == 0` can be replaced with 't.isEmpty()'
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java

  static List<DataBlob> dataBlobArray(List<com.uber.cadence.api.v1.DataBlob> t) {
    if (t == null || t.size() == 0) {
      return null;
    }
```

### SizeReplaceableByIsEmpty
`history.size() != 0` can be replaced with '!history.isEmpty()'
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowStoreImpl.java`
#### Snippet
```java

    private void checkNextEventId(long nextEventId) {
      if (nextEventId != history.size() + 1L && (nextEventId != 0 && history.size() != 0)) {
        throw new IllegalStateException(
            "NextEventId=" + nextEventId + ", historySize=" + history.size() + " for " + id);
```

### SizeReplaceableByIsEmpty
`domain.length() == 0` can be replaced with 'domain.isEmpty()'
in `src/main/java/com/uber/cadence/worker/ShadowingOptions.java`
#### Snippet
```java
    public Builder setDomain(String domain) {
      Objects.requireNonNull(domain);
      if (domain.length() == 0) {
        throw new IllegalArgumentException("Empty domain value");
      }
```

### SizeReplaceableByIsEmpty
`workflowStatuses.size() == 0` can be replaced with 'workflowStatuses.isEmpty()'
in `src/main/java/com/uber/cadence/worker/ShadowingOptions.java`
#### Snippet
```java
      Objects.requireNonNull(workflowStatuses);
      this.workflowStatuses = Sets.newHashSet(workflowStatuses);
      if (workflowStatuses.size() == 0) {
        this.workflowStatuses.add(WorkflowStatus.OPEN);
      }
```

### SizeReplaceableByIsEmpty
`events.size() > 0` can be replaced with '!events.isEmpty()'
in `src/main/java/com/uber/cadence/internal/common/InternalUtils.java`
#### Snippet
```java
    }

    if (events.size() > 0 && historyEventFilterType == HistoryEventFilterType.CLOSE_EVENT) {
      events = events.subList(events.size() - 1, events.size());
    }
```

### SizeReplaceableByIsEmpty
`message.length() > 0` can be replaced with '!message.isEmpty()'
in `src/main/java/com/uber/cadence/converter/DataConverterException.java`
#### Snippet
```java
    }
    StringBuilder result = new StringBuilder();
    if (message != null && message.length() > 0) {
      result.append(message);
      result.append(" ");
```

### SizeReplaceableByIsEmpty
`lns.length() > 0` can be replaced with '!lns.isEmpty()'
in `src/main/java/com/uber/cadence/converter/CustomThrowableTypeAdapter.java`
#### Snippet
```java
    int lineNumber = 0;
    String lns = matcher.group("lineNumber");
    if (lns != null && lns.length() > 0) {
      try {
        lineNumber = Integer.parseInt(matcher.group("lineNumber"));
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
in `src/main/java/com/uber/cadence/internal/replay/QueryWorkflowParameters.java`
#### Snippet
```java
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    sb.append("QueryName: " + queryType + ", ");
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

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super LocalActivityWorker.Task`
in `src/main/java/com/uber/cadence/internal/replay/ClockDecisionContext.java`
#### Snippet
```java
  ClockDecisionContext(
      DecisionsHelper decisions,
      BiFunction<LocalActivityWorker.Task, Duration, Boolean> laTaskPoller,
      ReplayDecider replayDecider,
      DataConverter dataConverter) {
```

### BoundedWildcard
Can generalize to `? super Duration`
in `src/main/java/com/uber/cadence/internal/replay/ClockDecisionContext.java`
#### Snippet
```java
  ClockDecisionContext(
      DecisionsHelper decisions,
      BiFunction<LocalActivityWorker.Task, Duration, Boolean> laTaskPoller,
      ReplayDecider replayDecider,
      DataConverter dataConverter) {
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/com/uber/cadence/internal/sync/WorkflowThreadContext.java`
#### Snippet
```java
   * @param function to evaluate. Consumes reason for yielding parameter.
   */
  public void evaluateInCoroutineContext(Consumer<String> function) {
    lock.lock();
    try {
```

### BoundedWildcard
Can generalize to `? super WorkerOptions.Builder`
in `src/main/java/com/uber/cadence/internal/sync/TestWorkflowEnvironmentInternal.java`
#### Snippet
```java
  @Override
  public Worker newWorker(
      String taskList, Function<WorkerOptions.Builder, WorkerOptions.Builder> overrideOptions) {
    WorkerOptions.Builder builder =
        WorkerOptions.newBuilder()
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/com/uber/cadence/internal/sync/WorkflowStubImpl.java`
#### Snippet
```java
  @Override
  public <R> CompletableFuture<R> getResultAsync(
      long timeout, TimeUnit unit, Class<R> resultClass, Type resultType) {
    checkStarted();
    return WorkflowExecutionUtils.getWorkflowExecutionResultAsync(
```

### BoundedWildcard
Can generalize to `? extends ContextPropagator`
in `src/main/java/com/uber/cadence/internal/sync/WorkflowStubImpl.java`
#### Snippet
```java

  private Map<String, byte[]> extractContextsAndConvertToBytes(
      List<ContextPropagator> contextPropagators) {
    if (contextPropagators == null || contextPropagators.isEmpty()) {
      return null;
```

### BoundedWildcard
Can generalize to `? extends DecisionStateMachine`
in `src/main/java/com/uber/cadence/internal/replay/DecisionsHelper.java`
#### Snippet
```java
  }

  private DecisionStateMachine getNextDecision(Iterator<DecisionStateMachine> iterator) {
    DecisionStateMachine result = null;
    while (result == null && iterator.hasNext()) {
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/com/uber/cadence/internal/worker/PollTaskExecutor.java`
#### Snippet
```java

  PollTaskExecutor(
      String domain, String taskList, SingleWorkerOptions options, TaskHandler<T> handler) {
    this.domain = domain;
    this.taskList = taskList;
```

### BoundedWildcard
Can generalize to `? super Optional`
in `src/main/java/com/uber/cadence/internal/sync/DeterministicRunnerImpl.java`
#### Snippet
```java
    @Override
    public Optional<byte[]> mutableSideEffect(
        String id, DataConverter converter, Func1<Optional<byte[]>, Optional<byte[]>> func) {
      return func.apply(Optional.empty());
    }
```

### BoundedWildcard
Can generalize to `? super Optional`
in `src/main/java/com/uber/cadence/internal/replay/MarkerHandler.java`
#### Snippet
```java
   */
  HandleResult handle(
      String id, DataConverter converter, Func1<Optional<byte[]>, Optional<byte[]>> func) {
    MarkerResult result = mutableMarkerResults.get(id);
    Optional<byte[]> stored;
```

### BoundedWildcard
Can generalize to `? extends Promise`
in `src/main/java/com/uber/cadence/internal/sync/AllOfFuture.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  public AllOfPromise(Collection<Promise<G>> promises) {
    if (promises.isEmpty()) {
      impl.complete(Collections.emptyList());
```

### BoundedWildcard
Can generalize to `? extends G`
in `src/main/java/com/uber/cadence/internal/sync/AllOfFuture.java`
#### Snippet
```java
  }

  private void addPromise(int index, Promise<G> f) {
    if (f.isCompleted()) {
      result[index] = f.get();
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/com/uber/cadence/internal/sync/SyncDecisionContext.java`
#### Snippet
```java

  @Override
  public <R> R sideEffect(Class<R> resultClass, Type resultType, Func<R> func) {
    DataConverter dataConverter = getDataConverter();
    byte[] result =
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/com/uber/cadence/internal/sync/SyncDecisionContext.java`
#### Snippet
```java

  @Override
  public <R> R sideEffect(Class<R> resultClass, Type resultType, Func<R> func) {
    DataConverter dataConverter = getDataConverter();
    byte[] result =
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/com/uber/cadence/internal/sync/SyncDecisionContext.java`
#### Snippet
```java
  @Override
  public <R> R mutableSideEffect(
      String id, Class<R> resultClass, Type resultType, BiPredicate<R, R> updated, Func<R> func) {
    AtomicReference<R> unserializedResult = new AtomicReference<>();
    // As lambda below never returns Optional.empty() if there is a stored value
```

### BoundedWildcard
Can generalize to `? super R`
in `src/main/java/com/uber/cadence/internal/sync/SyncDecisionContext.java`
#### Snippet
```java
  @Override
  public <R> R mutableSideEffect(
      String id, Class<R> resultClass, Type resultType, BiPredicate<R, R> updated, Func<R> func) {
    AtomicReference<R> unserializedResult = new AtomicReference<>();
    // As lambda below never returns Optional.empty() if there is a stored value
```

### BoundedWildcard
Can generalize to `? super R`
in `src/main/java/com/uber/cadence/internal/sync/SyncDecisionContext.java`
#### Snippet
```java
  @Override
  public <R> R mutableSideEffect(
      String id, Class<R> resultClass, Type resultType, BiPredicate<R, R> updated, Func<R> func) {
    AtomicReference<R> unserializedResult = new AtomicReference<>();
    // As lambda below never returns Optional.empty() if there is a stored value
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/com/uber/cadence/internal/sync/SyncDecisionContext.java`
#### Snippet
```java
  @Override
  public <R> R mutableSideEffect(
      String id, Class<R> resultClass, Type resultType, BiPredicate<R, R> updated, Func<R> func) {
    AtomicReference<R> unserializedResult = new AtomicReference<>();
    // As lambda below never returns Optional.empty() if there is a stored value
```

### BoundedWildcard
Can generalize to `? extends ContextPropagator`
in `src/main/java/com/uber/cadence/internal/sync/SyncDecisionContext.java`
#### Snippet
```java

  private Map<String, byte[]> extractContextsAndConvertToBytes(
      List<ContextPropagator> contextPropagators) {
    if (contextPropagators == null) {
      return null;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/com/uber/cadence/internal/sync/SyncDecisionContext.java`
#### Snippet
```java

  private <T> Promise<T> executeActivityOnce(
      String name, ActivityOptions options, Object[] args, Class<T> returnClass, Type returnType) {
    byte[] input = converter.toData(args);
    Promise<byte[]> binaryResult = executeActivityOnce(name, options, input);
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/com/uber/cadence/internal/sync/SyncDecisionContext.java`
#### Snippet
```java
      LocalActivityOptions options,
      Object[] args,
      Class<T> returnClass,
      Type returnType,
      long elapsed,
```

### BoundedWildcard
Can generalize to `? extends G`
in `src/main/java/com/uber/cadence/internal/common/OptionsUtils.java`
#### Snippet
```java

  /** Merges value from annotation and option. Option value takes precedence. */
  public static <G> G merge(G annotation, G options, Class<G> type) {
    G defaultValue = Defaults.defaultValue(type);
    if (defaultValue == null) {
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/com/uber/cadence/internal/sync/AsyncInternal.java`
#### Snippet
```java
   */
  public static <A1, A2, A3, R> Promise<R> function(
      Functions.Func3<A1, A2, A3, R> function, A1 arg1, A2 arg2, A3 arg3) {
    return execute(isAsync(function), () -> function.apply(arg1, arg2, arg3));
  }
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/com/uber/cadence/internal/sync/AsyncInternal.java`
#### Snippet
```java
   */
  public static <A1, A2, A3, A4, A5, R> Promise<R> function(
      Functions.Func5<A1, A2, A3, A4, A5, R> function,
      A1 arg1,
      A2 arg2,
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/com/uber/cadence/internal/sync/AsyncInternal.java`
#### Snippet
```java
   */
  public static <A1, A2, A3, A4, R> Promise<R> function(
      Functions.Func4<A1, A2, A3, A4, R> function, A1 arg1, A2 arg2, A3 arg3, A4 arg4) {
    return execute(isAsync(function), () -> function.apply(arg1, arg2, arg3, arg4));
  }
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/com/uber/cadence/internal/sync/AsyncInternal.java`
#### Snippet
```java
   */
  public static <A1, A2, R> Promise<R> function(
      Functions.Func2<A1, A2, R> function, A1 arg1, A2 arg2) {
    return execute(isAsync(function), () -> function.apply(arg1, arg2));
  }
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/com/uber/cadence/internal/sync/AsyncInternal.java`
#### Snippet
```java
   * @return promise that contains function result or failure
   */
  public static <R> Promise<R> function(Functions.Func<R> function) {
    return execute(isAsync(function), () -> function.apply());
  }
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/com/uber/cadence/internal/sync/AsyncInternal.java`
#### Snippet
```java
  }

  private static <R> Promise<R> execute(boolean async, Functions.Func<R> func) {
    if (async) {
      initAsyncInvocation();
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/com/uber/cadence/internal/sync/AsyncInternal.java`
#### Snippet
```java
   */
  public static <A1, A2, A3, A4, A5, A6, R> Promise<R> function(
      Functions.Func6<A1, A2, A3, A4, A5, A6, R> function,
      A1 arg1,
      A2 arg2,
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/com/uber/cadence/internal/sync/AsyncInternal.java`
#### Snippet
```java
   * @return promise that contains function result or failure
   */
  public static <A1, R> Promise<R> function(Functions.Func1<A1, R> function, A1 arg1) {
    return execute(isAsync(function), () -> function.apply(arg1));
  }
```

### BoundedWildcard
Can generalize to `? super Data`
in `src/main/java/com/uber/cadence/internal/testservice/StateMachine.java`
#### Snippet
```java

    private DynamicTransitionDestination(
        State[] expectedStates, DynamicCallback<Data, R> callback) {
      this.expectedStates = expectedStates;
      this.callback = callback;
```

### BoundedWildcard
Can generalize to `? super R`
in `src/main/java/com/uber/cadence/internal/testservice/StateMachine.java`
#### Snippet
```java

    private DynamicTransitionDestination(
        State[] expectedStates, DynamicCallback<Data, R> callback) {
      this.expectedStates = expectedStates;
      this.callback = callback;
```

### BoundedWildcard
Can generalize to `? super Data`
in `src/main/java/com/uber/cadence/internal/testservice/StateMachine.java`
#### Snippet
```java
    final Callback<Data, R> callback;

    private FixedTransitionDestination(State state, Callback<Data, R> callback) {
      this.state = state;
      this.callback = callback;
```

### BoundedWildcard
Can generalize to `? super R`
in `src/main/java/com/uber/cadence/internal/testservice/StateMachine.java`
#### Snippet
```java
    final Callback<Data, R> callback;

    private FixedTransitionDestination(State state, Callback<Data, R> callback) {
      this.state = state;
      this.callback = callback;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/com/uber/cadence/internal/worker/Poller.java`
#### Snippet
```java
  public Poller(
      String identity,
      PollTask<T> pollTask,
      ShutdownableTaskExecutor<T> taskExecutor,
      PollerOptions pollerOptions,
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/com/uber/cadence/internal/worker/Poller.java`
#### Snippet
```java
      String identity,
      PollTask<T> pollTask,
      ShutdownableTaskExecutor<T> taskExecutor,
      PollerOptions pollerOptions,
      Scope metricsScope) {
```

### BoundedWildcard
Can generalize to `? super Method`
in `src/main/java/com/uber/cadence/internal/sync/POJOActivityTaskHandler.java`
#### Snippet
```java

  private void addActivityImplementation(
      Object activity, BiFunction<Method, Object, ActivityTaskExecutor> newTaskExecutor) {
    if (activity instanceof Class) {
      throw new IllegalArgumentException("Activity object instance expected, not the class");
```

### BoundedWildcard
Can generalize to `? extends ActivityTaskExecutor`
in `src/main/java/com/uber/cadence/internal/sync/POJOActivityTaskHandler.java`
#### Snippet
```java

  private void addActivityImplementation(
      Object activity, BiFunction<Method, Object, ActivityTaskExecutor> newTaskExecutor) {
    if (activity instanceof Class) {
      throw new IllegalArgumentException("Activity object instance expected, not the class");
```

### BoundedWildcard
Can generalize to `? extends V`
in `src/main/java/com/uber/cadence/internal/sync/ActivityExecutionContextImpl.java`
#### Snippet
```java

  @Override
  public <V> Optional<V> getHeartbeatDetails(Class<V> detailsClass, Type detailsType) {
    lock.lock();
    try {
```

### BoundedWildcard
Can generalize to `? extends E`
in `src/main/java/com/uber/cadence/internal/sync/WorkflowQueueImpl.java`
#### Snippet
```java

    public MappedQueueConsumer(
        QueueConsumer<E> source, Functions.Func1<? super E, ? extends R> mapper) {
      this.source = source;
      this.mapper = mapper;
```

### BoundedWildcard
Can generalize to `? super Throwable`
in `src/main/java/com/uber/cadence/internal/sync/CompletablePromiseImpl.java`
#### Snippet
```java

  @Override
  public Promise<V> exceptionally(Functions.Func1<Throwable, ? extends V> fn) {
    return then(
        (result) -> {
```

### BoundedWildcard
Can generalize to `? super CompletablePromise`
in `src/main/java/com/uber/cadence/internal/sync/CompletablePromiseImpl.java`
#### Snippet
```java

  /** Call proc immediately if ready or register with handlers. */
  private <U> Promise<U> then(Functions.Proc1<CompletablePromise<U>> proc) {
    CompletablePromise<U> resultPromise = new CompletablePromiseImpl<>();
    if (completed) {
```

### BoundedWildcard
Can generalize to `? extends Promise`
in `src/main/java/com/uber/cadence/internal/sync/CompletablePromiseImpl.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  static Promise<Object> promiseAnyOf(Iterable<Promise<?>> promises) {
    CompletablePromise<Object> result = Workflow.newPromise();
    for (Promise<?> p : promises) {
```

### BoundedWildcard
Can generalize to `? super RuntimeException`
in `src/main/java/com/uber/cadence/internal/sync/CompletablePromiseImpl.java`
#### Snippet
```java

  @Override
  public <U> Promise<U> handle(Functions.Func2<? super V, RuntimeException, ? extends U> fn) {
    return then(
        (result) -> {
```

### BoundedWildcard
Can generalize to `? extends V`
in `src/main/java/com/uber/cadence/internal/sync/CompletablePromiseImpl.java`
#### Snippet
```java

  @Override
  public boolean completeFrom(Promise<V> source) {
    if (completed) {
      return false;
```

### BoundedWildcard
Can generalize to `? extends Promise`
in `src/main/java/com/uber/cadence/internal/sync/WorkflowRetryerInternal.java`
#### Snippet
```java
      String retryId,
      RetryOptions options,
      Functions.Func<Promise<R>> func,
      long startTime,
      long attempt) {
```

### BoundedWildcard
Can generalize to `? super Integer`
in `src/main/java/com/uber/cadence/internal/sync/WorkflowRetryerInternal.java`
#### Snippet
```java

  static <R> Promise<R> retryAsync(
      Functions.Func2<Integer, Long, Promise<R>> func, int attempt, long startTime) {

    CompletablePromise<R> funcResult = WorkflowInternal.newCompletablePromise();
```

### BoundedWildcard
Can generalize to `? super Long`
in `src/main/java/com/uber/cadence/internal/sync/WorkflowRetryerInternal.java`
#### Snippet
```java

  static <R> Promise<R> retryAsync(
      Functions.Func2<Integer, Long, Promise<R>> func, int attempt, long startTime) {

    CompletablePromise<R> funcResult = WorkflowInternal.newCompletablePromise();
```

### BoundedWildcard
Can generalize to `? extends Promise`
in `src/main/java/com/uber/cadence/internal/sync/WorkflowRetryerInternal.java`
#### Snippet
```java

  static <R> Promise<R> retryAsync(
      Functions.Func2<Integer, Long, Promise<R>> func, int attempt, long startTime) {

    CompletablePromise<R> funcResult = WorkflowInternal.newCompletablePromise();
```

### BoundedWildcard
Can generalize to `? super GsonBuilder`
in `src/main/java/com/uber/cadence/converter/JsonDataConverter.java`
#### Snippet
```java
   * @param builderInterceptor function that intercepts {@link GsonBuilder} construction.
   */
  public JsonDataConverter(Function<GsonBuilder, GsonBuilder> builderInterceptor) {
    GsonBuilder gsonBuilder =
        new GsonBuilder()
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/com/uber/cadence/internal/sync/WorkflowClientInternal.java`
#### Snippet
```java

  public static <A1, A2, A3, A4, A5, R> CompletableFuture<R> execute(
      Functions.Func5<A1, A2, A3, A4, A5, R> workflow,
      A1 arg1,
      A2 arg2,
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/com/uber/cadence/internal/sync/WorkflowClientInternal.java`
#### Snippet
```java

  public static <A1, A2, R> CompletableFuture<R> execute(
      Functions.Func2<A1, A2, R> workflow, A1 arg1, A2 arg2) {
    return execute(() -> workflow.apply(arg1, arg2));
  }
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/com/uber/cadence/internal/sync/WorkflowClientInternal.java`
#### Snippet
```java
  }

  public static <A1, R> CompletableFuture<R> execute(Functions.Func1<A1, R> workflow, A1 arg1) {
    return execute(() -> workflow.apply(arg1));
  }
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/com/uber/cadence/internal/sync/WorkflowClientInternal.java`
#### Snippet
```java

  public static <A1, A2, A3, A4, A5, A6, R> CompletableFuture<R> execute(
      Functions.Func6<A1, A2, A3, A4, A5, A6, R> workflow,
      A1 arg1,
      A2 arg2,
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/com/uber/cadence/internal/sync/WorkflowClientInternal.java`
#### Snippet
```java

  public static <A1, A2, A3, A4, R> CompletableFuture<R> execute(
      Functions.Func4<A1, A2, A3, A4, R> workflow, A1 arg1, A2 arg2, A3 arg3, A4 arg4) {
    return execute(() -> workflow.apply(arg1, arg2, arg3, arg4));
  }
```

### BoundedWildcard
Can generalize to `? extends R`
in `src/main/java/com/uber/cadence/internal/sync/WorkflowClientInternal.java`
#### Snippet
```java

  public static <A1, A2, A3, R> CompletableFuture<R> execute(
      Functions.Func3<A1, A2, A3, R> workflow, A1 arg1, A2 arg2, A3 arg3) {
    return execute(() -> workflow.apply(arg1, arg2, arg3));
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

## RuleId[id=WhileLoopSpinsOnField]
### WhileLoopSpinsOnField
`while` loop spins on field
in `src/main/java/com/uber/cadence/internal/replay/ClockDecisionContext.java`
#### Snippet
```java

  void awaitTaskCompletion(Duration duration) throws InterruptedException {
    while (!taskCompleted) {
      // This call is called from already locked object
      taskCondition.awaitNanos(duration.toNanos());
```

### WhileLoopSpinsOnField
`while` loop spins on field
in `src/main/java/com/uber/cadence/internal/worker/autoscaler/PollerAutoScaler.java`
#### Snippet
```java
              @Override
              public void run() {
                while (!shuttingDown) {
                  try {
                    Thread.sleep(coolDownTime.toMillis());
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

## RuleId[id=OptionalAssignedToNull]
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

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/uber/cadence/internal/sync/WorkflowThreadImpl.java`
#### Snippet
```java

    if (name == null) {
      name = "workflow-" + super.hashCode();
    }

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

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`executionTimeoutTimerDelay = executionTimeoutTimerDelay + backoffStartIntervalInSe...` could be simplified to 'executionTimeoutTimerDelay += backoffStartIntervalInSeconds'
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
            int executionTimeoutTimerDelay = startRequest.getExecutionStartToCloseTimeoutSeconds();
            if (backoffStartIntervalInSeconds > 0) {
              executionTimeoutTimerDelay =
                  executionTimeoutTimerDelay + backoffStartIntervalInSeconds;
            }
            ctx.addTimer(
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/uber/cadence/internal/replay/WorkflowContext.java`
#### Snippet
```java
        .getFields()
        .forEach(
            (k, v) -> {
              headerData.put(k, org.apache.thrift.TBaseHelper.byteBufferToByteArray(v));
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/uber/cadence/internal/replay/WorkflowContext.java`
#### Snippet
```java
        .getIndexedFields()
        .forEach(
            (k, v) -> {
              current.put(k, v);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/uber/cadence/internal/worker/ActivityWorker.java`
#### Snippet
```java
          .getFields()
          .forEach(
              (k, v) -> {
                headerData.put(k, org.apache.thrift.TBaseHelper.byteBufferToByteArray(v));
              });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/uber/cadence/internal/common/InternalUtils.java`
#### Snippet
```java
    return awaitTermination(
        timeoutMillis,
        () -> {
          s.awaitTermination(timeoutMillis, TimeUnit.MILLISECONDS);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/uber/cadence/internal/common/InternalUtils.java`
#### Snippet
```java
    Map<String, ByteBuffer> mapOfByteBuffer = new HashMap<>();
    memo.forEach(
        (key, value) -> {
          mapOfByteBuffer.put(key, ByteBuffer.wrap(converter.toData(value)));
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/uber/cadence/internal/common/InternalUtils.java`
#### Snippet
```java
    Map<String, ByteBuffer> mapOfByteBuffer = new HashMap<>();
    searchAttributes.forEach(
        (key, value) -> {
          mapOfByteBuffer.put(key, ByteBuffer.wrap(converter.toData(value)));
        });
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `noopHistogram` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/com/uber/cadence/internal/metrics/NoopScope.java`
#### Snippet
```java
  private static Gauge noopGauge;
  private static Timer noopTimer;
  private static Histogram noopHistogram;

  @Override
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `noopCounter` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/com/uber/cadence/internal/metrics/NoopScope.java`
#### Snippet
```java
public final class NoopScope implements Scope {
  private static Scope noopScope;
  private static Counter noopCounter;
  private static Gauge noopGauge;
  private static Timer noopTimer;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `noopTimer` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/com/uber/cadence/internal/metrics/NoopScope.java`
#### Snippet
```java
  private static Counter noopCounter;
  private static Gauge noopGauge;
  private static Timer noopTimer;
  private static Histogram noopHistogram;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `noopGauge` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/com/uber/cadence/internal/metrics/NoopScope.java`
#### Snippet
```java
  private static Scope noopScope;
  private static Counter noopCounter;
  private static Gauge noopGauge;
  private static Timer noopTimer;
  private static Histogram noopHistogram;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `cache` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/com/uber/cadence/worker/WorkerFactory.java`
#### Snippet
```java
  private Poller<PollForDecisionTaskResponse> stickyPoller;
  private PollDecisionTaskDispatcher dispatcher;
  private DeciderCache cache;

  private State state = State.Initial;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `stickyPoller` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/com/uber/cadence/worker/WorkerFactory.java`
#### Snippet
```java
  private final WorkerFactoryOptions factoryOptions;

  private Poller<PollForDecisionTaskResponse> stickyPoller;
  private PollDecisionTaskDispatcher dispatcher;
  private DeciderCache cache;
```

## RuleId[id=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `src/main/java/com/uber/cadence/internal/replay/HistoryEventHandler.java`
#### Snippet
```java
  void handleActivityTaskTimedOut(HistoryEvent event);

  void handleChildWorkflowExecutionCancelRequested(HistoryEvent event);

  void handleChildWorkflowExecutionCanceled(HistoryEvent event);
```

### EmptyMethod
The method is empty
in `src/main/java/com/uber/cadence/internal/sync/TestActivityEnvironmentInternal.java`
#### Snippet
```java

    @Override
    public void GetClusterInfo(AsyncMethodCallback resultHandler) throws TException {}

    @Override
```

### EmptyMethod
The method is empty
in `src/main/java/com/uber/cadence/internal/sync/TestActivityEnvironmentInternal.java`
#### Snippet
```java

    @Override
    public void ListTaskListPartitions(
        ListTaskListPartitionsRequest request, AsyncMethodCallback resultHandler)
        throws TException {}
```

### EmptyMethod
The method is empty
in `src/main/java/com/uber/cadence/internal/sync/TestActivityEnvironmentInternal.java`
#### Snippet
```java

    @Override
    public void RefreshWorkflowTasks(
        RefreshWorkflowTasksRequest request, AsyncMethodCallback resultHandler) throws TException {}

```

### EmptyMethod
The method is empty
in `src/main/java/com/uber/cadence/internal/sync/TestWorkflowEnvironmentInternal.java`
#### Snippet
```java

    @Override
    public void GetClusterInfo(AsyncMethodCallback resultHandler) throws TException {}

    @Override
```

### EmptyMethod
The method is empty
in `src/main/java/com/uber/cadence/internal/sync/TestWorkflowEnvironmentInternal.java`
#### Snippet
```java

    @Override
    public void ListTaskListPartitions(
        ListTaskListPartitionsRequest request, AsyncMethodCallback resultHandler)
        throws TException {}
```

### EmptyMethod
The method is empty
in `src/main/java/com/uber/cadence/internal/sync/TestWorkflowEnvironmentInternal.java`
#### Snippet
```java

    @Override
    public void RefreshWorkflowTasks(
        RefreshWorkflowTasksRequest request, AsyncMethodCallback resultHandler) throws TException {}

```

### EmptyMethod
The method is empty
in `src/main/java/com/uber/cadence/internal/sync/WorkflowRunnable.java`
#### Snippet
```java
  }

  public void cancel(String reason) {}

  public boolean isDone() {
```

### EmptyMethod
The method is empty
in `src/main/java/com/uber/cadence/internal/sync/WorkflowRunnable.java`
#### Snippet
```java
  }

  public void close() {}

  public void processSignal(String signalName, byte[] input, long eventId) {
```

### EmptyMethod
The method is empty
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowService.java`
#### Snippet
```java

  @Override
  public void ResetWorkflowExecution(
      ResetWorkflowExecutionRequest resetRequest, AsyncMethodCallback resultHandler)
      throws TException {}
```

### EmptyMethod
The method is empty
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowService.java`
#### Snippet
```java

  @Override
  public void ListArchivedWorkflowExecutions(
      ListArchivedWorkflowExecutionsRequest listRequest, AsyncMethodCallback resultHandler)
      throws TException {}
```

### EmptyMethod
The method is empty
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowService.java`
#### Snippet
```java

  @Override
  public void GetClusterInfo(AsyncMethodCallback resultHandler) throws TException {}

  @Override
```

### EmptyMethod
The method is empty
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowService.java`
#### Snippet
```java

  @Override
  public void ListTaskListPartitions(
      ListTaskListPartitionsRequest request, AsyncMethodCallback resultHandler) throws TException {}

```

### EmptyMethod
The method is empty
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowService.java`
#### Snippet
```java

  @Override
  public void RefreshWorkflowTasks(
      RefreshWorkflowTasksRequest request, AsyncMethodCallback resultHandler) throws TException {}

```

### EmptyMethod
The method is empty
in `src/main/java/com/uber/cadence/serviceclient/WorkflowServiceTChannel.java`
#### Snippet
```java

  @Override
  public void GetClusterInfo(AsyncMethodCallback resultHandler) throws TException {}

  @Override
```

### EmptyMethod
The method is empty
in `src/main/java/com/uber/cadence/serviceclient/WorkflowServiceTChannel.java`
#### Snippet
```java

  @Override
  public void ListTaskListPartitions(
      ListTaskListPartitionsRequest request, AsyncMethodCallback resultHandler) throws TException {}

```

### EmptyMethod
The method is empty
in `src/main/java/com/uber/cadence/serviceclient/WorkflowServiceTChannel.java`
#### Snippet
```java

  @Override
  public void RefreshWorkflowTasks(
      RefreshWorkflowTasksRequest request, AsyncMethodCallback resultHandler) throws TException {}

```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/com/uber/cadence/internal/replay/ClockDecisionContext.java`
#### Snippet
```java
  private final DataConverter dataConverter;
  private final Condition taskCondition;
  private boolean taskCompleted = false;
  private final Map<String, Integer> versionMap = new HashMap<>();

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/uber/cadence/client/QueryOptions.java`
#### Snippet
```java
  public static final class Builder {

    private QueryRejectCondition queryRejectCondition = null; // default to empty condition
    private QueryConsistencyLevel queryConsistencyLevel =
        QueryConsistencyLevel.EVENTUAL; // default to eventual consistent query
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/com/uber/cadence/internal/sync/WorkflowClientInternal.java`
#### Snippet
```java
  private final IWorkflowService workflowService;
  private final WorkflowClientOptions clientOptions;
  private static boolean emittingClientVersion = false;

  /**
```

## RuleId[id=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `CheckedExceptionWrapper` does not end with 'Exception'
in `src/main/java/com/uber/cadence/internal/common/CheckedExceptionWrapper.java`
#### Snippet
```java
 * com.uber.cadence.activity.Activity#wrap(Exception)} inside an activity code instead.
 */
public final class CheckedExceptionWrapper extends RuntimeException {

  private static final Field causeField;
```

### ExceptionNameDoesntEndWithException
Exception class name `SimulatedTimeoutExceptionInternal` does not end with 'Exception'
in `src/main/java/com/uber/cadence/internal/sync/SimulatedTimeoutExceptionInternal.java`
#### Snippet
```java
 * difference is that the details are in a serialized form.
 */
final class SimulatedTimeoutExceptionInternal extends RuntimeException {

  private final TimeoutType timeoutType;
```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `src/main/java/com/uber/cadence/internal/replay/ReplayDecisionTaskHandler.java`
#### Snippet
```java
      // timeout. This is to avoid spin on the failed decision task.
      if (decisionTask.getAttempt() > 0) {
        if (e instanceof Error) {
          throw (Error) e;
        }
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/com/uber/cadence/internal/worker/Throttler.java`
#### Snippet
```java
      throw new IllegalArgumentException("0 or negative rateIntervalMilliseconds");
    }
    synchronized (this) {
      this.rateIntervalMilliseconds = rateIntervalMilliseconds;
      setMaxRatePerSecond(maxRatePerSecond);
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/com/uber/cadence/worker/Worker.java`
#### Snippet
```java
        String.class,
        String.class,
        new Object[] {});
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/com/uber/cadence/internal/sync/WorkflowThreadImpl.java`
#### Snippet
```java
        return thread.getStackTrace();
      }
      return new StackTraceElement[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
      // and receiver side will see null for the Data field
      // since we already know p is not null, Data field must be an empty byte array
      return new byte[0];
    }
    return byteStringToArray(t.getData());
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/com/uber/cadence/internal/sync/SyncWorkflow.java`
#### Snippet
```java
  public byte[] query(WorkflowQuery query) {
    if (WorkflowClient.QUERY_TYPE_REPLAY_ONLY.equals(query.getQueryType())) {
      return new byte[] {};
    }
    if (WorkflowClient.QUERY_TYPE_STACK_TRACE.equals(query.getQueryType())) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/com/uber/cadence/converter/CustomThrowableTypeAdapter.java`
#### Snippet
```java
    JsonElement jsonStackTrace = object.get("stackTrace");
    if (jsonStackTrace == null) {
      return new StackTraceElement[0];
    }
    String stackTrace = jsonStackTrace.getAsString();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/com/uber/cadence/converter/CustomThrowableTypeAdapter.java`
#### Snippet
```java
    String stackTrace = jsonStackTrace.getAsString();
    if (stackTrace == null || stackTrace.isEmpty()) {
      return new StackTraceElement[0];
    }
    try {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/com/uber/cadence/converter/CustomThrowableTypeAdapter.java`
#### Snippet
```java
        log.warn("Failed to parse stack trace: " + stackTrace);
      }
      return new StackTraceElement[0];
    }
  }
```

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `failureCause` of exception class
in `src/main/java/com/uber/cadence/workflow/CancelExternalWorkflowException.java`
#### Snippet
```java
public final class CancelExternalWorkflowException extends WorkflowOperationException {

  private SignalExternalWorkflowExecutionFailedCause failureCause;

  private WorkflowExecution signaledExecution;
```

### NonFinalFieldOfException
Non-final field `signaledExecution` of exception class
in `src/main/java/com/uber/cadence/workflow/CancelExternalWorkflowException.java`
#### Snippet
```java
  private SignalExternalWorkflowExecutionFailedCause failureCause;

  private WorkflowExecution signaledExecution;

  public CancelExternalWorkflowException(
```

### NonFinalFieldOfException
Non-final field `eventId` of exception class
in `src/main/java/com/uber/cadence/workflow/WorkflowOperationException.java`
#### Snippet
```java
public abstract class WorkflowOperationException extends RuntimeException {

  private long eventId;

  protected WorkflowOperationException(String message, long eventId) {
```

### NonFinalFieldOfException
Non-final field `failureCause` of exception class
in `src/main/java/com/uber/cadence/workflow/SignalExternalWorkflowException.java`
#### Snippet
```java
public final class SignalExternalWorkflowException extends WorkflowOperationException {

  private SignalExternalWorkflowExecutionFailedCause failureCause;

  private WorkflowExecution signaledExecution;
```

### NonFinalFieldOfException
Non-final field `signaledExecution` of exception class
in `src/main/java/com/uber/cadence/workflow/SignalExternalWorkflowException.java`
#### Snippet
```java
  private SignalExternalWorkflowExecutionFailedCause failureCause;

  private WorkflowExecution signaledExecution;

  public SignalExternalWorkflowException(
```

### NonFinalFieldOfException
Non-final field `backoff` of exception class
in `src/main/java/com/uber/cadence/workflow/ActivityFailureException.java`
#### Snippet
```java
public final class ActivityFailureException extends ActivityException {
  private int attempt;
  private Duration backoff;

  public ActivityFailureException(
```

### NonFinalFieldOfException
Non-final field `attempt` of exception class
in `src/main/java/com/uber/cadence/workflow/ActivityFailureException.java`
#### Snippet
```java
 */
public final class ActivityFailureException extends ActivityException {
  private int attempt;
  private Duration backoff;

```

### NonFinalFieldOfException
Non-final field `failureCause` of exception class
in `src/main/java/com/uber/cadence/workflow/StartChildWorkflowFailedException.java`
#### Snippet
```java
public final class StartChildWorkflowFailedException extends ChildWorkflowException {

  private ChildWorkflowExecutionFailedCause failureCause;

  public StartChildWorkflowFailedException(
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

## RuleId[id=OptionalGetWithoutIsPresent]
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
      ChildWorkflowExecutionTimedOutEventAttributes a =
          new ChildWorkflowExecutionTimedOutEventAttributes()
              .setInitiatedEventId(parentChildInitiatedEventId.getAsLong())
              .setTimeoutType(TimeoutType.START_TO_CLOSE)
              .setWorkflowType(startRequest.getWorkflowType())
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
      ChildWorkflowExecutionStartedEventAttributes a =
          new ChildWorkflowExecutionStartedEventAttributes()
              .setInitiatedEventId(parentChildInitiatedEventId.getAsLong())
              .setWorkflowExecution(getExecutionId().getExecution())
              .setDomain(getExecutionId().getDomain())
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

## RuleId[id=ConstantValue]
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
Result of `VERSION_MARKER_NAME.equals(name)` is always 'false'
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

## RuleId[id=IOResource]
### IOResource
'PrintWriter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/com/uber/cadence/internal/sync/WorkflowThreadImpl.java`
#### Snippet
```java
    StackTraceElement[] st = task.getStackTrace();
    StringWriter sw = new StringWriter();
    PrintWriter pw = new PrintWriter(sw);
    for (StackTraceElement se : st) {
      pw.println("\tat " + se);
```

### IOResource
'DataOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/com/uber/cadence/internal/testservice/ActivityId.java`
#### Snippet
```java
  public byte[] toBytes() throws InternalServiceError {
    ByteArrayOutputStream bout = new ByteArrayOutputStream();
    DataOutputStream out = new DataOutputStream(bout);
    try {
      out.writeUTF(executionId.getDomain());
```

### IOResource
'DataInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/com/uber/cadence/internal/testservice/ActivityId.java`
#### Snippet
```java
  static ActivityId fromBytes(byte[] serialized) throws InternalServiceError {
    ByteArrayInputStream bin = new ByteArrayInputStream(serialized);
    DataInputStream in = new DataInputStream(bin);
    try {
      String domain = in.readUTF();
```

### IOResource
'PrintWriter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/com/uber/cadence/converter/CustomThrowableTypeAdapter.java`
#### Snippet
```java
  public void write(JsonWriter jsonWriter, T throwable) throws IOException {
    StringWriter sw = new StringWriter();
    PrintWriter pw = new PrintWriter(sw);
    StackTraceElement[] trace = throwable.getStackTrace();
    for (StackTraceElement element : trace) {
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
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
          ctx -> {
            workflow.action(StateMachines.Action.START, ctx, startRequest, 0);
            if (signalWithStartSignal.isPresent()) {
              addExecutionSignaledEvent(ctx, signalWithStartSignal.get());
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
in `src/main/java/com/uber/cadence/internal/sync/WorkflowClientInternal.java`
#### Snippet
```java
      String workflowId, Optional<String> runId, Optional<String> workflowType) {
    WorkflowExecution execution = new WorkflowExecution().setWorkflowId(workflowId);
    if (runId.isPresent()) {
      execution.setRunId(runId.get());
    }
```

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `statusErrorMessage` may be 'static'
in `src/main/java/com/uber/cadence/worker/WorkerFactory.java`
#### Snippet
```java
  private State state = State.Initial;

  private final String statusErrorMessage =
      "attempted to %s while in %s state. Acceptable States: %s";
  private static final Logger log = LoggerFactory.getLogger(WorkerFactory.class);
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `MetricsTag` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/internal/metrics/MetricsTag.java`
#### Snippet
```java
package com.uber.cadence.internal.metrics;

public class MetricsTag {
  public static final String ACTIVITY_TYPE = "ActivityType";
  public static final String DOMAIN = "Domain";
```

### UtilityClassWithoutPrivateConstructor
Class `LoggerTag` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/internal/logging/LoggerTag.java`
#### Snippet
```java
package com.uber.cadence.internal.logging;

public class LoggerTag {
  public static final String ACTIVITY_ID = "ActivityID";
  public static final String ACTIVITY_TYPE = "ActivityType";
```

### UtilityClassWithoutPrivateConstructor
Class `ServiceMethod` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/internal/metrics/ServiceMethod.java`
#### Snippet
```java
package com.uber.cadence.internal.metrics;

public class ServiceMethod {
  public static final String DEPRECATE_DOMAIN =
      MetricsType.CADENCE_METRICS_PREFIX + "DeprecateDomain";
```

### UtilityClassWithoutPrivateConstructor
Class `MetricsType` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/internal/metrics/MetricsType.java`
#### Snippet
```java
package com.uber.cadence.internal.metrics;

public class MetricsType {

  public static final String CADENCE_METRICS_PREFIX = "cadence-";
```

### UtilityClassWithoutPrivateConstructor
Class `Helpers` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/Helpers.java`
#### Snippet
```java
import com.google.protobuf.util.Timestamps;

class Helpers {

  static long toInt64Value(Int64Value v) {
```

### UtilityClassWithoutPrivateConstructor
Class `MetricsTagValue` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/internal/metrics/MetricsTagValue.java`
#### Snippet
```java
package com.uber.cadence.internal.metrics;

public class MetricsTagValue {
  public static final String REQUEST_TYPE_NORMAL = "normal";
  public static final String REQUEST_TYPE_LONG_POLL = "long-poll";
```

### UtilityClassWithoutPrivateConstructor
Class `WorkflowReplayer` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/testing/WorkflowReplayer.java`
#### Snippet
```java

/** Replays a workflow given its history. Useful for backwards compatibility testing. */
public final class WorkflowReplayer {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `TypeMapper` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
import java.util.Map;

class TypeMapper {

  static byte[] payload(com.uber.cadence.api.v1.Payload t) {
```

### UtilityClassWithoutPrivateConstructor
Class `HistoryMapper` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
import java.util.List;

class HistoryMapper {

  static History history(com.uber.cadence.api.v1.History t) {
```

### UtilityClassWithoutPrivateConstructor
Class `TypeMapper` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/internal/compatibility/proto/TypeMapper.java`
#### Snippet
```java
import java.util.Map;

class TypeMapper {

  static BadBinaryInfo badBinaryInfo(com.uber.cadence.BadBinaryInfo t) {
```

### UtilityClassWithoutPrivateConstructor
Class `ErrorType` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/internal/errors/ErrorType.java`
#### Snippet
```java
package com.uber.cadence.internal.errors;

public class ErrorType {
  public static final String UNKNOWN_WORKFLOW_TYPE = "Unknown workflow type";
}
```

### UtilityClassWithoutPrivateConstructor
Class `Version` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/internal/Version.java`
#### Snippet
```java
 * or behavior change
 */
public class Version {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `EnumMapper` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/internal/compatibility/proto/EnumMapper.java`
#### Snippet
```java
import com.uber.cadence.api.v1.WorkflowIdReusePolicy;

class EnumMapper {

  static TaskListKind taskListKind(com.uber.cadence.TaskListKind t) {
```

### UtilityClassWithoutPrivateConstructor
Class `WorkflowExecutionUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/internal/common/WorkflowExecutionUtils.java`
#### Snippet
```java
 * @author fateev
 */
public class WorkflowExecutionUtils {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `StateMachines` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/internal/testservice/StateMachines.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

class StateMachines {

  private static final Logger log = LoggerFactory.getLogger(StateMachines.class);
```

### UtilityClassWithoutPrivateConstructor
Class `EnumMapper` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/EnumMapper.java`
#### Snippet
```java
import com.uber.cadence.WorkflowIdReusePolicy;

class EnumMapper {

  public static TaskListKind taskListKind(com.uber.cadence.api.v1.TaskListKind t) {
```

### UtilityClassWithoutPrivateConstructor
Class `WorkerShutDownHandler` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/internal/worker/WorkerShutDownHandler.java`
#### Snippet
```java
import java.util.concurrent.TimeUnit;

public class WorkerShutDownHandler {

  private static final List<WorkerFactory> workerFactories = new ArrayList<>();
```

### UtilityClassWithoutPrivateConstructor
Class `RequestMapper` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
import java.util.List;

public class RequestMapper {

  private static final String DomainUpdateDescriptionField = "description";
```

### UtilityClassWithoutPrivateConstructor
Class `Helpers` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/internal/compatibility/proto/Helpers.java`
#### Snippet
```java
import java.util.Map;

class Helpers {

  static DoubleValue fromDoubleValue(double v) {
```

### UtilityClassWithoutPrivateConstructor
Class `ErrorMapper` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/ErrorMapper.java`
#### Snippet
```java
import org.apache.thrift.TException;

public class ErrorMapper {

  public static TException Error(StatusRuntimeException ex) {
```

### UtilityClassWithoutPrivateConstructor
Class `ResponseMapper` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/ResponseMapper.java`
#### Snippet
```java
import com.uber.cadence.api.v1.WorkflowQuery;

public class ResponseMapper {

  public static StartWorkflowExecutionResponse startWorkflowExecutionResponse(
```

### UtilityClassWithoutPrivateConstructor
Class `WorkflowUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/workflow/WorkflowUtils.java`
#### Snippet
```java
import java.nio.ByteBuffer;

public class WorkflowUtils {
  private static final DataConverter jsonConverter = JsonDataConverter.getInstance();

```

### UtilityClassWithoutPrivateConstructor
Class `DecisionMapper` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/internal/compatibility/proto/DecisionMapper.java`
#### Snippet
```java
import java.util.List;

class DecisionMapper {

  static List<Decision> decisionArray(List<com.uber.cadence.Decision> t) {
```

### UtilityClassWithoutPrivateConstructor
Class `ContextThreadLocal` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/cadence/internal/context/ContextThreadLocal.java`
#### Snippet
```java

/** This class holds the current set of context propagators */
public class ContextThreadLocal {

  private static WorkflowThreadLocal<List<ContextPropagator>> contextPropagators =
```

## RuleId[id=UnnecessarySemicolon]
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

## RuleId[id=DataFlowIssue]
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
      request.setResult(convertedResult);
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

## RuleId[id=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains array `byte[]`
in `src/main/java/com/uber/cadence/internal/replay/ClockDecisionContext.java`
#### Snippet
```java
   * @return the latest value returned by func
   */
  Optional<byte[]> mutableSideEffect(
      String id, DataConverter converter, Func1<Optional<byte[]>, Optional<byte[]>> func) {
    decisions.addAllMissingVersionMarker(false, Optional.empty());
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `src/main/java/com/uber/cadence/internal/replay/ClockDecisionContext.java`
#### Snippet
```java
   */
  Optional<byte[]> mutableSideEffect(
      String id, DataConverter converter, Func1<Optional<byte[]>, Optional<byte[]>> func) {
    decisions.addAllMissingVersionMarker(false, Optional.empty());
    final MarkerHandler.HandleResult results = mutableSideEffectHandler.handle(id, converter, func);
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `src/main/java/com/uber/cadence/internal/replay/ClockDecisionContext.java`
#### Snippet
```java
   */
  Optional<byte[]> mutableSideEffect(
      String id, DataConverter converter, Func1<Optional<byte[]>, Optional<byte[]>> func) {
    decisions.addAllMissingVersionMarker(false, Optional.empty());
    final MarkerHandler.HandleResult results = mutableSideEffectHandler.handle(id, converter, func);
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `src/main/java/com/uber/cadence/internal/sync/DeterministicRunnerImpl.java`
#### Snippet
```java

    @Override
    public Optional<byte[]> mutableSideEffect(
        String id, DataConverter converter, Func1<Optional<byte[]>, Optional<byte[]>> func) {
      return func.apply(Optional.empty());
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `src/main/java/com/uber/cadence/internal/sync/DeterministicRunnerImpl.java`
#### Snippet
```java
    @Override
    public Optional<byte[]> mutableSideEffect(
        String id, DataConverter converter, Func1<Optional<byte[]>, Optional<byte[]>> func) {
      return func.apply(Optional.empty());
    }
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `src/main/java/com/uber/cadence/internal/sync/DeterministicRunnerImpl.java`
#### Snippet
```java
    @Override
    public Optional<byte[]> mutableSideEffect(
        String id, DataConverter converter, Func1<Optional<byte[]>, Optional<byte[]>> func) {
      return func.apply(Optional.empty());
    }
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `src/main/java/com/uber/cadence/internal/replay/MarkerHandler.java`
#### Snippet
```java
  }

  private Optional<byte[]> getMarkerDataFromHistory(
      long eventId, String markerId, int expectedAcccessCount, DataConverter converter) {
    Optional<HistoryEvent> event = decisions.getOptionalDecisionEvent(eventId);
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `src/main/java/com/uber/cadence/internal/replay/MarkerHandler.java`
#### Snippet
```java
    private boolean isNewlyStored;

    HandleResult(final Optional<byte[]> storedData, final boolean isNewlyStored) {
      this.storedData = storedData;
      this.isNewlyStored = isNewlyStored;
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `src/main/java/com/uber/cadence/internal/replay/MarkerHandler.java`
#### Snippet
```java

  static final class HandleResult {
    private Optional<byte[]> storedData;
    private boolean isNewlyStored;

```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `src/main/java/com/uber/cadence/internal/replay/MarkerHandler.java`
#### Snippet
```java
   */
  HandleResult handle(
      String id, DataConverter converter, Func1<Optional<byte[]>, Optional<byte[]>> func) {
    MarkerResult result = mutableMarkerResults.get(id);
    Optional<byte[]> stored;
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `src/main/java/com/uber/cadence/internal/replay/MarkerHandler.java`
#### Snippet
```java
   */
  HandleResult handle(
      String id, DataConverter converter, Func1<Optional<byte[]>, Optional<byte[]>> func) {
    MarkerResult result = mutableMarkerResults.get(id);
    Optional<byte[]> stored;
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `src/main/java/com/uber/cadence/internal/replay/MarkerHandler.java`
#### Snippet
```java
      String id, DataConverter converter, Func1<Optional<byte[]>, Optional<byte[]>> func) {
    MarkerResult result = mutableMarkerResults.get(id);
    Optional<byte[]> stored;
    if (result == null) {
      stored = Optional.empty();
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `src/main/java/com/uber/cadence/internal/replay/MarkerHandler.java`
#### Snippet
```java

    if (replayContext.isReplaying()) {
      Optional<byte[]> data = getMarkerDataFromHistory(eventId, id, accessCount, converter);
      if (data.isPresent()) {
        // Need to insert marker to ensure that eventId is incremented
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `src/main/java/com/uber/cadence/internal/replay/MarkerHandler.java`
#### Snippet
```java
      return new HandleResult(stored, false);
    }
    Optional<byte[]> toStore = func.apply(stored);
    if (toStore.isPresent()) {
      byte[] data = toStore.get();
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `src/main/java/com/uber/cadence/internal/replay/MarkerHandler.java`
#### Snippet
```java
    }

    public Optional<byte[]> getStoredData() {
      return storedData;
    }
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `src/main/java/com/uber/cadence/internal/sync/SyncDecisionContext.java`
#### Snippet
```java
    // As lambda below never returns Optional.empty() if there is a stored value
    // it is safe to call get on mutableSideEffect result.
    Optional<byte[]> optionalBytes =
        context.mutableSideEffect(
            id,
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `src/main/java/com/uber/cadence/internal/replay/DecisionContextImpl.java`
#### Snippet
```java

  @Override
  public Optional<byte[]> mutableSideEffect(
      String id, DataConverter converter, Func1<Optional<byte[]>, Optional<byte[]>> func) {
    return workflowClock.mutableSideEffect(id, converter, func);
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `src/main/java/com/uber/cadence/internal/replay/DecisionContextImpl.java`
#### Snippet
```java
  @Override
  public Optional<byte[]> mutableSideEffect(
      String id, DataConverter converter, Func1<Optional<byte[]>, Optional<byte[]>> func) {
    return workflowClock.mutableSideEffect(id, converter, func);
  }
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `src/main/java/com/uber/cadence/internal/replay/DecisionContextImpl.java`
#### Snippet
```java
  @Override
  public Optional<byte[]> mutableSideEffect(
      String id, DataConverter converter, Func1<Optional<byte[]>, Optional<byte[]>> func) {
    return workflowClock.mutableSideEffect(id, converter, func);
  }
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `src/main/java/com/uber/cadence/internal/replay/DecisionContext.java`
#### Snippet
```java
  void continueAsNewOnCompletion(ContinueAsNewWorkflowExecutionParameters parameters);

  Optional<byte[]> mutableSideEffect(
      String id, DataConverter dataConverter, Func1<Optional<byte[]>, Optional<byte[]>> func);

```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `src/main/java/com/uber/cadence/internal/replay/DecisionContext.java`
#### Snippet
```java

  Optional<byte[]> mutableSideEffect(
      String id, DataConverter dataConverter, Func1<Optional<byte[]>, Optional<byte[]>> func);

  /**
```

### OptionalContainsCollection
'Optional' contains array `byte[]`
in `src/main/java/com/uber/cadence/internal/replay/DecisionContext.java`
#### Snippet
```java

  Optional<byte[]> mutableSideEffect(
      String id, DataConverter dataConverter, Func1<Optional<byte[]>, Optional<byte[]>> func);

  /**
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/uber/cadence/internal/sync/WorkflowRunnable.java`
#### Snippet
```java
  public void fireTimers() {
    if (context.hasTimersToFire()) {
      context.getRunner().executeInWorkflowThread("timers callback", () -> context.fireTimers());
    }
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowMutableStateImpl.java`
#### Snippet
```java
                  () -> {
                    try {
                      update(ctx1 -> scheduleDecision(ctx1));
                    } catch (EntityNotExistsError e) {
                      // Expected as timers are not removed
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/uber/cadence/internal/sync/AsyncInternal.java`
#### Snippet
```java
   */
  public static <R> Promise<R> function(Functions.Func<R> function) {
    return execute(isAsync(function), () -> function.apply());
  }

```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'workflowType' in a Serializable class
in `src/main/java/com/uber/cadence/client/WorkflowException.java`
#### Snippet
```java

  private final WorkflowExecution execution;
  private final Optional<String> workflowType;

  protected WorkflowException(
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'details' in a Serializable class
in `src/main/java/com/uber/cadence/testing/SimulatedTimeoutException.java`
#### Snippet
```java
  private final TimeoutType timeoutType;

  private final Object details;

  /**
```

## RuleId[id=CatchMayIgnoreException]
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

## RuleId[id=ProtectedMemberInFinalClass]
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
in `src/main/java/com/uber/cadence/worker/ShadowingWorker.java`
#### Snippet
```java
  }

  protected void startShadowingWorkflow() throws Exception {
    TSerializer serializer = new TSerializer(new TSimpleJSONProtocol.Factory());
    WorkflowParams params =
```

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

## RuleId[id=UnnecessaryToStringCall]
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

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/main/java/com/uber/cadence/internal/sync/DeterministicRunnerImpl.java`
#### Snippet
```java
  @Override
  @SuppressWarnings("unchecked")
  public Object getExitValue() {
    lock.lock();
    try {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/com/uber/cadence/internal/sync/WorkflowInvocationHandler.java`
#### Snippet
```java
      invocationContext.set(new ExecuteWorkflowInvocationHandler());
    } else if (type == InvocationType.SIGNAL_WITH_START) {
      @SuppressWarnings("unchecked")
      SignalWithStartBatchRequest batch = (SignalWithStartBatchRequest) value;
      invocationContext.set(new SignalWithStartWorkflowInvocationHandler(batch));
    } else {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/com/uber/cadence/internal/sync/WorkflowInvocationHandler.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  static <R> R getAsyncInvocationResult(Class<R> resultClass) {
    SpecificInvocationHandler invocation = invocationContext.get();
    if (invocation == null) {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowService.java`
#### Snippet
```java
  @SuppressWarnings("unchecked") // Generator ignores that AsyncMethodCallback is generic
  @Override
  public void GetWorkflowExecutionHistoryWithTimeout(
      GetWorkflowExecutionHistoryRequest getRequest,
      AsyncMethodCallback resultHandler,
```

### RedundantSuppression
Redundant suppression
in `src/main/java/com/uber/cadence/serviceclient/WorkflowServiceTChannel.java`
#### Snippet
```java
  @SuppressWarnings({"unchecked", "FutureReturnValueIgnored"})
  @Override
  public void GetWorkflowExecutionHistoryWithTimeout(
      GetWorkflowExecutionHistoryRequest getRequest,
      AsyncMethodCallback resultHandler,
```

### RedundantSuppression
Redundant suppression
in `src/main/java/com/uber/cadence/serviceclient/WorkflowServiceTChannel.java`
#### Snippet
```java
  @SuppressWarnings({"unchecked", "FutureReturnValueIgnored"})
  @Override
  public void GetWorkflowExecutionHistory(
      GetWorkflowExecutionHistoryRequest getRequest, AsyncMethodCallback resultHandler) {

```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
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

  protected WorkflowException(
      String message, WorkflowExecution execution, Optional<String> workflowType, Throwable cause) {
    super(getMessage(message, execution, workflowType), cause);
    this.execution = execution;
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
`Optional` used as type for field 'storedData'
in `src/main/java/com/uber/cadence/internal/replay/MarkerHandler.java`
#### Snippet
```java

  static final class HandleResult {
    private Optional<byte[]> storedData;
    private boolean isNewlyStored;

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
`Optional` used as type for parameter 'workflowId'
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowStore.java`
#### Snippet
```java
  void getDiagnostics(StringBuilder result);

  List<WorkflowExecutionInfo> listWorkflows(WorkflowState state, Optional<String> workflowId);

  void close();
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

  private static byte[] getResultFromCloseEvent(
      WorkflowExecution workflowExecution, Optional<String> workflowType, HistoryEvent closeEvent) {
    if (closeEvent == null) {
      throw new IllegalStateException("Workflow is still running");
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
in `src/main/java/com/uber/cadence/client/WorkflowServiceException.java`
#### Snippet
```java

  public WorkflowServiceException(
      WorkflowExecution execution, Optional<String> workflowType, Throwable failure) {
    super(null, execution, workflowType, CheckedExceptionWrapper.unwrap(failure));
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

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/cadence/internal/common/LocalActivityMarkerData.java`
#### Snippet
```java
    this.result = result;
    if (headers == null) {
      System.out.println("test");
    }
  }
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

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/uber/cadence/internal/worker/PollTaskExecutor.java`
#### Snippet
```java
    taskExecutor.setThreadFactory(
        new ExecutorThreadFactory(
            options.getPollerOptions().getPollThreadNamePrefix().replaceFirst("Poller", "Executor"),
            options.getPollerOptions().getUncaughtExceptionHandler()));
    taskExecutor.setRejectedExecutionHandler(new BlockCallerPolicy());
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/uber/cadence/converter/CustomThrowableTypeAdapter.java`
#### Snippet
```java
    try {
      @SuppressWarnings("StringSplitter")
      String[] lines = stackTrace.split("\r\n|\n");
      StackTraceElement[] result = new StackTraceElement[lines.length];
      for (int i = 0; i < lines.length; i++) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/uber/cadence/internal/common/WorkflowExecutionUtils.java`
#### Snippet
```java
        String value = entry.getValue().getAsString();
        String replacement = "\n" + stackIndentation;
        String fixed = value.replaceAll("\\n", replacement);
        entry.setValue(new JsonPrimitive(fixed));
        continue;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/uber/cadence/internal/common/WorkflowExecutionUtils.java`
#### Snippet
```java
          // Thus indenting the pretty printed JSON through regexp :(.
          String replacement = "\n" + indentation + INDENTATION;
          details = details.replaceAll("\\n|\\\\n", replacement);
          result.append(details);
          continue;
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `com.uber.m3.tally` is unnecessary, and can be replaced with an import
in `src/main/java/com/uber/cadence/internal/metrics/NoopScope.java`
#### Snippet
```java
  @Override
  @SuppressWarnings("deprecation")
  public Histogram histogram(String name, com.uber.m3.tally.Buckets buckets) {
    return noopHistogram;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.uber.cadence.common` is unnecessary and can be removed
in `src/main/java/com/uber/cadence/common/MethodRetry.java`
#### Snippet
```java
   * Maximum time to retry. When exceeded the retries stop even if maximum retries is not reached
   * yet. If not specified here must be provided through {@link
   * com.uber.cadence.common.RetryOptions.Builder#setExpiration(Duration)}.
   */
  long expirationSeconds() default 0;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.uber.cadence.common` is unnecessary and can be removed
in `src/main/java/com/uber/cadence/common/MethodRetry.java`
#### Snippet
```java
   * Interval of the first retry. If coefficient is 1.0 then it is used for all retries. If not
   * specified here must be provided through {@link
   * com.uber.cadence.common.RetryOptions.Builder#setInitialInterval(Duration)}.
   */
  long initialIntervalSeconds() default 0;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.uber.cadence.common` is unnecessary and can be removed
in `src/main/java/com/uber/cadence/common/MethodRetry.java`
#### Snippet
```java
 * activity or workflow interface methods. For workflows currently used only for child workflow
 * retries. Not required. When not used either retries don't happen or they are configured through
 * correspondent options. If {@link com.uber.cadence.common.RetryOptions} are present on {@link
 * ActivityOptions} or {@link com.uber.cadence.workflow.ChildWorkflowOptions} the fields that are
 * not default take precedence over parameters of this annotation.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.uber.cadence.workflow` is unnecessary and can be removed
in `src/main/java/com/uber/cadence/common/RetryOptions.java`
#### Snippet
```java
     * of its subclasses. The reason for such behaviour is to be able to support server side retries
     * without knowledge of Java exception hierarchy. When considering an exception type a cause of
     * {@link com.uber.cadence.workflow.ActivityFailureException} and {@link
     * com.uber.cadence.workflow.ChildWorkflowFailureException} is looked at.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.uber.cadence.workflow` is unnecessary and can be removed
in `src/main/java/com/uber/cadence/common/RetryOptions.java`
#### Snippet
```java
     * without knowledge of Java exception hierarchy. When considering an exception type a cause of
     * {@link com.uber.cadence.workflow.ActivityFailureException} and {@link
     * com.uber.cadence.workflow.ChildWorkflowFailureException} is looked at.
     *
     * <p>{@link Error} and {@link java.util.concurrent.CancellationException} are never retried and
```

### UnnecessaryFullyQualifiedName
Qualifier `com.uber.m3.tally` is unnecessary, and can be replaced with an import
in `src/main/java/com/uber/cadence/reporter/CadenceClientStatsReporter.java`
#### Snippet
```java
      String name,
      Map<String, String> tags,
      com.uber.m3.tally.Buckets buckets,
      Duration bucketLowerBound,
      Duration bucketUpperBound,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.uber.m3.tally` is unnecessary, and can be replaced with an import
in `src/main/java/com/uber/cadence/reporter/CadenceClientStatsReporter.java`
#### Snippet
```java
      String name,
      Map<String, String> tags,
      com.uber.m3.tally.Buckets buckets,
      double bucketLowerBound,
      double bucketUpperBound,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.thrift` is unnecessary and can be removed
in `src/main/java/com/uber/cadence/internal/sync/TestActivityEnvironmentInternal.java`
#### Snippet
```java
    public void GetTaskListsByDomain(
        GetTaskListsByDomainRequest request, AsyncMethodCallback resultHandler)
        throws org.apache.thrift.TException {
      impl.GetTaskListsByDomain(request, resultHandler);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.thrift` is unnecessary and can be removed
in `src/main/java/com/uber/cadence/internal/sync/TestWorkflowEnvironmentInternal.java`
#### Snippet
```java
    public void GetTaskListsByDomain(
        GetTaskListsByDomainRequest request, AsyncMethodCallback resultHandler)
        throws org.apache.thrift.TException {
      impl.GetTaskListsByDomain(request, resultHandler);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.thrift` is unnecessary, and can be replaced with an import
in `src/main/java/com/uber/cadence/internal/replay/WorkflowContext.java`
#### Snippet
```java
        .forEach(
            (k, v) -> {
              headerData.put(k, org.apache.thrift.TBaseHelper.byteBufferToByteArray(v));
            });

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.thrift` is unnecessary, and can be replaced with an import
in `src/main/java/com/uber/cadence/internal/replay/MarkerHandler.java`
#### Snippet
```java
          && attributes.getHeader().getFields().containsKey(MUTABLE_MARKER_HEADER_KEY)) {
        ByteBuffer byteBuffer = attributes.getHeader().getFields().get(MUTABLE_MARKER_HEADER_KEY);
        byte[] bytes = org.apache.thrift.TBaseHelper.byteBufferToByteArray(byteBuffer);
        MarkerData.MarkerHeader header =
            converter.fromData(bytes, MarkerData.MarkerHeader.class, MarkerData.MarkerHeader.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.thrift` is unnecessary, and can be replaced with an import
in `src/main/java/com/uber/cadence/internal/worker/ActivityWorker.java`
#### Snippet
```java
          .forEach(
              (k, v) -> {
                headerData.put(k, org.apache.thrift.TBaseHelper.byteBufferToByteArray(v));
              });

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.thrift` is unnecessary and can be removed
in `src/main/java/com/uber/cadence/internal/common/InternalUtils.java`
#### Snippet
```java
          return null;
        }
      } catch (org.apache.thrift.TException err) {
        throw new TException("Deserialize blob data to history failed with unknown error");
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.thrift` is unnecessary and can be removed
in `src/main/java/com/uber/cadence/internal/common/InternalUtils.java`
#### Snippet
```java
    try {
      blob.setData(serializer.serialize(history));
    } catch (org.apache.thrift.TException err) {
      throw new RuntimeException("Serialize history to blob data failed", err);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.thrift` is unnecessary and can be removed
in `src/main/java/com/uber/cadence/internal/common/InternalUtils.java`
#### Snippet
```java
        deSerializer.deserialize(event, dataByte);
        events.add(event);
      } catch (org.apache.thrift.TException err) {
        throw new TException("Deserialize blob data to history event failed with unknown error");
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.thrift` is unnecessary and can be removed
in `src/main/java/com/uber/cadence/internal/common/InternalUtils.java`
#### Snippet
```java
      try {
        blob.setData(serializer.serialize(event));
      } catch (org.apache.thrift.TException err) {
        throw new RuntimeException("Serialize history event to blob data failed", err);
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.thrift` is unnecessary and can be removed
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowService.java`
#### Snippet
```java
  public void GetTaskListsByDomain(
      GetTaskListsByDomainRequest request, AsyncMethodCallback resultHandler)
      throws org.apache.thrift.TException {
    throw new UnsupportedOperationException("not implemented");
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.thrift` is unnecessary and can be removed
in `src/main/java/com/uber/cadence/serviceclient/IWorkflowService.java`
#### Snippet
```java
   * @param resultHandler
   * @param timeoutInMillis
   * @throws org.apache.thrift.TException
   */
  void GetWorkflowExecutionHistoryWithTimeout(
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `src/main/java/com/uber/cadence/workflow/CancellationScope.java`
#### Snippet
```java

  /**
   * Throws {@link java.util.concurrent.CancellationException} if scope is cancelled. Noop if not
   * cancelled.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.thrift` is unnecessary, and can be replaced with an import
in `src/main/java/com/uber/cadence/internal/common/LocalActivityMarkerData.java`
#### Snippet
```java
      MarkerRecordedEventAttributes attributes, DataConverter converter) {
    ByteBuffer byteBuffer = attributes.getHeader().getFields().get(LOCAL_ACTIVITY_HEADER_KEY);
    byte[] bytes = org.apache.thrift.TBaseHelper.byteBufferToByteArray(byteBuffer);
    LocalActivityMarkerHeader header =
        converter.fromData(bytes, LocalActivityMarkerHeader.class, LocalActivityMarkerHeader.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.thrift` is unnecessary, and can be replaced with an import
in `src/main/java/com/uber/cadence/internal/common/WorkflowExecutionUtils.java`
#### Snippet
```java
    }
    if (ByteBuffer.class.isAssignableFrom(clz)) {
      byte[] bytes = org.apache.thrift.TBaseHelper.byteBufferToByteArray((ByteBuffer) object);
      return new String(bytes, UTF_8);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.uber.m3.tally` is unnecessary, and can be replaced with an import
in `src/main/java/com/uber/cadence/internal/metrics/ReplayAwareScope.java`
#### Snippet
```java
  @Override
  @SuppressWarnings("deprecation")
  public Histogram histogram(String name, com.uber.m3.tally.Buckets buckets) {
    return new ReplayAwareHistogram(scope.histogram(name, buckets));
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.uber.cadence.context` is unnecessary and can be removed
in `src/main/java/com/uber/cadence/internal/replay/DecisionContext.java`
#### Snippet
```java
  /**
   * Returns all of the current contexts being propagated by a {@link
   * com.uber.cadence.context.ContextPropagator}. The key is the {@link ContextPropagator#getName()}
   * and the value is the object returned by {@link ContextPropagator#getCurrentContext()}
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.thrift` is unnecessary and can be removed
in `src/main/java/com/uber/cadence/serviceclient/WorkflowServiceTChannel.java`
#### Snippet
```java
  public void GetTaskListsByDomain(
      GetTaskListsByDomainRequest request, AsyncMethodCallback resultHandler)
      throws org.apache.thrift.TException {
    throw new UnsupportedOperationException("not implemented");
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.uber.cadence.workflow` is unnecessary and can be removed
in `src/main/java/com/uber/cadence/workflow/Workflow.java`
#### Snippet
```java
   * about a failure, like activity and child workflow id. So stubs always throw a subclass of
   * {@link ActivityException} from calls to an activity and subclass of {@link
   * com.uber.cadence.workflow.ChildWorkflowException} from calls to a child workflow. The original
   * exception is attached as a cause to these wrapper exceptions. So as exceptions are always
   * wrapped adding checked ones to method signature causes more pain than benefit.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `src/main/java/com/uber/cadence/workflow/Workflow.java`
#### Snippet
```java
   *
   * @return feature that becomes ready when at least specified number of seconds passes. promise is
   *     failed with {@link java.util.concurrent.CancellationException} if enclosing scope is
   *     cancelled.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.uber.cadence.client` is unnecessary and can be removed
in `src/main/java/com/uber/cadence/client/WorkflowClient.java`
#### Snippet
```java
 *
 * <p>Given a workflow interface executing a workflow requires initializing a {@link
 * com.uber.cadence.client.WorkflowClient} instance, creating a client side stub to the workflow,
 * and then calling a method annotated with {@literal @}{@link WorkflowMethod}.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.uber.cadence.client` is unnecessary and can be removed
in `src/main/java/com/uber/cadence/client/WorkflowClient.java`
#### Snippet
```java
 * different process, the simplest way is to call the blocking version again. If {@link
 * WorkflowOptions#getWorkflowIdReusePolicy()} is not {@code AllowDuplicate} then instead of
 * throwing {@link com.uber.cadence.client.DuplicateWorkflowException}, it reconnects to an existing
 * workflow and waits for its completion. The following example shows how to do this from a
 * different process than the one that started the workflow. All this process needs is a {@code
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `DecisionStateMachineBase()` of an abstract class should not be declared 'public'
in `src/main/java/com/uber/cadence/internal/replay/DecisionStateMachineBase.java`
#### Snippet
```java
  private final DecisionId id;

  public DecisionStateMachineBase(DecisionId id) {
    this.id = id;
    stateHistory.add(state.toString());
```

### NonProtectedConstructorInAbstractClass
Constructor `ActivityPollTaskBase()` of an abstract class should not be declared 'public'
in `src/main/java/com/uber/cadence/internal/worker/ActivityPollTaskBase.java`
#### Snippet
```java
  protected final SingleWorkerOptions options;

  public ActivityPollTaskBase(SingleWorkerOptions options) {
    this.options = options;
  }
```

## RuleId[id=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new Supplier\>() can be replaced with method reference
in `src/main/java/com/uber/cadence/internal/context/ContextThreadLocal.java`
#### Snippet
```java
  private static WorkflowThreadLocal<List<ContextPropagator>> contextPropagators =
      WorkflowThreadLocal.withInitial(
          new Supplier<List<ContextPropagator>>() {
            @Override
            public List<ContextPropagator> get() {
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `src/main/java/com/uber/cadence/internal/worker/autoscaler/PollerAutoScaler.java`
#### Snippet
```java
    Executors.newSingleThreadExecutor()
        .submit(
            new Runnable() {
              @Override
              public void run() {
```

### Convert2Lambda
Anonymous new Supplier\>() can be replaced with lambda
in `src/main/java/com/uber/cadence/internal/context/ContextThreadLocal.java`
#### Snippet
```java
  private static WorkflowThreadLocal<List<ContextPropagator>> contextPropagators =
      WorkflowThreadLocal.withInitial(
          new Supplier<List<ContextPropagator>>() {
            @Override
            public List<ContextPropagator> get() {
```

## RuleId[id=CaughtExceptionImmediatelyRethrown]
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

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `domain`
in `src/main/java/com/uber/cadence/internal/metrics/ClientVersionEmitter.java`
#### Snippet
```java
  public ClientVersionEmitter(Scope metricScope, String domain) {
    if (domain == null) {
      domain = "UNKNOWN";
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/com/uber/cadence/common/RetryOptions.java`
#### Snippet
```java
  public boolean shouldRethrow(Throwable e, long attempt, long elapsed, long sleepTime) {
    if (e instanceof ActivityFailureException || e instanceof ChildWorkflowFailureException) {
      e = e.getCause();
    }
    if (doNotRetry != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `o`
in `src/main/java/com/uber/cadence/common/RetryOptions.java`
#### Snippet
```java
    }
    if (o == null) {
      o = new RetryOptions.Builder().build();
    }
    Duration initial = merge(r.initialIntervalSeconds(), o.getInitialInterval());
```

### AssignmentToMethodParameter
Assignment to method parameter `maxWaitAllowed`
in `src/main/java/com/uber/cadence/internal/replay/ClockDecisionContext.java`
#### Snippet
```java
    for (ExecuteLocalActivityParameters params : unstartedLaTasks.values()) {
      long currTime = System.currentTimeMillis();
      maxWaitAllowed = maxWaitAllowed.minus(Duration.ofMillis(currTime - startTime));
      boolean applied =
          laTaskPoller.apply(
```

### AssignmentToMethodParameter
Assignment to method parameter `o`
in `src/main/java/com/uber/cadence/workflow/ChildWorkflowOptions.java`
#### Snippet
```java
      WorkflowMethod a, MethodRetry r, CronSchedule cronSchedule, ChildWorkflowOptions o) {
    if (o == null) {
      o = new ChildWorkflowOptions.Builder().build();
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `src/main/java/com/uber/cadence/worker/Worker.java`
#### Snippet
```java
      List<ContextPropagator> contextPropagators) {
    this.taskList = Objects.requireNonNull(taskList);
    options = MoreObjects.firstNonNull(options, WorkerOptions.defaultInstance());
    this.options = options;

```

### AssignmentToMethodParameter
Assignment to method parameter `failure`
in `src/main/java/com/uber/cadence/internal/sync/WorkflowStubImpl.java`
#### Snippet
```java
  private <R> R mapToWorkflowFailureException(
      Exception failure, @SuppressWarnings("unused") Class<R> returnType) {
    failure = CheckedExceptionWrapper.unwrap(failure);
    Class<Throwable> detailsClass;
    if (failure instanceof WorkflowExecutionFailedException) {
```

### AssignmentToMethodParameter
Assignment to method parameter `o`
in `src/main/java/com/uber/cadence/client/WorkflowOptions.java`
#### Snippet
```java
    }
    if (o == null) {
      o = new WorkflowOptions.Builder().build();
    }
    String cronAnnotation = cronSchedule == null ? "" : cronSchedule.value();
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/com/uber/cadence/internal/sync/WorkflowThreadImpl.java`
#### Snippet
```java

    if (name == null) {
      name = "workflow-" + super.hashCode();
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `continueParameters`
in `src/main/java/com/uber/cadence/internal/replay/WorkflowContext.java`
#### Snippet
```java
  void setContinueAsNewOnCompletion(ContinueAsNewWorkflowExecutionParameters continueParameters) {
    if (continueParameters == null) {
      continueParameters = new ContinueAsNewWorkflowExecutionParameters();
    }
    //            continueParameters.setChildPolicy(startedAttributes);
```

### AssignmentToMethodParameter
Assignment to method parameter `expectedNextEventId`
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowStoreImpl.java`
#### Snippet
```java
                return result;
              }
              expectedNextEventId = getNextEventIdLocked();
              continue;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `o`
in `src/main/java/com/uber/cadence/activity/LocalActivityOptions.java`
#### Snippet
```java
    }
    if (o == null) {
      o = new LocalActivityOptions.Builder().build();
    }
    return new LocalActivityOptions.Builder()
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/com/uber/cadence/internal/common/RpcRetryer.java`
#### Snippet
```java
    }
    if (e instanceof CompletionException) {
      e = e.getCause();
    }
    // Do not retry Error
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `src/main/java/com/uber/cadence/internal/common/RpcRetryer.java`
#### Snippet
```java
      return new ValueExceptionPair<>(null, e);
    }
    e = unwrap((Exception) e);
    long elapsed = System.currentTimeMillis() - startTime;
    if (options.getDoNotRetry() != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `workflowExecution`
in `src/main/java/com/uber/cadence/internal/common/WorkflowExecutionUtils.java`
#### Snippet
```java
        if (event.getEventType() == EventType.WorkflowExecutionContinuedAsNew) {
          pageToken = null;
          workflowExecution =
              new WorkflowExecution()
                  .setWorkflowId(workflowExecution.getWorkflowId())
```

### AssignmentToMethodParameter
Assignment to method parameter `failure`
in `src/main/java/com/uber/cadence/internal/sync/POJOActivityTaskHandler.java`
#### Snippet
```java
    if (failure instanceof SimulatedTimeoutException) {
      SimulatedTimeoutException timeoutException = (SimulatedTimeoutException) failure;
      failure =
          new SimulatedTimeoutExceptionInternal(
              timeoutException.getTimeoutType(),
```

### AssignmentToMethodParameter
Assignment to method parameter `failure`
in `src/main/java/com/uber/cadence/internal/sync/POJOActivityTaskHandler.java`
#### Snippet
```java

    RespondActivityTaskFailedRequest result = new RespondActivityTaskFailedRequest();
    failure = CheckedExceptionWrapper.unwrap(failure);
    result.setReason(failure.getClass().getName());
    result.setDetails(dataConverter.toData(failure));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `src/main/java/com/uber/cadence/worker/ShadowingWorker.java`
#### Snippet
```java
      ShadowingOptions shadowingOptions,
      TestEnvironmentOptions testOptions) {
    options = MoreObjects.firstNonNull(options, WorkerOptions.defaultInstance());
    this.shadowingOptions = Objects.requireNonNull(shadowingOptions);
    this.taskList = shadowingOptions.getDomain() + "-" + taskList;
```

### AssignmentToMethodParameter
Assignment to method parameter `o`
in `src/main/java/com/uber/cadence/activity/ActivityOptions.java`
#### Snippet
```java
    }
    if (o == null) {
      o = new ActivityOptions.Builder().build();
    }
    return new ActivityOptions.Builder()
```

### AssignmentToMethodParameter
Assignment to method parameter `failure`
in `src/main/java/com/uber/cadence/internal/sync/POJOWorkflowImplementationFactory.java`
#### Snippet
```java
  static WorkflowExecutionException mapToWorkflowExecutionException(
      Exception failure, DataConverter dataConverter) {
    failure = CheckedExceptionWrapper.unwrap(failure);
    // Only expected during unit tests.
    if (failure instanceof SimulatedTimeoutException) {
```

### AssignmentToMethodParameter
Assignment to method parameter `failure`
in `src/main/java/com/uber/cadence/internal/sync/POJOWorkflowImplementationFactory.java`
#### Snippet
```java
    if (failure instanceof SimulatedTimeoutException) {
      SimulatedTimeoutException timeoutException = (SimulatedTimeoutException) failure;
      failure =
          new SimulatedTimeoutExceptionInternal(
              timeoutException.getTimeoutType(),
```

### AssignmentToMethodParameter
Assignment to method parameter `timeoutInMillis`
in `src/main/java/com/uber/cadence/serviceclient/WorkflowServiceTChannel.java`
#### Snippet
```java

    if (getRequest.isWaitForNewEvent()) {
      timeoutInMillis =
          validateAndUpdateTimeout(timeoutInMillis, options.getRpcLongPollTimeoutMillis());
    } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `timeoutInMillis`
in `src/main/java/com/uber/cadence/serviceclient/WorkflowServiceTChannel.java`
#### Snippet
```java
          validateAndUpdateTimeout(timeoutInMillis, options.getRpcLongPollTimeoutMillis());
    } else {
      timeoutInMillis = validateAndUpdateTimeout(timeoutInMillis, options.getRpcTimeoutMillis());
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `timeoutInMillis`
in `src/main/java/com/uber/cadence/serviceclient/WorkflowServiceTChannel.java`
#### Snippet
```java
      Long timeoutInMillis) {

    timeoutInMillis = validateAndUpdateTimeout(timeoutInMillis, options.getRpcTimeoutMillis());
    ThriftRequest<WorkflowService.SignalWorkflowExecution_args> request =
        buildThriftRequest(
```

### AssignmentToMethodParameter
Assignment to method parameter `timeoutInMillis`
in `src/main/java/com/uber/cadence/serviceclient/WorkflowServiceTChannel.java`
#### Snippet
```java
  private Long validateAndUpdateTimeout(Long timeoutInMillis, Long defaultTimeoutInMillis) {
    if (timeoutInMillis == null || timeoutInMillis <= 0 || timeoutInMillis == Long.MAX_VALUE) {
      timeoutInMillis = defaultTimeoutInMillis;
    } else {
      timeoutInMillis = Math.min(timeoutInMillis, defaultTimeoutInMillis);
```

### AssignmentToMethodParameter
Assignment to method parameter `timeoutInMillis`
in `src/main/java/com/uber/cadence/serviceclient/WorkflowServiceTChannel.java`
#### Snippet
```java
      timeoutInMillis = defaultTimeoutInMillis;
    } else {
      timeoutInMillis = Math.min(timeoutInMillis, defaultTimeoutInMillis);
    }
    return timeoutInMillis;
```

### AssignmentToMethodParameter
Assignment to method parameter `timeoutInMillis`
in `src/main/java/com/uber/cadence/serviceclient/WorkflowServiceTChannel.java`
#### Snippet
```java

    startRequest.setRequestId(UUID.randomUUID().toString());
    timeoutInMillis = validateAndUpdateTimeout(timeoutInMillis, options.getRpcTimeoutMillis());
    ThriftRequest<WorkflowService.StartWorkflowExecution_args> request =
        buildThriftRequest(
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/sync/ChildWorkflowInvocationHandler.java`
#### Snippet
```java
    if (signalMethod != null) {
      signalWorkflow(method, signalMethod, args);
      return null;
    }
    throw new IllegalArgumentException(
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/replay/TimerDecisionStateMachine.java`
#### Snippet
```java
        return createCancelTimerDecision();
      default:
        return null;
    }
  }
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/replay/ChildWorkflowDecisionStateMachine.java`
#### Snippet
```java
        return createRequestCancelExternalWorkflowExecutionDecision();
      default:
        return null;
    }
  }
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/common/RetryOptions.java`
#### Snippet
```java
      return o1.toArray(result);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/common/RetryOptions.java`
#### Snippet
```java
      return o.toArray(result);
    }
    return a.length == 0 ? null : a;
  }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/common/RetryOptions.java`
#### Snippet
```java
    if (r == null) {
      if (o == null) {
        return null;
      }
      return new RetryOptions.Builder(o).validateBuildWithDefaults();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/common/RetryOptions.java`
#### Snippet
```java
      return o;
    }
    return aSeconds == 0 ? null : Duration.ofSeconds(aSeconds);
  }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/replay/ActivityDecisionContext.java`
#### Snippet
```java
  private Header toHeaderThrift(Map<String, byte[]> headers) {
    if (headers == null || headers.isEmpty()) {
      return null;
    }
    Map<String, ByteBuffer> fields = new HashMap<>();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/replay/ActivityDecisionStateMachine.java`
#### Snippet
```java
        return createRequestCancelActivityTaskDecision();
      default:
        return null;
    }
  }
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/replay/ClockDecisionContext.java`
#### Snippet
```java
    pendingLaTasks.put(params.getActivityId(), context);
    unstartedLaTasks.put(params.getActivityId(), params);
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/replay/ClockDecisionContext.java`
#### Snippet
```java
    if (delaySeconds == 0) {
      callback.accept(null);
      return null;
    }
    long firingTime = currentTimeMillis() + TimeUnit.SECONDS.toMillis(delaySeconds);
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/Helpers.java`
#### Snippet
```java
  static byte[] byteStringToArray(ByteString t) {
    if (t == null || t.size() == 0) {
      return null;
    }
    return t.toByteArray();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/sync/WorkflowInternal.java`
#### Snippet
```java
    if (AsyncInternal.isAsync()) {
      AsyncInternal.setAsyncResult(result);
      return null; // ignored
    }
    return result.get();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/workflow/WorkflowLocal.java`
#### Snippet
```java

  public WorkflowLocal() {
    this.supplier = () -> null;
  }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/sync/WorkflowStubImpl.java`
#### Snippet
```java
              }
              if (r == null) {
                return null;
              }
              return dataConverter.fromData(r, resultClass, resultType);
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/sync/WorkflowStubImpl.java`
#### Snippet
```java
      Map<String, Object> map, DataConverter dataConverter) {
    if (map == null) {
      return null;
    }
    Map<String, byte[]> result = new HashMap<>();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/sync/WorkflowStubImpl.java`
#### Snippet
```java
              unit);
      if (resultValue == null) {
        return null;
      }
      return dataConverter.fromData(resultValue, resultClass, resultType);
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/sync/WorkflowStubImpl.java`
#### Snippet
```java
      List<ContextPropagator> contextPropagators) {
    if (contextPropagators == null || contextPropagators.isEmpty()) {
      return null;
    }
    Map<String, byte[]> result = new HashMap<>();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/replay/SignalDecisionStateMachine.java`
#### Snippet
```java
        return createSignalExternalWorkflowExecutionDecision();
      default:
        return null;
    }
  }
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/workflow/WorkflowThreadLocal.java`
#### Snippet
```java

  public WorkflowThreadLocal() {
    this.supplier = () -> null;
  }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/sync/DeterministicRunnerImpl.java`
#### Snippet
```java
    @Override
    public Map<String, Object> getPropagatedContexts() {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/sync/DeterministicRunnerImpl.java`
#### Snippet
```java
    @Override
    public List<ContextPropagator> getContextPropagators() {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
      com.uber.cadence.api.v1.PendingChildExecutionInfo t) {
    if (t == null || t == com.uber.cadence.api.v1.PendingChildExecutionInfo.getDefaultInstance()) {
      return null;
    }
    PendingChildExecutionInfo res = new PendingChildExecutionInfo();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
  static String workflowId(com.uber.cadence.api.v1.WorkflowExecution t) {
    if (t == null || t == com.uber.cadence.api.v1.WorkflowExecution.getDefaultInstance()) {
      return null;
    }
    return t.getWorkflowId();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
  static String parentDomainName(com.uber.cadence.api.v1.ParentExecutionInfo t) {
    if (t == null || t == com.uber.cadence.api.v1.ParentExecutionInfo.getDefaultInstance()) {
      return null;
    }
    return t.getDomainName();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
  static PollerInfo pollerInfo(com.uber.cadence.api.v1.PollerInfo t) {
    if (t == null || t == com.uber.cadence.api.v1.PollerInfo.getDefaultInstance()) {
      return null;
    }
    PollerInfo res = new PollerInfo();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
      List<com.uber.cadence.api.v1.WorkflowExecutionInfo> t) {
    if (t == null) {
      return null;
    }
    List<WorkflowExecutionInfo> v = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
      com.uber.cadence.api.v1.ExternalExecutionInfo t) {
    if (t == null || t == com.uber.cadence.api.v1.ExternalExecutionInfo.getDefaultInstance()) {
      return null;
    }
    return workflowExecution(t.getWorkflowExecution());
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
  static List<ResetPointInfo> resetPointInfoArray(List<com.uber.cadence.api.v1.ResetPointInfo> t) {
    if (t == null) {
      return null;
    }
    List<ResetPointInfo> v = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
  static byte[] failureDetails(com.uber.cadence.api.v1.Failure t) {
    if (t == null || t == com.uber.cadence.api.v1.Failure.getDefaultInstance()) {
      return null;
    }
    return byteStringToArray(t.getDetails());
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
  static String failureReason(com.uber.cadence.api.v1.Failure t) {
    if (t == null || t == com.uber.cadence.api.v1.Failure.getDefaultInstance()) {
      return null;
    }
    return t.getReason();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
  static byte[] payload(com.uber.cadence.api.v1.Payload t) {
    if (t == null || t == com.uber.cadence.api.v1.Payload.getDefaultInstance()) {
      return null;
    }
    if (t.getData() == null || t.getData().size() == 0) {
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
  static DescribeDomainResponse describeDomainResponseDomain(com.uber.cadence.api.v1.Domain t) {
    if (t == null || t == com.uber.cadence.api.v1.Domain.getDefaultInstance()) {
      return null;
    }
    DescribeDomainResponse res = new DescribeDomainResponse();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
  static String parentDomainId(com.uber.cadence.api.v1.ParentExecutionInfo t) {
    if (t == null || t == com.uber.cadence.api.v1.ParentExecutionInfo.getDefaultInstance()) {
      return null;
    }
    return t.getDomainId();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
  static ResetPoints resetPoints(com.uber.cadence.api.v1.ResetPoints t) {
    if (t == null || t == com.uber.cadence.api.v1.ResetPoints.getDefaultInstance()) {
      return null;
    }
    ResetPoints res = new ResetPoints();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
  static ActivityType activityType(com.uber.cadence.api.v1.ActivityType t) {
    if (t == null || t == com.uber.cadence.api.v1.ActivityType.getDefaultInstance()) {
      return null;
    }
    ActivityType activityType = new ActivityType();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
      com.uber.cadence.api.v1.ActivityLocalDispatchInfo t) {
    if (t == null || t == com.uber.cadence.api.v1.ActivityLocalDispatchInfo.getDefaultInstance()) {
      return null;
    }
    ActivityLocalDispatchInfo res = new ActivityLocalDispatchInfo();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
    if (t == null
        || t == com.uber.cadence.api.v1.WorkflowExecutionConfiguration.getDefaultInstance()) {
      return null;
    }
    WorkflowExecutionConfiguration res = new WorkflowExecutionConfiguration();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
      Map<String, com.uber.cadence.api.v1.IndexedValueType> t) {
    if (t == null) {
      return null;
    }
    Map<String, IndexedValueType> v = new HashMap<>();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
  static DataBlob dataBlob(com.uber.cadence.api.v1.DataBlob t) {
    if (t == null || t == com.uber.cadence.api.v1.DataBlob.getDefaultInstance()) {
      return null;
    }
    DataBlob dataBlob = new DataBlob();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
  static WorkflowExecution parentWorkflowExecution(com.uber.cadence.api.v1.ParentExecutionInfo t) {
    if (t == null || t == com.uber.cadence.api.v1.ParentExecutionInfo.getDefaultInstance()) {
      return null;
    }
    return workflowExecution(t.getWorkflowExecution());
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
      List<com.uber.cadence.api.v1.PendingChildExecutionInfo> t) {
    if (t == null) {
      return null;
    }
    List<PendingChildExecutionInfo> v = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
      Map<String, com.uber.cadence.api.v1.BadBinaryInfo> t) {
    if (t == null) {
      return null;
    }
    Map<String, BadBinaryInfo> v = new HashMap<>();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
  static PendingActivityInfo pendingActivityInfo(com.uber.cadence.api.v1.PendingActivityInfo t) {
    if (t == null || t == com.uber.cadence.api.v1.PendingActivityInfo.getDefaultInstance()) {
      return null;
    }
    PendingActivityInfo res = new PendingActivityInfo();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
  static List<DataBlob> dataBlobArray(List<com.uber.cadence.api.v1.DataBlob> t) {
    if (t == null || t.size() == 0) {
      return null;
    }
    List<DataBlob> v = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
  static BadBinaryInfo badBinaryInfo(com.uber.cadence.api.v1.BadBinaryInfo t) {
    if (t == null || t == com.uber.cadence.api.v1.BadBinaryInfo.getDefaultInstance()) {
      return null;
    }
    BadBinaryInfo res = new BadBinaryInfo();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
      Map<String, com.uber.cadence.api.v1.ActivityLocalDispatchInfo> t) {
    if (t == null) {
      return null;
    }
    Map<String, ActivityLocalDispatchInfo> v = new HashMap<>();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
      List<com.uber.cadence.api.v1.ClusterReplicationConfiguration> t) {
    if (t == null) {
      return null;
    }
    List<ClusterReplicationConfiguration> v = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
  static TaskIDBlock taskIdBlock(com.uber.cadence.api.v1.TaskIDBlock t) {
    if (t == null || t == com.uber.cadence.api.v1.TaskIDBlock.getDefaultInstance()) {
      return null;
    }
    TaskIDBlock res = new TaskIDBlock();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
      List<com.uber.cadence.api.v1.TaskListPartitionMetadata> t) {
    if (t == null) {
      return null;
    }
    List<TaskListPartitionMetadata> v = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
  static TaskList taskList(com.uber.cadence.api.v1.TaskList t) {
    if (t == null || t == com.uber.cadence.api.v1.TaskList.getDefaultInstance()) {
      return null;
    }
    TaskList taskList = new TaskList();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
      List<com.uber.cadence.api.v1.PendingActivityInfo> t) {
    if (t == null) {
      return null;
    }
    List<PendingActivityInfo> v = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
      List<com.uber.cadence.api.v1.Domain> t) {
    if (t == null) {
      return null;
    }
    List<DescribeDomainResponse> v = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
  static WorkflowQuery workflowQuery(com.uber.cadence.api.v1.WorkflowQuery t) {
    if (t == null || t == com.uber.cadence.api.v1.WorkflowQuery.getDefaultInstance()) {
      return null;
    }
    WorkflowQuery res = new WorkflowQuery();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
  static String runId(com.uber.cadence.api.v1.WorkflowExecution t) {
    if (t == null || t == com.uber.cadence.api.v1.WorkflowExecution.getDefaultInstance()) {
      return null;
    }
    return t.getRunId();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
      com.uber.cadence.api.v1.WorkflowExecutionInfo t) {
    if (t == null || t == com.uber.cadence.api.v1.WorkflowExecutionInfo.getDefaultInstance()) {
      return null;
    }
    WorkflowExecutionInfo res = new WorkflowExecutionInfo();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
  static QueryRejected queryRejected(com.uber.cadence.api.v1.QueryRejected t) {
    if (t == null || t == com.uber.cadence.api.v1.QueryRejected.getDefaultInstance()) {
      return null;
    }
    QueryRejected res = new QueryRejected();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
  static WorkflowType workflowType(com.uber.cadence.api.v1.WorkflowType t) {
    if (t == null || t == com.uber.cadence.api.v1.WorkflowType.getDefaultInstance()) {
      return null;
    }
    WorkflowType wt = new WorkflowType();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
    if (t == null
        || t == com.uber.cadence.api.v1.ClusterReplicationConfiguration.getDefaultInstance()) {
      return null;
    }
    ClusterReplicationConfiguration res = new ClusterReplicationConfiguration();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
        || t.getAllFields().size() == 0
        || t == com.uber.cadence.api.v1.SearchAttributes.getDefaultInstance()) {
      return null;
    }
    SearchAttributes res = new SearchAttributes();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
  static PendingDecisionInfo pendingDecisionInfo(com.uber.cadence.api.v1.PendingDecisionInfo t) {
    if (t == null || t == com.uber.cadence.api.v1.PendingDecisionInfo.getDefaultInstance()) {
      return null;
    }
    PendingDecisionInfo res = new PendingDecisionInfo();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
  static RetryPolicy retryPolicy(com.uber.cadence.api.v1.RetryPolicy t) {
    if (t == null || t == com.uber.cadence.api.v1.RetryPolicy.getDefaultInstance()) {
      return null;
    }
    RetryPolicy res = new RetryPolicy();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
      com.uber.cadence.api.v1.TaskListPartitionMetadata t) {
    if (t == null || t == com.uber.cadence.api.v1.TaskListPartitionMetadata.getDefaultInstance()) {
      return null;
    }
    TaskListPartitionMetadata res = new TaskListPartitionMetadata();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
  static Map<String, ByteBuffer> payloadMap(Map<String, com.uber.cadence.api.v1.Payload> t) {
    if (t == null) {
      return null;
    }
    Map<String, ByteBuffer> v = new HashMap<>();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
      Map<String, com.uber.cadence.api.v1.WorkflowQuery> t) {
    if (t == null) {
      return null;
    }
    Map<String, WorkflowQuery> v = new HashMap<>();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
  static List<PollerInfo> pollerInfoArray(List<com.uber.cadence.api.v1.PollerInfo> t) {
    if (t == null) {
      return null;
    }
    List<PollerInfo> v = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
  static Memo memo(com.uber.cadence.api.v1.Memo t) {
    if (t == null || t == com.uber.cadence.api.v1.Memo.getDefaultInstance()) {
      return null;
    }
    Memo res = new Memo();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
  static BadBinaries badBinaries(com.uber.cadence.api.v1.BadBinaries t) {
    if (t == null || t == com.uber.cadence.api.v1.BadBinaries.getDefaultInstance()) {
      return null;
    }
    BadBinaries badBinaries = new BadBinaries();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
  static Header header(com.uber.cadence.api.v1.Header t) {
    if (t == null || t == com.uber.cadence.api.v1.Header.getDefaultInstance()) {
      return null;
    }
    Header res = new Header();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
      com.uber.cadence.api.v1.SupportedClientVersions t) {
    if (t == null || t == com.uber.cadence.api.v1.SupportedClientVersions.getDefaultInstance()) {
      return null;
    }
    SupportedClientVersions res = new SupportedClientVersions();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
  static TaskListStatus taskListStatus(com.uber.cadence.api.v1.TaskListStatus t) {
    if (t == null || t == com.uber.cadence.api.v1.TaskListStatus.getDefaultInstance()) {
      return null;
    }
    TaskListStatus res = new TaskListStatus();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
  static ResetPointInfo resetPointInfo(com.uber.cadence.api.v1.ResetPointInfo t) {
    if (t == null || t == com.uber.cadence.api.v1.ResetPointInfo.getDefaultInstance()) {
      return null;
    }
    ResetPointInfo res = new ResetPointInfo();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/TypeMapper.java`
#### Snippet
```java
  static WorkflowExecution workflowExecution(com.uber.cadence.api.v1.WorkflowExecution t) {
    if (t == null || t == com.uber.cadence.api.v1.WorkflowExecution.getDefaultInstance()) {
      return null;
    }
    WorkflowExecution we = new WorkflowExecution();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/sync/AllOfFuture.java`
#### Snippet
```java
            }
            if (impl.isCompleted()) {
              return null;
            }
            if (e != null) {
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/sync/AllOfFuture.java`
#### Snippet
```java
              impl.complete(Arrays.asList(result));
            }
            return null;
          });
    }
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
            == com.uber.cadence.api.v1.WorkflowExecutionCanceledEventAttributes
                .getDefaultInstance()) {
      return null;
    }
    WorkflowExecutionCanceledEventAttributes res = new WorkflowExecutionCanceledEventAttributes();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
            == com.uber.cadence.api.v1.WorkflowExecutionCancelRequestedEventAttributes
                .getDefaultInstance()) {
      return null;
    }
    WorkflowExecutionCancelRequestedEventAttributes res =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
            == com.uber.cadence.api.v1.ExternalWorkflowExecutionSignaledEventAttributes
                .getDefaultInstance()) {
      return null;
    }
    ExternalWorkflowExecutionSignaledEventAttributes res =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
    if (t == null
        || t == com.uber.cadence.api.v1.DecisionTaskTimedOutEventAttributes.getDefaultInstance()) {
      return null;
    }
    DecisionTaskTimedOutEventAttributes res = new DecisionTaskTimedOutEventAttributes();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
    if (t == null
        || t == com.uber.cadence.api.v1.ActivityTaskTimedOutEventAttributes.getDefaultInstance()) {
      return null;
    }
    ActivityTaskTimedOutEventAttributes res = new ActivityTaskTimedOutEventAttributes();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
            == com.uber.cadence.api.v1.ChildWorkflowExecutionStartedEventAttributes
                .getDefaultInstance()) {
      return null;
    }
    ChildWorkflowExecutionStartedEventAttributes res =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
            == com.uber.cadence.api.v1.WorkflowExecutionSignaledEventAttributes
                .getDefaultInstance()) {
      return null;
    }
    WorkflowExecutionSignaledEventAttributes res = new WorkflowExecutionSignaledEventAttributes();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
            == com.uber.cadence.api.v1.ExternalWorkflowExecutionCancelRequestedEventAttributes
                .getDefaultInstance()) {
      return null;
    }
    ExternalWorkflowExecutionCancelRequestedEventAttributes res =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
            == com.uber.cadence.api.v1.ChildWorkflowExecutionTimedOutEventAttributes
                .getDefaultInstance()) {
      return null;
    }
    ChildWorkflowExecutionTimedOutEventAttributes res =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
    if (t == null
        || t == com.uber.cadence.api.v1.ActivityTaskCompletedEventAttributes.getDefaultInstance()) {
      return null;
    }
    ActivityTaskCompletedEventAttributes res = new ActivityTaskCompletedEventAttributes();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
            == com.uber.cadence.api.v1.RequestCancelExternalWorkflowExecutionFailedEventAttributes
                .getDefaultInstance()) {
      return null;
    }
    RequestCancelExternalWorkflowExecutionFailedEventAttributes res =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
    if (t == null
        || t == com.uber.cadence.api.v1.ActivityTaskScheduledEventAttributes.getDefaultInstance()) {
      return null;
    }
    ActivityTaskScheduledEventAttributes res = new ActivityTaskScheduledEventAttributes();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
    if (t == null
        || t == com.uber.cadence.api.v1.TimerCanceledEventAttributes.getDefaultInstance()) {
      return null;
    }
    TimerCanceledEventAttributes res = new TimerCanceledEventAttributes();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
            == com.uber.cadence.api.v1.WorkflowExecutionFailedEventAttributes
                .getDefaultInstance()) {
      return null;
    }
    WorkflowExecutionFailedEventAttributes res = new WorkflowExecutionFailedEventAttributes();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
    if (t == null
        || t == com.uber.cadence.api.v1.MarkerRecordedEventAttributes.getDefaultInstance()) {
      return null;
    }
    MarkerRecordedEventAttributes res = new MarkerRecordedEventAttributes();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
            == com.uber.cadence.api.v1.ChildWorkflowExecutionCompletedEventAttributes
                .getDefaultInstance()) {
      return null;
    }
    ChildWorkflowExecutionCompletedEventAttributes res =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
            == com.uber.cadence.api.v1.ActivityTaskCancelRequestedEventAttributes
                .getDefaultInstance()) {
      return null;
    }
    ActivityTaskCancelRequestedEventAttributes res =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
    if (t == null
        || t == com.uber.cadence.api.v1.DecisionTaskStartedEventAttributes.getDefaultInstance()) {
      return null;
    }
    DecisionTaskStartedEventAttributes res = new DecisionTaskStartedEventAttributes();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
            == com.uber.cadence.api.v1.WorkflowExecutionTimedOutEventAttributes
                .getDefaultInstance()) {
      return null;
    }
    WorkflowExecutionTimedOutEventAttributes res = new WorkflowExecutionTimedOutEventAttributes();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
  static List<HistoryEvent> historyEventArray(List<com.uber.cadence.api.v1.HistoryEvent> t) {
    if (t == null) {
      return null;
    }
    List<HistoryEvent> v = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
            == com.uber.cadence.api.v1.RequestCancelActivityTaskFailedEventAttributes
                .getDefaultInstance()) {
      return null;
    }
    RequestCancelActivityTaskFailedEventAttributes res =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
            == com.uber.cadence.api.v1.WorkflowExecutionTerminatedEventAttributes
                .getDefaultInstance()) {
      return null;
    }
    WorkflowExecutionTerminatedEventAttributes res =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
    if (t == null
        || t == com.uber.cadence.api.v1.DecisionTaskScheduledEventAttributes.getDefaultInstance()) {
      return null;
    }
    DecisionTaskScheduledEventAttributes res = new DecisionTaskScheduledEventAttributes();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
                .RequestCancelExternalWorkflowExecutionInitiatedEventAttributes
                .getDefaultInstance()) {
      return null;
    }
    RequestCancelExternalWorkflowExecutionInitiatedEventAttributes res =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
    if (t == null
        || t == com.uber.cadence.api.v1.ActivityTaskStartedEventAttributes.getDefaultInstance()) {
      return null;
    }
    ActivityTaskStartedEventAttributes res = new ActivityTaskStartedEventAttributes();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
            == com.uber.cadence.api.v1.StartChildWorkflowExecutionFailedEventAttributes
                .getDefaultInstance()) {
      return null;
    }
    StartChildWorkflowExecutionFailedEventAttributes res =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
            == com.uber.cadence.api.v1.SignalExternalWorkflowExecutionFailedEventAttributes
                .getDefaultInstance()) {
      return null;
    }
    SignalExternalWorkflowExecutionFailedEventAttributes res =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
            == com.uber.cadence.api.v1.WorkflowExecutionStartedEventAttributes
                .getDefaultInstance()) {
      return null;
    }
    WorkflowExecutionStartedEventAttributes res = new WorkflowExecutionStartedEventAttributes();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
            == com.uber.cadence.api.v1.WorkflowExecutionContinuedAsNewEventAttributes
                .getDefaultInstance()) {
      return null;
    }
    WorkflowExecutionContinuedAsNewEventAttributes res =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
  static History history(com.uber.cadence.api.v1.History t) {
    if (t == null || t == com.uber.cadence.api.v1.History.getDefaultInstance()) {
      return null;
    }
    History history = new History();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
            == com.uber.cadence.api.v1.StartChildWorkflowExecutionInitiatedEventAttributes
                .getDefaultInstance()) {
      return null;
    }
    StartChildWorkflowExecutionInitiatedEventAttributes res =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
    if (t == null
        || t == com.uber.cadence.api.v1.DecisionTaskCompletedEventAttributes.getDefaultInstance()) {
      return null;
    }
    DecisionTaskCompletedEventAttributes res = new DecisionTaskCompletedEventAttributes();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
    if (t == null
        || t == com.uber.cadence.api.v1.TimerStartedEventAttributes.getDefaultInstance()) {
      return null;
    }
    TimerStartedEventAttributes res = new TimerStartedEventAttributes();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
            == com.uber.cadence.api.v1.ChildWorkflowExecutionTerminatedEventAttributes
                .getDefaultInstance()) {
      return null;
    }
    ChildWorkflowExecutionTerminatedEventAttributes res =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
    if (t == null
        || t == com.uber.cadence.api.v1.CancelTimerFailedEventAttributes.getDefaultInstance()) {
      return null;
    }
    CancelTimerFailedEventAttributes res = new CancelTimerFailedEventAttributes();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
  static HistoryEvent historyEvent(com.uber.cadence.api.v1.HistoryEvent e) {
    if (e == null || e == com.uber.cadence.api.v1.HistoryEvent.getDefaultInstance()) {
      return null;
    }
    HistoryEvent event = new HistoryEvent();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
            == com.uber.cadence.api.v1.ChildWorkflowExecutionFailedEventAttributes
                .getDefaultInstance()) {
      return null;
    }
    ChildWorkflowExecutionFailedEventAttributes res =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
            == com.uber.cadence.api.v1.SignalExternalWorkflowExecutionInitiatedEventAttributes
                .getDefaultInstance()) {
      return null;
    }
    SignalExternalWorkflowExecutionInitiatedEventAttributes res =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
    if (t == null
        || t == com.uber.cadence.api.v1.DecisionTaskFailedEventAttributes.getDefaultInstance()) {
      return null;
    }
    DecisionTaskFailedEventAttributes res = new DecisionTaskFailedEventAttributes();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
    if (t == null
        || t == com.uber.cadence.api.v1.ActivityTaskFailedEventAttributes.getDefaultInstance()) {
      return null;
    }
    ActivityTaskFailedEventAttributes res = new ActivityTaskFailedEventAttributes();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
            == com.uber.cadence.api.v1.ChildWorkflowExecutionCanceledEventAttributes
                .getDefaultInstance()) {
      return null;
    }
    ChildWorkflowExecutionCanceledEventAttributes res =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
    if (t == null
        || t == com.uber.cadence.api.v1.ActivityTaskCanceledEventAttributes.getDefaultInstance()) {
      return null;
    }
    ActivityTaskCanceledEventAttributes res = new ActivityTaskCanceledEventAttributes();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
            == com.uber.cadence.api.v1.WorkflowExecutionCompletedEventAttributes
                .getDefaultInstance()) {
      return null;
    }
    WorkflowExecutionCompletedEventAttributes res = new WorkflowExecutionCompletedEventAttributes();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
            == com.uber.cadence.api.v1.UpsertWorkflowSearchAttributesEventAttributes
                .getDefaultInstance()) {
      return null;
    }
    UpsertWorkflowSearchAttributesEventAttributes res =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/HistoryMapper.java`
#### Snippet
```java
      com.uber.cadence.api.v1.TimerFiredEventAttributes t) {
    if (t == null || t == com.uber.cadence.api.v1.TimerFiredEventAttributes.getDefaultInstance()) {
      return null;
    }
    TimerFiredEventAttributes res = new TimerFiredEventAttributes();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/TypeMapper.java`
#### Snippet
```java
  static StatusFilter statusFilter(com.uber.cadence.WorkflowExecutionCloseStatus t) {
    if (t == null) {
      return null;
    }
    return StatusFilter.newBuilder().setStatus(workflowExecutionCloseStatus(t)).build();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/TypeMapper.java`
#### Snippet
```java
  static BadBinaryInfo badBinaryInfo(com.uber.cadence.BadBinaryInfo t) {
    if (t == null) {
      return null;
    }
    return BadBinaryInfo.newBuilder()
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/TypeMapper.java`
#### Snippet
```java
  static RetryPolicy retryPolicy(com.uber.cadence.RetryPolicy t) {
    if (t == null) {
      return null;
    }
    RetryPolicy.Builder builder =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/TypeMapper.java`
#### Snippet
```java
  static WorkflowQuery workflowQuery(com.uber.cadence.WorkflowQuery t) {
    if (t == null) {
      return null;
    }
    return WorkflowQuery.newBuilder()
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/TypeMapper.java`
#### Snippet
```java
  static StartTimeFilter startTimeFilter(com.uber.cadence.StartTimeFilter t) {
    if (t == null) {
      return null;
    }
    return StartTimeFilter.newBuilder()
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/replay/UpsertSearchAttributesDecisionStateMachine.java`
#### Snippet
```java
      return decision;
    }
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowStoreImpl.java`
#### Snippet
```java
            newEventsCondition.await();
          } catch (InterruptedException e) {
            return null;
          }
        }
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/external/GenericWorkflowClientExternalImpl.java`
#### Snippet
```java
  private Memo toMemoThrift(Map<String, byte[]> memo) {
    if (memo == null || memo.isEmpty()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/external/GenericWorkflowClientExternalImpl.java`
#### Snippet
```java
  private SearchAttributes toSearchAttributesThrift(Map<String, byte[]> searchAttributes) {
    if (searchAttributes == null || searchAttributes.isEmpty()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/external/GenericWorkflowClientExternalImpl.java`
#### Snippet
```java
  private Header toHeaderThrift(Map<String, byte[]> headers) {
    if (headers == null || headers.isEmpty()) {
      return null;
    }
    Map<String, ByteBuffer> fields = new HashMap<>();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/worker/LocallyDispatchedActivityPollTask.java`
#### Snippet
```java
            .counter(MetricsType.LOCALLY_DISPATCHED_ACTIVITY_POLL_NO_TASK_COUNTER)
            .inc(1);
        return null;
      }
    } catch (InterruptedException e) {
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/sync/SyncDecisionContext.java`
#### Snippet
```java
  private RuntimeException mapSignalWorkflowException(Exception failure) {
    if (failure == null) {
      return null;
    }
    if (failure instanceof CancellationException) {
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/sync/SyncDecisionContext.java`
#### Snippet
```java
            (reason) -> {
              cancellationCallback.accept(new CancellationException(reason));
              return null;
            });
    return callback.result;
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/sync/SyncDecisionContext.java`
#### Snippet
```java
      List<ContextPropagator> contextPropagators) {
    if (contextPropagators == null) {
      return null;
    }
    Map<String, byte[]> result = new HashMap<>();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/sync/SyncDecisionContext.java`
#### Snippet
```java
            (reason) -> {
              cancellationCallback.accept(new CancellationException(reason));
              return null;
            });
    return result;
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/sync/SyncDecisionContext.java`
#### Snippet
```java
              timers.removeTimer(fireTime, timer);
              timer.completeExceptionally(new CancellationException(reason));
              return null;
            });
    return timer;
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/sync/SyncDecisionContext.java`
#### Snippet
```java
    Promise<byte[]> binaryResult = executeActivityOnce(name, options, input);
    if (returnClass == Void.TYPE) {
      return binaryResult.thenApply((r) -> null);
    }
    return binaryResult.thenApply((r) -> converter.fromData(r, returnClass, returnType));
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/sync/SyncDecisionContext.java`
#### Snippet
```java
  private RuntimeException mapChildWorkflowException(Exception failure) {
    if (failure == null) {
      return null;
    }
    if (failure instanceof CancellationException) {
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/sync/SyncDecisionContext.java`
#### Snippet
```java
            (reason) -> {
              cancellationCallback.accept(new CancellationException(reason));
              return null;
            });
    return result;
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/sync/SyncDecisionContext.java`
#### Snippet
```java
            (reason) -> {
              cancellationCallback.accept(new CancellationException(reason));
              return null;
            });
    return callback.result;
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/sync/SyncDecisionContext.java`
#### Snippet
```java
  public <R> R getLastCompletionResult(Class<R> resultClass, Type resultType) {
    if (lastCompletionResult == null || lastCompletionResult.length == 0) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/sync/SyncDecisionContext.java`
#### Snippet
```java
    Promise<byte[]> binaryResult = executeLocalActivityOnce(name, options, input, elapsed, attempt);
    if (returnClass == Void.TYPE) {
      return binaryResult.thenApply((r) -> null);
    }
    return binaryResult.thenApply((r) -> converter.fromData(r, returnClass, returnType));
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/sync/SyncDecisionContext.java`
#### Snippet
```java
  private RuntimeException mapActivityException(Exception failure) {
    if (failure == null) {
      return null;
    }
    if (failure instanceof CancellationException) {
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/sync/WorkflowInfoImpl.java`
#### Snippet
```java
  public String getParentRunId() {
    WorkflowExecution parentWorkflowExecution = context.getParentWorkflowExecution();
    return parentWorkflowExecution == null ? null : parentWorkflowExecution.getRunId();
  }
}
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/sync/WorkflowInfoImpl.java`
#### Snippet
```java
  public String getParentWorkflowId() {
    WorkflowExecution parentWorkflowExecution = context.getParentWorkflowExecution();
    return parentWorkflowExecution == null ? null : parentWorkflowExecution.getWorkflowId();
  }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/replay/ExternalWorkflowCancellationDecisionStateMachine.java`
#### Snippet
```java
        return createRequestCancelExternalWorkflowExecutionDecision();
      default:
        return null;
    }
  }
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/replay/MarkerDecisionStateMachine.java`
#### Snippet
```java
      return decision;
    }
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/common/RpcRetryer.java`
#### Snippet
```java
        () -> {
          r.apply();
          return null;
        });
  }
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/converter/TBaseTypeAdapterFactory.java`
#### Snippet
```java
    // this class only serializes 'TBase' and its subtypes
    if (!TBase.class.isAssignableFrom(typeToken.getRawType())) {
      return null;
    }
    TypeAdapter<T> result =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/common/LambdaUtils.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/common/LambdaUtils.java`
#### Snippet
```java
  public static Object getTarget(SerializedLambda l) {
    if (l == null) {
      return null;
    }
    // If lambda is a method call on an object then the first captured argument is the object.
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/common/LambdaUtils.java`
#### Snippet
```java
      return l.getCapturedArg(0);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/common/OptionsUtils.java`
#### Snippet
```java
      return o;
    }
    return aSeconds == 0 ? null : Duration.ofSeconds(aSeconds);
  }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/common/OptionsUtils.java`
#### Snippet
```java
    }
    if (type.equals(String.class)) {
      return ((String) annotation).isEmpty() ? null : annotation;
    }
    return annotation;
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/replay/ReplayDecider.java`
#### Snippet
```java
  private Map<String, WorkflowQueryResult> getQueryResults(Map<String, WorkflowQuery> queries) {
    if (queries == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/common/InternalUtils.java`
#### Snippet
```java

        if (history == null || history.getEvents() == null || history.getEvents().size() == 0) {
          return null;
        }
      } catch (org.apache.thrift.TException err) {
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/testservice/TestWorkflowService.java`
#### Snippet
```java
      throws BadRequestError, InternalServiceError, EntityNotExistsError, ServiceBusyError,
          DomainNotActiveError, LimitExceededError, ClientVersionNotSupportedError, TException {
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/converter/TEnumTypeAdapterFactory.java`
#### Snippet
```java
    // this class only serializes 'TEnum' and its subtypes
    if (!TEnum.class.isAssignableFrom(typeToken.getRawType())) {
      return null;
    }
    TypeAdapter<T> result =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/worker/ActivityPollTaskBase.java`
#### Snippet
```java
    PollForActivityTaskResponse result = pollTask();
    if (result == null || result.getTaskToken() == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/worker/WorkflowPollTask.java`
#### Snippet
```java
    if (result == null || result.getTaskToken() == null) {
      metricScope.counter(MetricsType.DECISION_POLL_NO_TASK_COUNTER).inc(1);
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/converter/CustomThrowableTypeAdapter.java`
#### Snippet
```java
    Matcher matcher = TRACE_ELEMENT_PATTERN.matcher(line);
    if (!matcher.matches()) {
      return null;
    }
    String declaringClass = matcher.group("className");
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/sync/ExternalWorkflowInvocationHandler.java`
#### Snippet
```java
    if (signalMethod != null) {
      signalWorkflow(method, signalMethod, args);
      return null;
    }
    throw new IllegalArgumentException(
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/common/LocalActivityMarkerData.java`
#### Snippet
```java

  public byte[] getErrJson() {
    return Strings.isNullOrEmpty(headers.errReason) ? null : result;
  }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/common/WorkflowExecutionUtils.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/EnumMapper.java`
#### Snippet
```java
    switch (t) {
      case DOMAIN_STATUS_INVALID:
        return null;
      case DOMAIN_STATUS_REGISTERED:
        return DomainStatus.REGISTERED;
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/EnumMapper.java`
#### Snippet
```java
    switch (t) {
      case PENDING_ACTIVITY_STATE_INVALID:
        return null;
      case PENDING_ACTIVITY_STATE_SCHEDULED:
        return PendingActivityState.SCHEDULED;
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/EnumMapper.java`
#### Snippet
```java
    switch (t) {
      case CANCEL_EXTERNAL_WORKFLOW_EXECUTION_FAILED_CAUSE_INVALID:
        return null;
      case CANCEL_EXTERNAL_WORKFLOW_EXECUTION_FAILED_CAUSE_UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION:
        return CancelExternalWorkflowExecutionFailedCause.UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION;
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/EnumMapper.java`
#### Snippet
```java
    switch (t) {
      case TIMEOUT_TYPE_INVALID:
        return null;
      case TIMEOUT_TYPE_START_TO_CLOSE:
        return TimeoutType.START_TO_CLOSE;
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/EnumMapper.java`
#### Snippet
```java
    switch (t) {
      case DECISION_TASK_FAILED_CAUSE_INVALID:
        return null;
      case DECISION_TASK_FAILED_CAUSE_UNHANDLED_DECISION:
        return DecisionTaskFailedCause.UNHANDLED_DECISION;
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/EnumMapper.java`
#### Snippet
```java
    switch (t) {
      case WORKFLOW_ID_REUSE_POLICY_INVALID:
        return null;
      case WORKFLOW_ID_REUSE_POLICY_ALLOW_DUPLICATE_FAILED_ONLY:
        return WorkflowIdReusePolicy.AllowDuplicateFailedOnly;
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/EnumMapper.java`
#### Snippet
```java
      com.uber.cadence.api.v1.QueryRejectCondition t) {
    if (t == QUERY_REJECT_CONDITION_INVALID) {
      return null;
    }
    switch (t) {
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/EnumMapper.java`
#### Snippet
```java
    switch (t) {
      case TASK_LIST_KIND_INVALID:
        return null;
      case TASK_LIST_KIND_NORMAL:
        return TaskListKind.NORMAL;
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/EnumMapper.java`
#### Snippet
```java
    switch (t) {
      case ENCODING_TYPE_INVALID:
        return null;
      case ENCODING_TYPE_THRIFTRW:
        return EncodingType.ThriftRW;
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/EnumMapper.java`
#### Snippet
```java
    switch (t) {
      case PARENT_CLOSE_POLICY_INVALID:
        return null;
      case PARENT_CLOSE_POLICY_ABANDON:
        return ParentClosePolicy.ABANDON;
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/EnumMapper.java`
#### Snippet
```java
    switch (t) {
      case CONTINUE_AS_NEW_INITIATOR_INVALID:
        return null;
      case CONTINUE_AS_NEW_INITIATOR_DECIDER:
        return ContinueAsNewInitiator.Decider;
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/EnumMapper.java`
#### Snippet
```java
    switch (t) {
      case DECISION_TASK_TIMED_OUT_CAUSE_INVALID:
        return null;
      case DECISION_TASK_TIMED_OUT_CAUSE_TIMEOUT:
        return DecisionTaskTimedOutCause.TIMEOUT;
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/EnumMapper.java`
#### Snippet
```java
    switch (t) {
      case WORKFLOW_EXECUTION_CLOSE_STATUS_INVALID:
        return null;
      case WORKFLOW_EXECUTION_CLOSE_STATUS_COMPLETED:
        return WorkflowExecutionCloseStatus.COMPLETED;
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/EnumMapper.java`
#### Snippet
```java
    switch (t) {
      case CHILD_WORKFLOW_EXECUTION_FAILED_CAUSE_INVALID:
        return null;
      case CHILD_WORKFLOW_EXECUTION_FAILED_CAUSE_WORKFLOW_ALREADY_RUNNING:
        return ChildWorkflowExecutionFailedCause.WORKFLOW_ALREADY_RUNNING;
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/EnumMapper.java`
#### Snippet
```java
    switch (t) {
      case SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_FAILED_CAUSE_INVALID:
        return null;
      case SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_FAILED_CAUSE_UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION:
        return SignalExternalWorkflowExecutionFailedCause.UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION;
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/EnumMapper.java`
#### Snippet
```java
    switch (t) {
      case ARCHIVAL_STATUS_INVALID:
        return null;
      case ARCHIVAL_STATUS_DISABLED:
        return ArchivalStatus.DISABLED;
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/EnumMapper.java`
#### Snippet
```java
    switch (t) {
      case PENDING_DECISION_STATE_INVALID:
        return null;
      case PENDING_DECISION_STATE_SCHEDULED:
        return PendingDecisionState.SCHEDULED;
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/worker/ActivityPollTask.java`
#### Snippet
```java
      }
      options.getMetricsScope().counter(MetricsType.ACTIVITY_POLL_NO_TASK_COUNTER).inc(1);
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      com.uber.cadence.GetWorkflowExecutionHistoryRequest t) {
    if (t == null) {
      return null;
    }
    GetWorkflowExecutionHistoryRequest.Builder builder =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      com.uber.cadence.RespondActivityTaskCompletedRequest t) {
    if (t == null) {
      return null;
    }
    RespondActivityTaskCompletedRequest.Builder builder =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      com.uber.cadence.PollForDecisionTaskRequest t) {
    if (t == null) {
      return null;
    }
    PollForDecisionTaskRequest.Builder builder =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      com.uber.cadence.RespondActivityTaskCanceledByIDRequest t) {
    if (t == null) {
      return null;
    }
    RespondActivityTaskCanceledByIDRequest.Builder builder =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      com.uber.cadence.ListWorkflowExecutionsRequest t) {
    if (t == null) {
      return null;
    }
    ScanWorkflowExecutionsRequest.Builder request =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      com.uber.cadence.RespondDecisionTaskFailedRequest t) {
    if (t == null) {
      return null;
    }
    RespondDecisionTaskFailedRequest.Builder builder =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      com.uber.cadence.ListWorkflowExecutionsRequest t) {
    if (t == null) {
      return null;
    }
    ListWorkflowExecutionsRequest.Builder request =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      com.uber.cadence.SignalWithStartWorkflowExecutionRequest t) {
    if (t == null) {
      return null;
    }
    StartWorkflowExecutionRequest.Builder builder =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      com.uber.cadence.DescribeWorkflowExecutionRequest t) {
    if (t == null) {
      return null;
    }
    return DescribeWorkflowExecutionRequest.newBuilder()
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      com.uber.cadence.RegisterDomainRequest t) {
    if (t == null) {
      return null;
    }
    RegisterDomainRequest request =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      com.uber.cadence.RespondQueryTaskCompletedRequest t) {
    if (t == null) {
      return null;
    }
    WorkflowQueryResult.Builder wqBuilder =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      com.uber.cadence.CountWorkflowExecutionsRequest t) {
    if (t == null) {
      return null;
    }
    CountWorkflowExecutionsRequest.Builder request =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      com.uber.cadence.TerminateWorkflowExecutionRequest t) {
    if (t == null) {
      return null;
    }
    TerminateWorkflowExecutionRequest.Builder builder =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      com.uber.cadence.DescribeDomainRequest t) {
    if (t == null) {
      return null;
    }
    if (t.uuid != null) {
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      com.uber.cadence.StartWorkflowExecutionRequest t) {
    if (t == null) {
      return null;
    }
    StartWorkflowExecutionRequest.Builder request =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      com.uber.cadence.DeprecateDomainRequest t) {
    if (t == null) {
      return null;
    }
    return DeprecateDomainRequest.newBuilder()
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      com.uber.cadence.ResetStickyTaskListRequest t) {
    if (t == null) {
      return null;
    }
    return ResetStickyTaskListRequest.newBuilder()
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      com.uber.cadence.ListTaskListPartitionsRequest t) {
    if (t == null) {
      return null;
    }
    return ListTaskListPartitionsRequest.newBuilder()
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
  public static ListDomainsRequest listDomainsRequest(com.uber.cadence.ListDomainsRequest t) {
    if (t == null) {
      return null;
    }
    ListDomainsRequest.Builder request = ListDomainsRequest.newBuilder().setPageSize(t.pageSize);
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      com.uber.cadence.ListClosedWorkflowExecutionsRequest t) {
    if (t == null) {
      return null;
    }
    ListClosedWorkflowExecutionsRequest.Builder request =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      com.uber.cadence.ResetWorkflowExecutionRequest t) {
    if (t == null) {
      return null;
    }
    return ResetWorkflowExecutionRequest.newBuilder()
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      com.uber.cadence.DescribeTaskListRequest t) {
    if (t == null) {
      return null;
    }
    return DescribeTaskListRequest.newBuilder()
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      com.uber.cadence.RespondActivityTaskFailedByIDRequest t) {
    if (t == null) {
      return null;
    }
    RespondActivityTaskFailedByIDRequest.Builder builder =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      com.uber.cadence.RequestCancelWorkflowExecutionRequest t) {
    if (t == null) {
      return null;
    }
    RequestCancelWorkflowExecutionRequest.Builder builder =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      com.uber.cadence.RespondActivityTaskCanceledRequest t) {
    if (t == null) {
      return null;
    }
    RespondActivityTaskCanceledRequest.Builder builder =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      com.uber.cadence.RecordActivityTaskHeartbeatRequest t) {
    if (t == null) {
      return null;
    }
    RecordActivityTaskHeartbeatRequest.Builder builder =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      com.uber.cadence.SignalWorkflowExecutionRequest t) {
    if (t == null) {
      return null;
    }
    SignalWorkflowExecutionRequest.Builder builder =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      com.uber.cadence.RecordActivityTaskHeartbeatByIDRequest t) {
    if (t == null) {
      return null;
    }
    RecordActivityTaskHeartbeatByIDRequest.Builder builder =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
  public static QueryWorkflowRequest queryWorkflowRequest(com.uber.cadence.QueryWorkflowRequest t) {
    if (t == null) {
      return null;
    }
    return QueryWorkflowRequest.newBuilder()
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/Helpers.java`
#### Snippet
```java
  static ByteString arrayToByteString(byte[] t) {
    if (t == null) {
      return null;
    }
    return ByteString.copyFrom(t);
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      com.uber.cadence.PollForActivityTaskRequest t) {
    if (t == null) {
      return null;
    }
    PollForActivityTaskRequest.Builder builder =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      com.uber.cadence.ListOpenWorkflowExecutionsRequest t) {
    if (t == null) {
      return null;
    }
    ListOpenWorkflowExecutionsRequest.Builder request =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      com.uber.cadence.ListArchivedWorkflowExecutionsRequest t) {
    if (t == null) {
      return null;
    }
    ListArchivedWorkflowExecutionsRequest.Builder request =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      com.uber.cadence.RespondDecisionTaskCompletedRequest t) {
    if (t == null) {
      return null;
    }
    RespondDecisionTaskCompletedRequest.Builder builder =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      com.uber.cadence.RespondActivityTaskFailedRequest t) {
    if (t == null) {
      return null;
    }
    RespondActivityTaskFailedRequest.Builder builder =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
  public static UpdateDomainRequest updateDomainRequest(com.uber.cadence.UpdateDomainRequest t) {
    if (t == null) {
      return null;
    }
    Builder request =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/RequestMapper.java`
#### Snippet
```java
      com.uber.cadence.RespondActivityTaskCompletedByIDRequest t) {
    if (t == null) {
      return null;
    }
    RespondActivityTaskCompletedByIDRequest.Builder builder =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/ResponseMapper.java`
#### Snippet
```java
      com.uber.cadence.api.v1.DescribeDomainResponse t) {
    if (t == null) {
      return null;
    }
    DescribeDomainResponse response = new DescribeDomainResponse();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/ResponseMapper.java`
#### Snippet
```java
      com.uber.cadence.api.v1.ListWorkflowExecutionsResponse t) {
    if (t == null) {
      return null;
    }
    ListWorkflowExecutionsResponse res = new ListWorkflowExecutionsResponse();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/ResponseMapper.java`
#### Snippet
```java
      com.uber.cadence.api.v1.DescribeWorkflowExecutionResponse t) {
    if (t == null) {
      return null;
    }
    DescribeWorkflowExecutionResponse describeWorkflowExecutionResponse =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/ResponseMapper.java`
#### Snippet
```java
      com.uber.cadence.api.v1.ResetWorkflowExecutionResponse t) {
    if (t == null) {
      return null;
    }
    ResetWorkflowExecutionResponse res = new ResetWorkflowExecutionResponse();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/ResponseMapper.java`
#### Snippet
```java
      com.uber.cadence.api.v1.ListTaskListPartitionsResponse t) {
    if (t == null) {
      return null;
    }
    ListTaskListPartitionsResponse res = new ListTaskListPartitionsResponse();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/ResponseMapper.java`
#### Snippet
```java
      com.uber.cadence.api.v1.RecordActivityTaskHeartbeatResponse t) {
    if (t == null) {
      return null;
    }
    RecordActivityTaskHeartbeatResponse res = new RecordActivityTaskHeartbeatResponse();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/ResponseMapper.java`
#### Snippet
```java
      com.uber.cadence.api.v1.StartWorkflowExecutionResponse t) {
    if (t == null) {
      return null;
    }
    StartWorkflowExecutionResponse startWorkflowExecutionResponse =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/ResponseMapper.java`
#### Snippet
```java
      com.uber.cadence.api.v1.ListClosedWorkflowExecutionsResponse t) {
    if (t == null) {
      return null;
    }
    ListClosedWorkflowExecutionsResponse res = new ListClosedWorkflowExecutionsResponse();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/ResponseMapper.java`
#### Snippet
```java
      com.uber.cadence.api.v1.ListDomainsResponse t) {
    if (t == null) {
      return null;
    }
    ListDomainsResponse res = new ListDomainsResponse();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/ResponseMapper.java`
#### Snippet
```java
      com.uber.cadence.api.v1.PollForActivityTaskResponse t) {
    if (t == null) {
      return null;
    }
    PollForActivityTaskResponse res = new PollForActivityTaskResponse();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/ResponseMapper.java`
#### Snippet
```java
      com.uber.cadence.api.v1.ListOpenWorkflowExecutionsResponse t) {
    if (t == null) {
      return null;
    }
    ListOpenWorkflowExecutionsResponse res = new ListOpenWorkflowExecutionsResponse();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/ResponseMapper.java`
#### Snippet
```java
      com.uber.cadence.api.v1.SignalWithStartWorkflowExecutionResponse t) {
    if (t == null) {
      return null;
    }
    StartWorkflowExecutionResponse startWorkflowExecutionResponse =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/ResponseMapper.java`
#### Snippet
```java
      com.uber.cadence.api.v1.QueryWorkflowResponse t) {
    if (t == null) {
      return null;
    }
    QueryWorkflowResponse res = new QueryWorkflowResponse();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/ResponseMapper.java`
#### Snippet
```java
      com.uber.cadence.api.v1.GetWorkflowExecutionHistoryResponse t) {
    if (t == null) {
      return null;
    }
    GetWorkflowExecutionHistoryResponse getWorkflowExecutionHistoryResponse =
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/ResponseMapper.java`
#### Snippet
```java
      com.uber.cadence.api.v1.CountWorkflowExecutionsResponse t) {
    if (t == null) {
      return null;
    }
    CountWorkflowExecutionsResponse res = new CountWorkflowExecutionsResponse();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/ResponseMapper.java`
#### Snippet
```java
      com.uber.cadence.api.v1.GetClusterInfoResponse t) {
    if (t == null) {
      return null;
    }
    ClusterInfo clusterInfo = new ClusterInfo();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/ResponseMapper.java`
#### Snippet
```java
      com.uber.cadence.api.v1.PollForDecisionTaskResponse t) {
    if (t == null) {
      return null;
    }
    PollForDecisionTaskResponse res = new PollForDecisionTaskResponse();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/ResponseMapper.java`
#### Snippet
```java
      com.uber.cadence.api.v1.RespondDecisionTaskCompletedResponse t) {
    if (t == null) {
      return null;
    }
    RespondDecisionTaskCompletedResponse res = new RespondDecisionTaskCompletedResponse();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/ResponseMapper.java`
#### Snippet
```java
      com.uber.cadence.api.v1.GetSearchAttributesResponse t) {
    if (t == null) {
      return null;
    }
    GetSearchAttributesResponse getSearchAttributesResponse = new GetSearchAttributesResponse();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/ResponseMapper.java`
#### Snippet
```java
      com.uber.cadence.api.v1.ScanWorkflowExecutionsResponse t) {
    if (t == null) {
      return null;
    }
    ListWorkflowExecutionsResponse res = new ListWorkflowExecutionsResponse();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/ResponseMapper.java`
#### Snippet
```java
      com.uber.cadence.api.v1.DescribeTaskListResponse t) {
    if (t == null) {
      return null;
    }
    DescribeTaskListResponse describeTaskListResponse = new DescribeTaskListResponse();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/ResponseMapper.java`
#### Snippet
```java
      com.uber.cadence.api.v1.UpdateDomainResponse t) {
    if (t == null) {
      return null;
    }
    UpdateDomainResponse updateDomainResponse = new UpdateDomainResponse();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/ResponseMapper.java`
#### Snippet
```java
      com.uber.cadence.api.v1.ListArchivedWorkflowExecutionsResponse t) {
    if (t == null) {
      return null;
    }
    ListArchivedWorkflowExecutionsResponse res = new ListArchivedWorkflowExecutionsResponse();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/thrift/ResponseMapper.java`
#### Snippet
```java
      com.uber.cadence.api.v1.RecordActivityTaskHeartbeatByIDResponse t) {
    if (t == null) {
      return null;
    }
    RecordActivityTaskHeartbeatResponse res = new RecordActivityTaskHeartbeatResponse();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/sync/WorkflowQueueImpl.java`
#### Snippet
```java
      try {
        if (element == null) {
          return null;
        }
        return mapper.apply(element);
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/sync/WorkflowQueueImpl.java`
#### Snippet
```java
    WorkflowThread.await(unit.toMillis(timeout), "WorkflowQueue.poll", () -> !queue.isEmpty());
    if (queue.isEmpty()) {
      return null;
    }
    return queue.remove();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/sync/CompletablePromiseImpl.java`
#### Snippet
```java
            this.complete(value);
          }
          return null;
        });
    return true;
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/sync/CompletablePromiseImpl.java`
#### Snippet
```java
      return failure;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/activity/ActivityOptions.java`
#### Snippet
```java
    if (options == null) {
      if (annotationSeconds == 0) {
        return null;
      }
      return Duration.ofSeconds(annotationSeconds);
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/worker/WorkerFactory.java`
#### Snippet
```java
  String getStickyTaskListName() {
    return this.factoryOptions.isDisableStickyExecution()
        ? null
        : String.format("%s:%s:%s", STICKY_TASK_LIST_PREFIX, getHostName(), stickyTasklistRandomId);
  }
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/workflow/WorkflowUtils.java`
#### Snippet
```java
      SearchAttributes searchAttributes, String key, Class<T> classType) {
    if (searchAttributes == null || StringUtils.isEmpty(key)) {
      return null;
    }
    return jsonConverter.fromData(getValueBytes(searchAttributes, key), classType, classType);
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/DecisionMapper.java`
#### Snippet
```java
  static Decision decision(com.uber.cadence.Decision d) {
    if (d == null) {
      return null;
    }
    Builder decision = Decision.newBuilder();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/compatibility/proto/DecisionMapper.java`
#### Snippet
```java
  static List<Decision> decisionArray(List<com.uber.cadence.Decision> t) {
    if (t == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/replay/DeciderCache.java`
#### Snippet
```java
      // We don't have a default loader and don't want to have one. So it's ok to get null value.
      metricsScope.counter(MetricsType.STICKY_CACHE_MISS).inc(1);
      return null;
    } finally {
      cacheLock.unlock();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/replay/DeciderCache.java`
#### Snippet
```java
                  @Override
                  public Decider load(String key) {
                    return null;
                  }
                });
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/sync/WorkflowRetryerInternal.java`
#### Snippet
```java
        () -> {
          proc.apply();
          return null;
        });
  }
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/internal/replay/WorkflowDecisionContext.java`
#### Snippet
```java
  private Header toHeaderThrift(Map<String, byte[]> headers) {
    if (headers == null || headers.isEmpty()) {
      return null;
    }
    Map<String, ByteBuffer> fields = new HashMap<>();
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/converter/JsonDataConverter.java`
#### Snippet
```java
  public byte[] toData(Object... values) throws DataConverterException {
    if (values == null || values.length == 0) {
      return null;
    }
    try {
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/converter/JsonDataConverter.java`
#### Snippet
```java
      throws DataConverterException {
    if (content == null) {
      return null;
    }
    try {
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/converter/JsonDataConverter.java`
#### Snippet
```java
      }
      if (!Throwable.class.isAssignableFrom(typeToken.getRawType())) {
        return null; // this class only serializes 'Throwable' and its subtypes
      }

```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/serviceclient/WorkflowServiceTChannel.java`
#### Snippet
```java
            (e) -> {
              log.error("Unexpected error in SignalWorkflowExecution", e);
              return null;
            });
  }
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/serviceclient/WorkflowServiceTChannel.java`
#### Snippet
```java
            (e) -> {
              log.error("Unexpected error in StartWorkflowExecution", e);
              return null;
            });
  }
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/serviceclient/WorkflowServiceTChannel.java`
#### Snippet
```java
            (e) -> {
              log.error("Unexpected error in GetWorkflowExecutionHistory", e);
              return null;
            });
  }
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/serviceclient/WorkflowServiceTChannel.java`
#### Snippet
```java
        () -> {
          proc.apply();
          return null;
        });
  }
```

### ReturnNull
Return of `null`
in `src/main/java/com/uber/cadence/workflow/Workflow.java`
#### Snippet
```java
        () -> {
          proc.apply();
          return null;
        });
  }
```

## RuleId[id=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `e`
in `src/main/java/com/uber/cadence/internal/sync/WorkflowStubImpl.java`
#### Snippet
```java
            (r, e) -> {
              if (e instanceof CompletionException) {
                e = e.getCause();
              }
              if (e instanceof WorkflowExecutionFailedException) {
```

## RuleId[id=UnnecessaryLocalVariable]
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
in `src/main/java/com/uber/cadence/internal/common/WorkflowExecutionUtils.java`
#### Snippet
```java

          try {
            Thread.sleep(ENTITY_NOT_EXIST_RETRY_WAIT_MILLIS);
          } catch (InterruptedException ie) {
            // Throw entity not exist here.
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

