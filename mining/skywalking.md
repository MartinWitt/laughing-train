# skywalking 
 
# Bad smells
I found 1169 bad smells with 187 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 170 | false |
| BoundedWildcard | 140 | false |
| RedundantFieldInitialization | 73 | false |
| AssignmentToMethodParameter | 64 | false |
| ZeroLengthArrayInitialization | 63 | false |
| UtilityClassWithoutPrivateConstructor | 57 | true |
| SizeReplaceableByIsEmpty | 51 | true |
| CodeBlock2Expr | 39 | true |
| UnstableApiUsage | 32 | false |
| OptionalUsedAsFieldOrParameterType | 31 | false |
| DataFlowIssue | 24 | false |
| UnnecessaryFullyQualifiedName | 23 | false |
| Lombok | 21 | false |
| EnumSwitchStatementWhichMissesCases | 20 | false |
| StaticCallOnSubclass | 19 | false |
| DynamicRegexReplaceableByCompiledPattern | 19 | false |
| MissortedModifiers | 16 | false |
| NestedAssignment | 15 | false |
| NonProtectedConstructorInAbstractClass | 15 | true |
| MismatchedCollectionQueryUpdate | 14 | false |
| UnusedAssignment | 12 | false |
| StringConcatenationInsideStringBufferAppend | 12 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 11 | false |
| StringBufferReplaceableByString | 10 | false |
| ConstantValue | 10 | false |
| ReplaceAssignmentWithOperatorAssignment | 9 | false |
| RedundantImplements | 9 | false |
| SimplifyOptionalCallChains | 8 | false |
| AbstractClassNeverImplemented | 7 | false |
| CatchMayIgnoreException | 7 | false |
| UnnecessaryToStringCall | 7 | true |
| RedundantSuppression | 7 | false |
| ReplaceNullCheck | 7 | false |
| UseBulkOperation | 7 | false |
| UnnecessaryModifier | 6 | true |
| TrivialStringConcatenation | 6 | false |
| DefaultAnnotationParam | 6 | false |
| DeprecatedIsStillUsed | 6 | false |
| BusyWait | 6 | false |
| IgnoreResultOfCall | 5 | false |
| UnnecessarySuperQualifier | 5 | false |
| SynchronizeOnThis | 5 | false |
| SimplifyStreamApiCallChains | 5 | false |
| OptionalContainsCollection | 5 | false |
| UnnecessaryReturn | 4 | true |
| EmptyMethod | 4 | false |
| NonSerializableFieldInSerializableClass | 4 | false |
| UnnecessaryLocalVariable | 4 | true |
| ClassNameSameAsAncestorName | 3 | false |
| SlowListContainsAll | 3 | false |
| Java8MapForEach | 3 | false |
| UnnecessarySemicolon | 3 | false |
| Convert2MethodRef | 3 | false |
| SwitchStatementWithConfusingDeclaration | 3 | false |
| Java8MapApi | 3 | false |
| DoubleCheckedLocking | 2 | false |
| AssignmentToStaticFieldFromInstanceMethod | 2 | false |
| RegExpRedundantEscape | 2 | false |
| UnnecessaryQualifierForThis | 2 | false |
| DuplicateBranchesInSwitch | 2 | false |
| InfiniteLoopStatement | 2 | false |
| UseOfPropertiesAsHashtable | 2 | false |
| CallToStringConcatCanBeReplacedByOperator | 2 | false |
| FieldMayBeStatic | 2 | false |
| StringOperationCanBeSimplified | 2 | false |
| AbstractMethodCallInConstructor | 2 | false |
| AssignmentToForLoopParameter | 2 | false |
| InnerClassMayBeStatic | 2 | true |
| SetReplaceableByEnumSet | 2 | false |
| AssignmentToLambdaParameter | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| NullableProblems | 1 | false |
| EqualsBetweenInconvertibleTypes | 1 | false |
| IfStatementMissingBreakInLoop | 1 | false |
| RedundantMethodOverride | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| StringBufferReplaceableByStringBuilder | 1 | false |
| DoubleBraceInitialization | 1 | false |
| CastConflictsWithInstanceof | 1 | false |
| TypeParameterExtendsObject | 1 | false |
| NonExceptionNameEndsWithException | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
| IOResource | 1 | false |
| RedundantCollectionOperation | 1 | false |
| MismatchedJavadocCode | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| SynchronizeOnNonFinalField | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new CompletableFuture\[futures.size()\]'
in `oap-server/server-library/library-elasticsearch-client/src/main/java/org/apache/skywalking/library/elasticsearch/bulk/BulkProcessor.java`
#### Snippet
```java
        final List<CompletableFuture<Void>> futures = doFlush(batch);
        final CompletableFuture<Void> future = CompletableFuture.allOf(
            futures.toArray(new CompletableFuture[futures.size()]));
        future.whenComplete((v, t) -> semaphore.release());
        future.join();
```

## RuleId[id=EnumSwitchStatementWhichMissesCases]
### EnumSwitchStatementWhichMissesCases
`switch (traceState) { case ERROR: query.must(Query.match(SegmentRecord.I...` statement on enum type 'org.apache.skywalking.oap.server.core.query.type.TraceState' misses case 'ALL'
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/query/TraceQueryEsDAO.java`
#### Snippet
```java
            query.must(Query.term(SegmentRecord.TRACE_ID, traceId));
        }
        switch (traceState) {
            case ERROR:
                query.must(Query.match(SegmentRecord.IS_ERROR, BooleanUtils.TRUE));
                break;
            case SUCCESS:
                query.must(Query.match(SegmentRecord.IS_ERROR, BooleanUtils.FALSE));
                break;
        }

        final SearchBuilder search = Search.builder().query(query);
```

### EnumSwitchStatementWhichMissesCases
`switch (clientAction.getAction()) { case Unchanged: newRemoteCli...` statement on enum type 'org.apache.skywalking.oap.server.core.remote.client.RemoteClientManager.Action' misses case 'Close'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/remote/client/RemoteClientManager.java`
#### Snippet
```java
        final List<RemoteClient> newRemoteClients = new LinkedList<>();
        remoteClientCollection.forEach((address, clientAction) -> {
            switch (clientAction.getAction()) {
                case Unchanged:
                    newRemoteClients.add(clientAction.getRemoteClient());
                    break;
                case Create:
                    if (address.isSelf()) {
                        RemoteClient client = new SelfRemoteClient(moduleDefineHolder, address);
                        newRemoteClients.add(client);
                    } else {
                        RemoteClient client;
                        client = new GRPCRemoteClient(moduleDefineHolder, address, 1, 3000, remoteTimeout, sslContext);
                        client.connect();
                        newRemoteClients.add(client);
                    }
                    break;
            }
        });

```

### EnumSwitchStatementWhichMissesCases
`switch (source.getDetectPoint()) { case SERVER: processRelationServerSid...` statement on enum type 'org.apache.skywalking.oap.server.core.source.DetectPoint' misses cases: 'PROXY', and 'UNRECOGNIZED'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/relation/process/ProcessRelationDispatcher.java`
#### Snippet
```java
    @Override
    public void dispatch(ProcessRelation source) {
        switch (source.getDetectPoint()) {
            case SERVER:
                processRelationServerSide(source);
                break;
            case CLIENT:
                processRelationClientSide(source);
                break;
        }
    }

```

### EnumSwitchStatementWhichMissesCases
`switch (source.getDetectPoint()) { case SERVER: serverSide(source); ...` statement on enum type 'org.apache.skywalking.oap.server.core.source.DetectPoint' misses cases: 'PROXY', and 'UNRECOGNIZED'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/relation/service/TCPServiceCallRelationDispatcher.java`
#### Snippet
```java
    @Override
    public void dispatch(TCPServiceRelation source) {
        switch (source.getDetectPoint()) {
            case SERVER:
                serverSide(source);
                break;
            case CLIENT:
                clientSide(source);
                break;
        }
    }

```

### EnumSwitchStatementWhichMissesCases
`switch (source.getDetectPoint()) { case SERVER: serverSide(source); ...` statement on enum type 'org.apache.skywalking.oap.server.core.source.DetectPoint' misses cases: 'PROXY', and 'UNRECOGNIZED'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/relation/service/ServiceCallRelationDispatcher.java`
#### Snippet
```java
    @Override
    public void dispatch(ServiceRelation source) {
        switch (source.getDetectPoint()) {
            case SERVER:
                serverSide(source);
                break;
            case CLIENT:
                clientSide(source);
                break;
        }
    }

```

### EnumSwitchStatementWhichMissesCases
`switch (source.getDetectPoint()) { case SERVER: serverSide(source); ...` statement on enum type 'org.apache.skywalking.oap.server.core.source.DetectPoint' misses cases: 'PROXY', and 'UNRECOGNIZED'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/relation/instance/TCPServiceInstanceCallRelationDispatcher.java`
#### Snippet
```java
    @Override
    public void dispatch(TCPServiceInstanceRelation source) {
        switch (source.getDetectPoint()) {
            case SERVER:
                serverSide(source);
                break;
            case CLIENT:
                clientSide(source);
                break;
        }
    }

```

### EnumSwitchStatementWhichMissesCases
`switch (source.getDetectPoint()) { case SERVER: serverSide(source); ...` statement on enum type 'org.apache.skywalking.oap.server.core.source.DetectPoint' misses cases: 'PROXY', and 'UNRECOGNIZED'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/relation/instance/ServiceInstanceCallRelationDispatcher.java`
#### Snippet
```java
    @Override
    public void dispatch(ServiceInstanceRelation source) {
        switch (source.getDetectPoint()) {
            case SERVER:
                serverSide(source);
                break;
            case CLIENT:
                clientSide(source);
                break;
        }
    }

```

### EnumSwitchStatementWhichMissesCases
`switch (item.getType()) { case PROCESS_CPU: final int cpuPercent...` statement on enum type 'org.apache.skywalking.oap.server.core.profiling.continuous.storage.ContinuousProfilingMonitorType' misses case 'UNKNOWN'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/continuous/ContinuousProfilingMutationService.java`
#### Snippet
```java
        }
        try {
            switch (item.getType()) {
                case PROCESS_CPU:
                    final int cpuPercent = Integer.parseInt(item.getThreshold());
                    if (cpuPercent < 0 || cpuPercent > 100) {
                        return "the process CPU percent should in [0-100]";
                    }
                    break;
                case PROCESS_THREAD_COUNT:
                    final int threadCount = Integer.parseInt(item.getThreshold());
                    if (threadCount < 0) {
                        return "the process thread count must bigger than zero";
                    }
                    break;
                case SYSTEM_LOAD:
                    final int systemLoad = Integer.parseInt(item.getThreshold());
                    if (systemLoad < 0) {
                        return "the system load must bigger than zero";
                    }
                    break;
                case HTTP_ERROR_RATE:
                    final int httpErrorRate = Integer.parseInt(item.getThreshold());
                    if (httpErrorRate < 0 || httpErrorRate > 100) {
                        return "the HTTP error rate should in [0-100]";
                    }
                    break;
                case HTTP_AVG_RESPONSE_TIME:
                    final int httpAvgResponseTime = Integer.parseInt(item.getThreshold());
                    if (httpAvgResponseTime < 0) {
                        return "the HTTP average response time must bigger than zero";
                    }
                    break;
            }
        } catch (NumberFormatException e) {
            return "parsing threshold error";
```

### EnumSwitchStatementWhichMissesCases
`switch (traceState) { case ERROR: sql.append(" and ").append(Seg...` statement on enum type 'org.apache.skywalking.oap.server.core.query.type.TraceState' misses case 'ALL'
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCTraceQueryDAO.java`
#### Snippet
```java
                }
            }
            switch (traceState) {
                case ERROR:
                    sql.append(" and ").append(SegmentRecord.IS_ERROR).append(" = ").append(BooleanUtils.TRUE);
                    break;
                case SUCCESS:
                    sql.append(" and ").append(SegmentRecord.IS_ERROR).append(" = ").append(BooleanUtils.FALSE);
                    break;
            }
            switch (queryOrder) {
                case BY_START_TIME:
```

### EnumSwitchStatementWhichMissesCases
`switch (traceState) { case ERROR: query.and(eq(SegmentRe...` statement on enum type 'org.apache.skywalking.oap.server.core.query.type.TraceState' misses case 'ALL'
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/stream/BanyanDBTraceQueryDAO.java`
#### Snippet
```java
                }

                switch (traceState) {
                    case ERROR:
                        query.and(eq(SegmentRecord.IS_ERROR, BooleanUtils.TRUE));
                        break;
                    case SUCCESS:
                        query.and(eq(SegmentRecord.IS_ERROR, BooleanUtils.FALSE));
                        break;
                }

                switch (queryOrder) {
```

### EnumSwitchStatementWhichMissesCases
`switch (scope) { case Service: metricInfo.getLabels().add(new LabelValue...` statement on enum type 'org.apache.skywalking.oap.server.core.query.enumeration.Scope' misses cases: 'All', 'ServiceRelation', ...
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/handler/PromQLApiHandler.java`
#### Snippet
```java
            metricInfo.getLabels().add(new LabelValuePair(LabelName.RELABELS, ""));
        }
        switch (scope) {
            case Service:
                metricInfo.getLabels().add(new LabelValuePair(LabelName.SCOPE, Scope.Service.name()));
                metricInfo.getLabels().add(new LabelValuePair(LabelName.SERVICE, ""));
                break;
            case ServiceInstance:
                metricInfo.getLabels().add(new LabelValuePair(LabelName.SCOPE, Scope.ServiceInstance.name()));
                metricInfo.getLabels().add(new LabelValuePair(LabelName.SERVICE_INSTANCE, ""));
                metricInfo.getLabels().add(new LabelValuePair(LabelName.PARENT_SERVICE, ""));
                break;
            case Endpoint:
                metricInfo.getLabels().add(new LabelValuePair(LabelName.SCOPE, Scope.Endpoint.name()));
                metricInfo.getLabels().add(new LabelValuePair(LabelName.ENDPOINT, ""));
                metricInfo.getLabels().add(new LabelValuePair(LabelName.PARENT_SERVICE, ""));
                break;
        }
        return metricInfo;
    }
```

### EnumSwitchStatementWhichMissesCases
`switch (parseResult.getResultType()) { case METRICS_RANGE: ...` statement on enum type 'org.apache.skywalking.oap.query.promql.rt.result.ParseResultType' misses case 'MATCH'
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/handler/PromQLApiHandler.java`
#### Snippet
```java
                buildMatrixRsp(parseResult, response);
            } else {
                switch (parseResult.getResultType()) {
                    case METRICS_RANGE:
                        buildVectorRsp(parseResult, response);
                        break;
                    case SCALAR:
                        buildScalarRsp(parseResult, response);
                        break;
                }
            }
        } else {
```

### EnumSwitchStatementWhichMissesCases
`switch (LabelName.labelOf(labelName)) { case NAME: metricsQuery.listMetr...` statement on enum type 'org.apache.skywalking.oap.query.promql.entity.LabelName' misses cases: 'SERVICE', 'SERVICE_INSTANCE', 'ENDPOINT', ...
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/handler/PromQLApiHandler.java`
#### Snippet
```java
        response.setStatus(ResultStatus.SUCCESS);

        switch (LabelName.labelOf(labelName)) {
            case NAME:
                metricsQuery.listMetrics("").forEach(definition -> {
                    response.getData().add(definition.getName());
                });
                break;
            case LAYER:
                for (Layer layer : Layer.values()) {
                    response.getData().add(layer.name());
                }
                break;
            case SCOPE:
                for (Scope scope : Scope.values()) {
                    response.getData().add(scope.name());
                }
                break;
        }

        return jsonResponse(response);
```

### EnumSwitchStatementWhichMissesCases
`switch (parseResult.getResultType()) { case METRICS_RANGE: build...` statement on enum type 'org.apache.skywalking.oap.query.promql.rt.result.ParseResultType' misses case 'MATCH'
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/handler/PromQLApiHandler.java`
#### Snippet
```java
            response.setError("Bad expression, can not parse it.");
        } else if (StringUtil.isBlank(parseResult.getErrorInfo())) {
            switch (parseResult.getResultType()) {
                case METRICS_RANGE:
                    buildMatrixRsp(parseResult, response);
                    break;
                case SCALAR:
                    buildScalarMatrixRsp(duration, parseResult, response);
                    break;
            }
        } else {
            response.setStatus(ResultStatus.ERROR);
```

### EnumSwitchStatementWhichMissesCases
`switch (scope) { case ServiceInstance: labelNames.add(LabelName.SERVICE_...` statement on enum type 'org.apache.skywalking.oap.server.core.query.enumeration.Scope' misses cases: 'All', 'Service', 'ServiceRelation', ...
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/handler/PromQLApiHandler.java`
#### Snippet
```java
            labelNames.add(LabelName.RELABELS);
        }
        switch (scope) {
            case ServiceInstance:
                labelNames.add(LabelName.SERVICE_INSTANCE);
                labelNames.add(LabelName.PARENT_SERVICE);
                break;
            case Endpoint:
                labelNames.add(LabelName.ENDPOINT);
                labelNames.add(LabelName.PARENT_SERVICE);
                break;
        }
        return labelNames;
    }
```

### EnumSwitchStatementWhichMissesCases
`switch (role) { case PROXY: return analyzeProxy(entry); case...` statement on enum type 'org.apache.skywalking.oap.server.receiver.envoy.als.Role' misses case 'NONE'
in `oap-server/server-receiver-plugin/envoy-metrics-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/envoy/als/k8s/K8sALSServiceMeshHTTPAnalysis.java`
#### Snippet
```java
            return result;
        }
        switch (role) {
            case PROXY:
                return analyzeProxy(entry);
            case SIDECAR:
                return analyzeSideCar(entry);
        }

        return Result.builder().build();
```

### EnumSwitchStatementWhichMissesCases
`switch (scope) { case Service: metricInfo.getLabels().add(new LabelValue...` statement on enum type 'org.apache.skywalking.oap.server.core.query.enumeration.Scope' misses cases: 'All', 'ServiceRelation', ...
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/rt/PromQLExprQueryVisitor.java`
#### Snippet
```java
switch (scope) {
            case Service:
                metricInfo.getLabels().add(new LabelValuePair(LabelName.SCOPE, Scope.Service.name()));
                if (topNEntityName.isPresent()) {
                    metricInfo.getLabels().add(new LabelValuePair(LabelName.SERVICE, topNEntityName.get()));
                } else if (recordName.isPresent()) {
                    metricInfo.getLabels().add(new LabelValuePair(LabelName.RECORD, recordName.get()));
                } else {
                    checkLabels(labelMap, LabelName.SERVICE);
                    metricInfo.getLabels()
                              .add(new LabelValuePair(LabelName.SERVICE, labelMap.get(LabelName.SERVICE)));
                }
                break;
            case ServiceInstance:
                metricInfo.getLabels().add(new LabelValuePair(LabelName.SCOPE, Scope.ServiceInstance.name()));
                if (topNEntityName.isPresent()) {
                    metricInfo.getLabels().add(new LabelValuePair(LabelName.SERVICE_INSTANCE, topNEntityName.get()));
                } else if (recordName.isPresent()) {
                    metricInfo.getLabels().add(new LabelValuePair(LabelName.RECORD, recordName.get()));
                } else {
                    checkLabels(labelMap, LabelName.SERVICE, LabelName.SERVICE_INSTANCE);
                    metricInfo.getLabels()
                              .add(new LabelValuePair(LabelName.SERVICE, labelMap.get(LabelName.SERVICE)));
                    metricInfo.getLabels()
                              .add(new LabelValuePair(
                                  LabelName.SERVICE_INSTANCE,
                                  labelMap.get(LabelName.SERVICE_INSTANCE)
                              ));
                }
                break;
            case Endpoint:
                metricInfo.getLabels().add(new LabelValuePair(LabelName.SCOPE, Scope.Endpoint.name()));
                if (topNEntityName.isPresent()) {
                    metricInfo.getLabels().add(new LabelValuePair(LabelName.ENDPOINT, topNEntityName.get()));
                } else if (recordName.isPresent()) {
                    metricInfo.getLabels().add(new LabelValuePair(LabelName.RECORD, recordName.get()));
                } else {
                    checkLabels(labelMap, LabelName.SERVICE, LabelName.ENDPOINT);
                    metricInfo.getLabels()
                              .add(new LabelValuePair(LabelName.SERVICE, labelMap.get(LabelName.SERVICE)));
                    metricInfo.getLabels()
                              .add(new LabelValuePair(LabelName.ENDPOINT, labelMap.get(LabelName.ENDPOINT)));
                }
                break;
        }
```

### EnumSwitchStatementWhichMissesCases
`switch (scope) { case ServiceInstance: checkLabels(labelMap, LabelName.S...` statement on enum type 'org.apache.skywalking.oap.server.core.query.enumeration.Scope' misses cases: 'All', 'Service', 'ServiceRelation', ...
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/rt/PromQLExprQueryVisitor.java`
#### Snippet
```java
        entity.setNormal(layer.isNormal());
        entity.setServiceName(serviceName);
        switch (scope) {
            case ServiceInstance:
                checkLabels(labelMap, LabelName.SERVICE_INSTANCE);
                entity.setServiceInstanceName(labelMap.get(LabelName.SERVICE_INSTANCE));
                break;
            case Endpoint:
                checkLabels(labelMap, LabelName.ENDPOINT);
                entity.setEndpointName(labelMap.get(LabelName.ENDPOINT));
                break;
        }
        return entity;
    }
```

### EnumSwitchStatementWhichMissesCases
`switch (role) { case PROXY: return analyzeProxy(previousResult, entry); ...` statement on enum type 'org.apache.skywalking.oap.server.receiver.envoy.als.Role' misses case 'NONE'
in `oap-server/server-receiver-plugin/envoy-metrics-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/envoy/als/tcp/k8s/K8sALSServiceMeshTCPAnalysis.java`
#### Snippet
```java
            return previousResult;
        }
        switch (role) {
            case PROXY:
                return analyzeProxy(previousResult, entry);
            case SIDECAR:
                return analyzeSideCar(previousResult, entry);
        }

        return previousResult;
```

### EnumSwitchStatementWhichMissesCases
`switch (type) { case INT: intThreshold = Integer.parseInt(thresh...` statement on enum type 'org.apache.skywalking.oap.server.core.alarm.provider.MetricsValueType' misses case 'LABELED_LONG'
in `oap-server/server-alarm-plugin/src/main/java/org/apache/skywalking/oap/server/core/alarm/provider/Threshold.java`
#### Snippet
```java
    public void setType(MetricsValueType type) {
        try {
            switch (type) {
                case INT:
                    intThreshold = Integer.parseInt(threshold);
                    break;
                case LONG:
                    longThreshold = Long.parseLong(threshold);
                    break;
                case DOUBLE:
                    doubleThreshold = Double.parseDouble(threshold);
                    break;
                case MULTI_INTS:
                    String[] strings = threshold.split(",");
                    intValuesThreshold = new Integer[strings.length];
                    for (int i = 0; i < strings.length; i++) {
                        String thresholdItem = strings[i].trim();
                        if (NONE_THRESHOLD.equals(thresholdItem)) {
                            intValuesThreshold[i] = null;
                        } else {
                            intValuesThreshold[i] = Integer.parseInt(thresholdItem);
                        }
                    }
            }
        } catch (NumberFormatException e) {
            LOGGER.warn("Alarm rule {} threshold doesn't match the metrics type, expected type: {}", alarmRuleName, type);
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `oap-server/server-tools/data-generator/src/main/java/org/apache/skywalking/generator/Generator.java`
#### Snippet
```java
})
public interface Generator<T> {
    public T next();

    default public void reset() {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `oap-server/server-tools/data-generator/src/main/java/org/apache/skywalking/generator/Generator.java`
#### Snippet
```java
    public T next();

    default public void reset() {
    }
}
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `oap-server/server-library/library-kubernetes-support/src/main/java/org/apache/skywalking/library/kubernetes/KubernetesEndpoints.java`
#### Snippet
```java

    @SneakyThrows
    private KubernetesEndpoints() {
        KubernetesClient.setDefault();

```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `oap-server/server-library/library-kubernetes-support/src/main/java/org/apache/skywalking/library/kubernetes/KubernetesPods.java`
#### Snippet
```java

    @SneakyThrows
    private KubernetesPods() {
        KubernetesClient.setDefault();

```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `oap-server/server-library/library-kubernetes-support/src/main/java/org/apache/skywalking/library/kubernetes/KubernetesServices.java`
#### Snippet
```java

    @SneakyThrows
    private KubernetesServices() {
        KubernetesClient.setDefault();

```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `oap-server/server-receiver-plugin/envoy-metrics-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/envoy/als/AccessLogAnalyzer.java`
#### Snippet
```java
    @Data
    @Builder
    static class Result {
        /**
         * The service representing the Envoy node.
```

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `longFieldValue()` declared in class 'org.apache.skywalking.banyandb.v1.client.Value' but referenced via subclass 'org.apache.skywalking.banyandb.v1.client.TagAndValue'
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/BanyanDBConverter.java`
#### Snippet
```java
    private static Serializable<BanyandbModel.FieldValue> buildField(Object value, final Class<?> clazz) {
        if (Integer.class.equals(clazz) || int.class.equals(clazz)) {
            return TagAndValue.longFieldValue(((Number) value).longValue());
        } else if (Long.class.equals(clazz) || long.class.equals(clazz)) {
            return TagAndValue.longFieldValue((Long) value);
```

### StaticCallOnSubclass
Static method `longFieldValue()` declared in class 'org.apache.skywalking.banyandb.v1.client.Value' but referenced via subclass 'org.apache.skywalking.banyandb.v1.client.TagAndValue'
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/BanyanDBConverter.java`
#### Snippet
```java
            return TagAndValue.longFieldValue(((Number) value).longValue());
        } else if (Long.class.equals(clazz) || long.class.equals(clazz)) {
            return TagAndValue.longFieldValue((Long) value);
        } else if (String.class.equals(clazz)) {
            return TagAndValue.stringFieldValue((String) value);
```

### StaticCallOnSubclass
Static method `stringFieldValue()` declared in class 'org.apache.skywalking.banyandb.v1.client.Value' but referenced via subclass 'org.apache.skywalking.banyandb.v1.client.TagAndValue'
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/BanyanDBConverter.java`
#### Snippet
```java
            return TagAndValue.longFieldValue((Long) value);
        } else if (String.class.equals(clazz)) {
            return TagAndValue.stringFieldValue((String) value);
        } else if (Double.class.equals(clazz) || double.class.equals(clazz)) {
            return TagAndValue.binaryFieldValue(ByteUtil.double2Bytes((double) value));
```

### StaticCallOnSubclass
Static method `binaryFieldValue()` declared in class 'org.apache.skywalking.banyandb.v1.client.Value' but referenced via subclass 'org.apache.skywalking.banyandb.v1.client.TagAndValue'
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/BanyanDBConverter.java`
#### Snippet
```java
            return TagAndValue.stringFieldValue((String) value);
        } else if (Double.class.equals(clazz) || double.class.equals(clazz)) {
            return TagAndValue.binaryFieldValue(ByteUtil.double2Bytes((double) value));
        } else if (StorageDataComplexObject.class.isAssignableFrom(clazz)) {
            return TagAndValue.stringFieldValue(((StorageDataComplexObject<?>) value).toStorageData());
```

### StaticCallOnSubclass
Static method `stringFieldValue()` declared in class 'org.apache.skywalking.banyandb.v1.client.Value' but referenced via subclass 'org.apache.skywalking.banyandb.v1.client.TagAndValue'
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/BanyanDBConverter.java`
#### Snippet
```java
            return TagAndValue.binaryFieldValue(ByteUtil.double2Bytes((double) value));
        } else if (StorageDataComplexObject.class.isAssignableFrom(clazz)) {
            return TagAndValue.stringFieldValue(((StorageDataComplexObject<?>) value).toStorageData());
        }
        throw new IllegalStateException(clazz.getSimpleName() + " is not supported");
```

### StaticCallOnSubclass
Static method `longTagValue()` declared in class 'org.apache.skywalking.banyandb.v1.client.Value' but referenced via subclass 'org.apache.skywalking.banyandb.v1.client.TagAndValue'
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/BanyanDBConverter.java`
#### Snippet
```java
    private static Serializable<BanyandbModel.TagValue> buildTag(Object value, final Class<?> clazz) {
        if (int.class.equals(clazz) || Integer.class.equals(clazz)) {
            return TagAndValue.longTagValue(((Number) value).longValue());
        } else if (Long.class.equals(clazz) || long.class.equals(clazz)) {
            return TagAndValue.longTagValue((Long) value);
```

### StaticCallOnSubclass
Static method `longTagValue()` declared in class 'org.apache.skywalking.banyandb.v1.client.Value' but referenced via subclass 'org.apache.skywalking.banyandb.v1.client.TagAndValue'
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/BanyanDBConverter.java`
#### Snippet
```java
            return TagAndValue.longTagValue(((Number) value).longValue());
        } else if (Long.class.equals(clazz) || long.class.equals(clazz)) {
            return TagAndValue.longTagValue((Long) value);
        } else if (String.class.equals(clazz)) {
            return TagAndValue.stringTagValue((String) value);
```

### StaticCallOnSubclass
Static method `stringTagValue()` declared in class 'org.apache.skywalking.banyandb.v1.client.Value' but referenced via subclass 'org.apache.skywalking.banyandb.v1.client.TagAndValue'
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/BanyanDBConverter.java`
#### Snippet
```java
            return TagAndValue.longTagValue((Long) value);
        } else if (String.class.equals(clazz)) {
            return TagAndValue.stringTagValue((String) value);
        } else if (Double.class.equals(clazz) || double.class.equals(clazz)) {
            return TagAndValue.binaryTagValue(ByteUtil.double2Bytes((double) value));
```

### StaticCallOnSubclass
Static method `binaryTagValue()` declared in class 'org.apache.skywalking.banyandb.v1.client.Value' but referenced via subclass 'org.apache.skywalking.banyandb.v1.client.TagAndValue'
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/BanyanDBConverter.java`
#### Snippet
```java
            return TagAndValue.stringTagValue((String) value);
        } else if (Double.class.equals(clazz) || double.class.equals(clazz)) {
            return TagAndValue.binaryTagValue(ByteUtil.double2Bytes((double) value));
        } else if (StorageDataComplexObject.class.isAssignableFrom(clazz)) {
            return TagAndValue.stringTagValue(((StorageDataComplexObject<?>) value).toStorageData());
```

### StaticCallOnSubclass
Static method `stringTagValue()` declared in class 'org.apache.skywalking.banyandb.v1.client.Value' but referenced via subclass 'org.apache.skywalking.banyandb.v1.client.TagAndValue'
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/BanyanDBConverter.java`
#### Snippet
```java
            return TagAndValue.binaryTagValue(ByteUtil.double2Bytes((double) value));
        } else if (StorageDataComplexObject.class.isAssignableFrom(clazz)) {
            return TagAndValue.stringTagValue(((StorageDataComplexObject<?>) value).toStorageData());
        } else if (clazz.isEnum()) {
            return TagAndValue.longTagValue((int) value);
```

### StaticCallOnSubclass
Static method `longTagValue()` declared in class 'org.apache.skywalking.banyandb.v1.client.Value' but referenced via subclass 'org.apache.skywalking.banyandb.v1.client.TagAndValue'
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/BanyanDBConverter.java`
#### Snippet
```java
            return TagAndValue.stringTagValue(((StorageDataComplexObject<?>) value).toStorageData());
        } else if (clazz.isEnum()) {
            return TagAndValue.longTagValue((int) value);
        } else if (JsonObject.class.equals(clazz)) {
            return TagAndValue.stringTagValue((String) value);
```

### StaticCallOnSubclass
Static method `stringTagValue()` declared in class 'org.apache.skywalking.banyandb.v1.client.Value' but referenced via subclass 'org.apache.skywalking.banyandb.v1.client.TagAndValue'
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/BanyanDBConverter.java`
#### Snippet
```java
            return TagAndValue.longTagValue((int) value);
        } else if (JsonObject.class.equals(clazz)) {
            return TagAndValue.stringTagValue((String) value);
        } else if (byte[].class.equals(clazz)) {
            return TagAndValue.stringTagValue((String) value);
```

### StaticCallOnSubclass
Static method `stringTagValue()` declared in class 'org.apache.skywalking.banyandb.v1.client.Value' but referenced via subclass 'org.apache.skywalking.banyandb.v1.client.TagAndValue'
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/BanyanDBConverter.java`
#### Snippet
```java
            return TagAndValue.stringTagValue((String) value);
        } else if (byte[].class.equals(clazz)) {
            return TagAndValue.stringTagValue((String) value);
        }
        throw new IllegalStateException(clazz.getSimpleName() + " is not supported");
```

### StaticCallOnSubclass
Static method `binaryTagValue()` declared in class 'org.apache.skywalking.banyandb.v1.client.Value' but referenced via subclass 'org.apache.skywalking.banyandb.v1.client.TagAndValue'
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/BanyanDBConverter.java`
#### Snippet
```java
        public void accept(String fieldName, byte[] fieldValue) {
            try {
                this.streamWrite.tag(fieldName, TagAndValue.binaryTagValue(fieldValue));
            } catch (BanyanDBException ex) {
                log.error("fail to add tag", ex);
```

### StaticCallOnSubclass
Static method `stringArrayTagValue()` declared in class 'org.apache.skywalking.banyandb.v1.client.Value' but referenced via subclass 'org.apache.skywalking.banyandb.v1.client.TagAndValue'
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/BanyanDBConverter.java`
#### Snippet
```java
        public void accept(String fieldName, List<String> fieldValue) {
            try {
                this.measureWrite.tag(fieldName, TagAndValue.stringArrayTagValue(fieldValue));
            } catch (BanyanDBException ex) {
                log.error("fail to accept string array tag", ex);
```

### StaticCallOnSubclass
Static method `binaryTagValue()` declared in class 'org.apache.skywalking.banyandb.v1.client.Value' but referenced via subclass 'org.apache.skywalking.banyandb.v1.client.TagAndValue'
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/BanyanDBConverter.java`
#### Snippet
```java
            try {
                if (columnSpec.getColumnType() == MetadataRegistry.ColumnType.TAG) {
                    this.measureWrite.tag(fieldName, TagAndValue.binaryTagValue(fieldValue));
                } else {
                    this.measureWrite.field(fieldName, TagAndValue.binaryFieldValue(fieldValue));
```

### StaticCallOnSubclass
Static method `binaryFieldValue()` declared in class 'org.apache.skywalking.banyandb.v1.client.Value' but referenced via subclass 'org.apache.skywalking.banyandb.v1.client.TagAndValue'
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/BanyanDBConverter.java`
#### Snippet
```java
                    this.measureWrite.tag(fieldName, TagAndValue.binaryTagValue(fieldValue));
                } else {
                    this.measureWrite.field(fieldName, TagAndValue.binaryFieldValue(fieldValue));
                }
            } catch (BanyanDBException ex) {
```

### StaticCallOnSubclass
Static method `stringTagValue()` declared in class 'org.apache.skywalking.banyandb.v1.client.Value' but referenced via subclass 'org.apache.skywalking.banyandb.v1.client.TagAndValue'
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/BanyanDBConverter.java`
#### Snippet
```java
        public void acceptID(String id) {
            try {
                this.measureWrite.tag(ID, TagAndValue.stringTagValue(id));
            } catch (BanyanDBException ex) {
                log.error("fail to add ID tag", ex);
```

### StaticCallOnSubclass
Static method `stringArrayTagValue()` declared in class 'org.apache.skywalking.banyandb.v1.client.Value' but referenced via subclass 'org.apache.skywalking.banyandb.v1.client.TagAndValue'
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/BanyanDBConverter.java`
#### Snippet
```java
        public void accept(String fieldName, List<String> fieldValue) {
            try {
                this.streamWrite.tag(fieldName, TagAndValue.stringArrayTagValue(fieldValue));
            } catch (BanyanDBException ex) {
                log.error("fail to accept string array tag", ex);
```

## RuleId[id=DoubleCheckedLocking]
### DoubleCheckedLocking
Double-checked locking
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/BanyanDBBatchDAO.java`
#### Snippet
```java

    private StreamBulkWriteProcessor getStreamBulkWriteProcessor() {
        if (streamBulkWriteProcessor == null) {
            synchronized (STREAM_SYNCHRONIZER) {
                if (streamBulkWriteProcessor == null) {
```

### DoubleCheckedLocking
Double-checked locking
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/BanyanDBBatchDAO.java`
#### Snippet
```java

    private MeasureBulkWriteProcessor getMeasureBulkWriteProcessor() {
        if (measureBulkWriteProcessor == null) {
            synchronized (MEASURE_SYNCHRONIZER) {
                if (measureBulkWriteProcessor == null) {
```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `FILE_MONITOR_TASK_SCHEDULER` from instance context
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/MultipleFilesChangeMonitor.java`
#### Snippet
```java
        try {
            if (FILE_MONITOR_TASK_SCHEDULER == null) {
                FILE_MONITOR_TASK_SCHEDULER = Executors.newSingleThreadScheduledExecutor()
                                                       .scheduleAtFixedRate(
                                                           MultipleFilesChangeMonitor::scanChanges, 1, 200,
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `IS_RT_TEMP_FOLDER_INIT_COMPLETED` from instance context
in `oap-server/oal-rt/src/main/java/org/apache/skywalking/oal/rt/OALRuntime.java`
#### Snippet
```java
        if (!IS_RT_TEMP_FOLDER_INIT_COMPLETED) {
            prepareRTTempFolder();
            IS_RT_TEMP_FOLDER_INIT_COMPLETED = true;
        }

```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/config/group/openapi/EndpointGroupingRule4Openapi.java`
#### Snippet
```java

    static class EndpointGroupingRulesComparator implements Comparator<StringFormatGroup.PatternRule> {
        private static final String VAR_PATTERN = "\\(\\[\\^\\/\\]\\+\\)";

        @Override
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/config/group/openapi/EndpointGroupingRule4Openapi.java`
#### Snippet
```java

    static class EndpointGroupingRulesComparator implements Comparator<StringFormatGroup.PatternRule> {
        private static final String VAR_PATTERN = "\\(\\[\\^\\/\\]\\+\\)";

        @Override
```

## RuleId[id=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `SchemaMetadata` on 'this' is unnecessary in this context
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/MetadataRegistry.java`
#### Snippet
```java

        private List<TagFamilySpec> extractTagFamilySpec(List<TagMetadata> tagMetadataList, boolean shouldAddID) {
            final String indexFamily = SchemaMetadata.this.indexFamily();
            final String nonIndexFamily = SchemaMetadata.this.nonIndexFamily();
            Map<String, List<TagMetadata>> tagMetadataMap = tagMetadataList.stream()
```

### UnnecessaryQualifierForThis
Qualifier `SchemaMetadata` on 'this' is unnecessary in this context
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/MetadataRegistry.java`
#### Snippet
```java
        private List<TagFamilySpec> extractTagFamilySpec(List<TagMetadata> tagMetadataList, boolean shouldAddID) {
            final String indexFamily = SchemaMetadata.this.indexFamily();
            final String nonIndexFamily = SchemaMetadata.this.nonIndexFamily();
            Map<String, List<TagMetadata>> tagMetadataMap = tagMetadataList.stream()
                    .collect(Collectors.groupingBy(tagMetadata -> tagMetadata.isIndex() ? indexFamily : nonIndexFamily));
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/query/MetricsQueryEsDAO.java`
#### Snippet
```java
        switch (function) {
            case Avg:
                parentAggBuilder.subAggregation(Aggregation.avg(valueCName).field(valueCName));
                break;
            case Sum:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `oap-server/analyzer/agent-analyzer/src/main/java/org/apache/skywalking/oap/server/analyzer/provider/trace/parser/listener/RPCAnalysisListener.java`
#### Snippet
```java
                return Layer.VIRTUAL_CACHE;
            case UNRECOGNIZED:
                return Layer.UNDEFINED;
            case FAAS:
                return Layer.FAAS;
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`response.getHits().getHits().size() > 0` can be replaced with '!response.getHits().getHits().isEmpty()'
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/query/UITemplateManagementEsDAO.java`
#### Snippet
```java
        final SearchResponse response = getClient().search(index, search.build());

        if (response.getHits().getHits().size() > 0) {
            UITemplate.Builder builder = new UITemplate.Builder();
            SearchHit data = response.getHits().getHits().get(0);
```

### SizeReplaceableByIsEmpty
`response.getHits().getHits().size() > 0` can be replaced with '!response.getHits().getHits().isEmpty()'
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/query/ProfileTaskQueryEsDAO.java`
#### Snippet
```java
        final SearchResponse response = getClient().search(index, search.build());

        if (response.getHits().getHits().size() > 0) {
            return parseTask(response.getHits().getHits().iterator().next());
        }
```

### SizeReplaceableByIsEmpty
`instances.size() > 0` can be replaced with '!instances.isEmpty()'
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/query/MetadataQueryEsDAO.java`
#### Snippet
```java
        final SearchResponse response = getClient().search(index, search.build());
        final List<ServiceInstance> instances = buildInstances(response);
        return instances.size() > 0 ? instances.get(0) : null;
    }

```

### SizeReplaceableByIsEmpty
`response.getHits().getHits().size() != 0` can be replaced with '!response.getHits().getHits().isEmpty()'
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/query/zipkin/ZipkinQueryEsDAO.java`
#### Snippet
```java
        Map<String, List<Span>> groupedByTraceId = new LinkedHashMap<String, List<Span>>();
        try {
            while (response.getHits().getHits().size() != 0) {
                String scrollId = response.getScrollId();
                scrollIds.add(scrollId);
```

### SizeReplaceableByIsEmpty
`response.getHits().getHits().size() != 0` can be replaced with '!response.getHits().getHits().isEmpty()'
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/query/zipkin/ZipkinQueryEsDAO.java`
#### Snippet
```java
        final Set<String> scrollIds = new HashSet<>();
        try {
            while (response.getHits().getHits().size() != 0) {
                String scrollId = response.getScrollId();
                scrollIds.add(scrollId);
```

### SizeReplaceableByIsEmpty
`response.getHits().getHits().size() != 0` can be replaced with '!response.getHits().getHits().isEmpty()'
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/query/zipkin/ZipkinQueryEsDAO.java`
#### Snippet
```java
        List<Span> trace = new ArrayList<>();
        try {
            while (response.getHits().getHits().size() != 0) {
                String scrollId = response.getScrollId();
                scrollIds.add(scrollId);
```

### SizeReplaceableByIsEmpty
`moduleSet.size() > 0` can be replaced with '!moduleSet.isEmpty()'
in `oap-server/server-library/library-module/src/main/java/org/apache/skywalking/oap/server/library/module/ModuleManager.java`
#### Snippet
```java
        isInPrepareStage = false;

        if (moduleSet.size() > 0) {
            throw new ModuleNotFoundException(moduleSet.toString() + " missing.");
        }
```

### SizeReplaceableByIsEmpty
`subscriptionList.size() == 0` can be replaced with 'subscriptionList.isEmpty()'
in `oap-server/exporter/src/main/java/org/apache/skywalking/oap/server/exporter/provider/grpc/GRPCMetricsExporter.java`
#### Snippet
```java
        if (metrics instanceof WithMetadata) {
            MetricsMetaInfo meta = ((WithMetadata) metrics).getMeta();
            if (subscriptionList.size() == 0 && ExportEvent.EventType.INCREMENT.equals(event.getType())) {
                exportBuffer.produce(new ExportData(meta, metrics, event.getType()));
            } else {
```

### SizeReplaceableByIsEmpty
`allProviders.size() != 0` can be replaced with '!allProviders.isEmpty()'
in `oap-server/server-library/library-module/src/main/java/org/apache/skywalking/oap/server/library/module/BootstrapFlow.java`
#### Snippet
```java
            }
        }
        while (allProviders.size() != 0);
    }
}
```

### SizeReplaceableByIsEmpty
`list.size() == 0` can be replaced with 'list.isEmpty()'
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/CollectionUtils.java`
#### Snippet
```java

    public static boolean isEmpty(List list) {
        return list == null || list.size() == 0;
    }

```

### SizeReplaceableByIsEmpty
`set.size() == 0` can be replaced with 'set.isEmpty()'
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/CollectionUtils.java`
#### Snippet
```java

    public static boolean isEmpty(Set set) {
        return set == null || set.size() == 0;
    }

```

### SizeReplaceableByIsEmpty
`map.size() == 0` can be replaced with 'map.isEmpty()'
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/CollectionUtils.java`
#### Snippet
```java

    public static boolean isEmpty(Map map) {
        return map == null || map.size() == 0;
    }

```

### SizeReplaceableByIsEmpty
`str.length() == 0` can be replaced with 'str.isEmpty()'
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/StringUtil.java`
#### Snippet
```java
public final class StringUtil {
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

```

### SizeReplaceableByIsEmpty
`services.size() > 0` can be replaced with '!services.isEmpty()'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/query/MetadataQueryService.java`
#### Snippet
```java
    public Service getService(final String serviceId) throws IOException {
        final List<Service> services = this.combineServices(getMetadataQueryDAO().getServices(serviceId));
        return services.size() > 0 ? services.get(0) : null;
    }

```

### SizeReplaceableByIsEmpty
`clientList.size() == 0` can be replaced with 'clientList.isEmpty()'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/remote/RemoteSenderService.java`
#### Snippet
```java

        List<RemoteClient> clientList = clientManager.getRemoteClient();
        if (clientList.size() == 0) {
            LOGGER.warn(
                "There is no available remote server for now, ignore the streaming data until the cluster metadata initialized.");
```

### SizeReplaceableByIsEmpty
`lastCollection.size() == 0` can be replaced with 'lastCollection.isEmpty()'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/worker/MetricsPersistentWorker.java`
#### Snippet
```java

        long start = System.currentTimeMillis();
        if (lastCollection.size() == 0) {
            return Collections.emptyList();
        }
```

### SizeReplaceableByIsEmpty
`metricsList.size() > 0` can be replaced with '!metricsList.isEmpty()'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/worker/MetricsPersistentWorker.java`
#### Snippet
```java
        }

        if (metricsList.size() > 0) {
            prepareFlushDataToStorage(metricsList, prepareRequests);
        }
```

### SizeReplaceableByIsEmpty
`prepareRequests.size() > 0` can be replaced with '!prepareRequests.isEmpty()'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/worker/MetricsPersistentWorker.java`
#### Snippet
```java
        }

        if (prepareRequests.size() > 0) {
            log.debug(
                "prepare batch requests for model {}, took time: {}, size: {}", model.getName(),
```

### SizeReplaceableByIsEmpty
`notExistLabels.size() > 0` can be replaced with '!notExistLabels.isEmpty()'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/EBPFProfilingMutationService.java`
#### Snippet
```java
                }
            }
            if (notExistLabels.size() > 0) {
                err = String.format("The service doesn't have processes with label(s) %s.", Joiner.on(", ").join(notExistLabels));
            } else {
```

### SizeReplaceableByIsEmpty
`jsonNode.size() == 0` can be replaced with 'jsonNode.isEmpty()'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/management/ui/template/UITemplateInitializer.java`
#### Snippet
```java
    public void initTemplate(File template) throws IOException {
        JsonNode jsonNode = mapper.readTree(template);
        if (jsonNode == null || jsonNode.size() == 0) {
            return;
        }
```

### SizeReplaceableByIsEmpty
`m.size() > 0` can be replaced with '!m.isEmpty()'
in `oap-server/server-library/library-elasticsearch-client/src/main/java/org/apache/skywalking/library/elasticsearch/requests/factory/v7plus/codec/V7MappingsDeserializer.java`
#### Snippet
```java
            });

        if (m.size() > 0) {
            Map<String, Object> properties = (Map<String, Object>) m.get("properties");
            Map<String, Object> source = (Map<String, Object>) m.get("_source");
```

### SizeReplaceableByIsEmpty
`prepareRequests.size() == 0` can be replaced with 'prepareRequests.isEmpty()'
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/BatchSQLExecutor.java`
#### Snippet
```java
            log.debug("execute sql batch. sql by key size: {}", prepareRequests.size());
        }
        if (prepareRequests.size() == 0) {
            return;
        }
```

### SizeReplaceableByIsEmpty
`results.size() == 0` can be replaced with 'results.isEmpty()'
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCMetricsQueryDAO.java`
#### Snippet
```java
        }

        if (results.size() == 0) {
            return new NullableValue(defaultValue, true);
        }
```

### SizeReplaceableByIsEmpty
`serviceIds.size() > 0` can be replaced with '!serviceIds.isEmpty()'
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCTopologyQueryDAO.java`
#### Snippet
```java
            conditions[2] = duration.getEndTimeBucket();
            StringBuilder serviceIdMatchSql = new StringBuilder();
            if (serviceIds.size() > 0) {
                serviceIdMatchSql.append("and (");
                for (int i = 0; i < serviceIds.size(); i++) {
```

### SizeReplaceableByIsEmpty
`processes.size() > 0` can be replaced with '!processes.isEmpty()'
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCMetadataQueryDAO.java`
#### Snippet
```java
                resultSet -> {
                    final List<Process> processes = buildProcesses(resultSet);
                    return processes.size() > 0 ? processes.get(0) : null;
                },
                condition.toArray(new Object[0]));
```

### SizeReplaceableByIsEmpty
`instances.size() > 0` can be replaced with '!instances.isEmpty()'
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCMetadataQueryDAO.java`
#### Snippet
```java
            final var result = jdbcClient.executeQuery(sql.toString(), resultSet -> {
                final List<ServiceInstance> instances = buildInstances(resultSet);
                return instances.size() > 0 ? instances.get(0) : null;
            }, condition.toArray(new Object[0]));
            if (result != null) {
```

### SizeReplaceableByIsEmpty
`metrics.getIds().size() == 0` can be replaced with 'metrics.getIds().isEmpty()'
in `oap-server/server-query-plugin/query-graphql-plugin/src/main/java/org/apache/skywalking/oap/query/graphql/resolver/MetricQuery.java`
#### Snippet
```java
    public IntValues getValues(final BatchMetricConditions metrics, final Duration duration) throws IOException {
        IntValues values = new IntValues();
        if (metrics.getIds().size() == 0) {
            KVInt kv = new KVInt();

```

### SizeReplaceableByIsEmpty
`podLister.list().size() != 0` can be replaced with '!podLister.list().isEmpty()'
in `oap-server/server-cluster-plugin/cluster-kubernetes-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/kubernetes/NamespacedPodListInformer.java`
#### Snippet
```java
            return Optional.empty();
        }
        return Optional.ofNullable(podLister.list().size() != 0
                                       ? podLister.list()
                                                  .stream()
```

### SizeReplaceableByIsEmpty
`expressions.size() > 0` can be replaced with '!expressions.isEmpty()'
in `oap-server/oal-rt/src/main/java/org/apache/skywalking/oal/rt/parser/DeepAnalysis.java`
#### Snippet
```java
        // Optional for filter
        List<ConditionExpression> expressions = result.getFilters().getFilterExpressionsParserResult();
        if (expressions != null && expressions.size() > 0) {
            for (ConditionExpression expression : expressions) {
                final FilterMatchers.MatcherInfo matcherInfo = FilterMatchers.INSTANCE.find(
```

### SizeReplaceableByIsEmpty
`values.size() > 0` can be replaced with '!values.isEmpty()'
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/handler/PromQLApiHandler.java`
#### Snippet
```java
        matrixResult.getMetricDataList().forEach(rangData -> {
            List<TimeValuePair> values = rangData.getValues();
            if (values.size() > 0) {
                MetricInstantData instantData = new MetricInstantData();
                instantData.setValue(values.get(values.size() - 1));
```

### SizeReplaceableByIsEmpty
`changedGroupItems.size() > 0` can be replaced with '!changedGroupItems.isEmpty()'
in `oap-server/server-configuration/configuration-api/src/main/java/org/apache/skywalking/oap/server/configuration/api/ConfigWatcherRegister.java`
#### Snippet
```java
                });

                if (changedGroupItems.size() > 0) {
                    watcher.notifyGroup(changedGroupItems);
                }
```

### SizeReplaceableByIsEmpty
`serverPort.trim().length() == 0` can be replaced with 'serverPort.trim().isEmpty()'
in `apm-webapp/src/main/java/org/apache/skywalking/oap/server/webapp/Configuration.java`
#### Snippet
```java

  public int port() {
    return serverPort == null || serverPort.trim().length() == 0
      ? 80
      : Integer.parseInt(serverPort);
```

### SizeReplaceableByIsEmpty
`zipkinServices.trim().length() == 0` can be replaced with 'zipkinServices.trim().isEmpty()'
in `apm-webapp/src/main/java/org/apache/skywalking/oap/server/webapp/Configuration.java`
#### Snippet
```java

  public String[] zipkinServices() {
    if (zipkinServices == null || zipkinServices.trim().length() == 0) {
      throw new IllegalArgumentException("zipkinServices cannot be null or empty");
    }
```

### SizeReplaceableByIsEmpty
`oapServices.trim().length() == 0` can be replaced with 'oapServices.trim().isEmpty()'
in `apm-webapp/src/main/java/org/apache/skywalking/oap/server/webapp/Configuration.java`
#### Snippet
```java

  public String[] oapServices() {
    if (oapServices == null || oapServices.trim().length() == 0) {
      throw new IllegalArgumentException("oapServices cannot be null or empty");
    }
```

### SizeReplaceableByIsEmpty
`providerConfig.size() > 0` can be replaced with '!providerConfig.isEmpty()'
in `oap-server/server-starter/src/main/java/org/apache/skywalking/oap/server/starter/config/ApplicationConfigLoader.java`
#### Snippet
```java
                selectConfig(moduleConfig);
                moduleConfig.forEach((moduleName, providerConfig) -> {
                    if (providerConfig.size() > 0) {
                        log.info("Get a module define from application.yml, module name: {}", moduleName);
                        ApplicationConfiguration.ModuleConfiguration moduleConfiguration = configuration.addModule(
```

### SizeReplaceableByIsEmpty
`valueString.trim().length() == 0` can be replaced with 'valueString.trim().isEmpty()'
in `oap-server/server-starter/src/main/java/org/apache/skywalking/oap/server/starter/config/ApplicationConfigLoader.java`
#### Snippet
```java
            .replacePlaceholders(propertyValue + "", target);
        if (valueString != null) {
            if (valueString.trim().length() == 0) {
                target.replace(propertyName, valueString);
                log.info("Provider={} config={} has been set as an empty string", providerName, propertyName);
```

### SizeReplaceableByIsEmpty
`newValues.size() > 0` can be replaced with '!newValues.isEmpty()'
in `oap-server/server-cluster-plugin/cluster-consul-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/consul/ConsulCoordinator.java`
#### Snippet
```java
        public void notify(final Map<ServiceHealthKey, ServiceHealth> newValues) {
            try {
                if (newValues.size() > 0) {
                    List<RemoteInstance> remoteInstances = new ArrayList<>(newValues.size());
                    newValues.values().forEach(serviceHealth -> {
```

### SizeReplaceableByIsEmpty
`serviceKeys.size() > 0` can be replaced with '!serviceKeys.isEmpty()'
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/SampleFamily.java`
#### Snippet
```java
                                 List<String> instanceKeys, String instanceDelimiter,
                                 Layer layer, Closure<Map<String, String>> propertiesExtractor) {
        Preconditions.checkArgument(serviceKeys.size() > 0);
        Preconditions.checkArgument(instanceKeys.size() > 0);
        ExpressionParsingContext.get().ifPresent(ctx -> {
```

### SizeReplaceableByIsEmpty
`instanceKeys.size() > 0` can be replaced with '!instanceKeys.isEmpty()'
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/SampleFamily.java`
#### Snippet
```java
                                 Layer layer, Closure<Map<String, String>> propertiesExtractor) {
        Preconditions.checkArgument(serviceKeys.size() > 0);
        Preconditions.checkArgument(instanceKeys.size() > 0);
        ExpressionParsingContext.get().ifPresent(ctx -> {
            ctx.scopeType = ScopeType.SERVICE_INSTANCE;
```

### SizeReplaceableByIsEmpty
`serviceKeys.size() > 0` can be replaced with '!serviceKeys.isEmpty()'
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/SampleFamily.java`
#### Snippet
```java

    public SampleFamily processRelation(String detectPointKey, List<String> serviceKeys, List<String> instanceKeys, String sourceProcessIdKey, String destProcessIdKey, String componentKey) {
        Preconditions.checkArgument(serviceKeys.size() > 0);
        Preconditions.checkArgument(instanceKeys.size() > 0);
        Preconditions.checkArgument(StringUtil.isNotEmpty(sourceProcessIdKey));
```

### SizeReplaceableByIsEmpty
`instanceKeys.size() > 0` can be replaced with '!instanceKeys.isEmpty()'
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/SampleFamily.java`
#### Snippet
```java
    public SampleFamily processRelation(String detectPointKey, List<String> serviceKeys, List<String> instanceKeys, String sourceProcessIdKey, String destProcessIdKey, String componentKey) {
        Preconditions.checkArgument(serviceKeys.size() > 0);
        Preconditions.checkArgument(instanceKeys.size() > 0);
        Preconditions.checkArgument(StringUtil.isNotEmpty(sourceProcessIdKey));
        Preconditions.checkArgument(StringUtil.isNotEmpty(destProcessIdKey));
```

### SizeReplaceableByIsEmpty
`labelKeys.size() > 0` can be replaced with '!labelKeys.isEmpty()'
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/SampleFamily.java`
#### Snippet
```java

    public SampleFamily service(List<String> labelKeys, String delimiter, Layer layer) {
        Preconditions.checkArgument(labelKeys.size() > 0);
        ExpressionParsingContext.get().ifPresent(ctx -> {
            ctx.scopeType = ScopeType.SERVICE;
```

### SizeReplaceableByIsEmpty
`labelKeys.size() > 0` can be replaced with '!labelKeys.isEmpty()'
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/SampleFamily.java`
#### Snippet
```java

    public SampleFamily service(List<String> labelKeys, Layer layer) {
        Preconditions.checkArgument(labelKeys.size() > 0);
        ExpressionParsingContext.get().ifPresent(ctx -> {
            ctx.scopeType = ScopeType.SERVICE;
```

### SizeReplaceableByIsEmpty
`percentiles.size() > 0` can be replaced with '!percentiles.isEmpty()'
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/SampleFamily.java`
#### Snippet
```java

    public SampleFamily histogram_percentile(List<Integer> percentiles) {
        Preconditions.checkArgument(percentiles.size() > 0);
        int[] p = percentiles.stream().mapToInt(i -> i).toArray();
        ExpressionParsingContext.get().ifPresent(ctx -> {
```

### SizeReplaceableByIsEmpty
`sourceServiceKeys.size() > 0` can be replaced with '!sourceServiceKeys.isEmpty()'
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/SampleFamily.java`
#### Snippet
```java

    public SampleFamily serviceRelation(DetectPoint detectPoint, List<String> sourceServiceKeys, List<String> destServiceKeys, Layer layer) {
        Preconditions.checkArgument(sourceServiceKeys.size() > 0);
        Preconditions.checkArgument(destServiceKeys.size() > 0);
        ExpressionParsingContext.get().ifPresent(ctx -> {
```

### SizeReplaceableByIsEmpty
`destServiceKeys.size() > 0` can be replaced with '!destServiceKeys.isEmpty()'
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/SampleFamily.java`
#### Snippet
```java
    public SampleFamily serviceRelation(DetectPoint detectPoint, List<String> sourceServiceKeys, List<String> destServiceKeys, Layer layer) {
        Preconditions.checkArgument(sourceServiceKeys.size() > 0);
        Preconditions.checkArgument(destServiceKeys.size() > 0);
        ExpressionParsingContext.get().ifPresent(ctx -> {
            ctx.scopeType = ScopeType.SERVICE_RELATION;
```

### SizeReplaceableByIsEmpty
`serviceKeys.size() > 0` can be replaced with '!serviceKeys.isEmpty()'
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/SampleFamily.java`
#### Snippet
```java

    public SampleFamily endpoint(List<String> serviceKeys, List<String> endpointKeys, String delimiter, Layer layer) {
        Preconditions.checkArgument(serviceKeys.size() > 0);
        Preconditions.checkArgument(endpointKeys.size() > 0);
        ExpressionParsingContext.get().ifPresent(ctx -> {
```

### SizeReplaceableByIsEmpty
`endpointKeys.size() > 0` can be replaced with '!endpointKeys.isEmpty()'
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/SampleFamily.java`
#### Snippet
```java
    public SampleFamily endpoint(List<String> serviceKeys, List<String> endpointKeys, String delimiter, Layer layer) {
        Preconditions.checkArgument(serviceKeys.size() > 0);
        Preconditions.checkArgument(endpointKeys.size() > 0);
        ExpressionParsingContext.get().ifPresent(ctx -> {
            ctx.scopeType = ScopeType.ENDPOINT;
```

### SizeReplaceableByIsEmpty
`serviceKeys.size() > 0` can be replaced with '!serviceKeys.isEmpty()'
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/SampleFamily.java`
#### Snippet
```java

    public SampleFamily process(List<String> serviceKeys, List<String> serviceInstanceKeys, List<String> processKeys, String layerKey) {
        Preconditions.checkArgument(serviceKeys.size() > 0);
        Preconditions.checkArgument(serviceInstanceKeys.size() > 0);
        Preconditions.checkArgument(processKeys.size() > 0);
```

### SizeReplaceableByIsEmpty
`serviceInstanceKeys.size() > 0` can be replaced with '!serviceInstanceKeys.isEmpty()'
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/SampleFamily.java`
#### Snippet
```java
    public SampleFamily process(List<String> serviceKeys, List<String> serviceInstanceKeys, List<String> processKeys, String layerKey) {
        Preconditions.checkArgument(serviceKeys.size() > 0);
        Preconditions.checkArgument(serviceInstanceKeys.size() > 0);
        Preconditions.checkArgument(processKeys.size() > 0);
        ExpressionParsingContext.get().ifPresent(ctx -> {
```

### SizeReplaceableByIsEmpty
`processKeys.size() > 0` can be replaced with '!processKeys.isEmpty()'
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/SampleFamily.java`
#### Snippet
```java
        Preconditions.checkArgument(serviceKeys.size() > 0);
        Preconditions.checkArgument(serviceInstanceKeys.size() > 0);
        Preconditions.checkArgument(processKeys.size() > 0);
        ExpressionParsingContext.get().ifPresent(ctx -> {
            ctx.scopeType = ScopeType.PROCESS;
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `oap-server/server-cluster-plugin/cluster-etcd-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/etcd/EtcdCoordinator.java`
#### Snippet
```java

    private static ByteSequence buildKey(String serviceName, Address address, RemoteInstance instance) {
        String key = new StringBuilder(serviceName).append(address.getHost())
                                                   .append("_")
                                                   .append(instance.hashCode())
```

### StringBufferReplaceableByString
`StringBuilder sql` can be replaced with 'String'
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCNetworkAddressAliasDAO.java`
#### Snippet
```java

        for (final var table : tables) {
            final var sql = new StringBuilder()
                .append("select * from ").append(table)
                .append(" where ")
```

### StringBufferReplaceableByString
`StringBuilder sql` can be replaced with 'String'
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCProfileTaskQueryDAO.java`
#### Snippet
```java
        final var tables = tableHelper.getTablesWithinTTL(ProfileTaskRecord.INDEX_NAME);
        for (String table : tables) {
            final StringBuilder sql = new StringBuilder();
            final ArrayList<Object> condition = new ArrayList<>(1);
            sql.append("select * from ").append(table)
```

### StringBufferReplaceableByString
`StringBuilder sql` can be replaced with 'String'
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCProfileThreadSnapshotQueryDAO.java`
#### Snippet
```java

        for (String table : tables) {
            StringBuilder sql = new StringBuilder();
            sql.append("select * from ").append(table).append(" where ");
            sql.append(JDBCTableInstaller.TABLE_COLUMN).append(" = ? ");
```

### StringBufferReplaceableByString
`StringBuilder sql` can be replaced with 'String'
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCProfileThreadSnapshotQueryDAO.java`
#### Snippet
```java

    protected ArrayList<String> querySegments(String taskId, String table) throws SQLException {
        StringBuilder sql = new StringBuilder();
        sql.append("select ")
           .append(ProfileThreadSnapshotRecord.SEGMENT_ID)
```

### StringBufferReplaceableByString
`StringBuilder sql` can be replaced with 'String'
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCProfileThreadSnapshotQueryDAO.java`
#### Snippet
```java

        for (String table : tables) {
            StringBuilder sql = new StringBuilder();
            sql.append("select ")
               .append(aggType)
```

### StringBufferReplaceableByString
`StringBuilder sql` can be replaced with 'String'
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCUITemplateManagementDAO.java`
#### Snippet
```java

        for (String table : tables) {
            final StringBuilder sql = new StringBuilder();
            final ArrayList<Object> condition = new ArrayList<>(1);
            sql.append("select * from ").append(table).append(" where ")
```

### StringBufferReplaceableByString
`StringBuilder serviceIdMatchSql` can be replaced with 'String'
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCTopologyQueryDAO.java`
#### Snippet
```java
                sourceServiceId
            };
            StringBuilder serviceIdMatchSql = new StringBuilder("and ((").append(sourceCName)
                                                                         .append("=? and ")
                                                                         .append(descCName)
```

### StringBufferReplaceableByString
`StringBuilder sql` can be replaced with 'String'
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCServiceLabelQueryDAO.java`
#### Snippet
```java

        for (String table : tables) {
            final StringBuilder sql = new StringBuilder();
            List<Object> condition = new ArrayList<>(1);
            sql.append("select " + ServiceLabelRecord.LABEL + " from ")
```

### StringBufferReplaceableByString
`StringBuilder sql` can be replaced with 'String'
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCZipkinQueryDAO.java`
#### Snippet
```java

        for (String table : tables) {
            StringBuilder sql = new StringBuilder();
            sql.append("select ").append(ZipkinServiceTraffic.SERVICE_NAME).append(" from ").append(table)
                .append(" where ")
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/logging/LoggingConfigWatcher.java`
#### Snippet
```java
        try {
            if (!reconfigure(newValue)) {
                return;
            }
        } catch (Throwable t) {
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/logging/LoggingConfigWatcher.java`
#### Snippet
```java
        } catch (Throwable t) {
            log.error("failed to apply configuration to log4j", t);
            return;
        }
    }
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `oap-server/oal-rt/src/main/java/org/apache/skywalking/oal/rt/OALRuntime.java`
#### Snippet
```java
            } catch (IOException e) {
                log.warn("Can't create " + className + ".txt, ignore.", e);
                return;
            } catch (CannotCompileException e) {
                log.warn("Can't compile " + className + ".class(should not happen), ignore.", e);
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `oap-server/oal-rt/src/main/java/org/apache/skywalking/oal/rt/OALRuntime.java`
#### Snippet
```java
            } catch (CannotCompileException e) {
                log.warn("Can't compile " + className + ".class(should not happen), ignore.", e);
                return;
            } finally {
                if (printWriter != null) {
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/base/TimeSeriesUtils.java`
#### Snippet
```java
    static long compressTimeBucket(long timeBucket, int dayStep) {
        if (dayStep > 1) {
            DateTime time = TIME_BUCKET_FORMATTER.parseDateTime("" + timeBucket);
            int days = Days.daysBetween(DAY_ONE, time).getDays();
            int groupBucketOffset = days % dayStep;
```

### TrivialStringConcatenation
Empty string used in concatenation
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/base/TimeSeriesUtils.java`
#### Snippet
```java
            return new String[] {indexName};
        }
        DateTime startDateTime = TIME_BUCKET_FORMATTER.parseDateTime(startSecondTB / 1000000 + "");
        DateTime endDateTime = TIME_BUCKET_FORMATTER.parseDateTime(endSecondTB / 1000000 + "");
        List<DateTime> timeRanges = new ArrayList<>(16);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/base/TimeSeriesUtils.java`
#### Snippet
```java
        }
        DateTime startDateTime = TIME_BUCKET_FORMATTER.parseDateTime(startSecondTB / 1000000 + "");
        DateTime endDateTime = TIME_BUCKET_FORMATTER.parseDateTime(endSecondTB / 1000000 + "");
        List<DateTime> timeRanges = new ArrayList<>(16);
        for (int i = 0; i <= Days.daysBetween(startDateTime, endDateTime).getDays(); i++) {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/meter/MeterSystem.java`
#### Snippet
```java
        try {
            metricsClass.addMethod(CtNewMethod.make(
                ""
                    + "public org.apache.skywalking.oap.server.core.analysis.meter.function.AcceptableValue createNew() {"
                    + "    org.apache.skywalking.oap.server.core.analysis.meter.function.AcceptableValue meterVar = new " + METER_CLASS_PACKAGE + className + "();"
```

### TrivialStringConcatenation
Empty string used in concatenation
in `oap-server/server-starter/src/main/java/org/apache/skywalking/oap/server/starter/config/ApplicationConfigLoader.java`
#### Snippet
```java
                                       final Object providerName) {
        final String valueString = PropertyPlaceholderHelper.INSTANCE
            .replacePlaceholders(propertyValue + "", target);
        if (valueString != null) {
            if (valueString.trim().length() == 0) {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `oap-server/server-alarm-plugin/src/main/java/org/apache/skywalking/oap/server/core/alarm/provider/RunningRule.java`
#### Snippet
```java
            long bucket = metrics.getTimeBucket();

            LocalDateTime timeBucket = TIME_BUCKET_FORMATTER.parseLocalDateTime(bucket + "");

            this.lock.lock();
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `MinDoubleMetrics` has no concrete subclass
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/metrics/MinDoubleMetrics.java`
#### Snippet
```java

@MetricsFunction(functionName = "minDouble")
public abstract class MinDoubleMetrics extends Metrics implements DoubleValueHolder {

    protected static final String VALUE = "value";
```

### AbstractClassNeverImplemented
Abstract class `DoubleAvgMetrics` has no concrete subclass
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/metrics/DoubleAvgMetrics.java`
#### Snippet
```java

@MetricsFunction(functionName = "doubleAvg")
public abstract class DoubleAvgMetrics extends Metrics implements DoubleValueHolder {

    protected static final String SUMMATION = "double_summation";
```

### AbstractClassNeverImplemented
Abstract class `MaxDoubleMetrics` has no concrete subclass
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/metrics/MaxDoubleMetrics.java`
#### Snippet
```java

@MetricsFunction(functionName = "maxDouble")
public abstract class MaxDoubleMetrics extends Metrics implements DoubleValueHolder {

    protected static final String VALUE = "value";
```

### AbstractClassNeverImplemented
Abstract class `CPMMetrics` has no concrete subclass
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/metrics/CPMMetrics.java`
#### Snippet
```java

@MetricsFunction(functionName = "cpm")
public abstract class CPMMetrics extends Metrics implements LongValueHolder {

    protected static final String VALUE = "value";
```

### AbstractClassNeverImplemented
Abstract class `RateMetrics` has no concrete subclass
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/metrics/RateMetrics.java`
#### Snippet
```java

@MetricsFunction(functionName = "rate")
public abstract class RateMetrics extends Metrics implements IntValueHolder {
    protected static final String DENOMINATOR = "denominator";
    protected static final String NUMERATOR = "numerator";
```

### AbstractClassNeverImplemented
Abstract class `SumMetrics` has no concrete subclass
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/metrics/SumMetrics.java`
#### Snippet
```java

@MetricsFunction(functionName = "sum")
public abstract class SumMetrics extends Metrics implements LongValueHolder {

    protected static final String VALUE = "value";
```

### AbstractClassNeverImplemented
Abstract class `GRPCClientConfig` has no concrete subclass
in `oap-server/server-library/library-client/src/main/java/org/apache/skywalking/oap/server/library/client/grpc/GRPCClientConfig.java`
#### Snippet
```java
package org.apache.skywalking.oap.server.library.client.grpc;

public abstract class GRPCClientConfig {

    private String host;
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super NoneStream`
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/base/NoneStreamEsDAO.java`
#### Snippet
```java

    public NoneStreamEsDAO(ElasticSearchClient client,
                           StorageBuilder<NoneStream> storageBuilder) {
        super(client);
        this.storageBuilder = storageBuilder;
```

### BoundedWildcard
Can generalize to `? super ManagementData`
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/base/ManagementEsDAO.java`
#### Snippet
```java

    public ManagementEsDAO(ElasticSearchClient client,
                           StorageBuilder<ManagementData> storageBuilder) {
        super(client);
        this.storageBuilder = storageBuilder;
```

### BoundedWildcard
Can generalize to `? super Record`
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/base/RecordEsDAO.java`
#### Snippet
```java

    public RecordEsDAO(ElasticSearchClient client,
                       StorageBuilder<Record> storageBuilder) {
        super(client);
        this.storageBuilder = storageBuilder;
```

### BoundedWildcard
Can generalize to `? extends Metrics`
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/base/MetricsEsDAO.java`
#### Snippet
```java

    @Override
    public List<Metrics> multiGet(Model model, List<Metrics> metrics) {
        Map<String, List<Metrics>> groupIndices = new HashMap<>();
        List<Metrics> result = new ArrayList<>(metrics.size());
```

### BoundedWildcard
Can generalize to `? extends KeyValue`
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/query/AggregationQueryEsDAO.java`
#### Snippet
```java
                                            final String valueColumnName,
                                            final Duration duration,
                                            final List<KeyValue> additionalConditions) {
        final String realValueColumn = IndexController.LogicIndicesRegister.getPhysicalColumnName(condition.getName(), valueColumnName);
        final RangeQueryBuilder basicQuery = Query.range(Metrics.TIME_BUCKET)
```

### BoundedWildcard
Can generalize to `? extends EventQueryCondition`
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/query/ESEventQueryDAO.java`
#### Snippet
```java
    }

    protected SearchBuilder buildQuery(final List<EventQueryCondition> conditionList) {
        final BoolQueryBuilder query = Query.bool();

```

### BoundedWildcard
Can generalize to `? super String`
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/query/zipkin/ZipkinQueryEsDAO.java`
#### Snippet
```java
    }

    private void buildTraces(SearchResponse response, Map<String, List<Span>> groupedByTraceId) {
        for (SearchHit searchHit : response.getHits()) {
            Map<String, Object> sourceAsMap = searchHit.getSource();
```

### BoundedWildcard
Can generalize to `? extends ModuleProvider`
in `oap-server/server-library/library-module/src/main/java/org/apache/skywalking/oap/server/library/module/ModuleDefine.java`
#### Snippet
```java
     */
    void prepare(ModuleManager moduleManager, ApplicationConfiguration.ModuleConfiguration configuration,
                 ServiceLoader<ModuleProvider> moduleProviderLoader) throws ProviderNotFoundException, ServiceNotProvidedException, ModuleConfigException, ModuleStartException {
        for (ModuleProvider provider : moduleProviderLoader) {
            if (!configuration.has(provider.name())) {
```

### BoundedWildcard
Can generalize to `? extends ModuleDefine`
in `oap-server/server-library/library-module/src/main/java/org/apache/skywalking/oap/server/library/module/BootstrapFlow.java`
#### Snippet
```java
    private List<ModuleProvider> startupSequence;

    BootstrapFlow(Map<String, ModuleDefine> loadedModules) throws CycleDependencyException, ModuleNotFoundException {
        this.loadedModules = loadedModules;
        startupSequence = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? super String`
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/PropertyPlaceholderHelper.java`
#### Snippet
```java

    protected String parseStringValue(String value, PlaceholderResolver placeholderResolver,
                                      Set<String> visitedPlaceholders) {

        StringBuilder result = new StringBuilder(value);
```

### BoundedWildcard
Can generalize to `? extends List`
in `oap-server/server-query-plugin/zipkin-query-plugin/src/main/java/org/apache/skywalking/oap/query/zipkin/handler/ZipkinQueryHandler.java`
#### Snippet
```java
    }

    private byte[] encodeTraces(List<List<Span>> traces) {
        if (CollectionUtils.isEmpty(traces)) {
            return new byte[] {
```

### BoundedWildcard
Can generalize to `? extends List`
in `oap-server/server-query-plugin/zipkin-query-plugin/src/main/java/org/apache/skywalking/oap/query/zipkin/handler/ZipkinQueryHandler.java`
#### Snippet
```java
    }

    private void appendEventsToTraces(List<List<Span>> traces) throws IOException {
        final Map<String, List<Span>> traceIdWithSpans = traces.stream().filter(CollectionUtils::isNotEmpty)
            .collect(Collectors.toMap(s -> s.get(0).traceId(), Function.identity(), (s1, s2) -> s1));
```

### BoundedWildcard
Can generalize to `? super Class`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/CoreModule.java`
#### Snippet
```java
    }

    private void addProfileService(List<Class> classes) {
        classes.add(ProfileTaskMutationService.class);
        classes.add(ProfileTaskQueryService.class);
```

### BoundedWildcard
Can generalize to `? super Class`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/CoreModule.java`
#### Snippet
```java
    }

    private void addInsideService(List<Class> classes) {
        classes.add(ModelCreator.class);
        classes.add(IModelManager.class);
```

### BoundedWildcard
Can generalize to `? super Class`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/CoreModule.java`
#### Snippet
```java
    }

    private void addReceiverInterface(List<Class> classes) {
        classes.add(SourceReceiver.class);
    }
```

### BoundedWildcard
Can generalize to `? super Class`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/CoreModule.java`
#### Snippet
```java
    }

    private void addOALService(List<Class> classes) {
        classes.add(OALEngineLoaderService.class);
    }
```

### BoundedWildcard
Can generalize to `? super Class`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/CoreModule.java`
#### Snippet
```java
    }

    private void addCacheService(List<Class> classes) {
        classes.add(NetworkAddressAliasCache.class);
    }
```

### BoundedWildcard
Can generalize to `? super Class`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/CoreModule.java`
#### Snippet
```java
    }

    private void addManagementService(List<Class> classes) {
        classes.add(UITemplateManagementService.class);
    }
```

### BoundedWildcard
Can generalize to `? super Class`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/CoreModule.java`
#### Snippet
```java
    }

    private void addServerInterface(List<Class> classes) {
        classes.add(GRPCHandlerRegister.class);
        classes.add(HTTPHandlerRegister.class);
```

### BoundedWildcard
Can generalize to `? super Class`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/CoreModule.java`
#### Snippet
```java
    }

    private void addEBPFProfilingService(List<Class> classes) {
        classes.add(EBPFProfilingMutationService.class);
        classes.add(EBPFProfilingQueryService.class);
```

### BoundedWildcard
Can generalize to `? super Class`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/CoreModule.java`
#### Snippet
```java
    }

    private void addQueryService(List<Class> classes) {
        classes.add(TopologyQueryService.class);
        classes.add(MetricsMetadataQueryService.class);
```

### BoundedWildcard
Can generalize to `? extends NetworkAddressAlias`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/cache/NetworkAddressAliasCache.java`
#### Snippet
```java
    }

    void load(List<NetworkAddressAlias> networkAddressAliasList) {
        networkAddressAliasList.forEach(networkAddressAlias -> {
            networkAddressAliasCache.put(networkAddressAlias.getAddress(), networkAddressAlias);
```

### BoundedWildcard
Can generalize to `? extends Tag`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/alarm/AlarmStandardPersistence.java`
#### Snippet
```java
    }

    private Collection<Tag> appendSearchableTags(List<Tag> tags) {
        final ConfigService configService = manager.find(CoreModule.NAME)
                .provider()
```

### BoundedWildcard
Can generalize to `? extends AlarmMessage`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/alarm/AlarmStandardPersistence.java`
#### Snippet
```java

    @Override
    public void doAlarm(List<AlarmMessage> alarmMessage) {
        alarmMessage.forEach(message -> {
            if (LOGGER.isDebugEnabled()) {
```

### BoundedWildcard
Can generalize to `? extends Call.CallDetail`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/query/ServiceTopologyBuilder.java`
#### Snippet
```java
    }

    Topology build(List<Call.CallDetail> serviceRelationClientCalls, List<Call.CallDetail> serviceRelationServerCalls) {

        Map<String, Node> nodes = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? extends Call.CallDetail`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/query/ServiceTopologyBuilder.java`
#### Snippet
```java
    }

    Topology build(List<Call.CallDetail> serviceRelationClientCalls, List<Call.CallDetail> serviceRelationServerCalls) {

        Map<String, Node> nodes = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? extends Call.CallDetail`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/query/ServiceInstanceTopologyBuilder.java`
#### Snippet
```java
    }

    ServiceInstanceTopology build(List<Call.CallDetail> serviceInstanceRelationClientCalls,
                                  List<Call.CallDetail> serviceInstanceRelationServerCalls) {

```

### BoundedWildcard
Can generalize to `? extends Call.CallDetail`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/query/ServiceInstanceTopologyBuilder.java`
#### Snippet
```java

    ServiceInstanceTopology build(List<Call.CallDetail> serviceInstanceRelationClientCalls,
                                  List<Call.CallDetail> serviceInstanceRelationServerCalls) {

        Map<String, ServiceInstanceNode> nodes = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? extends Span`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/query/TraceQueryService.java`
#### Snippet
```java
    }

    private List<Span> findRoot(List<Span> spans) {
        List<Span> rootSpans = new ArrayList<>();
        spans.forEach(span -> {
```

### BoundedWildcard
Can generalize to `? extends Span`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/query/TraceQueryService.java`
#### Snippet
```java
    }

    private void findChildren(List<Span> spans, Span parentSpan, List<Span> childrenSpan) {
        spans.forEach(span -> {
            if (span.getSegmentParentSpanId().equals(parentSpan.getSegmentSpanId())) {
```

### BoundedWildcard
Can generalize to `? super Span`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/query/TraceQueryService.java`
#### Snippet
```java
    }

    private void findChildren(List<Span> spans, Span parentSpan, List<Span> childrenSpan) {
        spans.forEach(span -> {
            if (span.getSegmentParentSpanId().equals(parentSpan.getSegmentSpanId())) {
```

### BoundedWildcard
Can generalize to `? extends Service`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/query/MetadataQueryService.java`
#### Snippet
```java
    }

    private List<Service> combineServices(List<Service> services) {
        return new ArrayList<>(services.stream()
                                       .peek(service -> {
```

### BoundedWildcard
Can generalize to `? extends Call.CallDetail`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/query/ProcessTopologyBuilder.java`
#### Snippet
```java
    }

    ProcessTopology build(List<Call.CallDetail> clientCalls,
                          List<Call.CallDetail> serverCalls) throws Exception {
        List<Call> calls = new LinkedList<>();
```

### BoundedWildcard
Can generalize to `? extends Call.CallDetail`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/query/ProcessTopologyBuilder.java`
#### Snippet
```java

    ProcessTopology build(List<Call.CallDetail> clientCalls,
                          List<Call.CallDetail> serverCalls) throws Exception {
        List<Call> calls = new LinkedList<>();
        HashMap<String, Call> callMap = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? extends ConfigChangeEvent`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/config/group/openapi/EndpointNameGroupingRule4OpenapiWatcher.java`
#### Snippet
```java

    @Override
    public void notifyGroup(final Map<String, ConfigChangeEvent> groupItems) {
        groupItems.forEach((groupItemName, event) -> {
            if (EventType.DELETE.equals(event.getEventType())) {
```

### BoundedWildcard
Can generalize to `? extends RemoteClient`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/remote/selector/RollingSelector.java`
#### Snippet
```java

    @Override
    public RemoteClient select(List<RemoteClient> clients, StreamData streamData) {
        int size = clients.size();
        index++;
```

### BoundedWildcard
Can generalize to `? extends RemoteClient`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/remote/selector/ForeverFirstSelector.java`
#### Snippet
```java

    @Override
    public RemoteClient select(List<RemoteClient> clients, StreamData streamData) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("clients size: {}", clients.size());
```

### BoundedWildcard
Can generalize to `? extends RemoteClient`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/remote/selector/HashCodeSelector.java`
#### Snippet
```java

    @Override
    public RemoteClient select(List<RemoteClient> clients, StreamData streamData) {
        int size = clients.size();
        int selectIndex = Math.abs(streamData.remoteHashCode()) % size;
```

### BoundedWildcard
Can generalize to `? extends RemoteInstance`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/remote/client/RemoteClientManager.java`
#### Snippet
```java
     * @param remoteInstances Remote instance collection by query cluster config.
     */
    private void reBuildRemoteClients(List<RemoteInstance> remoteInstances) {
        final Map<Address, RemoteClientAction> remoteClientCollection =
            this.usingClients.stream()
```

### BoundedWildcard
Can generalize to `? extends RemoteInstance`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/remote/client/RemoteClientManager.java`
#### Snippet
```java
    }

    private boolean compare(List<RemoteInstance> remoteInstances) {
        if (usingClients.size() == remoteInstances.size()) {
            for (int i = 0; i < usingClients.size(); i++) {
```

### BoundedWildcard
Can generalize to `? extends RemoteInstance`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/remote/client/RemoteClientManager.java`
#### Snippet
```java
     * @return distinct remote instances
     */
    private List<RemoteInstance> distinct(List<RemoteInstance> instanceList) {
        Set<Address> addresses = new HashSet<>();
        List<RemoteInstance> newInstanceList = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends RemoteInstance`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/cluster/OAPNodeChecker.java`
#### Snippet
```java
    private static CoreModuleConfig.Role ROLE = CoreModuleConfig.Role.Mixed;

    public static boolean hasIllegalNodeAddress(List<RemoteInstance> remoteInstances) {
        if (CollectionUtils.isEmpty(remoteInstances)) {
            return false;
```

### BoundedWildcard
Can generalize to `? extends ModelColumn`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/storage/model/ElasticSearchModelExtension.java`
#### Snippet
```java
    private Optional<String> routing = Optional.empty();

    public void setRouting(String modelName, List<ModelColumn> modelColumns) throws IllegalStateException {
        if (CollectionUtils.isEmpty(modelColumns)) {
            return;
```

### BoundedWildcard
Can generalize to `? super KeyValue`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/storage/query/IAlarmQueryDAO.java`
#### Snippet
```java
     * Parser the raw tags.
     */
    default void parserDataBinary(byte[] dataBinary, List<KeyValue> tags) {
        List<Tag> tagList = GSON.fromJson(new String(dataBinary, Charsets.UTF_8), new TypeToken<List<Tag>>() {
        }.getType());
```

### BoundedWildcard
Can generalize to `? extends T`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/data/ReadWriteSafeCache.java`
#### Snippet
```java
     * @param data to enqueue.
     */
    public void write(List<T> data) {
        lock.lock();
        try {
```

### BoundedWildcard
Can generalize to `? extends DataTable`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/storage/query/IMetricsQueryDAO.java`
#### Snippet
```java
        public static List<MetricsValues> composeLabelValue(final MetricsCondition condition,
            final List<String> labels,
            final Map<String, DataTable> idMap) {
            List<String> allLabels;
            if (Objects.isNull(labels) || labels.size() < 1 || labels.stream().allMatch(Strings::isNullOrEmpty)) {
```

### BoundedWildcard
Can generalize to `? extends ModelColumn`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/storage/model/StorageModels.java`
#### Snippet
```java

    private boolean addExtraColumn4AdditionalEntity(SQLDatabaseModelExtension sqlDBModelExtension,
                                                    List<ModelColumn> modelColumns,
                                                    String extraColumn, List<String> additionalTables) {
        for (ModelColumn modelColumn : modelColumns) {
```

### BoundedWildcard
Can generalize to `? super ModelColumn`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/storage/model/StorageModels.java`
#### Snippet
```java
    private void retrieval(final Class<?> clazz,
                           final String modelName,
                           final List<ModelColumn> modelColumns,
                           final int scopeId,
                           ShardingKeyChecker checker,
```

### BoundedWildcard
Can generalize to `? extends ContinuousProfilingPolicy`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/command/CommandService.java`
#### Snippet
```java
    }

    public ContinuousProfilingPolicyCommand newContinuousProfilingServicePolicyCommand(List<ContinuousProfilingPolicy> policy) {
        return new ContinuousProfilingPolicyCommand(UUID.randomUUID().toString(),
            policy.stream().map(this::convertContinuesProfilingPolicy).collect(Collectors.toList()));
```

### BoundedWildcard
Can generalize to `? extends Tag`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/searchtag/Tag.java`
#### Snippet
```java

    public static class Util {
        public static List<String> toStringList(List<Tag> list) {
            if (CollectionUtils.isEmpty(list)) {
                return Collections.emptyList();
```

### BoundedWildcard
Can generalize to `? super String`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/metrics/DataTable.java`
#### Snippet
```java
    }

    public List<String> sortedKeys(Comparator<String> keyComparator) {
        return data.keySet().stream().sorted(keyComparator).collect(Collectors.toList());
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/metrics/DataTable.java`
#### Snippet
```java
    }

    public List<Long> sortedValues(Comparator<String> keyComparator) {
        final List<String> collect = data.keySet().stream().sorted(keyComparator).collect(Collectors.toList());
        List<Long> values = new ArrayList<>(collect.size());
```

### BoundedWildcard
Can generalize to `? super Metrics`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/worker/MetricsAggregateWorker.java`
#### Snippet
```java

    MetricsAggregateWorker(ModuleDefineHolder moduleDefineHolder,
                           AbstractWorker<Metrics> nextWorker,
                           String modelName,
                           long l1FlushPeriod,
```

### BoundedWildcard
Can generalize to `? extends Metrics`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/worker/MetricsAggregateWorker.java`
#### Snippet
```java
     * @param metricsList from the queue.
     */
    private void onWork(List<Metrics> metricsList) {
        metricsList.forEach(metrics -> {
            aggregationCounter.inc();
```

### BoundedWildcard
Can generalize to `? super Tuple2`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/analyze/EBPFProfilingStackNode.java`
#### Snippet
```java
     */
    private void combineChildrenNodes(EBPFProfilingStackNode targetNode, EBPFProfilingStackNode beingMergedNode,
                                      Consumer<Tuple2<EBPFProfilingStackNode, EBPFProfilingStackNode>> continueChildrenMerging) {
        if (beingMergedNode.children.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? super PrepareRequest`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/worker/MetricsPersistentWorker.java`
#### Snippet
```java
     */
    private void prepareFlushDataToStorage(List<Metrics> metricsList,
                                           List<PrepareRequest> prepareRequests) {
        try {
            loadFromStorage(metricsList);
```

### BoundedWildcard
Can generalize to `? extends Metrics`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/worker/MetricsPersistentWorker.java`
#### Snippet
```java
     * Load data from the storage, only load data when the id doesn't exist.
     */
    private void loadFromStorage(List<Metrics> metrics) {
        final long currentTimeMillis = System.currentTimeMillis();
        try {
```

### BoundedWildcard
Can generalize to `? extends EBPFNetworkSamplingRule`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/EBPFProfilingMutationService.java`
#### Snippet
```java
    }

    private String validateSamplingRules(List<EBPFNetworkSamplingRule> rules) {
        if (CollectionUtils.isEmpty(rules)) {
            return null;
```

### BoundedWildcard
Can generalize to `? super Pair`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/trace/analyze/ProfileStackNode.java`
#### Snippet
```java
     */
    private void combineChildrenNodes(ProfileStackNode targetNode, ProfileStackNode beingMergedNode,
        Consumer<Pair<ProfileStackNode, ProfileStackNode>> continueChildrenMerging) {
        if (beingMergedNode.children.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends ContinuousProfilingPolicyTargetCreation`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/continuous/ContinuousProfilingMutationService.java`
#### Snippet
```java
    }

    private String validateTargets(List<ContinuousProfilingPolicyTargetCreation> targets) {
        final HashSet<ContinuousProfilingTargetType> targetCache = new HashSet<>();
        for (ContinuousProfilingPolicyTargetCreation target : targets) {
```

### BoundedWildcard
Can generalize to `? extends EBPFProfilingStack`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/analyze/EBPFProfilingAnalyzer.java`
#### Snippet
```java
    }

    public void generateTrees(EBPFProfilingAnalyzation analyzation, Stream<EBPFProfilingStack> stackStream) {
        Collection<EBPFProfilingTree> stackTrees = stackStream
                // stack list cannot be empty
```

### BoundedWildcard
Can generalize to `? extends EBPFProfilingAnalyzeTimeRange`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/analyze/EBPFProfilingAnalyzer.java`
#### Snippet
```java
    }

    protected List<TimeRange> buildTimeRanges(List<EBPFProfilingAnalyzeTimeRange> timeRanges) {
        return timeRanges.parallelStream()
                .map(r -> buildTimeRanges(r.getStart(), r.getEnd()))
```

### BoundedWildcard
Can generalize to `? super Number`
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/NumberClosure.java`
#### Snippet
```java
    private final Function2<Number, SampleFamily, SampleFamily> fn;

    public NumberClosure(Object owner, Function2<Number, SampleFamily, SampleFamily> fn) {
        super(owner);
        this.fn = fn;
```

### BoundedWildcard
Can generalize to `? super SampleFamily`
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/NumberClosure.java`
#### Snippet
```java
    private final Function2<Number, SampleFamily, SampleFamily> fn;

    public NumberClosure(Object owner, Function2<Number, SampleFamily, SampleFamily> fn) {
        super(owner);
        this.fn = fn;
```

### BoundedWildcard
Can generalize to `? extends SampleFamily`
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/NumberClosure.java`
#### Snippet
```java
    private final Function2<Number, SampleFamily, SampleFamily> fn;

    public NumberClosure(Object owner, Function2<Number, SampleFamily, SampleFamily> fn) {
        super(owner);
        this.fn = fn;
```

### BoundedWildcard
Can generalize to `? extends ProfileStack`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/trace/analyze/ProfileAnalyzer.java`
#### Snippet
```java
     * Analyze records
     */
    protected List<ProfileStackTree> analyzeByStack(List<ProfileStack> stacks) {
        if (CollectionUtils.isEmpty(stacks)) {
            return null;
```

### BoundedWildcard
Can generalize to `? extends SegmentProfileAnalyzeQuery`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/trace/analyze/ProfileAnalyzer.java`
#### Snippet
```java
    }

    protected SequenceSearch getAllSequenceRange(final List<SegmentProfileAnalyzeQuery> queries) {
        final List<SequenceSearch> searches = queries.parallelStream().map(r -> {
            try {
```

### BoundedWildcard
Can generalize to `? super Double`
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/Sample.java`
#### Snippet
```java
    }

    Sample increase(String range, Function2<Double, Long, Double> transform) {
        Tuple2<Long, Double> i = CounterWindow.INSTANCE.increase(name, labels, value, Duration.parse(range).toMillis(), timestamp);
        double nv = transform.apply(i._2, i._1);
```

### BoundedWildcard
Can generalize to `? super Long`
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/Sample.java`
#### Snippet
```java
    }

    Sample increase(String range, Function2<Double, Long, Double> transform) {
        Tuple2<Long, Double> i = CounterWindow.INSTANCE.increase(name, labels, value, Duration.parse(range).toMillis(), timestamp);
        double nv = transform.apply(i._2, i._1);
```

### BoundedWildcard
Can generalize to `? super Double`
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/Sample.java`
#### Snippet
```java
    }

    Sample increase(Function2<Double, Long, Double> transform) {
        Tuple2<Long, Double> i = CounterWindow.INSTANCE.pop(name, labels, value, timestamp);
        double nv = transform.apply(i._2, i._1);
```

### BoundedWildcard
Can generalize to `? super Long`
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/Sample.java`
#### Snippet
```java
    }

    Sample increase(Function2<Double, Long, Double> transform) {
        Tuple2<Long, Double> i = CounterWindow.INSTANCE.pop(name, labels, value, timestamp);
        double nv = transform.apply(i._2, i._1);
```

### BoundedWildcard
Can generalize to `? super Double`
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/Sample.java`
#### Snippet
```java
    final long timestamp;

    Sample newValue(Function<Double, Double> transform) {
        return toBuilder().value(transform.apply(value)).build();
    }
```

### BoundedWildcard
Can generalize to `? extends ProfileTaskLog`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/trace/ProfileTaskQueryService.java`
#### Snippet
```java
    }

    private List<ProfileTaskLog> findMatchedLogs(final String taskID, final List<ProfileTaskLog> allLogs) {
        return allLogs.stream()
                .filter(l -> Objects.equal(l.getTaskId(), taskID))
```

### BoundedWildcard
Can generalize to `? extends Query`
in `oap-server/server-library/library-elasticsearch-client/src/main/java/org/apache/skywalking/library/elasticsearch/requests/search/BoolQuery.java`
#### Snippet
```java

        private void writeArray(final JsonGenerator gen, final String name,
                                final List<Query> array) throws IOException {
            if (array == null || array.isEmpty()) {
                return;
```

### BoundedWildcard
Can generalize to `? super String`
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/Analyzer.java`
#### Snippet
```java
    }

    private String composeGroup(ImmutableMap<String, String> labels, Predicate<String> filter) {
        return labels.keySet().stream().filter(filter).sorted().map(labels::get)
                     .collect(Collectors.joining("-"));
```

### BoundedWildcard
Can generalize to `? extends SampleFamily`
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/Analyzer.java`
#### Snippet
```java
     * @param sampleFamilies input samples.
     */
    public void analyse(final ImmutableMap<String, SampleFamily> sampleFamilies) {
        Map<String, SampleFamily> input = samples.stream()
                                                 .map(s -> Tuple.of(s, sampleFamilies.get(s)))
```

### BoundedWildcard
Can generalize to `? extends List`
in `oap-server/server-library/library-elasticsearch-client/src/main/java/org/apache/skywalking/library/elasticsearch/requests/factory/v6/V6DocumentFactory.java`
#### Snippet
```java
    @SneakyThrows
    @Override
    public HttpRequest mget(final String type, final Map<String, List<String>> indexIds) {
        checkArgument(!isNullOrEmpty(type), "type cannot be null or empty");
        checkArgument(indexIds != null && !indexIds.isEmpty(), "ids cannot be null or empty");
```

### BoundedWildcard
Can generalize to `? extends SQLExecutor`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/SQLExecutor.java`
#### Snippet
```java
    }

    public void appendAdditionalSQLs(List<SQLExecutor> sqlExecutors) {
        if (additionalSQLs == null) {
            additionalSQLs = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends List`
in `oap-server/server-library/library-elasticsearch-client/src/main/java/org/apache/skywalking/library/elasticsearch/requests/factory/v7plus/V7DocumentFactory.java`
#### Snippet
```java
    @SneakyThrows
    @Override
    public HttpRequest mget(final String type, final Map<String, List<String>> indexIds) {
        checkArgument(!isNullOrEmpty(type), "type cannot be null or empty");
        checkArgument(indexIds != null && !indexIds.isEmpty(), "ids cannot be null or empty");
```

### BoundedWildcard
Can generalize to `? extends Metric`
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/prometheus/PrometheusMetricConverter.java`
#### Snippet
```java
    }

    public ImmutableMap<String, SampleFamily> convertPromMetricToSampleFamily(Stream<Metric> metricStream) {
        return metricStream
            .peek(metric -> log.debug("Prom metric to be convert to SampleFamily: {}", metric))
```

### BoundedWildcard
Can generalize to `? extends Metrics`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCMetricsDAO.java`
#### Snippet
```java

    @Override
    public List<Metrics> multiGet(Model model, List<Metrics> metrics) throws Exception {
        final var ids = metrics.stream().map(m -> TableHelper.generateId(model, m.id().build())).collect(toList());
        final var storageDataList = getByIDs(jdbcClient, model.getName(), ids, storageBuilder);
```

### BoundedWildcard
Can generalize to `? extends EventQueryCondition`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCEventQueryDAO.java`
#### Snippet
```java

    @Override
    public Events queryEvents(List<EventQueryCondition> conditions) throws Exception {
        final var conditionsParametersPair = conditions.stream()
                                                       .map(this::buildQuery)
```

### BoundedWildcard
Can generalize to `? extends ModelColumn`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/JDBCTableInstaller.java`
#### Snippet
```java
    }

    public void createOrUpdateTableIndexes(String table, List<ModelColumn> columns,
                                           boolean isAdditionalTable) throws SQLException {
        final var jdbcClient = (JDBCClient) client;
```

### BoundedWildcard
Can generalize to `? extends ModelColumn`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/JDBCTableInstaller.java`
#### Snippet
```java
    }

    private void createTable(String table, List<ModelColumn> columns, boolean isAdditionalTable) throws SQLException {
        final var columnDefinitions = new ArrayList<String>();
        columnDefinitions.add(ID_COLUMN + " VARCHAR(512)" + (!isAdditionalTable ? " PRIMARY KEY" : ""));
```

### BoundedWildcard
Can generalize to `? extends ModelColumn`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/JDBCTableInstaller.java`
#### Snippet
```java
    }

    private void updateTable(String table, List<ModelColumn> columns) throws SQLException {
        final var alterSqls =
            columns
```

### BoundedWildcard
Can generalize to `? extends PrepareRequest`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCBatchDAO.java`
#### Snippet
```java

    @Override
    public CompletableFuture<Void> flush(List<PrepareRequest> prepareRequests) {
        if (CollectionUtils.isEmpty(prepareRequests)) {
            return CompletableFuture.completedFuture(null);
```

### BoundedWildcard
Can generalize to `? extends Map`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCSQLExecutor.java`
#### Snippet
```java
                                                                    long timeBucket,
                                                                    StorageBuilder<T> storageBuilder,
                                                                    Convert2Storage<Map<String, Object>> converter,
                                                                    SessionCacheCallback callback) throws IOException {
        storageBuilder.entity2Storage(metrics, converter);
```

### BoundedWildcard
Can generalize to `? extends ModelColumn`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCSQLExecutor.java`
#### Snippet
```java

    private <T extends StorageData> List<SQLExecutor> buildAdditionalInsertExecutor(Model model, String tableName,
                                                                                    List<ModelColumn> columns,
                                                                                    T metrics,
                                                                                    long timeBucket,
```

### BoundedWildcard
Can generalize to `? super Call.CallDetail`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCTopologyQueryDAO.java`
#### Snippet
```java
    }

    private void buildServiceCalls(ResultSet resultSet, List<Call.CallDetail> calls,
                                   DetectPoint detectPoint) throws SQLException {
        while (resultSet.next()) {
```

### BoundedWildcard
Can generalize to `? super Call.CallDetail`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCTopologyQueryDAO.java`
#### Snippet
```java
    }

    private void buildInstanceCalls(ResultSet resultSet, List<Call.CallDetail> calls,
                                    DetectPoint detectPoint) throws SQLException {
        while (resultSet.next()) {
```

### BoundedWildcard
Can generalize to `? super Call.CallDetail`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCTopologyQueryDAO.java`
#### Snippet
```java
    }

    private void buildEndpointCalls(ResultSet resultSet, List<Call.CallDetail> calls,
                                    DetectPoint detectPoint) throws SQLException {
        while (resultSet.next()) {
```

### BoundedWildcard
Can generalize to `? super Call.CallDetail`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCTopologyQueryDAO.java`
#### Snippet
```java
    }

    private void buildProcessCalls(ResultSet resultSet, List<Call.CallDetail> calls,
                                    DetectPoint detectPoint) throws SQLException {
        while (resultSet.next()) {
```

### BoundedWildcard
Can generalize to `? extends Tag`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCTraceQueryDAO.java`
#### Snippet
```java
                                       TraceState traceState,
                                       QueryOrder queryOrder,
                                       final List<Tag> tags) throws IOException {
        if (searchableTagKeys == null) {
            final ConfigService configService = manager.find(CoreModule.NAME)
```

### BoundedWildcard
Can generalize to `? extends KeyValue`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCAggregationQueryDAO.java`
#### Snippet
```java
        final String valueColumnName,
        final Duration duration,
        final List<KeyValue> queries,
        final String table) {

```

### BoundedWildcard
Can generalize to `? extends MeterConfig`
in `oap-server/analyzer/agent-analyzer/src/main/java/org/apache/skywalking/oap/server/analyzer/provider/meter/process/MeterProcessService.java`
#### Snippet
```java
    }

    public void start(List<MeterConfig> configs) {
        final MeterSystem meterSystem = manager.find(CoreModule.NAME).provider().getService(MeterSystem.class);
        this.metricConverts = configs.stream().map(c -> new MetricConvert(c, meterSystem)).collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? super Source`
in `oap-server/analyzer/agent-analyzer/src/main/java/org/apache/skywalking/oap/server/analyzer/provider/trace/parser/listener/vservice/VirtualDatabaseProcessor.java`
#### Snippet
```java

    @Override
    public void emitTo(Consumer<Source> consumer) {
        recordList.forEach(consumer);
    }
```

### BoundedWildcard
Can generalize to `? super Source`
in `oap-server/analyzer/agent-analyzer/src/main/java/org/apache/skywalking/oap/server/analyzer/provider/trace/parser/listener/vservice/VirtualMQProcessor.java`
#### Snippet
```java

    @Override
    public void emitTo(final Consumer<Source> consumer) {
        sourceList.forEach(consumer);
    }
```

### BoundedWildcard
Can generalize to `? super Source`
in `oap-server/analyzer/agent-analyzer/src/main/java/org/apache/skywalking/oap/server/analyzer/provider/trace/parser/listener/vservice/VirtualCacheProcessor.java`
#### Snippet
```java

    @Override
    public void emitTo(Consumer<Source> consumer) {
        sourceList.forEach(consumer);
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `oap-server/server-library/library-datacarrier-queue/src/main/java/org/apache/skywalking/oap/server/library/datacarrier/buffer/ArrayBlockingQueueBuffer.java`
#### Snippet
```java

    @Override
    public void obtain(List<T> consumeList) {
        queue.drainTo(consumeList);
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `oap-server/server-library/library-datacarrier-queue/src/main/java/org/apache/skywalking/oap/server/library/datacarrier/buffer/Buffer.java`
#### Snippet
```java
    }

    void obtain(List<T> consumeList, int start, int end) {
        for (int i = start; i < end; i++) {
            if (buffer[i] != null) {
```

### BoundedWildcard
Can generalize to `? super T`
in `oap-server/server-library/library-datacarrier-queue/src/main/java/org/apache/skywalking/oap/server/library/datacarrier/buffer/Channels.java`
#### Snippet
```java
    }

    public void setPartitioner(IDataPartitioner<T> dataPartitioner) {
        this.dataPartitioner = dataPartitioner;
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `oap-server/server-library/library-datacarrier-queue/src/main/java/org/apache/skywalking/oap/server/library/datacarrier/buffer/Channels.java`
#### Snippet
```java
    private final long size;

    public Channels(int channelSize, int bufferSize, IDataPartitioner<T> partitioner, BufferStrategy strategy) {
        this.dataPartitioner = partitioner;
        this.strategy = strategy;
```

### BoundedWildcard
Can generalize to `? extends ConsumerPool`
in `oap-server/server-library/library-datacarrier-queue/src/main/java/org/apache/skywalking/oap/server/library/datacarrier/consumer/ConsumerPoolFactory.java`
#### Snippet
```java
    }

    public synchronized boolean createIfAbsent(String poolName, Callable<ConsumerPool> creator) throws Exception {
        if (pools.containsKey(poolName)) {
            return false;
```

### BoundedWildcard
Can generalize to `? extends ZabbixConfig`
in `oap-server/server-receiver-plugin/skywalking-zabbix-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/zabbix/provider/ZabbixMetrics.java`
#### Snippet
```java
    private List<InstanceGroup> allServices = new ArrayList<>();

    public ZabbixMetrics(List<ZabbixConfig> originalConfigs, MeterSystem meterSystem) {
        this.originalConfigs = originalConfigs;
        initConfigs(meterSystem);
```

### BoundedWildcard
Can generalize to `? extends ZabbixRequest.AgentData`
in `oap-server/server-receiver-plugin/skywalking-zabbix-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/zabbix/provider/ZabbixMetrics.java`
#### Snippet
```java
         * Parsing config labels from original value or agent data
         */
        private Map<String, String> parseConfigLabels(List<ZabbixRequest.AgentData> dataList) {
            if (CollectionUtils.isEmpty(labels)) {
                return Collections.emptyMap();
```

### BoundedWildcard
Can generalize to `? extends Process`
in `oap-server/server-receiver-plugin/skywalking-ebpf-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/ebpf/provider/handler/EBPFProfilingServiceHandler.java`
#### Snippet
```java
    }

    private List<EBPFProfilingTaskCommand> buildProfilingCommands(EBPFProfilingTaskRecord task, List<Process> processes) {
        if (EBPFProfilingTargetType.NETWORK.value() == task.getTargetType()) {
            final List<String> processIdList = processes.stream().filter(p -> Objects.equals(p.getInstanceId(), task.getInstanceId())).map(Process::getId).collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? extends KeyValue`
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/BanyanDBAggregationQueryDAO.java`
#### Snippet
```java

    @Override
    public List<SelectedRecord> sortMetrics(TopNCondition condition, String valueColumnName, Duration duration, List<KeyValue> additionalConditions) throws IOException {
        final String modelName = condition.getName();
        final TimestampRange timestampRange = new TimestampRange(duration.getStartTimestamp(), duration.getEndTimestamp());
```

### BoundedWildcard
Can generalize to `? super NoneStream`
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/BanyanDBNoneStreamDAO.java`
#### Snippet
```java
    private final StorageBuilder<NoneStream> storageBuilder;

    public BanyanDBNoneStreamDAO(BanyanDBStorageClient client, StorageBuilder<NoneStream> storageBuilder) {
        super(client);
        this.storageBuilder = storageBuilder;
```

### BoundedWildcard
Can generalize to `? extends PrepareRequest`
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/BanyanDBBatchDAO.java`
#### Snippet
```java

    @Override
    public CompletableFuture<Void> flush(List<PrepareRequest> prepareRequests) {
        if (CollectionUtils.isNotEmpty(prepareRequests)) {
            return CompletableFuture.allOf(prepareRequests.stream().map((Function<PrepareRequest, CompletableFuture<Void>>) r -> {
```

### BoundedWildcard
Can generalize to `? extends Tag`
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/stream/BanyanDBAlarmQueryDAO.java`
#### Snippet
```java

    @Override
    public Alarms getAlarm(Integer scopeId, String keyword, int limit, int from, Duration duration, List<Tag> tags) throws IOException {
        long startTB = duration.getStartTimeBucketInSec();
        long endTB = duration.getEndTimeBucketInSec();
```

### BoundedWildcard
Can generalize to `? extends Tag`
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/stream/BanyanDBTraceQueryDAO.java`
#### Snippet
```java

    @Override
    public TraceBrief queryBasicTraces(Duration duration, long minDuration, long maxDuration, String serviceId, String serviceInstanceId, String endpointId, String traceId, int limit, int from, TraceState traceState, QueryOrder queryOrder, List<Tag> tags) throws IOException {
        long startSecondTB = 0;
        long endSecondTB = 0;
```

### BoundedWildcard
Can generalize to `? extends Tag`
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/stream/BanyanDBLogQueryDAO.java`
#### Snippet
```java
    public Logs queryLogs(String serviceId, String serviceInstanceId, String endpointId,
                          TraceScopeCondition relatedTrace, Order queryOrder, int from, int limit,
                          Duration duration, List<Tag> tags, List<String> keywordsOfContent,
                          List<String> excludingKeywordsOfContent) throws IOException {
        long startTB = 0;
```

### BoundedWildcard
Can generalize to `? extends TagMetadata`
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/MetadataRegistry.java`
#### Snippet
```java
        }

        private List<TagFamilySpec> extractTagFamilySpec(List<TagMetadata> tagMetadataList, boolean shouldAddID) {
            final String indexFamily = SchemaMetadata.this.indexFamily();
            final String nonIndexFamily = SchemaMetadata.this.nonIndexFamily();
```

### BoundedWildcard
Can generalize to `? extends ModelColumn`
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/MetadataRegistry.java`
#### Snippet
```java
     * @return a list of column names in strict order
     */
    List<String> parseEntityNames(Map<String, ModelColumn> modelColumnMap) {
        List<ModelColumn> shardingColumns = new ArrayList<>();
        for (final ModelColumn col : modelColumnMap.values()) {
```

### BoundedWildcard
Can generalize to `? extends EventQueryCondition`
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/measure/BanyanDBEventQueryDAO.java`
#### Snippet
```java
    }

    public QueryBuilder<MeasureQuery> buildQuery(final List<EventQueryCondition> conditionList) {
        EventQueryCondition condition = conditionList.get(0);
        final Order queryOrder = isNull(condition.getOrder()) ? Order.DES : condition.getOrder();
```

### BoundedWildcard
Can generalize to `? extends Metrics`
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/measure/BanyanDBMetricsDAO.java`
#### Snippet
```java

    @Override
    public List<Metrics> multiGet(Model model, List<Metrics> metrics) throws IOException {
        log.info("multiGet {} from BanyanDB", model.getName());
        MetadataRegistry.Schema schema = MetadataRegistry.INSTANCE.findMetadata(model);
```

### BoundedWildcard
Can generalize to `? extends List`
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/measure/BanyanDBMetricsDAO.java`
#### Snippet
```java
    }

    private AnalyticalResult analyze(Metrics m, String tsCol, Map<String, List<String>> seriesIDColumns) {
        StorageID id = m.id();
        List<StorageID.Fragment> fragments = id.read();
```

### BoundedWildcard
Can generalize to `? extends AlarmCallback`
in `oap-server/server-alarm-plugin/src/main/java/org/apache/skywalking/oap/server/core/alarm/provider/AlarmCore.java`
#### Snippet
```java
    }

    public void start(List<AlarmCallback> allCallbacks) {
        LocalDateTime now = LocalDateTime.now();
        lastExecuteTime = now;
```

### BoundedWildcard
Can generalize to `? super StreamQuery`
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/stream/AbstractBanyanDBDAO.java`
#### Snippet
```java

    protected StreamQueryResponse query(String streamModelName, Set<String> tags, TimestampRange timestampRange,
                                        QueryBuilder<StreamQuery> builder) throws IOException {
        MetadataRegistry.Schema schema = MetadataRegistry.INSTANCE.findRecordMetadata(streamModelName);
        if (schema == null) {
```

### BoundedWildcard
Can generalize to `? super MeasureQuery`
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/stream/AbstractBanyanDBDAO.java`
#### Snippet
```java

    protected MeasureQueryResponse query(MetadataRegistry.Schema schema, Set<String> tags, Set<String> fields,
                                         TimestampRange timestampRange, QueryBuilder<MeasureQuery> builder) throws IOException {
        final MeasureQuery query;
        if (timestampRange == null) {
```

### BoundedWildcard
Can generalize to `? extends CompositeAlarmRule`
in `oap-server/server-alarm-plugin/src/main/java/org/apache/skywalking/oap/server/core/alarm/provider/CompositeRuleEvaluator.java`
#### Snippet
```java
     * @return
     */
    public List<AlarmMessage> evaluate(List<CompositeAlarmRule> compositeAlarmRules, List<AlarmMessage> alarmMessages) {
        final List<AlarmMessage> compositeRuleMessages = new ArrayList<>();
        ImmutableListMultimap<String, AlarmMessage> messageMap = Multimaps.index(alarmMessages, alarmMessage ->
```

### BoundedWildcard
Can generalize to `? extends AlarmMessage`
in `oap-server/server-alarm-plugin/src/main/java/org/apache/skywalking/oap/server/core/alarm/provider/wechat/WechatHookCallback.java`
#### Snippet
```java

    @Override
    public void doAlarm(List<AlarmMessage> alarmMessages) throws Exception {
        if (alarmRulesWatcher.getWechatSettings() == null || alarmRulesWatcher.getWechatSettings().getWebhooks().isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? super String`
in `oap-server/server-library/library-client/src/main/java/org/apache/skywalking/oap/server/library/client/elasticsearch/ElasticSearchClient.java`
#### Snippet
```java
                               String user,
                               String password,
                               Function<String, String> indexNameConverter,
                               int connectTimeout,
                               int socketTimeout,
```

### BoundedWildcard
Can generalize to `? extends List`
in `oap-server/server-library/library-client/src/main/java/org/apache/skywalking/oap/server/library/client/elasticsearch/ElasticSearchClient.java`
#### Snippet
```java
     * @since 9.2.0
     */
    public Optional<Documents> ids(Map<String, List<String>> indexIds) {
        Map<String, List<String>> map = new HashMap<>();
        indexIds.forEach((indexName, ids) -> {
```

### BoundedWildcard
Can generalize to `? extends AlarmMessage`
in `oap-server/server-alarm-plugin/src/main/java/org/apache/skywalking/oap/server/core/alarm/provider/feishu/FeishuHookCallback.java`
#### Snippet
```java
     */
    @Override
    public void doAlarm(List<AlarmMessage> alarmMessages) throws Exception {
        if (alarmRulesWatcher.getFeishuSettings() == null || alarmRulesWatcher.getFeishuSettings().getWebhooks().isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends Metrics`
in `oap-server/server-alarm-plugin/src/main/java/org/apache/skywalking/oap/server/core/alarm/provider/RunningRule.java`
#### Snippet
```java
    }

    private LinkedList<TraceLogMetric> transformValues(final LinkedList<Metrics> values) {
        LinkedList<TraceLogMetric> r = new LinkedList<>();
        values.forEach(m -> {
```

### BoundedWildcard
Can generalize to `? extends AlarmMessage`
in `oap-server/server-alarm-plugin/src/main/java/org/apache/skywalking/oap/server/core/alarm/provider/discord/DiscordHookCallback.java`
#### Snippet
```java
     */
    @Override
    public void doAlarm(List<AlarmMessage> alarmMessages) throws Exception {
        final var discordSettings = alarmRulesWatcher.getDiscordSettings();
        if (discordSettings == null || discordSettings.getWebhooks().isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends AlarmMessage`
in `oap-server/server-alarm-plugin/src/main/java/org/apache/skywalking/oap/server/core/alarm/provider/welink/WeLinkHookCallback.java`
#### Snippet
```java
     */
    @Override
    public void doAlarm(List<AlarmMessage> alarmMessages) throws Exception {
        if (alarmRulesWatcher.getWeLinkSettings() == null
                || alarmRulesWatcher.getWeLinkSettings().getWebhooks().isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends AlarmMessage`
in `oap-server/server-alarm-plugin/src/main/java/org/apache/skywalking/oap/server/core/alarm/provider/slack/SlackhookCallback.java`
#### Snippet
```java

    @Override
    public void doAlarm(List<AlarmMessage> alarmMessages) throws Exception {
        if (alarmRulesWatcher.getSlackSettings() == null || alarmRulesWatcher.getSlackSettings().getWebhooks().isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends AlarmMessage`
in `oap-server/server-alarm-plugin/src/main/java/org/apache/skywalking/oap/server/core/alarm/provider/pagerduty/PagerDutyHookCallback.java`
#### Snippet
```java

    @Override
    public void doAlarm(List<AlarmMessage> alarmMessages) throws Exception {
        if (alarmRulesWatcher.getPagerDutySettings() == null || alarmRulesWatcher.getPagerDutySettings().getIntegrationKeys().isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends AlarmMessage`
in `oap-server/server-alarm-plugin/src/main/java/org/apache/skywalking/oap/server/core/alarm/provider/dingtalk/DingtalkHookCallback.java`
#### Snippet
```java
     */
    @Override
    public void doAlarm(List<AlarmMessage> alarmMessages) throws Exception {
        if (alarmRulesWatcher.getDingtalkSettings() == null || alarmRulesWatcher.getDingtalkSettings().getWebhooks().isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends Sample`
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/SampleFamily.java`
#### Snippet
```java
        }

        private static String dim(List<Sample> samples, List<String> labelKeys, String delimiter) {
            String name = labelKeys.stream()
                                   .map(k -> samples.get(0).labels.getOrDefault(k, ""))
```

### BoundedWildcard
Can generalize to `? extends Sample`
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/SampleFamily.java`
#### Snippet
```java
    private static class InternalOps {

        private static Sample[] left(List<Sample> samples, List<String> labelKeys) {
            return samples.stream().map(s -> {
                ImmutableMap<String, String> ll = ImmutableMap.<String, String>builder()
```

### BoundedWildcard
Can generalize to `? super CompType`
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/SampleFamily.java`
#### Snippet
```java
    private SampleFamily valueMatch(CompType compType,
                                    double compValue,
                                    Function3<CompType, Double, Double, Boolean> op) {
        Sample[] ss = Arrays.stream(samples)
                            .filter(sample -> op.apply(compType, sample.value, compValue)).toArray(Sample[]::new);
```

### BoundedWildcard
Can generalize to `? super Double`
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/SampleFamily.java`
#### Snippet
```java
    private SampleFamily valueMatch(CompType compType,
                                    double compValue,
                                    Function3<CompType, Double, Double, Boolean> op) {
        Sample[] ss = Arrays.stream(samples)
                            .filter(sample -> op.apply(compType, sample.value, compValue)).toArray(Sample[]::new);
```

### BoundedWildcard
Can generalize to `? super Double`
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/SampleFamily.java`
#### Snippet
```java
    private SampleFamily valueMatch(CompType compType,
                                    double compValue,
                                    Function3<CompType, Double, Double, Boolean> op) {
        Sample[] ss = Arrays.stream(samples)
                            .filter(sample -> op.apply(compType, sample.value, compValue)).toArray(Sample[]::new);
```

### BoundedWildcard
Can generalize to `? super String`
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/SampleFamily.java`
#### Snippet
```java
    }

    private SampleFamily match(String[] labels, Function2<String, String, Boolean> op) {
        Preconditions.checkArgument(labels.length % 2 == 0);
        Map<String, String> ll = new HashMap<>(labels.length / 2);
```

### BoundedWildcard
Can generalize to `? super String`
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/SampleFamily.java`
#### Snippet
```java
    }

    private SampleFamily match(String[] labels, Function2<String, String, Boolean> op) {
        Preconditions.checkArgument(labels.length % 2 == 0);
        Map<String, String> ll = new HashMap<>(labels.length / 2);
```

### BoundedWildcard
Can generalize to `? super Double`
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/SampleFamily.java`
#### Snippet
```java
    }

    private SampleFamily newValue(SampleFamily another, Function2<Double, Double, Double> transform) {
        Sample[] ss = Arrays.stream(samples)
                            .flatMap(cs -> io.vavr.collection.Stream.of(another.samples)
```

### BoundedWildcard
Can generalize to `? super Double`
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/SampleFamily.java`
#### Snippet
```java
    }

    private SampleFamily newValue(SampleFamily another, Function2<Double, Double, Double> transform) {
        Sample[] ss = Arrays.stream(samples)
                            .flatMap(cs -> io.vavr.collection.Stream.of(another.samples)
```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/SQLAndParameters.java`
#### Snippet
```java
    @Getter
    private final String sql;
    @NonNull
    private final List<Object> parameters;

```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/query/zipkin/ZipkinQueryEsDAO.java`
#### Snippet
```java
public class ZipkinQueryEsDAO extends EsDAO implements IZipkinQueryDAO {
    private final static int NAME_QUERY_MAX_SIZE = 10000;
    private final static int SCROLLING_BATCH_SIZE = 5000;

    public ZipkinQueryEsDAO(ElasticSearchClient client) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/query/zipkin/ZipkinQueryEsDAO.java`
#### Snippet
```java

public class ZipkinQueryEsDAO extends EsDAO implements IZipkinQueryDAO {
    private final static int NAME_QUERY_MAX_SIZE = 10000;
    private final static int SCROLLING_BATCH_SIZE = 5000;

```

### MissortedModifiers
Missorted modifiers `default public`
in `oap-server/server-tools/data-generator/src/main/java/org/apache/skywalking/generator/Generator.java`
#### Snippet
```java
    public T next();

    default public void reset() {
    }
}
```

### MissortedModifiers
Missorted modifiers `public @SuppressWarnings("unchecked")`
in `oap-server/server-library/library-module/src/main/java/org/apache/skywalking/oap/server/library/module/ModuleProvider.java`
#### Snippet
```java

    @Override
    public @SuppressWarnings("unchecked")
    <T extends Service> T getService(Class<T> serviceType) throws ServiceNotProvidedException {
        Service serviceImpl = services.get(serviceType);
```

### MissortedModifiers
Missorted modifiers `final static`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/config/group/openapi/EndpointGroupingRuleReader4Openapi.java`
#### Snippet
```java
public class EndpointGroupingRuleReader4Openapi {
    private final Map<String, /*serviceName*/ List<Map>/*openapiData*/> serviceOpenapiDefMap;
    private final static String DEFAULT_ENDPOINT_NAME_FORMAT = "${METHOD}:${PATH}";
    private final static String DEFAULT_ENDPOINT_NAME_MATCH_RULE = "${METHOD}:${PATH}";
    private final Map<String, String> requestMethodsMap = new HashMap<String, String>() {
```

### MissortedModifiers
Missorted modifiers `final static`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/config/group/openapi/EndpointGroupingRuleReader4Openapi.java`
#### Snippet
```java
    private final Map<String, /*serviceName*/ List<Map>/*openapiData*/> serviceOpenapiDefMap;
    private final static String DEFAULT_ENDPOINT_NAME_FORMAT = "${METHOD}:${PATH}";
    private final static String DEFAULT_ENDPOINT_NAME_MATCH_RULE = "${METHOD}:${PATH}";
    private final Map<String, String> requestMethodsMap = new HashMap<String, String>() {
        {
```

### MissortedModifiers
Missorted modifiers `static private`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/remote/client/RemoteClientManager.java`
#### Snippet
```java
    @Getter
    @AllArgsConstructor
    static private class RemoteClientAction {
        private RemoteClient remoteClient;

```

### MissortedModifiers
Missorted modifiers `static abstract`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/log/AbstractLogRecord.java`
#### Snippet
```java
    }

    public static abstract class Builder<T extends AbstractLogRecord> implements StorageBuilder<T> {
        protected void map2Data(T record, final Convert2Entity converter) {
            record.setServiceId((String) converter.get(SERVICE_ID));
```

### MissortedModifiers
Missorted modifiers `final static`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/worker/RecordStreamProcessor.java`
#### Snippet
```java
public class RecordStreamProcessor implements StreamProcessor<Record> {

    private final static RecordStreamProcessor PROCESSOR = new RecordStreamProcessor();

    private Map<Class<? extends Record>, RecordPersistentWorker> workers = new HashMap<>();
```

### MissortedModifiers
Missorted modifiers `final static`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/worker/MetricsStreamProcessor.java`
#### Snippet
```java
     * Singleton instance.
     */
    private final static MetricsStreamProcessor PROCESSOR = new MetricsStreamProcessor();

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/ExpressionParsingContext.java`
#### Snippet
```java
    }

    private final static ThreadLocal<ExpressionParsingContext> CACHE = new ThreadLocal<>();

    List<String> samples;
```

### MissortedModifiers
Missorted modifiers `final static`
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/k8s/K8sInfoRegistry.java`
#### Snippet
```java

public class K8sInfoRegistry {
    private final static K8sInfoRegistry INSTANCE = new K8sInfoRegistry();
    private final LoadingCache<ObjectID /* Pod */, ObjectID /* Service */> podServiceMap;
    private final LoadingCache<String/* podIP */, ObjectID /* Pod */> ipPodMap;
```

### MissortedModifiers
Missorted modifiers `final static`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCZipkinQueryDAO.java`
#### Snippet
```java
@RequiredArgsConstructor
public class JDBCZipkinQueryDAO implements IZipkinQueryDAO {
    private final static int NAME_QUERY_MAX_SIZE = Integer.MAX_VALUE;
    private static final Gson GSON = new Gson();

```

### MissortedModifiers
Missorted modifiers `synchronized public`
in `oap-server/server-library/library-datacarrier-queue/src/main/java/org/apache/skywalking/oap/server/library/datacarrier/consumer/BulkConsumePool.java`
#### Snippet
```java

    @Override
    synchronized public void add(String name, Channels channels, IConsumer consumer) {
        MultipleChannelsConsumer multipleChannelsConsumer = getLowestPayload();
        multipleChannelsConsumer.addNewTarget(channels, consumer);
```

### MissortedModifiers
Missorted modifiers `final static`
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/BanyanDBZipkinQueryDAO.java`
#### Snippet
```java

public class BanyanDBZipkinQueryDAO extends AbstractBanyanDBDAO implements IZipkinQueryDAO {
    private final static int QUERY_MAX_SIZE = Integer.MAX_VALUE;
    private static final Set<String> SERVICE_TRAFFIC_TAGS = ImmutableSet.of(ZipkinServiceTraffic.SERVICE_NAME);
    private static final Set<String> REMOTE_SERVICE_TRAFFIC_TAGS = ImmutableSet.of(
```

### MissortedModifiers
Missorted modifiers `synchronized public`
in `oap-server/server-configuration/configuration-api/src/main/java/org/apache/skywalking/oap/server/configuration/api/ConfigWatcherRegister.java`
#### Snippet
```java

    @Override
    synchronized public void registerConfigChangeWatcher(ConfigChangeWatcher watcher) {
        if (isStarted) {
            throw new IllegalStateException("Config Register has been started. Can't register new watcher.");
```

## RuleId[id=EqualsBetweenInconvertibleTypes]
### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'int' and 'EBPFProfilingTargetType'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/EBPFProfilingMutationService.java`
#### Snippet
```java
        }
        // target type not "NETWORK"
        if (!Objects.equals(task.getTargetType(), EBPFProfilingTargetType.NETWORK)) {
            return buildKeepProfilingError("current task is not a \"NETWORK\" task");
        }
```

## RuleId[id=IfStatementMissingBreakInLoop]
### IfStatementMissingBreakInLoop
Loop can be terminated after condition is met
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/query/type/HeatMap.java`
#### Snippet
```java
            boolean found = false;
            for (final HeatMapColumn value : values) {
                if (expectedId.equals(value.id)) {
                    found = true;
                }
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `oap-server/server-tools/profile-exporter/tool-profile-snapshot-bootstrap/src/main/java/org/apache/skywalking/oap/server/tool/profile/exporter/ExporterConfig.java`
#### Snippet
```java
        File dist = new File(analyzeResultDist);
        if (!dist.exists()) {
            dist.mkdirs();
            return;
        }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `oap-server/oal-rt/src/main/java/org/apache/skywalking/oal/rt/OALRuntime.java`
#### Snippet
```java
                File folder = new File(workPath.getParentFile(), "oal-rt/" + type);
                if (!folder.exists()) {
                    folder.mkdirs();
                }
                File file = new File(folder, className + ".class");
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `oap-server/oal-rt/src/main/java/org/apache/skywalking/oal/rt/OALRuntime.java`
#### Snippet
```java
                File file = new File(folder, className + ".class");
                if (file.exists()) {
                    file.delete();
                }
                file.createNewFile();
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `oap-server/oal-rt/src/main/java/org/apache/skywalking/oal/rt/OALRuntime.java`
#### Snippet
```java
                    file.delete();
                }
                file.createNewFile();

                printWriter = new DataOutputStream(new FileOutputStream(file));
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `oap-server/oal-rt/src/main/java/org/apache/skywalking/oal/rt/OALRuntime.java`
#### Snippet
```java
                }
            }
            folder.mkdirs();
        }
    }
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `module()` is identical to its super method
in `oap-server/server-tools/profile-exporter/tool-profile-snapshot-server-mock/src/main/java/org/apache/skywalking/oap/server/tool/profile/core/MockCoreModuleProvider.java`
#### Snippet
```java

    @Override
    public Class<? extends ModuleDefine> module() {
        return CoreModule.class;
    }
```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Binding` is the same as one of its superclass' names
in `oap-server/analyzer/log-analyzer/src/main/java/org/apache/skywalking/oap/log/analyzer/dsl/Binding.java`
#### Snippet
```java
 * groovy.lang.Binding#getProperty(java.lang.String)}.
 */
public class Binding extends groovy.lang.Binding {
    public static final String KEY_LOG = "log";

```

### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/log/LogRecord.java`
#### Snippet
```java
    }

    public static class Builder extends AbstractLogRecord.Builder<LogRecord> {
        @Override
        public LogRecord storage2Entity(final Convert2Entity converter) {
```

### ClassNameSameAsAncestorName
Class name `Factory` is the same as one of its superclass' names
in `oap-server/analyzer/event-analyzer/src/main/java/org/apache/skywalking/oap/server/analyzer/event/listener/EventRecordAnalyzerListener.java`
#### Snippet
```java
    }

    public static class Factory implements EventAnalyzerListener.Factory {
        private final NamingControl namingControl;

```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `oap-server/server-tools/data-generator/src/main/java/org/apache/skywalking/generator/Generator.java`
#### Snippet
```java
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type")
@JsonSubTypes({
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/meter/function/HistogramFunction.java`
#### Snippet
```java
    @Getter
    @Setter
    @Column(name = DATASET, dataType = Column.ValueDataType.HISTOGRAM, storageOnly = true, defaultValue = 0)
    @BanyanDB.MeasureField
    private DataTable dataset = new DataTable(30);
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/meter/function/avg/AvgHistogramFunction.java`
#### Snippet
```java
    @Getter
    @Setter
    @Column(name = DATASET, dataType = Column.ValueDataType.HISTOGRAM, storageOnly = true, defaultValue = 0)
    @BanyanDB.MeasureField
    private DataTable dataset = new DataTable(30);
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/process/ServiceLabelRecord.java`
#### Snippet
```java
@Stream(name = ServiceLabelRecord.INDEX_NAME, scopeId = SERVICE_LABEL,
        builder = ServiceLabelRecord.Builder.class, processor = MetricsStreamProcessor.class)
@MetricsExtension(supportDownSampling = false, supportUpdate = false, timeRelativeID = false)
@EqualsAndHashCode(of = {
        "serviceId",
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/searchtag/TagAutocompleteData.java`
#### Snippet
```java
// TagAutocompleteData still uses the day(toTimeBucketInDay()) as ID prefix,
// to make this tag tip feature doesn't host too large scale data.
@MetricsExtension(supportDownSampling = false, supportUpdate = false, timeRelativeID = false)
@EqualsAndHashCode(of = {
    "tagKey",
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/metrics/HistogramMetrics.java`
#### Snippet
```java
    @Getter
    @Setter
    @Column(name = DATASET, dataType = Column.ValueDataType.HISTOGRAM, storageOnly = true, defaultValue = 0)
    @BanyanDB.MeasureField
    private DataTable dataset = new DataTable(30);
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
msg.getPeriod() \* 60 \* 1000: integer multiplication implicitly cast to long
in `oap-server/server-alarm-plugin/src/main/java/org/apache/skywalking/oap/server/core/alarm/provider/EventHookCallback.java`
#### Snippet
```java
                .setUuid(UUID.randomUUID().toString())
                .setName("Alarm")
                .setStartTime(now - (msg.getPeriod() * 60 * 1000))
                .setMessage(msg.getAlarmMessage())
                .setType(Type.Error)
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/query/MetricsQueryEsDAO.java`
#### Snippet
```java

        Optional<Documents> response = getClient().ids(indexIdsGroup);
        if (!response.isPresent()) {
            return heatMap;
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/Expression.java`
#### Snippet
```java
            SampleFamily sf = (SampleFamily) expression.run();
            if (sf == SampleFamily.EMPTY) {
                if (!ExpressionParsingContext.get().isPresent()) {
                    if (log.isDebugEnabled()) {
                        log.debug("result of {} is empty by \"{}\"", sampleFamilies, literal);
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/Expression.java`
#### Snippet
```java
                return sampleFamilies.get(metricName);
            }
            if (!ExpressionParsingContext.get().isPresent()) {
                log.warn("{} referred by \"{}\" doesn't exist in {}", metricName, literal, sampleFamilies.keySet());
            }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/k8s/K8sInfoRegistry.java`
#### Snippet
```java
                            .build());

                if (!pod.isPresent()
                    || pod.get().getMetadata() == null
                    || pod.get().getMetadata().getLabels() == null) {
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/k8s/K8sInfoRegistry.java`
#### Snippet
```java
                    })
                    .findFirst();
                if (!service.isPresent()) {
                    return ObjectID.EMPTY;
                }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `oap-server/server-receiver-plugin/envoy-metrics-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/envoy/als/k8s/K8SServiceRegistry.java`
#### Snippet
```java
            public ServiceMetaInfo load(String ip) throws Exception {
                final Optional<V1Pod> pod = KubernetesPods.INSTANCE.findByIP(ip);
                if (!pod.isPresent()) {
                    log.debug("No corresponding Pod for IP: {}", ip);
                    return config.serviceMetaInfoFactory().unknown();
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `oap-server/server-receiver-plugin/envoy-metrics-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/envoy/als/k8s/K8SServiceRegistry.java`
#### Snippet
```java
                        .filter(Objects::nonNull)
                        .findFirst();
                if (!serviceID.isPresent()) {
                    log.debug("No corresponding endpoint for IP: {}", ip);
                    return config.serviceMetaInfoFactory().unknown();
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `oap-server/server-receiver-plugin/envoy-metrics-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/envoy/als/k8s/K8SServiceRegistry.java`
#### Snippet
```java
                final Optional<V1Service> service =
                    KubernetesServices.INSTANCE.findByID(serviceID.get());
                if (!service.isPresent()) {
                    log.debug("No service for namespace and name: {}", serviceID.get());
                    return config.serviceMetaInfoFactory().unknown();
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `oap-server/exporter/src/main/java/org/apache/skywalking/oap/server/exporter/provider/kafka/trace/KafkaTraceExporter.java`
#### Snippet
```java
                        Bytes.wrap(segmentObject.toByteArray())
                    );
                    super.getProducer().send(record, (metadata, ex) -> {
                        if (ex != null) {
                            errorCounter.inc();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `oap-server/exporter/src/main/java/org/apache/skywalking/oap/server/exporter/provider/kafka/trace/KafkaTraceExporter.java`
#### Snippet
```java
    @Override
    public void start() {
        super.getProducer();
        exportBuffer = new DataCarrier<>(
            "KafkaTraceExporter", "KafkaTraceExporter", setting.getBufferChannelNum(), setting.getBufferChannelSize(),
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `oap-server/exporter/src/main/java/org/apache/skywalking/oap/server/exporter/provider/kafka/log/KafkaLogExporter.java`
#### Snippet
```java
                        Bytes.wrap(logData.toByteArray())
                    );
                    super.getProducer().send(record, (metadata, ex) -> {
                        if (ex != null) {
                            errorCounter.inc();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `oap-server/exporter/src/main/java/org/apache/skywalking/oap/server/exporter/provider/kafka/log/KafkaLogExporter.java`
#### Snippet
```java
    @Override
    public void start() {
        super.getProducer();
        exportBuffer = new DataCarrier<>(
            "KafkaLogExporter", "KafkaLogExporter", setting.getBufferChannelNum(), setting.getBufferChannelSize(),
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `oap-server/server-configuration/configuration-api/src/main/java/org/apache/skywalking/oap/server/configuration/api/GroupConfigChangeWatcher.java`
#### Snippet
```java
                                    final String itemName) {
        super(module, provider, itemName);
        super.watchType = WatchType.GROUP;
    }

```

## RuleId[id=SlowListContainsAll]
### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/query/MetadataQueryService.java`
#### Snippet
```java
        return CollectionUtils.isEmpty(processes) ?
                0L :
                processes.stream().filter(p -> p.getLabels().containsAll(labels)).count();
    }

```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `oap-server/server-cluster-plugin/cluster-kubernetes-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/kubernetes/KubernetesCoordinator.java`
#### Snippet
```java
    private void updateRemoteInstances() {
        List<String> updatedInstances = new ArrayList<>(this.remoteInstanceMap.keySet());
        if (this.latestInstances.size() != updatedInstances.size() || !this.latestInstances.containsAll(updatedInstances)) {
            List<RemoteInstance> remoteInstances = new ArrayList<>(this.remoteInstanceMap.values());
            this.latestInstances = updatedInstances;
```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `oap-server/server-receiver-plugin/skywalking-ebpf-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/ebpf/provider/handler/EBPFProfilingServiceHandler.java`
#### Snippet
```java
            }
            if (CollectionUtils.isEmpty(processLabels)
                    || process.getLabels().containsAll(processLabels)) {
                commands.add(commandService.newEBPFProfilingTaskCommand(task, Collections.singletonList(process.getId())));
            }
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`index = index + this.placeholderSuffix.length()` could be simplified to 'index += this.placeholderSuffix.length()'
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/PropertyPlaceholderHelper.java`
#### Snippet
```java
                if (withinNestedPlaceholder > 0) {
                    withinNestedPlaceholder--;
                    index = index + this.placeholderSuffix.length();
                } else {
                    return index;
```

### ReplaceAssignmentWithOperatorAssignment
`index = index + this.simplePrefix.length()` could be simplified to 'index += this.simplePrefix.length()'
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/PropertyPlaceholderHelper.java`
#### Snippet
```java
            } else if (StringUtil.substringMatch(buf, index, this.simplePrefix)) {
                withinNestedPlaceholder++;
                index = index + this.simplePrefix.length();
            } else {
                index++;
```

### ReplaceAssignmentWithOperatorAssignment
`this.value = this.value + m.value()` could be simplified to 'this.value += m.value()'
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/prometheus/metrics/Counter.java`
#### Snippet
```java

    @Override public Metric sum(Metric m) {
        this.value = this.value + m.value();
        return this;
    }
```

### ReplaceAssignmentWithOperatorAssignment
`this.sampleCount = this.sampleCount + s.getSampleCount()` could be simplified to 'this.sampleCount += s.getSampleCount()'
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/prometheus/metrics/Summary.java`
#### Snippet
```java
    @Override public Metric sum(Metric m) {
        Summary s = (Summary) m;
        this.sampleCount =  this.sampleCount + s.getSampleCount();
        this.sampleSum = this.sampleSum + s.getSampleSum();
        return this;
```

### ReplaceAssignmentWithOperatorAssignment
`this.sampleSum = this.sampleSum + s.getSampleSum()` could be simplified to 'this.sampleSum += s.getSampleSum()'
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/prometheus/metrics/Summary.java`
#### Snippet
```java
        Summary s = (Summary) m;
        this.sampleCount =  this.sampleCount + s.getSampleCount();
        this.sampleSum = this.sampleSum + s.getSampleSum();
        return this;
    }
```

### ReplaceAssignmentWithOperatorAssignment
`this.value = this.value + m.value()` could be simplified to 'this.value += m.value()'
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/prometheus/metrics/Gauge.java`
#### Snippet
```java

    @Override public Metric sum(Metric m) {
        this.value = this.value + m.value();
        return this;
    }
```

### ReplaceAssignmentWithOperatorAssignment
`this.sampleSum = this.sampleSum + h.sampleSum` could be simplified to 'this.sampleSum += h.sampleSum'
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/prometheus/metrics/Histogram.java`
#### Snippet
```java
        this.buckets = Stream.concat(getBuckets().entrySet().stream(), h.getBuckets().entrySet().stream())
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, Long::sum, TreeMap::new));
        this.sampleSum = this.sampleSum + h.sampleSum;
        this.sampleCount = this.sampleCount + h.sampleCount;
        return this;
```

### ReplaceAssignmentWithOperatorAssignment
`this.sampleCount = this.sampleCount + h.sampleCount` could be simplified to 'this.sampleCount += h.sampleCount'
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/prometheus/metrics/Histogram.java`
#### Snippet
```java
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, Long::sum, TreeMap::new));
        this.sampleSum = this.sampleSum + h.sampleSum;
        this.sampleCount = this.sampleCount + h.sampleCount;
        return this;
    }
```

### ReplaceAssignmentWithOperatorAssignment
`metricShardNum = metricShardNum * config.getSuperDatasetShardsFactor()` could be simplified to 'metricShardNum \*= config.getSuperDatasetShardsFactor()'
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/MetadataRegistry.java`
#### Snippet
```java
            blockIntervalHrs = config.getSuperDatasetBlockIntervalHours();
            segmentIntervalDays = config.getSuperDatasetSegmentIntervalDays();
            metricShardNum = metricShardNum * config.getSuperDatasetShardsFactor();
        } else {
            // Solution: 2 * TTL < T * (1 + 0.8)
```

## RuleId[id=InfiniteLoopStatement]
### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `oap-server/server-fetcher-plugin/kafka-fetcher-plugin/src/main/java/org/apache/skywalking/oap/server/analyzer/agent/kafka/KafkaFetcherHandlerRegister.java`
#### Snippet
```java

    private void runTask(final KafkaConsumer<String, Bytes> consumer) {
        while (true) {
            try {
                ConsumerRecords<String, Bytes> consumerRecords = consumer.poll(Duration.ofMillis(500L));
```

### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `oap-server/server-receiver-plugin/zipkin-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/zipkin/kafka/KafkaHandler.java`
#### Snippet
```java
            log.debug("Start Consume zipkin trace records from kafka.");
        }
        while (true) {
            try {
                ConsumerRecords<byte[], byte[]> consumerRecords = consumer.poll(Duration.ofMillis(1000L));
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `oap-server/server-tools/profile-exporter/tool-profile-snapshot-bootstrap/src/main/java/org/apache/skywalking/oap/server/tool/profile/exporter/ProfileSnapshotDumper.java`
#### Snippet
```java
            ThreadSnapshot snapshot;
            final ArrayList<ThreadSnapshot> data = new ArrayList<>();
            while ((snapshot = ThreadSnapshot.parseDelimitedFrom(fileInputStream)) != null) {
                ThreadSnapshot finalSnapshot = snapshot;
                if (queries.stream().anyMatch(t -> finalSnapshot.getTime() >= t.getTimeRange().getStart() && finalSnapshot.getTime() <= t.getTimeRange().getEnd())) {
```

### NestedAssignment
Result of assignment expression used
in `oap-server/server-tools/data-generator/src/main/java/org/apache/skywalking/generator/SequenceGenerator.java`
#### Snippet
```java
        }

        return last = next;
    }

```

### NestedAssignment
Result of assignment expression used
in `oap-server/analyzer/log-analyzer/src/main/java/org/apache/skywalking/oap/log/analyzer/dsl/Binding.java`
#### Snippet
```java
        public Object getAt(final String key) {
            Object result;
            if (matcher != null && (result = matcher.group(key)) != null) {
                return result;
            }
```

### NestedAssignment
Result of assignment expression used
in `oap-server/analyzer/log-analyzer/src/main/java/org/apache/skywalking/oap/log/analyzer/dsl/Binding.java`
#### Snippet
```java
                return result;
            }
            if (map != null && (result = map.get(key)) != null) {
                return result;
            }
```

### NestedAssignment
Result of assignment expression used
in `oap-server/analyzer/log-analyzer/src/main/java/org/apache/skywalking/oap/log/analyzer/dsl/Binding.java`
#### Snippet
```java
                return result;
            }
            if (extraLog != null && (result = getField(extraLog, key)) != null) {
                return result;
            }
```

### NestedAssignment
Result of assignment expression used
in `oap-server/analyzer/log-analyzer/src/main/java/org/apache/skywalking/oap/log/analyzer/dsl/Binding.java`
#### Snippet
```java
                return result;
            }
            if (log != null && (result = getField(log, key)) != null) {
                return result;
            }
```

### NestedAssignment
Result of assignment expression used
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/MultipleFilesChangeMonitor.java`
#### Snippet
```java
                        ByteArrayOutputStream os = new ByteArrayOutputStream();
                        int c;
                        while ((c = fileInputStream.read(b)) != -1) {
                            os.write(b, 0, c);
                        }
```

### NestedAssignment
Result of assignment expression used
in `oap-server/server-receiver-plugin/aws-firehose-receiver/src/main/java/org/apache/skywalking/oap/server/receiver/aws/firehose/FirehoseHTTPHandler.java`
#### Snippet
```java
                    Base64.getDecoder().decode(record.getData()));
                ExportMetricsServiceRequest request;
                while ((request = ExportMetricsServiceRequest.parseDelimitedFrom(byteArrayInputStream)) != null) {
                    openTelemetryMetricRequestProcessor.processMetricsRequest(
                        OtelMetricsConvertor.convertExportMetricsRequest(request));
```

### NestedAssignment
Result of assignment expression used
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/storage/model/ColumnName.java`
#### Snippet
```java

    public ColumnName(Column column) {
        storageName = name = column.name();
    }

```

### NestedAssignment
Result of assignment expression used
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/EBPFProfilingMutationService.java`
#### Snippet
```java
            }

            if (StringUtil.isNotEmpty(error = validateSingleSampleRule(rule))) {
                return error;
            }
```

### NestedAssignment
Result of assignment expression used
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/EBPFProfilingMutationService.java`
#### Snippet
```java
        }

        if (StringUtil.isNotEmpty(err = validateSamplingRules(request.getSamplings()))) {
            return err;
        }
```

### NestedAssignment
Result of assignment expression used
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCEBPFProfilingTaskDAO.java`
#### Snippet
```java
        List<EBPFProfilingTaskRecord> tasks = new ArrayList<>();
        StorageData data;
        while ((data = toStorageData(resultSet, EBPFProfilingTaskRecord.INDEX_NAME, new EBPFProfilingTaskRecord.Builder())) != null) {
            tasks.add((EBPFProfilingTaskRecord) data);
        }
```

### NestedAssignment
Result of assignment expression used
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCSQLExecutor.java`
#### Snippet
```java
            h2Client.executeQuery(sql.toString(), resultSet -> {
                StorageData storageData;
                while ((storageData = toStorageData(resultSet, modelName, storageBuilder)) != null) {
                    storageDataList.add(storageData);
                }
```

### NestedAssignment
Result of assignment expression used
in `oap-server/oal-rt/src/main/java/org/apache/skywalking/oal/rt/parser/OALListener.java`
#### Snippet
```java
        source = firstLetterUpper(source);
        int idx;
        while ((idx = source.indexOf("_")) > -1) {
            source = source.substring(0, idx) + firstLetterUpper(source.substring(idx + 1));
        }
```

### NestedAssignment
Result of assignment expression used
in `oap-server/microbench/src/main/java/org/apache/skywalking/oap/server/microbench/core/profiling/ebpf/EBPFProfilingAnalyzerBenchmark.java`
#### Snippet
```java
            List<String> symbols = existingSymbolMap.get(depth);
            if (symbols == null) {
                existingSymbolMap.put(depth, symbols = new ArrayList<>());
            }
            final Integer needCount = this.stackDepthSymbolCount.get(depth);
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/MultipleFilesChangeMonitor.java`
#### Snippet
```java
        if (isChanged) {
            List<byte[]> contents = new ArrayList<>(watchedFiles.size());
            watchedFiles.forEach(file -> {
                contents.add(file.fileContent);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/cache/NetworkAddressAliasCache.java`
#### Snippet
```java

    void load(List<NetworkAddressAlias> networkAddressAliasList) {
        networkAddressAliasList.forEach(networkAddressAlias -> {
            networkAddressAliasCache.put(networkAddressAlias.getAddress(), networkAddressAlias);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/query/type/HeatMap.java`
#### Snippet
```java
        HeatMapColumn column = new HeatMapColumn();
        column.setId(id);
        buckets.forEach(bucket -> {
            column.addValue((long) defaultValue);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/config/ComponentLibraryCatalogService.java`
#### Snippet
```java
                Map settings = (Map) settingCollection;
                if (COMPONENT_SERVER_MAPPING_SECTION.equals(componentName)) {
                    settings.forEach((name, serverName) -> {
                        nameMapping.put((String) name, (String) serverName);
                    });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/config/group/openapi/EndpointGroupingRule4Openapi.java`
#### Snippet
```java
        Map<String, StringFormatGroup> rules = groupedRules.get(serviceName);
        if (rules != null) {
            rules.entrySet().forEach(stringFormatGroup -> {
                stringFormatGroup.getValue()
                                 .sortRules(new EndpointGroupingRule4Openapi.EndpointGroupingRulesComparator());
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/config/group/openapi/EndpointGroupingRule4Openapi.java`
#### Snippet
```java

    void sortRulesAll() {
        groupedRules.entrySet().forEach(rules -> {
            sortRulesByService(rules.getKey());
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/config/group/openapi/EndpointGroupingRuleReader4Openapi.java`
#### Snippet
```java
    public EndpointGroupingRule4Openapi read() {
        EndpointGroupingRule4Openapi endpointGroupingRule = new EndpointGroupingRule4Openapi();
        serviceOpenapiDefMap.forEach((serviceName, openapiDefs) -> {
            openapiDefs.forEach(openapiData -> {
                LinkedHashMap<String, LinkedHashMap<String, LinkedHashMap>> paths =
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/config/group/openapi/EndpointGroupingRuleReader4Openapi.java`
#### Snippet
```java
                        "paths");
                if (paths != null) {
                    paths.forEach((pathString, pathItem) -> {
                        pathItem.keySet().forEach(key -> {
                            String requestMethod = requestMethodsMap.get(key);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/storage/PersistenceTimer.java`
#### Snippet
```java
        final CompletableFuture<Void> future =
            CompletableFuture.allOf(workers.stream().map(worker -> {
                return CompletableFuture.runAsync(() -> {
                    List<PrepareRequest> innerPrepareRequests;
                    // Prepare stage
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/storage/query/IMetricsQueryDAO.java`
#### Snippet
```java
            IntValues intValues = new IntValues();

            expectedOrder.forEach(id -> {
                intValues.addKVInt(origin.findValue(id, defaultValue));
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/storage/model/StorageModels.java`
#### Snippet
```java
        for (ModelColumn modelColumn : modelColumns) {
            if (modelColumn.getColumnName().getName().equals(extraColumn)) {
                additionalTables.forEach(tableName -> {
                    sqlDBModelExtension.appendAdditionalTable(tableName, modelColumn);
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/storage/model/StorageModels.java`
#### Snippet
```java
                }

                indexDefinitions.forEach(indexDefinition -> {
                    sqlDatabaseExtension.appendIndex(new SQLDatabaseExtension.MultiColumnsIndex(
                        column.name(),
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/storage/model/StorageModels.java`
#### Snippet
```java

    private void followColumnNameRules(Model model) {
        columnNameOverrideRule.forEach((oldName, newName) -> {
            model.getColumns().forEach(column -> {
                log.debug("Override model column name: [{}] {} -> {}.", model.getName(), oldName, newName);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/command/CommandService.java`
#### Snippet
```java
        EBPFProfilingTaskExtensionConfig config = new EBPFProfilingTaskExtensionConfig();
        config.setNetworkSamplings(extensionConfig.getNetworkSamplings().stream().map(s -> {
            return EBPFProfilingTaskExtensionConfig.NetworkSamplingRule.builder()
                    .uriRegex(s.getUriRegex())
                    .minDuration(s.getMinDuration())
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/worker/MetricsAggregateWorker.java`
#### Snippet
```java
        if (currentTime - lastSendTime > l1FlushPeriod) {
            mergeDataCache.read().forEach(
                data -> {
                    nextWorker.in(data);
                }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-receiver-plugin/skywalking-sharing-server-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/sharing/server/ReceiverGRPCHandlerRegister.java`
#### Snippet
```java
            grpcHandlerRegister.addHandler(handler);
        } else {
            interceptors.forEach(interceptor -> {
                grpcHandlerRegister.addHandler(handlerInterceptorBind(handler, interceptor));
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-configuration/grpc-configuration-sync/src/main/java/org/apache/skywalking/oap/server/configuration/grpc/GRPCConfigWatcherRegister.java`
#### Snippet
```java
                        groupName);
                    groupConfigTable.addGroupConfigItems(groupConfigItems);
                    rspGroupConfigItems.getItemsList().forEach(item -> {
                        groupConfigItems.add(new ConfigTable.ConfigItem(item.getName(), item.getValue()));
                    });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-library/library-elasticsearch-client/src/main/java/org/apache/skywalking/library/elasticsearch/requests/factory/v6/V6DocumentFactory.java`
#### Snippet
```java
        indexIds.forEach((index, ids) -> {
            checkArgument(ids != null && !isEmpty(ids), "ids cannot be null or empty");
            ids.forEach(id -> {
                indexIdList.add(ImmutableMap.of("_index", index, "_type", type, "_id", id));
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-library/library-elasticsearch-client/src/main/java/org/apache/skywalking/library/elasticsearch/requests/factory/v7plus/V7DocumentFactory.java`
#### Snippet
```java
        indexIds.forEach((index, ids) -> {
            checkArgument(ids != null && !isEmpty(ids), "ids cannot be null or empty");
            ids.forEach(id -> {
                indexIdList.add(ImmutableMap.of("_index", index, "_id", id));
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCSQLExecutor.java`
#### Snippet
```java
        //build main table sql
        Map<String, Object> mainEntity = new HashMap<>();
        model.getColumns().forEach(column -> {
            mainEntity.put(column.getColumnName().getName(), objectMap.get(column.getColumnName().getName()));
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCSQLExecutor.java`
#### Snippet
```java
        for (final var additionalTable : model.getSqlDBModelExtension().getAdditionalTables().values()) {
            Map<String, Object> additionalEntity = new HashMap<>();
            additionalTable.getColumns().forEach(column -> {
                additionalEntity.put(column.getColumnName().getName(), objectMap.get(column.getColumnName().getName()));
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-receiver-plugin/skywalking-jvm-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/jvm/provider/handler/JVMMetricReportServiceHandler.java`
#### Snippet
```java
        builder.setServiceInstance(namingControl.formatInstanceName(builder.getServiceInstance()));

        builder.getMetricsList().forEach(jvmMetric -> {
            jvmSourceDispatcher.sendMetric(builder.getService(), builder.getServiceInstance(), jvmMetric);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/oal-rt/src/main/java/org/apache/skywalking/oal/rt/OALRuntime.java`
#### Snippet
```java
        }

        oalScripts.getDisableCollection().getAllDisableSources().forEach(disable -> {
            DisableRegister.INSTANCE.add(disable);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/entity/LabelName.java`
#### Snippet
```java

    static {
        Arrays.stream(LabelName.values()).forEach(l -> {
            DICTIONARY.put(l.label, l);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/handler/PromQLApiHandler.java`
#### Snippet
```java
            }
        } else {
            Arrays.stream(LabelName.values()).forEach(label -> {
                response.getData().add(label);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/handler/PromQLApiHandler.java`
#### Snippet
```java
                List<Service> services = metadataQuery.listServices(
                    parseResult.getLabelMap().get(LabelName.LAYER));
                services.forEach(service -> {
                    response.getData().add(buildMetricInfoFromTraffic(metricName, service));
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/handler/PromQLApiHandler.java`
#### Snippet
```java
            List<ServiceInstance> instances = metadataQuery.listInstances(
                duration, IDManager.ServiceID.buildId(serviceName, Layer.valueOf(layer).isNormal()));
            instances.forEach(instance -> {
                response.getData().add(buildMetricInfoFromTraffic(metricName, instance));
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/handler/PromQLApiHandler.java`
#### Snippet
```java
                Integer.parseInt(limit)
            );
            endpoints.forEach(endpoint -> {
                response.getData().add(buildMetricInfoFromTraffic(metricName, endpoint));
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/handler/PromQLApiHandler.java`
#### Snippet
```java
        switch (LabelName.labelOf(labelName)) {
            case NAME:
                metricsQuery.listMetrics("").forEach(definition -> {
                    response.getData().add(definition.getName());
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-receiver-plugin/envoy-metrics-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/envoy/als/LogEntry2MetricsAdapter.java`
#### Snippet
```java
            .ofNullable(sourceService)
            .map(ServiceMetaInfo::getTags)
            .ifPresent(tags -> {
                tags.forEach(p -> {
                    builder.addSourceInstanceProperties(
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-receiver-plugin/envoy-metrics-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/envoy/als/LogEntry2MetricsAdapter.java`
#### Snippet
```java
            .map(ServiceMetaInfo::getTags)
            .ifPresent(tags -> {
                tags.forEach(p -> {
                    builder.addSourceInstanceProperties(
                        KeyStringValuePair.newBuilder().setKey(p.getKey()).setValue(p.getValue()));
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-receiver-plugin/envoy-metrics-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/envoy/als/LogEntry2MetricsAdapter.java`
#### Snippet
```java
            .ofNullable(targetService)
            .map(ServiceMetaInfo::getTags)
            .ifPresent(tags -> {
                tags.forEach(p -> {
                    builder.addDestInstanceProperties(
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-receiver-plugin/envoy-metrics-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/envoy/als/LogEntry2MetricsAdapter.java`
#### Snippet
```java
            .map(ServiceMetaInfo::getTags)
            .ifPresent(tags -> {
                tags.forEach(p -> {
                    builder.addDestInstanceProperties(
                        KeyStringValuePair.newBuilder().setKey(p.getKey()).setValue(p.getValue()));
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-receiver-plugin/envoy-metrics-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/envoy/als/tcp/TCPLogEntry2MetricsAdapter.java`
#### Snippet
```java
            .ofNullable(sourceService)
            .map(ServiceMetaInfo::getTags)
            .ifPresent(tags -> {
                tags.forEach(p -> {
                    builder.addSourceInstanceProperties(
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-receiver-plugin/envoy-metrics-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/envoy/als/tcp/TCPLogEntry2MetricsAdapter.java`
#### Snippet
```java
            .map(ServiceMetaInfo::getTags)
            .ifPresent(tags -> {
                tags.forEach(p -> {
                    builder.addSourceInstanceProperties(
                        KeyStringValuePair.newBuilder().setKey(p.getKey()).setValue(p.getValue()));
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-receiver-plugin/envoy-metrics-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/envoy/als/tcp/TCPLogEntry2MetricsAdapter.java`
#### Snippet
```java
            .ofNullable(targetService)
            .map(ServiceMetaInfo::getTags)
            .ifPresent(tags -> {
                tags.forEach(p -> {
                    builder.addDestInstanceProperties(
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-receiver-plugin/envoy-metrics-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/envoy/als/tcp/TCPLogEntry2MetricsAdapter.java`
#### Snippet
```java
            .map(ServiceMetaInfo::getTags)
            .ifPresent(tags -> {
                tags.forEach(p -> {
                    builder.addDestInstanceProperties(
                        KeyStringValuePair.newBuilder().setKey(p.getKey()).setValue(p.getValue()));
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-alarm-plugin/src/main/java/org/apache/skywalking/oap/server/core/alarm/provider/RulesReader.java`
#### Snippet
```java
        if (webhooks != null) {
            rules.setWebhooks(new ArrayList<>());
            webhooks.forEach(url -> {
                rules.getWebhooks().add((String) url);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `oap-server/server-library/library-client/src/main/java/org/apache/skywalking/oap/server/library/client/elasticsearch/ElasticSearchClient.java`
#### Snippet
```java
    public Optional<Documents> ids(Map<String, List<String>> indexIds) {
        Map<String, List<String>> map = new HashMap<>();
        indexIds.forEach((indexName, ids) -> {
            map.put(indexNameConverter.apply(indexName), ids);
        });
```

## RuleId[id=Lombok]
### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `oap-server/server-fetcher-plugin/kafka-fetcher-plugin/src/main/java/org/apache/skywalking/oap/server/analyzer/agent/kafka/module/KafkaFetcherConfig.java`
#### Snippet
```java
import java.util.Properties;

@Data
public class KafkaFetcherConfig extends ModuleConfig {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `oap-server/server-cluster-plugin/cluster-etcd-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/etcd/ClusterModuleEtcdConfig.java`
#### Snippet
```java
import org.apache.skywalking.oap.server.library.module.ModuleConfig;

@Data
public class ClusterModuleEtcdConfig extends ModuleConfig {
    private String serviceName;
```

### Lombok
Not generated 'setErrorCategory'(): A method with similar name 'setErrorCategory' already exists
in `oap-server/server-receiver-plugin/skywalking-browser-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/browser/provider/parser/errorlog/listener/SourceBuilder.java`
#### Snippet
```java
    private BrowserAppTrafficCategory trafficCategory;

    @Setter
    @Getter
    private BrowserErrorCategory errorCategory;
```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/source/EBPFProfilingData.java`
#### Snippet
```java
import static org.apache.skywalking.oap.server.core.source.DefaultScopeDefine.EBPF_PROFILING_DATA;

@Data
@ScopeDeclaration(id = EBPF_PROFILING_DATA, name = "EBPFProfilingData")
@ScopeDefaultColumn.VirtualColumnDefinition(fieldName = "entityId", columnName = "entity_id", isID = true, type = String.class)
```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/zipkin/ZipkinServiceSpanTraffic.java`
#### Snippet
```java
    builder = ZipkinServiceSpanTraffic.Builder.class, processor = MetricsStreamProcessor.class)
@MetricsExtension(supportDownSampling = false, supportUpdate = false)
@EqualsAndHashCode(of = {
    "serviceName",
    "spanName"
})
public class ZipkinServiceSpanTraffic extends Metrics {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/zipkin/ZipkinServiceTraffic.java`
#### Snippet
```java
    builder = ZipkinServiceTraffic.Builder.class, processor = MetricsStreamProcessor.class)
@MetricsExtension(supportDownSampling = false, supportUpdate = false)
@EqualsAndHashCode(of = {
    "serviceName"
})
public class ZipkinServiceTraffic extends Metrics {
    public static final String INDEX_NAME = "zipkin_service_traffic";
```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/zipkin/ZipkinServiceRelationTraffic.java`
#### Snippet
```java
    builder = ZipkinServiceRelationTraffic.Builder.class, processor = MetricsStreamProcessor.class)
@MetricsExtension(supportDownSampling = false, supportUpdate = false)
@EqualsAndHashCode(of = {
    "serviceName",
    "remoteServiceName"
})
public class ZipkinServiceRelationTraffic extends Metrics {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/process/ServiceLabelRecord.java`
#### Snippet
```java
        builder = ServiceLabelRecord.Builder.class, processor = MetricsStreamProcessor.class)
@MetricsExtension(supportDownSampling = false, supportUpdate = false, timeRelativeID = false)
@EqualsAndHashCode(of = {
        "serviceId",
        "label"
})
public class ServiceLabelRecord extends Metrics {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/endpoint/EndpointTraffic.java`
#### Snippet
```java
    builder = EndpointTraffic.Builder.class, processor = MetricsStreamProcessor.class)
@MetricsExtension(supportDownSampling = false, supportUpdate = false)
@EqualsAndHashCode
public class EndpointTraffic extends Metrics {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/process/ProcessTraffic.java`
#### Snippet
```java
    builder = ProcessTraffic.Builder.class, processor = MetricsStreamProcessor.class)
@MetricsExtension(supportDownSampling = false, supportUpdate = true)
@EqualsAndHashCode(of = {
    "instanceId",
    "name",
})
@BanyanDB.StoreIDAsTag
public class ProcessTraffic extends Metrics {
```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/service/ServiceTraffic.java`
#### Snippet
```java
    builder = ServiceTraffic.Builder.class, processor = MetricsStreamProcessor.class)
@MetricsExtension(supportDownSampling = false, supportUpdate = false)
@EqualsAndHashCode(of = {
    "name",
    "layer"
})
public class ServiceTraffic extends Metrics {
    public static final String INDEX_NAME = "service_traffic";
```

### Lombok
The field 'component_id' does not exist
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/relation/process/ProcessRelationClientSideMetrics.java`
#### Snippet
```java
    builder = ProcessRelationClientSideMetrics.Builder.class, processor = MetricsStreamProcessor.class)
@MetricsExtension(supportDownSampling = false, supportUpdate = true, timeRelativeID = true)
@EqualsAndHashCode(of = {
    "entityId",
    "component_id"
}, callSuper = true)
public class ProcessRelationClientSideMetrics extends Metrics {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/instance/InstanceTraffic.java`
#### Snippet
```java
    builder = InstanceTraffic.Builder.class, processor = MetricsStreamProcessor.class)
@MetricsExtension(supportDownSampling = false, supportUpdate = true)
@EqualsAndHashCode(of = {
    "serviceId",
    "name"
})
public class InstanceTraffic extends Metrics {
    public static final String INDEX_NAME = "instance_traffic";
```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/searchtag/TagAutocompleteData.java`
#### Snippet
```java
// to make this tag tip feature doesn't host too large scale data.
@MetricsExtension(supportDownSampling = false, supportUpdate = false, timeRelativeID = false)
@EqualsAndHashCode(of = {
    "tagKey",
    "tagValue",
    "tagType"
})
public class TagAutocompleteData extends Metrics {
    public static final String INDEX_NAME = "tag_autocomplete";
```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/networkalias/NetworkAddressAlias.java`
#### Snippet
```java
    builder = NetworkAddressAlias.Builder.class, processor = MetricsStreamProcessor.class)
@MetricsExtension(supportDownSampling = false, supportUpdate = true)
@EqualsAndHashCode(of = {
    "address"
})
public class NetworkAddressAlias extends Metrics {
    public static final String INDEX_NAME = "network_address_alias";
```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/metrics/Metrics.java`
#### Snippet
```java
 * TTL(time to live).
 */
@EqualsAndHashCode(of = {
    "timeBucket"
})
public abstract class Metrics extends StreamData implements StorageData {
    public static final String ENTITY_ID = "entity_id";
```

### Lombok
Not generated 'getValue'(): A method with similar name 'getValue' already exists
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/metrics/ApdexMetrics.java`
#### Snippet
```java
    @BanyanDB.MeasureField
    private long tNum;
    @Getter
    @Setter
    @Column(name = VALUE, dataType = Column.ValueDataType.COMMON_VALUE, function = Function.Avg)
```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/storage/EBPFProfilingTaskRecord.java`
#### Snippet
```java
 * eBPF Profiling Task is the user create it from the UI side
 */
@Data
@ScopeDeclaration(id = EBPF_PROFILING_TASK, name = "EBPFProfilingTask")
@Stream(name = EBPFProfilingTaskRecord.INDEX_NAME, scopeId = EBPF_PROFILING_TASK,
```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/storage/EBPFProfilingDataRecord.java`
#### Snippet
```java
 * eBPF profiling reported data from the eBPF agent side
 */
@Data
@Stream(name = EBPFProfilingDataRecord.INDEX_NAME, scopeId = EBPF_PROFILING_DATA,
    builder = EBPFProfilingDataRecord.Builder.class, processor = RecordStreamProcessor.class)
```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/storage/EBPFProfilingScheduleRecord.java`
#### Snippet
```java
    builder = EBPFProfilingScheduleRecord.Builder.class, processor = MetricsStreamProcessor.class)
@MetricsExtension(supportDownSampling = false, supportUpdate = true)
@EqualsAndHashCode(of = {
    "taskId",
    "processId",
    "startTime",
})
public class EBPFProfilingScheduleRecord extends Metrics {

```

### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/entity/MetricRangeData.java`
#### Snippet
```java
import lombok.Data;

@Data
public class MetricRangeData extends MetricData {
    private List<TimeValuePair> values;
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `list` are updated, but never queried
in `oap-server/microbench/src/main/java/org/apache/skywalking/oap/server/microbench/library/datacarrier/LinkedArrayBenchmark.java`
#### Snippet
```java
    @Benchmark
    public void testReusedLinked200K() {
        LinkedList<SampleData> list = new LinkedList<SampleData>();
        for (int times = 0; times < 1000; times++) {
            for (int pos = 0; pos < 200000; pos++) {
```

### MismatchedCollectionQueryUpdate
Contents of collection `consumerList` are updated, but never queried
in `oap-server/microbench/src/main/java/org/apache/skywalking/oap/server/microbench/library/datacarrier/LinkedArrayBenchmark.java`
#### Snippet
```java
    public void testLinked() {
        for (int times = 0; times < 1000; times++) {
            List<SampleData> consumerList = new LinkedList<SampleData>();

            for (int pos = 0; pos < 40000; pos++) {
```

### MismatchedCollectionQueryUpdate
Contents of collection `consumerList` are updated, but never queried
in `oap-server/microbench/src/main/java/org/apache/skywalking/oap/server/microbench/library/datacarrier/LinkedArrayBenchmark.java`
#### Snippet
```java
    @Benchmark
    public void testArrayStart40000() {
        List<SampleData> consumerList = new ArrayList<SampleData>(40000);
        for (int pos = 0; pos < 40000; pos++) {
            consumerList.add(new SampleData());
```

### MismatchedCollectionQueryUpdate
Contents of collection `consumerList` are updated, but never queried
in `oap-server/microbench/src/main/java/org/apache/skywalking/oap/server/microbench/library/datacarrier/LinkedArrayBenchmark.java`
#### Snippet
```java
    @Benchmark
    public void testReusedArray() {
        List<SampleData> consumerList = new ArrayList<SampleData>();
        for (int times = 0; times < 1000; times++) {
            for (int pos = 0; pos < 40000; pos++) {
```

### MismatchedCollectionQueryUpdate
Contents of collection `consumerList` are updated, but never queried
in `oap-server/microbench/src/main/java/org/apache/skywalking/oap/server/microbench/library/datacarrier/LinkedArrayBenchmark.java`
#### Snippet
```java
    @Benchmark
    public void testArrayStart8000() {
        List<SampleData> consumerList = new ArrayList<SampleData>(8000);
        for (int pos = 0; pos < 40000; pos++) {
            consumerList.add(new SampleData());
```

### MismatchedCollectionQueryUpdate
Contents of collection `list` are updated, but never queried
in `oap-server/microbench/src/main/java/org/apache/skywalking/oap/server/microbench/library/datacarrier/LinkedArrayBenchmark.java`
#### Snippet
```java
    public void testLinked200K() {
        for (int times = 0; times < 1000; times++) {
            LinkedList<SampleData> list = new LinkedList<SampleData>();
            for (int pos = 0; pos < 200000; pos++) {
                list.add(new SampleData());
```

### MismatchedCollectionQueryUpdate
Contents of collection `list` are updated, but never queried
in `oap-server/microbench/src/main/java/org/apache/skywalking/oap/server/microbench/library/datacarrier/LinkedArrayBenchmark.java`
#### Snippet
```java
    @Benchmark
    public void testLinkedCap1000() {
        LinkedList<SampleData> list = new LinkedList<SampleData>();
        for (int i = 0; i < 1000; i++) {
            list.add(new SampleData());
```

### MismatchedCollectionQueryUpdate
Contents of collection `list` are updated, but never queried
in `oap-server/microbench/src/main/java/org/apache/skywalking/oap/server/microbench/library/datacarrier/LinkedArrayBenchmark.java`
#### Snippet
```java
    @Benchmark
    public void testArrayCap40000() {
        ArrayList<SampleData> list = new ArrayList<SampleData>();
        for (int i = 0; i < 40000; i++) {
            list.add(new SampleData());
```

### MismatchedCollectionQueryUpdate
Contents of collection `list` are updated, but never queried
in `oap-server/microbench/src/main/java/org/apache/skywalking/oap/server/microbench/library/datacarrier/LinkedArrayBenchmark.java`
#### Snippet
```java
    @Benchmark
    public void testLinkedCap40000() {
        LinkedList<SampleData> list = new LinkedList<SampleData>();
        for (int i = 0; i < 40000; i++) {
            list.add(new SampleData());
```

### MismatchedCollectionQueryUpdate
Contents of collection `consumerList` are updated, but never queried
in `oap-server/microbench/src/main/java/org/apache/skywalking/oap/server/microbench/library/datacarrier/LinkedArrayBenchmark.java`
#### Snippet
```java
    @Benchmark
    public void testArrayStart10() {
        List<SampleData> consumerList = new ArrayList<SampleData>(10);
        for (int pos = 0; pos < 40000; pos++) {
            consumerList.add(new SampleData());
```

### MismatchedCollectionQueryUpdate
Contents of collection `list` are updated, but never queried
in `oap-server/microbench/src/main/java/org/apache/skywalking/oap/server/microbench/library/datacarrier/LinkedArrayBenchmark.java`
#### Snippet
```java
    @Benchmark
    public void testArrayCap1000() {
        ArrayList<SampleData> list = new ArrayList<SampleData>();
        for (int i = 0; i < 1000; i++) {
            list.add(new SampleData());
```

### MismatchedCollectionQueryUpdate
Contents of collection `list` are updated, but never queried
in `oap-server/microbench/src/main/java/org/apache/skywalking/oap/server/microbench/library/datacarrier/LinkedArrayBenchmark.java`
#### Snippet
```java
    @Benchmark
    public void testArrayList200K() {
        ArrayList<SampleData> list = new ArrayList<SampleData>(4000);
        for (int times = 0; times < 1000; times++) {
            for (int pos = 0; pos < 200000; pos++) {
```

### MismatchedCollectionQueryUpdate
Contents of collection `consumerList` are updated, but never queried
in `oap-server/microbench/src/main/java/org/apache/skywalking/oap/server/microbench/library/datacarrier/LinkedArrayBenchmark.java`
#### Snippet
```java
    @Benchmark
    public void testReusedLinked() {
        List<SampleData> consumerList = new LinkedList<SampleData>();
        for (int times = 0; times < 1000; times++) {

```

### MismatchedCollectionQueryUpdate
Contents of collection `consumerList` are updated, but never queried
in `oap-server/microbench/src/main/java/org/apache/skywalking/oap/server/microbench/library/datacarrier/LinkedArrayBenchmark.java`
#### Snippet
```java
    @Benchmark
    public void testArrayStart1() {
        List<SampleData> consumerList = new ArrayList<SampleData>(1);
        for (int pos = 0; pos < 40000; pos++) {
            consumerList.add(new SampleData());
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `workerInstanceGetter` is accessed in both synchronized and unsynchronized contexts
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/remote/RemoteServiceHandler.java`
#### Snippet
```java

    private final ModuleDefineHolder moduleDefineHolder;
    private IWorkerInstanceGetter workerInstanceGetter;
    private CounterMetrics remoteInCounter;
    private CounterMetrics remoteInErrorCounter;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `carrier` is accessed in both synchronized and unsynchronized contexts
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/remote/client/GRPCRemoteClient.java`
#### Snippet
```java
    private SslContext sslContext;
    private GRPCClient client;
    private DataCarrier<RemoteMessage> carrier;
    private boolean isConnect;
    private CounterMetrics remoteOutCounter;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `client` is accessed in both synchronized and unsynchronized contexts
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/remote/client/GRPCRemoteClient.java`
#### Snippet
```java
    private final AtomicInteger concurrentStreamObserverNumber = new AtomicInteger(0);
    private SslContext sslContext;
    private GRPCClient client;
    private DataCarrier<RemoteMessage> carrier;
    private boolean isConnect;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `rawConfig` is accessed in both synchronized and unsynchronized contexts
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/ApdexThresholdConfig.java`
#### Snippet
```java
    private Map<String, Integer> dictionary = Collections.emptyMap();

    private String rawConfig = null;

    public ApdexThresholdConfig(final CoreModuleProvider provider) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `meterPrototypes` is accessed in both synchronized and unsynchronized contexts
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/meter/MeterSystem.java`
#### Snippet
```java
     * Object#clone()} in the runtime;
     */
    private Map<String, MeterDefinition> meterPrototypes = new HashMap<>();

    public MeterSystem(final ModuleManager manager) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `ALL_METRICS` is accessed in both synchronized and unsynchronized contexts
in `oap-server/server-telemetry/telemetry-prometheus/src/main/java/org/apache/skywalking/oap/server/telemetry/prometheus/BaseMetrics.java`
#### Snippet
```java
 */
public abstract class BaseMetrics<T extends SimpleCollector, C> {
    private static Map<String, Object> ALL_METRICS = new HashMap<>();

    private volatile C metricsInstance;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `factory` is accessed in both synchronized and unsynchronized contexts
in `oap-server/server-cluster-plugin/cluster-kubernetes-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/kubernetes/NamespacedPodListInformer.java`
#### Snippet
```java
    private Lister<V1Pod> podLister;

    private SharedInformerFactory factory;

    private final ExecutorService executorService = Executors.newSingleThreadExecutor(r -> {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `podLister` is accessed in both synchronized and unsynchronized contexts
in `oap-server/server-cluster-plugin/cluster-kubernetes-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/kubernetes/NamespacedPodListInformer.java`
#### Snippet
```java
    INFORMER;

    private Lister<V1Pod> podLister;

    private SharedInformerFactory factory;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `allConsumers` is accessed in both synchronized and unsynchronized contexts
in `oap-server/server-library/library-datacarrier-queue/src/main/java/org/apache/skywalking/oap/server/library/datacarrier/consumer/BulkConsumePool.java`
#### Snippet
```java
 */
public class BulkConsumePool implements ConsumerPool {
    private List<MultipleChannelsConsumer> allConsumers;
    private volatile boolean isStarted = false;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `streamBulkWriteProcessor` is accessed in both synchronized and unsynchronized contexts
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/BanyanDBBatchDAO.java`
#### Snippet
```java
    private static final Object STREAM_SYNCHRONIZER = new Object();
    private static final Object MEASURE_SYNCHRONIZER = new Object();
    private StreamBulkWriteProcessor streamBulkWriteProcessor;

    private MeasureBulkWriteProcessor measureBulkWriteProcessor;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `measureBulkWriteProcessor` is accessed in both synchronized and unsynchronized contexts
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/BanyanDBBatchDAO.java`
#### Snippet
```java
    private StreamBulkWriteProcessor streamBulkWriteProcessor;

    private MeasureBulkWriteProcessor measureBulkWriteProcessor;

    private final int maxBulkSize;
```

## RuleId[id=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `oap-server/server-library/library-module/src/main/java/org/apache/skywalking/oap/server/library/module/ModuleDefine.java`
#### Snippet
```java
                Field field = getDeclaredField(destClass, propertyName);
                field.setAccessible(true);
                field.set(dest, src.get(propertyName));
            } catch (NoSuchFieldException e) {
                LOGGER.warn(
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `oap-server/server-starter/src/main/java/org/apache/skywalking/oap/server/starter/config/ApplicationConfigLoader.java`
#### Snippet
```java
            return;
        }
        Object originValue = providerSettings.get(settingKey);
        Class<?> type = originValue.getClass();
        if (type.equals(int.class) || type.equals(Integer.class))
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `oap-server/oal-rt/src/main/java/org/apache/skywalking/oal/rt/parser/OALListener.java`
#### Snippet
```java

    @Override
    public void enterVariable(OALParser.VariableContext ctx) {
    }

```

### EmptyMethod
The method is empty
in `oap-server/oal-rt/src/main/java/org/apache/skywalking/oal/rt/parser/ScriptParser.java`
#### Snippet
```java
    }

    public void close() {
    }
}
```

### EmptyMethod
The method is empty
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCMetricsQueryDAO.java`
#### Snippet
```java
    }

    protected void buildShardingCondition(StringBuilder sql, List<String> parameters, String entityId) {
    }
}
```

### EmptyMethod
The method is empty
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCZipkinQueryDAO.java`
#### Snippet
```java
    }

    protected void buildShardingCondition(StringBuilder sql, List<Object> parameters, long startTimeMillis, long endTimeMillis) {
    }
}
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/StorageModuleElasticsearchConfig.java`
#### Snippet
```java
     * @since 8.2.0, the replicas number is for super size dataset record replicas number
     */
    private int superDatasetIndexReplicasNumber = 0;
    private int superDatasetIndexShardsFactor = 5;
    private int indexRefreshInterval = 2;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/StorageModuleElasticsearchConfig.java`
#### Snippet
```java
     * @since 9.2.0
     */
    private boolean logicSharding = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/StorageModuleElasticsearchConfig.java`
#### Snippet
```java
     * @since 8.7.0 The order of index template.
     */
    private int indexTemplateOrder = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/StorageModuleElasticsearchConfig.java`
#### Snippet
```java
     */
    private int dayStep = 1;
    private int indexReplicasNumber = 0;
    private int indexShardsNumber = 1;
    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/StorageModuleElasticsearchConfig.java`
#### Snippet
```java
     * if enabled, custom routing values will be used, to reduce the number of shards that need to be searched.
     */
    private boolean enableCustomRouting = false;
}

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/base/IndexController.java`
#### Snippet
```java
    @Setter
    @Getter
    private boolean logicSharding = false;

    @Setter
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/base/IndexController.java`
#### Snippet
```java
    @Setter
    @Getter
    private boolean enableCustomRouting = false;

    public String getTableName(Model model) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-library/library-server/src/main/java/org/apache/skywalking/oap/server/library/server/http/HTTPServerConfig.java`
#### Snippet
```java

    @Builder.Default
    private boolean enableTLS = false;

    private String tlsKeyPath;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `oap-server/server-library/library-server/src/main/java/org/apache/skywalking/oap/server/library/server/http/HTTPServerConfig.java`
#### Snippet
```java
    private long idleTimeOut = 30000;
    @Builder.Default
    private int acceptQueueSize = 0;
    @Builder.Default
    private int maxRequestHeaderSize = 8192;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/query/MetadataQueryEsDAO.java`
#### Snippet
```java
    private final int scrollingBatchSize;
    private String endpointTrafficNameAlias;
    private boolean aliasNameInit = false;
    private final int layerSize;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `oap-server/server-query-plugin/zipkin-query-plugin/src/main/java/org/apache/skywalking/oap/query/zipkin/ZipkinQueryConfig.java`
#### Snippet
```java
    private int restMaxThreads = 200;
    private long restIdleTimeOut = 30000;
    private int restAcceptQueueSize = 0;
    private long lookback = 86400000L;
    private int namesMaxAge = 300;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `oap-server/server-telemetry/telemetry-api/src/main/java/org/apache/skywalking/oap/server/telemetry/api/TelemetryRelatedContext.java`
#### Snippet
```java
    INSTANCE;

    private volatile String id = null;

    TelemetryRelatedContext() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/exporter/src/main/java/org/apache/skywalking/oap/server/exporter/provider/ExporterSetting.java`
#### Snippet
```java
@Getter
public class ExporterSetting extends ModuleConfig {
    private boolean enableGRPCMetrics = false;
    private String gRPCTargetHost;
    private int gRPCTargetPort;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/exporter/src/main/java/org/apache/skywalking/oap/server/exporter/provider/ExporterSetting.java`
#### Snippet
```java

    //kafka
    private boolean enableKafkaTrace = false;
    private boolean enableKafkaLog = false;
    private String kafkaBootstrapServers;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/exporter/src/main/java/org/apache/skywalking/oap/server/exporter/provider/ExporterSetting.java`
#### Snippet
```java
    //kafka
    private boolean enableKafkaTrace = false;
    private boolean enableKafkaLog = false;
    private String kafkaBootstrapServers;
    private String kafkaProducerConfig;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `oap-server/exporter/src/main/java/org/apache/skywalking/oap/server/exporter/provider/grpc/GRPCMetricsExporter.java`
#### Snippet
```java
    private ReentrantLock fetchListLock;
    private volatile List<SubscriptionMetric> subscriptionList;
    private volatile long lastFetchTimestamp = 0;

    public GRPCMetricsExporter(ExporterSetting setting) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `oap-server/server-library/library-module/src/main/java/org/apache/skywalking/oap/server/library/module/ModuleDefine.java`
#### Snippet
```java
    private static final Logger LOGGER = LoggerFactory.getLogger(ModuleDefine.class);

    private ModuleProvider loadedProvider = null;

    private final String name;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/analyzer/log-analyzer/src/main/java/org/apache/skywalking/oap/log/analyzer/dsl/spec/sink/sampler/RateLimitingSampler.java`
#### Snippet
```java
        private volatile ScheduledFuture<?> future;

        private volatile boolean started = false;

        private synchronized void start(final Sampler sampler) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/GRPCStreamStatus.java`
#### Snippet
```java
public class GRPCStreamStatus {

    private volatile boolean done = false;

    public void done() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/MultipleFilesChangeMonitor.java`
#### Snippet
```java
         * The last modify time of the {@link #filePath}
         */
        private long lastModifiedTimestamp = 0;
        /**
         * File content at the latest status.
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/MultipleFilesChangeMonitor.java`
#### Snippet
```java
     * The timestamp when last time do status checked.
     */
    private long lastCheckTimestamp = 0;
    /**
     * The period of watching thread checking the file status. Unit is the second.
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `oap-server/server-receiver-plugin/zipkin-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/zipkin/ZipkinReceiverConfig.java`
#### Snippet
```java
    private int restMaxThreads = 200;
    private long restIdleTimeOut = 30000;
    private int restAcceptQueueSize = 0;
    private String searchableTracesTags = DEFAULT_SEARCHABLE_TAG_KEYS;
    private int sampleRate = 10000;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-receiver-plugin/zipkin-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/zipkin/ZipkinReceiverConfig.java`
#### Snippet
```java
    );
    // kafka collector config
    private boolean enableKafkaCollector = false;
    /**
     *  A list of host/port pairs to use for establishing the initial connection to the Kafka cluster.
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/prometheus/parser/Context.java`
#### Snippet
```java
    public String name = "";
    public String help = "";
    public MetricType type = null;
    public List<String> allowedNames = new ArrayList<>();
    public List<TextSample> samples = new ArrayList<>();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `oap-server/server-receiver-plugin/aws-firehose-receiver/src/main/java/org/apache/skywalking/oap/server/receiver/aws/firehose/AWSFirehoseReceiverModuleConfig.java`
#### Snippet
```java
    private int maxThreads = 200;
    private long idleTimeOut = 30000;
    private int acceptQueueSize = 0;
    private int maxRequestHeaderSize = 8192;
    private String firehoseAccessKey;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-receiver-plugin/aws-firehose-receiver/src/main/java/org/apache/skywalking/oap/server/receiver/aws/firehose/AWSFirehoseReceiverModuleConfig.java`
#### Snippet
```java
    private int maxRequestHeaderSize = 8192;
    private String firehoseAccessKey;
    private boolean enableTLS = false;
    private String tlsKeyPath;
    private String tlsCertChainPath;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/CoreModuleConfig.java`
#### Snippet
```java
    private int restMaxThreads = 200;
    private long restIdleTimeOut = 30000;
    private int restAcceptQueueSize = 0;

    private String gRPCHost;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/CoreModuleConfig.java`
#### Snippet
```java
     * tool, such as Kibana-&gt;ES, to query the data by themselves.
     */
    private boolean activeExtraModelColumns = false;
    /**
     * The max length of the service name.
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/CoreModuleConfig.java`
#### Snippet
```java
    private String gRPCHost;
    private int gRPCPort;
    private boolean gRPCSslEnabled = false;
    private String gRPCSslKeyPath;
    private String gRPCSslCertChainPath;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/query/type/Node.java`
#### Snippet
```java
     */
    @NotGraphQLField
    private boolean hasSetOnceAtServerSide = false;

    public boolean hasSetOnceAtServerSide() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/config/DownSamplingConfigService.java`
#### Snippet
```java

    private boolean shouldToHour = false;
    private boolean shouldToDay = false;

    public DownSamplingConfigService(List<String> downsampling) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/config/DownSamplingConfigService.java`
#### Snippet
```java
public class DownSamplingConfigService implements Service {

    private boolean shouldToHour = false;
    private boolean shouldToDay = false;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/remote/selector/RollingSelector.java`
#### Snippet
```java
public class RollingSelector implements RemoteClientSelector {

    private int index = 0;

    @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/source/AbstractLog.java`
#### Snippet
```java
    private byte[] tagsRawData;
    private List<Tag> tags = new ArrayList<>();
    private boolean error = false;

    @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/status/ClusterStatus.java`
#### Snippet
```java
@Setter(AccessLevel.PACKAGE)
public class ClusterStatus {
    private volatile long rebalancedTime = 0;
}

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/status/BootingStatus.java`
#### Snippet
```java
     * The uptime in milliseconds if {@link #isBooted} is true;
     */
    private long uptime = 0;
}

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/status/BootingStatus.java`
#### Snippet
```java
     * The status of OAP is fully booted successfully.
     */
    private boolean isBooted = false;
    /**
     * The uptime in milliseconds if {@link #isBooted} is true;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/source/DefaultScopeDefine.java`
#### Snippet
```java

    @Setter
    private static boolean ACTIVE_EXTRA_MODEL_COLUMNS = false;

    public static void activeExtraModelColumns() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/storage/SessionCacheCallback.java`
#### Snippet
```java
     * from the cache, and would not be added back. As those are executed in a batch mode. The sequence is uncertain.
     */
    private volatile boolean isFailed = false;

    public void onInsertCompleted() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/storage/StorageID.java`
#### Snippet
```java
     * this object would switch to the sealed status, no more append is allowed.
     */
    private boolean sealed = false;
    /**
     * The string ID would only be built once.
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/storage/PersistenceTimer.java`
#### Snippet
```java
    INSTANCE;
    @VisibleForTesting
    boolean isStarted = false;
    private CounterMetrics errorCounter;
    private HistogramMetrics prepareLatency;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/storage/model/SQLDatabaseModelExtension.java`
#### Snippet
```java
        private final String name;
        private final List<ModelColumn> columns = new ArrayList<>();
        private boolean hasListColumn = false;

        public void appendColumn(ModelColumn column) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/storage/annotation/Column.java`
#### Snippet
```java

        @Getter
        private boolean isValue = false;

        ValueDataType(final boolean isValue) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/ApdexThresholdConfig.java`
#### Snippet
```java
    private Map<String, Integer> dictionary = Collections.emptyMap();

    private String rawConfig = null;

    public ApdexThresholdConfig(final CoreModuleProvider provider) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/meter/function/PercentileFunction.java`
#### Snippet
```java
    private IntList ranks = new IntList(10);

    private boolean isCalculated = false;

    @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/meter/function/sum/SumHistogramPercentileFunction.java`
#### Snippet
```java
    private IntList ranks = new IntList(10);

    private boolean isCalculated = false;

    @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/meter/function/avg/AvgHistogramPercentileFunction.java`
#### Snippet
```java
    private IntList ranks = new IntList(10);

    private boolean isCalculated = false;

    @Override
```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/metrics/Metrics.java`
#### Snippet
```java
     */
    @Getter
    private long lastUpdateTimestamp = 0L;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/worker/MetricsAggregateWorker.java`
#### Snippet
```java
    private final MergableBufferedData<Metrics> mergeDataCache;
    private CounterMetrics aggregationCounter;
    private long lastSendTime = 0;

    MetricsAggregateWorker(ModuleDefineHolder moduleDefineHolder,
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/worker/MetricsPersistentWorker.java`
#### Snippet
```java
     * @since 9.4.0
     */
    private volatile long timeOfLatestStabilitySts = 0;

    MetricsPersistentWorker(ModuleDefineHolder moduleDefineHolder, Model model, IMetricsDAO metricsDAO,
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-receiver-plugin/skywalking-sharing-server-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/sharing/server/SharingServerConfig.java`
#### Snippet
```java
    private int gRPCThreadPoolQueueSize;
    private String authentication;
    private boolean gRPCSslEnabled = false;
    private String gRPCSslKeyPath;
    private String gRPCSslCertChainPath;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `oap-server/server-receiver-plugin/skywalking-sharing-server-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/sharing/server/SharingServerConfig.java`
#### Snippet
```java
    private int restMaxThreads = 200;
    private long restIdleTimeOut = 30000;
    private int restAcceptQueueSize = 0;

    private String gRPCHost;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `oap-server/server-configuration/grpc-configuration-sync/src/main/java/org/apache/skywalking/oap/server/configuration/grpc/GRPCConfigWatcherRegister.java`
#### Snippet
```java
    private ConfigurationServiceGrpc.ConfigurationServiceBlockingStub stub;
    private String uuid = null;
    private String groupUuid = null;

    public GRPCConfigWatcherRegister(RemoteEndpointSettings settings) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `oap-server/server-configuration/grpc-configuration-sync/src/main/java/org/apache/skywalking/oap/server/configuration/grpc/GRPCConfigWatcherRegister.java`
#### Snippet
```java
    private RemoteEndpointSettings settings;
    private ConfigurationServiceGrpc.ConfigurationServiceBlockingStub stub;
    private String uuid = null;
    private String groupUuid = null;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `oap-server/server-library/library-elasticsearch-client/src/main/java/org/apache/skywalking/library/elasticsearch/bulk/BulkProcessor.java`
#### Snippet
```java
    private final Semaphore semaphore;
    private final long flushInternalInMillis;
    private volatile long lastFlushTS = 0;
    private final int batchOfBytes;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-receiver-plugin/configuration-discovery-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/recevier/configuration/discovery/ConfigurationDiscoveryModuleConfig.java`
#### Snippet
```java
    @Setter
    @Getter
    private boolean disableMessageDigest = false;
}

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-receiver-plugin/configuration-discovery-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/recevier/configuration/discovery/handler/grpc/ConfigurationDiscoveryServiceHandler.java`
#### Snippet
```java
     * the service corresponding to the agent will be returned directly
     */
    private boolean disableMessageDigest = false;

    public ConfigurationDiscoveryServiceHandler(AgentConfigurationsWatcher agentConfigurationsWatcher,
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-telemetry/telemetry-prometheus/src/main/java/org/apache/skywalking/oap/server/telemetry/prometheus/PrometheusConfig.java`
#### Snippet
```java
    private String host = "0.0.0.0";
    private int port = 1234;
    private boolean sslEnabled = false;
    private String sslKeyPath;
    private String sslCertChainPath;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-query-plugin/query-graphql-plugin/src/main/java/org/apache/skywalking/oap/query/graphql/GraphQLQueryConfig.java`
#### Snippet
```java
    private int maxQueryComplexity = 1000;
    private boolean enableUpdateUITemplate = false;
    private boolean enableOnDemandPodLog = false;
}

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-query-plugin/query-graphql-plugin/src/main/java/org/apache/skywalking/oap/query/graphql/GraphQLQueryConfig.java`
#### Snippet
```java
    private boolean enableLogTestTool;
    private int maxQueryComplexity = 1000;
    private boolean enableUpdateUITemplate = false;
    private boolean enableOnDemandPodLog = false;
}
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `oap-server/server-library/library-datacarrier-queue/src/main/java/org/apache/skywalking/oap/server/library/datacarrier/partition/SimpleRollingPartitioner.java`
#### Snippet
```java
public class SimpleRollingPartitioner<T> implements IDataPartitioner<T> {
    @SuppressWarnings("NonAtomicVolatileUpdate")
    private volatile int i = 0;

    @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-library/library-datacarrier-queue/src/main/java/org/apache/skywalking/oap/server/library/datacarrier/consumer/BulkConsumePool.java`
#### Snippet
```java
public class BulkConsumePool implements ConsumerPool {
    private List<MultipleChannelsConsumer> allConsumers;
    private volatile boolean isStarted = false;

    public BulkConsumePool(String name, int size, long consumeCycle) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `oap-server/oal-rt/src/main/java/org/apache/skywalking/oal/rt/parser/AggregationFuncStmt.java`
#### Snippet
```java
    private List<ConditionExpression> funcConditionExpressions;

    private int funcConditionExpressionGetIdx = 0;

    private List<Argument> funcArgs;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `oap-server/oal-rt/src/main/java/org/apache/skywalking/oal/rt/parser/AggregationFuncStmt.java`
#### Snippet
```java
    private List<Argument> funcArgs;

    private int argGetIdx = 0;

    private String nextArgCast = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `oap-server/oal-rt/src/main/java/org/apache/skywalking/oal/rt/parser/AggregationFuncStmt.java`
#### Snippet
```java
    private int argGetIdx = 0;

    private String nextArgCast = null;

    public void addFuncConditionExpression(ConditionExpression conditionExpression) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/oal-rt/src/main/java/org/apache/skywalking/oal/rt/parser/MetricsHolder.java`
#### Snippet
```java
public class MetricsHolder {
    private static final Map<String, Class<? extends Metrics>> REGISTER = new HashMap<>();
    private static volatile boolean INITIALIZED = false;

    private static void init() throws IOException {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-cluster-plugin/cluster-zookeeper-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/zookeeper/ClusterModuleZookeeperConfig.java`
#### Snippet
```java
    @Setter
    @Getter
    private boolean enableACL = false;
    @Setter
    @Getter
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/oal-rt/src/main/java/org/apache/skywalking/oal/rt/OALRuntime.java`
#### Snippet
```java
        "storage2Entity"
    };
    private static boolean IS_RT_TEMP_FOLDER_INIT_COMPLETED = false;

    private final OALDefine oalDefine;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/PromQLConfig.java`
#### Snippet
```java
    private int restMaxThreads = 200;
    private long restIdleTimeOut = 30000;
    private int restAcceptQueueSize = 0;
}

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/rt/result/ParseResult.java`
#### Snippet
```java
    private ParseTree parseTree;
    private ParseResultType resultType;
    private boolean rangeExpression = false;
    private ErrorType errorType;
    private String errorInfo;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-configuration/configuration-api/src/main/java/org/apache/skywalking/oap/server/configuration/api/ConfigWatcherRegister.java`
#### Snippet
```java
    @Getter
    private final Register groupConfigChangeWatcherRegister = new Register();
    private volatile boolean isStarted = false;
    private final long syncPeriod;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-receiver-plugin/envoy-metrics-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/envoy/EnvoyMetricReceiverConfig.java`
#### Snippet
```java
public class EnvoyMetricReceiverConfig extends ModuleConfig {
    @Getter
    private boolean acceptMetricsService = false;
    private String alsHTTPAnalysis;
    private String alsTCPAnalysis;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `oap-server/server-receiver-plugin/envoy-metrics-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/envoy/als/mx/FieldsHelper.java`
#### Snippet
```java
    SINGLETON;

    private boolean initialized = false;

    /**
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `SourceDispatcher`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/browser/manual/service/BrowserAppTrafficDispatcher.java`
#### Snippet
```java
import org.apache.skywalking.oap.server.core.browser.source.BrowserAppTraffic;

public class BrowserAppTrafficDispatcher extends BrowserAppTrafficSourceDispatcher<BrowserAppTraffic> implements SourceDispatcher<BrowserAppTraffic> {
    @Override
    protected void dispatchInterval(final BrowserAppTraffic source) {
```

### RedundantImplements
Redundant interface declaration `SourceDispatcher`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/browser/manual/endpoint/BrowserAppPageTrafficDispatcher.java`
#### Snippet
```java
import org.apache.skywalking.oap.server.core.browser.source.BrowserAppPageTraffic;

public class BrowserAppPageTrafficDispatcher extends BrowserAppTrafficSourceDispatcher<BrowserAppPageTraffic> implements SourceDispatcher<BrowserAppPageTraffic> {
    @Override
    protected void dispatchInterval(final BrowserAppPageTraffic source) {
```

### RedundantImplements
Redundant interface declaration `SourceDispatcher`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/browser/manual/instance/BrowserAppSingleVersionTrafficDispatcher.java`
#### Snippet
```java
import org.apache.skywalking.oap.server.core.browser.source.BrowserAppSingleVersionTraffic;

public class BrowserAppSingleVersionTrafficDispatcher extends BrowserAppTrafficSourceDispatcher<BrowserAppSingleVersionTraffic> implements SourceDispatcher<BrowserAppSingleVersionTraffic> {
    @Override
    protected void dispatchInterval(final BrowserAppSingleVersionTraffic source) {
```

### RedundantImplements
Redundant interface declaration `Service`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/exporter/MetricValuesExportService.java`
#### Snippet
```java
 * Export the metrics value from metrics through this service
 */
public interface MetricValuesExportService extends Service, ExporterService<ExportEvent> {
    /**
     * This method is sync-mode export, the performance effects the persistence result. Queue mode is highly
```

### RedundantImplements
Redundant interface declaration `Service`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/exporter/LogExportService.java`
#### Snippet
```java
 * Export the log from metrics through this service.
 */
public interface LogExportService extends Service, ExporterService<LogRecord> {

    void export(LogRecord logRecord);
```

### RedundantImplements
Redundant interface declaration `Service`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/exporter/TraceExportService.java`
#### Snippet
```java
 * Export the traces from metrics through this service.
 */
public interface TraceExportService extends Service, ExporterService<SegmentRecord> {

    void export(SegmentRecord segmentRecord);
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `oap-server/server-library/library-datacarrier-queue/src/main/java/org/apache/skywalking/oap/server/library/datacarrier/common/AtomicRangeInteger.java`
#### Snippet
```java
import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicRangeInteger extends Number implements Serializable {
    private static final long serialVersionUID = -4099792402691141643L;
    private AtomicIntegerArray values;
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `oap-server/microbench/src/main/java/org/apache/skywalking/oap/server/microbench/library/datacarrier/common/AtomicRangeIntegerV1.java`
#### Snippet
```java
 * This is moved from SkyWalking 6.1
 */
public class AtomicRangeIntegerV1 extends Number implements Serializable {

    private static final long serialVersionUID = -4099792402691141643L;
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `oap-server/microbench/src/main/java/org/apache/skywalking/oap/server/microbench/library/datacarrier/common/AtomicRangeIntegerV2.java`
#### Snippet
```java
 * This comes from PR#2874
 */
public class AtomicRangeIntegerV2 extends Number implements Serializable {
    private static final long serialVersionUID = -4099792402691141643L;
    private AtomicInteger value;
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-21-02-30-34.384.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=CallToStringConcatCanBeReplacedByOperator]
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/config/group/openapi/EndpointGroupingRule4Openapi.java`
#### Snippet
```java

        private int getPatternVarsCount(String pattern) {
            return ",".concat(pattern).concat(",").split(VAR_PATTERN).length - 1;
        }

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/config/group/openapi/EndpointGroupingRule4Openapi.java`
#### Snippet
```java

        private int getPatternVarsCount(String pattern) {
            return ",".concat(pattern).concat(",").split(VAR_PATTERN).length - 1;
        }

```

## RuleId[id=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer serviceNamePattern` may be declared as 'StringBuilder'
in `oap-server/server-receiver-plugin/envoy-metrics-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/envoy/als/mx/FieldsHelper.java`
#### Snippet
```java
            final Matcher m = p.matcher(flatBuffersFieldName);
            final List<Property> flatBuffersFieldNames = new ArrayList<>(m.groupCount());
            final StringBuffer serviceNamePattern = new StringBuffer();
            while (m.find()) {
                final String properties = m.group("properties");
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/base/ElasticSearchConverter.java`
#### Snippet
```java
            final String value = (String) source.get(getPhysicalColumnName(modelName, fieldName));
            if (StringUtil.isEmpty(value)) {
                return new byte[] {};
            }
            return Base64.getDecoder().decode(value);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-query-plugin/zipkin-query-plugin/src/main/java/org/apache/skywalking/oap/query/zipkin/ZipkinQueryModule.java`
#### Snippet
```java
    @Override
    public Class[] services() {
        return new Class[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-telemetry/telemetry-api/src/main/java/org/apache/skywalking/oap/server/telemetry/api/MetricsTag.java`
#### Snippet
```java

        public Keys() {
            this.keys = new String[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-telemetry/telemetry-api/src/main/java/org/apache/skywalking/oap/server/telemetry/api/MetricsTag.java`
#### Snippet
```java

        public Values(Keys keys) {
            this.values = new String[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-telemetry/telemetry-api/src/main/java/org/apache/skywalking/oap/server/telemetry/none/NoneTelemetryProvider.java`
#### Snippet
```java
    @Override
    public String[] requiredModules() {
        return new String[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-fetcher-plugin/kafka-fetcher-plugin/src/main/java/org/apache/skywalking/oap/server/analyzer/agent/kafka/module/KafkaFetcherModule.java`
#### Snippet
```java
    @Override
    public Class[] services() {
        return new Class[] { };
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-tools/data-generator/src/main/java/org/apache/skywalking/module/DataGeneratorModule.java`
#### Snippet
```java
    @Override
    public Class<?>[] services() {
        return new Class[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-tools/data-generator/src/main/java/org/apache/skywalking/module/DataGeneratorModuleProvider.java`
#### Snippet
```java
    @Override
    public String[] requiredModules() {
        return new String[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-library/library-module/src/main/java/org/apache/skywalking/oap/server/library/module/ApplicationConfiguration.java`
#### Snippet
```java

    public String[] moduleList() {
        return modules.keySet().toArray(new String[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-receiver-plugin/skywalking-clr-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/clr/module/CLRModule.java`
#### Snippet
```java
    @Override
    public Class[] services() {
        return new Class[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-receiver-plugin/zipkin-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/zipkin/ZipkinReceiverModule.java`
#### Snippet
```java
    @Override
    public Class[] services() {
        return new Class[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-receiver-plugin/skywalking-browser-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/browser/module/BrowserModule.java`
#### Snippet
```java
    @Override
    public Class[] services() {
        return new Class[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-receiver-plugin/aws-firehose-receiver/src/main/java/org/apache/skywalking/oap/server/receiver/aws/firehose/AWSFirehoseReceiverModule.java`
#### Snippet
```java
    @Override
    public Class[] services() {
        return new Class[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-receiver-plugin/skywalking-profile-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/profile/module/ProfileModule.java`
#### Snippet
```java
    @Override
    public Class[] services() {
        return new Class[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-receiver-plugin/skywalking-management-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/register/module/RegisterModule.java`
#### Snippet
```java
    @Override
    public Class[] services() {
        return new Class[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/CoreModule.java`
#### Snippet
```java
        classes.add(CommandService.class);

        return classes.toArray(new Class[]{});
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/query/QueryModule.java`
#### Snippet
```java
    @Override
    public Class[] services() {
        return new Class[] {};
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/storage/type/HashMapConverter.java`
#### Snippet
```java
            final String value = (String) source.get(fieldName);
            if (StringUtil.isEmpty(value)) {
                return new byte[] {};
            }
            return Base64.getDecoder().decode(value);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-library/library-elasticsearch-client/src/main/java/org/apache/skywalking/library/elasticsearch/bulk/BulkProcessor.java`
#### Snippet
```java
                bufferOfBytes += bytes.length + 1;
                if (bufferOfBytes >= batchOfBytes) {
                    final ByteBuf content = Unpooled.wrappedBuffer(bs.toArray(new byte[0][]));
                    byteBufList.add(content);
                    bs.clear();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-library/library-elasticsearch-client/src/main/java/org/apache/skywalking/library/elasticsearch/bulk/BulkProcessor.java`
#### Snippet
```java
            }
            if (CollectionUtils.isNotEmpty(bs)) {
                final ByteBuf content = Unpooled.wrappedBuffer(bs.toArray(new byte[0][]));
                byteBufList.add(content);
            }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-receiver-plugin/configuration-discovery-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/recevier/configuration/discovery/ConfigurationDiscoveryModule.java`
#### Snippet
```java
    @Override
    public Class[] services() {
        return new Class[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/prometheus/PrometheusMetricConverter.java`
#### Snippet
```java
                        .value(b.getValue())
                        .build()).collect(toList()))
        ).toArray(new Sample[0]);
        if (ss.length < 1) {
            return Optional.empty();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCContinuousProfilingPolicyDAO.java`
#### Snippet
```java
        final var results = new ArrayList<ContinuousProfilingPolicy>();
        for (String table : tables) {
            results.addAll(jdbcClient.executeQuery("select * from " + table + whereQuery, this::buildPolicies, condition.toArray(new Object[0])));
        }
        return results;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCProfileTaskQueryDAO.java`
#### Snippet
```java
                        return tasks;
                    },
                    condition.toArray(new Object[0]))
            );
        }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCProfileTaskQueryDAO.java`
#### Snippet
```java
                    return null;
                },
                condition.toArray(new Object[0]));
            if (r != null) {
                return r;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCMetricsQueryDAO.java`
#### Snippet
```java
                    return null;
                },
                ids.toArray(new Object[0]));
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCMetricsQueryDAO.java`
#### Snippet
```java
                    return null;
                },
                ids.toArray(new Object[0]));
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCMetricsQueryDAO.java`
#### Snippet
```java
                    return null;
                },
                ids.toArray(new Object[0]));
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCMetricsQueryDAO.java`
#### Snippet
```java
                    return null;
                },
                parameters.toArray(new Object[0])
            );
        }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCUITemplateManagementDAO.java`
#### Snippet
```java
                }
                return null;
            }, condition.toArray(new Object[0]));
            if (result != null) {
                return result;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCUITemplateManagementDAO.java`
#### Snippet
```java
                while (uiTemplate != null);
                return null;
            }, condition.toArray(new Object[0]));
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCTraceQueryDAO.java`
#### Snippet
```java
                    return null;
                },
                parameters.toArray(new Object[0]));
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCServiceLabelQueryDAO.java`
#### Snippet
```java
                    sql.toString(),
                    this::parseLabels,
                    condition.toArray(new Object[0])
                )
            );
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCZipkinQueryDAO.java`
#### Snippet
```java

            traces.addAll(
                h2Client.executeQuery(sql.toString(), this::buildTraces, condition.toArray(new Object[0]))
            );
        }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCZipkinQueryDAO.java`
#### Snippet
```java
                }
                return null;
            }, condition.toArray(new Object[0]));
        }
        return trace;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCZipkinQueryDAO.java`
#### Snippet
```java
                }
                return null;
            }, condition.toArray(new Object[0]));
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCZipkinQueryDAO.java`
#### Snippet
```java
                }
                return null;
            }, condition.toArray(new Object[0]));
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCZipkinQueryDAO.java`
#### Snippet
```java
                }
                return null;
            }, condition.toArray(new Object[0]));
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-receiver-plugin/skywalking-meter-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/meter/module/MeterReceiverModule.java`
#### Snippet
```java
    @Override
    public Class[] services() {
        return new Class[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-telemetry/telemetry-prometheus/src/main/java/org/apache/skywalking/oap/server/telemetry/prometheus/PrometheusTelemetryProvider.java`
#### Snippet
```java
    @Override
    public String[] requiredModules() {
        return new String[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCMetadataQueryDAO.java`
#### Snippet
```java
                    return processes.size() > 0 ? processes.get(0) : null;
                },
                condition.toArray(new Object[0]));
            if (result != null) {
                return result;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCMetadataQueryDAO.java`
#### Snippet
```java
                }
                return resultSet.getLong("total");
            }, condition.toArray(new Object[0]));
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCMetadataQueryDAO.java`
#### Snippet
```java

            results.addAll(
                jdbcClient.executeQuery(sql.toString(), this::buildProcesses, condition.toArray(new Object[0]))
            );
        }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCMetadataQueryDAO.java`
#### Snippet
```java
                final List<ServiceInstance> instances = buildInstances(resultSet);
                return instances.size() > 0 ? instances.get(0) : null;
            }, condition.toArray(new Object[0]));
            if (result != null) {
                return result;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCMetadataQueryDAO.java`
#### Snippet
```java
                }
                return resultSet.getLong("total");
            }, condition.toArray(new Object[0]));
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCMetadataQueryDAO.java`
#### Snippet
```java
                        }
                        return endpoints;
                    }, condition.toArray(new Object[0])));
        }
        return results.stream().limit(limit).collect(toList());
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-receiver-plugin/skywalking-mesh-receiver-plugin/src/main/java/org/apache/skywalking/aop/server/receiver/mesh/MeshReceiverModule.java`
#### Snippet
```java
    @Override
    public Class[] services() {
        return new Class[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-query-plugin/query-graphql-plugin/src/main/java/org/apache/skywalking/oap/query/graphql/GraphQLQueryProvider.java`
#### Snippet
```java
    @Override
    public String[] requiredModules() {
        return new String[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-receiver-plugin/skywalking-jvm-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/jvm/module/JVMModule.java`
#### Snippet
```java
    @Override
    public Class[] services() {
        return new Class[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-receiver-plugin/skywalking-zabbix-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/zabbix/module/ZabbixReceiverModule.java`
#### Snippet
```java
    @Override
    public Class[] services() {
        return new Class[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-receiver-plugin/skywalking-ebpf-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/ebpf/module/EBPFReceiverModule.java`
#### Snippet
```java
    @Override
    public Class[] services() {
        return new Class[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-receiver-plugin/skywalking-log-recevier-plugin/src/main/java/org/apache/skywalking/oap/server/recevier/log/module/LogModule.java`
#### Snippet
```java
    @Override
    public Class[] services() {
        return new Class[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-receiver-plugin/skywalking-trace-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/trace/module/TraceModule.java`
#### Snippet
```java
    @Override
    public Class[] services() {
        return new Class[] {};
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/PromQLModule.java`
#### Snippet
```java
    @Override
    public Class[] services() {
        return new Class[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-receiver-plugin/skywalking-event-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/event/EventModule.java`
#### Snippet
```java
    @Override
    public Class<?>[] services() {
        return new Class<?>[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-cluster-plugin/cluster-standalone-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/standalone/ClusterModuleStandaloneProvider.java`
#### Snippet
```java
    @Override
    public String[] requiredModules() {
        return new String[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-configuration/configuration-api/src/main/java/org/apache/skywalking/oap/server/configuration/api/AbstractConfigurationProvider.java`
#### Snippet
```java
    @Override
    public String[] requiredModules() {
        return new String[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-configuration/configuration-api/src/main/java/org/apache/skywalking/oap/server/configuration/api/NoneConfigurationProvider.java`
#### Snippet
```java
    @Override
    public String[] requiredModules() {
        return new String[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-receiver-plugin/envoy-metrics-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/envoy/EnvoyMetricReceiverModule.java`
#### Snippet
```java
    @Override
    public Class[] services() {
        return new Class[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-alarm-plugin/src/main/java/org/apache/skywalking/oap/server/core/alarm/provider/RunningRule.java`
#### Snippet
```java
                    TraceLogMetric l = new TraceLogMetric(
                        m.getTimeBucket(), dt.sortedValues(Comparator.naturalOrder())
                                             .toArray(new Number[0]));
                    l.labels = dt.sortedKeys(Comparator.naturalOrder()).toArray(new String[0]);
                    r.add(l);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-alarm-plugin/src/main/java/org/apache/skywalking/oap/server/core/alarm/provider/RunningRule.java`
#### Snippet
```java
                        m.getTimeBucket(), dt.sortedValues(Comparator.naturalOrder())
                                             .toArray(new Number[0]));
                    l.labels = dt.sortedKeys(Comparator.naturalOrder()).toArray(new String[0]);
                    r.add(l);
            }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-receiver-plugin/skywalking-telegraf-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/telegraf/module/TelegrafReceiverModule.java`
#### Snippet
```java
    @Override
    public Class[] services() {
        return new Class[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `oap-server/server-receiver-plugin/skywalking-telegraf-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/telegraf/provider/handler/TelegrafServiceHandler.java`
#### Snippet
```java
                    .collect(Collectors.groupingBy(Sample::getName));
            sampleFamilyByName.forEach((k, v) ->
                    builder.put(k, SampleFamilyBuilder.newBuilder(v.toArray(new Sample[0])).build()));
            res.add(builder.build());
        }
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/base/BatchProcessEsDAO.java`
#### Snippet
```java
    public void insert(InsertRequest insertRequest) {
        if (bulkProcessor == null) {
            synchronized (this) {
                if (bulkProcessor == null) {
                    this.bulkProcessor = getClient().createBulkProcessor(
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/base/BatchProcessEsDAO.java`
#### Snippet
```java
    public CompletableFuture<Void> flush(List<PrepareRequest> prepareRequests) {
        if (bulkProcessor == null) {
            synchronized (this) {
                if (bulkProcessor == null) {
                    this.bulkProcessor = getClient().createBulkProcessor(
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/remote/RemoteServiceHandler.java`
#### Snippet
```java
    public StreamObserver<RemoteMessage> call(StreamObserver<Empty> responseObserver) {
        if (Objects.isNull(workerInstanceGetter)) {
            synchronized (RemoteServiceHandler.class) {
                if (Objects.isNull(workerInstanceGetter)) {
                    workerInstanceGetter = moduleDefineHolder.find(CoreModule.NAME)
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/remote/client/GRPCRemoteClient.java`
#### Snippet
```java
    GRPCClient getClient() {
        if (Objects.isNull(client)) {
            synchronized (GRPCRemoteClient.class) {
                if (Objects.isNull(client)) {
                    this.client = new GRPCClient(address.getHost(), address.getPort(), sslContext);
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/remote/client/GRPCRemoteClient.java`
#### Snippet
```java
    DataCarrier<RemoteMessage> getDataCarrier() {
        if (Objects.isNull(this.carrier)) {
            synchronized (GRPCRemoteClient.class) {
                if (Objects.isNull(this.carrier)) {
                    this.carrier = new DataCarrier<>("GRPCRemoteClient", channelSize, bufferSize);
```

## RuleId[id=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/config/group/openapi/EndpointGroupingRuleReader4Openapi.java`
#### Snippet
```java
    private final static String DEFAULT_ENDPOINT_NAME_FORMAT = "${METHOD}:${PATH}";
    private final static String DEFAULT_ENDPOINT_NAME_MATCH_RULE = "${METHOD}:${PATH}";
    private final Map<String, String> requestMethodsMap = new HashMap<String, String>() {
        {
            put("get", "GET");
```

## RuleId[id=CastConflictsWithInstanceof]
### CastConflictsWithInstanceof
Cast to 'IndexRequestWrapper' type conflicts with preceding 'instanceof InsertRequest' check
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/base/BatchProcessEsDAO.java`
#### Snippet
```java
            return CompletableFuture.allOf(prepareRequests.stream().map(prepareRequest -> {
                if (prepareRequest instanceof InsertRequest) {
                    return bulkProcessor.add(((IndexRequestWrapper) prepareRequest).getRequest())
                        .whenComplete((v, throwable) -> {
                            if (throwable == null) {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `agentJarFile` initializer `null` is redundant
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/WorkPath.java`
#### Snippet
```java
            if (isInJar) {
                urlString = urlString.substring(urlString.indexOf("file:"), insidePathIndex);
                File agentJarFile = null;
                try {
                    agentJarFile = new File(new URL(urlString).toURI());
```

### UnusedAssignment
Variable `expectedToken` initializer `""` is redundant
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/server/auth/AuthenticationInterceptor.java`
#### Snippet
```java
public class AuthenticationInterceptor implements ServerInterceptor {

    private String expectedToken = "";

    private ServerCall.Listener listener = new ServerCall.Listener() {
```

### UnusedAssignment
Variable `isValue` initializer `false` is redundant
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/storage/annotation/Column.java`
#### Snippet
```java

        @Getter
        private boolean isValue = false;

        ValueDataType(final boolean isValue) {
```

### UnusedAssignment
Variable `classpath` initializer `null` is redundant
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/meter/MeterSystem.java`
#### Snippet
```java
        classPool = ClassPool.getDefault();

        ClassPath classpath = null;
        try {
            classpath = ClassPath.from(MeterSystem.class.getClassLoader());
```

### UnusedAssignment
Variable `threadStack` initializer `null` is redundant
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/trace/analyze/ProfileStack.java`
#### Snippet
```java

    public static ProfileStack deserialize(ProfileThreadSnapshotRecord record) {
        ThreadStack threadStack = null;
        try {
            threadStack = ThreadStack.parseFrom(record.getStackBinary());
```

### UnusedAssignment
Variable `disableMessageDigest` initializer `false` is redundant
in `oap-server/server-receiver-plugin/configuration-discovery-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/recevier/configuration/discovery/handler/grpc/ConfigurationDiscoveryServiceHandler.java`
#### Snippet
```java
     * the service corresponding to the agent will be returned directly
     */
    private boolean disableMessageDigest = false;

    public ConfigurationDiscoveryServiceHandler(AgentConfigurationsWatcher agentConfigurationsWatcher,
```

### UnusedAssignment
Variable `uiTemplate` initializer `null` is redundant
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCUITemplateManagementDAO.java`
#### Snippet
```java
            h2Client.executeQuery(sql.toString(), resultSet -> {
                final UITemplate.Builder builder = new UITemplate.Builder();
                UITemplate uiTemplate = null;
                do {
                    uiTemplate = (UITemplate) toStorageData(resultSet, UITemplate.INDEX_NAME, builder);
```

### UnusedAssignment
Variable `sampleFamilies` initializer `null` is redundant
in `oap-server/server-receiver-plugin/skywalking-zabbix-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/zabbix/provider/ZabbixMetrics.java`
#### Snippet
```java
            }
            StopWatch stopWatch = new StopWatch();
            Collection<SampleFamily> sampleFamilies = null;
            try {
                stopWatch.start();
```

### UnusedAssignment
Variable `parentMetricsClass` initializer `null` is redundant
in `oap-server/oal-rt/src/main/java/org/apache/skywalking/oal/rt/OALRuntime.java`
#### Snippet
```java
    private Class generateMetricsClass(AnalysisResult metricsStmt) throws OALCompileException {
        String className = metricsClassName(metricsStmt, false);
        CtClass parentMetricsClass = null;
        try {
            parentMetricsClass = classPool.get(METRICS_FUNCTION_PACKAGE + metricsStmt.getMetricsClassName());
```

### UnusedAssignment
Variable `config` initializer `null` is redundant
in `oap-server/server-configuration/configuration-nacos/src/main/java/org/apache/skywalking/oap/server/configuration/nacos/NacosConfigWatcherRegister.java`
#### Snippet
```java
            GroupConfigTable.GroupConfigItems groupConfigItems = new GroupConfigTable.GroupConfigItems(key);
            groupConfigTable.addGroupConfigItems(groupConfigItems);
            String config = null;
            try {
                config = configService.getConfig(key, settings.getGroup(), 1000);
```

### UnusedAssignment
Variable `match` initializer `false` is redundant
in `oap-server/server-alarm-plugin/src/main/java/org/apache/skywalking/oap/server/core/alarm/provider/AlarmMessageFormatter.java`
#### Snippet
```java
        formatSegments = new ArrayList<>();
        this.valueFroms = new ArrayList<>();
        boolean match = false;
        int idx = 0;
        do {
```

### UnusedAssignment
Variable `meterSamples` initializer `new HashMap<>()` is redundant
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/SampleFamily.java`
#### Snippet
```java
        }

        private Map<MeterEntity, Sample[]> meterSamples = new HashMap<>();

        private TimeUnit defaultHistogramBucketUnit;
```

## RuleId[id=TypeParameterExtendsObject]
### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/yaml/ClassFilterConstructor.java`
#### Snippet
```java
    @Override
    protected Class<?> getClassForName(final String name) throws ClassNotFoundException {
        for (Class<? extends Object> each : acceptClasses) {
            if (name.equals(each.getName())) {
                return super.getClassForName(name);
```

## RuleId[id=NonExceptionNameEndsWithException]
### NonExceptionNameEndsWithException
Non-exception class name `CallbackWhenException` ends with 'Exception'
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/RunnableWithExceptionProtection.java`
#### Snippet
```java
    }

    public interface CallbackWhenException {
        void handle(Throwable t);
    }
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/EBPFProfilingMutationService.java`
#### Snippet
```java
        if (CollectionUtils.isNotEmpty(tasks)) {
            final EBPFProfilingTaskRecord mostRecentTask = tasks.stream()
                    .min(Comparator.comparingLong(EBPFProfilingTaskRecord::getStartTime)).get();
            if (mostRecentTask.getStartTime() < calculateStartTime(request)) {
                return "Task's time range overlaps with other tasks";
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `i <= QUERY_PROFILE_SNAPSHOT_RETRY_COUNT` is always `true`
in `oap-server/server-tools/profile-exporter/tool-profile-snapshot-bootstrap/src/main/java/org/apache/skywalking/oap/server/tool/profile/exporter/ProfileSnapshotDumper.java`
#### Snippet
```java
     */
    private static List<ProfileThreadSnapshotRecord> querySnapshot(IProfileThreadSnapshotQueryDAO threadSnapshotQueryDAO, ProfiledBasicInfo.SequenceRange sequenceRange) throws IOException {
        for (int i = 1; i <= QUERY_PROFILE_SNAPSHOT_RETRY_COUNT; i++) {
            try {
                return threadSnapshotQueryDAO.queryRecords(sequenceRange.getSegmentId(), sequenceRange.getMin(), sequenceRange.getMax());
```

### ConstantValue
Value `includingDisabled` is always 'false'
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/query/UITemplateManagementEsDAO.java`
#### Snippet
```java
            boolQuery.must(Query.term(
                UITemplate.DISABLED,
                BooleanUtils.booleanToValue(includingDisabled)
            ));
        }
```

### ConstantValue
Condition `componentId != null` is always `true`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/query/ServiceTopologyBuilder.java`
#### Snippet
```java
            } else {
                final Integer componentId = componentLibraryCatalogService.getComponentId(nodeType);
                if (componentId != null) {
                    if (componentLibraryCatalogService.compare(componentId, serverCall.getComponentId())) {
                        serverSideNode.setTypeFromServerSide(
```

### ConstantValue
Condition `scopeClassField != null` is always `true`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/source/DefaultScopeDefine.java`
#### Snippet
```java
        }
        Field[] scopeClassField = originalClass.getDeclaredFields();
        if (scopeClassField != null) {
            for (Field field : scopeClassField) {
                ScopeDefaultColumn.DefinedByField definedByField = field.getAnnotation(
```

### ConstantValue
Condition `cached == null` is always `true`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/worker/MetricsPersistentWorker.java`
#### Snippet
```java
        if (timeOfLatestStabilitySts > 0 &&
            metrics.getTimeBucket() > timeOfLatestStabilitySts
            && cached == null) {
            // Return metrics as input to avoid reading from database.
            return metrics;
```

### ConstantValue
Value `err` is always 'null'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/EBPFProfilingMutationService.java`
#### Snippet
```java
        String err = null;

        err = requiredNotEmpty(err, "service", request.getServiceId());

        // the request label must be legal
```

### ConstantValue
Value `err` is always 'null'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/EBPFProfilingMutationService.java`
#### Snippet
```java
    private String checkCreateRequest(EBPFProfilingNetworkTaskRequest request) throws IOException {
        String err = null;
        err = requiredNotEmpty(err, "instance", request.getInstanceId());
        if (StringUtil.isNotEmpty(err)) {
            return err;
```

### ConstantValue
Method reference result is always 'true'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/trace/ProfileTaskQueryService.java`
#### Snippet
```java
                return null;
            }
        }).filter(java.util.Objects::nonNull).filter(s -> CollectionUtils.isNotEmpty(s._2.getSpansList())).collect(Collectors.toMap(
            tuple -> tuple._1.getSegmentId(),
            tuple -> {
```

### ConstantValue
Value `includingDisabled` is always 'false'
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCUITemplateManagementDAO.java`
#### Snippet
```java
            if (!includingDisabled) {
                sql.append(" and ").append(UITemplate.DISABLED).append("=?");
                condition.add(BooleanUtils.booleanToValue(includingDisabled));
            }

```

### ConstantValue
Condition `valueString != null` is always `true`
in `oap-server/server-starter/src/main/java/org/apache/skywalking/oap/server/starter/config/ApplicationConfigLoader.java`
#### Snippet
```java
        final String valueString = PropertyPlaceholderHelper.INSTANCE
            .replacePlaceholders(propertyValue + "", target);
        if (valueString != null) {
            if (valueString.trim().length() == 0) {
                target.replace(propertyName, valueString);
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCAlarmQueryDAO.java`
#### Snippet
```java
            for (int i = 0; i < tags.size(); i++) {
                sql.append(" inner join ").append(tagTable).append(" ");
                sql.append(tagTable + i);
                sql.append(" on ").append(table).append(".").append(JDBCTableInstaller.ID_COLUMN).append(" = ");
                sql.append(tagTable + i).append(".").append(JDBCTableInstaller.ID_COLUMN);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCAlarmQueryDAO.java`
#### Snippet
```java
                sql.append(tagTable + i);
                sql.append(" on ").append(table).append(".").append(JDBCTableInstaller.ID_COLUMN).append(" = ");
                sql.append(tagTable + i).append(".").append(JDBCTableInstaller.ID_COLUMN);
            }
        }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCAlarmQueryDAO.java`
#### Snippet
```java
        if (CollectionUtils.isNotEmpty(tags)) {
            for (int i = 0; i < tags.size(); i++) {
                sql.append(" and ").append(tagTable + i).append(".");
                sql.append(AlarmRecord.TAGS).append(" = ?");
                parameters.add(tags.get(i).toString());
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCTopologyQueryDAO.java`
#### Snippet
```java
                serviceIdMatchSql.append("and (");
                for (int i = 0; i < serviceIds.size(); i++) {
                    serviceIdMatchSql.append(sourceCName + "=? or " + destCName + "=? ");
                    conditions[i * 2 + 3] = serviceIds.get(i);
                    conditions[i * 2 + 1 + 3] = serviceIds.get(i);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCTraceQueryDAO.java`
#### Snippet
```java
                for (int i = 0; i < tags.size(); i++) {
                    sql.append(" inner join ").append(tagTable).append(" ");
                    sql.append(tagTable + i);
                    sql.append(" on ").append(table).append(".").append(JDBCTableInstaller.ID_COLUMN).append(" = ");
                    sql.append(tagTable + i).append(".").append(JDBCTableInstaller.ID_COLUMN);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCTraceQueryDAO.java`
#### Snippet
```java
                    sql.append(tagTable + i);
                    sql.append(" on ").append(table).append(".").append(JDBCTableInstaller.ID_COLUMN).append(" = ");
                    sql.append(tagTable + i).append(".").append(JDBCTableInstaller.ID_COLUMN);
                }
            }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCTraceQueryDAO.java`
#### Snippet
```java
            if (CollectionUtils.isNotEmpty(tags)) {
                for (int i = 0; i < tags.size(); i++) {
                    sql.append(" and ").append(tagTable + i).append(".");
                    sql.append(SegmentRecord.TAGS).append(" = ?");
                    parameters.add(tags.get(i).toString());
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCZipkinQueryDAO.java`
#### Snippet
```java
                for (int i = 0; i < annotations.size(); i++) {
                    sql.append(" inner join ").append(tagTable).append(" ");
                    sql.append(tagTable + i);
                    sql.append(" on ").append(table).append(".").append(JDBCTableInstaller.ID_COLUMN).append(" = ");
                    sql.append(tagTable + i).append(".").append(JDBCTableInstaller.ID_COLUMN);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCZipkinQueryDAO.java`
#### Snippet
```java
                    sql.append(tagTable + i);
                    sql.append(" on ").append(table).append(".").append(JDBCTableInstaller.ID_COLUMN).append(" = ");
                    sql.append(tagTable + i).append(".").append(JDBCTableInstaller.ID_COLUMN);
                }
            }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCLogQueryDAO.java`
#### Snippet
```java
            for (int i = 0; i < tags.size(); i++) {
                sql.append(" inner join ").append(tagTable).append(" ");
                sql.append(tagTable + i);
                sql.append(" on ").append(table).append(".").append(JDBCTableInstaller.ID_COLUMN).append(" = ");
                sql.append(tagTable + i).append(".").append(JDBCTableInstaller.ID_COLUMN);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCLogQueryDAO.java`
#### Snippet
```java
                sql.append(tagTable + i);
                sql.append(" on ").append(table).append(".").append(JDBCTableInstaller.ID_COLUMN).append(" = ");
                sql.append(tagTable + i).append(".").append(JDBCTableInstaller.ID_COLUMN);
            }
        }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCLogQueryDAO.java`
#### Snippet
```java
        if (CollectionUtils.isNotEmpty(tags)) {
            for (int i = 0; i < tags.size(); i++) {
                sql.append(" and ").append(tagTable + i).append(".");
                sql.append(AbstractLogRecord.TAGS).append(" = ?");
                parameters.add(tags.get(i).toString());
```

## RuleId[id=IOResource]
### IOResource
'KafkaConsumer' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `oap-server/server-receiver-plugin/zipkin-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/zipkin/kafka/KafkaHandler.java`
#### Snippet
```java
    public void start() throws ModuleStartException {
        for (int i = 0; i < config.getKafkaConsumers(); i++) {
            KafkaConsumer<byte[], byte[]> consumer = new KafkaConsumer<>(properties);
            consumer.subscribe(topics);
            consumer.seekToEnd(consumer.assignment());
```

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `count` may be 'static'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/browser/source/BrowserAppTrafficSource.java`
#### Snippet
```java
    protected final Layer layer = Layer.BROWSER;

    private final int count = 1;

    private BrowserAppTrafficCategory trafficCategory;
```

### FieldMayBeStatic
Field `configPath` may be 'static'
in `oap-server/analyzer/agent-analyzer/src/main/java/org/apache/skywalking/oap/server/analyzer/provider/AnalyzerModuleConfig.java`
#### Snippet
```java

    @Getter
    private final String configPath = "meter-analyzer-config";

    /**
```

## RuleId[id=Java8MapForEach]
### Java8MapForEach
Can be replaced with 'Map.forEach()'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/config/group/openapi/EndpointGroupingRule4Openapi.java`
#### Snippet
```java
        Map<String, StringFormatGroup> rules = groupedRules.get(serviceName);
        if (rules != null) {
            rules.entrySet().forEach(stringFormatGroup -> {
                stringFormatGroup.getValue()
                                 .sortRules(new EndpointGroupingRule4Openapi.EndpointGroupingRulesComparator());
```

### Java8MapForEach
Can be replaced with 'Map.forEach()'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/config/group/openapi/EndpointGroupingRule4Openapi.java`
#### Snippet
```java

    void sortRulesAll() {
        groupedRules.entrySet().forEach(rules -> {
            sortRulesByService(rules.getKey());
        });
```

### Java8MapForEach
Can be replaced with 'Map.forEach()'
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/measure/BanyanDBMetricsDAO.java`
#### Snippet
```java
                @Override
            protected void apply(MeasureQuery query) {
                seriesIDColumns.entrySet().forEach(entry -> {
                    if (!entry.getValue().isEmpty()) {
                        query.or(in(entry.getKey(), entry.getValue()));
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `ProfileSnapshotExporterBootstrap` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-tools/profile-exporter/tool-profile-snapshot-bootstrap/src/main/java/org/apache/skywalking/oap/server/tool/profile/exporter/ProfileSnapshotExporterBootstrap.java`
#### Snippet
```java

@Slf4j
public class ProfileSnapshotExporterBootstrap {
    public static void export(String[] args) {
        ApplicationConfigLoader configLoader = new ApplicationConfigLoader();
```

### UtilityClassWithoutPrivateConstructor
Class `ProfileSnapshotDumper` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-tools/profile-exporter/tool-profile-snapshot-bootstrap/src/main/java/org/apache/skywalking/oap/server/tool/profile/exporter/ProfileSnapshotDumper.java`
#### Snippet
```java

@Slf4j
public class ProfileSnapshotDumper {

    public static final int QUERY_PROFILE_SNAPSHOT_RETRY_COUNT = 3;
```

### UtilityClassWithoutPrivateConstructor
Class `TimeSeriesUtils` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/base/TimeSeriesUtils.java`
#### Snippet
```java
 * TimeSeriesUtils sets up and splits the time suffix of index name.
 */
public class TimeSeriesUtils {
    private static DateTimeFormatter TIME_BUCKET_FORMATTER = DateTimeFormat.forPattern("yyyyMMdd");
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `LogicIndicesRegister` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/base/IndexController.java`
#### Snippet
```java
    }

    public static class LogicIndicesRegister {

        /**
```

### UtilityClassWithoutPrivateConstructor
Class `RoutingUtils` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/base/RoutingUtils.java`
#### Snippet
```java
import java.util.Optional;

public class RoutingUtils {

    public static void addRoutingValueToSearchParam(SearchParams searchParams, String routingValue) {
```

### UtilityClassWithoutPrivateConstructor
Class `PrivateKeyUtil` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-library/library-server/src/main/java/org/apache/skywalking/oap/server/library/server/ssl/PrivateKeyUtil.java`
#### Snippet
```java
 * Util intends to parse PKCS#1 and PKCS#8 at same time.
 */
public class PrivateKeyUtil {
    private static final String PKCS_1_PEM_HEADER = "-----BEGIN RSA PRIVATE KEY-----";
    private static final String PKCS_1_PEM_FOOTER = "-----END RSA PRIVATE KEY-----";
```

### UtilityClassWithoutPrivateConstructor
Class `MetricsTag` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-telemetry/telemetry-api/src/main/java/org/apache/skywalking/oap/server/telemetry/api/MetricsTag.java`
#### Snippet
```java
 * The tag values should be set in putting value phase.
 */
public class MetricsTag {
    public static final Keys EMPTY_KEY = new Keys();
    public static final Values EMPTY_VALUE = new Values();
```

### UtilityClassWithoutPrivateConstructor
Class `DataGeneratorStartUp` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-tools/data-generator/src/main/java/org/apache/skywalking/starter/DataGeneratorStartUp.java`
#### Snippet
```java
import org.apache.skywalking.oap.server.starter.OAPServerBootstrap;

public class DataGeneratorStartUp {
    public static void main(String[] args) {
        OAPServerBootstrap.start();
```

### UtilityClassWithoutPrivateConstructor
Class `PlaceholderConfigurerSupport` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/PlaceholderConfigurerSupport.java`
#### Snippet
```java
package org.apache.skywalking.oap.server.library.util;

public class PlaceholderConfigurerSupport {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `CollectionUtils` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/CollectionUtils.java`
#### Snippet
```java
import java.util.Set;

public class CollectionUtils {

    public static boolean isEmpty(Map map) {
```

### UtilityClassWithoutPrivateConstructor
Class `ProtoBufJsonUtils` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/ProtoBufJsonUtils.java`
#### Snippet
```java
import java.io.IOException;

public class ProtoBufJsonUtils {

    public static String toJSON(Message sourceMessage) throws IOException {
```

### UtilityClassWithoutPrivateConstructor
Class `ResourceUtils` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/ResourceUtils.java`
#### Snippet
```java
import java.util.Objects;

public class ResourceUtils {

    public static Reader read(String fileName) throws FileNotFoundException {
```

### UtilityClassWithoutPrivateConstructor
Class `BooleanUtils` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/BooleanUtils.java`
#### Snippet
```java
package org.apache.skywalking.oap.server.library.util;

public class BooleanUtils {

    public static final int TRUE = 1;
```

### UtilityClassWithoutPrivateConstructor
Class `Parsers` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/prometheus/Parsers.java`
#### Snippet
```java
import org.apache.skywalking.oap.server.library.util.prometheus.parser.TextParser;

public class Parsers {
    public static Parser text(final InputStream stream) {
        return new TextParser(stream);
```

### UtilityClassWithoutPrivateConstructor
Class `StringUtil` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/StringUtil.java`
#### Snippet
```java
package org.apache.skywalking.oap.server.library.util;

public final class StringUtil {
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
```

### UtilityClassWithoutPrivateConstructor
Class `SpanEncode` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-receiver-plugin/zipkin-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/zipkin/handler/SpanEncode.java`
#### Snippet
```java
package org.apache.skywalking.oap.server.receiver.zipkin.handler;

public class SpanEncode {
    public static final int PROTO3 = 1;
    public static final int JSON_V2 = 2;
```

### UtilityClassWithoutPrivateConstructor
Class `OtelMetricsConvertor` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-receiver-plugin/aws-firehose-receiver/src/main/java/org/apache/skywalking/oap/server/receiver/aws/firehose/OtelMetricsConvertor.java`
#### Snippet
```java
import java.util.Optional;

public class OtelMetricsConvertor {

    public static io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceRequest convertExportMetricsRequest(
```

### UtilityClassWithoutPrivateConstructor
Class `TLS_MODE` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/Const.java`
#### Snippet
```java
    public static final String BLANK_ENTITY_NAME = "_blank";

    public static final class TLS_MODE {
        public static final String NON_TLS = "NONE";

```

### UtilityClassWithoutPrivateConstructor
Class `Const` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/Const.java`
#### Snippet
```java
package org.apache.skywalking.oap.server.core;

public class Const {
    public static final int NONE = 0;
    public static final String SERVICE_ID_CONNECTOR = ".";
```

### UtilityClassWithoutPrivateConstructor
Class `ComponentLibraryCatalogUtil` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/ComponentLibraryCatalogUtil.java`
#### Snippet
```java
 * @since 9.4.0
 */
public class ComponentLibraryCatalogUtil {
    private static ComponentLibraryCatalogService REF;

```

### UtilityClassWithoutPrivateConstructor
Class `WorkPath` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/WorkPath.java`
#### Snippet
```java
 * Locate the base work path of OAP backend.
 */
public class WorkPath {
    private static final Logger LOGGER = LoggerFactory.getLogger(WorkPath.class);

```

### UtilityClassWithoutPrivateConstructor
Class `Finder` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/query/enumeration/Scope.java`
#### Snippet
```java
    }

    public static class Finder {
        public static Scope valueOf(int scopeId) {
            if (inServiceCatalog(scopeId)) {
```

### UtilityClassWithoutPrivateConstructor
Class `DefaultScopeDefine` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/source/DefaultScopeDefine.java`
#### Snippet
```java
import org.apache.skywalking.oap.server.core.annotation.AnnotationListener;

public class DefaultScopeDefine {
    private static final Map<String, Integer> NAME_2_ID = new HashMap<>();
    private static final Map<Integer, String> ID_2_NAME = new HashMap<>();
```

### UtilityClassWithoutPrivateConstructor
Class `OAPNodeChecker` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/cluster/OAPNodeChecker.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class OAPNodeChecker {
    private static final Set<String> ILLEGAL_NODE_ADDRESS_IN_CLUSTER_MODE = Sets.newHashSet("127.0.0.1", "localhost");

```

### UtilityClassWithoutPrivateConstructor
Class `TimeBucket` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/TimeBucket.java`
#### Snippet
```java
import org.apache.skywalking.oap.server.core.UnexpectedException;

public class TimeBucket {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ProcessID` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/IDManager.java`
#### Snippet
```java
     * Process ID related functions.
     */
    public static class ProcessID {
        /**
         * @param instanceId built by {@link ServiceInstanceID#buildId(String, String)}
```

### UtilityClassWithoutPrivateConstructor
Class `EndpointID` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/IDManager.java`
#### Snippet
```java
     * Endpoint ID related functions.
     */
    public static class EndpointID {
        /**
         * @param serviceId built by {@link ServiceID#buildId(String, boolean)}
```

### UtilityClassWithoutPrivateConstructor
Class `ServiceID` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/IDManager.java`
#### Snippet
```java
     * Service ID related functions.
     */
    public static class ServiceID {
        /**
         * @param name     service name
```

### UtilityClassWithoutPrivateConstructor
Class `ServiceInstanceID` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/IDManager.java`
#### Snippet
```java
     * Service Instance ID related functions.
     */
    public static class ServiceInstanceID {
        /**
         * @param serviceId built by {@link ServiceID#buildId(String, boolean)}
```

### UtilityClassWithoutPrivateConstructor
Class `NetworkAddressAliasDefine` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/IDManager.java`
#### Snippet
```java
     * Network Address Alias ID related functions.
     */
    public static class NetworkAddressAliasDefine {
        /**
         * @return encoded network address id
```

### UtilityClassWithoutPrivateConstructor
Class `Util` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/storage/query/IMetricsQueryDAO.java`
#### Snippet
```java
    HeatMap readHeatMap(MetricsCondition condition, String valueColumnName, Duration duration) throws IOException;

    class Util {
        /**
         * Make sure the order is same as the expected order, add defaultValue if absent.
```

### UtilityClassWithoutPrivateConstructor
Class `PropertyUtil` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/instance/InstanceTraffic.java`
#### Snippet
```java
    }

    public static class PropertyUtil {
        /**
         * `namespace` and `pod` are key properties that help "on demand Pod logs"
```

### UtilityClassWithoutPrivateConstructor
Class `Util` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/searchtag/Tag.java`
#### Snippet
```java
    }

    public static class Util {
        public static List<String> toStringList(List<Tag> list) {
            if (CollectionUtils.isEmpty(list)) {
```

### UtilityClassWithoutPrivateConstructor
Class `DSL` has only 'static' members, and lacks a 'private' constructor
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/DSL.java`
#### Snippet
```java
 * DSL combines methods to parse groovy based DSL expression.
 */
public final class DSL {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ProcessRegistry` has only 'static' members, and lacks a 'private' constructor
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/registry/ProcessRegistry.java`
#### Snippet
```java
 * The dynamic entity registry for {@link ProcessTraffic}
 */
public class ProcessRegistry {

    public static final String LOCAL_VIRTUAL_PROCESS = "UNKNOWN_LOCAL";
```

### UtilityClassWithoutPrivateConstructor
Class `Rules` has only 'static' members, and lacks a 'private' constructor
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/prometheus/rule/Rules.java`
#### Snippet
```java
 * Rules is factory to instance {@link Rule} from a local file.
 */
public class Rules {
    private static final Logger LOG = LoggerFactory.getLogger(Rule.class);

```

### UtilityClassWithoutPrivateConstructor
Class `TableMetaInfo` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/TableMetaInfo.java`
#### Snippet
```java
 * should get model from here.
 */
public class TableMetaInfo {
    private static final Map<String, Model> TABLES = new HashMap<>();

```

### UtilityClassWithoutPrivateConstructor
Class `JDBCEntityConverters` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/JDBCEntityConverters.java`
#### Snippet
```java
import java.sql.ResultSet;

public class JDBCEntityConverters {
    public static Convert2Entity toEntity(ResultSet resultSet) {
        return new Convert2Entity() {
```

### UtilityClassWithoutPrivateConstructor
Class `SpanTags` has only 'static' members, and lacks a 'private' constructor
in `oap-server/analyzer/agent-analyzer/src/main/java/org/apache/skywalking/oap/server/analyzer/provider/trace/parser/SpanTags.java`
#### Snippet
```java
 * Reserved keys of the span. The backend analysis the metrics according the existed tags.
 */
public class SpanTags {
    public static final String HTTP_RESPONSE_STATUS_CODE = "http.status_code";
    /**
```

### UtilityClassWithoutPrivateConstructor
Class `MeterConfigs` has only 'static' members, and lacks a 'private' constructor
in `oap-server/analyzer/agent-analyzer/src/main/java/org/apache/skywalking/oap/server/analyzer/provider/meter/config/MeterConfigs.java`
#### Snippet
```java
 */
@Slf4j
public class MeterConfigs {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ZabbixConfigs` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-receiver-plugin/skywalking-zabbix-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/zabbix/provider/config/ZabbixConfigs.java`
#### Snippet
```java

@Slf4j
public class ZabbixConfigs {

    public static List<ZabbixConfig> loadConfigs(String path, List<String> fileNames) throws ModuleStartException {
```

### UtilityClassWithoutPrivateConstructor
Class `ProfileSnapshotExporter` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-tools/profile-exporter/tool-profile-snapshot-exporter/src/main/java/org/apache/skywalking/oap/server/tool/profile/exporter/ProfileSnapshotExporter.java`
#### Snippet
```java

@Slf4j
public class ProfileSnapshotExporter {
    public static void main(String[] args) {
        ProfileSnapshotExporterBootstrap.export(args);
```

### UtilityClassWithoutPrivateConstructor
Class `EnvUtil` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-library/library-datacarrier-queue/src/main/java/org/apache/skywalking/oap/server/library/datacarrier/EnvUtil.java`
#### Snippet
```java
 * Read value from system env.
 */
public class EnvUtil {
    public static int getInt(String envName, int defaultValue) {
        int value = defaultValue;
```

### UtilityClassWithoutPrivateConstructor
Class `TypeCastUtil` has only 'static' members, and lacks a 'private' constructor
in `oap-server/oal-rt/src/main/java/org/apache/skywalking/oal/rt/util/TypeCastUtil.java`
#### Snippet
```java
package org.apache.skywalking.oal.rt.util;

public class TypeCastUtil {
    /**
     * @param castType           to change the value of given original expression.
```

### UtilityClassWithoutPrivateConstructor
Class `ClassMethodUtil` has only 'static' members, and lacks a 'private' constructor
in `oap-server/oal-rt/src/main/java/org/apache/skywalking/oal/rt/util/ClassMethodUtil.java`
#### Snippet
```java
import java.util.List;

public class ClassMethodUtil {
    public static String toGetMethod(String attribute) {
        return "get" + attribute.substring(0, 1).toUpperCase() + attribute.substring(1);
```

### UtilityClassWithoutPrivateConstructor
Class `SourceColumnsFactory` has only 'static' members, and lacks a 'private' constructor
in `oap-server/oal-rt/src/main/java/org/apache/skywalking/oal/rt/parser/SourceColumnsFactory.java`
#### Snippet
```java
import org.apache.skywalking.oap.server.core.source.ScopeDefaultColumn;

public class SourceColumnsFactory {
    public static List<SourceColumn> getColumns(String source) {
        List<SourceColumn> sourceColumns = new ArrayList<>();
```

### UtilityClassWithoutPrivateConstructor
Class `NodeNameBuilder` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-cluster-plugin/cluster-zookeeper-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/zookeeper/NodeNameBuilder.java`
#### Snippet
```java
package org.apache.skywalking.oap.server.cluster.plugin.zookeeper;

public class NodeNameBuilder {

    public static String build(String moduleName, String providerName) {
```

### UtilityClassWithoutPrivateConstructor
Class `MetricsHolder` has only 'static' members, and lacks a 'private' constructor
in `oap-server/oal-rt/src/main/java/org/apache/skywalking/oal/rt/parser/MetricsHolder.java`
#### Snippet
```java

@SuppressWarnings("UnstableApiUsage")
public class MetricsHolder {
    private static final Map<String, Class<? extends Metrics>> REGISTER = new HashMap<>();
    private static volatile boolean INITIALIZED = false;
```

### UtilityClassWithoutPrivateConstructor
Class `CommandDeserializer` has only 'static' members, and lacks a 'private' constructor
in `apm-protocol/apm-network/src/main/java/org/apache/skywalking/oap/server/network/trace/component/command/CommandDeserializer.java`
#### Snippet
```java
import org.apache.skywalking.apm.network.common.v3.Command;

public class CommandDeserializer {

    public static BaseCommand deserialize(final Command command) {
```

### UtilityClassWithoutPrivateConstructor
Class `ProfileConstants` has only 'static' members, and lacks a 'private' constructor
in `apm-protocol/apm-network/src/main/java/org/apache/skywalking/oap/server/network/constants/ProfileConstants.java`
#### Snippet
```java
 * profile task limit constants
 */
public class ProfileConstants {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ByteUtil` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/util/ByteUtil.java`
#### Snippet
```java
import io.netty.buffer.Unpooled;

public class ByteUtil {
    private static final ThreadLocal<ByteBuf> BYTE_BUFFER = ThreadLocal.withInitial(() -> Unpooled.buffer(8));

```

### UtilityClassWithoutPrivateConstructor
Class `BanyanDBConverter` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/BanyanDBConverter.java`
#### Snippet
```java
import java.util.List;

public class BanyanDBConverter {

    public static final String ID = "id";
```

### UtilityClassWithoutPrivateConstructor
Class `PromOpUtils` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/rt/PromOpUtils.java`
#### Snippet
```java
import org.joda.time.format.PeriodFormatterBuilder;

public class PromOpUtils {
    //Adopt skywalking time step.
    public static Duration timestamp2Duration(long startTS, long endTS) {
```

### UtilityClassWithoutPrivateConstructor
Class `ApplicationStartUp` has only 'static' members, and lacks a 'private' constructor
in `apm-webapp/src/main/java/org/apache/skywalking/oap/server/webapp/ApplicationStartUp.java`
#### Snippet
```java
import com.linecorp.armeria.server.healthcheck.HealthCheckService;

public class ApplicationStartUp {
    public static void main(String[] args) throws Exception {
        final Yaml yaml = new Yaml(
```

### UtilityClassWithoutPrivateConstructor
Class `Addresses` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-receiver-plugin/envoy-metrics-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/envoy/als/k8s/Addresses.java`
#### Snippet
```java
import static org.apache.skywalking.oap.server.library.util.StringUtil.isNotBlank;

public class Addresses {
    public static boolean isValid(final Address address) {
        return nonNull(address)
```

### UtilityClassWithoutPrivateConstructor
Class `OAPServerStartUp` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-starter/src/main/java/org/apache/skywalking/oap/server/starter/OAPServerStartUp.java`
#### Snippet
```java
package org.apache.skywalking.oap.server.starter;

public class OAPServerStartUp {
    public static void main(String[] args) {
        OAPServerBootstrap.start();
```

### UtilityClassWithoutPrivateConstructor
Class `OAPServerBootstrap` has only 'static' members, and lacks a 'private' constructor
in `oap-server/server-starter/src/main/java/org/apache/skywalking/oap/server/starter/OAPServerBootstrap.java`
#### Snippet
```java
 */
@Slf4j
public class OAPServerBootstrap {
    public static void start() {
        String mode = System.getProperty("mode");
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/storage/annotation/BanyanDB.java`
#### Snippet
```java
             * In these cases, it saves much memory space.
             */
            TREE;
        }
    }
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/MetadataRegistry.java`
#### Snippet
```java

    public enum Kind {
        MEASURE, STREAM;
    }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/MetadataRegistry.java`
#### Snippet
```java

    public enum ColumnType {
        TAG, FIELD;
    }

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Dereference of `records` may produce `NullPointerException`
in `oap-server/server-tools/profile-exporter/tool-profile-snapshot-bootstrap/src/main/java/org/apache/skywalking/oap/server/tool/profile/exporter/ProfileSnapshotDumper.java`
#### Snippet
```java
            for (int i = 0; i < rangeCount; i++) {
                List<ProfileThreadSnapshotRecord> records = querySnapshot(snapshotQueryDAO, sequenceRanges.get(i));
                for (ProfileThreadSnapshotRecord record : records) {
                    // transform to proto data and save it
                    ThreadSnapshot.newBuilder()
```

### DataFlowIssue
Variable is already assigned to this value
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/query/type/HeatMap.java`
#### Snippet
```java
            final String key2 = kk2[1];
            if (key1.equals(key2)) {
                result = 0;
            } else if (Bucket.INFINITE_NEGATIVE.equals(key1) || Bucket.INFINITE_POSITIVE.equals(key2)) {
                result = -1;
```

### DataFlowIssue
Dereference of `peek` may produce `NullPointerException`
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/counter/CounterWindow.java`
#### Snippet
```java
        long waterLevel = now - windowSize;
        Tuple2<Long, Double> peek = window.peek();
        if (peek._1 > waterLevel) {
            return peek;
        }
```

### DataFlowIssue
Dereference of `result` may produce `NullPointerException`
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/counter/CounterWindow.java`
#### Snippet
```java

        // Choose the closed slot to the expected timestamp
        if (waterLevel - result._1 <= peek._1 - waterLevel) {
            return result;
        }
```

### DataFlowIssue
Method invocation `getName` may produce `NullPointerException`
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/k8s/K8sInfoRegistry.java`
#### Snippet
```java
                .map(it -> ObjectID
                    .builder()
                    .name(it.getMetadata().getName())
                    .namespace(it.getMetadata().getNamespace())
                    .build())
```

### DataFlowIssue
Method invocation `getName` may produce `NullPointerException`
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/k8s/K8sInfoRegistry.java`
#### Snippet
```java
                return ObjectID
                    .builder()
                    .name(service.get().getMetadata().getName())
                    .namespace(service.get().getMetadata().getNamespace())
                    .build();
```

### DataFlowIssue
Argument `s.getLabels().get("le")` might be null
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/Analyzer.java`
#### Snippet
```java
                              for (int i = 0; i < subSs.size(); i++) {
                                  Sample s = subSs.get(i);
                                  final double leVal = Double.parseDouble(s.getLabels().get("le"));
                                  if (leVal == Double.NEGATIVE_INFINITY) {
                                      bb[i] = Long.MIN_VALUE;
```

### DataFlowIssue
Method invocation `labelNames` may produce `NullPointerException`
in `oap-server/server-telemetry/telemetry-prometheus/src/main/java/org/apache/skywalking/oap/server/telemetry/prometheus/PrometheusHistogramMetrics.java`
#### Snippet
```java
                builder = builder.buckets(buckets);
            }
            return builder.labelNames(labelNames).register();
        }
    }
```

### DataFlowIssue
Switch label `LOGIC_ENDPOINT` is unreachable
in `oap-server/analyzer/agent-analyzer/src/main/java/org/apache/skywalking/oap/server/analyzer/provider/trace/parser/listener/RPCAnalysisListener.java`
#### Snippet
```java
        span.getTagsList().forEach(tag -> {
            switch (tag.getKey()) {
                case LOGIC_ENDPOINT:
                    final JsonObject tagValue = gson.fromJson(tag.getValue(), JsonObject.class);
                    final boolean isLocalSpan = SpanType.Local.equals(span.getSpanType());
```

### DataFlowIssue
Method invocation `getPhase` may produce `NullPointerException`
in `oap-server/server-cluster-plugin/cluster-kubernetes-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/kubernetes/NamespacedPodListInformer.java`
#### Snippet
```java
                                                  .stream()
                                                  .filter(
                                                      item -> "Running".equalsIgnoreCase(item.getStatus().getPhase()))
                                                  .collect(Collectors.toList())
                                       : null);
```

### DataFlowIssue
Method invocation `getPodIP` may produce `NullPointerException`
in `oap-server/server-cluster-plugin/cluster-kubernetes-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/kubernetes/KubernetesCoordinator.java`
#### Snippet
```java
        try {
            initHealthChecker();
            if (StringUtil.isNotBlank(pod.getStatus().getPodIP())) {
                if (port == -1) {
                    port = manager.find(CoreModule.NAME).provider().getService(ConfigService.class).getGRPCPort();
```

### DataFlowIssue
Method invocation `getUid` may produce `NullPointerException`
in `oap-server/server-cluster-plugin/cluster-kubernetes-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/kubernetes/KubernetesCoordinator.java`
#### Snippet
```java

                RemoteInstance remoteInstance = new RemoteInstance(
                    new Address(pod.getStatus().getPodIP(), this.port, pod.getMetadata().getUid().equals(uid)));
                switch (event) {
                    case ADDED:
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `oap-server/server-cluster-plugin/cluster-kubernetes-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/kubernetes/KubernetesCoordinator.java`
#### Snippet
```java

                RemoteInstance remoteInstance = new RemoteInstance(
                    new Address(pod.getStatus().getPodIP(), this.port, pod.getMetadata().getUid().equals(uid)));
                switch (event) {
                    case ADDED:
```

### DataFlowIssue
Method invocation `setUid` may produce `NullPointerException`
in `oap-server/server-cluster-plugin/cluster-kubernetes-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/kubernetes/KubernetesCoordinator.java`
#### Snippet
```java
        v1Pod.setMetadata(new V1ObjectMeta());
        v1Pod.setStatus(new V1PodStatus());
        v1Pod.getMetadata().setUid(uid);
        v1Pod.getStatus().setPodIP("127.0.0.1");
        return Collections.singletonList(v1Pod);
```

### DataFlowIssue
Method invocation `setPodIP` may produce `NullPointerException`
in `oap-server/server-cluster-plugin/cluster-kubernetes-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/kubernetes/KubernetesCoordinator.java`
#### Snippet
```java
        v1Pod.setStatus(new V1PodStatus());
        v1Pod.getMetadata().setUid(uid);
        v1Pod.getStatus().setPodIP("127.0.0.1");
        return Collections.singletonList(v1Pod);
    }
```

### DataFlowIssue
Method invocation `getUid` may produce `NullPointerException`
in `oap-server/server-cluster-plugin/cluster-kubernetes-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/kubernetes/KubernetesCoordinator.java`
#### Snippet
```java
                List<String> uidList = pods
                    .stream()
                    .map(item -> item.getMetadata().getUid())
                    .collect(Collectors.toList());
                log.debug("[kubernetes cluster pods uid list]:{}", uidList);
```

### DataFlowIssue
Method invocation `getPodIP` may produce `NullPointerException`
in `oap-server/server-cluster-plugin/cluster-kubernetes-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/kubernetes/KubernetesCoordinator.java`
#### Snippet
```java
            List<RemoteInstance> remoteInstances =
                pods.stream()
                    .filter(pod -> StringUtil.isNotBlank(pod.getStatus().getPodIP()))
                    .map(pod -> new RemoteInstance(
                        new Address(pod.getStatus().getPodIP(), port, pod.getMetadata().getUid().equals(uid))))
```

### DataFlowIssue
Method invocation `getUid` may produce `NullPointerException`
in `oap-server/server-cluster-plugin/cluster-kubernetes-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/kubernetes/KubernetesCoordinator.java`
#### Snippet
```java
                    .filter(pod -> StringUtil.isNotBlank(pod.getStatus().getPodIP()))
                    .map(pod -> new RemoteInstance(
                        new Address(pod.getStatus().getPodIP(), port, pod.getMetadata().getUid().equals(uid))))
                    .collect(Collectors.toList());
            healthChecker.health();
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `oap-server/server-cluster-plugin/cluster-kubernetes-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/kubernetes/KubernetesCoordinator.java`
#### Snippet
```java
                    .filter(pod -> StringUtil.isNotBlank(pod.getStatus().getPodIP()))
                    .map(pod -> new RemoteInstance(
                        new Address(pod.getStatus().getPodIP(), port, pod.getMetadata().getUid().equals(uid))))
                    .collect(Collectors.toList());
            healthChecker.health();
```

### DataFlowIssue
Method invocation `getName` may produce `NullPointerException`
in `oap-server/server-receiver-plugin/envoy-metrics-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/envoy/als/k8s/K8SServiceRegistry.java`
#### Snippet
```java
        }
        serviceMetaInfo.setServiceInstanceName(
            String.format("%s.%s", podMetadata.getName(), podMetadata.getNamespace()));
        serviceMetaInfo.setTags(transformLabelsToTags(podMetadata));

```

### DataFlowIssue
Method reference invocation `V1NodeStatus::getAddresses` may produce `NullPointerException`
in `oap-server/server-receiver-plugin/envoy-metrics-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/envoy/als/k8s/K8SServiceRegistry.java`
#### Snippet
```java
                    .stream()
                    .map(V1Node::getStatus)
                    .map(V1NodeStatus::getAddresses)
                    .flatMap(it -> it.stream().map(V1NodeAddress::getAddress)
                        .filter(StringUtil::isNotBlank))
```

### DataFlowIssue
Method invocation `stream` may produce `NullPointerException`
in `oap-server/server-receiver-plugin/envoy-metrics-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/envoy/als/k8s/K8SServiceRegistry.java`
#### Snippet
```java
                    .map(V1Node::getStatus)
                    .map(V1NodeStatus::getAddresses)
                    .flatMap(it -> it.stream().map(V1NodeAddress::getAddress)
                        .filter(StringUtil::isNotBlank))
                    .collect(toSet());
```

### DataFlowIssue
Argument `s.labels.get(le)` might be null
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/SampleFamily.java`
#### Snippet
```java
                Arrays.stream(samples)
                      .filter(s -> s.labels.containsKey(le))
                      .sorted(Comparator.comparingDouble(s -> Double.parseDouble(s.labels.get(le))))
                      .map(s -> {
                          double r = s.value;
```

### DataFlowIssue
Argument `s.labels.get(le)` might be null
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/SampleFamily.java`
#### Snippet
```java
                                                                        .put(
                                                                            "le",
                                                                            String.valueOf((long) ((Double.parseDouble(s.labels.get(le))) * scale)))
                                                                        .build();
                          return InternalOps.newSample(s.name, ll, s.timestamp, r);
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/cache/CacheUpdateTimer.java`
#### Snippet
```java
                    .getCacheEndTimeBucket(), null);

            taskList.stream().collect(Collectors.groupingBy(t -> t.getServiceId())).entrySet().stream().forEach(e -> {
                final String serviceId = e.getKey();
                final List<ProfileTask> profileTasks = e.getValue();
```

### SimplifyStreamApiCallChains
Can be replaced with 'java.util.ArrayList' constructor
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/data/MergableBufferedData.java`
#### Snippet
```java
    public List<METRICS> read() {
        try {
            return buffer.values().stream().collect(Collectors.toList());
        } finally {
            buffer.clear();
```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCSQLExecutor.java`
#### Snippet
```java
            }
        }
        sqlBuilder.append(queries.stream().collect(Collectors.joining(", ")));
        sqlBuilder.append(" WHERE id = ?");
        param.add(TableHelper.generateId(model, metrics.id().build()));
```

### SimplifyStreamApiCallChains
Can be replaced with 'collection.toArray()'
in `oap-server/server-receiver-plugin/skywalking-zabbix-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/zabbix/provider/ZabbixMetrics.java`
#### Snippet
```java
                    .entrySet().stream().collect(toImmutableMap(
                        Map.Entry::getKey,
                        e -> SampleFamilyBuilder.newBuilder(e.getValue().stream().toArray(Sample[]::new)).build()));

                sampleFamilies = families.values();
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `oap-server/server-receiver-plugin/skywalking-ebpf-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/ebpf/provider/handler/EBPFProcessServiceHandler.java`
#### Snippet
```java
        // report process and downstream the process id data
        final EBPFReportProcessDownstream.Builder builder = EBPFReportProcessDownstream.newBuilder();
        processes.stream().forEach(e -> {
            sourceReceiver.receive(e._1);
            builder.addProcesses(e._2);
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
`toLowerCase()` call can be replaced with 'equalsIgnoreCase()'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/config/DownSamplingConfigService.java`
#### Snippet
```java
    public DownSamplingConfigService(List<String> downsampling) {
        downsampling.forEach(value -> {
            if (DownSampling.Hour.getName().toLowerCase().equals(value.toLowerCase())) {
                shouldToHour = true;
            } else if (DownSampling.Day.getName().toLowerCase().equals(value.toLowerCase())) {
```

### StringOperationCanBeSimplified
`toLowerCase()` call can be replaced with 'equalsIgnoreCase()'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/config/DownSamplingConfigService.java`
#### Snippet
```java
            if (DownSampling.Hour.getName().toLowerCase().equals(value.toLowerCase())) {
                shouldToHour = true;
            } else if (DownSampling.Day.getName().toLowerCase().equals(value.toLowerCase())) {
                shouldToDay = true;
            }
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'getPhysicalColumnName' is still used
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/base/IndexController.java`
#### Snippet
```java
         */
        @Deprecated
        public static String getPhysicalColumnName(String modelName, String columnName) {
            if (!IndexController.INSTANCE.logicSharding) {
                return columnName;
```

### DeprecatedIsStillUsed
Deprecated member 'STATUS_CODE' is still used
in `oap-server/analyzer/agent-analyzer/src/main/java/org/apache/skywalking/oap/server/analyzer/provider/trace/parser/SpanTags.java`
#### Snippet
```java
     */
    @Deprecated
    public static final String STATUS_CODE = "status_code";

    public static final String RPC_RESPONSE_STATUS_CODE = "rpc.status_code";
```

### DeprecatedIsStillUsed
Deprecated member 'AggregationQuery' is still used
in `oap-server/server-query-plugin/query-graphql-plugin/src/main/java/org/apache/skywalking/oap/query/graphql/resolver/AggregationQuery.java`
#### Snippet
```java
 */
@Deprecated
public class AggregationQuery implements GraphQLQueryResolver {
    private MetricsQuery query;

```

### DeprecatedIsStillUsed
Deprecated member 'TopNRecordsQuery' is still used
in `oap-server/server-query-plugin/query-graphql-plugin/src/main/java/org/apache/skywalking/oap/query/graphql/resolver/TopNRecordsQuery.java`
#### Snippet
```java
 */
@Deprecated
public class TopNRecordsQuery implements GraphQLQueryResolver {
    private MetricsQuery query;

```

### DeprecatedIsStillUsed
Deprecated member 'MetadataQuery' is still used
in `oap-server/server-query-plugin/query-graphql-plugin/src/main/java/org/apache/skywalking/oap/query/graphql/resolver/MetadataQuery.java`
#### Snippet
```java
 */
@Deprecated
public class MetadataQuery implements GraphQLQueryResolver {

    private final ModuleManager moduleManager;
```

### DeprecatedIsStillUsed
Deprecated member 'MetricQuery' is still used
in `oap-server/server-query-plugin/query-graphql-plugin/src/main/java/org/apache/skywalking/oap/query/graphql/resolver/MetricQuery.java`
#### Snippet
```java
@Deprecated
@Slf4j
public class MetricQuery implements GraphQLQueryResolver {
    private MetricsQuery query;

```

## RuleId[id=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains collection `List`
in `oap-server/analyzer/log-analyzer/src/main/java/org/apache/skywalking/oap/log/analyzer/dsl/Binding.java`
#### Snippet
```java
    }

    public Optional<List<SampleFamily>> metricsContainer() {
        // noinspection unchecked
        return Optional.ofNullable((List<SampleFamily>) getProperty(KEY_METRICS_CONTAINER));
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `oap-server/analyzer/log-analyzer/src/main/java/org/apache/skywalking/oap/log/analyzer/dsl/spec/extractor/ExtractorSpec.java`
#### Snippet
```java
        final SampleFamily sampleFamily = SampleFamilyBuilder.newBuilder(sample).build();

        final Optional<List<SampleFamily>> possibleMetricsContainer = BINDING.get().metricsContainer();

        if (possibleMetricsContainer.isPresent()) {
```

### OptionalContainsCollection
'Optional' contains array `String[]`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/storage/StorageID.java`
#### Snippet
```java
        private final Object value;

        public Optional<String[]> getName() {
            return Optional.ofNullable(name);
        }
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `oap-server/server-cluster-plugin/cluster-kubernetes-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/kubernetes/NamespacedPodListInformer.java`
#### Snippet
```java
    }

    public Optional<List<V1Pod>> listPods() {
        if (isNull(podLister)) {
            return Optional.empty();
```

### OptionalContainsCollection
'Optional' contains array `String[]`
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/measure/BanyanDBMetricsDAO.java`
#### Snippet
```java
        AnalyticalResult result = new AnalyticalResult();
        for (StorageID.Fragment f : fragments) {
            Optional<String[]> cols = f.getName();
            if (cols.isPresent()) {
                result.cols.add(cols.get());
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/cache/CacheUpdateTimer.java`
#### Snippet
```java
                    .getCacheEndTimeBucket(), null);

            taskList.stream().collect(Collectors.groupingBy(t -> t.getServiceId())).entrySet().stream().forEach(e -> {
                final String serviceId = e.getKey();
                final List<ProfileTask> profileTasks = e.getValue();
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/Analyzer.java`
#### Snippet
```java
            if (entity.getInstanceProperties() != null && !entity.getInstanceProperties().isEmpty()) {
                final JsonObject properties = new JsonObject();
                entity.getInstanceProperties().forEach((k, v) -> properties.addProperty(k, v));
                instanceTraffic.setProperties(properties);
            }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `oap-server/server-query-plugin/query-graphql-plugin/src/main/java/org/apache/skywalking/oap/query/graphql/resolver/MetricQuery.java`
#### Snippet
```java
                }
            }).collect(Collectors.toList());
            ints.forEach(v -> values.addKVInt(v));

        }
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'moduleManager' in a Serializable class
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/storage/ttl/DataTTLKeeperTimer.java`
#### Snippet
```java
    INSTANCE;

    private ModuleManager moduleManager;
    private ClusterNodesQuery clusterNodesQuery;
    private CoreModuleConfig moduleConfig;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'moduleConfig' in a Serializable class
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/storage/ttl/DataTTLKeeperTimer.java`
#### Snippet
```java
    private ModuleManager moduleManager;
    private ClusterNodesQuery clusterNodesQuery;
    private CoreModuleConfig moduleConfig;

    public void start(ModuleManager moduleManager, CoreModuleConfig moduleConfig) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'factory' in a Serializable class
in `oap-server/server-cluster-plugin/cluster-kubernetes-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/kubernetes/NamespacedPodListInformer.java`
#### Snippet
```java
    private Lister<V1Pod> podLister;

    private SharedInformerFactory factory;

    private final ExecutorService executorService = Executors.newSingleThreadExecutor(r -> {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'podLister' in a Serializable class
in `oap-server/server-cluster-plugin/cluster-kubernetes-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/kubernetes/NamespacedPodListInformer.java`
#### Snippet
```java
    INFORMER;

    private Lister<V1Pod> podLister;

    private SharedInformerFactory factory;
```

## RuleId[id=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `updateContext()` during object construction
in `oap-server/server-library/library-server/src/main/java/org/apache/skywalking/oap/server/library/server/ssl/AbstractSslContext.java`
#### Snippet
```java

    protected AbstractSslContext(final String caFile) {
        updateContext(caFile);
        monitor = new MultipleFilesChangeMonitor(
            10,
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `updateContext()` during object construction
in `oap-server/server-library/library-server/src/main/java/org/apache/skywalking/oap/server/library/server/ssl/AbstractSslContext.java`
#### Snippet
```java

    protected AbstractSslContext(final String privateKeyFile, final String certChainFile, final String trustedCAsFile) {
        updateContext(privateKeyFile, certChainFile, trustedCAsFile);
        monitor = new MultipleFilesChangeMonitor(
            10,
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
Unnecessary 'contains()' check
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/base/IndexStructures.java`
#### Snippet
```java
            excludes.addAll(inputExcludes);
            fields.properties.keySet().forEach(p -> {
                if (!inputExcludes.contains(p) && excludes.contains(p)) {
                    excludes.remove(p);
                }
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/storage/annotation/SQLDatabase.java`
#### Snippet
```java

        /**
         * @return list of other column should be add into the unified index.
         */
        String[] withColumns();
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `oap-server/exporter/src/main/java/org/apache/skywalking/oap/server/exporter/provider/grpc/GRPCMetricsExporter.java`
#### Snippet
```java
                sleepTime += cycle;
                Thread.sleep(cycle);
            } catch (InterruptedException e) {
            }

```

### CatchMayIgnoreException
Empty `catch` block
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/meter/MeterSystem.java`
#### Snippet
```java
            log.info("Metric {} is already defined, so skip the metric creation.", metricsName);
            return;
        } catch (NotFoundException e) {
        }

```

### CatchMayIgnoreException
Empty `catch` block
in `oap-server/server-library/library-datacarrier-queue/src/main/java/org/apache/skywalking/oap/server/library/datacarrier/EnvUtil.java`
#### Snippet
```java
            try {
                value = Long.parseLong(envValue);
            } catch (NumberFormatException e) {

            }
```

### CatchMayIgnoreException
Empty `catch` block
in `oap-server/server-library/library-datacarrier-queue/src/main/java/org/apache/skywalking/oap/server/library/datacarrier/EnvUtil.java`
#### Snippet
```java
            try {
                value = Integer.parseInt(envValue);
            } catch (NumberFormatException e) {

            }
```

### CatchMayIgnoreException
Empty `catch` block
in `oap-server/server-library/library-datacarrier-queue/src/main/java/org/apache/skywalking/oap/server/library/datacarrier/consumer/MultipleChannelsConsumer.java`
#### Snippet
```java
                try {
                    Thread.sleep(consumeCycle);
                } catch (InterruptedException e) {
                }
            }
```

### CatchMayIgnoreException
Empty `catch` block
in `oap-server/server-library/library-datacarrier-queue/src/main/java/org/apache/skywalking/oap/server/library/datacarrier/consumer/ConsumerThread.java`
#### Snippet
```java
                try {
                    Thread.sleep(consumeCycle);
                } catch (InterruptedException e) {
                }
            }
```

### CatchMayIgnoreException
Empty `catch` block
in `oap-server/oal-rt/src/main/java/org/apache/skywalking/oal/rt/OALRuntime.java`
#### Snippet
```java
                    try {
                        printWriter.close();
                    } catch (IOException e) {

                    }
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/PropertyPlaceholderHelper.java`
#### Snippet
```java
    }

    protected String parseStringValue(String value, PlaceholderResolver placeholderResolver,
                                      Set<String> visitedPlaceholders) {

```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `oap-server/server-library/library-module/src/main/java/org/apache/skywalking/oap/server/library/module/BootstrapFlow.java`
#### Snippet
```java
                        startupSequence.add(provider);
                        allProviders.remove(i);
                        i--;
                    }
                } else {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `oap-server/server-library/library-module/src/main/java/org/apache/skywalking/oap/server/library/module/BootstrapFlow.java`
#### Snippet
```java
                    startupSequence.add(provider);
                    allProviders.remove(i);
                    i--;
                }
            }
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `oap-server/server-library/library-module/src/main/java/org/apache/skywalking/oap/server/library/module/ModuleManager.java`
#### Snippet
```java

        if (moduleSet.size() > 0) {
            throw new ModuleNotFoundException(moduleSet.toString() + " missing.");
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/meter/MeterEntity.java`
#### Snippet
```java
                ));
            default:
                throw new UnexpectedException("Unexpected scope type of entity " + this.toString());
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `oap-server/server-configuration/configuration-api/src/main/java/org/apache/skywalking/oap/server/configuration/api/ConfigWatcherRegister.java`
#### Snippet
```java
            if (log.isTraceEnabled()) {
                log.trace(
                    "Current configurations after the sync." + LINE_SEPARATOR + singleConfigChangeWatcherRegister.toString());
            }
        });
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `oap-server/server-configuration/configuration-api/src/main/java/org/apache/skywalking/oap/server/configuration/api/ConfigWatcherRegister.java`
#### Snippet
```java
            default:
                throw new IllegalArgumentException(
                    "Unexpected watch type of ConfigChangeWatcher " + watcher.toString());
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `oap-server/server-configuration/configuration-api/src/main/java/org/apache/skywalking/oap/server/configuration/api/ConfigWatcherRegister.java`
#### Snippet
```java
        isStarted = true;

        log.info("Current configurations after the bootstrap sync." + LINE_SEPARATOR + singleConfigChangeWatcherRegister.toString());

        Executors.newSingleThreadScheduledExecutor()
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `oap-server/server-configuration/configuration-api/src/main/java/org/apache/skywalking/oap/server/configuration/api/ConfigWatcherRegister.java`
#### Snippet
```java
            if (log.isTraceEnabled()) {
                log.trace(
                    "Current configurations after the sync." + LINE_SEPARATOR + groupConfigChangeWatcherRegister.toString());
            }
        });
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `oap-server/server-starter/src/main/java/org/apache/skywalking/oap/server/starter/config/ApplicationConfigLoader.java`
#### Snippet
```java
                        providerName,
                        propertyName,
                        replaceValue.toString()
                    );
                }
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `AnnotationListenerCache` may be 'static'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/annotation/AnnotationScan.java`
#### Snippet
```java
    }

    private class AnnotationListenerCache {
        private AnnotationListener listener;
        private List<Class<?>> matchedClass;
```

### InnerClassMayBeStatic
Inner class `SampleData` may be 'static'
in `oap-server/microbench/src/main/java/org/apache/skywalking/oap/server/microbench/library/datacarrier/LinkedArrayBenchmark.java`
#### Snippet
```java
     * Test Data
     */
    public class SampleData {

        private int intValue;
```

## RuleId[id=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/continuous/ContinuousProfilingMutationService.java`
#### Snippet
```java

    private String validateTargets(List<ContinuousProfilingPolicyTargetCreation> targets) {
        final HashSet<ContinuousProfilingTargetType> targetCache = new HashSet<>();
        for (ContinuousProfilingPolicyTargetCreation target : targets) {
            // same target type cannot have multiple
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/continuous/ContinuousProfilingMutationService.java`
#### Snippet
```java
            targetCache.add(targetType);

            final HashSet<ContinuousProfilingMonitorType> monitorTypeCache = new HashSet<>();
            for (ContinuousProfilingPolicyItemCreation item : target.getCheckItems()) {
                // save check type cannot have multiple in each target
```

## RuleId[id=SwitchStatementWithConfusingDeclaration]
### SwitchStatementWithConfusingDeclaration
Local variable `timeBucket` declared in one 'switch' branch and used in another
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/query/DurationUtils.java`
#### Snippet
```java
                case DAY:
                    dateTime = dateTime.plusDays(1);
                    String timeBucket = YYYYMMDD.print(dateTime);
                    durations.add(new PointOfTime(Long.parseLong(timeBucket)));
                    break;
```

### SwitchStatementWithConfusingDeclaration
Local variable `lexpected` declared in one 'switch' branch and used in another
in `oap-server/server-alarm-plugin/src/main/java/org/apache/skywalking/oap/server/core/alarm/provider/RunningRule.java`
#### Snippet
```java
                    case LONG:
                        long lvalue = ((LongValueHolder) metrics).getValue();
                        long lexpected = RunningRule.this.threshold.getLongThreshold();
                        if (op.test(lexpected, lvalue)) {
                            matchCount++;
```

### SwitchStatementWithConfusingDeclaration
Local variable `ivalue` declared in one 'switch' branch and used in another
in `oap-server/server-alarm-plugin/src/main/java/org/apache/skywalking/oap/server/core/alarm/provider/RunningRule.java`
#### Snippet
```java
                        break;
                    case INT:
                        int ivalue = ((IntValueHolder) metrics).getValue();
                        int iexpected = RunningRule.this.threshold.getIntThreshold();
                        if (op.test(iexpected, ivalue)) {
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `oap-server/analyzer/log-analyzer/src/main/java/org/apache/skywalking/oap/log/analyzer/provider/LALConfigs.java`
#### Snippet
```java
                         .filter(File::isFile)
                         .filter(it -> {
                             //noinspection UnstableApiUsage
                             return files.contains(getNameWithoutExtension(it.getName()));
                         })
```

### RedundantSuppression
Redundant suppression
in `oap-server/oal-rt/src/main/java/org/apache/skywalking/oal/rt/parser/FilterMatchers.java`
#### Snippet
```java

@SuppressWarnings("UnstableApiUsage")
public enum FilterMatchers {
    INSTANCE;

```

### RedundantSuppression
Redundant suppression
in `oap-server/oal-rt/src/main/java/org/apache/skywalking/oal/rt/parser/MetricsHolder.java`
#### Snippet
```java

@SuppressWarnings("UnstableApiUsage")
public class MetricsHolder {
    private static final Map<String, Class<? extends Metrics>> REGISTER = new HashMap<>();
    private static volatile boolean INITIALIZED = false;
```

### RedundantSuppression
Redundant suppression
in `oap-server/server-configuration/configuration-consul/src/main/java/org/apache/skywalking/oap/server/configuration/consul/ConsulConfigurationWatcherRegister.java`
#### Snippet
```java
@SuppressWarnings("UnstableApiUsage")
@Slf4j
public class ConsulConfigurationWatcherRegister extends ConfigWatcherRegister {
    private static final int DEFAULT_PORT = 8500;

```

### RedundantSuppression
Redundant suppression
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/ApdexThresholdConfig.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    private void updateConfig(final Reader contentRender) {
        dictionary = new Yaml(new SafeConstructor(new LoaderOptions())).load(contentRender);
        if (dictionary == null) {
```

### RedundantSuppression
Redundant suppression
in `oap-server/server-receiver-plugin/configuration-discovery-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/recevier/configuration/discovery/AgentConfigurationsReader.java`
#### Snippet
```java
                        });

                        // noinspection UnstableApiUsage
                        AgentConfigurations agentConfigurations = new AgentConfigurations(
                            k.toString(), config,
```

### RedundantSuppression
Redundant suppression
in `oap-server/server-receiver-plugin/configuration-discovery-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/recevier/configuration/discovery/AgentConfigurationsWatcher.java`
#### Snippet
```java
        this.settingsString = null;
        this.agentConfigurationsTable = new AgentConfigurationsTable();
        // noinspection UnstableApiUsage
        this.emptyAgentConfigurations = new AgentConfigurations(
            null, new HashMap<>(),
```

## RuleId[id=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `ALL_METRICS`
in `oap-server/server-telemetry/telemetry-prometheus/src/main/java/org/apache/skywalking/oap/server/telemetry/prometheus/BaseMetrics.java`
#### Snippet
```java

                        if (!ALL_METRICS.containsKey(name)) {
                            synchronized (ALL_METRICS) {
                                if (!ALL_METRICS.containsKey(name)) {
                                    ALL_METRICS.put(name, create(labelNames));
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'serviceName'
in `oap-server/server-query-plugin/zipkin-query-plugin/src/main/java/org/apache/skywalking/oap/query/zipkin/handler/ZipkinQueryHandler.java`
#### Snippet
```java
    @Blocking
    public AggregatedHttpResponse getTraces(
        @Param("serviceName") Optional<String> serviceName,
        @Param("remoteServiceName") Optional<String> remoteServiceName,
        @Param("spanName") Optional<String> spanName,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'remoteServiceName'
in `oap-server/server-query-plugin/zipkin-query-plugin/src/main/java/org/apache/skywalking/oap/query/zipkin/handler/ZipkinQueryHandler.java`
#### Snippet
```java
    public AggregatedHttpResponse getTraces(
        @Param("serviceName") Optional<String> serviceName,
        @Param("remoteServiceName") Optional<String> remoteServiceName,
        @Param("spanName") Optional<String> spanName,
        @Param("annotationQuery") Optional<String> annotationQuery,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'spanName'
in `oap-server/server-query-plugin/zipkin-query-plugin/src/main/java/org/apache/skywalking/oap/query/zipkin/handler/ZipkinQueryHandler.java`
#### Snippet
```java
        @Param("serviceName") Optional<String> serviceName,
        @Param("remoteServiceName") Optional<String> remoteServiceName,
        @Param("spanName") Optional<String> spanName,
        @Param("annotationQuery") Optional<String> annotationQuery,
        @Param("minDuration") Optional<Long> minDuration,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'annotationQuery'
in `oap-server/server-query-plugin/zipkin-query-plugin/src/main/java/org/apache/skywalking/oap/query/zipkin/handler/ZipkinQueryHandler.java`
#### Snippet
```java
        @Param("remoteServiceName") Optional<String> remoteServiceName,
        @Param("spanName") Optional<String> spanName,
        @Param("annotationQuery") Optional<String> annotationQuery,
        @Param("minDuration") Optional<Long> minDuration,
        @Param("maxDuration") Optional<Long> maxDuration,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'minDuration'
in `oap-server/server-query-plugin/zipkin-query-plugin/src/main/java/org/apache/skywalking/oap/query/zipkin/handler/ZipkinQueryHandler.java`
#### Snippet
```java
        @Param("spanName") Optional<String> spanName,
        @Param("annotationQuery") Optional<String> annotationQuery,
        @Param("minDuration") Optional<Long> minDuration,
        @Param("maxDuration") Optional<Long> maxDuration,
        @Param("endTs") Optional<Long> endTs,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'maxDuration'
in `oap-server/server-query-plugin/zipkin-query-plugin/src/main/java/org/apache/skywalking/oap/query/zipkin/handler/ZipkinQueryHandler.java`
#### Snippet
```java
        @Param("annotationQuery") Optional<String> annotationQuery,
        @Param("minDuration") Optional<Long> minDuration,
        @Param("maxDuration") Optional<Long> maxDuration,
        @Param("endTs") Optional<Long> endTs,
        @Param("lookback") Optional<Long> lookback,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'endTs'
in `oap-server/server-query-plugin/zipkin-query-plugin/src/main/java/org/apache/skywalking/oap/query/zipkin/handler/ZipkinQueryHandler.java`
#### Snippet
```java
        @Param("minDuration") Optional<Long> minDuration,
        @Param("maxDuration") Optional<Long> maxDuration,
        @Param("endTs") Optional<Long> endTs,
        @Param("lookback") Optional<Long> lookback,
        @Default("10") @Param("limit") int limit) throws IOException {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'lookback'
in `oap-server/server-query-plugin/zipkin-query-plugin/src/main/java/org/apache/skywalking/oap/query/zipkin/handler/ZipkinQueryHandler.java`
#### Snippet
```java
        @Param("maxDuration") Optional<Long> maxDuration,
        @Param("endTs") Optional<Long> endTs,
        @Param("lookback") Optional<Long> lookback,
        @Default("10") @Param("limit") int limit) throws IOException {
        QueryRequest queryRequest =
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'routing'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/storage/model/ElasticSearchModelExtension.java`
#### Snippet
```java
     */
    @Getter
    private Optional<String> routing = Optional.empty();

    public void setRouting(String modelName, List<ModelColumn> modelColumns) throws IllegalStateException {
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'nextExportWorker'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/worker/RecordPersistentWorker.java`
#### Snippet
```java
    private final IRecordDAO recordDAO;
    private final IBatchDAO batchDAO;
    private final Optional<AbstractWorker<Record>> nextExportWorker;

    RecordPersistentWorker(ModuleDefineHolder moduleDefineHolder, Model model, IRecordDAO recordDAO, AbstractWorker<Record> nextExportWorker) {
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'nextExportWorker'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/worker/MetricsPersistentWorker.java`
#### Snippet
```java
    private final IMetricsDAO metricsDAO;
    private final Optional<AbstractWorker<Metrics>> nextAlarmWorker;
    private final Optional<AbstractWorker<ExportEvent>> nextExportWorker;
    private final DataCarrier<Metrics> dataCarrier;
    private final Optional<MetricsTransWorker> transWorker;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'nextAlarmWorker'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/worker/MetricsPersistentWorker.java`
#### Snippet
```java
    private final MetricsSessionCache sessionCache;
    private final IMetricsDAO metricsDAO;
    private final Optional<AbstractWorker<Metrics>> nextAlarmWorker;
    private final Optional<AbstractWorker<ExportEvent>> nextExportWorker;
    private final DataCarrier<Metrics> dataCarrier;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'transWorker'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/worker/MetricsPersistentWorker.java`
#### Snippet
```java
    private final Optional<AbstractWorker<ExportEvent>> nextExportWorker;
    private final DataCarrier<Metrics> dataCarrier;
    private final Optional<MetricsTransWorker> transWorker;
    private final boolean supportUpdate;
    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'routing'
in `oap-server/server-library/library-elasticsearch-client/src/main/java/org/apache/skywalking/library/elasticsearch/requests/IndexRequest.java`
#### Snippet
```java
     */
    @Builder.Default
    private final Optional<String> routing = Optional.empty();
    private final Map<String, ?> doc;
}
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'time'
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/handler/PromQLApiHandler.java`
#### Snippet
```java
    public HttpResponse query(
        @Param("query") String query,
        @Param("time") Optional<String> time,
        @Param("timeout") Optional<String> timeout) throws IOException {
        long endTS = System.currentTimeMillis();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'timeout'
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/handler/PromQLApiHandler.java`
#### Snippet
```java
        @Param("query") String query,
        @Param("time") Optional<String> time,
        @Param("timeout") Optional<String> timeout) throws IOException {
        long endTS = System.currentTimeMillis();
        if (time.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'match'
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/handler/PromQLApiHandler.java`
#### Snippet
```java
    @Path("/api/v1/labels")
    public HttpResponse labels(
        @Param("match[]") Optional<String> match,
        @Param("start") Optional<String> start,
        @Param("end") Optional<String> end) throws IOException {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'start'
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/handler/PromQLApiHandler.java`
#### Snippet
```java
    public HttpResponse labels(
        @Param("match[]") Optional<String> match,
        @Param("start") Optional<String> start,
        @Param("end") Optional<String> end) throws IOException {
        LabelsQueryRsp response = new LabelsQueryRsp();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'end'
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/handler/PromQLApiHandler.java`
#### Snippet
```java
        @Param("match[]") Optional<String> match,
        @Param("start") Optional<String> start,
        @Param("end") Optional<String> end) throws IOException {
        LabelsQueryRsp response = new LabelsQueryRsp();
        if (match.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'limit'
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/handler/PromQLApiHandler.java`
#### Snippet
```java
    @Path("/api/v1/metadata")
    public HttpResponse metadata(
        @Param("limit") Optional<Integer> limit,
        @Param("metric") Optional<String> metric) throws JsonProcessingException {
        MetadataQueryRsp response = new MetadataQueryRsp();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'metric'
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/handler/PromQLApiHandler.java`
#### Snippet
```java
    public HttpResponse metadata(
        @Param("limit") Optional<Integer> limit,
        @Param("metric") Optional<String> metric) throws JsonProcessingException {
        MetadataQueryRsp response = new MetadataQueryRsp();
        response.setStatus(ResultStatus.SUCCESS);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'match'
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/handler/PromQLApiHandler.java`
#### Snippet
```java
    public HttpResponse labelValues(
        @Param("label_name") String labelName,
        @Param("match[]") Optional<String> match,
        @Param("start") Optional<String> start,
        @Param("end") Optional<String> end) throws IOException {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'start'
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/handler/PromQLApiHandler.java`
#### Snippet
```java
        @Param("label_name") String labelName,
        @Param("match[]") Optional<String> match,
        @Param("start") Optional<String> start,
        @Param("end") Optional<String> end) throws IOException {
        LabelValuesQueryRsp response = new LabelValuesQueryRsp();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'end'
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/handler/PromQLApiHandler.java`
#### Snippet
```java
        @Param("match[]") Optional<String> match,
        @Param("start") Optional<String> start,
        @Param("end") Optional<String> end) throws IOException {
        LabelValuesQueryRsp response = new LabelValuesQueryRsp();
        response.setStatus(ResultStatus.SUCCESS);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'step'
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/handler/PromQLApiHandler.java`
#### Snippet
```java
        @Param("start") String start,
        @Param("end") String end,
        @Param("step") Optional<String> step,
        @Param("timeout") Optional<String> timeout) throws IOException {
        long startTS = formatTimestamp2Millis(start);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'timeout'
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/handler/PromQLApiHandler.java`
#### Snippet
```java
        @Param("end") String end,
        @Param("step") Optional<String> step,
        @Param("timeout") Optional<String> timeout) throws IOException {
        long startTS = formatTimestamp2Millis(start);
        long endTS = formatTimestamp2Millis(end);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'routing'
in `oap-server/server-library/library-client/src/main/java/org/apache/skywalking/oap/server/library/client/elasticsearch/IndexRequestWrapper.java`
#### Snippet
```java

    public IndexRequestWrapper(String index, String type, String id,
                               Optional<String> routing,
                               Map<String, ?> source) {
        request = IndexRequest.builder()
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'valueLabel'
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/rt/PromQLExprQueryVisitor.java`
#### Snippet
```java
                                       Scope scope,
                                       Map<LabelName, String> labelMap,
                                       Optional<String> valueLabel,
                                       Optional<String> topNEntityName,
                                       Optional<String> recordName) throws IllegalExpressionException {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'topNEntityName'
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/rt/PromQLExprQueryVisitor.java`
#### Snippet
```java
                                       Map<LabelName, String> labelMap,
                                       Optional<String> valueLabel,
                                       Optional<String> topNEntityName,
                                       Optional<String> recordName) throws IllegalExpressionException {

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'recordName'
in `oap-server/server-query-plugin/promql-plugin/src/main/java/org/apache/skywalking/oap/query/promql/rt/PromQLExprQueryVisitor.java`
#### Snippet
```java
                                       Optional<String> valueLabel,
                                       Optional<String> topNEntityName,
                                       Optional<String> recordName) throws IllegalExpressionException {

        MetricInfo metricInfo = new MetricInfo(metricName);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'routingValue'
in `oap-server/server-library/library-client/src/main/java/org/apache/skywalking/oap/server/library/client/elasticsearch/ElasticSearchClient.java`
#### Snippet
```java
    }

    public IndexRequestWrapper prepareInsert(String indexName, String id, Optional<String> routingValue,
                                             Map<String, Object> source) {
        indexName = indexNameConverter.apply(indexName);
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `oap-server/server-cluster-plugin/cluster-etcd-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/etcd/ClusterModuleEtcdConfig.java`
#### Snippet
```java

    public String[] getEndpointArray() {
        return Arrays.stream(endpoints.split("\\s*,\\s*")).toArray(String[]::new);

    }
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/prometheus/parser/TextParser.java`
#### Snippet
```java
        }
        if (line.charAt(0) == '#') {
            String[] parts = line.split("[ \t]+", 4);
            if (parts.length < 3) {
                return false;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `oap-server/server-query-plugin/zipkin-query-plugin/src/main/java/org/apache/skywalking/oap/query/zipkin/handler/ZipkinQueryHandler.java`
#### Snippet
```java

    private String formatEventTagKey(String name) {
        return name.replaceAll(" ", ".").toLowerCase(Locale.ROOT);
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/WorkPath.java`
#### Snippet
```java

    private static File findPath() {
        String classResourcePath = WorkPath.class.getName().replaceAll("\\.", "/") + ".class";

        URL resource = ClassLoader.getSystemClassLoader().getResource(classResourcePath);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/query/DurationUtils.java`
#### Snippet
```java
    public long convertToTimeBucket(Step step, String dateStr) {
        verifyDateTimeString(step, dateStr);
        dateStr = dateStr.replaceAll(Const.LINE, Const.EMPTY_STRING);
        dateStr = dateStr.replaceAll(Const.SPACE, Const.EMPTY_STRING);
        return Long.parseLong(dateStr);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/query/DurationUtils.java`
#### Snippet
```java
        verifyDateTimeString(step, dateStr);
        dateStr = dateStr.replaceAll(Const.LINE, Const.EMPTY_STRING);
        dateStr = dateStr.replaceAll(Const.SPACE, Const.EMPTY_STRING);
        return Long.parseLong(dateStr);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/config/group/openapi/EndpointGroupingRule4Openapi.java`
#### Snippet
```java

        private int getPatternVarsCount(String pattern) {
            return ",".concat(pattern).concat(",").split(VAR_PATTERN).length - 1;
        }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/config/group/openapi/EndpointGroupingRule4Openapi.java`
#### Snippet
```java

        private int getPatternLength(String pattern) {
            return pattern.replaceAll(VAR_PATTERN, "#").length();
        }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/config/group/openapi/EndpointGroupingRuleReader4Openapi.java`
#### Snippet
```java

        if (isTemplatePath(endPointNameMatchRule)) {
            return endPointNameMatchRule.replaceAll("\\{(.+?)}", "([^/]+)");
        }
        return endPointNameMatchRule;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/config/group/openapi/EndpointGroupingRuleReader4Openapi.java`
#### Snippet
```java

    private String replaceTemplateVars(String template, String pathString, String requstMathod) {
        return template.replaceAll("\\$\\{METHOD}", requstMathod)
                       .replaceAll("\\$\\{PATH}", pathString);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/config/group/openapi/EndpointGroupingRuleReader4Openapi.java`
#### Snippet
```java
    private String replaceTemplateVars(String template, String pathString, String requstMathod) {
        return template.replaceAll("\\$\\{METHOD}", requstMathod)
                       .replaceAll("\\$\\{PATH}", pathString);
    }

```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/config/group/openapi/EndpointGroupingRuleReader4Openapi.java`
#### Snippet
```java

    private boolean isTemplatePath(String pathString) {
        return pathString.matches("(.*)\\{(.+?)}(.*)");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/TableHelper.java`
#### Snippet
```java

    public static String getTableName(Model model) {
        final var aggFuncName = FunctionCategory.uniqueFunctionName(model.getStreamClass()).replaceAll("-", "_");
        return StringUtil.isNotBlank(aggFuncName) ? aggFuncName : model.getName();
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `oap-server/server-query-plugin/query-graphql-plugin/src/main/java/org/apache/skywalking/oap/query/graphql/type/LogAdapter.java`
#### Snippet
```java
            .splitToList(log.line());
        if (timeAndContent.size() == 2) {
            String timeStr = timeAndContent.get(0).replaceAll("\\.\\d+Z", "Z");
            try {
                TemporalAccessor t = rfc3339Formatter.parse(timeStr);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `oap-server/server-receiver-plugin/skywalking-zabbix-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/zabbix/provider/ZabbixMetrics.java`
#### Snippet
```java
        // Returns the escaped name of the given one, with "." replaced by "_"
        private String escapedName(final String name) {
            return name.replaceAll("\\.", "_");
        }
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `oap-server/server-receiver-plugin/otel-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/otel/otlp/OpenTelemetryMetricRequestProcessor.java`
#### Snippet
```java
                        it -> LABEL_MAPPINGS
                            .getOrDefault(it.getKey(), it.getKey())
                            .replaceAll("\\.", "_"),
                        it -> it.getValue().getStringValue(),
                        (v1, v2) -> v1
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `oap-server/server-configuration/configuration-nacos/src/main/java/org/apache/skywalking/oap/server/configuration/nacos/NacosConfigWatcherRegister.java`
#### Snippet
```java
                config = configService.getConfig(key, settings.getGroup(), 1000);
                if (StringUtil.isNotEmpty(config)) {
                    String[] itemNames = config.split("\\n|\\r\\n");
                    Arrays.stream(itemNames).map(String::trim).forEach(itemName -> {
                        String itemValue = null;
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `oap-server/server-configuration/configuration-etcd/src/main/java/org/apache/skywalking/oap/server/configuration/etcd/EtcdServerSettings.java`
#### Snippet
```java

    public String[] getEndpointArray() {
        return Arrays.stream(endpoints.split("\\s*,\\s*")).toArray(String[]::new);
    }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `oap-server/server-receiver-plugin/envoy-metrics-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/envoy/als/mx/FieldsHelper.java`
#### Snippet
```java
                            tokenBuffer.append(".").append(token);
                            if (token.endsWith("\"")) {
                                candidateFields.add(tokenBuffer.toString().replaceAll("\"", ""));
                                tokenBuffer.setLength(0);
                            }
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `oap-server/analyzer/log-analyzer/src/main/java/org/apache/skywalking/oap/log/analyzer/dsl/Binding.java`
#### Snippet
```java

/**
 * The binding bridge between OAP and the DSL, which provides some convenient methods to ease the use of the raw {@link groovy.lang.Binding#setProperty(java.lang.String, java.lang.Object)} and {@link
 * groovy.lang.Binding#getProperty(java.lang.String)}.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `oap-server/analyzer/log-analyzer/src/main/java/org/apache/skywalking/oap/log/analyzer/dsl/Binding.java`
#### Snippet
```java

/**
 * The binding bridge between OAP and the DSL, which provides some convenient methods to ease the use of the raw {@link groovy.lang.Binding#setProperty(java.lang.String, java.lang.Object)} and {@link
 * groovy.lang.Binding#getProperty(java.lang.String)}.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `oap-server/analyzer/log-analyzer/src/main/java/org/apache/skywalking/oap/log/analyzer/dsl/Binding.java`
#### Snippet
```java
/**
 * The binding bridge between OAP and the DSL, which provides some convenient methods to ease the use of the raw {@link groovy.lang.Binding#setProperty(java.lang.String, java.lang.Object)} and {@link
 * groovy.lang.Binding#getProperty(java.lang.String)}.
 */
public class Binding extends groovy.lang.Binding {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.regex` is unnecessary and can be removed
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/StringFormatGroup.java`
#### Snippet
```java

/**
 * Group patterns use {@link java.util.regex.Pattern} as core, could group the input strings to matched group or return
 * original string.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `lombok` is unnecessary, and can be replaced with an import
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/prometheus/metrics/Counter.java`
#### Snippet
```java
    private double value;

    @lombok.Builder
    public Counter(String name, @Singular Map<String, String> labels, double value, long timestamp) {
        super(name, labels, timestamp);
```

### UnnecessaryFullyQualifiedName
Qualifier `lombok` is unnecessary, and can be replaced with an import
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/prometheus/metrics/Summary.java`
#### Snippet
```java
    private final Map<Double, Double> quantiles;

    @lombok.Builder
    public Summary(String name, @Singular Map<String, String> labels, long sampleCount, double sampleSum,
        @Singular Map<Double, Double> quantiles, long timestamp) {
```

### UnnecessaryFullyQualifiedName
Qualifier `lombok` is unnecessary, and can be replaced with an import
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/prometheus/metrics/Gauge.java`
#### Snippet
```java
    private double value;

    @lombok.Builder
    public Gauge(String name, @Singular Map<String, String> labels, double value, long timestamp) {
        super(name, labels, timestamp);
```

### UnnecessaryFullyQualifiedName
Qualifier `lombok` is unnecessary, and can be replaced with an import
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/prometheus/metrics/Histogram.java`
#### Snippet
```java
    private Map<Double, Long> buckets;

    @lombok.Builder
    public Histogram(String name, @Singular Map<String, String> labels, long sampleCount, double sampleSum,
        @Singular Map<Double, Long> buckets, long timestamp) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/storage/StorageBuilderFactory.java`
#### Snippet
```java
 * of {@link StorageBuilder}.
 *
 * Typically, the storage needs to provide a more native format rather than {@link java.util.HashMap}.
 */
public interface StorageBuilderFactory extends Service {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.skywalking.oap.server.core.storage.type` is unnecessary and can be removed
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/Stream.java`
#### Snippet
```java
    /**
     * @return the converter type between entity and storage record persistence. The converter could be override by the
     * storage implementation if necessary. Default, return {@link org.apache.skywalking.oap.server.core.storage.type.StorageBuilder}
     * for general suitable.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.skywalking.oap.server.core.analysis` is unnecessary and can be removed
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/DispatcherManager.java`
#### Snippet
```java
     * Scan all classes under `org.apache.skywalking` package,
     * <p>
     * If it implement {@link org.apache.skywalking.oap.server.core.analysis.SourceDispatcher}, then, it will be added
     * into this DispatcherManager based on the Source definition.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.skywalking.oap.server.core.query.type` is unnecessary and can be removed
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/trace/ProfileTaskQueryService.java`
#### Snippet
```java
                switch (r.getRefType()) {
                    case CrossThread:
                        ref.setType(org.apache.skywalking.oap.server.core.query.type.RefType.CROSS_THREAD);
                        break;
                    case CrossProcess:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.skywalking.oap.server.core.query.type` is unnecessary and can be removed
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/trace/ProfileTaskQueryService.java`
#### Snippet
```java
                        break;
                    case CrossProcess:
                        ref.setType(org.apache.skywalking.oap.server.core.query.type.RefType.CROSS_PROCESS);
                        break;
                }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.base` is unnecessary and can be removed
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/Analyzer.java`
#### Snippet
```java
        }

        if (!com.google.common.base.Strings.isNullOrEmpty(entity.getInstanceName())) {
            InstanceTraffic instanceTraffic = new InstanceTraffic();
            instanceTraffic.setName(entity.getInstanceName());
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.base` is unnecessary and can be removed
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/Analyzer.java`
#### Snippet
```java
            MetricsStreamProcessor.getInstance().in(instanceTraffic);
        }
        if (!com.google.common.base.Strings.isNullOrEmpty(entity.getEndpointName())) {
            EndpointTraffic endpointTraffic = new EndpointTraffic();
            endpointTraffic.setName(entity.getEndpointName());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.skywalking.oap.server.core.alarm` is unnecessary and can be removed
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/stream/BanyanDBAlarmQueryDAO.java`
#### Snippet
```java

/**
 * {@link org.apache.skywalking.oap.server.core.alarm.AlarmRecord} is a stream,
 * which can be used to build a {@link org.apache.skywalking.oap.server.core.query.type.AlarmMessage}
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.skywalking.oap.server.core.query.type` is unnecessary and can be removed
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/stream/BanyanDBAlarmQueryDAO.java`
#### Snippet
```java
/**
 * {@link org.apache.skywalking.oap.server.core.alarm.AlarmRecord} is a stream,
 * which can be used to build a {@link org.apache.skywalking.oap.server.core.query.type.AlarmMessage}
 */
public class BanyanDBAlarmQueryDAO extends AbstractBanyanDBDAO implements IAlarmQueryDAO {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.skywalking.oap.server.core.browser.manual.errorlog` is unnecessary and can be removed
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/stream/BanyanDBBrowserLogQueryDAO.java`
#### Snippet
```java

/**
 * {@link org.apache.skywalking.oap.server.core.browser.manual.errorlog.BrowserErrorLogRecord} is a stream
 */
public class BanyanDBBrowserLogQueryDAO extends AbstractBanyanDBDAO implements IBrowserLogQueryDAO {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.skywalking.oap.server.storage.plugin.banyandb.measure` is unnecessary and can be removed
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/measure/BanyanDBNetworkAddressAliasDAO.java`
#### Snippet
```java
            );
            /**
             * Currently, only used by {@link org.apache.skywalking.oap.server.storage.plugin.banyandb.measure.BanyanDBNetworkAddressAliasDAO}.
             * The default DownSampling strategy, i.e. {@link DownSampling#Minute} is assumed in this case.
             */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.skywalking.oap.server.core.analysis.manual.log` is unnecessary and can be removed
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/stream/BanyanDBLogQueryDAO.java`
#### Snippet
```java

/**
 * {@link org.apache.skywalking.oap.server.core.analysis.manual.log.LogRecord} is a stream
 */
public class BanyanDBLogQueryDAO extends AbstractBanyanDBDAO implements ILogQueryDAO {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary and can be removed
in `oap-server/server-receiver-plugin/envoy-metrics-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/envoy/als/mx/ServiceMetaInfoAdapter.java`
#### Snippet
```java

    /**
     * The same functionality with {@link ServiceMetaInfoAdapter#ServiceMetaInfoAdapter(com.google.protobuf.ByteString)}.
     *
     * @param metadata the {@link Struct struct} to adapt from.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary and can be removed
in `oap-server/server-receiver-plugin/envoy-metrics-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/envoy/als/mx/ServiceMetaInfoAdapter.java`
#### Snippet
```java

    /**
     * The same functionality with {@link ServiceMetaInfoAdapter#ServiceMetaInfoAdapter(com.google.protobuf.ByteString)}.
     *
     * @param any {@link Any any object} to adapt from.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.protobuf` is unnecessary, and can be replaced with an import
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/stream/AbstractBanyanDBDAO.java`
#### Snippet
```java
    }

    protected abstract static class QueryBuilder<T extends AbstractQuery<? extends com.google.protobuf.GeneratedMessageV3>> {
        protected abstract void apply(final T query);

```

## RuleId[id=ReplaceNullCheck]
### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElse()'
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/query/ProfileTaskQueryEsDAO.java`
#### Snippet
```java
        final SearchBuilder search = Search.builder().query(query);

        if (limit != null) {
            search.size(limit);
        } else {
```

### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElse()'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/service/ServiceTraffic.java`
#### Snippet
```java
    protected StorageID id0() {
        String id;
        if (layer != null) {
            id = encode(name) + Const.POINT + layer.value();
        } else {
```

### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElse()'
in `oap-server/server-library/library-elasticsearch-client/src/main/java/org/apache/skywalking/library/elasticsearch/requests/factory/v6/codec/V6IndexTemplatesDeserializer.java`
#### Snippet
```java
        throws IOException {
        final Map<String, IndexTemplate> templates = p.getCodec().readValue(p, TYPE_REFERENCE);
        if (templates == null) {
            return new IndexTemplates(Collections.emptyMap());
        }
```

### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElse()'
in `oap-server/server-library/library-elasticsearch-client/src/main/java/org/apache/skywalking/library/elasticsearch/requests/factory/v7plus/codec/V7IndexTemplatesDeserializer.java`
#### Snippet
```java

        final Map<String, IndexTemplate> templates = p.getCodec().readValue(p, TYPE_REFERENCE);
        if (templates == null) {
            return new IndexTemplates(Collections.emptyMap());
        }
```

### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElse()'
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/stream/BanyanDBProfileTaskQueryDAO.java`
#### Snippet
```java
                        }

                        if (limit != null) {
                            query.setLimit(limit);
                        } else {
```

### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElse()'
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/stream/AbstractBanyanDBDAO.java`
#### Snippet
```java
        }
        final StreamQuery query;
        if (timestampRange == null) {
            query = new StreamQuery(schema.getMetadata().getGroup(), schema.getMetadata().name(), LARGEST_TIME_RANGE, tags);
        } else {
```

### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElse()'
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/stream/AbstractBanyanDBDAO.java`
#### Snippet
```java
                                         TimestampRange timestampRange, QueryBuilder<MeasureQuery> builder) throws IOException {
        final MeasureQuery query;
        if (timestampRange == null) {
            query = new MeasureQuery(schema.getMetadata().getGroup(), schema.getMetadata().name(), LARGEST_TIME_RANGE, tags, fields);
        } else {
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `EsDAO()` of an abstract class should not be declared 'public'
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/base/EsDAO.java`
#### Snippet
```java
    protected static final Duration SCROLL_CONTEXT_RETENTION = Duration.ofSeconds(30);

    public EsDAO(ElasticSearchClient client) {
        super(client);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ServerException()` of an abstract class should not be declared 'public'
in `oap-server/server-library/library-server/src/main/java/org/apache/skywalking/oap/server/library/server/ServerException.java`
#### Snippet
```java
    }

    public ServerException(String message, Throwable cause) {
        super(message, cause);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ServerException()` of an abstract class should not be declared 'public'
in `oap-server/server-library/library-server/src/main/java/org/apache/skywalking/oap/server/library/server/ServerException.java`
#### Snippet
```java
public abstract class ServerException extends Exception {

    public ServerException(String message) {
        super(message);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractKafkaHandler()` of an abstract class should not be declared 'public'
in `oap-server/server-fetcher-plugin/kafka-fetcher-plugin/src/main/java/org/apache/skywalking/oap/server/analyzer/agent/kafka/provider/handler/AbstractKafkaHandler.java`
#### Snippet
```java
    protected KafkaFetcherConfig config;

    public AbstractKafkaHandler(ModuleManager manager, KafkaFetcherConfig config) {
        this.config = config;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `KafkaExportProducer()` of an abstract class should not be declared 'public'
in `oap-server/exporter/src/main/java/org/apache/skywalking/oap/server/exporter/provider/kafka/KafkaExportProducer.java`
#### Snippet
```java
    private volatile KafkaProducer<String, Bytes> producer;

    public KafkaExportProducer(ExporterSetting setting) {
        this.setting = setting;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ModuleProvider()` of an abstract class should not be declared 'public'
in `oap-server/server-library/library-module/src/main/java/org/apache/skywalking/oap/server/library/module/ModuleProvider.java`
#### Snippet
```java
    private final Map<Class<? extends Service>, Service> services = new HashMap<>();

    public ModuleProvider() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `ModuleDefine()` of an abstract class should not be declared 'public'
in `oap-server/server-library/library-module/src/main/java/org/apache/skywalking/oap/server/library/module/ModuleDefine.java`
#### Snippet
```java
    private final String name;

    public ModuleDefine(String name) {
        this.name = name;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractWorker()` of an abstract class should not be declared 'public'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/worker/AbstractWorker.java`
#### Snippet
```java
    private final ModuleDefineHolder moduleDefineHolder;

    public AbstractWorker(ModuleDefineHolder moduleDefineHolder) {
        this.moduleDefineHolder = moduleDefineHolder;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractDAO()` of an abstract class should not be declared 'public'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/storage/AbstractDAO.java`
#### Snippet
```java
    private final C client;

    public AbstractDAO(C client) {
        this.client = client;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `PercentileMetrics()` of an abstract class should not be declared 'public'
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/metrics/PercentileMetrics.java`
#### Snippet
```java
    private boolean isCalculated;

    public PercentileMetrics() {
        percentileValues = new DataTable(RANKS.length);
        dataset = new DataTable(30);
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseMetrics()` of an abstract class should not be declared 'public'
in `oap-server/server-telemetry/telemetry-prometheus/src/main/java/org/apache/skywalking/oap/server/telemetry/prometheus/BaseMetrics.java`
#### Snippet
```java
    private ReentrantLock lock = new ReentrantLock();

    public BaseMetrics(String name, String tips, MetricsTag.Keys labels, MetricsTag.Values values) {
        this.name = name;
        this.tips = tips;
```

### NonProtectedConstructorInAbstractClass
Constructor `ConfigChangeWatcher()` of an abstract class should not be declared 'public'
in `oap-server/server-configuration/configuration-api/src/main/java/org/apache/skywalking/oap/server/configuration/api/ConfigChangeWatcher.java`
#### Snippet
```java
    protected WatchType watchType;

    public ConfigChangeWatcher(String module, ModuleProvider provider, String itemName) {
        this.module = module;
        this.provider = provider;
```

### NonProtectedConstructorInAbstractClass
Constructor `GroupConfigChangeWatcher()` of an abstract class should not be declared 'public'
in `oap-server/server-configuration/configuration-api/src/main/java/org/apache/skywalking/oap/server/configuration/api/GroupConfigChangeWatcher.java`
#### Snippet
```java

public abstract class GroupConfigChangeWatcher extends ConfigChangeWatcher {
    public GroupConfigChangeWatcher(final String module,
                                    final ModuleProvider provider,
                                    final String itemName) {
```

### NonProtectedConstructorInAbstractClass
Constructor `ConfigWatcherRegister()` of an abstract class should not be declared 'public'
in `oap-server/server-configuration/configuration-api/src/main/java/org/apache/skywalking/oap/server/configuration/api/ConfigWatcherRegister.java`
#### Snippet
```java
    }

    public ConfigWatcherRegister(long syncPeriod) {
        this.syncPeriod = syncPeriod;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ConfigWatcherRegister()` of an abstract class should not be declared 'public'
in `oap-server/server-configuration/configuration-api/src/main/java/org/apache/skywalking/oap/server/configuration/api/ConfigWatcherRegister.java`
#### Snippet
```java
    private final long syncPeriod;

    public ConfigWatcherRegister() {
        this(60);
    }
```

## RuleId[id=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/DispatcherManager.java`
#### Snippet
```java

                    List<SourceDispatcher<ISource>> dispatchers = this.dispatcherMap.get(scopeId);
                    if (dispatchers == null) {
                        dispatchers = new ArrayList<>();
                        this.dispatcherMap.put(scopeId, dispatchers);
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/data/LimitedSizeBufferedData.java`
#### Snippet
```java
        final StorageID id = data.id();
        LinkedList<STORAGE_DATA> storageDataList = this.data.get(id);
        if (storageDataList == null) {
            storageDataList = new LinkedList<>();
            this.data.put(id, storageDataList);
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `oap-server/microbench/src/main/java/org/apache/skywalking/oap/server/microbench/core/profiling/ebpf/EBPFProfilingAnalyzerBenchmark.java`
#### Snippet
```java
        public String generate(int depth) {
            List<String> symbols = existingSymbolMap.get(depth);
            if (symbols == null) {
                existingSymbolMap.put(depth, symbols = new ArrayList<>());
            }
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `remoteInstance`
in `oap-server/server-cluster-plugin/cluster-etcd-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/etcd/EtcdCoordinator.java`
#### Snippet
```java
    public void registerRemote(RemoteInstance remoteInstance) throws ServiceRegisterException {
        if (needUsingInternalAddr()) {
            remoteInstance = new RemoteInstance(
                new Address(config.getInternalComHost(), config.getInternalComPort(), true));
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `connectString`
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/ConnectUtils.java`
#### Snippet
```java

    public static List<Address> parse(String connectString) throws ConnectStringParseException {
        connectString = connectString == null ? "" : connectString.trim();
        connectString = connectString.startsWith(",") ? connectString.replace(",", "") : connectString;

```

### AssignmentToMethodParameter
Assignment to method parameter `connectString`
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/ConnectUtils.java`
#### Snippet
```java
    public static List<Address> parse(String connectString) throws ConnectStringParseException {
        connectString = connectString == null ? "" : connectString.trim();
        connectString = connectString.startsWith(",") ? connectString.replace(",", "") : connectString;

        if (Strings.isNullOrEmpty(connectString)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `maxDepth`
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/ResourceUtils.java`
#### Snippet
```java
            return fileList;
        }
        maxDepth--;
        File file = new File(directoryPath);
        if (file.isDirectory()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `taskList`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/cache/ProfileTaskCache.java`
#### Snippet
```java
    public void saveTaskList(String serviceId, List<ProfileTask> taskList) {
        if (taskList == null) {
            taskList = Collections.emptyList();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `dateStr`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/query/DurationUtils.java`
#### Snippet
```java
    public long convertToTimeBucket(Step step, String dateStr) {
        verifyDateTimeString(step, dateStr);
        dateStr = dateStr.replaceAll(Const.LINE, Const.EMPTY_STRING);
        dateStr = dateStr.replaceAll(Const.SPACE, Const.EMPTY_STRING);
        return Long.parseLong(dateStr);
```

### AssignmentToMethodParameter
Assignment to method parameter `dateStr`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/query/DurationUtils.java`
#### Snippet
```java
        verifyDateTimeString(step, dateStr);
        dateStr = dateStr.replaceAll(Const.LINE, Const.EMPTY_STRING);
        dateStr = dateStr.replaceAll(Const.SPACE, Const.EMPTY_STRING);
        return Long.parseLong(dateStr);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `keywordsOfContent`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/query/LogQueryService.java`
#### Snippet
```java

        if (nonNull(keywordsOfContent)) {
            keywordsOfContent = keywordsOfContent.stream()
                                                 .filter(StringUtil::isNotEmpty)
                                                 .collect(Collectors.toList());
```

### AssignmentToMethodParameter
Assignment to method parameter `excludingKeywordsOfContent`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/query/LogQueryService.java`
#### Snippet
```java
        }
        if (nonNull(excludingKeywordsOfContent)) {
            excludingKeywordsOfContent = excludingKeywordsOfContent.stream()
                                                                   .filter(StringUtil::isNotEmpty)
                                                                   .collect(Collectors.toList());
```

### AssignmentToMethodParameter
Assignment to method parameter `instanceList`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/remote/client/RemoteClientManager.java`
#### Snippet
```java
            }

            instanceList = distinct(instanceList);
            Collections.sort(instanceList);

```

### AssignmentToMethodParameter
Assignment to method parameter `timeBucket`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/TimeBucket.java`
#### Snippet
```java
            case Second:
                calendar.set(Calendar.SECOND, (int) (timeBucket % 100));
                timeBucket /= 100;
                // Fall through
            case Minute:
```

### AssignmentToMethodParameter
Assignment to method parameter `timeBucket`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/TimeBucket.java`
#### Snippet
```java
            case Minute:
                calendar.set(Calendar.MINUTE, (int) (timeBucket % 100));
                timeBucket /= 100;
                // Fall through
            case Hour:
```

### AssignmentToMethodParameter
Assignment to method parameter `timeBucket`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/TimeBucket.java`
#### Snippet
```java
            case Hour:
                calendar.set(Calendar.HOUR_OF_DAY, (int) (timeBucket % 100));
                timeBucket /= 100;
                // Fall through
            case Day:
```

### AssignmentToMethodParameter
Assignment to method parameter `timeBucket`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/TimeBucket.java`
#### Snippet
```java
            case Day:
                calendar.set(Calendar.DAY_OF_MONTH, (int) (timeBucket % 100));
                timeBucket /= 100;
                calendar.set(Calendar.MONTH, (int) (timeBucket % 100) - 1);
                calendar.set(Calendar.YEAR, (int) (timeBucket / 100));
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/IDManager.java`
#### Snippet
```java
        public static String buildId(String instanceId, String name) {
            if (StringUtil.isBlank(name)) {
                name = Const.BLANK_ENTITY_NAME;
            }
            return Hashing.sha256().newHasher().putString(String.format("%s_%s",
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/IDManager.java`
#### Snippet
```java
        public static String buildId(String name, boolean isNormal) {
            if (StringUtil.isBlank(name)) {
                name = Const.BLANK_ENTITY_NAME;
            }
            return encode(name) + Const.SERVICE_ID_CONNECTOR + BooleanUtils.booleanToValue(isNormal);
```

### AssignmentToMethodParameter
Assignment to method parameter `endpointName`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/IDManager.java`
#### Snippet
```java
        public static String buildId(String serviceId, String endpointName) {
            if (StringUtil.isBlank(endpointName)) {
                endpointName = Const.BLANK_ENTITY_NAME;
            }
            return serviceId
```

### AssignmentToMethodParameter
Assignment to method parameter `instanceName`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/IDManager.java`
#### Snippet
```java
        public static String buildId(String serviceId, String instanceName) {
            if (StringUtil.isBlank(instanceName)) {
                instanceName = Const.BLANK_ENTITY_NAME;
            }
            return serviceId
```

### AssignmentToMethodParameter
Assignment to method parameter `left`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/metrics/expression/StringMatch.java`
#### Snippet
```java
    public boolean match(String left, String right) {
        if (left != null && left.startsWith("\"") && left.endsWith("\"")) {
            left = left.substring(1, left.length() - 1);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `right`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/metrics/expression/StringMatch.java`
#### Snippet
```java

        if (right != null && right.startsWith("\"") && right.endsWith("\"")) {
            right = right.substring(1, right.length() - 1);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `right`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/metrics/expression/ContainMatch.java`
#### Snippet
```java
        }
        if (right.startsWith("\"") && right.endsWith("\"")) {
            right = right.substring(1, right.length() - 1);
        }
        return left.contains(right);
```

### AssignmentToMethodParameter
Assignment to method parameter `right`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/metrics/expression/LikeMatch.java`
#### Snippet
```java
        }
        if (right.startsWith("\"") && right.endsWith("\"")) {
            right = right.substring(1, right.length() - 1);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `right`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/metrics/expression/NotContainMatch.java`
#### Snippet
```java
        }
        if (right.startsWith("\"") && right.endsWith("\"")) {
            right = right.substring(1, right.length() - 1);
        }
        return !left.contains(right);
```

### AssignmentToMethodParameter
Assignment to method parameter `end`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/analyze/EBPFProfilingAnalyzer.java`
#### Snippet
```java

        // include latest millisecond
        end += 1;

        final List<TimeRange> timeRanges = new ArrayList<>();
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/analyze/EBPFProfilingAnalyzer.java`
#### Snippet
```java
            long batchEnd = Math.min(start + FETCH_DATA_DURATION, end);
            timeRanges.add(new TimeRange(start, batchEnd));
            start = batchEnd;
        }
        while (start < end);
```

### AssignmentToMethodParameter
Assignment to method parameter `targets`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/EBPFProfilingQueryService.java`
#### Snippet
```java
    public List<EBPFProfilingTask> queryEBPFProfilingTasks(String serviceId, String serviceInstanceId, List<EBPFProfilingTargetType> targets, EBPFProfilingTriggerType triggerType) throws IOException {
        if (CollectionUtils.isEmpty(targets)) {
            targets = Arrays.asList(EBPFProfilingTargetType.values());
        }
        final List<EBPFProfilingTaskRecord> tasks = getTaskDAO().queryTasksByTargets(serviceId, serviceInstanceId, targets, triggerType, 0, 0);
```

### AssignmentToMethodParameter
Assignment to method parameter `timeBucket`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/TableHelper.java`
#### Snippet
```java
    public static String getTable(String rawTableName, long timeBucket) {
        if (timeBucket == 0) {
            timeBucket = TimeBucket.getTimeBucket(System.currentTimeMillis(), DownSampling.Day);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `timeBucket`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/TableHelper.java`
#### Snippet
```java
        final var tableName = getTableName(model);
        if (timeBucket == 0) {
            timeBucket = TimeBucket.getTimeBucket(System.currentTimeMillis(), DownSampling.Day);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `oap-server/analyzer/agent-analyzer/src/main/java/org/apache/skywalking/oap/server/analyzer/provider/trace/DBLatencyThresholdsAndWatcher.java`
#### Snippet
```java

    public int getThreshold(String type) {
        type = type.toLowerCase();
        if (thresholds.get().containsKey(type)) {
            return thresholds.get().get(type);
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `oap-server/analyzer/agent-analyzer/src/main/java/org/apache/skywalking/oap/server/analyzer/provider/trace/CacheWriteLatencyThresholdsAndWatcher.java`
#### Snippet
```java

    public int getThreshold(String type) {
        type = type.toLowerCase();
        if (thresholds.get().containsKey(type)) {
            return thresholds.get().get(type);
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `oap-server/analyzer/agent-analyzer/src/main/java/org/apache/skywalking/oap/server/analyzer/provider/trace/CacheReadLatencyThresholdsAndWatcher.java`
#### Snippet
```java

    public int getThreshold(String type) {
        type = type.toLowerCase();
        if (thresholds.get().containsKey(type)) {
            return thresholds.get().get(type);
```

### AssignmentToMethodParameter
Assignment to method parameter `triggerType`
in `oap-server/server-query-plugin/query-graphql-plugin/src/main/java/org/apache/skywalking/oap/query/graphql/resolver/EBPFProcessProfilingQuery.java`
#### Snippet
```java
        }
        if (triggerType == null) {
            triggerType = EBPFProfilingTriggerType.FIXED_TIME;
        }
        return getQueryService().queryEBPFProfilingTasks(serviceId, serviceInstanceId, targets, triggerType);
```

### AssignmentToMethodParameter
Assignment to method parameter `size`
in `oap-server/server-library/library-datacarrier-queue/src/main/java/org/apache/skywalking/oap/server/library/datacarrier/consumer/BulkConsumePool.java`
#### Snippet
```java

    public BulkConsumePool(String name, int size, long consumeCycle) {
        size = EnvUtil.getInt(name + "_THREAD", size);
        allConsumers = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
```

### AssignmentToMethodParameter
Assignment to method parameter `bufferSize`
in `oap-server/server-library/library-datacarrier-queue/src/main/java/org/apache/skywalking/oap/server/library/datacarrier/DataCarrier.java`
#### Snippet
```java
    public DataCarrier(String name, String envPrefix, int channelSize, int bufferSize, BufferStrategy strategy) {
        this.name = name;
        bufferSize = EnvUtil.getInt(envPrefix + "_BUFFER_SIZE", bufferSize);
        channelSize = EnvUtil.getInt(envPrefix + "_CHANNEL_SIZE", channelSize);
        channels = new Channels<>(channelSize, bufferSize, new SimpleRollingPartitioner<T>(), strategy);
```

### AssignmentToMethodParameter
Assignment to method parameter `channelSize`
in `oap-server/server-library/library-datacarrier-queue/src/main/java/org/apache/skywalking/oap/server/library/datacarrier/DataCarrier.java`
#### Snippet
```java
        this.name = name;
        bufferSize = EnvUtil.getInt(envPrefix + "_BUFFER_SIZE", bufferSize);
        channelSize = EnvUtil.getInt(envPrefix + "_CHANNEL_SIZE", channelSize);
        channels = new Channels<>(channelSize, bufferSize, new SimpleRollingPartitioner<T>(), strategy);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `expression`
in `oap-server/oal-rt/src/main/java/org/apache/skywalking/oal/rt/parser/EntryMethod.java`
#### Snippet
```java
    private void addArg(Class<?> parameterType, int type, String expression) {
        if (parameterType.equals(int.class)) {
            expression = "(int)(" + expression + ")";
        } else if (parameterType.equals(long.class)) {
            expression = "(long)(" + expression + ")";
```

### AssignmentToMethodParameter
Assignment to method parameter `expression`
in `oap-server/oal-rt/src/main/java/org/apache/skywalking/oal/rt/parser/EntryMethod.java`
#### Snippet
```java
            expression = "(int)(" + expression + ")";
        } else if (parameterType.equals(long.class)) {
            expression = "(long)(" + expression + ")";
        } else if (parameterType.equals(double.class)) {
            expression = "(double)(" + expression + ")";
```

### AssignmentToMethodParameter
Assignment to method parameter `expression`
in `oap-server/oal-rt/src/main/java/org/apache/skywalking/oal/rt/parser/EntryMethod.java`
#### Snippet
```java
            expression = "(long)(" + expression + ")";
        } else if (parameterType.equals(double.class)) {
            expression = "(double)(" + expression + ")";
        } else if (parameterType.equals(float.class)) {
            expression = "(float)(" + expression + ")";
```

### AssignmentToMethodParameter
Assignment to method parameter `expression`
in `oap-server/oal-rt/src/main/java/org/apache/skywalking/oal/rt/parser/EntryMethod.java`
#### Snippet
```java
            expression = "(double)(" + expression + ")";
        } else if (parameterType.equals(float.class)) {
            expression = "(float)(" + expression + ")";
        }
        argTypes.add(type);
```

### AssignmentToMethodParameter
Assignment to method parameter `typeName`
in `oap-server/oal-rt/src/main/java/org/apache/skywalking/oal/rt/parser/SourceColumn.java`
#### Snippet
```java
            case "String":
                this.type = String.class;
                typeName = "String";
                break;
            default:
```

### AssignmentToMethodParameter
Assignment to method parameter `source`
in `oap-server/oal-rt/src/main/java/org/apache/skywalking/oal/rt/parser/OALListener.java`
#### Snippet
```java

    private String metricsNameFormat(String source) {
        source = firstLetterUpper(source);
        int idx;
        while ((idx = source.indexOf("_")) > -1) {
```

### AssignmentToMethodParameter
Assignment to method parameter `source`
in `oap-server/oal-rt/src/main/java/org/apache/skywalking/oal/rt/parser/OALListener.java`
#### Snippet
```java
        int idx;
        while ((idx = source.indexOf("_")) > -1) {
            source = source.substring(0, idx) + firstLetterUpper(source.substring(idx + 1));
        }
        return source;
```

### AssignmentToMethodParameter
Assignment to method parameter `remoteInstance`
in `oap-server/server-cluster-plugin/cluster-zookeeper-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/zookeeper/ZookeeperCoordinator.java`
#### Snippet
```java
        try {
            if (needUsingInternalAddr()) {
                remoteInstance = new RemoteInstance(new Address(config.getInternalComHost(), config.getInternalComPort(), true));
            }
            this.selfAddress = remoteInstance.getAddress();
```

### AssignmentToMethodParameter
Assignment to method parameter `remoteInstance`
in `oap-server/server-cluster-plugin/cluster-nacos-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/nacos/NacosCoordinator.java`
#### Snippet
```java
    public void registerRemote(RemoteInstance remoteInstance) throws ServiceRegisterException {
        if (needUsingInternalAddr()) {
            remoteInstance = new RemoteInstance(new Address(config.getInternalComHost(), config.getInternalComPort(), true));
        }
        this.selfAddress = remoteInstance.getAddress();
```

### AssignmentToMethodParameter
Assignment to method parameter `rule`
in `oap-server/server-receiver-plugin/envoy-metrics-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/envoy/als/k8s/ServiceNameFormatter.java`
#### Snippet
```java

    public ServiceNameFormatter(String rule) {
        rule = StringUtils.defaultIfBlank(rule, "${pod.metadata.labels.(service.istio.io/canonical-name),pod.metadata.labels.(app.kubernetes.io/name),pod.metadata.labels.app)}");

        this.properties = new ArrayList<>();
```

### AssignmentToMethodParameter
Assignment to method parameter `format`
in `oap-server/server-alarm-plugin/src/main/java/org/apache/skywalking/oap/server/core/alarm/provider/AlarmMessageFormatter.java`
#### Snippet
```java
    public AlarmMessageFormatter(String format) {
        if (format == null) {
            format = "";
        }
        formatSegments = new ArrayList<>();
```

### AssignmentToMethodParameter
Assignment to method parameter `alias`
in `oap-server/server-library/library-client/src/main/java/org/apache/skywalking/oap/server/library/client/elasticsearch/ElasticSearchClient.java`
#### Snippet
```java

    public Collection<String> retrievalIndexByAliases(String alias) {
        alias = indexNameConverter.apply(alias);

        return es.get().alias().indices(alias).keySet();
```

### AssignmentToMethodParameter
Assignment to method parameter `indexName`
in `oap-server/server-library/library-client/src/main/java/org/apache/skywalking/oap/server/library/client/elasticsearch/ElasticSearchClient.java`
#### Snippet
```java

    public boolean isExistsIndex(String indexName) {
        indexName = indexNameConverter.apply(indexName);

        return es.get().index().exists(indexName);
```

### AssignmentToMethodParameter
Assignment to method parameter `indexName`
in `oap-server/server-library/library-client/src/main/java/org/apache/skywalking/oap/server/library/client/elasticsearch/ElasticSearchClient.java`
#### Snippet
```java

    public boolean updateIndexMapping(String indexName, Mappings mapping) {
        indexName = indexNameConverter.apply(indexName);

        return es.get().index().putMapping(indexName, TYPE, mapping);
```

### AssignmentToMethodParameter
Assignment to method parameter `indexName`
in `oap-server/server-library/library-client/src/main/java/org/apache/skywalking/oap/server/library/client/elasticsearch/ElasticSearchClient.java`
#### Snippet
```java
            return Optional.empty();
        }
        indexName = indexNameConverter.apply(indexName);
        return es.get().index().get(indexName);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `indexName`
in `oap-server/server-library/library-client/src/main/java/org/apache/skywalking/oap/server/library/client/elasticsearch/ElasticSearchClient.java`
#### Snippet
```java
     */
    public SearchResponse searchIDs(String indexName, Iterable<String> ids) {
        indexName = indexNameConverter.apply(indexName);

        return es.get().search(Search.builder()
```

### AssignmentToMethodParameter
Assignment to method parameter `indexName`
in `oap-server/server-library/library-client/src/main/java/org/apache/skywalking/oap/server/library/client/elasticsearch/ElasticSearchClient.java`
#### Snippet
```java

    public boolean deleteTemplate(String indexName) {
        indexName = indexNameConverter.apply(indexName);

        return es.get().templates().delete(indexName);
```

### AssignmentToMethodParameter
Assignment to method parameter `indexName`
in `oap-server/server-library/library-client/src/main/java/org/apache/skywalking/oap/server/library/client/elasticsearch/ElasticSearchClient.java`
#### Snippet
```java
    public boolean createOrUpdateTemplate(String indexName, Map<String, Object> settings,
                                          Mappings mapping, int order) {
        indexName = indexNameConverter.apply(indexName);

        return es.get().templates().createOrUpdate(indexName, settings, mapping, order);
```

### AssignmentToMethodParameter
Assignment to method parameter `indexName`
in `oap-server/server-library/library-client/src/main/java/org/apache/skywalking/oap/server/library/client/elasticsearch/ElasticSearchClient.java`
#### Snippet
```java
    public UpdateRequestWrapper prepareUpdate(String indexName, String id,
                                              Map<String, Object> source) {
        indexName = indexNameConverter.apply(indexName);
        return new UpdateRequestWrapper(indexName, TYPE, id, source);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `indexName`
in `oap-server/server-library/library-client/src/main/java/org/apache/skywalking/oap/server/library/client/elasticsearch/ElasticSearchClient.java`
#### Snippet
```java

    public boolean existDoc(String indexName, String id) {
        indexName = indexNameConverter.apply(indexName);

        return es.get().documents().exists(indexName, TYPE, id);
```

### AssignmentToMethodParameter
Assignment to method parameter `indexName`
in `oap-server/server-library/library-client/src/main/java/org/apache/skywalking/oap/server/library/client/elasticsearch/ElasticSearchClient.java`
#### Snippet
```java
    public IndexRequestWrapper prepareInsert(String indexName, String id, Optional<String> routingValue,
                                             Map<String, Object> source) {
        indexName = indexNameConverter.apply(indexName);
        return new IndexRequestWrapper(indexName, TYPE, id, routingValue, source);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `indexName`
in `oap-server/server-library/library-client/src/main/java/org/apache/skywalking/oap/server/library/client/elasticsearch/ElasticSearchClient.java`
#### Snippet
```java

    public Optional<Document> get(String indexName, String id) {
        indexName = indexNameConverter.apply(indexName);

        return es.get().documents().get(indexName, TYPE, id);
```

### AssignmentToMethodParameter
Assignment to method parameter `indexName`
in `oap-server/server-library/library-client/src/main/java/org/apache/skywalking/oap/server/library/client/elasticsearch/ElasticSearchClient.java`
#### Snippet
```java

    public SearchResponse search(String indexName, Search search, SearchParams params) {
        indexName = indexNameConverter.apply(indexName);

        return es.get().search(search, params, indexName);
```

### AssignmentToMethodParameter
Assignment to method parameter `indexName`
in `oap-server/server-library/library-client/src/main/java/org/apache/skywalking/oap/server/library/client/elasticsearch/ElasticSearchClient.java`
#### Snippet
```java

    public SearchResponse search(String indexName, Search search) {
        indexName = indexNameConverter.apply(indexName);

        return es.get().search(search, indexName);
```

### AssignmentToMethodParameter
Assignment to method parameter `indexName`
in `oap-server/server-library/library-client/src/main/java/org/apache/skywalking/oap/server/library/client/elasticsearch/ElasticSearchClient.java`
#### Snippet
```java
                               Mappings mappings,
                               Map<String, ?> settings) {
        indexName = indexNameConverter.apply(indexName);

        return es.get().index().create(indexName, mappings, settings);
```

### AssignmentToMethodParameter
Assignment to method parameter `indexName`
in `oap-server/server-library/library-client/src/main/java/org/apache/skywalking/oap/server/library/client/elasticsearch/ElasticSearchClient.java`
#### Snippet
```java

    public boolean isExistsTemplate(String indexName) {
        indexName = indexNameConverter.apply(indexName);

        return es.get().templates().exists(indexName);
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `oap-server/server-library/library-client/src/main/java/org/apache/skywalking/oap/server/library/client/elasticsearch/ElasticSearchClient.java`
#### Snippet
```java

    public Optional<IndexTemplate> getTemplate(String name) {
        name = indexNameConverter.apply(name);

        return es.get().templates().get(name);
```

### AssignmentToMethodParameter
Assignment to method parameter `remoteInstance`
in `oap-server/server-cluster-plugin/cluster-consul-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/consul/ConsulCoordinator.java`
#### Snippet
```java
    public void registerRemote(RemoteInstance remoteInstance) throws ServiceRegisterException {
        if (needUsingInternalAddr()) {
            remoteInstance = new RemoteInstance(
                new Address(config.getInternalComHost(), config.getInternalComPort(), true));
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `samples`
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/SampleFamily.java`
#### Snippet
```java
        Preconditions.checkNotNull(samples);
        Preconditions.checkArgument(samples.length > 0);
        samples = Arrays.stream(samples).filter(sample -> !Double.isNaN(sample.getValue())).toArray(Sample[]::new);
        if (samples.length == 0) {
            return EMPTY;
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `oap-server/server-tools/profile-exporter/tool-profile-snapshot-bootstrap/src/main/java/org/apache/skywalking/oap/server/tool/profile/exporter/ProfileSnapshotDumper.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/base/RoutingUtils.java`
#### Snippet
```java
        Object value = toStorage.get(routingField);
        if (value == null) {
            return null;
        }
        return value.toString();
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/query/UITemplateManagementEsDAO.java`
#### Snippet
```java
    public DashboardConfiguration getTemplate(final String id) {
        if (StringUtil.isEmpty(id)) {
            return null;
        }
        final String index =
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/query/UITemplateManagementEsDAO.java`
#### Snippet
```java
                builder.storage2Entity(new ElasticSearchConverter.ToEntity(UITemplate.INDEX_NAME, data.getSource())));
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/query/ProfileTaskQueryEsDAO.java`
#### Snippet
```java
    public ProfileTask getById(String id) throws IOException {
        if (StringUtil.isEmpty(id)) {
            return null;
        }
        final String index =
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/query/ProfileTaskQueryEsDAO.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/query/MetadataQueryEsDAO.java`
#### Snippet
```java
        final SearchResponse response = getClient().search(index, search.build());
        final List<Process> processes = buildProcesses(response);
        return processes.isEmpty() ? null : processes.get(0);
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-elasticsearch-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/elasticsearch/query/MetadataQueryEsDAO.java`
#### Snippet
```java
        final SearchResponse response = getClient().search(index, search.build());
        final List<ServiceInstance> instances = buildInstances(response);
        return instances.size() > 0 ? instances.get(0) : null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-telemetry/telemetry-api/src/main/java/org/apache/skywalking/oap/server/telemetry/none/NoneTelemetryProvider.java`
#### Snippet
```java
    @Override
    public ConfigCreator newConfigCreator() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-tools/data-generator/src/main/java/org/apache/skywalking/module/DataGeneratorModuleProvider.java`
#### Snippet
```java
    @Override
    public ConfigCreator newConfigCreator() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-fetcher-plugin/kafka-fetcher-plugin/src/main/java/org/apache/skywalking/oap/server/analyzer/agent/kafka/KafkaFetcherHandlerRegister.java`
#### Snippet
```java
                                                  try {
                                                      entry.getValue().get();
                                                      return null;
                                                  } catch (InterruptedException | ExecutionException ignore) {
                                                  }
```

### ReturnNull
Return of `null`
in `oap-server/exporter/src/main/java/org/apache/skywalking/oap/server/exporter/provider/MetricFormatter.java`
#### Snippet
```java
            return "";
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `oap-server/server-cluster-plugin/cluster-etcd-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/etcd/ClusterModuleEtcdConfig.java`
#### Snippet
```java
    public String getNamespace() {
        if (Strings.isNullOrEmpty(namespace)) {
            return null;
        }
        if (!namespace.endsWith("/")) {
```

### ReturnNull
Return of `null`
in `oap-server/analyzer/log-analyzer/src/main/java/org/apache/skywalking/oap/log/analyzer/dsl/spec/LALDelegatingScript.java`
#### Snippet
```java
    @Override
    public Object run() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/analyzer/log-analyzer/src/main/java/org/apache/skywalking/oap/log/analyzer/dsl/Binding.java`
#### Snippet
```java
                return result;
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `oap-server/analyzer/log-analyzer/src/main/java/org/apache/skywalking/oap/log/analyzer/dsl/Binding.java`
#### Snippet
```java
            } catch (MissingPropertyException ignored) {
            }
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `oap-server/analyzer/log-analyzer/src/main/java/org/apache/skywalking/oap/log/analyzer/provider/log/listener/LogFilterListener.java`
#### Snippet
```java
        public LogAnalysisListener create(Layer layer) {
            if (layer == null) {
                return null;
            }
            final Map<String, DSL> dsl = dsls.get(layer);
```

### ReturnNull
Return of `null`
in `oap-server/analyzer/log-analyzer/src/main/java/org/apache/skywalking/oap/log/analyzer/provider/log/listener/LogFilterListener.java`
#### Snippet
```java
            final Map<String, DSL> dsl = dsls.get(layer);
            if (dsl == null) {
                return null;
            }
            return new LogFilterListener(dsl.values());
```

### ReturnNull
Return of `null`
in `oap-server/server-receiver-plugin/skywalking-clr-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/clr/provider/CLRModuleProvider.java`
#### Snippet
```java
    @Override
    public ConfigCreator newConfigCreator() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/analyzer/log-analyzer/src/main/java/org/apache/skywalking/oap/log/analyzer/provider/LALConfigs.java`
#### Snippet
```java
                                 log.debug("Failed to read file {}", f, e);
                             }
                             return null;
                         })
                         .filter(Objects::nonNull)
```

### ReturnNull
Return of `null`
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/StringUtil.java`
#### Snippet
```java
    public static String trim(final String str, final char ch) {
        if (isEmpty(str)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/StringUtil.java`
#### Snippet
```java
    public static String join(final char delimiter, final String... strings) {
        if (strings.length == 0) {
            return null;
        }
        if (strings.length == 1) {
```

### ReturnNull
Return of `null`
in `oap-server/server-library/library-util/src/main/java/org/apache/skywalking/oap/server/library/util/prometheus/parser/TextParser.java`
#### Snippet
```java
        }
        if (line == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `oap-server/server-query-plugin/zipkin-query-plugin/src/main/java/org/apache/skywalking/oap/query/zipkin/handler/ZipkinQueryHandler.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `oap-server/server-receiver-plugin/zipkin-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/zipkin/handler/ZipkinSpanHTTPHandler.java`
#### Snippet
```java
            }
            timer.close();
            return null;
        });
        return response;
```

### ReturnNull
Return of `null`
in `oap-server/server-receiver-plugin/skywalking-profile-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/profile/provider/ProfileModuleProvider.java`
#### Snippet
```java
    @Override
    public ConfigCreator newConfigCreator() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-receiver-plugin/skywalking-management-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/register/provider/RegisterModuleProvider.java`
#### Snippet
```java
    @Override
    public ConfigCreator newConfigCreator() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/query/TraceQueryService.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/query/MetadataQueryService.java`
#### Snippet
```java
    public Service getService(final String serviceId) throws IOException {
        final List<Service> services = this.combineServices(getMetadataQueryDAO().getServices(serviceId));
        return services.size() > 0 ? services.get(0) : null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/query/MetadataQueryService.java`
#### Snippet
```java
    public Process getProcess(String processId) throws IOException {
        if (StringUtils.isEmpty(processId)) {
            return null;
        }
        return getMetadataQueryDAO().getProcess(processId);
```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/query/input/Entity.java`
#### Snippet
```java
            case All:
                // This is unnecessary. Just for making core clear.
                return null;
            case Service:
                return IDManager.ServiceID.buildId(serviceName, normal);
```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/query/input/Entity.java`
#### Snippet
```java
                );
            default:
                return null;
        }
    }
```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/zipkin/ZipkinServiceSpanTraffic.java`
#### Snippet
```java
    @Override
    public Metrics toDay() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/zipkin/ZipkinServiceSpanTraffic.java`
#### Snippet
```java
    @Override
    public Metrics toHour() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/zipkin/ZipkinServiceTraffic.java`
#### Snippet
```java
    @Override
    public Metrics toHour() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/zipkin/ZipkinServiceTraffic.java`
#### Snippet
```java
    @Override
    public Metrics toDay() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/zipkin/ZipkinServiceRelationTraffic.java`
#### Snippet
```java
    @Override
    public Metrics toHour() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/zipkin/ZipkinServiceRelationTraffic.java`
#### Snippet
```java
    @Override
    public Metrics toDay() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/FunctionCategory.java`
#### Snippet
```java
    private static Annotation doGetAnnotation(Class<?> clazz, Class<? extends Annotation> annotationClass) {
        if (clazz.equals(Object.class)) {
            return null;
        }
        Annotation[] annotations = clazz.getAnnotations();
```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/command/CommandService.java`
#### Snippet
```java
    private EBPFProfilingTaskExtensionConfig convertExtension(EBPFProfilingTaskRecord task) {
        if (StringUtil.isEmpty(task.getExtensionConfigJson())) {
            return null;
        }
        EBPFProfilingTaskExtension extensionConfig = GSON.fromJson(task.getExtensionConfigJson(), EBPFProfilingTaskExtension.class);
```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/command/CommandService.java`
#### Snippet
```java
        EBPFProfilingTaskExtension extensionConfig = GSON.fromJson(task.getExtensionConfigJson(), EBPFProfilingTaskExtension.class);
        if (CollectionUtils.isEmpty(extensionConfig.getNetworkSamplings())) {
            return null;
        }
        EBPFProfilingTaskExtensionConfig config = new EBPFProfilingTaskExtensionConfig();
```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/process/ServiceLabelRecord.java`
#### Snippet
```java
    @Override
    public Metrics toHour() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/process/ServiceLabelRecord.java`
#### Snippet
```java
    @Override
    public Metrics toDay() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/endpoint/EndpointTraffic.java`
#### Snippet
```java
    @Override
    public Metrics toDay() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/endpoint/EndpointTraffic.java`
#### Snippet
```java
    @Override
    public Metrics toHour() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/process/ProcessTraffic.java`
#### Snippet
```java
    @Override
    public Metrics toDay() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/process/ProcessTraffic.java`
#### Snippet
```java
    @Override
    public Metrics toHour() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/service/ServiceTraffic.java`
#### Snippet
```java
    @Override
    public Metrics toDay() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/service/ServiceTraffic.java`
#### Snippet
```java
    @Override
    public Metrics toHour() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/relation/process/ProcessRelationClientSideMetrics.java`
#### Snippet
```java
    @Override
    public Metrics toHour() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/relation/process/ProcessRelationClientSideMetrics.java`
#### Snippet
```java
    @Override
    public Metrics toDay() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/relation/process/ProcessRelationServerSideMetrics.java`
#### Snippet
```java
    @Override
    public Metrics toDay() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/relation/process/ProcessRelationServerSideMetrics.java`
#### Snippet
```java
    @Override
    public Metrics toHour() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/instance/InstanceTraffic.java`
#### Snippet
```java
    @Override
    public Metrics toHour() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/instance/InstanceTraffic.java`
#### Snippet
```java
    @Override
    public Metrics toDay() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/searchtag/TagAutocompleteData.java`
#### Snippet
```java
    @Override
    public Metrics toDay() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/searchtag/TagAutocompleteData.java`
#### Snippet
```java
    @Override
    public Metrics toHour() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/networkalias/NetworkAddressAlias.java`
#### Snippet
```java
    @Override
    public Metrics toDay() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/networkalias/NetworkAddressAlias.java`
#### Snippet
```java
    @Override
    public Metrics toHour() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/metrics/Event.java`
#### Snippet
```java
    @Override
    public Metrics toDay() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/metrics/Event.java`
#### Snippet
```java
    @Override
    public Metrics toHour() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/storage/EBPFProfilingScheduleRecord.java`
#### Snippet
```java
    @Override
    public Metrics toDay() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/storage/EBPFProfilingScheduleRecord.java`
#### Snippet
```java
    @Override
    public Metrics toHour() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/worker/MetricsPersistentWorker.java`
#### Snippet
```java
        // Policy, always try load from the database when miss in the cache.
        if (!model.isTimeRelativeID()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/worker/MetricsPersistentWorker.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/trace/ProfileTaskMutationService.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/EBPFProfilingMutationService.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/EBPFProfilingMutationService.java`
#### Snippet
```java
            return "the profiling target could not be null";
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/EBPFProfilingMutationService.java`
#### Snippet
```java
            return "the max response size must bigger than zero";
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/EBPFProfilingMutationService.java`
#### Snippet
```java
    private String validateSamplingRules(List<EBPFNetworkSamplingRule> rules) {
        if (CollectionUtils.isEmpty(rules)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/EBPFProfilingMutationService.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/EBPFProfilingMutationService.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/EBPFProfilingMutationService.java`
#### Snippet
```java
            return "the fixed time duration must be greater than or equals " + FIXED_TIME_MIN_DURATION + "s";
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/EBPFProfilingMutationService.java`
#### Snippet
```java
            return error;
        }
        return StringUtil.isNotEmpty(data) ? null : String.format("%s could not be empty", type);
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/continuous/ContinuousProfilingMutationService.java`
#### Snippet
```java
            return "parsing threshold error";
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/continuous/ContinuousProfilingMutationService.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/continuous/ContinuousProfilingMutationService.java`
#### Snippet
```java
            return "count must be small than period";
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/management/ui/template/UITemplateManagementService.java`
#### Snippet
```java
        DashboardConfiguration configuration = getUITemplateManagementDAO().getTemplate(id);
        if (configuration.isDisabled()) {
            return null;
        }
        return configuration;
```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/analyze/EBPFProfilingAnalyzer.java`
#### Snippet
```java
            } catch (Exception ex) {
                log.warn("could not deserialize the stack", ex);
                return null;
            }
        }).filter(Objects::nonNull).distinct();
```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/analyze/EBPFProfilingAnalyzer.java`
#### Snippet
```java
    protected List<TimeRange> buildTimeRanges(long start, long end) {
        if (start >= end) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/trace/analyze/ProfileAnalyzer.java`
#### Snippet
```java
    protected List<ProfileStackTree> analyzeByStack(List<ProfileStack> stacks) {
        if (CollectionUtils.isEmpty(stacks)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/trace/analyze/ProfileAnalyzer.java`
#### Snippet
```java
            } catch (IOException e) {
                LOGGER.warn(e.getMessage(), e);
                return null;
            }
        }).filter(Objects::nonNull).collect(Collectors.toList());
```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/trace/analyze/ProfileAnalyzer.java`
#### Snippet
```java
        // data not found
        if (maxSequence <= 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/prometheus/rule/Rules.java`
#### Snippet
```java
        File file = path.toFile();
        if (!file.isFile() || file.isHidden()) {
            return null;
        }
        try (Reader r = new FileReader(file)) {
```

### ReturnNull
Return of `null`
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/prometheus/rule/Rules.java`
#### Snippet
```java
            Rule rule = new Yaml().loadAs(r, Rule.class);
            if (rule == null) {
                return null;
            }
            rule.setName(ruleName);
```

### ReturnNull
Return of `null`
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/trace/ProfileTaskQueryService.java`
#### Snippet
```java
            } catch (InvalidProtocolBufferException e) {
                log.warn("parsing segment data error", e);
                return null;
            }
        }).filter(java.util.Objects::nonNull).filter(s -> CollectionUtils.isNotEmpty(s._2.getSpansList())).collect(Collectors.toMap(
```

### ReturnNull
Return of `null`
in `oap-server/server-library/library-elasticsearch-client/src/main/java/org/apache/skywalking/library/elasticsearch/requests/factory/v7plus/codec/V7MappingsDeserializer.java`
#### Snippet
```java
            return mappings;
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCBrowserLogQueryDAO.java`
#### Snippet
```java
                    }

                    return null;
                },
                sqlAndParameters.parameters()
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCEventQueryDAO.java`
#### Snippet
```java
                }

                return null;
            }, parameters);
        }
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCEventQueryDAO.java`
#### Snippet
```java
                    events.add(parseResultSet(resultSet));
                }
                return null;
            }, parameters);
        }
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCTagAutoCompleteQueryDAO.java`
#### Snippet
```java
                        results.add(resultSet.getString(TagAutocompleteData.TAG_VALUE));
                    }
                    return null;
                },
                sqlAndParameters.parameters()
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCTagAutoCompleteQueryDAO.java`
#### Snippet
```java
                        results.add(resultSet.getString(TagAutocompleteData.TAG_KEY));
                    }
                    return null;
                },
                sqlAndParameters.parameters());
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCRecordsQueryDAO.java`
#### Snippet
```java
                        results.add(record);
                    }
                    return null;
                },
                sqlAndParameters.parameters());
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCProfileTaskQueryDAO.java`
#### Snippet
```java
    public ProfileTask getById(String id) {
        if (StringUtil.isEmpty(id)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCProfileTaskQueryDAO.java`
#### Snippet
```java
                        return parseTask(resultSet);
                    }
                    return null;
                },
                condition.toArray(new Object[0]));
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCProfileTaskQueryDAO.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCAlarmQueryDAO.java`
#### Snippet
```java
                    alarmMsgs.add(message);
                }
                return null;
            }, sqlAndParameters.parameters());
        }
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCProfileThreadSnapshotQueryDAO.java`
#### Snippet
```java
                    results.add(record);
                }
                return null;
            }, params);
        }
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCProfileThreadSnapshotQueryDAO.java`
#### Snippet
```java
                    result.add(resultSet.getInt(1));
                }
                return null;
            }, params);
        }
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCSpanAttachedEventQueryDAO.java`
#### Snippet
```java
                    }

                    return null;
                },
                sqlAndParameters.parameters());
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCMetricsQueryDAO.java`
#### Snippet
```java
                    heatMap.fixMissingColumns(ids, defaultValue);

                    return null;
                },
                ids.toArray(new Object[0]));
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCMetricsQueryDAO.java`
#### Snippet
```java
                        idMap.put(id, multipleValues);
                    }
                    return null;
                },
                ids.toArray(new Object[0]));
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCMetricsQueryDAO.java`
#### Snippet
```java
                        intValues.addKVInt(kv);
                    }
                    return null;
                },
                ids.toArray(new Object[0]));
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCMetricsQueryDAO.java`
#### Snippet
```java
                        results.add(resultSet.getLong("result"));
                    }
                    return null;
                },
                parameters.toArray(new Object[0])
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCUITemplateManagementDAO.java`
#### Snippet
```java
    public DashboardConfiguration getTemplate(final String id) {
        if (StringUtil.isEmpty(id)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCUITemplateManagementDAO.java`
#### Snippet
```java
                    return new DashboardConfiguration().fromEntity(uiTemplate);
                }
                return null;
            }, condition.toArray(new Object[0]));
            if (result != null) {
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCUITemplateManagementDAO.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCUITemplateManagementDAO.java`
#### Snippet
```java
                }
                while (uiTemplate != null);
                return null;
            }, condition.toArray(new Object[0]));
        }
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCSQLExecutor.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCSQLExecutor.java`
#### Snippet
```java
                }

                return null;
            }, ids.toArray());
        }
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCSQLExecutor.java`
#### Snippet
```java
            return storageBuilder.storage2Entity(new HashMapConverter.ToEntity(data));
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCTopologyQueryDAO.java`
#### Snippet
```java
                resultSet -> {
                    buildEndpointCalls(resultSet, calls, DetectPoint.SERVER);
                    return null;
                },
                conditions
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCTopologyQueryDAO.java`
#### Snippet
```java
                resultSet -> {
                    buildProcessCalls(resultSet, calls, detectPoint);
                    return null;
                },
                conditions
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCTopologyQueryDAO.java`
#### Snippet
```java
                resultSet -> {
                    buildServiceCalls(resultSet, calls, detectPoint);
                    return null;
                },
                conditions
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCTopologyQueryDAO.java`
#### Snippet
```java
                resultSet -> {
                    buildInstanceCalls(resultSet, calls, detectPoint);
                    return null;
                },
                conditions
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCTraceQueryDAO.java`
#### Snippet
```java
                resultSet -> {
                    segmentRecords.addAll(buildRecords(resultSet));
                    return null;
                },
                SegmentRecord.INDEX_NAME, traceId
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCTraceQueryDAO.java`
#### Snippet
```java
                        traces.add(basicTrace);
                    }
                    return null;
                },
                parameters.toArray(new Object[0]));
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCTraceQueryDAO.java`
#### Snippet
```java
                resultSet -> {
                    segmentRecords.addAll(buildRecords(resultSet));
                    return null;
                },
                conditions.toArray()
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCTraceQueryDAO.java`
#### Snippet
```java
                resultSet -> {
                    segmentRecords.addAll(buildRecords(resultSet));
                    return null;
                },
                conditions.toArray()
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCZipkinQueryDAO.java`
#### Snippet
```java
                    services.add(resultSet.getString(ZipkinServiceTraffic.SERVICE_NAME));
                }
                return null;
            }, ZipkinServiceTraffic.INDEX_NAME);
        }
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCZipkinQueryDAO.java`
#### Snippet
```java
                    trace.add(buildSpan(resultSet));
                }
                return null;
            }, condition.toArray(new Object[0]));
        }
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCZipkinQueryDAO.java`
#### Snippet
```java
                    remoteServices.add(resultSet.getString(ZipkinServiceRelationTraffic.REMOTE_SERVICE_NAME));
                }
                return null;
            }, condition.toArray(new Object[0]));
        }
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCZipkinQueryDAO.java`
#### Snippet
```java
                    spanNames.add(resultSet.getString(ZipkinServiceSpanTraffic.SPAN_NAME));
                }
                return null;
            }, condition.toArray(new Object[0]));
        }
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCZipkinQueryDAO.java`
#### Snippet
```java
                    traceIds.add(resultSet.getString(ZipkinSpanRecord.TRACE_ID));
                }
                return null;
            }, condition.toArray(new Object[0]));
        }
```

### ReturnNull
Return of `null`
in `oap-server/server-receiver-plugin/skywalking-meter-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/meter/provider/MeterReceiverProvider.java`
#### Snippet
```java
    @Override
    public ConfigCreator newConfigCreator() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCAggregationQueryDAO.java`
#### Snippet
```java
                    results.add(topNEntity);
                }
                return null;
            }, sqlAndParameters.parameters());
        }
```

### ReturnNull
Return of `null`
in `oap-server/analyzer/agent-analyzer/src/main/java/org/apache/skywalking/oap/server/analyzer/provider/AnalyzerModuleConfig.java`
#### Snippet
```java
    public List<String> meterAnalyzerActiveFileNames() {
        if (StringUtils.isEmpty(this.meterAnalyzerActiveFiles)) {
            return null;
        }
        return Splitter.on(",").splitToList(this.meterAnalyzerActiveFiles);
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCMetadataQueryDAO.java`
#### Snippet
```java
                resultSet -> {
                    final List<Process> processes = buildProcesses(resultSet);
                    return processes.size() > 0 ? processes.get(0) : null;
                },
                condition.toArray(new Object[0]));
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCMetadataQueryDAO.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCMetadataQueryDAO.java`
#### Snippet
```java
            final var result = jdbcClient.executeQuery(sql.toString(), resultSet -> {
                final List<ServiceInstance> instances = buildInstances(resultSet);
                return instances.size() > 0 ? instances.get(0) : null;
            }, condition.toArray(new Object[0]));
            if (result != null) {
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-jdbc-hikaricp-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/jdbc/common/dao/JDBCMetadataQueryDAO.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/analyzer/agent-analyzer/src/main/java/org/apache/skywalking/oap/server/analyzer/provider/meter/config/MeterConfigs.java`
#### Snippet
```java
                fileName = (dotIndex == -1) ? fileName : fileName.substring(0, dotIndex);
                if (!fileNames.contains(fileName)) {
                    return null;
                }
                try (Reader r = new FileReader(f)) {
```

### ReturnNull
Return of `null`
in `oap-server/analyzer/agent-analyzer/src/main/java/org/apache/skywalking/oap/server/analyzer/provider/meter/config/MeterConfigs.java`
#### Snippet
```java
                    log.warn("Reading file {} failed", f, e);
                }
                return null;
            })
            .filter(Objects::nonNull)
```

### ReturnNull
Return of `null`
in `oap-server/analyzer/agent-analyzer/src/main/java/org/apache/skywalking/oap/server/analyzer/provider/trace/TraceSamplingPolicyWatcher.java`
#### Snippet
```java
        }
        // Config update maybe parse fail
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/analyzer/agent-analyzer/src/main/java/org/apache/skywalking/oap/server/analyzer/provider/trace/parser/listener/RPCTrafficSourceBuilder.java`
#### Snippet
```java
    ServiceInstanceRelation toServiceInstanceRelation() {
        if (StringUtil.isEmpty(sourceServiceInstanceName) || StringUtil.isEmpty(destServiceInstanceName)) {
            return null;
        }
        ServiceInstanceRelation serviceInstanceRelation = new ServiceInstanceRelation();
```

### ReturnNull
Return of `null`
in `oap-server/analyzer/agent-analyzer/src/main/java/org/apache/skywalking/oap/server/analyzer/provider/trace/parser/listener/RPCTrafficSourceBuilder.java`
#### Snippet
```java
    EndpointRelation toEndpointRelation() {
        if (StringUtil.isEmpty(sourceEndpointName) || StringUtil.isEmpty(destEndpointName)) {
            return null;
        }
        EndpointRelation endpointRelation = new EndpointRelation();
```

### ReturnNull
Return of `null`
in `oap-server/server-receiver-plugin/skywalking-mesh-receiver-plugin/src/main/java/org/apache/skywalking/aop/server/receiver/mesh/MeshReceiverProvider.java`
#### Snippet
```java
    @Override
    public ConfigCreator newConfigCreator() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-receiver-plugin/skywalking-jvm-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/jvm/provider/JVMModuleProvider.java`
#### Snippet
```java
    @Override
    public ConfigCreator newConfigCreator() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-receiver-plugin/skywalking-zabbix-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/zabbix/provider/protocol/ZabbixProtocolDecoder.java`
#### Snippet
```java
        if (readable < HEADER_LEN) {
            byteBuf.readerIndex(baseIndex);
            return null;
        }

```

### ReturnNull
Return of `null`
in `oap-server/server-receiver-plugin/skywalking-zabbix-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/zabbix/provider/protocol/ZabbixProtocolDecoder.java`
#### Snippet
```java
        if (readable < totalLength) {
            byteBuf.readerIndex(baseIndex);
            return null;
        }

```

### ReturnNull
Return of `null`
in `oap-server/server-receiver-plugin/skywalking-zabbix-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/zabbix/provider/config/ZabbixConfigs.java`
#### Snippet
```java
                fileName = (dotIndex == -1) ? fileName : fileName.substring(0, dotIndex);
                if (!fileNames.contains(fileName)) {
                    return null;
                }
                try (Reader r = new FileReader(f)) {
```

### ReturnNull
Return of `null`
in `oap-server/server-receiver-plugin/skywalking-zabbix-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/zabbix/provider/config/ZabbixConfigs.java`
#### Snippet
```java
                    log.warn("Reading file {} failed", f, e);
                }
                return null;
            })
            .filter(Objects::nonNull)
```

### ReturnNull
Return of `null`
in `oap-server/server-receiver-plugin/skywalking-zabbix-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/zabbix/provider/protocol/bean/ZabbixProtocolType.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `oap-server/server-receiver-plugin/skywalking-zabbix-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/zabbix/provider/ZabbixMetrics.java`
#### Snippet
```java
                        .map(d -> Tuple.of(label.getName(), d.getValue())).orElse(null);
                }
                return null;
            }).filter(Objects::nonNull).collect(Collectors.toMap(Tuple2::_1, Tuple2::_2));
        }
```

### ReturnNull
Return of `null`
in `oap-server/analyzer/event-analyzer/src/main/java/org/apache/skywalking/oap/server/analyzer/event/EventAnalyzerModuleProvider.java`
#### Snippet
```java
    @Override
    public ConfigCreator newConfigCreator() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-receiver-plugin/skywalking-log-recevier-plugin/src/main/java/org/apache/skywalking/oap/server/recevier/log/provider/LogModuleProvider.java`
#### Snippet
```java
    @Override
    public ConfigCreator newConfigCreator() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-configuration/configuration-nacos/src/main/java/org/apache/skywalking/oap/server/configuration/nacos/NacosConfigWatcherRegister.java`
#### Snippet
```java
                    @Override
                    public Executor getExecutor() {
                        return null;
                    }

```

### ReturnNull
Return of `null`
in `oap-server/server-receiver-plugin/skywalking-trace-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/trace/provider/TraceModuleProvider.java`
#### Snippet
```java
    @Override
    public ConfigCreator newConfigCreator() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/BanyanDBStorageClient.java`
#### Snippet
```java
            if (ex.getStatus().equals(Status.Code.NOT_FOUND)) {
                this.healthChecker.health();
                return null;
            }

```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/BanyanDBUITemplateManagementDAO.java`
#### Snippet
```java
        Property p = getClient().queryProperty(GROUP, UITemplate.INDEX_NAME, id);
        if (p == null) {
            return null;
        }
        return fromEntity(parse(p));
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/stream/BanyanDBProfileTaskQueryDAO.java`
#### Snippet
```java

        if (resp.size() == 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/stream/BanyanDBContinuousProfilingPolicyDAO.java`
#### Snippet
```java
            } catch (IOException e) {
                log.warn("query policy error", e);
                return null;
            }
        }).filter(Objects::nonNull).map(properties -> {
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/measure/BanyanDBMetadataQueryDAO.java`
#### Snippet
```java
        MetadataRegistry.Schema schema = MetadataRegistry.INSTANCE.findMetadata(ProcessTraffic.INDEX_NAME, DownSampling.Minute);

        return resp.size() > 0 ? buildProcess(resp.getDataPoints().get(0), schema) : null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/measure/BanyanDBMetadataQueryDAO.java`
#### Snippet
```java
                });
        MetadataRegistry.Schema schema = MetadataRegistry.INSTANCE.findMetadata(InstanceTraffic.INDEX_NAME, DownSampling.Minute);
        return resp.size() > 0 ? buildInstance(resp.getDataPoints().get(0), schema) : null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/MetadataRegistry.java`
#### Snippet
```java
        final Schema s = this.registry.get(recordModelName);
        if (s == null) {
            return null;
        }
        // impose sanity check
```

### ReturnNull
Return of `null`
in `oap-server/server-receiver-plugin/skywalking-event-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/event/EventModuleProvider.java`
#### Snippet
```java
    @Override
    public ConfigCreator newConfigCreator() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-cluster-plugin/cluster-standalone-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/standalone/ClusterModuleStandaloneProvider.java`
#### Snippet
```java
    @Override
    public ConfigCreator newConfigCreator() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-configuration/configuration-etcd/src/main/java/org/apache/skywalking/oap/server/configuration/etcd/EtcdServerSettings.java`
#### Snippet
```java
    public String getNamespace() {
        if (Strings.isNullOrEmpty(namespace)) {
            return null;
        }
        if (!namespace.endsWith("/")) {
```

### ReturnNull
Return of `null`
in `oap-server/server-tools/profile-exporter/tool-profile-snapshot-server-mock/src/main/java/org/apache/skywalking/oap/server/tool/profile/core/mock/MockComponentLibraryCatalogService.java`
#### Snippet
```java
    @Override
    public String getServerNameBasedOnComponent(int componentId) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-tools/profile-exporter/tool-profile-snapshot-server-mock/src/main/java/org/apache/skywalking/oap/server/tool/profile/core/mock/MockComponentLibraryCatalogService.java`
#### Snippet
```java
    @Override
    public String getComponentName(int componentId) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-tools/profile-exporter/tool-profile-snapshot-server-mock/src/main/java/org/apache/skywalking/oap/server/tool/profile/core/mock/MockWorkerInstancesService.java`
#### Snippet
```java
    @Override
    public RemoteHandleWorker get(String nextWorkerName) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-tools/profile-exporter/tool-profile-snapshot-server-mock/src/main/java/org/apache/skywalking/oap/server/tool/profile/core/mock/MockSourceReceiver.java`
#### Snippet
```java
    @Override
    public DispatcherDetectorListener getDispatcherDetectorListener() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `oap-server/server-tools/profile-exporter/tool-profile-snapshot-server-mock/src/main/java/org/apache/skywalking/oap/server/tool/profile/core/MockCoreModuleProvider.java`
#### Snippet
```java
    @Override
    public ConfigCreator newConfigCreator() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-configuration/configuration-api/src/main/java/org/apache/skywalking/oap/server/configuration/api/NoneConfigurationProvider.java`
#### Snippet
```java
    @Override
    public ConfigCreator newConfigCreator() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-receiver-plugin/envoy-metrics-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/envoy/als/k8s/K8SServiceRegistry.java`
#### Snippet
```java
                                    .build();
                            }
                            return null;
                        })
                        .filter(Objects::nonNull)
```

### ReturnNull
Return of `null`
in `oap-server/server-receiver-plugin/envoy-metrics-receiver-plugin/src/main/java/org/apache/skywalking/oap/server/receiver/envoy/als/k8s/ServiceNameFormatter.java`
#### Snippet
```java
                                               return PropertyUtils.getProperty(context, it);
                                           } catch (Exception e) {
                                               return null;
                                           }
                                       })
```

### ReturnNull
Return of `null`
in `oap-server/server-alarm-plugin/src/main/java/org/apache/skywalking/oap/server/core/alarm/provider/AlarmModuleProvider.java`
#### Snippet
```java
    @Override
    public ConfigCreator newConfigCreator() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/stream/AbstractBanyanDBDAO.java`
#### Snippet
```java
        protected AbstractCriteria or(List<? extends AbstractCriteria> conditions) {
            if (conditions.isEmpty()) {
                return null;
            }
            if (conditions.size() == 1) {
```

### ReturnNull
Return of `null`
in `oap-server/server-storage-plugin/storage-banyandb-plugin/src/main/java/org/apache/skywalking/oap/server/storage/plugin/banyandb/stream/AbstractBanyanDBDAO.java`
#### Snippet
```java
        protected AbstractCriteria and(List<? extends AbstractCriteria> conditions) {
            if (conditions.isEmpty()) {
                return null;
            }
            if (conditions.size() == 1) {
```

### ReturnNull
Return of `null`
in `oap-server/server-alarm-plugin/src/main/java/org/apache/skywalking/oap/server/core/alarm/provider/expression/Expression.java`
#### Snippet
```java
        } catch (Throwable e) {
            log.error("eval expression {} error", expression, e);
            return null;
        }
    }
```

## RuleId[id=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `rule`
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/prometheus/rule/Rules.java`
#### Snippet
```java
                .stream()
                .map(rule -> {
                    rule = rule.trim();
                    if (rule.startsWith("/")) {
                        rule = rule.substring(1);
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `rule`
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/prometheus/rule/Rules.java`
#### Snippet
```java
                    rule = rule.trim();
                    if (rule.startsWith("/")) {
                        rule = rule.substring(1);
                    }
                    if (!rule.endsWith(".yaml") && !rule.endsWith(".yml")) {
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `profileTaskList` is redundant
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/cache/ProfileTaskCache.java`
#### Snippet
```java
    public List<ProfileTask> getProfileTaskList(String serviceId) {
        // read profile task list from cache only, use cache update timer mechanism
        List<ProfileTask> profileTaskList = profileTaskDownstreamCache.getIfPresent(serviceId);
        return profileTaskList;
    }
```

### UnnecessaryLocalVariable
Local variable `allTemplates` is redundant
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/management/ui/template/UITemplateManagementService.java`
#### Snippet
```java

    public List<DashboardConfiguration> getAllTemplates(Boolean includingDisabled) throws IOException {
        final List<DashboardConfiguration> allTemplates =
            getUITemplateManagementDAO().getAllTemplates(includingDisabled);
        return allTemplates;
```

### UnnecessaryLocalVariable
Local variable `now` is redundant
in `oap-server/server-alarm-plugin/src/main/java/org/apache/skywalking/oap/server/core/alarm/provider/AlarmCore.java`
#### Snippet
```java

    public void start(List<AlarmCallback> allCallbacks) {
        LocalDateTime now = LocalDateTime.now();
        lastExecuteTime = now;
        Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(() -> {
```

### UnnecessaryLocalVariable
Local variable `name` is redundant
in `oap-server/analyzer/meter-analyzer/src/main/java/org/apache/skywalking/oap/meter/analyzer/dsl/SampleFamily.java`
#### Snippet
```java

        private static String dim(List<Sample> samples, List<String> labelKeys, String delimiter) {
            String name = labelKeys.stream()
                                   .map(k -> samples.get(0).labels.getOrDefault(k, ""))
                                   .filter(v -> !StringUtil.isEmpty(v))
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `oap-server/exporter/src/main/java/org/apache/skywalking/oap/server/exporter/provider/grpc/GRPCMetricsExporter.java`
#### Snippet
```java
            try {
                sleepTime += cycle;
                Thread.sleep(cycle);
            } catch (InterruptedException e) {
            }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/remote/client/GRPCRemoteClient.java`
#### Snippet
```java
        while (concurrentStreamObserverNumber.get() > 10) {
            try {
                Thread.sleep(sleepMillis);
            } catch (InterruptedException e) {
                log.error(e.getMessage(), e);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/storage/model/ModelInstaller.java`
#### Snippet
```java
                        model.getName()
                    );
                    Thread.sleep(3000L);
                } catch (InterruptedException e) {
                    log.error(e.getMessage());
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `oap-server/server-library/library-datacarrier-queue/src/main/java/org/apache/skywalking/oap/server/library/datacarrier/consumer/MultipleChannelsConsumer.java`
#### Snippet
```java
            if (!hasData) {
                try {
                    Thread.sleep(consumeCycle);
                } catch (InterruptedException e) {
                }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `oap-server/server-library/library-datacarrier-queue/src/main/java/org/apache/skywalking/oap/server/library/datacarrier/consumer/ConsumerThread.java`
#### Snippet
```java
            if (!consume(consumeList)) {
                try {
                    Thread.sleep(consumeCycle);
                } catch (InterruptedException e) {
                }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `oap-server/server-alarm-plugin/src/main/java/org/apache/skywalking/oap/server/core/alarm/provider/grpc/GRPCCallback.java`
#### Snippet
```java
            try {
                sleepTime += cycle;
                Thread.sleep(cycle);
            } catch (InterruptedException ignored) {
            }
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/query/enumeration/ProfilingSupportStatus.java`
#### Snippet
```java

    static {
        Arrays.stream(ProfilingSupportStatus.values()).collect(Collectors.toMap(ProfilingSupportStatus::value, type -> type)).forEach(DICTIONARY::put);
    }

```

### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/manual/process/ProcessDetectType.java`
#### Snippet
```java

    static {
        Arrays.stream(ProcessDetectType.values()).collect(Collectors.toMap(ProcessDetectType::value, type -> type)).forEach(DICTIONARY::put);
    }

```

### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/storage/EBPFProfilingTriggerType.java`
#### Snippet
```java

    static {
        Arrays.stream(EBPFProfilingTriggerType.values()).collect(Collectors.toMap(EBPFProfilingTriggerType::value, type -> type)).forEach(DICTIONARY::put);
    }

```

### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/storage/EBPFProfilingStackType.java`
#### Snippet
```java

    static {
        Arrays.stream(EBPFProfilingStackType.values()).collect(Collectors.toMap(EBPFProfilingStackType::value, type -> type)).forEach(DICTIONARY::put);
        Arrays.stream(EBPFProfilingStackType.values()).collect(Collectors.toMap(EBPFProfilingStackType::mapping, type -> type)).forEach(MAPPING::put);
    }
```

### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/storage/EBPFProfilingTargetType.java`
#### Snippet
```java

    static {
        Arrays.stream(EBPFProfilingTargetType.values()).collect(Collectors.toMap(EBPFProfilingTargetType::value, type -> type)).forEach(DICTIONARY::put);
        Arrays.stream(EBPFProfilingTargetType.values()).filter(s -> Objects.nonNull(s.getContinuousProfilingTargetType()))
            .collect(Collectors.toMap(EBPFProfilingTargetType::getContinuousProfilingTargetType, type -> type)).forEach(CONTINUOUS_PROFILING_TARGET_DICTIONARY::put);
```

### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/storage/EBPFProfilingTargetType.java`
#### Snippet
```java
        Arrays.stream(EBPFProfilingTargetType.values()).collect(Collectors.toMap(EBPFProfilingTargetType::value, type -> type)).forEach(DICTIONARY::put);
        Arrays.stream(EBPFProfilingTargetType.values()).filter(s -> Objects.nonNull(s.getContinuousProfilingTargetType()))
            .collect(Collectors.toMap(EBPFProfilingTargetType::getContinuousProfilingTargetType, type -> type)).forEach(CONTINUOUS_PROFILING_TARGET_DICTIONARY::put);
    }

```

### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `oap-server/server-library/library-datacarrier-queue/src/main/java/org/apache/skywalking/oap/server/library/datacarrier/consumer/MultipleChannelsConsumer.java`
#### Snippet
```java
        ArrayList<Group> newList = new ArrayList<>();
        for (Group target : consumeTargets) {
            newList.add(target);
        }
        newList.add(group);
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'io.etcd.jetcd.KV' is marked unstable with @Beta
in `oap-server/server-cluster-plugin/cluster-etcd-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/etcd/EtcdCoordinator.java`
#### Snippet
```java
        List<RemoteInstance> remoteInstances = new ArrayList<>();
        try {
            final KV kvClient = client.getKVClient();
            final GetResponse response = kvClient.get(
                serviceNameBS,
```

### UnstableApiUsage
'getKVClient()' is unstable because its signature references unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `oap-server/server-cluster-plugin/cluster-etcd-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/etcd/EtcdCoordinator.java`
#### Snippet
```java
        List<RemoteInstance> remoteInstances = new ArrayList<>();
        try {
            final KV kvClient = client.getKVClient();
            final GetResponse response = kvClient.get(
                serviceNameBS,
```

### UnstableApiUsage
'get(io.etcd.jetcd.ByteSequence, io.etcd.jetcd.options.GetOption)' is declared in unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `oap-server/server-cluster-plugin/cluster-etcd-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/etcd/EtcdCoordinator.java`
#### Snippet
```java
        try {
            final KV kvClient = client.getKVClient();
            final GetResponse response = kvClient.get(
                serviceNameBS,
                GetOption.newBuilder().withPrefix(serviceNameBS).build()
```

### UnstableApiUsage
'getKVClient()' is unstable because its signature references unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `oap-server/server-cluster-plugin/cluster-etcd-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/etcd/EtcdCoordinator.java`
#### Snippet
```java

            ByteSequence instance = ByteSequence.from(GSON.toJson(endpoint), Charset.defaultCharset());
            client.getKVClient()
                  .put(
                      buildKey(serviceName, selfAddress, remoteInstance),
```

### UnstableApiUsage
'put(io.etcd.jetcd.ByteSequence, io.etcd.jetcd.ByteSequence, io.etcd.jetcd.options.PutOption)' is declared in unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `oap-server/server-cluster-plugin/cluster-etcd-plugin/src/main/java/org/apache/skywalking/oap/server/cluster/plugin/etcd/EtcdCoordinator.java`
#### Snippet
```java
            ByteSequence instance = ByteSequence.from(GSON.toJson(endpoint), Charset.defaultCharset());
            client.getKVClient()
                  .put(
                      buildKey(serviceName, selfAddress, remoteInstance),
                      instance,
```

### UnstableApiUsage
'newHasher()' is unstable because its signature references unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/source/EBPFProcessProfilingSchedule.java`
#### Snippet
```java
    public String getEntityId() {
        if (entityId == null) {
            entityId = Hashing.sha256().newHasher()
                    .putString(String.format("%s_%s_%d", taskId, processId, startTime), Charsets.UTF_8)
                    .hash().toString();
```

### UnstableApiUsage
'putString(java.lang.CharSequence, java.nio.charset.Charset)' is declared in unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/source/EBPFProcessProfilingSchedule.java`
#### Snippet
```java
        if (entityId == null) {
            entityId = Hashing.sha256().newHasher()
                    .putString(String.format("%s_%s_%d", taskId, processId, startTime), Charsets.UTF_8)
                    .hash().toString();
        }
```

### UnstableApiUsage
'hash()' is declared in unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/source/EBPFProcessProfilingSchedule.java`
#### Snippet
```java
            entityId = Hashing.sha256().newHasher()
                    .putString(String.format("%s_%s_%d", taskId, processId, startTime), Charsets.UTF_8)
                    .hash().toString();
        }
        return entityId;
```

### UnstableApiUsage
'newHasher()' is unstable because its signature references unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/IDManager.java`
#### Snippet
```java
                name = Const.BLANK_ENTITY_NAME;
            }
            return Hashing.sha256().newHasher().putString(String.format("%s_%s",
                                                                        name, instanceId
            ), Charsets.UTF_8).hash().toString();
```

### UnstableApiUsage
'putString(java.lang.CharSequence, java.nio.charset.Charset)' is declared in unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/IDManager.java`
#### Snippet
```java
                name = Const.BLANK_ENTITY_NAME;
            }
            return Hashing.sha256().newHasher().putString(String.format("%s_%s",
                                                                        name, instanceId
            ), Charsets.UTF_8).hash().toString();
```

### UnstableApiUsage
'hash()' is declared in unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/analysis/IDManager.java`
#### Snippet
```java
            return Hashing.sha256().newHasher().putString(String.format("%s_%s",
                                                                        name, instanceId
            ), Charsets.UTF_8).hash().toString();
        }

```

### UnstableApiUsage
'newHasher()' is unstable because its signature references unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/storage/EBPFProcessProfilingScheduleDispatcher.java`
#### Snippet
```java
        traffic.setEndTime(source.getCurrentTime());
        traffic.setTimeBucket(TimeBucket.getMinuteTimeBucket(source.getCurrentTime()));
        traffic.setScheduleId(Hashing.sha256().newHasher()
                                     .putString(String.format("%s_%s_%d", source.getTaskId(), source.getProcessId(), source.getStartTime()), Charsets.UTF_8)
                                     .hash().toString());
```

### UnstableApiUsage
'putString(java.lang.CharSequence, java.nio.charset.Charset)' is declared in unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/storage/EBPFProcessProfilingScheduleDispatcher.java`
#### Snippet
```java
        traffic.setTimeBucket(TimeBucket.getMinuteTimeBucket(source.getCurrentTime()));
        traffic.setScheduleId(Hashing.sha256().newHasher()
                                     .putString(String.format("%s_%s_%d", source.getTaskId(), source.getProcessId(), source.getStartTime()), Charsets.UTF_8)
                                     .hash().toString());
        MetricsStreamProcessor.getInstance().in(traffic);
```

### UnstableApiUsage
'hash()' is declared in unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/storage/EBPFProcessProfilingScheduleDispatcher.java`
#### Snippet
```java
        traffic.setScheduleId(Hashing.sha256().newHasher()
                                     .putString(String.format("%s_%s_%d", source.getTaskId(), source.getProcessId(), source.getStartTime()), Charsets.UTF_8)
                                     .hash().toString());
        MetricsStreamProcessor.getInstance().in(traffic);
    }
```

### UnstableApiUsage
'newHasher()' is unstable because its signature references unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/storage/EBPFProfilingTaskRecord.java`
#### Snippet
```java
                CREATE_TIME
            },
            Hashing.sha256().newHasher()
                   .putString(logicalId, Charsets.UTF_8)
                   .putLong(createTime)
```

### UnstableApiUsage
'putString(java.lang.CharSequence, java.nio.charset.Charset)' is declared in unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/storage/EBPFProfilingTaskRecord.java`
#### Snippet
```java
            },
            Hashing.sha256().newHasher()
                   .putString(logicalId, Charsets.UTF_8)
                   .putLong(createTime)
                   .hash().toString()
```

### UnstableApiUsage
'putLong(long)' is declared in unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/storage/EBPFProfilingTaskRecord.java`
#### Snippet
```java
            Hashing.sha256().newHasher()
                   .putString(logicalId, Charsets.UTF_8)
                   .putLong(createTime)
                   .hash().toString()
        );
```

### UnstableApiUsage
'hash()' is declared in unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/storage/EBPFProfilingTaskRecord.java`
#### Snippet
```java
                   .putString(logicalId, Charsets.UTF_8)
                   .putLong(createTime)
                   .hash().toString()
        );
    }
```

### UnstableApiUsage
'newHasher()' is unstable because its signature references unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/storage/EBPFProfilingTaskRecord.java`
#### Snippet
```java
     */
    public void generateLogicalId() {
        this.logicalId = Hashing.sha256().newHasher()
                                .putString(serviceId, Charsets.UTF_8)
                                .putString(processLabelsJson, Charsets.UTF_8)
```

### UnstableApiUsage
'putString(java.lang.CharSequence, java.nio.charset.Charset)' is declared in unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/storage/EBPFProfilingTaskRecord.java`
#### Snippet
```java
    public void generateLogicalId() {
        this.logicalId = Hashing.sha256().newHasher()
                                .putString(serviceId, Charsets.UTF_8)
                                .putString(processLabelsJson, Charsets.UTF_8)
                                .putLong(startTime)
```

### UnstableApiUsage
'putString(java.lang.CharSequence, java.nio.charset.Charset)' is declared in unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/storage/EBPFProfilingTaskRecord.java`
#### Snippet
```java
        this.logicalId = Hashing.sha256().newHasher()
                                .putString(serviceId, Charsets.UTF_8)
                                .putString(processLabelsJson, Charsets.UTF_8)
                                .putLong(startTime)
                                .hash().toString();
```

### UnstableApiUsage
'putLong(long)' is declared in unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/storage/EBPFProfilingTaskRecord.java`
#### Snippet
```java
                                .putString(serviceId, Charsets.UTF_8)
                                .putString(processLabelsJson, Charsets.UTF_8)
                                .putLong(startTime)
                                .hash().toString();
    }
```

### UnstableApiUsage
'hash()' is declared in unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/storage/EBPFProfilingTaskRecord.java`
#### Snippet
```java
                                .putString(processLabelsJson, Charsets.UTF_8)
                                .putLong(startTime)
                                .hash().toString();
    }

```

### UnstableApiUsage
'newHasher()' is unstable because its signature references unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/storage/EBPFProfilingDataRecord.java`
#### Snippet
```java
                UPLOAD_TIME
            },
            Hashing.sha256().newHasher()
                   .putString(scheduleId, Charsets.UTF_8)
                   .putString(stackIdList, Charsets.UTF_8)
```

### UnstableApiUsage
'putString(java.lang.CharSequence, java.nio.charset.Charset)' is declared in unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/storage/EBPFProfilingDataRecord.java`
#### Snippet
```java
            },
            Hashing.sha256().newHasher()
                   .putString(scheduleId, Charsets.UTF_8)
                   .putString(stackIdList, Charsets.UTF_8)
                   .putLong(uploadTime)
```

### UnstableApiUsage
'putString(java.lang.CharSequence, java.nio.charset.Charset)' is declared in unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/storage/EBPFProfilingDataRecord.java`
#### Snippet
```java
            Hashing.sha256().newHasher()
                   .putString(scheduleId, Charsets.UTF_8)
                   .putString(stackIdList, Charsets.UTF_8)
                   .putLong(uploadTime)
                   .hash().toString()
```

### UnstableApiUsage
'putLong(long)' is declared in unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/storage/EBPFProfilingDataRecord.java`
#### Snippet
```java
                   .putString(scheduleId, Charsets.UTF_8)
                   .putString(stackIdList, Charsets.UTF_8)
                   .putLong(uploadTime)
                   .hash().toString()
        );
```

### UnstableApiUsage
'hash()' is declared in unstable interface 'com.google.common.hash.Hasher' marked with @Beta
in `oap-server/server-core/src/main/java/org/apache/skywalking/oap/server/core/profiling/ebpf/storage/EBPFProfilingDataRecord.java`
#### Snippet
```java
                   .putString(stackIdList, Charsets.UTF_8)
                   .putLong(uploadTime)
                   .hash().toString()
        );
    }
```

### UnstableApiUsage
'getKVClient()' is unstable because its signature references unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `oap-server/server-configuration/configuration-etcd/src/main/java/org/apache/skywalking/oap/server/configuration/etcd/EtcdConfigWatcherRegister.java`
#### Snippet
```java
                   .password(ByteSequence.from(setting.getPassword(), Charset.defaultCharset()));
        }
        client = builder.build().getKVClient();
    }

```

### UnstableApiUsage
'get(io.etcd.jetcd.ByteSequence, io.etcd.jetcd.options.GetOption)' is declared in unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `oap-server/server-configuration/configuration-etcd/src/main/java/org/apache/skywalking/oap/server/configuration/etcd/EtcdConfigWatcherRegister.java`
#### Snippet
```java
                                        .build();
            try {
                GetResponse response = client.get(ByteSequence.from(groupKey, Charset.defaultCharset()), option).get();
                if (0 != response.getCount()) {
                    List<KeyValue> groupItemKeys = response.getKvs();
```

### UnstableApiUsage
'get(io.etcd.jetcd.ByteSequence)' is declared in unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `oap-server/server-configuration/configuration-etcd/src/main/java/org/apache/skywalking/oap/server/configuration/etcd/EtcdConfigWatcherRegister.java`
#### Snippet
```java
        keys.forEach(e -> {
            try {
                GetResponse response = client.get(ByteSequence.from(e, Charset.defaultCharset())).get();

                if (0 == response.getCount()) {
```

### UnstableApiUsage
'io.etcd.jetcd.KV' is marked unstable with @Beta
in `oap-server/server-configuration/configuration-etcd/src/main/java/org/apache/skywalking/oap/server/configuration/etcd/EtcdConfigWatcherRegister.java`
#### Snippet
```java
public class EtcdConfigWatcherRegister extends ConfigWatcherRegister {

    private final KV client;

    public EtcdConfigWatcherRegister(EtcdServerSettings setting) {
```

