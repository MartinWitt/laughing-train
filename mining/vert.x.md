# vert.x 
 
# Bad smells
I found 1544 bad smells with 33 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=UnnecessaryFullyQualifiedName] | 433 | false |
| RuleId[ruleID=ReturnNull] | 180 | false |
| RuleId[ruleID=BoundedWildcard] | 152 | false |
| RuleId[ruleID=UNUSED_IMPORT] | 125 | false |
| RuleId[ruleID=SystemOutErr] | 117 | false |
| RuleId[ruleID=CodeBlock2Expr] | 58 | false |
| RuleId[ruleID=SynchronizeOnThis] | 58 | false |
| RuleId[ruleID=UtilityClassWithoutPrivateConstructor] | 48 | false |
| RuleId[ruleID=AssignmentToMethodParameter] | 43 | false |
| RuleId[ruleID=MissortedModifiers] | 38 | false |
| RuleId[ruleID=NestedAssignment] | 24 | false |
| RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized] | 23 | false |
| RuleId[ruleID=PublicFieldAccessedInSynchronizedContext] | 23 | false |
| RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern] | 17 | false |
| RuleId[ruleID=Convert2MethodRef] | 16 | false |
| RuleId[ruleID=ZeroLengthArrayInitialization] | 13 | false |
| RuleId[ruleID=SizeReplaceableByIsEmpty] | 12 | true |
| RuleId[ruleID=UnnecessaryQualifierForThis] | 10 | false |
| RuleId[ruleID=EmptyMethod] | 9 | false |
| RuleId[ruleID=CopyConstructorMissesField] | 9 | false |
| RuleId[ruleID=DeprecatedIsStillUsed] | 7 | false |
| RuleId[ruleID=UnnecessaryToStringCall] | 7 | true |
| RuleId[ruleID=NonProtectedConstructorInAbstractClass] | 7 | true |
| RuleId[ruleID=SimplifyStreamApiCallChains] | 6 | false |
| RuleId[ruleID=NonSerializableFieldInSerializableClass] | 6 | false |
| RuleId[ruleID=ThrowablePrintStackTrace] | 6 | false |
| RuleId[ruleID=DefaultAnnotationParam] | 5 | false |
| RuleId[ruleID=RedundantMethodOverride] | 5 | false |
| RuleId[ruleID=ConstantValue] | 5 | false |
| RuleId[ruleID=DataFlowIssue] | 5 | false |
| RuleId[ruleID=InnerClassMayBeStatic] | 5 | true |
| RuleId[ruleID=IgnoreResultOfCall] | 4 | false |
| RuleId[ruleID=AssignmentToLambdaParameter] | 4 | false |
| RuleId[ruleID=EnumSwitchStatementWhichMissesCases] | 3 | false |
| RuleId[ruleID=DuplicateThrows] | 3 | false |
| RuleId[ruleID=UnusedAssignment] | 3 | false |
| RuleId[ruleID=StringOperationCanBeSimplified] | 3 | false |
| RuleId[ruleID=RedundantSuppression] | 3 | false |
| RuleId[ruleID=Java8MapApi] | 3 | false |
| RuleId[ruleID=UseCompareMethod] | 3 | false |
| RuleId[ruleID=EmptyStatementBody] | 2 | false |
| RuleId[ruleID=NonShortCircuitBoolean] | 2 | false |
| RuleId[ruleID=ClassNameSameAsAncestorName] | 2 | false |
| RuleId[ruleID=RedundantImplements] | 2 | false |
| RuleId[ruleID=UnnecessarySemicolon] | 2 | false |
| RuleId[ruleID=StringEqualsEmptyString] | 2 | false |
| RuleId[ruleID=Finalize] | 1 | false |
| RuleId[ruleID=UnnecessaryModifier] | 1 | true |
| RuleId[ruleID=UnnecessaryStringEscape] | 1 | false |
| RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod] | 1 | false |
| RuleId[ruleID=RegExpRedundantEscape] | 1 | false |
| RuleId[ruleID=Java8ListReplaceAll] | 1 | false |
| RuleId[ruleID=RegExpSimplifiable] | 1 | false |
| RuleId[ruleID=AbstractClassNeverImplemented] | 1 | false |
| RuleId[ruleID=AnonymousHasLambdaAlternative] | 1 | false |
| RuleId[ruleID=IntegerMultiplicationImplicitCastToLong] | 1 | false |
| RuleId[ruleID=UnnecessarySuperQualifier] | 1 | false |
| RuleId[ruleID=SlowListContainsAll] | 1 | false |
| RuleId[ruleID=RedundantFieldInitialization] | 1 | false |
| RuleId[ruleID=HtmlWrongAttributeValue] | 1 | false |
| RuleId[ruleID=InstanceofCatchParameter] | 1 | false |
| RuleId[ruleID=NonStaticFinalLogger] | 1 | false |
| RuleId[ruleID=CastConflictsWithInstanceof] | 1 | false |
| RuleId[ruleID=NonExceptionNameEndsWithException] | 1 | false |
| RuleId[ruleID=UnnecessaryCallToStringValueOf] | 1 | false |
| RuleId[ruleID=ComparatorCombinators] | 1 | false |
| RuleId[ruleID=NonSynchronizedMethodOverridesSynchronizedMethod] | 1 | false |
| RuleId[ruleID=CatchMayIgnoreException] | 1 | false |
| RuleId[ruleID=ProtectedMemberInFinalClass] | 1 | true |
| RuleId[ruleID=AssignmentToForLoopParameter] | 1 | false |
| RuleId[ruleID=RedundantEscapeInRegexReplacement] | 1 | false |
| RuleId[ruleID=MissingDeprecatedAnnotation] | 1 | false |
| RuleId[ruleID=Convert2Lambda] | 1 | false |
| RuleId[ruleID=UnnecessaryContinue] | 1 | false |
| RuleId[ruleID=BusyWait] | 1 | false |
| RuleId[ruleID=ThrowableNotThrown] | 1 | false |
| RuleId[ruleID=CastCanBeRemovedNarrowingVariableType] | 1 | false |
## RuleId[ruleID=EnumSwitchStatementWhichMissesCases]
### RuleId[ruleID=EnumSwitchStatementWhichMissesCases]
`switch (event.type()) { case START_OBJECT: // Set array value mode to handle each ...` statement on enum type 'io.vertx.core.parsetools.JsonEventType' misses cases: 'START_ARRAY', and 'END_ARRAY'
in `src/main/java/examples/ParseToolsExamples.java`
#### Snippet
```java
      // Start the object

      switch (event.type()) {
        case START_OBJECT:
          // Set array value mode to handle each entry, from now on the parser won't emit start array events
          parser.arrayValueMode();
          break;
        case VALUE:
          // Handle each array
          // Get the field in which this object was parsed
          System.out.println("Value : " + event.value());
          break;
        case END_OBJECT:
          // Set the array event mode so the parser emits start/end object events again
          parser.arrayEventMode();
          break;
      }
    });

```

### RuleId[ruleID=EnumSwitchStatementWhichMissesCases]
`switch (event.type()) { case START_OBJECT: // Set object value mode to handle each...` statement on enum type 'io.vertx.core.parsetools.JsonEventType' misses cases: 'START_ARRAY', and 'END_ARRAY'
in `src/main/java/examples/ParseToolsExamples.java`
#### Snippet
```java
      // Start the object

      switch (event.type()) {
        case START_OBJECT:
          // Set object value mode to handle each entry, from now on the parser won't emit start object events
          parser.objectValueMode();
          break;
        case VALUE:
          // Handle each object
          // Get the field in which this object was parsed
          String id = event.fieldName();
          System.out.println("User with id " + id + " : " + event.value());
          break;
        case END_OBJECT:
          // Set the object event mode so the parser emits start/end object events again
          parser.objectEventMode();
          break;
      }
    });

```

### RuleId[ruleID=EnumSwitchStatementWhichMissesCases]
`switch (event.type()) { case START_ARRAY: // Start the array break; ...` statement on enum type 'io.vertx.core.parsetools.JsonEventType' misses cases: 'START_OBJECT', and 'END_OBJECT'
in `src/main/java/examples/ParseToolsExamples.java`
#### Snippet
```java

    parser.handler(event -> {
      switch (event.type()) {
        case START_ARRAY:
          // Start the array
          break;
        case END_ARRAY:
          // End the array
          break;
        case VALUE:
          // Handle each object
          break;
      }
    });

```

## RuleId[ruleID=Finalize]
### RuleId[ruleID=Finalize]
'finalize()' should not be overridden
in `src/main/java/io/vertx/core/impl/CloseFuture.java`
#### Snippet
```java

  @Override
  protected void finalize() {
    close();
  }
```

## RuleId[ruleID=UnnecessaryModifier]
### RuleId[ruleID=UnnecessaryModifier]
Modifier `private` is redundant for enum constructors
in `src/main/java/io/vertx/core/dns/DnsResponseCode.java`
#### Snippet
```java
    }

    private DnsResponseCode(int errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
```

## RuleId[ruleID=EmptyStatementBody]
### RuleId[ruleID=EmptyStatementBody]
`if` statement has empty body
in `src/main/java/examples/ParseToolsExamples.java`
#### Snippet
```java
          } else {
            // In an array or top level
            if (event.isString()) {

            } else {
```

### RuleId[ruleID=EmptyStatementBody]
`switch` statement has empty body
in `src/main/generated/io/vertx/core/tracing/TracingOptionsConverter.java`
#### Snippet
```java
   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, TracingOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
      }
    }
```

## RuleId[ruleID=UnnecessaryStringEscape]
### RuleId[ruleID=UnnecessaryStringEscape]
`\'` is unnecessarily escaped
in `src/main/java/io/vertx/core/impl/launcher/commands/ExecUtils.java`
#### Snippet
```java
public class ExecUtils {

  private static final String SINGLE_QUOTE = "\'";
  private static final String DOUBLE_QUOTE = "\"";

```

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `PROCESS_ARGS` from instance context
in `src/main/java/io/vertx/core/impl/launcher/VertxCommandLauncher.java`
#### Snippet
```java
  public void dispatch(Object main, String[] args) {
    this.main = main == null ? this : main;
    PROCESS_ARGS = Collections.unmodifiableList(Arrays.asList(args));

    // Several cases need to be detected here.
```

## RuleId[ruleID=RegExpRedundantEscape]
### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\/` in RegExp
in `src/main/java/io/vertx/core/json/pointer/impl/JsonPointerImpl.java`
#### Snippet
```java
    if (VALID_POINTER_PATTERN.matcher(pointer).matches()) {
      return Arrays
          .stream(pointer.split("\\/", -1))
          .skip(1) //Ignore first element
          .map(this::unescape)
```

## RuleId[ruleID=Java8ListReplaceAll]
### RuleId[ruleID=Java8ListReplaceAll]
The loop can be replaced with 'List.replaceAll'
in `src/main/java/io/vertx/core/impl/ConversionHelper.java`
#### Snippet
```java
    }
    List<Object> list = new ArrayList<>(json.getList());
    for (int i = 0; i < list.size(); i++) {
      list.set(i, fromObject(list.get(i)));
    }
```

## RuleId[ruleID=UnnecessaryQualifierForThis]
### RuleId[ruleID=UnnecessaryQualifierForThis]
Qualifier `Endpoint` on 'this' is unnecessary in this context
in `src/main/java/io/vertx/core/net/impl/pool/Endpoint.java`
#### Snippet
```java
    requestConnection(ctx, timeout, ar -> {
      boolean dispose;
      synchronized (Endpoint.this) {
        pendingRequestCount--;
        dispose = checkDispose();
```

### RuleId[ruleID=UnnecessaryQualifierForThis]
Qualifier `HttpServerFileUploadImpl` on 'this' is unnecessary in this context
in `src/main/java/io/vertx/core/http/impl/HttpServerFileUploadImpl.java`
#### Snippet
```java
      Future<Void> to = pipe.to(f);
      return to.compose(v -> {
        synchronized (HttpServerFileUploadImpl.this) {
          if (!cancelled) {
            file = f;
```

### RuleId[ruleID=UnnecessaryQualifierForThis]
Qualifier `HttpServerFileUploadImpl` on 'this' is unnecessary in this context
in `src/main/java/io/vertx/core/http/impl/HttpServerFileUploadImpl.java`
#### Snippet
```java
  private void handleData(Buffer data) {
    Handler<Buffer> handler;
    synchronized (HttpServerFileUploadImpl.this) {
      handler = dataHandler;
      if (lazyCalculateSize) {
```

### RuleId[ruleID=UnnecessaryQualifierForThis]
Qualifier `HttpClientImpl` on 'this' is unnecessary in this context
in `src/main/java/io/vertx/core/http/impl/HttpClientImpl.java`
#### Snippet
```java
            connectOptions.getSubProtocols(),
            connectOptions.getTimeout(),
            HttpClientImpl.this.options.getMaxWebSocketFrameSize(),
            promise);
        } else {
```

### RuleId[ruleID=UnnecessaryQualifierForThis]
Qualifier `DeploymentImpl` on 'this' is unnecessary in this context
in `src/main/java/io/vertx/core/impl/DeploymentManager.java`
#### Snippet
```java
        doUndeployChildren(callingContext).onComplete(childrenResult -> {
          Handler<Void> handler;
          synchronized (DeploymentImpl.this) {
            status = ST_UNDEPLOYED;
            handler = undeployHandler;
```

### RuleId[ruleID=UnnecessaryQualifierForThis]
Qualifier `PacketWriteStreamImpl` on 'this' is unnecessary in this context
in `src/main/java/io/vertx/core/datagram/impl/PacketWriteStreamImpl.java`
#### Snippet
```java
  public void write(Buffer data, Handler<AsyncResult<Void>> handler) {
    datagramSocket.send(data, port, host, ar -> {
      PacketWriteStreamImpl.this.handle(ar);
      if (handler != null) {
        handler.handle(ar.mapEmpty());
```

### RuleId[ruleID=UnnecessaryQualifierForThis]
Qualifier `PipeImpl` on 'this' is unnecessary in this context
in `src/main/java/io/vertx/core/streams/impl/PipeImpl.java`
#### Snippet
```java
    boolean endOnSuccess;
    boolean endOnFailure;
    synchronized (PipeImpl.this) {
      if (dst != null) {
        throw new IllegalStateException();
```

### RuleId[ruleID=UnnecessaryQualifierForThis]
Qualifier `InboundDeliveryContext` on 'super' is unnecessary in this context
in `src/main/java/io/vertx/core/eventbus/impl/HandlerRegistration.java`
#### Snippet
```java

    protected void execute() {
      ContextInternal ctx = InboundDeliveryContext.super.context;
      Object m = metric;
      VertxTracer tracer = ctx.tracer();
```

### RuleId[ruleID=UnnecessaryQualifierForThis]
Qualifier `MessageConsumerImpl` on 'this' is unnecessary in this context
in `src/main/java/io/vertx/core/eventbus/impl/MessageConsumerImpl.java`
#### Snippet
```java
        Message<T> message;
        Handler<Message<T>> theHandler;
        synchronized (MessageConsumerImpl.this) {
          if (demand == 0L || (message = pending.poll()) == null) {
            return;
```

### RuleId[ruleID=UnnecessaryQualifierForThis]
Qualifier `LockWaiter` on 'this' is unnecessary in this context
in `src/main/java/io/vertx/core/shareddata/impl/LocalAsyncLocks.java`
#### Snippet
```java
      waitersMap.compute(lockName, (s, list) -> {
        int idx;
        if (list == null || (idx = list.indexOf(LockWaiter.this)) == -1) {
          // Already removed by release()
          return list;
```

## RuleId[ruleID=RegExpSimplifiable]
### RuleId[ruleID=RegExpSimplifiable]
`\\p{Digit}` can be simplified to '\\d'
in `src/main/java/io/vertx/core/http/impl/HttpClientImpl.java`
#### Snippet
```java

  // Pattern to check we are not dealing with an absoluate URI
  private static final Pattern ABS_URI_START_PATTERN = Pattern.compile("^\\p{Alpha}[\\p{Alpha}\\p{Digit}+.\\-]*:");

  private static final Function<HttpClientResponse, Future<RequestOptions>> DEFAULT_HANDLER = resp -> {
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### RuleId[ruleID=SizeReplaceableByIsEmpty]
`cli.getSummary().trim().length() > 0` can be replaced with '!cli.getSummary().trim().isEmpty()'
in `src/main/java/io/vertx/core/cli/UsageMessageFormatter.java`
#### Snippet
```java
    computeUsageLine(builder, prefix, cli);

    if (cli.getSummary() != null && cli.getSummary().trim().length() > 0) {
      buildWrapped(builder, "\n" + cli.getSummary());
    }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`cli.getDescription().trim().length() > 0` can be replaced with '!cli.getDescription().trim().isEmpty()'
in `src/main/java/io/vertx/core/cli/UsageMessageFormatter.java`
#### Snippet
```java
      buildWrapped(builder, "\n" + cli.getSummary());
    }
    if (cli.getDescription() != null && cli.getDescription().trim().length() > 0) {
      buildWrapped(builder, "\n" + cli.getDescription());
    }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`option.getArgName().length() != 0` can be replaced with '!option.getArgName().isEmpty()'
in `src/main/java/io/vertx/core/cli/UsageMessageFormatter.java`
#### Snippet
```java
    } else {
      // if the Option accepts values and a non blank argname
      if (option.acceptValue() && (option.getArgName() == null || option.getArgName().length() != 0)) {
        buff.append(isNullOrEmpty(option.getShortName()) ? getLongOptionSeparator() : " ");
        buff.append("<").append(option.getArgName() != null ? option.getArgName() : getArgName()).append(">");
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`s.trim().length() == 0` can be replaced with 's.trim().isEmpty()'
in `src/main/java/io/vertx/core/cli/UsageMessageFormatter.java`
#### Snippet
```java

  public static boolean isNullOrEmpty(String s) {
    return s == null || s.trim().length() == 0;
  }

```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`argName.length() == 0` can be replaced with 'argName.isEmpty()'
in `src/main/java/io/vertx/core/cli/UsageMessageFormatter.java`
#### Snippet
```java
      } else if (option.acceptValue()) {
        String argName = option.getArgName();
        if (argName != null && argName.length() == 0) {
          // if the option has a blank argname
          buf.append(' ');
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`s.length() == 0` can be replaced with 's.isEmpty()'
in `src/main/java/io/vertx/core/cli/UsageMessageFormatter.java`
#### Snippet
```java
   */
  public static String rtrim(String s) {
    if (s == null || s.length() == 0) {
      return s;
    }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`factories.size() > 0` can be replaced with '!factories.isEmpty()'
in `src/main/java/io/vertx/core/spi/Utils.java`
#### Snippet
```java
    List<JsonFactory> factories = new ArrayList<>(ServiceHelper.loadFactories(io.vertx.core.spi.JsonFactory.class));
    factories.sort(Comparator.comparingInt(JsonFactory::order));
    if (factories.size() > 0) {
      return factories.iterator().next();
    } else {
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`deployments.size() != 0` can be replaced with '!deployments.isEmpty()'
in `src/main/java/io/vertx/core/impl/HAManager.java`
#### Snippet
```java
      String chosen = chooseHashedNode(group, failedNodeID.hashCode());
      if (chosen != null && chosen.equals(this.nodeID)) {
        if (deployments != null && deployments.size() != 0) {
          log.info("node" + nodeID + " says: Node " + failedNodeID + " has failed. This node will deploy " + deployments.size() + " deploymentIDs from that node.");
          for (Object obj: deployments) {
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`decodedTokens.size() == 0` can be replaced with 'decodedTokens.isEmpty()'
in `src/main/java/io/vertx/core/json/pointer/impl/JsonPointerImpl.java`
#### Snippet
```java
  @Override
  public boolean isRootPointer() {
    return decodedTokens.size() == 0;
  }

```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`pending.size() > 0` can be replaced with '!pending.isEmpty()'
in `src/main/java/io/vertx/core/eventbus/impl/MessageConsumerImpl.java`
#### Snippet
```java
        return true;
      } else {
        if (pending.size() > 0) {
          pending.add(message);
          message = pending.poll();
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`pending.size() > 0` can be replaced with '!pending.isEmpty()'
in `src/main/java/io/vertx/core/eventbus/impl/MessageConsumerImpl.java`
#### Snippet
```java
      endHandler.handle(null);
    }
    if (pending.size() > 0) {
      Queue<Message<T>> discarded = pending;
      Handler<Message<T>> handler = discardHandler;
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`pending.size() > 0` can be replaced with '!pending.isEmpty()'
in `src/main/java/io/vertx/core/parsetools/impl/JsonParserImpl.java`
#### Snippet
```java
  @Override
  public JsonParser endHandler(Handler<Void> handler) {
    if (pending.size() > 0 || !ended) {
      endHandler = handler;
    }
```

## RuleId[ruleID=NonShortCircuitBoolean]
### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `overflow |= !writable`
in `src/main/java/io/vertx/core/streams/impl/InboundBuffer.java`
#### Snippet
```java
          emitting = false;
          boolean writable = size < highWaterMark;
          overflow |= !writable;
          return writable;
        } else if (size == 0) {
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `overflow |= !writable`
in `src/main/java/io/vertx/core/streams/impl/InboundBuffer.java`
#### Snippet
```java
      long actual = pending.size() - demand;
      boolean writable = actual < highWaterMark;
      overflow |= !writable;
      return writable;
    }
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `VertxWrapper` has no concrete subclass
in `src/main/java/io/vertx/core/impl/VertxWrapper.java`
#### Snippet
```java
 * interface can be overridden.
 */
public abstract class VertxWrapper implements VertxInternal {

  protected final VertxInternal delegate;
```

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `src/main/java/io/vertx/core/Future.java`
#### Snippet
```java
   */
  @GenIgnore
  static <T> Future<T> fromCompletionStage(CompletionStage<T> completionStage, Context context) {
    Promise<T> promise = ((ContextInternal) context).promise();
    completionStage.whenComplete((value, err) -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Throwable`
in `src/main/java/io/vertx/core/Future.java`
#### Snippet
```java
   */
  @Fluent
  default Future<T> onFailure(Handler<Throwable> handler) {
    return onComplete(ar -> {
      if (ar.failed()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Promise`
in `src/main/java/io/vertx/core/Future.java`
#### Snippet
```java
   * @return the future.
   */
  static <T> Future<T> future(Handler<Promise<T>> handler) {
    Promise<T> promise = Promise.promise();
    try {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AsyncResult`
in `src/main/java/io/vertx/core/Future.java`
#### Snippet
```java
   * @return a future completed after the {@code handler} has been invoked
   */
  default Future<T> andThen(Handler<AsyncResult<T>> handler) {
    return transform(ar -> {
      handler.handle(ar);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `src/main/java/io/vertx/core/Future.java`
#### Snippet
```java
   */
  @GenIgnore
  static <T> Future<T> fromCompletionStage(CompletionStage<T> completionStage) {
    Promise<T> promise = Promise.promise();
    completionStage.whenComplete((value, err) -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `src/main/java/io/vertx/core/Future.java`
#### Snippet
```java
   */
  @Fluent
  default Future<T> onSuccess(Handler<T> handler) {
    return onComplete(ar -> {
      if (ar.succeeded()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `src/main/java/io/vertx/core/cli/converters/FromBasedConverter.java`
#### Snippet
```java
  private final Class<T> clazz;

  private FromBasedConverter(Class<T> clazz, Method method) {
    this.clazz = clazz;
    this.method = method;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `src/main/java/io/vertx/core/cli/converters/ConstructorBasedConverter.java`
#### Snippet
```java
  private final Constructor<T> constructor;

  private ConstructorBasedConverter(Constructor<T> constructor) {
    this.constructor = constructor;
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `src/main/java/io/vertx/core/cli/converters/FromStringBasedConverter.java`
#### Snippet
```java
  private final Class<T> clazz;

  private FromStringBasedConverter(Class<T> clazz, Method method) {
    this.clazz = clazz;
    this.method = method;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `src/main/java/io/vertx/core/cli/converters/ValueOfBasedConverter.java`
#### Snippet
```java
  private final Class<T> clazz;

  private ValueOfBasedConverter(Class<T> clazz, Method method) {
    this.clazz = clazz;
    this.method = method;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `src/main/java/io/vertx/core/cli/impl/DefaultCommandLine.java`
#### Snippet
```java


  public static <T> List<T> createFromList(String raw, TypedOption<T> option) {
    if (raw == null) {
      return Collections.emptyList();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Argument`
in `src/main/java/io/vertx/core/cli/impl/DefaultCLI.java`
#### Snippet
```java

  @Override
  public CLI setArguments(List<Argument> args) {
    Objects.requireNonNull(args);
    arguments = new ArrayList<>(args);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Option`
in `src/main/java/io/vertx/core/cli/impl/DefaultCLI.java`
#### Snippet
```java

  @Override
  public CLI addOptions(List<Option> options) {
    Objects.requireNonNull(options);
    options.forEach(this::addOption);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Argument`
in `src/main/java/io/vertx/core/cli/impl/DefaultCLI.java`
#### Snippet
```java

  @Override
  public CLI addArguments(List<Argument> args) {
    Objects.requireNonNull(args);
    args.forEach(this::addArgument);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Buffer`
in `src/main/java/io/vertx/core/net/PemKeyCertOptions.java`
#### Snippet
```java
   * @return a reference to this, so the API can be used fluently
   */
  public PemKeyCertOptions setCertValues(List<Buffer> certValues) {
    this.certValues.clear();
    this.certValues.addAll(certValues);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Buffer`
in `src/main/java/io/vertx/core/net/PemKeyCertOptions.java`
#### Snippet
```java
   * @return a reference to this, so the API can be used fluently
   */
  public PemKeyCertOptions setKeyValues(List<Buffer> keyValues) {
    this.keyValues.clear();
    this.keyValues.addAll(keyValues);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AsyncResult`
in `src/main/java/io/vertx/core/net/impl/pool/Endpoint.java`
#### Snippet
```java
  }

  public boolean getConnection(ContextInternal ctx, long timeout, Handler<AsyncResult<C>> handler) {
    synchronized (this) {
      if (disposed) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super S`
in `src/main/java/io/vertx/core/net/impl/pool/SemaphoreExecutor.java`
#### Snippet
```java

  @Override
  public void submit(Action<S> action) {
    lock.lock();
    Task post = null;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Endpoint`
in `src/main/java/io/vertx/core/net/impl/pool/ConnectionManager.java`
#### Snippet
```java
  private final Map<K, Endpoint<C>> endpointMap = new ConcurrentHashMap<>();

  public void forEach(Consumer<Endpoint<C>> consumer) {
    endpointMap.values().forEach(consumer);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Iterable`
in `src/main/java/io/vertx/core/spi/cluster/impl/DefaultNodeSelector.java`
#### Snippet
```java

  @Override
  public void selectForPublish(Message<?> message, Promise<Iterable<String>> promise) {
    Arguments.require(!message.isSend(), "selectForPublish used for sending");
    selectors.withSelector(message, promise, (prom, selector) -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/io/vertx/core/spi/cluster/impl/DefaultNodeSelector.java`
#### Snippet
```java

  @Override
  public void selectForSend(Message<?> message, Promise<String> promise) {
    Arguments.require(message.isSend(), "selectForSend used for publishing");
    selectors.withSelector(message, promise, (prom, selector) -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/io/vertx/core/spi/tracing/TagExtractor.java`
#### Snippet
```java
   * @param consumer the consumer populated with the tags extracted from the object
   */
  default void extractTo(T obj, BiConsumer<String, String> consumer) {
    int len = len(obj);
    for (int idx = 0;idx < len;idx++) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/io/vertx/core/spi/tracing/TagExtractor.java`
#### Snippet
```java
   * @param consumer the consumer populated with the tags extracted from the object
   */
  default void extractTo(T obj, BiConsumer<String, String> consumer) {
    int len = len(obj);
    for (int idx = 0;idx < len;idx++) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/io/vertx/core/spi/tracing/TagExtractor.java`
#### Snippet
```java
   * @param tags the map populated with the tags extracted from the object
   */
  default void extractTo(T obj, Map<String, String> tags) {
    int len = len(obj);
    for (int idx = 0;idx < len;idx++) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/io/vertx/core/spi/tracing/TagExtractor.java`
#### Snippet
```java
   * @param tags the map populated with the tags extracted from the object
   */
  default void extractTo(T obj, Map<String, String> tags) {
    int len = len(obj);
    for (int idx = 0;idx < len;idx++) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends C`
in `src/main/java/io/vertx/core/spi/launcher/DefaultCommandFactory.java`
#### Snippet
```java
   * @param supplier the {@link Command} implementation
   */
  public DefaultCommandFactory(Class<C> clazz, Supplier<C> supplier) {
    this.clazz = clazz;
    this.supplier = supplier;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Weight`
in `src/main/java/io/vertx/core/spi/cluster/impl/selector/SelectorEntry.java`
#### Snippet
```java
  }

  private boolean isEvenlyDistributed(Map<String, Weight> weights) {
    if (weights.size() > 1) {
      Weight previous = null;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Promise`
in `src/main/java/io/vertx/core/spi/cluster/impl/selector/Selectors.java`
#### Snippet
```java
  }

  public <T> void withSelector(Message<?> message, Promise<T> promise, BiConsumer<Promise<T>, RoundRobinSelector> task) {
    String address = message.address();
    SelectorEntry entry = map.compute(address, (addr, curr) -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super RoundRobinSelector`
in `src/main/java/io/vertx/core/spi/cluster/impl/selector/Selectors.java`
#### Snippet
```java
  }

  public <T> void withSelector(Message<?> message, Promise<T> promise, BiConsumer<Promise<T>, RoundRobinSelector> task) {
    String address = message.address();
    SelectorEntry entry = map.compute(address, (addr, curr) -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends RegistrationInfo`
in `src/main/java/io/vertx/core/spi/cluster/impl/selector/Selectors.java`
#### Snippet
```java
  }

  private List<String> computeAccessible(List<RegistrationInfo> registrations) {
    if (registrations == null || registrations.isEmpty()) {
      return Collections.emptyList();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AsyncResult`>
in `src/main/java/io/vertx/core/http/impl/SharedClientHttpStreamEndpoint.java`
#### Snippet
```java

  @Override
  public void connect(EventLoopContext context, Listener listener, Handler<AsyncResult<ConnectResult<HttpClientConnection>>> handler) {
    connector.httpConnect(context, ar -> {
      if (ar.succeeded()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AsyncResult`>
in `src/main/java/io/vertx/core/http/impl/SharedClientHttpStreamEndpoint.java`
#### Snippet
```java
    private long timerID;

    Request(ContextInternal context, HttpVersion protocol, long timeout, Handler<AsyncResult<Lease<HttpClientConnection>>> handler) {
      this.context = context;
      this.protocol = protocol;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super HttpClientResponse`
in `src/main/java/io/vertx/core/http/impl/HttpClientRequestPushPromise.java`
#### Snippet
```java

  @Override
  void handleResponse(Promise<HttpClientResponse> promise, HttpClientResponse resp, long timeoutMs) {
    promise.complete(resp);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AsyncResult`
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
    private boolean cancelled;

    public Cancel(PoolWaiter<C> waiter, Handler<AsyncResult<Boolean>> handler) {
      this.waiter = waiter;
      this.handler = handler;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends C`
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
    private PoolWaiter<C> waiter;

    private ConnectSuccess(Slot<C> slot, ConnectResult<C> result, PoolWaiter<C> waiter) {
      this.slot = slot;
      this.result = result;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super C`
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
    private final Handler<AsyncResult<List<C>>> handler;

    public Evict(Predicate<C> predicate, Handler<AsyncResult<List<C>>> handler) {
      this.predicate = predicate;
      this.handler = handler;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AsyncResult`>
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
    private final Handler<AsyncResult<List<C>>> handler;

    public Evict(Predicate<C> predicate, Handler<AsyncResult<List<C>>> handler) {
      this.predicate = predicate;
      this.handler = handler;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AsyncResult`>>
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
    private final Handler<AsyncResult<List<Future<C>>>> handler;

    private Close(Handler<AsyncResult<List<Future<C>>>> handler) {
      this.handler = handler;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AsyncResult`
in `src/main/java/io/vertx/core/http/impl/HttpNetSocket.java`
#### Snippet
```java

  @Override
  public NetSocket upgradeToSsl(String serverName, Handler<AsyncResult<Void>> handler) {
    handler.handle(upgradeToSsl(serverName));
    return this;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Buffer`
in `src/main/java/io/vertx/core/http/impl/HttpNetSocket.java`
#### Snippet
```java
  private Handler<Buffer> dataHandler;

  private HttpNetSocket(ConnectionBase conn, ContextInternal context, ReadStream<Buffer> readStream, WriteStream<Buffer> writeStream) {
    this.conn = conn;
    this.context = context;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AsyncResult`
in `src/main/java/io/vertx/core/http/impl/HttpNetSocket.java`
#### Snippet
```java

  @Override
  public NetSocket upgradeToSsl(Handler<AsyncResult<Void>> handler) {
    handler.handle(upgradeToSsl());
    return this;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AsyncResult`
in `src/main/java/io/vertx/core/http/impl/HttpNetSocket.java`
#### Snippet
```java

  @Override
  public NetSocket sendFile(String filename, long offset, long length, Handler<AsyncResult<Void>> resultHandler) {
    VertxInternal vertx = conn.getContext().owner();
    Handler<AsyncResult<Void>> h;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AsyncResult`
in `src/main/java/io/vertx/core/http/impl/WebSocketEndpoint.java`
#### Snippet
```java
  }

  private void tryConnect(ContextInternal ctx, Handler<AsyncResult<HttpClientConnection>> handler) {

    class Listener implements Handler<AsyncResult<HttpClientConnection>> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super CloseFuture`
in `src/main/java/io/vertx/core/impl/SharedClientHolder.java`
#### Snippet
```java
class SharedClientHolder<C> implements Shareable {

  static <C> C createSharedClient(Vertx vertx, String clientKey, String clientName, CloseFuture closeFuture, Function<CloseFuture, C> supplier) {
    LocalMap<String, SharedClientHolder<C>> localMap = vertx.sharedData().getLocalMap(clientKey);
    SharedClientHolder<C> v = localMap.compute(clientName, (key, value) -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Promise`
in `src/main/java/io/vertx/core/impl/ContextBase.java`
#### Snippet
```java
  }

  static <T> Future<T> executeBlocking(ContextInternal context, Handler<Promise<T>> blockingCodeHandler,
      WorkerPool workerPool, TaskQueue queue) {
    PoolMetrics metrics = workerPool.metrics();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends VertxServiceProvider`
in `src/main/java/io/vertx/core/impl/VertxBuilder.java`
#### Snippet
```java
  }

  private void initProviders(Collection<VertxServiceProvider> providers) {
    for (VertxServiceProvider provider : providers) {
      provider.init(this);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super VertxServiceProvider`
in `src/main/java/io/vertx/core/impl/VertxBuilder.java`
#### Snippet
```java
  }

  private static void initTracing(VertxOptions options, Collection<VertxServiceProvider> providers) {
    TracingOptions tracingOptions = options.getTracingOptions();
    if (tracingOptions != null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super VertxServiceProvider`
in `src/main/java/io/vertx/core/impl/VertxBuilder.java`
#### Snippet
```java
  }

  private static void initMetrics(VertxOptions options, Collection<VertxServiceProvider> providers) {
    MetricsOptions metricsOptions = options.getMetricsOptions();
    if (metricsOptions != null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super VertxServiceProvider`
in `src/main/java/io/vertx/core/impl/VertxBuilder.java`
#### Snippet
```java
  }

  private static void initClusterManager(VertxOptions options, Collection<VertxServiceProvider> providers) {
    ClusterManager clusterManager = options.getClusterManager();
    if (clusterManager == null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends VerticleFactory`
in `src/main/java/io/vertx/core/impl/VerticleManager.java`
#### Snippet
```java


  private Future<Deployment> doDeployVerticle(Iterator<VerticleFactory> iter,
                                              Throwable prevErr,
                                              String identifier,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AsyncResult`
in `src/main/java/io/vertx/core/impl/HAManager.java`
#### Snippet
```java

  private void doDeployVerticle(final String verticleName, DeploymentOptions deploymentOptions,
                                final Handler<AsyncResult<String>> doneHandler) {
    final Handler<AsyncResult<String>> wrappedHandler = ar1 -> {
      vertx.<String>executeBlocking(fut -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super HttpClientRequest`
in `src/main/java/io/vertx/core/http/impl/HttpClientImpl.java`
#### Snippet
```java
    ProxyOptions proxyOptions,
    EndpointKey key,
    PromiseInternal<HttpClientRequest> requestPromise) {
    ContextInternal ctx = requestPromise.context();
    EndpointProvider<Lease<HttpClientConnection>> provider = new EndpointProvider<Lease<HttpClientConnection>>() {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Throwable`
in `src/main/java/io/vertx/core/impl/future/Otherwise.java`
#### Snippet
```java
  private final Function<Throwable, T> mapper;

  Otherwise(ContextInternal context, Function<Throwable, T> mapper) {
    super(context);
    this.mapper = mapper;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `src/main/java/io/vertx/core/impl/future/Otherwise.java`
#### Snippet
```java
  private final Function<Throwable, T> mapper;

  Otherwise(ContextInternal context, Function<Throwable, T> mapper) {
    super(context);
    this.mapper = mapper;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `src/main/java/io/vertx/core/impl/future/Mapping.java`
#### Snippet
```java
  private final Function<T, U> successMapper;

  Mapping(ContextInternal context, Function<T, U> successMapper) {
    super(context);
    this.successMapper = successMapper;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends U`
in `src/main/java/io/vertx/core/impl/future/Mapping.java`
#### Snippet
```java
  private final Function<T, U> successMapper;

  Mapping(ContextInternal context, Function<T, U> successMapper) {
    super(context);
    this.successMapper = successMapper;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Throwable`
in `src/main/java/io/vertx/core/impl/future/FailedFuture.java`
#### Snippet
```java

  @Override
  public Future<T> onFailure(Handler<Throwable> handler) {
    if (context != null) {
      context.emit(cause, handler);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AsyncResult`
in `src/main/java/io/vertx/core/impl/future/FailedFuture.java`
#### Snippet
```java

  @Override
  public Future<T> onComplete(Handler<AsyncResult<T>> handler) {
    if (handler instanceof Listener) {
      emitFailure(cause, (Listener<T>) handler);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `src/main/java/io/vertx/core/impl/future/SucceededFuture.java`
#### Snippet
```java

  @Override
  public Future<T> onSuccess(Handler<T> handler) {
    if (context != null) {
      context.emit(result, handler);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AsyncResult`
in `src/main/java/io/vertx/core/impl/future/SucceededFuture.java`
#### Snippet
```java

  @Override
  public Future<T> onComplete(Handler<AsyncResult<T>> handler) {
    if (handler instanceof Listener) {
      emitSuccess(result ,(Listener<T>) handler);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super CompositeFuture`
in `src/main/java/io/vertx/core/impl/future/CompositeFutureImpl.java`
#### Snippet
```java
  }

  private  static CompositeFuture join(Function<CompositeFuture, Object> pred, Future<?>... results) {
    CompositeFutureImpl composite = new CompositeFutureImpl(results);
    int len = results.length;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `src/main/java/io/vertx/core/impl/future/Composition.java`
#### Snippet
```java
  private final Function<Throwable, Future<U>> failureMapper;

  Composition(ContextInternal context, Function<T, Future<U>> successMapper, Function<Throwable, Future<U>> failureMapper) {
    super(context);
    this.successMapper = successMapper;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Throwable`
in `src/main/java/io/vertx/core/impl/future/Composition.java`
#### Snippet
```java
  private final Function<Throwable, Future<U>> failureMapper;

  Composition(ContextInternal context, Function<T, Future<U>> successMapper, Function<Throwable, Future<U>> failureMapper) {
    super(context);
    this.successMapper = successMapper;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AsyncResult`
in `src/main/java/io/vertx/core/impl/future/FutureImpl.java`
#### Snippet
```java

  @Override
  public Future<T> onComplete(Handler<AsyncResult<T>> handler) {
    Objects.requireNonNull(handler, "No null handler accepted");
    Listener<T> listener;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `src/main/java/io/vertx/core/impl/future/FutureImpl.java`
#### Snippet
```java

  @Override
  public Future<T> onSuccess(Handler<T> handler) {
    Objects.requireNonNull(handler, "No null handler accepted");
    addListener(new Listener<T>() {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Throwable`
in `src/main/java/io/vertx/core/impl/future/FutureImpl.java`
#### Snippet
```java

  @Override
  public Future<T> onFailure(Handler<Throwable> handler) {
    Objects.requireNonNull(handler, "No null handler accepted");
    addListener(new Listener<T>() {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AsyncResult`
in `src/main/java/io/vertx/core/impl/future/Transformation.java`
#### Snippet
```java
  private final Function<AsyncResult<T>, Future<U>> mapper;

  Transformation(ContextInternal context, Future<T> future, Function<AsyncResult<T>, Future<U>> mapper) {
    super(context);
    this.future = future;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/io/vertx/core/impl/launcher/commands/ExecUtils.java`
#### Snippet
```java
   * @param argument the argument to add
   */
  public static void addArgument(List<String> args, String argument) {
    args.add(quoteArgument(argument));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `src/main/java/io/vertx/core/impl/future/FutureBase.java`
#### Snippet
```java
  }

  protected final void emitSuccess(T value, Listener<T> listener) {
    if (context != null && !context.isRunningOnContext()) {
      context.execute(() -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AsyncResult`
in `src/main/java/io/vertx/core/impl/launcher/commands/VertxIsolatedDeployer.java`
#### Snippet
```java
   * @param completionHandler the completion handler
   */
  public void undeploy(Handler<AsyncResult<Void>> completionHandler) {
    vertx.undeploy(deploymentId, res -> {
      if (res.failed()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AsyncResult`
in `src/main/java/io/vertx/core/impl/launcher/commands/VertxIsolatedDeployer.java`
#### Snippet
```java

  private Handler<AsyncResult<String>> createHandler(final String message,
                                                   final Handler<AsyncResult<String>>
                                                       completionHandler) {
    return res -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Verticle`
in `src/main/java/io/vertx/core/impl/DeploymentManager.java`
#### Snippet
```java

  Future<Deployment> doDeploy(DeploymentOptions options,
                                  Function<Verticle, String> identifierProvider,
                                  ContextInternal parentContext,
                                  ContextInternal callingContext,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Verticle`
in `src/main/java/io/vertx/core/impl/DeploymentManager.java`
#### Snippet
```java
                                  ContextInternal parentContext,
                                  ContextInternal callingContext,
                                  ClassLoader tccl, Callable<Verticle> verticleSupplier) {
    int nbInstances = options.getInstances();
    Set<Verticle> verticles = Collections.newSetFromMap(new IdentityHashMap<>());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AsyncResult`
in `src/main/java/io/vertx/core/impl/DeploymentManager.java`
#### Snippet
```java
    }

    void close(Handler<AsyncResult<Void>> completionHandler) {
      closeFuture.close().onComplete(ar -> {
        if (workerPool != null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AsyncResult`
in `src/main/java/io/vertx/core/impl/DeploymentManager.java`
#### Snippet
```java
  }

  private <T> void reportResult(Context context, Handler<AsyncResult<T>> completionHandler, AsyncResult<T> result) {
    context.runOnContext(v -> {
      try {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends File`
in `src/main/java/io/vertx/core/impl/launcher/commands/Watcher.java`
#### Snippet
```java
  }

  private void addFilesToWatchedList(List<File> roots) {
    roots.forEach(this::addFileToWatchedList);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `src/main/java/io/vertx/core/streams/impl/InboundBuffer.java`
#### Snippet
```java
   * @return {@code false} when the producer should stop writing
   */
  public boolean write(Iterable<E> elements) {
    checkThread();
    synchronized (this) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Throwable`
in `src/main/java/io/vertx/core/datagram/impl/PacketWriteStreamImpl.java`
#### Snippet
```java

  @Override
  public PacketWriteStreamImpl exceptionHandler(Handler<Throwable> handler) {
    exceptionHandler = handler;
    return this;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AsyncResult`
in `src/main/java/io/vertx/core/datagram/impl/PacketWriteStreamImpl.java`
#### Snippet
```java

  @Override
  public void write(Buffer data, Handler<AsyncResult<Void>> handler) {
    datagramSocket.send(data, port, host, ar -> {
      PacketWriteStreamImpl.this.handle(ar);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Map.Entry`
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java
    final Iterator<Map.Entry<String, Object>> mapIter;

    Iter(Iterator<Map.Entry<String, Object>> mapIter) {
      this.mapIter = mapIter;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `src/main/java/io/vertx/core/streams/impl/PipeImpl.java`
#### Snippet
```java

  @Override
  public void to(WriteStream<T> ws, Handler<AsyncResult<Void>> completionHandler) {
    if (ws == null) {
      throw new NullPointerException();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AsyncResult`
in `src/main/java/io/vertx/core/streams/impl/PipeImpl.java`
#### Snippet
```java
  }

  private void handleFailure(Throwable cause, Handler<AsyncResult<Void>> completionHandler) {
    Future<Void> res = Future.failedFuture(cause);
    if (endOnFailure){
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `src/main/java/io/vertx/core/streams/impl/PipeImpl.java`
#### Snippet
```java
  private WriteStream<T> dst;

  public PipeImpl(ReadStream<T> src) {
    this.src = src;
    this.result = Promise.promise();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Message`
in `src/main/java/io/vertx/core/eventbus/impl/BodyReadStream.java`
#### Snippet
```java
  private ReadStream<Message<T>> delegate;

  public BodyReadStream(ReadStream<Message<T>> delegate) {
    this.delegate = delegate;
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Message`
in `src/main/java/io/vertx/core/eventbus/impl/clustered/Serializer.java`
#### Snippet
```java
        ContextInternal context,
        Message<?> msg,
        BiConsumer<Message<?>, Promise<U>> selectHandler) {
        this.msg = msg;
        this.selectHandler = selectHandler;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Promise`
in `src/main/java/io/vertx/core/eventbus/impl/clustered/Serializer.java`
#### Snippet
```java
        ContextInternal context,
        Message<?> msg,
        BiConsumer<Message<?>, Promise<U>> selectHandler) {
        this.msg = msg;
        this.selectHandler = selectHandler;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Message`
in `src/main/java/io/vertx/core/eventbus/impl/MessageConsumerImpl.java`
#### Snippet
```java

  @Override
  protected void dispatch(Message<T> msg, ContextInternal context, Handler<Message<T>> handler) {
    if (handler == null) {
      throw new NullPointerException();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Lock`
in `src/main/java/io/vertx/core/shareddata/impl/LocalAsyncLocks.java`
#### Snippet
```java
    final Long timerId;

    LockWaiter(ContextInternal context, String lockName, long timeout, Promise<Lock> promise) {
      this.lockName = lockName;
      this.promise = promise;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super EventBusImpl`
in `src/main/java/io/vertx/core/eventbus/impl/EventBusImpl.java`
#### Snippet
```java
  }

  private void addInterceptor(AtomicReferenceFieldUpdater<EventBusImpl, Handler[]> updater, Handler interceptor) {
    while (true) {
      Handler[] interceptors = updater.get(this);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends HandlerHolder`
in `src/main/java/io/vertx/core/eventbus/impl/EventBusImpl.java`
#### Snippet
```java
  }

  protected HandlerHolder nextHandler(ConcurrentCyclicSequence<HandlerHolder> handlers, boolean messageLocal) {
    return handlers.next();
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AsyncResult`
in `src/main/java/io/vertx/core/eventbus/impl/EventBusImpl.java`
#### Snippet
```java
  }

  protected void callCompletionHandlerAsync(Handler<AsyncResult<Void>> completionHandler) {
    if (completionHandler != null) {
      vertx.runOnContext(v -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super EventBusImpl`
in `src/main/java/io/vertx/core/eventbus/impl/EventBusImpl.java`
#### Snippet
```java
  }

  private void removeInterceptor(AtomicReferenceFieldUpdater<EventBusImpl, Handler[]> updater, Handler interceptor) {
    while (true) {
      Handler[] interceptors = updater.get(this);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Throwable`
in `src/main/java/io/vertx/core/parsetools/impl/JsonParserImpl.java`
#### Snippet
```java

  @Override
  public JsonParser exceptionHandler(Handler<Throwable> handler) {
    exceptionHandler = handler;
    return this;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super JsonEvent`
in `src/main/java/io/vertx/core/parsetools/impl/JsonParserImpl.java`
#### Snippet
```java

  @Override
  public JsonParser handler(Handler<JsonEvent> handler) {
    eventHandler = handler;
    if (stream != null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/examples/SharedDataExamples.java`
#### Snippet
```java
  }

  public void example4(AsyncMap<String, String> map) {
    map.get("foo", resGet -> {
      if (resGet.succeeded()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/examples/SharedDataExamples.java`
#### Snippet
```java
  }

  public void example3(AsyncMap<String, String> map) {
    map.put("foo", "bar", resPut -> {
      if (resPut.succeeded()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/examples/SharedDataExamples.java`
#### Snippet
```java
  }

  public void example3(AsyncMap<String, String> map) {
    map.put("foo", "bar", resPut -> {
      if (resPut.succeeded()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/generated/io/vertx/core/DeploymentOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(DeploymentOptions obj, java.util.Map<String, Object> json) {
    if (obj.getConfig() != null) {
      json.put("config", obj.getConfig());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends java.util.Map.Entry`
in `src/main/generated/io/vertx/core/DeploymentOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, DeploymentOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/generated/io/vertx/core/net/OpenSSLEngineOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(OpenSSLEngineOptions obj, java.util.Map<String, Object> json) {
    json.put("sessionCacheEnabled", obj.isSessionCacheEnabled());
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends java.util.Map.Entry`
in `src/main/generated/io/vertx/core/net/OpenSSLEngineOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, OpenSSLEngineOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends java.util.Map.Entry`
in `src/main/generated/io/vertx/core/net/NetServerOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, NetServerOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/generated/io/vertx/core/net/NetServerOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(NetServerOptions obj, java.util.Map<String, Object> json) {
    json.put("acceptBacklog", obj.getAcceptBacklog());
    if (obj.getClientAuth() != null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends java.util.Map.Entry`
in `src/main/generated/io/vertx/core/net/ProxyOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, ProxyOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/generated/io/vertx/core/net/ProxyOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(ProxyOptions obj, java.util.Map<String, Object> json) {
    if (obj.getHost() != null) {
      json.put("host", obj.getHost());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/generated/io/vertx/core/net/ClientOptionsBaseConverter.java`
#### Snippet
```java
  }

   static void toJson(ClientOptionsBase obj, java.util.Map<String, Object> json) {
    json.put("connectTimeout", obj.getConnectTimeout());
    if (obj.getLocalAddress() != null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends java.util.Map.Entry`
in `src/main/generated/io/vertx/core/net/ClientOptionsBaseConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, ClientOptionsBase obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends java.util.Map.Entry`
in `src/main/generated/io/vertx/core/net/NetClientOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, NetClientOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/generated/io/vertx/core/net/NetClientOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(NetClientOptions obj, java.util.Map<String, Object> json) {
    if (obj.getApplicationLayerProtocols() != null) {
      JsonArray array = new JsonArray();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/generated/io/vertx/core/net/PemTrustOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(PemTrustOptions obj, java.util.Map<String, Object> json) {
    if (obj.getCertPaths() != null) {
      JsonArray array = new JsonArray();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends java.util.Map.Entry`
in `src/main/generated/io/vertx/core/net/PemTrustOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, PemTrustOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/generated/io/vertx/core/file/CopyOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(CopyOptions obj, java.util.Map<String, Object> json) {
    json.put("atomicMove", obj.isAtomicMove());
    json.put("copyAttributes", obj.isCopyAttributes());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends java.util.Map.Entry`
in `src/main/generated/io/vertx/core/file/CopyOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, CopyOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends java.util.Map.Entry`
in `src/main/generated/io/vertx/core/net/JksOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, JksOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/generated/io/vertx/core/net/JksOptionsConverter.java`
#### Snippet
```java
  }

  public static void toJson(JksOptions obj, java.util.Map<String, Object> json) {
    if (obj.getAlias() != null) {
      json.put("alias", obj.getAlias());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends java.util.Map.Entry`
in `src/main/generated/io/vertx/core/cli/ArgumentConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, Argument obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/generated/io/vertx/core/cli/ArgumentConverter.java`
#### Snippet
```java
  }

   static void toJson(Argument obj, java.util.Map<String, Object> json) {
    if (obj.getArgName() != null) {
      json.put("argName", obj.getArgName());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/generated/io/vertx/core/net/KeyStoreOptionsConverter.java`
#### Snippet
```java
  }

  public static void toJson(KeyStoreOptions obj, java.util.Map<String, Object> json) {
    if (obj.getAlias() != null) {
      json.put("alias", obj.getAlias());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends java.util.Map.Entry`
in `src/main/generated/io/vertx/core/net/KeyStoreOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, KeyStoreOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/generated/io/vertx/core/net/PfxOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(PfxOptions obj, java.util.Map<String, Object> json) {
    if (obj.getAlias() != null) {
      json.put("alias", obj.getAlias());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends java.util.Map.Entry`
in `src/main/generated/io/vertx/core/net/PfxOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, PfxOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends java.util.Map.Entry`
in `src/main/generated/io/vertx/core/cli/OptionConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, Option obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/generated/io/vertx/core/cli/OptionConverter.java`
#### Snippet
```java
  }

   static void toJson(Option obj, java.util.Map<String, Object> json) {
    if (obj.getArgName() != null) {
      json.put("argName", obj.getArgName());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/generated/io/vertx/core/dns/AddressResolverOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(AddressResolverOptions obj, java.util.Map<String, Object> json) {
    json.put("cacheMaxTimeToLive", obj.getCacheMaxTimeToLive());
    json.put("cacheMinTimeToLive", obj.getCacheMinTimeToLive());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends java.util.Map.Entry`
in `src/main/generated/io/vertx/core/dns/AddressResolverOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, AddressResolverOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/generated/io/vertx/core/VertxOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(VertxOptions obj, java.util.Map<String, Object> json) {
    if (obj.getAddressResolverOptions() != null) {
      json.put("addressResolverOptions", obj.getAddressResolverOptions().toJson());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends java.util.Map.Entry`
in `src/main/generated/io/vertx/core/VertxOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, VertxOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/generated/io/vertx/core/file/FileSystemOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(FileSystemOptions obj, java.util.Map<String, Object> json) {
    json.put("classPathResolvingEnabled", obj.isClassPathResolvingEnabled());
    if (obj.getFileCacheDir() != null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends java.util.Map.Entry`
in `src/main/generated/io/vertx/core/file/FileSystemOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, FileSystemOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/generated/io/vertx/core/file/OpenOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(OpenOptions obj, java.util.Map<String, Object> json) {
    json.put("append", obj.isAppend());
    json.put("create", obj.isCreate());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends java.util.Map.Entry`
in `src/main/generated/io/vertx/core/file/OpenOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, OpenOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(PemKeyCertOptions obj, java.util.Map<String, Object> json) {
    if (obj.getCertPaths() != null) {
      JsonArray array = new JsonArray();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends java.util.Map.Entry`
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, PemKeyCertOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends java.util.Map.Entry`
in `src/main/generated/io/vertx/core/http/WebSocketConnectOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, WebSocketConnectOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/generated/io/vertx/core/http/WebSocketConnectOptionsConverter.java`
#### Snippet
```java
  }

  public static void toJson(WebSocketConnectOptions obj, java.util.Map<String, Object> json) {
    json.put("allowOriginHeader", obj.getAllowOriginHeader());
    if (obj.getSubProtocols() != null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/generated/io/vertx/core/metrics/MetricsOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(MetricsOptions obj, java.util.Map<String, Object> json) {
    json.put("enabled", obj.isEnabled());
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends java.util.Map.Entry`
in `src/main/generated/io/vertx/core/metrics/MetricsOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, MetricsOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends java.util.Map.Entry`
in `src/main/generated/io/vertx/core/http/Http2SettingsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, Http2Settings obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/generated/io/vertx/core/http/Http2SettingsConverter.java`
#### Snippet
```java
  }

   static void toJson(Http2Settings obj, java.util.Map<String, Object> json) {
    json.put("headerTableSize", obj.getHeaderTableSize());
    json.put("initialWindowSize", obj.getInitialWindowSize());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends java.util.Map.Entry`
in `src/main/generated/io/vertx/core/tracing/TracingOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, TracingOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(TCPSSLOptions obj, java.util.Map<String, Object> json) {
    if (obj.getCrlPaths() != null) {
      JsonArray array = new JsonArray();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends java.util.Map.Entry`
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, TCPSSLOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends java.util.Map.Entry`
in `src/main/generated/io/vertx/core/http/RequestOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, RequestOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/generated/io/vertx/core/http/RequestOptionsConverter.java`
#### Snippet
```java
  }

  public static void toJson(RequestOptions obj, java.util.Map<String, Object> json) {
    if (obj.getFollowRedirects() != null) {
      json.put("followRedirects", obj.getFollowRedirects());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/generated/io/vertx/core/http/GoAwayConverter.java`
#### Snippet
```java
  }

   static void toJson(GoAway obj, java.util.Map<String, Object> json) {
    if (obj.getDebugData() != null) {
      json.put("debugData", BASE64_ENCODER.encodeToString(obj.getDebugData().getBytes()));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends java.util.Map.Entry`
in `src/main/generated/io/vertx/core/http/GoAwayConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, GoAway obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends java.util.Map.Entry`
in `src/main/generated/io/vertx/core/datagram/DatagramSocketOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, DatagramSocketOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/generated/io/vertx/core/datagram/DatagramSocketOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(DatagramSocketOptions obj, java.util.Map<String, Object> json) {
    json.put("broadcast", obj.isBroadcast());
    json.put("ipV6", obj.isIpV6());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/generated/io/vertx/core/http/HttpServerOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(HttpServerOptions obj, java.util.Map<String, Object> json) {
    json.put("acceptUnmaskedFrames", obj.isAcceptUnmaskedFrames());
    if (obj.getAlpnVersions() != null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends java.util.Map.Entry`
in `src/main/generated/io/vertx/core/http/HttpServerOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, HttpServerOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/generated/io/vertx/core/http/HttpClientOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(HttpClientOptions obj, java.util.Map<String, Object> json) {
    if (obj.getAlpnVersions() != null) {
      JsonArray array = new JsonArray();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends java.util.Map.Entry`
in `src/main/generated/io/vertx/core/http/HttpClientOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, HttpClientOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

## RuleId[ruleID=MissortedModifiers]
### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `static @Nullable`
in `src/main/java/io/vertx/core/Vertx.java`
#### Snippet
```java
   * @return The current context or {@code null} if there is no current context
   */
  static @Nullable Context currentContext() {
    return ContextInternal.current();
  }
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
    private final static int ANY = 0x00;
    private final static int BOOLEAN = 0x01;
    private final static int INTEGER = 0x02;
    private final static int BIT_STRING = 0x03;
    private final static int OCTET_STRING = 0x04;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
    private final static int IA5_STRING = 0x16;
    private final static int GRAPHIC_STRING = 0x19;
    private final static int ISO646_STRING = 0x1A;
    private final static int GENERAL_STRING = 0x1B;

```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
    private final static int UTF8_STRING = 0x0C;
    private final static int UNIVERSAL_STRING = 0x1C;
    private final static int BMP_STRING = 0x1E;

    private final static int UTC_TIME = 0x17;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java

    private final static int SEQUENCE = 0x10;
    private final static int SET = 0x11;

    private final static int NUMERIC_STRING = 0x12;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
    private final static int BIT_STRING = 0x03;
    private final static int OCTET_STRING = 0x04;
    private final static int NULL = 0x05;
    private final static int OBJECT_IDENTIFIER = 0x06;
    private final static int REAL = 0x09;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
    private final static int VIDEOTEX_STRING = 0x15;
    private final static int IA5_STRING = 0x16;
    private final static int GRAPHIC_STRING = 0x19;
    private final static int ISO646_STRING = 0x1A;
    private final static int GENERAL_STRING = 0x1B;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java

    // Classes
    private final static int UNIVERSAL = 0x00;
    private final static int APPLICATION = 0x40;
    private final static int CONTEXT = 0x80;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
    private final static int INTEGER = 0x02;
    private final static int BIT_STRING = 0x03;
    private final static int OCTET_STRING = 0x04;
    private final static int NULL = 0x05;
    private final static int OBJECT_IDENTIFIER = 0x06;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
    private final static int PRINTABLE_STRING = 0x13;
    private final static int VIDEOTEX_STRING = 0x15;
    private final static int IA5_STRING = 0x16;
    private final static int GRAPHIC_STRING = 0x19;
    private final static int ISO646_STRING = 0x1A;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
    private final static int ENUMERATED = 0x0a;

    private final static int SEQUENCE = 0x10;
    private final static int SET = 0x11;

```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java

    private final static int UTF8_STRING = 0x0C;
    private final static int UNIVERSAL_STRING = 0x1C;
    private final static int BMP_STRING = 0x1E;

```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
    private final static int APPLICATION = 0x40;
    private final static int CONTEXT = 0x80;
    private final static int PRIVATE = 0xC0;

    // Constructed Flag
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
    private final static int OBJECT_IDENTIFIER = 0x06;
    private final static int REAL = 0x09;
    private final static int ENUMERATED = 0x0a;

    private final static int SEQUENCE = 0x10;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
    private final static int NULL = 0x05;
    private final static int OBJECT_IDENTIFIER = 0x06;
    private final static int REAL = 0x09;
    private final static int ENUMERATED = 0x0a;

```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
    private final static int OCTET_STRING = 0x04;
    private final static int NULL = 0x05;
    private final static int OBJECT_IDENTIFIER = 0x06;
    private final static int REAL = 0x09;
    private final static int ENUMERATED = 0x0a;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
    private final static int BMP_STRING = 0x1E;

    private final static int UTC_TIME = 0x17;

    private Buffer in;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
    private final static int GRAPHIC_STRING = 0x19;
    private final static int ISO646_STRING = 0x1A;
    private final static int GENERAL_STRING = 0x1B;

    private final static int UTF8_STRING = 0x0C;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
    private final static int NUMERIC_STRING = 0x12;
    private final static int PRINTABLE_STRING = 0x13;
    private final static int VIDEOTEX_STRING = 0x15;
    private final static int IA5_STRING = 0x16;
    private final static int GRAPHIC_STRING = 0x19;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
    private final static int SET = 0x11;

    private final static int NUMERIC_STRING = 0x12;
    private final static int PRINTABLE_STRING = 0x13;
    private final static int VIDEOTEX_STRING = 0x15;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
    private final static int GENERAL_STRING = 0x1B;

    private final static int UTF8_STRING = 0x0C;
    private final static int UNIVERSAL_STRING = 0x1C;
    private final static int BMP_STRING = 0x1E;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java

    private final static int NUMERIC_STRING = 0x12;
    private final static int PRINTABLE_STRING = 0x13;
    private final static int VIDEOTEX_STRING = 0x15;
    private final static int IA5_STRING = 0x16;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
    private final static int BOOLEAN = 0x01;
    private final static int INTEGER = 0x02;
    private final static int BIT_STRING = 0x03;
    private final static int OCTET_STRING = 0x04;
    private final static int NULL = 0x05;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
    private final static int UNIVERSAL = 0x00;
    private final static int APPLICATION = 0x40;
    private final static int CONTEXT = 0x80;
    private final static int PRIVATE = 0xC0;

```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
    // Tag and data types
    private final static int ANY = 0x00;
    private final static int BOOLEAN = 0x01;
    private final static int INTEGER = 0x02;
    private final static int BIT_STRING = 0x03;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
    // Classes
    private final static int UNIVERSAL = 0x00;
    private final static int APPLICATION = 0x40;
    private final static int CONTEXT = 0x80;
    private final static int PRIVATE = 0xC0;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java

    // Tag and data types
    private final static int ANY = 0x00;
    private final static int BOOLEAN = 0x01;
    private final static int INTEGER = 0x02;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java

    // Constructed Flag
    private final static int CONSTRUCTED = 0x20;

    // Tag and data types
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `default @Nullable`
in `src/main/java/io/vertx/core/http/HttpServerResponse.java`
#### Snippet
```java
   * @return the cookie, if it existed, or {@code null}
   */
  default @Nullable Cookie removeCookie(String name, String domain, String path) {
    return removeCookie(name, domain, path, true);
  }
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `default @Nullable`
in `src/main/java/io/vertx/core/http/HttpServerResponse.java`
#### Snippet
```java
   * @return the cookie, if it existed, or null
   */
  default @Nullable Cookie removeCookie(String name) {
    return removeCookie(name, true);
  }
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/impl/launcher/commands/ListCommand.java`
#### Snippet
```java
  private final static Pattern FAT_JAR_EXTRACTION = Pattern.compile("-jar (\\S*)");

  private final static Pattern VERTICLE_EXTRACTION = Pattern.compile("run (\\S*)");

  // Note about stack traces - the stack trace are printed on the stream passed to the command.
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/impl/launcher/commands/ListCommand.java`
#### Snippet
```java
  private final static Pattern PS = Pattern.compile("-Dvertx.id=(.*)\\s*");

  private final static Pattern FAT_JAR_EXTRACTION = Pattern.compile("-jar (\\S*)");

  private final static Pattern VERTICLE_EXTRACTION = Pattern.compile("run (\\S*)");
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/impl/launcher/commands/ListCommand.java`
#### Snippet
```java
public class ListCommand extends DefaultCommand {

  private final static Pattern PS = Pattern.compile("-Dvertx.id=(.*)\\s*");

  private final static Pattern FAT_JAR_EXTRACTION = Pattern.compile("-jar (\\S*)");
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/impl/launcher/commands/Watcher.java`
#### Snippet
```java
public class Watcher implements Runnable {

  private final static Logger LOGGER = LoggerFactory.getLogger(Watcher.class);

  private final long gracePeriod;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/impl/verticle/PackageHelper.java`
#### Snippet
```java

public class PackageHelper {
  private final static String CLASS_FILE = ".class";

  private final ClassLoader classLoader;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/impl/verticle/CompilingClassLoader.java`
#### Snippet
```java

  private static final String JAVA_COMPILER_OPTIONS_PROP_NAME = "vertx.javaCompilerOptions";
  private final static List<String> COMPILER_OPTIONS;

  static {
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final public static`
in `src/main/java/io/vertx/core/json/pointer/impl/JsonPointerImpl.java`
#### Snippet
```java
public class JsonPointerImpl implements JsonPointer {

  final public static Pattern VALID_POINTER_PATTERN = Pattern.compile("^(/(([^/~])|(~[01]))*)*$");

  URI startingUri;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `src/main/java/io/vertx/core/logging/Log4j2LogDelegate.java`
#### Snippet
```java

  @SuppressWarnings("deprecation")
  final static String FQCN = Logger.class.getCanonicalName();

  Log4j2LogDelegate(final String name) {
```

## RuleId[ruleID=AnonymousHasLambdaAlternative]
### RuleId[ruleID=AnonymousHasLambdaAlternative]
Anonymous new Thread() can be replaced with new Thread(() -\> {...})
in `src/main/java/io/vertx/core/impl/launcher/commands/RunCommand.java`
#### Snippet
```java
    // Close the watcher when the JVM is terminating.
    // Notice that the vert.x finalizer is not registered when we run in redeploy mode.
    Runtime.getRuntime().addShutdownHook(new Thread() {
      public void run() {
        shutdownRedeployment();
```

## RuleId[ruleID=IgnoreResultOfCall]
### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.mkdirs()` is ignored
in `src/main/java/io/vertx/core/file/impl/FileCache.java`
#### Snippet
```java
    boolean isDirectory = resource.isDirectory();
    if (!isDirectory) {
      cacheFile.getParentFile().mkdirs();
      if (!overwrite) {
        try {
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.mkdirs()` is ignored
in `src/main/java/io/vertx/core/file/impl/FileCache.java`
#### Snippet
```java
      }
    } else {
      cacheFile.mkdirs();
    }
    return cacheFile;
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.mkdirs()` is ignored
in `src/main/java/io/vertx/core/file/impl/FileCache.java`
#### Snippet
```java
    File file = new File(getCacheDir(), fileName);
    fileNameCheck(file);
    file.mkdirs();
  }

```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.mkdirs()` is ignored
in `src/main/java/io/vertx/core/file/impl/FileCache.java`
#### Snippet
```java
    File cacheFile = new File(getCacheDir(), fileName);
    fileNameCheck(cacheFile);
    cacheFile.getParentFile().mkdirs();
    if (!overwrite) {
      try {
```

## RuleId[ruleID=ClassNameSameAsAncestorName]
### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Entry` is the same as one of its superclass' names
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java
  }

  private static final class Entry implements Map.Entry<String, Object> {
    final String key;
    final Object value;
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `ClusterSerializable` is the same as one of its superclass' names
in `src/main/java/io/vertx/core/shareddata/ClusterSerializable.java`
#### Snippet
```java
 * @implSpec Implementations must have a public no-argument constructor.
 */
public interface ClusterSerializable extends io.vertx.core.shareddata.impl.ClusterSerializable {

  /**
```

## RuleId[ruleID=DefaultAnnotationParam]
### RuleId[ruleID=DefaultAnnotationParam]
Redundant default parameter value assignment
in `src/main/java/io/vertx/core/impl/launcher/commands/StartCommand.java`
#### Snippet
```java
   * @param options the jvm options
   */
  @Option(longName = "java-opts", required = false, acceptValue = true)
  @Description("Java Virtual Machine options to pass to the spawned process such as \"-Xmx1G -Xms256m " +
      "-XX:MaxPermSize=256m\". If not set the `JAVA_OPTS` environment variable is used.")
```

### RuleId[ruleID=DefaultAnnotationParam]
Redundant default parameter value assignment
in `src/main/java/io/vertx/core/impl/launcher/commands/StartCommand.java`
#### Snippet
```java
   * @param options the jvm options
   */
  @Option(longName = "java-opts", required = false, acceptValue = true)
  @Description("Java Virtual Machine options to pass to the spawned process such as \"-Xmx1G -Xms256m " +
      "-XX:MaxPermSize=256m\". If not set the `JAVA_OPTS` environment variable is used.")
```

### RuleId[ruleID=DefaultAnnotationParam]
Redundant default parameter value assignment
in `src/main/java/io/vertx/core/impl/launcher/commands/StartCommand.java`
#### Snippet
```java
   * @param id the id
   */
  @Option(longName = "vertx-id", shortName = "id", required = false, acceptValue = true)
  @Description("The id of the application, a random UUID by default")
  public void setApplicationId(String id) {
```

### RuleId[ruleID=DefaultAnnotationParam]
Redundant default parameter value assignment
in `src/main/java/io/vertx/core/impl/launcher/commands/StartCommand.java`
#### Snippet
```java
   * @param id the id
   */
  @Option(longName = "vertx-id", shortName = "id", required = false, acceptValue = true)
  @Description("The id of the application, a random UUID by default")
  public void setApplicationId(String id) {
```

### RuleId[ruleID=DefaultAnnotationParam]
Redundant default parameter value assignment
in `src/main/java/io/vertx/core/impl/launcher/commands/RunCommand.java`
#### Snippet
```java
   * @param verticle the verticle
   */
  @Argument(index = 0, argName = "main-verticle", required = true)
  @Description("The main verticle to deploy, it can be a fully qualified class name or a file.")
  public void setMainVerticle(String verticle) {
```

## RuleId[ruleID=RedundantMethodOverride]
### RuleId[ruleID=RedundantMethodOverride]
Method `setOpenSslEngineOptions()` only delegates to its super method
in `src/main/java/io/vertx/core/net/NetClientOptions.java`
#### Snippet
```java

  @Override
  public ClientOptionsBase setOpenSslEngineOptions(OpenSSLEngineOptions sslEngineOptions) {
    return super.setOpenSslEngineOptions(sslEngineOptions);
  }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `getTrafficClass()` only delegates to its super method
in `src/main/java/io/vertx/core/datagram/DatagramSocketOptions.java`
#### Snippet
```java

  @Override
  public int getTrafficClass() {
    return super.getTrafficClass();
  }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `getSendBufferSize()` only delegates to its super method
in `src/main/java/io/vertx/core/datagram/DatagramSocketOptions.java`
#### Snippet
```java

  @Override
  public int getSendBufferSize() {
    return super.getSendBufferSize();
  }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `getReceiveBufferSize()` only delegates to its super method
in `src/main/java/io/vertx/core/datagram/DatagramSocketOptions.java`
#### Snippet
```java

  @Override
  public int getReceiveBufferSize() {
    return super.getReceiveBufferSize();
  }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `start()` only delegates to its super method
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java

    @Override
    public void start() throws Exception {
      super.start();
    }
```

## RuleId[ruleID=IntegerMultiplicationImplicitCastToLong]
### RuleId[ruleID=IntegerMultiplicationImplicitCastToLong]
buff.length() \* i: integer multiplication implicitly cast to long
in `src/main/java/examples/FileSystemExamples.java`
#### Snippet
```java
        Buffer buff = Buffer.buffer("foo");
        for (int i = 0; i < 5; i++) {
          file.write(buff, buff.length() * i, ar -> {
            if (ar.succeeded()) {
              System.out.println("Written ok!");
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/io/vertx/core/impl/launcher/commands/RunCommand.java`
#### Snippet
```java
      afterConfigParsed(conf);

      super.run(this::afterStoppingVertx);
      if (vertx == null) {
        // Already logged.
```

## RuleId[ruleID=SlowListContainsAll]
### RuleId[ruleID=SlowListContainsAll]
Call to 'list.containsAll(collection)' may have poor performance
in `src/main/java/io/vertx/core/net/impl/VertxEventLoopGroup.java`
#### Snippet
```java
    @Override
    public boolean containsAll(Collection<?> c) {
      return workers.containsAll(c);
    }

```

## RuleId[ruleID=UNUSED_IMPORT]
### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/DeploymentOptionsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/DeploymentOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/DeploymentOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/VertxOptionsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/VertxOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/VertxOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/cli/ArgumentConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/cli/ArgumentConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/cli/ArgumentConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/cli/OptionConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/cli/OptionConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/datagram/DatagramSocketOptionsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/datagram/DatagramSocketOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/datagram/DatagramSocketOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/dns/AddressResolverOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/dns/AddressResolverOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/file/CopyOptionsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/file/CopyOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/file/CopyOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/file/FileSystemOptionsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/file/FileSystemOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/file/FileSystemOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/file/OpenOptionsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/file/OpenOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/file/OpenOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/http/GoAwayConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/http/GoAwayConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/http/GoAwayConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/http/Http2SettingsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/http/Http2SettingsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/http/Http2SettingsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/http/HttpClientOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/http/HttpClientOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/http/HttpServerOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/http/HttpServerOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/http/RequestOptionsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/http/RequestOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/http/RequestOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/http/WebSocketConnectOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/http/WebSocketConnectOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/metrics/MetricsOptionsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/metrics/MetricsOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/metrics/MetricsOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/net/ClientOptionsBaseConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/net/ClientOptionsBaseConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/net/JksOptionsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/net/JksOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/net/JksOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/net/KeyStoreOptionsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/net/KeyStoreOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/net/KeyStoreOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/net/NetClientOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/net/NetClientOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/net/NetServerOptionsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/net/NetServerOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/net/NetServerOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/net/OpenSSLEngineOptionsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/net/OpenSSLEngineOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/net/OpenSSLEngineOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/net/PemTrustOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/net/PemTrustOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/net/PfxOptionsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/net/PfxOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/net/PfxOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/net/ProxyOptionsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/net/ProxyOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/net/ProxyOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.json.JsonArray;`
in `src/main/generated/io/vertx/core/tracing/TracingOptionsConverter.java`
#### Snippet
```java

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.Instant;`
in `src/main/generated/io/vertx/core/tracing/TracingOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.time.format.DateTimeFormatter;`
in `src/main/generated/io/vertx/core/tracing/TracingOptionsConverter.java`
#### Snippet
```java
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.json.pointer.JsonPointer;`
in `src/main/java/docoverride/json/Examples.java`
#### Snippet
```java
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.json.pointer.JsonPointer;
import io.vertx.docgen.Source;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.net.URI;`
in `src/main/java/docoverride/json/Examples.java`
#### Snippet
```java
import io.vertx.docgen.Source;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.net.URI;`
in `src/main/java/examples/JsonPointerExamples.java`
#### Snippet
```java
import io.vertx.core.json.pointer.JsonPointer;

import java.net.URI;

public class JsonPointerExamples {
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.Handler;`
in `src/main/java/examples/StreamsExamples.java`
#### Snippet
```java
package examples;

import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.buffer.Buffer;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.http.HttpServer;`
in `src/main/java/examples/StreamsExamples.java`
#### Snippet
```java
import io.vertx.core.file.FileSystem;
import io.vertx.core.file.OpenOptions;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.core.net.NetServer;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.http.HttpServerOptions;`
in `src/main/java/examples/StreamsExamples.java`
#### Snippet
```java
import io.vertx.core.file.OpenOptions;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.core.net.NetServer;
import io.vertx.core.net.NetServerOptions;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.net.NetSocket;`
in `src/main/java/examples/StreamsExamples.java`
#### Snippet
```java
import io.vertx.core.net.NetServer;
import io.vertx.core.net.NetServerOptions;
import io.vertx.core.net.NetSocket;
import io.vertx.core.streams.Pipe;
import io.vertx.core.streams.Pump;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.streams.Pump;`
in `src/main/java/examples/StreamsExamples.java`
#### Snippet
```java
import io.vertx.core.net.NetSocket;
import io.vertx.core.streams.Pipe;
import io.vertx.core.streams.Pump;
import io.vertx.core.streams.ReadStream;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.streams.ReadStream;`
in `src/main/java/examples/StreamsExamples.java`
#### Snippet
```java
import io.vertx.core.streams.Pipe;
import io.vertx.core.streams.Pump;
import io.vertx.core.streams.ReadStream;

/**
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.netty.buffer.UnpooledUnsafeHeapByteBuf;`
in `src/main/java/io/vertx/core/buffer/impl/VertxHeapByteBuf.java`
#### Snippet
```java
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.UnpooledHeapByteBuf;
import io.netty.buffer.UnpooledUnsafeHeapByteBuf;

/**
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.util.Arrays;`
in `src/main/java/io/vertx/core/cli/TypedOption.java`
#### Snippet
```java
import io.vertx.core.cli.converters.Converter;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.net.impl.SocketAddressImpl;`
in `src/main/java/io/vertx/core/datagram/impl/DatagramPacketImpl.java`
#### Snippet
```java
import io.vertx.core.datagram.DatagramPacket;
import io.vertx.core.net.SocketAddress;
import io.vertx.core.net.impl.SocketAddressImpl;

import java.net.InetSocketAddress;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.http.RequestOptions;`
in `src/main/java/io/vertx/core/eventbus/MessageProducer.java`
#### Snippet
```java
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.http.RequestOptions;
import io.vertx.core.streams.WriteStream;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.streams.WriteStream;`
in `src/main/java/io/vertx/core/eventbus/MessageProducer.java`
#### Snippet
```java
import io.vertx.core.Handler;
import io.vertx.core.http.RequestOptions;
import io.vertx.core.streams.WriteStream;

/**
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.util.List;`
in `src/main/java/io/vertx/core/eventbus/impl/DeliveryContextBase.java`
#### Snippet
```java
import io.vertx.core.impl.ContextInternal;

import java.util.List;

abstract class DeliveryContextBase<T> implements DeliveryContext<T> {
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.nio.file.Path;`
in `src/main/java/io/vertx/core/file/impl/FileCache.java`
#### Snippet
```java
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.PosixFilePermission;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.AsyncResult;`
in `src/main/java/io/vertx/core/file/impl/WindowsFileSystem.java`
#### Snippet
```java
package io.vertx.core.file.impl;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.file.AsyncFile;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.Handler;`
in `src/main/java/io/vertx/core/file/impl/WindowsFileSystem.java`
#### Snippet
```java

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.file.AsyncFile;
import io.vertx.core.file.OpenOptions;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.buffer.Buffer;`
in `src/main/java/io/vertx/core/http/HttpClient.java`
#### Snippet
```java
import io.vertx.core.Handler;
import io.vertx.core.MultiMap;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.metrics.Measured;
import io.vertx.core.net.SocketAddress;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.net.SocketAddress;`
in `src/main/java/io/vertx/core/http/HttpClient.java`
#### Snippet
```java
import io.vertx.core.buffer.Buffer;
import io.vertx.core.metrics.Measured;
import io.vertx.core.net.SocketAddress;
import io.vertx.core.streams.ReadStream;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.streams.ReadStream;`
in `src/main/java/io/vertx/core/http/HttpClient.java`
#### Snippet
```java
import io.vertx.core.metrics.Measured;
import io.vertx.core.net.SocketAddress;
import io.vertx.core.streams.ReadStream;

import java.util.List;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.util.function.Predicate;`
in `src/main/java/io/vertx/core/http/HttpClient.java`
#### Snippet
```java
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import com.fasterxml.jackson.annotation.JsonIgnoreProperties;`
in `src/main/java/io/vertx/core/http/HttpClientResponse.java`
#### Snippet
```java
package io.vertx.core.http;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.vertx.codegen.annotations.*;
import io.vertx.core.AsyncResult;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.codegen.annotations.Fluent;`
in `src/main/java/io/vertx/core/http/HttpServerFileUpload.java`
#### Snippet
```java
package io.vertx.core.http;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.http.HttpServerResponse;`
in `src/main/java/io/vertx/core/http/impl/Http2ServerStreamHandler.java`
#### Snippet
```java
import io.vertx.core.http.HttpFrame;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.http.StreamPriority;
import io.vertx.core.impl.ContextInternal;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.impl.ContextInternal;`
in `src/main/java/io/vertx/core/http/impl/Http2ServerStreamHandler.java`
#### Snippet
```java
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.http.StreamPriority;
import io.vertx.core.impl.ContextInternal;

interface Http2ServerStreamHandler {
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.codegen.annotations.Fluent;`
in `src/main/java/io/vertx/core/http/impl/HttpServerConnection.java`
#### Snippet
```java
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.Handler;
import io.vertx.core.http.HttpConnection;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.netty.util.concurrent.FastThreadLocalThread;`
in `src/main/java/io/vertx/core/impl/ContextInternal.java`
#### Snippet
```java

import io.netty.channel.EventLoop;
import io.netty.util.concurrent.FastThreadLocalThread;
import io.vertx.core.*;
import io.vertx.core.impl.future.FailedFuture;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.AsyncResult;`
in `src/main/java/io/vertx/core/impl/Deployment.java`
#### Snippet
```java
package io.vertx.core.impl;

import io.vertx.core.AsyncResult;
import io.vertx.core.Context;
import io.vertx.core.DeploymentOptions;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.util.function.Consumer;`
in `src/main/java/io/vertx/core/impl/HAManager.java`
#### Snippet
```java
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

import static java.util.concurrent.TimeUnit.MINUTES;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.net.NetClientOptions;`
in `src/main/java/io/vertx/core/impl/VertxInternal.java`
#### Snippet
```java
import io.vertx.core.impl.btc.BlockedThreadChecker;
import io.vertx.core.impl.future.PromiseInternal;
import io.vertx.core.net.NetClientOptions;
import io.vertx.core.net.impl.NetClientBuilder;
import io.vertx.core.net.impl.NetServerImpl;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.net.impl.NetClientBuilder;`
in `src/main/java/io/vertx/core/impl/VertxInternal.java`
#### Snippet
```java
import io.vertx.core.impl.future.PromiseInternal;
import io.vertx.core.net.NetClientOptions;
import io.vertx.core.net.impl.NetClientBuilder;
import io.vertx.core.net.impl.NetServerImpl;
import io.vertx.core.net.impl.ServerID;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.util.concurrent.ExecutorService;`
in `src/main/java/io/vertx/core/impl/VertxInternal.java`
#### Snippet
```java
import java.net.InetSocketAddress;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.nio.charset.Charset;`
in `src/main/java/io/vertx/core/impl/cpu/CpuCoreSensor.java`
#### Snippet
```java

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.AccessController;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.util.stream.Collectors;`
in `src/main/java/io/vertx/core/impl/future/CompositeFutureImpl.java`
#### Snippet
```java

import java.util.function.Function;
import java.util.stream.Collectors;

/**
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.Handler;`
in `src/main/java/io/vertx/core/impl/future/FutureBase.java`
#### Snippet
```java
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.impl.ContextInternal;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.Context;`
in `src/main/java/io/vertx/core/impl/future/PromiseInternal.java`
#### Snippet
```java

import io.netty.util.concurrent.FutureListener;
import io.vertx.core.Context;
import io.vertx.core.Promise;
import io.vertx.core.impl.ContextInternal;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.VertxOptions;`
in `src/main/java/io/vertx/core/impl/launcher/commands/ClasspathHandler.java`
#### Snippet
```java
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import io.vertx.core.cli.annotations.Description;
import io.vertx.core.cli.annotations.Option;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.util.stream.Collectors;`
in `src/main/java/io/vertx/core/impl/launcher/commands/StartCommand.java`
#### Snippet
```java
import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

/**
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.ServiceHelper;`
in `src/main/java/io/vertx/core/json/Json.java`
#### Snippet
```java
package io.vertx.core.json;

import io.vertx.core.ServiceHelper;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.jackson.JacksonFactory;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.json.jackson.JacksonFactory;`
in `src/main/java/io/vertx/core/json/Json.java`
#### Snippet
```java
import io.vertx.core.ServiceHelper;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.jackson.JacksonFactory;
import io.vertx.core.spi.JsonFactory;
import io.vertx.core.spi.json.JsonCodec;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.util.stream.Stream;`
in `src/main/java/io/vertx/core/json/pointer/impl/JsonPointerImpl.java`
#### Snippet
```java
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.Context;`
in `src/main/java/io/vertx/core/net/impl/pool/PoolWaiter.java`
#### Snippet
```java

import io.vertx.core.AsyncResult;
import io.vertx.core.Context;
import io.vertx.core.Handler;
import io.vertx.core.impl.ContextInternal;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.impl.EventLoopContext;`
in `src/main/java/io/vertx/core/net/impl/pool/PoolWaiter.java`
#### Snippet
```java
import io.vertx.core.Handler;
import io.vertx.core.impl.ContextInternal;
import io.vertx.core.impl.EventLoopContext;

/**
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.Context;`
in `src/main/java/io/vertx/core/shareddata/impl/LocalAsyncLocks.java`
#### Snippet
```java
package io.vertx.core.shareddata.impl;

import io.vertx.core.Context;
import io.vertx.core.Future;
import io.vertx.core.Promise;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.json.Json;`
in `src/main/java/io/vertx/core/spi/JsonFactory.java`
#### Snippet
```java
package io.vertx.core.spi;

import io.vertx.core.json.Json;
import io.vertx.core.json.jackson.JacksonFactory;
import io.vertx.core.spi.json.JsonCodec;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.metrics.impl.DummyVertxMetrics;`
in `src/main/java/io/vertx/core/spi/VertxMetricsFactory.java`
#### Snippet
```java
import io.vertx.core.json.JsonObject;
import io.vertx.core.metrics.MetricsOptions;
import io.vertx.core.metrics.impl.DummyVertxMetrics;
import io.vertx.core.spi.metrics.VertxMetrics;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.json.Json;`
in `src/main/java/io/vertx/core/spi/VertxServiceProvider.java`
#### Snippet
```java

import io.vertx.core.impl.VertxBuilder;
import io.vertx.core.json.Json;
import io.vertx.core.spi.json.JsonCodec;

```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.spi.json.JsonCodec;`
in `src/main/java/io/vertx/core/spi/VertxServiceProvider.java`
#### Snippet
```java
import io.vertx.core.impl.VertxBuilder;
import io.vertx.core.json.Json;
import io.vertx.core.spi.json.JsonCodec;

/**
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.netty.util.concurrent.FastThreadLocalThread;`
in `src/main/java/io/vertx/core/streams/impl/InboundBuffer.java`
#### Snippet
```java
package io.vertx.core.streams.impl;

import io.netty.util.concurrent.FastThreadLocalThread;
import io.vertx.core.Context;
import io.vertx.core.Handler;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import io.vertx.core.Vertx;`
in `src/main/java/io/vertx/core/streams/impl/InboundBuffer.java`
#### Snippet
```java
import io.vertx.core.Context;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.impl.ContextInternal;

```

## RuleId[ruleID=NestedAssignment]
### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/io/vertx/core/cli/UsageMessageFormatter.java`
#### Snippet
```java
      String line;
      boolean firstLine = true;
      while ((line = in.readLine()) != null) {
        if (!firstLine) {
          sb.append(getNewLine());
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
      node.next.prev = node.prev;
      node.prev.next = node.next;
      node.next = node.prev = null;
      node.queued = false;
      size--;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
      this.forEach(lst::add);
      size = 0;
      head.next = head.prev = head;
      return lst;
    }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
    public Waiters() {
      head = new PoolWaiter<>(null, null, 0, null);
      head.next = head.prev = head;
    }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
      if (!pool.closed && slot.connection != null) {
        PoolWaiter<C> waiter;
        if (slot.usage <= slot.concurrency && (waiter = pool.waiters.poll()) != null) {
          LeaseImpl<C> lease = new LeaseImpl<>(slot, waiter.handler);
          return new Task() {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/io/vertx/core/impl/cpu/CpuCoreSensor.java`
#### Snippet
```java
        final BufferedReader reader = new BufferedReader(inputReader)) {
      String line;
      while ((line = reader.readLine()) != null) {
        if (line.startsWith(CPUS_ALLOWED)) {
          int count = 0;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/io/vertx/core/impl/HAManager.java`
#### Snippet
```java
      log.info("There are " + size + " HA deploymentIDs waiting on a quorum. These will now be deployed");
      Runnable task;
      while ((task = toDeployOnQuorum.poll()) != null) {
        try {
          task.run();
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/io/vertx/core/impl/launcher/commands/VersionCommand.java`
#### Snippet
```java
      }
      try (Scanner scanner = new Scanner(is, "UTF-8").useDelimiter("\\A")) {
        return version = scanner.hasNext() ? scanner.next().trim() : "";
      }
    } catch (IOException e) {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/io/vertx/core/impl/launcher/commands/StopCommand.java`
#### Snippet
```java
      try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
        String line;
        while ((line = reader.readLine()) != null) {
          final Matcher matcher = PS.matcher(line);
          if (matcher.find()) {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/io/vertx/core/impl/launcher/commands/FileSelector.java`
#### Snippet
```java

    // Process characters before first star
    while ((ch = patArr[patIdxStart]) != '*' && strIdxStart <= strIdxEnd) {
      if (ch != '?' && !equals(ch, strArr[strIdxStart], isCaseSensitive)) {
        return false; // Character mismatch
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/io/vertx/core/impl/launcher/commands/FileSelector.java`
#### Snippet
```java

    // Process characters after last star
    while ((ch = patArr[patIdxEnd]) != '*' && strIdxStart <= strIdxEnd) {
      if (ch != '?' && !equals(ch, strArr[strIdxEnd], isCaseSensitive)) {
        return false; // Character mismatch
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/io/vertx/core/impl/launcher/commands/ListCommand.java`
#### Snippet
```java
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
      String line;
      while ((line = reader.readLine()) != null) {
        final Matcher matcher = PS.matcher(line);
        if (matcher.find()) {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/io/vertx/core/streams/impl/InboundBuffer.java`
#### Snippet
```java
    Handler<Throwable> handler;
    synchronized (this) {
      if ((handler = exceptionHandler) == null) {
        return;
      }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/io/vertx/core/eventbus/impl/CodecManager.java`
#### Snippet
```java
      codec = defaultCodecMap.get(body.getClass());
      if (codec == null) {
        if ((codecName = codecSelector.apply(body)) != null) {
          codec = getCodec(codecName);
        } else if (body instanceof ClusterSerializable && (local || acceptClusterSerializable(body.getClass().getName()))) {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/io/vertx/core/eventbus/impl/clustered/ConnectionHolder.java`
#### Snippet
```java
      OutboundDeliveryContext<?> msg;
      if (pending != null) {
        while ((msg = pending.poll()) != null) {
          msg.written(cause);
        }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/io/vertx/core/eventbus/impl/MessageConsumerImpl.java`
#### Snippet
```java
        Handler<Message<T>> theHandler;
        synchronized (MessageConsumerImpl.this) {
          if (demand == 0L || (message = pending.poll()) == null) {
            return;
          }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/io/vertx/core/eventbus/impl/clustered/ClusteredEventBus.java`
#### Snippet
```java
  private String getClusterHost() {
    String host;
    if ((host = options.getHost()) != null) {
      return host;
    }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/io/vertx/core/eventbus/impl/clustered/ClusteredEventBus.java`
#### Snippet
```java
      return host;
    }
    if ((host = clusterManager.clusterHost()) != null) {
      return host;
    }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/io/vertx/core/eventbus/impl/clustered/ClusteredEventBus.java`
#### Snippet
```java
  private String getClusterPublicHost(String host) {
    String publicHost;
    if ((publicHost = options.getClusterPublicHost()) != null) {
      return publicHost;
    }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/io/vertx/core/eventbus/impl/clustered/ClusteredEventBus.java`
#### Snippet
```java
      return publicHost;
    }
    if ((publicHost = options.getHost()) != null) {
      return publicHost;
    }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/io/vertx/core/eventbus/impl/clustered/ClusteredEventBus.java`
#### Snippet
```java
      return publicHost;
    }
    if ((publicHost = clusterManager.clusterPublicHost()) != null) {
      return publicHost;
    }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/io/vertx/core/shareddata/impl/LocalAsyncLocks.java`
#### Snippet
```java
      waitersMap.compute(lockName, (s, list) -> {
        int idx;
        if (list == null || (idx = list.indexOf(LockWaiter.this)) == -1) {
          // Already removed by release()
          return list;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/io/vertx/core/shareddata/impl/LocalAsyncMapImpl.java`
#### Snippet
```java
      Objects.requireNonNull(value);
      this.value = value;
      timestamp = ttl = timerId = 0;
    }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/io/vertx/core/shareddata/impl/LocalAsyncMapImpl.java`
#### Snippet
```java
      Objects.requireNonNull(value);
      this.value = value;
      timestamp = ttl = timerId = 0;
    }

```

## RuleId[ruleID=CodeBlock2Expr]
### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/io/vertx/core/spi/cluster/impl/DefaultNodeSelector.java`
#### Snippet
```java
  public void selectForPublish(Message<?> message, Promise<Iterable<String>> promise) {
    Arguments.require(!message.isSend(), "selectForPublish used for sending");
    selectors.withSelector(message, promise, (prom, selector) -> {
      prom.tryComplete(selector.selectForPublish());
    });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/io/vertx/core/spi/cluster/impl/DefaultNodeSelector.java`
#### Snippet
```java
  public void selectForSend(Message<?> message, Promise<String> promise) {
    Arguments.require(message.isSend(), "selectForSend used for publishing");
    selectors.withSelector(message, promise, (prom, selector) -> {
      prom.tryComplete(selector.selectForSend());
    });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/io/vertx/core/spi/cluster/impl/selector/Selectors.java`
#### Snippet
```java
    String address = message.address();
    SelectorEntry entry = map.compute(address, (addr, curr) -> {
      return curr == null ? new SelectorEntry() : (curr.isNotReady() ? curr.increment() : curr);
    });
    if (entry.isNotReady()) {
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/io/vertx/core/file/impl/AsyncFileLockImpl.java`
#### Snippet
```java
  @Override
  public Future<Boolean> isValid() {
    return vertx.getOrCreateContext().executeBlockingInternal(prom -> {
      prom.complete(isValidBlocking());
    });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/io/vertx/core/http/impl/SharedClientHttpStreamEndpoint.java`
#### Snippet
```java
    public void onConnect(PoolWaiter<HttpClientConnection> waiter) {
      if (timeout > 0L && timerID == -1L) {
        timerID = context.setTimer(timeout, id -> {
          pool.cancel(waiter, ar -> {
            if (ar.succeeded() && ar.result()) {
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/io/vertx/core/http/impl/HttpClientConnection.java`
#### Snippet
```java
  Logger log = LoggerFactory.getLogger(HttpClientConnection.class);

  Handler<Void> DEFAULT_EVICTION_HANDLER = v -> {
    log.warn("Connection evicted");
  };
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/io/vertx/core/http/impl/HttpServerFileUploadImpl.java`
#### Snippet
```java
    FileSystem fs = context.owner().fileSystem();
    Future<AsyncFile> fut = fs.open(filename, new OpenOptions());
    fut.onFailure(err -> {
      pipe.close();
    });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/io/vertx/core/http/impl/HttpNetSocket.java`
#### Snippet
```java
    if (resultHandler != null) {
      Context resultCtx = vertx.getOrCreateContext();
      h = ar -> {
        resultCtx.runOnContext((v) -> {
          resultHandler.handle(ar);
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/io/vertx/core/http/impl/HttpNetSocket.java`
#### Snippet
```java
      Context resultCtx = vertx.getOrCreateContext();
      h = ar -> {
        resultCtx.runOnContext((v) -> {
          resultHandler.handle(ar);
        });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/io/vertx/core/http/impl/WebSocketEndpoint.java`
#### Snippet
```java
    super.close();
    synchronized (this) {
      waiters.forEach(waiter -> {
        waiter.context.runOnContext(v -> {
          waiter.handler.handle(Future.failedFuture("Closed"));
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/io/vertx/core/http/impl/WebSocketEndpoint.java`
#### Snippet
```java
    synchronized (this) {
      waiters.forEach(waiter -> {
        waiter.context.runOnContext(v -> {
          waiter.handler.handle(Future.failedFuture("Closed"));
        });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/io/vertx/core/impl/CloseFuture.java`
#### Snippet
```java
      // the close future completes
      CloseFuture fut = (CloseFuture) hook;
      fut.future().onComplete(ar -> {
        remove(fut);
      });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/io/vertx/core/impl/ConversionHelper.java`
#### Snippet
```java
    }
    Map<String, Object> map = new LinkedHashMap<>(json.getMap());
    map.entrySet().forEach(entry -> {
      entry.setValue(fromObject(entry.getValue()));
    });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/io/vertx/core/impl/VerticleManager.java`
#### Snippet
```java
        if (ar.succeeded()) {
          Deployment result = ar.result();
          result.undeployHandler(v -> {
            loaderManager.release(holder);
          });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/io/vertx/core/impl/HAManager.java`
#### Snippet
```java
      if (dep != null) {
        if (dep.deploymentOptions().isHa()) {
          ((VertxImpl)vertx).executeIsolated(v -> {
            deploymentManager.undeployVerticle(deploymentID).onComplete(result -> {
              if (result.succeeded()) {
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/io/vertx/core/impl/HAManager.java`
#### Snippet
```java
  private void addToHADeployList(final String verticleName, final DeploymentOptions deploymentOptions,
                                 final Handler<AsyncResult<String>> doneHandler) {
    toDeployOnQuorum.add(() -> {
      ((VertxImpl)vertx).executeIsolated(v -> {
        deployVerticle(verticleName, deploymentOptions, doneHandler);
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/io/vertx/core/impl/HAManager.java`
#### Snippet
```java
                                 final Handler<AsyncResult<String>> doneHandler) {
    toDeployOnQuorum.add(() -> {
      ((VertxImpl)vertx).executeIsolated(v -> {
        deployVerticle(verticleName, deploymentOptions, doneHandler);
      });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/io/vertx/core/impl/HAManager.java`
#### Snippet
```java
  private void doDeployVerticle(final String verticleName, DeploymentOptions deploymentOptions,
                                final Handler<AsyncResult<String>> doneHandler) {
    final Handler<AsyncResult<String>> wrappedHandler = ar1 -> {
      vertx.<String>executeBlocking(fut -> {
        if (ar1.succeeded()) {
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/io/vertx/core/impl/HAManager.java`
#### Snippet
```java
              } else {
                // Remove any context we have here (from the timer) otherwise will screw things up when verticles are deployed
                ((VertxImpl)vertx).executeIsolated(v -> {
                  checkQuorumWhenAdded(nodeID, start);
                });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/io/vertx/core/http/impl/HttpClientImpl.java`
#### Snippet
```java
          if (ar2.succeeded()) {
            HttpClientStream stream = ar2.result();
            stream.closeHandler(v -> {
              lease.recycle();
            });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/io/vertx/core/streams/impl/PipeImpl.java`
#### Snippet
```java
    Future<Void> res = Future.failedFuture(cause);
    if (endOnFailure){
      dst.end(ignore -> {
        completionHandler.handle(res);
      });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/io/vertx/core/eventbus/impl/clustered/ConnectionHolder.java`
#### Snippet
```java
    this.socket = socket;
    connected = true;
    socket.exceptionHandler(err -> {
      close(err);
    });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/io/vertx/core/eventbus/impl/clustered/ClusteredEventBus.java`
#### Snippet
```java
    int port = getClusterPort();
    String host = getClusterHost();
    ebContext.runOnContext(v -> {
      server.listen(port, host).flatMap(v2 -> {
        int publicPort = getClusterPublicPort(server.actualPort());
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/io/vertx/core/shareddata/impl/LocalAsyncLocks.java`
#### Snippet
```java
  private void nextWaiter(String lockName) {
    List<LockWaiter> waiters = waitersMap.compute(lockName, (s, list) -> {
      return list == null || list.size() == 1 ? null : new ArrayList<>(list.subList(1, list.size()));
    });
    if (waiters != null) {
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/io/vertx/core/eventbus/impl/EventBusImpl.java`
#### Snippet
```java
  protected void callCompletionHandlerAsync(Handler<AsyncResult<Void>> completionHandler) {
    if (completionHandler != null) {
      vertx.runOnContext(v -> {
        completionHandler.handle(Future.succeededFuture());
      });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/examples/CompletionStageInteropExamples.java`
#### Snippet
```java
        return storeInDb(key, str);
      })
      .onSuccess(str -> {
        System.out.println("We have a result: " + str);
      })
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/examples/DatagramExamples.java`
#### Snippet
```java
    Buffer buffer = Buffer.buffer("content");
    // Send a Buffer to a multicast address
    socket.send(buffer, 1234, "230.0.0.1", asyncResult -> {
      System.out.println("Send succeeded? " + asyncResult.succeeded());
    });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/examples/DatagramExamples.java`
#### Snippet
```java

        // join the multicast group
        socket.listenMulticastGroup("230.0.0.1", asyncResult2 -> {
            System.out.println("Listen succeeded? " + asyncResult2.succeeded());
        });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/examples/DatagramExamples.java`
#### Snippet
```java

    // This would block packets which are send from 10.0.0.2
    socket.blockMulticastGroup("230.0.0.1", "10.0.0.2", asyncResult -> {
      System.out.println("block succeeded? " + asyncResult.succeeded());
    });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/examples/DatagramExamples.java`
#### Snippet
```java
                // do some work

                socket.unlistenMulticastGroup("230.0.0.1", asyncResult3 -> {
                  System.out.println("Unlisten succeeded? " + asyncResult3.succeeded());
                });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/examples/DatagramExamples.java`
#### Snippet
```java
    Buffer buffer = Buffer.buffer("content");
    // Send a Buffer
    socket.send(buffer, 1234, "10.0.0.1", asyncResult -> {
      System.out.println("Send succeeded? " + asyncResult.succeeded());
    });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/examples/DatagramExamples.java`
#### Snippet
```java
    });
    // Send a String
    socket.send("A string used as content", 1234, "10.0.0.1", asyncResult -> {
      System.out.println("Send succeeded? " + asyncResult.succeeded());
    });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
      .setPort(8080)
      .setURI("/"))
      .onSuccess(request -> {
        request.send().onComplete(response -> {
          // Process response
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java

  public void runInContext(Vertx vertx) {
    vertx.getOrCreateContext().runOnContext( (v) -> {
      System.out.println("This will be executed asynchronously in the same context");
    });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java

  public void example15(Vertx vertx) {
    long timerID = vertx.setTimer(1000, id -> {
      System.out.println("And one second later this is printed");
    });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
      String result = someAPI.blockingMethod("hello");
      promise.complete(result);
    }, res -> {
      System.out.println("The result is: " + res.result());
    });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java

  public void example16(Vertx vertx) {
    long timerID = vertx.setPeriodic(1000, id -> {
      System.out.println("And every second this is printed");
    });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
      String result = someAPI.blockingMethod("hello");
      promise.complete(result);
    }, res -> {
      System.out.println("The result is: " + res.result());
    });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/examples/StreamsExamples.java`
#### Snippet
```java
        new NetServerOptions().setPort(1234).setHost("localhost")
    );
    server.connectHandler(sock -> {
      sock.handler(buffer -> {
        if (!sock.writeQueueFull()) {
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/examples/StreamsExamples.java`
#### Snippet
```java
        new NetServerOptions().setPort(1234).setHost("localhost")
    );
    server.connectHandler(sock -> {
      sock.handler(buffer -> {
        sock.write(buffer);
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/examples/StreamsExamples.java`
#### Snippet
```java
        new NetServerOptions().setPort(1234).setHost("localhost")
    );
    server.connectHandler(sock -> {
      sock.handler(buffer -> {
        // Write the data straight back
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/examples/StreamsExamples.java`
#### Snippet
```java
        new NetServerOptions().setPort(1234).setHost("localhost")
    );
    server.connectHandler(sock -> {
      sock.handler(buffer -> {
        sock.write(buffer);
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/examples/StreamsExamples.java`
#### Snippet
```java
        if (sock.writeQueueFull()) {
          sock.pause();
          sock.drainHandler(done -> {
            sock.resume();
          });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/examples/StreamsExamples.java`
#### Snippet
```java
      new NetServerOptions().setPort(1234).setHost("localhost")
    );
    server.connectHandler(sock -> {
      sock.pipeTo(sock);
    }).listen();
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/examples/EventBusExamples.java`
#### Snippet
```java

    MessageConsumer<String> consumer = eb.consumer("news.uk.sport");
    consumer.handler(message -> {
      System.out.println("I have received a message: " + message.body());
    });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/examples/EventBusExamples.java`
#### Snippet
```java
    EventBus eb = vertx.eventBus();

    eb.consumer("news.uk.sport", message -> {
      System.out.println("I have received a message: " + message.body());
    });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/examples/ParseToolsExamples.java`
#### Snippet
```java

  public void recordParserExample1() {
    final RecordParser parser = RecordParser.newDelimited("\n", h -> {
      System.out.println(h.toString());
    });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/examples/ParseToolsExamples.java`
#### Snippet
```java

  public void recordParserExample2() {
    RecordParser.newFixed(4, h -> {
      System.out.println(h.toString());
    });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/examples/FileSystemExamples.java`
#### Snippet
```java
    vertx.fileSystem().exists("target/classes/junk.txt", result -> {
      if (result.succeeded() && result.result()) {
        vertx.fileSystem().delete("target/classes/junk.txt", r -> {
          System.out.println("File deleted");
        });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/examples/HTTP2Examples.java`
#### Snippet
```java
  public void example1(HttpServerRequest request) {

    request.customFrameHandler(frame -> {

      System.out.println("Received a frame type=" + frame.type() +
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/examples/HTTP2Examples.java`
#### Snippet
```java

          // Set an handler for the response
          pushedRequest.response().onComplete(pushedResponse -> {
            System.out.println("The response for the pushed request");
          });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/examples/HTTP2Examples.java`
#### Snippet
```java

  public void example22(HttpConnection connection) {
    connection.remoteSettingsHandler(settings -> {
      System.out.println("Received new settings");
    });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/examples/HTTP2Examples.java`
#### Snippet
```java
      data.appendByte(i);
    }
    connection.ping(data, pong -> {
      System.out.println("Remote side replied");
    });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/examples/HTTP2Examples.java`
#### Snippet
```java
    HttpServer server = vertx.createHttpServer(http2Options);

    server.connectionHandler(connection -> {
      System.out.println("A client connected");
    });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/examples/HTTP2Examples.java`
#### Snippet
```java

  public void example15(HttpClientResponse response) {
    response.customFrameHandler(frame -> {

      System.out.println("Received a frame type=" + frame.type() +
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/examples/HTTP2Examples.java`
#### Snippet
```java

  public void example27(HttpConnection connection) {
    connection.goAwayHandler(goAway -> {
      System.out.println("Received a go away frame");
    });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/examples/HTTP2Examples.java`
#### Snippet
```java

  public void example24(HttpConnection connection) {
    connection.pingHandler(ping -> {
      System.out.println("Got pinged by remote side");
    });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `src/main/java/examples/HTTP2Examples.java`
#### Snippet
```java

  public void example19(HttpClient client) {
    client.connectionHandler(connection -> {
      System.out.println("Connected to the server");
    });
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `cacheDir` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/io/vertx/core/file/impl/FileCache.java`
#### Snippet
```java

  private Thread shutdownHook;
  private File cacheDir;

  public FileCache(File cacheDir) {
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `exceptionHandler` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/io/vertx/core/http/impl/HttpServerImpl.java`
#### Snippet
```java
  private Handler<HttpConnection> connectionHandler;

  private Handler<Throwable> exceptionHandler;

  public HttpServerImpl(VertxInternal vertx, HttpServerOptions options) {
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `connectionHandler` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/io/vertx/core/http/impl/HttpServerImpl.java`
#### Snippet
```java
  private final HttpStreamHandler<HttpServerRequest> requestStream = new HttpStreamHandler<>();
  private Handler<HttpServerRequest> invalidRequestHandler;
  private Handler<HttpConnection> connectionHandler;

  private Handler<Throwable> exceptionHandler;
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `demand` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/io/vertx/core/http/impl/HttpServerImpl.java`
#### Snippet
```java

    private Handler<C> handler;
    private long demand = Long.MAX_VALUE;
    private Handler<Void> endHandler;

```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `dataHandler` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/io/vertx/core/http/impl/NettyFileUpload.java`
#### Snippet
```java
  private Handler<Void> endHandler;
  private Handler<Throwable> exceptionHandler;
  private Handler<Buffer> dataHandler;
  private final long size;

```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `pipe` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/io/vertx/core/http/impl/HttpServerFileUploadImpl.java`
#### Snippet
```java
  private boolean lazyCalculateSize;
  private AsyncFile file;
  private Pipe<Buffer> pipe;
  private boolean cancelled;

```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `checkQuorumTimerID` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/io/vertx/core/impl/HAManager.java`
#### Snippet
```java

  private long quorumTimerID;
  private long checkQuorumTimerID = -1L;
  private volatile boolean attainedQuorum;
  private volatile FailoverCompleteHandler failoverCompleteHandler;
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `classloader` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/io/vertx/core/impl/launcher/commands/ClasspathHandler.java`
#### Snippet
```java

  protected Object manager;
  private ClassLoader classloader;

  /**
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `classpath` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/io/vertx/core/impl/launcher/commands/ClasspathHandler.java`
#### Snippet
```java
  protected final Logger log = LoggerFactory.getLogger(this.getClass());

  protected List<String> classpath;

  protected Object manager;
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `vertx` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/io/vertx/core/impl/launcher/commands/BareCommand.java`
#### Snippet
```java
  public static final String METRICS_OPTIONS_PROP_PREFIX = "vertx.metrics.options.";

  protected Vertx vertx;

  protected int clusterPort;
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `redeployScanPeriod` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/io/vertx/core/impl/launcher/commands/RunCommand.java`
#### Snippet
```java
  protected String onRedeployCommand;
  protected Watcher watcher;
  private long redeployScanPeriod;
  private long redeployGracePeriod;
  private long redeployTerminationPeriod;
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `redeployTerminationPeriod` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/io/vertx/core/impl/launcher/commands/RunCommand.java`
#### Snippet
```java
  private long redeployScanPeriod;
  private long redeployGracePeriod;
  private long redeployTerminationPeriod;

  /**
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `redeploy` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/io/vertx/core/impl/launcher/commands/RunCommand.java`
#### Snippet
```java

  protected String mainVerticle;
  protected List<String> redeploy;


```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `vertxApplicationBackgroundId` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/io/vertx/core/impl/launcher/commands/RunCommand.java`
#### Snippet
```java


  protected String vertxApplicationBackgroundId;
  protected String onRedeployCommand;
  protected Watcher watcher;
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `onRedeployCommand` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/io/vertx/core/impl/launcher/commands/RunCommand.java`
#### Snippet
```java

  protected String vertxApplicationBackgroundId;
  protected String onRedeployCommand;
  protected Watcher watcher;
  private long redeployScanPeriod;
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `redeployGracePeriod` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/io/vertx/core/impl/launcher/commands/RunCommand.java`
#### Snippet
```java
  protected Watcher watcher;
  private long redeployScanPeriod;
  private long redeployGracePeriod;
  private long redeployTerminationPeriod;

```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `endOnSuccess` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/io/vertx/core/streams/impl/PipeImpl.java`
#### Snippet
```java
  private final Promise<Void> result;
  private final ReadStream<T> src;
  private boolean endOnSuccess = true;
  private boolean endOnFailure = true;
  private WriteStream<T> dst;
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `dst` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/io/vertx/core/streams/impl/PipeImpl.java`
#### Snippet
```java
  private boolean endOnSuccess = true;
  private boolean endOnFailure = true;
  private WriteStream<T> dst;

  public PipeImpl(ReadStream<T> src) {
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `endOnFailure` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/io/vertx/core/streams/impl/PipeImpl.java`
#### Snippet
```java
  private final ReadStream<T> src;
  private boolean endOnSuccess = true;
  private boolean endOnFailure = true;
  private WriteStream<T> dst;

```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `options` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/io/vertx/core/eventbus/impl/MessageProducerImpl.java`
#### Snippet
```java
  private final boolean send;
  private final String address;
  private DeliveryOptions options;

  public MessageProducerImpl(Vertx vertx, String address, boolean send, DeliveryOptions options) {
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `pingTimeoutID` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/io/vertx/core/eventbus/impl/clustered/ConnectionHolder.java`
#### Snippet
```java
  private boolean connected;
  private long timeoutID = -1;
  private long pingTimeoutID = -1;

  ConnectionHolder(ClusteredEventBus eventBus, String remoteNodeId) {
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `socket` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/io/vertx/core/eventbus/impl/clustered/ConnectionHolder.java`
#### Snippet
```java

  private Queue<OutboundDeliveryContext<?>> pending;
  private NetSocket socket;
  private boolean connected;
  private long timeoutID = -1;
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `metric` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/io/vertx/core/eventbus/impl/HandlerRegistration.java`
#### Snippet
```java
  public final boolean src;
  private HandlerHolder<T> registered;
  private Object metric;

  HandlerRegistration(ContextInternal context,
```

## RuleId[ruleID=EmptyMethod]
### RuleId[ruleID=EmptyMethod]
The method is empty
in `src/main/java/io/vertx/core/AbstractVerticle.java`
#### Snippet
```java
   * @throws Exception
   */
  public void start() throws Exception {
  }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `src/main/java/io/vertx/core/AbstractVerticle.java`
#### Snippet
```java
   * @throws Exception
   */
  public void stop() throws Exception {
  }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `src/main/java/io/vertx/core/http/impl/Http1xOrH2CHandler.java`
#### Snippet
```java
  }

  protected void configure(ChannelHandlerContext ctx, boolean h2c) {
  }

```

### RuleId[ruleID=EmptyMethod]
Empty method overrides empty method
in `src/main/java/io/vertx/core/http/impl/Http2ClientConnection.java`
#### Snippet
```java

    @Override
    void handleWritabilityChanged(boolean writable) {
    }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `src/main/java/io/vertx/core/http/impl/HttpClientRequestImpl.java`
#### Snippet
```java
  }

  private void checkResponseHandler() {
/*
    if (stream == null && !connecting && responsePromise.future().getHandler() == null) {
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `src/main/java/io/vertx/core/net/impl/ChannelProvider.java`
#### Snippet
```java
        }
        @Override
        public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
          // Ignore these exception as they will be reported to the handler
        }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `src/main/java/io/vertx/core/net/impl/SslHandshakeCompletionHandler.java`
#### Snippet
```java
  }
  @Override
  public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
    // Ignore these exception as they will be reported to the handler
    // the handshake will ultimately fail or succeed
```

### RuleId[ruleID=EmptyMethod]
All implementations of this method are empty
in `src/main/java/io/vertx/core/spi/cluster/NodeSelector.java`
#### Snippet
```java
   * Invoked after the clustered {@link io.vertx.core.eventbus.EventBus} has started.
   */
  void eventBusStarted();

  /**
```

### RuleId[ruleID=EmptyMethod]
All implementations of this method are empty
in `src/main/java/io/vertx/core/spi/launcher/Command.java`
#### Snippet
```java
   * @throws CLIException if anything went wrong
   */
  void tearDown() throws CLIException;

}
```

## RuleId[ruleID=RedundantFieldInitialization]
### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `src/main/java/io/vertx/core/cli/Argument.java`
#### Snippet
```java
   * Whether or not this argument can receive multiple value. Only the last argument can receive multiple values.
   */
  protected boolean multiValued = false;

  /**
```

## RuleId[ruleID=RedundantImplements]
### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Closeable`
in `src/main/java/io/vertx/core/http/impl/HttpServerImpl.java`
#### Snippet
```java
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public class HttpServerImpl extends TCPServerBase implements HttpServer, Closeable, MetricsProvider {

  static final Logger log = LoggerFactory.getLogger(HttpServerImpl.class);
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `MetricsProvider`
in `src/main/java/io/vertx/core/http/impl/HttpServerImpl.java`
#### Snippet
```java
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public class HttpServerImpl extends TCPServerBase implements HttpServer, Closeable, MetricsProvider {

  static final Logger log = LoggerFactory.getLogger(HttpServerImpl.class);
```

## RuleId[ruleID=HtmlWrongAttributeValue]
### RuleId[ruleID=HtmlWrongAttributeValue]
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2022-11-20-15-36-25.200.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=InstanceofCatchParameter]
### RuleId[ruleID=InstanceofCatchParameter]
'instanceof' on 'catch' parameter `e`
in `src/main/java/io/vertx/core/spi/resolver/ResolverProvider.java`
#### Snippet
```java
      }
    } catch (Throwable e) {
      if (e instanceof VertxException) {
        throw e;
      }
```

## RuleId[ruleID=NonStaticFinalLogger]
### RuleId[ruleID=NonStaticFinalLogger]
Non-constant logger field `logger`
in `src/main/java/io/vertx/core/logging/JULLogDelegate.java`
#### Snippet
```java
 */
public class JULLogDelegate implements LogDelegate {
  private final java.util.logging.Logger logger;

  JULLogDelegate(final String name) {
```

## RuleId[ruleID=DuplicateThrows]
### RuleId[ruleID=DuplicateThrows]
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/main/java/io/vertx/core/json/jackson/InstantDeserializer.java`
#### Snippet
```java
class InstantDeserializer extends JsonDeserializer<Instant> {
  @Override
  public Instant deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
    String text = p.getText();
    try {
```

### RuleId[ruleID=DuplicateThrows]
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/main/java/io/vertx/core/json/jackson/BufferDeserializer.java`
#### Snippet
```java

  @Override
  public Buffer deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
    String text = p.getText();
    try {
```

### RuleId[ruleID=DuplicateThrows]
There is a more general exception, 'java.io.IOException', in the throws list already.
in `src/main/java/io/vertx/core/json/jackson/ByteArrayDeserializer.java`
#### Snippet
```java

  @Override
  public byte[] deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
    String text = p.getText();
    try {
```

## RuleId[ruleID=SynchronizeOnThis]
### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/net/impl/pool/Endpoint.java`
#### Snippet
```java

  protected boolean incRefCount() {
    synchronized (this) {
      refCount++;
      return !closed;
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/net/impl/pool/Endpoint.java`
#### Snippet
```java
  protected boolean decRefCount() {
    // CHECK SHOULD CLOSE
    synchronized (this) {
      refCount--;
      if (!checkDispose()) {
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/net/impl/pool/Endpoint.java`
#### Snippet
```java

  public boolean getConnection(ContextInternal ctx, long timeout, Handler<AsyncResult<C>> handler) {
    synchronized (this) {
      if (disposed) {
        return false;
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/net/impl/pool/Endpoint.java`
#### Snippet
```java
    requestConnection(ctx, timeout, ar -> {
      boolean dispose;
      synchronized (Endpoint.this) {
        pendingRequestCount--;
        dispose = checkDispose();
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/net/impl/pool/Endpoint.java`
#### Snippet
```java
   */
  protected void close() {
    synchronized (this) {
      if (closed) {
        throw new IllegalStateException();
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/file/impl/FileCache.java`
#### Snippet
```java

  private void runHook() {
    synchronized (this) {
      // no-op if cache dir has been set to null
      if (cacheDir == null) {
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/file/impl/FileCache.java`
#### Snippet
```java
  void close() throws IOException {
    final Thread hook;
    synchronized (this) {
      hook = shutdownHook;
      // disable the shutdown hook thread
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/file/impl/FileCache.java`
#### Snippet
```java
  private void deleteCacheDir() throws IOException {
    final File dir;
    synchronized (this) {
      if (cacheDir == null) {
        return;
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/http/impl/HttpServerImpl.java`
#### Snippet
```java
    @Override
    public ReadStream endHandler(Handler<Void> endHandler) {
      synchronized (HttpServerImpl.this) {
        this.endHandler = endHandler;
        return this;
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/http/impl/HttpServerImpl.java`
#### Snippet
```java
    @Override
    public ReadStream handler(Handler<C> handler) {
      synchronized (HttpServerImpl.this) {
        if (isListening()) {
          throw new IllegalStateException("Please set handler before server is listening");
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/http/impl/HttpServerImpl.java`
#### Snippet
```java

    boolean accept() {
      synchronized (HttpServerImpl.this) {
        boolean accept = demand > 0L;
        if (accept && demand != Long.MAX_VALUE) {
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/http/impl/HttpServerImpl.java`
#### Snippet
```java
    @Override
    public ReadStream pause() {
      synchronized (HttpServerImpl.this) {
        demand = 0L;
        return this;
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/http/impl/HttpServerImpl.java`
#### Snippet
```java

    Handler<C> handler() {
      synchronized (HttpServerImpl.this) {
        return handler;
      }
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/http/impl/HttpServerImpl.java`
#### Snippet
```java
    @Override
    public ReadStream resume() {
      synchronized (HttpServerImpl.this) {
        demand = Long.MAX_VALUE;
        return this;
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/http/impl/HttpServerImpl.java`
#### Snippet
```java

    Handler<Void> endHandler() {
      synchronized (HttpServerImpl.this) {
        return endHandler;
      }
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/http/impl/NettyFileUpload.java`
#### Snippet
```java
  public void handleException(Throwable err) {
    Handler<Throwable> handler;
    synchronized (this) {
      handler = exceptionHandler;
    }
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/http/impl/HttpServerFileUploadImpl.java`
#### Snippet
```java
  @Override
  public Future<Void> streamToFileSystem(String filename) {
    synchronized (this) {
      if (pipe != null) {
        return context.failedFuture("Already streaming");
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/http/impl/HttpServerFileUploadImpl.java`
#### Snippet
```java
      Future<Void> to = pipe.to(f);
      return to.compose(v -> {
        synchronized (HttpServerFileUploadImpl.this) {
          if (!cancelled) {
            file = f;
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/http/impl/HttpServerFileUploadImpl.java`
#### Snippet
```java
  private void handleData(Buffer data) {
    Handler<Buffer> handler;
    synchronized (HttpServerFileUploadImpl.this) {
      handler = dataHandler;
      if (lazyCalculateSize) {
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/http/impl/HttpServerFileUploadImpl.java`
#### Snippet
```java
  @Override
  public boolean cancelStreamToFileSystem() {
    synchronized (this) {
      if (pipe == null) {
        throw new IllegalStateException("Not a streaming upload");
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/http/impl/HttpServerFileUploadImpl.java`
#### Snippet
```java
  private void handleEnd() {
    Handler<Void> handler;
    synchronized (this) {
      lazyCalculateSize = false;
      handler = endHandler;
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/http/impl/HttpServerFileUploadImpl.java`
#### Snippet
```java
  private void handleException(Throwable cause) {
    Handler<Throwable> handler;
    synchronized (this) {
      handler = exceptionHandler;
    }
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/http/impl/WebSocketEndpoint.java`
#### Snippet
```java
  @Override
  public void requestConnection2(ContextInternal ctx, long timeout, Handler<AsyncResult<HttpClientConnection>> handler) {
    synchronized (this) {
      if (inflightConnections >= maxPoolSize) {
        waiters.add(new Waiter(handler, ctx));
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/http/impl/WebSocketEndpoint.java`
#### Snippet
```java
  public void close() {
    super.close();
    synchronized (this) {
      waiters.forEach(waiter -> {
        waiter.context.runOnContext(v -> {
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/http/impl/WebSocketEndpoint.java`
#### Snippet
```java
        decRefCount();
        Waiter h;
        synchronized (WebSocketEndpoint.this) {
          if (--inflightConnections > maxPoolSize || waiters.isEmpty()) {
            return;
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/impl/CloseFuture.java`
#### Snippet
```java
    boolean close;
    List<List<Closeable>> toClose = new ArrayList<>();
    synchronized (this) {
      close = !closed;
      if (weakHooks != null) {
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/impl/DuplicatedContext.java`
#### Snippet
```java
  @Override
  public final ConcurrentMap<Object, Object> localContextData() {
    synchronized (this) {
      if (localData == null) {
        localData = new ConcurrentHashMap<>();
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/impl/LoaderManager.java`
#### Snippet
```java

  void release(ClassLoaderHolder holder) {
    synchronized (this) {
      if (--holder.refCount == 0) {
        classLoaders.remove(holder.group);
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/impl/LoaderManager.java`
#### Snippet
```java
      // IMPORTANT - Isolation groups are not supported on Java 9+, because the system classloader is not an URLClassLoader
      // anymore. Thus we can't extract the paths from the classpath and isolate the loading.
      synchronized (this) {
        holder = classLoaders.get(isolationGroup);
        if (holder == null) {
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/impl/WorkerExecutorImpl.java`
#### Snippet
```java
  @Override
  public void close(Promise<Void> completion) {
    synchronized (this) {
      closed = true;
    }
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/impl/WorkerExecutorImpl.java`
#### Snippet
```java
  @Override
  public <T> Future<@Nullable T> executeBlocking(Handler<Promise<T>> blockingCodeHandler, boolean ordered) {
    synchronized (this) {
      if (closed) {
        throw new IllegalStateException("Worker executor closed");
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/impl/btc/BlockedThreadChecker.java`
#### Snippet
```java
        List<BlockedThreadEvent> events = new ArrayList<>();
        Handler<BlockedThreadEvent> handler;
        synchronized (BlockedThreadChecker.this) {
          handler = blockedThreadHandler;
          long now = System.nanoTime();
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/impl/btc/BlockedThreadChecker.java`
#### Snippet
```java
  public void close() {
    timer.cancel();
    synchronized (this) {
      //Not strictly necessary, but it helps GC to break it all down
      //when Vert.x is embedded and restarted multiple times
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/impl/HAManager.java`
#### Snippet
```java
    quorumTimerID = vertx.setPeriodic(QUORUM_CHECK_PERIOD, tid -> checkHADeployments());
    // Call check quorum to compute whether we have an initial quorum
    synchronized (this) {
      checkQuorum();
    }
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/http/impl/HttpClientImpl.java`
#### Snippet
```java
  private void checkExpired(Handler<Long> checker) {
    httpCM.forEach(EXPIRED_CHECKER);
    synchronized (this) {
      if (!closeFuture.isClosed()) {
        timerID = vertx.setTimer(options.getPoolCleanerPeriod(), checker);
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/http/impl/HttpClientImpl.java`
#### Snippet
```java
  @Override
  public void close(Promise<Void> completion) {
    synchronized (this) {
      if (timerID >= 0) {
        vertx.cancelTimer(timerID);
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/impl/future/FutureImpl.java`
#### Snippet
```java
  public void addListener(Listener<T> listener) {
    Object v;
    synchronized (this) {
      v = value;
      if (v == null) {
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/impl/future/FutureImpl.java`
#### Snippet
```java
  @Override
  public String toString() {
    synchronized (this) {
      if (value instanceof CauseHolder) {
        return "Future{cause=" + ((CauseHolder)value).cause.getMessage() + "}";
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/impl/future/FutureImpl.java`
#### Snippet
```java
    }
    Listener<T> l;
    synchronized (this) {
      if (value != null) {
        return false;
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/impl/future/FutureImpl.java`
#### Snippet
```java
  public boolean tryComplete(T result) {
    Listener<T> l;
    synchronized (this) {
      if (value != null) {
        return false;
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/impl/DeploymentManager.java`
#### Snippet
```java
        doUndeployChildren(callingContext).onComplete(childrenResult -> {
          Handler<Void> handler;
          synchronized (DeploymentImpl.this) {
            status = ST_UNDEPLOYED;
            handler = undeployHandler;
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/impl/DeploymentManager.java`
#### Snippet
```java
    @Override
    public void undeployHandler(Handler<Void> handler) {
      synchronized (this) {
        if (status != ST_UNDEPLOYED) {
          undeployHandler = handler;
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/streams/impl/InboundBuffer.java`
#### Snippet
```java
   */
  public E read() {
    synchronized (this) {
      return pending.poll();
    }
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/streams/impl/InboundBuffer.java`
#### Snippet
```java
      E element;
      Handler<E> handler;
      synchronized (this) {
        int size = pending.size();
        if (size == 0) {
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/streams/impl/InboundBuffer.java`
#### Snippet
```java
      throw new IllegalArgumentException();
    }
    synchronized (this) {
      demand += amount;
      if (demand < 0L) {
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/streams/impl/InboundBuffer.java`
#### Snippet
```java
  public boolean write(Iterable<E> elements) {
    checkThread();
    synchronized (this) {
      for (E element : elements) {
        pending.add(element);
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/streams/impl/InboundBuffer.java`
#### Snippet
```java
    Handler<E> h;
    while (true) {
      synchronized (this) {
        int size = pending.size();
        if (demand == 0L) {
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/streams/impl/InboundBuffer.java`
#### Snippet
```java
    checkThread();
    Handler<E> handler;
    synchronized (this) {
      if (demand == 0L || emitting) {
        pending.add(element);
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/streams/impl/InboundBuffer.java`
#### Snippet
```java
  private void handleException(Throwable err) {
    Handler<Throwable> handler;
    synchronized (this) {
      if ((handler = exceptionHandler) == null) {
        return;
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/streams/impl/PipeImpl.java`
#### Snippet
```java

  public void close() {
    synchronized (this) {
      src.exceptionHandler(null);
      src.handler(null);
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/streams/impl/PipeImpl.java`
#### Snippet
```java
    boolean endOnSuccess;
    boolean endOnFailure;
    synchronized (PipeImpl.this) {
      if (dst != null) {
        throw new IllegalStateException();
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/eventbus/impl/HandlerHolder.java`
#### Snippet
```java
  boolean setRemoved() {
    boolean unregistered = false;
    synchronized (this) {
      if (!removed) {
        removed = true;
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/eventbus/impl/clustered/ConnectionHolder.java`
#### Snippet
```java
      vertx.cancelTimer(pingTimeoutID);
    }
    synchronized (this) {
      OutboundDeliveryContext<?> msg;
      if (pending != null) {
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/eventbus/impl/HandlerRegistration.java`
#### Snippet
```java
  public Future<Void> unregister() {
    Promise<Void> promise = context.promise();
    synchronized (this) {
      if (registered != null) {
        bus.removeRegistration(registered, promise);
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/eventbus/impl/MessageConsumerImpl.java`
#### Snippet
```java
        Message<T> message;
        Handler<Message<T>> theHandler;
        synchronized (MessageConsumerImpl.this) {
          if (demand == 0L || (message = pending.poll()) == null) {
            return;
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/eventbus/impl/MessageConsumerImpl.java`
#### Snippet
```java
  public synchronized MessageConsumer<T> handler(Handler<Message<T>> h) {
    if (h != null) {
      synchronized (this) {
        handler = h;
        if (result == null) {
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/eventbus/impl/MessageConsumerImpl.java`
#### Snippet
```java
  protected boolean doReceive(Message<T> message) {
    Handler<Message<T>> theHandler;
    synchronized (this) {
      if (handler == null) {
        return false;
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/io/vertx/core/eventbus/impl/MessageConsumerImpl.java`
#### Snippet
```java
    List<Message<T>> discarded;
    Handler<Message<T>> discardHandler;
    synchronized (this) {
      this.maxBufferedMessages = maxBufferedMessages;
      int overflow = pending.size() - maxBufferedMessages;
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/io/vertx/core/CompositeFuture.java`
#### Snippet
```java
   */
  static CompositeFuture all(List<Future> futures) {
    return CompositeFutureImpl.all(futures.toArray(new Future[0]));
  }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/io/vertx/core/CompositeFuture.java`
#### Snippet
```java
   */
  static CompositeFuture any(List<Future> futures) {
    return CompositeFutureImpl.any(futures.toArray(new Future[0]));
  }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/io/vertx/core/CompositeFuture.java`
#### Snippet
```java
   */
  static CompositeFuture join(List<Future> futures) {
    return CompositeFutureImpl.join(futures.toArray(new Future[0]));
  }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/io/vertx/core/net/impl/TrustAllTrustManager.java`
#### Snippet
```java
  @Override
  public X509Certificate[] getAcceptedIssuers() {
    return new X509Certificate[0];
  }
}
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/io/vertx/core/impl/LoaderManager.java`
#### Snippet
```java
    // And add the URLs of the Vert.x classloader
    urls.addAll(Arrays.asList(parent.getURLs()));
    return new IsolatingClassLoader(urls.toArray(new URL[0]), parent,
      options.getIsolatedClasses());
  }
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/io/vertx/core/file/impl/FileSystemImpl.java`
#### Snippet
```java
    Objects.requireNonNull(options);
    Set<CopyOption> copyOptionSet = toCopyOptionSet(options);
    CopyOption[] copyOptions = copyOptionSet.toArray(new CopyOption[0]);
    return new BlockingAction<Void>() {
      public Void perform() {
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/io/vertx/core/file/impl/FileSystemImpl.java`
#### Snippet
```java
    Objects.requireNonNull(options);
    Set<CopyOption> copyOptionSet = toCopyOptionSet(options);
    CopyOption[] copyOptions = copyOptionSet.toArray(new CopyOption[0]);
    return new BlockingAction<Void>() {
      public Void perform() {
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/io/vertx/core/impl/DeploymentManager.java`
#### Snippet
```java
      return Future.failedFuture("Same verticle supplied more than once");
    }
    Verticle[] verticlesArray = verticles.toArray(new Verticle[0]);
    return doDeploy(identifierProvider.apply(verticlesArray[0]), options, parentContext, callingContext, tccl, verticlesArray);
  }
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/io/vertx/core/impl/launcher/commands/FileSelector.java`
#### Snippet
```java
      ret.add(st.nextToken());
    }
    return ret.toArray(new String[0]);
  }
}
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/io/vertx/core/impl/launcher/commands/Watcher.java`
#### Snippet
```java
      Map<File, File> newFiles = new LinkedHashMap<>();
      if (toWatch.isDirectory()) {
        File[] files = toWatch.exists() ? toWatch.listFiles() : new File[]{};

        if (files == null) {
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/io/vertx/core/impl/launcher/commands/RunCommand.java`
#### Snippet
```java
    args.add("--redirect-output");

    executionContext.execute("start", args.toArray(new String[0]));
    if (onCompletion != null) {
      onCompletion.handle(null);
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/io/vertx/core/eventbus/impl/EventBusImpl.java`
#### Snippet
```java
  private static final AtomicReferenceFieldUpdater<EventBusImpl, Handler[]> INBOUND_INTERCEPTORS_UPDATER = AtomicReferenceFieldUpdater.newUpdater(EventBusImpl.class, Handler[].class, "inboundInterceptors");

  private volatile Handler<DeliveryContext>[] outboundInterceptors = new Handler[0];
  private volatile Handler<DeliveryContext>[] inboundInterceptors = new Handler[0];
  private final AtomicLong replySequence = new AtomicLong(0);
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/io/vertx/core/eventbus/impl/EventBusImpl.java`
#### Snippet
```java

  private volatile Handler<DeliveryContext>[] outboundInterceptors = new Handler[0];
  private volatile Handler<DeliveryContext>[] inboundInterceptors = new Handler[0];
  private final AtomicLong replySequence = new AtomicLong(0);
  protected final VertxInternal vertx;
```

## RuleId[ruleID=CastConflictsWithInstanceof]
### RuleId[ruleID=CastConflictsWithInstanceof]
Cast to 'Long' type conflicts with preceding 'instanceof Integer' check
in `src/main/java/io/vertx/core/parsetools/impl/JsonEventImpl.java`
#### Snippet
```java
      Number number = (Number) value;
      if (value instanceof Integer) {
        return (Long)value;  // Avoids unnecessary unbox/box
      } else {
        return number.longValue();
```

## RuleId[ruleID=UnusedAssignment]
### RuleId[ruleID=UnusedAssignment]
Variable `clientAuth` initializer `DEFAULT_CLIENT_AUTH` is redundant
in `src/main/java/io/vertx/core/eventbus/EventBusOptions.java`
#### Snippet
```java
  private String host;
  private int acceptBacklog;
  private ClientAuth clientAuth = DEFAULT_CLIENT_AUTH;

  // Attributes used to configure the client of the event bus when the event bus is clustered.
```

### RuleId[ruleID=UnusedAssignment]
The value `this.endOnSuccess` assigned to `endOnSuccess` is never used
in `src/main/java/io/vertx/core/streams/impl/PipeImpl.java`
#### Snippet
```java
      }
      dst = ws;
      endOnSuccess = this.endOnSuccess;
      endOnFailure = this.endOnFailure;
    }
```

### RuleId[ruleID=UnusedAssignment]
The value `this.endOnFailure` assigned to `endOnFailure` is never used
in `src/main/java/io/vertx/core/streams/impl/PipeImpl.java`
#### Snippet
```java
      dst = ws;
      endOnSuccess = this.endOnSuccess;
      endOnFailure = this.endOnFailure;
    }
    Handler<Void> drainHandler = v -> src.resume();
```

## RuleId[ruleID=NonExceptionNameEndsWithException]
### RuleId[ruleID=NonExceptionNameEndsWithException]
Non-exception class name `DnsException` ends with 'Exception'
in `src/main/java/io/vertx/core/dns/DnsException.java`
#### Snippet
```java
 * @author <a href="mailto:nmaurer@redhat.com">Norman Maurer</a>
 */
public final class DnsException extends NoStackTraceThrowable {

  private static final String ERROR_MESSAGE_PREFIX = "DNS query error occurred: ";
```

## RuleId[ruleID=ConstantValue]
### RuleId[ruleID=ConstantValue]
Condition `metrics != null` is always `true`
in `src/main/java/io/vertx/core/http/impl/ClientHttpEndpointBase.java`
#### Snippet
```java
    if (metrics != null) {
      Object metric;
      if (metrics != null) {
        metric = metrics.enqueueRequest();
      } else {
```

### RuleId[ruleID=ConstantValue]
Condition `metrics != null` is always `true`
in `src/main/java/io/vertx/core/http/impl/ClientHttpEndpointBase.java`
#### Snippet
```java
      Handler<AsyncResult<C>> next = handler;
      handler = ar -> {
        if (metrics != null) {
          metrics.dequeueRequest(metric);
        }
```

### RuleId[ruleID=ConstantValue]
Condition `ssl == Boolean.TRUE` is always `false`
in `src/main/java/io/vertx/core/http/impl/HttpClientImpl.java`
#### Snippet
```java
        int defaultPort = 80;
        String addPort = (port != -1 && port != defaultPort) ? (":" + port) : "";
        requestURI = (ssl == Boolean.TRUE ? "https://" : "http://") + host + addPort + requestURI;
      }
      if (proxyOptions.getUsername() != null && proxyOptions.getPassword() != null) {
```

### RuleId[ruleID=ConstantValue]
Value `useSSL` is always 'false'
in `src/main/java/io/vertx/core/http/impl/HttpClientImpl.java`
#### Snippet
```java
      }
      server = SocketAddress.inetSocketAddress(proxyOptions.getPort(), proxyOptions.getHost());
      key = new EndpointKey(useSSL, proxyOptions, server, peerAddress);
      proxyOptions = null;
    } else {
```

### RuleId[ruleID=ConstantValue]
Condition `pending.isEmpty()` is always `false`
in `src/main/java/io/vertx/core/eventbus/impl/MessageConsumerImpl.java`
#### Snippet
```java
        return this;
      }
      if (pending.isEmpty()) {
        return this;
      }
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ServiceHelper` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/io/vertx/core/ServiceHelper.java`
#### Snippet
```java
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public class ServiceHelper {

  public static <T> T loadFactory(Class<T> clazz) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ReflectionUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/io/vertx/core/cli/impl/ReflectionUtils.java`
#### Snippet
```java
 * @author Clement Escoffier <clement@apache.org>
 */
public class ReflectionUtils {

  public static <T> T newInstance(Class<T> clazz) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Converters` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/io/vertx/core/cli/converters/Converters.java`
#### Snippet
```java
 * @author Clement Escoffier <clement@apache.org>
 */
public class Converters {

  private static final Map<Class<?>, Class<?>> PRIMITIVE_TO_WRAPPER_TYPE;
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `CLIConfigurator` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/io/vertx/core/cli/annotations/CLIConfigurator.java`
#### Snippet
```java
 * @author Clement Escoffier <clement@apache.org>
 */
public class CLIConfigurator {


```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `PrivateKeyParser` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
 * All credits go to the original author Zhihong Zhang (zhihong@gmail)
 */
public class PrivateKeyParser {

  /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Utils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/io/vertx/core/spi/Utils.java`
#### Snippet
```java
import java.util.List;

class Utils {

  static io.vertx.core.spi.JsonFactory load() {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `DefaultJDKCipherSuite` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/io/vertx/core/spi/tls/DefaultJDKCipherSuite.java`
#### Snippet
```java
 * Used for lazy loading the default JDK cipher suite.
 */
class DefaultJDKCipherSuite {

  private static final List<String> DEFAULT_JDK_CIPHER_SUITE;
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Extractors` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/io/vertx/core/spi/tracing/Extractors.java`
#### Snippet
```java
package io.vertx.core.spi.tracing;

class Extractors {
  static final TagExtractor EMPTY = new TagExtractor() {
  };
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `MimeMapping` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/io/vertx/core/http/impl/MimeMapping.java`
#### Snippet
```java
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public class MimeMapping {
  private static final Map<String, String> m = new HashMap<>();

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ConversionHelper` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/io/vertx/core/impl/ConversionHelper.java`
#### Snippet
```java
 * An internal conversion helper, later it could be merged with JsonObject mapFrom/mapTo and moved in Json class
 */
public class ConversionHelper {

  @SuppressWarnings("unchecked")
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Arguments` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/io/vertx/core/impl/Arguments.java`
#### Snippet
```java
 * {@link java.util.Objects#requireNonNull(Object, String)}.
 */
public class Arguments {

  /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `CpuCoreSensor` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/io/vertx/core/impl/cpu/CpuCoreSensor.java`
#### Snippet
```java
 * @author <a href="http://escoffier.me">Clement Escoffier</a>
 */
public class CpuCoreSensor {

  private static final String CPUS_ALLOWED = "Cpus_allowed:";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `CommandLineUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/io/vertx/core/impl/launcher/CommandLineUtils.java`
#### Snippet
```java
 * @author Clement Escoffier <clement@apache.org>
 */
public class CommandLineUtils {

  /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `LoggerFactory` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/io/vertx/core/impl/logging/LoggerFactory.java`
#### Snippet
```java
 */
@SuppressWarnings("deprecation")
public class LoggerFactory {

  /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ExecUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/io/vertx/core/impl/launcher/commands/ExecUtils.java`
#### Snippet
```java
 * @author Clement Escoffier <clement@apache.org>
 */
public class ExecUtils {

  private static final String SINGLE_QUOTE = "\'";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `FileSelector` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/io/vertx/core/impl/launcher/commands/FileSelector.java`
#### Snippet
```java
 * @author Clement Escoffier <clement@apache.org>
 */
public final class FileSelector {

  /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Json` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/io/vertx/core/json/Json.java`
#### Snippet
```java
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public class Json {

  /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `JsonUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/io/vertx/core/json/impl/JsonUtil.java`
#### Snippet
```java
 * Implementation utilities (details) affecting the way JSON objects are wrapped.
 */
public final class JsonUtil {

  public static final Base64.Encoder BASE64_ENCODER;
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `LoggerFactory` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/io/vertx/core/logging/LoggerFactory.java`
#### Snippet
```java
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public class LoggerFactory {

  public static final String LOGGER_DELEGATE_FACTORY_CLASS_NAME = "vertx.logger-delegate-factory-class-name";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Checker` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/io/vertx/core/shareddata/impl/Checker.java`
#### Snippet
```java
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
class Checker {

  private static final Logger log = LoggerFactory.getLogger(Checker.class);
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `DeploymentOptionsConverter` has only 'static' members, and lacks a 'private' constructor
in `src/main/generated/io/vertx/core/DeploymentOptionsConverter.java`
#### Snippet
```java
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.DeploymentOptions} original class using Vert.x codegen.
 */
public class DeploymentOptionsConverter {


```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `OpenSSLEngineOptionsConverter` has only 'static' members, and lacks a 'private' constructor
in `src/main/generated/io/vertx/core/net/OpenSSLEngineOptionsConverter.java`
#### Snippet
```java
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.OpenSSLEngineOptions} original class using Vert.x codegen.
 */
public class OpenSSLEngineOptionsConverter {


```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `NetServerOptionsConverter` has only 'static' members, and lacks a 'private' constructor
in `src/main/generated/io/vertx/core/net/NetServerOptionsConverter.java`
#### Snippet
```java
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.NetServerOptions} original class using Vert.x codegen.
 */
public class NetServerOptionsConverter {


```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ProxyOptionsConverter` has only 'static' members, and lacks a 'private' constructor
in `src/main/generated/io/vertx/core/net/ProxyOptionsConverter.java`
#### Snippet
```java
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.ProxyOptions} original class using Vert.x codegen.
 */
public class ProxyOptionsConverter {


```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ClientOptionsBaseConverter` has only 'static' members, and lacks a 'private' constructor
in `src/main/generated/io/vertx/core/net/ClientOptionsBaseConverter.java`
#### Snippet
```java
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.ClientOptionsBase} original class using Vert.x codegen.
 */
public class ClientOptionsBaseConverter {


```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `NetClientOptionsConverter` has only 'static' members, and lacks a 'private' constructor
in `src/main/generated/io/vertx/core/net/NetClientOptionsConverter.java`
#### Snippet
```java
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.NetClientOptions} original class using Vert.x codegen.
 */
public class NetClientOptionsConverter {


```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `PemTrustOptionsConverter` has only 'static' members, and lacks a 'private' constructor
in `src/main/generated/io/vertx/core/net/PemTrustOptionsConverter.java`
#### Snippet
```java
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.PemTrustOptions} original class using Vert.x codegen.
 */
public class PemTrustOptionsConverter {


```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `CopyOptionsConverter` has only 'static' members, and lacks a 'private' constructor
in `src/main/generated/io/vertx/core/file/CopyOptionsConverter.java`
#### Snippet
```java
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.file.CopyOptions} original class using Vert.x codegen.
 */
public class CopyOptionsConverter {


```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `JksOptionsConverter` has only 'static' members, and lacks a 'private' constructor
in `src/main/generated/io/vertx/core/net/JksOptionsConverter.java`
#### Snippet
```java
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.JksOptions} original class using Vert.x codegen.
 */
public class JksOptionsConverter {


```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ArgumentConverter` has only 'static' members, and lacks a 'private' constructor
in `src/main/generated/io/vertx/core/cli/ArgumentConverter.java`
#### Snippet
```java
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.cli.Argument} original class using Vert.x codegen.
 */
public class ArgumentConverter {


```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `KeyStoreOptionsConverter` has only 'static' members, and lacks a 'private' constructor
in `src/main/generated/io/vertx/core/net/KeyStoreOptionsConverter.java`
#### Snippet
```java
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.KeyStoreOptions} original class using Vert.x codegen.
 */
public class KeyStoreOptionsConverter {


```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `PfxOptionsConverter` has only 'static' members, and lacks a 'private' constructor
in `src/main/generated/io/vertx/core/net/PfxOptionsConverter.java`
#### Snippet
```java
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.PfxOptions} original class using Vert.x codegen.
 */
public class PfxOptionsConverter {


```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `OptionConverter` has only 'static' members, and lacks a 'private' constructor
in `src/main/generated/io/vertx/core/cli/OptionConverter.java`
#### Snippet
```java
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.cli.Option} original class using Vert.x codegen.
 */
public class OptionConverter {


```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `AddressResolverOptionsConverter` has only 'static' members, and lacks a 'private' constructor
in `src/main/generated/io/vertx/core/dns/AddressResolverOptionsConverter.java`
#### Snippet
```java
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.dns.AddressResolverOptions} original class using Vert.x codegen.
 */
public class AddressResolverOptionsConverter {


```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `VertxOptionsConverter` has only 'static' members, and lacks a 'private' constructor
in `src/main/generated/io/vertx/core/VertxOptionsConverter.java`
#### Snippet
```java
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.VertxOptions} original class using Vert.x codegen.
 */
public class VertxOptionsConverter {


```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `FileSystemOptionsConverter` has only 'static' members, and lacks a 'private' constructor
in `src/main/generated/io/vertx/core/file/FileSystemOptionsConverter.java`
#### Snippet
```java
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.file.FileSystemOptions} original class using Vert.x codegen.
 */
public class FileSystemOptionsConverter {


```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `OpenOptionsConverter` has only 'static' members, and lacks a 'private' constructor
in `src/main/generated/io/vertx/core/file/OpenOptionsConverter.java`
#### Snippet
```java
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.file.OpenOptions} original class using Vert.x codegen.
 */
public class OpenOptionsConverter {


```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `PemKeyCertOptionsConverter` has only 'static' members, and lacks a 'private' constructor
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.PemKeyCertOptions} original class using Vert.x codegen.
 */
public class PemKeyCertOptionsConverter {


```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `WebSocketConnectOptionsConverter` has only 'static' members, and lacks a 'private' constructor
in `src/main/generated/io/vertx/core/http/WebSocketConnectOptionsConverter.java`
#### Snippet
```java
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.http.WebSocketConnectOptions} original class using Vert.x codegen.
 */
public class WebSocketConnectOptionsConverter {


```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Http2SettingsConverter` has only 'static' members, and lacks a 'private' constructor
in `src/main/generated/io/vertx/core/http/Http2SettingsConverter.java`
#### Snippet
```java
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.http.Http2Settings} original class using Vert.x codegen.
 */
public class Http2SettingsConverter {


```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `MetricsOptionsConverter` has only 'static' members, and lacks a 'private' constructor
in `src/main/generated/io/vertx/core/metrics/MetricsOptionsConverter.java`
#### Snippet
```java
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.metrics.MetricsOptions} original class using Vert.x codegen.
 */
public class MetricsOptionsConverter {


```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `TracingOptionsConverter` has only 'static' members, and lacks a 'private' constructor
in `src/main/generated/io/vertx/core/tracing/TracingOptionsConverter.java`
#### Snippet
```java
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.tracing.TracingOptions} original class using Vert.x codegen.
 */
public class TracingOptionsConverter {


```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `TCPSSLOptionsConverter` has only 'static' members, and lacks a 'private' constructor
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.TCPSSLOptions} original class using Vert.x codegen.
 */
public class TCPSSLOptionsConverter {


```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `RequestOptionsConverter` has only 'static' members, and lacks a 'private' constructor
in `src/main/generated/io/vertx/core/http/RequestOptionsConverter.java`
#### Snippet
```java
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.http.RequestOptions} original class using Vert.x codegen.
 */
public class RequestOptionsConverter {


```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `GoAwayConverter` has only 'static' members, and lacks a 'private' constructor
in `src/main/generated/io/vertx/core/http/GoAwayConverter.java`
#### Snippet
```java
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.http.GoAway} original class using Vert.x codegen.
 */
public class GoAwayConverter {


```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `DatagramSocketOptionsConverter` has only 'static' members, and lacks a 'private' constructor
in `src/main/generated/io/vertx/core/datagram/DatagramSocketOptionsConverter.java`
#### Snippet
```java
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.datagram.DatagramSocketOptions} original class using Vert.x codegen.
 */
public class DatagramSocketOptionsConverter {


```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `HttpServerOptionsConverter` has only 'static' members, and lacks a 'private' constructor
in `src/main/generated/io/vertx/core/http/HttpServerOptionsConverter.java`
#### Snippet
```java
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.http.HttpServerOptions} original class using Vert.x codegen.
 */
public class HttpServerOptionsConverter {


```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `HttpClientOptionsConverter` has only 'static' members, and lacks a 'private' constructor
in `src/main/generated/io/vertx/core/http/HttpClientOptionsConverter.java`
#### Snippet
```java
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.http.HttpClientOptions} original class using Vert.x codegen.
 */
public class HttpClientOptionsConverter {


```

## RuleId[ruleID=DataFlowIssue]
### RuleId[ruleID=DataFlowIssue]
Dereference of `pool.waiters.poll()` may produce `NullPointerException`
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
            extra = new LeaseImpl[m];
            for (int i = 0;i < m;i++) {
              extra[i] = new LeaseImpl<>(slot, pool.waiters.poll().handler);
            }
            slot.usage += m;
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `pool.waiters.poll()` may produce `NullPointerException`
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
          leases = new LeaseImpl[m];
          for (int i = 0;i < m;i++) {
            leases[i] = new LeaseImpl<>(slot, pool.waiters.poll().handler);
          }
        } else {
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `files` may produce `NullPointerException`
in `src/main/java/io/vertx/core/file/impl/FileSystemImpl.java`
#### Snippet
```java
              files = file.listFiles(fnFilter);
            }
            List<String> ret = new ArrayList<>(files.length);
            for (File f : files) {
              ret.add(f.getCanonicalPath());
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `directory.listFiles()` may produce `NullPointerException`
in `src/main/java/io/vertx/core/impl/verticle/PackageHelper.java`
#### Snippet
```java
  private static List<JavaFileObject> browseDir(String packageName, File directory) {
    List<JavaFileObject> result = new ArrayList<>();
    for (File childFile : directory.listFiles()) {
      if (childFile.isFile() && childFile.getName().endsWith(CLASS_FILE)) {
        String binaryName = packageName + "." + childFile.getName().replaceAll(CLASS_FILE + "$", "");
```

### RuleId[ruleID=DataFlowIssue]
Casting `value` to `Long` will produce `ClassCastException` for any non-null value
in `src/main/java/io/vertx/core/parsetools/impl/JsonEventImpl.java`
#### Snippet
```java
      Number number = (Number) value;
      if (value instanceof Integer) {
        return (Long)value;  // Avoids unnecessary unbox/box
      } else {
        return number.longValue();
```

## RuleId[ruleID=UnnecessarySemicolon]
### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `src/main/java/io/vertx/core/spi/VertxMetricsFactory.java`
#### Snippet
```java
        }
      }
      BareCommand.configureFromSystemProperties(metricsOptions, METRICS_OPTIONS_PROP_PREFIX);;
      builder.options().setMetricsOptions(metricsOptions);
      if (options.getMetricsOptions().isEnabled()) {
```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `src/main/java/io/vertx/core/impl/TaskQueue.java`
#### Snippet
```java
      }
    }
  };

  /**
```

## RuleId[ruleID=SimplifyStreamApiCallChains]
### RuleId[ruleID=SimplifyStreamApiCallChains]
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `src/main/java/io/vertx/core/cli/impl/DefaultParser.java`
#### Snippet
```java

    // Check argument and option validity
    cli.getOptions().stream().forEach(Option::ensureValidity);
    cli.getArguments().stream().forEach(Argument::ensureValidity);

```

### RuleId[ruleID=SimplifyStreamApiCallChains]
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `src/main/java/io/vertx/core/cli/impl/DefaultParser.java`
#### Snippet
```java
    // Check argument and option validity
    cli.getOptions().stream().forEach(Option::ensureValidity);
    cli.getArguments().stream().forEach(Argument::ensureValidity);

    // Extract the list of required options.
```

### RuleId[ruleID=SimplifyStreamApiCallChains]
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `src/main/java/io/vertx/core/impl/launcher/ServiceCommandFactoryLoader.java`
#### Snippet
```java
  public Collection<CommandFactory<?>> lookup() {
    List<CommandFactory<?>> list = new ArrayList<>();
    commands.stream().forEach(list::add);
    return list;
  }
```

### RuleId[ruleID=SimplifyStreamApiCallChains]
Can be replaced with 'String.join'
in `src/main/java/io/vertx/core/impl/launcher/commands/RunCommand.java`
#### Snippet
```java
    }
    if (classpath != null && !classpath.isEmpty()) {
      args.add("--classpath=" + classpath.stream().collect(Collectors.joining(File.pathSeparator)));
    }
    if (vertxOptions != null) {
```

### RuleId[ruleID=SimplifyStreamApiCallChains]
Can be replaced with 'Collectors.joining'
in `src/main/java/io/vertx/core/json/pointer/impl/JsonPointerImpl.java`
#### Snippet
```java
      return replaceFragment(
          this.startingUri,
          "/" + String.join("/", decodedTokens.stream().map(this::escape).collect(Collectors.toList()))
      );
  }
```

### RuleId[ruleID=SimplifyStreamApiCallChains]
Can be replaced with 'Collectors.joining'
in `src/main/java/io/vertx/core/json/pointer/impl/JsonPointerImpl.java`
#### Snippet
```java
      return "";
    else
      return "/" + String.join("/", decodedTokens.stream().map(this::escape).collect(Collectors.toList()));
  }

```

## RuleId[ruleID=StringOperationCanBeSimplified]
### RuleId[ruleID=StringOperationCanBeSimplified]
Unnecessary string length argument
in `src/main/java/io/vertx/core/cli/impl/DefaultParser.java`
#### Snippet
```java
    }
    if (str.startsWith("--")) {
      return str.substring(2, str.length());
    } else if (str.startsWith("-")) {
      return str.substring(1, str.length());
```

### RuleId[ruleID=StringOperationCanBeSimplified]
Unnecessary string length argument
in `src/main/java/io/vertx/core/cli/impl/DefaultParser.java`
#### Snippet
```java
      return str.substring(2, str.length());
    } else if (str.startsWith("-")) {
      return str.substring(1, str.length());
    }

```

### RuleId[ruleID=StringOperationCanBeSimplified]
Unnecessary string length argument
in `src/main/java/io/vertx/core/http/impl/MimeMapping.java`
#### Snippet
```java
    int li = filename.lastIndexOf('.');
    if (li != -1 && li != filename.length() - 1) {
      String ext = filename.substring(li + 1, filename.length());
      return MimeMapping.getMimeTypeForExtension(ext);
    }
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'setExtraClasspath' is still used
in `src/main/java/io/vertx/core/DeploymentOptions.java`
#### Snippet
```java
  @GenIgnore
  @Deprecated
  public DeploymentOptions setExtraClasspath(List<String> extraClasspath) {
    this.extraClasspath = extraClasspath;
    return this;
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'setIsolationGroup' is still used
in `src/main/java/io/vertx/core/DeploymentOptions.java`
#### Snippet
```java
  @GenIgnore
  @Deprecated
  public DeploymentOptions setIsolationGroup(String isolationGroup) {
    this.isolationGroup = isolationGroup;
    return this;
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'setIsolatedClasses' is still used
in `src/main/java/io/vertx/core/DeploymentOptions.java`
#### Snippet
```java
  @GenIgnore
  @Deprecated
  public DeploymentOptions setIsolatedClasses(List<String> isolatedClasses) {
    this.isolatedClasses = isolatedClasses;
    return this;
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'getIsolatedClasses' is still used
in `src/main/java/io/vertx/core/DeploymentOptions.java`
#### Snippet
```java
  @GenIgnore
  @Deprecated
  public List<String> getIsolatedClasses() {
    return isolatedClasses;
  }
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'getIsolationGroup' is still used
in `src/main/java/io/vertx/core/DeploymentOptions.java`
#### Snippet
```java
  @GenIgnore
  @Deprecated
  public String getIsolationGroup() {
    return isolationGroup;
  }
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'getExtraClasspath' is still used
in `src/main/java/io/vertx/core/DeploymentOptions.java`
#### Snippet
```java
  @GenIgnore
  @Deprecated
  public List<String> getExtraClasspath() {
    return extraClasspath;
  }
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'getDelegate' is still used
in `src/main/java/io/vertx/core/logging/Logger.java`
#### Snippet
```java
   */
  @Deprecated
  public LogDelegate getDelegate() {
    return delegate;
  }
```

## RuleId[ruleID=Convert2MethodRef]
### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `src/main/java/io/vertx/core/impl/cpu/CpuCoreSensor.java`
#### Snippet
```java
  public static int availableProcessors() {
    if (System.getSecurityManager() != null) {
      return AccessController.doPrivileged((PrivilegedAction<Integer>) () -> (determineProcessors()));
    }

```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `src/main/java/io/vertx/core/eventbus/impl/clustered/ConnectionHolder.java`
#### Snippet
```java
    connected = true;
    socket.exceptionHandler(err -> {
      close(err);
    });
    socket.closeHandler(v -> close());
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `src/main/java/examples/StreamsExamples.java`
#### Snippet
```java
      sock.handler(buffer -> {
        // Write the data straight back
        sock.write(buffer);
      });
    }).listen();
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `src/main/generated/io/vertx/core/net/ClientOptionsBaseConverter.java`
#### Snippet
```java
    if (obj.getNonProxyHosts() != null) {
      JsonArray array = new JsonArray();
      obj.getNonProxyHosts().forEach(item -> array.add(item));
      json.put("nonProxyHosts", array);
    }
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `src/main/generated/io/vertx/core/net/NetClientOptionsConverter.java`
#### Snippet
```java
    if (obj.getApplicationLayerProtocols() != null) {
      JsonArray array = new JsonArray();
      obj.getApplicationLayerProtocols().forEach(item -> array.add(item));
      json.put("applicationLayerProtocols", array);
    }
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `src/main/generated/io/vertx/core/net/PemTrustOptionsConverter.java`
#### Snippet
```java
    if (obj.getCertPaths() != null) {
      JsonArray array = new JsonArray();
      obj.getCertPaths().forEach(item -> array.add(item));
      json.put("certPaths", array);
    }
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `src/main/generated/io/vertx/core/cli/OptionConverter.java`
#### Snippet
```java
    if (obj.getChoices() != null) {
      JsonArray array = new JsonArray();
      obj.getChoices().forEach(item -> array.add(item));
      json.put("choices", array);
    }
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `src/main/generated/io/vertx/core/dns/AddressResolverOptionsConverter.java`
#### Snippet
```java
    if (obj.getSearchDomains() != null) {
      JsonArray array = new JsonArray();
      obj.getSearchDomains().forEach(item -> array.add(item));
      json.put("searchDomains", array);
    }
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `src/main/generated/io/vertx/core/dns/AddressResolverOptionsConverter.java`
#### Snippet
```java
    if (obj.getServers() != null) {
      JsonArray array = new JsonArray();
      obj.getServers().forEach(item -> array.add(item));
      json.put("servers", array);
    }
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java
    if (obj.getCertPaths() != null) {
      JsonArray array = new JsonArray();
      obj.getCertPaths().forEach(item -> array.add(item));
      json.put("certPaths", array);
    }
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java
    if (obj.getKeyPaths() != null) {
      JsonArray array = new JsonArray();
      obj.getKeyPaths().forEach(item -> array.add(item));
      json.put("keyPaths", array);
    }
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `src/main/generated/io/vertx/core/http/WebSocketConnectOptionsConverter.java`
#### Snippet
```java
    if (obj.getSubProtocols() != null) {
      JsonArray array = new JsonArray();
      obj.getSubProtocols().forEach(item -> array.add(item));
      json.put("subProtocols", array);
    }
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
    if (obj.getCrlPaths() != null) {
      JsonArray array = new JsonArray();
      obj.getCrlPaths().forEach(item -> array.add(item));
      json.put("crlPaths", array);
    }
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
    if (obj.getEnabledCipherSuites() != null) {
      JsonArray array = new JsonArray();
      obj.getEnabledCipherSuites().forEach(item -> array.add(item));
      json.put("enabledCipherSuites", array);
    }
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
    if (obj.getEnabledSecureTransportProtocols() != null) {
      JsonArray array = new JsonArray();
      obj.getEnabledSecureTransportProtocols().forEach(item -> array.add(item));
      json.put("enabledSecureTransportProtocols", array);
    }
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `src/main/generated/io/vertx/core/http/HttpServerOptionsConverter.java`
#### Snippet
```java
    if (obj.getWebSocketSubProtocols() != null) {
      JsonArray array = new JsonArray();
      obj.getWebSocketSubProtocols().forEach(item -> array.add(item));
      json.put("webSocketSubProtocols", array);
    }
```

## RuleId[ruleID=UnnecessaryCallToStringValueOf]
### RuleId[ruleID=UnnecessaryCallToStringValueOf]
Unnecessary `Long.toString()` call
in `src/main/java/io/vertx/core/eventbus/impl/EventBusImpl.java`
#### Snippet
```java

  protected String generateReplyAddress() {
    return "__vertx.reply." + Long.toString(replySequence.incrementAndGet());
  }

```

## RuleId[ruleID=ComparatorCombinators]
### RuleId[ruleID=ComparatorCombinators]
Can be replaced with 'Comparator.comparingInt'
in `src/main/java/io/vertx/core/impl/VerticleManager.java`
#### Snippet
```java
    facts.add(factory);
    // Sort list in ascending order
    facts.sort((fact1, fact2) -> fact1.order() - fact2.order());
    factory.init(vertx);
  }
```

## RuleId[ruleID=NonSynchronizedMethodOverridesSynchronizedMethod]
### RuleId[ruleID=NonSynchronizedMethodOverridesSynchronizedMethod]
Unsynchronized method `start()` overrides synchronized method
in `src/main/java/io/vertx/core/eventbus/impl/clustered/ClusteredEventBus.java`
#### Snippet
```java

  @Override
  public void start(Promise<Void> promise) {
    NetServerOptions serverOptions = getServerOptions();
    server = vertx.createNetServer(serverOptions);
```

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'argument' in a Serializable class
in `src/main/java/io/vertx/core/cli/MissingValueException.java`
#### Snippet
```java
public class MissingValueException extends CLIException {
  private final Option option;
  private final Argument argument;

  /**
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'option' in a Serializable class
in `src/main/java/io/vertx/core/cli/MissingValueException.java`
#### Snippet
```java
 */
public class MissingValueException extends CLIException {
  private final Option option;
  private final Argument argument;

```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'option' in a Serializable class
in `src/main/java/io/vertx/core/cli/InvalidValueException.java`
#### Snippet
```java
 */
public class InvalidValueException extends CLIException {
  private final Option option;
  private final Argument argument;
  private final String value;
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'argument' in a Serializable class
in `src/main/java/io/vertx/core/cli/InvalidValueException.java`
#### Snippet
```java
public class InvalidValueException extends CLIException {
  private final Option option;
  private final Argument argument;
  private final String value;

```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'launcher' in a Serializable class
in `src/main/java/io/vertx/core/spi/launcher/ExecutionContext.java`
#### Snippet
```java
 */
public class ExecutionContext extends HashMap<String, Object> {
  private final VertxCommandLauncher launcher;
  private final Command command;
  private final CommandLine commandLine;
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'goAway' in a Serializable class
in `src/main/java/io/vertx/core/http/HttpClosedException.java`
#### Snippet
```java
  }

  private final GoAway goAway;

  public HttpClosedException() {
```

## RuleId[ruleID=CatchMayIgnoreException]
### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `src/main/java/io/vertx/core/json/pointer/impl/JsonPointerImpl.java`
#### Snippet
```java
        try {
          lastValue = iterator.getArrayElement(lastValue, Integer.parseInt(lastKey));
        } catch (NumberFormatException e) { }
      }
      if (!iterator.isNull(lastValue))
```

## RuleId[ruleID=ProtectedMemberInFinalClass]
### RuleId[ruleID=ProtectedMemberInFinalClass]
Class member declared `protected` in 'final' class
in `src/main/java/io/vertx/core/impl/launcher/commands/FileSelector.java`
#### Snippet
```java
  }

  protected static boolean matchPath(String pattern, String str, String separator, boolean isCaseSensitive) {
    return matchPathPattern(pattern, str, separator, isCaseSensitive);
  }
```

## RuleId[ruleID=UnnecessaryToStringCall]
### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `src/main/java/io/vertx/core/impl/launcher/VertxCommandLauncher.java`
#### Snippet
```java
    buildWrapped(builder, 0, "The command '" + command + "' is not a valid command." + getNewLine()
        + "See '" + getCommandLinePrefix() + " --help'");
    getPrintStream().println(builder.toString());
  }

```

### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `src/main/java/io/vertx/core/impl/launcher/VertxCommandLauncher.java`
#### Snippet
```java
    buildWrapped(builder, 0, "Run '" + getCommandLinePrefix() + " COMMAND --help' for more information on a command.");

    getPrintStream().println(builder.toString());
  }

```

### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `src/main/java/io/vertx/core/impl/launcher/VertxCommandLauncher.java`
#### Snippet
```java
    StringBuilder builder = new StringBuilder();
    cli.usage(builder, getCommandLinePrefix());
    getPrintStream().println(builder.toString());
  }

```

### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `src/main/java/io/vertx/core/impl/launcher/commands/RunCommand.java`
#### Snippet
```java
    }
    // Compute the application id. We append "-redeploy" to ease the identification in the process list.
    vertxApplicationBackgroundId = UUID.randomUUID().toString() + "-redeploy";
    watcher = new Watcher(getCwd(), redeploy,
        this::startAsBackgroundApplication,  // On deploy
```

### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `src/main/java/io/vertx/core/logging/VertxLoggerFormatter.java`
#### Snippet
```java
        record.getThrown().printStackTrace(pw);
        pw.close();
        sb.append(sw.toString());
      } catch (Exception ex) {
        ex.printStackTrace();
```

### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `src/main/java/io/vertx/core/eventbus/impl/clustered/ClusteredEventBus.java`
#### Snippet
```java
  protected String generateReplyAddress() {
    // The address is a cryptographically secure id that can't be guessed
    return "__vertx.reply." + UUID.randomUUID().toString();
  }

```

### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `src/main/java/examples/cli/CLIExamples.java`
#### Snippet
```java
      StringBuilder builder = new StringBuilder();
      cli.usage(builder);
      stream.print(builder.toString());
    }
  }
```

## RuleId[ruleID=AssignmentToForLoopParameter]
### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `index`
in `src/main/java/io/vertx/core/net/impl/pkcs1/PrivateKeyParser.java`
#### Snippet
```java
      if (bValue < 0) {
        value = (bValue & 0b01111111);
        ++index;
        if (index == oid.length) {
          throw new IllegalArgumentException("Invalid OID");
```

## RuleId[ruleID=RedundantEscapeInRegexReplacement]
### RuleId[ruleID=RedundantEscapeInRegexReplacement]
Redundant escape of '.'
in `src/main/java/io/vertx/core/net/impl/ProxyFilter.java`
#### Snippet
```java
      if (nonProxyHost.contains("*")) {
        String pattern = nonProxyHost
          .replaceAll("\\.", "\\.")
          .replaceAll("\\*", ".*");
        return Pattern.compile(pattern);
```

## RuleId[ruleID=InnerClassMayBeStatic]
### RuleId[ruleID=InnerClassMayBeStatic]
Inner class `BufferingHandler` may be 'static'
in `src/main/java/io/vertx/core/parsetools/impl/JsonParserImpl.java`
#### Snippet
```java
  }

  private class BufferingHandler implements Handler<JsonEventImpl> {

    Handler<Void> handler;
```

### RuleId[ruleID=InnerClassMayBeStatic]
Inner class `BlockingAPI` may be 'static'
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
  BlockingAPI someAPI = new BlockingAPI();

  class BlockingAPI {
    String blockingMethod(String str) {
      return str;
```

### RuleId[ruleID=InnerClassMayBeStatic]
Inner class `MyVerticle` may be 'static'
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
  }

  class MyVerticle extends AbstractVerticle {

    @Override
```

### RuleId[ruleID=InnerClassMayBeStatic]
Inner class `MyPOJO` may be 'static'
in `src/main/java/docoverride/eventbus/Examples.java`
#### Snippet
```java
  }

  class MyPOJO {

  }
```

### RuleId[ruleID=InnerClassMayBeStatic]
Inner class `Person` may be 'static'
in `src/main/java/examples/cli/TypedCLIExamples.java`
#### Snippet
```java
  }

  private class Person {

  }
```

## RuleId[ruleID=StringEqualsEmptyString]
### RuleId[ruleID=StringEqualsEmptyString]
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/io/vertx/core/json/pointer/impl/JsonPointerImpl.java`
#### Snippet
```java

  private ArrayList<String> parse(String pointer) {
    if (pointer == null || "".equals(pointer)) {
      return new ArrayList<>();
    }
```

### RuleId[ruleID=StringEqualsEmptyString]
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/io/vertx/core/json/pointer/impl/JsonPointerImpl.java`
#### Snippet
```java
    for (int i = 0; i < decodedTokens.size() - 1; i++) {
      String k = decodedTokens.get(i);
      if (i == 0 && "".equals(k)) {
        continue; // Avoid errors with root empty string
      } else if (iterator.isObject(value)) {
```

## RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `manager` accessed in synchronized context
in `src/main/java/io/vertx/core/impl/launcher/commands/ClasspathHandler.java`
#### Snippet
```java
  public synchronized void deploy(String verticle, Vertx vertx, DeploymentOptions options,
                                  Handler<AsyncResult<String>> completionHandler) {
    if (manager == null) {
      manager = newInstance();
    }
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `manager` accessed in synchronized context
in `src/main/java/io/vertx/core/impl/launcher/commands/ClasspathHandler.java`
#### Snippet
```java
                                  Handler<AsyncResult<String>> completionHandler) {
    if (manager == null) {
      manager = newInstance();
    }

```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `manager` accessed in synchronized context
in `src/main/java/io/vertx/core/impl/launcher/commands/ClasspathHandler.java`
#### Snippet
```java
    try {
      Thread.currentThread().setContextClassLoader(classloader);
      Method method = manager.getClass().getMethod("deploy", String.class, Vertx.class, DeploymentOptions.class,
          Handler.class);

```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `executionContext` accessed in synchronized context
in `src/main/java/io/vertx/core/impl/launcher/commands/ClasspathHandler.java`
#### Snippet
```java
          Handler.class);

      if (executionContext.get("Default-Verticle-Factory") != null) {
        // there is a configured default
        if (verticle.indexOf(':') == -1) {
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `executionContext` accessed in synchronized context
in `src/main/java/io/vertx/core/impl/launcher/commands/ClasspathHandler.java`
#### Snippet
```java
        if (verticle.indexOf(':') == -1) {
          // and the verticle is not using a explicit factory
          verticle = executionContext.get("Default-Verticle-Factory") + ":" + verticle;
        }
      }
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `manager` accessed in synchronized context
in `src/main/java/io/vertx/core/impl/launcher/commands/ClasspathHandler.java`
#### Snippet
```java
      }

      method.invoke(manager, verticle, vertx, options, completionHandler);
    } catch (InvocationTargetException e) {
      log.error("Failed to deploy verticle " + verticle, e.getCause());
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `classpath` accessed in synchronized context
in `src/main/java/io/vertx/core/impl/launcher/commands/ClasspathHandler.java`
#### Snippet
```java
   */
  protected synchronized ClassLoader createClassloader() {
    URL[] urls = classpath.stream().map(path -> {
      File file = new File(path);
      try {
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `classpath` accessed in synchronized context
in `src/main/java/io/vertx/core/impl/launcher/commands/ClasspathHandler.java`
#### Snippet
```java
  protected synchronized Object newInstance() {
    try {
      classloader = (classpath == null || classpath.isEmpty()) ?
          ClasspathHandler.class.getClassLoader() : createClassloader();
      Class<?> clazz = classloader.loadClass("io.vertx.core.impl.launcher.commands.VertxIsolatedDeployer");
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `classpath` accessed in synchronized context
in `src/main/java/io/vertx/core/impl/launcher/commands/ClasspathHandler.java`
#### Snippet
```java
  protected synchronized Object newInstance() {
    try {
      classloader = (classpath == null || classpath.isEmpty()) ?
          ClasspathHandler.class.getClassLoader() : createClassloader();
      Class<?> clazz = classloader.loadClass("io.vertx.core.impl.launcher.commands.VertxIsolatedDeployer");
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `vertx` accessed in synchronized context
in `src/main/java/io/vertx/core/impl/launcher/commands/BareCommand.java`
#### Snippet
```java
   */
  public synchronized Vertx vertx() {
    return vertx;
  }
}
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `watcher` accessed in synchronized context
in `src/main/java/io/vertx/core/impl/launcher/commands/RunCommand.java`
#### Snippet
```java
   */
  protected synchronized void initializeRedeployment() {
    if (watcher != null) {
      throw new IllegalStateException("Redeployment already started ? The watcher already exists");
    }
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `vertxApplicationBackgroundId` accessed in synchronized context
in `src/main/java/io/vertx/core/impl/launcher/commands/RunCommand.java`
#### Snippet
```java
    }
    // Compute the application id. We append "-redeploy" to ease the identification in the process list.
    vertxApplicationBackgroundId = UUID.randomUUID().toString() + "-redeploy";
    watcher = new Watcher(getCwd(), redeploy,
        this::startAsBackgroundApplication,  // On deploy
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `watcher` accessed in synchronized context
in `src/main/java/io/vertx/core/impl/launcher/commands/RunCommand.java`
#### Snippet
```java
    // Compute the application id. We append "-redeploy" to ease the identification in the process list.
    vertxApplicationBackgroundId = UUID.randomUUID().toString() + "-redeploy";
    watcher = new Watcher(getCwd(), redeploy,
        this::startAsBackgroundApplication,  // On deploy
        this::stopBackgroundApplication, // On undeploy
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `redeploy` accessed in synchronized context
in `src/main/java/io/vertx/core/impl/launcher/commands/RunCommand.java`
#### Snippet
```java
    // Compute the application id. We append "-redeploy" to ease the identification in the process list.
    vertxApplicationBackgroundId = UUID.randomUUID().toString() + "-redeploy";
    watcher = new Watcher(getCwd(), redeploy,
        this::startAsBackgroundApplication,  // On deploy
        this::stopBackgroundApplication, // On undeploy
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `onRedeployCommand` accessed in synchronized context
in `src/main/java/io/vertx/core/impl/launcher/commands/RunCommand.java`
#### Snippet
```java
        this::startAsBackgroundApplication,  // On deploy
        this::stopBackgroundApplication, // On undeploy
        onRedeployCommand, // In between command
        redeployGracePeriod, // The redeploy grace period
        redeployScanPeriod); // The redeploy scan period
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `watcher` accessed in synchronized context
in `src/main/java/io/vertx/core/impl/launcher/commands/RunCommand.java`
#### Snippet
```java
    });
    // Start the watching process, it triggers the initial deployment.
    watcher.watch();
  }

```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `watcher` accessed in synchronized context
in `src/main/java/io/vertx/core/impl/launcher/commands/RunCommand.java`
#### Snippet
```java
   */
  protected synchronized void shutdownRedeployment() {
    if (watcher != null) {
      watcher.close();
      watcher = null;
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `watcher` accessed in synchronized context
in `src/main/java/io/vertx/core/impl/launcher/commands/RunCommand.java`
#### Snippet
```java
  protected synchronized void shutdownRedeployment() {
    if (watcher != null) {
      watcher.close();
      watcher = null;
    }
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `watcher` accessed in synchronized context
in `src/main/java/io/vertx/core/impl/launcher/commands/RunCommand.java`
#### Snippet
```java
    if (watcher != null) {
      watcher.close();
      watcher = null;
    }
  }
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `executionContext` accessed in synchronized context
in `src/main/java/io/vertx/core/impl/launcher/commands/RunCommand.java`
#### Snippet
```java
   */
  protected synchronized void stopBackgroundApplication(Handler<Void> onCompletion) {
    executionContext.execute("stop", vertxApplicationBackgroundId, "--redeploy");
    if (redeployTerminationPeriod > 0) {
      try {
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `vertxApplicationBackgroundId` accessed in synchronized context
in `src/main/java/io/vertx/core/impl/launcher/commands/RunCommand.java`
#### Snippet
```java
   */
  protected synchronized void stopBackgroundApplication(Handler<Void> onCompletion) {
    executionContext.execute("stop", vertxApplicationBackgroundId, "--redeploy");
    if (redeployTerminationPeriod > 0) {
      try {
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `started` accessed in synchronized context
in `src/main/java/io/vertx/core/eventbus/impl/EventBusImpl.java`
#### Snippet
```java
  @Override
  public synchronized void start(Promise<Void> promise) {
    if (started) {
      throw new IllegalStateException("Already started");
    }
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `started` accessed in synchronized context
in `src/main/java/io/vertx/core/eventbus/impl/EventBusImpl.java`
#### Snippet
```java
      throw new IllegalStateException("Already started");
    }
    started = true;
    promise.complete();
  }
```

## RuleId[ruleID=RedundantSuppression]
### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `src/main/java/io/vertx/core/cli/impl/DefaultParser.java`
#### Snippet
```java
   */
  @SuppressWarnings("ResultOfMethodCallIgnored")
  private boolean isNegativeNumber(String token) {
    try {
      Double.parseDouble(token);
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `src/main/java/io/vertx/core/impl/launcher/commands/BareCommand.java`
#### Snippet
```java
   */
  @SuppressWarnings("ThrowableResultOfMethodCallIgnored")
  protected Vertx startVertx() {
    JsonObject optionsJson = getJsonFromFileOrString(vertxOptions, "options");

```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `src/main/java/io/vertx/core/net/impl/VertxEventLoopGroup.java`
#### Snippet
```java
 */
@SuppressWarnings("deprecation")
public final class VertxEventLoopGroup extends AbstractEventExecutorGroup implements EventLoopGroup {

  private int pos;
```

## RuleId[ruleID=SystemOutErr]
### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/io/vertx/core/impl/launcher/VertxCommandLauncher.java`
#### Snippet
```java
   */
  public PrintStream getPrintStream() {
    return System.out;
  }

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/io/vertx/core/logging/SLF4JLogDelegateFactory.java`
#### Snippet
```java
    // Replace the error stream since SLF4J will actually log the classloading error
    // when no implementation is available
    PrintStream err = System.err;
    try {
      System.setErr(new PrintStream(new ByteArrayOutputStream()));
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/examples/CompletionStageInteropExamples.java`
#### Snippet
```java
    future.toCompletionStage().whenComplete((ip, err) -> {
      if (err != null) {
        System.err.println("Could not resolve vertx.io");
        err.printStackTrace();
      } else {
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/CompletionStageInteropExamples.java`
#### Snippet
```java
        err.printStackTrace();
      } else {
        System.out.println("vertx.io => " + ip);
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/CompletionStageInteropExamples.java`
#### Snippet
```java
      })
      .onSuccess(str -> {
        System.out.println("We have a result: " + str);
      })
      .onFailure(err -> {
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/examples/CompletionStageInteropExamples.java`
#### Snippet
```java
      })
      .onFailure(err -> {
        System.err.println("We have a problem");
        err.printStackTrace();
      });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DatagramExamples.java`
#### Snippet
```java
    // Send a Buffer to a multicast address
    socket.send(buffer, 1234, "230.0.0.1", asyncResult -> {
      System.out.println("Send succeeded? " + asyncResult.succeeded());
    });
  }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DatagramExamples.java`
#### Snippet
```java
        });
      } else {
        System.out.println("Listen failed" + asyncResult.cause());
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DatagramExamples.java`
#### Snippet
```java
        // join the multicast group
        socket.listenMulticastGroup("230.0.0.1", asyncResult2 -> {
            System.out.println("Listen succeeded? " + asyncResult2.succeeded());
        });
      } else {
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DatagramExamples.java`
#### Snippet
```java
        });
      } else {
        System.out.println("Listen failed" + asyncResult.cause());
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DatagramExamples.java`
#### Snippet
```java
    // This would block packets which are send from 10.0.0.2
    socket.blockMulticastGroup("230.0.0.1", "10.0.0.2", asyncResult -> {
      System.out.println("block succeeded? " + asyncResult.succeeded());
    });
  }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DatagramExamples.java`
#### Snippet
```java

                socket.unlistenMulticastGroup("230.0.0.1", asyncResult3 -> {
                  System.out.println("Unlisten succeeded? " + asyncResult3.succeeded());
                });
              } else {
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DatagramExamples.java`
#### Snippet
```java
                });
              } else {
                System.out.println("Listen failed" + asyncResult2.cause());
              }
          });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DatagramExamples.java`
#### Snippet
```java
          });
        } else {
          System.out.println("Listen failed" + asyncResult.cause());
        }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DatagramExamples.java`
#### Snippet
```java
    // Send a Buffer
    socket.send(buffer, 1234, "10.0.0.1", asyncResult -> {
      System.out.println("Send succeeded? " + asyncResult.succeeded());
    });
    // Send a String
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DatagramExamples.java`
#### Snippet
```java
    // Send a String
    socket.send("A string used as content", 1234, "10.0.0.1", asyncResult -> {
      System.out.println("Send succeeded? " + asyncResult.succeeded());
    });
  }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
  public void runInContext(Vertx vertx) {
    vertx.getOrCreateContext().runOnContext( (v) -> {
      System.out.println("This will be executed asynchronously in the same context");
    });
  }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
    Context context = vertx.getOrCreateContext();
    if (context.isEventLoopContext()) {
      System.out.println("Context attached to Event Loop");
    } else if (context.isWorkerContext()) {
      System.out.println("Context attached to Worker Thread");
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
      System.out.println("Context attached to Event Loop");
    } else if (context.isWorkerContext()) {
      System.out.println("Context attached to Worker Thread");
    } else if (! Context.isOnVertxThread()) {
      System.out.println("Context not attached to a thread managed by vert.x");
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
      System.out.println("Context attached to Worker Thread");
    } else if (! Context.isOnVertxThread()) {
      System.out.println("Context not attached to a thread managed by vert.x");
    }
  }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
  public void example15(Vertx vertx) {
    long timerID = vertx.setTimer(1000, id -> {
      System.out.println("And one second later this is printed");
    });

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
    });

    System.out.println("First this is printed");
  }

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
    vertx.setPeriodic(1000, id -> {
      // This handler will get called every second
      System.out.println("timer fired!");
    });
  }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
    vertx.deployVerticle("com.mycompany.MyOrderProcessorVerticle", res -> {
      if (res.succeeded()) {
        System.out.println("Deployment id is: " + res.result());
      } else {
        System.out.println("Deployment failed!");
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
        System.out.println("Deployment id is: " + res.result());
      } else {
        System.out.println("Deployment failed!");
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
    // True when native is available
    boolean usingNative = vertx.isNativeTransportEnabled();
    System.out.println("Running with native: " + usingNative);
  }

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
    vertx.undeploy(deploymentID, res -> {
      if (res.succeeded()) {
        System.out.println("Undeployed ok");
      } else {
        System.out.println("Undeploy failed!");
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
        System.out.println("Undeployed ok");
      } else {
        System.out.println("Undeploy failed!");
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
      promise.complete(result);
    }, res -> {
      System.out.println("The result is: " + res.result());
    });
  }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
      if (ar.succeeded()) {
        FileProps props = ar.result();
        System.out.println("File size = " + props.size());
      } else {
        System.out.println("Failure: " + ar.cause().getMessage());
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
        System.out.println("File size = " + props.size());
      } else {
        System.out.println("Failure: " + ar.cause().getMessage());
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
  public void example16(Vertx vertx) {
    long timerID = vertx.setPeriodic(1000, id -> {
      System.out.println("And every second this is printed");
    });

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
    });

    System.out.println("First this is printed");
  }

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
      promise.complete(result);
    }, res -> {
      System.out.println("The result is: " + res.result());
    });
  }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
      if (ar.succeeded()) {
        FileProps props = ar.result();
        System.out.println("File size = " + props.size());
      } else {
        System.out.println("Failure: " + ar.cause().getMessage());
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
        System.out.println("File size = " + props.size());
      } else {
        System.out.println("Failure: " + ar.cause().getMessage());
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/StreamsExamples.java`
#### Snippet
```java
      sock.pipeTo(sock, ar -> {
        if (ar.succeeded()) {
          System.out.println("Pipe succeeded");
        } else {
          System.out.println("Pipe failed");
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/StreamsExamples.java`
#### Snippet
```java
          System.out.println("Pipe succeeded");
        } else {
          System.out.println("Pipe failed");
        }
      });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/ConfigurableVerticleExamples.java`
#### Snippet
```java
    @Override
    public void start() throws Exception {
        System.out.println("Configuration: " + config().getString("name"));
    }
}
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/BufferExamples.java`
#### Snippet
```java
    int pos = 15;
    buff.setUnsignedByte(pos, (short) 200);
    System.out.println(buff.getUnsignedByte(pos));
  }

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/BufferExamples.java`
#### Snippet
```java
    Buffer buff = Buffer.buffer();
    for (int i = 0; i < buff.length(); i += 4) {
      System.out.println("int value at " + i + " is " + buff.getInt(i));
    }
  }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/EventBusExamples.java`
#### Snippet
```java
        Vertx vertx = res.result();
        EventBus eventBus = vertx.eventBus();
        System.out.println("We now have a clustered event bus: " + eventBus);
      } else {
        System.out.println("Failed: " + res.cause());
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/EventBusExamples.java`
#### Snippet
```java
        System.out.println("We now have a clustered event bus: " + eventBus);
      } else {
        System.out.println("Failed: " + res.cause());
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/EventBusExamples.java`
#### Snippet
```java
    eventBus.request("news.uk.sport", "Yay! Someone kicked a ball across a patch of grass", ar -> {
      if (ar.succeeded()) {
        System.out.println("Received reply: " + ar.result().body());
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/EventBusExamples.java`
#### Snippet
```java
    consumer.unregister(res -> {
      if (res.succeeded()) {
        System.out.println("The handler un-registration has reached all nodes");
      } else {
        System.out.println("Un-registration failed!");
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/EventBusExamples.java`
#### Snippet
```java
        System.out.println("The handler un-registration has reached all nodes");
      } else {
        System.out.println("Un-registration failed!");
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/EventBusExamples.java`
#### Snippet
```java
        Vertx vertx = res.result();
        EventBus eventBus = vertx.eventBus();
        System.out.println("We now have a clustered event bus: " + eventBus);
      } else {
        System.out.println("Failed: " + res.cause());
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/EventBusExamples.java`
#### Snippet
```java
        System.out.println("We now have a clustered event bus: " + eventBus);
      } else {
        System.out.println("Failed: " + res.cause());
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/EventBusExamples.java`
#### Snippet
```java
        Vertx vertx = res.result();
        EventBus eventBus = vertx.eventBus();
        System.out.println("We now have a clustered event bus: " + eventBus);
      } else {
        System.out.println("Failed: " + res.cause());
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/EventBusExamples.java`
#### Snippet
```java
        System.out.println("We now have a clustered event bus: " + eventBus);
      } else {
        System.out.println("Failed: " + res.cause());
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/EventBusExamples.java`
#### Snippet
```java
    MessageConsumer<String> consumer = eventBus.consumer("news.uk.sport");
    consumer.handler(message -> {
      System.out.println("I have received a message: " + message.body());
      message.reply("how interesting!");
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/EventBusExamples.java`
#### Snippet
```java
    MessageConsumer<String> consumer = eb.consumer("news.uk.sport");
    consumer.handler(message -> {
      System.out.println("I have received a message: " + message.body());
    });
  }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/EventBusExamples.java`
#### Snippet
```java
    consumer.completionHandler(res -> {
      if (res.succeeded()) {
        System.out.println("The handler registration has reached all nodes");
      } else {
        System.out.println("Registration failed!");
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/EventBusExamples.java`
#### Snippet
```java
        System.out.println("The handler registration has reached all nodes");
      } else {
        System.out.println("Registration failed!");
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/EventBusExamples.java`
#### Snippet
```java

    eb.consumer("news.uk.sport", message -> {
      System.out.println("I have received a message: " + message.body());
    });
  }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/ParseToolsExamples.java`
#### Snippet
```java
          // Handle each array
          // Get the field in which this object was parsed
          System.out.println("Value : " + event.value());
          break;
        case END_OBJECT:
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/ParseToolsExamples.java`
#### Snippet
```java
  public void recordParserExample1() {
    final RecordParser parser = RecordParser.newDelimited("\n", h -> {
      System.out.println(h.toString());
    });

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/ParseToolsExamples.java`
#### Snippet
```java
          // Get the field in which this object was parsed
          String id = event.fieldName();
          System.out.println("User with id " + id + " : " + event.value());
          break;
        case END_OBJECT:
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/ParseToolsExamples.java`
#### Snippet
```java
      String id = event.fieldName();
      User user = event.mapTo(User.class);
      System.out.println("User with id " + id + " : " + user.firstName + " " + user.lastName);
    });
  }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/ParseToolsExamples.java`
#### Snippet
```java
  public void recordParserExample2() {
    RecordParser.newFixed(4, h -> {
      System.out.println(h.toString());
    });
  }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/cli/MyCommand.java`
#### Snippet
```java
  @Override
  public void run() throws CLIException {
    System.out.println("Hello " + name);
  }
}
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/docoverride/dns/Examples.java`
#### Snippet
```java
      if (ar.succeeded()) {
        String record = ar.result();
        System.out.println(record);
      } else {
        Throwable cause = ar.cause();
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/docoverride/dns/Examples.java`
#### Snippet
```java
          // ...
        } else {
          System.out.println("Failed to resolve entry" + ar.cause());
        }
      }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/FileSystemExamples.java`
#### Snippet
```java
          file.read(buff, i * 100, i * 100, 100, ar -> {
            if (ar.succeeded()) {
              System.out.println("Read ok!");
            } else {
              System.err.println("Failed to write: " + ar.cause());
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/examples/FileSystemExamples.java`
#### Snippet
```java
              System.out.println("Read ok!");
            } else {
              System.err.println("Failed to write: " + ar.cause());
            }
          });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/examples/FileSystemExamples.java`
#### Snippet
```java
        }
      } else {
        System.err.println("Cannot open file " + result.cause());
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/FileSystemExamples.java`
#### Snippet
```java
          .onComplete(v -> {
            file.close();
            System.out.println("Copy done");
          });
      } else {
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/examples/FileSystemExamples.java`
#### Snippet
```java
          });
      } else {
        System.err.println("Cannot open file " + result.cause());
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/FileSystemExamples.java`
#### Snippet
```java
    vertx.fileSystem().readFile("target/classes/readme.txt", result -> {
      if (result.succeeded()) {
        System.out.println(result.result());
      } else {
        System.err.println("Oh oh ..." + result.cause());
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/examples/FileSystemExamples.java`
#### Snippet
```java
        System.out.println(result.result());
      } else {
        System.err.println("Oh oh ..." + result.cause());
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/FileSystemExamples.java`
#### Snippet
```java
    vertx.fileSystem().copy("target/classes/readme.txt", "target/classes/readme2.txt", result -> {
      if (result.succeeded()) {
        System.out.println("File copied");
      } else {
        System.err.println("Oh oh ..." + result.cause());
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/examples/FileSystemExamples.java`
#### Snippet
```java
        System.out.println("File copied");
      } else {
        System.err.println("Oh oh ..." + result.cause());
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/FileSystemExamples.java`
#### Snippet
```java
    vertx.fileSystem().writeFile("target/classes/hello.txt", Buffer.buffer("Hello"), result -> {
      if (result.succeeded()) {
        System.out.println("File written");
      } else {
        System.err.println("Oh oh ..." + result.cause());
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/examples/FileSystemExamples.java`
#### Snippet
```java
        System.out.println("File written");
      } else {
        System.err.println("Oh oh ..." + result.cause());
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/FileSystemExamples.java`
#### Snippet
```java
      if (result.succeeded() && result.result()) {
        vertx.fileSystem().delete("target/classes/junk.txt", r -> {
          System.out.println("File deleted");
        });
      } else {
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/examples/FileSystemExamples.java`
#### Snippet
```java
        });
      } else {
        System.err.println("Oh oh ... - cannot delete the file: " + result.cause());
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/FileSystemExamples.java`
#### Snippet
```java
          file.write(buff, buff.length() * i, ar -> {
            if (ar.succeeded()) {
              System.out.println("Written ok!");
              // etc
            } else {
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/examples/FileSystemExamples.java`
#### Snippet
```java
              // etc
            } else {
              System.err.println("Failed to write: " + ar.cause());
            }
          });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/examples/FileSystemExamples.java`
#### Snippet
```java
        }
      } else {
        System.err.println("Cannot open file " + result.cause());
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/HTTP2Examples.java`
#### Snippet
```java
      if (err instanceof StreamResetException) {
        StreamResetException reset = (StreamResetException) err;
        System.out.println("Stream reset " + reset.getCode());
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/HTTP2Examples.java`
#### Snippet
```java
    request.customFrameHandler(frame -> {

      System.out.println("Received a frame type=" + frame.type() +
          " payload" + frame.payload().toString());
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/HTTP2Examples.java`
#### Snippet
```java

          // A resource is pushed for this request
          System.out.println("Server pushed " + pushedRequest.path());

          // Set an handler for the response
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/HTTP2Examples.java`
#### Snippet
```java
          // Set an handler for the response
          pushedRequest.response().onComplete(pushedResponse -> {
            System.out.println("The response for the pushed request");
          });
        });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/HTTP2Examples.java`
#### Snippet
```java
  public void example22(HttpConnection connection) {
    connection.remoteSettingsHandler(settings -> {
      System.out.println("Received new settings");
    });
  }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/HTTP2Examples.java`
#### Snippet
```java
    connection.updateSettings(new Http2Settings().setMaxConcurrentStreams(100), ar -> {
      if (ar.succeeded()) {
        System.out.println("The settings update has been acknowledged ");
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/HTTP2Examples.java`
#### Snippet
```java
            end("alert(\"Push response hello\")");
      } else {
        System.out.println("Could not push client resource " + ar.cause());
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/HTTP2Examples.java`
#### Snippet
```java
    }
    connection.ping(data, pong -> {
      System.out.println("Remote side replied");
    });
  }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/HTTP2Examples.java`
#### Snippet
```java

    server.connectionHandler(connection -> {
      System.out.println("A client connected");
    });
  }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/HTTP2Examples.java`
#### Snippet
```java
    response.customFrameHandler(frame -> {

      System.out.println("Received a frame type=" + frame.type() +
          " payload" + frame.payload().toString());
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/HTTP2Examples.java`
#### Snippet
```java
      if (err instanceof StreamResetException) {
        StreamResetException reset = (StreamResetException) err;
        System.out.println("Stream reset " + reset.getCode());
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/HTTP2Examples.java`
#### Snippet
```java
  public void example27(HttpConnection connection) {
    connection.goAwayHandler(goAway -> {
      System.out.println("Received a go away frame");
    });
  }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/HTTP2Examples.java`
#### Snippet
```java
  public void example24(HttpConnection connection) {
    connection.pingHandler(ping -> {
      System.out.println("Got pinged by remote side");
    });
  }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/HTTP2Examples.java`
#### Snippet
```java
  public void example19(HttpClient client) {
    client.connectionHandler(connection -> {
      System.out.println("Connected to the server");
    });
  }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DNSExamples.java`
#### Snippet
```java
        List<String> records = ar.result();
        for (String record: records) {
          System.out.println(record);
        }
      } else {
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DNSExamples.java`
#### Snippet
```java
        }
      } else {
        System.out.println("Failed to resolve entry" + ar.cause());
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DNSExamples.java`
#### Snippet
```java
    client.lookup6("vertx.io", ar -> {
      if (ar.succeeded()) {
        System.out.println(ar.result());
      } else {
        System.out.println("Failed to resolve entry" + ar.cause());
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DNSExamples.java`
#### Snippet
```java
        System.out.println(ar.result());
      } else {
        System.out.println("Failed to resolve entry" + ar.cause());
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DNSExamples.java`
#### Snippet
```java
        List<SrvRecord> records = ar.result();
        for (SrvRecord record: records) {
          System.out.println(record);
        }
      } else {
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DNSExamples.java`
#### Snippet
```java
        }
      } else {
        System.out.println("Failed to resolve entry" + ar.cause());
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DNSExamples.java`
#### Snippet
```java
      if (ar.succeeded()) {
        String record = ar.result();
        System.out.println(record);
      } else {
        System.out.println("Failed to resolve entry" + ar.cause());
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DNSExamples.java`
#### Snippet
```java
        System.out.println(record);
      } else {
        System.out.println("Failed to resolve entry" + ar.cause());
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DNSExamples.java`
#### Snippet
```java
        List<MxRecord> records = ar.result();
        for (MxRecord record: records) {
          System.out.println(record);
        }
      } else {
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DNSExamples.java`
#### Snippet
```java
        }
      } else {
        System.out.println("Failed to resolve entry" + ar.cause());
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DNSExamples.java`
#### Snippet
```java
        List<String> records = ar.result();
        for (String record : records) {
          System.out.println(record);
        }
      } else {
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DNSExamples.java`
#### Snippet
```java
        }
      } else {
        System.out.println("Failed to resolve entry" + ar.cause());
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DNSExamples.java`
#### Snippet
```java
    client.lookup("vertx.io", ar -> {
      if (ar.succeeded()) {
        System.out.println(ar.result());
      } else {
        System.out.println("Failed to resolve entry" + ar.cause());
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DNSExamples.java`
#### Snippet
```java
        System.out.println(ar.result());
      } else {
        System.out.println("Failed to resolve entry" + ar.cause());
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DNSExamples.java`
#### Snippet
```java
      if (ar.succeeded()) {
        String record = ar.result();
        System.out.println(record);
      } else {
        System.out.println("Failed to resolve entry" + ar.cause());
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DNSExamples.java`
#### Snippet
```java
        System.out.println(record);
      } else {
        System.out.println("Failed to resolve entry" + ar.cause());
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DNSExamples.java`
#### Snippet
```java
        List<String> records = ar.result();
        for (String record : records) {
          System.out.println(record);
        }
      } else {
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DNSExamples.java`
#### Snippet
```java
        }
      } else {
        System.out.println("Failed to resolve entry" + ar.cause());
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DNSExamples.java`
#### Snippet
```java
    client.lookup4("vertx.io", ar -> {
      if (ar.succeeded()) {
        System.out.println(ar.result());
      } else {
        System.out.println("Failed to resolve entry" + ar.cause());
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DNSExamples.java`
#### Snippet
```java
        System.out.println(ar.result());
      } else {
        System.out.println("Failed to resolve entry" + ar.cause());
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DNSExamples.java`
#### Snippet
```java
        List<String> records = ar.result();
        for (String record: records) {
          System.out.println(record);
        }
      } else {
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DNSExamples.java`
#### Snippet
```java
        }
      } else {
        System.out.println("Failed to resolve entry" + ar.cause());
      }
    });
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DNSExamples.java`
#### Snippet
```java
        List<String> records = ar.result();
        for (String record : records) {
          System.out.println(record);
        }
      } else {
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/examples/DNSExamples.java`
#### Snippet
```java
        }
      } else {
        System.out.println("Failed to resolve entry" + ar.cause());
      }
    });
```

## RuleId[ruleID=MissingDeprecatedAnnotation]
### RuleId[ruleID=MissingDeprecatedAnnotation]
Missing '@Deprecated' annotation
in `src/main/java/io/vertx/core/logging/LoggerFactory.java`
#### Snippet
```java
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public class LoggerFactory {

  public static final String LOGGER_DELEGATE_FACTORY_CLASS_NAME = "vertx.logger-delegate-factory-class-name";
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/io/vertx/core/net/impl/ProxyFilter.java`
#### Snippet
```java
      if (nonProxyHost.contains("*")) {
        String pattern = nonProxyHost
          .replaceAll("\\.", "\\.")
          .replaceAll("\\*", ".*");
        return Pattern.compile(pattern);
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/io/vertx/core/net/impl/ProxyFilter.java`
#### Snippet
```java
        String pattern = nonProxyHost
          .replaceAll("\\.", "\\.")
          .replaceAll("\\*", ".*");
        return Pattern.compile(pattern);
      } else {
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/io/vertx/core/impl/launcher/commands/ExecUtils.java`
#### Snippet
```java
      }
      if (Utils.isWindows()) {
        return buf.append(DOUBLE_QUOTE).append(cleanedArgument.replace("\"", "\\\"")).append(DOUBLE_QUOTE).toString();
      } else {
        return buf.append(SINGLE_QUOTE).append(cleanedArgument).append(
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/io/vertx/core/impl/launcher/commands/BareCommand.java`
#### Snippet
```java
      // For inlined configuration remove first and end single and double quotes if any
      this.vertxOptions = vertxOptions.trim()
        .replaceAll("^\"|\"$", "")
        .replaceAll("^'|'$", "");
    } else {
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/io/vertx/core/impl/launcher/commands/BareCommand.java`
#### Snippet
```java
      this.vertxOptions = vertxOptions.trim()
        .replaceAll("^\"|\"$", "")
        .replaceAll("^'|'$", "");
    } else {
      this.vertxOptions = null;
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/io/vertx/core/impl/verticle/JavaSourceContext.java`
#### Snippet
```java
      String source = new String(Files.readAllBytes(file.toPath()), StandardCharsets.UTF_8);
      // http://stackoverflow.com/questions/1657066/java-regular-expression-finding-comments-in-code
      source = source.replaceAll( "//.*|(\"(?:\\\\[^\"]|\\\\\"|.)*?\")|(?s)/\\*.*?\\*/", "$1 " );
      for (String line : source.split("\\r?\\n")) {
        line = line.trim();
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/io/vertx/core/impl/verticle/JavaSourceContext.java`
#### Snippet
```java
      // http://stackoverflow.com/questions/1657066/java-regular-expression-finding-comments-in-code
      source = source.replaceAll( "//.*|(\"(?:\\\\[^\"]|\\\\\"|.)*?\")|(?s)/\\*.*?\\*/", "$1 " );
      for (String line : source.split("\\r?\\n")) {
        line = line.trim();
        if (!line.isEmpty()) {
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/io/vertx/core/impl/verticle/PackageHelper.java`
#### Snippet
```java

  public List<JavaFileObject> find(String packageName) throws IOException {
    String javaPackageName = packageName.replaceAll("\\.", "/");

    List<JavaFileObject> result = new ArrayList<>();
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/io/vertx/core/impl/verticle/PackageHelper.java`
#### Snippet
```java
        String name = jarEntry.getName();
        if (name.startsWith(rootEntryName) && name.indexOf('/', rootEnd) == -1 && name.endsWith(CLASS_FILE)) {
          String binaryName = name.replaceAll("/", ".").replaceAll(CLASS_FILE + "$", "");
          result.add(new CustomJavaFileObject(URI.create(jarUri + "!/" + name), JavaFileObject.Kind.CLASS, binaryName));
        }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/io/vertx/core/impl/verticle/PackageHelper.java`
#### Snippet
```java
        String name = jarEntry.getName();
        if (name.startsWith(rootEntryName) && name.indexOf('/', rootEnd) == -1 && name.endsWith(CLASS_FILE)) {
          String binaryName = name.replaceAll("/", ".").replaceAll(CLASS_FILE + "$", "");
          result.add(new CustomJavaFileObject(URI.create(jarUri + "!/" + name), JavaFileObject.Kind.CLASS, binaryName));
        }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/io/vertx/core/impl/verticle/PackageHelper.java`
#### Snippet
```java
    for (File childFile : directory.listFiles()) {
      if (childFile.isFile() && childFile.getName().endsWith(CLASS_FILE)) {
        String binaryName = packageName + "." + childFile.getName().replaceAll(CLASS_FILE + "$", "");
        result.add(new CustomJavaFileObject(childFile.toURI(), JavaFileObject.Kind.CLASS, binaryName));
      }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/io/vertx/core/impl/launcher/commands/RunCommand.java`
#### Snippet
```java
      // For inlined configuration remove first and end single and double quotes if any
      this.config = configuration.trim()
          .replaceAll("^\"|\"$", "")
          .replaceAll("^'|'$", "");
    } else {
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/io/vertx/core/impl/launcher/commands/RunCommand.java`
#### Snippet
```java
      this.config = configuration.trim()
          .replaceAll("^\"|\"$", "")
          .replaceAll("^'|'$", "");
    } else {
      this.config = null;
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/io/vertx/core/json/pointer/impl/JsonPointerImpl.java`
#### Snippet
```java

  private String unescape(String path) {
    return path.replace("~1", "/") // https://tools.ietf.org/html/rfc6901#section-4
        .replace("~0", "~");
  }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/io/vertx/core/json/pointer/impl/JsonPointerImpl.java`
#### Snippet
```java
  private String unescape(String path) {
    return path.replace("~1", "/") // https://tools.ietf.org/html/rfc6901#section-4
        .replace("~0", "~");
  }

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/io/vertx/core/json/pointer/impl/JsonPointerImpl.java`
#### Snippet
```java

  private String escape(String path) {
    return path.replace("~", "~0")
        .replace("/", "~1");
  }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/io/vertx/core/json/pointer/impl/JsonPointerImpl.java`
#### Snippet
```java
  private String escape(String path) {
    return path.replace("~", "~0")
        .replace("/", "~1");
  }

```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/AsyncResult.java`
#### Snippet
```java
 * Encapsulates the result of an asynchronous operation.
 * <p>
 * Many operations in Vert.x APIs provide results back by passing an instance of this in a {@link io.vertx.core.Handler}.
 * <p>
 * The result can either have failed or succeeded.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/Context.java`
#### Snippet
```java
   * Is the current context a worker context?
   * <p>
   * NOTE! when running blocking code using {@link io.vertx.core.Vertx#executeBlocking(Handler, Handler)} from a
   * standard (not worker) verticle, the context will still an event loop context and this {@link this#isWorkerContext()}
   * will return false.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/Context.java`
#### Snippet
```java

/**
 * The execution context of a {@link io.vertx.core.Handler} execution.
 * <p>
 * When Vert.x provides an event to a handler or calls the start or stop methods of a {@link io.vertx.core.Verticle},
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/Context.java`
#### Snippet
```java
 * The execution context of a {@link io.vertx.core.Handler} execution.
 * <p>
 * When Vert.x provides an event to a handler or calls the start or stop methods of a {@link io.vertx.core.Verticle},
 * the execution is associated with a {@code Context}.
 * <p>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/Context.java`
#### Snippet
```java
   * Is the current context an event loop context?
   * <p>
   * NOTE! when running blocking code using {@link io.vertx.core.Vertx#executeBlocking(Handler, Handler)} from a
   * standard (not worker) verticle, the context will still an event loop context and this {@link this#isEventLoopContext()}
   * will return true.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/WorkerExecutor.java`
#### Snippet
```java
 * An executor for executing blocking code in Vert.x .<p>
 *
 * It provides the same <code>executeBlocking</code> operation than {@link io.vertx.core.Context} and
 * {@link io.vertx.core.Vertx} but on a separate worker pool.<p>
 *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/WorkerExecutor.java`
#### Snippet
```java
 *
 * It provides the same <code>executeBlocking</code> operation than {@link io.vertx.core.Context} and
 * {@link io.vertx.core.Vertx} but on a separate worker pool.<p>
 *
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/TimeoutStream.java`
#### Snippet
```java

/**
 * A timeout stream is triggered by a timer, the {@link io.vertx.core.Handler} will be call when the timer is fired,
 * it can be once or several times depending on the nature of the timer related to this stream. The
 * {@link ReadStream#endHandler(Handler)} will be called after the timer handler has been called.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/Verticle.java`
#### Snippet
```java
   * <p>
   * A promise is passed into the method, and when un-deployment is complete the verticle should either call
   * {@link io.vertx.core.Promise#complete} or {@link io.vertx.core.Promise#fail} the future.
   *
   * @param stopPromise  the future
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/Verticle.java`
#### Snippet
```java
   * <p>
   * A promise is passed into the method, and when un-deployment is complete the verticle should either call
   * {@link io.vertx.core.Promise#complete} or {@link io.vertx.core.Promise#fail} the future.
   *
   * @param stopPromise  the future
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/Verticle.java`
#### Snippet
```java
   * <p>
   * A promise is passed into the method, and when deployment is complete the verticle should either call
   * {@link io.vertx.core.Promise#complete} or {@link io.vertx.core.Promise#fail} the future.
   *
   * @param startPromise  the future
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/Verticle.java`
#### Snippet
```java
   * <p>
   * A promise is passed into the method, and when deployment is complete the verticle should either call
   * {@link io.vertx.core.Promise#complete} or {@link io.vertx.core.Promise#fail} the future.
   *
   * @param startPromise  the future
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/AbstractVerticle.java`
#### Snippet
```java
 * An abstract base class that you can extend to write your own Verticle classes.
 * <p>
 * Instead of implementing {@link io.vertx.core.Verticle} directly, it is often simpler to just extend this class.
 * <p>
 * In the simplest case, just override the {@link #start(Promise)} method. If you have verticle clean-up to do you can
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/AbstractVerticle.java`
#### Snippet
```java
 * you should override the asynchronous {@link #start(Promise) start} and {@link #stop(Promise) stop} methods.
 * <p>
 * This class also maintains references to the {@link io.vertx.core.Vertx} and {@link io.vertx.core.Context}
 * instances of the verticle for easy access.<p>
 * It also provides methods for getting the {@link #config verticle configuration}, {@link #processArgs process arguments},
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/AbstractVerticle.java`
#### Snippet
```java
 * you should override the asynchronous {@link #start(Promise) start} and {@link #stop(Promise) stop} methods.
 * <p>
 * This class also maintains references to the {@link io.vertx.core.Vertx} and {@link io.vertx.core.Context}
 * instances of the verticle for easy access.<p>
 * It also provides methods for getting the {@link #config verticle configuration}, {@link #processArgs process arguments},
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/DeploymentOptions.java`
#### Snippet
```java
   *
   * <p> The {@code VerticleFactory} will use this classloader for creating the Verticle
   * and the Verticle {@link io.vertx.core.Context} will set this classloader as context
   * classloader for the tasks execution on context.
   *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.json` is unnecessary and can be removed
in `src/main/java/io/vertx/core/VertxOptions.java`
#### Snippet
```java

  /**
   * Create an instance from a {@link io.vertx.core.json.JsonObject}
   *
   * @param json the JsonObject to create it from
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/VertxOptions.java`
#### Snippet
```java

/**
 * Instances of this class are used to configure {@link io.vertx.core.Vertx} instances.
 *
 * @author <a href="http://tfox.org">Tim Fox</a>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/Vertx.java`
#### Snippet
```java

  /**
   * Like {@link #deployVerticle(Verticle)} but {@link io.vertx.core.DeploymentOptions} are provided to configure the
   * deployment.
   *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/Vertx.java`
#### Snippet
```java

  /**
   * Like {@link #deployVerticle(String, Handler)} but {@link io.vertx.core.DeploymentOptions} are provided to configure the
   * deployment.
   *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/Vertx.java`
#### Snippet
```java

  /**
   * Like {@link #deployVerticle(Verticle, Handler)} but {@link io.vertx.core.DeploymentOptions} are provided to configure the
   * deployment.
   *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/Vertx.java`
#### Snippet
```java
 * <p>
 * To create an instance of this class you can use the static factory methods: {@link #vertx},
 * {@link #vertx(io.vertx.core.VertxOptions)} and {@link #clusteredVertx(io.vertx.core.VertxOptions, Handler)}.
 * <p>
 * Please see the user manual for more detailed usage information.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/Vertx.java`
#### Snippet
```java
 * <p>
 * To create an instance of this class you can use the static factory methods: {@link #vertx},
 * {@link #vertx(io.vertx.core.VertxOptions)} and {@link #clusteredVertx(io.vertx.core.VertxOptions, Handler)}.
 * <p>
 * Please see the user manual for more detailed usage information.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/Vertx.java`
#### Snippet
```java

  /**
   * Like {@link #deployVerticle(Verticle)} but {@link io.vertx.core.DeploymentOptions} are provided to configure the
   * deployment.
   *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.dns` is unnecessary and can be removed
in `src/main/java/io/vertx/core/dns/DnsException.java`
#### Snippet
```java

  /**
   * The {@link DnsResponseCode} which caused this {@link io.vertx.core.dns.DnsException} to be created.
   */
  public DnsResponseCode code() {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.dns` is unnecessary and can be removed
in `src/main/java/io/vertx/core/dns/DnsResponseCode.java`
#### Snippet
```java

    /**
     * Returns the {@link io.vertx.core.dns.DnsResponseCode} that corresponds with the given
     * {@code responseCode}.
     *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.dns` is unnecessary and can be removed
in `src/main/java/io/vertx/core/dns/DnsResponseCode.java`
#### Snippet
```java
     * @param responseCode
     *            the error code's id
     * @return corresponding {@link io.vertx.core.dns.DnsResponseCode}
     */
    public static DnsResponseCode valueOf(int responseCode) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.dns` is unnecessary and can be removed
in `src/main/java/io/vertx/core/dns/DnsResponseCode.java`
#### Snippet
```java

    /**
     * Returns a formatted error message for this {@link io.vertx.core.dns.DnsResponseCode}.
     */
    @Override
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.dns` is unnecessary and can be removed
in `src/main/java/io/vertx/core/dns/DnsResponseCode.java`
#### Snippet
```java

    /**
     * Returns the error code for this {@link io.vertx.core.dns.DnsResponseCode}.
     */
    public int code() {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/dns/DnsClient.java`
#### Snippet
```java
   *
   * @param name  the name for which the MX records should be resolved
   * @param handler  the {@link io.vertx.core.Handler} to notify with the {@link io.vertx.core.AsyncResult}.
   *                 The handler will get notified with a List that contains all resolved {@link MxRecord}s, sorted by
   *                 their {@link MxRecord#priority()}. If non was found it will get notified with an empty
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/dns/DnsClient.java`
#### Snippet
```java
   *
   * @param name  the name for which the MX records should be resolved
   * @param handler  the {@link io.vertx.core.Handler} to notify with the {@link io.vertx.core.AsyncResult}.
   *                 The handler will get notified with a List that contains all resolved {@link MxRecord}s, sorted by
   *                 their {@link MxRecord#priority()}. If non was found it will get notified with an empty
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/io/vertx/core/dns/DnsClient.java`
#### Snippet
```java
   *                 The handler will get notified with a List that contains all resolved {@link MxRecord}s, sorted by
   *                 their {@link MxRecord#priority()}. If non was found it will get notified with an empty
   *                 {@link java.util.List}.  If an error accours it will get failed.
   * @return a reference to this, so the API can be used fluently.
   */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/dns/DnsClient.java`
#### Snippet
```java
   *
   * @param name  the name to resolve
   * @param handler the {@link io.vertx.core.Handler} to notify with the {@link io.vertx.core.AsyncResult}.
   *                The handler will get notified with a {@link java.util.List} that contains all the resolved
   *                {@link java.net.Inet6Address}es. If none was found an empty {@link java.util.List} will be used.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/dns/DnsClient.java`
#### Snippet
```java
   *
   * @param name  the name to resolve
   * @param handler the {@link io.vertx.core.Handler} to notify with the {@link io.vertx.core.AsyncResult}.
   *                The handler will get notified with a {@link java.util.List} that contains all the resolved
   *                {@link java.net.Inet6Address}es. If none was found an empty {@link java.util.List} will be used.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/io/vertx/core/dns/DnsClient.java`
#### Snippet
```java
   * @param name  the name to resolve
   * @param handler the {@link io.vertx.core.Handler} to notify with the {@link io.vertx.core.AsyncResult}.
   *                The handler will get notified with a {@link java.util.List} that contains all the resolved
   *                {@link java.net.Inet6Address}es. If none was found an empty {@link java.util.List} will be used.
   *                If an error accours it will get failed.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/io/vertx/core/dns/DnsClient.java`
#### Snippet
```java
   * @param handler the {@link io.vertx.core.Handler} to notify with the {@link io.vertx.core.AsyncResult}.
   *                The handler will get notified with a {@link java.util.List} that contains all the resolved
   *                {@link java.net.Inet6Address}es. If none was found an empty {@link java.util.List} will be used.
   *                If an error accours it will get failed.
   * @return a reference to this, so the API can be used fluently
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/dns/DnsClient.java`
#### Snippet
```java
   *
   * @param name  the name to resolve
   * @param handler  the {@link io.vertx.core.Handler} to notify with the {@link io.vertx.core.AsyncResult}.
   *                 The handler will get notified with a {@link java.util.List} that contains all the resolved
   *                 {@link java.net.Inet4Address}es. If none was found an empty {@link java.util.List} will be used.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/dns/DnsClient.java`
#### Snippet
```java
   *
   * @param name  the name to resolve
   * @param handler  the {@link io.vertx.core.Handler} to notify with the {@link io.vertx.core.AsyncResult}.
   *                 The handler will get notified with a {@link java.util.List} that contains all the resolved
   *                 {@link java.net.Inet4Address}es. If none was found an empty {@link java.util.List} will be used.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/io/vertx/core/dns/DnsClient.java`
#### Snippet
```java
   * @param name  the name to resolve
   * @param handler  the {@link io.vertx.core.Handler} to notify with the {@link io.vertx.core.AsyncResult}.
   *                 The handler will get notified with a {@link java.util.List} that contains all the resolved
   *                 {@link java.net.Inet4Address}es. If none was found an empty {@link java.util.List} will be used.
   *                 If an error accours it will get failed.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/io/vertx/core/dns/DnsClient.java`
#### Snippet
```java
   * @param handler  the {@link io.vertx.core.Handler} to notify with the {@link io.vertx.core.AsyncResult}.
   *                 The handler will get notified with a {@link java.util.List} that contains all the resolved
   *                 {@link java.net.Inet4Address}es. If none was found an empty {@link java.util.List} will be used.
   *                 If an error accours it will get failed.
   * @return a reference to this, so the API can be used fluently
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/dns/DnsClient.java`
#### Snippet
```java
   *
   * @param name  the name to resolve
   * @param handler  the {@link io.vertx.core.Handler} to notify with the {@link io.vertx.core.AsyncResult}.
   *                 The handler will get notified with the resolved address if a record was found. If non was found it
   *                 will get notifed with {@code null}. If an error accours it will get failed.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/dns/DnsClient.java`
#### Snippet
```java
   *
   * @param name  the name to resolve
   * @param handler  the {@link io.vertx.core.Handler} to notify with the {@link io.vertx.core.AsyncResult}.
   *                 The handler will get notified with the resolved address if a record was found. If non was found it
   *                 will get notifed with {@code null}. If an error accours it will get failed.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/io/vertx/core/dns/DnsClient.java`
#### Snippet
```java
   * @param handler  the {@link Handler} to notify with the {@link AsyncResult}. The handler will get
   *                 notified with a List that contains all resolved {@link String}s. If none was found it will
   *                 get notified with an empty {@link java.util.List}. If an error accours it will get failed.
   * @return a reference to this, so the API can be used fluently.
   */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/io/vertx/core/dns/DnsClient.java`
#### Snippet
```java
   * @param handler  the {@link Handler} to notify with the {@link AsyncResult}. The handler will get
   *                 notified with a List that contains all resolved {@link SrvRecord}s. If none was found it will
   *                 get notified with an empty {@link java.util.List}. If an error accours it will get failed.
   * @return a reference to this, so the API can be used fluently.
   */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/dns/DnsClient.java`
#### Snippet
```java
   *
   * @param name  the name to resolve
   * @param handler  the {@link Handler} to notify with the {@link io.vertx.core.AsyncResult}.
   *                 The handler will get notified with the resolved {@link java.net.Inet4Address} if a record was found.
   *                 If non was found it will get notifed with {@code null}. If an error accours it will get failed.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/io/vertx/core/dns/DnsClient.java`
#### Snippet
```java
   * @param handler  the {@link Handler} to notify with the {@link AsyncResult}. The handler will get
   *                 notified with a List that contains all resolved {@link String}s. If none was found it will
   *                 get notified with an empty {@link java.util.List}.  If an error accours it will get failed.
   * @return a reference to this, so the API can be used fluently.
   */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/java/io/vertx/core/net/NetServer.java`
#### Snippet
```java
  /**
   * Start listening on the specified port and host "0.0.0.0", ignoring port and host configured in the
   * {@link io.vertx.core.net.NetServerOptions} used when creating the server.
   * <p>
   * Port {@code 0} can be specified meaning "choose an random port".
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/java/io/vertx/core/net/NetServer.java`
#### Snippet
```java

  /**
   * Start listening on the specified port and host, ignoring port and host configured in the {@link io.vertx.core.net.NetServerOptions} used when
   * creating the server.
   * <p>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/java/io/vertx/core/net/NetServer.java`
#### Snippet
```java

  /**
   * Start listening on the port and host as configured in the {@link io.vertx.core.net.NetServerOptions} used when
   * creating the server.
   * <p>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/net/NetServer.java`
#### Snippet
```java
   * Return the connect stream for this server. The server can only have at most one handler at any one time.
   * As the server accepts TCP or SSL connections it creates an instance of {@link NetSocket} and passes it to the
   * connect stream {@link ReadStream#handler(io.vertx.core.Handler)}.
   *
   * @return the connect stream
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/java/io/vertx/core/net/NetServer.java`
#### Snippet
```java

  /**
   * Start listening on the specified local address, ignoring port and host configured in the {@link io.vertx.core.net.NetServerOptions} used when
   * creating the server.
   * <p>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/java/io/vertx/core/net/NetServerOptions.java`
#### Snippet
```java

/**
 * Options for configuring a {@link io.vertx.core.net.NetServer}.
 *
 * @author <a href="http://tfox.org">Tim Fox</a>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.net.ssl` is unnecessary and can be removed
in `src/main/java/io/vertx/core/net/NetSocket.java`
#### Snippet
```java
   * @return an ordered array of the peer certificates. Returns null if connection is
   *         not SSL.
   * @throws javax.net.ssl.SSLPeerUnverifiedException SSL peer's identity has not been verified.
   * @see javax.net.ssl.SSLSession#getPeerCertificateChain()
   * @see #sslSession()
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.net.ssl` is unnecessary and can be removed
in `src/main/java/io/vertx/core/net/NetSocket.java`
#### Snippet
```java
   *         not SSL.
   * @throws javax.net.ssl.SSLPeerUnverifiedException SSL peer's identity has not been verified.
   * @see javax.net.ssl.SSLSession#getPeerCertificateChain()
   * @see #sslSession()
   * @deprecated instead use {@link #peerCertificates()} or {@link #sslSession()}
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.net.ssl` is unnecessary and can be removed
in `src/main/java/io/vertx/core/net/NetSocket.java`
#### Snippet
```java
   * @return an ordered list of the peer certificates. Returns null if connection is
   *         not SSL.
   * @throws javax.net.ssl.SSLPeerUnverifiedException SSL peer's identity has not been verified.
   * @see javax.net.ssl.SSLSession#getPeerCertificateChain()
   * @see #sslSession()
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.net.ssl` is unnecessary and can be removed
in `src/main/java/io/vertx/core/net/NetSocket.java`
#### Snippet
```java
   *         not SSL.
   * @throws javax.net.ssl.SSLPeerUnverifiedException SSL peer's identity has not been verified.
   * @see javax.net.ssl.SSLSession#getPeerCertificateChain()
   * @see #sslSession()
   */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.net.ssl` is unnecessary and can be removed
in `src/main/java/io/vertx/core/net/NetSocket.java`
#### Snippet
```java
   * @return SSLSession associated with the underlying socket. Returns null if connection is
   *         not SSL.
   * @see javax.net.ssl.SSLSession
   */
  @GenIgnore(GenIgnore.PERMITTED_TYPE)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/java/io/vertx/core/net/NetSocket.java`
#### Snippet
```java

  /**
   * @return true if this {@link io.vertx.core.net.NetSocket} is encrypted via SSL/TLS.
   */
  boolean isSsl();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/java/io/vertx/core/net/NetClientOptions.java`
#### Snippet
```java

/**
 * Options for configuring a {@link io.vertx.core.net.NetClient}.
 *
 * @author <a href="http://tfox.org">Tim Fox</a>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.spi` is unnecessary and can be removed
in `src/main/java/io/vertx/core/spi/Utils.java`
#### Snippet
```java
class Utils {

  static io.vertx.core.spi.JsonFactory load() {
    List<JsonFactory> factories = new ArrayList<>(ServiceHelper.loadFactories(io.vertx.core.spi.JsonFactory.class));
    factories.sort(Comparator.comparingInt(JsonFactory::order));
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.spi` is unnecessary and can be removed
in `src/main/java/io/vertx/core/spi/Utils.java`
#### Snippet
```java

  static io.vertx.core.spi.JsonFactory load() {
    List<JsonFactory> factories = new ArrayList<>(ServiceHelper.loadFactories(io.vertx.core.spi.JsonFactory.class));
    factories.sort(Comparator.comparingInt(JsonFactory::order));
    if (factories.size() > 0) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.spi.metrics` is unnecessary and can be removed
in `src/main/java/io/vertx/core/spi/VertxMetricsFactory.java`
#### Snippet
```java

  /**
   * Create a new {@link io.vertx.core.spi.metrics.VertxMetrics} object.<p/>
   *
   * No specific thread and context can be expected when this method is called.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/spi/cluster/ClusterManager.java`
#### Snippet
```java
 * of nodes returned by getNodes must be identical.
 * 4. All of the methods in the implementation must return immediately, i.e. they must not block while the operation
 * is being executed. If the underlying implementation does block, then {@link io.vertx.core.Vertx#executeBlocking}
 * should be used to run the operation on a worker.
 *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.spi.metrics` is unnecessary and can be removed
in `src/main/java/io/vertx/core/spi/metrics/DatagramSocketMetrics.java`
#### Snippet
```java
 * Unless specified otherwise, all the methods on this object including the methods inherited from the super interfaces are invoked
 * with the thread of the http server and therefore are the same than the
 * {@link io.vertx.core.spi.metrics.VertxMetrics} {@code createMetrics} method that created and returned
 * this metrics object.
 *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.http` is unnecessary and can be removed
in `src/main/java/io/vertx/core/spi/metrics/VertxMetrics.java`
#### Snippet
```java
 * to be called by Vert.x itself for events like verticles deployed, timers created, etc. The other
 * to provide Vert.x with other metrics SPI's which will be used for specific components i.e.
 * {@link io.vertx.core.http.HttpServer}, {@link io.vertx.core.spi.metrics.EventBusMetrics}, etc.
 *
 * @author <a href="mailto:nscavell@redhat.com">Nick Scavelli</a>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.spi.metrics` is unnecessary and can be removed
in `src/main/java/io/vertx/core/spi/metrics/VertxMetrics.java`
#### Snippet
```java
 * to be called by Vert.x itself for events like verticles deployed, timers created, etc. The other
 * to provide Vert.x with other metrics SPI's which will be used for specific components i.e.
 * {@link io.vertx.core.http.HttpServer}, {@link io.vertx.core.spi.metrics.EventBusMetrics}, etc.
 *
 * @author <a href="mailto:nscavell@redhat.com">Nick Scavelli</a>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.spi.metrics` is unnecessary and can be removed
in `src/main/java/io/vertx/core/spi/metrics/MetricsProvider.java`
#### Snippet
```java

/**
 * Metrics provider is the base SPI used by metrics implementations to retrieve a {@link io.vertx.core.spi.metrics.Metrics}
 * object.<p/>
 *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.metrics` is unnecessary and can be removed
in `src/main/java/io/vertx/core/spi/metrics/MetricsProvider.java`
#### Snippet
```java
 * object.<p/>
 *
 * It is meant to be implemented by {@link io.vertx.core.metrics.Measured} implementations but not exposed directly.
 *
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.eventbus` is unnecessary and can be removed
in `src/main/java/io/vertx/core/spi/metrics/EventBusMetrics.java`
#### Snippet
```java
  /**
   * Called whenever the event bus delivers a reply failure to the sender/publisher, the
   * {@link io.vertx.core.eventbus.ReplyFailure reply failure} indicates the nature of the failure.<p/>
   *
   * No specific thread and context can be expected when this method is called.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.eventbus` is unnecessary and can be removed
in `src/main/java/io/vertx/core/spi/metrics/EventBusMetrics.java`
#### Snippet
```java
   *
   * @param address the address
   * @param failure the {@link io.vertx.core.eventbus.ReplyFailure}
   */
  default void replyFailure(String address, ReplyFailure failure) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.spi.metrics` is unnecessary and can be removed
in `src/main/java/io/vertx/core/spi/metrics/TCPMetrics.java`
#### Snippet
```java
 * Unless specified otherwise, all the methods on this object including the methods inherited from the super interfaces are invoked
 * with the thread of the client/server and therefore are the same than the
 * {@link io.vertx.core.spi.metrics.VertxMetrics} {@code createMetrics} method that created and returned
 * this metrics object.
 *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.spi.metrics` is unnecessary and can be removed
in `src/main/java/io/vertx/core/spi/metrics/HttpServerMetrics.java`
#### Snippet
```java
 * Unless specified otherwise, all the methods on this object including the methods inherited from the super interfaces are invoked
 * with the thread of the http server and therefore are the same than the
 * {@link io.vertx.core.spi.metrics.VertxMetrics} {@code createMetrics} method that created and returned
 * this metrics object.
 *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.spi.metrics` is unnecessary and can be removed
in `src/main/java/io/vertx/core/spi/metrics/HttpClientMetrics.java`
#### Snippet
```java
 * Unless specified otherwise, all the methods on this object including the methods inherited from the super interfaces are invoked
 * with the thread of the http client and therefore are the same than the
 * {@link io.vertx.core.spi.metrics.VertxMetrics} {@code createMetrics} method that created and returned
 * this metrics object.
 *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.file` is unnecessary and can be removed
in `src/main/java/io/vertx/core/file/OpenOptions.java`
#### Snippet
```java

/**
 * Describes how an {@link io.vertx.core.file.AsyncFile} should be opened.
 *
 * @author <a href="http://tfox.org">Tim Fox</a>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.streams` is unnecessary and can be removed
in `src/main/java/io/vertx/core/file/AsyncFile.java`
#### Snippet
```java

  /**
   * Sets the number of bytes that will be read when using the file as a {@link io.vertx.core.streams.ReadStream}.
   *
   * @param readLength the bytes that will be read from the file
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.streams` is unnecessary and can be removed
in `src/main/java/io/vertx/core/file/AsyncFile.java`
#### Snippet
```java

  /**
   * @return the number of bytes that will be read when using the file as a {@link io.vertx.core.streams.ReadStream}
   */
  long getReadLength();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.streams` is unnecessary and can be removed
in `src/main/java/io/vertx/core/file/AsyncFile.java`
#### Snippet
```java
 * Represents a file on the file-system which can be read from, or written to asynchronously.
 * <p>
 * This class also implements {@link io.vertx.core.streams.ReadStream} and
 * {@link io.vertx.core.streams.WriteStream}. This allows the data to be piped to and from
 * other streams, e.g. an {@link io.vertx.core.http.HttpClientRequest} instance,
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.streams` is unnecessary and can be removed
in `src/main/java/io/vertx/core/file/AsyncFile.java`
#### Snippet
```java
 * <p>
 * This class also implements {@link io.vertx.core.streams.ReadStream} and
 * {@link io.vertx.core.streams.WriteStream}. This allows the data to be piped to and from
 * other streams, e.g. an {@link io.vertx.core.http.HttpClientRequest} instance,
 * using the {@link io.vertx.core.streams.Pipe} class
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.streams` is unnecessary and can be removed
in `src/main/java/io/vertx/core/file/AsyncFile.java`
#### Snippet
```java

  /**
   * Sets the position from which data will be read from when using the file as a {@link io.vertx.core.streams.ReadStream}.
   *
   * @param readPos  the position in the file
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.buffer` is unnecessary and can be removed
in `src/main/java/io/vertx/core/file/AsyncFile.java`
#### Snippet
```java

  /**
   * Write a {@link io.vertx.core.buffer.Buffer} to the file at position {@code position} in the file, asynchronously.
   * <p>
   * If {@code position} lies outside of the current size
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.streams` is unnecessary and can be removed
in `src/main/java/io/vertx/core/file/AsyncFile.java`
#### Snippet
```java

  /**
   * Sets the position from which data will be written when using the file as a {@link io.vertx.core.streams.WriteStream}.
   *
   * @param writePos  the position in the file
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.file` is unnecessary and can be removed
in `src/main/java/io/vertx/core/file/FileSystem.java`
#### Snippet
```java

  /**
   * Blocking version of {@link #open(String, io.vertx.core.file.OpenOptions, Handler)}
   */
  AsyncFile openBlocking(String path, OpenOptions options);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.streams` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/HttpServer.java`
#### Snippet
```java
  /**
   * Return the WebSocket stream for the server. If a WebSocket connect handshake is successful a
   * new {@link ServerWebSocket} instance will be created and passed to the stream {@link io.vertx.core.streams.ReadStream#handler(io.vertx.core.Handler)}.
   *
   * @return the WebSocket stream
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/HttpServer.java`
#### Snippet
```java
  /**
   * Return the WebSocket stream for the server. If a WebSocket connect handshake is successful a
   * new {@link ServerWebSocket} instance will be created and passed to the stream {@link io.vertx.core.streams.ReadStream#handler(io.vertx.core.Handler)}.
   *
   * @return the WebSocket stream
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.streams` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/HttpServer.java`
#### Snippet
```java
  /**
   * Return the request stream for the server. As HTTP requests are received by the server,
   * instances of {@link HttpServerRequest} will be created and passed to the stream {@link io.vertx.core.streams.ReadStream#handler(io.vertx.core.Handler)}.
   *
   * @return the request stream
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/HttpServer.java`
#### Snippet
```java
  /**
   * Return the request stream for the server. As HTTP requests are received by the server,
   * instances of {@link HttpServerRequest} will be created and passed to the stream {@link io.vertx.core.streams.ReadStream#handler(io.vertx.core.Handler)}.
   *
   * @return the request stream
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.http` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/HttpServer.java`
#### Snippet
```java
  /**
   * Like {@link #listen(int, String)} but the server will listen on host "0.0.0.0" and port specified here ignoring
   * any value in the {@link io.vertx.core.http.HttpServerOptions} that was used when creating the server.
   *
   * @param port  the port to listen on
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.http` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/HttpServer.java`
#### Snippet
```java
  /**
   * Tell the server to start listening. The server will listen on the port and host specified here,
   * ignoring any value set in the {@link io.vertx.core.http.HttpServerOptions} that was used when creating the server.
   * <p>
   * The listen happens asynchronously and the server may not be listening until some time after the call has returned.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.http` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/HttpServer.java`
#### Snippet
```java
  /**
   * Tell the server to start listening. The server will listen on the port and host specified in the
   * {@link io.vertx.core.http.HttpServerOptions} that was used when creating the server.
   * <p>
   * The listen happens asynchronously and the server may not be listening until some time after the call has returned.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.net.ssl` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/HttpConnection.java`
#### Snippet
```java
   * @return an ordered array of the peer certificates. Returns null if connection is
   *         not SSL.
   * @throws javax.net.ssl.SSLPeerUnverifiedException SSL peer's identity has not been verified.
   * @see javax.net.ssl.SSLSession#getPeerCertificateChain()
   * @see #sslSession()
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.net.ssl` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/HttpConnection.java`
#### Snippet
```java
   *         not SSL.
   * @throws javax.net.ssl.SSLPeerUnverifiedException SSL peer's identity has not been verified.
   * @see javax.net.ssl.SSLSession#getPeerCertificateChain()
   * @see #sslSession()
   * @deprecated instead use {@link #peerCertificates()} or {@link #sslSession()}
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.net.ssl` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/HttpConnection.java`
#### Snippet
```java
   * @return an ordered list of the peer certificates. Returns null if connection is
   *         not SSL.
   * @throws javax.net.ssl.SSLPeerUnverifiedException SSL peer's identity has not been verified.
   * @see javax.net.ssl.SSLSession#getPeerCertificateChain()
   * @see #sslSession()
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.net.ssl` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/HttpConnection.java`
#### Snippet
```java
   *         not SSL.
   * @throws javax.net.ssl.SSLPeerUnverifiedException SSL peer's identity has not been verified.
   * @see javax.net.ssl.SSLSession#getPeerCertificateChain()
   * @see #sslSession()
   */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.net.ssl` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/HttpConnection.java`
#### Snippet
```java
   * @return SSLSession associated with the underlying socket. Returns null if connection is
   *         not SSL.
   * @see javax.net.ssl.SSLSession
   */
  @GenIgnore(GenIgnore.PERMITTED_TYPE)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.http` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/HttpConnection.java`
#### Snippet
```java

  /**
   * @return true if this {@link io.vertx.core.http.HttpConnection} is encrypted via SSL/TLS.
   */
  boolean isSsl();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.http` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/HttpServerOptions.java`
#### Snippet
```java

/**
 * Represents options used by an {@link io.vertx.core.http.HttpServer} instance
 *
 * @author <a href="http://tfox.org">Tim Fox</a>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.http` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/HttpClientResponse.java`
#### Snippet
```java
 * Represents a client-side HTTP response.
 * <p>
 * Vert.x provides you with one of these via the handler that was provided when creating the {@link io.vertx.core.http.HttpClientRequest}
 * or that was set on the {@link io.vertx.core.http.HttpClientRequest} instance.
 * <p>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.http` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/HttpClientResponse.java`
#### Snippet
```java
 * <p>
 * Vert.x provides you with one of these via the handler that was provided when creating the {@link io.vertx.core.http.HttpClientRequest}
 * or that was set on the {@link io.vertx.core.http.HttpClientRequest} instance.
 * <p>
 * It implements {@link io.vertx.core.streams.ReadStream} so it can be used with
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.streams` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/HttpClientResponse.java`
#### Snippet
```java
 * or that was set on the {@link io.vertx.core.http.HttpClientRequest} instance.
 * <p>
 * It implements {@link io.vertx.core.streams.ReadStream} so it can be used with
 * {@link io.vertx.core.streams.Pipe} to pipe data with flow control.
 *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/HttpClientRequest.java`
#### Snippet
```java
   * @param chunk the data chunk
   * @return a future completed with the result
   * @throws java.lang.IllegalStateException when no response handler is set
   */
  Future<Void> write(String chunk);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.streams` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/HttpClientRequest.java`
#### Snippet
```java
 * This class supports both chunked and non-chunked HTTP.
 * <p>
 * It implements {@link io.vertx.core.streams.WriteStream} so it can be used with
 * {@link io.vertx.core.streams.Pipe} to pipe data with flow control.
 * <p>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/HttpClientRequest.java`
#### Snippet
```java
   * written to it.
   * <p>
   * This is normally used to implement HTTP 100-continue handling, see {@link #continueHandler(io.vertx.core.Handler)} for
   * more information.
   *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/HttpClientRequest.java`
#### Snippet
```java
   *
   * @return a reference to this, so the API can be used fluently
   * @throws java.lang.IllegalStateException when no response handler is set
   */
  Future<Void> sendHead();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/HttpClientRequest.java`
#### Snippet
```java
   *
   * @return a future completed with the result
   * @throws java.lang.IllegalStateException when no response handler is set
   */
  @Override
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/HttpClientRequest.java`
#### Snippet
```java
   *
   * @return a future completed with the result
   * @throws java.lang.IllegalStateException when no response handler is set
   */
  @Override
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/HttpClientRequest.java`
#### Snippet
```java
   * @param enc the encoding
   * @return a future completed with the result
   * @throws java.lang.IllegalStateException when no response handler is set
   */
  Future<Void> end(String chunk, String enc);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/HttpClientRequest.java`
#### Snippet
```java
   * @param enc the encoding
   * @return a future completed with the result
   * @throws java.lang.IllegalStateException when no response handler is set
   */
  Future<Void> write(String chunk, String enc);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/HttpClientRequest.java`
#### Snippet
```java
   * @param chunk the data chunk
   * @return a future completed with the result
   * @throws java.lang.IllegalStateException when no response handler is set
   */
  Future<Void> end(String chunk);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.net.ssl` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/WebSocketBase.java`
#### Snippet
```java
   * @return an ordered list of the peer certificates. Returns null if connection is
   *         not SSL.
   * @throws javax.net.ssl.SSLPeerUnverifiedException SSL peer's identity has not been verified.
   * @see javax.net.ssl.SSLSession#getPeerCertificateChain()
   * @see #sslSession()
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.net.ssl` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/WebSocketBase.java`
#### Snippet
```java
   *         not SSL.
   * @throws javax.net.ssl.SSLPeerUnverifiedException SSL peer's identity has not been verified.
   * @see javax.net.ssl.SSLSession#getPeerCertificateChain()
   * @see #sslSession()
   */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.net.ssl` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/WebSocketBase.java`
#### Snippet
```java
   * @return SSLSession associated with the underlying socket. Returns null if connection is
   *         not SSL.
   * @see javax.net.ssl.SSLSession
   */
  @GenIgnore(GenIgnore.PERMITTED_TYPE)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.http` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/WebSocketBase.java`
#### Snippet
```java

  /**
   * @return true if this {@link io.vertx.core.http.HttpConnection} is encrypted via SSL/TLS.
   */
  boolean isSsl();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.net.ssl` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/WebSocketBase.java`
#### Snippet
```java
   * @return an ordered array of the peer certificates. Returns null if connection is
   *         not SSL.
   * @throws javax.net.ssl.SSLPeerUnverifiedException SSL peer's identity has not been verified.
   * @see javax.net.ssl.SSLSession#getPeerCertificateChain()
   * @see #sslSession()
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.net.ssl` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/WebSocketBase.java`
#### Snippet
```java
   *         not SSL.
   * @throws javax.net.ssl.SSLPeerUnverifiedException SSL peer's identity has not been verified.
   * @see javax.net.ssl.SSLSession#getPeerCertificateChain()
   * @see #sslSession()
   * @deprecated instead use {@link #peerCertificates()} or {@link #sslSession()}
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.http` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/HttpClient.java`
#### Snippet
```java
 * The client can also pool HTTP connections.
 * <p>
 * For pooling to occur, keep-alive must be true on the {@link io.vertx.core.http.HttpClientOptions} (default is true).
 * In this case connections will be pooled and re-used if there are pending HTTP requests waiting to get a connection,
 * otherwise they will be closed.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.http` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/HttpClient.java`
#### Snippet
```java
 * before the response from the preceding one has returned. Pipe-lining is not appropriate for all requests.
 * <p>
 * To enable pipe-lining, it must be enabled on the {@link io.vertx.core.http.HttpClientOptions} (default is false).
 * <p>
 * When pipe-lining is enabled the connection will be automatically closed when all in-flight responses have returned
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.streams` is unnecessary and can be removed
in `src/main/java/io/vertx/core/http/HttpServerResponse.java`
#### Snippet
```java
 * from the file and written to the outgoing socket.
 * <p>
 * It implements {@link io.vertx.core.streams.WriteStream} so it can be used with
 * {@link io.vertx.core.streams.Pipe} to pipe data with flow control.
 *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.spi` is unnecessary and can be removed
in `src/main/java/io/vertx/core/json/Json.java`
#### Snippet
```java
   * the codec will only use {@code jackson-core} and provide best effort mapping.
   */
  public static io.vertx.core.spi.JsonFactory load() {
    return JsonFactory.load();
  }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.spi` is unnecessary, and can be replaced with an import
in `src/main/java/io/vertx/core/json/jackson/JacksonFactory.java`
#### Snippet
```java
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class JacksonFactory implements io.vertx.core.spi.JsonFactory {

  public static final JacksonFactory INSTANCE = new JacksonFactory();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/vertx/core/json/JsonArray.java`
#### Snippet
```java
   * @param pos the position in the array
   * @return the Integer, or null if a null value present
   * @throws java.lang.ClassCastException if the value cannot be converted to Integer
   */
  public Integer getInteger(int pos) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/vertx/core/json/JsonArray.java`
#### Snippet
```java
   * @param pos the position in the array
   * @return the Boolean, or null if a null value present
   * @throws java.lang.ClassCastException if the value cannot be converted to Integer
   */
  public Boolean getBoolean(int pos) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/vertx/core/json/JsonArray.java`
#### Snippet
```java
   * @param pos the position in the array
   * @return the Long, or null if a null value present
   * @throws java.lang.ClassCastException if the value cannot be converted to Long
   */
  public Long getLong(int pos) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/vertx/core/json/JsonArray.java`
#### Snippet
```java
   * @param pos the position in the array
   * @return the Instant, or null if a null value present
   * @throws java.lang.ClassCastException            if the value cannot be converted to String
   * @throws java.time.format.DateTimeParseException if the String value is not a legal ISO 8601 encoded value
   */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/vertx/core/json/JsonArray.java`
#### Snippet
```java
   * @param pos the position in the array
   * @return the byte[], or null if a null value present
   * @throws java.lang.ClassCastException       if the value cannot be converted to String
   * @throws java.lang.IllegalArgumentException if the String value is not a legal Base64 encoded value
   */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/vertx/core/json/JsonArray.java`
#### Snippet
```java
   * @return the byte[], or null if a null value present
   * @throws java.lang.ClassCastException       if the value cannot be converted to String
   * @throws java.lang.IllegalArgumentException if the String value is not a legal Base64 encoded value
   */
  public byte[] getBinary(int pos) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/vertx/core/json/JsonArray.java`
#### Snippet
```java
   * @param pos the position in the array
   * @return the Double, or null if a null value present
   * @throws java.lang.ClassCastException if the value cannot be converted to Double
   */
  public Double getDouble(int pos) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/vertx/core/json/JsonArray.java`
#### Snippet
```java
   * @param pos the position in the array
   * @return the JsonObject, or null if a null value present
   * @throws java.lang.ClassCastException if the value cannot be converted to JsonObject
   */
  public JsonObject getJsonObject(int pos) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/vertx/core/json/JsonArray.java`
#### Snippet
```java
   * @param pos the position in the array
   * @return the Integer, or null if a null value present
   * @throws java.lang.ClassCastException if the value cannot be converted to JsonArray
   */
  public JsonArray getJsonArray(int pos) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/vertx/core/json/JsonArray.java`
#### Snippet
```java
   * @param pos the position in the array
   * @return the Float, or null if a null value present
   * @throws java.lang.ClassCastException if the value cannot be converted to Float
   */
  public Float getFloat(int pos) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/vertx/core/json/JsonArray.java`
#### Snippet
```java
   * @param pos the position in the array
   * @return the Number, or null if a null value present
   * @throws java.lang.ClassCastException if the value is not a Number
   */
  public Number getNumber(int pos) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/vertx/core/json/JsonArray.java`
#### Snippet
```java
   * @param pos the position in the array
   * @return the byte[], or null if a null value present
   * @throws java.lang.ClassCastException       if the value cannot be converted to String
   * @throws java.lang.IllegalArgumentException if the String value is not a legal Base64 encoded value
   */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/vertx/core/json/JsonArray.java`
#### Snippet
```java
   * @return the byte[], or null if a null value present
   * @throws java.lang.ClassCastException       if the value cannot be converted to String
   * @throws java.lang.IllegalArgumentException if the String value is not a legal Base64 encoded value
   */
  public Buffer getBuffer(int pos) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.spi.logging` is unnecessary and can be removed
in `src/main/java/io/vertx/core/logging/JULLogDelegateFactory.java`
#### Snippet
```java

/**
 * A {@link io.vertx.core.spi.logging.LogDelegateFactory} which creates {@link JULLogDelegate} instances.
 *
 * @author <a href="kenny.macleod@kizoom.com">Kenny MacLeod</a>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.logging` is unnecessary, and can be replaced with an import
in `src/main/java/io/vertx/core/logging/VertxLoggerFormatter.java`
#### Snippet
```java
 * @author <a href="mailto:andy.taylor@jboss.org">Andy Taylor</a>
 */
public class VertxLoggerFormatter extends java.util.logging.Formatter {

  @Override
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.logging.log4j` is unnecessary, and can be replaced with an import
in `src/main/java/io/vertx/core/logging/Log4j2LogDelegate.java`
#### Snippet
```java

  Log4j2LogDelegate(final String name) {
    logger = (ExtendedLogger) org.apache.logging.log4j.LogManager.getLogger(name);
  }

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.logging` is unnecessary and can be removed
in `src/main/java/io/vertx/core/logging/Logger.java`
#### Snippet
```java
 * If you would prefer to use Log4J 2 or SLF4J instead of JUL then you can set a system property called
 * {@code vertx.logger-delegate-factory-class-name} to the class name of the delegate for your logging system.
 * For Log4J 2 the value is {@link io.vertx.core.logging.Log4j2LogDelegateFactory}, for SLF4J the value
 * is {@link io.vertx.core.logging.SLF4JLogDelegateFactory}. You will need to ensure whatever jar files
 * required by your favourite log framework are on your classpath.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.logging` is unnecessary and can be removed
in `src/main/java/io/vertx/core/logging/Logger.java`
#### Snippet
```java
 * {@code vertx.logger-delegate-factory-class-name} to the class name of the delegate for your logging system.
 * For Log4J 2 the value is {@link io.vertx.core.logging.Log4j2LogDelegateFactory}, for SLF4J the value
 * is {@link io.vertx.core.logging.SLF4JLogDelegateFactory}. You will need to ensure whatever jar files
 * required by your favourite log framework are on your classpath.
 * <p>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.json` is unnecessary and can be removed
in `src/main/java/io/vertx/core/metrics/MetricsOptions.java`
#### Snippet
```java

  /**
   * Create an instance from a {@link io.vertx.core.json.JsonObject}
   *
   * @param json the JsonObject to create it from
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.spi.logging` is unnecessary and can be removed
in `src/main/java/io/vertx/core/logging/JULLogDelegate.java`
#### Snippet
```java

/**
 * A {@link io.vertx.core.spi.logging.LogDelegate} which delegates to java.util.logging
 *
 * @author <a href="kenny.macleod@kizoom.com">Kenny MacLeod</a>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/java/io/vertx/core/datagram/DatagramPacket.java`
#### Snippet
```java

  /**
   * Returns the {@link io.vertx.core.net.SocketAddress} of the sender that sent
   * this {@link io.vertx.core.datagram.DatagramPacket}.
   *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.datagram` is unnecessary and can be removed
in `src/main/java/io/vertx/core/datagram/DatagramPacket.java`
#### Snippet
```java
  /**
   * Returns the {@link io.vertx.core.net.SocketAddress} of the sender that sent
   * this {@link io.vertx.core.datagram.DatagramPacket}.
   *
   * @return the address of the sender
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.datagram` is unnecessary and can be removed
in `src/main/java/io/vertx/core/datagram/DatagramPacket.java`
#### Snippet
```java

  /**
   * Returns the data of the {@link io.vertx.core.datagram.DatagramPacket}
   *
   * @return the data
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/java/io/vertx/core/datagram/DatagramSocket.java`
#### Snippet
```java
  /**
   * Returns a {@code WriteStream<Buffer>} able to send {@link Buffer} to the
   * {@link io.vertx.core.net.SocketAddress}.
   *
   * @param port the port of the remote peer
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.datagram` is unnecessary and can be removed
in `src/main/java/io/vertx/core/datagram/DatagramSocket.java`
#### Snippet
```java

  /**
   * Closes the {@link io.vertx.core.datagram.DatagramSocket}. The close itself is asynchronous.
   */
  Future<Void> close();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/java/io/vertx/core/datagram/DatagramSocket.java`
#### Snippet
```java

  /**
   * Return the {@link io.vertx.core.net.SocketAddress} to which
   * this {@link io.vertx.core.datagram.DatagramSocket} is bound.
   *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.datagram` is unnecessary and can be removed
in `src/main/java/io/vertx/core/datagram/DatagramSocket.java`
#### Snippet
```java
  /**
   * Return the {@link io.vertx.core.net.SocketAddress} to which
   * this {@link io.vertx.core.datagram.DatagramSocket} is bound.
   *
   * @return the socket address
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.buffer` is unnecessary and can be removed
in `src/main/java/io/vertx/core/datagram/DatagramSocket.java`
#### Snippet
```java

  /**
   * Write the given {@link io.vertx.core.buffer.Buffer} to the {@link io.vertx.core.net.SocketAddress}.
   * The {@link io.vertx.core.Handler} will be notified once the write completes.
   *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/java/io/vertx/core/datagram/DatagramSocket.java`
#### Snippet
```java

  /**
   * Write the given {@link io.vertx.core.buffer.Buffer} to the {@link io.vertx.core.net.SocketAddress}.
   * The {@link io.vertx.core.Handler} will be notified once the write completes.
   *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/datagram/DatagramSocket.java`
#### Snippet
```java
  /**
   * Write the given {@link io.vertx.core.buffer.Buffer} to the {@link io.vertx.core.net.SocketAddress}.
   * The {@link io.vertx.core.Handler} will be notified once the write completes.
   *
   * @param packet  the {@link io.vertx.core.buffer.Buffer} to write
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.buffer` is unnecessary and can be removed
in `src/main/java/io/vertx/core/datagram/DatagramSocket.java`
#### Snippet
```java
   * The {@link io.vertx.core.Handler} will be notified once the write completes.
   *
   * @param packet  the {@link io.vertx.core.buffer.Buffer} to write
   * @param port  the host port of the remote peer
   * @param host  the host address of the remote peer
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/datagram/DatagramSocket.java`
#### Snippet
```java
   * @param port  the host port of the remote peer
   * @param host  the host address of the remote peer
   * @param handler  the {@link io.vertx.core.Handler} to notify once the write completes.
   * @return a reference to this, so the API can be used fluently
   */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/java/io/vertx/core/datagram/DatagramSocket.java`
#### Snippet
```java

  /**
   * Write the given {@link String} to the {@link io.vertx.core.net.SocketAddress} using the given encoding.
   * The {@link Handler} will be notified once the write completes.
   *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/datagram/DatagramSocket.java`
#### Snippet
```java
   * @param port  the host port of the remote peer
   * @param host  the host address of the remote peer
   * @param handler  the {@link io.vertx.core.Handler} to notify once the write completes.
   * @return a reference to this, so the API can be used fluently
   */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.datagram` is unnecessary and can be removed
in `src/main/java/io/vertx/core/datagram/DatagramSocket.java`
#### Snippet
```java

  /**
   * Closes the {@link io.vertx.core.datagram.DatagramSocket} implementation asynchronous
   * and notifies the handler once done.
   *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/java/io/vertx/core/datagram/DatagramSocket.java`
#### Snippet
```java

  /**
   * Write the given {@link String} to the {@link io.vertx.core.net.SocketAddress} using UTF8 encoding.
   * The {@link Handler} will be notified once the write completes.
   *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/datagram/DatagramSocket.java`
#### Snippet
```java
   * @param port  the host port of the remote peer
   * @param host  the host address of the remote peer
   * @param handler  the {@link io.vertx.core.Handler} to notify once the write completes.
   * @return a reference to this, so the API can be used fluently
   */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.streams` is unnecessary and can be removed
in `src/main/java/io/vertx/core/streams/impl/PumpImpl.java`
#### Snippet
```java

/**
 * Pumps data from a {@link io.vertx.core.streams.ReadStream} to a {@link io.vertx.core.streams.WriteStream} and performs flow control where necessary to
 * prevent the write stream buffer from getting overfull.<p>
 * Instances of this class read bytes from a {@link io.vertx.core.streams.ReadStream} and write them to a {@link io.vertx.core.streams.WriteStream}. If data
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.streams` is unnecessary and can be removed
in `src/main/java/io/vertx/core/streams/impl/PumpImpl.java`
#### Snippet
```java

/**
 * Pumps data from a {@link io.vertx.core.streams.ReadStream} to a {@link io.vertx.core.streams.WriteStream} and performs flow control where necessary to
 * prevent the write stream buffer from getting overfull.<p>
 * Instances of this class read bytes from a {@link io.vertx.core.streams.ReadStream} and write them to a {@link io.vertx.core.streams.WriteStream}. If data
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.streams` is unnecessary and can be removed
in `src/main/java/io/vertx/core/streams/impl/PumpImpl.java`
#### Snippet
```java
 * Pumps data from a {@link io.vertx.core.streams.ReadStream} to a {@link io.vertx.core.streams.WriteStream} and performs flow control where necessary to
 * prevent the write stream buffer from getting overfull.<p>
 * Instances of this class read bytes from a {@link io.vertx.core.streams.ReadStream} and write them to a {@link io.vertx.core.streams.WriteStream}. If data
 * can be read faster than it can be written this could result in the write queue of the {@link io.vertx.core.streams.WriteStream} growing
 * without bound, eventually causing it to exhaust all available RAM.<p>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.streams` is unnecessary and can be removed
in `src/main/java/io/vertx/core/streams/impl/PumpImpl.java`
#### Snippet
```java
 * Pumps data from a {@link io.vertx.core.streams.ReadStream} to a {@link io.vertx.core.streams.WriteStream} and performs flow control where necessary to
 * prevent the write stream buffer from getting overfull.<p>
 * Instances of this class read bytes from a {@link io.vertx.core.streams.ReadStream} and write them to a {@link io.vertx.core.streams.WriteStream}. If data
 * can be read faster than it can be written this could result in the write queue of the {@link io.vertx.core.streams.WriteStream} growing
 * without bound, eventually causing it to exhaust all available RAM.<p>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.streams` is unnecessary and can be removed
in `src/main/java/io/vertx/core/streams/impl/PumpImpl.java`
#### Snippet
```java
 * prevent the write stream buffer from getting overfull.<p>
 * Instances of this class read bytes from a {@link io.vertx.core.streams.ReadStream} and write them to a {@link io.vertx.core.streams.WriteStream}. If data
 * can be read faster than it can be written this could result in the write queue of the {@link io.vertx.core.streams.WriteStream} growing
 * without bound, eventually causing it to exhaust all available RAM.<p>
 * To prevent this, after each write, instances of this class check whether the write queue of the {@link
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.streams` is unnecessary and can be removed
in `src/main/java/io/vertx/core/streams/impl/PumpImpl.java`
#### Snippet
```java
 * without bound, eventually causing it to exhaust all available RAM.<p>
 * To prevent this, after each write, instances of this class check whether the write queue of the {@link
 * io.vertx.core.streams.WriteStream} is full, and if so, the {@link io.vertx.core.streams.ReadStream} is paused, and a {@code drainHandler} is set on the
 * {@link io.vertx.core.streams.WriteStream}. When the {@link io.vertx.core.streams.WriteStream} has processed half of its backlog, the {@code drainHandler} will be
 * called, which results in the pump resuming the {@link io.vertx.core.streams.ReadStream}.<p>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.streams` is unnecessary and can be removed
in `src/main/java/io/vertx/core/streams/impl/PumpImpl.java`
#### Snippet
```java
 * without bound, eventually causing it to exhaust all available RAM.<p>
 * To prevent this, after each write, instances of this class check whether the write queue of the {@link
 * io.vertx.core.streams.WriteStream} is full, and if so, the {@link io.vertx.core.streams.ReadStream} is paused, and a {@code drainHandler} is set on the
 * {@link io.vertx.core.streams.WriteStream}. When the {@link io.vertx.core.streams.WriteStream} has processed half of its backlog, the {@code drainHandler} will be
 * called, which results in the pump resuming the {@link io.vertx.core.streams.ReadStream}.<p>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.streams` is unnecessary and can be removed
in `src/main/java/io/vertx/core/streams/impl/PumpImpl.java`
#### Snippet
```java
 * To prevent this, after each write, instances of this class check whether the write queue of the {@link
 * io.vertx.core.streams.WriteStream} is full, and if so, the {@link io.vertx.core.streams.ReadStream} is paused, and a {@code drainHandler} is set on the
 * {@link io.vertx.core.streams.WriteStream}. When the {@link io.vertx.core.streams.WriteStream} has processed half of its backlog, the {@code drainHandler} will be
 * called, which results in the pump resuming the {@link io.vertx.core.streams.ReadStream}.<p>
 * This class can be used to pump from any {@link io.vertx.core.streams.ReadStream} to any {@link io.vertx.core.streams.WriteStream},
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.streams` is unnecessary and can be removed
in `src/main/java/io/vertx/core/streams/impl/PumpImpl.java`
#### Snippet
```java
 * To prevent this, after each write, instances of this class check whether the write queue of the {@link
 * io.vertx.core.streams.WriteStream} is full, and if so, the {@link io.vertx.core.streams.ReadStream} is paused, and a {@code drainHandler} is set on the
 * {@link io.vertx.core.streams.WriteStream}. When the {@link io.vertx.core.streams.WriteStream} has processed half of its backlog, the {@code drainHandler} will be
 * called, which results in the pump resuming the {@link io.vertx.core.streams.ReadStream}.<p>
 * This class can be used to pump from any {@link io.vertx.core.streams.ReadStream} to any {@link io.vertx.core.streams.WriteStream},
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.streams` is unnecessary and can be removed
in `src/main/java/io/vertx/core/streams/impl/PumpImpl.java`
#### Snippet
```java
 * io.vertx.core.streams.WriteStream} is full, and if so, the {@link io.vertx.core.streams.ReadStream} is paused, and a {@code drainHandler} is set on the
 * {@link io.vertx.core.streams.WriteStream}. When the {@link io.vertx.core.streams.WriteStream} has processed half of its backlog, the {@code drainHandler} will be
 * called, which results in the pump resuming the {@link io.vertx.core.streams.ReadStream}.<p>
 * This class can be used to pump from any {@link io.vertx.core.streams.ReadStream} to any {@link io.vertx.core.streams.WriteStream},
 * e.g. from an {@link io.vertx.core.http.HttpServerRequest} to an {@link io.vertx.core.file.AsyncFile},
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.streams` is unnecessary and can be removed
in `src/main/java/io/vertx/core/streams/impl/PumpImpl.java`
#### Snippet
```java
 * {@link io.vertx.core.streams.WriteStream}. When the {@link io.vertx.core.streams.WriteStream} has processed half of its backlog, the {@code drainHandler} will be
 * called, which results in the pump resuming the {@link io.vertx.core.streams.ReadStream}.<p>
 * This class can be used to pump from any {@link io.vertx.core.streams.ReadStream} to any {@link io.vertx.core.streams.WriteStream},
 * e.g. from an {@link io.vertx.core.http.HttpServerRequest} to an {@link io.vertx.core.file.AsyncFile},
 * or from {@link io.vertx.core.net.NetSocket} to a {@link io.vertx.core.http.WebSocket}.<p>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.streams` is unnecessary and can be removed
in `src/main/java/io/vertx/core/streams/impl/PumpImpl.java`
#### Snippet
```java
 * {@link io.vertx.core.streams.WriteStream}. When the {@link io.vertx.core.streams.WriteStream} has processed half of its backlog, the {@code drainHandler} will be
 * called, which results in the pump resuming the {@link io.vertx.core.streams.ReadStream}.<p>
 * This class can be used to pump from any {@link io.vertx.core.streams.ReadStream} to any {@link io.vertx.core.streams.WriteStream},
 * e.g. from an {@link io.vertx.core.http.HttpServerRequest} to an {@link io.vertx.core.file.AsyncFile},
 * or from {@link io.vertx.core.net.NetSocket} to a {@link io.vertx.core.http.WebSocket}.<p>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.buffer` is unnecessary and can be removed
in `src/main/java/io/vertx/core/eventbus/MessageCodec.java`
#### Snippet
```java
 * Usually the event bus only allows a certain set of message types to be sent across the event bus, including primitive types,
 * boxed primitive types, {@code byte[]}, {@link io.vertx.core.json.JsonObject}, {@link io.vertx.core.json.JsonArray},
 * {@link io.vertx.core.buffer.Buffer}.
 * <p>
 * By specifying a message codec you can pass any other type across the event bus, e.g. POJOs.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/eventbus/MessageConsumer.java`
#### Snippet
```java
 * The {@link EventBus#consumer(String)} or {@link EventBus#localConsumer(String)}
 * creates a new consumer, the returned consumer is not yet registered against the event bus. Registration
 * is effective after the {@link #handler(io.vertx.core.Handler)} method is invoked.<p>
 *
 * The consumer is unregistered from the event bus using the {@link #unregister()} method or by calling the
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/java/io/vertx/core/eventbus/MessageConsumer.java`
#### Snippet
```java
 *
 * The consumer is unregistered from the event bus using the {@link #unregister()} method or by calling the
 * {@link #handler(io.vertx.core.Handler)} with a null value..
 *
 * @author <a href="mailto:nscavell@redhat.com">Nick Scavelli</a>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.eventbus` is unnecessary and can be removed
in `src/main/java/io/vertx/core/eventbus/DeliveryOptions.java`
#### Snippet
```java
   * Add a message header.
   * <p>
   * Message headers can be sent with any message and will be accessible with {@link io.vertx.core.eventbus.Message#headers}
   * at the recipient.
   *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java
   * @param key the key to return the value for
   * @return the value or null if no value for that key
   * @throws java.lang.ClassCastException if the value is not a Double
   */
  public Double getDouble(String key) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java
   * @param key the key to return the value for
   * @return the value or null if no value for that key
   * @throws java.lang.ClassCastException if the value is not an Integer
   */
  public Integer getInteger(String key) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java
   * @param key the string to return the value for
   * @return the value or null if no value for that key
   * @throws java.lang.ClassCastException       if the value is not a string
   * @throws java.lang.IllegalArgumentException if the value is not a legal Base64 encoded string
   */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java
   * @return the value or null if no value for that key
   * @throws java.lang.ClassCastException       if the value is not a string
   * @throws java.lang.IllegalArgumentException if the value is not a legal Base64 encoded string
   */
  public Buffer getBuffer(String key) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java
   * @param key the key to return the value for
   * @return the value or null if no value for that key
   * @throws java.lang.ClassCastException       if the value is not a String
   * @throws java.lang.IllegalArgumentException if the String value is not a legal Base64 encoded value
   */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java
   * @return the value or null if no value for that key
   * @throws java.lang.ClassCastException       if the value is not a String
   * @throws java.lang.IllegalArgumentException if the String value is not a legal Base64 encoded value
   */
  public byte[] getBinary(String key) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java
   * @param key the key to return the value for
   * @return the value or null if no value for that key
   * @throws java.lang.ClassCastException if the value is not a JsonArray
   */
  public JsonArray getJsonArray(String key) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java
   * @param key the key to return the value for
   * @return the value or null if no value for that key
   * @throws java.lang.ClassCastException if the value is not a Number
   */
  public Number getNumber(String key) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java
   * @param key the key to return the value for
   * @return the value or null if no value for that key
   * @throws java.lang.ClassCastException if the value is not a Long
   */
  public Long getLong(String key) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java
   * @param key the key to return the value for
   * @return the value or null if no value for that key
   * @throws java.lang.ClassCastException if the value is not a JsonObject
   */
  public JsonObject getJsonObject(String key) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java
   * @param key the key to return the value for
   * @return the value or null if no value for that key
   * @throws java.lang.ClassCastException            if the value is not a String
   * @throws java.time.format.DateTimeParseException if the String value is not a legal ISO 8601 encoded value
   */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java
   * @param key the key to return the value for
   * @return the value or null if no value for that key
   * @throws java.lang.ClassCastException if the value is not a Float
   */
  public Float getFloat(String key) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java
   * @param key the key to return the value for
   * @return the value or null if no value for that key
   * @throws java.lang.ClassCastException if the value is not a Boolean
   */
  public Boolean getBoolean(String key) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.shareddata` is unnecessary and can be removed
in `src/main/java/io/vertx/core/shareddata/Shareable.java`
#### Snippet
```java

/**
 * An interface which allows you to put arbitrary objects into a {@link io.vertx.core.shareddata.LocalMap}.
 * <p>
 * Normally local maps only allow immutable or copiable objects in order to avoid shared access to mutable state.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.shareddata` is unnecessary and can be removed
in `src/main/java/io/vertx/core/shareddata/Shareable.java`
#### Snippet
```java
 * <p>
 * However if you have an object that you know is thread-safe you can mark it with this interface and then you
 * will be able to add it to {@link io.vertx.core.shareddata.LocalMap} instances.
 * <p>
 * Mutable object that you want to store in a {@link io.vertx.core.shareddata.LocalMap}
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.shareddata` is unnecessary and can be removed
in `src/main/java/io/vertx/core/shareddata/Shareable.java`
#### Snippet
```java
 * will be able to add it to {@link io.vertx.core.shareddata.LocalMap} instances.
 * <p>
 * Mutable object that you want to store in a {@link io.vertx.core.shareddata.LocalMap}
 * should override {@link Shareable#copy()} method.
 * <p>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/io/vertx/core/shareddata/LocalMap.java`
#### Snippet
```java
   * Unlike the default {@link Map} implementation, the set is <strong>not</strong> backed by the map. So changes
   * made to the map are not reflected in the set. Entries added or remove to the set are not reflected to the map.
   * In addition, the entries are not modifiable ({@link java.util.Map.Entry#setValue(Object)} is not supported).
   *
   * @return a set view of the mappings contained in this map
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.buffer` is unnecessary and can be removed
in `src/main/java/io/vertx/core/parsetools/RecordParser.java`
#### Snippet
```java
 * size records.
 * <p>
 * Instances of this class take as input {@link io.vertx.core.buffer.Buffer} instances containing raw bytes,
 * and output records.
 * <p>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/DeploymentOptionsConverter.java`
#### Snippet
```java

/**
 * Converter and mapper for {@link io.vertx.core.DeploymentOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.DeploymentOptions} original class using Vert.x codegen.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/DeploymentOptionsConverter.java`
#### Snippet
```java
/**
 * Converter and mapper for {@link io.vertx.core.DeploymentOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.DeploymentOptions} original class using Vert.x codegen.
 */
public class DeploymentOptionsConverter {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/DeploymentOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(DeploymentOptions obj, java.util.Map<String, Object> json) {
    if (obj.getConfig() != null) {
      json.put("config", obj.getConfig());
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/DeploymentOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, DeploymentOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/DeploymentOptionsConverter.java`
#### Snippet
```java

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, DeploymentOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "config":
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.concurrent` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/DeploymentOptionsConverter.java`
#### Snippet
```java
        case "maxWorkerExecuteTimeUnit":
          if (member.getValue() instanceof String) {
            obj.setMaxWorkerExecuteTimeUnit(java.util.concurrent.TimeUnit.valueOf((String)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/cli/ArgumentConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, Argument obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/cli/ArgumentConverter.java`
#### Snippet
```java

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, Argument obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "argName":
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/OpenSSLEngineOptionsConverter.java`
#### Snippet
```java

/**
 * Converter and mapper for {@link io.vertx.core.net.OpenSSLEngineOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.OpenSSLEngineOptions} original class using Vert.x codegen.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/OpenSSLEngineOptionsConverter.java`
#### Snippet
```java
/**
 * Converter and mapper for {@link io.vertx.core.net.OpenSSLEngineOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.OpenSSLEngineOptions} original class using Vert.x codegen.
 */
public class OpenSSLEngineOptionsConverter {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/OpenSSLEngineOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(OpenSSLEngineOptions obj, java.util.Map<String, Object> json) {
    json.put("sessionCacheEnabled", obj.isSessionCacheEnabled());
  }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/OpenSSLEngineOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, OpenSSLEngineOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/OpenSSLEngineOptionsConverter.java`
#### Snippet
```java

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, OpenSSLEngineOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "sessionCacheEnabled":
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/NetServerOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, NetServerOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/NetServerOptionsConverter.java`
#### Snippet
```java

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, NetServerOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "acceptBacklog":
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.http` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/NetServerOptionsConverter.java`
#### Snippet
```java
        case "clientAuth":
          if (member.getValue() instanceof String) {
            obj.setClientAuth(io.vertx.core.http.ClientAuth.valueOf((String)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.concurrent` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/NetServerOptionsConverter.java`
#### Snippet
```java
        case "proxyProtocolTimeoutUnit":
          if (member.getValue() instanceof String) {
            obj.setProxyProtocolTimeoutUnit(java.util.concurrent.TimeUnit.valueOf((String)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/NetServerOptionsConverter.java`
#### Snippet
```java

/**
 * Converter and mapper for {@link io.vertx.core.net.NetServerOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.NetServerOptions} original class using Vert.x codegen.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/NetServerOptionsConverter.java`
#### Snippet
```java
/**
 * Converter and mapper for {@link io.vertx.core.net.NetServerOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.NetServerOptions} original class using Vert.x codegen.
 */
public class NetServerOptionsConverter {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/NetServerOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(NetServerOptions obj, java.util.Map<String, Object> json) {
    json.put("acceptBacklog", obj.getAcceptBacklog());
    if (obj.getClientAuth() != null) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/ProxyOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, ProxyOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/ProxyOptionsConverter.java`
#### Snippet
```java

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, ProxyOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "host":
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/ProxyOptionsConverter.java`
#### Snippet
```java
        case "type":
          if (member.getValue() instanceof String) {
            obj.setType(io.vertx.core.net.ProxyType.valueOf((String)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/ProxyOptionsConverter.java`
#### Snippet
```java

/**
 * Converter and mapper for {@link io.vertx.core.net.ProxyOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.ProxyOptions} original class using Vert.x codegen.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/ProxyOptionsConverter.java`
#### Snippet
```java
/**
 * Converter and mapper for {@link io.vertx.core.net.ProxyOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.ProxyOptions} original class using Vert.x codegen.
 */
public class ProxyOptionsConverter {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/ProxyOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(ProxyOptions obj, java.util.Map<String, Object> json) {
    if (obj.getHost() != null) {
      json.put("host", obj.getHost());
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/ClientOptionsBaseConverter.java`
#### Snippet
```java
  }

   static void toJson(ClientOptionsBase obj, java.util.Map<String, Object> json) {
    json.put("connectTimeout", obj.getConnectTimeout());
    if (obj.getLocalAddress() != null) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/ClientOptionsBaseConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, ClientOptionsBase obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/ClientOptionsBaseConverter.java`
#### Snippet
```java

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, ClientOptionsBase obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "connectTimeout":
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/ClientOptionsBaseConverter.java`
#### Snippet
```java
        case "nonProxyHosts":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.String> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/ClientOptionsBaseConverter.java`
#### Snippet
```java
        case "nonProxyHosts":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.String> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/ClientOptionsBaseConverter.java`
#### Snippet
```java
        case "nonProxyHosts":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.String> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/ClientOptionsBaseConverter.java`
#### Snippet
```java
        case "proxyOptions":
          if (member.getValue() instanceof JsonObject) {
            obj.setProxyOptions(new io.vertx.core.net.ProxyOptions((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.json` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/ClientOptionsBaseConverter.java`
#### Snippet
```java
        case "proxyOptions":
          if (member.getValue() instanceof JsonObject) {
            obj.setProxyOptions(new io.vertx.core.net.ProxyOptions((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/ClientOptionsBaseConverter.java`
#### Snippet
```java

/**
 * Converter and mapper for {@link io.vertx.core.net.ClientOptionsBase}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.ClientOptionsBase} original class using Vert.x codegen.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/ClientOptionsBaseConverter.java`
#### Snippet
```java
/**
 * Converter and mapper for {@link io.vertx.core.net.ClientOptionsBase}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.ClientOptionsBase} original class using Vert.x codegen.
 */
public class ClientOptionsBaseConverter {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/NetClientOptionsConverter.java`
#### Snippet
```java

/**
 * Converter and mapper for {@link io.vertx.core.net.NetClientOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.NetClientOptions} original class using Vert.x codegen.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/NetClientOptionsConverter.java`
#### Snippet
```java
/**
 * Converter and mapper for {@link io.vertx.core.net.NetClientOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.NetClientOptions} original class using Vert.x codegen.
 */
public class NetClientOptionsConverter {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/NetClientOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, NetClientOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/NetClientOptionsConverter.java`
#### Snippet
```java

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, NetClientOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "applicationLayerProtocols":
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/NetClientOptionsConverter.java`
#### Snippet
```java
        case "applicationLayerProtocols":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.String> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/NetClientOptionsConverter.java`
#### Snippet
```java
        case "applicationLayerProtocols":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.String> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/NetClientOptionsConverter.java`
#### Snippet
```java
        case "applicationLayerProtocols":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.String> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/NetClientOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(NetClientOptions obj, java.util.Map<String, Object> json) {
    if (obj.getApplicationLayerProtocols() != null) {
      JsonArray array = new JsonArray();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/PemTrustOptionsConverter.java`
#### Snippet
```java

/**
 * Converter and mapper for {@link io.vertx.core.net.PemTrustOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.PemTrustOptions} original class using Vert.x codegen.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/PemTrustOptionsConverter.java`
#### Snippet
```java
/**
 * Converter and mapper for {@link io.vertx.core.net.PemTrustOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.PemTrustOptions} original class using Vert.x codegen.
 */
public class PemTrustOptionsConverter {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/PemTrustOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(PemTrustOptions obj, java.util.Map<String, Object> json) {
    if (obj.getCertPaths() != null) {
      JsonArray array = new JsonArray();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/PemTrustOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, PemTrustOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/PemTrustOptionsConverter.java`
#### Snippet
```java

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, PemTrustOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "certPaths":
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.buffer` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/PemTrustOptionsConverter.java`
#### Snippet
```java
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                obj.addCertValue(io.vertx.core.buffer.Buffer.buffer(BASE64_DECODER.decode((String)item)));
            });
          }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/file/CopyOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(CopyOptions obj, java.util.Map<String, Object> json) {
    json.put("atomicMove", obj.isAtomicMove());
    json.put("copyAttributes", obj.isCopyAttributes());
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/file/CopyOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, CopyOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/file/CopyOptionsConverter.java`
#### Snippet
```java

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, CopyOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "atomicMove":
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.file` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/file/CopyOptionsConverter.java`
#### Snippet
```java

/**
 * Converter and mapper for {@link io.vertx.core.file.CopyOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.file.CopyOptions} original class using Vert.x codegen.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.file` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/file/CopyOptionsConverter.java`
#### Snippet
```java
/**
 * Converter and mapper for {@link io.vertx.core.file.CopyOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.file.CopyOptions} original class using Vert.x codegen.
 */
public class CopyOptionsConverter {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/JksOptionsConverter.java`
#### Snippet
```java

/**
 * Converter and mapper for {@link io.vertx.core.net.JksOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.JksOptions} original class using Vert.x codegen.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/JksOptionsConverter.java`
#### Snippet
```java
/**
 * Converter and mapper for {@link io.vertx.core.net.JksOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.JksOptions} original class using Vert.x codegen.
 */
public class JksOptionsConverter {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/JksOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, JksOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/JksOptionsConverter.java`
#### Snippet
```java

  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, JksOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "alias":
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.buffer` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/JksOptionsConverter.java`
#### Snippet
```java
        case "value":
          if (member.getValue() instanceof String) {
            obj.setValue(io.vertx.core.buffer.Buffer.buffer(BASE64_DECODER.decode((String)member.getValue())));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/JksOptionsConverter.java`
#### Snippet
```java
  }

  public static void toJson(JksOptions obj, java.util.Map<String, Object> json) {
    if (obj.getAlias() != null) {
      json.put("alias", obj.getAlias());
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.cli` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/cli/ArgumentConverter.java`
#### Snippet
```java

/**
 * Converter and mapper for {@link io.vertx.core.cli.Argument}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.cli.Argument} original class using Vert.x codegen.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.cli` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/cli/ArgumentConverter.java`
#### Snippet
```java
/**
 * Converter and mapper for {@link io.vertx.core.cli.Argument}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.cli.Argument} original class using Vert.x codegen.
 */
public class ArgumentConverter {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/cli/ArgumentConverter.java`
#### Snippet
```java
  }

   static void toJson(Argument obj, java.util.Map<String, Object> json) {
    if (obj.getArgName() != null) {
      json.put("argName", obj.getArgName());
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/KeyStoreOptionsConverter.java`
#### Snippet
```java
  }

  public static void toJson(KeyStoreOptions obj, java.util.Map<String, Object> json) {
    if (obj.getAlias() != null) {
      json.put("alias", obj.getAlias());
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/KeyStoreOptionsConverter.java`
#### Snippet
```java

/**
 * Converter and mapper for {@link io.vertx.core.net.KeyStoreOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.KeyStoreOptions} original class using Vert.x codegen.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/KeyStoreOptionsConverter.java`
#### Snippet
```java
/**
 * Converter and mapper for {@link io.vertx.core.net.KeyStoreOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.KeyStoreOptions} original class using Vert.x codegen.
 */
public class KeyStoreOptionsConverter {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/KeyStoreOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, KeyStoreOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/KeyStoreOptionsConverter.java`
#### Snippet
```java

  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, KeyStoreOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "alias":
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.buffer` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/KeyStoreOptionsConverter.java`
#### Snippet
```java
        case "value":
          if (member.getValue() instanceof String) {
            obj.setValue(io.vertx.core.buffer.Buffer.buffer(BASE64_DECODER.decode((String)member.getValue())));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/PfxOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(PfxOptions obj, java.util.Map<String, Object> json) {
    if (obj.getAlias() != null) {
      json.put("alias", obj.getAlias());
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/PfxOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, PfxOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/PfxOptionsConverter.java`
#### Snippet
```java

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, PfxOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "alias":
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.buffer` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/PfxOptionsConverter.java`
#### Snippet
```java
        case "value":
          if (member.getValue() instanceof String) {
            obj.setValue(io.vertx.core.buffer.Buffer.buffer(BASE64_DECODER.decode((String)member.getValue())));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/PfxOptionsConverter.java`
#### Snippet
```java

/**
 * Converter and mapper for {@link io.vertx.core.net.PfxOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.PfxOptions} original class using Vert.x codegen.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/PfxOptionsConverter.java`
#### Snippet
```java
/**
 * Converter and mapper for {@link io.vertx.core.net.PfxOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.PfxOptions} original class using Vert.x codegen.
 */
public class PfxOptionsConverter {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.cli` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/cli/OptionConverter.java`
#### Snippet
```java

/**
 * Converter and mapper for {@link io.vertx.core.cli.Option}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.cli.Option} original class using Vert.x codegen.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.cli` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/cli/OptionConverter.java`
#### Snippet
```java
/**
 * Converter and mapper for {@link io.vertx.core.cli.Option}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.cli.Option} original class using Vert.x codegen.
 */
public class OptionConverter {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/cli/OptionConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, Option obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/cli/OptionConverter.java`
#### Snippet
```java

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, Option obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "argName":
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/cli/OptionConverter.java`
#### Snippet
```java
        case "choices":
          if (member.getValue() instanceof JsonArray) {
            java.util.LinkedHashSet<java.lang.String> list =  new java.util.LinkedHashSet<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/cli/OptionConverter.java`
#### Snippet
```java
        case "choices":
          if (member.getValue() instanceof JsonArray) {
            java.util.LinkedHashSet<java.lang.String> list =  new java.util.LinkedHashSet<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/cli/OptionConverter.java`
#### Snippet
```java
        case "choices":
          if (member.getValue() instanceof JsonArray) {
            java.util.LinkedHashSet<java.lang.String> list =  new java.util.LinkedHashSet<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/cli/OptionConverter.java`
#### Snippet
```java
  }

   static void toJson(Option obj, java.util.Map<String, Object> json) {
    if (obj.getArgName() != null) {
      json.put("argName", obj.getArgName());
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.dns` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/dns/AddressResolverOptionsConverter.java`
#### Snippet
```java

/**
 * Converter and mapper for {@link io.vertx.core.dns.AddressResolverOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.dns.AddressResolverOptions} original class using Vert.x codegen.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.dns` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/dns/AddressResolverOptionsConverter.java`
#### Snippet
```java
/**
 * Converter and mapper for {@link io.vertx.core.dns.AddressResolverOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.dns.AddressResolverOptions} original class using Vert.x codegen.
 */
public class AddressResolverOptionsConverter {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/dns/AddressResolverOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(AddressResolverOptions obj, java.util.Map<String, Object> json) {
    json.put("cacheMaxTimeToLive", obj.getCacheMaxTimeToLive());
    json.put("cacheMinTimeToLive", obj.getCacheMinTimeToLive());
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/dns/AddressResolverOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, AddressResolverOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/dns/AddressResolverOptionsConverter.java`
#### Snippet
```java

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, AddressResolverOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "cacheMaxTimeToLive":
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/VertxOptionsConverter.java`
#### Snippet
```java

/**
 * Converter and mapper for {@link io.vertx.core.VertxOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.VertxOptions} original class using Vert.x codegen.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/VertxOptionsConverter.java`
#### Snippet
```java
/**
 * Converter and mapper for {@link io.vertx.core.VertxOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.VertxOptions} original class using Vert.x codegen.
 */
public class VertxOptionsConverter {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.buffer` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/dns/AddressResolverOptionsConverter.java`
#### Snippet
```java
        case "hostsValue":
          if (member.getValue() instanceof String) {
            obj.setHostsValue(io.vertx.core.buffer.Buffer.buffer(BASE64_DECODER.decode((String)member.getValue())));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/dns/AddressResolverOptionsConverter.java`
#### Snippet
```java
        case "searchDomains":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.String> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/VertxOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(VertxOptions obj, java.util.Map<String, Object> json) {
    if (obj.getAddressResolverOptions() != null) {
      json.put("addressResolverOptions", obj.getAddressResolverOptions().toJson());
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/dns/AddressResolverOptionsConverter.java`
#### Snippet
```java
        case "searchDomains":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.String> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/dns/AddressResolverOptionsConverter.java`
#### Snippet
```java
        case "searchDomains":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.String> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/dns/AddressResolverOptionsConverter.java`
#### Snippet
```java
        case "servers":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.String> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/dns/AddressResolverOptionsConverter.java`
#### Snippet
```java
        case "servers":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.String> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/dns/AddressResolverOptionsConverter.java`
#### Snippet
```java
        case "servers":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.String> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/VertxOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, VertxOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/VertxOptionsConverter.java`
#### Snippet
```java

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, VertxOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "addressResolverOptions":
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.dns` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/VertxOptionsConverter.java`
#### Snippet
```java
        case "addressResolverOptions":
          if (member.getValue() instanceof JsonObject) {
            obj.setAddressResolverOptions(new io.vertx.core.dns.AddressResolverOptions((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.json` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/VertxOptionsConverter.java`
#### Snippet
```java
        case "addressResolverOptions":
          if (member.getValue() instanceof JsonObject) {
            obj.setAddressResolverOptions(new io.vertx.core.dns.AddressResolverOptions((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.concurrent` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/VertxOptionsConverter.java`
#### Snippet
```java
        case "blockedThreadCheckIntervalUnit":
          if (member.getValue() instanceof String) {
            obj.setBlockedThreadCheckIntervalUnit(java.util.concurrent.TimeUnit.valueOf((String)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.eventbus` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/VertxOptionsConverter.java`
#### Snippet
```java
        case "eventBusOptions":
          if (member.getValue() instanceof JsonObject) {
            obj.setEventBusOptions(new io.vertx.core.eventbus.EventBusOptions((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.json` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/VertxOptionsConverter.java`
#### Snippet
```java
        case "eventBusOptions":
          if (member.getValue() instanceof JsonObject) {
            obj.setEventBusOptions(new io.vertx.core.eventbus.EventBusOptions((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.file` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/VertxOptionsConverter.java`
#### Snippet
```java
        case "fileSystemOptions":
          if (member.getValue() instanceof JsonObject) {
            obj.setFileSystemOptions(new io.vertx.core.file.FileSystemOptions((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.json` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/VertxOptionsConverter.java`
#### Snippet
```java
        case "fileSystemOptions":
          if (member.getValue() instanceof JsonObject) {
            obj.setFileSystemOptions(new io.vertx.core.file.FileSystemOptions((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.concurrent` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/VertxOptionsConverter.java`
#### Snippet
```java
        case "maxEventLoopExecuteTimeUnit":
          if (member.getValue() instanceof String) {
            obj.setMaxEventLoopExecuteTimeUnit(java.util.concurrent.TimeUnit.valueOf((String)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.concurrent` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/VertxOptionsConverter.java`
#### Snippet
```java
        case "maxWorkerExecuteTimeUnit":
          if (member.getValue() instanceof String) {
            obj.setMaxWorkerExecuteTimeUnit(java.util.concurrent.TimeUnit.valueOf((String)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.metrics` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/VertxOptionsConverter.java`
#### Snippet
```java
        case "metricsOptions":
          if (member.getValue() instanceof JsonObject) {
            obj.setMetricsOptions(new io.vertx.core.metrics.MetricsOptions((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.json` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/VertxOptionsConverter.java`
#### Snippet
```java
        case "metricsOptions":
          if (member.getValue() instanceof JsonObject) {
            obj.setMetricsOptions(new io.vertx.core.metrics.MetricsOptions((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.tracing` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/VertxOptionsConverter.java`
#### Snippet
```java
        case "tracingOptions":
          if (member.getValue() instanceof JsonObject) {
            obj.setTracingOptions(new io.vertx.core.tracing.TracingOptions((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.json` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/VertxOptionsConverter.java`
#### Snippet
```java
        case "tracingOptions":
          if (member.getValue() instanceof JsonObject) {
            obj.setTracingOptions(new io.vertx.core.tracing.TracingOptions((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.concurrent` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/VertxOptionsConverter.java`
#### Snippet
```java
        case "warningExceptionTimeUnit":
          if (member.getValue() instanceof String) {
            obj.setWarningExceptionTimeUnit(java.util.concurrent.TimeUnit.valueOf((String)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/file/FileSystemOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(FileSystemOptions obj, java.util.Map<String, Object> json) {
    json.put("classPathResolvingEnabled", obj.isClassPathResolvingEnabled());
    if (obj.getFileCacheDir() != null) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/file/FileSystemOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, FileSystemOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/file/FileSystemOptionsConverter.java`
#### Snippet
```java

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, FileSystemOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "classPathResolvingEnabled":
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.file` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/file/FileSystemOptionsConverter.java`
#### Snippet
```java

/**
 * Converter and mapper for {@link io.vertx.core.file.FileSystemOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.file.FileSystemOptions} original class using Vert.x codegen.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.file` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/file/FileSystemOptionsConverter.java`
#### Snippet
```java
/**
 * Converter and mapper for {@link io.vertx.core.file.FileSystemOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.file.FileSystemOptions} original class using Vert.x codegen.
 */
public class FileSystemOptionsConverter {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/file/OpenOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(OpenOptions obj, java.util.Map<String, Object> json) {
    json.put("append", obj.isAppend());
    json.put("create", obj.isCreate());
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/file/OpenOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, OpenOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/file/OpenOptionsConverter.java`
#### Snippet
```java

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, OpenOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "append":
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.file` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/file/OpenOptionsConverter.java`
#### Snippet
```java

/**
 * Converter and mapper for {@link io.vertx.core.file.OpenOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.file.OpenOptions} original class using Vert.x codegen.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.file` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/file/OpenOptionsConverter.java`
#### Snippet
```java
/**
 * Converter and mapper for {@link io.vertx.core.file.OpenOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.file.OpenOptions} original class using Vert.x codegen.
 */
public class OpenOptionsConverter {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java

/**
 * Converter and mapper for {@link io.vertx.core.net.PemKeyCertOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.PemKeyCertOptions} original class using Vert.x codegen.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java
/**
 * Converter and mapper for {@link io.vertx.core.net.PemKeyCertOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.PemKeyCertOptions} original class using Vert.x codegen.
 */
public class PemKeyCertOptionsConverter {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(PemKeyCertOptions obj, java.util.Map<String, Object> json) {
    if (obj.getCertPaths() != null) {
      JsonArray array = new JsonArray();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, PemKeyCertOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, PemKeyCertOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "certPath":
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java
        case "certPaths":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.String> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java
        case "certPaths":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.String> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java
        case "certPaths":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.String> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.buffer` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java
        case "certValue":
          if (member.getValue() instanceof String) {
            obj.setCertValue(io.vertx.core.buffer.Buffer.buffer(BASE64_DECODER.decode((String)member.getValue())));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java
        case "certValues":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<io.vertx.core.buffer.Buffer> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.buffer` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java
        case "certValues":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<io.vertx.core.buffer.Buffer> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java
        case "certValues":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<io.vertx.core.buffer.Buffer> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.buffer` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                list.add(io.vertx.core.buffer.Buffer.buffer(BASE64_DECODER.decode((String)item)));
            });
            obj.setCertValues(list);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java
        case "keyPaths":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.String> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java
        case "keyPaths":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.String> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java
        case "keyPaths":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.String> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.buffer` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java
        case "keyValue":
          if (member.getValue() instanceof String) {
            obj.setKeyValue(io.vertx.core.buffer.Buffer.buffer(BASE64_DECODER.decode((String)member.getValue())));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java
        case "keyValues":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<io.vertx.core.buffer.Buffer> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.buffer` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java
        case "keyValues":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<io.vertx.core.buffer.Buffer> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java
        case "keyValues":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<io.vertx.core.buffer.Buffer> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.buffer` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/PemKeyCertOptionsConverter.java`
#### Snippet
```java
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                list.add(io.vertx.core.buffer.Buffer.buffer(BASE64_DECODER.decode((String)item)));
            });
            obj.setKeyValues(list);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/http/WebSocketConnectOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, WebSocketConnectOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/http/WebSocketConnectOptionsConverter.java`
#### Snippet
```java

  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, WebSocketConnectOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "allowOriginHeader":
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/http/WebSocketConnectOptionsConverter.java`
#### Snippet
```java
        case "subProtocols":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.String> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/http/WebSocketConnectOptionsConverter.java`
#### Snippet
```java
        case "subProtocols":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.String> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/http/WebSocketConnectOptionsConverter.java`
#### Snippet
```java
        case "subProtocols":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.String> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.http` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/http/WebSocketConnectOptionsConverter.java`
#### Snippet
```java
        case "version":
          if (member.getValue() instanceof String) {
            obj.setVersion(io.vertx.core.http.WebsocketVersion.valueOf((String)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.http` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/http/WebSocketConnectOptionsConverter.java`
#### Snippet
```java

/**
 * Converter and mapper for {@link io.vertx.core.http.WebSocketConnectOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.http.WebSocketConnectOptions} original class using Vert.x codegen.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.http` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/http/WebSocketConnectOptionsConverter.java`
#### Snippet
```java
/**
 * Converter and mapper for {@link io.vertx.core.http.WebSocketConnectOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.http.WebSocketConnectOptions} original class using Vert.x codegen.
 */
public class WebSocketConnectOptionsConverter {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/http/WebSocketConnectOptionsConverter.java`
#### Snippet
```java
  }

  public static void toJson(WebSocketConnectOptions obj, java.util.Map<String, Object> json) {
    json.put("allowOriginHeader", obj.getAllowOriginHeader());
    if (obj.getSubProtocols() != null) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.metrics` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/metrics/MetricsOptionsConverter.java`
#### Snippet
```java

/**
 * Converter and mapper for {@link io.vertx.core.metrics.MetricsOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.metrics.MetricsOptions} original class using Vert.x codegen.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.metrics` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/metrics/MetricsOptionsConverter.java`
#### Snippet
```java
/**
 * Converter and mapper for {@link io.vertx.core.metrics.MetricsOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.metrics.MetricsOptions} original class using Vert.x codegen.
 */
public class MetricsOptionsConverter {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/http/Http2SettingsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, Http2Settings obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/metrics/MetricsOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(MetricsOptions obj, java.util.Map<String, Object> json) {
    json.put("enabled", obj.isEnabled());
  }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/http/Http2SettingsConverter.java`
#### Snippet
```java

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, Http2Settings obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "headerTableSize":
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/metrics/MetricsOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, MetricsOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.http` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/http/Http2SettingsConverter.java`
#### Snippet
```java

/**
 * Converter and mapper for {@link io.vertx.core.http.Http2Settings}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.http.Http2Settings} original class using Vert.x codegen.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.http` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/http/Http2SettingsConverter.java`
#### Snippet
```java
/**
 * Converter and mapper for {@link io.vertx.core.http.Http2Settings}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.http.Http2Settings} original class using Vert.x codegen.
 */
public class Http2SettingsConverter {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/http/Http2SettingsConverter.java`
#### Snippet
```java
  }

   static void toJson(Http2Settings obj, java.util.Map<String, Object> json) {
    json.put("headerTableSize", obj.getHeaderTableSize());
    json.put("initialWindowSize", obj.getInitialWindowSize());
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/metrics/MetricsOptionsConverter.java`
#### Snippet
```java

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, MetricsOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "enabled":
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java

/**
 * Converter and mapper for {@link io.vertx.core.net.TCPSSLOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.TCPSSLOptions} original class using Vert.x codegen.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
/**
 * Converter and mapper for {@link io.vertx.core.net.TCPSSLOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.net.TCPSSLOptions} original class using Vert.x codegen.
 */
public class TCPSSLOptionsConverter {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(TCPSSLOptions obj, java.util.Map<String, Object> json) {
    if (obj.getCrlPaths() != null) {
      JsonArray array = new JsonArray();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, TCPSSLOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, TCPSSLOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "crlPaths":
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.buffer` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                obj.addCrlValue(io.vertx.core.buffer.Buffer.buffer(BASE64_DECODER.decode((String)item)));
            });
          }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
        case "enabledSecureTransportProtocols":
          if (member.getValue() instanceof JsonArray) {
            java.util.LinkedHashSet<java.lang.String> list =  new java.util.LinkedHashSet<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
        case "enabledSecureTransportProtocols":
          if (member.getValue() instanceof JsonArray) {
            java.util.LinkedHashSet<java.lang.String> list =  new java.util.LinkedHashSet<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
        case "enabledSecureTransportProtocols":
          if (member.getValue() instanceof JsonArray) {
            java.util.LinkedHashSet<java.lang.String> list =  new java.util.LinkedHashSet<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.concurrent` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
        case "idleTimeoutUnit":
          if (member.getValue() instanceof String) {
            obj.setIdleTimeoutUnit(java.util.concurrent.TimeUnit.valueOf((String)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
        case "jdkSslEngineOptions":
          if (member.getValue() instanceof JsonObject) {
            obj.setJdkSslEngineOptions(new io.vertx.core.net.JdkSSLEngineOptions((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.json` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
        case "jdkSslEngineOptions":
          if (member.getValue() instanceof JsonObject) {
            obj.setJdkSslEngineOptions(new io.vertx.core.net.JdkSSLEngineOptions((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
        case "keyStoreOptions":
          if (member.getValue() instanceof JsonObject) {
            obj.setKeyStoreOptions(new io.vertx.core.net.JksOptions((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.json` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
        case "keyStoreOptions":
          if (member.getValue() instanceof JsonObject) {
            obj.setKeyStoreOptions(new io.vertx.core.net.JksOptions((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
        case "openSslEngineOptions":
          if (member.getValue() instanceof JsonObject) {
            obj.setOpenSslEngineOptions(new io.vertx.core.net.OpenSSLEngineOptions((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.json` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
        case "openSslEngineOptions":
          if (member.getValue() instanceof JsonObject) {
            obj.setOpenSslEngineOptions(new io.vertx.core.net.OpenSSLEngineOptions((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
        case "pemKeyCertOptions":
          if (member.getValue() instanceof JsonObject) {
            obj.setPemKeyCertOptions(new io.vertx.core.net.PemKeyCertOptions((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.json` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
        case "pemKeyCertOptions":
          if (member.getValue() instanceof JsonObject) {
            obj.setPemKeyCertOptions(new io.vertx.core.net.PemKeyCertOptions((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
        case "pemTrustOptions":
          if (member.getValue() instanceof JsonObject) {
            obj.setPemTrustOptions(new io.vertx.core.net.PemTrustOptions((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.json` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
        case "pemTrustOptions":
          if (member.getValue() instanceof JsonObject) {
            obj.setPemTrustOptions(new io.vertx.core.net.PemTrustOptions((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.tracing` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/tracing/TracingOptionsConverter.java`
#### Snippet
```java

/**
 * Converter and mapper for {@link io.vertx.core.tracing.TracingOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.tracing.TracingOptions} original class using Vert.x codegen.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.tracing` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/tracing/TracingOptionsConverter.java`
#### Snippet
```java
/**
 * Converter and mapper for {@link io.vertx.core.tracing.TracingOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.tracing.TracingOptions} original class using Vert.x codegen.
 */
public class TracingOptionsConverter {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/tracing/TracingOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(TracingOptions obj, java.util.Map<String, Object> json) {
  }
}
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
        case "pfxKeyCertOptions":
          if (member.getValue() instanceof JsonObject) {
            obj.setPfxKeyCertOptions(new io.vertx.core.net.PfxOptions((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/tracing/TracingOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, TracingOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.json` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
        case "pfxKeyCertOptions":
          if (member.getValue() instanceof JsonObject) {
            obj.setPfxKeyCertOptions(new io.vertx.core.net.PfxOptions((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/tracing/TracingOptionsConverter.java`
#### Snippet
```java

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, TracingOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
      }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
        case "pfxTrustOptions":
          if (member.getValue() instanceof JsonObject) {
            obj.setPfxTrustOptions(new io.vertx.core.net.PfxOptions((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.json` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
        case "pfxTrustOptions":
          if (member.getValue() instanceof JsonObject) {
            obj.setPfxTrustOptions(new io.vertx.core.net.PfxOptions((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.concurrent` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
        case "sslHandshakeTimeoutUnit":
          if (member.getValue() instanceof String) {
            obj.setSslHandshakeTimeoutUnit(java.util.concurrent.TimeUnit.valueOf((String)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
        case "trustStoreOptions":
          if (member.getValue() instanceof JsonObject) {
            obj.setTrustStoreOptions(new io.vertx.core.net.JksOptions((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.json` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/net/TCPSSLOptionsConverter.java`
#### Snippet
```java
        case "trustStoreOptions":
          if (member.getValue() instanceof JsonObject) {
            obj.setTrustStoreOptions(new io.vertx.core.net.JksOptions((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.http` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/http/RequestOptionsConverter.java`
#### Snippet
```java

/**
 * Converter and mapper for {@link io.vertx.core.http.RequestOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.http.RequestOptions} original class using Vert.x codegen.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.http` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/http/RequestOptionsConverter.java`
#### Snippet
```java
/**
 * Converter and mapper for {@link io.vertx.core.http.RequestOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.http.RequestOptions} original class using Vert.x codegen.
 */
public class RequestOptionsConverter {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/http/RequestOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, RequestOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/http/RequestOptionsConverter.java`
#### Snippet
```java

  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, RequestOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "absoluteURI":
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.net` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/http/RequestOptionsConverter.java`
#### Snippet
```java
        case "proxyOptions":
          if (member.getValue() instanceof JsonObject) {
            obj.setProxyOptions(new io.vertx.core.net.ProxyOptions((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.json` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/http/RequestOptionsConverter.java`
#### Snippet
```java
        case "proxyOptions":
          if (member.getValue() instanceof JsonObject) {
            obj.setProxyOptions(new io.vertx.core.net.ProxyOptions((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/http/RequestOptionsConverter.java`
#### Snippet
```java
  }

  public static void toJson(RequestOptions obj, java.util.Map<String, Object> json) {
    if (obj.getFollowRedirects() != null) {
      json.put("followRedirects", obj.getFollowRedirects());
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.http` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/http/GoAwayConverter.java`
#### Snippet
```java

/**
 * Converter and mapper for {@link io.vertx.core.http.GoAway}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.http.GoAway} original class using Vert.x codegen.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.http` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/http/GoAwayConverter.java`
#### Snippet
```java
/**
 * Converter and mapper for {@link io.vertx.core.http.GoAway}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.http.GoAway} original class using Vert.x codegen.
 */
public class GoAwayConverter {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/http/GoAwayConverter.java`
#### Snippet
```java
  }

   static void toJson(GoAway obj, java.util.Map<String, Object> json) {
    if (obj.getDebugData() != null) {
      json.put("debugData", BASE64_ENCODER.encodeToString(obj.getDebugData().getBytes()));
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/http/GoAwayConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, GoAway obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/http/GoAwayConverter.java`
#### Snippet
```java

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, GoAway obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "debugData":
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.buffer` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/http/GoAwayConverter.java`
#### Snippet
```java
        case "debugData":
          if (member.getValue() instanceof String) {
            obj.setDebugData(io.vertx.core.buffer.Buffer.buffer(BASE64_DECODER.decode((String)member.getValue())));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.datagram` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/datagram/DatagramSocketOptionsConverter.java`
#### Snippet
```java

/**
 * Converter and mapper for {@link io.vertx.core.datagram.DatagramSocketOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.datagram.DatagramSocketOptions} original class using Vert.x codegen.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.datagram` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/datagram/DatagramSocketOptionsConverter.java`
#### Snippet
```java
/**
 * Converter and mapper for {@link io.vertx.core.datagram.DatagramSocketOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.datagram.DatagramSocketOptions} original class using Vert.x codegen.
 */
public class DatagramSocketOptionsConverter {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/datagram/DatagramSocketOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, DatagramSocketOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/datagram/DatagramSocketOptionsConverter.java`
#### Snippet
```java

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, DatagramSocketOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "broadcast":
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/datagram/DatagramSocketOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(DatagramSocketOptions obj, java.util.Map<String, Object> json) {
    json.put("broadcast", obj.isBroadcast());
    json.put("ipV6", obj.isIpV6());
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.http` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/http/HttpServerOptionsConverter.java`
#### Snippet
```java

/**
 * Converter and mapper for {@link io.vertx.core.http.HttpServerOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.http.HttpServerOptions} original class using Vert.x codegen.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.http` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/http/HttpServerOptionsConverter.java`
#### Snippet
```java
/**
 * Converter and mapper for {@link io.vertx.core.http.HttpServerOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.http.HttpServerOptions} original class using Vert.x codegen.
 */
public class HttpServerOptionsConverter {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/http/HttpServerOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(HttpServerOptions obj, java.util.Map<String, Object> json) {
    json.put("acceptUnmaskedFrames", obj.isAcceptUnmaskedFrames());
    if (obj.getAlpnVersions() != null) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/http/HttpServerOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, HttpServerOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/http/HttpServerOptionsConverter.java`
#### Snippet
```java

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, HttpServerOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "acceptUnmaskedFrames":
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/http/HttpServerOptionsConverter.java`
#### Snippet
```java
        case "alpnVersions":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<io.vertx.core.http.HttpVersion> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.http` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/http/HttpServerOptionsConverter.java`
#### Snippet
```java
        case "alpnVersions":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<io.vertx.core.http.HttpVersion> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/http/HttpServerOptionsConverter.java`
#### Snippet
```java
        case "alpnVersions":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<io.vertx.core.http.HttpVersion> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.http` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/http/HttpServerOptionsConverter.java`
#### Snippet
```java
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                list.add(io.vertx.core.http.HttpVersion.valueOf((String)item));
            });
            obj.setAlpnVersions(list);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.http` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/http/HttpServerOptionsConverter.java`
#### Snippet
```java
        case "initialSettings":
          if (member.getValue() instanceof JsonObject) {
            obj.setInitialSettings(new io.vertx.core.http.Http2Settings((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.json` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/http/HttpServerOptionsConverter.java`
#### Snippet
```java
        case "initialSettings":
          if (member.getValue() instanceof JsonObject) {
            obj.setInitialSettings(new io.vertx.core.http.Http2Settings((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.tracing` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/http/HttpServerOptionsConverter.java`
#### Snippet
```java
        case "tracingPolicy":
          if (member.getValue() instanceof String) {
            obj.setTracingPolicy(io.vertx.core.tracing.TracingPolicy.valueOf((String)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/http/HttpServerOptionsConverter.java`
#### Snippet
```java
        case "webSocketSubProtocols":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.String> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/http/HttpServerOptionsConverter.java`
#### Snippet
```java
        case "webSocketSubProtocols":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.String> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/http/HttpServerOptionsConverter.java`
#### Snippet
```java
        case "webSocketSubProtocols":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<java.lang.String> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/http/HttpClientOptionsConverter.java`
#### Snippet
```java
  }

   static void toJson(HttpClientOptions obj, java.util.Map<String, Object> json) {
    if (obj.getAlpnVersions() != null) {
      JsonArray array = new JsonArray();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.http` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/http/HttpClientOptionsConverter.java`
#### Snippet
```java

/**
 * Converter and mapper for {@link io.vertx.core.http.HttpClientOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.http.HttpClientOptions} original class using Vert.x codegen.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.http` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/http/HttpClientOptionsConverter.java`
#### Snippet
```java
/**
 * Converter and mapper for {@link io.vertx.core.http.HttpClientOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.core.http.HttpClientOptions} original class using Vert.x codegen.
 */
public class HttpClientOptionsConverter {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/http/HttpClientOptionsConverter.java`
#### Snippet
```java
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, HttpClientOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/http/HttpClientOptionsConverter.java`
#### Snippet
```java

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, HttpClientOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "alpnVersions":
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/http/HttpClientOptionsConverter.java`
#### Snippet
```java
        case "alpnVersions":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<io.vertx.core.http.HttpVersion> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.http` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/http/HttpClientOptionsConverter.java`
#### Snippet
```java
        case "alpnVersions":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<io.vertx.core.http.HttpVersion> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/http/HttpClientOptionsConverter.java`
#### Snippet
```java
        case "alpnVersions":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<io.vertx.core.http.HttpVersion> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.http` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/http/HttpClientOptionsConverter.java`
#### Snippet
```java
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                list.add(io.vertx.core.http.HttpVersion.valueOf((String)item));
            });
            obj.setAlpnVersions(list);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.http` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/http/HttpClientOptionsConverter.java`
#### Snippet
```java
        case "initialSettings":
          if (member.getValue() instanceof JsonObject) {
            obj.setInitialSettings(new io.vertx.core.http.Http2Settings((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.json` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/http/HttpClientOptionsConverter.java`
#### Snippet
```java
        case "initialSettings":
          if (member.getValue() instanceof JsonObject) {
            obj.setInitialSettings(new io.vertx.core.http.Http2Settings((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.http` is unnecessary and can be removed
in `src/main/generated/io/vertx/core/http/HttpClientOptionsConverter.java`
#### Snippet
```java
        case "protocolVersion":
          if (member.getValue() instanceof String) {
            obj.setProtocolVersion(io.vertx.core.http.HttpVersion.valueOf((String)member.getValue()));
          }
          break;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.vertx.core.tracing` is unnecessary, and can be replaced with an import
in `src/main/generated/io/vertx/core/http/HttpClientOptionsConverter.java`
#### Snippet
```java
        case "tracingPolicy":
          if (member.getValue() instanceof String) {
            obj.setTracingPolicy(io.vertx.core.tracing.TracingPolicy.valueOf((String)member.getValue()));
          }
          break;
```

## RuleId[ruleID=ThrowablePrintStackTrace]
### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/io/vertx/core/json/pointer/impl/JsonPointerImpl.java`
#### Snippet
```java
      } else return new URI(null, null, fragment);
    } catch (URISyntaxException e) {
      e.printStackTrace();
      return null;
    }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/io/vertx/core/logging/VertxLoggerFormatter.java`
#### Snippet
```java
        sb.append(sw.toString());
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/examples/CompletionStageInteropExamples.java`
#### Snippet
```java
      if (err != null) {
        System.err.println("Could not resolve vertx.io");
        err.printStackTrace();
      } else {
        System.out.println("vertx.io => " + ip);
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/examples/CompletionStageInteropExamples.java`
#### Snippet
```java
      .onFailure(err -> {
        System.err.println("We have a problem");
        err.printStackTrace();
      });
  }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
        // Connected
      } else {
        ar.cause().printStackTrace();
      }
    });
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/examples/CoreExamples.java`
#### Snippet
```java
        // Bound to socket
      } else {
        ar.cause().printStackTrace();
      }
    });
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `TCPSSLOptions()` of an abstract class should not be declared 'public'
in `src/main/java/io/vertx/core/net/TCPSSLOptions.java`
#### Snippet
```java
   * @param json the JSON
   */
  public TCPSSLOptions(JsonObject json) {
    super(json);
    init();
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `TCPSSLOptions()` of an abstract class should not be declared 'public'
in `src/main/java/io/vertx/core/net/TCPSSLOptions.java`
#### Snippet
```java
   * Default constructor
   */
  public TCPSSLOptions() {
    super();
    init();
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `TCPSSLOptions()` of an abstract class should not be declared 'public'
in `src/main/java/io/vertx/core/net/TCPSSLOptions.java`
#### Snippet
```java
   * @param other  the options to copy
   */
  public TCPSSLOptions(TCPSSLOptions other) {
    super(other);
    this.tcpNoDelay = other.isTcpNoDelay();
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `ClientOptionsBase()` of an abstract class should not be declared 'public'
in `src/main/java/io/vertx/core/net/ClientOptionsBase.java`
#### Snippet
```java
   * @param other  the options to copy
   */
  public ClientOptionsBase(ClientOptionsBase other) {
    super(other);
    this.connectTimeout = other.getConnectTimeout();
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `ClientOptionsBase()` of an abstract class should not be declared 'public'
in `src/main/java/io/vertx/core/net/ClientOptionsBase.java`
#### Snippet
```java
   * Default constructor
   */
  public ClientOptionsBase() {
    super();
    init();
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `ClientOptionsBase()` of an abstract class should not be declared 'public'
in `src/main/java/io/vertx/core/net/ClientOptionsBase.java`
#### Snippet
```java
   * @param json  the JSON
   */
  public ClientOptionsBase(JsonObject json) {
    super(json);
    init();
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `Endpoint()` of an abstract class should not be declared 'public'
in `src/main/java/io/vertx/core/net/impl/pool/Endpoint.java`
#### Snippet
```java
  private long refCount;

  public Endpoint(Runnable dispose) {
    this.dispose = dispose;
  }
```

## RuleId[ruleID=Java8MapApi]
### RuleId[ruleID=Java8MapApi]
Can be replaced with single 'Map.computeIfAbsent' method call
in `src/main/java/io/vertx/core/cli/impl/DefaultCommandLine.java`
#### Snippet
```java
  public DefaultCommandLine setRawValue(Argument arg, String rawValue) {
    List<String> list = argumentValues.get(arg);
    if (list == null) {
      list = new ArrayList<>();
      argumentValues.put(arg, list);
```

### RuleId[ruleID=Java8MapApi]
Can be replaced with single 'Map.computeIfAbsent' method call
in `src/main/java/io/vertx/core/cli/impl/DefaultCommandLine.java`
#### Snippet
```java
    }
    List<String> list = optionValues.get(option);
    if (list == null) {
      list = new ArrayList<>();
      optionValues.put(option, list);
```

### RuleId[ruleID=Java8MapApi]
Can be replaced with single 'Map.computeIfAbsent' method call
in `src/main/java/io/vertx/core/impl/VerticleManager.java`
#### Snippet
```java
    }
    List<VerticleFactory> facts = verticleFactories.get(prefix);
    if (facts == null) {
      facts = new ArrayList<>();
      verticleFactories.put(prefix, facts);
```

## RuleId[ruleID=Convert2Lambda]
### RuleId[ruleID=Convert2Lambda]
Anonymous new FilenameFilter() can be replaced with lambda
in `src/main/java/io/vertx/core/file/impl/FileSystemImpl.java`
#### Snippet
```java
            FilenameFilter fnFilter;
            if (filter != null) {
              fnFilter = new FilenameFilter() {
                public boolean accept(File dir, String name) {
                  return Pattern.matches(filter, name);
```

## RuleId[ruleID=AssignmentToMethodParameter]
### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `type`
in `src/main/java/io/vertx/core/cli/converters/Converters.java`
#### Snippet
```java
  public static <T> T create(Class<T> type, String value) {
    if (type.isPrimitive()) {
      type = wrap(type);
    }
    return getConverter(type).fromString(value);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `src/main/java/io/vertx/core/cli/impl/DefaultCommandLine.java`
#### Snippet
```java
    Objects.requireNonNull(option);
    if (value == null) {
      value = option.getDefaultValue();
    }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `src/main/java/io/vertx/core/cli/impl/DefaultCommandLine.java`
#### Snippet
```java
    Objects.requireNonNull(argument);
    if (value == null) {
      value = argument.getDefaultValue();
    }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `str`
in `src/main/java/io/vertx/core/cli/impl/DefaultParser.java`
#### Snippet
```java
    int length = str.length();
    if (length > 1 && str.startsWith("\"") && str.endsWith("\"") && str.substring(1, length - 1).indexOf('"') == -1) {
      str = str.substring(1, length - 1);
    }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `opt`
in `src/main/java/io/vertx/core/cli/impl/DefaultParser.java`
#### Snippet
```java
  public List<Option> getMatchingOptions(String opt) {
    Objects.requireNonNull(opt);
    opt = stripLeadingHyphens(opt);

    List<Option> matching = new ArrayList<>();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `opt`
in `src/main/java/io/vertx/core/cli/impl/DefaultParser.java`
#### Snippet
```java
   */
  public Option getOption(String opt) {
    opt = stripLeadingHyphens(opt);
    for (Option option : cli.getOptions()) {
      if (opt.equals(option.getShortName()) || opt.equalsIgnoreCase(option.getLongName())) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `nextLineTabStop`
in `src/main/java/io/vertx/core/cli/UsageMessageFormatter.java`
#### Snippet
```java
    if (nextLineTabStop >= width) {
      // stops infinite loop happening
      nextLineTabStop = 1;
    }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `text`
in `src/main/java/io/vertx/core/cli/UsageMessageFormatter.java`
#### Snippet
```java

    while (true) {
      text = padding + text.substring(pos).trim();
      pos = findWrapPos(text, width, 0);

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `fileCacheDir`
in `src/main/java/io/vertx/core/file/impl/FileCache.java`
#### Snippet
```java
    // ensure that the argument doesn't end with separator
    if (fileCacheDir.endsWith(File.separator)) {
      fileCacheDir = fileCacheDir.substring(0, fileCacheDir.length() - File.separator.length());
    }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `listenHandler`
in `src/main/java/io/vertx/core/http/impl/HttpServerImpl.java`
#### Snippet
```java
  public HttpServer listen(SocketAddress address, Handler<AsyncResult<HttpServer>> listenHandler) {
    if (listenHandler == null) {
      listenHandler = res -> {
        if (res.failed()) {
          // No handler - log so user can see failure
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `handler`
in `src/main/java/io/vertx/core/http/impl/ClientHttpEndpointBase.java`
#### Snippet
```java
      }
      Handler<AsyncResult<C>> next = handler;
      handler = ar -> {
        if (metrics != null) {
          metrics.dequeueRequest(metric);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `verticleName`
in `src/main/java/io/vertx/core/impl/JavaVerticleFactory.java`
#### Snippet
```java
  @Override
  public void createVerticle(String verticleName, ClassLoader classLoader, Promise<Callable<Verticle>> promise) {
    verticleName = VerticleFactory.removePrefix(verticleName);
    Class<Verticle> clazz;
    try {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `map`
in `src/main/java/io/vertx/core/impl/ConversionHelper.java`
#### Snippet
```java
      return null;
    }
    map = new LinkedHashMap<>(map);
    map.entrySet().forEach(e -> e.setValue(toJsonElement(e.getValue())));
    return new JsonObject(map);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `list`
in `src/main/java/io/vertx/core/impl/ConversionHelper.java`
#### Snippet
```java
      return null;
    }
    list = new ArrayList<>(list);
    for (int i = 0; i < list.size(); i++) {
      list.set(i, toJsonElement(list.get(i)));
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `proxyOptions`
in `src/main/java/io/vertx/core/http/impl/HttpClientImpl.java`
#### Snippet
```java
  private ProxyOptions getProxyOptions(ProxyOptions proxyOptions) {
    if (proxyOptions == null) {
      proxyOptions = options.getProxyOptions();
    }
    return proxyOptions;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `proxyOptions`
in `src/main/java/io/vertx/core/http/impl/HttpClientImpl.java`
#### Snippet
```java

  private ProxyOptions resolveProxyOptions(ProxyOptions proxyOptions, SocketAddress addr) {
    proxyOptions = getProxyOptions(proxyOptions);
    if (proxyFilter != null) {
      if (!proxyFilter.test(addr)) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `proxyOptions`
in `src/main/java/io/vertx/core/http/impl/HttpClientImpl.java`
#### Snippet
```java
    if (proxyFilter != null) {
      if (!proxyFilter.test(addr)) {
        proxyOptions = null;
      }
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `handler`
in `src/main/java/io/vertx/core/http/impl/HttpClientImpl.java`
#### Snippet
```java
  public HttpClient redirectHandler(Function<HttpClientResponse, Future<RequestOptions>> handler) {
    if (handler == null) {
      handler = DEFAULT_HANDLER;
    }
    redirectHandler = handler;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `cause`
in `src/main/java/io/vertx/core/impl/future/FutureImpl.java`
#### Snippet
```java
  public boolean tryFail(Throwable cause) {
    if (cause == null) {
      cause = new NoStackTraceThrowable(null);
    }
    Listener<T> l;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `verticle`
in `src/main/java/io/vertx/core/impl/launcher/commands/ClasspathHandler.java`
#### Snippet
```java
        if (verticle.indexOf(':') == -1) {
          // and the verticle is not using a explicit factory
          verticle = executionContext.get("Default-Verticle-Factory") + ":" + verticle;
        }
      }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `val`
in `src/main/java/io/vertx/core/json/impl/JsonUtil.java`
#### Snippet
```java
    // perform wrapping
    if (val instanceof Map) {
      val = new JsonObject((Map) val);
    } else if (val instanceof List) {
      val = new JsonArray((List) val);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `val`
in `src/main/java/io/vertx/core/json/impl/JsonUtil.java`
#### Snippet
```java
      val = new JsonObject((Map) val);
    } else if (val instanceof List) {
      val = new JsonArray((List) val);
    } else if (val instanceof Instant) {
      val = ISO_INSTANT.format((Instant) val);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `val`
in `src/main/java/io/vertx/core/json/impl/JsonUtil.java`
#### Snippet
```java
      val = new JsonArray((List) val);
    } else if (val instanceof Instant) {
      val = ISO_INSTANT.format((Instant) val);
    } else if (val instanceof byte[]) {
      val = BASE64_ENCODER.encodeToString((byte[]) val);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `val`
in `src/main/java/io/vertx/core/json/impl/JsonUtil.java`
#### Snippet
```java
      val = ISO_INSTANT.format((Instant) val);
    } else if (val instanceof byte[]) {
      val = BASE64_ENCODER.encodeToString((byte[]) val);
    } else if (val instanceof Buffer) {
      val = BASE64_ENCODER.encodeToString(((Buffer) val).getBytes());
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `val`
in `src/main/java/io/vertx/core/json/impl/JsonUtil.java`
#### Snippet
```java
      val = BASE64_ENCODER.encodeToString((byte[]) val);
    } else if (val instanceof Buffer) {
      val = BASE64_ENCODER.encodeToString(((Buffer) val).getBytes());
    } else if (val instanceof Enum) {
      val = ((Enum) val).name();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `val`
in `src/main/java/io/vertx/core/json/impl/JsonUtil.java`
#### Snippet
```java
      val = BASE64_ENCODER.encodeToString(((Buffer) val).getBytes());
    } else if (val instanceof Enum) {
      val = ((Enum) val).name();
    }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `val`
in `src/main/java/io/vertx/core/json/impl/JsonUtil.java`
#### Snippet
```java
    } else if (val instanceof CharSequence) {
      // CharSequences are not immutable, so we force toString() to become immutable
      val = val.toString();
    } else if (val instanceof Shareable) {
      // Shareable objects know how to copy themselves, this covers:
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `val`
in `src/main/java/io/vertx/core/json/impl/JsonUtil.java`
#### Snippet
```java
      // Shareable objects know how to copy themselves, this covers:
      // JsonObject, JsonArray, Buffer or any user defined type that can shared across the cluster
      val = ((Shareable) val).copy();
    } else if (val instanceof Map) {
      val = (new JsonObject((Map) val)).copy(copier);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `val`
in `src/main/java/io/vertx/core/json/impl/JsonUtil.java`
#### Snippet
```java
      val = ((Shareable) val).copy();
    } else if (val instanceof Map) {
      val = (new JsonObject((Map) val)).copy(copier);
    } else if (val instanceof List) {
      val = (new JsonArray((List) val)).copy(copier);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `val`
in `src/main/java/io/vertx/core/json/impl/JsonUtil.java`
#### Snippet
```java
      val = (new JsonObject((Map) val)).copy(copier);
    } else if (val instanceof List) {
      val = (new JsonArray((List) val)).copy(copier);
    } else if (val instanceof byte[]) {
      // OK
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `val`
in `src/main/java/io/vertx/core/json/impl/JsonUtil.java`
#### Snippet
```java
      // OK
    } else {
      val = copier.apply(val);
    }
    return val;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `src/main/java/io/vertx/core/json/pointer/impl/JsonPointerImpl.java`
#### Snippet
```java
      return (iterator.isNull(value)) ? defaultValue : value;
    else {
      value = walkTillLastElement(value, iterator, false, null);
      String lastKey = decodedTokens.get(decodedTokens.size() - 1);
      if (iterator.isObject(value)) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `src/main/java/io/vertx/core/json/pointer/impl/JsonPointerImpl.java`
#### Snippet
```java
      } else if (iterator.isObject(value)) {
        if (onNewValue != null) onNewValue.accept(value);
        value = iterator.getObjectParameter(value, k, createOnMissing);
      } else if (iterator.isArray(value)) {
        if (onNewValue != null) onNewValue.accept(value);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `src/main/java/io/vertx/core/json/pointer/impl/JsonPointerImpl.java`
#### Snippet
```java
        if (onNewValue != null) onNewValue.accept(value);
        try {
          value = iterator.getArrayElement(value, Integer.parseInt(k));
          if (iterator.isNull(value) && createOnMissing) {
            value = iterator.getObjectParameter(value, k, true);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `src/main/java/io/vertx/core/json/pointer/impl/JsonPointerImpl.java`
#### Snippet
```java
          value = iterator.getArrayElement(value, Integer.parseInt(k));
          if (iterator.isNull(value) && createOnMissing) {
            value = iterator.getObjectParameter(value, k, true);
          }
        } catch (NumberFormatException e) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `src/main/java/io/vertx/core/json/pointer/impl/JsonPointerImpl.java`
#### Snippet
```java
          }
        } catch (NumberFormatException e) {
          value = null;
        }
      } else {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `pos`
in `src/main/java/io/vertx/core/eventbus/impl/codecs/JsonArrayMessageCodec.java`
#### Snippet
```java
  public JsonArray decodeFromWire(int pos, Buffer buffer) {
    int length = buffer.getInt(pos);
    pos += 4;
    return new JsonArray(buffer.slice(pos, pos + length));
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `pos`
in `src/main/java/io/vertx/core/eventbus/impl/codecs/ByteArrayMessageCodec.java`
#### Snippet
```java
  public byte[] decodeFromWire(int pos, Buffer buffer) {
    int length = buffer.getInt(pos);
    pos += 4;
    return buffer.getBytes(pos, pos + length);
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `pos`
in `src/main/java/io/vertx/core/eventbus/impl/codecs/BufferMessageCodec.java`
#### Snippet
```java
  public Buffer decodeFromWire(int pos, Buffer buffer) {
    int length = buffer.getInt(pos);
    pos += 4;
    return buffer.getBuffer(pos, pos + length);
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `pos`
in `src/main/java/io/vertx/core/eventbus/impl/codecs/SerializableCodec.java`
#### Snippet
```java
  public Object decodeFromWire(int pos, Buffer buffer) {
    int length = buffer.getInt(pos);
    pos += 4;
    byte[] bytes = buffer.getBytes(pos, pos + length);
    return fromBytes(bytes, CheckedClassNameObjectInputStream::new);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `codecName`
in `src/main/java/io/vertx/core/eventbus/impl/CodecManager.java`
#### Snippet
```java
      codec = defaultCodecMap.get(body.getClass());
      if (codec == null) {
        if ((codecName = codecSelector.apply(body)) != null) {
          codec = getCodec(codecName);
        } else if (body instanceof ClusterSerializable && (local || acceptClusterSerializable(body.getClass().getName()))) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `pos`
in `src/main/java/io/vertx/core/eventbus/impl/codecs/JsonObjectMessageCodec.java`
#### Snippet
```java
  public JsonObject decodeFromWire(int pos, Buffer buffer) {
    int length = buffer.getInt(pos);
    pos += 4;
    return new JsonObject(buffer.slice(pos, pos + length));
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `message`
in `src/main/java/io/vertx/core/eventbus/impl/MessageConsumerImpl.java`
#### Snippet
```java
        if (pending.size() > 0) {
          pending.add(message);
          message = pending.poll();
        }
        if (demand != Long.MAX_VALUE) {
```

## RuleId[ruleID=UnnecessaryContinue]
### RuleId[ruleID=UnnecessaryContinue]
`continue` is unnecessary as the last statement in a loop
in `src/main/java/io/vertx/core/json/pointer/impl/JsonPointerImpl.java`
#### Snippet
```java
      String k = decodedTokens.get(i);
      if (i == 0 && "".equals(k)) {
        continue; // Avoid errors with root empty string
      } else if (iterator.isObject(value)) {
        if (onNewValue != null) onNewValue.accept(value);
```

## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/AsyncResult.java`
#### Snippet
```java
          return mapper.apply(AsyncResult.this.result());
        } else {
          return null;
        }
      }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/AsyncResult.java`
#### Snippet
```java
   */
  default AsyncResult<T> otherwiseEmpty() {
    return otherwise(err -> null);
  }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/AsyncResult.java`
#### Snippet
```java
      @Override
      public Throwable cause() {
        return null;
      }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/AsyncResult.java`
#### Snippet
```java
          return mapper.apply(AsyncResult.this.cause());
        } else {
          return null;
        }
      }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/ServiceHelper.java`
#### Snippet
```java
      return collection.iterator().next();
    } else {
      return null;
    }
  }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/cli/impl/ReflectionUtils.java`
#### Snippet
```java
    }

    return null;
  }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/cli/converters/FromBasedConverter.java`
#### Snippet
```java
      } else {
        // The from method is present but it must be static.
        return null;
      }
    } catch (NoSuchMethodException e) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/cli/converters/FromBasedConverter.java`
#### Snippet
```java
    } catch (NoSuchMethodException e) {
      // The class does not have the right method, return null.
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/cli/converters/ConstructorBasedConverter.java`
#### Snippet
```java
    } catch (NoSuchMethodException e) {
      // The class does not have the right constructor, return null.
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/cli/converters/FromStringBasedConverter.java`
#### Snippet
```java
      } else {
        // The from method is present but it must be static.
        return null;
      }
    } catch (NoSuchMethodException e) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/cli/converters/FromStringBasedConverter.java`
#### Snippet
```java
    } catch (NoSuchMethodException e) {
      // The class does not have the right method, return null.
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/cli/converters/ValueOfBasedConverter.java`
#### Snippet
```java
      } else {
        // The valueOf method is present but it must be static.
        return null;
      }
    } catch (NoSuchMethodException e) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/cli/converters/ValueOfBasedConverter.java`
#### Snippet
```java
    } catch (NoSuchMethodException e) {
      // The class does not have the right method, return null.
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/cli/impl/DefaultCommandLine.java`
#### Snippet
```java
    Argument arg = cli.getArgument(index);
    if (arg == null) {
      return null;
    }
    if (arg instanceof TypedArgument) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/cli/impl/DefaultCommandLine.java`
#### Snippet
```java
    Argument argument = cli.getArgument(index);
    if (argument == null) {
      return null;
    }
    if (argument instanceof TypedArgument) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/cli/impl/DefaultCommandLine.java`
#### Snippet
```java

    if (value == null) {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/cli/impl/DefaultCommandLine.java`
#### Snippet
```java
    Option option = cli.getOption(name);
    if (option == null) {
      return null;
    }
    if (option instanceof TypedOption) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/cli/impl/DefaultCommandLine.java`
#### Snippet
```java

    if (value == null) {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/cli/impl/DefaultCommandLine.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/cli/impl/DefaultCommandLine.java`
#### Snippet
```java
    Argument arg = cli.getArgument(name);
    if (arg == null) {
      return null;
    }
    return getArgumentValue(arg.getIndex());
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/cli/impl/DefaultCommandLine.java`
#### Snippet
```java
    Option option = cli.getOption(name);
    if (option == null) {
      return null;
    }
    if (option instanceof TypedOption) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/cli/impl/DefaultCLI.java`
#### Snippet
```java
    }

    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/cli/impl/DefaultCLI.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/cli/impl/DefaultCLI.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/dns/DnsResponseCode.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/cli/impl/DefaultParser.java`
#### Snippet
```java
  static String stripLeadingHyphens(String str) {
    if (str == null) {
      return null;
    }
    if (str.startsWith("--")) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/cli/impl/DefaultParser.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/cli/annotations/CLIConfigurator.java`
#### Snippet
```java
    final io.vertx.core.cli.Option option = commandLine.cli().getOption(name);
    if (option == null) {
      return null;
    }
    boolean multiple = ReflectionUtils.isMultiple(method);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/cli/annotations/CLIConfigurator.java`
#### Snippet
```java
    }

    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/cli/annotations/CLIConfigurator.java`
#### Snippet
```java
    final io.vertx.core.cli.Argument argument = commandLine.cli().getArgument(index);
    if (argument == null) {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/KeyManagerFactoryOptions.java`
#### Snippet
```java
  @Override
  public Function<String, X509KeyManager> keyManagerMapper(Vertx vertx) {
    return keyManagerFactory.getKeyManagers()[0] instanceof X509KeyManager ? serverName -> (X509KeyManager) keyManagerFactory.getKeyManagers()[0] : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/TCPSSLOptions.java`
#### Snippet
```java
   */
  public PfxOptions getPfxTrustOptions() {
    return trustOptions instanceof PfxOptions ? (PfxOptions) trustOptions : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/TCPSSLOptions.java`
#### Snippet
```java
   */
  public PemKeyCertOptions getPemKeyCertOptions() {
    return keyCertOptions instanceof PemKeyCertOptions ? (PemKeyCertOptions) keyCertOptions : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/TCPSSLOptions.java`
#### Snippet
```java
   */
  public PfxOptions getPfxKeyCertOptions() {
    return keyCertOptions instanceof PfxOptions ? (PfxOptions) keyCertOptions : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/TCPSSLOptions.java`
#### Snippet
```java

  public OpenSSLEngineOptions getOpenSslEngineOptions() {
    return sslEngineOptions instanceof OpenSSLEngineOptions ? (OpenSSLEngineOptions) sslEngineOptions : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/TCPSSLOptions.java`
#### Snippet
```java
   */
  public PemTrustOptions getPemTrustOptions() {
    return trustOptions instanceof PemTrustOptions ? (PemTrustOptions) trustOptions : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/TCPSSLOptions.java`
#### Snippet
```java
   */
  public JksOptions getKeyStoreOptions() {
    return keyCertOptions instanceof JksOptions ? (JksOptions) keyCertOptions : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/TCPSSLOptions.java`
#### Snippet
```java

  public JdkSSLEngineOptions getJdkSslEngineOptions() {
    return sslEngineOptions instanceof JdkSSLEngineOptions ? (JdkSSLEngineOptions) sslEngineOptions : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/TCPSSLOptions.java`
#### Snippet
```java
   */
  public JksOptions getTrustStoreOptions() {
    return trustOptions instanceof JksOptions ? (JksOptions) trustOptions : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/KeyStoreOptionsBase.java`
#### Snippet
```java
  public TrustManagerFactory getTrustManagerFactory(Vertx vertx) throws Exception {
    KeyStoreHelper helper = getHelper(vertx);
    return helper != null ? helper.getTrustMgrFactory((VertxInternal) vertx) : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/KeyStoreOptionsBase.java`
#### Snippet
```java
  public Function<String, TrustManager[]> trustManagerMapper(Vertx vertx) throws Exception {
    KeyStoreHelper helper = getHelper(vertx);
    return helper != null ? helper::getTrustMgr : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/KeyStoreOptionsBase.java`
#### Snippet
```java
  public KeyStore loadKeyStore(Vertx vertx) throws Exception {
    KeyStoreHelper helper = getHelper(vertx);
    return helper != null ? helper.store() : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/KeyStoreOptionsBase.java`
#### Snippet
```java
  public Function<String, X509KeyManager> keyManagerMapper(Vertx vertx) throws Exception {
    KeyStoreHelper helper = getHelper(vertx);
    return helper != null ? helper::getKeyMgr : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/KeyStoreOptionsBase.java`
#### Snippet
```java
  public KeyManagerFactory getKeyManagerFactory(Vertx vertx) throws Exception {
    KeyStoreHelper helper = getHelper(vertx);
    return helper != null ? helper.getKeyMgrFactory() : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/KeyStoreOptionsBase.java`
#### Snippet
```java
      } else {
        // Keystore input can be "null", for example PKCS#11
        value = () -> null;
      }
      helper = new KeyStoreHelper(KeyStoreHelper.loadKeyStore(type, provider, password, value, getAlias()), password, getAliasPassword());
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/PemTrustOptions.java`
#### Snippet
```java
  public Function<String, TrustManager[]> trustManagerMapper(Vertx vertx) throws Exception {
    KeyStoreHelper helper = getHelper(vertx);
    return helper != null ? helper::getTrustMgr : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/PemTrustOptions.java`
#### Snippet
```java
  public TrustManagerFactory getTrustManagerFactory(Vertx vertx) throws Exception {
    KeyStoreHelper helper = getHelper(vertx);
    return helper != null ? helper.getTrustMgrFactory((VertxInternal) vertx) : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/PemTrustOptions.java`
#### Snippet
```java
  public KeyStore loadKeyStore(Vertx vertx) throws Exception {
    KeyStoreHelper helper = getHelper(vertx);
    return helper != null ? helper.store() : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/impl/VertxEventLoopGroup.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/PemKeyCertOptions.java`
#### Snippet
```java
  @GenIgnore
  public Buffer getKeyValue() {
    return keyValues.isEmpty() ? null : keyValues.get(0);
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/PemKeyCertOptions.java`
#### Snippet
```java
  public KeyManagerFactory getKeyManagerFactory(Vertx vertx) throws Exception {
    KeyStoreHelper helper = getHelper(vertx);
    return helper != null ? helper.getKeyMgrFactory() : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/PemKeyCertOptions.java`
#### Snippet
```java
  @GenIgnore
  public String getKeyPath() {
    return keyPaths.isEmpty() ? null : keyPaths.get(0);
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/PemKeyCertOptions.java`
#### Snippet
```java
  public Function<String, X509KeyManager> keyManagerMapper(Vertx vertx) throws Exception {
    KeyStoreHelper helper = getHelper(vertx);
    return helper != null ? helper::getKeyMgr : null;
  }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/PemKeyCertOptions.java`
#### Snippet
```java
  @GenIgnore
  public String getCertPath() {
    return certPaths.isEmpty() ? null : certPaths.get(0);
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/PemKeyCertOptions.java`
#### Snippet
```java
  public KeyStore loadKeyStore(Vertx vertx) throws Exception {
    KeyStoreHelper helper = getHelper(vertx);
    return helper != null ? helper.store() : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/PemKeyCertOptions.java`
#### Snippet
```java
  @GenIgnore
  public Buffer getCertValue() {
    return certValues.isEmpty() ? null : certValues.get(0);
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/impl/URIDecoder.java`
#### Snippet
```java
  public static String decodeURIComponent(String s, boolean plus) {
    if (s == null) {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/spi/cluster/ClusterManager.java`
#### Snippet
```java
   */
  default String clusterHost() {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/spi/cluster/ClusterManager.java`
#### Snippet
```java
   */
  default String clusterPublicHost() {
    return null;
  }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/spi/cluster/impl/selector/NullRoundRobinSelector.java`
#### Snippet
```java
  @Override
  public String selectForSend() {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/spi/logging/LogDelegate.java`
#### Snippet
```java
   */
  default Object unwrap() {
    return null;
  }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/spi/metrics/ClientMetrics.java`
#### Snippet
```java
   */
  default M requestBegin(String uri, Req request) {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/spi/metrics/ClientMetrics.java`
#### Snippet
```java
   */
  default T enqueueRequest() {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/spi/metrics/PoolMetrics.java`
#### Snippet
```java
   */
  default T begin(T t) {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/spi/metrics/PoolMetrics.java`
#### Snippet
```java
   */
  default T submitted() {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/spi/metrics/VertxMetrics.java`
#### Snippet
```java
   */
  default DatagramSocketMetrics createDatagramSocketMetrics(DatagramSocketOptions options) {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/spi/metrics/VertxMetrics.java`
#### Snippet
```java
   */
  default TCPMetrics<?> createNetServerMetrics(NetServerOptions options, SocketAddress localAddress) {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/spi/metrics/VertxMetrics.java`
#### Snippet
```java
   */
  default ClientMetrics<?, ?, ?, ?> createClientMetrics(SocketAddress remoteAddress, String type, String namespace) {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/spi/metrics/VertxMetrics.java`
#### Snippet
```java
   */
  default PoolMetrics<?> createPoolMetrics(String poolType, String poolName, int maxPoolSize) {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/spi/metrics/VertxMetrics.java`
#### Snippet
```java
   */
  default HttpClientMetrics<?, ?, ?, ?> createHttpClientMetrics(HttpClientOptions options) {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/spi/metrics/VertxMetrics.java`
#### Snippet
```java
   */
  default HttpServerMetrics<?, ?, ?> createHttpServerMetrics(HttpServerOptions options, SocketAddress localAddress) {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/spi/metrics/VertxMetrics.java`
#### Snippet
```java
   */
  default TCPMetrics<?> createNetClientMetrics(NetClientOptions options) {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/spi/metrics/VertxMetrics.java`
#### Snippet
```java
   */
  default EventBusMetrics createEventBusMetrics() {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/spi/metrics/EventBusMetrics.java`
#### Snippet
```java
   */
  default H handlerRegistered(String address, String repliedAddress) {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/spi/metrics/TCPMetrics.java`
#### Snippet
```java
   */
  default S connected(SocketAddress remoteAddress, String remoteName) {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/spi/metrics/HttpServerMetrics.java`
#### Snippet
```java
   */
  default W connected(S socketMetric, R requestMetric, ServerWebSocket serverWebSocket) {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/spi/metrics/HttpServerMetrics.java`
#### Snippet
```java
   */
  default R responsePushed(S socketMetric, HttpMethod method, String uri, HttpResponse response) {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/spi/metrics/HttpServerMetrics.java`
#### Snippet
```java
   */
  default R requestBegin(S socketMetric, HttpRequest request) {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/spi/metrics/HttpClientMetrics.java`
#### Snippet
```java
   */
  default ClientMetrics<R, T, HttpRequest, HttpResponse> createEndpointMetrics(SocketAddress remoteAddress, int maxPoolSize) {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/spi/metrics/HttpClientMetrics.java`
#### Snippet
```java
   */
  default W connected(WebSocket webSocket) {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/spi/tracing/VertxTracer.java`
#### Snippet
```java
                            BiConsumer<String, String> headers,
                            TagExtractor<R> tagExtractor) {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/spi/tracing/VertxTracer.java`
#### Snippet
```java
                               Iterable<Map.Entry<String, String>> headers,
                               TagExtractor<R> tagExtractor) {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/spi/cluster/impl/selector/SelectorEntry.java`
#### Snippet
```java
  SelectorEntry data(List<String> nodeIds) {
    if (nodeIds == null || nodeIds.isEmpty()) {
      return null;
    }
    Map<String, Weight> weights = computeWeights(nodeIds);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/file/impl/FileCache.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/file/impl/FileCache.java`
#### Snippet
```java
    } catch (IOException e) {
      // if we can't get the canonical form, return null
      return null;
    }
  }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/http/HttpClosedException.java`
#### Snippet
```java
   */
  public GoAway goAway() {
    return goAway != null ? new GoAway(goAway) : null;
  }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
    PoolWaiter<C> poll() {
      if (head.next == head) {
        return null;
      }
      PoolWaiter<C> node = head.next;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
      }
    }
    return null;
  };

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
            };
          } else {
            return null;
          }
        } else {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
          }
        } else {
          return null;
        }
      } else {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
        }
      } else {
        return null;
      }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
    public Task execute(SimpleConnectionPool<C> pool) {
      if (pool.closed || pool.slots[removed.index] != removed) {
        return null;
      }
      int w = removed.capacity;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
        pool.size--;
        pool.capacity -= w;
        return null;
      } else {
        pool.slots[0] = null;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
        pool.size--;
        pool.capacity -= w;
        return null;
      }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
            pool.waiters.addFirst(waiter);
          }
          return null;
        }
        LeaseImpl<C> lease;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
      }
    }
    return null;
  };

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
          };
        } else {
          return null;
        }
      } else {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/net/impl/pool/SimpleConnectionPool.java`
#### Snippet
```java
        }
      }
      return null;
    }
  }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/http/impl/HttpServerImpl.java`
#### Snippet
```java
      return vertxMetrics.createHttpServerMetrics(options, localAddress);
    } else {
      return null;
    }
  }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/http/impl/HttpNetSocket.java`
#### Snippet
```java
  @Override
  public String writeHandlerID() {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/http/impl/HttpNetSocket.java`
#### Snippet
```java
  @Override
  public String applicationLayerProtocol() {
    return null;
  }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/http/impl/MimeMapping.java`
#### Snippet
```java
      return MimeMapping.getMimeTypeForExtension(ext);
    }
    return null;
  }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/impl/LoaderManager.java`
#### Snippet
```java
    ClassLoaderHolder holder;
    if (isolationGroup == null) {
      return null;
    } else {
      // IMPORTANT - Isolation groups are not supported on Java 9+, because the system classloader is not an URLClassLoader
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/impl/ConversionHelper.java`
#### Snippet
```java
  public static JsonObject toJsonObject(Map<String, Object> map) {
    if (map == null) {
      return null;
    }
    map = new LinkedHashMap<>(map);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/impl/ConversionHelper.java`
#### Snippet
```java
  public static Map<String, Object> fromJsonObject(JsonObject json) {
    if (json == null) {
      return null;
    }
    Map<String, Object> map = new LinkedHashMap<>(json.getMap());
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/impl/ConversionHelper.java`
#### Snippet
```java
  public static JsonArray toJsonArray(List<Object> list) {
    if (list == null) {
      return null;
    }
    list = new ArrayList<>(list);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/impl/ConversionHelper.java`
#### Snippet
```java
  public static List<Object> fromJsonArray(JsonArray json) {
    if (json == null) {
      return null;
    }
    List<Object> list = new ArrayList<>(json.getList());
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/impl/HAManager.java`
#### Snippet
```java
      return matchingMembers.get((int)lpos);
    } else {
      return null;
    }
  }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/impl/utils/ConcurrentCyclicSequence.java`
#### Snippet
```java
  @SuppressWarnings("unchecked")
  public T first() {
    return (T) (elements.length > 0 ? elements[0] : null);
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/http/impl/HttpClientImpl.java`
#### Snippet
```java
          m = HttpMethod.GET;
        } else if (m != HttpMethod.GET && m != HttpMethod.HEAD) {
          return null;
        }
        URI uri = HttpUtils.resolveURIReference(resp.request().absoluteURI(), location);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/http/impl/HttpClientImpl.java`
#### Snippet
```java
          }
        } else {
          return null;
        }
        String requestURI = uri.getPath();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/http/impl/HttpClientImpl.java`
#### Snippet
```java
        return Future.succeededFuture(options);
      }
      return null;
    } catch (Exception e) {
      return Future.failedFuture(e);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/impl/future/FailedFuture.java`
#### Snippet
```java
  @Override
  public T result() {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/impl/future/SucceededFuture.java`
#### Snippet
```java
  @Override
  public Throwable cause() {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/impl/ContextInternal.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/impl/ContextInternal.java`
#### Snippet
```java
  default String deploymentID() {
    Deployment deployment = getDeployment();
    return deployment != null ? deployment.deploymentID() : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/impl/launcher/CommandLineUtils.java`
#### Snippet
```java
      }
    }
    return null;
  }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/impl/launcher/CommandLineUtils.java`
#### Snippet
```java
    }

    return null;

  }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/impl/future/FutureImpl.java`
#### Snippet
```java
   */
  public synchronized Throwable cause() {
    return value instanceof CauseHolder ? ((CauseHolder)value).cause : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/impl/future/FutureImpl.java`
#### Snippet
```java
   */
  public synchronized T result() {
    return value instanceof CauseHolder ? null : value == NULL_VALUE ? null : (T) value;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/impl/future/FutureImpl.java`
#### Snippet
```java
   */
  public synchronized T result() {
    return value instanceof CauseHolder ? null : value == NULL_VALUE ? null : (T) value;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/impl/launcher/commands/StopCommand.java`
#### Snippet
```java
      e.printStackTrace(out);
    }
    return null;
  }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/impl/launcher/commands/ClasspathHandler.java`
#### Snippet
```java
      Thread.currentThread().setContextClassLoader(originalClassLoader);
    }
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/impl/launcher/VertxCommandLauncher.java`
#### Snippet
```java
      return command;
    }
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/impl/launcher/VertxCommandLauncher.java`
#### Snippet
```java
        return commands.get(0);
      }
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/impl/launcher/VertxCommandLauncher.java`
#### Snippet
```java
      throw new IllegalStateException(e.getMessage());
    }
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/impl/launcher/VertxCommandLauncher.java`
#### Snippet
```java
      return registration.getCommand();
    }
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/impl/verticle/CustomJavaFileObject.java`
#### Snippet
```java

  public Modifier getAccessLevel() {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/impl/verticle/CustomJavaFileObject.java`
#### Snippet
```java

  public NestingKind getNestingKind() {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/impl/launcher/commands/BareCommand.java`
#### Snippet
```java
        } catch (DecodeException e) {
          log.error("Configuration file " + sconf + " does not contain a valid JSON object");
          return null;
        }
      } catch (FileNotFoundException e) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/impl/launcher/commands/BareCommand.java`
#### Snippet
```java
          // The configuration is not printed for security purpose, it can contain sensitive data.
          log.error("The -" + argName + " argument does not point to an existing file or is not a valid JSON object", e2);
          return null;
        }
      }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/impl/launcher/commands/BareCommand.java`
#### Snippet
```java
    }

    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/impl/launcher/commands/BareCommand.java`
#### Snippet
```java
        if (!latch.await(2, TimeUnit.MINUTES)) {
          log.error("Timed out in starting clustered Vert.x");
          return null;
        }
      } catch (InterruptedException e) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/impl/launcher/commands/BareCommand.java`
#### Snippet
```java
        log.error("Thread interrupted in startup");
        Thread.currentThread().interrupt();
        return null;
      }
      if (result.get().failed()) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/impl/launcher/commands/BareCommand.java`
#### Snippet
```java
      if (result.get().failed()) {
        log.error("Failed to form cluster", result.get().cause());
        return null;
      }
      instance = result.get().result();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/impl/verticle/MemoryFileManager.java`
#### Snippet
```java
    ByteArrayOutputStream bytes = compiledClasses.get(name);
    if (bytes == null) {
      return null;
    }
    return bytes.toByteArray();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/impl/verticle/JavaSourceContext.java`
#### Snippet
```java
            return line.substring(line.indexOf(' ', idx), line.indexOf(';', idx)).trim();
          }
          return null; // Package definition must be on the first non-comment line
        }
      }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/impl/verticle/JavaSourceContext.java`
#### Snippet
```java
        }
      }
      return null;
    } catch (IOException e) {
      throw new RuntimeException(e);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/json/impl/JsonUtil.java`
#### Snippet
```java
  public static Object wrapJsonValue(Object val) {
    if (val == null) {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/json/JsonArray.java`
#### Snippet
```java
    Number number = (Number) list.get(pos);
    if (number == null) {
      return null;
    } else if (number instanceof Integer) {
      return (Integer) number; // Avoids unnecessary unbox/box
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/json/JsonArray.java`
#### Snippet
```java
    Number number = (Number) list.get(pos);
    if (number == null) {
      return null;
    } else if (number instanceof Long) {
      return (Long) number; // Avoids unnecessary unbox/box
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/json/JsonArray.java`
#### Snippet
```java
    // no-op
    if (val == null) {
      return null;
    }
    // no-op if value is already an Instant
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/json/JsonArray.java`
#### Snippet
```java
    // no-op
    if (val == null) {
      return null;
    }
    // no-op if value is already an byte[]
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/json/JsonArray.java`
#### Snippet
```java
    Number number = (Number) list.get(pos);
    if (number == null) {
      return null;
    } else if (number instanceof Double) {
      return (Double) number; // Avoids unnecessary unbox/box
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/json/JsonArray.java`
#### Snippet
```java
    Number number = (Number) list.get(pos);
    if (number == null) {
      return null;
    } else if (number instanceof Float) {
      return (Float) number; // Avoids unnecessary unbox/box
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/json/JsonArray.java`
#### Snippet
```java

    if (val == null) {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/json/JsonArray.java`
#### Snippet
```java
    // no-op
    if (val == null) {
      return null;
    }
    // no-op if value is already an Buffer
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/json/pointer/impl/JsonPointerIteratorImpl.java`
#### Snippet
```java
          writeObjectParameter(value, key, new JsonObject());
        } else {
          return null;
        }
      }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/json/pointer/impl/JsonPointerIteratorImpl.java`
#### Snippet
```java
      return jsonifyValue(((JsonObject) value).getValue(key));
    }
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/json/pointer/impl/JsonPointerIteratorImpl.java`
#### Snippet
```java
      } catch (IndexOutOfBoundsException ignored) {}
    }
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/json/pointer/impl/JsonPointerImpl.java`
#### Snippet
```java
  public Object write(Object valueToWrite, JsonPointerIterator iterator, Object newElement, boolean createOnMissing) {
    if (isRootPointer()) {
      return iterator.isNull(valueToWrite) ? null : newElement;
    } else {
      Object walkedValue = walkTillLastElement(valueToWrite, iterator, createOnMissing, null);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/json/pointer/impl/JsonPointerImpl.java`
#### Snippet
```java
        return valueToWrite;
      else
        return null;
    }
  }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/json/pointer/impl/JsonPointerImpl.java`
#### Snippet
```java
    } catch (URISyntaxException e) {
      e.printStackTrace();
      return null;
    }
  }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/json/pointer/impl/JsonPointerImpl.java`
#### Snippet
```java
        }
      } else {
        return null;
      }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/eventbus/AddressHelper.java`
#### Snippet
```java
      nets = NetworkInterface.getNetworkInterfaces();
    } catch (SocketException e) {
      return null;
    }
    NetworkInterface netinf;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/eventbus/AddressHelper.java`
#### Snippet
```java
      }
    }
    return null;
  }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java
    Number number = (Number) map.get(key);
    if (number == null) {
      return null;
    } else if (number instanceof Double) {
      return (Double) number;  // Avoids unnecessary unbox/box
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java
    Number number = (Number) map.get(key);
    if (number == null) {
      return null;
    } else if (number instanceof Integer) {
      return (Integer) number;  // Avoids unnecessary unbox/box
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java
    // no-op
    if (val == null) {
      return null;
    }
    // no-op if value is already an Buffer
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java
    // no-op
    if (val == null) {
      return null;
    }
    // no-op if value is already an byte[]
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java
    Number number = (Number) map.get(key);
    if (number == null) {
      return null;
    } else if (number instanceof Long) {
      return (Long) number;  // Avoids unnecessary unbox/box
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java
  public static JsonObject mapFrom(Object obj) {
    if (obj == null) {
      return null;
    } else {
      return new JsonObject((Map<String, Object>) Json.CODEC.fromValue(obj, Map.class));
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java
    // no-op
    if (val == null) {
      return null;
    }
    // no-op if value is already an Instant
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java
    Number number = (Number) map.get(key);
    if (number == null) {
      return null;
    } else if (number instanceof Float) {
      return (Float) number;  // Avoids unnecessary unbox/box
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java
    Object val = map.get(key);
    if (val == null) {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/eventbus/impl/CodecManager.java`
#### Snippet
```java
  private volatile Function<String, Boolean> clusterSerializableCheck = s -> Boolean.FALSE;
  private volatile Function<String, Boolean> serializableCheck = EventBus.DEFAULT_SERIALIZABLE_CHECKER;
  private volatile Function<Object, String> codecSelector = o -> null;

  public CodecManager() {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/eventbus/impl/codecs/PingMessageCodec.java`
#### Snippet
```java
  @Override
  public String transform(String s) {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/eventbus/impl/codecs/PingMessageCodec.java`
#### Snippet
```java
  @Override
  public String decodeFromWire(int pos, Buffer buffer) {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/eventbus/impl/codecs/NullMessageCodec.java`
#### Snippet
```java
  @Override
  public String transform(String s) {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/eventbus/impl/codecs/NullMessageCodec.java`
#### Snippet
```java
  @Override
  public String decodeFromWire(int pos, Buffer buffer) {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/parsetools/impl/JsonEventImpl.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/parsetools/impl/JsonEventImpl.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/parsetools/impl/JsonEventImpl.java`
#### Snippet
```java
  @Override
  public Instant instantValue() {
    return value != null ? Instant.from(ISO_INSTANT.parse((CharSequence) value)) : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/parsetools/impl/JsonEventImpl.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/parsetools/impl/JsonEventImpl.java`
#### Snippet
```java
  @Override
  public Buffer binaryValue() {
    return value != null ? Buffer.buffer(BASE64_DECODER.decode((String) value)) : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/parsetools/impl/JsonEventImpl.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/eventbus/impl/EventBusImpl.java`
#### Snippet
```java
        }
      }
      return null;
    } else {
      if (metrics != null) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/io/vertx/core/parsetools/impl/JsonParserImpl.java`
#### Snippet
```java
    public JsonToken nextToken() throws IOException {
      if (tokens.isEmpty()) {
        return null;
      }
      text = null;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/examples/DNSExamples.java`
#### Snippet
```java

  private static SrvRecord getSrvRecord() {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/examples/cli/TypedCLIExamples.java`
#### Snippet
```java
    @Override
    public Person fromString(String s) {
      return null;
    }
  }
```

## RuleId[ruleID=AssignmentToLambdaParameter]
### RuleId[ruleID=AssignmentToLambdaParameter]
Assignment to lambda parameter `ctx`
in `src/main/java/io/vertx/core/net/impl/pool/ConnectionPool.java`
#### Snippet
```java
   */
  Function<ContextInternal, EventLoopContext> EVENT_LOOP_CONTEXT_PROVIDER = ctx -> {
    ctx = ctx.unwrap();
    if (ctx instanceof EventLoopContext) {
      return (EventLoopContext)ctx;
```

### RuleId[ruleID=AssignmentToLambdaParameter]
Assignment to lambda parameter `s`
in `src/main/java/io/vertx/core/impl/launcher/commands/Watcher.java`
#### Snippet
```java
      }
      if (s.contains("*")) {
        s = s.substring(0, s.indexOf("*"));
      }
      File file = new File(s);
```

### RuleId[ruleID=AssignmentToLambdaParameter]
Assignment to lambda parameter `oldVal`
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java
        map.merge(e.getKey(), e.getValue(), (oldVal, newVal) -> {
          if (oldVal instanceof Map) {
            oldVal = new JsonObject((Map) oldVal);
          }
          if (newVal instanceof Map) {
```

### RuleId[ruleID=AssignmentToLambdaParameter]
Assignment to lambda parameter `newVal`
in `src/main/java/io/vertx/core/json/JsonObject.java`
#### Snippet
```java
          }
          if (newVal instanceof Map) {
            newVal = new JsonObject((Map) newVal);
          }
          if (oldVal instanceof JsonObject && newVal instanceof JsonObject) {
```

## RuleId[ruleID=BusyWait]
### RuleId[ruleID=BusyWait]
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `src/main/java/io/vertx/core/impl/launcher/commands/Watcher.java`
#### Snippet
```java
        }
        // Wait for the next scan.
        Thread.sleep(scanPeriod);
      }
    } catch (Throwable e) {
```

## RuleId[ruleID=CopyConstructorMissesField]
### RuleId[ruleID=CopyConstructorMissesField]
Copy constructor does not copy field 'classLoader'
in `src/main/java/io/vertx/core/DeploymentOptions.java`
#### Snippet
```java
   * @param other the instance to copy
   */
  public DeploymentOptions(DeploymentOptions other) {
    this.config = other.getConfig() == null ? null : other.getConfig().copy();
    this.worker = other.isWorker();
```

### RuleId[ruleID=CopyConstructorMissesField]
Copy constructor does not copy field 'preferNativeTransport'
in `src/main/java/io/vertx/core/VertxOptions.java`
#### Snippet
```java
   * @param other The other {@code VertxOptions} to copy when creating this
   */
  public VertxOptions(VertxOptions other) {
    this.eventLoopPoolSize = other.getEventLoopPoolSize();
    this.workerPoolSize = other.getWorkerPoolSize();
```

### RuleId[ruleID=CopyConstructorMissesField]
Copy constructor does not copy fields 'helper' and 'provider'
in `src/main/java/io/vertx/core/net/KeyStoreOptionsBase.java`
#### Snippet
```java
   * @param other  the options to copy
   */
  protected KeyStoreOptionsBase(KeyStoreOptionsBase other) {
    super();
    this.type = other.type;
```

### RuleId[ruleID=CopyConstructorMissesField]
Copy constructor does not copy field 'helper'
in `src/main/java/io/vertx/core/net/PemTrustOptions.java`
#### Snippet
```java
   * @param other  the options to copy
   */
  public PemTrustOptions(PemTrustOptions other) {
    super();
    this.certPaths = new ArrayList<>(other.getCertPaths());
```

### RuleId[ruleID=CopyConstructorMissesField]
Copy constructor does not copy field 'nonProxyHosts'
in `src/main/java/io/vertx/core/net/ClientOptionsBase.java`
#### Snippet
```java
   * @param other  the options to copy
   */
  public ClientOptionsBase(ClientOptionsBase other) {
    super(other);
    this.connectTimeout = other.getConnectTimeout();
```

### RuleId[ruleID=CopyConstructorMissesField]
Copy constructor does not copy field 'helper'
in `src/main/java/io/vertx/core/net/PemKeyCertOptions.java`
#### Snippet
```java
   * @param other  the options to copy
   */
  public PemKeyCertOptions(PemKeyCertOptions other) {
    super();
    this.keyPaths = other.keyPaths != null ? new ArrayList<>(other.keyPaths) : new ArrayList<>();
```

### RuleId[ruleID=CopyConstructorMissesField]
Copy constructor does not copy field 'json'
in `src/main/java/io/vertx/core/metrics/MetricsOptions.java`
#### Snippet
```java
   * @param other The other {@link MetricsOptions} to copy when creating this
   */
  public MetricsOptions(MetricsOptions other) {
    enabled = other.isEnabled();
    factory = other.factory;
```

### RuleId[ruleID=CopyConstructorMissesField]
Copy constructor does not copy field 'json'
in `src/main/java/io/vertx/core/tracing/TracingOptions.java`
#### Snippet
```java
   * @param other The other {@link TracingOptions} to copy when creating this
   */
  public TracingOptions(TracingOptions other) {
    factory = other.factory;
  }
```

### RuleId[ruleID=CopyConstructorMissesField]
Copy constructor does not copy field 'trace'
in `src/main/java/io/vertx/core/eventbus/impl/MessageImpl.java`
#### Snippet
```java
  }

  protected MessageImpl(MessageImpl<U, V> other) {
    this.bus = other.bus;
    this.address = other.address;
```

## RuleId[ruleID=UseCompareMethod]
### RuleId[ruleID=UseCompareMethod]
Expression can be replaced with 'Integer.compare'
in `src/main/java/io/vertx/core/dns/impl/MxRecordImpl.java`
#### Snippet
```java
  @Override
  public int compareTo(MxRecord o) {
    return Integer.valueOf(priority()).compareTo(o.priority());
  }
}
```

### RuleId[ruleID=UseCompareMethod]
Expression can be replaced with 'Integer.compare'
in `src/main/java/io/vertx/core/cli/impl/DefaultParser.java`
#### Snippet
```java
        return 1;
      }
      return Integer.valueOf(o1.getIndex()).compareTo(o2.getIndex());
    });

```

### RuleId[ruleID=UseCompareMethod]
Expression can be replaced with 'Integer.compare'
in `src/main/java/io/vertx/core/dns/impl/SrvRecordImpl.java`
#### Snippet
```java
  @Override
  public int compareTo(SrvRecord o) {
    return Integer.valueOf(priority()).compareTo(o.priority());
  }
}
```

## RuleId[ruleID=ThrowableNotThrown]
### RuleId[ruleID=ThrowableNotThrown]
Result of `deliverMessageLocally()` not thrown
in `src/main/java/io/vertx/core/eventbus/impl/clustered/ClusteredEventBus.java`
#### Snippet
```java
              socket.write(PONG);
            } else {
              deliverMessageLocally(received);
            }
          }
```

## RuleId[ruleID=CastCanBeRemovedNarrowingVariableType]
### RuleId[ruleID=CastCanBeRemovedNarrowingVariableType]
Cast may be removed by changing the type of 'currentContext' to 'ContextInternal'
in `src/main/java/io/vertx/core/impl/DeploymentManager.java`
#### Snippet
```java
    Context currentContext = vertx.getOrCreateContext();
    if (deployment == null) {
      return ((ContextInternal) currentContext).failedFuture(new IllegalStateException("Unknown deployment"));
    } else {
      return deployment.doUndeploy(vertx.getOrCreateContext());
```

