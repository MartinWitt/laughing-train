# docker-proxy-rule 
 
# Bad smells
I found 27 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnstableApiUsage | 14 | false |
| OptionalUsedAsFieldOrParameterType | 6 | false |
| NullableProblems | 3 | false |
| Deprecation | 2 | false |
| JavaReflectionMemberAccess | 2 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'imageNameOverride'
in `docker-proxy-rule-core/src/main/java/com/palantir/docker/proxy/ProjectBasedDockerContainerInfo.java`
#### Snippet
```java
            DockerExecutable docker,
            ProjectName projectName,
            Optional<String> imageNameOverride,
            Optional<String> networkNameOverride) {
        this.docker = docker;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'networkNameOverride'
in `docker-proxy-rule-core/src/main/java/com/palantir/docker/proxy/ProjectBasedDockerContainerInfo.java`
#### Snippet
```java
            ProjectName projectName,
            Optional<String> imageNameOverride,
            Optional<String> networkNameOverride) {
        this.docker = docker;
        this.projectName = projectName;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'imageNameOverride'
in `docker-proxy-rule-core/src/main/java/com/palantir/docker/proxy/ProjectBasedDockerContainerInfo.java`
#### Snippet
```java
    private final DockerExecutable docker;
    private final ProjectName projectName;
    private final Optional<String> imageNameOverride;
    private final Optional<String> networkNameOverride;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'networkNameOverride'
in `docker-proxy-rule-core/src/main/java/com/palantir/docker/proxy/ProjectBasedDockerContainerInfo.java`
#### Snippet
```java
    private final ProjectName projectName;
    private final Optional<String> imageNameOverride;
    private final Optional<String> networkNameOverride;

    public ProjectBasedDockerContainerInfo(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'imageNameOverride'
in `docker-proxy-rule-core/src/main/java/com/palantir/docker/proxy/NetworkBasedDockerContainerInfo.java`
#### Snippet
```java

    public NetworkBasedDockerContainerInfo(
            DockerExecutable docker, String networkName, Optional<String> imageNameOverride) {
        this.docker = docker;
        this.networkName = networkName;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'imageNameOverride'
in `docker-proxy-rule-core/src/main/java/com/palantir/docker/proxy/NetworkBasedDockerContainerInfo.java`
#### Snippet
```java
    private final DockerExecutable docker;
    private final String networkName;
    private final Optional<String> imageNameOverride;

    public NetworkBasedDockerContainerInfo(
```

## RuleId[id=Deprecation]
### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `docker-proxy-rule-core/src/main/java/com/palantir/docker/proxy/DockerContainerInfoUtils.java`
#### Snippet
```java
            return Splitter.on(CharMatcher.anyOf(",/")).omitEmptyStrings().splitToList(labelsString);
        } catch (IOException | InterruptedException e) {
            throw Throwables.propagate(e);
        }
    }
```

### Deprecation
'propagate(java.lang.Throwable)' is deprecated
in `docker-proxy-rule-core/src/main/java/com/palantir/docker/proxy/DockerProxyManager.java`
#### Snippet
```java
            return proxyFile;
        } catch (IOException e) {
            throw Throwables.propagate(e);
        }
    }
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `docker-proxy-rule-junit4/src/main/java/com/palantir/docker/proxy/DockerProxyRule.java`
#### Snippet
```java

    @Override
    public Statement apply(Statement base, Description _description) {
        return new Statement() {
            @Override
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `docker-proxy-rule-junit4/src/main/java/com/palantir/docker/proxy/DockerProxyRule.java`
#### Snippet
```java

    @Override
    public Statement apply(Statement base, Description _description) {
        return new Statement() {
            @Override
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `docker-proxy-rule-junit4/src/main/java/com/palantir/docker/proxy/DockerProxyRule.java`
#### Snippet
```java

    @Override
    public Statement apply(Statement base, Description _description) {
        return new Statement() {
            @Override
```

## RuleId[id=JavaReflectionMemberAccess]
### JavaReflectionMemberAccess
Cannot resolve field 'nameService'
in `docker-proxy-rule-core/src/main/java/com/palantir/docker/proxy/DockerProxyManager.java`
#### Snippet
```java
    private static Object getJava9NameService() {
        try {
            Field nameService = InetAddress.class.getDeclaredField("nameService");
            nameService.setAccessible(true);
            return nameService.get(null);
```

### JavaReflectionMemberAccess
Cannot resolve field 'nameService'
in `docker-proxy-rule-core/src/main/java/com/palantir/docker/proxy/DockerProxyManager.java`
#### Snippet
```java
    private static void setJava9NameService(Object newNameService) {
        try {
            Field nameService = InetAddress.class.getDeclaredField("nameService");
            nameService.setAccessible(true);
            nameService.set(null, newNameService);
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'splitToList(java.lang.CharSequence)' is marked unstable with @Beta
in `docker-proxy-rule-core/src/main/java/com/palantir/docker/proxy/DockerContainerInfoUtils.java`
#### Snippet
```java
                    networkName));

            return Splitter.on(',').omitEmptyStrings().splitToList(containersOnNetworkString);
        } catch (InterruptedException | IOException | RuntimeException e) {
            throw new IllegalStateException("Unable to find the container IDs on the network " + networkName, e);
```

### UnstableApiUsage
'splitToList(java.lang.CharSequence)' is marked unstable with @Beta
in `docker-proxy-rule-core/src/main/java/com/palantir/docker/proxy/DockerContainerInfoUtils.java`
#### Snippet
```java
            String labelsString = Iterables.getOnlyElement(
                    runDockerProcess(docker, "inspect", "--format", labelsFormat, containerId));
            return Splitter.on(CharMatcher.anyOf(",/")).omitEmptyStrings().splitToList(labelsString);
        } catch (IOException | InterruptedException e) {
            throw Throwables.propagate(e);
```

### UnstableApiUsage
'com.google.common.net.InetAddresses' is marked unstable with @Beta
in `docker-proxy-rule-core/src/main/java/com/palantir/docker/proxy/DockerContainerInfoUtils.java`
#### Snippet
```java
            }

            Preconditions.checkState(InetAddresses.isInetAddress(ip), "IP address is not valid: %s", ip);
            return Optional.of(ip);
        } catch (InterruptedException | IOException | RuntimeException e) {
```

### UnstableApiUsage
'isInetAddress(java.lang.String)' is declared in unstable class 'com.google.common.net.InetAddresses' marked with @Beta
in `docker-proxy-rule-core/src/main/java/com/palantir/docker/proxy/DockerContainerInfoUtils.java`
#### Snippet
```java
            }

            Preconditions.checkState(InetAddresses.isInetAddress(ip), "IP address is not valid: %s", ip);
            return Optional.of(ip);
        } catch (InterruptedException | IOException | RuntimeException e) {
```

### UnstableApiUsage
'com.google.common.io.CharStreams' is marked unstable with @Beta
in `docker-proxy-rule-core/src/main/java/com/palantir/docker/proxy/DockerContainerInfoUtils.java`
#### Snippet
```java
    private static List<String> getLinesFromInputStream(InputStream inputStream) throws IOException {
        try (InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8)) {
            return CharStreams.readLines(inputStreamReader);
        }
    }
```

### UnstableApiUsage
'readLines(java.lang.Readable)' is declared in unstable class 'com.google.common.io.CharStreams' marked with @Beta
in `docker-proxy-rule-core/src/main/java/com/palantir/docker/proxy/DockerContainerInfoUtils.java`
#### Snippet
```java
    private static List<String> getLinesFromInputStream(InputStream inputStream) throws IOException {
        try (InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8)) {
            return CharStreams.readLines(inputStreamReader);
        }
    }
```

### UnstableApiUsage
'com.google.common.io.Resources' is marked unstable with @Beta
in `docker-proxy-rule-core/src/main/java/com/palantir/docker/proxy/DockerProxyManager.java`
#### Snippet
```java
            File proxyFile = File.createTempFile("proxy", ".yml");
            String proxyConfig =
                    Resources.toString(Resources.getResource("docker-compose.proxy.yml"), StandardCharsets.UTF_8);
            Files.write(
                    proxyConfig.replace("{{NETWORK_NAME}}", networkName).replace("{{IMAGE_NAME}}", imageName),
```

### UnstableApiUsage
'toString(java.net.URL, java.nio.charset.Charset)' is declared in unstable class 'com.google.common.io.Resources' marked with @Beta
in `docker-proxy-rule-core/src/main/java/com/palantir/docker/proxy/DockerProxyManager.java`
#### Snippet
```java
            File proxyFile = File.createTempFile("proxy", ".yml");
            String proxyConfig =
                    Resources.toString(Resources.getResource("docker-compose.proxy.yml"), StandardCharsets.UTF_8);
            Files.write(
                    proxyConfig.replace("{{NETWORK_NAME}}", networkName).replace("{{IMAGE_NAME}}", imageName),
```

### UnstableApiUsage
'com.google.common.io.Resources' is marked unstable with @Beta
in `docker-proxy-rule-core/src/main/java/com/palantir/docker/proxy/DockerProxyManager.java`
#### Snippet
```java
            File proxyFile = File.createTempFile("proxy", ".yml");
            String proxyConfig =
                    Resources.toString(Resources.getResource("docker-compose.proxy.yml"), StandardCharsets.UTF_8);
            Files.write(
                    proxyConfig.replace("{{NETWORK_NAME}}", networkName).replace("{{IMAGE_NAME}}", imageName),
```

### UnstableApiUsage
'getResource(java.lang.String)' is declared in unstable class 'com.google.common.io.Resources' marked with @Beta
in `docker-proxy-rule-core/src/main/java/com/palantir/docker/proxy/DockerProxyManager.java`
#### Snippet
```java
            File proxyFile = File.createTempFile("proxy", ".yml");
            String proxyConfig =
                    Resources.toString(Resources.getResource("docker-compose.proxy.yml"), StandardCharsets.UTF_8);
            Files.write(
                    proxyConfig.replace("{{NETWORK_NAME}}", networkName).replace("{{IMAGE_NAME}}", imageName),
```

### UnstableApiUsage
'com.google.common.io.Files' is marked unstable with @Beta
in `docker-proxy-rule-core/src/main/java/com/palantir/docker/proxy/DockerProxyManager.java`
#### Snippet
```java
            String proxyConfig =
                    Resources.toString(Resources.getResource("docker-compose.proxy.yml"), StandardCharsets.UTF_8);
            Files.write(
                    proxyConfig.replace("{{NETWORK_NAME}}", networkName).replace("{{IMAGE_NAME}}", imageName),
                    proxyFile,
```

### UnstableApiUsage
'write(java.lang.CharSequence, java.io.File, java.nio.charset.Charset)' is declared in unstable class 'com.google.common.io.Files' marked with @Beta
in `docker-proxy-rule-core/src/main/java/com/palantir/docker/proxy/DockerProxyManager.java`
#### Snippet
```java
            String proxyConfig =
                    Resources.toString(Resources.getResource("docker-compose.proxy.yml"), StandardCharsets.UTF_8);
            Files.write(
                    proxyConfig.replace("{{NETWORK_NAME}}", networkName).replace("{{IMAGE_NAME}}", imageName),
                    proxyFile,
```

### UnstableApiUsage
'com.google.common.net.InetAddresses' is marked unstable with @Beta
in `docker-proxy-rule-core/src/main/java/com/palantir/docker/proxy/DockerNameService.java`
#### Snippet
```java

        if (containerIp.isPresent()) {
            return new InetAddress[] {InetAddresses.forString(containerIp.get())};
        }
        throw new UnknownHostException(hostname);
```

### UnstableApiUsage
'forString(java.lang.String)' is declared in unstable class 'com.google.common.net.InetAddresses' marked with @Beta
in `docker-proxy-rule-core/src/main/java/com/palantir/docker/proxy/DockerNameService.java`
#### Snippet
```java

        if (containerIp.isPresent()) {
            return new InetAddress[] {InetAddresses.forString(containerIp.get())};
        }
        throw new UnknownHostException(hostname);
```

