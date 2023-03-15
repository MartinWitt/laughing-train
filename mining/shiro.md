# shiro 
 
# Bad smells
I found 1425 bad smells with 175 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 709 | false |
| ReturnNull | 119 | false |
| UnnecessaryModifier | 68 | true |
| RedundantFieldInitialization | 52 | false |
| NonProtectedConstructorInAbstractClass | 48 | true |
| BoundedWildcard | 35 | false |
| EmptyMethod | 33 | false |
| MissortedModifiers | 30 | false |
| UnusedAssignment | 20 | false |
| DeprecatedIsStillUsed | 19 | false |
| RedundantSuppression | 19 | false |
| ConstantValue | 18 | false |
| UtilityClassWithoutPrivateConstructor | 18 | true |
| AssignmentToMethodParameter | 17 | false |
| UNUSED_IMPORT | 15 | false |
| SizeReplaceableByIsEmpty | 13 | true |
| DataFlowIssue | 10 | false |
| ZeroLengthArrayInitialization | 8 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 7 | false |
| InnerClassMayBeStatic | 7 | true |
| NonStrictComparisonCanBeEquality | 7 | true |
| ObsoleteCollection | 6 | false |
| RedundantArrayCreation | 6 | true |
| AbstractClassNeverImplemented | 6 | false |
| ClassNameSameAsAncestorName | 6 | false |
| UnnecessarySuperQualifier | 6 | false |
| AssignmentToForLoopParameter | 6 | false |
| LongLiteralsEndingWithLowercaseL | 5 | false |
| NestedAssignment | 5 | false |
| UnnecessarySemicolon | 5 | false |
| MissingDeprecatedAnnotation | 5 | false |
| ToArrayCallWithZeroLengthArrayArgument | 4 | true |
| RegExpRedundantEscape | 4 | false |
| KeySetIterationMayUseEntrySet | 4 | false |
| DynamicRegexReplaceableByCompiledPattern | 4 | false |
| RedundantClassCall | 3 | false |
| ReplaceAssignmentWithOperatorAssignment | 3 | false |
| RedundantImplements | 3 | false |
| InstanceofCatchParameter | 3 | false |
| IOResource | 3 | false |
| Java9CollectionFactory | 3 | false |
| ConditionCoveredByFurtherCondition | 3 | false |
| Convert2Lambda | 3 | false |
| AssignmentToStaticFieldFromInstanceMethod | 2 | false |
| CStyleArrayDeclaration | 2 | false |
| CommentedOutCode | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| TrivialStringConcatenation | 2 | false |
| DefaultAnnotationParam | 2 | false |
| RedundantMethodOverride | 2 | false |
| SimplifyOptionalCallChains | 2 | false |
| NonFinalFieldOfException | 2 | false |
| SynchronizeOnThis | 2 | false |
| RedundantLengthCheck | 2 | false |
| SimplifyStreamApiCallChains | 2 | false |
| StringOperationCanBeSimplified | 2 | false |
| NonSerializableFieldInSerializableClass | 2 | false |
| ProtectedMemberInFinalClass | 2 | true |
| UnnecessaryBoxing | 2 | false |
| ReplaceNullCheck | 2 | false |
| Java8MapApi | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| RedundantSlf4jDefinition | 2 | false |
| EmptyStatementBody | 1 | false |
| ManualMinMaxCalculation | 1 | false |
| RegExpRedundantNestedCharacterClass | 1 | false |
| RegExpDuplicateCharacterInClass | 1 | false |
| SlowListContainsAll | 1 | false |
| StringRepeatCanBeUsed | 1 | false |
| CastConflictsWithInstanceof | 1 | false |
| IndexOfReplaceableByContains | 1 | false |
| Convert2MethodRef | 1 | false |
| StringEqualsEmptyString | 1 | false |
| UnnecessaryInitCause | 1 | false |
| OptionalUsedAsFieldOrParameterType | 1 | false |
| CharsetObjectCanBeUsed | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| SamePackageImport | 1 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 1 | false |
| RegExpUnnecessaryNonCapturingGroup | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Key\[keysForPath.size()\]'
in `support/guice/src/main/java/org/apache/shiro/guice/web/ShiroWebModule.java`
#### Snippet
```java

            // map the current path to all of its Keys
            resultConfigMap.put(path, keysForPath.toArray(new Key[keysForPath.size()]));
        }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[roles.size()\]'
in `core/src/main/java/org/apache/shiro/authz/ModularRealmAuthorizer.java`
#### Snippet
```java
    public void checkRoles(PrincipalCollection principals, Collection<String> roles) throws AuthorizationException {
        //SHIRO-234 - roles.toArray() -> roles.toArray(new String[roles.size()])
        if (roles != null && !roles.isEmpty()) checkRoles(principals, roles.toArray(new String[roles.size()]));
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[tokens.size()\]'
in `lang/src/main/java/org/apache/shiro/lang/util/StringUtils.java`
#### Snippet
```java
        }
        tokens.add(s);
        return tokens.toArray(new String[tokens.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[collection.size()\]'
in `lang/src/main/java/org/apache/shiro/lang/util/StringUtils.java`
#### Snippet
```java
            return null;
        }
        return (String[]) collection.toArray(new String[collection.size()]);
    }

```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `samples/spring-mvc/src/main/java/org/apache/shiro/samples/spring/web/LoginController.java`
#### Snippet
```java
public class LoginController {

    private static transient final Logger log = LoggerFactory.getLogger(LoginController.class);

    private static String loginView = "login";
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/PaddingScheme.java`
#### Snippet
```java
    private final String transformationName;

    private PaddingScheme(String transformationName) {
        this.transformationName = transformationName;
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/format/ModularCryptFormat.java`
#### Snippet
```java
public interface ModularCryptFormat extends HashFormat {

    public static final String TOKEN_DELIMITER = "$";

    /**
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/format/ModularCryptFormat.java`
#### Snippet
```java
public interface ModularCryptFormat extends HashFormat {

    public static final String TOKEN_DELIMITER = "$";

    /**
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/format/ModularCryptFormat.java`
#### Snippet
```java
public interface ModularCryptFormat extends HashFormat {

    public static final String TOKEN_DELIMITER = "$";

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/HashRequest.java`
#### Snippet
```java
     * @since 1.2
     */
    public static class Builder {

        private ByteSource source;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/HashRequest.java`
#### Snippet
```java
     * @since 1.2
     */
    public static class Builder {

        private ByteSource source;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `cache/src/main/java/org/apache/shiro/cache/Cache.java`
#### Snippet
```java
     * @return a view of all of the values contained in this cache.
     */
    public Collection<V> values();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `cache/src/main/java/org/apache/shiro/cache/Cache.java`
#### Snippet
```java
     * @return a view of all the keys for entries contained in this cache.
     */
    public Set<K> keys();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `cache/src/main/java/org/apache/shiro/cache/Cache.java`
#### Snippet
```java
     * @throws CacheException if there is a problem accessing the underlying cache system
     */
    public V get(K key) throws CacheException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `cache/src/main/java/org/apache/shiro/cache/CacheManager.java`
#### Snippet
```java
     * @throws CacheException if there is an error acquiring the Cache instance.
     */
    public <K, V> Cache<K, V> getCache(String name) throws CacheException;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `cache/src/main/java/org/apache/shiro/cache/Cache.java`
#### Snippet
```java
     * @throws CacheException if there is a problem accessing the underlying cache system
     */
    public V remove(K key) throws CacheException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `cache/src/main/java/org/apache/shiro/cache/Cache.java`
#### Snippet
```java
     * @throws CacheException if there is a problem accessing the underlying cache system
     */
    public V put(K key, V value) throws CacheException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `cache/src/main/java/org/apache/shiro/cache/Cache.java`
#### Snippet
```java
     * @return the number of entries in the cache.
     */
    public int size();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `cache/src/main/java/org/apache/shiro/cache/Cache.java`
#### Snippet
```java
     * @throws CacheException if there is a problem accessing the underlying cache system
     */
    public void clear() throws CacheException;

    /**
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `web/src/main/java/org/apache/shiro/web/mgt/CookieRememberMeManager.java`
#### Snippet
```java
    //TODO - complete JavaDoc

    private static transient final Logger log = LoggerFactory.getLogger(CookieRememberMeManager.class);

    /**
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `web/src/main/java/org/apache/shiro/web/filter/mgt/DefaultFilter.java`
#### Snippet
```java
    private final Class<? extends Filter> filterClass;

    private DefaultFilter(Class<? extends Filter> filterClass) {
        this.filterClass = filterClass;
    }
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `web/src/main/java/org/apache/shiro/web/filter/mgt/PathMatchingFilterChainResolver.java`
#### Snippet
```java
public class PathMatchingFilterChainResolver implements FilterChainResolver {

    private static transient final Logger log = LoggerFactory.getLogger(PathMatchingFilterChainResolver.class);

    private FilterChainManager filterChainManager;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `web/src/main/java/org/apache/shiro/web/filter/authz/IpSource.java`
#### Snippet
```java
     * access should be denied.
     */
    public Collection<String> getDeniedIps();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `web/src/main/java/org/apache/shiro/web/filter/authz/IpSource.java`
#### Snippet
```java
     * in the list of denied IPs)
     */
    public Collection<String> getAuthorizedIps();

    /**
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `web/src/main/java/org/apache/shiro/web/config/IniFilterChainResolverFactory.java`
#### Snippet
```java
    public static final String URLS = "urls";

    private static transient final Logger log = LoggerFactory.getLogger(IniFilterChainResolverFactory.class);

    private FilterConfig filterConfig;
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `web/src/main/java/org/apache/shiro/web/filter/mgt/DefaultFilterChainManager.java`
#### Snippet
```java
public class DefaultFilterChainManager implements FilterChainManager {

    private static transient final Logger log = LoggerFactory.getLogger(DefaultFilterChainManager.class);

    private FilterConfig filterConfig;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `web/src/main/java/org/apache/shiro/web/servlet/Cookie.java`
#### Snippet
```java
     * The value of deleted cookie (with the maxAge 0).
     */
    public static final String DELETED_COOKIE_VALUE = "deleteMe";


```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `web/src/main/java/org/apache/shiro/web/servlet/Cookie.java`
#### Snippet
```java
     * The value of deleted cookie (with the maxAge 0).
     */
    public static final String DELETED_COOKIE_VALUE = "deleteMe";


```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `web/src/main/java/org/apache/shiro/web/servlet/Cookie.java`
#### Snippet
```java
     * The value of deleted cookie (with the maxAge 0).
     */
    public static final String DELETED_COOKIE_VALUE = "deleteMe";


```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `web/src/main/java/org/apache/shiro/web/servlet/Cookie.java`
#### Snippet
```java
     * The number of seconds in one year (= 60 * 60 * 24 * 365).
     */
    public static final int ONE_YEAR = 60 * 60 * 24 * 365;

    /**
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `web/src/main/java/org/apache/shiro/web/servlet/Cookie.java`
#### Snippet
```java
     * The number of seconds in one year (= 60 * 60 * 24 * 365).
     */
    public static final int ONE_YEAR = 60 * 60 * 24 * 365;

    /**
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `web/src/main/java/org/apache/shiro/web/servlet/Cookie.java`
#### Snippet
```java
     * The number of seconds in one year (= 60 * 60 * 24 * 365).
     */
    public static final int ONE_YEAR = 60 * 60 * 24 * 365;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `web/src/main/java/org/apache/shiro/web/servlet/Cookie.java`
#### Snippet
```java
     * The SameSite attribute of the Set-Cookie HTTP response header allows you to declare if your cookie should be restricted to a first-party or same-site context.
     */
    public enum SameSiteOptions {
        /**
         * Cookies will be sent in all contexts, i.e sending cross-origin is allowed.
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `web/src/main/java/org/apache/shiro/web/servlet/Cookie.java`
#### Snippet
```java
     * Root path to use when the path hasn't been set and request context root is empty or null.
     */
    public static final String ROOT_PATH = "/";

    /**
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `web/src/main/java/org/apache/shiro/web/servlet/Cookie.java`
#### Snippet
```java
     * Root path to use when the path hasn't been set and request context root is empty or null.
     */
    public static final String ROOT_PATH = "/";

    /**
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `web/src/main/java/org/apache/shiro/web/servlet/Cookie.java`
#### Snippet
```java
     * Root path to use when the path hasn't been set and request context root is empty or null.
     */
    public static final String ROOT_PATH = "/";

    /**
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `web/src/main/java/org/apache/shiro/web/servlet/AbstractFilter.java`
#### Snippet
```java
public abstract class AbstractFilter extends ServletContextSupport implements Filter {

    private static transient final Logger log = LoggerFactory.getLogger(AbstractFilter.class);

    /**
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `web/src/main/java/org/apache/shiro/web/filter/authz/HttpMethodPermissionFilter.java`
#### Snippet
```java
     * used at runtime.
     */
    private static enum HttpMethodAction {

        DELETE(DELETE_ACTION),
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `web/src/main/java/org/apache/shiro/web/filter/authz/HttpMethodPermissionFilter.java`
#### Snippet
```java
        private final String action;

        private HttpMethodAction(String action) {
            this.action = action;
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `web/src/main/java/org/apache/shiro/web/subject/WebSubject.java`
#### Snippet
```java
     * is retained for use by internal Shiro components as necessary.
     */
    public static class Builder extends Subject.Builder {

        /**
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `web/src/main/java/org/apache/shiro/web/subject/WebSubject.java`
#### Snippet
```java
     * is retained for use by internal Shiro components as necessary.
     */
    public static class Builder extends Subject.Builder {

        /**
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `web/src/main/java/org/apache/shiro/web/servlet/SimpleCookie.java`
#### Snippet
```java
    protected static final String SAME_SITE_ATTRIBUTE_NAME = "SameSite";

    private static final transient Logger log = LoggerFactory.getLogger(SimpleCookie.class);

    private String name;
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `samples/quickstart/src/main/java/Quickstart.java`
#### Snippet
```java
public class Quickstart {

    private static final transient Logger log = LoggerFactory.getLogger(Quickstart.class);


```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `samples/quickstart-guice/src/main/java/QuickstartGuice.java`
#### Snippet
```java
public class QuickstartGuice {

    private static final transient Logger log = LoggerFactory.getLogger(QuickstartGuice.class);


```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `config/core/src/main/java/org/apache/shiro/config/Ini.java`
#### Snippet
```java
public class Ini implements Map<String, Ini.Section> {

    private static transient final Logger log = LoggerFactory.getLogger(Ini.class);

    public static final String DEFAULT_SECTION_NAME = ""; //empty string means the first unnamed section
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `support/guice/src/main/java/org/apache/shiro/guice/DestroyableInjectionListener.java`
#### Snippet
```java
    }

    public static interface DestroyableRegistry {
        void add(Destroyable destroyable);
    }
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `support/spring/src/main/java/org/apache/shiro/spring/web/ShiroFilterFactoryBean.java`
#### Snippet
```java
public class ShiroFilterFactoryBean implements FactoryBean, BeanPostProcessor {

    private static transient final Logger log = LoggerFactory.getLogger(ShiroFilterFactoryBean.class);

    private SecurityManager securityManager;
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `core/src/main/java/org/apache/shiro/ini/IniSecurityManagerFactory.java`
#### Snippet
```java
    public static final String INI_REALM_NAME = "iniRealm";

    private static transient final Logger log = LoggerFactory.getLogger(IniSecurityManagerFactory.class);

    private ReflectionBuilder builder;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/shiro/authc/LogoutAware.java`
#### Snippet
```java
     * @param principals the identifying principals of the Subject logging out.
     */
    public void onLogout(PrincipalCollection principals);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/shiro/authc/Authenticator.java`
#### Snippet
```java
     * @see UnknownAccountException
     */
    public AuthenticationInfo authenticate(AuthenticationToken authenticationToken)
            throws AuthenticationException;
}
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `core/src/main/java/org/apache/shiro/ini/IniFactorySupport.java`
#### Snippet
```java
    public static final String DEFAULT_INI_RESOURCE_PATH = "classpath:shiro.ini";

    private static transient final Logger log = LoggerFactory.getLogger(IniFactorySupport.class);

    private Ini ini;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/shiro/authz/permission/PermissionResolverAware.java`
#### Snippet
```java
     * @param pr the <tt>PermissionResolver</tt> being set.
     */
    public void setPermissionResolver(PermissionResolver pr);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/shiro/authz/permission/RolePermissionResolverAware.java`
#### Snippet
```java
     * @param rpr the <tt>RolePermissionResolver</tt> being set.
     */
    public void setRolePermissionResolver(RolePermissionResolver rpr);
}

```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `core/src/main/java/org/apache/shiro/realm/text/IniRealm.java`
#### Snippet
```java
    public static final String ROLES_SECTION_NAME = "roles";

    private static transient final Logger log = LoggerFactory.getLogger(IniRealm.class);

    private String resourcePath;
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `core/src/main/java/org/apache/shiro/session/mgt/SimpleSession.java`
#### Snippet
```java

    //TODO - complete JavaDoc
    private transient static final Logger log = LoggerFactory.getLogger(SimpleSession.class);

    protected static final long MILLIS_PER_SECOND = 1000;
```

### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `core/src/main/java/org/apache/shiro/subject/support/DefaultSubjectContext.java`
#### Snippet
```java
    public static final String AUTHENTICATED_SESSION_KEY = DefaultSubjectContext.class.getName() + "_AUTHENTICATED_SESSION_KEY";

    private static final transient Logger log = LoggerFactory.getLogger(DefaultSubjectContext.class);

    public DefaultSubjectContext() {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
     * @since 1.0
     */
    public static class Builder {

        /**
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
     * @since 1.0
     */
    public static class Builder {

        /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `samples/aspectj/src/main/java/org/apache/shiro/samples/aspectj/bank/BankService.java`
#### Snippet
```java
    public double getBalanceOf(long anAccountId) throws AccountNotFoundException;

    public String getOwnerOf(long anAccountId) throws AccountNotFoundException;

    public double depositInto(long anAccountId, double anAmount) throws AccountNotFoundException, InactiveAccountException;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `samples/aspectj/src/main/java/org/apache/shiro/samples/aspectj/bank/BankService.java`
#### Snippet
```java
    public double closeAccount(long anAccountId) throws AccountNotFoundException, InactiveAccountException;

    public boolean isAccountActive(long anAccountId) throws AccountNotFoundException;

    public static class TxLog {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `samples/aspectj/src/main/java/org/apache/shiro/samples/aspectj/bank/BankService.java`
#### Snippet
```java
    public TxLog[] getTxHistoryFor(long anAccountId) throws AccountNotFoundException;

    public double closeAccount(long anAccountId) throws AccountNotFoundException, InactiveAccountException;

    public boolean isAccountActive(long anAccountId) throws AccountNotFoundException;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `samples/aspectj/src/main/java/org/apache/shiro/samples/aspectj/bank/BankService.java`
#### Snippet
```java
public interface BankService {

    public long[] searchAccountIdsByOwner(String anOwnerName);

    public long createNewAccount(String anOwnerName);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `samples/aspectj/src/main/java/org/apache/shiro/samples/aspectj/bank/BankService.java`
#### Snippet
```java
    public long createNewAccount(String anOwnerName);

    public double getBalanceOf(long anAccountId) throws AccountNotFoundException;

    public String getOwnerOf(long anAccountId) throws AccountNotFoundException;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `samples/aspectj/src/main/java/org/apache/shiro/samples/aspectj/bank/BankService.java`
#### Snippet
```java
    public boolean isAccountActive(long anAccountId) throws AccountNotFoundException;

    public static class TxLog {
        private Date _creationDate;
        private double _amount;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `samples/aspectj/src/main/java/org/apache/shiro/samples/aspectj/bank/BankService.java`
#### Snippet
```java
    public boolean isAccountActive(long anAccountId) throws AccountNotFoundException;

    public static class TxLog {
        private Date _creationDate;
        private double _amount;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `samples/aspectj/src/main/java/org/apache/shiro/samples/aspectj/bank/BankService.java`
#### Snippet
```java
    public String getOwnerOf(long anAccountId) throws AccountNotFoundException;

    public double depositInto(long anAccountId, double anAmount) throws AccountNotFoundException, InactiveAccountException;

    public double withdrawFrom(long anAccountId, double anAmount) throws AccountNotFoundException, NotEnoughFundsException, InactiveAccountException;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `samples/aspectj/src/main/java/org/apache/shiro/samples/aspectj/bank/BankService.java`
#### Snippet
```java
    public double withdrawFrom(long anAccountId, double anAmount) throws AccountNotFoundException, NotEnoughFundsException, InactiveAccountException;

    public TxLog[] getTxHistoryFor(long anAccountId) throws AccountNotFoundException;

    public double closeAccount(long anAccountId) throws AccountNotFoundException, InactiveAccountException;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `samples/aspectj/src/main/java/org/apache/shiro/samples/aspectj/bank/BankService.java`
#### Snippet
```java
    public double depositInto(long anAccountId, double anAmount) throws AccountNotFoundException, InactiveAccountException;

    public double withdrawFrom(long anAccountId, double anAmount) throws AccountNotFoundException, NotEnoughFundsException, InactiveAccountException;

    public TxLog[] getTxHistoryFor(long anAccountId) throws AccountNotFoundException;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `samples/aspectj/src/main/java/org/apache/shiro/samples/aspectj/bank/BankService.java`
#### Snippet
```java
    public long[] searchAccountIdsByOwner(String anOwnerName);

    public long createNewAccount(String anOwnerName);

    public double getBalanceOf(long anAccountId) throws AccountNotFoundException;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `lang/src/main/java/org/apache/shiro/lang/util/ByteSource.java`
#### Snippet
```java
     * @since 1.2
     */
    public static final class Util {

        /**
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `lang/src/main/java/org/apache/shiro/lang/util/ByteSource.java`
#### Snippet
```java
     * @since 1.2
     */
    public static final class Util {

        /**
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `lang/src/main/java/org/apache/shiro/lang/util/ClassUtils.java`
#### Snippet
```java
     * @since 1.0
     */
    private static interface ClassLoaderAccessor {
        Class loadClass(String fqcn);
        InputStream getResourceStream(String name);
```

## RuleId[id=RedundantClassCall]
### RedundantClassCall
Redundant call to `isInstance()`
in `web/src/main/java/org/apache/shiro/web/env/EnvironmentLoader.java`
#### Snippet
```java

        WebEnvironment webEnvironment = determineWebEnvironment(sc);
        if (!MutableWebEnvironment.class.isInstance(webEnvironment)) {
            throw new ConfigurationException("Custom WebEnvironment class [" + webEnvironment.getClass().getName() +
                    "] is not of required type [" + MutableWebEnvironment.class.getName() + "]");
```

### RedundantClassCall
Redundant call to `isInstance()`
in `web/src/main/java/org/apache/shiro/web/env/EnvironmentLoader.java`
#### Snippet
```java
        boolean configSpecified = StringUtils.hasText(configLocations);

        if (configSpecified && !(ResourceConfigurable.class.isInstance(webEnvironment))) {
            String msg = "WebEnvironment class [" + webEnvironment.getClass().getName() + "] does not implement the " +
                    ResourceConfigurable.class.getName() + "interface.  This is required to accept any " +
```

### RedundantClassCall
Redundant call to `isInstance()`
in `core/src/main/java/org/apache/shiro/realm/ldap/JndiLdapContextFactory.java`
#### Snippet
```java
                    (credentials instanceof byte[] && ((byte[])credentials).length <= 0) || // empty byte[]
                    (credentials instanceof char[] && ((char[])credentials).length <= 0) || // empty char[]
                    (String.class.isInstance(credentials) && !StringUtils.hasText(String.valueOf(credentials)))) {

                    throw new javax.naming.AuthenticationException("LDAP Simple authentication requires both a "
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`else` statement has empty body
in `web/src/main/java/org/apache/shiro/web/filter/authz/HostFilter.java`
#### Snippet
```java
            if (IPV4_PATTERN.matcher(wildcardsReplaced).matches()) {
                authorizedIps.put(host, wildcardsReplaced);
            } else {

            }
```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `_SEQUENCE` from instance context
in `samples/aspectj/src/main/java/org/apache/shiro/samples/aspectj/bank/Account.java`
#### Snippet
```java

    public Account(String anOwnerName) {
        _id = ++_SEQUENCE;
        _ownerName = anOwnerName;
        _isActive = true;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `_SEQUENCE` from instance context
in `samples/aspectj/src/main/java/org/apache/shiro/samples/aspectj/bank/AccountTransaction.java`
#### Snippet
```java

    private AccountTransaction(TransactionType aType, long anAccountId, double anAmount) {
        _id = ++_SEQUENCE;
        _type = aType;
        _accountId = anAccountId;
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `cookies`
in `web/src/main/java/org/apache/shiro/web/servlet/SimpleCookie.java`
#### Snippet
```java
     */
    private static javax.servlet.http.Cookie getCookie(HttpServletRequest request, String cookieName) {
        javax.servlet.http.Cookie cookies[] = request.getCookies();
        if (cookies != null) {
            for (javax.servlet.http.Cookie cookie : cookies) {
```

### CStyleArrayDeclaration
C-style array declaration of local variable `propertyDescriptors`
in `support/guice/src/main/java/org/apache/shiro/guice/BeanTypeListener.java`
#### Snippet
```java

    public <I> void hear(TypeLiteral<I> type, final TypeEncounter<I> encounter) {
        PropertyDescriptor propertyDescriptors[] = beanUtilsBean.getPropertyUtils().getPropertyDescriptors(type.getRawType());
        final Map<PropertyDescriptor, Key<?>> propertyDependencies = new HashMap<PropertyDescriptor, Key<?>>(propertyDescriptors.length);
        final Provider<Injector> injectorProvider = encounter.getProvider(Injector.class);
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `samples/spring-mvc/src/main/java/org/apache/shiro/samples/spring/config/ApplicationConfig.java`
#### Snippet
```java
    public ShiroFilterChainDefinition shiroFilterChainDefinition() {
        DefaultShiroFilterChainDefinition chainDefinition = new DefaultShiroFilterChainDefinition();
//        chainDefinition.addPathDefinition("/login.html", "authc"); // need to accept POSTs from the login form
//        chainDefinition.addPathDefinition("/logout", "logout");

```

### CommentedOutCode
Commented out code (10 lines)
in `core/src/main/java/org/apache/shiro/util/CollectionUtils.java`
#### Snippet
```java
    }

    /*public static <E> Deque<E> asDeque(E... elements) {
        if (elements == null || elements.length == 0) {
            return new ArrayDeque<E>();
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/FormResubmitSupport.java`
#### Snippet
```java
        if (referer != null) {
            // do not switch to https if custom port is specified
            if (!referer.matches("^http:\\/\\/[A-z|.|[0-9]]+:[0-9]+(\\/.*|$)")) {
                referer = referer.replaceFirst("^http:", "https:");
            }
```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/FormResubmitSupport.java`
#### Snippet
```java
        if (referer != null) {
            // do not switch to https if custom port is specified
            if (!referer.matches("^http:\\/\\/[A-z|.|[0-9]]+:[0-9]+(\\/.*|$)")) {
                referer = referer.replaceFirst("^http:", "https:");
            }
```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/FormResubmitSupport.java`
#### Snippet
```java
        if (referer != null) {
            // do not switch to https if custom port is specified
            if (!referer.matches("^http:\\/\\/[A-z|.|[0-9]]+:[0-9]+(\\/.*|$)")) {
                referer = referer.replaceFirst("^http:", "https:");
            }
```

### RegExpRedundantEscape
Redundant character escape `\\&` in RegExp
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/FormResubmitSupport.java`
#### Snippet
```java
    private static final Pattern PARTIAL_REQUEST_PATTERN
            = Pattern.compile(String.format("[\\&]?%s.\\w+=[\\w\\s:%%\\d]*", PARTIAL_VIEW));
    private static final Pattern INITIAL_AMPERSAND = Pattern.compile("^\\&");
    private static final String FORM_DATA_CACHE = "org.apache.form-data-cache";

```

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `core/src/main/java/org/apache/shiro/jndi/JndiTemplate.java`
#### Snippet
```java
    protected Context createInitialContext() throws NamingException {
        Properties env = getEnvironment();
        Hashtable icEnv = null;
        if (env != null) {
            icEnv = new Hashtable(env.size());
```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `core/src/main/java/org/apache/shiro/jndi/JndiTemplate.java`
#### Snippet
```java
        Hashtable icEnv = null;
        if (env != null) {
            icEnv = new Hashtable(env.size());
            for (Enumeration en = env.propertyNames(); en.hasMoreElements();) {
                String key = (String) en.nextElement();
```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `core/src/main/java/org/apache/shiro/realm/ldap/JndiLdapContextFactory.java`
#### Snippet
```java
        //copy the environment template into the runtime instance that will be further edited based on
        //the method arguments and other class attributes.
        Hashtable<String, Object> env = new Hashtable<String, Object>(this.environment);

        Object authcMech = getAuthenticationMechanism();
```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `core/src/main/java/org/apache/shiro/realm/ldap/JndiLdapContextFactory.java`
#### Snippet
```java
        //copy the environment template into the runtime instance that will be further edited based on
        //the method arguments and other class attributes.
        Hashtable<String, Object> env = new Hashtable<String, Object>(this.environment);

        Object authcMech = getAuthenticationMechanism();
```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `core/src/main/java/org/apache/shiro/realm/ldap/JndiLdapContextFactory.java`
#### Snippet
```java
     * @throws AuthenticationException if a configuration problem is detected
     */
    protected void validateAuthenticationInfo(Hashtable<String, Object> environment)
        throws AuthenticationException
    {
```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `core/src/main/java/org/apache/shiro/realm/ldap/JndiLdapContextFactory.java`
#### Snippet
```java
     * @throws NamingException if a problem occurs creating the connection
     */
    protected LdapContext createLdapContext(Hashtable env) throws NamingException {
        return new InitialLdapContext(env, null);
    }
```

## RuleId[id=LongLiteralsEndingWithLowercaseL]
### LongLiteralsEndingWithLowercaseL
'long' literal `1l` ends with lowercase 'l'
in `core/src/main/java/org/apache/shiro/authz/permission/DomainPermission.java`
#### Snippet
```java
    private Set<String> targets;

    private static final long serialVersionUID = 1l;

    /**
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `core/src/main/java/org/apache/shiro/session/mgt/ExecutorServiceSessionValidationScheduler.java`
#### Snippet
```java
    // (so we don't have to change the unit test execution model for the core module)
    public void enableSessionValidation() {
        if (this.sessionValidationInterval > 0l) {
            this.service = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() {  
	            private final AtomicInteger count = new AtomicInteger(1);
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `core/src/main/java/org/apache/shiro/session/mgt/SimpleSession.java`
#### Snippet
```java
        bitMask = stopTimestamp != null ? bitMask | STOP_TIMESTAMP_BIT_MASK : bitMask;
        bitMask = lastAccessTime != null ? bitMask | LAST_ACCESS_TIME_BIT_MASK : bitMask;
        bitMask = timeout != 0l ? bitMask | TIMEOUT_BIT_MASK : bitMask;
        bitMask = expired ? bitMask | EXPIRED_BIT_MASK : bitMask;
        bitMask = host != null ? bitMask | HOST_BIT_MASK : bitMask;
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `core/src/main/java/org/apache/shiro/session/mgt/SimpleSession.java`
#### Snippet
```java
        long timeout = getTimeout();

        if (timeout >= 0l) {

            Date lastAccessTime = getLastAccessTime();
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `core/src/main/java/org/apache/shiro/session/mgt/SimpleSession.java`
#### Snippet
```java
            out.writeObject(lastAccessTime);
        }
        if (timeout != 0l) {
            out.writeLong(timeout);
        }
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `this.appliedPaths.keySet()` may be replaced with 'entrySet()' iteration
in `web/src/main/java/org/apache/shiro/web/filter/PathMatchingFilter.java`
#### Snippet
```java
        }

        for (String path : this.appliedPaths.keySet()) {
            // If the path does match, then pass on to the subclass implementation for specific checks
            //(first match 'wins'):
```

### KeySetIterationMayUseEntrySet
Iteration over `chains.keySet()` may be replaced with 'entrySet()' iteration
in `support/guice/src/main/java/org/apache/shiro/guice/web/SimpleFilterChainResolver.java`
#### Snippet
```java
    public FilterChain getChain(ServletRequest request, ServletResponse response, final FilterChain originalChain) {
        String path = WebUtils.getPathWithinApplication(WebUtils.toHttp(request));
        for (final String pathPattern : chains.keySet()) {
            if (patternMatcher.matches(pathPattern, path)) {
                final Iterator<Key<? extends Filter>> chain = Arrays.asList(chains.get(pathPattern)).iterator();
```

### KeySetIterationMayUseEntrySet
Iteration over `chains.keySet()` may be replaced with 'values()' iteration
in `support/guice/src/main/java/org/apache/shiro/guice/web/FilterChainResolverProvider.java`
#### Snippet
```java
        this.chains = chains;
        Set<Dependency<?>> dependenciesBuilder = new HashSet<Dependency<?>>();
        for (String chain : chains.keySet()) {
            for (Key<? extends Filter> filterKey : chains.get(chain)) {
                dependenciesBuilder.add(Dependency.get(filterKey));
```

### KeySetIterationMayUseEntrySet
Iteration over `filterToPathToConfig.keySet()` may be replaced with 'entrySet()' iteration
in `support/guice/src/main/java/org/apache/shiro/guice/web/ShiroWebModule.java`
#### Snippet
```java
        // now we find only the PathMatchingFilter and configure bindings
        // non PathMatchingFilter, can be loaded with the default provider via the class name
        for (Key<? extends Filter> key : filterToPathToConfig.keySet()) {
            if (PathMatchingFilter.class.isAssignableFrom(key.getTypeLiteral().getRawType())) {
                bindPathMatchingFilter(castToPathMatching(key), filterToPathToConfig.get(key));
```

## RuleId[id=RedundantArrayCreation]
### RedundantArrayCreation
Redundant array creation for calling varargs method
in `web/src/main/java/org/apache/shiro/web/filter/PathMatchingFilter.java`
#### Snippet
```java
                log.trace("Filter '{}' is enabled for the current request under path '{}' with config [{}].  " +
                        "Delegating to subclass implementation for 'onPreHandle' check.",
                        new Object[]{getName(), path, pathConfig});
            }
            //The filter is enabled for this specific request, so delegate to subclass implementations
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `web/src/main/java/org/apache/shiro/web/filter/PathMatchingFilter.java`
#### Snippet
```java
            log.trace("Filter '{}' is disabled for the current request under path '{}' with config [{}].  " +
                    "The next element in the FilterChain will be called immediately.",
                    new Object[]{getName(), path, pathConfig});
        }
        //This filter is disabled for this specific request,
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `web/src/main/java/org/apache/shiro/web/servlet/SimpleCookie.java`
#### Snippet
```java
            if (path != null && !pathMatches(path, request.getRequestURI())) {
                log.warn("Found '{}' cookie at path '{}', but should be only used for '{}'", 
                		new Object[] { name, Encode.forHtml(request.getRequestURI()), path});
            } else {
                value = cookie.getValue();
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `config/ogdl/src/main/java/org/apache/shiro/config/ogdl/event/LoggingBeanEventListener.java`
#### Snippet
```java
        int i = className.lastIndexOf(SUFFIX);
        String subclassPrefix = i > 0 ? className.substring(0, i) : className;
        logger.trace("{} bean '{}' [{}]", new Object[]{subclassPrefix, e.getBeanName(), e.getBean()});
    }
}
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `config/ogdl/src/main/java/org/apache/shiro/config/ogdl/ReflectionBuilder.java`
#### Snippet
```java
            if (log.isTraceEnabled()) {
                log.trace("Applying property [{}] value [{}] on object of type [{}]",
                        new Object[]{propertyPath, value, object.getClass().getName()});
            }
            beanUtilsBean.setProperty(object, propertyPath, value);
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `core/src/main/java/org/apache/shiro/realm/ldap/JndiLdapContextFactory.java`
#### Snippet
```java
        if (log.isDebugEnabled()) {
            log.debug("Initializing LDAP context using URL [{}] and principal [{}] with pooling {}",
                    new Object[]{url, principal, (pooling ? "enabled" : "disabled")});
        }

```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`permission.length() == 0` can be replaced with 'permission.isEmpty()'
in `web/src/main/java/org/apache/shiro/web/tags/PermissionTag.java`
#### Snippet
```java
        String permission = getName();

        if (permission == null || permission.length() == 0) {
            String msg = "The 'name' tag attribute must be set.";
            throw new JspException(msg);
```

### SizeReplaceableByIsEmpty
`authorizationHeader.length() == 0` can be replaced with 'authorizationHeader.isEmpty()'
in `web/src/main/java/org/apache/shiro/web/filter/authc/BearerHttpAuthenticationFilter.java`
#### Snippet
```java
    protected AuthenticationToken createToken(ServletRequest request, ServletResponse response) {
        String authorizationHeader = getAuthzHeader(request);
        if (authorizationHeader == null || authorizationHeader.length() == 0) {
            // Create an empty authentication token since there is no
            // Authorization header.
```

### SizeReplaceableByIsEmpty
`authorizationHeader.length() == 0` can be replaced with 'authorizationHeader.isEmpty()'
in `web/src/main/java/org/apache/shiro/web/filter/authc/HttpAuthenticationFilter.java`
#### Snippet
```java
    protected AuthenticationToken createToken(ServletRequest request, ServletResponse response) {
        String authorizationHeader = getAuthzHeader(request);
        if (authorizationHeader == null || authorizationHeader.length() == 0) {
            // Create an empty authentication token since there is no
            // Authorization header.
```

### SizeReplaceableByIsEmpty
`methods.size() == 0` can be replaced with 'methods.isEmpty()'
in `web/src/main/java/org/apache/shiro/web/filter/authc/HttpAuthenticationFilter.java`
#### Snippet
```java

        Set<String> methods = httpMethodsFromOptions((String[])mappedValue);
        boolean authcRequired = methods.size() == 0;
        for (String m : methods) {
            if (httpMethod.toUpperCase(Locale.ENGLISH).equals(m)) { // list of methods is in upper case
```

### SizeReplaceableByIsEmpty
`authorizationHeader.length() == 0` can be replaced with 'authorizationHeader.isEmpty()'
in `web/src/main/java/org/apache/shiro/web/filter/authc/BasicHttpAuthenticationFilter.java`
#### Snippet
```java
    protected AuthenticationToken createToken(ServletRequest request, ServletResponse response) {
        String authorizationHeader = getAuthzHeader(request);
        if (authorizationHeader == null || authorizationHeader.length() == 0) {
            // Create an empty authentication token since there is no
            // Authorization header.
```

### SizeReplaceableByIsEmpty
`keyNames.size() > 0` can be replaced with '!keyNames.isEmpty()'
in `web/src/main/java/org/apache/shiro/web/servlet/ShiroHttpSession.java`
#### Snippet
```java
        Set<String> keyNames = getKeyNames();
        String[] array = new String[keyNames.size()];
        if (keyNames.size() > 0) {
            array = keyNames.toArray(array);
        }
```

### SizeReplaceableByIsEmpty
`saved.length() == 0` can be replaced with 'saved.isEmpty()'
in `core/src/main/java/org/apache/shiro/authc/credential/DefaultPasswordService.java`
#### Snippet
```java
        ByteSource plaintextBytes = createByteSource(submittedPlaintext);

        if (saved == null || saved.length() == 0) {
            return plaintextBytes == null || plaintextBytes.isEmpty();
        } else {
```

### SizeReplaceableByIsEmpty
`trimmed.length() > 0` can be replaced with '!trimmed.isEmpty()'
in `core/src/main/java/org/apache/shiro/realm/SimpleAccountRealm.java`
#### Snippet
```java
        for (String s : rolenamesArray) {
            String trimmed = s.trim();
            if (trimmed.length() > 0) {
                values.add(trimmed);
            }
```

### SizeReplaceableByIsEmpty
`resourcePath.length() == 0` can be replaced with 'resourcePath.isEmpty()'
in `core/src/main/java/org/apache/shiro/realm/text/PropertiesRealm.java`
#### Snippet
```java

    private void loadProperties() {
        if (resourcePath == null || resourcePath.length() == 0) {
            throw new IllegalStateException("The resourcePath property is not set.  " +
                    "It must be set prior to this realm being initialized.");
```

### SizeReplaceableByIsEmpty
`resourcePath.length() == 0` can be replaced with 'resourcePath.isEmpty()'
in `core/src/main/java/org/apache/shiro/realm/text/PropertiesRealm.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    private void restart() {
        if (resourcePath == null || resourcePath.length() == 0) {
            throw new IllegalStateException("The resourcePath property is not set.  " +
                    "It must be set prior to this realm being initialized.");
```

### SizeReplaceableByIsEmpty
`in.length() == 0` can be replaced with 'in.isEmpty()'
in `lang/src/main/java/org/apache/shiro/lang/util/StringUtils.java`
#### Snippet
```java
     */
    public static String uppercaseFirstChar(String in) {
        if (in == null || in.length() == 0) {
            return in;
        }
```

### SizeReplaceableByIsEmpty
`str.length() > 0` can be replaced with '!str.isEmpty()'
in `lang/src/main/java/org/apache/shiro/lang/util/StringUtils.java`
#### Snippet
```java
     */
    public static boolean hasLength(String str) {
        return (str != null && str.length() > 0);
    }

```

### SizeReplaceableByIsEmpty
`token.length() > 0` can be replaced with '!token.isEmpty()'
in `lang/src/main/java/org/apache/shiro/lang/util/StringUtils.java`
#### Snippet
```java
                token = token.trim();
            }
            if (!ignoreEmptyTokens || token.length() > 0) {
                tokens.add(token);
            }
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `cache/src/main/java/org/apache/shiro/cache/MapCache.java`
#### Snippet
```java

    public String toString() {
        return new StringBuilder("MapCache '")
                .append(name).append("' (")
                .append(map.size())
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `core/src/main/java/org/apache/shiro/session/mgt/SimpleSession.java`
#### Snippet
```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName()).append(",id=").append(getId());
        return sb.toString();
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `core/src/main/java/org/apache/shiro/authc/credential/HashedCredentialsMatcher.java`
#### Snippet
```java
     */
    public void setHashIterations(int hashIterations) {
        if (hashIterations < 1) {
            this.hashIterations = 1;
        } else {
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `support/guice/src/main/java/org/apache/shiro/guice/web/AbstractInjectionProvider.java`
#### Snippet
```java
            t = constructor.newInstance(params);
        } catch (Exception e) {
            throw new ProvisionException("Could not instantiate " + key + "", e);
        }
        injector.injectMembers(t);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `crypto/support/hashes/bcrypt/src/main/java/org/apache/shiro/crypto/support/hashes/bcrypt/BCryptHash.java`
#### Snippet
```java
        return new StringJoiner("$", "$", "")
                .add(this.getAlgorithmName())
                .add("" + this.cost)
                .add(saltBase64 + dataBase64)
                .toString();
```

## RuleId[id=RegExpRedundantNestedCharacterClass]
### RegExpRedundantNestedCharacterClass
Redundant nested character class
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/FormResubmitSupport.java`
#### Snippet
```java
        if (referer != null) {
            // do not switch to https if custom port is specified
            if (!referer.matches("^http:\\/\\/[A-z|.|[0-9]]+:[0-9]+(\\/.*|$)")) {
                referer = referer.replaceFirst("^http:", "https:");
            }
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `SecurityUtils` has no concrete subclass
in `core/src/main/java/org/apache/shiro/SecurityUtils.java`
#### Snippet
```java
 * @since 0.2
 */
public abstract class SecurityUtils {

    /**
```

### AbstractClassNeverImplemented
Abstract class `AT` has no concrete subclass
in `support/cdi/src/main/java/org/apache/shiro/cdi/AnnotatedTypeWrapper.java`
#### Snippet
```java
public class AnnotatedTypeWrapper<T> implements AnnotatedType<T> {
    // the below is so the compiler doesn't complain about unchecked casts
    private abstract class AT implements AnnotatedType<T> { }
    private final @Delegate(types = AT.class) AnnotatedType<T> wrapped;
    private final @Getter Set<Annotation> annotations;
```

### AbstractClassNeverImplemented
Abstract class `JavaEnvironment` has no concrete subclass
in `core/src/main/java/org/apache/shiro/util/JavaEnvironment.java`
#### Snippet
```java
 */
@Deprecated
public abstract class JavaEnvironment {

    /**
```

### AbstractClassNeverImplemented
Abstract class `ThreadContext` has no concrete subclass
in `core/src/main/java/org/apache/shiro/util/ThreadContext.java`
#### Snippet
```java
 * @since 0.1
 */
public abstract class ThreadContext {

    /**
```

### AbstractClassNeverImplemented
Abstract class `LifecycleUtils` has no concrete subclass
in `lang/src/main/java/org/apache/shiro/lang/util/LifecycleUtils.java`
#### Snippet
```java
 * @since 0.2
 */
public abstract class LifecycleUtils {

    private static final Logger log = LoggerFactory.getLogger(LifecycleUtils.class);
```

### AbstractClassNeverImplemented
Abstract class `Assert` has no concrete subclass
in `lang/src/main/java/org/apache/shiro/lang/util/Assert.java`
#### Snippet
```java
 * @since 1.3
 */
public abstract class Assert {

    /**
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Filter`
in `web/src/main/java/org/apache/shiro/web/servlet/ProxiedFilterChain.java`
#### Snippet
```java
    private int index = 0;

    public ProxiedFilterChain(FilterChain orig, List<Filter> filters) {
        if (orig == null) {
            throw new NullPointerException("original FilterChain cannot be null.");
```

### BoundedWildcard
Can generalize to `? super SessionManager`
in `samples/guice/src/main/java/org/apache/shiro/samples/guice/SampleShiroNativeSessionsServletModule.java`
#### Snippet
```java

    @Override
    protected void bindSessionManager(AnnotatedBindingBuilder<SessionManager> bind) {
        bind.to(DefaultWebSessionManager.class);
        bindConstant().annotatedWith(Names.named("shiro.globalSessionTimeout")).to(5000L);
```

### BoundedWildcard
Can generalize to `? super SessionListener`
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/cdi/ShiroSessionScopeExtension.java`
#### Snippet
```java
     * @param sm
     */
    public void addSessionListeners(Collection<SessionListener> sessionListeners, SecurityManager sm) {
        sessionListeners.add(new SessionListener() {
            @Override
```

### BoundedWildcard
Can generalize to `? super Class`
in `support/guice/src/main/java/org/apache/shiro/guice/ShiroMatchers.java`
#### Snippet
```java
    };

    public static Matcher<TypeLiteral> typeLiteral(final Matcher<Class> classMatcher) {
        return new AbstractMatcher<TypeLiteral>() {

```

### BoundedWildcard
Can generalize to `? super Environment`
in `support/guice/src/main/java/org/apache/shiro/guice/ShiroModule.java`
#### Snippet
```java
     * @param bind
     */
    protected void bindEnvironment(AnnotatedBindingBuilder<Environment> bind) {
        bind.to(GuiceEnvironment.class).asEagerSingleton();
    }
```

### BoundedWildcard
Can generalize to `? super EventBus`
in `support/guice/src/main/java/org/apache/shiro/guice/ShiroModule.java`
#### Snippet
```java
     * @since 1.4
     */
    protected void bindEventBus(AnnotatedBindingBuilder<EventBus> bind) {
        bind.to(DefaultEventBus.class).asEagerSingleton();
    }
```

### BoundedWildcard
Can generalize to `? super SessionManager`
in `support/guice/src/main/java/org/apache/shiro/guice/ShiroModule.java`
#### Snippet
```java
     * @param bind
     */
    protected void bindSessionManager(AnnotatedBindingBuilder<SessionManager> bind) {
        bind.to(DefaultSessionManager.class).asEagerSingleton();
    }
```

### BoundedWildcard
Can generalize to `? extends javax.cache.Cache.Entry`
in `support/jcache/src/main/java/org/apache/shiro/cache/jcache/JCacheManager.java`
#### Snippet
```java
        }

        private Stream<javax.cache.Cache.Entry<K, V>> toStream(Iterator<javax.cache.Cache.Entry<K, V>> iterator) {
            return StreamSupport.stream(Spliterators.spliteratorUnknownSize(iterator, Spliterator.ORDERED), false);
        }
```

### BoundedWildcard
Can generalize to `? extends T`
in `integration-tests/jakarta-ee/src/main/java/org/apache/shiro/testing/jaxrs/WhoamiResource.java`
#### Snippet
```java
    }

    private <T> T check(Supplier<T> happy, Supplier<T> sad, String user, String password) {
        try {
            ThreadContext.bind(testApplication.getSecurityManager());
```

### BoundedWildcard
Can generalize to `? extends T`
in `integration-tests/jakarta-ee/src/main/java/org/apache/shiro/testing/jaxrs/WhoamiResource.java`
#### Snippet
```java
    }

    private <T> T check(Supplier<T> happy, Supplier<T> sad, String user, String password) {
        try {
            ThreadContext.bind(testApplication.getSecurityManager());
```

### BoundedWildcard
Can generalize to `? super Annotation`
in `support/cdi/src/main/java/org/apache/shiro/cdi/AnnotatedTypeWrapper.java`
#### Snippet
```java
    }

    private void addToBuilder(Stream.Builder<Annotation> builder, Annotation ann) {
        checkIfAnnotation(ann);
        builder.add(ann);
```

### BoundedWildcard
Can generalize to `? super Realm`
in `core/src/main/java/org/apache/shiro/ini/IniSecurityManagerFactory.java`
#### Snippet
```java
    }

    private void addToRealms(Collection<Realm> realms, RealmFactory factory) {
        LifecycleUtils.init(factory);
        Collection<Realm> factoryRealms = factory.getRealms();
```

### BoundedWildcard
Can generalize to `? extends Realm`
in `core/src/main/java/org/apache/shiro/authc/pam/ModularRealmAuthenticator.java`
#### Snippet
```java
     *         consulted realms.
     */
    protected AuthenticationInfo doMultiRealmAuthentication(Collection<Realm> realms, AuthenticationToken token) {

        AuthenticationStrategy strategy = getAuthenticationStrategy();
```

### BoundedWildcard
Can generalize to `? super String`
in `config/ogdl/src/main/java/org/apache/shiro/config/ogdl/ReflectionBuilder.java`
#### Snippet
```java
    }

    protected void createNewInstance(Map<String, Object> objects, String name, String value) {

        Object currentInstance = objects.get(name);
```

### BoundedWildcard
Can generalize to `? super String`
in `config/ogdl/src/main/java/org/apache/shiro/config/ogdl/ReflectionBuilder.java`
#### Snippet
```java
     * @since 2.0
     */
    public void setAlternateObjectSupplier(Function<String, ?> alternateObjectSupplier) {
        this.alternateObjectSupplier = alternateObjectSupplier;
    }
```

### BoundedWildcard
Can generalize to `? super SessionManager`
in `support/guice/src/main/java/org/apache/shiro/guice/web/ShiroWebModule.java`
#### Snippet
```java
     */
    @Override
    protected void bindSessionManager(AnnotatedBindingBuilder<SessionManager> bind) {
        bind.to(ServletContainerSessionManager.class).asEagerSingleton();
    }
```

### BoundedWildcard
Can generalize to `? super Environment`
in `support/guice/src/main/java/org/apache/shiro/guice/web/ShiroWebModule.java`
#### Snippet
```java

    @Override
    protected final void bindEnvironment(AnnotatedBindingBuilder<Environment> bind) {
        bind.to(WebEnvironment.class); // SHIRO-435
    }
```

### BoundedWildcard
Can generalize to `? extends Permission`
in `core/src/main/java/org/apache/shiro/authz/SimpleAuthorizationInfo.java`
#### Snippet
```java
     * @param permissions the permissions to add to those associated directly with the account.
     */
    public void addObjectPermissions(Collection<Permission> permissions) {
        if (this.objectPermissions == null) {
            this.objectPermissions = new HashSet<Permission>();
```

### BoundedWildcard
Can generalize to `? extends Permission`
in `core/src/main/java/org/apache/shiro/authz/SimpleRole.java`
#### Snippet
```java
    }

    public void addAll(Collection<Permission> perms) {
        if (perms != null && !perms.isEmpty()) {
            Set<Permission> permissions = getPermissions();
```

### BoundedWildcard
Can generalize to `? extends Permission`
in `core/src/main/java/org/apache/shiro/authz/ModularRealmAuthorizer.java`
#### Snippet
```java
     * <code>false</code> otherwise.
     */
    public boolean[] isPermitted(PrincipalCollection principals, List<Permission> permissions) {
        assertRealmsConfigured();
        if (permissions != null && !permissions.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends Permission`
in `core/src/main/java/org/apache/shiro/authz/ModularRealmAuthorizer.java`
#### Snippet
```java
     * for <em>all</em> of the specified Permissions, <code>false</code> otherwise.
     */
    public boolean isPermittedAll(PrincipalCollection principals, Collection<Permission> permissions) {
        assertRealmsConfigured();
        if (permissions != null && !permissions.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends Permission`
in `core/src/main/java/org/apache/shiro/authz/ModularRealmAuthorizer.java`
#### Snippet
```java
     * an <code>UnauthorizedException</code> otherwise returns quietly.
     */
    public void checkPermissions(PrincipalCollection principals, Collection<Permission> permissions) throws AuthorizationException {
        assertRealmsConfigured();
        if (permissions != null) {
```

### BoundedWildcard
Can generalize to `? super Serializable`
in `core/src/main/java/org/apache/shiro/session/mgt/eis/CachingSessionDAO.java`
#### Snippet
```java
     * @param cache     the cache to store the session
     */
    protected void cache(Session session, Serializable sessionId, Cache<Serializable, Session> cache) {
        cache.put(sessionId, session);
    }
```

### BoundedWildcard
Can generalize to `? super Session`
in `core/src/main/java/org/apache/shiro/session/mgt/eis/CachingSessionDAO.java`
#### Snippet
```java
     * @param cache     the cache to store the session
     */
    protected void cache(Session session, Serializable sessionId, Cache<Serializable, Session> cache) {
        cache.put(sessionId, session);
    }
```

### BoundedWildcard
Can generalize to `? super Serializable`
in `core/src/main/java/org/apache/shiro/session/mgt/eis/CachingSessionDAO.java`
#### Snippet
```java
     * @return the cached session, or {@code null} if the session wasn't in the cache.
     */
    protected Session getCachedSession(Serializable sessionId, Cache<Serializable, Session> cache) {
        return cache.get(sessionId);
    }
```

### BoundedWildcard
Can generalize to `? extends Session`
in `core/src/main/java/org/apache/shiro/session/mgt/eis/CachingSessionDAO.java`
#### Snippet
```java
     * @return the cached session, or {@code null} if the session wasn't in the cache.
     */
    protected Session getCachedSession(Serializable sessionId, Cache<Serializable, Session> cache) {
        return cache.get(sessionId);
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/src/main/java/org/apache/shiro/subject/SimplePrincipalMap.java`
#### Snippet
```java
    }

    public <T> Collection<T> byType(Class<T> type) {
        if (CollectionUtils.isEmpty(this.combinedPrincipals)) {
            return Collections.emptySet();
```

### BoundedWildcard
Can generalize to `? extends V`
in `core/src/main/java/org/apache/shiro/subject/support/SubjectCallable.java`
#### Snippet
```java
    }

    protected V doCall(Callable<V> target) throws Exception {
        return target.call();
    }
```

### BoundedWildcard
Can generalize to `? extends K`
in `lang/src/main/java/org/apache/shiro/lang/util/SoftHashMap.java`
#### Snippet
```java
     *                      (retained), preventing them from being eagerly garbage collected by the JVM.
     */
    public SoftHashMap(Map<K, V> source, int retentionSize) {
        this(retentionSize);
        putAll(source);
```

### BoundedWildcard
Can generalize to `? extends V`
in `lang/src/main/java/org/apache/shiro/lang/util/SoftHashMap.java`
#### Snippet
```java
     *                      (retained), preventing them from being eagerly garbage collected by the JVM.
     */
    public SoftHashMap(Map<K, V> source, int retentionSize) {
        this(retentionSize);
        putAll(source);
```

### BoundedWildcard
Can generalize to `? extends K`
in `lang/src/main/java/org/apache/shiro/lang/util/SoftHashMap.java`
#### Snippet
```java
     * @see #SoftHashMap(Map,int)
     */
    public SoftHashMap(Map<K, V> source) {
        this(DEFAULT_RETENTION_SIZE);
        putAll(source);
```

### BoundedWildcard
Can generalize to `? extends V`
in `lang/src/main/java/org/apache/shiro/lang/util/SoftHashMap.java`
#### Snippet
```java
     * @see #SoftHashMap(Map,int)
     */
    public SoftHashMap(Map<K, V> source) {
        this(DEFAULT_RETENTION_SIZE);
        putAll(source);
```

### BoundedWildcard
Can generalize to `? extends Permission`
in `core/src/main/java/org/apache/shiro/realm/AuthorizingRealm.java`
#### Snippet
```java
    }

    protected boolean isPermittedAll(Collection<Permission> permissions, AuthorizationInfo info) {
        if (permissions != null && !permissions.isEmpty()) {
            for (Permission p : permissions) {
```

### BoundedWildcard
Can generalize to `? extends Permission`
in `core/src/main/java/org/apache/shiro/realm/AuthorizingRealm.java`
#### Snippet
```java
    }

    protected boolean[] isPermitted(List<Permission> permissions, AuthorizationInfo info) {
        boolean[] result;
        if (permissions != null && !permissions.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends Permission`
in `core/src/main/java/org/apache/shiro/realm/AuthorizingRealm.java`
#### Snippet
```java
    }

    protected void checkPermissions(Collection<Permission> permissions, AuthorizationInfo info) {
        if (permissions != null && !permissions.isEmpty()) {
            for (Permission p : permissions) {
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `transient final`
in `samples/spring-mvc/src/main/java/org/apache/shiro/samples/spring/web/LoginController.java`
#### Snippet
```java
public class LoginController {

    private static transient final Logger log = LoggerFactory.getLogger(LoginController.class);

    private static String loginView = "login";
```

### MissortedModifiers
Missorted modifiers `transient final`
in `web/src/main/java/org/apache/shiro/web/mgt/CookieRememberMeManager.java`
#### Snippet
```java
    //TODO - complete JavaDoc

    private static transient final Logger log = LoggerFactory.getLogger(CookieRememberMeManager.class);

    /**
```

### MissortedModifiers
Missorted modifiers `transient final`
in `web/src/main/java/org/apache/shiro/web/filter/mgt/PathMatchingFilterChainResolver.java`
#### Snippet
```java
public class PathMatchingFilterChainResolver implements FilterChainResolver {

    private static transient final Logger log = LoggerFactory.getLogger(PathMatchingFilterChainResolver.class);

    private FilterChainManager filterChainManager;
```

### MissortedModifiers
Missorted modifiers `transient final`
in `web/src/main/java/org/apache/shiro/web/config/IniFilterChainResolverFactory.java`
#### Snippet
```java
    public static final String URLS = "urls";

    private static transient final Logger log = LoggerFactory.getLogger(IniFilterChainResolverFactory.class);

    private FilterConfig filterConfig;
```

### MissortedModifiers
Missorted modifiers `transient final`
in `web/src/main/java/org/apache/shiro/web/filter/mgt/DefaultFilterChainManager.java`
#### Snippet
```java
public class DefaultFilterChainManager implements FilterChainManager {

    private static transient final Logger log = LoggerFactory.getLogger(DefaultFilterChainManager.class);

    private FilterConfig filterConfig;
```

### MissortedModifiers
Missorted modifiers `transient final`
in `web/src/main/java/org/apache/shiro/web/servlet/AbstractFilter.java`
#### Snippet
```java
public abstract class AbstractFilter extends ServletContextSupport implements Filter {

    private static transient final Logger log = LoggerFactory.getLogger(AbstractFilter.class);

    /**
```

### MissortedModifiers
Missorted modifiers `final private`
in `support/jaxrs/src/main/java/org/apache/shiro/web/jaxrs/ShiroSecurityContext.java`
#### Snippet
```java
public class ShiroSecurityContext implements SecurityContext {

    final private ContainerRequestContext containerRequestContext;
    final private SecurityContext originalSecurityContext;

```

### MissortedModifiers
Missorted modifiers `final private`
in `support/jaxrs/src/main/java/org/apache/shiro/web/jaxrs/ShiroSecurityContext.java`
#### Snippet
```java

    final private ContainerRequestContext containerRequestContext;
    final private SecurityContext originalSecurityContext;

    public ShiroSecurityContext(ContainerRequestContext containerRequestContext) {
```

### MissortedModifiers
Missorted modifiers `private final @Delegate`
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/PassThruAuthenticationFilter.java`
#### Snippet
```java
@Slf4j
public class PassThruAuthenticationFilter extends org.apache.shiro.web.filter.authc.PassThruAuthenticationFilter {
    private final @Delegate AuthenticationFilterDelegate delegate;

    private class Methods implements MethodsFromFilter {
```

### MissortedModifiers
Missorted modifiers `private @Getter @Setter`
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/AuthenticationFilterDelegate.java`
#### Snippet
```java
     */
    private @Getter @Setter int loginFailedWaitTime;
    private @Getter @Setter FallbackPredicate loginFallbackType = NO_PREDICATE;
    private @Getter @Setter FallbackPredicate logoutFallbackType = YES_PREDICATE;

```

### MissortedModifiers
Missorted modifiers `private @Getter @Setter`
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/AuthenticationFilterDelegate.java`
#### Snippet
```java
    private @Getter @Setter int loginFailedWaitTime;
    private @Getter @Setter FallbackPredicate loginFallbackType = NO_PREDICATE;
    private @Getter @Setter FallbackPredicate logoutFallbackType = YES_PREDICATE;

    public boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {
```

### MissortedModifiers
Missorted modifiers `private @Getter @Setter`
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/AuthenticationFilterDelegate.java`
#### Snippet
```java
     * true if rememberMe cookie is set and valid
     */
    private @Getter @Setter boolean useRemembered;
    /**
     * number of seconds to sleep if authentication fails
```

### MissortedModifiers
Missorted modifiers `private @Getter @Setter`
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/AuthenticationFilterDelegate.java`
#### Snippet
```java
     * number of seconds to sleep if authentication fails
     */
    private @Getter @Setter int loginFailedWaitTime;
    private @Getter @Setter FallbackPredicate loginFallbackType = NO_PREDICATE;
    private @Getter @Setter FallbackPredicate logoutFallbackType = YES_PREDICATE;
```

### MissortedModifiers
Missorted modifiers `private final @Delegate`
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/LogoutFilter.java`
#### Snippet
```java
    static final FallbackPredicate YES_PREDICATE = createPredicate();
    static final String LOGOUT_PREDICATE_ATTR_NAME = "org.apache.shiro.ee.logout-predicate";
    private final @Delegate AuthenticationFilterDelegate delegate;

    private class Methods implements MethodsFromFilter {
```

### MissortedModifiers
Missorted modifiers `private final @Delegate`
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/FormAuthenticationFilter.java`
#### Snippet
```java
    static final String LOGIN_URL_ATTR_NAME = "org.apache.shiro.ee.login-url";
    static final FallbackPredicate NO_PREDICATE = (path, request) -> false;
    private final @Delegate AuthenticationFilterDelegate delegate;

    private class Methods implements MethodsFromFilter {
```

### MissortedModifiers
Missorted modifiers `transient final`
in `config/core/src/main/java/org/apache/shiro/config/Ini.java`
#### Snippet
```java
public class Ini implements Map<String, Ini.Section> {

    private static transient final Logger log = LoggerFactory.getLogger(Ini.class);

    public static final String DEFAULT_SECTION_NAME = ""; //empty string means the first unnamed section
```

### MissortedModifiers
Missorted modifiers `final @Delegate`
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/ShiroFilter.java`
#### Snippet
```java
    @RequiredArgsConstructor
    static class WrappedSecurityManager implements WebSecurityManager {
        final @Delegate WebSecurityManager wrapped;

        @Override
```

### MissortedModifiers
Missorted modifiers `final private`
in `support/spring/src/main/java/org/apache/shiro/spring/ShiroEventBusBeanPostProcessor.java`
#### Snippet
```java
public class ShiroEventBusBeanPostProcessor implements BeanPostProcessor {

    final private EventBus eventBus;

    public ShiroEventBusBeanPostProcessor(EventBus eventBus) {
```

### MissortedModifiers
Missorted modifiers `final private`
in `support/spring/src/main/java/org/apache/shiro/spring/web/config/DefaultShiroFilterChainDefinition.java`
#### Snippet
```java
public class DefaultShiroFilterChainDefinition implements ShiroFilterChainDefinition {

    final private Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();

    public void addPathDefinition(String antPath, String definition) {
```

### MissortedModifiers
Missorted modifiers `final private`
in `config/ogdl/src/main/java/org/apache/shiro/config/ogdl/CommonsInterpolator.java`
#### Snippet
```java
public class CommonsInterpolator implements Interpolator {

    final private ConfigurationInterpolator interpolator;

    public CommonsInterpolator() {
```

### MissortedModifiers
Missorted modifiers `private @Getter`
in `integration-tests/jakarta-ee/src/main/java/org/apache/shiro/testing/jaxrs/TestApplication.java`
#### Snippet
```java
@ApplicationScoped
public class TestApplication extends Application {
    private @Getter DefaultSecurityManager securityManager;

    void configureSecurityManager(@Observes @Initialized(ApplicationScoped.class) Object nothing) {
```

### MissortedModifiers
Missorted modifiers `transient final`
in `support/spring/src/main/java/org/apache/shiro/spring/web/ShiroFilterFactoryBean.java`
#### Snippet
```java
public class ShiroFilterFactoryBean implements FactoryBean, BeanPostProcessor {

    private static transient final Logger log = LoggerFactory.getLogger(ShiroFilterFactoryBean.class);

    private SecurityManager securityManager;
```

### MissortedModifiers
Missorted modifiers `private final @Getter`
in `support/cdi/src/main/java/org/apache/shiro/cdi/AopHelper.java`
#### Snippet
```java
    static class SecurityInterceptor {
        private final AuthorizingAnnotationHandler handler;
        private final @Getter Annotation annotation;

        /**
```

### MissortedModifiers
Missorted modifiers `private final @Delegate(types = AT.class)`
in `support/cdi/src/main/java/org/apache/shiro/cdi/AnnotatedTypeWrapper.java`
#### Snippet
```java
    // the below is so the compiler doesn't complain about unchecked casts
    private abstract class AT implements AnnotatedType<T> { }
    private final @Delegate(types = AT.class) AnnotatedType<T> wrapped;
    private final @Getter Set<Annotation> annotations;

```

### MissortedModifiers
Missorted modifiers `private final @Getter`
in `support/cdi/src/main/java/org/apache/shiro/cdi/AnnotatedTypeWrapper.java`
#### Snippet
```java
    private abstract class AT implements AnnotatedType<T> { }
    private final @Delegate(types = AT.class) AnnotatedType<T> wrapped;
    private final @Getter Set<Annotation> annotations;


```

### MissortedModifiers
Missorted modifiers `transient final`
in `core/src/main/java/org/apache/shiro/ini/IniSecurityManagerFactory.java`
#### Snippet
```java
    public static final String INI_REALM_NAME = "iniRealm";

    private static transient final Logger log = LoggerFactory.getLogger(IniSecurityManagerFactory.class);

    private ReflectionBuilder builder;
```

### MissortedModifiers
Missorted modifiers `transient final`
in `core/src/main/java/org/apache/shiro/ini/IniFactorySupport.java`
#### Snippet
```java
    public static final String DEFAULT_INI_RESOURCE_PATH = "classpath:shiro.ini";

    private static transient final Logger log = LoggerFactory.getLogger(IniFactorySupport.class);

    private Ini ini;
```

### MissortedModifiers
Missorted modifiers `transient final`
in `core/src/main/java/org/apache/shiro/realm/text/IniRealm.java`
#### Snippet
```java
    public static final String ROLES_SECTION_NAME = "roles";

    private static transient final Logger log = LoggerFactory.getLogger(IniRealm.class);

    private String resourcePath;
```

### MissortedModifiers
Missorted modifiers `transient static final`
in `core/src/main/java/org/apache/shiro/session/mgt/SimpleSession.java`
#### Snippet
```java

    //TODO - complete JavaDoc
    private transient static final Logger log = LoggerFactory.getLogger(SimpleSession.class);

    protected static final long MILLIS_PER_SECOND = 1000;
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `lang/src/main/java/org/apache/shiro/lang/util/ClassUtils.java`
#### Snippet
```java
     * @since 1.0
     */
    private static abstract class ExceptionIgnoringAccessor implements ClassLoaderAccessor {

        public Class loadClass(String fqcn) {
```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `web/src/main/java/org/apache/shiro/web/subject/WebSubject.java`
#### Snippet
```java
     * is retained for use by internal Shiro components as necessary.
     */
    public static class Builder extends Subject.Builder {

        /**
```

### ClassNameSameAsAncestorName
Class name `SslFilter` is the same as one of its superclass' names
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/SslFilter.java`
#### Snippet
```java
 * depending on whether in Faces production mode or not
 */
public class SslFilter extends org.apache.shiro.web.filter.authz.SslFilter {
    @Getter @Setter
    private boolean enablePortFilter = true;
```

### ClassNameSameAsAncestorName
Class name `PassThruAuthenticationFilter` is the same as one of its superclass' names
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/PassThruAuthenticationFilter.java`
#### Snippet
```java
 */
@Slf4j
public class PassThruAuthenticationFilter extends org.apache.shiro.web.filter.authc.PassThruAuthenticationFilter {
    private final @Delegate AuthenticationFilterDelegate delegate;

```

### ClassNameSameAsAncestorName
Class name `LogoutFilter` is the same as one of its superclass' names
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/LogoutFilter.java`
#### Snippet
```java
 * JSF Ajax support for logout
 */
public class LogoutFilter extends org.apache.shiro.web.filter.authc.LogoutFilter {
    static final FallbackPredicate YES_PREDICATE = createPredicate();
    static final String LOGOUT_PREDICATE_ATTR_NAME = "org.apache.shiro.ee.logout-predicate";
```

### ClassNameSameAsAncestorName
Class name `FormAuthenticationFilter` is the same as one of its superclass' names
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/FormAuthenticationFilter.java`
#### Snippet
```java
 * Implements form resubmit and auto remember-me functionality
 */
public class FormAuthenticationFilter extends org.apache.shiro.web.filter.authc.FormAuthenticationFilter {
    static final String LOGIN_PREDICATE_ATTR_NAME = "org.apache.shiro.ee.login-predicate";
    static final String LOGIN_WAITTIME_ATTR_NAME = "org.apache.shiro.ee.login-wait-time";
```

### ClassNameSameAsAncestorName
Class name `ShiroFilter` is the same as one of its superclass' names
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/ShiroFilter.java`
#### Snippet
```java
            DispatcherType.INCLUDE, DispatcherType.REQUEST,
            DispatcherType.ASYNC }, asyncSupported = true)
public class ShiroFilter extends org.apache.shiro.web.servlet.ShiroFilter {
    private static final String X_FORWARDED_PROTO = "X-Forwarded-Proto";
    private static final Pattern HTTP_TO_HTTPS = Pattern.compile("^\\s*http(.*)");
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `samples/spring-hibernate/src/main/java/org/apache/shiro/samples/sprhib/model/Role.java`
#### Snippet
```java

    @Basic(optional=false)
    @Column(length=255)
    public String getDescription() {
        return description;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `samples/spring-hibernate/src/main/java/org/apache/shiro/samples/sprhib/model/User.java`
#### Snippet
```java
     */
    @Basic(optional=false)
    @Column(length=255)
    public String getPassword() {
        return password;
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `getDigest()` is identical to its super method
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/SimpleHash.java`
#### Snippet
```java
     */
    @Override
    protected MessageDigest getDigest(String algorithmName) throws UnknownAlgorithmException {
        try {
            return MessageDigest.getInstance(algorithmName);
```

### RedundantMethodOverride
Method `configure()` only delegates to its super method
in `integration-tests/jaxrs/app/src/main/java/org/apache/shiro/testing/jaxrs/app/config/JaxRsShiroFeature.java`
#### Snippet
```java

    @Override
    public boolean configure(FeatureContext context) {
        return super.configure(context);
    }
```

## RuleId[id=RegExpDuplicateCharacterInClass]
### RegExpDuplicateCharacterInClass
Duplicate character '\|' inside character class
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/FormResubmitSupport.java`
#### Snippet
```java
        if (referer != null) {
            // do not switch to https if custom port is specified
            if (!referer.matches("^http:\\/\\/[A-z|.|[0-9]]+:[0-9]+(\\/.*|$)")) {
                referer = referer.replaceFirst("^http:", "https:");
            }
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `crypto/support/hashes/bcrypt/src/main/java/org/apache/shiro/crypto/support/hashes/bcrypt/BCryptProvider.java`
#### Snippet
```java
                    .map(obj -> (String) obj);

            if (!optCostStr.isPresent()) {
                return BCryptHash.DEFAULT_COST;
            }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `crypto/support/hashes/bcrypt/src/main/java/org/apache/shiro/crypto/support/hashes/bcrypt/BCryptProvider.java`
#### Snippet
```java
                    .map(obj -> (String) obj);

            if (!optSaltBase64.isPresent()) {
                return BCryptHash.createSalt(random);
            }
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/DefaultBlockCipherService.java`
#### Snippet
```java
    @Override
    protected boolean isGenerateInitializationVectors(boolean streaming) {
        return streaming || super.isGenerateInitializationVectors() && isModeInitializationVectorCompatible(getModeName());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `web/src/main/java/org/apache/shiro/web/subject/WebSubject.java`
#### Snippet
```java
         */
        public WebSubject buildWebSubject() {
            Subject subject = super.buildSubject();
            if (!(subject instanceof WebSubject)) {
                String msg = "Subject implementation returned from the SecurityManager was not a " +
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `support/aspectj/src/main/java/org/apache/shiro/aspectj/AspectjAnnotationsAuthorizingMethodInterceptor.java`
#### Snippet
```java

        // 2. Delegate the authorization of the method call to the super class
        super.invoke(mi);
    }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/listeners/IniEnvironment.java`
#### Snippet
```java
        if (configLocations.length == 2) {
            otherConfigLocation = configLocations[1];
            super.setConfigLocations(configLocations[0]);
        } else {
            super.setConfigLocations(configLocations);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/ShiroFilter.java`
#### Snippet
```java
        super.init();
        try {
            addScopeSessionListeners(super.getSecurityManager());
        } catch (Throwable e) {
            log.warn("Unable to add scope session listeners", e);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `support/spring/src/main/java/org/apache/shiro/spring/security/interceptor/AopAllianceAnnotationsAuthorizingMethodInterceptor.java`
#### Snippet
```java
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        org.apache.shiro.aop.MethodInvocation mi = createMethodInvocation(methodInvocation);
        return super.invoke(mi);
    }
}
```

## RuleId[id=SlowListContainsAll]
### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `web/src/main/java/org/apache/shiro/web/filter/mgt/SimpleNamedFilterList.java`
#### Snippet
```java

    public boolean containsAll(Collection<?> c) {
        return this.backingList.containsAll(c);
    }

```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import org.apache.shiro.crypto.hash.AbstractHash;`
in `core/src/main/java/org/apache/shiro/authc/credential/Sha256CredentialsMatcher.java`
#### Snippet
```java
package org.apache.shiro.authc.credential;

import org.apache.shiro.crypto.hash.AbstractHash;
import org.apache.shiro.crypto.hash.Hash;
import org.apache.shiro.crypto.hash.Sha256Hash;
```

### UNUSED_IMPORT
Unused import `import org.apache.shiro.crypto.hash.Hash;`
in `core/src/main/java/org/apache/shiro/authc/credential/Sha256CredentialsMatcher.java`
#### Snippet
```java

import org.apache.shiro.crypto.hash.AbstractHash;
import org.apache.shiro.crypto.hash.Hash;
import org.apache.shiro.crypto.hash.Sha256Hash;

```

### UNUSED_IMPORT
Unused import `import org.apache.shiro.crypto.hash.AbstractHash;`
in `core/src/main/java/org/apache/shiro/authc/credential/Sha384CredentialsMatcher.java`
#### Snippet
```java
package org.apache.shiro.authc.credential;

import org.apache.shiro.crypto.hash.AbstractHash;
import org.apache.shiro.crypto.hash.Hash;
import org.apache.shiro.crypto.hash.Sha384Hash;
```

### UNUSED_IMPORT
Unused import `import org.apache.shiro.crypto.hash.Hash;`
in `core/src/main/java/org/apache/shiro/authc/credential/Sha384CredentialsMatcher.java`
#### Snippet
```java

import org.apache.shiro.crypto.hash.AbstractHash;
import org.apache.shiro.crypto.hash.Hash;
import org.apache.shiro.crypto.hash.Sha384Hash;

```

### UNUSED_IMPORT
Unused import `import org.apache.shiro.crypto.hash.AbstractHash;`
in `core/src/main/java/org/apache/shiro/authc/credential/Sha512CredentialsMatcher.java`
#### Snippet
```java
package org.apache.shiro.authc.credential;

import org.apache.shiro.crypto.hash.AbstractHash;
import org.apache.shiro.crypto.hash.Hash;
import org.apache.shiro.crypto.hash.Sha512Hash;
```

### UNUSED_IMPORT
Unused import `import org.apache.shiro.crypto.hash.Hash;`
in `core/src/main/java/org/apache/shiro/authc/credential/Sha512CredentialsMatcher.java`
#### Snippet
```java

import org.apache.shiro.crypto.hash.AbstractHash;
import org.apache.shiro.crypto.hash.Hash;
import org.apache.shiro.crypto.hash.Sha512Hash;

```

### UNUSED_IMPORT
Unused import `import java.lang.annotation.ElementType;`
in `core/src/main/java/org/apache/shiro/authz/annotation/package-info.java`
#### Snippet
```java
 */
package org.apache.shiro.authz.annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

```

### UNUSED_IMPORT
Unused import `import java.lang.annotation.Target;`
in `core/src/main/java/org/apache/shiro/authz/annotation/package-info.java`
#### Snippet
```java
package org.apache.shiro.authz.annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;


```

### UNUSED_IMPORT
Unused import `import org.apache.shiro.authz.annotation.RequiresRoles;`
in `core/src/main/java/org/apache/shiro/authz/aop/PermissionAnnotationHandler.java`
#### Snippet
```java
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;

```

### UNUSED_IMPORT
Unused import `import org.apache.shiro.cache.CacheManager;`
in `samples/spring-mvc/src/main/java/org/apache/shiro/samples/spring/config/ApplicationConfig.java`
#### Snippet
```java

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.mgt.SecurityManager;
```

### UNUSED_IMPORT
Unused import `import static org.apache.shiro.web.filter.mgt.DefaultFilter.anon;`
in `samples/spring-mvc/src/main/java/org/apache/shiro/samples/spring/config/ApplicationConfig.java`
#### Snippet
```java
import javax.sql.DataSource;

import static org.apache.shiro.web.filter.mgt.DefaultFilter.anon;

/**
```

### UNUSED_IMPORT
Unused import `import javax.annotation.Resource;`
in `samples/spring-mvc/src/main/java/org/apache/shiro/samples/spring/web/JnlpController.java`
#### Snippet
```java
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
```

### UNUSED_IMPORT
Unused import `import org.springframework.beans.factory.annotation.Autowired;`
in `support/spring/src/main/java/org/apache/shiro/spring/config/AbstractShiroBeanConfiguration.java`
#### Snippet
```java
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.ShiroEventBusBeanPostProcessor;
import org.springframework.beans.factory.annotation.Autowired;

/**
```

### UNUSED_IMPORT
Unused import `import org.apache.shiro.event.EventBus;`
in `support/spring/src/main/java/org/apache/shiro/spring/config/ShiroConfiguration.java`
#### Snippet
```java
import org.apache.shiro.authc.pam.AuthenticationStrategy;
import org.apache.shiro.authz.Authorizer;
import org.apache.shiro.event.EventBus;
import org.apache.shiro.mgt.*;
import org.apache.shiro.realm.Realm;
```

### UNUSED_IMPORT
Unused import `import org.springframework.context.annotation.DependsOn;`
in `support/spring/src/main/java/org/apache/shiro/spring/web/config/ShiroWebConfiguration.java`
#### Snippet
```java
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import java.util.List;
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`word = word << 12` could be simplified to 'word \<\<= 12'
in `crypto/support/hashes/bcrypt/src/main/java/org/apache/shiro/crypto/support/hashes/bcrypt/OpenBSDBase64.java`
#### Snippet
```java
            } else if (lastWordChars == 2) {
                // We read 2 chars followed by "==". Emit 1 byte with 8 of those 12 bits.
                word = word << 12;
                out[outCount++] = (byte) (word >> 16);
            } else if (lastWordChars == 3) {
```

### ReplaceAssignmentWithOperatorAssignment
`word = word << 6` could be simplified to 'word \<\<= 6'
in `crypto/support/hashes/bcrypt/src/main/java/org/apache/shiro/crypto/support/hashes/bcrypt/OpenBSDBase64.java`
#### Snippet
```java
            } else if (lastWordChars == 3) {
                // We read 3 chars, followed by "=". Emit 2 bytes for 16 of those 18 bits.
                word = word << 6;
                out[outCount++] = (byte) (word >> 16);
                out[outCount++] = (byte) (word >> 8);
```

### ReplaceAssignmentWithOperatorAssignment
`f = f | toDigit(data[j], j)` could be simplified to 'f \|= toDigit(data\[j\], j)'
in `lang/src/main/java/org/apache/shiro/lang/codec/Hex.java`
#### Snippet
```java
            int f = toDigit(data[j], j) << 4;
            j++;
            f = f | toDigit(data[j], j);
            j++;
            out[i] = (byte) (f & 0xFF);
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/JcaCipherService.java`
#### Snippet
```java
        int bytesRead;
        try {
            while ((bytesRead = cis.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/shiro/util/AntPathMatcher.java`
#### Snippet
```java

        // Process characters before first star
        while ((ch = patArr[patIdxStart]) != '*' && strIdxStart <= strIdxEnd) {
            if (ch != '?') {
                if (ch != strArr[strIdxStart]) {
```

### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/shiro/util/AntPathMatcher.java`
#### Snippet
```java

        // Process characters after last star
        while ((ch = patArr[patIdxEnd]) != '*' && strIdxStart <= strIdxEnd) {
            if (ch != '?') {
                if (ch != strArr[strIdxEnd]) {
```

### NestedAssignment
Result of assignment expression used
in `lang/src/main/java/org/apache/shiro/lang/codec/CodecSupport.java`
#### Snippet
```java
        int bytesRead;
        try {
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
```

### NestedAssignment
Result of assignment expression used
in `lang/src/main/java/org/apache/shiro/lang/util/SoftHashMap.java`
#### Snippet
```java
    private void processQueue() {
        SoftValue sv;
        while ((sv = (SoftValue) queue.poll()) != null) {
            //noinspection SuspiciousMethodCalls
            map.remove(sv.key); // we can access private data!
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `destroyed` is accessed in both synchronized and unsynchronized contexts
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/SimpleByteSourceBroker.java`
#### Snippet
```java
    private byte[] ciphertext;
    private byte[] key;
    private boolean destroyed = false;

    public SimpleByteSourceBroker(JcaCipherService cipherService, byte[] ciphertext, byte[] key) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `key` is accessed in both synchronized and unsynchronized contexts
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/SimpleByteSourceBroker.java`
#### Snippet
```java
    private JcaCipherService cipherService;
    private byte[] ciphertext;
    private byte[] key;
    private boolean destroyed = false;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `ciphertext` is accessed in both synchronized and unsynchronized contexts
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/SimpleByteSourceBroker.java`
#### Snippet
```java
public class SimpleByteSourceBroker implements ByteSourceBroker, Destroyable {
    private JcaCipherService cipherService;
    private byte[] ciphertext;
    private byte[] key;
    private boolean destroyed = false;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `cipherService` is accessed in both synchronized and unsynchronized contexts
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/SimpleByteSourceBroker.java`
#### Snippet
```java
 */
public class SimpleByteSourceBroker implements ByteSourceBroker, Destroyable {
    private JcaCipherService cipherService;
    private byte[] ciphertext;
    private byte[] key;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `_bankService` is accessed in both synchronized and unsynchronized contexts
in `samples/aspectj/src/main/java/org/apache/shiro/samples/aspectj/bank/BankServerRunner.java`
#### Snippet
```java
public class BankServerRunner {

    private SecureBankService _bankService;

    public synchronized void start() throws Exception {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `_id` is accessed in both synchronized and unsynchronized contexts
in `samples/aspectj/src/main/java/org/apache/shiro/samples/aspectj/bank/Account.java`
#### Snippet
```java
    private static long _SEQUENCE;

    private long _id;

    private String _ownerName;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `_balance` is accessed in both synchronized and unsynchronized contexts
in `samples/aspectj/src/main/java/org/apache/shiro/samples/aspectj/bank/Account.java`
#### Snippet
```java
    private volatile boolean _isActive;

    private double _balance;

    private final List<AccountTransaction> _transactions;
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `core/src/main/java/org/apache/shiro/session/mgt/AbstractValidatingSessionManager.java`
#### Snippet
```java
    }

    protected void afterSessionValidationEnabled() {
    }

```

### EmptyMethod
The method is empty
in `core/src/main/java/org/apache/shiro/session/mgt/AbstractValidatingSessionManager.java`
#### Snippet
```java
    }

    protected void beforeSessionValidationDisabled() {
    }

```

### EmptyMethod
All implementations of this method are empty
in `core/src/main/java/org/apache/shiro/session/mgt/eis/CachingSessionDAO.java`
#### Snippet
```java
     * @param session the session object whose state will be propagated to the EIS.
     */
    protected abstract void doUpdate(Session session);

    /**
```

### EmptyMethod
All implementations of this method are empty
in `core/src/main/java/org/apache/shiro/session/mgt/eis/CachingSessionDAO.java`
#### Snippet
```java
     * @param session the session instance to permanently delete from the EIS.
     */
    protected abstract void doDelete(Session session);

    /**
```

### EmptyMethod
The method is empty
in `integration-tests/jaxrs/tests/src/main/java/org/apache/shiro/testing/jaxrs/tests/AbstractShiroJaxRsIT.java`
#### Snippet
```java

    @BeforeEach
    public void logOut() {
    }

```

### EmptyMethod
The method is empty
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/faces/tags/SecureComponent.java`
#### Snippet
```java
    }

    protected void verifyAttributes() throws IOException {
    }

```

### EmptyMethod
Method only calls its super
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/FormAuthenticationFilter.java`
#### Snippet
```java

        @Override
        public String getLoginUrl() {
            return FormAuthenticationFilter.super.getLoginUrl();
        }
```

### EmptyMethod
Method only calls its super
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/PassThruAuthenticationFilter.java`
#### Snippet
```java

        @Override
        public String getLoginUrl() {
            return PassThruAuthenticationFilter.super.getLoginUrl();
        }
```

### EmptyMethod
Method only calls its super
in `support/spring/src/main/java/org/apache/shiro/spring/config/ShiroAnnotationProcessorConfiguration.java`
#### Snippet
```java
    @Bean
    @DependsOn("lifecycleBeanPostProcessor")
    protected DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {
        return super.defaultAdvisorAutoProxyCreator();
    }
```

### EmptyMethod
Method only calls its super
in `support/spring/src/main/java/org/apache/shiro/spring/config/ShiroBeanConfiguration.java`
#### Snippet
```java
    @Bean
    @Override
    protected EventBus eventBus() {
        return super.eventBus();
    }
```

### EmptyMethod
Method only calls its super
in `support/spring/src/main/java/org/apache/shiro/spring/config/ShiroConfiguration.java`
#### Snippet
```java
    @Bean
    @Override
    protected SessionManager sessionManager() {
        return super.sessionManager();
    }
```

### EmptyMethod
Method only calls its super
in `support/spring/src/main/java/org/apache/shiro/spring/config/ShiroConfiguration.java`
#### Snippet
```java
    @Bean
    @Override
    protected SubjectDAO subjectDAO() {
        return super.subjectDAO();
    }
```

### EmptyMethod
Method only calls its super
in `support/spring/src/main/java/org/apache/shiro/spring/config/ShiroConfiguration.java`
#### Snippet
```java
    @Bean
    @Override
    protected SessionStorageEvaluator sessionStorageEvaluator() {
        return super.sessionStorageEvaluator();
    }
```

### EmptyMethod
Method only calls its super
in `support/spring/src/main/java/org/apache/shiro/spring/config/ShiroConfiguration.java`
#### Snippet
```java
    @Bean
    @Override
    protected SubjectFactory subjectFactory() {
        return super.subjectFactory();
    }
```

### EmptyMethod
Method only calls its super
in `support/spring/src/main/java/org/apache/shiro/spring/config/ShiroConfiguration.java`
#### Snippet
```java
    @Bean
    @Override
    protected SessionFactory sessionFactory() {
        return super.sessionFactory();
    }
```

### EmptyMethod
Method only calls its super
in `support/spring/src/main/java/org/apache/shiro/spring/config/ShiroConfiguration.java`
#### Snippet
```java
    @Bean
    @Override
    protected SessionDAO sessionDAO() {
        return super.sessionDAO();
    }
```

### EmptyMethod
Method only calls its super
in `support/spring/src/main/java/org/apache/shiro/spring/config/ShiroConfiguration.java`
#### Snippet
```java
    @Bean
    @Override
    protected Authorizer authorizer() {
        return super.authorizer();
    }
```

### EmptyMethod
Method only calls its super
in `support/spring/src/main/java/org/apache/shiro/spring/config/ShiroConfiguration.java`
#### Snippet
```java
    @Bean
    @Override
    protected AuthenticationStrategy authenticationStrategy() {
        return super.authenticationStrategy();
    }
```

### EmptyMethod
Method only calls its super
in `support/spring/src/main/java/org/apache/shiro/spring/config/ShiroConfiguration.java`
#### Snippet
```java
    @Bean
    @Override
    protected Authenticator authenticator() {
        return super.authenticator();
    }
```

### EmptyMethod
Method only calls its super
in `support/spring/src/main/java/org/apache/shiro/spring/config/ShiroConfiguration.java`
#### Snippet
```java
    @Bean
    @Override
    protected RememberMeManager rememberMeManager() {
        return super.rememberMeManager();
    }
```

### EmptyMethod
Method only calls its super
in `support/spring/src/main/java/org/apache/shiro/spring/web/config/ShiroWebConfiguration.java`
#### Snippet
```java
    @Bean
    @Override
    protected SessionStorageEvaluator sessionStorageEvaluator() {
        return super.sessionStorageEvaluator();
    }
```

### EmptyMethod
Method only calls its super
in `support/spring/src/main/java/org/apache/shiro/spring/web/config/ShiroWebConfiguration.java`
#### Snippet
```java
    @Bean(name = "sessionCookieTemplate")
    @Override
    protected Cookie sessionCookieTemplate() {
        return super.sessionCookieTemplate();
    }
```

### EmptyMethod
Method only calls its super
in `support/spring/src/main/java/org/apache/shiro/spring/web/config/ShiroWebConfiguration.java`
#### Snippet
```java
    @Bean(name = "rememberMeCookieTemplate")
    @Override
    protected Cookie rememberMeCookieTemplate() {
        return super.rememberMeCookieTemplate();
    }
```

### EmptyMethod
Method only calls its super
in `support/spring/src/main/java/org/apache/shiro/spring/web/config/ShiroWebConfiguration.java`
#### Snippet
```java
    @Bean
    @Override
    protected RememberMeManager rememberMeManager() {
        return super.rememberMeManager();
    }
```

### EmptyMethod
Method only calls its super
in `support/spring/src/main/java/org/apache/shiro/spring/web/config/ShiroWebConfiguration.java`
#### Snippet
```java
    @Bean
    @Override
    protected SubjectFactory subjectFactory() {
        return super.subjectFactory();
    }
```

### EmptyMethod
Method only calls its super
in `support/spring/src/main/java/org/apache/shiro/spring/web/config/ShiroWebConfiguration.java`
#### Snippet
```java
    @Bean
    @Override
    protected SessionManager sessionManager() {
        return super.sessionManager();
    }
```

### EmptyMethod
Method only calls its super
in `support/spring/src/main/java/org/apache/shiro/spring/web/config/ShiroWebConfiguration.java`
#### Snippet
```java
    @Bean
    @Override
    protected ShiroFilterChainDefinition shiroFilterChainDefinition() {
        return super.shiroFilterChainDefinition();
    }
```

### EmptyMethod
Method only calls its super
in `support/spring/src/main/java/org/apache/shiro/spring/web/config/ShiroWebConfiguration.java`
#### Snippet
```java
    @Bean
    @Override
    protected ShiroUrlPathHelper shiroUrlPathHelper() {
        return super.shiroUrlPathHelper();
    }
```

### EmptyMethod
Method only calls its super
in `support/spring/src/main/java/org/apache/shiro/spring/web/config/ShiroWebFilterConfiguration.java`
#### Snippet
```java
    @Bean
    @Override
    protected ShiroFilterFactoryBean shiroFilterFactoryBean() {
        return super.shiroFilterFactoryBean();
    }
```

### EmptyMethod
Method only calls its super
in `support/spring/src/main/java/org/apache/shiro/spring/web/config/ShiroWebFilterConfiguration.java`
#### Snippet
```java

    @Bean(name = "globalFilters")
    protected List<String> globalFilters() {
        return super.globalFilters();
    }
```

### EmptyMethod
The method is empty
in `web/src/main/java/org/apache/shiro/web/env/EnvironmentLoader.java`
#### Snippet
```java
     * @param environment
     */
    protected void customizeEnvironment(WebEnvironment environment) {
    }

```

### EmptyMethod
The method is empty
in `web/src/main/java/org/apache/shiro/web/env/EnvironmentLoader.java`
#### Snippet
```java
     * @since 1.3
     */
    protected void finalizeEnvironment(WebEnvironment environment) {
    }
}
```

### EmptyMethod
The method is empty
in `web/src/main/java/org/apache/shiro/web/servlet/AdviceFilter.java`
#### Snippet
```java
     */
    @SuppressWarnings({"UnusedDeclaration"})
    public void afterCompletion(ServletRequest request, ServletResponse response, Exception exception) throws Exception {
    }

```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `samples/spring-mvc/src/main/java/org/apache/shiro/samples/spring/BootstrapDataPopulator.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(BootstrapDataPopulator.class);

    protected DataSource dataSource = null;

    public void setDataSource(DataSource dataSource) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/SimpleByteSourceBroker.java`
#### Snippet
```java
    private byte[] ciphertext;
    private byte[] key;
    private boolean destroyed = false;

    public SimpleByteSourceBroker(JcaCipherService cipherService, byte[] ciphertext, byte[] key) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/AbstractHash.java`
#### Snippet
```java
     * Cached value of the {@link #toBase64() toBase64()} call so multiple calls won't incur repeated overhead.
     */
    private transient String base64Encoded = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/AbstractHash.java`
#### Snippet
```java
     * The hashed data
     */
    private byte[] bytes = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/AbstractHash.java`
#### Snippet
```java
     * Cached value of the {@link #toHex() toHex()} call so multiple calls won't incur repeated overhead.
     */
    private transient String hexEncoded = null;
    /**
     * Cached value of the {@link #toBase64() toBase64()} call so multiple calls won't incur repeated overhead.
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/SimpleHash.java`
#### Snippet
```java
     * Cached value of the {@link #toBase64() toBase64()} call so multiple calls won't incur repeated overhead.
     */
    private transient String base64Encoded = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/SimpleHash.java`
#### Snippet
```java
     * Cached value of the {@link #toHex() toHex()} call so multiple calls won't incur repeated overhead.
     */
    private transient String hexEncoded = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `samples/spring-hibernate/src/main/java/org/apache/shiro/samples/sprhib/security/SampleRealm.java`
#### Snippet
```java
public class SampleRealm extends AuthorizingRealm {

    protected UserDAO userDAO = null;

    public SampleRealm() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `web/src/main/java/org/apache/shiro/web/tags/PermissionTag.java`
#### Snippet
```java
    //TODO - complete JavaDoc

    private String name = null;

    public PermissionTag() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `web/src/main/java/org/apache/shiro/web/tags/RoleTag.java`
#### Snippet
```java
    //TODO - complete JavaDoc

    private String name = null;

    public RoleTag() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `web/src/main/java/org/apache/shiro/web/config/ShiroFilterConfiguration.java`
#### Snippet
```java
    private boolean filterOncePerRequest = false;

    private boolean staticSecurityManagerEnabled = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `web/src/main/java/org/apache/shiro/web/config/ShiroFilterConfiguration.java`
#### Snippet
```java
public class ShiroFilterConfiguration {

    private boolean filterOncePerRequest = false;

    private boolean staticSecurityManagerEnabled = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `web/src/main/java/org/apache/shiro/web/util/RedirectView.java`
#### Snippet
```java
    private String url;

    private boolean contextRelative = false;

    private boolean http10Compatible = true;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `support/hazelcast/src/main/java/org/apache/shiro/hazelcast/cache/HazelcastCacheManager.java`
#### Snippet
```java
    public static final Logger log = LoggerFactory.getLogger(HazelcastCacheManager.class);

    private boolean implicitlyCreated = false;
    private HazelcastInstance hazelcastInstance;
    private Config config;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `web/src/main/java/org/apache/shiro/web/filter/authc/LogoutFilter.java`
#### Snippet
```java
     * a logout to occur.
     */
    private boolean postOnlyLogout = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `web/src/main/java/org/apache/shiro/web/servlet/ServletContextSupport.java`
#### Snippet
```java

    //TODO - complete JavaDoc
    private ServletContext servletContext = null;

    public ServletContext getServletContext() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `web/src/main/java/org/apache/shiro/web/servlet/OncePerRequestFilter.java`
#### Snippet
```java
     * or include request (JSP tags, programmatically, or via a framework).
     */
    private boolean filterOncePerRequest = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `web/src/main/java/org/apache/shiro/web/servlet/ShiroHttpServletRequest.java`
#### Snippet
```java
    protected ServletContext servletContext = null;

    protected HttpSession session = null;
    protected boolean httpSessions = true;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `web/src/main/java/org/apache/shiro/web/servlet/ShiroHttpServletRequest.java`
#### Snippet
```java
    public static final String SESSION_ID_URL_REWRITING_ENABLED = ShiroHttpServletRequest.class.getName() + "_SESSION_ID_URL_REWRITING_ENABLED";

    protected ServletContext servletContext = null;

    protected HttpSession session = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `web/src/main/java/org/apache/shiro/web/servlet/ShiroHttpServletRequest.java`
#### Snippet
```java

    private class ObjectPrincipal implements java.security.Principal {
        private Object object = null;

        public ObjectPrincipal(Object object) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `web/src/main/java/org/apache/shiro/web/servlet/ProxiedFilterChain.java`
#### Snippet
```java
    private FilterChain orig;
    private List<Filter> filters;
    private int index = 0;

    public ProxiedFilterChain(FilterChain orig, List<Filter> filters) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `web/src/main/java/org/apache/shiro/web/session/HttpServletSession.java`
#### Snippet
```java
    private static final String TOUCH_OBJECT_SESSION_KEY = HttpServletSession.class.getName() + ".TOUCH_OBJECT_SESSION_KEY";

    private HttpSession httpSession = null;

    public HttpServletSession(HttpSession httpSession, String host) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `web/src/main/java/org/apache/shiro/web/servlet/ShiroHttpServletResponse.java`
#### Snippet
```java
    private ServletContext context = null;
    //the associated request
    private ShiroHttpServletRequest request = null;

    public ShiroHttpServletResponse(HttpServletResponse wrapped, ServletContext context, ShiroHttpServletRequest request) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `web/src/main/java/org/apache/shiro/web/servlet/ShiroHttpServletResponse.java`
#### Snippet
```java
    private static final String DEFAULT_SESSION_ID_PARAMETER_NAME = ShiroHttpSession.DEFAULT_SESSION_ID_NAME;

    private ServletContext context = null;
    //the associated request
    private ShiroHttpServletRequest request = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `web/src/main/java/org/apache/shiro/web/servlet/ShiroHttpSession.java`
#### Snippet
```java
    protected ServletContext servletContext = null;
    protected HttpServletRequest currentRequest = null;
    protected Session session = null; //'real' Shiro Session

    public ShiroHttpSession(Session session, HttpServletRequest currentRequest, ServletContext servletContext) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `web/src/main/java/org/apache/shiro/web/servlet/ShiroHttpSession.java`
#### Snippet
```java
            };

    protected ServletContext servletContext = null;
    protected HttpServletRequest currentRequest = null;
    protected Session session = null; //'real' Shiro Session
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `web/src/main/java/org/apache/shiro/web/servlet/ShiroHttpSession.java`
#### Snippet
```java

    protected ServletContext servletContext = null;
    protected HttpServletRequest currentRequest = null;
    protected Session session = null; //'real' Shiro Session

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `support/jaxrs/src/main/java/org/apache/shiro/web/jaxrs/ShiroSecurityContext.java`
#### Snippet
```java
     */
    private class ObjectPrincipal implements Principal {
        private Object object = null;

        public ObjectPrincipal(Object object) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `support/guice/src/main/java/org/apache/shiro/guice/web/SimpleFilterChain.java`
#### Snippet
```java
    private final Iterator<? extends Filter> chain;

    private boolean originalCalled = false;

    public SimpleFilterChain(FilterChain originalChain, Iterator<? extends Filter> chain) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `support/spring/src/main/java/org/apache/shiro/spring/security/interceptor/AuthorizationAttributeSourceAdvisor.java`
#### Snippet
```java
            };

    protected SecurityManager securityManager = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `support/jcache/src/main/java/org/apache/shiro/cache/jcache/JCacheManager.java`
#### Snippet
```java
     * it should be automatically cleaned up as well on shutdown.
     */
    private boolean cacheManagerImplicitlyCreated = false;

    @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `support/quartz/src/main/java/org/apache/shiro/session/mgt/quartz/QuartzSessionValidationScheduler.java`
#### Snippet
```java
    private Scheduler scheduler;

    private boolean schedulerImplicitlyCreated = false;

    private boolean enabled = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `support/quartz/src/main/java/org/apache/shiro/session/mgt/quartz/QuartzSessionValidationScheduler.java`
#### Snippet
```java
    private boolean schedulerImplicitlyCreated = false;

    private boolean enabled = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `support/ehcache/src/main/java/org/apache/shiro/cache/ehcache/EhCacheManager.java`
#### Snippet
```java
     * it should be automatically cleaned up as well on shutdown.
     */
    private boolean cacheManagerImplicitlyCreated = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/shiro/jndi/JndiLocator.java`
#### Snippet
```java
    public static final String CONTAINER_PREFIX = "java:comp/env/";

    private boolean resourceRef = false;

    private JndiTemplate jndiTemplate = new JndiTemplate();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/shiro/util/RegExPatternMatcher.java`
#### Snippet
```java
    private static final int CASE_INSENSITIVE = DEFAULT | Pattern.CASE_INSENSITIVE;

    private boolean caseInsensitive = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/shiro/authc/UsernamePasswordToken.java`
#### Snippet
```java
     * default is <code>false</code>
     */
    private boolean rememberMe = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/shiro/authz/SimpleRole.java`
#### Snippet
```java
public class SimpleRole implements Serializable {

    protected String name = null;
    protected Set<Permission> permissions;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/shiro/realm/ldap/AbstractLdapRealm.java`
#### Snippet
```java
    protected String principalSuffix = null;

    protected String searchBase = null;

    protected String url = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/shiro/realm/ldap/AbstractLdapRealm.java`
#### Snippet
```java
    protected String url = null;

    protected String systemUsername = null;

    protected String systemPassword = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/shiro/realm/ldap/AbstractLdapRealm.java`
#### Snippet
```java
    protected String systemUsername = null;

    protected String systemPassword = null;

    //SHIRO-115 - prevent potential code injection:
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/shiro/realm/ldap/AbstractLdapRealm.java`
#### Snippet
```java
     * Only then, "John.Doe" and also "John.Doe@example.com" can authorize against groups
     */
    protected String principalSuffix = null;

    protected String searchBase = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/shiro/realm/ldap/AbstractLdapRealm.java`
#### Snippet
```java
    protected String searchFilter = "(&(objectClass=*)(userPrincipalName={0}))";

    private LdapContextFactory ldapContextFactory = null;

    /*--------------------------------------------
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/shiro/realm/ldap/AbstractLdapRealm.java`
#### Snippet
```java
    protected String searchBase = null;

    protected String url = null;

    protected String systemUsername = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/shiro/realm/jndi/JndiRealmFactory.java`
#### Snippet
```java
public class JndiRealmFactory extends JndiLocator implements RealmFactory {

    Collection<String> jndiNames = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/shiro/realm/jdbc/JdbcRealm.java`
#### Snippet
```java
    protected String permissionsQuery = DEFAULT_PERMISSIONS_QUERY;

    protected boolean permissionsLookupEnabled = false;
    
    protected SaltStyle saltStyle = SaltStyle.NO_SALT;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/shiro/realm/text/PropertiesRealm.java`
#### Snippet
```java

    protected ExecutorService scheduler = null;
    protected boolean useXmlFormat = false;
    protected String resourcePath = DEFAULT_RESOURCE_PATH;
    protected long fileLastModified;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/shiro/realm/text/PropertiesRealm.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(PropertiesRealm.class);

    protected ExecutorService scheduler = null;
    protected boolean useXmlFormat = false;
    protected String resourcePath = DEFAULT_RESOURCE_PATH;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/shiro/session/mgt/DelegatingSession.java`
#### Snippet
```java
    //cached fields to avoid a server-side method call if out-of-process:
    private Date startTimestamp = null;
    private String host = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/shiro/session/mgt/DelegatingSession.java`
#### Snippet
```java

    //cached fields to avoid a server-side method call if out-of-process:
    private Date startTimestamp = null;
    private String host = null;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/shiro/session/mgt/ExecutorServiceSessionValidationScheduler.java`
#### Snippet
```java
    private ScheduledExecutorService service;
    private long sessionValidationInterval = DefaultSessionManager.DEFAULT_SESSION_VALIDATION_INTERVAL;
    private boolean enabled = false;
    private String threadNamePrefix = "SessionValidationThread-";

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/main/java/org/apache/shiro/session/mgt/SimpleSession.java`
#### Snippet
```java

    //serialization bitmask fields. DO NOT CHANGE THE ORDER THEY ARE DECLARED!
    static int bitIndexCounter = 0;
    private static final int ID_BIT_MASK = 1 << bitIndexCounter++;
    private static final int START_TIMESTAMP_BIT_MASK = 1 << bitIndexCounter++;
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `Destroyable`
in `web/src/main/java/org/apache/shiro/web/env/IniWebEnvironment.java`
#### Snippet
```java
 * @since 1.2
 */
public class IniWebEnvironment extends ResourceBasedWebEnvironment implements Initializable, Destroyable {

    public static final String DEFAULT_WEB_INI_RESOURCE_PATH = "/WEB-INF/shiro.ini";
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `core/src/main/java/org/apache/shiro/authc/SimpleAccount.java`
#### Snippet
```java
 * @since 0.1
 */
public class SimpleAccount implements Account, MergableAuthenticationInfo, SaltedAuthenticationInfo, Serializable {

    /*--------------------------------------------
```

### RedundantImplements
Redundant interface declaration `Initializable`
in `core/src/main/java/org/apache/shiro/realm/AuthorizingRealm.java`
#### Snippet
```java
 */
public abstract class AuthorizingRealm extends AuthenticatingRealm
        implements Authorizer, Initializable, PermissionResolverAware, RolePermissionResolverAware {

    //TODO - complete JavaDoc
```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `web/src/main/java/org/apache/shiro/web/servlet/AbstractFilter.java`
#### Snippet
```java
            onFilterConfigSet();
        } catch (Exception e) {
            if (e instanceof ServletException) {
                throw (ServletException) e;
            } else {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `core/src/main/java/org/apache/shiro/authc/AbstractAuthenticator.java`
#### Snippet
```java
        } catch (Throwable t) {
            AuthenticationException ae = null;
            if (t instanceof AuthenticationException) {
                ae = (AuthenticationException) t;
            }
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `core/src/main/java/org/apache/shiro/session/mgt/AbstractValidatingSessionManager.java`
#### Snippet
```java
                } catch (InvalidSessionException e) {
                    if (log.isDebugEnabled()) {
                        boolean expired = (e instanceof ExpiredSessionException);
                        String msg = "Invalidated session with id [" + s.getId() + "]" +
                                (expired ? " (expired)" : " (stopped)");
```

## RuleId[id=StringRepeatCanBeUsed]
### StringRepeatCanBeUsed
Can be replaced with 'String.repeat()'
in `web/src/main/java/org/apache/shiro/web/mgt/CookieRememberMeManager.java`
#### Snippet
```java
        if (length % 4 != 0) {
            StringBuilder sb = new StringBuilder(base64);
            for (int i = 0; i < length % 4; ++i) {
                sb.append('=');
            }
```

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `host` of exception class
in `core/src/main/java/org/apache/shiro/authz/HostUnauthorizedException.java`
#### Snippet
```java
public class HostUnauthorizedException extends UnauthorizedException {

    private String host;

    /**
```

### NonFinalFieldOfException
Non-final field `permissionString` of exception class
in `core/src/main/java/org/apache/shiro/authz/permission/InvalidPermissionStringException.java`
#### Snippet
```java
{

    private String permissionString;

    /**
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `crypto/support/hashes/bcrypt/src/main/java/org/apache/shiro/crypto/support/hashes/bcrypt/OpenBSDBase64.java`
#### Snippet
```java
            if (lastWordChars == 1) {
                // We read 1 char followed by "===". But 6 bits is a truncated byte! Fail.
                return new byte[0];
            } else if (lastWordChars == 2) {
                // We read 2 chars followed by "==". Emit 1 byte with 8 of those 12 bits.
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `support/guice/src/main/java/org/apache/shiro/guice/web/ShiroWebModule.java`
#### Snippet
```java
        if (!filterChains.containsKey("/**")) {
            // no config, this will add only the global filters
            this.addFilterChain("/**", new FilterConfig[0]);
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/org/apache/shiro/authz/ModularRealmAuthorizer.java`
#### Snippet
```java
        }

        return new boolean[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/org/apache/shiro/authz/ModularRealmAuthorizer.java`
#### Snippet
```java
        }

        return new boolean[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/org/apache/shiro/authz/ModularRealmAuthorizer.java`
#### Snippet
```java
            return isPermitted;
        }
        return new boolean[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `lang/src/main/java/org/apache/shiro/lang/util/SimpleByteSource.java`
#### Snippet
```java

    public static ByteSource empty() {
        return new SimpleByteSource(new byte[]{});
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/org/apache/shiro/realm/AuthorizingRealm.java`
#### Snippet
```java
            }
        } else {
            result = new boolean[0];
        }
        return result;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/org/apache/shiro/realm/AuthorizingRealm.java`
#### Snippet
```java
            }
        } else {
            result = new boolean[0];
        }
        return result;
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/SimpleByteSourceBroker.java`
#### Snippet
```java
    public void destroy() throws Exception {
        if (!destroyed) {
            synchronized (this) {
                destroyed = true;
                cipherService = null;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `support/jcache/src/main/java/org/apache/shiro/cache/jcache/JCacheManager.java`
#### Snippet
```java

        if (cache == null) {
            synchronized (this) {
                cache = ensureCacheManager().getCache(name);
                if (cache == null) {
```

## RuleId[id=CastConflictsWithInstanceof]
### CastConflictsWithInstanceof
Cast to 'DefaultWebSecurityManager' type conflicts with preceding 'instanceof DefaultSecurityManager' check
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/ShiroFilter.java`
#### Snippet
```java
            if (context instanceof WebSubjectContext && wrapped instanceof DefaultSecurityManager) {
                WebSubjectContext webContext = (WebSubjectContext) context;
                DefaultWebSecurityManager wsm = (DefaultWebSecurityManager) wrapped;
                Session session = null;
                try {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `info` initializer `null` is redundant
in `samples/spring-mvc/src/main/java/org/apache/shiro/samples/spring/realm/SaltAwareJdbcRealm.java`
#### Snippet
```java

        Connection conn = null;
        AuthenticationInfo info = null;
        try {
            conn = dataSource.getConnection();
```

### UnusedAssignment
The value changed at `i--` is never used
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/format/Shiro1CryptFormat.java`
#### Snippet
```java
        //second-to-last part is always the salt, Base64-encoded:
        String saltBase64 = parts[i--];
        String iterationsString = parts[i--];

        byte[] digest = Base64.decode(digestBase64);
```

### UnusedAssignment
Variable `clazz` initializer `null` is redundant
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/format/DefaultHashFormatFactory.java`
#### Snippet
```java
    protected Class getHashFormatClass(String packageName, String token) {
        String test = token;
        Class clazz = null;
        String pkg = packageName == null ? "" : packageName;

```

### UnusedAssignment
Variable `httpSessions` initializer `true` is redundant
in `web/src/main/java/org/apache/shiro/web/servlet/ShiroHttpServletRequest.java`
#### Snippet
```java

    protected HttpSession session = null;
    protected boolean httpSessions = true;

    public ShiroHttpServletRequest(HttpServletRequest wrapped, ServletContext servletContext, boolean httpSessions) {
```

### UnusedAssignment
Variable `servletContext` initializer `null` is redundant
in `web/src/main/java/org/apache/shiro/web/servlet/ShiroHttpServletRequest.java`
#### Snippet
```java
    public static final String SESSION_ID_URL_REWRITING_ENABLED = ShiroHttpServletRequest.class.getName() + "_SESSION_ID_URL_REWRITING_ENABLED";

    protected ServletContext servletContext = null;

    protected HttpSession session = null;
```

### UnusedAssignment
Variable `object` initializer `null` is redundant
in `web/src/main/java/org/apache/shiro/web/servlet/ShiroHttpServletRequest.java`
#### Snippet
```java

    private class ObjectPrincipal implements java.security.Principal {
        private Object object = null;

        public ObjectPrincipal(Object object) {
```

### UnusedAssignment
Variable `index` initializer `0` is redundant
in `web/src/main/java/org/apache/shiro/web/servlet/ProxiedFilterChain.java`
#### Snippet
```java
    private FilterChain orig;
    private List<Filter> filters;
    private int index = 0;

    public ProxiedFilterChain(FilterChain orig, List<Filter> filters) {
```

### UnusedAssignment
Variable `httpSession` initializer `null` is redundant
in `web/src/main/java/org/apache/shiro/web/session/HttpServletSession.java`
#### Snippet
```java
    private static final String TOUCH_OBJECT_SESSION_KEY = HttpServletSession.class.getName() + ".TOUCH_OBJECT_SESSION_KEY";

    private HttpSession httpSession = null;

    public HttpServletSession(HttpSession httpSession, String host) {
```

### UnusedAssignment
Variable `session` initializer `null` is redundant
in `web/src/main/java/org/apache/shiro/web/servlet/ShiroHttpSession.java`
#### Snippet
```java
    protected ServletContext servletContext = null;
    protected HttpServletRequest currentRequest = null;
    protected Session session = null; //'real' Shiro Session

    public ShiroHttpSession(Session session, HttpServletRequest currentRequest, ServletContext servletContext) {
```

### UnusedAssignment
Variable `servletContext` initializer `null` is redundant
in `web/src/main/java/org/apache/shiro/web/servlet/ShiroHttpSession.java`
#### Snippet
```java
            };

    protected ServletContext servletContext = null;
    protected HttpServletRequest currentRequest = null;
    protected Session session = null; //'real' Shiro Session
```

### UnusedAssignment
Variable `currentRequest` initializer `null` is redundant
in `web/src/main/java/org/apache/shiro/web/servlet/ShiroHttpSession.java`
#### Snippet
```java

    protected ServletContext servletContext = null;
    protected HttpServletRequest currentRequest = null;
    protected Session session = null; //'real' Shiro Session

```

### UnusedAssignment
Variable `request` initializer `null` is redundant
in `web/src/main/java/org/apache/shiro/web/servlet/ShiroHttpServletResponse.java`
#### Snippet
```java
    private ServletContext context = null;
    //the associated request
    private ShiroHttpServletRequest request = null;

    public ShiroHttpServletResponse(HttpServletResponse wrapped, ServletContext context, ShiroHttpServletRequest request) {
```

### UnusedAssignment
Variable `context` initializer `null` is redundant
in `web/src/main/java/org/apache/shiro/web/servlet/ShiroHttpServletResponse.java`
#### Snippet
```java
    private static final String DEFAULT_SESSION_ID_PARAMETER_NAME = ShiroHttpSession.DEFAULT_SESSION_ID_NAME;

    private ServletContext context = null;
    //the associated request
    private ShiroHttpServletRequest request = null;
```

### UnusedAssignment
Variable `object` initializer `null` is redundant
in `support/jaxrs/src/main/java/org/apache/shiro/web/jaxrs/ShiroSecurityContext.java`
#### Snippet
```java
     */
    private class ObjectPrincipal implements Principal {
        private Object object = null;

        public ObjectPrincipal(Object object) {
```

### UnusedAssignment
Variable `value` initializer `null` is redundant
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/faces/tags/PrincipalTag.java`
#### Snippet
```java
            for (PropertyDescriptor pd : bi.getPropertyDescriptors()) {
                if (pd.getName().equals(property) && (Modifier.isPublic(pd.getReadMethod().getModifiers()))) {
                    Object value = null;
                    try {
                        pd.getReadMethod().setAccessible(true);
```

### UnusedAssignment
Variable `mapEnd` initializer `-1` is redundant
in `config/ogdl/src/main/java/org/apache/shiro/config/ogdl/ReflectionBuilder.java`
#### Snippet
```java

        int mapBegin = propertyPath.indexOf(MAP_PROPERTY_BEGIN_TOKEN);
        int mapEnd = -1;
        String mapPropertyPath = null;
        String keyString = null;
```

### UnusedAssignment
Variable `referencedValue` initializer `null` is redundant
in `config/ogdl/src/main/java/org/apache/shiro/config/ogdl/ReflectionBuilder.java`
#### Snippet
```java
            //property is being referenced as part of a nested path.  Find the referenced map/array entry and
            //recursively call this method with the remaining property path
            Object referencedValue = null;
            if (isTypedProperty(object, mapPropertyPath, Map.class)) {
                Map map = (Map)getProperty(object, mapPropertyPath);
```

### UnusedAssignment
Variable `info` initializer `null` is redundant
in `core/src/main/java/org/apache/shiro/realm/jdbc/JdbcRealm.java`
#### Snippet
```java

        Connection conn = null;
        SimpleAuthenticationInfo info = null;
        try {
            conn = dataSource.getConnection();
```

### UnusedAssignment
Variable `roleNames` initializer `null` is redundant
in `core/src/main/java/org/apache/shiro/realm/jdbc/JdbcRealm.java`
#### Snippet
```java

        Connection conn = null;
        Set<String> roleNames = null;
        Set<String> permissions = null;
        try {
```

### UnusedAssignment
Variable `account` initializer `null` is redundant
in `samples/aspectj/src/main/java/org/apache/shiro/samples/aspectj/bank/SecureBankService.java`
#### Snippet
```java
     */
    protected Account safelyRetrieveAccountForId(long anAccountId) throws AccountNotFoundException {
        Account account = null;
        synchronized (_accounts) {
            account = _accountsById.get(anAccountId);
```

## RuleId[id=IndexOfReplaceableByContains]
### IndexOfReplaceableByContains
`textToSearch.indexOf(substring) != -1` can be replaced with 'textToSearch.contains(substring)'
in `lang/src/main/java/org/apache/shiro/lang/util/Assert.java`
#### Snippet
```java
    public static void doesNotContain(String textToSearch, String substring, String message) {
        if (StringUtils.hasLength(textToSearch) && StringUtils.hasLength(substring) &&
                textToSearch.indexOf(substring) != -1) {
            throw new IllegalArgumentException(message);
        }
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `environment instanceof ResourceConfigurable` is always `true` when reached
in `web/src/main/java/org/apache/shiro/web/env/EnvironmentLoader.java`
#### Snippet
```java
        environment.setServletContext(sc);

        if (configSpecified && (environment instanceof ResourceConfigurable)) {
            ((ResourceConfigurable) environment).setConfigLocations(configLocations);
        }
```

### ConstantValue
Condition `authTokens == null` is always `false`
in `web/src/main/java/org/apache/shiro/web/filter/authc/HttpAuthenticationFilter.java`
#### Snippet
```java
        }
        String[] authTokens = authorizationHeader.split(" ");
        if (authTokens == null || authTokens.length < 2) {
            return null;
        }
```

### ConstantValue
Value `create` is always 'true'
in `web/src/main/java/org/apache/shiro/web/servlet/ShiroHttpServletRequest.java`
#### Snippet
```java
                //Shiro 1.2: assert that creation is enabled (SHIRO-266):
                if (WebUtils._isSessionCreationEnabled(this)) {
                    httpSession = super.getSession(create);
                } else {
                    throw newNoSessionCreationException();
```

### ConstantValue
Condition `b != null` is always `true`
in `web/src/main/java/org/apache/shiro/web/servlet/AbstractShiroFilter.java`
#### Snippet
```java
        if (value != null) {
            Boolean b = Boolean.valueOf(value);
            if (b != null) {
                setStaticSecurityManagerEnabled(b);
            }
```

### ConstantValue
Value `location` is always 'null'
in `web/src/main/java/org/apache/shiro/web/servlet/ShiroHttpServletResponse.java`
#### Snippet
```java

        if (location == null)
            return (location);

        boolean leadingSlash = location.startsWith("/");
```

### ConstantValue
Value `comment` is always 'null'
in `web/src/main/java/org/apache/shiro/web/servlet/SimpleCookie.java`
#### Snippet
```java
        SameSiteOptions sameSite = getSameSite();

        addCookieHeader(response, name, value, comment, domain, path, maxAge, version, secure, httpOnly, sameSite);

        log.trace("Removed '{}' cookie by setting maxAge=0", name);
```

### ConstantValue
Condition `a.equals(b)` is always `false` when reached
in `event/src/main/java/org/apache/shiro/event/support/EventClassComparator.java`
#### Snippet
```java
        } else if (b == null) {
            return 1;
        } else if (a == b || a.equals(b)) {
            return 0;
        } else {
```

### ConstantValue
Condition `methods == null` is always `false`
in `event/src/main/java/org/apache/shiro/event/support/AnnotationEventListenerResolver.java`
#### Snippet
```java

        List<Method> methods = ClassUtils.getAnnotatedMethods(instance.getClass(), getAnnotationClass());
        if (methods == null || methods.isEmpty()) {
            return Collections.emptyList();
        }
```

### ConstantValue
Condition `props != null` is always `true`
in `config/core/src/main/java/org/apache/shiro/config/Ini.java`
#### Snippet
```java
                props = new LinkedHashMap<String,String>();
            }
            if ( props != null ) {
                this.props = props;
            } else {
```

### ConstantValue
Condition `methods != null` is always `true`
in `support/guice/src/main/java/org/apache/shiro/guice/ShiroModule.java`
#### Snippet
```java

            List<Method> methods = ClassUtils.getAnnotatedMethods(typeLiteral.getRawType(), Subscribe.class);
            if (methods != null && !methods.isEmpty()) {
                typeEncounter.register( new InjectionListener<I>() {
                    @Override
```

### ConstantValue
Value `savedFormData` is always 'null'
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/FormResubmitSupport.java`
#### Snippet
```java
                    var cachedData = Optional.ofNullable((byte[]) cache.get(cacheKey));
                    savedFormData = cachedData.map(encryptedData ->
                            decrypt(encryptedData, rememberMeManager)).orElse(savedFormData);
                } else {
                    savedFormData = (String) cache.get(cacheKey);
```

### ConstantValue
Value `rememberedAjaxResubmit` is always 'true'
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/FormResubmitSupport.java`
#### Snippet
```java
            log.debug("Redirect request: {}, response: {}", redirectRequest, redirectResponse);
            return processResubmitResponse(redirectResponse, originalRequest, originalResponse,
                    response.headers(), savedRequest, servletContext, true, rememberedAjaxResubmit);
        } else {
            deleteCookie(originalResponse, servletContext, SHIRO_FORM_DATA_KEY);
```

### ConstantValue
Value `rememberedAjaxResubmit` is always 'false'
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/FormResubmitSupport.java`
#### Snippet
```java
            return processResubmitResponse(response, originalRequest, originalResponse,
                    response.headers(), savedRequest, servletContext,
                    decodedFormData.isPartialAjaxRequest, rememberedAjaxResubmit);
        }
    }
```

### ConstantValue
Condition `targetClass != null` is always `true`
in `support/spring/src/main/java/org/apache/shiro/spring/security/interceptor/AuthorizationAttributeSourceAdvisor.java`
#### Snippet
```java
        //The 'method' parameter could be from an interface that doesn't have the annotation.
        //Check to see if the implementation has it.
        if ( targetClass != null) {
            try {
                m = targetClass.getMethod(m.getName(), m.getParameterTypes());
```

### ConstantValue
Condition `realms.isEmpty()` is always `false`
in `core/src/main/java/org/apache/shiro/realm/jndi/JndiRealmFactory.java`
#### Snippet
```java
            }
        }
        return realms.isEmpty() ? null : realms;
    }
}
```

### ConstantValue
Value `expired` is always 'true'
in `core/src/main/java/org/apache/shiro/session/mgt/SimpleSession.java`
#### Snippet
```java
        }
        if (expired) {
            out.writeBoolean(expired);
        }
        if (host != null) {
```

### ConstantValue
Condition `values != null` is always `true`
in `lang/src/main/java/org/apache/shiro/lang/util/SoftHashMap.java`
#### Snippet
```java
        processQueue();
        Collection values = values();
        return values != null && values.contains(value);
    }

```

### ConstantValue
Condition `stack != null` is always `true`
in `core/src/main/java/org/apache/shiro/subject/support/DelegatingSubject.java`
#### Snippet
```java
            } else {
                //always get the one behind the current:
                assert stack != null;
                previousPrincipals = stack.get(1);
            }
```

## RuleId[id=IOResource]
### IOResource
'CipherInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/JcaCipherService.java`
#### Snippet
```java
        javax.crypto.Cipher cipher = initNewCipher(cryptMode, keyBytes, iv, true);

        CipherInputStream cis = new CipherInputStream(in, cipher);

        int bufSize = getStreamingBufferSize();
```

### IOResource
'AnnotationConfigApplicationContext' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `samples/spring/src/main/java/org/apache/shiro/samples/spring/CliApp.java`
#### Snippet
```java

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CliApp.class);
        context.getBean(QuickStart.class).run();
//        System.exit(0);
```

### IOResource
'Scanner' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `config/core/src/main/java/org/apache/shiro/config/Ini.java`
#### Snippet
```java
            String line;
            StringBuilder lineBuffer = new StringBuilder();
            Scanner scanner = new Scanner(content);
            while (scanner.hasNextLine()) {
                line = StringUtils.clean(scanner.nextLine());
```

## RuleId[id=RedundantLengthCheck]
### RedundantLengthCheck
Redundant array length check
in `core/src/main/java/org/apache/shiro/authz/ModularRealmAuthorizer.java`
#### Snippet
```java
    public boolean isPermittedAll(PrincipalCollection principals, String... permissions) {
        assertRealmsConfigured();
        if (permissions != null && permissions.length > 0) {
            for (String perm : permissions) {
                if (!isPermitted(principals, perm)) {
```

### RedundantLengthCheck
Redundant array length check
in `core/src/main/java/org/apache/shiro/authz/ModularRealmAuthorizer.java`
#### Snippet
```java
    public void checkPermissions(PrincipalCollection principals, String... permissions) throws AuthorizationException {
        assertRealmsConfigured();
        if (permissions != null && permissions.length > 0) {
            for (String perm : permissions) {
                checkPermission(principals, perm);
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `WebUtils` has only 'static' members, and lacks a 'private' constructor
in `web/src/main/java/org/apache/shiro/web/util/WebUtils.java`
#### Snippet
```java
 * @since 0.9
 */
public class WebUtils {

    //TODO - complete JavaDoc
```

### UtilityClassWithoutPrivateConstructor
Class `Quickstart` has only 'static' members, and lacks a 'private' constructor
in `samples/quickstart/src/main/java/Quickstart.java`
#### Snippet
```java
 * @since 0.9 RC2
 */
public class Quickstart {

    private static final transient Logger log = LoggerFactory.getLogger(Quickstart.class);
```

### UtilityClassWithoutPrivateConstructor
Class `QuickstartGuice` has only 'static' members, and lacks a 'private' constructor
in `samples/quickstart-guice/src/main/java/QuickstartGuice.java`
#### Snippet
```java
 * @since 0.9 RC2
 */
public class QuickstartGuice {

    private static final transient Logger log = LoggerFactory.getLogger(QuickstartGuice.class);
```

### UtilityClassWithoutPrivateConstructor
Class `ShiroMatchers` has only 'static' members, and lacks a 'private' constructor
in `support/guice/src/main/java/org/apache/shiro/guice/ShiroMatchers.java`
#### Snippet
```java
import com.google.inject.matcher.Matcher;

class ShiroMatchers {
    public static Matcher<Class> ANY_PACKAGE = new AbstractMatcher<Class>() {

```

### UtilityClassWithoutPrivateConstructor
Class `HttpMethod` has only 'static' members, and lacks a 'private' constructor
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/FormResubmitSupport.java`
#### Snippet
```java
    private static final String FORM_DATA_CACHE = "org.apache.form-data-cache";

    static class HttpMethod {
        static final String GET = "GET";
        static final String POST = "POST";
```

### UtilityClassWithoutPrivateConstructor
Class `HttpResponseCodes` has only 'static' members, and lacks a 'private' constructor
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/FormResubmitSupport.java`
#### Snippet
```java
    }

    static class HttpResponseCodes {
        static final int OK = 200;
        static final int FOUND = 302;
```

### UtilityClassWithoutPrivateConstructor
Class `MediaType` has only 'static' members, and lacks a 'private' constructor
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/FormResubmitSupport.java`
#### Snippet
```java
    }

    static class MediaType {
        static final String APPLICATION_FORM_URLENCODED = "application/x-www-form-urlencoded";
        static final String TEXT_XML = "text/xml";
```

### UtilityClassWithoutPrivateConstructor
Class `HttpHeaderContstants` has only 'static' members, and lacks a 'private' constructor
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/FormResubmitSupport.java`
#### Snippet
```java
    }

    static class HttpHeaderContstants {
        static final String CONTENT_TYPE = "Content-Type";
        static final String LOCATION = "Location";
```

### UtilityClassWithoutPrivateConstructor
Class `ShiroComponentProducer` has only 'static' members, and lacks a 'private' constructor
in `support/cdi/src/main/java/org/apache/shiro/cdi/ShiroComponentProducer.java`
#### Snippet
```java
@Dependent
@Slf4j
public class ShiroComponentProducer {
    @Produces
    public static SecurityManager getSecurityManager() {
```

### UtilityClassWithoutPrivateConstructor
Class `CollectionUtils` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/org/apache/shiro/util/CollectionUtils.java`
#### Snippet
```java
 * @since 0.9
 */
public class CollectionUtils {

    //TODO - complete JavaDoc
```

### UtilityClassWithoutPrivateConstructor
Class `PermissionUtils` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/org/apache/shiro/util/PermissionUtils.java`
#### Snippet
```java
 * @since 0.1
 */
public class PermissionUtils {

    public static Set<Permission> resolveDelimitedPermissions(String s, PermissionResolver permissionResolver) {
```

### UtilityClassWithoutPrivateConstructor
Class `LdapUtils` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/org/apache/shiro/realm/ldap/LdapUtils.java`
#### Snippet
```java
 * @since 0.2
 */
public final class LdapUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `Util` has only 'static' members, and lacks a 'private' constructor
in `lang/src/main/java/org/apache/shiro/lang/util/ByteSource.java`
#### Snippet
```java
     * @since 1.2
     */
    public static final class Util {

        /**
```

### UtilityClassWithoutPrivateConstructor
Class `Base64` has only 'static' members, and lacks a 'private' constructor
in `lang/src/main/java/org/apache/shiro/lang/codec/Base64.java`
#### Snippet
```java
 * @since 0.9
 */
public class Base64 {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ClassUtils` has only 'static' members, and lacks a 'private' constructor
in `lang/src/main/java/org/apache/shiro/lang/util/ClassUtils.java`
#### Snippet
```java
 * @since 0.1
 */
public class ClassUtils {

    //TODO - complete JavaDoc
```

### UtilityClassWithoutPrivateConstructor
Class `H64` has only 'static' members, and lacks a 'private' constructor
in `lang/src/main/java/org/apache/shiro/lang/codec/H64.java`
#### Snippet
```java
 * @since 1.2
 */
public class H64 {

    private static final char[] itoa64 = "./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
```

### UtilityClassWithoutPrivateConstructor
Class `Hex` has only 'static' members, and lacks a 'private' constructor
in `lang/src/main/java/org/apache/shiro/lang/codec/Hex.java`
#### Snippet
```java
 * @since 0.9
 */
public class Hex {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `StringUtils` has only 'static' members, and lacks a 'private' constructor
in `lang/src/main/java/org/apache/shiro/lang/util/StringUtils.java`
#### Snippet
```java
 * @since 0.9
 */
public class StringUtils {

    //TODO - complete JavaDoc
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/PassThruAuthenticationFilter.java`
#### Snippet
```java
            return PassThruAuthenticationFilter.super.preHandle(request, response);
        }
    };

    public PassThruAuthenticationFilter() {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/FormAuthenticationFilter.java`
#### Snippet
```java
            return FormAuthenticationFilter.super.preHandle(request, response);
        }
    };

    public FormAuthenticationFilter() {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `support/cdi/src/main/java/org/apache/shiro/cdi/ShiroSecurityExtension.java`
#### Snippet
```java
public class ShiroSecurityExtension implements Extension {
    @ShiroSecureAnnotation
    public static class ShiroSecureAnnotated { };

    public <T> void addSecurity(@Observes @WithAnnotations({
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `core/src/main/java/org/apache/shiro/mgt/AbstractRememberMeManager.java`
#### Snippet
```java
     * Cipher to use for encrypting/decrypting serialized byte arrays for added security
     */
    private CipherService cipherService = new AesCipherService();;

    /**
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `core/src/main/java/org/apache/shiro/realm/jdbc/JdbcRealm.java`
#### Snippet
```java
     *       to get the salt</li></ul>
     */
    public enum SaltStyle {NO_SALT, CRYPT, COLUMN, EXTERNAL};

    /*--------------------------------------------
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/SimpleHash.java`
#### Snippet
```java
    @Override
    protected byte[] hash(byte[] bytes) throws UnknownAlgorithmException {
        return hash(bytes, null, DEFAULT_ITERATIONS);
    }

```

### DataFlowIssue
Dereference of `warFiles` may produce `NullPointerException`
in `integration-tests/support/src/main/java/org/apache/shiro/testing/web/AbstractContainerIT.java`
#### Snippet
```java
        });

        assertEquals("Expected only one war file in target directory, run 'mvn clean' and try again", 1, warFiles.length);

        return warFiles[0].getAbsolutePath().replaceFirst("\\.war$", "");
```

### DataFlowIssue
Method invocation `openStream` may produce `NullPointerException`
in `integration-tests/support/src/main/java/org/apache/shiro/testing/web/AbstractContainerIT.java`
#### Snippet
```java
            Path outKeyStoreFile = File.createTempFile("test-keystore", "jks").toPath();
            URL keyStoreResource = Thread.currentThread().getContextClassLoader().getResource("test-keystore.jks");
            Files.copy(keyStoreResource.openStream(), outKeyStoreFile, StandardCopyOption.REPLACE_EXISTING);
            File keyStoreFile = outKeyStoreFile.toFile();

```

### DataFlowIssue
Method invocation `getSession` may produce `NullPointerException`
in `web/src/main/java/org/apache/shiro/web/session/mgt/ServletContainerSessionManager.java`
#### Snippet
```java
        HttpServletRequest request = WebUtils.getHttpRequest(sessionContext);

        HttpSession httpSession = request.getSession();

        //SHIRO-240: DO NOT use the 'globalSessionTimeout' value here on the acquired session.
```

### DataFlowIssue
Method invocation `getSession` may produce `NullPointerException`
in `web/src/main/java/org/apache/shiro/web/session/mgt/ServletContainerSessionManager.java`
#### Snippet
```java
        Session session = null;

        HttpSession httpSession = request.getSession(false);
        if (httpSession != null) {
            session = createSession(httpSession, request.getRemoteHost());
```

### DataFlowIssue
Method invocation `removeAttribute` may produce `NullPointerException`
in `web/src/main/java/org/apache/shiro/web/session/mgt/DefaultWebSessionManager.java`
#### Snippet
```java
        }

        request.removeAttribute(ShiroHttpServletRequest.REFERENCED_SESSION_ID_SOURCE);
        request.setAttribute(ShiroHttpServletRequest.REFERENCED_SESSION_IS_NEW, Boolean.TRUE);
    }
```

### DataFlowIssue
Array access `kvPair[0]` may produce `NullPointerException`
in `config/core/src/main/java/org/apache/shiro/config/Ini.java`
#### Snippet
```java
                lineBuffer = new StringBuilder();
                String[] kvPair = splitKeyValue(line);
                props.put(kvPair[0], kvPair[1]);
            }

```

### DataFlowIssue
Method invocation `attr` may produce `NullPointerException`
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/FormResubmitSupport.java`
#### Snippet
```java
        Elements elts = Jsoup.parse(responseBody).select(String.format("input[name=%s]", FACES_VIEW_STATE));
        if (!elts.isEmpty()) {
            String viewState = elts.first().attr("value");

            var matcher = VIEW_STATE_PATTERN.matcher(savedFormData);
```

### DataFlowIssue
Argument `permStrings` might be null
in `core/src/main/java/org/apache/shiro/util/PermissionUtils.java`
#### Snippet
```java
    public static Set<Permission> resolveDelimitedPermissions(String s, PermissionResolver permissionResolver) {
        Set<String> permStrings = toPermissionStrings(s);
        return resolvePermissions(permStrings, permissionResolver);
    }

```

### DataFlowIssue
Variable is already assigned to this value
in `lang/src/main/java/org/apache/shiro/lang/io/ResourceUtils.java`
#### Snippet
```java
            exists = true;
        } catch (IOException e) {
            stream = null;
        } finally {
            if (stream != null) {
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `web/src/main/java/org/apache/shiro/web/filter/mgt/DefaultFilterChainManager.java`
#### Snippet
```java
        if (!getChainNames().contains(chainName) && !CollectionUtils.isEmpty(globalFilterNames)) {
            // add each of global filters
            globalFilterNames.stream().forEach(filterName -> addToChain(chainName, filterName));
        }
    }
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `web/src/main/java/org/apache/shiro/web/filter/mgt/DefaultFilterChainManager.java`
#### Snippet
```java
        // first add each of global filters
        if (!CollectionUtils.isEmpty(globalFilterNames)) {
            globalFilterNames.stream().forEach(filterName -> addToChain(chainName, filterName));
        }

```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary string length argument
in `config/ogdl/src/main/java/org/apache/shiro/config/ogdl/ReflectionBuilder.java`
#### Snippet
```java
        if (index >= 0) {
            String name = key.substring(0, index);
            String property = key.substring(index + 1, key.length());

            if (GLOBAL_PROPERTY_PREFIX.equalsIgnoreCase(name)) {
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `core/src/main/java/org/apache/shiro/realm/text/PropertiesRealm.java`
#### Snippet
```java

    protected String getName(String key, String prefix) {
        return key.substring(prefix.length(), key.length());
    }

```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'HexFormat' is still used
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/format/HexFormat.java`
#### Snippet
```java
 */
@Deprecated
public class HexFormat implements HashFormat {

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'Base64Format' is still used
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/format/Base64Format.java`
#### Snippet
```java
 */
@Deprecated
public class Base64Format implements HashFormat {

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'WebIniSecurityManagerFactory' is still used
in `web/src/main/java/org/apache/shiro/web/config/WebIniSecurityManagerFactory.java`
#### Snippet
```java
 */
@Deprecated
public class WebIniSecurityManagerFactory extends IniSecurityManagerFactory {

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'getRequestUri' is still used
in `web/src/main/java/org/apache/shiro/web/util/WebUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static String getRequestUri(HttpServletRequest request) {
        String uri = (String) request.getAttribute(INCLUDE_REQUEST_URI_ATTRIBUTE);
        if (uri == null) {
```

### DeprecatedIsStillUsed
Deprecated member 'sessionMode' is still used
in `web/src/main/java/org/apache/shiro/web/mgt/DefaultWebSecurityManager.java`
#### Snippet
```java
     */
    @Deprecated
    private String sessionMode;

    public DefaultWebSecurityManager() {
```

### DeprecatedIsStillUsed
Deprecated member 'HTTP_SESSION_MODE' is still used
in `web/src/main/java/org/apache/shiro/web/mgt/DefaultWebSecurityManager.java`
#### Snippet
```java

    @Deprecated
    public static final String HTTP_SESSION_MODE = "http";
    @Deprecated
    public static final String NATIVE_SESSION_MODE = "native";
```

### DeprecatedIsStillUsed
Deprecated member 'setSessionMode' is still used
in `web/src/main/java/org/apache/shiro/web/mgt/DefaultWebSecurityManager.java`
#### Snippet
```java
     */
    @Deprecated
    public void setSessionMode(String sessionMode) {
        log.warn("The 'sessionMode' property has been deprecated.  Please configure an appropriate WebSessionManager " +
                "instance instead of using this property.  This property/method will be removed in a later version.");
```

### DeprecatedIsStillUsed
Deprecated member 'NATIVE_SESSION_MODE' is still used
in `web/src/main/java/org/apache/shiro/web/mgt/DefaultWebSecurityManager.java`
#### Snippet
```java
    public static final String HTTP_SESSION_MODE = "http";
    @Deprecated
    public static final String NATIVE_SESSION_MODE = "native";

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'IniShiroFilter' is still used
in `web/src/main/java/org/apache/shiro/web/servlet/IniShiroFilter.java`
#### Snippet
```java
 */
@Deprecated
public class IniShiroFilter extends AbstractShiroFilter {

    public static final String CONFIG_INIT_PARAM_NAME = "config";
```

### DeprecatedIsStillUsed
Deprecated member 'shouldNotFilter' is still used
in `web/src/main/java/org/apache/shiro/web/servlet/OncePerRequestFilter.java`
#### Snippet
```java
    @Deprecated
    @SuppressWarnings({"UnusedDeclaration"})
    protected boolean shouldNotFilter(ServletRequest request) throws ServletException {
        return false;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'Sha512CredentialsMatcher' is still used
in `core/src/main/java/org/apache/shiro/authc/credential/Sha512CredentialsMatcher.java`
#### Snippet
```java
 *             {@link HashedCredentialsMatcher#setHashAlgorithmName(String) hashAlgorithmName} property.
 */
public class Sha512CredentialsMatcher extends HashedCredentialsMatcher {

    public Sha512CredentialsMatcher() {
```

### DeprecatedIsStillUsed
Deprecated member 'Sha384CredentialsMatcher' is still used
in `core/src/main/java/org/apache/shiro/authc/credential/Sha384CredentialsMatcher.java`
#### Snippet
```java
 *             {@link HashedCredentialsMatcher#setHashAlgorithmName(String) hashAlgorithmName} property.
 */
public class Sha384CredentialsMatcher extends HashedCredentialsMatcher {

    public Sha384CredentialsMatcher() {
```

### DeprecatedIsStillUsed
Deprecated member 'getSalt' is still used
in `core/src/main/java/org/apache/shiro/authc/credential/HashedCredentialsMatcher.java`
#### Snippet
```java
     */
    @Deprecated
    protected Object getSalt(AuthenticationToken token) {
        return token.getPrincipal();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'isHashSalted' is still used
in `core/src/main/java/org/apache/shiro/authc/credential/HashedCredentialsMatcher.java`
#### Snippet
```java
     */
    @Deprecated
    public boolean isHashSalted() {
        return hashSalted;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setHashSalted' is still used
in `core/src/main/java/org/apache/shiro/authc/credential/HashedCredentialsMatcher.java`
#### Snippet
```java
     */
    @Deprecated
    public void setHashSalted(boolean hashSalted) {
        this.hashSalted = hashSalted;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'Sha256CredentialsMatcher' is still used
in `core/src/main/java/org/apache/shiro/authc/credential/Sha256CredentialsMatcher.java`
#### Snippet
```java
 *             {@link HashedCredentialsMatcher#setHashAlgorithmName(String) hashAlgorithmName} property.
 */
public class Sha256CredentialsMatcher extends HashedCredentialsMatcher {

    public Sha256CredentialsMatcher() {
```

### DeprecatedIsStillUsed
Deprecated member 'IniFactorySupport' is still used
in `core/src/main/java/org/apache/shiro/ini/IniFactorySupport.java`
#### Snippet
```java
 */
@Deprecated
public abstract class IniFactorySupport<T> extends AbstractFactory<T> {

    public static final String DEFAULT_INI_RESOURCE_PATH = "classpath:shiro.ini";
```

### DeprecatedIsStillUsed
Deprecated member 'FilterConfigKey' is still used
in `support/guice/src/main/java/org/apache/shiro/guice/web/ShiroWebModule.java`
#### Snippet
```java

    @Deprecated
    private static class FilterConfigKey<T extends PathMatchingFilter> extends Key<T> {
        private Key<T> key;
        private String configValue;
```

### DeprecatedIsStillUsed
Deprecated member 'addFilterChain' is still used
in `support/guice/src/main/java/org/apache/shiro/guice/web/ShiroWebModule.java`
#### Snippet
```java
    @SuppressWarnings({"UnusedDeclaration"})
    @Deprecated
    protected final void addFilterChain(String pattern, Key<? extends Filter>... keys) {

        // We need to extract the keys and FilterConfigKey and convert to the new format.
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `support/cdi/src/main/java/org/apache/shiro/cdi/AnnotatedTypeWrapper.java`
#### Snippet
```java
    @Override
    public boolean isAnnotationPresent(Class<? extends Annotation> annotationType) {
        return annotations.stream().anyMatch(annotation -> annotationType.isInstance(annotation));
    }

```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'bean' in a Serializable class
in `config/ogdl/src/main/java/org/apache/shiro/config/ogdl/event/BeanEvent.java`
#### Snippet
```java

    private String beanName;
    private Object bean;
    private final Map<String, Object> beanContext;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'credentials' in a Serializable class
in `core/src/main/java/org/apache/shiro/authc/SimpleAuthenticationInfo.java`
#### Snippet
```java
     * The credentials verifying the account principals.
     */
    protected Object credentials;

    /**
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `integration-tests/support/src/main/java/org/apache/shiro/testing/web/AbstractContainerIT.java`
#### Snippet
```java
             * https://github.com/mjeanroy/junit-servers/pull/3
             */
            protected WebAppContext createdWebAppContext() throws Exception {
                final String path = configuration.getPath();
                final String webapp = configuration.getWebapp();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `support/spring/src/main/java/org/apache/shiro/spring/web/ShiroFilterFactoryBean.java`
#### Snippet
```java
    private static final class SpringShiroFilter extends AbstractShiroFilter {

        protected SpringShiroFilter(WebSecurityManager webSecurityManager, FilterChainResolver resolver, ShiroFilterConfiguration filterConfiguration) {
            super();
            if (webSecurityManager == null) {
```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `segment`
in `core/src/main/java/org/apache/shiro/util/AntPathMatcher.java`
#### Snippet
```java
            String patternPart = patternParts[segment];
            if (patternPart.indexOf('*') > -1 || patternPart.indexOf('?') > -1) {
                for (; segment < pathParts.length; segment++) {
                    if (pathStarted || (segment == 0 && !pattern.startsWith(this.pathSeparator))) {
                        builder.append(this.pathSeparator);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `j`
in `lang/src/main/java/org/apache/shiro/lang/codec/Hex.java`
#### Snippet
```java
        for (int i = 0, j = 0; j < len; i++) {
            int f = toDigit(data[j], j) << 4;
            j++;
            f = f | toDigit(data[j], j);
            j++;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `j`
in `lang/src/main/java/org/apache/shiro/lang/codec/Hex.java`
#### Snippet
```java
            j++;
            f = f | toDigit(data[j], j);
            j++;
            out[i] = (byte) (f & 0xFF);
        }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `j`
in `lang/src/main/java/org/apache/shiro/lang/codec/Hex.java`
#### Snippet
```java
        // two characters form the hex value.
        for (int i = 0, j = 0; i < l; i++) {
            out[j++] = DIGITS[(0xF0 & data[i]) >>> 4];
            out[j++] = DIGITS[0x0F & data[i]];
        }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `j`
in `lang/src/main/java/org/apache/shiro/lang/codec/Hex.java`
#### Snippet
```java
        for (int i = 0, j = 0; i < l; i++) {
            out[j++] = DIGITS[(0xF0 & data[i]) >>> 4];
            out[j++] = DIGITS[0x0F & data[i]];
        }

```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `lang/src/main/java/org/apache/shiro/lang/util/StringUtils.java`
#### Snippet
```java
                    // put one on the token. we do *not* exit the quoted text.
                    sb.append(line.charAt(i + 1));
                    i++;
                } else {
                    inQuotes = !inQuotes;
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `HSTS` may be 'static'
in `web/src/main/java/org/apache/shiro/web/filter/authz/SslFilter.java`
#### Snippet
```java
     * Helper class for HTTP Strict Transport Security (HSTS)
     */
    public class HSTS {
        
        public static final String HTTP_HEADER = "Strict-Transport-Security";
```

### InnerClassMayBeStatic
Inner class `ObjectPrincipal` may be 'static'
in `web/src/main/java/org/apache/shiro/web/servlet/ShiroHttpServletRequest.java`
#### Snippet
```java
    }

    private class ObjectPrincipal implements java.security.Principal {
        private Object object = null;

```

### InnerClassMayBeStatic
Inner class `ObjectPrincipal` may be 'static'
in `support/jaxrs/src/main/java/org/apache/shiro/web/jaxrs/ShiroSecurityContext.java`
#### Snippet
```java
     * Java Principal wrapper around any Shiro Principal object.s
     */
    private class ObjectPrincipal implements Principal {
        private Object object = null;

```

### InnerClassMayBeStatic
Inner class `Subscription` may be 'static'
in `event/src/main/java/org/apache/shiro/event/support/DefaultEventBus.java`
#### Snippet
```java
    }

    private class Subscription {

        private final List<EventListener> listeners;
```

### InnerClassMayBeStatic
Inner class `EventBusAwareTypeListener` may be 'static'
in `support/guice/src/main/java/org/apache/shiro/guice/ShiroModule.java`
#### Snippet
```java
    }

    private class EventBusAwareTypeListener implements TypeListener {
        @Override
        public <I> void hear(TypeLiteral<I> typeLiteral, TypeEncounter<I> typeEncounter) {
```

### InnerClassMayBeStatic
Inner class `SubscribedEventTypeListener` may be 'static'
in `support/guice/src/main/java/org/apache/shiro/guice/ShiroModule.java`
#### Snippet
```java
    }

    private class SubscribedEventTypeListener implements TypeListener {
        @Override
        public <I> void hear(TypeLiteral<I> typeLiteral, TypeEncounter<I> typeEncounter) {
```

### InnerClassMayBeStatic
Inner class `StoppingAwareProxiedSession` may be 'static'
in `core/src/main/java/org/apache/shiro/subject/support/DelegatingSubject.java`
#### Snippet
```java
    }

    private class StoppingAwareProxiedSession extends ProxiedSession {

        private final DelegatingSubject owner;
```

## RuleId[id=Java9CollectionFactory]
### Java9CollectionFactory
Can be replaced with 'List.of()' call
in `web/src/main/java/org/apache/shiro/web/filter/InvalidRequestFilter.java`
#### Snippet
```java
public class InvalidRequestFilter extends AccessControlFilter {

    private static final List<String> SEMICOLON = Collections.unmodifiableList(Arrays.asList(";", "%3b", "%3B"));

    private static final List<String> BACKSLASH = Collections.unmodifiableList(Arrays.asList("\\", "%5c", "%5C"));
```

### Java9CollectionFactory
Can be replaced with 'List.of()' call
in `web/src/main/java/org/apache/shiro/web/filter/InvalidRequestFilter.java`
#### Snippet
```java
    private static final List<String> SEMICOLON = Collections.unmodifiableList(Arrays.asList(";", "%3b", "%3B"));

    private static final List<String> BACKSLASH = Collections.unmodifiableList(Arrays.asList("\\", "%5c", "%5C"));

    private boolean blockSemicolon = true;
```

### Java9CollectionFactory
Can be replaced with 'List.copyOf()' call
in `core/src/main/java/org/apache/shiro/subject/SimplePrincipalCollection.java`
#### Snippet
```java
            return Collections.EMPTY_LIST;
        }
        return Collections.unmodifiableList(new ArrayList(all));
    }

```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `core/src/main/java/org/apache/shiro/realm/SimpleAccountRealm.java`
#### Snippet
```java

    protected static Set<String> toSet(String delimited, String delimiter) {
        if (delimited == null || delimited.trim().equals("")) {
            return null;
        }
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `config/ogdl/src/main/java/org/apache/shiro/config/ogdl/ReflectionBuilder.java`
#### Snippet
```java

    @SuppressWarnings({"unchecked"})
    public Map<String, ?> buildObjects(Map<String, String> kvPairs) {

        if (kvPairs != null && !kvPairs.isEmpty()) {
```

### RedundantSuppression
Redundant suppression
in `core/src/main/java/org/apache/shiro/ini/IniSecurityManagerFactory.java`
#### Snippet
```java

    @SuppressWarnings({"unchecked"})
    private SecurityManager createSecurityManager(Ini ini, Ini.Section mainSection) {

        getReflectionBuilder().setObjects(createDefaults(ini, mainSection));
```

### RedundantSuppression
Redundant suppression
in `core/src/main/java/org/apache/shiro/mgt/DefaultSecurityManager.java`
#### Snippet
```java
     */
    @SuppressWarnings({"unchecked"})
    protected SubjectContext ensureSecurityManager(SubjectContext context) {
        if (context.resolveSecurityManager() != null) {
            log.trace("Context already contains a SecurityManager instance.  Returning.");
```

### RedundantSuppression
Redundant suppression
in `core/src/main/java/org/apache/shiro/mgt/DefaultSecurityManager.java`
#### Snippet
```java
     */
    @SuppressWarnings({"unchecked"})
    protected SubjectContext resolveSession(SubjectContext context) {
        if (context.resolveSession() != null) {
            log.debug("Context already contains a session.  Returning.");
```

### RedundantSuppression
Redundant suppression
in `core/src/main/java/org/apache/shiro/mgt/DefaultSecurityManager.java`
#### Snippet
```java
     */
    @SuppressWarnings({"unchecked"})
    protected SubjectContext resolvePrincipals(SubjectContext context) {

        PrincipalCollection principals = context.resolvePrincipals();
```

### RedundantSuppression
Redundant suppression
in `core/src/main/java/org/apache/shiro/realm/text/PropertiesRealm.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    private void restart() {
        if (resourcePath == null || resourcePath.length() == 0) {
            throw new IllegalStateException("The resourcePath property is not set.  " +
```

### RedundantSuppression
Redundant suppression
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/HashProvider.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    private static ServiceLoader<HashSpi> load() {
        return ServiceLoader.load(HashSpi.class);
    }
```

### RedundantSuppression
Redundant suppression
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/SimpleHash.java`
#### Snippet
```java
     */
    public SimpleHash(String algorithmName, Object source) throws CodecException, UnknownAlgorithmException {
        //noinspection NullableProblems
        this(algorithmName, source, SimpleByteSource.empty(), DEFAULT_ITERATIONS);
    }
```

### RedundantSuppression
Redundant suppression
in `integration-tests/jakarta-ee/src/main/java/org/apache/shiro/testing/jakarta/ee/PropertyRealm.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("MagicNumber")
    protected void processUserDefinitions(Map<String, String> userDefs) {
        if (userDefs == null || userDefs.isEmpty()) {
            return;
```

### RedundantSuppression
Redundant suppression
in `lang/src/main/java/org/apache/shiro/lang/util/SoftHashMap.java`
#### Snippet
```java
     */
    @SuppressWarnings({"unchecked"})
    public SoftHashMap(int retentionSize) {
        super();
        RETENTION_SIZE = Math.max(0, retentionSize);
```

### RedundantSuppression
Redundant suppression
in `lang/src/main/java/org/apache/shiro/lang/util/SoftHashMap.java`
#### Snippet
```java
            if (result == null) {
                //The wrapped value was garbage collected, so remove this entry from the backing map:
                //noinspection SuspiciousMethodCalls
                map.remove(key);
            } else {
```

### RedundantSuppression
Redundant suppression
in `lang/src/main/java/org/apache/shiro/lang/util/SoftHashMap.java`
#### Snippet
```java
        SoftValue sv;
        while ((sv = (SoftValue) queue.poll()) != null) {
            //noinspection SuspiciousMethodCalls
            map.remove(sv.key); // we can access private data!
        }
```

### RedundantSuppression
Redundant suppression
in `support/guice/src/main/java/org/apache/shiro/guice/web/ShiroWebModule.java`
#### Snippet
```java
    @SuppressWarnings({"unchecked"})
    @Override
    protected final void bindSecurityManager(AnnotatedBindingBuilder<? super SecurityManager> bind) {
        bind.to(WebSecurityManager.class); // SHIRO-435
    }
```

### RedundantSuppression
Redundant suppression
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/faces/tags/PrincipalTag.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("MagicNumber")
    public Object saveState(FacesContext context) {
        if (values == null) {
            values = new Object[4];
```

### RedundantSuppression
Redundant suppression
in `web/src/main/java/org/apache/shiro/web/filter/PathMatchingFilter.java`
#### Snippet
```java
     */
    @SuppressWarnings({"JavaDoc"})
    private boolean isFilterChainContinued(ServletRequest request, ServletResponse response,
                                           String path, Object pathConfig) throws Exception {

```

### RedundantSuppression
Redundant suppression
in `web/src/main/java/org/apache/shiro/web/filter/authz/RolesAuthorizationFilter.java`
#### Snippet
```java

    @SuppressWarnings({"unchecked"})
    public boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) throws IOException {

        Subject subject = getSubject(request, response);
```

### RedundantSuppression
Redundant suppression
in `web/src/main/java/org/apache/shiro/web/filter/mgt/SimpleNamedFilterList.java`
#### Snippet
```java

    public <T> T[] toArray(T[] a) {
        //noinspection SuspiciousToArrayCall
        return this.backingList.toArray(a);
    }
```

### RedundantSuppression
Redundant suppression
in `web/src/main/java/org/apache/shiro/web/servlet/OncePerRequestFilter.java`
#### Snippet
```java
            log.trace("Filter '{}' already executed.  Proceeding without invoking this filter.", getName());
            filterChain.doFilter(request, response);
        } else //noinspection deprecation
            if (/* added in 1.2: */ !isEnabled(request, response) ||
                /* retain backwards compatibility: */ shouldNotFilter(request) ) {
```

### RedundantSuppression
Redundant suppression
in `web/src/main/java/org/apache/shiro/web/tags/PrincipalTag.java`
#### Snippet
```java

    @SuppressWarnings({"unchecked"})
    public int onDoStartTag() throws JspException {
        String strValue = null;

```

## RuleId[id=UnnecessaryInitCause]
### UnnecessaryInitCause
Unnecessary `Throwable.initCause()` call
in `web/src/main/java/org/apache/shiro/web/servlet/ShiroHttpServletResponse.java`
#### Snippet
```java
            } catch (IOException e) {
                IllegalArgumentException iae = new IllegalArgumentException(location);
                iae.initCause(e);
                throw iae;
            }
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `config/ogdl/src/main/java/org/apache/shiro/config/ogdl/ReflectionBuilder.java`
#### Snippet
```java
                } else {
                    //must be an array property.  Convert the key string to an index:
                    int index = Integer.valueOf(keyString);
                    setIndexedProperty(object, mapPropertyPath, index, value);
                }
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `config/ogdl/src/main/java/org/apache/shiro/config/ogdl/ReflectionBuilder.java`
#### Snippet
```java
            } else {
                //must be an array property:
                int index = Integer.valueOf(keyString);
                referencedValue = getIndexedProperty(object, mapPropertyPath, index);
            }
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'propertyPincipal'
in `integration-tests/jakarta-ee/src/main/java/org/apache/shiro/testing/cdi/ComponentInjectionBean.java`
#### Snippet
```java
    @Inject
    @Principal
    Optional<PropertyPrincipal> propertyPincipal;
}

```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `web/src/main/java/org/apache/shiro/web/filter/authz/HttpMethodPermissionFilter.java`
#### Snippet
```java
     */
    protected String[] buildPermissions(String[] configuredPerms, String action) {
        if (configuredPerms == null || configuredPerms.length <= 0 || !StringUtils.hasText(action)) {
            return configuredPerms;
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `config/ogdl/src/main/java/org/apache/shiro/config/ogdl/ReflectionBuilder.java`
#### Snippet
```java
        String[] tokens = StringUtils.split(sValue, StringUtils.DEFAULT_DELIMITER_CHAR,
                StringUtils.DEFAULT_QUOTE_CHAR, StringUtils.DEFAULT_QUOTE_CHAR, true, true);
        if (tokens == null || tokens.length <= 0) {
            return null;
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `config/ogdl/src/main/java/org/apache/shiro/config/ogdl/ReflectionBuilder.java`
#### Snippet
```java
    protected List<?> toList(String sValue) {
        String[] tokens = StringUtils.split(sValue);
        if (tokens == null || tokens.length <= 0) {
            return null;
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `config/ogdl/src/main/java/org/apache/shiro/config/ogdl/ReflectionBuilder.java`
#### Snippet
```java

        String[] tokens = StringUtils.split(sValue);
        if (tokens == null || tokens.length <= 0) {
            return null;
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `config/ogdl/src/main/java/org/apache/shiro/config/ogdl/ReflectionBuilder.java`
#### Snippet
```java
    protected Set<?> toSet(String sValue) {
        String[] tokens = StringUtils.split(sValue);
        if (tokens == null || tokens.length <= 0) {
            return null;
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core/src/main/java/org/apache/shiro/realm/ldap/JndiLdapContextFactory.java`
#### Snippet
```java
                // http://docs.oracle.com/javase/tutorial/jndi/ldap/faq.html
                if( credentials == null ||
                    (credentials instanceof byte[] && ((byte[])credentials).length <= 0) || // empty byte[]
                    (credentials instanceof char[] && ((char[])credentials).length <= 0) || // empty char[]
                    (String.class.isInstance(credentials) && !StringUtils.hasText(String.valueOf(credentials)))) {
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core/src/main/java/org/apache/shiro/realm/ldap/JndiLdapContextFactory.java`
#### Snippet
```java
                if( credentials == null ||
                    (credentials instanceof byte[] && ((byte[])credentials).length <= 0) || // empty byte[]
                    (credentials instanceof char[] && ((char[])credentials).length <= 0) || // empty char[]
                    (String.class.isInstance(credentials) && !StringUtils.hasText(String.valueOf(credentials)))) {

```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `integration-tests/support/src/main/java/org/apache/shiro/testing/web/AbstractContainerIT.java`
#### Snippet
```java
        String authorizationHeader = username + ":" + password;
        byte[] valueBytes;
        valueBytes = authorizationHeader.getBytes("UTF-8");
        authorizationHeader = new String(Base64.encode(valueBytes));
        return "Basic " + authorizationHeader;
```

## RuleId[id=MissingDeprecatedAnnotation]
### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `core/src/main/java/org/apache/shiro/authc/credential/Sha512CredentialsMatcher.java`
#### Snippet
```java
 *             {@link HashedCredentialsMatcher#setHashAlgorithmName(String) hashAlgorithmName} property.
 */
public class Sha512CredentialsMatcher extends HashedCredentialsMatcher {

    public Sha512CredentialsMatcher() {
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `core/src/main/java/org/apache/shiro/authc/credential/Sha384CredentialsMatcher.java`
#### Snippet
```java
 *             {@link HashedCredentialsMatcher#setHashAlgorithmName(String) hashAlgorithmName} property.
 */
public class Sha384CredentialsMatcher extends HashedCredentialsMatcher {

    public Sha384CredentialsMatcher() {
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `core/src/main/java/org/apache/shiro/authc/credential/Sha256CredentialsMatcher.java`
#### Snippet
```java
 *             {@link HashedCredentialsMatcher#setHashAlgorithmName(String) hashAlgorithmName} property.
 */
public class Sha256CredentialsMatcher extends HashedCredentialsMatcher {

    public Sha256CredentialsMatcher() {
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `core/src/main/java/org/apache/shiro/realm/ldap/JndiLdapRealm.java`
#### Snippet
```java
 *
 */
public class JndiLdapRealm extends DefaultLdapRealm {

}
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `lang/src/main/java/org/apache/shiro/lang/io/XmlSerializer.java`
#### Snippet
```java
 * @deprecated This class should not be used directly because of unsecure XMLEncoder/XMLDecoder usage.
 */
public class XmlSerializer implements Serializer {

    /**
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'val != null' covered by subsequent condition 'val instanceof Boolean'
in `web/src/main/java/org/apache/shiro/web/util/WebUtils.java`
#### Snippet
```java
        if (request != null) {
            Object val = request.getAttribute(DefaultSubjectContext.SESSION_CREATION_ENABLED);
            if (val != null && val instanceof Boolean) {
                return (Boolean) val;
            }
```

### ConditionCoveredByFurtherCondition
Condition 'token != null' covered by subsequent condition 'token instanceof RememberMeAuthenticationToken'
in `core/src/main/java/org/apache/shiro/mgt/AbstractRememberMeManager.java`
#### Snippet
```java
     */
    protected boolean isRememberMe(AuthenticationToken token) {
        return token != null && (token instanceof RememberMeAuthenticationToken) &&
                ((RememberMeAuthenticationToken) token).isRememberMe();
    }
```

### ConditionCoveredByFurtherCondition
Condition 'value != null' covered by subsequent condition 'value instanceof EventBus'
in `config/ogdl/src/main/java/org/apache/shiro/config/ogdl/ReflectionBuilder.java`
#### Snippet
```java
        //prefer a named object first:
        Object value = objects.get(EVENT_BUS_NAME);
        if (value != null && value instanceof EventBus) {
            return (EventBus)value;
        }
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `integration-tests/support/src/main/java/org/apache/shiro/testing/web/AbstractContainerIT.java`
#### Snippet
```java
        assertEquals("Expected only one war file in target directory, run 'mvn clean' and try again", 1, warFiles.length);

        return warFiles[0].getAbsolutePath().replaceFirst("\\.war$", "");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/FormResubmitSupportCookies.java`
#### Snippet
```java

    static Map<String, String> transformCookieHeader(@NonNull List<String> cookies) {
        return cookies.stream().map(s -> s.split("[=;]"))
                .collect(Collectors.toMap(k -> k[0], v -> (v.length > 1) ? v[1] : ""));
    }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/FormResubmitSupport.java`
#### Snippet
```java
        if (referer != null) {
            // do not switch to https if custom port is specified
            if (!referer.matches("^http:\\/\\/[A-z|.|[0-9]]+:[0-9]+(\\/.*|$)")) {
                referer = referer.replaceFirst("^http:", "https:");
            }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/FormResubmitSupport.java`
#### Snippet
```java
            // do not switch to https if custom port is specified
            if (!referer.matches("^http:\\/\\/[A-z|.|[0-9]]+:[0-9]+(\\/.*|$)")) {
                referer = referer.replaceFirst("^http:", "https:");
            }
        }
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/AbstractSymmetricCipherService.java`
#### Snippet
```java

    /**
     * Generates a new {@link java.security.Key Key} suitable for this CipherService's {@link #getAlgorithmName() algorithm}
     * by calling {@link #generateNewKey(int) generateNewKey(128)} (uses a 128 bit size by default).
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/AbstractSymmetricCipherService.java`
#### Snippet
```java
     * by calling {@link #generateNewKey(int) generateNewKey(128)} (uses a 128 bit size by default).
     *
     * @return a new {@link java.security.Key Key}, 128 bits in length.
     */
    public Key generateNewKey() {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary and can be removed
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/AbstractSymmetricCipherService.java`
#### Snippet
```java
    /**
     * Generates a new {@link Key Key} of the specified size suitable for this CipherService
     * (based on the {@link #getAlgorithmName() algorithmName} using the JDK {@link javax.crypto.KeyGenerator KeyGenerator}.
     *
     * @param keyBitSize the bit size of the key to create
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.crypto.hash` is unnecessary and can be removed
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/HashService.java`
#### Snippet
```java
     *
     * If a salt accompanies the return value
     * (i.e. <code>returnedHash.{@link org.apache.shiro.crypto.hash.Hash#getSalt() getSalt()} != null</code>), this
     * same exact salt <b><em>MUST</em></b> be presented back to the {@code HashService} if hash
     * comparison/verification will be performed at a later time (for example, for password hash or file checksum
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.crypto.hash` is unnecessary and can be removed
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/DefaultHashService.java`
#### Snippet
```java
     * This implementation functions as follows:
     * <ul>
     * <li>If the request's {@link org.apache.shiro.crypto.hash.HashRequest#getSalt() salt} is null:
     * <p/>
     * A salt will be generated and used to compute the hash.  The salt is generated as follows:
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary, and can be replaced with an import
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/JcaCipherService.java`
#### Snippet
```java
    private ByteSource encrypt(byte[] plaintext, byte[] key, byte[] iv, boolean prependIv) throws CryptoException {

        final int MODE = javax.crypto.Cipher.ENCRYPT_MODE;

        byte[] output;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary, and can be replaced with an import
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/JcaCipherService.java`
#### Snippet
```java
        }

        javax.crypto.Cipher cipher = initNewCipher(cryptMode, keyBytes, iv, true);

        CipherInputStream cis = new CipherInputStream(in, cipher);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/JcaCipherService.java`
#### Snippet
```java
    protected static SecureRandom getDefaultSecureRandom() {
        try {
            return java.security.SecureRandom.getInstance(RANDOM_NUM_GENERATOR_ALGORITHM_NAME);
        } catch (java.security.NoSuchAlgorithmException e) {
            log.debug("The SecureRandom SHA1PRNG algorithm is not available on the current platform.  Using the " +
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/JcaCipherService.java`
#### Snippet
```java
        try {
            return java.security.SecureRandom.getInstance(RANDOM_NUM_GENERATOR_ALGORITHM_NAME);
        } catch (java.security.NoSuchAlgorithmException e) {
            log.debug("The SecureRandom SHA1PRNG algorithm is not available on the current platform.  Using the " +
                    "platform's default SecureRandom algorithm.", e);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/JcaCipherService.java`
#### Snippet
```java
            log.debug("The SecureRandom SHA1PRNG algorithm is not available on the current platform.  Using the " +
                    "platform's default SecureRandom algorithm.", e);
            return new java.security.SecureRandom();
        }
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary, and can be replaced with an import
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/JcaCipherService.java`
#### Snippet
```java
        }

        crypt(in, out, key, iv, javax.crypto.Cipher.ENCRYPT_MODE);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/JcaCipherService.java`
#### Snippet
```java
    /**
     * Returns the size in bytes of the internal buffer used to transfer data from one stream to another during stream
     * operations ({@link #encrypt(java.io.InputStream, java.io.OutputStream, byte[])} and
     * {@link #decrypt(java.io.InputStream, java.io.OutputStream, byte[])}).
     * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/JcaCipherService.java`
#### Snippet
```java
    /**
     * Returns the size in bytes of the internal buffer used to transfer data from one stream to another during stream
     * operations ({@link #encrypt(java.io.InputStream, java.io.OutputStream, byte[])} and
     * {@link #decrypt(java.io.InputStream, java.io.OutputStream, byte[])}).
     * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/JcaCipherService.java`
#### Snippet
```java
     * Returns the size in bytes of the internal buffer used to transfer data from one stream to another during stream
     * operations ({@link #encrypt(java.io.InputStream, java.io.OutputStream, byte[])} and
     * {@link #decrypt(java.io.InputStream, java.io.OutputStream, byte[])}).
     * <p/>
     * Default size is {@code 512} bytes.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/JcaCipherService.java`
#### Snippet
```java
     * Returns the size in bytes of the internal buffer used to transfer data from one stream to another during stream
     * operations ({@link #encrypt(java.io.InputStream, java.io.OutputStream, byte[])} and
     * {@link #decrypt(java.io.InputStream, java.io.OutputStream, byte[])}).
     * <p/>
     * Default size is {@code 512} bytes.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary, and can be replaced with an import
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/JcaCipherService.java`
#### Snippet
```java
     *                         {@link #getTransformationString(boolean) getTransformationString} value.
     */
    private javax.crypto.Cipher newCipherInstance(boolean streaming) throws CryptoException {
        String transformationString = getTransformationString(streaming);
        try {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary, and can be replaced with an import
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/JcaCipherService.java`
#### Snippet
```java
        String transformationString = getTransformationString(streaming);
        try {
            return javax.crypto.Cipher.getInstance(transformationString);
        } catch (Exception e) {
            String msg = "Unable to acquire a Java JCA Cipher instance using " +
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary, and can be replaced with an import
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/JcaCipherService.java`
#### Snippet
```java
        } catch (Exception e) {
            String msg = "Unable to acquire a Java JCA Cipher instance using " +
                    javax.crypto.Cipher.class.getName() + ".getInstance( \"" + transformationString + "\" ). " +
                    getAlgorithmName() + " under this configuration is required for the " +
                    getClass().getName() + " instance to function.";
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/JcaCipherService.java`
#### Snippet
```java
     * <li>Converts the specified key bytes into an {@link #getAlgorithmName() algorithm}-compatible JDK
     * {@link Key key} instance</li>
     * <li>{@link #init(javax.crypto.Cipher, int, java.security.Key, AlgorithmParameterSpec, SecureRandom) Initializes}
     * the JDK cipher instance with the JDK key</li>
     * <li>Calls the {@link #crypt(javax.crypto.Cipher, byte[]) crypt(cipher,bytes)} method to either encrypt or
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary, and can be replaced with an import
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/JcaCipherService.java`
#### Snippet
```java
            throw new IllegalArgumentException("key argument cannot be null or empty.");
        }
        javax.crypto.Cipher cipher = initNewCipher(mode, key, iv, false);
        return crypt(cipher, bytes);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/JcaCipherService.java`
#### Snippet
```java
    /**
     * Sets the size in bytes of the internal buffer used to transfer data from one stream to another during stream
     * operations ({@link #encrypt(java.io.InputStream, java.io.OutputStream, byte[])} and
     * {@link #decrypt(java.io.InputStream, java.io.OutputStream, byte[])}).
     * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/JcaCipherService.java`
#### Snippet
```java
    /**
     * Sets the size in bytes of the internal buffer used to transfer data from one stream to another during stream
     * operations ({@link #encrypt(java.io.InputStream, java.io.OutputStream, byte[])} and
     * {@link #decrypt(java.io.InputStream, java.io.OutputStream, byte[])}).
     * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/JcaCipherService.java`
#### Snippet
```java
     * Sets the size in bytes of the internal buffer used to transfer data from one stream to another during stream
     * operations ({@link #encrypt(java.io.InputStream, java.io.OutputStream, byte[])} and
     * {@link #decrypt(java.io.InputStream, java.io.OutputStream, byte[])}).
     * <p/>
     * Default size is {@code 512} bytes.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/JcaCipherService.java`
#### Snippet
```java
     * Sets the size in bytes of the internal buffer used to transfer data from one stream to another during stream
     * operations ({@link #encrypt(java.io.InputStream, java.io.OutputStream, byte[])} and
     * {@link #decrypt(java.io.InputStream, java.io.OutputStream, byte[])}).
     * <p/>
     * Default size is {@code 512} bytes.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary, and can be replaced with an import
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/JcaCipherService.java`
#### Snippet
```java
                    (ciphertext != null ? ciphertext.length : 0));
        }
        byte[] decrypted = crypt(ciphertext, key, iv, javax.crypto.Cipher.DECRYPT_MODE);
        return decrypted == null ? null : ByteSource.Util.bytes(decrypted);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary, and can be replaced with an import
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/JcaCipherService.java`
#### Snippet
```java
     * @throws CryptoException if there is an illegal block size or bad padding
     */
    private byte[] crypt(javax.crypto.Cipher cipher, byte[] bytes) throws CryptoException {
        try {
            return cipher.doFinal(bytes);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/JcaCipherService.java`
#### Snippet
```java
     * potential {@link java.security.InvalidKeyException InvalidKeyException} that might arise.
     *
     * @param cipher the JDK Cipher to {@link javax.crypto.Cipher#init(int, java.security.Key) init}.
     * @param mode   the Cipher mode
     * @param key    the Cipher's Key
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary, and can be replaced with an import
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/JcaCipherService.java`
#### Snippet
```java
     * @throws CryptoException if the key is invalid
     */
    private void init(javax.crypto.Cipher cipher, int mode, java.security.Key key,
                      AlgorithmParameterSpec spec, SecureRandom random) throws CryptoException {
        try {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/JcaCipherService.java`
#### Snippet
```java
     * @throws CryptoException if the key is invalid
     */
    private void init(javax.crypto.Cipher cipher, int mode, java.security.Key key,
                      AlgorithmParameterSpec spec, SecureRandom random) throws CryptoException {
        try {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary, and can be replaced with an import
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/JcaCipherService.java`
#### Snippet
```java

    private void decrypt(InputStream in, OutputStream out, byte[] decryptionKey, byte[] iv) throws CryptoException {
        crypt(in, out, decryptionKey, iv, javax.crypto.Cipher.DECRYPT_MODE);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary, and can be replaced with an import
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/JcaCipherService.java`
#### Snippet
```java
    }

    private javax.crypto.Cipher initNewCipher(int jcaCipherMode, byte[] key, byte[] iv, boolean streaming)
            throws CryptoException {

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary, and can be replaced with an import
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/JcaCipherService.java`
#### Snippet
```java
            throws CryptoException {

        javax.crypto.Cipher cipher = newCipherInstance(streaming);
        java.security.Key jdkKey = new SecretKeySpec(key, getAlgorithmName());
        AlgorithmParameterSpec ivSpec = null;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/JcaCipherService.java`
#### Snippet
```java

        javax.crypto.Cipher cipher = newCipherInstance(streaming);
        java.security.Key jdkKey = new SecretKeySpec(key, getAlgorithmName());
        AlgorithmParameterSpec ivSpec = null;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.lang.codec` is unnecessary and can be removed
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/AbstractHash.java`
#### Snippet
```java
     * type {@code byte[]}, {@code char[]}, {@link String}, {@link java.io.File File}, or
     * {@link java.io.InputStream InputStream}.  If either argument is anything other than these
     * types a {@link org.apache.shiro.lang.codec.CodecException CodecException} will be thrown.
     * <p/>
     * If you want to be able to hash other object types, or use other salt types, you need to override the
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/SimpleHash.java`
#### Snippet
```java
     * is not, a {@link UnknownAlgorithmException} will be thrown when the hash is performed (not at instantiation).
     *
     * @param algorithmName the {@link java.security.MessageDigest MessageDigest} algorithm name to use when
     *                      performing the hash.
     * @see UnknownAlgorithmException
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/SimpleHash.java`
#### Snippet
```java

    /**
     * Returns the {@link java.security.MessageDigest MessageDigest} algorithm name to use when performing the hash.
     *
     * @return the {@link java.security.MessageDigest MessageDigest} algorithm name to use when performing the hash.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/SimpleHash.java`
#### Snippet
```java
     * Returns the {@link java.security.MessageDigest MessageDigest} algorithm name to use when performing the hash.
     *
     * @return the {@link java.security.MessageDigest MessageDigest} algorithm name to use when performing the hash.
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/SimpleHash.java`
#### Snippet
```java
     * types.
     *
     * @param algorithmName the {@link java.security.MessageDigest MessageDigest} algorithm name to use when
     *                      performing the hash.
     * @param source        the source object to be hashed.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/SimpleHash.java`
#### Snippet
```java
     * types.
     *
     * @param algorithmName the {@link java.security.MessageDigest MessageDigest} algorithm name to use when
     *                      performing the hash.
     * @param source        the object to be hashed.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.lang.codec` is unnecessary and can be removed
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/SimpleHash.java`
#### Snippet
```java
     *                      performing the hash.
     * @param source        the object to be hashed.
     * @throws org.apache.shiro.lang.codec.CodecException
     *                                   if the specified {@code source} cannot be converted into a byte array (byte[]).
     * @throws UnknownAlgorithmException if the {@code algorithmName} is not available.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.lang.util` is unnecessary and can be removed
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/SimpleHash.java`
#### Snippet
```java
     * By default, this class only supports Object method arguments of
     * type {@code byte[]}, {@code char[]}, {@link String}, {@link java.io.File File},
     * {@link java.io.InputStream InputStream} or {@link org.apache.shiro.lang.util.ByteSource ByteSource}.  If either
     * argument is anything other than these types a {@link org.apache.shiro.lang.codec.CodecException CodecException}
     * will be thrown.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.lang.codec` is unnecessary and can be removed
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/SimpleHash.java`
#### Snippet
```java
     * type {@code byte[]}, {@code char[]}, {@link String}, {@link java.io.File File},
     * {@link java.io.InputStream InputStream} or {@link org.apache.shiro.lang.util.ByteSource ByteSource}.  If either
     * argument is anything other than these types a {@link org.apache.shiro.lang.codec.CodecException CodecException}
     * will be thrown.
     * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/SimpleHash.java`
#### Snippet
```java
     * constructor}.
     *
     * @param algorithmName  the {@link java.security.MessageDigest MessageDigest} algorithm name to use when
     *                       performing the hash.
     * @param source         the source object to be hashed.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/SimpleHash.java`
#### Snippet
```java

    /**
     * The {@link java.security.MessageDigest MessageDigest} algorithm name to use when performing the hash.
     */
    private final String algorithmName;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/SimpleHash.java`
#### Snippet
```java

/**
 * A {@code Hash} implementation that allows any {@link java.security.MessageDigest MessageDigest} algorithm name to
 * be used.  This class is a less type-safe variant than the other {@code AbstractHash} subclasses
 * (e.g. {@link Sha512Hash}, etc.), but it does allow for any algorithm name to be specified in case the other subclass
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/SimpleHash.java`
#### Snippet
```java
     * types.
     *
     * @param algorithmName  the {@link java.security.MessageDigest MessageDigest} algorithm name to use when
     *                       performing the hash.
     * @param source         the source object to be hashed.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/env/EnvironmentLoaderListener.java`
#### Snippet
```java
    /**
     * Destroys any previously created/bound {@code WebEnvironment} instance created by
     * the {@link #contextInitialized(javax.servlet.ServletContextEvent)} method.
     *
     * @param sce the ServletContextEvent triggered upon application shutdown
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/env/EnvironmentLoader.java`
#### Snippet
```java
     * Instantiates a {@link WebEnvironment} based on the specified ServletContext.
     * <p/>
     * This implementation {@link #determineWebEnvironmentClass(javax.servlet.ServletContext) determines} a
     * {@link WebEnvironment} implementation class to use.  That class is instantiated, configured, and returned.
     * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/mgt/DefaultWebSessionStorageEvaluator.java`
#### Snippet
```java
 * <p/>
 * This {@code DefaultWebSessionStorageEvaluator} will then inspect this attribute, and if it has been set, will return
 * {@code false} from {@link #isSessionStorageEnabled(org.apache.shiro.subject.Subject)} method, thereby preventing
 * Shiro from creating a session for the purpose of storing subject state.
 * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/mgt/DefaultWebSubjectFactory.java`
#### Snippet
```java

    /**
     * @deprecated since 1.2 - override {@link #createSubject(org.apache.shiro.subject.SubjectContext)} directly if you
     *             need to instantiate a custom {@link Subject} class.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.web.tags` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/tags/UserTag.java`
#### Snippet
```java
 * who they say they are.
 *
 * <p>The logically opposite tag of this one is the {@link org.apache.shiro.web.tags.GuestTag}.
 *
 * @since 0.9
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.web.tags` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/tags/NotAuthenticatedTag.java`
#### Snippet
```java
 * attempt <em>during their current session</em>.
 *
 * <p>The logically opposite tag of this one is the {@link org.apache.shiro.web.tags.AuthenticatedTag}.
 *
 * @since 0.2
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.lang.io` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/env/IniWebEnvironment.java`
#### Snippet
```java
     * Converts the specified file path to an {@link Ini} instance.
     * <p/>
     * If the path does not have a resource prefix as defined by {@link org.apache.shiro.lang.io.ResourceUtils#hasResourcePrefix(String)}, the
     * path is expected to be resolvable by the {@code ServletContext} via
     * {@link javax.servlet.ServletContext#getResourceAsStream(String)}.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/env/IniWebEnvironment.java`
#### Snippet
```java
     * If the path does not have a resource prefix as defined by {@link org.apache.shiro.lang.io.ResourceUtils#hasResourcePrefix(String)}, the
     * path is expected to be resolvable by the {@code ServletContext} via
     * {@link javax.servlet.ServletContext#getResourceAsStream(String)}.
     *
     * @param path     the path of the INI resource to load into an INI instance.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet.http` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/util/RedirectView.java`
#### Snippet
```java
     *
     * @param http10Compatible whether to stay compatible with HTTP 1.0 clients.
     * @see javax.servlet.http.HttpServletResponse#sendRedirect
     */
    public void setHttp10Compatible(boolean http10Compatible) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/util/RedirectView.java`
#### Snippet
```java
     * @return the encoded output String
     * @throws UnsupportedEncodingException if thrown by the JDK URLEncoder
     * @see java.net.URLEncoder#encode(String, String)
     * @see java.net.URLEncoder#encode(String)
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/util/RedirectView.java`
#### Snippet
```java
     * @throws UnsupportedEncodingException if thrown by the JDK URLEncoder
     * @see java.net.URLEncoder#encode(String, String)
     * @see java.net.URLEncoder#encode(String)
     */
    protected String urlEncode(String input, String encodingScheme) throws UnsupportedEncodingException {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet.http` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/util/RedirectView.java`
#### Snippet
```java
     *                        as relative to the current ServletContext, i.e. as relative to the
     *                        web application root.
     * @see javax.servlet.http.HttpServletRequest#getContextPath
     */
    public void setContextRelative(boolean contextRelative) {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet.http` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/util/RedirectView.java`
#### Snippet
```java
 * @see #setContextRelative
 * @see #setHttp10Compatible
 * @see javax.servlet.http.HttpServletResponse#sendRedirect
 * @since 0.2
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/util/RedirectView.java`
#### Snippet
```java
     * @param model          Map that contains model attributes
     * @param encodingScheme the encoding scheme to use
     * @throws java.io.UnsupportedEncodingException if string encoding failed
     * @see #urlEncode
     * @see #queryProperties
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/util/RedirectView.java`
#### Snippet
```java
     * @param request  the incoming HttpServletRequest
     * @param response the outgoing HttpServletResponse
     * @throws java.io.IOException if there is a problem issuing the redirect
     * @see #appendQueryProperties
     * @see #sendRedirect
```

### UnnecessaryFullyQualifiedName
Qualifier `com.hazelcast.core` is unnecessary and can be removed
in `support/hazelcast/src/main/java/org/apache/shiro/hazelcast/cache/HazelcastCacheManager.java`
#### Snippet
```java
     * Returns {@code true} if this {@code HazelcastCacheManager} instance implicitly created the backing
     * {@code HazelcastInstance}, or {@code false} if one was externally provided via
     * {@link #setHazelcastInstance(com.hazelcast.core.HazelcastInstance) setHazelcastInstance}.
     *
     * @return {@code true} if this {@code HazelcastCacheManager} instance implicitly created the backing
```

### UnnecessaryFullyQualifiedName
Qualifier `com.hazelcast.core` is unnecessary and can be removed
in `support/hazelcast/src/main/java/org/apache/shiro/hazelcast/cache/HazelcastCacheManager.java`
#### Snippet
```java
     * @return {@code true} if this {@code HazelcastCacheManager} instance implicitly created the backing
     *         {@code HazelcastInstance}, or {@code false} if one was externally provided via
     *         {@link #setHazelcastInstance(com.hazelcast.core.HazelcastInstance) setHazelcastInstance}.
     */
    protected final boolean isImplicitlyCreated() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.hazelcast.core` is unnecessary and can be removed
in `support/hazelcast/src/main/java/org/apache/shiro/hazelcast/cache/HazelcastCacheManager.java`
#### Snippet
```java
    /**
     * Sets the Hazelcast {@code Config} object to use to create a backing {@code HazelcastInstance} if one is not
     * {@link #setHazelcastInstance(com.hazelcast.core.HazelcastInstance) supplied}.  {@code null} can be set if the
     * default <a href="http://www.hazelcast.com/docs/2.5/manual/multi_html/ch12.html">Hazelcast configuration
     * mechanisms</a> will be used.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.hazelcast.core` is unnecessary and can be removed
in `support/hazelcast/src/main/java/org/apache/shiro/hazelcast/cache/HazelcastCacheManager.java`
#### Snippet
```java
     *
     * @param config the Hazelcast {@code Config} object to use to create a backing {@code HazelcastInstance} if one is not
     *               {@link #setHazelcastInstance(com.hazelcast.core.HazelcastInstance) supplied}, or {@code null} if the
     *               default <a href="http://www.hazelcast.com/docs/2.5/manual/multi_html/ch12.html">Hazelcast configuration
     *               mechanisms</a> will be used.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.hazelcast.config` is unnecessary and can be removed
in `support/hazelcast/src/main/java/org/apache/shiro/hazelcast/cache/HazelcastCacheManager.java`
#### Snippet
```java
     * return Hazelcast.newHazelcastInstance(this.config);
     * </pre>
     * using any {@link #setConfig(com.hazelcast.config.Config) configured} {@code Config} object.  If no config
     * object has been specified, {@code this.config} will be {@code null}, thereby using Hazelcast's
     * <a href="http://www.hazelcast.com/docs/2.5/manual/multi_html/ch12.html">default configuration mechanism</a>.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.hazelcast.config` is unnecessary and can be removed
in `support/hazelcast/src/main/java/org/apache/shiro/hazelcast/cache/HazelcastCacheManager.java`
#### Snippet
```java
     *
     * @return a new {@link HazelcastInstance} that will be used to back this implementation
     * @see Hazelcast#newHazelcastInstance(com.hazelcast.config.Config)
     * @see Config
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.hazelcast.config` is unnecessary and can be removed
in `support/hazelcast/src/main/java/org/apache/shiro/hazelcast/cache/HazelcastCacheManager.java`
#### Snippet
```java
 * If you simply instantiate a {@code HazelcastCacheManager} and do nothing further, its backing
 * {@link HazelcastInstance} instance will be created automatically by calling
 * {@link Hazelcast#newHazelcastInstance(com.hazelcast.config.Config) Hazelcast.newHazelcastInstance(null)}.
 * <p/>
 * The null argument instructs Hazelcast to use whatever default configuration mechanism it has at its disposal,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.hazelcast.core` is unnecessary and can be removed
in `support/hazelcast/src/main/java/org/apache/shiro/hazelcast/cache/HazelcastCacheManager.java`
#### Snippet
```java
 * <h3>An existing {@code HazelcastInstance}</h3>
 * If you have created a {@code HazelcastInstance} outside of Shiro's knowledge/control, you can simply configure it
 * to be used by calling {@link #setHazelcastInstance(com.hazelcast.core.HazelcastInstance) setHazelcastInstance}.
 * <p/>
 * <h3>A {@link Config} instance</h3>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.hazelcast.config` is unnecessary and can be removed
in `support/hazelcast/src/main/java/org/apache/shiro/hazelcast/cache/HazelcastCacheManager.java`
#### Snippet
```java
 * Config instance</a>.
 * <p/>
 * Once constructed, you can set it via {@link #setConfig(com.hazelcast.config.Config) setConfig(config)}. This config
 * instance will be used to acquire a new Hazelcast instance by calling
 * {@link Hazelcast#newHazelcastInstance(Config) Hazelcast.newHazelcastInstance(config)}
```

### UnnecessaryFullyQualifiedName
Qualifier `com.hazelcast.core` is unnecessary and can be removed
in `support/hazelcast/src/main/java/org/apache/shiro/hazelcast/cache/HazelcastCacheManager.java`
#### Snippet
```java
    /**
     * Returns the Hazelcast {@code Config} object to use to create a backing {@code HazelcastInstance} if one is not
     * {@link #setHazelcastInstance(com.hazelcast.core.HazelcastInstance) supplied}, or {@code null} if the
     * default <a href="http://www.hazelcast.com/docs/2.5/manual/multi_html/ch12.html">Hazelcast configuration
     * mechanisms</a> will be used.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.hazelcast.core` is unnecessary and can be removed
in `support/hazelcast/src/main/java/org/apache/shiro/hazelcast/cache/HazelcastCacheManager.java`
#### Snippet
```java
     *
     * @return the Hazelcast {@code Config} object to use to create a backing {@code HazelcastInstance} if one is not
     *         {@link #setHazelcastInstance(com.hazelcast.core.HazelcastInstance) supplied}, or {@code null} if the
     *         default <a href="http://www.hazelcast.com/docs/2.5/manual/multi_html/ch12.html">Hazelcast configuration
     *         mechanisms</a> will be used.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.hazelcast.config` is unnecessary and can be removed
in `support/hazelcast/src/main/java/org/apache/shiro/hazelcast/cache/HazelcastCacheManager.java`
#### Snippet
```java
     *         default <a href="http://www.hazelcast.com/docs/2.5/manual/multi_html/ch12.html">Hazelcast configuration
     *         mechanisms</a> will be used.
     * @see Hazelcast#newHazelcastInstance(com.hazelcast.config.Config)
     */
    public Config getConfig() {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.hazelcast.core` is unnecessary and can be removed
in `support/hazelcast/src/main/java/org/apache/shiro/hazelcast/cache/HazelcastCacheManager.java`
#### Snippet
```java
     * Destroys any {@link #ensureHazelcastInstance() implicitly created} backing {@code HazelcastInstance}.  If the
     * backing Hazelcast was not implicitly created (i.e. because it was configured externally and supplied via
     * {@link #setHazelcastInstance(com.hazelcast.core.HazelcastInstance) setHazelcastInstance}), this method does
     * nothing.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/AccessControlFilter.java`
#### Snippet
```java
    /**
     * Processes requests where the subject was denied access as determined by the
     * {@link #isAccessAllowed(javax.servlet.ServletRequest, javax.servlet.ServletResponse, Object) isAccessAllowed}
     * method.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/AccessControlFilter.java`
#### Snippet
```java
    /**
     * Processes requests where the subject was denied access as determined by the
     * {@link #isAccessAllowed(javax.servlet.ServletRequest, javax.servlet.ServletResponse, Object) isAccessAllowed}
     * method.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/AccessControlFilter.java`
#### Snippet
```java
     * <p/>
     * The default implementation simply returns
     * {@link org.apache.shiro.SecurityUtils#getSubject() SecurityUtils.getSubject()}.
     *
     * @param request  the incoming <code>ServletRequest</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/AccessControlFilter.java`
#### Snippet
```java
    /**
     * Convenience method merely delegates to
     * {@link WebUtils#saveRequest(javax.servlet.ServletRequest) WebUtils.saveRequest(request)} to save the request
     * state for reuse later.  This is mostly used to retain user request state when a redirect is issued to
     * return the user to their originally requested url/resource.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/AccessControlFilter.java`
#### Snippet
```java
     * <p/>
     * If you need to save and then immediately redirect the user to login, consider using
     * {@link #saveRequestAndRedirectToLogin(javax.servlet.ServletRequest, javax.servlet.ServletResponse)
     * saveRequestAndRedirectToLogin(request,response)} directly.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/AccessControlFilter.java`
#### Snippet
```java
     * <p/>
     * If you need to save and then immediately redirect the user to login, consider using
     * {@link #saveRequestAndRedirectToLogin(javax.servlet.ServletRequest, javax.servlet.ServletResponse)
     * saveRequestAndRedirectToLogin(request,response)} directly.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/AccessControlFilter.java`
#### Snippet
```java
    /**
     * Processes requests where the subject was denied access as determined by the
     * {@link #isAccessAllowed(javax.servlet.ServletRequest, javax.servlet.ServletResponse, Object) isAccessAllowed}
     * method, retaining the {@code mappedValue} that was used during configuration.
     * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/AccessControlFilter.java`
#### Snippet
```java
    /**
     * Processes requests where the subject was denied access as determined by the
     * {@link #isAccessAllowed(javax.servlet.ServletRequest, javax.servlet.ServletResponse, Object) isAccessAllowed}
     * method, retaining the {@code mappedValue} that was used during configuration.
     * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/AccessControlFilter.java`
#### Snippet
```java
     *
     * @return <code>true</code> if
     *         {@link #isAccessAllowed(javax.servlet.ServletRequest, javax.servlet.ServletResponse, Object) isAccessAllowed},
     *         otherwise returns the result of
     *         {@link #onAccessDenied(javax.servlet.ServletRequest, javax.servlet.ServletResponse) onAccessDenied}.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/AccessControlFilter.java`
#### Snippet
```java
     *
     * @return <code>true</code> if
     *         {@link #isAccessAllowed(javax.servlet.ServletRequest, javax.servlet.ServletResponse, Object) isAccessAllowed},
     *         otherwise returns the result of
     *         {@link #onAccessDenied(javax.servlet.ServletRequest, javax.servlet.ServletResponse) onAccessDenied}.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/AccessControlFilter.java`
#### Snippet
```java
     *         {@link #isAccessAllowed(javax.servlet.ServletRequest, javax.servlet.ServletResponse, Object) isAccessAllowed},
     *         otherwise returns the result of
     *         {@link #onAccessDenied(javax.servlet.ServletRequest, javax.servlet.ServletResponse) onAccessDenied}.
     * @throws Exception if an error occurs.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/AccessControlFilter.java`
#### Snippet
```java
     *         {@link #isAccessAllowed(javax.servlet.ServletRequest, javax.servlet.ServletResponse, Object) isAccessAllowed},
     *         otherwise returns the result of
     *         {@link #onAccessDenied(javax.servlet.ServletRequest, javax.servlet.ServletResponse) onAccessDenied}.
     * @throws Exception if an error occurs.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/AccessControlFilter.java`
#### Snippet
```java
 * Superclass for any filter that controls access to a resource and may redirect the user to the login page
 * if they are not authenticated.  This superclass provides the method
 * {@link #saveRequestAndRedirectToLogin(javax.servlet.ServletRequest, javax.servlet.ServletResponse)}
 * which is used by many subclasses as the behavior when a user is unauthenticated.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/AccessControlFilter.java`
#### Snippet
```java
 * Superclass for any filter that controls access to a resource and may redirect the user to the login page
 * if they are not authenticated.  This superclass provides the method
 * {@link #saveRequestAndRedirectToLogin(javax.servlet.ServletRequest, javax.servlet.ServletResponse)}
 * which is used by many subclasses as the behavior when a user is unauthenticated.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/AccessControlFilter.java`
#### Snippet
```java
     * <b>N.B.</b>  If you want to issue a redirect with the intention of allowing the user to then return to their
     * originally requested URL, don't use this method directly.  Instead you should call
     * {@link #saveRequestAndRedirectToLogin(javax.servlet.ServletRequest, javax.servlet.ServletResponse)
     * saveRequestAndRedirectToLogin(request,response)}, which will save the current request state so that it can
     * be reconstructed and re-used after a successful login.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/AccessControlFilter.java`
#### Snippet
```java
     * <b>N.B.</b>  If you want to issue a redirect with the intention of allowing the user to then return to their
     * originally requested URL, don't use this method directly.  Instead you should call
     * {@link #saveRequestAndRedirectToLogin(javax.servlet.ServletRequest, javax.servlet.ServletResponse)
     * saveRequestAndRedirectToLogin(request,response)}, which will save the current request state so that it can
     * be reconstructed and re-used after a successful login.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/AccessControlFilter.java`
#### Snippet
```java
     * Convenience method for subclasses to use when a login redirect is required.
     * <p/>
     * This implementation simply calls {@link #saveRequest(javax.servlet.ServletRequest) saveRequest(request)}
     * and then {@link #redirectToLogin(javax.servlet.ServletRequest, javax.servlet.ServletResponse) redirectToLogin(request,response)}.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/AccessControlFilter.java`
#### Snippet
```java
     * <p/>
     * This implementation simply calls {@link #saveRequest(javax.servlet.ServletRequest) saveRequest(request)}
     * and then {@link #redirectToLogin(javax.servlet.ServletRequest, javax.servlet.ServletResponse) redirectToLogin(request,response)}.
     *
     * @param request  the incoming <code>ServletRequest</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/AccessControlFilter.java`
#### Snippet
```java
     * <p/>
     * This implementation simply calls {@link #saveRequest(javax.servlet.ServletRequest) saveRequest(request)}
     * and then {@link #redirectToLogin(javax.servlet.ServletRequest, javax.servlet.ServletResponse) redirectToLogin(request,response)}.
     *
     * @param request  the incoming <code>ServletRequest</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/mgt/FilterChainManager.java`
#### Snippet
```java
     * @param chainSpecificFilterConfig the filter-specific configuration that should be applied for only the specified
     *                                  filter chain.
     * @throws IllegalArgumentException if there is not a {@link #addFilter(String, javax.servlet.Filter) registered}
     *                                  filter under the given {@code filterName}
     * @throws ConfigurationException   if the filter is not capable of accepting {@code chainSpecificFilterConfig}
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/mgt/FilterChainManager.java`
#### Snippet
```java
     * @param chainName  the name of the chain where the filter will be appended.
     * @param filterName the name of the {@link #addFilter registered} filter to add to the chain.
     * @throws IllegalArgumentException if there is not a {@link #addFilter(String, javax.servlet.Filter) registered}
     *                                  filter under the given {@code filterName}
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/mgt/FilterChainManager.java`
#### Snippet
```java
     * <p/>
     * Calling this method is effectively the same as calling
     * <code>{@link #addFilter(String, javax.servlet.Filter, boolean) addFilter}(name, filter, <b>false</b>);</code>
     *
     * @param name   the name to assign to the filter, used to reference the filter in chain definitions
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/mgt/FilterChainManager.java`
#### Snippet
```java
     * <ol>
     * <li>{@code filterN} is the name of a filter previously
     * {@link #addFilter(String, javax.servlet.Filter) registered} with the manager, and</li>
     * <li>{@code [optional_configN]} is an optional bracketed string that has meaning for that particular filter for
     * <em>this particular chain</em></li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.web.util` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/mgt/PathMatchingFilterChainResolver.java`
#### Snippet
```java
    /**
     * Merely returns
     * <code>WebUtils.{@link org.apache.shiro.web.util.WebUtils#getPathWithinApplication(javax.servlet.http.HttpServletRequest) getPathWithinApplication(request)}</code>
     * and can be overridden by subclasses for custom request-to-application-path resolution behavior.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.web.filter.mgt` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/mgt/PathMatchingFilterChainResolver.java`
#### Snippet
```java
 * matching, as determined by a configurable {@link #setPathMatcher(org.apache.shiro.lang.util.PatternMatcher) PathMatcher}.
 * <p/>
 * This implementation functions by consulting a {@link org.apache.shiro.web.filter.mgt.FilterChainManager} for all configured filter chains (keyed
 * by configured path pattern).  If an incoming Request path matches one of the configured path patterns (via
 * the {@code PathMatcher}, the corresponding configured {@code FilterChain} is returned.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/PathMatchingFilter.java`
#### Snippet
```java
     *         handle the response directly.
     * @throws Exception if an error occurs
     * @see #isEnabled(javax.servlet.ServletRequest, javax.servlet.ServletResponse, String, Object)
     */
    protected boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/PathMatchingFilter.java`
#### Snippet
```java
     *         handle the response directly.
     * @throws Exception if an error occurs
     * @see #isEnabled(javax.servlet.ServletRequest, javax.servlet.ServletResponse, String, Object)
     */
    protected boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/PathMatchingFilter.java`
#### Snippet
```java
    /**
     * Path-matching version of the parent class's
     * {@link #isEnabled(javax.servlet.ServletRequest, javax.servlet.ServletResponse)} method, but additionally allows
     * for inspection of any path-specific configuration values corresponding to the specified request.  Subclasses
     * may wish to inspect this additional mapped configuration to determine if the filter is enabled or not.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/PathMatchingFilter.java`
#### Snippet
```java
    /**
     * Path-matching version of the parent class's
     * {@link #isEnabled(javax.servlet.ServletRequest, javax.servlet.ServletResponse)} method, but additionally allows
     * for inspection of any path-specific configuration values corresponding to the specified request.  Subclasses
     * may wish to inspect this additional mapped configuration to determine if the filter is enabled or not.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/PathMatchingFilter.java`
#### Snippet
```java
     * <p/>
     * This method's default implementation ignores the {@code path} and {@code mappedValue} arguments and merely
     * returns the value from a call to {@link #isEnabled(javax.servlet.ServletRequest, javax.servlet.ServletResponse)}.
     * It is expected that subclasses override this method if they need to perform enable/disable logic for a specific
     * request based on any path-specific config for the filter instance.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/PathMatchingFilter.java`
#### Snippet
```java
     * <p/>
     * This method's default implementation ignores the {@code path} and {@code mappedValue} arguments and merely
     * returns the value from a call to {@link #isEnabled(javax.servlet.ServletRequest, javax.servlet.ServletResponse)}.
     * It is expected that subclasses override this method if they need to perform enable/disable logic for a specific
     * request based on any path-specific config for the filter instance.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/PathMatchingFilter.java`
#### Snippet
```java
     * Implementation that handles path-matching behavior before a request is evaluated.  If the path matches and
     * the filter
     * {@link #isEnabled(javax.servlet.ServletRequest, javax.servlet.ServletResponse, String, Object) isEnabled} for
     * that path/config, the request will be allowed through via the result from
     * {@link #onPreHandle(javax.servlet.ServletRequest, javax.servlet.ServletResponse, Object) onPreHandle}.  If the
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/PathMatchingFilter.java`
#### Snippet
```java
     * Implementation that handles path-matching behavior before a request is evaluated.  If the path matches and
     * the filter
     * {@link #isEnabled(javax.servlet.ServletRequest, javax.servlet.ServletResponse, String, Object) isEnabled} for
     * that path/config, the request will be allowed through via the result from
     * {@link #onPreHandle(javax.servlet.ServletRequest, javax.servlet.ServletResponse, Object) onPreHandle}.  If the
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/PathMatchingFilter.java`
#### Snippet
```java
     * {@link #isEnabled(javax.servlet.ServletRequest, javax.servlet.ServletResponse, String, Object) isEnabled} for
     * that path/config, the request will be allowed through via the result from
     * {@link #onPreHandle(javax.servlet.ServletRequest, javax.servlet.ServletResponse, Object) onPreHandle}.  If the
     * path does not match or the filter is not enabled for that path, this filter will allow passthrough immediately
     * to allow the {@code FilterChain} to continue executing.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/PathMatchingFilter.java`
#### Snippet
```java
     * {@link #isEnabled(javax.servlet.ServletRequest, javax.servlet.ServletResponse, String, Object) isEnabled} for
     * that path/config, the request will be allowed through via the result from
     * {@link #onPreHandle(javax.servlet.ServletRequest, javax.servlet.ServletResponse, Object) onPreHandle}.  If the
     * path does not match or the filter is not enabled for that path, this filter will allow passthrough immediately
     * to allow the {@code FilterChain} to continue executing.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/PathMatchingFilter.java`
#### Snippet
```java
     * In order to retain path-matching functionality, subclasses should not override this method if at all
     * possible, and instead override
     * {@link #onPreHandle(javax.servlet.ServletRequest, javax.servlet.ServletResponse, Object) onPreHandle} instead.
     *
     * @param request  the incoming ServletRequest
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/PathMatchingFilter.java`
#### Snippet
```java
     * In order to retain path-matching functionality, subclasses should not override this method if at all
     * possible, and instead override
     * {@link #onPreHandle(javax.servlet.ServletRequest, javax.servlet.ServletResponse, Object) onPreHandle} instead.
     *
     * @param request  the incoming ServletRequest
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/PathMatchingFilter.java`
#### Snippet
```java
     * if that matches:
     * <p/>
     * <code>String requestURI = {@link #getPathWithinApplication(javax.servlet.ServletRequest) getPathWithinApplication(request)};<br/>
     * return {@link #pathsMatch(String, String) pathsMatch(path,requestURI)}</code>
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/AuthenticationFilter.java`
#### Snippet
```java
     * Determines whether the current subject is authenticated.
     * <p/>
     * The default implementation {@link #getSubject(javax.servlet.ServletRequest, javax.servlet.ServletResponse) acquires}
     * the currently executing Subject and then returns
     * {@link org.apache.shiro.subject.Subject#isAuthenticated() subject.isAuthenticated()};
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/AuthenticationFilter.java`
#### Snippet
```java
     * Determines whether the current subject is authenticated.
     * <p/>
     * The default implementation {@link #getSubject(javax.servlet.ServletRequest, javax.servlet.ServletResponse) acquires}
     * the currently executing Subject and then returns
     * {@link org.apache.shiro.subject.Subject#isAuthenticated() subject.isAuthenticated()};
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/AuthenticationFilter.java`
#### Snippet
```java
     * The default implementation {@link #getSubject(javax.servlet.ServletRequest, javax.servlet.ServletResponse) acquires}
     * the currently executing Subject and then returns
     * {@link org.apache.shiro.subject.Subject#isAuthenticated() subject.isAuthenticated()};
     *
     * @return true if the subject is authenticated; false if the subject is unauthenticated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.web.util` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/AuthenticationFilter.java`
#### Snippet
```java
    /**
     * Redirects to user to the previously attempted URL after a successful login.  This implementation simply calls
     * <code>{@link org.apache.shiro.web.util.WebUtils WebUtils}.{@link WebUtils#redirectToSavedRequest(javax.servlet.ServletRequest, javax.servlet.ServletResponse, String) redirectToSavedRequest}</code>
     * using the {@link #getSuccessUrl() successUrl} as the {@code fallbackUrl} argument to that call.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/AuthenticationFilter.java`
#### Snippet
```java
    /**
     * Redirects to user to the previously attempted URL after a successful login.  This implementation simply calls
     * <code>{@link org.apache.shiro.web.util.WebUtils WebUtils}.{@link WebUtils#redirectToSavedRequest(javax.servlet.ServletRequest, javax.servlet.ServletResponse, String) redirectToSavedRequest}</code>
     * using the {@link #getSuccessUrl() successUrl} as the {@code fallbackUrl} argument to that call.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/AuthenticationFilter.java`
#### Snippet
```java
    /**
     * Redirects to user to the previously attempted URL after a successful login.  This implementation simply calls
     * <code>{@link org.apache.shiro.web.util.WebUtils WebUtils}.{@link WebUtils#redirectToSavedRequest(javax.servlet.ServletRequest, javax.servlet.ServletResponse, String) redirectToSavedRequest}</code>
     * using the {@link #getSuccessUrl() successUrl} as the {@code fallbackUrl} argument to that call.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/UserFilter.java`
#### Snippet
```java
    /**
     * This default implementation simply calls
     * {@link #saveRequestAndRedirectToLogin(javax.servlet.ServletRequest, javax.servlet.ServletResponse) saveRequestAndRedirectToLogin}
     * and then immediately returns <code>false</code>, thereby preventing the chain from continuing so the redirect may
     * execute.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/UserFilter.java`
#### Snippet
```java
    /**
     * This default implementation simply calls
     * {@link #saveRequestAndRedirectToLogin(javax.servlet.ServletRequest, javax.servlet.ServletResponse) saveRequestAndRedirectToLogin}
     * and then immediately returns <code>false</code>, thereby preventing the chain from continuing so the redirect may
     * execute.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/UserFilter.java`
#### Snippet
```java
    /**
     * Returns <code>true</code> if the request is a
     * {@link #isLoginRequest(javax.servlet.ServletRequest, javax.servlet.ServletResponse) loginRequest} or
     * if the current {@link #getSubject(javax.servlet.ServletRequest, javax.servlet.ServletResponse) subject}
     * is not <code>null</code>, <code>false</code> otherwise.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/UserFilter.java`
#### Snippet
```java
    /**
     * Returns <code>true</code> if the request is a
     * {@link #isLoginRequest(javax.servlet.ServletRequest, javax.servlet.ServletResponse) loginRequest} or
     * if the current {@link #getSubject(javax.servlet.ServletRequest, javax.servlet.ServletResponse) subject}
     * is not <code>null</code>, <code>false</code> otherwise.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/UserFilter.java`
#### Snippet
```java
     * Returns <code>true</code> if the request is a
     * {@link #isLoginRequest(javax.servlet.ServletRequest, javax.servlet.ServletResponse) loginRequest} or
     * if the current {@link #getSubject(javax.servlet.ServletRequest, javax.servlet.ServletResponse) subject}
     * is not <code>null</code>, <code>false</code> otherwise.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/UserFilter.java`
#### Snippet
```java
     * Returns <code>true</code> if the request is a
     * {@link #isLoginRequest(javax.servlet.ServletRequest, javax.servlet.ServletResponse) loginRequest} or
     * if the current {@link #getSubject(javax.servlet.ServletRequest, javax.servlet.ServletResponse) subject}
     * is not <code>null</code>, <code>false</code> otherwise.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/UserFilter.java`
#### Snippet
```java
     *
     * @return <code>true</code> if the request is a
     * {@link #isLoginRequest(javax.servlet.ServletRequest, javax.servlet.ServletResponse) loginRequest} or
     * if the current {@link #getSubject(javax.servlet.ServletRequest, javax.servlet.ServletResponse) subject}
     * is not <code>null</code>, <code>false</code> otherwise.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/UserFilter.java`
#### Snippet
```java
     *
     * @return <code>true</code> if the request is a
     * {@link #isLoginRequest(javax.servlet.ServletRequest, javax.servlet.ServletResponse) loginRequest} or
     * if the current {@link #getSubject(javax.servlet.ServletRequest, javax.servlet.ServletResponse) subject}
     * is not <code>null</code>, <code>false</code> otherwise.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/UserFilter.java`
#### Snippet
```java
     * @return <code>true</code> if the request is a
     * {@link #isLoginRequest(javax.servlet.ServletRequest, javax.servlet.ServletResponse) loginRequest} or
     * if the current {@link #getSubject(javax.servlet.ServletRequest, javax.servlet.ServletResponse) subject}
     * is not <code>null</code>, <code>false</code> otherwise.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/UserFilter.java`
#### Snippet
```java
     * @return <code>true</code> if the request is a
     * {@link #isLoginRequest(javax.servlet.ServletRequest, javax.servlet.ServletResponse) loginRequest} or
     * if the current {@link #getSubject(javax.servlet.ServletRequest, javax.servlet.ServletResponse) subject}
     * is not <code>null</code>, <code>false</code> otherwise.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/util/WebUtils.java`
#### Snippet
```java
     * @param url         the URL to redirect the user to.
     * @param queryParams a map of parameters that should be set as request parameters for the new request.
     * @throws java.io.IOException if thrown by response methods.
     */
    public static void issueRedirect(ServletRequest request, ServletResponse response, String url, Map queryParams) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/util/WebUtils.java`
#### Snippet
```java
     * @param contextRelative  true if the URL is relative to the servlet context path, or false if the URL is absolute.
     * @param http10Compatible whether to stay compatible with HTTP 1.0 clients.
     * @throws java.io.IOException if thrown by response methods.
     */
    public static void issueRedirect(ServletRequest request, ServletResponse response, String url, Map queryParams, boolean contextRelative, boolean http10Compatible) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/util/WebUtils.java`
#### Snippet
```java
     * @param response the servlet response.
     * @param url      the URL to redirect the user to.
     * @throws java.io.IOException if thrown by response methods.
     */
    public static void issueRedirect(ServletRequest request, ServletResponse response, String url) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/util/WebUtils.java`
#### Snippet
```java
     * @param queryParams     a map of parameters that should be set as request parameters for the new request.
     * @param contextRelative true if the URL is relative to the servlet context path, or false if the URL is absolute.
     * @throws java.io.IOException if thrown by response methods.
     */
    public static void issueRedirect(ServletRequest request, ServletResponse response, String url, Map queryParams, boolean contextRelative) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.web.env` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/util/WebUtils.java`
#### Snippet
```java
     * @param sc ServletContext to find the web application context for
     * @return the root WebApplicationContext for this web app, or <code>null</code> if none
     * @see org.apache.shiro.web.env.EnvironmentLoader#ENVIRONMENT_ATTRIBUTE_KEY
     * @since 1.2
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.web.env` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/util/WebUtils.java`
#### Snippet
```java
     * @return the root WebApplicationContext for this web app
     * @throws IllegalStateException if the root WebApplicationContext could not be found
     * @see org.apache.shiro.web.env.EnvironmentLoader#ENVIRONMENT_ATTRIBUTE_KEY
     * @since 1.2
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/util/WebUtils.java`
#### Snippet
```java

    /**
     * {@link org.apache.shiro.session.Session Session} key used to save a request and later restore it, for example when redirecting to a
     * requested page after login, equal to {@code shiroSavedRequest}.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/util/WebUtils.java`
#### Snippet
```java
     * @return the decoded String
     * @see #DEFAULT_CHARACTER_ENCODING
     * @see javax.servlet.ServletRequest#getCharacterEncoding
     * @see java.net.URLDecoder#decode(String, String)
     * @see java.net.URLDecoder#decode(String)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/util/WebUtils.java`
#### Snippet
```java
     * @see #DEFAULT_CHARACTER_ENCODING
     * @see javax.servlet.ServletRequest#getCharacterEncoding
     * @see java.net.URLDecoder#decode(String, String)
     * @see java.net.URLDecoder#decode(String)
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/util/WebUtils.java`
#### Snippet
```java
     * @see javax.servlet.ServletRequest#getCharacterEncoding
     * @see java.net.URLDecoder#decode(String, String)
     * @see java.net.URLDecoder#decode(String)
     */
    @SuppressWarnings({"deprecation"})
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/util/WebUtils.java`
#### Snippet
```java
    /**
     * Redirects the to the request url from a previously
     * {@link #saveRequest(javax.servlet.ServletRequest) saved} request, or if there is no saved request, redirects the
     * end user to the specified {@code fallbackUrl}.  If there is no saved request or fallback url, this method
     * throws an {@link IllegalStateException}.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/util/WebUtils.java`
#### Snippet
```java
     * This method is primarily used to support a common login scenario - if an unauthenticated user accesses a
     * page that requires authentication, it is expected that request is
     * {@link #saveRequest(javax.servlet.ServletRequest) saved} first and then redirected to the login page. Then,
     * after a successful login, this method can be called to redirect them back to their originally requested URL, a
     * nice usability feature.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/util/WebUtils.java`
#### Snippet
```java
     * returns <code>null</code>, according to the Servlet spec.
     *
     * @see javax.servlet.ServletRequest#getCharacterEncoding
     */
    public static final String DEFAULT_CHARACTER_ENCODING = "ISO-8859-1";
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/util/WebUtils.java`
#### Snippet
```java
     * @param request current HTTP request
     * @return the encoding for the request (never <code>null</code>)
     * @see javax.servlet.ServletRequest#getCharacterEncoding()
     */
    protected static String determineEncoding(HttpServletRequest request) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/LogoutFilter.java`
#### Snippet
```java
    /**
     * Returns the currently executing {@link Subject}.  This implementation merely defaults to calling
     * {@code SecurityUtils.}{@link org.apache.shiro.SecurityUtils#getSubject() getSubject()}, but can be overridden
     * by subclasses for different retrieval strategies.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/LogoutFilter.java`
#### Snippet
```java
    /**
     * Issues an HTTP redirect to the specified URL after subject logout.  This implementation simply calls
     * {@code WebUtils.}{@link WebUtils#issueRedirect(javax.servlet.ServletRequest, javax.servlet.ServletResponse, String) issueRedirect(request,response,redirectUrl)}.
     *
     * @param request  the incoming Servlet request
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/LogoutFilter.java`
#### Snippet
```java
    /**
     * Issues an HTTP redirect to the specified URL after subject logout.  This implementation simply calls
     * {@code WebUtils.}{@link WebUtils#issueRedirect(javax.servlet.ServletRequest, javax.servlet.ServletResponse, String) issueRedirect(request,response,redirectUrl)}.
     *
     * @param request  the incoming Servlet request
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/LogoutFilter.java`
#### Snippet
```java
/**
 * Simple Filter that, upon receiving a request, will immediately log-out the currently executing
 * {@link #getSubject(javax.servlet.ServletRequest, javax.servlet.ServletResponse) subject}
 * and then redirect them to a configured {@link #getRedirectUrl() redirectUrl}.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/LogoutFilter.java`
#### Snippet
```java
/**
 * Simple Filter that, upon receiving a request, will immediately log-out the currently executing
 * {@link #getSubject(javax.servlet.ServletRequest, javax.servlet.ServletResponse) subject}
 * and then redirect them to a configured {@link #getRedirectUrl() redirectUrl}.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/LogoutFilter.java`
#### Snippet
```java

    /**
     * Acquires the currently executing {@link #getSubject(javax.servlet.ServletRequest, javax.servlet.ServletResponse) subject},
     * a potentially Subject or request-specific
     * {@link #getRedirectUrl(javax.servlet.ServletRequest, javax.servlet.ServletResponse, org.apache.shiro.subject.Subject) redirectUrl},
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/LogoutFilter.java`
#### Snippet
```java

    /**
     * Acquires the currently executing {@link #getSubject(javax.servlet.ServletRequest, javax.servlet.ServletResponse) subject},
     * a potentially Subject or request-specific
     * {@link #getRedirectUrl(javax.servlet.ServletRequest, javax.servlet.ServletResponse, org.apache.shiro.subject.Subject) redirectUrl},
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/LogoutFilter.java`
#### Snippet
```java
     * Acquires the currently executing {@link #getSubject(javax.servlet.ServletRequest, javax.servlet.ServletResponse) subject},
     * a potentially Subject or request-specific
     * {@link #getRedirectUrl(javax.servlet.ServletRequest, javax.servlet.ServletResponse, org.apache.shiro.subject.Subject) redirectUrl},
     * and redirects the end-user to that redirect url.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/LogoutFilter.java`
#### Snippet
```java
     * Acquires the currently executing {@link #getSubject(javax.servlet.ServletRequest, javax.servlet.ServletResponse) subject},
     * a potentially Subject or request-specific
     * {@link #getRedirectUrl(javax.servlet.ServletRequest, javax.servlet.ServletResponse, org.apache.shiro.subject.Subject) redirectUrl},
     * and redirects the end-user to that redirect url.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/LogoutFilter.java`
#### Snippet
```java
     * Acquires the currently executing {@link #getSubject(javax.servlet.ServletRequest, javax.servlet.ServletResponse) subject},
     * a potentially Subject or request-specific
     * {@link #getRedirectUrl(javax.servlet.ServletRequest, javax.servlet.ServletResponse, org.apache.shiro.subject.Subject) redirectUrl},
     * and redirects the end-user to that redirect url.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/FormAuthenticationFilter.java`
#### Snippet
```java
 * {@link #setUsernameParam(String) username}, {@link #setPasswordParam(String) password},
 * and {@link #setRememberMeParam(String) rememberMe} request parameters.  It then calls
 * {@link org.apache.shiro.subject.Subject#login(org.apache.shiro.authc.AuthenticationToken) Subject.login(usernamePasswordToken)},
 * effectively automatically performing a login attempt.  Note that the login attempt will only occur when the
 * {@link #isLoginSubmission(javax.servlet.ServletRequest, javax.servlet.ServletResponse) isLoginSubmission(request,response)}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/FormAuthenticationFilter.java`
#### Snippet
```java
 * {@link #setUsernameParam(String) username}, {@link #setPasswordParam(String) password},
 * and {@link #setRememberMeParam(String) rememberMe} request parameters.  It then calls
 * {@link org.apache.shiro.subject.Subject#login(org.apache.shiro.authc.AuthenticationToken) Subject.login(usernamePasswordToken)},
 * effectively automatically performing a login attempt.  Note that the login attempt will only occur when the
 * {@link #isLoginSubmission(javax.servlet.ServletRequest, javax.servlet.ServletResponse) isLoginSubmission(request,response)}
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/FormAuthenticationFilter.java`
#### Snippet
```java
 * {@link org.apache.shiro.subject.Subject#login(org.apache.shiro.authc.AuthenticationToken) Subject.login(usernamePasswordToken)},
 * effectively automatically performing a login attempt.  Note that the login attempt will only occur when the
 * {@link #isLoginSubmission(javax.servlet.ServletRequest, javax.servlet.ServletResponse) isLoginSubmission(request,response)}
 * is <code>true</code>, which by default occurs when the request is for the {@link #setLoginUrl(String) loginUrl} and
 * is a POST request.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/FormAuthenticationFilter.java`
#### Snippet
```java
 * {@link org.apache.shiro.subject.Subject#login(org.apache.shiro.authc.AuthenticationToken) Subject.login(usernamePasswordToken)},
 * effectively automatically performing a login attempt.  Note that the login attempt will only occur when the
 * {@link #isLoginSubmission(javax.servlet.ServletRequest, javax.servlet.ServletResponse) isLoginSubmission(request,response)}
 * is <code>true</code>, which by default occurs when the request is for the {@link #setLoginUrl(String) loginUrl} and
 * is a POST request.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.web.util` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/FormAuthenticationFilter.java`
#### Snippet
```java
     * <p/>
     * RememberMe will be <code>true</code> if the parameter value equals any of those supported by
     * {@link org.apache.shiro.web.util.WebUtils#isTrue(javax.servlet.ServletRequest, String) WebUtils.isTrue(request,value)}, <code>false</code>
     * otherwise.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/FormAuthenticationFilter.java`
#### Snippet
```java
     * <p/>
     * RememberMe will be <code>true</code> if the parameter value equals any of those supported by
     * {@link org.apache.shiro.web.util.WebUtils#isTrue(javax.servlet.ServletRequest, String) WebUtils.isTrue(request,value)}, <code>false</code>
     * otherwise.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authz/SslFilter.java`
#### Snippet
```java
    /**
     * Retains the parent method's port-matching behavior but additionally guarantees that the
     *{@code ServletRequest.}{@link javax.servlet.ServletRequest#isSecure() isSecure()}.  If the port does not match or
     * the request is not secure, access is denied.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authz/SslFilter.java`
#### Snippet
```java
     * @param mappedValue the filter-specific config value mapped to this filter in the URL rules mappings - ignored by this implementation.
     * @return {@code true} if the request is received on an expected SSL port and the
     * {@code request.}{@link javax.servlet.ServletRequest#isSecure() isSecure()}, {@code false} otherwise.
     * @throws Exception if the call to {@code super.isAccessAllowed} throws an exception.
     * @since 1.2
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authz/SslFilter.java`
#### Snippet
```java
 * Filter which requires a request to be over SSL.  Access is allowed if the request is received on the configured
 * server {@link #setPort(int) port} <em>and</em> the
 * {@code request.}{@link javax.servlet.ServletRequest#isSecure() isSecure()}.  If either condition is {@code false},
 * the filter chain will not continue.
 * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/BasicHttpAuthenticationFilter.java`
#### Snippet
```java
 * <p><code>Authorization: Basic <em>Base64_encoded_username_and_password</em></code></p></li>
 * </ol>
 * The {@link #onAccessDenied(javax.servlet.ServletRequest, javax.servlet.ServletResponse)} method will
 * only be called if the subject making the request is not
 * {@link org.apache.shiro.subject.Subject#isAuthenticated() authenticated}
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/BasicHttpAuthenticationFilter.java`
#### Snippet
```java
 * <p><code>Authorization: Basic <em>Base64_encoded_username_and_password</em></code></p></li>
 * </ol>
 * The {@link #onAccessDenied(javax.servlet.ServletRequest, javax.servlet.ServletResponse)} method will
 * only be called if the subject making the request is not
 * {@link org.apache.shiro.subject.Subject#isAuthenticated() authenticated}
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/BasicHttpAuthenticationFilter.java`
#### Snippet
```java
     * This implementation:
     * <ol><li>acquires the username and password based on the request's
     * {@link #getAuthzHeader(javax.servlet.ServletRequest) authorization header} via the
     * {@link #getPrincipalsAndCredentials(String, javax.servlet.ServletRequest) getPrincipalsAndCredentials} method</li>
     * <li>The return value of that method is converted to an <code>AuthenticationToken</code> via the
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/BasicHttpAuthenticationFilter.java`
#### Snippet
```java
     * <ol><li>acquires the username and password based on the request's
     * {@link #getAuthzHeader(javax.servlet.ServletRequest) authorization header} via the
     * {@link #getPrincipalsAndCredentials(String, javax.servlet.ServletRequest) getPrincipalsAndCredentials} method</li>
     * <li>The return value of that method is converted to an <code>AuthenticationToken</code> via the
     * {@link #createToken(String, String, javax.servlet.ServletRequest, javax.servlet.ServletResponse) createToken} method</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/BasicHttpAuthenticationFilter.java`
#### Snippet
```java
     * {@link #getPrincipalsAndCredentials(String, javax.servlet.ServletRequest) getPrincipalsAndCredentials} method</li>
     * <li>The return value of that method is converted to an <code>AuthenticationToken</code> via the
     * {@link #createToken(String, String, javax.servlet.ServletRequest, javax.servlet.ServletResponse) createToken} method</li>
     * <li>The created <code>AuthenticationToken</code> is returned.</li>
     * </ol>
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/BasicHttpAuthenticationFilter.java`
#### Snippet
```java
     * {@link #getPrincipalsAndCredentials(String, javax.servlet.ServletRequest) getPrincipalsAndCredentials} method</li>
     * <li>The return value of that method is converted to an <code>AuthenticationToken</code> via the
     * {@link #createToken(String, String, javax.servlet.ServletRequest, javax.servlet.ServletResponse) createToken} method</li>
     * <li>The created <code>AuthenticationToken</code> is returned.</li>
     * </ol>
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authc/BasicHttpAuthenticationFilter.java`
#### Snippet
```java
     *
     * @param scheme  the {@link #getAuthcScheme() authcScheme} found in the request
     *                {@link #getAuthzHeader(javax.servlet.ServletRequest) authzHeader}.  It is ignored by this implementation,
     *                but available to overriding implementations should they find it useful.
     * @param encoded the Base64-encoded username:password value found after the scheme in the header
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authz/AuthorizationFilter.java`
#### Snippet
```java
     * <li>If the {@code Subject} is unknown<sup><a href="#known">[1]</a></sup>:
     * <ol><li>The incoming request will be saved and they will be redirected to the login page for authentication
     * (via the {@link #saveRequestAndRedirectToLogin(javax.servlet.ServletRequest, javax.servlet.ServletResponse)}
     * method).</li>
     * <li>Once successfully authenticated, they will be redirected back to the originally attempted page.</li></ol>
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authz/AuthorizationFilter.java`
#### Snippet
```java
     * <li>If the {@code Subject} is unknown<sup><a href="#known">[1]</a></sup>:
     * <ol><li>The incoming request will be saved and they will be redirected to the login page for authentication
     * (via the {@link #saveRequestAndRedirectToLogin(javax.servlet.ServletRequest, javax.servlet.ServletResponse)}
     * method).</li>
     * <li>Once successfully authenticated, they will be redirected back to the originally attempted page.</li></ol>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authz/AuthorizationFilter.java`
#### Snippet
```java
     * </ul>
     * <code><a name="known">[1]</a></code>: A {@code Subject} is 'known' when
     * <code>subject.{@link org.apache.shiro.subject.Subject#getPrincipal() getPrincipal()}</code> is not {@code null},
     * which implicitly means that the subject is either currently authenticated or they have been remembered via
     * 'remember me' services.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authz/AuthorizationFilter.java`
#### Snippet
```java
/**
 * Superclass for authorization-related filters.  If an request is unauthorized, response handling is delegated to the
 * {@link #onAccessDenied(javax.servlet.ServletRequest, javax.servlet.ServletResponse) onAccessDenied} method, which
 * provides reasonable handling for most applications.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authz/AuthorizationFilter.java`
#### Snippet
```java
/**
 * Superclass for authorization-related filters.  If an request is unauthorized, response handling is delegated to the
 * {@link #onAccessDenied(javax.servlet.ServletRequest, javax.servlet.ServletResponse) onAccessDenied} method, which
 * provides reasonable handling for most applications.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authz/AuthorizationFilter.java`
#### Snippet
```java
 * provides reasonable handling for most applications.
 *
 * @see #onAccessDenied(javax.servlet.ServletRequest, javax.servlet.ServletResponse)
 * @since 0.9
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authz/AuthorizationFilter.java`
#### Snippet
```java
 * provides reasonable handling for most applications.
 *
 * @see #onAccessDenied(javax.servlet.ServletRequest, javax.servlet.ServletResponse)
 * @since 0.9
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.web.env` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/ShiroFilter.java`
#### Snippet
```java

    /**
     * Configures this instance based on the existing {@link org.apache.shiro.web.env.WebEnvironment} instance
     * available to the currently accessible {@link #getServletContext() servletContext}.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.web.env` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/ShiroFilter.java`
#### Snippet
```java
 * <p/>
 * As of Shiro 1.2, this is Shiro's preferred filter for {@code web.xml} configuration.  It expects the presence of a
 * Shiro {@link org.apache.shiro.web.env.WebEnvironment WebEnvironment} in the {@code ServletContext}, also
 * configured via {@code web.xml}.
 * <h2>Usage</h2>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.web.env` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/ShiroFilter.java`
#### Snippet
```java
 * configured via {@code web.xml}.
 * <h2>Usage</h2>
 * As this Filter expects an available {@link org.apache.shiro.web.env.WebEnvironment WebEnvironment} instance to
 * be configured, it must be defined in {@code web.xml} with the companion
 * {@link org.apache.shiro.web.env.EnvironmentLoaderListener EnvironmentLoaderListener}, which performs the necessary
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AbstractFilter.java`
#### Snippet
```java
    /**
     * Returns the servlet container specified {@code FilterConfig} instance provided at
     * {@link #init(javax.servlet.FilterConfig) startup}.
     *
     * @return the servlet container specified {@code FilterConfig} instance provided at start-up.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AbstractFilter.java`
#### Snippet
```java
     *
     * @param filterConfig the servlet container supplied FilterConfig instance.
     * @throws javax.servlet.ServletException if {@link #onFilterConfigSet() onFilterConfigSet()} throws an Exception.
     */
    public final void init(FilterConfig filterConfig) throws ServletException {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/NameableFilter.java`
#### Snippet
```java
     * servlet container at start-up:
     * <pre>
     * this.name = {@link #getFilterConfig() getFilterConfig()}.{@link javax.servlet.FilterConfig#getFilterName() getName()};</pre>
     *
     * @param name the name of the filter.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/NameableFilter.java`
#### Snippet
```java
 * {@link #getName()}/{@link #setName(String)} methods.  If no name is specified, the name of the filter will
 * default to the name given to it in {@code web.xml} (the {@code FilterConfig}'s
 * {@link javax.servlet.FilterConfig#getFilterName() filterName}).
 *
 * @since 1.0
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/NameableFilter.java`
#### Snippet
```java
     * filter name as specified by the servlet container at start-up:
     * <pre>
     * this.name = {@link #getFilterConfig() getFilterConfig()}.{@link javax.servlet.FilterConfig#getFilterName() getName()};</pre>
     *
     * @return the filter name, or {@code null} if none available
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/NameableFilter.java`
#### Snippet
```java
     * @return the filter name, or {@code null} if none available
     * @see javax.servlet.GenericServlet#getServletName()
     * @see javax.servlet.FilterConfig#getFilterName()
     */
    protected String getName() {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet.http` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authz/HttpMethodPermissionFilter.java`
#### Snippet
```java
     * per {@link org.apache.shiro.authz.permission.WildcardPermission WildcardPermission} conventions.  Subclasses
     * are of course free to override this method or the
     * {@link #buildPermissions(javax.servlet.http.HttpServletRequest, String[], String) buildPermissions} request
     * variant for custom building logic or with different permission formats.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet.http` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authz/HttpMethodPermissionFilter.java`
#### Snippet
```java
     * <p/>
     * This implementation expects the incoming request to be an {@link HttpServletRequest} and returns a mapped
     * action based on the HTTP request {@link javax.servlet.http.HttpServletRequest#getMethod() method}.
     *
     * @param request to pull the method from.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authz/HttpMethodPermissionFilter.java`
#### Snippet
```java
     * action to each configured permission (the {@code mappedValue} argument is a {@code String[]} array), and
     * delegates the permission check for the newly constructed permission(s) to the superclass
     * {@link PermissionsAuthorizationFilter#isAccessAllowed(javax.servlet.ServletRequest, javax.servlet.ServletResponse, Object) isAccessAllowed}
     * implementation to perform the actual permission check.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/filter/authz/HttpMethodPermissionFilter.java`
#### Snippet
```java
     * action to each configured permission (the {@code mappedValue} argument is a {@code String[]} array), and
     * delegates the permission check for the newly constructed permission(s) to the superclass
     * {@link PermissionsAuthorizationFilter#isAccessAllowed(javax.servlet.ServletRequest, javax.servlet.ServletResponse, Object) isAccessAllowed}
     * implementation to perform the actual permission check.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/OncePerRequestFilter.java`
#### Snippet
```java
     * @return whether the given request should <i>not</i> be filtered
     * @throws ServletException in case of errors
     * @deprecated in favor of overriding {@link #isEnabled(javax.servlet.ServletRequest, javax.servlet.ServletResponse)}
     * for custom behavior.  This method will be removed in Shiro 2.0.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/OncePerRequestFilter.java`
#### Snippet
```java
     * @return whether the given request should <i>not</i> be filtered
     * @throws ServletException in case of errors
     * @deprecated in favor of overriding {@link #isEnabled(javax.servlet.ServletRequest, javax.servlet.ServletResponse)}
     * for custom behavior.  This method will be removed in Shiro 2.0.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/OncePerRequestFilter.java`
#### Snippet
```java
 * is based on the configured name of the concrete filter instance.
 * <h3>Controlling filter execution</h3>
 * 1.2 introduced the {@link #isEnabled(javax.servlet.ServletRequest, javax.servlet.ServletResponse)} method and
 * {@link #isEnabled()} property to allow explicit control over whether the filter executes (or allows passthrough)
 * for any given request.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/OncePerRequestFilter.java`
#### Snippet
```java
 * is based on the configured name of the concrete filter instance.
 * <h3>Controlling filter execution</h3>
 * 1.2 introduced the {@link #isEnabled(javax.servlet.ServletRequest, javax.servlet.ServletResponse)} method and
 * {@link #isEnabled()} property to allow explicit control over whether the filter executes (or allows passthrough)
 * for any given request.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/OncePerRequestFilter.java`
#### Snippet
```java
     * <b>Helpful Hint:</b> if your subclass extends {@link org.apache.shiro.web.filter.PathMatchingFilter PathMatchingFilter},
     * you may wish to instead override the
     * {@link org.apache.shiro.web.filter.PathMatchingFilter#isEnabled(javax.servlet.ServletRequest, javax.servlet.ServletResponse, String, Object)
     * PathMatchingFilter.isEnabled(request,response,path,pathSpecificConfig)}
     * method if you want to make your enable/disable decision based on any path-specific configuration.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/OncePerRequestFilter.java`
#### Snippet
```java
     * <b>Helpful Hint:</b> if your subclass extends {@link org.apache.shiro.web.filter.PathMatchingFilter PathMatchingFilter},
     * you may wish to instead override the
     * {@link org.apache.shiro.web.filter.PathMatchingFilter#isEnabled(javax.servlet.ServletRequest, javax.servlet.ServletResponse, String, Object)
     * PathMatchingFilter.isEnabled(request,response,path,pathSpecificConfig)}
     * method if you want to make your enable/disable decision based on any path-specific configuration.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/OncePerRequestFilter.java`
#### Snippet
```java
     * @throws IOException in the case of any IO error
     * @throws ServletException in the case of any error
     * @see org.apache.shiro.web.filter.PathMatchingFilter#isEnabled(javax.servlet.ServletRequest, javax.servlet.ServletResponse, String, Object)
     * @since 1.2
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/OncePerRequestFilter.java`
#### Snippet
```java
     * @throws IOException in the case of any IO error
     * @throws ServletException in the case of any error
     * @see org.apache.shiro.web.filter.PathMatchingFilter#isEnabled(javax.servlet.ServletRequest, javax.servlet.ServletResponse, String, Object)
     * @since 1.2
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/OncePerRequestFilter.java`
#### Snippet
```java
     * <b>*</b> This configuration property is for general configuration for any request that comes through
     * the filter.  The
     * {@link #isEnabled(javax.servlet.ServletRequest, javax.servlet.ServletResponse) isEnabled(request,response)}
     * method actually determines whether or not if the filter is enabled based on the current request.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/OncePerRequestFilter.java`
#### Snippet
```java
     * <b>*</b> This configuration property is for general configuration for any request that comes through
     * the filter.  The
     * {@link #isEnabled(javax.servlet.ServletRequest, javax.servlet.ServletResponse) isEnabled(request,response)}
     * method actually determines whether or not if the filter is enabled based on the current request.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/OncePerRequestFilter.java`
#### Snippet
```java
    /**
     * Same contract as for
     * {@link #doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)},
     * but guaranteed to be invoked only once per request.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/OncePerRequestFilter.java`
#### Snippet
```java
    /**
     * Same contract as for
     * {@link #doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)},
     * but guaranteed to be invoked only once per request.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/OncePerRequestFilter.java`
#### Snippet
```java
    /**
     * Same contract as for
     * {@link #doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)},
     * but guaranteed to be invoked only once per request.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/ShiroHttpServletRequest.java`
#### Snippet
```java
    }

    private class ObjectPrincipal implements java.security.Principal {
        private Object object = null;

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AdviceFilter.java`
#### Snippet
```java
    /**
     * Actually implements the chain execution logic, utilizing
     * {@link #preHandle(javax.servlet.ServletRequest, javax.servlet.ServletResponse) pre},
     * {@link #postHandle(javax.servlet.ServletRequest, javax.servlet.ServletResponse) post}, and
     * {@link #afterCompletion(javax.servlet.ServletRequest, javax.servlet.ServletResponse, Exception) after}
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AdviceFilter.java`
#### Snippet
```java
    /**
     * Actually implements the chain execution logic, utilizing
     * {@link #preHandle(javax.servlet.ServletRequest, javax.servlet.ServletResponse) pre},
     * {@link #postHandle(javax.servlet.ServletRequest, javax.servlet.ServletResponse) post}, and
     * {@link #afterCompletion(javax.servlet.ServletRequest, javax.servlet.ServletResponse, Exception) after}
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AdviceFilter.java`
#### Snippet
```java
     * Actually implements the chain execution logic, utilizing
     * {@link #preHandle(javax.servlet.ServletRequest, javax.servlet.ServletResponse) pre},
     * {@link #postHandle(javax.servlet.ServletRequest, javax.servlet.ServletResponse) post}, and
     * {@link #afterCompletion(javax.servlet.ServletRequest, javax.servlet.ServletResponse, Exception) after}
     * advice hooks.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AdviceFilter.java`
#### Snippet
```java
     * Actually implements the chain execution logic, utilizing
     * {@link #preHandle(javax.servlet.ServletRequest, javax.servlet.ServletResponse) pre},
     * {@link #postHandle(javax.servlet.ServletRequest, javax.servlet.ServletResponse) post}, and
     * {@link #afterCompletion(javax.servlet.ServletRequest, javax.servlet.ServletResponse, Exception) after}
     * advice hooks.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AdviceFilter.java`
#### Snippet
```java
     * {@link #preHandle(javax.servlet.ServletRequest, javax.servlet.ServletResponse) pre},
     * {@link #postHandle(javax.servlet.ServletRequest, javax.servlet.ServletResponse) post}, and
     * {@link #afterCompletion(javax.servlet.ServletRequest, javax.servlet.ServletResponse, Exception) after}
     * advice hooks.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AdviceFilter.java`
#### Snippet
```java
     * {@link #preHandle(javax.servlet.ServletRequest, javax.servlet.ServletResponse) pre},
     * {@link #postHandle(javax.servlet.ServletRequest, javax.servlet.ServletResponse) post}, and
     * {@link #afterCompletion(javax.servlet.ServletRequest, javax.servlet.ServletResponse, Exception) after}
     * advice hooks.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AdviceFilter.java`
#### Snippet
```java
     * is, if {@link #executeChain executeChain} throws an exception, this method will never be called.  Be aware of
     * this when implementing logic.  Most resource 'cleanup' behavior is often done in the
     * {@link #afterCompletion(javax.servlet.ServletRequest, javax.servlet.ServletResponse, Exception) afterCompletion(request,response,exception)}
     * implementation, which is guaranteed to be called for every request, even when the chain processing throws
     * an Exception.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AdviceFilter.java`
#### Snippet
```java
     * is, if {@link #executeChain executeChain} throws an exception, this method will never be called.  Be aware of
     * this when implementing logic.  Most resource 'cleanup' behavior is often done in the
     * {@link #afterCompletion(javax.servlet.ServletRequest, javax.servlet.ServletResponse, Exception) afterCompletion(request,response,exception)}
     * implementation, which is guaranteed to be called for every request, even when the chain processing throws
     * an Exception.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AdviceFilter.java`
#### Snippet
```java
    /**
     * Executes cleanup logic in the {@code finally} code block in the
     * {@link #doFilterInternal(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain) doFilterInternal}
     * implementation.
     * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AdviceFilter.java`
#### Snippet
```java
    /**
     * Executes cleanup logic in the {@code finally} code block in the
     * {@link #doFilterInternal(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain) doFilterInternal}
     * implementation.
     * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AdviceFilter.java`
#### Snippet
```java
    /**
     * Executes cleanup logic in the {@code finally} code block in the
     * {@link #doFilterInternal(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain) doFilterInternal}
     * implementation.
     * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AdviceFilter.java`
#### Snippet
```java
     * <p/>
     * This implementation specifically calls
     * {@link #afterCompletion(javax.servlet.ServletRequest, javax.servlet.ServletResponse, Exception) afterCompletion}
     * as well as handles any exceptions properly.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AdviceFilter.java`
#### Snippet
```java
     * <p/>
     * This implementation specifically calls
     * {@link #afterCompletion(javax.servlet.ServletRequest, javax.servlet.ServletResponse, Exception) afterCompletion}
     * as well as handles any exceptions properly.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AdviceFilter.java`
#### Snippet
```java
/**
 * A Servlet Filter that enables AOP-style &quot;around&quot; advice for a ServletRequest via
 * {@link #preHandle(javax.servlet.ServletRequest, javax.servlet.ServletResponse) preHandle},
 * {@link #postHandle(javax.servlet.ServletRequest, javax.servlet.ServletResponse) postHandle},
 * and {@link #afterCompletion(javax.servlet.ServletRequest, javax.servlet.ServletResponse, Exception) afterCompletion}
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AdviceFilter.java`
#### Snippet
```java
/**
 * A Servlet Filter that enables AOP-style &quot;around&quot; advice for a ServletRequest via
 * {@link #preHandle(javax.servlet.ServletRequest, javax.servlet.ServletResponse) preHandle},
 * {@link #postHandle(javax.servlet.ServletRequest, javax.servlet.ServletResponse) postHandle},
 * and {@link #afterCompletion(javax.servlet.ServletRequest, javax.servlet.ServletResponse, Exception) afterCompletion}
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AdviceFilter.java`
#### Snippet
```java
 * A Servlet Filter that enables AOP-style &quot;around&quot; advice for a ServletRequest via
 * {@link #preHandle(javax.servlet.ServletRequest, javax.servlet.ServletResponse) preHandle},
 * {@link #postHandle(javax.servlet.ServletRequest, javax.servlet.ServletResponse) postHandle},
 * and {@link #afterCompletion(javax.servlet.ServletRequest, javax.servlet.ServletResponse, Exception) afterCompletion}
 * hooks.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AdviceFilter.java`
#### Snippet
```java
 * A Servlet Filter that enables AOP-style &quot;around&quot; advice for a ServletRequest via
 * {@link #preHandle(javax.servlet.ServletRequest, javax.servlet.ServletResponse) preHandle},
 * {@link #postHandle(javax.servlet.ServletRequest, javax.servlet.ServletResponse) postHandle},
 * and {@link #afterCompletion(javax.servlet.ServletRequest, javax.servlet.ServletResponse, Exception) afterCompletion}
 * hooks.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AdviceFilter.java`
#### Snippet
```java
 * {@link #preHandle(javax.servlet.ServletRequest, javax.servlet.ServletResponse) preHandle},
 * {@link #postHandle(javax.servlet.ServletRequest, javax.servlet.ServletResponse) postHandle},
 * and {@link #afterCompletion(javax.servlet.ServletRequest, javax.servlet.ServletResponse, Exception) afterCompletion}
 * hooks.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AdviceFilter.java`
#### Snippet
```java
 * {@link #preHandle(javax.servlet.ServletRequest, javax.servlet.ServletResponse) preHandle},
 * {@link #postHandle(javax.servlet.ServletRequest, javax.servlet.ServletResponse) postHandle},
 * and {@link #afterCompletion(javax.servlet.ServletRequest, javax.servlet.ServletResponse, Exception) afterCompletion}
 * hooks.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AbstractShiroFilter.java`
#### Snippet
```java
     * session ({@code subject.getSession(false) == null}), this method does nothing.
     * <p/>This method implementation merely calls
     * <code>Session.{@link org.apache.shiro.session.Session#touch() touch}()</code> on the session.
     *
     * @param request  incoming request - ignored, but available to subclasses that might wish to override this method
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet.http` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AbstractShiroFilter.java`
#### Snippet
```java
     * processing.
     * <p/>
     * This implementation delegates to {@link #wrapServletRequest(javax.servlet.http.HttpServletRequest)}
     * only if Shiro-based sessions are enabled (that is, !{@link #isHttpSessions()}) and the request instance is a
     * {@link ShiroHttpServletRequest}.  This ensures that any URL rewriting that occurs is handled correctly using the
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet.http` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AbstractShiroFilter.java`
#### Snippet
```java
     * <p/>
     * If the {@code ServletRequest} is an instance of {@link HttpServletRequest}, the value returned from this method
     * is obtained by calling {@link #wrapServletRequest(javax.servlet.http.HttpServletRequest)} to allow Shiro-specific
     * HTTP behavior, otherwise the original {@code ServletRequest} argument is returned.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AbstractShiroFilter.java`
#### Snippet
```java
     * <p/>
     * This implementation first delegates to
     * <code>{@link #getExecutionChain(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain) getExecutionChain}</code>
     * to allow the application's Shiro configuration to determine exactly how the chain should execute.  The resulting
     * value from that call is then executed directly by calling the returned {@code FilterChain}'s
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AbstractShiroFilter.java`
#### Snippet
```java
     * <p/>
     * This implementation first delegates to
     * <code>{@link #getExecutionChain(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain) getExecutionChain}</code>
     * to allow the application's Shiro configuration to determine exactly how the chain should execute.  The resulting
     * value from that call is then executed directly by calling the returned {@code FilterChain}'s
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AbstractShiroFilter.java`
#### Snippet
```java
     * <p/>
     * This implementation first delegates to
     * <code>{@link #getExecutionChain(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain) getExecutionChain}</code>
     * to allow the application's Shiro configuration to determine exactly how the chain should execute.  The resulting
     * value from that call is then executed directly by calling the returned {@code FilterChain}'s
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AbstractShiroFilter.java`
#### Snippet
```java
     * <li>{@link #prepareServletResponse(ServletRequest, ServletResponse, FilterChain) Prepares}
     * the outgoing {@code ServletResponse} for use during Shiro's processing</li>
     * <li> {@link #createSubject(javax.servlet.ServletRequest, javax.servlet.ServletResponse) Creates} a
     * {@link Subject} instance based on the specified request/response pair.</li>
     * <li>Finally {@link Subject#execute(Runnable) executes} the
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AbstractShiroFilter.java`
#### Snippet
```java
     * <li>{@link #prepareServletResponse(ServletRequest, ServletResponse, FilterChain) Prepares}
     * the outgoing {@code ServletResponse} for use during Shiro's processing</li>
     * <li> {@link #createSubject(javax.servlet.ServletRequest, javax.servlet.ServletResponse) Creates} a
     * {@link Subject} instance based on the specified request/response pair.</li>
     * <li>Finally {@link Subject#execute(Runnable) executes} the
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AbstractShiroFilter.java`
#### Snippet
```java
     * {@link Subject} instance based on the specified request/response pair.</li>
     * <li>Finally {@link Subject#execute(Runnable) executes} the
     * {@link #updateSessionLastAccessTime(javax.servlet.ServletRequest, javax.servlet.ServletResponse)} and
     * {@link #executeChain(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)}
     * methods</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AbstractShiroFilter.java`
#### Snippet
```java
     * {@link Subject} instance based on the specified request/response pair.</li>
     * <li>Finally {@link Subject#execute(Runnable) executes} the
     * {@link #updateSessionLastAccessTime(javax.servlet.ServletRequest, javax.servlet.ServletResponse)} and
     * {@link #executeChain(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)}
     * methods</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AbstractShiroFilter.java`
#### Snippet
```java
     * <li>Finally {@link Subject#execute(Runnable) executes} the
     * {@link #updateSessionLastAccessTime(javax.servlet.ServletRequest, javax.servlet.ServletResponse)} and
     * {@link #executeChain(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)}
     * methods</li>
     * </ol>
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AbstractShiroFilter.java`
#### Snippet
```java
     * <li>Finally {@link Subject#execute(Runnable) executes} the
     * {@link #updateSessionLastAccessTime(javax.servlet.ServletRequest, javax.servlet.ServletResponse)} and
     * {@link #executeChain(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)}
     * methods</li>
     * </ol>
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AbstractShiroFilter.java`
#### Snippet
```java
     * <li>Finally {@link Subject#execute(Runnable) executes} the
     * {@link #updateSessionLastAccessTime(javax.servlet.ServletRequest, javax.servlet.ServletResponse)} and
     * {@link #executeChain(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)}
     * methods</li>
     * </ol>
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AbstractShiroFilter.java`
#### Snippet
```java
     * @param chain           the container-provided {@code FilterChain} to execute
     * @throws IOException                    if an IO error occurs
     * @throws javax.servlet.ServletException if an Throwable other than an IOException
     */
    protected void doFilterInternal(ServletRequest servletRequest, ServletResponse servletResponse, final FilterChain chain)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AbstractShiroFilter.java`
#### Snippet
```java
    /**
     * Wraps the original HttpServletRequest in a {@link ShiroHttpServletRequest}, which is required for supporting
     * Servlet Specification behavior backed by a {@link org.apache.shiro.subject.Subject Subject} instance.
     *
     * @param orig the original Servlet Container-provided incoming {@code HttpServletRequest} instance.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.web.mgt` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AbstractShiroFilter.java`
#### Snippet
```java
 * {@link #init()} method implementation.  That implementation should make available any constructed
 * {@code SecurityManager} and {@code FilterChainResolver} by calling
 * {@link #setSecurityManager(org.apache.shiro.web.mgt.WebSecurityManager)} and
 * {@link #setFilterChainResolver(org.apache.shiro.web.filter.mgt.FilterChainResolver)} methods respectively.
 * <h3>Static SecurityManager</h3>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.web.filter.mgt` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/AbstractShiroFilter.java`
#### Snippet
```java
 * {@code SecurityManager} and {@code FilterChainResolver} by calling
 * {@link #setSecurityManager(org.apache.shiro.web.mgt.WebSecurityManager)} and
 * {@link #setFilterChainResolver(org.apache.shiro.web.filter.mgt.FilterChainResolver)} methods respectively.
 * <h3>Static SecurityManager</h3>
 * By default the {@code SecurityManager} instance enabled by this filter <em>will not</em> be enabled in static
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet.http` is unnecessary and can be removed
in `web/src/main/java/org/apache/shiro/web/servlet/SimpleCookie.java`
#### Snippet
```java
    /**
     * Returns the Cookie's calculated path setting.  If the {@link javax.servlet.http.Cookie#getPath() path} is {@code null}, then the
     * {@code request}'s {@link javax.servlet.http.HttpServletRequest#getContextPath() context path}
     * will be returned. If getContextPath() is the empty string or null then the ROOT_PATH constant is returned.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.lang.util` is unnecessary and can be removed
in `crypto/core/src/main/java/org/apache/shiro/crypto/RandomNumberGenerator.java`
#### Snippet
```java
 * <li>Perhaps most important for Shiro end-users, tt can more easily be used as a source of cryptographic seed data,
 * and the data returned is already in a more convenient {@link ByteSource ByteSource} format in case that data needs
 * to be {@link org.apache.shiro.lang.util.ByteSource#toHex() hex} or
 * {@link org.apache.shiro.lang.util.ByteSource#toBase64() base64}-encoded.</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.lang.util` is unnecessary and can be removed
in `crypto/core/src/main/java/org/apache/shiro/crypto/RandomNumberGenerator.java`
#### Snippet
```java
 * and the data returned is already in a more convenient {@link ByteSource ByteSource} format in case that data needs
 * to be {@link org.apache.shiro.lang.util.ByteSource#toHex() hex} or
 * {@link org.apache.shiro.lang.util.ByteSource#toBase64() base64}-encoded.</li>
 * </ul>
 * For example, consider the following example generating password salts for new user accounts:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.crypto` is unnecessary and can be removed
in `crypto/core/src/main/java/org/apache/shiro/crypto/RandomNumberGenerator.java`
#### Snippet
```java
 * For example, consider the following example generating password salts for new user accounts:
 * <pre>
 * RandomNumberGenerator saltGenerator = new {@link org.apache.shiro.crypto.SecureRandomNumberGenerator SecureRandomNumberGenerator}();
 * User user = new User();
 * user.setPasswordSalt(saltGenerator.nextBytes().toBase64());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.crypto.hash` is unnecessary and can be removed
in `crypto/support/hashes/argon2/src/main/java/org/apache/shiro/crypto/support/hashes/argon2/Argon2HashProvider.java`
#### Snippet
```java
     * <p>This class contains public constants only. The constants starting with {@code PARAMETER_} are
     * the parameter names recognized by the
     * {@link org.apache.shiro.crypto.hash.HashSpi.HashFactory#generate(HashRequest)} method.</p>
     *
     * <p>The constants starting with {@code DEFAULT_} are their respective default values.</p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.event` is unnecessary and can be removed
in `event/src/main/java/org/apache/shiro/event/EventBus.java`
#### Snippet
```java
 *     <li>For each type of event you wish to consume, create a public method that accepts a single event argument.
 *     The method argument type indicates the type of event to receive.</li>
 *     <li>Annotate each of these public methods with the {@link org.apache.shiro.event.Subscribe Subscribe} annotation.</li>
 *     <li>Register the component with the event bus:
 *     <pre>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.ee.faces.tags` is unnecessary and can be removed
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/faces/tags/SecureComponent.java`
#### Snippet
```java
 *
 * <p>OBS: Your subclass is responsible for saving the state of the component.
 * See {@link org.apache.shiro.ee.faces.tags.PrincipalTag}'s
 * StateHolder Methods for an example.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.faces.view` is unnecessary, and can be replaced with an import
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/cdi/ShiroScopeContext.java`
#### Snippet
```java
        this.scopeType = scopeType;
        this.webScopeType = webScopeType;
        isViewScoped = webScopeType == javax.faces.view.ViewScoped.class
                || webScopeType == org.omnifaces.cdi.ViewScoped.class;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.omnifaces.cdi` is unnecessary, and can be replaced with an import
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/cdi/ShiroScopeContext.java`
#### Snippet
```java
        this.webScopeType = webScopeType;
        isViewScoped = webScopeType == javax.faces.view.ViewScoped.class
                || webScopeType == org.omnifaces.cdi.ViewScoped.class;
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.ee.filters` is unnecessary and can be removed
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/PassThruAuthenticationFilter.java`
#### Snippet
```java
    @Override
    protected String getPathWithinApplication(ServletRequest request) {
        return org.apache.shiro.ee.filters.FormAuthenticationFilter
                .getPathWithinApplication(request, () -> super.getPathWithinApplication(request));
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.omnifaces.cdi` is unnecessary, and can be replaced with an import
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/cdi/ShiroSessionScopeExtension.java`
#### Snippet
```java
    }

    <T> void addOmniViewScoped(@Observes @WithAnnotations(org.omnifaces.cdi.ViewScoped.class) ProcessAnnotatedType<T> pat) {
        pat.setAnnotatedType(new AnnotatedTypeWrapper<>(pat.getAnnotatedType(), true,
                Set.of(ShiroOmniViewScopedAnnotated.class.getDeclaredAnnotations()[0],
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.faces.view` is unnecessary, and can be replaced with an import
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/cdi/ShiroSessionScopeExtension.java`
#### Snippet
```java
    @SuppressWarnings("serial")
    private static class SessionScopedAnnotated implements Serializable { }
    @javax.faces.view.ViewScoped
    @SuppressWarnings("serial")
    private static class FacesViewScopedAnnotated implements Serializable { }
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.faces.view` is unnecessary, and can be replaced with an import
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/cdi/ShiroSessionScopeExtension.java`
#### Snippet
```java
    private static final List<ShiroScopeContext> contexts = Stream.of(
            new ShiroScopeContext(ShiroSessionScoped.class, SessionScoped.class),
            new ShiroScopeContext(ShiroFacesViewScoped.class, javax.faces.view.ViewScoped.class),
            new ShiroScopeContext(ShiroOmniViewScoped.class, org.omnifaces.cdi.ViewScoped.class))
            .collect(Collectors.toList());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.omnifaces.cdi` is unnecessary, and can be replaced with an import
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/cdi/ShiroSessionScopeExtension.java`
#### Snippet
```java
            new ShiroScopeContext(ShiroSessionScoped.class, SessionScoped.class),
            new ShiroScopeContext(ShiroFacesViewScoped.class, javax.faces.view.ViewScoped.class),
            new ShiroScopeContext(ShiroOmniViewScoped.class, org.omnifaces.cdi.ViewScoped.class))
            .collect(Collectors.toList());

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.faces.view` is unnecessary, and can be replaced with an import
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/cdi/ShiroSessionScopeExtension.java`
#### Snippet
```java
    }

    <T> void addFacesViewScoped(@Observes @WithAnnotations(javax.faces.view.ViewScoped.class) ProcessAnnotatedType<T> pat) {
        pat.setAnnotatedType(new AnnotatedTypeWrapper<>(pat.getAnnotatedType(), true,
                Set.of(ShiroFacesViewScopedAnnotated.class.getDeclaredAnnotations()[0],
```

### UnnecessaryFullyQualifiedName
Qualifier `org.omnifaces.cdi` is unnecessary, and can be replaced with an import
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/cdi/ShiroSessionScopeExtension.java`
#### Snippet
```java
    @SuppressWarnings("serial")
    private static class FacesViewScopedAnnotated implements Serializable { }
    @org.omnifaces.cdi.ViewScoped
    @SuppressWarnings("serial")
    private static class OmniViewScopedAnnotated implements Serializable { }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.lang.util` is unnecessary and can be removed
in `support/guice/src/main/java/org/apache/shiro/guice/InitializableInjectionListener.java`
#### Snippet
```java

/**
 * Injection listener that honors the {@link org.apache.shiro.lang.util.Initializable} interface.
 *
 * @param <I>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.lang.util` is unnecessary and can be removed
in `support/guice/src/main/java/org/apache/shiro/guice/DestroyableInjectionListener.java`
#### Snippet
```java

/**
 * Injection listener that assists with honoring the {@link org.apache.shiro.lang.util.Destroyable} interface.
 *
 * @param <I>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.aopalliance.intercept` is unnecessary and can be removed
in `support/guice/src/main/java/org/apache/shiro/guice/aop/AopAllianceMethodInvocationAdapter.java`
#### Snippet
```java
/**
 * Adapts a Shiro {@link org.apache.shiro.aop.MethodInvocation MethodInvocation} to an AOPAlliance
 * {@link org.aopalliance.intercept.MethodInvocation}.
 */
class AopAllianceMethodInvocationAdapter implements org.apache.shiro.aop.MethodInvocation {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.aopalliance.intercept` is unnecessary and can be removed
in `support/guice/src/main/java/org/apache/shiro/guice/aop/AopAllianceMethodInterceptorAdapter.java`
#### Snippet
```java
/**
 * Adapts a Shiro {@link org.apache.shiro.aop.MethodInterceptor MethodInterceptor} to an AOPAlliance
 * {@link org.aopalliance.intercept.MethodInterceptor}.
 */
class AopAllianceMethodInterceptorAdapter implements MethodInterceptor {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.aop` is unnecessary and can be removed
in `support/guice/src/main/java/org/apache/shiro/guice/aop/ShiroAopModule.java`
#### Snippet
```java
/**
 * Install this module to enable Shiro AOP functionality in Guice.  You may extend it to add your own Shiro
 * interceptors, override the default ones, or provide a specific {@link org.apache.shiro.aop.AnnotationResolver}.
 */
public class ShiroAopModule extends AbstractModule {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.lang.util` is unnecessary and can be removed
in `support/spring/src/main/java/org/apache/shiro/spring/LifecycleBeanPostProcessor.java`
#### Snippet
```java

    /**
     * Calls the <tt>init()</tt> methods on the bean if it implements {@link org.apache.shiro.lang.util.Initializable}
     *
     * @param object the object being initialized.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.lang.util` is unnecessary and can be removed
in `support/spring/src/main/java/org/apache/shiro/spring/LifecycleBeanPostProcessor.java`
#### Snippet
```java

    /**
     * Calls the <tt>destroy()</tt> methods on the bean if it implements {@link org.apache.shiro.lang.util.Destroyable}
     *
     * @param object the object being initialized.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.lang.util` is unnecessary and can be removed
in `support/spring/src/main/java/org/apache/shiro/spring/LifecycleBeanPostProcessor.java`
#### Snippet
```java
/**
 * <p>Bean post processor for Spring that automatically calls the <tt>init()</tt> and/or
 * <tt>destroy()</tt> methods on Shiro objects that implement the {@link org.apache.shiro.lang.util.Initializable}
 * or {@link org.apache.shiro.lang.util.Destroyable} interfaces, respectfully.  This post processor makes it easier
 * to configure Shiro beans in Spring, since the user never has to worry about whether or not if they
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.lang.util` is unnecessary and can be removed
in `support/spring/src/main/java/org/apache/shiro/spring/LifecycleBeanPostProcessor.java`
#### Snippet
```java
 * <p>Bean post processor for Spring that automatically calls the <tt>init()</tt> and/or
 * <tt>destroy()</tt> methods on Shiro objects that implement the {@link org.apache.shiro.lang.util.Initializable}
 * or {@link org.apache.shiro.lang.util.Destroyable} interfaces, respectfully.  This post processor makes it easier
 * to configure Shiro beans in Spring, since the user never has to worry about whether or not if they
 * have to specify init-method and destroy-method bean attributes.</p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.mgt` is unnecessary and can be removed
in `support/guice/src/main/java/org/apache/shiro/guice/ShiroModule.java`
#### Snippet
```java
     * Binds the security manager.  Override this method in order to provide your own security manager binding.
     * <p/>
     * By default, a {@link org.apache.shiro.mgt.DefaultSecurityManager} is bound as an eager singleton.
     *
     * @param bind
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.lang.util` is unnecessary and can be removed
in `support/guice/src/main/java/org/apache/shiro/guice/ShiroModule.java`
#### Snippet
```java

    /**
     * Destroys all beans created within this module that implement {@link org.apache.shiro.lang.util.Destroyable}.  Should be called when this
     * module will no longer be used.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session.mgt` is unnecessary and can be removed
in `support/guice/src/main/java/org/apache/shiro/guice/ShiroModule.java`
#### Snippet
```java
/**
 * Sets up Shiro lifecycles within Guice, enables the injecting of Shiro objects, and binds a default
 * {@link org.apache.shiro.mgt.SecurityManager} and {@link org.apache.shiro.session.mgt.SessionManager}.  At least one realm must be added by using
 * {@link #bindRealm() bindRealm}.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session.mgt` is unnecessary and can be removed
in `support/guice/src/main/java/org/apache/shiro/guice/ShiroModule.java`
#### Snippet
```java
     * Binds the session manager.  Override this method in order to provide your own session manager binding.
     * <p/>
     * By default, a {@link org.apache.shiro.session.mgt.DefaultSessionManager} is bound as an eager singleton.
     *
     * @param bind
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz.aop` is unnecessary and can be removed
in `support/spring/src/main/java/org/apache/shiro/spring/security/interceptor/AopAllianceAnnotationsAuthorizingMethodInterceptor.java`
#### Snippet
```java
    /**
     * Creates a Shiro {@link MethodInvocation MethodInvocation} instance and then immediately calls
     * {@link org.apache.shiro.authz.aop.AuthorizingMethodInterceptor#invoke super.invoke}.
     *
     * @param methodInvocation the AOP Alliance-specific <code>methodInvocation</code> instance.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.aopalliance.intercept` is unnecessary and can be removed
in `support/spring/src/main/java/org/apache/shiro/spring/security/interceptor/AopAllianceAnnotationsAuthorizingMethodInterceptor.java`
#### Snippet
```java
    /**
     * Simply casts the method argument to an
     * {@link org.aopalliance.intercept.MethodInvocation org.aopalliance.intercept.MethodInvocation} and then
     * calls <code>methodInvocation.{@link org.aopalliance.intercept.MethodInvocation#proceed proceed}()</code>
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.aopalliance.intercept` is unnecessary and can be removed
in `support/spring/src/main/java/org/apache/shiro/spring/security/interceptor/AopAllianceAnnotationsAuthorizingMethodInterceptor.java`
#### Snippet
```java
     * Simply casts the method argument to an
     * {@link org.aopalliance.intercept.MethodInvocation org.aopalliance.intercept.MethodInvocation} and then
     * calls <code>methodInvocation.{@link org.aopalliance.intercept.MethodInvocation#proceed proceed}()</code>
     *
     * @param aopAllianceMethodInvocation the {@link org.aopalliance.intercept.MethodInvocation org.aopalliance.intercept.MethodInvocation}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.aopalliance.intercept` is unnecessary and can be removed
in `support/spring/src/main/java/org/apache/shiro/spring/security/interceptor/AopAllianceAnnotationsAuthorizingMethodInterceptor.java`
#### Snippet
```java
     * calls <code>methodInvocation.{@link org.aopalliance.intercept.MethodInvocation#proceed proceed}()</code>
     *
     * @param aopAllianceMethodInvocation the {@link org.aopalliance.intercept.MethodInvocation org.aopalliance.intercept.MethodInvocation}
     * @return the {@link org.aopalliance.intercept.MethodInvocation#proceed() org.aopalliance.intercept.MethodInvocation.proceed()} method call result.
     * @throws Throwable if the underlying AOP Alliance <code>proceed()</code> call throws a <code>Throwable</code>.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.aopalliance.intercept` is unnecessary and can be removed
in `support/spring/src/main/java/org/apache/shiro/spring/security/interceptor/AopAllianceAnnotationsAuthorizingMethodInterceptor.java`
#### Snippet
```java
     *
     * @param aopAllianceMethodInvocation the {@link org.aopalliance.intercept.MethodInvocation org.aopalliance.intercept.MethodInvocation}
     * @return the {@link org.aopalliance.intercept.MethodInvocation#proceed() org.aopalliance.intercept.MethodInvocation.proceed()} method call result.
     * @throws Throwable if the underlying AOP Alliance <code>proceed()</code> call throws a <code>Throwable</code>.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.aopalliance.intercept` is unnecessary and can be removed
in `support/spring/src/main/java/org/apache/shiro/spring/security/interceptor/AopAllianceAnnotationsAuthorizingMethodInterceptor.java`
#### Snippet
```java
    /**
     * Creates a {@link MethodInvocation MethodInvocation} that wraps an
     * {@link org.aopalliance.intercept.MethodInvocation org.aopalliance.intercept.MethodInvocation} instance,
     * enabling Shiro Annotations in <a href="http://aopalliance.sourceforge.net/">AOP Alliance</a> environments
     * (Spring, etc.).
```

### UnnecessaryFullyQualifiedName
Qualifier `org.aopalliance.intercept` is unnecessary and can be removed
in `support/spring/src/main/java/org/apache/shiro/spring/security/interceptor/AopAllianceAnnotationsAuthorizingMethodInterceptor.java`
#### Snippet
```java
     * (Spring, etc.).
     *
     * @param implSpecificMethodInvocation AOP Alliance {@link org.aopalliance.intercept.MethodInvocation MethodInvocation}
     * @return a Shiro {@link MethodInvocation MethodInvocation} instance that wraps the AOP Alliance instance.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz.annotation` is unnecessary and can be removed
in `support/spring/src/main/java/org/apache/shiro/spring/security/interceptor/AuthorizationAttributeSourceAdvisor.java`
#### Snippet
```java
     * The annotations inspected are:
     * <ul>
     * <li>{@link org.apache.shiro.authz.annotation.RequiresAuthentication RequiresAuthentication}</li>
     * <li>{@link org.apache.shiro.authz.annotation.RequiresUser RequiresUser}</li>
     * <li>{@link org.apache.shiro.authz.annotation.RequiresGuest RequiresGuest}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz.annotation` is unnecessary and can be removed
in `support/spring/src/main/java/org/apache/shiro/spring/security/interceptor/AuthorizationAttributeSourceAdvisor.java`
#### Snippet
```java
     * <ul>
     * <li>{@link org.apache.shiro.authz.annotation.RequiresAuthentication RequiresAuthentication}</li>
     * <li>{@link org.apache.shiro.authz.annotation.RequiresUser RequiresUser}</li>
     * <li>{@link org.apache.shiro.authz.annotation.RequiresGuest RequiresGuest}</li>
     * <li>{@link org.apache.shiro.authz.annotation.RequiresRoles RequiresRoles}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz.annotation` is unnecessary and can be removed
in `support/spring/src/main/java/org/apache/shiro/spring/security/interceptor/AuthorizationAttributeSourceAdvisor.java`
#### Snippet
```java
     * <li>{@link org.apache.shiro.authz.annotation.RequiresAuthentication RequiresAuthentication}</li>
     * <li>{@link org.apache.shiro.authz.annotation.RequiresUser RequiresUser}</li>
     * <li>{@link org.apache.shiro.authz.annotation.RequiresGuest RequiresGuest}</li>
     * <li>{@link org.apache.shiro.authz.annotation.RequiresRoles RequiresRoles}</li>
     * <li>{@link org.apache.shiro.authz.annotation.RequiresPermissions RequiresPermissions}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz.annotation` is unnecessary and can be removed
in `support/spring/src/main/java/org/apache/shiro/spring/security/interceptor/AuthorizationAttributeSourceAdvisor.java`
#### Snippet
```java
     * <li>{@link org.apache.shiro.authz.annotation.RequiresUser RequiresUser}</li>
     * <li>{@link org.apache.shiro.authz.annotation.RequiresGuest RequiresGuest}</li>
     * <li>{@link org.apache.shiro.authz.annotation.RequiresRoles RequiresRoles}</li>
     * <li>{@link org.apache.shiro.authz.annotation.RequiresPermissions RequiresPermissions}</li>
     * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz.annotation` is unnecessary and can be removed
in `support/spring/src/main/java/org/apache/shiro/spring/security/interceptor/AuthorizationAttributeSourceAdvisor.java`
#### Snippet
```java
     * <li>{@link org.apache.shiro.authz.annotation.RequiresGuest RequiresGuest}</li>
     * <li>{@link org.apache.shiro.authz.annotation.RequiresRoles RequiresRoles}</li>
     * <li>{@link org.apache.shiro.authz.annotation.RequiresPermissions RequiresPermissions}</li>
     * </ul>
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `support/spring/src/main/java/org/apache/shiro/spring/security/interceptor/AuthorizationAttributeSourceAdvisor.java`
#### Snippet
```java
     * @param targetClass the class potentially declaring Shiro annotations
     * @return <tt>true</tt> if the method has a Shiro annotation, false otherwise.
     * @see org.springframework.aop.MethodMatcher#matches(java.lang.reflect.Method, Class)
     */
    public boolean matches(Method method, Class targetClass) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.cache` is unnecessary and can be removed
in `support/jcache/src/main/java/org/apache/shiro/cache/jcache/JCacheManager.java`
#### Snippet
```java
     * this case.
     *
     * @throws org.apache.shiro.cache.CacheException
     *          if there are any CacheExceptions thrown by JCache.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.web.servlet` is unnecessary, and can be replaced with an import
in `integration-tests/jaxrs/app/src/main/java/org/apache/shiro/testing/jaxrs/app/config/ShiroServletFilter.java`
#### Snippet
```java
        dispatcherTypes = {DispatcherType.REQUEST, DispatcherType.FORWARD, DispatcherType.INCLUDE, DispatcherType.ERROR, DispatcherType.ASYNC}
)
public class ShiroServletFilter extends org.apache.shiro.web.servlet.ShiroFilter {
}

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session.mgt` is unnecessary and can be removed
in `support/quartz/src/main/java/org/apache/shiro/session/mgt/quartz/QuartzSessionValidationJob.java`
#### Snippet
```java

/**
 * A quartz job that basically just calls the {@link org.apache.shiro.session.mgt.ValidatingSessionManager#validateSessions()}
 * method on a configured session manager.  The session manager will automatically be injected by the
 * superclass if it is in the job data map or the scheduler map.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session.mgt` is unnecessary and can be removed
in `support/quartz/src/main/java/org/apache/shiro/session/mgt/quartz/QuartzSessionValidationScheduler.java`
#### Snippet
```java

/**
 * An implementation of the {@link org.apache.shiro.session.mgt.SessionValidationScheduler SessionValidationScheduler} that uses Quartz to schedule a
 * job to call {@link org.apache.shiro.session.mgt.ValidatingSessionManager#validateSessions()} on
 * a regular basis.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session.mgt` is unnecessary and can be removed
in `support/quartz/src/main/java/org/apache/shiro/session/mgt/quartz/QuartzSessionValidationScheduler.java`
#### Snippet
```java
/**
 * An implementation of the {@link org.apache.shiro.session.mgt.SessionValidationScheduler SessionValidationScheduler} that uses Quartz to schedule a
 * job to call {@link org.apache.shiro.session.mgt.ValidatingSessionManager#validateSessions()} on
 * a regular basis.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session.mgt` is unnecessary and can be removed
in `support/quartz/src/main/java/org/apache/shiro/session/mgt/quartz/QuartzSessionValidationScheduler.java`
#### Snippet
```java
    /**
     * Specifies how frequently (in milliseconds) this Scheduler will call the
     * {@link org.apache.shiro.session.mgt.ValidatingSessionManager#validateSessions() ValidatingSessionManager#validateSessions()} method.
     *
     * <p>Unless this method is called, the default value is {@link #DEFAULT_SESSION_VALIDATION_INTERVAL}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.web.servlet` is unnecessary and can be removed
in `support/spring/src/main/java/org/apache/shiro/spring/web/ShiroFilterFactoryBean.java`
#### Snippet
```java

    /**
     * Returns <code>{@link org.apache.shiro.web.servlet.AbstractShiroFilter}.class</code>
     *
     * @return <code>{@link org.apache.shiro.web.servlet.AbstractShiroFilter}.class</code>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.web.servlet` is unnecessary and can be removed
in `support/spring/src/main/java/org/apache/shiro/spring/web/ShiroFilterFactoryBean.java`
#### Snippet
```java
     * Returns <code>{@link org.apache.shiro.web.servlet.AbstractShiroFilter}.class</code>
     *
     * @return <code>{@link org.apache.shiro.web.servlet.AbstractShiroFilter}.class</code>
     */
    public Class getObjectType() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.web.mgt` is unnecessary and can be removed
in `support/spring/src/main/java/org/apache/shiro/spring/web/ShiroFilterFactoryBean.java`
#### Snippet
```java
     * and initialization behavior.  Because this {@code FactoryBean} implementation manually builds the
     * {@link AbstractShiroFilter}'s
     * {@link AbstractShiroFilter#setSecurityManager(org.apache.shiro.web.mgt.WebSecurityManager) securityManager} and
     * {@link AbstractShiroFilter#setFilterChainResolver(org.apache.shiro.web.filter.mgt.FilterChainResolver) filterChainResolver}
     * properties, the only thing left to do is set those properties explicitly.  We do that in a simple
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.web.filter.mgt` is unnecessary and can be removed
in `support/spring/src/main/java/org/apache/shiro/spring/web/ShiroFilterFactoryBean.java`
#### Snippet
```java
     * {@link AbstractShiroFilter}'s
     * {@link AbstractShiroFilter#setSecurityManager(org.apache.shiro.web.mgt.WebSecurityManager) securityManager} and
     * {@link AbstractShiroFilter#setFilterChainResolver(org.apache.shiro.web.filter.mgt.FilterChainResolver) filterChainResolver}
     * properties, the only thing left to do is set those properties explicitly.  We do that in a simple
     * concrete subclass in the constructor.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `support/spring/src/main/java/org/apache/shiro/spring/web/ShiroFilterFactoryBean.java`
#### Snippet
```java
     * property has been set</li>
     * <li>{@link #createFilterChainManager() Creates} a {@link FilterChainManager} instance that reflects the
     * configured {@link #setFilters(java.util.Map) filters} and
     * {@link #setFilterChainDefinitionMap(java.util.Map) filter chain definitions}</li>
     * <li>Wraps the FilterChainManager with a suitable
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `support/spring/src/main/java/org/apache/shiro/spring/web/ShiroFilterFactoryBean.java`
#### Snippet
```java
     * <li>{@link #createFilterChainManager() Creates} a {@link FilterChainManager} instance that reflects the
     * configured {@link #setFilters(java.util.Map) filters} and
     * {@link #setFilterChainDefinitionMap(java.util.Map) filter chain definitions}</li>
     * <li>Wraps the FilterChainManager with a suitable
     * {@link org.apache.shiro.web.filter.mgt.FilterChainResolver FilterChainResolver} since the Shiro Filter
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.web.filter.mgt` is unnecessary and can be removed
in `support/spring/src/main/java/org/apache/shiro/spring/web/ShiroFilterFactoryBean.java`
#### Snippet
```java
     * {@link #setFilterChainDefinitionMap(java.util.Map) filter chain definitions}</li>
     * <li>Wraps the FilterChainManager with a suitable
     * {@link org.apache.shiro.web.filter.mgt.FilterChainResolver FilterChainResolver} since the Shiro Filter
     * implementations do not know of {@code FilterChainManager}s</li>
     * <li>Sets both the {@code SecurityManager} and {@code FilterChainResolver} instances on a new Shiro Filter
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `support/spring/src/main/java/org/apache/shiro/spring/web/ShiroFilterFactoryBean.java`
#### Snippet
```java
    /**
     * Sets the filterName-to-Filter map of filters available for reference when creating
     * {@link #setFilterChainDefinitionMap(java.util.Map) filter chain definitions}.
     * <p/>
     * <b>Note:</b> This property is optional:  this {@code FactoryBean} implementation will discover all beans in the
```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.beans.factory` is unnecessary and can be removed
in `support/spring/src/main/java/org/apache/shiro/spring/web/ShiroFilterFactoryBean.java`
#### Snippet
```java

/**
 * {@link org.springframework.beans.factory.FactoryBean FactoryBean} to be used in Spring-based web applications for
 * defining the master Shiro Filter.
 * <h4>Usage</h4>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `support/spring/src/main/java/org/apache/shiro/spring/web/ShiroFilterFactoryBean.java`
#### Snippet
```java
 * </pre>
 * <h4>Filter Auto-Discovery</h4>
 * While there is a {@link #setFilters(java.util.Map) filters} property that allows you to assign a filter beans
 * to the 'pool' of filters available when defining {@link #setFilterChainDefinitions(String) filter chains}, it is
 * optional.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `support/spring/src/main/java/org/apache/shiro/spring/web/ShiroFilterFactoryBean.java`
#### Snippet
```java
 * <p/>
 * This implementation is also a {@link BeanPostProcessor} and will acquire
 * any {@link javax.servlet.Filter Filter} beans defined independently in your Spring application context.  Upon
 * discovery, they will be automatically added to the {@link #setFilters(java.util.Map) map} keyed by the bean ID.
 * That ID can then be used in the filter chain definitions, for example:
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `support/spring/src/main/java/org/apache/shiro/spring/web/ShiroFilterFactoryBean.java`
#### Snippet
```java
 * This implementation is also a {@link BeanPostProcessor} and will acquire
 * any {@link javax.servlet.Filter Filter} beans defined independently in your Spring application context.  Upon
 * discovery, they will be automatically added to the {@link #setFilters(java.util.Map) map} keyed by the bean ID.
 * That ID can then be used in the filter chain definitions, for example:
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `support/spring/src/main/java/org/apache/shiro/spring/web/ShiroFilterFactoryBean.java`
#### Snippet
```java
    /**
     * Inspects a bean, and if it implements the {@link Filter} interface, automatically adds that filter
     * instance to the internal {@link #setFilters(java.util.Map) filters map} that will be referenced
     * later during filter chain construction.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `support/spring/src/main/java/org/apache/shiro/spring/web/ShiroFilterFactoryBean.java`
#### Snippet
```java

    /**
     * A convenience method that sets the {@link #setFilterChainDefinitionMap(java.util.Map) filterChainDefinitionMap}
     * property by accepting a {@link java.util.Properties Properties}-compatible string (multi-line key/value pairs).
     * Each key/value pair must conform to the format defined by the
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz.aop` is unnecessary and can be removed
in `support/cdi/src/main/java/org/apache/shiro/cdi/AopHelper.java`
#### Snippet
```java

    /**
     * Create {@link org.apache.shiro.authz.aop.AuthorizingAnnotationHandler}
     * for annotation.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/aop/MethodInterceptorSupport.java`
#### Snippet
```java
     * Returns the {@link Subject Subject} associated with the currently-executing code.
     * <p/>
     * This default implementation merely calls <code>{@link org.apache.shiro.SecurityUtils#getSubject SecurityUtils.getSubject()}</code>.
     *
     * @return the {@link org.apache.shiro.subject.Subject Subject} associated with the currently-executing code.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/aop/MethodInterceptorSupport.java`
#### Snippet
```java
     * This default implementation merely calls <code>{@link org.apache.shiro.SecurityUtils#getSubject SecurityUtils.getSubject()}</code>.
     *
     * @return the {@link org.apache.shiro.subject.Subject Subject} associated with the currently-executing code.
     */
    protected Subject getSubject() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/env/DefaultEnvironment.java`
#### Snippet
```java
/**
 * Simple/default {@code Environment} implementation that stores Shiro objects as key-value pairs in a
 * {@link java.util.Map Map} instance.  The key is the object name, the value is the object itself.
 *
 * @since 1.2
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.cache` is unnecessary and can be removed
in `support/ehcache/src/main/java/org/apache/shiro/cache/ehcache/EhCacheManager.java`
#### Snippet
```java
     * this case.
     *
     * @throws org.apache.shiro.cache.CacheException
     *          if there are any CacheExceptions thrown by EhCache.
     * @see net.sf.ehcache.CacheManager#create
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.lang.io` is unnecessary and can be removed
in `support/ehcache/src/main/java/org/apache/shiro/cache/ehcache/EhCacheManager.java`
#### Snippet
```java
     * Returns the resource location of the config file used to initialize a new
     * EhCache CacheManager instance.  The string can be any resource path supported by the
     * {@link org.apache.shiro.lang.io.ResourceUtils#getInputStreamForPath(String)} call.
     * <p/>
     * This property is ignored if the CacheManager instance is injected directly - that is, it is only used to
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.lang.io` is unnecessary and can be removed
in `support/ehcache/src/main/java/org/apache/shiro/cache/ehcache/EhCacheManager.java`
#### Snippet
```java
     * Sets the resource location of the config file used to initialize the wrapped
     * EhCache CacheManager instance.  The string can be any resource path supported by the
     * {@link org.apache.shiro.lang.io.ResourceUtils#getInputStreamForPath(String)} call.
     * <p/>
     * This property is ignored if the CacheManager instance is injected directly - that is, it is only used to
```

### UnnecessaryFullyQualifiedName
Qualifier `net.sf.ehcache` is unnecessary, and can be replaced with an import
in `support/ehcache/src/main/java/org/apache/shiro/cache/ehcache/EhCacheManager.java`
#### Snippet
```java

        try {
            net.sf.ehcache.Ehcache cache = ensureCacheManager().getEhcache(name);
            if (cache == null) {
                if (log.isInfoEnabled()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.cache` is unnecessary and can be removed
in `support/ehcache/src/main/java/org/apache/shiro/cache/ehcache/EhCache.java`
#### Snippet
```java

/**
 * Shiro {@link org.apache.shiro.cache.Cache} implementation that wraps an {@link net.sf.ehcache.Ehcache} instance.
 *
 * @since 0.2
```

### UnnecessaryFullyQualifiedName
Qualifier `net.sf.ehcache` is unnecessary, and can be replaced with an import
in `support/ehcache/src/main/java/org/apache/shiro/cache/ehcache/EhCache.java`
#### Snippet
```java
     * @param cache - delegate EhCache instance this Shiro cache instance will wrap.
     */
    public EhCache(net.sf.ehcache.Ehcache cache) {
        if (cache == null) {
            throw new IllegalArgumentException("Cache argument cannot be null.");
```

### UnnecessaryFullyQualifiedName
Qualifier `net.sf.ehcache` is unnecessary, and can be replaced with an import
in `support/ehcache/src/main/java/org/apache/shiro/cache/ehcache/EhCache.java`
#### Snippet
```java
     * The wrapped Ehcache instance.
     */
    private net.sf.ehcache.Ehcache cache;

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/aop/AnnotationHandler.java`
#### Snippet
```java

    /**
     * Returns the {@link org.apache.shiro.subject.Subject Subject} associated with the currently-executing code.
     * <p/>
     * This default implementation merely calls <code>{@link org.apache.shiro.SecurityUtils#getSubject SecurityUtils.getSubject()}</code>.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/aop/AnnotationHandler.java`
#### Snippet
```java
     * Returns the {@link org.apache.shiro.subject.Subject Subject} associated with the currently-executing code.
     * <p/>
     * This default implementation merely calls <code>{@link org.apache.shiro.SecurityUtils#getSubject SecurityUtils.getSubject()}</code>.
     *
     * @return the {@link org.apache.shiro.subject.Subject Subject} associated with the currently-executing code.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/aop/AnnotationHandler.java`
#### Snippet
```java
     * This default implementation merely calls <code>{@link org.apache.shiro.SecurityUtils#getSubject SecurityUtils.getSubject()}</code>.
     *
     * @return the {@link org.apache.shiro.subject.Subject Subject} associated with the currently-executing code.
     */
    protected Subject getSubject() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.aop` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/aop/DefaultAnnotationResolver.java`
#### Snippet
```java

    /**
     * Returns {@code methodInvocation.}{@link org.apache.shiro.aop.MethodInvocation#getMethod() getMethod()}.{@link Method#getAnnotation(Class) getAnnotation(clazz)}.
     *
     * @param mi    the intercepted method to be invoked.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/SecurityManager.java`
#### Snippet
```java
     * Note that most application developers should not call this method unless they have a good reason for doing
     * so.  The preferred way to logout a Subject is to call
     * <code>{@link org.apache.shiro.subject.Subject#logout Subject.logout()}</code>, not the
     * {@code SecurityManager} directly.
     * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/SecurityManager.java`
#### Snippet
```java
     * Note that most application developers should probably not call this method directly unless they have a good
     * reason for doing so.  The preferred way to log in a Subject is to call
     * <code>subject.{@link org.apache.shiro.subject.Subject#login login(authenticationToken)}</code> (usually after
     * acquiring the Subject by calling {@link org.apache.shiro.SecurityUtils#getSubject() SecurityUtils.getSubject()}).
     * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/SecurityManager.java`
#### Snippet
```java
 * single application.
 * <p/>
 * The interface itself primarily exists as a convenience - it extends the {@link org.apache.shiro.authc.Authenticator},
 * {@link Authorizer}, and {@link SessionManager} interfaces, thereby consolidating
 * these behaviors into a single point of reference.  For most Shiro usages, this simplifies configuration and
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/SecurityManager.java`
#### Snippet
```java
 * <p/>
 * In addition to the above three interfaces, this interface provides a number of methods supporting
 * {@link Subject} behavior. A {@link org.apache.shiro.subject.Subject Subject} executes
 * authentication, authorization, and session operations for a <em>single</em> user, and as such can only be
 * managed by {@code A SecurityManager} which is aware of all three functions.  The three parent interfaces on the
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.mgt` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/SecurityManager.java`
#### Snippet
```java
 * Framework developers on the other hand might find working with an actual SecurityManager useful.
 *
 * @see org.apache.shiro.mgt.DefaultSecurityManager
 * @since 0.2
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.aop` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/aop/AnnotationMethodInterceptor.java`
#### Snippet
```java
     * The default implementation acquires the annotation using an annotation
     * {@link #getResolver resolver} using the internal annotation {@link #getHandler handler}'s
     * {@link org.apache.shiro.aop.AnnotationHandler#getAnnotationClass() annotationClass}.
     *
     * @param mi the MethodInvocation wrapping the Method from which the Annotation will be acquired.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/SessionStorageEvaluator.java`
#### Snippet
```java
    /**
     * Returns {@code true} if the specified {@code Subject}'s
     * {@link org.apache.shiro.subject.Subject#getSession() session} may be used to persist that Subject's
     * state, {@code false} otherwise.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/SessionStorageEvaluator.java`
#### Snippet
```java
     * @param subject the {@code Subject} for which session state persistence may be enabled
     * @return {@code true} if the specified {@code Subject}'s
     *         {@link org.apache.shiro.subject.Subject#getSession() session} may be used to persist that Subject's
     *         state, {@code false} otherwise.
     * @see Subject#getSession()
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/SessionsSecurityManager.java`
#### Snippet
```java
/**
 * Shiro support of a {@link SecurityManager} class hierarchy that delegates all
 * {@link org.apache.shiro.session.Session session} operations to a wrapped
 * {@link org.apache.shiro.session.mgt.SessionManager SessionManager} instance.  That is, this class implements the
 * methods in the {@link SessionManager SessionManager} interface, but in reality, those methods are merely
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session.mgt` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/SessionsSecurityManager.java`
#### Snippet
```java
 * Shiro support of a {@link SecurityManager} class hierarchy that delegates all
 * {@link org.apache.shiro.session.Session session} operations to a wrapped
 * {@link org.apache.shiro.session.mgt.SessionManager SessionManager} instance.  That is, this class implements the
 * methods in the {@link SessionManager SessionManager} interface, but in reality, those methods are merely
 * passthrough calls to the underlying 'real' {@code SessionManager} instance.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session.mgt` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/SessionsSecurityManager.java`
#### Snippet
```java
     *
     * @return this security manager's internal delegate {@link SessionManager SessionManager}.
     * @see #setSessionManager(org.apache.shiro.session.mgt.SessionManager) setSessionManager
     */
    public SessionManager getSessionManager() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.mgt` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/SessionsSecurityManager.java`
#### Snippet
```java

    /**
     * Calls {@link org.apache.shiro.mgt.AuthorizingSecurityManager#afterCacheManagerSet() super.afterCacheManagerSet()} and then immediately calls
     * {@link #applyCacheManagerToSessionManager() applyCacheManagerToSessionManager()} to ensure the
     * <code>CacheManager</code> is applied to the SessionManager as necessary.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/DefaultSessionStorageEvaluator.java`
#### Snippet
```java
/**
 * A Default {@code SessionStorageEvaluator} that provides reasonable control over if and how Sessions may be used for
 * storing Subject state.  See the {@link #isSessionStorageEnabled(org.apache.shiro.subject.Subject)}
 * method for exact behavior.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/DefaultSubjectFactory.java`
#### Snippet
```java

    /**
     * @deprecated since 1.2 - override {@link #createSubject(org.apache.shiro.subject.SubjectContext)} directly if you
     *             need to instantiate a custom {@link Subject} class.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject.support` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/DefaultSubjectFactory.java`
#### Snippet
```java

/**
 * Default {@link SubjectFactory SubjectFactory} implementation that creates {@link org.apache.shiro.subject.support.DelegatingSubject DelegatingSubject}
 * instances.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.cache` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/CachingSecurityManager.java`
#### Snippet
```java
    /**
     * Template callback to notify subclasses that a
     * {@link org.apache.shiro.cache.CacheManager CacheManager} has been set and is available for use via the
     * {@link #getCacheManager getCacheManager()} method.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/DefaultSubjectDAO.java`
#### Snippet
```java

    /**
     * Saves the subject's state to the subject's {@link org.apache.shiro.subject.Subject#getSession() session} only
     * if {@link #isSessionStorageEnabled(Subject) sessionStorageEnabled(subject)}.  If session storage is not enabled
     * for the specific {@code Subject}, this method does nothing.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/DefaultSubjectDAO.java`
#### Snippet
```java

    /**
     * Merges the Subject's current {@link org.apache.shiro.subject.Subject#getPrincipals()} with whatever may be in
     * any available session.  Only updates the Subject's session if the session does not match the current principals
     * state.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/DefaultSubjectDAO.java`
#### Snippet
```java
 * Subject state by default.
 *
 * @see #isSessionStorageEnabled(org.apache.shiro.subject.Subject)
 * @see SessionStorageEvaluator
 * @see DefaultSessionStorageEvaluator
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/DefaultSubjectDAO.java`
#### Snippet
```java
    /**
     * Saves the subject's state (it's principals and authentication state) to its
     * {@link org.apache.shiro.subject.Subject#getSession() session}.  The session can be retrieved at a later time
     * (typically from a {@link org.apache.shiro.session.mgt.SessionManager SessionManager} to be used to recreate
     * the {@code Subject} instance.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/AuthenticatingSecurityManager.java`
#### Snippet
```java

    /**
     * Delegates to the wrapped {@link org.apache.shiro.authc.Authenticator Authenticator} for authentication.
     */
    public AuthenticationInfo authenticate(AuthenticationToken token) throws AuthenticationException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc.pam` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/AuthenticatingSecurityManager.java`
#### Snippet
```java
     * Default no-arg constructor that initializes its internal
     * <code>authenticator</code> instance to a
     * {@link org.apache.shiro.authc.pam.ModularRealmAuthenticator ModularRealmAuthenticator}.
     */
    public AuthenticatingSecurityManager() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc.pam` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/AuthenticatingSecurityManager.java`
#### Snippet
```java
     * Sets the delegate <code>Authenticator</code> instance that this SecurityManager uses to perform all
     * authentication operations.  Unless overridden by this method, the default instance is a
     * {@link org.apache.shiro.authc.pam.ModularRealmAuthenticator ModularRealmAuthenticator}.
     *
     * @param authenticator the delegate <code>Authenticator</code> instance that this SecurityManager will use to
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/AuthenticatingSecurityManager.java`
#### Snippet
```java
     * Returns the delegate <code>Authenticator</code> instance that this SecurityManager uses to perform all
     * authentication operations.  Unless overridden by the
     * {@link #setAuthenticator(org.apache.shiro.authc.Authenticator) setAuthenticator}, the default instance is a
     * {@link org.apache.shiro.authc.pam.ModularRealmAuthenticator ModularRealmAuthenticator}.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc.pam` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/AuthenticatingSecurityManager.java`
#### Snippet
```java
     * authentication operations.  Unless overridden by the
     * {@link #setAuthenticator(org.apache.shiro.authc.Authenticator) setAuthenticator}, the default instance is a
     * {@link org.apache.shiro.authc.pam.ModularRealmAuthenticator ModularRealmAuthenticator}.
     *
     * @return the delegate <code>Authenticator</code> instance that this SecurityManager uses to perform all
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.realm` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/RealmSecurityManager.java`
#### Snippet
```java
/**
 * Shiro support of a {@link SecurityManager} class hierarchy based around a collection of
 * {@link org.apache.shiro.realm.Realm}s.  All actual {@code SecurityManager} method implementations are left to
 * subclasses.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.cache` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/RealmSecurityManager.java`
#### Snippet
```java
    /**
     * Sets the internal {@link #getCacheManager CacheManager} on any internal configured
     * {@link #getRealms Realms} that implement the {@link org.apache.shiro.cache.CacheManagerAware CacheManagerAware} interface.
     * <p/>
     * This method is called after setting a cacheManager on this securityManager via the
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.cache` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/RealmSecurityManager.java`
#### Snippet
```java
     * <p/>
     * This method is called after setting a cacheManager on this securityManager via the
     * {@link #setCacheManager(org.apache.shiro.cache.CacheManager) setCacheManager} method to allow it to be propagated
     * down to all the internal Realms that would need to use it.
     * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.cache` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/RealmSecurityManager.java`
#### Snippet
```java
    /**
     * Simply calls {@link #applyCacheManagerToRealms() applyCacheManagerToRealms()} to allow the
     * newly set {@link org.apache.shiro.cache.CacheManager CacheManager} to be propagated to the internal collection of <code>Realm</code>
     * that would need to use it.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.event` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/RealmSecurityManager.java`
#### Snippet
```java
     * <p/>
     * This method is called after setting an eventBus on this securityManager via the
     * {@link #setEventBus(org.apache.shiro.event.EventBus) setEventBus} method to allow it to be propagated
     * down to all the internal Realms that would need to use it.
     * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.naming` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/jndi/JndiLocator.java`
#### Snippet
```java
     * @param jndiName the JNDI name to look up
     * @return the obtained object
     * @throws javax.naming.NamingException if the JNDI lookup failed
     * @see #setResourceRef
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/DefaultSecurityManager.java`
#### Snippet
```java
     * Unbinds or removes the Subject's state from the application, typically called during {@link #logout}.
     * <p/>
     * This has been deprecated in Shiro 1.2 in favor of the {@link #delete(org.apache.shiro.subject.Subject) delete}
     * method.  The implementation has been updated to invoke that method.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/DefaultSecurityManager.java`
#### Snippet
```java
     *
     * @param subject the subject to unbind from the application as it will no longer be used.
     * @deprecated in Shiro 1.2 in favor of {@link #delete(org.apache.shiro.subject.Subject)}
     */
    @Deprecated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/DefaultSecurityManager.java`
#### Snippet
```java
     * <p/>
     * This implementation merely delegates to the internal {@link #setSubjectDAO(SubjectDAO) subjectDAO} and calls
     * {@link SubjectDAO#save(org.apache.shiro.subject.Subject) subjectDAO.save(subject)}.
     *
     * @param subject the subject for which state will potentially be persisted
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/DefaultSecurityManager.java`
#### Snippet
```java
     *
     * @param subject the subject for which state will potentially be persisted
     * @see SubjectDAO#save(org.apache.shiro.subject.Subject)
     * @since 1.2
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/DefaultSecurityManager.java`
#### Snippet
```java
     * <li>Ensures the {@code SubjectContext} is as populated as it can be, using heuristics to acquire
     * data that may not have already been available to it (such as a referenced session or remembered principals).</li>
     * <li>Calls {@link #doCreateSubject(org.apache.shiro.subject.SubjectContext)} to actually perform the
     * {@code Subject} instance creation.</li>
     * <li>calls {@link #save(org.apache.shiro.subject.Subject) save(subject)} to ensure the constructed
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/DefaultSecurityManager.java`
#### Snippet
```java
     * <li>Calls {@link #doCreateSubject(org.apache.shiro.subject.SubjectContext)} to actually perform the
     * {@code Subject} instance creation.</li>
     * <li>calls {@link #save(org.apache.shiro.subject.Subject) save(subject)} to ensure the constructed
     * {@code Subject}'s state is accessible for future requests/invocations if necessary.</li>
     * <li>returns the constructed {@code Subject} instance.</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/DefaultSecurityManager.java`
#### Snippet
```java
     * @param subjectContext any data needed to direct how the Subject should be constructed.
     * @return the {@code Subject} instance reflecting the specified contextual data.
     * @see #ensureSecurityManager(org.apache.shiro.subject.SubjectContext)
     * @see #resolveSession(org.apache.shiro.subject.SubjectContext)
     * @see #resolvePrincipals(org.apache.shiro.subject.SubjectContext)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/DefaultSecurityManager.java`
#### Snippet
```java
     * @return the {@code Subject} instance reflecting the specified contextual data.
     * @see #ensureSecurityManager(org.apache.shiro.subject.SubjectContext)
     * @see #resolveSession(org.apache.shiro.subject.SubjectContext)
     * @see #resolvePrincipals(org.apache.shiro.subject.SubjectContext)
     * @see #doCreateSubject(org.apache.shiro.subject.SubjectContext)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/DefaultSecurityManager.java`
#### Snippet
```java
     * @see #ensureSecurityManager(org.apache.shiro.subject.SubjectContext)
     * @see #resolveSession(org.apache.shiro.subject.SubjectContext)
     * @see #resolvePrincipals(org.apache.shiro.subject.SubjectContext)
     * @see #doCreateSubject(org.apache.shiro.subject.SubjectContext)
     * @see #save(org.apache.shiro.subject.Subject)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/DefaultSecurityManager.java`
#### Snippet
```java
     * @see #resolveSession(org.apache.shiro.subject.SubjectContext)
     * @see #resolvePrincipals(org.apache.shiro.subject.SubjectContext)
     * @see #doCreateSubject(org.apache.shiro.subject.SubjectContext)
     * @see #save(org.apache.shiro.subject.Subject)
     * @since 1.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/DefaultSecurityManager.java`
#### Snippet
```java
     * @see #resolvePrincipals(org.apache.shiro.subject.SubjectContext)
     * @see #doCreateSubject(org.apache.shiro.subject.SubjectContext)
     * @see #save(org.apache.shiro.subject.Subject)
     * @since 1.0
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/DefaultSecurityManager.java`
#### Snippet
```java
     * <p/>
     * This implementation merely delegates to the internal {@link #setSubjectDAO(SubjectDAO) subjectDAO} and calls
     * {@link SubjectDAO#delete(org.apache.shiro.subject.Subject) delete(subject)}.
     *
     * @param subject the subject for which state will be removed
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/DefaultSecurityManager.java`
#### Snippet
```java
     *
     * @param subject the subject for which state will be removed
     * @see SubjectDAO#delete(org.apache.shiro.subject.Subject)
     * @since 1.2
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.realm` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/DefaultSecurityManager.java`
#### Snippet
```java
/**
 * The Shiro framework's default concrete implementation of the {@link SecurityManager} interface,
 * based around a collection of {@link org.apache.shiro.realm.Realm}s.  This implementation delegates its
 * authentication, authorization, and session operations to wrapped {@link Authenticator}, {@link Authorizer}, and
 * {@link org.apache.shiro.session.mgt.SessionManager SessionManager} instances respectively via superclass
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/DefaultSecurityManager.java`
#### Snippet
```java
     * @return a {@code Subject} instance reflecting the data in the specified {@code SubjectContext} data map.
     * @see #getSubjectFactory()
     * @see SubjectFactory#createSubject(org.apache.shiro.subject.SubjectContext)
     * @since 1.2
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/DefaultSecurityManager.java`
#### Snippet
```java
     * Binds a {@code Subject} instance created after authentication to the application for later use.
     * <p/>
     * As of Shiro 1.2, this method has been deprecated in favor of {@link #save(org.apache.shiro.subject.Subject)},
     * which this implementation now calls.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/DefaultSecurityManager.java`
#### Snippet
```java
     * @param subject the {@code Subject} instance created after authentication to be bound to the application
     *                for later use.
     * @see #save(org.apache.shiro.subject.Subject)
     * @deprecated in favor of {@link #save(org.apache.shiro.subject.Subject) save(subject)}.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/DefaultSecurityManager.java`
#### Snippet
```java
     *                for later use.
     * @see #save(org.apache.shiro.subject.Subject)
     * @deprecated in favor of {@link #save(org.apache.shiro.subject.Subject) save(subject)}.
     */
    @Deprecated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/AbstractRememberMeManager.java`
#### Snippet
```java
    /**
     * Reacts to a subject logging out of the application and immediately
     * {@link #forgetIdentity(org.apache.shiro.subject.Subject) forgets} any previously stored identity and returns.
     *
     * @param subject the subject logging out.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/AbstractRememberMeManager.java`
#### Snippet
```java
     * {@link #getIdentityToRemember resolves} the exact
     * {@link PrincipalCollection principals} to remember.  It then remembers the principals by calling
     * {@link #rememberIdentity(org.apache.shiro.subject.Subject, org.apache.shiro.subject.PrincipalCollection)}.
     * <p/>
     * This implementation ignores the {@link AuthenticationToken} argument, but it is available to subclasses if
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/AbstractRememberMeManager.java`
#### Snippet
```java
     * {@link #getIdentityToRemember resolves} the exact
     * {@link PrincipalCollection principals} to remember.  It then remembers the principals by calling
     * {@link #rememberIdentity(org.apache.shiro.subject.Subject, org.apache.shiro.subject.PrincipalCollection)}.
     * <p/>
     * This implementation ignores the {@link AuthenticationToken} argument, but it is available to subclasses if
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.lang.io` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/AbstractRememberMeManager.java`
#### Snippet
```java
     * <p/>
     * Unless overridden by the {@link #setSerializer} method, the default instance is a
     * {@link org.apache.shiro.lang.io.DefaultSerializer}.
     *
     * @return the {@code Serializer} used to serialize and deserialize {@link PrincipalCollection} instances for
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/AbstractRememberMeManager.java`
#### Snippet
```java
     * Converts the given principal collection the byte array that will be persisted to be 'remembered' later.
     * <p/>
     * This implementation first {@link #serialize(org.apache.shiro.subject.PrincipalCollection) serializes} the
     * principals to a byte array and then {@link #encrypt(byte[]) encrypts} that byte array.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/AbstractRememberMeManager.java`
#### Snippet
```java
     * <li>The token is not {@code null} and</li>
     * <li>The token is an {@code instanceof} {@link RememberMeAuthenticationToken} and</li>
     * <li>{@code token}.{@link org.apache.shiro.authc.RememberMeAuthenticationToken#isRememberMe() isRememberMe()} is
     * {@code true}</li>
     * </ol>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/AbstractRememberMeManager.java`
#### Snippet
```java

    /**
     * Reacts to a failed login by immediately {@link #forgetIdentity(org.apache.shiro.subject.Subject) forgetting} any
     * previously remembered identity.  This is an additional security feature to prevent any remnant identity data
     * from being retained in case the authentication attempt is not being executed by the expected user.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/AbstractRememberMeManager.java`
#### Snippet
```java
    /**
     * Remembers the specified account principals by first
     * {@link #convertPrincipalsToBytes(org.apache.shiro.subject.PrincipalCollection) converting} them to a byte
     * array and then {@link #rememberSerializedIdentity(org.apache.shiro.subject.Subject, byte[]) remembers} that
     * byte array.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/AbstractRememberMeManager.java`
#### Snippet
```java
     * Remembers the specified account principals by first
     * {@link #convertPrincipalsToBytes(org.apache.shiro.subject.PrincipalCollection) converting} them to a byte
     * array and then {@link #rememberSerializedIdentity(org.apache.shiro.subject.Subject, byte[]) remembers} that
     * byte array.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/AbstractRememberMeManager.java`
#### Snippet
```java

    /**
     * Returns {@code info}.{@link org.apache.shiro.authc.AuthenticationInfo#getPrincipals() getPrincipals()} and
     * ignores the {@link Subject} argument.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/AbstractRememberMeManager.java`
#### Snippet
```java
     * Reacts to the successful login attempt by first always {@link #forgetIdentity(Subject) forgetting} any previously
     * stored identity.  Then if the {@code token}
     * {@link #isRememberMe(org.apache.shiro.authc.AuthenticationToken) is a RememberMe} token, the associated identity
     * will be {@link #rememberIdentity(org.apache.shiro.subject.Subject, org.apache.shiro.authc.AuthenticationToken, org.apache.shiro.authc.AuthenticationInfo) remembered}
     * for later retrieval during a new user session.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/AbstractRememberMeManager.java`
#### Snippet
```java
     * stored identity.  Then if the {@code token}
     * {@link #isRememberMe(org.apache.shiro.authc.AuthenticationToken) is a RememberMe} token, the associated identity
     * will be {@link #rememberIdentity(org.apache.shiro.subject.Subject, org.apache.shiro.authc.AuthenticationToken, org.apache.shiro.authc.AuthenticationInfo) remembered}
     * for later retrieval during a new user session.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/AbstractRememberMeManager.java`
#### Snippet
```java
     * stored identity.  Then if the {@code token}
     * {@link #isRememberMe(org.apache.shiro.authc.AuthenticationToken) is a RememberMe} token, the associated identity
     * will be {@link #rememberIdentity(org.apache.shiro.subject.Subject, org.apache.shiro.authc.AuthenticationToken, org.apache.shiro.authc.AuthenticationInfo) remembered}
     * for later retrieval during a new user session.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/AbstractRememberMeManager.java`
#### Snippet
```java
     * stored identity.  Then if the {@code token}
     * {@link #isRememberMe(org.apache.shiro.authc.AuthenticationToken) is a RememberMe} token, the associated identity
     * will be {@link #rememberIdentity(org.apache.shiro.subject.Subject, org.apache.shiro.authc.AuthenticationToken, org.apache.shiro.authc.AuthenticationInfo) remembered}
     * for later retrieval during a new user session.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/AuthorizingSecurityManager.java`
#### Snippet
```java
    /**
     * Default no-arg constructor that initializes an internal default
     * {@link org.apache.shiro.authz.ModularRealmAuthorizer ModularRealmAuthorizer}.
     */
    public AuthorizingSecurityManager() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/mgt/AuthorizingSecurityManager.java`
#### Snippet
```java
     * <p/>
     * The setting of realms the Authorizer will only occur if it is an instance of
     * {@link org.apache.shiro.authz.ModularRealmAuthorizer ModularRealmAuthorizer}, that is:
     * <pre>
     * if ( this.authorizer instanceof ModularRealmAuthorizer ) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/util/ThreadContext.java`
#### Snippet
```java
 * current thread based on key/value pairs.
 * <p/>
 * <p>An internal {@link java.util.HashMap} is used to maintain the key/value pairs
 * for each thread.</p>
 * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/AbstractAuthenticator.java`
#### Snippet
```java
    /**
     * This implementation merely calls
     * {@link #notifyLogout(org.apache.shiro.subject.PrincipalCollection) notifyLogout} to allow any registered listeners
     * to react to the logout.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/AbstractAuthenticator.java`
#### Snippet
```java
     * {@code Subject} has logged-out.  This implementation merely
     * iterates over the internal {@code listeners} collection and calls
     * {@link AuthenticationListener#onLogout(org.apache.shiro.subject.PrincipalCollection) onLogout}
     * for each.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/BearerToken.java`
#### Snippet
```java
/**
 * A {@link AuthenticationToken} that contains an a Bearer token or API key, typically received via an HTTP {@code Authorization} header. This
 * class also implements the {@link org.apache.shiro.authc.HostAuthenticationToken HostAuthenticationToken} interface to retain the host name
 * or IP address location from where the authentication attempt is occurring.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/UsernamePasswordToken.java`
#### Snippet
```java
 * class also implements the {@link RememberMeAuthenticationToken RememberMeAuthenticationToken} interface to support
 * &quot;Remember Me&quot; services across user sessions as well as the
 * {@link org.apache.shiro.authc.HostAuthenticationToken HostAuthenticationToken} interface to retain the host name
 * or IP address location from where the authentication attempt is occurring.</p>
 * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/UsernamePasswordToken.java`
#### Snippet
```java
     *
     * @return the {@link #getUsername() username}.
     * @see org.apache.shiro.authc.AuthenticationToken#getPrincipal()
     */
    public Object getPrincipal() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/UsernamePasswordToken.java`
#### Snippet
```java
     *
     * @return the {@link #getPassword() password} char array.
     * @see org.apache.shiro.authc.AuthenticationToken#getCredentials()
     */
    public Object getCredentials() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.realm` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/pam/AllSuccessfulStrategy.java`
#### Snippet
```java
    /**
     * Because all realms in this strategy must complete successfully, this implementation ensures that the given
     * <code>Realm</code> {@link org.apache.shiro.realm.Realm#supports(org.apache.shiro.authc.AuthenticationToken) supports} the given
     * <code>token</code> argument.  If it does not, this method throws an
     * {@link UnsupportedTokenException UnsupportedTokenException} to end the authentication
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/pam/AllSuccessfulStrategy.java`
#### Snippet
```java
    /**
     * Because all realms in this strategy must complete successfully, this implementation ensures that the given
     * <code>Realm</code> {@link org.apache.shiro.realm.Realm#supports(org.apache.shiro.authc.AuthenticationToken) supports} the given
     * <code>token</code> argument.  If it does not, this method throws an
     * {@link UnsupportedTokenException UnsupportedTokenException} to end the authentication
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc.pam` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/pam/ShortCircuitIterationException.java`
#### Snippet
```java
/**
 * Exception thrown during the authentication process using
 * {@link org.apache.shiro.authc.pam.FirstSuccessfulStrategy}, with 
 * <code>stopAfterFirstSuccess</code> set.  
 * This is a signal to short circuit the authentication from proceeding 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc.pam` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/pam/ShortCircuitIterationException.java`
#### Snippet
```java
 * after a first successful authentication.
 *
 * @see org.apache.shiro.authc.pam.AuthenticationStrategy
 * @see org.apache.shiro.authc.pam.FirstSuccessfulStrategy
 * @since 1.4.1
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc.pam` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/pam/ShortCircuitIterationException.java`
#### Snippet
```java
 *
 * @see org.apache.shiro.authc.pam.AuthenticationStrategy
 * @see org.apache.shiro.authc.pam.FirstSuccessfulStrategy
 * @since 1.4.1
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/pam/AtLeastOneSuccessfulStrategy.java`
#### Snippet
```java
    /**
     * Ensures that the <code>aggregate</code> method argument is not <code>null</code> and
     * <code>aggregate.{@link org.apache.shiro.authc.AuthenticationInfo#getPrincipals() getPrincipals()}</code>
     * is not <code>null</code>, and if either is <code>null</code>, throws an AuthenticationException to indicate
     * that none of the realms authenticated successfully.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc.pam` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/pam/UnsupportedTokenException.java`
#### Snippet
```java
 * supported by one or more configured {@link org.apache.shiro.realm.Realm Realm}s.
 *
 * @see org.apache.shiro.authc.pam.AuthenticationStrategy
 * @since 0.2
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/pam/AuthenticationStrategy.java`
#### Snippet
```java
     * @return the AuthenticationInfo object that will be presented to further realms in the authentication process - returning
     *         the {@code aggregate} method argument is the normal case if no special action needs to be taken.
     * @throws org.apache.shiro.authc.AuthenticationException
     *          an exception thrown by the Strategy implementation if it wishes the login
     *          process for the associated subject (user) to stop immediately.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/pam/AbstractAuthenticationStrategy.java`
#### Snippet
```java
     * <p/>
     * This implementation merely checks to see if the specified <code>aggregate</code> argument is an instance of
     * {@link org.apache.shiro.authc.MergableAuthenticationInfo MergableAuthenticationInfo}, and if so, calls
     * <code>aggregate.merge(info)</code>  If it is <em>not</em> an instance of
     * <code>MergableAuthenticationInfo</code>, an {@link IllegalArgumentException IllegalArgumentException} is thrown.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/pam/AbstractAuthenticationStrategy.java`
#### Snippet
```java
     * <code>MergableAuthenticationInfo</code>, an {@link IllegalArgumentException IllegalArgumentException} is thrown.
     * Can be overridden by subclasses for custom merging behavior if implementing the
     * {@link org.apache.shiro.authc.MergableAuthenticationInfo MergableAuthenticationInfo} is not desired for some reason.
     */
    protected AuthenticationInfo merge(AuthenticationInfo info, AuthenticationInfo aggregate) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/pam/AbstractAuthenticationStrategy.java`
#### Snippet
```java

    /**
     * Simply returns <code>new {@link org.apache.shiro.authc.SimpleAuthenticationInfo SimpleAuthenticationInfo}();</code>, which supports
     * aggregating account data across realms.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/SimpleAuthenticationInfo.java`
#### Snippet
```java

/**
 * Simple implementation of the {@link org.apache.shiro.authc.MergableAuthenticationInfo} interface that holds the principals and
 * credentials.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/credential/SimpleCredentialsMatcher.java`
#### Snippet
```java
     * (via {@link #getCredentials(AuthenticationToken) getCredentials(token)})
     * and then the {@code account}'s credentials
     * (via {@link #getCredentials(org.apache.shiro.authc.AuthenticationInfo) getCredentials(account)}) and then passes both of
     * them to the {@link #equals(Object,Object) equals(tokenCredentials, accountCredentials)} method for equality
     * comparison.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc.credential` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/credential/SimpleCredentialsMatcher.java`
#### Snippet
```java
 * <p/>
 * <p>Hashing comparisons (the most common technique used in secure applications) are not supported by this class, but
 * instead by the {@link org.apache.shiro.authc.credential.HashedCredentialsMatcher HashedCredentialsMatcher}.
 *
 * @see org.apache.shiro.authc.credential.HashedCredentialsMatcher
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc.credential` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/credential/SimpleCredentialsMatcher.java`
#### Snippet
```java
 * instead by the {@link org.apache.shiro.authc.credential.HashedCredentialsMatcher HashedCredentialsMatcher}.
 *
 * @see org.apache.shiro.authc.credential.HashedCredentialsMatcher
 * @since 0.9
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/credential/HashedCredentialsMatcher.java`
#### Snippet
```java
     * @deprecated since Shiro 1.1.  Hash salting is now expected to be based on if the {@link AuthenticationInfo}
     *             returned from the {@code Realm} is a {@link SaltedAuthenticationInfo} instance and its
     *             {@link org.apache.shiro.authc.SaltedAuthenticationInfo#getCredentialsSalt() getCredentialsSalt()} method returns a non-null value.
     *             This method and the 1.0 behavior still exists for backwards compatibility if the {@code Realm} does not return
     *             {@code SaltedAuthenticationInfo} instances, but <b>it is highly recommended that {@code Realm} implementations
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.crypto.hash` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/credential/HashedCredentialsMatcher.java`
#### Snippet
```java
     * Creates an instance using the specified {@link #getHashAlgorithmName() hashAlgorithmName} to hash submitted
     * credentials.
     * @param hashAlgorithmName the {@code Hash} {@link org.apache.shiro.crypto.hash.Hash#getAlgorithmName() algorithmName}
     *                          to use when performing hashes for credentials matching.
     * @since 1.1
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/credential/HashedCredentialsMatcher.java`
#### Snippet
```java
    /**
     * Returns a new, <em>uninitialized</em> instance, without its byte array set.  Used as a utility method in the
     * {@link SimpleCredentialsMatcher#getCredentials(org.apache.shiro.authc.AuthenticationInfo) getCredentials(AuthenticationInfo)} implementation.
     *
     * @return a new, <em>uninitialized</em> instance, without its byte array set.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.crypto.hash` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/credential/HashedCredentialsMatcher.java`
#### Snippet
```java

    /**
     * Returns the {@code Hash} {@link org.apache.shiro.crypto.hash.Hash#getAlgorithmName() algorithmName} to use
     * when performing hashes for credentials matching.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.crypto.hash` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/credential/HashedCredentialsMatcher.java`
#### Snippet
```java
     * when performing hashes for credentials matching.
     *
     * @return the {@code Hash} {@link org.apache.shiro.crypto.hash.Hash#getAlgorithmName() algorithmName} to use
     *         when performing hashes for credentials matching.
     * @since 1.1
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/credential/HashedCredentialsMatcher.java`
#### Snippet
```java
     * This implementation first hashes the {@code token}'s credentials, potentially using a
     * {@code salt} if the {@code info} argument is a
     * {@link org.apache.shiro.authc.SaltedAuthenticationInfo SaltedAuthenticationInfo}.  It then compares the hash
     * against the {@code AuthenticationInfo}'s
     * {@link #getCredentials(org.apache.shiro.authc.AuthenticationInfo) already-hashed credentials}.  This method
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/credential/HashedCredentialsMatcher.java`
#### Snippet
```java
     * {@link org.apache.shiro.authc.SaltedAuthenticationInfo SaltedAuthenticationInfo}.  It then compares the hash
     * against the {@code AuthenticationInfo}'s
     * {@link #getCredentials(org.apache.shiro.authc.AuthenticationInfo) already-hashed credentials}.  This method
     * returns {@code true} if those two values are {@link #equals(Object, Object) equal}, {@code false} otherwise.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/credential/HashedCredentialsMatcher.java`
#### Snippet
```java
     * @deprecated since Shiro 1.1.  Hash salting is now expected to be based on if the {@link AuthenticationInfo}
     *             returned from the {@code Realm} is a {@link SaltedAuthenticationInfo} instance and its
     *             {@link org.apache.shiro.authc.SaltedAuthenticationInfo#getCredentialsSalt() getCredentialsSalt()} method returns a non-null value.
     *             This method and the 1.0 behavior still exists for backwards compatibility if the {@code Realm} does not return
     *             {@code SaltedAuthenticationInfo} instances, but <b>it is highly recommended that {@code Realm} implementations
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/credential/HashedCredentialsMatcher.java`
#### Snippet
```java
     * Sets whether or not to salt a submitted {@code AuthenticationToken}'s credentials when hashing.
     * <p/>
     * If enabled, the salt used will be obtained via the {@link #getSalt(org.apache.shiro.authc.AuthenticationToken) getCredentialsSalt} method.
     * </p>
     * The default value is {@code false}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/credential/HashedCredentialsMatcher.java`
#### Snippet
```java
     * @deprecated since Shiro 1.1.  Hash salting is now expected to be based on if the {@link AuthenticationInfo}
     *             returned from the {@code Realm} is a {@link SaltedAuthenticationInfo} instance and its
     *             {@link org.apache.shiro.authc.SaltedAuthenticationInfo#getCredentialsSalt() getCredentialsSalt()} method returns a non-null value.
     *             This method and the 1.0 behavior still exists for backwards compatibility if the {@code Realm} does not return
     *             {@code SaltedAuthenticationInfo} instances, but <b>it is highly recommended that {@code Realm} implementations
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/credential/HashedCredentialsMatcher.java`
#### Snippet
```java
 * Prior to Shiro 1.1, salts could be obtained based on the end-user submitted
 * {@link AuthenticationToken AuthenticationToken} via the now-deprecated
 * {@link #getSalt(org.apache.shiro.authc.AuthenticationToken) getSalt(AuthenticationToken)} method.  This however
 * could constitute a security hole since ideally salts should never be obtained based on what a user can submit.
 * User-submitted salt mechanisms are <em>much</em> more susceptible to dictionary attacks and <b>SHOULD NOT</b> be
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/credential/HashedCredentialsMatcher.java`
#### Snippet
```java
 * To enable this, {@code Realm}s should return {@link SaltedAuthenticationInfo SaltedAuthenticationInfo} instances
 * during authentication.  {@code HashedCredentialsMatcher} implementations will then use the provided
 * {@link org.apache.shiro.authc.SaltedAuthenticationInfo#getCredentialsSalt credentialsSalt} for hashing.  To avoid
 * security risks,
 * <b>it is highly recommended that any existing {@code Realm} implementations that support hashed credentials are
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.crypto.hash` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/credential/HashedCredentialsMatcher.java`
#### Snippet
```java

    /**
     * Sets the {@code Hash} {@link org.apache.shiro.crypto.hash.Hash#getAlgorithmName() algorithmName} to use
     * when performing hashes for credentials matching.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.crypto.hash` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/credential/HashedCredentialsMatcher.java`
#### Snippet
```java
     * when performing hashes for credentials matching.
     *
     * @param hashAlgorithmName the {@code Hash} {@link org.apache.shiro.crypto.hash.Hash#getAlgorithmName() algorithmName}
     *                          to use when performing hashes for credentials matching.
     * @since 1.1
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/pam/ModularRealmAuthenticator.java`
#### Snippet
```java
    /**
     * Attempts to authenticate the given token by iterating over the internal collection of
     * {@link Realm}s.  For each realm, first the {@link Realm#supports(org.apache.shiro.authc.AuthenticationToken)}
     * method will be called to determine if the realm supports the {@code authenticationToken} method argument.
     * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/pam/ModularRealmAuthenticator.java`
#### Snippet
```java
     * <p/>
     * If a realm does support
     * the token, its {@link Realm#getAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken)}
     * method will be called.  If the realm returns a non-null account, the token will be
     * considered authenticated for that realm and the account data recorded.  If the realm returns {@code null},
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc.pam` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/pam/ModularRealmAuthenticator.java`
#### Snippet
```java
     * Unless overridden by
     * the {@link #setAuthenticationStrategy(AuthenticationStrategy)} method, the default implementation
     * is the {@link org.apache.shiro.authc.pam.AtLeastOneSuccessfulStrategy}.
     *
     * @return the {@code AuthenticationStrategy} utilized by this modular authenticator during a log-in attempt.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/pam/ModularRealmAuthenticator.java`
#### Snippet
```java
 * If only one realm is configured (this is often the case for most applications), authentication success is naturally
 * only dependent upon invoking this one Realm's
 * {@link Realm#getAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken)} method.
 * <p/>
 * But if two or more realms are configured, PAM behavior is implemented by iterating over the collection of realms
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc.pam` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/pam/ModularRealmAuthenticator.java`
#### Snippet
```java
     * Default no-argument constructor which
     * {@link #setAuthenticationStrategy(AuthenticationStrategy) enables}  an
     * {@link org.apache.shiro.authc.pam.AtLeastOneSuccessfulStrategy} by default.
     */
    public ModularRealmAuthenticator() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc.pam` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/pam/ModularRealmAuthenticator.java`
#### Snippet
```java
    /**
     * The authentication strategy to use during authentication attempts, defaults to a
     * {@link org.apache.shiro.authc.pam.AtLeastOneSuccessfulStrategy} instance.
     */
    private AuthenticationStrategy authenticationStrategy;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.lang.util` is unnecessary and can be removed
in `config/ogdl/src/main/java/org/apache/shiro/config/ogdl/ReflectionBuilder.java`
#### Snippet
```java
 * <p/>
 * Recognizes {@link Factory} implementations and will call
 * {@link org.apache.shiro.lang.util.Factory#getInstance() getInstance} to satisfy any reference to this bean.
 *
 * @since 0.9
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.web.mgt` is unnecessary and can be removed
in `support/guice/src/main/java/org/apache/shiro/guice/web/ShiroWebModule.java`
#### Snippet
```java
     * Binds the security manager.  Override this method in order to provide your own security manager binding.
     * <p/>
     * By default, a {@link org.apache.shiro.web.mgt.DefaultWebSecurityManager} is bound as an eager singleton.
     *
     * @param bind
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.web.filter` is unnecessary and can be removed
in `support/guice/src/main/java/org/apache/shiro/guice/web/ShiroWebModule.java`
#### Snippet
```java
     * Adds a filter chain to the shiro configuration.
     * <p/>
     * NOTE: If the provided key is for a subclass of {@link org.apache.shiro.web.filter.PathMatchingFilter}, it will be registered with a proper
     * provider.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.web.mgt` is unnecessary and can be removed
in `support/guice/src/main/java/org/apache/shiro/guice/web/ShiroWebModule.java`
#### Snippet
```java
/**
 * Sets up Shiro lifecycles within Guice, enables the injecting of Shiro objects, and binds a default
 * {@link org.apache.shiro.web.mgt.WebSecurityManager}, {@link org.apache.shiro.mgt.SecurityManager} and {@link org.apache.shiro.session.mgt.SessionManager}.  At least one realm must be added by
 * using {@link #bindRealm() bindRealm}.
 * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session.mgt` is unnecessary and can be removed
in `support/guice/src/main/java/org/apache/shiro/guice/web/ShiroWebModule.java`
#### Snippet
```java
/**
 * Sets up Shiro lifecycles within Guice, enables the injecting of Shiro objects, and binds a default
 * {@link org.apache.shiro.web.mgt.WebSecurityManager}, {@link org.apache.shiro.mgt.SecurityManager} and {@link org.apache.shiro.session.mgt.SessionManager}.  At least one realm must be added by
 * using {@link #bindRealm() bindRealm}.
 * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.web.filter.mgt` is unnecessary and can be removed
in `support/guice/src/main/java/org/apache/shiro/guice/web/ShiroWebModule.java`
#### Snippet
```java
 * using {@link #bindRealm() bindRealm}.
 * <p/>
 * Also provides for the configuring of filter chains and binds a {@link org.apache.shiro.web.filter.mgt.FilterChainResolver} with that information.
 */
public abstract class ShiroWebModule extends ShiroModule {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/AuthorizationInfo.java`
#### Snippet
```java
 * <p/>
 * Roles are represented as a <code>Collection</code> of Strings
 * ({@link java.util.Collection Collection}<{@link String String}>), typically each element being the Role name.
 * <p/>
 * {@link Permission Permission}s are provided in two ways:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/Authorizer.java`
#### Snippet
```java

    /**
     * Same as {@link #checkRoles(org.apache.shiro.subject.PrincipalCollection, java.util.Collection)
     * checkRoles(PrincipalCollection subjectPrincipal, Collection&lt;String&gt; roleIdentifiers)} but doesn't require a collection
     * as an argument.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/Authorizer.java`
#### Snippet
```java

    /**
     * Same as {@link #checkRoles(org.apache.shiro.subject.PrincipalCollection, java.util.Collection)
     * checkRoles(PrincipalCollection subjectPrincipal, Collection&lt;String&gt; roleIdentifiers)} but doesn't require a collection
     * as an argument.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/aop/PermissionAnnotationHandler.java`
#### Snippet
```java
     *
     * @param a the RequiresPermission annotation being inspected to check for one or more permissions
     * @throws org.apache.shiro.authz.AuthorizationException
     *          if the calling <code>Subject</code> does not have the permission(s) necessary to
     *          continue access or execution.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz.annotation` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/aop/PermissionAnnotationHandler.java`
#### Snippet
```java

/**
 * Checks to see if a @{@link org.apache.shiro.authz.annotation.RequiresPermissions RequiresPermissions} annotation is
 * declared, and if so, performs a permission check to see if the calling <code>Subject</code> is allowed continued
 * access.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz.annotation` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/aop/PermissionAnnotationHandler.java`
#### Snippet
```java
    /**
     * Default no-argument constructor that ensures this handler looks for
     * {@link org.apache.shiro.authz.annotation.RequiresPermissions RequiresPermissions} annotations.
     */
    public PermissionAnnotationHandler() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz.annotation` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/aop/UserAnnotationHandler.java`
#### Snippet
```java
     * Default no-argument constructor that ensures this handler looks for
     *
     * {@link org.apache.shiro.authz.annotation.RequiresUser RequiresUser} annotations.
     */
    public UserAnnotationHandler() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/aop/UserAnnotationHandler.java`
#### Snippet
```java
     *
     * @param a the RequiresUser annotation to check
     * @throws org.apache.shiro.authz.AuthorizationException
     *         if the calling <code>Subject</code> is not authenticated or remembered via rememberMe services.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz.annotation` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/aop/UserAnnotationHandler.java`
#### Snippet
```java

/**
 * Checks to see if a @{@link org.apache.shiro.authz.annotation.RequiresUser RequiresUser} annotation
 * is declared, and if so, ensures the calling <code>Subject</code> is <em>either</em>
 * {@link org.apache.shiro.subject.Subject#isAuthenticated() authenticated} <b><em>or</em></b> remembered via remember
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/aop/GuestAnnotationHandler.java`
#### Snippet
```java
     *
     * @param a the annotation to check for one or more roles
     * @throws org.apache.shiro.authz.AuthorizationException
     *          if the calling <code>Subject</code> is not a &quot;guest&quot;.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz.annotation` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/aop/GuestAnnotationHandler.java`
#### Snippet
```java
     * Default no-argument constructor that ensures this interceptor looks for
     *
     * {@link org.apache.shiro.authz.annotation.RequiresGuest RequiresGuest} annotations in a method
     * declaration.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz.annotation` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/aop/GuestAnnotationHandler.java`
#### Snippet
```java

/**
 * Checks to see if a @{@link org.apache.shiro.authz.annotation.RequiresGuest RequiresGuest} annotation
 * is declared, and if so, ensures the calling <code>Subject</code> does <em>not</em>
 * have an {@link org.apache.shiro.subject.Subject#getPrincipal() identity} before invoking the method.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/aop/AuthenticatedAnnotationHandler.java`
#### Snippet
```java
    /**
     * Ensures that the calling <code>Subject</code> is authenticated, and if not, throws an
     * {@link org.apache.shiro.authz.UnauthenticatedException UnauthenticatedException} indicating the method is not allowed to be executed.
     *
     * @param a the annotation to inspect
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/aop/AuthenticatedAnnotationHandler.java`
#### Snippet
```java
     *
     * @param a the annotation to inspect
     * @throws org.apache.shiro.authz.UnauthenticatedException if the calling <code>Subject</code> has not yet
     * authenticated.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz.annotation` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/aop/AuthenticatedAnnotationHandler.java`
#### Snippet
```java
    /**
     * Default no-argument constructor that ensures this handler to process
     * {@link org.apache.shiro.authz.annotation.RequiresAuthentication RequiresAuthentication} annotations.
     */
    public AuthenticatedAnnotationHandler() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/aop/RolesAllowedAnnotationHandler.java`
#### Snippet
```java
     *
     * @param a the RolesAllowed annotation to use to check for one or more roles
     * @throws org.apache.shiro.authz.AuthorizationException
     *          if the calling <code>Subject</code> does not have the role necessary to
     *          proceed.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.aop` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/aop/AnnotationsAuthorizingMethodInterceptor.java`
#### Snippet
```java
     * Iterates over the internal {@link #getMethodInterceptors() methodInterceptors} collection, and for each one,
     * ensures that if the interceptor
     * {@link AuthorizingAnnotationMethodInterceptor#supports(org.apache.shiro.aop.MethodInvocation) supports}
     * the invocation, that the interceptor
     * {@link AuthorizingAnnotationMethodInterceptor#assertAuthorized(org.apache.shiro.aop.MethodInvocation) asserts}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.aop` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/aop/AnnotationsAuthorizingMethodInterceptor.java`
#### Snippet
```java
     * {@link AuthorizingAnnotationMethodInterceptor#supports(org.apache.shiro.aop.MethodInvocation) supports}
     * the invocation, that the interceptor
     * {@link AuthorizingAnnotationMethodInterceptor#assertAuthorized(org.apache.shiro.aop.MethodInvocation) asserts}
     * that the invocation is authorized to proceed.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/aop/AnnotationsAuthorizingMethodInterceptor.java`
#### Snippet
```java
     * Returns the method interceptors to execute for the annotated method.
     * <p/>
     * Unless overridden by the {@link #setMethodInterceptors(java.util.Collection)} method, the default collection
     * contains a
     * {@link RoleAnnotationMethodInterceptor RoleAnnotationMethodInterceptor} and a
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/aop/AuthorizingAnnotationHandler.java`
#### Snippet
```java
     *
     * @param a the <code>Annotation</code> to check for performing an authorization check.
     * @throws org.apache.shiro.authz.AuthorizationException if the class/instance/method is not allowed to proceed/execute.
     */
    public abstract void assertAuthorized(Annotation a) throws AuthorizationException;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz.annotation` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/aop/RoleAnnotationHandler.java`
#### Snippet
```java
    /**
     * Default no-argument constructor that ensures this handler looks for
     * {@link org.apache.shiro.authz.annotation.RequiresRoles RequiresRoles} annotations.
     */
    public RoleAnnotationHandler() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/aop/RoleAnnotationHandler.java`
#### Snippet
```java
     *
     * @param a the RequiresRoles annotation to use to check for one or more roles
     * @throws org.apache.shiro.authz.AuthorizationException
     *          if the calling <code>Subject</code> does not have the role(s) necessary to
     *          proceed.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz.annotation` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/aop/RoleAnnotationHandler.java`
#### Snippet
```java

/**
 * Checks to see if a @{@link org.apache.shiro.authz.annotation.RequiresRoles RequiresRoles} annotation is declared, and if so, performs
 * a role check to see if the calling <code>Subject</code> is allowed to proceed.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.aop` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/aop/AuthorizingMethodInterceptor.java`
#### Snippet
```java

    /**
     * Invokes the specified method (<code>methodInvocation.{@link org.apache.shiro.aop.MethodInvocation#proceed proceed}()</code>
     * if authorization is allowed by first
     * calling {@link #assertAuthorized(org.apache.shiro.aop.MethodInvocation) assertAuthorized}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.aop` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/aop/AuthorizingMethodInterceptor.java`
#### Snippet
```java
     * Invokes the specified method (<code>methodInvocation.{@link org.apache.shiro.aop.MethodInvocation#proceed proceed}()</code>
     * if authorization is allowed by first
     * calling {@link #assertAuthorized(org.apache.shiro.aop.MethodInvocation) assertAuthorized}.
     */
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.aop` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/aop/AuthorizingAnnotationMethodInterceptor.java`
#### Snippet
```java
    /**
     * Ensures the <code>methodInvocation</code> is allowed to execute first before proceeding by calling the
     * {@link #assertAuthorized(org.apache.shiro.aop.MethodInvocation) assertAuthorized} method first.
     *
     * @param methodInvocation the method invocation to check for authorization prior to allowing it to proceed/execute.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.aop` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/aop/AuthorizingAnnotationMethodInterceptor.java`
#### Snippet
```java
     *
     * @param methodInvocation the method invocation to check for authorization prior to allowing it to proceed/execute.
     * @return the return value from the method invocation (the value of {@link org.apache.shiro.aop.MethodInvocation#proceed() MethodInvocation.proceed()}).
     * @throws org.apache.shiro.authz.AuthorizationException if the <code>MethodInvocation</code> is not allowed to proceed.
     * @throws Throwable if any other error occurs.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/aop/AuthorizingAnnotationMethodInterceptor.java`
#### Snippet
```java
     * @param methodInvocation the method invocation to check for authorization prior to allowing it to proceed/execute.
     * @return the return value from the method invocation (the value of {@link org.apache.shiro.aop.MethodInvocation#proceed() MethodInvocation.proceed()}).
     * @throws org.apache.shiro.authz.AuthorizationException if the <code>MethodInvocation</code> is not allowed to proceed.
     * @throws Throwable if any other error occurs.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/permission/PermissionResolver.java`
#### Snippet
```java
/**
 * A {@code PermissionResolver} resolves a String value and converts it into a
 * {@link org.apache.shiro.authz.Permission Permission} instance.
 * <p/>
 * The default {@link WildcardPermissionResolver} should be
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/permission/PermissionResolver.java`
#### Snippet
```java
 * suitable for most purposes, which constructs {@link WildcardPermission} objects.
 * However, any resolver may be configured if an application wishes to use different
 * {@link org.apache.shiro.authz.Permission} implementations.
 * <p/>
 * A {@code PermissionResolver} is used by many Shiro components such as annotations, property file
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/permission/RolePermissionResolver.java`
#### Snippet
```java
/**
 * A RolePermissionResolver resolves a String value and converts it into a Collection of
 * {@link org.apache.shiro.authz.Permission} instances.
 * <p/>
 * In some cases a {@link org.apache.shiro.realm.Realm} my only be able to return a list of roles.  This
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/Realm.java`
#### Snippet
```java
    /**
     * Returns <tt>true</tt> if this realm wishes to authenticate the Subject represented by the given
     * {@link org.apache.shiro.authc.AuthenticationToken AuthenticationToken} instance, <tt>false</tt> otherwise.
     *
     * <p>If this method returns <tt>false</tt>, it will not be called to authenticate the Subject represented by
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/Realm.java`
#### Snippet
```java
     * @return the authentication information for the account associated with the specified <tt>token</tt>,
     *         or <tt>null</tt> if no account could be found.
     * @throws org.apache.shiro.authc.AuthenticationException
     *          if there is an error obtaining or constructing an AuthenticationInfo object based on the
     *          specified <tt>token</tt> or implementation-specific login behavior fails.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/Realm.java`
#### Snippet
```java
 * perform <i>both</i> authentication and authorization duties for a single datasource, which caters to the large
 * majority of applications.  If for some reason you don't want your Realm implementation to perform authentication
 * duties, you should override the {@link #supports(org.apache.shiro.authc.AuthenticationToken)} method to always
 * return <tt>false</tt>.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.realm` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/Realm.java`
#### Snippet
```java
 *
 * <p>Most users will not implement the <tt>Realm</tt> interface directly, but will extend one of the subclasses,
 * {@link org.apache.shiro.realm.AuthenticatingRealm AuthenticatingRealm} or {@link org.apache.shiro.realm.AuthorizingRealm}, greatly reducing the effort required
 * to implement a <tt>Realm</tt> from scratch.</p>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.realm` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/Realm.java`
#### Snippet
```java
 *
 * <p>Most users will not implement the <tt>Realm</tt> interface directly, but will extend one of the subclasses,
 * {@link org.apache.shiro.realm.AuthenticatingRealm AuthenticatingRealm} or {@link org.apache.shiro.realm.AuthorizingRealm}, greatly reducing the effort required
 * to implement a <tt>Realm</tt> from scratch.</p>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.realm` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/Realm.java`
#### Snippet
```java
 * to implement a <tt>Realm</tt> from scratch.</p>
 *
 * @see org.apache.shiro.realm.CachingRealm CachingRealm
 * @see org.apache.shiro.realm.AuthenticatingRealm AuthenticatingRealm
 * @see org.apache.shiro.realm.AuthorizingRealm AuthorizingRealm
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.realm` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/Realm.java`
#### Snippet
```java
 *
 * @see org.apache.shiro.realm.CachingRealm CachingRealm
 * @see org.apache.shiro.realm.AuthenticatingRealm AuthenticatingRealm
 * @see org.apache.shiro.realm.AuthorizingRealm AuthorizingRealm
 * @see org.apache.shiro.authc.pam.ModularRealmAuthenticator ModularRealmAuthenticator
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.realm` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/Realm.java`
#### Snippet
```java
 * @see org.apache.shiro.realm.CachingRealm CachingRealm
 * @see org.apache.shiro.realm.AuthenticatingRealm AuthenticatingRealm
 * @see org.apache.shiro.realm.AuthorizingRealm AuthorizingRealm
 * @see org.apache.shiro.authc.pam.ModularRealmAuthenticator ModularRealmAuthenticator
 * @since 0.1
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.cache` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/CachingRealm.java`
#### Snippet
```java
    /**
     * Returns {@code true} if caching should be used if a {@link CacheManager} has been
     * {@link #setCacheManager(org.apache.shiro.cache.CacheManager) configured}, {@code false} otherwise.
     * <p/>
     * The default value is {@code true} since the large majority of Realms will benefit from caching if a CacheManager
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/CachingRealm.java`
#### Snippet
```java
 * <p/>
 * It also provides a convenience method,
 * {@link #getAvailablePrincipal(org.apache.shiro.subject.PrincipalCollection)}, which is useful across all
 * realm subclasses for obtaining a realm-specific principal/identity.
 * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/CachingRealm.java`
#### Snippet
```java
 * All actual Realm method implementations are left to subclasses.
 *
 * @see #clearCache(org.apache.shiro.subject.PrincipalCollection)
 * @see #onLogout(org.apache.shiro.subject.PrincipalCollection)
 * @see #getAvailablePrincipal(org.apache.shiro.subject.PrincipalCollection)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/CachingRealm.java`
#### Snippet
```java
 *
 * @see #clearCache(org.apache.shiro.subject.PrincipalCollection)
 * @see #onLogout(org.apache.shiro.subject.PrincipalCollection)
 * @see #getAvailablePrincipal(org.apache.shiro.subject.PrincipalCollection)
 * @since 0.9
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/CachingRealm.java`
#### Snippet
```java
 * @see #clearCache(org.apache.shiro.subject.PrincipalCollection)
 * @see #onLogout(org.apache.shiro.subject.PrincipalCollection)
 * @see #getAvailablePrincipal(org.apache.shiro.subject.PrincipalCollection)
 * @since 0.9
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/CachingRealm.java`
#### Snippet
```java
     * call.</li>
     * <li>If the previous call does not result in any principals, attempt to get the overall 'primary' principal
     * from the PrincipalCollection via {@link org.apache.shiro.subject.PrincipalCollection#getPrimaryPrincipal()}.</li>
     * <li>If there are no principals from that call (or the PrincipalCollection argument was null to begin with),
     * return {@code null}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/CachingRealm.java`
#### Snippet
```java
     * Subclasses are free to override for additional behavior, but be sure to call {@code super.onLogout} first.
     * <p/>
     * This default implementation merely calls {@link #clearCache(org.apache.shiro.subject.PrincipalCollection)}.
     *
     * @param principals the application-specific Subject/user identifier that is logging out.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/CachingRealm.java`
#### Snippet
```java
     *
     * @param principals the application-specific Subject/user identifier that is logging out.
     * @see #clearCache(org.apache.shiro.subject.PrincipalCollection)
     * @see #getAvailablePrincipal(org.apache.shiro.subject.PrincipalCollection)
     * @since 1.2
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/CachingRealm.java`
#### Snippet
```java
     * @param principals the application-specific Subject/user identifier that is logging out.
     * @see #clearCache(org.apache.shiro.subject.PrincipalCollection)
     * @see #getAvailablePrincipal(org.apache.shiro.subject.PrincipalCollection)
     * @since 1.2
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.cache` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/CachingRealm.java`
#### Snippet
```java
     * Template method that may be implemented by subclasses should they wish to react to a
     * {@link CacheManager} instance being set on the realm instance via the
     * {@link #setCacheManager(org.apache.shiro.cache.CacheManager)} mutator.
     */
    protected void afterCacheManagerSet() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.cache` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/CachingRealm.java`
#### Snippet
```java
    /**
     * Sets whether or not caching should be used if a {@link CacheManager} has been
     * {@link #setCacheManager(org.apache.shiro.cache.CacheManager) configured}.
     *
     * @param cachingEnabled whether or not to globally enable caching for this realm.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/CachingRealm.java`
#### Snippet
```java
     * <p/>
     * This implementation will return quietly if the principals argument is null or empty.  Otherwise it delegates
     * to {@link #doClearCache(org.apache.shiro.subject.PrincipalCollection)}.
     *
     * @param principals the principals of the account for which to clear any cached data.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.naming` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/ldap/LdapContextFactory.java`
#### Snippet
```java
     * @return a {@code LdapContext} bound by the system account, or bound anonymously if no system account
     *         is configured.
     * @throws javax.naming.NamingException if there is an error creating the context.
     */
    LdapContext getSystemLdapContext() throws NamingException;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/ldap/AbstractLdapRealm.java`
#### Snippet
```java
 *
 * <p>Implementations would need to implement the
 * {@link #queryForAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken ,LdapContextFactory)} and
 * {@link #queryForAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection ,LdapContextFactory)} abstract methods.</p>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/ldap/AbstractLdapRealm.java`
#### Snippet
```java
 * <p>Implementations would need to implement the
 * {@link #queryForAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken ,LdapContextFactory)} and
 * {@link #queryForAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection ,LdapContextFactory)} abstract methods.</p>
 *
 * <p>By default, this implementation will create an instance of {@link JndiLdapContextFactory} to use for
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/ldap/AbstractLdapRealm.java`
#### Snippet
```java
 * will cause these properties specified on the realm to be ignored.</p>
 *
 * @see #queryForAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken , LdapContextFactory)
 * @see #queryForAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection , LdapContextFactory)
 * @since 0.1
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/ldap/AbstractLdapRealm.java`
#### Snippet
```java
 *
 * @see #queryForAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken , LdapContextFactory)
 * @see #queryForAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection , LdapContextFactory)
 * @since 0.1
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/jndi/JndiRealmFactory.java`
#### Snippet
```java
     *
     * <p>The returned Collection is in the same order as the specified
     * {@link #setJndiNames(java.util.Collection) jndiNames}
     *
     * @return an ordered collection of the {@link #setJndiNames(java.util.Collection) specified Realms} found in JNDI.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/jndi/JndiRealmFactory.java`
#### Snippet
```java
     * {@link #setJndiNames(java.util.Collection) jndiNames}
     *
     * @return an ordered collection of the {@link #setJndiNames(java.util.Collection) specified Realms} found in JNDI.
     * @throws IllegalStateException if any of the JNDI names fails to successfully look up a Realm instance.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.naming` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/ldap/LdapUtils.java`
#### Snippet
```java
     * @param attr the LDAP attribute.
     * @return the values of the attribute.
     * @throws javax.naming.NamingException if there is an LDAP error while reading the values.
     */
    public static Collection<String> getAllAttributeValues(Attribute attr) throws NamingException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/jdbc/JdbcRealm.java`
#### Snippet
```java
 * If the default implementation
 * of authentication and authorization cannot handle your schema, this class can be subclassed and the
 * appropriate methods overridden. (usually {@link #doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken)},
 * {@link #getRoleNamesForUser(java.sql.Connection,String)}, and/or {@link #getPermissions(java.sql.Connection,String,java.util.Collection)}
 * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/jdbc/JdbcRealm.java`
#### Snippet
```java
 * of authentication and authorization cannot handle your schema, this class can be subclassed and the
 * appropriate methods overridden. (usually {@link #doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken)},
 * {@link #getRoleNamesForUser(java.sql.Connection,String)}, and/or {@link #getPermissions(java.sql.Connection,String,java.util.Collection)}
 * <p/>
 * This realm supports caching by extending from {@link org.apache.shiro.realm.AuthorizingRealm}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/jdbc/JdbcRealm.java`
#### Snippet
```java
 * of authentication and authorization cannot handle your schema, this class can be subclassed and the
 * appropriate methods overridden. (usually {@link #doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken)},
 * {@link #getRoleNamesForUser(java.sql.Connection,String)}, and/or {@link #getPermissions(java.sql.Connection,String,java.util.Collection)}
 * <p/>
 * This realm supports caching by extending from {@link org.apache.shiro.realm.AuthorizingRealm}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/jdbc/JdbcRealm.java`
#### Snippet
```java
 * of authentication and authorization cannot handle your schema, this class can be subclassed and the
 * appropriate methods overridden. (usually {@link #doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken)},
 * {@link #getRoleNamesForUser(java.sql.Connection,String)}, and/or {@link #getPermissions(java.sql.Connection,String,java.util.Collection)}
 * <p/>
 * This realm supports caching by extending from {@link org.apache.shiro.realm.AuthorizingRealm}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.realm` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/jdbc/JdbcRealm.java`
#### Snippet
```java
 * {@link #getRoleNamesForUser(java.sql.Connection,String)}, and/or {@link #getPermissions(java.sql.Connection,String,java.util.Collection)}
 * <p/>
 * This realm supports caching by extending from {@link org.apache.shiro.realm.AuthorizingRealm}.
 *
 * @since 0.2
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/jdbc/JdbcRealm.java`
#### Snippet
```java
     * per permission with a single column, containing the permission.
     * If you require a solution that does not match this query
     * structure, you can override {@link #doGetAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection)} or just
     * {@link #getPermissions(java.sql.Connection,String,java.util.Collection)}</p>
     * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/jdbc/JdbcRealm.java`
#### Snippet
```java
     * If you require a solution that does not match this query
     * structure, you can override {@link #doGetAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection)} or just
     * {@link #getPermissions(java.sql.Connection,String,java.util.Collection)}</p>
     * <p/>
     * <b>Permissions are only retrieved if you set {@link #permissionsLookupEnabled} to true.  Otherwise,
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/jdbc/JdbcRealm.java`
#### Snippet
```java
     * If you require a solution that does not match this query
     * structure, you can override {@link #doGetAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection)} or just
     * {@link #getPermissions(java.sql.Connection,String,java.util.Collection)}</p>
     * <p/>
     * <b>Permissions are only retrieved if you set {@link #permissionsLookupEnabled} to true.  Otherwise,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/jdbc/JdbcRealm.java`
#### Snippet
```java
     * implementation, this query must take the user's username as a single parameter and return a single result
     * with the user's password as the first column.  If you require a solution that does not match this query
     * structure, you can override {@link #doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken)} or
     * just {@link #getPasswordForUser(java.sql.Connection,String)}
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/jdbc/JdbcRealm.java`
#### Snippet
```java
     * with the user's password as the first column.  If you require a solution that does not match this query
     * structure, you can override {@link #doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken)} or
     * just {@link #getPasswordForUser(java.sql.Connection,String)}
     *
     * @param authenticationQuery the query to use for authentication.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/jdbc/JdbcRealm.java`
#### Snippet
```java
     * per role with a single column containing the role name.  If you require a solution that does not match this query
     * structure, you can override {@link #doGetAuthorizationInfo(PrincipalCollection)} or just
     * {@link #getRoleNamesForUser(java.sql.Connection,String)}
     *
     * @param userRolesQuery the query to use for retrieving a user's roles.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/jdbc/JdbcRealm.java`
#### Snippet
```java
     * this realm's {@link #getName() name}
     *
     * @see #getAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/ModularRealmAuthorizer.java`
#### Snippet
```java

    /**
     * Calls {@link #hasRole(org.apache.shiro.subject.PrincipalCollection, String)} for each role name in the specified
     * collection and places the return value from each call at the respective location in the returned array.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz.permission` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/ModularRealmAuthorizer.java`
#### Snippet
```java
    /**
     * Sets the specified {@link PermissionResolver PermissionResolver} on <em>all</em> of the wrapped realms that
     * implement the {@link org.apache.shiro.authz.permission.PermissionResolverAware PermissionResolverAware} interface.
     * <p/>
     * Only call this method if you want the permission resolver to be passed to all realms that implement the
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz.permission` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/ModularRealmAuthorizer.java`
#### Snippet
```java
     *
     * @param permissionResolver the permissionResolver to set on all of the wrapped realms that implement the
     *                           {@link org.apache.shiro.authz.permission.PermissionResolverAware PermissionResolverAware} interface.
     */
    public void setPermissionResolver(PermissionResolver permissionResolver) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/ModularRealmAuthorizer.java`
#### Snippet
```java

    /**
     * If !{@link #isPermitted(org.apache.shiro.subject.PrincipalCollection, String) isPermitted(permission)}, throws
     * an <code>UnauthorizedException</code> otherwise returns quietly.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/ModularRealmAuthorizer.java`
#### Snippet
```java
    /**
     * Returns <code>true</code> if any of the configured realms'
     * {@link #isPermitted(org.apache.shiro.subject.PrincipalCollection, List)} call returns <code>true</code>,
     * <code>false</code> otherwise.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/ModularRealmAuthorizer.java`
#### Snippet
```java

    /**
     * Calls {@link #checkRole(org.apache.shiro.subject.PrincipalCollection, String) checkRole} for each role specified.
     */
    public void checkRoles(PrincipalCollection principals, String... roles) throws AuthorizationException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/ModularRealmAuthorizer.java`
#### Snippet
```java
    /**
     * Returns <code>true</code> if any of the configured realms'
     * {@link #isPermittedAll(org.apache.shiro.subject.PrincipalCollection, String...)} call returns
     * <code>true</code>, <code>false</code> otherwise.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/ModularRealmAuthorizer.java`
#### Snippet
```java
    /**
     * Returns <code>true</code> if any of the configured realms'
     * {@link #isPermitted(org.apache.shiro.subject.PrincipalCollection, Permission)} call returns <code>true</code>
     * for <em>all</em> of the specified Permissions, <code>false</code> otherwise.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz.permission` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/ModularRealmAuthorizer.java`
#### Snippet
```java
    /**
     * Sets the internal {@link #getRolePermissionResolver} on any internal configured
     * {@link #getRealms Realms} that implement the {@link org.apache.shiro.authz.permission.RolePermissionResolverAware RolePermissionResolverAware} interface.
     * <p/>
     * This method is called after setting a rolePermissionResolver on this ModularRealmAuthorizer via the
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz.permission` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/ModularRealmAuthorizer.java`
#### Snippet
```java
     * <p/>
     * This method is called after setting a rolePermissionResolver on this ModularRealmAuthorizer via the
     * {@link #setRolePermissionResolver(org.apache.shiro.authz.permission.RolePermissionResolver) setRolePermissionResolver} method.
     * <p/>
     * It is also called after setting one or more realms via the {@link #setRealms setRealms} method to allow these
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/ModularRealmAuthorizer.java`
#### Snippet
```java
    /**
     * Returns <code>true</code> if any of the configured realms'
     * {@link #isPermitted(org.apache.shiro.subject.PrincipalCollection, Permission)} call returns <code>true</code>,
     * <code>false</code> otherwise.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/ModularRealmAuthorizer.java`
#### Snippet
```java
    /**
     * Returns <code>true</code> if any of the configured realms'
     * {@link #hasRole(org.apache.shiro.subject.PrincipalCollection, String)} call returns <code>true</code>,
     * <code>false</code> otherwise.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/ModularRealmAuthorizer.java`
#### Snippet
```java
    /**
     * Returns <code>true</code> if any of the configured realms'
     * {@link #isPermitted(org.apache.shiro.subject.PrincipalCollection, String)} call returns <code>true</code>
     * for <em>all</em> of the specified string permissions, <code>false</code> otherwise.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/ModularRealmAuthorizer.java`
#### Snippet
```java

    /**
     * If !{@link #isPermitted(org.apache.shiro.subject.PrincipalCollection, Permission) isPermitted(permission)}, throws
     * an <code>UnauthorizedException</code> otherwise returns quietly.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/ModularRealmAuthorizer.java`
#### Snippet
```java

    /**
     * If !{@link #hasRole(org.apache.shiro.subject.PrincipalCollection, String) hasRole(role)}, throws
     * an <code>UnauthorizedException</code> otherwise returns quietly.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz.permission` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/ModularRealmAuthorizer.java`
#### Snippet
```java
    /**
     * Sets the internal {@link #getPermissionResolver} on any internal configured
     * {@link #getRealms Realms} that implement the {@link org.apache.shiro.authz.permission.PermissionResolverAware PermissionResolverAware} interface.
     * <p/>
     * This method is called after setting a permissionResolver on this ModularRealmAuthorizer via the
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz.permission` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/ModularRealmAuthorizer.java`
#### Snippet
```java
     * <p/>
     * This method is called after setting a permissionResolver on this ModularRealmAuthorizer via the
     * {@link #setPermissionResolver(org.apache.shiro.authz.permission.PermissionResolver) setPermissionResolver} method.
     * <p/>
     * It is also called after setting one or more realms via the {@link #setRealms setRealms} method to allow these
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/ModularRealmAuthorizer.java`
#### Snippet
```java
    /**
     * Returns <code>true</code> iff any of the configured realms'
     * {@link #hasRole(org.apache.shiro.subject.PrincipalCollection, String)} call returns <code>true</code> for
     * <em>all</em> roles specified, <code>false</code> otherwise.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz.permission` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/ModularRealmAuthorizer.java`
#### Snippet
```java
    /**
     * Sets the specified {@link RolePermissionResolver RolePermissionResolver} on <em>all</em> of the wrapped realms that
     * implement the {@link org.apache.shiro.authz.permission.RolePermissionResolverAware PermissionResolverAware} interface.
     * <p/>
     * Only call this method if you want the permission resolver to be passed to all realms that implement the
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz.permission` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/ModularRealmAuthorizer.java`
#### Snippet
```java
     *
     * @param rolePermissionResolver the rolePermissionResolver to set on all of the wrapped realms that implement the
     *                               {@link org.apache.shiro.authz.permission.RolePermissionResolverAware RolePermissionResolverAware} interface.
     */
    public void setRolePermissionResolver(RolePermissionResolver rolePermissionResolver) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/ModularRealmAuthorizer.java`
#### Snippet
```java

    /**
     * If !{@link #isPermitted(org.apache.shiro.subject.PrincipalCollection, String...) isPermitted(permission)},
     * throws an <code>UnauthorizedException</code> otherwise returns quietly.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/ModularRealmAuthorizer.java`
#### Snippet
```java
    /**
     * Returns <code>true</code> if any of the configured realms'
     * {@link #isPermitted(org.apache.shiro.subject.PrincipalCollection, String)} returns <code>true</code>,
     * <code>false</code> otherwise.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authz/ModularRealmAuthorizer.java`
#### Snippet
```java

    /**
     * If !{@link #isPermitted(org.apache.shiro.subject.PrincipalCollection, Permission) isPermitted(permission)} for
     * <em>all</em> the given Permissions, throws
     * an <code>UnauthorizedException</code> otherwise returns quietly.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/ldap/DefaultLdapRealm.java`
#### Snippet
```java
    /**
     * This implementation opens an LDAP connection using the token's
     * {@link #getLdapPrincipal(org.apache.shiro.authc.AuthenticationToken) discovered principal} and provided
     * {@link AuthenticationToken#getCredentials() credentials}.  If the connection opens successfully, the
     * authentication attempt is immediately considered successful and a new
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/ldap/DefaultLdapRealm.java`
#### Snippet
```java
     * authentication attempt is immediately considered successful and a new
     * {@link AuthenticationInfo} instance is
     * {@link #createAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken, Object, Object, javax.naming.ldap.LdapContext) created}
     * and returned.  If the connection cannot be opened, either because LDAP authentication failed or some other
     * JNDI problem, an {@link NamingException} will be thrown.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.naming.ldap` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/ldap/DefaultLdapRealm.java`
#### Snippet
```java
     * authentication attempt is immediately considered successful and a new
     * {@link AuthenticationInfo} instance is
     * {@link #createAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken, Object, Object, javax.naming.ldap.LdapContext) created}
     * and returned.  If the connection cannot be opened, either because LDAP authentication failed or some other
     * JNDI problem, an {@link NamingException} will be thrown.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/ldap/DefaultLdapRealm.java`
#### Snippet
```java

    /**
     * Delegates to {@link #queryForAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken, LdapContextFactory)},
     * wrapping any {@link NamingException}s in a Shiro {@link AuthenticationException} to satisfy the parent method
     * signature.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.naming.ldap` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/ldap/DefaultLdapRealm.java`
#### Snippet
```java
    /**
     * Returns the LDAP User Distinguished Name (DN) to use when acquiring an
     * {@link javax.naming.ldap.LdapContext LdapContext} from the {@link LdapContextFactory}.
     * <p/>
     * If the the {@link #getUserDnTemplate() userDnTemplate} property has been set, this implementation will construct
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.naming.ldap` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/ldap/DefaultLdapRealm.java`
#### Snippet
```java
     *
     * @param principal the principal to substitute into the configured {@link #getUserDnTemplate() userDnTemplate}.
     * @return the constructed User DN to use at runtime when acquiring an {@link javax.naming.ldap.LdapContext}.
     * @throws IllegalArgumentException if the method argument is null or empty
     * @throws IllegalStateException    if the {@link #getUserDnTemplate userDnTemplate} has not been set.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/ldap/DefaultLdapRealm.java`
#### Snippet
```java
 * <h2>Authentication</h2>
 * During an authentication attempt, if the submitted {@code AuthenticationToken}'s
 * {@link org.apache.shiro.authc.AuthenticationToken#getPrincipal() principal} is a simple username, but the
 * LDAP directory expects a complete User Distinguished Name (User DN) to establish a connection, the
 * {@link #setUserDnTemplate(String) userDnTemplate} property must be configured.  If not configured,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/ldap/DefaultLdapRealm.java`
#### Snippet
```java
 * <h2>Authorization</h2>
 * By default, authorization is effectively disabled due to the default
 * {@link #doGetAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection)} implementation returning {@code null}.
 * If you wish to perform authorization based on an LDAP schema, you must subclass this one
 * and override that method to reflect your organization's data model.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.naming.ldap` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/ldap/DefaultLdapRealm.java`
#### Snippet
```java
    ============================================*/
    /**
     * The LdapContextFactory instance used to acquire {@link javax.naming.ldap.LdapContext LdapContext}'s at runtime
     * to acquire connections to the LDAP directory to perform authentication attempts and authorization queries.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.realm.text` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/text/IniRealm.java`
#### Snippet
```java
 * <pre>
 * [users]
 * # One or more {@link org.apache.shiro.realm.text.TextConfigurationRealm#setUserDefinitions(String) user definitions}
 * ...
 * [roles]
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.realm.text` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/text/IniRealm.java`
#### Snippet
```java
 * ...
 * [roles]
 * # One or more {@link org.apache.shiro.realm.text.TextConfigurationRealm#setRoleDefinitions(String) role definitions}</pre>
 * <p/>
 * This class also supports setting the {@link #setResourcePath(String) resourcePath} property to create account
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/ldap/JndiLdapContextFactory.java`
#### Snippet
```java
     * <p/>
     * After the merged Map instance is created, the LdapContext connection is
     * {@link #createLdapContext(java.util.Hashtable) created} and returned.
     *
     * @param principal   the principal to use when acquiring a connection to the LDAP directory
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/ldap/JndiLdapContextFactory.java`
#### Snippet
```java
 * one used to acquire the {@link LdapContext}.
 * <p/>
 * The template can be configured directly via the {@link #getEnvironment()}/{@link #setEnvironment(java.util.Map)}
 * properties directly if necessary, but it is usually more convenient to use the supporting wrapper get/set methods
 * for various environment properties.  These wrapper methods interact with the environment
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.naming` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/ldap/JndiLdapContextFactory.java`
#### Snippet
```java
                    (String.class.isInstance(credentials) && !StringUtils.hasText(String.valueOf(credentials)))) {

                    throw new javax.naming.AuthenticationException("LDAP Simple authentication requires both a "
                                                                       + "principal and credentials.");
                }
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.naming.ldap` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/ldap/JndiLdapContextFactory.java`
#### Snippet
```java

    /**
     * Creates and returns a new {@link javax.naming.ldap.InitialLdapContext} instance.  This method exists primarily
     * to support testing where a mock LdapContext can be returned instead of actually creating a connection, but
     * subclasses are free to provide a different implementation if necessary.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.cache` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
     * @return a {@link Cache} instance to use for authentication caching, or {@code null} if no cache has been
     *         set.
     * @see #setAuthenticationCache(org.apache.shiro.cache.Cache)
     * @see #isAuthenticationCachingEnabled()
     * @since 1.2
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
     * Returns the authenticationToken class supported by this realm.
     * <p/>
     * <p>The default value is <tt>{@link org.apache.shiro.authc.UsernamePasswordToken UsernamePasswordToken.class}</tt>, since
     * about 90% of realms use username/password authentication, regardless of their protocol (e.g. over jdbc, ldap,
     * kerberos, http, etc.).
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.cache` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
    /**
     * Sets whether or not authentication caching should be utilized if a {@link CacheManager} has been
     * {@link #setCacheManager(org.apache.shiro.cache.CacheManager) configured}, {@code false} otherwise.
     * <p/>
     * The default value is {@code false} to retain backwards compatibility with Shiro 1.1 and earlier.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
     * alleviating the need to perform any lookups with a data source.</li>
     * <li>If there is no cached {@link AuthenticationInfo} found, delegate to the
     * {@link #doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken)} method to perform the actual
     * lookup.  If authentication caching is enabled and possible, any returned info object will be
     * {@link #cacheAuthenticationInfoIfPossible(org.apache.shiro.authc.AuthenticationToken, org.apache.shiro.authc.AuthenticationInfo) cached}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
     * {@link #doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken)} method to perform the actual
     * lookup.  If authentication caching is enabled and possible, any returned info object will be
     * {@link #cacheAuthenticationInfoIfPossible(org.apache.shiro.authc.AuthenticationToken, org.apache.shiro.authc.AuthenticationInfo) cached}
     * to be used in future authentication attempts.</li>
     * <li>If an AuthenticationInfo instance is not found in the cache or by lookup, {@code null} is returned to
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
     * {@link #doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken)} method to perform the actual
     * lookup.  If authentication caching is enabled and possible, any returned info object will be
     * {@link #cacheAuthenticationInfoIfPossible(org.apache.shiro.authc.AuthenticationToken, org.apache.shiro.authc.AuthenticationInfo) cached}
     * to be used in future authentication attempts.</li>
     * <li>If an AuthenticationInfo instance is not found in the cache or by lookup, {@code null} is returned to
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.cache` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
    /**
     * Sets the name of a {@link Cache} to lookup from any available {@link #getCacheManager() cacheManager} if
     * a cache is not explicitly configured via {@link #setAuthenticationCache(org.apache.shiro.cache.Cache)}.
     * <p/>
     * This name will only be used to look up a cache if authentication caching is
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.cache` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
     * @param authenticationCacheName the name of a {@link Cache} to lookup from any available
     *                                {@link #getCacheManager() cacheManager} if a cache is not explicitly configured
     *                                via {@link #setAuthenticationCache(org.apache.shiro.cache.Cache)}.
     * @see #isAuthenticationCachingEnabled()
     * @since 1.2
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
     * Returns the key under which {@link AuthenticationInfo} instances are cached if authentication caching is enabled.
     * This implementation delegates to
     * {@link #getAvailablePrincipal(org.apache.shiro.subject.PrincipalCollection)}, which returns the primary principal
     * associated with this particular Realm.
     * <h3>Cache Invalidation on Logout</h3>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
     * <b>NOTE:</b> If you want to be able to invalidate an account's cached {@code AuthenticationInfo} on logout, you
     * must ensure that this method returns the same value as the
     * {@link #getAuthenticationCacheKey(org.apache.shiro.authc.AuthenticationToken)} method!
     *
     * @param principals the principals of the account for which to set or remove cached {@code AuthenticationInfo}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc.credential` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
     * <p/>
     * <p>Unless overridden by the {@link #setCredentialsMatcher setCredentialsMatcher} method, the default
     * value is a {@link org.apache.shiro.authc.credential.SimpleCredentialsMatcher SimpleCredentialsMatcher} instance.
     *
     * @return the <code>CredentialsMatcher</code> used during an authentication attempt to verify submitted
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.cache` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
     * Returns any available {@link Cache} instance to use for authentication caching.  This functions as follows:
     * <ol>
     * <li>If an {@link #setAuthenticationCache(org.apache.shiro.cache.Cache) authenticationCache} has been explicitly
     * configured (it is not null), it is returned.</li>
     * <li>If there is no {@link #getAuthenticationCache() authenticationCache} configured:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
     * <p/>
     * <p>Unless overridden by this method, the default value is
     * {@link org.apache.shiro.authc.UsernamePasswordToken UsernamePasswordToken.class} to support the majority of applications.
     *
     * @param authenticationTokenClass the class of authentication token instances supported by this realm.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc.credential` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
     * <p/>
     * <p>Unless overridden by this method, the default value is a
     * {@link org.apache.shiro.authc.credential.SimpleCredentialsMatcher} instance.
     *
     * @param credentialsMatcher the matcher to use.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
    /**
     * The class that this realm supports for authentication tokens.  This is used by the
     * default implementation of the {@link Realm#supports(org.apache.shiro.authc.AuthenticationToken)} method to
     * determine whether or not the given authentication token is supported by this realm.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
     * <p/>
     * After this method is called, the next authentication for that same account will result in a call to
     * {@link #doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken) doGetAuthenticationInfo}, and the
     * resulting return value will be cached before being returned so it can be reused for later authentications.
     * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
     * <p/>
     * If you wish to clear out all associated cached data (and not just authentication data), use the
     * {@link #clearCache(org.apache.shiro.subject.PrincipalCollection)} method instead (which will in turn call this
     * method by default).
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
     *
     * @param principals the principals of the account for which to clear the cached AuthorizationInfo.
     * @see #clearCache(org.apache.shiro.subject.PrincipalCollection)
     * @since 1.2
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
     * Returns the key under which {@link AuthenticationInfo} instances are cached if authentication caching is enabled.
     * This implementation defaults to returning the token's
     * {@link org.apache.shiro.authc.AuthenticationToken#getPrincipal() principal}, which is usually a username in
     * most applications.
     * <h3>Cache Invalidation on Logout</h3>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
     * <h3>Cache Invalidation on Logout</h3>
     * <b>NOTE:</b> If you want to be able to invalidate an account's cached {@code AuthenticationInfo} on logout, you
     * must ensure the {@link #getAuthenticationCacheKey(org.apache.shiro.subject.PrincipalCollection)} method returns
     * the same value as this method.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
     * @param token the submitted authentication token
     * @param info  the {@code AuthenticationInfo} acquired from data source lookup via
     *              {@link #doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken)}
     * @return {@code true} if authentication caching should be utilized based on the specified
     *         {@link AuthenticationToken} and/or {@link AuthenticationInfo}, {@code false} otherwise.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.cache` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
     * {@code cache}, and this cache which will be used as specified in #1.</li>
     * <li>If neither the {@link #setAuthenticationCache (org.apache.shiro.cache.Cache) authenticationCache}
     * or {@link #setCacheManager(org.apache.shiro.cache.CacheManager) cacheManager}
     * properties are set, caching will not be utilized and authentication look-ups will be delegated to
     * subclass implementations for each authentication attempt.</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
    /**
     * This implementation clears out any cached authentication data by calling
     * {@link #clearCachedAuthenticationInfo(org.apache.shiro.subject.PrincipalCollection)}.
     * If overriding in a subclass, be sure to call {@code super.doClearCache} to ensure this behavior is maintained.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
    /**
     * Caches the specified info if authentication caching
     * {@link #isAuthenticationCachingEnabled(org.apache.shiro.authc.AuthenticationToken, org.apache.shiro.authc.AuthenticationInfo) isEnabled}
     * for the specific token/info pair and a cache instance is available to be used.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
    /**
     * Caches the specified info if authentication caching
     * {@link #isAuthenticationCachingEnabled(org.apache.shiro.authc.AuthenticationToken, org.apache.shiro.authc.AuthenticationInfo) isEnabled}
     * for the specific token/info pair and a cache instance is available to be used.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.cache` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
    /**
     * Returns the name of a {@link Cache} to lookup from any available {@link #getCacheManager() cacheManager} if
     * a cache is not explicitly configured via {@link #setAuthenticationCache(org.apache.shiro.cache.Cache)}.
     * <p/>
     * This name will only be used to look up a cache if authentication caching is
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.cache` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
     *
     * @return the name of a {@link Cache} to lookup from any available {@link #getCacheManager() cacheManager} if
     *         a cache is not explicitly configured via {@link #setAuthenticationCache(org.apache.shiro.cache.Cache)}.
     * @see #isAuthenticationCachingEnabled()
     * @since 1.2
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.cache` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
    /**
     * Returns {@code true} if authentication caching should be utilized if a {@link CacheManager} has been
     * {@link #setCacheManager(org.apache.shiro.cache.CacheManager) configured}, {@code false} otherwise.
     * <p/>
     * The default value is {@code true}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
 * <b>ONLY enable authentication caching if either of the following is true for your realm implementation:</b>
 * <ul>
 * <li>The {@link #doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken) doGetAuthenticationInfo}
 * implementation returns {@code AuthenticationInfo} instances where the
 * {@link org.apache.shiro.authc.AuthenticationInfo#getCredentials() credentials} are securely obfuscated and NOT
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
 * <li>The {@link #doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken) doGetAuthenticationInfo}
 * implementation returns {@code AuthenticationInfo} instances where the
 * {@link org.apache.shiro.authc.AuthenticationInfo#getCredentials() credentials} are securely obfuscated and NOT
 * plaintext (raw) credentials. For example,
 * if your realm references accounts with passwords, that the {@code AuthenticationInfo}'s
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
 * plaintext (raw) credentials. For example,
 * if your realm references accounts with passwords, that the {@code AuthenticationInfo}'s
 * {@link org.apache.shiro.authc.AuthenticationInfo#getCredentials() credentials} are safely hashed and salted or otherwise
 * fully encrypted.<br/><br/></li>
 * <li>The {@link #doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken) doGetAuthenticationInfo}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
 * {@link org.apache.shiro.authc.AuthenticationInfo#getCredentials() credentials} are safely hashed and salted or otherwise
 * fully encrypted.<br/><br/></li>
 * <li>The {@link #doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken) doGetAuthenticationInfo}
 * implementation returns {@code AuthenticationInfo} instances where the
 * {@link org.apache.shiro.authc.AuthenticationInfo#getCredentials() credentials} are plaintext (raw) <b>AND</b> the
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
 * <li>The {@link #doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken) doGetAuthenticationInfo}
 * implementation returns {@code AuthenticationInfo} instances where the
 * {@link org.apache.shiro.authc.AuthenticationInfo#getCredentials() credentials} are plaintext (raw) <b>AND</b> the
 * cache region storing the {@code AuthenticationInfo} instances WILL NOT overflow to disk and WILL NOT transmit cache
 * entries over an unprotected (non TLS/SSL) network (as might be the case with a networked/distributed enterprise cache).
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
 * If authentication caching is enabled, this implementation will attempt to evict (remove) cached authentication data
 * for an account during logout.  This can only occur if the
 * {@link #getAuthenticationCacheKey(org.apache.shiro.authc.AuthenticationToken)} and
 * {@link #getAuthenticationCacheKey(org.apache.shiro.subject.PrincipalCollection)} methods return the exact same value.
 * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
 * for an account during logout.  This can only occur if the
 * {@link #getAuthenticationCacheKey(org.apache.shiro.authc.AuthenticationToken)} and
 * {@link #getAuthenticationCacheKey(org.apache.shiro.subject.PrincipalCollection)} methods return the exact same value.
 * <p/>
 * The default implementations of these methods expect that the
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
 * <p/>
 * The default implementations of these methods expect that the
 * {@link org.apache.shiro.authc.AuthenticationToken#getPrincipal()} (what the user submits during login) and
 * {@link #getAvailablePrincipal(org.apache.shiro.subject.PrincipalCollection) getAvailablePrincipal} (what is returned
 * by the realm after account lookup) return
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
 * The default implementations of these methods expect that the
 * {@link org.apache.shiro.authc.AuthenticationToken#getPrincipal()} (what the user submits during login) and
 * {@link #getAvailablePrincipal(org.apache.shiro.subject.PrincipalCollection) getAvailablePrincipal} (what is returned
 * by the realm after account lookup) return
 * the same exact value.  For example, the user submitted username is also the primary account identifier.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
 * However, if your application uses, say, a username for end-user login, but returns a primary key ID as the
 * primary principal after authentication, then you will need to override either
 * {@link #getAuthenticationCacheKey(org.apache.shiro.authc.AuthenticationToken) getAuthenticationCacheKey(token)} or
 * {@link #getAuthenticationCacheKey(org.apache.shiro.subject.PrincipalCollection) getAuthenticationCacheKey(principals)}
 * (or both) to ensure that the same cache key can be used for either object.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
 * primary principal after authentication, then you will need to override either
 * {@link #getAuthenticationCacheKey(org.apache.shiro.authc.AuthenticationToken) getAuthenticationCacheKey(token)} or
 * {@link #getAuthenticationCacheKey(org.apache.shiro.subject.PrincipalCollection) getAuthenticationCacheKey(principals)}
 * (or both) to ensure that the same cache key can be used for either object.
 * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
 * {@code PrincipalCollection}).
 * <h4>Unmatching Cache Key Values</h4>
 * If the return values from {@link #getAuthenticationCacheKey(org.apache.shiro.authc.AuthenticationToken)} and
 * {@link #getAuthenticationCacheKey(org.apache.shiro.subject.PrincipalCollection)} are not identical, cached
 * authentication data removal is at the mercy of your cache provider settings.  For example, often cache
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
 * <h4>Unmatching Cache Key Values</h4>
 * If the return values from {@link #getAuthenticationCacheKey(org.apache.shiro.authc.AuthenticationToken)} and
 * {@link #getAuthenticationCacheKey(org.apache.shiro.subject.PrincipalCollection)} are not identical, cached
 * authentication data removal is at the mercy of your cache provider settings.  For example, often cache
 * implementations will evict cache entries based on a timeToIdle or timeToLive (TTL) value.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/SimpleAccount.java`
#### Snippet
```java
     *
     * @param permissions all String-based permissions assigned to this Account.
     * @see org.apache.shiro.authc.Account#getStringPermissions()
     */
    public void setStringPermissions(Set<String> permissions) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/SimpleAccount.java`
#### Snippet
```java
     *
     * @param credentials the credentials associated with this Account that verify one or more of the Account principals.
     * @see org.apache.shiro.authc.Account#getCredentials()
     */
    public void setCredentials(Object credentials) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/authc/SimpleAccount.java`
#### Snippet
```java

/**
 * Simple implementation of the {@link org.apache.shiro.authc.Account} interface that
 * contains principal and credential and authorization information (roles and permissions) as instance variables and
 * exposes them via getters and setters using standard JavaBean notation.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/SessionListener.java`
#### Snippet
```java
     * <p/>
     * If you need to perform time-based logic when a session expires, it is best to write it based on the
     * session's {@link org.apache.shiro.session.Session#getLastAccessTime() lastAccessTime} and <em>not</em> the time
     * when this method is called.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/Session.java`
#### Snippet
```java
     * All return values from this method are expected to have proper {@code toString()},
     * {@code equals()}, and {@code hashCode()} implementations. Good candidates for such
     * an identifier are {@link java.util.UUID UUID}s, {@link java.lang.Integer Integer}s, and
     * {@link java.lang.String String}s.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/Session.java`
#### Snippet
```java
     * {@code equals()}, and {@code hashCode()} implementations. Good candidates for such
     * an identifier are {@link java.util.UUID UUID}s, {@link java.lang.Integer Integer}s, and
     * {@link java.lang.String String}s.
     *
     * @return The unique identifier assigned to the session upon creation.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/text/PropertiesRealm.java`
#### Snippet
```java
    /**
     * Determines whether or not the properties XML format should be used.  For more information, see
     * {@link Properties#loadFromXML(java.io.InputStream)}
     *
     * @param useXmlFormat true to use XML or false to use the normal format.  Defaults to false.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/text/PropertiesRealm.java`
#### Snippet
```java
/**
 * A {@link TextConfigurationRealm} that defers all logic to the parent class, but just enables
 * {@link java.util.Properties Properties} based configuration in addition to the parent class's String configuration.
 * <p/>
 * This class allows processing of a single .properties file for user, role, and
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/SessionManager.java`
#### Snippet
```java
     * This method is mainly used in framework development, as the implementation will often relay the argument
     * to an underlying {@link SessionFactory} which could use the context to construct the internal Session
     * instance in a specific manner.  This allows pluggable {@link org.apache.shiro.session.Session Session} creation
     * logic by simply injecting a {@code SessionFactory} into the {@code SessionManager} instance.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/SessionManager.java`
#### Snippet
```java
/**
 * A SessionManager manages the creation, maintenance, and clean-up of all application
 * {@link org.apache.shiro.session.Session Session}s.
 *
 * @since 0.1
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session.mgt` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/SessionContext.java`
#### Snippet
```java
 * {@link SessionManager SessionManager}.
 *
 * @see org.apache.shiro.session.mgt.SessionManager#start SessionManager.start(SessionContext)
 * @see org.apache.shiro.session.mgt.SessionFactory SessionFactory
 * @since 1.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session.mgt` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/SessionContext.java`
#### Snippet
```java
 *
 * @see org.apache.shiro.session.mgt.SessionManager#start SessionManager.start(SessionContext)
 * @see org.apache.shiro.session.mgt.SessionFactory SessionFactory
 * @since 1.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/AbstractNativeSessionManager.java`
#### Snippet
```java
     *
     * @param session the session that has just started that will be delivered to any
     *                {@link #setSessionListeners(java.util.Collection) registered} session listeners.
     * @see SessionListener#onStart(org.apache.shiro.session.Session)
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/AbstractNativeSessionManager.java`
#### Snippet
```java
     * @param session the session that has just started that will be delivered to any
     *                {@link #setSessionListeners(java.util.Collection) registered} session listeners.
     * @see SessionListener#onStart(org.apache.shiro.session.Session)
     */
    protected void notifyStart(Session session) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/DelegatingSession.java`
#### Snippet
```java
/**
 * A DelegatingSession is a client-tier representation of a server side
 * {@link org.apache.shiro.session.Session Session}.
 * This implementation is basically a proxy to a server-side {@link NativeSessionManager NativeSessionManager},
 * which will return the proper results for each method call.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/DelegatingSession.java`
#### Snippet
```java

    /**
     * @see org.apache.shiro.session.Session#getAttribute(Object key)
     */
    public Object getAttribute(Object attributeKey) throws InvalidSessionException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/DelegatingSession.java`
#### Snippet
```java

    /**
     * @see org.apache.shiro.session.Session#stop()
     */
    public void stop() throws InvalidSessionException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/DelegatingSession.java`
#### Snippet
```java

    /**
     * @see org.apache.shiro.session.Session#getId()
     */
    public Serializable getId() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/DelegatingSession.java`
#### Snippet
```java

    /**
     * @see org.apache.shiro.session.Session#getStartTimestamp()
     */
    public Date getStartTimestamp() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/DelegatingSession.java`
#### Snippet
```java

    /**
     * @see org.apache.shiro.session.Session#touch()
     */
    public void touch() throws InvalidSessionException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/DelegatingSession.java`
#### Snippet
```java

    /**
     * @see org.apache.shiro.session.Session#getAttributeKeys
     */
    public Collection<Object> getAttributeKeys() throws InvalidSessionException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/DelegatingSession.java`
#### Snippet
```java

    /**
     * @see org.apache.shiro.session.Session#getLastAccessTime()
     */
    public Date getLastAccessTime() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session.mgt` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/SessionValidationScheduler.java`
#### Snippet
```java
/**
 * Interface that should be implemented by classes that can control validating sessions on a regular
 * basis.  This interface is used as a delegate for session validation by the {@link org.apache.shiro.session.mgt.DefaultSessionManager}
 *
 * @see org.apache.shiro.session.mgt.DefaultSessionManager#setSessionValidationScheduler(SessionValidationScheduler)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session.mgt` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/SessionValidationScheduler.java`
#### Snippet
```java
 * basis.  This interface is used as a delegate for session validation by the {@link org.apache.shiro.session.mgt.DefaultSessionManager}
 *
 * @see org.apache.shiro.session.mgt.DefaultSessionManager#setSessionValidationScheduler(SessionValidationScheduler)
 * @since 0.1
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/NativeSessionManager.java`
#### Snippet
```java
     * @param key                 the session key to use to look up the target session.
     * @param maxIdleTimeInMillis the time in milliseconds that the associated session may remain idle before expiring.
     * @throws org.apache.shiro.session.InvalidSessionException
     *          if the session has been stopped or expired prior to calling this method.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/NativeSessionManager.java`
#### Snippet
```java
    /**
     * Returns quietly if the associated session is valid (it exists and is not stopped or expired) or throws
     * an {@link org.apache.shiro.session.InvalidSessionException} indicating that the session id is invalid.  This
     * might be preferred to be used instead of {@link #isValid} since any exception thrown will definitively explain
     * the reason for invalidation.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/NativeSessionManager.java`
#### Snippet
```java
     *
     * @param key the session key to use to look up the target session.
     * @throws org.apache.shiro.session.InvalidSessionException
     *          if the session id is invalid (it does not exist or it is stopped or expired).
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/NativeSessionManager.java`
#### Snippet
```java
     *
     * @param key the session key to use to look up the target session.
     * @throws org.apache.shiro.session.InvalidSessionException
     *          if the session has been stopped or expired prior to calling this method.
     * @see org.apache.shiro.session.Session#touch
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/NativeSessionManager.java`
#### Snippet
```java
     * @param key the session key to use to look up the target session.
     * @return the time in milliseconds that the associated session may remain idle before expiring.
     * @throws org.apache.shiro.session.InvalidSessionException
     *          if the session has been stopped or expired prior to calling this method.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/eis/SessionDAO.java`
#### Snippet
```java
     *
     * @param session the Session to update
     * @throws org.apache.shiro.session.UnknownSessionException
     *          if no existing EIS session record exists with the
     *          identifier of {@link Session#getId() session.getSessionId()}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/eis/SessionDAO.java`
#### Snippet
```java
     * etc., depending on the DAO implementation).
     * <p/>
     * After this method is invoked, the {@link org.apache.shiro.session.Session#getId()}
     * method executed on the argument must return a valid session identifier.  That is, the following should
     * always be true:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/eis/SessionDAO.java`
#### Snippet
```java
     * integrity violation constraints or other EIS related errors.
     *
     * @param session the {@link org.apache.shiro.session.Session} object to create in the EIS.
     * @return the EIS id (e.g. primary key) of the created {@code Session} object.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/eis/SessionDAO.java`
#### Snippet
```java
 * Data Access Object design pattern specification to enable {@link Session} access to an
 * EIS (Enterprise Information System).  It provides your four typical CRUD methods:
 * {@link #create}, {@link #readSession(java.io.Serializable)}, {@link #update(org.apache.shiro.session.Session)},
 * and {@link #delete(org.apache.shiro.session.Session)}.
 * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/eis/SessionDAO.java`
#### Snippet
```java
 * Data Access Object design pattern specification to enable {@link Session} access to an
 * EIS (Enterprise Information System).  It provides your four typical CRUD methods:
 * {@link #create}, {@link #readSession(java.io.Serializable)}, {@link #update(org.apache.shiro.session.Session)},
 * and {@link #delete(org.apache.shiro.session.Session)}.
 * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/eis/SessionDAO.java`
#### Snippet
```java
 * EIS (Enterprise Information System).  It provides your four typical CRUD methods:
 * {@link #create}, {@link #readSession(java.io.Serializable)}, {@link #update(org.apache.shiro.session.Session)},
 * and {@link #delete(org.apache.shiro.session.Session)}.
 * <p/>
 * The remaining {@link #getActiveSessions()} method exists as a support mechanism to preemptively orphaned sessions,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/eis/SessionDAO.java`
#### Snippet
```java
     * frequently, rather than return a massive set and validate infrequently.  If efficient and possible, it would
     * make sense to return the oldest unstopped sessions available, ordered by
     * {@link org.apache.shiro.session.Session#getLastAccessTime() lastAccessTime}.
     * <h4>Smart Results</h4>
     * <em>Ideally</em> this method would only return active sessions that the EIS was certain should be invalided.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/activedirectory/ActiveDirectoryRealm.java`
#### Snippet
```java

    /**
     * Builds an {@link org.apache.shiro.authz.AuthorizationInfo} object by querying the active directory LDAP context for the
     * groups that a user is a member of.  The groups are then translated to role names by using the
     * configured {@link #groupRolesMap}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.cache` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/DefaultSessionManager.java`
#### Snippet
```java
    /**
     * Sets the internal {@code CacheManager} on the {@code SessionDAO} if it implements the
     * {@link org.apache.shiro.cache.CacheManagerAware CacheManagerAware} interface.
     * <p/>
     * This method is called after setting a cacheManager via the
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.cache` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/DefaultSessionManager.java`
#### Snippet
```java
     * <p/>
     * This method is called after setting a cacheManager via the
     * {@link #setCacheManager(org.apache.shiro.cache.CacheManager) setCacheManager} method <em>em</em> when
     * setting a {@code SessionDAO} via the {@link #setSessionDAO} method to allow it to be propagated
     * in either case.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/DefaultSessionManager.java`
#### Snippet
```java
     * Persists the given session instance to an underlying EIS (Enterprise Information System).  This implementation
     * delegates and calls
     * <code>this.{@link SessionDAO sessionDAO}.{@link SessionDAO#create(org.apache.shiro.session.Session) create}(session);<code>
     *
     * @param session the Session instance to persist to the underlying EIS.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `core/src/main/java/org/apache/shiro/session/mgt/eis/RandomSessionIdGenerator.java`
#### Snippet
```java
    public RandomSessionIdGenerator() {
        try {
            this.random = java.security.SecureRandom.getInstance(RANDOM_NUM_GENERATOR_ALGORITHM_NAME);
        } catch (java.security.NoSuchAlgorithmException e) {
            log.debug("The SecureRandom SHA1PRNG algorithm is not available on the current platform.  Using the " +
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `core/src/main/java/org/apache/shiro/session/mgt/eis/RandomSessionIdGenerator.java`
#### Snippet
```java
        try {
            this.random = java.security.SecureRandom.getInstance(RANDOM_NUM_GENERATOR_ALGORITHM_NAME);
        } catch (java.security.NoSuchAlgorithmException e) {
            log.debug("The SecureRandom SHA1PRNG algorithm is not available on the current platform.  Using the " +
                    "platform's default SecureRandom algorithm.", e);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary, and can be replaced with an import
in `core/src/main/java/org/apache/shiro/session/mgt/eis/RandomSessionIdGenerator.java`
#### Snippet
```java
            log.debug("The SecureRandom SHA1PRNG algorithm is not available on the current platform.  Using the " +
                    "platform's default SecureRandom algorithm.", e);
            this.random = new java.security.SecureRandom();
        }
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.cache` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/eis/EnterpriseCacheSessionDAO.java`
#### Snippet
```java
/**
 * SessionDAO implementation that relies on an enterprise caching product as the EIS system of record for all sessions.
 * It is expected that an injected {@link org.apache.shiro.cache.Cache Cache} or
 * {@link org.apache.shiro.cache.CacheManager CacheManager} is backed by an enterprise caching product that can support
 * all application sessions and/or provide disk paging for resilient data storage.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session.mgt.eis` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/eis/SessionIdGenerator.java`
#### Snippet
```java
 * store, you can implement this interface and typically inject it into an {@link AbstractSessionDAO} instance.
 *
 * @see org.apache.shiro.session.mgt.eis.JavaUuidSessionIdGenerator JavaUuidSessionIdGenerator
 * @see org.apache.shiro.session.mgt.eis.RandomSessionIdGenerator RandomSessionIdGenerator
 * @since 1.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session.mgt.eis` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/eis/SessionIdGenerator.java`
#### Snippet
```java
 *
 * @see org.apache.shiro.session.mgt.eis.JavaUuidSessionIdGenerator JavaUuidSessionIdGenerator
 * @see org.apache.shiro.session.mgt.eis.RandomSessionIdGenerator RandomSessionIdGenerator
 * @since 1.0
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/eis/JavaUuidSessionIdGenerator.java`
#### Snippet
```java

/**
 * {@link SessionIdGenerator} that generates String values of JDK {@link java.util.UUID}'s as the session IDs.
 *
 * @since 1.0
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/eis/JavaUuidSessionIdGenerator.java`
#### Snippet
```java
    /**
     * Ignores the method argument and simply returns
     * {@code UUID}.{@link java.util.UUID#randomUUID() randomUUID()}.{@code toString()}.
     *
     * @param session the {@link Session} instance to which the ID will be applied.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/AbstractValidatingSessionManager.java`
#### Snippet
```java
    /**
     * Subclass template hook in case per-session timeout is not based on
     * {@link org.apache.shiro.session.Session#getTimeout()}.
     * <p/>
     * <p>This implementation merely returns {@link org.apache.shiro.session.Session#getTimeout()}</p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/AbstractValidatingSessionManager.java`
#### Snippet
```java
     * {@link org.apache.shiro.session.Session#getTimeout()}.
     * <p/>
     * <p>This implementation merely returns {@link org.apache.shiro.session.Session#getTimeout()}</p>
     *
     * @param session the session for which to determine session timeout.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session.mgt.eis` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/eis/AbstractSessionDAO.java`
#### Snippet
```java
    /**
     * Default no-arg constructor that defaults the {@link #setSessionIdGenerator sessionIdGenerator} to be a
     * {@link org.apache.shiro.session.mgt.eis.JavaUuidSessionIdGenerator}.
     */
    public AbstractSessionDAO() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/eis/AbstractSessionDAO.java`
#### Snippet
```java
     * @param session the Session instance to persist to the EIS.
     * @return the id of the session created in the EIS (i.e. this is almost always a primary key and should be the
     *         value returned from {@link org.apache.shiro.session.Session#getId() Session.getId()}.
     */
    protected abstract Serializable doCreate(Session session);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/eis/AbstractSessionDAO.java`
#### Snippet
```java

    /**
     * Returns the {@code SessionIdGenerator} used by the {@link #generateSessionId(org.apache.shiro.session.Session)}
     * method.  Unless overridden by the {@link #setSessionIdGenerator(SessionIdGenerator)} method, the default instance
     * is a {@link JavaUuidSessionIdGenerator}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/eis/AbstractSessionDAO.java`
#### Snippet
```java
     * is a {@link JavaUuidSessionIdGenerator}.
     *
     * @return the {@code SessionIdGenerator} used by the {@link #generateSessionId(org.apache.shiro.session.Session)}
     *         method.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/eis/AbstractSessionDAO.java`
#### Snippet
```java

    /**
     * Sets the {@code SessionIdGenerator} used by the {@link #generateSessionId(org.apache.shiro.session.Session)}
     * method.  Unless overridden by this method, the default instance ss a {@link JavaUuidSessionIdGenerator}.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/eis/AbstractSessionDAO.java`
#### Snippet
```java
     *
     * @param sessionIdGenerator the {@code SessionIdGenerator} to use in the
     *                           {@link #generateSessionId(org.apache.shiro.session.Session)} method.
     */
    public void setSessionIdGenerator(SessionIdGenerator sessionIdGenerator) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/eis/AbstractSessionDAO.java`
#### Snippet
```java
    /**
     * Optional SessionIdGenerator instance available to subclasses via the
     * {@link #generateSessionId(org.apache.shiro.session.Session)} method.
     */
    private SessionIdGenerator sessionIdGenerator;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/eis/AbstractSessionDAO.java`
#### Snippet
```java
    /**
     * Retrieves the Session object from the underlying EIS identified by <tt>sessionId</tt> by delegating to
     * the {@link #doReadSession(java.io.Serializable)} method.  If {@code null} is returned from that method, an
     * {@link UnknownSessionException} will be thrown.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/eis/AbstractSessionDAO.java`
#### Snippet
```java
 * optional, as the default generator is probably sufficient for most cases.  Subclass implementations that do use a
 * generator (default or custom) will want to call the
 * {@link #generateSessionId(org.apache.shiro.session.Session)} method from within their {@link #doCreate}
 * implementations.
 * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/SubjectContext.java`
#### Snippet
```java
/**
 * A {@code SubjectContext} is a 'bucket' of data presented to a {@link SecurityManager} which interprets
 * this data to construct {@link org.apache.shiro.subject.Subject Subject} instances.  It is essentially a Map of data
 * with a few additional type-safe methods for easy retrieval of objects commonly used to construct Subject instances.
 * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.session` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/session/mgt/eis/CachingSessionDAO.java`
#### Snippet
```java
    /**
     * Updates the state of the given session to the EIS by first delegating to
     * {@link #doUpdate(org.apache.shiro.session.Session)}.  If the session is a {@link ValidatingSession}, it will
     * be added to the cache only if it is {@link ValidatingSession#isValid()} and if invalid, will be removed from the
     * cache.  If it is not a {@code ValidatingSession} instance, it will be added to the cache in any event.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/SimplePrincipalCollection.java`
#### Snippet
```java
     * <p/>
     * The 'first available principal' is interpreted as the principal that would be returned by
     * <code>{@link #iterator() iterator()}.{@link java.util.Iterator#next() next()}.</code>
     *
     * @inheritDoc
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
     * Returns {@code true} if this Subject implies all of the specified permission strings, {@code false} otherwise.
     * <p/>
     * This is an overloaded method for the corresponding type-safe {@link org.apache.shiro.authz.Permission Permission}
     * variant.  Please see the class-level JavaDoc for more information on these String-based permission methods.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
        /**
         * Ensures the {@code Subject} being built will be considered
         * {@link org.apache.shiro.subject.Subject#isAuthenticated() authenticated}.  Per the
         * {@link org.apache.shiro.subject.Subject#isAuthenticated() isAuthenticated()} JavaDoc, be careful
         * when specifying {@code true} - you should know what you are doing and have a good reason for ignoring Shiro's
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
         * Ensures the {@code Subject} being built will be considered
         * {@link org.apache.shiro.subject.Subject#isAuthenticated() authenticated}.  Per the
         * {@link org.apache.shiro.subject.Subject#isAuthenticated() isAuthenticated()} JavaDoc, be careful
         * when specifying {@code true} - you should know what you are doing and have a good reason for ignoring Shiro's
         * default authentication state mechanisms.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
         * @param authenticated whether or not the built {@code Subject} will be considered authenticated.
         * @return this {@code Builder} instance for method chaining.
         * @see org.apache.shiro.subject.Subject#isAuthenticated()
         */
        public Builder authenticated(boolean authenticated) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authc` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
     * @param token the token encapsulating the subject's principals and credentials to be passed to the
     *              Authentication subsystem for verification.
     * @throws org.apache.shiro.authc.AuthenticationException
     *          if the authentication attempt fails.
     * @since 0.9
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
     * doesn't require a collection as a an argument.
     * Asserts this Subject has all of the specified roles by returning quietly if they do or throwing an
     * {@link org.apache.shiro.authz.AuthorizationException} if they do not.
     *
     * @param roleIdentifiers roleIdentifiers the application-specific role identifiers to check (usually role ids or role names).
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
         * way:
         * <pre>
         * PrincipalCollection identity = new {@link org.apache.shiro.subject.SimplePrincipalCollection#SimplePrincipalCollection(Object, String) SimplePrincipalCollection}(&quot;jsmith&quot;, &quot;myRealm&quot;);
         * Subject jsmith = new Subject.Builder().principals(identity).buildSubject();</pre>
         * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
         * <pre>
         * long userId = //get user ID from somewhere
         * PrincipalCollection userIdentity = new {@link org.apache.shiro.subject.SimplePrincipalCollection#SimplePrincipalCollection(Object, String) SimplePrincipalCollection}(<em>userId</em>, &quot;jdbcRealm&quot;);
         * Subject user = new Subject.Builder().principals(identity).buildSubject();</pre>
         *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
     * <p/>
     * Most implementations will simply return
     * <code>{@link #getPrincipals()}.{@link org.apache.shiro.subject.PrincipalCollection#getPrimaryPrincipal() getPrimaryPrincipal()}</code>
     *
     * @return this Subject's application-specific unique identity.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
     *
     * @return this Subject's application-specific unique identity.
     * @see org.apache.shiro.subject.PrincipalCollection#getPrimaryPrincipal()
     */
    Object getPrincipal();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
     * @return all of this Subject's principals (identifying attributes).
     * @see #getPrincipal()
     * @see org.apache.shiro.subject.PrincipalCollection#getPrimaryPrincipal()
     */
    PrincipalCollection getPrincipals();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
     * *Note that if you need a return value to be returned as a result of the runnable's execution or if you need to
     * react to any Exceptions, it is highly recommended to use the
     * {@link #associateWith(java.util.concurrent.Callable) createCallable} method instead of this one.
     *
     * @param runnable the runnable to execute as this {@code Subject}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
    /**
     * Asserts this Subject has all of the specified roles by returning quietly if they do or throwing an
     * {@link org.apache.shiro.authz.AuthorizationException} if they do not.
     *
     * @param roleIdentifiers the application-specific role identifiers to check (usually role ids or role names).
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
     *
     * @param roleIdentifiers the application-specific role identifiers to check (usually role ids or role names).
     * @throws org.apache.shiro.authz.AuthorizationException
     *          if this Subject does not have all of the specified roles.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
    /**
     * Asserts this Subject has the specified role by returning quietly if they do or throwing an
     * {@link org.apache.shiro.authz.AuthorizationException} if they do not.
     *
     * @param roleIdentifier the application-specific role identifier (usually a role id or role name ).
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
     *
     * @param roleIdentifier the application-specific role identifier (usually a role id or role name ).
     * @throws org.apache.shiro.authz.AuthorizationException
     *          if this Subject does not have the role.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
     * <p/>
     * If this subject's existing associated permissions do not {@link Permission#implies(Permission) imply}
     * the given permission, an {@link org.apache.shiro.authz.AuthorizationException} will be thrown.
     *
     * @param permission the Permission to check.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
     *
     * @param permission the Permission to check.
     * @throws org.apache.shiro.authz.AuthorizationException
     *          if this Subject does not have the permission.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
        /**
         * Constructs a new {@link Subject.Builder} instance, using the {@code SecurityManager} instance available
         * to the calling code as determined by a call to {@link org.apache.shiro.SecurityUtils#getSecurityManager()}
         * to build the {@code Subject} instance.
         */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
     * <b>Note*</b> that the returned {@code Subject} instance is <b>not</b> automatically bound to the application (thread)
     * for further use.  That is,
     * {@link org.apache.shiro.SecurityUtils SecurityUtils}.{@link org.apache.shiro.SecurityUtils#getSubject() getSubject()}
     * will not automatically return the same instance as what is returned by the builder.  It is up to the framework
     * developer to bind the built {@code Subject} for continued use if desired.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
     * <b>Note*</b> that the returned {@code Subject} instance is <b>not</b> automatically bound to the application (thread)
     * for further use.  That is,
     * {@link org.apache.shiro.SecurityUtils SecurityUtils}.{@link org.apache.shiro.SecurityUtils#getSubject() getSubject()}
     * will not automatically return the same instance as what is returned by the builder.  It is up to the framework
     * developer to bind the built {@code Subject} for continued use if desired.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
         * <b>Note</b> that the returned {@code Subject} instance is <b>not</b> automatically bound to the application
         * (thread) for further use.  That is,
         * {@link org.apache.shiro.SecurityUtils SecurityUtils}.{@link org.apache.shiro.SecurityUtils#getSubject() getSubject()}
         * will not automatically return the same instance as what is returned by the builder.  It is up to the
         * framework developer to bind the returned {@code Subject} for continued use if desired.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
         * <b>Note</b> that the returned {@code Subject} instance is <b>not</b> automatically bound to the application
         * (thread) for further use.  That is,
         * {@link org.apache.shiro.SecurityUtils SecurityUtils}.{@link org.apache.shiro.SecurityUtils#getSubject() getSubject()}
         * will not automatically return the same instance as what is returned by the builder.  It is up to the
         * framework developer to bind the returned {@code Subject} for continued use if desired.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
    /**
     * Ensures this Subject
     * {@link org.apache.shiro.authz.Permission#implies(org.apache.shiro.authz.Permission) implies} all of the
     * specified permission strings.
     * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
    /**
     * Ensures this Subject
     * {@link org.apache.shiro.authz.Permission#implies(org.apache.shiro.authz.Permission) implies} all of the
     * specified permission strings.
     * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
     * <p/>
     * If this subject's existing associated permissions do not
     * {@link org.apache.shiro.authz.Permission#implies(org.apache.shiro.authz.Permission) imply} all of the given permissions,
     * an {@link org.apache.shiro.authz.AuthorizationException} will be thrown.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
     * <p/>
     * If this subject's existing associated permissions do not
     * {@link org.apache.shiro.authz.Permission#implies(org.apache.shiro.authz.Permission) imply} all of the given permissions,
     * an {@link org.apache.shiro.authz.AuthorizationException} will be thrown.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
     * If this subject's existing associated permissions do not
     * {@link org.apache.shiro.authz.Permission#implies(org.apache.shiro.authz.Permission) imply} all of the given permissions,
     * an {@link org.apache.shiro.authz.AuthorizationException} will be thrown.
     *
     * @param permissions the Permissions to check.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
     * <p/>
     * If this subject's existing associated permissions do not {@link Permission#implies(Permission)} imply}
     * the given permission, an {@link org.apache.shiro.authz.AuthorizationException} will be thrown.
     * <p/>
     * This is an overloaded method for the corresponding type-safe {@link Permission Permission} variant.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
     *
     * @param permission the String representation of the Permission to check.
     * @throws org.apache.shiro.authz.AuthorizationException
     *          if the user does not have the permission.
     * @since 0.9
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
    /**
     * Ensures this Subject
     * {@link org.apache.shiro.authz.Permission#implies(org.apache.shiro.authz.Permission) implies} all of the
     * specified permission strings.
     * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
    /**
     * Ensures this Subject
     * {@link org.apache.shiro.authz.Permission#implies(org.apache.shiro.authz.Permission) implies} all of the
     * specified permission strings.
     * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
     * <p/>
     * If this subject's existing associated permissions do not
     * {@link org.apache.shiro.authz.Permission#implies(org.apache.shiro.authz.Permission) imply} all of the given permissions,
     * an {@link org.apache.shiro.authz.AuthorizationException} will be thrown.
     * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
     * <p/>
     * If this subject's existing associated permissions do not
     * {@link org.apache.shiro.authz.Permission#implies(org.apache.shiro.authz.Permission) imply} all of the given permissions,
     * an {@link org.apache.shiro.authz.AuthorizationException} will be thrown.
     * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
     * If this subject's existing associated permissions do not
     * {@link org.apache.shiro.authz.Permission#implies(org.apache.shiro.authz.Permission) imply} all of the given permissions,
     * an {@link org.apache.shiro.authz.AuthorizationException} will be thrown.
     * <p/>
     * This is an overloaded method for the corresponding type-safe {@link Permission Permission} variant.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/Subject.java`
#### Snippet
```java
 * {@code SecurityUtils}:
 * <pre>
 * {@link SecurityUtils SecurityUtils}.{@link org.apache.shiro.SecurityUtils#getSubject() getSubject()}</pre>
 * Almost all security operations should be performed with the {@code Subject} returned from this method.
 * <h3>Permission methods</h3>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `lang/src/main/java/org/apache/shiro/lang/ShiroException.java`
#### Snippet
```java
/**
 * Root exception for all Shiro runtime exceptions.  This class is used as the root instead
 * of {@link java.lang.SecurityException} to remove the potential for conflicts;  many other
 * frameworks and products (such as J2EE containers) perform special operations when
 * encountering {@link java.lang.SecurityException}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `lang/src/main/java/org/apache/shiro/lang/ShiroException.java`
#### Snippet
```java
 * of {@link java.lang.SecurityException} to remove the potential for conflicts;  many other
 * frameworks and products (such as J2EE containers) perform special operations when
 * encountering {@link java.lang.SecurityException}.
 *
 * @since 0.1
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/concurrent/SubjectAwareExecutorService.java`
#### Snippet
```java
 * {@link Runnable} or {@link Callable} instances with the {@link #getSubject currently available subject} and then
 * dispatch the Subject-enabled runnable or callable to an underlying delegate
 * {@link java.util.concurrent.ExecutorService ExecutorService} instance.  The principle is the same as the
 * parent {@link SubjectAwareExecutor} class, but enables the richer {@link ExecutorService} API.
 * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/subject/support/SubjectCallable.java`
#### Snippet
```java
 * <li>The specified Subject any of its associated thread state is first bound to the thread that executes the
 * {@code Callable}.</li>
 * <li>The delegate/target {@code Callable} is {@link java.util.concurrent.Callable#call() executed}</li>
 * <li>The previous thread state that might have existed before the {@code Subject} was bound is fully restored</li>
 * </ol>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.lang.util` is unnecessary and can be removed
in `lang/src/main/java/org/apache/shiro/lang/util/LifecycleUtils.java`
#### Snippet
```java

/**
 * Utility class to help call {@link org.apache.shiro.lang.util.Initializable#init() Initializable.init()} and
 * {@link org.apache.shiro.lang.util.Destroyable#destroy() Destroyable.destroy()} methods cleanly on any object.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.lang.util` is unnecessary and can be removed
in `lang/src/main/java/org/apache/shiro/lang/util/LifecycleUtils.java`
#### Snippet
```java
/**
 * Utility class to help call {@link org.apache.shiro.lang.util.Initializable#init() Initializable.init()} and
 * {@link org.apache.shiro.lang.util.Destroyable#destroy() Destroyable.destroy()} methods cleanly on any object.
 *
 * @since 0.2
```

### UnnecessaryFullyQualifiedName
Qualifier `java.beans` is unnecessary and can be removed
in `lang/src/main/java/org/apache/shiro/lang/io/XmlSerializer.java`
#### Snippet
```java
    /**
     * Serializes the specified <code>source</code> into a byte[] array by using the
     * {@link java.beans.XMLEncoder XMLEncoder} to encode the object out to a
     * {@link java.io.ByteArrayOutputStream ByteArrayOutputStream}, where the resulting byte[] array is returned.
     * @param source the Object to convert into a byte[] array.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `lang/src/main/java/org/apache/shiro/lang/io/XmlSerializer.java`
#### Snippet
```java
     * Serializes the specified <code>source</code> into a byte[] array by using the
     * {@link java.beans.XMLEncoder XMLEncoder} to encode the object out to a
     * {@link java.io.ByteArrayOutputStream ByteArrayOutputStream}, where the resulting byte[] array is returned.
     * @param source the Object to convert into a byte[] array.
     * @return the byte[] array representation of the XML encoded output.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.beans` is unnecessary and can be removed
in `lang/src/main/java/org/apache/shiro/lang/io/XmlSerializer.java`
#### Snippet
```java
/**
 * Serializer implementation that uses the JavaBeans
 * {@link java.beans.XMLEncoder XMLEncoder} and {@link java.beans.XMLDecoder XMLDecoder} to serialize
 * and deserialize, respectively.
 * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.beans` is unnecessary and can be removed
in `lang/src/main/java/org/apache/shiro/lang/io/XmlSerializer.java`
#### Snippet
```java
/**
 * Serializer implementation that uses the JavaBeans
 * {@link java.beans.XMLEncoder XMLEncoder} and {@link java.beans.XMLDecoder XMLDecoder} to serialize
 * and deserialize, respectively.
 * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `lang/src/main/java/org/apache/shiro/lang/io/XmlSerializer.java`
#### Snippet
```java
    /**
     * Deserializes the specified <code>serialized</code> source back into an Object by using a
     * {@link java.io.ByteArrayInputStream ByteArrayInputStream} to wrap the argument and then decode this
     * stream via an {@link java.beans.XMLDecoder XMLDecoder}, where the
     * {@link java.beans.XMLDecoder#readObject() readObject} call results in the original Object to return.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.beans` is unnecessary and can be removed
in `lang/src/main/java/org/apache/shiro/lang/io/XmlSerializer.java`
#### Snippet
```java
     * Deserializes the specified <code>serialized</code> source back into an Object by using a
     * {@link java.io.ByteArrayInputStream ByteArrayInputStream} to wrap the argument and then decode this
     * stream via an {@link java.beans.XMLDecoder XMLDecoder}, where the
     * {@link java.beans.XMLDecoder#readObject() readObject} call results in the original Object to return.
     * @param serialized the byte[] array representation of the XML encoded output.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.beans` is unnecessary and can be removed
in `lang/src/main/java/org/apache/shiro/lang/io/XmlSerializer.java`
#### Snippet
```java
     * {@link java.io.ByteArrayInputStream ByteArrayInputStream} to wrap the argument and then decode this
     * stream via an {@link java.beans.XMLDecoder XMLDecoder}, where the
     * {@link java.beans.XMLDecoder#readObject() readObject} call results in the original Object to return.
     * @param serialized the byte[] array representation of the XML encoded output.
     * @return the original source Object in reconstituted form.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `lang/src/main/java/org/apache/shiro/lang/util/StringUtils.java`
#### Snippet
```java
     * @return <code>true</code> if the String is not <code>null</code>, its length is
     *         greater than 0, and it does not contain whitespace only
     * @see java.lang.Character#isWhitespace
     */
    public static boolean hasText(String str) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `lang/src/main/java/org/apache/shiro/lang/util/StringUtils.java`
#### Snippet
```java
     * @return an array of the tokens (<code>null</code> if the input String
     *         was <code>null</code>)
     * @see java.util.StringTokenizer
     * @see java.lang.String#trim()
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `lang/src/main/java/org/apache/shiro/lang/util/StringUtils.java`
#### Snippet
```java
     *         was <code>null</code>)
     * @see java.util.StringTokenizer
     * @see java.lang.String#trim()
     */
    @SuppressWarnings({"unchecked"})
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `lang/src/main/java/org/apache/shiro/lang/util/StringUtils.java`
#### Snippet
```java
     * @param prefix the prefix to look for
     * @return <code>true</code> starts with the specified prefix (ignoring case), <code>false</code> if it does not.
     * @see java.lang.String#startsWith
     */
    public static boolean startsWithIgnoreCase(String str, String prefix) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `lang/src/main/java/org/apache/shiro/lang/util/StringUtils.java`
#### Snippet
```java
     *                   (each of those characters is individually considered as delimiter).
     * @return an array of the tokens
     * @see java.util.StringTokenizer
     * @see java.lang.String#trim()
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `lang/src/main/java/org/apache/shiro/lang/util/StringUtils.java`
#### Snippet
```java
     * @return an array of the tokens
     * @see java.util.StringTokenizer
     * @see java.lang.String#trim()
     */
    public static String[] tokenizeToStringArray(String str, String delimiters) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthorizingRealm.java`
#### Snippet
```java
     * <p/>
     * After this method is called, the next authorization check for that same account will result in a call to
     * {@link #getAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection) getAuthorizationInfo}, and the
     * resulting return value will be cached before being returned so it can be reused for later authorization checks.
     * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthorizingRealm.java`
#### Snippet
```java
     * <p/>
     * If you wish to clear out all associated cached data (and not just authorization data), use the
     * {@link #clearCache(org.apache.shiro.subject.PrincipalCollection)} method instead (which will in turn call this
     * method by default).
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthorizingRealm.java`
#### Snippet
```java
 * This implementation will perform all role and permission checks automatically (and subclasses do not have to
 * write this logic) as long as the
 * {@link #getAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection)} method returns an
 * {@link AuthorizationInfo}.  Please see that method's JavaDoc for an in-depth explanation.
 * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthorizingRealm.java`
#### Snippet
```java
 * implement the remaining Realm interface methods directly.  You might do this if you want have better control
 * over how the Role and Permission checks occur for your specific data source.  However, using AuthorizationInfo
 * (and its default implementation {@link org.apache.shiro.authz.SimpleAuthorizationInfo SimpleAuthorizationInfo}) is sufficient in the large
 * majority of Realm cases.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthorizingRealm.java`
#### Snippet
```java
 * majority of Realm cases.
 *
 * @see org.apache.shiro.authz.SimpleAuthorizationInfo
 * @since 0.2
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.cache` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthorizingRealm.java`
#### Snippet
```java
    /**
     * Returns {@code true} if authorization caching should be utilized if a {@link CacheManager} has been
     * {@link #setCacheManager(org.apache.shiro.cache.CacheManager) configured}, {@code false} otherwise.
     * <p/>
     * The default value is {@code true}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthorizingRealm.java`
#### Snippet
```java
    /**
     * Calls {@code super.doClearCache} to ensure any cached authentication data is removed and then calls
     * {@link #clearCachedAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection)} to remove any cached
     * authorization data.
     * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.cache` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthorizingRealm.java`
#### Snippet
```java
     * {@code cache}, and this newly created cache which will be used as specified in #1.</li>
     * <li>If neither the {@link #setAuthorizationCache (org.apache.shiro.cache.Cache) cache}
     * or {@link #setCacheManager(org.apache.shiro.cache.CacheManager) cacheManager}
     * properties are set, caching will be disabled and authorization look-ups will be delegated to
     * subclass implementations for each authorization check.</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthorizingRealm.java`
#### Snippet
```java
     * This implementation obtains the actual {@code AuthorizationInfo} object from the subclass's
     * implementation of
     * {@link #doGetAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection) doGetAuthorizationInfo}, and then
     * caches it for efficient reuse if caching is enabled (see below).
     * <p/>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthorizingRealm.java`
#### Snippet
```java
     * {@code AuthorizationInfo} immediately.  If caching is disabled, or there is a cache miss, the authorization
     * info will be looked up from the underlying data store via the
     * {@link #doGetAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection)} method, which must be implemented
     * by subclasses.
     * <h4>Changed Data</h4>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.subject` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthorizingRealm.java`
#### Snippet
```java
     * runtime, such as adding or removing roles and/or permissions, the subclass implementation should clear the
     * cached AuthorizationInfo for that account via the
     * {@link #clearCachedAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection) clearCachedAuthorizationInfo}
     * method.  This ensures that the next call to {@code getAuthorizationInfo(PrincipalCollection)} will
     * acquire the account's fresh authorization data, where it will then be cached for efficient reuse.  This
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.cache` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthorizingRealm.java`
#### Snippet
```java
    /**
     * Sets whether or not authorization caching should be utilized if a {@link CacheManager} has been
     * {@link #setCacheManager(org.apache.shiro.cache.CacheManager) configured}, {@code false} otherwise.
     * <p/>
     * The default value is {@code true}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthorizingRealm.java`
#### Snippet
```java
     * Retrieves the AuthorizationInfo for the given principals from the underlying data store.  When returning
     * an instance from this method, you might want to consider using an instance of
     * {@link org.apache.shiro.authz.SimpleAuthorizationInfo SimpleAuthorizationInfo}, as it is suitable in most cases.
     *
     * @param principals the primary identifying principals of the AuthorizationInfo that should be retrieved.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.shiro.authz` is unnecessary and can be removed
in `core/src/main/java/org/apache/shiro/realm/AuthorizingRealm.java`
#### Snippet
```java
     * @param principals the primary identifying principals of the AuthorizationInfo that should be retrieved.
     * @return the AuthorizationInfo associated with this principals.
     * @see org.apache.shiro.authz.SimpleAuthorizationInfo
     */
    protected abstract AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals);
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `samples/aspectj/src/main/java/org/apache/shiro/samples/aspectj/bank/BankServerRunner.java`
#### Snippet
```java

        } catch (Exception e) {
            e.printStackTrace();
        }

```

## RuleId[id=SamePackageImport]
### SamePackageImport
Unnecessary import from the same package `import org.apache.shiro.lang.util.ByteSource;`
in `lang/src/main/java/org/apache/shiro/lang/util/ByteSourceWrapper.java`
#### Snippet
```java
package org.apache.shiro.lang.util;

import org.apache.shiro.lang.util.ByteSource;

import java.io.Closeable;
```

## RuleId[id=ReplaceNullCheck]
### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElseGet()'
in `config/core/src/main/java/org/apache/shiro/config/Ini.java`
#### Snippet
```java
                props = new LinkedHashMap<String,String>();
            }
            if ( props != null ) {
                this.props = props;
            } else {
```

### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElseGet()'
in `core/src/main/java/org/apache/shiro/authc/AbstractAuthenticator.java`
#### Snippet
```java
    @SuppressWarnings({"UnusedDeclaration"})
    public void setAuthenticationListeners(Collection<AuthenticationListener> listeners) {
        if (listeners == null) {
            this.listeners = new ArrayList<AuthenticationListener>();
        } else {
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractCryptHash()` of an abstract class should not be declared 'public'
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/AbstractCryptHash.java`
#### Snippet
```java
     * @throws IllegalArgumentException if the salt is not the same size as {@link #getSaltLength()}.
     */
    public AbstractCryptHash(final String algorithmName, final byte[] hashedData, final ByteSource salt) {
        this.algorithmName = algorithmName;
        this.hashedData = Arrays.copyOf(hashedData, hashedData.length);
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractHash()` of an abstract class should not be declared 'public'
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/AbstractHash.java`
#### Snippet
```java
     * @throws CodecException if either Object constructor argument cannot be converted into a byte array.
     */
    public AbstractHash(Object source, Object salt, int hashIterations) throws CodecException {
        byte[] sourceBytes = toBytes(source);
        byte[] saltBytes = null;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractHash()` of an abstract class should not be declared 'public'
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/AbstractHash.java`
#### Snippet
```java
     * @throws CodecException if the specified {@code source} cannot be converted into a byte array (byte[]).
     */
    public AbstractHash(Object source) throws CodecException {
        this(source, null, 1);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractHash()` of an abstract class should not be declared 'public'
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/AbstractHash.java`
#### Snippet
```java
     * fully-initialized instance.
     */
    public AbstractHash() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractHash()` of an abstract class should not be declared 'public'
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/AbstractHash.java`
#### Snippet
```java
     * @throws CodecException if either constructor argument cannot be converted into a byte array.
     */
    public AbstractHash(Object source, Object salt) throws CodecException {
        this(source, salt, 1);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractCacheManager()` of an abstract class should not be declared 'public'
in `cache/src/main/java/org/apache/shiro/cache/AbstractCacheManager.java`
#### Snippet
```java
     * Default no-arg constructor that instantiates an internal name-to-cache {@code ConcurrentMap}.
     */
    public AbstractCacheManager() {
        this.caches = new ConcurrentHashMap<String, Cache>();
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `PermissionTag()` of an abstract class should not be declared 'public'
in `web/src/main/java/org/apache/shiro/web/tags/PermissionTag.java`
#### Snippet
```java
    private String name = null;

    public PermissionTag() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `RoleTag()` of an abstract class should not be declared 'public'
in `web/src/main/java/org/apache/shiro/web/tags/RoleTag.java`
#### Snippet
```java
    private String name = null;

    public RoleTag() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `SecureTag()` of an abstract class should not be declared 'public'
in `web/src/main/java/org/apache/shiro/web/tags/SecureTag.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(SecureTag.class);

    public SecureTag() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `Event()` of an abstract class should not be declared 'public'
in `event/src/main/java/org/apache/shiro/event/Event.java`
#### Snippet
```java
    private final long timestamp; //millis since Epoch (UTC time zone).

    public Event(Object source) {
        super(source);
        this.timestamp = System.currentTimeMillis();
```

### NonProtectedConstructorInAbstractClass
Constructor `SecureTagHandler()` of an abstract class should not be declared 'public'
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/faces/tags/SecureTagHandler.java`
#### Snippet
```java
 */
public abstract class SecureTagHandler extends TagHandler {
    public SecureTagHandler(TagConfig config) {
        super(config);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `PermissionTagHandler()` of an abstract class should not be declared 'public'
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/faces/tags/PermissionTagHandler.java`
#### Snippet
```java
    private final TagAttribute name;

    public PermissionTagHandler(TagConfig config) {
        super(config);
        this.name = this.getRequiredAttribute("name");
```

### NonProtectedConstructorInAbstractClass
Constructor `AuthenticationTagHandler()` of an abstract class should not be declared 'public'
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/faces/tags/AuthenticationTagHandler.java`
#### Snippet
```java
@Slf4j
public abstract class AuthenticationTagHandler extends SecureTagHandler {
    public AuthenticationTagHandler(TagConfig config) {
        super(config);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `BeanEvent()` of an abstract class should not be declared 'public'
in `config/ogdl/src/main/java/org/apache/shiro/config/ogdl/event/BeanEvent.java`
#### Snippet
```java
    private final Map<String, Object> beanContext;

    public BeanEvent(final String beanName, final Object bean, final Map<String, Object> beanContext) {
        super(bean);
        this.beanName = beanName;
```

### NonProtectedConstructorInAbstractClass
Constructor `DataAccessException()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/shiro/dao/DataAccessException.java`
#### Snippet
```java
     * @param cause   the root cause of the exception, typically an API-specific exception
     */
    public DataAccessException(String message, Throwable cause) {
        super(message, cause);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `DataAccessException()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/shiro/dao/DataAccessException.java`
#### Snippet
```java
     * @param message the message explaining the cause of the exception
     */
    public DataAccessException(String message) {
        super(message);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `MethodInterceptorSupport()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/shiro/aop/MethodInterceptorSupport.java`
#### Snippet
```java
     * Default no-argument constructor for subclasses.
     */
    public MethodInterceptorSupport() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `AnnotationHandler()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/shiro/aop/AnnotationHandler.java`
#### Snippet
```java
     * @param annotationClass the type of annotation this handler will process.
     */
    public AnnotationHandler(Class<? extends Annotation> annotationClass) {
        setAnnotationClass(annotationClass);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AnnotationMethodInterceptor()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/shiro/aop/AnnotationMethodInterceptor.java`
#### Snippet
```java
     * @since 1.1
     */
    public AnnotationMethodInterceptor(AnnotationHandler handler, AnnotationResolver resolver) {
        if (handler == null) {
            throw new IllegalArgumentException("AnnotationHandler argument cannot be null.");
```

### NonProtectedConstructorInAbstractClass
Constructor `AnnotationMethodInterceptor()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/shiro/aop/AnnotationMethodInterceptor.java`
#### Snippet
```java
     * @param handler the handler to delegate to for processing the annotation.
     */
    public AnnotationMethodInterceptor(AnnotationHandler handler) {
        this(handler, new DefaultAnnotationResolver());
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `SessionsSecurityManager()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/shiro/mgt/SessionsSecurityManager.java`
#### Snippet
```java
     * instance.
     */
    public SessionsSecurityManager() {
        super();
        this.sessionManager = new DefaultSessionManager();
```

### NonProtectedConstructorInAbstractClass
Constructor `CachingSecurityManager()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/shiro/mgt/CachingSecurityManager.java`
#### Snippet
```java
     * Default no-arg constructor that will automatically attempt to initialize a default cacheManager
     */
    public CachingSecurityManager() {
        //use a default event bus:
        setEventBus(new DefaultEventBus());
```

### NonProtectedConstructorInAbstractClass
Constructor `AuthenticatingSecurityManager()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/shiro/mgt/AuthenticatingSecurityManager.java`
#### Snippet
```java
     * {@link org.apache.shiro.authc.pam.ModularRealmAuthenticator ModularRealmAuthenticator}.
     */
    public AuthenticatingSecurityManager() {
        super();
        this.authenticator = new ModularRealmAuthenticator();
```

### NonProtectedConstructorInAbstractClass
Constructor `RealmSecurityManager()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/shiro/mgt/RealmSecurityManager.java`
#### Snippet
```java
     * Default no-arg constructor.
     */
    public RealmSecurityManager() {
        super();
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractFactory()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/shiro/util/AbstractFactory.java`
#### Snippet
```java
    private T singletonInstance;

    public AbstractFactory() {
        this.singleton = true;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractRememberMeManager()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/shiro/mgt/AbstractRememberMeManager.java`
#### Snippet
```java
     * @since 2.0
     */
    public AbstractRememberMeManager(Supplier<byte[]> keySupplier) {
        this();
        setCipherKey(keySupplier.get());
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractRememberMeManager()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/shiro/mgt/AbstractRememberMeManager.java`
#### Snippet
```java
     * an {@link AesCipherService} as the {@link #getCipherService() cipherService}.
     */
    public AbstractRememberMeManager() {
        setCipherKey(((AesCipherService) cipherService).generateNewKey().getEncoded());
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AuthorizingSecurityManager()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/shiro/mgt/AuthorizingSecurityManager.java`
#### Snippet
```java
     * {@link org.apache.shiro.authz.ModularRealmAuthorizer ModularRealmAuthorizer}.
     */
    public AuthorizingSecurityManager() {
        super();
        this.authorizer = new ModularRealmAuthorizer();
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractAuthenticator()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/shiro/authc/AbstractAuthenticator.java`
#### Snippet
```java
     * {@link AuthenticationListener AuthenticationListener} collection is a non-null {@code ArrayList}.
     */
    public AbstractAuthenticator() {
        listeners = new ArrayList<AuthenticationListener>();
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ShiroWebModule()` of an abstract class should not be declared 'public'
in `support/guice/src/main/java/org/apache/shiro/guice/web/ShiroWebModule.java`
#### Snippet
```java
    private final ServletContext servletContext;

    public ShiroWebModule(ServletContext servletContext) {
        this.servletContext = servletContext;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AnnotationsAuthorizingMethodInterceptor()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/shiro/authz/aop/AnnotationsAuthorizingMethodInterceptor.java`
#### Snippet
```java
     * support role and permission annotations.
     */
    public AnnotationsAuthorizingMethodInterceptor() {
        methodInterceptors = new ArrayList<AuthorizingAnnotationMethodInterceptor>(5);
        methodInterceptors.add(new RoleAnnotationMethodInterceptor());
```

### NonProtectedConstructorInAbstractClass
Constructor `AuthorizingAnnotationHandler()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/shiro/authz/aop/AuthorizingAnnotationHandler.java`
#### Snippet
```java
     * @param annotationClass the type of annotation this handler will process.
     */
    public AuthorizingAnnotationHandler(Class<? extends Annotation> annotationClass) {
        super(annotationClass);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AuthorizingAnnotationMethodInterceptor()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/shiro/authz/aop/AuthorizingAnnotationMethodInterceptor.java`
#### Snippet
```java
     * @since 1.1
     */
    public AuthorizingAnnotationMethodInterceptor( AuthorizingAnnotationHandler handler,
                                                   AnnotationResolver resolver) {
        super(handler, resolver);
```

### NonProtectedConstructorInAbstractClass
Constructor `AuthorizingAnnotationMethodInterceptor()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/shiro/authz/aop/AuthorizingAnnotationMethodInterceptor.java`
#### Snippet
```java
     * supported annotation is encountered.
     */
    public AuthorizingAnnotationMethodInterceptor( AuthorizingAnnotationHandler handler ) {
        super(handler);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `CachingRealm()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/shiro/realm/CachingRealm.java`
#### Snippet
```java
     * if specific caching is enabled.
     */
    public CachingRealm() {
        this.cachingEnabled = true;
        this.name = getClass().getName() + "_" + INSTANCE_COUNT.getAndIncrement();
```

### NonProtectedConstructorInAbstractClass
Constructor `AuthenticatingRealm()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
    }

    public AuthenticatingRealm(CacheManager cacheManager) {
        this(cacheManager, new SimpleCredentialsMatcher());
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AuthenticatingRealm()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
    }

    public AuthenticatingRealm(CacheManager cacheManager, CredentialsMatcher matcher) {
        authenticationTokenClass = UsernamePasswordToken.class;

```

### NonProtectedConstructorInAbstractClass
Constructor `AuthenticatingRealm()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
    |         C O N S T R U C T O R S           |
    ============================================*/
    public AuthenticatingRealm() {
        this(null, new SimpleCredentialsMatcher());
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AuthenticatingRealm()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
    }

    public AuthenticatingRealm(CredentialsMatcher matcher) {
        this(null, matcher);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractSessionManager()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/shiro/session/mgt/AbstractSessionManager.java`
#### Snippet
```java
    private long globalSessionTimeout = DEFAULT_GLOBAL_SESSION_TIMEOUT;

    public AbstractSessionManager() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractNativeSessionManager()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/shiro/session/mgt/AbstractNativeSessionManager.java`
#### Snippet
```java
    private Collection<SessionListener> listeners;

    public AbstractNativeSessionManager() {
        this.listeners = new ArrayList<SessionListener>();
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractValidatingSessionManager()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/shiro/session/mgt/AbstractValidatingSessionManager.java`
#### Snippet
```java
    protected long sessionValidationInterval;

    public AbstractValidatingSessionManager() {
        this.sessionValidationSchedulerEnabled = true;
        this.sessionValidationInterval = DEFAULT_SESSION_VALIDATION_INTERVAL;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractSessionDAO()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/shiro/session/mgt/eis/AbstractSessionDAO.java`
#### Snippet
```java
     * {@link org.apache.shiro.session.mgt.eis.JavaUuidSessionIdGenerator}.
     */
    public AbstractSessionDAO() {
        this.sessionIdGenerator = new JavaUuidSessionIdGenerator();
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `CachingSessionDAO()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/shiro/session/mgt/eis/CachingSessionDAO.java`
#### Snippet
```java
     * Default no-arg constructor.
     */
    public CachingSessionDAO() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `AuthorizingRealm()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/shiro/realm/AuthorizingRealm.java`
#### Snippet
```java
    ============================================*/

    public AuthorizingRealm() {
        this(null, null);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AuthorizingRealm()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/shiro/realm/AuthorizingRealm.java`
#### Snippet
```java
    }

    public AuthorizingRealm(CacheManager cacheManager) {
        this(cacheManager, null);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AuthorizingRealm()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/shiro/realm/AuthorizingRealm.java`
#### Snippet
```java
    }

    public AuthorizingRealm(CredentialsMatcher matcher) {
        this(null, matcher);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AuthorizingRealm()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/shiro/realm/AuthorizingRealm.java`
#### Snippet
```java
    }

    public AuthorizingRealm(CacheManager cacheManager, CredentialsMatcher matcher) {
        super();
        if (cacheManager != null) setCacheManager(cacheManager);
```

## RuleId[id=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `core/src/main/java/org/apache/shiro/subject/SimplePrincipalCollection.java`
#### Snippet
```java
        }
        Set principals = realmPrincipals.get(realmName);
        if (principals == null) {
            principals = new LinkedHashSet();
            realmPrincipals.put(realmName, principals);
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `core/src/main/java/org/apache/shiro/subject/SimplePrincipalMap.java`
#### Snippet
```java
        }
        Map<String,Object> principals = this.realmPrincipals.get(realmName);
        if (principals == null) {
            principals = new HashMap<String,Object>();
            this.realmPrincipals.put(realmName, principals);
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new FilenameFilter() can be replaced with lambda
in `integration-tests/support/src/main/java/org/apache/shiro/testing/web/AbstractContainerIT.java`
#### Snippet
```java

    protected static String getWarDir() {
        File[] warFiles = new File("target").listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `web/src/main/java/org/apache/shiro/web/servlet/AbstractShiroFilter.java`
#### Snippet
```java

            //noinspection unchecked
            subject.execute(new Callable() {
                public Object call() throws Exception {
                    updateSessionLastAccessTime(request, response);
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `support/spring/src/main/java/org/apache/shiro/spring/remoting/SecureRemoteInvocationExecutor.java`
#### Snippet
```java

            Subject subject = builder.buildSubject();
            return subject.execute(new Callable() {
                public Object call() throws Exception {
                    return SecureRemoteInvocationExecutor.super.invoke(invocation, targetObject);
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `path`
in `web/src/main/java/org/apache/shiro/web/env/IniWebEnvironment.java`
#### Snippet
```java
        InputStream is = null;

        path = WebUtils.normalize(path);
        ServletContext sc = getServletContext();
        if (sc != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `base64`
in `web/src/main/java/org/apache/shiro/web/mgt/CookieRememberMeManager.java`
#### Snippet
```java
                sb.append('=');
            }
            base64 = sb.toString();
        }
        return base64;
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `web/src/main/java/org/apache/shiro/web/filter/PathMatchingFilter.java`
#### Snippet
```java
            if (path != null && !DEFAULT_PATH_SEPARATOR.equals(path)
                && path.endsWith(DEFAULT_PATH_SEPARATOR)) {
                path = path.substring(0, path.length() - 1);
            }
            log.trace("Attempting to match pattern '{}' with current requestURI '{}'...", path, Encode.forHtml(requestURI));
```

### AssignmentToMethodParameter
Assignment to method parameter `uri`
in `web/src/main/java/org/apache/shiro/web/util/WebUtils.java`
#### Snippet
```java
     */
    private static String decodeAndCleanUriString(HttpServletRequest request, String uri) {
        uri = decodeRequestString(request, uri);
        return removeSemicolon(uri);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `existing`
in `web/src/main/java/org/apache/shiro/web/filter/authc/AuthenticatingFilter.java`
#### Snippet
```java
            try {
                onAccessDenied(request, response);
                existing = null;
            } catch (Exception e) {
                existing = e;
```

### AssignmentToMethodParameter
Assignment to method parameter `existing`
in `web/src/main/java/org/apache/shiro/web/filter/authc/AuthenticatingFilter.java`
#### Snippet
```java
                existing = null;
            } catch (Exception e) {
                existing = e;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `ipAddress`
in `web/src/main/java/org/apache/shiro/web/filter/authz/IpAddressMatcher.java`
#### Snippet
```java
        if (i > 0) {
            nMaskBits = Integer.parseInt(ipAddress.substring(i + 1));
            ipAddress = ipAddress.substring(0, i);
        } else {
            nMaskBits = -1;
```

### AssignmentToMethodParameter
Assignment to method parameter `url`
in `web/src/main/java/org/apache/shiro/web/servlet/ShiroHttpServletResponse.java`
#### Snippet
```java
            // W3c spec clearly said
            if (url.equalsIgnoreCase("")) {
                url = absolute;
            }
            return toEncoded(url, request.getSession().getId());
```

### AssignmentToMethodParameter
Assignment to method parameter `mappedValue`
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/SslFilter.java`
#### Snippet
```java
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
        if (!enablePortFilter) {
            mappedValue = new String[] { Integer.toString(request.getServerPort()) };
        }
        return super.isAccessAllowed(request, response, mappedValue);
```

### AssignmentToMethodParameter
Assignment to method parameter `savedFormData`
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/FormResubmitSupport.java`
#### Snippet
```java
        HttpResponse<String> htmlResponse = client.send(getRequest, HttpResponse.BodyHandlers.ofString());
        if (htmlResponse.statusCode() == OK) {
            savedFormData = extractJSFNewViewState(htmlResponse.body(), savedFormData);
        }
        return savedFormData;
```

### AssignmentToMethodParameter
Assignment to method parameter `savedFormData`
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/FormResubmitSupport.java`
#### Snippet
```java
            String decodedFormData = URLDecoder.decode(savedFormData, StandardCharsets.UTF_8);
            if (isJSFStatefulForm(decodedFormData)) {
                savedFormData = getJSFNewViewState(savedRequest, client, decodedFormData);
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `savedFormData`
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/FormResubmitSupport.java`
#### Snippet
```java
            var matcher = VIEW_STATE_PATTERN.matcher(savedFormData);
            if (matcher.matches()) {
                savedFormData = matcher.replaceFirst(String.format("$1%s%s$3",
                        FACES_VIEW_STATE_EQUALS, viewState));
                log.debug("Encoded w/Replaced ViewState: {}", savedFormData);
```

### AssignmentToMethodParameter
Assignment to method parameter `jndiName`
in `core/src/main/java/org/apache/shiro/jndi/JndiLocator.java`
#### Snippet
```java
        // Prepend container prefix if not already specified and no other scheme given.
        if (isResourceRef() && !jndiName.startsWith(CONTAINER_PREFIX) && jndiName.indexOf(':') == -1) {
            jndiName = CONTAINER_PREFIX + jndiName;
        }
        return jndiName;
```

### AssignmentToMethodParameter
Assignment to method parameter `bytes`
in `core/src/main/java/org/apache/shiro/mgt/AbstractRememberMeManager.java`
#### Snippet
```java
    protected PrincipalCollection convertBytesToPrincipals(byte[] bytes, SubjectContext subjectContext) {
        if (getCipherService() != null) {
            bytes = decrypt(bytes);
        }
        return deserialize(bytes);
```

### AssignmentToMethodParameter
Assignment to method parameter `wildcardString`
in `core/src/main/java/org/apache/shiro/authz/permission/WildcardPermission.java`
#### Snippet
```java

    protected void setParts(String wildcardString, boolean caseSensitive) {
        wildcardString = StringUtils.clean(wildcardString);

        if (wildcardString == null || wildcardString.isEmpty()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `wildcardString`
in `core/src/main/java/org/apache/shiro/authz/permission/WildcardPermission.java`
#### Snippet
```java

        if (!caseSensitive) {
            wildcardString = wildcardString.toLowerCase();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `lang/src/main/java/org/apache/shiro/lang/codec/H64.java`
#### Snippet
```java
        for (int i = 0; i < numChars; i++) {
            append(buf, itoa64[value & 0x3f]);
            value >>= 6;
        }
    }
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `contextual`
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/cdi/ShiroScopeContext.java`
#### Snippet
```java
            return ctx.get(contextual, creationalContext);
        } else {
            synchronized (contextual) {
                if (isViewScoped) {
                    return Beans.getReference(ViewScopeManager.class).createBean(contextual, creationalContext);
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/DefaultHashService.java`
#### Snippet
```java
    public Hash computeHash(HashRequest request) {
        if (request == null || request.getSource() == null || request.getSource().isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `crypto/cipher/src/main/java/org/apache/shiro/crypto/cipher/JcaCipherService.java`
#### Snippet
```java
        }
        byte[] decrypted = crypt(ciphertext, key, iv, javax.crypto.Cipher.DECRYPT_MODE);
        return decrypted == null ? null : ByteSource.Util.bytes(decrypted);
    }

```

### ReturnNull
Return of `null`
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/format/ProvidedHashFormat.java`
#### Snippet
```java
    public static ProvidedHashFormat byId(final String id) {
        if (id == null) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/format/ProvidedHashFormat.java`
#### Snippet
```java
            return valueOf(id.toUpperCase(Locale.ENGLISH));
        } catch (final IllegalArgumentException ignored) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/format/Shiro1CryptFormat.java`
#### Snippet
```java
    public Hash parse(final String formatted) {
        if (formatted == null) {
            return null;
        }
        if (!formatted.startsWith(MCF_PREFIX)) {
```

### ReturnNull
Return of `null`
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/format/Shiro1CryptFormat.java`
#### Snippet
```java
    public String format(final Hash hash) {
        if (hash == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/format/DefaultHashFormatFactory.java`
#### Snippet
```java

        if (clazz == null) {
            return null; //ran out of options
        }

```

### ReturnNull
Return of `null`
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/format/DefaultHashFormatFactory.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `crypto/hash/src/main/java/org/apache/shiro/crypto/hash/format/DefaultHashFormatFactory.java`
#### Snippet
```java
    public HashFormat getInstance(String in) {
        if (in == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `samples/spring-hibernate/src/main/java/org/apache/shiro/samples/sprhib/service/DefaultUserService.java`
#### Snippet
```java
            return getUser(currentUserId);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `samples/spring-hibernate/src/main/java/org/apache/shiro/samples/sprhib/security/SampleRealm.java`
#### Snippet
```java
            return new SimpleAuthenticationInfo(user.getId(), user.getPassword(), getName());
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `samples/spring-hibernate/src/main/java/org/apache/shiro/samples/sprhib/security/SampleRealm.java`
#### Snippet
```java
            return info;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `web/src/main/java/org/apache/shiro/web/env/IniWebEnvironment.java`
#### Snippet
```java
     */
    protected Ini getFrameworkIni() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `web/src/main/java/org/apache/shiro/web/mgt/CookieRememberMeManager.java`
#### Snippet
```java
                log.debug(msg);
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `web/src/main/java/org/apache/shiro/web/mgt/CookieRememberMeManager.java`
#### Snippet
```java
        WebSubjectContext wsc = (WebSubjectContext) subjectContext;
        if (isIdentityRemoved(wsc)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `web/src/main/java/org/apache/shiro/web/mgt/CookieRememberMeManager.java`
#### Snippet
```java
        // Browsers do not always remove cookies immediately (SHIRO-183)
        // ignore cookies that are scheduled for removal
        if (Cookie.DELETED_COOKIE_VALUE.equals(base64)) return null;

        if (base64 != null) {
```

### ReturnNull
Return of `null`
in `web/src/main/java/org/apache/shiro/web/mgt/CookieRememberMeManager.java`
#### Snippet
```java
                getCookie().removeFrom(request, response);
                log.warn("Unable to decode existing base64 encoded entity: [" + base64 + "].", rtEx);
                return null;
            }

```

### ReturnNull
Return of `null`
in `web/src/main/java/org/apache/shiro/web/mgt/CookieRememberMeManager.java`
#### Snippet
```java
        } else {
            //no cookie set - new site visitor?
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `web/src/main/java/org/apache/shiro/web/filter/mgt/PathMatchingFilterChainResolver.java`
#### Snippet
```java
        FilterChainManager filterChainManager = getFilterChainManager();
        if (!filterChainManager.hasChains()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `web/src/main/java/org/apache/shiro/web/filter/mgt/PathMatchingFilterChainResolver.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `web/src/main/java/org/apache/shiro/web/util/WebUtils.java`
#### Snippet
```java
            return ((RequestPairSource) requestPairSource).getServletRequest();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `web/src/main/java/org/apache/shiro/web/util/WebUtils.java`
#### Snippet
```java
        Object attr = sc.getAttribute(attrName);
        if (attr == null) {
            return null;
        }
        if (attr instanceof RuntimeException) {
```

### ReturnNull
Return of `null`
in `web/src/main/java/org/apache/shiro/web/util/WebUtils.java`
#### Snippet
```java
            return (HttpServletResponse) response;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `web/src/main/java/org/apache/shiro/web/util/WebUtils.java`
#### Snippet
```java
            return (HttpServletRequest) request;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `web/src/main/java/org/apache/shiro/web/util/WebUtils.java`
#### Snippet
```java
            return ((RequestPairSource) requestPairSource).getServletResponse();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `web/src/main/java/org/apache/shiro/web/util/WebUtils.java`
#### Snippet
```java

        if (path == null)
            return null;

        // Create a place for the normalized path
```

### ReturnNull
Return of `null`
in `web/src/main/java/org/apache/shiro/web/util/WebUtils.java`
#### Snippet
```java
                break;
            if (index == 0)
                return (null);  // Trying to go outside our context
            int index2 = normalized.lastIndexOf('/', index - 1);
            normalized = normalized.substring(0, index2) +
```

### ReturnNull
Return of `null`
in `web/src/main/java/org/apache/shiro/web/filter/authc/HttpAuthenticationFilter.java`
#### Snippet
```java
    protected String[] getPrincipalsAndCredentials(String authorizationHeader, ServletRequest request) {
        if (authorizationHeader == null) {
            return null;
        }
        String[] authTokens = authorizationHeader.split(" ");
```

### ReturnNull
Return of `null`
in `web/src/main/java/org/apache/shiro/web/filter/authc/HttpAuthenticationFilter.java`
#### Snippet
```java
        String[] authTokens = authorizationHeader.split(" ");
        if (authTokens == null || authTokens.length < 2) {
            return null;
        }
        return getPrincipalsAndCredentials(authTokens[0], authTokens[1]);
```

### ReturnNull
Return of `null`
in `web/src/main/java/org/apache/shiro/web/config/IniFilterChainResolverFactory.java`
#### Snippet
```java
    private Map<String, Filter> extractFilters(Map<String, ?> objects) {
        if (CollectionUtils.isEmpty(objects)) {
            return null;
        }
        Map<String, Filter> filterMap = new LinkedHashMap<String, Filter>();
```

### ReturnNull
Return of `null`
in `web/src/main/java/org/apache/shiro/web/servlet/AbstractFilter.java`
#### Snippet
```java
            return StringUtils.clean(config.getInitParameter(paramName));
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `web/src/main/java/org/apache/shiro/web/servlet/IniShiroFilter.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `web/src/main/java/org/apache/shiro/web/servlet/AbstractShiroFilter.java`
#### Snippet
```java
                    updateSessionLastAccessTime(request, response);
                    executeChain(request, response, chain);
                    return null;
                }
            });
```

### ReturnNull
Return of `null`
in `web/src/main/java/org/apache/shiro/web/servlet/ShiroHttpSession.java`
#### Snippet
```java

        public Object nextElement() {
            return null;
        }
    };
```

### ReturnNull
Return of `null`
in `web/src/main/java/org/apache/shiro/web/servlet/ShiroHttpSession.java`
#### Snippet
```java
            new javax.servlet.http.HttpSessionContext() {
                public HttpSession getSession(String s) {
                    return null;
                }

```

### ReturnNull
Return of `null`
in `web/src/main/java/org/apache/shiro/web/session/mgt/DefaultWebSessionManager.java`
#### Snippet
```java
        if (!isSessionIdCookieEnabled()) {
            log.debug("Session ID cookie is disabled - session id will not be acquired from a request cookie.");
            return null;
        }
        if (!(request instanceof HttpServletRequest)) {
```

### ReturnNull
Return of `null`
in `web/src/main/java/org/apache/shiro/web/session/mgt/DefaultWebSessionManager.java`
#### Snippet
```java
        if (!(request instanceof HttpServletRequest)) {
            log.debug("Current request is not an HttpServletRequest - cannot get session ID cookie.  Returning null.");
            return null;
        }
        HttpServletRequest httpRequest = (HttpServletRequest) request;
```

### ReturnNull
Return of `null`
in `web/src/main/java/org/apache/shiro/web/session/mgt/DefaultWebSessionManager.java`
#### Snippet
```java

        if (!(servletRequest instanceof HttpServletRequest)) {
            return null;
        }
        HttpServletRequest request = (HttpServletRequest)servletRequest;
```

### ReturnNull
Return of `null`
in `web/src/main/java/org/apache/shiro/web/session/mgt/DefaultWebSessionManager.java`
#### Snippet
```java
        String uri = request.getRequestURI();
        if (uri == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `web/src/main/java/org/apache/shiro/web/session/mgt/DefaultWebSessionManager.java`
#### Snippet
```java
        if (index < 0) {
            //no path segment params - return:
            return null;
        }

```

### ReturnNull
Return of `null`
in `web/src/main/java/org/apache/shiro/web/session/mgt/DefaultWebSessionManager.java`
#### Snippet
```java
        if (index < 0) {
            //no segment param:
            return null;
        }

```

### ReturnNull
Return of `null`
in `web/src/main/java/org/apache/shiro/web/servlet/SimpleCookie.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `support/aspectj/src/main/java/org/apache/shiro/aspectj/BeforeAdviceMethodInvocationAdapter.java`
#### Snippet
```java
    public Object proceed() throws Throwable {
        // Do nothing since this adapts a before advice
        return null;
    }

```

### ReturnNull
Return of `null`
in `config/core/src/main/java/org/apache/shiro/config/Ini.java`
#### Snippet
```java
            String line = StringUtils.clean(keyValueLine);
            if (line == null) {
                return null;
            }
            StringBuilder keyBuffer = new StringBuilder();
```

### ReturnNull
Return of `null`
in `config/core/src/main/java/org/apache/shiro/config/Ini.java`
#### Snippet
```java
    public String getSectionProperty(String sectionName, String propertyName) {
        Section section = getSection(sectionName);
        return section != null ? section.get(propertyName) : null;
    }

```

### ReturnNull
Return of `null`
in `config/core/src/main/java/org/apache/shiro/config/Ini.java`
#### Snippet
```java
            return cleanName(s.substring(1, s.length() - 1));
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/ShiroFilter.java`
#### Snippet
```java
        public Principal getUserPrincipal() {
            if (isServletNoPrincipal(servletContext)) {
                return null;
            } else {
                return super.getUserPrincipal();
```

### ReturnNull
Return of `null`
in `support/guice/src/main/java/org/apache/shiro/guice/web/SimpleFilterChainResolver.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `support/jakarta-ee/src/main/java/org/apache/shiro/ee/filters/FormResubmitSupport.java`
#### Snippet
```java
                    Faces.responseComplete();
                }
                return null;
            default:
                return savedRequest;
```

### ReturnNull
Return of `null`
in `support/spring/src/main/java/org/apache/shiro/spring/config/AbstractShiroConfiguration.java`
#### Snippet
```java

    protected RememberMeManager rememberMeManager() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `support/jcache/src/main/java/org/apache/shiro/cache/jcache/JCacheManager.java`
#### Snippet
```java
                log.trace("Getting object from cache [{}] for key [{}]", cache.getName(), key);
                if (key == null) {
                    return null;
                } else {
                    V element = cache.get(key);
```

### ReturnNull
Return of `null`
in `support/jcache/src/main/java/org/apache/shiro/cache/jcache/JCacheManager.java`
#### Snippet
```java
                    if (element == null) {
                        log.trace("Element for [{}] is null.", key);
                        return null;
                    } else {
                        return element;
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/env/DefaultEnvironment.java`
#### Snippet
```java
        Object o = this.objects.get(name);
        if (o == null) {
            return null;
        }
        if (!requiredType.isInstance(o)) {
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/env/BasicIniEnvironment.java`
#### Snippet
```java
public class BasicIniEnvironment extends DefaultEnvironment {
    public BasicIniEnvironment(Ini ini) {
        this(ini, (name) -> null);
    }

```

### ReturnNull
Return of `null`
in `support/ehcache/src/main/java/org/apache/shiro/cache/ehcache/EhCache.java`
#### Snippet
```java
            }
            if (key == null) {
                return null;
            } else {
                Element element = cache.get(key);
```

### ReturnNull
Return of `null`
in `support/ehcache/src/main/java/org/apache/shiro/cache/ehcache/EhCache.java`
#### Snippet
```java
                        log.trace("Element for [" + key + "] is null.");
                    }
                    return null;
                } else {
                    //noinspection unchecked
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/ini/IniSecurityManagerFactory.java`
#### Snippet
```java

    public Map<String, ?> getBeans() {
        return this.builder != null ? Collections.unmodifiableMap(builder.getObjects()) : null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/jndi/JndiTemplate.java`
#### Snippet
```java
            public Object doInContext(Context ctx) throws NamingException {
                ctx.rebind(name, object);
                return null;
            }
        });
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/jndi/JndiTemplate.java`
#### Snippet
```java
            public Object doInContext(Context ctx) throws NamingException {
                ctx.bind(name, object);
                return null;
            }
        });
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/jndi/JndiTemplate.java`
#### Snippet
```java
            public Object doInContext(Context ctx) throws NamingException {
                ctx.unbind(name);
                return null;
            }
        });
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/mgt/DefaultSecurityManager.java`
#### Snippet
```java
            return getSession(key);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/mgt/DefaultSecurityManager.java`
#### Snippet
```java
            return new DefaultSessionKey(sessionId);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/mgt/DefaultSecurityManager.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/util/PermissionUtils.java`
#### Snippet
```java
            return new LinkedHashSet<String>(Arrays.asList(tokens));
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/util/ThreadContext.java`
#### Snippet
```java
                return (Map<Object, Object>) ((HashMap<Object, Object>) parentValue).clone();
            } else {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/util/ThreadContext.java`
#### Snippet
```java
    private static Object getValue(Object key) {
        Map<Object, Object> perThreadResources = resources.get();
        return perThreadResources != null ? perThreadResources.get(key) : null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/authc/pam/FirstSuccessfulStrategy.java`
#### Snippet
```java
     */
    public AuthenticationInfo beforeAllAttempts(Collection<? extends Realm> realms, AuthenticationToken token) throws AuthenticationException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/authc/credential/PasswordMatcher.java`
#### Snippet
```java

    protected Object getSubmittedPassword(AuthenticationToken token) {
        return token != null ? token.getCredentials() : null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/authc/credential/DefaultPasswordService.java`
#### Snippet
```java
        ByteSource plaintextBytes = createByteSource(plaintext);
        if (plaintextBytes == null || plaintextBytes.isEmpty()) {
            return null;
        }
        HashRequest request = createHashRequest(plaintextBytes);
```

### ReturnNull
Return of `null`
in `config/ogdl/src/main/java/org/apache/shiro/config/ogdl/ReflectionBuilder.java`
#### Snippet
```java
        Object bean = getBean(id);
        if (bean == null) {
            return null;
        }
        Assert.state(requiredType.isAssignableFrom(bean.getClass()),
```

### ReturnNull
Return of `null`
in `config/ogdl/src/main/java/org/apache/shiro/config/ogdl/ReflectionBuilder.java`
#### Snippet
```java
            return lhs.substring(0, index);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `config/ogdl/src/main/java/org/apache/shiro/config/ogdl/ReflectionBuilder.java`
#### Snippet
```java
    protected String checkForNullOrEmptyLiteral(String stringValue) {
        if (stringValue == null) {
            return null;
        }
        //check if the value is the actual literal string 'null' (expected to be wrapped in quotes):
```

### ReturnNull
Return of `null`
in `config/ogdl/src/main/java/org/apache/shiro/config/ogdl/ReflectionBuilder.java`
#### Snippet
```java
    }

    private Function<String, ?> alternateObjectSupplier = name -> null;

    public ReflectionBuilder() {
```

### ReturnNull
Return of `null`
in `config/ogdl/src/main/java/org/apache/shiro/config/ogdl/ReflectionBuilder.java`
#### Snippet
```java

        if (isEmpty(objects)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `config/ogdl/src/main/java/org/apache/shiro/config/ogdl/ReflectionBuilder.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `config/ogdl/src/main/java/org/apache/shiro/config/ogdl/ReflectionBuilder.java`
#### Snippet
```java
                StringUtils.DEFAULT_QUOTE_CHAR, StringUtils.DEFAULT_QUOTE_CHAR, true, true);
        if (tokens == null || tokens.length <= 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `config/ogdl/src/main/java/org/apache/shiro/config/ogdl/ReflectionBuilder.java`
#### Snippet
```java
            Object bean = objects.get(this.rootBeanName);
            setBean(bean);
            return null;
        }

```

### ReturnNull
Return of `null`
in `config/ogdl/src/main/java/org/apache/shiro/config/ogdl/ReflectionBuilder.java`
#### Snippet
```java
        String[] tokens = StringUtils.split(sValue);
        if (tokens == null || tokens.length <= 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `config/ogdl/src/main/java/org/apache/shiro/config/ogdl/ReflectionBuilder.java`
#### Snippet
```java
        String[] tokens = StringUtils.split(sValue);
        if (tokens == null || tokens.length <= 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `config/ogdl/src/main/java/org/apache/shiro/config/ogdl/ReflectionBuilder.java`
#### Snippet
```java
        String[] tokens = StringUtils.split(sValue);
        if (tokens == null || tokens.length <= 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `config/ogdl/src/main/java/org/apache/shiro/config/ogdl/ReflectionBuilder.java`
#### Snippet
```java
    protected byte[] toBytes(String sValue) {
        if (sValue == null) {
            return null;
        }
        byte[] bytes;
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/realm/SimpleAccountRealm.java`
#### Snippet
```java
    protected static Set<String> toSet(String delimited, String delimiter) {
        if (delimited == null || delimited.trim().equals("")) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/realm/jndi/JndiRealmFactory.java`
#### Snippet
```java
            }
        }
        return realms.isEmpty() ? null : realms;
    }
}
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/realm/ldap/DefaultLdapRealm.java`
#### Snippet
```java
    protected AuthorizationInfo queryForAuthorizationInfo(PrincipalCollection principals,
                                                          LdapContextFactory ldapContextFactory) throws NamingException {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/realm/AuthenticatingRealm.java`
#### Snippet
```java
     */
    protected Object getAuthenticationCacheKey(AuthenticationToken token) {
        return token != null ? token.getPrincipal() : null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/realm/text/TextConfigurationRealm.java`
#### Snippet
```java
    protected static Map<String, String> toMap(Collection<String> keyValuePairs) throws ParseException {
        if (keyValuePairs == null || keyValuePairs.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/session/mgt/AbstractNativeSessionManager.java`
#### Snippet
```java
    public Session getSession(SessionKey key) throws SessionException {
        Session session = lookupSession(key);
        return session != null ? createExposedSession(session, key) : null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/session/mgt/DefaultSessionManager.java`
#### Snippet
```java
            log.debug("Unable to resolve session ID from SessionKey [{}].  Returning null to indicate a " +
                    "session could not be found.", sessionKey);
            return null;
        }
        Session s = retrieveSessionFromDataSource(sessionId);
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/session/mgt/eis/EnterpriseCacheSessionDAO.java`
#### Snippet
```java

    protected Session doReadSession(Serializable sessionId) {
        return null; //should never execute because this implementation relies on parent class to access cache, which
        //is where all sessions reside - it is the cache implementation that determines if the
        //cache is memory only or disk-persistent, etc.
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/session/mgt/SimpleSession.java`
#### Snippet
```java
        Map<Object, Object> attributes = getAttributes();
        if (attributes == null) {
            return null;
        }
        return attributes.get(key);
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/session/mgt/SimpleSession.java`
#### Snippet
```java
        Map<Object, Object> attributes = getAttributes();
        if (attributes == null) {
            return null;
        } else {
            return attributes.remove(key);
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/subject/SimplePrincipalCollection.java`
#### Snippet
```java
    public Object getPrimaryPrincipal() {
        if (isEmpty()) {
            return null;
        }
        return iterator().next();
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/subject/SimplePrincipalCollection.java`
#### Snippet
```java
    public Set<String> getRealmNames() {
        if (realmPrincipals == null) {
            return null;
        } else {
            return realmPrincipals.keySet();
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/subject/SimplePrincipalCollection.java`
#### Snippet
```java
    public <T> T oneByType(Class<T> type) {
        if (realmPrincipals == null || realmPrincipals.isEmpty()) {
            return null;
        }
        Collection<Set> values = realmPrincipals.values();
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/subject/SimplePrincipalCollection.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/subject/SimplePrincipalMap.java`
#### Snippet
```java
        }
        if (this.realmPrincipals == null) {
            return null;
        }
        Map<String,Object> principals = this.realmPrincipals.get(realmName);
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/subject/SimplePrincipalMap.java`
#### Snippet
```java
            return principals.remove(principalName);
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/subject/SimplePrincipalMap.java`
#### Snippet
```java
    public <T> T oneByType(Class<T> type) {
        if (CollectionUtils.isEmpty(this.combinedPrincipals)) {
            return null;
        }
        for( Object value : this.combinedPrincipals.values()) {
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/subject/SimplePrincipalMap.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/subject/SimplePrincipalMap.java`
#### Snippet
```java
        }
        if (this.realmPrincipals == null) {
            return null;
        }
        Map<String,Object> principals = this.realmPrincipals.get(realmName);
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/subject/SimplePrincipalMap.java`
#### Snippet
```java
            return principals.get(principalName);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/subject/SimplePrincipalMap.java`
#### Snippet
```java
    public Map<String, Object> getRealmPrincipals(String name) {
        if (this.realmPrincipals == null) {
            return null;
        }
        Map<String,Object> principals = this.realmPrincipals.get(name);
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/subject/SimplePrincipalMap.java`
#### Snippet
```java
        Map<String,Object> principals = this.realmPrincipals.get(name);
        if (principals == null) {
            return null;
        }
        return Collections.unmodifiableMap(principals);
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/subject/SimplePrincipalMap.java`
#### Snippet
```java

    public Object remove(Object o) {
        return this.combinedPrincipals != null ? this.combinedPrincipals.remove(o) : null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/subject/SimplePrincipalMap.java`
#### Snippet
```java
        return !CollectionUtils.isEmpty(this.combinedPrincipals) ?
                this.combinedPrincipals.values().iterator().next() :
                null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/subject/SimplePrincipalMap.java`
#### Snippet
```java
                return this.realmPrincipals.put(realmName, new HashMap<String,Object>(principals));
            } else {
                return null;
            }
        } else {
```

### ReturnNull
Return of `null`
in `lang/src/main/java/org/apache/shiro/lang/util/ByteSource.java`
#### Snippet
```java
        public static ByteSource bytes(Object source) throws IllegalArgumentException {
            if (source == null) {
                return null;
            }
            if (!isCompatible(source)) {
```

### ReturnNull
Return of `null`
in `lang/src/main/java/org/apache/shiro/lang/util/ClassUtils.java`
#### Snippet
```java
                }
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `lang/src/main/java/org/apache/shiro/lang/codec/H64.java`
#### Snippet
```java
     */
    public static String encodeToString(byte[] bytes) {
        if (bytes == null || bytes.length == 0) return null;

        StringBuilder buf = new StringBuilder();
```

### ReturnNull
Return of `null`
in `lang/src/main/java/org/apache/shiro/lang/util/StringUtils.java`
#### Snippet
```java
        String line = clean(aLine);
        if (line == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `lang/src/main/java/org/apache/shiro/lang/util/StringUtils.java`
#### Snippet
```java
    public static Set<String> splitToSet(String delimited, String separator) {
        if (delimited == null || separator == null) {
            return null;
        }
        String[] split = split(delimited, separator.charAt(0));
```

### ReturnNull
Return of `null`
in `lang/src/main/java/org/apache/shiro/lang/util/StringUtils.java`
#### Snippet
```java
        String line = clean(aLine);
        if (line == null) {
            return null;
        }
        String[] split = line.split(" ", 2);
```

### ReturnNull
Return of `null`
in `lang/src/main/java/org/apache/shiro/lang/util/StringUtils.java`
#### Snippet
```java
    public static String[] toStringArray(Collection collection) {
        if (collection == null) {
            return null;
        }
        return (String[]) collection.toArray(new String[collection.size()]);
```

### ReturnNull
Return of `null`
in `lang/src/main/java/org/apache/shiro/lang/util/StringUtils.java`
#### Snippet
```java

        if (str == null) {
            return null;
        }
        StringTokenizer st = new StringTokenizer(str, delimiters);
```

### ReturnNull
Return of `null`
in `lang/src/main/java/org/apache/shiro/lang/util/StringUtils.java`
#### Snippet
```java
        // handle null, zero and one elements before building a buffer
        if (iterator == null) {
            return null;
        }
        if (!iterator.hasNext()) {
```

### ReturnNull
Return of `null`
in `lang/src/main/java/org/apache/shiro/lang/util/SoftHashMap.java`
#### Snippet
```java
        processQueue(); // throw out garbage collected values first
        SoftValue<V, K> raw = map.remove(key);
        return raw != null ? raw.get() : null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/subject/support/DelegatingSubject.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/subject/support/DelegatingSubject.java`
#### Snippet
```java
            return principals.getPrimaryPrincipal();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/shiro/realm/AuthorizingRealm.java`
#### Snippet
```java

        if (principals == null) {
            return null;
        }

```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `ehCacheManager` is redundant
in `samples/spring-mvc/src/main/java/org/apache/shiro/samples/spring/config/ApplicationConfig.java`
#### Snippet
```java
    protected EhCacheManager cacheManager() {

        EhCacheManager ehCacheManager = new EhCacheManager();

        // Set a net.sf.ehcache.CacheManager instance here if you already have one.
```

### UnnecessaryLocalVariable
Local variable `value` is redundant
in `web/src/main/java/org/apache/shiro/web/servlet/SimpleCookie.java`
#### Snippet
```java
    public void removeFrom(HttpServletRequest request, HttpServletResponse response) {
        String name = getName();
        String value = DELETED_COOKIE_VALUE;
        String comment = null; //don't need to add extra size to the response - comments are irrelevant for deletions
        String domain = getDomain();
```

## RuleId[id=RegExpUnnecessaryNonCapturingGroup]
### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[0-9]|[1-9][0-9]|1[0-9][0-9]|2(?:[0-4][0-9]|5[0-5]))`
in `web/src/main/java/org/apache/shiro/web/filter/authz/HostFilter.java`
#### Snippet
```java
public class HostFilter extends AuthorizationFilter {

    public static final String IPV4_QUAD_REGEX = "(?:[0-9]|[1-9][0-9]|1[0-9][0-9]|2(?:[0-4][0-9]|5[0-5]))";

    public static final String IPV4_REGEX = "(?:" + IPV4_QUAD_REGEX + "\\.){3}" + IPV4_QUAD_REGEX + "$";
```

## RuleId[id=RedundantSlf4jDefinition]
### RedundantSlf4jDefinition
Slf4j Logger is defined explicitly. Use Lombok @Slf4j annotation instead.
in `samples/quickstart/src/main/java/Quickstart.java`
#### Snippet
```java
public class Quickstart {

    private static final transient Logger log = LoggerFactory.getLogger(Quickstart.class);


```

### RedundantSlf4jDefinition
Slf4j Logger is defined explicitly. Use Lombok @Slf4j annotation instead.
in `samples/quickstart-guice/src/main/java/QuickstartGuice.java`
#### Snippet
```java
public class QuickstartGuice {

    private static final transient Logger log = LoggerFactory.getLogger(QuickstartGuice.class);


```

