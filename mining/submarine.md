# submarine 
 
# Bad smells
I found 347 bad smells with 66 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DataFlowIssue | 50 | false |
| UnusedAssignment | 31 | false |
| ReturnNull | 27 | false |
| UtilityClassWithoutPrivateConstructor | 26 | true |
| RedundantFieldInitialization | 19 | false |
| SizeReplaceableByIsEmpty | 13 | true |
| BoundedWildcard | 13 | false |
| UnnecessaryToStringCall | 12 | true |
| UnnecessarySemicolon | 11 | false |
| UnnecessaryFullyQualifiedName | 11 | false |
| DefaultAnnotationParam | 9 | false |
| RegExpRedundantEscape | 8 | false |
| StringEqualsEmptyString | 8 | false |
| IgnoreResultOfCall | 7 | false |
| StringOperationCanBeSimplified | 7 | false |
| DynamicRegexReplaceableByCompiledPattern | 6 | false |
| UnnecessaryStringEscape | 5 | true |
| StringBufferReplaceableByStringBuilder | 5 | false |
| SynchronizeOnThis | 5 | false |
| StringBufferReplaceableByString | 4 | false |
| ZeroLengthArrayInitialization | 4 | false |
| NonProtectedConstructorInAbstractClass | 4 | true |
| AssignmentToStaticFieldFromInstanceMethod | 3 | false |
| RedundantMethodOverride | 3 | false |
| NestedAssignment | 3 | false |
| HtmlWrongAttributeValue | 3 | false |
| StringConcatenationInsideStringBufferAppend | 3 | false |
| UnnecessaryLocalVariable | 3 | true |
| ObsoleteCollection | 2 | false |
| AbstractClassNeverImplemented | 2 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 2 | false |
| EmptyMethod | 2 | false |
| FieldMayBeStatic | 2 | false |
| NonSerializableFieldInSerializableClass | 2 | false |
| ThrowablePrintStackTrace | 2 | false |
| AssignmentToMethodParameter | 2 | false |
| UseBulkOperation | 2 | false |
| BigDecimalMethodWithoutRoundingCalled | 2 | false |
| StaticCallOnSubclass | 1 | false |
| RedundantArrayCreation | 1 | true |
| KeySetIterationMayUseEntrySet | 1 | false |
| OctalLiteral | 1 | false |
| UnnecessaryReturn | 1 | true |
| AccessStaticViaInstance | 1 | false |
| ClassNameSameAsAncestorName | 1 | false |
| ReturnFromFinallyBlock | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| RedundantExplicitClose | 1 | false |
| StringRepeatCanBeUsed | 1 | false |
| NonFinalFieldOfException | 1 | false |
| DuplicateThrows | 1 | false |
| DoubleBraceInitialization | 1 | false |
| TypeParameterExtendsObject | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
| ConstantValue | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| FinallyBlockCannotCompleteNormally | 1 | false |
| RedundantCollectionOperation | 1 | false |
| RedundantEscapeInRegexReplacement | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| OptionalUsedAsFieldOrParameterType | 1 | false |
| ComparatorMethodParameterNotUsed | 1 | false |
## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `setAccessible()` declared in class 'java.lang.reflect.AccessibleObject' but referenced via subclass 'java.lang.reflect.Field'
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/entity/BaseEntity.java`
#### Snippet
```java

    Field[] fields = clazz.getDeclaredFields();
    Field.setAccessible(fields, true);
    for (Field field: fields) {
      try {
```

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

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `readedDB` from instance context
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/EnvironmentManager.java`
#### Snippet
```java
      }
    }
    readedDB = false;
    return environmentList;
  }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `safeGson` from instance context
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/response/JsonResponse.java`
#### Snippet
```java
      TypeAdapter<Date> safeDateTypeAdapter = dateTypeAdapter.nullSafe();

      safeGson = new GsonBuilder()
          .registerTypeAdapter(Date.class, safeDateTypeAdapter)
          .registerTypeAdapter(ExperimentId.class, new ExperimentIdSerializer())
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `this.connectionManager` from instance context
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/websocket/WebSocketServer.java`
#### Snippet
```java

  public WebSocketServer() {
    this.connectionManager = new ConnectionManager();
    WebSocketServer.self.set(this);
    LOG.info("WebSocketServer instantiated: {}", this);
```

## RuleId[id=RegExpRedundantEscape]
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

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Stack` used
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/s3/Client.java`
#### Snippet
```java
  public List<String> listAllObjects(String path) throws SubmarineRuntimeException {
    List<String> result = new ArrayList<>();
    Stack<String> dirs = new Stack<>();
    dirs.add(path);
    while (!dirs.empty()) {
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/s3/Client.java`
#### Snippet
```java
  public List<String> listAllObjects(String path) throws SubmarineRuntimeException {
    List<String> result = new ArrayList<>();
    Stack<String> dirs = new Stack<>();
    dirs.add(path);
    while (!dirs.empty()) {
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

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `headParams.keySet()` may be replaced with 'entrySet()' iteration
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/GitHttpRequest.java`
#### Snippet
```java

    if (headParams != null) {
      for (String key : headParams.keySet()) {
        httpURLConnection.setRequestProperty(key, headParams.get(key));
      }
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

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`model.getChildren().size() == 0` can be replaced with 'model.getChildren().isEmpty()'
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/utils/DepartmentUtil.java`
#### Snippet
```java
  private static void setEmptyChildrenAsNull(List<SysDeptTree> treeList) {
    for (SysDeptTree model : treeList) {
      if (model.getChildren().size() == 0) {
        model.setChildren(null);
      } else {
```

### SizeReplaceableByIsEmpty
`kernel.getCondaDependencies().size() > 0` can be replaced with '!kernel.getCondaDependencies().isEmpty()'
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/parser/NotebookSpecParser.java`
#### Snippet
```java

      // If conda dependencies isn't empty
      if (kernel.getCondaDependencies().size() > 0) {
        installCommand.append(" && conda install -y");
        for (String channel : kernel.getChannels()) {
```

### SizeReplaceableByIsEmpty
`kernel.getPipDependencies().size() > 0` can be replaced with '!kernel.getPipDependencies().isEmpty()'
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/parser/NotebookSpecParser.java`
#### Snippet
```java

      // If pip dependencies isn't empty
      if (kernel.getPipDependencies().size() > 0) {
        installCommand.append(" && pip install");
        for (String dependency : kernel.getPipDependencies()) {
```

### SizeReplaceableByIsEmpty
`key.length() == 0` can be replaced with 'key.isEmpty()'
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/NetworkUtils.java`
#### Snippet
```java

  public static boolean isEnvString(String key) {
    if (key == null || key.length() == 0) {
      return false;
    }
```

### SizeReplaceableByIsEmpty
`podSpec.getInitContainers().size() > 0` can be replaced with '!podSpec.getInitContainers().isEmpty()'
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/parser/ExperimentSpecParser.java`
#### Snippet
```java

      if (podSpec.getInitContainers() != null
          && podSpec.getInitContainers().size() > 0) {

        List<V1VolumeMount> initContainerVolumeMounts =
```

### SizeReplaceableByIsEmpty
`environmentSpec.getKernelSpec().getCondaDependencies().size() > 0` can be replaced with '!environmentSpec.getKernelSpec().getCondaDependencies().isEmpty()'
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/parser/ExperimentSpecParser.java`
#### Snippet
```java
        initContainer.setImage(environmentSpec.getDockerImage());

        if (environmentSpec.getKernelSpec().getCondaDependencies().size() > 0) {

          String minVersion = "minVersion=\""
```

### SizeReplaceableByIsEmpty
`namespace.length() == 0` can be replaced with 'namespace.isEmpty()'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/NotebookManager.java`
#### Snippet
```java
    List<Notebook> notebookList = new ArrayList<>();
    for (Notebook notebook : notebookService.selectAll()) {
      if (namespace == null || namespace.length() == 0 ){
        notebookList.add(notebook);
      }
```

### SizeReplaceableByIsEmpty
`dictItems.size() > 0` can be replaced with '!dictItems.isEmpty()'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/response/DictAnnotation.java`
#### Snippet
```java
          String code = field.getAnnotation(Dict.class).Code();
          List<SysDictItemEntity> dictItems = sysDictItemService.queryDictByCode(code);
          if (dictItems.size() > 0) {
            mapDictItems.put(field.getName(), dictItems);
          }
```

### SizeReplaceableByIsEmpty
`mapDictItems.size() == 0` can be replaced with 'mapDictItems.isEmpty()'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/response/DictAnnotation.java`
#### Snippet
```java
      }

      if (mapDictItems.size() == 0) {
        // don't contain dict Annotation
        return false;
```

### SizeReplaceableByIsEmpty
`illegalParamList.size() > 0` can be replaced with '!illegalParamList.isEmpty()'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ExperimentTemplateManager.java`
#### Snippet
```java
    }

    if (illegalParamList.size() > 0) {
      throw new SubmarineRuntimeException(Status.BAD_REQUEST.getStatusCode(),
            "Parameters contains illegal key: " + illegalParamList.toString());
```

### SizeReplaceableByIsEmpty
`unusedParamList.size() > 0` can be replaced with '!unusedParamList.isEmpty()'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ExperimentTemplateManager.java`
#### Snippet
```java
    }

    if (unusedParamList.size() > 0) {
      throw new SubmarineRuntimeException(Status.BAD_REQUEST.getStatusCode(),
            "Parameters contains unused key: " + unusedParamList.toString());
```

### SizeReplaceableByIsEmpty
`unmapedParamList.size() > 0` can be replaced with '!unmapedParamList.isEmpty()'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ExperimentTemplateManager.java`
#### Snippet
```java
    }

    if (unmapedParamList.size() > 0) {
      throw new SubmarineRuntimeException(Status.BAD_REQUEST.getStatusCode(),
          "Template contains unmapped value: " + unmapedParamList.toString());
```

### SizeReplaceableByIsEmpty
`tpls.size() != 0` can be replaced with '!tpls.isEmpty()'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ExperimentTemplateManager.java`
#### Snippet
```java

    // Is it available in cache?
    if (tpls.size() != 0) {
      return tpls;
    }
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

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends SysDeptSelectEntity`
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/utils/DepartmentUtil.java`
#### Snippet
```java

public class DepartmentUtil {
  public static void disableTargetDeptCode(List<SysDeptSelectEntity> sysDeptSelects,
                                          String deptCode) {
    if (sysDeptSelects == null) {
```

### BoundedWildcard
Can generalize to `? extends SysDeptTree`
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/utils/DepartmentUtil.java`
#### Snippet
```java
  }

  private static void setEmptyChildrenAsNull(List<SysDeptTree> treeList) {
    for (SysDeptTree model : treeList) {
      if (model.getChildren().size() == 0) {
```

### BoundedWildcard
Can generalize to `? extends SysDeptEntity`
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/utils/DepartmentUtil.java`
#### Snippet
```java
  }

  public static List<SysDeptTree> wrapDeptListToTree(List<SysDeptEntity> sysDeptList,
                                                     List<SysDeptSelectEntity> sysDeptSelects) {
    sysDeptSelects.clear();
```

### BoundedWildcard
Can generalize to `? extends SysDeptTree`
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/utils/DepartmentUtil.java`
#### Snippet
```java
  }

  public static long getDeptTreeSize(List<SysDeptTree> sysDeptTreeList) {
    if (sysDeptTreeList == null) {
      return 0;
```

### BoundedWildcard
Can generalize to `? extends SysDeptTree`
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/utils/DepartmentUtil.java`
#### Snippet
```java

  // Find all child node collections under the top parent class and wrap them in a TreeList collection
  private static void getGrandChildren(List<SysDeptTree> treeList,
                                       List<SysDeptTree> recordList,
                                       List<SysDeptSelectEntity> sysDeptSelects) {
```

### BoundedWildcard
Can generalize to `? extends SysDeptTree`
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/utils/DepartmentUtil.java`
#### Snippet
```java
  // Find all child node collections under the top parent class and wrap them in a TreeList collection
  private static void getGrandChildren(List<SysDeptTree> treeList,
                                       List<SysDeptTree> recordList,
                                       List<SysDeptSelectEntity> sysDeptSelects) {
    for (int i = 0; i < treeList.size(); i++) {
```

### BoundedWildcard
Can generalize to `? extends SysDeptSelectEntity`
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/utils/DepartmentUtil.java`
#### Snippet
```java
  private static void getGrandChildren(List<SysDeptTree> treeList,
                                       List<SysDeptTree> recordList,
                                       List<SysDeptSelectEntity> sysDeptSelects) {
    for (int i = 0; i < treeList.size(); i++) {
      SysDeptTree model = treeList.get(i);
```

### BoundedWildcard
Can generalize to `? extends SysUserEntity`
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/service/SysUserService.java`
#### Snippet
```java
   * 1. If not present, create user
   */
  public SysUserEntity getOrCreateUser(String username, Supplier<SysUserEntity> entitySupplier) {
    LOG.trace("Check user if exists ...");
    try (SqlSession sqlSession = MyBatisUtil.getSqlSession()) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/mljob/MLJob.java`
#### Snippet
```java
   * Convert MLJob object to return Experiment object
   */
  protected <T extends MLJob> Experiment parseExperimentResponseObject(T object, Class<T> tClass)
          throws SubmarineRuntimeException {
    String jsonString = JsonUtils.toJson(object);
```

### BoundedWildcard
Can generalize to `? extends IstioVirtualService`
in `submarine-serve/src/main/java/org/apache/submarine/serve/istio/IstioVirtualServiceList.java`
#### Snippet
```java
  }

  public void setItems(List<IstioVirtualService> items) {
    this.items = items;
  }
```

### BoundedWildcard
Can generalize to `? extends NewCookie`
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/response/JsonResponse.java`
#### Snippet
```java
    }

    public Builder<T> cookies(ArrayList<NewCookie> newCookies) {
      if (cookies == null) {
        cookies = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends ModelVersionEntity`
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/RegisteredModelManager.java`
#### Snippet
```java
  }

  private void deleteModelInS3(List<ModelVersionEntity> modelVersions) throws SubmarineRuntimeException {
    try {
      modelVersions.forEach(modelVersion -> s3Client.deleteArtifactsByModelVersion(
```

### BoundedWildcard
Can generalize to `? extends List`
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/response/DictAnnotation.java`
#### Snippet
```java
  }

  private static Object mergeDictText(Object object, Map<String, List<SysDictItemEntity>> mapDictItems)
      throws Exception {
    // Map<Field->Value>
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `MLJobSpec` has no concrete subclass
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/mljob/MLJobSpec.java`
#### Snippet
```java
import com.google.gson.annotations.SerializedName;

public abstract class MLJobSpec {
  
  @SerializedName("backoffLimit")
```

### AbstractClassNeverImplemented
Abstract class `K8sUtils` has no concrete subclass
in `submarine-server/server-submitter/k8s-utils/src/main/java/org/apache/submarine/server/k8s/utils/K8sUtils.java`
#### Snippet
```java
 * @since 0.8.0-SNAPSHOT
 */
public abstract class K8sUtils {

  private static final Logger LOG = LoggerFactory.getLogger(K8sUtils.class);
```

## RuleId[id=IgnoreResultOfCall]
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

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `IstioVirtualService` is the same as one of its superclass' names
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/istio/IstioVirtualService.java`
#### Snippet
```java
import static org.apache.submarine.server.submitter.k8s.K8sSubmitter.getDeleteOptions;

public class IstioVirtualService extends org.apache.submarine.serve.istio.IstioVirtualService
        implements K8sResource<IstioVirtualService> {

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
in `submarine-server/server-submitter/submarine-k8s-agent/src/main/java/org/apache/submarine/server/k8s/agent/model/training/resource/PyTorchJob.java`
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
in `submarine-server/server-submitter/submarine-k8s-agent/src/main/java/org/apache/submarine/server/k8s/agent/model/training/status/JobStatus.java`
#### Snippet
```java

@JsonDeserialize(
        using = JsonDeserializer.None.class
)
@JsonInclude(JsonInclude.Include.NON_NULL)
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `setSpec()` only delegates to its super method
in `submarine-server/server-submitter/submarine-k8s-agent/src/main/java/org/apache/submarine/server/k8s/agent/model/training/JobResource.java`
#### Snippet
```java

  @Override
  public void setSpec(Void spec) {
    super.setSpec(spec);
  }
```

### RedundantMethodOverride
Method `setStatus()` only delegates to its super method
in `submarine-server/server-submitter/submarine-k8s-agent/src/main/java/org/apache/submarine/server/k8s/agent/model/training/JobResource.java`
#### Snippet
```java

  @Override
  public void setStatus(JobStatus status) {
    super.setStatus(status);
  }
```

### RedundantMethodOverride
Method `localize()` only delegates to its super method
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/experiment/codelocalizer/HTTPGitCodeLocalizer.java`
#### Snippet
```java

  @Override
  public void localize(V1PodSpec podSpec) {
    super.localize(podSpec);
  }
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/s3/Client.java`
#### Snippet
```java
      buffer[0] = (byte) b;
      int i = 1;
      while ((b = is.read()) != -1){
        buffer[i] = (byte) b;
        i += 1;
```

### NestedAssignment
Result of assignment expression used
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/SubmarineServer.java`
#### Snippet
```java
           BufferedReader bufferedReader = new BufferedReader(reader);) {
        String lineTxt = null;
        while ((lineTxt = bufferedReader.readLine()) != null) {
          sbIndexBuf.append(lineTxt);
        }
```

### NestedAssignment
Result of assignment expression used
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/GitHttpRequest.java`
#### Snippet
```java
         BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
      String line;
      while ((line = bufferedReader.readLine()) != null) {
        stringBuilder.append(line);
      }
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

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `connection` is accessed in both synchronized and unsynchronized contexts
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/websocket/WebSocketHandler.java`
#### Snippet
```java
 */
public class WebSocketHandler extends WebSocketAdapter {
  private Session connection;
  private WebSocketListener listener;
  private HttpServletRequest request;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `connection` is accessed in both synchronized and unsynchronized contexts
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/workbench/websocket/NotebookSocket.java`
#### Snippet
```java
 */
public class NotebookSocket extends WebSocketAdapter {
  private Session connection;
  private NotebookSocketListener listener;
  private HttpServletRequest request;
```

## RuleId[id=EmptyMethod]
### EmptyMethod
Method only calls its super
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/spec/ExperimentMeta.java`
#### Snippet
```java
   * @param namespace namespace
   */
  public void setNamespace(String namespace) {
    // TODO(kevin85421): Remove the function
    return;
```

### EmptyMethod
The method is empty
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/security/SecurityProvider.java`
#### Snippet
```java
   * Handling login perform
   */
  public void login(HttpServletRequest hsRequest, HttpServletResponse hsResponse) { }

  /**
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/workbench/Action.java`
#### Snippet
```java
public class Action {
  private String action;
  private boolean defaultCheck = false;
  private String describe;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/workbench/User.java`
#### Snippet
```java
    private String password;
    private String avatar;
    private int status = 0;
    private String telephone;
    private String lastLoginIp;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/workbench/User.java`
#### Snippet
```java
    private String creatorId;
    private long createTime;
    private int deleted = 0;
    private String roleId;
    private String lang;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/workbench/UserInfo.java`
#### Snippet
```java
    private long createTime;
    private String merchantCode;
    private int deleted = 0;
    private String roleId;
    private Role role;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/ObjectMeta.java`
#### Snippet
```java

  @SerializedName("selfLink")
  private String selfLink = null;

  @SerializedName("uid")
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/ObjectMeta.java`
#### Snippet
```java

  @SerializedName("uid")
  private String uid = null;

  public Map<String, String> getAnnotations() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/ObjectMeta.java`
#### Snippet
```java

  @SerializedName("labels")
  private Map<String, String> labels = null;

  @SerializedName("name")
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/ObjectMeta.java`
#### Snippet
```java

  @SerializedName("resourceVersion")
  private String resourceVersion = null;

  @SerializedName("selfLink")
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/ObjectMeta.java`
#### Snippet
```java

  @SerializedName("namespace")
  private String namespace = null;

  @SerializedName("resourceVersion")
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/ObjectMeta.java`
#### Snippet
```java

  @SerializedName("name")
  private String name = null;

  @SerializedName("namespace")
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `submarine-server/server-submitter/k8s-utils/src/main/java/org/apache/submarine/server/k8s/utils/K8sUtils.java`
#### Snippet
```java

  private static final Logger LOG = LoggerFactory.getLogger(K8sUtils.class);
  private static String namespace = null;

  /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `submarine-commons/commons-runtime/src/main/java/org/apache/submarine/commons/runtime/api/JobComponentStatus.java`
#### Snippet
```java
  private String compName;
  private long numReadyContainers = 0;
  private long numRunningButUnreadyContainers = 0;
  private long totalAskedContainers;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `submarine-commons/commons-runtime/src/main/java/org/apache/submarine/commons/runtime/api/JobComponentStatus.java`
#### Snippet
```java
public class JobComponentStatus {
  private String compName;
  private long numReadyContainers = 0;
  private long numRunningButUnreadyContainers = 0;
  private long totalAskedContainers;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `submarine-commons/commons-runtime/src/main/java/org/apache/submarine/commons/runtime/conf/SubmarineLogs.java`
#### Snippet
```java

public class SubmarineLogs {
  private static volatile boolean verbose = false;

  public static boolean isVerbose() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/client/K8sDefaultClient.java`
#### Snippet
```java
  private final CustomObjectsApi customObjectsApi;

  private ApiClient client = null;

  public K8sDefaultClient() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/response/JsonResponse.java`
#### Snippet
```java
    private Map<String, Object> attributes = new HashMap<>();
    private transient ArrayList<NewCookie> cookies;
    private transient boolean pretty = false;

    public Builder(javax.ws.rs.core.Response.Status status) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/response/JsonResponse.java`
#### Snippet
```java
  private final Map<String, Object> attributes;

  private static Gson safeGson = null;

  private static final String CGLIB_PROPERTY_PREFIX = "\\$cglib_prop_";
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/response/DictAnnotation.java`
#### Snippet
```java

  // Attribute name and type of attribute
  private BeanMap beanMap = null;

  public DictAnnotation(Map propertyMap) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/response/DictAnnotation.java`
#### Snippet
```java

  // Dynamically generated class
  private Object object = null;

  // Attribute name and type of attribute
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

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `submarine-workbench/workbench-web/src/app/pages/workbench/notebook/notebook-home/notebook-form/notebook-form.component.html`
#### Snippet
```java
      </ng-container>
    </div>
    <button nz-button style="display: block; margin: auto" id="envVar-btn" type="default" (click)="onCreateEnvVar()">
      New EnvVar
    </button>
```

### HtmlWrongAttributeValue
Wrong attribute value
in `submarine-workbench/workbench-web/src/app/pages/workbench/template/template-home/template-form/template-form.component.html`
#### Snippet
```java
          style="display: block; margin: auto"
          id="btn-addParam"
          type="default"
          (click)="onCreateParam()"
        >
```

### HtmlWrongAttributeValue
Wrong attribute value
in `submarine-workbench/workbench-web/src/app/pages/workbench/template/template-home/template-form/template-form.component.html`
#### Snippet
```java
          </ng-container>
        </div>
        <button nz-button style="display: block; margin: auto" id="btn-addEnv" type="default" (click)="onCreateEnv()">
          Add New Environment Variable
        </button>
```

## RuleId[id=StringRepeatCanBeUsed]
### StringRepeatCanBeUsed
Can be replaced with 'String.repeat()'
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/AbstractUniqueIdGenerator.java`
#### Snippet
```java
    } while (--minimumDigits > 0 && tmp > 0);

    for (int i = minimumDigits; i > 0; --i) {
      sb.append('0');
    }
```

## RuleId[id=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer installCommand` may be declared as 'StringBuilder'
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/parser/NotebookSpecParser.java`
#### Snippet
```java

      String condaVersionValidationCommand = generateCondaVersionValidateCommand();
      StringBuffer installCommand = new StringBuffer();
      installCommand.append(condaVersionValidationCommand);

```

### StringBufferReplaceableByStringBuilder
`StringBuffer condaVersionValidationCommand` may be declared as 'StringBuilder'
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/parser/NotebookSpecParser.java`
#### Snippet
```java
            + conf.getString(SubmarineConfVars.ConfVars.ENVIRONMENT_CONDA_MAX_VERSION)
            + "\";";
    StringBuffer condaVersionValidationCommand = new StringBuffer();
    condaVersionValidationCommand.append(minVersion);
    condaVersionValidationCommand.append(maxVersion);
```

### StringBufferReplaceableByStringBuilder
`StringBuffer condaVersionValidationCommand` may be declared as 'StringBuilder'
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/parser/ExperimentSpecParser.java`
#### Snippet
```java
              + "\";";
          String currentVersion = "currentVersion=$(conda -V | cut -f2 -d' ');";
          StringBuffer condaVersionValidationCommand = new StringBuffer();
          condaVersionValidationCommand.append(minVersion);
          condaVersionValidationCommand.append(maxVersion);
```

### StringBufferReplaceableByStringBuilder
`StringBuffer createCommand` may be declared as 'StringBuilder'
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/parser/ExperimentSpecParser.java`
#### Snippet
```java
                      + "activation.\"; fi");

          StringBuffer createCommand = new StringBuffer();
          String condaEnvironmentName =
              environmentSpec.getKernelSpec().getName();
```

### StringBufferReplaceableByStringBuilder
`StringBuffer sb` may be declared as 'StringBuilder'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ExperimentTemplateManager.java`
#### Snippet
```java
        String value = (String) entry.getValue();
        Matcher matcher = pattern.matcher(value);
        StringBuffer sb = new StringBuffer();

        while (matcher.find()) {
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/SubmarineConfiguration.java`
#### Snippet
```java
  public static SubmarineConfiguration getInstance() {
    if (conf == null) {
      synchronized (SubmarineConfiguration.class) {
        if  (conf == null) {
          conf = newInstance();
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/NotebookManager.java`
#### Snippet
```java
  public static NotebookManager getInstance() {
    if (manager == null) {
      synchronized (NotebookManager.class) {
        if (manager == null) {
          manager = new NotebookManager(SubmitterManager.loadSubmitter(), new NotebookService());
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/EnvironmentManager.java`
#### Snippet
```java
  public static EnvironmentManager getInstance() {
    if (manager == null) {
      synchronized (EnvironmentManager.class) {
        if (manager == null) {
          manager = new EnvironmentManager();
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ExperimentManager.java`
#### Snippet
```java
  public static ExperimentManager getInstance() {
    if (manager == null) {
      synchronized (ExperimentManager.class) {
        if (manager == null) {
          manager = new ExperimentManager(SubmitterManager.loadSubmitter(), new ExperimentService());
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ExperimentTemplateManager.java`
#### Snippet
```java
  public static ExperimentTemplateManager getInstance() {
    if (manager == null) {
      synchronized (ExperimentTemplateManager.class) {
        if (manager == null) {
          manager = new ExperimentTemplateManager();
```

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `code` of exception class
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/exception/SubmarineRuntimeException.java`
#### Snippet
```java
  private static final long serialVersionUID = 7159777541471705348L;

  private int code;

  public SubmarineRuntimeException(String message) {
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/K8sSubmitter.java`
#### Snippet
```java

    // delete resources
    return deleteResourcesTransaction(notebookCR, dependents.toArray(dependents.toArray(new K8sResource[0])));
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/SubmitterManager.java`
#### Snippet
```java
      }
    }
    return urls.toArray(new URL[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/s3/Client.java`
#### Snippet
```java
      b = is.read();
      if (b == -1) {
        return new byte[0];
      }
      buffer = new byte[1 + is.available()];
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/response/DictAnnotation.java`
#### Snippet
```java
              + objectClass.getName() + " need add set and set methods.");
        }
        Object result = readMethod.invoke(object, new Object[0]);
        mapFieldValues.put(propertyName, result);
        mapFieldAndType.put(propertyName, descriptor.getPropertyType());
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

## RuleId[id=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/security/common/CommonFilter.java`
#### Snippet
```java
  /* Supported http method */
  protected final Set<Class<? extends Annotation>> SUPPORT_HTTP_METHODS =
      new HashSet<Class<? extends Annotation>>() {{
        add(GET.class);
        add(PUT.class);
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
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/service/TeamService.java`
#### Snippet
```java
        owner, column, order, pageNo, pageSize);

    List<TeamEntity> list = null;
    try (SqlSession sqlSession = MyBatisUtil.getSqlSession()) {
      TeamMapper teamMapper = sqlSession.getMapper(TeamMapper.class);
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
Variable `sysDeptList` initializer `null` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/workbench/SysDeptRestApi.java`
#### Snippet
```java
    LOG.info("SysDeptRestApi.tree()");

    List<SysDeptEntity> sysDeptList = null;

    try (SqlSession sqlSession = MyBatisUtil.getSqlSession()) {
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
Variable `beanMap` initializer `null` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/response/DictAnnotation.java`
#### Snippet
```java

  // Attribute name and type of attribute
  private BeanMap beanMap = null;

  public DictAnnotation(Map propertyMap) {
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
Variable `returnExperimentSpec` initializer `null` is redundant
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ExperimentTemplateManager.java`
#### Snippet
```java
    LOG.info("nestedJson    " + nestedJson);

    ExperimentSpec returnExperimentSpec = null;
    try {
      returnExperimentSpec = gson.fromJson(nestedJson, ExperimentSpec.class);
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

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `pretty` may be 'static'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/response/JsonResponse.java`
#### Snippet
```java
  private final T result;
  private final transient ArrayList<NewCookie> cookies;
  private final transient boolean pretty = false;
  private final Map<String, Object> attributes;

```

### FieldMayBeStatic
Field `DEFAULT_AUTHORIZER` may be 'static'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/security/SecurityProvider.java`
#### Snippet
```java
public abstract class SecurityProvider<T extends Filter, R extends CommonProfile> {

  protected final String DEFAULT_AUTHORIZER = "isAuthenticated";

  protected Config pac4jConfig;
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `CliConstants` has only 'static' members, and lacks a 'private' constructor
in `submarine-client/src/main/java/org/apache/submarine/client/cli/CliConstants.java`
#### Snippet
```java
 * NOTE: use lowercase + "_" for the option name
 */
public class CliConstants {
  public static final String RUN = "run";
  public static final String SERVE = "serve";
```

### UtilityClassWithoutPrivateConstructor
Class `SubmarineAgentListener` has only 'static' members, and lacks a 'private' constructor
in `submarine-server/server-submitter/submarine-k8s-agent/src/main/java/org/apache/submarine/server/k8s/agent/SubmarineAgentListener.java`
#### Snippet
```java
 * Listen for changes in the associated kubeflow resources and update their status
 */
public class SubmarineAgentListener {

  private static final Logger LOGGER = LoggerFactory.getLogger(SubmarineAgentListener.class);
```

### UtilityClassWithoutPrivateConstructor
Class `MyBatisUtil` has only 'static' members, and lacks a 'private' constructor
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/utils/MyBatisUtil.java`
#### Snippet
```java
import java.util.Properties;

public class MyBatisUtil {
  private static final Logger LOG = LoggerFactory.getLogger(MyBatisUtil.class);

```

### UtilityClassWithoutPrivateConstructor
Class `MybatisGenerator` has only 'static' members, and lacks a 'private' constructor
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/utils/MybatisGenerator.java`
#### Snippet
```java
import java.util.List;

public class MybatisGenerator {
  private static final Logger LOG = LoggerFactory.getLogger(TeamService.class);

```

### UtilityClassWithoutPrivateConstructor
Class `OwnerReferenceUtils` has only 'static' members, and lacks a 'private' constructor
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/util/OwnerReferenceUtils.java`
#### Snippet
```java
import org.apache.submarine.server.k8s.utils.OwnerReferenceConfig;

public class OwnerReferenceUtils {
  
  public static ArrayList<V1OwnerReference> getOwnerReference() {
```

### UtilityClassWithoutPrivateConstructor
Class `JsonUtils` has only 'static' members, and lacks a 'private' constructor
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/util/JsonUtils.java`
#### Snippet
```java
import io.kubernetes.client.openapi.JSON;

public class JsonUtils {

  public static final Gson defaultGson = new JSON().getGson();
```

### UtilityClassWithoutPrivateConstructor
Class `MLJobFactory` has only 'static' members, and lacks a 'private' constructor
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/mljob/MLJobFactory.java`
#### Snippet
```java
 * Select different MLJob implementation classes according to different framework
 */
public class MLJobFactory {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `MLJobConverter` has only 'static' members, and lacks a 'private' constructor
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/util/MLJobConverter.java`
#### Snippet
```java
 * Such as MLJob to Job, V1Status to Job and others.
 */
public class MLJobConverter {
  public static Experiment toJobFromMLJob(MLJob mlJob) {
    Experiment experiment = new Experiment();
```

### UtilityClassWithoutPrivateConstructor
Class `DepartmentUtil` has only 'static' members, and lacks a 'private' constructor
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/utils/DepartmentUtil.java`
#### Snippet
```java
import java.util.List;

public class DepartmentUtil {
  public static void disableTargetDeptCode(List<SysDeptSelectEntity> sysDeptSelects,
                                          String deptCode) {
```

### UtilityClassWithoutPrivateConstructor
Class `NotebookUtils` has only 'static' members, and lacks a 'private' constructor
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/util/NotebookUtils.java`
#### Snippet
```java
 * Utils for building response of k8s (notebook) submitter
 */
public class NotebookUtils {

  private static final Logger LOG = LoggerFactory.getLogger(NotebookUtils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `SeldonDeploymentFactory` has only 'static' members, and lacks a 'private' constructor
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/seldon/SeldonDeploymentFactory.java`
#### Snippet
```java
 * SeldonDeployment K8s Model Resource Factory
 */
public class SeldonDeploymentFactory {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `NotebookSpecParser` has only 'static' members, and lacks a 'private' constructor
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/parser/NotebookSpecParser.java`
#### Snippet
```java
import java.util.Map;

public class NotebookSpecParser {

  // jupyter workspace path
```

### UtilityClassWithoutPrivateConstructor
Class `NetworkUtils` has only 'static' members, and lacks a 'private' constructor
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/NetworkUtils.java`
#### Snippet
```java
import java.util.Collections;

public class NetworkUtils {
  static Logger LOG = LoggerFactory.getLogger(NetworkUtils.class);

```

### UtilityClassWithoutPrivateConstructor
Class `OwnerReferenceConfig` has only 'static' members, and lacks a 'private' constructor
in `submarine-server/server-submitter/k8s-utils/src/main/java/org/apache/submarine/server/k8s/utils/OwnerReferenceConfig.java`
#### Snippet
```java
 * We currently get the configuration by environment variables
 */
public class OwnerReferenceConfig {

  public static final String SUBMARINE_APIVERSION = "SUBMARINE_APIVERSION";
```

### UtilityClassWithoutPrivateConstructor
Class `SeldonConstants` has only 'static' members, and lacks a 'private' constructor
in `submarine-serve/src/main/java/org/apache/submarine/serve/utils/SeldonConstants.java`
#### Snippet
```java
package org.apache.submarine.serve.utils;

public class SeldonConstants {
  public static final String API_VERSION = "machinelearning.seldon.io/v1";

```

### UtilityClassWithoutPrivateConstructor
Class `IstioConstants` has only 'static' members, and lacks a 'private' constructor
in `submarine-serve/src/main/java/org/apache/submarine/serve/utils/IstioConstants.java`
#### Snippet
```java
 * Istio constants
 */
public class IstioConstants {

  public static final String API_VERSION = "networking.istio.io/v1beta1";
```

### UtilityClassWithoutPrivateConstructor
Class `StorageKeyConstants` has only 'static' members, and lacks a 'private' constructor
in `submarine-commons/commons-runtime/src/main/java/org/apache/submarine/commons/runtime/fs/StorageKeyConstants.java`
#### Snippet
```java
package org.apache.submarine.commons.runtime.fs;

public class StorageKeyConstants {
  public static final String JOB_NAME = "JOB_NAME";
  public static final String JOB_RUN_ARGS = "JOB_RUN_ARGS";
```

### UtilityClassWithoutPrivateConstructor
Class `Envs` has only 'static' members, and lacks a 'private' constructor
in `submarine-commons/commons-runtime/src/main/java/org/apache/submarine/commons/runtime/conf/Envs.java`
#### Snippet
```java
package org.apache.submarine.commons.runtime.conf;

public class Envs {
  public static final String TASK_TYPE_ENV = "_TASK_TYPE";
  public static final String TASK_INDEX_ENV = "_TASK_INDEX";
```

### UtilityClassWithoutPrivateConstructor
Class `SubmarineLogs` has only 'static' members, and lacks a 'private' constructor
in `submarine-commons/commons-runtime/src/main/java/org/apache/submarine/commons/runtime/conf/SubmarineLogs.java`
#### Snippet
```java
package org.apache.submarine.commons.runtime.conf;

public class SubmarineLogs {
  private static volatile boolean verbose = false;

```

### UtilityClassWithoutPrivateConstructor
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `submarine-commons/commons-runtime/src/main/java/org/apache/submarine/commons/runtime/api/Runtime.java`
#### Snippet
```java
  }

  public static class Constants {
    public static final String TONY = "tony";
    public static final String YARN_SERVICE = "yarnservice";
```

### UtilityClassWithoutPrivateConstructor
Class `S3Constants` has only 'static' members, and lacks a 'private' constructor
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/s3/S3Constants.java`
#### Snippet
```java
 * S3(Minio) Constants
 */
public class S3Constants {

  /* default endpoint, it is the same as `submarine.s3.endpoint` */
```

### UtilityClassWithoutPrivateConstructor
Class `RestConstants` has only 'static' members, and lacks a 'private' constructor
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/rest/RestConstants.java`
#### Snippet
```java
package org.apache.submarine.server.rest;

public class RestConstants {
  public static final String V1 = "v1";

```

### UtilityClassWithoutPrivateConstructor
Class `ExperimentSpecParser` has only 'static' members, and lacks a 'private' constructor
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/parser/ExperimentSpecParser.java`
#### Snippet
```java
import java.util.Map;

public class ExperimentSpecParser {

  private static final SubmarineConfiguration conf = SubmarineConfiguration.getInstance();
```

### UtilityClassWithoutPrivateConstructor
Class `GitHttpRequest` has only 'static' members, and lacks a 'private' constructor
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/GitHttpRequest.java`
#### Snippet
```java
import java.util.Map;

public class GitHttpRequest {
  private static final Logger LOG = LoggerFactory.getLogger(GitHttpRequest.class);

```

### UtilityClassWithoutPrivateConstructor
Class `YamlUtils` has only 'static' members, and lacks a 'private' constructor
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/YamlUtils.java`
#### Snippet
```java
 * or used for {@link org.apache.submarine.server.rest.provider.YamlEntityProvider}
 */
public class YamlUtils {

  private static final YAMLMapper YAML_MAPPER = YAMLMapper.builder(new YAMLFactory()
```

### UtilityClassWithoutPrivateConstructor
Class `SecurityFactory` has only 'static' members, and lacks a 'private' constructor
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/security/SecurityFactory.java`
#### Snippet
```java
import java.util.Optional;

public class SecurityFactory {

  private static final Logger LOG = LoggerFactory.getLogger(SecurityFactory.class);
```

## RuleId[id=DataFlowIssue]
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

## RuleId[id=UnnecessarySemicolon]
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
in `submarine-serve/src/main/java/org/apache/submarine/serve/seldon/SeldonPredictor.java`
#### Snippet
```java
  }

  public SeldonPredictor(){};

  public String getName() {
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

## RuleId[id=StringOperationCanBeSimplified]
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
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/service/SysUserService.java`
#### Snippet
```java

  public boolean delete(String id) throws Exception {
    LOG.info("delete({})", id.toString());
    try (SqlSession sqlSession = MyBatisUtil.getSqlSession()) {
      SysUserMapper userMapper = sqlSession.getMapper(SysUserMapper.class);
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

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'minioClient' in a Serializable class
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/s3/Client.java`
#### Snippet
```java

  /* minio client */
  private final MinioClient minioClient;

  Client(String endpoint) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'connectionManager' in a Serializable class
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/workbench/websocket/NotebookServer.java`
#### Snippet
```java
  private static AtomicReference<NotebookServer> self = new AtomicReference<>();

  private ConnectionManager connectionManager;

  private ExecutorService executorService = Executors.newFixedThreadPool(10);
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

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/RegisteredModelManager.java`
#### Snippet
```java
   */
  private void checkRegisteredModelTag(String name, String tag) {
    if (name.equals("")) {
      throw new SubmarineRuntimeException(Response.Status.OK.getStatusCode(),
          "Invalid. Registered model name is null.");
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/RegisteredModelManager.java`
#### Snippet
```java
          "Invalid. Registered model name is null.");
    }
    if (tag.equals("")) {
      throw new SubmarineRuntimeException(Response.Status.OK.getStatusCode(),
          "Invalid. Tag name is null.");
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/RegisteredModelManager.java`
#### Snippet
```java
          "Invalid. Registered model entity object is null.");
    }
    if (entity.getName() == null || entity.getName().equals("")) {
      throw new SubmarineRuntimeException(Response.Status.OK.getStatusCode(),
          "Invalid. Registered model name is null.");
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ModelVersionManager.java`
#### Snippet
```java
          "Invalid. Model version entity object is null.");
    }
    if (entity.getName() == null || entity.getName().equals("")) {
      throw new SubmarineRuntimeException(Response.Status.OK.getStatusCode(),
          "Invalid. Model version's name is null.");
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ModelVersionManager.java`
#### Snippet
```java
   */
  private void checkModelVersionTag(String name, String version, String tag) {
    if (name.equals("")){
      throw new SubmarineRuntimeException(Response.Status.OK.getStatusCode(),
          "Invalid. Model version's name is null.");
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ModelVersionManager.java`
#### Snippet
```java
          "Invalid. Model version's name is null.");
    }
    if (version.equals("")) {
      throw new SubmarineRuntimeException(Response.Status.OK.getStatusCode(),
          "Invalid. Model version's version is null.");
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ModelVersionManager.java`
#### Snippet
```java
          "Invalid. Model version's version must be an integer.");
    }
    if (tag.equals("")) {
      throw new SubmarineRuntimeException(Response.Status.OK.getStatusCode(),
          "Invalid. Tag name is null.");
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/security/common/CommonFilter.java`
#### Snippet
```java

      // If endpoint is empty, the api is used as the path
      if ("".equals(endpoint) || "/".equals(endpoint)) {
        REST_API_PATHS.add(String.format("/api/%s", path));
      } else {
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

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/NetworkUtils.java`
#### Snippet
```java
    }

    return key.matches("^[A-Z_0-9]*");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/SubmarineConfiguration.java`
#### Snippet
```java

  public boolean isWindowsPath(String path) {
    return path.matches("^[A-Za-z]:\\\\.*");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/response/JsonResponse.java`
#### Snippet
```java
    String json = safeGson.toJson(this);
    if (haveDictAnnotation) {
      json = json.replaceAll(CGLIB_PROPERTY_PREFIX, "");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/security/common/CommonFilter.java`
#### Snippet
```java
        if (endpoint.endsWith("/")) endpoint = endpoint.substring(0, endpoint.length() - 1);
        String api = String.format("/api/%s/%s", path, endpoint);
        if (api.matches("(.*)\\{\\w+\\}(.*)")) {
          REST_REGREX_API_PATHS.add(api.replaceAll("\\{\\w+\\}", "((?!\\/).)*"));
        } else {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/security/common/CommonFilter.java`
#### Snippet
```java
        String api = String.format("/api/%s/%s", path, endpoint);
        if (api.matches("(.*)\\{\\w+\\}(.*)")) {
          REST_REGREX_API_PATHS.add(api.replaceAll("\\{\\w+\\}", "((?!\\/).)*"));
        } else {
          REST_API_PATHS.add(api);
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/security/common/CommonFilter.java`
#### Snippet
```java
    // If it is called by python, temporarily passed
    String agentHeader = httpServletRequest.getHeader(CommonConfig.AGENT_HEADER);
    if (StringUtils.isNoneBlank(agentHeader) && agentHeader.matches(PYTHON_USER_AGENT_REGREX)) {
      return false;
    }
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/CustomResourceJob/CustomResourceJobList.java`
#### Snippet
```java

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.glassfish.jersey.servlet` is unnecessary, and can be replaced with an import
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/SubmarineServer.java`
#### Snippet
```java
  private static void setupRestApiContextHandler(WebAppContext webapp, SubmarineConfiguration conf) {
    final ServletHolder servletHolder =
        new ServletHolder(new org.glassfish.jersey.servlet.ServletContainer());

    servletHolder.setInitParameter("javax.ws.rs.Application", SubmarineServer.class.getName());
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.ws.rs.core` is unnecessary and can be removed
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/response/JsonResponse.java`
#### Snippet
```java

  public static class Builder<T> {
    private javax.ws.rs.core.Response.Status status;
    private int code;
    private Boolean success;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.ws.rs.core` is unnecessary and can be removed
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/response/JsonResponse.java`
#### Snippet
```java
    private transient boolean pretty = false;

    public Builder(javax.ws.rs.core.Response.Status status) {
      this.status = status;
      this.code = status.getStatusCode();
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.ws.rs.core` is unnecessary and can be removed
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/response/JsonResponse.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(JsonResponse.class);

  private javax.ws.rs.core.Response.Status status;
  private final int code;
  private final Boolean success;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.ws.rs.core` is unnecessary and can be removed
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/response/JsonResponse.java`
#### Snippet
```java
  }

  private synchronized javax.ws.rs.core.Response build() {
    ResponseBuilder r = javax.ws.rs.core.Response.status(status).entity(this.toString());
    if (cookies != null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.ws.rs.core` is unnecessary and can be removed
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/response/JsonResponse.java`
#### Snippet
```java

  private synchronized javax.ws.rs.core.Response build() {
    ResponseBuilder r = javax.ws.rs.core.Response.status(status).entity(this.toString());
    if (cookies != null) {
      for (NewCookie nc : cookies) {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.ws.rs.core` is unnecessary and can be removed
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/utils/response/JsonResponse.java`
#### Snippet
```java
    }

    public javax.ws.rs.core.Response build() {
      JsonResponse<T> jsonResponse = new JsonResponse<>(this);
      return jsonResponse.build();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.mlflow.api.proto` is unnecessary, and can be replaced with an import
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ExperimentManager.java`
#### Snippet
```java
  private final AtomicInteger experimentCounter = new AtomicInteger(0);

  private Optional<org.mlflow.api.proto.Service.Experiment> MlflowExperimentOptional;
  private org.mlflow.api.proto.Service.Experiment MlflowExperiment;
  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.mlflow.api.proto` is unnecessary, and can be replaced with an import
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ExperimentManager.java`
#### Snippet
```java

  private Optional<org.mlflow.api.proto.Service.Experiment> MlflowExperimentOptional;
  private org.mlflow.api.proto.Service.Experiment MlflowExperiment;
  /**
   * Used to cache the specs by the experiment id.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.submarine.server.websocket` is unnecessary and can be removed
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/websocket/WebSocketServer.java`
#### Snippet
```java
@ManagedObject
public class WebSocketServer extends WebSocketServlet
    implements org.apache.submarine.server.websocket.WebSocketListener {

  /**
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/entity/BaseEntity.java`
#### Snippet
```java
        buffer.append(", ");
      } catch (IllegalArgumentException | IllegalAccessException  e) {
        e.printStackTrace();
      }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/websocket/DateJsonDeserializer.java`
#### Snippet
```java
            + "\". Supported formats: " + Arrays.toString(DATE_FORMATS));
      } catch (Exception e){
        e.printStackTrace();
      }
    }
```

## RuleId[id=ComparatorMethodParameterNotUsed]
### ComparatorMethodParameterNotUsed
Comparator never returns negative value
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/AbstractUniqueIdGenerator.java`
#### Snippet
```java
  @SuppressWarnings("rawtypes")
  @Override
  public int compareTo(Object o) {
    AbstractUniqueIdGenerator other = (AbstractUniqueIdGenerator) o;
    return this.getId() > other.getId() ? 1 : 0;
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `Info()` of an abstract class should not be declared 'public'
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/experiment/Info.java`
#### Snippet
```java
  public final String url;

  public Info(boolean available, String url) {
    this.available = available;
    this.url = url;
```

### NonProtectedConstructorInAbstractClass
Constructor `MLJob()` of an abstract class should not be declared 'public'
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/mljob/MLJob.java`
#### Snippet
```java
  protected final Logger LOG = LoggerFactory.getLogger(getClass());

  public MLJob(ExperimentSpec experimentSpec) {
    // set metadata
    V1ObjectMetaBuilder metaBuilder = new V1ObjectMetaBuilder();
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractCodeLocalizer()` of an abstract class should not be declared 'public'
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/experiment/codelocalizer/AbstractCodeLocalizer.java`
#### Snippet
```java
  private String url;

  public AbstractCodeLocalizer(String url) {
    this.url = url;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `GitCodeLocalizer()` of an abstract class should not be declared 'public'
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/experiment/codelocalizer/GitCodeLocalizer.java`
#### Snippet
```java
  public static final String GIT_SYNC_IMAGE = "apache/submarine:git-sync-3.1.6";

  public GitCodeLocalizer(String url) {
    super(url);
  }
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `value`
in `submarine-commons/commons-utils/src/main/java/org/apache/submarine/commons/utils/AbstractUniqueIdGenerator.java`
#### Snippet
```java
    if (value < 0) {
      sb.append('-');
      value = -value;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `spec`
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/manager/ExperimentTemplateManager.java`
#### Snippet
```java
  private ExperimentTemplate createOrUpdateExperimentTemplate(ExperimentTemplateSpec spec, String operation) {

    spec = addResourcesParameter(spec);

    ExperimentTemplateEntity entity = new ExperimentTemplateEntity();
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/notebook/NotebookId.java`
#### Snippet
```java
  public static NotebookId fromString(String notebookId) {
    if (notebookId == null) {
      return null;
    }
    String[] components = notebookId.split("\\_");
```

### ReturnNull
Return of `null`
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/notebook/NotebookId.java`
#### Snippet
```java
    String[] components = notebookId.split("\\_");
    if (components.length != 3) {
      return null;
    }
    return NotebookId.newInstance(Long.parseLong(components[1]), Integer.parseInt(components[2]));
```

### ReturnNull
Return of `null`
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/spec/NotebookPodSpec.java`
#### Snippet
```java
   */
  public String getGpu() {
    return resourceMap == null ? null : resourceMap.get("nvidia.com/gpu");
  }

```

### ReturnNull
Return of `null`
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/spec/NotebookPodSpec.java`
#### Snippet
```java
   */
  public String getMemory() {
    return resourceMap == null ? null : resourceMap.get("memory");
  }

```

### ReturnNull
Return of `null`
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/spec/NotebookPodSpec.java`
#### Snippet
```java
   */
  public String getCpu() {
    return resourceMap == null ? null : resourceMap.get("cpu");
  }

```

### ReturnNull
Return of `null`
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/environment/EnvironmentId.java`
#### Snippet
```java
  public static EnvironmentId fromString(String environmentId) {
    if (environmentId == null) {
      return null;
    }
    String[] components = environmentId.split("\\_");
```

### ReturnNull
Return of `null`
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/environment/EnvironmentId.java`
#### Snippet
```java
    String[] components = environmentId.split("\\_");
    if (components.length != 3) {
      return null;
    }
    return EnvironmentId.newInstance(Long.parseLong(components[1]),
```

### ReturnNull
Return of `null`
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/experiment/ExperimentId.java`
#### Snippet
```java
  public static ExperimentId fromString(String jobId) {
    if (jobId == null) {
      return null;
    }
    String[] components = jobId.split("\\-");
```

### ReturnNull
Return of `null`
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/experiment/ExperimentId.java`
#### Snippet
```java
    String[] components = jobId.split("\\-");
    if (components.length != 3) {
      return null;
    }
    return ExperimentId.newInstance(Long.parseLong(components[1]), Integer.parseInt(components[2]));
```

### ReturnNull
Return of `null`
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/experimenttemplate/ExperimentTemplateId.java`
#### Snippet
```java
  public static ExperimentTemplateId fromString(String experimentTemplateId) {
    if (experimentTemplateId == null) {
      return null;
    }
    String[] components = experimentTemplateId.split("\\_");
```

### ReturnNull
Return of `null`
in `submarine-server/server-api/src/main/java/org/apache/submarine/server/api/experimenttemplate/ExperimentTemplateId.java`
#### Snippet
```java
    String[] components = experimentTemplateId.split("\\_");
    if (components.length != 3) {
      return null;
    }
    return ExperimentTemplateId.newInstance(Long.parseLong(components[1]),
```

### ReturnNull
Return of `null`
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/notebook/service/NotebookService.java`
#### Snippet
```java
      return notebook;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/service/SysDictItemService.java`
#### Snippet
```java
    } catch (Exception e) {
      LOG.error(e.getMessage(), e);
      return null;
    }
    return dictItems;
```

### ReturnNull
Return of `null`
in `submarine-server/server-database/src/main/java/org/apache/submarine/server/database/workbench/service/SysUserService.java`
#### Snippet
```java
    } catch (Exception e) {
      LOG.error("Get error when creating user, skip ...", e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/K8sSubmitter.java`
#### Snippet
```java
      throw new SubmarineRuntimeException(e.getCode(), e.getMessage());
    } else {
      return null;
    }
  };
```

### ReturnNull
Return of `null`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/model/mljob/MLJob.java`
#### Snippet
```java
      return initContainer;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/parser/NotebookSpecParser.java`
#### Snippet
```java
              .getEnvironment(notebookSpec.getEnvironment().getName());
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/parser/NotebookSpecParser.java`
#### Snippet
```java
  private static List<V1EnvVar> parseEnvVars(NotebookPodSpec podSpec) {
    if (podSpec.getEnvVars() == null)
      return null;
    List<V1EnvVar> envVars = new ArrayList<>();
    for (Map.Entry<String, String> entry : podSpec.getEnvVars().entrySet()) {
```

### ReturnNull
Return of `null`
in `submarine-commons/commons-runtime/src/main/java/org/apache/submarine/commons/runtime/Framework.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `submarine-commons/commons-runtime/src/main/java/org/apache/submarine/commons/runtime/api/Runtime.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/parser/ExperimentSpecParser.java`
#### Snippet
```java
  private static List<V1EnvVar> parseEnvVars(Map<String, String> envMap) {
    if (envMap == null)
      return null;
    List<V1EnvVar> envVars = new ArrayList<>();
    for (Map.Entry<String, String> entry : envMap.entrySet()) {
```

### ReturnNull
Return of `null`
in `submarine-server/server-submitter/submitter-k8s/src/main/java/org/apache/submarine/server/submitter/k8s/parser/ExperimentSpecParser.java`
#### Snippet
```java
          .getEnvironment(experimentSpec.getEnvironment().getName());
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/security/simple/SimpleSecurityProvider.java`
#### Snippet
```java
          if (profiles.isEmpty()) {
            LOG.warn("No profiles found with default auth.");
            return null;
          } else {
            return profiles.iterator().next();
```

### ReturnNull
Return of `null`
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/security/oidc/OidcSecurityProvider.java`
#### Snippet
```java
          if (profiles.isEmpty()) {
            LOG.warn("No profiles found after OIDC auth.");
            return null;
          } else {
            return profiles.iterator().next();
```

### ReturnNull
Return of `null`
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/security/common/RegistryUserActionAdapter.java`
#### Snippet
```java
    // every time call back, check if this user is exists
    profile.ifPresent(this::createUndefinedUser);
    return null;
  }

```

### ReturnNull
Return of `null`
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/websocket/Message.java`
#### Snippet
```java
    } catch (ClassCastException e) {
      LOG.error("Failed to get " + key + " from message (Invalid type). " , e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `submarine-server/server-core/src/main/java/org/apache/submarine/server/workbench/websocket/Message.java`
#### Snippet
```java
    } catch (ClassCastException e) {
      LOG.error("Failed to get " + key + " from message (Invalid type). " , e);
      return null;
    }
  }
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

