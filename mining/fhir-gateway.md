# fhir-gateway 
 
# Bad smells
I found 45 bad smells with 6 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 9 | false |
| DataFlowIssue | 7 | false |
| UtilityClassWithoutPrivateConstructor | 5 | true |
| RedundantFieldInitialization | 4 | false |
| BoundedWildcard | 4 | false |
| UnstableApiUsage | 4 | false |
| DynamicRegexReplaceableByCompiledPattern | 2 | false |
| NestedAssignment | 1 | false |
| ReplaceNullCheck | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| RegExpRedundantEscape | 1 | false |
| MismatchedJavadocCode | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| SetReplaceableByEnumSet | 1 | false |
| ConstantValue | 1 | false |
| IgnoreResultOfCall | 1 | false |
## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `FhirUtil` has only 'static' members, and lacks a 'private' constructor
in `server/src/main/java/com/google/fhir/gateway/FhirUtil.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class FhirUtil {

  private static final Logger logger = LoggerFactory.getLogger(FhirUtil.class);
```

### UtilityClassWithoutPrivateConstructor
Class `ExceptionUtil` has only 'static' members, and lacks a 'private' constructor
in `server/src/main/java/com/google/fhir/gateway/ExceptionUtil.java`
#### Snippet
```java
import org.slf4j.Logger;

public class ExceptionUtil {

  static <T extends RuntimeException> void throwRuntimeExceptionAndLog(
```

### UtilityClassWithoutPrivateConstructor
Class `JwtUtil` has only 'static' members, and lacks a 'private' constructor
in `server/src/main/java/com/google/fhir/gateway/JwtUtil.java`
#### Snippet
```java
import com.auth0.jwt.interfaces.DecodedJWT;

public class JwtUtil {
  public static String getClaimOrDie(DecodedJWT jwt, String claimName) {
    Claim claim = jwt.getClaim(claimName);
```

### UtilityClassWithoutPrivateConstructor
Class `ProxyConstants` has only 'static' members, and lacks a 'private' constructor
in `server/src/main/java/com/google/fhir/gateway/ProxyConstants.java`
#### Snippet
```java
import org.apache.http.entity.ContentType;

public class ProxyConstants {

  // Note we should not set charset here; otherwise GCP FHIR store complains about Content-Type.
```

### UtilityClassWithoutPrivateConstructor
Class `MainApp` has only 'static' members, and lacks a 'private' constructor
in `exec/src/main/java/com/google/fhir/gateway/MainApp.java`
#### Snippet
```java
@SpringBootApplication
@ServletComponentScan
public class MainApp {

  public static void main(String[] args) {
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `server/src/main/java/com/google/fhir/gateway/GcpFhirClient.java`
#### Snippet
```java
  public GcpFhirClient(String gcpFhirStore, GoogleCredentials credentials) throws IOException {
    // Remove trailing '/'s since proxy's base URL has no trailing '/'.
    this.gcpFhirStore = gcpFhirStore.replaceAll("/+$", "");
    this.credentials = credentials;

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `plugins/src/main/java/com/google/fhir/gateway/plugin/PatientAccessChecker.java`
#### Snippet
```java
    private SmartScopeChecker getSmartFhirPermissionChecker(DecodedJWT jwt) {
      String scopesClaim = JwtUtil.getClaimOrDie(jwt, SCOPES_CLAIM);
      String[] scopes = scopesClaim.strip().split("\\s+");
      return new SmartScopeChecker(
          SmartFhirScope.extractSmartFhirScopesFromTokens(Arrays.asList(scopes)),
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getTokenValue` may produce `NullPointerException`
in `server/src/main/java/com/google/fhir/gateway/GcpFhirClient.java`
#### Snippet
```java
      ExceptionUtil.throwRuntimeExceptionAndLog(logger, "Cannot get an access token!");
    }
    return accessToken.getTokenValue();
  }

```

### DataFlowIssue
Argument `authHeader` might be null
in `server/src/main/java/com/google/fhir/gateway/BearerAuthorizationInterceptor.java`
#### Snippet
```java
          logger, "No Authorization header provided!", AuthenticationException.class);
    }
    DecodedJWT decodedJwt = decodeAndVerifyBearerToken(authHeader);
    FhirContext fhirContext = server.getFhirContext();
    RequestDetailsReader requestDetailsReader = new RequestDetailsToReader(requestDetails);
```

### DataFlowIssue
Method invocation `checkAccess` may produce `NullPointerException`
in `server/src/main/java/com/google/fhir/gateway/BearerAuthorizationInterceptor.java`
#### Snippet
```java
          logger, "Cannot create an AccessChecker!", AuthenticationException.class);
    }
    AccessDecision outcome = accessChecker.checkAccess(requestDetailsReader);
    if (!outcome.canAccess()) {
      ExceptionUtil.throwRuntimeExceptionAndLog(
```

### DataFlowIssue
Method invocation `getIssuer` may produce `NullPointerException`
in `server/src/main/java/com/google/fhir/gateway/BearerAuthorizationInterceptor.java`
#### Snippet
```java
          logger, "Failed to decode JWT: " + e.getMessage(), e, AuthenticationException.class);
    }
    String issuer = jwt.getIssuer();
    String algorithm = jwt.getAlgorithm();
    JWTVerifier jwtVerifier = buildJwtVerifier(issuer);
```

### DataFlowIssue
Method invocation `verify` may produce `NullPointerException`
in `server/src/main/java/com/google/fhir/gateway/BearerAuthorizationInterceptor.java`
#### Snippet
```java
    DecodedJWT verifiedJwt = null;
    try {
      verifiedJwt = jwtVerifier.verify(jwt);
    } catch (JWTVerificationException e) {
      // Throwing an AuthenticationException instead since it is handled by HAPI and a 401
```

### DataFlowIssue
Casting `resource` to `Bundle` may produce `ClassCastException`
in `server/src/main/java/com/google/fhir/gateway/PatientFinderImp.java`
#### Snippet
```java
          logger, "The provided resource is not a Bundle!", InvalidRequestException.class);
    }
    Bundle bundle = (Bundle) resource;

    if (bundle.getType() != BundleType.TRANSACTION) {
```

### DataFlowIssue
Method invocation `getType` may produce `NullPointerException`
in `server/src/main/java/com/google/fhir/gateway/PatientFinderImp.java`
#### Snippet
```java
    Bundle bundle = (Bundle) resource;

    if (bundle.getType() != BundleType.TRANSACTION) {
      // Currently, support only for transaction bundles; see:
      //   https://github.com/google/fhir-access-proxy/issues/67
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `server/src/main/java/com/google/fhir/gateway/BearerAuthorizationInterceptor.java`
#### Snippet
```java
    int numMatched = 0;
    int n;
    while ((n = entityContentReader.read()) >= 0) {
      char c = (char) n;
      if (fhirStoreUrl.charAt(numMatched) == c) {
```

## RuleId[id=ReplaceNullCheck]
### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElseGet()'
in `server/src/main/java/com/google/fhir/gateway/ExceptionUtil.java`
#### Snippet
```java
    Preconditions.checkNotNull(runTimeExceptionClass);
    // logging the error message followed by the stack trace.
    if (origException == null) {
      logger.error(errorMessage, new Exception("stack-trace"));
    } else {
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `accessCheckerFactories` are queried, but never updated
in `server/src/main/java/com/google/fhir/gateway/FhirProxyServer.java`
#### Snippet
```java
  //   But this implicitly means that the wrapper executable code (or container) should enable
  //   Spring's automatic scanning.
  @Autowired private Map<String, AccessCheckerFactory> accessCheckerFactories;

  static boolean isDevMode() {
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `plugins/src/main/java/com/google/fhir/gateway/plugin/SmartFhirScope.java`
#### Snippet
```java
  private static final Pattern VALID_SCOPE_PATTERN =
      Pattern.compile(
          "(\\buser|patient|system\\b)(\\/((\\*)|([a-zA-Z]+)))(\\.((\\*)|([cruds]+)|(\\bread|write\\b)))");
  static final String ALL_RESOURCE_TYPES_WILDCARD = "*";
  private static final String ALL_RESOURCE_PERMISSIONS_WILDCARD = "*";
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `server/src/main/java/com/google/fhir/gateway/CapabilityPostProcessor.java`
#### Snippet
```java
          + "header containing a JWT access token. This token must have been issued by the "
          + "authorization server defined by the configured TOKEN_ISSUER.";
  private static CapabilityPostProcessor instance = null;

  private final FhirContext fhirContext;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `server/src/main/java/com/google/fhir/gateway/AllowedQueriesChecker.java`
#### Snippet
```java
  private static final Logger logger = LoggerFactory.getLogger(AllowedQueriesChecker.class);

  private AllowedQueriesConfig config = null;

  AllowedQueriesChecker(String configFile) throws IOException {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `server/src/main/java/com/google/fhir/gateway/BundlePatients.java`
#### Snippet
```java
    private final Set<String> deletedPatients = Sets.newHashSet();
    private final List<ImmutableSet<String>> referencedPatients = Lists.newArrayList();
    private boolean patientsToCreate = false;

    public BundlePatientsBuilder addUpdatePatients(Set<String> patientsToUpdate) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `server/src/main/java/com/google/fhir/gateway/PatientFinderImp.java`
#### Snippet
```java
public final class PatientFinderImp implements PatientFinder {
  private static final Logger logger = LoggerFactory.getLogger(PatientFinderImp.class);
  private static PatientFinderImp instance = null;
  private static final String PATCH_OPERATION = "op";
  private static final String PATCH_OP_REPLACE = "replace";
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `plugins/src/main/java/com/google/fhir/gateway/plugin/ListAccessChecker.java`
#### Snippet
```java
   *
   * @param requestDetails the original request sent to the proxy.
   * @return true iff patient is in the patient-list associated to the current user.
   */
  @Override
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-14-17-42-06.487.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `server/src/main/java/com/google/fhir/gateway/FhirUtil.java`
#### Snippet
```java
  public static String getIdOrNull(RequestDetailsReader requestDetails) {
    if (requestDetails.getId() == null) {
      return null;
    }
    return requestDetails.getId().getIdPart();
```

### ReturnNull
Return of `null`
in `server/src/main/java/com/google/fhir/gateway/HttpUtil.java`
#### Snippet
```java
          logger, "Error in building URI for resource " + uriString);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `server/src/main/java/com/google/fhir/gateway/interfaces/NoOpAccessDecision.java`
#### Snippet
```java
  @Override
  public String postProcess(HttpResponse response) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `server/src/main/java/com/google/fhir/gateway/BearerAuthorizationInterceptor.java`
#### Snippet
```java
    }
    // We should never get here, this is to keep the IDE happy!
    return null;
  }

```

### ReturnNull
Return of `null`
in `server/src/main/java/com/google/fhir/gateway/BearerAuthorizationInterceptor.java`
#### Snippet
```java
          String.format("The token issuer %s does not match the expected token issuer", issuer),
          AuthenticationException.class);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `plugins/src/main/java/com/google/fhir/gateway/plugin/PatientAccessChecker.java`
#### Snippet
```java
    IBaseResource resource = jsonParser.parseResource(requestContent);
    if (!(resource instanceof Bundle)) {
      return null;
    }
    return (Bundle) resource;
```

### ReturnNull
Return of `null`
in `server/src/main/java/com/google/fhir/gateway/PatientFinderImp.java`
#### Snippet
```java
          e,
          ForbiddenOperationException.class);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `server/src/main/java/com/google/fhir/gateway/PatientFinderImp.java`
#### Snippet
```java
    }
    // It should never reach here!
    return null;
  }

```

### ReturnNull
Return of `null`
in `server/src/main/java/com/google/fhir/gateway/PatientFinderImp.java`
#### Snippet
```java
          "Direct resource fetch is only supported for Patient; use search for " + resourceName,
          InvalidRequestException.class);
      return null;
    }
    Map<String, String[]> queryParams = requestDetails.getParameters();
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `builder` is redundant
in `server/src/main/java/com/google/fhir/gateway/AllowedQueriesConfig.java`
#### Snippet
```java
    @Override
    public String toString() {
      String builder =
          "path="
              + path
```

## RuleId[id=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `plugins/src/main/java/com/google/fhir/gateway/plugin/SmartFhirScope.java`
#### Snippet
```java

  private static Set<Permission> extractPermissions(String permissionString) {
    Set<Permission> permissions = new HashSet<>();
    if (ALL_RESOURCE_PERMISSIONS_WILDCARD.equals(permissionString)) {
      permissions.addAll(List.of(Permission.values()));
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends List`
in `server/src/main/java/com/google/fhir/gateway/PatientFinderImp.java`
#### Snippet
```java
  private PatientFinderImp(
      FhirContext fhirContext,
      Map<String, List<String>> patientFhirPaths,
      Map<String, List<String>> patientSearchParams,
      boolean blockJoins) {
```

### BoundedWildcard
Can generalize to `? extends List`
in `server/src/main/java/com/google/fhir/gateway/PatientFinderImp.java`
#### Snippet
```java
      FhirContext fhirContext,
      Map<String, List<String>> patientFhirPaths,
      Map<String, List<String>> patientSearchParams,
      boolean blockJoins) {
    this.fhirContext = fhirContext;
```

### BoundedWildcard
Can generalize to `? super String`
in `server/src/main/java/com/google/fhir/gateway/PatientFinderImp.java`
#### Snippet
```java
  private static void makeSearchParamMap(
      CompartmentDefinition patientCompartment,
      final Map<String, List<String>> patientSearchParams) {
    for (CompartmentDefinitionResourceComponent resource : patientCompartment.getResource()) {
      String resourceType = resource.getCode();
```

### BoundedWildcard
Can generalize to `? super List`
in `server/src/main/java/com/google/fhir/gateway/PatientFinderImp.java`
#### Snippet
```java
  private static void makeSearchParamMap(
      CompartmentDefinition patientCompartment,
      final Map<String, List<String>> patientSearchParams) {
    for (CompartmentDefinitionResourceComponent resource : patientCompartment.getResource()) {
      String resourceType = resource.getCode();
```

## RuleId[id=ConstantValue]
### ConstantValue
Result of `SIGN_ALGORITHM.equals("RS256")` is always 'true'
in `server/src/main/java/com/google/fhir/gateway/BearerAuthorizationInterceptor.java`
#### Snippet
```java
  private RSAPublicKey fetchAndDecodePublicKey() throws IOException {
    // Preconditions.checkState(SIGN_ALGORITHM.equals("ES512"));
    Preconditions.checkState(SIGN_ALGORITHM.equals("RS256"));
    // final String keyAlgorithm = "EC";
    final String keyAlgorithm = "RSA";
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.io.Resources' is marked unstable with @Beta
in `server/src/main/java/com/google/fhir/gateway/PatientFinderImp.java`
#### Snippet
```java
    try {
      // TODO make sure relative addresses are handled properly and that @Beta is okay.
      URL url = Resources.getResource(resourcePath);
      logger.info("Loading patient compartment definition from " + url);
      return Resources.toString(url, StandardCharsets.UTF_8);
```

### UnstableApiUsage
'getResource(java.lang.String)' is declared in unstable class 'com.google.common.io.Resources' marked with @Beta
in `server/src/main/java/com/google/fhir/gateway/PatientFinderImp.java`
#### Snippet
```java
    try {
      // TODO make sure relative addresses are handled properly and that @Beta is okay.
      URL url = Resources.getResource(resourcePath);
      logger.info("Loading patient compartment definition from " + url);
      return Resources.toString(url, StandardCharsets.UTF_8);
```

### UnstableApiUsage
'com.google.common.io.Resources' is marked unstable with @Beta
in `server/src/main/java/com/google/fhir/gateway/PatientFinderImp.java`
#### Snippet
```java
      URL url = Resources.getResource(resourcePath);
      logger.info("Loading patient compartment definition from " + url);
      return Resources.toString(url, StandardCharsets.UTF_8);
    } catch (IOException e) {
      ExceptionUtil.throwRuntimeExceptionAndLog(
```

### UnstableApiUsage
'toString(java.net.URL, java.nio.charset.Charset)' is declared in unstable class 'com.google.common.io.Resources' marked with @Beta
in `server/src/main/java/com/google/fhir/gateway/PatientFinderImp.java`
#### Snippet
```java
      URL url = Resources.getResource(resourcePath);
      logger.info("Loading patient compartment definition from " + url);
      return Resources.toString(url, StandardCharsets.UTF_8);
    } catch (IOException e) {
      ExceptionUtil.throwRuntimeExceptionAndLog(
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `ResourceType.fromCode()` is ignored
in `server/src/main/java/com/google/fhir/gateway/FhirUtil.java`
#### Snippet
```java
  public static boolean isValidFhirResourceType(String resourceType) {
    try {
      ResourceType.fromCode(resourceType);
      return true;
    } catch (FHIRException fe) {
```

