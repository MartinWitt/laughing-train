# azure-spark-java-sdk 
 
# Bad smells
I found 84 bad smells with 4 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| NullableProblems | 30 | false |
| FieldMayBeFinal | 26 | false |
| CommentedOutCode | 4 | false |
| UnnecessaryModifier | 3 | true |
| ArraysAsListWithZeroOrOneArgument | 3 | false |
| DoubleCheckedLocking | 2 | false |
| RegExpSimplifiable | 2 | false |
| JavadocLinkAsPlainText | 2 | false |
| UnstableApiUsage | 2 | false |
| KotlinMavenPluginPhase | 1 | false |
| RedundantMethodOverride | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| IOStreamConstructor | 1 | false |
| DifferentKotlinMavenVersion | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| DanglingJavadoc | 1 | false |
| ConstantValue | 1 | false |
| EqualsBetweenInconvertibleTypes | 1 | false |
| FieldCanBeLocal | 1 | false |
## RuleId[id=KotlinMavenPluginPhase]
### KotlinMavenPluginPhase
Kotlin plugin has no compile executions
in `pom.xml`
#### Snippet
```java
            </plugin>
            <plugin>
                <artifactId>kotlin-maven-plugin</artifactId>
                <groupId>org.jetbrains.kotlin</groupId>
                <version>${kotlin.version}</version>
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/microsoft/azure/spark/tools/ux/IdeSchedulers.java`
#### Snippet
```java

public interface IdeSchedulers {
    public Scheduler processBarVisibleAsync(String title);

    public Scheduler processBarVisibleSync(String title);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/microsoft/azure/spark/tools/ux/IdeSchedulers.java`
#### Snippet
```java
    public Scheduler processBarVisibleSync(String title);

    public Scheduler dispatchUIThread();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/microsoft/azure/spark/tools/ux/IdeSchedulers.java`
#### Snippet
```java
    public Scheduler processBarVisibleAsync(String title);

    public Scheduler processBarVisibleSync(String title);

    public Scheduler dispatchUIThread();
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `awaitPostDone()` is identical to its super method
in `src/main/java/com/microsoft/azure/spark/tools/job/HdiSparkBatch.java`
#### Snippet
```java

    @Override
    public Observable<String> awaitPostDone() {
        return Observable.empty();
    }
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'List.contains()'
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
        };

        return Arrays.stream(parameterList).anyMatch(key::equals);
    }
}
```

## RuleId[id=DoubleCheckedLocking]
### DoubleCheckedLocking
Double-checked locking
in `src/main/java/com/microsoft/azure/spark/tools/utils/Lazy.java`
#### Snippet
```java

    public T getOrEvaluate(final Supplier<T> evaluate) {
        if (this.value == null) {
            synchronized (this) {
                if (this.value == null) {
```

### DoubleCheckedLocking
Double-checked locking
in `src/main/java/com/microsoft/azure/spark/tools/utils/Lazy.java`
#### Snippet
```java
    @Override
    public T get() {
        if (this.value == null) {
            synchronized (this) {
                if (this.value == null) {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `ambariDefaultHeaderGroup` may be 'final'
in `src/main/java/com/microsoft/azure/spark/tools/http/AmbariHttpObservable.java`
#### Snippet
```java

public class AmbariHttpObservable extends HttpObservable {
    private Lazy<HeaderGroup> ambariDefaultHeaderGroup = new Lazy<>();

    public AmbariHttpObservable() {
```

### FieldMayBeFinal
Field `comments` may be 'final'
in `src/main/java/com/microsoft/azure/spark/tools/http/UserAgentEntity.java`
#### Snippet
```java
        private final String product;
        private String version = "";
        private List<String> comments = new ArrayList<>();

        public Builder(final String product) {
```

### FieldMayBeFinal
Field `message` may be 'final'
in `src/main/java/com/microsoft/azure/spark/tools/http/HttpResponse.java`
#### Snippet
```java
    private final CloseableHttpResponse raw;

    private Lazy<String> message = new Lazy<>();

    public HttpResponse(final CloseableHttpResponse response) {
```

### FieldMayBeFinal
Field `jsonFactory` may be 'final'
in `src/main/java/com/microsoft/azure/spark/tools/utils/JsonConverter.java`
#### Snippet
```java
    }

    private JsonFactory jsonFactory = new JsonFactory();
    private ObjectMapper objectMapper = new ObjectMapper(jsonFactory);

```

### FieldMayBeFinal
Field `objectMapper` may be 'final'
in `src/main/java/com/microsoft/azure/spark/tools/utils/JsonConverter.java`
#### Snippet
```java

    private JsonFactory jsonFactory = new JsonFactory();
    private ObjectMapper objectMapper = new ObjectMapper(jsonFactory);

    public @Nullable T parseFrom(final String jsonString) {
```

### FieldMayBeFinal
Field `job` may be 'final'
in `src/main/java/com/microsoft/azure/spark/tools/events/SparkBatchJobSubmittedEvent.java`
#### Snippet
```java

public class SparkBatchJobSubmittedEvent implements SparkBatchJobSubmissionEvent {
    private SparkBatchJob job;

    public SparkBatchJobSubmittedEvent(SparkBatchJob job) {
```

### FieldMayBeFinal
Field `sparkLogFetcher` may be 'final'
in `src/main/java/com/microsoft/azure/spark/tools/processes/SparkJobLogInputStream.java`
#### Snippet
```java
public class SparkJobLogInputStream extends InputStream {
    private String logType;
    private LaterInit<SparkLogFetcher> sparkLogFetcher = new LaterInit<>();

    private boolean isClosed = false;
```

### FieldMayBeFinal
Field `logType` may be 'final'
in `src/main/java/com/microsoft/azure/spark/tools/processes/SparkJobLogInputStream.java`
#### Snippet
```java

public class SparkJobLogInputStream extends InputStream {
    private String logType;
    private LaterInit<SparkLogFetcher> sparkLogFetcher = new LaterInit<>();

```

### FieldMayBeFinal
Field `jobStderrLogInputSteam` may be 'final'
in `src/main/java/com/microsoft/azure/spark/tools/processes/SparkBatchJobRemoteProcess.java`
#### Snippet
```java
    private final Observer<Pair<MessageInfoType, String>> ctrlSubject;
    private SparkJobLogInputStream jobStdoutLogInputSteam;
    private SparkJobLogInputStream jobStderrLogInputSteam;
    private LaterInit<Subscription> jobSubscription = new LaterInit<>();
    private final SparkBatchJob sparkJob;
```

### FieldMayBeFinal
Field `jobSubscription` may be 'final'
in `src/main/java/com/microsoft/azure/spark/tools/processes/SparkBatchJobRemoteProcess.java`
#### Snippet
```java
    private SparkJobLogInputStream jobStdoutLogInputSteam;
    private SparkJobLogInputStream jobStderrLogInputSteam;
    private LaterInit<Subscription> jobSubscription = new LaterInit<>();
    private final SparkBatchJob sparkJob;
    private final PublishSubject<SparkBatchJobSubmissionEvent> eventSubject = PublishSubject.create();
```

### FieldMayBeFinal
Field `artifactPath` may be 'final'
in `src/main/java/com/microsoft/azure/spark/tools/processes/SparkBatchJobRemoteProcess.java`
#### Snippet
```java

    private IdeSchedulers schedulers;
    private @Nullable File artifactPath;
    private final String title;
    private final Observer<Pair<MessageInfoType, String>> ctrlSubject;
```

### FieldMayBeFinal
Field `schedulers` may be 'final'
in `src/main/java/com/microsoft/azure/spark/tools/processes/SparkBatchJobRemoteProcess.java`
#### Snippet
```java
    public static final int EXIT_ERROR_CANNOT_BE_KILLED = (3 << 8) | 1;

    private IdeSchedulers schedulers;
    private @Nullable File artifactPath;
    private final String title;
```

### FieldMayBeFinal
Field `jobStdoutLogInputSteam` may be 'final'
in `src/main/java/com/microsoft/azure/spark/tools/processes/SparkBatchJobRemoteProcess.java`
#### Snippet
```java
    private final String title;
    private final Observer<Pair<MessageInfoType, String>> ctrlSubject;
    private SparkJobLogInputStream jobStdoutLogInputSteam;
    private SparkJobLogInputStream jobStderrLogInputSteam;
    private LaterInit<Subscription> jobSubscription = new LaterInit<>();
```

### FieldMayBeFinal
Field `className` may be 'final'
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
    private @Nullable String proxyUser;
    private String file;
    private String className;

    private final List<String> files = new ArrayList<>();
```

### FieldMayBeFinal
Field `referencedJars` may be 'final'
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
        private List<String> referenceFiles = new ArrayList<>();

        private List<String> referencedJars = new ArrayList<>();

        private List<String> args = new ArrayList<>();
```

### FieldMayBeFinal
Field `jobConfig` may be 'final'
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
        private List<String> yarnArchives = new ArrayList<>();

        private Map<String, String> jobConfig = new HashMap<>();

        private @Nullable String yarnQueue = null;
```

### FieldMayBeFinal
Field `args` may be 'final'
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
        private List<String> referencedJars = new ArrayList<>();

        private List<String> args = new ArrayList<>();

        private List<String> pyFiles = new ArrayList<>();
```

### FieldMayBeFinal
Field `referenceFiles` may be 'final'
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
        private @Nullable String className = null;

        private List<String> referenceFiles = new ArrayList<>();

        private List<String> referencedJars = new ArrayList<>();
```

### FieldMayBeFinal
Field `pyFiles` may be 'final'
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
        private List<String> args = new ArrayList<>();

        private List<String> pyFiles = new ArrayList<>();

        private List<String> yarnArchives = new ArrayList<>();
```

### FieldMayBeFinal
Field `yarnArchives` may be 'final'
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
        private List<String> pyFiles = new ArrayList<>();

        private List<String> yarnArchives = new ArrayList<>();

        private Map<String, String> jobConfig = new HashMap<>();
```

### FieldMayBeFinal
Field `file` may be 'final'
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
    private @Nullable String name;
    private @Nullable String proxyUser;
    private String file;
    private String className;

```

### FieldMayBeFinal
Field `defaultHeaders` may be 'final'
in `src/main/java/com/microsoft/azure/spark/tools/http/HttpObservable.java`
#### Snippet
```java
    private final List<String> userAgents = new ArrayList<>();

    private Lazy<HeaderGroup> defaultHeaders = new Lazy<>();

    private CookieStore cookieStore;
```

### FieldMayBeFinal
Field `httpContext` may be 'final'
in `src/main/java/com/microsoft/azure/spark/tools/http/HttpObservable.java`
#### Snippet
```java
    private CookieStore cookieStore;

    private HttpContext httpContext;

    /**
```

### FieldMayBeFinal
Field `destinationRootPath` may be 'final'
in `src/main/java/com/microsoft/azure/spark/tools/job/LivySparkBatch.java`
#### Snippet
```java
    private final LivyCluster cluster;

    private @Nullable String destinationRootPath;
    private String state = "__new_instance";

```

### FieldMayBeFinal
Field `appId` may be 'final'
in `src/main/java/com/microsoft/azure/spark/tools/job/LivySparkBatch.java`
#### Snippet
```java
     */
    private LaterInit<Integer> batchId = new LaterInit<>();
    private LaterInit<String> appId = new LaterInit<>();

    /**
```

### FieldMayBeFinal
Field `batchId` may be 'final'
in `src/main/java/com/microsoft/azure/spark/tools/job/LivySparkBatch.java`
#### Snippet
```java
     * The LIVY Spark batch job ID got from job submission.
     */
    private LaterInit<Integer> batchId = new LaterInit<>();
    private LaterInit<String> appId = new LaterInit<>();

```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/com/microsoft/azure/spark/tools/clusters/ClusterDetail.java`
#### Snippet
```java
    }

    // default ClusterType getType() {
    //     return null;
    // }
```

### CommentedOutCode
Commented out code (7 lines)
in `src/main/java/com/microsoft/azure/spark/tools/clusters/ClusterDetail.java`
#### Snippet
```java
    }

    // @Nullable
    // default IHDIStorageAccount getStorageAccount() throws HDIException {
    //     return null;
```

### CommentedOutCode
Commented out code (7 lines)
in `src/main/java/com/microsoft/azure/spark/tools/clusters/ClusterDetail.java`
#### Snippet
```java
    }

    // default SparkSubmitStorageType getDefaultStorageType(){
    //     return SparkSubmitStorageType.DEFAULT_STORAGE_ACCOUNT;
    // }
```

### CommentedOutCode
Commented out code (6 lines)
in `src/main/java/com/microsoft/azure/spark/tools/http/HttpObservable.java`
#### Snippet
```java
    public HttpObservable(final @Nullable String username, final @Nullable String password) {

//        String loadingClass = this.getClass().getClassLoader().getClass().getName().toLowerCase();
//        this.userAgentPrefix = loadingClass.contains("intellij")
//                ? "Azure Toolkit for IntelliJ"
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[s]` can be simplified to 's'
in `src/main/java/com/microsoft/azure/spark/tools/utils/WasbUri.java`
#### Snippet
```java
            Pattern.CASE_INSENSITIVE);
    public static final Pattern HTTP_URI_PATTERN = Pattern.compile(
            "^http[s]?://(?<storageAccount>[^/.]+)\\.blob\\.(?<endpointSuffix>[^/]+)/(?<container>[^/.]+)"
                    + "(:(?<port>[0-9]+))?(/(?<path>.*))?$",
            Pattern.CASE_INSENSITIVE);
```

### RegExpSimplifiable
`[s]` can be simplified to 's'
in `src/main/java/com/microsoft/azure/spark/tools/utils/WasbUri.java`
#### Snippet
```java
public final class WasbUri {
    public static final Pattern WASB_URI_PATTERN = Pattern.compile(
            "^wasb[s]?://(?<container>[^/.]+)@(?<storageAccount>[^/.]+)\\.blob\\.(?<endpointSuffix>[^/]+)"
                    + "(:(?<port>[0-9]+))?(/(?<path>.*))?$",
            Pattern.CASE_INSENSITIVE);
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/com/microsoft/azure/spark/tools/job/AzureBlobStorageDeploy.java`
#### Snippet
```java

    protected InputStream createFileInputStream(final File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

```

## RuleId[id=DifferentKotlinMavenVersion]
### DifferentKotlinMavenVersion
Kotlin version that is used for building with Maven (1.3.21) is not properly supported in the IDE plugin (1.9)
in `pom.xml`
#### Snippet
```java
                <artifactId>kotlin-maven-plugin</artifactId>
                <groupId>org.jetbrains.kotlin</groupId>
                <version>${kotlin.version}</version>
                <executions>
<!--                    Kotlin is only enabled for testing-->
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/com/microsoft/azure/spark/tools/utils/LaterInit.java`
#### Snippet
```java
    public T get() {
        if (!isInitialized()) {
            throw new NotInitializedException(this.toString() + " delegation has not been initialized.");
        }

```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/com/microsoft/azure/spark/tools/job/SparkBatchJob.java`
#### Snippet
```java
    Observable<? extends SparkBatchJob> killBatchJob();

    /**
     * Get Spark batch job driver host by ID.
     *
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/com/microsoft/azure/spark/tools/http/OAuthTokenHttpObservable.java`
#### Snippet
```java
            return oAuthDefaultHeaders.getOrEvaluate(() -> {
                try {
                    return Arrays.asList(new OAuthTokenHeader(getAccessToken()));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/com/microsoft/azure/spark/tools/http/AzureHttpObservable.java`
#### Snippet
```java

        if (StringUtils.isNotBlank(apiVersion)) {
            this.azureDefaultParameters = Arrays.asList(new ApiVersionParam(apiVersion));
        } else {
            this.azureDefaultParameters = Collections.emptyList();
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/com/microsoft/azure/spark/tools/job/ArcadiaSparkBatch.java`
#### Snippet
```java
    @Override
    protected List<Header> getHeadersToAddOrReplace() {
        return Arrays.asList(new BasicHeader("x-ms-workspace-name", this.arcadiaCompute.getWorkspace()));
    }

```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `src/main/java/com/microsoft/azure/spark/tools/utils/Lazy.java`
#### Snippet
```java
public class Lazy<T> implements Supplier<T> {

    private final @Nullable Supplier<T> supplier;

    private @Nullable T value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `src/main/java/com/microsoft/azure/spark/tools/utils/Lazy.java`
#### Snippet
```java
    private final @Nullable Supplier<T> supplier;

    private @Nullable T value;

    public Lazy() {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `src/main/java/com/microsoft/azure/spark/tools/http/UserAgentEntity.java`
#### Snippet
```java
public class UserAgentEntity {
    private final String product;
    private final @Nullable String version;
    private final @Nullable String comment;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `src/main/java/com/microsoft/azure/spark/tools/http/UserAgentEntity.java`
#### Snippet
```java
    private final String product;
    private final @Nullable String version;
    private final @Nullable String comment;

    /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `src/main/java/com/microsoft/azure/spark/tools/http/status/HttpErrorStatus.java`
#### Snippet
```java


    private final @Nullable HttpEntity entity;

    public HttpErrorStatus(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `src/main/java/com/microsoft/azure/spark/tools/processes/SparkBatchJobRemoteProcess.java`
#### Snippet
```java
    private final PublishSubject<SparkBatchJobSubmissionEvent> eventSubject = PublishSubject.create();
    private boolean isDestroyed = false;
    private @Nullable Integer exitValue = null;

    private boolean isDisconnected;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `src/main/java/com/microsoft/azure/spark/tools/processes/SparkBatchJobRemoteProcess.java`
#### Snippet
```java

    private IdeSchedulers schedulers;
    private @Nullable File artifactPath;
    private final String title;
    private final Observer<Pair<MessageInfoType, String>> ctrlSubject;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `src/main/java/com/microsoft/azure/spark/tools/processes/SparkBatchJobRemoteProcess.java`
#### Snippet
```java

    public static class Builder {
        private @Nullable File artifact = null;
        private final SparkBatchJobFactory batchJobFactory;
        private final LaterInit<Observer<Pair<MessageInfoType, String>>> ctrlSubject = new LaterInit<>();
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
    private @Nullable Integer driverCores;

    private @Nullable MemorySize executorMemory;

    private @Nullable Integer executorCores;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
        private Map<String, String> jobConfig = new HashMap<>();

        private @Nullable String yarnQueue = null;

        private @Nullable MemorySize driverMemory = null;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java

    public static class Options {
        private @Nullable String name = null;

        private @Nullable String proxyUser = null;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
        private @Nullable Integer driverCores = null;

        private @Nullable MemorySize executorMemory = null;

        private @Nullable Integer executorCores = null;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
        private @Nullable String yarnQueue = null;

        private @Nullable MemorySize driverMemory = null;

        private @Nullable Integer driverCores = null;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
        private @Nullable String name = null;

        private @Nullable String proxyUser = null;

        private @Nullable String artifactUri = null;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java

    @JsonProperty("numExecutors")
    private @Nullable Integer yarnNumExecutors;

    private static final String DRIVER_MEMORY = "driverMemory";
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
        private @Nullable MemorySize driverMemory = null;

        private @Nullable Integer driverCores = null;

        private @Nullable MemorySize executorMemory = null;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
    private @Nullable MemorySize executorMemory;

    private @Nullable Integer executorCores;

    @JsonProperty("numExecutors")
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
        private @Nullable MemorySize executorMemory = null;

        private @Nullable Integer executorCores = null;

        private @Nullable Integer yarnNumExecutors = null;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
        private @Nullable String artifactUri = null;

        private @Nullable String className = null;

        private List<String> referenceFiles = new ArrayList<>();
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
        private @Nullable String proxyUser = null;

        private @Nullable String artifactUri = null;

        private @Nullable String className = null;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
    }

    private @Nullable String name;
    private @Nullable String proxyUser;
    private String file;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
        private @Nullable Integer executorCores = null;

        private @Nullable Integer yarnNumExecutors = null;

        /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
    private @Nullable String yarnQueue;

    private @Nullable MemorySize driverMemory;

    private @Nullable Integer driverCores;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
    private @Nullable MemorySize driverMemory;

    private @Nullable Integer driverCores;

    private @Nullable MemorySize executorMemory;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java

    private @Nullable String name;
    private @Nullable String proxyUser;
    private String file;
    private String className;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java

    @JsonProperty("queue")
    private @Nullable String yarnQueue;

    private @Nullable MemorySize driverMemory;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `src/main/java/com/microsoft/azure/spark/tools/job/YarnContainerLogFetcher.java`
#### Snippet
```java
    private final URI yarnNMConnectUri;
    
    private @Nullable String currentLogUrl;
    private final String applicationId;
    private final YarnCluster cluster;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `src/main/java/com/microsoft/azure/spark/tools/job/YarnContainerLogFetcher.java`
#### Snippet
```java
 */
public class YarnContainerLogFetcher implements SparkLogFetcher, Logger {
    private @Nullable App lastAppRawResponse = null;
    private final Map<String, Long> unfetchedOffsetByType = new HashMap<>();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `src/main/java/com/microsoft/azure/spark/tools/http/HttpObservable.java`
#### Snippet
```java
     * The SSL trust strategy for HTTPS connection, which can refer to platform implementations.
     */
    private @Nullable TrustStrategy trustStrategy = null;

    /*
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `src/main/java/com/microsoft/azure/spark/tools/job/LivySparkBatch.java`
#### Snippet
```java
    private final LivyCluster cluster;

    private @Nullable String destinationRootPath;
    private String state = "__new_instance";

```

## RuleId[id=ConstantValue]
### ConstantValue
Result of `value.equals(obj)` is always 'false'
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
            }

            return value.equals(obj);
        }
    }
```

## RuleId[id=EqualsBetweenInconvertibleTypes]
### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'String' and 'MemorySize'
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
            }

            return value.equals(obj);
        }
    }
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/azure/spark/tools/restapi/yarn/rm/apps/appid/App.java`
#### Snippet
```java
 *
 * Based on Hadoop 3.0.0, refer to
 * https://hadoop.apache.org/docs/current/hadoop-yarn/hadoop-yarn-site/ResourceManagerRest.html#Cluster_Application_API
 *
 * Use the following URI to obtain an app object, from a application identified by the appid value.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/microsoft/azure/spark/tools/restapi/yarn/rm/apps/appid/App.java`
#### Snippet
```java
 *
 * Use the following URI to obtain an app object, from a application identified by the appid value.
 *   http://$rmHttpAddress:port/ws/v1/cluster/apps/$appid
 *
 * HTTP Operations Supported
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/com/microsoft/azure/spark/tools/job/LivySparkBatch.java`
#### Snippet
```java
    private final LivyCluster cluster;

    private @Nullable String destinationRootPath;
    private String state = "__new_instance";

```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.collect.Streams' is marked unstable with @Beta
in `src/main/java/com/microsoft/azure/spark/tools/job/LivySparkBatch.java`
#### Snippet
```java

    public Observable<LivySparkBatch> get() {
        final String caller = Streams.findLast(Arrays.stream(Thread.currentThread().getStackTrace()).limit(3))
                // skip `getStackTrace` and the current frame
                .map(StackTraceElement::getMethodName)
```

### UnstableApiUsage
'findLast(java.util.stream.Stream)' is declared in unstable class 'com.google.common.collect.Streams' marked with @Beta
in `src/main/java/com/microsoft/azure/spark/tools/job/LivySparkBatch.java`
#### Snippet
```java

    public Observable<LivySparkBatch> get() {
        final String caller = Streams.findLast(Arrays.stream(Thread.currentThread().getStackTrace()).limit(3))
                // skip `getStackTrace` and the current frame
                .map(StackTraceElement::getMethodName)
```

