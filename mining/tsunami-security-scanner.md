# tsunami-security-scanner 
 
# Bad smells
I found 158 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnstableApiUsage | 66 | false |
| JavadocReference | 34 | false |
| JavadocLinkAsPlainText | 16 | false |
| NullableProblems | 10 | false |
| OptionalUsedAsFieldOrParameterType | 9 | false |
| SimplifyOptionalCallChains | 4 | false |
| OptionalGetWithoutIsPresent | 4 | false |
| UNCHECKED_WARNING | 2 | false |
| UnnecessarySemicolon | 2 | false |
| CharsetObjectCanBeUsed | 1 | false |
| OptionalIsPresent | 1 | false |
| RedundantMethodOverride | 1 | false |
| UnnecessaryModifier | 1 | true |
| IfStatementWithIdenticalBranches | 1 | false |
| DataFlowIssue | 1 | false |
| RedundantCast | 1 | false |
| JavadocDeclaration | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| StringBufferReplaceableByString | 1 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'callbackServer'
in `plugin/src/main/java/com/google/tsunami/plugin/payload/testing/FakePayloadGeneratorModule.java`
#### Snippet
```java
   */
  FakePayloadGeneratorModule(
      Optional<MockWebServer> callbackServer, Optional<SecureRandom> secureRng) {

    this.tcsConfig.callbackAddress = callbackServer.map(c -> c.getHostName()).orElse(null);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'secureRng'
in `plugin/src/main/java/com/google/tsunami/plugin/payload/testing/FakePayloadGeneratorModule.java`
#### Snippet
```java
   */
  FakePayloadGeneratorModule(
      Optional<MockWebServer> callbackServer, Optional<SecureRandom> secureRng) {

    this.tcsConfig.callbackAddress = callbackServer.map(c -> c.getHostName()).orElse(null);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'input'
in `plugin/src/main/java/com/google/tsunami/plugin/payload/Validator.java`
#### Snippet
```java
   * @return whether a payload is executed on the scan target.
   */
  boolean isExecuted(Optional<ByteString> input);
}

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'bodyBytes'
in `common/src/main/java/com/google/tsunami/common/net/http/HttpResponse.java`
#### Snippet
```java
    public abstract Builder setHeaders(HttpHeaders httpHeaders);
    public abstract Builder setBodyBytes(ByteString bodyBytes);
    public abstract Builder setBodyBytes(Optional<ByteString> bodyBytes);
    public abstract Builder setResponseUrl(HttpUrl url);
    public abstract Builder setResponseUrl(Optional<HttpUrl> url);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'url'
in `common/src/main/java/com/google/tsunami/common/net/http/HttpResponse.java`
#### Snippet
```java
    public abstract Builder setBodyBytes(Optional<ByteString> bodyBytes);
    public abstract Builder setResponseUrl(HttpUrl url);
    public abstract Builder setResponseUrl(Optional<HttpUrl> url);

    public abstract HttpResponse build();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'requestBody'
in `common/src/main/java/com/google/tsunami/common/net/http/HttpRequest.java`
#### Snippet
```java
    public abstract Builder setHeaders(HttpHeaders httpHeaders);
    public abstract Builder setRequestBody(ByteString requestBody);
    public abstract Builder setRequestBody(Optional<ByteString> requestBody);

    public Builder withEmptyHeaders() {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'serviceName'
in `common/src/main/java/com/google/tsunami/common/data/NetworkServiceUtils.java`
#### Snippet
```java
  private NetworkServiceUtils() {}

  public static boolean isWebService(Optional<String> serviceName) {
    return serviceName.isPresent()
        && IS_PLAIN_HTTP_BY_KNOWN_WEB_SERVICE_NAME.containsKey(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'input'
in `plugin/src/main/java/com/google/tsunami/plugin/payload/Payload.java`
#### Snippet
```java
   * @return whether this payload is executed on the scan target.
   */
  public final boolean checkIfExecuted(Optional<ByteString> input) {
    return this.validator.isExecuted(input);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'defaultParameter'
in `common/src/main/java/com/google/tsunami/common/net/FuzzingUtils.java`
#### Snippet
```java
      HttpRequest request,
      String payload,
      Optional<String> defaultParameter,
      ImmutableSet<FuzzingModifier> modifiers) {
    URI parsedUrl = URI.create(request.url());
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
UTF_8 can be used instead
in `common/src/main/java/com/google/tsunami/common/net/UrlUtils.java`
#### Snippet
```java
  public static Optional<String> urlEncode(String raw) {
    try {
      return Optional.of(URLEncoder.encode(raw, UTF_8.toString()));
    } catch (UnsupportedEncodingException e) {
      return Optional.empty();
```

## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `plugin/src/main/java/com/google/tsunami/plugin/TcsClient.java`
#### Snippet
```java
    Optional<PollingResult> result = sendPollingRequest(secretString);

    if (result.isPresent()) {
      // In the future we may refactor hasOobLog() to return finer grained info about what kind
      // of oob is logged
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `configure()` is identical to its super method
in `main/src/main/java/com/google/tsunami/main/cli/ScanResultsArchiverModule.java`
#### Snippet
```java

  @Override
  protected void configure() {
  }
}
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `common/src/main/java/com/google/tsunami/common/net/db/ConnectionProviderInterface.java`
#### Snippet
```java
/** A client interface that communicates with different databases. */
public interface ConnectionProviderInterface {
  public Connection getConnection(String url, String user, String password) throws SQLException;
}

```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'com.google.common.collect.ImmutableList', required 'com.google.common.collect.ImmutableList'
in `plugin/src/main/java/com/google/tsunami/plugin/testing/FailedRemoteVulnDetector.java`
#### Snippet
```java

  @Override
  public ImmutableList<PluginDefinition> getAllPlugins() {
    return ImmutableList.of(PluginDefinition.getDefaultInstance());
  }
```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'com.google.common.collect.ImmutableList', required 'com.google.common.collect.ImmutableList'
in `plugin/src/main/java/com/google/tsunami/plugin/testing/FakeRemoteVulnDetector.java`
#### Snippet
```java

  @Override
  public ImmutableList<PluginDefinition> getAllPlugins() {
    return ImmutableList.of(
        PluginDefinition.newBuilder()
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `main/src/main/java/com/google/tsunami/main/cli/TsunamiCli.java`
#### Snippet
```java
        return ImmutableList.of();
      }
      if (tsunamiConfig.getRawConfigData().isEmpty()) {
        for (int i = 0; i < paths.size(); ++i) {
          commands.add(
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `DetectionReportList`
in `plugin/src/main/java/com/google/tsunami/plugin/VulnDetector.java`
#### Snippet
```java
   * @param matchedServices a list of network services whose vulnerabilities could be detected by
   *     this plugin
   * @return a {@link DetectionReportList} for all the vulnerabilities of the scanning target.
   */
  DetectionReportList detect(
```

### JavadocReference
Cannot resolve symbol `NetworkEndpoint`
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java

  /**
   * Creates a {@link NetworkEndpoint} proto buffer object from the given ip address.
   *
   * @param ipAddress the IP address of the network endpoint.
```

### JavadocReference
Cannot resolve symbol `NetworkEndpoint`
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java
   *
   * @param ipAddress the IP address of the network endpoint.
   * @return the created {@link NetworkEndpoint} instance from the given IP address.
   */
  public static NetworkEndpoint forIp(String ipAddress) {
```

### JavadocReference
Cannot resolve symbol `NetworkEndpoint`
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java

  /**
   * Converts the given {@link NetworkEndpoint} to its uri authority representation.
   *
   * <p>For example:
```

### JavadocReference
Cannot resolve symbol `NetworkEndpoint`
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java
   * </ul>
   *
   * @param networkEndpoint the {@link NetworkEndpoint} instance to be converted.
   * @return the URI authority converted from the {@link NetworkEndpoint} instance.
   */
```

### JavadocReference
Cannot resolve symbol `NetworkEndpoint`
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java
   *
   * @param networkEndpoint the {@link NetworkEndpoint} instance to be converted.
   * @return the URI authority converted from the {@link NetworkEndpoint} instance.
   */
  public static String toUriAuthority(NetworkEndpoint networkEndpoint) {
```

### JavadocReference
Cannot resolve symbol `NetworkEndpoint`
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java
import java.net.InetAddress;

/** Static utility methods pertaining to {@link NetworkEndpoint} proto buffer. */
public final class NetworkEndpointUtils {
  public static final int MAX_PORT_NUMBER = 65535;
```

### JavadocReference
Cannot resolve symbol `NetworkEndpoint`
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java

  /**
   * Returns a {@link NetworkEndpoint} proto buffer object from the given ip address, hostname and
   * port.
   *
```

### JavadocReference
Cannot resolve symbol `NetworkEndpoint`
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java
   * @param hostname the hostname of the network endpoint
   * @param port the port number of the network endpoint.
   * @return the created {@link NetworkEndpoint} instance from the parameters.
   */
  public static NetworkEndpoint forIpHostnameAndPort(String ipAddress, String hostname, int port) {
```

### JavadocReference
Cannot resolve symbol `NetworkEndpoint`
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java

  /**
   * Creates a {@link NetworkEndpoint} proto buffer object from the given hostname.
   *
   * @param hostname the hostname of the network endpoint
```

### JavadocReference
Cannot resolve symbol `NetworkEndpoint`
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java
   *
   * @param hostname the hostname of the network endpoint
   * @return the created {@link NetworkEndpoint} instance from the hostname.
   */
  public static NetworkEndpoint forHostname(String hostname) {
```

### JavadocReference
Cannot resolve symbol `NetworkEndpoint`
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java

  /**
   * Creates a {@link NetworkEndpoint} proto buffer object from the given ip address and hostname.
   *
   * @param hostname the hostname of the network endpoint
```

### JavadocReference
Cannot resolve symbol `NetworkEndpoint`
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java
   * @param hostname the hostname of the network endpoint
   * @param ipAddress the IP address of the network endpoint.
   * @return the created {@link NetworkEndpoint} instance from the IP address and hostname.
   */
  public static NetworkEndpoint forIpAndHostname(String ipAddress, String hostname) {
```

### JavadocReference
Cannot resolve symbol `NetworkEndpoint`
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java

  /**
   * Creates a {@link NetworkEndpoint} proto buffer object from the given hostname and port.
   *
   * @param hostname the hostname of the network endpoint
```

### JavadocReference
Cannot resolve symbol `NetworkEndpoint`
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java
   * @param hostname the hostname of the network endpoint
   * @param port the port number of the network endpoint.
   * @return the created {@link NetworkEndpoint} instance from the hostname and port.
   */
  public static NetworkEndpoint forHostnameAndPort(String hostname, int port) {
```

### JavadocReference
Cannot resolve symbol `NetworkEndpoint`
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java

  /**
   * Returns a {@link NetworkEndpoint} proto buffer object from the given {@code networkEndpoint}
   * and port. The {@code networkEndpoint} parameter cannot contain any port information, otherwise
   * {@link IllegalArgumentException} is thrown.
```

### JavadocReference
Cannot resolve symbol `NetworkEndpoint`
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java
   * {@link IllegalArgumentException} is thrown.
   *
   * @param networkEndpoint the source {@link NetworkEndpoint} instance without the port number
   * @param port the port number of the network endpoint.
   * @return the {@link NetworkEndpoint} instance from the parameters.
```

### JavadocReference
Cannot resolve symbol `NetworkEndpoint`
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java
   * @param networkEndpoint the source {@link NetworkEndpoint} instance without the port number
   * @param port the port number of the network endpoint.
   * @return the {@link NetworkEndpoint} instance from the parameters.
   */
  public static NetworkEndpoint forNetworkEndpointAndPort(
```

### JavadocReference
Cannot resolve symbol `NetworkEndpoint`
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java

  /**
   * Creates a {@link NetworkEndpoint} proto buffer object from the given ip address and port.
   *
   * @param ipAddress the IP address of the network endpoint.
```

### JavadocReference
Cannot resolve symbol `NetworkEndpoint`
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java
   * @param ipAddress the IP address of the network endpoint.
   * @param port the port number of the network endpoint
   * @return the created {@link NetworkEndpoint} instance from the given IP and port.
   */
  public static NetworkEndpoint forIpAndPort(String ipAddress, int port) {
```

### JavadocReference
Cannot resolve symbol `NetworkService`
in `common/src/main/java/com/google/tsunami/common/net/http/HttpClient.java`
#### Snippet
```java
   *
   * @param httpRequest the HTTP request to be sent by this client.
   * @param networkService the {@link NetworkService} proto to be used for the HOST header.
   * @return the future for the response to be returned from the HTTP server.
   */
```

### JavadocReference
Cannot resolve symbol `NetworkService`
in `common/src/main/java/com/google/tsunami/common/net/http/HttpClient.java`
#### Snippet
```java
   *
   * @param httpRequest the HTTP request to be sent by this client.
   * @param networkService the {@link NetworkService} proto to be used for the HOST header.
   * @return the response returned from the HTTP server.
   * @throws IOException if an I/O error occurs during the HTTP request.
```

### JavadocReference
Cannot resolve symbol `com.google.tsunami.proto.PayloadGeneratorConfig`
in `plugin/src/main/java/com/google/tsunami/plugin/payload/NotImplementedException.java`
#### Snippet
```java

/**
 * Thrown whenever a {@link com.google.tsunami.proto.PayloadGeneratorConfig} results in a
 * combination that does not have a payload.
 *
```

### JavadocReference
Cannot resolve symbol `PayloadGeneratorConfig`
in `plugin/src/main/java/com/google/tsunami/plugin/payload/PayloadGenerator.java`
#### Snippet
```java

  /**
   * Returns a {@link Payload} for a given {@link PayloadGeneratorConfig}.
   *
   * <p>The framework prioritizes finding a callback server payload if callback server is enabled
```

### JavadocReference
Cannot resolve symbol `PortScanningReport`
in `plugin/src/main/java/com/google/tsunami/plugin/PortScanner.java`
#### Snippet
```java
   *
   * @param scanTarget the target to be scanned.
   * @return a {@link PortScanningReport} that captures the full port scanning results.
   */
  PortScanningReport scan(ScanTarget scanTarget);
```

### JavadocReference
Cannot resolve symbol `FingerprintingReport`
in `plugin/src/main/java/com/google/tsunami/plugin/ServiceFingerprinter.java`
#### Snippet
```java
   * @param targetInfo information about the target to be scanned.
   * @param networkService information about the specific network service to be fingerprinted.
   * @return a {@link FingerprintingReport} that captures all the details about the targeted
   *     service.
   */
```

### JavadocReference
Cannot resolve symbol `NetworkService`
in `common/src/main/java/com/google/tsunami/common/data/NetworkServiceUtils.java`
#### Snippet
```java
import java.util.Optional;

/** Static utility methods pertaining to {@link NetworkService} proto buffer. */
public final class NetworkServiceUtils {
  // Service names are those described in [RFC6335].
```

### JavadocReference
Cannot resolve symbol `MatchedPlugin`
in `plugin/src/main/java/com/google/tsunami/plugin/RemoteVulnDetector.java`
#### Snippet
```java

  /**
   * Add a {@link MatchedPlugin} to allow this {@link RemoteVulnDetector} to run detection for this
   * plugin through the language server.
   *
```

### JavadocReference
Cannot resolve symbol `PluginDefinition`
in `plugin/src/main/java/com/google/tsunami/plugin/testing/FakeRemoteVulnDetector.java`
#### Snippet
```java

/**
 * Fake {@link RemoteVulnDetector} implementation that only contains one {@link PluginDefinition}
 * proto available to run.
 */
```

### JavadocReference
Cannot resolve symbol `NetworkService`
in `common/src/main/java/com/google/tsunami/common/net/http/OkHttpHttpClient.java`
#### Snippet
```java
   *
   * @param httpRequest the HTTP request to be sent by this client.
   * @param networkService the {@link NetworkService} proto to be used for the HOST header.
   * @return the response returned from the HTTP server.
   * @throws IOException if an I/O error occurs during the HTTP request.
```

### JavadocReference
Cannot resolve symbol `NetworkService`
in `common/src/main/java/com/google/tsunami/common/net/http/OkHttpHttpClient.java`
#### Snippet
```java
   *
   * @param httpRequest the HTTP request to be sent by this client.
   * @param networkService the {@link NetworkService} proto to be used for the HOST header.
   * @return the future for the response to be returned from the HTTP server.
   */
```

### JavadocReference
Cannot resolve symbol `PayloadAttributes`
in `plugin/src/main/java/com/google/tsunami/plugin/payload/Payload.java`
#### Snippet
```java
   * Get additional attributes about this payload.
   *
   * @return the {@link PayloadAttributes} about this payload
   */
  public final PayloadAttributes getPayloadAttributes() {
```

### JavadocReference
Cannot resolve symbol `NetworkService`
in `plugin/src/main/java/com/google/tsunami/plugin/PluginManager.java`
#### Snippet
```java

  /**
   * Retrieves a {@link ServiceFingerprinter} plugin for the given {@link NetworkService}.
   *
   * @param networkService the target {@link NetworkService} to be fingerprinted.
```

### JavadocReference
Cannot resolve symbol `NetworkService`
in `plugin/src/main/java/com/google/tsunami/plugin/PluginManager.java`
#### Snippet
```java
   * Retrieves a {@link ServiceFingerprinter} plugin for the given {@link NetworkService}.
   *
   * @param networkService the target {@link NetworkService} to be fingerprinted.
   * @return the matched {@link ServiceFingerprinter} plugin for the given network service.
   */
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `common/src/main/java/com/google/tsunami/common/net/http/HttpRequest.java`
#### Snippet
```java
        case HEAD:
          checkState(
              !httpRequest.requestBody().isPresent(),
              "A request body is not allowed for HTTP GET/HEAD request");
          break;
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `workflow/src/main/java/com/google/tsunami/workflow/DefaultScanningWorkflow.java`
#### Snippet
```java
      throws ScanningWorkflowException {
    Optional<PluginMatchingResult<PortScanner>> matchedPortScanner = pluginManager.getPortScanner();
    if (!matchedPortScanner.isPresent()) {
      return immediateFailedFuture(
          new ScanningWorkflowException("At least one PortScanner plugin is required"));
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `plugin/src/main/java/com/google/tsunami/plugin/PluginManager.java`
#### Snippet
```java
      ReconnaissanceReport reconnaissanceReport) {
    List<NetworkService> matchedNetworkServices;
    if (!pluginDefinition.targetServiceName().isPresent()
        && !pluginDefinition.targetSoftware().isPresent()
        && !pluginDefinition.isForWebService()) {
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `plugin/src/main/java/com/google/tsunami/plugin/PluginManager.java`
#### Snippet
```java
    List<NetworkService> matchedNetworkServices;
    if (!pluginDefinition.targetServiceName().isPresent()
        && !pluginDefinition.targetSoftware().isPresent()
        && !pluginDefinition.isForWebService()) {
      // No filtering annotation applied, just match all network services from reconnaissance.
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `common/src/main/java/com/google/tsunami/common/ErrorCode.java`
#### Snippet
```java
  LANGUAGE_SERVER_ERROR,

  UNKNOWN;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `common/src/main/java/com/google/tsunami/common/net/FuzzingUtils.java`
#### Snippet
```java

  enum FuzzingModifier {
    FUZZING_PATHS;
  }

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `scanResults` might be null
in `workflow/src/main/java/com/google/tsunami/workflow/DefaultScanningWorkflow.java`
#### Snippet
```java
        .transform(
            scanResults -> {
              logger.atInfo().log("%s", executionTracer.buildLoggableExecutionTrace(scanResults));
              return scanResults;
            },
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `(Optional` input) -> {...} to `Validator` is redundant
in `plugin/src/main/java/com/google/tsunami/plugin/payload/PayloadGenerator.java`
#### Snippet
```java
              p.getValidationRegex().getValue().replace(TOKEN_RANDOM_STRING, secret);
          v =
              (Validator)
                  (Optional<ByteString> input) ->
                      input.map(i -> i.toStringUtf8().matches(processedRegex)).orElse(false);
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Javadoc pointing to itself
in `common/src/main/java/com/google/tsunami/common/version/Version.java`
#### Snippet
```java
   * Version#equals(Object)} method, i.e. this.compareTo(that) == 0 does not imply
   * this.equals(that). The reason is that the raw version string is tokenized and certain tokens
   * are ignored. Tokenized strings are used for {@link #compareTo} comparison while raw version
   * string is used for {@link #equals} comparison. Be careful when using {@link Version} object in
   * collections like {@code HashMap} or {@code TreeMap}.
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `matchedPluginsToRun` are updated, but never queried
in `plugin/src/main/java/com/google/tsunami/plugin/testing/FailedRemoteVulnDetector.java`
#### Snippet
```java
public final class FailedRemoteVulnDetector implements RemoteVulnDetector {

  private final Set<MatchedPlugin> matchedPluginsToRun;

  public FailedRemoteVulnDetector() {
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `plugin/src/main/java/com/google/tsunami/plugin/payload/PayloadGenerator.java`
#### Snippet
```java
      String payloadString = p.getPayloadString().getValue().replace(TOKEN_RANDOM_STRING, secret);
      Validator v;
      switch (p.getValidationType()) {
        case VALIDATION_REGEX:
          String processedRegex =
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `workflow/src/main/java/com/google/tsunami/workflow/ExecutionTracer.java`
#### Snippet
```java
  String buildLoggableExecutionTrace(ScanResults scanResults) {
    checkState(isDone());
    return new StringBuilder("Tsunami scanning workflow traces:\n")
        // Port scanning phase.
        .append(
```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `common/src/main/java/com/google/tsunami/common/concurrent/ThreadPoolModule.java`
#### Snippet
```java
      extends BaseThreadPoolModuleBuilder<ListeningExecutorService, Builder> {
    private int queueCapacity = Integer.MAX_VALUE;
    private @Nullable BlockingQueue<Runnable> blockingQueue;

    public Builder() {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/google/tsunami/common/version/Token.java`
#### Snippet
```java

  @Override
  public int compareTo(Token other) {
    // Empty tokens are always the same.
    if (this.isEmptyToken() && other.isEmptyToken()) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `common/src/main/java/com/google/tsunami/common/concurrent/BaseThreadPoolModule.java`
#### Snippet
```java
  private final int coreSize;
  private final long keepAliveSeconds;
  private final @Nullable Duration shutdownDelay;
  private final Key<ExecutorServiceT> key;
  private final Class<ExecutorServiceT> executorServiceTypeClass;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `common/src/main/java/com/google/tsunami/common/version/Version.java`
#### Snippet
```java
   */
  @Override
  public int compareTo(Version other) {
    if ((this.isMinimum() && other.isMinimum()) || (this.isMaximum() && other.isMaximum())) {
      return 0;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `common/src/main/java/com/google/tsunami/common/command/CommandExecutor.java`
#### Snippet
```java
  private Process process;
  @Nullable private String output;
  @Nullable private String error;

  public CommandExecutor(String... args) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `common/src/main/java/com/google/tsunami/common/command/CommandExecutor.java`
#### Snippet
```java
  private final String[] args;
  private Process process;
  @Nullable private String output;
  @Nullable private String error;

```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `common/src/main/java/com/google/tsunami/common/net/http/OkHttpHttpClient.java`
#### Snippet
```java
          new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
              responseFuture.setException(e);
            }
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `common/src/main/java/com/google/tsunami/common/net/http/OkHttpHttpClient.java`
#### Snippet
```java
          new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
              responseFuture.setException(e);
            }
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `common/src/main/java/com/google/tsunami/common/net/http/OkHttpHttpClient.java`
#### Snippet
```java

            @Override
            public void onResponse(Call call, Response response) {
              try (ResponseBody unused = response.body()) {
                responseFuture.set(parseResponse(response));
```

### NullableProblems
Not annotated parameter overrides @EverythingIsNonNull parameter
in `common/src/main/java/com/google/tsunami/common/net/http/OkHttpHttpClient.java`
#### Snippet
```java

            @Override
            public void onResponse(Call call, Response response) {
              try (ResponseBody unused = response.body()) {
                responseFuture.set(parseResponse(response));
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `common/src/main/java/com/google/tsunami/common/net/UrlUtils.java`
#### Snippet
```java
   *
   * <ul>
   *   <li>given <code>"http://localhost/"</code>, it returns <code>["http://localhost/"]</code>
   *   <li>given <code>"http://localhost/a/b/"</code>, it returns <code>
   *       ["http://localhost/", "http://localhost/a/", "http://localhost/a/b/"]</code>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `common/src/main/java/com/google/tsunami/common/net/UrlUtils.java`
#### Snippet
```java
   *
   * <ul>
   *   <li>given <code>"http://localhost/"</code>, it returns <code>["http://localhost/"]</code>
   *   <li>given <code>"http://localhost/a/b/"</code>, it returns <code>
   *       ["http://localhost/", "http://localhost/a/", "http://localhost/a/b/"]</code>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `common/src/main/java/com/google/tsunami/common/net/UrlUtils.java`
#### Snippet
```java
   * <ul>
   *   <li>given <code>"http://localhost/"</code>, it returns <code>["http://localhost/"]</code>
   *   <li>given <code>"http://localhost/a/b/"</code>, it returns <code>
   *       ["http://localhost/", "http://localhost/a/", "http://localhost/a/b/"]</code>
   * </ul>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `common/src/main/java/com/google/tsunami/common/net/UrlUtils.java`
#### Snippet
```java
   *   <li>given <code>"http://localhost/"</code>, it returns <code>["http://localhost/"]</code>
   *   <li>given <code>"http://localhost/a/b/"</code>, it returns <code>
   *       ["http://localhost/", "http://localhost/a/", "http://localhost/a/b/"]</code>
   * </ul>
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `common/src/main/java/com/google/tsunami/common/net/UrlUtils.java`
#### Snippet
```java
   *   <li>given <code>"http://localhost/"</code>, it returns <code>["http://localhost/"]</code>
   *   <li>given <code>"http://localhost/a/b/"</code>, it returns <code>
   *       ["http://localhost/", "http://localhost/a/", "http://localhost/a/b/"]</code>
   * </ul>
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `common/src/main/java/com/google/tsunami/common/net/UrlUtils.java`
#### Snippet
```java
   *   <li>given <code>"http://localhost/"</code>, it returns <code>["http://localhost/"]</code>
   *   <li>given <code>"http://localhost/a/b/"</code>, it returns <code>
   *       ["http://localhost/", "http://localhost/a/", "http://localhost/a/b/"]</code>
   * </ul>
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `common/src/main/java/com/google/tsunami/common/net/UrlUtils.java`
#### Snippet
```java
   *
   * <ul>
   *   <li>given <code>"http://localhost/"</code>, it returns <code>["http://localhost/"]</code>
   *   <li>given <code>"http://localhost/a/b/"</code>, it returns <code>
   *       ["http://localhost/", "http://localhost/a/", "http://localhost/a/b/"]</code>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `common/src/main/java/com/google/tsunami/common/net/UrlUtils.java`
#### Snippet
```java
   *
   * <ul>
   *   <li>given <code>"http://localhost/"</code>, it returns <code>["http://localhost/"]</code>
   *   <li>given <code>"http://localhost/a/b/"</code>, it returns <code>
   *       ["http://localhost/", "http://localhost/a/", "http://localhost/a/b/"]</code>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `common/src/main/java/com/google/tsunami/common/net/UrlUtils.java`
#### Snippet
```java
   * <ul>
   *   <li>given <code>"http://localhost/"</code>, it returns <code>["http://localhost/"]</code>
   *   <li>given <code>"http://localhost/a/b/"</code>, it returns <code>
   *       ["http://localhost/", "http://localhost/a/", "http://localhost/a/b/"]</code>
   * </ul>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `common/src/main/java/com/google/tsunami/common/net/UrlUtils.java`
#### Snippet
```java
   *   <li>given <code>"http://localhost/"</code>, it returns <code>["http://localhost/"]</code>
   *   <li>given <code>"http://localhost/a/b/"</code>, it returns <code>
   *       ["http://localhost/", "http://localhost/a/", "http://localhost/a/b/"]</code>
   * </ul>
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `common/src/main/java/com/google/tsunami/common/net/UrlUtils.java`
#### Snippet
```java
   *   <li>given <code>"http://localhost/"</code>, it returns <code>["http://localhost/"]</code>
   *   <li>given <code>"http://localhost/a/b/"</code>, it returns <code>
   *       ["http://localhost/", "http://localhost/a/", "http://localhost/a/b/"]</code>
   * </ul>
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `common/src/main/java/com/google/tsunami/common/net/UrlUtils.java`
#### Snippet
```java
   *   <li>given <code>"http://localhost/"</code>, it returns <code>["http://localhost/"]</code>
   *   <li>given <code>"http://localhost/a/b/"</code>, it returns <code>
   *       ["http://localhost/", "http://localhost/a/", "http://localhost/a/b/"]</code>
   * </ul>
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `common/src/main/java/com/google/tsunami/common/net/http/HttpClientConfigProperties.java`
#### Snippet
```java
  /**
   * The timeout in seconds for complete HTTP calls. See
   * https://square.github.io/okhttp/4.x/okhttp/okhttp3/-ok-http-client/-builder/call-timeout/ for
   * more details.
   */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `common/src/main/java/com/google/tsunami/common/net/http/HttpClientConfigProperties.java`
#### Snippet
```java
  /**
   * The timeout in seconds for new HTTP connections. See
   * https://square.github.io/okhttp/4.x/okhttp/okhttp3/-ok-http-client/-builder/connect-timeout/
   * for more details.
   */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `common/src/main/java/com/google/tsunami/common/net/http/HttpClientConfigProperties.java`
#### Snippet
```java
  /**
   * The timeout in seconds for the read operations for HTTP connections. See
   * https://square.github.io/okhttp/4.x/okhttp/okhttp3/-ok-http-client/-builder/read-timeout/ for
   * more details.
   */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `common/src/main/java/com/google/tsunami/common/net/http/HttpClientConfigProperties.java`
#### Snippet
```java
  /**
   * The timeout in seconds for the write operations for HTTP connections. See
   * https://square.github.io/okhttp/4.x/okhttp/okhttp3/-ok-http-client/-builder/write-timeout/ for
   * more details.
   */
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `plugin/src/main/java/com/google/tsunami/plugin/TcsClient.java`
#### Snippet
```java
      if (response.status().isSuccess()) {
        PollingResult.Builder result = PollingResult.newBuilder();
        jsonParser.merge(response.bodyString().get(), result);
        return Optional.of(result.build());
      } else {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `workflow/src/main/java/com/google/tsunami/workflow/DefaultScanningWorkflow.java`
#### Snippet
```java

    Optional<PluginMatchingResult<PortScanner>> matchedPortScanner = pluginManager.getPortScanner();
    executionTracer.startPortScanning(ImmutableList.of(matchedPortScanner.get()));

    NetworkService networkService = scanTarget.getNetworkService();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `workflow/src/main/java/com/google/tsunami/workflow/DefaultScanningWorkflow.java`
#### Snippet
```java
            result ->
                result.isSucceeded()
                    ? result.resultData().get().getNetworkServicesList().stream()
                    : ((List<NetworkService>)
                            result.executorConfig().matchedPlugin().matchedServices())
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `workflow/src/main/java/com/google/tsunami/workflow/DefaultScanningWorkflow.java`
#### Snippet
```java
            .flatMap(
                detectionResult ->
                    detectionResult.resultData().get().getDetectionReportsList().stream())
            .collect(toImmutableList());
    ImmutableList<String> failedPlugins =
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'addDelayedShutdownHook(java.util.concurrent.ExecutorService, long, java.util.concurrent.TimeUnit)' is marked unstable with @Beta
in `common/src/main/java/com/google/tsunami/common/concurrent/BaseThreadPoolModule.java`
#### Snippet
```java

      if (shutdownDelay != null) {
        MoreExecutors.addDelayedShutdownHook(
            service, shutdownDelay.toMillis(), TimeUnit.MILLISECONDS);
      }
```

### UnstableApiUsage
'newReader(java.io.File, java.nio.charset.Charset)' is marked unstable with @Beta
in `common/src/main/java/com/google/tsunami/common/config/YamlConfigLoader.java`
#### Snippet
```java

    try {
      return Files.newReader(new File(configFile), UTF_8);
    } catch (FileNotFoundException e) {
      logger.atWarning().log(
```

### UnstableApiUsage
'com.google.common.net.HostAndPort' is marked unstable with @Beta
in `plugin/src/main/java/com/google/tsunami/plugin/TcsClient.java`
#### Snippet
```java
    }

    HostAndPort hostAndPort =
        callbackPort == 80
            ? HostAndPort.fromHost(callbackAddress)
```

### UnstableApiUsage
'com.google.common.net.HostAndPort' is marked unstable with @Beta
in `plugin/src/main/java/com/google/tsunami/plugin/TcsClient.java`
#### Snippet
```java
    HostAndPort hostAndPort =
        callbackPort == 80
            ? HostAndPort.fromHost(callbackAddress)
            : HostAndPort.fromParts(callbackAddress, callbackPort);

```

### UnstableApiUsage
'fromHost(java.lang.String)' is declared in unstable class 'com.google.common.net.HostAndPort' marked with @Beta
in `plugin/src/main/java/com/google/tsunami/plugin/TcsClient.java`
#### Snippet
```java
    HostAndPort hostAndPort =
        callbackPort == 80
            ? HostAndPort.fromHost(callbackAddress)
            : HostAndPort.fromParts(callbackAddress, callbackPort);

```

### UnstableApiUsage
'com.google.common.net.HostAndPort' is marked unstable with @Beta
in `plugin/src/main/java/com/google/tsunami/plugin/TcsClient.java`
#### Snippet
```java
        callbackPort == 80
            ? HostAndPort.fromHost(callbackAddress)
            : HostAndPort.fromParts(callbackAddress, callbackPort);

    // check if the specified address is raw IP or domain
```

### UnstableApiUsage
'fromParts(java.lang.String, int)' is declared in unstable class 'com.google.common.net.HostAndPort' marked with @Beta
in `plugin/src/main/java/com/google/tsunami/plugin/TcsClient.java`
#### Snippet
```java
        callbackPort == 80
            ? HostAndPort.fromHost(callbackAddress)
            : HostAndPort.fromParts(callbackAddress, callbackPort);

    // check if the specified address is raw IP or domain
```

### UnstableApiUsage
'com.google.common.net.InetAddresses' is marked unstable with @Beta
in `plugin/src/main/java/com/google/tsunami/plugin/TcsClient.java`
#### Snippet
```java

    // check if the specified address is raw IP or domain
    if (InetAddresses.isInetAddress(callbackAddress)) {
      return CbidProcessor.addCbidToUrl(cbid, hostAndPort);
    } else if (InternetDomainName.isValid(callbackAddress)) {
```

### UnstableApiUsage
'isInetAddress(java.lang.String)' is declared in unstable class 'com.google.common.net.InetAddresses' marked with @Beta
in `plugin/src/main/java/com/google/tsunami/plugin/TcsClient.java`
#### Snippet
```java

    // check if the specified address is raw IP or domain
    if (InetAddresses.isInetAddress(callbackAddress)) {
      return CbidProcessor.addCbidToUrl(cbid, hostAndPort);
    } else if (InternetDomainName.isValid(callbackAddress)) {
```

### UnstableApiUsage
'addCbidToUrl(java.lang.String, com.google.common.net.HostAndPort)' is unstable because its signature references unstable class 'com.google.common.net.HostAndPort' marked with @Beta
in `plugin/src/main/java/com/google/tsunami/plugin/TcsClient.java`
#### Snippet
```java
    // check if the specified address is raw IP or domain
    if (InetAddresses.isInetAddress(callbackAddress)) {
      return CbidProcessor.addCbidToUrl(cbid, hostAndPort);
    } else if (InternetDomainName.isValid(callbackAddress)) {
      return CbidProcessor.addCbidToSubdomain(cbid, hostAndPort);
```

### UnstableApiUsage
'com.google.common.net.InternetDomainName' is marked unstable with @Beta
in `plugin/src/main/java/com/google/tsunami/plugin/TcsClient.java`
#### Snippet
```java
    if (InetAddresses.isInetAddress(callbackAddress)) {
      return CbidProcessor.addCbidToUrl(cbid, hostAndPort);
    } else if (InternetDomainName.isValid(callbackAddress)) {
      return CbidProcessor.addCbidToSubdomain(cbid, hostAndPort);
    }
```

### UnstableApiUsage
'isValid(java.lang.String)' is declared in unstable class 'com.google.common.net.InternetDomainName' marked with @Beta
in `plugin/src/main/java/com/google/tsunami/plugin/TcsClient.java`
#### Snippet
```java
    if (InetAddresses.isInetAddress(callbackAddress)) {
      return CbidProcessor.addCbidToUrl(cbid, hostAndPort);
    } else if (InternetDomainName.isValid(callbackAddress)) {
      return CbidProcessor.addCbidToSubdomain(cbid, hostAndPort);
    }
```

### UnstableApiUsage
'addCbidToSubdomain(java.lang.String, com.google.common.net.HostAndPort)' is unstable because its signature references unstable class 'com.google.common.net.HostAndPort' marked with @Beta
in `plugin/src/main/java/com/google/tsunami/plugin/TcsClient.java`
#### Snippet
```java
      return CbidProcessor.addCbidToUrl(cbid, hostAndPort);
    } else if (InternetDomainName.isValid(callbackAddress)) {
      return CbidProcessor.addCbidToSubdomain(cbid, hostAndPort);
    }
    // Should never reach here
```

### UnstableApiUsage
'com.google.common.net.InetAddresses' is marked unstable with @Beta
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java
   */
  public static NetworkEndpoint forIp(String ipAddress) {
    checkArgument(InetAddresses.isInetAddress(ipAddress), "'%s' is not an IP address.", ipAddress);

    return NetworkEndpoint.newBuilder()
```

### UnstableApiUsage
'isInetAddress(java.lang.String)' is declared in unstable class 'com.google.common.net.InetAddresses' marked with @Beta
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java
   */
  public static NetworkEndpoint forIp(String ipAddress) {
    checkArgument(InetAddresses.isInetAddress(ipAddress), "'%s' is not an IP address.", ipAddress);

    return NetworkEndpoint.newBuilder()
```

### UnstableApiUsage
'toString()' is declared in unstable class 'com.google.common.net.HostAndPort' marked with @Beta
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java
   */
  public static String toUriAuthority(NetworkEndpoint networkEndpoint) {
    return toHostAndPort(networkEndpoint).toString();
  }

```

### UnstableApiUsage
'com.google.common.net.HostAndPort' is marked unstable with @Beta
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java
  }

  public static HostAndPort toHostAndPort(NetworkEndpoint networkEndpoint) {
    switch (networkEndpoint.getType()) {
      case IP:
```

### UnstableApiUsage
'com.google.common.net.HostAndPort' is marked unstable with @Beta
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java
    switch (networkEndpoint.getType()) {
      case IP:
        return HostAndPort.fromHost(networkEndpoint.getIpAddress().getAddress());
      case IP_PORT:
        return HostAndPort.fromParts(
```

### UnstableApiUsage
'fromHost(java.lang.String)' is declared in unstable class 'com.google.common.net.HostAndPort' marked with @Beta
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java
    switch (networkEndpoint.getType()) {
      case IP:
        return HostAndPort.fromHost(networkEndpoint.getIpAddress().getAddress());
      case IP_PORT:
        return HostAndPort.fromParts(
```

### UnstableApiUsage
'com.google.common.net.HostAndPort' is marked unstable with @Beta
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java
        return HostAndPort.fromHost(networkEndpoint.getIpAddress().getAddress());
      case IP_PORT:
        return HostAndPort.fromParts(
            networkEndpoint.getIpAddress().getAddress(), networkEndpoint.getPort().getPortNumber());
      case HOSTNAME:
```

### UnstableApiUsage
'fromParts(java.lang.String, int)' is declared in unstable class 'com.google.common.net.HostAndPort' marked with @Beta
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java
        return HostAndPort.fromHost(networkEndpoint.getIpAddress().getAddress());
      case IP_PORT:
        return HostAndPort.fromParts(
            networkEndpoint.getIpAddress().getAddress(), networkEndpoint.getPort().getPortNumber());
      case HOSTNAME:
```

### UnstableApiUsage
'com.google.common.net.HostAndPort' is marked unstable with @Beta
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java
      case HOSTNAME:
      case IP_HOSTNAME:
        return HostAndPort.fromHost(networkEndpoint.getHostname().getName());
      case HOSTNAME_PORT:
      case IP_HOSTNAME_PORT:
```

### UnstableApiUsage
'fromHost(java.lang.String)' is declared in unstable class 'com.google.common.net.HostAndPort' marked with @Beta
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java
      case HOSTNAME:
      case IP_HOSTNAME:
        return HostAndPort.fromHost(networkEndpoint.getHostname().getName());
      case HOSTNAME_PORT:
      case IP_HOSTNAME_PORT:
```

### UnstableApiUsage
'com.google.common.net.HostAndPort' is marked unstable with @Beta
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java
      case HOSTNAME_PORT:
      case IP_HOSTNAME_PORT:
        return HostAndPort.fromParts(
            networkEndpoint.getHostname().getName(), networkEndpoint.getPort().getPortNumber());
      case UNRECOGNIZED:
```

### UnstableApiUsage
'fromParts(java.lang.String, int)' is declared in unstable class 'com.google.common.net.HostAndPort' marked with @Beta
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java
      case HOSTNAME_PORT:
      case IP_HOSTNAME_PORT:
        return HostAndPort.fromParts(
            networkEndpoint.getHostname().getName(), networkEndpoint.getPort().getPortNumber());
      case UNRECOGNIZED:
```

### UnstableApiUsage
'com.google.common.net.InetAddresses' is marked unstable with @Beta
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java
  public static NetworkEndpoint forHostname(String hostname) {
    checkArgument(
        !InetAddresses.isInetAddress(hostname), "Expected hostname, got IP address '%s'", hostname);

    return NetworkEndpoint.newBuilder()
```

### UnstableApiUsage
'isInetAddress(java.lang.String)' is declared in unstable class 'com.google.common.net.InetAddresses' marked with @Beta
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java
  public static NetworkEndpoint forHostname(String hostname) {
    checkArgument(
        !InetAddresses.isInetAddress(hostname), "Expected hostname, got IP address '%s'", hostname);

    return NetworkEndpoint.newBuilder()
```

### UnstableApiUsage
'com.google.common.net.InetAddresses' is marked unstable with @Beta
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java

  public static AddressFamily ipAddressFamily(String ipAddress) {
    InetAddress inetAddress = InetAddresses.forString(ipAddress);

    if (inetAddress instanceof Inet4Address) {
```

### UnstableApiUsage
'forString(java.lang.String)' is declared in unstable class 'com.google.common.net.InetAddresses' marked with @Beta
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java

  public static AddressFamily ipAddressFamily(String ipAddress) {
    InetAddress inetAddress = InetAddresses.forString(ipAddress);

    if (inetAddress instanceof Inet4Address) {
```

### UnstableApiUsage
'com.google.common.net.InetAddresses' is marked unstable with @Beta
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java
   */
  public static NetworkEndpoint forIpAndPort(String ipAddress, int port) {
    checkArgument(InetAddresses.isInetAddress(ipAddress), "'%s' is not an IP address.", ipAddress);
    checkArgument(
        0 <= port && port <= MAX_PORT_NUMBER,
```

### UnstableApiUsage
'isInetAddress(java.lang.String)' is declared in unstable class 'com.google.common.net.InetAddresses' marked with @Beta
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java
   */
  public static NetworkEndpoint forIpAndPort(String ipAddress, int port) {
    checkArgument(InetAddresses.isInetAddress(ipAddress), "'%s' is not an IP address.", ipAddress);
    checkArgument(
        0 <= port && port <= MAX_PORT_NUMBER,
```

### UnstableApiUsage
'com.google.common.io.Resources' is marked unstable with @Beta
in `plugin/src/main/java/com/google/tsunami/plugin/payload/PayloadGeneratorModule.java`
#### Snippet
```java
    Map<String, Object> rawYamlData =
        yaml.load(
            Resources.toString(
                Resources.getResource(this.getClass(), "payload_definitions.yaml"),
                UTF_8));
```

### UnstableApiUsage
'toString(java.net.URL, java.nio.charset.Charset)' is declared in unstable class 'com.google.common.io.Resources' marked with @Beta
in `plugin/src/main/java/com/google/tsunami/plugin/payload/PayloadGeneratorModule.java`
#### Snippet
```java
    Map<String, Object> rawYamlData =
        yaml.load(
            Resources.toString(
                Resources.getResource(this.getClass(), "payload_definitions.yaml"),
                UTF_8));
```

### UnstableApiUsage
'com.google.common.io.Resources' is marked unstable with @Beta
in `plugin/src/main/java/com/google/tsunami/plugin/payload/PayloadGeneratorModule.java`
#### Snippet
```java
        yaml.load(
            Resources.toString(
                Resources.getResource(this.getClass(), "payload_definitions.yaml"),
                UTF_8));

```

### UnstableApiUsage
'getResource(java.lang.Class, java.lang.String)' is declared in unstable class 'com.google.common.io.Resources' marked with @Beta
in `plugin/src/main/java/com/google/tsunami/plugin/payload/PayloadGeneratorModule.java`
#### Snippet
```java
        yaml.load(
            Resources.toString(
                Resources.getResource(this.getClass(), "payload_definitions.yaml"),
                UTF_8));

```

### UnstableApiUsage
'com.google.common.net.InetAddresses' is marked unstable with @Beta
in `plugin/src/main/java/com/google/tsunami/plugin/payload/PayloadGeneratorModule.java`
#### Snippet
```java
    checkNotNull(pollingUri);
    checkArgument(
        InetAddresses.isInetAddress(callbackAddress) || InternetDomainName.isValid(callbackAddress),
        "Invalid callback address specified");
    checkArgument(callbackPort > 0 && callbackPort < 65536, "Invalid port number specified");
```

### UnstableApiUsage
'isInetAddress(java.lang.String)' is declared in unstable class 'com.google.common.net.InetAddresses' marked with @Beta
in `plugin/src/main/java/com/google/tsunami/plugin/payload/PayloadGeneratorModule.java`
#### Snippet
```java
    checkNotNull(pollingUri);
    checkArgument(
        InetAddresses.isInetAddress(callbackAddress) || InternetDomainName.isValid(callbackAddress),
        "Invalid callback address specified");
    checkArgument(callbackPort > 0 && callbackPort < 65536, "Invalid port number specified");
```

### UnstableApiUsage
'com.google.common.net.InternetDomainName' is marked unstable with @Beta
in `plugin/src/main/java/com/google/tsunami/plugin/payload/PayloadGeneratorModule.java`
#### Snippet
```java
    checkNotNull(pollingUri);
    checkArgument(
        InetAddresses.isInetAddress(callbackAddress) || InternetDomainName.isValid(callbackAddress),
        "Invalid callback address specified");
    checkArgument(callbackPort > 0 && callbackPort < 65536, "Invalid port number specified");
```

### UnstableApiUsage
'isValid(java.lang.String)' is declared in unstable class 'com.google.common.net.InternetDomainName' marked with @Beta
in `plugin/src/main/java/com/google/tsunami/plugin/payload/PayloadGeneratorModule.java`
#### Snippet
```java
    checkNotNull(pollingUri);
    checkArgument(
        InetAddresses.isInetAddress(callbackAddress) || InternetDomainName.isValid(callbackAddress),
        "Invalid callback address specified");
    checkArgument(callbackPort > 0 && callbackPort < 65536, "Invalid port number specified");
```

### UnstableApiUsage
'com.google.common.util.concurrent.FluentFuture' is marked unstable with @Beta
in `plugin/src/main/java/com/google/tsunami/plugin/PluginExecutorImpl.java`
#### Snippet
```java
      PluginExecutorConfig<T> executorConfig) {
    // Executes the core plugin logic within the thread pool.
    return FluentFuture.from(
            pluginExecutionThreadPool.submit(
                () -> {
```

### UnstableApiUsage
'from(com.google.common.util.concurrent.ListenableFuture)' is declared in unstable class 'com.google.common.util.concurrent.FluentFuture' marked with @Beta
in `plugin/src/main/java/com/google/tsunami/plugin/PluginExecutorImpl.java`
#### Snippet
```java
      PluginExecutorConfig<T> executorConfig) {
    // Executes the core plugin logic within the thread pool.
    return FluentFuture.from(
            pluginExecutionThreadPool.submit(
                () -> {
```

### UnstableApiUsage
'withTimeout(java.time.Duration, java.util.concurrent.ScheduledExecutorService)' is declared in unstable class 'com.google.common.util.concurrent.FluentFuture' marked with @Beta
in `plugin/src/main/java/com/google/tsunami/plugin/PluginExecutorImpl.java`
#### Snippet
```java
                }))
        // Terminate plugin if it runs over 1 hour.
        .withTimeout(Duration.ofHours(1), pluginExecutionThreadPool)
        // If execution succeeded, build successful execution result.
        .transform(resultData -> buildSucceededResult(resultData, executorConfig), directExecutor())
```

### UnstableApiUsage
'transform(com.google.common.base.Function, java.util.concurrent.Executor)' is declared in unstable class 'com.google.common.util.concurrent.FluentFuture' marked with @Beta
in `plugin/src/main/java/com/google/tsunami/plugin/PluginExecutorImpl.java`
#### Snippet
```java
        .withTimeout(Duration.ofHours(1), pluginExecutionThreadPool)
        // If execution succeeded, build successful execution result.
        .transform(resultData -> buildSucceededResult(resultData, executorConfig), directExecutor())
        // If execution failed, build failed execution result.
        .catching(
```

### UnstableApiUsage
'catching(java.lang.Class, com.google.common.base.Function, java.util.concurrent.Executor)' is declared in unstable class 'com.google.common.util.concurrent.FluentFuture' marked with @Beta
in `plugin/src/main/java/com/google/tsunami/plugin/PluginExecutorImpl.java`
#### Snippet
```java
        .transform(resultData -> buildSucceededResult(resultData, executorConfig), directExecutor())
        // If execution failed, build failed execution result.
        .catching(
            Throwable.class,
            exception -> buildFailedResult(exception, executorConfig),
```

### UnstableApiUsage
'com.google.common.util.concurrent.FluentFuture' is marked unstable with @Beta
in `workflow/src/main/java/com/google/tsunami/workflow/DefaultScanningWorkflow.java`
#### Snippet
```java
                .map(executorConfig -> pluginExecutorProvider.get().executeAsync(executorConfig))
                .collect(toImmutableList());
    return FluentFuture.from(Futures.successfulAsList(fingerprintingResultFutures))
        .transform(
            executionResults ->
```

### UnstableApiUsage
'from(com.google.common.util.concurrent.ListenableFuture)' is declared in unstable class 'com.google.common.util.concurrent.FluentFuture' marked with @Beta
in `workflow/src/main/java/com/google/tsunami/workflow/DefaultScanningWorkflow.java`
#### Snippet
```java
                .map(executorConfig -> pluginExecutorProvider.get().executeAsync(executorConfig))
                .collect(toImmutableList());
    return FluentFuture.from(Futures.successfulAsList(fingerprintingResultFutures))
        .transform(
            executionResults ->
```

### UnstableApiUsage
'successfulAsList(java.lang.Iterable\>)' is marked unstable with @Beta
in `workflow/src/main/java/com/google/tsunami/workflow/DefaultScanningWorkflow.java`
#### Snippet
```java
                .map(executorConfig -> pluginExecutorProvider.get().executeAsync(executorConfig))
                .collect(toImmutableList());
    return FluentFuture.from(Futures.successfulAsList(fingerprintingResultFutures))
        .transform(
            executionResults ->
```

### UnstableApiUsage
'transform(com.google.common.base.Function, java.util.concurrent.Executor)' is declared in unstable class 'com.google.common.util.concurrent.FluentFuture' marked with @Beta
in `workflow/src/main/java/com/google/tsunami/workflow/DefaultScanningWorkflow.java`
#### Snippet
```java
                .collect(toImmutableList());
    return FluentFuture.from(Futures.successfulAsList(fingerprintingResultFutures))
        .transform(
            executionResults ->
                ReconnaissanceReport.newBuilder()
```

### UnstableApiUsage
'com.google.common.util.concurrent.FluentFuture' is marked unstable with @Beta
in `workflow/src/main/java/com/google/tsunami/workflow/DefaultScanningWorkflow.java`
#### Snippet
```java
    executionTracer = ExecutionTracer.startWorkflow();
    logger.atInfo().log("Staring Tsunami scanning workflow.");
    FluentFuture<ReconnaissanceReport> reconnaissanceReport;

    if (scanTarget.hasNetworkService()) {
```

### UnstableApiUsage
'com.google.common.util.concurrent.FluentFuture' is marked unstable with @Beta
in `workflow/src/main/java/com/google/tsunami/workflow/DefaultScanningWorkflow.java`
#### Snippet
```java
    if (scanTarget.hasNetworkService()) {
      PortScanningReport portScanningReport = buildUriPortScanningReport(scanTarget);
      reconnaissanceReport = FluentFuture.from(fingerprintNetworkServices(portScanningReport));
    } else {
      reconnaissanceReport =
```

### UnstableApiUsage
'com.google.common.util.concurrent.FluentFuture' is marked unstable with @Beta
in `workflow/src/main/java/com/google/tsunami/workflow/DefaultScanningWorkflow.java`
#### Snippet
```java
    } else {
      reconnaissanceReport =
          FluentFuture.from(scanPorts(scanTarget))
              .transformAsync(this::fingerprintNetworkServices, directExecutor());
    }
```

### UnstableApiUsage
'transformAsync(com.google.common.util.concurrent.AsyncFunction, java.util.concurrent.Executor)' is declared in unstable class 'com.google.common.util.concurrent.FluentFuture' marked with @Beta
in `workflow/src/main/java/com/google/tsunami/workflow/DefaultScanningWorkflow.java`
#### Snippet
```java
    }
    return reconnaissanceReport
        .transformAsync(this::detectVulnerabilities, directExecutor())
        // Unfortunately FluentFuture doesn't support future peeking.
        .transform(
```

### UnstableApiUsage
'transform(com.google.common.base.Function, java.util.concurrent.Executor)' is declared in unstable class 'com.google.common.util.concurrent.FluentFuture' marked with @Beta
in `workflow/src/main/java/com/google/tsunami/workflow/DefaultScanningWorkflow.java`
#### Snippet
```java
        .transformAsync(this::detectVulnerabilities, directExecutor())
        // Unfortunately FluentFuture doesn't support future peeking.
        .transform(
            scanResults -> {
              logger.atInfo().log("%s", executionTracer.buildLoggableExecutionTrace(scanResults));
```

### UnstableApiUsage
'catching(java.lang.Class, com.google.common.base.Function, java.util.concurrent.Executor)' is declared in unstable class 'com.google.common.util.concurrent.FluentFuture' marked with @Beta
in `workflow/src/main/java/com/google/tsunami/workflow/DefaultScanningWorkflow.java`
#### Snippet
```java
            directExecutor())
        // Execution errors are handled and reported back in the ScanResults.
        .catching(PluginExecutionException.class, this::onExecutionError, directExecutor())
        .catching(LanguageServerException.class, this::onExecutionError, directExecutor())
        .catching(ScanningWorkflowException.class, this::onExecutionError, directExecutor());
```

### UnstableApiUsage
'catching(java.lang.Class, com.google.common.base.Function, java.util.concurrent.Executor)' is declared in unstable class 'com.google.common.util.concurrent.FluentFuture' marked with @Beta
in `workflow/src/main/java/com/google/tsunami/workflow/DefaultScanningWorkflow.java`
#### Snippet
```java
        // Execution errors are handled and reported back in the ScanResults.
        .catching(PluginExecutionException.class, this::onExecutionError, directExecutor())
        .catching(LanguageServerException.class, this::onExecutionError, directExecutor())
        .catching(ScanningWorkflowException.class, this::onExecutionError, directExecutor());
  }
```

### UnstableApiUsage
'catching(java.lang.Class, com.google.common.base.Function, java.util.concurrent.Executor)' is declared in unstable class 'com.google.common.util.concurrent.FluentFuture' marked with @Beta
in `workflow/src/main/java/com/google/tsunami/workflow/DefaultScanningWorkflow.java`
#### Snippet
```java
        .catching(PluginExecutionException.class, this::onExecutionError, directExecutor())
        .catching(LanguageServerException.class, this::onExecutionError, directExecutor())
        .catching(ScanningWorkflowException.class, this::onExecutionError, directExecutor());
  }

```

### UnstableApiUsage
'com.google.common.util.concurrent.FluentFuture' is marked unstable with @Beta
in `workflow/src/main/java/com/google/tsunami/workflow/DefaultScanningWorkflow.java`
#### Snippet
```java
                        pluginExecutorProvider.get().executeAsync(vulnDetectorExecutorConfig))
                .collect(toImmutableList());
    return FluentFuture.from(Futures.successfulAsList(detectionResultFutures))
        .transform(
            detectionResult -> generateScanResults(detectionResult, reconnaissanceReport),
```

### UnstableApiUsage
'from(com.google.common.util.concurrent.ListenableFuture)' is declared in unstable class 'com.google.common.util.concurrent.FluentFuture' marked with @Beta
in `workflow/src/main/java/com/google/tsunami/workflow/DefaultScanningWorkflow.java`
#### Snippet
```java
                        pluginExecutorProvider.get().executeAsync(vulnDetectorExecutorConfig))
                .collect(toImmutableList());
    return FluentFuture.from(Futures.successfulAsList(detectionResultFutures))
        .transform(
            detectionResult -> generateScanResults(detectionResult, reconnaissanceReport),
```

### UnstableApiUsage
'successfulAsList(java.lang.Iterable\>)' is marked unstable with @Beta
in `workflow/src/main/java/com/google/tsunami/workflow/DefaultScanningWorkflow.java`
#### Snippet
```java
                        pluginExecutorProvider.get().executeAsync(vulnDetectorExecutorConfig))
                .collect(toImmutableList());
    return FluentFuture.from(Futures.successfulAsList(detectionResultFutures))
        .transform(
            detectionResult -> generateScanResults(detectionResult, reconnaissanceReport),
```

### UnstableApiUsage
'transform(com.google.common.base.Function, java.util.concurrent.Executor)' is declared in unstable class 'com.google.common.util.concurrent.FluentFuture' marked with @Beta
in `workflow/src/main/java/com/google/tsunami/workflow/DefaultScanningWorkflow.java`
#### Snippet
```java
                .collect(toImmutableList());
    return FluentFuture.from(Futures.successfulAsList(detectionResultFutures))
        .transform(
            detectionResult -> generateScanResults(detectionResult, reconnaissanceReport),
            directExecutor());
```

### UnstableApiUsage
'com.google.common.util.concurrent.FluentFuture' is marked unstable with @Beta
in `workflow/src/main/java/com/google/tsunami/workflow/DefaultScanningWorkflow.java`
#### Snippet
```java
    executionTracer.startPortScanning(ImmutableList.of(matchedPortScanner.get()));
    logger.atInfo().log("Starting port scanning phase of the scanning workflow.");
    return FluentFuture.from(pluginExecutorProvider.get().executeAsync(executorConfig))
        .transformAsync(
            pluginExecutionResult ->
```

### UnstableApiUsage
'com.google.common.net.InetAddresses' is marked unstable with @Beta
in `main/src/main/java/com/google/tsunami/main/cli/option/validator/IpValidator.java`
#### Snippet
```java
  public void validate(String name, String value) {
    if (Strings.isNullOrEmpty(value)
        || !InetAddresses.isInetAddress(value)
        || !shouldAccept(InetAddresses.forString(value))) {
      throw new ParameterException(
```

### UnstableApiUsage
'isInetAddress(java.lang.String)' is declared in unstable class 'com.google.common.net.InetAddresses' marked with @Beta
in `main/src/main/java/com/google/tsunami/main/cli/option/validator/IpValidator.java`
#### Snippet
```java
  public void validate(String name, String value) {
    if (Strings.isNullOrEmpty(value)
        || !InetAddresses.isInetAddress(value)
        || !shouldAccept(InetAddresses.forString(value))) {
      throw new ParameterException(
```

### UnstableApiUsage
'com.google.common.net.InetAddresses' is marked unstable with @Beta
in `main/src/main/java/com/google/tsunami/main/cli/option/validator/IpValidator.java`
#### Snippet
```java
    if (Strings.isNullOrEmpty(value)
        || !InetAddresses.isInetAddress(value)
        || !shouldAccept(InetAddresses.forString(value))) {
      throw new ParameterException(
          String.format(
```

### UnstableApiUsage
'forString(java.lang.String)' is declared in unstable class 'com.google.common.net.InetAddresses' marked with @Beta
in `main/src/main/java/com/google/tsunami/main/cli/option/validator/IpValidator.java`
#### Snippet
```java
    if (Strings.isNullOrEmpty(value)
        || !InetAddresses.isInetAddress(value)
        || !shouldAccept(InetAddresses.forString(value))) {
      throw new ParameterException(
          String.format(
```

### UnstableApiUsage
'stream(java.util.Optional)' is marked unstable with @Beta
in `plugin/src/main/java/com/google/tsunami/plugin/PluginManager.java`
#### Snippet
```java
        .filter(entry -> isVulnDetector(entry.getKey()))
        .map(entry -> matchAllVulnDetectors(entry.getKey(), entry.getValue(), reconnaissanceReport))
        .flatMap(Streams::stream)
        .collect(toImmutableList());
  }
```

