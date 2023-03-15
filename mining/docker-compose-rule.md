# docker-compose-rule 
 
# Bad smells
I found 79 bad smells with 4 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnstableApiUsage | 17 | false |
| BoundedWildcard | 15 | false |
| AbstractClassNeverImplemented | 13 | false |
| DynamicRegexReplaceableByCompiledPattern | 7 | false |
| ToArrayCallWithZeroLengthArrayArgument | 3 | true |
| UnnecessaryFullyQualifiedName | 3 | false |
| RegExpSingleCharAlternation | 3 | false |
| DeprecatedIsStillUsed | 3 | false |
| OptionalUsedAsFieldOrParameterType | 2 | false |
| SimplifyStreamApiCallChains | 2 | false |
| Convert2MethodRef | 2 | false |
| OptionalGetWithoutIsPresent | 2 | false |
| SystemOutErr | 1 | false |
| DataFlowIssue | 1 | false |
| OptionalContainsCollection | 1 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 1 | false |
| RedundantFieldInitialization | 1 | false |
| SizeReplaceableByIsEmpty | 1 | true |
| IgnoreResultOfCall | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[fullArgs.size()\]'
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/execution/DefaultDockerCompose.java`
#### Snippet
```java
                .addAll(dockerComposeRunArgument.arguments())
                .build();
        return fullArgs.toArray(new String[fullArgs.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[fullArgs.size()\]'
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/execution/DefaultDockerCompose.java`
#### Snippet
```java
                .addAll(dockerComposeExecArgument.arguments())
                .build();
        return fullArgs.toArray(new String[fullArgs.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[containerNames.size()\]'
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/execution/Docker.java`
#### Snippet
```java

    public void rm(Collection<String> containerNames) throws IOException, InterruptedException {
        rm(containerNames.toArray(new String[containerNames.size()]));
    }

```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'dir'
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/configuration/DockerComposeRuleConfig.java`
#### Snippet
```java
    private static StreamEx<File> dirAndParents(File startDir) {
        return StreamEx.of(Stream.generate(new Supplier<Optional<File>>() {
                    private Optional<File> dir = Optional.of(startDir.getAbsoluteFile());

                    @Override
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'recordedServiceNames'
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/RecordingClusterWait.java`
#### Snippet
```java
    // Optional exists solely as a check again logic errors - in the case when events are generated before the
    // cluster wait has begun.
    private Optional<Set<String>> recordedServiceNames = Optional.empty();

    RecordingClusterWait(ClusterWait clusterWait, ClusterWaitType clusterWaitType) {
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/execution/DockerForMacHostsIssue.java`
#### Snippet
```java
        if (!checkPerformed) {
            if (onMacOsX() && !localunixsocketRedirectedInEtcHosts()) {
                System.err.print(WARNING_MESSAGE);
            }
        }
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/connection/DockerPort.java`
#### Snippet
```java
     */
    public String inFormat(String format) {
        return format.replaceAll("\\$HOST", getIp())
                .replaceAll("\\$EXTERNAL_PORT", String.valueOf(getExternalPort()))
                .replaceAll("\\$INTERNAL_PORT", String.valueOf(getInternalPort()));
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/connection/DockerPort.java`
#### Snippet
```java
    public String inFormat(String format) {
        return format.replaceAll("\\$HOST", getIp())
                .replaceAll("\\$EXTERNAL_PORT", String.valueOf(getExternalPort()))
                .replaceAll("\\$INTERNAL_PORT", String.valueOf(getInternalPort()));
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/connection/DockerPort.java`
#### Snippet
```java
        return format.replaceAll("\\$HOST", getIp())
                .replaceAll("\\$EXTERNAL_PORT", String.valueOf(getExternalPort()))
                .replaceAll("\\$INTERNAL_PORT", String.valueOf(getInternalPort()));
    }

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/execution/DefaultDockerCompose.java`
#### Snippet
```java
    public List<String> services() throws IOException, InterruptedException {
        String servicesOutput = command.execute(Command.throwingOnError(), "config", "--services");
        return Arrays.asList(servicesOutput.split("(\r|\n)+"));
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/reporting/GitUtils.java`
#### Snippet
```java
        return Stream.of(parseHttp(gitRemoteUrl), parseSshOrGit(gitRemoteUrl))
                .flatMap(Streams::stream)
                .map(path -> path.replaceAll("(\\.git)?/?$", ""))
                .map(path -> path.replaceAll("^/", ""))
                .findFirst();
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/reporting/GitUtils.java`
#### Snippet
```java
                .flatMap(Streams::stream)
                .map(path -> path.replaceAll("(\\.git)?/?$", ""))
                .map(path -> path.replaceAll("^/", ""))
                .findFirst();
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/execution/Docker.java`
#### Snippet
```java
            + "{{else}}UNHEALTHY{{end}}"
            + "{{else}}HEALTHY{{end}}";
    private static final String HEALTH_STATUS_FORMAT_WINDOWS = HEALTH_STATUS_FORMAT.replaceAll("\"", "`\"");

    public static Version version() throws IOException, InterruptedException {
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `com.palantir.docker.compose.execution` is unnecessary, and can be replaced with an import
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/DockerComposeManager.java`
#### Snippet
```java
        emitEventsFor().build(dockerCompose()::build);

        com.palantir.docker.compose.execution.DockerCompose upDockerCompose = dockerCompose();
        if (removeConflictingContainersOnStartup()) {
            upDockerCompose = new ConflictingContainerRemovingDockerCompose(upDockerCompose, docker());
```

### UnnecessaryFullyQualifiedName
Qualifier `com.palantir.docker.compose.execution` is unnecessary, and can be replaced with an import
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/DockerComposeManager.java`
#### Snippet
```java

    @Value.Default
    public com.palantir.docker.compose.execution.DockerCompose dockerCompose() {
        com.palantir.docker.compose.execution.DockerCompose dockerCompose =
                new DefaultDockerCompose(dockerComposeExecutable(), machine());
```

### UnnecessaryFullyQualifiedName
Qualifier `com.palantir.docker.compose.execution` is unnecessary, and can be replaced with an import
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/DockerComposeManager.java`
#### Snippet
```java
    @Value.Default
    public com.palantir.docker.compose.execution.DockerCompose dockerCompose() {
        com.palantir.docker.compose.execution.DockerCompose dockerCompose =
                new DefaultDockerCompose(dockerComposeExecutable(), machine());
        return new RetryingDockerCompose(retryAttempts(), dockerCompose);
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Dereference of `lastExecutionException` may produce `NullPointerException`
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/execution/Retryer.java`
#### Snippet
```java

        log.error("Exhausted all retry attempts. Tried {} times.", retryAttempts);
        throw lastExecutionException;
    }
}
```

## RuleId[id=RegExpSingleCharAlternation]
### RegExpSingleCharAlternation
Single character alternation in RegExp
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/execution/DefaultDockerCompose.java`
#### Snippet
```java
    public List<String> services() throws IOException, InterruptedException {
        String servicesOutput = command.execute(Command.throwingOnError(), "config", "--services");
        return Arrays.asList(servicesOutput.split("(\r|\n)+"));
    }

```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/connection/ContainerNames.java`
#### Snippet
```java

public final class ContainerNames {
    private static final Pattern HEAD_PATTERN = Pattern.compile("-+(\r|\n)+");
    private static final Pattern BODY_PATTERN = Pattern.compile("(\r|\n)+");

```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/connection/ContainerNames.java`
#### Snippet
```java
public final class ContainerNames {
    private static final Pattern HEAD_PATTERN = Pattern.compile("-+(\r|\n)+");
    private static final Pattern BODY_PATTERN = Pattern.compile("(\r|\n)+");

    private ContainerNames() {}
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/execution/Command.java`
#### Snippet
```java

    private static String constructNonZeroExitErrorMessage(int exitCode, String commandName, String... commands) {
        return "'" + commandName + " " + Arrays.stream(commands).collect(Collectors.joining(" "))
                + "' returned exit code " + exitCode;
    }
```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/connection/waiting/ClusterHealthCheck.java`
#### Snippet
```java
                if (!unhealthyContainers.isEmpty()) {
                    return SuccessOrFailure.failure("The following containers are not healthy: "
                            + unhealthyContainers.stream().collect(joining(", ")));
                }
                return SuccessOrFailure.success();
```

## RuleId[id=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains collection `Set`
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/RecordingClusterWait.java`
#### Snippet
```java
    // Optional exists solely as a check again logic errors - in the case when events are generated before the
    // cluster wait has begun.
    private Optional<Set<String>> recordedServiceNames = Optional.empty();

    RecordingClusterWait(ClusterWait clusterWait, ClusterWaitType clusterWaitType) {
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'AGGRESSIVE_WITH_NETWORK_CLEANUP' is still used
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/configuration/ShutdownStrategy.java`
#### Snippet
```java
     */
    @Deprecated
    ShutdownStrategy AGGRESSIVE_WITH_NETWORK_CLEANUP = new AggressiveShutdownWithNetworkCleanupStrategy();
    /**
     * Call docker-compose down, kill, then rm. Allows containers up to 10 seconds to shut down
```

### DeprecatedIsStillUsed
Deprecated member 'AGGRESSIVE' is still used
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/configuration/ShutdownStrategy.java`
#### Snippet
```java
     */
    @Deprecated
    ShutdownStrategy AGGRESSIVE = new AggressiveShutdownStrategy();
    /**
     * Call rm on all containers, then call docker-compose down.
```

### DeprecatedIsStillUsed
Deprecated member 'portMappedInternallyTo' is still used
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/connection/Container.java`
#### Snippet
```java
     */
    @Deprecated
    public DockerPort portMappedInternallyTo(int internalPort) {
        return port(internalPort);
    }
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/execution/DockerCommandLocations.java`
#### Snippet
```java

public final class DockerCommandLocations {
    private static final Predicate<String> IS_NOT_NULL = path -> path != null;
    private static final Predicate<String> FILE_EXISTS = path -> new File(path).exists();

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/configuration/DaemonEnvironmentValidator.java`
#### Snippet
```java
            EnvironmentVariables.DOCKER_CERT_PATH);
    private static final Supplier<DaemonEnvironmentValidator> SUPPLIER =
            Suppliers.memoize(() -> new DaemonEnvironmentValidator());

    public static DaemonEnvironmentValidator instance() {
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `runBuilder` is accessed in both synchronized and unsynchronized contexts
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/reporting/RunRecorder.java`
#### Snippet
```java
    private final Clock clock;
    private final Reporter reporter;
    private DockerComposeRun.Builder runBuilder;

    RunRecorder(Clock clock, Reporter reporter) {
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/execution/DockerForMacHostsIssue.java`
#### Snippet
```java
            + REDIRECT_LINE
            + "\nFor more information, see https://github.com/docker/compose/issues/3419#issuecomment-221793401\n\n";
    private static volatile boolean checkPerformed = false;

    @SuppressWarnings("checkstyle:BanSystemErr")
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`projectName().get().trim().length() > 0` can be replaced with '!projectName().get().trim().isEmpty()'
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/configuration/ProjectName.java`
#### Snippet
```java

        checkState(
                projectName().get().trim().length() > 0,
                "ProjectName must not be blank. If you want to omit the project name, use ProjectName.omit()");

```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super String`
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/connection/waiting/SuccessOrFailure.java`
#### Snippet
```java
    }

    public SuccessOrFailure mapFailure(Function<String, String> mapper) {
        if (this.succeeded()) {
            return this;
```

### BoundedWildcard
Can generalize to `? super String`
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/execution/Command.java`
#### Snippet
```java
    private final Consumer<String> logConsumer;

    public Command(Executable executable, Consumer<String> logConsumer) {
        this.executable = executable;
        this.logConsumer = logConsumer;
```

### BoundedWildcard
Can generalize to `? super Optional`
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/connection/waiting/ClusterWait.java`
#### Snippet
```java

    private Callable<Boolean> weHaveSuccess(
            Cluster cluster, AtomicReference<Optional<SuccessOrFailure>> lastSuccessOrFailure) {
        return () -> {
            SuccessOrFailure successOrFailure = clusterHealthCheck.isClusterHealthy(cluster);
```

### BoundedWildcard
Can generalize to `? extends ContainerName`
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/execution/AggressiveShutdownStrategy.java`
#### Snippet
```java
    }

    private static void removeContainers(Docker docker, List<ContainerName> running)
            throws IOException, InterruptedException {
        List<String> rawContainerNames =
```

### BoundedWildcard
Can generalize to `? super DockerPort`
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/connection/DockerPort.java`
#### Snippet
```java
    @SuppressWarnings("ReadReturnValueIgnored")
    public SuccessOrFailure isHttpRespondingSuccessfully(
            Function<DockerPort, String> urlFunction, boolean andCheckStatus) {
        URL url;
        try {
```

### BoundedWildcard
Can generalize to `? extends ContainerName`
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/execution/AggressiveShutdownWithNetworkCleanupStrategy.java`
#### Snippet
```java
    }

    private static void removeContainers(Docker docker, List<ContainerName> running)
            throws IOException, InterruptedException {
        List<String> rawContainerNames =
```

### BoundedWildcard
Can generalize to `? super Cluster`
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/connection/waiting/ClusterHealthCheck.java`
#### Snippet
```java
    }

    static <T> ClusterHealthCheck transformingHealthCheck(Function<Cluster, T> transform, HealthCheck<T> healthCheck) {
        return cluster -> {
            T target = transform.apply(cluster);
```

### BoundedWildcard
Can generalize to `? extends T`
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/connection/waiting/ClusterHealthCheck.java`
#### Snippet
```java
    }

    static <T> ClusterHealthCheck transformingHealthCheck(Function<Cluster, T> transform, HealthCheck<T> healthCheck) {
        return cluster -> {
            T target = transform.apply(cluster);
```

### BoundedWildcard
Can generalize to `? super T`
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/connection/waiting/ClusterHealthCheck.java`
#### Snippet
```java
    }

    static <T> ClusterHealthCheck transformingHealthCheck(Function<Cluster, T> transform, HealthCheck<T> healthCheck) {
        return cluster -> {
            T target = transform.apply(cluster);
```

### BoundedWildcard
Can generalize to `? super String`
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/connection/DockerMachine.java`
#### Snippet
```java
    }

    private void augmentGivenEnvironment(Map<String, String> environmentToAugment) {
        environmentToAugment.putAll(environment);
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/connection/DockerMachine.java`
#### Snippet
```java
    }

    private void augmentGivenEnvironment(Map<String, String> environmentToAugment) {
        environmentToAugment.putAll(environment);
    }
```

### BoundedWildcard
Can generalize to `? extends File`
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/configuration/DockerComposeFiles.java`
#### Snippet
```java
    }

    private static void validateComposeFilesExist(List<File> dockerComposeFiles) {
        List<File> missingFiles =
                dockerComposeFiles.stream().filter(f -> !f.exists()).collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? extends File`
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/configuration/DockerComposeFiles.java`
#### Snippet
```java
    private final List<File> dockerComposeFiles;

    public DockerComposeFiles(List<File> dockerComposeFiles) {
        this.dockerComposeFiles = dockerComposeFiles;
    }
```

### BoundedWildcard
Can generalize to `? extends InterruptableClusterWait`
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/DockerComposeManager.java`
#### Snippet
```java
    }

    private void waitForAllClusterWaits(List<InterruptableClusterWait> allClusterWaits) throws InterruptedException {
        ListeningExecutorService executorService = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(
                allClusterWaits.size(),
```

### BoundedWildcard
Can generalize to `? super DockerPort`
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/DockerComposeManager.java`
#### Snippet
```java

        default TSelf waitingForHostNetworkedPort(
                int port, HealthCheck<DockerPort> healthCheck, ReadableDuration timeout) {
            ClusterHealthCheck clusterHealthCheck = ClusterHealthCheck.transformingHealthCheck(
                    cluster -> new DockerPort(cluster.ip(), port, port), healthCheck);
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `DockerComposeExtension` has no concrete subclass
in `docker-compose-junit-jupiter/src/main/java/com/palantir/docker/compose/DockerComposeExtension.java`
#### Snippet
```java
@CustomImmutablesStyle
@SuppressWarnings("DesignForExtension")
public abstract class DockerComposeExtension extends DockerComposeManager
        implements BeforeAllCallback, AfterAllCallback {

```

### AbstractClassNeverImplemented
Abstract class `SuccessOrFailure` has no concrete subclass
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/connection/waiting/SuccessOrFailure.java`
#### Snippet
```java
@Value.Immutable
@SuppressWarnings("DesignForExtension")
public abstract class SuccessOrFailure {
    public static SuccessOrFailure onResultOf(Attempt attempt) {
        try {
```

### AbstractClassNeverImplemented
Abstract class `DockerComposeExecutable` has no concrete subclass
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/execution/DockerComposeExecutable.java`
#### Snippet
```java
@Value.Immutable
@SuppressWarnings("DesignForExtension")
public abstract class DockerComposeExecutable implements Executable {
    private static final Logger log = LoggerFactory.getLogger(DockerComposeExecutable.class);

```

### AbstractClassNeverImplemented
Abstract class `DockerComposeRunOption` has no concrete subclass
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/execution/DockerComposeRunOption.java`
#### Snippet
```java

@Value.Immutable
public abstract class DockerComposeRunOption {
    @Value.Parameter
    public abstract List<String> options();
```

### AbstractClassNeverImplemented
Abstract class `DockerExecutable` has no concrete subclass
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/execution/DockerExecutable.java`
#### Snippet
```java
@Value.Immutable
@SuppressWarnings("DesignForExtension")
public abstract class DockerExecutable implements Executable {
    private static final Logger log = LoggerFactory.getLogger(DockerExecutable.class);

```

### AbstractClassNeverImplemented
Abstract class `DockerComposeRule` has no concrete subclass
in `docker-compose-rule-junit4/src/main/java/com/palantir/docker/compose/DockerComposeRule.java`
#### Snippet
```java
@CustomImmutablesStyle
@SuppressWarnings("DesignForExtension")
public abstract class DockerComposeRule extends DockerComposeManager implements TestRule {
    @Override
    public Statement apply(Statement base, Description description) {
```

### AbstractClassNeverImplemented
Abstract class `DockerComposeExecOption` has no concrete subclass
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/execution/DockerComposeExecOption.java`
#### Snippet
```java

@Value.Immutable
public abstract class DockerComposeExecOption {
    @Value.Parameter
    public abstract List<String> options();
```

### AbstractClassNeverImplemented
Abstract class `DockerComposeRunArgument` has no concrete subclass
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/execution/DockerComposeRunArgument.java`
#### Snippet
```java

@Value.Immutable
public abstract class DockerComposeRunArgument {
    @Value.Parameter
    public abstract List<String> arguments();
```

### AbstractClassNeverImplemented
Abstract class `DockerComposeRuleConfig` has no concrete subclass
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/configuration/DockerComposeRuleConfig.java`
#### Snippet
```java
@CustomImmutablesStyle
@JsonDeserialize(as = ImmutableDockerComposeRuleConfig.class)
public abstract class DockerComposeRuleConfig {
    private static final ObjectMapper OBJECT_MAPPER =
            new ObjectMapper(new YAMLFactory()).registerModule(new Jdk8Module()).registerModule(new GuavaModule());
```

### AbstractClassNeverImplemented
Abstract class `DockerComposeExecArgument` has no concrete subclass
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/execution/DockerComposeExecArgument.java`
#### Snippet
```java

@Value.Immutable
public abstract class DockerComposeExecArgument {
    @Value.Parameter
    public abstract List<String> arguments();
```

### AbstractClassNeverImplemented
Abstract class `ProjectName` has no concrete subclass
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/configuration/ProjectName.java`
#### Snippet
```java
@PackageVisible
@SuppressWarnings("DesignForExtension")
public abstract class ProjectName {

    @Parameter
```

### AbstractClassNeverImplemented
Abstract class `ContainerName` has no concrete subclass
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/connection/ContainerName.java`
#### Snippet
```java
@Value.Immutable
@SuppressWarnings("checkstyle:DesignForExtension")
public abstract class ContainerName {

    public abstract String rawName();
```

### AbstractClassNeverImplemented
Abstract class `DockerComposeManager` has no concrete subclass
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/DockerComposeManager.java`
#### Snippet
```java
@CustomImmutablesStyle
@SuppressWarnings("DesignForExtension")
public abstract class DockerComposeManager {
    private static final Logger log = LoggerFactory.getLogger(DockerComposeManager.class);

```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/connection/waiting/SuccessOrFailure.java`
#### Snippet
```java

    public String failureMessage() {
        return optionalFailureMessage().get();
    }

```

### OptionalGetWithoutIsPresent
`Optional::get` without 'isPresent()' check
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/configuration/DockerComposeRuleConfig.java`
#### Snippet
```java
                }))
                .takeWhile(Optional::isPresent)
                .map(Optional::get);
    }
}
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.io.Files' is marked unstable with @Beta
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/execution/DockerForMacHostsIssue.java`
#### Snippet
```java
    private static boolean localunixsocketRedirectedInEtcHosts() {
        try {
            return Files.toString(new File("/etc/hosts"), StandardCharsets.UTF_8)
                    .contains(REDIRECT_LINE);
        } catch (IOException e) {
```

### UnstableApiUsage
'toString(java.io.File, java.nio.charset.Charset)' is declared in unstable class 'com.google.common.io.Files' marked with @Beta
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/execution/DockerForMacHostsIssue.java`
#### Snippet
```java
    private static boolean localunixsocketRedirectedInEtcHosts() {
        try {
            return Files.toString(new File("/etc/hosts"), StandardCharsets.UTF_8)
                    .contains(REDIRECT_LINE);
        } catch (IOException e) {
```

### UnstableApiUsage
'com.google.common.collect.Streams' is marked unstable with @Beta
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/reporting/GitUtils.java`
#### Snippet
```java

        return Stream.of(parseHttp(gitRemoteUrl), parseSshOrGit(gitRemoteUrl))
                .flatMap(Streams::stream)
                .map(path -> path.replaceAll("(\\.git)?/?$", ""))
                .map(path -> path.replaceAll("^/", ""))
```

### UnstableApiUsage
'stream(java.util.Optional)' is declared in unstable class 'com.google.common.collect.Streams' marked with @Beta
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/reporting/GitUtils.java`
#### Snippet
```java

        return Stream.of(parseHttp(gitRemoteUrl), parseSshOrGit(gitRemoteUrl))
                .flatMap(Streams::stream)
                .map(path -> path.replaceAll("(\\.git)?/?$", ""))
                .map(path -> path.replaceAll("^/", ""))
```

### UnstableApiUsage
'com.google.common.io.CharStreams' is marked unstable with @Beta
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/reporting/ReportCompiler.java`
#### Snippet
```java

    private String inputStreamToString(InputStream inputStream) throws IOException {
        return CharStreams.toString(new InputStreamReader(inputStream, StandardCharsets.UTF_8))
                .trim();
    }
```

### UnstableApiUsage
'toString(java.lang.Readable)' is declared in unstable class 'com.google.common.io.CharStreams' marked with @Beta
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/reporting/ReportCompiler.java`
#### Snippet
```java

    private String inputStreamToString(InputStream inputStream) throws IOException {
        return CharStreams.toString(new InputStreamReader(inputStream, StandardCharsets.UTF_8))
                .trim();
    }
```

### UnstableApiUsage
'com.google.common.io.CharStreams' is marked unstable with @Beta
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/reporting/HttpJsonPoster.java`
#### Snippet
```java

            if (status >= 400) {
                String error = CharStreams.toString(
                        new InputStreamReader(connection.getErrorStream(), StandardCharsets.UTF_8));

```

### UnstableApiUsage
'toString(java.lang.Readable)' is declared in unstable class 'com.google.common.io.CharStreams' marked with @Beta
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/reporting/HttpJsonPoster.java`
#### Snippet
```java

            if (status >= 400) {
                String error = CharStreams.toString(
                        new InputStreamReader(connection.getErrorStream(), StandardCharsets.UTF_8));

```

### UnstableApiUsage
'splitToList(java.lang.CharSequence)' is marked unstable with @Beta
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/connection/ContainerNames.java`
#### Snippet
```java

    public static List<ContainerName> parseFromDockerComposePs(String psOutput) {
        List<String> psHeadAndBody = Splitter.on(HEAD_PATTERN).splitToList(psOutput);
        if (psHeadAndBody.size() < 2) {
            return emptyList();
```

### UnstableApiUsage
'splitToList(java.lang.CharSequence)' is marked unstable with @Beta
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/connection/ContainerNames.java`
#### Snippet
```java

    private static Stream<String> psBodyLines(String psBody) {
        List<String> lines = Splitter.on(BODY_PATTERN).splitToList(psBody);
        return lines.stream().map(String::trim).filter(line -> !line.isEmpty());
    }
```

### UnstableApiUsage
'splitToList(java.lang.CharSequence)' is marked unstable with @Beta
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/execution/DockerComposeVersion.java`
#### Snippet
```java
    // here we only pass 1.7.0 to java-semver
    public static Version parseFromDockerComposeVersion(String versionOutput) {
        List<String> splitOnSeparator = Splitter.on(' ').splitToList(versionOutput);
        String version = splitOnSeparator.get(2);
        StringBuilder builder = new StringBuilder();
```

### UnstableApiUsage
'com.google.common.util.concurrent.Uninterruptibles' is marked unstable with @Beta
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/reporting/PostReportOnShutdown.java`
#### Snippet
```java
            REPORTER.report();
            // Give time for logs to flush before killing
            Uninterruptibles.sleepUninterruptibly(300, TimeUnit.MILLISECONDS);
        }));
    }
```

### UnstableApiUsage
'sleepUninterruptibly(long, java.util.concurrent.TimeUnit)' is declared in unstable class 'com.google.common.util.concurrent.Uninterruptibles' marked with @Beta
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/reporting/PostReportOnShutdown.java`
#### Snippet
```java
            REPORTER.report();
            // Give time for logs to flush before killing
            Uninterruptibles.sleepUninterruptibly(300, TimeUnit.MILLISECONDS);
        }));
    }
```

### UnstableApiUsage
'splitToList(java.lang.CharSequence)' is marked unstable with @Beta
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/connection/ContainerName.java`
#### Snippet
```java

    public static ContainerName fromPsLine(String psLine) {
        List<String> lineComponents = Splitter.on(" ").splitToList(psLine);
        String rawName = lineComponents.get(0);

```

### UnstableApiUsage
'com.google.common.util.concurrent.Futures' is marked unstable with @Beta
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/DockerComposeManager.java`
#### Snippet
```java

        try {
            ListenableFuture<?> listListenableFuture = Futures.allAsList(allClusterWaits.stream()
                    .map(clusterWait -> executorService.submit(() -> {
                        try {
```

### UnstableApiUsage
'allAsList(java.lang.Iterable\>)' is marked unstable with @Beta
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/DockerComposeManager.java`
#### Snippet
```java

        try {
            ListenableFuture<?> listListenableFuture = Futures.allAsList(allClusterWaits.stream()
                    .map(clusterWait -> executorService.submit(() -> {
                        try {
```

### UnstableApiUsage
'shutdownAndAwaitTermination(java.util.concurrent.ExecutorService, long, java.util.concurrent.TimeUnit)' is marked unstable with @Beta
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/DockerComposeManager.java`
#### Snippet
```java
            throw new IllegalStateException("A cluster wait errored out: ", e);
        } finally {
            MoreExecutors.shutdownAndAwaitTermination(executorService, 0, TimeUnit.SECONDS);
        }
    }
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/connection/DockerPort.java`
#### Snippet
```java
        try {
            url.openConnection().connect();
            url.openStream().read();
            log.debug("Http connection acquired, assuming port active");
            return SuccessOrFailure.success();
```

