# microprofile-lra 
 
# Bad smells
I found 43 bad smells with 4 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 16 | false |
| EmptyMethod | 4 | false |
| AssignmentToMethodParameter | 4 | false |
| RedundantMethodOverride | 2 | false |
| DefaultAnnotationParam | 2 | false |
| JUnitMalformedDeclaration | 2 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| StaticCallOnSubclass | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| CodeBlock2Expr | 1 | true |
| AssignmentToStaticFieldFromInstanceMethod | 1 | false |
| RedundantFieldInitialization | 1 | false |
| ReturnNull | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| SizeReplaceableByIsEmpty | 1 | true |
| NonFinalFieldOfException | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| MissortedModifiers | 1 | false |
| TestCaseWithNoTestMethods | 1 | false |
## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `before()` only delegates to its super method
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/TckUnknownStatusTests.java`
#### Snippet
```java

    @Before
    public void before() {
        super.before();
    }
```

### RedundantMethodOverride
Method `before()` only delegates to its super method
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/TckUnknownTests.java`
#### Snippet
```java

    @Before
    public void before() {
        super.before();
    }
```

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

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Builder` has only 'static' members, and lacks a 'private' constructor
in `api/src/main/java/org/eclipse/microprofile/lra/LRAResponse.java`
#### Snippet
```java
    }

    public static final class Builder {
        public static Response.ResponseBuilder compensated() {
            return Response.ok();
```

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `deploy()` declared in class 'org.eclipse.microprofile.lra.tck.TckTestBase' but referenced via subclass 'org.eclipse.microprofile.lra.tck.TckUnknownStatusTests'
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/TckUnknownStatusTests.java`
#### Snippet
```java
    @Deployment(name = "tckunkownstatus")
    public static WebArchive deploy() {
        return TckUnknownStatusTests.deploy(TckUnknownStatusTests.class.getSimpleName().toLowerCase());
    }

```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/participant/api/LraCancelOnResource.java`
#### Snippet
```java
     * The remote REST call invokes the same resource class {@link LraCancelOnResource} That assumes the call to the
     * representative of the same LRA participant as it's already enlisted by the method
     * {@link #cancelFromRemoteCall(java.net.URI, jakarta.ws.rs.core.UriInfo)} invoked by the test. Because the
     * specification mandates that the same participant can be enlisted only once per LRA instance then the
     * {@link Compensate} method {@link #compensateWork(URI)} will be called only once for the test invocation.
```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.ws.rs.core` is unnecessary and can be removed
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/participant/api/LraCancelOnResource.java`
#### Snippet
```java
     * The remote REST call invokes the same resource class {@link LraCancelOnResource} That assumes the call to the
     * representative of the same LRA participant as it's already enlisted by the method
     * {@link #cancelFromRemoteCall(java.net.URI, jakarta.ws.rs.core.UriInfo)} invoked by the test. Because the
     * specification mandates that the same participant can be enlisted only once per LRA instance then the
     * {@link Compensate} method {@link #compensateWork(URI)} will be called only once for the test invocation.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/lra/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("2.0")
package org.eclipse.microprofile.lra;

```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.ws.rs.core` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/lra/LRAResponse.java`
#### Snippet
```java
/**
 * The utility class that will create the correct {@link Response} or
 * {@link jakarta.ws.rs.core.Response.ResponseBuilder} for the response that should be returned from the LRA JAX-RS
 * methods.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.lra.annotation.ws.rs` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/lra/annotation/Forget.java`
#### Snippet
```java
 * <p>
 * Similar remarks apply if the participant was enlisted in a nested LRA
 * ({@link org.eclipse.microprofile.lra.annotation.ws.rs.LRA.Type#NESTED}). Actions performed in the context of a nested
 * LRA must remain compensatable until the participant is explicitly told it can clean up using this
 * <code>&#64;Forget</code> annotation.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.lra.annotation.ws.rs` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/lra/annotation/AfterLRA.java`
#### Snippet
```java
 * name {@link LRA#LRA_HTTP_ENDED_CONTEXT_HEADER} and the final status is passed to the method as plain text
 * corresponding to one of the {@link LRAStatus} enum values. If this LRA was nested then the parent LRA MUST be present
 * in the header {@link org.eclipse.microprofile.lra.annotation.ws.rs.LRA#LRA_HTTP_PARENT_CONTEXT_HEADER} and value is
 * of type {@link java.net.URI}. For example:
 * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.ws.rs.core` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/lra/annotation/ws/rs/LRA.java`
#### Snippet
```java
     * </p>
     *
     * @return the {@link jakarta.ws.rs.core.Response.Status.Family} status families that will cause cancellation of the
     *         LRA
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.ws.rs.core` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/lra/annotation/ws/rs/LRA.java`
#### Snippet
```java
     * </p>
     *
     * @return the {@link jakarta.ws.rs.core.Response.Status} HTTP status codes that will cause cancellation of the LRA
     */
    Response.Status[] cancelOn() default {};
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.lra.annotation.ws.rs` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/lra/annotation/ws/rs/LRA.java`
#### Snippet
```java
         * nested LRA is started whose outcome depends upon whether or not the enclosing LRA is closed or cancelled. The
         * id of the parent LRA MUST be present in the header with the name
         * {@value org.eclipse.microprofile.lra.annotation.ws.rs.LRA#LRA_HTTP_PARENT_CONTEXT_HEADER} and the value is of
         * type {@link java.net.URI}.
         * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.lra.annotation.ws.rs` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/lra/annotation/ws/rs/LRA.java`
#### Snippet
```java
         * cancel the nested participants will be told to compensate. This implies that the nested participants must be
         * aware that they are nested and the JAX-RS header with the name
         * {@value org.eclipse.microprofile.lra.annotation.ws.rs.LRA#LRA_HTTP_PARENT_CONTEXT_HEADER} is guaranteed to
         * hold the parent context whenever a nested LRA is being propagated.
         * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/TckCancelOnTests.java`
#### Snippet
```java

    /**
     * See {@link LraCancelOnResource#notCancelOnFamily5xx(java.net.URI)}
     */
    @Test
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/TckCancelOnTests.java`
#### Snippet
```java

    /**
     * See {@link LraCancelOnResource#cancelOnFamily3xx(java.net.URI)}
     */
    @Test
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/TckCancelOnTests.java`
#### Snippet
```java

    /**
     * See {@link LraCancelOnResource#cancelOnFamilyDefault5xx(java.net.URI)}
     */
    @Test
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/TckCancelOnTests.java`
#### Snippet
```java

    /**
     * See {@link LraCancelOnResource#cancelOn301(java.net.URI)}
     */
    @Test
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/TckCancelOnTests.java`
#### Snippet
```java

    /**
     * See {@link LraCancelOnResource#cancelOnFamilyDefault4xx(java.net.URI)}
     */
    @Test
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/TckCancelOnTests.java`
#### Snippet
```java

    /**
     * See {@link LraCancelOnResource#cancelFromRemoteCall(java.net.URI, jakarta.ws.rs.core.UriInfo)}
     */
    @Test
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/TckTests.java`
#### Snippet
```java
                    lraTestService.isLRAFinished(lra));
        } catch (GenericLRAException e) {
            e.printStackTrace();
            throw e;
        }
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

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/TckTests.java`
#### Snippet
```java
        // starting at index 1 as LRAResource#multiLevelNestedActivity returns the top-level LRA as the first argument
        // which was not finished yet
        IntStream.range(1, uris.length).parallel().forEach(i -> {
            lraTestService.waitForCallbacks(uris[i]);
        });
```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `tckSuiteClient` from instance context
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/service/LRATestService.java`
#### Snippet
```java

    public void start(URL deploymentURL) {
        tckSuiteClient = ClientBuilder.newClient();
        tckSuiteTarget = tckSuiteClient.target(URI.create(deploymentURL.toExternalForm()));
        lraClient = new LRAClientOps(tckSuiteTarget);
```

## RuleId[id=EmptyMethod]
### EmptyMethod
Method only calls its super
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/TckUnknownStatusTests.java`
#### Snippet
```java

    @Before
    public void before() {
        super.before();
    }
```

### EmptyMethod
Method only calls its super
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/TckUnknownTests.java`
#### Snippet
```java

    @Before
    public void before() {
        super.before();
    }
```

### EmptyMethod
The method is empty
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/participant/nonjaxrs/InvalidAfterLRASignatureListener.java`
#### Snippet
```java

    @AfterLRA
    public void onLRAEnd(String lraId, String lraStatus) {
        // intentionally empty
    }
```

### EmptyMethod
The method is empty
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/participant/nonjaxrs/InvalidArgumentTypesParticipant.java`
#### Snippet
```java

    @Forget
    public void forget(int lraId, URI parentId) {
        // intentionally empty
    }
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/participant/api/ParticipatingTckResource.java`
#### Snippet
```java
    public static final String RECOVERY_PARAM = "recoveryCount";

    private int recoveryPasses = 0;

    @Inject
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `lraId`
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/participant/api/LraResource.java`
#### Snippet
```java
            URI lra = new LRAClientOps(target).startLRA(null, "subActivity", 0L, ChronoUnit.SECONDS);

            lraId = lra;

            storeActivity(lraId, null);
```

### AssignmentToMethodParameter
Assignment to method parameter `lraCheckType`
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/TckLRATypeTests.java`
#### Snippet
```java
            if (response.getStatus() == Response.Status.PRECONDITION_FAILED.getStatusCode()) {
                // 412 errors should abort running the target method so skip the LRA check
                lraCheckType = MethodLRACheck.NONE;
                methodLRAShouldBeActive = false;
                methodLraId = "";
```

### AssignmentToMethodParameter
Assignment to method parameter `methodLRAShouldBeActive`
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/TckLRATypeTests.java`
#### Snippet
```java
                // 412 errors should abort running the target method so skip the LRA check
                lraCheckType = MethodLRACheck.NONE;
                methodLRAShouldBeActive = false;
                methodLraId = "";
            } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `how`
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/TckTests.java`
#### Snippet
```java

        if (how == CompletionType.mixed && nestedCnt <= 1) {
            how = CompletionType.complete;
        }

```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/participant/api/NoLRAResource.java`
#### Snippet
```java
        }

        return null;
    }
}
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-07-04-02-58.396.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`methodLraId.length() != 0` can be replaced with '!methodLraId.isEmpty()'
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/TckLRATypeTests.java`
#### Snippet
```java
                assertFalse(lraTestService.isLRAFinished(URI.create(methodLraId)));
                lraClient.closeLRA(methodLraId);
            } else if (methodLraId.length() != 0) {
                // otherwise it should be finished
                assertTrue(lraTestService.isLRAFinished(URI.create(methodLraId)));
```

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `lraId` of exception class
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/participant/api/GenericLRAException.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    private URI lraId;

    public URI getLraId() {
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

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final @Suspended`
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/participant/api/ContextTckResource.java`
#### Snippet
```java
    @Path(ASYNC_LRA_PATH1)
    public void async1LRA(@HeaderParam(LRA_HTTP_CONTEXT_HEADER) URI lraId,
            final @Suspended AsyncResponse ar) {
        excecutorService.submit(() -> {
            // excecute long running business activity and resume when done
```

## RuleId[id=TestCaseWithNoTestMethods]
### TestCaseWithNoTestMethods
Test class `TckTestBase` has no tests
in `tck/src/main/java/org/eclipse/microprofile/lra/tck/TckTestBase.java`
#### Snippet
```java
 * environment.
 */
public class TckTestBase {
    private static final Logger LOGGER = Logger.getLogger(TckTestBase.class.getName());

```

