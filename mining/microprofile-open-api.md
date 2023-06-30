# microprofile-open-api 
 
# Bad smells
I found 149 bad smells with 15 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DuplicatedCode | 32 | false |
| MismatchedJavadocCode | 19 | false |
| StringOperationCanBeSimplified | 18 | false |
| FieldMayBeFinal | 17 | false |
| UnnecessaryModifier | 12 | true |
| FieldCanBeLocal | 11 | false |
| NonFinalFieldInEnum | 6 | false |
| UnusedAssignment | 5 | false |
| StringEquality | 4 | false |
| DataFlowIssue | 4 | false |
| DefaultAnnotationParam | 3 | false |
| RedundantCast | 2 | false |
| UastIncorrectHttpHeaderInspection | 2 | false |
| InnerClassMayBeStatic | 2 | true |
| ConstantValue | 2 | false |
| NonAtomicOperationOnVolatileField | 2 | false |
| ManualArrayToCollectionCopy | 1 | false |
| UnnecessarySemicolon | 1 | false |
| CommentedOutCode | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| BooleanConstructor | 1 | false |
| DanglingJavadoc | 1 | false |
| UseBulkOperation | 1 | false |
| JavadocLinkAsPlainText | 1 | false |
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
            User currentUser = review.getUser();
            if (currentUser.getUserName() == user && (minRating == null || review.getRating() >= minRating)) {
                reviewsByUser.add(review);
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

## RuleId[id=DefaultAnnotationParam]
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

## RuleId[id=UnnecessaryModifier]
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
in `api/src/main/java/org/eclipse/microprofile/openapi/models/headers/Header.java`
#### Snippet
```java
     * Controls the style of serialization. Only one style is supported for headers.
     */
    public enum Style {
        SIMPLE("simple");

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
     *            the name the variable to remove
     */
    public void removeVariable(String variableName);

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

## RuleId[id=RedundantCast]
### RedundantCast
Casting `null` to `Map` is redundant
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        assertEquals(scopes.get(key), value, "The value corresponding to the 'myKey' is wrong.");

        o.setScopes((Map<String, String>) null);
        assertNull(o.getScopes(), "The value is expected to be null.");
    }
```

### RedundantCast
Casting `null` to `Map` is redundant
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        checkNullValueInAdd(server::getVariables, server::addVariable, "sv3", sv3);

        server.setVariables((Map<String, ServerVariable>) null);
        assertNull(server.getVariables(), "The value is expected to be null.");
    }
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `code` may be 'final'
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/exception/BadRequestException.java`
#### Snippet
```java

public class BadRequestException extends ApiException {
    private int code;
    public BadRequestException(int code, String msg) {
        super(code, msg);
```

### FieldMayBeFinal
Field `code` may be 'final'
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/exception/ApiException.java`
#### Snippet
```java

public class ApiException extends Exception {
    private int code;
    public ApiException(int code, String msg) {
        super(msg);
```

### FieldMayBeFinal
Field `value` may be 'final'
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/enums/SecuritySchemeType.java`
#### Snippet
```java
    DEFAULT(""), APIKEY("apiKey"), HTTP("http"), OPENIDCONNECT("openIdConnect"), OAUTH2("oauth2");

    private String value;

    SecuritySchemeType(String value) {
```

### FieldMayBeFinal
Field `value` may be 'final'
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/enums/ParameterIn.java`
#### Snippet
```java
    DEFAULT(""), HEADER("header"), QUERY("query"), PATH("path"), COOKIE("cookie");

    private String value;

    ParameterIn(String value) {
```

### FieldMayBeFinal
Field `value` may be 'final'
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle.java`
#### Snippet
```java
                    "deepObject"), SIMPLE("simple");

    private String value;

    ParameterStyle(String value) {
```

### FieldMayBeFinal
Field `airlines` may be 'final'
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/resources/AirlinesResource.java`
#### Snippet
```java
          }))
public class AirlinesResource {
    private static Map<Integer, Airline> airlines = new ConcurrentHashMap<Integer, Airline>();

    static {
```

### FieldMayBeFinal
Field `code` may be 'final'
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/exception/ApiException.java`
#### Snippet
```java

public class ApiException extends Exception {
    private int code;
    public ApiException(int code, String msg) {
        super(msg);
```

### FieldMayBeFinal
Field `bookings` may be 'final'
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/resources/bookings/BookingResource.java`
#### Snippet
```java
@Server(description = "Unsecure server", url = "http://gigantic-server.com:80")
public class BookingResource {
    private Map<Integer, Booking> bookings = new ConcurrentHashMap<Integer, Booking>();
    private volatile int currentId = 0;

```

### FieldMayBeFinal
Field `code` may be 'final'
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/exception/NotFoundException.java`
#### Snippet
```java

public class NotFoundException extends ApiException {
    private int code;
    public NotFoundException(int code, String msg) {
        super(code, msg);
```

### FieldMayBeFinal
Field `value` may be 'final'
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/enums/SecuritySchemeIn.java`
#### Snippet
```java
    DEFAULT(""), HEADER("header"), QUERY("query"), COOKIE("cookie");

    private String value;

    SecuritySchemeIn(String value) {
```

### FieldMayBeFinal
Field `reviews` may be 'final'
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/resources/ReviewResource.java`
#### Snippet
```java
public class ReviewResource {

    private static Map<Integer, Review> reviews = new ConcurrentHashMap<Integer, Review>();
    private static Map<String, Long> visits = new ConcurrentHashMap<>();
    private volatile int currentId = 0;
```

### FieldMayBeFinal
Field `visits` may be 'final'
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/resources/ReviewResource.java`
#### Snippet
```java

    private static Map<Integer, Review> reviews = new ConcurrentHashMap<Integer, Review>();
    private static Map<String, Long> visits = new ConcurrentHashMap<>();
    private volatile int currentId = 0;

```

### FieldMayBeFinal
Field `value` may be 'final'
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/enums/SchemaType.java`
#### Snippet
```java
            "array"), DEFAULT("");

    private String value;

    SchemaType(String value) {
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/utils/ConfigAsset.java`
#### Snippet
```java
public class ConfigAsset implements Asset {

    private Properties properties = new Properties();

    public ConfigAsset put(String key, String... values) {
```

### FieldMayBeFinal
Field `narrative` may be 'final'
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/model/Weather.java`
#### Snippet
```java

    @Schema(required = true)
    private String narrative;

    public Weather() {
```

### FieldMayBeFinal
Field `code` may be 'final'
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/exception/BadRequestException.java`
#### Snippet
```java

public class BadRequestException extends ApiException {
    private int code;
    public BadRequestException(int code, String msg) {
        super(code, msg);
```

### FieldMayBeFinal
Field `value` may be 'final'
in `api/src/main/java/org/eclipse/microprofile/openapi/models/media/Encoding.java`
#### Snippet
```java
        FORM("form"), SPACE_DELIMITED("spaceDelimited"), PIPE_DELIMITED("pipeDelimited"), DEEP_OBJECT("deepObject");

        private String value;

        Style(String value) {
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

## RuleId[id=UastIncorrectHttpHeaderInspection]
### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/resource/PetResource.java`
#### Snippet
```java
            @Parameter(name = "apiKey", description = "authentication key to access this method",
                       schema = @Schema(type = SchemaType.STRING, implementation = String.class, maxLength = 256,
                                        minLength = 32)) @HeaderParam("apiKey") String apiKey,
            @Parameter(name = "petId", description = "ID of pet that needs to be fetched", required = true,
                       schema = @Schema(implementation = Long.class, maximum = "10",
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/resource/PetResource.java`
#### Snippet
```java
    @Deprecated
    public Response findPetsByTags(
            @HeaderParam("apiKey") String apiKey,
            @Parameter(name = "tags", description = "Tags to filter by", required = true, deprecated = true,
                       schema = @Schema(implementation = String.class, deprecated = true,
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `value` in enum 'SecuritySchemeType'
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/enums/SecuritySchemeType.java`
#### Snippet
```java
    DEFAULT(""), APIKEY("apiKey"), HTTP("http"), OPENIDCONNECT("openIdConnect"), OAUTH2("oauth2");

    private String value;

    SecuritySchemeType(String value) {
```

### NonFinalFieldInEnum
Non-final field `value` in enum 'ParameterIn'
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/enums/ParameterIn.java`
#### Snippet
```java
    DEFAULT(""), HEADER("header"), QUERY("query"), PATH("path"), COOKIE("cookie");

    private String value;

    ParameterIn(String value) {
```

### NonFinalFieldInEnum
Non-final field `value` in enum 'ParameterStyle'
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle.java`
#### Snippet
```java
                    "deepObject"), SIMPLE("simple");

    private String value;

    ParameterStyle(String value) {
```

### NonFinalFieldInEnum
Non-final field `value` in enum 'SecuritySchemeIn'
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/enums/SecuritySchemeIn.java`
#### Snippet
```java
    DEFAULT(""), HEADER("header"), QUERY("query"), COOKIE("cookie");

    private String value;

    SecuritySchemeIn(String value) {
```

### NonFinalFieldInEnum
Non-final field `value` in enum 'SchemaType'
in `api/src/main/java/org/eclipse/microprofile/openapi/annotations/enums/SchemaType.java`
#### Snippet
```java
            "array"), DEFAULT("");

    private String value;

    SchemaType(String value) {
```

### NonFinalFieldInEnum
Non-final field `value` in enum 'Style'
in `api/src/main/java/org/eclipse/microprofile/openapi/models/media/Encoding.java`
#### Snippet
```java
        FORM("form"), SPACE_DELIMITED("spaceDelimited"), PIPE_DELIMITED("pipeDelimited"), DEEP_OBJECT("deepObject");

        private String value;

        Style(String value) {
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `api/src/main/java/org/eclipse/microprofile/openapi/spi/OASFactoryResolver.java`
#### Snippet
```java
        if (instance == null) {
            synchronized (OASFactoryResolver.class) {
                if (instance != null) {
                    return instance;
                }

                ClassLoader cl = AccessController.doPrivileged(new PrivilegedAction<ClassLoader>() {
                    @Override
                    public ClassLoader run() {
                        return Thread.currentThread().getContextClassLoader();
                    }
                });
                if (cl == null) {
                    cl = OASFactoryResolver.class.getClassLoader();
                }

                OASFactoryResolver newInstance = loadSpi(cl);

                if (newInstance == null) {
                    throw new IllegalStateException("No OASFactoryResolver implementation found!");
                }

                instance = newInstance;
            }
        }

        return instance;
```

### DuplicatedCode
Duplicated code
in `api/src/main/java/org/eclipse/microprofile/openapi/spi/OASFactoryResolver.java`
#### Snippet
```java
        ServiceLoader<OASFactoryResolver> sl = ServiceLoader.load(OASFactoryResolver.class, cl);
        for (OASFactoryResolver spi : sl) {
            if (instance != null) {
                throw new IllegalStateException(
                        "Multiple OASFactoryResolver implementations found: " + spi.getClass().getName() + " and "
                                + instance.getClass().getName());
            } else {
                instance = spi;
            }
        }
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/data/PetData.java`
#### Snippet
```java
        if (pets.size() > 0) {
            for (int i = pets.size() - 1; i >= 0; i--) {
                if (pets.get(i).getId() == pet.getId()) {
                    pets.remove(i);
                }
            }
        }
        pets.add(pet);
        return pet;
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/resource/JavaRestResourceUtil.java`
#### Snippet
```java
        if (output < minVal) {
            output = minVal;
        }
        if (maxVal == -1) {
            if (output < minVal) {
                output = minVal;
            }
        } else if (output > maxVal) {
            output = maxVal;
        }
        return output;
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/resource/PetResource.java`
#### Snippet
```java
            if (name != null && !"".equals(name)) {
                pet.setName(name);
            }
            if (status != null && !"".equals(status)) {
                pet.setStatus(status);
            }
            petData.addPet(pet);
            return Response.ok().build();
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/AirlinesAppTest.java`
#### Snippet
```java
        ValidatableResponse vr = callEndpoint(type);
        vr.body("servers", hasSize(2));
        vr.body("servers.url", hasSize(2));

        String url = "https://{username}.gigantic-server.com:{port}/{basePath}";
        String serverPath = "servers.find { it.url == '" + url + "' }";
        vr.body(serverPath + ".description", equalTo("The production API server"));
        vr.body(serverPath + ".variables", aMapWithSize(4));
        vr.body(serverPath + ".variables.username.description", equalTo("Reviews of the app by users"));
        vr.body(serverPath + ".variables.username.default", equalTo("user1"));
        vr.body(serverPath + ".variables.username.enum", containsInAnyOrder("user1", "user2"));
        vr.body(serverPath + ".variables.port.description", equalTo("Booking data"));
        vr.body(serverPath + ".variables.port.default", equalTo("8443"));
        vr.body(serverPath + ".variables.user.description", equalTo("User data"));
        vr.body(serverPath + ".variables.user.default", equalTo("user"));
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/AirlinesAppTest.java`
#### Snippet
```java
        for (int i = 0; i < list.size(); i++) {
            String currentParam = list.get(i)[0];
            String query = reviewParameters + ".findAll { it.name == '" + currentParam + "' }";

            vr.body(query + ".in", both(hasSize(1)).and(contains("query")));
            vr.body(query + ".description", both(hasSize(1)).and(contains(list.get(i)[1])));
            vr.body(query + ".required", both(hasSize(1)).and(contains(true)));
            vr.body(query + ".schema.type", both(hasSize(1)).and(contains("string")));
        }
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/AirlinesAppTest.java`
#### Snippet
```java
        List<String[]> list = new ArrayList<String[]>();
        list.add(new String[]{"airportFrom", "Airport the customer departs from"});
        list.add(new String[]{"returningDate", "Customer return date"});
        list.add(new String[]{"airportTo", "Airport the customer returns to"});
        list.add(new String[]{"numberOfAdults", "Number of adults on the flight"});
        list.add(new String[]{"numberOfChildren", "Number of children on the flight"});

        for (int i = 0; i < list.size(); i++) {
            String currentParam = list.get(i)[0];
            String query = availabilityParameters + ".findAll { it.name == '" + currentParam + "' }";

            vr.body(query + ".in", both(hasSize(1)).and(contains("query")));
            vr.body(query + ".description", both(hasSize(1)).and(contains(list.get(i)[1])));
            vr.body(query + ".required", both(hasSize(1)).and(contains(true)));
            vr.body(query + ".schema.type", both(hasSize(1)).and(contains("string")));
        }

        vr.body(availabilityParameters + ".findAll { it.name == 'numberOfAdults' }.schema.minimum",
                both(hasSize(1)).and(contains(0)));
        vr.body(availabilityParameters + ".findAll { it.name == 'numberOfChildren' }.schema.minimum",
                both(hasSize(1)).and(contains(0)));
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/AirlinesAppTest.java`
#### Snippet
```java
        ValidatableResponse vr = callEndpoint(type);
        String tagsPath = "tags.find { it.name == '";
        String desc = "' }.description";
        vr.body(tagsPath + "user" + desc, equalTo("Operations about user"));
        vr.body(tagsPath + "create" + desc, equalTo("Operations about create"));
        vr.body(tagsPath + "Airlines" + desc, equalTo("All the airlines methods"));
        vr.body(tagsPath + "Availability" + desc, equalTo("All the availability methods"));
        vr.body(tagsPath + "Get Flights" + desc, equalTo("method to retrieve all flights available"));
        vr.body(tagsPath + "Get Flights" + "' }.externalDocs.description",
                equalTo("A list of all the flights offered by the app"));
        vr.body(tagsPath + "Get Flights" + "' }.externalDocs.url", equalTo("http://airlinesratingapp.com/ourflights"));
        vr.body(tagsPath + "Bookings" + desc, equalTo("All the bookings methods"));
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/AirlinesAppTest.java`
#### Snippet
```java
        ValidatableResponse vr = callEndpoint(type);

        // Tests to ensure that the reusable items declared using the
        // @Components annotation (within @OpenAPIDefinition) exist.
        // Each of these item types are tested elsewhere, so no need to test the
        // content of them here.
        vr.body("components.schemas.Bookings", notNullValue());
        vr.body("components.schemas.Airlines", notNullValue());
        vr.body("components.schemas.AirlinesRef", notNullValue());
        vr.body("components.responses.FoundAirlines", notNullValue());
        vr.body("components.responses.FoundBookings", notNullValue());
        vr.body("components.parameters.departureDate", notNullValue());
        vr.body("components.parameters.username", notNullValue());
        vr.body("components.examples.review", notNullValue());
        vr.body("components.examples.user", notNullValue());
        vr.body("components.requestBodies.review", notNullValue());
        vr.body("components.headers.Max-Rate", notNullValue());
        vr.body("components.headers.Request-Limit", notNullValue());
        vr.body("components.securitySchemes.httpTestScheme", notNullValue());
        vr.body("components.links.UserName", notNullValue());
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/AirlinesAppTest.java`
#### Snippet
```java
        vr.body(responseHeader1 + ".required", equalTo(true));
        vr.body(responseHeader1 + ".deprecated", equalTo(true));
        vr.body(responseHeader1 + ".allowEmptyValue", equalTo(true));
        vr.body(responseHeader1 + ".style", equalTo("simple"));
        vr.body(responseHeader1 + ".schema.type", equalTo("integer"));
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/AirlinesAppTest.java`
#### Snippet
```java
        ValidatableResponse vr = callEndpoint(type);
        String maxRate = "components.headers.Max-Rate";
        vr.body(maxRate + ".description", equalTo("Maximum rate"));
        vr.body(maxRate + ".required", equalTo(true));
        vr.body(maxRate + ".deprecated", equalTo(true));
        vr.body(maxRate + ".allowEmptyValue", equalTo(true));
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/FilterTest.java`
#### Snippet
```java
        vr.body(serverPath + ".variables", aMapWithSize(4));
        vr.body(serverPath + ".variables.username.description", equalTo("Reviews of the app by users"));
        vr.body(serverPath + ".variables.username.default", equalTo("user1"));
        vr.body(serverPath + ".variables.username.enum", containsInAnyOrder("user1", "user2"));
        vr.body(serverPath + ".variables.port.description", equalTo("Booking data"));
        vr.body(serverPath + ".variables.port.default", equalTo("8443"));
        vr.body(serverPath + ".variables.user.description", equalTo("User data"));
        vr.body(serverPath + ".variables.user.default", equalTo("user"));
        vr.body(serverPath + ".variables.basePath.default", equalTo("v2"));
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        final String callbackKey = "myCallback";
        final Callback callbackValue = createConstructibleInstance(Callback.class);
        checkSameObject(c, c.addCallback(callbackKey, callbackValue));
        checkMapEntry(c.getCallbacks(), callbackKey, callbackValue);
        assertEquals(c.getCallbacks().size(), 1, "The map is expected to contain one entry.");
        c.removeCallback(callbackKey);
        assertEquals(c.getCallbacks().size(), 0, "The map is expected to be empty.");

        final String callbackKey2 = "myCallbackKey2";
        final Callback callbackValue2 = createConstructibleInstance(Callback.class);
        c.setCallbacks(Collections.singletonMap(callbackKey2, callbackValue2));
        checkMapEntry(c.getCallbacks(), callbackKey2, callbackValue2);
        assertEquals(c.getCallbacks().size(), 1, "The map is expected to contain one entry.");
        checkSameObject(c, c.addCallback(callbackKey, callbackValue));
        checkMapEntry(c.getCallbacks(), callbackKey, callbackValue);
        assertEquals(c.getCallbacks().size(), 2, "The map is expected to contain two entries.");

        Callback otherCallbackValue = createConstructibleInstance(Callback.class);
        checkMapImmutable(c, Components::getCallbacks, "otherCallback", otherCallbackValue);
        checkNullValueInAdd(c::getCallbacks, c::addCallback, "someCallback", callbackValue);
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        final String exampleKey = "myExample";
        final Example exampleValue = createConstructibleInstance(Example.class);
        checkSameObject(c, c.addExample(exampleKey, exampleValue));
        checkMapEntry(c.getExamples(), exampleKey, exampleValue);
        assertEquals(c.getExamples().size(), 1, "The map is expected to contain one entry.");
        c.removeExample(exampleKey);
        assertEquals(c.getExamples().size(), 0, "The map is expected to be empty.");
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        final String exampleKey2 = "myExampleKey2";
        final Example exampleValue2 = createConstructibleInstance(Example.class);
        c.setExamples(Collections.singletonMap(exampleKey2, exampleValue2));
        checkMapEntry(c.getExamples(), exampleKey2, exampleValue2);
        assertEquals(c.getExamples().size(), 1, "The map is expected to contain one entry.");
        checkSameObject(c, c.addExample(exampleKey, exampleValue));
        checkMapEntry(c.getExamples(), exampleKey, exampleValue);
        assertEquals(c.getExamples().size(), 2, "The map is expected to contain two entries.");
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        final Header headerValue = createConstructibleInstance(Header.class);
        checkSameObject(c, c.addHeader(headerKey, headerValue));
        checkMapEntry(c.getHeaders(), headerKey, headerValue);
        assertEquals(c.getHeaders().size(), 1, "The map is expected to contain one entry.");
        c.removeHeader(headerKey);
        assertEquals(c.getHeaders().size(), 0, "The map is expected to be empty.");
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        final String headerKey2 = "myHeaderKey2";
        final Header headerValue2 = createConstructibleInstance(Header.class);
        c.setHeaders(Collections.singletonMap(headerKey2, headerValue2));
        checkMapEntry(c.getHeaders(), headerKey2, headerValue2);
        assertEquals(c.getHeaders().size(), 1, "The map is expected to contain one entry.");
        checkSameObject(c, c.addHeader(headerKey, headerValue));
        checkMapEntry(c.getHeaders(), headerKey, headerValue);
        assertEquals(c.getHeaders().size(), 2, "The map is expected to contain two entries.");
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        final Link linkValue = createConstructibleInstance(Link.class);
        checkSameObject(c, c.addLink(linkKey, linkValue));
        checkMapEntry(c.getLinks(), linkKey, linkValue);
        assertEquals(c.getLinks().size(), 1, "The map is expected to contain one entry.");
        c.removeLink(linkKey);
        assertEquals(c.getLinks().size(), 0, "The map is expected to be empty.");
        Link otherLinkValue = createConstructibleInstance(Link.class);

        final String linkKey2 = "myLinkKey2";
        final Link linkValue2 = createConstructibleInstance(Link.class);
        c.setLinks(Collections.singletonMap(linkKey2, linkValue2));
        checkMapEntry(c.getLinks(), linkKey2, linkValue2);
        assertEquals(c.getLinks().size(), 1, "The map is expected to contain one entry.");
        checkSameObject(c, c.addLink(linkKey, linkValue));
        checkMapEntry(c.getLinks(), linkKey, linkValue);
        assertEquals(c.getLinks().size(), 2, "The map is expected to contain two entries.");

        checkMapImmutable(c, Components::getLinks, "otherLink", otherLinkValue);
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        c.setParameters(Collections.singletonMap(parameterKey2, parameterValue2));
        checkMapEntry(c.getParameters(), parameterKey2, parameterValue2);
        assertEquals(c.getParameters().size(), 1, "The map is expected to contain one entry.");
        checkSameObject(c, c.addParameter(parameterKey, parameterValue));
        checkMapEntry(c.getParameters(), parameterKey, parameterValue);
        assertEquals(c.getParameters().size(), 2, "The map is expected to contain two entries.");
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        checkSameObject(o, o.addSecurityRequirement(sr));
        checkListEntry(o.getSecurity(), sr);
        assertEquals(o.getSecurity().size(), 1, "The list is expected to contain one entry.");
        o.removeSecurityRequirement(sr);
        assertEquals(o.getSecurity().size(), 0, "The list is expected to be empty.");

        final SecurityRequirement sr2 = createConstructibleInstance(SecurityRequirement.class);
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        o.setSecurity(Collections.singletonList(sr2));
        assertEquals(o.getSecurity().size(), 1, "The list is expected to contain one entry.");
        checkListEntry(o.getSecurity(), sr2);
        checkSameObject(o, o.addSecurityRequirement(sr));
        assertEquals(o.getSecurity().size(), 2, "The list is expected to contain two entries.");
        checkListEntry(o.getSecurity(), sr);

        SecurityRequirement otherSecurityRequirementValue = createConstructibleInstance(SecurityRequirement.class);
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        checkListImmutable(o, OpenAPI::getSecurity, otherSecurityRequirementValue);

        final Server s = createConstructibleInstance(Server.class);
        checkSameObject(o, o.addServer(s));
        checkListEntry(o.getServers(), s);
        assertEquals(o.getServers().size(), 1, "The list is expected to contain one entry.");
        o.removeServer(s);
        assertEquals(o.getServers().size(), 0, "The list is expected to be empty.");

        final Server s2 = createConstructibleInstance(Server.class);
        o.setServers(Collections.singletonList(s2));
        assertEquals(o.getServers().size(), 1, "The list is expected to contain one entry.");
        checkListEntry(o.getServers(), s2);
        checkSameObject(o, o.addServer(s));
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        o.setTags(Collections.singletonList(t2));
        assertEquals(o.getTags().size(), 1, "The list is expected to contain one entry.");
        checkListEntry(o.getTags(), t2);
        checkSameObject(o, o.addTag(t));
        assertEquals(o.getTags().size(), 2, "The list is expected to contain two entries.");
        checkListEntry(o.getTags(), t);
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        final Parameter p = createConstructibleInstance(Parameter.class);
        checkSameObject(o, o.addParameter(p));
        checkListEntry(o.getParameters(), p);
        assertEquals(o.getParameters().size(), 1, "The list is expected to contain one entry.");
        o.removeParameter(p);
        assertEquals(o.getParameters().size(), 0, "The list is expected to be empty.");

        final Parameter p2 = createConstructibleInstance(Parameter.class);
        o.setParameters(Collections.singletonList(p2));
        assertEquals(o.getParameters().size(), 1, "The list is expected to contain one entry.");
        checkListEntry(o.getParameters(), p2);
        checkSameObject(o, o.addParameter(p));
        assertEquals(o.getParameters().size(), 2, "The list is expected to contain two entries.");
        checkListEntry(o.getParameters(), p);

        Parameter otherParameter = createConstructibleInstance(Parameter.class);
        checkListImmutable(o, Operation::getParameters, otherParameter);
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        final Server s = createConstructibleInstance(Server.class);
        checkSameObject(pi, pi.addServer(s));
        checkListEntry(pi.getServers(), s);
        assertEquals(pi.getServers().size(), 1, "The list is expected to contain one entry.");
        pi.removeServer(s);
        assertEquals(pi.getServers().size(), 0, "The list is expected to be empty.");

        final Server s2 = createConstructibleInstance(Server.class);
        pi.setServers(Collections.singletonList(s2));
        assertEquals(pi.getServers().size(), 1, "The list is expected to contain one entry.");
        checkListEntry(pi.getServers(), s2);
        checkSameObject(pi, pi.addServer(s));
        assertEquals(pi.getServers().size(), 2, "The list is expected to contain two entries.");
        checkListEntry(pi.getServers(), s);

        Server otherServer = createConstructibleInstance(Server.class);
        checkListImmutable(pi, PathItem::getServers, otherServer);
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        final PathItem pathItemValue = createConstructibleInstance(PathItem.class);
        p.setPathItems(Collections.singletonMap(pathItemKey, pathItemValue));
        assertTrue(p.hasPathItem(pathItemKey), pathItemKey + " is present in the map");
        assertEquals(p.getPathItems().size(), 1, "The map is expected to contain one entry.");
        assertSame(p.getPathItem(pathItemKey), pathItemValue,
                "The value associated with the key: " + pathItemKey
                        + " is expected to be the same one that was added.");
        checkMapEntry(p.getPathItems(), pathItemKey, pathItemValue);
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        assertFalse(p.hasPathItem(pathItemKey2), pathItemKey2 + " is absent in the map");
        final PathItem pathItemValue2 = createConstructibleInstance(PathItem.class);
        checkSameObject(p, p.addPathItem(pathItemKey2, pathItemValue2));
        assertTrue(p.hasPathItem(pathItemKey2), pathItemKey2 + " is present in the map");
        assertEquals(p.getPathItems().size(), 2, "The map is expected to contain two entries.");
        assertSame(p.getPathItem(pathItemKey2), pathItemValue2,
                "The value associated with the key: " + pathItemKey2
                        + " is expected to be the same one that was added.");
        checkMapEntry(p.getPathItems(), pathItemKey2, pathItemValue2);

        p.removePathItem(pathItemKey);
        assertFalse(p.hasPathItem(pathItemKey), pathItemKey + " is absent in the map");
        assertEquals(p.getPathItems().size(), 1, "The map is expected to contain one entry.");

        p.removePathItem(pathItemKey2);
        assertFalse(p.hasPathItem(pathItemKey2), pathItemKey + " is absent in the map");
        assertEquals(p.getPathItems().size(), 0, "The map is expected to contain 0 entries.");

        final PathItem otherValue = createConstructibleInstance(PathItem.class);
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        final String headerKey = "myHeaderKey";
        final Header headerValue = createConstructibleInstance(Header.class);
        checkSameObject(e, e.addHeader(headerKey, headerValue));
        checkMapEntry(e.getHeaders(), headerKey, headerValue);
        assertEquals(e.getHeaders().size(), 1, "The map is expected to contain one entry.");
        e.removeHeader(headerKey);
        assertEquals(e.getHeaders().size(), 0, "The map is expected to be empty.");

        final String headerKey2 = "myHeaderKey2";
        final Header headerValue2 = createConstructibleInstance(Header.class);
        e.setHeaders(Collections.singletonMap(headerKey2, headerValue2));
        checkMapEntry(e.getHeaders(), headerKey2, headerValue2);
        assertEquals(e.getHeaders().size(), 1, "The map is expected to contain one entry.");
        checkSameObject(e, e.addHeader(headerKey, headerValue));
        checkMapEntry(e.getHeaders(), headerKey, headerValue);
        assertEquals(e.getHeaders().size(), 2, "The map is expected to contain two entries.");
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        final String enumeration = new String("enumValue");
        checkSameObject(s, s.addEnumeration(enumeration));
        checkListEntry(s.getEnumeration(), enumeration);
        assertEquals(s.getEnumeration().size(), 1, "The list is expected to contain one entry.");
        s.removeEnumeration(enumeration);
        assertEquals(s.getEnumeration().size(), 0, "The list is expected to be empty.");

        final String enumeration2 = new String("enumValue2");
        s.setEnumeration(Collections.singletonList(enumeration2));
        assertEquals(s.getEnumeration().size(), 1, "The list is expected to contain one entry.");
        checkListEntry(s.getEnumeration(), enumeration2);
        checkSameObject(s, s.addEnumeration(enumeration));
        assertEquals(s.getEnumeration().size(), 2, "The list is expected to contain two entries.");
        checkListEntry(s.getEnumeration(), enumeration);

        final String otherEnumerationValue = new String("otherValue");
        checkListImmutable(s, Schema::getEnumeration, otherEnumerationValue);
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/ModelConstructionTest.java`
#### Snippet
```java
        if (!p.isPrimitive() && !p.isCompatible(Map.class) && !p.isCompatible(List.class)) {
            assertSame(p.invokeGetter(o), value1, "The return value of the getter method for property \"" +
                    p.getName() + "\" of interface \"" + enclosingInterface.getName() +
                    "\" is expected to be the same as the value that was set.");
        } else {
            assertEquals(p.invokeGetter(o), value1, "The return value of the getter method for property \"" +
                    p.getName() + "\" of interface \"" + enclosingInterface.getName() +
                    "\" is expected to be equal to the value that was set.");
        }
```

### DuplicatedCode
Duplicated code
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/PetStoreAppTest.java`
#### Snippet
```java
        String schemaPath = dereference(vr, path) + ".content.'text/csv'.schema";

        // The schema is present (either embedded or a $ref)
        vr.body(schemaPath, notNullValue());

        String schemaObject = dereference(vr, schemaPath);

        vr.body(schemaObject,
                allOf(aMapWithSize(3),
                        hasEntry(equalTo("required"), notNullValue()),
                        hasEntry(equalTo("type"), equalTo("object")),
                        hasEntry(equalTo("properties"), notNullValue())));
```

## RuleId[id=MismatchedJavadocCode]
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
     * @return the list of possible class matches
     **/
    Class<?>[] anyOf() default {};
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
     * Allows multiple properties in an object to be marked as required.
     *
     * @return the list of required schema properties
     **/
    String[] requiredProperties() default {};
```

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
     * @return the list of classes to match
     **/
    Class<?>[] allOf() default {};
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
     * in the schema model.
     * 
     * @return a list of allowed schema values
     */
    String[] enumeration() default {};
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
     * @return the list of possible class matches
     **/
    Class<?>[] anyOf() default {};
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

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/model/User.java`
#### Snippet
```java
    @Schema(name = "status", title = "User Status")

    /**
     * Returns the status of this User instance.
     * 
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

## RuleId[id=UnusedAssignment]
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

    public long getLong(long minVal, long maxVal, long defaultValue, String inputString) {
        long output = defaultValue;
        try {
            output = Long.parseLong(inputString);
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

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `api/src/main/java/org/eclipse/microprofile/openapi/OASFactory.java`
#### Snippet
```java
 * <pre>
 * <code>OASFactory.createObject(OpenAPI.class)
 *          .setExternalDocs(OASFactory.createObject(ExternalDocumentation.class).url("http://myDoc"));</code>
 * </pre>
 */
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/exception/BadRequestException.java`
#### Snippet
```java

public class BadRequestException extends ApiException {
    private int code;
    public BadRequestException(int code, String msg) {
        super(code, msg);
```

### FieldCanBeLocal
Field can be converted to a local variable
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/OASConfigScanClassBase.java`
#### Snippet
```java
 */
public abstract class OASConfigScanClassBase extends AppTestBase {
    private ValidatableResponse vr;

    @Test(dataProvider = "formatProvider")
```

### FieldCanBeLocal
Field can be converted to a local variable
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/exception/ApiException.java`
#### Snippet
```java

public class ApiException extends Exception {
    private int code;
    public ApiException(int code, String msg) {
        super(msg);
```

### FieldCanBeLocal
Field can be converted to a local variable
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/exception/ApiException.java`
#### Snippet
```java

public class ApiException extends Exception {
    private int code;
    public ApiException(int code, String msg) {
        super(msg);
```

### FieldCanBeLocal
Field can be converted to a local variable
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/exception/NotFoundException.java`
#### Snippet
```java

public class NotFoundException extends ApiException {
    private int code;
    public NotFoundException(int code, String msg) {
        super(code, msg);
```

### FieldCanBeLocal
Field can be converted to a local variable
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/OASConfigScanDisableTest.java`
#### Snippet
```java

public class OASConfigScanDisableTest extends AppTestBase {
    private ValidatableResponse vr;

    @Deployment(name = "airlines", testable = false)
```

### FieldCanBeLocal
Field can be converted to a local variable
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/OASConfigServersTest.java`
#### Snippet
```java

public class OASConfigServersTest extends AppTestBase {
    private ValidatableResponse vr;

    @Deployment(name = "airlines", testable = false)
```

### FieldCanBeLocal
Field can be converted to a local variable
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/petstore/exception/BadRequestException.java`
#### Snippet
```java

public class BadRequestException extends ApiException {
    private int code;
    public BadRequestException(int code, String msg) {
        super(code, msg);
```

### FieldCanBeLocal
Field can be converted to a local variable
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/AppTestBase.java`
#### Snippet
```java

    private static String serverUrl;
    private static String username;
    private static String password;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/AppTestBase.java`
#### Snippet
```java
    private static String serverUrl;
    private static String username;
    private static String password;

    protected static final Filter YAML_FILTER = new YamlToJsonFilter();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `tck/src/main/java/org/eclipse/microprofile/openapi/tck/AppTestBase.java`
#### Snippet
```java
    private static final int DEFAULT_PORT = 9080;

    private static String serverUrl;
    private static String username;
    private static String password;
```

## RuleId[id=NonAtomicOperationOnVolatileField]
### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `currentId`
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/resources/bookings/BookingResource.java`
#### Snippet
```java
                         extensions = @Extension(name = "x-request-body", value = "test-request-body")) Booking task) {
        bookings.put(currentId, task);
        return Response.status(Status.CREATED).entity("{\"id\":" + currentId++ + "}").build();
    }

```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `currentId`
in `tck/src/main/java/org/eclipse/microprofile/openapi/apps/airlines/resources/ReviewResource.java`
#### Snippet
```java
    public Response createReview(Review review) throws ReviewRejectedException {
        reviews.put(currentId, review);
        return Response.status(Status.CREATED).entity("{\"id\":" + currentId++ + "}").build();
    }

```

