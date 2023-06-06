# teamcity-hashicorp-vault-plugin 
 
# Bad smells
I found 58 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| Deprecation | 10 | false |
| ConvertToStringTemplate | 4 | false |
| ConstantValue | 4 | false |
| KotlinDeprecation | 3 | false |
| NotNullFieldNotInitialized | 3 | false |
| LeakingThis | 3 | false |
| DataFlowIssue | 2 | false |
| JavaMapForEach | 2 | false |
| UastIncorrectHttpHeaderInspection | 2 | false |
| RedundantNullableReturnType | 2 | false |
| FieldMayBeFinal | 2 | false |
| KotlinUnusedImport | 2 | false |
| PrivatePropertyName | 2 | false |
| SpringXmlAutowireExplicitlyInspection | 2 | false |
| SerializableHasSerialVersionUIDField | 2 | false |
| UnusedSymbol | 2 | false |
| RedundantConstructorKeyword | 1 | false |
| JavadocReference | 1 | false |
| RemoveExplicitTypeArguments | 1 | false |
| ReplaceRangeToWithUntil | 1 | false |
| MoveLambdaOutsideParentheses | 1 | false |
| LiftReturnOrAssignment | 1 | false |
| CharsetObjectCanBeUsed | 1 | false |
| UNUSED_IMPORT | 1 | false |
| InstanceofChain | 1 | false |
| MemberVisibilityCanBePrivate | 1 | false |
| RedundantIf | 1 | false |
## RuleId[id=RedundantConstructorKeyword]
### RedundantConstructorKeyword
Redundant 'constructor' keyword
in `agent/src/main/kotlin/org/jetbrains/teamcity/vault/agent/VaultParameter.kt`
#### Snippet
```java
import org.jetbrains.teamcity.vault.ensureHasPrefix

data class VaultParameter constructor(val vaultPath: String, val jsonPath: String? = null) {
    companion object {
        @JvmStatic fun extract(path: String): VaultParameter {
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `Jackson2ObjectMapperFactoryBean`
in `common/src/main/java/org/jetbrains/teamcity/vault/support/Jackson2ObjectMapperBuilder.java`
#### Snippet
```java
 * @see #build()
 * @see #configure(ObjectMapper)
 * @see Jackson2ObjectMapperFactoryBean
 */
public class Jackson2ObjectMapperBuilder {
```

## RuleId[id=KotlinDeprecation]
### KotlinDeprecation
Unnecessary non-null assertion (!!) on a non-null receiver of type VaultEndpoint!
in `server/src/main/kotlin/org/jetbrains/teamcity/vault/server/VaultConnector.kt`
#### Snippet
```java

        @JvmStatic fun doRequestWrappedToken(settings: VaultFeatureSettings, trustStoreProvider: SSLTrustStoreProvider): Pair<String, String> {
            val endpoint = VaultEndpoint.from(URI.create(settings.url))!!
            val factory = createClientHttpRequestFactory(trustStoreProvider)

```

### KotlinDeprecation
Unnecessary non-null assertion (!!) on a non-null receiver of type VaultEndpoint!
in `server/src/main/kotlin/org/jetbrains/teamcity/vault/server/VaultConnector.kt`
#### Snippet
```java
        @JvmStatic
        fun doRequestToken(settings: VaultFeatureSettings, trustStoreProvider: SSLTrustStoreProvider): Pair<String, String> {
            val endpoint = VaultEndpoint.from(URI.create(settings.url))!!
            val factory = createClientHttpRequestFactory(trustStoreProvider)

```

### KotlinDeprecation
Unnecessary non-null assertion (!!) on a non-null receiver of type VaultEndpoint!
in `common/src/main/kotlin/org/jetbrains/teamcity/vault/util.kt`
#### Snippet
```java

fun createRestTemplate(settings: VaultFeatureSettings, trustStoreProvider: SSLTrustStoreProvider): RestTemplate {
    val endpoint = VaultEndpoint.from(URI.create(settings.url))!!
    val factory = createClientHttpRequestFactory(trustStoreProvider)
    // HttpComponents.usingHttpComponents(options, sslConfiguration)
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

## RuleId[id=UastIncorrectHttpHeaderInspection]
### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `common/src/main/java/org/jetbrains/teamcity/vault/support/VaultInterceptors.java`
#### Snippet
```java

public class VaultInterceptors {
    public static final String VAULT_NAMESPACE_HEADER = "X-Vault-Namespace";

    @Nullable
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `common/src/main/java/org/jetbrains/teamcity/vault/support/VaultTemplate.java`
#### Snippet
```java
            @Override
            public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
                request.getHeaders().set("X-Vault-Wrap-TTL", wrapTTL);
                return execution.execute(request, body);
            }
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
        private String username;

        private CharSequence password;

        private String path;
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

## RuleId[id=Deprecation]
### Deprecation
'constructType(java.lang.reflect.Type, java.lang.Class)' is deprecated
in `common/src/main/java/org/jetbrains/teamcity/vault/support/AbstractJackson2HttpMessageConverter.java`
#### Snippet
```java
		// Conditional call because Jackson 2.7 does not support null contextClass anymore
		// TypeVariable resolution will not work with Jackson 2.7, see SPR-13853 for more details
		return (contextClass != null ? tf.constructType(type, contextClass) : tf.constructType(type));
	}

```

### Deprecation
'org.springframework.vault.config.ClientHttpRequestFactoryFactory' is deprecated
in `common/src/main/java/org/jetbrains/teamcity/vault/support/ClientHttpRequestFactoryFactory.java`
#### Snippet
```java

/**
 * Simplified copy of {@link org.springframework.vault.config.ClientHttpRequestFactoryFactory}
 * With proper redirect handling for POST requests
 * <p>
```

### Deprecation
'APPLICATION_JSON_UTF8' is deprecated
in `common/src/main/java/org/jetbrains/teamcity/vault/support/MappingJackson2HttpMessageConverter.java`
#### Snippet
```java
	 */
	public MappingJackson2HttpMessageConverter(ObjectMapper objectMapper) {
		super(objectMapper, MediaType.APPLICATION_JSON_UTF8,
				new MediaType("application", "*+json", DEFAULT_CHARSET));
	}
```

### Deprecation
'instantiate(java.lang.Class)' is deprecated
in `common/src/main/java/org/jetbrains/teamcity/vault/support/Jackson2ObjectMapperBuilder.java`
#### Snippet
```java
				Class<? extends Module> jdk7Module = (Class<? extends Module>)
						ClassUtils.forName("com.fasterxml.jackson.datatype.jdk7.Jdk7Module", this.moduleClassLoader);
				objectMapper.registerModule(BeanUtils.instantiate(jdk7Module));
			}
			catch (ClassNotFoundException ignored) {
```

### Deprecation
'instantiate(java.lang.Class)' is deprecated
in `common/src/main/java/org/jetbrains/teamcity/vault/support/Jackson2ObjectMapperBuilder.java`
#### Snippet
```java
				Class<? extends Module> jdk8Module = (Class<? extends Module>)
						ClassUtils.forName("com.fasterxml.jackson.datatype.jdk8.Jdk8Module", this.moduleClassLoader);
				objectMapper.registerModule(BeanUtils.instantiate(jdk8Module));
			}
			catch (ClassNotFoundException ignored) {
```

### Deprecation
'instantiate(java.lang.Class)' is deprecated
in `common/src/main/java/org/jetbrains/teamcity/vault/support/Jackson2ObjectMapperBuilder.java`
#### Snippet
```java
				Class<? extends Module> javaTimeModule = (Class<? extends Module>)
						ClassUtils.forName("com.fasterxml.jackson.datatype.jsr310.JavaTimeModule", this.moduleClassLoader);
				objectMapper.registerModule(BeanUtils.instantiate(javaTimeModule));
			}
			catch (ClassNotFoundException ignored) {
```

### Deprecation
'instantiate(java.lang.Class)' is deprecated
in `common/src/main/java/org/jetbrains/teamcity/vault/support/Jackson2ObjectMapperBuilder.java`
#### Snippet
```java
					Class<? extends Module> jsr310Module = (Class<? extends Module>)
							ClassUtils.forName("com.fasterxml.jackson.datatype.jsr310.JSR310Module", this.moduleClassLoader);
					objectMapper.registerModule(BeanUtils.instantiate(jsr310Module));
				}
				catch (ClassNotFoundException ignored2) {
```

### Deprecation
'instantiate(java.lang.Class)' is deprecated
in `common/src/main/java/org/jetbrains/teamcity/vault/support/Jackson2ObjectMapperBuilder.java`
#### Snippet
```java
				Class<? extends Module> jodaModule = (Class<? extends Module>)
						ClassUtils.forName("com.fasterxml.jackson.datatype.joda.JodaModule", this.moduleClassLoader);
				objectMapper.registerModule(BeanUtils.instantiate(jodaModule));
			}
			catch (ClassNotFoundException ignored) {
```

### Deprecation
'renewable(java.lang.String, long)' is deprecated
in `common/src/main/java/org/jetbrains/teamcity/vault/support/LifecycleAwareSessionManager.java`
#### Snippet
```java

        if (renewable != null && renewable) {
            return LoginToken.renewable(token, leaseDuration.longValue());
        }

```

### Deprecation
'of(java.lang.String, long)' is deprecated
in `common/src/main/java/org/jetbrains/teamcity/vault/support/LifecycleAwareSessionManager.java`
#### Snippet
```java

        if (leaseDuration != null) {
            return LoginToken.of(token, leaseDuration.longValue());
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
'getEditParametersUrl' always returns non-null type
in `server/src/main/kotlin/org/jetbrains/teamcity/vault/server/VaultProjectConnectionProvider.kt`
#### Snippet
```java
    }

    override fun getEditParametersUrl(): String? {
        return descriptor.getPluginResourcesPath("editProjectConnectionVault.jsp")
    }
```

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

## RuleId[id=InstanceofChain]
### InstanceofChain
Chain of 'instanceof' checks indicates abstraction failure
in `common/src/main/java/org/jetbrains/teamcity/vault/support/Jackson2ObjectMapperBuilder.java`
#### Snippet
```java

	private void configureFeature(ObjectMapper objectMapper, Object feature, boolean enabled) {
		if (feature instanceof JsonParser.Feature) {
			objectMapper.configure((JsonParser.Feature) feature, enabled);
		}
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

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `topLevelMounts` may be 'final'
in `common/src/main/java/org/jetbrains/teamcity/vault/support/VaultSysTemplate.java`
#### Snippet
```java
				VaultResponseSupport<Map<String, VaultMount>> {

			private Map<String, VaultMount> topLevelMounts = new HashMap<String, VaultMount>();

			@JsonIgnore
```

### FieldMayBeFinal
Field `moduleClassLoader` may be 'final'
in `common/src/main/java/org/jetbrains/teamcity/vault/support/Jackson2ObjectMapperBuilder.java`
#### Snippet
```java
public class Jackson2ObjectMapperBuilder {

	private ClassLoader moduleClassLoader = getClass().getClassLoader();


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
Private property name `jetty_server` should not contain underscores in the middle or the end
in `common/src/testFixtures/kotlin/org/jetbrains/teamcity/vault/VaultSemiClusterDevContainer.kt`
#### Snippet
```java
    }

    private var jetty_server: Server? = null

    override fun starting(description: Description?) {
```

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

## RuleId[id=SpringXmlAutowireExplicitlyInspection]
### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `server/src/main/resources/META-INF/build-server-plugin.xml`
#### Snippet
```java
       xmlns="http://www.springframework.org/schema/beans"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">
    <bean id="vaultConnector" class="org.jetbrains.teamcity.vault.server.VaultConnector"/>
    <bean id="vaultParametersProvider" class="org.jetbrains.teamcity.vault.server.VaultParametersProvider"/>
```

### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `agent/src/main/resources/META-INF/build-agent-plugin.xml`
#### Snippet
```java
       xmlns="http://www.springframework.org/schema/beans"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">
    <bean id="vaultParametersResolver" class="org.jetbrains.teamcity.vault.agent.VaultParametersResolver"/>
    <bean id="vaultBuildFeature" class="org.jetbrains.teamcity.vault.agent.VaultBuildFeature"/>
```

## RuleId[id=ConvertToStringTemplate]
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
in `agent/src/main/kotlin/org/jetbrains/teamcity/vault/agent/VaultParameter.kt`
#### Snippet
```java
    }

    val full: String get() = (if (jsonPath == null) vaultPath else vaultPath + "!/" + jsonPath).ensureHasPrefix("/")
}
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

## RuleId[id=RedundantIf]
### RedundantIf
Redundant 'if' statement
in `server/src/main/kotlin/org/jetbrains/teamcity/vault/server/VaultParametersProvider.kt`
#### Snippet
```java

            // It's faster than asking OAuthConectionsManager
            if (project.getAvailableFeaturesOfType(OAuthConstants.FEATURE_TYPE).any {
                        VaultConstants.FeatureSettings.FEATURE_TYPE == it.parameters[OAuthConstants.OAUTH_TYPE_PARAM]
                    }) return true

            return false
```

## RuleId[id=SerializableHasSerialVersionUIDField]
### SerializableHasSerialVersionUIDField
`ResolvingError` does not define a 'serialVersionUID' field
in `agent/src/main/kotlin/org/jetbrains/teamcity/vault/agent/VaultParametersResolver.kt`
#### Snippet
```java
        }

        private class ResolvingError(message: String) : Exception(message)

        private fun fetch(client: VaultTemplate, paths: Collection<String>): HashMap<String, VaultResponse?> {
```

### SerializableHasSerialVersionUIDField
`ConnectionException` does not define a 'serialVersionUID' field
in `server/src/main/kotlin/org/jetbrains/teamcity/vault/server/VaultConnector.kt`
#### Snippet
```java
    }

    class ConnectionException(message: String, cause: Throwable) : Exception(message, cause)
}

```

## RuleId[id=ConstantValue]
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

## RuleId[id=UnusedSymbol]
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

