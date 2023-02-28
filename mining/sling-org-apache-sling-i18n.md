# sling-org-apache-sling-i18n 
 
# Bad smells
I found 55 bad smells with 9 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 10 | false |
| AssignmentToMethodParameter | 7 | false |
| BoundedWildcard | 6 | false |
| ReturnNull | 5 | false |
| SynchronizeOnThis | 5 | false |
| SizeReplaceableByIsEmpty | 4 | true |
| ToArrayCallWithZeroLengthArrayArgument | 2 | true |
| Convert2Lambda | 2 | false |
| RedundantArrayCreation | 2 | true |
| ZeroLengthArrayInitialization | 2 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| UnnecessarySuperQualifier | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 1 | false |
| ObsoleteCollection | 1 | false |
| RedundantFieldInitialization | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| MissortedModifiers | 1 | false |
| UnusedAssignment | 1 | false |
| ConstantValue | 1 | false |
## RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new ResourceBundleProvider\[this.providers.size()\]'
in `src/main/java/org/apache/sling/i18n/impl/I18NFilter.java`
#### Snippet
```java
        synchronized ( this.providers ) {
            this.providers.remove(ServiceUtil.getComparableForServiceRanking(props, Order.ASCENDING));
            this.sortedProviders = this.providers.values().toArray(new ResourceBundleProvider[this.providers.size()]);
        }
    }
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new ResourceBundleProvider\[this.providers.size()\]'
in `src/main/java/org/apache/sling/i18n/impl/I18NFilter.java`
#### Snippet
```java
        synchronized ( this.providers ) {
            this.providers.put(ServiceUtil.getComparableForServiceRanking(props, Order.ASCENDING), provider);
            this.sortedProviders = this.providers.values().toArray(new ResourceBundleProvider[this.providers.size()]);
        }
    }
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/sling/i18n/impl/JcrResourceBundleProvider.java`
#### Snippet
```java
        }
        // support BCP 47 compliant strings as well (using a different separator "-" instead of "_")
        localeString = localeString.replaceAll("-", "_");

        // check language and country
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/sling/i18n/impl/LocatorPathsVisitor.java`
#### Snippet
```java
    public void accept(Resource res, int traverseDepth) {
        this.traverseDepth = traverseDepth;
        super.accept(res);
    }

```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/sling/i18n/package-info.java`
#### Snippet
```java
 */

@org.osgi.annotation.versioning.Version("2.2.1")
package org.apache.sling.i18n;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.sling.i18n` is unnecessary and can be removed
in `src/main/java/org/apache/sling/i18n/DefaultLocaleResolver.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.i18n.RequestLocaleResolver#resolveLocale(javax.servlet.http.HttpServletRequest)
     */
    public List<Locale> resolveLocale(final HttpServletRequest request) {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet.http` is unnecessary and can be removed
in `src/main/java/org/apache/sling/i18n/DefaultLocaleResolver.java`
#### Snippet
```java

    /**
     * @see org.apache.sling.i18n.RequestLocaleResolver#resolveLocale(javax.servlet.http.HttpServletRequest)
     */
    public List<Locale> resolveLocale(final HttpServletRequest request) {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `src/main/java/org/apache/sling/i18n/impl/I18NFilter.java`
#### Snippet
```java

    /**
     * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `src/main/java/org/apache/sling/i18n/impl/I18NFilter.java`
#### Snippet
```java

    /**
     * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `src/main/java/org/apache/sling/i18n/impl/I18NFilter.java`
#### Snippet
```java

    /**
     * @see javax.servlet.Filter#destroy()
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `src/main/java/org/apache/sling/i18n/impl/I18NFilter.java`
#### Snippet
```java

    /**
     * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `src/main/java/org/apache/sling/i18n/impl/I18NFilter.java`
#### Snippet
```java

    /**
     * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `src/main/java/org/apache/sling/i18n/impl/I18NFilter.java`
#### Snippet
```java

    /**
     * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `src/main/java/org/apache/sling/i18n/impl/I18NFilter.java`
#### Snippet
```java

    /**
     * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
     */
    @Override
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'LocaleResolver' is still used
in `src/main/java/org/apache/sling/i18n/LocaleResolver.java`
#### Snippet
```java
 */
@Deprecated
public interface LocaleResolver {

    /**
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `scheduler` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/sling/i18n/impl/JcrResourceBundleProvider.java`
#### Snippet
```java

    @Reference
    private Scheduler scheduler;

    /** job names of scheduled jobs for reloading individual bundles */
```

## RuleId[ruleID=Convert2Lambda]
### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `src/main/java/org/apache/sling/i18n/impl/JcrResourceBundleProvider.java`
#### Snippet
```java
        }
        options.name("ResourceBundleProvider: reload all resource bundles");
        scheduler.schedule(new Runnable() {
            @Override
            public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `src/main/java/org/apache/sling/i18n/impl/JcrResourceBundleProvider.java`
#### Snippet
```java
        scheduledJobNames.add(jobName);
        options.name(jobName);
        scheduler.schedule(new Runnable() {
            @Override
            public void run() {
```

## RuleId[ruleID=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Hashtable<>` used
in `src/main/java/org/apache/sling/i18n/impl/JcrResourceBundleProvider.java`
#### Snippet
```java

    private void registerResourceBundle(Key key, JcrResourceBundle resourceBundle) {
        Dictionary<String, Object> serviceProps = new Hashtable<>();
        if (key.baseName != null) {
            serviceProps.put("baseName", key.baseName);
```

## RuleId[ruleID=RedundantArrayCreation]
### RedundantArrayCreation
Redundant array creation for calling varargs method
in `src/main/java/org/apache/sling/i18n/impl/JcrResourceBundle.java`
#### Snippet
```java
    protected Object handleGetObject(String key) {
        if (log.isDebugEnabled()) {
            log.debug("Requesting key '{}' from resource bundle (baseName '{}', locale '{}')", new Object[] {key, baseName, locale});
        }
        return resources.get(key);
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `src/main/java/org/apache/sling/i18n/impl/JcrResourceBundle.java`
#### Snippet
```java
            log.info(
                "Finished loading {} entries for '{}' (basename: {}) in {}ms",
                new Object[] { resources.size(), locale, baseName == null ? "<none>" : baseName, (end - start)}
            );
        }
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/sling/i18n/impl/JcrResourceBundleProvider.java`
#### Snippet
```java
    private static final class ChangeStatus {
        public ResourceResolver resourceResolver;
        public boolean reloadAll = false;
        public final Set<JcrResourceBundle> reloadBundles = new HashSet<>();
    }
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `locale`
in `src/main/java/org/apache/sling/i18n/impl/JcrResourceBundleProvider.java`
#### Snippet
```java
    private ResourceBundle getResourceBundleInternal(ResourceResolver optionalResolver, final String baseName, Locale locale, final boolean overwriteCache) {
        if (locale == null) {
            locale = defaultLocale;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `optionalResolver`
in `src/main/java/org/apache/sling/i18n/impl/JcrResourceBundleProvider.java`
#### Snippet
```java
                        if ( optionalResolver == null ) {
                            localResolver = createResourceResolver();
                            optionalResolver = localResolver;
                        }

```

### AssignmentToMethodParameter
Assignment to method parameter `localeString`
in `src/main/java/org/apache/sling/i18n/impl/JcrResourceBundleProvider.java`
#### Snippet
```java
        }
        // support BCP 47 compliant strings as well (using a different separator "-" instead of "_")
        localeString = localeString.replaceAll("-", "_");

        // check language and country
```

### AssignmentToMethodParameter
Assignment to method parameter `locale`
in `src/main/java/org/apache/sling/i18n/impl/I18NFilter.java`
#### Snippet
```java
            if (bundleProvider != null) {
                if (locale == null) {
                    locale = getLocale();
                }

```

### AssignmentToMethodParameter
Assignment to method parameter `request`
in `src/main/java/org/apache/sling/i18n/impl/I18NFilter.java`
#### Snippet
```java
            if ( !runGlobal || this.requestLocaleResolver == DEFAULT_LOCALE_RESOLVER ) {
                // wrap with our ResourceBundle provisioning
                request = new I18NSlingHttpServletRequest(request,
                        combinedProvider, localeResolver);
            } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `request`
in `src/main/java/org/apache/sling/i18n/impl/I18NFilter.java`
#### Snippet
```java
                        combinedProvider, localeResolver);
            } else {
                request = new BaseI18NSlingHttpServletRequest(request, combinedProvider);
            }
        } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `request`
in `src/main/java/org/apache/sling/i18n/impl/I18NFilter.java`
#### Snippet
```java
            }
        } else {
            request = new I18NHttpServletRequest(request,
                    combinedProvider, requestLocaleResolver);
        }
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/apache/sling/i18n/impl/JcrResourceBundleProvider.java`
#### Snippet
```java

        // no more parents
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/sling/i18n/impl/ResourceBundleEnumeration.java`
#### Snippet
```java
        
        // parentKeys are also exhausted, nothing more to return
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/sling/i18n/impl/I18NFilter.java`
#### Snippet
```java
                }
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/sling/i18n/impl/I18NFilter.java`
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
in `src/main/java/org/apache/sling/i18n/impl/I18NFilter.java`
#### Snippet
```java
                }
            }
            return null;
        }

```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`localeString.length() == 0` can be replaced with 'localeString.isEmpty()'
in `src/main/java/org/apache/sling/i18n/impl/JcrResourceBundleProvider.java`
#### Snippet
```java
     */
    static Locale toLocale(String localeString) {
        if (localeString == null || localeString.length() == 0) {
            return Locale.getDefault();
        }
```

### SizeReplaceableByIsEmpty
`locale.getVariant().length() != 0` can be replaced with '!locale.getVariant().isEmpty()'
in `src/main/java/org/apache/sling/i18n/impl/JcrResourceBundleProvider.java`
#### Snippet
```java
     */
    private Locale getParentLocale(Locale locale) {
        if (locale.getVariant().length() != 0) {
            return new Locale(locale.getLanguage(), locale.getCountry());
        } else if (locale.getCountry().length() != 0) {
```

### SizeReplaceableByIsEmpty
`locale.getCountry().length() != 0` can be replaced with '!locale.getCountry().isEmpty()'
in `src/main/java/org/apache/sling/i18n/impl/JcrResourceBundleProvider.java`
#### Snippet
```java
        if (locale.getVariant().length() != 0) {
            return new Locale(locale.getLanguage(), locale.getCountry());
        } else if (locale.getCountry().length() != 0) {
            return new Locale(locale.getLanguage());
        } else if (!locale.getLanguage().equals(defaultLocale.getLanguage())) {
```

### SizeReplaceableByIsEmpty
`language.length() > 0` can be replaced with '!language.isEmpty()'
in `src/main/java/org/apache/sling/i18n/impl/PotentialLanguageRootCheck.java`
#### Snippet
```java
        if (properties != null) {
            String language = properties.get(JcrResourceBundle.PROP_LANGUAGE, String.class);
            if (language != null && language.length() > 0) {
                if (language.equals(localeString)
                        || language.equals(localeStringLower)
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/sling/i18n/impl/PotentialLanguageRootCheck.java`
#### Snippet
```java
                        || language.equals(localeRFC4646StringLower)) {
                    // basename might be a multivalue (see https://issues.apache.org/jira/browse/SLING-4547)
                    String[] baseNames = properties.get(JcrResourceBundle.PROP_BASENAME, new String[]{});
                    if (baseName == null || Arrays.asList(baseNames).contains(baseName)) {
                        match = true;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/sling/i18n/impl/I18NFilter.java`
#### Snippet
```java
    private final Map<Object, ResourceBundleProvider> providers = new TreeMap<>();

    private volatile ResourceBundleProvider[] sortedProviders = new ResourceBundleProvider[0];

    private final ResourceBundleProvider combinedProvider = new CombinedBundleProvider();
```

## RuleId[ruleID=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/sling/i18n/impl/JcrResourceBundleProvider.java`
#### Snippet
```java
        ServiceRegistration<ResourceBundle> serviceReg = bundleContext.registerService(ResourceBundle.class,
                resourceBundle, serviceProps);
        synchronized (this) {
            bundleServiceRegistrations.put(key, serviceReg);
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/sling/i18n/impl/JcrResourceBundleProvider.java`
#### Snippet
```java

        final List<ServiceRegistration<ResourceBundle>> regs;
        synchronized (this) {
            regs = new ArrayList<>(bundleServiceRegistrations.values());
            bundleServiceRegistrations.clear();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/sling/i18n/impl/JcrResourceBundleProvider.java`
#### Snippet
```java
    private void unregisterResourceBundle(Key key) {
        ServiceRegistration<ResourceBundle> serviceRegistration = null;
        synchronized (this) {
            serviceRegistration = bundleServiceRegistrations.remove(key);
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/sling/i18n/impl/I18NFilter.java`
#### Snippet
```java
    @Override
    public void init(FilterConfig filterConfig) {
        synchronized(this) {
            initCount++;
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/sling/i18n/impl/I18NFilter.java`
#### Snippet
```java
    @Override
    public void destroy() {
        synchronized(this) {
            initCount--;
        }
```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/sling/i18n/impl/JcrResourceBundleProvider.java`
#### Snippet
```java
        // defer this job
        ScheduleOptions options = scheduler.AT(new Date(System.currentTimeMillis() + this.invalidationDelay));
        final String jobName = "ResourceBundleProvider: reload bundle with key " + key.toString();
        scheduledJobNames.add(jobName);
        options.name(jobName);
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/sling/i18n/impl/LocatorPathsVisitor.java`
#### Snippet
```java
     * @param traverseDepth the maximum depth to traverse the descendant
     */
    public LocatorPathsVisitor(PotentialLanguageRootCheck check, Set<String> paths) {
        this.check = check;
        this.paths = paths;
```

### BoundedWildcard
Can generalize to `? extends LocatorPaths`
in `src/main/java/org/apache/sling/i18n/impl/JcrResourceBundleProvider.java`
#### Snippet
```java
     * @param locatorPathsSet set of locator paths to check
     */
    public void registerLocatorPaths(Set<LocatorPaths> locatorPathsSet) {
        this.locatorPaths.addAll(locatorPathsSet);
        clearCache();
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/sling/i18n/impl/JcrResourceBundle.java`
#### Snippet
```java
     * @throws NullPointerException if either of the parameters is {@code null}.
     */
    private Map<String, Object> loadFully(final ResourceResolver resolver, Set<String> roots, Set<String> languageRoots) {

        final String[] searchPath = resolver.getSearchPath();
```

### BoundedWildcard
Can generalize to `? extends LocatorPaths`
in `src/main/java/org/apache/sling/i18n/impl/JcrResourceBundle.java`
#### Snippet
```java
            final Locale locale, 
            final String baseName,
            final Collection<LocatorPaths> locatorPaths,
            final PathFilter filter) {
        final Set<String> paths = new LinkedHashSet<>();
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/sling/i18n/impl/JcrResourceBundle.java`
#### Snippet
```java
     * Depth-first traversal of a resource tree
     */
    private void scanForSlingMessages(final Resource rsrc, final Map<String, Object> targetDictionary) {
        final ValueMap vm = rsrc.adaptTo(ValueMap.class);
        if ( vm != null ) {
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/sling/i18n/impl/JcrResourceBundle.java`
#### Snippet
```java
    }

    private void loadJsonDictionary(Resource resource, final Map<String, Object> targetDictionary) {
        log.info("Loading json dictionary: {}", resource.getPath());

```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/org/apache/sling/i18n/impl/I18NFilter.java`
#### Snippet
```java

    /** Logger */
    private final static Logger LOG = LoggerFactory.getLogger(I18NFilter.class.getName());

    private final DefaultLocaleResolver DEFAULT_LOCALE_RESOLVER = new DefaultLocaleResolver();
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
Variable `serviceRegistration` initializer `null` is redundant
in `src/main/java/org/apache/sling/i18n/impl/JcrResourceBundleProvider.java`
#### Snippet
```java

    private void unregisterResourceBundle(Key key) {
        ServiceRegistration<ResourceBundle> serviceRegistration = null;
        synchronized (this) {
            serviceRegistration = bundleServiceRegistrations.remove(key);
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `resource.getResourceType() == null` is always `false`
in `src/main/java/org/apache/sling/i18n/impl/JcrResourceBundleProvider.java`
#### Snippet
```java
            return false;
        }
        if ( resource.getResourceType() == null ) {
            return false;
        }
```

