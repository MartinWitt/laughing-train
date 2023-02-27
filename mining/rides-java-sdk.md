# rides-java-sdk 
 
# Bad smells
I found 137 bad smells with 4 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| NullableProblems | 99 | false |
| SystemOutErr | 9 | false |
| SetReplaceableByEnumSet | 5 | false |
| UtilityClassWithoutPrivateConstructor | 3 | true |
| UnnecessaryFullyQualifiedName | 3 | false |
| NonSerializableFieldInSerializableClass | 3 | false |
| ReturnNull | 3 | false |
| IgnoreResultOfCall | 3 | false |
| SamePackageImport | 2 | false |
| RedundantImplements | 2 | false |
| NestedAssignment | 1 | false |
| NonProtectedConstructorInAbstractClass | 1 | true |
| MismatchedCollectionQueryUpdate | 1 | false |
| AssignmentToMethodParameter | 1 | false |
| CatchMayIgnoreException | 1 | false |
## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/cmdline-sample/src/main/java/com/uber/sdk/rides/samples/cmdline/GetUserProfile.java`
#### Snippet
```java
        RidesService service = uberRidesApi.createService();
        // Fetch the user's profile.
        System.out.println("Calling API to get the user's profile");
        Response<UserProfile> response = service.getUserProfile().execute();

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/cmdline-sample/src/main/java/com/uber/sdk/rides/samples/cmdline/GetUserProfile.java`
#### Snippet
```java
            // Handle error.
            ClientError clientError = apiError.getClientErrors().get(0);
            System.out.printf("Unable to fetch profile. %s", clientError.getTitle());
            System.exit(0);
            return;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/cmdline-sample/src/main/java/com/uber/sdk/rides/samples/cmdline/GetUserProfile.java`
#### Snippet
```java
        // Success!
        UserProfile userProfile = response.body();
        System.out.printf("Logged in as %s%n", userProfile.getEmail());
        System.exit(0);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/cmdline-sample/src/main/java/com/uber/sdk/rides/samples/cmdline/GetUserProfile.java`
#### Snippet
```java
        if (credential == null || credential.getAccessToken() == null) {
            // Send user to authorize your application.
            System.out.printf("Add the following redirect URI to your developer.uber.com application: %s%n",
                    oAuth2Credentials.getRedirectUri());
            System.out.println("Press Enter when done.");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/cmdline-sample/src/main/java/com/uber/sdk/rides/samples/cmdline/GetUserProfile.java`
#### Snippet
```java
            System.out.printf("Add the following redirect URI to your developer.uber.com application: %s%n",
                    oAuth2Credentials.getRedirectUri());
            System.out.println("Press Enter when done.");

            System.in.read();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/cmdline-sample/src/main/java/com/uber/sdk/rides/samples/cmdline/GetUserProfile.java`
#### Snippet
```java
            // Generate an authorization URL.
            String authorizationUrl = oAuth2Credentials.getAuthorizationUrl();
            System.out.printf("In your browser, navigate to: %s%n", authorizationUrl);
            System.out.println("Waiting for authentication...");

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/cmdline-sample/src/main/java/com/uber/sdk/rides/samples/cmdline/GetUserProfile.java`
#### Snippet
```java
            String authorizationUrl = oAuth2Credentials.getAuthorizationUrl();
            System.out.printf("In your browser, navigate to: %s%n", authorizationUrl);
            System.out.println("Waiting for authentication...");

            // Wait for the authorization code.
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/cmdline-sample/src/main/java/com/uber/sdk/rides/samples/cmdline/GetUserProfile.java`
#### Snippet
```java
            // Wait for the authorization code.
            String authorizationCode = localServerReceiver.waitForCode();
            System.out.println("Authentication received.");

            // Authenticate the user with the authorization code.
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `samples/servlet-sample/src/main/java/com/uber/sdk/rides/samples/servlet/Server.java`
#### Snippet
```java

        server.start();
        System.out.println("Server is running on: http://localhost:" + PORT );
        server.join();
    }
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `ErrorParser` has only 'static' members, and lacks a 'private' constructor
in `uber-rides/src/main/java/com/uber/sdk/rides/client/error/ErrorParser.java`
#### Snippet
```java
 * Used to parse a {@link Response} to an {@link ApiError}.
 */
public final class ErrorParser {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `Preconditions` has only 'static' members, and lacks a 'private' constructor
in `uber-core/src/main/java/com/uber/sdk/core/client/utils/Preconditions.java`
#### Snippet
```java
 * correct arguments and state.
 */
public class Preconditions {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `Server` has only 'static' members, and lacks a 'private' constructor
in `samples/servlet-sample/src/main/java/com/uber/sdk/rides/samples/servlet/Server.java`
#### Snippet
```java
 * ID and secret.
 */
public class Server {

    public static final String USER_SESSION_ID = "userSessionId";
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `okhttp3.logging` is unnecessary and can be removed
in `uber-rides/src/main/java/com/uber/sdk/rides/client/UberRidesApi.java`
#### Snippet
```java

        /**
         * Sets the {@link okhttp3.logging.HttpLoggingInterceptor.Logger} to use.
         * Optional and defaults to {@link okhttp3.logging.HttpLoggingInterceptor.Logger#DEFAULT}
         */
```

### UnnecessaryFullyQualifiedName
Qualifier `okhttp3.logging` is unnecessary and can be removed
in `uber-rides/src/main/java/com/uber/sdk/rides/client/UberRidesApi.java`
#### Snippet
```java
        /**
         * Sets the {@link okhttp3.logging.HttpLoggingInterceptor.Logger} to use.
         * Optional and defaults to {@link okhttp3.logging.HttpLoggingInterceptor.Logger#DEFAULT}
         */
        @Nonnull
```

### UnnecessaryFullyQualifiedName
Qualifier `java.math` is unnecessary and can be removed
in `uber-core/src/main/java/com/uber/sdk/core/client/internal/BigDecimalAdapter.java`
#### Snippet
```java

/**
 * Adapter used to adapt floats to {@link java.math.BigDecimal}.
 */
public class BigDecimalAdapter {
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `uber-core/src/main/java/com/uber/sdk/core/auth/BaseRefreshableAuthenticator.java`
#### Snippet
```java
    protected boolean canRetry(Response response) {
        int responseCount = 1;
        while ((response = response.priorResponse()) != null) {
            responseCount++;
        }
```

## RuleId[ruleID=SamePackageImport]
### SamePackageImport
Unnecessary import from the same package `import com.uber.sdk.core.auth.AuthException;`
in `uber-core-oauth-client-adapter/src/main/java/com/uber/sdk/core/auth/OAuth2Credentials.java`
#### Snippet
```java
import com.google.api.client.util.store.DataStore;
import com.google.api.client.util.store.MemoryDataStoreFactory;
import com.uber.sdk.core.auth.AuthException;
import com.uber.sdk.core.auth.Scope;
import com.uber.sdk.core.client.SessionConfiguration;
```

### SamePackageImport
Unnecessary import from the same package `import com.uber.sdk.core.auth.Scope;`
in `uber-core-oauth-client-adapter/src/main/java/com/uber/sdk/core/auth/OAuth2Credentials.java`
#### Snippet
```java
import com.google.api.client.util.store.MemoryDataStoreFactory;
import com.uber.sdk.core.auth.AuthException;
import com.uber.sdk.core.auth.Scope;
import com.uber.sdk.core.client.SessionConfiguration;
import com.uber.sdk.core.client.utils.Preconditions;
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `Session()` of an abstract class should not be declared 'public'
in `uber-core/src/main/java/com/uber/sdk/core/client/Session.java`
#### Snippet
```java
     * @param authenticator used to sign outgoing requests
     */
    public Session(@Nonnull T authenticator) {
        this.authenticator = authenticator;
    }
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
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

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `response`
in `uber-core/src/main/java/com/uber/sdk/core/auth/BaseRefreshableAuthenticator.java`
#### Snippet
```java
    protected boolean canRetry(Response response) {
        int responseCount = 1;
        while ((response = response.priorResponse()) != null) {
            responseCount++;
        }
```

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'credential' in a Serializable class
in `samples/servlet-sample/src/main/java/com/uber/sdk/rides/samples/servlet/SampleServlet.java`
#### Snippet
```java

    private OAuth2Credentials oAuth2Credentials;
    private Credential credential;
    private RidesService uberRidesService;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'oAuth2Credentials' in a Serializable class
in `samples/servlet-sample/src/main/java/com/uber/sdk/rides/samples/servlet/SampleServlet.java`
#### Snippet
```java
public class SampleServlet extends HttpServlet {

    private OAuth2Credentials oAuth2Credentials;
    private Credential credential;
    private RidesService uberRidesService;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'oAuth2Credentials' in a Serializable class
in `samples/servlet-sample/src/main/java/com/uber/sdk/rides/samples/servlet/OAuth2CallbackServlet.java`
#### Snippet
```java
public class OAuth2CallbackServlet extends HttpServlet {

    private OAuth2Credentials oAuth2Credentials;

    @Override
```

## RuleId[ruleID=RedundantImplements]
### RedundantImplements
Redundant interface declaration `Authenticator`
in `uber-core-oauth-client-adapter/src/main/java/com/uber/sdk/core/auth/CredentialsAuthenticator.java`
#### Snippet
```java

public class CredentialsAuthenticator extends BaseRefreshableAuthenticator implements
        Authenticator {
    static final String HEADER_BEARER_ACCESS_VALUE = "Bearer %s";

```

### RedundantImplements
Redundant interface declaration `Authenticator`
in `uber-core/src/main/java/com/uber/sdk/core/auth/AccessTokenAuthenticator.java`
#### Snippet
```java

public class AccessTokenAuthenticator extends
        BaseRefreshableAuthenticator implements Authenticator {

    private static final String HEADER_BEARER_ACCESS_VALUE = "Bearer %s";
```

## RuleId[ruleID=CatchMayIgnoreException]
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

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `uber-core/src/main/java/com/uber/sdk/core/auth/BaseRefreshableAuthenticator.java`
#### Snippet
```java
            return doRefresh(response);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `uber-core/src/main/java/com/uber/sdk/core/client/internal/BigDecimalAdapter.java`
#### Snippet
```java
    @FromJson
    public BigDecimal bigDecimalFromString(@Nullable Float value) {
        return value != null ? new BigDecimal(value.toString()) : null;
    }
}
```

### ReturnNull
Return of `null`
in `uber-core/src/main/java/com/uber/sdk/core/auth/ServerTokenAuthenticator.java`
#### Snippet
```java
    @Override
    public Request refresh(Response response) {
        return null;
        //Do nothing, server token is not refreshable
    }
```

## RuleId[ruleID=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `uber-core/src/main/java/com/uber/sdk/core/auth/AccessToken.java`
#### Snippet
```java
            String tokenType) {
        expires_in = expiresIn;
        this.scope = new HashSet<>(scopes);
        access_token = token;
        refresh_token = refreshToken;
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `uber-core-oauth-client-adapter/src/main/java/com/uber/sdk/core/auth/OAuth2Credentials.java`
#### Snippet
```java
        public Builder setSessionConfiguration(SessionConfiguration configuration) {
            if (scopes != null) {
                this.scopes = new HashSet<>(configuration.getScopes());
            }

```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `uber-core-oauth-client-adapter/src/main/java/com/uber/sdk/core/auth/OAuth2Credentials.java`
#### Snippet
```java
         */
        public Builder setScopes(Collection<Scope> scopes) {
            this.scopes = new HashSet<>(scopes);
            return this;
        }
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `uber-core/src/main/java/com/uber/sdk/core/client/SessionConfiguration.java`
#### Snippet
```java

            if (scopes == null) {
                scopes = new HashSet<>();
            } else {
                scopes = new HashSet<>(scopes);
```

### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `uber-core/src/main/java/com/uber/sdk/core/client/SessionConfiguration.java`
#### Snippet
```java
                scopes = new HashSet<>();
            } else {
                scopes = new HashSet<>(scopes);
            }

```

## RuleId[ruleID=NullableProblems]
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
    private Float fare;
    @Nullable
    private String currency_code;

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
public class RideReceipt {
    private String request_id;
    @Nullable
    private List<Charge> charge_adjustments;
    private String subtotal;
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

        @Nullable private Float endLatitude;
        @Nullable private Float endLongitude;
        @Nullable private String endNickname;
        @Nullable private String endAddress;
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
in `uber-rides/src/main/java/com/uber/sdk/rides/client/error/ApiError.java`
#### Snippet
```java
public final class ApiError {

    @Nullable
    private final Meta meta;
    @Nonnull
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
        private Integer minimum;
        @Nullable
        private String surge_confirmation_href;
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
        @Nullable
        private String currency_code;
        @Nullable
        private Long expires_at;
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
in `uber-rides/src/main/java/com/uber/sdk/rides/client/model/PaymentMethod.java`
#### Snippet
```java
    private String payment_method_id;
    private String type;
    @Nullable
    private String description;

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
public class SandboxProductRequestParameters {

    @Nullable private Float surge_multiplier;
    @Nullable private Boolean drivers_available;

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
    private String product_id;
    private boolean shared;
    @Nullable
    private Location pickup;
    @Nullable
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
    @Nullable
    private Integer duration;
    @Nullable
    private Float distance;

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
    private Integer seat_count;
    @Nullable
    private String fare_id;

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
    private String payment_method_id;
    @Nullable
    private Integer seat_count;
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
    private Float start_latitude;
    @Nullable
    private Float start_longitude;
    @Nullable
```

## RuleId[ruleID=IgnoreResultOfCall]
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

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `samples/cmdline-sample/src/main/java/com/uber/sdk/rides/samples/cmdline/GetUserProfile.java`
#### Snippet
```java
            System.out.println("Press Enter when done.");

            System.in.read();

            // Generate an authorization URL.
```

