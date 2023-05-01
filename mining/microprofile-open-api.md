# microprofile-open-api 
 
# Bad smells
I found 274 bad smells with 24 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 116 | false |
| ReturnNull | 20 | false |
| MismatchedJavadocCode | 19 | false |
| StringOperationCanBeSimplified | 18 | false |
| UnnecessaryModifier | 12 | true |
| UnnecessaryBoxing | 9 | false |
| SizeReplaceableByIsEmpty | 8 | true |
| BoundedWildcard | 7 | false |
| EmptyMethod | 7 | false |
| StringEqualsEmptyString | 6 | false |
| NonFinalFieldOfException | 5 | false |
| UnusedAssignment | 5 | false |
| StringEquality | 4 | false |
| DataFlowIssue | 4 | false |
| RedundantFieldInitialization | 4 | false |
| AbstractClassNeverImplemented | 3 | false |
| DefaultAnnotationParam | 3 | false |
| InnerClassMayBeStatic | 2 | true |
| DynamicRegexReplaceableByCompiledPattern | 2 | false |
| AssignmentToMethodParameter | 2 | false |
| SynchronizeOnThis | 2 | false |
| ConstantValue | 2 | false |
| ManualArrayToCollectionCopy | 1 | false |
| UnnecessarySemicolon | 1 | false |
| CommentedOutCode | 1 | false |
| AssignmentToStaticFieldFromInstanceMethod | 1 | false |
| Convert2MethodRef | 1 | false |
| BooleanConstructor | 1 | false |
| UnnecessaryUnboxing | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| CodeBlock2Expr | 1 | true |
| UseOfPropertiesAsHashtable | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| UseBulkOperation | 1 | false |
## RuleId[id=StringEquality]
### StringEquality
String values are compared using `==`, not 'equals()'
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/resources/ReviewResource.java`
#### Snippet
```java
            User currentUser = review.getUser();

            if (currentAirline.getName() == airlines && currentUser.getUserName() == user) {
                reviewsByAirlinesUser.add(review);
            }
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/resources/ReviewResource.java`
#### Snippet
```java
            User currentUser = review.getUser();

            if (currentAirline.getName() == airlines && currentUser.getUserName() == user) {
                reviewsByAirlinesUser.add(review);
            }
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/resources/ReviewResource.java`
#### Snippet
```java
        for (Review review : reviews.values()) {
            Airline currentAirline = review.getAirlines();
            if (currentAirline.getName() == airlines) {
                reviewsByAirlines.add(review);
            }
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/resources/ReviewResource.java`
#### Snippet
```java
        for (Review review : reviews.values()) {
            User currentUser = review.getUser();
            if (currentUser.getUserName() == user && (minRating == null || review.getRating() >= minRating)) {
                reviewsByUser.add(review);
            }
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `api/src/main/java/org/eclipse/microprofile/openapi/models/security/SecurityScheme.java`
#### Snippet
```java
     * </p>
     */
    public enum Type {
        APIKEY("apiKey"), HTTP("http"), OAUTH2("oauth2"), OPENIDCONNECT("openIdConnect");

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `api/src/main/java/org/eclipse/microprofile/openapi/models/security/SecurityScheme.java`
#### Snippet
```java
     * </p>
     */
    public enum In {
        COOKIE("cookie"), HEADER("header"), QUERY("query");

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `api/src/main/java/org/eclipse/microprofile/openapi/models/responses/APIResponses.java`
#### Snippet
```java
public interface APIResponses extends Constructible, Extensible<APIResponses> {

    public static final String DEFAULT = "default";

    /**
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `api/src/main/java/org/eclipse/microprofile/openapi/models/responses/APIResponses.java`
#### Snippet
```java
public interface APIResponses extends Constructible, Extensible<APIResponses> {

    public static final String DEFAULT = "default";

    /**
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `api/src/main/java/org/eclipse/microprofile/openapi/models/responses/APIResponses.java`
#### Snippet
```java
public interface APIResponses extends Constructible, Extensible<APIResponses> {

    public static final String DEFAULT = "default";

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `api/src/main/java/org/eclipse/microprofile/openapi/models/servers/Server.java`
#### Snippet
```java
     * @return the current Server object
     **/
    public Server addVariable(String variableName, ServerVariable variable);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `api/src/main/java/org/eclipse/microprofile/openapi/models/servers/Server.java`
#### Snippet
```java
     *            the name the variable to remove
     */
    public void removeVariable(String variableName);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/resources/PlayerService.java`
#### Snippet
```java
    @Path("/player/{playerId}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getPlayerById(@PathParam("playerId") String id);

    @POST
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/resources/PlayerService.java`
#### Snippet
```java
    @POST
    @Path("/rank/{playerId}/recordGame")
    public void recordGame(@PathParam("playerId") String id, @QueryParam("place") int place,
            @HeaderParam("Authorization") String token);

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/media/Schema.java`
#### Snippet
```java
     * @since 3.1
     */
    public final class True {
        private True() {
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/media/Schema.java`
#### Snippet
```java
     * @since 3.1
     */
    public final class False {
        private False() {
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `api/src/main/java/org/eclipse/microprofile/openapi/models/headers/Header.java`
#### Snippet
```java
     * Controls the style of serialization. Only one style is supported for headers.
     */
    public enum Style {
        SIMPLE("simple");

```

## RuleId[id=ManualArrayToCollectionCopy]
### ManualArrayToCollectionCopy
Manual array to collection copy
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/data/PetData.java`
#### Snippet
```java
        if (null != urls) {
            List<String> urlObjs = new ArrayList<String>();
            for (String urlString : urls) {
                urlObjs.add(urlString);
            }
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Variable is already assigned to this value
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/resource/JavaRestResourceUtil.java`
#### Snippet
```java
            output = Integer.parseInt(inputString);
        } catch (Exception e) {
            output = defaultValue;
        }

```

### DataFlowIssue
Variable is already assigned to this value
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/resource/JavaRestResourceUtil.java`
#### Snippet
```java
        boolean output = defaultValue;
        if (booleanString == null) {
            output = defaultValue;
        }

```

### DataFlowIssue
Variable is already assigned to this value
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/resource/JavaRestResourceUtil.java`
#### Snippet
```java
                output = Boolean.parseBoolean(booleanString);
            } catch (Exception e) {
                output = defaultValue;
            }
        }
```

### DataFlowIssue
Variable is already assigned to this value
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/resource/JavaRestResourceUtil.java`
#### Snippet
```java
            output = Long.parseLong(inputString);
        } catch (Exception e) {
            output = defaultValue;
        }
        if (output < minVal) {
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/enums/Explode.java`
#### Snippet
```java
 */
public enum Explode {
    DEFAULT, FALSE, TRUE;
}

```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
`new String()` is redundant
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
            return new HashMap<Object, Object>();
        } else if (clazz == String.class) {
            return new String("value");
        } else if (clazz == Boolean.class || clazz == Boolean.TYPE) {
            return new Boolean(true);
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
            return new BigDecimal("1.0");
        } else if (clazz == Object.class) {
            return new String("object");
        }
        return null;
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        final ServerVariable sv = processConstructible(ServerVariable.class);

        final String enumeration = new String("enumValue");
        checkSameObject(sv, sv.addEnumeration(enumeration));
        checkListEntry(sv.getEnumeration(), enumeration);
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        assertEquals(sv.getEnumeration().size(), 0, "The list is expected to be empty.");

        final String enumeration2 = new String("enumValue2");
        sv.setEnumeration(Collections.singletonList(enumeration2));
        assertEquals(sv.getEnumeration().size(), 1, "The list is expected to contain one entry.");
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        checkListEntry(sv.getEnumeration(), enumeration);

        final String otherEnumerationValue = new String("otherValue");
        checkListImmutable(sv, ServerVariable::getEnumeration, otherEnumerationValue);
    }
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java

        final String key = "myKey";
        final String value = new String("myValue");
        checkSameObject(d, d.addMapping(key, value));
        checkMapEntry(d.getMapping(), key, value);
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java

        final String key2 = "myCallbackKey2";
        final String value2 = new String("myValue2");
        d.setMapping(Collections.singletonMap(key2, value2));
        checkMapEntry(d.getMapping(), key2, value2);
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        assertEquals(d.getMapping().size(), 2, "The map is expected to contain two entries.");

        final String otherValue = new String("otherValue");
        checkMapImmutable(d, Discriminator::getMapping, "otherValue", otherValue);
        checkNullValueInAdd(d::getMapping, d::addMapping, "otherKey", value);
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        final OAuthFlow o = processConstructible(OAuthFlow.class);
        final String key = "myKey";
        final String value = new String("myValue");
        o.setScopes(Collections.singletonMap(key, value));
        Map<String, String> scopes = o.getScopes();
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        checkListImmutable(o, Operation::getServers, otherServer);

        final String tag = new String("myTag");
        checkSameObject(o, o.addTag(tag));
        checkListEntry(o.getTags(), tag);
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        assertEquals(o.getTags().size(), 0, "The list is expected to be empty.");

        final String tag2 = new String("myTag2");
        o.setTags(Collections.singletonList(tag2));
        assertEquals(o.getTags().size(), 1, "The list is expected to contain one entry.");
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        checkListEntry(o.getTags(), tag);

        String otherTag = new String("otherTag");
        checkListImmutable(o, Operation::getTags, otherTag);

```

### StringOperationCanBeSimplified
`new String()` is redundant
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        checkListImmutable(s, Schema::getAnyOf, otherAnyOfValue);

        final String enumeration = new String("enumValue");
        checkSameObject(s, s.addEnumeration(enumeration));
        checkListEntry(s.getEnumeration(), enumeration);
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        assertEquals(s.getEnumeration().size(), 0, "The list is expected to be empty.");

        final String enumeration2 = new String("enumValue2");
        s.setEnumeration(Collections.singletonList(enumeration2));
        assertEquals(s.getEnumeration().size(), 1, "The list is expected to contain one entry.");
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        checkListEntry(s.getEnumeration(), enumeration);

        final String otherEnumerationValue = new String("otherValue");
        checkListImmutable(s, Schema::getEnumeration, otherEnumerationValue);

```

### StringOperationCanBeSimplified
`new String()` is redundant
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        checkNullValueInAdd(s::getProperties, s::addProperty, "otherProperty", propertySchemaValue);

        final String required = new String("required");
        checkSameObject(s, s.addRequired(required));
        checkListEntry(s.getRequired(), required);
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        assertEquals(s.getRequired().size(), 0, "The list is expected to be empty.");

        final String required2 = new String("required2");
        s.setRequired(Collections.singletonList(required2));
        assertEquals(s.getRequired().size(), 1, "The list is expected to contain one entry.");
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        checkListEntry(s.getRequired(), required);

        final String otherRequiredValue = new String("otherRequired");
        checkListImmutable(s, Schema::getEnumeration, otherRequiredValue);
    }
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java

// assertSame and assertNotSame are broken in TestNG 7.4.0 - https://github.com/cbeust/testng/issues/2486
// import static org.testng.Assert.assertNotSame;
// import static org.testng.Assert.assertSame;
import static org.hamcrest.MatcherAssert.assertThat;
```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `UserResource.userData` from instance context
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/resources/UserResource.java`
#### Snippet
```java

    public void setUserData(UserData userData) {
        UserResource.userData = userData;
    }

```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        }
        final Map<String, Property> properties = collectProperties(clazz);
        properties.values().stream().filter((p) -> p.isComplete()).forEach((p) -> {
            processConstructibleProperty(o, p, clazz);
        });
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/security/SecurityRequirement.java`
#### Snippet
```java
     * </p>
     * 
     * @return a list of scope names required for the execution of this Security Requirement instance.
     */
    String[] scopes() default {};
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/callbacks/CallbackOperation.java`
#### Snippet
```java
     * </p>
     * 
     * @return the list of parameters for this callback operation
     **/
    Parameter[] parameters() default {};
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/callbacks/CallbackOperation.java`
#### Snippet
```java
     * array can be used.
     * 
     * @return the list of security mechanisms for this callback operation
     */
    SecurityRequirement[] security() default {};
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/callbacks/CallbackOperation.java`
#### Snippet
```java
     * </p>
     * 
     * @return the list of responses for this callback operation
     **/
    APIResponse[] responses() default {};
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/callbacks/CallbackOperation.java`
#### Snippet
```java
     * Including an empty set within this list indicates that the other requirements are optional.
     * 
     * @return the list of security mechanisms for this callback operation
     */
    SecurityRequirementsSet[] securitySets() default {};
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/media/SchemaProperty.java`
#### Snippet
```java
     * </p>
     * 
     * @return the list of possible class matches
     **/
    Class<?>[] anyOf() default {};
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/media/SchemaProperty.java`
#### Snippet
```java
     * Allows multiple properties in an object to be marked as required.
     *
     * @return the list of required schema properties
     **/
    String[] requiredProperties() default {};
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/media/SchemaProperty.java`
#### Snippet
```java
     * in the schema model.
     *
     * @return a list of allowed schema values
     */
    String[] enumeration() default {};
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/media/SchemaProperty.java`
#### Snippet
```java
     * </p>
     * 
     * @return the list of possible classes for a single match
     **/
    Class<?>[] oneOf() default {};
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/media/SchemaProperty.java`
#### Snippet
```java
     * </p>
     * 
     * @return the list of classes to match
     **/
    Class<?>[] allOf() default {};
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/media/Content.java`
#### Snippet
```java
     * An array of examples used to show the use of the associated schema.
     *
     * @return the list of examples
     **/
    ExampleObject[] examples() default {};
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/parameters/Parameter.java`
#### Snippet
```java
     * Ignored if the properties content or array are specified.
     * 
     * @return the list of examples for this parameter
     **/
    ExampleObject[] examples() default {};
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/media/Schema.java`
#### Snippet
```java
     * </p>
     * 
     * @return the list of classes to match
     **/
    Class<?>[] allOf() default {};
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/media/Schema.java`
#### Snippet
```java
     * </pre>
     *
     * @return a list of defined properties
     *
     * @since 2.0
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/media/Schema.java`
#### Snippet
```java
     * </p>
     * 
     * @return the list of possible classes for a single match
     **/
    Class<?>[] oneOf() default {};
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/media/Schema.java`
#### Snippet
```java
     * Allows multiple properties in an object to be marked as required.
     * 
     * @return the list of required schema properties
     **/
    String[] requiredProperties() default {};
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/media/Schema.java`
#### Snippet
```java
     * </p>
     * 
     * @return the list of possible class matches
     **/
    Class<?>[] anyOf() default {};
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/media/Schema.java`
#### Snippet
```java
     * in the schema model.
     * 
     * @return a list of allowed schema values
     */
    String[] enumeration() default {};
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/links/Link.java`
#### Snippet
```java
     * Array of parameters to pass to an operation as specified with operationId or identified via operationRef.
     * 
     * @return the list of parameters for this link
     **/
    LinkParameter[] parameters() default {};
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`users.size() > 0` can be replaced with '!users.isEmpty()'
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/data/UserData.java`
#### Snippet
```java
            return;
        }
        if (users.size() > 0) {
            for (int i = users.size() - 1; i >= 0; i--) {
                if (users.get(i).getUsername().equals(user.getUsername())) {
```

### SizeReplaceableByIsEmpty
`users.size() > 0` can be replaced with '!users.isEmpty()'
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/data/UserData.java`
#### Snippet
```java

    public boolean removeUser(String username) {
        if (users.size() > 0) {
            for (int i = users.size() - 1; i >= 0; i--) {
                if (users.get(i).getUsername().equals(username)) {
```

### SizeReplaceableByIsEmpty
`orders.size() > 0` can be replaced with '!orders.isEmpty()'
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/data/StoreData.java`
#### Snippet
```java

    public boolean deleteOrder(long orderId) {
        if (orders.size() > 0) {
            for (int i = orders.size() - 1; i >= 0; i--) {
                if (orders.get(i).getId() == orderId) {
```

### SizeReplaceableByIsEmpty
`orders.size() > 0` can be replaced with '!orders.isEmpty()'
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/data/StoreData.java`
#### Snippet
```java

    public Order placeOrder(Order order) {
        if (orders.size() > 0) {
            for (int i = orders.size() - 1; i >= 0; i--) {
                if (orders.get(i).getId() == order.getId()) {
```

### SizeReplaceableByIsEmpty
`users.size() > 0` can be replaced with '!users.isEmpty()'
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/data/UserData.java`
#### Snippet
```java
            return;
        }
        if (users.size() > 0) {
            for (int i = users.size() - 1; i >= 0; i--) {
                if (users.get(i).getUserName().equals(user.getUserName())) {
```

### SizeReplaceableByIsEmpty
`users.size() > 0` can be replaced with '!users.isEmpty()'
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/data/UserData.java`
#### Snippet
```java

    public boolean removeUser(String username) {
        if (users.size() > 0) {
            for (int i = users.size() - 1; i >= 0; i--) {
                if (users.get(i).getUserName().equals(username)) {
```

### SizeReplaceableByIsEmpty
`pets.size() > 0` can be replaced with '!pets.isEmpty()'
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/data/PetData.java`
#### Snippet
```java

    public boolean deletePet(long petId) {
        if (pets.size() > 0) {
            for (int i = pets.size() - 1; i >= 0; i--) {
                Pet pet = pets.get(i);
```

### SizeReplaceableByIsEmpty
`pets.size() > 0` can be replaced with '!pets.isEmpty()'
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/data/PetData.java`
#### Snippet
```java
            pet.setId(maxId + 1);
        }
        if (pets.size() > 0) {
            for (int i = pets.size() - 1; i >= 0; i--) {
                if (pets.get(i).getId() == pet.getId()) {
```

## RuleId[id=BooleanConstructor]
### BooleanConstructor
Boolean constructor call
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
            return new String("value");
        } else if (clazz == Boolean.class || clazz == Boolean.TYPE) {
            return new Boolean(true);
        } else if (clazz == Byte.class || clazz == Byte.TYPE) {
            return new Byte((byte) 1);
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `MyAbstractLicenseImpl` may be 'static'
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/OASFactoryErrorTest.java`
#### Snippet
```java
    public interface MyLicense extends License {
    }
    public abstract class MyAbstractLicenseImpl implements License {
    }
    public final class MyLicenseImpl implements License {
```

### InnerClassMayBeStatic
Inner class `MyLicenseImpl` may be 'static'
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/OASFactoryErrorTest.java`
#### Snippet
```java
    public abstract class MyAbstractLicenseImpl implements License {
    }
    public final class MyLicenseImpl implements License {
        @Override
        public Map<String, Object> getExtensions() {
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends User`
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/resources/UserResource.java`
#### Snippet
```java
               operationId = "createUsersFromList")
    public Response createUsersWithListInput(
            @RequestBody(description = "List of user object", required = true) java.util.List<User> users) {
        for (User user : users) {
            userData.addUser(user);
```

### BoundedWildcard
Can generalize to `? extends User`
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/resource/UserResource.java`
#### Snippet
```java
    @Operation(summary = "Creates list of users with given input array")
    public Response createUsersWithListInput(
            @RequestBody(description = "List of user object", required = true) java.util.List<User> users) {
        for (User user : users) {
            userData.addUser(user);
```

### BoundedWildcard
Can generalize to `? extends Map`
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
    }

    private <O, K, T> void checkMapImmutable(O container, Function<O, Map<K, T>> mapGetter, K key, T otherValue) {
        Map<K, T> map = mapGetter.apply(container);
        assertNotNull(map, "The map must not be null.");
```

### BoundedWildcard
Can generalize to `? extends Map`
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
    }

    private <O, T> void checkNullValueInAdd(Supplier<Map<String, T>> mapGetter, BiFunction<String, T, O> mapAdd,
            String key, T value) {
        // add null as value for 'key'
```

### BoundedWildcard
Can generalize to `? super String`
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
    }

    private <O, T> void checkNullValueInAdd(Supplier<Map<String, T>> mapGetter, BiFunction<String, T, O> mapAdd,
            String key, T value) {
        // add null as value for 'key'
```

### BoundedWildcard
Can generalize to `? super T`
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
    }

    private <O, T> void checkNullValueInAdd(Supplier<Map<String, T>> mapGetter, BiFunction<String, T, O> mapAdd,
            String key, T value) {
        // add null as value for 'key'
```

### BoundedWildcard
Can generalize to `? extends List`
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
    }

    private <O, V> void checkListImmutable(O container, Function<O, List<V>> listGetter, V otherValue) {
        List<V> list = listGetter.apply(container);
        checkListEntryAbsent(list, otherValue);
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `MyAbstractLicenseImpl` has no concrete subclass
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/OASFactoryErrorTest.java`
#### Snippet
```java
    public interface MyLicense extends License {
    }
    public abstract class MyAbstractLicenseImpl implements License {
    }
    public final class MyLicenseImpl implements License {
```

### AbstractClassNeverImplemented
Abstract class `OASFactoryResolver` has no concrete subclass
in `api/src/main/java/org/eclipse/microprofile/openapi/spi/OASFactoryResolver.java`
#### Snippet
```java
 *
 */
public abstract class OASFactoryResolver {

    private static volatile OASFactoryResolver instance = null;
```

### AbstractClassNeverImplemented
Abstract class `OASFactoryResolver` has no concrete subclass
in `spi/src/main/java/org/eclipse/microprofile/openapi/spi/OASFactoryResolver.java`
#### Snippet
```java
 *
 */
public abstract class OASFactoryResolver {

    private static volatile OASFactoryResolver instance = null;
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/resource/JavaRestResourceUtil.java`
#### Snippet
```java

        // treat "", "YES" as "true"
        if ("".equals(booleanString)) {
            output = true;
        } else if ("YES".equalsIgnoreCase(booleanString)) {
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/data/PetData.java`
#### Snippet
```java
        for (Pet pet : pets) {
            String status = pet.getStatus();
            if (status != null && !"".equals(status)) {
                Integer count = output.get(status);
                if (count == null) {
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/resource/PetResource.java`
#### Snippet
```java
        Pet pet = petData.getPetById(petId);
        if (pet != null) {
            if (name != null && !"".equals(name)) {
                pet.setName(name);
            }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/resource/PetResource.java`
#### Snippet
```java
                pet.setName(name);
            }
            if (status != null && !"".equals(status)) {
                pet.setStatus(status);
            }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/resource/PetResource.java`
#### Snippet
```java
            String status = values[5];

            if (name != null && !"".equals(name)) {
                pet.setName(name);
            }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/resource/PetResource.java`
#### Snippet
```java
                pet.setName(name);
            }
            if (status != null && !"".equals(status)) {
                pet.setStatus(status);
            }
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Unnecessary boxing
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/data/PetData.java`
#### Snippet
```java
                Integer count = output.get(status);
                if (count == null) {
                    count = new Integer(1);
                } else {
                    count = count.intValue() + 1;
```

### UnnecessaryBoxing
Unnecessary boxing
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
            return new String("value");
        } else if (clazz == Boolean.class || clazz == Boolean.TYPE) {
            return new Boolean(true);
        } else if (clazz == Byte.class || clazz == Byte.TYPE) {
            return new Byte((byte) 1);
```

### UnnecessaryBoxing
Unnecessary boxing
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
            return new Boolean(true);
        } else if (clazz == Byte.class || clazz == Byte.TYPE) {
            return new Byte((byte) 1);
        } else if (clazz == Short.class || clazz == Short.TYPE) {
            return new Short((short) 1);
```

### UnnecessaryBoxing
Unnecessary boxing
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
            return new Byte((byte) 1);
        } else if (clazz == Short.class || clazz == Short.TYPE) {
            return new Short((short) 1);
        } else if (clazz == Integer.class || clazz == Integer.TYPE) {
            return new Integer(1);
```

### UnnecessaryBoxing
Unnecessary boxing
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
            return new Short((short) 1);
        } else if (clazz == Integer.class || clazz == Integer.TYPE) {
            return new Integer(1);
        } else if (clazz == Long.class || clazz == Long.TYPE) {
            return new Long(1L);
```

### UnnecessaryBoxing
Unnecessary boxing
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
            return new Integer(1);
        } else if (clazz == Long.class || clazz == Long.TYPE) {
            return new Long(1L);
        } else if (clazz == Float.class || clazz == Float.TYPE) {
            return new Float(1);
```

### UnnecessaryBoxing
Unnecessary boxing
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
            return new Long(1L);
        } else if (clazz == Float.class || clazz == Float.TYPE) {
            return new Float(1);
        } else if (clazz == Double.class || clazz == Double.TYPE) {
            return new Double(1);
```

### UnnecessaryBoxing
Unnecessary boxing
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
            return new Float(1);
        } else if (clazz == Double.class || clazz == Double.TYPE) {
            return new Double(1);
        } else if (clazz == Character.class || clazz == Character.TYPE) {
            return new Character('a');
```

### UnnecessaryBoxing
Unnecessary boxing
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
            return new Double(1);
        } else if (clazz == Character.class || clazz == Character.TYPE) {
            return new Character('a');
        } else if (clazz == BigInteger.class) {
            return new BigInteger("1");
```

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/data/PetData.java`
#### Snippet
```java
                    count = new Integer(1);
                } else {
                    count = count.intValue() + 1;
                }
                output.put(status, count);
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/resource/PetStoreResource.java`
#### Snippet
```java
            @APIResponse(responseCode = "200", description = "successful operation",
                         extensions = @Extension(name = "x-response-ext", value = "test-response-ext")),
            @APIResponse(responseCode = "500", description = "server error", extensions = {}),
            @APIResponse(responseCode = "503", description = "service not available",
                         content = @Content(extensions = @Extension(name = "x-notavailable-ext", value = "true"))),
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/resource/PetResource.java`
#### Snippet
```java
                        description = "authentication needed to delete a pet profile",
                        flows = @OAuthFlows(implicit = @OAuthFlow(authorizationUrl = "https://example.com/api/oauth/dialog",
                                                                  scopes = {}),
                                            authorizationCode = @OAuthFlow(authorizationUrl = "https://example.com/api/oauth/dialog",
                                                                           tokenUrl = "https://example.com/api/oauth/token",
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/resource/PetResource.java`
#### Snippet
```java
                                            authorizationCode = @OAuthFlow(authorizationUrl = "https://example.com/api/oauth/dialog",
                                                                           tokenUrl = "https://example.com/api/oauth/token",
                                                                           scopes = {}))),
        @SecurityScheme(securitySchemeName = "petsHttp", type = SecuritySchemeType.HTTP,
                        description = "authentication needed to update an exsiting record of a pet in the store",
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/AppTestBase.java`
#### Snippet
```java
            if (ref != null) {
                absolutePath.setLength(0);
                absolutePath.append(ref.replaceFirst("^#/?", "").replace('/', '.'));
            } else {
                // No $ref, keep appending
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/AppTestBase.java`
#### Snippet
```java

        if (ref != null) {
            return ref.replaceFirst("^#/?", "").replace('/', '.');
        } else {
            return path;
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/model/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.0")
package org.eclipse.microprofile.openapi.apps.petstore.model;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.annotations.tags` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/tags/Tags.java`
#### Snippet
```java
 * annotation were applied individually.
 * <p>
 * <b>Note:</b> If both {@link org.eclipse.microprofile.openapi.annotations.tags.Tag Tag} and
 * {@link org.eclipse.microprofile.openapi.annotations.tags.Tags Tags} annotations are specified on the same
 * method/class, then both tag definitions should be applied to method/class.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.annotations.tags` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/tags/Tags.java`
#### Snippet
```java
 * <p>
 * <b>Note:</b> If both {@link org.eclipse.microprofile.openapi.annotations.tags.Tag Tag} and
 * {@link org.eclipse.microprofile.openapi.annotations.tags.Tags Tags} annotations are specified on the same
 * method/class, then both tag definitions should be applied to method/class.
 * 
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang.annotation` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/tags/Tag.java`
#### Snippet
```java
 * from the class.
 * <p>
 * This annotation is {@link java.lang.annotation.Repeatable Repeatable}.
 * <p>
 * If more than one tag is defined with the same name then only one tag with that name will appear in the OpenAPI
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.annotations.tags` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/tags/Tag.java`
#### Snippet
```java
 * document and the results are implementation dependent.
 * <p>
 * <b>Note:</b> If both {@link org.eclipse.microprofile.openapi.annotations.tags.Tag Tag} and
 * {@link org.eclipse.microprofile.openapi.annotations.tags.Tags Tags} annotations are specified on the same method or
 * class, then both tag definitions should be applied.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.annotations.tags` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/tags/Tag.java`
#### Snippet
```java
 * <p>
 * <b>Note:</b> If both {@link org.eclipse.microprofile.openapi.annotations.tags.Tag Tag} and
 * {@link org.eclipse.microprofile.openapi.annotations.tags.Tags Tags} annotations are specified on the same method or
 * class, then both tag definitions should be applied.
 * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/models/security/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("2.0")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.models.security;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/models/security/package-info.java`
#### Snippet
```java

@org.osgi.annotation.versioning.Version("2.0")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.models.security;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/callbacks/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.1")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.annotations.callbacks;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/callbacks/package-info.java`
#### Snippet
```java

@org.osgi.annotation.versioning.Version("1.1")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.annotations.callbacks;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/models/examples/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.0")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.models.examples;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/models/examples/package-info.java`
#### Snippet
```java

@org.osgi.annotation.versioning.Version("1.0")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.models.examples;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/models/responses/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("2.0")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.models.responses;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/models/responses/package-info.java`
#### Snippet
```java

@org.osgi.annotation.versioning.Version("2.0")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.models.responses;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/models/callbacks/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("2.0")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.models.callbacks;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/models/callbacks/package-info.java`
#### Snippet
```java

@org.osgi.annotation.versioning.Version("2.0")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.models.callbacks;
```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.xml.bind.annotation` is unnecessary, and can be replaced with an import
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/model/ApiResponse.java`
#### Snippet
```java
import jakarta.xml.bind.annotation.XmlTransient;

@jakarta.xml.bind.annotation.XmlRootElement
public class ApiResponse {
    public static final int ERROR = 1;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/data/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.0")
package org.eclipse.microprofile.openapi.apps.airlines.data;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/models/servers/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("2.0")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.models.servers;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/models/servers/package-info.java`
#### Snippet
```java

@org.osgi.annotation.versioning.Version("2.0")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.models.servers;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/links/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.1")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.annotations.links;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/links/package-info.java`
#### Snippet
```java

@org.osgi.annotation.versioning.Version("1.1")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.annotations.links;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/resource/PetStoreResource.java`
#### Snippet
```java
               description = "Returns a map of status codes to quantities")
    @Extension(name = "x-operation-ext", value = "test-operation-ext")
    public java.util.Map<String, Integer> getInventory() {
        return petData.getInventoryByStatus();
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/resources/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.0")
package org.eclipse.microprofile.openapi.apps.airlines.resources;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/servers/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.1")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.annotations.servers;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/servers/package-info.java`
#### Snippet
```java

@org.osgi.annotation.versioning.Version("1.1")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.annotations.servers;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/parameters/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.2")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.annotations.parameters;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/parameters/package-info.java`
#### Snippet
```java

@org.osgi.annotation.versioning.Version("1.2")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.annotations.parameters;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.0")
package org.eclipse.microprofile.openapi.apps.airlines;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/model/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.0")
package org.eclipse.microprofile.openapi.apps.airlines.model;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `tck/src/main/java/org/eclipse/microprofile/openapi/filter/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.0")
package org.eclipse.microprofile.openapi.filter;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/spi/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.0")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.spi;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/spi/package-info.java`
#### Snippet
```java

@org.osgi.annotation.versioning.Version("1.0")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.spi;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/models/media/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("2.1")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.models.media;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/models/media/package-info.java`
#### Snippet
```java

@org.osgi.annotation.versioning.Version("2.1")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.models.media;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/models/links/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.0")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.models.links;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/models/links/package-info.java`
#### Snippet
```java

@org.osgi.annotation.versioning.Version("1.0")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.models.links;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/headers/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.1")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.annotations.headers;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/headers/package-info.java`
#### Snippet
```java

@org.osgi.annotation.versioning.Version("1.1")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.annotations.headers;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.models.responses` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/OASFactory.java`
#### Snippet
```java

    /**
     * This method creates a new {@link org.eclipse.microprofile.openapi.models.responses.APIResponses} instance.
     *
     * @return a new APIResponses instance
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.models.servers` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/OASFactory.java`
#### Snippet
```java

    /**
     * This method creates a new {@link org.eclipse.microprofile.openapi.models.servers.ServerVariable} instance.
     *
     * @return a new ServerVariable instance
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.models.media` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/OASFactory.java`
#### Snippet
```java

    /**
     * This method creates a new {@link org.eclipse.microprofile.openapi.models.media.Discriminator} instance.
     *
     * @return a new Discriminator instance
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.models.callbacks` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/OASFactory.java`
#### Snippet
```java

    /**
     * This method creates a new {@link org.eclipse.microprofile.openapi.models.callbacks.Callback} instance.
     *
     * @return a new Callback instance
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.models.headers` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/OASFactory.java`
#### Snippet
```java

    /**
     * This method creates a new {@link org.eclipse.microprofile.openapi.models.headers.Header} instance.
     *
     * @return a new Header instance
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.models` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/OASFactory.java`
#### Snippet
```java

    /**
     * This method creates a new {@link org.eclipse.microprofile.openapi.models.PathItem} instance.
     *
     * @return a new PathItem instance
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.models` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/OASFactory.java`
#### Snippet
```java

    /**
     * This method creates a new {@link org.eclipse.microprofile.openapi.models.Operation} instance.
     *
     * @return a new Operation instance
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.models.security` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/OASFactory.java`
#### Snippet
```java

    /**
     * This method creates a new {@link org.eclipse.microprofile.openapi.models.security.SecurityRequirement} instance.
     *
     * @return a new SecurityRequirement instance
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.models.media` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/OASFactory.java`
#### Snippet
```java

    /**
     * This method creates a new {@link org.eclipse.microprofile.openapi.models.media.MediaType} instance.
     *
     * @return a new MediaType instance
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.models.info` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/OASFactory.java`
#### Snippet
```java

    /**
     * This method creates a new {@link org.eclipse.microprofile.openapi.models.info.Contact} instance.
     *
     * @return a new Contact instance
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.models.media` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/OASFactory.java`
#### Snippet
```java

    /**
     * This method creates a new {@link org.eclipse.microprofile.openapi.models.media.Schema} instance.
     *
     * @return a new Schema instance
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.models` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/OASFactory.java`
#### Snippet
```java

    /**
     * This method creates a new {@link org.eclipse.microprofile.openapi.models.ExternalDocumentation} instance.
     *
     * @return a new ExternalDocumentation instance
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.models` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/OASFactory.java`
#### Snippet
```java

    /**
     * This method creates a new {@link org.eclipse.microprofile.openapi.models.Components} instance.
     *
     * @return a new Components instance
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.models.media` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/OASFactory.java`
#### Snippet
```java

    /**
     * This method creates a new {@link org.eclipse.microprofile.openapi.models.media.XML} instance.
     *
     * @return a new XML instance
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.models.info` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/OASFactory.java`
#### Snippet
```java

    /**
     * This method creates a new {@link org.eclipse.microprofile.openapi.models.info.Info} instance.
     *
     * @return a new Info instance
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.models.parameters` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/OASFactory.java`
#### Snippet
```java

    /**
     * This method creates a new {@link org.eclipse.microprofile.openapi.models.parameters.RequestBody} instance.
     *
     * @return a new RequestBody instance
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.models.security` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/OASFactory.java`
#### Snippet
```java

    /**
     * This method creates a new {@link org.eclipse.microprofile.openapi.models.security.OAuthFlows} instance.
     *
     * @return a new OAuthFlows instance
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.models.tags` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/OASFactory.java`
#### Snippet
```java

    /**
     * This method creates a new {@link org.eclipse.microprofile.openapi.models.tags.Tag} instance.
     *
     * @return a new Tag instance
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.models.links` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/OASFactory.java`
#### Snippet
```java

    /**
     * This method creates a new {@link org.eclipse.microprofile.openapi.models.links.Link} instance.
     *
     * @return a new Link instance
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.models` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/OASFactory.java`
#### Snippet
```java
     *            describes the type parameter
     * @param clazz
     *            represents a model which extends the {@link org.eclipse.microprofile.openapi.models.Constructible}
     *            interface
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.models` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/OASFactory.java`
#### Snippet
```java

    /**
     * This method creates a new {@link org.eclipse.microprofile.openapi.models.Paths} instance.
     *
     * @return a new Paths instance
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.models.examples` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/OASFactory.java`
#### Snippet
```java

    /**
     * This method creates a new {@link org.eclipse.microprofile.openapi.models.examples.Example} instance.
     *
     * @return a new Example instance
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.models.security` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/OASFactory.java`
#### Snippet
```java

    /**
     * This method creates a new {@link org.eclipse.microprofile.openapi.models.security.SecurityScheme} instance.
     *
     * @return a new SecurityScheme instance
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.models.responses` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/OASFactory.java`
#### Snippet
```java

    /**
     * This method creates a new {@link org.eclipse.microprofile.openapi.models.responses.APIResponse} instance.
     *
     * @return a new APIResponse instance
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.models.security` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/OASFactory.java`
#### Snippet
```java

    /**
     * This method creates a new {@link org.eclipse.microprofile.openapi.models.security.OAuthFlow} instance.
     *
     * @return a new OAuthFlow instance
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.models` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/OASFactory.java`
#### Snippet
```java

    /**
     * This method creates a new {@link org.eclipse.microprofile.openapi.models.OpenAPI} instance.
     *
     * @return a new OpenAPI instance
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.models.parameters` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/OASFactory.java`
#### Snippet
```java

    /**
     * This method creates a new {@link org.eclipse.microprofile.openapi.models.parameters.Parameter} instance.
     *
     * @return a new Parameter instance
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.models.servers` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/OASFactory.java`
#### Snippet
```java

    /**
     * This method creates a new {@link org.eclipse.microprofile.openapi.models.servers.Server} instance.
     *
     * @return a new Server instance
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.models.media` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/OASFactory.java`
#### Snippet
```java

    /**
     * This method creates a new {@link org.eclipse.microprofile.openapi.models.media.Encoding} instance.
     *
     * @return a new Encoding instance
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.models.media` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/OASFactory.java`
#### Snippet
```java

    /**
     * This method creates a new {@link org.eclipse.microprofile.openapi.models.media.Content} instance.
     *
     * @return a new Content instance
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.models.info` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/OASFactory.java`
#### Snippet
```java

    /**
     * This method creates a new {@link org.eclipse.microprofile.openapi.models.info.License} instance.
     *
     * @return a new License instance
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.0")
package org.eclipse.microprofile.openapi.apps.petstore;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/models/tags/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.0")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.models.tags;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/models/tags/package-info.java`
#### Snippet
```java

@org.osgi.annotation.versioning.Version("1.0")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.models.tags;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/exception/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.0")
package org.eclipse.microprofile.openapi.apps.petstore.exception;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/OASConfig.java`
#### Snippet
```java
     * Configuration property to specify the fully qualified name of the OASModelReader implementation.
     * 
     * @see org.eclipse.microprofile.openapi.OASModelReader
     */
    public static final String MODEL_READER = "mp.openapi.model.reader";
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/OASConfig.java`
#### Snippet
```java
     * Configuration property to specify the fully qualified name of the OASFilter implementation.
     * 
     * @see org.eclipse.microprofile.openapi.OASFilter
     */
    public static final String FILTER = "mp.openapi.filter";
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/models/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("2.0")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.models;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/models/package-info.java`
#### Snippet
```java

@org.osgi.annotation.versioning.Version("2.0")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.models;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/resources/UserResource.java`
#### Snippet
```java
               operationId = "createUsersFromList")
    public Response createUsersWithListInput(
            @RequestBody(description = "List of user object", required = true) java.util.List<User> users) {
        for (User user : users) {
            userData.addUser(user);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/media/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.2")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.annotations.media;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/media/package-info.java`
#### Snippet
```java

@org.osgi.annotation.versioning.Version("1.2")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.annotations.media;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/spi/OASFactoryResolver.java`
#### Snippet
```java
 * <br>
 * <br>
 * Service provider for OASFactoryResolver. The implementation registers itself via the {@link java.util.ServiceLoader}
 * mechanism or by manually setting their implementation using the setInstance method.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("2.1")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/package-info.java`
#### Snippet
```java

@org.osgi.annotation.versioning.Version("2.1")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/resource/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.0")
package org.eclipse.microprofile.openapi.apps.petstore.resource;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/models/parameters/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.0")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.models.parameters;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/models/parameters/package-info.java`
#### Snippet
```java

@org.osgi.annotation.versioning.Version("1.0")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.models.parameters;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/data/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.0")
package org.eclipse.microprofile.openapi.apps.petstore.data;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/resource/UserResource.java`
#### Snippet
```java
    @Operation(summary = "Creates list of users with given input array")
    public Response createUsersWithListInput(
            @RequestBody(description = "List of user object", required = true) java.util.List<User> users) {
        for (User user : users) {
            userData.addUser(user);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `spi/src/main/java/org/eclipse/microprofile/openapi/spi/OASFactoryResolver.java`
#### Snippet
```java
 * <br>
 * <br>
 * Service provider for OASFactoryResolver. The implementation registers itself via the {@link java.util.ServiceLoader}
 * mechanism or by manually setting their implementation using the setInstance method.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/models/headers/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.0")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.models.headers;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/models/headers/package-info.java`
#### Snippet
```java

@org.osgi.annotation.versioning.Version("1.0")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.models.headers;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/security/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.1")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.annotations.security;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/security/package-info.java`
#### Snippet
```java

@org.osgi.annotation.versioning.Version("1.1")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.annotations.security;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.annotations.servers` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/servers/Servers.java`
#### Snippet
```java
 * each server annotation were applied individually.
 * <p>
 * <b>Note:</b> If both {@link org.eclipse.microprofile.openapi.annotations.servers.Server Server} and
 * {@link org.eclipse.microprofile.openapi.annotations.servers.Servers Servers} annotation are specified on the same
 * type, the server definitions will be combined.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.annotations.servers` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/servers/Servers.java`
#### Snippet
```java
 * <p>
 * <b>Note:</b> If both {@link org.eclipse.microprofile.openapi.annotations.servers.Server Server} and
 * {@link org.eclipse.microprofile.openapi.annotations.servers.Servers Servers} annotation are specified on the same
 * type, the server definitions will be combined.
 * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/responses/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.2")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.annotations.responses;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/responses/package-info.java`
#### Snippet
```java

@org.osgi.annotation.versioning.Version("1.2")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.annotations.responses;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/extensions/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.1")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.annotations.extensions;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/extensions/package-info.java`
#### Snippet
```java

@org.osgi.annotation.versioning.Version("1.1")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.annotations.extensions;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `spi/src/main/java/org/eclipse/microprofile/openapi/spi/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.0")
package org.eclipse.microprofile.openapi.spi;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/models/info/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.0")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.models.info;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/models/info/package-info.java`
#### Snippet
```java

@org.osgi.annotation.versioning.Version("1.0")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.models.info;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/data/PetData.java`
#### Snippet
```java

    public List<Pet> findPetByStatus(String status) {
        List<Pet> result = new java.util.ArrayList<Pet>();
        if (status == null) {
            return result;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/data/PetData.java`
#### Snippet
```java
            pet.setPhotoUrls(urlObjs);
        }
        List<Tag> tagObjs = new java.util.ArrayList<Tag>();
        int i = 0;
        if (null != tags) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/data/PetData.java`
#### Snippet
```java
    public List<Pet> findPetByTags(String tags) {
        String[] tagList = tags.split(",");
        List<Pet> result = new java.util.ArrayList<Pet>();
        for (Pet pet : pets) {
            if (null != pet.getTags()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang.annotation` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/servers/Server.java`
#### Snippet
```java
 * in the root level of the OpenAPI document.
 * <p>
 * This annotation is {@link java.lang.annotation.Repeatable Repeatable}.
 * <p>
 * <b>Note:</b> If both {@link org.eclipse.microprofile.openapi.annotations.servers.Server Server} and
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.annotations.servers` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/servers/Server.java`
#### Snippet
```java
 * This annotation is {@link java.lang.annotation.Repeatable Repeatable}.
 * <p>
 * <b>Note:</b> If both {@link org.eclipse.microprofile.openapi.annotations.servers.Server Server} and
 * {@link org.eclipse.microprofile.openapi.annotations.servers.Servers Servers} annotation are specified on the same
 * type, the server definitions will be combined.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.openapi.annotations.servers` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/servers/Server.java`
#### Snippet
```java
 * <p>
 * <b>Note:</b> If both {@link org.eclipse.microprofile.openapi.annotations.servers.Server Server} and
 * {@link org.eclipse.microprofile.openapi.annotations.servers.Servers Servers} annotation are specified on the same
 * type, the server definitions will be combined.
 * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.1")
package org.eclipse.microprofile.openapi.annotations;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/exception/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.0")
package org.eclipse.microprofile.openapi.apps.airlines.exception;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/enums/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.0")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.annotations.enums;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/enums/package-info.java`
#### Snippet
```java

@org.osgi.annotation.versioning.Version("1.0")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.annotations.enums;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/tags/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.1")
package org.eclipse.microprofile.openapi.annotations.tags;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/info/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("1.1")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.annotations.info;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/info/package-info.java`
#### Snippet
```java

@org.osgi.annotation.versioning.Version("1.1")
@org.osgi.annotation.versioning.ProviderType
package org.eclipse.microprofile.openapi.annotations.info;
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/resource/PetResource.java`
#### Snippet
```java
                    output.write("hello, world".getBytes());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`i = i + 1` could be simplified to 'i += 1'
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/data/PetData.java`
#### Snippet
```java
        if (null != tags) {
            for (String tagString : tags) {
                i = i + 1;
                Tag tag = new Tag();
                tag.setId(i);
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        }
        final Map<String, Property> properties = collectProperties(clazz);
        properties.values().stream().filter((p) -> p.isComplete()).forEach((p) -> {
            processConstructibleProperty(o, p, clazz);
        });
```

## RuleId[id=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/utils/ConfigAsset.java`
#### Snippet
```java

    public ConfigAsset put(String key, String... values) {
        properties.put(key, String.join(", ", values));
        return this;
    }
```

## RuleId[id=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `api/src/main/java/org/eclipse/microprofile/openapi/models/Extensible.java`
#### Snippet
```java
     *            the key used to access the extension object. Always prefixed by "x-".
     */
    void removeExtension(String name);

    /**
```

### EmptyMethod
All implementations of this method are empty
in `api/src/main/java/org/eclipse/microprofile/openapi/models/Extensible.java`
#### Snippet
```java
     *            map containing keys which start with "x-" and values which provide additional information
     */
    void setExtensions(Map<String, Object> extensions);

}
```

### EmptyMethod
All implementations of this method are empty
in `api/src/main/java/org/eclipse/microprofile/openapi/models/info/License.java`
#### Snippet
```java
     *            the license name used for the API
     */
    void setName(String name);

    /**
```

### EmptyMethod
All implementations of this method are empty
in `api/src/main/java/org/eclipse/microprofile/openapi/models/info/License.java`
#### Snippet
```java
     *            the URL to the license used for the API
     */
    void setUrl(String url);

    /**
```

### EmptyMethod
The method is empty
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/resources/UserResource.java`
#### Snippet
```java
            @SecurityRequirement(name = "userBearerHttp")
    })
    public void changePassword(
            @Parameter(name = "username", description = "name that need to be deleted",
                       schema = @Schema(type = SchemaType.STRING),
```

### EmptyMethod
The method is empty
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/beanvalidation/BeanValidationResource.java`
#### Snippet
```java
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void test(@Valid BeanValidationData data) {
    }

```

### EmptyMethod
The method is empty
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/beanvalidation/BeanValidationResource.java`
#### Snippet
```java
    @POST
    @Path("parameter/{test}")
    public void test(@PathParam("test") @Size(max = 6) String size) {
    }
}
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/resources/bookings/BookingResource.java`
#### Snippet
```java
public class BookingResource {
    private Map<Integer, Booking> bookings = new ConcurrentHashMap<Integer, Booking>();
    private volatile int currentId = 0;

    @GET
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/resources/ReviewResource.java`
#### Snippet
```java
    private static Map<Integer, Review> reviews = new ConcurrentHashMap<Integer, Review>();
    private static Map<String, Long> visits = new ConcurrentHashMap<>();
    private volatile int currentId = 0;

    static {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `api/src/main/java/org/eclipse/microprofile/openapi/spi/OASFactoryResolver.java`
#### Snippet
```java
public abstract class OASFactoryResolver {

    private static volatile OASFactoryResolver instance = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `spi/src/main/java/org/eclipse/microprofile/openapi/spi/OASFactoryResolver.java`
#### Snippet
```java
public abstract class OASFactoryResolver {

    private static volatile OASFactoryResolver instance = null;

    /**
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `departureDate`
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/resources/AvailabilityResource.java`
#### Snippet
```java

        // Departure flights
        departureDate = extractDate(departureDate);
        for (int i = 0; i < 3; i++) {
            flights.add(new Flight(AirlinesResource.getRandomAirline(),
```

### AssignmentToMethodParameter
Assignment to method parameter `returningDate`
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/resources/AvailabilityResource.java`
#### Snippet
```java

        // Returning flights
        returningDate = extractDate(returningDate);
        for (int i = 0; i < 3; i++) {
            flights.add(new Flight(AirlinesResource.getRandomAirline(),
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-05-01-08-15-17.791.html`
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
in `api/src/main/java/org/eclipse/microprofile/openapi/models/responses/APIResponses.java`
#### Snippet
```java
        Map<String, APIResponse> map = getAPIResponses();
        if (map == null) {
            return null;
        }
        return map.get(name);
```

### ReturnNull
Return of `null`
in `tck/src/main/java/org/eclipse/microprofile/openapi/filter/AirlinesOASFilter.java`
#### Snippet
```java
            parameter.setDescription("filterParameter - The user name for login");
        } else if ("The password for login in clear text".equals(parameter.getDescription())) {
            return null; // remove parameter
        }
        return parameter;
```

### ReturnNull
Return of `null`
in `api/src/main/java/org/eclipse/microprofile/openapi/models/media/Content.java`
#### Snippet
```java
        Map<String, MediaType> map = getMediaTypes();
        if (map == null) {
            return null;
        }
        return map.get(name);
```

### ReturnNull
Return of `null`
in `api/src/main/java/org/eclipse/microprofile/openapi/models/Paths.java`
#### Snippet
```java
        Map<String, PathItem> map = getPathItems();
        if (map == null) {
            return null;
        }
        return map.get(name);
```

### ReturnNull
Return of `null`
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/data/UserData.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `api/src/main/java/org/eclipse/microprofile/openapi/models/security/SecurityRequirement.java`
#### Snippet
```java
        Map<String, List<String>> map = getSchemes();
        if (map == null) {
            return null;
        }
        return map.get(securitySchemeName);
```

### ReturnNull
Return of `null`
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/data/StoreData.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/OASFactoryErrorTest.java`
#### Snippet
```java
        @Override
        public String getName() {
            return null;
        }
        @Override
```

### ReturnNull
Return of `null`
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/OASFactoryErrorTest.java`
#### Snippet
```java
        @Override
        public License addExtension(String name, Object value) {
            return null;
        }
        @Override
```

### ReturnNull
Return of `null`
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/OASFactoryErrorTest.java`
#### Snippet
```java
        @Override
        public License url(String url) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/OASFactoryErrorTest.java`
#### Snippet
```java
        @Override
        public Map<String, Object> getExtensions() {
            return null;
        }
        @Override
```

### ReturnNull
Return of `null`
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/OASFactoryErrorTest.java`
#### Snippet
```java
        @Override
        public License name(String name) {
            return null;
        }
        @Override
```

### ReturnNull
Return of `null`
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/OASFactoryErrorTest.java`
#### Snippet
```java
        @Override
        public String getUrl() {
            return null;
        }
        @Override
```

### ReturnNull
Return of `null`
in `api/src/main/java/org/eclipse/microprofile/openapi/spi/OASFactoryResolver.java`
#### Snippet
```java
    private static OASFactoryResolver loadSpi(ClassLoader cl) {
        if (cl == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `spi/src/main/java/org/eclipse/microprofile/openapi/spi/OASFactoryResolver.java`
#### Snippet
```java
    private static OASFactoryResolver loadSpi(ClassLoader cl) {
        if (cl == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/data/UserData.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/data/UserData.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/data/PetData.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `api/src/main/java/org/eclipse/microprofile/openapi/models/callbacks/Callback.java`
#### Snippet
```java
        Map<String, PathItem> map = getPathItems();
        if (map == null) {
            return null;
        }
        return map.get(name);
```

### ReturnNull
Return of `null`
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
            return new String("object");
        }
        return null;
    }

```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `user` is redundant
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/data/UserData.java`
#### Snippet
```java
            String lastName, String sex, int age, String email, String phone, int status) {

        User user = new User(id, userName, password, firstName, lastName, sex, age, email, phone, status);

        return user;
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `api/src/main/java/org/eclipse/microprofile/openapi/spi/OASFactoryResolver.java`
#### Snippet
```java
    public static OASFactoryResolver instance() {
        if (instance == null) {
            synchronized (OASFactoryResolver.class) {
                if (instance != null) {
                    return instance;
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `spi/src/main/java/org/eclipse/microprofile/openapi/spi/OASFactoryResolver.java`
#### Snippet
```java
    public static OASFactoryResolver instance() {
        if (instance == null) {
            synchronized (OASFactoryResolver.class) {
                if (instance != null) {
                    return instance;
```

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `code` of exception class
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/exception/BadRequestException.java`
#### Snippet
```java

public class BadRequestException extends ApiException {
    private int code;
    public BadRequestException(int code, String msg) {
        super(code, msg);
```

### NonFinalFieldOfException
Non-final field `code` of exception class
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/exception/ApiException.java`
#### Snippet
```java

public class ApiException extends Exception {
    private int code;
    public ApiException(int code, String msg) {
        super(msg);
```

### NonFinalFieldOfException
Non-final field `code` of exception class
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/exception/BadRequestException.java`
#### Snippet
```java

public class BadRequestException extends ApiException {
    private int code;
    public BadRequestException(int code, String msg) {
        super(code, msg);
```

### NonFinalFieldOfException
Non-final field `code` of exception class
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/exception/ApiException.java`
#### Snippet
```java

public class ApiException extends Exception {
    private int code;
    public ApiException(int code, String msg) {
        super(msg);
```

### NonFinalFieldOfException
Non-final field `code` of exception class
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/exception/NotFoundException.java`
#### Snippet
```java

public class NotFoundException extends ApiException {
    private int code;
    public NotFoundException(int code, String msg) {
        super(code, msg);
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `output` initializer `defaultValue` is redundant
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/resource/JavaRestResourceUtil.java`
#### Snippet
```java
public class JavaRestResourceUtil {
    public int getInt(int minVal, int maxVal, int defaultValue, String inputString) {
        int output = defaultValue;
        try {
            output = Integer.parseInt(inputString);
```

### UnusedAssignment
Variable `output` initializer `defaultValue` is redundant
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/resource/JavaRestResourceUtil.java`
#### Snippet
```java

    public boolean getBoolean(boolean defaultValue, String booleanString) {
        boolean output = defaultValue;
        if (booleanString == null) {
            output = defaultValue;
```

### UnusedAssignment
The value `defaultValue` assigned to `output` is never used
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/resource/JavaRestResourceUtil.java`
#### Snippet
```java
        boolean output = defaultValue;
        if (booleanString == null) {
            output = defaultValue;
        }

```

### UnusedAssignment
Variable `output` initializer `defaultValue` is redundant
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/resource/JavaRestResourceUtil.java`
#### Snippet
```java

    public double getDouble(double minVal, double maxVal, double defaultValue, String inputString) {
        double output = defaultValue;
        try {
            output = Double.parseDouble(inputString);
```

### UnusedAssignment
Variable `output` initializer `defaultValue` is redundant
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/resource/JavaRestResourceUtil.java`
#### Snippet
```java

    public long getLong(long minVal, long maxVal, long defaultValue, String inputString) {
        long output = defaultValue;
        try {
            output = Long.parseLong(inputString);
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/data/PetData.java`
#### Snippet
```java
            List<String> urlObjs = new ArrayList<String>();
            for (String urlString : urls) {
                urlObjs.add(urlString);
            }
            pet.setPhotoUrls(urlObjs);
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `output < minVal` is always `false`
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/resource/JavaRestResourceUtil.java`
#### Snippet
```java
        }
        if (maxVal == -1) {
            if (output < minVal) {
                output = minVal;
            }
```

### ConstantValue
Condition `output < minVal` is always `false`
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/resource/JavaRestResourceUtil.java`
#### Snippet
```java
        }
        if (maxVal == -1) {
            if (output < minVal) {
                output = minVal;
            }
```

