# skywalking-java 
 
# Bad smells
I found 1440 bad smells with 71 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=ZeroLengthArrayInitialization] | 297 | false |
| RuleId[ruleID=UtilityClassWithoutPrivateConstructor] | 185 | false |
| RuleId[ruleID=ReturnNull] | 146 | false |
| RuleId[ruleID=RedundantFieldInitialization] | 76 | false |
| RuleId[ruleID=UnnecessaryFullyQualifiedName] | 63 | false |
| RuleId[ruleID=AssignmentToMethodParameter] | 53 | false |
| RuleId[ruleID=BoundedWildcard] | 45 | false |
| RuleId[ruleID=MissortedModifiers] | 37 | false |
| RuleId[ruleID=CatchMayIgnoreException] | 30 | false |
| RuleId[ruleID=SizeReplaceableByIsEmpty] | 29 | true |
| RuleId[ruleID=UnnecessarySuperQualifier] | 28 | false |
| RuleId[ruleID=StringConcatenationInsideStringBufferAppend] | 28 | false |
| RuleId[ruleID=EmptyMethod] | 22 | false |
| RuleId[ruleID=DataFlowIssue] | 21 | false |
| RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern] | 21 | false |
| RuleId[ruleID=UnusedAssignment] | 20 | false |
| RuleId[ruleID=RedundantArrayCreation] | 18 | false |
| RuleId[ruleID=NestedAssignment] | 17 | false |
| RuleId[ruleID=NonProtectedConstructorInAbstractClass] | 14 | true |
| RuleId[ruleID=StringBufferReplaceableByString] | 13 | false |
| RuleId[ruleID=RedundantMethodOverride] | 13 | false |
| RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod] | 12 | false |
| RuleId[ruleID=ClassNameSameAsAncestorName] | 11 | false |
| RuleId[ruleID=ConstantValue] | 11 | false |
| RuleId[ruleID=UnnecessaryLocalVariable] | 11 | true |
| RuleId[ruleID=IgnoreResultOfCall] | 10 | false |
| RuleId[ruleID=RedundantLengthCheck] | 10 | false |
| RuleId[ruleID=Convert2Lambda] | 10 | false |
| RuleId[ruleID=UnnecessaryBoxing] | 9 | false |
| RuleId[ruleID=Anonymous2MethodRef] | 9 | false |
| RuleId[ruleID=FinalStaticMethod] | 8 | false |
| RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized] | 8 | false |
| RuleId[ruleID=InfiniteRecursion] | 8 | false |
| RuleId[ruleID=CastConflictsWithInstanceof] | 8 | false |
| RuleId[ruleID=UseOfPropertiesAsHashtable] | 7 | false |
| RuleId[ruleID=IndexOfReplaceableByContains] | 7 | false |
| RuleId[ruleID=UnnecessaryToStringCall] | 7 | true |
| RuleId[ruleID=FinalPrivateMethod] | 6 | false |
| RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment] | 6 | false |
| RuleId[ruleID=ThrowablePrintStackTrace] | 6 | false |
| RuleId[ruleID=RegExpRedundantEscape] | 5 | false |
| RuleId[ruleID=Convert2MethodRef] | 5 | false |
| RuleId[ruleID=UnnecessaryReturn] | 4 | true |
| RuleId[ruleID=NonExceptionNameEndsWithException] | 4 | false |
| RuleId[ruleID=NonSerializableFieldInSerializableClass] | 4 | false |
| RuleId[ruleID=RedundantSuppression] | 4 | false |
| RuleId[ruleID=SystemOutErr] | 4 | false |
| RuleId[ruleID=CastToIncompatibleInterface] | 3 | false |
| RuleId[ruleID=ManualMinMaxCalculation] | 3 | false |
| RuleId[ruleID=AnonymousHasLambdaAlternative] | 3 | false |
| RuleId[ruleID=StringOperationCanBeSimplified] | 3 | false |
| RuleId[ruleID=AbstractMethodCallInConstructor] | 3 | false |
| RuleId[ruleID=RedundantCollectionOperation] | 3 | false |
| RuleId[ruleID=NonStrictComparisonCanBeEquality] | 3 | true |
| RuleId[ruleID=BusyWait] | 3 | false |
| RuleId[ruleID=DoubleCheckedLocking] | 2 | false |
| RuleId[ruleID=RefusedBequest] | 2 | false |
| RuleId[ruleID=TrivialStringConcatenation] | 2 | false |
| RuleId[ruleID=EqualsBetweenInconvertibleTypes] | 2 | false |
| RuleId[ruleID=InstanceofIncompatibleInterface] | 2 | false |
| RuleId[ruleID=CodeBlock2Expr] | 2 | false |
| RuleId[ruleID=RedundantImplements] | 2 | false |
| RuleId[ruleID=InstanceofCatchParameter] | 2 | false |
| RuleId[ruleID=SynchronizeOnThis] | 2 | false |
| RuleId[ruleID=IOResource] | 2 | false |
| RuleId[ruleID=SimplifyStreamApiCallChains] | 2 | false |
| RuleId[ruleID=UnnecessaryCallToStringValueOf] | 2 | false |
| RuleId[ruleID=OptionalUsedAsFieldOrParameterType] | 2 | false |
| RuleId[ruleID=KotlinMavenPluginPhase] | 2 | false |
| RuleId[ruleID=ConditionCoveredByFurtherCondition] | 2 | false |
| RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter] | 2 | false |
| RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument] | 1 | true |
| RuleId[ruleID=EnumSwitchStatementWhichMissesCases] | 1 | false |
| RuleId[ruleID=WrapperTypeMayBePrimitive] | 1 | false |
| RuleId[ruleID=WhileCanBeForeach] | 1 | false |
| RuleId[ruleID=UnnecessaryUnboxing] | 1 | false |
| RuleId[ruleID=Lombok] | 1 | false |
| RuleId[ruleID=MismatchedCollectionQueryUpdate] | 1 | false |
| RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator] | 1 | false |
| RuleId[ruleID=DoubleBraceInitialization] | 1 | false |
| RuleId[ruleID=ProtectedMemberInFinalClass] | 1 | true |
| RuleId[ruleID=InnerClassMayBeStatic] | 1 | true |
| RuleId[ruleID=CharsetObjectCanBeUsed] | 1 | false |
| RuleId[ruleID=Java8MapApi] | 1 | false |
| RuleId[ruleID=UseBulkOperation] | 1 | false |
## RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
### RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
Call to `toArray()` with pre-sized array argument 'new PropertyDescriptor\[newPropertyDescriptors.size()\]'
in `apm-sniffer/apm-sdk-plugin/spring-plugins/core-patch/src/main/java/org/apache/skywalking/apm/plugin/spring/patch/GetPropertyDescriptorsInterceptor.java`
#### Snippet
```java
            }

            return newPropertyDescriptors.toArray(new PropertyDescriptor[newPropertyDescriptors.size()]);
        }

```

## RuleId[ruleID=EnumSwitchStatementWhichMissesCases]
### RuleId[ruleID=EnumSwitchStatementWhichMissesCases]
`switch (currentProfiler.profilingStatus().get()) { case PENDING: ...` statement on enum type 'org.apache.skywalking.apm.agent.core.profile.ProfileStatus' misses cases: 'NONE', and 'STOPPED'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/profile/ProfileThread.java`
#### Snippet
```java
                }

                switch (currentProfiler.profilingStatus().get()) {

                    case PENDING:
                        // check tracing context running time
                        currentProfiler.startProfilingIfNeed();
                        break;

                    case PROFILING:
                        // dump stack
                        TracingThreadSnapshot snapshot = currentProfiler.buildSnapshot();
                        if (snapshot != null) {
                            profileTaskChannelService.addProfilingSnapshot(snapshot);
                        } else {
                            // tell execution context current tracing thread dump failed, stop it
                            executionContext.stopTracingProfile(currentProfiler.tracingContext());
                        }
                        break;

                }
            }

```

## RuleId[ruleID=WrapperTypeMayBePrimitive]
### RuleId[ruleID=WrapperTypeMayBePrimitive]
Type may be primitive
in `apm-sniffer/apm-sdk-plugin/xmemcached-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/xmemcached/v2/XMemcachedConstructorWithComplexArgInterceptor.java`
#### Snippet
```java
            memcachConnInfo = append(memcachConnInfo, entry.getValue());
        }
        Integer length = memcachConnInfo.length();
        if (length > 1) {
            memcachConnInfo = new StringBuilder(memcachConnInfo.substring(0, length - 1));
```

## RuleId[ruleID=DoubleCheckedLocking]
### RuleId[ruleID=DoubleCheckedLocking]
Double-checked locking
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/loader/AgentClassLoader.java`
#### Snippet
```java
     */
    public static void initDefaultLoader() throws AgentPackageNotFoundException {
        if (DEFAULT_LOADER == null) {
            synchronized (AgentClassLoader.class) {
                if (DEFAULT_LOADER == null) {
```

### RuleId[ruleID=DoubleCheckedLocking]
Double-checked locking
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/FileWriter.java`
#### Snippet
```java

    public static FileWriter get() {
        if (INSTANCE == null) {
            synchronized (CREATE_LOCK) {
                if (INSTANCE == null) {
```

## RuleId[ruleID=WhileCanBeForeach]
### RuleId[ruleID=WhileCanBeForeach]
`while` loop can be replaced with enhanced 'for'
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-opentracing-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/opentracing/tracer/SkywalkingTracerExtractInterceptor.java`
#### Snippet
```java
                next = next.next();
                Iterator<Map.Entry<String, String>> iterator = textMapCarrier.iterator();
                while (iterator.hasNext()) {
                    Map.Entry<String, String> entry = iterator.next();
                    if (next.getHeadKey().equals(entry.getKey())) {
```

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `JDBCPluginConfig.Plugin.JDBC.TRACE_SQL_PARAMETERS` from instance context
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/TraceSqlParametersWatcher.java`
#### Snippet
```java
    public void notify(ConfigChangeEvent value) {
        if (EventType.DELETE.equals(value.getEventType())) {
            JDBCPluginConfig.Plugin.JDBC.TRACE_SQL_PARAMETERS = defaultValue;
        } else {
            JDBCPluginConfig.Plugin.JDBC.TRACE_SQL_PARAMETERS = Boolean.parseBoolean(value.getNewValue());
```

### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `JDBCPluginConfig.Plugin.JDBC.TRACE_SQL_PARAMETERS` from instance context
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/TraceSqlParametersWatcher.java`
#### Snippet
```java
            JDBCPluginConfig.Plugin.JDBC.TRACE_SQL_PARAMETERS = defaultValue;
        } else {
            JDBCPluginConfig.Plugin.JDBC.TRACE_SQL_PARAMETERS = Boolean.parseBoolean(value.getNewValue());
        }
    }
```

### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `METER_SERVICE` from instance context
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-meter-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/meter/GaugeConstructInterceptor.java`
#### Snippet
```java

        if (METER_SERVICE == null) {
            METER_SERVICE = ServiceManager.INSTANCE.findService(MeterService.class);
        }
        objInst.setSkyWalkingDynamicField(METER_SERVICE.register(gauge));
```

### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `METER_SERVICE` from instance context
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-meter-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/meter/HistogramConstructInterceptor.java`
#### Snippet
```java
        // register the meter
        if (METER_SERVICE == null) {
            METER_SERVICE = ServiceManager.INSTANCE.findService(MeterService.class);
        }
        objInst.setSkyWalkingDynamicField(METER_SERVICE.register(histogram));
```

### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `METER_SERVICE` from instance context
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-meter-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/meter/CounterConstructInterceptor.java`
#### Snippet
```java

        if (METER_SERVICE == null) {
            METER_SERVICE = ServiceManager.INSTANCE.findService(MeterService.class);
        }
        objInst.setSkyWalkingDynamicField(METER_SERVICE.register(counter));
```

### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `Config.Logging.LEVEL` from instance context
in `apm-sniffer/apm-test-tools/src/main/java/org/apache/skywalking/apm/agent/test/tools/AgentServiceRule.java`
#### Snippet
```java
        super.before();
        AgentClassLoader.initDefaultLoader();
        Config.Logging.LEVEL = LogLevel.OFF;
        ServiceManager.INSTANCE.boot();
        Config.Agent.KEEP_TRACING = true;
```

### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `Config.Agent.KEEP_TRACING` from instance context
in `apm-sniffer/apm-test-tools/src/main/java/org/apache/skywalking/apm/agent/test/tools/AgentServiceRule.java`
#### Snippet
```java
        Config.Logging.LEVEL = LogLevel.OFF;
        ServiceManager.INSTANCE.boot();
        Config.Agent.KEEP_TRACING = true;
    }
}
```

### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `SERVICE_INSTANCE_PROPERTIES` from instance context
in `apm-sniffer/optional-reporter-plugins/kafka-reporter-plugin/src/main/java/org/apache/skywalking/apm/agent/core/kafka/KafkaServiceManagementServiceClient.java`
#### Snippet
```java
        topic = producerManager.formatTopicNameThenRegister(KafkaReporterPluginConfig.Plugin.Kafka.TOPIC_MANAGEMENT);

        SERVICE_INSTANCE_PROPERTIES = InstanceJsonPropertiesUtil.parseProperties();
    }

```

### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `Config.Agent.INSTANCE_NAME` from instance context
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/ServiceInstanceGenerator.java`
#### Snippet
```java
        }

        Config.Agent.INSTANCE_NAME = UUID.randomUUID().toString().replaceAll("-", "") + "@" + OSUtil.getIPV4();
    }

```

### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `METER_SERVICE` from instance context
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/meter/AbstractBuilder.java`
#### Snippet
```java
        // create or get the meter
        if (METER_SERVICE == null) {
            METER_SERVICE = ServiceManager.INSTANCE.findService(MeterService.class);
        }
        final METER adapter = this.create(meterId);
```

### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `SERVICE_INSTANCE_PROPERTIES` from instance context
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/remote/ServiceManagementClient.java`
#### Snippet
```java
        ServiceManager.INSTANCE.findService(GRPCChannelManager.class).addChannelListener(this);

        SERVICE_INSTANCE_PROPERTIES = InstanceJsonPropertiesUtil.parseProperties();
    }

```

### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `PROFILE_TASK_EXECUTION_SERVICE` from instance context
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/TracingContext.java`
#### Snippet
```java
        // profiling status
        if (PROFILE_TASK_EXECUTION_SERVICE == null) {
            PROFILE_TASK_EXECUTION_SERVICE = ServiceManager.INSTANCE.findService(ProfileTaskExecutionService.class);
        }
        this.profileStatus = PROFILE_TASK_EXECUTION_SERVICE.addProfiling(
```

## RuleId[ruleID=RegExpRedundantEscape]
### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\]` in RegExp
in `apm-sniffer/apm-sdk-plugin/vertx-plugins/vertx-core-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/vertx3/RouteStateInterceptor.java`
#### Snippet
```java
        InstanceConstructorInterceptor {

    private static final Pattern HTTP_METHOD_PATTERN = Pattern.compile("methods:\\[([a-zA-Z,]+)\\]");

    @Override
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\<` in RegExp
in `apm-sniffer/apm-sdk-plugin/play-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/play/v2x/TracingFilter.java`
#### Snippet
```java
public class TracingFilter extends Filter {

    private final Pattern routePattern = Pattern.compile("\\$(\\w+)\\<\\[\\^/\\]\\+\\>", Pattern.DOTALL);

    @Inject
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\]` in RegExp
in `apm-sniffer/apm-sdk-plugin/play-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/play/v2x/TracingFilter.java`
#### Snippet
```java
public class TracingFilter extends Filter {

    private final Pattern routePattern = Pattern.compile("\\$(\\w+)\\<\\[\\^/\\]\\+\\>", Pattern.DOTALL);

    @Inject
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\>` in RegExp
in `apm-sniffer/apm-sdk-plugin/play-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/play/v2x/TracingFilter.java`
#### Snippet
```java
public class TracingFilter extends Filter {

    private final Pattern routePattern = Pattern.compile("\\$(\\w+)\\<\\[\\^/\\]\\+\\>", Pattern.DOTALL);

    @Inject
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\}` in RegExp
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/AbstractLogger.java`
#### Snippet
```java
             * @Fix the Illegal group reference issue
             */
            tmpMessage = tmpMessage.replaceFirst("\\{\\}", Matcher.quoteReplacement(String.valueOf(parameters[parametersIndex++])));
            startSize = index + 2;
        }
```

## RuleId[ruleID=RefusedBequest]
### RuleId[ruleID=RefusedBequest]
Method `clone()` does not call 'super.clone()'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/CorrelationContext.java`
#### Snippet
```java
     */
    @Override
    public CorrelationContext clone() {
        final CorrelationContext context = new CorrelationContext();
        context.data.putAll(this.data);
```

### RuleId[ruleID=RefusedBequest]
Method `clone()` does not call 'super.clone()'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/ExtensionContext.java`
#### Snippet
```java
     */
    @Override
    public ExtensionContext clone() {
        final ExtensionContext context = new ExtensionContext();
        context.skipAnalysis = this.skipAnalysis;
```

## RuleId[ruleID=CastToIncompatibleInterface]
### RuleId[ruleID=CastToIncompatibleInterface]
Cast to incompatible interface `EnhancedInstance`
in `apm-sniffer/apm-sdk-plugin/elasticsearch-6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v6/interceptor/TransportClientNodesServiceInterceptor.java`
#### Snippet
```java
            if (allArguments.length >= 2 && allArguments[1] instanceof AdapterActionFuture) {
                AdapterActionFuture actionFuture = (AdapterActionFuture) allArguments[1];
                ((EnhancedInstance) actionFuture).setSkyWalkingDynamicField(true);
            }
        }
```

### RuleId[ruleID=CastToIncompatibleInterface]
Cast to incompatible interface `EnhancedInstance`
in `apm-sniffer/apm-sdk-plugin/thrift-plugin/src/main/java/org/apache/skywalking/apm/plugin/thrift/client/TServiceClientInterceptor.java`
#### Snippet
```java
                    new ClientOutProtocolWrapper(protocol)
            );
            Object dynamicField = ((EnhancedInstance) protocol.getTransport()).getSkyWalkingDynamicField();
            objInst.setSkyWalkingDynamicField(Objects.isNull(dynamicField) ? "UNKNOWN" : dynamicField);
        }
```

### RuleId[ruleID=CastToIncompatibleInterface]
Cast to incompatible interface `EnhancedInstance`
in `apm-sniffer/apm-sdk-plugin/vertx-plugins/vertx-core-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/vertx3/RouteStateInterceptor.java`
#### Snippet
```java
        RoutingContextImplBase routingContext = (RoutingContextImplBase) allArguments[0];
        List<Handler<RoutingContext>> contextHandlers = (List<Handler<RoutingContext>>) objInst.getSkyWalkingDynamicField();
        AtomicInteger currentContextIndex = (AtomicInteger) ((EnhancedInstance) routingContext).getSkyWalkingDynamicField();
        int handlerContextIndex = currentContextIndex.get();
        if (VertxContext.VERTX_VERSION >= 35 && contextHandlers.size() > 1) {
```

## RuleId[ruleID=RedundantArrayCreation]
### RuleId[ruleID=RedundantArrayCreation]
Redundant array creation for calling varargs method
in `apm-sniffer/apm-sdk-plugin/spring-plugins/mvc-annotation-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/mvc/v3/define/ControllerInstrumentation.java`
#### Snippet
```java
    @Override
    protected ClassMatch enhanceClass() {
        return ClassAnnotationMatch.byClassAnnotationMatch(new String[] {CONTROLLER_ENHANCE_ANNOTATION});
    }

```

### RuleId[ruleID=RedundantArrayCreation]
Redundant array creation for calling varargs method
in `apm-sniffer/apm-sdk-plugin/okhttp-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/okhttp/v2/define/CallbackInstrumentation.java`
#### Snippet
```java
    @Override
    protected ClassMatch enhanceClass() {
        return byHierarchyMatch(new String[]{"com.squareup.okhttp.Callback"});
    }
}
```

### RuleId[ruleID=RedundantArrayCreation]
Redundant array creation for calling varargs method
in `apm-sniffer/apm-sdk-plugin/okhttp-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/okhttp/v3/define/CallbackInstrumentation.java`
#### Snippet
```java
    @Override
    protected ClassMatch enhanceClass() {
        return byHierarchyMatch(new String[] {"okhttp3.Callback"});
    }
}
```

### RuleId[ruleID=RedundantArrayCreation]
Redundant array creation for calling varargs method
in `apm-sniffer/apm-sdk-plugin/rocketMQ-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/rocketMQ/v4/define/SendCallbackInstrumentation.java`
#### Snippet
```java
    @Override
    protected ClassMatch enhanceClass() {
        return byHierarchyMatch(new String[] {ENHANCE_CLASS});
    }
}
```

### RuleId[ruleID=RedundantArrayCreation]
Redundant array creation for calling varargs method
in `apm-sniffer/apm-sdk-plugin/rocketMQ-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/rocketMQ/v4/define/ConsumeMessageConcurrentlyInstrumentation.java`
#### Snippet
```java
    @Override
    protected ClassMatch enhanceClass() {
        return HierarchyMatch.byHierarchyMatch(new String[] {ENHANCE_CLASS});
    }
}
```

### RuleId[ruleID=RedundantArrayCreation]
Redundant array creation for calling varargs method
in `apm-sniffer/apm-sdk-plugin/rocketMQ-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/rocketMQ/v4/define/ConsumeMessageOrderlyInstrumentation.java`
#### Snippet
```java
    @Override
    protected ClassMatch enhanceClass() {
        return byHierarchyMatch(new String[] {ENHANCE_CLASS});
    }
}
```

### RuleId[ruleID=RedundantArrayCreation]
Redundant array creation for calling varargs method
in `apm-sniffer/apm-sdk-plugin/okhttp-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/okhttp/v4/define/CallbackInstrumentation.java`
#### Snippet
```java
    @Override
    protected ClassMatch enhanceClass() {
        return byHierarchyMatch(new String[] {"okhttp3.Callback"});
    }
}
```

### RuleId[ruleID=RedundantArrayCreation]
Redundant array creation for calling varargs method
in `apm-sniffer/apm-sdk-plugin/mongodb-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/mongodb/v3/define/v36/MongoDBOperationExecutorInstrumentation.java`
#### Snippet
```java
    @Override
    protected ClassMatch enhanceClass() {
        return HierarchyMatch.byHierarchyMatch(new String[] {ENHANCE_CLASS});
    }

```

### RuleId[ruleID=RedundantArrayCreation]
Redundant array creation for calling varargs method
in `apm-sniffer/apm-sdk-plugin/hystrix-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/hystrix/v1/define/HystrixCommandInstrumentation.java`
#### Snippet
```java
    @Override
    protected ClassMatch enhanceClass() {
        return byHierarchyMatch(new String[] {ENHANCE_CLASS});
    }

```

### RuleId[ruleID=RedundantArrayCreation]
Redundant array creation for calling varargs method
in `apm-sniffer/apm-sdk-plugin/pulsar-common/src/main/java/org/apache/skywalking/apm/plugin/pulsar/common/define/BaseSendCallbackInstrumentation.java`
#### Snippet
```java
    @Override
    protected ClassMatch enhanceClass() {
        return byHierarchyMatch(new String[] {ENHANCE_CLASS});
    }
}
```

### RuleId[ruleID=RedundantArrayCreation]
Redundant array creation for calling varargs method
in `apm-sniffer/apm-sdk-plugin/kafka-plugin/src/main/java/org/apache/skywalking/apm/plugin/kafka/define/CallbackInstrumentation.java`
#### Snippet
```java
    @Override
    protected ClassMatch enhanceClass() {
        return byHierarchyMatch(new String[] {ENHANCE_CLASS});
    }
}
```

### RuleId[ruleID=RedundantArrayCreation]
Redundant array creation for calling varargs method
in `apm-sniffer/apm-sdk-plugin/elasticsearch-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v5/define/GenericActionInstrumentation.java`
#### Snippet
```java
    @Override
    protected ClassMatch enhanceClass() {
        return byHierarchyMatch(new String[] {"org.elasticsearch.action.GenericAction"});
    }

```

### RuleId[ruleID=RedundantArrayCreation]
Redundant array creation for calling varargs method
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/IgnoredExceptionAnnotationActivation.java`
#### Snippet
```java
    @Override
    protected ClassMatch enhanceClass() {
        return byClassAnnotationMatch(new String[] {ANNOTATION_NAME});
    }
}
```

### RuleId[ruleID=RedundantArrayCreation]
Redundant array creation for calling varargs method
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/CallableOrRunnableActivation.java`
#### Snippet
```java
    @Override
    protected ClassMatch enhanceClass() {
        return byClassAnnotationMatch(new String[] {ANNOTATION_NAME});
    }

```

### RuleId[ruleID=RedundantArrayCreation]
Redundant array creation for calling varargs method
in `apm-sniffer/apm-sdk-plugin/light4j-plugins/light4j-plugin/src/main/java/org/apache/skywalking/apm/plugin/light4j/define/LightInstrumentation.java`
#### Snippet
```java
    @Override
    protected ClassMatch enhanceClass() {
        return HierarchyMatch.byHierarchyMatch(new String[] {ENHANCE_CLASS});
    }

```

### RuleId[ruleID=RedundantArrayCreation]
Redundant array creation for calling varargs method
in `apm-sniffer/apm-sdk-plugin/rocketMQ-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/rocketMQ/v3/define/SendCallbackInstrumentation.java`
#### Snippet
```java
    @Override
    protected ClassMatch enhanceClass() {
        return byHierarchyMatch(new String[] {ENHANCE_CLASS});
    }
}
```

### RuleId[ruleID=RedundantArrayCreation]
Redundant array creation for calling varargs method
in `apm-sniffer/apm-sdk-plugin/rocketMQ-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/rocketMQ/v3/define/ConsumeMessageOrderlyInstrumentation.java`
#### Snippet
```java
    @Override
    protected ClassMatch enhanceClass() {
        return byHierarchyMatch(new String[] {ENHANCE_CLASS});
    }
}
```

### RuleId[ruleID=RedundantArrayCreation]
Redundant array creation for calling varargs method
in `apm-sniffer/apm-sdk-plugin/rocketMQ-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/rocketMQ/v3/define/ConsumeMessageConcurrentlyInstrumentation.java`
#### Snippet
```java
    @Override
    protected ClassMatch enhanceClass() {
        return byHierarchyMatch(new String[] {ENHANCE_CLASS});
    }
}
```

## RuleId[ruleID=FinalPrivateMethod]
### RuleId[ruleID=FinalPrivateMethod]
'private' method declared `final`
in `apm-sniffer/apm-sdk-plugin/solrj-7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/solrj/SolrClientInterceptor.java`
#### Snippet
```java
    }

    private static final String toQueryString(SolrParams params) {
        final StringBuilder sb = new StringBuilder(128);
        boolean first = true;
```

### RuleId[ruleID=FinalPrivateMethod]
'private' method declared `final`
in `apm-sniffer/apm-sdk-plugin/solrj-7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/solrj/SolrClientInterceptor.java`
#### Snippet
```java
    }

    private static final String getOperatorName(String collection, String path) {
        return "solrJ/" + collection + path;
    }
```

### RuleId[ruleID=FinalPrivateMethod]
'private' method declared `final`
in `apm-sniffer/apm-sdk-plugin/solrj-7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/solrj/SolrClientInterceptor.java`
#### Snippet
```java
    }

    private static final AbstractSpan getSpan(String operatorName, String remotePeer) {
        return ContextManager.createExitSpan(operatorName, remotePeer)
                             .setComponent(ComponentsDefine.SOLRJ)
```

### RuleId[ruleID=FinalPrivateMethod]
'private' method declared `final`
in `apm-sniffer/apm-sdk-plugin/solrj-7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/solrj/SolrClientInterceptor.java`
#### Snippet
```java
    }

    private static final SolrParams getParams(SolrParams params) {
        if (params == null) {
            return new ModifiableSolrParams();
```

### RuleId[ruleID=FinalPrivateMethod]
'private' method declared `final`
in `apm-sniffer/apm-sdk-plugin/solrj-7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/solrj/SolrClientInterceptor.java`
#### Snippet
```java
    }

    private static final String getCollection(SolrjInstance instance, Object argument) {
        if (null == argument) {
            return instance.getCollection();
```

### RuleId[ruleID=FinalPrivateMethod]
'private' method declared `final`
in `apm-sniffer/apm-sdk-plugin/solrj-7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/solrj/SolrClientInterceptor.java`
#### Snippet
```java
    }

    private static final String getOperatorNameWithAction(String collection, String path, String action) {
        return "solrJ/" + collection + path + "/" + action;
    }
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### RuleId[ruleID=SizeReplaceableByIsEmpty]
`str.length() == 0` can be replaced with 'str.isEmpty()'
in `apm-commons/apm-util/src/main/java/org/apache/skywalking/apm/util/StringUtil.java`
#### Snippet
```java
public final class StringUtil {
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`header.size() > 0` can be replaced with '!header.isEmpty()'
in `apm-sniffer/optional-plugins/optional-spring-plugins/spring-webflux-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/webflux/v5/DispatcherHandlerHandleMethodInterceptor.java`
#### Snippet
```java
            next = next.next();
            List<String> header = headers.get(next.getHeadKey());
            if (header != null && header.size() > 0) {
                next.setHeadValue(header.get(0));
            }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`map.size() != 0` can be replaced with '!map.isEmpty()'
in `apm-commons/apm-util/src/main/java/org/apache/skywalking/apm/util/ConfigInitializer.java`
#### Snippet
```java
                        // Set the map from config key and properties
                        Map map = readMapType(type, configKey, properties, keyType, valueType);
                        if (map.size() != 0) {
                            field.set(null, map);
                        }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`header.size() > 0` can be replaced with '!header.isEmpty()'
in `apm-sniffer/optional-plugins/shenyu-2.4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/shenyu/v24x/GlobalPluginExecuteMethodInterceptor.java`
#### Snippet
```java
            next = next.next();
            List<String> header = headers.get(next.getHeadKey());
            if (header != null && header.size() > 0) {
                next.setHeadValue(header.get(0));
            }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`requestPath.length() > 0` can be replaced with '!requestPath.isEmpty()'
in `apm-sniffer/apm-sdk-plugin/httpclient-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/httpclient/v5/HttpClientDoExecuteInterceptor.java`
#### Snippet
```java
        if (isUrl(uri)) {
            String requestPath = new URL(uri).getPath();
            return requestPath != null && requestPath.length() > 0 ? requestPath : "/";
        } else {
            return uri;
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`method.length() == 0` can be replaced with 'method.isEmpty()'
in `apm-sniffer/apm-sdk-plugin/jetty-plugin/jetty-client-9.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jetty/v9/client/SyncHttpRequestSendInterceptor.java`
#### Snippet
```java
        String method = request.getMethod();

        if (method == null || method.length() == 0) {
            method = "GET";
        }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`contactPoints.length() > 0` can be replaced with '!contactPoints.isEmpty()'
in `apm-sniffer/apm-sdk-plugin/cassandra-java-driver-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/cassandra/java/driver/v3/ClusterConstructorWithStateListenerArgInterceptor.java`
#### Snippet
```java

        String contactPoints = hosts.toString();
        if (contactPoints.length() > 0) {
            contactPoints = contactPoints.substring(0, contactPoints.length() - 1);
        }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`socketAddressList.size() > 0` can be replaced with '!socketAddressList.isEmpty()'
in `apm-sniffer/apm-sdk-plugin/canal-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/canal/CanalInterceptor.java`
#### Snippet
```java
            List<InetSocketAddress> socketAddressList = (List<InetSocketAddress>) ContextManager.getRuntimeContext()
                                                                                                .get("currentAddress");
            if (socketAddressList != null && socketAddressList.size() > 0) {
                for (InetSocketAddress socketAddress : socketAddressList) {
                    String currentAddress = socketAddress.getAddress().toString() + ":" + socketAddress.getPort();
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`operationName.length() == 0` can be replaced with 'operationName.isEmpty()'
in `apm-sniffer/apm-sdk-plugin/feign-default-http-9.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/feign/http/v9/LoadBalancerHttpClientInterceptor.java`
#### Snippet
```java
            }
        }
        if (operationName.length() == 0) {
            operationName = "/";
        }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`operationName.length() == 0` can be replaced with 'operationName.isEmpty()'
in `apm-sniffer/apm-sdk-plugin/feign-default-http-9.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/feign/http/v9/DefaultHttpClientInterceptor.java`
#### Snippet
```java
            }
        }
        if (operationName.length() == 0) {
            operationName = "/";
        }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`pluginDefines.size() > 0` can be replaced with '!pluginDefines.isEmpty()'
in `apm-sniffer/apm-agent/src/main/java/org/apache/skywalking/apm/agent/SkyWalkingAgent.java`
#### Snippet
```java
            LoadedLibraryCollector.registerURLClassLoader(classLoader);
            List<AbstractClassEnhancePluginDefine> pluginDefines = pluginFinder.find(typeDescription);
            if (pluginDefines.size() > 0) {
                DynamicType.Builder<?> newBuilder = builder;
                EnhanceContext context = new EnhanceContext();
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`requestPath.length() > 0` can be replaced with '!requestPath.isEmpty()'
in `apm-sniffer/apm-sdk-plugin/httpClient-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/httpClient/v4/HttpClientExecuteInterceptor.java`
#### Snippet
```java
        if (isUrl(uri)) {
            String requestPath = new URL(uri).getPath();
            return requestPath != null && requestPath.length() > 0 ? requestPath : "/";
        } else {
            return uri;
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`records.size() > 0` can be replaced with '!records.isEmpty()'
in `apm-sniffer/apm-sdk-plugin/kafka-plugin/src/main/java/org/apache/skywalking/apm/plugin/kafka/KafkaConsumerInterceptor.java`
#### Snippet
```java
        // The entry span will only be created when the consumer received at least one message.
        //
        if (records.size() > 0) {
            ConsumerEnhanceRequiredInfo requiredInfo = (ConsumerEnhanceRequiredInfo) objInst.getSkyWalkingDynamicField();
            KafkaContext context = (KafkaContext) ContextManager.getRuntimeContext().get(Constants.KAFKA_FLAG);
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`prefixMatches.size() == 0` can be replaced with 'prefixMatches.isEmpty()'
in `apm-sniffer/bootstrap-plugins/jdk-threading-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdk/threading/ThreadingConfig.java`
#### Snippet
```java
        }

        if (prefixMatches.size() == 0) {
            return null;
        }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`requestPath.length() > 0` can be replaced with '!requestPath.isEmpty()'
in `apm-sniffer/apm-sdk-plugin/httpclient-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/httpclient/v3/HttpClientExecuteInterceptor.java`
#### Snippet
```java
    private String getRequestURI(URI uri) throws URIException {
        String requestPath = uri.getPath();
        return requestPath != null && requestPath.length() > 0 ? requestPath : "/";
    }

```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`requestPath.length() > 0` can be replaced with '!requestPath.isEmpty()'
in `apm-sniffer/apm-sdk-plugin/spring-plugins/spring-webflux-5.x-webclient-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/webflux/v5/webclient/WebFluxWebClientInterceptor.java`
#### Snippet
```java
    private String getRequestURIString(URI uri) {
        String requestPath = uri.getPath();
        return requestPath != null && requestPath.length() > 0 ? requestPath : "/";
    }

```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`allIPV4.size() > 0` can be replaced with '!allIPV4.isEmpty()'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/os/OSUtil.java`
#### Snippet
```java
        }
        List<String> allIPV4 = getAllIPV4();
        if (allIPV4.size() > 0) {
            if (allIPV4.size() > ipv4Size) {
                allIPV4 = allIPV4.subList(0, ipv4Size);
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`allIPV4.size() > 0` can be replaced with '!allIPV4.isEmpty()'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/os/OSUtil.java`
#### Snippet
```java
    public static String getIPV4() {
        final List<String> allIPV4 = getAllIPV4();
        if (allIPV4.size() > 0) {
            return allIPV4.get(0);
        } else {
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`buffer.size() > 0` can be replaced with '!buffer.isEmpty()'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/jvm/JVMMetricsSender.java`
#### Snippet
```java
                LinkedList<JVMMetric> buffer = new LinkedList<>();
                queue.drainTo(buffer);
                if (buffer.size() > 0) {
                    builder.addAllMetrics(buffer);
                    builder.setService(Config.Agent.SERVICE_NAME);
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`pluginDefine.trim().length() == 0` can be replaced with 'pluginDefine.trim().isEmpty()'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/PluginCfg.java`
#### Snippet
```java
            while ((pluginDefine = reader.readLine()) != null) {
                try {
                    if (pluginDefine.trim().length() == 0 || pluginDefine.startsWith("#")) {
                        continue;
                    }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`resources.size() == 0` can be replaced with 'resources.isEmpty()'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/PluginBootstrap.java`
#### Snippet
```java
        List<URL> resources = resolver.getResources();

        if (resources == null || resources.size() == 0) {
            LOGGER.info("no plugin files (skywalking-plugin.def) found, continue to start application.");
            return new ArrayList<AbstractClassEnhancePluginDefine>();
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`parentTypes.size() == 0` can be replaced with 'parentTypes.isEmpty()'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/match/HierarchyMatch.java`
#### Snippet
```java
    private void matchHierarchyClass(TypeDescription.Generic clazz, List<String> parentTypes) {
        parentTypes.remove(clazz.asRawType().getTypeName());
        if (parentTypes.size() == 0) {
            return;
        }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`parentTypes.size() == 0` can be replaced with 'parentTypes.isEmpty()'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/match/HierarchyMatch.java`
#### Snippet
```java
        }

        return parentTypes.size() == 0;

    }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`bootstrapClassMatchDefines.size() > 0` can be replaced with '!bootstrapClassMatchDefines.isEmpty()'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/bootstrap/BootstrapInstrumentBoost.java`
#### Snippet
```java
            }
        }
        return bootstrapClassMatchDefines.size() > 0;
    }

```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`bootstrapClassMatchDefines.size() > 0` can be replaced with '!bootstrapClassMatchDefines.isEmpty()'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/bootstrap/BootstrapInstrumentBoost.java`
#### Snippet
```java
            }
        }
        return bootstrapClassMatchDefines.size() > 0;
    }

```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`grpcServers.size() > 0` can be replaced with '!grpcServers.isEmpty()'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/remote/GRPCChannelManager.java`
#### Snippet
```java

        if (reconnect) {
            if (grpcServers.size() > 0) {
                String server = "";
                try {
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`Config.Collector.BACKEND_SERVICE.trim().length() == 0` can be replaced with 'Config.Collector.BACKEND_SERVICE.trim().isEmpty()'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/remote/GRPCChannelManager.java`
#### Snippet
```java
    @Override
    public void boot() {
        if (Config.Collector.BACKEND_SERVICE.trim().length() == 0) {
            LOGGER.error("Collector server addresses are not set.");
            LOGGER.error("Agent will not uplink any data.");
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`pattern.length() == 0` can be replaced with 'pattern.isEmpty()'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/Parser.java`
#### Snippet
```java

    public Parser(String pattern, Map<String, Class<? extends Converter>> convertMaps) {
        if (pattern == null || pattern.length() == 0) {
            throw new IllegalArgumentException("null or empty pattern string not allowed");
        }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`operationName.length() == 0` can be replaced with 'operationName.isEmpty()'
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/BaseTraceAnnotationInterceptor.java`
#### Snippet
```java
        Trace trace = method.getAnnotation(Trace.class);
        String operationName = trace.operationName();
        if (operationName.length() == 0 || ToolkitPluginConfig.Plugin.Toolkit.USE_QUALIFIED_NAME_AS_OPERATION_NAME) {
            operationName = MethodUtil.generateOperationName(method);
        }
```

## RuleId[ruleID=StringBufferReplaceableByString]
### RuleId[ruleID=StringBufferReplaceableByString]
`StringBuilder requestURL` can be replaced with 'String'
in `apm-sniffer/apm-sdk-plugin/dubbo-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo3/DubboInterceptor.java`
#### Snippet
```java
     */
    private String generateRequestURL(URL url, Invocation invocation) {
        StringBuilder requestURL = new StringBuilder();
        requestURL.append(url.getProtocol() + "://");
        requestURL.append(url.getHost());
```

### RuleId[ruleID=StringBufferReplaceableByString]
`StringBuilder requestURL` can be replaced with 'String'
in `apm-sniffer/apm-sdk-plugin/dubbo-2.7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo/DubboInterceptor.java`
#### Snippet
```java
     */
    private String generateRequestURL(URL url, Invocation invocation) {
        StringBuilder requestURL = new StringBuilder();
        requestURL.append(url.getProtocol() + "://");
        requestURL.append(url.getHost());
```

### RuleId[ruleID=StringBufferReplaceableByString]
`StringBuilder operationName` can be replaced with 'String'
in `apm-sniffer/apm-sdk-plugin/baidu-brpc-plugin/src/main/java/org/apache/skywalking/apm/plugin/baidu/brpc/ServerInterceptor.java`
#### Snippet
```java

    private static String generateOperationName(Request request) {
        StringBuilder operationName = new StringBuilder(request.getServiceName());
        operationName.append(".").append(request.getMethodName());
        return operationName.toString();
```

### RuleId[ruleID=StringBufferReplaceableByString]
`StringBuilder operationName` can be replaced with 'String'
in `apm-sniffer/apm-sdk-plugin/baidu-brpc-plugin/src/main/java/org/apache/skywalking/apm/plugin/baidu/brpc/ClientInterceptor.java`
#### Snippet
```java

    private String generateOperationName(Request request) {
        StringBuilder operationName = new StringBuilder();
        operationName.append(request.getServiceName() + "." + request.getMethodName());
        return operationName.toString();
```

### RuleId[ruleID=StringBufferReplaceableByString]
`StringBuilder requestURL` can be replaced with 'String'
in `apm-sniffer/apm-sdk-plugin/sofarpc-plugin/src/main/java/org/apache/skywalking/apm/plugin/sofarpc/SofaRpcConsumerInterceptor.java`
#### Snippet
```java
     */
    private String generateRequestURL(ProviderInfo providerInfo, SofaRequest sofaRequest) {
        StringBuilder requestURL = new StringBuilder();
        requestURL.append(providerInfo.getProtocolType()).append("://");
        requestURL.append(providerInfo.getHost());
```

### RuleId[ruleID=StringBufferReplaceableByString]
`StringBuilder operationName` can be replaced with 'String'
in `apm-sniffer/apm-sdk-plugin/baidu-brpc-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/baidu/brpc3/ServerInterceptor.java`
#### Snippet
```java
public class ServerInterceptor implements InstanceMethodsAroundInterceptor {
    private static String generateOperationName(Request request) {
        StringBuilder operationName = new StringBuilder(request.getServiceName());
        operationName.append(".").append(request.getMethodName());
        return operationName.toString();
```

### RuleId[ruleID=StringBufferReplaceableByString]
`StringBuilder operationName` can be replaced with 'String'
in `apm-sniffer/apm-sdk-plugin/baidu-brpc-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/baidu/brpc3/ClientInterceptor.java`
#### Snippet
```java

    private String generateOperationName(Request request) {
        StringBuilder operationName = new StringBuilder();
        operationName.append(request.getServiceName() + "." + request.getMethodName());
        return operationName.toString();
```

### RuleId[ruleID=StringBufferReplaceableByString]
`StringBuilder` can be replaced with 'String'
in `apm-sniffer/apm-sdk-plugin/motan-plugin/src/main/java/org/apache/skywalking/apm/plugin/motan/MotanConsumerInterceptor.java`
#### Snippet
```java
     */
    private static String generateOperationName(URL serviceURI, Request request) {
        return new StringBuilder(serviceURI.getPath()).append(".")
                                                      .append(request.getMethodName())
                                                      .append("(")
```

### RuleId[ruleID=StringBufferReplaceableByString]
`StringBuilder viewPoint` can be replaced with 'String'
in `apm-sniffer/apm-sdk-plugin/motan-plugin/src/main/java/org/apache/skywalking/apm/plugin/motan/MotanProviderInterceptor.java`
#### Snippet
```java

    private static String generateViewPoint(Request request) {
        StringBuilder viewPoint = new StringBuilder(request.getInterfaceName());
        viewPoint.append("." + request.getMethodName());
        viewPoint.append("(" + request.getParamtersDesc() + ")");
```

### RuleId[ruleID=StringBufferReplaceableByString]
`StringBuilder buff` can be replaced with 'String'
in `apm-sniffer/apm-sdk-plugin/httpclient-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/httpclient/v5/HttpClientDoExecuteInterceptor.java`
#### Snippet
```java
            return uri;
        } else {
            StringBuilder buff = new StringBuilder();
            buff.append(httpHost.getSchemeName().toLowerCase());
            buff.append("://");
```

### RuleId[ruleID=StringBufferReplaceableByString]
`StringBuilder buff` can be replaced with 'String'
in `apm-sniffer/apm-sdk-plugin/httpClient-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/httpClient/v4/HttpClientExecuteInterceptor.java`
#### Snippet
```java
            return uri;
        } else {
            StringBuilder buff = new StringBuilder();
            buff.append(httpHost.getSchemeName().toLowerCase());
            buff.append("://");
```

### RuleId[ruleID=StringBufferReplaceableByString]
`StringBuilder` can be replaced with 'String'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/conf/dynamic/ConfigurationDiscoveryService.java`
#### Snippet
```java
            register.forEach((key, holderList) -> {
                for (WatcherHolder holder : holderList) {
                    registerTableDescription.add(new StringBuilder().append("key:")
                            .append(key)
                            .append("value(current):")
```

### RuleId[ruleID=StringBufferReplaceableByString]
`StringBuilder requestURL` can be replaced with 'String'
in `apm-sniffer/apm-sdk-plugin/dubbo-plugin/src/main/java/org/apache/skywalking/apm/plugin/dubbo/DubboInterceptor.java`
#### Snippet
```java
     */
    private String generateRequestURL(URL url, Invocation invocation) {
        StringBuilder requestURL = new StringBuilder();
        requestURL.append(url.getProtocol() + "://");
        requestURL.append(url.getHost());
```

## RuleId[ruleID=UnnecessaryReturn]
### RuleId[ruleID=UnnecessaryReturn]
`return` is unnecessary as the last statement in a 'void' method
in `apm-sniffer/apm-sdk-plugin/elasticsearch-6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v6/interceptor/TransportActionNodeProxyExecuteMethodsInterceptor.java`
#### Snippet
```java
        if (request instanceof DeleteIndexRequest) {
            parseDeleteIndexRequest((DeleteIndexRequest) request, span);
            return;
        }
    }
```

### RuleId[ruleID=UnnecessaryReturn]
`return` is unnecessary as the last statement in a 'void' method
in `apm-sniffer/apm-sdk-plugin/elasticsearch-6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v6/interceptor/AdapterActionFutureActionGetMethodsInterceptor.java`
#### Snippet
```java
        if (response instanceof DeleteResponse) {
            parseDeleteResponse((DeleteResponse) response, span);
            return;
        }
    }
```

### RuleId[ruleID=UnnecessaryReturn]
`return` is unnecessary as the last statement in a 'void' method
in `apm-sniffer/apm-sdk-plugin/elasticsearch-7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v7/interceptor/AdapterActionFutureActionGetMethodsInterceptor.java`
#### Snippet
```java
        if (response instanceof DeleteResponse) {
            parseDeleteResponse((DeleteResponse) response, span);
            return;
        }
    }
```

### RuleId[ruleID=UnnecessaryReturn]
`return` is unnecessary as the last statement in a 'void' method
in `apm-commons/apm-datacarrier/src/main/java/org/apache/skywalking/apm/commons/datacarrier/consumer/IConsumer.java`
#### Snippet
```java
     */
    default void nothingToConsume() {
        return;
    }
}
```

## RuleId[ruleID=TrivialStringConcatenation]
### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/os/OSUtil.java`
#### Snippet
```java
            }
        }
        osInfo.add(KeyStringValuePair.newBuilder().setKey("Process No.").setValue(getProcessNo() + "").build());
        osInfo.add(KeyStringValuePair.newBuilder().setKey("language").setValue("java").build());
        return osInfo;
```

### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/ContextCarrier.java`
#### Snippet
```java
                Base64.encode(this.getTraceId()),
                Base64.encode(this.getTraceSegmentId()),
                this.getSpanId() + "",
                Base64.encode(this.getParentService()),
                Base64.encode(this.getParentServiceInstance()),
```

## RuleId[ruleID=FinalStaticMethod]
### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `apm-sniffer/apm-sdk-plugin/thrift-plugin/src/main/java/org/apache/skywalking/apm/plugin/thrift/commons/ReflectionUtils.java`
#### Snippet
```java
public class ReflectionUtils {

    public static final void setValue(Class klass, Object instance, String name, Object value) throws NoSuchFieldException, IllegalAccessException {
        Field field = klass.getDeclaredField(name);
        field.setAccessible(true);
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `apm-sniffer/apm-sdk-plugin/thrift-plugin/src/main/java/org/apache/skywalking/apm/plugin/thrift/commons/ReflectionUtils.java`
#### Snippet
```java
    }

    public static final Object getValue(Class klass, Object instance, String name) throws NoSuchFieldException, IllegalAccessException {
        Field field = klass.getDeclaredField(name);
        field.setAccessible(true);
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `apm-sniffer/apm-sdk-plugin/solrj-7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/solrj/SolrClientInterceptor.java`
#### Snippet
```java
    }

    private static final String toQueryString(SolrParams params) {
        final StringBuilder sb = new StringBuilder(128);
        boolean first = true;
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `apm-sniffer/apm-sdk-plugin/solrj-7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/solrj/SolrClientInterceptor.java`
#### Snippet
```java
    }

    private static final String getOperatorName(String collection, String path) {
        return "solrJ/" + collection + path;
    }
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `apm-sniffer/apm-sdk-plugin/solrj-7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/solrj/SolrClientInterceptor.java`
#### Snippet
```java
    }

    private static final AbstractSpan getSpan(String operatorName, String remotePeer) {
        return ContextManager.createExitSpan(operatorName, remotePeer)
                             .setComponent(ComponentsDefine.SOLRJ)
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `apm-sniffer/apm-sdk-plugin/solrj-7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/solrj/SolrClientInterceptor.java`
#### Snippet
```java
    }

    private static final SolrParams getParams(SolrParams params) {
        if (params == null) {
            return new ModifiableSolrParams();
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `apm-sniffer/apm-sdk-plugin/solrj-7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/solrj/SolrClientInterceptor.java`
#### Snippet
```java
    }

    private static final String getCollection(SolrjInstance instance, Object argument) {
        if (null == argument) {
            return instance.getCollection();
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `apm-sniffer/apm-sdk-plugin/solrj-7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/solrj/SolrClientInterceptor.java`
#### Snippet
```java
    }

    private static final String getOperatorNameWithAction(String collection, String path, String action) {
        return "solrJ/" + collection + path + "/" + action;
    }
```

## RuleId[ruleID=ManualMinMaxCalculation]
### RuleId[ruleID=ManualMinMaxCalculation]
Can be replaced with 'Math.max()' call
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/define/StatementEnhanceInfos.java`
#### Snippet
```java

    public void setParameter(int index, final Object parameter) {
        maxIndex = maxIndex > index ? maxIndex : index;
        index--; // start from 1
        if (parameters == null) {
```

### RuleId[ruleID=ManualMinMaxCalculation]
Can be replaced with 'Math.max()' call
in `apm-application-toolkit/apm-toolkit-micrometer-registry/src/main/java/org/apache/skywalking/apm/meter/micrometer/SkywalkingTimer.java`
#### Snippet
```java
        this.counter = MeterBuilder.buildCounter(meterId.copyTo(baseName + "_count", MeterId.MeterType.COUNTER), config);
        this.sum = MeterBuilder.buildCounter(meterId.copyTo(baseName + "_sum", MeterId.MeterType.COUNTER), config);
        this.maxAdder = new DoubleAccumulator((a, b) -> a > b ? a : b, 0.000);
        this.max = MeterFactory.gauge(meterId.copyTo(baseName + "_max", MeterId.MeterType.GAUGE),
            () -> maxAdder.doubleValue()).build();
```

### RuleId[ruleID=ManualMinMaxCalculation]
Can be replaced with 'Math.max()' call
in `apm-application-toolkit/apm-toolkit-micrometer-registry/src/main/java/org/apache/skywalking/apm/meter/micrometer/SkywalkingDistributionSummary.java`
#### Snippet
```java
        this.counter = MeterBuilder.buildCounter(meterId.copyTo(baseName + "_count", MeterId.MeterType.COUNTER), config);
        this.sum = MeterBuilder.buildCounter(meterId.copyTo(baseName + "_sum", MeterId.MeterType.COUNTER), config);
        this.maxAdder = new DoubleAccumulator((a, b) -> a > b ? a : b, 0.000);
        this.max = MeterFactory.gauge(meterId.copyTo(baseName + "_max", MeterId.MeterType.GAUGE),
            () -> maxAdder.doubleValue()).build();
```

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Map.Entry`
in `apm-sniffer/apm-sdk-plugin/vertx-plugins/vertx-core-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/vertx4/SWVertxTracer.java`
#### Snippet
```java
    }

    private ContextCarrier getContextCarrier(Iterable<Map.Entry<String, String>> headers) {
        Map<String, String> headerMap = new HashMap<>();
        headers.forEach(it -> headerMap.put(it.getKey(), it.getValue()));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `apm-sniffer/apm-sdk-plugin/vertx-plugins/vertx-core-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/vertx4/SWVertxTracer.java`
#### Snippet
```java
    }

    private AbstractSpan toExitAsyncSpan(Context context, BiConsumer<String, String> headers,
                                         ContextCarrier contextCarrier, AbstractSpan span) {
        ContextManager.inject(contextCarrier);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `apm-sniffer/apm-sdk-plugin/vertx-plugins/vertx-core-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/vertx4/SWVertxTracer.java`
#### Snippet
```java
    }

    private AbstractSpan toExitAsyncSpan(Context context, BiConsumer<String, String> headers,
                                         ContextCarrier contextCarrier, AbstractSpan span) {
        ContextManager.inject(contextCarrier);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `apm-sniffer/apm-sdk-plugin/httpasyncclient-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/httpasyncclient/v4/wrapper/FutureCallbackWrapper.java`
#### Snippet
```java
    private FutureCallback<T> callback;

    public FutureCallbackWrapper(FutureCallback<T> callback) {
        this.callback = callback;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `apm-sniffer/apm-sdk-plugin/httpasyncclient-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/httpasyncclient/v4/wrapper/HttpAsyncResponseConsumerWrapper.java`
#### Snippet
```java
    private HttpAsyncResponseConsumer<T> consumer;

    public HttpAsyncResponseConsumerWrapper(HttpAsyncResponseConsumer<T> consumer) {
        this.consumer = consumer;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Rawable`
in `apm-sniffer/apm-sdk-plugin/jedis-plugins/jedis-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jedis/v4/AbstractConnectionInterceptor.java`
#### Snippet
```java
    }

    private Optional<String> readKeyIfNecessary(Iterator<Rawable> iterator) {
        if (JedisPluginConfig.Plugin.Jedis.TRACE_REDIS_PARAMETERS && iterator.hasNext()) {
            Rawable rawable = iterator.next();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `apm-commons/apm-util/src/main/java/org/apache/skywalking/apm/util/StringUtil.java`
#### Snippet
```java
    }

    public static void setIfPresent(String value, Consumer<String> setter) {
        if (isNotEmpty(value)) {
            setter.accept(value);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `apm-application-toolkit/apm-toolkit-trace/src/main/java/org/apache/skywalking/apm/toolkit/trace/CallableWrapper.java`
#### Snippet
```java
    }

    public CallableWrapper(Callable<V> callable) {
        this.callable = callable;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super V`
in `apm-application-toolkit/apm-toolkit-trace/src/main/java/org/apache/skywalking/apm/toolkit/trace/ConsumerWrapper.java`
#### Snippet
```java
    final Consumer<V> consumer;

    public ConsumerWrapper(Consumer<V> consumer) {
        this.consumer = consumer;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `apm-application-toolkit/apm-toolkit-trace/src/main/java/org/apache/skywalking/apm/toolkit/trace/FunctionWrapper.java`
#### Snippet
```java
    final Function<T, R> function;

    public FunctionWrapper(Function<T, R> function) {
        this.function = function;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends R`
in `apm-application-toolkit/apm-toolkit-trace/src/main/java/org/apache/skywalking/apm/toolkit/trace/FunctionWrapper.java`
#### Snippet
```java
    final Function<T, R> function;

    public FunctionWrapper(Function<T, R> function) {
        this.function = function;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `apm-commons/apm-util/src/main/java/org/apache/skywalking/apm/util/PropertyPlaceholderHelper.java`
#### Snippet
```java

    protected String parseStringValue(String value, PlaceholderResolver placeholderResolver,
                                      Set<String> visitedPlaceholders) {

        StringBuilder result = new StringBuilder(value);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `apm-application-toolkit/apm-toolkit-trace/src/main/java/org/apache/skywalking/apm/toolkit/trace/SupplierWrapper.java`
#### Snippet
```java
    }

    public SupplierWrapper(Supplier<V> supplier) {
        this.supplier = supplier;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `apm-sniffer/apm-sdk-plugin/hystrix-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/hystrix/v1/SWHystrixConcurrencyStrategyWrapper.java`
#### Snippet
```java
        private final Callable<T> target;

        WrappedCallable(RuntimeContextSnapshot contextSnapshot, Callable<T> target) {
            this.contextSnapshot = contextSnapshot;
            this.target = target;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AsyncProcessFunction`
in `apm-sniffer/apm-sdk-plugin/thrift-plugin/src/main/java/org/apache/skywalking/apm/plugin/thrift/wrapper/AsyncContext.java`
#### Snippet
```java
    private final Map<String, AsyncProcessFunction> processMapView;

    public AsyncContext(Map<String, AsyncProcessFunction> processMapView) {
        this.processMapView = processMapView;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ProcessFunction`
in `apm-sniffer/apm-sdk-plugin/thrift-plugin/src/main/java/org/apache/skywalking/apm/plugin/thrift/wrapper/Context.java`
#### Snippet
```java
    private final Map<String, ProcessFunction> processMapView;

    public Context(Map<String, ProcessFunction> processMapView) {
        this.processMapView = processMapView;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `apm-commons/apm-datacarrier/src/main/java/org/apache/skywalking/apm/commons/datacarrier/buffer/Buffer.java`
#### Snippet
```java
    }

    void obtain(List<T> consumeList, int start, int end) {
        for (int i = start; i < end; i++) {
            if (buffer[i] != null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `apm-commons/apm-datacarrier/src/main/java/org/apache/skywalking/apm/commons/datacarrier/buffer/ArrayBlockingQueueBuffer.java`
#### Snippet
```java

    @Override
    public void obtain(List<T> consumeList) {
        queue.drainTo(consumeList);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `apm-commons/apm-datacarrier/src/main/java/org/apache/skywalking/apm/commons/datacarrier/buffer/Channels.java`
#### Snippet
```java
    private final long size;

    public Channels(int channelSize, int bufferSize, IDataPartitioner<T> partitioner, BufferStrategy strategy) {
        this.dataPartitioner = partitioner;
        this.strategy = strategy;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `apm-commons/apm-datacarrier/src/main/java/org/apache/skywalking/apm/commons/datacarrier/buffer/Channels.java`
#### Snippet
```java
    }

    public void setPartitioner(IDataPartitioner<T> dataPartitioner) {
        this.dataPartitioner = dataPartitioner;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ConsumerPool`
in `apm-commons/apm-datacarrier/src/main/java/org/apache/skywalking/apm/commons/datacarrier/consumer/ConsumerPoolFactory.java`
#### Snippet
```java
    }

    public synchronized boolean createIfAbsent(String poolName, Callable<ConsumerPool> creator) throws Exception {
        if (pools.containsKey(poolName)) {
            return false;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Method`
in `apm-sniffer/apm-sdk-plugin/spring-plugins/mvc-annotation-commons/src/main/java/org/apache/skywalking/apm/plugin/spring/mvc/commons/ParsePathUtil.java`
#### Snippet
```java

    private static String recursiveMatches(Class clazz, String methodName, Parameter[] parameters,
        Function<Method, String> parseFunc) {
        Class<?>[] interfaces = clazz.getInterfaces();
        for (Class<?> implInterface : interfaces) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `apm-sniffer/apm-sdk-plugin/httpclient-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/httpclient/v5/wrapper/FutureCallbackWrapper.java`
#### Snippet
```java
    private FutureCallback<T> callback;

    public FutureCallbackWrapper(FutureCallback<T> callback) {
        this.callback = callback;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `apm-sniffer/apm-sdk-plugin/spring-plugins/async-annotation-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/async/SWCallable.java`
#### Snippet
```java
    private ContextSnapshot snapshot;

    SWCallable(Callable<V> callable, ContextSnapshot snapshot) {
        this.callable = callable;
        this.snapshot = snapshot;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AbstractSpan`
in `apm-sniffer/apm-sdk-plugin/micronaut-plugins/micronaut-http-client-plugin/src/main/java/org/apache/skywalking/apm/plugin/micronaut/http/client/MicronautCommons.java`
#### Snippet
```java
    }

    static void finish(MutableHttpRequest<?> request, Consumer<AbstractSpan> action) {
        try {
            request.getAttribute(SPAN_KEY)
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Signal`
in `apm-application-toolkit/apm-toolkit-webflux/src/main/java/org/apache/skywalking/apm/toolkit/webflux/WebFluxSkyWalkingOperators.java`
#### Snippet
```java
     * @return consumer of a signal
     */
    public static Consumer<Signal> continueTracing(SignalType signalType, Consumer<Signal> consumer) {
        return signal -> {
            if (signalType != signal.getType()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ILoggingEvent`
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-logback-1.x-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/log/logback/v1/x/log/GRPCLogAppenderInterceptor.java`
#### Snippet
```java
    }

    private String transformLogText(final OutputStreamAppender<ILoggingEvent> appender, final ILoggingEvent event) {
        if (ToolkitConfig.Plugin.Toolkit.Log.TRANSMIT_FORMATTED) {
            return new String(appender.getEncoder().encode(event));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/conf/MethodConfiguration.java`
#### Snippet
```java
    }

    static void setMethod(Map<String, Object> configuration, String method) {
        configuration.put(Constants.CONFIGURATION_ATTRIBUTE_METHOD, method);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/conf/MethodConfiguration.java`
#### Snippet
```java
    }

    static void setArguments(Map<String, Object> configuration, String[] arguments) {
        configuration.put(Constants.CONFIGURATION_ATTRIBUTE_ARGUMENTS, arguments);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/conf/MethodConfiguration.java`
#### Snippet
```java
    }

    static void setStatic(Map<String, Object> configuration, Boolean isStatic) {
        configuration.put(Constants.CONFIGURATION_ATTRIBUTE_IS_STATIC, isStatic);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/conf/MethodConfiguration.java`
#### Snippet
```java
    }

    static void setOperationName(Map<String, Object> configuration, String operationName) {
        configuration.put(Constants.CONFIGURATION_ATTRIBUTE_OPERATION_NAME, operationName);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/conf/MethodConfiguration.java`
#### Snippet
```java
    }

    static void setMethodName(Map<String, Object> configuration, String methodName) {
        configuration.put(Constants.CONFIGURATION_ATTRIBUTE_METHOD_NAME, methodName);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/conf/MethodConfiguration.java`
#### Snippet
```java
    }

    static void setClz(Map<String, Object> configuration, String className) {
        configuration.put(Constants.CONFIGURATION_ATTRIBUTE_CLZ, className);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/conf/MethodConfiguration.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    static void addTag(Map<String, Object> configuration, String key, String value) {
        Map<String, String> tags = (Map<String, String>) configuration.get(Constants.CONFIGURATION_ATTRIBUTE_TAGS);
        if (tags == null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/conf/MethodConfiguration.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    static void addLog(Map<String, Object> configuration, String key, String value) {
        Map<String, String> logs = (Map<String, String>) configuration.get(Constants.CONFIGURATION_ATTRIBUTE_LOGS);
        if (logs == null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/conf/MethodConfiguration.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    static void addOperationNameSuffixes(Map<String, Object> configuration, String suffix) {
        List<String> suffixes = (List<String>) configuration.get(Constants.CONFIGURATION_ATTRIBUTE_OPERATION_NAME_SUFFIXES);
        if (suffixes == null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/interceptor/BaseInterceptorMethods.java`
#### Snippet
```java

    private void evalAndPopulate(Map<String, Object> context, boolean returnExpr, Map<String, String> exprMap,
        Map<String, String> toMap) {
        if (exprMap != null && !exprMap.isEmpty()) {
            for (Map.Entry<String, String> entry : exprMap.entrySet()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/interceptor/BaseInterceptorMethods.java`
#### Snippet
```java

    private void evalAndPopulate(Map<String, Object> context, boolean returnExpr, Map<String, String> exprMap,
        Map<String, String> toMap) {
        if (exprMap != null && !exprMap.isEmpty()) {
            for (Map.Entry<String, String> entry : exprMap.entrySet()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Map`
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/conf/CustomizeConfiguration.java`
#### Snippet
```java
     * @param customizeMethods of memory address, the element {@link MethodConfiguration}.
     */
    private void resolverClassNodeList(NodeList classNodeList, List<Map<String, Object>> customizeMethods) {
        for (int ec = 0; ec < classNodeList.getLength(); ec++) {
            Node classDesc = classNodeList.item(ec);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super BootService`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/boot/ServiceManager.java`
#### Snippet
```java
    }

    void load(List<BootService> allServices) {
        for (final BootService bootService : ServiceLoader.load(BootService.class, AgentClassLoader.getDefault())) {
            allServices.add(bootService);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AbstractClassEnhancePluginDefine`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/PluginFinder.java`
#### Snippet
```java
    private static boolean IS_PLUGIN_INIT_COMPLETED = false;

    public PluginFinder(List<AbstractClassEnhancePluginDefine> plugins) {
        for (AbstractClassEnhancePluginDefine plugin : plugins) {
            ClassMatch match = plugin.enhanceClass();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/bootstrap/BootstrapInstrumentBoost.java`
#### Snippet
```java
     * @param className     to load
     */
    private static void loadHighPriorityClass(Map<String, byte[]> loadedTypeMap,
        String className) throws PluginException {
        byte[] enhancedInstanceClassFile;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/bootstrap/BootstrapInstrumentBoost.java`
#### Snippet
```java
     *                          pre-defined in SkyWalking agent core.
     */
    private static void generateDelegator(Map<String, byte[]> classesTypeMap, TypePool typePool,
        String templateClassName, String methodsInterceptor) {
        String internalInterceptorName = internalDelegate(methodsInterceptor);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Converter`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/Parser.java`
#### Snippet
```java
    }

    private void addConverter(StringBuilder buf, List<Converter> patternConverters, Class<? extends Converter> aClass) {
        if (buf.length() > 0) {
            String result = buf.toString();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Converter`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/Parser.java`
#### Snippet
```java
    }

    private List<Converter> combineLiteral(List<Converter> patternConverters) {
        List<Converter> converterList = new ArrayList<Converter>();
        StringBuilder stringBuilder = new StringBuilder();
```

## RuleId[ruleID=MissortedModifiers]
### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `apm-sniffer/apm-sdk-plugin/guava-eventbus-plugin/src/main/java/org/apache/skywalking/apm/plugin/guava/eventbus/define/EventBusSubscriberInstrumentation.java`
#### Snippet
```java
    private final static String INVOKE_METHOD_NAME = "invokeSubscriberMethod";
    private final static String INVOKE_METHOD_INTERCEPTOR = "org.apache.skywalking.apm.plugin.guava.eventbus.EventBusSubscriberInterceptor";
    private final static String CONSTRUCTOR_INTERCEPTOR = "org.apache.skywalking.apm.plugin.guava.eventbus.EventBusSubscriberConstructorInterceptor";

    @Override
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `apm-sniffer/apm-sdk-plugin/guava-eventbus-plugin/src/main/java/org/apache/skywalking/apm/plugin/guava/eventbus/define/EventBusSubscriberInstrumentation.java`
#### Snippet
```java
public class EventBusSubscriberInstrumentation extends ClassInstanceMethodsEnhancePluginDefine {

    private final static String ENHANCE_CLASS = "com.google.common.eventbus.Subscriber";
    private final static String INVOKE_METHOD_NAME = "invokeSubscriberMethod";
    private final static String INVOKE_METHOD_INTERCEPTOR = "org.apache.skywalking.apm.plugin.guava.eventbus.EventBusSubscriberInterceptor";
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `apm-sniffer/apm-sdk-plugin/guava-eventbus-plugin/src/main/java/org/apache/skywalking/apm/plugin/guava/eventbus/define/EventBusSubscriberInstrumentation.java`
#### Snippet
```java

    private final static String ENHANCE_CLASS = "com.google.common.eventbus.Subscriber";
    private final static String INVOKE_METHOD_NAME = "invokeSubscriberMethod";
    private final static String INVOKE_METHOD_INTERCEPTOR = "org.apache.skywalking.apm.plugin.guava.eventbus.EventBusSubscriberInterceptor";
    private final static String CONSTRUCTOR_INTERCEPTOR = "org.apache.skywalking.apm.plugin.guava.eventbus.EventBusSubscriberConstructorInterceptor";
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `apm-sniffer/apm-sdk-plugin/guava-eventbus-plugin/src/main/java/org/apache/skywalking/apm/plugin/guava/eventbus/define/EventBusSubscriberInstrumentation.java`
#### Snippet
```java
    private final static String ENHANCE_CLASS = "com.google.common.eventbus.Subscriber";
    private final static String INVOKE_METHOD_NAME = "invokeSubscriberMethod";
    private final static String INVOKE_METHOD_INTERCEPTOR = "org.apache.skywalking.apm.plugin.guava.eventbus.EventBusSubscriberInterceptor";
    private final static String CONSTRUCTOR_INTERCEPTOR = "org.apache.skywalking.apm.plugin.guava.eventbus.EventBusSubscriberConstructorInterceptor";

```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `apm-sniffer/apm-sdk-plugin/httpasyncclient-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/httpasyncclient/v4/Constants.java`
#### Snippet
```java

    public final static String SKYWALKING_CONTEXT_SNAPSHOT = "skywalking-context-snapshot";
    public final static String SKYWALKING_HTTP_CONTEXT = "skywalking-http-context";
}

```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `apm-sniffer/apm-sdk-plugin/httpasyncclient-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/httpasyncclient/v4/Constants.java`
#### Snippet
```java
    public final static ThreadLocal<HttpContext> HTTP_CONTEXT_LOCAL = new ThreadLocal<>();

    public final static String SKYWALKING_CONTEXT_SNAPSHOT = "skywalking-context-snapshot";
    public final static String SKYWALKING_HTTP_CONTEXT = "skywalking-http-context";
}
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `apm-sniffer/apm-sdk-plugin/httpasyncclient-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/httpasyncclient/v4/Constants.java`
#### Snippet
```java
public class Constants {

    public final static ThreadLocal<HttpContext> HTTP_CONTEXT_LOCAL = new ThreadLocal<>();

    public final static String SKYWALKING_CONTEXT_SNAPSHOT = "skywalking-context-snapshot";
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `apm-sniffer/apm-sdk-plugin/neo4j-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/neo4j/v4x/define/UnmanagedTransactionInstrumentation.java`
#### Snippet
```java

    private final static String ENHANCED_CLASS = "org.neo4j.driver.internal.async.UnmanagedTransaction";
    private final static String RUN_ASYNC_METHOD_NAME = "runAsync";
    private final static String TRANSACTION_RUN_METHOD_INTERCEPTOR = "org.apache.skywalking.apm.plugin.neo4j.v4x.TransactionRunInterceptor";
    private final static String RUN_RX_METHOD_NAME = "runRx";
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `apm-sniffer/apm-sdk-plugin/neo4j-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/neo4j/v4x/define/UnmanagedTransactionInstrumentation.java`
#### Snippet
```java
    private final static String RUN_ASYNC_METHOD_NAME = "runAsync";
    private final static String TRANSACTION_RUN_METHOD_INTERCEPTOR = "org.apache.skywalking.apm.plugin.neo4j.v4x.TransactionRunInterceptor";
    private final static String RUN_RX_METHOD_NAME = "runRx";

    @Override
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `apm-sniffer/apm-sdk-plugin/neo4j-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/neo4j/v4x/define/UnmanagedTransactionInstrumentation.java`
#### Snippet
```java
    private final static String ENHANCED_CLASS = "org.neo4j.driver.internal.async.UnmanagedTransaction";
    private final static String RUN_ASYNC_METHOD_NAME = "runAsync";
    private final static String TRANSACTION_RUN_METHOD_INTERCEPTOR = "org.apache.skywalking.apm.plugin.neo4j.v4x.TransactionRunInterceptor";
    private final static String RUN_RX_METHOD_NAME = "runRx";

```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `apm-sniffer/apm-sdk-plugin/neo4j-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/neo4j/v4x/define/UnmanagedTransactionInstrumentation.java`
#### Snippet
```java
public class UnmanagedTransactionInstrumentation extends ClassInstanceMethodsEnhancePluginDefine {

    private final static String ENHANCED_CLASS = "org.neo4j.driver.internal.async.UnmanagedTransaction";
    private final static String RUN_ASYNC_METHOD_NAME = "runAsync";
    private final static String TRANSACTION_RUN_METHOD_INTERCEPTOR = "org.apache.skywalking.apm.plugin.neo4j.v4x.TransactionRunInterceptor";
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `apm-sniffer/apm-sdk-plugin/neo4j-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/neo4j/v4x/define/NetworkSessionInstrumentation.java`
#### Snippet
```java
    private final static String RUN_ASYNC_METHOD_NAME = "runAsync";
    private final static String RUN_METHOD_INTERCEPTOR = "org.apache.skywalking.apm.plugin.neo4j.v4x.SessionRunInterceptor";
    private final static String RUN_RX_METHOD_NAME = "runRx";
    private final static String ACQUIRE_CONNECTION_METHOD_NAME = "acquireConnection";
    private final static String ACQUIRE_CONNECTION_METHOD_INTERCEPTOR = "org.apache.skywalking.apm.plugin.neo4j.v4x.SessionAcquireConnectionInterceptor";
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `apm-sniffer/apm-sdk-plugin/neo4j-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/neo4j/v4x/define/NetworkSessionInstrumentation.java`
#### Snippet
```java
    private final static String CONSTRUCTOR_INTERCEPTOR = "org.apache.skywalking.apm.plugin.neo4j.v4x.SessionConstructorInterceptor";
    private final static String CONSTRUCTOR_ARGUMENT_TYPE = "org.neo4j.driver.internal.DatabaseName";
    private final static String BEGIN_TRANSACTION_METHOD_NAME = "beginTransactionAsync";
    private final static String BEGIN_TRANSACTION_ARGUMENT_TYPE = "org.neo4j.driver.AccessMode";
    private final static String BEGIN_TRANSACTION_INTERCEPTOR = "org.apache.skywalking.apm.plugin.neo4j.v4x.SessionBeginTransactionInterceptor";
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `apm-sniffer/apm-sdk-plugin/neo4j-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/neo4j/v4x/define/NetworkSessionInstrumentation.java`
#### Snippet
```java
    private final static String ACQUIRE_CONNECTION_METHOD_INTERCEPTOR = "org.apache.skywalking.apm.plugin.neo4j.v4x.SessionAcquireConnectionInterceptor";
    private final static String CONSTRUCTOR_INTERCEPTOR = "org.apache.skywalking.apm.plugin.neo4j.v4x.SessionConstructorInterceptor";
    private final static String CONSTRUCTOR_ARGUMENT_TYPE = "org.neo4j.driver.internal.DatabaseName";
    private final static String BEGIN_TRANSACTION_METHOD_NAME = "beginTransactionAsync";
    private final static String BEGIN_TRANSACTION_ARGUMENT_TYPE = "org.neo4j.driver.AccessMode";
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `apm-sniffer/apm-sdk-plugin/neo4j-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/neo4j/v4x/define/NetworkSessionInstrumentation.java`
#### Snippet
```java
public class NetworkSessionInstrumentation extends ClassInstanceMethodsEnhancePluginDefine {

    private final static String ENHANCED_CLASS = "org.neo4j.driver.internal.async.NetworkSession";
    private final static String RUN_ASYNC_METHOD_NAME = "runAsync";
    private final static String RUN_METHOD_INTERCEPTOR = "org.apache.skywalking.apm.plugin.neo4j.v4x.SessionRunInterceptor";
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `apm-sniffer/apm-sdk-plugin/neo4j-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/neo4j/v4x/define/NetworkSessionInstrumentation.java`
#### Snippet
```java
    private final static String ACQUIRE_CONNECTION_METHOD_NAME = "acquireConnection";
    private final static String ACQUIRE_CONNECTION_METHOD_INTERCEPTOR = "org.apache.skywalking.apm.plugin.neo4j.v4x.SessionAcquireConnectionInterceptor";
    private final static String CONSTRUCTOR_INTERCEPTOR = "org.apache.skywalking.apm.plugin.neo4j.v4x.SessionConstructorInterceptor";
    private final static String CONSTRUCTOR_ARGUMENT_TYPE = "org.neo4j.driver.internal.DatabaseName";
    private final static String BEGIN_TRANSACTION_METHOD_NAME = "beginTransactionAsync";
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `apm-sniffer/apm-sdk-plugin/neo4j-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/neo4j/v4x/define/NetworkSessionInstrumentation.java`
#### Snippet
```java

    private final static String ENHANCED_CLASS = "org.neo4j.driver.internal.async.NetworkSession";
    private final static String RUN_ASYNC_METHOD_NAME = "runAsync";
    private final static String RUN_METHOD_INTERCEPTOR = "org.apache.skywalking.apm.plugin.neo4j.v4x.SessionRunInterceptor";
    private final static String RUN_RX_METHOD_NAME = "runRx";
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `apm-sniffer/apm-sdk-plugin/neo4j-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/neo4j/v4x/define/NetworkSessionInstrumentation.java`
#### Snippet
```java
    private final static String BEGIN_TRANSACTION_METHOD_NAME = "beginTransactionAsync";
    private final static String BEGIN_TRANSACTION_ARGUMENT_TYPE = "org.neo4j.driver.AccessMode";
    private final static String BEGIN_TRANSACTION_INTERCEPTOR = "org.apache.skywalking.apm.plugin.neo4j.v4x.SessionBeginTransactionInterceptor";

    @Override
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `apm-sniffer/apm-sdk-plugin/neo4j-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/neo4j/v4x/define/NetworkSessionInstrumentation.java`
#### Snippet
```java
    private final static String RUN_METHOD_INTERCEPTOR = "org.apache.skywalking.apm.plugin.neo4j.v4x.SessionRunInterceptor";
    private final static String RUN_RX_METHOD_NAME = "runRx";
    private final static String ACQUIRE_CONNECTION_METHOD_NAME = "acquireConnection";
    private final static String ACQUIRE_CONNECTION_METHOD_INTERCEPTOR = "org.apache.skywalking.apm.plugin.neo4j.v4x.SessionAcquireConnectionInterceptor";
    private final static String CONSTRUCTOR_INTERCEPTOR = "org.apache.skywalking.apm.plugin.neo4j.v4x.SessionConstructorInterceptor";
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `apm-sniffer/apm-sdk-plugin/neo4j-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/neo4j/v4x/define/NetworkSessionInstrumentation.java`
#### Snippet
```java
    private final static String CONSTRUCTOR_ARGUMENT_TYPE = "org.neo4j.driver.internal.DatabaseName";
    private final static String BEGIN_TRANSACTION_METHOD_NAME = "beginTransactionAsync";
    private final static String BEGIN_TRANSACTION_ARGUMENT_TYPE = "org.neo4j.driver.AccessMode";
    private final static String BEGIN_TRANSACTION_INTERCEPTOR = "org.apache.skywalking.apm.plugin.neo4j.v4x.SessionBeginTransactionInterceptor";

```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `apm-sniffer/apm-sdk-plugin/neo4j-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/neo4j/v4x/define/NetworkSessionInstrumentation.java`
#### Snippet
```java
    private final static String RUN_RX_METHOD_NAME = "runRx";
    private final static String ACQUIRE_CONNECTION_METHOD_NAME = "acquireConnection";
    private final static String ACQUIRE_CONNECTION_METHOD_INTERCEPTOR = "org.apache.skywalking.apm.plugin.neo4j.v4x.SessionAcquireConnectionInterceptor";
    private final static String CONSTRUCTOR_INTERCEPTOR = "org.apache.skywalking.apm.plugin.neo4j.v4x.SessionConstructorInterceptor";
    private final static String CONSTRUCTOR_ARGUMENT_TYPE = "org.neo4j.driver.internal.DatabaseName";
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `apm-sniffer/apm-sdk-plugin/neo4j-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/neo4j/v4x/define/NetworkSessionInstrumentation.java`
#### Snippet
```java
    private final static String ENHANCED_CLASS = "org.neo4j.driver.internal.async.NetworkSession";
    private final static String RUN_ASYNC_METHOD_NAME = "runAsync";
    private final static String RUN_METHOD_INTERCEPTOR = "org.apache.skywalking.apm.plugin.neo4j.v4x.SessionRunInterceptor";
    private final static String RUN_RX_METHOD_NAME = "runRx";
    private final static String ACQUIRE_CONNECTION_METHOD_NAME = "acquireConnection";
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `apm-sniffer/apm-sdk-plugin/clickhouse-0.3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/clickhouse/define/ConnectionInstrumentation.java`
#### Snippet
```java
    private final static String INIT_CONNECTION_METHOD_NAME = "initConnection";
    private final static String INIT_CONNECTION_METHOD_INTERCEPTOR = "org.apache.skywalking.apm.plugin.jdbc.clickhouse.InitConnectionMethodInterceptor";
    private final static String CREATE_CLICKHOUSE_STATEMENT_METHOD_NAME = "createClickHouseStatement";
    private final static String CREATE_CLICKHOUSE_STATEMENT_INTERCEPTOR = "org.apache.skywalking.apm.plugin.jdbc.clickhouse.ClickHouseStatementMethodInterceptor";

```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `apm-sniffer/apm-sdk-plugin/clickhouse-0.3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/clickhouse/define/ConnectionInstrumentation.java`
#### Snippet
```java
    private final static String INIT_CONNECTION_METHOD_INTERCEPTOR = "org.apache.skywalking.apm.plugin.jdbc.clickhouse.InitConnectionMethodInterceptor";
    private final static String CREATE_CLICKHOUSE_STATEMENT_METHOD_NAME = "createClickHouseStatement";
    private final static String CREATE_CLICKHOUSE_STATEMENT_INTERCEPTOR = "org.apache.skywalking.apm.plugin.jdbc.clickhouse.ClickHouseStatementMethodInterceptor";

    @Override
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `apm-sniffer/apm-sdk-plugin/clickhouse-0.3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/clickhouse/define/ConnectionInstrumentation.java`
#### Snippet
```java
public class ConnectionInstrumentation extends ClassInstanceMethodsEnhancePluginDefine {

    private final static String ENHANCE_CLASS = "ru.yandex.clickhouse.ClickHouseConnectionImpl";
    private final static String INIT_CONNECTION_METHOD_NAME = "initConnection";
    private final static String INIT_CONNECTION_METHOD_INTERCEPTOR = "org.apache.skywalking.apm.plugin.jdbc.clickhouse.InitConnectionMethodInterceptor";
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `apm-sniffer/apm-sdk-plugin/clickhouse-0.3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/clickhouse/define/ConnectionInstrumentation.java`
#### Snippet
```java

    private final static String ENHANCE_CLASS = "ru.yandex.clickhouse.ClickHouseConnectionImpl";
    private final static String INIT_CONNECTION_METHOD_NAME = "initConnection";
    private final static String INIT_CONNECTION_METHOD_INTERCEPTOR = "org.apache.skywalking.apm.plugin.jdbc.clickhouse.InitConnectionMethodInterceptor";
    private final static String CREATE_CLICKHOUSE_STATEMENT_METHOD_NAME = "createClickHouseStatement";
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `apm-sniffer/apm-sdk-plugin/clickhouse-0.3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/clickhouse/define/ConnectionInstrumentation.java`
#### Snippet
```java
    private final static String ENHANCE_CLASS = "ru.yandex.clickhouse.ClickHouseConnectionImpl";
    private final static String INIT_CONNECTION_METHOD_NAME = "initConnection";
    private final static String INIT_CONNECTION_METHOD_INTERCEPTOR = "org.apache.skywalking.apm.plugin.jdbc.clickhouse.InitConnectionMethodInterceptor";
    private final static String CREATE_CLICKHOUSE_STATEMENT_METHOD_NAME = "createClickHouseStatement";
    private final static String CREATE_CLICKHOUSE_STATEMENT_INTERCEPTOR = "org.apache.skywalking.apm.plugin.jdbc.clickhouse.ClickHouseStatementMethodInterceptor";
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `abstract protected`
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/AbstractInterceptor.java`
#### Snippet
```java
    }

    abstract protected void onConstructImpl(EnhancedInstance objInst, Object[] allArguments);

    abstract protected void beforeMethodImpl(EnhancedInstance objInst, Method method, Object[] allArguments,
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `abstract protected`
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/AbstractInterceptor.java`
#### Snippet
```java
                                              Class<?>[] argumentsTypes, Object ret) throws Throwable;

    abstract protected void handleMethodExceptionImpl(EnhancedInstance objInst, Method method, Object[] allArguments,
                                                      Class<?>[] argumentsTypes, Throwable t);
}
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `abstract protected`
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/AbstractInterceptor.java`
#### Snippet
```java
                                             Class<?>[] argumentsTypes, MethodInterceptResult result) throws Throwable;

    abstract protected Object afterMethodImpl(EnhancedInstance objInst, Method method, Object[] allArguments,
                                              Class<?>[] argumentsTypes, Object ret) throws Throwable;

```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `abstract protected`
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/AbstractInterceptor.java`
#### Snippet
```java
    abstract protected void onConstructImpl(EnhancedInstance objInst, Object[] allArguments);

    abstract protected void beforeMethodImpl(EnhancedInstance objInst, Method method, Object[] allArguments,
                                             Class<?>[] argumentsTypes, MethodInterceptResult result) throws Throwable;

```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `abstract protected`
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/ContextHolderFactory.java`
#### Snippet
```java
        }

        abstract protected S getUpdatedContext(S currentContext, Object key, Object value);

        @SuppressWarnings("unchecked")
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `static abstract`
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/ContextHolderFactory.java`
#### Snippet
```java
    }

    static abstract class AbstractContextHolder<S> extends ContextHolder {

        final Local<S> local;
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `volatile static`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/conf/Config.java`
#### Snippet
```java
         */
        @Length(50)
        public volatile static String INSTANCE_NAME = "";

        /**
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/remote/StandardChannelBuilder.java`
#### Snippet
```java

public class StandardChannelBuilder implements ChannelBuilder {
    private final static int MAX_INBOUND_MESSAGE_SIZE = 1024 * 1024 * 50;

    @Override
```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/profile/ProfileTaskExecutionService.java`
#### Snippet
```java

    // profile executor thread pool, only running one thread
    private final static ExecutorService PROFILE_EXECUTOR = Executors.newSingleThreadExecutor(
        new DefaultNamedThreadFactory("PROFILING-TASK"));

```

### RuleId[ruleID=MissortedModifiers]
Missorted modifiers `final static`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/profile/ProfileTaskExecutionService.java`
#### Snippet
```java

    // add a schedule while waiting for the task to start or finish
    private final static ScheduledExecutorService PROFILE_TASK_SCHEDULE = Executors.newSingleThreadScheduledExecutor(
        new DefaultNamedThreadFactory("PROFILE-TASK-SCHEDULE"));

```

## RuleId[ruleID=EqualsBetweenInconvertibleTypes]
### RuleId[ruleID=EqualsBetweenInconvertibleTypes]
No class found which is a subtype of both 'EnhancedInstance' and 'OrchestrationHandler'
in `apm-sniffer/apm-sdk-plugin/light4j-plugins/light4j-plugin/src/main/java/org/apache/skywalking/apm/plugin/light4j/HandleRequestInterceptor.java`
#### Snippet
```java
    private boolean isBusinessHandler(EnhancedInstance objInst) {
        return !objInst.getClass().getInterfaces()[0].equals(MiddlewareHandler.class) && !objInst.getClass()
                                                                                                 .equals(
                                                                                                     OrchestrationHandler.class);
    }
```

### RuleId[ruleID=EqualsBetweenInconvertibleTypes]
No class found which is a subtype of both 'EnhancedInstance' and 'ExceptionHandler'
in `apm-sniffer/apm-sdk-plugin/light4j-plugins/light4j-plugin/src/main/java/org/apache/skywalking/apm/plugin/light4j/HandleRequestInterceptor.java`
#### Snippet
```java

    private boolean isExceptionHandler(EnhancedInstance objInst) {
        return objInst.getClass().equals(ExceptionHandler.class);
    }
}
```

## RuleId[ruleID=AnonymousHasLambdaAlternative]
### RuleId[ruleID=AnonymousHasLambdaAlternative]
Anonymous new ThreadLocal\>\>() can be replaced with ThreadLocal.withInitial()
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/ContextHolderFactory.java`
#### Snippet
```java
            this.local = getLocal(context, localFieldName);
            this.initContext = getInitContext(context);
            this.snapshots = new ThreadLocal<LinkedList<Snapshot<S>>>() {
                @Override
                protected LinkedList<Snapshot<S>> initialValue() {
```

### RuleId[ruleID=AnonymousHasLambdaAlternative]
Anonymous new ThreadLocal() can be replaced with ThreadLocal.withInitial()
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/CodecUtils.java`
#### Snippet
```java
    static ILog LOGGER = LogManager.getLogger(CodecUtils.class);

    private static ThreadLocal<ByteArrayOutputStream> REUSED_BOS = new ThreadLocal<ByteArrayOutputStream>() {
        @Override
        protected ByteArrayOutputStream initialValue() {
```

### RuleId[ruleID=AnonymousHasLambdaAlternative]
Anonymous new Thread() can be replaced with new Thread(() -\> {...})
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/util/FileUtils.java`
#### Snippet
```java

    public static void deleteDirectoryOnExit(File dir) {
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
```

## RuleId[ruleID=IgnoreResultOfCall]
### RuleId[ruleID=IgnoreResultOfCall]
Result of `MeterCenter.removeMeter()` is ignored
in `apm-application-toolkit/apm-toolkit-micrometer-registry/src/main/java/org/apache/skywalking/apm/meter/micrometer/SkywalkingMeterRegistry.java`
#### Snippet
```java
    private void onMeterRemoved(Meter meter) {
        final MeterId meterId = convertId(meter.getId());
        MeterCenter.removeMeter(meterId);
    }

```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.delete()` is ignored
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/util/FileUtils.java`
#### Snippet
```java
                        deleteDirectory(file);
                    } else {
                        file.delete();
                    }
                } else {
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.delete()` is ignored
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/util/FileUtils.java`
#### Snippet
```java
                    }
                } else {
                    file.delete();
                }
            }
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.delete()` is ignored
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/util/FileUtils.java`
#### Snippet
```java
            }
        }
        dir.delete();
    }

```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.mkdir()` is ignored
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/InstrumentDebuggingClass.java`
#### Snippet
```java
                        debuggingClassesRootPath = new File(AgentPackagePath.getPath(), "/debugging");
                        if (!debuggingClassesRootPath.exists()) {
                            debuggingClassesRootPath.mkdir();
                        }
                    } catch (AgentPackageNotFoundException e) {
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.mkdirs()` is ignored
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/bytebuddy/CacheableTransformerDecorator.java`
#### Snippet
```java
        public void putClassCache(ClassLoader loader, String className, byte[] classfileBuffer) {
            File cacheFile = getCacheFile(loader, className);
            cacheFile.getParentFile().mkdirs();
            FileOutputStream output = null;
            try {
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.mkdirs()` is ignored
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/bytebuddy/CacheableTransformerDecorator.java`
#### Snippet
```java
            File cacheDir = new File(cacheDirBase + "/class-cache-" + RandomString.make());
            if (!cacheDir.exists()) {
                cacheDir.mkdirs();
            }
            if (!cacheDir.exists()) {
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.renameTo()` is ignored
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/FileWriter.java`
#### Snippet
```java
                @Override
                public Object call() throws Exception {
                    new File(Config.Logging.DIR, Config.Logging.FILE_NAME).renameTo(new File(Config.Logging.DIR, Config.Logging.FILE_NAME + new SimpleDateFormat(".yyyy_MM_dd_HH_mm_ss")
                        .format(new Date())));
                    return null;
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.mkdirs()` is ignored
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/FileWriter.java`
#### Snippet
```java
        File logFilePath = new File(Config.Logging.DIR);
        if (!logFilePath.exists()) {
            logFilePath.mkdirs();
        } else if (!logFilePath.isDirectory()) {
            System.err.println("Log dir(" + Config.Logging.DIR + ") is not a directory.");
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.delete()` is ignored
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/FileWriter.java`
#### Snippet
```java
            for (int i = Config.Logging.MAX_HISTORY_FILES; i < historyFileArr.length; i++) {
                File expiredFile = new File(Config.Logging.DIR, historyFileArr[i]);
                expiredFile.delete();
            }
        }
```

## RuleId[ruleID=InstanceofIncompatibleInterface]
### RuleId[ruleID=InstanceofIncompatibleInterface]
'instanceof' incompatible interface `EnhancedInstance`
in `apm-sniffer/apm-sdk-plugin/hystrix-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/hystrix/v1/SWExecutionHookWrapper.java`
#### Snippet
```java
    @Override
    public <T> void onStart(HystrixCommand<T> commandInstance) {
        if (!(commandInstance instanceof EnhancedInstance)) {
            actual.onStart(commandInstance);
            return;
```

### RuleId[ruleID=InstanceofIncompatibleInterface]
'instanceof' incompatible interface `EnhancedInstance`
in `apm-sniffer/apm-sdk-plugin/elasticsearch-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v5/TransportProxyClientInterceptor.java`
#### Snippet
```java

        for (GenericAction action : genericActions) {
            if (action instanceof EnhancedInstance) {
                ElasticSearchEnhanceInfo elasticSearchEnhanceInfo = new ElasticSearchEnhanceInfo();
                elasticSearchEnhanceInfo.setClusterName(clusterName);
```

## RuleId[ruleID=UnnecessaryUnboxing]
### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `apm-sniffer/optional-plugins/fastjson-1.2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/fastjson/WriteJsonStringInterceptor.java`
#### Snippet
```java
        }
        if (ret instanceof Integer) {
            ContextManager.activeSpan().tag(Tags.ofKey(SPAN_TAG_KEY_LENGTH), Integer.toString(((Integer) ret).intValue()));
        }
        ContextManager.stopSpan();
```

## RuleId[ruleID=ClassNameSameAsAncestorName]
### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `ServerWebExchangeInstrumentation` is the same as one of its superclass' names
in `apm-sniffer/optional-plugins/optional-spring-plugins/optional-spring-cloud/gateway-2.0.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/cloud/gateway/v20x/define/ServerWebExchangeInstrumentation.java`
#### Snippet
```java
package org.apache.skywalking.apm.plugin.spring.cloud.gateway.v20x.define;

public class ServerWebExchangeInstrumentation extends org.apache.skywalking.apm.plugin.spring.webflux.v5.define.ServerWebExchangeInstrumentation {

    @Override
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `DispatcherHandlerInstrumentation` is the same as one of its superclass' names
in `apm-sniffer/optional-plugins/optional-spring-plugins/optional-spring-cloud/gateway-2.0.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/cloud/gateway/v20x/define/DispatcherHandlerInstrumentation.java`
#### Snippet
```java
package org.apache.skywalking.apm.plugin.spring.cloud.gateway.v20x.define;

public class DispatcherHandlerInstrumentation extends org.apache.skywalking.apm.plugin.spring.webflux.v5.define.DispatcherHandlerInstrumentation {

    @Override
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `ClientInterceptor` is the same as one of its superclass' names
in `apm-sniffer/apm-sdk-plugin/grpc-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/grpc/v1/client/ClientInterceptor.java`
#### Snippet
```java
import io.grpc.MethodDescriptor;

public class ClientInterceptor implements io.grpc.ClientInterceptor {

    @Override
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `ServerInterceptor` is the same as one of its superclass' names
in `apm-sniffer/apm-sdk-plugin/grpc-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/grpc/v1/server/ServerInterceptor.java`
#### Snippet
```java
import org.apache.skywalking.apm.util.StringUtil;

public class ServerInterceptor implements io.grpc.ServerInterceptor {
    @Override
    public <REQUEST, RESPONSE> ServerCall.Listener<REQUEST> interceptCall(ServerCall<REQUEST, RESPONSE> call,
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `ServerWebExchangeInstrumentation` is the same as one of its superclass' names
in `apm-sniffer/optional-plugins/shenyu-2.4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/shenyu/v24x/define/ServerWebExchangeInstrumentation.java`
#### Snippet
```java
 * we can put the snapshot into the enhanced ServerWebExchange object.
 */
public class ServerWebExchangeInstrumentation extends
        org.apache.skywalking.apm.plugin.spring.webflux.v5.define.ServerWebExchangeInstrumentation {

```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `ServerWebExchangeInstrumentation` is the same as one of its superclass' names
in `apm-sniffer/optional-plugins/optional-spring-plugins/optional-spring-cloud/gateway-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/cloud/gateway/v3x/define/ServerWebExchangeInstrumentation.java`
#### Snippet
```java
 * when {@link org.springframework.cloud.gateway.config.GatewayEnvironmentPostProcessor} class is exist.
 */
public class ServerWebExchangeInstrumentation extends
        org.apache.skywalking.apm.plugin.spring.webflux.v5.define.ServerWebExchangeInstrumentation {

```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `DispatcherHandlerInstrumentation` is the same as one of its superclass' names
in `apm-sniffer/optional-plugins/optional-spring-plugins/optional-spring-cloud/gateway-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/cloud/gateway/v3x/define/DispatcherHandlerInstrumentation.java`
#### Snippet
```java
 * class when {@link org.springframework.cloud.gateway.config.GatewayEnvironmentPostProcessor} class is exist
 */
public class DispatcherHandlerInstrumentation extends
        org.apache.skywalking.apm.plugin.spring.webflux.v5.define.DispatcherHandlerInstrumentation {

```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `ServerWebExchangeInstrumentation` is the same as one of its superclass' names
in `apm-sniffer/optional-plugins/optional-spring-plugins/optional-spring-cloud/gateway-2.1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/cloud/gateway/v21x/define/ServerWebExchangeInstrumentation.java`
#### Snippet
```java
package org.apache.skywalking.apm.plugin.spring.cloud.gateway.v21x.define;

public class ServerWebExchangeInstrumentation extends org.apache.skywalking.apm.plugin.spring.webflux.v5.define.ServerWebExchangeInstrumentation {

    @Override
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `DispatcherHandlerInstrumentation` is the same as one of its superclass' names
in `apm-sniffer/optional-plugins/optional-spring-plugins/optional-spring-cloud/gateway-2.1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/cloud/gateway/v21x/define/DispatcherHandlerInstrumentation.java`
#### Snippet
```java
package org.apache.skywalking.apm.plugin.spring.cloud.gateway.v21x.define;

public class DispatcherHandlerInstrumentation extends org.apache.skywalking.apm.plugin.spring.webflux.v5.define.DispatcherHandlerInstrumentation {

    @Override
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Listener` is the same as one of its superclass' names
in `apm-sniffer/apm-agent/src/main/java/org/apache/skywalking/apm/agent/SkyWalkingAgent.java`
#### Snippet
```java
    }

    private static class Listener implements AgentBuilder.Listener {
        @Override
        public void onDiscovery(String typeName, ClassLoader classLoader, JavaModule module, boolean loaded) {
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Transformer` is the same as one of its superclass' names
in `apm-sniffer/apm-agent/src/main/java/org/apache/skywalking/apm/agent/SkyWalkingAgent.java`
#### Snippet
```java
    }

    private static class Transformer implements AgentBuilder.Transformer {
        private PluginFinder pluginFinder;

```

## RuleId[ruleID=RedundantMethodOverride]
### RuleId[ruleID=RedundantMethodOverride]
Method `isBootstrapInstrumentation()` is identical to its super method
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-log4j-2.x-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/log/log4j/v2/x/async/CreateMementoInstrumentation.java`
#### Snippet
```java

    @Override
    public boolean isBootstrapInstrumentation() {
        return false;
    }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `getConstructorsInterceptPoints()` is identical to its super method
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-webflux-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/webflux/WebFluxSkyWalkingOperatorsActivation.java`
#### Snippet
```java

    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `forceSampled()` only delegates to its super method
in `apm-sniffer/optional-plugins/trace-sampler-cpu-policy-plugin/src/main/java/org/apache/skywalking/apm/plugin/cpu/policy/TraceSamplerCpuPolicyExtendService.java`
#### Snippet
```java

    @Override
    public void forceSampled() {
        super.forceSampled();
    }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `shutdown()` only delegates to its super method
in `apm-sniffer/optional-plugins/trace-sampler-cpu-policy-plugin/src/main/java/org/apache/skywalking/apm/plugin/cpu/policy/TraceSamplerCpuPolicyExtendService.java`
#### Snippet
```java

    @Override
    public void shutdown() {
        super.shutdown();
    }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `prepare()` only delegates to its super method
in `apm-sniffer/optional-plugins/trace-sampler-cpu-policy-plugin/src/main/java/org/apache/skywalking/apm/plugin/cpu/policy/TraceSamplerCpuPolicyExtendService.java`
#### Snippet
```java

    @Override
    public void prepare() {
        super.prepare();
    }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `onComplete()` is identical to its super method
in `apm-sniffer/optional-plugins/trace-sampler-cpu-policy-plugin/src/main/java/org/apache/skywalking/apm/plugin/cpu/policy/TraceSamplerCpuPolicyExtendService.java`
#### Snippet
```java

    @Override
    public void onComplete() {
    }

```

### RuleId[ruleID=RedundantMethodOverride]
Method `boot()` is identical to its super method
in `apm-sniffer/optional-reporter-plugins/kafka-reporter-plugin/src/main/java/org/apache/skywalking/apm/agent/core/kafka/KafkaMeterSender.java`
#### Snippet
```java

    @Override
    public void boot() {
    }

```

### RuleId[ruleID=RedundantMethodOverride]
Method `boot()` is identical to its super method
in `apm-sniffer/optional-reporter-plugins/kafka-reporter-plugin/src/main/java/org/apache/skywalking/apm/agent/core/kafka/KafkaJVMMetricsSender.java`
#### Snippet
```java

    @Override
    public void boot() {
    }

```

### RuleId[ruleID=RedundantMethodOverride]
Method `produce()` only delegates to its super method
in `apm-sniffer/optional-reporter-plugins/kafka-reporter-plugin/src/main/java/org/apache/skywalking/apm/agent/core/kafka/KafkaLogReporterServiceClient.java`
#### Snippet
```java

    @Override
    public void produce(final LogData.Builder logData) {
        super.produce(logData);
    }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `onComplete()` is identical to its super method
in `apm-sniffer/optional-plugins/trace-ignore-plugin/src/main/java/org/apache/skywalking/apm/plugin/trace/ignore/TraceIgnoreExtendService.java`
#### Snippet
```java

    @Override
    public void onComplete() {
    }

```

### RuleId[ruleID=RedundantMethodOverride]
Method `shutdown()` only delegates to its super method
in `apm-sniffer/optional-plugins/trace-ignore-plugin/src/main/java/org/apache/skywalking/apm/plugin/trace/ignore/TraceIgnoreExtendService.java`
#### Snippet
```java

    @Override
    public void shutdown() {
        super.shutdown();
    }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `prepare()` only delegates to its super method
in `apm-sniffer/optional-plugins/trace-ignore-plugin/src/main/java/org/apache/skywalking/apm/plugin/trace/ignore/TraceIgnoreExtendService.java`
#### Snippet
```java

    @Override
    public void prepare() {
        super.prepare();
    }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `forceSampled()` only delegates to its super method
in `apm-sniffer/optional-plugins/trace-ignore-plugin/src/main/java/org/apache/skywalking/apm/plugin/trace/ignore/TraceIgnoreExtendService.java`
#### Snippet
```java

    @Override
    public void forceSampled() {
        super.forceSampled();
    }
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `apm-sniffer/apm-sdk-plugin/thrift-plugin/src/main/java/org/apache/skywalking/apm/plugin/thrift/wrapper/ClientOutProtocolWrapper.java`
#### Snippet
```java

    private void writeHeader(Map<String, String> header) throws TException {
        super.writeFieldBegin(new TField(SW_MAGIC_FIELD, TType.MAP, SW_MAGIC_FIELD_ID));
        super.writeMapBegin(new TMap(TType.STRING, TType.STRING, header.size()));

```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `apm-sniffer/apm-sdk-plugin/thrift-plugin/src/main/java/org/apache/skywalking/apm/plugin/thrift/wrapper/ClientOutProtocolWrapper.java`
#### Snippet
```java
    private void writeHeader(Map<String, String> header) throws TException {
        super.writeFieldBegin(new TField(SW_MAGIC_FIELD, TType.MAP, SW_MAGIC_FIELD_ID));
        super.writeMapBegin(new TMap(TType.STRING, TType.STRING, header.size()));

        final Set<Map.Entry<String, String>> entries = header.entrySet();
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `apm-sniffer/apm-sdk-plugin/thrift-plugin/src/main/java/org/apache/skywalking/apm/plugin/thrift/wrapper/ClientOutProtocolWrapper.java`
#### Snippet
```java
        final Set<Map.Entry<String, String>> entries = header.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            super.writeString(entry.getKey());
            super.writeString(entry.getValue());
        }
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `apm-sniffer/apm-sdk-plugin/thrift-plugin/src/main/java/org/apache/skywalking/apm/plugin/thrift/wrapper/ClientOutProtocolWrapper.java`
#### Snippet
```java
        for (Map.Entry<String, String> entry : entries) {
            super.writeString(entry.getKey());
            super.writeString(entry.getValue());
        }

```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `apm-sniffer/apm-sdk-plugin/thrift-plugin/src/main/java/org/apache/skywalking/apm/plugin/thrift/wrapper/ClientOutProtocolWrapper.java`
#### Snippet
```java
        }

        super.writeMapEnd();
        super.writeFieldEnd();
    }
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `apm-sniffer/apm-sdk-plugin/thrift-plugin/src/main/java/org/apache/skywalking/apm/plugin/thrift/wrapper/ClientOutProtocolWrapper.java`
#### Snippet
```java

        super.writeMapEnd();
        super.writeFieldEnd();
    }

```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `apm-sniffer/apm-sdk-plugin/thrift-plugin/src/main/java/org/apache/skywalking/apm/plugin/thrift/wrapper/ServerInProtocolWrapper.java`
#### Snippet
```java
        if (field.id == SW_MAGIC_FIELD_ID && field.type == TType.MAP) {
            try {
                TMap tMap = super.readMapBegin();
                Map<String, String> header = new HashMap<>(tMap.size);

```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `apm-sniffer/apm-sdk-plugin/thrift-plugin/src/main/java/org/apache/skywalking/apm/plugin/thrift/wrapper/ServerInProtocolWrapper.java`
#### Snippet
```java
            } finally {
                context = null;
                super.readMapEnd();
                super.readFieldEnd();
            }
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `apm-sniffer/apm-sdk-plugin/thrift-plugin/src/main/java/org/apache/skywalking/apm/plugin/thrift/wrapper/ServerInProtocolWrapper.java`
#### Snippet
```java
                context = null;
                super.readMapEnd();
                super.readFieldEnd();
            }
            return readFieldBegin();
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `apm-application-toolkit/apm-toolkit-log4j-1.x/src/main/java/org/apache/skywalking/apm/toolkit/log/log4j/v1/x/TraceIdPatternParser.java`
#### Snippet
```java
    protected void finalizeConverter(char c) {
        if ('T' == c) {
            String option = super.extractOption();
            if (option != null && option.equals(SKYWALKING_CONTEXT_OPTION)) {
                addConverter(new SkyWalkingContextPatternConverter());
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/interceptor/CustomizeStaticInterceptor.java`
#### Snippet
```java
    public void handleMethodException(Class clazz, Method method, Object[] allArguments, Class<?>[] parameterTypes,
        Throwable t, MethodInvocationContext context) {
        super.handleMethodException(t);
    }
}
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/interceptor/CustomizeStaticInterceptor.java`
#### Snippet
```java
    public Object afterMethod(Class clazz, Method method, Object[] allArguments, Class<?>[] parameterTypes,
        Object ret, MethodInvocationContext context) {
        super.afterMethod(method, ret, context);
        return ret;
    }
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/interceptor/CustomizeStaticInterceptor.java`
#### Snippet
```java
    public void beforeMethod(Class clazz, Method method, Object[] allArguments, Class<?>[] parameterTypes,
        MethodInvocationContext context) {
        super.beforeMethod(method, allArguments, context);
    }

```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/interceptor/CustomizeInstanceInterceptor.java`
#### Snippet
```java
    public void handleMethodException(EnhancedInstance objInst, Method method, Object[] allArguments,
        Class<?>[] argumentsTypes, Throwable t, MethodInvocationContext context) {
        super.handleMethodException(t);
    }
}
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/interceptor/CustomizeInstanceInterceptor.java`
#### Snippet
```java
    public Object afterMethod(EnhancedInstance objInst, Method method, Object[] allArguments, Class<?>[] argumentsTypes,
        Object ret, MethodInvocationContext context) throws Throwable {
        super.afterMethod(method, ret, context);
        return ret;
    }
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/interceptor/CustomizeInstanceInterceptor.java`
#### Snippet
```java
    public void beforeMethod(EnhancedInstance objInst, Method method, Object[] allArguments, Class<?>[] argumentsTypes,
        MethodInvocationContext context) throws Throwable {
        super.beforeMethod(method, allArguments, context);
    }

```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/TagAnnotationMethodInterceptor.java`
#### Snippet
```java
    public void handleMethodException(final EnhancedInstance objInst, final Method method, final Object[] allArguments,
                                      final Class<?>[] argumentsTypes, final Throwable t) {
        super.handleMethodException(t);
    }
}
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/TagAnnotationMethodInterceptor.java`
#### Snippet
```java
            final Class<?>[] argumentsTypes,
            final Object ret) {
        super.afterMethod(method, ret);
        return ret;
    }
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/TagAnnotationMethodInterceptor.java`
#### Snippet
```java
    public void beforeMethod(final EnhancedInstance objInst, final Method method, final Object[] allArguments,
                             final Class<?>[] argumentsTypes, final MethodInterceptResult result) {
        super.beforeMethod(method, allArguments);
    }

```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/TraceAnnotationMethodInterceptor.java`
#### Snippet
```java
    public Object afterMethod(EnhancedInstance objInst, Method method, Object[] allArguments, Class<?>[] argumentsTypes,
                              Object ret) throws Throwable {
        super.afterMethod(method, ret);
        return ret;
    }
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/TraceAnnotationMethodInterceptor.java`
#### Snippet
```java
    public void beforeMethod(EnhancedInstance objInst, Method method, Object[] allArguments, Class<?>[] argumentsTypes,
                             MethodInterceptResult result) throws Throwable {
        super.beforeMethod(method, allArguments);
    }

```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/TraceAnnotationMethodInterceptor.java`
#### Snippet
```java
    public void handleMethodException(EnhancedInstance objInst, Method method, Object[] allArguments,
                                      Class<?>[] argumentsTypes, Throwable t) {
        super.handleMethodException(t);
    }
}
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/TraceAnnotationStaticMethodInterceptor.java`
#### Snippet
```java
    public void beforeMethod(Class clazz, Method method, Object[] allArguments, Class<?>[] parameterTypes,
                             MethodInterceptResult result) {
        super.beforeMethod(method, allArguments);
    }

```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/TraceAnnotationStaticMethodInterceptor.java`
#### Snippet
```java
    public void handleMethodException(Class clazz, Method method, Object[] allArguments, Class<?>[] parameterTypes,
                                      Throwable t) {
        super.handleMethodException(t);
    }
}
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/TraceAnnotationStaticMethodInterceptor.java`
#### Snippet
```java
    public Object afterMethod(Class clazz, Method method, Object[] allArguments, Class<?>[] parameterTypes,
                              Object ret) {
        super.afterMethod(method, ret);
        return ret;
    }
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/TagAnnotationStaticMethodInterceptor.java`
#### Snippet
```java
    public Object afterMethod(Class clazz, Method method, Object[] allArguments, Class<?>[] parameterTypes,
                              Object ret) {
        super.afterMethod(method, ret);
        return ret;
    }
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/TagAnnotationStaticMethodInterceptor.java`
#### Snippet
```java
    public void beforeMethod(Class clazz, Method method, Object[] allArguments, Class<?>[] parameterTypes,
                             MethodInterceptResult result) {
        super.beforeMethod(method, allArguments);
    }

```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/TagAnnotationStaticMethodInterceptor.java`
#### Snippet
```java
    public void handleMethodException(Class clazz, Method method, Object[] allArguments, Class<?>[] parameterTypes,
                                      Throwable t) {
        super.handleMethodException(t);
    }
}
```

## RuleId[ruleID=NestedAssignment]
### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `apm-sniffer/apm-sdk-plugin/dubbo-3.x-conflict-patch/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo3/patch/MakeWrapperInterceptor.java`
#### Snippet
```java
            String md = entry.getKey();
            Method method = (Method) entry.getValue();
            if ((matcher = ReflectUtils.GETTER_METHOD_DESC_PATTERN.matcher(md)).matches()) {
                String pn = propertyName(matcher.group(1));
                c2.append(" if( $2.equals(\"")
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `apm-sniffer/apm-sdk-plugin/dubbo-3.x-conflict-patch/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo3/patch/MakeWrapperInterceptor.java`
#### Snippet
```java
                  .append("(); }");
                pts.put(pn, method.getReturnType());
            } else if ((matcher = ReflectUtils.IS_HAS_CAN_METHOD_DESC_PATTERN.matcher(md)).matches()) {
                String pn = propertyName(matcher.group(1));
                c2.append(" if( $2.equals(\"")
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `apm-sniffer/apm-sdk-plugin/dubbo-3.x-conflict-patch/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo3/patch/MakeWrapperInterceptor.java`
#### Snippet
```java
                  .append("(); }");
                pts.put(pn, method.getReturnType());
            } else if ((matcher = ReflectUtils.SETTER_METHOD_DESC_PATTERN.matcher(md)).matches()) {
                Class<?> pt = method.getParameterTypes()[0];
                String pn = propertyName(matcher.group(1));
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `apm-sniffer/apm-sdk-plugin/dubbo-2.7.x-conflict-patch/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo/patch/MakeWrapperInterceptor.java`
#### Snippet
```java
            String md = entry.getKey();
            Method method = (Method) entry.getValue();
            if ((matcher = ReflectUtils.GETTER_METHOD_DESC_PATTERN.matcher(md)).matches()) {
                String pn = propertyName(matcher.group(1));
                c2.append(" if( $2.equals(\"")
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `apm-sniffer/apm-sdk-plugin/dubbo-2.7.x-conflict-patch/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo/patch/MakeWrapperInterceptor.java`
#### Snippet
```java
                  .append("(); }");
                pts.put(pn, method.getReturnType());
            } else if ((matcher = ReflectUtils.IS_HAS_CAN_METHOD_DESC_PATTERN.matcher(md)).matches()) {
                String pn = propertyName(matcher.group(1));
                c2.append(" if( $2.equals(\"")
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `apm-sniffer/apm-sdk-plugin/dubbo-2.7.x-conflict-patch/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo/patch/MakeWrapperInterceptor.java`
#### Snippet
```java
                  .append("(); }");
                pts.put(pn, method.getReturnType());
            } else if ((matcher = ReflectUtils.SETTER_METHOD_DESC_PATTERN.matcher(md)).matches()) {
                Class<?> pt = method.getParameterTypes()[0];
                String pn = propertyName(matcher.group(1));
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/CodecUtils.java`
#### Snippet
```java
        Map<String, String> data = new HashMap<>();
        String key = null;
        while ((key = getNextString(byteBuffer)) != null) {
            data.put(key, getNextString(byteBuffer));
        }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/util/IOUtils.java`
#### Snippet
```java
        long count = 0;
        int n = 0;
        while (EOF != (n = input.read(buffer))) {
            output.write(buffer, 0, n);
            count += n;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/PluginCfg.java`
#### Snippet
```java
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String pluginDefine;
            while ((pluginDefine = reader.readLine()) != null) {
                try {
                    if (pluginDefine.trim().length() == 0 || pluginDefine.startsWith("#")) {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/meter/MeterId.java`
#### Snippet
```java
        }

        return labels = tags.stream()
            .map(t -> Label.newBuilder().setName(t.getKey()).setValue(t.getValue()).build())
            .collect(Collectors.toList());
    }

```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/loader/AgentClassLoader.java`
#### Snippet
```java
                    classFileUrl.openStream()); final ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
                    int ch;
                    while ((ch = is.read()) != -1) {
                        baos.write(ch);
                    }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/bootstrap/BootstrapInstrumentBoost.java`
#### Snippet
```java

            // read bytes from the input stream and store them in buffer
            while ((len = resourceAsStream.read(buffer)) != -1) {
                // write bytes from the buffer into output stream
                os.write(buffer, 0, len);
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/trace/EntrySpan.java`
#### Snippet
```java
    @Override
    public EntrySpan start() {
        if ((currentMaxDepth = ++stackDepth) == 1) {
            super.start();
        }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/AbstractLogger.java`
#### Snippet
```java
        int index;
        String tmpMessage = message;
        while ((index = message.indexOf("{}", startSize)) != -1) {
            if (parametersIndex >= parameters.length) {
                break;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `apm-sniffer/apm-sdk-plugin/dubbo-conflict-patch/src/main/java/org/apache/skywalking/apm/plugin/dubbo/patch/MakeWrapperInterceptor.java`
#### Snippet
```java
            String md = entry.getKey();
            Method method = (Method) entry.getValue();
            if ((matcher = ReflectUtils.GETTER_METHOD_DESC_PATTERN.matcher(md)).matches()) {
                String pn = propertyName(matcher.group(1));
                c2.append(" if( $2.equals(\"")
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `apm-sniffer/apm-sdk-plugin/dubbo-conflict-patch/src/main/java/org/apache/skywalking/apm/plugin/dubbo/patch/MakeWrapperInterceptor.java`
#### Snippet
```java
                  .append("(); }");
                pts.put(pn, method.getReturnType());
            } else if ((matcher = ReflectUtils.IS_HAS_CAN_METHOD_DESC_PATTERN.matcher(md)).matches()) {
                String pn = propertyName(matcher.group(1));
                c2.append(" if( $2.equals(\"")
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `apm-sniffer/apm-sdk-plugin/dubbo-conflict-patch/src/main/java/org/apache/skywalking/apm/plugin/dubbo/patch/MakeWrapperInterceptor.java`
#### Snippet
```java
                  .append("(); }");
                pts.put(pn, method.getReturnType());
            } else if ((matcher = ReflectUtils.SETTER_METHOD_DESC_PATTERN.matcher(md)).matches()) {
                Class<?> pt = method.getParameterTypes()[0];
                String pn = propertyName(matcher.group(1));
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`index = index + this.placeholderSuffix.length()` could be simplified to 'index += this.placeholderSuffix.length()'
in `apm-commons/apm-util/src/main/java/org/apache/skywalking/apm/util/PropertyPlaceholderHelper.java`
#### Snippet
```java
                if (withinNestedPlaceholder > 0) {
                    withinNestedPlaceholder--;
                    index = index + this.placeholderSuffix.length();
                } else {
                    return index;
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`index = index + this.simplePrefix.length()` could be simplified to 'index += this.simplePrefix.length()'
in `apm-commons/apm-util/src/main/java/org/apache/skywalking/apm/util/PropertyPlaceholderHelper.java`
#### Snippet
```java
            } else if (StringUtil.substringMatch(buf, index, this.simplePrefix)) {
                withinNestedPlaceholder++;
                index = index + this.simplePrefix.length();
            } else {
                index++;
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`operationName = operationName + "BATCH_EXECUTE"` could be simplified to 'operationName += "BATCH_EXECUTE"'
in `apm-sniffer/apm-sdk-plugin/redisson-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/redisson/v3/RedisConnectionMethodInterceptor.java`
#### Snippet
```java

        if (allArguments[0] instanceof CommandsData) {
            operationName = operationName + "BATCH_EXECUTE";
            CommandsData commands = (CommandsData) allArguments[0];
            for (CommandData commandData : commands.getCommands()) {
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`operationName = operationName + command` could be simplified to 'operationName += command'
in `apm-sniffer/apm-sdk-plugin/redisson-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/redisson/v3/RedisConnectionMethodInterceptor.java`
#### Snippet
```java
            CommandData commandData = (CommandData) allArguments[0];
            String command = commandData.getCommand().getName();
            operationName = operationName + command;
            addCommandData(dbStatement, commandData);
        }
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`operationName = operationName + command` could be simplified to 'operationName += command'
in `apm-sniffer/apm-sdk-plugin/lettuce-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/lettuce/v5/RedisChannelWriterInterceptor.java`
#### Snippet
```java
            RedisCommand<?, ?, ?> redisCommand = (RedisCommand<?, ?, ?>) allArguments[0];
            String command = redisCommand.getType().name();
            operationName = operationName + command;
            dbStatement.append(command);
            if (LettucePluginConfig.Plugin.Lettuce.TRACE_REDIS_PARAMETERS) {
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`operationName = operationName + "BATCH_WRITE"` could be simplified to 'operationName += "BATCH_WRITE"'
in `apm-sniffer/apm-sdk-plugin/lettuce-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/lettuce/v5/RedisChannelWriterInterceptor.java`
#### Snippet
```java
        } else if (allArguments[0] instanceof Collection) {
            Collection<RedisCommand<?, ?, ?>> redisCommands = (Collection<RedisCommand<?, ?, ?>>) allArguments[0];
            operationName = operationName + "BATCH_WRITE";
            for (RedisCommand<?, ?, ?> redisCommand : redisCommands) {
                dbStatement.append(redisCommand.getType().name()).append(";");
```

## RuleId[ruleID=Lombok]
### RuleId[ruleID=Lombok]
Not generated 'getCorrelationContext'(): A method with similar name 'getCorrelationContext' already exists
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/TracingContext.java`
#### Snippet
```java
     */
    private final ProfileStatusReference profileStatus;
    @Getter(AccessLevel.PACKAGE)
    private final CorrelationContext correlationContext;
    @Getter(AccessLevel.PACKAGE)
```

## RuleId[ruleID=CodeBlock2Expr]
### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `apm-sniffer/apm-sdk-plugin/spring-plugins/mvc-annotation-commons/src/main/java/org/apache/skywalking/apm/plugin/spring/mvc/commons/RequestUtil.java`
#### Snippet
```java
    public static void collectHttpParam(ServerHttpRequest request, AbstractSpan span) {
        Map<String, String[]> parameterMap = new HashMap<>(request.getQueryParams().size());
        request.getQueryParams().forEach((key, value) -> {
            parameterMap.put(key, value.toArray(new String[0]));
        });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `apm-sniffer/apm-sdk-plugin/spring-plugins/spring-webflux-5.x-webclient-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/webflux/v5/webclient/WebFluxWebClientInterceptor.java`
#### Snippet
```java
                    }
                }
            }).doOnError(span::log).doFinally(s -> {
                span.asyncFinish();
            });
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### RuleId[ruleID=MismatchedCollectionQueryUpdate]
Contents of collection `poolList` are updated, but never queried
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/jvm/memorypool/UnknownMemoryPool.java`
#### Snippet
```java
    @Override
    public List<MemoryPool> getMemoryPoolMetricsList() {
        List<MemoryPool> poolList = new LinkedList<MemoryPool>();
        poolList.add(MemoryPool.newBuilder().setType(PoolType.CODE_CACHE_USAGE).build());
        poolList.add(MemoryPool.newBuilder().setType(PoolType.NEWGEN_USAGE).build());
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `transportAddressesStr` is accessed in both synchronized and unsynchronized contexts
in `apm-sniffer/apm-sdk-plugin/elasticsearch-6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v6/TransportAddressCache.java`
#### Snippet
```java

    private List<TransportAddress> transportAddresses = new ArrayList<TransportAddress>();
    private String transportAddressesStr = "";

    public synchronized void addDiscoveryNode(TransportAddress... transportAddress) {
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `allConsumers` is accessed in both synchronized and unsynchronized contexts
in `apm-commons/apm-datacarrier/src/main/java/org/apache/skywalking/apm/commons/datacarrier/consumer/BulkConsumePool.java`
#### Snippet
```java
 */
public class BulkConsumePool implements ConsumerPool {
    private List<MultipleChannelsConsumer> allConsumers;
    private volatile boolean isStarted = false;

```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `transportAddressesStr` is accessed in both synchronized and unsynchronized contexts
in `apm-sniffer/apm-sdk-plugin/elasticsearch-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v5/TransportAddressCache.java`
#### Snippet
```java

    private List<TransportAddress> transportAddresses = new ArrayList<TransportAddress>();
    private String transportAddressesStr;

    public synchronized void addDiscoveryNode(TransportAddress... transportAddress) {
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `DEFAULT_LOADER` is accessed in both synchronized and unsynchronized contexts
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/loader/AgentClassLoader.java`
#### Snippet
```java
     * The default class loader for the agent.
     */
    private static AgentClassLoader DEFAULT_LOADER;

    private List<File> classpath;
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `LISTENERS` is accessed in both synchronized and unsynchronized contexts
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/IgnoredTracerContext.java`
#### Snippet
```java

    public static class ListenerManager {
        private static List<IgnoreTracerContextListener> LISTENERS = new LinkedList<>();

        /**
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `LISTENERS` is accessed in both synchronized and unsynchronized contexts
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/TracingContext.java`
#### Snippet
```java
     */
    public static class ListenerManager {
        private static List<TracingContextListener> LISTENERS = new LinkedList<>();

        /**
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `LISTENERS` is accessed in both synchronized and unsynchronized contexts
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/TracingContext.java`
#### Snippet
```java
     */
    public static class TracingThreadListenerManager {
        private static List<TracingThreadListener> LISTENERS = new LinkedList<>();

        public static synchronized void add(TracingThreadListener listener) {
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `INSTANCE` is accessed in both synchronized and unsynchronized contexts
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/FileWriter.java`
#### Snippet
```java
 */
public class FileWriter implements IWriter {
    private static FileWriter INSTANCE;
    private static final Object CREATE_LOCK = new Object();
    private FileOutputStream fileOutputStream;
```

## RuleId[ruleID=UseOfPropertiesAsHashtable]
### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `apm-sniffer/optional-plugins/trace-ignore-plugin/src/main/java/org/apache/skywalking/apm/plugin/trace/ignore/conf/IgnoreConfigInitializer.java`
#### Snippet
```java
            if (prop.getKey().toString().startsWith(ENV_KEY_PREFIX)) {
                String realKey = prop.getKey().toString().substring(ENV_KEY_PREFIX.length());
                properties.put(realKey, prop.getValue());
            }
        }
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.get()` on properties object
in `apm-sniffer/optional-plugins/trace-ignore-plugin/src/main/java/org/apache/skywalking/apm/plugin/trace/ignore/conf/IgnoreConfigInitializer.java`
#### Snippet
```java
            properties.load(configFileStream);
            for (String key : properties.stringPropertyNames()) {
                String value = (String) properties.get(key);
                properties.put(key, PropertyPlaceholderHelper.INSTANCE.replacePlaceholders(value, properties));
            }
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `apm-sniffer/optional-plugins/trace-ignore-plugin/src/main/java/org/apache/skywalking/apm/plugin/trace/ignore/conf/IgnoreConfigInitializer.java`
#### Snippet
```java
            for (String key : properties.stringPropertyNames()) {
                String value = (String) properties.get(key);
                properties.put(key, PropertyPlaceholderHelper.INSTANCE.replacePlaceholders(value, properties));
            }
            ConfigInitializer.initialize(properties, IgnoreConfig.class);
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.get()` on properties object
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/conf/SnifferConfigInitializer.java`
#### Snippet
```java
            AGENT_SETTINGS.load(configFileStream);
            for (String key : AGENT_SETTINGS.stringPropertyNames()) {
                String value = (String) AGENT_SETTINGS.get(key);
                AGENT_SETTINGS.put(key, PropertyPlaceholderHelper.INSTANCE.replacePlaceholders(value, AGENT_SETTINGS));
            }
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/conf/SnifferConfigInitializer.java`
#### Snippet
```java
            for (String key : AGENT_SETTINGS.stringPropertyNames()) {
                String value = (String) AGENT_SETTINGS.get(key);
                AGENT_SETTINGS.put(key, PropertyPlaceholderHelper.INSTANCE.replacePlaceholders(value, AGENT_SETTINGS));
            }

```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/conf/SnifferConfigInitializer.java`
#### Snippet
```java
                throw new IllegalArgumentException("[" + terms + "] is not a key-value pair.");
            }
            AGENT_SETTINGS.put(terms.get(0), terms.get(1));
        }
    }
```

### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.put()` on properties object
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/conf/SnifferConfigInitializer.java`
#### Snippet
```java
            if (key.startsWith(ENV_KEY_PREFIX)) {
                String realKey = key.substring(ENV_KEY_PREFIX.length());
                AGENT_SETTINGS.put(realKey, prop.getValue());
            }
        }
```

## RuleId[ruleID=EmptyMethod]
### RuleId[ruleID=EmptyMethod]
The method is empty
in `apm-application-toolkit/apm-toolkit-meter/src/main/java/org/apache/skywalking/apm/toolkit/meter/Counter.java`
#### Snippet
```java
     * Increase count
     */
    public void increment(double count) {
    }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `apm-application-toolkit/apm-toolkit-meter/src/main/java/org/apache/skywalking/apm/toolkit/meter/Histogram.java`
#### Snippet
```java
     * Add value into the histogram, automatic analyze what bucket count need to be increment [step1, step2)
     */
    public void addValue(double value) {
    }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `apm-application-toolkit/apm-toolkit-trace/src/main/java/org/apache/skywalking/apm/toolkit/trace/ActiveSpan.java`
#### Snippet
```java
     * @param value tag value
     */
    public static void tag(String key, String value) {
    }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `apm-application-toolkit/apm-toolkit-trace/src/main/java/org/apache/skywalking/apm/toolkit/trace/ActiveSpan.java`
#### Snippet
```java
    }

    public static void error() {
    }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `apm-application-toolkit/apm-toolkit-trace/src/main/java/org/apache/skywalking/apm/toolkit/trace/ActiveSpan.java`
#### Snippet
```java
    }

    public static void error(String errorMsg) {
    }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `apm-application-toolkit/apm-toolkit-trace/src/main/java/org/apache/skywalking/apm/toolkit/trace/ActiveSpan.java`
#### Snippet
```java
    }

    public static void error(Throwable throwable) {
    }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `apm-application-toolkit/apm-toolkit-trace/src/main/java/org/apache/skywalking/apm/toolkit/trace/ActiveSpan.java`
#### Snippet
```java
    }

    public static void debug(String debugMsg) {
    }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `apm-application-toolkit/apm-toolkit-trace/src/main/java/org/apache/skywalking/apm/toolkit/trace/ActiveSpan.java`
#### Snippet
```java
    }

    public static void info(String infoMsg) {
    }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `apm-application-toolkit/apm-toolkit-trace/src/main/java/org/apache/skywalking/apm/toolkit/trace/ActiveSpan.java`
#### Snippet
```java
    }

    public static void setOperationName(String operationName) {
    }
}
```

### RuleId[ruleID=EmptyMethod]
All implementations of this method are empty
in `apm-commons/apm-datacarrier/src/main/java/org/apache/skywalking/apm/commons/datacarrier/consumer/IConsumer.java`
#### Snippet
```java

public interface IConsumer<T> {
    void init(final Properties properties);

    void consume(List<T> data);
```

### RuleId[ruleID=EmptyMethod]
All implementations of this method are empty
in `apm-commons/apm-datacarrier/src/main/java/org/apache/skywalking/apm/commons/datacarrier/consumer/IConsumer.java`
#### Snippet
```java
    void onError(List<T> data, Throwable t);

    void onExit();

    /**
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `apm-commons/apm-datacarrier/src/main/java/org/apache/skywalking/apm/commons/datacarrier/consumer/IConsumer.java`
#### Snippet
```java
     * reaction if the queue has no element.
     */
    default void nothingToConsume() {
        return;
    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/trace/NoopSpan.java`
#### Snippet
```java
    }

    public void finish() {

    }
```

### RuleId[ruleID=EmptyMethod]
The method and all its derivables are empty
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/jvm/JVMMetricsSender.java`
#### Snippet
```java

    @Override
    public void boot() {

    }
```

### RuleId[ruleID=EmptyMethod]
The method and all its derivables are empty
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/meter/MeterSender.java`
#### Snippet
```java

    @Override
    public void boot() {

    }
```

### RuleId[ruleID=EmptyMethod]
The method and all its derivables are empty
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/profile/ProfileSnapshotSender.java`
#### Snippet
```java

    @Override
    public void boot() throws Throwable {

    }
```

### RuleId[ruleID=EmptyMethod]
The method and all its derivables are empty
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/sampling/SamplingService.java`
#### Snippet
```java

    @Override
    public void prepare() {
    }

```

### RuleId[ruleID=EmptyMethod]
The method and all its derivables are empty
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/sampling/SamplingService.java`
#### Snippet
```java

    @Override
    public void onComplete() {

    }
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `apm-sniffer/optional-plugins/trace-ignore-plugin/src/main/java/org/apache/skywalking/apm/plugin/trace/ignore/TraceIgnoreExtendService.java`
#### Snippet
```java

    @Override
    public void shutdown() {
        super.shutdown();
    }
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `apm-sniffer/optional-plugins/trace-ignore-plugin/src/main/java/org/apache/skywalking/apm/plugin/trace/ignore/TraceIgnoreExtendService.java`
#### Snippet
```java

    @Override
    public void forceSampled() {
        super.forceSampled();
    }
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `apm-sniffer/optional-plugins/trace-sampler-cpu-policy-plugin/src/main/java/org/apache/skywalking/apm/plugin/cpu/policy/TraceSamplerCpuPolicyExtendService.java`
#### Snippet
```java

    @Override
    public void shutdown() {
        super.shutdown();
    }
```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `apm-sniffer/optional-plugins/trace-sampler-cpu-policy-plugin/src/main/java/org/apache/skywalking/apm/plugin/cpu/policy/TraceSamplerCpuPolicyExtendService.java`
#### Snippet
```java

    @Override
    public void forceSampled() {
        super.forceSampled();
    }
```

## RuleId[ruleID=RedundantFieldInitialization]
### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-sdk-plugin/dubbo-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo3/DubboPluginConfig.java`
#### Snippet
```java
            public static int CONSUMER_ARGUMENTS_LENGTH_THRESHOLD = 256;

            public static boolean COLLECT_PROVIDER_ARGUMENTS = false;

            public static int PROVIDER_ARGUMENTS_LENGTH_THRESHOLD = 256;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-sdk-plugin/dubbo-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo3/DubboPluginConfig.java`
#### Snippet
```java
        public static class Dubbo {

            public static boolean COLLECT_CONSUMER_ARGUMENTS = false;

            public static int CONSUMER_ARGUMENTS_LENGTH_THRESHOLD = 256;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-sdk-plugin/dubbo-2.7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo/DubboPluginConfig.java`
#### Snippet
```java
        public static class Dubbo {

            public static boolean COLLECT_CONSUMER_ARGUMENTS = false;

            public static int CONSUMER_ARGUMENTS_LENGTH_THRESHOLD = 256;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-sdk-plugin/dubbo-2.7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo/DubboPluginConfig.java`
#### Snippet
```java
            public static int CONSUMER_ARGUMENTS_LENGTH_THRESHOLD = 256;

            public static boolean COLLECT_PROVIDER_ARGUMENTS = false;

            public static int PROVIDER_ARGUMENTS_LENGTH_THRESHOLD = 256;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-sdk-plugin/elasticsearch-6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v6/ElasticsearchPluginConfig.java`
#### Snippet
```java
             * If true, trace all the DSL(Domain Specific Language) in ElasticSearch access, default is false.
             */
            public static boolean TRACE_DSL = false;

            public static int ELASTICSEARCH_DSL_LENGTH_THRESHOLD = 1024;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-sdk-plugin/mongodb-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/mongodb/v3/MongoPluginConfig.java`
#### Snippet
```java
             * include parameters.
             */
            public static boolean TRACE_PARAM = false;

            /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-sdk-plugin/elasticsearch-7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v7/ElasticsearchPluginConfig.java`
#### Snippet
```java
             * If true, trace all the DSL(Domain Specific Language) in ElasticSearch access, default is false
             */
            public static boolean TRACE_DSL = false;

            public static int ELASTICSEARCH_DSL_LENGTH_THRESHOLD = 1024;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/optional-plugins/trace-sampler-cpu-policy-plugin/src/main/java/org/apache/skywalking/apm/plugin/cpu/policy/TraceSamplerCpuPolicyExtendService.java`
#### Snippet
```java
    private static final ILog LOGGER = LogManager.getLogger(TraceSamplerCpuPolicyExtendService.class);

    private volatile boolean cpuUsagePercentLimitOn = false;
    private volatile JVMService jvmService;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/JDBCPluginConfig.java`
#### Snippet
```java
             * collected.
             */
            public static volatile boolean TRACE_SQL_PARAMETERS = false;
            /**
             * For the sake of performance, SkyWalking won't save the entire parameters string into the tag, but only
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/define/StatementEnhanceInfos.java`
#### Snippet
```java
    private String sql;
    private Object[] parameters;
    private int maxIndex = 0;

    public StatementEnhanceInfos(ConnectionInfo connectionInfo, String sql, String statementName) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-application-toolkit/apm-toolkit-opentracing/src/main/java/org/apache/skywalking/apm/toolkit/opentracing/SkywalkingSpanBuilder.java`
#### Snippet
```java
    private List<Tag> tags = new ArrayList<Tag>();
    private String operationName;
    private boolean isEntry = false;
    private boolean isExit = false;
    private int port;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-application-toolkit/apm-toolkit-opentracing/src/main/java/org/apache/skywalking/apm/toolkit/opentracing/SkywalkingSpanBuilder.java`
#### Snippet
```java
    private int port;
    private String peer;
    private boolean isError = false;
    private long startTime;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-application-toolkit/apm-toolkit-opentracing/src/main/java/org/apache/skywalking/apm/toolkit/opentracing/SkywalkingSpanBuilder.java`
#### Snippet
```java
    private String operationName;
    private boolean isEntry = false;
    private boolean isExit = false;
    private int port;
    private String peer;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-sdk-plugin/micronaut-plugins/micronaut-http-server-plugin/src/main/java/org/apache/skywalking/apm/plugin/micronaut/http/server/MicronautHttpServerPluginConfig.java`
#### Snippet
```java
             * This config item controls that whether the Http plugin should collect the parameters of the request.
             */
            public static boolean COLLECT_HTTP_PARAMS = false;
        }

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `apm-sniffer/apm-sdk-plugin/thrift-plugin/src/main/java/org/apache/skywalking/apm/plugin/thrift/TBaseAsyncProcessorInterceptor.java`
#### Snippet
```java
 */
public class TBaseAsyncProcessorInterceptor implements InstanceConstructorInterceptor, InstanceMethodsAroundInterceptor {
    private Map<String, AsyncProcessFunction> processMapView = null;

    @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0L` is redundant
in `apm-sniffer/apm-sdk-plugin/thrift-plugin/src/main/java/org/apache/skywalking/apm/plugin/thrift/wrapper/AbstractContext.java`
#### Snippet
```java
public abstract class AbstractContext {
    public String methodName;
    public long startTime = 0L;

    public abstract String getArguments();
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `apm-commons/apm-datacarrier/src/main/java/org/apache/skywalking/apm/commons/datacarrier/partition/SimpleRollingPartitioner.java`
#### Snippet
```java
public class SimpleRollingPartitioner<T> implements IDataPartitioner<T> {
    @SuppressWarnings("NonAtomicVolatileUpdate")
    private volatile int i = 0;

    @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-commons/apm-datacarrier/src/main/java/org/apache/skywalking/apm/commons/datacarrier/consumer/BulkConsumePool.java`
#### Snippet
```java
public class BulkConsumePool implements ConsumerPool {
    private List<MultipleChannelsConsumer> allConsumers;
    private volatile boolean isStarted = false;

    public BulkConsumePool(String name, int size, long consumeCycle) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-sdk-plugin/spring-plugins/mvc-annotation-commons/src/main/java/org/apache/skywalking/apm/plugin/spring/mvc/commons/SpringMVCPluginConfig.java`
#### Snippet
```java
             * default is false.
             */
            public static boolean USE_QUALIFIED_NAME_AS_ENDPOINT_NAME = false;

            /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-sdk-plugin/spring-plugins/mvc-annotation-commons/src/main/java/org/apache/skywalking/apm/plugin/spring/mvc/commons/SpringMVCPluginConfig.java`
#### Snippet
```java
             * request.
             */
            public static boolean COLLECT_HTTP_PARAMS = false;
        }

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-sdk-plugin/mongodb-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/mongodb/v4/support/MongoPluginConfig.java`
#### Snippet
```java
             * include parameters.
             */
            public static boolean TRACE_PARAM = false;

            /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/optional-plugins/optional-spring-plugins/spring-tx-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/transaction/SpringTXPluginConfig.java`
#### Snippet
```java
             * If true, the transaction definition name will be simplified
             */
            public static boolean SIMPLIFY_TRANSACTION_DEFINITION_NAME = false;
        }
    }
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-sdk-plugin/tomcat-10x-plugin/src/main/java/org/apache/skywalking/apm/plugin/tomcat10x/TomcatPluginConfig.java`
#### Snippet
```java
             * This config item controls that whether the Tomcat plugin should collect the parameters of the request.
             */
            public static boolean COLLECT_HTTP_PARAMS = false;
        }

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-sdk-plugin/micronaut-plugins/micronaut-http-client-plugin/src/main/java/org/apache/skywalking/apm/plugin/micronaut/http/client/MicronautHttpClientPluginConfig.java`
#### Snippet
```java
             * This config item controls that whether the HttpClient plugin should collect the parameters of the request.
             */
            public static boolean COLLECT_HTTP_PARAMS = false;
        }

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-sdk-plugin/neo4j-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/neo4j/v4x/Neo4jPluginConfig.java`
#### Snippet
```java
             * If set to true, the parameters of the cypher would be collected.
             */
            public static boolean TRACE_CYPHER_PARAMETERS = false;
            /**
             * For the sake of performance, SkyWalking won't save the entire parameters string into the tag, but only
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-sdk-plugin/redisson-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/redisson/v3/RedissonPluginConfig.java`
#### Snippet
```java
             * If set to true, the parameters of the Redis command would be collected.
             */
            public static boolean TRACE_REDIS_PARAMETERS = false;
            /**
             * For the sake of performance, SkyWalking won't save Redis parameter string into the tag.
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-sdk-plugin/kafka-commons/src/main/java/org/apache/skywalking/apm/plugin/kafka/define/KafkaContext.java`
#### Snippet
```java
    }

    private boolean needStop = false;

    private String operationName;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-application-toolkit/apm-toolkit-logback-1.x/src/main/java/org/apache/skywalking/apm/toolkit/log/logback/v1/x/mdc/LogbackMDCPatternConverter.java`
#### Snippet
```java
    private static final String CONVERT_SKYWALKING_CONTEXT_KEY = "sw_ctx";

    private boolean convert4TID = false;
    private boolean convert4SWCTX = false;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-application-toolkit/apm-toolkit-logback-1.x/src/main/java/org/apache/skywalking/apm/toolkit/log/logback/v1/x/mdc/LogbackMDCPatternConverter.java`
#### Snippet
```java

    private boolean convert4TID = false;
    private boolean convert4SWCTX = false;

    @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-sdk-plugin/spring-plugins/concurrent-util-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/concurrent/match/EitherInterfaceMatch.java`
#### Snippet
```java
    private static class MatchResult {
        private boolean findMatchInterface = false;
        private boolean findMutexInterface = false;

        public boolean result() {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-sdk-plugin/spring-plugins/concurrent-util-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/concurrent/match/EitherInterfaceMatch.java`
#### Snippet
```java

    private static class MatchResult {
        private boolean findMatchInterface = false;
        private boolean findMutexInterface = false;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-sdk-plugin/feign-default-http-9.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/feign/http/v9/FeignPluginConfig.java`
#### Snippet
```java
             * This config item controls that whether the Feign plugin should collect the http body of the request.
             */
            public static boolean COLLECT_REQUEST_BODY = false;

            /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `apm-application-toolkit/apm-toolkit-meter/src/main/java/org/apache/skywalking/apm/toolkit/meter/Histogram.java`
#### Snippet
```java

    public static class Builder extends BaseBuilder<Builder, Histogram> {
        private double minValue = 0;
        private List<Double> steps;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/FinagleCtxs.java`
#### Snippet
```java
    static LocalContext.Key<AbstractSpan> SW_SPAN = null;

    static LocalContext.Key<String> PEER_HOST = null;

    static {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/FinagleCtxs.java`
#### Snippet
```java
class FinagleCtxs {

    static LocalContext.Key<AbstractSpan> SW_SPAN = null;

    static LocalContext.Key<String> PEER_HOST = null;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-sdk-plugin/tomcat-7.x-8.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/tomcat78x/TomcatPluginConfig.java`
#### Snippet
```java
             * This config item controls that whether the Tomcat plugin should collect the parameters of the request.
             */
            public static boolean COLLECT_HTTP_PARAMS = false;
        }

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-sdk-plugin/elasticsearch-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v5/ElasticsearchPluginConfig.java`
#### Snippet
```java
             * If true, trace all the DSL(Domain Specific Language) in ElasticSearch access, default is false.
             */
            public static boolean TRACE_DSL = false;

            public static int ELASTICSEARCH_DSL_LENGTH_THRESHOLD = 1024;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-sdk-plugin/solrj-7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/solrj/SolrJPluginConfig.java`
#### Snippet
```java
             * default is false.
             */
            public static boolean TRACE_STATEMENT = false;

            /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-sdk-plugin/solrj-7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/solrj/SolrJPluginConfig.java`
#### Snippet
```java
             * If true, trace all the operation parameters in Solr request, default is false.
             */
            public static boolean TRACE_OPS_PARAMS = false;
        }
    }
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/os/OSUtil.java`
#### Snippet
```java
    private static volatile String HOST_NAME;
    private static volatile List<String> IPV4_LIST;
    private static volatile int PROCESS_NO = 0;

    public static String getOsName() {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/jvm/JVMMetricsSender.java`
#### Snippet
```java

    private volatile GRPCChannelStatus status = GRPCChannelStatus.DISCONNECT;
    private volatile JVMMetricReportServiceGrpc.JVMMetricReportServiceBlockingStub stub = null;

    private LinkedBlockingQueue<JVMMetric> queue;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/jvm/gc/GCModule.java`
#### Snippet
```java
    private long lastOGCCollectionTime = 0;
    private long lastYGCCollectionTime = 0;
    private long lastNormalGCCount = 0;
    private long lastNormalGCTime = 0;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/jvm/gc/GCModule.java`
#### Snippet
```java
    private List<GarbageCollectorMXBean> beans;

    private long lastOGCCount = 0;
    private long lastYGCCount = 0;
    private long lastOGCCollectionTime = 0;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/jvm/gc/GCModule.java`
#### Snippet
```java
    private long lastYGCCount = 0;
    private long lastOGCCollectionTime = 0;
    private long lastYGCCollectionTime = 0;
    private long lastNormalGCCount = 0;
    private long lastNormalGCTime = 0;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/jvm/gc/GCModule.java`
#### Snippet
```java

    private long lastOGCCount = 0;
    private long lastYGCCount = 0;
    private long lastOGCCollectionTime = 0;
    private long lastYGCCollectionTime = 0;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/jvm/gc/GCModule.java`
#### Snippet
```java
    private long lastYGCCollectionTime = 0;
    private long lastNormalGCCount = 0;
    private long lastNormalGCTime = 0;

    public GCModule(List<GarbageCollectorMXBean> beans) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/jvm/gc/GCModule.java`
#### Snippet
```java
    private long lastOGCCount = 0;
    private long lastYGCCount = 0;
    private long lastOGCCollectionTime = 0;
    private long lastYGCCollectionTime = 0;
    private long lastNormalGCCount = 0;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/conf/Constants.java`
#### Snippet
```java
    public static String EVENT_LAYER_NAME = "GENERAL";

    public static int NULL_VALUE = 0;
}

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/conf/Config.java`
#### Snippet
```java
         * may ask for these files in order to resolve compatible problem.
         */
        public static boolean IS_OPEN_DEBUGGING_CLASS = false;

        /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/conf/Config.java`
#### Snippet
```java
         * mode), allow other javaagent to enhance those classes that enhanced by SkyWalking agent.
         */
        public static boolean IS_CACHE_ENHANCED_CLASS = false;

        /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/conf/Config.java`
#### Snippet
```java
         * Keep tracing even the backend is not available.
         */
        public static boolean KEEP_TRACING = false;

        /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/conf/Config.java`
#### Snippet
```java
         * If true, skywalking agent will enable periodically resolving DNS to update receiver service addresses.
         */
        public static boolean IS_RESOLVE_DNS_PERIODICALLY = false;
    }

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/conf/Config.java`
#### Snippet
```java
         * Force open TLS for gRPC channel if true.
         */
        public static boolean FORCE_TLS = false;

        /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/conf/SnifferConfigInitializer.java`
#### Snippet
```java
    private static final String ENV_KEY_PREFIX = "skywalking.";
    private static Properties AGENT_SETTINGS;
    private static boolean IS_INIT_COMPLETED = false;

    /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/EnhanceContext.java`
#### Snippet
```java
     * The object has already been enhanced or extended. e.g. added the new field, or implemented the new interface
     */
    private boolean objectExtended = false;

    public boolean isEnhanced() {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/EnhanceContext.java`
#### Snippet
```java
 */
public class EnhanceContext {
    private boolean isEnhanced = false;
    /**
     * The object has already been enhanced or extended. e.g. added the new field, or implemented the new interface
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/meter/Histogram.java`
#### Snippet
```java

    public static class Builder extends AbstractBuilder<Builder, Histogram> {
        private double minValue = 0;
        private List<Double> steps;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/PluginFinder.java`
#### Snippet
```java
    private final List<AbstractClassEnhancePluginDefine> signatureMatchDefine = new ArrayList<AbstractClassEnhancePluginDefine>();
    private final List<AbstractClassEnhancePluginDefine> bootstrapClassMatchDefine = new ArrayList<AbstractClassEnhancePluginDefine>();
    private static boolean IS_PLUGIN_INIT_COMPLETED = false;

    public PluginFinder(List<AbstractClassEnhancePluginDefine> plugins) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/MethodInterceptResult.java`
#### Snippet
```java
    private boolean isContinue = true;

    private Object ret = null;

    /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/remote/GRPCChannelManager.java`
#### Snippet
```java
    private static final ILog LOGGER = LogManager.getLogger(GRPCChannelManager.class);

    private volatile GRPCChannel managedChannel = null;
    private volatile ScheduledFuture<?> connectCheckFuture;
    private volatile boolean reconnect = true;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/remote/GRPCChannelManager.java`
#### Snippet
```java
    private volatile List<String> grpcServers;
    private volatile int selectedIdx = -1;
    private volatile int reconnectCount = 0;

    @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/trace/TraceSegment.java`
#### Snippet
```java
    private boolean ignore = false;

    private boolean isSizeLimited = false;

    private final long createTime;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/trace/TraceSegment.java`
#### Snippet
```java
    private DistributedTraceId relatedGlobalTraceId;

    private boolean ignore = false;

    private boolean isSizeLimited = false;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/TracingContext.java`
#### Snippet
```java
     * @since 8.10.0 replace the removed "firstSpan"(before 8.10.0) reference. see {@link PrimaryEndpoint} for more details.
     */
    private PrimaryEndpoint primaryEndpoint = null;

    /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/TracingContext.java`
#### Snippet
```java
public class TracingContext implements AbstractTracerContext {
    private static final ILog LOGGER = LogManager.getLogger(TracingContext.class);
    private long lastWarningTimestamp = 0;

    /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/trace/AbstractTracingSpan.java`
#### Snippet
```java
    protected boolean errorOccurred = false;

    protected int componentId = 0;

    /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/trace/AbstractTracingSpan.java`
#### Snippet
```java
     * The span has been tagged in async mode, required async stop to finish.
     */
    protected volatile boolean isInAsyncMode = false;
    /**
     * The flag represents whether the span has been async stopped
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/trace/AbstractTracingSpan.java`
#### Snippet
```java
     * Error has occurred in the scope of span.
     */
    protected boolean errorOccurred = false;

    protected int componentId = 0;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/trace/AbstractTracingSpan.java`
#### Snippet
```java
     * The flag represents whether the span has been async stopped
     */
    private volatile boolean isAsyncStopped = false;

    /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/profile/ThreadProfiler.java`
#### Snippet
```java
    private final ProfileStatusReference profilingStatus;
    // thread dump sequence
    private int dumpSequence = 0;

    public ThreadProfiler(TracingContext tracingContext, String traceSegmentId, Thread profilingThread,
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/sampling/SamplingService.java`
#### Snippet
```java
    private static final ILog LOGGER = LogManager.getLogger(SamplingService.class);

    private volatile boolean on = false;
    private volatile AtomicInteger samplingFactorHolder;
    private volatile ScheduledFuture<?> scheduledFuture;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-sdk-plugin/httpclient-commons/src/main/java/org/apache/skywalking/apm/plugin/httpclient/HttpClientPluginConfig.java`
#### Snippet
```java
             * This config item controls that whether the HttpClient plugin should collect the parameters of the request.
             */
            public static boolean COLLECT_HTTP_PARAMS = false;
        }

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/ToolkitPluginConfig.java`
#### Snippet
```java
             * operation name, default is false.
             */
            public static boolean USE_QUALIFIED_NAME_AS_OPERATION_NAME = false;
        }
    }
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/Parser.java`
#### Snippet
```java
    private final String pattern;
    private final int patternLength;
    private int pointer = 0;
    private State state = State.LITERAL_STATE;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-sdk-plugin/lettuce-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/lettuce/v5/LettucePluginConfig.java`
#### Snippet
```java
             * If set to true, the parameters of the Redis command would be collected.
             */
            public static boolean TRACE_REDIS_PARAMETERS = false;
            /**
             * For the sake of performance, SkyWalking won't save Redis parameter string into the tag.
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `apm-sniffer/apm-sdk-plugin/light4j-plugins/light4j-plugin/src/main/java/org/apache/skywalking/apm/plugin/light4j/Light4JPluginConfig.java`
#### Snippet
```java
             * generating a local span for each.
             */
            public static boolean TRACE_HANDLER_CHAIN = false;
        }
    }
```

## RuleId[ruleID=RedundantImplements]
### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Serializable`
in `apm-commons/apm-datacarrier/src/main/java/org/apache/skywalking/apm/commons/datacarrier/common/AtomicRangeInteger.java`
#### Snippet
```java
import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicRangeInteger extends Number implements Serializable {
    private static final long serialVersionUID = -4099792402691141643L;
    private AtomicIntegerArray values;
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `InstanceMethodsAroundInterceptor`
in `apm-sniffer/apm-sdk-plugin/avro-plugin/src/main/java/org/apache/skywalking/apm/plugin/avro/SpecificRequestorInterceptor.java`
#### Snippet
```java
import org.apache.skywalking.apm.network.trace.component.ComponentsDefine;

public class SpecificRequestorInterceptor extends AbstractRequestInterceptor implements InstanceMethodsAroundInterceptor {

    @Override
```

## RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/loader/AgentClassLoader.java`
#### Snippet
```java
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        List<Jar> allJars = getAllJars();
        String path = name.replace('.', '/').concat(".class");
        for (Jar jar : allJars) {
            JarEntry entry = jar.jarFile.getJarEntry(path);
```

## RuleId[ruleID=InstanceofCatchParameter]
### RuleId[ruleID=InstanceofCatchParameter]
'instanceof' on 'catch' parameter `e`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/meter/MeterSender.java`
#### Snippet
```java
                transform(meterMap, meterData -> reporter.onNext(meterData));
            } catch (Throwable e) {
                if (!(e instanceof StatusRuntimeException)) {
                    LOGGER.error(e, "Report meters to backend fail.");
                    return;
```

### RuleId[ruleID=InstanceofCatchParameter]
'instanceof' on 'catch' parameter `t`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/profile/ProfileTaskChannelService.java`
#### Snippet
```java
                ServiceManager.INSTANCE.findService(CommandService.class).receiveCommand(commands);
            } catch (Throwable t) {
                if (!(t instanceof StatusRuntimeException)) {
                    LOGGER.error(t, "Query profile task from backend fail.");
                    return;
```

## RuleId[ruleID=SynchronizeOnThis]
### RuleId[ruleID=SynchronizeOnThis]
Lock operations on a class may have unforeseen side-effects
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/loader/AgentClassLoader.java`
#### Snippet
```java
    public static void initDefaultLoader() throws AgentPackageNotFoundException {
        if (DEFAULT_LOADER == null) {
            synchronized (AgentClassLoader.class) {
                if (DEFAULT_LOADER == null) {
                    DEFAULT_LOADER = new AgentClassLoader(PluginBootstrap.class.getClassLoader());
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/TracingContext.java`
#### Snippet
```java
    public AbstractTracerContext awaitFinishAsync() {
        if (!isRunningInAsyncMode) {
            synchronized (this) {
                if (!isRunningInAsyncMode) {
                    asyncFinishLock = new ReentrantLock();
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/optional-plugins/kotlin-coroutine-plugin/src/main/java/org/apache/skywalking/apm/plugin/kotlin/coroutine/define/DispatcherInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/tomcat-thread-pool-plugin/src/main/java/org/apache/skywalking/apm/plugin/tomcat/thread/pool/define/TomcatThreadExecutorInstrumentation.java`
#### Snippet
```java
    @Override
    public StaticMethodsInterceptPoint[] getStaticMethodsInterceptPoints() {
        return new StaticMethodsInterceptPoint[0];
    }
}
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/tomcat-thread-pool-plugin/src/main/java/org/apache/skywalking/apm/plugin/tomcat/thread/pool/define/TomcatThreadExecutorInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/guava-eventbus-plugin/src/main/java/org/apache/skywalking/apm/plugin/guava/eventbus/define/EventBusDispatcherInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/asynchttpclient-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/asynchttpclient/v2/define/DefaultAsyncHttpClientInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/vertx-plugins/vertx-core-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/vertx4/define/ClusteredMessageConstructorInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/vertx-plugins/vertx-core-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/vertx4/define/VertxBuilderConstructorInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/spring-plugins/mvc-annotation-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/mvc/v3/define/HandlerMethodInvokerInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/spring-plugins/mvc-annotation-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/mvc/v3/define/InvocableHandlerInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/spring-plugins/mvc-annotation-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/mvc/v3/define/HandlerMethodInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/dubbo-2.7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo/AbstractServerInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[0];
    }
}
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-log4j-2.x-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/log/log4j/v2/x/SkyWalkingContextConverterActivation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-log4j-2.x-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/log/log4j/v2/x/TraceIdConverterActivation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-log4j-2.x-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/log/log4j/v2/x/async/AsyncLoggerConfigInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-log4j-2.x-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/log/log4j/v2/x/async/CreateMementoInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-log4j-2.x-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/log/log4j/v2/x/async/CreateMementoInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-log4j-2.x-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/log/log4j/v2/x/async/RingBufferLogEventInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-log4j-2.x-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/log/log4j/v2/x/async/Log4jLogEventInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-log4j-2.x-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/log/log4j/v2/x/async/AsyncAppenderInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/shardingsphere-plugins/sharding-sphere-5.0.0-plugin/src/main/java/org/apache/skywalking/apm/plugin/shardingsphere/v500/define/ParseInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/shardingsphere-plugins/sharding-sphere-5.0.0-plugin/src/main/java/org/apache/skywalking/apm/plugin/shardingsphere/v500/define/ExecuteInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/shardingsphere-plugins/sharding-sphere-5.0.0-plugin/src/main/java/org/apache/skywalking/apm/plugin/shardingsphere/v500/define/RewriteInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }
    
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/shardingsphere-plugins/sharding-sphere-5.0.0-plugin/src/main/java/org/apache/skywalking/apm/plugin/shardingsphere/v500/define/ProxyRootInvokeInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/shardingsphere-plugins/sharding-sphere-5.0.0-plugin/src/main/java/org/apache/skywalking/apm/plugin/shardingsphere/v500/define/JDBCRootInvokeInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/shardingsphere-plugins/sharding-sphere-5.0.0-plugin/src/main/java/org/apache/skywalking/apm/plugin/shardingsphere/v500/define/RouteInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }
    
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/baidu-brpc-plugin/src/main/java/org/apache/skywalking/apm/plugin/baidu/brpc/define/ServerInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/baidu-brpc-plugin/src/main/java/org/apache/skywalking/apm/plugin/baidu/brpc/define/ClientInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/optional-plugins/jackson-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jackson/define/AbstractInstrumentation.java`
#### Snippet
```java
        }

        return points.toArray(new InstanceMethodsInterceptPoint[0]);
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/optional-plugins/jackson-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jackson/define/AbstractInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/graphql-plugin/graphql-16plus-plugin/src/main/java/org/apache/skywalking/apm/plugin/graphql/v16plus/define/GraphqlInstrumentation.java`
#### Snippet
```java

    @Override public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/jetty-plugin/jetty-client-9.0-plugin/src/main/java/org/apache/skywalking/apm/plugin/jetty/v90/client/define/HttpRequestInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/optional-plugins/optional-spring-plugins/optional-spring-cloud/gateway-2.0.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/cloud/gateway/v20x/define/HttpClientInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/optional-plugins/optional-spring-plugins/optional-spring-cloud/gateway-2.0.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/cloud/gateway/v20x/define/NettyRoutingFilterInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/optional-plugins/optional-spring-plugins/optional-spring-cloud/gateway-2.0.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/cloud/gateway/v20x/define/HttpClientRequestInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/okhttp-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/okhttp/v2/define/CallbackInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/elasticsearch-6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v6/define/TransportServiceInstrumentation.java`
#### Snippet
```java
    @Override
    public StaticMethodsInterceptPoint[] getStaticMethodsInterceptPoints() {
        return new StaticMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/elasticsearch-6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v6/define/TransportServiceInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/elasticsearch-6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v6/define/TransportActionNodeProxyInstrumentation.java`
#### Snippet
```java
    @Override
    public StaticMethodsInterceptPoint[] getStaticMethodsInterceptPoints() {
        return new StaticMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/elasticsearch-6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v6/define/IndicesClientInstrumentation.java`
#### Snippet
```java
    @Override
    public StaticMethodsInterceptPoint[] getStaticMethodsInterceptPoints() {
        return new StaticMethodsInterceptPoint[0];
    }
}
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/elasticsearch-6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v6/define/IndicesClientInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/elasticsearch-6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v6/define/ClusterClientInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/elasticsearch-6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v6/define/ClusterClientInstrumentation.java`
#### Snippet
```java
    @Override
    public StaticMethodsInterceptPoint[] getStaticMethodsInterceptPoints() {
        return new StaticMethodsInterceptPoint[0];
    }
}
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/elasticsearch-6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v6/define/AdapterActionFutureInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/elasticsearch-6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v6/define/AdapterActionFutureInstrumentation.java`
#### Snippet
```java
    @Override
    public StaticMethodsInterceptPoint[] getStaticMethodsInterceptPoints() {
        return new StaticMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/elasticsearch-6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v6/define/RestHighLevelClientInstrumentation.java`
#### Snippet
```java
    @Override
    public StaticMethodsInterceptPoint[] getStaticMethodsInterceptPoints() {
        return new StaticMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/okhttp-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/okhttp/v3/define/CallbackInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/rocketMQ-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/rocketMQ/v4/define/DefaultMQPushConsumerInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/rocketMQ-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/rocketMQ/v4/define/SendCallbackInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/rocketMQ-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/rocketMQ/v4/define/ConsumeMessageConcurrentlyInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/rocketMQ-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/rocketMQ/v4/define/ConsumeMessageOrderlyInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/rocketMQ-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/rocketMQ/v4/define/MQClientAPIImplInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/shardingsphere-plugins/sharding-sphere-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/shardingsphere/define/ExecuteInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/shardingsphere-plugins/sharding-sphere-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/shardingsphere/define/ParseInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/shardingsphere-plugins/sharding-sphere-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/shardingsphere/define/ProxyRootInvokeInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/shardingsphere-plugins/sharding-sphere-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/shardingsphere/define/JDBCRootInvokeInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/httpasyncclient-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/httpasyncclient/v4/define/LeaseRequestInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/okhttp-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/okhttp/v4/define/CallbackInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/mysql-8.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/mysql/v8/define/CacheIpsInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/mysql-8.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/mysql/v8/define/CallableInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/mysql-8.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/mysql/v8/define/StatementInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/mysql-8.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/mysql/v8/define/PreparedStatementInstrumentation.java`
#### Snippet
```java
    @Override
    public final ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/mysql-8.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/mysql/v8/define/ConnectionInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/mongodb-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/mongodb/v3/define/v36/MongoDBOperationExecutorInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/spring-plugins/spring-kafka-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/kafka/define/LegacyListenerConsumerInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/mongodb-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/mongodb/v3/define/v37/MongoDBOperationExecutorInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/mongodb-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/mongodb/v3/define/v38/MongoDBOperationExecutorInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/jedis-plugins/jedis-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jedis/v4/define/AbstractWitnessInstrumentation.java`
#### Snippet
```java
    @Override
    protected String[] witnessClasses() {
        return new String[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/spring-plugins/spring-kafka-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/kafka/define/ListenerConsumerInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/spring-plugins/spring-kafka-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/kafka/define/KafkaTemplateInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/elasticsearch-7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v7/define/AdapterActionFutureInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/elasticsearch-7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v7/define/AdapterActionFutureInstrumentation.java`
#### Snippet
```java
    @Override
    public StaticMethodsInterceptPoint[] getStaticMethodsInterceptPoints() {
        return new StaticMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/optional-plugins/optional-spring-plugins/spring-webflux-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/webflux/v5/define/ServerWebExchangeInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/optional-plugins/optional-spring-plugins/spring-webflux-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/webflux/v5/define/DispatcherHandlerInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/baidu-brpc-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/baidu/brpc3/ServerInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/netty-socketio-plugin/src/main/java/org/apache/skywalking/apm/plugin/netty/socketio/define/NettySocketIOPluginNameSpaceInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/dbcp-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/dbcp/v2/define/DelegatingConnectionInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/dbcp-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/dbcp/v2/define/DelegatingConnectionInstrumentation.java`
#### Snippet
```java
    @Override
    public StaticMethodsInterceptPoint[] getStaticMethodsInterceptPoints() {
        return new StaticMethodsInterceptPoint[0];
    }
}
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/optional-plugins/fastjson-1.2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/fastjson/define/FastjsonInstrumentation.java`
#### Snippet
```java
        }

        return points.toArray(new StaticMethodsInterceptPoint[0]);
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/dbcp-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/dbcp/v2/define/BasicDataSourceInstrumentation.java`
#### Snippet
```java
    @Override
    public StaticMethodsInterceptPoint[] getStaticMethodsInterceptPoints() {
        return new StaticMethodsInterceptPoint[0];
    }
}
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/dbcp-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/dbcp/v2/define/BasicDataSourceInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/grpc-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/grpc/v1/define/AbstractServerImplBuilderInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/grpc-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/grpc/v1/define/ShadedNettyClientStreamInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[0];
    }
}
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/grpc-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/grpc/v1/define/NettyClientStreamInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[0];
    }
}
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/mssql-commons/src/main/java/org/apache/skywalking/apm/plugin/mssql/commons/define/AbstractConnectionInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/hystrix-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/hystrix/v1/define/HystrixPluginsInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/define/AbstractDriverInstrumentation.java`
#### Snippet
```java
    @Override
    public final ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-opentracing-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/opentracing/tracer/SkywalkingTracerActivation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/connectionurl/parser/OracleURLParser.java`
#### Snippet
```java
        while (true);

        return StringUtil.join(',', hosts.toArray(new String[0]));
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/micronaut-plugins/micronaut-http-server-plugin/src/main/java/org/apache/skywalking/apm/plugin/micronaut/http/server/define/RouteMatchInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/servicecomb-plugin/servicecomb-java-chassis-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/servicecomb/v2/define/TransportClientHandlerInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/servicecomb-plugin/servicecomb-java-chassis-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/servicecomb/v2/define/ProducerOperationHandlerInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/micronaut-plugins/micronaut-http-server-plugin/src/main/java/org/apache/skywalking/apm/plugin/micronaut/http/server/define/RoutingInBoundHandlerInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/mysql-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/mysql/v5/define/AbstractConnectionInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/mysql-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/mysql/v5/define/CallableInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/mysql-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/mysql/v5/define/CacheIpsInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/mysql-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/mysql/v5/define/StatementInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/mysql-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/mysql/v5/define/PreparedStatementInstrumentation.java`
#### Snippet
```java
    @Override
    public final ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/nats-2.14.x-2.15.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/nats/client/define/NatsMessageInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/nats-2.14.x-2.15.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/nats/client/define/NatsConnectionInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/motan-plugin/src/main/java/org/apache/skywalking/apm/plugin/motan/define/MotanProviderInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/jetty-plugin/jetty-server-9.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jetty/v9/server/define/JettyInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/optional-plugins/shenyu-2.4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/shenyu/v24x/define/GrpcPluginInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/optional-plugins/shenyu-2.4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/shenyu/v24x/define/MotanRpcPluginInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/optional-plugins/shenyu-2.4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/shenyu/v24x/define/TarsRpcPluginInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/optional-plugins/shenyu-2.4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/shenyu/v24x/define/GlobalPluginInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/optional-plugins/shenyu-2.4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/shenyu/v24x/define/SofaRpcPluginInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/optional-plugins/shenyu-2.4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/shenyu/v24x/define/ApacheDubboPluginInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/druid-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/druid/v1/define/DruidPooledConnectionInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/druid-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/druid/v1/define/DruidPooledConnectionInstrumentation.java`
#### Snippet
```java
    @Override
    public StaticMethodsInterceptPoint[] getStaticMethodsInterceptPoints() {
        return new StaticMethodsInterceptPoint[0];
    }
}
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/druid-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/druid/v1/define/DruidDataSourceStatManagerInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/druid-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/druid/v1/define/DruidDataSourceStatManagerInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/druid-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/druid/v1/define/DruidDataSourceInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/druid-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/druid/v1/define/DruidDataSourceInstrumentation.java`
#### Snippet
```java
    @Override
    public StaticMethodsInterceptPoint[] getStaticMethodsInterceptPoints() {
        return new StaticMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/thrift-plugin/src/main/java/org/apache/skywalking/apm/plugin/thrift/define/TServerInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[] {};
    }
}
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/thrift-plugin/src/main/java/org/apache/skywalking/apm/plugin/thrift/define/transport/TSocketInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[] {};
    }
}
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/thrift-plugin/src/main/java/org/apache/skywalking/apm/plugin/thrift/define/client/TAsyncClientInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[] {};
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/undertow-plugins/undertow-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/undertow/v2x/define/HttpServerExchangeInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/undertow-plugins/undertow-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/undertow/v2x/define/UndertowRootHandlerInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/undertow-plugins/undertow-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/undertow/v2x/define/RoutingHandlerInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/undertow-plugins/undertow-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/undertow/v2x/define/UndertowAddListenerInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/undertow-plugins/undertow-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/undertow/v2x/define/UndertowListenerConfigInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/dubbo-3.x-conflict-patch/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo3/patch/MakeWrapperInterceptor.java`
#### Snippet
```java
            // setup static field.
            wc.getField("pts").set(null, pts);
            wc.getField("pns").set(null, pts.keySet().toArray(new String[0]));
            wc.getField("mns").set(null, mns.toArray(new String[0]));
            wc.getField("dmns").set(null, dmns.toArray(new String[0]));
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/dubbo-3.x-conflict-patch/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo3/patch/MakeWrapperInterceptor.java`
#### Snippet
```java
            wc.getField("pts").set(null, pts);
            wc.getField("pns").set(null, pts.keySet().toArray(new String[0]));
            wc.getField("mns").set(null, mns.toArray(new String[0]));
            wc.getField("dmns").set(null, dmns.toArray(new String[0]));
            int ix = 0;
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/dubbo-3.x-conflict-patch/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo3/patch/MakeWrapperInterceptor.java`
#### Snippet
```java
            wc.getField("pns").set(null, pts.keySet().toArray(new String[0]));
            wc.getField("mns").set(null, mns.toArray(new String[0]));
            wc.getField("dmns").set(null, dmns.toArray(new String[0]));
            int ix = 0;
            for (Method m : ms.values())
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/dubbo-2.7.x-conflict-patch/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo/patch/MakeWrapperInterceptor.java`
#### Snippet
```java
            // setup static field.
            wc.getField("pts").set(null, pts);
            wc.getField("pns").set(null, pts.keySet().toArray(new String[0]));
            wc.getField("mns").set(null, mns.toArray(new String[0]));
            wc.getField("dmns").set(null, dmns.toArray(new String[0]));
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/dubbo-2.7.x-conflict-patch/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo/patch/MakeWrapperInterceptor.java`
#### Snippet
```java
            wc.getField("pts").set(null, pts);
            wc.getField("pns").set(null, pts.keySet().toArray(new String[0]));
            wc.getField("mns").set(null, mns.toArray(new String[0]));
            wc.getField("dmns").set(null, dmns.toArray(new String[0]));
            int ix = 0;
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/dubbo-2.7.x-conflict-patch/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo/patch/MakeWrapperInterceptor.java`
#### Snippet
```java
            wc.getField("pns").set(null, pts.keySet().toArray(new String[0]));
            wc.getField("mns").set(null, mns.toArray(new String[0]));
            wc.getField("dmns").set(null, dmns.toArray(new String[0]));
            int ix = 0;
            for (Method m : ms.values())
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/spring-plugins/mvc-annotation-commons/src/main/java/org/apache/skywalking/apm/plugin/spring/mvc/commons/define/AnnotationMethodHandlerAdapterInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/spring-plugins/mvc-annotation-commons/src/main/java/org/apache/skywalking/apm/plugin/spring/mvc/commons/RequestUtil.java`
#### Snippet
```java
        Map<String, String[]> parameterMap = new HashMap<>(request.getQueryParams().size());
        request.getQueryParams().forEach((key, value) -> {
            parameterMap.put(key, value.toArray(new String[0]));
        });
        if (!parameterMap.isEmpty()) {
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/jetty-plugin/jetty-client-9.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jetty/v9/client/define/HttpRequestInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/spring-plugins/resttemplate-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/resttemplate/sync/define/RestTemplateInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/spring-plugins/resttemplate-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/resttemplate/async/define/RestTemplateInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/mssql-jtds-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/mssql/jtds/v1/define/StatementInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/spring-plugins/resttemplate-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/resttemplate/async/define/ResponseExtractorFutureInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];

    }
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/spring-plugins/async-annotation-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/async/define/AsyncExecutionInterceptorInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/mssql-jtds-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/mssql/jtds/v1/define/PreparedStatementInstrumentation.java`
#### Snippet
```java
    @Override
    public final ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/h2-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/h2/define/AbstractConnectionInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/mongodb-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/mongodb/v4/define/MongoDBOperationExecutorInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/hikaricp-3.x-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/hikaricp/define/HikariProxyConnectionInstrumentation.java`
#### Snippet
```java
    @Override
    public StaticMethodsInterceptPoint[] getStaticMethodsInterceptPoints() {
        return new StaticMethodsInterceptPoint[0];
    }
}
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/hikaricp-3.x-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/hikaricp/define/HikariProxyConnectionInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/hikaricp-3.x-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/hikaricp/define/HikariDataSourceInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/hikaricp-3.x-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/hikaricp/define/HikariDataSourceInstrumentation.java`
#### Snippet
```java
    @Override
    public StaticMethodsInterceptPoint[] getStaticMethodsInterceptPoints() {
        return new StaticMethodsInterceptPoint[0];
    }
}
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/optional-plugins/optional-spring-plugins/spring-tx-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/transaction/define/AbstractPlatformTransactionManagerInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/mssql-jdbc-plugin/src/main/java/org/apache/skywalking/apm/plugin/mssql/jdbc/define/PreparedStatementInstrumentation.java`
#### Snippet
```java
    @Override
    public final ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/mssql-jdbc-plugin/src/main/java/org/apache/skywalking/apm/plugin/mssql/jdbc/define/StatementInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/micronaut-plugins/micronaut-http-client-plugin/src/main/java/org/apache/skywalking/apm/plugin/micronaut/http/client/define/MicronautClientInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/armeria-0.85.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/armeria/define/Armeria098ClientInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/armeria-0.85.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/armeria/define/Armeria086ClientInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/armeria-0.85.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/armeria/define/Armeria085ServerInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/armeria-0.85.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/armeria/define/Armeria085ClientInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/kylin-jdbc-2.6.x-3.x-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/kylin/define/StatementInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/kylin-jdbc-2.6.x-3.x-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/kylin/define/ConnectionInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/kylin-jdbc-2.6.x-3.x-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/kylin/define/PreparedStatementInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/neo4j-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/neo4j/v4x/define/UnmanagedTransactionInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/spring-plugins/spring-cloud/netflix-plugins/spring-cloud-feign-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/cloud/netflix/feign/v11/define/NetflixFeignInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/spring-plugins/mvc-annotation-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/mvc/v4/define/InvocableHandlerInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/spring-plugins/mvc-annotation-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/mvc/v4/define/HandlerMethodInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/redisson-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/redisson/v3/define/ConnectionManagerInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/redisson-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/redisson/v3/define/RedisClientInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/optional-plugins/optional-spring-plugins/optional-spring-cloud/gateway-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/cloud/gateway/v3x/define/NettyRoutingFilterInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/optional-plugins/optional-spring-plugins/optional-spring-cloud/gateway-2.1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/cloud/gateway/v21x/define/NettyRoutingFilterInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/optional-plugins/optional-spring-plugins/optional-spring-cloud/gateway-2.1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/cloud/gateway/v21x/define/TcpClientInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[0];
    }
}
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/pulsar-common/src/main/java/org/apache/skywalking/apm/plugin/pulsar/common/define/BaseMessageInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/pulsar-common/src/main/java/org/apache/skywalking/apm/plugin/pulsar/common/define/BasePulsarConsumerListenerInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/pulsar-common/src/main/java/org/apache/skywalking/apm/plugin/pulsar/common/define/BaseSendCallbackInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/pulsar-common/src/main/java/org/apache/skywalking/apm/plugin/pulsar/common/define/BaseTopicMessageInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/graphql-plugin/graphql-9.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/graphql/v9/define/GraphqlInstrumentation.java`
#### Snippet
```java

    @Override public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/struts2-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/struts2/define/Struts2Instrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/xxl-job-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/xxljob/define/SimpleJobHandlerInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/canal-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/canal/define/ClusterNodeInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/spring-plugins/concurrent-util-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/concurrent/define/FailureCallbackInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/spring-plugins/concurrent-util-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/concurrent/define/ListenableFutureCallbackInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/spring-plugins/concurrent-util-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/concurrent/define/SuccessCallbackInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/optional-plugins/sentinel-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/sentinel/v1/define/SentinelCtSphInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/optional-plugins/zookeeper-3.4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/zookeeper/define/EventThreadInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/cxf-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/cxf/v3/client/define/MessageSenderInterceptorInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/vertx-plugins/vertx-core-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/vertx3/define/HttpServerRequestWrapperConstructorInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/vertx-plugins/vertx-core-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/vertx3/define/EventBusImplDeliverToHandlerInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/vertx-plugins/vertx-core-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/vertx3/define/ClusteredEventBusSendRemoteInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/vertx-plugins/vertx-core-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/vertx3/define/RouterContextImplBaseConstructorInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/vertx-plugins/vertx-core-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/vertx3/define/RouteImplHandlerInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/vertx-plugins/vertx-core-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/vertx3/define/HttpClientRequestImplHandleExceptionInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/vertx-plugins/vertx-core-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/vertx3/define/RoutingContextWrapperConstructorInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/vertx-plugins/vertx-core-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/vertx3/define/HttpContextHandleDispatchResponseInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/vertx-plugins/vertx-core-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/vertx3/define/HandlerRegistrationInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/vertx-plugins/vertx-core-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/vertx3/define/HttpServerRequestImplConstructorInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/vertx-plugins/vertx-core-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/vertx3/define/HttpServerResponseImplHandleExceptionInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/vertx-plugins/vertx-core-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/vertx3/define/HttpContextSendRequestInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/vertx-plugins/vertx-core-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/vertx3/define/HttpClientRequestImplHandleResponseInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/vertx-plugins/vertx-core-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/vertx3/define/ServerConnectionHandleMessageInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/shardingsphere-plugins/sharding-sphere-4.0.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/shardingsphere/v40/define/ParseInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/optional-plugins/guava-cache-plugin/src/main/java/org/apache/skywalking/apm/plugin/guava/cache/define/GuavaCachePluginInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/shardingsphere-plugins/sharding-sphere-4.0.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/shardingsphere/v40/define/ExecuteInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/shardingsphere-plugins/sharding-sphere-4.0.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/shardingsphere/v40/define/JDBCRootInvokeInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/shardingsphere-plugins/sharding-sphere-4.0.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/shardingsphere/v40/define/ProxyRootInvokeInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-logback-1.x-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/log/logback/v1/x/async/LoggingEventInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-logback-1.x-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/log/logback/v1/x/async/AsyncAppenderBaseInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-kafka-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/kafka/define/KafkaOnMessageAnnotationInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/optional-plugins/trace-ignore-plugin/src/main/java/org/apache/skywalking/apm/plugin/trace/ignore/TraceIgnoreExtendService.java`
#### Snippet
```java
    private static final String PATTERN_SEPARATOR = ",";
    private TracePathMatcher pathMatcher = new FastPathMatcher();
    private volatile String[] patterns = new String[] {};
    private TraceIgnorePatternWatcher traceIgnorePatternWatcher;

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/optional-plugins/trace-ignore-plugin/src/main/java/org/apache/skywalking/apm/plugin/trace/ignore/TraceIgnoreExtendService.java`
#### Snippet
```java
            patterns = traceIgnorePatternWatcher.getTraceIgnorePathPatterns().split(PATTERN_SEPARATOR);
        } else {
            patterns = new String[] {};
        }
    }
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/feign-default-http-9.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/feign/http/v9/define/PathVarInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/feign-default-http-9.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/feign/http/v9/define/DefaultHttpClientInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/graphql-plugin/graphql-8.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/graphql/v8/define/GraphqlInstrumentation.java`
#### Snippet
```java

    @Override public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/graphql-plugin/graphql-12.x-15.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/graphql/v12tov15/define/GraphqlInstrumentation.java`
#### Snippet
```java

    @Override public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/elasticjob-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticjob/define/ElasticJobExecutorInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }
    
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/clickhouse-0.3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/clickhouse/define/ConnectionInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/impala-jdbc-2.6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/impala/define/StatementInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/impala-jdbc-2.6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/impala/define/PreparedStatementInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/optional-plugins/gson-2.8.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/gson/define/GsonFromJsonInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/impala-jdbc-2.6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/impala/define/ConnectionInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/optional-plugins/gson-2.8.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/gson/define/GsonToJsonInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/spring-plugins/core-patch/src/main/java/org/apache/skywalking/apm/plugin/spring/patch/define/AopExpressionMatchInstrumentation.java`
#### Snippet
```java
    @Override
    public final ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/spring-plugins/core-patch/src/main/java/org/apache/skywalking/apm/plugin/spring/patch/define/AopProxyFactoryInstrumentation.java`
#### Snippet
```java
    @Override
    public final ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/spring-plugins/core-patch/src/main/java/org/apache/skywalking/apm/plugin/spring/patch/AutowiredAnnotationProcessorInterceptor.java`
#### Snippet
```java
                        candidateConstructors = new Constructor<?>[] {candidateRawConstructors.get(0)};
                    } else {
                        candidateConstructors = new Constructor<?>[0];
                    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/spring-plugins/core-patch/src/main/java/org/apache/skywalking/apm/plugin/spring/patch/define/BeanWrapperImplInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/spring-plugins/core-patch/src/main/java/org/apache/skywalking/apm/plugin/spring/patch/define/AspectJExpressionPointCutInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/jsonrpc4j-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jsonrpc4j/define/JsonRpcBasicServerInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/jsonrpc4j-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jsonrpc4j/define/JsonServiceExporterInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/mariadb-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/mariadb/v2/define/PreparedStatementInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/mariadb-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/mariadb/v2/define/StatementInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/optional-plugins/optional-spring-plugins/spring-annotation-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/annotations/AbstractSpringBeanInstrumentation.java`
#### Snippet
```java
    @Override
    public final ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/mariadb-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/mariadb/v2/define/ConnectionInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/define/CustomizeStaticInstrumentation.java`
#### Snippet
```java
        final ElementMatcher matcher = CustomizeConfiguration.INSTANCE.getInterceptPoints(enhanceClass, true);
        if (matcher == null) {
            return new StaticMethodsInterceptV2Point[0];
        } else {
            return new StaticMethodsInterceptV2Point[] {
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/define/CustomizeInstanceInstrumentation.java`
#### Snippet
```java
        final ElementMatcher matcher = CustomizeConfiguration.INSTANCE.getInterceptPoints(enhanceClass, false);
        if (matcher == null) {
            return new InstanceMethodsInterceptV2Point[0];
        } else {
            return new InstanceMethodsInterceptV2Point[] {
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/define/CustomizeInstanceInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/bootstrap-plugins/jdk-http-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdk/http/define/HttpsClientInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/bootstrap-plugins/jdk-http-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdk/http/define/HttpsClientInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/bootstrap-plugins/jdk-http-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdk/http/define/HttpClientInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/kafka-plugin/src/main/java/org/apache/skywalking/apm/plugin/kafka/ProducerConstructorInterceptor.java`
#### Snippet
```java
        ProducerConfig config = (ProducerConfig) allArguments[0];
        objInst.setSkyWalkingDynamicField(StringUtil.join(';', config.getList("bootstrap.servers")
                                                                     .toArray(new String[0])));
    }
}
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/kafka-plugin/src/main/java/org/apache/skywalking/apm/plugin/kafka/define/KafkaTemplateCallbackInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/kafka-plugin/src/main/java/org/apache/skywalking/apm/plugin/kafka/define/KafkaProducerMapInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/kafka-plugin/src/main/java/org/apache/skywalking/apm/plugin/kafka/ConsumerEnhanceRequiredInfo.java`
#### Snippet
```java

    public void setTopics(Collection<String> topics) {
        this.topics = StringUtil.join(';', topics.toArray(new String[0]));
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/kafka-plugin/src/main/java/org/apache/skywalking/apm/plugin/kafka/ConsumerEnhanceRequiredInfo.java`
#### Snippet
```java

    public void setBrokerServers(List<String> brokerServers) {
        this.brokerServers = StringUtil.join(';', brokerServers.toArray(new String[0]));
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/kafka-plugin/src/main/java/org/apache/skywalking/apm/plugin/kafka/define/CallbackInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/bootstrap-plugins/jdk-threading-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdk/threading/ThreadingConfig.java`
#### Snippet
```java
        }

        return LogicalMatchOperation.or(prefixMatches.toArray(new PrefixMatch[0]));
    }
}
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/bootstrap-plugins/jdk-threading-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdk/threading/define/RunnableInstrumentation.java`
#### Snippet
```java
    @Override
    public StaticMethodsInterceptPoint[] getStaticMethodsInterceptPoints() {
        return new StaticMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/bootstrap-plugins/jdk-threading-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdk/threading/define/CallableInstrumentation.java`
#### Snippet
```java
    @Override
    public StaticMethodsInterceptPoint[] getStaticMethodsInterceptPoints() {
        return new StaticMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/define/AnnotationInstrumentation.java`
#### Snippet
```java
        @Override
        public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
            return new InstanceMethodsInterceptPoint[0];
        }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/mysql-6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/mysql/v6/define/StatementInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/mysql-6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/mysql/v6/define/CacheIpsInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/mysql-6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/mysql/v6/define/CallableInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/mysql-6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/mysql/v6/define/PreparedStatementInstrumentation.java`
#### Snippet
```java
    @Override
    public final ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/mysql-6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/mysql/v6/define/ConnectionInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/postgresql-8.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/postgresql/define/PgCallableStatementInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/postgresql-8.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/postgresql/define/PgStatementInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/postgresql-8.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/postgresql/define/Jdbc3ConnectionInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/postgresql-8.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/postgresql/define/AbstractJdbc2StatementInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/postgresql-8.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/postgresql/define/PgPreparedStatementInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/conf/CustomizeConfiguration.java`
#### Snippet
```java
            MethodConfiguration.setMethodName(configuration, methodName);
            MethodConfiguration.setArguments(
                    configuration, StringUtil.isEmpty(arguments[0]) ? new String[0] : arguments);
            if (StringUtil.isEmpty(MethodConfiguration.getOperationName(configuration))) {
                MethodConfiguration.setOperationName(configuration, MethodConfiguration.getMethod(configuration));
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/postgresql-8.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/postgresql/define/Jdbc4ConnectionInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/postgresql-8.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/postgresql/define/ConnectionInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/elasticsearch-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v5/define/TransportActionNodeProxyInstrumentation.java`
#### Snippet
```java
    @Override
    public StaticMethodsInterceptPoint[] getStaticMethodsInterceptPoints() {
        return new StaticMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/elasticsearch-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v5/define/GenericActionInstrumentation.java`
#### Snippet
```java
    @Override
    public StaticMethodsInterceptPoint[] getStaticMethodsInterceptPoints() {
        return new StaticMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/elasticsearch-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v5/define/GenericActionInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/elasticsearch-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v5/define/PlainListenableActionFutureInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/elasticsearch-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v5/define/PlainListenableActionFutureInstrumentation.java`
#### Snippet
```java
    @Override
    public StaticMethodsInterceptPoint[] getStaticMethodsInterceptPoints() {
        return new StaticMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/elasticsearch-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v5/define/TransportClientNodesServiceInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/spring-plugins/spring-webflux-5.x-webclient-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/webflux/v5/webclient/define/BodyInserterRequestInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/spring-plugins/spring-webflux-5.x-webclient-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/webflux/v5/webclient/define/WebFluxWebClientInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/spring-plugins/spring-webflux-5.x-webclient-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/webflux/v5/webclient/define/WebFluxWebClientInstrumentation.java`
#### Snippet
```java
    @Override
    public StaticMethodsInterceptPoint[] getStaticMethodsInterceptPoints() {
        return new StaticMethodsInterceptPoint[0];
    }
}
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/elasticsearch-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v5/define/TransportProxyClientInstrumentation.java`
#### Snippet
```java
    @Override
    public StaticMethodsInterceptPoint[] getStaticMethodsInterceptPoints() {
        return new StaticMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/elasticsearch-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v5/define/TransportProxyClientInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/AbstractClassEnhancePluginDefine.java`
#### Snippet
```java
     */
    protected String[] witnessClasses() {
        return new String[] {};
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/ContextManagerExtendService.java`
#### Snippet
```java
public class ContextManagerExtendService implements BootService, GRPCChannelListener {

    private volatile String[] ignoreSuffixArray = new String[0];

    private volatile GRPCChannelStatus status = GRPCChannelStatus.DISCONNECT;
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/undertow-worker-thread-pool-plugin/src/main/java/org/apache/skywalking/apm/plugin/undertow/worker/thread/pool/define/UndertowWorkerThreadPoolInstrumentation.java`
#### Snippet
```java
    @Override
    public StaticMethodsInterceptPoint[] getStaticMethodsInterceptPoints() {
        return new StaticMethodsInterceptPoint[0];
    }
}
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/undertow-worker-thread-pool-plugin/src/main/java/org/apache/skywalking/apm/plugin/undertow/worker/thread/pool/define/UndertowWorkerThreadPoolInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/bootstrap-plugins/jdk-threadpool-plugin/src/main/java/org/apache/skywalking/apm/plugin/define/ThreadPoolExecutorInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/shardingsphere-plugins/sharding-sphere-4.1.0-plugin/src/main/java/org/apache/skywalking/apm/plugin/shardingsphere/v41/define/ParseInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/shardingsphere-plugins/sharding-sphere-4.1.0-plugin/src/main/java/org/apache/skywalking/apm/plugin/shardingsphere/v41/define/ProxyRootInvokeInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/shardingsphere-plugins/sharding-sphere-4.1.0-plugin/src/main/java/org/apache/skywalking/apm/plugin/shardingsphere/v41/define/JDBCRootInvokeInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/shardingsphere-plugins/sharding-sphere-4.1.0-plugin/src/main/java/org/apache/skywalking/apm/plugin/shardingsphere/v41/define/ExecuteInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/spring-plugins/spring-cloud/spring-cloud-feign-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/string/cloud/netflix/feign/v2/define/LoadBalancerFeignClientInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/TraceAnnotationActivation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/elastic-job-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/esjob/define/JobExecutorInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/TagAnnotationActivation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/ActiveSpanActivation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/lettuce-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/lettuce/v5/define/DefaultEndpointInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/lettuce-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/lettuce/v5/define/RedisChannelWriterInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/lettuce-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/lettuce/v5/define/RedisCommandInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/dubbo-conflict-patch/src/main/java/org/apache/skywalking/apm/plugin/dubbo/patch/MakeWrapperInterceptor.java`
#### Snippet
```java
            // setup static field.
            wc.getField("pts").set(null, pts);
            wc.getField("pns").set(null, pts.keySet().toArray(new String[0]));
            wc.getField("mns").set(null, mns.toArray(new String[0]));
            wc.getField("dmns").set(null, dmns.toArray(new String[0]));
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/dubbo-conflict-patch/src/main/java/org/apache/skywalking/apm/plugin/dubbo/patch/MakeWrapperInterceptor.java`
#### Snippet
```java
            wc.getField("pts").set(null, pts);
            wc.getField("pns").set(null, pts.keySet().toArray(new String[0]));
            wc.getField("mns").set(null, mns.toArray(new String[0]));
            wc.getField("dmns").set(null, dmns.toArray(new String[0]));
            int ix = 0;
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/dubbo-conflict-patch/src/main/java/org/apache/skywalking/apm/plugin/dubbo/patch/MakeWrapperInterceptor.java`
#### Snippet
```java
            wc.getField("pns").set(null, pts.keySet().toArray(new String[0]));
            wc.getField("mns").set(null, mns.toArray(new String[0]));
            wc.getField("dmns").set(null, dmns.toArray(new String[0]));
            int ix = 0;
            for (Method m : ms.values())
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/armeria-0.84.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/armeria/define/Armeria084ServerInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/armeria-0.84.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/armeria/define/Armeria084ClientInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/jedis-plugins/jedis-2.x-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jedis/v3/define/PipelineInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/jedis-plugins/jedis-2.x-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jedis/v3/define/PipelineBaseInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/jedis-plugins/jedis-2.x-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jedis/v3/define/TransactionConstructorInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[0];
    }
}
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/dubbo-plugin/src/main/java/org/apache/skywalking/apm/plugin/dubbo/AbstractServerInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[0];
    }
}
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/jedis-plugins/jedis-2.x-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jedis/v3/define/MultiKeyPipelineBaseInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/spring-plugins/mvc-annotation-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/mvc/v5/define/reactive/InvocableHandlerMethodInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/spring-plugins/mvc-annotation-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/mvc/v5/define/HandlerMethodInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/optional-plugins/mybatis-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/mybatis/define/MyBatisInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/optional-plugins/mybatis-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/mybatis/define/MyBatisShellMethodInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/rocketMQ-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/rocketMQ/v3/define/SendCallbackInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/rocketMQ-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/rocketMQ/v3/define/ConsumeMessageOrderlyInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/rocketMQ-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/rocketMQ/v3/define/ConsumeMessageConcurrentlyInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `apm-sniffer/apm-sdk-plugin/rocketMQ-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/rocketMQ/v3/define/MQClientAPIImplInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return new ConstructorInterceptPoint[0];
    }

```

## RuleId[ruleID=DoubleBraceInitialization]
### RuleId[ruleID=DoubleBraceInitialization]
Double brace initialization
in `apm-sniffer/apm-sdk-plugin/undertow-worker-thread-pool-plugin/src/main/java/org/apache/skywalking/apm/plugin/undertow/worker/thread/pool/UndertowWorkerThreadPoolConstructorIntercept.java`
#### Snippet
```java
    private static final String THREAD_POOL_NAME = "undertow_worker_pool";

    private static final Map<String, Function<ThreadPoolExecutor, Supplier<Double>>> METRIC_MAP = new HashMap<String, Function<ThreadPoolExecutor, Supplier<Double>>>() {{
        put("core_pool_size", (ThreadPoolExecutor threadPoolExecutor) -> () -> (double) threadPoolExecutor.getCorePoolSize());
        put("max_pool_size", (ThreadPoolExecutor threadPoolExecutor) -> () -> (double) threadPoolExecutor.getMaximumPoolSize());
```

## RuleId[ruleID=InfiniteRecursion]
### RuleId[ruleID=InfiniteRecursion]
Method `sendNativeStream()` recurses infinitely, and can only end by throwing an exception
in `apm-sniffer/apm-sdk-plugin/clickhouse-0.3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/clickhouse/TracedClickHouseStatement.java`
#### Snippet
```java

    @Override
    public void sendNativeStream(String sql, ClickHouseStreamCallback callback) throws SQLException {
        sendNativeStream(sql, callback);
    }
```

### RuleId[ruleID=InfiniteRecursion]
Method `sendCSVStream()` recurses infinitely, and can only end by throwing an exception
in `apm-sniffer/apm-sdk-plugin/clickhouse-0.3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/clickhouse/TracedClickHouseStatement.java`
#### Snippet
```java

    @Override
    public void sendCSVStream(InputStream content, String table, Map<ClickHouseQueryParam, String> additionalDBParams)
            throws SQLException {
        sendCSVStream(content, table, additionalDBParams);
```

### RuleId[ruleID=InfiniteRecursion]
Method `sendNativeStream()` recurses infinitely, and can only end by throwing an exception
in `apm-sniffer/apm-sdk-plugin/clickhouse-0.3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/clickhouse/TracedClickHouseStatement.java`
#### Snippet
```java

    @Override
    public void sendNativeStream(String sql, Map<ClickHouseQueryParam, String> additionalDBParams,
            ClickHouseStreamCallback callback) throws SQLException {
        sendNativeStream(sql, additionalDBParams, callback);
```

### RuleId[ruleID=InfiniteRecursion]
Method `sendRowBinaryStream()` recurses infinitely, and can only end by throwing an exception
in `apm-sniffer/apm-sdk-plugin/clickhouse-0.3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/clickhouse/TracedClickHouseStatement.java`
#### Snippet
```java

    @Override
    public void sendRowBinaryStream(String sql, ClickHouseStreamCallback callback) throws SQLException {
        sendRowBinaryStream(sql, callback);
    }
```

### RuleId[ruleID=InfiniteRecursion]
Method `sendRowBinaryStream()` recurses infinitely, and can only end by throwing an exception
in `apm-sniffer/apm-sdk-plugin/clickhouse-0.3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/clickhouse/TracedClickHouseStatement.java`
#### Snippet
```java

    @Override
    public void sendRowBinaryStream(String sql, Map<ClickHouseQueryParam, String> additionalDBParams,
            ClickHouseStreamCallback callback) throws SQLException {
        sendRowBinaryStream(sql, additionalDBParams, callback);
```

### RuleId[ruleID=InfiniteRecursion]
Method `sendStreamSQL()` recurses infinitely, and can only end by throwing an exception
in `apm-sniffer/apm-sdk-plugin/clickhouse-0.3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/clickhouse/TracedClickHouseStatement.java`
#### Snippet
```java

    @Override
    public void sendStreamSQL(InputStream content, String sql, Map<ClickHouseQueryParam, String> additionalDBParams)
            throws SQLException {
        sendStreamSQL(content, sql, additionalDBParams);
```

### RuleId[ruleID=InfiniteRecursion]
Method `sendStreamSQL()` recurses infinitely, and can only end by throwing an exception
in `apm-sniffer/apm-sdk-plugin/clickhouse-0.3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/clickhouse/TracedClickHouseStatement.java`
#### Snippet
```java

    @Override
    public void sendStreamSQL(InputStream content, String sql) throws SQLException {
        sendStreamSQL(content, sql);
    }
```

### RuleId[ruleID=InfiniteRecursion]
Method `sendCSVStream()` recurses infinitely, and can only end by throwing an exception
in `apm-sniffer/apm-sdk-plugin/clickhouse-0.3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/clickhouse/TracedClickHouseStatement.java`
#### Snippet
```java

    @Override
    public void sendCSVStream(InputStream content, String table) throws SQLException {
        sendCSVStream(content, table);
    }
```

## RuleId[ruleID=CastConflictsWithInstanceof]
### RuleId[ruleID=CastConflictsWithInstanceof]
Cast to 'EnhancedInstance' type conflicts with preceding 'instanceof ClusteredMessage' check
in `apm-sniffer/apm-sdk-plugin/vertx-plugins/vertx-core-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/vertx4/SWVertxTracer.java`
#### Snippet
```java
            String remotePeer = "localhost";
            if (clientRequest instanceof ClusteredMessage) {
                EnhancedInstance enhancedInstance = (EnhancedInstance) clientRequest;
                if (enhancedInstance.getSkyWalkingDynamicField() != null) {
                    remotePeer = (String) enhancedInstance.getSkyWalkingDynamicField();
```

### RuleId[ruleID=CastConflictsWithInstanceof]
Cast to 'EnhancedInstance' type conflicts with preceding 'instanceof RingBufferLogEvent' check
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-log4j-2.x-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/log/log4j/v2/x/log/GRPCLogAppenderInterceptor.java`
#### Snippet
```java

        if (event instanceof RingBufferLogEvent) {
            EnhancedInstance instance = (EnhancedInstance) event;
            SkyWalkingContext context = (SkyWalkingContext) instance.getSkyWalkingDynamicField();
            return builder.setTraceContext(TraceContext.newBuilder()
```

### RuleId[ruleID=CastConflictsWithInstanceof]
Cast to 'EnhancedInstance' type conflicts with preceding 'instanceof DefaultServerWebExchange' check
in `apm-sniffer/optional-plugins/optional-spring-plugins/optional-spring-cloud/gateway-2.0.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/cloud/gateway/v20x/NettyRoutingFilterInterceptor.java`
#### Snippet
```java
        EnhancedInstance instance = null;
        if (o instanceof DefaultServerWebExchange) {
            instance = (EnhancedInstance) o;
        } else if (o instanceof ServerWebExchangeDecorator) {
            ServerWebExchange delegate = ((ServerWebExchangeDecorator) o).getDelegate();
```

### RuleId[ruleID=CastConflictsWithInstanceof]
Cast to 'EnhancedInstance' type conflicts with preceding 'instanceof DefaultServerWebExchange' check
in `apm-sniffer/optional-plugins/optional-spring-plugins/spring-webflux-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/webflux/v5/DispatcherHandlerHandleMethodInterceptor.java`
#### Snippet
```java
        EnhancedInstance instance = null;
        if (o instanceof DefaultServerWebExchange) {
            instance = (EnhancedInstance) o;
        } else if (o instanceof ServerWebExchangeDecorator) {
            ServerWebExchange delegate = ((ServerWebExchangeDecorator) o).getDelegate();
```

### RuleId[ruleID=CastConflictsWithInstanceof]
Cast to 'EnhancedInstance' type conflicts with preceding 'instanceof DefaultServerWebExchange' check
in `apm-sniffer/optional-plugins/shenyu-2.4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/shenyu/v24x/util/CommonUtil.java`
#### Snippet
```java
        EnhancedInstance instance = null;
        if (o instanceof DefaultServerWebExchange) {
            instance = (EnhancedInstance) o;
        } else if (o instanceof ServerWebExchangeDecorator) {
            ServerWebExchange delegate = ((ServerWebExchangeDecorator) o).getDelegate();
```

### RuleId[ruleID=CastConflictsWithInstanceof]
Cast to 'TBaseProcessor' type conflicts with preceding 'instanceof TBaseAsyncProcessor' check
in `apm-sniffer/apm-sdk-plugin/thrift-plugin/src/main/java/org/apache/skywalking/apm/plugin/thrift/TMultiplexedProcessorRegisterDefaultInterceptor.java`
#### Snippet
```java
            hashMap.putAll(processMapView);
        } else if (processor instanceof TBaseAsyncProcessor) {
            Map<String, ProcessFunction> processMapView = ((TBaseProcessor) processor).getProcessMapView();
            hashMap.putAll(processMapView);
        } else {
```

### RuleId[ruleID=CastConflictsWithInstanceof]
Cast to 'EnhancedInstance' type conflicts with preceding 'instanceof DefaultServerWebExchange' check
in `apm-sniffer/optional-plugins/shenyu-2.4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/shenyu/v24x/GlobalPluginExecuteMethodInterceptor.java`
#### Snippet
```java
        EnhancedInstance instance = null;
        if (o instanceof DefaultServerWebExchange) {
            instance = (EnhancedInstance) o;
        } else if (o instanceof ServerWebExchangeDecorator) {
            ServerWebExchange delegate = ((ServerWebExchangeDecorator) o).getDelegate();
```

### RuleId[ruleID=CastConflictsWithInstanceof]
Cast to 'EnhancedInstance' type conflicts with preceding 'instanceof DefaultServerWebExchange' check
in `apm-sniffer/optional-plugins/optional-spring-plugins/optional-spring-cloud/gateway-2.1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/cloud/gateway/v21x/NettyRoutingFilterInterceptor.java`
#### Snippet
```java
        EnhancedInstance instance = null;
        if (o instanceof DefaultServerWebExchange) {
            instance = (EnhancedInstance) o;
        } else if (o instanceof ServerWebExchangeDecorator) {
            ServerWebExchange delegate = ((ServerWebExchangeDecorator) o).getDelegate();
```

## RuleId[ruleID=NonExceptionNameEndsWithException]
### RuleId[ruleID=NonExceptionNameEndsWithException]
Non-exception class name `CallbackWhenException` ends with 'Exception'
in `apm-commons/apm-util/src/main/java/org/apache/skywalking/apm/util/RunnableWithExceptionProtection.java`
#### Snippet
```java
    }

    public interface CallbackWhenException {
        void handle(Throwable t);
    }
```

### RuleId[ruleID=NonExceptionNameEndsWithException]
Non-exception class name `IgnoredException` ends with 'Exception'
in `apm-application-toolkit/apm-toolkit-trace/src/main/java/org/apache/skywalking/apm/toolkit/trace/IgnoredException.java`
#### Snippet
```java
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface IgnoredException {
}

```

### RuleId[ruleID=NonExceptionNameEndsWithException]
Non-exception class name `SupplierWithException` ends with 'Exception'
in `apm-sniffer/apm-sdk-plugin/clickhouse-0.3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/clickhouse/ClickHouseStatementTracingWrapper.java`
#### Snippet
```java
    }

    public interface SupplierWithException<T> {

        T get() throws SQLException;
```

### RuleId[ruleID=NonExceptionNameEndsWithException]
Non-exception class name `CommandExecutionException` ends with 'Exception'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/commands/CommandExecutionException.java`
#### Snippet
```java
 * Indicates that the execution of a command failed
 */
public class CommandExecutionException extends Throwable {
    private final Command command;

```

## RuleId[ruleID=UnusedAssignment]
### RuleId[ruleID=UnusedAssignment]
Variable `tid` initializer `""` is redundant
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-log4j-2.x-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/log/log4j/v2/x/TraceIdConverterMethodInterceptor.java`
#### Snippet
```java
    public void beforeMethod(EnhancedInstance objInst, Method method, Object[] allArguments, Class<?>[] argumentsTypes,
        MethodInterceptResult result) throws Throwable {
        String tid = "";

        //Async Thread, where ContextManager is not active
```

### RuleId[ruleID=UnusedAssignment]
Variable `skyWalkingContextStr` initializer `""` is redundant
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-log4j-2.x-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/log/log4j/v2/x/SkyWalkingContextConverterMethodInterceptor.java`
#### Snippet
```java
    public void beforeMethod(EnhancedInstance objInst, Method method, Object[] allArguments, Class<?>[] argumentsTypes,
        MethodInterceptResult result) throws Throwable {
        String skyWalkingContextStr = "";

        //Async Thread, where ContextManager is not active
```

### RuleId[ruleID=UnusedAssignment]
Variable `classPath` initializer `""` is redundant
in `apm-sniffer/apm-sdk-plugin/nutz-plugins/mvc-annotation-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/nutz/mvc/PathMappingCache.java`
#### Snippet
```java
 */
public class PathMappingCache {
    private String classPath = "";

    private ConcurrentHashMap<Method, String> methodPathMapping = new ConcurrentHashMap<Method, String>();
```

### RuleId[ruleID=UnusedAssignment]
Variable `databaseEndTag` initializer `url.length()` is redundant
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/connectionurl/parser/ImpalaJdbcURLParser.java`
#### Snippet
```java
        int databaseStartTag = url.indexOf("/", startSize);
        int firstParamIndex = url.indexOf(";", startSize);
        int databaseEndTag = url.length();
        if (databaseStartTag == -1 && firstParamIndex == -1) {
            return null;
```

### RuleId[ruleID=UnusedAssignment]
Variable `classPath` initializer `""` is redundant
in `apm-sniffer/apm-sdk-plugin/spring-plugins/mvc-annotation-commons/src/main/java/org/apache/skywalking/apm/plugin/spring/mvc/commons/PathMappingCache.java`
#### Snippet
```java
    private static final String PATH_SEPARATOR = "/";

    private String classPath = "";

    private ConcurrentHashMap<Method, String> methodPathMapping = new ConcurrentHashMap<Method, String>();
```

### RuleId[ruleID=UnusedAssignment]
Variable `PEER_HOST` initializer `null` is redundant
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/FinagleCtxs.java`
#### Snippet
```java
    static LocalContext.Key<AbstractSpan> SW_SPAN = null;

    static LocalContext.Key<String> PEER_HOST = null;

    static {
```

### RuleId[ruleID=UnusedAssignment]
Variable `SW_SPAN` initializer `null` is redundant
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/FinagleCtxs.java`
#### Snippet
```java
class FinagleCtxs {

    static LocalContext.Key<AbstractSpan> SW_SPAN = null;

    static LocalContext.Key<String> PEER_HOST = null;
```

### RuleId[ruleID=UnusedAssignment]
Variable `span` initializer `null` is redundant
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/ServerTracingFilterInterceptor.java`
#### Snippet
```java
    public void beforeMethodImpl(EnhancedInstance enhancedInstance, Method method, Object[] objects, Class<?>[] classes,
                                 MethodInterceptResult methodInterceptResult) throws Throwable {
        AbstractSpan span = null;
        if (Contexts.broadcast().contains(SWContextCarrier$.MODULE$)) {
            SWContextCarrier swContextCarrier = Contexts.broadcast().apply(SWContextCarrier$.MODULE$);
```

### RuleId[ruleID=UnusedAssignment]
Variable `key` initializer `null` is redundant
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/CodecUtils.java`
#### Snippet
```java
    private static Map<String, String> readToMap(ByteBuffer byteBuffer) {
        Map<String, String> data = new HashMap<>();
        String key = null;
        while ((key = getNextString(byteBuffer)) != null) {
            data.put(key, getNextString(byteBuffer));
```

### RuleId[ruleID=UnusedAssignment]
Variable `span` initializer `null` is redundant
in `apm-sniffer/apm-sdk-plugin/solrj-7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/solrj/SolrClientInterceptor.java`
#### Snippet
```java
            if (action == null) {
                if (update instanceof UpdateRequest) {
                    AbstractSpan span = null;

                    UpdateRequest ur = (UpdateRequest) update;
```

### RuleId[ruleID=UnusedAssignment]
Variable `gcCount` initializer `0` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/jvm/gc/GCModule.java`
#### Snippet
```java
            String name = bean.getName();
            GCPhase phase;
            long gcCount = 0;
            long gcTime = 0;
            if (name.equals(getNewGCName())) {
```

### RuleId[ruleID=UnusedAssignment]
Variable `gcTime` initializer `0` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/jvm/gc/GCModule.java`
#### Snippet
```java
            GCPhase phase;
            long gcCount = 0;
            long gcTime = 0;
            if (name.equals(getNewGCName())) {
                phase = GCPhase.NEW;
```

### RuleId[ruleID=UnusedAssignment]
Variable `n` initializer `0` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/util/IOUtils.java`
#### Snippet
```java
            throws IOException {
        long count = 0;
        int n = 0;
        while (EOF != (n = input.read(buffer))) {
            output.write(buffer, 0, n);
```

### RuleId[ruleID=UnusedAssignment]
Variable `cacheDirBase` initializer `null` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/bytebuddy/CacheableTransformerDecorator.java`
#### Snippet
```java
    private void initClassCache() throws IOException {
        if (this.cacheMode.equals(ClassCacheMode.FILE)) {
            String cacheDirBase = null;
            try {
                cacheDirBase = AgentPackagePath.getPath() + "/class-cache";
```

### RuleId[ruleID=UnusedAssignment]
Variable `currentLoopStartTime` initializer `-1` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/profile/ProfileThread.java`
#### Snippet
```java

        // run loop when current thread still running
        long currentLoopStartTime = -1;
        while (!Thread.currentThread().isInterrupted()) {
            currentLoopStartTime = System.currentTimeMillis();
```

### RuleId[ruleID=UnusedAssignment]
Variable `activeSpan` initializer `null` is redundant
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/ActiveSpanErrorThrowableInteceptor.java`
#### Snippet
```java
    public void beforeMethod(Class clazz, Method method, Object[] allArguments, Class<?>[] parameterTypes,
        MethodInterceptResult result) {
        AbstractSpan activeSpan = null;
        try {
            activeSpan = ContextManager.activeSpan();
```

### RuleId[ruleID=UnusedAssignment]
Variable `activeSpan` initializer `null` is redundant
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/ActiveSpanInfoInterceptor.java`
#### Snippet
```java
    public void beforeMethod(Class clazz, Method method, Object[] allArguments, Class<?>[] parameterTypes,
        MethodInterceptResult result) {
        AbstractSpan activeSpan = null;
        try {
            activeSpan = ContextManager.activeSpan();
```

### RuleId[ruleID=UnusedAssignment]
Variable `activeSpan` initializer `null` is redundant
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/ActiveSpanDebugInterceptor.java`
#### Snippet
```java
    public void beforeMethod(Class clazz, Method method, Object[] allArguments, Class<?>[] parameterTypes,
        MethodInterceptResult result) {
        AbstractSpan activeSpan = null;
        try {
            activeSpan = ContextManager.activeSpan();
```

### RuleId[ruleID=UnusedAssignment]
Variable `activeSpan` initializer `null` is redundant
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/ActiveSpanErrorMsgInterceptor.java`
#### Snippet
```java
    public void beforeMethod(Class clazz, Method method, Object[] allArguments, Class<?>[] parameterTypes,
        MethodInterceptResult result) {
        AbstractSpan activeSpan = null;
        try {
            activeSpan = ContextManager.activeSpan();
```

### RuleId[ruleID=UnusedAssignment]
Variable `activeSpan` initializer `null` is redundant
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/ActiveSpanErrorInterceptor.java`
#### Snippet
```java
    public void beforeMethod(Class clazz, Method method, Object[] allArguments, Class<?>[] parameterTypes,
        MethodInterceptResult result) {
        AbstractSpan activeSpan = null;
        try {
            activeSpan = ContextManager.activeSpan();
```

## RuleId[ruleID=IndexOfReplaceableByContains]
### RuleId[ruleID=IndexOfReplaceableByContains]
`name.indexOf("PS") > -1` can be replaced with 'name.contains("PS")'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/jvm/gc/GCProvider.java`
#### Snippet
```java

    private GCMetricAccessor findByBeanName(String name) {
        if (name.indexOf("PS") > -1) {
            //Parallel (Old) collector ( -XX:+UseParallelOldGC )
            return new ParallelGCModule(beans);
```

### RuleId[ruleID=IndexOfReplaceableByContains]
`name.indexOf("ConcurrentMarkSweep") > -1` can be replaced with 'name.contains("ConcurrentMarkSweep")'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/jvm/gc/GCProvider.java`
#### Snippet
```java
            //Parallel (Old) collector ( -XX:+UseParallelOldGC )
            return new ParallelGCModule(beans);
        } else if (name.indexOf("ConcurrentMarkSweep") > -1) {
            // CMS collector ( -XX:+UseConcMarkSweepGC )
            return new CMSGCModule(beans);
```

### RuleId[ruleID=IndexOfReplaceableByContains]
`name.indexOf("G1") > -1` can be replaced with 'name.contains("G1")'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/jvm/gc/GCProvider.java`
#### Snippet
```java
            // CMS collector ( -XX:+UseConcMarkSweepGC )
            return new CMSGCModule(beans);
        } else if (name.indexOf("G1") > -1) {
            // G1 collector ( -XX:+UseG1GC )
            return new G1GCModule(beans);
```

### RuleId[ruleID=IndexOfReplaceableByContains]
`name.indexOf("ZGC") > -1` can be replaced with 'name.contains("ZGC")'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/jvm/gc/GCProvider.java`
#### Snippet
```java
            // Serial collector ( -XX:+UseSerialGC )
            return new SerialGCModule(beans);
        } else if (name.indexOf("ZGC") > -1) {
            // Z garbage collector ( -XX:+UseZGC )
            return new ZGCModule(beans);
```

### RuleId[ruleID=IndexOfReplaceableByContains]
`name.indexOf("PS") > -1` can be replaced with 'name.contains("PS")'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/jvm/memorypool/MemoryPoolProvider.java`
#### Snippet
```java

    private MemoryPoolMetricsAccessor findByBeanName(String name) {
        if (name.indexOf("PS") > -1) {
            //Parallel (Old) collector ( -XX:+UseParallelOldGC )
            return new ParallelCollectorModule(beans);
```

### RuleId[ruleID=IndexOfReplaceableByContains]
`name.indexOf("CMS") > -1` can be replaced with 'name.contains("CMS")'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/jvm/memorypool/MemoryPoolProvider.java`
#### Snippet
```java
            //Parallel (Old) collector ( -XX:+UseParallelOldGC )
            return new ParallelCollectorModule(beans);
        } else if (name.indexOf("CMS") > -1) {
            // CMS collector ( -XX:+UseConcMarkSweepGC )
            return new CMSCollectorModule(beans);
```

### RuleId[ruleID=IndexOfReplaceableByContains]
`name.indexOf("G1") > -1` can be replaced with 'name.contains("G1")'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/jvm/memorypool/MemoryPoolProvider.java`
#### Snippet
```java
            // CMS collector ( -XX:+UseConcMarkSweepGC )
            return new CMSCollectorModule(beans);
        } else if (name.indexOf("G1") > -1) {
            // G1 collector ( -XX:+UseG1GC )
            return new G1CollectorModule(beans);
```

## RuleId[ruleID=ConstantValue]
### RuleId[ruleID=ConstantValue]
Value `ret` is always 'null'
in `apm-sniffer/apm-sdk-plugin/activemq-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/activemq/MessageConsumerDequeueInterceptor.java`
#### Snippet
```java
                              final Object ret) throws Throwable {
        if (ret == null) {
            return ret;
        }
        MessageDispatch messageDispatch = (MessageDispatch) ret;
```

### RuleId[ruleID=ConstantValue]
Condition `null != key` is always `true`
in `apm-application-toolkit/apm-toolkit-logback-1.x/src/main/java/org/apache/skywalking/apm/toolkit/log/logback/v1/x/mdc/LogbackMDCPatternConverter.java`
#### Snippet
```java
        super.start();
        String[] key = OptionHelper.extractDefaultReplacement(getFirstOption());
        if (null != key && key.length > 0) {
            String variableName = key[0];
            if (CONVERT_TRACE_ID_KEY.equals(variableName)) {
```

### RuleId[ruleID=ConstantValue]
Condition `isMatch` is always `false`
in `apm-sniffer/apm-sdk-plugin/spring-plugins/concurrent-util-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/concurrent/match/ListenableFutureCallbackMatch.java`
#### Snippet
```java
            TypeDescription.Generic superClazz = clazz.getSuperClass();
            if (superClazz != null && !clazz.getTypeName().equals("java.lang.Object")) {
                isMatch = isMatch || matchExactClass(superClazz);
            }
        }
```

### RuleId[ruleID=ConstantValue]
Value `ret` is always 'null'
in `apm-sniffer/apm-sdk-plugin/kafka-plugin/src/main/java/org/apache/skywalking/apm/plugin/kafka/KafkaConsumerInterceptor.java`
#### Snippet
```java
         */
        if (ret == null) {
            return ret;
        }
        Map<TopicPartition, List<ConsumerRecord<?, ?>>> records = (Map<TopicPartition, List<ConsumerRecord<?, ?>>>) ret;
```

### RuleId[ruleID=ConstantValue]
Condition `evalContext == null` is always `false`
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/interceptor/BaseInterceptorMethods.java`
#### Snippet
```java
        Map<String, String> spanLogs = logs == null ? Collections.EMPTY_MAP : new HashMap<String, String>(logs.size());

        if (evalContext == null || evalContext.isEmpty()) {
            SpanDataHolder spanDataHolder = new SpanDataHolder(
                ContextManager.createLocalSpan(operationName),
```

### RuleId[ruleID=ConstantValue]
Condition `httpStatus != null` is always `true`
in `apm-sniffer/apm-sdk-plugin/spring-plugins/spring-webflux-5.x-webclient-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/webflux/v5/webclient/WebFluxWebClientInterceptor.java`
#### Snippet
```java
            return ret1.doOnSuccess(clientResponse -> {
                HttpStatus httpStatus = clientResponse.statusCode();
                if (httpStatus != null) {
                    Tags.HTTP_RESPONSE_STATUS_CODE.set(span, httpStatus.value());
                    if (httpStatus.isError()) {
```

### RuleId[ruleID=ConstantValue]
Condition `inst != null` is always `true`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/loader/InterceptorInstanceLoader.java`
#### Snippet
```java
            }
            inst = Class.forName(className, true, pluginLoader).newInstance();
            if (inst != null) {
                INSTANCE_CACHE.put(instanceKey, inst);
            }
```

### RuleId[ruleID=ConstantValue]
Value `message` is always 'null'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/AbstractLogger.java`
#### Snippet
```java
    protected String replaceParam(String message, Object... parameters) {
        if (message == null) {
            return message;
        }
        int startSize = 0;
```

### RuleId[ruleID=ConstantValue]
Condition `!objInst.getClass() ...` is always `true` when reached
in `apm-sniffer/apm-sdk-plugin/light4j-plugins/light4j-plugin/src/main/java/org/apache/skywalking/apm/plugin/light4j/HandleRequestInterceptor.java`
#### Snippet
```java

    private boolean isBusinessHandler(EnhancedInstance objInst) {
        return !objInst.getClass().getInterfaces()[0].equals(MiddlewareHandler.class) && !objInst.getClass()
                                                                                                 .equals(
                                                                                                     OrchestrationHandler.class);
    }

```

### RuleId[ruleID=ConstantValue]
Result of `objInst.getClass() ...` is always 'false'
in `apm-sniffer/apm-sdk-plugin/light4j-plugins/light4j-plugin/src/main/java/org/apache/skywalking/apm/plugin/light4j/HandleRequestInterceptor.java`
#### Snippet
```java

    private boolean isBusinessHandler(EnhancedInstance objInst) {
        return !objInst.getClass().getInterfaces()[0].equals(MiddlewareHandler.class) && !objInst.getClass()
                                                                                                 .equals(
                                                                                                     OrchestrationHandler.class);
    }

```

### RuleId[ruleID=ConstantValue]
Result of `objInst.getClass().equals(ExceptionHandler.class)` is always 'false'
in `apm-sniffer/apm-sdk-plugin/light4j-plugins/light4j-plugin/src/main/java/org/apache/skywalking/apm/plugin/light4j/HandleRequestInterceptor.java`
#### Snippet
```java

    private boolean isExceptionHandler(EnhancedInstance objInst) {
        return objInst.getClass().equals(ExceptionHandler.class);
    }
}
```

## RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `apm-sniffer/apm-sdk-plugin/dubbo-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo3/DubboInterceptor.java`
#### Snippet
```java
        operationName.append(groupStr);
        operationName.append(requestURL.getPath());
        operationName.append("." + invocation.getMethodName() + "(");
        for (Class<?> classes : invocation.getParameterTypes()) {
            operationName.append(classes.getSimpleName() + ",");
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `apm-sniffer/apm-sdk-plugin/dubbo-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo3/DubboInterceptor.java`
#### Snippet
```java
        operationName.append("." + invocation.getMethodName() + "(");
        for (Class<?> classes : invocation.getParameterTypes()) {
            operationName.append(classes.getSimpleName() + ",");
        }

```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `apm-sniffer/apm-sdk-plugin/dubbo-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo3/DubboInterceptor.java`
#### Snippet
```java
    private String generateRequestURL(URL url, Invocation invocation) {
        StringBuilder requestURL = new StringBuilder();
        requestURL.append(url.getProtocol() + "://");
        requestURL.append(url.getHost());
        requestURL.append(":" + url.getPort() + "/");
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `apm-sniffer/apm-sdk-plugin/dubbo-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo3/DubboInterceptor.java`
#### Snippet
```java
        requestURL.append(url.getProtocol() + "://");
        requestURL.append(url.getHost());
        requestURL.append(":" + url.getPort() + "/");
        requestURL.append(generateOperationName(url, invocation));
        return requestURL.toString();
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `apm-sniffer/apm-sdk-plugin/dubbo-2.7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo/DubboInterceptor.java`
#### Snippet
```java
    private String generateRequestURL(URL url, Invocation invocation) {
        StringBuilder requestURL = new StringBuilder();
        requestURL.append(url.getProtocol() + "://");
        requestURL.append(url.getHost());
        requestURL.append(":" + url.getPort() + "/");
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `apm-sniffer/apm-sdk-plugin/dubbo-2.7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo/DubboInterceptor.java`
#### Snippet
```java
        requestURL.append(url.getProtocol() + "://");
        requestURL.append(url.getHost());
        requestURL.append(":" + url.getPort() + "/");
        requestURL.append(generateOperationName(url, invocation));
        return requestURL.toString();
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `apm-sniffer/apm-sdk-plugin/dubbo-2.7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo/DubboInterceptor.java`
#### Snippet
```java
        operationName.append(groupStr);
        operationName.append(requestURL.getPath());
        operationName.append("." + invocation.getMethodName() + "(");
        for (Class<?> classes : invocation.getParameterTypes()) {
            operationName.append(classes.getSimpleName() + ",");
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `apm-sniffer/apm-sdk-plugin/dubbo-2.7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo/DubboInterceptor.java`
#### Snippet
```java
        operationName.append("." + invocation.getMethodName() + "(");
        for (Class<?> classes : invocation.getParameterTypes()) {
            operationName.append(classes.getSimpleName() + ",");
        }

```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `apm-sniffer/apm-sdk-plugin/baidu-brpc-plugin/src/main/java/org/apache/skywalking/apm/plugin/baidu/brpc/ClientInterceptor.java`
#### Snippet
```java
    private String generateOperationName(Request request) {
        StringBuilder operationName = new StringBuilder();
        operationName.append(request.getServiceName() + "." + request.getMethodName());
        return operationName.toString();
    }
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `apm-sniffer/apm-sdk-plugin/baidu-brpc-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/baidu/brpc3/ClientInterceptor.java`
#### Snippet
```java
    private String generateOperationName(Request request) {
        StringBuilder operationName = new StringBuilder();
        operationName.append(request.getServiceName() + "." + request.getMethodName());
        return operationName.toString();
    }
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/connectionurl/parser/PostgreSQLURLParser.java`
#### Snippet
```java
            for (String host : hostSegment) {
                if (host.split(":").length == 1) {
                    sb.append(host + ":" + DEFAULT_PORT + ",");
                } else {
                    sb.append(host + ",");
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/connectionurl/parser/PostgreSQLURLParser.java`
#### Snippet
```java
                    sb.append(host + ":" + DEFAULT_PORT + ",");
                } else {
                    sb.append(host + ",");
                }
            }
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `apm-sniffer/apm-sdk-plugin/motan-plugin/src/main/java/org/apache/skywalking/apm/plugin/motan/MotanProviderInterceptor.java`
#### Snippet
```java
    private static String generateViewPoint(Request request) {
        StringBuilder viewPoint = new StringBuilder(request.getInterfaceName());
        viewPoint.append("." + request.getMethodName());
        viewPoint.append("(" + request.getParamtersDesc() + ")");
        return viewPoint.toString();
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `apm-sniffer/apm-sdk-plugin/motan-plugin/src/main/java/org/apache/skywalking/apm/plugin/motan/MotanProviderInterceptor.java`
#### Snippet
```java
        StringBuilder viewPoint = new StringBuilder(request.getInterfaceName());
        viewPoint.append("." + request.getMethodName());
        viewPoint.append("(" + request.getParamtersDesc() + ")");
        return viewPoint.toString();
    }
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `apm-sniffer/apm-sdk-plugin/dubbo-3.x-conflict-patch/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo3/patch/MakeWrapperInterceptor.java`
#### Snippet
```java
        }

        c3.append(
            " throw new " + NoSuchMethodException.class.getName() + "(\"Not found method \\\"\"+$2+\"\\\" in class " + c
                .getName() + ".\"); }");
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `apm-sniffer/apm-sdk-plugin/dubbo-3.x-conflict-patch/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo3/patch/MakeWrapperInterceptor.java`
#### Snippet
```java
            }
        }
        c1.append(
            " throw new " + NoSuchPropertyException.class.getName() + "(\"Not found property \\\"\"+$2+\"\\\" filed or setter method in class " + c
                .getName() + ".\"); }");
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `apm-sniffer/apm-sdk-plugin/dubbo-3.x-conflict-patch/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo3/patch/MakeWrapperInterceptor.java`
#### Snippet
```java
            " throw new " + NoSuchPropertyException.class.getName() + "(\"Not found property \\\"\"+$2+\"\\\" filed or setter method in class " + c
                .getName() + ".\"); }");
        c2.append(
            " throw new " + NoSuchPropertyException.class.getName() + "(\"Not found property \\\"\"+$2+\"\\\" filed or setter method in class " + c
                .getName() + ".\"); }");
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `apm-sniffer/apm-sdk-plugin/dubbo-2.7.x-conflict-patch/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo/patch/MakeWrapperInterceptor.java`
#### Snippet
```java
        }

        c3.append(" throw new " + NoSuchMethodException.class.getName() + "(\"Not found method \\\"\"+$2+\"\\\" in class " + c
            .getName() + ".\"); }");

```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `apm-sniffer/apm-sdk-plugin/dubbo-2.7.x-conflict-patch/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo/patch/MakeWrapperInterceptor.java`
#### Snippet
```java
            }
        }
        c1.append(" throw new " + NoSuchPropertyException.class.getName() + "(\"Not found property \\\"\"+$2+\"\\\" filed or setter method in class " + c
            .getName() + ".\"); }");
        c2.append(" throw new " + NoSuchPropertyException.class.getName() + "(\"Not found property \\\"\"+$2+\"\\\" filed or setter method in class " + c
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `apm-sniffer/apm-sdk-plugin/dubbo-2.7.x-conflict-patch/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo/patch/MakeWrapperInterceptor.java`
#### Snippet
```java
        c1.append(" throw new " + NoSuchPropertyException.class.getName() + "(\"Not found property \\\"\"+$2+\"\\\" filed or setter method in class " + c
            .getName() + ".\"); }");
        c2.append(" throw new " + NoSuchPropertyException.class.getName() + "(\"Not found property \\\"\"+$2+\"\\\" filed or setter method in class " + c
            .getName() + ".\"); }");

```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `apm-sniffer/apm-sdk-plugin/cassandra-java-driver-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/cassandra/java/driver/v3/ClusterConstructorWithStateListenerArgInterceptor.java`
#### Snippet
```java
        StringBuilder hosts = new StringBuilder();
        for (InetSocketAddress inetSocketAddress : inetSocketAddresses) {
            hosts.append(inetSocketAddress.getHostName() + ":" + inetSocketAddress.getPort() + ",");
        }

```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `apm-sniffer/apm-sdk-plugin/dubbo-conflict-patch/src/main/java/org/apache/skywalking/apm/plugin/dubbo/patch/MakeWrapperInterceptor.java`
#### Snippet
```java
        }

        c3.append(" throw new " + NoSuchMethodException.class.getName() + "(\"Not found method \\\"\"+$2+\"\\\" in class " + c
            .getName() + ".\"); }");

```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `apm-sniffer/apm-sdk-plugin/dubbo-conflict-patch/src/main/java/org/apache/skywalking/apm/plugin/dubbo/patch/MakeWrapperInterceptor.java`
#### Snippet
```java
            }
        }
        c1.append(" throw new " + NoSuchPropertyException.class.getName() + "(\"Not found property \\\"\"+$2+\"\\\" filed or setter method in class " + c
            .getName() + ".\"); }");
        c2.append(" throw new " + NoSuchPropertyException.class.getName() + "(\"Not found property \\\"\"+$2+\"\\\" filed or setter method in class " + c
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `apm-sniffer/apm-sdk-plugin/dubbo-conflict-patch/src/main/java/org/apache/skywalking/apm/plugin/dubbo/patch/MakeWrapperInterceptor.java`
#### Snippet
```java
        c1.append(" throw new " + NoSuchPropertyException.class.getName() + "(\"Not found property \\\"\"+$2+\"\\\" filed or setter method in class " + c
            .getName() + ".\"); }");
        c2.append(" throw new " + NoSuchPropertyException.class.getName() + "(\"Not found property \\\"\"+$2+\"\\\" filed or setter method in class " + c
            .getName() + ".\"); }");

```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `apm-sniffer/apm-sdk-plugin/dubbo-plugin/src/main/java/org/apache/skywalking/apm/plugin/dubbo/DubboInterceptor.java`
#### Snippet
```java
    private String generateRequestURL(URL url, Invocation invocation) {
        StringBuilder requestURL = new StringBuilder();
        requestURL.append(url.getProtocol() + "://");
        requestURL.append(url.getHost());
        requestURL.append(":" + url.getPort() + "/");
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `apm-sniffer/apm-sdk-plugin/dubbo-plugin/src/main/java/org/apache/skywalking/apm/plugin/dubbo/DubboInterceptor.java`
#### Snippet
```java
        requestURL.append(url.getProtocol() + "://");
        requestURL.append(url.getHost());
        requestURL.append(":" + url.getPort() + "/");
        requestURL.append(generateOperationName(url, invocation));
        return requestURL.toString();
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `apm-sniffer/apm-sdk-plugin/dubbo-plugin/src/main/java/org/apache/skywalking/apm/plugin/dubbo/DubboInterceptor.java`
#### Snippet
```java
        operationName.append(groupStr);
        operationName.append(requestURL.getPath());
        operationName.append("." + invocation.getMethodName() + "(");
        for (Class<?> classes : invocation.getParameterTypes()) {
            operationName.append(classes.getSimpleName() + ",");
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `apm-sniffer/apm-sdk-plugin/dubbo-plugin/src/main/java/org/apache/skywalking/apm/plugin/dubbo/DubboInterceptor.java`
#### Snippet
```java
        operationName.append("." + invocation.getMethodName() + "(");
        for (Class<?> classes : invocation.getParameterTypes()) {
            operationName.append(classes.getSimpleName() + ",");
        }

```

## RuleId[ruleID=IOResource]
### RuleId[ruleID=IOResource]
'HttpAsyncResponseConsumerWrapper' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `apm-sniffer/apm-sdk-plugin/httpasyncclient-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/httpasyncclient/v4/HttpAsyncClientInterceptor.java`
#### Snippet
```java
        HttpContext context = (HttpContext) allArguments[2];
        FutureCallback callback = (FutureCallback) allArguments[3];
        allArguments[1] = new HttpAsyncResponseConsumerWrapper(consumer);
        allArguments[3] = new FutureCallbackWrapper(callback);
        Constants.HTTP_CONTEXT_LOCAL.set(context);
```

### RuleId[ruleID=IOResource]
'InputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/bootstrap/BootstrapInstrumentBoost.java`
#### Snippet
```java
        try {
            String classResourceName = className.replaceAll("\\.", "/") + ".class";
            InputStream resourceAsStream = AgentClassLoader.getDefault().getResourceAsStream(classResourceName);

            if (resourceAsStream == null) {
```

## RuleId[ruleID=RedundantLengthCheck]
### RuleId[ruleID=RedundantLengthCheck]
Redundant array length check
in `apm-sniffer/apm-sdk-plugin/dubbo-3.x-conflict-patch/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo3/patch/MakeWrapperInterceptor.java`
#### Snippet
```java

    private static boolean hasMethods(Method[] methods) {
        if (methods == null || methods.length == 0) {
            return false;
        }
```

### RuleId[ruleID=RedundantLengthCheck]
Redundant array length check
in `apm-sniffer/apm-sdk-plugin/dubbo-2.7.x-conflict-patch/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo/patch/MakeWrapperInterceptor.java`
#### Snippet
```java

    private static boolean hasMethods(Method[] methods) {
        if (methods == null || methods.length == 0) {
            return false;
        }
```

### RuleId[ruleID=RedundantLengthCheck]
Redundant array length check
in `apm-sniffer/optional-plugins/trace-ignore-plugin/src/main/java/org/apache/skywalking/apm/plugin/trace/ignore/TraceIgnoreExtendService.java`
#### Snippet
```java
    @Override
    public boolean trySampling(final String operationName) {
        if (patterns.length > 0) {
            for (String pattern : patterns) {
                if (pathMatcher.match(pattern, operationName)) {
```

### RuleId[ruleID=RedundantLengthCheck]
Redundant array length check
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/v2/ClassEnhancePluginDefineV2.java`
#### Snippet
```java
        StaticMethodsInterceptV2Point[] staticMethodsInterceptV2Points = getStaticMethodsInterceptV2Points();
        String enhanceOriginClassName = typeDescription.getTypeName();
        if (staticMethodsInterceptV2Points == null || staticMethodsInterceptV2Points.length == 0) {
            return newClassBuilder;
        }
```

### RuleId[ruleID=RedundantLengthCheck]
Redundant array length check
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/ClassEnhancePluginDefine.java`
#### Snippet
```java
        StaticMethodsInterceptPoint[] staticMethodsInterceptPoints = getStaticMethodsInterceptPoints();
        String enhanceOriginClassName = typeDescription.getTypeName();
        if (staticMethodsInterceptPoints == null || staticMethodsInterceptPoints.length == 0) {
            return newClassBuilder;
        }
```

### RuleId[ruleID=RedundantLengthCheck]
Redundant array length check
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/BaseTagAnnotationInterceptor.java`
#### Snippet
```java

        final Tags tags = method.getAnnotation(Tags.class);
        if (tags != null && tags.value().length > 0) {
            for (final Tag tag : tags.value()) {
                if (!TagUtil.isReturnTag(tag.value())) {
```

### RuleId[ruleID=RedundantLengthCheck]
Redundant array length check
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/BaseTagAnnotationInterceptor.java`
#### Snippet
```java
        final Map<String, Object> context = CustomizeExpression.evaluationReturnContext(ret);
        final Tags tags = method.getAnnotation(Tags.class);
        if (tags != null && tags.value().length > 0) {
            for (final Tag tag : tags.value()) {
                if (TagUtil.isReturnTag(tag.value())) {
```

### RuleId[ruleID=RedundantLengthCheck]
Redundant array length check
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/BaseTraceAnnotationInterceptor.java`
#### Snippet
```java

        final org.apache.skywalking.apm.toolkit.trace.Tags tags = method.getAnnotation(Tags.class);
        if (tags != null && tags.value().length > 0) {
            for (final Tag tag : tags.value()) {
                if (!TagUtil.isReturnTag(tag.value())) {
```

### RuleId[ruleID=RedundantLengthCheck]
Redundant array length check
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/BaseTraceAnnotationInterceptor.java`
#### Snippet
```java
            final Map<String, Object> context = CustomizeExpression.evaluationReturnContext(ret);
            final Tags tags = method.getAnnotation(Tags.class);
            if (tags != null && tags.value().length > 0) {
                for (final Tag tag : tags.value()) {
                    if (TagUtil.isReturnTag(tag.value())) {
```

### RuleId[ruleID=RedundantLengthCheck]
Redundant array length check
in `apm-sniffer/apm-sdk-plugin/dubbo-conflict-patch/src/main/java/org/apache/skywalking/apm/plugin/dubbo/patch/MakeWrapperInterceptor.java`
#### Snippet
```java

    private static boolean hasMethods(Method[] methods) {
        if (methods == null || methods.length == 0) {
            return false;
        }
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Dubbo` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/dubbo-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo3/DubboPluginConfig.java`
#### Snippet
```java

        @PluginConfig(root = DubboPluginConfig.class)
        public static class Dubbo {

            public static boolean COLLECT_CONSUMER_ARGUMENTS = false;
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Dubbo` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/dubbo-2.7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo/DubboPluginConfig.java`
#### Snippet
```java

        @PluginConfig(root = DubboPluginConfig.class)
        public static class Dubbo {

            public static boolean COLLECT_CONSUMER_ARGUMENTS = false;
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Log4j2SkyWalkingContextOutputAppender` has only 'static' members, and lacks a 'private' constructor
in `apm-application-toolkit/apm-toolkit-log4j-2.x/src/main/java/org/apache/skywalking/apm/toolkit/log/log4j/v2/x/Log4j2SkyWalkingContextOutputAppender.java`
#### Snippet
```java
package org.apache.skywalking.apm.toolkit.log.log4j.v2.x;

public class Log4j2SkyWalkingContextOutputAppender {
    /**
     * As default, append "SW_CTX: N/A" to the output message, if SkyWalking agent in active mode, append the real SkyWalking context
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Log4j2OutputAppender` has only 'static' members, and lacks a 'private' constructor
in `apm-application-toolkit/apm-toolkit-log4j-2.x/src/main/java/org/apache/skywalking/apm/toolkit/log/log4j/v2/x/Log4j2OutputAppender.java`
#### Snippet
```java
package org.apache.skywalking.apm.toolkit.log.log4j.v2.x;

public class Log4j2OutputAppender {
    /**
     * As default, append "TID: N/A" to the output message, if SkyWalking agent in active mode, append the real traceId
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constant` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/shardingsphere-plugins/sharding-sphere-5.0.0-plugin/src/main/java/org/apache/skywalking/apm/plugin/shardingsphere/v500/Constant.java`
#### Snippet
```java
package org.apache.skywalking.apm.plugin.shardingsphere.v500;

public final class Constant {

    public static final String CONTEXT_SNAPSHOT = "CONTEXT_SNAPSHOT";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Elasticsearch` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/elasticsearch-6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v6/ElasticsearchPluginConfig.java`
#### Snippet
```java
    public static class Plugin {
        @PluginConfig(root = ElasticsearchPluginConfig.class)
        public static class Elasticsearch {
            /**
             * If true, trace all the DSL(Domain Specific Language) in ElasticSearch access, default is false.
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/elasticsearch-6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v6/interceptor/Constants.java`
#### Snippet
```java
import org.apache.skywalking.apm.agent.core.context.tag.Tags;

public class Constants {
    //interceptor class
    public static final String REST_HIGH_LEVEL_CLIENT_CON_INTERCEPTOR = "org.apache.skywalking.apm.plugin.elasticsearch.v6.interceptor.RestHighLevelClientConInterceptor";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constant` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/shardingsphere-plugins/sharding-sphere-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/shardingsphere/Constant.java`
#### Snippet
```java
package org.apache.skywalking.apm.plugin.shardingsphere;

public final class Constant {

    public static final String CONTEXT_SNAPSHOT = "CONTEXT_SNAPSHOT";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/httpasyncclient-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/httpasyncclient/v4/Constants.java`
#### Snippet
```java
import org.apache.http.protocol.HttpContext;

public class Constants {

    public final static ThreadLocal<HttpContext> HTTP_CONTEXT_LOCAL = new ThreadLocal<>();
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/mysql-8.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/mysql/v8/define/Constants.java`
#### Snippet
```java
package org.apache.skywalking.apm.plugin.jdbc.mysql.v8.define;

public class Constants {
    public static final String WITNESS_MYSQL_8X_CLASS = "com.mysql.cj.interceptors.QueryInterceptor";
}
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `MongoDB` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/mongodb-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/mongodb/v3/MongoPluginConfig.java`
#### Snippet
```java
    public static class Plugin {
        @PluginConfig(root = MongoPluginConfig.class)
        public static class MongoDB {
            /**
             * If true, trace all the parameters in MongoDB access, default is false. Only trace the operation, not
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `PlaceholderConfigurerSupport` has only 'static' members, and lacks a 'private' constructor
in `apm-commons/apm-util/src/main/java/org/apache/skywalking/apm/util/PlaceholderConfigurerSupport.java`
#### Snippet
```java
package org.apache.skywalking.apm.util;

public class PlaceholderConfigurerSupport {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Jedis` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/jedis-plugins/jedis-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jedis/v4/JedisPluginConfig.java`
#### Snippet
```java
    public static class Plugin {
        @PluginConfig(root = JedisPluginConfig.class)
        public static class Jedis {
            /**
             * If set to true, the parameters of the Redis command would be collected.
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Elasticsearch` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/elasticsearch-7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v7/ElasticsearchPluginConfig.java`
#### Snippet
```java
    public static class Plugin {
        @PluginConfig(root = ElasticsearchPluginConfig.class)
        public static class Elasticsearch {
            /**
             * If true, trace all the DSL(Domain Specific Language) in ElasticSearch access, default is false
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/elasticsearch-7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v7/Constants.java`
#### Snippet
```java
import org.apache.skywalking.apm.agent.core.context.tag.Tags;

public class Constants {

    //witnessClasses
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `TraceContext` has only 'static' members, and lacks a 'private' constructor
in `apm-application-toolkit/apm-toolkit-trace/src/main/java/org/apache/skywalking/apm/toolkit/trace/TraceContext.java`
#### Snippet
```java
 * <p>
 */
public class TraceContext {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `StringUtil` has only 'static' members, and lacks a 'private' constructor
in `apm-commons/apm-util/src/main/java/org/apache/skywalking/apm/util/StringUtil.java`
#### Snippet
```java
import java.util.function.Consumer;

public final class StringUtil {
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ActiveSpan` has only 'static' members, and lacks a 'private' constructor
in `apm-application-toolkit/apm-toolkit-trace/src/main/java/org/apache/skywalking/apm/toolkit/trace/ActiveSpan.java`
#### Snippet
```java
 * provide custom api that set tag for current active span.
 */
public class ActiveSpan {
    /**
     * @param key   tag key
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `CpuPolicy` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/optional-plugins/trace-sampler-cpu-policy-plugin/src/main/java/org/apache/skywalking/apm/plugin/cpu/policy/conf/TraceSamplerCpuPolicyPluginConfig.java`
#### Snippet
```java
    public static class Plugin {
        @PluginConfig(root = TraceSamplerCpuPolicyPluginConfig.class)
        public static class CpuPolicy {
            public static double SAMPLE_CPU_USAGE_PERCENT_LIMIT = -1;
        }
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ConfigInitializer` has only 'static' members, and lacks a 'private' constructor
in `apm-commons/apm-util/src/main/java/org/apache/skywalking/apm/util/ConfigInitializer.java`
#### Snippet
```java
 * <p>
 */
public class ConfigInitializer {

    public static void initialize(Properties properties, Class<?> rootConfigType) throws IllegalAccessException {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/grpc-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/grpc/v1/Constants.java`
#### Snippet
```java
 * Constant variables
 */
public class Constants {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `OperationNameFormatUtil` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/grpc-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/grpc/v1/OperationNameFormatUtil.java`
#### Snippet
```java
 * Operation Name utility
 */
public class OperationNameFormatUtil {

    public static String formatOperationName(MethodDescriptor<?, ?> methodDescriptor) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/mssql-commons/src/main/java/org/apache/skywalking/apm/plugin/mssql/commons/Constants.java`
#### Snippet
```java
package org.apache.skywalking.apm.plugin.mssql.commons;

public class Constants {
    public static final String CREATE_CALLABLE_STATEMENT_INTERCEPTOR = "org.apache.skywalking.apm.plugin.mssql.commons.CreateCallableStatementInterceptor";
    public static final String CREATE_PREPARED_STATEMENT_INTERCEPTOR = "org.apache.skywalking.apm.plugin.mssql.commons.CreatePreparedStatementInterceptor";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/hystrix-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/hystrix/v1/Constants.java`
#### Snippet
```java
package org.apache.skywalking.apm.plugin.hystrix.v1;

public class Constants {

    public static final String ISOLATE_STRATEGY_KEY_IN_RUNNING_CONTEXT = "ISOLATE_STRATEGY";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `JDBC` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/JDBCPluginConfig.java`
#### Snippet
```java
    public static class Plugin {
        @PluginConfig(root = JDBCPluginConfig.class)
        public static class JDBC {
            /**
             * If set to true, the parameters of the sql (typically {@link java.sql.PreparedStatement}) would be
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `SqlBodyUtil` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/SqlBodyUtil.java`
#### Snippet
```java
 * Sql body utility
 */
public class SqlBodyUtil {
    private static final String EMPTY_STRING = "";

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `CallableStatementTracing` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/trace/CallableStatementTracing.java`
#### Snippet
```java
 * java.sql.CallableStatement}.
 */
public class CallableStatementTracing {

    public static <R> R execute(java.sql.CallableStatement realStatement, ConnectionInfo connectInfo, String method,
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `PreparedStatementTracing` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/trace/PreparedStatementTracing.java`
#### Snippet
```java
 * java.sql.PreparedStatement}.
 */
public class PreparedStatementTracing {

    public static <R> R execute(java.sql.PreparedStatement realStatement, ConnectionInfo connectInfo, String method,
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `StatementTracing` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/trace/StatementTracing.java`
#### Snippet
```java
 * java.sql.Statement}.
 */
public class StatementTracing {
    public static <R> R execute(java.sql.Statement realStatement, ConnectionInfo connectInfo, String method, String sql,
        Executable<R> exec) throws SQLException {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/define/Constants.java`
#### Snippet
```java
import java.util.Set;

public class Constants {
    public static final String CREATE_STATEMENT_INTERCEPT_CLASS = "org.apache.skywalking.apm.plugin.jdbc.JDBCStatementInterceptor";

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `URLParser` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/connectionurl/parser/URLParser.java`
#### Snippet
```java
 * some url cannot be parsed, such as Oracle connection url with multiple host.
 */
public class URLParser {

    private static final String MYSQL_JDBC_URL_PREFIX = "jdbc:mysql";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ConnectionCache` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/mysql-common/src/main/java/org/apache/skywalking/apm/plugin/jdbc/mysql/ConnectionCache.java`
#### Snippet
```java
import java.util.concurrent.ConcurrentHashMap;

public class ConnectionCache {
    private static final ConcurrentHashMap<String, ConnectionInfo> CONNECTIONS_MAP = new ConcurrentHashMap<String, ConnectionInfo>();

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/mysql-common/src/main/java/org/apache/skywalking/apm/plugin/jdbc/mysql/Constants.java`
#### Snippet
```java
package org.apache.skywalking.apm.plugin.jdbc.mysql;

public class Constants {
    public static final String CREATE_CALLABLE_STATEMENT_INTERCEPTOR = "org.apache.skywalking.apm.plugin.jdbc.mysql.CreateCallableStatementInterceptor";
    public static final String CREATE_PREPARED_STATEMENT_INTERCEPTOR = "org.apache.skywalking.apm.plugin.jdbc.mysql.CreatePreparedStatementInterceptor";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `InfluxDB` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/influxdb-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/influxdb/InfluxDBPluginConfig.java`
#### Snippet
```java
    public static class Plugin {
        @PluginConfig(root = InfluxDBPluginConfig.class)
        public static class InfluxDB {
            /**
             * If set to true, the parameters of the InfluxQL would be collected.
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/influxdb-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/influxdb/define/Constants.java`
#### Snippet
```java
 * @since 2020/6/6
 */
public class Constants {

  public static final String DB_TYPE = "InfluxDB";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Http` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/micronaut-plugins/micronaut-http-server-plugin/src/main/java/org/apache/skywalking/apm/plugin/micronaut/http/server/MicronautHttpServerPluginConfig.java`
#### Snippet
```java

        @PluginConfig(root = MicronautHttpServerPluginConfig.class)
        public static class Http {
            /**
             * When either {@link MicronautHttpServer#COLLECT_HTTP_PARAMS} is enabled, how many characters to keep and send to the
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `MicronautHttpServer` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/micronaut-plugins/micronaut-http-server-plugin/src/main/java/org/apache/skywalking/apm/plugin/micronaut/http/server/MicronautHttpServerPluginConfig.java`
#### Snippet
```java
    public static class Plugin {
        @PluginConfig(root = MicronautHttpServerPluginConfig.class)
        public static class MicronautHttpServer {
            /**
             * This config item controls that whether the Http plugin should collect the parameters of the request.
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `MicronautCommons` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/micronaut-plugins/micronaut-http-server-plugin/src/main/java/org/apache/skywalking/apm/plugin/micronaut/http/server/MicronautCommons.java`
#### Snippet
```java
import org.apache.skywalking.apm.util.StringUtil;

class MicronautCommons {
    static final String SPAN_KEY = "CORS_SPAN";
    static final String SKY_CONTEXT_SNAPSHOT_KEY = "CORS_SNAPSHOT";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ProfileConstants` has only 'static' members, and lacks a 'private' constructor
in `apm-protocol/apm-network/src/main/java/org/apache/skywalking/apm/network/constants/ProfileConstants.java`
#### Snippet
```java
 * profile task limit constants
 */
public class ProfileConstants {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Log` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-logging-common/src/main/java/org/apache/skywalking/apm/toolkit/logging/common/log/ToolkitConfig.java`
#### Snippet
```java
        public static class Toolkit {
            @PluginConfig(root = ToolkitConfig.class)
            public static class Log {
                /**
                 * Whether or not to transmit logged data as formatted or un-formatted.
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `CommandDeserializer` has only 'static' members, and lacks a 'private' constructor
in `apm-protocol/apm-network/src/main/java/org/apache/skywalking/apm/network/trace/component/command/CommandDeserializer.java`
#### Snippet
```java
import org.apache.skywalking.apm.network.common.v3.Command;

public class CommandDeserializer {

    public static BaseCommand deserialize(final Command command) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/mysql-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/mysql/v5/define/Constants.java`
#### Snippet
```java
package org.apache.skywalking.apm.plugin.jdbc.mysql.v5.define;

public class Constants {
    public static final String WITNESS_MYSQL_5X_CLASS = "com.mysql.jdbc.ConnectionImpl";
}
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ComponentsDefine` has only 'static' members, and lacks a 'private' constructor
in `apm-protocol/apm-network/src/main/java/org/apache/skywalking/apm/network/trace/component/ComponentsDefine.java`
#### Snippet
```java
 * The supported list of skywalking java sniffer.
 */
public class ComponentsDefine {

    public static final OfficialComponent TOMCAT = new OfficialComponent(1, "Tomcat");
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `NatsCommons` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/nats-2.14.x-2.15.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/nats/client/NatsCommons.java`
#### Snippet
```java
import java.util.Optional;

public class NatsCommons {

    private static final String SID = "sid";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/jetty-plugin/jetty-server-9.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jetty/v9/server/Constants.java`
#### Snippet
```java
package org.apache.skywalking.apm.plugin.jetty.v9.server;

public class Constants {
    public static final String FORWARD_REQUEST_FLAG = "SW_FORWARD_REQUEST_FLAG";
}
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constant` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/optional-plugins/shenyu-2.4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/shenyu/v24x/Constant.java`
#### Snippet
```java
package org.apache.skywalking.apm.plugin.shenyu.v24x;

public class Constant {
    public static final String SKYWALKING_CONTEXT_SNAPSHOT = "SKYWALKING_CONTEXT_SNAPSHOT";

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `CommonUtil` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/optional-plugins/shenyu-2.4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/shenyu/v24x/util/CommonUtil.java`
#### Snippet
```java
import org.springframework.web.server.adapter.DefaultServerWebExchange;

public class CommonUtil {

    public static EnhancedInstance getEnhancedServerWebExchange(Object o) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ReflectionUtils` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/thrift-plugin/src/main/java/org/apache/skywalking/apm/plugin/thrift/commons/ReflectionUtils.java`
#### Snippet
```java
import java.lang.reflect.Field;

public class ReflectionUtils {

    public static final void setValue(Class klass, Object instance, String name, Object value) throws NoSuchFieldException, IllegalAccessException {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/undertow-plugins/undertow-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/undertow/v2x/Constants.java`
#### Snippet
```java
package org.apache.skywalking.apm.plugin.undertow.v2x;

public class Constants {
    public static final String FORWARD_REQUEST_FLAG = "SW_FORWARD_REQUEST_FLAG";
}
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `EnvUtil` has only 'static' members, and lacks a 'private' constructor
in `apm-commons/apm-datacarrier/src/main/java/org/apache/skywalking/apm/commons/datacarrier/EnvUtil.java`
#### Snippet
```java
 * Read value from system env.
 */
public class EnvUtil {
    public static int getInt(String envName, int defaultValue) {
        int value = defaultValue;
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `SpringMVC` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/spring-plugins/mvc-annotation-commons/src/main/java/org/apache/skywalking/apm/plugin/spring/mvc/commons/SpringMVCPluginConfig.java`
#### Snippet
```java
    public static class Plugin {
        @PluginConfig(root = SpringMVCPluginConfig.class)
        public static class SpringMVC {
            /**
             * If true, the fully qualified method name will be used as the endpoint name instead of the request URL,
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Http` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/spring-plugins/mvc-annotation-commons/src/main/java/org/apache/skywalking/apm/plugin/spring/mvc/commons/SpringMVCPluginConfig.java`
#### Snippet
```java

        @PluginConfig(root = SpringMVCPluginConfig.class)
        public static class Http {
            /**
             * When either {@link Plugin.SpringMVC#COLLECT_HTTP_PARAMS} is enabled, how many characters to keep and send
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/spring-plugins/mvc-annotation-commons/src/main/java/org/apache/skywalking/apm/plugin/spring/mvc/commons/Constants.java`
#### Snippet
```java
 * Interceptor class name constant variables
 */
public class Constants {
    public static final String GET_BEAN_INTERCEPTOR = "org.apache.skywalking.apm.plugin.spring.mvc.commons.interceptor.GetBeanInterceptor";

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/httpclient-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/httpclient/v5/Constants.java`
#### Snippet
```java
package org.apache.skywalking.apm.plugin.httpclient.v5;

public class Constants {

    public static String SKYWALKING_CONTEXT_SNAPSHOT = "skywalking-context-snapshot";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ParsePathUtil` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/spring-plugins/mvc-annotation-commons/src/main/java/org/apache/skywalking/apm/plugin/spring/mvc/commons/ParsePathUtil.java`
#### Snippet
```java
 * Tools for parsing path from annotation
 */
public class ParsePathUtil {

    public static String recursiveParseMethodAnnotation(Method method, Function<Method, String> parseFunc) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `RequestUtil` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/spring-plugins/mvc-annotation-commons/src/main/java/org/apache/skywalking/apm/plugin/spring/mvc/commons/RequestUtil.java`
#### Snippet
```java
import java.util.Map;

public class RequestUtil {
    public static void collectHttpParam(HttpServletRequest request, AbstractSpan span) {
        final Map<String, String[]> parameterMap = request.getParameterMap();
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `MeterIdConverter` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-meter-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/meter/util/MeterIdConverter.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class MeterIdConverter {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `RestTemplateRuntimeContextHelper` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/spring-plugins/resttemplate-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/resttemplate/helper/RestTemplateRuntimeContextHelper.java`
#### Snippet
```java
import org.apache.skywalking.apm.agent.core.context.ContextManager;

public class RestTemplateRuntimeContextHelper {

    private static final String REST_TEMPLATE_CONTEXT_CARRIER_KEY_IN_RUNTIME_CONTEXT = "REST_TEMPLATE_CONTEXT_CARRIER";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `SegmentRefAssert` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-test-tools/src/main/java/org/apache/skywalking/apm/agent/test/tools/SegmentRefAssert.java`
#### Snippet
```java
import static org.hamcrest.MatcherAssert.assertThat;

public class SegmentRefAssert {
    public static void assertSegmentId(TraceSegmentRef ref, String segmentId) {
        assertThat(SegmentRefHelper.getTraceSegmentId(ref).toString(), is(segmentId));
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `FieldSetter` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-test-tools/src/main/java/org/apache/skywalking/apm/agent/test/helper/FieldSetter.java`
#### Snippet
```java
import java.lang.reflect.Field;

public class FieldSetter {

    public static <T> void setValue(Object instance, String fieldName,
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `SegmentRefHelper` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-test-tools/src/main/java/org/apache/skywalking/apm/agent/test/helper/SegmentRefHelper.java`
#### Snippet
```java
import org.apache.skywalking.apm.agent.core.context.trace.TraceSegmentRef;

public class SegmentRefHelper {
    public static String getPeerHost(TraceSegmentRef ref) {
        try {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `FieldGetter` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-test-tools/src/main/java/org/apache/skywalking/apm/agent/test/helper/FieldGetter.java`
#### Snippet
```java
import java.lang.reflect.Field;

public class FieldGetter {
    @SuppressWarnings("TypeParameterUnusedInFormals")
    public static <T> T getValue(Object instance,
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `SegmentHelper` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-test-tools/src/main/java/org/apache/skywalking/apm/agent/test/helper/SegmentHelper.java`
#### Snippet
```java
import org.apache.skywalking.apm.agent.core.context.trace.TraceSegment;

public class SegmentHelper {

    public static List<AbstractTracingSpan> getSpans(TraceSegment traceSegment) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `SpanAssert` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-test-tools/src/main/java/org/apache/skywalking/apm/agent/test/tools/SpanAssert.java`
#### Snippet
```java
import static org.junit.Assert.assertThat;

public class SpanAssert {
    public static void assertLogSize(AbstractSpan span, int exceptedSize) {
        assertThat(SpanHelper.getLogs(span).size(), is(exceptedSize));
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Kafka` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/optional-reporter-plugins/kafka-reporter-plugin/src/main/java/org/apache/skywalking/apm/agent/core/kafka/KafkaReporterPluginConfig.java`
#### Snippet
```java
    public static class Plugin {
        @PluginConfig(root = KafkaReporterPluginConfig.class)
        public static class Kafka {
            /**
             * <B>bootstrap_servers</B>: A list of host/port pairs to use for establishing the initial connection to the Kafka cluster.
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `SpanHelper` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-test-tools/src/main/java/org/apache/skywalking/apm/agent/test/helper/SpanHelper.java`
#### Snippet
```java
import org.apache.skywalking.apm.agent.core.context.util.TagValuePair;

public class SpanHelper {
    public static int getParentSpanId(AbstractSpan tracingSpan) {
        try {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `MongoDB` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/mongodb-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/mongodb/v4/support/MongoPluginConfig.java`
#### Snippet
```java
    public static class Plugin {
        @PluginConfig(root = MongoPluginConfig.class)
        public static class MongoDB {
            /**
             * If true, trace all the parameters in MongoDB access, default is false. Only trace the operation, not
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `SpringTransaction` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/optional-plugins/optional-spring-plugins/spring-tx-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/transaction/SpringTXPluginConfig.java`
#### Snippet
```java
    public static class Plugin {
        @PluginConfig(root = SpringTXPluginConfig.class)
        public static class SpringTransaction {

            /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/cassandra-java-driver-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/cassandra/java/driver/v3/Constants.java`
#### Snippet
```java
package org.apache.skywalking.apm.plugin.cassandra.java.driver.v3;

public class Constants {
    public static final String CASSANDRA_OP_PREFIX = "Cassandra/";
    public static final String CASSANDRA_DB_TYPE = "cassandra";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/pulsar-2.2-2.7-plugin/src/main/java/org/apache/skywalking/apm/plugin/pulsar/define/Constants.java`
#### Snippet
```java
 * Pulsar 2.7.x plugin constants
 */
public class Constants {

    public static final String[] WITNESS_PULSAR_27X_CLASSES = new String[] {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Http` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/tomcat-10x-plugin/src/main/java/org/apache/skywalking/apm/plugin/tomcat10x/TomcatPluginConfig.java`
#### Snippet
```java

        @PluginConfig(root = TomcatPluginConfig.class)
        public static class Http {
            /**
             * When either {@link Tomcat#COLLECT_HTTP_PARAMS} is enabled, how many characters to keep and send to the
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Tomcat` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/tomcat-10x-plugin/src/main/java/org/apache/skywalking/apm/plugin/tomcat10x/TomcatPluginConfig.java`
#### Snippet
```java
    public static class Plugin {
        @PluginConfig(root = TomcatPluginConfig.class)
        public static class Tomcat {
            /**
             * This config item controls that whether the Tomcat plugin should collect the parameters of the request.
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/tomcat-10x-plugin/src/main/java/org/apache/skywalking/apm/plugin/tomcat10x/Constants.java`
#### Snippet
```java
package org.apache.skywalking.apm.plugin.tomcat10x;

public class Constants {
    public static final String FORWARD_REQUEST_FLAG = "SW_FORWARD_REQUEST_FLAG";
}
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `MicronautHttpClient` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/micronaut-plugins/micronaut-http-client-plugin/src/main/java/org/apache/skywalking/apm/plugin/micronaut/http/client/MicronautHttpClientPluginConfig.java`
#### Snippet
```java
    public static class Plugin {
        @PluginConfig(root = MicronautHttpClientPluginConfig.class)
        public static class MicronautHttpClient {
            /**
             * This config item controls that whether the HttpClient plugin should collect the parameters of the request.
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Http` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/micronaut-plugins/micronaut-http-client-plugin/src/main/java/org/apache/skywalking/apm/plugin/micronaut/http/client/MicronautHttpClientPluginConfig.java`
#### Snippet
```java

        @PluginConfig(root = MicronautHttpClientPluginConfig.class)
        public static class Http {
            /**
             * When either {@link MicronautHttpClient#COLLECT_HTTP_PARAMS} is enabled, how many characters to keep and send to the
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `MicronautCommons` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/micronaut-plugins/micronaut-http-client-plugin/src/main/java/org/apache/skywalking/apm/plugin/micronaut/http/client/MicronautCommons.java`
#### Snippet
```java
import java.util.function.Consumer;

public class MicronautCommons {

    private static final String SPAN_KEY = "CORS_SPAN";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Neo4jPluginConstants` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/neo4j-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/neo4j/v4x/Neo4jPluginConstants.java`
#### Snippet
```java
 * Constants for neo4j plugin
 */
public final class Neo4jPluginConstants {

    public static final String EMPTY_STRING = "";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Neo4j` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/neo4j-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/neo4j/v4x/Neo4jPluginConfig.java`
#### Snippet
```java

        @PluginConfig(root = Neo4jPluginConfig.class)
        public static class Neo4j {

            /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `CypherUtils` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/neo4j-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/neo4j/v4x/util/CypherUtils.java`
#### Snippet
```java
 * Cypher language utils
 */
public final class CypherUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Redisson` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/redisson-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/redisson/v3/RedissonPluginConfig.java`
#### Snippet
```java
    public static class Plugin {
        @PluginConfig(root = RedissonPluginConfig.class)
        public static class Redisson {
            /**
             * If set to true, the parameters of the Redis command would be collected.
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ClassUtil` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/redisson-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/redisson/v3/util/ClassUtil.java`
#### Snippet
```java
import java.lang.reflect.Field;

public class ClassUtil {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/kafka-commons/src/main/java/org/apache/skywalking/apm/plugin/kafka/define/Constants.java`
#### Snippet
```java
package org.apache.skywalking.apm.plugin.kafka.define;

public class Constants {

    public static final String KAFKA_FLAG = "SW_KAFKA_FLAG";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `InterceptorMethod` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/kafka-commons/src/main/java/org/apache/skywalking/apm/plugin/kafka/define/InterceptorMethod.java`
#### Snippet
```java
import org.apache.skywalking.apm.agent.core.context.ContextManager;

public class InterceptorMethod {

    public static void beginKafkaPollAndInvokeIteration(String operationName) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/xxl-job-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/xxljob/Constants.java`
#### Snippet
```java
import static net.bytebuddy.matcher.ElementMatchers.takesArguments;

public class Constants {

    public static final String XXL_IJOB_HANDLER = "com.xxl.job.core.handler.IJobHandler";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `MeterBuilder` has only 'static' members, and lacks a 'private' constructor
in `apm-application-toolkit/apm-toolkit-micrometer-registry/src/main/java/org/apache/skywalking/apm/meter/micrometer/MeterBuilder.java`
#### Snippet
```java
 * Help to build the meter
 */
public class MeterBuilder {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/optional-plugins/sentinel-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/sentinel/v1/Constants.java`
#### Snippet
```java
 * Interceptor class name constant variables
 */
public class Constants {
    public static final String SENTINEL_SPAN = "SW_SENTINEL_SPAN";
}
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ZooOpt` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/optional-plugins/zookeeper-3.4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/zookeeper/ZooOpt.java`
#### Snippet
```java
import org.apache.zookeeper.proto.SyncRequest;

class ZooOpt {

    private static final Map<Integer, String> OPTS = new HashMap<>();
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/pulsar-2.8.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/pulsar/v28x/define/Constants.java`
#### Snippet
```java
 * Pulsar 2.8.x plugin constants
 */
public class Constants {

    public static final WitnessMethod WITNESS_PULSAR_28X_METHOD = new WitnessMethod(
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `GuavaCacheOperationConvertor` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/optional-plugins/guava-cache-plugin/src/main/java/org/apache/skywalking/apm/plugin/guava/cache/GuavaCacheOperationConvertor.java`
#### Snippet
```java
import java.util.Optional;

public class GuavaCacheOperationConvertor {

    public static Optional<String> parseOperation(String cmd) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `GuavaCache` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/optional-plugins/guava-cache-plugin/src/main/java/org/apache/skywalking/apm/plugin/guava/cache/GuavaCachePluginConfig.java`
#### Snippet
```java
    public static class Plugin {
        @PluginConfig(root = GuavaCachePluginConfig.class)
        public static class GuavaCache {
            /**
             * Operation represent a cache span is "write" or "read" action , and "op"(operation) is tagged with key "cache.op" usually
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constant` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/shardingsphere-plugins/sharding-sphere-4.0.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/shardingsphere/v40/Constant.java`
#### Snippet
```java
 * The type Constant.
 */
public final class Constant {
    
    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Trace` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/optional-plugins/trace-ignore-plugin/src/main/java/org/apache/skywalking/apm/plugin/trace/ignore/conf/IgnoreConfig.java`
#### Snippet
```java
public class IgnoreConfig {

    public static class Trace {
        /**
         * If the operation name of the first span is matching, this segment should be ignored /path/?   Match any
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Feign` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/feign-default-http-9.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/feign/http/v9/FeignPluginConfig.java`
#### Snippet
```java
    public static class Plugin {
        @PluginConfig(root = FeignPluginConfig.class)
        public static class Feign {
            /**
             * This config item controls that whether the Feign plugin should collect the http body of the request.
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `IgnoreConfigInitializer` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/optional-plugins/trace-ignore-plugin/src/main/java/org/apache/skywalking/apm/plugin/trace/ignore/conf/IgnoreConfigInitializer.java`
#### Snippet
```java
import org.apache.skywalking.apm.util.PropertyPlaceholderHelper;

public class IgnoreConfigInitializer {
    private static final ILog LOGGER = LogManager.getLogger(IgnoreConfigInitializer.class);
    private static final String CONFIG_FILE_NAME = "/config/apm-trace-ignore-plugin.config";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ClickHouseStatementTracingWrapper` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/clickhouse-0.3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/clickhouse/ClickHouseStatementTracingWrapper.java`
#### Snippet
```java
 *
 */
public class ClickHouseStatementTracingWrapper {

    public static <T> T of(ConnectionInfo connectionInfo, String methodName, String sql,
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Memcached` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/xmemcached-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/xmemcached/v2/MemcachedPluginConfig.java`
#### Snippet
```java
    public static class Plugin {
        @PluginConfig(root = MemcachedPluginConfig.class)
        public static class Memcached {
            /**
             * Operation represent a cache span is "write" or "read" action , and "op"(operation) is tagged with key "cache.op" usually
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `SkyWalkingAgent` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent/src/main/java/org/apache/skywalking/apm/agent/SkyWalkingAgent.java`
#### Snippet
```java
 * The main entrance of sky-walking agent, based on javaagent mechanism.
 */
public class SkyWalkingAgent {
    private static ILog LOGGER = LogManager.getLogger(SkyWalkingAgent.class);

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `MatchUtil` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/spring-plugins/core-patch/src/main/java/org/apache/skywalking/apm/plugin/spring/patch/MatchUtil.java`
#### Snippet
```java
import java.util.List;

public class MatchUtil {

    private static List<Method> METHODS = new ArrayList<Method>(2);
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `JsonRpcConstants` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/jsonrpc4j-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jsonrpc4j/JsonRpcConstants.java`
#### Snippet
```java
import org.apache.skywalking.apm.agent.core.context.tag.StringTag;

public class JsonRpcConstants {
    public static final StringTag JSON_RPC_METHOD_TAG = new StringTag(1, "jsonrpc.method");
}
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `SpringAnnotation` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/optional-plugins/optional-spring-plugins/spring-annotation-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/annotations/SpringAnnotationConfig.java`
#### Snippet
```java
    public static class Plugin {
        @PluginConfig(root = SpringAnnotationConfig.class)
        public static class SpringAnnotation {
            /**
             * regex expression to match spring bean classname
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `MeterCenter` has only 'static' members, and lacks a 'private' constructor
in `apm-application-toolkit/apm-toolkit-meter/src/main/java/org/apache/skywalking/apm/toolkit/meter/MeterCenter.java`
#### Snippet
```java
 * don't support this.
 */
public class MeterCenter {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Customize` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/conf/CustomizePluginConfig.java`
#### Snippet
```java
    public static class Plugin {
        @PluginConfig(root = CustomizePluginConfig.class)
        public static class Customize {
            /**
             * Custom enhancement class configuration file path, recommended to use an absolute path.
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `CustomizeUtil` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/util/CustomizeUtil.java`
#### Snippet
```java
import java.util.Map;

public class CustomizeUtil {

    private static final Map<String, Class> JAVA_CLASS = new HashMap<String, Class>();
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/constants/Constants.java`
#### Snippet
```java
 */

public class Constants {

    public static final String OPERATION_NAME_SEPARATOR = "/";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `MeterFactory` has only 'static' members, and lacks a 'private' constructor
in `apm-application-toolkit/apm-toolkit-meter/src/main/java/org/apache/skywalking/apm/toolkit/meter/MeterFactory.java`
#### Snippet
```java
import java.util.function.Supplier;

public class MeterFactory {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `JdkThreading` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/bootstrap-plugins/jdk-threading-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdk/threading/JDKThreadingPluginConfig.java`
#### Snippet
```java
    public static class Plugin {
        @PluginConfig(root = JDKThreadingPluginConfig.class)
        public static class JdkThreading {

            /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ThreadingConfig` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/bootstrap-plugins/jdk-threading-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdk/threading/ThreadingConfig.java`
#### Snippet
```java
import static org.apache.skywalking.apm.agent.core.plugin.match.PrefixMatch.nameStartsWith;

public class ThreadingConfig {
    private static final ILog LOGGER = LogManager.getLogger(ThreadingConfig.class);

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/Constants.java`
#### Snippet
```java
package org.apache.skywalking.apm.plugin.finagle;

public class Constants {

    public static final String PENDING_OP_NAME = "pending";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `FinagleCtxs` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/FinagleCtxs.java`
#### Snippet
```java
import java.lang.reflect.Constructor;

class FinagleCtxs {

    static LocalContext.Key<AbstractSpan> SW_SPAN = null;
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `MethodConfiguration` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/conf/MethodConfiguration.java`
#### Snippet
```java
 */

public class MethodConfiguration {

    static String getMethod(Map<String, Object> configuration) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ContextCarrierHelper` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/ContextCarrierHelper.java`
#### Snippet
```java
import static org.apache.skywalking.apm.plugin.finagle.FinagleCtxs.getSWContextCarrier;

class ContextCarrierHelper {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Http` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/tomcat-7.x-8.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/tomcat78x/TomcatPluginConfig.java`
#### Snippet
```java

        @PluginConfig(root = TomcatPluginConfig.class)
        public static class Http {
            /**
             * When either {@link Tomcat#COLLECT_HTTP_PARAMS} is enabled, how many characters to keep and send to the
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Tomcat` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/tomcat-7.x-8.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/tomcat78x/TomcatPluginConfig.java`
#### Snippet
```java
    public static class Plugin {
        @PluginConfig(root = TomcatPluginConfig.class)
        public static class Tomcat {
            /**
             * This config item controls that whether the Tomcat plugin should collect the parameters of the request.
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/tomcat-7.x-8.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/tomcat78x/Constants.java`
#### Snippet
```java
package org.apache.skywalking.apm.plugin.tomcat78x;

public class Constants {
    public static final String FORWARD_REQUEST_FLAG = "SW_FORWARD_REQUEST_FLAG";
}
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/mysql-6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/mysql/v6/define/Constants.java`
#### Snippet
```java
package org.apache.skywalking.apm.plugin.jdbc.mysql.v6.define;

public class Constants {
    public static final String WITNESS_MYSQL_6X_CLASS = "com.mysql.cj.api.MysqlConnection";
}
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ContextHolderFactory` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/ContextHolderFactory.java`
#### Snippet
```java
 * {@link ContextHolder#remove(Object)}.
 */
class ContextHolderFactory {

    /*
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `CodecUtils` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/CodecUtils.java`
#### Snippet
```java
import static org.apache.skywalking.apm.plugin.finagle.Constants.EMPTY_SWCONTEXTCARRIER;

public class CodecUtils {

    static ILog LOGGER = LogManager.getLogger(CodecUtils.class);
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Variables` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/postgresql-8.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/postgresql/Variables.java`
#### Snippet
```java
package org.apache.skywalking.apm.plugin.jdbc.postgresql;

public final class Variables {
    public static final String PG_PREPARED_STATEMENT_EXECUTE_METHOD_INTERCEPTOR = "org.apache.skywalking.apm.plugin.jdbc.postgresql.PreparedStatementExecuteMethodsInterceptor";

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/postgresql-8.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/postgresql/define/Constants.java`
#### Snippet
```java
 * Interceptor class name constant variable
 */
public class Constants {
    public static final String CREATE_STATEMENT_INTERCEPTOR_CLASS = "org.apache.skywalking.apm.plugin.jdbc.postgresql.CreateStatementInterceptor";
    public static final String CREATE_PREPARED_STATEMENT_INTERCEPTOR_CLASS = "org.apache.skywalking.apm.plugin.jdbc.postgresql.CreatePreparedStatementInterceptor";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/elasticsearch-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v5/Constants.java`
#### Snippet
```java
import org.apache.skywalking.apm.agent.core.context.tag.Tags;

public class Constants {

    public static final String INET_SOCKET_TRANSPORT_ADDRESS_WITNESS_CLASS = "org.elasticsearch.common.transport.InetSocketTransportAddress";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Elasticsearch` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/elasticsearch-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v5/ElasticsearchPluginConfig.java`
#### Snippet
```java
    public static class Plugin {
        @PluginConfig(root = ElasticsearchPluginConfig.class)
        public static class Elasticsearch {
            /**
             * If true, trace all the DSL(Domain Specific Language) in ElasticSearch access, default is false.
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Util` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/elasticsearch-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v5/Util.java`
#### Snippet
```java
import static org.apache.skywalking.apm.util.StringUtil.isEmpty;

class Util {

    static String wrapperNullStringValue(String value) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `SolrJ` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/solrj-7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/solrj/SolrJPluginConfig.java`
#### Snippet
```java
    public static class Plugin {
        @PluginConfig(root = SolrJPluginConfig.class)
        public static class SolrJ {
            /**
             * If true, trace all the query parameters(include deleteByIds and deleteByQuery) in Solr query request,
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `SolrjTags` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/solrj-7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/solrj/commons/SolrjTags.java`
#### Snippet
```java
import org.apache.skywalking.apm.agent.core.context.tag.StringTag;

public class SolrjTags {
    public static StringTag TAG_QT = new StringTag("qt");
    public static StringTag TAG_COLLECTION = new StringTag("collection");
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ProcessorUtil` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/os/ProcessorUtil.java`
#### Snippet
```java
import java.lang.management.ManagementFactory;

public class ProcessorUtil {
    public static int getNumberOfProcessors() {
        return ManagementFactory.getOperatingSystemMXBean().getAvailableProcessors();
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `OSUtil` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/os/OSUtil.java`
#### Snippet
```java
import org.apache.skywalking.apm.network.common.v3.KeyStringValuePair;

public class OSUtil {
    private static volatile String OS_NAME;
    private static volatile String HOST_NAME;
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `LoadedLibraryCollector` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/jvm/LoadedLibraryCollector.java`
#### Snippet
```java
import org.apache.skywalking.apm.network.common.v3.KeyStringValuePair;

public class LoadedLibraryCollector {

    private static final ILog LOGGER = LogManager.getLogger(LoadedLibraryCollector.class);
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `AgentPackagePath` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/boot/AgentPackagePath.java`
#### Snippet
```java
 * mechanism fails, the agent will exit directly.
 */
public class AgentPackagePath {
    private static final ILog LOGGER = LogManager.getLogger(AgentPackagePath.class);

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `RuntimeContextConfiguration` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/conf/RuntimeContextConfiguration.java`
#### Snippet
```java
package org.apache.skywalking.apm.agent.core.conf;

public class RuntimeContextConfiguration {

    public static String[] NEED_PROPAGATE_CONTEXT_KEY = new String[] {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/conf/Constants.java`
#### Snippet
```java
package org.apache.skywalking.apm.agent.core.conf;

public class Constants {
    public static String PATH_SEPARATOR = System.getProperty("file.separator", "/");

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `MethodUtil` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/util/MethodUtil.java`
#### Snippet
```java
 */

public class MethodUtil {

    public static String generateOperationName(Method method) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `IOUtils` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/util/IOUtils.java`
#### Snippet
```java
 * @version $Id: IOUtils.java 1304177 2012-03-23 03:36:44Z ggregory $
 */
public class IOUtils {

    private static final int EOF = -1;
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `InstanceJsonPropertiesUtil` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/util/InstanceJsonPropertiesUtil.java`
#### Snippet
```java
import org.apache.skywalking.apm.util.StringUtil;

public class InstanceJsonPropertiesUtil {
    private static final Gson GSON = new Gson();

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `FileUtils` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/util/FileUtils.java`
#### Snippet
```java
import java.nio.file.Files;

public class FileUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `StatusCheck` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/conf/Config.java`
#### Snippet
```java
    }

    public static class StatusCheck {
        /**
         * Listed exceptions would not be treated as an error. Because in some codes, the exception is being used as a
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Agent` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/conf/Config.java`
#### Snippet
```java
public class Config {

    public static class Agent {
        /**
         * Namespace represents a subnet, such as kubernetes namespace, or 172.10.*.*.
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Logging` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/conf/Config.java`
#### Snippet
```java
    }

    public static class Logging {
        /**
         * Log file name.
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `OsInfo` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/conf/Config.java`
#### Snippet
```java
    }

    public static class OsInfo {
        /**
         * Limit the length of the ipv4 list size.
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Jvm` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/conf/Config.java`
#### Snippet
```java
    }

    public static class Jvm {
        /**
         * The buffer size of collected JVM info.
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Correlation` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/conf/Config.java`
#### Snippet
```java
    }

    public static class Correlation {
        /**
         * Max element count in the correlation context.
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Log` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/conf/Config.java`
#### Snippet
```java
    }

    public static class Log {
        /**
         * The max size of message to send to server.Default is 10 MB.
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Meter` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/conf/Config.java`
#### Snippet
```java
    }

    public static class Meter {
        /**
         * If true, skywalking agent will enable sending meters. Otherwise disable meter report.
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Profile` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/conf/Config.java`
#### Snippet
```java
    }

    public static class Profile {
        /**
         * If true, skywalking agent will enable profile when user create a new profile task. Otherwise disable
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Collector` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/conf/Config.java`
#### Snippet
```java
    }

    public static class Collector {
        /**
         * grpc channel status check interval
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Buffer` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/conf/Config.java`
#### Snippet
```java
    }

    public static class Buffer {
        public static int CHANNEL_SIZE = 5;

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Plugin` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/conf/Config.java`
#### Snippet
```java
    }

    public static class Plugin {
        /**
         * Control the length of the peer field.
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `PrivateKeyUtil` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/util/PrivateKeyUtil.java`
#### Snippet
```java
 * Util intends to parse PKCS#1 and PKCS#8 at same time.
 */
public class PrivateKeyUtil {
    private static final String PKCS_1_PEM_HEADER = "-----BEGIN RSA PRIVATE KEY-----";
    private static final String PKCS_1_PEM_FOOTER = "-----END RSA PRIVATE KEY-----";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `CustomizeExpression` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/util/CustomizeExpression.java`
#### Snippet
```java
 */

public class CustomizeExpression {

    private static final ILog LOGGER = LogManager.getLogger(CustomizeExpression.class);
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `SnifferConfigInitializer` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/conf/SnifferConfigInitializer.java`
#### Snippet
```java
 * The <code>SnifferConfigInitializer</code> initializes all configs in several way.
 */
public class SnifferConfigInitializer {
    private static ILog LOGGER = LogManager.getLogger(SnifferConfigInitializer.class);
    private static final String SPECIFIED_CONFIG_PATH = "skywalking_config";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `MeterFactory` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/meter/MeterFactory.java`
#### Snippet
```java
 * through the MeterFactory.
 */
public class MeterFactory {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `CollectionUtil` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/util/CollectionUtil.java`
#### Snippet
```java
 * @since 7.0.0
 */
public final class CollectionUtil {
    public static String toString(final Map<String, String[]> map) {
        return map.entrySet()
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ByteBuddyCoreClasses` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/ByteBuddyCoreClasses.java`
#### Snippet
```java
 * All ByteBuddy core classes required to expose, including open edge for JDK 9+ module, or Bootstrap instrumentation.
 */
public class ByteBuddyCoreClasses {
    private static final String SHADE_PACKAGE = "org.apache.skywalking.apm.dependencies.";

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `LogicalMatchOperation` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/match/logical/LogicalMatchOperation.java`
#### Snippet
```java
 * Util class to help to construct logical operations on {@link org.apache.skywalking.apm.agent.core.plugin.match.ClassMatch}s
 */
public class LogicalMatchOperation {
    public static IndirectMatch and(final IndirectMatch... matches) {
        return new LogicalAndMatch(matches);
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `InterceptorInstanceLoader` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/loader/InterceptorInstanceLoader.java`
#### Snippet
```java
 * <p>
 */
public class InterceptorInstanceLoader {

    private static ConcurrentHashMap<String, Object> INSTANCE_CACHE = new ConcurrentHashMap<String, Object>();
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ConstructorInterTemplate` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/bootstrap/template/ConstructorInterTemplate.java`
#### Snippet
```java
 * This class wouldn't be loaded in real env. This is a class template for dynamic class generation.
 */
public class ConstructorInterTemplate {
    /**
     * This field is never set in the template, but has value in the runtime.
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `InstanceMethodInterWithOverrideArgsTemplate` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/bootstrap/template/InstanceMethodInterWithOverrideArgsTemplate.java`
#### Snippet
```java
 * This class wouldn't be loaded in real env. This is a class template for dynamic class generation.
 */
public class InstanceMethodInterWithOverrideArgsTemplate {
    /**
     * This field is never set in the template, but has value in the runtime.
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `InstanceMethodInterTemplate` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/bootstrap/template/InstanceMethodInterTemplate.java`
#### Snippet
```java
 * This class wouldn't be loaded in real env. This is a class template for dynamic class generation.
 */
public class InstanceMethodInterTemplate {
    /**
     * This field is never set in the template, but has value in the runtime.
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `StaticMethodInterV2Template` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/bootstrap/template/v2/StaticMethodInterV2Template.java`
#### Snippet
```java
 * This class wouldn't be loaded in real env. This is a class template for dynamic class generation.
 */
public class StaticMethodInterV2Template {
    /**
     * This field is never set in the template, but has value in the runtime.
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `StaticMethodInterWithOverrideArgsTemplate` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/bootstrap/template/StaticMethodInterWithOverrideArgsTemplate.java`
#### Snippet
```java
 * This class wouldn't be loaded in real env. This is a class template for dynamic class generation.
 */
public class StaticMethodInterWithOverrideArgsTemplate {
    /**
     * This field is never set in the template, but has value in the runtime.
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `StaticMethodInterTemplate` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/bootstrap/template/StaticMethodInterTemplate.java`
#### Snippet
```java
 * This class wouldn't be loaded in real env. This is a class template for dynamic class generation.
 */
public class StaticMethodInterTemplate {
    /**
     * This field is never set in the template, but has value in the runtime.
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `StaticMethodInterV2WithOverrideArgsTemplate` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/bootstrap/template/v2/StaticMethodInterV2WithOverrideArgsTemplate.java`
#### Snippet
```java
 * This class wouldn't be loaded in real env. This is a class template for dynamic class generation.
 */
public class StaticMethodInterV2WithOverrideArgsTemplate {
    /**
     * This field is never set in the template, but has value in the runtime.
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ArrayTypeNameChecker` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/bytebuddy/ArrayTypeNameChecker.java`
#### Snippet
```java
package org.apache.skywalking.apm.agent.core.plugin.bytebuddy;

public class ArrayTypeNameChecker {

    public static void check(String typeName) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `InstanceMethodInterV2Template` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/bootstrap/template/v2/InstanceMethodInterV2Template.java`
#### Snippet
```java
 * This class wouldn't be loaded in real env. This is a class template for dynamic class generation.
 */
public class InstanceMethodInterV2Template {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `InstanceMethodInterV2WithOverrideArgsTemplate` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/bootstrap/template/v2/InstanceMethodInterV2WithOverrideArgsTemplate.java`
#### Snippet
```java
 * This class wouldn't be loaded in real env. This is a class template for dynamic class generation.
 */
public class InstanceMethodInterV2WithOverrideArgsTemplate {
    /**
     * This field is never set in the template, but has value in the runtime.
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `JDK9ModuleExporter` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/jdk9module/JDK9ModuleExporter.java`
#### Snippet
```java
 * Since JDK 9, module concept has been introduced. By supporting that, agent core needs to open the read edge
 */
public class JDK9ModuleExporter {
    private static final ILog LOGGER = LogManager.getLogger(JDK9ModuleExporter.class);

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `BootstrapInterRuntimeAssist` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/BootstrapInterRuntimeAssist.java`
#### Snippet
```java
 * This assist help all bootstrap class core interceptor.
 */
public class BootstrapInterRuntimeAssist {
    private static final String AGENT_CLASSLOADER_DEFAULT = "org.apache.skywalking.apm.agent.core.plugin.loader.AgentClassLoader";
    private static final String DEFAULT_AGENT_CLASSLOADER_INSTANCE = "DEFAULT_LOADER";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `BootstrapInstrumentBoost` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/bootstrap/BootstrapInstrumentBoost.java`
#### Snippet
```java
 * classes into bootstrap class loader, including generated dynamic delegate classes.
 */
public class BootstrapInstrumentBoost {
    private static final ILog LOGGER = LogManager.getLogger(BootstrapInstrumentBoost.class);

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ListenerManager` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/IgnoredTracerContext.java`
#### Snippet
```java
    }

    public static class ListenerManager {
        private static List<IgnoreTracerContextListener> LISTENERS = new LinkedList<>();

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `HTTP` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/tag/Tags.java`
#### Snippet
```java
    public static final StringTag RPC_RESPONSE_STATUS_CODE = new StringTag(18, "rpc.status_code", true);

    public static final class HTTP {
        public static final StringTag METHOD = new StringTag(10, "http.method");

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `PeerFormat` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/util/PeerFormat.java`
#### Snippet
```java
import org.apache.skywalking.apm.util.StringUtil;

public class PeerFormat {

    private static final String ABBR = "...";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `WriterFactory` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/WriterFactory.java`
#### Snippet
```java
import org.apache.skywalking.apm.util.StringUtil;

public class WriterFactory {

    private static IWriter WRITER;
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `LogManager` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/api/LogManager.java`
#### Snippet
```java
 * <p> Created by xin on 2016/11/10.
 */
public class LogManager {
    private static LogResolver RESOLVER = new PatternLogResolver();

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ListenerManager` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/TracingContext.java`
#### Snippet
```java
     * when the <code>TracingContext</code> finished, and {@link #segment} is ready for further process.
     */
    public static class ListenerManager {
        private static List<TracingContextListener> LISTENERS = new LinkedList<>();

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `TracingThreadListenerManager` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/TracingContext.java`
#### Snippet
```java
     * The <code>ListenerManager</code> represents an event notify for every registered listener, which are notified
     */
    public static class TracingThreadListenerManager {
        private static List<TracingThreadListener> LISTENERS = new LinkedList<>();

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Http` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/httpclient-commons/src/main/java/org/apache/skywalking/apm/plugin/httpclient/HttpClientPluginConfig.java`
#### Snippet
```java

        @PluginConfig(root = HttpClientPluginConfig.class)
        public static class Http {
            /**
             * When either {@link HttpClient#COLLECT_HTTP_PARAMS} is enabled, how many characters to keep and send to the
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `HttpClient` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/httpclient-commons/src/main/java/org/apache/skywalking/apm/plugin/httpclient/HttpClientPluginConfig.java`
#### Snippet
```java
    public static class Plugin {
        @PluginConfig(root = HttpClientPluginConfig.class)
        public static class HttpClient {
            /**
             * This config item controls that whether the HttpClient plugin should collect the parameters of the request.
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constant` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/shardingsphere-plugins/sharding-sphere-4.1.0-plugin/src/main/java/org/apache/skywalking/apm/plugin/shardingsphere/v41/Constant.java`
#### Snippet
```java
 * The type Constant.
 */
public final class Constant {
    
    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Toolkit` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/ToolkitPluginConfig.java`
#### Snippet
```java
    public static class Plugin {
        @PluginConfig(root = ToolkitPluginConfig.class)
        public static class Toolkit {
            /**
             * If true, the fully qualified method name will be used as the operation name instead of the given
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `TagUtil` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/util/TagUtil.java`
#### Snippet
```java
import org.apache.skywalking.apm.toolkit.trace.Tag;

public class TagUtil {
    public static void tagSpan(final AbstractSpan span, final Map<String, Object> context,
                                     final Tag tag) {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Lettuce` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/lettuce-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/lettuce/v5/LettucePluginConfig.java`
#### Snippet
```java
    public static class Plugin {
        @PluginConfig(root = LettucePluginConfig.class)
        public static class Lettuce {
            /**
             * If set to true, the parameters of the Redis command would be collected.
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Light4J` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/light4j-plugins/light4j-plugin/src/main/java/org/apache/skywalking/apm/plugin/light4j/Light4JPluginConfig.java`
#### Snippet
```java
    public static class Plugin {
        @PluginConfig(root = Light4JPluginConfig.class)
        public static class Light4J {
            /**
             * If true, trace all middleware/business handlers that are part of the Light4J handler chain for a request,
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Jedis` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/apm-sdk-plugin/jedis-plugins/jedis-2.x-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jedis/v3/JedisPluginConfig.java`
#### Snippet
```java
    public static class Plugin {
        @PluginConfig(root = JedisPluginConfig.class)
        public static class Jedis {
            /**
             * If set to true, the parameters of the Redis command would be collected.
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/optional-plugins/mybatis-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/mybatis/Constants.java`
#### Snippet
```java
package org.apache.skywalking.apm.plugin.mybatis;

public class Constants {
    public static final String MYBATIS_SHELL_METHOD_NAME = "mybatis_shell_method_name";

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Ehcache` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/optional-plugins/ehcache-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/ehcache/v2/EhcachePluginConfig.java`
#### Snippet
```java
    public static class Plugin {
        @PluginConfig(root = EhcachePluginConfig.class)
        public static class Ehcache {
            /**
             * Operation represent a cache span is "write" or "read" action , and "op"(operation) is tagged with key "cache.op" usually
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `EncacheOperationConvertor` has only 'static' members, and lacks a 'private' constructor
in `apm-sniffer/optional-plugins/ehcache-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/ehcache/v2/EncacheOperationConvertor.java`
#### Snippet
```java
import java.util.Optional;

public class EncacheOperationConvertor {

    public static Optional<String> parseOperation(String cmd) {
```

## RuleId[ruleID=DataFlowIssue]
### RuleId[ruleID=DataFlowIssue]
Method invocation `setSkyWalkingDynamicField` may produce `NullPointerException`
in `apm-sniffer/optional-plugins/optional-spring-plugins/spring-webflux-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/webflux/v5/DispatcherHandlerHandleMethodInterceptor.java`
#### Snippet
```java
        Tags.URL.set(span, exchange.getRequest().getURI().toString());
        HTTP.METHOD.set(span, exchange.getRequest().getMethodValue());
        instance.setSkyWalkingDynamicField(ContextManager.capture());
        span.prepareForAsync();
        ContextManager.stopSpan(span);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `parse` may produce `NullPointerException`
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/connectionurl/parser/URLParser.java`
#### Snippet
```java
            parser = new ImpalaJdbcURLParser(url);
        }
        return parser.parse();
    }
}
```

### RuleId[ruleID=DataFlowIssue]
Casting `processor` to `TBaseProcessor` will produce `ClassCastException` for any non-null value
in `apm-sniffer/apm-sdk-plugin/thrift-plugin/src/main/java/org/apache/skywalking/apm/plugin/thrift/TMultiplexedProcessorRegisterDefaultInterceptor.java`
#### Snippet
```java
            hashMap.putAll(processMapView);
        } else if (processor instanceof TBaseAsyncProcessor) {
            Map<String, ProcessFunction> processMapView = ((TBaseProcessor) processor).getProcessMapView();
            hashMap.putAll(processMapView);
        } else {
```

### RuleId[ruleID=DataFlowIssue]
Argument `activeSpan` might be null
in `apm-sniffer/apm-sdk-plugin/activemq-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/activemq/ActiveMQProducerInterceptor.java`
#### Snippet
```java
        }
        contextCarrier.extensionInjector().injectSendingTimestamp();
        SpanLayer.asMQ(activeSpan);
        activeSpan.setComponent(ComponentsDefine.ACTIVEMQ_PRODUCER);
        CarrierItem next = contextCarrier.items();
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getRequest` may produce `NullPointerException`
in `apm-sniffer/apm-sdk-plugin/spring-plugins/mvc-annotation-commons/src/main/java/org/apache/skywalking/apm/plugin/spring/mvc/commons/interceptor/GetBeanInterceptor.java`
#### Snippet
```java
            ContextManager.getRuntimeContext()
                          .put(REQUEST_KEY_IN_RUNTIME_CONTEXT, ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                              .getRequest());
        }
        return ret;
```

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `apm-sniffer/apm-sdk-plugin/spring-plugins/mvc-annotation-commons/src/main/java/org/apache/skywalking/apm/plugin/spring/mvc/commons/interceptor/AbstractMethodInterceptor.java`
#### Snippet
```java

        if (method.getParameterTypes().length > 0) {
            operationName = operationName.deleteCharAt(operationName.length() - 1);
        }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `toString` may produce `NullPointerException`
in `apm-sniffer/apm-test-tools/src/main/java/org/apache/skywalking/apm/agent/test/tools/SegmentRefAssert.java`
#### Snippet
```java
public class SegmentRefAssert {
    public static void assertSegmentId(TraceSegmentRef ref, String segmentId) {
        assertThat(SegmentRefHelper.getTraceSegmentId(ref).toString(), is(segmentId));
    }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getStatus` will produce `NullPointerException`
in `apm-sniffer/apm-sdk-plugin/nutz-plugins/http-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/nutz/http/sync/SenderSendInterceptor.java`
#### Snippet
```java

        if (response == null) {
            Tags.HTTP_RESPONSE_STATUS_CODE.set(span, response.getStatus());
            if (response.getStatus() >= 400) {
                span.errorOccurred();
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `setContextCarrier` may produce `NullPointerException`
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/ContextCarrierHelper.java`
#### Snippet
```java
            SWContextCarrier swContextCarrier = getSWContextCarrier();
            // we can ensure swContextCarrier is not null here
            swContextCarrier.setContextCarrier(contextCarrier);
            swContextCarrier.setOperationName(operationName);
        }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `prepareForAsync` may produce `NullPointerException`
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/ClientTracingFilterInterceptor.java`
#### Snippet
```java
            ContextManager.stopSpan(finagleSpan);
        } else {
            finagleSpan.prepareForAsync();
            ContextManager.stopSpan(finagleSpan);

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `prepareForAsync` may produce `NullPointerException`
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/ServerTracingFilterInterceptor.java`
#### Snippet
```java
            ContextManager.stopSpan(finagleSpan);
        } else {
            finagleSpan.prepareForAsync();
            ContextManager.stopSpan(finagleSpan);
            ((Future<?>) ret).addEventListener(new FutureEventListener<Object>() {
```

### RuleId[ruleID=DataFlowIssue]
Immutable object is modified
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/interceptor/BaseInterceptorMethods.java`
#### Snippet
```java
            tagSpanLogs(localSpan, spanLogs);

            spanTags.clear();
            spanLogs.clear();

```

### RuleId[ruleID=DataFlowIssue]
Immutable object is modified
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/interceptor/BaseInterceptorMethods.java`
#### Snippet
```java

            spanTags.clear();
            spanLogs.clear();

            SpanDataHolder spanDataHolder = new SpanDataHolder(
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `exists` may produce `NullPointerException`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/boot/AgentPackagePath.java`
#### Snippet
```java
                    LOGGER.error(e, "Can not locate agent jar file by url:" + urlString);
                }
                if (agentJarFile.exists()) {
                    return agentJarFile.getParentFile();
                }
```

### RuleId[ruleID=DataFlowIssue]
Argument `junction` might be null
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/match/MethodAnnotationMatch.java`
#### Snippet
```java
            }
        }
        junction = declaresMethod(junction).and(ElementMatchers.not(isInterface()));
        return junction;
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `and` may produce `NullPointerException`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/match/ClassAnnotationMatch.java`
#### Snippet
```java
            }
        }
        junction = junction.and(not(isInterface()));
        return junction;
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `and` may produce `NullPointerException`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/match/HierarchyMatch.java`
#### Snippet
```java
            }
        }
        junction = junction.and(not(isInterface()));
        return junction;
    }
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `jarFileNames` may produce `NullPointerException`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/loader/AgentClassLoader.java`
#### Snippet
```java
            if (path.exists() && path.isDirectory()) {
                String[] jarFileNames = path.list((dir, name) -> name.endsWith(".jar"));
                for (String fileName : jarFileNames) {
                    try {
                        File file = new File(path, fileName);
```

### RuleId[ruleID=DataFlowIssue]
Argument `previousValue` might be null
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/CorrelationContext.java`
#### Snippet
```java
        if (data.containsKey(key)) {
            final String previousValue = data.put(key, value);
            return Optional.of(previousValue);
        }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/CorrelationContextGetInterceptor.java`
#### Snippet
```java
    public void beforeMethod(Class clazz, Method method, Object[] allArguments, Class<?>[] parameterTypes, MethodInterceptResult result) {
        final String key = (String) allArguments[0];
        final Optional<String> data = ContextManager.getCorrelationContext().get(key);

        result.defineReturnValue(data);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `put` may produce `NullPointerException`
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/CorrelationContextPutInterceptor.java`
#### Snippet
```java
        final String key = (String) allArguments[0];
        final String value = (String) allArguments[1];
        final Optional<String> previous = ContextManager.getCorrelationContext().put(key, value);

        result.defineReturnValue(previous);
```

## RuleId[ruleID=SimplifyStreamApiCallChains]
### RuleId[ruleID=SimplifyStreamApiCallChains]
Can be replaced with 'Collectors.joining'
in `apm-sniffer/apm-sdk-plugin/elasticsearch-6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v6/TransportAddressCache.java`
#### Snippet
```java
                , transportAddresses.stream()
                        .map(x -> String.format("%s:%s", x.getAddress(), x.getPort()))
                        .collect(Collectors.toList())
        );
    }
```

### RuleId[ruleID=SimplifyStreamApiCallChains]
Can be replaced with 'String.join'
in `apm-sniffer/apm-sdk-plugin/elasticsearch-6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v6/interceptor/RestHighLevelClientClearScrollMethodsInterceptor.java`
#### Snippet
```java
        Tags.DB_TYPE.set(span, DB_TYPE);
        if (TRACE_DSL) {
            Tags.DB_STATEMENT.set(span, searchScrollRequest.scrollIds().stream().collect(Collectors.joining(",")));
        }

```

## RuleId[ruleID=StringOperationCanBeSimplified]
### RuleId[ruleID=StringOperationCanBeSimplified]
`toLowerCase()` call can be replaced with 'equalsIgnoreCase()'
in `apm-sniffer/apm-sdk-plugin/httpclient-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/httpclient/v5/HttpClientDoExecuteInterceptor.java`
#### Snippet
```java
    private int port(HttpHost httpHost) {
        int port = httpHost.getPort();
        return port > 0 ? port : "https".equals(httpHost.getSchemeName().toLowerCase()) ? 443 : 80;
    }
}
```

### RuleId[ruleID=StringOperationCanBeSimplified]
Call to `toString()` is redundant
in `apm-sniffer/apm-test-tools/src/main/java/org/apache/skywalking/apm/agent/test/tools/SegmentRefAssert.java`
#### Snippet
```java
public class SegmentRefAssert {
    public static void assertSegmentId(TraceSegmentRef ref, String segmentId) {
        assertThat(SegmentRefHelper.getTraceSegmentId(ref).toString(), is(segmentId));
    }

```

### RuleId[ruleID=StringOperationCanBeSimplified]
`toLowerCase()` call can be replaced with 'equalsIgnoreCase()'
in `apm-sniffer/apm-sdk-plugin/httpClient-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/httpClient/v4/HttpClientExecuteInterceptor.java`
#### Snippet
```java
    private int port(HttpHost httpHost) {
        int port = httpHost.getPort();
        return port > 0 ? port : "https".equals(httpHost.getSchemeName().toLowerCase()) ? 443 : 80;
    }

```

## RuleId[ruleID=Convert2MethodRef]
### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `apm-application-toolkit/apm-toolkit-micrometer-registry/src/main/java/org/apache/skywalking/apm/meter/micrometer/SkywalkingTimer.java`
#### Snippet
```java
        this.maxAdder = new DoubleAccumulator((a, b) -> a > b ? a : b, 0.000);
        this.max = MeterFactory.gauge(meterId.copyTo(baseName + "_max", MeterId.MeterType.GAUGE),
            () -> maxAdder.doubleValue()).build();

        this.histogram = MeterBuilder.buildHistogram(meterId, supportsAggregablePercentiles, distributionStatisticConfig, true);
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `apm-application-toolkit/apm-toolkit-micrometer-registry/src/main/java/org/apache/skywalking/apm/meter/micrometer/SkywalkingDistributionSummary.java`
#### Snippet
```java
        this.maxAdder = new DoubleAccumulator((a, b) -> a > b ? a : b, 0.000);
        this.max = MeterFactory.gauge(meterId.copyTo(baseName + "_max", MeterId.MeterType.GAUGE),
            () -> maxAdder.doubleValue()).build();

        this.histogram = MeterBuilder.buildHistogram(meterId, supportsAggregablePercentiles, distributionStatisticConfig, false);
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `apm-application-toolkit/apm-toolkit-micrometer-registry/src/main/java/org/apache/skywalking/apm/meter/micrometer/SkywalkingMeterRegistry.java`
#### Snippet
```java

        MeterFactory.gauge(
            meterId.copyTo(baseName + "_count", MeterId.MeterType.GAUGE), () -> ft.count()).build();
        MeterFactory.gauge(
            meterId.copyTo(baseName + "_sum", MeterId.MeterType.GAUGE), () -> ft.totalTime(TimeUnit.MILLISECONDS)).build();
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `apm-application-toolkit/apm-toolkit-micrometer-registry/src/main/java/org/apache/skywalking/apm/meter/micrometer/SkywalkingMeterRegistry.java`
#### Snippet
```java
                new SkywalkingCustomCounter.Builder(meterId.copyTo(meterName, MeterId.MeterType.COUNTER), m, config).build();
            } else {
                MeterFactory.gauge(meterId.copyTo(meterName, MeterId.MeterType.GAUGE), () -> m.getValue()).build();
            }
        });
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/meter/MeterSender.java`
#### Snippet
```java

                final StreamObserver<MeterData> reporter = reportStreamObserver;
                transform(meterMap, meterData -> reporter.onNext(meterData));
            } catch (Throwable e) {
                if (!(e instanceof StatusRuntimeException)) {
```

## RuleId[ruleID=UnnecessaryCallToStringValueOf]
### RuleId[ruleID=UnnecessaryCallToStringValueOf]
Unnecessary `String.valueOf()` call
in `apm-sniffer/apm-sdk-plugin/elasticsearch-6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v6/RemotePeerCache.java`
#### Snippet
```java

    public void addRemotePeer(String host, int port) {
        String hostPort = host + ":" + String.valueOf(port);

        if (remotePeers.isEmpty()) {
```

### RuleId[ruleID=UnnecessaryCallToStringValueOf]
Unnecessary `String.valueOf()` call
in `apm-sniffer/optional-plugins/fastjson-1.2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/fastjson/ToJsonInterceptor.java`
#### Snippet
```java
        }
        if (ret != null) {
            ContextManager.activeSpan().tag(Tags.ofKey(SPAN_TAG_KEY_OBJECT), String.valueOf(ret.getClass().getTypeName()));
        }
        ContextManager.stopSpan();
```

## RuleId[ruleID=AbstractMethodCallInConstructor]
### RuleId[ruleID=AbstractMethodCallInConstructor]
Call to 'abstract' method `getType()` during object construction
in `apm-application-toolkit/apm-toolkit-meter/src/main/java/org/apache/skywalking/apm/toolkit/meter/BaseBuilder.java`
#### Snippet
```java
            throw new IllegalArgumentException("Meter name cannot be null");
        }
        this.meterId = new MeterId(name, getType());
    }

```

### RuleId[ruleID=AbstractMethodCallInConstructor]
Call to 'abstract' method `getType()` during object construction
in `apm-application-toolkit/apm-toolkit-meter/src/main/java/org/apache/skywalking/apm/toolkit/meter/BaseBuilder.java`
#### Snippet
```java
            throw new IllegalArgumentException("Meter id cannot be null");
        }
        if (!Objects.equals(meterId.getType(), getType())) {
            throw new IllegalArgumentException("Meter id type is not matches");
        }
```

### RuleId[ruleID=AbstractMethodCallInConstructor]
Call to 'abstract' method `getType()` during object construction
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/meter/AbstractBuilder.java`
#### Snippet
```java
            throw new IllegalArgumentException("Meter name cannot be null");
        }
        this.meterId = new MeterId(name, getType(), new ArrayList<>());
    }

```

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'contextSnapshot' in a Serializable class
in `apm-sniffer/apm-test-tools/src/main/java/org/apache/skywalking/apm/agent/core/context/MockContextSnapshot.java`
#### Snippet
```java
    INSTANCE;

    private ContextSnapshot contextSnapshot;

    MockContextSnapshot() {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'pluginSelector' in a Serializable class
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/PluginCfg.java`
#### Snippet
```java

    private List<PluginDefine> pluginClassList = new ArrayList<PluginDefine>();
    private PluginSelector pluginSelector = new PluginSelector();

    void load(InputStream input) throws IOException {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'correlationContext' in a Serializable class
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/ContextCarrier.java`
#### Snippet
```java
     */
    @Getter(AccessLevel.PACKAGE)
    private CorrelationContext correlationContext = new CorrelationContext();

    /**
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'extensionContext' in a Serializable class
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/ContextCarrier.java`
#### Snippet
```java
     */
    @Getter(AccessLevel.PACKAGE)
    private ExtensionContext extensionContext = new ExtensionContext();
    /**
     * User's custom context container. The context propagates with the main tracing context.
```

## RuleId[ruleID=RedundantCollectionOperation]
### RuleId[ruleID=RedundantCollectionOperation]
Unnecessary 'containsKey()' check
in `apm-sniffer/apm-sdk-plugin/dubbo-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo3/DubboInterceptor.java`
#### Snippet
```java
                next = next.next();
                attachment.setAttachment(next.getHeadKey(), next.getHeadValue());
                if (invocation.getAttachments().containsKey(next.getHeadKey())) {
                    invocation.getAttachments().remove(next.getHeadKey());
                }
```

### RuleId[ruleID=RedundantCollectionOperation]
Unnecessary 'containsKey()' check
in `apm-sniffer/apm-sdk-plugin/dubbo-2.7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo/DubboInterceptor.java`
#### Snippet
```java
                next = next.next();
                rpcContext.setAttachment(next.getHeadKey(), next.getHeadValue());
                if (invocation.getAttachments().containsKey(next.getHeadKey())) {
                    invocation.getAttachments().remove(next.getHeadKey());
                }
```

### RuleId[ruleID=RedundantCollectionOperation]
Unnecessary 'containsKey()' check
in `apm-sniffer/apm-sdk-plugin/dubbo-plugin/src/main/java/org/apache/skywalking/apm/plugin/dubbo/DubboInterceptor.java`
#### Snippet
```java
                next = next.next();
                rpcContext.getAttachments().put(next.getHeadKey(), next.getHeadValue());
                if (invocation.getAttachments().containsKey(next.getHeadKey())) {
                    invocation.getAttachments().remove(next.getHeadKey());
                }
```

## RuleId[ruleID=CatchMayIgnoreException]
### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `apm-commons/apm-datacarrier/src/main/java/org/apache/skywalking/apm/commons/datacarrier/EnvUtil.java`
#### Snippet
```java
            try {
                value = Integer.parseInt(envValue);
            } catch (NumberFormatException e) {

            }
```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `apm-commons/apm-datacarrier/src/main/java/org/apache/skywalking/apm/commons/datacarrier/EnvUtil.java`
#### Snippet
```java
            try {
                value = Long.parseLong(envValue);
            } catch (NumberFormatException e) {

            }
```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `apm-commons/apm-datacarrier/src/main/java/org/apache/skywalking/apm/commons/datacarrier/consumer/MultipleChannelsConsumer.java`
#### Snippet
```java
                try {
                    Thread.sleep(consumeCycle);
                } catch (InterruptedException e) {
                }
            }
```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `apm-commons/apm-datacarrier/src/main/java/org/apache/skywalking/apm/commons/datacarrier/consumer/ConsumerThread.java`
#### Snippet
```java
                try {
                    Thread.sleep(consumeCycle);
                } catch (InterruptedException e) {
                }
            }
```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `apm-sniffer/apm-test-tools/src/main/java/org/apache/skywalking/apm/agent/test/tools/AgentServiceRule.java`
#### Snippet
```java
                TracingContext.ListenerManager.class, "LISTENERS", new ArrayList<TracingContextListener>());
            ServiceManager.INSTANCE.shutdown();
        } catch (Exception e) {
        }
    }
```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `apm-sniffer/apm-test-tools/src/main/java/org/apache/skywalking/apm/agent/test/helper/SegmentRefHelper.java`
#### Snippet
```java
        try {
            return FieldGetter.getValue(ref, "spanId");
        } catch (Exception e) {
        }

```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `apm-sniffer/apm-test-tools/src/main/java/org/apache/skywalking/apm/agent/test/helper/SegmentRefHelper.java`
#### Snippet
```java
        try {
            return FieldGetter.getValue(ref, "addressUsedAtClient");
        } catch (Exception e) {
        }

```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `apm-sniffer/apm-test-tools/src/main/java/org/apache/skywalking/apm/agent/test/helper/SegmentRefHelper.java`
#### Snippet
```java
        try {
            return FieldGetter.getValue(ref, "parentServiceInstance");
        } catch (Exception e) {
        }

```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `apm-sniffer/apm-test-tools/src/main/java/org/apache/skywalking/apm/agent/test/helper/SegmentRefHelper.java`
#### Snippet
```java
        try {
            return FieldGetter.getValue(ref, "traceId");
        } catch (Exception e) {
        }

```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `apm-sniffer/apm-test-tools/src/main/java/org/apache/skywalking/apm/agent/test/tools/TracingSegmentRunner.java`
#### Snippet
```java
                        tracingData = new SegmentStorage();
                        field.set(targetObject, tracingData);
                    } catch (IllegalAccessException e) {
                    }
                }
```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `apm-sniffer/apm-test-tools/src/main/java/org/apache/skywalking/apm/agent/test/helper/SegmentHelper.java`
#### Snippet
```java
        try {
            return FieldGetter.getValue(traceSegment, "spans");
        } catch (Exception e) {
        }

```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `apm-sniffer/apm-test-tools/src/main/java/org/apache/skywalking/apm/agent/test/helper/SpanHelper.java`
#### Snippet
```java
            try {
                return FieldGetter.getParentFieldValue(tracingSpan, "componentId");
            } catch (Exception e1) {

            }
```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `apm-sniffer/apm-test-tools/src/main/java/org/apache/skywalking/apm/agent/test/helper/SpanHelper.java`
#### Snippet
```java
            try {
                return FieldGetter.getParentFieldValue(tracingSpan, "peer");
            } catch (Exception e1) {

            }
```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `apm-sniffer/apm-test-tools/src/main/java/org/apache/skywalking/apm/agent/test/helper/SpanHelper.java`
#### Snippet
```java
                    return tags;
                }
            } catch (Exception e1) {

            }
```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `apm-sniffer/apm-test-tools/src/main/java/org/apache/skywalking/apm/agent/test/helper/SpanHelper.java`
#### Snippet
```java
            try {
                return FieldGetter.getParentFieldValue(tracingSpan, "parentSpanId");
            } catch (Exception e1) {

            }
```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `apm-sniffer/apm-test-tools/src/main/java/org/apache/skywalking/apm/agent/test/helper/SpanHelper.java`
#### Snippet
```java
            try {
                return FieldGetter.getParentFieldValue(tracingSpan, "errorOccurred");
            } catch (Exception e1) {

            }
```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `apm-sniffer/apm-test-tools/src/main/java/org/apache/skywalking/apm/agent/test/helper/SpanHelper.java`
#### Snippet
```java
                    return logs;
                }
            } catch (Exception e1) {

            }
```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `apm-sniffer/apm-test-tools/src/main/java/org/apache/skywalking/apm/agent/test/helper/SpanHelper.java`
#### Snippet
```java
            try {
                return FieldGetter.getParentFieldValue(tracingSpan, "layer");
            } catch (Exception e1) {

            }
```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `apm-sniffer/apm-test-tools/src/main/java/org/apache/skywalking/apm/agent/test/helper/SpanHelper.java`
#### Snippet
```java
            try {
                return FieldGetter.getParentFieldValue(tracingSpan, "componentName");
            } catch (Exception e1) {

            }
```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `apm-sniffer/apm-sdk-plugin/graphql-plugin/graphql-8.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/graphql/v8/GraphqlInterceptor.java`
#### Snippet
```java
            }
            dealException(t);
        } catch (NoSuchFieldException | IllegalAccessException e) {
        }
    }
```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `apm-sniffer/apm-sdk-plugin/graphql-plugin/graphql-8.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/graphql/v8/GraphqlInterceptor.java`
#### Snippet
```java
            }
            ContextManager.stopSpan();
        } catch (NoSuchFieldException | IllegalAccessException e) {
        }
        return ret;
```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `apm-sniffer/apm-sdk-plugin/graphql-plugin/graphql-8.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/graphql/v8/GraphqlInterceptor.java`
#### Snippet
```java
            Tags.LOGIC_ENDPOINT.set(span, Tags.VAL_LOCAL_SPAN_AS_LOGIC_ENDPOINT);
            span.setComponent(ComponentsDefine.GRAPHQL);
        } catch (NoSuchFieldException | IllegalAccessException e) {
        }
    }
```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `apm-sniffer/bootstrap-plugins/jdk-http-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdk/http/HttpClientParseHttpInterceptor.java`
#### Snippet
```java
                try {
                    return Integer.valueOf(results[1]);
                } catch (Exception e) {
                }
            }
```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `apm-sniffer/apm-sdk-plugin/mysql-6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/mysql/v6/ConnectionCreateOldInterceptor.java`
#### Snippet
```java
                Method getDbMethod = parameterTypes[0].getDeclaredMethod("getDatabase");
                database = (String) getDbMethod.invoke(allArguments[0]);
            } catch (Throwable t) { }
            ConnectionInfo connectionInfo = ConnectionCache.get(allArguments[1].toString(), allArguments[2].toString(), database);
            ((EnhancedInstance) ret).setSkyWalkingDynamicField(connectionInfo);
```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/os/OSUtil.java`
#### Snippet
```java
                    }
                }
            } catch (SocketException e) {

            }
```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/ActiveSpanErrorThrowableInteceptor.java`
#### Snippet
```java
            activeSpan = ContextManager.activeSpan();
            activeSpan.log((Throwable) allArguments[0]);
        } catch (NullPointerException e) {
        }
    }
```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/ActiveSpanInfoInterceptor.java`
#### Snippet
```java
            activeSpan.log(System.currentTimeMillis(), event);

        } catch (NullPointerException e) {
        }
    }
```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/ActiveSpanDebugInterceptor.java`
#### Snippet
```java
            activeSpan.log(System.currentTimeMillis(), event);

        } catch (NullPointerException e) {
        }
    }
```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/ActiveSpanErrorMsgInterceptor.java`
#### Snippet
```java
            activeSpan.log(System.currentTimeMillis(), event);

        } catch (NullPointerException e) {
        }
    }
```

### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/ActiveSpanErrorInterceptor.java`
#### Snippet
```java
            activeSpan = ContextManager.activeSpan();
            activeSpan.errorOccurred();
        } catch (NullPointerException e) {
        }
    }
```

## RuleId[ruleID=ProtectedMemberInFinalClass]
### RuleId[ruleID=ProtectedMemberInFinalClass]
Class member declared `protected` in 'final' class
in `apm-commons/apm-util/src/main/java/org/apache/skywalking/apm/util/PropertyPlaceholderHelper.java`
#### Snippet
```java
    }

    protected String parseStringValue(String value, PlaceholderResolver placeholderResolver,
                                      Set<String> visitedPlaceholders) {

```

## RuleId[ruleID=UnnecessaryToStringCall]
### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `apm-sniffer/apm-sdk-plugin/elasticsearch-6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v6/interceptor/ClusterClientPutSettingsMethodsInterceptor.java`
#### Snippet
```java
                Settings persist = updateSettingsRequest.persistentSettings();
                if (persist != null) {
                    sb.append(persist.toString());
                }
                sb.append("]---transient:[");
```

### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `apm-sniffer/apm-sdk-plugin/elasticsearch-6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v6/interceptor/ClusterClientPutSettingsMethodsInterceptor.java`
#### Snippet
```java
                Settings transi = updateSettingsRequest.transientSettings();
                if (transi != null) {
                    sb.append(transi.toString());
                }
                sb.append("]");
```

### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-logback-1.x-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/log/logback/v1/x/PrintSkyWalkingContextInterceptor.java`
#### Snippet
```java
                SkyWalkingContext skyWalkingContext = (SkyWalkingContext) ((EnhancedInstance) allArguments[0]).getSkyWalkingDynamicField();
                if (skyWalkingContext != null) {
                    return "SW_CTX:" + skyWalkingContext.toString();
                }
            }
```

### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-logback-1.x-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/log/logback/v1/x/PrintSkyWalkingContextInterceptor.java`
#### Snippet
```java
                ContextManager.getSegmentId(),
                ContextManager.getSpanId())
                .toString();
    }

```

### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-logback-1.x-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/log/logback/v1/x/mdc/PrintMDCSkyWalkingContextInterceptor.java`
#### Snippet
```java
                SkyWalkingContext skyWalkingContext = (SkyWalkingContext) ((EnhancedInstance) allArguments[0]).getSkyWalkingDynamicField();
                if (skyWalkingContext != null) {
                    return "SW_CTX:" + skyWalkingContext.toString();
                }
            }
```

### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-logback-1.x-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/log/logback/v1/x/mdc/PrintMDCSkyWalkingContextInterceptor.java`
#### Snippet
```java
                ContextManager.getSegmentId(),
                ContextManager.getSpanId())
                .toString();
    }

```

### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-log4j-1.x-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/log/log4j/v1/x/PrintSkyWalkingContextInterceptor.java`
#### Snippet
```java
                ContextManager.getSegmentId(),
                ContextManager.getSpanId())
                .toString();
    }

```

## RuleId[ruleID=InnerClassMayBeStatic]
### RuleId[ruleID=InnerClassMayBeStatic]
Inner class `PrimaryEndpoint` may be 'static'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/TracingContext.java`
#### Snippet
```java
     * @since 8.10.0
     */
    private class PrimaryEndpoint {
        @Getter
        private AbstractSpan span;
```

## RuleId[ruleID=RedundantSuppression]
### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `apm-sniffer/apm-sdk-plugin/mongodb-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/mongodb/v4/support/MongoOperationHelper.java`
#### Snippet
```java
    "Duplicates"
})
public class MongoOperationHelper {

    private MongoOperationHelper() {
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `apm-sniffer/apm-sdk-plugin/mongodb-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/mongodb/v4/support/MongoRemotePeerHelper.java`
#### Snippet
```java

@SuppressWarnings("deprecation")
public class MongoRemotePeerHelper {

    private MongoRemotePeerHelper() {
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/conf/CustomizeConfiguration.java`
#### Snippet
```java
     */
    @SuppressWarnings("unchecked")
    private Map<String, Map<String, Object>> getMethodConfigurations() {
        return CONTEXT_METHOD_CONFIGURATIONS;
    }
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/conf/CustomizeConfiguration.java`
#### Snippet
```java
     */
    @SuppressWarnings("unchecked")
    private HashMap<String, ElementMatcher> getEnhanceClasses() {
        return (HashMap<String, ElementMatcher>) CONTEXT_ENHANCE_CLASSES;
    }
```

## RuleId[ruleID=UnnecessaryBoxing]
### RuleId[ruleID=UnnecessaryBoxing]
Redundant boxing, `Integer.parseInt()` call can be used instead
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/connectionurl/parser/PostgreSQLURLParser.java`
#### Snippet
```java
            String[] hostAndPort = hostSegment[0].split(":");
            if (hostAndPort.length != 1) {
                return new ConnectionInfo(ComponentsDefine.POSTGRESQL_DRIVER, DB_TYPE, hostAndPort[0], Integer.valueOf(hostAndPort[1]), fetchDatabaseNameFromURL());
            } else {
                return new ConnectionInfo(ComponentsDefine.POSTGRESQL_DRIVER, DB_TYPE, hostAndPort[0], DEFAULT_PORT, fetchDatabaseNameFromURL());
```

### RuleId[ruleID=UnnecessaryBoxing]
Redundant boxing, `Integer.parseInt()` call can be used instead
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/connectionurl/parser/H2URLParser.java`
#### Snippet
```java
            return new ConnectionInfo(ComponentsDefine.H2_JDBC_DRIVER, H2_DB_TYPE, hostAndPort[0], DEFAULT_PORT, fetchDatabaseNameFromURL());
        } else {
            return new ConnectionInfo(ComponentsDefine.H2_JDBC_DRIVER, H2_DB_TYPE, hostAndPort[0], Integer.valueOf(hostAndPort[1]), fetchDatabaseNameFromURL());
        }
    }
```

### RuleId[ruleID=UnnecessaryBoxing]
Redundant boxing, `Integer.parseInt()` call can be used instead
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/connectionurl/parser/MysqlURLParser.java`
#### Snippet
```java
            String[] hostAndPort = hostSegment[0].split(":");
            if (hostAndPort.length != 1) {
                return new ConnectionInfo(component, dbType, hostAndPort[0], Integer.valueOf(hostAndPort[1]), fetchDatabaseNameFromURL(location
                        .endIndex()));
            } else {
```

### RuleId[ruleID=UnnecessaryBoxing]
Redundant boxing, `Integer.parseInt()` call can be used instead
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/connectionurl/parser/MssqlJtdsURLParser.java`
#### Snippet
```java
                if (hostAndPort.length != 1) {
                    return new ConnectionInfo(
                        component, dbType, hostAndPort[0], Integer.valueOf(hostAndPort[1]),
                        fetchDatabaseNameFromURL(location.endIndex())
                    );
```

### RuleId[ruleID=UnnecessaryBoxing]
Redundant boxing, `Integer.parseInt()` call can be used instead
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/connectionurl/parser/ImpalaJdbcURLParser.java`
#### Snippet
```java
            String[] hostAndPort = hostSegment[0].split(":");
            if (hostAndPort.length != 1) {
                return new ConnectionInfo(component, DB_TYPE, hostAndPort[0], Integer.valueOf(hostAndPort[1]), fetchDatabaseNameFromURL(location
                        .endIndex()));
            } else {
```

### RuleId[ruleID=UnnecessaryBoxing]
Redundant boxing, `Integer.parseInt()` call can be used instead
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/connectionurl/parser/MssqlJdbcURLParser.java`
#### Snippet
```java
                if (hostAndPort.length != 1) {
                    return new ConnectionInfo(
                        component, dbType, hostAndPort[0], Integer.valueOf(hostAndPort[1]),
                        fetchDatabaseNameFromURL(location.endIndex())
                    );
```

### RuleId[ruleID=UnnecessaryBoxing]
Redundant boxing, `Integer.parseInt()` call can be used instead
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/connectionurl/parser/OracleURLParser.java`
#### Snippet
```java
            return new ConnectionInfo(ComponentsDefine.OJDBC, DB_TYPE, host, DEFAULT_PORT, databaseName);
        } else {
            return new ConnectionInfo(ComponentsDefine.OJDBC, DB_TYPE, hostSegment[0], Integer.valueOf(hostSegment[1]), databaseName);
        }
    }
```

### RuleId[ruleID=UnnecessaryBoxing]
Redundant boxing, `Integer.parseInt()` call can be used instead
in `apm-sniffer/apm-sdk-plugin/canal-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/canal/ClusterNodeConstructInterceptor.java`
#### Snippet
```java
            String[] strs = StringUtils.split(address, ":");
            if (strs != null && strs.length == 2) {
                addresses.add(new InetSocketAddress(strs[0], Integer.valueOf(strs[1])));
            }
        }
```

### RuleId[ruleID=UnnecessaryBoxing]
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/loader/CustomizeInstrumentationLoader.java`
#### Snippet
```java
            for (String enhanceClass : enhanceClasses) {
                String[] classDesc = CustomizeUtil.getClassDesc(enhanceClass);
                AbstractClassEnhancePluginDefine plugin = (AbstractClassEnhancePluginDefine) Class.forName(Boolean.valueOf(classDesc[1]) ? CustomizeStaticInstrumentation.class
                    .getName() : CustomizeInstanceInstrumentation.class.getName(), true, classLoader)
                                                                                                  .getConstructor(String.class)
```

## RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'histogram'
in `apm-application-toolkit/apm-toolkit-micrometer-registry/src/main/java/org/apache/skywalking/apm/meter/micrometer/SkywalkingTimer.java`
#### Snippet
```java
     * Histogram of execute finished duration
     */
    private final Optional<Histogram> histogram;

    protected SkywalkingTimer(Id id, MeterId meterId, SkywalkingConfig config, Clock clock,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'histogram'
in `apm-application-toolkit/apm-toolkit-micrometer-registry/src/main/java/org/apache/skywalking/apm/meter/micrometer/SkywalkingDistributionSummary.java`
#### Snippet
```java
     * Histogram of summary
     */
    private final Optional<Histogram> histogram;

    protected SkywalkingDistributionSummary(Id id, MeterId meterId, SkywalkingConfig config, Clock clock,
```

## RuleId[ruleID=NonStrictComparisonCanBeEquality]
### RuleId[ruleID=NonStrictComparisonCanBeEquality]
Can be replaced with equality
in `apm-sniffer/apm-sdk-plugin/influxdb-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/influxdb/interceptor/InfluxDBMethodInterceptor.java`
#### Snippet
```java
        Tags.DB_TYPE.set(span, DB_TYPE);

        if (allArguments.length <= 0 || !InfluxDBPluginConfig.Plugin.InfluxDB.TRACE_INFLUXQL) {
            return;
        }
```

### RuleId[ruleID=NonStrictComparisonCanBeEquality]
Can be replaced with equality
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/remote/GRPCStreamServiceStatus.java`
#### Snippet
```java
            hasWaited += recheckCycle;

            if (recheckCycle >= maxCycle) {
                LOGGER.warn("Collector traceSegment service doesn't response in {} seconds.", hasWaited / 1000);
            } else {
```

### RuleId[ruleID=NonStrictComparisonCanBeEquality]
Can be replaced with equality
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/AbstractLogger.java`
#### Snippet
```java
    @Override
    public boolean isTraceEnabled() {
        return LogLevel.TRACE.compareTo(Config.Logging.LEVEL) >= 0;
    }

```

## RuleId[ruleID=CharsetObjectCanBeUsed]
### RuleId[ruleID=CharsetObjectCanBeUsed]
StandardCharsets.UTF_8 can be used instead
in `apm-application-toolkit/apm-toolkit-opentracing/src/main/java/org/apache/skywalking/apm/toolkit/opentracing/ByteBufferContext.java`
#### Snippet
```java

public class ByteBufferContext implements SpanContext {
    static final Charset CHARSET = Charset.forName("UTF-8");

    static final byte NO_ENTRY = 0;
```

## RuleId[ruleID=SystemOutErr]
### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `apm-commons/apm-util/src/main/java/org/apache/skywalking/apm/util/ConfigInitializer.java`
#### Snippet
```java
                        if (lengthDefine != null && propertyValue.length() > lengthDefine.value()) {
                            StringUtil.cut(propertyValue, lengthDefine.value());
                            System.err.printf("The config value will be truncated , because the length max than %d : %s -> %s%n", lengthDefine.value(), configKey, propertyValue);
                        }
                        Object convertedValue = convertToTypicalType(type, propertyValue);
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/BootstrapInterRuntimeAssist.java`
#### Snippet
```java
    private static final String LOG_MANAGER_CLASS = "org.apache.skywalking.apm.agent.core.plugin.bootstrap.BootstrapPluginLogBridge";
    private static final String LOG_MANAGER_GET_LOGGER_METHOD = "getLogger";
    private static final PrintStream OUT = System.out;

    public static ClassLoader getAgentClassLoader() {
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/SystemOutWriter.java`
#### Snippet
```java
    @Override
    public void write(String message) {
        PrintStream out = System.out;
        out.println(message);
    }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/FileWriter.java`
#### Snippet
```java
            logFilePath.mkdirs();
        } else if (!logFilePath.isDirectory()) {
            System.err.println("Log dir(" + Config.Logging.DIR + ") is not a directory.");
        }
        try {
```

## RuleId[ruleID=KotlinMavenPluginPhase]
### RuleId[ruleID=KotlinMavenPluginPhase]
You have kotlin-stdlib configured but no corresponding plugin execution
in `test/plugin/scenarios/kotlin-coroutine-scenario/pom.xml`
#### Snippet
```java
        <dependency>
            <groupId>org.jetbrains.kotlin</groupId>
            <artifactId>kotlin-stdlib</artifactId>
            <version>${kotlin.version}</version>
        </dependency>
```

### RuleId[ruleID=KotlinMavenPluginPhase]
Kotlin plugin has no compile executions
in `test/plugin/scenarios/kotlin-coroutine-scenario/pom.xml`
#### Snippet
```java
            <plugin>
                <groupId>org.jetbrains.kotlin</groupId>
                <artifactId>kotlin-maven-plugin</artifactId>
                <version>${kotlin.version}</version>

```

## RuleId[ruleID=ConditionCoveredByFurtherCondition]
### RuleId[ruleID=ConditionCoveredByFurtherCondition]
Condition '"true".equalsIgnoreCase(...)' covered by subsequent condition '!"false".equalsIgnoreCase(...)'
in `apm-application-toolkit/apm-toolkit-log4j-2.x/src/main/java/org/apache/skywalking/apm/toolkit/log/log4j/v2/x/log/GRPCLogClientAppender.java`
#### Snippet
```java
                                                       @PluginAttribute("ignoreExceptions") final String ignore) {
        String appenderName = name == null ? "gRPCLogClientAppender" : name;
        final boolean ignoreExceptions = "true".equalsIgnoreCase(ignore) || !"false".equalsIgnoreCase(ignore);
        return new GRPCLogClientAppender(appenderName, layout, filter, ignoreExceptions);
    }
```

### RuleId[ruleID=ConditionCoveredByFurtherCondition]
Condition 'ret != null' covered by subsequent condition 'ret instanceof EnhancedInstance'
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/JDBCDriverInterceptor.java`
#### Snippet
```java
    public Object afterMethod(EnhancedInstance objInst, Method method, Object[] allArguments, Class<?>[] argumentsTypes,
        Object ret) throws Throwable {
        if (ret != null && ret instanceof EnhancedInstance) {
            ((EnhancedInstance) ret).setSkyWalkingDynamicField(URLParser.parser((String) allArguments[0]));
        }
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `apm-sniffer/apm-sdk-plugin/rabbitmq-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/rabbitmq/ChannelNConstructorInterceptor.java`
#### Snippet
```java
    public void onConstruct(EnhancedInstance objInst, Object[] allArguments) {
        Connection connection = (Connection) allArguments[0];
        String url = connection.getAddress().toString().replace("/", "") + ":" + connection.getPort();
        objInst.setSkyWalkingDynamicField(url);
    }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `apm-sniffer/apm-sdk-plugin/activemq-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/activemq/ActiveMQProducerConstructorInterceptor.java`
#### Snippet
```java
    public void onConstruct(EnhancedInstance objInst, Object[] allArguments) {
        ActiveMQSession session = (ActiveMQSession) allArguments[0];
        objInst.setSkyWalkingDynamicField(session.getConnection().getTransport().getRemoteAddress().split("//")[1]);
    }
}
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `apm-sniffer/apm-sdk-plugin/activemq-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/activemq/ActiveMQConsumerConstructorInterceptor.java`
#### Snippet
```java
    public void onConstruct(EnhancedInstance objInst, Object[] allArguments) {
        ActiveMQSession session = (ActiveMQSession) allArguments[0];
        objInst.setSkyWalkingDynamicField(session.getConnection().getTransport().getRemoteAddress().split("//")[1]);
    }
}
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `apm-sniffer/apm-sdk-plugin/spring-plugins/mvc-annotation-commons/src/main/java/org/apache/skywalking/apm/plugin/spring/mvc/commons/PathMappingCache.java`
#### Snippet
```java
            methodPath = PATH_SEPARATOR + methodPath;
        }
        methodPathMapping.put(method, (classPath + methodPath).replace("//", "/"));
    }
}
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `apm-sniffer/apm-sdk-plugin/redisson-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/redisson/v3/ConnectionManagerInterceptor.java`
#### Snippet
```java
    static String getPeer(Object obj) {
        if (obj instanceof String) {
            return ((String) obj).replace("redis://", "");
        } else if (obj instanceof URI) {
            URI uri = (URI) obj;
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `apm-sniffer/apm-sdk-plugin/vertx-plugins/vertx-core-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/vertx3/VertxContext.java`
#### Snippet
```java
        double version;
        try {
            version = Double.parseDouble(VersionCommand.getVersion().replaceFirst("\\.", ""));
        } catch (Throwable ignored) {
            version = 3.00;
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/ServiceInstanceGenerator.java`
#### Snippet
```java
        }

        Config.Agent.INSTANCE_NAME = UUID.randomUUID().toString().replaceAll("-", "") + "@" + OSUtil.getIPV4();
    }

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/boot/AgentPackagePath.java`
#### Snippet
```java

    private static File findPath() throws AgentPackageNotFoundException {
        String classResourcePath = AgentPackagePath.class.getName().replaceAll("\\.", "/") + ".class";

        URL resource = ClassLoader.getSystemClassLoader().getResource(classResourcePath);
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/util/PrivateKeyUtil.java`
#### Snippet
```java
        if (keyDataString.contains(PKCS_1_PEM_HEADER)) {
            // OpenSSL / PKCS#1 Base64 PEM encoded file
            keyDataString = keyDataString.replace(PKCS_1_PEM_HEADER, "");
            keyDataString = keyDataString.replace(PKCS_1_PEM_FOOTER, "");
            keyDataString = keyDataString.replace("\n", "");
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/util/PrivateKeyUtil.java`
#### Snippet
```java
            // OpenSSL / PKCS#1 Base64 PEM encoded file
            keyDataString = keyDataString.replace(PKCS_1_PEM_HEADER, "");
            keyDataString = keyDataString.replace(PKCS_1_PEM_FOOTER, "");
            keyDataString = keyDataString.replace("\n", "");
            return readPkcs1PrivateKey(Base64.getDecoder().decode(keyDataString));
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/util/PrivateKeyUtil.java`
#### Snippet
```java
            keyDataString = keyDataString.replace(PKCS_1_PEM_HEADER, "");
            keyDataString = keyDataString.replace(PKCS_1_PEM_FOOTER, "");
            keyDataString = keyDataString.replace("\n", "");
            return readPkcs1PrivateKey(Base64.getDecoder().decode(keyDataString));
        }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/util/CustomizeExpression.java`
#### Snippet
```java

    private static Object matcherArray(String expression, Object o) {
        int index = Integer.parseInt(expression.replace("[", "").replace("]", ""));
        return o != null && Array.getLength(o) > index ? Array.get(o, index) : null;
    }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/util/CustomizeExpression.java`
#### Snippet
```java

    private static Object matcherArray(String expression, Object o) {
        int index = Integer.parseInt(expression.replace("[", "").replace("]", ""));
        return o != null && Array.getLength(o) > index ? Array.get(o, index) : null;
    }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/util/CustomizeExpression.java`
#### Snippet
```java
        try {
            if (expression.contains("()")) {
                Method m = o.getClass().getMethod(expression.replace("()", ""));
                m.setAccessible(true);
                return m.invoke(o);
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/util/CustomizeExpression.java`
#### Snippet
```java

    private static Object matcherList(String expression, Object o) {
        int index = Integer.parseInt(expression.replace("[", "").replace("]", ""));
        List l = (List) o;
        return l != null && l.size() > index ? l.get(index) : null;
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/util/CustomizeExpression.java`
#### Snippet
```java

    private static Object matcherList(String expression, Object o) {
        int index = Integer.parseInt(expression.replace("[", "").replace("]", ""));
        List l = (List) o;
        return l != null && l.size() > index ? l.get(index) : null;
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/util/CustomizeExpression.java`
#### Snippet
```java

    private static Object matcherMap(String expression, Object o) {
        String key = expression.replace("['", "").replace("']", "");
        return ((Map) o).get(key);
    }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/util/CustomizeExpression.java`
#### Snippet
```java

    private static Object matcherMap(String expression, Object o) {
        String key = expression.replace("['", "").replace("']", "");
        return ((Map) o).get(key);
    }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/bootstrap/BootstrapInstrumentBoost.java`
#### Snippet
```java
        byte[] enhancedInstanceClassFile;
        try {
            String classResourceName = className.replaceAll("\\.", "/") + ".class";
            InputStream resourceAsStream = AgentClassLoader.getDefault().getResourceAsStream(classResourceName);

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/ids/GlobalIdGenerator.java`
#### Snippet
```java

public final class GlobalIdGenerator {
    private static final String PROCESS_ID = UUID.randomUUID().toString().replaceAll("-", "");
    private static final ThreadLocal<IDContext> THREAD_ID_SEQUENCE = ThreadLocal.withInitial(
        () -> new IDContext(System.currentTimeMillis(), (short) 0));
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/AbstractLogger.java`
#### Snippet
```java
             * @Fix the Illegal group reference issue
             */
            tmpMessage = tmpMessage.replaceFirst("\\{\\}", Matcher.quoteReplacement(String.valueOf(parameters[parametersIndex++])));
            startSize = index + 2;
        }
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.eclipse.jetty.client` is unnecessary and can be removed
in `apm-sniffer/apm-sdk-plugin/jetty-plugin/jetty-client-9.0-plugin/src/main/java/org/apache/skywalking/apm/plugin/jetty/v90/client/SyncHttpRequestSendInterceptor.java`
#### Snippet
```java
         * The method is null if the client using GET method.
         *
         * @see org.eclipse.jetty.client.HttpRequest#GET(String uri)
         * @see org.eclipse.jetty.client.HttpRequest( org.eclipse.jetty.client.HttpClient client, long conversation, java.net.URI uri)
         */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.eclipse.jetty.client` is unnecessary and can be removed
in `apm-sniffer/apm-sdk-plugin/jetty-plugin/jetty-client-9.0-plugin/src/main/java/org/apache/skywalking/apm/plugin/jetty/v90/client/SyncHttpRequestSendInterceptor.java`
#### Snippet
```java
         *
         * @see org.eclipse.jetty.client.HttpRequest#GET(String uri)
         * @see org.eclipse.jetty.client.HttpRequest( org.eclipse.jetty.client.HttpClient client, long conversation, java.net.URI uri)
         */
        if (request.getMethod() != null) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.rocketmq.common.protocol.header` is unnecessary and can be removed
in `apm-sniffer/apm-sdk-plugin/rocketMQ-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/rocketMQ/v4/MessageSendInterceptor.java`
#### Snippet
```java
/**
 * {@link MessageSendInterceptor} create exit span when the method {@link org.apache.rocketmq.client.impl.MQClientAPIImpl#sendMessage(String,
 * String, Message, org.apache.rocketmq.common.protocol.header.SendMessageRequestHeader, long,
 * org.apache.rocketmq.client.impl.CommunicationMode, org.apache.rocketmq.client.producer.SendCallback,
 * org.apache.rocketmq.client.impl.producer.TopicPublishInfo, org.apache.rocketmq.client.impl.factory.MQClientInstance,
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.kafka.clients.producer` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-sdk-plugin/spring-plugins/spring-kafka-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/kafka/KafkaTemplateCallbackInterceptor.java`
#### Snippet
```java
    public Object afterMethod(EnhancedInstance objInst, Method method, Object[] allArguments, Class<?>[] argumentsTypes,
                              Object ret) throws Throwable {
        return new CallbackAdapter((org.apache.kafka.clients.producer.Callback) ret, objInst);
    }

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-sdk-plugin/grpc-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/grpc/v1/client/ClientCallsGenericCallInterceptor.java`
#### Snippet
```java
            MethodInterceptResult result) {
        // only trace async generic call. Determine if the request parameter is a DynamicMessage
        if (allArguments[1] instanceof com.google.protobuf.DynamicMessage) {
            ContextManager.getRuntimeContext().put(GENERIC_CALL_METHOD, method.getName());
        }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/JDBCStatementInterceptor.java`
#### Snippet
```java
            return ret;
        }
        return new SWStatement((Connection) objInst, (java.sql.Statement) ret, (ConnectionInfo) objInst.getSkyWalkingDynamicField());
    }

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/trace/CallableStatementTracing.java`
#### Snippet
```java
public class CallableStatementTracing {

    public static <R> R execute(java.sql.CallableStatement realStatement, ConnectionInfo connectInfo, String method,
        String sql, Executable<R> exec) throws SQLException {
        AbstractSpan span = ContextManager.createExitSpan(connectInfo.getDBType() + "/JDBC/CallableStatement/" + method, connectInfo
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/trace/CallableStatementTracing.java`
#### Snippet
```java

    public interface Executable<R> {
        R exe(java.sql.CallableStatement realConnection, String sql) throws SQLException;
    }
}
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/trace/PreparedStatementTracing.java`
#### Snippet
```java
public class PreparedStatementTracing {

    public static <R> R execute(java.sql.PreparedStatement realStatement, ConnectionInfo connectInfo, String method,
        String sql, Executable<R> exec) throws SQLException {
        final AbstractSpan span = ContextManager.createExitSpan(connectInfo.getDBType() + "/JDBC/PreparedStatement/" + method, connectInfo
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/trace/PreparedStatementTracing.java`
#### Snippet
```java

    public interface Executable<R> {
        R exe(java.sql.PreparedStatement realConnection, String sql) throws SQLException;
    }
}
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/trace/StatementTracing.java`
#### Snippet
```java

    public interface Executable<R> {
        R exe(java.sql.Statement realStatement, String sql) throws SQLException;
    }
}
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/trace/StatementTracing.java`
#### Snippet
```java
 */
public class StatementTracing {
    public static <R> R execute(java.sql.Statement realStatement, ConnectionInfo connectInfo, String method, String sql,
        Executable<R> exec) throws SQLException {
        try {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/trace/SWStatement.java`
#### Snippet
```java
        return StatementTracing.execute(realStatement, connectInfo, "executeBatch", "", new StatementTracing.Executable<int[]>() {
            @Override
            public int[] exe(java.sql.Statement realStatement, String sql) throws SQLException {
                return realStatement.executeBatch();
            }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/trace/SWStatement.java`
#### Snippet
```java
        return StatementTracing.execute(realStatement, connectInfo, "executeQuery", sql, new StatementTracing.Executable<ResultSet>() {
            @Override
            public ResultSet exe(java.sql.Statement realStatement, String sql) throws SQLException {
                return realStatement.executeQuery(sql);
            }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/trace/SWStatement.java`
#### Snippet
```java
        return StatementTracing.execute(realStatement, connectInfo, "executeUpdate", sql, new StatementTracing.Executable<Integer>() {
            @Override
            public Integer exe(java.sql.Statement realStatement, String sql) throws SQLException {
                return realStatement.executeUpdate(sql);
            }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/trace/SWStatement.java`
#### Snippet
```java
        return StatementTracing.execute(realStatement, connectInfo, "execute", sql, new StatementTracing.Executable<Boolean>() {
            @Override
            public Boolean exe(java.sql.Statement realStatement, String sql) throws SQLException {
                return realStatement.execute(sql, autoGeneratedKeys);
            }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/trace/SWStatement.java`
#### Snippet
```java
    private ConnectionInfo connectInfo;

    public SWStatement(Connection realConnection, java.sql.Statement realStatement, ConnectionInfo connectInfo) {
        this.realConnection = realConnection;
        this.realStatement = realStatement;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/trace/SWStatement.java`
#### Snippet
```java
        return StatementTracing.execute(realStatement, connectInfo, "executeUpdate", sql, new StatementTracing.Executable<Integer>() {
            @Override
            public Integer exe(java.sql.Statement realStatement, String sql) throws SQLException {
                return realStatement.executeUpdate(sql, columnIndexes);
            }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/trace/SWStatement.java`
#### Snippet
```java
 */

public class SWStatement implements java.sql.Statement {
    private Connection realConnection;
    private java.sql.Statement realStatement;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/trace/SWStatement.java`
#### Snippet
```java
        return StatementTracing.execute(realStatement, connectInfo, "execute", sql, new StatementTracing.Executable<Boolean>() {
            @Override
            public Boolean exe(java.sql.Statement realStatement, String sql) throws SQLException {
                return realStatement.execute(sql, columnNames);
            }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/trace/SWStatement.java`
#### Snippet
```java
        return StatementTracing.execute(realStatement, connectInfo, "execute", sql, new StatementTracing.Executable<Boolean>() {
            @Override
            public Boolean exe(java.sql.Statement realStatement, String sql) throws SQLException {
                return realStatement.execute(sql, columnIndexes);
            }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/trace/SWStatement.java`
#### Snippet
```java
        return StatementTracing.execute(realStatement, connectInfo, "execute", sql, new StatementTracing.Executable<Boolean>() {
            @Override
            public Boolean exe(java.sql.Statement realStatement, String sql) throws SQLException {
                return realStatement.execute(sql);
            }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/trace/SWStatement.java`
#### Snippet
```java
        return StatementTracing.execute(realStatement, connectInfo, "executeUpdate", sql, new StatementTracing.Executable<Integer>() {
            @Override
            public Integer exe(java.sql.Statement realStatement, String sql) throws SQLException {
                return realStatement.executeUpdate(sql, autoGeneratedKeys);
            }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/trace/SWStatement.java`
#### Snippet
```java
        return StatementTracing.execute(realStatement, connectInfo, "executeUpdate", sql, new StatementTracing.Executable<Integer>() {
            @Override
            public Integer exe(java.sql.Statement realStatement, String sql) throws SQLException {
                return realStatement.executeUpdate(sql, columnNames);
            }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/trace/SWStatement.java`
#### Snippet
```java
public class SWStatement implements java.sql.Statement {
    private Connection realConnection;
    private java.sql.Statement realStatement;
    private ConnectionInfo connectInfo;

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.skywalking.apm.agent.core.kafka` is unnecessary and can be removed
in `apm-sniffer/optional-reporter-plugins/kafka-reporter-plugin/src/main/java/org/apache/skywalking/apm/agent/core/kafka/KafkaLogReporterServiceClient.java`
#### Snippet
```java

    @Override
    public void onStatusChanged(final org.apache.skywalking.apm.agent.core.kafka.KafkaConnectionStatus status) {
        if (status == KafkaConnectionStatus.CONNECTED) {
            producer = ServiceManager.INSTANCE.findService(KafkaProducerManager.class).getProducer();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.skywalking.apm.plugin.jdbc.kylin.define` is unnecessary and can be removed
in `apm-sniffer/apm-sdk-plugin/kylin-jdbc-2.6.x-3.x-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/kylin/define/PreparedStatementIgnoredSetterInstrumentation.java`
#### Snippet
```java

public class PreparedStatementIgnoredSetterInstrumentation extends
        org.apache.skywalking.apm.plugin.jdbc.kylin.define.PreparedStatementInstrumentation {

    @Override
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `reactor.netty.http.client` is unnecessary and can be removed
in `apm-sniffer/optional-plugins/optional-spring-plugins/optional-spring-cloud/gateway-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/cloud/gateway/v3x/HttpClientFinalizerConstructorInterceptor.java`
#### Snippet
```java
 * Intercept the constructor and inject {@link EnhanceObjectCache}.
 * <p>
 * The first constructor argument is {@link reactor.netty.http.client.HttpClientConfig} class instance which can get the
 * request uri string.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `apm-sniffer/apm-sdk-plugin/xxl-job-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/xxljob/ScriptJobHandlerConstructorInterceptor.java`
#### Snippet
```java

/**
 * Intercept method of {@link com.xxl.job.core.handler.impl.ScriptJobHandler#ScriptJobHandler(int, long, java.lang.String, com.xxl.job.core.glue.GlueTypeEnum)}.
 * cache the script job details.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.xxl.job.core.glue` is unnecessary and can be removed
in `apm-sniffer/apm-sdk-plugin/xxl-job-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/xxljob/ScriptJobHandlerConstructorInterceptor.java`
#### Snippet
```java

/**
 * Intercept method of {@link com.xxl.job.core.handler.impl.ScriptJobHandler#ScriptJobHandler(int, long, java.lang.String, com.xxl.job.core.glue.GlueTypeEnum)}.
 * cache the script job details.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.xxl.job.core.context` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-sdk-plugin/xxl-job-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/xxljob/SimpleJobHandlerMethodInterceptor.java`
#### Snippet
```java
        } else if (allArguments.length == 0) {
            // support 2.3
            String jobParam = com.xxl.job.core.context.XxlJobHelper.getJobParam();
            span.tag(JOB_PARAM, jobParam);
        }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `apm-sniffer/apm-sdk-plugin/xxl-job-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/xxljob/MethodJobHandlerConstructorInterceptor.java`
#### Snippet
```java

/**
 * Intercept method of {@link com.xxl.job.core.handler.impl.MethodJobHandler#MethodJobHandler(java.lang.Object, java.lang.reflect.Method, java.lang.reflect.Method, java.lang.reflect.Method)}.
 * cache the job target method details.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `apm-sniffer/apm-sdk-plugin/xxl-job-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/xxljob/MethodJobHandlerConstructorInterceptor.java`
#### Snippet
```java

/**
 * Intercept method of {@link com.xxl.job.core.handler.impl.MethodJobHandler#MethodJobHandler(java.lang.Object, java.lang.reflect.Method, java.lang.reflect.Method, java.lang.reflect.Method)}.
 * cache the job target method details.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `apm-sniffer/apm-sdk-plugin/xxl-job-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/xxljob/MethodJobHandlerConstructorInterceptor.java`
#### Snippet
```java

/**
 * Intercept method of {@link com.xxl.job.core.handler.impl.MethodJobHandler#MethodJobHandler(java.lang.Object, java.lang.reflect.Method, java.lang.reflect.Method, java.lang.reflect.Method)}.
 * cache the job target method details.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `apm-sniffer/apm-sdk-plugin/xxl-job-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/xxljob/MethodJobHandlerConstructorInterceptor.java`
#### Snippet
```java

/**
 * Intercept method of {@link com.xxl.job.core.handler.impl.MethodJobHandler#MethodJobHandler(java.lang.Object, java.lang.reflect.Method, java.lang.reflect.Method, java.lang.reflect.Method)}.
 * cache the job target method details.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.xxl.job.core.context` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-sdk-plugin/xxl-job-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/xxljob/ScriptJobHandlerMethodInterceptor.java`
#### Snippet
```java
        } else if (allArguments.length == 0) {
            // support 2.3
            String jobParam = com.xxl.job.core.context.XxlJobHelper.getJobParam();
            span.tag(JOB_PARAM, jobParam);
        }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.xxl.job.core.context` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-sdk-plugin/xxl-job-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/xxljob/MethodJobHandlerMethodInterceptor.java`
#### Snippet
```java
        } else if (allArguments.length == 0) {
            // support 2.3
            String jobParam = com.xxl.job.core.context.XxlJobHelper.getJobParam();
            span.tag(JOB_PARAM, jobParam);
        }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.micrometer.core.instrument` is unnecessary, and can be replaced with an import
in `apm-application-toolkit/apm-toolkit-micrometer-registry/src/main/java/org/apache/skywalking/apm/meter/micrometer/SkywalkingMeterRegistry.java`
#### Snippet
```java

    @Override
    protected <T> io.micrometer.core.instrument.Gauge newGauge(Meter.Id id, T obj, ToDoubleFunction<T> valueFunction) {
        final MeterId meterId = convertId(id);
        MeterFactory.gauge(meterId, () -> valueFunction.applyAsDouble(obj)).build();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `io.micrometer.core.instrument` is unnecessary, and can be replaced with an import
in `apm-application-toolkit/apm-toolkit-micrometer-registry/src/main/java/org/apache/skywalking/apm/meter/micrometer/SkywalkingMeterRegistry.java`
#### Snippet
```java

    @Override
    protected io.micrometer.core.instrument.Counter newCounter(Meter.Id id) {
        final MeterId meterId = convertId(id);
        return new SkywalkingCounter(id, MeterBuilder.buildCounter(meterId, config));
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `feign` is unnecessary and can be removed
in `apm-sniffer/apm-sdk-plugin/feign-default-http-9.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/feign/http/v9/DefaultHttpClientInterceptor.java`
#### Snippet
```java

    /**
     * Get the {@link feign.Request} from {@link EnhancedInstance}, then create {@link AbstractSpan} and set host, port,
     * kind, component, url from {@link feign.Request}. Through the reflection of the way, set the http header of
     * context data into {@link feign.Request#headers}.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `feign` is unnecessary and can be removed
in `apm-sniffer/apm-sdk-plugin/feign-default-http-9.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/feign/http/v9/DefaultHttpClientInterceptor.java`
#### Snippet
```java
    /**
     * Get the {@link feign.Request} from {@link EnhancedInstance}, then create {@link AbstractSpan} and set host, port,
     * kind, component, url from {@link feign.Request}. Through the reflection of the way, set the http header of
     * context data into {@link feign.Request#headers}.
     *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `feign` is unnecessary and can be removed
in `apm-sniffer/apm-sdk-plugin/feign-default-http-9.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/feign/http/v9/DefaultHttpClientInterceptor.java`
#### Snippet
```java
     * Get the {@link feign.Request} from {@link EnhancedInstance}, then create {@link AbstractSpan} and set host, port,
     * kind, component, url from {@link feign.Request}. Through the reflection of the way, set the http header of
     * context data into {@link feign.Request#headers}.
     *
     * @param method intercept method
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `ru.yandex.clickhouse` is unnecessary and can be removed
in `apm-sniffer/apm-sdk-plugin/clickhouse-0.3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/clickhouse/ClickHouseStatementMethodInterceptor.java`
#### Snippet
```java
 * This interceptor is used to replace {@link org.apache.skywalking.apm.plugin.jdbc.JDBCStatementInterceptor}.
 * Because return value type of {@link ClickHouseConnectionImpl#createStatement()} method is {@link
 * ru.yandex.clickhouse.ClickHouseStatement} instead of {@link java.sql.Statement}.
 */
public class ClickHouseStatementMethodInterceptor implements InstanceMethodsAroundInterceptor {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `scala.collection` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-sdk-plugin/play-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/play/v2x/HttpFiltersInterceptor.java`
#### Snippet
```java
        List<Object> filters = new ArrayList<>(seq.size() + 1);
        filters.add(filter);
        filters.addAll(scala.collection.JavaConverters.asJavaCollection(seq));
        return scala.collection.JavaConverters.asScalaBuffer(filters).toList();
    }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `scala.collection` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-sdk-plugin/play-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/play/v2x/HttpFiltersInterceptor.java`
#### Snippet
```java
        filters.add(filter);
        filters.addAll(scala.collection.JavaConverters.asJavaCollection(seq));
        return scala.collection.JavaConverters.asScalaBuffer(filters).toList();
    }

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/util/CustomizeUtil.java`
#### Snippet
```java
        JAVA_CLASS.put("float.class", float.class);
        JAVA_CLASS.put("double.class", double.class);
        JAVA_CLASS.put("java.util.List", java.util.List.class);
        JAVA_CLASS.put("java.util.Map", java.util.Map.class);
    }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/util/CustomizeUtil.java`
#### Snippet
```java
        JAVA_CLASS.put("double.class", double.class);
        JAVA_CLASS.put("java.util.List", java.util.List.class);
        JAVA_CLASS.put("java.util.Map", java.util.Map.class);
    }

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `apm-sniffer/bootstrap-plugins/jdk-threading-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdk/threading/JDKThreadingPluginConfig.java`
#### Snippet
```java

            /**
             * Threading classes ({@link java.lang.Runnable} and {@link java.util.concurrent.Callable} and their
             * subclasses, including anonymous inner classes) whose name matches any one of the {@code
             * THREADING_CLASS_PREFIXES} (splitted by ,) will be instrumented
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `scala.collection.immutable` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/ContextHolderFactory.java`
#### Snippet
```java

        @Override
        protected scala.collection.immutable.Map<Buf, Object> getUpdatedContext(scala.collection.immutable.Map<Buf, Object> currentContext, Object key, Object value) {
            checkKeyType(key);
            try {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `scala.collection.immutable` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/ContextHolderFactory.java`
#### Snippet
```java

        @Override
        protected scala.collection.immutable.Map<Buf, Object> getUpdatedContext(scala.collection.immutable.Map<Buf, Object> currentContext, Object key, Object value) {
            checkKeyType(key);
            try {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `scala.collection.immutable` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/ContextHolderFactory.java`
#### Snippet
```java

        @Override
        protected scala.collection.immutable.Map<LocalContext.Key, Object> getUpdatedContext(scala.collection.immutable.Map<LocalContext.Key, Object> currentContext, Object key, Object value) {
            checkKeyType(key);
            return currentContext.updated((LocalContext.Key) key, value);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `scala.collection.immutable` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/ContextHolderFactory.java`
#### Snippet
```java

        @Override
        protected scala.collection.immutable.Map<LocalContext.Key, Object> getUpdatedContext(scala.collection.immutable.Map<LocalContext.Key, Object> currentContext, Object key, Object value) {
            checkKeyType(key);
            return currentContext.updated((LocalContext.Key) key, value);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `scala.collection.immutable` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/ContextHolderFactory.java`
#### Snippet
```java
    }

    static class MapMarshalledContextHolder extends ContextHolderFactory.AbstractContextHolder<scala.collection.immutable.Map<Buf, Object>> {

        private static final String LOCAL_FIELD_NAME = "local";
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `scala.collection.immutable` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/ContextHolderFactory.java`
#### Snippet
```java
    }

    static class MapLocalContextHolder extends ContextHolderFactory.AbstractContextHolder<scala.collection.immutable.Map<LocalContext.Key, Object>> {

        private static final String LOCAL_FIELD_NAME = "local";
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/converters/ThrowableConverter.java`
#### Snippet
```java
    public static String format(Throwable t) {
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        t.printStackTrace(new java.io.PrintWriter(buf, true));
        String expMessage = buf.toString();
        try {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.skywalking.apm.toolkit.trace` is unnecessary and can be removed
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/BaseTraceAnnotationInterceptor.java`
#### Snippet
```java
        final Map<String, Object> context = CustomizeExpression.evaluationContext(allArguments);

        final org.apache.skywalking.apm.toolkit.trace.Tags tags = method.getAnnotation(Tags.class);
        if (tags != null && tags.value().length > 0) {
            for (final Tag tag : tags.value()) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.quartz` is unnecessary and can be removed
in `apm-sniffer/optional-plugins/quartz-scheduler-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/quartz/JobExecuteStateMethodInterceptor.java`
#### Snippet
```java

/**
 * Intercept method of {@link JobRunShell#notifyJobListenersComplete(org.quartz.JobExecutionContext, org.quartz.JobExecutionException)}.
 * record the quartz job execute exception.
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.quartz.spi` is unnecessary and can be removed
in `apm-sniffer/optional-plugins/quartz-scheduler-2.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/quartz/JobRunShellConstructorInterceptor.java`
#### Snippet
```java

/**
 * Intercept method of {@link org.quartz.core.JobRunShell#JobRunShell(org.quartz.Scheduler, org.quartz.spi.TriggerFiredBundle)}.
 * cache the execute job details
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.networknt.exception` is unnecessary and can be removed
in `apm-sniffer/apm-sdk-plugin/light4j-plugins/light4j-plugin/src/main/java/org/apache/skywalking/apm/plugin/light4j/HandleRequestInterceptor.java`
#### Snippet
```java
/**
 * {@link HandleRequestInterceptor} creates an entry span before the execution of {@link
 * com.networknt.exception.ExceptionHandler#handleRequest(HttpServerExchange)} in the I/O thread.
 * <p>
 * If the {@link Light4JPluginConfig.Plugin.Light4J#TRACE_HANDLER_CHAIN} flag is set, additionally a local span is produced
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.networknt.handler` is unnecessary and can be removed
in `apm-sniffer/apm-sdk-plugin/light4j-plugins/light4j-plugin/src/main/java/org/apache/skywalking/apm/plugin/light4j/HandleRequestInterceptor.java`
#### Snippet
```java
 * <p>
 * If the {@link Light4JPluginConfig.Plugin.Light4J#TRACE_HANDLER_CHAIN} flag is set, additionally a local span is produced
 * for each {@link com.networknt.handler.MiddlewareHandler} and business handler before their respective {@link
 * com.networknt.handler.LightHttpHandler#handleRequest(HttpServerExchange)} method executes. Since {@link
 * com.networknt.handler.LightHttpHandler} is implemented by various middleware and business handlers and the Light4J
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.skywalking.apm.plugin.spring.mvc.v5` is unnecessary and can be removed
in `apm-sniffer/apm-sdk-plugin/spring-plugins/mvc-annotation-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/mvc/v5/InvokeInterceptor.java`
#### Snippet
```java
         * First, we put the slot in the RuntimeContext,
         * as well as the MethodInvocationContext (MIC),
         * so that we can access it in the {@link org.apache.skywalking.apm.plugin.spring.mvc.v5.InvokeInterceptor#afterMethod}
         * Then we fetch the slot from {@link org.apache.skywalking.apm.plugin.spring.mvc.commons.interceptor.AbstractMethodInterceptor#afterMethod}
         * and fulfill the slot with the real AbstractSpan.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `reactor.core.publisher` is unnecessary and can be removed
in `apm-sniffer/apm-sdk-plugin/spring-plugins/mvc-annotation-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/mvc/v5/InvokeInterceptor.java`
#### Snippet
```java
         * and fulfill the slot with the real AbstractSpan.
         * Afterwards, we can safely remove the RuntimeContext.
         * Finally, when the lambda executes in the {@link reactor.core.publisher.Mono#doFinally},
         * ref of span could be acquired from MIC.
         */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.alibaba.rocketmq.common.protocol.header` is unnecessary and can be removed
in `apm-sniffer/apm-sdk-plugin/rocketMQ-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/rocketMQ/v3/MessageSendInterceptor.java`
#### Snippet
```java
/**
 * {@link MessageSendInterceptor} create exit span when the method {@link com.alibaba.rocketmq.client.impl.MQClientAPIImpl#sendMessage(String,
 * String, Message, com.alibaba.rocketmq.common.protocol.header.SendMessageRequestHeader, long,
 * com.alibaba.rocketmq.client.impl.CommunicationMode, com.alibaba.rocketmq.client.producer.SendCallback,
 * com.alibaba.rocketmq.client.impl.producer.TopicPublishInfo, com.alibaba.rocketmq.client.impl.factory.MQClientInstance,
```

## RuleId[ruleID=ThrowablePrintStackTrace]
### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/WriterFactory.java`
#### Snippet
```java
                            Config.Logging.DIR = AgentPackagePath.getPath() + "/logs";
                        } catch (AgentPackageNotFoundException e) {
                            e.printStackTrace();
                        }
                    }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/converters/ThrowableConverter.java`
#### Snippet
```java
            buf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Constants.LINE_SEPARATOR + expMessage;
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/FileWriter.java`
#### Snippet
```java
                                 }
                             } catch (IOException e) {
                                 e.printStackTrace();
                             }
                         } finally {
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/FileWriter.java`
#### Snippet
```java
                fileSize += message.length();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                switchFile();
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/FileWriter.java`
#### Snippet
```java
            callable.call();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/FileWriter.java`
#### Snippet
```java
            fileSize = Long.valueOf(new File(logFilePath, Config.Logging.FILE_NAME).length()).intValue();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractURLParser()` of an abstract class should not be declared 'public'
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/connectionurl/parser/AbstractURLParser.java`
#### Snippet
```java
    protected String url;

    public AbstractURLParser(String url) {
        this.url = url;
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractProtocolWrapper()` of an abstract class should not be declared 'public'
in `apm-sniffer/apm-sdk-plugin/thrift-plugin/src/main/java/org/apache/skywalking/apm/plugin/thrift/wrapper/AbstractProtocolWrapper.java`
#### Snippet
```java
    public static final short SW_MAGIC_FIELD_ID = 8888; // Field ID, a magic number

    public AbstractProtocolWrapper(final TProtocol protocol) {
        super(protocol);
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `BaseMeter()` of an abstract class should not be declared 'public'
in `apm-application-toolkit/apm-toolkit-meter/src/main/java/org/apache/skywalking/apm/toolkit/meter/BaseMeter.java`
#### Snippet
```java

public abstract class BaseMeter {
    public BaseMeter(MeterId meterId) {
    }

```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `BaseBuilder()` of an abstract class should not be declared 'public'
in `apm-application-toolkit/apm-toolkit-meter/src/main/java/org/apache/skywalking/apm/toolkit/meter/BaseBuilder.java`
#### Snippet
```java
     * Build a new meter build, meter name is required
     */
    public BaseBuilder(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Meter name cannot be null");
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `BaseBuilder()` of an abstract class should not be declared 'public'
in `apm-application-toolkit/apm-toolkit-meter/src/main/java/org/apache/skywalking/apm/toolkit/meter/BaseBuilder.java`
#### Snippet
```java
     * Build a new meter build from exists meter id
     */
    public BaseBuilder(MeterId meterId) {
        if (meterId == null) {
            throw new IllegalArgumentException("Meter id cannot be null");
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `GCModule()` of an abstract class should not be declared 'public'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/jvm/gc/GCModule.java`
#### Snippet
```java
    private long lastNormalGCTime = 0;

    public GCModule(List<GarbageCollectorMXBean> beans) {
        this.beans = beans;
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `CPUMetricsAccessor()` of an abstract class should not be declared 'public'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/jvm/cpu/CPUMetricsAccessor.java`
#### Snippet
```java
    private final int cpuCoreNum;

    public CPUMetricsAccessor(int cpuCoreNum) {
        this.cpuCoreNum = cpuCoreNum;
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `MemoryPoolModule()` of an abstract class should not be declared 'public'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/jvm/memorypool/MemoryPoolModule.java`
#### Snippet
```java
    private List<MemoryPoolMXBean> beans;

    public MemoryPoolModule(List<MemoryPoolMXBean> beans) {
        this.beans = beans;
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AgentConfigChangeWatcher()` of an abstract class should not be declared 'public'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/conf/dynamic/AgentConfigChangeWatcher.java`
#### Snippet
```java
    private final String propertyKey;

    public AgentConfigChangeWatcher(String propertyKey) {
        this.propertyKey = propertyKey;
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `BaseMeter()` of an abstract class should not be declared 'public'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/meter/BaseMeter.java`
#### Snippet
```java
    protected final MeterId meterId;

    public BaseMeter(MeterId meterId) {
        this.meterId = meterId;
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractBuilder()` of an abstract class should not be declared 'public'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/meter/AbstractBuilder.java`
#### Snippet
```java
     * Build a new meter build, meter name is required
     */
    public AbstractBuilder(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Meter name cannot be null");
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractTag()` of an abstract class should not be declared 'public'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/tag/AbstractTag.java`
#### Snippet
```java
    protected final String key;

    public AbstractTag(int id, String tagKey, boolean canOverwrite) {
        this.id = id;
        this.key = tagKey;
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractTag()` of an abstract class should not be declared 'public'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/tag/AbstractTag.java`
#### Snippet
```java
    }

    public AbstractTag(String key) {
        this(-1, key, false);
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractLogger()` of an abstract class should not be declared 'public'
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/AbstractLogger.java`
#### Snippet
```java
    protected final String targetClass;

    public AbstractLogger(String targetClass) {
        this.targetClass = targetClass;
    }
```

## RuleId[ruleID=Anonymous2MethodRef]
### RuleId[ruleID=Anonymous2MethodRef]
Anonymous new StatementTracing.Executable() can be replaced with method reference
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/trace/SWStatement.java`
#### Snippet
```java
    @Override
    public boolean execute(String sql) throws SQLException {
        return StatementTracing.execute(realStatement, connectInfo, "execute", sql, new StatementTracing.Executable<Boolean>() {
            @Override
            public Boolean exe(java.sql.Statement realStatement, String sql) throws SQLException {
```

### RuleId[ruleID=Anonymous2MethodRef]
Anonymous new StatementTracing.Executable() can be replaced with method reference
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/trace/SWStatement.java`
#### Snippet
```java
    @Override
    public ResultSet executeQuery(String sql) throws SQLException {
        return StatementTracing.execute(realStatement, connectInfo, "executeQuery", sql, new StatementTracing.Executable<ResultSet>() {
            @Override
            public ResultSet exe(java.sql.Statement realStatement, String sql) throws SQLException {
```

### RuleId[ruleID=Anonymous2MethodRef]
Anonymous new StatementTracing.Executable() can be replaced with method reference
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/trace/SWStatement.java`
#### Snippet
```java
    @Override
    public int executeUpdate(String sql) throws SQLException {
        return StatementTracing.execute(realStatement, connectInfo, "executeUpdate", sql, new StatementTracing.Executable<Integer>() {
            @Override
            public Integer exe(java.sql.Statement realStatement, String sql) throws SQLException {
```

### RuleId[ruleID=Anonymous2MethodRef]
Anonymous new PreparedStatementTracing.Executable() can be replaced with method reference
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/trace/SWPreparedStatement.java`
#### Snippet
```java
    @Override
    public boolean execute(String sql) throws SQLException {
        return PreparedStatementTracing.execute(realStatement, connectInfo, "execute", sql, new PreparedStatementTracing.Executable<Boolean>() {
            @Override
            public Boolean exe(PreparedStatement realStatement, String sql) throws SQLException {
```

### RuleId[ruleID=Anonymous2MethodRef]
Anonymous new PreparedStatementTracing.Executable() can be replaced with method reference
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/trace/SWPreparedStatement.java`
#### Snippet
```java
    @Override
    public ResultSet executeQuery(String sql) throws SQLException {
        return PreparedStatementTracing.execute(realStatement, connectInfo, "executeQuery", sql, new PreparedStatementTracing.Executable<ResultSet>() {
            @Override
            public ResultSet exe(PreparedStatement realStatement, String sql) throws SQLException {
```

### RuleId[ruleID=Anonymous2MethodRef]
Anonymous new PreparedStatementTracing.Executable() can be replaced with method reference
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/trace/SWPreparedStatement.java`
#### Snippet
```java
    @Override
    public int executeUpdate(String sql) throws SQLException {
        return PreparedStatementTracing.execute(realStatement, connectInfo, "executeUpdate", sql, new PreparedStatementTracing.Executable<Integer>() {
            @Override
            public Integer exe(PreparedStatement realStatement, String sql) throws SQLException {
```

### RuleId[ruleID=Anonymous2MethodRef]
Anonymous new CallableStatementTracing.Executable() can be replaced with method reference
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/trace/SWCallableStatement.java`
#### Snippet
```java
    @Override
    public boolean execute(String sql) throws SQLException {
        return CallableStatementTracing.execute(realStatement, connectInfo, "execute", sql, new CallableStatementTracing.Executable<Boolean>() {
            @Override
            public Boolean exe(CallableStatement realStatement, String sql) throws SQLException {
```

### RuleId[ruleID=Anonymous2MethodRef]
Anonymous new CallableStatementTracing.Executable() can be replaced with method reference
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/trace/SWCallableStatement.java`
#### Snippet
```java
    @Override
    public ResultSet executeQuery(String sql) throws SQLException {
        return CallableStatementTracing.execute(realStatement, connectInfo, "executeQuery", sql, new CallableStatementTracing.Executable<ResultSet>() {
            @Override
            public ResultSet exe(CallableStatement realStatement, String sql) throws SQLException {
```

### RuleId[ruleID=Anonymous2MethodRef]
Anonymous new CallableStatementTracing.Executable() can be replaced with method reference
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/trace/SWCallableStatement.java`
#### Snippet
```java
    @Override
    public int executeUpdate(String sql) throws SQLException {
        return CallableStatementTracing.execute(realStatement, connectInfo, "executeUpdate", sql, new CallableStatementTracing.Executable<Integer>() {
            @Override
            public Integer exe(CallableStatement realStatement, String sql) throws SQLException {
```

## RuleId[ruleID=Java8MapApi]
### RuleId[ruleID=Java8MapApi]
Can be replaced with single 'Map.computeIfAbsent' method call
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/PluginFinder.java`
#### Snippet
```java
                NameMatch nameMatch = (NameMatch) match;
                LinkedList<AbstractClassEnhancePluginDefine> pluginDefines = nameMatchDefine.get(nameMatch.getClassName());
                if (pluginDefines == null) {
                    pluginDefines = new LinkedList<AbstractClassEnhancePluginDefine>();
                    nameMatchDefine.put(nameMatch.getClassName(), pluginDefines);
```

## RuleId[ruleID=Convert2Lambda]
### RuleId[ruleID=Convert2Lambda]
Anonymous new BiConsumer() can be replaced with lambda
in `apm-sniffer/optional-plugins/optional-spring-plugins/optional-spring-cloud/gateway-2.0.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/cloud/gateway/v20x/HttpClientRequestInterceptor.java`
#### Snippet
```java
        EnhanceCacheObject enhanceCacheObject = (EnhanceCacheObject) objInst.getSkyWalkingDynamicField();
        Mono<HttpClientResponse> responseMono = (Mono<HttpClientResponse>) ret;
        return responseMono.doAfterSuccessOrError(new BiConsumer<HttpClientResponse, Throwable>() {
            @Override
            public void accept(final HttpClientResponse httpClientResponse, final Throwable throwable) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Function\>() can be replaced with lambda
in `apm-sniffer/optional-plugins/optional-spring-plugins/optional-spring-cloud/gateway-2.0.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/cloud/gateway/v20x/HttpClientRequestInterceptor.java`
#### Snippet
```java

        Function<? super HttpClientRequest, ? extends Publisher<Void>> handler = (Function<? super HttpClientRequest, ? extends Publisher<Void>>) allArguments[2];
        allArguments[2] = new Function<HttpClientRequest, Publisher<Void>>() {
            @Override
            public Publisher<Void> apply(final HttpClientRequest httpClientRequest) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new BiFunction\>() can be replaced with lambda
in `apm-sniffer/optional-plugins/optional-spring-plugins/optional-spring-cloud/gateway-2.1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/spring/cloud/gateway/v21x/HttpClientFinalizerSendInterceptor.java`
#### Snippet
```java

            BiFunction<? super HttpClientRequest, ? super NettyOutbound, ? extends Publisher<Void>> finalSender = (BiFunction<? super HttpClientRequest, ? super NettyOutbound, ? extends Publisher<Void>>) allArguments[0];
            allArguments[0] = new BiFunction<HttpClientRequest, NettyOutbound, Publisher<Void>>() {
                @Override
                public Publisher<Void> apply(HttpClientRequest request, NettyOutbound outbound) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Runnable() can be replaced with lambda
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/FileWriter.java`
#### Snippet
```java
        final ArrayList<String> outputLogs = new ArrayList<String>(200);
        Executors.newSingleThreadScheduledExecutor(new DefaultNamedThreadFactory("LogFileWriter"))
                 .scheduleAtFixedRate(new RunnableWithExceptionProtection(new Runnable() {
                     @Override
                     public void run() {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new FilenameFilter() can be replaced with lambda
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/FileWriter.java`
#### Snippet
```java
    private String[] getHistoryFilePath() {
        File path = new File(Config.Logging.DIR);
        String[] pathArr = path.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Comparator() can be replaced with lambda
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/FileWriter.java`
#### Snippet
```java
        if (historyFileArr != null && historyFileArr.length > Config.Logging.MAX_HISTORY_FILES) {

            Arrays.sort(historyFileArr, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Callable() can be replaced with lambda
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/FileWriter.java`
#### Snippet
```java
    private void switchFile() {
        if (fileSize > Config.Logging.MAX_FILE_SIZE) {
            forceExecute(new Callable() {
                @Override
                public Object call() throws Exception {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Callable() can be replaced with lambda
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/FileWriter.java`
#### Snippet
```java
                }
            });
            forceExecute(new Callable() {
                @Override
                public Object call() throws Exception {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Callable() can be replaced with lambda
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/FileWriter.java`
#### Snippet
```java
                }
            });
            forceExecute(new Callable() {
                @Override
                public Object call() throws Exception {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Callable() can be replaced with lambda
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/FileWriter.java`
#### Snippet
```java
                }
            });
            forceExecute(new Callable() {
                @Override
                public Object call() throws Exception {
```

## RuleId[ruleID=AssignmentToMethodParameter]
### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `index`
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/define/StatementEnhanceInfos.java`
#### Snippet
```java
    public void setParameter(int index, final Object parameter) {
        maxIndex = maxIndex > index ? maxIndex : index;
        index--; // start from 1
        if (parameters == null) {
            final int initialSize = Math.max(16, maxIndex);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `size`
in `apm-commons/apm-datacarrier/src/main/java/org/apache/skywalking/apm/commons/datacarrier/consumer/BulkConsumePool.java`
#### Snippet
```java

    public BulkConsumePool(String name, int size, long consumeCycle) {
        size = EnvUtil.getInt(name + "_THREAD", size);
        allConsumers = new ArrayList<MultipleChannelsConsumer>(size);
        for (int i = 0; i < size; i++) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `classPath`
in `apm-sniffer/apm-sdk-plugin/spring-plugins/mvc-annotation-commons/src/main/java/org/apache/skywalking/apm/plugin/spring/mvc/commons/PathMappingCache.java`
#### Snippet
```java
    public PathMappingCache(String classPath) {
        if (!StringUtil.isEmpty(classPath) && !classPath.startsWith(PATH_SEPARATOR)) {
            classPath = PATH_SEPARATOR + classPath;
        }
        this.classPath = classPath;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `methodPath`
in `apm-sniffer/apm-sdk-plugin/spring-plugins/mvc-annotation-commons/src/main/java/org/apache/skywalking/apm/plugin/spring/mvc/commons/PathMappingCache.java`
#### Snippet
```java
    public void addPathMapping(Method method, String methodPath) {
        if (!StringUtil.isEmpty(methodPath) && !methodPath.startsWith(PATH_SEPARATOR) && !classPath.endsWith(PATH_SEPARATOR)) {
            methodPath = PATH_SEPARATOR + methodPath;
        }
        methodPathMapping.put(method, (classPath + methodPath).replace("//", "/"));
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `bufferSize`
in `apm-commons/apm-datacarrier/src/main/java/org/apache/skywalking/apm/commons/datacarrier/DataCarrier.java`
#### Snippet
```java
    public DataCarrier(String name, String envPrefix, int channelSize, int bufferSize, BufferStrategy strategy) {
        this.name = name;
        bufferSize = EnvUtil.getInt(envPrefix + "_BUFFER_SIZE", bufferSize);
        channelSize = EnvUtil.getInt(envPrefix + "_CHANNEL_SIZE", channelSize);
        channels = new Channels<>(channelSize, bufferSize, new SimpleRollingPartitioner<T>(), strategy);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `channelSize`
in `apm-commons/apm-datacarrier/src/main/java/org/apache/skywalking/apm/commons/datacarrier/DataCarrier.java`
#### Snippet
```java
        this.name = name;
        bufferSize = EnvUtil.getInt(envPrefix + "_BUFFER_SIZE", bufferSize);
        channelSize = EnvUtil.getInt(envPrefix + "_CHANNEL_SIZE", channelSize);
        channels = new Channels<>(channelSize, bufferSize, new SimpleRollingPartitioner<T>(), strategy);
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `s`
in `apm-sniffer/optional-plugins/trace-ignore-plugin/src/main/java/org/apache/skywalking/apm/plugin/trace/ignore/matcher/FastPathMatcher.java`
#### Snippet
```java
                // Check '/' is the last char of string
                if (sc == '/') return s == str.length() - 1;
                s++;
            }
        }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `s`
in `apm-sniffer/optional-plugins/trace-ignore-plugin/src/main/java/org/apache/skywalking/apm/plugin/trace/ignore/matcher/FastPathMatcher.java`
#### Snippet
```java
                }

                s++;
                continue;
            }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `p`
in `apm-sniffer/optional-plugins/trace-ignore-plugin/src/main/java/org/apache/skywalking/apm/plugin/trace/ignore/matcher/FastPathMatcher.java`
#### Snippet
```java
            case 0: return true;
            // Skip next '/' for pattern to match zero path part.
            case '/': p++;
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `s`
in `apm-sniffer/optional-plugins/trace-ignore-plugin/src/main/java/org/apache/skywalking/apm/plugin/trace/ignore/matcher/FastPathMatcher.java`
#### Snippet
```java
                }

                s++;
                continue;
            }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `p`
in `apm-sniffer/optional-plugins/trace-ignore-plugin/src/main/java/org/apache/skywalking/apm/plugin/trace/ignore/matcher/FastPathMatcher.java`
#### Snippet
```java
            // string:  a/bcd    a/
            if (pc == '*') {
                p++;
                // Got * in pattern again, enter the multi-wildcard mode.
                //             ?        ?
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `p`
in `apm-sniffer/optional-plugins/trace-ignore-plugin/src/main/java/org/apache/skywalking/apm/plugin/trace/ignore/matcher/FastPathMatcher.java`
#### Snippet
```java
                // string:  a/bcd    a/
                if (safeCharAt(pat, p) == '*') {
                    p++;
                    // Enter the multi-wildcard mode.
                    //              ?        ?
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `s`
in `apm-sniffer/optional-plugins/trace-ignore-plugin/src/main/java/org/apache/skywalking/apm/plugin/trace/ignore/matcher/FastPathMatcher.java`
#### Snippet
```java
            // string:  a/b/c    a/b/d    a/d
            if ((pc == '?' && sc != 0 && sc != '/') || pc == sc) {
                s++;
                p++;
                continue;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `p`
in `apm-sniffer/optional-plugins/trace-ignore-plugin/src/main/java/org/apache/skywalking/apm/plugin/trace/ignore/matcher/FastPathMatcher.java`
#### Snippet
```java
            if ((pc == '?' && sc != 0 && sc != '/') || pc == sc) {
                s++;
                p++;
                continue;
            }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `o`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/util/CustomizeExpression.java`
#### Snippet
```java
            return o;
        } else {
            o = parse0(expressions[next], o);
            return o == null ? "null" : parse(expressions, o, next);
        }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `agentOptions`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/conf/SnifferConfigInitializer.java`
#### Snippet
```java
        }

        agentOptions = StringUtil.trim(agentOptions, ',');
        if (!StringUtil.isEmpty(agentOptions)) {
            try {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `agentOptions`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/conf/SnifferConfigInitializer.java`
#### Snippet
```java
        if (!StringUtil.isEmpty(agentOptions)) {
            try {
                agentOptions = agentOptions.trim();
                LOGGER.info("Agent options is {}.", agentOptions);

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `newClassBuilder`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/AbstractClassEnhancePluginDefine.java`
#### Snippet
```java
    protected DynamicType.Builder<?> enhance(TypeDescription typeDescription, DynamicType.Builder<?> newClassBuilder,
                                             ClassLoader classLoader, EnhanceContext context) throws PluginException {
        newClassBuilder = this.enhanceClass(typeDescription, newClassBuilder, classLoader);

        newClassBuilder = this.enhanceInstance(typeDescription, newClassBuilder, classLoader, context);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `newClassBuilder`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/AbstractClassEnhancePluginDefine.java`
#### Snippet
```java
        newClassBuilder = this.enhanceClass(typeDescription, newClassBuilder, classLoader);

        newClassBuilder = this.enhanceInstance(typeDescription, newClassBuilder, classLoader, context);

        return newClassBuilder;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `targetClassLoader`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/loader/InterceptorInstanceLoader.java`
#### Snippet
```java
        ClassLoader targetClassLoader) throws IllegalAccessException, InstantiationException, ClassNotFoundException, AgentPackageNotFoundException {
        if (targetClassLoader == null) {
            targetClassLoader = InterceptorInstanceLoader.class.getClassLoader();
        }
        String instanceKey = className + "_OF_" + targetClassLoader.getClass()
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `agentBuilder`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/jdk9module/JDK9ModuleExporter.java`
#### Snippet
```java
        for (String className : classes.classes) {
            try {
                agentBuilder = agentBuilder.assureReadEdgeFromAndTo(instrumentation, Class.forName(className));
            } catch (ClassNotFoundException e) {
                throw new UnsupportedOperationException("Fail to open read edge for class " + className + " to public access in JDK9+", e);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `agentBuilder`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/jdk9module/JDK9ModuleExporter.java`
#### Snippet
```java
        for (String className : HIGH_PRIORITY_CLASSES) {
            try {
                agentBuilder = agentBuilder.assureReadEdgeFromAndTo(instrumentation, Class.forName(className));
            } catch (ClassNotFoundException e) {
                throw new UnsupportedOperationException("Fail to open read edge for class " + className + " to public access in JDK9+", e);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `classfileBuffer`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/bytebuddy/CacheableTransformerDecorator.java`
#### Snippet
```java

                //transform class
                classfileBuffer = classFileTransformer.transform(loader, className, classBeingRedefined, protectionDomain, classfileBuffer);

                // save to cache
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `newClassBuilder`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/v2/ClassEnhancePluginDefineV2.java`
#### Snippet
```java
        if (!typeDescription.isAssignableTo(EnhancedInstance.class)) {
            if (!context.isObjectExtended()) {
                newClassBuilder = newClassBuilder.defineField(
                    CONTEXT_ATTR_NAME, Object.class, ACC_PRIVATE | ACC_VOLATILE)
                                                 .implement(EnhancedInstance.class)
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `newClassBuilder`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/v2/ClassEnhancePluginDefineV2.java`
#### Snippet
```java
            for (ConstructorInterceptPoint constructorInterceptPoint : constructorInterceptPoints) {
                if (isBootstrapInstrumentation()) {
                    newClassBuilder = newClassBuilder.constructor(constructorInterceptPoint.getConstructorMatcher())
                                                     .intercept(SuperMethodCall.INSTANCE.andThen(MethodDelegation.withDefaultConfiguration()
                                                                                                                 .to(BootstrapInstrumentBoost
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `newClassBuilder`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/v2/ClassEnhancePluginDefineV2.java`
#### Snippet
```java
                                                                                                                                                       .getConstructorInterceptor()))));
                } else {
                    newClassBuilder = newClassBuilder.constructor(constructorInterceptPoint.getConstructorMatcher())
                                                     .intercept(SuperMethodCall.INSTANCE.andThen(MethodDelegation.withDefaultConfiguration()
                                                                                                                 .to(new ConstructorInter(constructorInterceptPoint
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `newClassBuilder`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/v2/ClassEnhancePluginDefineV2.java`
#### Snippet
```java
                if (instanceMethodsInterceptV2Point.isOverrideArgs()) {
                    if (isBootstrapInstrumentation()) {
                        newClassBuilder = newClassBuilder.method(junction)
                                                         .intercept(MethodDelegation.withDefaultConfiguration()
                                                                                    .withBinders(Morph.Binder.install(OverrideCallable.class))
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `newClassBuilder`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/v2/ClassEnhancePluginDefineV2.java`
#### Snippet
```java
                                                                                    .to(BootstrapInstrumentBoost.forInternalDelegateClass(interceptor)));
                    } else {
                        newClassBuilder = newClassBuilder.method(junction)
                                                         .intercept(MethodDelegation.withDefaultConfiguration()
                                                                                    .withBinders(Morph.Binder.install(OverrideCallable.class))
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `newClassBuilder`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/v2/ClassEnhancePluginDefineV2.java`
#### Snippet
```java
                } else {
                    if (isBootstrapInstrumentation()) {
                        newClassBuilder = newClassBuilder.method(junction)
                                                         .intercept(MethodDelegation.withDefaultConfiguration()
                                                                                    .to(BootstrapInstrumentBoost.forInternalDelegateClass(interceptor)));
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `newClassBuilder`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/v2/ClassEnhancePluginDefineV2.java`
#### Snippet
```java
                                                                                    .to(BootstrapInstrumentBoost.forInternalDelegateClass(interceptor)));
                    } else {
                        newClassBuilder = newClassBuilder.method(junction)
                                                         .intercept(MethodDelegation.withDefaultConfiguration()
                                                                                    .to(new InstMethodsInterV2(interceptor, classLoader)));
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `newClassBuilder`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/v2/ClassEnhancePluginDefineV2.java`
#### Snippet
```java
            if (staticMethodsInterceptV2Point.isOverrideArgs()) {
                if (isBootstrapInstrumentation()) {
                    newClassBuilder = newClassBuilder.method(
                        isStatic().and(staticMethodsInterceptV2Point.getMethodsMatcher()))
                                                     .intercept(MethodDelegation.withDefaultConfiguration()
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `newClassBuilder`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/v2/ClassEnhancePluginDefineV2.java`
#### Snippet
```java
                                                                                .to(BootstrapInstrumentBoost.forInternalDelegateClass(interceptor)));
                } else {
                    newClassBuilder = newClassBuilder.method(
                        isStatic().and(staticMethodsInterceptV2Point.getMethodsMatcher()))
                                                     .intercept(MethodDelegation.withDefaultConfiguration()
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `newClassBuilder`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/v2/ClassEnhancePluginDefineV2.java`
#### Snippet
```java
            } else {
                if (isBootstrapInstrumentation()) {
                    newClassBuilder = newClassBuilder.method(
                        isStatic().and(staticMethodsInterceptV2Point.getMethodsMatcher()))
                                                     .intercept(MethodDelegation.withDefaultConfiguration()
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `newClassBuilder`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/v2/ClassEnhancePluginDefineV2.java`
#### Snippet
```java
                                                                                .to(BootstrapInstrumentBoost.forInternalDelegateClass(interceptor)));
                } else {
                    newClassBuilder = newClassBuilder.method(
                        isStatic().and(staticMethodsInterceptV2Point.getMethodsMatcher()))
                                                     .intercept(MethodDelegation.withDefaultConfiguration()
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `agentBuilder`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/bootstrap/BootstrapInstrumentBoost.java`
#### Snippet
```java
        ClassInjector.UsingUnsafe.Factory factory = ClassInjector.UsingUnsafe.Factory.resolve(instrumentation);
        factory.make(null, null).injectRaw(classesTypeMap);
        agentBuilder = agentBuilder.with(new AgentBuilder.InjectionStrategy.UsingUnsafe.OfFactory(factory));

        return agentBuilder;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `newClassBuilder`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/ClassEnhancePluginDefine.java`
#### Snippet
```java
        if (!typeDescription.isAssignableTo(EnhancedInstance.class)) {
            if (!context.isObjectExtended()) {
                newClassBuilder = newClassBuilder.defineField(
                    CONTEXT_ATTR_NAME, Object.class, ACC_PRIVATE | ACC_VOLATILE)
                                                 .implement(EnhancedInstance.class)
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `newClassBuilder`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/ClassEnhancePluginDefine.java`
#### Snippet
```java
            for (ConstructorInterceptPoint constructorInterceptPoint : constructorInterceptPoints) {
                if (isBootstrapInstrumentation()) {
                    newClassBuilder = newClassBuilder.constructor(constructorInterceptPoint.getConstructorMatcher())
                                                     .intercept(SuperMethodCall.INSTANCE.andThen(MethodDelegation.withDefaultConfiguration()
                                                                                                                 .to(BootstrapInstrumentBoost
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `newClassBuilder`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/ClassEnhancePluginDefine.java`
#### Snippet
```java
                                                                                                                         .getConstructorInterceptor()))));
                } else {
                    newClassBuilder = newClassBuilder.constructor(constructorInterceptPoint.getConstructorMatcher())
                                                     .intercept(SuperMethodCall.INSTANCE.andThen(MethodDelegation.withDefaultConfiguration()
                                                                                                                 .to(new ConstructorInter(constructorInterceptPoint
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `newClassBuilder`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/ClassEnhancePluginDefine.java`
#### Snippet
```java
                if (instanceMethodsInterceptPoint.isOverrideArgs()) {
                    if (isBootstrapInstrumentation()) {
                        newClassBuilder = newClassBuilder.method(junction)
                                                         .intercept(MethodDelegation.withDefaultConfiguration()
                                                                                    .withBinders(Morph.Binder.install(OverrideCallable.class))
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `newClassBuilder`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/ClassEnhancePluginDefine.java`
#### Snippet
```java
                                                                                    .to(BootstrapInstrumentBoost.forInternalDelegateClass(interceptor)));
                    } else {
                        newClassBuilder = newClassBuilder.method(junction)
                                                         .intercept(MethodDelegation.withDefaultConfiguration()
                                                                                    .withBinders(Morph.Binder.install(OverrideCallable.class))
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `newClassBuilder`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/ClassEnhancePluginDefine.java`
#### Snippet
```java
                } else {
                    if (isBootstrapInstrumentation()) {
                        newClassBuilder = newClassBuilder.method(junction)
                                                         .intercept(MethodDelegation.withDefaultConfiguration()
                                                                                    .to(BootstrapInstrumentBoost.forInternalDelegateClass(interceptor)));
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `newClassBuilder`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/ClassEnhancePluginDefine.java`
#### Snippet
```java
                                                                                    .to(BootstrapInstrumentBoost.forInternalDelegateClass(interceptor)));
                    } else {
                        newClassBuilder = newClassBuilder.method(junction)
                                                         .intercept(MethodDelegation.withDefaultConfiguration()
                                                                                    .to(new InstMethodsInter(interceptor, classLoader)));
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `newClassBuilder`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/ClassEnhancePluginDefine.java`
#### Snippet
```java
            if (staticMethodsInterceptPoint.isOverrideArgs()) {
                if (isBootstrapInstrumentation()) {
                    newClassBuilder = newClassBuilder.method(isStatic().and(staticMethodsInterceptPoint.getMethodsMatcher()))
                                                     .intercept(MethodDelegation.withDefaultConfiguration()
                                                                                .withBinders(Morph.Binder.install(OverrideCallable.class))
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `newClassBuilder`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/ClassEnhancePluginDefine.java`
#### Snippet
```java
                                                                                .to(BootstrapInstrumentBoost.forInternalDelegateClass(interceptor)));
                } else {
                    newClassBuilder = newClassBuilder.method(isStatic().and(staticMethodsInterceptPoint.getMethodsMatcher()))
                                                     .intercept(MethodDelegation.withDefaultConfiguration()
                                                                                .withBinders(Morph.Binder.install(OverrideCallable.class))
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `newClassBuilder`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/ClassEnhancePluginDefine.java`
#### Snippet
```java
            } else {
                if (isBootstrapInstrumentation()) {
                    newClassBuilder = newClassBuilder.method(isStatic().and(staticMethodsInterceptPoint.getMethodsMatcher()))
                                                     .intercept(MethodDelegation.withDefaultConfiguration()
                                                                                .to(BootstrapInstrumentBoost.forInternalDelegateClass(interceptor)));
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `newClassBuilder`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/ClassEnhancePluginDefine.java`
#### Snippet
```java
                                                                                .to(BootstrapInstrumentBoost.forInternalDelegateClass(interceptor)));
                } else {
                    newClassBuilder = newClassBuilder.method(isStatic().and(staticMethodsInterceptPoint.getMethodsMatcher()))
                                                     .intercept(MethodDelegation.withDefaultConfiguration()
                                                                                .to(new StaticMethodsInter(interceptor)));
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `operationName`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/ContextManager.java`
#### Snippet
```java
        AbstractSpan span;
        AbstractTracerContext context;
        operationName = StringUtil.cut(operationName, OPERATION_NAME_THRESHOLD);
        if (carrier != null && carrier.isValid()) {
            SamplingService samplingService = ServiceManager.INSTANCE.findService(SamplingService.class);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `operationName`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/ContextManager.java`
#### Snippet
```java

    public static AbstractSpan createExitSpan(String operationName, String remotePeer) {
        operationName = StringUtil.cut(operationName, OPERATION_NAME_THRESHOLD);
        AbstractTracerContext context = getOrCreate(operationName, false);
        return context.createExitSpan(operationName, remotePeer);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `operationName`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/ContextManager.java`
#### Snippet
```java

    public static AbstractSpan createLocalSpan(String operationName) {
        operationName = StringUtil.cut(operationName, OPERATION_NAME_THRESHOLD);
        AbstractTracerContext context = getOrCreate(operationName, false);
        return context.createLocalSpan(operationName);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `operationName`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/ContextManager.java`
#### Snippet
```java
            throw new IllegalArgumentException("ContextCarrier can't be null.");
        }
        operationName = StringUtil.cut(operationName, OPERATION_NAME_THRESHOLD);
        AbstractTracerContext context = getOrCreate(operationName, false);
        AbstractSpan span = context.createExitSpan(operationName, remotePeer);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `e`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/status/StatusChecker.java`
#### Snippet
```java
        while (isError && Objects.nonNull(e) && maxDepth-- > 0) {
            isError = check(e);
            e = e.getCause();
        }
        return isError;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `pattern`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/PatternLogger.java`
#### Snippet
```java
    public void setPattern(String pattern) {
        if (StringUtil.isEmpty(pattern)) {
            pattern = DEFAULT_PATTERN;
        }
        this.pattern = pattern;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `remotePeer`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/TracingContext.java`
#### Snippet
```java
        } else {
            // Since 8.10.0
            remotePeer = StringUtil.isEmpty(CLUSTER) ? remotePeer : CLUSTER + "/" + remotePeer;
            final int parentSpanId = parentSpan == null ? -1 : parentSpan.getSpanId();
            exitSpan = new ExitSpan(spanIdGenerator++, parentSpanId, operationName, remotePeer, owner);
```

## RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
### RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
Synchronization on method parameter `objInst`
in `apm-sniffer/apm-sdk-plugin/hystrix-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/hystrix/v1/HystrixPluginsInterceptor.java`
#### Snippet
```java
        SWHystrixPluginsWrapperCache wrapperCache = (SWHystrixPluginsWrapperCache) objInst.getSkyWalkingDynamicField();
        if (wrapperCache == null || wrapperCache.getSwExecutionHookWrapper() == null) {
            synchronized (objInst) {
                if (wrapperCache == null) {
                    wrapperCache = new SWHystrixPluginsWrapperCache();
```

### RuleId[ruleID=SynchronizationOnLocalVariableOrMethodParameter]
Synchronization on method parameter `objInst`
in `apm-sniffer/apm-sdk-plugin/hystrix-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/hystrix/v1/HystrixConcurrencyStrategyInterceptor.java`
#### Snippet
```java
        SWHystrixPluginsWrapperCache wrapperCache = (SWHystrixPluginsWrapperCache) objInst.getSkyWalkingDynamicField();
        if (wrapperCache == null || wrapperCache.getSwHystrixConcurrencyStrategyWrapper() == null) {
            synchronized (objInst) {
                if (wrapperCache == null) {
                    wrapperCache = new SWHystrixPluginsWrapperCache();
```

## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/guava-eventbus-plugin/src/main/java/org/apache/skywalking/apm/plugin/guava/eventbus/EventBusDispatchInterceptor.java`
#### Snippet
```java
    public Object afterMethod(EnhancedInstance objInst, Method method, Object[] allArguments, Class<?>[] argumentsTypes,
            Object ret) throws Throwable {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/dubbo-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo3/DubboInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/dubbo-2.7.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/asf/dubbo/DubboInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-log4j-2.x-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/log/log4j/v2/x/log/GRPCLogAppenderActivation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/vertx-plugins/vertx-core-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/vertx4/SWVertxTracer.java`
#### Snippet
```java
                                           TagExtractor<R> tagExtractor) {
        if (TracingPolicy.IGNORE.equals(policy)) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/vertx-plugins/vertx-core-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/vertx4/SWVertxTracer.java`
#### Snippet
```java
        }

        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/vertx-plugins/vertx-core-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/vertx4/SWVertxTracer.java`
#### Snippet
```java
                                        TagExtractor<R> tagExtractor) {
        if (TracingPolicy.IGNORE.equals(policy) || request == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/vertx-plugins/vertx-core-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/vertx4/SWVertxTracer.java`
#### Snippet
```java
        }

        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/hutool-plugins/hutool-http-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/hutool/http/v5/define/HutoolHttpInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/sofarpc-plugin/src/main/java/org/apache/skywalking/apm/plugin/sofarpc/SofaRpcConsumerInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/sofarpc-plugin/src/main/java/org/apache/skywalking/apm/plugin/sofarpc/SofaRpcProviderInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/elasticsearch-6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/elasticsearch/v6/interceptor/TransportClientNodesServiceInterceptor.java`
#### Snippet
```java
        @Override
        public Object afterMethod(EnhancedInstance objInst, Method method, Object[] allArguments, Class<?>[] argumentsTypes, Object ret) throws Throwable {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/httpasyncclient-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/httpasyncclient/v4/define/HttpAsyncRequestExecutorInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/httpasyncclient-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/httpasyncclient/v4/define/HttpAsyncClientInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/httpasyncclient-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/httpasyncclient/v4/HttpAsyncRequestExecutorInterceptor.java`
#### Snippet
```java
        HttpContext contextInConn = conn.getContext();
        if (Objects.isNull(contextInConn)) {
            return null;
        }
        context = (HttpContext) contextInConn.getAttribute(Constants.SKYWALKING_HTTP_CONTEXT);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/httpasyncclient-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/httpasyncclient/v4/HttpAsyncRequestExecutorInterceptor.java`
#### Snippet
```java
        conn.getContext().removeAttribute(Constants.SKYWALKING_HTTP_CONTEXT);
        if (Objects.isNull(context)) {
            return null;
        }
        ContextSnapshot snapshot = (ContextSnapshot) contextInConn.getAttribute(Constants.SKYWALKING_CONTEXT_SNAPSHOT);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/mysql-8.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/mysql/v8/define/AbstractMysqlInstrumentation.java`
#### Snippet
```java
    @Override
    public StaticMethodsInterceptPoint[] getStaticMethodsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/mysql-8.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/mysql/v8/define/AbstractMysqlInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/mysql-8.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/mysql/v8/define/AbstractMysqlInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-webflux-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/webflux/WebFluxSkyWalkingOperatorsActivation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-commons/apm-util/src/main/java/org/apache/skywalking/apm/util/StringUtil.java`
#### Snippet
```java
    public static String join(final char delimiter, final String... strings) {
        if (strings.length == 0) {
            return null;
        }
        if (strings.length == 1) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-commons/apm-util/src/main/java/org/apache/skywalking/apm/util/StringUtil.java`
#### Snippet
```java
    public static String trim(final String str, final char ch) {
        if (isEmpty(str)) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-commons/apm-util/src/main/java/org/apache/skywalking/apm/util/ConfigInitializer.java`
#### Snippet
```java
    private static Object convertToTypicalType(Type type, String value) {
        if (StringUtil.isBlank(value)) {
            return null;
        }
        Object result = null;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/hystrix-1.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/hystrix/v1/SWHystrixLifecycleForwardingRequestVariable.java`
#### Snippet
```java
    public T get() {
        if (!HystrixRequestContext.isCurrentThreadInitialized()) {
            return null;
        }
        return super.get();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/connectionurl/parser/H2URLParser.java`
#### Snippet
```java
            };
        } else {
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/connectionurl/parser/H2URLParser.java`
#### Snippet
```java
            };
        } else {
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/connectionurl/parser/MysqlURLParser.java`
#### Snippet
```java
        int parameterStartTag = url.indexOf("?", startSize);
        if (parameterStartTag < databaseStartTag && parameterStartTag != -1) {
            return null;
        }
        if (databaseStartTag == -1) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/connectionurl/parser/MssqlJtdsURLParser.java`
#### Snippet
```java
        int databaseStartTag = url.indexOf("/", startSize);
        if (databaseStartTag == -1) {
            return null;
        }
        int databaseEndTag = url.indexOf(";", databaseStartTag);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/connectionurl/parser/MysqlURLParser.java`
#### Snippet
```java
        }
        if (databaseStartTag == -1) {
            return null;
        }
        int databaseEndTag = url.indexOf("?", databaseStartTag);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/connectionurl/parser/ImpalaJdbcURLParser.java`
#### Snippet
```java
        int databaseEndTag = url.length();
        if (databaseStartTag == -1 && firstParamIndex == -1) {
            return null;
        } else {
            String subUrl = url.substring(startSize, firstParamIndex);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/jdbc-commons/src/main/java/org/apache/skywalking/apm/plugin/jdbc/connectionurl/parser/ImpalaJdbcURLParser.java`
#### Snippet
```java
            int schemaIndex = subUrl.indexOf("/");
            if (schemaIndex == -1) {
                return null;
            } else {
                databaseEndTag = firstParamIndex;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-opentracing-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/opentracing/tracer/SkywalkingTracerInjectInterceptor.java`
#### Snippet
```java
        }

        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-application-toolkit/apm-toolkit-opentracing/src/main/java/org/apache/skywalking/apm/toolkit/opentracing/SkywalkingContext.java`
#### Snippet
```java
    @Override
    public Iterable<Map.Entry<String, String>> baggageItems() {
        return null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-application-toolkit/apm-toolkit-opentracing/src/main/java/org/apache/skywalking/apm/toolkit/opentracing/SkywalkingSpan.java`
#### Snippet
```java
    @Override
    public String getBaggageItem(String key) {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-application-toolkit/apm-toolkit-opentracing/src/main/java/org/apache/skywalking/apm/toolkit/opentracing/SkywalkingActiveSpan.java`
#### Snippet
```java
    @Override
    public String getBaggageItem(String key) {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/mysql-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/mysql/v5/define/AbstractMysqlInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/mysql-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/mysql/v5/define/AbstractMysqlInstrumentation.java`
#### Snippet
```java
    @Override
    public StaticMethodsInterceptPoint[] getStaticMethodsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/mysql-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/mysql/v5/define/AbstractMysqlInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/nats-2.14.x-2.15.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/nats/client/SubscriptionNextMsgInterceptor.java`
#### Snippet
```java
    public Object afterMethod(EnhancedInstance objInst, Method method, Object[] allArguments, Class<?>[] argumentsTypes, Object ret) throws Throwable {
        if (ret == null) {
            return null;
        }
        // set by  NatsSubscriptionConstructorInterceptor
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/nats-2.14.x-2.15.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/nats/client/WriterSendMessageBatchInterceptor.java`
#### Snippet
```java
    private NatsMessage next(Object message) throws IllegalAccessException {
        if (NEXT_FIELD == null) {
            return null;
        }
        if (!(message instanceof NatsMessage)) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/nats-2.14.x-2.15.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/nats/client/WriterSendMessageBatchInterceptor.java`
#### Snippet
```java
        }
        if (!(message instanceof NatsMessage)) {
            return null;
        }
        return (NatsMessage) NEXT_FIELD.get(message);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/nats-2.14.x-2.15.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/nats/client/NatsCommons.java`
#### Snippet
```java
    static MessageHandler buildTraceMsgHandler(String servers, MessageHandler msgHandler) {
        if (msgHandler == null) {
            return null;
        }
        return msg -> {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/httpclient-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/httpclient/v5/define/HttpAsyncClientInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/httpclient-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/httpclient/v5/define/IOSessionImplInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/httpclient-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/httpclient/v5/define/HttpClientInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/spring-plugins/mvc-annotation-commons/src/main/java/org/apache/skywalking/apm/plugin/spring/mvc/commons/ParsePathUtil.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-test-tools/src/main/java/org/apache/skywalking/apm/agent/test/helper/SegmentRefHelper.java`
#### Snippet
```java
        }

        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-test-tools/src/main/java/org/apache/skywalking/apm/agent/test/helper/SegmentRefHelper.java`
#### Snippet
```java
        }

        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-test-tools/src/main/java/org/apache/skywalking/apm/agent/test/helper/SegmentHelper.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-test-tools/src/main/java/org/apache/skywalking/apm/agent/test/helper/SpanHelper.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-test-tools/src/main/java/org/apache/skywalking/apm/agent/test/helper/SpanHelper.java`
#### Snippet
```java
        }

        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-test-tools/src/main/java/org/apache/skywalking/apm/agent/test/helper/SpanHelper.java`
#### Snippet
```java
        }

        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/cassandra-java-driver-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/cassandra/java/driver/v3/define/DefaultResultSetFutureInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/cassandra-java-driver-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/cassandra/java/driver/v3/define/SessionManagerInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/optional-reporter-plugins/kafka-reporter-plugin/src/main/java/org/apache/skywalking/apm/agent/core/kafka/KafkaProducerManager.java`
#### Snippet
```java
                                    TimeUnit.SECONDS
                            );
                            return null;
                        } catch (InterruptedException | ExecutionException | TimeoutException e) {
                            LOGGER.error(e, "Get KAFKA topic:{} error.", entry.getKey());
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/tomcat-10x-plugin/src/main/java/org/apache/skywalking/apm/plugin/tomcat10x/define/TomcatInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/resteasy-plugin/resteasy-server-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/resteasy/v4/server/define/SynchronousDispatcherInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/neo4j-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/neo4j/v4x/SessionAcquireConnectionInterceptor.java`
#### Snippet
```java
        return connectionStage.thenApply(connection -> {
            if (connection == null) {
                return null;
            }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/neo4j-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/neo4j/v4x/SessionBeginTransactionInterceptor.java`
#### Snippet
```java
        return transactionStage.thenApply(transaction -> {
            if (transaction == null) {
                return null;
            }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/redisson-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/redisson/v3/ConnectionManagerInterceptor.java`
#### Snippet
```java
        } else {
            LOGGER.warn("redisson not support this version");
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/pulsar-common/src/main/java/org/apache/skywalking/apm/plugin/pulsar/common/PulsarConsumerListenerInterceptor.java`
#### Snippet
```java
    public Object afterMethod(EnhancedInstance objInst, Method method, Object[] allArguments, Class<?>[] argumentsTypes,
            Object ret) throws Throwable {
        return ret == null ? null : (MessageListener) (consumer, message) -> {
            final MessageEnhanceRequiredInfo requiredInfo = (MessageEnhanceRequiredInfo) ((EnhancedInstance) message)
                    .getSkyWalkingDynamicField();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-logback-1.x-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/log/logback/v1/x/log/GRPCLogAppenderActivation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-logback-1.x-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/log/logback/v1/x/LogbackSkyWalkingContextPatternConverterActivation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-logback-1.x-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/log/logback/v1/x/LogbackPatternConverterActivation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-logback-1.x-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/log/logback/v1/x/mdc/MDCConverterActivation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-logback-1.x-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/log/logback/v1/x/logstash/TcpSocketAppenderActivation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-logback-1.x-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/log/logback/v1/x/logstash/TraceIdJsonProviderActivation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-logback-1.x-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/log/logback/v1/x/logstash/SkyWalkingContextJsonProviderActivation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-log4j-1.x-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/log/log4j/v1/x/TraceIdPatternConverterActivation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-log4j-1.x-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/log/log4j/v1/x/SkyWalkingContextPatternConverterActivation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-log4j-1.x-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/log/log4j/v1/x/log/GRPCLogAppenderActivation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/spring-plugins/core-patch/src/main/java/org/apache/skywalking/apm/plugin/spring/patch/AutowiredAnnotationProcessorInterceptor.java`
#### Snippet
```java
            }

            return candidateConstructors.length > 0 ? candidateConstructors : null;
        }
        return ret;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/httpClient-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/httpClient/v4/define/HttpClientInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-application-toolkit/apm-toolkit-meter/src/main/java/org/apache/skywalking/apm/toolkit/meter/BaseMeter.java`
#### Snippet
```java
     */
    public MeterId getMeterId() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-application-toolkit/apm-toolkit-meter/src/main/java/org/apache/skywalking/apm/toolkit/meter/MeterCenter.java`
#### Snippet
```java
     */
    public static BaseMeter removeMeter(MeterId id) {
        return null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/bootstrap-plugins/jdk-threading-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdk/threading/ThreadingConfig.java`
#### Snippet
```java

        if (jointPrefixes == null || jointPrefixes.trim().isEmpty()) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/bootstrap-plugins/jdk-threading-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdk/threading/ThreadingConfig.java`
#### Snippet
```java

        if (prefixMatches.size() == 0) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/bootstrap-plugins/jdk-threading-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdk/threading/define/RunnableInstrumentation.java`
#### Snippet
```java

        if (prefixMatches == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/bootstrap-plugins/jdk-threading-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdk/threading/define/CallableInstrumentation.java`
#### Snippet
```java

        if (prefixMatches == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/define/ServerTracingFilterInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/define/ClientTracingFilterInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/tomcat-7.x-8.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/tomcat78x/define/TomcatInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/mysql-6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/mysql/v6/define/AbstractMysqlInstrumentation.java`
#### Snippet
```java
    @Override
    public StaticMethodsInterceptPoint[] getStaticMethodsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/mysql-6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/mysql/v6/define/AbstractMysqlInstrumentation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/mysql-6.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/jdbc/mysql/v6/define/AbstractMysqlInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/CodecUtils.java`
#### Snippet
```java
            return decodeStringFromBytes(bytes);
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/httpclient-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/httpclient/v3/define/HttpClientInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/optional-plugins/customize-enhance-plugin/src/main/java/org/apache/skywalking/apm/plugin/customize/conf/CustomizeConfiguration.java`
#### Snippet
```java
            LOGGER.error(e, "Failed to resolver, className is {}, methodDesc is {}.", className, methodDesc);
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/jvm/gc/G1GCModule.java`
#### Snippet
```java
    @Override
    protected String getNormalGCName() {
        return null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/jvm/gc/GCProvider.java`
#### Snippet
```java
        } else {
            // Unknown
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/jvm/gc/ZGCModule.java`
#### Snippet
```java
    @Override
    protected String getOldGCName() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/jvm/gc/ZGCModule.java`
#### Snippet
```java
    @Override
    protected String getNewGCName() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/jvm/gc/ParallelGCModule.java`
#### Snippet
```java
    @Override
    protected String getNormalGCName() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/jvm/gc/CMSGCModule.java`
#### Snippet
```java
    @Override
    protected String getNormalGCName() {
        return null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/jvm/gc/SerialGCModule.java`
#### Snippet
```java
    @Override
    protected String getNormalGCName() {
        return null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/jvm/memorypool/MemoryPoolProvider.java`
#### Snippet
```java
        } else {
            // Unknown
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/util/CustomizeExpression.java`
#### Snippet
```java
    private static Object matcherArray(String expression, Object o) {
        int index = Integer.parseInt(expression.replace("[", "").replace("]", ""));
        return o != null && Array.getLength(o) > index ? Array.get(o, index) : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/util/CustomizeExpression.java`
#### Snippet
```java
            LOGGER.debug("matcher default error, expression is {}, object is {}, expression is {}", expression, o, e.getMessage());
        }
        return null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/util/CustomizeExpression.java`
#### Snippet
```java
        int index = Integer.parseInt(expression.replace("[", "").replace("]", ""));
        List l = (List) o;
        return l != null && l.size() > index ? l.get(index) : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/meter/BaseMeter.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/meter/MeterService.java`
#### Snippet
```java
    public <T extends BaseMeter> T register(T meter) {
        if (meter == null) {
            return null;
        }
        if (meterMap.size() >= Config.Meter.MAX_METER_SIZE) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/meter/Histogram.java`
#### Snippet
```java
        low -= 1;

        return low < buckets.length && low >= 0 ? buckets[low] : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/meter/Gauge.java`
#### Snippet
```java
        } catch (Exception e) {
            LOGGER.warn(e, "Cannot get the count in meter:{}", meterId.getName());
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/PluginResourcesResolver.java`
#### Snippet
```java
            LOGGER.error("read resources failure.", e);
        }
        return null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/AbstractClassEnhancePluginDefine.java`
#### Snippet
```java

    protected List<WitnessMethod> witnessMethods() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/AbstractClassEnhancePluginDefine.java`
#### Snippet
```java
        if (StringUtil.isEmpty(transformClassName)) {
            LOGGER.warn("classname of being intercepted is not defined by {}.", interceptorDefineClassName);
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/AbstractClassEnhancePluginDefine.java`
#### Snippet
```java
                if (!finder.exist(witnessClass, classLoader)) {
                    LOGGER.warn("enhance class {} by plugin {} is not activated. Witness class {} does not exist.", transformClassName, interceptorDefineClassName, witnessClass);
                    return null;
                }
            }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/AbstractClassEnhancePluginDefine.java`
#### Snippet
```java
                if (!finder.exist(witnessMethod, classLoader)) {
                    LOGGER.warn("enhance class {} by plugin {} is not activated. Witness method {} does not exist.", transformClassName, interceptorDefineClassName, witnessMethod);
                    return null;
                }
            }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/loader/AgentClassLoader.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/ClassInstanceMethodsEnhancePluginDefine.java`
#### Snippet
```java
    @Override
    public StaticMethodsInterceptPoint[] getStaticMethodsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/bytebuddy/CacheableTransformerDecorator.java`
#### Snippet
```java
                }
            }
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/ClassStaticMethodsEnhancePluginDefine.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/ClassStaticMethodsEnhancePluginDefine.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/BootstrapInterRuntimeAssist.java`
#### Snippet
```java
        } catch (Exception e) {
            e.printStackTrace(OUT);
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/BootstrapInterRuntimeAssist.java`
#### Snippet
```java
            log.error(e, "Interceptor[{}] not found", className);
        }
        return null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/BootstrapInterRuntimeAssist.java`
#### Snippet
```java
            ClassLoader loader = Thread.currentThread().getContextClassLoader();
            if (loader == null) {
                return null;
            }
            Class<?> agentClassLoaderClass = Class.forName(AGENT_CLASSLOADER_DEFAULT, true, loader);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/BootstrapInterRuntimeAssist.java`
#### Snippet
```java
        } catch (Exception e) {
            e.printStackTrace(OUT);
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/v2/ClassEnhancePluginDefineV2.java`
#### Snippet
```java
    @Override
    public StaticMethodsInterceptPoint[] getStaticMethodsInterceptPoints() {
        return null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/v2/ClassEnhancePluginDefineV2.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/v2/ClassStaticMethodsEnhancePluginDefineV2.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/v2/ClassStaticMethodsEnhancePluginDefineV2.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptV2Point[] getInstanceMethodsInterceptV2Points() {
        return null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/v2/ClassInstanceMethodsEnhancePluginDefineV2.java`
#### Snippet
```java
    @Override
    public StaticMethodsInterceptV2Point[] getStaticMethodsInterceptV2Points() {
        return null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/ClassEnhancePluginDefine.java`
#### Snippet
```java
    @Override
    public StaticMethodsInterceptV2Point[] getStaticMethodsInterceptV2Points() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/ClassEnhancePluginDefine.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptV2Point[] getInstanceMethodsInterceptV2Points() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/IgnoredTracerContext.java`
#### Snippet
```java
    @Override
    public String getPrimaryEndpointName() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/ContextManager.java`
#### Snippet
```java
        final AbstractTracerContext tracerContext = get();
        if (tracerContext == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/ContextManager.java`
#### Snippet
```java
    public static String getPrimaryEndpointName() {
        AbstractTracerContext context = CONTEXT.get();
        return Objects.nonNull(context) ? context.getPrimaryEndpointName() : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/TracingContext.java`
#### Snippet
```java
    private AbstractSpan peek() {
        if (activeSpanStack.isEmpty()) {
            return null;
        }
        return activeSpanStack.getLast();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/profile/ThreadProfiler.java`
#### Snippet
```java
    public TracingThreadSnapshot buildSnapshot() {
        if (!isProfilingContinuable()) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/profile/ThreadProfiler.java`
#### Snippet
```java
            // stack depth is zero, means thread is already run finished
            if (stackTrace.length == 0) {
                return null;
            }
        } catch (Exception e) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/profile/ThreadProfiler.java`
#### Snippet
```java
        } catch (Exception e) {
            // dump error ignore and make this profiler stop
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/profile/ThreadProfiler.java`
#### Snippet
```java
        // if is first dump, check is can start profiling
        if (dumpSequence == 0 && (!executionContext.isStartProfileable())) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/FileWriter.java`
#### Snippet
```java
                public Object call() throws Exception {
                    fileOutputStream = null;
                    return null;
                }
            });
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/FileWriter.java`
#### Snippet
```java
                    new File(Config.Logging.DIR, Config.Logging.FILE_NAME).renameTo(new File(Config.Logging.DIR, Config.Logging.FILE_NAME + new SimpleDateFormat(".yyyy_MM_dd_HH_mm_ss")
                        .format(new Date())));
                    return null;
                }
            });
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/FileWriter.java`
#### Snippet
```java
                public Object call() throws Exception {
                    fileOutputStream.close();
                    return null;
                }
            });
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/FileWriter.java`
#### Snippet
```java
                public Object call() throws Exception {
                    fileOutputStream.flush();
                    return null;
                }
            });
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/bootstrap-plugins/jdk-threadpool-plugin/src/main/java/org/apache/skywalking/apm/plugin/ThreadPoolSubmitMethodInterceptor.java`
#### Snippet
```java
    public Object wrap(Object param) {
        if (param instanceof SwRunnableWrapper || param instanceof SwCallableWrapper) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/bootstrap-plugins/jdk-threadpool-plugin/src/main/java/org/apache/skywalking/apm/plugin/ThreadPoolSubmitMethodInterceptor.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/bootstrap-plugins/jdk-threadpool-plugin/src/main/java/org/apache/skywalking/apm/plugin/ThreadPoolExecuteMethodInterceptor.java`
#### Snippet
```java
    public Object wrap(Object param) {
        if (param instanceof SwRunnableWrapper) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/bootstrap-plugins/jdk-threadpool-plugin/src/main/java/org/apache/skywalking/apm/plugin/ThreadPoolExecuteMethodInterceptor.java`
#### Snippet
```java

        if (param instanceof RunnableFuture) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/bootstrap-plugins/jdk-threadpool-plugin/src/main/java/org/apache/skywalking/apm/plugin/ThreadPoolExecuteMethodInterceptor.java`
#### Snippet
```java

        if (!(param instanceof Runnable)) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/IgnoredExceptionAnnotationActivation.java`
#### Snippet
```java
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-toolkit-activation/apm-toolkit-trace-activation/src/main/java/org/apache/skywalking/apm/toolkit/activation/trace/ActiveSpanSetOperationNameInterceptor.java`
#### Snippet
```java
                              final Class<?>[] parameterTypes,
                              final Object ret) {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/resteasy-plugin/resteasy-server-3.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/resteasy/v3/server/define/SynchronousDispatcherInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/light4j-plugins/light4j-plugin/src/main/java/org/apache/skywalking/apm/plugin/light4j/define/LightInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `apm-sniffer/apm-sdk-plugin/dubbo-plugin/src/main/java/org/apache/skywalking/apm/plugin/dubbo/DubboInstrumentation.java`
#### Snippet
```java
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

```

## RuleId[ruleID=UnnecessaryLocalVariable]
### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `requestURI` is redundant
in `apm-sniffer/apm-sdk-plugin/httpclient-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/httpclient/v5/HttpClientDoExecuteInterceptor.java`
#### Snippet
```java

        String uri = httpRequest.getUri().toString();
        String requestURI = getRequestURI(uri);
        String operationName = requestURI;
        AbstractSpan span = ContextManager.createExitSpan(operationName, contextCarrier, remotePeer);
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `operationName` is redundant
in `apm-sniffer/apm-sdk-plugin/httpclient-5.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/httpclient/v5/HttpClientDoExecuteInterceptor.java`
#### Snippet
```java
        String uri = httpRequest.getUri().toString();
        String requestURI = getRequestURI(uri);
        String operationName = requestURI;
        AbstractSpan span = ContextManager.createExitSpan(operationName, contextCarrier, remotePeer);

```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `meterId` is redundant
in `apm-application-toolkit/apm-toolkit-micrometer-registry/src/main/java/org/apache/skywalking/apm/meter/micrometer/MeterBuilder.java`
#### Snippet
```java
        }
        final List<MeterId.Tag> tags = id.getTags().stream().map(t -> new MeterId.Tag(t.getKey(), t.getValue())).collect(Collectors.toList());
        final MeterId meterId = new MeterId(name, type, tags);
        return meterId;
    }
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `requestURI` is redundant
in `apm-sniffer/apm-sdk-plugin/httpClient-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/httpClient/v4/HttpClientExecuteInterceptor.java`
#### Snippet
```java

        String uri = httpRequest.getRequestLine().getUri();
        String requestURI = getRequestURI(uri);
        String operationName = requestURI;
        AbstractSpan span = ContextManager.createExitSpan(operationName, contextCarrier, remotePeer);
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `operationName` is redundant
in `apm-sniffer/apm-sdk-plugin/httpClient-4.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/httpClient/v4/HttpClientExecuteInterceptor.java`
#### Snippet
```java
        String uri = httpRequest.getRequestLine().getUri();
        String requestURI = getRequestURI(uri);
        String operationName = requestURI;
        AbstractSpan span = ContextManager.createExitSpan(operationName, contextCarrier, remotePeer);

```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `abstractSpan` is redundant
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/FinagleCtxs.java`
#### Snippet
```java
    static AbstractSpan getSpan() {
        if (Contexts.local().contains(SW_SPAN)) {
            AbstractSpan abstractSpan = Contexts.local().apply(SW_SPAN);
            return abstractSpan;
        }
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `swContextCarrier` is redundant
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/FinagleCtxs.java`
#### Snippet
```java
    static SWContextCarrier getSWContextCarrier() {
        if (Contexts.broadcast().contains(SWContextCarrier$.MODULE$)) {
            SWContextCarrier swContextCarrier = Contexts.broadcast().apply(SWContextCarrier$.MODULE$);
            return swContextCarrier;
        }
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `peerHost` is redundant
in `apm-sniffer/apm-sdk-plugin/finagle-6.25.x-plugin/src/main/java/org/apache/skywalking/apm/plugin/finagle/FinagleCtxs.java`
#### Snippet
```java
    static String getPeerHost() {
        if (Contexts.local().contains(PEER_HOST)) {
            String peerHost = Contexts.local().apply(PEER_HOST);
            return peerHost;
        }
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `defaultAgentClassLoader` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/plugin/interceptor/enhance/BootstrapInterRuntimeAssist.java`
#### Snippet
```java
            Field defaultLoaderField = agentClassLoaderClass.getDeclaredField(DEFAULT_AGENT_CLASSLOADER_INSTANCE);
            defaultLoaderField.setAccessible(true);
            ClassLoader defaultAgentClassLoader = (ClassLoader) defaultLoaderField.get(null);

            return defaultAgentClassLoader;
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `snapshot` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/context/TracingContext.java`
#### Snippet
```java
    @Override
    public ContextSnapshot capture() {
        ContextSnapshot snapshot = new ContextSnapshot(
            segment.getTraceSegmentId(),
            activeSpan().getSpanId(),
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `pathArr` is redundant
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/logging/core/FileWriter.java`
#### Snippet
```java
    private String[] getHistoryFilePath() {
        File path = new File(Config.Logging.DIR);
        String[] pathArr = path.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
```

## RuleId[ruleID=BusyWait]
### RuleId[ruleID=BusyWait]
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `apm-commons/apm-datacarrier/src/main/java/org/apache/skywalking/apm/commons/datacarrier/consumer/MultipleChannelsConsumer.java`
#### Snippet
```java
            if (!hasData) {
                try {
                    Thread.sleep(consumeCycle);
                } catch (InterruptedException e) {
                }
```

### RuleId[ruleID=BusyWait]
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `apm-commons/apm-datacarrier/src/main/java/org/apache/skywalking/apm/commons/datacarrier/consumer/ConsumerThread.java`
#### Snippet
```java
            if (!consume(consumeList)) {
                try {
                    Thread.sleep(consumeCycle);
                } catch (InterruptedException e) {
                }
```

### RuleId[ruleID=BusyWait]
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `apm-sniffer/apm-agent-core/src/main/java/org/apache/skywalking/apm/agent/core/profile/ProfileThread.java`
#### Snippet
```java
            long needToSleep = (currentLoopStartTime + maxSleepPeriod) - System.currentTimeMillis();
            needToSleep = needToSleep > 0 ? needToSleep : maxSleepPeriod;
            Thread.sleep(needToSleep);
        }
    }
```

## RuleId[ruleID=UseBulkOperation]
### RuleId[ruleID=UseBulkOperation]
Iteration can be replaced with bulk 'Collection.addAll()' call
in `apm-commons/apm-datacarrier/src/main/java/org/apache/skywalking/apm/commons/datacarrier/consumer/MultipleChannelsConsumer.java`
#### Snippet
```java
        ArrayList<Group> newList = new ArrayList<Group>();
        for (Group target : consumeTargets) {
            newList.add(target);
        }
        newList.add(group);
```

