# incubator-streampark 
 
# Bad smells
I found 359 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SpringJavaAutowiredFieldsWarningInspection | 151 | false |
| JavadocDeclaration | 84 | false |
| NullableProblems | 25 | false |
| SpringBootApplicationYaml | 22 | false |
| DataFlowIssue | 21 | false |
| UNCHECKED_WARNING | 7 | false |
| IgnoreResultOfCall | 7 | false |
| UnusedAssignment | 6 | false |
| JavadocReference | 4 | false |
| Deprecation | 3 | false |
| FieldCanBeLocal | 3 | false |
| DefaultAnnotationParam | 3 | false |
| NullArgumentToVariableArgMethod | 3 | false |
| JavadocLinkAsPlainText | 2 | false |
| EmptyStatementBody | 1 | false |
| TypeParameterHidesVisibleType | 1 | false |
| PlaceholderCountMatchesArgumentCount | 1 | false |
| RegExpRedundantEscape | 1 | false |
| RedundantComparatorComparing | 1 | false |
| SpringJavaInjectionPointsAutowiringInspection | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| DuplicatedCode | 1 | false |
| SwitchStatementWithConfusingDeclaration | 1 | false |
| AutoCloseableResource | 1 | false |
| ImplicitArrayToString | 1 | false |
| SpringMVCViewInspection | 1 | false |
| Lombok | 1 | false |
| ContextJavaBeanUnresolvedMethodsInspection | 1 | false |
| BusyWait | 1 | false |
| StringConcatenationInLoops | 1 | false |
| ConstantValue | 1 | false |
## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.api.common.serialization.SimpleStringSchema' to 'org.apache.flink.api.common.serialization.SerializationSchema'
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-kafka/src/main/java/org/apache/streampark/flink/connector/kafka/sink/KafkaJavaSink.java`
#### Snippet
```java
  private String alias = "";
  private String topic = "";
  private SerializationSchema<T> serializer = (SerializationSchema<T>) new SimpleStringSchema();
  private FlinkKafkaPartitioner<T> partitioner;

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map'
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisStreamLoader.java`
#### Snippet
```java
                null);
          }
          Map<String, Object> result = OBJECT_MAPPER.readValue(loadResult, HashMap.class);
          String labelState = (String) result.get("state");
          if (null == labelState) {
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.streampark.gateway.factories.Factory' to 'T'
in `streampark-flink/streampark-flink-sql-gateway/streampark-flink-sql-gateway-base/src/main/java/org/apache/streampark/gateway/factories/FactoryUtil.java`
#### Snippet
```java
    }

    return (T) matchingFactories.get(0);
  }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/FlinkCluster.java`
#### Snippet
```java
      return Collections.emptyMap();
    }
    Map<String, Object> map = JacksonUtils.read(this.options, Map.class);
    if (ExecutionMode.YARN_SESSION.equals(getExecutionModeEnum())) {
      map.put(ConfigConst.KEY_YARN_APP_NAME(), this.clusterName);
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper' to 'com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/alert/impl/AlertConfigServiceImpl.java`
#### Snippet
```java
  public IPage<AlertConfigWithParams> page(AlertConfigWithParams params, RestRequest request) {
    // build query conditions
    LambdaQueryWrapper<AlertConfig> wrapper = new LambdaQueryWrapper();
    wrapper.eq(params.getUserId() != null, AlertConfig::getUserId, params.getUserId());

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.HashMap'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ExternalLinkServiceImpl.java`
#### Snippet
```java

  private void renderLinkUrl(ExternalLink link, Application app) {
    HashMap<String, String> map = new HashMap();
    map.put(PlaceholderType.JOB_ID.get(), app.getJobId());
    map.put(PlaceholderType.JOB_NAME.get(), app.getJobName());
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.streampark.console.base.domain.router.RouterTree' to 'org.apache.streampark.console.base.domain.router.RouterTree'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/impl/MenuServiceImpl.java`
#### Snippet
```java
          m -> {
            ids.add(m.getMenuId().toString());
            trees.add(new RouterTree(m));
          });
      result.put("ids", ids);
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `TableResult`
in `streampark-flink/streampark-flink-sql-gateway/streampark-flink-sql-gateway-base/src/main/java/org/apache/streampark/gateway/results/ResultSet.java`
#### Snippet
```java
   *
   * <p>The schema of the DDL, USE, EXPLAIN, SHOW and DESCRIBE align with the schema of the {@link
   * TableResult#getResolvedSchema()}. The only differences is the schema of the `INSERT` statement.
   *
   * <p>The schema of INSERT:
```

### JavadocReference
Cannot resolve symbol `getResolvedSchema()`
in `streampark-flink/streampark-flink-sql-gateway/streampark-flink-sql-gateway-base/src/main/java/org/apache/streampark/gateway/results/ResultSet.java`
#### Snippet
```java
   *
   * <p>The schema of the DDL, USE, EXPLAIN, SHOW and DESCRIBE align with the schema of the {@link
   * TableResult#getResolvedSchema()}. The only differences is the schema of the `INSERT` statement.
   *
   * <p>The schema of INSERT:
```

### JavadocReference
Cannot resolve symbol `org.apache.streampark.flink.packer.pipeline.BuildPipeline`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/Application.java`
#### Snippet
```java
  private transient String flinkRestUrl;

  /** refer to {@link org.apache.streampark.flink.packer.pipeline.BuildPipeline} */
  private transient Integer buildStatus;

```

### JavadocReference
Symbol `WATCHING_APPS` is inaccessible from here
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/annotation/AppUpdated.java`
#### Snippet
```java
 * org.apache.streampark.console.core.aspect.StreamParkAspect#appUpdated(ProceedingJoinPoint)}, The
 * final purpose will be refresh {@link
 * org.apache.streampark.console.core.task.FlinkRESTAPIWatcher#WATCHING_APPS}, Make the state of the
 * job consistent with the database
 */
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getMessage` may produce `NullPointerException`
in `streampark-flink/streampark-flink-packer/src/main/java/com/github/dockerjava/api/command/HackBuildImageResultCallback.java`
#### Snippet
```java
    String stream = item.getStream();
    if (item.isErrorIndicated()) {
      listener.watchBuildStep(item.getErrorDetail().getMessage());
    } else if (stream != null && stream.startsWith(STEP_PREFIX)) {
      listener.watchBuildStep(stream);
```

### DataFlowIssue
Dereference of `dir.listFiles()` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
    }
    if (dir.isDirectory()) {
      for (File file : dir.listFiles()) {
        if (!deleteFile(file)) {
          return false;
```

### DataFlowIssue
Method invocation `getInputStream` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/interceptor/UploadFileTypeInterceptor.java`
#### Snippet
```java
        ApiAlertException.throwIfNull(
            multipartFile, "File to upload can't be null. Upload file failed.");
        boolean fileType = FileUtils.isJarFileType(multipartFile.getInputStream());
        ApiAlertException.throwIfFalse(
            fileType, "Illegal file type, Only support standard jar files. Upload file failed.");
```

### DataFlowIssue
Dereference of `parameterNames` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/aspect/StreamParkAspect.java`
#### Snippet
```java
    DefaultParameterNameDiscoverer discoverer = new DefaultParameterNameDiscoverer();
    String[] parameterNames = discoverer.getParameterNames(methodSignature.getMethod());
    for (int i = 0; i < parameterNames.length; i++) {
      context.setVariable(parameterNames[i], args[i]);
    }
```

### DataFlowIssue
Method invocation `getJobs` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkRESTAPIWatcher.java`
#### Snippet
```java
        || ExecutionMode.YARN_PER_JOB.equals(execMode)) {
      optional =
          jobsOverview.getJobs().size() > 1
              ? jobsOverview.getJobs().stream()
                  .filter(a -> StringUtils.equals(application.getJobId(), a.getId()))
```

### DataFlowIssue
Method invocation `getJobs` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkRESTAPIWatcher.java`
#### Snippet
```java
    } else {
      optional =
          jobsOverview.getJobs().stream()
              .filter(x -> x.getId().equals(application.getJobId()))
              .findFirst();
```

### DataFlowIssue
Dereference of `flinkLib.listFiles(f -> f.getName().matches("flink-dist.*\\.jar"))` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/FlinkEnvServiceImpl.java`
#### Snippet
```java
    File flinkLib = new File(lib);
    if (flinkLib.exists() && flinkLib.isDirectory()) {
      int distSize = flinkLib.listFiles(f -> f.getName().matches("flink-dist.*\\.jar")).length;
      if (distSize > 1) {
        return 2;
```

### DataFlowIssue
Dereference of `client.listFiles()` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/runner/EnvInitializer.java`
#### Snippet
```java
    File client = WebUtils.getAppClientDir();
    Utils.required(
        client.exists() && client.listFiles().length > 0,
        client.getAbsolutePath().concat(" is not exists or empty directory "));

```

### DataFlowIssue
Dereference of `client.listFiles(fileFilter)` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/runner/EnvInitializer.java`
#### Snippet
```java
    fsOperator.mkCleanDirs(appClient);

    for (File file : client.listFiles(fileFilter)) {
      log.info("load client:{} to {}", file.getName(), appClient);
      fsOperator.upload(file.getAbsolutePath(), appClient);
```

### DataFlowIssue
Dereference of `plugins.listFiles(fileFilter)` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/runner/EnvInitializer.java`
#### Snippet
```java

    File plugins = WebUtils.getAppPluginsDir();
    for (File file : plugins.listFiles(fileFilter)) {
      log.info("load plugin:{} to {}", file.getName(), appPlugins);
      fsOperator.upload(file.getAbsolutePath(), appPlugins);
```

### DataFlowIssue
Dereference of `shims` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/runner/EnvInitializer.java`
#### Snippet
```java
    fsOperator.delete(appShims);

    for (File file : shims) {
      Matcher matcher = PATTERN_FLINK_SHIMS_JAR.matcher(file.getName());
      if (matcher.matches()) {
```

### DataFlowIssue
Method invocation `setStop` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/SqlCompleteServiceImpl.java`
#### Snippet
```java
      }
      Utils.notNull(preNode);
      preNode.setStop();
      preNode.setCount(count);
    }
```

### DataFlowIssue
Method invocation `put` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ProjectServiceImpl.java`
#### Snippet
```java
          .data(new String(fileContent, StandardCharsets.UTF_8))
          .put("offset", endOffset)
          .put("readFinished", readFinished);
    } catch (IOException e) {
      String error =
```

### DataFlowIssue
Dereference of `files` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ProjectServiceImpl.java`
#### Snippet
```java
        File[] files = appHome.listFiles();
        if (CommonUtils.notEmpty(files)) {
          for (File file : files) {
            list.add(file.getName());
          }
```

### DataFlowIssue
Dereference of `files` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ProjectServiceImpl.java`
#### Snippet
```java
      File[] files = unzipFile.listFiles(x -> "conf".equals(x.getName()));
      Utils.notNull(files);
      for (File item : files) {
        eachFile(item, list, true);
      }
```

### DataFlowIssue
Dereference of `ExecutionMode.of(executionMode)` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/ApplicationHistoryController.java`
#### Snippet
```java
  public RestResponse listSessionClusterId(int executionMode) {
    List<String> clusterIds;
    switch (ExecutionMode.of(executionMode)) {
      case KUBERNETES_NATIVE_SESSION:
      case YARN_SESSION:
```

### DataFlowIssue
Method invocation `put` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/FlinkSqlController.java`
#### Snippet
```java
              .message(exception)
              .put("type", flinkSqlValidationResult.failedType().getValue())
              .put("start", flinkSqlValidationResult.lineStart())
              .put("end", flinkSqlValidationResult.lineEnd());

```

### DataFlowIssue
Method invocation `put` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/FlinkSqlController.java`
#### Snippet
```java
              .put("type", flinkSqlValidationResult.failedType().getValue())
              .put("start", flinkSqlValidationResult.lineStart())
              .put("end", flinkSqlValidationResult.lineEnd());

      if (flinkSqlValidationResult.errorLine() > 0) {
```

### DataFlowIssue
Method invocation `put` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/FlinkSqlController.java`
#### Snippet
```java
      if (flinkSqlValidationResult.errorLine() > 0) {
        response
            .put("start", flinkSqlValidationResult.errorLine())
            .put("end", flinkSqlValidationResult.errorLine() + 1);
      }
```

### DataFlowIssue
Method invocation `put` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/FlinkSqlController.java`
#### Snippet
```java
        response
            .put("start", flinkSqlValidationResult.errorLine())
            .put("end", flinkSqlValidationResult.errorLine() + 1);
      }
      return response;
```

### DataFlowIssue
Method invocation `message` may produce `NullPointerException`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/impl/AccessTokenServiceImpl.java`
#### Snippet
```java
    User user = userService.getById(userId);
    if (Objects.isNull(user)) {
      return RestResponse.success().put("code", 0).message("user not available");
    }

```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`else` statement has empty body
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkClusterWatcher.java`
#### Snippet
```java
              ClusterState state = getClusterState(flinkCluster);
              handleClusterState(flinkCluster, state);
            } else {
              // TODO: K8s Session status monitoring
            }
```

## RuleId[id=TypeParameterHidesVisibleType]
### TypeParameterHidesVisibleType
Type parameter `E` hides type parameter 'E'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
  public static <E> Iterator<E> toIterator(Enumeration<E> enumeration) {
    @SuppressWarnings("hiding")
    class EnumerationIterator<E> implements Iterator<E> {
      private final Enumeration<E> enumeration;

```

## RuleId[id=PlaceholderCountMatchesArgumentCount]
### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (0) than placeholders specified (1)
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/authentication/JWTUtil.java`
#### Snippet
```java
          .sign(algorithm);
    } catch (Exception e) {
      log.error("error：{}", e);
      return null;
    }
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/VariableServiceImpl.java`
#### Snippet
```java

  private static final Pattern PLACEHOLDER_PATTERN =
      Pattern.compile("\\$\\{([A-Za-z])+([A-Za-z0-9._-])+\\}");

  private static final String PLACEHOLDER_START = "${";
```

## RuleId[id=RedundantComparatorComparing]
### RedundantComparatorComparing
'Entry.comparingByValue()' can be used instead
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
  public static <K, V extends Comparable<? super V>> Map<K, V> sortMapByValue(Map<K, V> map) {
    List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(map.entrySet());
    Collections.sort(list, Comparator.comparing(Map.Entry::getValue));
    Map<K, V> result = new LinkedHashMap<>();
    for (Map.Entry<K, V> entry : list) {
```

## RuleId[id=SpringBootApplicationYaml]
### SpringBootApplicationYaml
Cannot resolve class or package 'mysql'
in `streampark-console/streampark-console-service/src/main/resources/application-mysql.yml`
#### Snippet
```java
    username: root
    password: streampark
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/streampark?useSSL=false&useUnicode=true&characterEncoding=UTF-8&allowPublicKeyRetrieval=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=GMT%2B8

```

### SpringBootApplicationYaml
Cannot resolve class or package 'cj'
in `streampark-console/streampark-console-service/src/main/resources/application-mysql.yml`
#### Snippet
```java
    username: root
    password: streampark
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/streampark?useSSL=false&useUnicode=true&characterEncoding=UTF-8&allowPublicKeyRetrieval=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=GMT%2B8

```

### SpringBootApplicationYaml
Cannot resolve class or package 'jdbc'
in `streampark-console/streampark-console-service/src/main/resources/application-mysql.yml`
#### Snippet
```java
    username: root
    password: streampark
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/streampark?useSSL=false&useUnicode=true&characterEncoding=UTF-8&allowPublicKeyRetrieval=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=GMT%2B8

```

### SpringBootApplicationYaml
Cannot resolve class 'Driver'
in `streampark-console/streampark-console-service/src/main/resources/application-mysql.yml`
#### Snippet
```java
    username: root
    password: streampark
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/streampark?useSSL=false&useUnicode=true&characterEncoding=UTF-8&allowPublicKeyRetrieval=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=GMT%2B8

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'spring.devtools.restart.enabled'
in `streampark-console/streampark-console-service/src/main/resources/application.yml`
#### Snippet
```java
  profiles.active: h2 #[h2,pgsql,mysql]
  application.name: StreamPark
  devtools.restart.enabled: false
  mvc.pathmatch.matching-strategy: ant_path_matcher
  servlet:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'streampark.proxy.yarn-url'
in `streampark-console/streampark-console-service/src/main/resources/application.yml`
#### Snippet
```java
  proxy:
    # knox process address https://cdpsit02.example.cn:8443/gateway/cdp-proxy/yarn
    yarn-url:
    # lark alert proxy,default https://open.feishu.cn
    lark-url:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'streampark.proxy.lark-url'
in `streampark-console/streampark-console-service/src/main/resources/application.yml`
#### Snippet
```java
    yarn-url:
    # lark alert proxy,default https://open.feishu.cn
    lark-url:
  yarn:
      # default sample, or kerberos
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'streampark.yarn.http-auth'
in `streampark-console/streampark-console-service/src/main/resources/application.yml`
#### Snippet
```java
  yarn:
      # default sample, or kerberos
    http-auth: sample

  # HADOOP_USER_NAME
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'streampark.hadoop-user-name'
in `streampark-console/streampark-console-service/src/main/resources/application.yml`
#### Snippet
```java

  # HADOOP_USER_NAME
  hadoop-user-name: hdfs
  # local workspace, used to store source code and build dir etc.
  workspace:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'streampark.workspace.local'
in `streampark-console/streampark-console-service/src/main/resources/application.yml`
#### Snippet
```java
  # local workspace, used to store source code and build dir etc.
  workspace:
    local: /opt/streampark_workspace
    remote: hdfs://hdfscluster/streampark   # support hdfs:///streampark/ 、 /streampark 、hdfs://host:ip/streampark/

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'streampark.workspace.remote'
in `streampark-console/streampark-console-service/src/main/resources/application.yml`
#### Snippet
```java
  workspace:
    local: /opt/streampark_workspace
    remote: hdfs://hdfscluster/streampark   # support hdfs:///streampark/ 、 /streampark 、hdfs://host:ip/streampark/

  # remote docker register namespace for streampark
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'streampark.docker.http-client.max-connections'
in `streampark-console/streampark-console-service/src/main/resources/application.yml`
#### Snippet
```java
    # instantiating DockerHttpClient
    http-client:
      max-connections: 10000
      connection-timeout-sec: 10000
      response-timeout-sec: 12000
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'streampark.docker.http-client.connection-timeout-sec'
in `streampark-console/streampark-console-service/src/main/resources/application.yml`
#### Snippet
```java
    http-client:
      max-connections: 10000
      connection-timeout-sec: 10000
      response-timeout-sec: 12000
      docker-host: ""
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'streampark.docker.http-client.response-timeout-sec'
in `streampark-console/streampark-console-service/src/main/resources/application.yml`
#### Snippet
```java
      max-connections: 10000
      connection-timeout-sec: 10000
      response-timeout-sec: 12000
      docker-host: ""

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'streampark.docker.http-client.docker-host'
in `streampark-console/streampark-console-service/src/main/resources/application.yml`
#### Snippet
```java
      connection-timeout-sec: 10000
      response-timeout-sec: 12000
      docker-host: ""

  # flink-k8s tracking configuration
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'streampark.flink-k8s.tracking.silent-state-keep-sec'
in `streampark-console/streampark-console-service/src/main/resources/application.yml`
#### Snippet
```java
  flink-k8s:
    tracking:
      silent-state-keep-sec: 10
      polling-task-timeout-sec:
        job-status: 120
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'streampark.flink-k8s.tracking.polling-task-timeout-sec.job-status'
in `streampark-console/streampark-console-service/src/main/resources/application.yml`
#### Snippet
```java
      silent-state-keep-sec: 10
      polling-task-timeout-sec:
        job-status: 120
        cluster-metric: 120
      polling-interval-sec:
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'streampark.flink-k8s.tracking.polling-task-timeout-sec.cluster-metric'
in `streampark-console/streampark-console-service/src/main/resources/application.yml`
#### Snippet
```java
      polling-task-timeout-sec:
        job-status: 120
        cluster-metric: 120
      polling-interval-sec:
        job-status: 2
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'streampark.flink-k8s.tracking.polling-interval-sec.job-status'
in `streampark-console/streampark-console-service/src/main/resources/application.yml`
#### Snippet
```java
        cluster-metric: 120
      polling-interval-sec:
        job-status: 2
        cluster-metric: 3

```

### SpringBootApplicationYaml
Cannot resolve configuration property 'streampark.flink-k8s.tracking.polling-interval-sec.cluster-metric'
in `streampark-console/streampark-console-service/src/main/resources/application.yml`
#### Snippet
```java
      polling-interval-sec:
        job-status: 2
        cluster-metric: 3

  # packer garbage resources collection configuration
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'streampark.shiro.jwtTimeOut'
in `streampark-console/streampark-console-service/src/main/resources/application.yml`
#### Snippet
```java
  shiro:
    # token timeout, unit second
    jwtTimeOut: 86400
    # backend authentication-free resources url
    anonUrl: >
```

### SpringBootApplicationYaml
Cannot resolve configuration property 'streampark.shiro.anonUrl'
in `streampark-console/streampark-console-service/src/main/resources/application.yml`
#### Snippet
```java
    jwtTimeOut: 86400
    # backend authentication-free resources url
    anonUrl: >

ldap:
```

## RuleId[id=SpringJavaInjectionPointsAutowiringInspection]
### SpringJavaInjectionPointsAutowiringInspection
Could not autowire. No beans of 'RoleMenuMapper' type found.
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/impl/RoleServiceImpl.java`
#### Snippet
```java
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

  @Autowired private RoleMenuMapper roleMenuMapper;

  @Autowired private MemberService memberService;
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisStreamLoader.java`
#### Snippet
```java
              return;
            case LAEBL_STATE_COMMITTED:
              return;
            case RESULT_LABEL_PREPARE:
              continue;
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkClusterWatcher.java`
#### Snippet
```java
   */
  private ClusterState finalApplicationStatusConvertClusterState(FinalApplicationStatus status) {
    switch (status) {
      case UNDEFINED:
        return ClusterState.RUNNING;
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/ObjectUtils.java`
#### Snippet
```java
    if (array == null) {
      return NULL_STRING;
    }
    int length = array.length;
    if (length == 0) {
      return EMPTY_ARRAY;
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < length; i++) {
      if (i == 0) {
        sb.append(ARRAY_START);
      } else {
        sb.append(ARRAY_ELEMENT_SEPARATOR);
      }
      sb.append(array[i]);
    }
    sb.append(ARRAY_END);
    return sb.toString();
```

## RuleId[id=Deprecation]
### Deprecation
'com.github.dockerjava.core.command.PushImageResultCallback' is deprecated
in `streampark-flink/streampark-flink-packer/src/main/java/com/github/dockerjava/api/command/HackPushImageResultCallback.java`
#### Snippet
```java
import com.github.dockerjava.core.command.PushImageResultCallback;

public class HackPushImageResultCallback extends PushImageResultCallback {

  private final PushImageCallbackListener listener;
```

### Deprecation
'org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer' is deprecated
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-kafka/src/main/java/org/apache/streampark/flink/connector/kafka/source/KafkaJavaSource.java`
#### Snippet
```java

  public DataStreamSource<KafkaRecord<T>> getDataStream() {
    FlinkKafkaConsumer<KafkaRecord<T>> consumer =
        KafkaSource.getSource(
            this.context,
```

### Deprecation
'readFileToString(java.io.File)' is deprecated
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/FlinkEnv.java`
#### Snippet
```java
    try {
      File yaml = new File(this.flinkHome.concat("/conf/flink-conf.yaml"));
      String flinkConf = FileUtils.readFileToString(yaml);
      this.flinkConf = DeflaterUtils.zipString(flinkConf);
    } catch (Exception e) {
```

## RuleId[id=SwitchStatementWithConfusingDeclaration]
### SwitchStatementWithConfusingDeclaration
Local variable `member` declared in one 'switch' branch and used in another
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/aspect/StreamParkAspect.java`
#### Snippet
```java
          break;
        case TEAM:
          Member member = memberService.findByUserName(paramId, currentUser.getUsername());
          ApiAlertException.throwIfTrue(
              member == null,
```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `streampark-flink/streampark-flink-sql-gateway/streampark-flink-sql-gateway-base/src/main/java/org/apache/streampark/gateway/results/OperationInfo.java`
#### Snippet
```java

  private final OperationStatus status;
  @Nullable private final Exception exception;

  public OperationInfo(OperationStatus status, @Nullable Exception exception) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `streampark-flink/streampark-flink-sql-gateway/streampark-flink-sql-gateway-base/src/main/java/org/apache/streampark/gateway/results/Column.java`
#### Snippet
```java
  private final String type;

  private final @Nullable String comment;

  public Column(String name, String type, String comment) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `streampark-flink/streampark-flink-sql-gateway/streampark-flink-sql-gateway-base/src/main/java/org/apache/streampark/gateway/results/ObjectIdentifier.java`
#### Snippet
```java

  private final @Nullable String catalogName;
  private final @Nullable String databaseName;
  private final String objectName;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `streampark-flink/streampark-flink-sql-gateway/streampark-flink-sql-gateway-base/src/main/java/org/apache/streampark/gateway/results/ObjectIdentifier.java`
#### Snippet
```java
  static final String UNKNOWN = "<UNKNOWN>";

  private final @Nullable String catalogName;
  private final @Nullable String databaseName;
  private final String objectName;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `streampark-flink/streampark-flink-sql-gateway/streampark-flink-sql-gateway-base/src/main/java/org/apache/streampark/gateway/session/SessionEnvironment.java`
#### Snippet
```java
/** Environment to initialize the {@code Session}. */
public class SessionEnvironment implements Serializable {
  private final @Nullable String sessionName;
  private final @Nullable String defaultCatalog;
  private final Map<String, String> sessionConfig;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `streampark-flink/streampark-flink-sql-gateway/streampark-flink-sql-gateway-base/src/main/java/org/apache/streampark/gateway/session/SessionEnvironment.java`
#### Snippet
```java
public class SessionEnvironment implements Serializable {
  private final @Nullable String sessionName;
  private final @Nullable String defaultCatalog;
  private final Map<String, String> sessionConfig;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `streampark-flink/streampark-flink-sql-gateway/streampark-flink-sql-gateway-base/src/main/java/org/apache/streampark/gateway/results/ResultSet.java`
#### Snippet
```java
   * job. Otherwise, returns null.
   */
  @Nullable private final JobID jobID;

  /** Gets the result kind of the result. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `streampark-flink/streampark-flink-sql-gateway/streampark-flink-sql-gateway-base/src/main/java/org/apache/streampark/gateway/results/ResultSet.java`
#### Snippet
```java
   * <p>When the token is null, it means all the data has been fetched.
   */
  @Nullable private final Long nextToken;

  /**
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/SpringContextUtils.java`
#### Snippet
```java

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    SpringContextUtils.applicationContext = applicationContext;
  }
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/interceptor/UploadFileTypeInterceptor.java`
#### Snippet
```java
  @Override
  public void postHandle(
      HttpServletRequest request,
      HttpServletResponse response,
      Object handler,
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/interceptor/UploadFileTypeInterceptor.java`
#### Snippet
```java
  public void postHandle(
      HttpServletRequest request,
      HttpServletResponse response,
      Object handler,
      ModelAndView modelAndView)
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/interceptor/UploadFileTypeInterceptor.java`
#### Snippet
```java
      HttpServletRequest request,
      HttpServletResponse response,
      Object handler,
      ModelAndView modelAndView)
      throws Exception {
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/interceptor/UploadFileTypeInterceptor.java`
#### Snippet
```java

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
      throws Exception {
    if (request instanceof MultipartHttpServletRequest) {
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/interceptor/UploadFileTypeInterceptor.java`
#### Snippet
```java

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
      throws Exception {
    if (request instanceof MultipartHttpServletRequest) {
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/interceptor/UploadFileTypeInterceptor.java`
#### Snippet
```java

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
      throws Exception {
    if (request instanceof MultipartHttpServletRequest) {
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/interceptor/UploadFileTypeInterceptor.java`
#### Snippet
```java
  @Override
  public void afterCompletion(
      HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
      throws Exception {
    HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/interceptor/UploadFileTypeInterceptor.java`
#### Snippet
```java
  @Override
  public void afterCompletion(
      HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
      throws Exception {
    HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/interceptor/UploadFileTypeInterceptor.java`
#### Snippet
```java
  @Override
  public void afterCompletion(
      HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
      throws Exception {
    HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/bean/AppBuildDockerResolvedDetail.java`
#### Snippet
```java
public class AppBuildDockerResolvedDetail {

  @Nullable private ImagePull pull;
  @Nullable private ImageBuild build;
  @Nullable private ImagePush push;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/bean/AppBuildDockerResolvedDetail.java`
#### Snippet
```java

  @Nullable private ImagePull pull;
  @Nullable private ImageBuild build;
  @Nullable private ImagePush push;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/bean/AppBuildDockerResolvedDetail.java`
#### Snippet
```java
  @Nullable private ImagePull pull;
  @Nullable private ImageBuild build;
  @Nullable private ImagePush push;

  public static AppBuildDockerResolvedDetail of(@Nullable DockerResolvedSnapshot snapshot) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/utils/YarnQueueLabelExpression.java`
#### Snippet
```java

  private final String queue;
  private @Nullable final String labelExpression;

  private YarnQueueLabelExpression(String queue, String labelExpression) {
```

### NullableProblems
Overridden method parameters are not annotated
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/AppBuildPipeService.java`
#### Snippet
```java
   * @return Whether the pipeline was successfully started
   */
  boolean buildApplication(@Nonnull Long appId, boolean forceBuild) throws Exception;

  /**
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/SettingServiceImpl.java`
#### Snippet
```java

  @Override
  public void onApplicationEvent(ContextRefreshedEvent event) {
    List<Setting> settingList = super.list();
    settingList.forEach(x -> SETTINGS.put(x.getSettingKey(), x));
```

### NullableProblems
Not annotated parameter overrides @Nonnull parameter
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/AppBuildPipeServiceImpl.java`
#### Snippet
```java
   */
  @Override
  public boolean buildApplication(Long appId, boolean forceBuild) {
    // check the build environment
    checkBuildEnv(appId, forceBuild);
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/StreamParkConsoleBootstrap.java`
#### Snippet
```java
 *                                     /_/
 *
 *   WebSite:  https://streampark.apache.org
 *   GitHub :  https://github.com/apache/incubator-streampark
 *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/StreamParkConsoleBootstrap.java`
#### Snippet
```java
 *
 *   WebSite:  https://streampark.apache.org
 *   GitHub :  https://github.com/apache/incubator-streampark
 *
 *   [StreamPark] Make stream processing easier ô~ô!
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkFunction.java`
#### Snippet
```java

  private static final Logger LOGGER = LoggerFactory.getLogger(DorisSinkFunction.class);
  private final Properties properties;
  private final DorisSinkWriter dorisSinkWriter;
  private final DorisConfig dorisConfig;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `streampark-common/src/main/java/org/apache/streampark/common/enums/DevelopmentMode.java`
#### Snippet
```java
  FLINK_SQL("Flink SQL", 2);

  private final String mode;

  private final Integer value;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkWriter.java`
#### Snippet
```java

  private final Map<String, DorisSinkBufferEntry> bufferMap = new ConcurrentHashMap<>();
  private final Long timeout = 3000L;
  private volatile boolean closed = false;
  private volatile boolean flushThreadAlive = false;
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdir()` is ignored
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/GZipUtils.java`
#### Snippet
```java
          File tmpFile = new File(fullFilePath);
          if (!tmpFile.exists()) {
            tmpFile.mkdir();
          }
        }
```

### IgnoreResultOfCall
Result of `File.mkdir()` is ignored
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/GZipUtils.java`
#### Snippet
```java
        File tmpFile = new File(fullFilePath);
        if (!tmpFile.exists()) {
          tmpFile.mkdir();
        }
      }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/ProjectBuildTask.java`
#### Snippet
```java
        File deployPath = project.getDistHome();
        if (!deployPath.exists()) {
          deployPath.mkdirs();
        }
        // xzvf jar
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/ProjectBuildTask.java`
#### Snippet
```java
        File targetDir = new File(distHome, moduleName);
        if (!targetDir.exists()) {
          targetDir.mkdirs();
        }
        File targetJar = new File(targetDir, app.getName());
```

### IgnoreResultOfCall
Result of `File.renameTo()` is ignored
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/ProjectBuildTask.java`
#### Snippet
```java
        }
        File targetJar = new File(targetDir, app.getName());
        app.renameTo(targetJar);
      }
    }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/entity/Project.java`
#### Snippet
```java
    File sourcePath = new File(appSource);
    if (!sourcePath.exists()) {
      sourcePath.mkdirs();
    }
    if (sourcePath.isFile()) {
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
    // delete when exists
    if (saveFile.exists()) {
      saveFile.delete();
    }
    // save file to temp dir
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/domain/RestRequest.java`
#### Snippet
```java
  private int pageNum = 1;

  @Schema(example = "", description = "e.g. create_time")
  private String sortField;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/domain/RestRequest.java`
#### Snippet
```java

  @Schema(
      example = "",
      allowableValues = {"asc", "desc"})
  private String sortOrder;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/ApplicationController.java`
#### Snippet
```java
        description = "ignore savepoint if cannot be restored",
        in = ParameterIn.QUERY,
        required = false,
        schema = @Schema(implementation = boolean.class, defaultValue = "false"))
  })
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'Session' used without 'try'-with-resources statement
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/websocket/WebSocketEndpoint.java`
#### Snippet
```java
    log.debug("websocket onClose....");
    this.session.close();
    SOCKET_SESSIONS.remove(this.id);
  }

```

## RuleId[id=ImplicitArrayToString]
### ImplicitArrayToString
Implicit call to 'toString()' on array returned by call to `data.getDataRows()`
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkFunction.java`
#### Snippet
```java
            String.format(
                " row data not fullfilled. {database: %s, table: %s, dataRows: %s}",
                data.getDatabase(), data.getTable(), data.getDataRows()));
        return;
      }
```

## RuleId[id=SpringMVCViewInspection]
### SpringMVCViewInspection
Cannot resolve MVC view '/index.html'
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/IndexController.java`
#### Snippet
```java
  @GetMapping("/")
  public ModelAndView index() {
    return new ModelAndView("/index.html");
  }
}
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param environment` tag description is missing
in `streampark-flink/streampark-flink-shims/streampark-flink-shims-base/src/main/java/org/apache/streampark/flink/core/StreamEnvConfigFunction.java`
#### Snippet
```java
   * 用于初始化StreamExecutionEnvironment的时候,用于可以实现该函数,自定义要设置的参数...
   *
   * @param environment
   * @param parameterTool
   */
```

### JavadocDeclaration
`@param tableConfig` tag description is missing
in `streampark-flink/streampark-flink-shims/streampark-flink-shims-base/src/main/java/org/apache/streampark/flink/core/TableEnvConfigFunction.java`
#### Snippet
```java
   * 用于初始化TableEnvironment的时候,用于可以实现该函数,自定义要设置的参数...
   *
   * @param tableConfig
   * @param parameterTool
   */
```

### JavadocDeclaration
`@param parameterTool` tag description is missing
in `streampark-flink/streampark-flink-shims/streampark-flink-shims-base/src/main/java/org/apache/streampark/flink/core/TableEnvConfigFunction.java`
#### Snippet
```java
   *
   * @param tableConfig
   * @param parameterTool
   */
  void configuration(TableConfig tableConfig, ParameterTool parameterTool);
```

### JavadocDeclaration
`@param parameterTool` tag description is missing
in `streampark-flink/streampark-flink-shims/streampark-flink-shims-base/src/main/java/org/apache/streampark/flink/core/StreamEnvConfigFunction.java`
#### Snippet
```java
   *
   * @param environment
   * @param parameterTool
   */
  void configuration(StreamExecutionEnvironment environment, ParameterTool parameterTool);
```

### JavadocDeclaration
`@param source` tag description is missing
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/sink/DorisSink.java`
#### Snippet
```java
   * java stream
   *
   * @param source
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/sink/DorisSink.java`
#### Snippet
```java
   *
   * @param source
   * @return
   */
  public DataStreamSink<T> sink(DataStream<T> source) {
```

### JavadocDeclaration
`@param source` tag description is missing
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/sink/DorisSink.java`
#### Snippet
```java
   * scala stream
   *
   * @param source
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/sink/DorisSink.java`
#### Snippet
```java
   *
   * @param source
   * @return
   */
  public DataStreamSink<T> sink(org.apache.flink.streaming.api.scala.DataStream<T> source) {
```

### JavadocDeclaration
Wrong tag `since:`
in `streampark-common/src/main/java/org/apache/streampark/common/enums/ClusterState.java`
#### Snippet
```java
import java.io.Serializable;

/** @since: 1.2.3 */
public enum ClusterState implements Serializable {
  /** The cluster was just created but not started */
```

### JavadocDeclaration
`@return` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/GZipUtils.java`
#### Snippet
```java
   * @param entry archive entry
   * @param type type: 1, dir; 2, file
   * @return
   */
  private static String createDir(String baseDir, String entry, int type) {
```

### JavadocDeclaration
`@param length` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/ShaHashUtils.java`
#### Snippet
```java
   * get random salt
   *
   * @param length
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/ShaHashUtils.java`
#### Snippet
```java
   *
   * @param length
   * @return
   */
  public static String getRandomSalt(int length) {
```

### JavadocDeclaration
`@param salt` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/ShaHashUtils.java`
#### Snippet
```java
   * encrypt user password
   *
   * @param salt
   * @param password
   * @return
```

### JavadocDeclaration
`@param password` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/ShaHashUtils.java`
#### Snippet
```java
   *
   * @param salt
   * @param password
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/ShaHashUtils.java`
#### Snippet
```java
   * @param salt
   * @param password
   * @return
   */
  public static String encrypt(String salt, String password) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/FileUtils.java`
#### Snippet
```java
   * @param maxSize Maximum size of read file
   * @return The file content
   * @throws IOException
   */
  public static byte[] readFileFromOffset(File file, long startOffset, long maxSize)
```

### JavadocDeclaration
`@throws` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/FileUtils.java`
#### Snippet
```java
   * @param maxSize Maximum size of read file
   * @return The file content
   * @throws IOException
   */
  public static byte[] readEndOfFile(File file, long maxSize) throws IOException {
```

### JavadocDeclaration
`@param objList` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
   * convert List<T> to List<Map<String, Object>>
   *
   * @param objList
   * @return
   * @throws IOException
```

### JavadocDeclaration
`@return` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
   *
   * @param objList
   * @return
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
   * @param objList
   * @return
   * @throws IOException
   */
  public static <T> List<Map<String, Object>> objectsToMaps(List<T> objList) {
```

### JavadocDeclaration
IOException is not declared to be thrown by method objectsToMaps
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
   * @param objList
   * @return
   * @throws IOException
   */
  public static <T> List<Map<String, Object>> objectsToMaps(List<T> objList) {
```

### JavadocDeclaration
`@return` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
   * @param maps maps
   * @param clazz element class
   * @return
   * @throws InstantiationException
   * @throws IllegalAccessException
```

### JavadocDeclaration
`@throws` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
   * @param clazz element class
   * @return
   * @throws InstantiationException
   * @throws IllegalAccessException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
   * @return
   * @throws InstantiationException
   * @throws IllegalAccessException
   */
  public static <T> List<T> mapsToObjects(List<Map<String, Object>> maps, Class<T> clazz)
```

### JavadocDeclaration
Class/method reference, quoted text, or HTML link are expected after @see tag
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
   * @param objs handle obj
   * @return Boolean
   * @see <b>Returns true if the object is Null, returns true if the size of the collection is 0,
   *     and returns true if the iterator has no next</b>
   * @since 1.0
```

### JavadocDeclaration
`@param flinkCluster` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkClusterWatcher.java`
#### Snippet
```java
   * cluster get state from yarn rest api
   *
   * @param flinkCluster
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkClusterWatcher.java`
#### Snippet
```java
   *
   * @param flinkCluster
   * @return
   */
  private ClusterState getClusterStateFromYarnAPI(FlinkCluster flinkCluster) {
```

### JavadocDeclaration
`@param value` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkClusterWatcher.java`
#### Snippet
```java
   * string conver final application status
   *
   * @param value
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkClusterWatcher.java`
#### Snippet
```java
   *
   * @param value
   * @return
   */
  private FinalApplicationStatus stringConvertFinalApplicationStatus(String value) {
```

### JavadocDeclaration
`@param flinkCluster` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkClusterWatcher.java`
#### Snippet
```java
   * Remove a cluster from cache
   *
   * @param flinkCluster
   */
  public static void removeFlinkCluster(FlinkCluster flinkCluster) {
```

### JavadocDeclaration
`@param flinkCluster` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkClusterWatcher.java`
#### Snippet
```java
   * process cluster state
   *
   * @param flinkCluster
   * @param state
   */
```

### JavadocDeclaration
`@param state` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkClusterWatcher.java`
#### Snippet
```java
   *
   * @param flinkCluster
   * @param state
   */
  private void handleClusterState(FlinkCluster flinkCluster, ClusterState state) {
```

### JavadocDeclaration
`@param status` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkClusterWatcher.java`
#### Snippet
```java
   * final application status convert cluster state
   *
   * @param status
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkClusterWatcher.java`
#### Snippet
```java
   *
   * @param status
   * @return
   */
  private ClusterState finalApplicationStatusConvertClusterState(FinalApplicationStatus status) {
```

### JavadocDeclaration
`@param flinkCluster` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkClusterWatcher.java`
#### Snippet
```java
   * cluster get state from flink rest api
   *
   * @param flinkCluster
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkClusterWatcher.java`
#### Snippet
```java
   *
   * @param flinkCluster
   * @return
   */
  private ClusterState getClusterStateFromFlinkAPI(FlinkCluster flinkCluster) {
```

### JavadocDeclaration
`@param flinkCluster` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkClusterWatcher.java`
#### Snippet
```java
   * cluster get state from flink or yarn api
   *
   * @param flinkCluster
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkClusterWatcher.java`
#### Snippet
```java
   *
   * @param flinkCluster
   * @return
   */
  private ClusterState getClusterState(FlinkCluster flinkCluster) {
```

### JavadocDeclaration
`@param flinkCluster` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkClusterWatcher.java`
#### Snippet
```java
   * Add a cluster to cache
   *
   * @param flinkCluster
   */
  public static void addFlinkCluster(FlinkCluster flinkCluster) {
```

### JavadocDeclaration
`@param id` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/FlinkEnvService.java`
#### Snippet
```java
   * set a flink version as the default
   *
   * @param id
   */
  void setDefault(Long id);
```

### JavadocDeclaration
`@param version` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/FlinkEnvService.java`
#### Snippet
```java
   * create new
   *
   * @param version
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/FlinkEnvService.java`
#### Snippet
```java
   *
   * @param version
   * @throws IOException
   */
  boolean create(FlinkEnv version) throws Exception;
```

### JavadocDeclaration
`@param id` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/FlinkEnvService.java`
#### Snippet
```java
   * sycn conf file
   *
   * @param id
   */
  void syncConf(Long id) throws IOException;
```

### JavadocDeclaration
`@return` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/FlinkEnvService.java`
#### Snippet
```java
   * get flink version, if null, get default version
   *
   * @return
   */
  FlinkEnv getByIdOrDefault(Long id);
```

### JavadocDeclaration
`@return` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/FlinkEnvService.java`
#### Snippet
```java
   * get default version
   *
   * @return
   */
  FlinkEnv getDefault();
```

### JavadocDeclaration
`@param appId` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/FlinkEnvService.java`
#### Snippet
```java
   * get flink version by appid
   *
   * @param appId
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/FlinkEnvService.java`
#### Snippet
```java
   *
   * @param appId
   * @return
   */
  FlinkEnv getByAppId(Long appId);
```

### JavadocDeclaration
`@param version` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/FlinkEnvService.java`
#### Snippet
```java
   * check exists
   *
   * @param version
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/FlinkEnvService.java`
#### Snippet
```java
   *
   * @param version
   * @return
   */
  Integer check(FlinkEnv version);
```

### JavadocDeclaration
`@param version` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/FlinkEnvService.java`
#### Snippet
```java
   * update
   *
   * @param version
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/FlinkEnvService.java`
#### Snippet
```java
   *
   * @param version
   * @throws IOException
   */
  void update(FlinkEnv version) throws IOException;
```

### JavadocDeclaration
`@param id` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/FlinkEnvService.java`
#### Snippet
```java
   * delete flink env
   *
   * @param id
   */
  void delete(Long id);
```

### JavadocDeclaration
`@param resource` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/ResourceService.java`
#### Snippet
```java
   * delete resource
   *
   * @param resource
   */
  void deleteResource(Resource resource);
```

### JavadocDeclaration
`@param teamId` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/ResourceService.java`
#### Snippet
```java
   * Get resource through team id.
   *
   * @param teamId
   * @return team resources
   */
```

### JavadocDeclaration
`@param appId` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/AppBuildPipeService.java`
#### Snippet
```java
   * delete appBuildPipeline By application
   *
   * @param appId
   */
  void removeApp(Long appId);
```

### JavadocDeclaration
`@param teamId` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/VariableService.java`
#### Snippet
```java
   * get variables through team
   *
   * @param teamId
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/VariableService.java`
#### Snippet
```java
   *
   * @param teamId
   * @return
   */
  List<Variable> findByTeamId(Long teamId);
```

### JavadocDeclaration
`@param teamId` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/VariableService.java`
#### Snippet
```java
   * Get variables through team and search keywords.
   *
   * @param teamId
   * @param keyword Fuzzy search keywords through variable code or description, Nullable.
   * @return
```

### JavadocDeclaration
`@return` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/VariableService.java`
#### Snippet
```java
   * @param teamId
   * @param keyword Fuzzy search keywords through variable code or description, Nullable.
   * @return
   */
  List<Variable> findByTeamId(Long teamId, String keyword);
```

### JavadocDeclaration
`@param teamId` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/VariableServiceImpl.java`
#### Snippet
```java
   * Replace variable with defined variable codes.
   *
   * @param teamId
   * @param mixed Text with placeholders, e.g. "--cluster ${kafka.cluster}"
   * @return
```

### JavadocDeclaration
`@return` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/VariableServiceImpl.java`
#### Snippet
```java
   * @param teamId
   * @param mixed Text with placeholders, e.g. "--cluster ${kafka.cluster}"
   * @return
   */
  @Override
```

### JavadocDeclaration
`@param teamId` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/VariableServiceImpl.java`
#### Snippet
```java
   * Get variables through team and search keywords.
   *
   * @param teamId
   * @param keyword Fuzzy search keywords through variable code or description, Nullable.
   * @return
```

### JavadocDeclaration
`@return` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/VariableServiceImpl.java`
#### Snippet
```java
   * @param teamId
   * @param keyword Fuzzy search keywords through variable code or description, Nullable.
   * @return
   */
  @Override
```

### JavadocDeclaration
`@param teamId` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/VariableServiceImpl.java`
#### Snippet
```java
   * get variables through team
   *
   * @param teamId
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/VariableServiceImpl.java`
#### Snippet
```java
   *
   * @param teamId
   * @return
   */
  @Override
```

### JavadocDeclaration
Tag `return` is not allowed here
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/AppBuildPipeServiceImpl.java`
#### Snippet
```java
   * @param appId application id
   * @param forceBuild forced start pipeline or not
   * @return
   */
  private void checkBuildEnv(Long appId, boolean forceBuild) {
```

### JavadocDeclaration
`@param restRequest` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/VariableController.java`
#### Snippet
```java
   * Get variable list by page.
   *
   * @param restRequest
   * @param variable
   * @return
```

### JavadocDeclaration
`@param variable` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/VariableController.java`
#### Snippet
```java
   *
   * @param restRequest
   * @param variable
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/VariableController.java`
#### Snippet
```java
   * @param restRequest
   * @param variable
   * @return
   */
  @Operation(summary = "List variables")
```

### JavadocDeclaration
`@param teamId` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/VariableController.java`
#### Snippet
```java
   * Get variables through team and search keywords.
   *
   * @param teamId
   * @param keyword Fuzzy search keywords through variable code or description, Nullable.
   * @return
```

### JavadocDeclaration
`@return` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/VariableController.java`
#### Snippet
```java
   * @param teamId
   * @param keyword Fuzzy search keywords through variable code or description, Nullable.
   * @return
   */
  @Operation(summary = "List variables")
```

### JavadocDeclaration
`@param user` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/UserService.java`
#### Snippet
```java
   * update password
   *
   * @param user
   * @throws Exception
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/UserService.java`
#### Snippet
```java
   *
   * @param user
   * @throws Exception
   */
  void updatePassword(User user) throws Exception;
```

### JavadocDeclaration
`@return` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/UserService.java`
#### Snippet
```java
   *
   * @param user user
   * @return
   */
  RestResponse updateUser(User user) throws Exception;
```

### JavadocDeclaration
`@param userId` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/authentication/JWTUtil.java`
#### Snippet
```java
   * generate token
   *
   * @param userId
   * @param userName
   * @param expireTime
```

### JavadocDeclaration
`@param userName` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/authentication/JWTUtil.java`
#### Snippet
```java
   *
   * @param userId
   * @param userName
   * @param expireTime
   * @return
```

### JavadocDeclaration
`@param expireTime` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/authentication/JWTUtil.java`
#### Snippet
```java
   * @param userId
   * @param userName
   * @param expireTime
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/authentication/JWTUtil.java`
#### Snippet
```java
   * @param userName
   * @param expireTime
   * @return
   */
  public static String sign(Long userId, String userName, Long expireTime) {
```

### JavadocDeclaration
`@param userId` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/authentication/JWTUtil.java`
#### Snippet
```java
   * generate token
   *
   * @param userId
   * @param userName
   * @return
```

### JavadocDeclaration
`@param userName` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/authentication/JWTUtil.java`
#### Snippet
```java
   *
   * @param userId
   * @param userName
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/authentication/JWTUtil.java`
#### Snippet
```java
   * @param userId
   * @param userName
   * @return
   */
  public static String sign(Long userId, String userName) {
```

### JavadocDeclaration
`@param application` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
   * Setup task is starting (for webUI "state" display)
   *
   * @param application
   */
  @Override
```

### JavadocDeclaration
`@param application` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
   * 3. parameter has changed<br>
   *
   * @param application
   * @param appParam
   */
```

### JavadocDeclaration
`@param appParam` tag description is missing
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
   *
   * @param application
   * @param appParam
   */
  private void updateFlinkSqlJob(Application application, Application appParam) {
```

## RuleId[id=Lombok]
### Lombok
Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '(callSuper=false)' to your type.
in `streampark-storage/src/main/java/org/apache/streampark/storage/oss/OssConfig.java`
#### Snippet
```java
import lombok.Data;

@Data
public class OssConfig extends StorageServiceConfig {
  private String accessKeyId;
```

## RuleId[id=ContextJavaBeanUnresolvedMethodsInspection]
### ContextJavaBeanUnresolvedMethodsInspection
Cannot resolve method
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkK8sWatcherWrapper.java`
#### Snippet
```java

  /** Register FlinkTrackMonitor bean for tracking flink job on kubernetes. */
  @Bean(destroyMethod = "close")
  public FlinkK8sWatcher registerFlinkK8sWatcher() {
    // lazy start tracking monitor
```

## RuleId[id=SpringJavaAutowiredFieldsWarningInspection]
### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/config/WebMvcConfig.java`
#### Snippet
```java
public class WebMvcConfig implements WebMvcConfigurer {

  @Autowired private UploadFileTypeInterceptor uploadFileTypeInterceptor;

  @Override
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/CheckpointProcessor.java`
#### Snippet
```java
  @Autowired private SavePointService savePointService;

  @Autowired private FlinkRESTAPIWatcher flinkRESTAPIWatcher;

  public void process(Application application, @Nonnull CheckPoints checkPoints) {
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/CheckpointProcessor.java`
#### Snippet
```java
  @Autowired private ApplicationService applicationService;

  @Autowired private AlertService alertService;

  @Autowired private SavePointService savePointService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/CheckpointProcessor.java`
#### Snippet
```java
  @Autowired private AlertService alertService;

  @Autowired private SavePointService savePointService;

  @Autowired private FlinkRESTAPIWatcher flinkRESTAPIWatcher;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/CheckpointProcessor.java`
#### Snippet
```java
  private final Map<Long, Counter> checkPointFailedCache = new ConcurrentHashMap<>(0);

  @Autowired private ApplicationService applicationService;

  @Autowired private AlertService alertService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkK8sWatcherWrapper.java`
#### Snippet
```java
  @Lazy @Autowired private FlinkK8sChangeEventListener flinkK8sChangeEventListener;

  @Lazy @Autowired private ApplicationService applicationService;

  /** Register FlinkTrackMonitor bean for tracking flink job on kubernetes. */
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkK8sWatcherWrapper.java`
#### Snippet
```java
public class FlinkK8sWatcherWrapper {

  @Lazy @Autowired private FlinkK8sChangeEventListener flinkK8sChangeEventListener;

  @Lazy @Autowired private ApplicationService applicationService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkK8sChangeEventListener.java`
#### Snippet
```java
public class FlinkK8sChangeEventListener {

  @Lazy @Autowired private ApplicationService applicationService;

  @Lazy @Autowired private AlertService alertService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkK8sChangeEventListener.java`
#### Snippet
```java
  @Lazy @Autowired private AlertService alertService;

  @Lazy @Autowired private CheckpointProcessor checkpointProcessor;

  private final ExecutorService executor =
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkK8sChangeEventListener.java`
#### Snippet
```java
  @Lazy @Autowired private ApplicationService applicationService;

  @Lazy @Autowired private AlertService alertService;

  @Lazy @Autowired private CheckpointProcessor checkpointProcessor;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkClusterWatcher.java`
#### Snippet
```java
public class FlinkClusterWatcher {

  @Autowired private FlinkClusterService flinkClusterService;

  private Long lastWatcheringTime = 0L;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/aspect/StreamParkAspect.java`
#### Snippet
```java
  @Autowired private FlinkRESTAPIWatcher flinkRESTAPIWatcher;
  @Autowired private CommonService commonService;
  @Autowired private MemberService memberService;
  @Autowired private ApplicationService applicationService;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/aspect/StreamParkAspect.java`
#### Snippet
```java

  @Autowired private FlinkRESTAPIWatcher flinkRESTAPIWatcher;
  @Autowired private CommonService commonService;
  @Autowired private MemberService memberService;
  @Autowired private ApplicationService applicationService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/aspect/StreamParkAspect.java`
#### Snippet
```java
  @Autowired private CommonService commonService;
  @Autowired private MemberService memberService;
  @Autowired private ApplicationService applicationService;

  @Pointcut(
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/aspect/StreamParkAspect.java`
#### Snippet
```java
public class StreamParkAspect {

  @Autowired private FlinkRESTAPIWatcher flinkRESTAPIWatcher;
  @Autowired private CommonService commonService;
  @Autowired private MemberService memberService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkRESTAPIWatcher.java`
#### Snippet
```java
  @Autowired private CheckpointProcessor checkpointProcessor;

  @Autowired private FlinkClusterService flinkClusterService;

  @Autowired private SavePointService savePointService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkRESTAPIWatcher.java`
#### Snippet
```java
  @Autowired private AlertService alertService;

  @Autowired private CheckpointProcessor checkpointProcessor;

  @Autowired private FlinkClusterService flinkClusterService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkRESTAPIWatcher.java`
#### Snippet
```java
public class FlinkRESTAPIWatcher {

  @Autowired private ApplicationService applicationService;

  @Autowired private AlertService alertService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkRESTAPIWatcher.java`
#### Snippet
```java
  @Autowired private FlinkClusterService flinkClusterService;

  @Autowired private SavePointService savePointService;

  // track interval  every 5 seconds
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/task/FlinkRESTAPIWatcher.java`
#### Snippet
```java
  @Autowired private ApplicationService applicationService;

  @Autowired private AlertService alertService;

  @Autowired private CheckpointProcessor checkpointProcessor;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/FlinkEnvServiceImpl.java`
#### Snippet
```java
    implements FlinkEnvService {

  @Autowired private FlinkClusterService flinkClusterService;
  @Autowired private ApplicationService applicationService;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/FlinkEnvServiceImpl.java`
#### Snippet
```java

  @Autowired private FlinkClusterService flinkClusterService;
  @Autowired private ApplicationService applicationService;

  /**
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/FlinkSqlServiceImpl.java`
#### Snippet
```java
  @Autowired private ApplicationBackUpService backUpService;

  @Autowired private FlinkEnvService flinkEnvService;

  private static final String FLINKSQL_VALIDATOR_CLASS =
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/FlinkSqlServiceImpl.java`
#### Snippet
```java
    implements FlinkSqlService {

  @Autowired private EffectiveService effectiveService;

  @Autowired private ApplicationBackUpService backUpService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ResourceServiceImpl.java`
#### Snippet
```java
  @Autowired private ApplicationService applicationService;
  @Autowired private CommonService commonService;
  @Autowired private FlinkSqlService flinkSqlService;

  @Override
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ResourceServiceImpl.java`
#### Snippet
```java
    implements ResourceService {

  @Autowired private ApplicationService applicationService;
  @Autowired private CommonService commonService;
  @Autowired private FlinkSqlService flinkSqlService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ResourceServiceImpl.java`
#### Snippet
```java

  @Autowired private ApplicationService applicationService;
  @Autowired private CommonService commonService;
  @Autowired private FlinkSqlService flinkSqlService;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/FlinkSqlServiceImpl.java`
#### Snippet
```java
  @Autowired private EffectiveService effectiveService;

  @Autowired private ApplicationBackUpService backUpService;

  @Autowired private FlinkEnvService flinkEnvService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/YarnQueueServiceImpl.java`
#### Snippet
```java
  public static final String QUEUE_AVAILABLE_HINT = "The queue label is available.";

  @Autowired private ApplicationService applicationService;
  @Autowired private FlinkClusterService flinkClusterService;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/YarnQueueServiceImpl.java`
#### Snippet
```java

  @Autowired private ApplicationService applicationService;
  @Autowired private FlinkClusterService flinkClusterService;

  @Override
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/CommonServiceImpl.java`
#### Snippet
```java
  private String sqlClientJar = null;

  @Autowired private UserService userService;

  @Override
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/runner/EnvInitializer.java`
#### Snippet
```java
public class EnvInitializer implements ApplicationRunner {

  @Autowired private ApplicationContext context;

  @Autowired private SettingService settingService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/runner/EnvInitializer.java`
#### Snippet
```java
  @Autowired private ApplicationContext context;

  @Autowired private SettingService settingService;

  private final Set<StorageType> initialized = new HashSet<>(2);
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationConfigServiceImpl.java`
#### Snippet
```java
  @Autowired private ResourceLoader resourceLoader;

  @Autowired private EffectiveService effectiveService;

  @Override
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationConfigServiceImpl.java`
#### Snippet
```java
  private String flinkConfTemplate = null;

  @Autowired private ResourceLoader resourceLoader;

  @Autowired private EffectiveService effectiveService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/FlinkClusterServiceImpl.java`
#### Snippet
```java
  @Autowired private FlinkEnvService flinkEnvService;

  @Autowired private CommonService commonService;

  @Autowired private ApplicationService applicationService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/FlinkClusterServiceImpl.java`
#### Snippet
```java
  @Autowired private ApplicationService applicationService;

  @Autowired private YarnQueueService yarnQueueService;

  @Override
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/FlinkClusterServiceImpl.java`
#### Snippet
```java
  @Autowired private CommonService commonService;

  @Autowired private ApplicationService applicationService;

  @Autowired private YarnQueueService yarnQueueService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/FlinkClusterServiceImpl.java`
#### Snippet
```java
          new ThreadPoolExecutor.AbortPolicy());

  @Autowired private FlinkEnvService flinkEnvService;

  @Autowired private CommonService commonService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/VariableServiceImpl.java`
#### Snippet
```java
  @Autowired private FlinkSqlService flinkSqlService;

  @Autowired private CommonService commonService;

  @Override
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/VariableServiceImpl.java`
#### Snippet
```java
  @Autowired private ApplicationService applicationService;

  @Autowired private FlinkSqlService flinkSqlService;

  @Autowired private CommonService commonService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/VariableServiceImpl.java`
#### Snippet
```java
  private static final String PLACEHOLDER_END = "}";

  @Autowired private ApplicationService applicationService;

  @Autowired private FlinkSqlService flinkSqlService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationBackUpServiceImpl.java`
#### Snippet
```java
    implements ApplicationBackUpService {

  @Autowired private ApplicationService applicationService;

  @Autowired private ApplicationConfigService configService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationBackUpServiceImpl.java`
#### Snippet
```java
  @Autowired private EffectiveService effectiveService;

  @Autowired private FlinkSqlService flinkSqlService;

  @Override
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationBackUpServiceImpl.java`
#### Snippet
```java
  @Autowired private ApplicationService applicationService;

  @Autowired private ApplicationConfigService configService;

  @Autowired private EffectiveService effectiveService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationBackUpServiceImpl.java`
#### Snippet
```java
  @Autowired private ApplicationConfigService configService;

  @Autowired private EffectiveService effectiveService;

  @Autowired private FlinkSqlService flinkSqlService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/alert/impl/AlertConfigServiceImpl.java`
#### Snippet
```java
    implements AlertConfigService {

  @Autowired private ApplicationService applicationService;

  @Override
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ExternalLinkServiceImpl.java`
#### Snippet
```java
    implements ExternalLinkService {

  @Autowired private ApplicationService applicationService;

  @Override
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/alert/impl/HttpCallbackAlertNotifyServiceImpl.java`
#### Snippet
```java
@Lazy
public class HttpCallbackAlertNotifyServiceImpl implements AlertNotifyService {
  @Autowired private RestTemplate alertRestTemplate;

  @Autowired private ObjectMapper mapper;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/alert/impl/HttpCallbackAlertNotifyServiceImpl.java`
#### Snippet
```java
  @Autowired private RestTemplate alertRestTemplate;

  @Autowired private ObjectMapper mapper;

  @Override
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/SavePointServiceImpl.java`
#### Snippet
```java
  @Autowired private ApplicationLogService applicationLogService;

  @Autowired private FlinkRESTAPIWatcher flinkRESTAPIWatcher;

  private final ExecutorService executorService =
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/SavePointServiceImpl.java`
#### Snippet
```java
  @Autowired private ApplicationConfigService configService;

  @Autowired private FlinkClusterService flinkClusterService;

  @Autowired private ApplicationLogService applicationLogService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/SavePointServiceImpl.java`
#### Snippet
```java
  @Autowired private ApplicationService applicationService;

  @Autowired private ApplicationConfigService configService;

  @Autowired private FlinkClusterService flinkClusterService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/SavePointServiceImpl.java`
#### Snippet
```java
  @Autowired private FlinkEnvService flinkEnvService;

  @Autowired private ApplicationService applicationService;

  @Autowired private ApplicationConfigService configService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/SavePointServiceImpl.java`
#### Snippet
```java
  @Autowired private FlinkClusterService flinkClusterService;

  @Autowired private ApplicationLogService applicationLogService;

  @Autowired private FlinkRESTAPIWatcher flinkRESTAPIWatcher;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/SavePointServiceImpl.java`
#### Snippet
```java
    implements SavePointService {

  @Autowired private FlinkEnvService flinkEnvService;

  @Autowired private ApplicationService applicationService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/alert/impl/AlertServiceImpl.java`
#### Snippet
```java
@Service
public class AlertServiceImpl implements AlertService {
  @Autowired private AlertConfigService alertConfigService;

  @Override
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/alert/impl/EmailAlertNotifyServiceImpl.java`
#### Snippet
```java
  private Template template;

  @Autowired private SettingService settingService;

  @PostConstruct
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/AppBuildPipeServiceImpl.java`
#### Snippet
```java
  @Autowired private ApplicationService applicationService;

  @Autowired private ApplicationLogService applicationLogService;

  @Autowired private FlinkRESTAPIWatcher flinkRESTAPIWatcher;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/AppBuildPipeServiceImpl.java`
#### Snippet
```java
    implements AppBuildPipeService {

  @Autowired private FlinkEnvService flinkEnvService;

  @Autowired private FlinkSqlService flinkSqlService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/AppBuildPipeServiceImpl.java`
#### Snippet
```java
  @Autowired private ApplicationLogService applicationLogService;

  @Autowired private FlinkRESTAPIWatcher flinkRESTAPIWatcher;

  @Autowired private ApplicationConfigService applicationConfigService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/AppBuildPipeServiceImpl.java`
#### Snippet
```java
  @Autowired private FlinkRESTAPIWatcher flinkRESTAPIWatcher;

  @Autowired private ApplicationConfigService applicationConfigService;

  @Autowired private ResourceService resourceService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/AppBuildPipeServiceImpl.java`
#### Snippet
```java
  @Autowired private SettingService settingService;

  @Autowired private MessageService messageService;

  @Autowired private ApplicationService applicationService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/AppBuildPipeServiceImpl.java`
#### Snippet
```java
  @Autowired private ApplicationConfigService applicationConfigService;

  @Autowired private ResourceService resourceService;

  private final ExecutorService executorService =
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/AppBuildPipeServiceImpl.java`
#### Snippet
```java
  @Autowired private MessageService messageService;

  @Autowired private ApplicationService applicationService;

  @Autowired private ApplicationLogService applicationLogService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/AppBuildPipeServiceImpl.java`
#### Snippet
```java
  @Autowired private CommonService commonService;

  @Autowired private SettingService settingService;

  @Autowired private MessageService messageService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/AppBuildPipeServiceImpl.java`
#### Snippet
```java
  @Autowired private ApplicationBackUpService backUpService;

  @Autowired private CommonService commonService;

  @Autowired private SettingService settingService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/AppBuildPipeServiceImpl.java`
#### Snippet
```java
  @Autowired private FlinkEnvService flinkEnvService;

  @Autowired private FlinkSqlService flinkSqlService;

  @Autowired private ApplicationBackUpService backUpService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/AppBuildPipeServiceImpl.java`
#### Snippet
```java
  @Autowired private FlinkSqlService flinkSqlService;

  @Autowired private ApplicationBackUpService backUpService;

  @Autowired private CommonService commonService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/ResourceController.java`
#### Snippet
```java
public class ResourceController {

  @Autowired private ResourceService resourceService;

  @Operation(summary = "add resource")
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/VariableController.java`
#### Snippet
```java
public class VariableController {

  @Autowired private VariableService variableService;

  /**
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ProjectServiceImpl.java`
#### Snippet
```java
  @Autowired private ApplicationService applicationService;

  @Autowired private FlinkRESTAPIWatcher flinkRESTAPIWatcher;

  private final ExecutorService executorService =
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ProjectServiceImpl.java`
#### Snippet
```java
    implements ProjectService {

  @Autowired private ApplicationService applicationService;

  @Autowired private FlinkRESTAPIWatcher flinkRESTAPIWatcher;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/ProjectController.java`
#### Snippet
```java
public class ProjectController {

  @Autowired private ProjectService projectService;

  @Operation(summary = "Create project")
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/MessageController.java`
#### Snippet
```java
public class MessageController {

  @Autowired private MessageService messageService;

  @Operation(summary = "List notices")
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/ExternalLinkController.java`
#### Snippet
```java
public class ExternalLinkController {

  @Autowired private ExternalLinkService externalLinkService;

  @Operation(summary = "List external link")
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/FlinkClusterController.java`
#### Snippet
```java
public class FlinkClusterController {

  @Autowired private FlinkClusterService flinkClusterService;

  @Operation(summary = "List flink clusters")
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/SettingController.java`
#### Snippet
```java
public class SettingController {

  @Autowired private SettingService settingService;

  @Operation(summary = "List settings")
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/FlinkEnvController.java`
#### Snippet
```java
public class FlinkEnvController {

  @Autowired private FlinkEnvService flinkEnvService;

  @Operation(summary = "Get flink environment")
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/SavePointController.java`
#### Snippet
```java
  @Autowired private ApplicationService applicationService;

  @Autowired private SavePointService savePointService;

  @Operation(summary = "Get application savepoint latest")
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/SavePointController.java`
#### Snippet
```java
public class SavePointController {

  @Autowired private ApplicationService applicationService;

  @Autowired private SavePointService savePointService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/YarnQueueController.java`
#### Snippet
```java
public class YarnQueueController {

  @Autowired private YarnQueueService yarnQueueService;

  /**
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/ApplicationHistoryController.java`
#### Snippet
```java
public class ApplicationHistoryController {

  @Autowired private ApplicationService applicationService;

  @Operation(summary = "List the upload jar history records")
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/AlertController.java`
#### Snippet
```java
  @Autowired private AlertConfigService alertConfigService;

  @Autowired private AlertService alertService;

  @Operation(summary = "Create alert config")
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/AlertController.java`
#### Snippet
```java
public class AlertController {

  @Autowired private AlertConfigService alertConfigService;

  @Autowired private AlertService alertService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/ConfigController.java`
#### Snippet
```java
public class ConfigController {

  @Autowired private ApplicationConfigService applicationConfigService;

  @Operation(summary = "Get config")
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/ApplicationBuildPipelineController.java`
#### Snippet
```java
  @Autowired private AppBuildPipeService appBuildPipeService;

  @Autowired private ApplicationService applicationService;

  @Autowired private FlinkSqlService flinkSqlService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/ApplicationBuildPipelineController.java`
#### Snippet
```java
  @Autowired private ApplicationService applicationService;

  @Autowired private FlinkSqlService flinkSqlService;

  @Autowired private ApplicationLogService applicationLogService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/ApplicationBuildPipelineController.java`
#### Snippet
```java
  @Autowired private FlinkSqlService flinkSqlService;

  @Autowired private ApplicationLogService applicationLogService;

  @Autowired private FlinkEnvService flinkEnvService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/ApplicationBuildPipelineController.java`
#### Snippet
```java
public class ApplicationBuildPipelineController {

  @Autowired private AppBuildPipeService appBuildPipeService;

  @Autowired private ApplicationService applicationService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/ApplicationBuildPipelineController.java`
#### Snippet
```java
  @Autowired private ApplicationLogService applicationLogService;

  @Autowired private FlinkEnvService flinkEnvService;

  /**
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/FlinkSqlController.java`
#### Snippet
```java
  @Autowired private FlinkSqlService flinkSqlService;

  @Autowired private VariableService variableService;

  @Autowired private SqlCompleteService sqlComplete;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/FlinkSqlController.java`
#### Snippet
```java
  @Autowired private VariableService variableService;

  @Autowired private SqlCompleteService sqlComplete;

  @Operation(summary = "Verify sql")
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/FlinkSqlController.java`
#### Snippet
```java
public class FlinkSqlController {

  @Autowired private FlinkSqlService flinkSqlService;

  @Autowired private VariableService variableService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/ApplicationController.java`
#### Snippet
```java
public class ApplicationController {

  @Autowired private ApplicationService applicationService;

  @Autowired private ApplicationBackUpService backUpService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/ApplicationController.java`
#### Snippet
```java
  @Autowired private ApplicationBackUpService backUpService;

  @Autowired private ApplicationLogService applicationLogService;

  @Autowired private AppBuildPipeService appBuildPipeService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/ApplicationController.java`
#### Snippet
```java
  @Autowired private ApplicationService applicationService;

  @Autowired private ApplicationBackUpService backUpService;

  @Autowired private ApplicationLogService applicationLogService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/controller/ApplicationController.java`
#### Snippet
```java
  @Autowired private ApplicationLogService applicationLogService;

  @Autowired private AppBuildPipeService appBuildPipeService;

  @Operation(summary = "Get application")
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/runner/StartedUpRunner.java`
#### Snippet
```java
public class StartedUpRunner implements ApplicationRunner {

  @Autowired private ConfigurableApplicationContext context;

  @Override
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/impl/MemberServiceImpl.java`
#### Snippet
```java
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

  @Autowired private UserService userService;

  @Autowired private RoleService roleService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/impl/MemberServiceImpl.java`
#### Snippet
```java
  @Autowired private RoleService roleService;

  @Autowired private TeamService teamService;

  @Override
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/impl/MemberServiceImpl.java`
#### Snippet
```java
  @Autowired private UserService userService;

  @Autowired private RoleService roleService;

  @Autowired private TeamService teamService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/impl/RoleServiceImpl.java`
#### Snippet
```java
  @Autowired private MemberService memberService;

  @Autowired private RoleMenuServie roleMenuService;

  @Override
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/impl/RoleServiceImpl.java`
#### Snippet
```java
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

  @Autowired private RoleMenuMapper roleMenuMapper;

  @Autowired private MemberService memberService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/impl/RoleServiceImpl.java`
#### Snippet
```java
  @Autowired private RoleMenuMapper roleMenuMapper;

  @Autowired private MemberService memberService;

  @Autowired private RoleMenuServie roleMenuService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/impl/AccessTokenServiceImpl.java`
#### Snippet
```java
    implements AccessTokenService {

  @Autowired private UserService userService;

  @Override
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/impl/TeamServiceImpl.java`
#### Snippet
```java
  @Autowired private UserService userService;

  @Autowired private ApplicationService applicationService;

  @Autowired private ProjectService projectService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/impl/TeamServiceImpl.java`
#### Snippet
```java
  @Autowired private ProjectService projectService;

  @Autowired private MemberService memberService;

  @Autowired private VariableService variableService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/impl/TeamServiceImpl.java`
#### Snippet
```java
  @Autowired private ApplicationService applicationService;

  @Autowired private ProjectService projectService;

  @Autowired private MemberService memberService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/impl/TeamServiceImpl.java`
#### Snippet
```java
public class TeamServiceImpl extends ServiceImpl<TeamMapper, Team> implements TeamService {

  @Autowired private UserService userService;

  @Autowired private ApplicationService applicationService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/impl/TeamServiceImpl.java`
#### Snippet
```java
  @Autowired private VariableService variableService;

  @Autowired private CommonService commonService;

  @Override
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/impl/TeamServiceImpl.java`
#### Snippet
```java
  @Autowired private MemberService memberService;

  @Autowired private VariableService variableService;

  @Autowired private CommonService commonService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/security/impl/AuthenticatorImpl.java`
#### Snippet
```java
public class AuthenticatorImpl implements Authenticator {
  @Autowired private UserService usersService;
  @Autowired private LdapService ldapService;

  @Override
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/security/impl/AuthenticatorImpl.java`
#### Snippet
```java
@Component
public class AuthenticatorImpl implements Authenticator {
  @Autowired private UserService usersService;
  @Autowired private LdapService ldapService;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/impl/MenuServiceImpl.java`
#### Snippet
```java
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {

  @Autowired private UserService userService;

  @Autowired private RoleMenuServie roleMenuServie;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/impl/MenuServiceImpl.java`
#### Snippet
```java
  @Autowired private UserService userService;

  @Autowired private RoleMenuServie roleMenuServie;

  @Override
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/controller/TeamController.java`
#### Snippet
```java
public class TeamController {

  @Autowired private TeamService teamService;

  @Operation(summary = "List teams")
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/controller/MenuController.java`
#### Snippet
```java
public class MenuController {

  @Autowired private MenuService menuService;

  @Autowired private CommonService commonService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/controller/MenuController.java`
#### Snippet
```java
  @Autowired private MenuService menuService;

  @Autowired private CommonService commonService;

  @Operation(summary = "List menu-routes")
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/controller/PassportController.java`
#### Snippet
```java
  @Autowired private UserService userService;

  @Autowired private ShiroProperties properties;

  @Autowired private Authenticator authenticator;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/controller/PassportController.java`
#### Snippet
```java
public class PassportController {

  @Autowired private UserService userService;

  @Autowired private ShiroProperties properties;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/controller/PassportController.java`
#### Snippet
```java
  @Autowired private ShiroProperties properties;

  @Autowired private Authenticator authenticator;

  @Operation(summary = "Signin")
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/impl/UserServiceImpl.java`
#### Snippet
```java
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

  @Autowired private MemberService memberService;

  @Autowired private MenuService menuService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/impl/UserServiceImpl.java`
#### Snippet
```java
  @Autowired private MenuService menuService;

  @Autowired private ApplicationService applicationService;

  @Autowired private ResourceService resourceService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/impl/UserServiceImpl.java`
#### Snippet
```java
  @Autowired private MemberService memberService;

  @Autowired private MenuService menuService;

  @Autowired private ApplicationService applicationService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/service/impl/UserServiceImpl.java`
#### Snippet
```java
  @Autowired private ApplicationService applicationService;

  @Autowired private ResourceService resourceService;

  @Override
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/controller/AccessTokenController.java`
#### Snippet
```java
public class AccessTokenController {

  @Autowired private AccessTokenService accessTokenService;

  @Autowired private CommonService commonService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/controller/AccessTokenController.java`
#### Snippet
```java
  @Autowired private AccessTokenService accessTokenService;

  @Autowired private CommonService commonService;

  /** generate token string */
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/controller/MemberController.java`
#### Snippet
```java
public class MemberController {

  @Autowired private MemberService memberService;

  @Operation(summary = "List members")
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/controller/RoleController.java`
#### Snippet
```java
public class RoleController {

  @Autowired private RoleService roleService;
  @Autowired private RoleMenuServie roleMenuServie;

```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/controller/RoleController.java`
#### Snippet
```java

  @Autowired private RoleService roleService;
  @Autowired private RoleMenuServie roleMenuServie;

  @Operation(summary = "List roles")
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/controller/UserController.java`
#### Snippet
```java
public class UserController {

  @Autowired private UserService userService;

  @Autowired private TeamService teamService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/controller/UserController.java`
#### Snippet
```java
  @Autowired private TeamService teamService;

  @Autowired private CommonService commonService;

  @Operation(summary = "List users")
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/system/controller/UserController.java`
#### Snippet
```java
  @Autowired private UserService userService;

  @Autowired private TeamService teamService;

  @Autowired private CommonService commonService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
  @Autowired private EffectiveService effectiveService;

  @Autowired private SettingService settingService;

  @Autowired private CommonService commonService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
  @Autowired private AppBuildPipeService appBuildPipeService;

  @Autowired private FlinkClusterService flinkClusterService;

  @Autowired private VariableService variableService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
  @Autowired private FlinkClusterService flinkClusterService;

  @Autowired private VariableService variableService;

  @Autowired private LogClientService logClient;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
  private static final Pattern SINGLE_SPACE_PATTERN = Pattern.compile("^\\S+(\\s\\S+)*$");

  @Autowired private ProjectService projectService;

  @Autowired private ApplicationBackUpService backUpService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
  @Autowired private SavePointService savePointService;

  @Autowired private EffectiveService effectiveService;

  @Autowired private SettingService settingService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
  @Autowired private ApplicationLogService applicationLogService;

  @Autowired private FlinkEnvService flinkEnvService;

  @Autowired private FlinkSqlService flinkSqlService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
  @Autowired private FlinkK8sWatcher k8SFlinkTrackMonitor;

  @Autowired private AppBuildPipeService appBuildPipeService;

  @Autowired private FlinkClusterService flinkClusterService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
  @Autowired private ProjectService projectService;

  @Autowired private ApplicationBackUpService backUpService;

  @Autowired private ApplicationConfigService configService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
  @Autowired private EnvInitializer envInitializer;

  @Autowired private FlinkK8sWatcher k8SFlinkTrackMonitor;

  @Autowired private AppBuildPipeService appBuildPipeService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
  @Autowired private SettingService settingService;

  @Autowired private CommonService commonService;

  @Autowired private EnvInitializer envInitializer;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
  @Autowired private FlinkEnvService flinkEnvService;

  @Autowired private FlinkSqlService flinkSqlService;

  @Autowired private SavePointService savePointService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
  @Autowired private CommonService commonService;

  @Autowired private EnvInitializer envInitializer;

  @Autowired private FlinkK8sWatcher k8SFlinkTrackMonitor;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
  @Autowired private ApplicationBackUpService backUpService;

  @Autowired private ApplicationConfigService configService;

  @Autowired private ApplicationLogService applicationLogService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
  @Autowired private VariableService variableService;

  @Autowired private LogClientService logClient;

  @Autowired private YarnQueueService yarnQueueService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
  @Autowired private FlinkSqlService flinkSqlService;

  @Autowired private SavePointService savePointService;

  @Autowired private EffectiveService effectiveService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
  @Autowired private ApplicationConfigService configService;

  @Autowired private ApplicationLogService applicationLogService;

  @Autowired private FlinkEnvService flinkEnvService;
```

### SpringJavaAutowiredFieldsWarningInspection
Field injection is not recommended
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
  @Autowired private LogClientService logClient;

  @Autowired private YarnQueueService yarnQueueService;

  @PostConstruct
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `streampark-flink/streampark-flink-connector/streampark-flink-connector-doris/src/main/java/org/apache/streampark/flink/connector/doris/internal/DorisSinkWriter.java`
#### Snippet
```java
      }
      try {
        Thread.sleep(1000L * (i + 1));
      } catch (InterruptedException ex) {
        Thread.currentThread().interrupt();
```

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+=` in loop
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
    String prefix = "";
    while (offset > 0) {
      prefix += "0";
      offset -= 1;
    }
```

## RuleId[id=NullArgumentToVariableArgMethod]
### NullArgumentToVariableArgMethod
Confusing argument `elem`, unclear if a varargs or non-varargs call is desired
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
    List<T> arrayList = new ArrayList<>(0);
    Collections.addAll(arrayList, array);
    if (isEmpty(elem)) {
      return array;
    }
```

### NullArgumentToVariableArgMethod
Confusing argument `files`, unclear if a varargs or non-varargs call is desired
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ProjectServiceImpl.java`
#### Snippet
```java
        List<String> list = new ArrayList<>();
        File[] files = appHome.listFiles();
        if (CommonUtils.notEmpty(files)) {
          for (File file : files) {
            list.add(file.getName());
```

### NullArgumentToVariableArgMethod
Confusing argument `appParam.getStateArray()`, unclear if a varargs or non-varargs call is desired
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
    }
    Page<Application> page = new MybatisPager<Application>().getDefaultPage(request);
    if (CommonUtils.notEmpty(appParam.getStateArray())) {
      if (Arrays.stream(appParam.getStateArray())
          .anyMatch(x -> x == FlinkAppState.FINISHED.getValue())) {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `b` initializer `-1` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/GZipUtils.java`
#### Snippet
```java
          try (FileOutputStream outputStream = new FileOutputStream(fullFileName);
              BufferedOutputStream bufOutput = new BufferedOutputStream(outputStream)) {
            int b = -1;
            while ((b = archiveInput.read()) != -1) {
              bufOutput.write(b);
```

### UnusedAssignment
Variable `map` initializer `null` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
    List<Map<String, Object>> list = new ArrayList<>();
    if (objList != null && objList.size() > 0) {
      Map<String, Object> map = null;
      T bean = null;
      for (T t : objList) {
```

### UnusedAssignment
Variable `bean` initializer `null` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java
    if (objList != null && objList.size() > 0) {
      Map<String, Object> map = null;
      T bean = null;
      for (T t : objList) {
        bean = t;
```

### UnusedAssignment
Variable `resourceName` initializer `null` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ResourceServiceImpl.java`
#### Snippet
```java

      Long teamId = resource.getTeamId();
      String resourceName = null;

      if (poms.isEmpty()) {
```

### UnusedAssignment
The value `loc` assigned to `breakLoc.loc` is never used
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/SqlCompleteServiceImpl.java`
#### Snippet
```java
        if (!nowStep.containsKey(nowChar)) {
          // maybe wrong typing
          breakLoc.loc = loc;
          break;
        }
```

### UnusedAssignment
Variable `checkSum` initializer `0` is redundant
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/core/service/impl/ApplicationServiceImpl.java`
#### Snippet
```java
        File jarFile = new File(WebUtils.getAppTempDir(), appParam.getJar());
        if (jarFile.exists()) {
          long checkSum = 0;
          try {
            checkSum = FileUtils.checksumCRC32(jarFile);
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `((Iterable``) obj).iterator() == null` is always `false`
in `streampark-console/streampark-console-service/src/main/java/org/apache/streampark/console/base/util/CommonUtils.java`
#### Snippet
```java

      if (obj instanceof Iterable) {
        if (((Iterable<?>) obj).iterator() == null || !((Iterable<?>) obj).iterator().hasNext()) {
          return true;
        }
```

