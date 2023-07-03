# rides-java-sdk 
 
# Bad smells
I found 161 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| NullableProblems | 99 | false |
| FieldMayBeFinal | 26 | false |
| JavadocDeclaration | 17 | false |
| NonFinalFieldInEnum | 6 | false |
| IgnoreResultOfCall | 3 | false |
| JavadocLinkAsPlainText | 2 | false |
| FieldCanBeLocal | 2 | false |
| UnnecessaryModifier | 1 | true |
| AutoCloseableResource | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| UastIncorrectHttpHeaderInspection | 1 | false |
| DuplicatedCode | 1 | false |
| CatchMayIgnoreException | 1 | false |
## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `uber-core/src/main/java/com/uber/sdk/core/client/internal/LoginPushedAuthorizationRequest.java`
#### Snippet
```java
    }

    public static interface Callback {
        void onSuccess(String requestUri);

```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'ResponseBody' used without 'try'-with-resources statement
in `uber-rides/src/main/java/com/uber/sdk/rides/client/error/ErrorParser.java`
#### Snippet
```java

        try {
            return parseError(response.errorBody().string(), response.code(), response.message());
        } catch (IOException e) {
            return new ApiError(null, response.code(), "Unknown Error");
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@return` tag description is missing
in `uber-core/src/main/java/com/uber/sdk/core/auth/AccessTokenStorage.java`
#### Snippet
```java
     * Returned currently stored token.
     *
     * @return
     */
    @Nullable
```

### JavadocDeclaration
`@param token` tag description is missing
in `uber-core/src/main/java/com/uber/sdk/core/auth/AccessTokenStorage.java`
#### Snippet
```java
     * Replace token with new one.
     *
     * @param token
     */
    void setAccessToken(@Nonnull AccessToken token);
```

### JavadocDeclaration
`@return` tag description is missing
in `uber-core/src/main/java/com/uber/sdk/core/auth/Authenticator.java`
#### Snippet
```java
     * Indicates whether this authenticator can be refreshed.
     *
     * @return
     */
    boolean isRefreshable();
```

### JavadocDeclaration
`@param response` tag description is missing
in `uber-core/src/main/java/com/uber/sdk/core/auth/Authenticator.java`
#### Snippet
```java
     * Refresh authentication token that is used to {@link #signRequest(Request.Builder)}
     *
     * @param response
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `uber-core/src/main/java/com/uber/sdk/core/auth/Authenticator.java`
#### Snippet
```java
     *
     * @param response
     * @throws IOException
     */
    Request refresh(Response response) throws IOException;
```

### JavadocDeclaration
`@param builder` tag description is missing
in `uber-core/src/main/java/com/uber/sdk/core/auth/Authenticator.java`
#### Snippet
```java
     * Add authentication header required to the request.
     *
     * @param builder
     */
    void signRequest(Request.Builder builder);
```

### JavadocDeclaration
`@param fareId` tag description is missing
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
         * Sets the fare Id requested for this ride.
         *
         * @param fareId
         */
        public Builder setFareId(@Nullable String fareId) {
```

### JavadocDeclaration
`@param seatCount` tag description is missing
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
         * Sets the number of seats required for this request.
         *
         * @param seatCount
         */
        public Builder setSeatCount(@Nullable Integer seatCount) {
```

### JavadocDeclaration
Duplicate @param tag for parameter 'longitude'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
         * @param latitude the pickup location's latitude.
         * @param longitude the pickup location's longitude .
         * @param longitude
         */
        public Builder setPickupCoordinates(@Nullable Float latitude, @Nullable Float longitude) {
```

### JavadocDeclaration
`@param longitude` tag description is missing
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
         * @param latitude the pickup location's latitude.
         * @param longitude the pickup location's longitude .
         * @param longitude
         */
        public Builder setPickupCoordinates(@Nullable Float latitude, @Nullable Float longitude) {
```

### JavadocDeclaration
`@return` tag description is missing
in `uber-core/src/main/java/com/uber/sdk/core/client/SessionConfiguration.java`
#### Snippet
```java
    /**
     * Gets the {@link ProfileHint} used to prefill user's profile information
     * @return
     */
    public ProfileHint getProfileHint() {
```

### JavadocDeclaration
`@return` tag description is missing
in `uber-core/src/main/java/com/uber/sdk/core/client/SessionConfiguration.java`
#### Snippet
```java
         *
         * @param serverToken to be used for identification
         * @return
         */
        public Builder setServerToken(@Nonnull String serverToken) {
```

### JavadocDeclaration
`@return` tag description is missing
in `uber-core/src/main/java/com/uber/sdk/core/client/SessionConfiguration.java`
#### Snippet
```java
         *
         * @param environment to be set
         * @return
         */
        public Builder setEnvironment(@Nonnull Environment environment) {
```

### JavadocDeclaration
`@return` tag description is missing
in `uber-core/src/main/java/com/uber/sdk/core/client/SessionConfiguration.java`
#### Snippet
```java
         *
         * @param scopes to be set
         * @return
         */
        public Builder setScopes(@Nonnull Collection<Scope> scopes) {
```

### JavadocDeclaration
`@return` tag description is missing
in `uber-core/src/main/java/com/uber/sdk/core/client/SessionConfiguration.java`
#### Snippet
```java
         *
         * @param clientSecret to be used for identification
         * @return
         */
        public Builder setClientSecret(@Nonnull String clientSecret) {
```

### JavadocDeclaration
`@return` tag description is missing
in `uber-core/src/main/java/com/uber/sdk/core/client/SessionConfiguration.java`
#### Snippet
```java
         *
         * @param clientId to be used for identification
         * @return
         */
        public Builder setClientId(@Nonnull String clientId) {
```

### JavadocDeclaration
Wrong tag `Link`
in `uber-core/src/main/java/com/uber/sdk/core/auth/ProfileHint.java`
#### Snippet
```java

/**
 * {@Link #ProfileHint} is builder to setup user's personal information like phone number, email
 * firstName and lastName
 */
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `value` may be 'final'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/Ride.java`
#### Snippet
```java
        @Json(name = "completed") COMPLETED("completed");

        private String value;

        Status(String value) {
```

### FieldMayBeFinal
Field `end_place_id` may be 'final'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
    private String end_address;
    @Nullable
    private String end_place_id;
    @Nullable
    private String surge_confirmation_id;
```

### FieldMayBeFinal
Field `payment_method_id` may be 'final'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
    private String surge_confirmation_id;
    @Nullable
    private String payment_method_id;
    @Nullable
    private Integer seat_count;
```

### FieldMayBeFinal
Field `start_latitude` may be 'final'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
    private String product_id;
    @Nullable
    private Float start_latitude;
    @Nullable
    private Float start_longitude;
```

### FieldMayBeFinal
Field `end_nickname` may be 'final'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
    private Float end_longitude;
    @Nullable
    private String end_nickname;
    @Nullable
    private String end_address;
```

### FieldMayBeFinal
Field `start_address` may be 'final'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
    private String start_nickname;
    @Nullable
    private String start_address;
    @Nullable
    private String start_place_id;
```

### FieldMayBeFinal
Field `end_longitude` may be 'final'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
    private Float end_latitude;
    @Nullable
    private Float end_longitude;
    @Nullable
    private String end_nickname;
```

### FieldMayBeFinal
Field `end_latitude` may be 'final'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
    private String start_place_id;
    @Nullable
    private Float end_latitude;
    @Nullable
    private Float end_longitude;
```

### FieldMayBeFinal
Field `start_nickname` may be 'final'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
    private Float start_longitude;
    @Nullable
    private String start_nickname;
    @Nullable
    private String start_address;
```

### FieldMayBeFinal
Field `start_place_id` may be 'final'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
    private String start_address;
    @Nullable
    private String start_place_id;
    @Nullable
    private Float end_latitude;
```

### FieldMayBeFinal
Field `fare_id` may be 'final'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
    private Integer seat_count;
    @Nullable
    private String fare_id;

    private RideRequestParameters(@Nullable String productId,
```

### FieldMayBeFinal
Field `product_id` may be 'final'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java

    @Nullable
    private String product_id;
    @Nullable
    private Float start_latitude;
```

### FieldMayBeFinal
Field `end_address` may be 'final'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
    private String end_nickname;
    @Nullable
    private String end_address;
    @Nullable
    private String end_place_id;
```

### FieldMayBeFinal
Field `start_longitude` may be 'final'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
    private Float start_latitude;
    @Nullable
    private Float start_longitude;
    @Nullable
    private String start_nickname;
```

### FieldMayBeFinal
Field `seat_count` may be 'final'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
    private String payment_method_id;
    @Nullable
    private Integer seat_count;
    @Nullable
    private String fare_id;
```

### FieldMayBeFinal
Field `end_latitude` may be 'final'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideUpdateParameters.java`
#### Snippet
```java
public class RideUpdateParameters {

    @Nullable private Float end_latitude;
    @Nullable private Float end_longitude;
    @Nullable private String end_nickname;
```

### FieldMayBeFinal
Field `end_longitude` may be 'final'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideUpdateParameters.java`
#### Snippet
```java

    @Nullable private Float end_latitude;
    @Nullable private Float end_longitude;
    @Nullable private String end_nickname;
    @Nullable private String end_address;
```

### FieldMayBeFinal
Field `end_place_id` may be 'final'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideUpdateParameters.java`
#### Snippet
```java
    @Nullable private String end_nickname;
    @Nullable private String end_address;
    @Nullable private String end_place_id;

    private RideUpdateParameters(
```

### FieldMayBeFinal
Field `end_nickname` may be 'final'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideUpdateParameters.java`
#### Snippet
```java
    @Nullable private Float end_latitude;
    @Nullable private Float end_longitude;
    @Nullable private String end_nickname;
    @Nullable private String end_address;
    @Nullable private String end_place_id;
```

### FieldMayBeFinal
Field `end_address` may be 'final'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideUpdateParameters.java`
#### Snippet
```java
    @Nullable private Float end_longitude;
    @Nullable private String end_nickname;
    @Nullable private String end_address;
    @Nullable private String end_place_id;

```

### FieldMayBeFinal
Field `address` may be 'final'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/PlaceParameters.java`
#### Snippet
```java
public class PlaceParameters {

    private String address;

    private PlaceParameters(@Nonnull String address) {
```

### FieldMayBeFinal
Field `placeId` may be 'final'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/Place.java`
#### Snippet
```java
        WORK("work");

        private String placeId;

        Places(String placeId) {
```

### FieldMayBeFinal
Field `profileHint` may be 'final'
in `uber-core/src/main/java/com/uber/sdk/core/client/SessionConfiguration.java`
#### Snippet
```java
    private final Collection<String> customScopes;
    private final Locale locale;
    private ProfileHint profileHint;

    protected SessionConfiguration(@Nonnull String clientId,
```

### FieldMayBeFinal
Field `domain` may be 'final'
in `uber-core/src/main/java/com/uber/sdk/core/client/SessionConfiguration.java`
#### Snippet
```java
        DEFAULT("uber.com");

        private String domain;

        EndpointRegion(String domain) {
```

### FieldMayBeFinal
Field `mScopeType` may be 'final'
in `uber-core/src/main/java/com/uber/sdk/core/auth/Scope.java`
#### Snippet
```java


    private ScopeType mScopeType;

    /**
```

### FieldMayBeFinal
Field `mBitValue` may be 'final'
in `uber-core/src/main/java/com/uber/sdk/core/auth/Scope.java`
#### Snippet
```java
     * Use powers of two to allow bit masking operation.
     */
    private int mBitValue;

    Scope(ScopeType scopeType, int bitValue) {
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `authorizationCodeResponseUrl` are queried, but never updated
in `samples/servlet-sample/src/main/java/com/uber/sdk/rides/samples/servlet/OAuth2CallbackServlet.java`
#### Snippet
```java
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestUrl = req.getRequestURL().append('?').append(req.getQueryString()).toString();
        AuthorizationCodeResponseUrl authorizationCodeResponseUrl =
                new AuthorizationCodeResponseUrl(requestUrl);

```

## RuleId[id=UastIncorrectHttpHeaderInspection]
### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `uber-core/src/main/java/com/uber/sdk/core/client/internal/ApiInterceptor.java`
#### Snippet
```java
    static final String LIB_VERSION = BuildConfig.VERSION;
    static final String HEADER_ACCEPT_LANGUAGE = "Accept-Language";
    static final String HEADER_USER_AGENT = "X-Uber-User-Agent";

    public final Authenticator authenticator;
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `value` in enum 'Status'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/Ride.java`
#### Snippet
```java
        @Json(name = "completed") COMPLETED("completed");

        private String value;

        Status(String value) {
```

### NonFinalFieldInEnum
Non-final field `placeId` in enum 'Places'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/Place.java`
#### Snippet
```java
        WORK("work");

        private String placeId;

        Places(String placeId) {
```

### NonFinalFieldInEnum
Non-final field `domain` in enum 'EndpointRegion'
in `uber-core/src/main/java/com/uber/sdk/core/client/SessionConfiguration.java`
#### Snippet
```java
        DEFAULT("uber.com");

        private String domain;

        EndpointRegion(String domain) {
```

### NonFinalFieldInEnum
Non-final field `subDomain` in enum 'Environment'
in `uber-core/src/main/java/com/uber/sdk/core/client/SessionConfiguration.java`
#### Snippet
```java
        SANDBOX("sandbox-api");

        public String subDomain;

        Environment(String subDomain) {
```

### NonFinalFieldInEnum
Non-final field `mScopeType` in enum 'Scope'
in `uber-core/src/main/java/com/uber/sdk/core/auth/Scope.java`
#### Snippet
```java


    private ScopeType mScopeType;

    /**
```

### NonFinalFieldInEnum
Non-final field `mBitValue` in enum 'Scope'
in `uber-core/src/main/java/com/uber/sdk/core/auth/Scope.java`
#### Snippet
```java
     * Use powers of two to allow bit masking operation.
     */
    private int mBitValue;

    Scope(ScopeType scopeType, int bitValue) {
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `samples/servlet-sample/src/main/java/com/uber/sdk/rides/samples/servlet/OAuth2CallbackServlet.java`
#### Snippet
```java
        if (oAuth2Credentials == null) {
            SessionConfiguration config = Server.createSessionConfiguration();
            oAuth2Credentials = Server.createOAuth2Credentials(config);
        }

        HttpSession httpSession = req.getSession(true);
        if (httpSession.getAttribute(Server.USER_SESSION_ID) == null) {
            httpSession.setAttribute(Server.USER_SESSION_ID, new Random().nextLong());
        }
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `uber-core/src/main/java/com/uber/sdk/core/auth/Scope.java`
#### Snippet
```java
                Scope scope = Scope.valueOf(scopeString.toUpperCase());
                scopes.add(scope);
            } catch (IllegalArgumentException ex) {
            }
        }
```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/Driver.java`
#### Snippet
```java
    @Nullable
    private Float rating;
    @Nullable
    private String picture_url;
    private String name;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/Driver.java`
#### Snippet
```java
    @Nullable
    private String sms_number;
    @Nullable
    private Float rating;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/Driver.java`
#### Snippet
```java

    private String phone_number;
    @Nullable
    private String sms_number;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/Ride.java`
#### Snippet
```java
    @Nullable
    private Location pickup;
    @Nullable
    private Location destination;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/Ride.java`
#### Snippet
```java
    @Nullable
    private Location location;
    @Nullable
    private Vehicle vehicle;
    private String product_id;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/Ride.java`
#### Snippet
```java
    @Nullable
    private Float surge_multiplier;
    @Nullable
    private Location location;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/Ride.java`
#### Snippet
```java
    private String request_id;
    private Status status;
    @Nullable
    private Driver driver;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/Ride.java`
#### Snippet
```java
    @Nullable
    private Driver driver;
    @Nullable
    private Float surge_multiplier;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/Ride.java`
#### Snippet
```java
    private String product_id;
    private boolean shared;
    @Nullable
    private Location pickup;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideEstimate.java`
#### Snippet
```java
        @Nullable
        private String surge_confirmation_href;
        @Nullable
        private String surge_confirmation_id;
        @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideEstimate.java`
#### Snippet
```java
        @Nullable
        private Float surge_multiplier;
        @Nullable
        private BigDecimal high_estimate;
        @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideEstimate.java`
#### Snippet
```java
     */
    public static class Estimate {
        @Nullable
        private Integer minimum;
        @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideEstimate.java`
#### Snippet
```java
    public static class Fare {
        private String display;
        @Nullable
        private String fare_id;
        @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideEstimate.java`
#### Snippet
```java
        @Nullable
        private String currency_code;
        @Nullable
        private Long expires_at;
        @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideEstimate.java`
#### Snippet
```java
        @Nullable
        private Long expires_at;
        @Nullable
        private BigDecimal value;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideEstimate.java`
#### Snippet
```java
    @Nullable
    private Trip trip;
    @Nullable
    private Integer pickup_estimate;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideEstimate.java`
#### Snippet
```java
        @Nullable
        private String currency_code;
        @Nullable
        private String fare_id;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideEstimate.java`
#### Snippet
```java
    @Nullable
    private Estimate estimate;
    @Nullable
    private Trip trip;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideEstimate.java`
#### Snippet
```java
        @Nullable
        private BigDecimal low_estimate;
        @Nullable
        private String display;
        @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideEstimate.java`
#### Snippet
```java
        @Nullable
        private String fare_id;
        @Nullable
        private String currency_code;
        @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideEstimate.java`
#### Snippet
```java
    @Nullable
    private Fare fare;
    @Nullable
    private Estimate estimate;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideEstimate.java`
#### Snippet
```java
public class RideEstimate {

    @Nullable
    private Fare fare;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideEstimate.java`
#### Snippet
```java
        @Nullable
        private String surge_confirmation_id;
        @Nullable
        private Float surge_multiplier;
        @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideEstimate.java`
#### Snippet
```java
        @Nullable
        private BigDecimal high_estimate;
        @Nullable
        private BigDecimal low_estimate;
        @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideEstimate.java`
#### Snippet
```java
        @Nullable
        private String display;
        @Nullable
        private String currency_code;
        @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideEstimate.java`
#### Snippet
```java
        @Nullable
        private Integer minimum;
        @Nullable
        private String surge_confirmation_href;
        @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/error/CompatibilityApiError.java`
#### Snippet
```java
    @Nonnull
    final String message;
    @Nonnull
    final String code;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/error/CompatibilityApiError.java`
#### Snippet
```java
final class CompatibilityApiError {

    @Nonnull
    final String message;
    @Nonnull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
        @Nullable
        private String paymentMethodId;
        @Nullable
        private Integer seatCount;
        @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
    @Nullable
    private String surge_confirmation_id;
    @Nullable
    private String payment_method_id;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
        @Nullable
        private String endPlaceId;
        @Nullable
        private String surgeConfirmationId;
        @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
    public static class Builder {

        @Nullable
        private String productId;
        @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
    @Nullable
    private String start_nickname;
    @Nullable
    private String start_address;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
    @Nullable
    private String end_place_id;
    @Nullable
    private String surge_confirmation_id;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
    @Nullable
    private String start_place_id;
    @Nullable
    private Float end_latitude;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
    @Nullable
    private Float start_longitude;
    @Nullable
    private String start_nickname;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
        @Nullable
        private String surgeConfirmationId;
        @Nullable
        private String paymentMethodId;
        @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
        @Nullable
        private Float startLatitude;
        @Nullable
        private Float startLongitude;
        @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
    @Nullable
    private String start_address;
    @Nullable
    private String start_place_id;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
        @Nullable
        private String startNickname;
        @Nullable
        private String startAddress;
        @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
        @Nullable
        private Float endLatitude;
        @Nullable
        private Float endLongitude;
        @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
    @Nullable
    private Float start_latitude;
    @Nullable
    private Float start_longitude;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
        @Nullable
        private Float endLongitude;
        @Nullable
        private String endNickname;
        @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
    @Nullable
    private String end_address;
    @Nullable
    private String end_place_id;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
        @Nullable
        private String endNickname;
        @Nullable
        private String endAddress;
        @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
        @Nullable
        private String productId;
        @Nullable
        private Float startLatitude;
        @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
        @Nullable
        private Integer seatCount;
        @Nullable
        private String fareId;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
    @Nullable
    private String product_id;
    @Nullable
    private Float start_latitude;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
        @Nullable
        private String endAddress;
        @Nullable
        private String endPlaceId;
        @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
        @Nullable
        private String startPlaceId;
        @Nullable
        private Float endLatitude;
        @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
    @Nullable
    private Float end_longitude;
    @Nullable
    private String end_nickname;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
    @Nullable
    private Float end_latitude;
    @Nullable
    private Float end_longitude;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
        @Nullable
        private String startAddress;
        @Nullable
        private String startPlaceId;
        @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
        @Nullable
        private Float startLongitude;
        @Nullable
        private String startNickname;
        @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
    @Nullable
    private Integer seat_count;
    @Nullable
    private String fare_id;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
public class RideRequestParameters {

    @Nullable
    private String product_id;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
    @Nullable
    private String end_nickname;
    @Nullable
    private String end_address;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideRequestParameters.java`
#### Snippet
```java
    @Nullable
    private String payment_method_id;
    @Nullable
    private Integer seat_count;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/Vehicle.java`
#### Snippet
```java
    @Nullable
    private String license_plate;
    @Nullable
    private String picture_url;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/Vehicle.java`
#### Snippet
```java
    private String make;
    private String model;
    @Nullable
    private String license_plate;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/PriceEstimate.java`
#### Snippet
```java

    private String product_id;
    @Nullable
    private String currency_code;
    private String display_name;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/PriceEstimate.java`
#### Snippet
```java
    private String display_name;
    private String estimate;
    @Nullable
    private BigDecimal low_estimate;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/PriceEstimate.java`
#### Snippet
```java
    @Nullable
    private BigDecimal high_estimate;
    @Nullable
    private Float surge_multiplier;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/PriceEstimate.java`
#### Snippet
```java
    @Nullable
    private BigDecimal low_estimate;
    @Nullable
    private BigDecimal high_estimate;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/PriceEstimate.java`
#### Snippet
```java
    @Nullable
    private Float surge_multiplier;
    @Nullable
    private Integer duration;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/PriceEstimate.java`
#### Snippet
```java
    @Nullable
    private Integer duration;
    @Nullable
    private Float distance;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/SandboxProductRequestParameters.java`
#### Snippet
```java
    public static class Builder {

        @Nullable private Float surgeMultiplier;
        @Nullable private Boolean driversAvailable;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/SandboxProductRequestParameters.java`
#### Snippet
```java

        @Nullable private Float surgeMultiplier;
        @Nullable private Boolean driversAvailable;

        /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/SandboxProductRequestParameters.java`
#### Snippet
```java

    @Nullable private Float surge_multiplier;
    @Nullable private Boolean drivers_available;

    /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/SandboxProductRequestParameters.java`
#### Snippet
```java
public class SandboxProductRequestParameters {

    @Nullable private Float surge_multiplier;
    @Nullable private Boolean drivers_available;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/UserActivity.java`
#### Snippet
```java
    public static class City {

        @Nullable
        private String display_name;
        private float latitude;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/UserActivity.java`
#### Snippet
```java
    @Nullable
    private City start_city;
    @Nullable
    private Float fare;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/UserActivity.java`
#### Snippet
```java
    private long start_time;
    private long end_time;
    @Nullable
    private String product_id;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/UserActivity.java`
#### Snippet
```java
    @Nullable
    private String product_id;
    @Nullable
    private City start_city;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/UserActivity.java`
#### Snippet
```java
    @Nullable
    private Float fare;
    @Nullable
    private String currency_code;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/error/ClientError.java`
#### Snippet
```java
    private final String code;
    private final int status;
    @Nullable
    private final String title;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/error/ClientError.java`
#### Snippet
```java
public final class ClientError {

    @Nullable
    private final String code;
    private final int status;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideUpdateParameters.java`
#### Snippet
```java
public class RideUpdateParameters {

    @Nullable private Float end_latitude;
    @Nullable private Float end_longitude;
    @Nullable private String end_nickname;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideUpdateParameters.java`
#### Snippet
```java

    @Nullable private Float end_latitude;
    @Nullable private Float end_longitude;
    @Nullable private String end_nickname;
    @Nullable private String end_address;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideUpdateParameters.java`
#### Snippet
```java
        @Nullable private String endNickname;
        @Nullable private String endAddress;
        @Nullable private String endPlaceId;

        /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideUpdateParameters.java`
#### Snippet
```java

        @Nullable private Float endLatitude;
        @Nullable private Float endLongitude;
        @Nullable private String endNickname;
        @Nullable private String endAddress;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideUpdateParameters.java`
#### Snippet
```java
    public static class Builder {

        @Nullable private Float endLatitude;
        @Nullable private Float endLongitude;
        @Nullable private String endNickname;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideUpdateParameters.java`
#### Snippet
```java
    @Nullable private String end_nickname;
    @Nullable private String end_address;
    @Nullable private String end_place_id;

    private RideUpdateParameters(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideUpdateParameters.java`
#### Snippet
```java
    @Nullable private Float end_latitude;
    @Nullable private Float end_longitude;
    @Nullable private String end_nickname;
    @Nullable private String end_address;
    @Nullable private String end_place_id;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideUpdateParameters.java`
#### Snippet
```java
        @Nullable private Float endLongitude;
        @Nullable private String endNickname;
        @Nullable private String endAddress;
        @Nullable private String endPlaceId;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideUpdateParameters.java`
#### Snippet
```java
    @Nullable private Float end_longitude;
    @Nullable private String end_nickname;
    @Nullable private String end_address;
    @Nullable private String end_place_id;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideUpdateParameters.java`
#### Snippet
```java
        @Nullable private Float endLatitude;
        @Nullable private Float endLongitude;
        @Nullable private String endNickname;
        @Nullable private String endAddress;
        @Nullable private String endPlaceId;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/PaymentMethod.java`
#### Snippet
```java
    private String payment_method_id;
    private String type;
    @Nullable
    private String description;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/error/SurgeConfirmation.java`
#### Snippet
```java
    @Nonnull
    public final String href;
    @Nonnull
    public final String surge_confirmation_id;
    public final float multiplier;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/error/SurgeConfirmation.java`
#### Snippet
```java
public final class SurgeConfirmation {

    @Nonnull
    public final String href;
    @Nonnull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/error/ApiError.java`
#### Snippet
```java
public final class ApiError {

    @Nullable
    private final Meta meta;
    @Nonnull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/error/ApiError.java`
#### Snippet
```java
    @Nullable
    private final Meta meta;
    @Nonnull
    private final List<ClientError> errors;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/TimeEstimate.java`
#### Snippet
```java
    private String product_id;
    private String display_name;
    @Nullable
    private Integer estimate;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideReceipt.java`
#### Snippet
```java
public class RideReceipt {
    private String request_id;
    @Nullable
    private List<Charge> charge_adjustments;
    private String subtotal;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideReceipt.java`
#### Snippet
```java
    @Nullable
    private Float total_owed;
    @Nullable
    private String currency_code;
    private String duration;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/RideReceipt.java`
#### Snippet
```java
    private String subtotal;
    private String total_charged;
    @Nullable
    private Float total_owed;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/error/Meta.java`
#### Snippet
```java
public class Meta {

    @Nullable
    private final SurgeConfirmation surge_confirmation;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/Location.java`
#### Snippet
```java
    private float latitude;
    private float longitude;
    @Nullable
    private Integer bearing;
    @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/Location.java`
#### Snippet
```java
    @Nullable
    private Integer bearing;
    @Nullable
    private Integer eta;

```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `uber-core/src/main/java/com/uber/sdk/core/client/SessionConfiguration.java`
#### Snippet
```java
        /**
         * The Uber API requires a registered clientSecret to be used for Authentication.
         * This can be registered and retrieved on the developer dashboard at https://developer.uber.com/
         *
         * Do not set client secret for Android or client side applications.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `uber-core/src/main/java/com/uber/sdk/core/client/SessionConfiguration.java`
#### Snippet
```java
        /**
         * The Uber API requires a registered clientId to be sent along with API requests and Deeplinks.
         * This can be registered and retrieved on the developer dashboard at https://developer.uber.com/
         *
         * @param clientId to be used for identification
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/Ride.java`
#### Snippet
```java
        @Json(name = "completed") COMPLETED("completed");

        private String value;

        Status(String value) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/PlaceParameters.java`
#### Snippet
```java
public class PlaceParameters {

    private String address;

    private PlaceParameters(@Nonnull String address) {
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `samples/cmdline-sample/src/main/java/com/uber/sdk/rides/samples/cmdline/GetUserProfile.java`
#### Snippet
```java
            System.out.println("Press Enter when done.");

            System.in.read();

            // Generate an authorization URL.
```

### IgnoreResultOfCall
Result of `File.setReadable()` is ignored
in `samples/cmdline-sample/src/main/java/com/uber/sdk/rides/samples/cmdline/GetUserProfile.java`
#### Snippet
```java
        File credentialDirectory =
                new File(System.getProperty("user.home") + File.separator + ".uber_credentials");
        credentialDirectory.setReadable(true, true);
        credentialDirectory.setWritable(true, true);
        // If you'd like to store them in memory or in a DB, any DataStoreFactory can be used.
```

### IgnoreResultOfCall
Result of `File.setWritable()` is ignored
in `samples/cmdline-sample/src/main/java/com/uber/sdk/rides/samples/cmdline/GetUserProfile.java`
#### Snippet
```java
                new File(System.getProperty("user.home") + File.separator + ".uber_credentials");
        credentialDirectory.setReadable(true, true);
        credentialDirectory.setWritable(true, true);
        // If you'd like to store them in memory or in a DB, any DataStoreFactory can be used.
        AbstractDataStoreFactory dataStoreFactory = new FileDataStoreFactory(credentialDirectory);
```

