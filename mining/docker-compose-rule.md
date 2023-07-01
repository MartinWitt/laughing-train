# docker-compose-rule 
 
# Bad smells
I found 43 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnstableApiUsage | 14 | false |
| Deprecation | 5 | false |
| ArraysAsListWithZeroOrOneArgument | 4 | false |
| ToArrayCallWithZeroLengthArrayArgument | 3 | true |
| DeprecatedIsStillUsed | 3 | false |
| OptionalUsedAsFieldOrParameterType | 2 | false |
| SimplifyStreamApiCallChains | 2 | false |
| OptionalGetWithoutIsPresent | 2 | false |
| UNCHECKED_WARNING | 1 | false |
| AutoCloseableResource | 1 | false |
| DataFlowIssue | 1 | false |
| RegExpSingleCharAlternation | 1 | false |
| FieldMayBeFinal | 1 | false |
| NullableProblems | 1 | false |
| JavadocLinkAsPlainText | 1 | false |
| IgnoreResultOfCall | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[containerNames.size()\]'
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/execution/Docker.java`
#### Snippet
```java

    public void rm(Collection<String> containerNames) throws IOException, InterruptedException {
        rm(containerNames.toArray(new String[containerNames.size()]));
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
Call to `toArray()` with pre-sized array argument 'new String\[fullArgs.size()\]'
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/execution/DefaultDockerCompose.java`
#### Snippet
```java
                .addAll(dockerComposeRunArgument.arguments())
                .build();
        return fullArgs.toArray(new String[fullArgs.size()]);
    }

```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'com.palantir.docker.compose.DockerComposeManager.BuilderExtensions' to 'TSelf'
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/DockerComposeManager.java`
#### Snippet
```java
            }

            return (TSelf) this;
        }

```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'InputStream' used without 'try'-with-resources statement
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/connection/DockerPort.java`
#### Snippet
```java
        try {
            url.openConnection().connect();
            url.openStream().read();
            log.debug("Http connection acquired, assuming port active");
            return SuccessOrFailure.success();
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

## RuleId[id=DeprecatedIsStillUsed]
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

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `exitCode` may be 'final'
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/execution/ProcessResult.java`
#### Snippet
```java

public final class ProcessResult {
    private int exitCode;
    private final String output;

```

## RuleId[id=Deprecation]
### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/execution/Command.java`
#### Snippet
```java
            return outputProcessing.get(HOURS_TO_WAIT_FOR_STD_OUT_TO_CLOSE, TimeUnit.HOURS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw Throwables.propagate(e);
        }
    }
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/EventEmitter.java`
#### Snippet
```java
            emitTask(runnable, eventFunction);
        } catch (IOException e) {
            Throwables.propagate(e);
        }
    }
```

### Deprecation
'version()' is deprecated
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/execution/DockerCompose.java`
#### Snippet
```java
public interface DockerCompose {
    static Version version() throws IOException, InterruptedException {
        return DockerComposeExecutable.version();
    }

```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/DockerComposeManager.java`
#### Snippet
```java
                            }

                            Throwables.propagate(e);
                        }
                    }))
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/connection/Container.java`
#### Snippet
```java
            return dockerCompose.ports(containerName);
        } catch (IOException | InterruptedException e) {
            throw Throwables.propagate(e);
        }
    }
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/execution/DockerComposeExecArgument.java`
#### Snippet
```java

    public static DockerComposeExecArgument arguments(String... arguments) {
        return ImmutableDockerComposeExecArgument.of(Arrays.asList(arguments));
    }
}
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/execution/DockerComposeExecOption.java`
#### Snippet
```java

    public static DockerComposeExecOption options(String... options) {
        return ImmutableDockerComposeExecOption.of(Arrays.asList(options));
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/execution/DockerComposeRunArgument.java`
#### Snippet
```java

    public static DockerComposeRunArgument arguments(String... arguments) {
        return ImmutableDockerComposeRunArgument.of(Arrays.asList(arguments));
    }
}
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/execution/DockerComposeRunOption.java`
#### Snippet
```java

    public static DockerComposeRunOption options(String... options) {
        return ImmutableDockerComposeRunOption.of(Arrays.asList(options));
    }
}
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `docker-compose-rule-junit4/src/main/java/com/palantir/docker/compose/DockerComposeRule.java`
#### Snippet
```java
public abstract class DockerComposeRule extends DockerComposeManager implements TestRule {
    @Override
    public Statement apply(Statement base, Description description) {
        this.setDescription(TestDescription.builder()
                .testClass(Optional.ofNullable(description.getClassName()))
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `docker-compose-rule-core/src/main/java/com/palantir/docker/compose/connection/DockerPort.java`
#### Snippet
```java
     * Formats the docker port into a particular form.
     * <p>
     *     Example: dockerPort.inFormat("https://$HOST:$EXTERNAL_PORT/api")
     * </p>
     * Available options are:
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

