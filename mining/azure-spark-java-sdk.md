# azure-spark-java-sdk 
 
# Bad smells
I found 108 bad smells with 10 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| NullableProblems | 30 | false |
| RedundantFieldInitialization | 17 | false |
| ExceptionNameDoesntEndWithException | 10 | false |
| BoundedWildcard | 7 | false |
| SynchronizeOnThis | 6 | false |
| CommentedOutCode | 4 | false |
| UnnecessaryModifier | 3 | true |
| UtilityClassWithoutPrivateConstructor | 3 | true |
| CodeBlock2Expr | 3 | true |
| DoubleCheckedLocking | 2 | false |
| UnnecessaryQualifierForThis | 2 | false |
| RegExpSimplifiable | 2 | false |
| UnnecessaryFullyQualifiedName | 2 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 2 | false |
| ZeroLengthArrayInitialization | 2 | false |
| UnstableApiUsage | 2 | false |
| SimplifyStreamApiCallChains | 1 | false |
| Convert2MethodRef | 1 | false |
| ComparatorCombinators | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| EqualsBetweenInconvertibleTypes | 1 | false |
| RedundantMethodOverride | 1 | false |
| KotlinMavenPluginPhase | 1 | false |
| UnnecessarySuperQualifier | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| DoubleBraceInitialization | 1 | false |
| ConstantValue | 1 | false |
## RuleId[id=UnnecessaryModifier]
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

public interface IdeSchedulers {
    public Scheduler processBarVisibleAsync(String title);

    public Scheduler processBarVisibleSync(String title);
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

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Configurations` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/microsoft/azure/spark/tools/utils/Configurations.java`
#### Snippet
```java
package com.microsoft.azure.spark.tools.utils;

public class Configurations {
    public static final String BYPASS_LIVY_SSL_CERTIFICATE_VALIDATION_PROPERTY =
            "spark.tools.client.bypassLivySslCertValidation";
```

### UtilityClassWithoutPrivateConstructor
Class `Versions` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/microsoft/azure/spark/tools/utils/Versions.java`
#### Snippet
```java
import static java.lang.System.getProperty;

public class Versions {
    public static final String UNKNOWN_VERSION = "UNKNOWN_VERSION";

```

### UtilityClassWithoutPrivateConstructor
Class `UriUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/microsoft/azure/spark/tools/utils/UriUtils.java`
#### Snippet
```java
import java.net.URISyntaxException;

public class UriUtils {
    public static URI normalizeWithSlashEnding(final URI src) {
        try {
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
    @Override
    public T get() {
        if (this.value == null) {
            synchronized (this) {
                if (this.value == null) {
```

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

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/com/microsoft/azure/spark/tools/utils/LaterInit.java`
#### Snippet
```java

    public Observable<T> observable() {
        return delegation.filter(obj -> obj != null);
    }

```

## RuleId[id=ComparatorCombinators]
### ComparatorCombinators
Can be replaced with 'Comparator.comparingInt'
in `src/main/java/com/microsoft/azure/spark/tools/job/YarnContainerLogFetcher.java`
#### Snippet
```java
    Observable<URI> getSparkJobYarnCurrentAppAttemptLogsLink() {
        return this.getYarnApplicationAttemptsRequest()
                .map(appAttempts -> appAttempts.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())))
                .flatMap(attemptOpt -> attemptOpt.map(it -> Observable.just(URI.create(it.getLogsLink())))
                                                 .orElse(Observable.empty()));
```

## RuleId[id=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `HdiSparkBatch` on 'this' is unnecessary in this context
in `src/main/java/com/microsoft/azure/spark/tools/job/HdiSparkBatch.java`
#### Snippet
```java
                            YarnContainerLogFetcher driverContainerLogFetcher = new YarnContainerLogFetcher(
                                    appId,
                                    (YarnCluster) HdiSparkBatch.this.getCluster(),
                                    HdiSparkBatch.this.getHttp());

```

### UnnecessaryQualifierForThis
Qualifier `HdiSparkBatch` on 'this' is unnecessary in this context
in `src/main/java/com/microsoft/azure/spark/tools/job/HdiSparkBatch.java`
#### Snippet
```java
                                    appId,
                                    (YarnCluster) HdiSparkBatch.this.getCluster(),
                                    HdiSparkBatch.this.getHttp());

                            driverLogFetcherDelegate.setIfNull(driverContainerLogFetcher);
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

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/com/microsoft/azure/spark/tools/utils/JsonConverter.java`
#### Snippet
```java
    private final Class<T> targetType;

    private JsonConverter(final Class<T> targetType) {
        this.targetType = targetType;
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/com/microsoft/azure/spark/tools/utils/LaterInit.java`
#### Snippet
```java
    }

    public synchronized void setIfNull(final Supplier<T> valueGetter) {
        if (!isInitialized()) {
            set(valueGetter.get());
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/com/microsoft/azure/spark/tools/utils/Lazy.java`
#### Snippet
```java

    @SuppressWarnings("uninitialized")
    public Lazy(final @Nullable Supplier<T> supplier) {
        this.supplier = supplier;
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/com/microsoft/azure/spark/tools/utils/Lazy.java`
#### Snippet
```java
    }

    public T getOrEvaluate(final Supplier<T> evaluate) {
        if (this.value == null) {
            synchronized (this) {
```

### BoundedWildcard
Can generalize to `? extends List`
in `src/main/java/com/microsoft/azure/spark/tools/job/LivySparkBatch.java`
#### Snippet
```java
    }

    boolean isNoMoreLivyLogs(final LivyLogType defaultLogType, final Map<LivyLogType, List<String>> typedLogs) {
        return typedLogs.get(defaultLogType).isEmpty()
                && ((!StringUtils.equalsIgnoreCase(getState(), "starting") && this.appId.isInitialized())
```

### BoundedWildcard
Can generalize to `? extends Header`
in `src/main/java/com/microsoft/azure/spark/tools/http/HttpObservable.java`
#### Snippet
```java
                                                     final @Nullable HttpEntity entity,
                                                     final List<NameValuePair> parameters,
                                                     final List<Header> addOrReplaceHeaders) {
        return Observable.fromCallable(() -> {
            URIBuilder builder = new URIBuilder(httpRequest.getURI());
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/com/microsoft/azure/spark/tools/http/HttpObservable.java`
#### Snippet
```java
     * @return the specified type class instance
     */
    public <T> Pair<T, HttpResponse> convertJsonResponseToObject(final HttpResponse resp, final Class<T> clazz) {
        try {
            String body = resp.getMessage();
```

## RuleId[id=NullableProblems]
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
in `src/main/java/com/microsoft/azure/spark/tools/utils/Lazy.java`
#### Snippet
```java
    private final @Nullable Supplier<T> supplier;

    private @Nullable T value;

    public Lazy() {
```

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
    private final PublishSubject<SparkBatchJobSubmissionEvent> eventSubject = PublishSubject.create();
    private boolean isDestroyed = false;
    private @Nullable Integer exitValue = null;

    private boolean isDisconnected;
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
in `src/main/java/com/microsoft/azure/spark/tools/job/LivySparkBatch.java`
#### Snippet
```java
    private final LivyCluster cluster;

    private @Nullable String destinationRootPath;
    private String state = "__new_instance";

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
        private @Nullable MemorySize driverMemory = null;

        private @Nullable Integer driverCores = null;

        private @Nullable MemorySize executorMemory = null;
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
    private @Nullable MemorySize executorMemory;

    private @Nullable Integer executorCores;

    @JsonProperty("numExecutors")
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
        private @Nullable Integer driverCores = null;

        private @Nullable MemorySize executorMemory = null;

        private @Nullable Integer executorCores = null;
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
        private @Nullable Integer executorCores = null;

        private @Nullable Integer yarnNumExecutors = null;

        /**
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
    private @Nullable MemorySize driverMemory;

    private @Nullable Integer driverCores;

    private @Nullable MemorySize executorMemory;
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
        private Map<String, String> jobConfig = new HashMap<>();

        private @Nullable String yarnQueue = null;

        private @Nullable MemorySize driverMemory = null;
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
in `src/main/java/com/microsoft/azure/spark/tools/http/HttpObservable.java`
#### Snippet
```java
     * The SSL trust strategy for HTTPS connection, which can refer to platform implementations.
     */
    private @Nullable TrustStrategy trustStrategy = null;

    /*
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

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/microsoft/azure/spark/tools/job/HdiSparkBatch.java`
#### Snippet
```java
    public Observable<String> awaitStarted() {
        return super.awaitStarted()
                .flatMap(state -> super.getLaterAppId()
                        .observable()
                        .first()
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/com/microsoft/azure/spark/tools/job/LivySparkBatchFactory.java`
#### Snippet
```java
    }

    protected org.slf4j.Logger getLoggerForControlSubject() {
        return LoggerFactory.getLogger(LivySparkBatch.class);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `src/main/java/com/microsoft/azure/spark/tools/job/LivySparkBatchFactory.java`
#### Snippet
```java
    }

    private PublishSubject<Pair<MessageInfoType, String>> createLogAsControlSubject(final org.slf4j.Logger log) {
        PublishSubject<Pair<MessageInfoType, String>> logAsCtrlSubject = PublishSubject.create();
        logAsCtrlSubject.subscribe(
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/microsoft/azure/spark/tools/processes/SparkBatchJobRemoteProcess.java`
#### Snippet
```java
                            }
                        },
                        () -> {
                            disconnect(EXIT_OK);
                        }));
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/microsoft/azure/spark/tools/job/LivySparkBatch.java`
#### Snippet
```java
                .retry(getRetriesMax())
                .repeatWhen(ob -> ob
                        .doOnNext(ignored -> {
                            getCtrlSubject().onNext(new Pair<>(Info, "The Spark job is starting..."));
                        })
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/microsoft/azure/spark/tools/job/LivySparkBatch.java`
#### Snippet
```java
        return deleteSparkBatchRequest()
                .map(resp -> {
                    return this;
                })
                .defaultIfEmpty(this);
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `value` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/com/microsoft/azure/spark/tools/utils/Lazy.java`
#### Snippet
```java
    private final @Nullable Supplier<T> supplier;

    private @Nullable T value;

    public Lazy() {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `exitValue` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/com/microsoft/azure/spark/tools/processes/SparkBatchJobRemoteProcess.java`
#### Snippet
```java
    private final PublishSubject<SparkBatchJobSubmissionEvent> eventSubject = PublishSubject.create();
    private boolean isDestroyed = false;
    private @Nullable Integer exitValue = null;

    private boolean isDisconnected;
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/microsoft/azure/spark/tools/processes/SparkJobLogInputStream.java`
#### Snippet
```java
    private boolean isClosed = false;

    private long offset = 0;
    private byte[] buffer = new byte[0];
    private int bufferPos;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/com/microsoft/azure/spark/tools/processes/SparkJobLogInputStream.java`
#### Snippet
```java
    private LaterInit<SparkLogFetcher> sparkLogFetcher = new LaterInit<>();

    private boolean isClosed = false;

    private long offset = 0;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/com/microsoft/azure/spark/tools/processes/SparkBatchJobRemoteProcess.java`
#### Snippet
```java
    private final SparkBatchJob sparkJob;
    private final PublishSubject<SparkBatchJobSubmissionEvent> eventSubject = PublishSubject.create();
    private boolean isDestroyed = false;
    private @Nullable Integer exitValue = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/microsoft/azure/spark/tools/processes/SparkBatchJobRemoteProcess.java`
#### Snippet
```java

    public static class Builder {
        private @Nullable File artifact = null;
        private final SparkBatchJobFactory batchJobFactory;
        private final LaterInit<Observer<Pair<MessageInfoType, String>>> ctrlSubject = new LaterInit<>();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/microsoft/azure/spark/tools/processes/SparkBatchJobRemoteProcess.java`
#### Snippet
```java
    private final PublishSubject<SparkBatchJobSubmissionEvent> eventSubject = PublishSubject.create();
    private boolean isDestroyed = false;
    private @Nullable Integer exitValue = null;

    private boolean isDisconnected;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/microsoft/azure/spark/tools/job/YarnContainerLogFetcher.java`
#### Snippet
```java
 */
public class YarnContainerLogFetcher implements SparkLogFetcher, Logger {
    private @Nullable App lastAppRawResponse = null;
    private final Map<String, Long> unfetchedOffsetByType = new HashMap<>();

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
        private @Nullable MemorySize executorMemory = null;

        private @Nullable Integer executorCores = null;

        private @Nullable Integer yarnNumExecutors = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
        private @Nullable String artifactUri = null;

        private @Nullable String className = null;

        private List<String> referenceFiles = new ArrayList<>();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
        private @Nullable String yarnQueue = null;

        private @Nullable MemorySize driverMemory = null;

        private @Nullable Integer driverCores = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
        private @Nullable Integer driverCores = null;

        private @Nullable MemorySize executorMemory = null;

        private @Nullable Integer executorCores = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java

    public static class Options {
        private @Nullable String name = null;

        private @Nullable String proxyUser = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
        private @Nullable Integer executorCores = null;

        private @Nullable Integer yarnNumExecutors = null;

        /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
        private @Nullable String proxyUser = null;

        private @Nullable String artifactUri = null;

        private @Nullable String className = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
        private Map<String, String> jobConfig = new HashMap<>();

        private @Nullable String yarnQueue = null;

        private @Nullable MemorySize driverMemory = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
        private @Nullable String name = null;

        private @Nullable String proxyUser = null;

        private @Nullable String artifactUri = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java
        private @Nullable MemorySize driverMemory = null;

        private @Nullable Integer driverCores = null;

        private @Nullable MemorySize executorMemory = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/microsoft/azure/spark/tools/http/HttpObservable.java`
#### Snippet
```java
     * The SSL trust strategy for HTTPS connection, which can refer to platform implementations.
     */
    private @Nullable TrustStrategy trustStrategy = null;

    /*
```

## RuleId[id=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `UnclassifiedHttpErrorStatus` does not end with 'Exception'
in `src/main/java/com/microsoft/azure/spark/tools/http/status/UnclassifiedHttpErrorStatus.java`
#### Snippet
```java
import org.checkerframework.checker.nullness.qual.Nullable;

public class UnclassifiedHttpErrorStatus extends HttpErrorStatus {
    public UnclassifiedHttpErrorStatus(
            final int statusCode,
```

### ExceptionNameDoesntEndWithException
Exception class name `ServerError` does not end with 'Exception'
in `src/main/java/com/microsoft/azure/spark/tools/http/status/ServerError.java`
#### Snippet
```java
import org.checkerframework.checker.nullness.qual.Nullable;

public class ServerError extends HttpErrorStatus {
    private ServerError(final int statusCode,
                        final String message,
```

### ExceptionNameDoesntEndWithException
Exception class name `InternalServerErrorHttpErrorStatus` does not end with 'Exception'
in `src/main/java/com/microsoft/azure/spark/tools/http/status/ServerError.java`
#### Snippet
```java
    }

    public static class InternalServerErrorHttpErrorStatus extends ServerError {
        public InternalServerErrorHttpErrorStatus(
                final String message,
```

### ExceptionNameDoesntEndWithException
Exception class name `UnauthorizedHttpErrorStatus` does not end with 'Exception'
in `src/main/java/com/microsoft/azure/spark/tools/http/status/ClientError.java`
#### Snippet
```java
    }

    public static class UnauthorizedHttpErrorStatus extends ClientError {
        public UnauthorizedHttpErrorStatus(
                final String message,
```

### ExceptionNameDoesntEndWithException
Exception class name `ForbiddenHttpErrorStatus` does not end with 'Exception'
in `src/main/java/com/microsoft/azure/spark/tools/http/status/ClientError.java`
#### Snippet
```java
    }

    public static class ForbiddenHttpErrorStatus extends ClientError {
        public ForbiddenHttpErrorStatus(
                final String message,
```

### ExceptionNameDoesntEndWithException
Exception class name `NotFoundHttpErrorStatus` does not end with 'Exception'
in `src/main/java/com/microsoft/azure/spark/tools/http/status/ClientError.java`
#### Snippet
```java
    }

    public static class NotFoundHttpErrorStatus extends ClientError {
        public NotFoundHttpErrorStatus(
                final String message,
```

### ExceptionNameDoesntEndWithException
Exception class name `MethodNotAllowedHttpErrorStatus` does not end with 'Exception'
in `src/main/java/com/microsoft/azure/spark/tools/http/status/ClientError.java`
#### Snippet
```java
    }

    public static class MethodNotAllowedHttpErrorStatus extends ClientError {
        public MethodNotAllowedHttpErrorStatus(
                final String message,
```

### ExceptionNameDoesntEndWithException
Exception class name `BadRequestHttpErrorStatus` does not end with 'Exception'
in `src/main/java/com/microsoft/azure/spark/tools/http/status/ClientError.java`
#### Snippet
```java
    }

    public static class BadRequestHttpErrorStatus extends ClientError {
        public BadRequestHttpErrorStatus(
                final String message,
```

### ExceptionNameDoesntEndWithException
Exception class name `ClientError` does not end with 'Exception'
in `src/main/java/com/microsoft/azure/spark/tools/http/status/ClientError.java`
#### Snippet
```java
import org.checkerframework.checker.nullness.qual.Nullable;

public class ClientError extends HttpErrorStatus {
    private ClientError(final int statusCode,
                        final String message,
```

### ExceptionNameDoesntEndWithException
Exception class name `HttpErrorStatus` does not end with 'Exception'
in `src/main/java/com/microsoft/azure/spark/tools/http/status/HttpErrorStatus.java`
#### Snippet
```java
import static java.util.stream.Stream.of;

public class HttpErrorStatus extends HttpException {
    private final int statusCode;

```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-18-03-30-56.419.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/com/microsoft/azure/spark/tools/utils/Lazy.java`
#### Snippet
```java
    public T get() {
        if (this.value == null) {
            synchronized (this) {
                if (this.value == null) {
                    if (this.supplier == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/com/microsoft/azure/spark/tools/utils/Lazy.java`
#### Snippet
```java
    public T getOrEvaluate(final Supplier<T> evaluate) {
        if (this.value == null) {
            synchronized (this) {
                if (this.value == null) {
                    if (this.supplier != null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/com/microsoft/azure/spark/tools/processes/SparkBatchJobRemoteProcess.java`
#### Snippet
```java
    @Override
    public int waitFor() throws InterruptedException {
        synchronized (this) {
            while (exitValue == null) {
                wait();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/com/microsoft/azure/spark/tools/processes/SparkBatchJobRemoteProcess.java`
#### Snippet
```java
        synchronized (this) {
            while (exitValue == null) {
                wait();
            }
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/com/microsoft/azure/spark/tools/processes/SparkBatchJobRemoteProcess.java`
#### Snippet
```java
        }

        synchronized (this) {
            exitValue = code;
            notifyAll();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/com/microsoft/azure/spark/tools/processes/SparkBatchJobRemoteProcess.java`
#### Snippet
```java
        synchronized (this) {
            exitValue = code;
            notifyAll();
        }
    }
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/com/microsoft/azure/spark/tools/processes/SparkJobLogInputStream.java`
#### Snippet
```java

    private long offset = 0;
    private byte[] buffer = new byte[0];
    private int bufferPos;

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/com/microsoft/azure/spark/tools/http/HttpObservable.java`
#### Snippet
```java
            encodedAuth = Base64.encodeBase64(auth.getBytes(StandardCharsets.ISO_8859_1));
        } else {
            encodedAuth = new byte[0];
        }

```

## RuleId[id=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `src/main/java/com/microsoft/azure/spark/tools/restapi/livy/batches/api/PostBatches.java`
#### Snippet
```java

        private final Map<String, StringAction1> exclusiveConfKeyActions = Collections.unmodifiableMap(
                new HashMap<String, StringAction1>() {
                    {
                        put(PostBatches.DRIVER_MEMORY, size -> setDriverMemory(size));
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

