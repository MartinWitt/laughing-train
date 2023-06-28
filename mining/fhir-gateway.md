# fhir-gateway 
 
# Bad smells
I found 26 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldCanBeLocal | 6 | false |
| DataFlowIssue | 5 | false |
| JavadocLinkAsPlainText | 4 | false |
| UnstableApiUsage | 4 | false |
| MismatchedCollectionQueryUpdate | 2 | false |
| UNCHECKED_WARNING | 1 | false |
| MismatchedJavadocCode | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| ConstantValue | 1 | false |
| RegExpRedundantEscape | 1 | false |
## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map\>'
in `server/src/main/java/com/google/fhir/gateway/PatientFinderImp.java`
#### Snippet
```java
    String pathsJson = readResource("patient_paths.json");
    Gson gson = new Gson();
    final Map<String, List<String>> patientFhirPaths = gson.fromJson(pathsJson, Map.class);
    instance = new PatientFinderImp(fhirContext, patientFhirPaths, patientSearchParams, true);
    return instance;
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
Argument `authHeader` might be null
in `server/src/main/java/com/google/fhir/gateway/BearerAuthorizationInterceptor.java`
#### Snippet
```java
          logger, "No Authorization header provided!", AuthenticationException.class);
    }
    DecodedJWT decodedJwt = decodeAndVerifyBearerToken(authHeader);
    FhirContext fhirContext = server.getFhirContext();
    AccessDecision allowedQueriesDecision = allowedQueriesChecker.checkAccess(requestDetailsReader);
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

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `plugins/src/main/java/com/google/fhir/gateway/plugin/SmartFhirScope.java`
#### Snippet
```java
   * SMART Permission to specify the kind of permission that is allowed on a Resource. The order of
   * the Permission is important to us in the way it has been listed here. Please see:
   * https://build.fhir.org/ig/HL7/smart-app-launch/scopes-and-launch-context.html#scopes-for-requesting-clinical-data
   * The given order of Permissions is how it is expected that permissions will be specified in the
   * token claim
```

### JavadocLinkAsPlainText
Link specified as plain text
in `plugins/src/main/java/com/google/fhir/gateway/plugin/SmartFhirScope.java`
#### Snippet
```java
 * This class models the SMART-on-FHIR permission scopes that are meant ot be used for accessing
 * clinical data. The constraints in this class are according to the official guidelines here:
 * https://build.fhir.org/ig/HL7/smart-app-launch/scopes-and-launch-context.html#scopes-for-requesting-clinical-data
 */
@Getter
```

### JavadocLinkAsPlainText
Link specified as plain text
in `server/src/main/java/com/google/fhir/gateway/FhirProxyServer.java`
#### Snippet
```java
  /**
   * This is to add a CORS interceptor for adding "Cross-Origin Resource Sharing" headers:
   * https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS. We need this for example for Javascript
   * SMART apps that need to fetch FHIR resources. Enabling CORS on all paths should be fine because
   * we don't rely on cookies for access-tokens and access to any sensitive resource is protected by
```

### JavadocLinkAsPlainText
Link specified as plain text
in `server/src/main/java/com/google/fhir/gateway/FhirProxyServer.java`
#### Snippet
```java
   *
   * <p>We could have used servlet filters but this is the "cleaner" native HAPI solution:
   * https://hapifhir.io/hapi-fhir/docs/security/cors.html. The drawback of this is the extra Spring
   * dependency. It is probably okay as it increased the size of the war file from 35 MB to 38 MB
   * (and opens the door to other Spring goodies too).
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `queryParams` are queried, but never updated
in `server/src/main/java/com/google/fhir/gateway/AllowedQueriesConfig.java`
#### Snippet
```java
    // Case in-sensitive Http request type allowed by the config.
    private String requestType;
    private Map<String, String> queryParams;
    // If true, this means other parameters not listed in `queryParams` are allowed too.
    private boolean allowExtraParams;
```

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

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `plugins/src/main/java/com/google/fhir/gateway/plugin/SmartFhirScope.java`
#### Snippet
```java
  private final Principal principal;
  private final String resourceType;
  private final Set<Permission> permissions;

  private SmartFhirScope(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `plugins/src/main/java/com/google/fhir/gateway/plugin/SmartFhirScope.java`
#### Snippet
```java
  private static final String SMART_V1_WRITE_RESOURCE_PERMISSIONS = "write";

  private final Principal principal;
  private final String resourceType;
  private final Set<Permission> permissions;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `plugins/src/main/java/com/google/fhir/gateway/plugin/SmartFhirScope.java`
#### Snippet
```java

  private final Principal principal;
  private final String resourceType;
  private final Set<Permission> permissions;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `server/src/main/java/com/google/fhir/gateway/BundlePatients.java`
#### Snippet
```java
public class BundlePatients {

  private final ImmutableList<ImmutableSet<String>> referencedPatients;
  private final ImmutableSet<String> updatedPatients;
  private final boolean patientsToCreate;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `server/src/main/java/com/google/fhir/gateway/BundlePatients.java`
#### Snippet
```java
  private final boolean patientsToCreate;

  private final ImmutableSet<String> deletedPatients;

  private BundlePatients(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `server/src/main/java/com/google/fhir/gateway/BundlePatients.java`
#### Snippet
```java

  private final ImmutableList<ImmutableSet<String>> referencedPatients;
  private final ImmutableSet<String> updatedPatients;
  private final boolean patientsToCreate;

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

