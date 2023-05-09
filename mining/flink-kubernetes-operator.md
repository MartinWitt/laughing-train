# flink-kubernetes-operator 
 
# Bad smells
I found 332 bad smells with 5 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ConstantValue | 173 | false |
| FieldMayBeFinal | 25 | false |
| UNCHECKED_WARNING | 23 | false |
| JavadocReference | 22 | false |
| FieldCanBeLocal | 19 | false |
| MarkedForRemoval | 9 | false |
| NullableProblems | 7 | false |
| RegExpRedundantEscape | 6 | false |
| Deprecation | 6 | false |
| JavadocLinkAsPlainText | 6 | false |
| OptionalUsedAsFieldOrParameterType | 6 | false |
| DataFlowIssue | 4 | false |
| RedundantCast | 4 | false |
| NumberEquality | 3 | false |
| RegExpSimplifiable | 2 | false |
| ProtectedMemberInFinalClass | 2 | true |
| StringConcatenationInsideStringBufferAppend | 2 | false |
| UnnecessarySemicolon | 1 | false |
| UnnecessaryReturn | 1 | true |
| TrivialStringConcatenation | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| SuspiciousMethodCalls | 1 | false |
| EqualsBetweenInconvertibleTypes | 1 | false |
| AutoCloseableResource | 1 | false |
| InfiniteLoopStatement | 1 | false |
| JavadocDeclaration | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| UnusedAssignment | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/topology/JobTopology.java`
#### Snippet
```java

    public List<JobVertexID> getVerticesInTopologicalOrder() {
        List<JobVertexID> sorted = new ArrayList<>(inputs.size());

        Map<JobVertexID, List<JobVertexID>> remainingInputs = new HashMap<>(inputs.size());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map\>'
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/topology/JobTopology.java`
#### Snippet
```java
        List<JobVertexID> sorted = new ArrayList<>(inputs.size());

        Map<JobVertexID, List<JobVertexID>> remainingInputs = new HashMap<>(inputs.size());
        inputs.forEach((v, l) -> remainingInputs.put(v, new ArrayList<>(l)));

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/listener/ListenerUtils.java`
#### Snippet
```java
        var conf = new Configuration(configManager.getDefaultConfig());
        List<String> additionalPatterns =
                new ArrayList<>(
                        conf.getOptional(
                                        CoreOptions
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/JobStatusObserver.java`
#### Snippet
```java
            // Query job list from the cluster
            clusterJobStatuses =
                    new ArrayList<>(ctx.getFlinkService().listJobs(ctx.getObserveConfig()));
        } catch (Exception e) {
            // Error while accessing the rest api, will try again later...
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/JobStatusObserver.java`
#### Snippet
```java
            // Query job list from the cluster
            clusterJobStatuses =
                    new ArrayList<>(ctx.getFlinkService().listJobs(ctx.getObserveConfig()));
        } catch (Exception e) {
            // Error while accessing the rest api, will try again later...
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.flink.kubernetes.operator.api.listener.FlinkResourceListener.ResourceEventContext' to 'org.apache.flink.kubernetes.operator.api.listener.FlinkResourceListener.ResourceEventContext'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/EventRecorder.java`
#### Snippet
```java
                            listener -> {
                                if (resource instanceof FlinkDeployment) {
                                    listener.onDeploymentEvent(ctx);
                                } else {
                                    listener.onSessionJobEvent(ctx);
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.flink.kubernetes.operator.api.listener.FlinkResourceListener.ResourceEventContext' to 'org.apache.flink.kubernetes.operator.api.listener.FlinkResourceListener.ResourceEventContext'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/EventRecorder.java`
#### Snippet
```java
                                    listener.onDeploymentEvent(ctx);
                                } else {
                                    listener.onSessionJobEvent(ctx);
                                }
                            });
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.flink.kubernetes.operator.api.listener.FlinkResourceListener.ResourceEventContext' to 'org.apache.flink.kubernetes.operator.api.listener.FlinkResourceListener.ResourceEventContext\>'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/EventRecorder.java`
#### Snippet
```java
                                }
                            });
                    AuditUtils.logContext(ctx);
                };

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/config/FlinkOperatorConfiguration.java`
#### Snippet
```java
            // all namespaces
            watchedNamespaces =
                    new HashSet<>(
                            Arrays.asList(
                                    operatorConfig
```

### UNCHECKED_WARNING
Unchecked call to 'HashSet(Collection)' as a member of raw type 'java.util.HashSet'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/config/FlinkOperatorConfiguration.java`
#### Snippet
```java
            // all namespaces
            watchedNamespaces =
                    new HashSet<>(
                            Arrays.asList(
                                    operatorConfig
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'. Reason: 'eventSourceEntry.getValue()' has raw type, so result of informerHealthIndicators is erased
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/health/InformerHealthSummary.java`
#### Snippet
```java
            for (var eventSourceEntry : controllerEntry.getValue().entrySet()) {
                Map<String, InformerHealthIndicator> informers =
                        eventSourceEntry.getValue().informerHealthIndicators();
                for (var informerEntry : informers.entrySet()) {
                    if (informerEntry.getValue().getStatus() == Status.HEALTHY) {
```

### UNCHECKED_WARNING
Unchecked cast: 'capture' to 'STATUS'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/StatusRecorder.java`
#### Snippet
```java
        if (cachedStatus != null) {
            resource.setStatus(
                    (STATUS)
                            objectMapper.convertValue(
                                    cachedStatus, resource.getStatus().getClass()));
        } else {
            // Initialize cache with current status copy
```

### UNCHECKED_WARNING
Unchecked cast: 'capture\>' to 'STATUS'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/StatusRecorder.java`
#### Snippet
```java
                        ? FlinkDeploymentStatus.class
                        : FlinkSessionJobStatus.class;
        var prevStatus = (STATUS) objectMapper.convertValue(previousStatusNode, statusClass);

        Exception err = null;
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.flink.kubernetes.operator.api.listener.FlinkResourceListener.StatusUpdateContext' to 'org.apache.flink.kubernetes.operator.api.listener.FlinkResourceListener.StatusUpdateContext'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/StatusRecorder.java`
#### Snippet
```java
                            listener -> {
                                if (resource instanceof FlinkDeployment) {
                                    listener.onDeploymentStatusUpdate(ctx);
                                } else {
                                    listener.onSessionJobStatusUpdate(ctx);
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.flink.kubernetes.operator.api.listener.FlinkResourceListener.StatusUpdateContext' to 'org.apache.flink.kubernetes.operator.api.listener.FlinkResourceListener.StatusUpdateContext'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/StatusRecorder.java`
#### Snippet
```java
                                    listener.onDeploymentStatusUpdate(ctx);
                                } else {
                                    listener.onSessionJobStatusUpdate(ctx);
                                }
                            });
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.flink.kubernetes.operator.api.listener.FlinkResourceListener.StatusUpdateContext' to 'org.apache.flink.kubernetes.operator.api.listener.FlinkResourceListener.StatusUpdateContext\>,org.apache.flink.kubernetes.operator.api.status.CommonStatus\>'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/StatusRecorder.java`
#### Snippet
```java
                                }
                            });
                    AuditUtils.logContext(ctx);
                };

```

### UNCHECKED_WARNING
Unchecked cast: 'io.fabric8.kubernetes.api.model.KubernetesResource' to 'T'
in `flink-kubernetes-webhook/src/main/java/org/apache/flink/kubernetes/operator/admission/mutator/DefaultRequestMutator.java`
#### Snippet
```java
        KubernetesResource originalResource =
                AdmissionUtils.getTargetResource(admissionRequest, operation);
        T clonedResource = this.cloner.clone((T) originalResource);

        AdmissionResponse admissionResponse;
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.HashMap'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/FlinkUtils.java`
#### Snippet
```java
                        conf.getOptional(KubernetesConfigOptions.JOB_MANAGER_ANNOTATIONS)
                                .orElse(Collections.emptyMap()));
        labels.put(CR_GENERATION_LABEL, generation.toString());
        conf.set(KubernetesConfigOptions.JOB_MANAGER_ANNOTATIONS, labels);
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.flink.kubernetes.operator.api.AbstractFlinkResource' to 'org.apache.flink.kubernetes.operator.api.AbstractFlinkResource'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/SavepointObserver.java`
#### Snippet
```java
                                + err);
                ReconciliationUtils.updateLastReconciledSavepointTriggerNonce(
                        savepointInfo, (AbstractFlinkResource) resource);
            } else {
                LOG.warn("Savepoint failed within grace period, retrying: " + err);
```

### UNCHECKED_WARNING
Unchecked cast: 'capture' to 'T'
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/utils/SpecUtils.java`
#### Snippet
```java
        }
        try {
            return (T)
                    objectMapper.readValue(
                            objectMapper.writeValueAsString(object), object.getClass());
        } catch (JsonProcessingException e) {
            throw new IllegalStateException(e);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/metrics/ScalingMetrics.java`
#### Snippet
```java
    /** Temporarily exclude vertex from scaling for this run. This does not update the spec. */
    private static void excludeVertexFromScaling(Configuration conf, JobVertexID jobVertexId) {
        Set<String> excludedIds = new HashSet<>(conf.get(AutoScalerOptions.VERTEX_EXCLUDE_IDS));
        excludedIds.add(jobVertexId.toHexString());
        conf.set(AutoScalerOptions.VERTEX_EXCLUDE_IDS, new ArrayList<>(excludedIds));
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.kubernetes.operator.controller.FlinkDeploymentContext' to 'org.apache.flink.kubernetes.operator.controller.FlinkResourceContext'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/service/FlinkResourceContextFactory.java`
#### Snippet
```java
        if (resource instanceof FlinkDeployment) {
            var flinkDep = (FlinkDeployment) resource;
            return (FlinkResourceContext<CR>)
                    new FlinkDeploymentContext(
                            flinkDep,
                            josdkContext,
                            resMg,
                            getOrCreateFlinkService(flinkDep),
                            configManager);
        } else if (resource instanceof FlinkSessionJob) {
            return (FlinkResourceContext<CR>)
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.kubernetes.operator.controller.FlinkSessionJobContext' to 'org.apache.flink.kubernetes.operator.controller.FlinkResourceContext'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/service/FlinkResourceContextFactory.java`
#### Snippet
```java
                            configManager);
        } else if (resource instanceof FlinkSessionJob) {
            return (FlinkResourceContext<CR>)
                    new FlinkSessionJobContext(
                            (FlinkSessionJob) resource, josdkContext, resMg, this, configManager);
        } else {
            throw new IllegalArgumentException(
```

## RuleId[id=MarkedForRemoval]
### MarkedForRemoval
'io.javaoperatorsdk.operator.api.config.RetryConfiguration' is deprecated and marked for removal
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/config/FlinkOperatorConfiguration.java`
#### Snippet
```java
                        KubernetesOperatorMetricOptions.OPERATOR_METRICS_HISTOGRAM_SAMPLE_SIZE);

        RetryConfiguration retryConfiguration = new FlinkOperatorRetryConfiguration(operatorConfig);

        String labelSelector =
```

### MarkedForRemoval
'io.javaoperatorsdk.operator.api.config.RetryConfiguration' is deprecated and marked for removal
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/config/FlinkOperatorConfiguration.java`
#### Snippet
```java

    /** Enables configurable retry mechanism for reconciliation errors. */
    protected static class FlinkOperatorRetryConfiguration implements RetryConfiguration {
        private final int maxAttempts;
        private final long initialInterval;
```

### MarkedForRemoval
'io.javaoperatorsdk.operator.api.config.RetryConfiguration' is deprecated and marked for removal
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/config/FlinkOperatorConfiguration.java`
#### Snippet
```java
    Integer savepointHistoryCountThreshold;
    Duration savepointHistoryAgeThreshold;
    RetryConfiguration retryConfiguration;
    boolean exceptionStackTraceEnabled;
    int exceptionStackTraceLengthThreshold;
```

### MarkedForRemoval
'io.javaoperatorsdk.operator.api.config.RetryConfiguration' is deprecated and marked for removal
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/config/FlinkOperatorConfiguration.java`
#### Snippet
```java
import io.fabric8.kubernetes.api.model.DeletionPropagation;
import io.javaoperatorsdk.operator.api.config.LeaderElectionConfiguration;
import io.javaoperatorsdk.operator.api.config.RetryConfiguration;
import lombok.Value;
import org.apache.commons.lang3.StringUtils;
```

### MarkedForRemoval
Overrides method that is deprecated and marked for removal in 'io.javaoperatorsdk.operator.api.monitoring.Metrics'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/metrics/OperatorJosdkMetrics.java`
#### Snippet
```java

    @Override
    public void failedReconciliation(
            ResourceID resourceID, Exception exception, Map<String, Object> metadata) {
        counter(getResourceMg(resourceID, metadata), RECONCILIATION, "failed").inc();
```

### MarkedForRemoval
Overrides method that is deprecated and marked for removal in 'io.javaoperatorsdk.operator.api.monitoring.Metrics'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/metrics/OperatorJosdkMetrics.java`
#### Snippet
```java

    @Override
    public void reconcileCustomResource(
            ResourceID resourceID, RetryInfo retryInfoNullable, Map<String, Object> metadata) {
        counter(getResourceMg(resourceID, metadata), RECONCILIATION).inc();
```

### MarkedForRemoval
Overrides method that is deprecated and marked for removal in 'io.javaoperatorsdk.operator.api.monitoring.Metrics'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/metrics/OperatorJosdkMetrics.java`
#### Snippet
```java

    @Override
    public void finishedReconciliation(ResourceID resourceID, Map<String, Object> metadata) {
        counter(getResourceMg(resourceID, metadata), RECONCILIATION, "finished").inc();
    }
```

### MarkedForRemoval
'fromConfiguration(io.javaoperatorsdk.operator.api.config.RetryConfiguration)' is deprecated and marked for removal
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/FlinkOperator.java`
#### Snippet
```java
        overrider.settingNamespaces(operatorConf.getWatchedNamespaces());

        overrider.withRetry(GenericRetry.fromConfiguration(operatorConf.getRetryConfiguration()));

        var labelSelector = operatorConf.getLabelSelector();
```

### MarkedForRemoval
'installShutdownHook()' is deprecated and marked for removal
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/FlinkOperator.java`
#### Snippet
```java
        registerDeploymentController();
        registerSessionJobController();
        operator.installShutdownHook();
        operator.start();
        if (operatorHealthService != null) {
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `JobVertexID`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/utils/AutoScalerSerDeModule.java`
#### Snippet
```java
import java.io.IOException;

/** Jackson serializer module for {@link JobVertexID}. */
public class AutoScalerSerDeModule extends SimpleModule {

```

### JavadocReference
Cannot resolve symbol `RequestBody`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/runtime/rest/messages/job/savepoints/SavepointTriggerRequestBody.java`
#### Snippet
```java
import java.util.Optional;

/** {@link RequestBody} to trigger savepoints. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SavepointTriggerRequestBody implements RequestBody {
```

### JavadocReference
Cannot resolve symbol `ConfigOption`
in `flink-kubernetes-docs/src/main/java/org/apache/flink/kubernetes/operator/docs/configuration/OptionsClassLocation.java`
#### Snippet
```java
import org.apache.flink.configuration.ConfigOption;

/** Simple descriptor for the location of a class containing {@link ConfigOption ConfigOptions}. */
class OptionsClassLocation {
    private final String module;
```

### JavadocReference
Cannot resolve symbol `ClusterDescriptor`
in `flink-kubernetes-standalone/src/main/java/org/apache/flink/kubernetes/operator/standalone/KubernetesStandaloneClusterDescriptor.java`
#### Snippet
```java
import static org.apache.flink.util.Preconditions.checkNotNull;

/** Standalone Kubernetes specific {@link ClusterDescriptor} implementation. */
public class KubernetesStandaloneClusterDescriptor extends KubernetesClusterDescriptor {

```

### JavadocReference
Cannot resolve symbol `ConfigOption`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/ConfigOptionUtils.java`
#### Snippet
```java

    /**
     * Gets the value of {@link ConfigOption} with threshold.
     *
     * @param config The effective config
```

### JavadocReference
Cannot resolve symbol `ConfigOption`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/ConfigOptionUtils.java`
#### Snippet
```java
     * @param configThreshold The config threshold.
     * @param <T> Type of the config value.
     * @return The value of {@link ConfigOption} with threshold.
     */
    public static <T extends Comparable<T>> T getValueWithThreshold(
```

### JavadocReference
Cannot resolve symbol `ConfigOption`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/ConfigOptionUtils.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

/** {@link ConfigOption} utilities. */
public class ConfigOptionUtils {

```

### JavadocReference
Cannot resolve symbol `MetricRegistry`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/metrics/OperatorJosdkMetrics.java`
#### Snippet
```java

/**
 * Implementation of {@link Metrics} to monitor and forward JOSDK metrics to {@link MetricRegistry}.
 */
public class OperatorJosdkMetrics implements Metrics {
```

### JavadocReference
Cannot resolve symbol `Histogram`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/metrics/OperatorMetricUtils.java`
#### Snippet
```java
    }

    /** Thread safe {@link Histogram} wrapper. */
    public static class SynchronizedHistogram implements Histogram {

```

### JavadocReference
Cannot resolve symbol `MeterView`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/metrics/OperatorMetricUtils.java`
#### Snippet
```java
    }

    /** Thread safe {@link MeterView} wrapper. */
    public static class SynchronizedMeterView implements Meter, View {

```

### JavadocReference
Cannot resolve symbol `Counter`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/metrics/OperatorMetricUtils.java`
#### Snippet
```java
    }

    /** Thread safe {@link Counter} wrapper. */
    public static class SynchronizedCounter implements Counter {

```

### JavadocReference
Cannot resolve symbol `RequestBody`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/runtime/rest/messages/job/savepoints/stop/StopWithSavepointRequestBody.java`
#### Snippet
```java
import java.util.Optional;

/** {@link RequestBody} for stopping a job with a savepoint. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopWithSavepointRequestBody implements RequestBody {
```

### JavadocReference
Cannot resolve symbol `org.apache.flink.kubernetes.kubeclient.FlinkPod`
in `flink-kubernetes-standalone/src/main/java/org/apache/flink/kubernetes/operator/kubeclient/decorators/InitStandaloneTaskManagerDecorator.java`
#### Snippet
```java

/**
 * An initializer for the TaskManager {@link org.apache.flink.kubernetes.kubeclient.FlinkPod} in
 * standalone mode.
 */
```

### JavadocReference
Cannot resolve symbol `ConfigOption`
in `flink-kubernetes-docs/src/main/java/org/apache/flink/kubernetes/operator/docs/configuration/ConfigOptionsDocGenerator.java`
#### Snippet
```java

    /**
     * Data structure used to assign {@link ConfigOption ConfigOptions} to the {@link ConfigGroup}
     * with the longest matching prefix.
     */
```

### JavadocReference
Cannot resolve symbol `ConfigGroup`
in `flink-kubernetes-docs/src/main/java/org/apache/flink/kubernetes/operator/docs/configuration/ConfigOptionsDocGenerator.java`
#### Snippet
```java

    /**
     * Data structure used to assign {@link ConfigOption ConfigOptions} to the {@link ConfigGroup}
     * with the longest matching prefix.
     */
```

### JavadocReference
Cannot resolve symbol `DescribedEnum`
in `flink-kubernetes-docs/src/main/java/org/apache/flink/kubernetes/operator/docs/configuration/ConfigOptionsDocGenerator.java`
#### Snippet
```java
     * Formats a single enum constant.
     *
     * <p>If the enum implements {@link DescribedEnum}, this includes the given description for each
     * constant. Otherwise, only the constant itself is printed.
     */
```

### JavadocReference
Cannot resolve symbol `Description`
in `flink-kubernetes-docs/src/main/java/org/apache/flink/kubernetes/operator/docs/configuration/ConfigOptionsDocGenerator.java`
#### Snippet
```java

    /**
     * Returns a {@link Description} for the enum constants of the given option in case it is
     * enum-based, and {@code null} otherwise.
     */
```

### JavadocReference
Cannot resolve symbol `ConfigOption`
in `flink-kubernetes-docs/src/main/java/org/apache/flink/kubernetes/operator/docs/configuration/ConfigOptionsDocGenerator.java`
#### Snippet
```java

    /**
     * This method generates html tables from set of classes containing {@link ConfigOption
     * ConfigOptions}.
     *
```

### JavadocReference
Cannot resolve symbol `ConfigGroups`
in `flink-kubernetes-docs/src/main/java/org/apache/flink/kubernetes/operator/docs/configuration/ConfigOptionsDocGenerator.java`
#### Snippet
```java
     *
     * <p>For each class 1 or more html tables will be generated and placed into a separate file,
     * depending on whether the class is annotated with {@link ConfigGroups}. The tables contain the
     * key, default value and description for every {@link ConfigOption}.
     *
```

### JavadocReference
Cannot resolve symbol `ConfigOption`
in `flink-kubernetes-docs/src/main/java/org/apache/flink/kubernetes/operator/docs/configuration/ConfigOptionsDocGenerator.java`
#### Snippet
```java
     * <p>For each class 1 or more html tables will be generated and placed into a separate file,
     * depending on whether the class is annotated with {@link ConfigGroups}. The tables contain the
     * key, default value and description for every {@link ConfigOption}.
     *
     * <p>One additional table is generated containing all {@link ConfigOption ConfigOptions} that
```

### JavadocReference
Cannot resolve symbol `ConfigOption`
in `flink-kubernetes-docs/src/main/java/org/apache/flink/kubernetes/operator/docs/configuration/ConfigOptionsDocGenerator.java`
#### Snippet
```java
     * key, default value and description for every {@link ConfigOption}.
     *
     * <p>One additional table is generated containing all {@link ConfigOption ConfigOptions} that
     * are annotated with {@link Documentation.Section}.
     *
```

### JavadocReference
Cannot resolve symbol `Documentation.Section`
in `flink-kubernetes-docs/src/main/java/org/apache/flink/kubernetes/operator/docs/configuration/ConfigOptionsDocGenerator.java`
#### Snippet
```java
     *
     * <p>One additional table is generated containing all {@link ConfigOption ConfigOptions} that
     * are annotated with {@link Documentation.Section}.
     *
     * @param args [0] output directory for the generated files [1] project root directory
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `status` might be null
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/deployment/AbstractFlinkDeploymentObserver.java`
#### Snippet
```java

            try {
                checkFailedCreate(status);
                // checking the pod is expensive; only do it when the deployment isn't ready
                checkContainerBackoff(ctx);
```

### DataFlowIssue
Condition `throwable instanceof RestClientException` is redundant and can be replaced with a null check
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/FlinkResourceExceptionUtils.java`
#### Snippet
```java
            FlinkResourceException flinkResourceException,
            int lengthThreshold) {
        if (throwable instanceof RestClientException) {
            flinkResourceException.setAdditionalMetadata(
                    Map.of(
```

### DataFlowIssue
Condition `throwable instanceof DeploymentFailedException` is redundant and can be replaced with a null check
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/FlinkResourceExceptionUtils.java`
#### Snippet
```java
        }

        if (throwable instanceof DeploymentFailedException) {
            getSubstringWithMaxLength(
                            ((DeploymentFailedException) throwable).getReason(), lengthThreshold)
```

### DataFlowIssue
Condition `cause instanceof FlinkJobNotFoundException` is redundant and can be replaced with a null check
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/sessionjob/SessionJobReconciler.java`
#### Snippet
```java
                    final var cause = e.getCause();

                    if (cause instanceof FlinkJobNotFoundException) {
                        LOG.error("Job {} not found in the Flink cluster.", jobID, e);
                        return DeleteControl.defaultDelete();
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/status/JobManagerDeploymentStatus.java`
#### Snippet
```java

    /** Deployment in terminal error, requires spec change for reconciliation to continue. */
    ERROR;
}

```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `examples/flink-sql-runner-example/src/main/java/org/apache/flink/examples/SqlRunner.java`
#### Snippet
```java
    private static final String LINE_DELIMITER = "\n";

    private static final String COMMENT_PATTERN = "(--.*)|(((\\/\\*)+?[\\w\\W]+?(\\*\\/)+))";

    public static void main(String[] args) throws Exception {
```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `examples/flink-sql-runner-example/src/main/java/org/apache/flink/examples/SqlRunner.java`
#### Snippet
```java
    private static final String LINE_DELIMITER = "\n";

    private static final String COMMENT_PATTERN = "(--.*)|(((\\/\\*)+?[\\w\\W]+?(\\*\\/)+))";

    public static void main(String[] args) throws Exception {
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/IngressUtils.java`
#### Snippet
```java
            Pattern.compile("\\{\\{name\\}\\}", Pattern.CASE_INSENSITIVE);
    private static final Pattern NAMESPACE_PTN =
            Pattern.compile("\\{\\{namespace\\}\\}", Pattern.CASE_INSENSITIVE);
    private static final Pattern URL_PROTOCOL_REGEX =
            Pattern.compile("^https?://", Pattern.CASE_INSENSITIVE);
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/IngressUtils.java`
#### Snippet
```java
            Pattern.compile("\\{\\{name\\}\\}", Pattern.CASE_INSENSITIVE);
    private static final Pattern NAMESPACE_PTN =
            Pattern.compile("\\{\\{namespace\\}\\}", Pattern.CASE_INSENSITIVE);
    private static final Pattern URL_PROTOCOL_REGEX =
            Pattern.compile("^https?://", Pattern.CASE_INSENSITIVE);
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/IngressUtils.java`
#### Snippet
```java

    private static final Pattern NAME_PTN =
            Pattern.compile("\\{\\{name\\}\\}", Pattern.CASE_INSENSITIVE);
    private static final Pattern NAMESPACE_PTN =
            Pattern.compile("\\{\\{namespace\\}\\}", Pattern.CASE_INSENSITIVE);
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/IngressUtils.java`
#### Snippet
```java

    private static final Pattern NAME_PTN =
            Pattern.compile("\\{\\{name\\}\\}", Pattern.CASE_INSENSITIVE);
    private static final Pattern NAMESPACE_PTN =
            Pattern.compile("\\{\\{namespace\\}\\}", Pattern.CASE_INSENSITIVE);
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[\\S&&[^.]]` can be simplified to '\\S\&\&\[\^.\]'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/listener/ListenerUtils.java`
#### Snippet
```java
    private static final String SUFFIX = ".class";
    private static final Pattern PTN =
            Pattern.compile(Pattern.quote(PREFIX) + "([\\S&&[^.]]*)" + Pattern.quote(SUFFIX));
    private static final List<String> EXTRA_PARENT_FIRST_PATTERNS =
            List.of("io.fabric8", "com.fasterxml");
```

### RegExpSimplifiable
`[\\t]` can be simplified to '\\t'
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/docs/CrdReferenceDoclet.java`
#### Snippet
```java

    private String cleanDoc(String doc) {
        return doc.replaceAll("[\\t]+", " ").replaceAll("[\\n\\r]+", "");
    }

```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `flink-kubernetes-webhook/src/main/java/org/apache/flink/kubernetes/operator/admission/FlinkOperatorWebhook.java`
#### Snippet
```java

            @Override
            protected void initChannel(SocketChannel ch) {

                if (sslContext != null) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/health/HttpBootstrap.java`
#### Snippet
```java
                new ChannelInitializer<>() {
                    @Override
                    protected void initChannel(SocketChannel ch) {
                        ChannelPipeline pipeline = ch.pipeline();
                        pipeline.addLast(new HttpServerCodec());
```

## RuleId[id=Deprecation]
### Deprecation
'createOrReplace()' is deprecated
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/EventUtils.java`
#### Snippet
```java
            existing.setCount(existing.getCount() + 1);
            existing.setMessage(message);
            eventListener.accept(client.resource(existing).createOrReplace());
            return false;
        } else {
```

### Deprecation
'createOrReplace()' is deprecated
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/EventUtils.java`
#### Snippet
```java
                            .endMetadata()
                            .build();
            eventListener.accept(client.resource(event).createOrReplace());
            return true;
        }
```

### Deprecation
'createOrReplace()' is deprecated
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/FlinkUtils.java`
#### Snippet
```java
        }
        if (shouldUpdate) {
            kubernetesClient.resourceList(configMaps).inNamespace(namespace).createOrReplace();
        }
    }
```

### Deprecation
'replace()' is deprecated
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/health/CanaryResourceManager.java`
#### Snippet
```java

        try {
            kubernetesClient.resource(ReconciliationUtils.clone(crs.resource)).replace();
        } catch (Throwable t) {
            LOG.warn("Could not bump canary deployment, it may have been deleted", t);
```

### Deprecation
'createOrReplace()' is deprecated
in `examples/kubernetes-client-examples/src/main/java/org/apache/flink/examples/Basic.java`
#### Snippet
```java

        try (KubernetesClient kubernetesClient = new KubernetesClientBuilder().build()) {
            kubernetesClient.resource(flinkDeployment).createOrReplace();
        }
    }
```

### Deprecation
'createOrReplace()' is deprecated
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/IngressUtils.java`
#### Snippet
```java

            LOG.info("Updating ingress rules {}", ingress);
            client.resourceList(ingress).inNamespace(objectMeta.getNamespace()).createOrReplace();
        }
    }
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/sessionjob/FlinkSessionJobObserver.java`
#### Snippet
```java

        if (matchedJobs.isEmpty()) {
            return;
        } else if (matchedJobs.size() > 1) {
            // this indicates a bug, which means we have more than one running job for a single
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `flink-kubernetes-docs/src/main/java/org/apache/flink/kubernetes/operator/docs/configuration/ConfigOptionsDocGenerator.java`
#### Snippet
```java
     */
    private static String toHtmlString(final OptionWithMetaInfo optionWithMetaInfo) {
        return ""
                + "        <tr>\n"
                + "            <td><h5>"
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `Option` may be 'static'
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/docs/CrdReferenceDoclet.java`
#### Snippet
```java
    }

    private abstract class Option implements Doclet.Option {
        private final String name;
        private final boolean hasArg;
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
'Map\>' may not contain keys of type ''
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/topology/JobTopology.java`
#### Snippet
```java
                    v -> {
                        remainingInputs.remove(v);
                        outputs.get(v).forEach(o -> remainingInputs.get(o).remove(v));
                    });

```

## RuleId[id=NumberEquality]
### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/runtime/rest/messages/job/metrics/IOMetricsInfo.java`
#### Snippet
```java
                && recordsWritten == that.recordsWritten
                && recordsWrittenComplete == that.recordsWrittenComplete
                && accumulatedBackpressured == that.accumulatedBackpressured
                && accumulatedBusy == that.accumulatedBusy
                && accumulatedIdle == that.accumulatedIdle;
```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/runtime/rest/messages/job/metrics/IOMetricsInfo.java`
#### Snippet
```java
                && recordsWrittenComplete == that.recordsWrittenComplete
                && accumulatedBackpressured == that.accumulatedBackpressured
                && accumulatedBusy == that.accumulatedBusy
                && accumulatedIdle == that.accumulatedIdle;
    }
```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/runtime/rest/messages/job/metrics/IOMetricsInfo.java`
#### Snippet
```java
                && accumulatedBackpressured == that.accumulatedBackpressured
                && accumulatedBusy == that.accumulatedBusy
                && accumulatedIdle == that.accumulatedIdle;
    }

```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/runtime/rest/messages/job/savepoints/SavepointTriggerRequestBody.java`
#### Snippet
```java

    @JsonProperty(FIELD_NAME_TRIGGER_ID)
    @Nullable
    private final TriggerId triggerId;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/runtime/rest/messages/job/savepoints/SavepointTriggerRequestBody.java`
#### Snippet
```java

    @JsonProperty(FIELD_NAME_FORMAT_TYPE)
    @Nullable
    private final SavepointFormatType formatType;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/runtime/rest/messages/job/savepoints/SavepointTriggerRequestBody.java`
#### Snippet
```java

    @JsonProperty(FIELD_NAME_TARGET_DIRECTORY)
    @Nullable
    private final String targetDirectory;

```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/metrics/KubernetesClientMetrics.java`
#### Snippet
```java

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        updateRequestMetrics(request);
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/runtime/rest/messages/job/savepoints/stop/StopWithSavepointRequestBody.java`
#### Snippet
```java

    @JsonProperty(FIELD_NAME_TARGET_DIRECTORY)
    @Nullable
    private final String targetDirectory;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/runtime/rest/messages/job/savepoints/stop/StopWithSavepointRequestBody.java`
#### Snippet
```java

    @JsonProperty(FIELD_NAME_TRIGGER_ID)
    @Nullable
    private final TriggerId triggerId;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/runtime/rest/messages/job/savepoints/stop/StopWithSavepointRequestBody.java`
#### Snippet
```java

    @JsonProperty(FIELD_NAME_FORMAT_TYPE)
    @Nullable
    private final SavepointFormatType formatType;

```

## RuleId[id=EqualsBetweenInconvertibleTypes]
### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class' and 'Class'
in `flink-kubernetes-docs/src/main/java/org/apache/flink/kubernetes/operator/docs/configuration/ConfigOptionsDocGenerator.java`
#### Snippet
```java

    private static boolean isConfigOption(Field field) {
        return field.getType().equals(ConfigOption.class);
    }

```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/diff/DiffResult.java`
#### Snippet
```java
 *
 * <p>Inspired by:
 * https://github.com/apache/commons-lang/blob/master/src/main/java/org/apache/commons/lang3/builder/DiffResult.java
 */
@Experimental
```

### JavadocLinkAsPlainText
Link specified as plain text
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/diff/DiffBuilder.java`
#### Snippet
```java
 *
 * <p>Inspired by:
 * https://github.com/apache/commons-lang/blob/master/src/main/java/org/apache/commons/lang3/builder/DiffBuilder.java
 */
@Experimental
```

### JavadocLinkAsPlainText
Link specified as plain text
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/diff/Diff.java`
#### Snippet
```java
 *
 * <p>Inspired by:
 * https://github.com/apache/commons-lang/blob/master/src/main/java/org/apache/commons/lang3/builder/Diff.java
 */
@Experimental
```

### JavadocLinkAsPlainText
Link specified as plain text
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/diff/Diffable.java`
#### Snippet
```java
 *
 * <p>Inspired by:
 * https://github.com/apache/commons-lang/blob/master/src/main/java/org/apache/commons/lang3/builder/Diffable.java
 */
@Experimental
```

### JavadocLinkAsPlainText
Link specified as plain text
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/EventUtils.java`
#### Snippet
```java
/**
 * The util to generate an event for the target resource. It is copied from
 * https://github.com/EnMasseProject/enmasse/blob/master/k8s-api/src/main/java/io/enmasse/k8s/api/KubeEventLogger.java
 */
public class EventUtils {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/diff/ReflectiveDiffBuilder.java`
#### Snippet
```java
 *
 * <p>Inspired by:
 * https://github.com/apache/commons-lang/blob/master/src/main/java/org/apache/commons/lang3/builder/ReflectionDiffBuilder.java
 */
@Experimental
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/controller/FlinkDeploymentContext.java`
#### Snippet
```java

    private final FlinkConfigManager configManager;
    @Getter private final FlinkService flinkService;

    public FlinkDeploymentContext(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/ScalingSummary.java`
#### Snippet
```java
    private int newParallelism;

    private Map<ScalingMetric, EvaluatedScalingMetric> metrics;

    public ScalingSummary(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/metrics/EvaluatedScalingMetric.java`
#### Snippet
```java
@NoArgsConstructor
public class EvaluatedScalingMetric {
    private double current;

    private double average;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/metrics/EvaluatedScalingMetric.java`
#### Snippet
```java
    private double current;

    private double average;

    public EvaluatedScalingMetric(double current, double average) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/diff/DiffResult.java`
#### Snippet
```java
    @NonNull private final T before;
    @NonNull private final T after;
    @NonNull private final DiffType type;

    private static final ObjectMapper objectMapper = new ObjectMapper();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/diff/DiffResult.java`
#### Snippet
```java
    @NonNull private final List<Diff<?>> diffList;
    @NonNull private final T before;
    @NonNull private final T after;
    @NonNull private final DiffType type;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/lifecycle/ResourceLifecycleState.java`
#### Snippet
```java

    @JsonIgnore private final boolean terminal;
    @JsonIgnore @Getter private final String description;

    ResourceLifecycleState(boolean terminal, String description) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/topology/JobTopology.java`
#### Snippet
```java
    @Getter private final ImmutableMap<JobVertexID, Set<JobVertexID>> inputs;
    @Getter private final ImmutableMap<JobVertexID, Set<JobVertexID>> outputs;
    @Getter private final ImmutableMap<JobVertexID, Integer> parallelisms;
    private final ImmutableMap<JobVertexID, Integer> originalMaxParallelism;
    @Getter private final Map<JobVertexID, Integer> maxParallelisms;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/health/ClusterHealthInfo.java`
#### Snippet
```java

    /** Calculated field whether the cluster is healthy or not. */
    private boolean healthy;

    public ClusterHealthInfo() {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/metrics/KubernetesClientMetrics.java`
#### Snippet
```java
    private final MetricGroup responseMetricGroup;

    private final Counter requestCounter;
    private final Counter failedRequestCounter;
    private final Counter responseCounter;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/metrics/KubernetesClientMetrics.java`
#### Snippet
```java
    private final Counter requestCounter;
    private final Counter failedRequestCounter;
    private final Counter responseCounter;

    private final SynchronizedMeterView requestRateMeter;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/metrics/KubernetesClientMetrics.java`
#### Snippet
```java

    private final MetricGroup requestMetricGroup;
    private final MetricGroup failedRequestMetricGroup;
    private final MetricGroup responseMetricGroup;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/metrics/KubernetesClientMetrics.java`
#### Snippet
```java

    private final Counter requestCounter;
    private final Counter failedRequestCounter;
    private final Counter responseCounter;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/status/SavepointInfo.java`
#### Snippet
```java

    /** Trigger timestamp of last periodic savepoint operation. */
    private long lastPeriodicSavepointTimestamp = 0L;

    public void setTrigger(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/status/Savepoint.java`
#### Snippet
```java

    /** Savepoint format. */
    private SavepointFormatType formatType = SavepointFormatType.UNKNOWN;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/status/Savepoint.java`
#### Snippet
```java

    /** External pointer of the savepoint can be used to recover jobs. */
    private String location;

    /** Savepoint trigger mechanism. */
```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/status/Savepoint.java`
#### Snippet
```java
     * SavepointTriggerType#MANUAL}, null for other types of savepoints.
     */
    private Long triggerNonce;

    public Savepoint(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/status/Savepoint.java`
#### Snippet
```java
public class Savepoint {
    /** Millisecond timestamp at the start of the savepoint operation. */
    private long timeStamp;

    /** External pointer of the savepoint can be used to recover jobs. */
```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/status/Savepoint.java`
#### Snippet
```java

    /** Savepoint trigger mechanism. */
    private SavepointTriggerType triggerType = SavepointTriggerType.UNKNOWN;

    /** Savepoint format. */
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'upgradeMode'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/AbstractJobReconciler.java`
#### Snippet
```java
    @Value
    public static class AvailableUpgradeMode {
        Optional<UpgradeMode> upgradeMode;
        boolean allowFallback;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'savepoint'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/AbstractFlinkResourceReconciler.java`
#### Snippet
```java
            SPEC spec,
            Configuration deployConfig,
            Optional<String> savepoint,
            boolean requireHaMetadata)
            throws Exception;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'retryInfo'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/ReconciliationUtils.java`
#### Snippet
```java
            ErrorStatusUpdateControl<R> toErrorStatusUpdateControl(
                    R resource,
                    Optional<RetryInfo> retryInfo,
                    Exception e,
                    StatusRecorder<R, STATUS> statusRecorder,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'confOverrideDir'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/config/FlinkConfigManager.java`
#### Snippet
```java

    @VisibleForTesting
    protected static Configuration loadGlobalConfiguration(Optional<String> confOverrideDir) {
        if (confOverrideDir.isPresent()) {
            Configuration configOverrides =
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'session'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/validation/FlinkResourceValidator.java`
#### Snippet
```java
     */
    Optional<String> validateSessionJob(
            FlinkSessionJob sessionJob, Optional<FlinkDeployment> session);
}

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'flinkDeploymentOpt'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/sessionjob/SessionJobReconciler.java`
#### Snippet
```java
    }

    public static boolean sessionClusterReady(Optional<FlinkDeployment> flinkDeploymentOpt) {
        if (flinkDeploymentOpt.isPresent()) {
            var flinkdep = flinkDeploymentOpt.get();
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'SharedIndexInformer' used without 'try'-with-resources statement
in `flink-kubernetes-webhook/src/main/java/org/apache/flink/kubernetes/operator/admission/informer/InformerManager.java`
#### Snippet
```java
                    for (Map.Entry<String, SharedIndexInformer<FlinkDeployment>> runnableInformer :
                            runnableInformers.entrySet()) {
                        runnableInformer.getValue().run();
                    }
                    this.flinkDepInformers = runnableInformers;
```

## RuleId[id=InfiniteLoopStatement]
### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/fs/FileSystemWatchService.java`
#### Snippet
```java
            onWatchStarted(realDirectoryPath);

            while (true) {
                LOG.debug("Taking watch key");
                WatchKey watchKey = watcher.take();
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `leftField` to `Map` is redundant
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/diff/ReflectiveDiffBuilder.java`
#### Snippet
```java
                                        field,
                                        (leftField != null)
                                                ? (Map<String, String>) leftField
                                                : new HashMap<>(),
                                        (rightField != null)
```

### RedundantCast
Casting `rightField` to `Map` is redundant
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/diff/ReflectiveDiffBuilder.java`
#### Snippet
```java
                                                : new HashMap<>(),
                                        (rightField != null)
                                                ? (Map<String, String>) rightField
                                                : new HashMap<>()));
                    } else if (field.isAnnotationPresent(SpecDiff.class)) {
```

### RedundantCast
Casting `leftField` to `T` is redundant
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/diff/ReflectiveDiffBuilder.java`
#### Snippet
```java
                        diffBuilder.append(
                                field.getName(),
                                new ReflectiveDiffBuilder<T>((T) leftField, (T) rightField)
                                        .build());

```

### RedundantCast
Casting `rightField` to `T` is redundant
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/diff/ReflectiveDiffBuilder.java`
#### Snippet
```java
                        diffBuilder.append(
                                field.getName(),
                                new ReflectiveDiffBuilder<T>((T) leftField, (T) rightField)
                                        .build());

```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/AbstractFlinkResourceReconciler.java`
#### Snippet
```java
     * @param diffType Spec change type.
     * @return True if the scaling is successful
     * @throws Exception
     */
    private boolean scaleCluster(
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `metrics` may be 'final'
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/ScalingSummary.java`
#### Snippet
```java
    private int newParallelism;

    private Map<ScalingMetric, EvaluatedScalingMetric> metrics;

    public ScalingSummary(
```

### FieldMayBeFinal
Field `newParallelism` may be 'final'
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/ScalingSummary.java`
#### Snippet
```java
    private int currentParallelism;

    private int newParallelism;

    private Map<ScalingMetric, EvaluatedScalingMetric> metrics;
```

### FieldMayBeFinal
Field `currentParallelism` may be 'final'
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/ScalingSummary.java`
#### Snippet
```java
public class ScalingSummary {

    private int currentParallelism;

    private int newParallelism;
```

### FieldMayBeFinal
Field `eventRecorder` may be 'final'
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/JobVertexScaler.java`
#### Snippet
```java
    private Clock clock = Clock.system(ZoneId.systemDefault());

    private EventRecorder eventRecorder;

    public JobVertexScaler(EventRecorder eventRecorder) {
```

### FieldMayBeFinal
Field `current` may be 'final'
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/metrics/EvaluatedScalingMetric.java`
#### Snippet
```java
@NoArgsConstructor
public class EvaluatedScalingMetric {
    private double current;

    private double average;
```

### FieldMayBeFinal
Field `average` may be 'final'
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/metrics/EvaluatedScalingMetric.java`
#### Snippet
```java
    private double current;

    private double average;

    public EvaluatedScalingMetric(double current, double average) {
```

### FieldMayBeFinal
Field `reconciliationStatus` may be 'final'
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/status/FlinkSessionJobStatus.java`
#### Snippet
```java

    /** Status of the last reconcile operation. */
    private FlinkSessionJobReconciliationStatus reconciliationStatus =
            new FlinkSessionJobReconciliationStatus();
}
```

### FieldMayBeFinal
Field `jobStatus` may be 'final'
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/status/CommonStatus.java`
#### Snippet
```java

    /** Last observed status of the Flink job on Application/Session cluster. */
    private JobStatus jobStatus = new JobStatus();

    /** Error information about the FlinkDeployment/FlinkSessionJob. */
```

### FieldMayBeFinal
Field `healthy` may be 'final'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/health/ClusterHealthInfo.java`
#### Snippet
```java

    /** Calculated field whether the cluster is healthy or not. */
    private boolean healthy;

    public ClusterHealthInfo() {
```

### FieldMayBeFinal
Field `timeStamp` may be 'final'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/health/ClusterHealthInfo.java`
#### Snippet
```java
public class ClusterHealthInfo {
    /** Millisecond timestamp of the last observed health information. */
    private long timeStamp;

    /** Number of restarts. */
```

### FieldMayBeFinal
Field `replicas` may be 'final'
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/spec/JobManagerSpec.java`
#### Snippet
```java

    /** Number of JobManager replicas. Must be 1 for non-HA deployments. */
    private int replicas = 1;

    /** JobManager pod template. It will be merged with FlinkDeploymentSpec.podTemplate. */
```

### FieldMayBeFinal
Field `replicas` may be 'final'
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/status/TaskManagerInfo.java`
#### Snippet
```java

    /** Number of TaskManager replicas if defined in the spec. */
    @StatusReplicas private int replicas = 0;
}

```

### FieldMayBeFinal
Field `args` may be 'final'
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/spec/JobSpec.java`
#### Snippet
```java

    /** Arguments for the Flink job main class. */
    private String[] args = new String[0];

    /** Desired state for the job. */
```

### FieldMayBeFinal
Field `upgradeMode` may be 'final'
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/spec/JobSpec.java`
#### Snippet
```java
    /** Upgrade mode of the Flink job. */
    @SpecDiff(DiffType.IGNORE)
    private UpgradeMode upgradeMode = UpgradeMode.STATELESS;

    /** Allow checkpoint state that cannot be mapped to any job vertex in tasks. */
```

### FieldMayBeFinal
Field `state` may be 'final'
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/spec/JobSpec.java`
#### Snippet
```java

    /** Desired state for the job. */
    private JobState state = JobState.RUNNING;

    /**
```

### FieldMayBeFinal
Field `savepointInfo` may be 'final'
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/status/JobStatus.java`
#### Snippet
```java

    /** Information about pending and last savepoint for the job. */
    private SavepointInfo savepointInfo = new SavepointInfo();
}

```

### FieldMayBeFinal
Field `state` may be 'final'
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/status/ReconciliationStatus.java`
#### Snippet
```java

    /** Deployment state of the last reconciled spec. */
    private ReconciliationState state = ReconciliationState.UPGRADING;

    @JsonIgnore
```

### FieldMayBeFinal
Field `clusterInfo` may be 'final'
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/status/FlinkDeploymentStatus.java`
#### Snippet
```java

    /** Information from running clusters. */
    private Map<String, String> clusterInfo = new HashMap<>();

    /** Last observed status of the JobManager deployment. */
```

### FieldMayBeFinal
Field `jobManagerDeploymentStatus` may be 'final'
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/status/FlinkDeploymentStatus.java`
#### Snippet
```java

    /** Last observed status of the JobManager deployment. */
    private JobManagerDeploymentStatus jobManagerDeploymentStatus =
            JobManagerDeploymentStatus.MISSING;

```

### FieldMayBeFinal
Field `reconciliationStatus` may be 'final'
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/status/FlinkDeploymentStatus.java`
#### Snippet
```java

    /** Status of the last reconcile operation. */
    private FlinkDeploymentReconciliationStatus reconciliationStatus =
            new FlinkDeploymentReconciliationStatus();

```

### FieldMayBeFinal
Field `metricGroupFunction` may be 'final'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/metrics/lifecycle/LifecycleMetrics.java`
#### Snippet
```java
    private Map<ResourceLifecycleState, Tuple2<Histogram, Map<String, Histogram>>> stateTimeMetrics;

    private Function<MetricGroup, MetricGroup> metricGroupFunction = mg -> mg.addGroup("Lifecycle");

    public LifecycleMetrics(
```

### FieldMayBeFinal
Field `savepointHistory` may be 'final'
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/status/SavepointInfo.java`
#### Snippet
```java

    /** List of recent savepoints. */
    private List<Savepoint> savepointHistory = new ArrayList<>();

    /** Trigger timestamp of last periodic savepoint operation. */
```

### FieldMayBeFinal
Field `location` may be 'final'
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/status/Savepoint.java`
#### Snippet
```java

    /** External pointer of the savepoint can be used to recover jobs. */
    private String location;

    /** Savepoint trigger mechanism. */
```

### FieldMayBeFinal
Field `triggerNonce` may be 'final'
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/status/Savepoint.java`
#### Snippet
```java
     * SavepointTriggerType#MANUAL}, null for other types of savepoints.
     */
    private Long triggerNonce;

    public Savepoint(
```

### FieldMayBeFinal
Field `timeStamp` may be 'final'
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/status/Savepoint.java`
#### Snippet
```java
public class Savepoint {
    /** Millisecond timestamp at the start of the savepoint operation. */
    private long timeStamp;

    /** External pointer of the savepoint can be used to recover jobs. */
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `savepointHistory` are updated, but never queried
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/status/SavepointInfo.java`
#### Snippet
```java

    /** List of recent savepoints. */
    private List<Savepoint> savepointHistory = new ArrayList<>();

    /** Trigger timestamp of last periodic savepoint operation. */
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `diffType` is redundant
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/diff/ReflectiveDiffBuilder.java`
#### Snippet
```java

    private static DiffType getType(SpecDiff.Config annotation, String key) {
        DiffType diffType = UPGRADE;
        for (var entry : annotation.value()) {
            if (key.startsWith(entry.prefix())) {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `watchedNamespaces` initializer `null` is redundant
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/config/FlinkOperatorConfiguration.java`
#### Snippet
```java
            flinkServiceHostOverride = "localhost";
        }
        Set<String> watchedNamespaces = null;
        if (EnvUtils.get(ENV_WATCH_NAMESPACES).isEmpty()) {
            // if the env var is not set use the config file, the default if neither set is
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/metrics/OperatorJosdkMetrics.java`
#### Snippet
```java
        var key = new ArrayList<String>(parent.getScopeComponents().length + names.length);
        Arrays.stream(parent.getScopeComponents()).forEach(key::add);
        Arrays.stream(names).forEach(key::add);

        return counters.computeIfAbsent(
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `jobId` is always 'null'
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/ScalingMetricCollector.java`
#### Snippet
```java
                            ResourceID.fromResource(cr),
                            r -> {
                                var t = queryJobTopology(restClient, jobId);
                                scalerInfo.updateVertexList(
                                        t.getVerticesInTopologicalOrder(), clock.instant(), conf);
```

### ConstantValue
Value `jobId` is always 'null'
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/ScalingMetricCollector.java`
#### Snippet
```java
                                return t;
                            });
            updateKafkaSourceMaxParallelisms(restClient, jobId, topology);
            return topology;
        }
```

### ConstantValue
Value `jobId` is always 'null'
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/ScalingMetricCollector.java`
#### Snippet
```java
                                            v ->
                                                    getFilteredVertexMetricNames(
                                                            restClient, jobId, v, topology)));
            availableVertexMetricNames.put(
                    ResourceID.fromResource(cr), Tuple2.of(deployedGeneration, names));
```

### ConstantValue
Condition `lastCollectedMetrics == null` is always `true`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/ScalingMetricCollector.java`
#### Snippet
```java
                metricHistory.get(lastCollectionTime).getVertexMetrics().get(jobVertexID);

        if (lastCollectedMetrics == null) {
            return Double.NaN;
        }
```

### ConstantValue
Value `inputs` is always 'null'
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/ScalingMetricEvaluator.java`
#### Snippet
```java
            double sumAvgTargetRate = 0;
            double sumCatchUpDataRate = 0;
            for (var inputVertex : inputs) {
                var inputEvaluatedMetrics = alreadyEvaluated.get(inputVertex);
                var inputTargetRate = inputEvaluatedMetrics.get(TARGET_DATA_RATE);
```

### ConstantValue
Value `inputVertex` is always 'null'
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/ScalingMetricEvaluator.java`
#### Snippet
```java
            double sumCatchUpDataRate = 0;
            for (var inputVertex : inputs) {
                var inputEvaluatedMetrics = alreadyEvaluated.get(inputVertex);
                var inputTargetRate = inputEvaluatedMetrics.get(TARGET_DATA_RATE);
                var outputRateMultiplier =
```

### ConstantValue
Value `inputVertex` is always 'null'
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/ScalingMetricEvaluator.java`
#### Snippet
```java
                var inputTargetRate = inputEvaluatedMetrics.get(TARGET_DATA_RATE);
                var outputRateMultiplier =
                        getAverageOutputRatio(new Edge(inputVertex, vertex), metricsHistory);
                sumCurrentTargetRate += inputTargetRate.getCurrent() * outputRateMultiplier;
                sumAvgTargetRate += inputTargetRate.getAverage() * outputRateMultiplier;
```

### ConstantValue
Value `latestVertexMetrics` is always 'null'
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/ScalingMetricEvaluator.java`
#### Snippet
```java
                scalingOutput,
                metricsHistory,
                latestVertexMetrics,
                evaluatedMetrics);

```

### ConstantValue
Value `topology` is always 'null'
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/ScalingMetricEvaluator.java`
#### Snippet
```java
        var topology = collectedMetrics.getJobTopology();

        boolean processingBacklog = isProcessingBacklog(topology, metricsHistory, conf);

        for (var vertex : topology.getVerticesInTopologicalOrder()) {
```

### ConstantValue
Value `metricsHistory` is always 'null'
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/ScalingMetricEvaluator.java`
#### Snippet
```java
        var topology = collectedMetrics.getJobTopology();

        boolean processingBacklog = isProcessingBacklog(topology, metricsHistory, conf);

        for (var vertex : topology.getVerticesInTopologicalOrder()) {
```

### ConstantValue
Value `vertex` is always 'null'
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/ScalingMetricEvaluator.java`
#### Snippet
```java
        for (var vertex : topology.getVerticesInTopologicalOrder()) {
            scalingOutput.put(
                    vertex,
                    evaluateMetrics(
                            conf,
```

### ConstantValue
Value `vertex` is always 'null'
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/ScalingMetricEvaluator.java`
#### Snippet
```java
                            metricsHistory,
                            topology,
                            vertex,
                            processingBacklog));
        }
```

### ConstantValue
Value `currentProcRate` is always 'null'
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/JobVertexScaler.java`
#### Snippet
```java
        // below the threshold, we mark the scaling ineffective.
        double expectedIncrease = lastExpectedProcRate - lastProcRate;
        double actualIncrease = currentProcRate - lastProcRate;

        boolean withinEffectiveThreshold =
```

### ConstantValue
Value `gracePeriod` is always 'null'
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/JobVertexScaler.java`
#### Snippet
```java

        var gracePeriod = conf.get(SCALE_UP_GRACE_PERIOD);
        if (lastScalingTs.plus(gracePeriod).isAfter(clock.instant())) {
            LOG.info(
                    "Skipping immediate scale down after scale up within grace period for {}",
```

### ConstantValue
Value `scalingEnabled` is always 'null'
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/ScalingExecutor.java`
#### Snippet
```java
        var scalingEnabled = conf.get(SCALING_ENABLED);

        var scalingReport = scalingReport(scalingSummaries, scalingEnabled);
        eventRecorder.triggerEvent(
                resource,
```

### ConstantValue
Value `session` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/controller/FlinkSessionJobContext.java`
#### Snippet
```java
        var session = getJosdkContext().getSecondaryResource(FlinkDeployment.class);

        if (sessionClusterReady(session)) {
            return configManager.getSessionJobConfig(session.get(), (FlinkSessionJobSpec) spec);
        }
```

### ConstantValue
Value `session` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/controller/FlinkSessionJobContext.java`
#### Snippet
```java
        var session = getJosdkContext().getSecondaryResource(FlinkDeployment.class);
        return flinkService =
                sessionClusterReady(session)
                        ? flinkResourceContextFactory
                                .getResourceContext(session.get(), getJosdkContext())
```

### ConstantValue
Value `jobId` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/ClusterHealthObserver.java`
#### Snippet
```java
                            .getMetrics(
                                    ctx.getObserveConfig(),
                                    jobId,
                                    List.of(
                                            FULL_RESTARTS_METRIC_NAME,
```

### ConstantValue
Value `deployment` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/SessionReconciler.java`
#### Snippet
```java
                                    .collect(Collectors.toList()));
            if (eventRecorder.triggerEvent(
                    deployment,
                    EventRecorder.Type.Warning,
                    EventRecorder.Reason.CleanupFailed,
```

### ConstantValue
Value `cr` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/SessionReconciler.java`
#### Snippet
```java
            throws Exception {
        var cr = ctx.getResource();
        setOwnerReference(cr, deployConfig);
        ctx.getFlinkService().submitSessionCluster(deployConfig);
        cr.getStatus().setJobManagerDeploymentStatus(JobManagerDeploymentStatus.DEPLOYING);
```

### ConstantValue
Value `deployment` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/SessionReconciler.java`
#### Snippet
```java

        // We record the target spec into an upgrading state before deploying
        ReconciliationUtils.updateStatusBeforeDeploymentAttempt(deployment, deployConfig, clock);
        statusRecorder.patchAndCacheStatus(deployment);

```

### ConstantValue
Value `deployment` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/SessionReconciler.java`
#### Snippet
```java
        // We record the target spec into an upgrading state before deploying
        ReconciliationUtils.updateStatusBeforeDeploymentAttempt(deployment, deployConfig, clock);
        statusRecorder.patchAndCacheStatus(deployment);

        deploy(ctx, deployment.getSpec(), deployConfig, Optional.empty(), false);
```

### ConstantValue
Value `timestampDiffMs` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/ClusterHealthEvaluator.java`
#### Snippet
```java
                observedClusterHealthInfo.getTimeStamp()
                        - lastValidClusterHealthInfo.getNumCompletedCheckpointsIncreasedTimeStamp();
        LOG.debug("Time difference between health infos: {}", Duration.ofMillis(timestampDiffMs));

        boolean isHealthy = true;
```

### ConstantValue
Value `completedCheckpointsCheckWindowMs` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/ClusterHealthEvaluator.java`
#### Snippet
```java
                    observedClusterHealthInfo.getTimeStamp());
        } else if (lastValidClusterHealthInfo.getNumCompletedCheckpointsIncreasedTimeStamp()
                        + completedCheckpointsCheckWindowMs
                < clock.millis()) {
            LOG.info("Cluster is not able to complete checkpoints");
```

### ConstantValue
Value `timestampDiffMs` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/ClusterHealthEvaluator.java`
#### Snippet
```java
                observedClusterHealthInfo.getTimeStamp()
                        - lastValidClusterHealthInfo.getNumRestartsEvaluationTimeStamp();
        LOG.debug("Time difference between health infos: {}", Duration.ofMillis(timestampDiffMs));

        var restartCheckWindow = configuration.get(OPERATOR_CLUSTER_HEALTH_CHECK_RESTARTS_WINDOW);
```

### ConstantValue
Value `restartCheckWindowMs` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/ClusterHealthEvaluator.java`
#### Snippet
```java
        var restartCheckWindow = configuration.get(OPERATOR_CLUSTER_HEALTH_CHECK_RESTARTS_WINDOW);
        var restartCheckWindowMs = restartCheckWindow.toMillis();
        double countMultiplier = (double) restartCheckWindowMs / (double) timestampDiffMs;
        // If the 2 health info timestamp difference is within the window then no
        // scaling needed
```

### ConstantValue
Value `timestampDiffMs` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/ClusterHealthEvaluator.java`
#### Snippet
```java
        var restartCheckWindow = configuration.get(OPERATOR_CLUSTER_HEALTH_CHECK_RESTARTS_WINDOW);
        var restartCheckWindowMs = restartCheckWindow.toMillis();
        double countMultiplier = (double) restartCheckWindowMs / (double) timestampDiffMs;
        // If the 2 health info timestamp difference is within the window then no
        // scaling needed
```

### ConstantValue
Value `restartThreshold` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/ClusterHealthEvaluator.java`
#### Snippet
```java

        var restartThreshold = configuration.get(OPERATOR_CLUSTER_HEALTH_CHECK_RESTARTS_THRESHOLD);
        boolean isHealthy = numRestarts <= restartThreshold;
        if (!isHealthy) {
            LOG.info("Restart count hit threshold: {}", restartThreshold);
```

### ConstantValue
Condition `!isHealthy` is always `true`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/ClusterHealthEvaluator.java`
#### Snippet
```java
        var restartThreshold = configuration.get(OPERATOR_CLUSTER_HEALTH_CHECK_RESTARTS_THRESHOLD);
        boolean isHealthy = numRestarts <= restartThreshold;
        if (!isHealthy) {
            LOG.info("Restart count hit threshold: {}", restartThreshold);
        }
```

### ConstantValue
Value `restartThreshold` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/ClusterHealthEvaluator.java`
#### Snippet
```java
        boolean isHealthy = numRestarts <= restartThreshold;
        if (!isHealthy) {
            LOG.info("Restart count hit threshold: {}", restartThreshold);
        }

```

### ConstantValue
Value `restartCheckWindowMs` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/ClusterHealthEvaluator.java`
#### Snippet
```java

        if (lastValidClusterHealthInfo.getNumRestartsEvaluationTimeStamp()
                < clock.millis() - restartCheckWindowMs) {
            LOG.debug(
                    "Last valid number of restarts evaluation timestamp is outside of the window");
```

### ConstantValue
Value `isHealthy` is always 'false'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/ClusterHealthEvaluator.java`
#### Snippet
```java
        }

        return isHealthy;
    }

```

### ConstantValue
Value `jobId` is always 'null'
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/RestApiMetricsCollector.java`
#### Snippet
```java
        var pathIt = parameters.getPathParameters().iterator();

        ((JobIDPathParameter) pathIt.next()).resolve(jobId);
        ((JobVertexIdPathParameter) pathIt.next()).resolve(jobVertexID);

```

### ConstantValue
Condition `maxAge == null` is always `true`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/AbstractJobReconciler.java`
#### Snippet
```java

        var maxAge = deployConfig.get(OPERATOR_JOB_UPGRADE_LAST_STATE_CHECKPOINT_MAX_AGE);
        if (maxAge == null) {
            return AvailableUpgradeMode.of(UpgradeMode.LAST_STATE);
        }
```

### ConstantValue
Condition `upgradeMode == UpgradeMode.STATELESS` is always `false`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/AbstractJobReconciler.java`
#### Snippet
```java
        var upgradeMode = resource.getSpec().getJob().getUpgradeMode();

        if (upgradeMode == UpgradeMode.STATELESS) {
            LOG.info("Stateless job, ready for upgrade");
            return AvailableUpgradeMode.of(UpgradeMode.STATELESS);
```

### ConstantValue
Value `upgradeMode` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/AbstractJobReconciler.java`
#### Snippet
```java
        var upgradeMode = resource.getSpec().getJob().getUpgradeMode();

        if (upgradeMode == UpgradeMode.STATELESS) {
            LOG.info("Stateless job, ready for upgrade");
            return AvailableUpgradeMode.of(UpgradeMode.STATELESS);
```

### ConstantValue
Value `status` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/AbstractJobReconciler.java`
#### Snippet
```java

        var flinkService = ctx.getFlinkService();
        if (ReconciliationUtils.isJobInTerminalState(status)
                && !flinkService.isHaMetadataAvailable(ctx.getObserveConfig())) {
            LOG.info(
```

### ConstantValue
Value `upgradeMode` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/AbstractJobReconciler.java`
#### Snippet
```java

        if (ReconciliationUtils.isJobRunning(status)) {
            LOG.info("Job is in running state, ready for upgrade with {}", upgradeMode);
            var changedToLastStateWithoutHa =
                    ReconciliationUtils.isUpgradeModeChangedToLastStateAndHADisabledPreviously(
```

### ConstantValue
Condition `upgradeMode == UpgradeMode.LAST_STATE` is always `false`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/AbstractJobReconciler.java`
#### Snippet
```java
            }

            if (upgradeMode == UpgradeMode.LAST_STATE) {
                return changeLastStateIfCheckpointTooOld(ctx, deployConfig);
            }
```

### ConstantValue
Value `upgradeMode` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/AbstractJobReconciler.java`
#### Snippet
```java
            }

            if (upgradeMode == UpgradeMode.LAST_STATE) {
                return changeLastStateIfCheckpointTooOld(ctx, deployConfig);
            }
```

### ConstantValue
Value `jobStatus` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/AbstractJobReconciler.java`
#### Snippet
```java
        var jobStatus =
                org.apache.flink.api.common.JobStatus.valueOf(status.getJobStatus().getState());
        if (jobStatus == org.apache.flink.api.common.JobStatus.FAILED
                && ctx.getObserveConfig().getBoolean(OPERATOR_JOB_RESTART_FAILED)) {
            LOG.info("Stopping failed Flink job...");
```

### ConstantValue
Value `spec` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/AbstractFlinkResourceReconciler.java`
#### Snippet
```java
        var cr = ctx.getResource();
        var spec = cr.getSpec();
        var deployConfig = ctx.getDeployConfig(spec);
        var status = cr.getStatus();
        var reconciliationStatus = cr.getStatus().getReconciliationStatus();
```

### ConstantValue
Value `spec` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/AbstractFlinkResourceReconciler.java`
#### Snippet
```java
        if (reconciliationStatus.isBeforeFirstDeployment()) {
            LOG.info("Deploying for the first time");
            updateStatusBeforeFirstDeployment(cr, spec, deployConfig, status);
            deploy(
                    ctx,
```

### ConstantValue
Value `status` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/AbstractFlinkResourceReconciler.java`
#### Snippet
```java
        if (reconciliationStatus.isBeforeFirstDeployment()) {
            LOG.info("Deploying for the first time");
            updateStatusBeforeFirstDeployment(cr, spec, deployConfig, status);
            deploy(
                    ctx,
```

### ConstantValue
Value `status` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/AbstractFlinkResourceReconciler.java`
#### Snippet
```java
        if (shouldRollBack(cr, observeConfig, ctx.getFlinkService())) {
            // Rollbacks are executed in two steps, we initiate it first then return
            if (initiateRollBack(status)) {
                return;
            }
```

### ConstantValue
Condition `initialSp != null` is always `false`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/AbstractFlinkResourceReconciler.java`
#### Snippet
```java
            var initialSp = spec.getJob().getInitialSavepointPath();

            if (initialSp != null) {
                status.getJobStatus()
                        .getSavepointInfo()
```

### ConstantValue
Condition `jobSpec != null` is always `false`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/AbstractFlinkResourceReconciler.java`
#### Snippet
```java
                var jobSpec = deployment.getSpec().getJob();
                boolean stateless =
                        jobSpec != null && jobSpec.getUpgradeMode() == UpgradeMode.STATELESS;
                if (stateless || HighAvailabilityMode.isHighAvailabilityModeActivated(conf)) {
                    LOG.debug("HA is enabled, recovering lost jobmanager deployment");
```

### ConstantValue
Condition `jobSpec != null && jobSpec.getUpgradeMode() == UpgradeMode.STATELESS` is always `false`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/AbstractFlinkResourceReconciler.java`
#### Snippet
```java
                var jobSpec = deployment.getSpec().getJob();
                boolean stateless =
                        jobSpec != null && jobSpec.getUpgradeMode() == UpgradeMode.STATELESS;
                if (stateless || HighAvailabilityMode.isHighAvailabilityModeActivated(conf)) {
                    LOG.debug("HA is enabled, recovering lost jobmanager deployment");
```

### ConstantValue
Condition `stateless` is always `false`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/AbstractFlinkResourceReconciler.java`
#### Snippet
```java
                boolean stateless =
                        jobSpec != null && jobSpec.getUpgradeMode() == UpgradeMode.STATELESS;
                if (stateless || HighAvailabilityMode.isHighAvailabilityModeActivated(conf)) {
                    LOG.debug("HA is enabled, recovering lost jobmanager deployment");
                    result = true;
```

### ConstantValue
Condition `deployedJob == null` is always `true`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/AbstractFlinkResourceReconciler.java`
#### Snippet
```java
    private boolean jmMissingForRunningDeployment(FlinkDeployment deployment) {
        var deployedJob = ReconciliationUtils.getDeployedSpec(deployment).getJob();
        return (deployedJob == null || deployedJob.getState() == JobState.RUNNING)
                && (deployment.getStatus().getJobManagerDeploymentStatus()
                        == JobManagerDeploymentStatus.MISSING);
```

### ConstantValue
Condition `deployedJob == null || deployedJob.getState() == JobState.RUNNING` is always `true`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/AbstractFlinkResourceReconciler.java`
#### Snippet
```java
    private boolean jmMissingForRunningDeployment(FlinkDeployment deployment) {
        var deployedJob = ReconciliationUtils.getDeployedSpec(deployment).getJob();
        return (deployedJob == null || deployedJob.getState() == JobState.RUNNING)
                && (deployment.getStatus().getJobManagerDeploymentStatus()
                        == JobManagerDeploymentStatus.MISSING);
```

### ConstantValue
Value `inputStream` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/artifact/FileSystemBasedArtifactFetcher.java`
#### Snippet
```java
        File targetFile = new File(targetDir, fileName);
        try (var inputStream = fileSystem.open(source)) {
            FileUtils.copyToFile(inputStream, targetFile);
        }
        LOG.debug(
```

### ConstantValue
Value `desiredReplicas` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/service/StandaloneFlinkService.java`
#### Snippet
```java
        var desiredReplicas =
                conf.get(StandaloneKubernetesConfigOptionsInternal.KUBERNETES_TASKMANAGER_REPLICAS);
        if (actualReplicas != desiredReplicas) {
            LOG.info(
                    "Scaling TM replicas: actual({}) -> desired({})",
```

### ConstantValue
Value `desiredReplicas` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/service/StandaloneFlinkService.java`
#### Snippet
```java
                    "Scaling TM replicas: actual({}) -> desired({})",
                    actualReplicas,
                    desiredReplicas);
            deployment.scale(desiredReplicas);
        } else {
```

### ConstantValue
Value `desiredReplicas` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/service/StandaloneFlinkService.java`
#### Snippet
```java
                    actualReplicas,
                    desiredReplicas);
            deployment.scale(desiredReplicas);
        } else {
            LOG.info(
```

### ConstantValue
Value `actualReplicas` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/service/StandaloneFlinkService.java`
#### Snippet
```java
            LOG.info(
                    "Not scaling TM replicas: actual({}) == desired({})",
                    actualReplicas,
                    desiredReplicas);
        }
```

### ConstantValue
Value `desiredReplicas` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/service/StandaloneFlinkService.java`
#### Snippet
```java
                    "Not scaling TM replicas: actual({}) == desired({})",
                    actualReplicas,
                    desiredReplicas);
        }
        return true;
```

### ConstantValue
Value `vertexId` is always 'null'
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/topology/JobTopology.java`
#### Snippet
```java
                info -> {
                    var vertexId = info.getId();
                    vertexParallelism.put(vertexId, info.getParallelism());
                    maxParallelisms.put(vertexId, info.getMaxParallelism());

```

### ConstantValue
Value `vertexId` is always 'null'
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/topology/JobTopology.java`
#### Snippet
```java
                    var vertexId = info.getId();
                    vertexParallelism.put(vertexId, info.getParallelism());
                    maxParallelisms.put(vertexId, info.getMaxParallelism());

                    vertexInputs.put(vertexId, info.getInputs());
```

### ConstantValue
Value `vertexId` is always 'null'
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/topology/JobTopology.java`
#### Snippet
```java
                    maxParallelisms.put(vertexId, info.getMaxParallelism());

                    vertexInputs.put(vertexId, info.getInputs());
                    vertexOutputs.computeIfAbsent(vertexId, id -> new HashSet<>());
                    info.getInputs()
```

### ConstantValue
Value `vertexId` is always 'null'
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/topology/JobTopology.java`
#### Snippet
```java

                    vertexInputs.put(vertexId, info.getInputs());
                    vertexOutputs.computeIfAbsent(vertexId, id -> new HashSet<>());
                    info.getInputs()
                            .forEach(
```

### ConstantValue
Value `vertexId` is always 'null'
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/topology/JobTopology.java`
#### Snippet
```java
                                            vertexOutputs
                                                    .computeIfAbsent(inputId, id -> new HashSet<>())
                                                    .add(vertexId));
                });

```

### ConstantValue
Value `vertexId` is always 'null'
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/topology/JobTopology.java`
#### Snippet
```java
            vertexInfo.add(
                    new VertexInfo(
                            vertexId,
                            inputList,
                            node.get("parallelism").asInt(),
```

### ConstantValue
Value `vertexId` is always 'null'
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/topology/JobTopology.java`
#### Snippet
```java
                            inputList,
                            node.get("parallelism").asInt(),
                            maxParallelismMap.get(vertexId)));
            if (node.has("inputs")) {
                for (JsonNode input : node.get("inputs")) {
```

### ConstantValue
Value `previousJobStatus` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/JobStatusObserver.java`
#### Snippet
```java
            // Error while accessing the rest api, will try again later...
            LOG.warn("Exception while listing jobs", e);
            ifRunningMoveToReconciling(jobStatus, previousJobStatus);
            if (e instanceof TimeoutException) {
                onTimeout(ctx);
```

### ConstantValue
Value `previousJobStatus` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/JobStatusObserver.java`
#### Snippet
```java
            if (targetJobStatusMessage.isEmpty()) {
                LOG.warn("No matching jobs found on the cluster");
                ifRunningMoveToReconciling(jobStatus, previousJobStatus);
                onTargetJobNotFound(resource, ctx.getObserveConfig());
                return false;
```

### ConstantValue
Value `previousJobStatus` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/JobStatusObserver.java`
#### Snippet
```java
            LOG.debug("No jobs found on the cluster");
            // No jobs found on the cluster, it is possible that the jobmanager is still starting up
            ifRunningMoveToReconciling(jobStatus, previousJobStatus);
            onNoJobsFound(resource, ctx.getObserveConfig());
            return false;
```

### ConstantValue
Value `previousJobId` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/JobStatusObserver.java`
#### Snippet
```java
        jobStatus.setStartTime(String.valueOf(clusterJobStatus.getStartTime()));

        if (jobStatus.getJobId().equals(previousJobId)
                && jobStatus.getState().equals(previousJobStatus)) {
            LOG.info("Job status ({}) unchanged", previousJobStatus);
```

### ConstantValue
Value `previousJobStatus` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/JobStatusObserver.java`
#### Snippet
```java

        if (jobStatus.getJobId().equals(previousJobId)
                && jobStatus.getState().equals(previousJobStatus)) {
            LOG.info("Job status ({}) unchanged", previousJobStatus);
        } else {
```

### ConstantValue
Value `previousJobStatus` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/JobStatusObserver.java`
#### Snippet
```java
        if (jobStatus.getJobId().equals(previousJobId)
                && jobStatus.getState().equals(previousJobStatus)) {
            LOG.info("Job status ({}) unchanged", previousJobStatus);
        } else {
            jobStatus.setUpdateTime(String.valueOf(System.currentTimeMillis()));
```

### ConstantValue
Condition `previousJobStatus == null` is always `true`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/JobStatusObserver.java`
#### Snippet
```java
            jobStatus.setUpdateTime(String.valueOf(System.currentTimeMillis()));
            var message =
                    previousJobStatus == null
                            ? String.format("Job status changed to %s", jobStatus.getState())
                            : String.format(
```

### ConstantValue
Value `savepointFormatType` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/SavepointUtils.java`
#### Snippet
```java
                            KubernetesOperatorConfigOptions.OPERATOR_SAVEPOINT_FORMAT_TYPE);
        }
        return savepointFormatType;
    }
}
```

### ConstantValue
Value `jobStatus` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/SavepointUtils.java`
#### Snippet
```java
        var jobStatus = status.getJobStatus();

        if (!ReconciliationUtils.isJobRunning(status) || savepointInProgress(jobStatus)) {
            return Optional.empty();
        }
```

### ConstantValue
Value `lastTriggerTs` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/SavepointUtils.java`
#### Snippet
```java
        // against the creation timestamp for triggering the first periodic savepoint
        var lastTrigger =
                lastTriggerTs == 0
                        ? Instant.parse(resource.getMetadata().getCreationTimestamp())
                        : Instant.ofEpochMilli(lastTriggerTs);
```

### ConstantValue
Value `lastTriggerTs` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/SavepointUtils.java`
#### Snippet
```java
                lastTriggerTs == 0
                        ? Instant.parse(resource.getMetadata().getCreationTimestamp())
                        : Instant.ofEpochMilli(lastTriggerTs);
        var now = Instant.now();
        if (lastTrigger.plus(savepointInterval).isBefore(Instant.now())) {
```

### ConstantValue
Value `jobStatus` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/SavepointUtils.java`
#### Snippet
```java
        var jobStatus = status.getJobStatus();
        if (!ReconciliationUtils.isJobRunning(status)
                && SavepointUtils.savepointInProgress(jobStatus)) {
            var savepointInfo = jobStatus.getSavepointInfo();
            ReconciliationUtils.updateLastReconciledSavepointTriggerNonce(savepointInfo, resource);
```

### ConstantValue
Value `savepointInfo` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/SavepointUtils.java`
#### Snippet
```java
                && SavepointUtils.savepointInProgress(jobStatus)) {
            var savepointInfo = jobStatus.getSavepointInfo();
            ReconciliationUtils.updateLastReconciledSavepointTriggerNonce(savepointInfo, resource);
            savepointInfo.resetTrigger();
            LOG.error("Job is not running, cancelling savepoint operation");
```

### ConstantValue
Condition `targetSavepointTriggerNonce != null` is always `false`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/SavepointUtils.java`
#### Snippet
```java
        // For manual savepoints, we report pending status
        // during retries while the triggerId gets reset between retries.
        if (targetSavepointTriggerNonce != null
                && !Objects.equals(targetSavepointTriggerNonce, reconcileSavepointTriggerNonce)) {
            return SavepointStatus.PENDING;
```

### ConstantValue
Condition `targetSavepointTriggerNonce != null && !Objects.equals(targetSavepointTriggerNonce, ...` is always `false`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/SavepointUtils.java`
#### Snippet
```java
        // For manual savepoints, we report pending status
        // during retries while the triggerId gets reset between retries.
        if (targetSavepointTriggerNonce != null
                && !Objects.equals(targetSavepointTriggerNonce, reconcileSavepointTriggerNonce)) {
            return SavepointStatus.PENDING;
        }
```

### ConstantValue
Condition `lastSavepoint != null` is always `false`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/SavepointUtils.java`
#### Snippet
```java

        var lastSavepoint = savepointInfo.getLastSavepoint();
        if (lastSavepoint != null) {
            // Last savepoint was manual and triggerNonce matches
            if (Objects.equals(
```

### ConstantValue
Condition `jobState != null` is always `false`
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/status/CommonStatus.java`
#### Snippet
```java

        var jobState = getJobStatus().getState();
        if (jobState != null
                && org.apache.flink.api.common.JobStatus.valueOf(jobState)
                        .equals(org.apache.flink.api.common.JobStatus.FAILED)) {
```

### ConstantValue
Value `flinkDep` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/deployment/AbstractFlinkDeploymentObserver.java`
#### Snippet
```java
    public void observeInternal(FlinkResourceContext<FlinkDeployment> ctx) {
        var flinkDep = ctx.getResource();
        if (!isJmDeploymentReady(flinkDep)) {
            // Only observe the JM if we think it's in bad state
            observeJmDeployment(ctx);
```

### ConstantValue
Condition `job != null` is always `false`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/ReconciliationUtils.java`
#### Snippet
```java
        var job = target.getSpec().getJob();
        updateStatusForSpecReconciliation(
                target, job != null ? job.getState() : null, conf, false, clock);
    }

```

### ConstantValue
Value `jobState` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/ReconciliationUtils.java`
#### Snippet
```java
    public static boolean isJobInTerminalState(CommonStatus<?> status) {
        var jobState = status.getJobStatus().getState();
        return org.apache.flink.api.common.JobStatus.valueOf(jobState).isGloballyTerminalState();
    }

```

### ConstantValue
Value `flinkJobStatus` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/ReconciliationUtils.java`
#### Snippet
```java
        }

        if (flinkJobStatus == RUNNING) {
            // Running jobs are currently always marked stable
            status.getReconciliationStatus().markReconciledSpecAsStable();
```

### ConstantValue
Condition `reconciledJobState == JobState.RUNNING` is always `false`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/ReconciliationUtils.java`
#### Snippet
```java
                        .getState();

        if (reconciledJobState == JobState.RUNNING && flinkJobStatus == FINISHED) {
            // If the job finished on its own, it's marked stable
            status.getReconciliationStatus().markReconciledSpecAsStable();
```

### ConstantValue
Condition `reconciledJobState == JobState.RUNNING && flinkJobStatus == FINISHED` is always `false`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/ReconciliationUtils.java`
#### Snippet
```java
                        .getState();

        if (reconciledJobState == JobState.RUNNING && flinkJobStatus == FINISHED) {
            // If the job finished on its own, it's marked stable
            status.getReconciliationStatus().markReconciledSpecAsStable();
```

### ConstantValue
Value `reconciledJobState` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/ReconciliationUtils.java`
#### Snippet
```java
                        .getState();

        if (reconciledJobState == JobState.RUNNING && flinkJobStatus == FINISHED) {
            // If the job finished on its own, it's marked stable
            status.getReconciliationStatus().markReconciledSpecAsStable();
```

### ConstantValue
Condition `reconciliationState != ReconciliationState.ROLLED_BACK` is always `true`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/ReconciliationUtils.java`
#### Snippet
```java
        var reconciliationStatus = deployment.getStatus().getReconciliationStatus();
        var reconciliationState = reconciliationStatus.getState();
        if (reconciliationState != ReconciliationState.ROLLED_BACK) {
            return reconciliationStatus.deserializeLastReconciledSpec();
        } else {
```

### ConstantValue
Value `reconciliationState` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/ReconciliationUtils.java`
#### Snippet
```java
        var reconciliationStatus = deployment.getStatus().getReconciliationStatus();
        var reconciliationState = reconciliationStatus.getState();
        if (reconciliationState != ReconciliationState.ROLLED_BACK) {
            return reconciliationStatus.deserializeLastReconciledSpec();
        } else {
```

### ConstantValue
Condition `lastJobSpec != null` is always `false`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/ReconciliationUtils.java`
#### Snippet
```java
        var lastSpecWithMeta = reconciliationStatus.deserializeLastReconciledSpecWithMeta();
        var lastJobSpec = lastSpecWithMeta.getSpec().getJob();
        if (lastJobSpec != null) {
            lastJobSpec.setState(JobState.RUNNING);
        }
```

### ConstantValue
Condition `deploymentName != null` is always `false`
in `flink-kubernetes-webhook/src/main/java/org/apache/flink/kubernetes/operator/admission/mutator/FlinkMutator.java`
#### Snippet
```java
        }
        var deploymentName = flinkSessionJob.getSpec().getDeploymentName();
        if (deploymentName != null
                && !deploymentName.equals(labels.get(CrdConstants.LABEL_TARGET_SESSION))) {
            labels.put(
```

### ConstantValue
Condition `deploymentName != null && !deploymentName.equals(labels.get(CrdConstants.LABEL_TARGE...` is always `false`
in `flink-kubernetes-webhook/src/main/java/org/apache/flink/kubernetes/operator/admission/mutator/FlinkMutator.java`
#### Snippet
```java
        }
        var deploymentName = flinkSessionJob.getSpec().getDeploymentName();
        if (deploymentName != null
                && !deploymentName.equals(labels.get(CrdConstants.LABEL_TARGET_SESSION))) {
            labels.put(
                    CrdConstants.LABEL_TARGET_SESSION,
```

### ConstantValue
Value `millis` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/config/FlinkConfigManager.java`
#### Snippet
```java
        var millis = checkInterval.toMillis();
        executorService.scheduleAtFixedRate(
                new ConfigUpdater(), millis, millis, TimeUnit.MILLISECONDS);
        LOG.info("Enabled dynamic config updates, checking config changes every {}", checkInterval);
    }
```

### ConstantValue
Value `millis` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/config/FlinkConfigManager.java`
#### Snippet
```java
        var millis = checkInterval.toMillis();
        executorService.scheduleAtFixedRate(
                new ConfigUpdater(), millis, millis, TimeUnit.MILLISECONDS);
        LOG.info("Enabled dynamic config updates, checking config changes every {}", checkInterval);
    }
```

### ConstantValue
Condition `!oldNs.equals(newNs)` is always `true` when reached
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/config/FlinkConfigManager.java`
#### Snippet
```java
        this.operatorConfiguration = FlinkOperatorConfiguration.fromConfiguration(newConf);
        var newNs = this.operatorConfiguration.getWatchedNamespaces();
        if (this.operatorConfiguration.isDynamicNamespacesEnabled() && !oldNs.equals(newNs)) {
            this.namespaceListener.accept(operatorConfiguration.getWatchedNamespaces());
        }
```

### ConstantValue
Value `newNs` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/config/FlinkConfigManager.java`
#### Snippet
```java
        this.operatorConfiguration = FlinkOperatorConfiguration.fromConfiguration(newConf);
        var newNs = this.operatorConfiguration.getWatchedNamespaces();
        if (this.operatorConfiguration.isDynamicNamespacesEnabled() && !oldNs.equals(newNs)) {
            this.namespaceListener.accept(operatorConfiguration.getWatchedNamespaces());
        }
```

### ConstantValue
Value `key` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/config/FlinkConfigManager.java`
#### Snippet
```java

        // Always return a copy of the configuration to avoid polluting the cache
        return cache.get(key).clone();
    }

```

### ConstantValue
Condition `sessionJobFlinkConfiguration != null` is always `false`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/config/FlinkConfigManager.java`
#### Snippet
```java
        // merge session job specific config
        var sessionJobFlinkConfiguration = sessionJobSpec.getFlinkConfiguration();
        if (sessionJobFlinkConfiguration != null) {
            sessionJobFlinkConfiguration.forEach(sessionJobConfig::setString);
        }
```

### ConstantValue
Value `haConfigMapLabels` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/FlinkUtils.java`
#### Snippet
```java
                        .configMaps()
                        .inNamespace(namespace)
                        .withLabels(haConfigMapLabels)
                        .list()
                        .getItems();
```

### ConstantValue
Value `tmTotalCpu` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/FlinkUtils.java`
#### Snippet
```java
                        * taskManagerReplicas;

        return tmTotalCpu + jmTotalCpu;
    }

```

### ConstantValue
Value `jmTotalCpu` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/FlinkUtils.java`
#### Snippet
```java
                        * taskManagerReplicas;

        return tmTotalCpu + jmTotalCpu;
    }

```

### ConstantValue
Value `mergeArraysByName` is always 'true'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/FlinkUtils.java`
#### Snippet
```java
                                            return fromElement;
                                        }
                                        mergeInto(toElement, fromElement, mergeArraysByName);
                                        return toElement;
                                    }));
```

### ConstantValue
Value `clusterSpec` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/FlinkUtils.java`
#### Snippet
```java
        var clusterSpec = new KubernetesClusterClientFactory().getClusterSpecification(conf);

        var jmParameters = new KubernetesJobManagerParameters(conf, clusterSpec);
        var jmTotalMemory =
                Math.round(
```

### ConstantValue
Value `tmTotalMemory` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/FlinkUtils.java`
#### Snippet
```java
                                * taskManagerReplicas);

        return tmTotalMemory + jmTotalMemory;
    }

```

### ConstantValue
Value `jmTotalMemory` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/FlinkUtils.java`
#### Snippet
```java
                                * taskManagerReplicas);

        return tmTotalMemory + jmTotalMemory;
    }

```

### ConstantValue
Value `group` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/metrics/OperatorJosdkMetrics.java`
#### Snippet
```java
                        group = group.addGroup(mg);
                    }
                    var finalGroup = group;
                    return finalGroup.histogram(
                            "TimeSeconds",
```

### ConstantValue
Value `flinkVersion` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/metrics/FlinkDeploymentMetrics.java`
#### Snippet
```java
                        .getClusterInfo()
                        .getOrDefault(DashboardConfiguration.FIELD_NAME_FLINK_VERSION, "");
        if (StringUtils.isNullOrWhitespaceOnly(flinkVersion)) {
            flinkVersion = "UNKNOWN";
        }
```

### ConstantValue
Value `flinkVersion` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/metrics/FlinkDeploymentMetrics.java`
#### Snippet
```java
                .computeIfAbsent(namespace, ns -> new ConcurrentHashMap<>())
                .computeIfAbsent(
                        flinkVersion,
                        v -> {
                            initFlinkVersions(namespace, v);
```

### ConstantValue
Value `v` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/metrics/FlinkDeploymentMetrics.java`
#### Snippet
```java
                        flinkVersion,
                        v -> {
                            initFlinkVersions(namespace, v);
                            return ConcurrentHashMap.newKeySet();
                        })
```

### ConstantValue
Value `totalCpu` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/metrics/FlinkDeploymentMetrics.java`
#### Snippet
```java
                NumberUtils.toDouble(
                        clusterInfo.getOrDefault(AbstractFlinkService.FIELD_NAME_TOTAL_CPU, "0"));
        if (!Double.isFinite(totalCpu)) {
            totalCpu = 0;
        }
```

### ConstantValue
Value `totalCpu` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/metrics/FlinkDeploymentMetrics.java`
#### Snippet
```java
                            return new ConcurrentHashMap<>();
                        })
                .put(deploymentName, totalCpu);

        deploymentMemoryUsage
```

### ConstantValue
Value `script` is always 'null'
in `examples/flink-sql-runner-example/src/main/java/org/apache/flink/examples/SqlRunner.java`
#### Snippet
```java
        }
        var script = FileUtils.readFileUtf8(new File(args[0]));
        var statements = parseStatements(script);

        var tableEnv = TableEnvironment.create(new Configuration());
```

### ConstantValue
Value `watchNamespaces` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/FlinkOperator.java`
#### Snippet
```java
        var operatorConf = configManager.getOperatorConfiguration();
        var watchNamespaces = operatorConf.getWatchedNamespaces();
        LOG.info("Configuring operator to watch the following namespaces: {}.", watchNamespaces);
        overrider.settingNamespaces(operatorConf.getWatchedNamespaces());

```

### ConstantValue
Value `labelSelector` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/FlinkOperator.java`
#### Snippet
```java
        LOG.info(
                "Configuring operator to select custom resources with the {} labels.",
                labelSelector);
        overrider.withLabelSelector(labelSelector);
    }
```

### ConstantValue
Value `labelSelector` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/FlinkOperator.java`
#### Snippet
```java
                "Configuring operator to select custom resources with the {} labels.",
                labelSelector);
        overrider.withLabelSelector(labelSelector);
    }

```

### ConstantValue
Condition `leaderElectionConf != null` is always `false`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/FlinkOperator.java`
#### Snippet
```java

        var leaderElectionConf = operatorConf.getLeaderElectionConfiguration();
        if (leaderElectionConf != null) {
            overrider.withLeaderElectionConfiguration(leaderElectionConf);
            LOG.info("Operator leader election is enabled.");
```

### ConstantValue
Value `err` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/SavepointObserver.java`
#### Snippet
```java
                LOG.error(
                        "Savepoint attempt failed after grace period. Won't be retried again: "
                                + err);
                ReconciliationUtils.updateLastReconciledSavepointTriggerNonce(
                        savepointInfo, (AbstractFlinkResource) resource);
```

### ConstantValue
Value `err` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/SavepointObserver.java`
#### Snippet
```java
                        savepointInfo, (AbstractFlinkResource) resource);
            } else {
                LOG.warn("Savepoint failed within grace period, retrying: " + err);
            }
            eventRecorder.triggerEvent(
```

### ConstantValue
Value `jobId` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/SavepointObserver.java`
#### Snippet
```java
        // If any manual or periodic savepoint is in progress, observe it
        if (SavepointUtils.savepointInProgress(jobStatus)) {
            observeTriggeredSavepoint(ctx, jobId);
        }

```

### ConstantValue
Value `savepointInfo` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/SavepointObserver.java`
#### Snippet
```java
        if (ReconciliationUtils.isJobInTerminalState(resource.getStatus())) {
            observeLatestSavepoint(
                    ctx.getFlinkService(), savepointInfo, jobId, ctx.getObserveConfig());
        }

```

### ConstantValue
Value `jobId` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/SavepointObserver.java`
#### Snippet
```java
        if (ReconciliationUtils.isJobInTerminalState(resource.getStatus())) {
            observeLatestSavepoint(
                    ctx.getFlinkService(), savepointInfo, jobId, ctx.getObserveConfig());
        }

```

### ConstantValue
Value `savepointInfo` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/SavepointObserver.java`
#### Snippet
```java
        }

        cleanupSavepointHistory(ctx.getFlinkService(), savepointInfo, ctx.getObserveConfig());
    }

```

### ConstantValue
Value `client` is always 'null'
in `flink-kubernetes-standalone/src/main/java/org/apache/flink/kubernetes/operator/kubeclient/Fabric8FlinkStandaloneKubeClient.java`
#### Snippet
```java
                new DefaultKubernetesClient()
                        .inNamespace(conf.get(KubernetesConfigOptions.NAMESPACE));
        return new Fabric8FlinkStandaloneKubeClient(conf, client, executorService);
    }
}
```

### ConstantValue
Condition `leftField != null` is always `false`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/diff/ReflectiveDiffBuilder.java`
#### Snippet
```java
                                configDiff(
                                        field,
                                        (leftField != null)
                                                ? (Map<String, String>) leftField
                                                : new HashMap<>(),
```

### ConstantValue
Condition `rightField != null` is always `false`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/diff/ReflectiveDiffBuilder.java`
#### Snippet
```java
                                                ? (Map<String, String>) leftField
                                                : new HashMap<>(),
                                        (rightField != null)
                                                ? (Map<String, String>) rightField
                                                : new HashMap<>()));
```

### ConstantValue
Value `leftField` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/diff/ReflectiveDiffBuilder.java`
#### Snippet
```java
                        var annotation = field.getAnnotation(SpecDiff.class);
                        diffBuilder.append(
                                field.getName(), leftField, rightField, annotation.value());
                    } else if (Diffable.class.isAssignableFrom(field.getType())
                            && ObjectUtils.allNotNull(leftField, rightField)) {
```

### ConstantValue
Value `rightField` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/diff/ReflectiveDiffBuilder.java`
#### Snippet
```java
                        var annotation = field.getAnnotation(SpecDiff.class);
                        diffBuilder.append(
                                field.getName(), leftField, rightField, annotation.value());
                    } else if (Diffable.class.isAssignableFrom(field.getType())
                            && ObjectUtils.allNotNull(leftField, rightField)) {
```

### ConstantValue
Value `leftField` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/diff/ReflectiveDiffBuilder.java`
#### Snippet
```java
                                field.getName(), leftField, rightField, annotation.value());
                    } else if (Diffable.class.isAssignableFrom(field.getType())
                            && ObjectUtils.allNotNull(leftField, rightField)) {

                        diffBuilder.append(
```

### ConstantValue
Condition `cause instanceof FlinkJobTerminatedWithoutCancellationException` is always `false`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/sessionjob/SessionJobReconciler.java`
#### Snippet
```java
                    }

                    if (cause instanceof FlinkJobTerminatedWithoutCancellationException) {
                        LOG.error("Job {} already terminated without cancellation.", jobID, e);
                        return DeleteControl.defaultDelete();
```

### ConstantValue
Value `rightField` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/diff/ReflectiveDiffBuilder.java`
#### Snippet
```java
                                field.getName(), leftField, rightField, annotation.value());
                    } else if (Diffable.class.isAssignableFrom(field.getType())
                            && ObjectUtils.allNotNull(leftField, rightField)) {

                        diffBuilder.append(
```

### ConstantValue
Value `leftField` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/diff/ReflectiveDiffBuilder.java`
#### Snippet
```java
                        diffBuilder.append(
                                field.getName(),
                                new ReflectiveDiffBuilder<T>((T) leftField, (T) rightField)
                                        .build());

```

### ConstantValue
Value `rightField` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/diff/ReflectiveDiffBuilder.java`
#### Snippet
```java
                        diffBuilder.append(
                                field.getName(),
                                new ReflectiveDiffBuilder<T>((T) leftField, (T) rightField)
                                        .build());

```

### ConstantValue
Value `cause` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/sessionjob/SessionJobReconciler.java`
#### Snippet
```java
                    }

                    if (cause instanceof FlinkJobTerminatedWithoutCancellationException) {
                        LOG.error("Job {} already terminated without cancellation.", jobID, e);
                        return DeleteControl.defaultDelete();
```

### ConstantValue
Condition `jobmanagerDeploymentStatus != JobManagerDeploymentStatus.READY` is always `true`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/sessionjob/SessionJobReconciler.java`
#### Snippet
```java
            var flinkdep = flinkDeploymentOpt.get();
            var jobmanagerDeploymentStatus = flinkdep.getStatus().getJobManagerDeploymentStatus();
            if (jobmanagerDeploymentStatus != JobManagerDeploymentStatus.READY) {
                LOG.info(
                        "Session cluster deployment is in {} status, not ready for serve",
```

### ConstantValue
Value `jobmanagerDeploymentStatus` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/sessionjob/SessionJobReconciler.java`
#### Snippet
```java
            var flinkdep = flinkDeploymentOpt.get();
            var jobmanagerDeploymentStatus = flinkdep.getStatus().getJobManagerDeploymentStatus();
            if (jobmanagerDeploymentStatus != JobManagerDeploymentStatus.READY) {
                LOG.info(
                        "Session cluster deployment is in {} status, not ready for serve",
```

### ConstantValue
Value `jobmanagerDeploymentStatus` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/sessionjob/SessionJobReconciler.java`
#### Snippet
```java
                LOG.info(
                        "Session cluster deployment is in {} status, not ready for serve",
                        jobmanagerDeploymentStatus);
                return false;
            } else {
```

### ConstantValue
Value `busyTimeMsPerSecond` is always 'null'
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/metrics/ScalingMetrics.java`
#### Snippet
```java
        var busyTimeMsPerSecond =
                busyTimeAggregator.get(flinkMetrics.get(FlinkMetric.BUSY_TIME_PER_SEC));
        if (!Double.isFinite(busyTimeMsPerSecond)) {
            LOG.error(
                    "No busyTimeMsPerSecond metric available for {}. No scaling will be performed for this vertex.",
```

### ConstantValue
Value `busyTimeMsPerSecond` is always 'null'
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/metrics/ScalingMetrics.java`
#### Snippet
```java
            busyTimeMsPerSecond = conf.get(AutoScalerOptions.TARGET_UTILIZATION) * 1000;
        }
        return busyTimeMsPerSecond;
    }

```

### ConstantValue
Condition `currentJobState == null` is always `true`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/service/AbstractFlinkService.java`
#### Snippet
```java
        status.setJobManagerDeploymentStatus(JobManagerDeploymentStatus.MISSING);
        var currentJobState = status.getJobStatus().getState();
        if (currentJobState == null
                || !JobStatus.valueOf(currentJobState).isGloballyTerminalState()) {
            status.getJobStatus().setState(JobStatus.FINISHED.name());
```

### ConstantValue
Condition `currentJobState == null || !JobStatus.valueOf(currentJobState).isGloballyTerminalSta...` is always `true`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/service/AbstractFlinkService.java`
#### Snippet
```java
        status.setJobManagerDeploymentStatus(JobManagerDeploymentStatus.MISSING);
        var currentJobState = status.getJobStatus().getState();
        if (currentJobState == null
                || !JobStatus.valueOf(currentJobState).isGloballyTerminalState()) {
            status.getJobStatus().setState(JobStatus.FINISHED.name());
        }
```

### ConstantValue
Value `deletionPropagation` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/service/AbstractFlinkService.java`
#### Snippet
```java

        var deletionPropagation = configManager.getOperatorConfiguration().getDeletionPropagation();
        LOG.info("Deleting cluster with {} propagation", deletionPropagation);
        deleteClusterInternal(meta, conf, deleteHaData, deletionPropagation);
        updateStatusAfterClusterDeletion(status);
```

### ConstantValue
Value `deletionPropagation` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/service/AbstractFlinkService.java`
#### Snippet
```java
        var deletionPropagation = configManager.getOperatorConfiguration().getDeletionPropagation();
        LOG.info("Deleting cluster with {} propagation", deletionPropagation);
        deleteClusterInternal(meta, conf, deleteHaData, deletionPropagation);
        updateStatusAfterClusterDeletion(status);
    }
```

### ConstantValue
Value `jobIdString` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/service/AbstractFlinkService.java`
#### Snippet
```java
        var jobStatus = sessionJobStatus.getJobStatus();
        var jobIdString = jobStatus.getJobId();
        Preconditions.checkNotNull(jobIdString, "The job to be suspend should not be null");
        var jobId = JobID.fromHexString(jobIdString);
        Optional<String> savepointOpt = Optional.empty();
```

### ConstantValue
Value `jobIdString` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/service/AbstractFlinkService.java`
#### Snippet
```java
        var jobIdString = jobStatus.getJobId();
        Preconditions.checkNotNull(jobIdString, "The job to be suspend should not be null");
        var jobId = JobID.fromHexString(jobIdString);
        Optional<String> savepointOpt = Optional.empty();

```

### ConstantValue
Value `jobId` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/service/AbstractFlinkService.java`
#### Snippet
```java
                        LOG.info("Cancelling job.");
                        clusterClient
                                .cancel(jobId)
                                .get(
                                        configManager
```

### ConstantValue
Value `jobId` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/service/AbstractFlinkService.java`
#### Snippet
```java
                                        clusterClient
                                                .stopWithSavepoint(
                                                        jobId,
                                                        false,
                                                        savepointDirectory,
```

### ConstantValue
Value `savepointDirectory` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/service/AbstractFlinkService.java`
#### Snippet
```java
                                    savepointTriggerMessageParameters,
                                    new SavepointTriggerRequestBody(
                                            savepointDirectory,
                                            false,
                                            conf.get(FLINK_VERSION)
```

### ConstantValue
Value `timeout` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/service/AbstractFlinkService.java`
#### Snippet
```java
                                                    : null,
                                            null))
                            .get(timeout, TimeUnit.SECONDS);
            LOG.info("Savepoint successfully triggered: " + response.getTriggerId().toHexString());

```

### ConstantValue
Value `taskManagerReplicas` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/service/AbstractFlinkService.java`
#### Snippet
```java
        clusterInfo.put(
                FIELD_NAME_TOTAL_CPU,
                String.valueOf(FlinkUtils.calculateClusterCpuUsage(conf, taskManagerReplicas)));
        clusterInfo.put(
                FIELD_NAME_TOTAL_MEMORY,
```

### ConstantValue
Value `taskManagerReplicas` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/service/AbstractFlinkService.java`
#### Snippet
```java
        clusterInfo.put(
                FIELD_NAME_TOTAL_MEMORY,
                String.valueOf(FlinkUtils.calculateClusterMemoryUsage(conf, taskManagerReplicas)));

        return clusterInfo;
```

### ConstantValue
Condition `jobIdString != null` is always `false`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/service/AbstractFlinkService.java`
#### Snippet
```java
        var deploymentStatus = deployment.getStatus();
        var jobIdString = deploymentStatus.getJobStatus().getJobId();
        var jobId = jobIdString != null ? JobID.fromHexString(jobIdString) : null;

        Optional<String> savepointOpt = Optional.empty();
```

### ConstantValue
Value `jobId` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/service/AbstractFlinkService.java`
#### Snippet
```java
                        try {
                            clusterClient
                                    .cancel(Preconditions.checkNotNull(jobId))
                                    .get(
                                            configManager
```

### ConstantValue
Value `jobId` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/service/AbstractFlinkService.java`
#### Snippet
```java
                                    clusterClient
                                            .stopWithSavepoint(
                                                    Preconditions.checkNotNull(jobId),
                                                    false,
                                                    savepointDirectory,
```

### ConstantValue
Condition `jmDeployStatus != JobManagerDeploymentStatus.MISSING` is always `true`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/ApplicationReconciler.java`
#### Snippet
```java

        var jmDeployStatus = status.getJobManagerDeploymentStatus();
        if (jmDeployStatus != JobManagerDeploymentStatus.MISSING
                && status.getReconciliationStatus()
                                .deserializeLastReconciledSpec()
```

### ConstantValue
Value `jmDeployStatus` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/ApplicationReconciler.java`
#### Snippet
```java

        var jmDeployStatus = status.getJobManagerDeploymentStatus();
        if (jmDeployStatus != JobManagerDeploymentStatus.MISSING
                && status.getReconciliationStatus()
                                .deserializeLastReconciledSpec()
```

### ConstantValue
Condition `(jmDeployStatus == JobManagerDeploymentStatus.MISSING || jmDeployStatus == J...` is always `false`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/ApplicationReconciler.java`
#### Snippet
```java
        }

        if ((jmDeployStatus == JobManagerDeploymentStatus.MISSING
                        || jmDeployStatus == JobManagerDeploymentStatus.ERROR)
                && !flinkService.isHaMetadataAvailable(deployConfig)) {
            throw new RecoveryFailureException(
                    "JobManager deployment is missing and HA data is not available to make stateful upgrades. "
```

### ConstantValue
Condition `jmDeployStatus == JobManagerDeploymentStatus.MISSING` is always `false`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/ApplicationReconciler.java`
#### Snippet
```java
        }

        if ((jmDeployStatus == JobManagerDeploymentStatus.MISSING
                        || jmDeployStatus == JobManagerDeploymentStatus.ERROR)
                && !flinkService.isHaMetadataAvailable(deployConfig)) {
```

### ConstantValue
Condition `jmDeployStatus == JobManagerDeploymentStatus.MISSING || jmDeployStatus == Jo...` is always `false`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/ApplicationReconciler.java`
#### Snippet
```java
        }

        if ((jmDeployStatus == JobManagerDeploymentStatus.MISSING
                        || jmDeployStatus == JobManagerDeploymentStatus.ERROR)
                && !flinkService.isHaMetadataAvailable(deployConfig)) {
            throw new RecoveryFailureException(
```

### ConstantValue
Value `jmDeployStatus` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/ApplicationReconciler.java`
#### Snippet
```java
        }

        if ((jmDeployStatus == JobManagerDeploymentStatus.MISSING
                        || jmDeployStatus == JobManagerDeploymentStatus.ERROR)
                && !flinkService.isHaMetadataAvailable(deployConfig)) {
```

### ConstantValue
Condition `jmDeployStatus == JobManagerDeploymentStatus.ERROR` is always `false` when reached
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/ApplicationReconciler.java`
#### Snippet
```java

        if ((jmDeployStatus == JobManagerDeploymentStatus.MISSING
                        || jmDeployStatus == JobManagerDeploymentStatus.ERROR)
                && !flinkService.isHaMetadataAvailable(deployConfig)) {
            throw new RecoveryFailureException(
```

### ConstantValue
Value `jmDeployStatus` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/ApplicationReconciler.java`
#### Snippet
```java

        if ((jmDeployStatus == JobManagerDeploymentStatus.MISSING
                        || jmDeployStatus == JobManagerDeploymentStatus.ERROR)
                && !flinkService.isHaMetadataAvailable(deployConfig)) {
            throw new RecoveryFailureException(
```

### ConstantValue
Value `ttl` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/ApplicationReconciler.java`
#### Snippet
```java
                                                    Long.parseLong(
                                                            status.getJobStatus().getUpdateTime()))
                                            .plus(ttl));
            if (ttlPassed) {
                LOG.info("Removing JobManager deployment for terminal application.");
```

### ConstantValue
Value `deployment` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/ApplicationReconciler.java`
#### Snippet
```java
        var observeConfig = ctx.getObserveConfig();
        boolean shouldRestartJobBecauseUnhealthy =
                shouldRestartJobBecauseUnhealthy(deployment, observeConfig);
        boolean shouldRecoverDeployment = shouldRecoverDeployment(observeConfig, deployment);
        if (shouldRestartJobBecauseUnhealthy || shouldRecoverDeployment) {
```

### ConstantValue
Value `deployment` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/ApplicationReconciler.java`
#### Snippet
```java
        boolean shouldRestartJobBecauseUnhealthy =
                shouldRestartJobBecauseUnhealthy(deployment, observeConfig);
        boolean shouldRecoverDeployment = shouldRecoverDeployment(observeConfig, deployment);
        if (shouldRestartJobBecauseUnhealthy || shouldRecoverDeployment) {
            if (shouldRecoverDeployment) {
```

### ConstantValue
Value `deployment` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/ApplicationReconciler.java`
#### Snippet
```java
            if (shouldRecoverDeployment) {
                eventRecorder.triggerEvent(
                        deployment,
                        EventRecorder.Type.Warning,
                        EventRecorder.Reason.RecoverDeployment,
```

### ConstantValue
Value `deployment` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/ApplicationReconciler.java`
#### Snippet
```java
            if (shouldRestartJobBecauseUnhealthy) {
                eventRecorder.triggerEvent(
                        deployment,
                        EventRecorder.Type.Warning,
                        EventRecorder.Reason.RestartUnhealthyJob,
```

### ConstantValue
Value `deployment` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/ApplicationReconciler.java`
#### Snippet
```java
        }

        return cleanupTerminalJmAfterTtl(ctx.getFlinkService(), deployment, observeConfig);
    }

```

### ConstantValue
Value `clusterInfo` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/ApplicationReconciler.java`
#### Snippet
```java
            var clusterInfo = deployment.getStatus().getClusterInfo();
            ClusterHealthInfo clusterHealthInfo =
                    ClusterHealthEvaluator.getLastValidClusterHealthInfo(clusterInfo);
            if (clusterHealthInfo != null) {
                LOG.debug("Cluster info contains job health info");
```

### ConstantValue
Value `jobId` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/sessionjob/FlinkSessionJobObserver.java`
#### Snippet
```java
            var matchedList =
                    clusterJobStatuses.stream()
                            .filter(job -> job.getJobId().toHexString().equals(jobId))
                            .collect(Collectors.toList());
            Preconditions.checkArgument(
```

### ConstantValue
Value `jobId` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/sessionjob/FlinkSessionJobObserver.java`
#### Snippet
```java

            if (matchedList.size() == 0) {
                LOG.warn("No job found for JobID: {}", jobId);
                return Optional.empty();
            } else {
```

### ConstantValue
Value `oldJobID` is always 'null'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/sessionjob/FlinkSessionJobObserver.java`
#### Snippet
```java
                LOG.info(
                        "Pending upgrade is already deployed, updating status. Old jobID:{}, new jobID:{}",
                        oldJobID,
                        matchedJobID.toHexString());
                ReconciliationUtils.updateStatusForAlreadyUpgraded(flinkSessionJob);
```

### ConstantValue
Value `deploymentName` is always 'null'
in `flink-kubernetes-webhook/src/main/java/org/apache/flink/kubernetes/operator/admission/FlinkValidator.java`
#### Snippet
```java
        var deploymentName = sessionJob.getSpec().getDeploymentName();

        var key = Cache.namespaceKeyFunc(namespace, deploymentName);
        var deployment = informerManager.getFlinkDepInformer(namespace).getStore().getByKey(key);

```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/validation/DefaultValidator.java`
#### Snippet
```java
                MemorySize.parse(memory);
            } catch (IllegalArgumentException iae) {
                builder.append(component + " resource memory parse error: " + iae.getMessage());
            }
        }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/validation/DefaultValidator.java`
#### Snippet
```java
                Quantity.getAmountInBytes(quantity);
            } catch (IllegalArgumentException iae) {
                builder.append(
                        component + " resource ephemeral storage parse error: " + iae.getMessage());
            }
```

