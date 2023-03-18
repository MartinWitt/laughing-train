# tsunami-security-scanner 
 
# Bad smells
I found 144 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnstableApiUsage | 65 | false |
| AbstractClassNeverImplemented | 24 | false |
| BoundedWildcard | 10 | false |
| OptionalUsedAsFieldOrParameterType | 9 | false |
| ReplaceNullCheck | 5 | false |
| SimplifyOptionalCallChains | 4 | false |
| NullableProblems | 4 | false |
| OptionalGetWithoutIsPresent | 4 | false |
| UnnecessaryFullyQualifiedName | 3 | false |
| UnnecessarySemicolon | 2 | false |
| Convert2MethodRef | 2 | false |
| CharsetObjectCanBeUsed | 1 | false |
| OptionalIsPresent | 1 | false |
| DataFlowIssue | 1 | false |
| NestedAssignment | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| RedundantFieldInitialization | 1 | false |
| AssignmentToMethodParameter | 1 | false |
| RedundantImplements | 1 | false |
| InstanceofCatchParameter | 1 | false |
| AssignmentToLambdaParameter | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| UnstableTypeUsedInSignature | 1 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
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

## RuleId[id=SimplifyOptionalCallChains]
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
in `common/src/main/java/com/google/tsunami/common/net/http/HttpRequest.java`
#### Snippet
```java
        case HEAD:
          checkState(
              !httpRequest.requestBody().isPresent(),
              "A request body is not allowed for HTTP GET/HEAD request");
          break;
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

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `common/src/main/java/com/google/tsunami/common/time/testing/FakeUtcClock.java`
#### Snippet
```java

/**
 * Implementation of a {@link java.time.Clock} that returns a settable {@link Instant} value.
 *
 * <p>By default, the clock is set to the {@link Instant} when the clock is created. Clock can be
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `common/src/main/java/com/google/tsunami/common/time/SystemUtcClockModule.java`
#### Snippet
```java
import java.time.Clock;

/** Binds {@link java.time.Clock} to a {@code Clock.systemUTC()}. */
public class SystemUtcClockModule extends AbstractModule {

```

### UnnecessaryFullyQualifiedName
Qualifier `java.time` is unnecessary and can be removed
in `common/src/main/java/com/google/tsunami/common/time/testing/FakeUtcClockModule.java`
#### Snippet
```java
import java.time.Clock;

/** Binds {@link java.time.Clock} to a {@link FakeUtcClock}. */
public class FakeUtcClockModule extends AbstractModule {
  private final FakeUtcClock fakeUtcClock;
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

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `common/src/main/java/com/google/tsunami/common/command/CommandExecutor.java`
#### Snippet
```java
      String output;
      BufferedReader streamReader = new BufferedReader(new InputStreamReader(stream, UTF_8));
      while ((output = streamReader.readLine()) != null) {
        stringBuilder.append(output);
        stringBuilder.append("\n");
```

## RuleId[id=ReplaceNullCheck]
### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElse()'
in `common/src/main/java/com/google/tsunami/common/net/http/HttpClientModule.java`
#### Snippet
```java
      return httpClientCliOptions.connectTimeoutSeconds;
    }
    if (httpClientConfigProperties.connectTimeoutSeconds != null) {
      return httpClientConfigProperties.connectTimeoutSeconds;
    }
```

### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElse()'
in `common/src/main/java/com/google/tsunami/common/net/http/HttpClientModule.java`
#### Snippet
```java
      return httpClientCliOptions.readTimeoutSeconds;
    }
    if (httpClientConfigProperties.readTimeoutSeconds != null) {
      return httpClientConfigProperties.readTimeoutSeconds;
    }
```

### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElse()'
in `common/src/main/java/com/google/tsunami/common/net/http/HttpClientModule.java`
#### Snippet
```java
      return httpClientCliOptions.trustAllCertificates;
    }
    if (httpClientConfigProperties.trustAllCertificates != null) {
      return httpClientConfigProperties.trustAllCertificates;
    }
```

### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElse()'
in `common/src/main/java/com/google/tsunami/common/net/http/HttpClientModule.java`
#### Snippet
```java
      return httpClientCliOptions.writeTimeoutSeconds;
    }
    if (httpClientConfigProperties.writeTimeoutSeconds != null) {
      return httpClientConfigProperties.writeTimeoutSeconds;
    }
```

### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElse()'
in `common/src/main/java/com/google/tsunami/common/net/http/HttpClientModule.java`
#### Snippet
```java
      return httpClientCliOptions.callTimeoutSeconds;
    }
    if (httpClientConfigProperties.callTimeoutSeconds != null) {
      return httpClientConfigProperties.callTimeoutSeconds;
    }
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `plugin/src/main/java/com/google/tsunami/plugin/payload/testing/FakePayloadGeneratorModule.java`
#### Snippet
```java
      Optional<MockWebServer> callbackServer, Optional<SecureRandom> secureRng) {

    this.tcsConfig.callbackAddress = callbackServer.map(c -> c.getHostName()).orElse(null);
    this.tcsConfig.callbackPort = callbackServer.map(c -> c.getPort()).orElse(null);
    this.tcsConfig.pollingUri = callbackServer.map(c -> c.url("/").toString()).orElse(null);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `plugin/src/main/java/com/google/tsunami/plugin/payload/testing/FakePayloadGeneratorModule.java`
#### Snippet
```java

    this.tcsConfig.callbackAddress = callbackServer.map(c -> c.getHostName()).orElse(null);
    this.tcsConfig.callbackPort = callbackServer.map(c -> c.getPort()).orElse(null);
    this.tcsConfig.pollingUri = callbackServer.map(c -> c.url("/").toString()).orElse(null);
    this.secureRng = secureRng.orElse(new SecureRandom());
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

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `common/src/main/java/com/google/tsunami/common/io/archiving/testing/FakeArchiver.java`
#### Snippet
```java
  private final Map<String, byte[]> archivedByteArrayData = Maps.newHashMap();
  private final Map<String, CharSequence> archivedCharSequenceData = Maps.newHashMap();
  private boolean shouldFail = false;

  @Override
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `versionString`
in `common/src/main/java/com/google/tsunami/common/version/Version.java`
#### Snippet
```java
    Version version = builder().setVersionType(Type.NORMAL).setVersionString(versionString).build();
    if (!EPOCH_PATTERN.matcher(versionString).matches()) {
      versionString = "0:" + versionString;
    }

```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `Comparable`
in `common/src/main/java/com/google/tsunami/common/version/KnownQualifier.java`
#### Snippet
```java
 * represents the precedence of these identifiers.
 */
enum KnownQualifier implements Comparable<KnownQualifier> {
  ALPHA("alpha"),
  BETA("beta"),
```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `main/src/main/java/com/google/tsunami/main/cli/TsunamiCli.java`
#### Snippet
```java
    } catch (Throwable e) {
      logger.atSevere().withCause(e).log("Exiting due to workflow execution exceptions.");
      if (e instanceof InterruptedException) {
        Thread.currentThread().interrupt();
      }
```

## RuleId[id=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `hostname`
in `common/src/main/java/com/google/tsunami/common/net/http/OkHttpHttpClient.java`
#### Snippet
```java
            hostname -> {
              if (hostname.equals(serviceHostname)) {
                hostname = serviceIp;
              }
              return Dns.SYSTEM.lookup(hostname);
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

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super String`
in `common/src/main/java/com/google/tsunami/common/net/http/HttpHeaders.java`
#### Snippet
```java
   * (lower case to original string value).
   */
  private static void addFields(ImmutableBiMap.Builder<String, String> builder, Class<?> clazz) {
    try {
      for (Field field : clazz.getFields()) {
```

### BoundedWildcard
Can generalize to `? super String`
in `common/src/main/java/com/google/tsunami/common/net/http/HttpHeaders.java`
#### Snippet
```java
   * (lower case to original string value).
   */
  private static void addFields(ImmutableBiMap.Builder<String, String> builder, Class<?> clazz) {
    try {
      for (Field field : clazz.getFields()) {
```

### BoundedWildcard
Can generalize to `? extends ServerPortCommand`
in `plugin/src/main/java/com/google/tsunami/plugin/RemoteVulnDetectorLoadingModule.java`
#### Snippet
```java

  private ImmutableList<Channel> getLanguageServerChannels(
      ImmutableList<ServerPortCommand> commands) {
    return commands.stream()
        .map(
```

### BoundedWildcard
Can generalize to `? extends PluginDefinition`
in `plugin/src/main/java/com/google/tsunami/plugin/PluginManager.java`
#### Snippet
```java

  @Inject
  PluginManager(Map<PluginDefinition, Provider<TsunamiPlugin>> tsunamiPlugins) {
    this.tsunamiPlugins = tsunamiPlugins;
  }
```

### BoundedWildcard
Can generalize to `? extends Provider`
in `plugin/src/main/java/com/google/tsunami/plugin/PluginManager.java`
#### Snippet
```java

  @Inject
  PluginManager(Map<PluginDefinition, Provider<TsunamiPlugin>> tsunamiPlugins) {
    this.tsunamiPlugins = tsunamiPlugins;
  }
```

### BoundedWildcard
Can generalize to `? extends T`
in `common/src/main/java/com/google/tsunami/common/version/ComparisonUtility.java`
#### Snippet
```java
   */
  static <T extends Comparable<? super T>> int compareListWithFillValue(
      List<T> left, List<T> right, T fillValue) {
    int longest = Math.max(left.size(), right.size());
    for (int i = 0; i < longest; i++) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `common/src/main/java/com/google/tsunami/common/version/ComparisonUtility.java`
#### Snippet
```java
   */
  static <T extends Comparable<? super T>> int compareListWithFillValue(
      List<T> left, List<T> right, T fillValue) {
    int longest = Math.max(left.size(), right.size());
    for (int i = 0; i < longest; i++) {
```

### BoundedWildcard
Can generalize to `? extends HttpQueryParameter`
in `common/src/main/java/com/google/tsunami/common/net/FuzzingUtils.java`
#### Snippet
```java
  }

  private static String assembleQueryParams(ImmutableList<HttpQueryParameter> params) {
    return params.stream()
        .map(param -> String.format("%s=%s", param.name(), param.value()))
```

### BoundedWildcard
Can generalize to `? super ImmutableList`
in `common/src/main/java/com/google/tsunami/common/net/FuzzingUtils.java`
#### Snippet
```java

  private static void fuzzParamsWithExtendedPathPayloads(
      ImmutableSet.Builder<ImmutableList<HttpQueryParameter>> builder,
      ImmutableList<HttpQueryParameter> params,
      int index,
```

### BoundedWildcard
Can generalize to `? extends HttpQueryParameter`
in `common/src/main/java/com/google/tsunami/common/net/FuzzingUtils.java`
#### Snippet
```java

  private static ImmutableList<HttpQueryParameter> setFuzzedParams(
      ImmutableList<HttpQueryParameter> params, int index, String payload) {
    List<HttpQueryParameter> paramsWithPayload = new ArrayList<>(params);
    paramsWithPayload.set(index, HttpQueryParameter.create(params.get(index).name(), payload));
```

## RuleId[id=UnstableTypeUsedInSignature]
### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.net.HostAndPort'
in `common/src/main/java/com/google/tsunami/common/data/NetworkEndpointUtils.java`
#### Snippet
```java
  }

  public static HostAndPort toHostAndPort(NetworkEndpoint networkEndpoint) {
    switch (networkEndpoint.getType()) {
      case IP:
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `plugin/src/main/java/com/google/tsunami/plugin/PluginExecutionResult.java`
#### Snippet
```java
  /** Builder for {@link PluginExecutionResult}. */
  @AutoValue.Builder
  public abstract static class Builder<T> {
    public abstract Builder<T> setExecutionStatus(ExecutionStatus executionStatus);
    public abstract Builder<T> setResultData(T resultData);
```

### AbstractClassNeverImplemented
Abstract class `PluginExecutionResult` has no concrete subclass
in `plugin/src/main/java/com/google/tsunami/plugin/PluginExecutionResult.java`
#### Snippet
```java
/** The result of executing the Tsunami plugin core logic by the {@link PluginExecutor}. */
@AutoValue
public abstract class PluginExecutionResult<T> {
  /** All possible execution status of a Tsunami plugin. */
  public enum ExecutionStatus {
```

### AbstractClassNeverImplemented
Abstract class `PluginDefinition` has no concrete subclass
in `plugin/src/main/java/com/google/tsunami/plugin/PluginDefinition.java`
#### Snippet
```java
/** A data class that captures all the definition details about a {@link TsunamiPlugin}. */
@AutoValue
abstract class PluginDefinition {
  abstract PluginInfo pluginInfo();

```

### AbstractClassNeverImplemented
Abstract class `HttpResponse` has no concrete subclass
in `common/src/main/java/com/google/tsunami/common/net/http/HttpResponse.java`
#### Snippet
```java
// HttpUrl is immutable even if not marked as such.
@SuppressWarnings("Immutable")
public abstract class HttpResponse {
  public abstract HttpStatus status();
  public abstract HttpHeaders headers();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `common/src/main/java/com/google/tsunami/common/net/http/HttpResponse.java`
#### Snippet
```java
  /** Builder for {@link HttpResponse}. */
  @AutoValue.Builder
  public abstract static class Builder {
    public abstract Builder setStatus(HttpStatus httpStatus);
    public abstract Builder setHeaders(HttpHeaders httpHeaders);
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `common/src/main/java/com/google/tsunami/common/net/http/HttpHeaders.java`
#### Snippet
```java
  /** Builder for {@link HttpHeaders}. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** RFC 2616 section 4.2. */
    private static final CharMatcher HEADER_NAME_MATCHER =
```

### AbstractClassNeverImplemented
Abstract class `HttpHeaders` has no concrete subclass
in `common/src/main/java/com/google/tsunami/common/net/http/HttpHeaders.java`
#### Snippet
```java
@Immutable
@AutoValue
public abstract class HttpHeaders {
  private static final ImmutableBiMap<String, String> LOWER_TO_KNOWN = createKnownHeaders();
  private static final ImmutableSet<String> KNOWN = LOWER_TO_KNOWN.values();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `plugin/src/main/java/com/google/tsunami/plugin/payload/testing/FakePayloadGeneratorModule.java`
#### Snippet
```java
  /** Configures {@link FakePayloadGeneratorModule}. */
  @AutoBuilder(callMethod = "build")
  public abstract static class Builder {
    public static Builder builder() {
      return new AutoBuilder_FakePayloadGeneratorModule_Builder();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `plugin/src/main/java/com/google/tsunami/plugin/PluginManager.java`
#### Snippet
```java
    @SuppressWarnings("CanIgnoreReturnValueSuggester")
    @AutoValue.Builder
    public abstract static class Builder<T extends TsunamiPlugin> {
      public abstract Builder<T> setPluginDefinition(PluginDefinition value);
      public abstract Builder<T> setTsunamiPlugin(T value);
```

### AbstractClassNeverImplemented
Abstract class `PluginMatchingResult` has no concrete subclass
in `plugin/src/main/java/com/google/tsunami/plugin/PluginManager.java`
#### Snippet
```java
  /** Matched {@link TsunamiPlugin}s based on certain criteria. */
  @AutoValue
  public abstract static class PluginMatchingResult<T extends TsunamiPlugin> {
    public abstract PluginDefinition pluginDefinition();

```

### AbstractClassNeverImplemented
Abstract class `Token` has no concrete subclass
in `common/src/main/java/com/google/tsunami/common/version/Token.java`
#### Snippet
```java
@Immutable
@AutoOneOf(Token.Kind.class)
abstract class Token implements Comparable<Token> {
  static final Token EMPTY = Token.fromKnownQualifier(KnownQualifier.ABSENT);

```

### AbstractClassNeverImplemented
Abstract class `Version` has no concrete subclass
in `common/src/main/java/com/google/tsunami/common/version/Version.java`
#### Snippet
```java
@AutoValue
@Immutable
public abstract class Version implements Comparable<Version> {
  private static final Pattern EPOCH_PATTERN = Pattern.compile("\\d+[:|_].*");
  private static final Pattern SEMANTIC_SEGMENT_SEPARATORS = Pattern.compile("[-:_~]");
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `common/src/main/java/com/google/tsunami/common/version/Version.java`
#### Snippet
```java
  /** Builder for {@link Version}. */
  @AutoValue.Builder
  public abstract static class Builder {
    public abstract Builder setVersionType(Type value);
    public abstract Builder setVersionString(String value);
```

### AbstractClassNeverImplemented
Abstract class `Segment` has no concrete subclass
in `common/src/main/java/com/google/tsunami/common/version/Segment.java`
#### Snippet
```java
@AutoValue
@Immutable
abstract class Segment implements Comparable<Segment> {
  static final Segment NULL = Segment.fromTokenList(ImmutableList.of(Token.EMPTY));

```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `common/src/main/java/com/google/tsunami/common/net/http/HttpRequest.java`
#### Snippet
```java
  /** Builder for {@link HttpRequest}. */
  @AutoValue.Builder
  public abstract static class Builder {
    public abstract Builder setMethod(HttpMethod method);
    public abstract Builder setUrl(String url);
```

### AbstractClassNeverImplemented
Abstract class `HttpRequest` has no concrete subclass
in `common/src/main/java/com/google/tsunami/common/net/http/HttpRequest.java`
#### Snippet
```java
@AutoValue.CopyAnnotations
@SuppressWarnings("Immutable")
public abstract class HttpRequest {
  public abstract HttpMethod method();
  public abstract String url();
```

### AbstractClassNeverImplemented
Abstract class `HttpQueryParameter` has no concrete subclass
in `common/src/main/java/com/google/tsunami/common/net/FuzzingUtils.java`
#### Snippet
```java
  /** URL Query parameter name and value pair. */
  @AutoValue
  public abstract static class HttpQueryParameter {
    public abstract String name();

```

### AbstractClassNeverImplemented
Abstract class `VersionRange` has no concrete subclass
in `common/src/main/java/com/google/tsunami/common/version/VersionRange.java`
#### Snippet
```java
@AutoValue
@Immutable
public abstract class VersionRange {
  /** The inclusiveness of the range endpoint. */
  public enum Inclusiveness {
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `common/src/main/java/com/google/tsunami/common/version/VersionRange.java`
#### Snippet
```java
  /** Builder for {@link VersionRange}. */
  @AutoValue.Builder
  public abstract static class Builder {
    public abstract Builder setMinVersion(Version value);
    public abstract Builder setMinVersionInclusiveness(Inclusiveness value);
```

### AbstractClassNeverImplemented
Abstract class `ServerPortCommand` has no concrete subclass
in `common/src/main/java/com/google/tsunami/common/server/ServerPortCommand.java`
#### Snippet
```java
/** Command to spawn a language server and associated port. */
@AutoValue
public abstract class ServerPortCommand {
  public static ServerPortCommand create(String serverCommand, String port) {
    return new AutoValue_ServerPortCommand(serverCommand, port);
```

### AbstractClassNeverImplemented
Abstract class `VersionSet` has no concrete subclass
in `common/src/main/java/com/google/tsunami/common/version/VersionSet.java`
#### Snippet
```java
@AutoValue
@Immutable
public abstract class VersionSet {
  public abstract ImmutableList<Version> versions();
  public abstract ImmutableList<VersionRange> versionRanges();
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `common/src/main/java/com/google/tsunami/common/version/VersionSet.java`
#### Snippet
```java
  /** Builder for {@link VersionSet}. */
  @AutoValue.Builder
  public abstract static class Builder {
    abstract ImmutableList.Builder<Version> versionsBuilder();
    public Builder addVersion(Version version) {
```

### AbstractClassNeverImplemented
Abstract class `Builder` has no concrete subclass
in `plugin/src/main/java/com/google/tsunami/plugin/PluginExecutor.java`
#### Snippet
```java

    @AutoValue.Builder
    public abstract static class Builder<T> {
      @SuppressWarnings("rawtypes")  // AutoValue bug for not handling generic correctly.
      public abstract Builder<T> setMatchedPlugin(PluginMatchingResult matchedPlugin);
```

### AbstractClassNeverImplemented
Abstract class `PluginExecutorConfig` has no concrete subclass
in `plugin/src/main/java/com/google/tsunami/plugin/PluginExecutor.java`
#### Snippet
```java
  /** Configures a plugin's core business logic to be executed by the {@link PluginExecutor}. */
  @AutoValue
  abstract class PluginExecutorConfig<T> {
    @SuppressWarnings("rawtypes")  // AutoValue bug for not handling generic correctly in this case.
    public abstract PluginMatchingResult matchedPlugin();
```

## RuleId[id=NullableProblems]
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
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `common/src/main/java/com/google/tsunami/common/command/CommandExecutor.java`
#### Snippet
```java
  private Process process;
  @Nullable private String output;
  @Nullable private String error;

  public CommandExecutor(String... args) {
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
            .flatMap(
                detectionResult ->
                    detectionResult.resultData().get().getDetectionReportsList().stream())
            .collect(toImmutableList());
    ImmutableList<String> failedPlugins =
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

## RuleId[id=UnstableApiUsage]
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
'transform(com.google.common.base.Function, java.util.concurrent.Executor)' is declared in unstable class 'com.google.common.util.concurrent.FluentFuture' marked with @Beta
in `plugin/src/main/java/com/google/tsunami/plugin/PluginExecutorImpl.java`
#### Snippet
```java
                }))
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

