# flink-kubernetes-operator 
 
# Bad smells
I found 246 bad smells with 43 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 78 | false |
| UtilityClassWithoutPrivateConstructor | 32 | true |
| ReturnNull | 18 | false |
| DynamicRegexReplaceableByCompiledPattern | 13 | false |
| MarkedForRemoval | 9 | false |
| DataFlowIssue | 7 | false |
| UnnecessaryFullyQualifiedName | 7 | false |
| RegExpRedundantEscape | 6 | false |
| OptionalUsedAsFieldOrParameterType | 6 | false |
| NonProtectedConstructorInAbstractClass | 6 | true |
| NumberEquality | 4 | false |
| RedundantFieldInitialization | 4 | false |
| AssignmentToMethodParameter | 3 | false |
| InstanceofCatchParameter | 3 | false |
| ZeroLengthArrayInitialization | 3 | false |
| OptionalGetWithoutIsPresent | 3 | false |
| Convert2MethodRef | 2 | false |
| NonSerializableFieldInSerializableClass | 2 | false |
| RegExpSimplifiable | 2 | false |
| SizeReplaceableByIsEmpty | 2 | true |
| NullableProblems | 2 | false |
| StringEqualsEmptyString | 2 | false |
| NestedAssignment | 2 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 2 | false |
| RedundantImplements | 2 | false |
| HtmlWrongAttributeValue | 2 | false |
| SynchronizeOnThis | 2 | false |
| ConstantValue | 2 | false |
| UseBulkOperation | 2 | false |
| StringConcatenationInsideStringBufferAppend | 2 | false |
| EnumSwitchStatementWhichMissesCases | 1 | false |
| IOResource | 1 | false |
| UnnecessarySemicolon | 1 | false |
| KeySetIterationMayUseEntrySet | 1 | false |
| UnnecessaryReturn | 1 | true |
| TrivialStringConcatenation | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| MissortedModifiers | 1 | false |
| SystemOutErr | 1 | false |
| ClassNameSameAsAncestorName | 1 | false |
| InfiniteLoopStatement | 1 | false |
| ExceptionNameDoesntEndWithException | 1 | false |
| AssignmentToLambdaParameter | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| UnusedAssignment | 1 | false |
| NonExceptionNameEndsWithException | 1 | false |
## RuleId[id=EnumSwitchStatementWhichMissesCases]
### EnumSwitchStatementWhichMissesCases
`switch (reconciliationStatus.getState()) { case UPGRADING: return Resour...` statement on enum type 'org.apache.flink.kubernetes.operator.api.status.ReconciliationState' misses cases: 'DEPLOYED', and 'ROLLED_BACK'
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/status/CommonStatus.java`
#### Snippet
```java
        }

        switch (reconciliationStatus.getState()) {
            case UPGRADING:
                return ResourceLifecycleState.UPGRADING;
            case ROLLING_BACK:
                return ResourceLifecycleState.ROLLING_BACK;
        }

        var lastReconciledSpec = reconciliationStatus.deserializeLastReconciledSpec();
```

## RuleId[id=IOResource]
### IOResource
'DefaultKubernetesClient' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `flink-kubernetes-standalone/src/main/java/org/apache/flink/kubernetes/operator/kubeclient/Fabric8FlinkStandaloneKubeClient.java`
#### Snippet
```java
            Configuration conf, ExecutorService executorService) {
        var client =
                new DefaultKubernetesClient()
                        .inNamespace(conf.get(KubernetesConfigOptions.NAMESPACE));
        return new Fabric8FlinkStandaloneKubeClient(conf, client, executorService);
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `CrdConstants` has only 'static' members, and lacks a 'private' constructor
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/CrdConstants.java`
#### Snippet
```java

/** Constants used by the CRD. */
public class CrdConstants {
    public static final String API_GROUP = "flink.apache.org";
    public static final String API_VERSION = "v1beta1";
```

### UtilityClassWithoutPrivateConstructor
Class `SpecUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/utils/SpecUtils.java`
#### Snippet
```java

/** Spec utilities. */
public class SpecUtils {
    public static final String INTERNAL_METADATA_JSON_KEY = "resource_metadata";
    private static final ObjectMapper objectMapper = new ObjectMapper();
```

### UtilityClassWithoutPrivateConstructor
Class `KubernetesOperatorConfigOptions` has only 'static' members, and lacks a 'private' constructor
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/config/KubernetesOperatorConfigOptions.java`
#### Snippet
```java

/** This class holds configuration constants used by flink operator. */
public class KubernetesOperatorConfigOptions {

    public static final String K8S_OP_CONF_PREFIX = "kubernetes.operator.";
```

### UtilityClassWithoutPrivateConstructor
Class `KubernetesClientUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/KubernetesClientUtils.java`
#### Snippet
```java

/** Kubernetes client utils. */
public class KubernetesClientUtils {

    private static final Logger LOG = LoggerFactory.getLogger(KubernetesClientUtils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `KubernetesOperatorMetricOptions` has only 'static' members, and lacks a 'private' constructor
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/metrics/KubernetesOperatorMetricOptions.java`
#### Snippet
```java

/** Configuration options for metrics. */
public class KubernetesOperatorMetricOptions {

    public static final ConfigOption<Boolean> OPERATOR_JVM_METRICS_ENABLED =
```

### UtilityClassWithoutPrivateConstructor
Class `OperatorMetricUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/metrics/OperatorMetricUtils.java`
#### Snippet
```java

/** Utility class for flink based operator metrics. */
public class OperatorMetricUtils {

    private static final Logger LOG = LoggerFactory.getLogger(OperatorMetricUtils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `ConfigOptionUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/ConfigOptionUtils.java`
#### Snippet
```java

/** {@link ConfigOption} utilities. */
public class ConfigOptionUtils {

    private static final Logger LOG = LoggerFactory.getLogger(ConfigOptionUtils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `FlinkOperatorWebhook` has only 'static' members, and lacks a 'private' constructor
in `flink-kubernetes-webhook/src/main/java/org/apache/flink/kubernetes/operator/admission/FlinkOperatorWebhook.java`
#### Snippet
```java

/** Main Class for Flink native k8s operator. */
public class FlinkOperatorWebhook {
    private static final Logger LOG = LoggerFactory.getLogger(FlinkOperatorWebhook.class);

```

### UtilityClassWithoutPrivateConstructor
Class `EventUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/EventUtils.java`
#### Snippet
```java
 * https://github.com/EnMasseProject/enmasse/blob/master/k8s-api/src/main/java/io/enmasse/k8s/api/KubeEventLogger.java
 */
public class EventUtils {

    public static String generateEventName(
```

### UtilityClassWithoutPrivateConstructor
Class `Basic` has only 'static' members, and lacks a 'private' constructor
in `examples/kubernetes-client-examples/src/main/java/org/apache/flink/examples/Basic.java`
#### Snippet
```java

/** client code for ../basic.yaml. */
public class Basic {
    public static void main(String[] args) {
        FlinkDeployment flinkDeployment = new FlinkDeployment();
```

### UtilityClassWithoutPrivateConstructor
Class `ValidatorUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/ValidatorUtils.java`
#### Snippet
```java

/** Validator utilities. */
public final class ValidatorUtils {

    private static final Logger LOG = LoggerFactory.getLogger(FlinkUtils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `ScalingMetrics` has only 'static' members, and lacks a 'private' constructor
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/metrics/ScalingMetrics.java`
#### Snippet
```java

/** Utilities for computing scaling metrics based on Flink metrics. */
public class ScalingMetrics {

    private static final Logger LOG = LoggerFactory.getLogger(ScalingMetrics.class);
```

### UtilityClassWithoutPrivateConstructor
Class `ListenerUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/listener/ListenerUtils.java`
#### Snippet
```java

/** Flink resource listener utilities. */
public class ListenerUtils {

    private static final Logger LOG = LoggerFactory.getLogger(ListenerUtils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `FlinkUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/FlinkUtils.java`
#### Snippet
```java

/** Flink Utility methods used by the operator. */
public class FlinkUtils {

    private static final Logger LOG = LoggerFactory.getLogger(FlinkUtils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `Utils` has only 'static' members, and lacks a 'private' constructor
in `flink-kubernetes-docs/src/main/java/org/apache/flink/kubernetes/operator/docs/util/Utils.java`
#### Snippet
```java

/** Contains various shared utility functions. */
public class Utils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `SavepointUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/SavepointUtils.java`
#### Snippet
```java

/** Savepoint utilities. */
public class SavepointUtils {

    private static final Logger LOG = LoggerFactory.getLogger(SavepointUtils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `StandaloneKubernetesConfigOptionsInternal` has only 'static' members, and lacks a 'private' constructor
in `flink-kubernetes-standalone/src/main/java/org/apache/flink/kubernetes/operator/standalone/StandaloneKubernetesConfigOptionsInternal.java`
#### Snippet
```java
 * clusters in standalone mode.
 */
public class StandaloneKubernetesConfigOptionsInternal {
    public static final ConfigOption<Integer> KUBERNETES_TASKMANAGER_REPLICAS =
            key("kubernetes.internal.taskmanager.replicas")
```

### UtilityClassWithoutPrivateConstructor
Class `StandaloneKubernetesTaskManagerFactory` has only 'static' members, and lacks a 'private' constructor
in `flink-kubernetes-standalone/src/main/java/org/apache/flink/kubernetes/operator/kubeclient/factory/StandaloneKubernetesTaskManagerFactory.java`
#### Snippet
```java

/** Utility class for constructing the TaskManager Deployment when deploying in standalone mode. */
public class StandaloneKubernetesTaskManagerFactory {

    public static Deployment buildKubernetesTaskManagerDeployment(
```

### UtilityClassWithoutPrivateConstructor
Class `StandaloneKubernetesJobManagerFactory` has only 'static' members, and lacks a 'private' constructor
in `flink-kubernetes-standalone/src/main/java/org/apache/flink/kubernetes/operator/kubeclient/factory/StandaloneKubernetesJobManagerFactory.java`
#### Snippet
```java
 * mode. This can include the Deployment, the ConfigMap(s), and the Service(s).
 */
public class StandaloneKubernetesJobManagerFactory {
    public static KubernetesJobManagerSpecification buildKubernetesJobManagerSpecification(
            FlinkPod podTemplate,
```

### UtilityClassWithoutPrivateConstructor
Class `StandaloneKubernetesUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-kubernetes-standalone/src/main/java/org/apache/flink/kubernetes/operator/utils/StandaloneKubernetesUtils.java`
#### Snippet
```java

/** Standalone Kubernetes Utils. */
public class StandaloneKubernetesUtils {

    public static final String LABEL_TYPE_STANDALONE_TYPE = "flink-standalone-kubernetes";
```

### UtilityClassWithoutPrivateConstructor
Class `ReconciliationUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/ReconciliationUtils.java`
#### Snippet
```java

/** Reconciliation utilities. */
public class ReconciliationUtils {

    private static final Logger LOG = LoggerFactory.getLogger(ReconciliationUtils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `CrdCompatibilityChecker` has only 'static' members, and lacks a 'private' constructor
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/validation/CrdCompatibilityChecker.java`
#### Snippet
```java
 * </ul>
 */
public class CrdCompatibilityChecker {

    private static final Logger logger = LoggerFactory.getLogger(CrdCompatibilityChecker.class);
```

### UtilityClassWithoutPrivateConstructor
Class `EnvUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/EnvUtils.java`
#### Snippet
```java

/** Util to get value from environments. */
public class EnvUtils {

    private static final Logger LOG = LoggerFactory.getLogger(EnvUtils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `FlinkResourceExceptionUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/FlinkResourceExceptionUtils.java`
#### Snippet
```java

/** Flink Resource Exception utilities. */
public final class FlinkResourceExceptionUtils {

    private static final ObjectMapper objectMapper = new ObjectMapper();
```

### UtilityClassWithoutPrivateConstructor
Class `AuditUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/listener/AuditUtils.java`
#### Snippet
```java

/** Responsible for logging resource event/status updates. */
public class AuditUtils {
    private static final Logger LOG = LoggerFactory.getLogger(AuditUtils.class);

```

### UtilityClassWithoutPrivateConstructor
Class `AutoscalerLoader` has only 'static' members, and lacks a 'private' constructor
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/AutoscalerLoader.java`
#### Snippet
```java

/** Loads the active Autoscaler implementation from the classpath. */
public class AutoscalerLoader {

    private static final Logger LOG = LoggerFactory.getLogger(AutoscalerLoader.class);
```

### UtilityClassWithoutPrivateConstructor
Class `AutoScalerOptions` has only 'static' members, and lacks a 'private' constructor
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/config/AutoScalerOptions.java`
#### Snippet
```java

/** Config options related to the autoscaler module. */
public class AutoScalerOptions {

    private static ConfigOptions.OptionBuilder autoScalerConfig(String key) {
```

### UtilityClassWithoutPrivateConstructor
Class `SqlRunner` has only 'static' members, and lacks a 'private' constructor
in `examples/flink-sql-runner-example/src/main/java/org/apache/flink/examples/SqlRunner.java`
#### Snippet
```java

/** Main class for executing SQL scripts. */
public class SqlRunner {

    private static final Logger LOG = LoggerFactory.getLogger(SqlRunner.class);
```

### UtilityClassWithoutPrivateConstructor
Class `IngressUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/IngressUtils.java`
#### Snippet
```java

/** Ingress utilities. */
public class IngressUtils {

    private static final Pattern NAME_PTN =
```

### UtilityClassWithoutPrivateConstructor
Class `AutoScalerUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/utils/AutoScalerUtils.java`
#### Snippet
```java

/** AutoScaler utilities. */
public class AutoScalerUtils {

    public static double getTargetProcessingCapacity(
```

### UtilityClassWithoutPrivateConstructor
Class `EventSourceUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/EventSourceUtils.java`
#### Snippet
```java

/** Utility class to locate secondary resources. */
public class EventSourceUtils {

    private static final String FLINK_DEPLOYMENT_IDX = FlinkDeploymentController.class.getName();
```

### UtilityClassWithoutPrivateConstructor
Class `AutoscalingExample` has only 'static' members, and lacks a 'private' constructor
in `examples/autoscaling/src/main/java/autoscaling/AutoscalingExample.java`
#### Snippet
```java

/** Autoscaling Example. */
public class AutoscalingExample {
    public static void main(String[] args) throws Exception {
        var env = StreamExecutionEnvironment.getExecutionEnvironment();
```

## RuleId[id=MarkedForRemoval]
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
    public void failedReconciliation(
            ResourceID resourceID, Exception exception, Map<String, Object> metadata) {
        counter(getResourceMg(resourceID, metadata), RECONCILIATION, "failed").inc();
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
                        KubernetesOperatorMetricOptions.OPERATOR_METRICS_HISTOGRAM_SAMPLE_SIZE);

        RetryConfiguration retryConfiguration = new FlinkOperatorRetryConfiguration(operatorConfig);

        String labelSelector =
```

### MarkedForRemoval
'io.javaoperatorsdk.operator.api.config.RetryConfiguration' is deprecated and marked for removal
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/config/FlinkOperatorConfiguration.java`
#### Snippet
```java
    Integer savepointHistoryCountThreshold;
    Duration savepointHistoryAgeThreshold;
    RetryConfiguration retryConfiguration;
    Boolean exceptionStackTraceEnabled;
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

### MarkedForRemoval
'fromConfiguration(io.javaoperatorsdk.operator.api.config.RetryConfiguration)' is deprecated and marked for removal
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/FlinkOperator.java`
#### Snippet
```java
        overrider.settingNamespaces(operatorConf.getWatchedNamespaces());

        overrider.withRetry(GenericRetry.fromConfiguration(operatorConf.getRetryConfiguration()));

        var labelSelector = operatorConf.getLabelSelector();
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
Method invocation `getLocation` may produce `NullPointerException`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/service/AbstractFlinkService.java`
#### Snippet
```java
            }

            if (response.get().resource().getLocation() == null) {
                if (response.get().resource().getFailureCause() != null) {
                    LOG.error(
```

### DataFlowIssue
Method invocation `getFailureCause` may produce `NullPointerException`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/service/AbstractFlinkService.java`
#### Snippet
```java

            if (response.get().resource().getLocation() == null) {
                if (response.get().resource().getFailureCause() != null) {
                    LOG.error(
                            "Failure occurred while fetching the savepoint result",
```

### DataFlowIssue
Method invocation `getFailureCause` may produce `NullPointerException`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/service/AbstractFlinkService.java`
#### Snippet
```java
                    LOG.error(
                            "Failure occurred while fetching the savepoint result",
                            response.get().resource().getFailureCause());
                    return SavepointFetchResult.error(
                            response.get().resource().getFailureCause().toString());
```

### DataFlowIssue
Method invocation `getFailureCause` may produce `NullPointerException`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/service/AbstractFlinkService.java`
#### Snippet
```java
                            response.get().resource().getFailureCause());
                    return SavepointFetchResult.error(
                            response.get().resource().getFailureCause().toString());
                } else {
                    return SavepointFetchResult.pending();
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/service/AbstractFlinkService.java`
#### Snippet
```java
                            response.get().resource().getFailureCause());
                    return SavepointFetchResult.error(
                            response.get().resource().getFailureCause().toString());
                } else {
                    return SavepointFetchResult.pending();
```

### DataFlowIssue
Method invocation `getLocation` may produce `NullPointerException`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/service/AbstractFlinkService.java`
#### Snippet
```java
                }
            }
            String location = response.get().resource().getLocation();
            LOG.info("Savepoint result: {}", location);
            return SavepointFetchResult.completed(location);
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

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/RestApiMetricsCollector.java`
#### Snippet
```java
                .collect(
                        Collectors.toMap(
                                e -> e.getKey(),
                                e ->
                                        queryAggregatedVertexMetrics(
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/ScalingMetricEvaluator.java`
#### Snippet
```java
        double[] metricValues =
                metricsHistory.values().stream()
                        .map(m -> m.getOutputRatios())
                        .filter(m -> m.containsKey(edge))
                        .mapToDouble(m -> m.get(edge))
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

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `flinkMetrics.keySet()` may be replaced with 'entrySet()' iteration
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/metrics/ScalingMetrics.java`
#### Snippet
```java

        var out = new HashMap<Edge, Double>();
        for (JobVertexID from : flinkMetrics.keySet()) {
            var outputs = topology.getOutputs().get(from);
            if (outputs.isEmpty()) {
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'runtimeInfo' in a Serializable class
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/health/HealthProbe.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(HealthProbe.class);

    @Getter private RuntimeInfo runtimeInfo;

    private InformerHealthSummary previousInformerHealthSummary;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'previousInformerHealthSummary' in a Serializable class
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/health/HealthProbe.java`
#### Snippet
```java
    @Getter private RuntimeInfo runtimeInfo;

    private InformerHealthSummary previousInformerHealthSummary;

    private final List<CanaryResourceManager<?>> canaryResourceManagers = new ArrayList<>();
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[\\t]` can be simplified to '\\t'
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/docs/CrdReferenceDoclet.java`
#### Snippet
```java

    private String cleanDoc(String doc) {
        return doc.replaceAll("[\\t]+", " ").replaceAll("[\\n\\r]+", "");
    }

```

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

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`curator.asCuratorFramework().getChildren().forPath("/").size() != 0` can be replaced with '!curator.asCuratorFramework().getChildren().forPath("/").isEmpty()'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/FlinkUtils.java`
#### Snippet
```java
        try (var curator = ZooKeeperUtils.startCuratorFramework(conf, exception -> {})) {
            if (curator.asCuratorFramework().checkExists().forPath("/") != null) {
                return curator.asCuratorFramework().getChildren().forPath("/").size() != 0;
            }
            return false;
```

### SizeReplaceableByIsEmpty
`matchedList.size() == 0` can be replaced with 'matchedList.isEmpty()'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/sessionjob/FlinkSessionJobObserver.java`
#### Snippet
```java
                            status.getJobId(), matchedList.size()));

            if (matchedList.size() == 0) {
                LOG.warn("No job found for JobID: {}", jobId);
                return Optional.empty();
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

## RuleId[id=NumberEquality]
### NumberEquality
Number objects are compared using `!=`, not 'equals()'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/service/StandaloneFlinkService.java`
#### Snippet
```java
        var desiredReplicas =
                conf.get(StandaloneKubernetesConfigOptionsInternal.KUBERNETES_TASKMANAGER_REPLICAS);
        if (actualReplicas != desiredReplicas) {
            LOG.info(
                    "Scaling TM replicas: actual({}) -> desired({})",
```

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

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends T`
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/utils/SpecUtils.java`
#### Snippet
```java
     */
    public static <T extends AbstractFlinkSpec> SpecWithMeta<T> deserializeSpecWithMeta(
            @Nullable String specWithMetaString, Class<T> specClass) {
        if (specWithMetaString == null) {
            return null;
```

### BoundedWildcard
Can generalize to `? extends JobVertexID`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/RestApiMetricsCollector.java`
#### Snippet
```java
            FlinkService flinkService,
            Configuration conf,
            Map<JobVertexID, Map<String, FlinkMetric>> filteredVertexMetricNames) {

        return filteredVertexMetricNames.entrySet().stream()
```

### BoundedWildcard
Can generalize to `? extends Map`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/RestApiMetricsCollector.java`
#### Snippet
```java
            FlinkService flinkService,
            Configuration conf,
            Map<JobVertexID, Map<String, FlinkMetric>> filteredVertexMetricNames) {

        return filteredVertexMetricNames.entrySet().stream()
```

### BoundedWildcard
Can generalize to `? extends T`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/ConfigOptionUtils.java`
#### Snippet
```java
     */
    public static <T extends Comparable<T>> T getValueWithThreshold(
            Configuration config, ConfigOption<T> configOption, T configThreshold) {
        T configValue = config.get(configOption);
        if (configThreshold != null && configValue.compareTo(configThreshold) > 0) {
```

### BoundedWildcard
Can generalize to `? super AggregatedMetric`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/metrics/MetricAggregator.java`
#### Snippet
```java
    private final Function<AggregatedMetric, Double> getter;

    MetricAggregator(Function<AggregatedMetric, Double> getter) {
        this.getter = getter;
    }
```

### BoundedWildcard
Can generalize to `? super Set`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/config/FlinkConfigManager.java`
#### Snippet
```java

    public FlinkConfigManager(
            Configuration defaultConfig, Consumer<Set<String>> namespaceListener) {
        this.namespaceListener = namespaceListener;
        Duration cacheTimeout =
```

### BoundedWildcard
Can generalize to `? extends FlinkResourceListener`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/StatusRecorder.java`
#### Snippet
```java
                    KubernetesClient kubernetesClient,
                    MetricManager<CR> metricManager,
                    Collection<FlinkResourceListener> listeners) {
        BiConsumer<CR, S> consumer =
                (resource, previousStatus) -> {
```

### BoundedWildcard
Can generalize to `? super CR`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/StatusRecorder.java`
#### Snippet
```java
    public StatusRecorder(
            KubernetesClient client,
            MetricManager<CR> metricManager,
            BiConsumer<CR, STATUS> statusUpdateListener) {
        this.client = client;
```

### BoundedWildcard
Can generalize to `? super CR`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/StatusRecorder.java`
#### Snippet
```java
            KubernetesClient client,
            MetricManager<CR> metricManager,
            BiConsumer<CR, STATUS> statusUpdateListener) {
        this.client = client;
        this.statusUpdateListener = statusUpdateListener;
```

### BoundedWildcard
Can generalize to `? super STATUS`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/StatusRecorder.java`
#### Snippet
```java
            KubernetesClient client,
            MetricManager<CR> metricManager,
            BiConsumer<CR, STATUS> statusUpdateListener) {
        this.client = client;
        this.statusUpdateListener = statusUpdateListener;
```

### BoundedWildcard
Can generalize to `? extends FlinkDeployment`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/ClusterHealthObserver.java`
#### Snippet
```java
     * @param ctx Resource context.
     */
    public void observe(FlinkResourceContext<FlinkDeployment> ctx) {
        var flinkApp = ctx.getResource();
        try {
```

### BoundedWildcard
Can generalize to `? extends FlinkResourceListener`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/EventRecorder.java`
#### Snippet
```java

    public static EventRecorder create(
            KubernetesClient client, Collection<FlinkResourceListener> listeners) {

        BiConsumer<AbstractFlinkResource<?, ?>, Event> biConsumer =
```

### BoundedWildcard
Can generalize to `? super Event`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/EventUtils.java`
#### Snippet
```java
            String message,
            EventRecorder.Component component,
            Consumer<Event> eventListener) {
        var eventName = generateEventName(target, type, reason, message, component);

```

### BoundedWildcard
Can generalize to `? super AbstractFlinkResource`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/EventRecorder.java`
#### Snippet
```java

    public EventRecorder(
            KubernetesClient client, BiConsumer<AbstractFlinkResource<?, ?>, Event> eventListener) {
        this.client = client;
        this.eventListener = eventListener;
```

### BoundedWildcard
Can generalize to `? super Event`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/EventRecorder.java`
#### Snippet
```java

    public EventRecorder(
            KubernetesClient client, BiConsumer<AbstractFlinkResource<?, ?>, Event> eventListener) {
        this.client = client;
        this.eventListener = eventListener;
```

### BoundedWildcard
Can generalize to `? super String`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/ClusterHealthEvaluator.java`
#### Snippet
```java

    public static void setLastValidClusterHealthInfo(
            Map<String, String> clusterInfo, ClusterHealthInfo clusterHealthInfo) {
        LOG.debug("Setting last valid health check info");
        clusterInfo.put(CLUSTER_INFO_KEY, ClusterHealthInfo.serialize(clusterHealthInfo));
```

### BoundedWildcard
Can generalize to `? super String`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/ClusterHealthEvaluator.java`
#### Snippet
```java

    public static void setLastValidClusterHealthInfo(
            Map<String, String> clusterInfo, ClusterHealthInfo clusterHealthInfo) {
        LOG.debug("Setting last valid health check info");
        clusterInfo.put(CLUSTER_INFO_KEY, ClusterHealthInfo.serialize(clusterHealthInfo));
```

### BoundedWildcard
Can generalize to `? extends AggregatedMetric`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/metrics/ScalingMetrics.java`
#### Snippet
```java

    private static double getNumRecordsInPerSecond(
            Map<FlinkMetric, AggregatedMetric> flinkMetrics,
            JobVertexID jobVertexID,
            boolean isSource) {
```

### BoundedWildcard
Can generalize to `? extends Map`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/metrics/ScalingMetrics.java`
#### Snippet
```java
    private static double computeEdgeOutPerSecond(
            JobTopology topology,
            Map<JobVertexID, Map<FlinkMetric, AggregatedMetric>> flinkMetrics,
            JobVertexID from,
            JobVertexID to) {
```

### BoundedWildcard
Can generalize to `? extends AggregatedMetric`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/metrics/ScalingMetrics.java`
#### Snippet
```java

    public static void computeLoadMetrics(
            Map<FlinkMetric, AggregatedMetric> flinkMetrics,
            Map<ScalingMetric, Double> scalingMetrics) {

```

### BoundedWildcard
Can generalize to `? super ScalingMetric`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/metrics/ScalingMetrics.java`
#### Snippet
```java
    public static void computeLoadMetrics(
            Map<FlinkMetric, AggregatedMetric> flinkMetrics,
            Map<ScalingMetric, Double> scalingMetrics) {

        var busyTime = flinkMetrics.get(FlinkMetric.BUSY_TIME_PER_SEC);
```

### BoundedWildcard
Can generalize to `? super Double`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/metrics/ScalingMetrics.java`
#### Snippet
```java
    public static void computeLoadMetrics(
            Map<FlinkMetric, AggregatedMetric> flinkMetrics,
            Map<ScalingMetric, Double> scalingMetrics) {

        var busyTime = flinkMetrics.get(FlinkMetric.BUSY_TIME_PER_SEC);
```

### BoundedWildcard
Can generalize to `? extends AggregatedMetric`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/metrics/ScalingMetrics.java`
#### Snippet
```java

    private static double getNumRecordsOutPerSecond(
            Map<FlinkMetric, AggregatedMetric> flinkMetrics, JobVertexID jobVertexID) {

        AggregatedMetric numRecordsOutPerSecond =
```

### BoundedWildcard
Can generalize to `? extends AggregatedMetric`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/metrics/ScalingMetrics.java`
#### Snippet
```java

    private static double getBusyTimeMsPerSecond(
            Map<FlinkMetric, AggregatedMetric> flinkMetrics,
            Configuration conf,
            JobVertexID jobVertexId) {
```

### BoundedWildcard
Can generalize to `? extends AggregatedMetric`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/metrics/ScalingMetrics.java`
#### Snippet
```java

    public static void computeLagMetrics(
            Map<FlinkMetric, AggregatedMetric> flinkMetrics,
            Map<ScalingMetric, Double> scalingMetrics) {
        var pendingRecords = flinkMetrics.get(FlinkMetric.PENDING_RECORDS);
```

### BoundedWildcard
Can generalize to `? super ScalingMetric`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/metrics/ScalingMetrics.java`
#### Snippet
```java
    public static void computeLagMetrics(
            Map<FlinkMetric, AggregatedMetric> flinkMetrics,
            Map<ScalingMetric, Double> scalingMetrics) {
        var pendingRecords = flinkMetrics.get(FlinkMetric.PENDING_RECORDS);
        if (pendingRecords != null) {
```

### BoundedWildcard
Can generalize to `? super Double`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/metrics/ScalingMetrics.java`
#### Snippet
```java
    public static void computeLagMetrics(
            Map<FlinkMetric, AggregatedMetric> flinkMetrics,
            Map<ScalingMetric, Double> scalingMetrics) {
        var pendingRecords = flinkMetrics.get(FlinkMetric.PENDING_RECORDS);
        if (pendingRecords != null) {
```

### BoundedWildcard
Can generalize to `? super ScalingMetric`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/metrics/ScalingMetrics.java`
#### Snippet
```java
            JobVertexID jobVertexID,
            Map<FlinkMetric, AggregatedMetric> flinkMetrics,
            Map<ScalingMetric, Double> scalingMetrics,
            JobTopology topology,
            double lagGrowthRate,
```

### BoundedWildcard
Can generalize to `? super Double`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/metrics/ScalingMetrics.java`
#### Snippet
```java
            JobVertexID jobVertexID,
            Map<FlinkMetric, AggregatedMetric> flinkMetrics,
            Map<ScalingMetric, Double> scalingMetrics,
            JobTopology topology,
            double lagGrowthRate,
```

### BoundedWildcard
Can generalize to `? extends FlinkDeployment`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/deployment/AbstractFlinkDeploymentObserver.java`
#### Snippet
```java
    @Override
    protected void updateStatusToDeployedIfAlreadyUpgraded(
            FlinkResourceContext<FlinkDeployment> ctx) {
        var flinkDep = ctx.getResource();
        var status = flinkDep.getStatus();
```

### BoundedWildcard
Can generalize to `? extends FlinkDeployment`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/deployment/AbstractFlinkDeploymentObserver.java`
#### Snippet
```java
    }

    private void observeClusterInfo(FlinkResourceContext<FlinkDeployment> ctx) {
        var flinkApp = ctx.getResource();
        try {
```

### BoundedWildcard
Can generalize to `? extends FlinkDeployment`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/deployment/AbstractFlinkDeploymentObserver.java`
#### Snippet
```java
    }

    private void checkContainerBackoff(FlinkResourceContext<FlinkDeployment> ctx) {
        PodList jmPods =
                ctx.getFlinkService().getJmPodList(ctx.getResource(), ctx.getObserveConfig());
```

### BoundedWildcard
Can generalize to `? extends AggregatedMetric`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/metrics/FlinkMetric.java`
#### Snippet
```java
    public final Predicate<String> predicate;

    public Optional<String> findAny(Collection<AggregatedMetric> metrics) {
        return metrics.stream().map(AggregatedMetric::getId).filter(predicate).findAny();
    }
```

### BoundedWildcard
Can generalize to `? extends JobVertexID`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/ScalingExecutor.java`
#### Snippet
```java
    private void setVertexParallelismOverrides(
            AbstractFlinkResource<?, ?> resource,
            Map<JobVertexID, Map<ScalingMetric, EvaluatedScalingMetric>> evaluatedMetrics,
            Map<JobVertexID, ScalingSummary> summaries) {
        var flinkConf = Configuration.fromMap(resource.getSpec().getFlinkConfiguration());
```

### BoundedWildcard
Can generalize to `? extends Map`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/ScalingExecutor.java`
#### Snippet
```java
    private void setVertexParallelismOverrides(
            AbstractFlinkResource<?, ?> resource,
            Map<JobVertexID, Map<ScalingMetric, EvaluatedScalingMetric>> evaluatedMetrics,
            Map<JobVertexID, ScalingSummary> summaries) {
        var flinkConf = Configuration.fromMap(resource.getSpec().getFlinkConfiguration());
```

### BoundedWildcard
Can generalize to `? extends ScalingSummary`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/ScalingExecutor.java`
#### Snippet
```java
            AbstractFlinkResource<?, ?> resource,
            Map<JobVertexID, Map<ScalingMetric, EvaluatedScalingMetric>> evaluatedMetrics,
            Map<JobVertexID, ScalingSummary> summaries) {
        var flinkConf = Configuration.fromMap(resource.getSpec().getFlinkConfiguration());
        var overrides = new HashMap<String, String>();
```

### BoundedWildcard
Can generalize to `? extends Map`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/ScalingExecutor.java`
#### Snippet
```java

    protected static boolean allVerticesWithinUtilizationTarget(
            Map<JobVertexID, Map<ScalingMetric, EvaluatedScalingMetric>> evaluatedMetrics,
            Map<JobVertexID, ScalingSummary> scalingSummaries) {

```

### BoundedWildcard
Can generalize to `? extends JobVertexID`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/ScalingExecutor.java`
#### Snippet
```java
            AbstractFlinkResource<?, ?> resource,
            Configuration conf,
            Map<JobVertexID, Map<ScalingMetric, EvaluatedScalingMetric>> evaluatedMetrics,
            Map<JobVertexID, SortedMap<Instant, ScalingSummary>> scalingHistory) {

```

### BoundedWildcard
Can generalize to `? extends Map`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/ScalingExecutor.java`
#### Snippet
```java
            AbstractFlinkResource<?, ?> resource,
            Configuration conf,
            Map<JobVertexID, Map<ScalingMetric, EvaluatedScalingMetric>> evaluatedMetrics,
            Map<JobVertexID, SortedMap<Instant, ScalingSummary>> scalingHistory) {

```

### BoundedWildcard
Can generalize to `? extends ScalingSummary`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/ScalingExecutor.java`
#### Snippet
```java

    private static String scalingReport(
            Map<JobVertexID, ScalingSummary> scalingSummaries, boolean scalingEnabled) {
        StringBuilder sb =
                new StringBuilder(
```

### BoundedWildcard
Can generalize to `? extends SPEC`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/AbstractFlinkResourceReconciler.java`
#### Snippet
```java
     */
    private boolean shouldRollBack(
            AbstractFlinkResource<SPEC, STATUS> resource,
            Configuration configuration,
            FlinkService flinkService) {
```

### BoundedWildcard
Can generalize to `? extends CollectedMetrics`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/ScalingMetricEvaluator.java`
#### Snippet
```java

    private static double getAverageOutputRatio(
            Edge edge, SortedMap<Instant, CollectedMetrics> metricsHistory) {
        double[] metricValues =
                metricsHistory.values().stream()
```

### BoundedWildcard
Can generalize to `? extends CollectedMetrics`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/ScalingMetricEvaluator.java`
#### Snippet
```java
            ScalingMetric metric,
            JobVertexID jobVertexId,
            SortedMap<Instant, CollectedMetrics> metricsHistory) {
        double[] metricValues =
                metricsHistory.values().stream()
```

### BoundedWildcard
Can generalize to `? extends Map`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/ScalingMetricEvaluator.java`
#### Snippet
```java
            JobVertexID vertex,
            Configuration conf,
            HashMap<JobVertexID, Map<ScalingMetric, EvaluatedScalingMetric>> alreadyEvaluated,
            SortedMap<Instant, CollectedMetrics> metricsHistory,
            Map<ScalingMetric, Double> latestVertexMetrics,
```

### BoundedWildcard
Can generalize to `? super ScalingMetric`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/ScalingMetricEvaluator.java`
#### Snippet
```java
            SortedMap<Instant, CollectedMetrics> metricsHistory,
            Map<ScalingMetric, Double> latestVertexMetrics,
            Map<ScalingMetric, EvaluatedScalingMetric> out) {

        if (topology.isSource(vertex)) {
```

### BoundedWildcard
Can generalize to `? super EvaluatedScalingMetric`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/ScalingMetricEvaluator.java`
#### Snippet
```java
            SortedMap<Instant, CollectedMetrics> metricsHistory,
            Map<ScalingMetric, Double> latestVertexMetrics,
            Map<ScalingMetric, EvaluatedScalingMetric> out) {

        if (topology.isSource(vertex)) {
```

### BoundedWildcard
Can generalize to `? extends FlinkDeployment`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/sessionjob/SessionJobReconciler.java`
#### Snippet
```java
    }

    public static boolean sessionClusterReady(Optional<FlinkDeployment> flinkDeploymentOpt) {
        if (flinkDeploymentOpt.isPresent()) {
            var flinkdep = flinkDeploymentOpt.get();
```

### BoundedWildcard
Can generalize to `? extends FlinkSessionJob`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/sessionjob/SessionJobReconciler.java`
#### Snippet
```java

    @Override
    protected void cancelJob(FlinkResourceContext<FlinkSessionJob> ctx, UpgradeMode upgradeMode)
            throws Exception {
        ctx.getFlinkService()
```

### BoundedWildcard
Can generalize to `? extends FlinkDeployment`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/SessionReconciler.java`
#### Snippet
```java
    @Override
    public void deploy(
            FlinkResourceContext<FlinkDeployment> ctx,
            FlinkDeploymentSpec spec,
            Configuration deployConfig,
```

### BoundedWildcard
Can generalize to `? extends FlinkDeployment`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/SessionReconciler.java`
#### Snippet
```java

    @Override
    public DeleteControl cleanupInternal(FlinkResourceContext<FlinkDeployment> ctx) {
        Set<FlinkSessionJob> sessionJobs =
                ctx.getJosdkContext().getSecondaryResources(FlinkSessionJob.class);
```

### BoundedWildcard
Can generalize to `? extends FlinkDeployment`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/SessionReconciler.java`
#### Snippet
```java
    }

    private void deleteSessionCluster(FlinkResourceContext<FlinkDeployment> ctx) {
        var deployment = ctx.getResource();
        var conf = ctx.getDeployConfig(ctx.getResource().getSpec());
```

### BoundedWildcard
Can generalize to `? extends FlinkDeployment`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/SessionReconciler.java`
#### Snippet
```java
    }

    private void recoverSession(FlinkResourceContext<FlinkDeployment> ctx) throws Exception {
        ctx.getFlinkService().submitSessionCluster(ctx.getObserveConfig());
        ctx.getResource()
```

### BoundedWildcard
Can generalize to `? extends FlinkDeployment`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/ApplicationReconciler.java`
#### Snippet
```java
    @Override
    protected AvailableUpgradeMode getAvailableUpgradeMode(
            FlinkResourceContext<FlinkDeployment> ctx, Configuration deployConfig)
            throws Exception {

```

### BoundedWildcard
Can generalize to `? extends FlinkDeployment`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/ApplicationReconciler.java`
#### Snippet
```java

    @Override
    protected void cancelJob(FlinkResourceContext<FlinkDeployment> ctx, UpgradeMode upgradeMode)
            throws Exception {
        ctx.getFlinkService().cancelJob(ctx.getResource(), upgradeMode, ctx.getObserveConfig());
```

### BoundedWildcard
Can generalize to `? extends FlinkDeployment`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/ApplicationReconciler.java`
#### Snippet
```java
    @Override
    @SneakyThrows
    protected DeleteControl cleanupInternal(FlinkResourceContext<FlinkDeployment> ctx) {
        var deployment = ctx.getResource();
        var status = deployment.getStatus();
```

### BoundedWildcard
Can generalize to `? extends FlinkDeployment`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/ApplicationReconciler.java`
#### Snippet
```java

    @Override
    protected void cleanupAfterFailedJob(FlinkResourceContext<FlinkDeployment> ctx) {
        // The job has already stopped. Delete the deployment and we are ready.
        var flinkService = ctx.getFlinkService();
```

### BoundedWildcard
Can generalize to `? extends FlinkDeployment`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/ApplicationReconciler.java`
#### Snippet
```java
    @Override
    public void deploy(
            FlinkResourceContext<FlinkDeployment> ctx,
            FlinkDeploymentSpec spec,
            Configuration deployConfig,
```

### BoundedWildcard
Can generalize to `? extends FlinkResourceValidator`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/controller/FlinkDeploymentController.java`
#### Snippet
```java
    public FlinkDeploymentController(
            FlinkConfigManager configManager,
            Set<FlinkResourceValidator> validators,
            FlinkResourceContextFactory ctxFactory,
            ReconcilerFactory reconcilerFactory,
```

### BoundedWildcard
Can generalize to `? super FlinkDeployment`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/controller/FlinkDeploymentController.java`
#### Snippet
```java
            StatusRecorder<FlinkDeployment, FlinkDeploymentStatus> statusRecorder,
            EventRecorder eventRecorder,
            CanaryResourceManager<FlinkDeployment> canaryResourceManager) {
        this.configManager = configManager;
        this.validators = validators;
```

### BoundedWildcard
Can generalize to `? extends JobStatusMessage`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/deployment/ApplicationObserver.java`
#### Snippet
```java
        @Override
        protected Optional<JobStatusMessage> filterTargetJob(
                JobStatus status, List<JobStatusMessage> clusterJobStatuses) {
            if (!clusterJobStatuses.isEmpty()) {
                clusterJobStatuses.sort(
```

### BoundedWildcard
Can generalize to `? super Class`
in `flink-kubernetes-docs/src/main/java/org/apache/flink/kubernetes/operator/docs/configuration/ConfigOptionsDocGenerator.java`
#### Snippet
```java
            String packageName,
            String pathPrefix,
            ThrowingConsumer<Class<?>, IOException> classConsumer)
            throws IOException, ClassNotFoundException {
        Path configDir = Paths.get(rootDir, module, pathPrefix, packageName.replaceAll("\\.", "/"));
```

### BoundedWildcard
Can generalize to `? extends IOException`
in `flink-kubernetes-docs/src/main/java/org/apache/flink/kubernetes/operator/docs/configuration/ConfigOptionsDocGenerator.java`
#### Snippet
```java
            String packageName,
            String pathPrefix,
            ThrowingConsumer<Class<?>, IOException> classConsumer)
            throws IOException, ClassNotFoundException {
        Path configDir = Paths.get(rootDir, module, pathPrefix, packageName.replaceAll("\\.", "/"));
```

### BoundedWildcard
Can generalize to `? extends OptionWithMetaInfo`
in `flink-kubernetes-docs/src/main/java/org/apache/flink/kubernetes/operator/docs/configuration/ConfigOptionsDocGenerator.java`
#### Snippet
```java
        private final Node root = new Node();

        Tree(ConfigGroup[] groups, Collection<OptionWithMetaInfo> options) {
            // generate a tree based on all key prefixes
            for (ConfigGroup group : groups) {
```

### BoundedWildcard
Can generalize to `? extends OptionWithMetaInfo`
in `flink-kubernetes-docs/src/main/java/org/apache/flink/kubernetes/operator/docs/configuration/ConfigOptionsDocGenerator.java`
#### Snippet
```java
     * @return string containing HTML formatted table
     */
    private static String toHtmlTable(final List<OptionWithMetaInfo> options) {
        StringBuilder htmlTable = new StringBuilder();
        htmlTable.append("<table class=\"configuration table table-bordered\">\n");
```

### BoundedWildcard
Can generalize to `? extends OptionWithMetaInfo`
in `flink-kubernetes-docs/src/main/java/org/apache/flink/kubernetes/operator/docs/configuration/ConfigOptionsDocGenerator.java`
#### Snippet
```java
    }

    private static void sortOptions(List<OptionWithMetaInfo> configOptions) {
        configOptions.sort(Comparator.comparing(option -> option.option.key()));
    }
```

### BoundedWildcard
Can generalize to `? extends RetryInfo`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/ReconciliationUtils.java`
#### Snippet
```java
            ErrorStatusUpdateControl<R> toErrorStatusUpdateControl(
                    R resource,
                    Optional<RetryInfo> retryInfo,
                    Exception e,
                    StatusRecorder<R, STATUS> statusRecorder,
```

### BoundedWildcard
Can generalize to `? super R`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/ReconciliationUtils.java`
#### Snippet
```java
                    Optional<RetryInfo> retryInfo,
                    Exception e,
                    StatusRecorder<R, STATUS> statusRecorder,
                    FlinkOperatorConfiguration operatorConfiguration) {

```

### BoundedWildcard
Can generalize to `? extends FlinkDeployment`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/validation/DefaultValidator.java`
#### Snippet
```java
    @Override
    public Optional<String> validateSessionJob(
            FlinkSessionJob sessionJob, Optional<FlinkDeployment> sessionOpt) {

        if (sessionOpt.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends FlinkResourceValidator`
in `flink-kubernetes-webhook/src/main/java/org/apache/flink/kubernetes/operator/admission/FlinkValidator.java`
#### Snippet
```java
    private final InformerManager informerManager;

    public FlinkValidator(Set<FlinkResourceValidator> validators, InformerManager informerManager) {
        this.validators = validators;
        this.informerManager = informerManager;
```

### BoundedWildcard
Can generalize to `? extends FlinkResourceValidator`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/controller/FlinkSessionJobController.java`
#### Snippet
```java
    public FlinkSessionJobController(
            FlinkConfigManager configManager,
            Set<FlinkResourceValidator> validators,
            FlinkResourceContextFactory ctxFactory,
            Reconciler<FlinkSessionJob> reconciler,
```

### BoundedWildcard
Can generalize to `? super FlinkSessionJob`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/controller/FlinkSessionJobController.java`
#### Snippet
```java
            StatusRecorder<FlinkSessionJob, FlinkSessionJobStatus> statusRecorder,
            EventRecorder eventRecorder,
            CanaryResourceManager<FlinkSessionJob> canaryResourceManager) {
        this.configManager = configManager;
        this.validators = validators;
```

### BoundedWildcard
Can generalize to `? extends HasMetadata`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/IngressUtils.java`
#### Snippet
```java
    }

    private static void setOwnerReference(HasMetadata owner, List<HasMetadata> resources) {
        final OwnerReference ownerReference =
                new OwnerReferenceBuilder()
```

### BoundedWildcard
Can generalize to `? extends EvaluatedScalingMetric`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/utils/AutoScalerUtils.java`
#### Snippet
```java

    public static double getTargetProcessingCapacity(
            Map<ScalingMetric, EvaluatedScalingMetric> evaluatedMetrics,
            Configuration conf,
            double targetUtilization,
```

### BoundedWildcard
Can generalize to `? extends JobStatusMessage`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/sessionjob/FlinkSessionJobObserver.java`
#### Snippet
```java
        @Override
        protected Optional<JobStatusMessage> filterTargetJob(
                JobStatus status, List<JobStatusMessage> clusterJobStatuses) {
            var jobId =
                    Preconditions.checkNotNull(
```

### BoundedWildcard
Can generalize to `? extends JobVertexID`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/AutoScalerInfo.java`
#### Snippet
```java
    @SneakyThrows
    public void addToScalingHistory(
            Instant now, Map<JobVertexID, ScalingSummary> summaries, Configuration conf) {
        // Make sure to init history
        getScalingHistory();
```

### BoundedWildcard
Can generalize to `? extends ScalingSummary`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/AutoScalerInfo.java`
#### Snippet
```java
    @SneakyThrows
    public void addToScalingHistory(
            Instant now, Map<JobVertexID, ScalingSummary> summaries, Configuration conf) {
        // Make sure to init history
        getScalingHistory();
```

### BoundedWildcard
Can generalize to `? extends EvaluatedScalingMetric`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/JobVertexScaler.java`
#### Snippet
```java
            JobVertexID vertex,
            Configuration conf,
            Map<ScalingMetric, EvaluatedScalingMetric> evaluatedMetrics,
            ScalingSummary lastSummary) {

```

### BoundedWildcard
Can generalize to `? extends ScalingSummary`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/JobVertexScaler.java`
#### Snippet
```java
            Configuration conf,
            Map<ScalingMetric, EvaluatedScalingMetric> evaluatedMetrics,
            SortedMap<Instant, ScalingSummary> history,
            int currentParallelism,
            int newParallelism) {
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `private static @Nullable`
in `flink-kubernetes-docs/src/main/java/org/apache/flink/kubernetes/operator/docs/configuration/ConfigOptionsDocGenerator.java`
#### Snippet
```java
     * enum-based, and {@code null} otherwise.
     */
    private static @Nullable Description getEnumOptionsDescription(
            OptionWithMetaInfo optionWithMetaInfo) {
        Class<?> clazz = getClazz(optionWithMetaInfo.option);
```

## RuleId[id=NullableProblems]
### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `flink-kubernetes-operator/src/main/java/org/apache/flink/runtime/rest/messages/job/savepoints/stop/StopWithSavepointRequestBody.java`
#### Snippet
```java

    @JsonIgnore
    public SavepointFormatType getFormatType() {
        return formatType;
    }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `flink-kubernetes-operator/src/main/java/org/apache/flink/runtime/rest/messages/job/savepoints/SavepointTriggerRequestBody.java`
#### Snippet
```java

    @JsonIgnore
    public SavepointFormatType getFormatType() {
        return formatType;
    }
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/diff/DiffResult.java`
#### Snippet
```java
        }
        sb.append(fieldName).append(extraPath).append(" : ");
        if ((afterNode.isNull() || afterNode.isMissingNode()) && beforeNode.asText().equals("")) {
            sb.append("{..}");
        } else {
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/diff/DiffResult.java`
#### Snippet
```java
        }
        String text = node.asText();
        return text.equals("") ? node.toString() : text;
    }
}
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
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
`Optional` used as type for parameter 'flinkDeploymentOpt'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/sessionjob/SessionJobReconciler.java`
#### Snippet
```java
    }

    public static boolean sessionClusterReady(Optional<FlinkDeployment> flinkDeploymentOpt) {
        if (flinkDeploymentOpt.isPresent()) {
            var flinkdep = flinkDeploymentOpt.get();
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
`Optional` used as type for parameter 'session'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/validation/FlinkResourceValidator.java`
#### Snippet
```java
     */
    Optional<String> validateSessionJob(
            FlinkSessionJob sessionJob, Optional<FlinkDeployment> session);
}

```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/validation/CrdCompatibilityChecker.java`
#### Snippet
```java
            checkObjectCompatibility("", getSchema(oldSchema), getSchema(actualSchema));
        }
        System.out.println("Successful validation!");
    }

```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Option` is the same as one of its superclass' names
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/docs/CrdReferenceDoclet.java`
#### Snippet
```java
    }

    private abstract class Option implements Doclet.Option {
        private final String name;
        private final boolean hasArg;
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/docs/CrdReferenceDoclet.java`
#### Snippet
```java

    private String cleanDoc(String doc) {
        return doc.replaceAll("[\\t]+", " ").replaceAll("[\\n\\r]+", "");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/docs/CrdReferenceDoclet.java`
#### Snippet
```java

    private String cleanDoc(String doc) {
        return doc.replaceAll("[\\t]+", " ").replaceAll("[\\n\\r]+", "");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/metrics/OperatorMetricUtils.java`
#### Snippet
```java
                            if (key.startsWith(OPERATOR_METRICS_PREFIX)) {
                                metricConf.put(
                                        key.replaceFirst(OPERATOR_METRICS_PREFIX, METRICS_PREFIX),
                                        value);
                            } else if (!key.startsWith(METRICS_PREFIX)) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `flink-kubernetes-docs/src/main/java/org/apache/flink/kubernetes/operator/docs/util/Utils.java`
#### Snippet
```java

    public static String escapeCharacters(String value) {
        return value.replaceAll("<wbr>", TEMPORARY_PLACEHOLDER)
                .replaceAll("<", "&lt;")
                .replaceAll(">", "&gt;")
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `flink-kubernetes-docs/src/main/java/org/apache/flink/kubernetes/operator/docs/util/Utils.java`
#### Snippet
```java
    public static String escapeCharacters(String value) {
        return value.replaceAll("<wbr>", TEMPORARY_PLACEHOLDER)
                .replaceAll("<", "&lt;")
                .replaceAll(">", "&gt;")
                .replaceAll(TEMPORARY_PLACEHOLDER, "<wbr>");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `flink-kubernetes-docs/src/main/java/org/apache/flink/kubernetes/operator/docs/util/Utils.java`
#### Snippet
```java
        return value.replaceAll("<wbr>", TEMPORARY_PLACEHOLDER)
                .replaceAll("<", "&lt;")
                .replaceAll(">", "&gt;")
                .replaceAll(TEMPORARY_PLACEHOLDER, "<wbr>");
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `flink-kubernetes-docs/src/main/java/org/apache/flink/kubernetes/operator/docs/util/Utils.java`
#### Snippet
```java
                .replaceAll("<", "&lt;")
                .replaceAll(">", "&gt;")
                .replaceAll(TEMPORARY_PLACEHOLDER, "<wbr>");
    }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `flink-kubernetes-docs/src/main/java/org/apache/flink/kubernetes/operator/docs/configuration/ConfigOptionsDocGenerator.java`
#### Snippet
```java
            ThrowingConsumer<Class<?>, IOException> classConsumer)
            throws IOException, ClassNotFoundException {
        Path configDir = Paths.get(rootDir, module, pathPrefix, packageName.replaceAll("\\.", "/"));
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(configDir)) {
            for (Path entry : stream) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `flink-kubernetes-docs/src/main/java/org/apache/flink/kubernetes/operator/docs/configuration/ConfigOptionsDocGenerator.java`
#### Snippet
```java
    @VisibleForTesting
    static String toSnakeCase(String name) {
        return name.replaceAll("(.)([A-Z][a-z])", "$1_$2").toLowerCase();
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/diff/DiffResult.java`
#### Snippet
```java
        String extraPath = "";
        if (!diff.get("path").asText().equals("/")) {
            extraPath = diff.get("path").asText().replaceAll("/", ".");
            beforeNode = beforeNode.at(diff.get("path").asText());
            afterNode = afterNode.at(diff.get("path").asText());
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `examples/flink-sql-runner-example/src/main/java/org/apache/flink/examples/SqlRunner.java`
#### Snippet
```java

    public static List<String> parseStatements(String script) {
        var formatted = formatSqlFile(script).replaceAll(COMMENT_PATTERN, "");
        var statements = new ArrayList<String>();

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/config/FlinkOperatorConfiguration.java`
#### Snippet
```java
                                                    KubernetesOperatorConfigOptions
                                                            .OPERATOR_WATCHED_NAMESPACES)
                                            .split(NAMESPACES_SPLITTER_KEY)));
        } else {
            watchedNamespaces =
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/config/FlinkOperatorConfiguration.java`
#### Snippet
```java
                                    EnvUtils.get(ENV_WATCH_NAMESPACES)
                                            .get()
                                            .split(NAMESPACES_SPLITTER_KEY)));
        }

```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.flink.core.fs` is unnecessary, and can be replaced with an import
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/artifact/FileSystemBasedArtifactFetcher.java`
#### Snippet
```java
    public File fetch(String uri, Configuration flinkConfiguration, File targetDir)
            throws Exception {
        org.apache.flink.core.fs.Path source = new org.apache.flink.core.fs.Path(uri);
        var start = System.currentTimeMillis();
        FileSystem fileSystem = source.getFileSystem();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.flink.core.fs` is unnecessary, and can be replaced with an import
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/artifact/FileSystemBasedArtifactFetcher.java`
#### Snippet
```java
    public File fetch(String uri, Configuration flinkConfiguration, File targetDir)
            throws Exception {
        org.apache.flink.core.fs.Path source = new org.apache.flink.core.fs.Path(uri);
        var start = System.currentTimeMillis();
        FileSystem fileSystem = source.getFileSystem();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.flink.kubernetes.kubeclient` is unnecessary and can be removed
in `flink-kubernetes-standalone/src/main/java/org/apache/flink/kubernetes/operator/kubeclient/decorators/InitStandaloneTaskManagerDecorator.java`
#### Snippet
```java

/**
 * An initializer for the TaskManager {@link org.apache.flink.kubernetes.kubeclient.FlinkPod} in
 * standalone mode.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.flink.api.common` is unnecessary and can be removed
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/deployment/AbstractFlinkDeploymentObserver.java`
#### Snippet
```java
                            status.getJobStatus()
                                    .setState(
                                            org.apache.flink.api.common.JobStatus.RECONCILING
                                                    .name());
                        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.flink.core.execution` is unnecessary and can be removed
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/SavepointUtils.java`
#### Snippet
```java

    public static SavepointFormatType getSavepointFormatType(Configuration configuration) {
        var savepointFormatType = org.apache.flink.core.execution.SavepointFormatType.CANONICAL;
        if (configuration.get(FLINK_VERSION) != null
                && configuration.get(FLINK_VERSION).isNewerVersionThan(FlinkVersion.v1_14)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.flink.api.common` is unnecessary, and can be replaced with an import
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/sessionjob/SessionJobReconciler.java`
#### Snippet
```java
        var status = ctx.getResource().getStatus();
        status.getJobStatus().setJobId(jobID.toHexString());
        status.getJobStatus().setState(org.apache.flink.api.common.JobStatus.RECONCILING.name());
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.flink.api.common` is unnecessary and can be removed
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/ApplicationReconciler.java`
#### Snippet
```java
                MSG_SUBMIT);
        flinkService.submitApplicationCluster(spec.getJob(), deployConfig, requireHaMetadata);
        status.getJobStatus().setState(org.apache.flink.api.common.JobStatus.RECONCILING.name());
        status.setJobManagerDeploymentStatus(JobManagerDeploymentStatus.DEPLOYING);

```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/controller/FlinkResourceContext.java`
#### Snippet
```java
            return observeConfig;
        }
        return observeConfig = createObserveConfig();
    }

```

### NestedAssignment
Result of assignment expression used
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/controller/FlinkSessionJobContext.java`
#### Snippet
```java
        }
        var session = getJosdkContext().getSecondaryResource(FlinkDeployment.class);
        return flinkService =
                sessionClusterReady(session)
                        ? flinkResourceContextFactory
                                .getResourceContext(session.get(), getJosdkContext())
                                .getFlinkService()
                        : null;
    }

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

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractFlinkResourceObserver()` of an abstract class should not be declared 'public'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/AbstractFlinkResourceObserver.java`
#### Snippet
```java
    protected final EventRecorder eventRecorder;

    public AbstractFlinkResourceObserver(
            FlinkConfigManager configManager, EventRecorder eventRecorder) {
        this.configManager = configManager;
```

### NonProtectedConstructorInAbstractClass
Constructor `JobStatusObserver()` of an abstract class should not be declared 'public'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/JobStatusObserver.java`
#### Snippet
```java
    protected final FlinkConfigManager configManager;

    public JobStatusObserver(FlinkConfigManager configManager, EventRecorder eventRecorder) {
        this.eventRecorder = eventRecorder;
        this.configManager = configManager;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractFlinkDeploymentObserver()` of an abstract class should not be declared 'public'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/deployment/AbstractFlinkDeploymentObserver.java`
#### Snippet
```java
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    public AbstractFlinkDeploymentObserver(
            FlinkConfigManager configManager, EventRecorder eventRecorder) {
        super(configManager, eventRecorder);
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractFlinkResourceReconciler()` of an abstract class should not be declared 'public'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/AbstractFlinkResourceReconciler.java`
#### Snippet
```java
    protected Clock clock = Clock.systemDefaultZone();

    public AbstractFlinkResourceReconciler(
            KubernetesClient kubernetesClient,
            EventRecorder eventRecorder,
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractJobReconciler()` of an abstract class should not be declared 'public'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/AbstractJobReconciler.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(AbstractJobReconciler.class);

    public AbstractJobReconciler(
            KubernetesClient kubernetesClient,
            EventRecorder eventRecorder,
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractFlinkService()` of an abstract class should not be declared 'public'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/service/AbstractFlinkService.java`
#### Snippet
```java
    private final String emptyJar;

    public AbstractFlinkService(
            KubernetesClient kubernetesClient, FlinkConfigManager configManager) {
        this.kubernetesClient = kubernetesClient;
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `transitionMetrics` is accessed in both synchronized and unsynchronized contexts
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/metrics/lifecycle/LifecycleMetrics.java`
#### Snippet
```java
    private final boolean namespaceHistosEnabled;

    private Map<String, Tuple2<Histogram, Map<String, Histogram>>> transitionMetrics;
    private Map<ResourceLifecycleState, Tuple2<Histogram, Map<String, Histogram>>> stateTimeMetrics;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `stateTimeMetrics` is accessed in both synchronized and unsynchronized contexts
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/metrics/lifecycle/LifecycleMetrics.java`
#### Snippet
```java

    private Map<String, Tuple2<Histogram, Map<String, Histogram>>> transitionMetrics;
    private Map<ResourceLifecycleState, Tuple2<Histogram, Map<String, Histogram>>> stateTimeMetrics;

    private Function<MetricGroup, MetricGroup> metricGroupFunction = mg -> mg.addGroup("Lifecycle");
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/health/OperatorHealthService.java`
#### Snippet
```java
    private final HealthProbe probe = HealthProbe.INSTANCE;
    private final FlinkConfigManager configManager;
    private HttpBootstrap httpBootstrap = null;

    public OperatorHealthService(FlinkConfigManager configManager) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/status/TaskManagerInfo.java`
#### Snippet
```java

    /** Number of TaskManager replicas if defined in the spec. */
    @StatusReplicas private int replicas = 0;
}

```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/status/SavepointInfo.java`
#### Snippet
```java

    /** Trigger timestamp of last periodic savepoint operation. */
    private long lastPeriodicSavepointTimestamp = 0L;

    public void setTrigger(
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `flink-kubernetes-docs/src/main/java/org/apache/flink/kubernetes/operator/docs/configuration/ConfigOptionsDocGenerator.java`
#### Snippet
```java
            private final List<OptionWithMetaInfo> configOptions = new ArrayList<>(8);
            private final Map<String, Node> children = new HashMap<>(8);
            private boolean isGroupRoot = false;

            private Node addChild(String keyComponent) {
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `url`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/IngressUtils.java`
#### Snippet
```java
        Preconditions.checkNotNull(url);
        if (!URL_PROTOCOL_REGEX.matcher(url).find()) {
            url = "http://" + url;
        }
        return url;
```

### AssignmentToMethodParameter
Assignment to method parameter `targetUtilization`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/utils/AutoScalerUtils.java`
#### Snippet
```java
        double restartTimeSec = conf.get(AutoScalerOptions.RESTART_TIME).toSeconds();

        targetUtilization = Math.max(0., targetUtilization);
        targetUtilization = Math.min(1., targetUtilization);

```

### AssignmentToMethodParameter
Assignment to method parameter `targetUtilization`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/utils/AutoScalerUtils.java`
#### Snippet
```java

        targetUtilization = Math.max(0., targetUtilization);
        targetUtilization = Math.min(1., targetUtilization);

        double avgInputTargetRate = evaluatedMetrics.get(TARGET_DATA_RATE).getAverage();
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `Namespaced`
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/FlinkSessionJob.java`
#### Snippet
```java
public class FlinkSessionJob
        extends AbstractFlinkResource<FlinkSessionJobSpec, FlinkSessionJobStatus>
        implements Namespaced {

    @Override
```

### RedundantImplements
Redundant interface declaration `Namespaced`
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/FlinkDeployment.java`
#### Snippet
```java
public class FlinkDeployment
        extends AbstractFlinkResource<FlinkDeploymentSpec, FlinkDeploymentStatus>
        implements Namespaced {

    @VisibleForTesting
```

## RuleId[id=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `CompatibilityError` does not end with 'Exception'
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/validation/CrdCompatibilityChecker.java`
#### Snippet
```java

    /** Compatibility Error class. */
    public static class CompatibilityError extends RuntimeException {
        public CompatibilityError(String msg) {
            super(msg);
```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/JobStatusObserver.java`
#### Snippet
```java
            LOG.warn("Exception while listing jobs", e);
            ifRunningMoveToReconciling(jobStatus, previousJobStatus);
            if (e instanceof TimeoutException) {
                onTimeout(ctx);
            }
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/deployment/SessionObserver.java`
#### Snippet
```java
        } catch (Exception e) {
            logger.error("REST service in session cluster timed out", e);
            if (e instanceof TimeoutException) {
                // check for problems with the underlying deployment
                observeJmDeployment(ctx);
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/FlinkResourceExceptionUtils.java`
#### Snippet
```java
                    .getStatus()
                    .setError(
                            (e instanceof ReconciliationException)
                                    ? e.getCause().toString()
                                    : e.toString());
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `docs/layouts/_default/baseof.html`
#### Snippet
```java
-->
<!DOCTYPE html>
<html lang="{{ .Site.Language.Lang }}" dir={{ .Site.Language.LanguageDirection }}>

<head>
```

### HtmlWrongAttributeValue
Wrong attribute value
in `docs/layouts/_default/baseof.html`
#### Snippet
```java
</head>

<body dir={{ .Site.Language.LanguageDirection }}>
  <input type="checkbox" class="hidden toggle" id="menu-control" />
  <input type="checkbox" class="hidden toggle" id="toc-control" />
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/health/OperatorHealthService.java`
#### Snippet
```java
        } else {
            LOG.info("Health probe disabled");
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/utils/SpecUtils.java`
#### Snippet
```java
            @Nullable String specWithMetaString, Class<T> specClass) {
        if (specWithMetaString == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/utils/SpecUtils.java`
#### Snippet
```java
    public static <T> T clone(T object) {
        if (object == null) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `flink-kubernetes-webhook/src/main/java/org/apache/flink/kubernetes/operator/admission/FlinkOperatorWebhook.java`
#### Snippet
```java
                            + EnvUtils.ENV_WEBHOOK_KEYSTORE_FILE
                            + ", running without ssl");
            return null;
        }

```

### ReturnNull
Return of `null`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/observer/ClusterHealthEvaluator.java`
#### Snippet
```java
        } else {
            LOG.debug("No last valid health check info");
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/SavepointUtils.java`
#### Snippet
```java
        } else {
            // Return null if no savepoint was ever taken
            return null;
        }

```

### ReturnNull
Return of `null`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/controller/FlinkSessionJobContext.java`
#### Snippet
```java
            return configManager.getSessionJobConfig(session.get(), (FlinkSessionJobSpec) spec);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/diff/DiffResult.java`
#### Snippet
```java
    private static String getText(JsonNode node) {
        if (node.isNull() || node.isMissingNode()) {
            return null;
        }
        String text = node.asText();
```

### ReturnNull
Return of `null`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/utils/EnvUtils.java`
#### Snippet
```java
     */
    public static Optional<String> get(String key) {
        return Optional.ofNullable(StringUtils.getIfBlank(System.getenv().get(key), () -> null));
    }

```

### ReturnNull
Return of `null`
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/status/ReconciliationStatus.java`
#### Snippet
```java
    public SPEC deserializeLastStableSpec() {
        var specWithMeta = deserializeLastStableSpecWithMeta();
        return specWithMeta != null ? specWithMeta.getSpec() : null;
    }

```

### ReturnNull
Return of `null`
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/status/ReconciliationStatus.java`
#### Snippet
```java
    public SPEC deserializeLastReconciledSpec() {
        var specWithMeta = deserializeLastReconciledSpecWithMeta();
        return specWithMeta != null ? specWithMeta.getSpec() : null;
    }

```

### ReturnNull
Return of `null`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/config/FlinkOperatorConfiguration.java`
#### Snippet
```java

    private static Optional<String> getEnv(String key) {
        return Optional.ofNullable(StringUtils.getIfBlank(System.getenv().get(key), () -> null));
    }
}
```

### ReturnNull
Return of `null`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/config/FlinkOperatorConfiguration.java`
#### Snippet
```java
    private static LeaderElectionConfiguration getLeaderElectionConfig(Configuration conf) {
        if (!conf.get(KubernetesOperatorConfigOptions.OPERATOR_LEADER_ELECTION_ENABLED)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `flink-kubernetes-standalone/src/main/java/org/apache/flink/kubernetes/operator/kubeclient/parameters/StandaloneKubernetesJobManagerParameters.java`
#### Snippet
```java
            return flinkConfig.get(ApplicationConfiguration.APPLICATION_ARGS);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `flink-kubernetes-standalone/src/main/java/org/apache/flink/kubernetes/operator/kubeclient/parameters/StandaloneKubernetesJobManagerParameters.java`
#### Snippet
```java
            return flinkConfig.get(SavepointConfigOptions.SAVEPOINT_PATH);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `flink-kubernetes-standalone/src/main/java/org/apache/flink/kubernetes/operator/kubeclient/parameters/StandaloneKubernetesJobManagerParameters.java`
#### Snippet
```java
    public String getMainClass() {
        if (!isApplicationCluster()) {
            return null;
        }
        return flinkConfig.getString(ApplicationConfiguration.APPLICATION_MAIN_CLASS);
```

### ReturnNull
Return of `null`
in `flink-kubernetes-standalone/src/main/java/org/apache/flink/kubernetes/operator/kubeclient/parameters/StandaloneKubernetesJobManagerParameters.java`
#### Snippet
```java
            return flinkConfig.get(SavepointConfigOptions.SAVEPOINT_IGNORE_UNCLAIMED_STATE);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `flink-kubernetes-operator-autoscaler/src/main/java/org/apache/flink/kubernetes/operator/autoscaler/AutoScalerInfo.java`
#### Snippet
```java
    private static String decompress(String compressed) {
        if (compressed == null) {
            return null;
        }

```

## RuleId[id=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `previousState`
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/health/CanaryResourceManager.java`
#### Snippet
```java
                    if (previousState == null) {
                        firstReconcile = true;
                        previousState = new CanaryResourceState();
                    }
                    previousState.onReconcile(resource);
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

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `flink-kubernetes-webhook/src/main/java/org/apache/flink/kubernetes/operator/admission/informer/InformerManager.java`
#### Snippet
```java
        this.watchedNamespaces.addAll(watchedNamespaces);
        if (flinkDepInformers != null) {
            synchronized (this) {
                if (flinkDepInformers != null) {
                    flinkDepInformers.forEach(
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `flink-kubernetes-webhook/src/main/java/org/apache/flink/kubernetes/operator/admission/informer/InformerManager.java`
#### Snippet
```java
    private void initFlinkDepInformers() {
        if (flinkDepInformers == null) {
            synchronized (this) {
                if (flinkDepInformers == null) {
                    var runnableInformers =
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-kubernetes-operator-api/src/main/java/org/apache/flink/kubernetes/operator/api/spec/JobSpec.java`
#### Snippet
```java

    /** Arguments for the Flink job main class. */
    private String[] args = new String[0];

    /** Desired state for the job. */
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/service/NativeFlinkService.java`
#### Snippet
```java
        final ApplicationConfiguration applicationConfiguration =
                new ApplicationConfiguration(
                        jobSpec.getArgs() != null ? jobSpec.getArgs() : new String[0],
                        jobSpec.getEntryClass());

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-kubernetes-docs/src/main/java/org/apache/flink/kubernetes/operator/docs/configuration/ConfigOptionsDocGenerator.java`
#### Snippet
```java
                Arrays.stream(clazz.getEnumConstants())
                        .map(ConfigOptionsDocGenerator::formatEnumOption)
                        .map(elements -> TextElement.wrap(elements.toArray(new InlineElement[0])))
                        .toArray(InlineElement[]::new);
        return Description.builder().text("Possible values:").list(optionDescriptions).build();
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

## RuleId[id=NonExceptionNameEndsWithException]
### NonExceptionNameEndsWithException
Non-exception class name `FlinkResourceException` ends with 'Exception'
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/exception/FlinkResourceException.java`
#### Snippet
```java
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FlinkResourceException {

    /** Exception Type. */
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/controller/FlinkSessionJobContext.java`
#### Snippet
```java
                sessionClusterReady(session)
                        ? flinkResourceContextFactory
                                .getResourceContext(session.get(), getJosdkContext())
                                .getFlinkService()
                        : null;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/controller/FlinkSessionJobContext.java`
#### Snippet
```java

        if (sessionClusterReady(session)) {
            return configManager.getSessionJobConfig(session.get(), (FlinkSessionJobSpec) spec);
        }
        return null;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/reconciler/deployment/AbstractJobReconciler.java`
#### Snippet
```java
                    MSG_SUSPENDED);
            // We must record the upgrade mode used to the status later
            currentDeploySpec.getJob().setUpgradeMode(availableUpgradeMode.getUpgradeMode().get());
            cancelJob(ctx, availableUpgradeMode.getUpgradeMode().get());
            if (desiredJobState == JobState.RUNNING) {
```

## RuleId[id=ConstantValue]
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
Condition `newJob != null` is always `true` when reached
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/validation/DefaultValidator.java`
#### Snippet
```java
        JobSpec oldJob = oldSpec.getJob();
        JobSpec newJob = newSpec.getJob();
        if (oldJob != null && newJob != null) {
            if (StringUtils.isNullOrWhitespaceOnly(
                            effectiveConfig.get(CheckpointingOptions.SAVEPOINT_DIRECTORY.key()))
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `flink-kubernetes-operator/src/main/java/org/apache/flink/kubernetes/operator/metrics/OperatorJosdkMetrics.java`
#### Snippet
```java
    private Counter counter(MetricGroup parent, String... names) {
        var key = new ArrayList<String>(parent.getScopeComponents().length + names.length);
        Arrays.stream(parent.getScopeComponents()).forEach(key::add);
        Arrays.stream(names).forEach(key::add);

```

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

