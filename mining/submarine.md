# submarine 
 
# Bad smells
I found 345 bad smells with 24 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldMayBeFinal | 51 | false |
| DataFlowIssue | 50 | false |
| UnusedAssignment | 40 | false |
| UNCHECKED_WARNING | 25 | false |
| NonFinalFieldInEnum | 20 | false |
| UnnecessaryToStringCall | 12 | true |
| UnnecessarySemicolon | 11 | false |
| JavadocReference | 10 | false |
| DuplicatedCode | 10 | false |
| JavadocDeclaration | 10 | false |
| JavadocLinkAsPlainText | 9 | false |
| DefaultAnnotationParam | 9 | false |
| RegExpRedundantEscape | 8 | false |
| WebProperties | 8 | false |
| FieldCanBeLocal | 7 | false |
| IgnoreResultOfCall | 7 | false |
| StringOperationCanBeSimplified | 7 | false |
| UnnecessaryStringEscape | 5 | true |
| StringBufferReplaceableByString | 4 | false |
| StringConcatenationInsideStringBufferAppend | 3 | false |
| DanglingJavadoc | 3 | false |
| TrivialIf | 3 | false |
| UnnecessaryLocalVariable | 3 | true |
| WriteOnlyObject | 2 | false |
| UseBulkOperation | 2 | false |
| BigDecimalMethodWithoutRoundingCalled | 2 | false |
| RedundantArrayCreation | 1 | true |
| OctalLiteral | 1 | false |
| UnnecessaryReturn | 1 | true |
| SimplifiableConditionalExpression | 1 | false |
| NullableProblems | 1 | false |
| AccessStaticViaInstance | 1 | false |
| ReturnFromFinallyBlock | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| RedundantExplicitClose | 1 | false |
| DuplicateThrows | 1 | false |
| TypeParameterExtendsObject | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
| ConstantValue | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| FinallyBlockCannotCompleteNormally | 1 | false |
| RedundantCollectionOperation | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| CollectionAddAllCanBeReplacedWithConstructor | 1 | false |
| RedundantEscapeInRegexReplacement | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| OptionalUsedAsFieldOrParameterType | 1 | false |
| ComparatorMethodParameterNotUsed | 1 | false |
| RedundantCast | 1 | false |
| ServletWithoutMappingInspection | 1 | false |
## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/notebook/entity/NotebookEntity.java`
#### Snippet
```java
        ", updateBy='" + updateBy + '\'' +
        ", updateTime=" + updateTime + '\'' +
        ", notebookStatus='" + notebookStatus + "\'" +
        ", notebookUrl= '" + notebookUrl + "\'" +
        ", reason= '" + reason + "\'" +
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/notebook/entity/NotebookEntity.java`
#### Snippet
```java
        ", updateTime=" + updateTime + '\'' +
        ", notebookStatus='" + notebookStatus + "\'" +
        ", notebookUrl= '" + notebookUrl + "\'" +
        ", reason= '" + reason + "\'" +
        ", deletedTime= '" + deletedTime + "\'" +
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/notebook/entity/NotebookEntity.java`
#### Snippet
```java
        ", notebookStatus='" + notebookStatus + "\'" +
        ", notebookUrl= '" + notebookUrl + "\'" +
        ", reason= '" + reason + "\'" +
        ", deletedTime= '" + deletedTime + "\'" +
        '}';
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/notebook/entity/NotebookEntity.java`
#### Snippet
```java
        ", notebookUrl= '" + notebookUrl + "\'" +
        ", reason= '" + reason + "\'" +
        ", deletedTime= '" + deletedTime + "\'" +
        '}';
  }
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/experiment/entity/ExperimentEntity.java`
#### Snippet
```java
      ", updateBy='" + updateBy + '\'' +
      ", updateTime='" + updateTime + '\'' +
      ", experimentStatus='" + experimentStatus + "\'" +
      ", acceptedTime='" + acceptedTime + '\'' +
      ", runningTime='" + runningTime + '\'' +
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/security/common/CommonFilter.java`
#### Snippet
```java
        if (endpoint.endsWith("/")) endpoint = endpoint.substring(0, endpoint.length() - 1);
        String api = String.format("/api/%s/%s", path, endpoint);
        if (api.matches("(.*)\\{\\w+\\}(.*)")) {
          REST_REGREX_API_PATHS.add(api.replaceAll("\\{\\w+\\}", "((?!\\/).)*"));
        } else {
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/security/common/CommonFilter.java`
#### Snippet
```java
        String api = String.format("/api/%s/%s", path, endpoint);
        if (api.matches("(.*)\\{\\w+\\}(.*)")) {
          REST_REGREX_API_PATHS.add(api.replaceAll("\\{\\w+\\}", "((?!\\/).)*"));
        } else {
          REST_API_PATHS.add(api);
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ExperimentTemplateManager.java`
#### Snippet
```java

    // Mapping the {{...}} param
    Pattern pattern = Pattern.compile("\\{\\{(.*?)\\}\\}");
    for (Map.Entry<String, Object> entry : flattenJson.entrySet()) {
      boolean isMatch = false;
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ExperimentTemplateManager.java`
#### Snippet
```java

    // Mapping the {{...}} param
    Pattern pattern = Pattern.compile("\\{\\{(.*?)\\}\\}");
    for (Map.Entry<String, Object> entry : flattenJson.entrySet()) {
      boolean isMatch = false;
```

### RegExpRedundantEscape
Redundant character escape `\\_` in RegExp
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/notebook/NotebookId.java`
#### Snippet
```java
      return null;
    }
    String[] components = notebookId.split("\\_");
    if (components.length != 3) {
      return null;
```

### RegExpRedundantEscape
Redundant character escape `\\-` in RegExp
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/experiment/ExperimentId.java`
#### Snippet
```java
      return null;
    }
    String[] components = jobId.split("\\-");
    if (components.length != 3) {
      return null;
```

### RegExpRedundantEscape
Redundant character escape `\\_` in RegExp
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/experimenttemplate/ExperimentTemplateId.java`
#### Snippet
```java
      return null;
    }
    String[] components = experimentTemplateId.split("\\_");
    if (components.length != 3) {
      return null;
```

### RegExpRedundantEscape
Redundant character escape `\\_` in RegExp
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/environment/EnvironmentId.java`
#### Snippet
```java
      return null;
    }
    String[] components = environmentId.split("\\_");
    if (components.length != 3) {
      return null;
```

## RuleId[id=RedundantArrayCreation]
### RedundantArrayCreation
Redundant array creation for calling varargs method
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/response/DictAnnotation.java`
#### Snippet
```java
              + objectClass.getName() + " need add set and set methods.");
        }
        Object result = readMethod.invoke(object, new Object[0]);
        mapFieldValues.put(propertyName, result);
        mapFieldAndType.put(propertyName, descriptor.getPropertyType());
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `typeName` in enum 'TFJobReplicaType'
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/tfjob/TFJobReplicaType.java`
#### Snippet
```java


  private String typeName;

  TFJobReplicaType(String n) {
```

### NonFinalFieldInEnum
Non-final field `longValue` in enum 'ConfVars'
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/SubmarineConfVars.java`
#### Snippet
```java
    private float floatValue;
    private boolean booleanValue;
    private long longValue;


```

### NonFinalFieldInEnum
Non-final field `type` in enum 'ConfVars'
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/SubmarineConfVars.java`
#### Snippet
```java
    private Class varClass;
    private String stringValue;
    private VarType type;
    private int intValue;
    private float floatValue;
```

### NonFinalFieldInEnum
Non-final field `varClass` in enum 'ConfVars'
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/SubmarineConfVars.java`
#### Snippet
```java
    private String varName;
    @SuppressWarnings("rawtypes")
    private Class varClass;
    private String stringValue;
    private VarType type;
```

### NonFinalFieldInEnum
Non-final field `stringValue` in enum 'ConfVars'
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/SubmarineConfVars.java`
#### Snippet
```java
    @SuppressWarnings("rawtypes")
    private Class varClass;
    private String stringValue;
    private VarType type;
    private int intValue;
```

### NonFinalFieldInEnum
Non-final field `varName` in enum 'ConfVars'
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/SubmarineConfVars.java`
#### Snippet
```java
    SUBMARINE_AUTH_MAX_AGE_ENV("submarine.auth.maxAge", 60 * 60 * 24);

    private String varName;
    @SuppressWarnings("rawtypes")
    private Class varClass;
```

### NonFinalFieldInEnum
Non-final field `booleanValue` in enum 'ConfVars'
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/SubmarineConfVars.java`
#### Snippet
```java
    private int intValue;
    private float floatValue;
    private boolean booleanValue;
    private long longValue;

```

### NonFinalFieldInEnum
Non-final field `intValue` in enum 'ConfVars'
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/SubmarineConfVars.java`
#### Snippet
```java
    private String stringValue;
    private VarType type;
    private int intValue;
    private float floatValue;
    private boolean booleanValue;
```

### NonFinalFieldInEnum
Non-final field `floatValue` in enum 'ConfVars'
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/SubmarineConfVars.java`
#### Snippet
```java
    private VarType type;
    private int intValue;
    private float floatValue;
    private boolean booleanValue;
    private long longValue;
```

### NonFinalFieldInEnum
Non-final field `typeName` in enum 'PyTorchJobReplicaType'
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/pytorchjob/PyTorchJobReplicaType.java`
#### Snippet
```java
  Worker("Worker");

  private String typeName;

  PyTorchJobReplicaType(String n) {
```

### NonFinalFieldInEnum
Non-final field `compName` in enum 'PyTorchRole'
in `submarine-commons/commons-runtime/src/main/java/org/apache/submarine/commons/runtime/api/PyTorchRole.java`
#### Snippet
```java
  WORKER("worker");

  private String compName;

  PyTorchRole(String compName) {
```

### NonFinalFieldInEnum
Non-final field `compName` in enum 'TensorFlowRole'
in `submarine-commons/commons-runtime/src/main/java/org/apache/submarine/commons/runtime/api/TensorFlowRole.java`
#### Snippet
```java
  TENSORBOARD("tensorboard");

  private String compName;

  TensorFlowRole(String compName) {
```

### NonFinalFieldInEnum
Non-final field `compName` in enum 'MXNetRole'
in `submarine-commons/commons-runtime/src/main/java/org/apache/submarine/commons/runtime/api/MXNetRole.java`
#### Snippet
```java
  SCHEDULER("scheduler");

  private String compName;

  MXNetRole(String compName) {
```

### NonFinalFieldInEnum
Non-final field `value` in enum 'Framework'
in `submarine-commons/commons-runtime/src/main/java/org/apache/submarine/commons/runtime/Framework.java`
#### Snippet
```java
  TENSORFLOW(Constants.TENSORFLOW_NAME), PYTORCH(Constants.PYTORCH_NAME), MXNET(Constants.MXNET_NAME);

  private String value;

  Framework(String value) {
```

### NonFinalFieldInEnum
Non-final field `value` in enum 'Runtime'
in `submarine-commons/commons-runtime/src/main/java/org/apache/submarine/commons/runtime/api/Runtime.java`
#### Snippet
```java
  TONY(Constants.TONY), YARN_SERVICE(Constants.YARN_SERVICE);

  private String value;

  Runtime(String value) {
```

### NonFinalFieldInEnum
Non-final field `serviceTypeKey` in enum 'JobManagerServiceType'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/websocket/WebSocketServer.java`
#### Snippet
```java
  protected enum JobManagerServiceType {
    JOB_MANAGER_PAGE("JOB_MANAGER_PAGE");
    private String serviceTypeKey;

    JobManagerServiceType(String serviceType) {
```

### NonFinalFieldInEnum
Non-final field `serviceTypeKey` in enum 'JobManagerServiceType'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/workbench/websocket/NotebookServer.java`
#### Snippet
```java
  protected enum JobManagerServiceType {
    JOB_MANAGER_PAGE("JOB_MANAGER_PAGE");
    private String serviceTypeKey;

    JobManagerServiceType(String serviceType) {
```

### NonFinalFieldInEnum
Non-final field `customResourceType` in enum 'CustomResourceType'
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/common/CustomResourceType.java`
#### Snippet
```java
public enum CustomResourceType {
  TFJob("TFJob"), PyTorchJob("PyTorchJob"), XGBoost("XGBoost"), Notebook("Notebook");
  private String customResourceType;

  CustomResourceType(String customResourceType) {
```

### NonFinalFieldInEnum
Non-final field `value` in enum 'Status'
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/notebook/Notebook.java`
#### Snippet
```java
    STATUS_NOT_FOUND("not_found");

    private String value;
    Status(String value) {
      this.value = value;
```

### NonFinalFieldInEnum
Non-final field `value` in enum 'Status'
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/experiment/Experiment.java`
#### Snippet
```java
    STATUS_FAILED("Failed");

    private String value;
    Status(String value) {
      this.value = value;
```

## RuleId[id=OctalLiteral]
### OctalLiteral
Octal integer `0400`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/experiment/codelocalizer/SSHGitCodeLocalizer.java`
#### Snippet
```java

  public static final String GIT_SECRET_NAME = "git-creds";
  public static final int GIT_SECRET_MODE = 0400;
  public static final String GIT_SECRET_MOUNT_NAME = "git-secret";
  public static final String GIT_SECRET_PATH = "/etc/git-secret";
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuffer condaVersionValidationCommand` can be replaced with 'String'
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/parser/NotebookSpecParser.java`
#### Snippet
```java
            + conf.getString(SubmarineConfVars.ConfVars.ENVIRONMENT_CONDA_MAX_VERSION)
            + "\";";
    StringBuffer condaVersionValidationCommand = new StringBuffer();
    condaVersionValidationCommand.append(minVersion);
    condaVersionValidationCommand.append(maxVersion);
```

### StringBufferReplaceableByString
`StringBuffer condaVersionValidationCommand` can be replaced with 'String'
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/parser/ExperimentSpecParser.java`
#### Snippet
```java
              + "\";";
          String currentVersion = "currentVersion=$(conda -V | cut -f2 -d' ');";
          StringBuffer condaVersionValidationCommand = new StringBuffer();
          condaVersionValidationCommand.append(minVersion);
          condaVersionValidationCommand.append(maxVersion);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/websocket/Message.java`
#### Snippet
```java
  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Message{");
    sb.append("data=").append(data);
    sb.append(", op=").append(op);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/workbench/websocket/Message.java`
#### Snippet
```java
  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Message{");
    sb.append("data=").append(data);
    sb.append(", op=").append(op);
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/spec/ExperimentMeta.java`
#### Snippet
```java
  public void setNamespace(String namespace) {
    // TODO(kevin85421): Remove the function
    return;
  }

```

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`deploy == null ? false : Optional.ofNullable(deploy.getStatus().getAvailableReplicas())
.map(ar -> ar > 0).orElse(false)` can be simplified to 'deploy!=null \&\& Optional.ofNullable(deploy.getStatus().getAvailableReplicas()) .map(ar -\> ar \> 0).orElse(false)'
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/K8sSubmitter.java`
#### Snippet
```java
    V1Deployment deploy = k8sClient.getAppsV1Api()
            .readNamespacedDeploymentStatus(name, getServerNamespace(), "true");
    return deploy == null ? false : Optional.ofNullable(deploy.getStatus().getAvailableReplicas())
            .map(ar -> ar > 0).orElse(false); // at least one replica is running
  }
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/AbstractUniqueIdGenerator.java`
#### Snippet
```java
  @SuppressWarnings("rawtypes")
  @Override
  public int compareTo(Object o) {
    AbstractUniqueIdGenerator other = (AbstractUniqueIdGenerator) o;
    return this.getId() > other.getId() ? 1 : 0;
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/tfjob/TFJobSpec.java`
#### Snippet
```java
 * The replica spec of TFJob.
 * For the entity definition of TFJobSpec, refer to
 * https://github.com/kubeflow/training-operator/blob/master/examples/tensorflow/dist-mnist/tf_job_mnist.yaml
 */
public class TFJobSpec {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/mljob/MLJob.java`
#### Snippet
```java
 * <p>
 * For job resource definitions and related information,
 * please refer to https://github.com/kubeflow/training-operator
 */
public abstract class MLJob implements KubernetesObject, K8sResource<Experiment> {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/pytorchjob/PyTorchJobSpec.java`
#### Snippet
```java
/**
 * For the entity definition of PyTorchJobSpec, refer to
 * https://github.com/kubeflow/training-operator/tree/master/examples/pytorch/mnist/v1
 */
public class PyTorchJobSpec {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/security/oidc/OidcCallbackResource.java`
#### Snippet
```java
/**
 * Fixed Callback endpoint used after successful login with Identity Provider e.g. OAuth server.
 * See https://www.pac4j.org/blog/understanding-the-callback-endpoint.html
 */
@Path(OidcCallbackResource.SELF_URL)
```

### JavadocLinkAsPlainText
Link specified as plain text
in `submarine-serve/src/main/java/org/apache/submarine/serve/seldon/PredictorAnnotations.java`
#### Snippet
```java
   * due to the use of istio, a traffic `excludeOutboundPorts` has been added here.
   * Reference link: Compatibility with application init containers,
   * https://istio.io/latest/docs/setup/additional-setup/cni/#compatibility-with-application-init-containers
   */
  @SerializedName("traffic.sidecar.istio.io/excludeOutboundPorts")
```

### JavadocLinkAsPlainText
Link specified as plain text
in `submarine-server/server-submitter/submarine-k8s-agent/src/main/java/org/apache/submarine/server/k8s/agent/reconciler/XGBoostJobReconciler.java`
#### Snippet
```java
 * <p>
 * Label selectors reference:
 * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#api
 */
@ControllerConfiguration(
```

### JavadocLinkAsPlainText
Link specified as plain text
in `submarine-server/server-submitter/submarine-k8s-agent/src/main/java/org/apache/submarine/server/k8s/agent/reconciler/TFJobReconciler.java`
#### Snippet
```java
 * <p>
 * Label selectors reference:
 * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#api
 */
@ControllerConfiguration(
```

### JavadocLinkAsPlainText
Link specified as plain text
in `submarine-server/server-submitter/submarine-k8s-agent/src/main/java/org/apache/submarine/server/k8s/agent/reconciler/PyTorchJobReconciler.java`
#### Snippet
```java
 * <p>
 * Label selectors reference:
 * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#api
 */
@ControllerConfiguration(
```

### JavadocLinkAsPlainText
Link specified as plain text
in `submarine-server/server-submitter/submarine-k8s-agent/src/main/java/org/apache/submarine/server/k8s/agent/reconciler/NotebookReconciler.java`
#### Snippet
```java
 * <p>
 * Label selectors reference:
 * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#api
 */
@ControllerConfiguration(
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/s3/Client.java`
#### Snippet
```java

  /* submarine config */
  private final SubmarineConfiguration conf = SubmarineConfiguration.getInstance();

  /* minio client */
```

### FieldCanBeLocal
Field can be converted to a local variable
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/response/JsonResponse.java`
#### Snippet
```java
  private final T result;
  private final transient ArrayList<NewCookie> cookies;
  private final transient boolean pretty = false;
  private final Map<String, Object> attributes;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/response/JsonResponse.java`
#### Snippet
```java
  private final int code;
  private final Boolean success;
  private final String message;
  private final T result;
  private final transient ArrayList<NewCookie> cookies;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ExperimentManager.java`
#### Snippet
```java
  private final AtomicInteger experimentCounter = new AtomicInteger(0);

  private Optional<org.mlflow.api.proto.Service.Experiment> MlflowExperimentOptional;
  private org.mlflow.api.proto.Service.Experiment MlflowExperiment;
  /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ExperimentManager.java`
#### Snippet
```java

  private Optional<org.mlflow.api.proto.Service.Experiment> MlflowExperimentOptional;
  private org.mlflow.api.proto.Service.Experiment MlflowExperiment;
  /**
   * Used to cache the specs by the experiment id.
```

### FieldCanBeLocal
Field can be converted to a local variable
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/workbench/User.java`
#### Snippet
```java
  private final String telephone;
  private final String lastLoginIp;
  private final long lastLoginTime;
  private final String creatorId;
  private final long createTime;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/entity/SysDictEntity.java`
#### Snippet
```java
  private Integer deleted;

  private Integer type;

  public void setDictCode(String dictCode) {
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `Integer.valueOf()` is ignored
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/SubmarineConfVars.java`
#### Snippet
```java
        @Override
        void checkType(String value) throws Exception {
          Integer.valueOf(value);
        }
      },
```

### IgnoreResultOfCall
Result of `Long.valueOf()` is ignored
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/SubmarineConfVars.java`
#### Snippet
```java
        @Override
        void checkType(String value) throws Exception {
          Long.valueOf(value);
        }
      },
```

### IgnoreResultOfCall
Result of `Float.valueOf()` is ignored
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/SubmarineConfVars.java`
#### Snippet
```java
        @Override
        void checkType(String value) throws Exception {
          Float.valueOf(value);
        }
      },
```

### IgnoreResultOfCall
Result of `Boolean.valueOf()` is ignored
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/SubmarineConfVars.java`
#### Snippet
```java
        @Override
        void checkType(String value) throws Exception {
          Boolean.valueOf(value);
        }
      };
```

### IgnoreResultOfCall
Result of `File.mkdir()` is ignored
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/SubmarineServer.java`
#### Snippet
```java
      webApp.setWar(warPath.getAbsolutePath());
      File warTempDirectory = new File("webapps");
      warTempDirectory.mkdir();
      webApp.setTempDirectory(warTempDirectory);
    }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/GitUtils.java`
#### Snippet
```java

    if (!myfile.exists()) {
      myfile.getParentFile().mkdirs();
      try {
        myfile.createNewFile();
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/GitUtils.java`
#### Snippet
```java
      myfile.getParentFile().mkdirs();
      try {
        myfile.createNewFile();
      } catch (IOException e) {
        LOG.error(e.getMessage(), e);
```

## RuleId[id=AccessStaticViaInstance]
### AccessStaticViaInstance
Static member 'org.apache.submarine.server.websocket.WebSocketServer.connectionManager' accessed via instance reference
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/websocket/WebSocketServer.java`
#### Snippet
```java

  public WebSocketServer() {
    this.connectionManager = new ConnectionManager();
    WebSocketServer.self.set(this);
    LOG.info("WebSocketServer instantiated: {}", this);
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `submarine-server/server-submitter/submarine-k8s-agent/src/main/java/org/apache/submarine/server/k8s/agent/model/notebook/NotebookResource.java`
#### Snippet
```java

@JsonDeserialize(
        using = JsonDeserializer.None.class
)
@JsonInclude(JsonInclude.Include.NON_NULL)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `submarine-server/server-submitter/submarine-k8s-agent/src/main/java/org/apache/submarine/server/k8s/agent/model/notebook/status/NotebookStatus.java`
#### Snippet
```java

@JsonDeserialize(
        using = JsonDeserializer.None.class
)
@JsonInclude(JsonInclude.Include.NON_NULL)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `submarine-server/server-submitter/submarine-k8s-agent/src/main/java/org/apache/submarine/server/k8s/agent/model/notebook/status/NotebookCondition.java`
#### Snippet
```java

@JsonDeserialize(
        using = JsonDeserializer.None.class
)
@JsonInclude(JsonInclude.Include.NON_NULL)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `submarine-server/server-submitter/submarine-k8s-agent/src/main/java/org/apache/submarine/server/k8s/agent/model/training/resource/XGBoostJob.java`
#### Snippet
```java

@JsonDeserialize(
        using = JsonDeserializer.None.class
)
@JsonInclude(JsonInclude.Include.NON_NULL)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `submarine-server/server-submitter/submarine-k8s-agent/src/main/java/org/apache/submarine/server/k8s/agent/model/training/status/JobStatus.java`
#### Snippet
```java

@JsonDeserialize(
        using = JsonDeserializer.None.class
)
@JsonInclude(JsonInclude.Include.NON_NULL)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `submarine-server/server-submitter/submarine-k8s-agent/src/main/java/org/apache/submarine/server/k8s/agent/model/training/resource/TFJob.java`
#### Snippet
```java

@JsonDeserialize(
        using = JsonDeserializer.None.class
)
@JsonInclude(JsonInclude.Include.NON_NULL)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `submarine-server/server-submitter/submarine-k8s-agent/src/main/java/org/apache/submarine/server/k8s/agent/model/training/status/ReplicaStatus.java`
#### Snippet
```java

@JsonDeserialize(
        using = JsonDeserializer.None.class
)
@JsonInclude(JsonInclude.Include.NON_NULL)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `submarine-server/server-submitter/submarine-k8s-agent/src/main/java/org/apache/submarine/server/k8s/agent/model/training/status/JobCondition.java`
#### Snippet
```java

@JsonDeserialize(
        using = JsonDeserializer.None.class
)
@JsonInclude(JsonInclude.Include.NON_NULL)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `submarine-server/server-submitter/submarine-k8s-agent/src/main/java/org/apache/submarine/server/k8s/agent/model/training/resource/PyTorchJob.java`
#### Snippet
```java

@JsonDeserialize(
        using = JsonDeserializer.None.class
)
@JsonInclude(JsonInclude.Include.NON_NULL)
```

## RuleId[id=ReturnFromFinallyBlock]
### ReturnFromFinallyBlock
'return' inside 'finally' block
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ExperimentManager.java`
#### Snippet
```java
      mlflowClient.deleteExperiment(mlflowId);
    } finally {
      return experiment;
    }
  }
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `oldProjectFilesId` are updated, but never queried
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/service/ProjectService.java`
#### Snippet
```java
      // Take two lists of difference
      List<ProjectFilesEntity> oldProjectFiles = projectFilesMapper.selectAll(where);
      List<String> oldProjectFilesId = new ArrayList<>();
      for (ProjectFilesEntity oldProjectFile : oldProjectFiles) {
        oldProjectFilesId.add(oldProjectFile.getId());
```

## RuleId[id=RedundantExplicitClose]
### RedundantExplicitClose
Redundant 'close()'
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/NetworkUtils.java`
#### Snippet
```java
    try (ServerSocket socket = new ServerSocket(0);) {
      port = socket.getLocalPort();
      socket.close();
    }
    return port;
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/utils/CustomJsonDateDeserializer.java`
#### Snippet
```java
  @Override
  public Date deserialize(JsonParser jp, DeserializationContext ctxt)
      throws IOException, JsonProcessingException {
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String date = jp.getText();
```

## RuleId[id=TypeParameterExtendsObject]
### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/response/DictAnnotation.java`
#### Snippet
```java
    HashMap<String, Object> mapFieldAndType = new HashMap<>();

    Class<? extends Object> objectClass = object.getClass();
    BeanInfo beanInfo = Introspector.getBeanInfo(objectClass);
    PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `notebook` initializer `null` is redundant
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/notebook/NotebookCR.java`
#### Snippet
```java
   */
  public Notebook create(K8sClient client, boolean tolerate) {
    Notebook notebook = null;
    try {
      if (LOG.isDebugEnabled()) {
```

### UnusedAssignment
Variable `numRunningButUnreadyContainers` initializer `0` is redundant
in `submarine-commons/commons-runtime/src/main/java/org/apache/submarine/commons/runtime/api/JobComponentStatus.java`
#### Snippet
```java
  private String compName;
  private long numReadyContainers = 0;
  private long numRunningButUnreadyContainers = 0;
  private long totalAskedContainers;

```

### UnusedAssignment
Variable `numReadyContainers` initializer `0` is redundant
in `submarine-commons/commons-runtime/src/main/java/org/apache/submarine/commons/runtime/api/JobComponentStatus.java`
#### Snippet
```java
public class JobComponentStatus {
  private String compName;
  private long numReadyContainers = 0;
  private long numRunningButUnreadyContainers = 0;
  private long totalAskedContainers;
```

### UnusedAssignment
Variable `indexFile` initializer `null` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/SubmarineServer.java`
#### Snippet
```java

      File warPath = new File(conf.getString(SubmarineConfVars.ConfVars.WORKBENCH_WEB_WAR));
      File indexFile = null;
      if (warPath.isDirectory()) {
        // Development mode, read from FS
```

### UnusedAssignment
Variable `lineTxt` initializer `null` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/SubmarineServer.java`
#### Snippet
```java
               new InputStreamReader(new FileInputStream(indexFile), "GBK");
           BufferedReader bufferedReader = new BufferedReader(reader);) {
        String lineTxt = null;
        while ((lineTxt = bufferedReader.readLine()) != null) {
          sbIndexBuf.append(lineTxt);
```

### UnusedAssignment
Variable `projectList` initializer `new ArrayList<>()` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/ProjectRestApi.java`
#### Snippet
```java
    LOG.info("ProjectRestApi.list() owner:{}, pageNo:{}, pageSize:{}", userName, pageNo, pageSize);

    List<ProjectEntity> projectList = new ArrayList<>();
    try {
      projectList = projectService.queryPageList(userName, column, order, pageNo, pageSize);
```

### UnusedAssignment
Variable `result` initializer `false` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/ParamRestApi.java`
#### Snippet
```java
  public Response putParam(ParamEntity param) {
    LOG.info("putParam ({})", param);
    boolean result = false;
    try {
      result = paramService.update(param);
```

### UnusedAssignment
Variable `list` initializer `null` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/SystemRestApi.java`
#### Snippet
```java

    if (StringUtils.equals(tableName, "sys_user")) {
      List<SysUserEntity> list = null;
      try {
        list = userService.queryPageList(keyword, null, null, null, null, 1, 1000);
```

### UnusedAssignment
Variable `teams` initializer `new ArrayList<>()` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/TeamRestApi.java`
#### Snippet
```java
    LOG.info("TeamRestApi.list() owner:{}, pageNo:{}, pageSize:{}", owner, pageNo, pageSize);

    List<TeamEntity> teams = new ArrayList<>();
    try {
      // TODO(zhulinhao): Front need to correct 'owner' value, and Whether need the
```

### UnusedAssignment
Variable `sysDeptList` initializer `null` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/SysDeptRestApi.java`
#### Snippet
```java
    LOG.info("SysDeptRestApi.tree()");

    List<SysDeptEntity> sysDeptList = null;

    try (SqlSession sqlSession = MyBatisUtil.getSqlSession()) {
```

### UnusedAssignment
Variable `result` initializer `false` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/MetricRestApi.java`
#### Snippet
```java
  @SubmarineApi
  public Response deleteMetric(@QueryParam("id") String id) {
    boolean result = false;
    try {
      result = metricService.deleteById(id);
```

### UnusedAssignment
Variable `result` initializer `false` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/MetricRestApi.java`
#### Snippet
```java
  @SubmarineApi
  public Response postMetric(MetricEntity metric) {
    boolean result = false;
    try {
      result = metricService.insert(metric);
```

### UnusedAssignment
Variable `result` initializer `false` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/MetricRestApi.java`
#### Snippet
```java
  @SubmarineApi
  public Response putMetric(MetricEntity metric) {
    boolean result = false;
    try {
      result = metricService.update(metric);
```

### UnusedAssignment
Variable `dirCache` initializer `null` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/GitUtils.java`
#### Snippet
```java
   */
  public DirCache rm(String localPath, String fileName) {
    DirCache dirCache = null;
    // Git repository address
    try (Git git = Git.open(new File(localPath))) {
```

### UnusedAssignment
Variable `list` initializer `null` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/GitUtils.java`
#### Snippet
```java
   */
  public List<String> branchDelete(String localPath, String branchName) {
    List<String> list = null;
    try (Git git = Git.open(new File(localPath))) {
      list = git.branchDelete().setForce(true).setBranchNames(branchName).call();
```

### UnusedAssignment
Variable `revCommit` initializer `null` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/GitUtils.java`
#### Snippet
```java
   */
  public RevCommit commit(String localPath, String message) {
    RevCommit revCommit = null;
    // Git repository address
    try (Git git = Git.open(new File(localPath))) {
```

### UnusedAssignment
Variable `pullResult` initializer `null` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/GitUtils.java`
#### Snippet
```java
    CredentialsProvider credentialsProvider =
        new UsernamePasswordCredentialsProvider("PRIVATE-TOKEN", token);
    PullResult pullResult = null;
    // Git repository address
    try (Git git = Git.open(new File(localPath))) {
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/GitUtils.java`
#### Snippet
```java
   */
  public Ref checkout(String localPath, String branchName) {
    Ref result = null;
    try (Git git = Git.open(new File(localPath))) {
      result = git.checkout().setName(branchName).call();
```

### UnusedAssignment
Variable `dirCache` initializer `null` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/GitUtils.java`
#### Snippet
```java
    }

    DirCache dirCache = null;
    try (Git git = Git.open(new File(localPath))) {
      // Add files
```

### UnusedAssignment
Variable `iterable` initializer `null` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/GitUtils.java`
#### Snippet
```java
    CredentialsProvider credentialsProvider =
        new UsernamePasswordCredentialsProvider("PRIVATE-TOKEN", token);
    Iterable<PushResult> iterable = null;
    // Git repository address
    try (Git git = Git.open(new File(localPath))) {
```

### UnusedAssignment
Variable `list` initializer `null` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/SysUserRestApi.java`
#### Snippet
```java
        userName, email, deptCode, column, field, pageNo, pageSize);

    List<SysUserEntity> list = null;
    try {
      list = userService.queryPageList(userName, email, deptCode, column, field, pageNo, pageSize);
```

### UnusedAssignment
Variable `list` initializer `null` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/SysDictRestApi.java`
#### Snippet
```java
        column, field, order, pageNo, pageSize);

    List<SysDictEntity> list = null;
    SqlSession sqlSession = MyBatisUtil.getSqlSession();
    SysDictMapper sysDictMapper = sqlSession.getMapper(SysDictMapper.class);
```

### UnusedAssignment
Variable `sysUser` initializer `null` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/LoginRestApi.java`
#### Snippet
```java
        = gson.fromJson(loginParams, new TypeToken<HashMap<String, String>>() {}.getType());

    SysUserEntity sysUser = null;
    try (SqlSession sqlSession = MyBatisUtil.getSqlSession()) {
      SysUserMapper sysUserMapper = sqlSession.getMapper(SysUserMapper.class);
```

### UnusedAssignment
Variable `list` initializer `null` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/SysDictItemRestApi.java`
#### Snippet
```java
        dictCode, itemText, itemValue, pageNo, pageSize);

    List<SysDictItemEntity> list = null;
    SqlSession sqlSession = MyBatisUtil.getSqlSession();
    SysDictItemMapper sysDictItemMapper = sqlSession.getMapper(SysDictItemMapper.class);
```

### UnusedAssignment
Variable `object` initializer `null` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/response/DictAnnotation.java`
#### Snippet
```java

  // Dynamically generated class
  private Object object = null;

  // Attribute name and type of attribute
```

### UnusedAssignment
Variable `beanMap` initializer `null` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/response/DictAnnotation.java`
#### Snippet
```java

  // Attribute name and type of attribute
  private BeanMap beanMap = null;

  public DictAnnotation(Map propertyMap) {
```

### UnusedAssignment
Variable `returnExperimentSpec` initializer `null` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ExperimentTemplateManager.java`
#### Snippet
```java
    LOG.info("nestedJson    " + nestedJson);

    ExperimentSpec returnExperimentSpec = null;
    try {
      returnExperimentSpec = gson.fromJson(nestedJson, ExperimentSpec.class);
```

### UnusedAssignment
Variable `defaultCheck` initializer `false` is redundant
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/workbench/Action.java`
#### Snippet
```java
public class Action {
  private String action;
  private boolean defaultCheck = false;
  private String describe;

```

### UnusedAssignment
Variable `podLog` initializer `new ArrayList`() is redundant
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/experiment/ExperimentLog.java`
#### Snippet
```java

    String podName;
    List<String> podLog = new ArrayList<String>();

    PodLog(String name, String log) {
```

### UnusedAssignment
Variable `config` initializer `null` is redundant
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/utils/MybatisGenerator.java`
#### Snippet
```java
    File configFile = new File(MybatisGenerator.class.getResource(genCfg).getFile());
    ConfigurationParser cp = new ConfigurationParser(warnings);
    Configuration config = null;
    try {
      config = cp.parseConfiguration(configFile);
```

### UnusedAssignment
Variable `myBatisGenerator` initializer `null` is redundant
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/utils/MybatisGenerator.java`
#### Snippet
```java

    DefaultShellCallback callback = new DefaultShellCallback(overwrite);
    MyBatisGenerator myBatisGenerator = null;
    try {
      assert config != null;
```

### UnusedAssignment
Variable `dictItems` initializer `null` is redundant
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/service/SysDictItemService.java`
#### Snippet
```java

  public List<SysDictItemEntity> queryDictByCode(String dictCode) {
    List<SysDictItemEntity> dictItems = null;
    try (SqlSession sqlSession = MyBatisUtil.getSqlSession()) {
      SysDictItemMapper dictItemMapper = sqlSession.getMapper(SysDictItemMapper.class);
```

### UnusedAssignment
Variable `list` initializer `null` is redundant
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/service/ProjectFilesService.java`
#### Snippet
```java
    LOG.info("queryPageList projectId:{}", projectId);

    List<ProjectFilesEntity> list = null;
    try (SqlSession sqlSession = MyBatisUtil.getSqlSession()) {
      ProjectFilesMapper projectFilesMapper = sqlSession.getMapper(ProjectFilesMapper.class);
```

### UnusedAssignment
Variable `list` initializer `null` is redundant
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/service/TeamMemberService.java`
#### Snippet
```java
    LOG.info("queryList teamId:{}", teamId);

    List<TeamMemberEntity> list = null;
    try (SqlSession sqlSession = MyBatisUtil.getSqlSession()) {
      TeamMemberMapper teamMemberMapper = sqlSession.getMapper(TeamMemberMapper.class);
```

### UnusedAssignment
Variable `list` initializer `null` is redundant
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/service/JobService.java`
#### Snippet
```java
            userName, column, order, pageNo, pageSize);

    List<JobEntity> list = null;
    try (SqlSession sqlSession = MyBatisUtil.getSqlSession()) {
      JobMapper projectMapper = sqlSession.getMapper(JobMapper.class);
```

### UnusedAssignment
Variable `list` initializer `null` is redundant
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/service/ProjectService.java`
#### Snippet
```java
        userName, column, order, pageNo, pageSize);

    List<ProjectEntity> list = null;
    try (SqlSession sqlSession = MyBatisUtil.getSqlSession()) {
      ProjectMapper projectMapper = sqlSession.getMapper(ProjectMapper.class);
```

### UnusedAssignment
Variable `sysUser` initializer `null` is redundant
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/service/SysUserService.java`
#### Snippet
```java

  public SysUserEntity login(HashMap<String, String> mapParams) throws Exception {
    SysUserEntity sysUser = null;
    try (SqlSession sqlSession = MyBatisUtil.getSqlSession()) {
      SysUserMapper sysUserMapper = sqlSession.getMapper(SysUserMapper.class);
```

### UnusedAssignment
Variable `sysUser` initializer `null` is redundant
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/service/SysUserService.java`
#### Snippet
```java

  public SysUserEntity getUserByName(String name, String password) throws Exception {
    SysUserEntity sysUser = null;
    try (SqlSession sqlSession = MyBatisUtil.getSqlSession()) {
      HashMap<String, Object> mapParams = new HashMap<>();
```

### UnusedAssignment
Variable `list` initializer `null` is redundant
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/service/SysUserService.java`
#### Snippet
```java
        userName, email, deptCode, column, field, pageNo, pageSize);

    List<SysUserEntity> list = null;
    try (SqlSession sqlSession = MyBatisUtil.getSqlSession()) {
      SysUserMapper sysUserMapper = sqlSession.getMapper(SysUserMapper.class);
```

### UnusedAssignment
Variable `list` initializer `null` is redundant
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/service/TeamService.java`
#### Snippet
```java
        owner, column, order, pageNo, pageSize);

    List<TeamEntity> list = null;
    try (SqlSession sqlSession = MyBatisUtil.getSqlSession()) {
      TeamMapper teamMapper = sqlSession.getMapper(TeamMapper.class);
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ExperimentManager.java`
#### Snippet
```java
    try {
      MlflowExperimentOptional = mlflowClient.getExperimentByName(id);
      MlflowExperiment = MlflowExperimentOptional.get();
      String mlflowId = MlflowExperiment.getExperimentId();
      mlflowClient.deleteExperiment(mlflowId);
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `notebook == null` is always `true`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/notebook/NotebookCR.java`
#### Snippet
```java
      // Therefore, the status of the notebook should be set to a new enum NOTFOUND.
      LOG.warn("Get error when submitter is finding notebook: {}", getMetadata().getName());
      if (notebook == null) {
        notebook = new Notebook();
      }
```

## RuleId[id=WriteOnlyObject]
### WriteOnlyObject
Write-only object
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/websocket/WebSocketServer.java`
#### Snippet
```java
      .create();

  private static AtomicReference<WebSocketServer> self = new AtomicReference<>();

  private static ConnectionManager connectionManager;
```

### WriteOnlyObject
Write-only object
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/workbench/websocket/NotebookServer.java`
#### Snippet
```java
      .create();

  private static AtomicReference<NotebookServer> self = new AtomicReference<>();

  private ConnectionManager connectionManager;
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuffer.append()` call
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/parser/NotebookSpecParser.java`
#### Snippet
```java
    condaVersionValidationCommand.append(maxVersion);
    condaVersionValidationCommand.append(currentVersion);
    condaVersionValidationCommand.append("if [ \"$(printf '%s\\n' "
            + "\"$minVersion\" \"$maxVersion\" \"$currentVersion\" | sort -V "
            + "| head -n2 | tail -1 )\" != \"$currentVersion\" ]; then echo "
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuffer.append()` call
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/parser/ExperimentSpecParser.java`
#### Snippet
```java
          condaVersionValidationCommand.append(maxVersion);
          condaVersionValidationCommand.append(currentVersion);
          condaVersionValidationCommand.append("if [ \"$(printf '%s\\n' "
              + "\"$minVersion\" \"$maxVersion\" \"$currentVersion\" | sort -V "
              + "| head -n2 | tail -1 )\" != \"$currentVersion\" ]; then echo "
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuffer.append()` call
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/parser/ExperimentSpecParser.java`
#### Snippet
```java
              environmentSpec.getKernelSpec().getName();

          createCommand.append("conda create -n " + condaEnvironmentName);
          for (String channel : environmentSpec.getKernelSpec().getChannels()) {
            createCommand.append(" ");
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/common/Configmap.java`
#### Snippet
```java
          .getObject();
      if (object != null) {
        String jsonString = JsonUtils.toJson(((Map<String, Object>) object).get("metadata"));
        V1ObjectMeta meta = JsonUtils.fromJson(jsonString, V1ObjectMeta.class);
        this.setMetadata(meta);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'. Reason: 'provider' has raw type, so result of getFilterClass is erased
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/SubmarineServer.java`
#### Snippet
```java
    if (securityProvider.isPresent()) {
      SecurityProvider provider = securityProvider.get();
      Class<Filter> filterClass = provider.getFilterClass();
      // add filter
      LOG.info("Add {} to support auth", filterClass);
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.submarine.server.utils.response.JsonResponse.ListResult' to 'org.apache.submarine.server.utils.response.JsonResponse.ListResult'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/ProjectRestApi.java`
#### Snippet
```java
    }
    PageInfo<ProjectEntity> page = new PageInfo<>(projectList);
    ListResult<ProjectEntity> listResult = new ListResult(projectList, page.getTotal());
    return new JsonResponse.Builder<ListResult<ProjectEntity>>(Response.Status.OK)
        .success(true).result(listResult).build();
```

### UNCHECKED_WARNING
Unchecked call to 'ListResult(List, long)' as a member of raw type 'org.apache.submarine.server.utils.response.JsonResponse.ListResult'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/ProjectRestApi.java`
#### Snippet
```java
    }
    PageInfo<ProjectEntity> page = new PageInfo<>(projectList);
    ListResult<ProjectEntity> listResult = new ListResult(projectList, page.getTotal());
    return new JsonResponse.Builder<ListResult<ProjectEntity>>(Response.Status.OK)
        .success(true).result(listResult).build();
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.submarine.server.utils.response.JsonResponse.ListResult' to 'org.apache.submarine.server.utils.response.JsonResponse.ListResult'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/SystemRestApi.java`
#### Snippet
```java
      }
      PageInfo<SysUserEntity> page = new PageInfo<>(list);
      ListResult<SysUserEntity> listResult = new ListResult(list, page.getTotal());

      return new JsonResponse.Builder<ListResult<SysUserEntity>>(Response.Status.OK)
```

### UNCHECKED_WARNING
Unchecked call to 'ListResult(List, long)' as a member of raw type 'org.apache.submarine.server.utils.response.JsonResponse.ListResult'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/SystemRestApi.java`
#### Snippet
```java
      }
      PageInfo<SysUserEntity> page = new PageInfo<>(list);
      ListResult<SysUserEntity> listResult = new ListResult(list, page.getTotal());

      return new JsonResponse.Builder<ListResult<SysUserEntity>>(Response.Status.OK)
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.submarine.server.utils.response.JsonResponse.ListResult' to 'org.apache.submarine.server.utils.response.JsonResponse.ListResult'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/TeamRestApi.java`
#### Snippet
```java
    }
    PageInfo<TeamEntity> page = new PageInfo<>(teams);
    ListResult<TeamEntity> listResult = new ListResult(teams, page.getTotal());
    return new JsonResponse.Builder<ListResult<TeamEntity>>(Response.Status.OK)
        .success(true).result(listResult).build();
```

### UNCHECKED_WARNING
Unchecked call to 'ListResult(List, long)' as a member of raw type 'org.apache.submarine.server.utils.response.JsonResponse.ListResult'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/TeamRestApi.java`
#### Snippet
```java
    }
    PageInfo<TeamEntity> page = new PageInfo<>(teams);
    ListResult<TeamEntity> listResult = new ListResult(teams, page.getTotal());
    return new JsonResponse.Builder<ListResult<TeamEntity>>(Response.Status.OK)
        .success(true).result(listResult).build();
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.submarine.server.utils.response.JsonResponse.ListResult' to 'org.apache.submarine.server.utils.response.JsonResponse.ListResult'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/SysDeptRestApi.java`
#### Snippet
```java
    long sizeDeptTreeList = DepartmentUtil.getDeptTreeSize(sysDeptTreeList);
    if (sysDeptList.size() != sizeDeptTreeList) {
      ListResult<SysDeptEntity> listResult = new ListResult(sysDeptList, page.getTotal());

      JsonResponse.Builder builder = new JsonResponse.Builder<ListResult<SysDeptEntity>>(Response.Status.OK)
```

### UNCHECKED_WARNING
Unchecked call to 'ListResult(List, long)' as a member of raw type 'org.apache.submarine.server.utils.response.JsonResponse.ListResult'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/SysDeptRestApi.java`
#### Snippet
```java
    long sizeDeptTreeList = DepartmentUtil.getDeptTreeSize(sysDeptTreeList);
    if (sysDeptList.size() != sizeDeptTreeList) {
      ListResult<SysDeptEntity> listResult = new ListResult(sysDeptList, page.getTotal());

      JsonResponse.Builder builder = new JsonResponse.Builder<ListResult<SysDeptEntity>>(Response.Status.OK)
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.submarine.server.utils.response.JsonResponse.ListResult' to 'org.apache.submarine.server.utils.response.JsonResponse.ListResult'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/SysDeptRestApi.java`
#### Snippet
```java
      return builder.build();
    } else {
      ListResult<SysDeptTree> listResult = new ListResult(sysDeptTreeList, page.getTotal());
      return new JsonResponse.Builder<ListResult<SysDeptTree>>(Response.Status.OK)
          .success(true).result(listResult).build();
```

### UNCHECKED_WARNING
Unchecked call to 'ListResult(List, long)' as a member of raw type 'org.apache.submarine.server.utils.response.JsonResponse.ListResult'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/SysDeptRestApi.java`
#### Snippet
```java
      return builder.build();
    } else {
      ListResult<SysDeptTree> listResult = new ListResult(sysDeptTreeList, page.getTotal());
      return new JsonResponse.Builder<ListResult<SysDeptTree>>(Response.Status.OK)
          .success(true).result(listResult).build();
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.submarine.server.utils.response.JsonResponse.ListResult' to 'org.apache.submarine.server.utils.response.JsonResponse.ListResult'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/SysUserRestApi.java`
#### Snippet
```java
    }
    PageInfo<SysUserEntity> page = new PageInfo<>(list);
    ListResult<SysUserEntity> listResult = new ListResult(list, page.getTotal());

    return new JsonResponse.Builder<ListResult<SysUserEntity>>(Response.Status.OK)
```

### UNCHECKED_WARNING
Unchecked call to 'ListResult(List, long)' as a member of raw type 'org.apache.submarine.server.utils.response.JsonResponse.ListResult'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/SysUserRestApi.java`
#### Snippet
```java
    }
    PageInfo<SysUserEntity> page = new PageInfo<>(list);
    ListResult<SysUserEntity> listResult = new ListResult(list, page.getTotal());

    return new JsonResponse.Builder<ListResult<SysUserEntity>>(Response.Status.OK)
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Optional' to 'java.util.Optional'. Reason: 'securityProvider.get()' has raw type, so result of perform is erased
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/SysUserRestApi.java`
#### Snippet
```java
    Optional<SecurityProvider> securityProvider = SecurityFactory.getSecurityProvider();
    if (securityProvider.isPresent()) {
      Optional<CommonProfile> profileOpt = securityProvider.get().perform(hsRequest, hsResponse);
      if (profileOpt.isPresent()) {
        // Get user information
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.submarine.server.utils.response.JsonResponse.ListResult' to 'org.apache.submarine.server.utils.response.JsonResponse.ListResult'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/SysDictRestApi.java`
#### Snippet
```java
    }
    PageInfo<SysDictEntity> page = new PageInfo<>(list);
    ListResult<SysDictEntity> listResult = new ListResult(list, page.getTotal());

    return new JsonResponse.Builder<ListResult<SysDictEntity>>(Response.Status.OK)
```

### UNCHECKED_WARNING
Unchecked call to 'ListResult(List, long)' as a member of raw type 'org.apache.submarine.server.utils.response.JsonResponse.ListResult'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/SysDictRestApi.java`
#### Snippet
```java
    }
    PageInfo<SysDictEntity> page = new PageInfo<>(list);
    ListResult<SysDictEntity> listResult = new ListResult(list, page.getTotal());

    return new JsonResponse.Builder<ListResult<SysDictEntity>>(Response.Status.OK)
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.submarine.server.utils.response.JsonResponse.ListResult' to 'org.apache.submarine.server.utils.response.JsonResponse.ListResult'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/SysDictItemRestApi.java`
#### Snippet
```java
    }
    PageInfo<SysDictItemEntity> page = new PageInfo<>(list);
    ListResult<SysDictItemEntity> listResult = new ListResult(list, page.getTotal());

    return new JsonResponse.Builder<ListResult>(Response.Status.OK)
```

### UNCHECKED_WARNING
Unchecked call to 'ListResult(List, long)' as a member of raw type 'org.apache.submarine.server.utils.response.JsonResponse.ListResult'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/SysDictItemRestApi.java`
#### Snippet
```java
    }
    PageInfo<SysDictItemEntity> page = new PageInfo<>(list);
    ListResult<SysDictItemEntity> listResult = new ListResult(list, page.getTotal());

    return new JsonResponse.Builder<ListResult>(Response.Status.OK)
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.submarine.server.utils.response.JsonResponse.ListResult' to 'org.apache.submarine.server.utils.response.JsonResponse.ListResult'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/SysDictItemRestApi.java`
#### Snippet
```java
    SysDictItemService sysDictItemService = new SysDictItemService();
    List<SysDictItemEntity> dictItems = sysDictItemService.queryDictByCode(dictCode);
    ListResult<SysDictItemEntity> listResult = new ListResult(dictItems, dictItems.size());

    return new JsonResponse.Builder<ListResult<SysDictItemEntity>>(Response.Status.OK)
```

### UNCHECKED_WARNING
Unchecked call to 'ListResult(List, long)' as a member of raw type 'org.apache.submarine.server.utils.response.JsonResponse.ListResult'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/SysDictItemRestApi.java`
#### Snippet
```java
    SysDictItemService sysDictItemService = new SysDictItemService();
    List<SysDictItemEntity> dictItems = sysDictItemService.queryDictByCode(dictCode);
    ListResult<SysDictItemEntity> listResult = new ListResult(dictItems, dictItems.size());

    return new JsonResponse.Builder<ListResult<SysDictItemEntity>>(Response.Status.OK)
```

### UNCHECKED_WARNING
Unchecked call to 'setRecords(List)' as a member of raw type 'org.apache.submarine.server.utils.response.JsonResponse.ListResult'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/response/DictAnnotation.java`
#### Snippet
```java
        dicts.add(newObj);
      }
      listResult.setRecords(dicts);

      return true;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/websocket/Message.java`
#### Snippet
```java

  public <T> T getType(String key) {
    return (T) data.get(key);
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/workbench/websocket/Message.java`
#### Snippet
```java

  public <T> T getType(String key) {
    return (T) data.get(key);
  }

```

### UNCHECKED_WARNING
Unchecked assignment: '? extends io.javaoperatorsdk.operator.api.reconciler.Reconciler' to 'io.javaoperatorsdk.operator.api.reconciler.Reconciler'
in `submarine-server/server-submitter/submarine-k8s-agent/src/main/java/org/apache/submarine/server/k8s/agent/SubmarineAgentListener.java`
#### Snippet
```java
          try {
            LOGGER.info("Register {} ...", reconciler.getName());
            operator.register(reconciler.getDeclaredConstructor().newInstance(),
                ControllerConfigurationOverrider::watchingOnlyCurrentNamespace
            );
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `name`
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/InternalServiceRestApi.java`
#### Snippet
```java
  /**
   * Update status of custom resource
   * @param name Name of the environment
   * @param spec environment spec
   * @return the detailed info about updated environment
```

### JavadocReference
Cannot resolve symbol `spec`
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/InternalServiceRestApi.java`
#### Snippet
```java
   * Update status of custom resource
   * @param name Name of the environment
   * @param spec environment spec
   * @return the detailed info about updated environment
  */
```

### JavadocReference
Cannot resolve symbol `SecurityLogic`
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/security/SecurityProvider.java`
#### Snippet
```java

  /**
   * Create {@link SecurityLogic}
   */
  protected SecurityLogic createSecurityLogic() {
```

### JavadocReference
Cannot resolve symbol `WebContext`
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/security/SecurityProvider.java`
#### Snippet
```java

  /**
   * Create {@link WebContext}
   */
  protected WebContext createWebContext(HttpServletRequest hsRequest, HttpServletResponse hsResponse) {
```

### JavadocReference
Cannot resolve symbol `HttpActionAdapter`
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/security/SecurityProvider.java`
#### Snippet
```java

  /**
   * Create {@link HttpActionAdapter}
   */
  protected HttpActionAdapter createHttpActionAdapter() {
```

### JavadocReference
Cannot resolve symbol `SessionStore`
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/security/SecurityProvider.java`
#### Snippet
```java

  /**
   * Create {@link SessionStore}
   */
  protected SessionStore createSessionStore(HttpServletRequest hsRequest, HttpServletResponse hsResponse) {
```

### JavadocReference
Cannot resolve symbol `CallbackLogic`
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/security/SecurityProvider.java`
#### Snippet
```java

  /**
   * Create {@link CallbackLogic}
   */
  protected CallbackLogic createCallbackLogic() {
```

### JavadocReference
Cannot resolve symbol `LogoutLogic`
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/security/SecurityProvider.java`
#### Snippet
```java

  /**
   * Create {@link LogoutLogic}
   */
  protected LogoutLogic createLogoutLogic() {
```

### JavadocReference
Cannot resolve symbol `Map`
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/spec/NotebookMeta.java`
#### Snippet
```java
  /**
   * Set the labels on Notebook
   * @param Map labels
   */
  public Map<String, String> getLabels() {
```

### JavadocReference
Cannot resolve symbol `org.apache.ibatis.datasource.pooled.PooledDataSource`
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/utils/MyBatisUtil.java`
#### Snippet
```java

  /**
   * Get datasource {@link org.apache.ibatis.datasource.pooled.PooledDataSource}
   */
  public static DataSource getDatasource() {
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/util/NotebookUtils.java`
#### Snippet
```java
    PARSE_OPT_GET,
    PARSE_OPT_REPLACE,
    PARSE_OPT_DELETE;
  }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/NetworkUtils.java`
#### Snippet
```java
  public static int findRandomAvailablePortOnAllLocalInterfaces() throws IOException {
    int port;
    try (ServerSocket socket = new ServerSocket(0);) {
      port = socket.getLocalPort();
      socket.close();
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/experiment/codelocalizer/GitCodeLocalizer.java`
#### Snippet
```java
      return this.mode;
    }
  };

}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/SubmarineServer.java`
#### Snippet
```java
      try (InputStreamReader reader =
               new InputStreamReader(new FileInputStream(indexFile), "GBK");
           BufferedReader bufferedReader = new BufferedReader(reader);) {
        String lineTxt = null;
        while ((lineTxt = bufferedReader.readLine()) != null) {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/GitUtils.java`
#### Snippet
```java
            .setDirectory(new File(localPath)) // Set the download path
            .setCredentialsProvider(credentialsProvider) // Set permission validation
            .call();) {

      LOG.info("git.tag(): {}", git.tag());
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/internal/InternalServiceManager.java`
#### Snippet
```java
    }
    if (updateObject.get("name") != null) {
      notebook.setName(updateObject.get("name").toString());;
    }
    if (updateObject.get("reason") != null) {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `submarine-serve/src/main/java/org/apache/submarine/serve/seldon/SeldonPredictor.java`
#### Snippet
```java
  }

  public SeldonPredictor(){};

  public String getName() {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/model/entities/RegisteredModelTagEntity.java`
#### Snippet
```java
  }

  public RegisteredModelTagEntity() {};

  public String toString() {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/model/entities/ModelVersionTagEntity.java`
#### Snippet
```java
  }

  public ModelVersionTagEntity() {};

  public String toString() {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/utils/MyBatisUtil.java`
#### Snippet
```java
  static {
    try (Reader reader =
                 Resources.getResourceAsReader("mybatis-config.xml");
    ) {
      checkCalledByTestMethod();
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/entity/TeamEntity.java`
#### Snippet
```java
  private String teamName;

  private List<TeamMemberEntity> collaborators = new ArrayList<>();;

  public String getOwner() {
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getNamespace` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/AgentPod.java`
#### Snippet
```java
    if (LOG.isDebugEnabled()) {
      LOG.debug("Delete AgentPod resource in namespace: {} and name: {}",
              this.getMetadata().getNamespace(), this.getMetadata().getName());
    }
    api.getPodClient().delete(this.getMetadata().getNamespace(), this.getMetadata().getName());
```

### DataFlowIssue
Method invocation `getNamespace` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/AgentPod.java`
#### Snippet
```java
              this.getMetadata().getNamespace(), this.getMetadata().getName());
    }
    api.getPodClient().delete(this.getMetadata().getNamespace(), this.getMetadata().getName());
    return this;
  }
```

### DataFlowIssue
Method invocation `toLowerCase` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/util/MLJobConverter.java`
#### Snippet
```java
      experiment.setUid(details.getUid());
    }
    if (status.getStatus().toLowerCase().equals("success")) {
      experiment.setStatus(Experiment.Status.STATUS_DELETED.getValue());
    }
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/util/MLJobConverter.java`
#### Snippet
```java
          if (condition.getType().toLowerCase().equals("running")) {
            dateTime = condition.getLastTransitionTime();
            experiment.setRunningTime(dateTime.toString());
            break;
          }
```

### DataFlowIssue
Method invocation `toLowerCase` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/util/NotebookUtils.java`
#### Snippet
```java
  private static Notebook buildNotebookResponseFromStatus(V1Status status) {
    Notebook notebook = new Notebook();
    if (status.getStatus().toLowerCase().equals("success")) {
      notebook.setStatus(Notebook.Status.STATUS_TERMINATING.toString());
      notebook.setReason("The notebook instance is terminating");
```

### DataFlowIssue
Method invocation `getContainers` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/mljob/MLJobReplicaSpec.java`
#### Snippet
```java
    V1PodTemplateSpec podSpec = getTemplate();
    return String.join(" ",
        podSpec.getSpec().getContainers().get(0)
            .getResources().getRequests().get("memory").
            getNumber().divide(BigDecimal.valueOf(1000000)).toString() + "M");
```

### DataFlowIssue
Method invocation `getRequests` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/mljob/MLJobReplicaSpec.java`
#### Snippet
```java
    return String.join(" ",
        podSpec.getSpec().getContainers().get(0)
            .getResources().getRequests().get("memory").
            getNumber().divide(BigDecimal.valueOf(1000000)).toString() + "M");
  }
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/mljob/MLJobReplicaSpec.java`
#### Snippet
```java
    return String.join(" ",
        podSpec.getSpec().getContainers().get(0)
            .getResources().getRequests().get("memory").
            getNumber().divide(BigDecimal.valueOf(1000000)).toString() + "M");
  }
```

### DataFlowIssue
Argument `podSpec.getSpec().getContainers().get(0).getCommand()` might be null
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/mljob/MLJobReplicaSpec.java`
#### Snippet
```java
    V1PodTemplateSpec podSpec = getTemplate();
    return String.join(" ",
        podSpec.getSpec().getContainers().get(0).getCommand());
  }

```

### DataFlowIssue
Method invocation `getContainers` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/mljob/MLJobReplicaSpec.java`
#### Snippet
```java
    V1PodTemplateSpec podSpec = getTemplate();
    return String.join(" ",
        podSpec.getSpec().getContainers().get(0).getCommand());
  }

```

### DataFlowIssue
Method invocation `getContainers` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/mljob/MLJobReplicaSpec.java`
#### Snippet
```java
  public String getContainerImageName() {
    V1PodTemplateSpec podSpec = getTemplate();
    return podSpec.getSpec().getContainers().get(0)
        .getImage();
  }
```

### DataFlowIssue
Method invocation `getContainers` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/mljob/MLJobReplicaSpec.java`
#### Snippet
```java
  public String getContainerCpu() {
    V1PodTemplateSpec podSpec = getTemplate();
    return podSpec.getSpec().getContainers().get(0)
        .getResources().getLimits().get("cpu").getNumber().toString();
  }
```

### DataFlowIssue
Method invocation `getLimits` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/mljob/MLJobReplicaSpec.java`
#### Snippet
```java
    V1PodTemplateSpec podSpec = getTemplate();
    return podSpec.getSpec().getContainers().get(0)
        .getResources().getLimits().get("cpu").getNumber().toString();
  }

```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/mljob/MLJobReplicaSpec.java`
#### Snippet
```java
    V1PodTemplateSpec podSpec = getTemplate();
    return podSpec.getSpec().getContainers().get(0)
        .getResources().getLimits().get("cpu").getNumber().toString();
  }

```

### DataFlowIssue
Method invocation `getNamespace` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/common/PersistentVolumeClaim.java`
#### Snippet
```java
      if (LOG.isDebugEnabled()) {
        LOG.debug("Delete PersistentVolumeClaim resource in namespace: {} and name: {}",
                this.getMetadata().getNamespace(), this.getMetadata().getName());
      }
      return api.getPersistentVolumeClaimClient()
```

### DataFlowIssue
Method invocation `getNamespace` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/common/PersistentVolumeClaim.java`
#### Snippet
```java
      return api.getPersistentVolumeClaimClient()
          .delete(
              this.getMetadata().getNamespace(),
              this.getMetadata().getName()
          ).throwsApiException().getObject();
```

### DataFlowIssue
Method invocation `getNamespace` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/common/PersistentVolumeClaim.java`
#### Snippet
```java
      return api.getPersistentVolumeClaimClient()
          .create(
              this.getMetadata().getNamespace(),
              this, new CreateOptions()
          ).throwsApiException().throwsApiException().getObject();
```

### DataFlowIssue
Method invocation `getContainers` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/notebook/NotebookCRSpec.java`
#### Snippet
```java
  public List<V1EnvVar> getEnvs() {
    V1PodTemplateSpec podSpec = getTemplate();
    return podSpec.getSpec().getContainers().get(0).getEnv();
  }
}
```

### DataFlowIssue
Method invocation `getContainers` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/notebook/NotebookCRSpec.java`
#### Snippet
```java
  public String getContainerCpu() {
    V1PodTemplateSpec podSpec = getTemplate();
    return podSpec.getSpec().getContainers().get(0)
            .getResources().getLimits().get("cpu").getNumber().toString();
  }
```

### DataFlowIssue
Method invocation `getLimits` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/notebook/NotebookCRSpec.java`
#### Snippet
```java
    V1PodTemplateSpec podSpec = getTemplate();
    return podSpec.getSpec().getContainers().get(0)
            .getResources().getLimits().get("cpu").getNumber().toString();
  }

```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/notebook/NotebookCRSpec.java`
#### Snippet
```java
    V1PodTemplateSpec podSpec = getTemplate();
    return podSpec.getSpec().getContainers().get(0)
            .getResources().getLimits().get("cpu").getNumber().toString();
  }

```

### DataFlowIssue
Method invocation `getContainers` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/notebook/NotebookCRSpec.java`
#### Snippet
```java
    V1PodTemplateSpec podSpec = getTemplate();
    return String.join(" ",
            podSpec.getSpec().getContainers().get(0)
                    .getResources().getLimits().get("memory").
                    getNumber().divide(BigDecimal.valueOf(1024 * 1024 * 1024)).toString() + "Gi");
```

### DataFlowIssue
Method invocation `getLimits` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/notebook/NotebookCRSpec.java`
#### Snippet
```java
    return String.join(" ",
            podSpec.getSpec().getContainers().get(0)
                    .getResources().getLimits().get("memory").
                    getNumber().divide(BigDecimal.valueOf(1024 * 1024 * 1024)).toString() + "Gi");
  }
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/notebook/NotebookCRSpec.java`
#### Snippet
```java
    return String.join(" ",
            podSpec.getSpec().getContainers().get(0)
                    .getResources().getLimits().get("memory").
                    getNumber().divide(BigDecimal.valueOf(1024 * 1024 * 1024)).toString() + "Gi");
  }
```

### DataFlowIssue
Method invocation `getContainers` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/notebook/NotebookCRSpec.java`
#### Snippet
```java
  public String getContainerImageName() {
    V1PodTemplateSpec podSpec = getTemplate();
    return podSpec.getSpec().getContainers().get(0).getImage();
  }

```

### DataFlowIssue
Method invocation `getContainers` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/notebook/NotebookCRSpec.java`
#### Snippet
```java
  public String getContainerGpu() {
    V1PodTemplateSpec podSpec = getTemplate();
    return podSpec.getSpec().getContainers().get(0)
            .getResources().getLimits().get("nvidia.com/gpu").getNumber().toString();
  }
```

### DataFlowIssue
Method invocation `getLimits` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/notebook/NotebookCRSpec.java`
#### Snippet
```java
    V1PodTemplateSpec podSpec = getTemplate();
    return podSpec.getSpec().getContainers().get(0)
            .getResources().getLimits().get("nvidia.com/gpu").getNumber().toString();
  }

```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/notebook/NotebookCRSpec.java`
#### Snippet
```java
    V1PodTemplateSpec podSpec = getTemplate();
    return podSpec.getSpec().getContainers().get(0)
            .getResources().getLimits().get("nvidia.com/gpu").getNumber().toString();
  }

```

### DataFlowIssue
Method invocation `getNamespace` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/common/Configmap.java`
#### Snippet
```java
      Object object = api.getConfigMapClient()
          .get(
              this.getMetadata().getNamespace(),
              this.getMetadata().getName()
          ).throwsApiException()
```

### DataFlowIssue
Method invocation `getNamespace` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/common/Configmap.java`
#### Snippet
```java
      return api.getConfigMapClient()
          .create(
              this.getMetadata().getNamespace(),
              this,
              new CreateOptions()
```

### DataFlowIssue
Method invocation `getResourceVersion` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/common/Configmap.java`
#### Snippet
```java
      }
      // reset metadata to get resource version so that we can replace configmap
      if (StringUtils.isBlank(this.getMetadata().getResourceVersion())) {
        resetMeta(api);
      }
```

### DataFlowIssue
Method invocation `getNamespace` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/common/Configmap.java`
#### Snippet
```java
      if (LOG.isDebugEnabled()) {
        LOG.debug("Delete ConfigMap resource in namespace: {} and name: {}",
                this.getMetadata().getNamespace(), this.getMetadata().getName());
      }
      V1Status status = api.getConfigMapClient()
```

### DataFlowIssue
Method invocation `getNamespace` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/common/Configmap.java`
#### Snippet
```java
      V1Status status = api.getConfigMapClient()
          .delete(
              this.getMetadata().getNamespace(),
              this.getMetadata().getName()
          ).throwsApiException()
```

### DataFlowIssue
Method invocation `addInitContainersItem` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/tfjob/TFJob.java`
#### Snippet
```java
      if (replicaSet.keySet().contains(TFJobReplicaType.Ps)) {
        MLJobReplicaSpec psSpec = replicaSet.get(TFJobReplicaType.Ps);
        psSpec.getTemplate().getSpec().addInitContainersItem(initContainer);
      } else {
        throw new InvalidSpecException("PreHandler only support TFJob with PS for now");
```

### DataFlowIssue
Argument `path` might be null
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/SubmarineConfiguration.java`
#### Snippet
```java

  public String getRelativeDir(String path) {
    if (path != null && path.startsWith(File.separator) || isWindowsPath(path)) {
      return path;
    } else {
```

### DataFlowIssue
Method invocation `getAvailableReplicas` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/K8sSubmitter.java`
#### Snippet
```java
    V1Deployment deploy = k8sClient.getAppsV1Api()
            .readNamespacedDeploymentStatus(name, getServerNamespace(), "true");
    return deploy == null ? false : Optional.ofNullable(deploy.getStatus().getAvailableReplicas())
            .map(ar -> ar > 0).orElse(false); // at least one replica is running
  }
```

### DataFlowIssue
Method invocation `getName` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/K8sSubmitter.java`
#### Snippet
```java
              .throwsApiException().getObject();
      for (V1Pod pod : podList.getItems()) {
        String podName = pod.getMetadata().getName();
        String podLog = k8sClient.getCoreApi().readNamespacedPodLog(
                podName, getServerNamespace(), null, Boolean.FALSE, null,
```

### DataFlowIssue
Method invocation `getName` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/K8sSubmitter.java`
#### Snippet
```java
              .throwsApiException().getObject();
      for (V1Pod pod : podList.getItems()) {
        String podName = pod.getMetadata().getName();
        experimentLog.addPodLog(podName, null);
      }
```

### DataFlowIssue
Method invocation `addInitContainersItem` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/xgboostjob/XGBoostJob.java`
#### Snippet
```java

        if (initContainer != null && replicaType.equals("Master")) {
          podTemplateSpec.getSpec().addInitContainersItem(initContainer);
        }

```

### DataFlowIssue
Method invocation `addInitContainersItem` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/pytorchjob/PyTorchJob.java`
#### Snippet
```java

        if (initContainer != null && replicaType.equals("Master")) {
          podTemplateSpec.getSpec().addInitContainersItem(initContainer);
        }

```

### DataFlowIssue
Dereference of `podSpec.getInitContainers()` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/experiment/codelocalizer/SSHGitCodeLocalizer.java`
#### Snippet
```java
  public void localize(V1PodSpec podSpec) {
    super.localize(podSpec);
    for (V1Container container : podSpec.getInitContainers()) {
      if (container.getName().equals(CODE_LOCALIZER_INIT_CONTAINER_NAME)) {
        List<V1EnvVar> gitSyncEnvVars = container.getEnv();
```

### DataFlowIssue
Method invocation `add` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/experiment/codelocalizer/SSHGitCodeLocalizer.java`
#### Snippet
```java
        sshEnv.setName(GIT_SYNC_SSH_NAME);
        sshEnv.setValue(GIT_SYNC_SSH_VALUE);
        gitSyncEnvVars.add(sshEnv);

        List<V1VolumeMount> mounts = container.getVolumeMounts();
```

### DataFlowIssue
Method invocation `add` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/experiment/codelocalizer/SSHGitCodeLocalizer.java`
#### Snippet
```java
        mount.setMountPath(GIT_SECRET_PATH);
        mount.setReadOnly(true);
        mounts.add(mount);

        V1SecurityContext containerSecurityContext =
```

### DataFlowIssue
Method invocation `getEnvironmentSpec` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/parser/NotebookSpecParser.java`
#### Snippet
```java

    // Environment
    if (getEnvironment(notebookSpec) != null && getEnvironment(notebookSpec).getEnvironmentSpec() != null) {
      EnvironmentSpec environmentSpec = getEnvironment(notebookSpec).getEnvironmentSpec();
      String baseImage = environmentSpec.getDockerImage();
```

### DataFlowIssue
Method invocation `getEnvironmentSpec` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/parser/NotebookSpecParser.java`
#### Snippet
```java
    // Environment
    if (getEnvironment(notebookSpec) != null && getEnvironment(notebookSpec).getEnvironmentSpec() != null) {
      EnvironmentSpec environmentSpec = getEnvironment(notebookSpec).getEnvironmentSpec();
      String baseImage = environmentSpec.getDockerImage();
      KernelSpec kernel = environmentSpec.getKernelSpec();
```

### DataFlowIssue
Dereference of `initContainerVolumeMounts` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/parser/ExperimentSpecParser.java`
#### Snippet
```java

        // Populate container volume mounts using Init container info
        for (V1VolumeMount initContainerVolumeMount : initContainerVolumeMounts) {
          String volumeName = initContainerVolumeMount.getName();
          String path = initContainerVolumeMount.getMountPath();
```

### DataFlowIssue
Method invocation `add` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/parser/ExperimentSpecParser.java`
#### Snippet
```java
            secret.setDefaultMode(SSHGitCodeLocalizer.GIT_SECRET_MODE);
            volume.setSecret(secret);
            existingVolumes.add(volume);

            // Pod level security context
```

### DataFlowIssue
Method invocation `add` may produce `NullPointerException`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/parser/ExperimentSpecParser.java`
#### Snippet
```java
        codeEnvVar.setValue(AbstractCodeLocalizer.CODE_LOCALIZER_PATH);
        List<V1EnvVar> envVars = container.getEnv();
        envVars.add(codeEnvVar);
        container.setEnv(envVars);
      }
```

### DataFlowIssue
Variable is already assigned to this value
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ExperimentTemplateManager.java`
#### Snippet
```java
  private ExperimentTemplate createOrUpdateExperimentTemplate(ExperimentTemplateSpec spec, String operation) {

    spec = addResourcesParameter(spec);

    ExperimentTemplateEntity entity = new ExperimentTemplateEntity();
```

### DataFlowIssue
Method invocation `getFile` may produce `NullPointerException`
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/utils/MybatisGenerator.java`
#### Snippet
```java
    // If a null pointer here, write directly absolute path.
    String genCfg = "/mbgConfiguration.xml";
    File configFile = new File(MybatisGenerator.class.getResource(genCfg).getFile());
    ConfigurationParser cp = new ConfigurationParser(warnings);
    Configuration config = null;
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
`toLowerCase()` call can be replaced with 'equalsIgnoreCase()'
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/util/MLJobConverter.java`
#### Snippet
```java
      experiment.setUid(details.getUid());
    }
    if (status.getStatus().toLowerCase().equals("success")) {
      experiment.setStatus(Experiment.Status.STATUS_DELETED.getValue());
    }
```

### StringOperationCanBeSimplified
`toLowerCase()` call can be replaced with 'equalsIgnoreCase()'
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/util/MLJobConverter.java`
#### Snippet
```java
        experiment.setStatus(Experiment.Status.STATUS_RUNNING.getValue());
        for (V1JobCondition condition : conditions) {
          if (condition.getType().toLowerCase().equals("running")) {
            dateTime = condition.getLastTransitionTime();
            experiment.setRunningTime(dateTime.toString());
```

### StringOperationCanBeSimplified
`toLowerCase()` call can be replaced with 'equalsIgnoreCase()'
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/util/NotebookUtils.java`
#### Snippet
```java
  private static Notebook buildNotebookResponseFromStatus(V1Status status) {
    Notebook notebook = new Notebook();
    if (status.getStatus().toLowerCase().equals("success")) {
      notebook.setStatus(Notebook.Status.STATUS_TERMINATING.toString());
      notebook.setReason("The notebook instance is terminating");
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/SysDeptRestApi.java`
#### Snippet
```java
  @SubmarineApi
  public Response deleteBatch(@QueryParam("ids") String ids) {
    LOG.info("deleteBatch({})", ids.toString());
    try (SqlSession sqlSession = MyBatisUtil.getSqlSession()) {
      SysDeptMapper sysDeptMapper = sqlSession.getMapper(SysDeptMapper.class);
```

### StringOperationCanBeSimplified
`toLowerCase()` call can be replaced with 'equalsIgnoreCase()'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ExperimentManager.java`
#### Snippet
```java
      Experiment experiment = buildExperimentFromEntity(entity);

      if (status == null || status.toLowerCase().equals(experiment.getStatus().toLowerCase())) {

        experimentLogList.add(submitter.getExperimentLogName(
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ExperimentTemplateManager.java`
#### Snippet
```java
      ExperimentTemplateParamSpec parm3 = new ExperimentTemplateParamSpec();
      parm3.setName(String.format("spec.%s.resourceMap.memory", entrySet.getKey()));
      parm3.setValue(taskSpec.getMemory() == null ? "1" : taskSpec.getMemory().toString());
      parm3.setRequired("false");
      parm3.setDescription("");
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/service/SysUserService.java`
#### Snippet
```java

  public boolean delete(String id) throws Exception {
    LOG.info("delete({})", id.toString());
    try (SqlSession sqlSession = MyBatisUtil.getSqlSession()) {
      SysUserMapper userMapper = sqlSession.getMapper(SysUserMapper.class);
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/parser/ExperimentSpecParser.java`
#### Snippet
```java
        String suffix = memoryRequest.substring(memoryRequest.length() - 1);
        String value = memoryRequest.substring(0, memoryRequest.length() - 1);
        String memoryLimit = String.valueOf(Integer.parseInt(value) * 2) + suffix;
        resources.put("memory", new Quantity(memoryLimit));
      }
```

## RuleId[id=WebProperties]
### WebProperties
Cannot resolve class or package 'glassfish'
in `submarine-workbench/workbench-web/src/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>default</servlet-name>
    <servlet-class>org.glassfish.jersey.servlet.ServletContainer</servlet-class>
    <init-param>
      <param-name>jersey.config.server.provider.packages</param-name>
```

### WebProperties
Cannot resolve class or package 'jersey'
in `submarine-workbench/workbench-web/src/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>default</servlet-name>
    <servlet-class>org.glassfish.jersey.servlet.ServletContainer</servlet-class>
    <init-param>
      <param-name>jersey.config.server.provider.packages</param-name>
```

### WebProperties
Cannot resolve class or package 'servlet'
in `submarine-workbench/workbench-web/src/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>default</servlet-name>
    <servlet-class>org.glassfish.jersey.servlet.ServletContainer</servlet-class>
    <init-param>
      <param-name>jersey.config.server.provider.packages</param-name>
```

### WebProperties
Cannot resolve class 'ServletContainer'
in `submarine-workbench/workbench-web/src/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>default</servlet-name>
    <servlet-class>org.glassfish.jersey.servlet.ServletContainer</servlet-class>
    <init-param>
      <param-name>jersey.config.server.provider.packages</param-name>
```

### WebProperties
Cannot resolve class or package 'apache'
in `submarine-workbench/workbench-web/src/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>Bootstrap</servlet-name>
    <servlet-class>org.apache.submarine.server.Bootstrap</servlet-class>
    <load-on-startup>2</load-on-startup>
  </servlet>
```

### WebProperties
Cannot resolve class or package 'submarine'
in `submarine-workbench/workbench-web/src/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>Bootstrap</servlet-name>
    <servlet-class>org.apache.submarine.server.Bootstrap</servlet-class>
    <load-on-startup>2</load-on-startup>
  </servlet>
```

### WebProperties
Cannot resolve class or package 'server'
in `submarine-workbench/workbench-web/src/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>Bootstrap</servlet-name>
    <servlet-class>org.apache.submarine.server.Bootstrap</servlet-class>
    <load-on-startup>2</load-on-startup>
  </servlet>
```

### WebProperties
Cannot resolve class 'Bootstrap'
in `submarine-workbench/workbench-web/src/WEB-INF/web.xml`
#### Snippet
```java
  <servlet>
    <servlet-name>Bootstrap</servlet-name>
    <servlet-class>org.apache.submarine.server.Bootstrap</servlet-class>
    <load-on-startup>2</load-on-startup>
  </servlet>
```

## RuleId[id=FinallyBlockCannotCompleteNormally]
### FinallyBlockCannotCompleteNormally
`finally` block can not complete normally
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ExperimentManager.java`
#### Snippet
```java
      String mlflowId = MlflowExperiment.getExperimentId();
      mlflowClient.deleteExperiment(mlflowId);
    } finally {
      return experiment;
    }
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
`contains` can be replaced with 'Map.containsKey()'
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/tfjob/TFJob.java`
#### Snippet
```java
    if (initContainer != null) {
      Map<TFJobReplicaType, MLJobReplicaSpec> replicaSet = this.getSpec().getReplicaSpecs();
      if (replicaSet.keySet().contains(TFJobReplicaType.Ps)) {
        MLJobReplicaSpec psSpec = replicaSet.get(TFJobReplicaType.Ps);
        psSpec.getTemplate().getSpec().addInitContainersItem(initContainer);
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/spec/ExperimentTaskSpec.java`
#### Snippet
```java
    if (resources != null) {
      resourceMap = new HashMap<>();
      for (String item : resources.split(",")) {
        String[] r = item.split("=");
        if (r.length == 2) {
          resourceMap.put(r[0], r[1]);
        }
      }
    }
```

### DuplicatedCode
Duplicated code
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/MetricRestApi.java`
#### Snippet
```java
    List<MetricEntity> metrics;
    try {
      metrics = metricService.selectByPrimaryKeySelective(metric);
    } catch (Exception e) {
      LOG.error(e.toString());
      return new JsonResponse.Builder<Boolean>(Response.Status.OK).success(false).build();
    }
    return new JsonResponse.Builder<List<MetricEntity>>(Response.Status.OK).success(true).
            result(metrics).build();
```

### DuplicatedCode
Duplicated code
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/MetricRestApi.java`
#### Snippet
```java
    try {
      result = metricService.insert(metric);
    } catch (Exception e) {
      LOG.error(e.toString());
      return new JsonResponse.Builder<Boolean>(Response.Status.OK).success(false).build();
    }
    return new JsonResponse.Builder<Boolean>(Response.Status.OK).success(true).result(result).build();
```

### DuplicatedCode
Duplicated code
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/MetricRestApi.java`
#### Snippet
```java
    try {
      result = metricService.deleteById(id);
    } catch (Exception e) {
      LOG.error(e.toString());
      return new JsonResponse.Builder<Boolean>(Response.Status.OK).success(false).build();
    }
    return new JsonResponse.Builder<Boolean>(Response.Status.OK).success(true).result(result).build();
```

### DuplicatedCode
Duplicated code
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/MetricRestApi.java`
#### Snippet
```java
    boolean result = false;
    try {
      result = metricService.update(metric);
    } catch (Exception e) {
      LOG.error(e.toString());
      return new JsonResponse.Builder<Boolean>(Response.Status.OK).success(false).build();
    }
    return new JsonResponse.Builder<Boolean>(Response.Status.OK).success(true).result(result).build();
```

### DuplicatedCode
Duplicated code
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/ParamRestApi.java`
#### Snippet
```java
    List<ParamEntity> params;
    try {
      params = paramService.selectByPrimaryKeySelective(param);
    } catch (Exception e) {
      LOG.error(e.toString());
      return new JsonResponse.Builder<Boolean>(Response.Status.OK).success(false).build();
    }
    return new JsonResponse.Builder<List<ParamEntity>>(Response.Status.OK).success(true).
            result(params).build();
```

### DuplicatedCode
Duplicated code
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/SysUserRestApi.java`
#### Snippet
```java
    PageInfo<SysUserEntity> page = new PageInfo<>(list);
    ListResult<SysUserEntity> listResult = new ListResult(list, page.getTotal());

    return new JsonResponse.Builder<ListResult<SysUserEntity>>(Response.Status.OK)
        .success(true).result(listResult).build();
```

### DuplicatedCode
Duplicated code
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/websocket/WebSocketServer.java`
#### Snippet
```java
    try {
      LOG.info("Got Message: " + msg);
      if (StringUtils.isEmpty(conn.getUser())) {
        connectionManager.addUserConnection("FakeUser1", conn);
      }
    } catch (Exception e) {
      LOG.error("Can't handle message: " + msg, e);
      try {
        conn.send(serializeMessage(new Message(Message.OP.ERROR_INFO).put(
            "info", e.getMessage())));
      } catch (IOException iox) {
        LOG.error("Fail to send error info", iox);
      }
    }
```

### DuplicatedCode
Duplicated code
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/service/JobService.java`
#### Snippet
```java
      Map<String, Object> where = new HashMap<>();
      where.put("userName", userName);
      where.put("column", column);
      where.put("order", order);
      list = projectMapper.selectAll(where, new RowBounds(pageNo, pageSize));
```

### DuplicatedCode
Duplicated code
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/pytorchjob/PyTorchJob.java`
#### Snippet
```java
        MLJobReplicaSpec replicaSpec = new MLJobReplicaSpec();
        replicaSpec.setReplicas(taskSpec.getReplicas());
        V1PodTemplateSpec podTemplateSpec = ExperimentSpecParser.parseTemplateSpec(taskSpec, experimentSpec);

        if (initContainer != null && replicaType.equals("Master")) {
          podTemplateSpec.getSpec().addInitContainersItem(initContainer);
        }

        replicaSpec.setTemplate(podTemplateSpec);
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/SubmarineServer.java`
#### Snippet
```java
        new AbstractBinder() {
          @Override
          protected void configure() {
            bindAsContract(NotebookServer.class)
                .to(WebSocketServlet.class)
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `submarine-commons/commons-runtime/src/main/java/org/apache/submarine/commons/runtime/resource/UnitsConversionUtil.java`
#### Snippet
```java
  private static Set<String> createKnownUnitsSet() {
    Set<String> ret = new HashSet<>();
    ret.addAll(Arrays.asList(UNITS));
    return ret;
  }
```

## RuleId[id=RedundantEscapeInRegexReplacement]
### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/security/common/CommonFilter.java`
#### Snippet
```java
        String api = String.format("/api/%s/%s", path, endpoint);
        if (api.matches("(.*)\\{\\w+\\}(.*)")) {
          REST_REGREX_API_PATHS.add(api.replaceAll("\\{\\w+\\}", "((?!\\/).)*"));
        } else {
          REST_API_PATHS.add(api);
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/mljob/MLJobReplicaSpec.java`
#### Snippet
```java
        podSpec.getSpec().getContainers().get(0)
            .getResources().getRequests().get("memory").
            getNumber().divide(BigDecimal.valueOf(1000000)).toString() + "M");
  }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/notebook/NotebookCRSpec.java`
#### Snippet
```java
            podSpec.getSpec().getContainers().get(0)
                    .getResources().getLimits().get("memory").
                    getNumber().divide(BigDecimal.valueOf(1024 * 1024 * 1024)).toString() + "Gi");
  }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/parser/ExperimentSpecParser.java`
#### Snippet
```java
              + condaEnvironmentName + "\" > ~/.bashrc";
          String pathCommand = "PATH=/opt/conda/envs/env/bin:$PATH";
          String finalCommand = condaVersionValidationCommand.toString() +
              " && " + createCommand.toString() + " && "
              + activateCommand + " && " + pathCommand;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/parser/ExperimentSpecParser.java`
#### Snippet
```java
          String pathCommand = "PATH=/opt/conda/envs/env/bin:$PATH";
          String finalCommand = condaVersionValidationCommand.toString() +
              " && " + createCommand.toString() + " && "
              + activateCommand + " && " + pathCommand;
          initContainer.addCommandItem("/bin/bash");
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/SubmarineServer.java`
#### Snippet
```java
      }

      response.getWriter().print(sbIndexBuf.toString());
    }
  }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/EnvironmentManager.java`
#### Snippet
```java
    }
    checkSpec(spec);
    LOG.info("Update Environment using spec: " + spec.toString());
    return createOrUpdateEnvironment(spec, "u");
  }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/EnvironmentManager.java`
#### Snippet
```java
      throws SubmarineRuntimeException {
    checkSpec(spec);
    LOG.info("Create Environment using spec: " + spec.toString());
    return createOrUpdateEnvironment(spec, "c");
  }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ExperimentTemplateManager.java`
#### Snippet
```java
        throws SubmarineRuntimeException {
    checkSpec(spec);
    LOG.info("Create ExperimentTemplate using spec: " + spec.toString());
    return createOrUpdateExperimentTemplate(spec, "c");
  }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ExperimentTemplateManager.java`
#### Snippet
```java
    if (illegalParamList.size() > 0) {
      throw new SubmarineRuntimeException(Status.BAD_REQUEST.getStatusCode(),
            "Parameters contains illegal key: " + illegalParamList.toString());
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ExperimentTemplateManager.java`
#### Snippet
```java
    if (unusedParamList.size() > 0) {
      throw new SubmarineRuntimeException(Status.BAD_REQUEST.getStatusCode(),
            "Parameters contains unused key: " + unusedParamList.toString());
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ExperimentTemplateManager.java`
#### Snippet
```java
    if (unmapedParamList.size() > 0) {
      throw new SubmarineRuntimeException(Status.BAD_REQUEST.getStatusCode(),
          "Template contains unmapped value: " + unmapedParamList.toString());
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ExperimentTemplateManager.java`
#### Snippet
```java
    }
    checkSpec(spec);
    LOG.info("Update ExperimentTemplate using spec: " + spec.toString());
    return createOrUpdateExperimentTemplate(spec, "u");
  }
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `PodLog` may be 'static'
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/experiment/ExperimentLog.java`
#### Snippet
```java
  private List<PodLog> logContent;

  class PodLog {

    String podName;
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/parser/ExperimentSpecParser.java`
#### Snippet
```java
    );
    podSpec.addVolumesItem(podVolume);
    /**
     * Init Git localize Container
     */
```

### DanglingJavadoc
Dangling Javadoc comment
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/parser/ExperimentSpecParser.java`
#### Snippet
```java
    podSpec.setContainers(containers);

    /**
     * Init Containers
     */
```

### DanglingJavadoc
Dangling Javadoc comment
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/TeamRestApi.java`
#### Snippet
```java
    // TODO(zhulinhao): add message
    // For each of the members, increase the invitation information saved to sys_message table
    /**SysMessage sysMessage = new SysMessage();
     try {
     sysMessageService.add(sysMessage);
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/mljob/MLJob.java`
#### Snippet
```java
      return false;
    else if (handlerSpec.get("FILE_SYSTEM_TYPE").equals("HDFS")) {
      if ((handlerSpec.get("HDFS_HOST") == null) || (handlerSpec.get("HDFS_PORT") == null) ||
          (handlerSpec.get("HDFS_SOURCE") == null) || (handlerSpec.get("ENABLE_KERBEROS") == null)) {
        return false;
```

### TrivialIf
`if` statement can be simplified
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/SubmarineConfiguration.java`
#### Snippet
```java
  public boolean isClusterMode() {
    String clusterAddr = getString(SubmarineConfVars.ConfVars.SUBMARINE_CLUSTER_ADDR);
    if (StringUtils.isEmpty(clusterAddr)) {
      return false;
    }
```

### TrivialIf
`if` statement can be simplified
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/utils/DepartmentUtil.java`
#### Snippet
```java
      return true;
    }
    if ("null".equals(object)) {
      return true;
    }
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'MlflowExperimentOptional'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ExperimentManager.java`
#### Snippet
```java
  private final AtomicInteger experimentCounter = new AtomicInteger(0);

  private Optional<org.mlflow.api.proto.Service.Experiment> MlflowExperimentOptional;
  private org.mlflow.api.proto.Service.Experiment MlflowExperiment;
  /**
```

## RuleId[id=ComparatorMethodParameterNotUsed]
### ComparatorMethodParameterNotUsed
Comparator never returns negative values
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/AbstractUniqueIdGenerator.java`
#### Snippet
```java
  @SuppressWarnings("rawtypes")
  @Override
  public int compareTo(Object o) {
    AbstractUniqueIdGenerator other = (AbstractUniqueIdGenerator) o;
    return this.getId() > other.getId() ? 1 : 0;
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `builder.result` to `T` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/response/JsonResponse.java`
#### Snippet
```java
    this.message = builder.message;
    this.attributes = builder.attributes;
    this.result = (T) builder.result;
    this.cookies = builder.cookies;
    if (builder.status != null) {
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param spec` tag description is missing
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/ExperimentRestApi.java`
#### Snippet
```java
   *
   * @param name template name
   * @param spec
   * @return the contents of experiment
   */
```

### JavadocDeclaration
Tag `return` is not allowed here
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/RegisteredModelManager.java`
#### Snippet
```java
   * Get the singleton instance.
   *
   * @return object
   */

```

### JavadocDeclaration
Tag `return` is not allowed here
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ModelVersionManager.java`
#### Snippet
```java
   * Get the singleton instance.
   *
   * @return object
   */
  private static class ModelVersionManagerHolder {
```

### JavadocDeclaration
Tag `return` is not allowed here
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ModelManager.java`
#### Snippet
```java
   * Get the singleton instance.
   *
   * @return object
   */
  private static class ModelManagerHolder {
```

### JavadocDeclaration
`@param spec` tag description is missing
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/Submitter.java`
#### Snippet
```java
  /**
   * Create Serve with spec
   * @param spec
   * @throws SubmarineRuntimeException running error
   */
```

### JavadocDeclaration
Parameter name expected
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/Submitter.java`
#### Snippet
```java
  /**
   * Get mlflow meta data
   * @param
   * @return object
   * @throws SubmarineRuntimeException running error
```

### JavadocDeclaration
`@param spec` tag description is missing
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/Submitter.java`
#### Snippet
```java
  /**
   * Delete Serve with spec
   * @param spec
   * @throws SubmarineRuntimeException running error
   */
```

### JavadocDeclaration
Parameter name expected
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/Submitter.java`
#### Snippet
```java
  /**
   * Get tensorboard meta data
   * @param
   * @return object
   * @throws SubmarineRuntimeException running error
```

### JavadocDeclaration
Tag `return` is not allowed here
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/spec/EnvironmentSpec.java`
#### Snippet
```java
  /**
   * Image
   * @return
   */
  private String image;
```

### JavadocDeclaration
Tag `return` is not allowed here
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/spec/NotebookMeta.java`
#### Snippet
```java
  /**
   * get labels on Notebook
   * @return labels
   */
  public void setLabels(Map<String, String> labels) {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `typeName` may be 'final'
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/tfjob/TFJobReplicaType.java`
#### Snippet
```java


  private String typeName;

  TFJobReplicaType(String n) {
```

### FieldMayBeFinal
Field `longValue` may be 'final'
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/SubmarineConfVars.java`
#### Snippet
```java
    private float floatValue;
    private boolean booleanValue;
    private long longValue;


```

### FieldMayBeFinal
Field `type` may be 'final'
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/SubmarineConfVars.java`
#### Snippet
```java
    private Class varClass;
    private String stringValue;
    private VarType type;
    private int intValue;
    private float floatValue;
```

### FieldMayBeFinal
Field `varClass` may be 'final'
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/SubmarineConfVars.java`
#### Snippet
```java
    private String varName;
    @SuppressWarnings("rawtypes")
    private Class varClass;
    private String stringValue;
    private VarType type;
```

### FieldMayBeFinal
Field `stringValue` may be 'final'
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/SubmarineConfVars.java`
#### Snippet
```java
    @SuppressWarnings("rawtypes")
    private Class varClass;
    private String stringValue;
    private VarType type;
    private int intValue;
```

### FieldMayBeFinal
Field `varName` may be 'final'
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/SubmarineConfVars.java`
#### Snippet
```java
    SUBMARINE_AUTH_MAX_AGE_ENV("submarine.auth.maxAge", 60 * 60 * 24);

    private String varName;
    @SuppressWarnings("rawtypes")
    private Class varClass;
```

### FieldMayBeFinal
Field `booleanValue` may be 'final'
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/SubmarineConfVars.java`
#### Snippet
```java
    private int intValue;
    private float floatValue;
    private boolean booleanValue;
    private long longValue;

```

### FieldMayBeFinal
Field `intValue` may be 'final'
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/SubmarineConfVars.java`
#### Snippet
```java
    private String stringValue;
    private VarType type;
    private int intValue;
    private float floatValue;
    private boolean booleanValue;
```

### FieldMayBeFinal
Field `floatValue` may be 'final'
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/SubmarineConfVars.java`
#### Snippet
```java
    private VarType type;
    private int intValue;
    private float floatValue;
    private boolean booleanValue;
    private long longValue;
```

### FieldMayBeFinal
Field `typeName` may be 'final'
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/pytorchjob/PyTorchJobReplicaType.java`
#### Snippet
```java
  Worker("Worker");

  private String typeName;

  PyTorchJobReplicaType(String n) {
```

### FieldMayBeFinal
Field `url` may be 'final'
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/experiment/codelocalizer/AbstractCodeLocalizer.java`
#### Snippet
```java
  public static final String CODE_LOCALIZER_INIT_CONTAINER_NAME = "code-localizer";
  public static final String CODE_LOCALIZER_PATH_ENV_VAR = "CODE_PATH";
  private String url;

  public AbstractCodeLocalizer(String url) {
```

### FieldMayBeFinal
Field `compName` may be 'final'
in `submarine-commons/commons-runtime/src/main/java/org/apache/submarine/commons/runtime/api/PyTorchRole.java`
#### Snippet
```java
  WORKER("worker");

  private String compName;

  PyTorchRole(String compName) {
```

### FieldMayBeFinal
Field `compName` may be 'final'
in `submarine-commons/commons-runtime/src/main/java/org/apache/submarine/commons/runtime/api/TensorFlowRole.java`
#### Snippet
```java
  TENSORBOARD("tensorboard");

  private String compName;

  TensorFlowRole(String compName) {
```

### FieldMayBeFinal
Field `compName` may be 'final'
in `submarine-commons/commons-runtime/src/main/java/org/apache/submarine/commons/runtime/api/MXNetRole.java`
#### Snippet
```java
  SCHEDULER("scheduler");

  private String compName;

  MXNetRole(String compName) {
```

### FieldMayBeFinal
Field `value` may be 'final'
in `submarine-commons/commons-runtime/src/main/java/org/apache/submarine/commons/runtime/Framework.java`
#### Snippet
```java
  TENSORFLOW(Constants.TENSORFLOW_NAME), PYTORCH(Constants.PYTORCH_NAME), MXNET(Constants.MXNET_NAME);

  private String value;

  Framework(String value) {
```

### FieldMayBeFinal
Field `jobsInfo` may be 'final'
in `submarine-commons/commons-runtime/src/main/java/org/apache/submarine/commons/runtime/fs/MemorySubmarineStorage.java`
#### Snippet
```java

public class MemorySubmarineStorage extends SubmarineStorage {
  private Map<String, Map<String, String>> jobsInfo = new HashMap<>();
  private Map<String, Map<String, Map<String, String>>> modelsInfo =
      new HashMap<>();
```

### FieldMayBeFinal
Field `modelsInfo` may be 'final'
in `submarine-commons/commons-runtime/src/main/java/org/apache/submarine/commons/runtime/fs/MemorySubmarineStorage.java`
#### Snippet
```java
public class MemorySubmarineStorage extends SubmarineStorage {
  private Map<String, Map<String, String>> jobsInfo = new HashMap<>();
  private Map<String, Map<String, Map<String, String>>> modelsInfo =
      new HashMap<>();

```

### FieldMayBeFinal
Field `value` may be 'final'
in `submarine-commons/commons-runtime/src/main/java/org/apache/submarine/commons/runtime/api/Runtime.java`
#### Snippet
```java
  TONY(Constants.TONY), YARN_SERVICE(Constants.YARN_SERVICE);

  private String value;

  Runtime(String value) {
```

### FieldMayBeFinal
Field `numerator` may be 'final'
in `submarine-commons/commons-runtime/src/main/java/org/apache/submarine/commons/runtime/resource/UnitsConversionUtil.java`
#### Snippet
```java
   */
  public static class Converter {
    private long numerator;
    private long denominator;

```

### FieldMayBeFinal
Field `denominator` may be 'final'
in `submarine-commons/commons-runtime/src/main/java/org/apache/submarine/commons/runtime/resource/UnitsConversionUtil.java`
#### Snippet
```java
  public static class Converter {
    private long numerator;
    private long denominator;

    Converter(long n, long d) {
```

### FieldMayBeFinal
Field `projectService` may be 'final'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/ProjectRestApi.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(ProjectRestApi.class);

  private ProjectService projectService = new ProjectService();

  @Inject
```

### FieldMayBeFinal
Field `teamService` may be 'final'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/TeamRestApi.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(TeamRestApi.class);

  private TeamService teamService = new TeamService();

  @Inject
```

### FieldMayBeFinal
Field `manager` may be 'final'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/RegisteredModelManager.java`
#### Snippet
```java

  private static class RegisteredModelManagerHolder {
    private static RegisteredModelManager manager = new RegisteredModelManager(
                                                          RegisteredModelService.getInstance(),
                                                          ModelVersionService.getInstance(),
```

### FieldMayBeFinal
Field `pretty` may be 'final'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/response/JsonResponse.java`
#### Snippet
```java
    private Map<String, Object> attributes = new HashMap<>();
    private transient ArrayList<NewCookie> cookies;
    private transient boolean pretty = false;

    public Builder(javax.ws.rs.core.Response.Status status) {
```

### FieldMayBeFinal
Field `attributes` may be 'final'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/response/JsonResponse.java`
#### Snippet
```java
    private String message;
    private T result;
    private Map<String, Object> attributes = new HashMap<>();
    private transient ArrayList<NewCookie> cookies;
    private transient boolean pretty = false;
```

### FieldMayBeFinal
Field `manager` may be 'final'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ModelVersionManager.java`
#### Snippet
```java
   */
  private static class ModelVersionManagerHolder {
    private static ModelVersionManager manager = new ModelVersionManager(ModelVersionService.getInstance(),
                                                                        new ModelVersionTagService(),
                                                                        Client.getInstance());
```

### FieldMayBeFinal
Field `manager` may be 'final'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ModelManager.java`
#### Snippet
```java
   */
  private static class ModelManagerHolder {
    private static ModelManager manager = new ModelManager(SubmitterManager.loadSubmitter(),
                                                            ModelVersionService.getInstance());
  }
```

### FieldMayBeFinal
Field `request` may be 'final'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/websocket/WebSocketHandler.java`
#### Snippet
```java
  private Session connection;
  private WebSocketListener listener;
  private HttpServletRequest request;
  private String protocol;
  private String user;
```

### FieldMayBeFinal
Field `protocol` may be 'final'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/websocket/WebSocketHandler.java`
#### Snippet
```java
  private WebSocketListener listener;
  private HttpServletRequest request;
  private String protocol;
  private String user;

```

### FieldMayBeFinal
Field `listener` may be 'final'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/websocket/WebSocketHandler.java`
#### Snippet
```java
public class WebSocketHandler extends WebSocketAdapter {
  private Session connection;
  private WebSocketListener listener;
  private HttpServletRequest request;
  private String protocol;
```

### FieldMayBeFinal
Field `webSocketServer` may be 'final'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/websocket/BasicWebSocketCreator.java`
#### Snippet
```java
public class BasicWebSocketCreator implements WebSocketCreator {
  private static final Logger LOG = LoggerFactory.getLogger(BasicWebSocketCreator.class);
  private WebSocketServer webSocketServer;

  public BasicWebSocketCreator(WebSocketServer webSocketServer) {
```

### FieldMayBeFinal
Field `notebookServer` may be 'final'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/workbench/websocket/NotebookWebSocketCreator.java`
#### Snippet
```java
public class NotebookWebSocketCreator implements WebSocketCreator {
  private static final Logger LOG = LoggerFactory.getLogger(NotebookWebSocketCreator.class);
  private NotebookServer notebookServer;

  public NotebookWebSocketCreator(NotebookServer notebookServer) {
```

### FieldMayBeFinal
Field `listener` may be 'final'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/workbench/websocket/NotebookSocket.java`
#### Snippet
```java
public class NotebookSocket extends WebSocketAdapter {
  private Session connection;
  private NotebookSocketListener listener;
  private HttpServletRequest request;
  private String protocol;
```

### FieldMayBeFinal
Field `protocol` may be 'final'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/workbench/websocket/NotebookSocket.java`
#### Snippet
```java
  private NotebookSocketListener listener;
  private HttpServletRequest request;
  private String protocol;
  private String user;

```

### FieldMayBeFinal
Field `request` may be 'final'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/workbench/websocket/NotebookSocket.java`
#### Snippet
```java
  private Session connection;
  private NotebookSocketListener listener;
  private HttpServletRequest request;
  private String protocol;
  private String user;
```

### FieldMayBeFinal
Field `executorService` may be 'final'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/websocket/WebSocketServer.java`
#### Snippet
```java
  private static ConnectionManager connectionManager;

  private static ExecutorService executorService = Executors.newFixedThreadPool(10);

  public WebSocketServer() {
```

### FieldMayBeFinal
Field `serviceTypeKey` may be 'final'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/websocket/WebSocketServer.java`
#### Snippet
```java
  protected enum JobManagerServiceType {
    JOB_MANAGER_PAGE("JOB_MANAGER_PAGE");
    private String serviceTypeKey;

    JobManagerServiceType(String serviceType) {
```

### FieldMayBeFinal
Field `self` may be 'final'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/websocket/WebSocketServer.java`
#### Snippet
```java
      .create();

  private static AtomicReference<WebSocketServer> self = new AtomicReference<>();

  private static ConnectionManager connectionManager;
```

### FieldMayBeFinal
Field `gson` may be 'final'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/websocket/WebSocketServer.java`
#### Snippet
```java

  private static final Logger LOG = LoggerFactory.getLogger(WebSocketServer.class);
  private static Gson gson = new GsonBuilder()
      .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
      .registerTypeAdapter(Date.class, new DateJsonDeserializer())
```

### FieldMayBeFinal
Field `serviceTypeKey` may be 'final'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/workbench/websocket/NotebookServer.java`
#### Snippet
```java
  protected enum JobManagerServiceType {
    JOB_MANAGER_PAGE("JOB_MANAGER_PAGE");
    private String serviceTypeKey;

    JobManagerServiceType(String serviceType) {
```

### FieldMayBeFinal
Field `gson` may be 'final'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/workbench/websocket/NotebookServer.java`
#### Snippet
```java

  private static final Logger LOG = LoggerFactory.getLogger(NotebookServer.class);
  private static Gson gson = new GsonBuilder()
      .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
      .registerTypeAdapter(Date.class, new DateJsonDeserializer())
```

### FieldMayBeFinal
Field `connectionManager` may be 'final'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/workbench/websocket/NotebookServer.java`
#### Snippet
```java
  private static AtomicReference<NotebookServer> self = new AtomicReference<>();

  private ConnectionManager connectionManager;

  private ExecutorService executorService = Executors.newFixedThreadPool(10);
```

### FieldMayBeFinal
Field `self` may be 'final'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/workbench/websocket/NotebookServer.java`
#### Snippet
```java
      .create();

  private static AtomicReference<NotebookServer> self = new AtomicReference<>();

  private ConnectionManager connectionManager;
```

### FieldMayBeFinal
Field `executorService` may be 'final'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/workbench/websocket/NotebookServer.java`
#### Snippet
```java
  private ConnectionManager connectionManager;

  private ExecutorService executorService = Executors.newFixedThreadPool(10);

  public NotebookServer() {
```

### FieldMayBeFinal
Field `customResourceType` may be 'final'
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/common/CustomResourceType.java`
#### Snippet
```java
public enum CustomResourceType {
  TFJob("TFJob"), PyTorchJob("PyTorchJob"), XGBoost("XGBoost"), Notebook("Notebook");
  private String customResourceType;

  CustomResourceType(String customResourceType) {
```

### FieldMayBeFinal
Field `value` may be 'final'
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/notebook/Notebook.java`
#### Snippet
```java
    STATUS_NOT_FOUND("not_found");

    private String value;
    Status(String value) {
      this.value = value;
```

### FieldMayBeFinal
Field `value` may be 'final'
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/experiment/Experiment.java`
#### Snippet
```java
    STATUS_FAILED("Failed");

    private String value;
    Status(String value) {
      this.value = value;
```

### FieldMayBeFinal
Field `logContent` may be 'final'
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/experiment/ExperimentLog.java`
#### Snippet
```java
public class ExperimentLog {
  private String experimentId;
  private List<PodLog> logContent;

  class PodLog {
```

### FieldMayBeFinal
Field `service` may be 'final'
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/model/service/ModelVersionService.java`
#### Snippet
```java
public class ModelVersionService {
  private static class ModelVersionServiceHolder {
    private static ModelVersionService service = new ModelVersionService();
  }

```

### FieldMayBeFinal
Field `service` may be 'final'
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/model/service/RegisteredModelTagService.java`
#### Snippet
```java
public class RegisteredModelTagService {
  private static class RegisteredModelTagServiceHolder {
    private static RegisteredModelTagService service = new RegisteredModelTagService();
  }

```

### FieldMayBeFinal
Field `service` may be 'final'
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/model/service/RegisteredModelService.java`
#### Snippet
```java

  private static class RegisteredModelServiceHolder {
    private static RegisteredModelService service = new RegisteredModelService();
  }

```

## RuleId[id=ServletWithoutMappingInspection]
### ServletWithoutMappingInspection
Servlet should have a mapping
in `submarine-workbench/workbench-web/src/WEB-INF/web.xml`
#### Snippet
```java

  <servlet>
    <servlet-name>Bootstrap</servlet-name>
    <servlet-class>org.apache.submarine.server.Bootstrap</servlet-class>
    <load-on-startup>2</load-on-startup>
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `path` is redundant
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/SubmarineConfiguration.java`
#### Snippet
```java

  public String getKeyStorePath() {
    String path = getString(SubmarineConfVars.ConfVars.SUBMARINE_SERVER_SSL_KEYSTORE_PATH);
    return path;
  }
```

### UnnecessaryLocalVariable
Local variable `t` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/provider/YamlEntityProvider.java`
#### Snippet
```java
      MultivaluedMap<String, String> httpHeaders, InputStream entityStream)
      throws WebApplicationException {
    T t = YamlUtils.readValue(toString(entityStream), type);
    return t;
  }
```

### UnnecessaryLocalVariable
Local variable `experiment` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ExperimentManager.java`
#### Snippet
```java

    ExperimentEntity entity = experimentService.select(id);
    Experiment experiment = buildExperimentFromEntity(entity);

    return experiment;
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/NotebookManager.java`
#### Snippet
```java
    List<Notebook> notebookList = new ArrayList<>();
    for (Notebook nb : serviceNotebooks) {
      notebookList.add(nb);
    }
    return notebookList;
```

### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ExperimentTemplateManager.java`
#### Snippet
```java
    Set<String> unusedParamList = new HashSet<String>();
    for (String s : paramMap.keySet()) {
      unusedParamList.add(s);
    }

```

## RuleId[id=BigDecimalMethodWithoutRoundingCalled]
### BigDecimalMethodWithoutRoundingCalled
'BigDecimal.divide()' called without a rounding mode argument
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/mljob/MLJobReplicaSpec.java`
#### Snippet
```java
        podSpec.getSpec().getContainers().get(0)
            .getResources().getRequests().get("memory").
            getNumber().divide(BigDecimal.valueOf(1000000)).toString() + "M");
  }

```

### BigDecimalMethodWithoutRoundingCalled
'BigDecimal.divide()' called without a rounding mode argument
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/notebook/NotebookCRSpec.java`
#### Snippet
```java
            podSpec.getSpec().getContainers().get(0)
                    .getResources().getLimits().get("memory").
                    getNumber().divide(BigDecimal.valueOf(1024 * 1024 * 1024)).toString() + "Gi");
  }

```

