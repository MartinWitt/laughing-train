# teamcity-hashicorp-vault-plugin 
 
# Bad smells
I found 60 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnusedSymbol | 17 | false |
| Convert2Lambda | 5 | false |
| ConvertToStringTemplate | 4 | false |
| ConstantValue | 4 | false |
| UtilityClassWithoutPrivateConstructor | 3 | true |
| NotNullFieldNotInitialized | 3 | false |
| LeakingThis | 3 | false |
| RedundantNullableReturnType | 2 | false |
| DataFlowIssue | 2 | false |
| JavaMapForEach | 2 | false |
| KotlinUnusedImport | 2 | false |
| PrivatePropertyName | 2 | false |
| CharsetObjectCanBeUsed | 1 | false |
| StaticCallOnSubclass | 1 | false |
| UNUSED_IMPORT | 1 | false |
| RemoveExplicitTypeArguments | 1 | false |
| MemberVisibilityCanBePrivate | 1 | false |
| ReplaceRangeToWithUntil | 1 | false |
| MoveLambdaOutsideParentheses | 1 | false |
| AbstractClassNeverImplemented | 1 | false |
| MissortedModifiers | 1 | false |
| RedundantSuppression | 1 | false |
| LiftReturnOrAssignment | 1 | false |
## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `common/src/main/java/org/jetbrains/teamcity/vault/support/AbstractJackson2HttpMessageConverter.java`
#### Snippet
```java
public abstract class AbstractJackson2HttpMessageConverter extends AbstractGenericHttpMessageConverter<Object> {

	public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");

	// Check for Jackson 2.3's overloaded canDeserialize/canSerialize variants with cause reference
```

## RuleId[id=RedundantNullableReturnType]
### RedundantNullableReturnType
'getPropertiesProcessor' always returns non-null type
in `server/src/main/kotlin/org/jetbrains/teamcity/vault/server/VaultProjectConnectionProvider.kt`
#### Snippet
```java
    }

    override fun getPropertiesProcessor(): PropertiesProcessor? {
        return getParametersProcessor()
    }
```

### RedundantNullableReturnType
'getEditParametersUrl' always returns non-null type
in `server/src/main/kotlin/org/jetbrains/teamcity/vault/server/VaultProjectConnectionProvider.kt`
#### Snippet
```java
    }

    override fun getEditParametersUrl(): String? {
        return descriptor.getPluginResourcesPath("editProjectConnectionVault.jsp")
    }
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `HttpComponents` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/jetbrains/teamcity/vault/support/ClientHttpRequestFactoryFactory.java`
#### Snippet
```java
     * @author Mark Paluch
     */
    static class HttpComponents {

        static ClientHttpRequestFactory usingHttpComponents(@NotNull ClientOptions options,
```

### UtilityClassWithoutPrivateConstructor
Class `ClientHttpRequestFactoryFactory` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/jetbrains/teamcity/vault/support/ClientHttpRequestFactoryFactory.java`
#### Snippet
```java
 * @author Vladislav Rassokhin
 */
public class ClientHttpRequestFactoryFactory {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `VaultInterceptors` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/org/jetbrains/teamcity/vault/support/VaultInterceptors.java`
#### Snippet
```java
import java.io.IOException;

public class VaultInterceptors {
    public static final String VAULT_NAMESPACE_HEADER = "X-Vault-Namespace";

```

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `isEmpty()` declared in class 'com.intellij.openapi.util.text.StringUtil' but referenced via subclass 'jetbrains.buildServer.util.StringUtil'
in `common/src/main/java/org/jetbrains/teamcity/vault/support/VaultInterceptors.java`
#### Snippet
```java
    @Nullable
    public static ClientHttpRequestInterceptor createNamespaceInterceptor(@Nullable final String namespace) {
        if (StringUtil.isEmpty(namespace)) {
            return null;
        }
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `vaultResponse.getAuth()` might be null
in `common/src/main/java/org/jetbrains/teamcity/vault/support/LifecycleAwareSessionManager.java`
#### Snippet
```java
                    new HttpEntity<Object>(VaultHttpHeaders.from(token)),
                    VaultResponse.class);
            LoginToken renewed = from(vaultResponse.getAuth());
            LOG.info(String.format("Received token: LoginToken(renewable=%b, lease_duration=%d):", renewed.isRenewable(), renewed.getLeaseDuration().getSeconds()));

```

### DataFlowIssue
Method invocation `getAuth` may produce `NullPointerException`
in `common/src/main/java/org/jetbrains/teamcity/vault/support/LifecycleAwareSessionManager.java`
#### Snippet
```java
                    new HttpEntity<Object>(VaultHttpHeaders.from(token)),
                    VaultResponse.class);
            LoginToken renewed = from(vaultResponse.getAuth());
            LOG.info(String.format("Received token: LoginToken(renewable=%b, lease_duration=%d):", renewed.isRenewable(), renewed.getLeaseDuration().getSeconds()));

```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import com.fasterxml.jackson.databind.Module;`
in `common/src/main/java/org/jetbrains/teamcity/vault/support/Jackson2ObjectMapperBuilder.java`
#### Snippet
```java
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.Module;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.FatalBeanException;
```

## RuleId[id=RemoveExplicitTypeArguments]
### RemoveExplicitTypeArguments
Remove explicit type arguments
in `common/src/main/kotlin/org/jetbrains/teamcity/vault/VaultConstants.kt`
#### Snippet
```java
    // Special values
    val SPECIAL_FAILED_TO_FETCH = "FAILED_TO_FETCH"
    val SPECIAL_VALUES = setOf<String>(SPECIAL_FAILED_TO_FETCH)
}

```

## RuleId[id=JavaMapForEach]
### JavaMapForEach
Java Map.forEach method call should be replaced with Kotlin's forEach
in `server/src/main/kotlin/org/jetbrains/teamcity/vault/server/VaultBuildStartContextProcessor.kt`
#### Snippet
```java

            if (reportProblems) {
                projectToFeaturePairs.groupBy({ it.first }, { it.second }).forEach { pid, features ->
                    features.groupBy { it.namespace }
                            .filterValues { it.size > 1 }
```

### JavaMapForEach
Java Map.forEach method call should be replaced with Kotlin's forEach
in `server/src/main/kotlin/org/jetbrains/teamcity/vault/server/VaultBuildStartContextProcessor.kt`
#### Snippet
```java
                    features.groupBy { it.namespace }
                            .filterValues { it.size > 1 }
                            .forEach { namespace, clashing ->
                                val nsDescripption = if (isDefault(namespace)) "default namespace" else "'$namespace' namespace"
                                val message = "Multiple HashiCorp Vault connections with $nsDescripption present in project '$pid'"
```

## RuleId[id=MemberVisibilityCanBePrivate]
### MemberVisibilityCanBePrivate
Property 'LOG' could be private
in `server/src/main/kotlin/org/jetbrains/teamcity/vault/server/VaultConnector.kt`
#### Snippet
```java

    companion object {
        val LOG = Logger.getInstance(Loggers.SERVER_CATEGORY + "." + VaultConnector::class.java.name)!!

        /**
```

## RuleId[id=ReplaceRangeToWithUntil]
### ReplaceRangeToWithUntil
'rangeTo' or the '..' call should be replaced with 'until'
in `common/src/main/kotlin/org/jetbrains/teamcity/vault/VaultReferencesUtil.kt`
#### Snippet
```java
        val colon = value.indexOf(':')
        val slash = value.indexOf('/')
        if (colon < 0 || (slash in 0..(colon - 1))) return ""
        return value.substring(0, colon)
    }
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new ClientHttpRequestInterceptor() can be replaced with lambda
in `common/src/main/java/org/jetbrains/teamcity/vault/support/VaultInterceptors.java`
#### Snippet
```java
        }

        return new ClientHttpRequestInterceptor() {
            @Override
            public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
```

### Convert2Lambda
Anonymous new ClientHttpRequestInterceptor() can be replaced with lambda
in `common/src/main/java/org/jetbrains/teamcity/vault/support/VaultTemplate.java`
#### Snippet
```java

    public void wrapResponses(@NotNull final String wrapTTL) {
        final ClientHttpRequestInterceptor interceptor = new ClientHttpRequestInterceptor() {
            @Override
            public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
```

### Convert2Lambda
Anonymous new RestOperationsCallback() can be replaced with lambda
in `common/src/main/java/org/jetbrains/teamcity/vault/support/VaultTemplate.java`
#### Snippet
```java
    private <T> T doRead(final String path, final Class<T> responseType) {

        return doWithSession(new RestOperationsCallback<T>() {

            @Override
```

### Convert2Lambda
Anonymous new ClientHttpRequestInterceptor() can be replaced with lambda
in `common/src/main/java/org/jetbrains/teamcity/vault/support/VaultTemplate.java`
#### Snippet
```java
        RestTemplate restTemplate = UtilKt.createRestTemplate(endpoint, requestFactory);

        restTemplate.getInterceptors().add(new ClientHttpRequestInterceptor() {

            @Override
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `common/src/main/java/org/jetbrains/teamcity/vault/support/LifecycleAwareSessionManager.java`
#### Snippet
```java
        VaultToken token = this.token;
        if (token instanceof LoginToken) {
            final Runnable task = new Runnable() {
                @Override
                public void run() {
```

## RuleId[id=KotlinUnusedImport]
### KotlinUnusedImport
Unused import directive
in `common/src/testFixtures/kotlin/org/jetbrains/teamcity/vault/VaultDevEnvironment.kt`
#### Snippet
```java
package org.jetbrains.teamcity.vault

import org.jetbrains.teamcity.vault.support.VaultTemplate
import org.springframework.http.client.ClientHttpRequestFactory
import org.springframework.vault.authentication.SimpleSessionManager
```

### KotlinUnusedImport
Unused import directive
in `common/src/testFixtures/kotlin/org/jetbrains/teamcity/vault/VaultDevEnvironment.kt`
#### Snippet
```java

import org.jetbrains.teamcity.vault.support.VaultTemplate
import org.springframework.http.client.ClientHttpRequestFactory
import org.springframework.vault.authentication.SimpleSessionManager
import org.springframework.vault.client.VaultEndpoint
```

## RuleId[id=PrivatePropertyName]
### PrivatePropertyName
Private property name `jetty_port` should not contain underscores in the middle or the end
in `common/src/testFixtures/kotlin/org/jetbrains/teamcity/vault/VaultSemiClusterDevContainer.kt`
#### Snippet
```java
    private var _used: Boolean = false

    private val jetty_port: Int by lazy {
        SocketUtils.findAvailableTcpPort(8222)
    }
```

### PrivatePropertyName
Private property name `jetty_server` should not contain underscores in the middle or the end
in `common/src/testFixtures/kotlin/org/jetbrains/teamcity/vault/VaultSemiClusterDevContainer.kt`
#### Snippet
```java
    }

    private var jetty_server: Server? = null

    override fun starting(description: Description?) {
```

## RuleId[id=NotNullFieldNotInitialized]
### NotNullFieldNotInitialized
@NonNullFields fields must be initialized
in `common/src/main/java/org/springframework/vault/authentication/LdapAuthenticationOptions.java`
#### Snippet
```java
        private CharSequence password;

        private String path;

        LdapAuthenticationOptionsBuilder() {
```

### NotNullFieldNotInitialized
@NonNullFields fields must be initialized
in `common/src/main/java/org/springframework/vault/authentication/LdapAuthenticationOptions.java`
#### Snippet
```java
    public static class LdapAuthenticationOptionsBuilder {

        private String username;

        private CharSequence password;
```

### NotNullFieldNotInitialized
@NonNullFields fields must be initialized
in `common/src/main/java/org/springframework/vault/authentication/LdapAuthenticationOptions.java`
#### Snippet
```java
        private String username;

        private CharSequence password;

        private String path;
```

## RuleId[id=ConvertToStringTemplate]
### ConvertToStringTemplate
'String' concatenation can be converted to a template
in `agent/src/main/kotlin/org/jetbrains/teamcity/vault/agent/VaultParameter.kt`
#### Snippet
```java
    }

    val full: String get() = (if (jsonPath == null) vaultPath else vaultPath + "!/" + jsonPath).ensureHasPrefix("/")
}
```

### ConvertToStringTemplate
'String' concatenation can be converted to a template
in `server/src/main/kotlin/org/jetbrains/teamcity/vault/server/VaultBuildStartContextProcessor.kt`
#### Snippet
```java
                    val message = "Failed to fetch HashiCorp Vault$ns wrapped token: ${e.message}"
                    LOG.warn(message, e)
                    val msg = message + ": " + e.toString() + ", see teamcity-server.log for details"
                    build.addBuildProblem(BuildProblemData.createBuildProblem("VC_${build.buildTypeId}_${settings.namespace}", "VaultConnection", msg))
                    if (settings.failOnError) {
```

### ConvertToStringTemplate
'String' concatenation can be converted to a template
in `common/src/main/kotlin/org/jetbrains/teamcity/vault/util.kt`
#### Snippet
```java

                if (!uriTemplate.startsWith("/") && !getBaseUrl().endsWith("/")) {
                    return "/" + uriTemplate
                }

```

### ConvertToStringTemplate
'String' concatenation can be converted to a template
in `common/src/main/kotlin/org/jetbrains/teamcity/vault/util.kt`
#### Snippet
```java

            if (!uriTemplate.startsWith("/")) {
                return "/" + uriTemplate
            }
            return uriTemplate
```

## RuleId[id=MoveLambdaOutsideParentheses]
### MoveLambdaOutsideParentheses
Lambda argument should be moved out of parentheses
in `agent/src/main/kotlin/org/jetbrains/teamcity/vault/agent/VaultParametersResolver.kt`
#### Snippet
```java
        val endpoint = VaultEndpoint.from(URI.create(settings.url))
        val factory = createClientHttpRequestFactory(trustStoreProvider)
        val client = VaultTemplate(endpoint, settings.vaultNamespace, factory, SimpleSessionManager({ VaultToken.of(token) }))

        return doFetchAndPrepareReplacements(client, parameters, logger)
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `VaultResponses` has no concrete subclass
in `common/src/main/java/org/jetbrains/teamcity/vault/support/VaultResponses.java`
#### Snippet
```java
 * @author Mark Paluch
 */
public abstract class VaultResponses {

	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `common/src/main/java/org/jetbrains/teamcity/vault/support/LifecycleAwareSessionManager.java`
#### Snippet
```java
@SuppressWarnings("LocalVariableHidesMemberVariable")
public class LifecycleAwareSessionManager implements SessionManager, DisposableBean {
    protected final static Logger LOG = Logger.getInstance(Loggers.AGENT_CATEGORY + "." + "VaultLifecycleAwareSessionManager");
    protected final BuildProgressLogger logger;

```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `sessionToken != null` is always `true`
in `common/src/main/java/org/jetbrains/teamcity/vault/support/VaultTemplate.java`
#### Snippet
```java

                final VaultToken sessionToken = sessionManager.getSessionToken();
                if (sessionToken != null) {
                    final String token = sessionToken.getToken();
                    if (token != null) {
```

### ConstantValue
Condition `token != null` is always `true`
in `common/src/main/java/org/jetbrains/teamcity/vault/support/VaultTemplate.java`
#### Snippet
```java
                if (sessionToken != null) {
                    final String token = sessionToken.getToken();
                    if (token != null) {
                        request.getHeaders().set(VaultHttpHeaders.VAULT_TOKEN, token);
                    }
```

### ConstantValue
Condition `token != null` is always `true`
in `common/src/main/java/org/jetbrains/teamcity/vault/support/LifecycleAwareSessionManager.java`
#### Snippet
```java
        if (token instanceof LoginToken) {
            LOG.info(String.format("Logged in with token: LoginToken(renewable=%b, lease_duration=%d):", ((LoginToken) token).isRenewable(), ((LoginToken) token).getLeaseDuration().getSeconds()));
        } else if (token != null) {
            LOG.info("Logged in with token: regular VaultToken");
        } else {
```

### ConstantValue
Condition `object != null` is always `true`
in `common/src/main/java/org/jetbrains/teamcity/vault/support/AbstractJackson2HttpMessageConverter.java`
#### Snippet
```java

			JavaType javaType = null;
			if (jackson26Available && type != null && object != null && TypeUtils.isAssignable(type, object.getClass())) {
				javaType = getJavaType(type, null);
			}
```

## RuleId[id=LeakingThis]
### LeakingThis
Calling non-final function withExposedPorts in constructor
in `common/src/testFixtures/kotlin/org/jetbrains/teamcity/vault/VaultDevContainer.kt`
#### Snippet
```java
    : GenericContainer<VaultDevContainer>("hashicorp/vault-enterprise:${version}_ent"), VaultDevEnvironment {
    init {
        withExposedPorts(8200)
        withEnv("VAULT_DEV_ROOT_TOKEN_ID", token)
    }
```

### LeakingThis
Calling non-final function withEnv in constructor
in `common/src/testFixtures/kotlin/org/jetbrains/teamcity/vault/VaultDevContainer.kt`
#### Snippet
```java
    init {
        withExposedPorts(8200)
        withEnv("VAULT_DEV_ROOT_TOKEN_ID", token)
    }

```

### LeakingThis
Accessing non-final property token in constructor
in `common/src/testFixtures/kotlin/org/jetbrains/teamcity/vault/VaultDevContainer.kt`
#### Snippet
```java
    init {
        withExposedPorts(8200)
        withEnv("VAULT_DEV_ROOT_TOKEN_ID", token)
    }

```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `common/src/main/java/org/jetbrains/teamcity/vault/support/Jackson2ObjectMapperBuilder.java`
#### Snippet
```java
	 */
	@SuppressWarnings("deprecation")
	public void configure(ObjectMapper objectMapper) {
		Assert.notNull(objectMapper, "ObjectMapper must not be null");

```

## RuleId[id=LiftReturnOrAssignment]
### LiftReturnOrAssignment
'Assignment' can be lifted out of 'if'
in `server/src/main/kotlin/org/jetbrains/teamcity/vault/server/VaultConnector.kt`
#### Snippet
```java
            }
            var message: String? = "Cannot revoke HashiCorp Vault token: "
            if (e is HttpStatusCodeException) {
                message += VaultResponses.getError((e as HttpStatusCodeException?)!!)
            } else {
```

## RuleId[id=UnusedSymbol]
### UnusedSymbol
Property "VAULT_NAMESPACE" is never used
in `server/src/main/kotlin/org/jetbrains/teamcity/vault/server/VaultJspKeys.kt`
#### Snippet
```java
    val NAMESPACE = VaultConstants.FeatureSettings.NAMESPACE
    val URL = VaultConstants.FeatureSettings.URL
    val VAULT_NAMESPACE = VaultConstants.FeatureSettings.VAULT_NAMESPACE

    val ENDPOINT = VaultConstants.FeatureSettings.ENDPOINT
```

### UnusedSymbol
Property "ROLE_ID" is never used
in `server/src/main/kotlin/org/jetbrains/teamcity/vault/server/VaultJspKeys.kt`
#### Snippet
```java
    val ENDPOINT = VaultConstants.FeatureSettings.ENDPOINT

    val ROLE_ID = VaultConstants.FeatureSettings.ROLE_ID
    val SECRET_ID = VaultConstants.FeatureSettings.SECRET_ID

```

### UnusedSymbol
Property "ENDPOINT" is never used
in `server/src/main/kotlin/org/jetbrains/teamcity/vault/server/VaultJspKeys.kt`
#### Snippet
```java
    val VAULT_NAMESPACE = VaultConstants.FeatureSettings.VAULT_NAMESPACE

    val ENDPOINT = VaultConstants.FeatureSettings.ENDPOINT

    val ROLE_ID = VaultConstants.FeatureSettings.ROLE_ID
```

### UnusedSymbol
Property "AUTH_METHOD" is never used
in `server/src/main/kotlin/org/jetbrains/teamcity/vault/server/VaultJspKeys.kt`
#### Snippet
```java
    val PATH = VaultConstants.FeatureSettings.PATH

    val AUTH_METHOD = VaultConstants.FeatureSettings.AUTH_METHOD
    val AUTH_METHOD_IAM = VaultConstants.FeatureSettings.AUTH_METHOD_IAM
    val AUTH_METHOD_APPROLE = VaultConstants.FeatureSettings.AUTH_METHOD_APPROLE
```

### UnusedSymbol
Property "NAMESPACE" is never used
in `server/src/main/kotlin/org/jetbrains/teamcity/vault/server/VaultJspKeys.kt`
#### Snippet
```java
@Suppress("PropertyName")
class VaultJspKeys {
    val NAMESPACE = VaultConstants.FeatureSettings.NAMESPACE
    val URL = VaultConstants.FeatureSettings.URL
    val VAULT_NAMESPACE = VaultConstants.FeatureSettings.VAULT_NAMESPACE
```

### UnusedSymbol
Property "PASSWORD" is never used
in `server/src/main/kotlin/org/jetbrains/teamcity/vault/server/VaultJspKeys.kt`
#### Snippet
```java

    val USERNAME = VaultConstants.FeatureSettings.USERNAME
    val PASSWORD = VaultConstants.FeatureSettings.PASSWORD
    val PATH = VaultConstants.FeatureSettings.PATH

```

### UnusedSymbol
Property "PATH" is never used
in `server/src/main/kotlin/org/jetbrains/teamcity/vault/server/VaultJspKeys.kt`
#### Snippet
```java
    val USERNAME = VaultConstants.FeatureSettings.USERNAME
    val PASSWORD = VaultConstants.FeatureSettings.PASSWORD
    val PATH = VaultConstants.FeatureSettings.PATH

    val AUTH_METHOD = VaultConstants.FeatureSettings.AUTH_METHOD
```

### UnusedSymbol
Property "SECRET_ID" is never used
in `server/src/main/kotlin/org/jetbrains/teamcity/vault/server/VaultJspKeys.kt`
#### Snippet
```java

    val ROLE_ID = VaultConstants.FeatureSettings.ROLE_ID
    val SECRET_ID = VaultConstants.FeatureSettings.SECRET_ID

    val USERNAME = VaultConstants.FeatureSettings.USERNAME
```

### UnusedSymbol
Property "AUTH_METHOD_APPROLE" is never used
in `server/src/main/kotlin/org/jetbrains/teamcity/vault/server/VaultJspKeys.kt`
#### Snippet
```java
    val AUTH_METHOD = VaultConstants.FeatureSettings.AUTH_METHOD
    val AUTH_METHOD_IAM = VaultConstants.FeatureSettings.AUTH_METHOD_IAM
    val AUTH_METHOD_APPROLE = VaultConstants.FeatureSettings.AUTH_METHOD_APPROLE
    val AUTH_METHOD_LDAP = VaultConstants.FeatureSettings.AUTH_METHOD_LDAP

```

### UnusedSymbol
Property "AUTH_METHOD_LDAP" is never used
in `server/src/main/kotlin/org/jetbrains/teamcity/vault/server/VaultJspKeys.kt`
#### Snippet
```java
    val AUTH_METHOD_IAM = VaultConstants.FeatureSettings.AUTH_METHOD_IAM
    val AUTH_METHOD_APPROLE = VaultConstants.FeatureSettings.AUTH_METHOD_APPROLE
    val AUTH_METHOD_LDAP = VaultConstants.FeatureSettings.AUTH_METHOD_LDAP

    val FAIL_ON_ERROR = VaultConstants.FeatureSettings.FAIL_ON_ERROR
```

### UnusedSymbol
Class "VaultJspKeys" is never used
in `server/src/main/kotlin/org/jetbrains/teamcity/vault/server/VaultJspKeys.kt`
#### Snippet
```java

@Suppress("PropertyName")
class VaultJspKeys {
    val NAMESPACE = VaultConstants.FeatureSettings.NAMESPACE
    val URL = VaultConstants.FeatureSettings.URL
```

### UnusedSymbol
Property "AUTH_METHOD_IAM" is never used
in `server/src/main/kotlin/org/jetbrains/teamcity/vault/server/VaultJspKeys.kt`
#### Snippet
```java

    val AUTH_METHOD = VaultConstants.FeatureSettings.AUTH_METHOD
    val AUTH_METHOD_IAM = VaultConstants.FeatureSettings.AUTH_METHOD_IAM
    val AUTH_METHOD_APPROLE = VaultConstants.FeatureSettings.AUTH_METHOD_APPROLE
    val AUTH_METHOD_LDAP = VaultConstants.FeatureSettings.AUTH_METHOD_LDAP
```

### UnusedSymbol
Property "FAIL_ON_ERROR" is never used
in `server/src/main/kotlin/org/jetbrains/teamcity/vault/server/VaultJspKeys.kt`
#### Snippet
```java
    val AUTH_METHOD_LDAP = VaultConstants.FeatureSettings.AUTH_METHOD_LDAP

    val FAIL_ON_ERROR = VaultConstants.FeatureSettings.FAIL_ON_ERROR

    val AGENT_REQUIREMENT = VaultConstants.FeatureSettings.AGENT_SUPPORT_REQUIREMENT
```

### UnusedSymbol
Property "URL" is never used
in `server/src/main/kotlin/org/jetbrains/teamcity/vault/server/VaultJspKeys.kt`
#### Snippet
```java
class VaultJspKeys {
    val NAMESPACE = VaultConstants.FeatureSettings.NAMESPACE
    val URL = VaultConstants.FeatureSettings.URL
    val VAULT_NAMESPACE = VaultConstants.FeatureSettings.VAULT_NAMESPACE

```

### UnusedSymbol
Property "USERNAME" is never used
in `server/src/main/kotlin/org/jetbrains/teamcity/vault/server/VaultJspKeys.kt`
#### Snippet
```java
    val SECRET_ID = VaultConstants.FeatureSettings.SECRET_ID

    val USERNAME = VaultConstants.FeatureSettings.USERNAME
    val PASSWORD = VaultConstants.FeatureSettings.PASSWORD
    val PATH = VaultConstants.FeatureSettings.PATH
```

### UnusedSymbol
Property "AGENT_REQUIREMENT" is never used
in `server/src/main/kotlin/org/jetbrains/teamcity/vault/server/VaultJspKeys.kt`
#### Snippet
```java
    val FAIL_ON_ERROR = VaultConstants.FeatureSettings.FAIL_ON_ERROR

    val AGENT_REQUIREMENT = VaultConstants.FeatureSettings.AGENT_SUPPORT_REQUIREMENT
}

```

### UnusedSymbol
Function "sizeAndPluralize" is never used
in `common/src/main/kotlin/org/jetbrains/teamcity/vault/util.kt`
#### Snippet
```java
fun String.pluralize(size: Int) = StringUtil.pluralize(this, size)
fun String.pluralize(collection: Collection<Any>) = this.pluralize(collection.size)
fun String.sizeAndPluralize(collection: Collection<Any>) = "${collection.size} " + this.pluralize(collection)

fun <T> BuildProgressLogger.activity(activityName: String, activityType: String, body: () -> T): T {
```

