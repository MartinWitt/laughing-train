# microprofile-lra 
 
# Bad smells
I found 40 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldMayBeFinal | 10 | false |
| AutoCloseableResource | 6 | false |
| DuplicatedCode | 6 | false |
| NewClassNamingConvention | 4 | false |
| UastIncorrectHttpHeaderInspection | 3 | false |
| DefaultAnnotationParam | 2 | false |
| JUnitMalformedDeclaration | 2 | false |
| CdiInjectionPointsInspection | 2 | false |
| JavadocReference | 1 | false |
| JavadocDeclaration | 1 | false |
| NonFinalFieldInEnum | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| JavadocLinkAsPlainText | 1 | false |
## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/participant/api/ContextTckResource.java`
#### Snippet
```java

    @LRA(value = LRA.Type.REQUIRED, // the method must run with an LRA
            end = true, // the LRA must end when the method completes
            cancelOnFamily = Response.Status.Family.SERVER_ERROR, // cancel LRA on any 5xx code
            cancelOn = NOT_FOUND) // cancel LRA on 404
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/participant/api/LraResource.java`
#### Snippet
```java
    @PUT
    @Path("/nestedActivity")
    @LRA(value = LRA.Type.NESTED, end = true)
    public Response nestedActivity(@HeaderParam(LRA_HTTP_RECOVERY_HEADER) URI recoveryId,
            @HeaderParam(LRA_HTTP_CONTEXT_HEADER) URI nestedLRAId) {
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/TckParticipantTests.java`
#### Snippet
```java
                .path(LongBusinessMethodParticipant.SYNC_METHOD)
                .request()
                .put(Entity.text(""));
        Assert.assertEquals("Endpoint " + LongBusinessMethodParticipant.SYNC_METHOD + " failed execution",
                200, syncMethodResponse.getStatus());
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/TckTests.java`
#### Snippet
```java
                    .request()
                    .header(LRA_HTTP_CONTEXT_HEADER, uris[1])
                    .put(Entity.text(""));

            lraClient.closeLRA(lra); // should not complete any nested LRAs (since they have already completed via the
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/TckRecoveryTests.java`
#### Snippet
```java
                .path(RecoveryResource.RECOVERY_RESOURCE_PATH)
                .path(RecoveryResource.REQUIRED_PATH)
                .request().put(Entity.text(""));

        Assert.assertEquals(200, response.getStatus());
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/TckRecoveryTests.java`
#### Snippet
```java
                .path(RecoveryResource.RECOVERY_RESOURCE_PATH)
                .path(RecoveryResource.REQUIRED_TIMEOUT_PATH)
                .request().put(Entity.text(""));

        Assert.assertEquals(200, response.getStatus());
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/LRAClientOps.java`
#### Snippet
```java

    private void leaveLRA(URI lra, String basePath, String resourcePath) throws GenericLRAException {
        invokeRestEndpoint(lra, basePath, resourcePath, 200);
    }

```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/LRAClientOps.java`
#### Snippet
```java
    public URI startLRA(URI parentLRA, String clientID, long timeout, ChronoUnit unit)
            throws GenericLRAException {
        String lra = invokeRestEndpoint(parentLRA,
                TCK_NON_PARTICIPANT_RESOURCE_PATH, START_BUT_DONT_END_PATH, 200)
                        .readEntity(String.class);
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `Deployment`
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/TckRecoveryTests.java`
#### Snippet
```java
 * <p>
 * This test is meant to be run in "run as client mode controlling the behaviour not via CDI injection but via HTTP
 * calls. The @{@link Deployment} is defined as <code>managed = false</code> which means that Arquillian does not
 * automatically deploy the deployment at the start of the test and the test control this step on its own.
 * </p>
```

## RuleId[id=JUnitMalformedDeclaration]
### JUnitMalformedDeclaration
Method `testCancelWhenParticipantIsRestarted` annotated with '@Test' should not declare parameter 'deploymentURL'
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/TckRecoveryTests.java`
#### Snippet
```java
     */
    @Test
    public void testCancelWhenParticipantIsRestarted(@ArquillianResource URL deploymentURL) {
        clientServiceSetup(deploymentURL);

```

### JUnitMalformedDeclaration
Method `testCancelWhenParticipantIsUnavailable` annotated with '@Test' should not declare parameter 'deploymentURL'
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/TckRecoveryTests.java`
#### Snippet
```java
     */
    @Test
    public void testCancelWhenParticipantIsUnavailable(@ArquillianResource URL deploymentURL) {
        clientServiceSetup(deploymentURL);

```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Javadoc pointing to itself
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/participant/api/LraCancelOnResource.java`
#### Snippet
```java
     * The remote REST call invokes the same resource class {@link LraCancelOnResource} That assumes the call to the
     * representative of the same LRA participant as it's already enlisted by the method
     * {@link #cancelFromRemoteCall(java.net.URI, jakarta.ws.rs.core.UriInfo)} invoked by the test. Because the
     * specification mandates that the same participant can be enlisted only once per LRA instance then the
     * {@link Compensate} method {@link #compensateWork(URI)} will be called only once for the test invocation.
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `scenarioMap` may be 'final'
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/participant/api/LRAUnknownResource.java`
#### Snippet
```java
    private static final String AFTER_LRA = "/after";

    private Map<String, Scenario> scenarioMap = new HashMap<>();

    @Inject
```

### FieldMayBeFinal
Field `lraRecoveryService` may be 'final'
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/service/LRATestService.java`
#### Snippet
```java
    private WebTarget tckSuiteTarget;

    private LRARecoveryService lraRecoveryService = loadService(LRARecoveryService.class);

    @Inject
```

### FieldMayBeFinal
Field `lraId` may be 'final'
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/participant/api/GenericLRAException.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    private URI lraId;

    public URI getLraId() {
```

### FieldMayBeFinal
Field `syncLatch` may be 'final'
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/participant/nonjaxrs/valid/LongBusinessMethodParticipant.java`
#### Snippet
```java

    private CountDownLatch businessLatch = new CountDownLatch(1);
    private CountDownLatch syncLatch = new CountDownLatch(1);

    @Inject
```

### FieldMayBeFinal
Field `businessLatch` may be 'final'
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/participant/nonjaxrs/valid/LongBusinessMethodParticipant.java`
#### Snippet
```java
    private static final Logger LOGGER = Logger.getLogger(LongBusinessMethodParticipant.class.getName());

    private CountDownLatch businessLatch = new CountDownLatch(1);
    private CountDownLatch syncLatch = new CountDownLatch(1);

```

### FieldMayBeFinal
Field `scenarioMap` may be 'final'
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/participant/api/LRAUnknownStatusResource.java`
#### Snippet
```java
    private static final String AFTER_LRA = "/after";

    private Map<String, Scenario> scenarioMap = new HashMap<>();

    @Inject
```

### FieldMayBeFinal
Field `metricsPerLra` may be 'final'
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/service/LRAMetricService.java`
#### Snippet
```java
public class LRAMetricService {

    private Map<URI, Map<String, LRAMetric>> metricsPerLra = new HashMap<>();

    /**
```

### FieldMayBeFinal
Field `metrics` may be 'final'
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/service/LRAMetricService.java`
#### Snippet
```java
     */
    private static class LRAMetric {
        private Map<LRAMetricType, AtomicInteger> metrics = Arrays.stream(LRAMetricType.values())
                .collect(Collectors.toMap(Function.identity(), t -> new AtomicInteger(0)));

```

### FieldMayBeFinal
Field `pathResponseCode` may be 'final'
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/participant/api/Scenario.java`
#### Snippet
```java
    COMPENSATE_IMMEDIATE(500), COMPENSATE_RETRY(500), COMPLETE_IMMEDIATE(200), COMPLETE_RETRY(200);

    private int pathResponseCode;

    Scenario(int pathResponseCode) {
```

### FieldMayBeFinal
Field `activities` may be 'final'
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/participant/activity/ActivityStorage.java`
#### Snippet
```java
@ApplicationScoped
public class ActivityStorage {
    private Map<URI, Activity> activities = new HashMap<>();

    public Activity getActivityAndAssertExistence(URI lraId, UriInfo jaxrsContext) {
```

## RuleId[id=UastIncorrectHttpHeaderInspection]
### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/participant/api/ContextTckResource.java`
#### Snippet
```java
    // from the LRA implementation (complete, compensate, forget and status)
    public static final String LRA_TCK_FAULT_TYPE_HEADER = "Lra-Tck-Fault-Type";
    public static final String LRA_TCK_FAULT_CODE_HEADER = "Lra-Tck-Fault-Status";

    // a header for tests to indicate which LRA stats are being queried/reset
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/participant/api/ContextTckResource.java`
#### Snippet
```java

    // a header for tests to indicate which LRA stats are being queried/reset
    public static final String LRA_TCK_HTTP_CONTEXT_HEADER = "Lra-Tck-Context";

    private static final String REQUIRES_NEW_LRA_PATH = "/requires-new-lra";
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/participant/api/ContextTckResource.java`
#### Snippet
```java
    // headers for tests to indicate how the participant should respond to callbacks
    // from the LRA implementation (complete, compensate, forget and status)
    public static final String LRA_TCK_FAULT_TYPE_HEADER = "Lra-Tck-Fault-Type";
    public static final String LRA_TCK_FAULT_CODE_HEADER = "Lra-Tck-Fault-Status";

```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `pathResponseCode` in enum 'Scenario'
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/participant/api/Scenario.java`
#### Snippet
```java
    COMPENSATE_IMMEDIATE(500), COMPENSATE_RETRY(500), COMPLETE_IMMEDIATE(200), COMPLETE_RETRY(200);

    private int pathResponseCode;

    Scenario(int pathResponseCode) {
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/TckContextTests.java`
#### Snippet
```java
        URI lra = URI.create(invoke(REQUIRED_LRA_PATH, PUT, null, 200, ContextTckResource.EndPhase.ACCEPTED, 202));

        // verify that the resource was asked to complete and is in the state Completing
        String status = invoke(STATUS_PATH, HttpMethod.GET, lra, 202, ContextTckResource.EndPhase.SUCCESS, 200);
        lraTestService.waitForCallbacks(lra);
        assertEquals(testName.getMethodName() + ": participant is not completing", ParticipantStatus.Completing.name(),
                status);
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/TckTests.java`
#### Snippet
```java
        URI lra = lraClient.startLRA(null, lraClientId(), lraTimeout(), ChronoUnit.MILLIS);

        WebTarget resourcePath = tckSuiteTarget.path(LRA_RESOURCE_PATH).path(TRANSACTIONAL_WORK_PATH);
        Response response = resourcePath
                .request().header(LRA_HTTP_CONTEXT_HEADER, lra).put(Entity.text(""));

        checkStatusAndCloseResponse(Response.Status.OK, response, resourcePath);
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/TckTests.java`
#### Snippet
```java
        WebTarget resource1Path = tckSuiteTarget.path(TCK_PARTICIPANT_RESOURCE_PATH).path(resource1Method);
        WebTarget resource2Path = tckSuiteTarget.path(TCK_PARTICIPANT_RESOURCE_PATH).path(resource2Method);

        URI lra = lraClient.startLRA(null, lraClientId(), lraTimeout(), ChronoUnit.MILLIS);

        // invoke the same JAX-RS resources twice in the context of the lra which should enlist the resource only once:
        Response response1 = resource1Path.request().header(LRA_HTTP_CONTEXT_HEADER, lra).put(Entity.text(""));
        checkStatusAndCloseResponse(Response.Status.OK, response1, resource1Path);
        Response response2 = resource2Path.request().header(LRA_HTTP_CONTEXT_HEADER, lra).put(Entity.text(""));
        checkStatusAndCloseResponse(Response.Status.OK, response2, resource2Path);
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/participant/api/ContextTckResource.java`
#### Snippet
```java
        if (response.hasEntity()) {
            id = response.readEntity(String.class);
        }

        try {
            if (response.getStatus() != Response.Status.OK.getStatusCode()) {
                throw new WebApplicationException("Error on REST PUT for LRA '" + lraURI
                        + "' at path '" + path + "' and body '" + bodyText + "'", response);
            }
        } finally {
            response.close();
        }

        return id;
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/participant/api/LRAUnknownResource.java`
#### Snippet
```java
        int responseCode = 410;
        Scenario scenario = scenarioMap.get(lraId.toASCIIString());
        if (scenario == Scenario.COMPLETE_RETRY) {
            responseCode = 202; // The 'action' is in progress
            scenarioMap.remove(lraId.toASCIIString()); // so that by next call the return status is 410.
        }

        LOGGER.info(String.format("LRA id '%s' was completed", lraId.toASCIIString()));
        return Response.status(responseCode).build();
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/participant/api/LRAUnknownResource.java`
#### Snippet
```java
        int responseCode = 410;
        Scenario scenario = scenarioMap.get(lraId.toASCIIString());
        if (scenario == Scenario.COMPENSATE_RETRY) {
            responseCode = 202; // The 'action' is in progress
            scenarioMap.remove(lraId.toASCIIString()); // so that by next call the return status is 410.
        }

        LOGGER.info(String.format("LRA id '%s' was compensated", lraId));
        return Response.status(responseCode).build();
```

## RuleId[id=NewClassNamingConvention]
### NewClassNamingConvention
Test class name `DeploymentNameRule` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/TckInvalidSignaturesTests.java`
#### Snippet
```java
    }

    private static final class DeploymentNameRule extends TestName {

        String deploymentName;
```

### NewClassNamingConvention
Test class name `HttpMethod` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/TckContextTests.java`
#### Snippet
```java
public class TckContextTests extends TckTestBase {

    enum HttpMethod {
        GET, PUT, POST
    }
```

### NewClassNamingConvention
Test class name `CompletionType` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/TckTests.java`
#### Snippet
```java
    private LRATestService lraTestService;

    private enum CompletionType {
        complete, compensate, mixed
    }
```

### NewClassNamingConvention
Test class name `MethodLRACheck` doesn't match regex '\[A-Z\]\[A-Za-z\\d\]\*Test(s\|Case)?\|Test\[A-Z\]\[A-Za-z\\d\]\*\|IT(.\*)\|(.\*)IT(Case)?'
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/TckLRATypeTests.java`
#### Snippet
```java

    // enum to indicate which checks to perform on the expected and actual active LRA after running a resource method
    private enum MethodLRACheck {
        NONE, NOT_PRESENT, EQUALS, NOT_EQUALS
    }
```

## RuleId[id=CdiInjectionPointsInspection]
### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/LraTckConfigBean.java`
#### Snippet
```java
    @Inject
    @ConfigProperty(name = LRA_TCK_BASE_URL_PROPERTY_NAME, defaultValue = "http://localhost:8180/")
    private String tckSuiteBaseUrl;

    /**
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/LraTckConfigBean.java`
#### Snippet
```java
    @Inject
    @ConfigProperty(name = LRA_TCK_TIMEOUT_FACTOR_PROPETY_NAME, defaultValue = "1.0")
    private double timeoutFactor;

    /**
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `LRATask` may be 'static'
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/LRAClientOps.java`
#### Snippet
```java

    // class to store the clientId associated with an LRA
    private class LRATask {
        final String clientId; // client assigned arbitrary identifier for the LRA
        final URI lra; // the LRA that clientId is associated with
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/LraTckConfigBean.java`
#### Snippet
```java
     * paths will be constructed based on this base URL.
     * <p>
     * The default base URL where TCK suite is expected to be started is <code>http://localhost:8180/</code>.
     */
    @Inject
```

