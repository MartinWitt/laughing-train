# ApplicationInsights-Java 
 
# Bad smells
I found 748 bad smells with 70 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DataFlowIssue | 124 | false |
| BoundedWildcard | 103 | false |
| NullableProblems | 56 | false |
| SystemOutErr | 56 | false |
| AssignmentToMethodParameter | 47 | false |
| UtilityClassWithoutPrivateConstructor | 44 | true |
| NonSerializableFieldInSerializableClass | 29 | false |
| RedundantFieldInitialization | 24 | false |
| UnnecessaryFullyQualifiedName | 23 | false |
| DeprecatedIsStillUsed | 21 | false |
| EmptyStatementBody | 18 | false |
| DoubleBraceInitialization | 17 | false |
| Convert2Lambda | 17 | false |
| AbstractClassNeverImplemented | 15 | false |
| AssignmentToStaticFieldFromInstanceMethod | 13 | false |
| SizeReplaceableByIsEmpty | 11 | true |
| UnusedAssignment | 10 | false |
| DynamicRegexReplaceableByCompiledPattern | 10 | false |
| ThrowablePrintStackTrace | 9 | false |
| ParameterCanBeLocal | 8 | false |
| ReturnNull | 8 | false |
| IgnoreResultOfCall | 6 | false |
| ZeroLengthArrayInitialization | 6 | false |
| IOResource | 6 | false |
| UnnecessaryLocalVariable | 6 | true |
| FieldAccessedSynchronizedAndUnsynchronized | 5 | false |
| EmptyMethod | 5 | false |
| CodeBlock2Expr | 4 | true |
| Convert2MethodRef | 4 | false |
| UnnecessaryToStringCall | 4 | true |
| CommentedOutCode | 3 | false |
| HasPlatformType | 3 | false |
| PropertyName | 3 | false |
| ThreadDumpStack | 2 | false |
| NestedAssignment | 2 | false |
| ConstantValue | 2 | false |
| Anonymous2MethodRef | 2 | false |
| BusyWait | 2 | false |
| UnnecessaryModifier | 1 | true |
| WhileCanBeForeach | 1 | false |
| RegExpRedundantEscape | 1 | false |
| NonShortCircuitBoolean | 1 | false |
| FunctionalExpressionCanBeFolded | 1 | false |
| UnnecessaryUnboxing | 1 | false |
| ClassNameSameAsAncestorName | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| SynchronizeOnThis | 1 | false |
| StringConcatenationInsideStringBufferAppend | 1 | false |
| OptionalIsPresent | 1 | false |
| CollectionContainsUrl | 1 | false |
| AssignmentToForLoopParameter | 1 | false |
| SetReplaceableByEnumSet | 1 | false |
| ForEachParameterNotUsed | 1 | false |
| PublicFieldAccessedInSynchronizedContext | 1 | false |
| RedundantSuppression | 1 | false |
| CopyConstructorMissesField | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
| UnstableApiUsage | 1 | false |
## RuleId[ruleID=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `etw/java/src/main/java/com/microsoft/applicationinsights/agent/bootstrap/diagnostics/etw/events/model/IpaEtwEventId.java`
#### Snippet
```java
  private final int idValue;

  private IpaEtwEventId(int idValue) {
    this.idValue = idValue;
  }
```

## RuleId[ruleID=EmptyStatementBody]
### EmptyStatementBody
`while` statement has empty body
in `smoke-tests/apps/Jdbc/src/main/java/com/microsoft/applicationinsights/smoketestapp/JdbcServlet.java`
#### Snippet
```java
    Statement statement = connection.createStatement();
    ResultSet rs = statement.executeQuery("select * from abc where xyz = 'y'");
    while (rs.next()) {}
    rs.close();
    statement.close();
```

### EmptyStatementBody
`while` statement has empty body
in `smoke-tests/apps/Jdbc/src/main/java/com/microsoft/applicationinsights/smoketestapp/JdbcServlet.java`
#### Snippet
```java
    ps.setString(1, "y");
    ResultSet rs = ps.executeQuery();
    while (rs.next()) {}
    rs.close();
    ps.close();
```

### EmptyStatementBody
`while` statement has empty body
in `smoke-tests/apps/Jdbc/src/main/java/com/microsoft/applicationinsights/smoketestapp/JdbcServlet.java`
#### Snippet
```java
    String query = "select * from abc" + largeStr;
    ResultSet rs = statement.executeQuery(query);
    while (rs.next()) {}
    rs.close();
    statement.close();
```

### EmptyStatementBody
`while` statement has empty body
in `smoke-tests/apps/Sampling/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/SamplingTest.java`
#### Snippet
```java
    // super super low chance that number of sampled requests is less than 25
    long start = System.nanoTime();
    while (testing.mockedIngestion.getCountForType("RequestData") < 25
        && NANOSECONDS.toSeconds(System.nanoTime() - start) < 10) {}
    // wait ten more seconds before checking that we didn't receive too many
```

### EmptyStatementBody
`while` statement has empty body
in `smoke-tests/apps/HttpHeaders/src/main/java/com/microsoft/applicationinsights/smoketestapp/TestController.java`
#### Snippet
```java
    // drain the content
    byte[] buffer = new byte[1024];
    while (content.read(buffer) != -1) {}
    content.close();
  }
```

### EmptyStatementBody
`while` statement has empty body
in `smoke-tests/apps/RoleNameOverrides/src/main/java/com/microsoft/applicationinsights/smoketestapp/RoleNameOverridesServlet.java`
#### Snippet
```java
    // drain the content
    byte[] buffer = new byte[1024];
    while (content.read(buffer) != -1) {}
    content.close();
  }
```

### EmptyStatementBody
`while` statement has empty body
in `smoke-tests/apps/SamplingOverrides/src/main/java/com/microsoft/applicationinsights/smoketestapp/SamplingOverridesServlet.java`
#### Snippet
```java
    Statement statement = connection.createStatement();
    ResultSet rs = statement.executeQuery("select * from abc");
    while (rs.next()) {}
    rs.close();
    statement.close();
```

### EmptyStatementBody
`while` statement has empty body
in `smoke-tests/apps/SamplingOverrides/src/main/java/com/microsoft/applicationinsights/smoketestapp/SamplingOverridesServlet.java`
#### Snippet
```java
    Statement statement = connection.createStatement();
    ResultSet rs = statement.executeQuery("select count(*) from abc");
    while (rs.next()) {}
    rs.close();
    statement.close();
```

### EmptyStatementBody
`while` statement has empty body
in `smoke-tests/apps/SamplingOverrides/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/SamplingOverridesTest.java`
#### Snippet
```java
    // super super low chance that number of sampled requests is less than 25
    long start = System.nanoTime();
    while (testing.mockedIngestion.getCountForType("RequestData") < 25
        && NANOSECONDS.toSeconds(System.nanoTime() - start) < 10) {}
    // wait ten more seconds to before checking that we didn't receive too many
```

### EmptyStatementBody
`while` statement has empty body
in `smoke-tests/apps/HttpClients/src/main/java/com/microsoft/applicationinsights/smoketestapp/HttpClientServlet.java`
#### Snippet
```java
    // drain the content
    byte[] buffer = new byte[1024];
    while (content.read(buffer) != -1) {}
    content.close();
  }
```

### EmptyStatementBody
`while` statement has empty body
in `smoke-tests/apps/HttpPreaggregatedMetrics/src/main/java/com/microsoft/applicationinsights/smoketestapp/HttpPreaggregatedMetricsServlet.java`
#### Snippet
```java
    // drain the content
    byte[] buffer = new byte[1024];
    while (content.read(buffer) != -1) {}
    content.close();
  }
```

### EmptyStatementBody
`while` statement has empty body
in `smoke-tests/apps/ConnectionStringOverrides/src/main/java/com/microsoft/applicationinsights/smoketestapp/ConnectionStringOverridesServlet.java`
#### Snippet
```java
    // drain the content
    byte[] buffer = new byte[1024];
    while (content.read(buffer) != -1) {}
    content.close();
  }
```

### EmptyStatementBody
`while` statement has empty body
in `smoke-tests/apps/InstrumentationKeyOverrides/src/main/java/com/microsoft/applicationinsights/smoketestapp/InstrumentationKeyOverridesServlet.java`
#### Snippet
```java
    // drain the content
    byte[] buffer = new byte[1024];
    while (content.read(buffer) != -1) {}
    content.close();
  }
```

### EmptyStatementBody
`while` statement has empty body
in `smoke-tests/apps/SamplingOverridesBackCompat/src/main/java/com/microsoft/applicationinsights/smoketestapp/SamplingOverridesBackCompatServlet.java`
#### Snippet
```java
    Statement statement = connection.createStatement();
    ResultSet rs = statement.executeQuery("select count(*) from abc");
    while (rs.next()) {}
    rs.close();
    statement.close();
```

### EmptyStatementBody
`while` statement has empty body
in `smoke-tests/apps/SamplingOverridesBackCompat/src/main/java/com/microsoft/applicationinsights/smoketestapp/SamplingOverridesBackCompatServlet.java`
#### Snippet
```java
    Statement statement = connection.createStatement();
    ResultSet rs = statement.executeQuery("select * from abc");
    while (rs.next()) {}
    rs.close();
    statement.close();
```

### EmptyStatementBody
`while` statement has empty body
in `smoke-tests/apps/SamplingOverridesBackCompat/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/SamplingOverridesBackCompatTest.java`
#### Snippet
```java
    // super super low chance that number of sampled requests is less than 25
    long start = System.nanoTime();
    while (testing.mockedIngestion.getCountForType("RequestData") < 25
        && NANOSECONDS.toSeconds(System.nanoTime() - start) < 10) {}
    // wait ten more seconds to before checking that we didn't receive too many
```

### EmptyStatementBody
`while` statement has empty body
in `smoke-tests/apps/PreAggMetricsWithRoleNameOverridesAndSampling/src/main/java/com/microsoft/applicationinsights/smoketestapp/PreAggMetricsWithRoleNameOverridesAndSamplingServlet.java`
#### Snippet
```java
    // drain the content
    byte[] buffer = new byte[1024];
    while (content.read(buffer) != -1) {}
    content.close();
  }
```

### EmptyStatementBody
`while` statement has empty body
in `smoke-tests/apps/PreAggMetricsWithRoleNameOverridesAndSampling/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/PreAggMetricsWithRoleNameOverridesAndSamplingTest.java`
#### Snippet
```java
    // super super low chance that number of sampled requests is less than 25
    long start = System.nanoTime();
    while (testing.mockedIngestion.getCountForType("RequestData") < 25
        && NANOSECONDS.toSeconds(System.nanoTime() - start) < 10) {}
    // wait ten more seconds before checking that we didn't receive too many
```

## RuleId[ruleID=WhileCanBeForeach]
### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `smoke-tests/apps/MongoDB/src/main/java/com/microsoft/applicationinsights/smoketestapp/MongoServlet.java`
#### Snippet
```java
    MongoCollection<Document> collection = database.getCollection("test");
    MongoCursor<Document> i = collection.find().iterator();
    while (i.hasNext()) {
      i.next();
    }
```

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `BytecodeUtilImpl.samplingPercentage` from instance context
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/RpConfigurationPolling.java`
#### Snippet
```java
          DelegatingSampler.getInstance().setDelegate(Samplers.getSampler(configuration));
          if (configuration.sampling.percentage != null) {
            BytecodeUtilImpl.samplingPercentage = configuration.sampling.percentage.floatValue();
          } else {
            BytecodeUtilImpl.samplingPercentage = 100;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `BytecodeUtilImpl.samplingPercentage` from instance context
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/RpConfigurationPolling.java`
#### Snippet
```java
            BytecodeUtilImpl.samplingPercentage = configuration.sampling.percentage.floatValue();
          } else {
            BytecodeUtilImpl.samplingPercentage = 100;
          }
        }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `agentVersion` from instance context
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/FirstEntryPoint.java`
#### Snippet
```java
      Path agentPath = javaagentFile.toPath();
      // need to initialize version before initializing DiagnosticsHelper
      agentVersion = SdkVersionFinder.initVersion(agentPath);
      DiagnosticsHelper.setAgentJarFile(agentPath);
      // configuration is only read this early in order to extract logging configuration
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `rpConfiguration` from instance context
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/FirstEntryPoint.java`
#### Snippet
```java
      DiagnosticsHelper.setAgentJarFile(agentPath);
      // configuration is only read this early in order to extract logging configuration
      rpConfiguration = RpConfigurationBuilder.create(agentPath);
      configuration = ConfigurationBuilder.create(agentPath, rpConfiguration);

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `configuration` from instance context
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/FirstEntryPoint.java`
#### Snippet
```java
      // configuration is only read this early in order to extract logging configuration
      rpConfiguration = RpConfigurationBuilder.create(agentPath);
      configuration = ConfigurationBuilder.create(agentPath, rpConfiguration);

      String codelessSdkNamePrefix = getCodelessSdkNamePrefix();
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `startupLogger` from instance context
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/FirstEntryPoint.java`
#### Snippet
```java
        PropertyHelper.setSdkNamePrefix(codelessSdkNamePrefix);
      }
      startupLogger = configureLogging(configuration.selfDiagnostics, agentPath);
      ConfigurationBuilder.logConfigurationWarnMessages();

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `LazyHttpClient.proxyHost` from instance context
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/SecondEntryPoint.java`
#### Snippet
```java

    if (configuration.proxy.host != null) {
      LazyHttpClient.proxyHost = configuration.proxy.host;
      LazyHttpClient.proxyPortNumber = configuration.proxy.port;
      LazyHttpClient.proxyUsername = configuration.proxy.username;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `LazyHttpClient.proxyPortNumber` from instance context
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/SecondEntryPoint.java`
#### Snippet
```java
    if (configuration.proxy.host != null) {
      LazyHttpClient.proxyHost = configuration.proxy.host;
      LazyHttpClient.proxyPortNumber = configuration.proxy.port;
      LazyHttpClient.proxyUsername = configuration.proxy.username;
      LazyHttpClient.proxyPassword = configuration.proxy.password;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `LazyHttpClient.proxyUsername` from instance context
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/SecondEntryPoint.java`
#### Snippet
```java
      LazyHttpClient.proxyHost = configuration.proxy.host;
      LazyHttpClient.proxyPortNumber = configuration.proxy.port;
      LazyHttpClient.proxyUsername = configuration.proxy.username;
      LazyHttpClient.proxyPassword = configuration.proxy.password;
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `LazyHttpClient.proxyPassword` from instance context
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/SecondEntryPoint.java`
#### Snippet
```java
      LazyHttpClient.proxyPortNumber = configuration.proxy.port;
      LazyHttpClient.proxyUsername = configuration.proxy.username;
      LazyHttpClient.proxyPassword = configuration.proxy.password;
    }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `BytecodeUtilImpl.samplingPercentage` from instance context
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/SecondEntryPoint.java`
#### Snippet
```java

    if (configuration.sampling.percentage != null) {
      BytecodeUtilImpl.samplingPercentage = configuration.sampling.percentage.floatValue();
    } else {
      BytecodeUtilImpl.samplingPercentage = 100;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `BytecodeUtilImpl.samplingPercentage` from instance context
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/SecondEntryPoint.java`
#### Snippet
```java
      BytecodeUtilImpl.samplingPercentage = configuration.sampling.percentage.floatValue();
    } else {
      BytecodeUtilImpl.samplingPercentage = 100;
    }
    BytecodeUtilImpl.featureStatsbeat = statsbeatModule.getFeatureStatsbeat();
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `BytecodeUtilImpl.featureStatsbeat` from instance context
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/SecondEntryPoint.java`
#### Snippet
```java
      BytecodeUtilImpl.samplingPercentage = 100;
    }
    BytecodeUtilImpl.featureStatsbeat = statsbeatModule.getFeatureStatsbeat();

    // appId is still used by the profiling service
```

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/AiConfigCustomizer.java`
#### Snippet
```java
      properties.put("otel.instrumentation.ai-micrometer.enabled", "true");
      properties.put("otel.instrumentation.ai-actuator-metrics.enabled", "true");
      // properties.put("otel.instrumentation.micrometer.enabled", "true");
      // properties.put("otel.instrumentation.spring-boot-actuator-autoconfigure.enabled", "true");
    }
```

### CommentedOutCode
Commented out code (258 lines)
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/classicsdk/TelemetryClientClassFileTransformer.java`
#### Snippet
```java
  //   implementation("org.ow2.asm:asm-util:9.3")
  //
  /*
  @SuppressWarnings("UnnecessarilyFullyQualified")
  public static void main(String[] args) throws Exception {
```

### CommentedOutCode
Commented out code (4 lines)
in `smoke-tests/apps/OpenTelemetryApiSupport/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/OpenTelemetryApiSupportTest.java`
#### Snippet
```java
    // these are no longer supported since 3.4.0, but the test is still included here to (manually)
    // inspect that appropriate warning log about it no longer being supported is emitted
    //
    // assertThat(telemetry.rdEnvelope.getIKey()).isEqualTo("12341234-1234-1234-1234-123412341234");
    // assertThat(telemetry.rdEnvelope.getTags()).containsEntry("ai.cloud.role", "role-name-here");
```

## RuleId[ruleID=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java

  public static class MaskAttribute {
    private static final Pattern replacePattern = Pattern.compile("\\$\\{[A-Za-z1-9]*\\}*");
    public final Pattern pattern;
    public final List<String> groupNames;
```

## RuleId[ruleID=ThreadDumpStack]
### ThreadDumpStack
Call to `Thread.dumpStack()` should probably be replaced with more robust logging
in `agent/agent-bootstrap/src/main/java/com/microsoft/applicationinsights/agent/bootstrap/BytecodeUtil.java`
#### Snippet
```java
    if (startNanos == null) {
      System.out.println("Signed jar access (no timing available)");
      Thread.dumpStack();
    } else {
      long durationNanos = System.nanoTime() - startNanos;
```

### ThreadDumpStack
Call to `Thread.dumpStack()` should probably be replaced with more robust logging
in `agent/agent-bootstrap/src/main/java/com/microsoft/applicationinsights/agent/bootstrap/BytecodeUtil.java`
#### Snippet
```java
        System.out.println(
            "Signed jar access (" + NANOSECONDS.toMillis(durationNanos) + " milliseconds)");
        Thread.dumpStack();
      }
    }
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`diagnosticBuilder.length() == 0` can be replaced with 'diagnosticBuilder.isEmpty()'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/StartupDiagnostics.java`
#### Snippet
```java

    boolean isEmpty() {
      return diagnosticBuilder.length() == 0;
    }

```

### SizeReplaceableByIsEmpty
`sb.length() > 0` can be replaced with '!sb.isEmpty()'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/AiConfigCustomizer.java`
#### Snippet
```java
    StringBuilder sb = new StringBuilder();
    for (Object val : values) {
      if (sb.length() > 0) {
        sb.append(separator);
      }
```

### SizeReplaceableByIsEmpty
`sb.length() > 0` can be replaced with '!sb.isEmpty()'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/AiConfigCustomizer.java`
#### Snippet
```java
      for (Configuration.CustomInstrumentation customInstrumentation :
          configuration.preview.customInstrumentation) {
        if (sb.length() > 0) {
          sb.append(';');
        }
```

### SizeReplaceableByIsEmpty
`separator.length() > 0` can be replaced with '!separator.isEmpty()'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/processors/SpanProcessor.java`
#### Snippet
```java
      }
      // Removing the last appended separator
      if (separator.length() > 0) {
        updatedSpanBuffer.setLength(updatedSpanBuffer.length() - separator.length());
      }
```

### SizeReplaceableByIsEmpty
`separator.length() > 0` can be replaced with '!separator.isEmpty()'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/processors/LogProcessor.java`
#### Snippet
```java
      }
      // Removing the last appended separator
      if (separator.length() > 0) {
        updatedLogBuffer.setLength(updatedLogBuffer.length() - separator.length());
      }
```

### SizeReplaceableByIsEmpty
`buckets.size() > 0` can be replaced with '!buckets.isEmpty()'
in `agent/agent-profiler/agent-alerting/src/main/java/com/microsoft/applicationinsights/alerting/analysis/aggregations/windowed/WindowedAggregation.java`
#### Snippet
```java
    synchronized (bucketLock) {
      // Remove buckets that ended before the cutoff
      while (buckets.size() > 0 && buckets.get(0).getBucketEnd().isBefore(cutoff)) {
        buckets.remove(0);
      }
```

### SizeReplaceableByIsEmpty
`stringBuilder.length() != 0` can be replaced with '!stringBuilder.isEmpty()'
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/TracestateBuilder.java`
#### Snippet
```java
  @Override
  public void accept(String key, String value) {
    if (stringBuilder.length() != 0) {
      stringBuilder.append(',');
    }
```

### SizeReplaceableByIsEmpty
`sb.length() > 0` can be replaced with '!sb.isEmpty()'
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/SpanDataMapper.java`
#### Snippet
```java
    StringBuilder sb = new StringBuilder();
    for (Object val : values) {
      if (sb.length() > 0) {
        sb.append(", ");
      }
```

### SizeReplaceableByIsEmpty
`exceptionList.size() > 0` can be replaced with '!exceptionList.isEmpty()'
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/quickpulse/QuickPulseDataCollector.java`
#### Snippet
```java
    List<TelemetryExceptionDetails> exceptionList = exceptionData.getExceptions();
    StringBuilder exceptions = new StringBuilder();
    if (exceptionList != null && exceptionList.size() > 0) {
      List<StackFrame> parsedStack = exceptionList.get(0).getParsedStack();
      String stack = exceptionList.get(0).getStack();
```

### SizeReplaceableByIsEmpty
`parsedStack.size() > 0` can be replaced with '!parsedStack.isEmpty()'
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/quickpulse/QuickPulseDataCollector.java`
#### Snippet
```java
      List<StackFrame> parsedStack = exceptionList.get(0).getParsedStack();
      String stack = exceptionList.get(0).getStack();
      if (parsedStack != null && parsedStack.size() > 0) {
        for (StackFrame stackFrame : parsedStack) {
          if (stackFrame != null && stackFrame.getAssembly() != null) {
```

### SizeReplaceableByIsEmpty
`stack.length() > 0` can be replaced with '!stack.isEmpty()'
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/quickpulse/QuickPulseDataCollector.java`
#### Snippet
```java
          }
        }
      } else if (stack != null && stack.length() > 0) {
        exceptions.append(stack);
      }
```

## RuleId[ruleID=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `reportEvent |= gcEventMonitorConfiguration.reportingLevel == GcReportingLevel.TENURED_ONLY ...`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/triggers/GcEventInit.java`
#### Snippet
```java
      GcCollectionEvent event) {
    boolean reportEvent = gcEventMonitorConfiguration.reportingLevel == GcReportingLevel.ALL;
    reportEvent |=
        gcEventMonitorConfiguration.reportingLevel == GcReportingLevel.TENURED_ONLY
            && event.getCollector().isTenuredCollector();

    if (!reportEvent) {
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `ProfilerConfiguration` has no concrete subclass
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/config/ProfilerConfiguration.java`
#### Snippet
```java

@AutoValue
public abstract class ProfilerConfiguration {

  @JsonCreator
```

### AbstractClassNeverImplemented
Abstract class `UploadContext` has no concrete subclass
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/upload/UploadContext.java`
#### Snippet
```java
 */
@AutoValue
abstract class UploadContext {

  abstract String getMachineName();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/upload/UploadContext.java`
#### Snippet
```java

  @AutoValue.Builder
  abstract static class Builder {

    abstract Builder setMachineName(String machineName);
```

### AbstractClassNeverImplemented
Abstract class `ArtifactAcceptedResponse` has no concrete subclass
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/service/ArtifactAcceptedResponse.java`
#### Snippet
```java
/** Result of uploading an artifact to service profiler. */
@AutoValue
public abstract class ArtifactAcceptedResponse {

  @JsonCreator
```

### AbstractClassNeverImplemented
Abstract class `IntervalMetricsKey` has no concrete subclass
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/statsbeat/NetworkStatsbeat.java`
#### Snippet
```java

  @AutoValue
  abstract static class IntervalMetricsKey {

    static IntervalMetricsKey create(
```

### AbstractClassNeverImplemented
Abstract class `TelemetryDataPoint` has no concrete subclass
in `agent/agent-profiler/agent-alerting/src/main/java/com/microsoft/applicationinsights/alerting/analysis/data/TelemetryDataPoint.java`
#### Snippet
```java
/** Individual sample of telemetry data. */
@AutoValue
public abstract class TelemetryDataPoint {

  public static TelemetryDataPoint create(
```

### AbstractClassNeverImplemented
Abstract class `DefaultConfiguration` has no concrete subclass
in `agent/agent-profiler/agent-alerting-api/src/main/java/com/microsoft/applicationinsights/alerting/config/DefaultConfiguration.java`
#### Snippet
```java

@AutoValue
public abstract class DefaultConfiguration {

  public abstract boolean getSamplingEnabled();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `agent/agent-profiler/agent-alerting-api/src/main/java/com/microsoft/applicationinsights/alerting/config/DefaultConfiguration.java`
#### Snippet
```java

  @AutoValue.Builder
  public abstract static class Builder {

    public abstract Builder setSamplingEnabled(boolean samplingEnabled);
```

### AbstractClassNeverImplemented
Abstract class `AlertingConfiguration` has no concrete subclass
in `agent/agent-profiler/agent-alerting-api/src/main/java/com/microsoft/applicationinsights/alerting/config/AlertingConfiguration.java`
#### Snippet
```java
/** Contains the overall configuration of the entire alerting subsystem. */
@AutoValue
public abstract class AlertingConfiguration {

  public static AlertingConfiguration create(
```

### AbstractClassNeverImplemented
Abstract class `CollectionPlanConfiguration` has no concrete subclass
in `agent/agent-profiler/agent-alerting-api/src/main/java/com/microsoft/applicationinsights/alerting/config/CollectionPlanConfiguration.java`
#### Snippet
```java

@AutoValue
public abstract class CollectionPlanConfiguration {

  public abstract boolean isSingle();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `agent/agent-profiler/agent-alerting-api/src/main/java/com/microsoft/applicationinsights/alerting/config/CollectionPlanConfiguration.java`
#### Snippet
```java

  @AutoValue.Builder
  public abstract static class Builder {

    public abstract CollectionPlanConfiguration.Builder setSingle(boolean single);
```

### AbstractClassNeverImplemented
Abstract class `AlertBreach` has no concrete subclass
in `agent/agent-profiler/agent-alerting-api/src/main/java/com/microsoft/applicationinsights/alerting/alert/AlertBreach.java`
#### Snippet
```java
@JsonDeserialize(builder = AlertBreach.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AlertBreach {

  @JsonProperty("type")
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `agent/agent-profiler/agent-alerting-api/src/main/java/com/microsoft/applicationinsights/alerting/alert/AlertBreach.java`
#### Snippet
```java
  @AutoValue.Builder
  @JsonIgnoreProperties(ignoreUnknown = true)
  public abstract static class Builder {

    @JsonCreator
```

### AbstractClassNeverImplemented
Abstract class `AlertConfiguration` has no concrete subclass
in `agent/agent-profiler/agent-alerting-api/src/main/java/com/microsoft/applicationinsights/alerting/config/AlertConfiguration.java`
#### Snippet
```java
@JsonSerialize(as = AlertConfiguration.class)
@JsonDeserialize(builder = AlertConfiguration.Builder.class)
public abstract class AlertConfiguration {

  @JsonProperty("type")
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `agent/agent-profiler/agent-alerting-api/src/main/java/com/microsoft/applicationinsights/alerting/config/AlertConfiguration.java`
#### Snippet
```java

  @AutoValue.Builder
  public abstract static class Builder {
    @JsonCreator
    public static Builder builder() {
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Configuration.JmxMetric`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/PerformanceCounterInitializer.java`
#### Snippet
```java
   * the Performance Counter in the {@link PerformanceCounterContainer}
   */
  private static void loadCustomJmxPerfCounters(List<Configuration.JmxMetric> jmxXmlElements) {
    try {
      HashMap<String, Collection<JmxAttributeData>> data = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? extends Configuration.ConnectionStringOverride`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/AiContextCustomizer.java`
#### Snippet
```java

  public AiContextCustomizer(
      List<Configuration.ConnectionStringOverride> connectionStringOverrides,
      List<Configuration.RoleNameOverride> roleNameOverrides) {
    this.connectionStringOverrides = connectionStringOverrides;
```

### BoundedWildcard
Can generalize to `? extends Configuration.RoleNameOverride`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/AiContextCustomizer.java`
#### Snippet
```java
  public AiContextCustomizer(
      List<Configuration.ConnectionStringOverride> connectionStringOverrides,
      List<Configuration.RoleNameOverride> roleNameOverrides) {
    this.connectionStringOverrides = connectionStringOverrides;
    this.roleNameOverrides = roleNameOverrides;
```

### BoundedWildcard
Can generalize to `? super String`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/AiConfigCustomizer.java`
#### Snippet
```java
  }

  private static void enableInstrumentations(Configuration config, Map<String, String> properties) {
    properties.put("otel.instrumentation.common.default-enabled", "false");

```

### BoundedWildcard
Can generalize to `? super String`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/AiConfigCustomizer.java`
#### Snippet
```java
  }

  private static void enableInstrumentations(Configuration config, Map<String, String> properties) {
    properties.put("otel.instrumentation.common.default-enabled", "false");

```

### BoundedWildcard
Can generalize to `? super String`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/AiConfigCustomizer.java`
#### Snippet
```java

  private static void setHttpHeaderConfiguration(
      Map<String, String> properties, String propertyName, List<String> headers) {
    if (!headers.isEmpty()) {
      properties.put(propertyName, join(headers, ','));
```

### BoundedWildcard
Can generalize to `? super String`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/AiConfigCustomizer.java`
#### Snippet
```java

  private static void setHttpHeaderConfiguration(
      Map<String, String> properties, String propertyName, List<String> headers) {
    if (!headers.isEmpty()) {
      properties.put(propertyName, join(headers, ','));
```

### BoundedWildcard
Can generalize to `? super Recording`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/Profiler.java`
#### Snippet
```java
  /** Perform a profile and notify the handler. */
  private void executeProfile(
      AlertMetricType alertType, Duration duration, Consumer<Recording> handler) {

    logger.info("Received " + alertType + " alert, Starting profile");
```

### BoundedWildcard
Can generalize to `? super ProfilerConfiguration`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/config/ConfigService.java`
#### Snippet
```java
  }

  void pollForConfigUpdates(Consumer<ProfilerConfiguration> updateListener) {
    try {
      pullSettings()
```

### BoundedWildcard
Can generalize to `? extends Profiler`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/triggers/AlertingSubsystemInit.java`
#### Snippet
```java
      Configuration configuration,
      TelemetryObservers telemetryObservers,
      AtomicReference<Profiler> profilerHolder,
      TelemetryClient telemetryClient,
      DiagnosticEngine diagnosticEngine,
```

### BoundedWildcard
Can generalize to `? extends AlertingSubsystem`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/triggers/AlertTriggerSpanProcessor.java`
#### Snippet
```java
  }

  public AlertTriggerSpanProcessor(Supplier<AlertingSubsystem> alertingSubsystemSupplier) {
    this.alertingSubsystemSupplier = alertingSubsystemSupplier;
  }
```

### BoundedWildcard
Can generalize to `? extends ParseConfigValue`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/triggers/AlertConfigParser.java`
#### Snippet
```java

  private static <T> T parseConfig(
      T builder, String[] tokens, Map<String, ParseConfigValue<T>> parsers) {
    for (int index = 0; index < tokens.length; index++) {
      if (tokens[index] != null && !tokens[index].isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends MetricFilter`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/telemetry/MetricFilter.java`
#### Snippet
```java
  }

  public static boolean shouldSkip(String metricName, List<MetricFilter> metricFilters) {
    for (MetricFilter metricFilter : metricFilters) {
      if (metricFilter.exclude(metricName)) {
```

### BoundedWildcard
Can generalize to `? super IntervalMetrics`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/statsbeat/NetworkStatsbeat.java`
#### Snippet
```java
      @Nullable String causeFieldName,
      @Nullable Object causeValue,
      Consumer<IntervalMetrics> update) {
    synchronized (lock) {
      IntervalMetrics intervalMetrics =
```

### BoundedWildcard
Can generalize to `? super ExceptionDetailBuilder`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/classicsdk/TelemetryUtil.java`
#### Snippet
```java
      Throwable exception,
      @Nullable ExceptionDetailBuilder parentExceptionDetails,
      List<ExceptionDetailBuilder> exceptions,
      int stackSize) {
    if (exception == null) {
```

### BoundedWildcard
Can generalize to `? extends BlockBlobItem`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/upload/UploadService.java`
#### Snippet
```java
  /** Report the success of an upload or throw an exception. */
  protected Mono<UploadFinishArgs> reportUploadComplete(
      UploadContext uploadContext, Response<BlockBlobItem> response) {
    int statusCode = response.getStatusCode();
    // Success 2xx
```

### BoundedWildcard
Can generalize to `? super BlobContainerClientBuilder`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/upload/UploadService.java`
#### Snippet
```java
  public UploadService(
      ServiceProfilerClient serviceProfilerClient,
      Consumer<BlobContainerClientBuilder> blobContainerClientCustomizer,
      String machineName,
      String processId,
```

### BoundedWildcard
Can generalize to `? extends AttributeKey`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/processors/ProcessorUtil.java`
#### Snippet
```java

  public static boolean spanHasAllFromAttributeKeys(
      SpanData span, List<AttributeKey<?>> fromAttributes) {
    if (fromAttributes.isEmpty()) {
      return false;
```

### BoundedWildcard
Can generalize to `? extends ProcessorAttribute`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/processors/AgentProcessor.java`
#### Snippet
```java
    private final List<String> names;

    private StrictIncludeExclude(List<ProcessorAttribute> processorAttributes, List<String> names) {
      this.processorAttributes = processorAttributes;
      this.names = names;
```

### BoundedWildcard
Can generalize to `? extends ProcessorAction`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/processors/AttributeProcessor.java`
#### Snippet
```java

  private AttributeProcessor(
      List<ProcessorAction> actions,
      @Nullable IncludeExclude include,
      @Nullable IncludeExclude exclude) {
```

### BoundedWildcard
Can generalize to `? extends List`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/processors/SpanProcessor.java`
#### Snippet
```java
      List<AttributeKey<?>> fromAttributes,
      List<Pattern> toAttributeRulePatterns,
      List<List<String>> groupNames,
      String separator) {
    super(include, exclude);
```

### BoundedWildcard
Can generalize to `? extends List`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/processors/LogProcessor.java`
#### Snippet
```java
      List<AttributeKey<?>> fromAttributes,
      List<Pattern> toAttributeRulePatterns,
      List<List<String>> groupNames,
      String separator) {
    super(include, exclude);
```

### BoundedWildcard
Can generalize to `? extends AttributeKey`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/processors/LogProcessor.java`
#### Snippet
```java

  public static boolean logHasAllFromAttributeKeys(
      LogRecordData log, List<AttributeKey<?>> fromAttributes) {
    if (fromAttributes.isEmpty()) {
      return false;
```

### BoundedWildcard
Can generalize to `? extends ObjectName`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/perfcounter/JmxDataFetcher.java`
#### Snippet
```java

  private static List<Object> fetch(
      MBeanServer server, Set<ObjectName> objects, String attributeName)
      throws AttributeNotFoundException, MBeanException, ReflectionException,
          InstanceNotFoundException {
```

### BoundedWildcard
Can generalize to `? extends Set`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/perfcounter/AvailableJmxMetricLogger.java`
#### Snippet
```java
  // visible for testing
  static Map<String, Set<String>> difference(
      Map<String, Set<String>> map1, Map<String, Set<String>> map2) {
    Map<String, Set<String>> difference = new HashMap<>();
    for (Map.Entry<String, Set<String>> entry : map1.entrySet()) {
```

### BoundedWildcard
Can generalize to `? super AlertBreach`
in `agent/agent-profiler/agent-alerting/src/main/java/com/microsoft/applicationinsights/alerting/analysis/AlertPipelineTrigger.java`
#### Snippet
```java
  private Instant lastAlertTime;

  public AlertPipelineTrigger(AlertConfiguration alertConfiguration, Consumer<AlertBreach> action) {
    this.alertConfig = alertConfiguration;
    this.action = action;
```

### BoundedWildcard
Can generalize to `? extends AlertPipeline`
in `agent/agent-profiler/agent-alerting/src/main/java/com/microsoft/applicationinsights/alerting/analysis/pipelines/AlertPipelineMultiplexer.java`
#### Snippet
```java
  private final List<AlertPipeline> pipelines;

  public AlertPipelineMultiplexer(List<AlertPipeline> pipelines) {
    this.pipelines = pipelines;
  }
```

### BoundedWildcard
Can generalize to `? super AlertBreach`
in `agent/agent-profiler/agent-alerting/src/main/java/com/microsoft/applicationinsights/alerting/analysis/pipelines/AlertPipelines.java`
#### Snippet
```java
  private final Consumer<AlertBreach> alertHandler;

  public AlertPipelines(Consumer<AlertBreach> alertHandler) {
    this.alertHandler = alertHandler;
  }
```

### BoundedWildcard
Can generalize to `? extends T`
in `agent/agent-profiler/agent-alerting/src/main/java/com/microsoft/applicationinsights/alerting/analysis/aggregations/windowed/WindowedAggregation.java`
#### Snippet
```java
      long windowLengthInSec,
      TimeSource timeSource,
      Supplier<T> bucketFactory,
      boolean trackCurrentBucket) {
    this.windowLengthInSec = windowLengthInSec;
```

### BoundedWildcard
Can generalize to `? super AlertBreach`
in `agent/agent-profiler/agent-alerting/src/main/java/com/microsoft/applicationinsights/alerting/AlertingSubsystem.java`
#### Snippet
```java
  }

  protected AlertingSubsystem(Consumer<AlertBreach> alertHandler, TimeSource timeSource) {
    this.alertHandler = alertHandler;
    alertPipelines = new AlertPipelines(alertHandler);
```

### BoundedWildcard
Can generalize to `? extends JmxMetric`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/ConfigurationBuilder.java`
#### Snippet
```java

  private static boolean jmxMetricExists(
      List<JmxMetric> jmxMetrics, String objectName, String attribute) {
    for (JmxMetric metric : jmxMetrics) {
      if (metric.objectName.equals(objectName) && metric.attribute.equals(attribute)) {
```

### BoundedWildcard
Can generalize to `? super REQUEST`
in `agent/agent-bootstrap/src/main/java/io/opentelemetry/instrumentation/api/instrumenter/InstrumenterBuilder.java`
#### Snippet
```java
  /** Adds a {@link SpanLinksExtractor} that will extract span links from requests. */
  public InstrumenterBuilder<REQUEST, RESPONSE> addSpanLinksExtractor(
      SpanLinksExtractor<REQUEST> spanLinksExtractor) {
    spanLinksExtractors.add(requireNonNull(spanLinksExtractor, "spanLinksExtractor"));
    return this;
```

### BoundedWildcard
Can generalize to `? extends GarbageCollector`
in `agent/agent-gc-monitor/gc-monitor-api/src/main/java/com/microsoft/gcmonitor/MemoryManagers.java`
#### Snippet
```java
  }

  private boolean isComposedOf(Set<GarbageCollector> collectors) {
    Set<Class<? extends GarbageCollector>> collectorClasses =
        collectors.stream().map(GarbageCollector::getClass).collect(Collectors.toSet());
```

### BoundedWildcard
Can generalize to `? extends MemoryPool`
in `agent/agent-gc-monitor/gc-monitor-core/src/main/java/com/microsoft/gcmonitor/collectors/JmxGarbageCollectorStats.java`
#### Snippet
```java
  }

  public void visitPools(Collection<MemoryPool> collection) {
    for (MemoryPool memoryPool : collection) {
      if (memoryPool.isManagedBy(garbageCollector)) {
```

### BoundedWildcard
Can generalize to `? super AttributeKey`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/RequestChecker.java`
#### Snippet
```java

  public static boolean isRequest(
      SpanKind kind, SpanContext parentSpanContext, Function<AttributeKey<String>, String> attrFn) {
    if (kind == SpanKind.INTERNAL) {
      // INTERNAL scheduled job spans with no parent are mapped to requests
```

### BoundedWildcard
Can generalize to `? super ObjectName`
in `agent/agent-gc-monitor/gc-monitor-core/src/main/java/com/microsoft/gcmonitor/JmxMemoryManagement.java`
#### Snippet
```java

  private static <V> Set<V> getEntityFromMbeanServer(
      String beanName, MBeanServerConnection connection, CollectorFactory<ObjectName, V> factory)
      throws UnableToMonitorMemoryException {
    try {
```

### BoundedWildcard
Can generalize to `? extends V`
in `agent/agent-gc-monitor/gc-monitor-core/src/main/java/com/microsoft/gcmonitor/JmxMemoryManagement.java`
#### Snippet
```java

  private static <V> Set<V> getEntityFromMbeanServer(
      String beanName, MBeanServerConnection connection, CollectorFactory<ObjectName, V> factory)
      throws UnableToMonitorMemoryException {
    try {
```

### BoundedWildcard
Can generalize to `? super TelemetryItem`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/MetricDataMapper.java`
#### Snippet
```java
  }

  public void map(MetricData metricData, Consumer<TelemetryItem> consumer) {
    if (EXCLUDED_METRIC_NAMES.contains(metricData.getName())) {
      return;
```

### BoundedWildcard
Can generalize to `? super AbstractTelemetryBuilder`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/MetricDataMapper.java`
#### Snippet
```java

  public MetricDataMapper(
      BiConsumer<AbstractTelemetryBuilder, Resource> telemetryInitializer,
      boolean captureHttpServer4xxAsError) {
    this.telemetryInitializer = telemetryInitializer;
```

### BoundedWildcard
Can generalize to `? super Resource`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/MetricDataMapper.java`
#### Snippet
```java

  public MetricDataMapper(
      BiConsumer<AbstractTelemetryBuilder, Resource> telemetryInitializer,
      boolean captureHttpServer4xxAsError) {
    this.telemetryInitializer = telemetryInitializer;
```

### BoundedWildcard
Can generalize to `? super AbstractTelemetryBuilder`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/LogDataMapper.java`
#### Snippet
```java
  public LogDataMapper(
      boolean captureLoggingLevelAsCustomDimension,
      BiConsumer<AbstractTelemetryBuilder, Resource> telemetryInitializer) {
    this.captureLoggingLevelAsCustomDimension = captureLoggingLevelAsCustomDimension;
    this.telemetryInitializer = telemetryInitializer;
```

### BoundedWildcard
Can generalize to `? super Resource`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/LogDataMapper.java`
#### Snippet
```java
  public LogDataMapper(
      boolean captureLoggingLevelAsCustomDimension,
      BiConsumer<AbstractTelemetryBuilder, Resource> telemetryInitializer) {
    this.captureLoggingLevelAsCustomDimension = captureLoggingLevelAsCustomDimension;
    this.telemetryInitializer = telemetryInitializer;
```

### BoundedWildcard
Can generalize to `? extends MutableLong`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/logging/AggregatingLogger.java`
#### Snippet
```java
  }

  private static long getTotalFailures(Map<String, MutableLong> failureMessages) {
    long total = 0;
    for (MutableLong value : failureMessages.values()) {
```

### BoundedWildcard
Can generalize to `? extends FriendlyExceptionDetector`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/logging/NetworkFriendlyExceptions.java`
#### Snippet
```java
      AtomicBoolean alreadySeen,
      ClientLogger logger,
      List<FriendlyExceptionDetector> detectors) {

    for (FriendlyExceptionDetector detector : detectors) {
```

### BoundedWildcard
Can generalize to `? extends ByteBuffer`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/pipeline/AppInsightsByteBufferPool.java`
#### Snippet
```java
              + " so it's ok if the offer doesn't succeed,"
              + " so there's no need to check the return value")
  void offer(List<ByteBuffer> byteBuffers) {
    // TODO(trask) batch offer?
    for (ByteBuffer byteBuffer : byteBuffers) {
```

### BoundedWildcard
Can generalize to `? extends GarbageCollector`
in `agent/agent-gc-monitor/gc-monitor-api/src/main/java/com/microsoft/gcmonitor/memorypools/MemoryPools.java`
#### Snippet
```java

  public static MemoryPool getMemoryPool(
      MBeanServerConnection connection, ObjectName name, Set<GarbageCollector> collectors) {
    MemoryPoolMXBean dataSource = JMX.newMXBeanProxy(connection, name, MemoryPoolMXBean.class);
    String id = dataSource.getName();
```

### BoundedWildcard
Can generalize to `? extends TelemetryPipelineListener`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/pipeline/TelemetryPipelineListener.java`
#### Snippet
```java
    private final List<TelemetryPipelineListener> delegates;

    public CompositeTelemetryPipelineListener(List<TelemetryPipelineListener> delegates) {
      this.delegates = delegates;
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/heartbeat/DefaultHeartBeatPropertyProvider.java`
#### Snippet
```java
   * @param defaultFields collection to hold default properties.
   */
  private static void initializeDefaultFields(Set<String> defaultFields) {
    defaultFields.add(JRE_VERSION);
    defaultFields.add(SDK_VERSION);
```

### BoundedWildcard
Can generalize to `? super String`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/heartbeat/WebAppsHeartbeatProvider.java`
#### Snippet
```java

  /** Populates the default Fields with the properties. */
  private static void initializeDefaultFields(Set<String> defaultFields) {
    defaultFields.add(WEBSITE_SITE_NAME);
    defaultFields.add(WEBSITE_HOSTNAME);
```

### BoundedWildcard
Can generalize to `? extends HttpRequest`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/quickpulse/QuickPulseDataSender.java`
#### Snippet
```java
  private final ArrayBlockingQueue<HttpRequest> sendQueue;

  QuickPulseDataSender(HttpPipeline httpPipeline, ArrayBlockingQueue<HttpRequest> sendQueue) {
    this.httpPipeline = httpPipeline;
    this.sendQueue = sendQueue;
```

### BoundedWildcard
Can generalize to `? super AbstractTelemetryBuilder`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/heartbeat/HeartbeatExporter.java`
#### Snippet
```java
  public HeartbeatExporter(
      long intervalSeconds,
      BiConsumer<AbstractTelemetryBuilder, Resource> telemetryInitializer,
      Consumer<List<TelemetryItem>> telemetryItemsConsumer) {
    this.heartbeatProperties = new ConcurrentHashMap<>();
```

### BoundedWildcard
Can generalize to `? super Resource`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/heartbeat/HeartbeatExporter.java`
#### Snippet
```java
  public HeartbeatExporter(
      long intervalSeconds,
      BiConsumer<AbstractTelemetryBuilder, Resource> telemetryInitializer,
      Consumer<List<TelemetryItem>> telemetryItemsConsumer) {
    this.heartbeatProperties = new ConcurrentHashMap<>();
```

### BoundedWildcard
Can generalize to `? super List`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/heartbeat/HeartbeatExporter.java`
#### Snippet
```java
      long intervalSeconds,
      BiConsumer<AbstractTelemetryBuilder, Resource> telemetryInitializer,
      Consumer<List<TelemetryItem>> telemetryItemsConsumer) {
    this.heartbeatProperties = new ConcurrentHashMap<>();
    this.propertyUpdateService =
```

### BoundedWildcard
Can generalize to `? super TelemetryItem`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/SpanDataMapper.java`
#### Snippet
```java
      @Nullable String operationName,
      long itemCount,
      Consumer<TelemetryItem> consumer) {
    for (EventData event : span.getEvents()) {
      String instrumentationScopeName = span.getInstrumentationScopeInfo().getName();
```

### BoundedWildcard
Can generalize to `? extends LinkData`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/SpanDataMapper.java`
#### Snippet
```java
  }

  private static void addLinks(AbstractTelemetryBuilder telemetryBuilder, List<LinkData> links) {
    if (links.isEmpty()) {
      return;
```

### BoundedWildcard
Can generalize to `? super AbstractTelemetryBuilder`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/SpanDataMapper.java`
#### Snippet
```java
  public SpanDataMapper(
      boolean captureHttpServer4xxAsError,
      BiConsumer<AbstractTelemetryBuilder, Resource> telemetryInitializer,
      BiPredicate<EventData, String> eventSuppressor) {
    this.captureHttpServer4xxAsError = captureHttpServer4xxAsError;
```

### BoundedWildcard
Can generalize to `? super Resource`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/SpanDataMapper.java`
#### Snippet
```java
  public SpanDataMapper(
      boolean captureHttpServer4xxAsError,
      BiConsumer<AbstractTelemetryBuilder, Resource> telemetryInitializer,
      BiPredicate<EventData, String> eventSuppressor) {
    this.captureHttpServer4xxAsError = captureHttpServer4xxAsError;
```

### BoundedWildcard
Can generalize to `? super EventData`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/SpanDataMapper.java`
#### Snippet
```java
      boolean captureHttpServer4xxAsError,
      BiConsumer<AbstractTelemetryBuilder, Resource> telemetryInitializer,
      BiPredicate<EventData, String> eventSuppressor) {
    this.captureHttpServer4xxAsError = captureHttpServer4xxAsError;
    this.telemetryInitializer = telemetryInitializer;
```

### BoundedWildcard
Can generalize to `? super String`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/SpanDataMapper.java`
#### Snippet
```java
      boolean captureHttpServer4xxAsError,
      BiConsumer<AbstractTelemetryBuilder, Resource> telemetryInitializer,
      BiPredicate<EventData, String> eventSuppressor) {
    this.captureHttpServer4xxAsError = captureHttpServer4xxAsError;
    this.telemetryInitializer = telemetryInitializer;
```

### BoundedWildcard
Can generalize to `? super HttpRequest`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/quickpulse/QuickPulseDataFetcher.java`
#### Snippet
```java
  public QuickPulseDataFetcher(
      QuickPulseDataCollector collector,
      ArrayBlockingQueue<HttpRequest> sendQueue,
      Supplier<URL> endpointUrl,
      Supplier<String> instrumentationKey,
```

### BoundedWildcard
Can generalize to `? extends ByteBuffer`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/localstorage/LocalFileWriter.java`
#### Snippet
```java
  }

  private static void write(File file, String connectionString, List<ByteBuffer> buffers)
      throws IOException {

```

### BoundedWildcard
Can generalize to `? super String`
in `agent/agent-bootstrap/src/main/java/com/microsoft/applicationinsights/agent/bootstrap/BytecodeUtil.java`
#### Snippet
```java
  public static void copy(
      @Nullable Map<String, String> source,
      Map<String, String> target,
      @Nullable String excludePrefix) {
    if (source == null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `agent/agent-bootstrap/src/main/java/com/microsoft/applicationinsights/agent/bootstrap/BytecodeUtil.java`
#### Snippet
```java
  public static void copy(
      @Nullable Map<String, String> source,
      Map<String, String> target,
      @Nullable String excludePrefix) {
    if (source == null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `classic-sdk/core/src/main/java/com/microsoft/applicationinsights/internal/util/MapUtil.java`
#### Snippet
```java
  }

  public static void setDateValueOrRemove(Map<String, String> map, String key, Date value) {
    if (value == null) {
      map.remove(key);
```

### BoundedWildcard
Can generalize to `? super String`
in `classic-sdk/core/src/main/java/com/microsoft/applicationinsights/internal/util/MapUtil.java`
#### Snippet
```java
  }

  public static void setDateValueOrRemove(Map<String, String> map, String key, Date value) {
    if (value == null) {
      map.remove(key);
```

### BoundedWildcard
Can generalize to `? super String`
in `classic-sdk/core/src/main/java/com/microsoft/applicationinsights/internal/util/MapUtil.java`
#### Snippet
```java
public class MapUtil {

  public static <V> void copy(Map<String, V> source, Map<String, V> target) {
    if (target == null) {
      throw new IllegalArgumentException("target must not be null");
```

### BoundedWildcard
Can generalize to `? super V`
in `classic-sdk/core/src/main/java/com/microsoft/applicationinsights/internal/util/MapUtil.java`
#### Snippet
```java
public class MapUtil {

  public static <V> void copy(Map<String, V> source, Map<String, V> target) {
    if (target == null) {
      throw new IllegalArgumentException("target must not be null");
```

### BoundedWildcard
Can generalize to `? super String`
in `classic-sdk/core/src/main/java/com/microsoft/applicationinsights/internal/util/MapUtil.java`
#### Snippet
```java
  }

  public static void setStringValueOrRemove(Map<String, String> map, String key, String value) {
    if (LocalStringsUtils.isNullOrEmpty(value)) {
      map.remove(key);
```

### BoundedWildcard
Can generalize to `? super String`
in `classic-sdk/core/src/main/java/com/microsoft/applicationinsights/internal/util/MapUtil.java`
#### Snippet
```java
  }

  public static void setStringValueOrRemove(Map<String, String> map, String key, String value) {
    if (LocalStringsUtils.isNullOrEmpty(value)) {
      map.remove(key);
```

### BoundedWildcard
Can generalize to `? super String`
in `classic-sdk/core/src/main/java/com/microsoft/applicationinsights/internal/util/MapUtil.java`
#### Snippet
```java
  }

  public static void setBoolValueOrRemove(Map<String, String> map, String key, Boolean value) {
    if (value == null) {
      map.remove(key);
```

### BoundedWildcard
Can generalize to `? super String`
in `classic-sdk/core/src/main/java/com/microsoft/applicationinsights/internal/util/MapUtil.java`
#### Snippet
```java
  }

  public static void setBoolValueOrRemove(Map<String, String> map, String key, Boolean value) {
    if (value == null) {
      map.remove(key);
```

### BoundedWildcard
Can generalize to `? extends Envelope`
in `smoke-tests/apps/JMS/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/JmsControllerSpansEnabledTest.java`
#### Snippet
```java
  }

  private static Envelope getRequestEnvelope(List<Envelope> envelopes, String name) {
    for (Envelope envelope : envelopes) {
      RequestData rd = (RequestData) ((Data<?>) envelope.getData()).getBaseData();
```

### BoundedWildcard
Can generalize to `? extends Envelope`
in `smoke-tests/apps/JMS/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/JmsControllerSpansEnabledTest.java`
#### Snippet
```java
  }

  private static Envelope getDependencyEnvelope(List<Envelope> envelopes, String name) {
    for (Envelope envelope : envelopes) {
      RemoteDependencyData rdd =
```

### BoundedWildcard
Can generalize to `? extends Envelope`
in `smoke-tests/apps/JMS/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/JmsTest.java`
#### Snippet
```java
  }

  private static Envelope getRequestEnvelope(List<Envelope> envelopes, String name) {
    for (Envelope envelope : envelopes) {
      RequestData rd = (RequestData) ((Data<?>) envelope.getData()).getBaseData();
```

### BoundedWildcard
Can generalize to `? extends Envelope`
in `smoke-tests/apps/JMS/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/JmsTest.java`
#### Snippet
```java
  }

  private static Envelope getDependencyEnvelope(List<Envelope> envelopes, String name) {
    for (Envelope envelope : envelopes) {
      RemoteDependencyData rdd =
```

### BoundedWildcard
Can generalize to `? extends Connection`
in `smoke-tests/apps/Jdbc/src/main/java/com/microsoft/applicationinsights/smoketestapp/JdbcServlet.java`
#### Snippet
```java
  }

  private static Connection getConnection(Callable<Connection> callable) throws Exception {
    Exception exception;
    long start = System.nanoTime();
```

### BoundedWildcard
Can generalize to `? extends Envelope`
in `smoke-tests/apps/Kafka/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/KafkaControllerSpansEnabledTest.java`
#### Snippet
```java
  }

  private static Envelope getRequestEnvelope(List<Envelope> envelopes, String name) {
    for (Envelope envelope : envelopes) {
      RequestData rd = (RequestData) ((Data<?>) envelope.getData()).getBaseData();
```

### BoundedWildcard
Can generalize to `? extends Envelope`
in `smoke-tests/apps/Kafka/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/KafkaControllerSpansEnabledTest.java`
#### Snippet
```java
  }

  private static Envelope getDependencyEnvelope(List<Envelope> envelopes, String name) {
    for (Envelope envelope : envelopes) {
      RemoteDependencyData rdd =
```

### BoundedWildcard
Can generalize to `? extends Envelope`
in `smoke-tests/apps/Kafka/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/KafkaTest.java`
#### Snippet
```java
  }

  private static Envelope getRequestEnvelope(List<Envelope> envelopes, String name) {
    for (Envelope envelope : envelopes) {
      RequestData rd = (RequestData) ((Data<?>) envelope.getData()).getBaseData();
```

### BoundedWildcard
Can generalize to `? extends Envelope`
in `smoke-tests/apps/Kafka/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/KafkaTest.java`
#### Snippet
```java
  }

  private static Envelope getDependencyEnvelope(List<Envelope> envelopes, String name) {
    for (Envelope envelope : envelopes) {
      RemoteDependencyData rdd =
```

### BoundedWildcard
Can generalize to `? extends Envelope`
in `smoke-tests/apps/gRPC/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/GrpcTest.java`
#### Snippet
```java
  }

  private static Envelope getDependencyEnvelope(List<Envelope> envelopes, String name) {
    for (Envelope envelope : envelopes) {
      RemoteDependencyData rdd =
```

### BoundedWildcard
Can generalize to `? extends Envelope`
in `smoke-tests/apps/gRPC/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/GrpcTest.java`
#### Snippet
```java
  }

  private static void verifyRpcServerDurationPreAggregatedMetrics(List<Envelope> metrics) {
    assertThat(metrics.size()).isEqualTo(1);

```

### BoundedWildcard
Can generalize to `? extends Envelope`
in `smoke-tests/apps/gRPC/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/GrpcTest.java`
#### Snippet
```java
  }

  private static Envelope getRequestEnvelope(List<Envelope> envelopes, String name) {
    for (Envelope envelope : envelopes) {
      RequestData rd = (RequestData) ((Data<?>) envelope.getData()).getBaseData();
```

### BoundedWildcard
Can generalize to `? extends Envelope`
in `smoke-tests/apps/gRPC/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/GrpcTest.java`
#### Snippet
```java
  }

  private static void verifyRpcClientDurationPreAggregatedMetrics(List<Envelope> metrics) {
    assertThat(metrics.size()).isEqualTo(1);

```

### BoundedWildcard
Can generalize to `? extends MongoClient`
in `smoke-tests/apps/MongoDB/src/main/java/com/microsoft/applicationinsights/smoketestapp/MongoServlet.java`
#### Snippet
```java
  }

  private static MongoClient getMongoClient(Callable<MongoClient> callable) throws Exception {
    Exception exception;
    long start = System.nanoTime();
```

### BoundedWildcard
Can generalize to `? extends Session`
in `smoke-tests/apps/Cassandra/src/main/java/com/microsoft/applicationinsights/smoketestapp/CassandraServlet.java`
#### Snippet
```java
  }

  private static Session getCassandraSession(Callable<Session> callable) throws Exception {
    Exception exception;
    long start = System.nanoTime();
```

### BoundedWildcard
Can generalize to `? super Integer`
in `smoke-tests/apps/SpringBoot/src/main/java/com/microsoft/applicationinsights/smoketestapp/TestBean.java`
#### Snippet
```java

  @Async
  public void asyncDependencyCall(DeferredResult<Integer> deferredResult) throws IOException {
    String url = "https://www.bing.com";
    HttpGet get = new HttpGet(url);
```

### BoundedWildcard
Can generalize to `? extends Connection`
in `smoke-tests/apps/SamplingOverrides/src/main/java/com/microsoft/applicationinsights/smoketestapp/SamplingOverridesServlet.java`
#### Snippet
```java
  }

  private static Connection getConnection(Callable<Connection> callable) throws Exception {
    Exception exception;
    long startTimeMillis = System.currentTimeMillis();
```

### BoundedWildcard
Can generalize to `? extends Envelope`
in `smoke-tests/apps/RoleNameOverrides/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/RoleNameOverridesTest.java`
#### Snippet
```java

  private static void verifyHttpServerPreAggregatedMetrics(
      List<Envelope> metrics, String roleName) {
    assertThat(metrics.size()).isEqualTo(1);

```

### BoundedWildcard
Can generalize to `? extends Envelope`
in `smoke-tests/apps/RoleNameOverrides/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/RoleNameOverridesTest.java`
#### Snippet
```java

  private static void verifyHttpClientPreAggregatedMetrics(
      List<Envelope> metrics, String roleName) {
    assertThat(metrics.size()).isEqualTo(1);

```

### BoundedWildcard
Can generalize to `? extends Envelope`
in `smoke-tests/apps/CustomInstrumentation/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/CustomInstrumentationTest.java`
#### Snippet
```java
  }

  private static Envelope getRequestEnvelope(List<Envelope> envelopes, String name) {
    for (Envelope envelope : envelopes) {
      RequestData rd = (RequestData) ((Data<?>) envelope.getData()).getBaseData();
```

### BoundedWildcard
Can generalize to `? extends Connection`
in `smoke-tests/apps/SamplingOverridesBackCompat/src/main/java/com/microsoft/applicationinsights/smoketestapp/SamplingOverridesBackCompatServlet.java`
#### Snippet
```java
  }

  private static Connection getConnection(Callable<Connection> callable) throws Exception {
    Exception exception;
    long startTimeMillis = System.currentTimeMillis();
```

### BoundedWildcard
Can generalize to `? extends Envelope`
in `smoke-tests/apps/ConnectionStringOverrides/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/ConnectionStringOverridesTest.java`
#### Snippet
```java
  }

  private static void verifyHttpClientPreAggregatedMetrics(List<Envelope> metrics, String iKey) {
    assertThat(metrics.size()).isEqualTo(1);

```

### BoundedWildcard
Can generalize to `? extends Envelope`
in `smoke-tests/apps/ConnectionStringOverrides/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/ConnectionStringOverridesTest.java`
#### Snippet
```java
  }

  private static void verifyHttpServerPreAggregatedMetrics(List<Envelope> metrics, String iKey) {
    assertThat(metrics.size()).isEqualTo(1);

```

### BoundedWildcard
Can generalize to `? extends Envelope`
in `smoke-tests/apps/HttpPreaggregatedMetrics/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/HttpPreaggregatedMetricsTest.java`
#### Snippet
```java
  }

  private static void verifyHttpClientPreAggregatedMetrics(List<Envelope> metrics) {
    assertThat(metrics.size()).isEqualTo(3);
    // sort metrics based on result code
```

### BoundedWildcard
Can generalize to `? extends Envelope`
in `smoke-tests/apps/HttpPreaggregatedMetrics/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/HttpPreaggregatedMetricsTest.java`
#### Snippet
```java

  private static void verifyHttpServerPreAggregatedMetrics(
      List<Envelope> metrics, boolean synthetic) {
    assertThat(metrics.size()).isEqualTo(1);
    // 1st pre-aggregated metric
```

### BoundedWildcard
Can generalize to `? extends Envelope`
in `smoke-tests/apps/InstrumentationKeyOverrides/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/InstrumentationKeyOverridesTest.java`
#### Snippet
```java
  }

  private static void verifyHttpServerPreAggregatedMetrics(List<Envelope> metrics, String iKey) {
    assertThat(metrics.size()).isEqualTo(1);

```

### BoundedWildcard
Can generalize to `? extends Envelope`
in `smoke-tests/apps/InstrumentationKeyOverrides/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/InstrumentationKeyOverridesTest.java`
#### Snippet
```java
  }

  private static void verifyHttpClientPreAggregatedMetrics(List<Envelope> metrics, String iKey) {
    assertThat(metrics.size()).isEqualTo(1);

```

### BoundedWildcard
Can generalize to `? super Envelope`
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/fakeingestion/MockedAppInsightsIngestionServlet.java`
#### Snippet
```java

  List<Envelope> waitForItems(
      Predicate<Envelope> condition, int numItems, long timeout, TimeUnit timeUnit)
      throws InterruptedException, TimeoutException {
    Stopwatch stopwatch = Stopwatch.createStarted();
```

### BoundedWildcard
Can generalize to `? super RemoteDependencyData`
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/SmokeTestExtension.java`
#### Snippet
```java
  }

  protected Telemetry getTelemetry(int rddCount, Predicate<RemoteDependencyData> condition)
      throws Exception {

```

### BoundedWildcard
Can generalize to `? super Envelope`
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/fakeingestion/MockedAppInsightsIngestionServer.java`
#### Snippet
```java

  public List<Envelope> waitForItems(
      String type, int numItems, @Nullable String operationId, Predicate<Envelope> condition)
      throws InterruptedException, ExecutionException, TimeoutException {
    List<Envelope> items =
```

### BoundedWildcard
Can generalize to `? extends Envelope`
in `smoke-tests/apps/PreAggMetricsWithRoleNameOverridesAndSampling/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/PreAggMetricsWithRoleNameOverridesAndSamplingTest.java`
#### Snippet
```java

  private static void verifyPreAggMetrics(
      List<Envelope> metrics, String roleName, boolean isClient) {
    for (Envelope envelope : metrics) {
      validateTags(envelope, roleName);
```

### BoundedWildcard
Can generalize to `? extends Envelope`
in `smoke-tests/apps/PreAggMetricsWithRoleNameOverridesAndSampling/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/PreAggMetricsWithRoleNameOverridesAndSamplingTest.java`
#### Snippet
```java

  private static void verifySamplingRateAndRoleNameOverrides(
      List<Envelope> requestEnvelopes, String roleName) throws Exception {
    List<Envelope> messageEnvelopes =
        testing.mockedIngestion.getItemsEnvelopeDataType("MessageData");
```

## RuleId[ruleID=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/FirstEntryPoint.java`
#### Snippet
```java
  private static String agentVersion = "(unknown)";

  @Nullable private static volatile Logger startupLogger;

  public static RpConfiguration getRpConfiguration() {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/AppIdSupplier.java`
#### Snippet
```java
  private final TelemetryClient telemetryClient;

  @Nullable private volatile String appId;

  // TODO (kryalama) do we still need this AtomicBoolean, or can we use throttling built in to the
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/Profiler.java`
#### Snippet
```java
  private final Object activeRecordingLock = new Object();
  @Nullable private Recording activeRecording = null;
  @Nullable private File activeRecordingFile = null;

  private final RecordingConfiguration memoryRecordingConfiguration;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/Profiler.java`
#### Snippet
```java

  private final Object activeRecordingLock = new Object();
  @Nullable private Recording activeRecording = null;
  @Nullable private File activeRecordingFile = null;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/SecondEntryPoint.java`
#### Snippet
```java
  @Nullable private static BatchLogRecordProcessor batchLogProcessor;
  @Nullable private static BatchSpanProcessor batchSpanProcessor;
  @Nullable private static MetricReader metricReader;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/SecondEntryPoint.java`
#### Snippet
```java
  @Nullable public static AgentLogExporter agentLogExporter;

  @Nullable private static BatchLogRecordProcessor batchLogProcessor;
  @Nullable private static BatchSpanProcessor batchSpanProcessor;
  @Nullable private static MetricReader metricReader;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/SecondEntryPoint.java`
#### Snippet
```java

  @Nullable private static BatchLogRecordProcessor batchLogProcessor;
  @Nullable private static BatchSpanProcessor batchSpanProcessor;
  @Nullable private static MetricReader metricReader;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/SecondEntryPoint.java`
#### Snippet
```java
      new ClientLogger("com.microsoft.applicationinsights.agent");

  @Nullable public static AgentLogExporter agentLogExporter;

  @Nullable private static BatchLogRecordProcessor batchLogProcessor;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/service/ServiceProfilerClient.java`
#### Snippet
```java
  private final String instrumentationKey;
  private final HttpPipeline httpPipeline;
  @Nullable private final String userAgent;

  public ServiceProfilerClient(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/sampling/SamplingOverrides.java`
#### Snippet
```java
    private final Attributes attributes;
    private boolean initialized;
    @Nullable private String value;

    private LazyHttpUrl(Attributes attributes) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/telemetry/TelemetryClient.java`
#### Snippet
```java
  private final List<MetricFilter> metricFilters;

  @Nullable private volatile QuickPulse quickPulse;

  private final StatsbeatModule statsbeatModule;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/telemetry/TelemetryClient.java`
#### Snippet
```java

  private final Object batchItemProcessorInitLock = new Object();
  @Nullable private volatile BatchItemProcessor generalBatchItemProcessor;
  @Nullable private volatile BatchItemProcessor metricsBatchItemProcessor;
  @Nullable private volatile BatchItemProcessor statsbeatBatchItemProcessor;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/telemetry/TelemetryClient.java`
#### Snippet
```java
  @Nullable private volatile ConnectionString connectionString;
  @Nullable private volatile StatsbeatConnectionString statsbeatConnectionString;
  @Nullable private volatile String roleName;
  @Nullable private volatile String roleInstance;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/telemetry/TelemetryClient.java`
#### Snippet
```java
    private List<MetricFilter> metricFilters;
    private StatsbeatModule statsbeatModule;
    @Nullable private File tempDir;
    private int generalExportQueueCapacity;
    private int metricsExportQueueCapacity;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/telemetry/TelemetryClient.java`
#### Snippet
```java
    @Nullable private ConnectionString connectionString;
    @Nullable private StatsbeatConnectionString statsbeatConnectionString;
    @Nullable private String roleName;
    @Nullable private String roleInstance;
    private int diskPersistenceMaxSizeMb;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/telemetry/TelemetryClient.java`
#### Snippet
```java
  @Nullable private volatile StatsbeatConnectionString statsbeatConnectionString;
  @Nullable private volatile String roleName;
  @Nullable private volatile String roleInstance;

  // globalTags contain:
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/telemetry/TelemetryClient.java`
#### Snippet
```java
    private int metricsExportQueueCapacity;
    @Nullable private Configuration.AadAuthentication aadAuthentication;
    @Nullable private ConnectionString connectionString;
    @Nullable private StatsbeatConnectionString statsbeatConnectionString;
    @Nullable private String roleName;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/telemetry/TelemetryClient.java`
#### Snippet
```java
  private final Object batchItemProcessorInitLock = new Object();
  @Nullable private volatile BatchItemProcessor generalBatchItemProcessor;
  @Nullable private volatile BatchItemProcessor metricsBatchItemProcessor;
  @Nullable private volatile BatchItemProcessor statsbeatBatchItemProcessor;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/telemetry/TelemetryClient.java`
#### Snippet
```java

  private final StatsbeatModule statsbeatModule;
  @Nullable private final File tempDir;
  private final int generalExportQueueCapacity;
  private final int metricsExportQueueCapacity;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/telemetry/TelemetryClient.java`
#### Snippet
```java
    @Nullable private Configuration.AadAuthentication aadAuthentication;
    @Nullable private ConnectionString connectionString;
    @Nullable private StatsbeatConnectionString statsbeatConnectionString;
    @Nullable private String roleName;
    @Nullable private String roleInstance;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/telemetry/TelemetryClient.java`
#### Snippet
```java

  @Nullable private volatile ConnectionString connectionString;
  @Nullable private volatile StatsbeatConnectionString statsbeatConnectionString;
  @Nullable private volatile String roleName;
  @Nullable private volatile String roleInstance;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/telemetry/TelemetryClient.java`
#### Snippet
```java
  @Nullable private volatile BatchItemProcessor generalBatchItemProcessor;
  @Nullable private volatile BatchItemProcessor metricsBatchItemProcessor;
  @Nullable private volatile BatchItemProcessor statsbeatBatchItemProcessor;

  public static TelemetryClient.Builder builder() {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/telemetry/TelemetryClient.java`
#### Snippet
```java
    private int generalExportQueueCapacity;
    private int metricsExportQueueCapacity;
    @Nullable private Configuration.AadAuthentication aadAuthentication;
    @Nullable private ConnectionString connectionString;
    @Nullable private StatsbeatConnectionString statsbeatConnectionString;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/telemetry/TelemetryClient.java`
#### Snippet
```java
  private static final String STATSBEAT_FOLDER_NAME = "statsbeat";

  @Nullable private static volatile TelemetryClient active;

  @Nullable private volatile ConnectionString connectionString;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/telemetry/TelemetryClient.java`
#### Snippet
```java
  @Nullable private static volatile TelemetryClient active;

  @Nullable private volatile ConnectionString connectionString;
  @Nullable private volatile StatsbeatConnectionString statsbeatConnectionString;
  @Nullable private volatile String roleName;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/telemetry/TelemetryClient.java`
#### Snippet
```java
    @Nullable private StatsbeatConnectionString statsbeatConnectionString;
    @Nullable private String roleName;
    @Nullable private String roleInstance;
    private int diskPersistenceMaxSizeMb;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/telemetry/TelemetryClient.java`
#### Snippet
```java
  private final int diskPersistenceMaxSizeMb;

  @Nullable private final Configuration.AadAuthentication aadAuthentication;

  private final Object batchItemProcessorInitLock = new Object();
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/processors/AgentProcessor.java`
#### Snippet
```java
public abstract class AgentProcessor {

  @Nullable private final IncludeExclude include;
  @Nullable private final IncludeExclude exclude;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/processors/AgentProcessor.java`
#### Snippet
```java

  @Nullable private final IncludeExclude include;
  @Nullable private final IncludeExclude exclude;

  protected AgentProcessor(@Nullable IncludeExclude include, @Nullable IncludeExclude exclude) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/perfcounter/PerformanceCounterContainer.java`
#### Snippet
```java
  private final List<PerformanceCounter> performanceCounters = new CopyOnWriteArrayList<>();

  @Nullable private volatile AvailableJmxMetricLogger availableJmxMetricLogger;

  private volatile boolean initialized = false;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/legacyheaders/AiLegacyHeaderSpanProcessor.java`
#### Snippet
```java
    private final SpanContext spanContext;
    private final String legacyParentId;
    @Nullable private final String legacyRootId;

    private static LegacyIds fromContext(Context context) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-profiler/agent-alerting/src/main/java/com/microsoft/applicationinsights/alerting/analysis/aggregations/Aggregation.java`
#### Snippet
```java
/** A process that consumes data points and computes metrics. */
public abstract class Aggregation {
  @Nullable protected DoubleConsumer consumer = null;

  /** Add new data to the aggregation. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-bootstrap/src/main/java/com/microsoft/applicationinsights/agent/bootstrap/AzureFunctions.java`
#### Snippet
```java

  private static volatile Supplier<Boolean> hasConnectionString;
  @Nullable private static volatile Runnable configure;

  public static void setup(Supplier<Boolean> hasConnectionString, Runnable initializer) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java
    public final ProcessorActionType action;
    public final String value;
    @Nullable public final AttributeKey<String> fromAttribute;
    @Nullable public final ExtractAttribute extractAttribute;
    @Nullable public final MaskAttribute maskAttribute;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java

    // this config option only existed in one BETA release (3.4.0-BETA)
    @Deprecated @Nullable public Boolean includingStandaloneTelemetry;

    // not using include/exclude, because you can still get exclude with this by adding a second
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java

  public static class SamplingOverride {
    @Deprecated @Nullable public SpanKind spanKind;

    // TODO (trask) make this required when moving out of preview
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java
  public static class SamplingOverrideAttribute {
    public String key;
    @Nullable public String value;
    @Nullable public MatchType matchType;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java
    public String cpuTriggeredSettings = "profile-without-env-data";
    public String manualTriggeredSettings = "profile-without-env-data";
    @Nullable public String serviceProfilerFrontEndPoint = null;
    public boolean enableDiagnostics = false;
    public boolean enableRequestTriggering = false;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java
    public final String value;
    @Nullable public final AttributeKey<String> fromAttribute;
    @Nullable public final ExtractAttribute extractAttribute;
    @Nullable public final MaskAttribute maskAttribute;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java
    // default is 5 requests per second (set in ConfigurationBuilder if neither percentage nor
    // requestsPerSecond was configured)
    @Nullable public Double requestsPerSecond;

    // this config option only existed in one BETA release (3.4.0-BETA)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java

    // fixed percentage of requests
    @Nullable public Double percentage;

    // default is 5 requests per second (set in ConfigurationBuilder if neither percentage nor
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java

  public static class ProcessorAction {
    @Nullable public final AttributeKey<String> key;
    public final ProcessorActionType action;
    public final String value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java
    // TODO (trask) make this required when moving out of preview
    //   for now the default is both "request" and "dependency" for backwards compatibility
    @Nullable public SamplingTelemetryType telemetryType;

    // this config option existed in one GA release (3.4.0), and was then replaced by telemetryType
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java
    @Nullable public final AttributeKey<String> fromAttribute;
    @Nullable public final ExtractAttribute extractAttribute;
    @Nullable public final MaskAttribute maskAttribute;

    @JsonCreator
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java
    public String key;
    @Nullable public String value;
    @Nullable public MatchType matchType;

    private void validate() {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java

    // this config option only existed in one BETA release (3.4.0-BETA)
    @Deprecated @Nullable public Double limitPerSecond;
  }

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java

    // this config option existed in one GA release (3.4.0), and was then replaced by telemetryType
    @Deprecated @Nullable public SamplingTelemetryType telemetryKind;

    // this config option only existed in one BETA release (3.4.0-BETA)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-bootstrap/src/main/java/io/opentelemetry/instrumentation/api/instrumenter/InstrumenterBuilder.java`
#### Snippet
```java
  private final List<OperationMetrics> operationMetrics = new ArrayList<>();

  @Nullable private String instrumentationVersion;
  @Nullable private String schemaUrl = null;
  SpanKindExtractor<? super REQUEST> spanKindExtractor = SpanKindExtractor.alwaysInternal();
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `agent/agent-bootstrap/src/main/java/io/opentelemetry/instrumentation/api/instrumenter/InstrumenterBuilder.java`
#### Snippet
```java

  @Nullable private String instrumentationVersion;
  @Nullable private String schemaUrl = null;
  SpanKindExtractor<? super REQUEST> spanKindExtractor = SpanKindExtractor.alwaysInternal();
  SpanStatusExtractor<? super REQUEST, ? super RESPONSE> spanStatusExtractor =
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@reactor.util.annotation.Nullable'
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/logging/OperationLogger.java`
#### Snippet
```java
  public static final OperationLogger NOOP = new OperationLogger(null);

  @Nullable private final AggregatingLogger aggregatingLogger;

  public OperationLogger(Class<?> source, String operation) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@reactor.util.annotation.Nullable'
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/quickpulse/QuickPulseHeaderInfo.java`
#### Snippet
```java

  private final QuickPulseStatus quickPulseStatus;
  @Nullable private final String qpsServiceEndpointRedirect;
  private final long qpsServicePollingInterval;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@reactor.util.annotation.Nullable'
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/quickpulse/QuickPulseCoordinator.java`
#### Snippet
```java
  private static final ClientLogger logger = new ClientLogger(QuickPulseCoordinator.class);

  @Nullable private String qpsServiceRedirectedEndpoint;
  private long qpsServicePollingIntervalHintMillis;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `classic-sdk/core/src/main/java/com/microsoft/applicationinsights/internal/schemav2/DataPoint.java`
#### Snippet
```java
  @Nullable private Double min;
  @Nullable private Double max;
  @Nullable private Double stdDev;

  public DataPoint() {}
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `classic-sdk/core/src/main/java/com/microsoft/applicationinsights/internal/schemav2/DataPoint.java`
#### Snippet
```java
  private double value;
  @Nullable private Integer count;
  @Nullable private Double min;
  @Nullable private Double max;
  @Nullable private Double stdDev;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `classic-sdk/core/src/main/java/com/microsoft/applicationinsights/internal/schemav2/DataPoint.java`
#### Snippet
```java
  @Nullable private Integer count;
  @Nullable private Double min;
  @Nullable private Double max;
  @Nullable private Double stdDev;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `classic-sdk/core/src/main/java/com/microsoft/applicationinsights/internal/schemav2/DataPoint.java`
#### Snippet
```java
  private DataPointType kind = DataPointType.Measurement;
  private double value;
  @Nullable private Integer count;
  @Nullable private Double min;
  @Nullable private Double max;
```

## RuleId[ruleID=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `etw/java/src/main/java/com/microsoft/applicationinsights/agent/bootstrap/diagnostics/etw/DllFileUtils.java`
#### Snippet
```java
    if (!result.isDirectory()) {
      // Noinspection ResultOfMethodCallIgnored
      result.mkdirs();
    }
    return result;
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `etw/java/src/main/java/com/microsoft/applicationinsights/agent/bootstrap/diagnostics/etw/DllFileUtils.java`
#### Snippet
```java

    if (!dllPath.exists()) {
      dllPath.mkdirs();
    }

```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/Profiler.java`
#### Snippet
```java
      throws IOException, JfrStreamingException {
    if (recordingFile.exists()) {
      recordingFile.delete();
    }
    recordingFile.createNewFile();
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/Profiler.java`
#### Snippet
```java
      recordingFile.delete();
    }
    recordingFile.createNewFile();

    try (BufferedInputStream stream = new BufferedInputStream(recording.getStream(null, null));
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/logbackpatch/FixedWindowRollingPolicy.java`
#### Snippet
```java

      if (file.exists()) {
        file.delete();
      }

```

### IgnoreResultOfCall
Result of `Response.code()` is ignored
in `smoke-tests/apps/HttpClients/src/main/java/com/microsoft/applicationinsights/smoketestapp/HttpClientServlet.java`
#### Snippet
```java
    okhttp3.Response response = client.newCall(request).execute();
    response.body().close();
    response.code();
  }

```

## RuleId[ruleID=FunctionalExpressionCanBeFolded]
### FunctionalExpressionCanBeFolded
Lambda can be replaced with call qualifier
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/config/ConfigService.java`
#### Snippet
```java
      pullSettings()
          .doOnError(e -> logger.error("Error pulling service profiler settings", e))
          .subscribe(config -> updateListener.accept(config));
    } catch (Throwable t) {
      logger.error("Error pulling service profiler settings", t);
```

## RuleId[ruleID=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/perfcounter/AbstractJmxPerformanceCounter.java`
#### Snippet
```java
          try {
            if (obj instanceof Boolean) {
              value = ((Boolean) obj).booleanValue() ? 1 : 0;
            } else {
              value += Double.parseDouble(String.valueOf(obj));
```

## RuleId[ruleID=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `FileNamePattern` is the same as one of its superclass' names
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/logbackpatch/FileNamePattern.java`
#### Snippet
```java
import ch.qos.logback.core.Context;

public class FileNamePattern extends ch.qos.logback.core.rolling.helper.FileNamePattern {

  public FileNamePattern(String patternArg, Context contextArg) {
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `etw/java/src/main/java/com/microsoft/applicationinsights/agent/bootstrap/diagnostics/etw/DllFileUtils.java`
#### Snippet
```java

        int bytesRead;
        while ((bytesRead = in.read(buffer)) != -1) { // while not EOF
          out.write(buffer, 0, bytesRead);
        }
```

### NestedAssignment
Result of assignment expression used
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/Profiler.java`
#### Snippet
```java
      int read;
      byte[] buffer = new byte[10 * 1024];
      while ((read = stream.read(buffer)) != -1) {
        fos.write(buffer, 0, read);
      }
```

## RuleId[ruleID=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/statsbeat/NetworkStatsbeatHttpPipelinePolicy.java`
#### Snippet
```java
            })
        .doOnError(
            throwable -> {
              networkStatsbeat.incrementExceptionCount(
                  instrumentationKey,
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/telemetry/BatchItemProcessor.java`
#### Snippet
```java
          pendingExports.add(result);
          result.whenComplete(
              () -> {
                pendingExports.remove(result);
              });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `agent/instrumentation/micrometer-1.0/src/test/java/MicrometerTest.java`
#### Snippet
```java
    ExecutorService executor = Executors.newCachedThreadPool();
    executor.execute(
        () -> {
          timer.record(
              () -> {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `agent/instrumentation/micrometer-1.0/src/test/java/MicrometerTest.java`
#### Snippet
```java
        });
    executor.execute(
        () -> {
          timer.record(
              () -> {
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `managedPools` are updated, but never queried
in `agent/agent-gc-monitor/gc-monitor-core/src/main/java/com/microsoft/gcmonitor/collectors/JmxGarbageCollectorStats.java`
#### Snippet
```java
public class JmxGarbageCollectorStats implements GarbageCollectorStats {

  private final List<MemoryPool> managedPools;
  private final IncrementalCounter countCounter;
  private final IncrementalCounter timeCounter;
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `task` is accessed in both synchronized and unsynchronized contexts
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/AppIdSupplier.java`
#### Snippet
```java

  // guarded by taskLock
  private GetAppIdTask task;
  private final Object taskLock = new Object();

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `activeRecordingFile` is accessed in both synchronized and unsynchronized contexts
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/Profiler.java`
#### Snippet
```java
  private final Object activeRecordingLock = new Object();
  @Nullable private Recording activeRecording = null;
  @Nullable private File activeRecordingFile = null;

  private final RecordingConfiguration memoryRecordingConfiguration;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `activeRecording` is accessed in both synchronized and unsynchronized contexts
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/Profiler.java`
#### Snippet
```java

  private final Object activeRecordingLock = new Object();
  @Nullable private Recording activeRecording = null;
  @Nullable private File activeRecordingFile = null;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `recordingOptionsBuilder` is accessed in both synchronized and unsynchronized contexts
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/Profiler.java`
#### Snippet
```java

  private FlightRecorderConnection flightRecorderConnection;
  private RecordingOptions.Builder recordingOptionsBuilder;

  private final AlertConfiguration periodicConfig;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `collectionFrequencyInMillis` is accessed in both synchronized and unsynchronized contexts
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/perfcounter/PerformanceCounterContainer.java`
#### Snippet
```java
  private volatile boolean initialized = false;

  private long collectionFrequencyInMillis = DEFAULT_COLLECTION_FREQUENCY_IN_SEC * 1000;

  private ScheduledThreadPoolExecutor threads;
```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
The method is empty
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/classicsdk/DependencyTelemetryClassFileTransformer.java`
#### Snippet
```java
  //   implementation("org.ow2.asm:asm-util:9.3")
  //
  public static void main(String[] args) {
    // ASMifier.main(new String[]{Rdt.class.getName()});
  }
```

### EmptyMethod
The method is empty
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/classicsdk/ExceptionTelemetryClassFileTransformer.java`
#### Snippet
```java
  //   implementation("org.ow2.asm:asm-util:9.3")
  //
  public static void main(String[] args) {
    // ASMifier.main(new String[] {Rdt.class.getName()});
  }
```

### EmptyMethod
The method is empty
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/classicsdk/RequestTelemetryClassFileTransformer.java`
#### Snippet
```java
  //   implementation("org.ow2.asm:asm-util:9.3")
  //
  public static void main(String[] args) {
    // ASMifier.main(new String[]{Rdt.class.getName()});
  }
```

### EmptyMethod
The method is empty
in `classic-sdk/core/src/main/java/com/microsoft/applicationinsights/TelemetryClient.java`
#### Snippet
```java
   * application.
   */
  public void flush() {
    // Javaagent provides implementation
  }
```

### EmptyMethod
The method is empty
in `classic-sdk/core/src/main/java/com/microsoft/applicationinsights/TelemetryClient.java`
#### Snippet
```java
   * @param telemetry The {@link com.microsoft.applicationinsights.telemetry.Telemetry} instance.
   */
  public void track(Telemetry telemetry) {
    // Javaagent provides implementation
  }
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/Profiler.java`
#### Snippet
```java
  private final Object activeRecordingLock = new Object();
  @Nullable private Recording activeRecording = null;
  @Nullable private File activeRecordingFile = null;

  private final RecordingConfiguration memoryRecordingConfiguration;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/Profiler.java`
#### Snippet
```java

  private final Object activeRecordingLock = new Object();
  @Nullable private Recording activeRecording = null;
  @Nullable private File activeRecordingFile = null;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/perfcounter/GcPerformanceCounter.java`
#### Snippet
```java

  private long currentTotalCount = 0;
  private long currentTotalTime = 0;

  @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/perfcounter/GcPerformanceCounter.java`
#### Snippet
```java
  private static final String GC_TOTAL_TIME = "GC Total Time";

  private long currentTotalCount = 0;
  private long currentTotalTime = 0;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/perfcounter/PerformanceCounterContainer.java`
#### Snippet
```java
  @Nullable private volatile AvailableJmxMetricLogger availableJmxMetricLogger;

  private volatile boolean initialized = false;

  private long collectionFrequencyInMillis = DEFAULT_COLLECTION_FREQUENCY_IN_SEC * 1000;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/perfcounter/AbstractJmxPerformanceCounter.java`
#### Snippet
```java
  private final String objectName;
  private final Collection<JmxAttributeData> attributes;
  private boolean alreadyLogged = false;

  /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `agent/agent-profiler/agent-alerting/src/main/java/com/microsoft/applicationinsights/alerting/analysis/aggregations/Aggregation.java`
#### Snippet
```java
/** A process that consumes data points and computes metrics. */
public abstract class Aggregation {
  @Nullable protected DoubleConsumer consumer = null;

  /** Add new data to the aggregation. */
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `agent/agent-profiler/agent-alerting/src/main/java/com/microsoft/applicationinsights/alerting/analysis/aggregations/RollingAverage.java`
#### Snippet
```java
  private static class RollingAverageSample implements BucketData<TelemetryDataPoint> {
    int sampleCount = 0;
    double totalTime = 0;

    @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `agent/agent-profiler/agent-alerting/src/main/java/com/microsoft/applicationinsights/alerting/analysis/aggregations/RollingAverage.java`
#### Snippet
```java

  private static class RollingAverageSample implements BucketData<TelemetryDataPoint> {
    int sampleCount = 0;
    double totalTime = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `agent/agent-profiler/agent-alerting/src/main/java/com/microsoft/applicationinsights/alerting/analysis/aggregations/BreachedRatio.java`
#### Snippet
```java

  private static class BreachedCountBucket implements BucketData<Boolean> {
    int totalCount = 0;
    int breachedCount = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `agent/agent-profiler/agent-alerting/src/main/java/com/microsoft/applicationinsights/alerting/analysis/aggregations/BreachedRatio.java`
#### Snippet
```java
  private static class BreachedCountBucket implements BucketData<Boolean> {
    int totalCount = 0;
    int breachedCount = 0;

    @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java
    @Nullable public String serviceProfilerFrontEndPoint = null;
    public boolean enableDiagnostics = false;
    public boolean enableRequestTriggering = false;
    public RequestTrigger[] requestTriggerEndpoints = {};
  }
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java
    // Minimum number of samples that must have been collected in order for the aggregation to
    // produce data. Avoids volatile aggregation output on small sample sizes.
    public int minimumSamples = 0;
  }

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java
    public int periodicRecordingDurationSeconds = 120;
    public int periodicRecordingIntervalSeconds = 60 * 60;
    public boolean enabled = false;
    public String memoryTriggeredSettings = "profile-without-env-data";
    public String cpuTriggeredSettings = "profile-without-env-data";
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java
    public String cpuTriggeredSettings = "profile-without-env-data";
    public String manualTriggeredSettings = "profile-without-env-data";
    @Nullable public String serviceProfilerFrontEndPoint = null;
    public boolean enableDiagnostics = false;
    public boolean enableRequestTriggering = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java
    // disabled is used by customer to turn off non-essential Statsbeat, e.g. disk persistence
    // operation status, optional network statsbeat, other endpoints except Breeze, etc.
    public boolean disabled = false;
  }

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java
    // disabledAll is used internally as an emergency kill-switch to turn off Statsbeat completely
    // when something goes wrong.
    public boolean disabledAll = false;

    public String instrumentationKey;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java
    public String manualTriggeredSettings = "profile-without-env-data";
    @Nullable public String serviceProfilerFrontEndPoint = null;
    public boolean enableDiagnostics = false;
    public boolean enableRequestTriggering = false;
    public RequestTrigger[] requestTriggerEndpoints = {};
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `agent/agent-bootstrap/src/main/java/io/opentelemetry/instrumentation/api/instrumenter/InstrumenterBuilder.java`
#### Snippet
```java

  @Nullable private String instrumentationVersion;
  @Nullable private String schemaUrl = null;
  SpanKindExtractor<? super REQUEST> spanKindExtractor = SpanKindExtractor.alwaysInternal();
  SpanStatusExtractor<? super REQUEST, ? super RESPONSE> spanStatusExtractor =
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/heartbeat/HeartBeatPropertyPayload.java`
#### Snippet
```java

  /** Is this healthy property or not. */
  private boolean isHealthy = false;

  /** Returns the payload value. */
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/quickpulse/QuickPulseDataSender.java`
#### Snippet
```java
  private final HttpPipeline httpPipeline;
  private volatile QuickPulseHeaderInfo quickPulseHeaderInfo;
  private long lastValidTransmission = 0;

  private final ArrayBlockingQueue<HttpRequest> sendQueue;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/quickpulse/QuickPulseCoordinator.java`
#### Snippet
```java
  private long qpsServicePollingIntervalHintMillis;

  private volatile boolean stopped = false;
  private volatile boolean pingMode = true;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/quickpulse/QuickPulsePingSender.java`
#### Snippet
```java
  private final String machineName;
  private final String quickPulseId;
  private long lastValidTransmission = 0;
  private final String sdkVersion;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `classic-sdk/core/src/main/java/com/microsoft/applicationinsights/internal/schemav2/PageViewData.java`
#### Snippet
```java

  private URI uri;
  private long duration = 0;

  public PageViewData() {}
```

## RuleId[ruleID=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/perfcounter/GcPerformanceCounter.java`
#### Snippet
```java
  @Override
  public void report(TelemetryClient telemetryClient) {
    synchronized (this) {
      List<GarbageCollectorMXBean> gcs = ManagementFactory.getGarbageCollectorMXBeans();
      if (gcs.isEmpty()) {
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `etw/java/src/main/java/com/microsoft/applicationinsights/agent/bootstrap/diagnostics/etw/events/model/IpaEtwEventBase.java`
#### Snippet
```java
  private String logger;
  private String messageFormat;
  private Object[] messageArgs = new Object[0];
  private String operation;

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/httpclient/SslOptionsUtil.java`
#### Snippet
```java
      }
    }
    return supported.toArray(new String[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/httpclient/LazyHttpClient.java`
#### Snippet
```java
    policies.add(new HttpLoggingPolicy(new HttpLogOptions()));
    HttpPipelineBuilder pipelineBuilder = new HttpPipelineBuilder().httpClient(INSTANCE);
    pipelineBuilder.policies(policies.toArray(new HttpPipelinePolicy[0]));
    return pipelineBuilder.build();
  }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java
    public boolean enableDiagnostics = false;
    public boolean enableRequestTriggering = false;
    public RequestTrigger[] requestTriggerEndpoints = {};
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `agent/instrumentation/methods/src/main/java/io/opentelemetry/javaagent/instrumentation/methods/ai/MethodInstrumentation.java`
#### Snippet
```java
  public void transform(TypeTransformer transformer) {
    transformer.applyAdviceToMethod(
        namedOneOf(methodNames.toArray(new String[0])),
        MethodInstrumentation.class.getName() + "$MethodAdvice");
  }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/AzureMonitorExporterBuilder.java`
#### Snippet
```java
    policies.add(new HttpLoggingPolicy(httpLogOptions));
    return new HttpPipelineBuilder()
        .policies(policies.toArray(new HttpPipelinePolicy[0]))
        .httpClient(httpClient)
        .build();
```

## RuleId[ruleID=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `smoke-tests/apps/SpringBoot/src/main/java/com/microsoft/applicationinsights/smoketestapp/TestController.java`
#### Snippet
```java
  public String trackEventSpringBoot() {
    Map<String, String> properties =
        new HashMap<String, String>() {
          {
            put("key", "value");
```

### DoubleBraceInitialization
Double brace initialization
in `smoke-tests/apps/SpringBoot/src/main/java/com/microsoft/applicationinsights/smoketestapp/TestController.java`
#### Snippet
```java
        };
    Map<String, Double> metrics =
        new HashMap<String, Double>() {
          {
            put("key", 1d);
```

### DoubleBraceInitialization
Double brace initialization
in `smoke-tests/apps/CoreAndFilter2x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackTraceServlet.java`
#### Snippet
```java
  protected void doGet(HttpServletRequest request, HttpServletResponse response) {
    Map<String, String> properties =
        new HashMap<String, String>() {
          {
            put("key", "value");
```

### DoubleBraceInitialization
Double brace initialization
in `smoke-tests/apps/CoreAndFilter2x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackEventServlet.java`
#### Snippet
```java
        };
    Map<String, Double> metrics =
        new HashMap<String, Double>() {
          {
            put("key", 1d);
```

### DoubleBraceInitialization
Double brace initialization
in `smoke-tests/apps/CoreAndFilter2x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackEventServlet.java`
#### Snippet
```java

    Map<String, String> properties =
        new HashMap<String, String>() {
          {
            put("key", "value");
```

### DoubleBraceInitialization
Double brace initialization
in `smoke-tests/apps/CoreAndFilter2x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackExceptionServlet.java`
#### Snippet
```java
        };
    Map<String, Double> metrics =
        new HashMap<String, Double>() {
          {
            put("key", 1d);
```

### DoubleBraceInitialization
Double brace initialization
in `smoke-tests/apps/CoreAndFilter2x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackExceptionServlet.java`
#### Snippet
```java

    Map<String, String> properties =
        new HashMap<String, String>() {
          {
            put("key", "value");
```

### DoubleBraceInitialization
Double brace initialization
in `smoke-tests/apps/CoreAndFilter3x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackTraceServlet.java`
#### Snippet
```java
  protected void doGet(HttpServletRequest request, HttpServletResponse response) {
    Map<String, String> properties =
        new HashMap<String, String>() {
          {
            put("key", "value");
```

### DoubleBraceInitialization
Double brace initialization
in `smoke-tests/apps/CoreAndFilter3x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackEventServlet.java`
#### Snippet
```java
        };
    Map<String, Double> metrics =
        new HashMap<String, Double>() {
          {
            put("key", 1d);
```

### DoubleBraceInitialization
Double brace initialization
in `smoke-tests/apps/CoreAndFilter3x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackEventServlet.java`
#### Snippet
```java

    Map<String, String> properties =
        new HashMap<String, String>() {
          {
            put("key", "value");
```

### DoubleBraceInitialization
Double brace initialization
in `smoke-tests/apps/CoreAndFilter3x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackExceptionServlet.java`
#### Snippet
```java
        };
    Map<String, Double> metrics =
        new HashMap<String, Double>() {
          {
            put("key", 1d);
```

### DoubleBraceInitialization
Double brace initialization
in `smoke-tests/apps/CoreAndFilter3x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackExceptionServlet.java`
#### Snippet
```java

    Map<String, String> properties =
        new HashMap<String, String>() {
          {
            put("key", "value");
```

### DoubleBraceInitialization
Double brace initialization
in `smoke-tests/apps/CoreAndFilter3xUsingOld3xAgent/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackTraceServlet.java`
#### Snippet
```java
  protected void doGet(HttpServletRequest request, HttpServletResponse response) {
    Map<String, String> properties =
        new HashMap<String, String>() {
          {
            put("key", "value");
```

### DoubleBraceInitialization
Double brace initialization
in `smoke-tests/apps/CoreAndFilter3xUsingOld3xAgent/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackEventServlet.java`
#### Snippet
```java
        };
    Map<String, Double> metrics =
        new HashMap<String, Double>() {
          {
            put("key", 1d);
```

### DoubleBraceInitialization
Double brace initialization
in `smoke-tests/apps/CoreAndFilter3xUsingOld3xAgent/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackEventServlet.java`
#### Snippet
```java

    Map<String, String> properties =
        new HashMap<String, String>() {
          {
            put("key", "value");
```

### DoubleBraceInitialization
Double brace initialization
in `smoke-tests/apps/CoreAndFilter3xUsingOld3xAgent/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackExceptionServlet.java`
#### Snippet
```java
        };
    Map<String, Double> metrics =
        new HashMap<String, Double>() {
          {
            put("key", 1d);
```

### DoubleBraceInitialization
Double brace initialization
in `smoke-tests/apps/CoreAndFilter3xUsingOld3xAgent/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackExceptionServlet.java`
#### Snippet
```java

    Map<String, String> properties =
        new HashMap<String, String>() {
          {
            put("key", "value");
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
The value `configureLogging(selfDiagnostics, agentPath)` assigned to `startupLogger` is never used
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/FirstEntryPoint.java`
#### Snippet
```java
                ConfigurationBuilder.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_FILE_PATH,
                selfDiagnostics.file.path);
        startupLogger = configureLogging(selfDiagnostics, agentPath);

        logStartupFailure(isFriendlyException, message, t);
```

### UnusedAssignment
The value `context.makeCurrent()` assigned to `scope` is never used
in `agent/instrumentation/methods/src/main/java/io/opentelemetry/javaagent/instrumentation/methods/ai/MethodInstrumentation.java`
#### Snippet
```java

      context = MethodSingletons.instrumenter().start(parentContext, classAndMethod);
      scope = context.makeCurrent();
    }

```

### UnusedAssignment
The value `AsyncOperationEndSupport.create(
MethodSingletons.instrumenter(), Void.class, method.getReturnType())
.asyncEnd(context, classAndMethod, returnValue, throwable)` assigned to `returnValue` is never used
in `agent/instrumentation/methods/src/main/java/io/opentelemetry/javaagent/instrumentation/methods/ai/MethodInstrumentation.java`
#### Snippet
```java
      scope.close();

      returnValue =
          AsyncOperationEndSupport.create(
                  MethodSingletons.instrumenter(), Void.class, method.getReturnType())
```

### UnusedAssignment
The value `configs` assigned to `configurations` is never used
in `agent/instrumentation/micrometer-1.0/src/main/java/io/opentelemetry/javaagent/instrumentation/micrometer/ai/ActuatorInstrumentation.java`
#### Snippet
```java
        configs.remove(
            "com.microsoft.azure.spring.autoconfigure.metrics.AzureMonitorMetricsExportAutoConfiguration");
        configurations = configs;
      }
    }
```

### UnusedAssignment
The value `span.getSpanContext().getSpanId()` assigned to `id` is never used
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/RequestTelemetryInstrumentation.java`
#### Snippet
```java
      Span span = VirtualField.find(RequestTelemetry.class, Span.class).get(requestTelemetry);
      if (span != null) {
        id = span.getSpanContext().getSpanId();
      }
    }
```

### UnusedAssignment
The value `span.getSpanContext().getTraceFlags().asByte()` assigned to `traceflag` is never used
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/RequestTelemetryContextInstrumentation.java`
#### Snippet
```java
          VirtualField.find(RequestTelemetryContext.class, Span.class).get(requestTelemetryContext);
      if (span != null) {
        traceflag = span.getSpanContext().getTraceFlags().asByte();
      }
    }
```

### UnusedAssignment
The value `null` assigned to `tracestate` is never used
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/RequestTelemetryContextInstrumentation.java`
#### Snippet
```java
        TraceState traceState = span.getSpanContext().getTraceState();
        if (traceState.isEmpty()) {
          tracestate = null;
        } else {
          TracestateBuilder builder = new TracestateBuilder();
```

### UnusedAssignment
The value `new Tracestate(builder.toString())` assigned to `tracestate` is never used
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/RequestTelemetryContextInstrumentation.java`
#### Snippet
```java
          TracestateBuilder builder = new TracestateBuilder();
          traceState.forEach(builder);
          tracestate = new Tracestate(builder.toString());
        }
      }
```

### UnusedAssignment
The value `new SpanAttributeProperties(span)` assigned to `properties` is never used
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/BaseTelemetryInstrumentation.java`
#### Snippet
```java
          VirtualField.find(RequestTelemetry.class, Span.class).get((RequestTelemetry) telemetry);
      if (span != null) {
        properties = new SpanAttributeProperties(span);
      }
    }
```

### UnusedAssignment
The value `span.getSpanContext().getTraceId()` assigned to `id` is never used
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/OperationContextInstrumentation.java`
#### Snippet
```java
      Span span = VirtualField.find(OperationContext.class, Span.class).get(operationContext);
      if (span != null) {
        id = span.getSpanContext().getTraceId();
      }
    }
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Value `traceState` is always 'null'
in `agent/instrumentation/azure-functions/src/test/java/AzureFunctionsTest.java`
#### Snippet
```java
    String traceState = null;
    Map<String, String> attributesMap = emptyMap();
    RpcTraceContext traceContext = new MockRpcTraceContext(traceParent, traceState, attributesMap);

    String invocationId = null;
```

### ConstantValue
Value `invocationId` is always 'null'
in `agent/instrumentation/azure-functions/src/test/java/AzureFunctionsTest.java`
#### Snippet
```java

    String invocationId = null;
    InvocationRequest request = new MockInvocationRequest(traceContext, invocationId);

    AtomicReference<Context> contextRef = new AtomicReference<>();
```

## RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/service/ServiceProfilerClient.java`
#### Snippet
```java
        .append("=")
        .append(instrumentationKey)
        .append("&extension=" + extension + "&api-version=")
        .append(API_FEATURE_VERSION);
  }
```

## RuleId[ruleID=IOResource]
### IOResource
'LogExporterWithAttributeProcessor' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/SecondEntryPoint.java`
#### Snippet
```java
        switch (processorConfig.type) {
          case ATTRIBUTE:
            logExporter = new LogExporterWithAttributeProcessor(processorConfig, logExporter);
            break;
          case LOG:
```

### IOResource
'ExporterWithLogProcessor' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/SecondEntryPoint.java`
#### Snippet
```java
            break;
          case LOG:
            logExporter = new ExporterWithLogProcessor(processorConfig, logExporter);
            break;
          default:
```

### IOResource
'SpanExporterWithAttributeProcessor' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/SecondEntryPoint.java`
#### Snippet
```java
        switch (processorConfig.type) {
          case ATTRIBUTE:
            spanExporter = new SpanExporterWithAttributeProcessor(processorConfig, spanExporter);
            break;
          case SPAN:
```

### IOResource
'ExporterWithSpanProcessor' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/SecondEntryPoint.java`
#### Snippet
```java
            break;
          case SPAN:
            spanExporter = new ExporterWithSpanProcessor(processorConfig, spanExporter);
            break;
          default:
```

### IOResource
'BackCompatHttpUrlProcessor' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/SecondEntryPoint.java`
#### Snippet
```java
      // this is temporary until semantic attributes stabilize and we make breaking change
      // then can use java.util.functions.Predicate<Attributes>
      spanExporter = new BackCompatHttpUrlProcessor(spanExporter);
    }

```

### IOResource
'Jedis' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `smoke-tests/apps/Jedis/src/main/java/com/microsoft/applicationinsights/smoketestapp/JedisServlet.java`
#### Snippet
```java
  private void jedis() {
    String hostname = System.getenv("REDIS");
    Jedis jedis = new Jedis(hostname, 6379);
    jedis.get("test");
  }
```

## RuleId[ruleID=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `agent/runtime-attach/src/main/java/com/microsoft/applicationinsights/attach/ApplicationInsights.java`
#### Snippet
```java

    Optional<String> jsonConfig = findJsonConfig();
    if (jsonConfig.isPresent()) {
      System.setProperty(RUNTIME_ATTACHED_JSON_PROPERTY, jsonConfig.get());
    }
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `AddAdvice` has only 'static' members, and lacks a 'private' constructor
in `agent/instrumentation/micrometer-1.0/src/main/java/io/opentelemetry/javaagent/instrumentation/micrometer/ai/CompositeMeterRegistryInstrumentation.java`
#### Snippet
```java

  @SuppressWarnings({"unused", "PrivateConstructorForUtilityClass"})
  public static class AddAdvice {

    @Advice.OnMethodEnter(suppress = Throwable.class, skipOn = Advice.OnNonDefaultValue.class)
```

### UtilityClassWithoutPrivateConstructor
Class `StaticInitAdvice` has only 'static' members, and lacks a 'private' constructor
in `agent/instrumentation/micrometer-1.0/src/main/java/io/opentelemetry/javaagent/instrumentation/micrometer/ai/MetricsInstrumentation.java`
#### Snippet
```java

  @SuppressWarnings({"unused", "PrivateConstructorForUtilityClass"})
  public static class StaticInitAdvice {

    @Advice.OnMethodExit(suppress = Throwable.class)
```

### UtilityClassWithoutPrivateConstructor
Class `GetCandidateConfigurationsAdvice` has only 'static' members, and lacks a 'private' constructor
in `agent/instrumentation/micrometer-1.0/src/main/java/io/opentelemetry/javaagent/instrumentation/micrometer/ai/ActuatorInstrumentation.java`
#### Snippet
```java

  @SuppressWarnings({"unused", "PrivateConstructorForUtilityClass"})
  public static class GetCandidateConfigurationsAdvice {

    @Advice.OnMethodExit(suppress = Throwable.class)
```

### UtilityClassWithoutPrivateConstructor
Class `ExecuteAdvice` has only 'static' members, and lacks a 'private' constructor
in `agent/instrumentation/azure-functions/src/main/java/io/opentelemetry/javaagent/instrumentation/azurefunctions/FunctionEnvironmentReloadInstrumentation.java`
#### Snippet
```java

  @SuppressWarnings({"unused", "PrivateConstructorForUtilityClass"})
  public static class ExecuteAdvice {
    @Advice.OnMethodExit(suppress = Throwable.class)
    public static void methodExit() {
```

### UtilityClassWithoutPrivateConstructor
Class `ExecuteAdvice` has only 'static' members, and lacks a 'private' constructor
in `agent/instrumentation/azure-functions/src/main/java/io/opentelemetry/javaagent/instrumentation/azurefunctions/InvocationInstrumentation.java`
#### Snippet
```java

  @SuppressWarnings({"unused", "PrivateConstructorForUtilityClass", "MustBeClosedChecker"})
  public static class ExecuteAdvice {
    @Nullable
    @Advice.OnMethodEnter(suppress = Throwable.class)
```

### UtilityClassWithoutPrivateConstructor
Class `SetIdAdvice` has only 'static' members, and lacks a 'private' constructor
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/UserContextInstrumentation.java`
#### Snippet
```java

  @SuppressWarnings({"unused", "PrivateConstructorForUtilityClass"})
  public static class SetIdAdvice {
    @Advice.OnMethodEnter
    public static void methodEnter(
```

### UtilityClassWithoutPrivateConstructor
Class `OtherMethodsAdvice` has only 'static' members, and lacks a 'private' constructor
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/UserContextInstrumentation.java`
#### Snippet
```java

  @SuppressWarnings({"unused", "PrivateConstructorForUtilityClass"})
  public static class OtherMethodsAdvice {
    @Advice.OnMethodEnter
    public static void methodEnter(
```

### UtilityClassWithoutPrivateConstructor
Class `GetIdAdvice` has only 'static' members, and lacks a 'private' constructor
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/RequestTelemetryInstrumentation.java`
#### Snippet
```java

  @SuppressWarnings({"unused", "PrivateConstructorForUtilityClass"})
  public static class GetIdAdvice {
    @Advice.OnMethodExit
    public static void methodExit(
```

### UtilityClassWithoutPrivateConstructor
Class `SetNameAdvice` has only 'static' members, and lacks a 'private' constructor
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/RequestTelemetryInstrumentation.java`
#### Snippet
```java

  @SuppressWarnings({"unused", "PrivateConstructorForUtilityClass"})
  public static class SetNameAdvice {
    @Advice.OnMethodEnter
    public static void methodEnter(
```

### UtilityClassWithoutPrivateConstructor
Class `SetSuccessAdvice` has only 'static' members, and lacks a 'private' constructor
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/RequestTelemetryInstrumentation.java`
#### Snippet
```java

  @SuppressWarnings({"unused", "PrivateConstructorForUtilityClass"})
  public static class SetSuccessAdvice {
    @Advice.OnMethodEnter
    public static void methodEnter(
```

### UtilityClassWithoutPrivateConstructor
Class `OtherMethodsAdvice` has only 'static' members, and lacks a 'private' constructor
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/RequestTelemetryInstrumentation.java`
#### Snippet
```java

  @SuppressWarnings({"unused", "PrivateConstructorForUtilityClass"})
  public static class OtherMethodsAdvice {
    @Advice.OnMethodEnter
    public static void methodEnter(
```

### UtilityClassWithoutPrivateConstructor
Class `SetSourceAdvice` has only 'static' members, and lacks a 'private' constructor
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/RequestTelemetryInstrumentation.java`
#### Snippet
```java

  @SuppressWarnings({"unused", "PrivateConstructorForUtilityClass"})
  public static class SetSourceAdvice {
    @Advice.OnMethodEnter
    public static void methodEnter(
```

### UtilityClassWithoutPrivateConstructor
Class `GetRequestTelemetryContextAdvice` has only 'static' members, and lacks a 'private' constructor
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/ThreadContextInstrumentation.java`
#### Snippet
```java

  @SuppressWarnings({"unused", "PrivateConstructorForUtilityClass"})
  public static class GetRequestTelemetryContextAdvice {
    @Advice.OnMethodExit
    public static void methodExit(
```

### UtilityClassWithoutPrivateConstructor
Class `SetOperatingSystemAdvice` has only 'static' members, and lacks a 'private' constructor
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/DeviceContextInstrumentation.java`
#### Snippet
```java

  @SuppressWarnings({"unused", "PrivateConstructorForUtilityClass"})
  public static class SetOperatingSystemAdvice {
    @Advice.OnMethodExit
    public static void methodExit(
```

### UtilityClassWithoutPrivateConstructor
Class `OtherMethodsAdvice` has only 'static' members, and lacks a 'private' constructor
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/DeviceContextInstrumentation.java`
#### Snippet
```java

  @SuppressWarnings({"unused", "PrivateConstructorForUtilityClass"})
  public static class OtherMethodsAdvice {
    @Advice.OnMethodEnter
    public static void methodEnter(
```

### UtilityClassWithoutPrivateConstructor
Class `SetOperatingSystemVersionAdvice` has only 'static' members, and lacks a 'private' constructor
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/DeviceContextInstrumentation.java`
#### Snippet
```java

  @SuppressWarnings({"unused", "PrivateConstructorForUtilityClass"})
  public static class SetOperatingSystemVersionAdvice {
    @Advice.OnMethodExit
    public static void methodExit(
```

### UtilityClassWithoutPrivateConstructor
Class `OtherMethodsAdvice` has only 'static' members, and lacks a 'private' constructor
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/SessionContextInstrumentation.java`
#### Snippet
```java

  @SuppressWarnings({"unused", "PrivateConstructorForUtilityClass"})
  public static class OtherMethodsAdvice {
    @Advice.OnMethodEnter
    public static void methodEnter(
```

### UtilityClassWithoutPrivateConstructor
Class `SetIdAdvice` has only 'static' members, and lacks a 'private' constructor
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/SessionContextInstrumentation.java`
#### Snippet
```java

  @SuppressWarnings({"unused", "PrivateConstructorForUtilityClass"})
  public static class SetIdAdvice {
    @Advice.OnMethodExit
    public static void methodExit(
```

### UtilityClassWithoutPrivateConstructor
Class `GetTracestateAdvice` has only 'static' members, and lacks a 'private' constructor
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/RequestTelemetryContextInstrumentation.java`
#### Snippet
```java

  @SuppressWarnings({"unused", "PrivateConstructorForUtilityClass"})
  public static class GetTracestateAdvice {
    @Advice.OnMethodExit
    public static void methodExit(
```

### UtilityClassWithoutPrivateConstructor
Class `GetRequestTelemetryAdvice` has only 'static' members, and lacks a 'private' constructor
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/RequestTelemetryContextInstrumentation.java`
#### Snippet
```java

  @SuppressWarnings({"unused", "PrivateConstructorForUtilityClass"})
  public static class GetRequestTelemetryAdvice {
    @Advice.OnMethodExit
    public static void methodExit(
```

### UtilityClassWithoutPrivateConstructor
Class `GetTraceflagAdvice` has only 'static' members, and lacks a 'private' constructor
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/RequestTelemetryContextInstrumentation.java`
#### Snippet
```java

  @SuppressWarnings({"unused", "PrivateConstructorForUtilityClass"})
  public static class GetTraceflagAdvice {
    @Advice.OnMethodExit
    public static void methodExit(
```

### UtilityClassWithoutPrivateConstructor
Class `OtherMethodsAdvice` has only 'static' members, and lacks a 'private' constructor
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/RequestTelemetryContextInstrumentation.java`
#### Snippet
```java

  @SuppressWarnings({"unused", "PrivateConstructorForUtilityClass"})
  public static class OtherMethodsAdvice {
    @Advice.OnMethodEnter
    public static void methodEnter(
```

### UtilityClassWithoutPrivateConstructor
Class `GetSessionAdvice` has only 'static' members, and lacks a 'private' constructor
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/TelemetryContextInstrumentation.java`
#### Snippet
```java

  @SuppressWarnings({"unused", "PrivateConstructorForUtilityClass"})
  public static class GetSessionAdvice {
    @Advice.OnMethodExit
    public static void methodExit(
```

### UtilityClassWithoutPrivateConstructor
Class `GetDeviceAdvice` has only 'static' members, and lacks a 'private' constructor
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/TelemetryContextInstrumentation.java`
#### Snippet
```java

  @SuppressWarnings({"unused", "PrivateConstructorForUtilityClass"})
  public static class GetDeviceAdvice {
    @Advice.OnMethodExit
    public static void methodExit(
```

### UtilityClassWithoutPrivateConstructor
Class `OtherMethodsAdvice` has only 'static' members, and lacks a 'private' constructor
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/TelemetryContextInstrumentation.java`
#### Snippet
```java

  @SuppressWarnings({"unused", "PrivateConstructorForUtilityClass"})
  public static class OtherMethodsAdvice {
    @Advice.OnMethodEnter
    public static void methodEnter(
```

### UtilityClassWithoutPrivateConstructor
Class `GetOperationAdvice` has only 'static' members, and lacks a 'private' constructor
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/TelemetryContextInstrumentation.java`
#### Snippet
```java

  @SuppressWarnings({"unused", "PrivateConstructorForUtilityClass"})
  public static class GetOperationAdvice {
    @Advice.OnMethodExit
    public static void methodExit(
```

### UtilityClassWithoutPrivateConstructor
Class `GetUserAdvice` has only 'static' members, and lacks a 'private' constructor
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/TelemetryContextInstrumentation.java`
#### Snippet
```java

  @SuppressWarnings({"unused", "PrivateConstructorForUtilityClass"})
  public static class GetUserAdvice {
    @Advice.OnMethodExit
    public static void methodExit(
```

### UtilityClassWithoutPrivateConstructor
Class `OtherMethodsAdvice` has only 'static' members, and lacks a 'private' constructor
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/BaseTelemetryInstrumentation.java`
#### Snippet
```java

  @SuppressWarnings({"unused", "PrivateConstructorForUtilityClass"})
  public static class OtherMethodsAdvice {
    @Advice.OnMethodEnter
    public static void methodEnter(
```

### UtilityClassWithoutPrivateConstructor
Class `GetContextAdvice` has only 'static' members, and lacks a 'private' constructor
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/BaseTelemetryInstrumentation.java`
#### Snippet
```java

  @SuppressWarnings({"unused", "PrivateConstructorForUtilityClass"})
  public static class GetContextAdvice {
    @Advice.OnMethodExit
    public static void methodExit(
```

### UtilityClassWithoutPrivateConstructor
Class `GetPropertiesAdvice` has only 'static' members, and lacks a 'private' constructor
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/BaseTelemetryInstrumentation.java`
#### Snippet
```java

  @SuppressWarnings({"unused", "PrivateConstructorForUtilityClass"})
  public static class GetPropertiesAdvice {
    @Advice.OnMethodExit
    public static void methodExit(
```

### UtilityClassWithoutPrivateConstructor
Class `GetIdAdvice` has only 'static' members, and lacks a 'private' constructor
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/OperationContextInstrumentation.java`
#### Snippet
```java

  @SuppressWarnings({"unused", "PrivateConstructorForUtilityClass"})
  public static class GetIdAdvice {
    @Advice.OnMethodExit
    public static void methodExit(
```

### UtilityClassWithoutPrivateConstructor
Class `OtherMethodsAdvice` has only 'static' members, and lacks a 'private' constructor
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/OperationContextInstrumentation.java`
#### Snippet
```java

  @SuppressWarnings({"unused", "PrivateConstructorForUtilityClass"})
  public static class OtherMethodsAdvice {
    @Advice.OnMethodEnter
    public static void methodEnter(
```

### UtilityClassWithoutPrivateConstructor
Class `SpringBootApp` has only 'static' members, and lacks a 'private' constructor
in `smoke-tests/apps/gRPC/src/main/java/com/microsoft/applicationinsights/smoketestapp/SpringBootApp.java`
#### Snippet
```java

@SpringBootApplication
public class SpringBootApp {

  public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `SpringBootApp` has only 'static' members, and lacks a 'private' constructor
in `smoke-tests/apps/WebFlux/src/main/java/com/microsoft/applicationinsights/smoketestapp/SpringBootApp.java`
#### Snippet
```java

@SpringBootApplication
public class SpringBootApp {

  public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `App` has only 'static' members, and lacks a 'private' constructor
in `smoke-tests/apps/ReadOnly/src/main/java/com/microsoft/applicationinsights/smoketestapp/App.java`
#### Snippet
```java
// Spring boot doesn't support read-only containers
// (https://github.com/spring-projects/spring-boot/issues/8578)
public class App {

  private static final Logger logger = Logger.getLogger("smoketestapp");
```

### UtilityClassWithoutPrivateConstructor
Class `SpringBootApp` has only 'static' members, and lacks a 'private' constructor
in `smoke-tests/apps/Micrometer/src/main/java/com/microsoft/applicationinsights/smoketestapp/SpringBootApp.java`
#### Snippet
```java

@SpringBootApplication
public class SpringBootApp {

  public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `SpringBootApp` has only 'static' members, and lacks a 'private' constructor
in `smoke-tests/apps/SystemExit/src/main/java/com/microsoft/applicationinsights/smoketestapp/SpringBootApp.java`
#### Snippet
```java

@SpringBootApplication
public class SpringBootApp {

  public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `SpringBootApp` has only 'static' members, and lacks a 'private' constructor
in `smoke-tests/apps/VerifyShading/src/main/java/com/microsoft/applicationinsights/smoketestapp/SpringBootApp.java`
#### Snippet
```java

@SpringBootApplication
public class SpringBootApp {

  public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `SpringBootApp` has only 'static' members, and lacks a 'private' constructor
in `smoke-tests/apps/ActuatorMetrics/src/main/java/com/microsoft/applicationinsights/smoketestapp/SpringBootApp.java`
#### Snippet
```java

@SpringBootApplication
public class SpringBootApp {

  public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `SpringBootApp` has only 'static' members, and lacks a 'private' constructor
in `smoke-tests/apps/NonDaemonThreads/src/main/java/com/microsoft/applicationinsights/smoketestapp/SpringBootApp.java`
#### Snippet
```java

@SpringBootApplication
public class SpringBootApp {

  private static final Logger logger = LoggerFactory.getLogger("smoketestapp");
```

### UtilityClassWithoutPrivateConstructor
Class `SpringBootApp` has only 'static' members, and lacks a 'private' constructor
in `smoke-tests/apps/SpringCloudStream/src/main/java/com/microsoft/applicationinsights/smoketestapp/SpringBootApp.java`
#### Snippet
```java

@SpringBootApplication
public class SpringBootApp {

  public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `JettyNativeHandlerApp` has only 'static' members, and lacks a 'private' constructor
in `smoke-tests/apps/JettyNativeHandler/src/main/java/com/microsoft/applicationinsights/smoketestapp/JettyNativeHandlerApp.java`
#### Snippet
```java

@SpringBootApplication
public class JettyNativeHandlerApp {

  public static void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `SpringBootApp` has only 'static' members, and lacks a 'private' constructor
in `smoke-tests/apps/InheritedAttributes/src/main/java/com/microsoft/applicationinsights/smoketestapp/SpringBootApp.java`
#### Snippet
```java

@SpringBootApplication
public class SpringBootApp {

  public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `SpringBootApp` has only 'static' members, and lacks a 'private' constructor
in `smoke-tests/apps/CustomInstrumentation/src/main/java/com/microsoft/applicationinsights/smoketestapp/SpringBootApp.java`
#### Snippet
```java

@SpringBootApplication
public class SpringBootApp {

  public static void main(String[] args) {
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Method invocation `addTransformer` may produce `NullPointerException`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/ClassicSdkInstrumentation.java`
#### Snippet
```java

    // add sdk instrumentation after ensuring Global.getTelemetryClient() will not return null
    instrumentation.addTransformer(new TelemetryClientClassFileTransformer());
    instrumentation.addTransformer(new DependencyTelemetryClassFileTransformer());
    instrumentation.addTransformer(new RequestTelemetryClassFileTransformer());
```

### DataFlowIssue
Method invocation `info` may produce `NullPointerException`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/FirstEntryPoint.java`
#### Snippet
```java
  @Override
  public void onStartupSuccess() {
    startupLogger.info(
        "Application Insights Java Agent {} started successfully (PID {}, JVM running for {} s)",
        agentVersion,
```

### DataFlowIssue
Method invocation `info` may produce `NullPointerException`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/FirstEntryPoint.java`
#### Snippet
```java
    String javaVendor = System.getProperty("java.vendor");
    String javaHome = System.getProperty("java.home");
    startupLogger.info("Java version: {}, vendor: {}, home: {}", javaVersion, javaVendor, javaHome);

    MDC.put(DiagnosticsHelper.MDC_PROP_OPERATION, "Startup");
```

### DataFlowIssue
Method invocation `debug` may produce `NullPointerException`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/FirstEntryPoint.java`
#### Snippet
```java

  private static void logJavaInfo() {
    startupLogger.debug("Classpath: " + System.getProperty("java.class.path"));
    startupLogger.debug(
        "Input arguments: " + ManagementFactory.getRuntimeMXBean().getInputArguments());
```

### DataFlowIssue
Method invocation `debug` may produce `NullPointerException`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/FirstEntryPoint.java`
#### Snippet
```java
  private static void logJavaInfo() {
    startupLogger.debug("Classpath: " + System.getProperty("java.class.path"));
    startupLogger.debug(
        "Input arguments: " + ManagementFactory.getRuntimeMXBean().getInputArguments());
    startupLogger.debug("_JAVA_OPTIONS: " + System.getenv("_JAVA_OPTIONS"));
```

### DataFlowIssue
Method invocation `debug` may produce `NullPointerException`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/FirstEntryPoint.java`
#### Snippet
```java
    startupLogger.debug(
        "Input arguments: " + ManagementFactory.getRuntimeMXBean().getInputArguments());
    startupLogger.debug("_JAVA_OPTIONS: " + System.getenv("_JAVA_OPTIONS"));
    startupLogger.debug("JAVA_TOOL_OPTIONS: " + System.getenv("JAVA_TOOL_OPTIONS"));
  }
```

### DataFlowIssue
Method invocation `debug` may produce `NullPointerException`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/FirstEntryPoint.java`
#### Snippet
```java
        "Input arguments: " + ManagementFactory.getRuntimeMXBean().getInputArguments());
    startupLogger.debug("_JAVA_OPTIONS: " + System.getenv("_JAVA_OPTIONS"));
    startupLogger.debug("JAVA_TOOL_OPTIONS: " + System.getenv("JAVA_TOOL_OPTIONS"));
  }

```

### DataFlowIssue
Method invocation `error` may produce `NullPointerException`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/FirstEntryPoint.java`
#### Snippet
```java
    try (MDC.MDCCloseable ignored = STARTUP_FAILURE_ERROR.makeActive()) {
      if (isFriendlyException) {
        startupLogger.error(message);
      } else {
        startupLogger.error(message, t);
```

### DataFlowIssue
Method invocation `error` may produce `NullPointerException`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/FirstEntryPoint.java`
#### Snippet
```java
        startupLogger.error(message);
      } else {
        startupLogger.error(message, t);
      }
    }
```

### DataFlowIssue
Method invocation `addTransformer` may produce `NullPointerException`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/FirstEntryPoint.java`
#### Snippet
```java
        JarVerifierClassFileTransformer transformer = new JarVerifierClassFileTransformer();
        Instrumentation instrumentation = InstrumentationHolder.getInstrumentation();
        instrumentation.addTransformer(transformer, true);
        instrumentation.retransformClasses(Class.forName("java.util.jar.JarVerifier"));
        instrumentation.removeTransformer(transformer);
```

### DataFlowIssue
Method invocation `toPath` may produce `NullPointerException`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/FirstEntryPoint.java`
#### Snippet
```java
        instrumentation.removeTransformer(transformer);
      }
      Path agentPath = javaagentFile.toPath();
      // need to initialize version before initializing DiagnosticsHelper
      agentVersion = SdkVersionFinder.initVersion(agentPath);
```

### DataFlowIssue
Method invocation `isDebugEnabled` may produce `NullPointerException`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/FirstEntryPoint.java`
#### Snippet
```java
      }

      if (startupLogger.isDebugEnabled()) {
        startupLogger.debug("OS: " + System.getProperty("os.name"));
        logJavaInfo();
```

### DataFlowIssue
Method invocation `debug` may produce `NullPointerException`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/FirstEntryPoint.java`
#### Snippet
```java

      if (startupLogger.isDebugEnabled()) {
        startupLogger.debug("OS: " + System.getProperty("os.name"));
        logJavaInfo();
        startupLogger.debug("Netty versions: " + NettyVersions.extract());
```

### DataFlowIssue
Method invocation `debug` may produce `NullPointerException`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/FirstEntryPoint.java`
#### Snippet
```java
        startupLogger.debug("OS: " + System.getProperty("os.name"));
        logJavaInfo();
        startupLogger.debug("Netty versions: " + NettyVersions.extract());
      }

```

### DataFlowIssue
Method invocation `getProfilerEndpoint` may produce `NullPointerException`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/ProfilingInitializer.java`
#### Snippet
```java
    }

    return TelemetryClient.getActive().getConnectionString().getProfilerEndpoint();
  }

```

### DataFlowIssue
Argument `activeRecording` might be null
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/Profiler.java`
#### Snippet
```java
      try {
        // dump profile to file
        closeRecording(activeRecording, activeRecordingFile);

        // upload new profile
```

### DataFlowIssue
Argument `activeRecordingFile` might be null
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/Profiler.java`
#### Snippet
```java
      try {
        // dump profile to file
        closeRecording(activeRecording, activeRecordingFile);

        // upload new profile
```

### DataFlowIssue
Argument `arg` might be null
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/triggers/AlertConfigParser.java`
#### Snippet
```java
    parsers.put(
        "mode",
        new ParseConfigValue<>(true, (config, arg) -> config.setMode(EngineMode.parse(arg))));
    parsers.put(
        "expiration",
```

### DataFlowIssue
Argument `arg` might be null
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/triggers/AlertConfigParser.java`
#### Snippet
```java
        "expiration",
        new ParseConfigValue<>(
            true, (config, arg) -> config.setExpiration(parseBinaryDate(Long.parseLong(arg)))));
    parsers.put(
        "immediate-profiling-duration",
```

### DataFlowIssue
Argument `arg` might be null
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/triggers/AlertConfigParser.java`
#### Snippet
```java
        new ParseConfigValue<>(
            true,
            (config, arg) -> config.setImmediateProfilingDurationSeconds(Integer.parseInt(arg))));
    parsers.put(
        "settings-moniker",
```

### DataFlowIssue
Argument `arg` might be null
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/triggers/AlertConfigParser.java`
#### Snippet
```java
    parsers.put(
        "cpu-threshold",
        new ParseConfigValue<>(true, (config, arg) -> config.setThreshold(Float.parseFloat(arg))));
    parsers.put(
        "cpu-trigger-cooldown",
```

### DataFlowIssue
Argument `arg` might be null
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/triggers/AlertConfigParser.java`
#### Snippet
```java
        "cpu-trigger-cooldown",
        new ParseConfigValue<>(
            true, (config, arg) -> config.setCooldownSeconds(Integer.parseInt(arg))));
    parsers.put(
        "cpu-trigger-profilingDuration",
```

### DataFlowIssue
Argument `arg` might be null
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/triggers/AlertConfigParser.java`
#### Snippet
```java
        "cpu-trigger-profilingDuration",
        new ParseConfigValue<>(
            true, (config, arg) -> config.setProfileDurationSeconds(Integer.parseInt(arg))));
    parsers.put(
        "cpu-trigger-enabled",
```

### DataFlowIssue
Argument `arg` might be null
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/triggers/AlertConfigParser.java`
#### Snippet
```java
    parsers.put(
        "memory-threshold",
        new ParseConfigValue<>(true, (config, arg) -> config.setThreshold(Float.parseFloat(arg))));
    parsers.put(
        "memory-trigger-cooldown",
```

### DataFlowIssue
Argument `arg` might be null
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/triggers/AlertConfigParser.java`
#### Snippet
```java
        "memory-trigger-cooldown",
        new ParseConfigValue<>(
            true, (config, arg) -> config.setCooldownSeconds(Integer.parseInt(arg))));
    parsers.put(
        "memory-trigger-profilingDuration",
```

### DataFlowIssue
Argument `arg` might be null
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/triggers/AlertConfigParser.java`
#### Snippet
```java
        "memory-trigger-profilingDuration",
        new ParseConfigValue<>(
            true, (config, arg) -> config.setProfileDurationSeconds(Integer.parseInt(arg))));
    parsers.put(
        "memory-trigger-enabled",
```

### DataFlowIssue
Argument `arg` might be null
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/triggers/AlertConfigParser.java`
#### Snippet
```java
        "sampling-profiling-duration",
        new ParseConfigValue<>(
            true, (config, arg) -> config.setSamplingProfileDuration(Long.parseLong(arg))));
    parsers.put(
        "sampling-rate",
```

### DataFlowIssue
Argument `arg` might be null
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/triggers/AlertConfigParser.java`
#### Snippet
```java
        "sampling-rate",
        new ParseConfigValue<>(
            true, (config, arg) -> config.setSamplingRate(Double.parseDouble(arg))));
    parsers.put(
        "sampling-enabled",
```

### DataFlowIssue
Method invocation `forceFlush` may produce `NullPointerException`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/telemetry/TelemetryClient.java`
#### Snippet
```java
    List<CompletableResultCode> resultCodes = new ArrayList<>();
    if (generalBatchItemProcessor != null) {
      resultCodes.add(generalBatchItemProcessor.forceFlush());
    }
    if (metricsBatchItemProcessor != null) {
```

### DataFlowIssue
Method invocation `forceFlush` may produce `NullPointerException`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/telemetry/TelemetryClient.java`
#### Snippet
```java
    }
    if (metricsBatchItemProcessor != null) {
      resultCodes.add(metricsBatchItemProcessor.forceFlush());
    }
    if (statsbeatBatchItemProcessor != null) {
```

### DataFlowIssue
Method invocation `forceFlush` may produce `NullPointerException`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/telemetry/TelemetryClient.java`
#### Snippet
```java
    }
    if (statsbeatBatchItemProcessor != null) {
      resultCodes.add(statsbeatBatchItemProcessor.forceFlush());
    }
    return CompletableResultCode.ofAll(resultCodes);
```

### DataFlowIssue
Method invocation `add` may produce `NullPointerException`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/telemetry/TelemetryClient.java`
#### Snippet
```java

    if (quickPulse != null) {
      quickPulse.add(telemetryItem);
    }

```

### DataFlowIssue
Condition `existingAttributeValue instanceof String` is redundant and can be replaced with a null check
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/processors/AgentProcessor.java`
#### Snippet
```java
        // existingAttributeValue.toString()
        // String.valueOf(existingAttributeValue);
        if (!(existingAttributeValue instanceof String)) {
          // user specified key not found
          return false;
```

### DataFlowIssue
Argument `actionObj.key` might be null
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/processors/AttributeProcessor.java`
#### Snippet
```java

    // Currently we only support String
    String existingValue = existingAttributes.get(actionObj.key);
    if (existingValue == null) {
      return existingAttributes;
```

### DataFlowIssue
Argument `actionObj.key` might be null
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/processors/AttributeProcessor.java`
#### Snippet
```java
      // update to new value
      AttributesBuilder builder = Attributes.builder();
      builder.put(actionObj.key, actionObj.value);
      builder.putAll(existingAttributes);
      return builder.build();
```

### DataFlowIssue
Argument `actionObj.fromAttribute` might be null
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/processors/AttributeProcessor.java`
#### Snippet
```java
    }

    String fromAttributeValue = existingAttributes.get(actionObj.fromAttribute);
    if (fromAttributeValue != null) {
      AttributesBuilder builder = Attributes.builder();
```

### DataFlowIssue
Argument `actionObj.key` might be null
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/processors/AttributeProcessor.java`
#### Snippet
```java
    if (fromAttributeValue != null) {
      AttributesBuilder builder = Attributes.builder();
      builder.put(actionObj.key, fromAttributeValue);
      builder.putAll(existingAttributes);
      return builder.build();
```

### DataFlowIssue
Argument `actionObj.key` might be null
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/processors/AttributeProcessor.java`
#### Snippet
```java

    // Currently we only support String
    String existingValue = existingAttributes.get(actionObj.key);
    if (existingValue == null) {
      return existingAttributes;
```

### DataFlowIssue
Dereference of `actionObj.maskAttribute` may produce `NullPointerException`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/processors/AttributeProcessor.java`
#### Snippet
```java
    }

    Matcher matcher = actionObj.maskAttribute.pattern.matcher(existingValue);
    String newValue = matcher.replaceAll(actionObj.maskAttribute.replace);
    if (newValue.equals(existingValue)) {
```

### DataFlowIssue
Argument `actionObj.key` might be null
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/processors/AttributeProcessor.java`
#### Snippet
```java

    // Currently we only support String
    String existingValue = existingAttributes.get(actionObj.key);
    if (existingValue == null) {
      return existingAttributes;
```

### DataFlowIssue
Argument `actionObj.key` might be null
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/processors/AttributeProcessor.java`
#### Snippet
```java

    // Currently we only support String
    String existingValue = existingAttributes.get(actionObj.key);
    if (existingValue == null) {
      return existingAttributes;
```

### DataFlowIssue
Argument `actionObj.fromAttribute` might be null
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/processors/AttributeProcessor.java`
#### Snippet
```java
    }

    String fromAttributeValue = existingAttributes.get(actionObj.fromAttribute);
    if (fromAttributeValue != null) {
      AttributesBuilder builder = existingAttributes.toBuilder();
```

### DataFlowIssue
Argument `actionObj.key` might be null
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/processors/AttributeProcessor.java`
#### Snippet
```java

    // Currently we only support String
    String existingValue = existingAttributes.get(actionObj.key);
    if (existingValue == null) {
      return existingAttributes;
```

### DataFlowIssue
Dereference of `actionObj.extractAttribute` may produce `NullPointerException`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/processors/AttributeProcessor.java`
#### Snippet
```java
      return existingAttributes;
    }
    Matcher matcher = actionObj.extractAttribute.pattern.matcher(existingValue);
    if (!matcher.matches()) {
      return existingAttributes;
```

### DataFlowIssue
Method invocation `logAvailableJmxMetrics` may produce `NullPointerException`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/perfcounter/PerformanceCounterContainer.java`
#### Snippet
```java
          public void run() {
            if (availableJmxMetricLogger != null) {
              availableJmxMetricLogger.logAvailableJmxMetrics();
            }

```

### DataFlowIssue
Method invocation `run` may produce `NullPointerException`
in `agent/agent-bootstrap/src/main/java/com/microsoft/applicationinsights/agent/bootstrap/AzureFunctions.java`
#### Snippet
```java
    if (configure != null) {
      if (!hasConnectionString()) {
        configure.run();
      }
      configure = null;
```

### DataFlowIssue
Unboxing of `roundToNearest(samplingPercentage, false)` may produce `NullPointerException`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/ConfigurationBuilder.java`
#### Snippet
```java
  // this is for external callers, where logging is ok
  public static double roundToNearest(double samplingPercentage) {
    return roundToNearest(samplingPercentage, false);
  }

```

### DataFlowIssue
Method invocation `endsWith` may produce `NullPointerException`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/configuration/StatsbeatConnectionString.java`
#### Snippet
```java

    URL endpointUrl;
    if (!ingestionEndpoint.endsWith("/")) {
      ingestionEndpoint += "/";
    }
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/Jdbc/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/JdbcUnmaskedTest.java`
#### Snippet
```java
    assertThat(telemetry.rdd1.getTarget()).isEqualTo("hsqldb | testdb");
    assertThat(telemetry.rdd1.getProperties()).isEmpty();
    assertThat(telemetry.rdd1.getSuccess()).isTrue();

    SmokeTestExtension.assertParentChild(
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/JMS/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/JmsDisabledTest.java`
#### Snippet
```java
    assertThat(rdd.getProperties())
        .containsExactly(entry("_MS.ProcessedByMetricExtractors", "True"));
    assertThat(rdd.getSuccess()).isTrue();

    // sleep a bit and make sure no kafka "requests" or dependencies are reported
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/JMS/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/JmsControllerSpansEnabledTest.java`
#### Snippet
```java
    assertThat(rdd1.getTarget()).isNull();
    assertThat(rdd1.getProperties()).isEmpty();
    assertThat(rdd1.getSuccess()).isTrue();

    assertThat(rdd2.getName()).isEqualTo("message send");
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/JMS/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/JmsTest.java`
#### Snippet
```java
    assertThat(rdd1.getTarget()).isEqualTo("message");
    assertThat(rdd1.getProperties()).isEmpty();
    assertThat(rdd1.getSuccess()).isTrue();

    assertThat(rd2.getName()).isEqualTo("message process");
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/Jedis/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/JedisTest.java`
#### Snippet
```java
    assertThat(telemetry.rdd1.getTarget()).matches("dependency[0-9]+");
    assertThat(telemetry.rdd1.getProperties()).isEmpty();
    assertThat(telemetry.rdd1.getSuccess()).isTrue();

    SmokeTestExtension.assertParentChild(
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/Lettuce/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/LettuceTest.java`
#### Snippet
```java
    assertThat(telemetry.rdd1.getTarget()).matches("dependency[0-9]+");
    assertThat(telemetry.rdd1.getProperties()).isEmpty();
    assertThat(telemetry.rdd1.getSuccess()).isTrue();

    SmokeTestExtension.assertParentChild(
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/Kafka/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/KafkaDisabledTest.java`
#### Snippet
```java
    assertThat(rdd.getProperties())
        .containsExactly(entry("_MS.ProcessedByMetricExtractors", "True"));
    assertThat(rdd.getSuccess()).isTrue();

    // sleep a bit and make sure no kafka "requests" or dependencies are reported
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/MongoDB/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/MongoUnmaskedTest.java`
#### Snippet
```java
    assertThat(telemetry.rdd1.getTarget()).matches("dependency[0-9]+ \\| testdb");
    assertThat(telemetry.rdd1.getProperties()).isEmpty();
    assertThat(telemetry.rdd1.getSuccess()).isTrue();

    SmokeTestExtension.assertParentChild(
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/MongoDB/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/MongoTest.java`
#### Snippet
```java
    assertThat(telemetry.rdd1.getTarget()).matches("dependency[0-9]+ \\| testdb");
    assertThat(telemetry.rdd1.getProperties()).isEmpty();
    assertThat(telemetry.rdd1.getSuccess()).isTrue();

    SmokeTestExtension.assertParentChild(
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/Kafka/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/KafkaControllerSpansEnabledTest.java`
#### Snippet
```java
    assertThat(rdd1.getTarget()).isNull();
    assertThat(rdd1.getProperties()).isEmpty();
    assertThat(rdd1.getSuccess()).isTrue();

    assertThat(rdd2.getName()).isEqualTo("mytopic send");
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/Kafka/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/KafkaTest.java`
#### Snippet
```java
    assertThat(rdd1.getTarget()).isEqualTo("mytopic");
    assertThat(rdd1.getProperties()).isEmpty();
    assertThat(rdd1.getSuccess()).isTrue();

    assertThat(rd2.getName()).isEqualTo("mytopic process");
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/gRPC/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/GrpcTest.java`
#### Snippet
```java
    assertThat(rdd.getProperties())
        .containsExactly(entry("_MS.ProcessedByMetricExtractors", "True"));
    assertThat(rdd.getSuccess()).isTrue();

    // TODO (trask): verify rd2
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/Jdbc/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/JdbcTest.java`
#### Snippet
```java
    assertThat(telemetry.rdd1.getProperties()).hasSize(1);
    assertThat(telemetry.rdd1.getProperties()).containsEntry("Args", " [Batch]");
    assertThat(telemetry.rdd1.getSuccess()).isTrue();

    SmokeTestExtension.assertParentChild(
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/gRPC/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/GrpcTest.java`
#### Snippet
```java
    assertThat(rdd.getProperties())
        .containsExactly(entry("_MS.ProcessedByMetricExtractors", "True"));
    assertThat(rdd.getSuccess()).isTrue();

    // TODO (trask): verify rd2
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/Jdbc/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/JdbcTest.java`
#### Snippet
```java
    assertThat(telemetry.rdd1.getTarget()).matches("dependency[0-9]+ \\| mysql");
    assertThat(telemetry.rdd1.getProperties()).isEmpty();
    assertThat(telemetry.rdd1.getSuccess()).isTrue();

    SmokeTestExtension.assertParentChild(
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/Jdbc/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/JdbcTest.java`
#### Snippet
```java
    assertThat(telemetry.rdd1.getTarget()).matches("dependency[0-9]+ \\| postgres");
    assertThat(telemetry.rdd1.getProperties()).isEmpty();
    assertThat(telemetry.rdd1.getSuccess()).isTrue();

    SmokeTestExtension.assertParentChild(
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/Jdbc/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/JdbcTest.java`
#### Snippet
```java
    assertThat(telemetry.rdd1.getTarget()).isEqualTo("hsqldb | testdb");
    assertThat(telemetry.rdd1.getProperties()).isEmpty();
    assertThat(telemetry.rdd1.getSuccess()).isTrue();

    SmokeTestExtension.assertParentChild(
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/Jdbc/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/JdbcTest.java`
#### Snippet
```java
    assertThat(telemetry.rdd1.getTarget()).isEqualTo("hsqldb | testdb");
    assertThat(telemetry.rdd1.getProperties()).isEmpty();
    assertThat(telemetry.rdd1.getSuccess()).isTrue();

    SmokeTestExtension.assertParentChild(
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/Jdbc/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/JdbcTest.java`
#### Snippet
```java
    // assertThat(telemetry.rdd1.getProperties()).containsEntry("Args", " [Batch of 3]");
    assertThat(telemetry.rdd1.getProperties()).isEmpty();
    assertThat(telemetry.rdd1.getSuccess()).isTrue();

    SmokeTestExtension.assertParentChild(
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/Jdbc/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/JdbcTest.java`
#### Snippet
```java
    assertThat(telemetry.rdd1.getTarget()).matches("dependency[0-9]+");
    assertThat(telemetry.rdd1.getProperties()).isEmpty();
    assertThat(telemetry.rdd1.getSuccess()).isTrue();

    SmokeTestExtension.assertParentChild(
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/Jdbc/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/JdbcTest.java`
#### Snippet
```java
    assertThat(telemetry.rdd1.getTarget()).isEqualTo("hsqldb | testdb");
    assertThat(telemetry.rdd1.getProperties()).isEmpty();
    assertThat(telemetry.rdd1.getSuccess()).isTrue();

    SmokeTestExtension.assertParentChild(
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/Jdbc/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/JdbcTest.java`
#### Snippet
```java
    assertThat(telemetry.rdd1.getTarget()).matches("dependency[0-9]+ \\| postgres");
    assertThat(telemetry.rdd1.getProperties()).isEmpty();
    assertThat(telemetry.rdd1.getSuccess()).isTrue();

    SmokeTestExtension.assertParentChild(
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/Jdbc/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/JdbcTest.java`
#### Snippet
```java
    assertThat(telemetry.rdd1.getTarget()).matches("dependency[0-9]+");
    assertThat(telemetry.rdd1.getProperties()).isEmpty();
    assertThat(telemetry.rdd1.getSuccess()).isTrue();

    SmokeTestExtension.assertParentChild(
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/Jdbc/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/JdbcTest.java`
#### Snippet
```java
    assertThat(telemetry.rdd1.getTarget()).matches("dependency[0-9]+");
    assertThat(telemetry.rdd1.getProperties()).isEmpty();
    assertThat(telemetry.rdd1.getSuccess()).isTrue();

    SmokeTestExtension.assertParentChild(
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/Jdbc/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/JdbcTest.java`
#### Snippet
```java
    assertThat(telemetry.rdd1.getTarget()).matches("dependency[0-9]+ \\| mysql");
    assertThat(telemetry.rdd1.getProperties()).isEmpty();
    assertThat(telemetry.rdd1.getSuccess()).isTrue();

    SmokeTestExtension.assertParentChild(
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/Jdbc/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/JdbcTest.java`
#### Snippet
```java
    assertThat(telemetry.rdd1.getTarget()).matches("dependency[0-9]+");
    assertThat(telemetry.rdd1.getProperties()).isEmpty();
    assertThat(telemetry.rdd1.getSuccess()).isTrue();

    SmokeTestExtension.assertParentChild(
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/AzureSdk/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/AzureSdkTest.java`
#### Snippet
```java
    assertThat(telemetry.rdd1.getTarget()).isNull();
    assertThat(telemetry.rdd1.getProperties()).isEmpty();
    assertThat(telemetry.rdd1.getSuccess()).isTrue();

    SmokeTestExtension.assertParentChild(
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/Cassandra/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/CassandraTest.java`
#### Snippet
```java
    assertThat(telemetry.rdd1.getTarget()).matches("dependency[0-9]+");
    assertThat(telemetry.rdd1.getProperties()).isEmpty();
    assertThat(telemetry.rdd1.getSuccess()).isTrue();

    SmokeTestExtension.assertParentChild(
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/AzureSdk/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/AzureSdkControllerSpansEnabledTest.java`
#### Snippet
```java
    assertThat(telemetry.rdd1.getTarget()).isNull();
    assertThat(telemetry.rdd1.getProperties()).isEmpty();
    assertThat(telemetry.rdd1.getSuccess()).isTrue();

    assertThat(telemetry.rdd2.getName()).isEqualTo("hello");
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/SpringBoot/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/SpringBootTest.java`
#### Snippet
```java
    assertThat(rd.getProperties())
        .containsExactly(entry("_MS.ProcessedByMetricExtractors", "True"));
    assertThat(rdd1.getSuccess()).isTrue();

    SmokeTestExtension.assertParentChild(
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/HttpHeaders/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/HttpHeadersTest.java`
#### Snippet
```java
    assertThat(telemetry.rdd1.getProperties())
        .containsEntry("_MS.ProcessedByMetricExtractors", "True");
    assertThat(telemetry.rdd1.getSuccess()).isTrue();
  }

```

### DataFlowIssue
The call to 'isFalse' always fails as an argument is out of bounds
in `smoke-tests/apps/SpringBoot/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/SpringBootControllerSpansEnabledTest.java`
#### Snippet
```java
    assertThat(rdd1.getTarget()).isNull();
    assertThat(rdd1.getProperties()).isEmpty();
    assertThat(rdd1.getSuccess()).isFalse();

    SmokeTestExtension.assertParentChild(
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/SpringBoot/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/SpringBootControllerSpansEnabledTest.java`
#### Snippet
```java
    assertThat(rdd1.getTarget()).isNull();
    assertThat(rdd1.getProperties()).isEmpty();
    assertThat(rdd1.getSuccess()).isTrue();

    assertThat(rdd2.getName()).isEqualTo("GET /");
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/HttpClients/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/HttpClientTest.java`
#### Snippet
```java
    assertThat(telemetry.rdd1.getProperties())
        .containsExactly(entry("_MS.ProcessedByMetricExtractors", "True"));
    assertThat(telemetry.rdd1.getSuccess()).isTrue();
    assertThat(telemetry.rddEnvelope1.getSampleRate()).isNull();

```

### DataFlowIssue
Method invocation `close` may produce `NullPointerException`
in `smoke-tests/apps/NonDaemonThreads/src/main/java/com/microsoft/applicationinsights/smoketestapp/SpringBootApp.java`
#### Snippet
```java
        new okhttp3.Request.Builder().url("https://www.bing.com/search?q=test").build();
    okhttp3.Response response = client.newCall(request).execute();
    response.body().close();
    response.close();

```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/NonDaemonThreads/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/NonDaemonThreadsTest.java`
#### Snippet
```java
    assertThat(rdd.getProperties())
        .containsExactly(entry("_MS.ProcessedByMetricExtractors", "True"));
    assertThat(rdd.getSuccess()).isTrue();

    assertThat(md.getMessage()).isEqualTo("done");
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/SamplingOverrides/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/SamplingOverridesTest.java`
#### Snippet
```java
    assertThat(rdd.getName()).isEqualTo("SELECT testdb.abc");
    assertThat(rdd.getData()).isEqualTo("select * from abc");
    assertThat(rdd.getSuccess()).isTrue();

    SmokeTestExtension.assertParentChild(rd, rdEnvelope, rddEnvelope, "GET /SamplingOverrides/*");
```

### DataFlowIssue
Method invocation `close` may produce `NullPointerException`
in `smoke-tests/apps/HttpClients/src/main/java/com/microsoft/applicationinsights/smoketestapp/HttpClientServlet.java`
#### Snippet
```java
    okhttp3.Request request = new okhttp3.Request.Builder().url(url).build();
    okhttp3.Response response = client.newCall(request).execute();
    response.body().close();
    response.code();
  }
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/RoleNameOverrides/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/RoleNameOverridesTest.java`
#### Snippet
```java
    assertThat(rdd.getData()).isEqualTo("https://mock.codes/200");
    assertThat(rdd.getResultCode()).isEqualTo("200");
    assertThat(rdd.getSuccess()).isTrue();

    assertThat(md.getMessage()).isEqualTo("hello");
```

### DataFlowIssue
Method invocation `getHttpRequestTelemetry` may produce `NullPointerException`
in `smoke-tests/apps/InheritedAttributes/src/main/java/com/microsoft/applicationinsights/smoketestapp/TracingFilter.java`
#### Snippet
```java

    ThreadContext.getRequestTelemetryContext()
        .getHttpRequestTelemetry()
        .getProperties()
        .put("tenant", "z");
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/SpringCloudStream/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/SpringCloudStreamTest.java`
#### Snippet
```java
    assertThat(rdd1.getTarget()).isEqualTo("greetings");
    assertThat(rdd1.getProperties()).isEmpty();
    assertThat(rdd1.getSuccess()).isTrue();

    assertThat(rd2.getName()).isEqualTo("greetings process");
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/SpringCloudStream/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/SpringCloudStreamControllerSpansEnabledTest.java`
#### Snippet
```java
    assertThat(rdd1.getTarget()).isNull();
    assertThat(rdd1.getProperties()).isEmpty();
    assertThat(rdd1.getSuccess()).isTrue();

    assertThat(rdd2.getName()).isEqualTo("greetings send");
```

### DataFlowIssue
Method invocation `getSampleRate` may produce `NullPointerException`
in `smoke-tests/apps/CoreAndFilter2x/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/CoreAndFilter2xTest.java`
#### Snippet
```java

    assertThat(rdEnvelope.getSampleRate()).isNull();
    assertThat(pvdEnvelope1.getSampleRate()).isNull();
    assertThat(pvdEnvelope2.getSampleRate()).isNull();
    assertThat(pvdEnvelope3.getSampleRate()).isNull();
```

### DataFlowIssue
Method invocation `getSampleRate` may produce `NullPointerException`
in `smoke-tests/apps/CoreAndFilter2x/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/CoreAndFilter2xTest.java`
#### Snippet
```java
    assertThat(rdEnvelope.getSampleRate()).isNull();
    assertThat(pvdEnvelope1.getSampleRate()).isNull();
    assertThat(pvdEnvelope2.getSampleRate()).isNull();
    assertThat(pvdEnvelope3.getSampleRate()).isNull();

```

### DataFlowIssue
Method invocation `getSampleRate` may produce `NullPointerException`
in `smoke-tests/apps/CoreAndFilter2x/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/CoreAndFilter2xTest.java`
#### Snippet
```java
    assertThat(pvdEnvelope1.getSampleRate()).isNull();
    assertThat(pvdEnvelope2.getSampleRate()).isNull();
    assertThat(pvdEnvelope3.getSampleRate()).isNull();

    PageViewData pv1 = (PageViewData) ((Data<?>) pvdEnvelope1.getData()).getBaseData();
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/CoreAndFilter2x/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/CoreAndFilter2xTest.java`
#### Snippet
```java
    assertThat(telemetry.rdd1.getTarget()).isNull();
    assertThat(telemetry.rdd1.getProperties()).isEmpty();
    assertThat(telemetry.rdd1.getSuccess()).isTrue();

    assertThat(telemetry.rdd1.getDuration()).isEqualTo(expectedDuration);
```

### DataFlowIssue
Method invocation `getHttpRequestTelemetry` may produce `NullPointerException`
in `smoke-tests/apps/ClassicSdkWebInterop3x/src/main/java/com/microsoft/applicationinsights/smoketestapp/TestController.java`
#### Snippet
```java
  public String test() {
    RequestTelemetry requestTelemetry =
        ThreadContext.getRequestTelemetryContext().getHttpRequestTelemetry();
    requestTelemetry.getProperties().put("myattr1", "myvalue1");
    requestTelemetry.getProperties().put("myattr2", "myvalue2");
```

### DataFlowIssue
Method invocation `getSampleRate` may produce `NullPointerException`
in `smoke-tests/apps/CoreAndFilter3x/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/CoreAndFilter3xTest.java`
#### Snippet
```java

    assertThat(rdEnvelope.getSampleRate()).isNull();
    assertThat(pvdEnvelope1.getSampleRate()).isNull();
    assertThat(pvdEnvelope2.getSampleRate()).isNull();
    assertThat(pvdEnvelope3.getSampleRate()).isNull();
```

### DataFlowIssue
Method invocation `getSampleRate` may produce `NullPointerException`
in `smoke-tests/apps/CoreAndFilter3x/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/CoreAndFilter3xTest.java`
#### Snippet
```java
    assertThat(rdEnvelope.getSampleRate()).isNull();
    assertThat(pvdEnvelope1.getSampleRate()).isNull();
    assertThat(pvdEnvelope2.getSampleRate()).isNull();
    assertThat(pvdEnvelope3.getSampleRate()).isNull();

```

### DataFlowIssue
Method invocation `getSampleRate` may produce `NullPointerException`
in `smoke-tests/apps/CoreAndFilter3x/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/CoreAndFilter3xTest.java`
#### Snippet
```java
    assertThat(pvdEnvelope1.getSampleRate()).isNull();
    assertThat(pvdEnvelope2.getSampleRate()).isNull();
    assertThat(pvdEnvelope3.getSampleRate()).isNull();

    PageViewData pv1 = (PageViewData) ((Data<?>) pvdEnvelope1.getData()).getBaseData();
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/CoreAndFilter3x/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/CoreAndFilter3xTest.java`
#### Snippet
```java
    assertThat(telemetry.rdd1.getTarget()).isNull();
    assertThat(telemetry.rdd1.getProperties()).isEmpty();
    assertThat(telemetry.rdd1.getSuccess()).isTrue();

    assertThat(telemetry.rdd1.getDuration()).isEqualTo(expectedDuration);
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/OpenTelemetryApiSupport/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/OpenTelemetryApiSupportTest.java`
#### Snippet
```java
    assertThat(telemetry.rdd1.getProperties()).containsEntry("message", "a message");
    assertThat(telemetry.rdd1.getProperties()).hasSize(1);
    assertThat(telemetry.rdd1.getSuccess()).isTrue();

    SmokeTestExtension.assertParentChild(
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/OpenTelemetryApiSupport/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/OpenTelemetryApiSupportControllerSpansEnabledTest.java`
#### Snippet
```java
    assertThat(telemetry.rdd1.getTarget()).isNull();
    assertThat(telemetry.rdd1.getProperties()).isEmpty();
    assertThat(telemetry.rdd1.getSuccess()).isTrue();

    assertThat(telemetry.rdd2.getName()).isEqualTo("TestController." + annotatedMethodName);
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/OpenTelemetryApiSupport/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/OpenTelemetryApiSupportControllerSpansEnabledTest.java`
#### Snippet
```java
    assertThat(telemetry.rdd1.getProperties()).containsEntry("myattr1", "myvalue1");
    assertThat(telemetry.rdd1.getProperties()).containsEntry("myattr2", "myvalue2");
    assertThat(telemetry.rdd1.getSuccess()).isTrue();

    // ideally want the properties below on rd, but can't get SERVER span yet
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/SamplingOverridesBackCompat/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/SamplingOverridesBackCompatTest.java`
#### Snippet
```java
    assertThat(rdd.getName()).isEqualTo("SELECT testdb.abc");
    assertThat(rdd.getData()).isEqualTo("select * from abc");
    assertThat(rdd.getSuccess()).isTrue();

    SmokeTestExtension.assertParentChild(
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/ConnectionStringOverrides/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/ConnectionStringOverridesTest.java`
#### Snippet
```java
    assertThat(rdd.getData()).isEqualTo("https://mock.codes/200");
    assertThat(rdd.getResultCode()).isEqualTo("200");
    assertThat(rdd.getSuccess()).isTrue();

    assertThat(md.getMessage()).isEqualTo("hello");
```

### DataFlowIssue
Method invocation `getHttpRequestTelemetry` may produce `NullPointerException`
in `smoke-tests/apps/ClassicSdkWebInterop3xUsingOld3xAgent/src/main/java/com/microsoft/applicationinsights/smoketestapp/TestController.java`
#### Snippet
```java
  public String test() {
    RequestTelemetry requestTelemetry =
        ThreadContext.getRequestTelemetryContext().getHttpRequestTelemetry();
    requestTelemetry.getProperties().put("myattr1", "myvalue1");
    requestTelemetry.getProperties().put("myattr2", "myvalue2");
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/HttpPreaggregatedMetrics/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/HttpPreaggregatedMetricsTest.java`
#### Snippet
```java
    assertThat(telemetry.rdd1.getProperties())
        .containsExactly(entry("_MS.ProcessedByMetricExtractors", "True"));
    assertThat(telemetry.rdd1.getSuccess()).isTrue();
    assertThat(telemetry.rddEnvelope1.getSampleRate()).isNull();

```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/InstrumentationKeyOverrides/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/InstrumentationKeyOverridesTest.java`
#### Snippet
```java
    assertThat(rdd.getData()).isEqualTo("https://mock.codes/200");
    assertThat(rdd.getResultCode()).isEqualTo("200");
    assertThat(rdd.getSuccess()).isTrue();

    assertThat(md.getMessage()).isEqualTo("hello");
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/CoreAndFilter3xUsingOld3xAgent/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/CoreAndFilter3xUsingOld3xAgentTest.java`
#### Snippet
```java
    assertThat(telemetry.rdd1.getTarget()).isNull();
    assertThat(telemetry.rdd1.getProperties()).isEmpty();
    assertThat(telemetry.rdd1.getSuccess()).isTrue();

    assertThat(telemetry.rdd1.getDuration()).isEqualTo(expectedDuration);
```

### DataFlowIssue
Method invocation `getSampleRate` may produce `NullPointerException`
in `smoke-tests/apps/CoreAndFilter3xUsingOld3xAgent/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/CoreAndFilter3xUsingOld3xAgentTest.java`
#### Snippet
```java

    assertThat(rdEnvelope.getSampleRate()).isNull();
    assertThat(pvdEnvelope1.getSampleRate()).isNull();
    assertThat(pvdEnvelope2.getSampleRate()).isNull();
    assertThat(pvdEnvelope3.getSampleRate()).isNull();
```

### DataFlowIssue
Method invocation `getSampleRate` may produce `NullPointerException`
in `smoke-tests/apps/CoreAndFilter3xUsingOld3xAgent/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/CoreAndFilter3xUsingOld3xAgentTest.java`
#### Snippet
```java
    assertThat(rdEnvelope.getSampleRate()).isNull();
    assertThat(pvdEnvelope1.getSampleRate()).isNull();
    assertThat(pvdEnvelope2.getSampleRate()).isNull();
    assertThat(pvdEnvelope3.getSampleRate()).isNull();

```

### DataFlowIssue
Method invocation `getSampleRate` may produce `NullPointerException`
in `smoke-tests/apps/CoreAndFilter3xUsingOld3xAgent/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/CoreAndFilter3xUsingOld3xAgentTest.java`
#### Snippet
```java
    assertThat(pvdEnvelope1.getSampleRate()).isNull();
    assertThat(pvdEnvelope2.getSampleRate()).isNull();
    assertThat(pvdEnvelope3.getSampleRate()).isNull();

    PageViewData pv1 = (PageViewData) ((Data<?>) pvdEnvelope1.getData()).getBaseData();
```

### DataFlowIssue
Method invocation `endsWith` may produce `NullPointerException`
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/SmokeTestExtension.java`
#### Snippet
```java

  protected String getAppContext() {
    if (currentImageAppFileName.endsWith(".jar")) {
      // spring boot jar
      return "";
```

### DataFlowIssue
Argument `currentImageName` might be null
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/SmokeTestExtension.java`
#### Snippet
```java
    if (REMOTE_DEBUG) {
      container =
          new FixedHostPortGenericContainer<>(currentImageName)
              .withFixedExposedPort(5005, 5005)
              .waitingFor(
```

### DataFlowIssue
Argument `currentImageName` might be null
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/SmokeTestExtension.java`
#### Snippet
```java
                  }.withStartupTimeout(Duration.ofMinutes(5)));
    } else {
      container = new GenericContainer<>(currentImageName);
    }

```

### DataFlowIssue
Method invocation `openStream` may produce `NullPointerException`
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/SmokeTestExtension.java`
#### Snippet
```java
      File json = File.createTempFile("applicationinsights", ".json");
      Path jsonPath = json.toPath();
      try (InputStream in = resource.openStream()) {
        Files.copy(in, jsonPath, StandardCopyOption.REPLACE_EXISTING);
      }
```

### DataFlowIssue
Method invocation `withReadonlyRootfs` may produce `NullPointerException`
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/SmokeTestExtension.java`
#### Snippet
```java
    if (readOnly) {
      container.withCreateContainerCmdModifier(
          createContainerCmd -> createContainerCmd.getHostConfig().withReadonlyRootfs(true));
    }

```

### DataFlowIssue
Method invocation `add` may produce `NullPointerException`
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/SmokeTestExtension.java`
#### Snippet
```java

    targetContainer = container;
    allContainers.add(container);
  }

```

### DataFlowIssue
Method invocation `entrySet` may produce `NullPointerException`
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/SmokeTestExtension.java`
#### Snippet
```java
  private String substitute(String environmentVariable) {
    String envVar = environmentVariable;
    for (Map.Entry<String, String> entry : hostnameEnvVars.entrySet()) {
      envVar = envVar.replace("${" + entry.getKey() + "}", entry.getValue());
    }
```

### DataFlowIssue
Method invocation `put` may produce `NullPointerException`
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/SmokeTestExtension.java`
#### Snippet
```java

      if (dependencyContainerEnvVarName != null) {
        hostnameEnvVars.put(dependencyContainerEnvVarName, containerName);
      }
      allContainers.add(dependencyContainer);
```

### DataFlowIssue
Method invocation `add` may produce `NullPointerException`
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/SmokeTestExtension.java`
#### Snippet
```java
        hostnameEnvVars.put(dependencyContainerEnvVarName, containerName);
      }
      allContainers.add(dependencyContainer);
    }
    for (DependencyContainer dc : dependencyImages) {
```

### DataFlowIssue
Dereference of `dependencyImages` may produce `NullPointerException`
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/SmokeTestExtension.java`
#### Snippet
```java
      allContainers.add(dependencyContainer);
    }
    for (DependencyContainer dc : dependencyImages) {
      String imageName = dc.imageName().isEmpty() ? dc.value() : dc.imageName();
      System.out.println("Starting container: " + imageName);
```

### DataFlowIssue
Method invocation `put` may produce `NullPointerException`
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/SmokeTestExtension.java`
#### Snippet
```java

      if (!dc.hostnameEnvironmentVariable().isEmpty()) {
        hostnameEnvVars.put(dc.hostnameEnvironmentVariable(), containerName);
      }
      allContainers.add(container);
```

### DataFlowIssue
Method invocation `add` may produce `NullPointerException`
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/SmokeTestExtension.java`
#### Snippet
```java
        hostnameEnvVars.put(dc.hostnameEnvironmentVariable(), containerName);
      }
      allContainers.add(container);
    }
  }
```

### DataFlowIssue
The call to 'isTrue' always fails as an argument is out of bounds
in `smoke-tests/apps/PreAggMetricsWithRoleNameOverridesAndSampling/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/PreAggMetricsWithRoleNameOverridesAndSamplingTest.java`
#### Snippet
```java
      assertThat(rdd.getData()).isEqualTo("https://mock.codes/200");
      assertThat(rdd.getResultCode()).isEqualTo("200");
      assertThat(rdd.getSuccess()).isTrue();

      assertThat(md.getMessage()).isEqualTo("hello");
```

## RuleId[ruleID=ParameterCanBeLocal]
### ParameterCanBeLocal
Parameter can be converted to a local variable
in `agent/instrumentation/methods/src/main/java/io/opentelemetry/javaagent/instrumentation/methods/ai/MethodInstrumentation.java`
#### Snippet
```java
        @Advice.Origin("#t") Class<?> declaringClass,
        @Advice.Origin("#m") String methodName,
        @Advice.Local("otelMethod") ClassAndMethod classAndMethod,
        @Advice.Local("otelContext") Context context,
        @Advice.Local("otelScope") Scope scope) {
```

### ParameterCanBeLocal
Parameter can be converted to a local variable
in `agent/instrumentation/methods/src/main/java/io/opentelemetry/javaagent/instrumentation/methods/ai/MethodInstrumentation.java`
#### Snippet
```java
        @Advice.Origin("#m") String methodName,
        @Advice.Local("otelMethod") ClassAndMethod classAndMethod,
        @Advice.Local("otelContext") Context context,
        @Advice.Local("otelScope") Scope scope) {
      Context parentContext = currentContext();
```

### ParameterCanBeLocal
Parameter can be converted to a local variable
in `agent/instrumentation/methods/src/main/java/io/opentelemetry/javaagent/instrumentation/methods/ai/MethodInstrumentation.java`
#### Snippet
```java
        @Advice.Local("otelMethod") ClassAndMethod classAndMethod,
        @Advice.Local("otelContext") Context context,
        @Advice.Local("otelScope") Scope scope) {
      Context parentContext = currentContext();
      classAndMethod = ClassAndMethod.create(declaringClass, methodName);
```

### ParameterCanBeLocal
Parameter can be converted to a local variable
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/RequestTelemetryInstrumentation.java`
#### Snippet
```java
    public static void methodExit(
        @Advice.This RequestTelemetry requestTelemetry,
        @Advice.Return(readOnly = false) String id) {
      Span span = VirtualField.find(RequestTelemetry.class, Span.class).get(requestTelemetry);
      if (span != null) {
```

### ParameterCanBeLocal
Parameter can be converted to a local variable
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/RequestTelemetryContextInstrumentation.java`
#### Snippet
```java
    public static void methodExit(
        @Advice.This RequestTelemetryContext requestTelemetryContext,
        @Advice.Return(readOnly = false) int traceflag) {
      Span span =
          VirtualField.find(RequestTelemetryContext.class, Span.class).get(requestTelemetryContext);
```

### ParameterCanBeLocal
Parameter can be converted to a local variable
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/RequestTelemetryContextInstrumentation.java`
#### Snippet
```java
    public static void methodExit(
        @Advice.This RequestTelemetryContext requestTelemetryContext,
        @Advice.Return(readOnly = false) Tracestate tracestate) {
      Span span =
          VirtualField.find(RequestTelemetryContext.class, Span.class).get(requestTelemetryContext);
```

### ParameterCanBeLocal
Parameter can be converted to a local variable
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/BaseTelemetryInstrumentation.java`
#### Snippet
```java
    public static void methodExit(
        @Advice.This BaseTelemetry<?> telemetry,
        @Advice.Return(readOnly = false) Map<String, String> properties) {
      if (!(telemetry instanceof RequestTelemetry)) {
        return;
```

### ParameterCanBeLocal
Parameter can be converted to a local variable
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/OperationContextInstrumentation.java`
#### Snippet
```java
    public static void methodExit(
        @Advice.This OperationContext operationContext,
        @Advice.Return(readOnly = false) String id) {
      Span span = VirtualField.find(OperationContext.class, Span.class).get(operationContext);
      if (span != null) {
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'rabbitmq' is still used
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java
    // this is just here to detect if using this old setting in order to give a helpful message
    @Deprecated
    public DisabledByDefaultInstrumentation rabbitmq = new DisabledByDefaultInstrumentation();

    public DisabledByDefaultInstrumentation springIntegration =
```

### DeprecatedIsStillUsed
Deprecated member 'ignoreRemoteParentNotSampled' is still used
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java
    public int metricIntervalSeconds = 60;
    // this is just here to detect if using this old setting in order to give a helpful message
    @Deprecated public Boolean ignoreRemoteParentNotSampled;
    public boolean captureControllerSpans;
    // this is just here to detect if using this old setting in order to give a helpful message
```

### DeprecatedIsStillUsed
Deprecated member 'javaHttpClient' is still used
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java
    // this is just here to detect if using this old setting in order to give a helpful message
    @Deprecated
    public DisabledByDefaultInstrumentation javaHttpClient = new DisabledByDefaultInstrumentation();

    // this is just here to detect if using this old setting in order to give a helpful message
```

### DeprecatedIsStillUsed
Deprecated member 'openTelemetryApiSupport' is still used
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java
    public List<ProcessorConfig> processors = new ArrayList<>();
    // this is just here to detect if using this old setting in order to give a helpful message
    @Deprecated public boolean openTelemetryApiSupport;
    public PreviewInstrumentation instrumentation = new PreviewInstrumentation();
    // applies to perf counters, default custom metrics, jmx metrics, and micrometer metrics
```

### DeprecatedIsStillUsed
Deprecated member 'instrumentationKeyOverrides' is still used
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java

    @Deprecated
    public List<InstrumentationKeyOverride> instrumentationKeyOverrides = new ArrayList<>();

    public int generalExportQueueCapacity = 2048;
```

### DeprecatedIsStillUsed
Deprecated member 'includingStandaloneTelemetry' is still used
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java

    // this config option only existed in one BETA release (3.4.0-BETA)
    @Deprecated @Nullable public Boolean includingStandaloneTelemetry;

    // not using include/exclude, because you can still get exclude with this by adding a second
```

### DeprecatedIsStillUsed
Deprecated member 'azureSdk' is still used
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java
    // this is just here to detect if using this old setting in order to give a helpful message
    @Deprecated
    public DisabledByDefaultInstrumentation azureSdk = new DisabledByDefaultInstrumentation();

    public DisabledByDefaultInstrumentation grizzly = new DisabledByDefaultInstrumentation();
```

### DeprecatedIsStillUsed
Deprecated member 'spanKind' is still used
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java

  public static class SamplingOverride {
    @Deprecated @Nullable public SpanKind spanKind;

    // TODO (trask) make this required when moving out of preview
```

### DeprecatedIsStillUsed
Deprecated member 'jaxws' is still used
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java
    // this is just here to detect if using this old setting in order to give a helpful message
    @Deprecated
    public DisabledByDefaultInstrumentation jaxws = new DisabledByDefaultInstrumentation();

    // this is just here to detect if using this old setting in order to give a helpful message
```

### DeprecatedIsStillUsed
Deprecated member 'InstrumentationKeyOverride' is still used
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java

  @Deprecated
  public static class InstrumentationKeyOverride {
    public String httpPathPrefix;
    public String instrumentationKey;
```

### DeprecatedIsStillUsed
Deprecated member 'reportingIntervalSeconds' is still used
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java
    // this is just here to detect if using this old undocumented setting in order to give a helpful
    // error message
    @Deprecated public int reportingIntervalSeconds = 60;
  }

```

### DeprecatedIsStillUsed
Deprecated member 'limitPerSecond' is still used
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java

    // this config option only existed in one BETA release (3.4.0-BETA)
    @Deprecated @Nullable public Double limitPerSecond;
  }

```

### DeprecatedIsStillUsed
Deprecated member 'quartz' is still used
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java
    // this is just here to detect if using this old setting in order to give a helpful message
    @Deprecated
    public DisabledByDefaultInstrumentation quartz = new DisabledByDefaultInstrumentation();

    // this is just here to detect if using this old setting in order to give a helpful message
```

### DeprecatedIsStillUsed
Deprecated member 'httpMethodInOperationName' is still used
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java
    public boolean captureControllerSpans;
    // this is just here to detect if using this old setting in order to give a helpful message
    @Deprecated public boolean httpMethodInOperationName;
    public LiveMetrics liveMetrics = new LiveMetrics();
    public LegacyRequestIdPropagation legacyRequestIdPropagation = new LegacyRequestIdPropagation();
```

### DeprecatedIsStillUsed
Deprecated member 'SpanKind' is still used
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java

  @Deprecated
  public enum SpanKind {
    @JsonProperty("server")
    SERVER(io.opentelemetry.api.trace.SpanKind.SERVER),
```

### DeprecatedIsStillUsed
Deprecated member 'telemetryKind' is still used
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/configuration/Configuration.java`
#### Snippet
```java

    // this config option existed in one GA release (3.4.0), and was then replaced by telemetryType
    @Deprecated @Nullable public SamplingTelemetryType telemetryKind;

    // this config option only existed in one BETA release (3.4.0-BETA)
```

### DeprecatedIsStillUsed
Deprecated member 'DEPRECATED_INSTRUMENTATION_KEY' is still used
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/AiSemanticAttributes.java`
#### Snippet
```java
  // will not see it and then be incorrect
  @Deprecated
  public static final AttributeKey<String> DEPRECATED_INSTRUMENTATION_KEY =
      AttributeKey.stringKey("ai.preview.instrumentation_key");

```

### DeprecatedIsStillUsed
Deprecated member 'DEPRECATED_ROLE_NAME' is still used
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/AiSemanticAttributes.java`
#### Snippet
```java
  // will not see it and then be incorrect
  @Deprecated
  public static final AttributeKey<String> DEPRECATED_ROLE_NAME =
      AttributeKey.stringKey("ai.preview.service_name");

```

### DeprecatedIsStillUsed
Deprecated member 'DEPRECATED_CONNECTION_STRING' is still used
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/AiSemanticAttributes.java`
#### Snippet
```java
  // will not see it and then be incorrect
  @Deprecated
  public static final AttributeKey<String> DEPRECATED_CONNECTION_STRING =
      AttributeKey.stringKey("ai.preview.connection_string");

```

### DeprecatedIsStillUsed
Deprecated member 'DEPRECATED_ROLE_INSTANCE' is still used
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/AiSemanticAttributes.java`
#### Snippet
```java
  // will not see it and then be incorrect
  @Deprecated
  public static final AttributeKey<String> DEPRECATED_ROLE_INSTANCE =
      AttributeKey.stringKey("ai.preview.service_instance_id");

```

### DeprecatedIsStillUsed
Deprecated member 'HTTP_HOST' is still used
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/SemanticAttributes.java`
#### Snippet
```java
   *     {@link SemanticAttributes#NET_HOST_NAME} instead.
   */
  @Deprecated public static final AttributeKey<String> HTTP_HOST = stringKey("http.host");

  /**
```

## RuleId[ruleID=HasPlatformType]
### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `agent/agent/build.gradle.kts`
#### Snippet
```java

// this configuration collects libs that will be placed in the bootstrap classloader
val bootstrapLibs by configurations.creating {
  isCanBeResolved = true
  isCanBeConsumed = false
```

### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `agent/agent/build.gradle.kts`
#### Snippet
```java
}
// this configuration collects libs that will be placed in the agent classloader, isolated from the instrumented application code
val javaagentLibs by configurations.creating {
  isCanBeResolved = true
  isCanBeConsumed = false
```

### HasPlatformType
Declaration has type inferred from a platform call, which can lead to unchecked nullability issues. Specify type explicitly as nullable or non-nullable.
in `agent/agent/build.gradle.kts`
#### Snippet
```java
val otelInstrumentationAlphaVersion: String by project

val licenseReportDependencies by configurations.creating {
  extendsFrom(bootstrapLibs)
}
```

## RuleId[ruleID=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/config/ConfigService.java`
#### Snippet
```java
      pullSettings()
          .doOnError(e -> logger.error("Error pulling service profiler settings", e))
          .subscribe(config -> updateListener.accept(config));
    } catch (Throwable t) {
      logger.error("Error pulling service profiler settings", t);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/triggers/AlertConfigParser.java`
#### Snippet
```java
    parsers.put(
        "settings-moniker",
        new ParseConfigValue<>(true, (config, arg) -> config.setSettingsMoniker(arg)));

    return parseConfig(CollectionPlanConfiguration.builder(), tokens, parsers).build();
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `smoke-tests/apps/LiveMetrics/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/LiveMetricsTest.java`
#### Snippet
```java
    Awaitility.await()
        .atMost(Duration.ofSeconds(10))
        .until(() -> testing.mockedIngestion.isLiveMetricsPingReceived());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `smoke-tests/apps/HttpClients/src/main/java/com/microsoft/applicationinsights/smoketestapp/HttpClientServlet.java`
#### Snippet
```java

  private void springWebClient(String url) {
    WebClient.create().get().uri(url).exchange().map(response -> response.statusCode()).block();
  }

```

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'threads' in a Serializable class
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/perfcounter/PerformanceCounterContainer.java`
#### Snippet
```java
  private long collectionFrequencyInMillis = DEFAULT_COLLECTION_FREQUENCY_IN_SEC * 1000;

  private ScheduledThreadPoolExecutor threads;

  /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'availableJmxMetricLogger' in a Serializable class
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/perfcounter/PerformanceCounterContainer.java`
#### Snippet
```java
  private final List<PerformanceCounter> performanceCounters = new CopyOnWriteArrayList<>();

  @Nullable private volatile AvailableJmxMetricLogger availableJmxMetricLogger;

  private volatile boolean initialized = false;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'client' in a Serializable class
in `smoke-tests/apps/Sampling/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleSamplingServlet.java`
#### Snippet
```java
  private static final Logger logger = Logger.getLogger(SimpleSamplingServlet.class.getName());

  private final TelemetryClient client = new TelemetryClient();

  private final AtomicInteger count = new AtomicInteger();
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'client' in a Serializable class
in `smoke-tests/apps/CoreAndFilter2x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackTraceServlet.java`
#### Snippet
```java
public class SimpleTrackTraceServlet extends HttpServlet {

  private final TelemetryClient client = new TelemetryClient();

  protected void doGet(HttpServletRequest request, HttpServletResponse response) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'client' in a Serializable class
in `smoke-tests/apps/CoreAndFilter2x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackEventServlet.java`
#### Snippet
```java
public class SimpleTrackEventServlet extends HttpServlet {

  private final TelemetryClient client = new TelemetryClient();

  protected void doGet(HttpServletRequest request, HttpServletResponse response) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'client' in a Serializable class
in `smoke-tests/apps/CoreAndFilter2x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackHttpRequestServlet.java`
#### Snippet
```java
public class SimpleTrackHttpRequestServlet extends HttpServlet {

  private final TelemetryClient client = new TelemetryClient();

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'client' in a Serializable class
in `smoke-tests/apps/CoreAndFilter2x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackMetricServlet.java`
#### Snippet
```java
public class SimpleTrackMetricServlet extends HttpServlet {

  private final TelemetryClient client = new TelemetryClient();

  protected void doGet(HttpServletRequest request, HttpServletResponse response) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'client' in a Serializable class
in `smoke-tests/apps/CoreAndFilter2x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackDependencyServlet.java`
#### Snippet
```java
public class SimpleTrackDependencyServlet extends HttpServlet {

  private final TelemetryClient client = new TelemetryClient();

  protected void doGet(HttpServletRequest request, HttpServletResponse response) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'client' in a Serializable class
in `smoke-tests/apps/CoreAndFilter2x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackExceptionServlet.java`
#### Snippet
```java
public class SimpleTrackExceptionServlet extends HttpServlet {

  private final TelemetryClient client = new TelemetryClient();

  protected void doGet(HttpServletRequest request, HttpServletResponse response) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'client' in a Serializable class
in `smoke-tests/apps/CoreAndFilter2x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackPageViewServlet.java`
#### Snippet
```java
public class SimpleTrackPageViewServlet extends HttpServlet {

  private final TelemetryClient client = new TelemetryClient();

  protected void doGet(HttpServletRequest request, HttpServletResponse response) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'client' in a Serializable class
in `smoke-tests/apps/CoreAndFilter3x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackHttpRequestServlet.java`
#### Snippet
```java
public class SimpleTrackHttpRequestServlet extends HttpServlet {

  private final TelemetryClient client = new TelemetryClient();

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'client' in a Serializable class
in `smoke-tests/apps/CoreAndFilter3x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackMetricServlet.java`
#### Snippet
```java
public class SimpleTrackMetricServlet extends HttpServlet {

  private final TelemetryClient client = new TelemetryClient();

  protected void doGet(HttpServletRequest request, HttpServletResponse response) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'client' in a Serializable class
in `smoke-tests/apps/CoreAndFilter3x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackDependencyServlet.java`
#### Snippet
```java
public class SimpleTrackDependencyServlet extends HttpServlet {

  private final TelemetryClient client = new TelemetryClient();

  protected void doGet(HttpServletRequest request, HttpServletResponse response) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'client' in a Serializable class
in `smoke-tests/apps/CoreAndFilter3x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackTraceServlet.java`
#### Snippet
```java
public class SimpleTrackTraceServlet extends HttpServlet {

  private final TelemetryClient client = new TelemetryClient();

  protected void doGet(HttpServletRequest request, HttpServletResponse response) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'client' in a Serializable class
in `smoke-tests/apps/CoreAndFilter3x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackEventServlet.java`
#### Snippet
```java
public class SimpleTrackEventServlet extends HttpServlet {

  private final TelemetryClient client = new TelemetryClient();

  protected void doGet(HttpServletRequest request, HttpServletResponse response) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'client' in a Serializable class
in `smoke-tests/apps/CoreAndFilter3x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackExceptionServlet.java`
#### Snippet
```java
public class SimpleTrackExceptionServlet extends HttpServlet {

  private final TelemetryClient client = new TelemetryClient();

  protected void doGet(HttpServletRequest request, HttpServletResponse response) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'client' in a Serializable class
in `smoke-tests/apps/CoreAndFilter3x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackMetricWithNamespaceServlet.java`
#### Snippet
```java
public class SimpleTrackMetricWithNamespaceServlet extends HttpServlet {

  private final TelemetryClient client = new TelemetryClient();

  protected void doGet(HttpServletRequest request, HttpServletResponse response) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'client' in a Serializable class
in `smoke-tests/apps/CoreAndFilter3x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackAvailabilityServlet.java`
#### Snippet
```java
public class SimpleTrackAvailabilityServlet extends HttpServlet {

  private final TelemetryClient client = new TelemetryClient();

  protected void doGet(HttpServletRequest request, HttpServletResponse response) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'client' in a Serializable class
in `smoke-tests/apps/CoreAndFilter3x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackPageViewServlet.java`
#### Snippet
```java
public class SimpleTrackPageViewServlet extends HttpServlet {

  private final TelemetryClient client = new TelemetryClient();

  protected void doGet(HttpServletRequest request, HttpServletResponse response) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'client' in a Serializable class
in `smoke-tests/apps/CoreAndFilter3xUsingOld3xAgent/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackTraceServlet.java`
#### Snippet
```java
public class SimpleTrackTraceServlet extends HttpServlet {

  private final TelemetryClient client = new TelemetryClient();

  protected void doGet(HttpServletRequest request, HttpServletResponse response) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'client' in a Serializable class
in `smoke-tests/apps/CoreAndFilter3xUsingOld3xAgent/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackHttpRequestServlet.java`
#### Snippet
```java
public class SimpleTrackHttpRequestServlet extends HttpServlet {

  private final TelemetryClient client = new TelemetryClient();

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'client' in a Serializable class
in `smoke-tests/apps/CoreAndFilter3xUsingOld3xAgent/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackEventServlet.java`
#### Snippet
```java
public class SimpleTrackEventServlet extends HttpServlet {

  private final TelemetryClient client = new TelemetryClient();

  protected void doGet(HttpServletRequest request, HttpServletResponse response) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'client' in a Serializable class
in `smoke-tests/apps/CoreAndFilter3xUsingOld3xAgent/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackMetricServlet.java`
#### Snippet
```java
public class SimpleTrackMetricServlet extends HttpServlet {

  private final TelemetryClient client = new TelemetryClient();

  protected void doGet(HttpServletRequest request, HttpServletResponse response) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'client' in a Serializable class
in `smoke-tests/apps/CoreAndFilter3xUsingOld3xAgent/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackDependencyServlet.java`
#### Snippet
```java
public class SimpleTrackDependencyServlet extends HttpServlet {

  private final TelemetryClient client = new TelemetryClient();

  protected void doGet(HttpServletRequest request, HttpServletResponse response) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'client' in a Serializable class
in `smoke-tests/apps/CoreAndFilter3xUsingOld3xAgent/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackAvailabilityServlet.java`
#### Snippet
```java
public class SimpleTrackAvailabilityServlet extends HttpServlet {

  private final TelemetryClient client = new TelemetryClient();

  protected void doGet(HttpServletRequest request, HttpServletResponse response) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'client' in a Serializable class
in `smoke-tests/apps/CoreAndFilter3xUsingOld3xAgent/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackExceptionServlet.java`
#### Snippet
```java
public class SimpleTrackExceptionServlet extends HttpServlet {

  private final TelemetryClient client = new TelemetryClient();

  protected void doGet(HttpServletRequest request, HttpServletResponse response) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'client' in a Serializable class
in `smoke-tests/apps/CoreAndFilter3xUsingOld3xAgent/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackMetricWithNamespaceServlet.java`
#### Snippet
```java
public class SimpleTrackMetricWithNamespaceServlet extends HttpServlet {

  private final TelemetryClient client = new TelemetryClient();

  protected void doGet(HttpServletRequest request, HttpServletResponse response) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'client' in a Serializable class
in `smoke-tests/apps/CoreAndFilter3xUsingOld3xAgent/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTrackPageViewServlet.java`
#### Snippet
```java
public class SimpleTrackPageViewServlet extends HttpServlet {

  private final TelemetryClient client = new TelemetryClient();

  protected void doGet(HttpServletRequest request, HttpServletResponse response) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'multimapLock' in a Serializable class
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/fakeingestion/MockedAppInsightsIngestionServlet.java`
#### Snippet
```java
  private final ListMultimap<String, Envelope> type2envelope;

  private final Object multimapLock = new Object();

  private volatile boolean liveMetricsPingReceived;
```

## RuleId[ruleID=CollectionContainsUrl]
### CollectionContainsUrl
Map `redirectCache` may contain URL objects
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/pipeline/TelemetryPipeline.java`
#### Snippet
```java

  // key is connectionString, value is redirectUrl
  private final Map<String, URL> redirectCache =
      Collections.synchronizedMap(new BoundedHashMap<>(100));

```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `agent/agent-profiler/agent-alerting/src/main/java/com/microsoft/applicationinsights/alerting/analysis/pipelines/AlertPipelines.java`
#### Snippet
```java

    LOGGER.debug(
        "Set alert configuration for {}: {}", newAlertConfig.getType(), newAlertConfig.toString());
  }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `smoke-tests/apps/CoreAndFilter2x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SlowRequestCpuBoundServlet.java`
#### Snippet
```java
    }
    // this is just to use the value so JIT doesn't remove any computation
    System.out.printf("Accumulated sum: %s (%d iterations)%n", sum.toString(), iterations);
  }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `smoke-tests/apps/CoreAndFilter3x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SlowRequestCpuBoundServlet.java`
#### Snippet
```java
    }
    // this is just to use the value so JIT doesn't remove any computation
    System.out.printf("Accumulated sum: %s (%d iterations)%n", sum.toString(), iterations);
  }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `smoke-tests/apps/CoreAndFilter3xUsingOld3xAgent/src/main/java/com/microsoft/applicationinsights/smoketestapp/SlowRequestCpuBoundServlet.java`
#### Snippet
```java
    }
    // this is just to use the value so JIT doesn't remove any computation
    System.out.printf("Accumulated sum: %s (%d iterations)%n", sum.toString(), iterations);
  }

```

## RuleId[ruleID=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `index`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/triggers/AlertConfigParser.java`
#### Snippet
```java
        if (parser != null) {
          if (parser.hasArg && index + 1 < tokens.length) {
            String arg = tokens[++index];
            parser.configParser.parse(builder, arg);
          } else if (!parser.hasArg) {
```

## RuleId[ruleID=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/ProfilingInitializer.java`
#### Snippet
```java
                    3,
                    "Location",
                    new HashSet<>(
                        Arrays.asList(HttpMethod.GET, HttpMethod.HEAD, HttpMethod.POST)))));

```

## RuleId[ruleID=ForEachParameterNotUsed]
### ForEachParameterNotUsed
Loop parameter 'it' is unused
in `agent/agent/build.gradle.kts`
#### Snippet
```java
// Don't publish non-shadowed jar (shadowJar is in shadowRuntimeElements)
with(components["java"] as AdhocComponentWithVariants) {
  configurations.forEach {
    withVariantsFromConfiguration(configurations["apiElements"]) {
      skip()
```

## RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `directory` accessed in synchronized context
in `agent/agent-bootstrap/src/main/java/com/microsoft/applicationinsights/agent/bootstrap/diagnostics/status/StatusFile.java`
#### Snippet
```java
            // this is just a safeguard
            synchronized (lock) {
              File file = new File(directory, fileName);
              boolean dirsWereCreated = file.getParentFile().mkdirs();

```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/utils/TrieImpl.java`
#### Snippet
```java
      int size = children.size();
      char[] chars = new char[size];
      @SuppressWarnings({"unchecked", "rawtypes"})
      Node<V>[] nodes = new Node[size];

      int i = 0;
```

## RuleId[ruleID=PropertyName]
### PropertyName
Property name `DEPENDENCY_BOMS` should start with a lowercase letter
in `dependencyManagement/build.gradle.kts`
#### Snippet
```java
rootProject.extra["otelContribAlphaVersion"] = otelContribAlphaVersion

val DEPENDENCY_BOMS = listOf(
  "com.fasterxml.jackson:jackson-bom:2.14.0",
  "com.google.guava:guava-bom:31.1-jre",
```

### PropertyName
Property name `CORE_DEPENDENCIES` should start with a lowercase letter
in `dependencyManagement/build.gradle.kts`
#### Snippet
```java
val moshiVersion = "1.11.0"

val CORE_DEPENDENCIES = listOf(
  "com.google.auto.service:auto-service:${autoServiceVersion}",
  "com.google.auto.service:auto-service-annotations:${autoServiceVersion}",
```

### PropertyName
Property name `DEPENDENCIES` should start with a lowercase letter
in `dependencyManagement/build.gradle.kts`
#### Snippet
```java
)

val DEPENDENCIES = listOf(
  "ch.qos.logback:logback-classic:1.2.11",
  "ch.qos.logback.contrib:logback-json-classic:0.1.5",
```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `agent/agent/src/main/java/com/microsoft/applicationinsights/agent/StartupProfiler.java`
#### Snippet
```java
          Thread.sleep(50);
        } catch (InterruptedException e) {
          System.out.println("Startup profiler interrupted");
          return;
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `agent/agent/src/main/java/com/microsoft/applicationinsights/agent/StartupProfiler.java`
#### Snippet
```java
    File folder = new File(tempDirectory, "applicationinsights");
    if (!folder.exists() && !folder.mkdirs()) {
      System.out.println("Failed to create directory: " + tempDirectory);
      return;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `agent/agent/src/main/java/com/microsoft/applicationinsights/agent/StartupProfiler.java`
#### Snippet
```java

    File dumpFile = new File(folder, STACKTRACES);
    System.out.println("Writing startup profiler to '" + dumpFile.getPath() + "'");

    PrintWriter printWriter;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `agent/agent/src/main/java/com/microsoft/applicationinsights/agent/StartupProfiler.java`
#### Snippet
```java
          new PrintWriter(Files.newBufferedWriter(dumpFile.toPath(), Charset.defaultCharset()));
    } catch (IOException e) {
      System.out.println("Error occurred when writing dump to " + dumpFile.getPath());
      e.printStackTrace();
      return;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/FirstEntryPoint.java`
#### Snippet
```java
        // trace to stderr
        if (isFriendlyException) {
          System.err.println(message);
        } else {
          t.printStackTrace();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `agent/agent-bootstrap/src/main/java/com/microsoft/applicationinsights/agent/bootstrap/diagnostics/status/StatusFile.java`
#### Snippet
```java
                  }
                } else {
                  System.err.println(
                      "Parent directories for status file could not be created: "
                          + file.getAbsolutePath());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `agent/agent-bootstrap/src/main/java/com/microsoft/applicationinsights/agent/bootstrap/BytecodeUtil.java`
#### Snippet
```java
    Long startNanos = startNanosHolder.get();
    if (startNanos == null) {
      System.out.println("Signed jar access (no timing available)");
      Thread.dumpStack();
    } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `agent/agent-bootstrap/src/main/java/com/microsoft/applicationinsights/agent/bootstrap/BytecodeUtil.java`
#### Snippet
```java
      long durationNanos = System.nanoTime() - startNanos;
      if (durationNanos > MILLISECONDS.toNanos(1)) {
        System.out.println(
            "Signed jar access (" + NANOSECONDS.toMillis(durationNanos) + " milliseconds)");
        Thread.dumpStack();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/apps/JMS/src/main/java/com/microsoft/applicationinsights/smoketestapp/Receiver.java`
#### Snippet
```java
  @JmsListener(destination = "message", containerFactory = "factory")
  public void message(String message) throws IOException {
    System.out.println("received: " + message);

    CloseableHttpClient httpClient = HttpClientBuilder.create().disableAutomaticRetries().build();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/apps/Kafka/src/main/java/com/microsoft/applicationinsights/smoketestapp/Receiver.java`
#### Snippet
```java
  @KafkaListener(topics = "mytopic", groupId = "mygroup")
  public void message(String message) throws IOException {
    System.out.println("received: " + message);

    CloseableHttpClient httpClient = HttpClientBuilder.create().disableAutomaticRetries().build();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `smoke-tests/apps/CoreAndFilter2x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTestRequestSlowWithResponseTime.java`
#### Snippet
```java
        sleepTime = Integer.parseInt(customSleepTime);
      } catch (NumberFormatException e) {
        System.err.printf("Invalid value for 'sleeptime': '%s'%n", customSleepTime);
      }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/apps/CoreAndFilter2x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTestRequestSlowWithResponseTime.java`
#### Snippet
```java
    }
    try {
      System.out.printf("Sleeping for %d seconds.%n", sleepTime);
      TimeUnit.SECONDS.sleep(sleepTime);
    } catch (InterruptedException ex) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/apps/CoreAndFilter2x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SlowRequestCpuBoundServlet.java`
#### Snippet
```java
      try {
        responseTime = Integer.parseInt(customResponseTime);
        System.out.println("Custom responseTime = " + responseTime);
      } catch (NumberFormatException e) {
        System.err.printf("Invalid value for 'responseTime': '%s'%n", customResponseTime);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `smoke-tests/apps/CoreAndFilter2x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SlowRequestCpuBoundServlet.java`
#### Snippet
```java
        System.out.println("Custom responseTime = " + responseTime);
      } catch (NumberFormatException e) {
        System.err.printf("Invalid value for 'responseTime': '%s'%n", customResponseTime);
      }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/apps/CoreAndFilter2x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SlowRequestCpuBoundServlet.java`
#### Snippet
```java
    }
    // this is just to use the value so JIT doesn't remove any computation
    System.out.printf("Accumulated sum: %s (%d iterations)%n", sum.toString(), iterations);
  }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `smoke-tests/apps/CoreAndFilter3x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTestRequestSlowWithResponseTime.java`
#### Snippet
```java
        sleepTime = Integer.parseInt(customSleepTime);
      } catch (NumberFormatException e) {
        System.err.printf("Invalid value for 'sleeptime': '%s'%n", customSleepTime);
      }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/apps/CoreAndFilter3x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTestRequestSlowWithResponseTime.java`
#### Snippet
```java
    }
    try {
      System.out.printf("Sleeping for %d seconds.%n", sleepTime);
      TimeUnit.SECONDS.sleep(sleepTime);
    } catch (InterruptedException ex) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/apps/CoreAndFilter3x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SlowRequestCpuBoundServlet.java`
#### Snippet
```java
      try {
        responseTime = Integer.parseInt(customResponseTime);
        System.out.println("Custom responseTime = " + responseTime);
      } catch (NumberFormatException e) {
        System.err.printf("Invalid value for 'responseTime': '%s'%n", customResponseTime);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `smoke-tests/apps/CoreAndFilter3x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SlowRequestCpuBoundServlet.java`
#### Snippet
```java
        System.out.println("Custom responseTime = " + responseTime);
      } catch (NumberFormatException e) {
        System.err.printf("Invalid value for 'responseTime': '%s'%n", customResponseTime);
      }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/apps/CoreAndFilter3x/src/main/java/com/microsoft/applicationinsights/smoketestapp/SlowRequestCpuBoundServlet.java`
#### Snippet
```java
    }
    // this is just to use the value so JIT doesn't remove any computation
    System.out.printf("Accumulated sum: %s (%d iterations)%n", sum.toString(), iterations);
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/apps/SpringScheduling/src/main/java/com/microsoft/applicationinsights/smoketestapp/SpringSchedulingApp.java`
#### Snippet
```java
  @Scheduled(fixedRate = 100)
  public void fixedRateScheduler() {
    System.out.println("Hello world.");
  }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/apps/AutoPerfCounters/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/AutoPerfCountersTest.java`
#### Snippet
```java
  @TargetUri(value = "index.jsp")
  void testPerformanceCounterData() throws Exception {
    System.out.println("Waiting for performance data...");
    long start = System.currentTimeMillis();

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/apps/AutoPerfCounters/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/AutoPerfCountersTest.java`
#### Snippet
```java
            timeout,
            TimeUnit.SECONDS);
    System.out.println("PerformanceCounterData are good: " + (System.currentTimeMillis() - start));

    MetricData metricMem = SmokeTestExtension.getBaseData(availableMem);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/apps/AutoPerfCounters/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/AutoPerfCountersTest.java`
#### Snippet
```java

    start = System.currentTimeMillis();
    System.out.println("Waiting for metric data...");
    Envelope deadlocks =
        testing.mockedIngestion.waitForItem(
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/apps/AutoPerfCounters/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/AutoPerfCountersTest.java`
#### Snippet
```java
        testing.mockedIngestion.waitForItem(
            getPerfMetricPredicate("GC Total Time"), timeout, TimeUnit.SECONDS);
    System.out.println("MetricData are good: " + (System.currentTimeMillis() - start));

    MetricData mdDeadlocks = SmokeTestExtension.getBaseData(deadlocks);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/apps/SpringCloudStream/src/main/java/com/microsoft/applicationinsights/smoketestapp/GreetingsListener.java`
#### Snippet
```java
  @StreamListener(GreetingsStreams.INPUT)
  public void handleGreetings(@Payload Greetings greetings) {
    System.out.println("Received greetings: " + greetings);
  }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/apps/CoreAndFilter2x/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/CoreAndFilter2xTest.java`
#### Snippet
```java
    long max = expected + tolerance;

    System.out.printf("Slow response time: expected=%d, actual=%d%n", expected, actual);
    assertThat(actual).isGreaterThanOrEqualTo(min);
    assertThat(actual).isLessThan(max);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/apps/CoreAndFilter3x/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/CoreAndFilter3xTest.java`
#### Snippet
```java
    long max = expected + tolerance;

    System.out.printf("Slow response time: expected=%d, actual=%d%n", expected, actual);
    assertThat(actual).isGreaterThanOrEqualTo(min);
    assertThat(actual).isLessThan(max);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/apps/CoreAndFilter3xUsingOld3xAgent/src/main/java/com/microsoft/applicationinsights/smoketestapp/SlowRequestCpuBoundServlet.java`
#### Snippet
```java
      try {
        responseTime = Integer.parseInt(customResponseTime);
        System.out.println("Custom responseTime = " + responseTime);
      } catch (NumberFormatException e) {
        System.err.printf("Invalid value for 'responseTime': '%s'%n", customResponseTime);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `smoke-tests/apps/CoreAndFilter3xUsingOld3xAgent/src/main/java/com/microsoft/applicationinsights/smoketestapp/SlowRequestCpuBoundServlet.java`
#### Snippet
```java
        System.out.println("Custom responseTime = " + responseTime);
      } catch (NumberFormatException e) {
        System.err.printf("Invalid value for 'responseTime': '%s'%n", customResponseTime);
      }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/apps/CoreAndFilter3xUsingOld3xAgent/src/main/java/com/microsoft/applicationinsights/smoketestapp/SlowRequestCpuBoundServlet.java`
#### Snippet
```java
    }
    // this is just to use the value so JIT doesn't remove any computation
    System.out.printf("Accumulated sum: %s (%d iterations)%n", sum.toString(), iterations);
  }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `smoke-tests/apps/CoreAndFilter3xUsingOld3xAgent/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTestRequestSlowWithResponseTime.java`
#### Snippet
```java
        sleepTime = Integer.parseInt(customSleepTime);
      } catch (NumberFormatException e) {
        System.err.printf("Invalid value for 'sleeptime': '%s'%n", customSleepTime);
      }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/apps/CoreAndFilter3xUsingOld3xAgent/src/main/java/com/microsoft/applicationinsights/smoketestapp/SimpleTestRequestSlowWithResponseTime.java`
#### Snippet
```java
    }
    try {
      System.out.printf("Sleeping for %d seconds.%n", sleepTime);
      TimeUnit.SECONDS.sleep(sleepTime);
    } catch (InterruptedException ex) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/apps/CoreAndFilter3xUsingOld3xAgent/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/CoreAndFilter3xUsingOld3xAgentTest.java`
#### Snippet
```java
    long max = expected + tolerance;

    System.out.printf("Slow response time: expected=%d, actual=%d%n", expected, actual);
    assertThat(actual).isGreaterThanOrEqualTo(min);
    assertThat(actual).isLessThan(max);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/fakeingestion/MockedAppInsightsIngestionServlet.java`
#### Snippet
```java
  private void logit(String message) {
    if (loggingEnabled) {
      System.out.println("FAKE INGESTION: INFO - " + message);
    }
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/SmokeTestExtension.java`
#### Snippet
```java
  public void testFailed(ExtensionContext context, Throwable cause) {
    if (targetContainer != null) {
      System.out.println("Test failure detected.");
      System.out.println("Container logs:");
      System.out.println(targetContainer.getLogs());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/SmokeTestExtension.java`
#### Snippet
```java
    if (targetContainer != null) {
      System.out.println("Test failure detected.");
      System.out.println("Container logs:");
      System.out.println(targetContainer.getLogs());
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/SmokeTestExtension.java`
#### Snippet
```java
      System.out.println("Test failure detected.");
      System.out.println("Container logs:");
      System.out.println(targetContainer.getLogs());
    }
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/SmokeTestExtension.java`
#### Snippet
```java
            TimeUnit.SECONDS);
      }
      System.out.printf(
          "Received request telemetry after %.3f seconds...%n",
          receivedTelemetryTimer.elapsed(TimeUnit.MILLISECONDS) / 1000.0);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/SmokeTestExtension.java`
#### Snippet
```java
  public void afterAll(ExtensionContext context) throws Exception {
    if (allContainers != null) {
      System.out.println("Stopping containers...");
      for (GenericContainer<?> container : allContainers) {
        container.stop();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/SmokeTestExtension.java`
#### Snippet
```java
  // enabled
  private void startTestApplicationContainer() throws Exception {
    System.out.println("Starting app container...");

    // TODO (trask) make this port dynamic so can run tests in parallel
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/SmokeTestExtension.java`
#### Snippet
```java
    Stopwatch stopwatch = Stopwatch.createStarted();
    container.start();
    System.out.printf(
        "App container (%s) started after %.3f seconds%n",
        container.getContainerId(), stopwatch.elapsed(TimeUnit.MILLISECONDS) / 1000.0);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/SmokeTestExtension.java`
#### Snippet
```java
  public void afterEach(ExtensionContext context) {
    mockedIngestion.resetData();
    System.out.println("Mocked ingestion reset.");
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/SmokeTestExtension.java`
#### Snippet
```java
      HttpHelper.getResponseCodeEnsuringSampled(contextRootUrl);
      waitForHealthCheckTelemetry(contextRootUrl);
      System.out.println("Clearing any RequestData from health check.");
      mockedIngestion.resetData();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/SmokeTestExtension.java`
#### Snippet
```java

  private void prepareEnvironment(Environment environment) throws Exception {
    System.out.println("Preparing environment...");
    currentImageName = environment.value().getImageName();
    currentImageAppDir = environment.value().getImageAppDir();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/SmokeTestExtension.java`
#### Snippet
```java
  private void startDependencyContainers() {
    if (dependencyContainer != null) {
      System.out.println("Starting container: " + dependencyContainer.getDockerImageName());
      String containerName = "dependency" + ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE);
      dependencyContainer
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/SmokeTestExtension.java`
#### Snippet
```java
      Stopwatch stopwatch = Stopwatch.createStarted();
      dependencyContainer.start();
      System.out.printf(
          "Dependency container %s (%s) started after %.3f seconds%n",
          dependencyContainer.getDockerImageName(),
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/SmokeTestExtension.java`
#### Snippet
```java
    for (DependencyContainer dc : dependencyImages) {
      String imageName = dc.imageName().isEmpty() ? dc.value() : dc.imageName();
      System.out.println("Starting container: " + imageName);
      String containerName = "dependency" + ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE);
      String[] envVars = substitue(dc.environmentVariables());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/SmokeTestExtension.java`
#### Snippet
```java
      Stopwatch stopwatch = Stopwatch.createStarted();
      container.start();
      System.out.printf(
          "Dependency container %s (%s) started after %.3f seconds%n",
          imageName, container.getContainerId(), stopwatch.elapsed(TimeUnit.MILLISECONDS) / 1000.0);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/SmokeTestExtension.java`
#### Snippet
```java
  @Override
  public void beforeEach(ExtensionContext context) throws Exception {
    System.out.println("Configuring test...");
    TargetUri targetUri = context.getRequiredTestMethod().getAnnotation(TargetUri.class);
    if (targetUri == null) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/SmokeTestExtension.java`
#### Snippet
```java
    TargetUri targetUri = context.getRequiredTestMethod().getAnnotation(TargetUri.class);
    if (targetUri == null) {
      System.out.println("@TargetUri is missing, not making any server request");
      return;
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/SmokeTestExtension.java`
#### Snippet
```java
    String url = getBaseUrl() + targetUri.value();
    if (targetUri.callCount() == 1) {
      System.out.println("calling " + url);
    } else {
      System.out.println("calling " + url + " " + targetUri.callCount() + " times");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/SmokeTestExtension.java`
#### Snippet
```java
      System.out.println("calling " + url);
    } else {
      System.out.println("calling " + url + " " + targetUri.callCount() + " times");
    }
    for (int i = 0; i < targetUri.callCount(); i++) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/fakeingestion/MockedAppInsightsIngestionServer.java`
#### Snippet
```java
  @SuppressWarnings("SystemOut")
  public void startServer() throws Exception {
    System.out.println("Starting fake ingestion...");
    server.start();
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/fakeingestion/MockedAppInsightsIngestionServer.java`
#### Snippet
```java
  public static void main(String[] args) throws Exception {
    MockedAppInsightsIngestionServer i = new MockedAppInsightsIngestionServer();
    System.out.println("Starting mocked ingestion on port " + DEFAULT_PORT);
    Runtime.getRuntime()
        .addShutdownHook(
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/fakeingestion/MockedAppInsightsIngestionServer.java`
#### Snippet
```java
  @SuppressWarnings("SystemOut")
  public void stopServer() throws Exception {
    System.out.println("Stopping fake ingestion...");
    server.stop();
    server.join();
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/AlternativeJfrConfigurations.java`
#### Snippet
```java
        // Try parsing the triggeredSettings as a pre-configured type
        // Convert from kebab case to enum type
        String enumType = triggeredSettings.toUpperCase().replaceAll("-", "_");
        ProfileTypes profile = ProfileTypes.valueOf(enumType);

```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/triggers/AlertConfigParser.java`
#### Snippet
```java
    for (int index = 0; index < tokens.length; index++) {
      if (tokens[index] != null && !tokens[index].isEmpty()) {
        ParseConfigValue<T> parser = parsers.get(tokens[index].replaceFirst("--", ""));

        if (parser != null) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/logbackpatch/FileNamePattern.java`
#### Snippet
```java
    String directory = pattern.substring(0, index + 1);
    String file = pattern.substring(index + 1);
    return directory.replace("%", "\\%") + file;
  }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/logbackpatch/FixedWindowRollingPolicy.java`
#### Snippet
```java
    String slashified = FileFilterUtil.slashify(fileNamePatternStr);
    String stemOfFileNamePattern = FileFilterUtil.afterLastSlash(slashified);
    return stemOfFileNamePattern.replace("%i", "%d{" + ZIP_ENTRY_DATE_PATTERN + "}");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/agent-bootstrap/src/main/java/com/microsoft/applicationinsights/agent/bootstrap/diagnostics/log/ApplicationInsightsCsvLayout.java`
#### Snippet
```java
  private static String formatForCsv(String str) {
    // convert both windows and linux newlines just to be safe
    return str.replace("\r\n", " ").replace("\n", " ").replace('\"', '\'');
  }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/agent-bootstrap/src/main/java/com/microsoft/applicationinsights/agent/bootstrap/diagnostics/log/ApplicationInsightsCsvLayout.java`
#### Snippet
```java
  private static String formatForCsv(String str) {
    // convert both windows and linux newlines just to be safe
    return str.replace("\r\n", " ").replace("\n", " ").replace('\"', '\'');
  }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/agent-bootstrap/src/main/java/com/microsoft/applicationinsights/agent/bootstrap/diagnostics/status/StatusFile.java`
#### Snippet
```java
          uniqueId = String.valueOf(Math.abs(runtimeMxBean.getStartTime()));
        } else {
          uniqueId = UUID.randomUUID().toString().replace("-", "");
        }
      }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/quickpulse/QuickPulse.java`
#### Snippet
```java
      String sdkVersion) {

    String quickPulseId = UUID.randomUUID().toString().replace("-", "");
    ArrayBlockingQueue<HttpRequest> sendQueue = new ArrayBlockingQueue<>(256, true);

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/fakeingestion/JsonHelper.java`
#### Snippet
```java
      boolean hasDays = firstDot > -1 && firstDot < value.indexOf(':');

      String[] parts = value.split("[:.]"); // [days.]hours:minutes:seconds[.milliseconds]

      long[] conversionFactor = new long[] {86400000, 3600000, 60000, 1000, 1};
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/SmokeTestExtension.java`
#### Snippet
```java
      return "";
    } else {
      return currentImageAppFileName.replace(".war", "");
    }
  }
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `com.microsoft.applicationinsights.telemetry` is unnecessary and can be removed
in `classic-sdk/core/src/main/java/com/microsoft/applicationinsights/telemetry/RequestTelemetry.java`
#### Snippet
```java
   * @param timestamp The time of the request.
   * @param duration The duration, as an {@link
   *     com.microsoft.applicationinsights.telemetry.Duration} instance, of the request processing.
   * @param responseCode The HTTP response code.
   * @param success 'true' if the request was a success, 'false' otherwise.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.microsoft.applicationinsights.telemetry` is unnecessary and can be removed
in `classic-sdk/core/src/main/java/com/microsoft/applicationinsights/TelemetryClient.java`
#### Snippet
```java
   * under Custom Metrics in Metric Explorer.
   *
   * @param telemetry The {@link com.microsoft.applicationinsights.telemetry.Telemetry} instance.
   */
  public void trackMetric(MetricTelemetry telemetry) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.microsoft.applicationinsights.telemetry` is unnecessary and can be removed
in `classic-sdk/core/src/main/java/com/microsoft/applicationinsights/TelemetryClient.java`
#### Snippet
```java
   * Sends a TraceTelemetry record for display in Diagnostic Search.
   *
   * @param telemetry The {@link com.microsoft.applicationinsights.telemetry.Telemetry} instance.
   */
  public void trackTrace(TraceTelemetry telemetry) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.microsoft.applicationinsights.telemetry` is unnecessary and can be removed
in `classic-sdk/core/src/main/java/com/microsoft/applicationinsights/TelemetryClient.java`
#### Snippet
```java
   * This method is part of the Application Insights infrastructure. Do not call it directly.
   *
   * @param telemetry The {@link com.microsoft.applicationinsights.telemetry.Telemetry} instance.
   */
  public void track(Telemetry telemetry) {
```

### UnnecessaryFullyQualifiedName
Qualifier `okhttp3` is unnecessary, and can be replaced with an import
in `smoke-tests/apps/NonDaemonThreads/src/main/java/com/microsoft/applicationinsights/smoketestapp/SpringBootApp.java`
#### Snippet
```java

  private static void okHttp3() throws IOException {
    okhttp3.OkHttpClient client = new okhttp3.OkHttpClient();
    okhttp3.Request request =
        new okhttp3.Request.Builder().url("https://www.bing.com/search?q=test").build();
```

### UnnecessaryFullyQualifiedName
Qualifier `okhttp3` is unnecessary, and can be replaced with an import
in `smoke-tests/apps/NonDaemonThreads/src/main/java/com/microsoft/applicationinsights/smoketestapp/SpringBootApp.java`
#### Snippet
```java

  private static void okHttp3() throws IOException {
    okhttp3.OkHttpClient client = new okhttp3.OkHttpClient();
    okhttp3.Request request =
        new okhttp3.Request.Builder().url("https://www.bing.com/search?q=test").build();
```

### UnnecessaryFullyQualifiedName
Qualifier `okhttp3` is unnecessary, and can be replaced with an import
in `smoke-tests/apps/NonDaemonThreads/src/main/java/com/microsoft/applicationinsights/smoketestapp/SpringBootApp.java`
#### Snippet
```java
  private static void okHttp3() throws IOException {
    okhttp3.OkHttpClient client = new okhttp3.OkHttpClient();
    okhttp3.Request request =
        new okhttp3.Request.Builder().url("https://www.bing.com/search?q=test").build();
    okhttp3.Response response = client.newCall(request).execute();
```

### UnnecessaryFullyQualifiedName
Qualifier `okhttp3` is unnecessary, and can be replaced with an import
in `smoke-tests/apps/NonDaemonThreads/src/main/java/com/microsoft/applicationinsights/smoketestapp/SpringBootApp.java`
#### Snippet
```java
    okhttp3.OkHttpClient client = new okhttp3.OkHttpClient();
    okhttp3.Request request =
        new okhttp3.Request.Builder().url("https://www.bing.com/search?q=test").build();
    okhttp3.Response response = client.newCall(request).execute();
    response.body().close();
```

### UnnecessaryFullyQualifiedName
Qualifier `okhttp3` is unnecessary, and can be replaced with an import
in `smoke-tests/apps/NonDaemonThreads/src/main/java/com/microsoft/applicationinsights/smoketestapp/SpringBootApp.java`
#### Snippet
```java
    okhttp3.Request request =
        new okhttp3.Request.Builder().url("https://www.bing.com/search?q=test").build();
    okhttp3.Response response = client.newCall(request).execute();
    response.body().close();
    response.close();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.squareup.okhttp` is unnecessary, and can be replaced with an import
in `smoke-tests/apps/HttpClients/src/main/java/com/microsoft/applicationinsights/smoketestapp/HttpClientServlet.java`
#### Snippet
```java

  private void okHttp2(String url) throws IOException {
    com.squareup.okhttp.OkHttpClient client = new com.squareup.okhttp.OkHttpClient();
    com.squareup.okhttp.Request request =
        new com.squareup.okhttp.Request.Builder().url(url).build();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.squareup.okhttp` is unnecessary, and can be replaced with an import
in `smoke-tests/apps/HttpClients/src/main/java/com/microsoft/applicationinsights/smoketestapp/HttpClientServlet.java`
#### Snippet
```java

  private void okHttp2(String url) throws IOException {
    com.squareup.okhttp.OkHttpClient client = new com.squareup.okhttp.OkHttpClient();
    com.squareup.okhttp.Request request =
        new com.squareup.okhttp.Request.Builder().url(url).build();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.squareup.okhttp` is unnecessary, and can be replaced with an import
in `smoke-tests/apps/HttpClients/src/main/java/com/microsoft/applicationinsights/smoketestapp/HttpClientServlet.java`
#### Snippet
```java
  private void okHttp2(String url) throws IOException {
    com.squareup.okhttp.OkHttpClient client = new com.squareup.okhttp.OkHttpClient();
    com.squareup.okhttp.Request request =
        new com.squareup.okhttp.Request.Builder().url(url).build();
    client.newCall(request).execute().body().close();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.squareup.okhttp` is unnecessary, and can be replaced with an import
in `smoke-tests/apps/HttpClients/src/main/java/com/microsoft/applicationinsights/smoketestapp/HttpClientServlet.java`
#### Snippet
```java
    com.squareup.okhttp.OkHttpClient client = new com.squareup.okhttp.OkHttpClient();
    com.squareup.okhttp.Request request =
        new com.squareup.okhttp.Request.Builder().url(url).build();
    client.newCall(request).execute().body().close();
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `okhttp3` is unnecessary, and can be replaced with an import
in `smoke-tests/apps/HttpClients/src/main/java/com/microsoft/applicationinsights/smoketestapp/HttpClientServlet.java`
#### Snippet
```java

  private void okHttp3(String url) throws IOException {
    okhttp3.OkHttpClient client = new okhttp3.OkHttpClient();
    okhttp3.Request request = new okhttp3.Request.Builder().url(url).build();
    okhttp3.Response response = client.newCall(request).execute();
```

### UnnecessaryFullyQualifiedName
Qualifier `okhttp3` is unnecessary, and can be replaced with an import
in `smoke-tests/apps/HttpClients/src/main/java/com/microsoft/applicationinsights/smoketestapp/HttpClientServlet.java`
#### Snippet
```java

  private void okHttp3(String url) throws IOException {
    okhttp3.OkHttpClient client = new okhttp3.OkHttpClient();
    okhttp3.Request request = new okhttp3.Request.Builder().url(url).build();
    okhttp3.Response response = client.newCall(request).execute();
```

### UnnecessaryFullyQualifiedName
Qualifier `okhttp3` is unnecessary, and can be replaced with an import
in `smoke-tests/apps/HttpClients/src/main/java/com/microsoft/applicationinsights/smoketestapp/HttpClientServlet.java`
#### Snippet
```java
  private void okHttp3(String url) throws IOException {
    okhttp3.OkHttpClient client = new okhttp3.OkHttpClient();
    okhttp3.Request request = new okhttp3.Request.Builder().url(url).build();
    okhttp3.Response response = client.newCall(request).execute();
    response.body().close();
```

### UnnecessaryFullyQualifiedName
Qualifier `okhttp3` is unnecessary, and can be replaced with an import
in `smoke-tests/apps/HttpClients/src/main/java/com/microsoft/applicationinsights/smoketestapp/HttpClientServlet.java`
#### Snippet
```java
  private void okHttp3(String url) throws IOException {
    okhttp3.OkHttpClient client = new okhttp3.OkHttpClient();
    okhttp3.Request request = new okhttp3.Request.Builder().url(url).build();
    okhttp3.Response response = client.newCall(request).execute();
    response.body().close();
```

### UnnecessaryFullyQualifiedName
Qualifier `okhttp3` is unnecessary, and can be replaced with an import
in `smoke-tests/apps/HttpClients/src/main/java/com/microsoft/applicationinsights/smoketestapp/HttpClientServlet.java`
#### Snippet
```java
    okhttp3.OkHttpClient client = new okhttp3.OkHttpClient();
    okhttp3.Request request = new okhttp3.Request.Builder().url(url).build();
    okhttp3.Response response = client.newCall(request).execute();
    response.body().close();
    response.code();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.httpclient` is unnecessary and can be removed
in `smoke-tests/apps/HttpClients/src/main/java/com/microsoft/applicationinsights/smoketestapp/HttpClientServlet.java`
#### Snippet
```java

  private void apacheHttpClient3(String url) throws IOException {
    HttpClient httpClient3 = new org.apache.commons.httpclient.HttpClient();
    CookiePolicy.registerCookieSpec("PermitAllCookiesSpec", PermitAllCookiesSpec.class);
    httpClient3.getParams().setCookiePolicy("PermitAllCookiesSpec");
```

### UnnecessaryFullyQualifiedName
Qualifier `io.opentelemetry.instrumentation.annotations` is unnecessary, and can be replaced with an import
in `smoke-tests/apps/OpenTelemetryApiSupport/src/main/java/com/microsoft/applicationinsights/smoketestapp/TestController.java`
#### Snippet
```java
  }

  @io.opentelemetry.instrumentation.annotations.WithSpan
  private String underInstrumentationAnnotation(
      @io.opentelemetry.instrumentation.annotations.SpanAttribute("message") String msg) {
```

### UnnecessaryFullyQualifiedName
Qualifier `io.opentelemetry.instrumentation.annotations` is unnecessary, and can be replaced with an import
in `smoke-tests/apps/OpenTelemetryApiSupport/src/main/java/com/microsoft/applicationinsights/smoketestapp/TestController.java`
#### Snippet
```java
  @io.opentelemetry.instrumentation.annotations.WithSpan
  private String underInstrumentationAnnotation(
      @io.opentelemetry.instrumentation.annotations.SpanAttribute("message") String msg) {
    return "OK!";
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `io.opentelemetry.extension.annotations` is unnecessary, and can be replaced with an import
in `smoke-tests/apps/OpenTelemetryApiSupport/src/main/java/com/microsoft/applicationinsights/smoketestapp/TestController.java`
#### Snippet
```java
  }

  @io.opentelemetry.extension.annotations.WithSpan
  private String underExtensionAnnotation(
      @io.opentelemetry.extension.annotations.SpanAttribute("message") String msg) {
```

### UnnecessaryFullyQualifiedName
Qualifier `io.opentelemetry.extension.annotations` is unnecessary, and can be replaced with an import
in `smoke-tests/apps/OpenTelemetryApiSupport/src/main/java/com/microsoft/applicationinsights/smoketestapp/TestController.java`
#### Snippet
```java
  @io.opentelemetry.extension.annotations.WithSpan
  private String underExtensionAnnotation(
      @io.opentelemetry.extension.annotations.SpanAttribute("message") String msg) {
    return "OK!";
  }
```

## RuleId[ruleID=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `agent/agent/src/main/java/com/microsoft/applicationinsights/agent/StartupProfiler.java`
#### Snippet
```java
    } catch (IOException e) {
      System.out.println("Error occurred when writing dump to " + dumpFile.getPath());
      e.printStackTrace();
      return;
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/JarVerifierClassFileTransformer.java`
#### Snippet
```java
    } catch (Throwable t) {
      // logging hasn't been initialized yet
      t.printStackTrace();
      return null;
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/FirstEntryPoint.java`
#### Snippet
```java
          System.err.println(message);
        } else {
          t.printStackTrace();
        }
        // and write to a temp file because some environments do not have (easy) access to stderr
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `agent/agent-bootstrap/src/main/java/com/microsoft/applicationinsights/agent/bootstrap/diagnostics/SdkVersionFinder.java`
#### Snippet
```java
    } catch (IOException e) {
      // this is called early during startup before logging has been initialized
      e.printStackTrace();
    }
    return "unknown";
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `agent/agent-bootstrap/src/main/java/com/microsoft/applicationinsights/agent/bootstrap/diagnostics/status/StatusFile.java`
#### Snippet
```java
                    }
                  } else {
                    e.printStackTrace();
                  }
                  if (b != null) {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `smoke-tests/apps/Jdbc/src/main/java/com/microsoft/applicationinsights/smoketestapp/JdbcServlet.java`
#### Snippet
```java
    } catch (Exception e) {
      // surprisingly not all application servers seem to log init exceptions to stdout
      e.printStackTrace();
      throw new ServletException(e);
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `smoke-tests/apps/SamplingOverrides/src/main/java/com/microsoft/applicationinsights/smoketestapp/SamplingOverridesServlet.java`
#### Snippet
```java
    } catch (Exception e) {
      // surprisingly not all application servers seem to log init exceptions to stdout
      e.printStackTrace();
      throw new ServletException(e);
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `smoke-tests/apps/SamplingOverridesBackCompat/src/main/java/com/microsoft/applicationinsights/smoketestapp/SamplingOverridesBackCompatServlet.java`
#### Snippet
```java
    } catch (Exception e) {
      // surprisingly not all application servers seem to log init exceptions to stdout
      e.printStackTrace();
      throw new ServletException(e);
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/fakeingestion/MockedAppInsightsIngestionServer.java`
#### Snippet
```java
                      i.stopServer();
                    } catch (Exception e) {
                      e.printStackTrace();
                      throw new IllegalStateException(e);
                    }
```

## RuleId[ruleID=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new Callable() can be replaced with method reference
in `smoke-tests/apps/SamplingOverrides/src/main/java/com/microsoft/applicationinsights/smoketestapp/SamplingOverridesServlet.java`
#### Snippet
```java
    Connection connection =
        getConnection(
            new Callable<Connection>() {
              @Override
              public Connection call() throws Exception {
```

### Anonymous2MethodRef
Anonymous new Callable() can be replaced with method reference
in `smoke-tests/apps/SamplingOverridesBackCompat/src/main/java/com/microsoft/applicationinsights/smoketestapp/SamplingOverridesBackCompatServlet.java`
#### Snippet
```java
    Connection connection =
        getConnection(
            new Callable<Connection>() {
              @Override
              public Connection call() throws Exception {
```

## RuleId[ruleID=Convert2Lambda]
### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/perfcounter/PerformanceCounterContainer.java`
#### Snippet
```java
  private void scheduleWork() {
    threads.scheduleAtFixedRate(
        new Runnable() {
          @Override
          public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `agent/agent-bootstrap/src/main/java/com/microsoft/applicationinsights/agent/bootstrap/diagnostics/status/StatusFile.java`
#### Snippet
```java
    }
    WRITER_THREAD.submit(
        new Runnable() {
          @Override
          @SuppressFBWarnings(
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/heartbeat/HeartbeatDefaultPayload.java`
#### Snippet
```java
   */
  public static Runnable populateDefaultPayload(HeartbeatExporter provider) {
    return new Runnable() {
      @Override
      public void run() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `smoke-tests/apps/MongoDB/src/main/java/com/microsoft/applicationinsights/smoketestapp/MongoServlet.java`
#### Snippet
```java
  private static MongoClient getMongoClient() throws Exception {
    return getMongoClient(
        new Callable<MongoClient>() {
          @Override
          public MongoClient call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `smoke-tests/apps/Cassandra/src/main/java/com/microsoft/applicationinsights/smoketestapp/CassandraServlet.java`
#### Snippet
```java
  private static Session getCassandraSession() throws Exception {
    return getCassandraSession(
        new Callable<Session>() {
          @Override
          public Session call() {
```

### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `smoke-tests/apps/SpringBoot/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/SpringBootControllerSpansEnabledTest.java`
#### Snippet
```java
    List<Envelope> edList =
        testing.mockedIngestion.waitForItems(
            new Predicate<Envelope>() {
              @Override
              public boolean test(Envelope input) {
```

### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `smoke-tests/apps/AutoPerfCounters/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/AutoPerfCountersTest.java`
#### Snippet
```java
  private static Predicate<Envelope> getPerfMetricPredicate(String name) {
    Objects.requireNonNull(name, "name");
    return new Predicate<Envelope>() {
      @Override
      public boolean test(Envelope input) {
```

### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `smoke-tests/apps/SpringScheduling/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/SpringSchedulingTest.java`
#### Snippet
```java
    // wait for the http request generated by this test
    testing.mockedIngestion.waitForItem(
        new Predicate<Envelope>() {
          @Override
          public boolean test(Envelope input) {
```

### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `smoke-tests/apps/SpringScheduling/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/SpringSchedulingTest.java`
#### Snippet
```java
    // wait for at least two spring scheduler "requests"
    testing.mockedIngestion.waitForItems(
        new Predicate<Envelope>() {
          @Override
          public boolean test(Envelope input) {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `smoke-tests/apps/SamplingOverrides/src/main/java/com/microsoft/applicationinsights/smoketestapp/SamplingOverridesServlet.java`
#### Snippet
```java
    Connection connection =
        getConnection(
            new Callable<Connection>() {
              @Override
              public Connection call() throws Exception {
```

### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `smoke-tests/apps/CoreAndFilter2x/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/CoreAndFilter2xTest.java`
#### Snippet
```java
    List<Envelope> edList =
        testing.mockedIngestion.waitForItems(
            new Predicate<Envelope>() {
              @Override
              public boolean test(Envelope input) {
```

### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `smoke-tests/apps/CoreAndFilter3x/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/CoreAndFilter3xTest.java`
#### Snippet
```java
    List<Envelope> edList =
        testing.mockedIngestion.waitForItems(
            new Predicate<Envelope>() {
              @Override
              public boolean test(Envelope input) {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `smoke-tests/apps/SamplingOverridesBackCompat/src/main/java/com/microsoft/applicationinsights/smoketestapp/SamplingOverridesBackCompatServlet.java`
#### Snippet
```java
    Connection connection =
        getConnection(
            new Callable<Connection>() {
              @Override
              public Connection call() throws Exception {
```

### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `smoke-tests/apps/CoreAndFilter3xUsingOld3xAgent/src/smokeTest/java/com/microsoft/applicationinsights/smoketest/CoreAndFilter3xUsingOld3xAgentTest.java`
#### Snippet
```java
    List<Envelope> edList =
        testing.mockedIngestion.waitForItems(
            new Predicate<Envelope>() {
              @Override
              public boolean test(Envelope input) {
```

### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/fakeingestion/MockedAppInsightsIngestionServer.java`
#### Snippet
```java
    List<Envelope> items =
        waitForItems(
            new Predicate<Envelope>() {
              @Override
              public boolean test(Envelope input) {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/fakeingestion/MockedAppInsightsIngestionServer.java`
#### Snippet
```java
        .addShutdownHook(
            new Thread(
                new Runnable() {
                  @Override
                  public void run() {
```

### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/fakeingestion/MockedAppInsightsIngestionServer.java`
#### Snippet
```java
    List<Envelope> items =
        waitForItems(
            new Predicate<Envelope>() {
              @Override
              public boolean test(Envelope input) {
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `startupLogger`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/FirstEntryPoint.java`
#### Snippet
```java
                ConfigurationBuilder.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_FILE_PATH,
                selfDiagnostics.file.path);
        startupLogger = configureLogging(selfDiagnostics, agentPath);

        logStartupFailure(isFriendlyException, message, t);
```

### AssignmentToMethodParameter
Assignment to method parameter `timestamp`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/util/TimestampContract.java`
#### Snippet
```java
        buffer.insert(buffer.length() - 1, "0");
      }
      timestamp = buffer.toString();
    }
    return timestamp;
```

### AssignmentToMethodParameter
Assignment to method parameter `logExporter`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/SecondEntryPoint.java`
#### Snippet
```java
        switch (processorConfig.type) {
          case ATTRIBUTE:
            logExporter = new LogExporterWithAttributeProcessor(processorConfig, logExporter);
            break;
          case LOG:
```

### AssignmentToMethodParameter
Assignment to method parameter `logExporter`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/SecondEntryPoint.java`
#### Snippet
```java
            break;
          case LOG:
            logExporter = new ExporterWithLogProcessor(processorConfig, logExporter);
            break;
          default:
```

### AssignmentToMethodParameter
Assignment to method parameter `spanExporter`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/SecondEntryPoint.java`
#### Snippet
```java
        switch (processorConfig.type) {
          case ATTRIBUTE:
            spanExporter = new SpanExporterWithAttributeProcessor(processorConfig, spanExporter);
            break;
          case SPAN:
```

### AssignmentToMethodParameter
Assignment to method parameter `spanExporter`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/SecondEntryPoint.java`
#### Snippet
```java
            break;
          case SPAN:
            spanExporter = new ExporterWithSpanProcessor(processorConfig, spanExporter);
            break;
          default:
```

### AssignmentToMethodParameter
Assignment to method parameter `spanExporter`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/SecondEntryPoint.java`
#### Snippet
```java
      // this is temporary until semantic attributes stabilize and we make breaking change
      // then can use java.util.functions.Predicate<Attributes>
      spanExporter = new BackCompatHttpUrlProcessor(spanExporter);
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `exception`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/classicsdk/TelemetryUtil.java`
#### Snippet
```java
      int stackSize) {
    if (exception == null) {
      exception = new Exception("");
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `collectionFrequencyInSec`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/perfcounter/PerformanceCounterContainer.java`
#### Snippet
```java
      logger.error(errorMessage);

      collectionFrequencyInSec = MIN_COLLECTION_FREQUENCY_IN_SEC;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `alert`
in `agent/agent-profiler/agent-alerting/src/main/java/com/microsoft/applicationinsights/alerting/analysis/pipelines/AlertPipelines.java`
#### Snippet
```java
      OptionalDouble memory = getAverage(AlertMetricType.MEMORY);
      if (memory.isPresent()) {
        alert = alert.toBuilder().setMemoryUsage(memory.getAsDouble()).build();
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `alert`
in `agent/agent-profiler/agent-alerting/src/main/java/com/microsoft/applicationinsights/alerting/analysis/pipelines/AlertPipelines.java`
#### Snippet
```java
      OptionalDouble cpu = getAverage(AlertMetricType.CPU);
      if (cpu.isPresent()) {
        alert = alert.toBuilder().setCpuMetric(cpu.getAsDouble()).build();
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `classAndMethod`
in `agent/instrumentation/methods/src/main/java/io/opentelemetry/javaagent/instrumentation/methods/ai/MethodInstrumentation.java`
#### Snippet
```java
        @Advice.Local("otelScope") Scope scope) {
      Context parentContext = currentContext();
      classAndMethod = ClassAndMethod.create(declaringClass, methodName);
      if (!MethodSingletons.instrumenter().shouldStart(parentContext, classAndMethod)) {
        return;
```

### AssignmentToMethodParameter
Assignment to method parameter `context`
in `agent/instrumentation/methods/src/main/java/io/opentelemetry/javaagent/instrumentation/methods/ai/MethodInstrumentation.java`
#### Snippet
```java
      }

      context = MethodSingletons.instrumenter().start(parentContext, classAndMethod);
      scope = context.makeCurrent();
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `scope`
in `agent/instrumentation/methods/src/main/java/io/opentelemetry/javaagent/instrumentation/methods/ai/MethodInstrumentation.java`
#### Snippet
```java

      context = MethodSingletons.instrumenter().start(parentContext, classAndMethod);
      scope = context.makeCurrent();
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `returnValue`
in `agent/instrumentation/methods/src/main/java/io/opentelemetry/javaagent/instrumentation/methods/ai/MethodInstrumentation.java`
#### Snippet
```java
      scope.close();

      returnValue =
          AsyncOperationEndSupport.create(
                  MethodSingletons.instrumenter(), Void.class, method.getReturnType())
```

### AssignmentToMethodParameter
Assignment to method parameter `configurations`
in `agent/instrumentation/micrometer-1.0/src/main/java/io/opentelemetry/javaagent/instrumentation/micrometer/ai/ActuatorInstrumentation.java`
#### Snippet
```java
        configs.remove(
            "com.microsoft.azure.spring.autoconfigure.metrics.AzureMonitorMetricsExportAutoConfiguration");
        configurations = configs;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `id`
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/RequestTelemetryInstrumentation.java`
#### Snippet
```java
      Span span = VirtualField.find(RequestTelemetry.class, Span.class).get(requestTelemetry);
      if (span != null) {
        id = span.getSpanContext().getSpanId();
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `requestTelemetryContext`
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/ThreadContextInstrumentation.java`
#### Snippet
```java
        return;
      }
      requestTelemetryContext = new RequestTelemetryContext(0);
      Context context = Java8BytecodeBridge.currentContext();
      Span localRootSpan = LocalRootSpan.fromContextOrNull(context);
```

### AssignmentToMethodParameter
Assignment to method parameter `connectionString`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/classicsdk/BytecodeUtilImpl.java`
#### Snippet
```java
      @Nullable String instrumentationKey) {
    if (connectionString == null && instrumentationKey != null) {
      connectionString = "InstrumentationKey=" + instrumentationKey;
    }
    if (connectionString != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `traceflag`
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/RequestTelemetryContextInstrumentation.java`
#### Snippet
```java
          VirtualField.find(RequestTelemetryContext.class, Span.class).get(requestTelemetryContext);
      if (span != null) {
        traceflag = span.getSpanContext().getTraceFlags().asByte();
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `tracestate`
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/RequestTelemetryContextInstrumentation.java`
#### Snippet
```java
        TraceState traceState = span.getSpanContext().getTraceState();
        if (traceState.isEmpty()) {
          tracestate = null;
        } else {
          TracestateBuilder builder = new TracestateBuilder();
```

### AssignmentToMethodParameter
Assignment to method parameter `tracestate`
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/RequestTelemetryContextInstrumentation.java`
#### Snippet
```java
          TracestateBuilder builder = new TracestateBuilder();
          traceState.forEach(builder);
          tracestate = new Tracestate(builder.toString());
        }
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `properties`
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/BaseTelemetryInstrumentation.java`
#### Snippet
```java
          VirtualField.find(RequestTelemetry.class, Span.class).get((RequestTelemetry) telemetry);
      if (span != null) {
        properties = new SpanAttributeProperties(span);
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `id`
in `agent/instrumentation/applicationinsights-web-2.3/src/main/java/io/opentelemetry/javaagent/instrumentation/applicationinsightsweb/OperationContextInstrumentation.java`
#### Snippet
```java
      Span span = VirtualField.find(OperationContext.class, Span.class).get(operationContext);
      if (span != null) {
        id = span.getSpanContext().getTraceId();
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `itemCount`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/LogDataMapper.java`
#### Snippet
```java
      AbstractTelemetryBuilder telemetryBuilder, LogRecordData log, @Nullable Long itemCount) {
    if (itemCount == null) {
      itemCount = log.getAttributes().get(AiSemanticAttributes.ITEM_COUNT);
    }
    if (itemCount != null && itemCount != 1) {
```

### AssignmentToMethodParameter
Assignment to method parameter `message`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/builders/MessageTelemetryBuilder.java`
#### Snippet
```java
    if (message.trim().isEmpty()) {
      // breeze doesn't accept message that is empty after trimming
      message = "n/a";
    }
    data.setMessage(truncateTelemetry(message, MAX_MESSAGE_LENGTH, "Message.message"));
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/quickpulse/QuickPulseDataCollector.java`
#### Snippet
```java

  private static long startingAtSeconds(String duration, int i, long runningTotalInMinutes) {
    char c1 = duration.charAt(i++);
    char c2 = duration.charAt(i++);
    int seconds = 10 * charToInt(c1) + charToInt(c2);
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/quickpulse/QuickPulseDataCollector.java`
#### Snippet
```java
  private static long startingAtSeconds(String duration, int i, long runningTotalInMinutes) {
    char c1 = duration.charAt(i++);
    char c2 = duration.charAt(i++);
    int seconds = 10 * charToInt(c1) + charToInt(c2);
    return startingAtMicros(duration, i + 1, 60 * runningTotalInMinutes + seconds);
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/quickpulse/QuickPulseDataCollector.java`
#### Snippet
```java

  private static long startingAtHours(String duration, int i, long runningTotalInDays) {
    char c1 = duration.charAt(i++);
    char c2 = duration.charAt(i++);
    int hours = 10 * charToInt(c1) + charToInt(c2);
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/quickpulse/QuickPulseDataCollector.java`
#### Snippet
```java
  private static long startingAtHours(String duration, int i, long runningTotalInDays) {
    char c1 = duration.charAt(i++);
    char c2 = duration.charAt(i++);
    int hours = 10 * charToInt(c1) + charToInt(c2);
    return startingAtMinutes(duration, i + 1, 24 * runningTotalInDays + hours);
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/quickpulse/QuickPulseDataCollector.java`
#### Snippet
```java

  private static long startingAtMinutes(String duration, int i, long runningTotalInHours) {
    char c1 = duration.charAt(i++);
    char c2 = duration.charAt(i++);
    int minutes = 10 * charToInt(c1) + charToInt(c2);
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/quickpulse/QuickPulseDataCollector.java`
#### Snippet
```java
  private static long startingAtMinutes(String duration, int i, long runningTotalInHours) {
    char c1 = duration.charAt(i++);
    char c2 = duration.charAt(i++);
    int minutes = 10 * charToInt(c1) + charToInt(c2);
    // next char must be ':'
```

### AssignmentToMethodParameter
Assignment to method parameter `instrumentationKey`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/configuration/StatsbeatConnectionString.java`
#### Snippet
```java
      }

      instrumentationKey = pair.instrumentationKey;
      ingestionEndpoint = pair.endpoint;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `ingestionEndpoint`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/configuration/StatsbeatConnectionString.java`
#### Snippet
```java

      instrumentationKey = pair.instrumentationKey;
      ingestionEndpoint = pair.endpoint;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `ingestionEndpoint`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/configuration/StatsbeatConnectionString.java`
#### Snippet
```java
    URL endpointUrl;
    if (!ingestionEndpoint.endsWith("/")) {
      ingestionEndpoint += "/";
    }
    try {
```

### AssignmentToMethodParameter
Assignment to method parameter `url`
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/configuration/ConnectionStringBuilder.java`
#### Snippet
```java
  private static URL toUrlOrThrow(String url, String field) {
    if (!url.endsWith("/")) {
      url += "/";
    }
    try {
```

### AssignmentToMethodParameter
Assignment to method parameter `timestamp`
in `classic-sdk/core/src/main/java/com/microsoft/applicationinsights/telemetry/RequestTelemetry.java`
#### Snippet
```java
  public void setTimestamp(Date timestamp) {
    if (timestamp == null) {
      timestamp = new Date();
    }
    super.setTimestamp(timestamp);
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `classic-sdk/core/src/main/java/com/microsoft/applicationinsights/telemetry/ContextTagsMap.java`
#### Snippet
```java
  private static String truncate(String value, int maxLength) {
    if (value != null && value.length() > maxLength) {
      value = value.substring(0, maxLength);
    }
    return value;
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `classic-sdk/core/src/main/java/com/microsoft/applicationinsights/telemetry/ContextTagsMap.java`
#### Snippet
```java
  private static String sanitizeValue(String key, String value) {
    if (value != null) {
      value = value.trim();
    }
    if (tagSizeLimits.containsKey(key)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `classic-sdk/core/src/main/java/com/microsoft/applicationinsights/telemetry/ContextTagsMap.java`
#### Snippet
```java
    }
    if (tagSizeLimits.containsKey(key)) {
      value = truncate(value, tagSizeLimits.get(key));
    }
    return value;
```

### AssignmentToMethodParameter
Assignment to method parameter `message`
in `classic-sdk/core/src/main/java/com/microsoft/applicationinsights/TelemetryClient.java`
#### Snippet
```java

    if (LocalStringsUtils.isNullOrEmpty(message)) {
      message = "";
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `telemetry`
in `classic-sdk/core/src/main/java/com/microsoft/applicationinsights/TelemetryClient.java`
#### Snippet
```java

    if (telemetry == null) {
      telemetry = new RemoteDependencyTelemetry("");
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `classic-sdk/core/src/main/java/com/microsoft/applicationinsights/TelemetryClient.java`
#### Snippet
```java

    if (name == null || name.isEmpty()) {
      name = "";
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `classic-sdk/core/src/main/java/com/microsoft/applicationinsights/TelemetryClient.java`
#### Snippet
```java

    if (name == null) {
      name = "";
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/schemav2/Duration.java`
#### Snippet
```java
    if (value < 0) {
      sb.append('-');
      value = -value;
    }
    if (value < 10) {
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/schemav2/Duration.java`
#### Snippet
```java
    if (value < 0) {
      sb.append('-');
      value = -value;
    }
    if (value < 10) {
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `smoke-tests/framework/src/main/java/com/microsoft/applicationinsights/smoketest/schemav2/Duration.java`
#### Snippet
```java
    if (value < 0) {
      sb.append('-');
      value = -value;
    }
    if (value < 10) {
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/profiler/util/ServiceLoaderUtil.java`
#### Snippet
```java
      return iterator.next();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/init/SecondEntryPoint.java`
#### Snippet
```java
              () -> {
                ConnectionString connectionString = telemetryClient.getConnectionString();
                return connectionString == null ? null : connectionString.getLiveEndpoint();
              },
              telemetryClient::getInstrumentationKey,
```

### ReturnNull
Return of `null`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/classicsdk/RequestTelemetryClassFileTransformer.java`
#### Snippet
```java

    public String getSource() {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/classicsdk/DependencyTelemetryClassFileTransformer.java`
#### Snippet
```java

    public String getTarget() {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/classicsdk/DependencyTelemetryClassFileTransformer.java`
#### Snippet
```java

    public String getId() {
      return null;
    }

```

### ReturnNull
Return of `null`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/classicsdk/DependencyTelemetryClassFileTransformer.java`
#### Snippet
```java

    public String getResultCode() {
      return null;
    }

```

### ReturnNull
Return of `null`
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/classicsdk/ExceptionTelemetryClassFileTransformer.java`
#### Snippet
```java

    public Exception getException() {
      return null;
    }

```

### ReturnNull
Return of `null`
in `agent/instrumentation/azure-functions/src/main/java/io/opentelemetry/javaagent/instrumentation/azurefunctions/InvocationRequestExtractAdapter.java`
#### Snippet
```java
  @Override
  public Iterable<String> keys(RpcTraceContext carrier) {
    return null;
  }

```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `existingAttributes` is redundant
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/processors/AttributeProcessor.java`
#### Snippet
```java

  private static Attributes processDeleteAction(Attributes attributes, ProcessorAction actionObj) {
    Attributes existingAttributes = attributes;

    // Currently we only support String
```

### UnnecessaryLocalVariable
Local variable `existingAttributes` is redundant
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/processors/AttributeProcessor.java`
#### Snippet
```java

  private static Attributes processInsertAction(Attributes attributes, ProcessorAction actionObj) {
    Attributes existingAttributes = attributes;

    // Update from existing attribute
```

### UnnecessaryLocalVariable
Local variable `existingAttributes` is redundant
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/processors/AttributeProcessor.java`
#### Snippet
```java

  private static Attributes processMaskAction(Attributes attributes, ProcessorAction actionObj) {
    Attributes existingAttributes = attributes;

    // Currently we only support String
```

### UnnecessaryLocalVariable
Local variable `existingAttributes` is redundant
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/processors/AttributeProcessor.java`
#### Snippet
```java

  private static Attributes processHashAction(Attributes attributes, ProcessorAction actionObj) {
    Attributes existingAttributes = attributes;

    // Currently we only support String
```

### UnnecessaryLocalVariable
Local variable `existingAttributes` is redundant
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/processors/AttributeProcessor.java`
#### Snippet
```java

  private static Attributes processUpdateAction(Attributes attributes, ProcessorAction actionObj) {
    Attributes existingAttributes = attributes;

    // Currently we only support String
```

### UnnecessaryLocalVariable
Local variable `existingAttributes` is redundant
in `agent/agent-tooling/src/main/java/com/microsoft/applicationinsights/agent/internal/processors/AttributeProcessor.java`
#### Snippet
```java

  private static Attributes processExtractAction(Attributes attributes, ProcessorAction actionObj) {
    Attributes existingAttributes = attributes;

    // Currently we only support String
```

## RuleId[ruleID=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `agent/agent/src/main/java/com/microsoft/applicationinsights/agent/StartupProfiler.java`
#### Snippet
```java
      while (System.currentTimeMillis() - start < MINUTES.toMillis(10)) {
        try {
          Thread.sleep(50);
        } catch (InterruptedException e) {
          System.out.println("Startup profiler interrupted");
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `agent/azure-monitor-exporter/src/main/java/com/azure/monitor/opentelemetry/exporter/implementation/quickpulse/QuickPulseCoordinator.java`
#### Snippet
```java
          sleepInMillis = sendData();
        }
        Thread.sleep(sleepInMillis);
      }
    } catch (InterruptedException e) {
```

## RuleId[ruleID=CopyConstructorMissesField]
### CopyConstructorMissesField
Copy constructor does not copy 4 fields
in `etw/java/src/main/java/com/microsoft/applicationinsights/agent/bootstrap/diagnostics/etw/events/model/IpaEtwEventBase.java`
#### Snippet
```java
  protected IpaEtwEventBase() {}

  protected IpaEtwEventBase(IpaEtwEventBase event) {
    extensionVersion = event.extensionVersion;
    appName = event.appName;
```

## RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `classic-sdk/core/src/main/java/com/microsoft/applicationinsights/telemetry/ContextTagsMap.java`
#### Snippet
```java

  @Override
  public boolean equals(Object o) {
    return tags.equals(o);
  }
```

## RuleId[ruleID=UnstableApiUsage]
### UnstableApiUsage
'repositories(org.gradle.api.Action)' is declared in unstable interface 'org.gradle.api.initialization.resolve.DependencyResolutionManagement' marked with @Incubating
in `settings.gradle.kts`
#### Snippet
```java

dependencyResolutionManagement {
  repositories {
    mavenCentral()
    mavenLocal()
```

