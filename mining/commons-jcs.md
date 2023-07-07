# commons-jcs 
 
# Bad smells
I found 1720 bad smells with 5 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocDeclaration | 1342 | false |
| StringConcatenationInsideStringBufferAppend | 133 | false |
| UnusedAssignment | 40 | false |
| StringBufferReplaceableByString | 30 | false |
| RedundantClassCall | 26 | false |
| DataFlowIssue | 24 | false |
| ConstantValue | 11 | false |
| CommentedOutCode | 8 | false |
| DanglingJavadoc | 8 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 8 | false |
| UNCHECKED_WARNING | 6 | false |
| EqualsBetweenInconvertibleTypes | 6 | false |
| DuplicatedCode | 5 | false |
| AutoCloseableResource | 5 | false |
| BusyWait | 5 | false |
| CStyleArrayDeclaration | 4 | false |
| DeprecatedIsStillUsed | 4 | false |
| UnnecessaryCallToStringValueOf | 4 | false |
| FieldCanBeLocal | 4 | false |
| IgnoreResultOfCall | 4 | false |
| CaughtExceptionImmediatelyRethrown | 4 | false |
| StringEquality | 3 | false |
| JavadocReference | 3 | false |
| RegExpSingleCharAlternation | 3 | false |
| RedundantCast | 3 | false |
| FieldMayBeFinal | 3 | false |
| RegExpRedundantEscape | 2 | false |
| RefusedBequest | 2 | false |
| UnnecessaryToStringCall | 2 | true |
| SuspiciousMethodCalls | 2 | false |
| SynchronizeOnNonFinalField | 2 | false |
| InfiniteLoopStatement | 2 | false |
| CastCanBeRemovedNarrowingVariableType | 2 | false |
| UnnecessaryReturn | 1 | true |
| TrivialStringConcatenation | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| SuspiciousToArrayCall | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| FuseStreamOperations | 1 | false |
| CopyConstructorMissesField | 1 | false |
| IntegerDivisionInFloatingPointContext | 1 | false |
| NonAtomicOperationOnVolatileField | 1 | false |
## RuleId[id=StringEquality]
### StringEquality
String values are compared using `==`, not 'equals()'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/admin/JCSAdmin.jsp`
#### Snippet
```java
	//handle display

	if (templateName == ITEM_TEMPLATE_NAME)
	{
	    String key = request.getParameter(KEY_PARAM);
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/admin/JCSAdmin.jsp`
#### Snippet
```java
<%
	}
	else if (templateName == REGION_SUMMARY_TEMPLATE_NAME)
	{
%>
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/admin/JCSAdmin.jsp`
#### Snippet
```java
<%
	}
	else if (templateName == REGION_DETAIL_TEMPLATE_NAME)
	{
%>
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class' to 'java.lang.Class'
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/JCSConfiguration.java`
#### Snippet
```java
    public Class<K> getKeyType()
    {
        return keyType == null ? (Class<K>) Object.class : keyType;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class' to 'java.lang.Class'
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/JCSConfiguration.java`
#### Snippet
```java
    public Class<V> getValueType()
    {
        return valueType == null ? (Class<V>) Object.class : valueType;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/lang/Lang3Substitutor.java`
#### Snippet
```java

        {
            putAll(Map.class.cast(System.getProperties()));
            putAll(System.getenv());
        }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/proxy/ExceptionWrapperHandler.java`
#### Snippet
```java
            final Class<T> apis)
    {
        return (T) Proxy.newProxyInstance(loader, new Class<?>[] { apis }, new ExceptionWrapperHandler<>(delegate, exceptionType));
    }
}
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/cdi/CDIJCacheHelper.java`
#### Snippet
```java
        }

        final Set<Annotation> mtdAnnotations = new HashSet<>(Arrays.asList(ic.getMethod().getAnnotations()));
        final CacheResult cacheResult = ic.getMethod().getAnnotation(CacheResult.class);
        final String cacheResultCacheResultName = cacheResult == null ? null : defaultName(ic.getMethod(), defaults, cacheResult.cacheName());
```

### UNCHECKED_WARNING
Unchecked call to 'HashSet(Collection)' as a member of raw type 'java.util.HashSet'
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/cdi/CDIJCacheHelper.java`
#### Snippet
```java
        }

        final Set<Annotation> mtdAnnotations = new HashSet<>(Arrays.asList(ic.getMethod().getAnnotations()));
        final CacheResult cacheResult = ic.getMethod().getAnnotation(CacheResult.class);
        final String cacheResultCacheResultName = cacheResult == null ? null : defaultName(ic.getMethod(), defaults, cacheResult.cacheName());
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `HttpException`
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheDispatcher.java`
#### Snippet
```java
     *
     * @throws IOException
     * @throws HttpException
     */
    protected <K, V> byte[] processRequest( final byte[] requestAsByteArray,
```

### JavadocReference
Cannot resolve symbol `serializer`
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPCacheFactory.java`
#### Snippet
```java
     * @param attr  ITCPLateralCacheAttributes
     * @param cacheMgr the composite cache manager
     * @param serializer the serializer to use when receiving
     *
     * @return the listener if created, else null
```

### JavadocReference
Cannot resolve symbol `serializer`
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPCacheFactory.java`
#### Snippet
```java
     * @param iaca cache configuration attributes
     * @param cacheMgr the composite cache manager
     * @param serializer the serializer to use when receiving
     */
    private void addListenerIfNeeded( final ITCPLateralCacheAttributes iaca, final ICompositeCacheManager cacheMgr, final IElementSerializer elementSerializer )
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Condition `CacheManagerBean.class.isInstance(bean)` is redundant and can be replaced with a null check
in `commons-jcs-jcache-extras/src/main/java/org/apache/commons/jcs3/jcache/extras/cdi/ExtraJCacheExtension.java`
#### Snippet
```java

        final Bean<A> bean = processBeanEvent.getBean();
        if (CacheManagerBean.class.isInstance(bean) || CacheProviderBean.class.isInstance(bean))
        {
            return;
```

### DataFlowIssue
Method invocation `getTypes` will produce `NullPointerException`
in `commons-jcs-jcache-extras/src/main/java/org/apache/commons/jcs3/jcache/extras/cdi/ExtraJCacheExtension.java`
#### Snippet
```java
        if (!cacheManagerFound)
        {
            cacheManagerFound = bean.getTypes().contains(CacheManager.class);
        }
        if (!cacheProviderFound)
```

### DataFlowIssue
Method invocation `getTypes` may produce `NullPointerException`
in `commons-jcs-jcache-extras/src/main/java/org/apache/commons/jcs3/jcache/extras/cdi/ExtraJCacheExtension.java`
#### Snippet
```java
        if (!cacheProviderFound)
        {
            cacheProviderFound = bean.getTypes().contains(CachingProvider.class);
        }
    }
```

### DataFlowIssue
Condition `HttpServletRequest.class.isInstance(servletRequest)` is redundant and can be replaced with a null check
in `commons-jcs-jcache-extras/src/main/java/org/apache/commons/jcs3/jcache/extras/web/JCacheFilter.java`
#### Snippet
```java
    protected String key(final ServletRequest servletRequest)
    {
        if (HttpServletRequest.class.isInstance(servletRequest))
        {
            final HttpServletRequest request = HttpServletRequest.class.cast(servletRequest);
```

### DataFlowIssue
Method invocation `toString` will produce `NullPointerException`
in `commons-jcs-jcache-extras/src/main/java/org/apache/commons/jcs3/jcache/extras/web/JCacheFilter.java`
#### Snippet
```java
            return request.getMethod() + '_' + request.getRequestURI() + '_' + request.getQueryString();
        }
        return servletRequest.toString();
    }

```

### DataFlowIssue
Condition `HttpServletRequest.class.isInstance(servletRequest)` is redundant and can be replaced with a null check
in `commons-jcs-jcache-extras/src/main/java/org/apache/commons/jcs3/jcache/extras/web/JCacheFilter.java`
#### Snippet
```java
    {
        boolean gzip = false;
        if (HttpServletRequest.class.isInstance(servletRequest))
        {
            final Enumeration<String> acceptEncoding = HttpServletRequest.class.cast(servletRequest).getHeaders("Accept-Encoding");
```

### DataFlowIssue
Variable is already assigned to this value
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/struct/DoubleLinkedList.java`
#### Snippet
```java
            // last but not the first.
            last = (T) ln.prev;
            last.next = null;
        }
        else
```

### DataFlowIssue
Variable is already assigned to this value
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/config/OptionConverter.java`
#### Snippet
```java
                else if ( c == '\b' )
                {
                    c = '\b';
                }
                else if ( c == '\"' )
```

### DataFlowIssue
Variable is already assigned to this value
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/config/OptionConverter.java`
#### Snippet
```java
                else if ( c == '\"' )
                {
                    c = '\"';
                }
                else if ( c == '\'' )
```

### DataFlowIssue
Variable is already assigned to this value
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/config/OptionConverter.java`
#### Snippet
```java
                else if ( c == '\'' )
                {
                    c = '\'';
                }
                else if ( c == '\\' )
```

### DataFlowIssue
Variable is already assigned to this value
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/config/OptionConverter.java`
#### Snippet
```java
                else if ( c == '\\' )
                {
                    c = '\\';
                }
            }
```

### DataFlowIssue
Method invocation `getInetAddresses` may produce `NullPointerException`
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryService.java`
#### Snippet
```java
                    InetAddress serviceAddress = null;

                    for (Enumeration<InetAddress> addresses = serviceInterface.getInetAddresses();
                            addresses.hasMoreElements();)
                    {
```

### DataFlowIssue
Variable is already assigned to this value
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskCache.java`
#### Snippet
```java
        {
            log.warn("{0}: Problem verifying disk.", logCacheName, e);
            alright = false;
        }
        finally
```

### DataFlowIssue
Condition `Closeable.class.isInstance(delegate)` is redundant and can be replaced with a null check
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/JCSListener.java`
#### Snippet
```java
    public void close()
    {
        if (Closeable.class.isInstance(delegate)) {
            Closeable.class.cast(delegate);
        }
```

### DataFlowIssue
Condition `CacheEntryRemovedListener.class.isInstance(delegate)` is redundant and can be replaced with a null check
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/JCSListener.java`
#### Snippet
```java

        delegate = cacheEntryListenerConfiguration.getCacheEntryListenerFactory().create();
        remove = CacheEntryRemovedListener.class.isInstance(delegate);
        expire = CacheEntryExpiredListener.class.isInstance(delegate);
        update = CacheEntryUpdatedListener.class.isInstance(delegate);
```

### DataFlowIssue
Condition `CacheEntryExpiredListener.class.isInstance(delegate)` is redundant and can be replaced with a null check
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/JCSListener.java`
#### Snippet
```java
        delegate = cacheEntryListenerConfiguration.getCacheEntryListenerFactory().create();
        remove = CacheEntryRemovedListener.class.isInstance(delegate);
        expire = CacheEntryExpiredListener.class.isInstance(delegate);
        update = CacheEntryUpdatedListener.class.isInstance(delegate);
        create = CacheEntryCreatedListener.class.isInstance(delegate);
```

### DataFlowIssue
Condition `CacheEntryUpdatedListener.class.isInstance(delegate)` is redundant and can be replaced with a null check
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/JCSListener.java`
#### Snippet
```java
        remove = CacheEntryRemovedListener.class.isInstance(delegate);
        expire = CacheEntryExpiredListener.class.isInstance(delegate);
        update = CacheEntryUpdatedListener.class.isInstance(delegate);
        create = CacheEntryCreatedListener.class.isInstance(delegate);
    }
```

### DataFlowIssue
Condition `CacheEntryCreatedListener.class.isInstance(delegate)` is redundant and can be replaced with a null check
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/JCSListener.java`
#### Snippet
```java
        expire = CacheEntryExpiredListener.class.isInstance(delegate);
        update = CacheEntryUpdatedListener.class.isInstance(delegate);
        create = CacheEntryCreatedListener.class.isInstance(delegate);
    }

```

### DataFlowIssue
Method invocation `getName` may produce `NullPointerException`
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/JCSCachingManager.java`
#### Snippet
```java
        {
            throw new IllegalArgumentException("this cache is <" + config.getKeyType().getName() + ", " + config.getValueType().getName()
                    + "> " + " and not <" + keyType.getName() + ", " + valueType.getName() + ">");
        }
        return cache;
```

### DataFlowIssue
Condition `JCSCachingProvider.class.isInstance(provider)` is redundant and can be replaced with a null check
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/JCSCachingManager.java`
#### Snippet
```java
        caches.clear();
        closed = true;
        if (JCSCachingProvider.class.isInstance(provider))
        {
            JCSCachingProvider.class.cast(provider).remove(this);
```

### DataFlowIssue
Condition `JCSCache.class.isInstance(cache)` is redundant and can be replaced with a null check
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/proxy/ClassLoaderAwareCache.java`
#### Snippet
```java
    public static <K extends Serializable, V extends Serializable> JCSCache<K, V> getDelegate(final Cache<?, ?> cache)
    {
        if (JCSCache.class.isInstance(cache))
        {
            return (JCSCache<K, V>) cache;
```

### DataFlowIssue
Dereference of `((ClassLoaderAwareCache`) cache) may produce `NullPointerException`
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/proxy/ClassLoaderAwareCache.java`
#### Snippet
```java
            return (JCSCache<K, V>) cache;
        }
        return ((ClassLoaderAwareCache<K, V>) cache).delegate;
    }
}
```

### DataFlowIssue
Condition `OpenJPAConfiguration.class.isInstance(conf)` is redundant and can be replaced with a null check
in `commons-jcs-jcache-openjpa/src/main/java/org/apache/commons/jcs3/jcache/openjpa/OpenJPAJCacheDerivation.java`
#### Snippet
```java
    public boolean beforeConfigurationLoad(final Configuration conf)
    {
        if (OpenJPAConfiguration.class.isInstance(conf)) {
            final OpenJPAConfigurationImpl oconf = OpenJPAConfigurationImpl.class.cast(conf);
            oconf.dataCacheManagerPlugin.setAlias(JCACHE_NAME, OpenJPAJCacheDataCacheManager.class.getName());
```

### DataFlowIssue
Condition `EntryProcessorException.class.isInstance(ex)` is redundant and can be replaced with a null check
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/JCSCache.java`
#### Snippet
```java
    private static <T> T throwEntryProcessorException(final Exception ex)
    {
        if (EntryProcessorException.class.isInstance(ex))
        {
            throw EntryProcessorException.class.cast(ex);
```

## RuleId[id=RedundantClassCall]
### RedundantClassCall
Redundant call to `isInstance()`
in `commons-jcs-jcache-extras/src/main/java/org/apache/commons/jcs3/jcache/extras/closeable/Closeables.java`
#### Snippet
```java
        for (final Object closeable : closeables)
        {
            if (Closeable.class.isInstance(closeable))
            {
                try
```

### RedundantClassCall
Redundant call to `cast()`
in `commons-jcs-jcache-extras/src/main/java/org/apache/commons/jcs3/jcache/extras/closeable/Closeables.java`
#### Snippet
```java
                try
                {
                    Closeable.class.cast(closeable).close();
                } catch (final IOException ex) {
                    if (e == null)
```

### RedundantClassCall
Redundant call to `cast()`
in `commons-jcs-jcache-extras/src/main/java/org/apache/commons/jcs3/jcache/extras/web/JCacheFilter.java`
#### Snippet
```java
            }

            final Page page = Page.class.cast(o);
            return contentLength == page.contentLength
                    && status == page.status
```

### RedundantClassCall
Redundant call to `isInstance()`
in `commons-jcs-jcache-extras/src/main/java/org/apache/commons/jcs3/jcache/extras/web/JCacheFilter.java`
#### Snippet
```java
                for (final Serializable value : entry.getValue())
                {
                    if (Integer.class.isInstance(value))
                    {
                        httpServletResponse.addIntHeader(entry.getKey(), Integer.class.cast(value));
```

### RedundantClassCall
Redundant call to `cast()`
in `commons-jcs-jcache-extras/src/main/java/org/apache/commons/jcs3/jcache/extras/web/JCacheFilter.java`
#### Snippet
```java
                    if (Integer.class.isInstance(value))
                    {
                        httpServletResponse.addIntHeader(entry.getKey(), Integer.class.cast(value));
                    }
                    else if (String.class.isInstance(value))
```

### RedundantClassCall
Redundant call to `isInstance()`
in `commons-jcs-jcache-extras/src/main/java/org/apache/commons/jcs3/jcache/extras/web/JCacheFilter.java`
#### Snippet
```java
                        httpServletResponse.addIntHeader(entry.getKey(), Integer.class.cast(value));
                    }
                    else if (String.class.isInstance(value))
                    {
                        httpServletResponse.addHeader(entry.getKey(), String.class.cast(value));
```

### RedundantClassCall
Redundant call to `cast()`
in `commons-jcs-jcache-extras/src/main/java/org/apache/commons/jcs3/jcache/extras/web/JCacheFilter.java`
#### Snippet
```java
                    else if (String.class.isInstance(value))
                    {
                        httpServletResponse.addHeader(entry.getKey(), String.class.cast(value));
                    }
                    else if (Long.class.isInstance(value))
```

### RedundantClassCall
Redundant call to `isInstance()`
in `commons-jcs-jcache-extras/src/main/java/org/apache/commons/jcs3/jcache/extras/web/JCacheFilter.java`
#### Snippet
```java
                        httpServletResponse.addHeader(entry.getKey(), String.class.cast(value));
                    }
                    else if (Long.class.isInstance(value))
                    {
                        httpServletResponse.addDateHeader(entry.getKey(), Long.class.cast(value));
```

### RedundantClassCall
Redundant call to `cast()`
in `commons-jcs-jcache-extras/src/main/java/org/apache/commons/jcs3/jcache/extras/web/JCacheFilter.java`
#### Snippet
```java
                    else if (Long.class.isInstance(value))
                    {
                        httpServletResponse.addDateHeader(entry.getKey(), Long.class.cast(value));
                    }
                }
```

### RedundantClassCall
Redundant call to `cast()`
in `commons-jcs-jcache-extras/src/main/java/org/apache/commons/jcs3/jcache/extras/web/JCacheFilter.java`
#### Snippet
```java
            }

            final PageKey pageKey = PageKey.class.cast(o);
            return gzip == pageKey.gzip && uri.equals(pageKey.uri);

```

### RedundantClassCall
Redundant call to `cast()`
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/cdi/GeneratedCacheKeyImpl.java`
#### Snippet
```java
            return false;
        }
        final GeneratedCacheKeyImpl that = GeneratedCacheKeyImpl.class.cast(o);
        return Arrays.deepEquals(params, that.params);

```

### RedundantClassCall
Redundant call to `cast()`
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/cdi/CacheResultInterceptor.java`
#### Snippet
```java
                if (exception != null)
                {
                    throw Throwable.class.cast(exception);
                }
            }
```

### RedundantClassCall
Redundant call to `cast()`
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/lang/Lang3Substitutor.java`
#### Snippet
```java

        {
            putAll(Map.class.cast(System.getProperties()));
            putAll(System.getenv());
        }
```

### RedundantClassCall
Redundant call to `cast()`
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/JCSCachingManager.java`
#### Snippet
```java
    {
        final Cache<?, ?> cache = caches.get(cacheName);
        return JCSCache.class.cast(ClassLoaderAwareCache.getDelegate(cache));
    }

```

### RedundantClassCall
Redundant call to `cast()`
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/JCSCachingManager.java`
#### Snippet
```java
                        new JCSConfiguration<K, V>(configuration, keyType, valueType),
                        properties,
                        ExpiryAwareCache.class.cast(delegate.getCache(cacheName))));
        caches.putIfAbsent(cacheName, cache);
        return getCache(cacheName, keyType, valueType);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/proxy/ExceptionWrapperHandler.java`
#### Snippet
```java
        {
            final Throwable e = ite.getCause();
            if (RuntimeException.class.isInstance(e))
            {
                final RuntimeException re;
```

### RedundantClassCall
Redundant call to `cast()`
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/jmx/ConfigurableMBeanServerIdBuilder.java`
#### Snippet
```java
            }

            final Key key = Key.class.cast(o);
            return !(domain != null ? !domain.equals(key.domain) : key.domain != null)
                    && !(outer != null ? !outer.equals(key.outer) : key.outer != null);
```

### RedundantClassCall
Redundant call to `cast()`
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/cdi/CDIJCacheHelper.java`
#### Snippet
```java
                return false;
            }
            final MethodKey classKey = MethodKey.class.cast(o);
            return delegate.equals(classKey.delegate) &&
                (base == null && classKey.base == null || base != null && base.equals(classKey.base));
```

### RedundantClassCall
Redundant call to `isInstance()`
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/proxy/ClassLoaderAwareCache.java`
#### Snippet
```java
    public boolean equals(final Object obj)
    {
        if (ClassLoaderAwareCache.class.isInstance(obj))
        {
            return delegate.equals(ClassLoaderAwareCache.class.cast(obj).delegate);
```

### RedundantClassCall
Redundant call to `cast()`
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/proxy/ClassLoaderAwareCache.java`
#### Snippet
```java
        if (ClassLoaderAwareCache.class.isInstance(obj))
        {
            return delegate.equals(ClassLoaderAwareCache.class.cast(obj).delegate);
        }
        return super.equals(obj);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/JCSCache.java`
#### Snippet
```java
    private static void close(final Object potentiallyCloseable)
    {
        if (Closeable.class.isInstance(potentiallyCloseable))
        {
            Closeable.class.cast(potentiallyCloseable);
```

### RedundantClassCall
Redundant call to `cast()`
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/JCSCache.java`
#### Snippet
```java
        if (Closeable.class.isInstance(potentiallyCloseable))
        {
            Closeable.class.cast(potentiallyCloseable);
        }
    }
```

### RedundantClassCall
Redundant call to `isInstance()`
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/JCSCache.java`
#### Snippet
```java
                final boolean eternal = duration.isEternal();
                copy.setIsEternal(eternal);
                if (ElementAttributes.class.isInstance(copy)) {
                    ElementAttributes.class.cast(copy).setCreateTime();
                }
```

### RedundantClassCall
Redundant call to `cast()`
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/JCSCache.java`
#### Snippet
```java
                copy.setIsEternal(eternal);
                if (ElementAttributes.class.isInstance(copy)) {
                    ElementAttributes.class.cast(copy).setCreateTime();
                }
                if (!eternal)
```

### RedundantClassCall
Redundant call to `isInstance()`
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/JCSCache.java`
#### Snippet
```java
            {
                final IElementAttributes clone = delegate.getElementAttributes().clone();
                if (ElementAttributes.class.isInstance(clone))
                {
                    ElementAttributes.class.cast(clone).setCreateTime();
```

### RedundantClassCall
Redundant call to `cast()`
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/JCSCache.java`
#### Snippet
```java
                if (ElementAttributes.class.isInstance(clone))
                {
                    ElementAttributes.class.cast(clone).setCreateTime();
                }
                final ICacheElement<K, V> element = updateElement(key, v, duration, clone);
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `auxNames`
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCacheConfigurator.java`
#### Snippet
```java
            log.debug( "Parsing region name \"{0}\", value \"{1}\"", regName, auxiliaries );

            String auxNames[] = auxiliaries.split("\\s*,\\s*");

            // just to be on the safe side...
```

### CStyleArrayDeclaration
C-style array declaration of local variable `timeStrings`
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/mysql/util/ScheduleParser.java`
#### Snippet
```java
        }

        final String timeStrings[] = schedule.split("\\s*,\\s*");
        final Date[] dates = new Date[timeStrings.length];
        int cnt = 0;
```

### CStyleArrayDeclaration
C-style array declaration of local variable `servers`
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPCacheFactory.java`
#### Snippet
```java
        if (lac.getTcpServers() != null && !lac.getTcpServers().isEmpty())
        {
            final String servers[] = lac.getTcpServers().split("\\s*,\\s*");
            log.debug( "Configured for [{0}] servers.", servers.length );

```

### CStyleArrayDeclaration
C-style array declaration of parameter `args`
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java
     */
    @Deprecated
    public static void main( final String args[] )
    {
        try
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'waitForMessage' is still used
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryReceiver.java`
#### Snippet
```java
     */
    @Deprecated
    public Object waitForMessage()
        throws IOException
    {
```

### DeprecatedIsStillUsed
Deprecated member 'isStartRegistry' is still used
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServerAttributes.java`
#### Snippet
```java
    @Deprecated
    @Override
    public boolean isStartRegistry()
    {
        return startRegistry;
```

### DeprecatedIsStillUsed
Deprecated member 'PositionComparator' is still used
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java
     */
    @Deprecated
    protected static final class PositionComparator implements Comparator<IndexedDiskElementDescriptor>, Serializable
    {
        /** serialVersionUID */
```

### DeprecatedIsStillUsed
Deprecated member 'noWaits' is still used
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCacheNoWaitFacade.java`
#### Snippet
```java
     */
    @Deprecated
    public LateralCacheNoWait<K, V>[] noWaits;

    /**
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/access/JCSWorker.java`
#### Snippet
```java
    {
        V result = null;
        // long start = 0;
        // long dbTime = 0;
        final JCSWorkerHelper<V> helper = map.putIfAbsent(getRegion() + aKey, aHelper);
```

### CommentedOutCode
Commented out code (2 lines)
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/config/PropertySetter.java`
#### Snippet
```java
                if ( key.indexOf( '.', len + 1 ) > 0 )
                {
                    //System.err.println("----------Ignoring---["+key
                    //	     +"], prefix=["+prefix+"].");
                    continue;
```

### CommentedOutCode
Commented out code (4 lines)
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteAuxiliaryCache.java`
#### Snippet
```java
        elems.add(new StatElement<>( "Remote Type", this.getRemoteCacheAttributes().getRemoteTypeName() ) );

//      if ( this.getRemoteCacheAttributes().getRemoteType() == RemoteType.CLUSTER )
//      {
//          // something cluster specific
```

### CommentedOutCode
Commented out code (6 lines)
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteUtils.java`
#### Snippet
```java
        Registry registry = null;

        // if ( log.isInfoEnabled() )
        // {
        // log.info( "createRegistry> Setting security manager" );
```

### CommentedOutCode
Commented out code (5 lines)
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCacheAttributes.java`
#### Snippet
```java
    {
        final StringBuilder buf = new StringBuilder();
        //buf.append( "cacheName=" + cacheName + "\n" );
        //buf.append( "putOnlyMode=" + putOnlyMode + "\n" );
        //buf.append( "transmissionTypeName=" + transmissionTypeName + "\n" );
```

### CommentedOutCode
Commented out code (2 lines)
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCacheNoWait.java`
#### Snippet
```java
        // be more than one per cache? alternative is to have the cache
        // perform updates using a different method that specifies the listener
        // this.q = new CacheEventQueue(new CacheAdaptor(this),
        // LateralCacheInfo.listenerId, cache.getCacheName());
        if ( cache.getStatus() == CacheStatus.ERROR )
```

### CommentedOutCode
Commented out code (2 lines)
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/JCSListener.java`
#### Snippet
```java
public class JCSListener<K, V> implements Closeable
{
//    private final boolean oldValue;
//    private final boolean synchronous;
    private final CacheEntryEventFilter<? super K, ? super V> filter;
```

### CommentedOutCode
Commented out code (2 lines)
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/JCSListener.java`
#### Snippet
```java
    public JCSListener(final CacheEntryListenerConfiguration<K, V> cacheEntryListenerConfiguration)
    {
//        oldValue = cacheEntryListenerConfiguration.isOldValueRequired();
//        synchronous = cacheEntryListenerConfiguration.isSynchronous();

```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskCache.java`
#### Snippet
```java

        // Make a clean file name
        this.fileName = getCacheName().replaceAll("[^a-zA-Z0-9-_\\.]", "_");
        this.rootDirectory = cacheAttributes.getDiskPath();

```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java
        this.diskLimitType = cattr.getDiskLimitType();
        // Make a clean file name
        this.fileName = getCacheName().replaceAll("[^a-zA-Z0-9-_\\.]", "_");
        this.keyHash = createInitialKeyMap();
        this.queuedPutList = new ConcurrentSkipListSet<>(new PositionComparator());
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/timing/ElapsedTimer.java`
#### Snippet
```java
    public String getElapsedTimeString()
    {
        return String.valueOf( getElapsedTime() ) + SUFFIX;
    }
}
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ElementAttributes.java`
#### Snippet
```java
        dump.append( ", CreateTime = " ).append( this.getCreateTime() );
        dump.append( ", LastAccessTime = " ).append( this.getLastAccessTime() );
        dump.append( ", getTimeToLiveSeconds() = " ).append( String.valueOf( getTimeToLiveSeconds() ) );
        dump.append( ", createTime = " ).append( String.valueOf( createTime ) ).append( " ]" );

```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ElementAttributes.java`
#### Snippet
```java
        dump.append( ", LastAccessTime = " ).append( this.getLastAccessTime() );
        dump.append( ", getTimeToLiveSeconds() = " ).append( String.valueOf( getTimeToLiveSeconds() ) );
        dump.append( ", createTime = " ).append( String.valueOf( createTime ) ).append( " ]" );

        return dump.toString();
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCacheAttributes.java`
#### Snippet
```java
        //buf.append( "transmissionType=" + transmissionType + "\n" );
        //buf.append( "tcpServer=" + tcpServer + "\n" );
        buf.append( transmissionType.toString() + httpServer + udpMulticastAddr + String.valueOf( udpMulticastPort ) );
        return buf.toString();
    }
```

## RuleId[id=RefusedBequest]
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryAttributes.java`
#### Snippet
```java
    /** @return a clone of this object */
    @Override
    public UDPDiscoveryAttributes clone()
    {
        final UDPDiscoveryAttributes attributes = new UDPDiscoveryAttributes();
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/threadpool/PoolConfiguration.java`
#### Snippet
```java
     */
    @Override
    public PoolConfiguration clone()
    {
        return new PoolConfiguration( isUseBoundary(), boundarySize, maximumPoolSize, minimumPoolSize, keepAliveTime,
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCache.java`
#### Snippet
```java
        if (keys != null)
        {
            return keys.stream()
                .map(key -> {
                    try
                    {
                        return get(key);
                    }
                    catch (final IOException e)
                    {
                        return null;
                    }
                })
                .filter(Objects::nonNull)
                .collect(Collectors.toMap(
                        ICacheElement::getKey,
                        element -> element));
        }

        return new HashMap<>();
```

### DuplicatedCode
Duplicated code
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCacheNoWait.java`
#### Snippet
```java
        if ( keys != null && !keys.isEmpty() )
        {
            return keys.stream()
                .collect(Collectors.toMap(
                        key -> key,
                        this::get)).entrySet().stream()
                    .filter(entry -> entry.getValue() != null)
                    .collect(Collectors.toMap(
                            Entry::getKey,
                            Entry::getValue));
        }

        return new HashMap<>();
```

### DuplicatedCode
Duplicated code
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
        ICacheElement<K, V> element = null;
        final ICacheEvent<K> cacheEvent = createICacheEvent( cacheName, key, requesterId, ICacheEventLogger.GET_EVENT );
        try
        {
            element = processGet( cacheName, key, requesterId );
        }
        finally
        {
            logICacheEvent( cacheEvent );
        }
        return element;
```

### DuplicatedCode
Duplicated code
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/log/JulLogAdapter.java`
#### Snippet
```java
        if (logger.isLoggable(level))
        {
            final MessageFormatter formatter = new MessageFormatter(message, params);
            if (formatter.hasThrowable())
            {
                logger.logp(level, logger.getName(), "",
                        formatter.getFormattedMessage(), formatter.getThrowable());
            }
            else
            {
                logger.logp(level, logger.getName(), "",
                        formatter.getFormattedMessage());
            }
        }
```

### DuplicatedCode
Duplicated code
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/cdi/CDIJCacheHelper.java`
#### Snippet
```java
        final String cacheResultCacheResultName = cacheResult == null ? null : defaultName(ic.getMethod(), defaults, cacheResult.cacheName());
        final CacheResolverFactory cacheResultCacheResolverFactory = cacheResult == null ?
                null : cacheResolverFactoryFor(defaults, cacheResult.cacheResolverFactory());
        final CacheKeyGenerator cacheResultCacheKeyGenerator = cacheResult == null ?
                null : cacheKeyGeneratorFor(defaults, cacheResult.cacheKeyGenerator());
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder buf` can be replaced with 'String'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/admin/CacheElementInfo.java`
#### Snippet
```java
    public String toString()
    {
        final StringBuilder buf = new StringBuilder();
        buf.append( "\nCacheElementInfo " );
        buf.append( "\n Key [" ).append( getKey() ).append( "]" );
```

### StringBufferReplaceableByString
`StringBuilder buf` can be replaced with 'String'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/DiscoveredService.java`
#### Snippet
```java
    public String toString()
    {
        final StringBuilder buf = new StringBuilder();
        buf.append( "\n DiscoveredService" );
        buf.append( "\n CacheNames = [" + getCacheNames() + "]" );
```

### StringBufferReplaceableByString
`StringBuilder buf` can be replaced with 'String'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryAttributes.java`
#### Snippet
```java
    public String toString()
    {
        final StringBuilder buf = new StringBuilder();
        buf.append( "\n UDPDiscoveryAttributes" );
        buf.append( "\n ServiceName = [" + getServiceName() + "]" );
```

### StringBufferReplaceableByString
`StringBuilder buf` can be replaced with 'String'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/threadpool/PoolConfiguration.java`
#### Snippet
```java
    public String toString()
    {
        final StringBuilder buf = new StringBuilder();
        buf.append( "useBoundary = [" + isUseBoundary() + "] " );
        buf.append( "boundarySize = [" + boundarySize + "] " );
```

### StringBufferReplaceableByString
`StringBuilder dump` can be replaced with 'String'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ElementAttributes.java`
#### Snippet
```java
    public String toString()
    {
        final StringBuilder dump = new StringBuilder();

        dump.append( "[ IS_LATERAL = " ).append( IS_LATERAL );
```

### StringBufferReplaceableByString
`StringBuilder dump` can be replaced with 'String'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CompositeCacheAttributes.java`
#### Snippet
```java
    public String toString()
    {
        final StringBuilder dump = new StringBuilder();

        dump.append( "[ " );
```

### StringBufferReplaceableByString
`StringBuilder buf` can be replaced with 'String'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/stats/StatElement.java`
#### Snippet
```java
    public String toString()
    {
        final StringBuilder buf = new StringBuilder();
        buf.append( name ).append(" = ").append( data );
        return buf.toString();
```

### StringBufferReplaceableByString
`StringBuilder buf` can be replaced with 'String'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheElementSerialized.java`
#### Snippet
```java
    public String toString()
    {
        final StringBuilder buf = new StringBuilder();
        buf.append( "\n CacheElementSerialized: " );
        buf.append( "\n CacheName = [" + getCacheName() + "]" );
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/AbstractCacheEventQueue.java`
#### Snippet
```java
        public String toString()
        {
            return new StringBuilder( "PutEvent for key: " )
                    .append( ice.getKey() )
                    .append( " value: " )
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/AbstractCacheEventQueue.java`
#### Snippet
```java
        public String toString()
        {
            return new StringBuilder( "RemoveEvent for " )
                    .append( key )
                    .toString();
```

### StringBufferReplaceableByString
`StringBuilder buf` can be replaced with 'String'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/PurgatoryElement.java`
#### Snippet
```java
    public String toString()
    {
        final StringBuilder buf = new StringBuilder();
        buf.append( "[PurgatoryElement: " );
        buf.append( " isSpoolable = " + isSpoolable() );
```

### StringBufferReplaceableByString
`StringBuilder str` can be replaced with 'String'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCacheAttributes.java`
#### Snippet
```java
    public String toString()
    {
        final StringBuilder str = new StringBuilder();
        str.append("AbstractDiskCacheAttributes ");
        str.append("\n diskPath = " + getDiskPath());
```

### StringBufferReplaceableByString
`StringBuilder str` can be replaced with 'String'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/TableState.java`
#### Snippet
```java
    public String toString()
    {
        final StringBuilder str = new StringBuilder();
        str.append( "TableState " );
        str.append( "\n TableName = " + getTableName() );
```

### StringBufferReplaceableByString
`StringBuilder buf` can be replaced with 'String'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/JDBCDiskCacheAttributes.java`
#### Snippet
```java
    public String toString()
    {
        final StringBuilder buf = new StringBuilder();
        buf.append( "\nJDBCCacheAttributes" );
        buf.append( "\n UserName [" + getUserName() + "]" );
```

### StringBufferReplaceableByString
`StringBuilder buf` can be replaced with 'String'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/mysql/MySQLDiskCacheAttributes.java`
#### Snippet
```java
    public String toString()
    {
        final StringBuilder buf = new StringBuilder();
        buf.append( "\nMySQLDiskCacheAttributes" );
        buf.append( "\n OptimizationSchedule [" + getOptimizationSchedule() + "]" );
```

### StringBufferReplaceableByString
`StringBuilder str` can be replaced with 'String'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskCacheAttributes.java`
#### Snippet
```java
    public String toString()
    {
        final StringBuilder str = new StringBuilder();
        str.append( "\nBlockDiskAttributes " );
        str.append( "\n DiskPath [" + this.getDiskPath() + "]" );
```

### StringBufferReplaceableByString
`StringBuilder buf` can be replaced with 'String'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskElementDescriptor.java`
#### Snippet
```java
    public String toString()
    {
        final StringBuilder buf = new StringBuilder();
        buf.append( "[DED: " );
        buf.append( " pos = " + pos );
```

### StringBufferReplaceableByString
`StringBuilder str` can be replaced with 'String'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCacheAttributes.java`
#### Snippet
```java
    public String toString()
    {
        final StringBuilder str = new StringBuilder();
        str.append( "IndexedDiskCacheAttributes " );
        str.append( "\n diskPath = " + super.getDiskPath() );
```

### StringBufferReplaceableByString
`StringBuilder buf` can be replaced with 'String'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteCacheListener.java`
#### Snippet
```java
    public String toString()
    {
        final StringBuilder buf = new StringBuilder();
        buf.append( "\n AbstractRemoteCacheListener: " )
           .append( "\n RemoteHost = ").append(irca.getRemoteLocation())
```

### StringBufferReplaceableByString
`StringBuilder buf` can be replaced with 'String'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheListener.java`
#### Snippet
```java
    public String toString()
    {
        final StringBuilder buf = new StringBuilder();
        buf.append( "\n RemoteCacheListener: " );
        buf.append( super.toString() );
```

### StringBufferReplaceableByString
`StringBuilder buf` can be replaced with 'String'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheAttributes.java`
#### Snippet
```java
    public String toString()
    {
        final StringBuilder buf = new StringBuilder(super.toString());
        buf.append( "\n receive = [" + isReceive() + "]" );
        buf.append( "\n getTimeoutMillis = [" + getGetTimeoutMillis() + "]" );
```

### StringBufferReplaceableByString
`StringBuilder buf` can be replaced with 'String'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheAttributes.java`
#### Snippet
```java
    public String toString()
    {
        final StringBuilder buf = new StringBuilder();
        buf.append( "\n RemoteHttpCacheAttributes" );
        buf.append( "\n maxConnectionsPerHost = [" + getMaxConnectionsPerHost() + "]" );
```

### StringBufferReplaceableByString
`StringBuilder buf` can be replaced with 'String'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheServerAttributes.java`
#### Snippet
```java
    public String toString()
    {
        final StringBuilder buf = new StringBuilder();
        buf.append( "\nRemoteHttpCacheServiceAttributes" );
        buf.append( "\n cacheName = [" + this.getCacheName() + "]" );
```

### StringBufferReplaceableByString
`StringBuilder buf` can be replaced with 'String'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/value/RemoteCacheResponse.java`
#### Snippet
```java
    public String toString()
    {
        final StringBuilder buf = new StringBuilder();
        buf.append( "\nRemoteHttpCacheResponse" );
        buf.append( "\n success [" + isSuccess() + "]" );
```

### StringBufferReplaceableByString
`StringBuilder buf` can be replaced with 'String'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/value/RemoteCacheRequest.java`
#### Snippet
```java
    public String toString()
    {
        final StringBuilder buf = new StringBuilder();
        buf.append( "\nRemoteHttpCacheRequest" );
        buf.append( "\n requesterId [" + getRequesterId() + "]" );
```

### StringBufferReplaceableByString
`StringBuilder buf` can be replaced with 'String'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServerAttributes.java`
#### Snippet
```java
    public String toString()
    {
        final StringBuilder buf = new StringBuilder(super.toString());
        buf.append( "\n servicePort = [" + this.getServicePort() + "]" );
        buf.append( "\n allowClusterGet = [" + this.isAllowClusterGet() + "]" );
```

### StringBufferReplaceableByString
`StringBuilder buf` can be replaced with 'String'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCacheAttributes.java`
#### Snippet
```java
    public String toString()
    {
        final StringBuilder buf = new StringBuilder();
        //buf.append( "cacheName=" + cacheName + "\n" );
        //buf.append( "putOnlyMode=" + putOnlyMode + "\n" );
```

### StringBufferReplaceableByString
`StringBuilder buf` can be replaced with 'String'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralElementDescriptor.java`
#### Snippet
```java
    public String toString()
    {
        final StringBuilder buf = new StringBuilder();
        buf.append( "\n LateralElementDescriptor " );
        buf.append( "\n command = [" + this.command + "]" );
```

### StringBufferReplaceableByString
`StringBuilder buf` can be replaced with 'String'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCacheNoWait.java`
#### Snippet
```java
    public String toString()
    {
        final StringBuilder buf = new StringBuilder();
        buf.append( " LateralCacheNoWait " );
        buf.append( " Status = " + this.getStatus() );
```

### StringBufferReplaceableByString
`StringBuilder buf` can be replaced with 'String'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCache.java`
#### Snippet
```java
    public String toString()
    {
        final StringBuilder buf = new StringBuilder();
        buf.append( "\n LateralCache " );
        buf.append( "\n Cache Name [" + lateralCacheAttributes.getCacheName() + "]" );
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/shrinking/ShrinkerThread.java`
#### Snippet
```java

            // stop for now
            return;
        }
    }
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheService.java`
#### Snippet
```java
    protected String getExtraInfoForRequesterId( final long requesterId )
    {
        return requesterId + "";
    }
}
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/JDBCDiskCache.java`
#### Snippet
```java
                if ( partial )
                {
                    psSelect.setString( 2, key.toString() + "%" );
                }
                else
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java
        catch ( final IOException e )
        {
            System.out.println( e.toString() );
        }
    }
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `ForceIdMBeanServerDelegate` may be 'static'
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/jmx/ConfigurableMBeanServerIdBuilder.java`
#### Snippet
```java
    }

    private class ForceIdMBeanServerDelegate extends MBeanServerDelegate
    {
        private final MBeanServerDelegate delegate;
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryService.java`
#### Snippet
```java
                this::serviceRequestBroadcast, 0, 15, TimeUnit.SECONDS);

        /** removes things that have been idle for too long */
        // I'm going to use this as both, but it could happen
        // that something could hang around twice the time using this as the
```

### DanglingJavadoc
Dangling Javadoc comment
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheEventQueue.java`
#### Snippet
```java
    public QueueType getQueueType()
    {
        /** The type of queue -- there are pooled and single */
        return QueueType.SINGLE;
    }
```

### DanglingJavadoc
Dangling Javadoc comment
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/PooledCacheEventQueue.java`
#### Snippet
```java
    public QueueType getQueueType()
    {
        /** The type of queue -- there are pooled and single */
        return QueueType.POOLED;
    }
```

### DanglingJavadoc
Dangling Javadoc comment
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/event/behavior/ElementEventType.java`
#### Snippet
```java
    SPOOLED_NOT_ALLOWED //,

    /** Removed actively by a remove command. (Could distinguish between local and remote) */
    //REMOVED,
    /**
```

### DanglingJavadoc
Dangling Javadoc comment
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/event/behavior/ElementEventType.java`
#### Snippet
```java
    /** Removed actively by a remove command. (Could distinguish between local and remote) */
    //REMOVED,
    /**
     * Element was requested from cache. Not sure we ever want to implement this.
     */
```

### DanglingJavadoc
Dangling Javadoc comment
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/logging/behavior/ICacheEventLogger.java`
#### Snippet
```java
    String DISPOSE_EVENT = "dispose";

    /** ICache enqueue. The time in the queue. */
    //String ENQUEUE_EVENT = "enqueue";
    /**
```

### DanglingJavadoc
Dangling Javadoc comment
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCache.java`
#### Snippet
```java
    }

    /**
     * Before the event logging layer, the subclasses implemented the do* methods. Now the do*
     * methods call the *WithEventLogging method on the super. The *WithEventLogging methods call
```

### DanglingJavadoc
Dangling Javadoc comment
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/JCSConfiguration.java`
#### Snippet
```java
 * under the License.
 */
/**
 *  Copyright 2003-2010 Terracotta, Inc.
 *
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/struct/AbstractLRUMap.java`
#### Snippet
```java
    {
        V ce = null;
        final LRUElementDescriptor<K, V> me = map.get( key );

        if ( me != null )
```

### SuspiciousMethodCalls
Suspicious call to 'Map.containsKey()'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/AbstractDoubleLinkedListMemoryCache.java`
#### Snippet
```java
                        getCacheName(), val);
                dumpCacheEntries();
                if (map.containsKey(val))
                {
                    log.error("verifycache: map contains key");
```

## RuleId[id=EqualsBetweenInconvertibleTypes]
### EqualsBetweenInconvertibleTypes
`==` between objects of inconvertible types 'Class' and 'Class'
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/cdi/CDIJCacheHelper.java`
#### Snippet
```java
            for (final Annotation a : set)
            {
                if (a.annotationType() == CacheKey.class)
                {
                    list.add(idx);
```

### EqualsBetweenInconvertibleTypes
`==` between objects of inconvertible types 'Class' and 'Class'
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/cdi/CDIJCacheHelper.java`
#### Snippet
```java
            for (final Annotation a : set)
            {
                if (a.annotationType() == CacheValue.class)
                {
                    return idx;
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class' and 'Class'
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/cdi/CDIJCacheHelper.java`
#### Snippet
```java
            for (final Annotation a : annotations)
            {
                if (a.annotationType().equals(CacheKey.class))
                {
                    keys.add(i);
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class' and 'Class'
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/cdi/CDIJCacheHelper.java`
#### Snippet
```java
                for (final Annotation a : annotations)
                {
                    if (a.annotationType().equals(CacheValue.class))
                    {
                        value = true;
```

### EqualsBetweenInconvertibleTypes
`==` between objects of inconvertible types 'Class' and 'Class'
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/cdi/CDIJCacheHelper.java`
#### Snippet
```java
        if (beans.isEmpty())
        {
            if (CacheKeyGenerator.class == type) {
                return (T) defaultCacheKeyGenerator;
            }
```

### EqualsBetweenInconvertibleTypes
`==` between objects of inconvertible types 'Class' and 'Class'
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/cdi/CDIJCacheHelper.java`
#### Snippet
```java
                return (T) defaultCacheKeyGenerator;
            }
            if (CacheResolverFactory.class == type) {
                return (T) defaultCacheResolverFactory();
            }
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryService.java`
#### Snippet
```java

    /** thread that listens for messages */
    private Thread udpReceiverThread;

    /** the runnable that the receiver thread runs */
```

### FieldCanBeLocal
Field can be converted to a local variable
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskKeyStore.java`
#### Snippet
```java

    /** Attributes governing the behavior of the block disk cache. */
    private final BlockDiskCacheAttributes blockDiskCacheAttributes;

    /** The key to block map */
```

### FieldCanBeLocal
Field can be converted to a local variable
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskCache.java`
#### Snippet
```java

    /** The root directory for keys and data. */
    private final File rootDirectory;

    /** Store, loads, and persists the keys */
```

### FieldCanBeLocal
Field can be converted to a local variable
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RegistryKeepAliveRunner.java`
#### Snippet
```java

    /** the registry */
    private Registry registry;

    /**
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `Stream.findFirst()` is ignored
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/struct/AbstractLRUMap.java`
#### Snippet
```java
                return false;
            })
            .findFirst();
    }

```

### IgnoreResultOfCall
Result of `LinkedBlockingQueue.remove()` is ignored
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/soft/SoftReferenceMemoryCache.java`
#### Snippet
```java
    protected void lockedRemoveElement(final MemoryElementDescriptor<K, V> me)
    {
        strongReferences.remove(me.getCacheElement());
    }

```

### IgnoreResultOfCall
Result of `LinkedBlockingDeque.remove()` is ignored
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCacheManager.java`
#### Snippet
```java
    public void deregisterShutdownObserver( final IShutdownObserver observer )
    {
        shutdownObservers.remove( observer );
    }

```

### IgnoreResultOfCall
Result of `FileChannel.write()` is ignored
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskKeyStore.java`
#### Snippet
```java
                ByteBuffer signature = ByteBuffer.allocate(4);
                signature.putInt(KEY_FILE_SIGNATURE).flip();
                bc.write(signature);

                // don't need to synchronize, since the underlying
```

## RuleId[id=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `ctx`
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/dsfactory/JndiDataSourceFactory.java`
#### Snippet
```java
            try
            {
                synchronized (ctx)
                {
                    ds = (DataSource) ctx.lookup(path);
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `this.lateralWatch`
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPCacheFactory.java`
#### Snippet
```java
        throws IOException
    {
        synchronized ( this.lateralWatch )
        {
            lateralWatch.addCacheListener( cacheName, listener );
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
getUdpDiscoveryAttributes().getMaxIdleTimeSec() \* 1000: integer multiplication implicitly cast to long
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryService.java`
#### Snippet
```java
        getDiscoveredServices().stream()
            .filter(service -> {
                if (now - service.getLastHearFromTime() > getUdpDiscoveryAttributes().getMaxIdleTimeSec() * 1000)
                {
                    log.info( "Removing service, since we haven't heard from it in "
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'BufferedOutputStream' used without 'try'-with-resources statement
in `commons-jcs-jcache-extras/src/main/java/org/apache/commons/jcs3/jcache/extras/web/JCacheFilter.java`
#### Snippet
```java
            }
            httpServletResponse.setContentLength(page.out.length);
            final BufferedOutputStream bos = new BufferedOutputStream(httpServletResponse.getOutputStream());
            if (page.out.length != 0)
            {
```

### AutoCloseableResource
'SelectableChannel' used without 'try'-with-resources statement
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryReceiver.java`
#### Snippet
```java
                        log.debug( "{0} messages received.", this::getCnt );

                        DatagramChannel mc = (DatagramChannel) key.channel();

                        ByteBuffer byteBuffer = ByteBuffer.allocate(65536);
```

### AutoCloseableResource
'SelectableChannel' used without 'try'-with-resources statement
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPListener.java`
#### Snippet
```java
                    if (key.isAcceptable())
                    {
                        ServerSocketChannel server = (ServerSocketChannel) key.channel();
                        SocketChannel client = server.accept();
                        if (client == null)
```

### AutoCloseableResource
'ServerSocketChannel' used without 'try'-with-resources statement
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPListener.java`
#### Snippet
```java
            shutdown.set(false);

            final ServerSocketChannel serverSocket = ServerSocketChannel.open();

            SocketAddress endPoint;
```

### AutoCloseableResource
'JCSListener' used without 'try'-with-resources statement
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/JCSCache.java`
#### Snippet
```java
    {
        assertNotClosed();
        listeners.remove(cacheEntryListenerConfiguration);
        config.removeListener(cacheEntryListenerConfiguration);
    }
```

## RuleId[id=RegExpSingleCharAlternation]
### RegExpSingleCharAlternation
Single character alternation in RegExp
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/JCSCachingManager.java`
#### Snippet
```java
        delegate.setJmxName(CompositeCacheManager.JMX_OBJECT_NAME
                + ",provider=" + provider.hashCode()
                + ",uri=" + uri.toString().replaceAll(",|:|=|\n", ".")
                + ",classloader=" + loader.hashCode()
                + ",properties=" + this.properties.hashCode());
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/JCSCache.java`
#### Snippet
```java
        statistics.setActive(config.isStatisticsEnabled());

        final String mgrStr = manager.getURI().toString().replaceAll(",|:|=|\n", ".");
        final String cacheStr = name.replaceAll(",|:|=|\n", ".");
        try
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/JCSCache.java`
#### Snippet
```java

        final String mgrStr = manager.getURI().toString().replaceAll(",|:|=|\n", ".");
        final String cacheStr = name.replaceAll(",|:|=|\n", ".");
        try
        {
```

## RuleId[id=InfiniteLoopStatement]
### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskKeyStore.java`
#### Snippet
```java
                     ObjectInputStream ois = new ObjectInputStreamClassLoaderAware(fis, null))
                {
                    while (true)
                    {
                        @SuppressWarnings("unchecked")
```

### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPListener.java`
#### Snippet
```java
            try (InputStream is = socket.getInputStream())
            {
                while ( true )
                {
                    final LateralElementDescriptor<K, V> led =
```

## RuleId[id=SuspiciousToArrayCall]
### SuspiciousToArrayCall
Array of type 'org.apache.commons.jcs3.engine.stats.behavior.ICacheStats\[\]' expected, 'org.apache.commons.jcs3.engine.stats.CacheStats\[\]' found
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCacheManager.java`
#### Snippet
```java
            .collect(Collectors.toList());

        return cacheStats.toArray( new CacheStats[0] );
    }

```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `delegate` to `Cache` is redundant
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/cdi/CacheResolverImpl.java`
#### Snippet
```java
    public <K, V> Cache<K, V> resolveCache(final CacheInvocationContext<? extends Annotation> cacheInvocationContext)
    {
        return (Cache<K, V>) delegate;
    }
}
```

### RedundantCast
Casting `caches.get(...)` to `Cache` is redundant
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/JCSCachingManager.java`
#### Snippet
```java
    {
        @SuppressWarnings("unchecked") // common map for all caches
        final Cache<K, V> cache = (Cache<K, V>) caches.get(cacheName);
        if (cache == null)
        {
```

### RedundantCast
Casting `doGetCache(...)` to `Cache` is redundant
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/JCSCachingManager.java`
#### Snippet
```java
        assertNotClosed();
        assertNotNull(cacheName, "cacheName");
        return (Cache<K, V>) doGetCache(cacheName, Object.class, Object.class);
    }

```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/JCS.java`
#### Snippet
```java
     * @param eattr ElementAttributes for the region
     * @return A GroupCacheAccess which provides access to a given region.
     * @throws CacheException
     */
    public static <K, V> GroupCacheAccess<K, V> getGroupCacheInstance( final String region, final ICompositeCacheAttributes icca,  final IElementAttributes eattr )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/JCS.java`
#### Snippet
```java
     * @param icca CacheAttributes for region
     * @return A GroupCacheAccess which provides access to a given region.
     * @throws CacheException
     */
    public static <K, V> GroupCacheAccess<K, V> getGroupCacheInstance( final String region, final ICompositeCacheAttributes icca )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/JCS.java`
#### Snippet
```java
     * @param eattr ElementAttributes for the region
     * @return A CacheAccess which provides access to a given region.
     * @throws CacheException
     */
    public static <K, V> CacheAccess<K, V> getInstance( final String region, final ICompositeCacheAttributes icca,  final IElementAttributes eattr )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/JCS.java`
#### Snippet
```java
     * @param region Region that return CacheAccess will provide access to
     * @return A CacheAccess which provides access to a given region.
     * @throws CacheException
     */
    public static <K, V> CacheAccess<K, V> getInstance( final String region )
```

### JavadocDeclaration
`@param configProps` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/JCS.java`
#### Snippet
```java
     * matters before the instance is initialized.
     *
     * @param configProps
     */
    public static void setConfigProperties( final Properties configProps )
```

### JavadocDeclaration
`@param configFilename` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/JCS.java`
#### Snippet
```java
     * instance is initialized.
     * <p>
     * @param configFilename
     */
    public static void setConfigFilename( final String configFilename )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/JCS.java`
#### Snippet
```java
     * @param region Region that return GroupCacheAccess will provide access to
     * @return A GroupCacheAccess which provides access to a given region.
     * @throws CacheException
     */
    public static <K, V> GroupCacheAccess<K, V> getGroupCacheInstance( final String region )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/JCS.java`
#### Snippet
```java
     * @param icca CacheAttributes for region
     * @return A CacheAccess which provides access to a given region.
     * @throws CacheException
     */
    public static <K, V> CacheAccess<K, V> getInstance( final String region, final ICompositeCacheAttributes icca )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/admin/JCSJMXBean.java`
#### Snippet
```java
     * cache API.
     *
     * @param cacheName
     * @param key
     *
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/admin/JCSJMXBean.java`
#### Snippet
```java
     *
     * @param cacheName
     * @param key
     *
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/admin/JCSJMXBean.java`
#### Snippet
```java
     * @param key
     *
     * @throws IOException
     */
    void removeItem(String cacheName, String key) throws IOException;
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/admin/JCSJMXBean.java`
#### Snippet
```java
     * Builds up info about each element in a region.
     * <p>
     * @param cacheName
     * @return List of CacheElementInfo objects
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/admin/JCSJMXBean.java`
#### Snippet
```java
     * @param cacheName
     * @return List of CacheElementInfo objects
     * @throws IOException
     */
    List<CacheElementInfo> buildElementInfo( String cacheName ) throws IOException;
```

### JavadocDeclaration
`@param b` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/admin/CountingOnlyOutputStream.java`
#### Snippet
```java
     * count as we write.
     * <p>
     * @param b
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/admin/CountingOnlyOutputStream.java`
#### Snippet
```java
     * <p>
     * @param b
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param b` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/admin/CountingOnlyOutputStream.java`
#### Snippet
```java
     * count as we write.
     * <p>
     * @param b
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/admin/CountingOnlyOutputStream.java`
#### Snippet
```java
     * <p>
     * @param b
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param b` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/admin/CountingOnlyOutputStream.java`
#### Snippet
```java
     * count as we write.
     * <p>
     * @param b
     * @param off
     * @param len
```

### JavadocDeclaration
`@param off` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/admin/CountingOnlyOutputStream.java`
#### Snippet
```java
     * <p>
     * @param b
     * @param off
     * @param len
     * @throws IOException
```

### JavadocDeclaration
`@param len` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/admin/CountingOnlyOutputStream.java`
#### Snippet
```java
     * @param b
     * @param off
     * @param len
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/admin/CountingOnlyOutputStream.java`
#### Snippet
```java
     * @param off
     * @param len
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/net/HostNameUtil.java`
#### Snippet
```java
     * <p>
     * @return InetAddress.getLocalHost().getHostAddress()
     * @throws UnknownHostException
     */
    public static String getLocalHostAddress() throws UnknownHostException
```

### JavadocDeclaration
`@param isFinished` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/access/AbstractJCSWorkerHelper.java`
#### Snippet
```java

    /**
     * @param isFinished
     */
    @Override
```

### JavadocDeclaration
`@param aKey` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/access/JCSWorker.java`
#### Snippet
```java
     * region/key/group will wait on the results of this call. It will call the
     * JCSWorkerHelper.doWork() if the cache misses, and will put the result.
     * @param aKey
     * @param aGroup
     * @param aHelper
```

### JavadocDeclaration
`@param aGroup` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/access/JCSWorker.java`
#### Snippet
```java
     * JCSWorkerHelper.doWork() if the cache misses, and will put the result.
     * @param aKey
     * @param aGroup
     * @param aHelper
     * @return Either the result of doing the work, or the cached result.
```

### JavadocDeclaration
`@param aHelper` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/access/JCSWorker.java`
#### Snippet
```java
     * @param aKey
     * @param aGroup
     * @param aHelper
     * @return Either the result of doing the work, or the cached result.
     * @throws Exception
```

### JavadocDeclaration
`@param payloadP` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/struct/DoubleLinkedListNode.java`
#### Snippet
```java

    /**
     * @param payloadP
     */
    public DoubleLinkedListNode(final T payloadP)
```

### JavadocDeclaration
`@param rootCause` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/config/PropertySetterException.java`
#### Snippet
```java
     * Constructor for the PropertySetterException object
     * <p>
     * @param rootCause
     */
    public PropertySetterException( final Throwable rootCause )
```

### JavadocDeclaration
`@param msg` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/config/PropertySetterException.java`
#### Snippet
```java
     * Constructor for the PropertySetterException object
     * <p>
     * @param msg
     */
    public PropertySetterException( final String msg )
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/struct/LRUElementDescriptor.java`
#### Snippet
```java

    /**
     * @param key
     * @param payloadP
     */
```

### JavadocDeclaration
`@param payloadP` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/struct/LRUElementDescriptor.java`
#### Snippet
```java
    /**
     * @param key
     * @param payloadP
     */
    public LRUElementDescriptor(final K key, final V payloadP)
```

### JavadocDeclaration
`@param value` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/config/OptionConverter.java`
#### Snippet
```java
     * Converts to int.
     *
     * @param value
     * @param defaultValue
     * @return int
```

### JavadocDeclaration
`@param defaultValue` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/config/OptionConverter.java`
#### Snippet
```java
     *
     * @param value
     * @param defaultValue
     * @return int
     */
```

### JavadocDeclaration
`@param props` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/config/OptionConverter.java`
#### Snippet
```java
     * Creates an object for the className value of the key.
     *
     * @param props
     * @param key
     * @param defaultValue
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/config/OptionConverter.java`
#### Snippet
```java
     *
     * @param props
     * @param key
     * @param defaultValue
     * @return Object that was created
```

### JavadocDeclaration
`@param defaultValue` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/config/OptionConverter.java`
#### Snippet
```java
     * @param props
     * @param key
     * @param defaultValue
     * @return Object that was created
     */
```

### JavadocDeclaration
`@param s` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/config/OptionConverter.java`
#### Snippet
```java
     * Escapes special characters.
     *
     * @param s
     * @return String
     */
```

### JavadocDeclaration
`@param l` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/config/OptionConverter.java`
#### Snippet
```java
    /**
     * Combines two arrays.
     * @param l
     * @param r
     * @return String[]
```

### JavadocDeclaration
`@param r` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/config/OptionConverter.java`
#### Snippet
```java
     * Combines two arrays.
     * @param l
     * @param r
     * @return String[]
     */
```

### JavadocDeclaration
`@param value` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/config/OptionConverter.java`
#### Snippet
```java
     *
     * Case of value is unimportant.
     * @param value
     * @param defaultValue
     * @return Object
```

### JavadocDeclaration
`@param defaultValue` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/config/OptionConverter.java`
#### Snippet
```java
     * Case of value is unimportant.
     * @param value
     * @param defaultValue
     * @return Object
     */
```

### JavadocDeclaration
`@param value` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/config/OptionConverter.java`
#### Snippet
```java

    /**
     * @param value
     * @param defaultValue
     * @return long
```

### JavadocDeclaration
`@param defaultValue` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/config/OptionConverter.java`
#### Snippet
```java
    /**
     * @param value
     * @param defaultValue
     * @return long
     */
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/config/OptionConverter.java`
#### Snippet
```java
     * substitution on the found value.
     *
     * @param key
     * @param props
     * @return substituted string
```

### JavadocDeclaration
`@param props` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/config/OptionConverter.java`
#### Snippet
```java
     *
     * @param key
     * @param props
     * @return substituted string
     */
```

### JavadocDeclaration
`@param props` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/config/OptionConverter.java`
#### Snippet
```java
     * </p>
     * @param val The string on which variable substitution is performed.
     * @param props
     * @return String
     * @throws IllegalArgumentException if <code>val</code> is malformed.
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/config/PropertySetter.java`
#### Snippet
```java
     * @param name The named of the property to set.
     * @param value The value of the property.
     * @throws PropertySetterException
     */

```

### JavadocDeclaration
`@param val` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/config/PropertySetter.java`
#### Snippet
```java
    /**
     * Convert <code>val</code> a String parameter to an object of a given type.
     * @param val
     * @param type
     * @return Object
```

### JavadocDeclaration
`@param type` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/config/PropertySetter.java`
#### Snippet
```java
     * Convert <code>val</code> a String parameter to an object of a given type.
     * @param val
     * @param type
     * @return Object
     */
```

### JavadocDeclaration
`@param name` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/config/PropertySetter.java`
#### Snippet
```java
    /**
     * Gets the propertyDescriptor attribute of the PropertySetter object
     * @param name
     * @return The propertyDescriptor value
     */
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/admin/JCSAdminBean.java`
#### Snippet
```java
     * Builds up info about each element in a region.
     * <p>
     * @param cacheName
     * @return List of CacheElementInfo objects
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/admin/JCSAdminBean.java`
#### Snippet
```java
     * @param cacheName
     * @return List of CacheElementInfo objects
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/admin/JCSAdminBean.java`
#### Snippet
```java
     * cache API.
     *
     * @param cacheName
     * @param key
     *
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/admin/JCSAdminBean.java`
#### Snippet
```java
     *
     * @param cacheName
     * @param key
     *
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/admin/JCSAdminBean.java`
#### Snippet
```java
     * @param key
     *
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param message` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoverySender.java`
#### Snippet
```java
     * Send messages.
     * <p>
     * @param message
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoverySender.java`
#### Snippet
```java
     * <p>
     * @param message
     * @throws IOException
     */
    public void send( final UDPDiscoveryMessage message )
```

### JavadocDeclaration
`@param host` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoverySender.java`
#### Snippet
```java
     * <p>
     * @param mcastInterface the Multicast interface name to use, if null, try to autodetect
     * @param host
     * @param port
     * @param udpTTL the Datagram packet time-to-live
```

### JavadocDeclaration
`@param port` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoverySender.java`
#### Snippet
```java
     * @param mcastInterface the Multicast interface name to use, if null, try to autodetect
     * @param host
     * @param port
     * @param udpTTL the Datagram packet time-to-live
     * @param serializer the Serializer to use when sending messages
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoverySender.java`
#### Snippet
```java
     * @param udpTTL the Datagram packet time-to-live
     * @param serializer the Serializer to use when sending messages
     * @throws IOException
     * @since 3.1
     */
```

### JavadocDeclaration
`@param runner` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/threadpool/DaemonThreadFactory.java`
#### Snippet
```java
     * Sets the thread to daemon.
     * <p>
     * @param runner
     * @return a daemon thread
     */
```

### JavadocDeclaration
`@param host` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoverySender.java`
#### Snippet
```java
     * When you are done sending, you should destroy the socket sender.
     * <p>
     * @param host
     * @param port
     * @param udpTTL the Datagram packet time-to-live
```

### JavadocDeclaration
`@param port` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoverySender.java`
#### Snippet
```java
     * <p>
     * @param host
     * @param port
     * @param udpTTL the Datagram packet time-to-live
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoverySender.java`
#### Snippet
```java
     * @param port
     * @param udpTTL the Datagram packet time-to-live
     * @throws IOException
     * @deprecated Specify serializer implementation explicitly
     */
```

### JavadocDeclaration
`@param host` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoverySender.java`
#### Snippet
```java
     * This allows you to set the sender id. This is mainly for testing.
     * <p>
     * @param host
     * @param port
     * @param cacheNames names of the cache regions
```

### JavadocDeclaration
`@param port` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoverySender.java`
#### Snippet
```java
     * <p>
     * @param host
     * @param port
     * @param cacheNames names of the cache regions
     * @param listenerId
```

### JavadocDeclaration
`@param listenerId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoverySender.java`
#### Snippet
```java
     * @param port
     * @param cacheNames names of the cache regions
     * @param listenerId
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoverySender.java`
#### Snippet
```java
     * @param cacheNames names of the cache regions
     * @param listenerId
     * @throws IOException
     */
    protected void passiveBroadcast( final String host, final int port, final ArrayList<String> cacheNames, final long listenerId )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoverySender.java`
#### Snippet
```java
     * @param udpDiscoveryAttributes configuration object
     * @param serializer the Serializer to use when sending messages
     * @throws IOException
     * @since 3.1
     */
```

### JavadocDeclaration
`@param host` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoverySender.java`
#### Snippet
```java
     * <p>
     * It uses the vmid as the requesterDI
     * @param host
     * @param port
     * @param cacheNames
```

### JavadocDeclaration
`@param port` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoverySender.java`
#### Snippet
```java
     * It uses the vmid as the requesterDI
     * @param host
     * @param port
     * @param cacheNames
     * @throws IOException
```

### JavadocDeclaration
`@param cacheNames` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoverySender.java`
#### Snippet
```java
     * @param host
     * @param port
     * @param cacheNames
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoverySender.java`
#### Snippet
```java
     * @param port
     * @param cacheNames
     * @throws IOException
     */
    public void passiveBroadcast( final String host, final int port, final ArrayList<String> cacheNames )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoverySender.java`
#### Snippet
```java
     * can use this. This is also called on startup so we can get info.
     * <p>
     * @throws IOException
     */
    public void requestBroadcast()
```

### JavadocDeclaration
`@param useBoundary` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/threadpool/PoolConfiguration.java`
#### Snippet
```java
     * Construct a completely configured instance.
     * <p>
     * @param useBoundary
     * @param boundarySize
     * @param maximumPoolSize
```

### JavadocDeclaration
`@param boundarySize` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/threadpool/PoolConfiguration.java`
#### Snippet
```java
     * <p>
     * @param useBoundary
     * @param boundarySize
     * @param maximumPoolSize
     * @param minimumPoolSize
```

### JavadocDeclaration
`@param maximumPoolSize` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/threadpool/PoolConfiguration.java`
#### Snippet
```java
     * @param useBoundary
     * @param boundarySize
     * @param maximumPoolSize
     * @param minimumPoolSize
     * @param keepAliveTime
```

### JavadocDeclaration
`@param minimumPoolSize` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/threadpool/PoolConfiguration.java`
#### Snippet
```java
     * @param boundarySize
     * @param maximumPoolSize
     * @param minimumPoolSize
     * @param keepAliveTime
     * @param whenBlockedPolicy
```

### JavadocDeclaration
`@param keepAliveTime` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/threadpool/PoolConfiguration.java`
#### Snippet
```java
     * @param maximumPoolSize
     * @param minimumPoolSize
     * @param keepAliveTime
     * @param whenBlockedPolicy
     * @param startUpSize
```

### JavadocDeclaration
`@param whenBlockedPolicy` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/threadpool/PoolConfiguration.java`
#### Snippet
```java
     * @param minimumPoolSize
     * @param keepAliveTime
     * @param whenBlockedPolicy
     * @param startUpSize
     */
```

### JavadocDeclaration
`@param startUpSize` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/threadpool/PoolConfiguration.java`
#### Snippet
```java
     * @param keepAliveTime
     * @param whenBlockedPolicy
     * @param startUpSize
     */
    public PoolConfiguration( final boolean useBoundary, final int boundarySize, final int maximumPoolSize, final int minimumPoolSize,
```

### JavadocDeclaration
`@param discoveryAddress` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryManager.java`
#### Snippet
```java
     * TODO think of making one discovery service work for multiple types of clients.
     * <p>
     * @param discoveryAddress
     * @param discoveryPort
     * @param servicePort
```

### JavadocDeclaration
`@param discoveryPort` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryManager.java`
#### Snippet
```java
     * <p>
     * @param discoveryAddress
     * @param discoveryPort
     * @param servicePort
     * @param cacheMgr
```

### JavadocDeclaration
`@param servicePort` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryManager.java`
#### Snippet
```java
     * @param discoveryAddress
     * @param discoveryPort
     * @param servicePort
     * @param cacheMgr
     * @return UDPDiscoveryService
```

### JavadocDeclaration
`@param cacheMgr` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryManager.java`
#### Snippet
```java
     * @param discoveryPort
     * @param servicePort
     * @param cacheMgr
     * @return UDPDiscoveryService
     * @deprecated Specify serializer implementation explicitly, allow to specify udpTTL
```

### JavadocDeclaration
`@param discoveryAddress` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryManager.java`
#### Snippet
```java
     * TODO think of making one discovery service work for multiple types of clients.
     * <p>
     * @param discoveryAddress
     * @param discoveryPort
     * @param serviceAddress
```

### JavadocDeclaration
`@param discoveryPort` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryManager.java`
#### Snippet
```java
     * <p>
     * @param discoveryAddress
     * @param discoveryPort
     * @param serviceAddress
     * @param servicePort
```

### JavadocDeclaration
`@param serviceAddress` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryManager.java`
#### Snippet
```java
     * @param discoveryAddress
     * @param discoveryPort
     * @param serviceAddress
     * @param servicePort
     * @param updTTL
```

### JavadocDeclaration
`@param servicePort` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryManager.java`
#### Snippet
```java
     * @param discoveryPort
     * @param serviceAddress
     * @param servicePort
     * @param updTTL
     * @param cacheMgr
```

### JavadocDeclaration
`@param updTTL` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryManager.java`
#### Snippet
```java
     * @param serviceAddress
     * @param servicePort
     * @param updTTL
     * @param cacheMgr
     * @param serializer
```

### JavadocDeclaration
`@param cacheMgr` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryManager.java`
#### Snippet
```java
     * @param servicePort
     * @param updTTL
     * @param cacheMgr
     * @param serializer
     *
```

### JavadocDeclaration
`@param serializer` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryManager.java`
#### Snippet
```java
     * @param updTTL
     * @param cacheMgr
     * @param serializer
     *
     * @return UDPDiscoveryService
```

### JavadocDeclaration
`@param obj` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/serialization/StandardSerializer.java`
#### Snippet
```java
     * Serializes an object using default serialization.
     * <p>
     * @param obj
     * @return byte[]
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/serialization/StandardSerializer.java`
#### Snippet
```java
     * @param obj
     * @return byte[]
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/serialization/StandardSerializer.java`
#### Snippet
```java
     * @param loader class loader to use
     * @return Object
     * @throws IOException
     * @throws ClassNotFoundException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/serialization/StandardSerializer.java`
#### Snippet
```java
     * @return Object
     * @throws IOException
     * @throws ClassNotFoundException
     */
    @Override
```

### JavadocDeclaration
`@param element` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/serialization/SerializationConversionUtil.java`
#### Snippet
```java
     * of the value.
     * <p>
     * @param element
     * @param elementSerializer
     *            the serializer to be used.
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/serialization/SerializationConversionUtil.java`
#### Snippet
```java
     *            the serializer to be used.
     * @return null for null;
     * @throws IOException
     */
    public static <K, V> ICacheElementSerialized<K, V> getSerializedCacheElement( final ICacheElement<K, V> element,
```

### JavadocDeclaration
`@param serialized` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/serialization/SerializationConversionUtil.java`
#### Snippet
```java
     * instead of the serialized value.
     * <p>
     * @param serialized
     * @param elementSerializer
     *            the serializer to be used.
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/serialization/SerializationConversionUtil.java`
#### Snippet
```java
     *            the serializer to be used.
     * @return null for null;
     * @throws IOException
     * @throws ClassNotFoundException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/serialization/SerializationConversionUtil.java`
#### Snippet
```java
     * @return null for null;
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static <K, V> ICacheElement<K, V> getDeSerializedCacheElement( final ICacheElementSerialized<K, V> serialized,
```

### JavadocDeclaration
`@param name` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/ICacheAccess.java`
#### Snippet
```java
     * Description of the Method
     * <p>
     * @param name
     * @param obj
     * @param attr
```

### JavadocDeclaration
`@param obj` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/ICacheAccess.java`
#### Snippet
```java
     * <p>
     * @param name
     * @param obj
     * @param attr
     * @throws CacheException
```

### JavadocDeclaration
`@param attr` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/ICacheAccess.java`
#### Snippet
```java
     * @param name
     * @param obj
     * @param attr
     * @throws CacheException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/ICacheAccess.java`
#### Snippet
```java
     * @param obj
     * @param attr
     * @throws CacheException
     */
    void put(K name, V obj, IElementAttributes attr)
```

### JavadocDeclaration
`@param name` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/ICacheAccess.java`
#### Snippet
```java
     * retrieved by calling the supplier and subsequently storing it in the cache.
     * <p>
     * @param name
     * @param supplier supplier to be called if the value is not found
     * @return Object.
```

### JavadocDeclaration
`@param name` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/ICacheAccess.java`
#### Snippet
```java
     * Gets the elementAttributes attribute of the ICacheAccess object
     * <p>
     * @param name
     * @return The elementAttributes value
     * @throws CacheException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/ICacheAccess.java`
#### Snippet
```java
     * @param name
     * @return The elementAttributes value
     * @throws CacheException
     */
    IElementAttributes getElementAttributes(K name)
```

### JavadocDeclaration
`@param name` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/ICacheAccess.java`
#### Snippet
```java
     * Puts in cache if an item does not exist with the name in that region.
     * <p>
     * @param name
     * @param obj
     * @throws CacheException
```

### JavadocDeclaration
`@param obj` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/ICacheAccess.java`
#### Snippet
```java
     * <p>
     * @param name
     * @param obj
     * @throws CacheException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/ICacheAccess.java`
#### Snippet
```java
     * @param name
     * @param obj
     * @throws CacheException
     */
    void putSafe(K name, V obj)
```

### JavadocDeclaration
`@param name` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/ICacheAccess.java`
#### Snippet
```java
     * Basic get method.
     * <p>
     * @param name
     * @return Object or null if not found.
     */
```

### JavadocDeclaration
`@param name` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/ICacheAccess.java`
#### Snippet
```java
     * Puts and/or overrides an element with the name in that region.
     * <p>
     * @param name
     * @param obj
     * @throws CacheException
```

### JavadocDeclaration
`@param obj` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/ICacheAccess.java`
#### Snippet
```java
     * <p>
     * @param name
     * @param obj
     * @throws CacheException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/ICacheAccess.java`
#### Snippet
```java
     * @param name
     * @param obj
     * @throws CacheException
     */
    void put(K name, V obj)
```

### JavadocDeclaration
`@param name` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/ICacheAccess.java`
#### Snippet
```java
     * Remove an object for this key if one exists, else do nothing.
     * <p>
     * @param name
     * @throws CacheException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/ICacheAccess.java`
#### Snippet
```java
     * <p>
     * @param name
     * @throws CacheException
     */
    void remove(K name)
```

### JavadocDeclaration
`@param name` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/ICacheAccess.java`
#### Snippet
```java
     * Reset the attributes on the object matching this key name.
     * <p>
     * @param name
     * @param attributes
     * @throws CacheException
```

### JavadocDeclaration
`@param attributes` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/ICacheAccess.java`
#### Snippet
```java
     * <p>
     * @param name
     * @param attributes
     * @throws CacheException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/ICacheAccess.java`
#### Snippet
```java
     * @param name
     * @param attributes
     * @throws CacheException
     */
    void resetElementAttributes(K name, IElementAttributes attributes)
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/GroupCacheAccess.java`
#### Snippet
```java
     * @param value
     *            The object to cache
     * @throws CacheException
     */
    @Override
```

### JavadocDeclaration
`@param name` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/GroupCacheAccess.java`
#### Snippet
```java
     * Removes a single item by name from a group.
     *
     * @param name
     * @param group
     */
```

### JavadocDeclaration
`@param group` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/GroupCacheAccess.java`
#### Snippet
```java
     *
     * @param name
     * @param group
     */
    @Override
```

### JavadocDeclaration
`@param group` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/GroupCacheAccess.java`
#### Snippet
```java
     * Internal method used for group functionality.
     * <p>
     * @param group
     * @param name
     * @return GroupAttrName
```

### JavadocDeclaration
`@param name` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/GroupCacheAccess.java`
#### Snippet
```java
     * <p>
     * @param group
     * @param name
     * @return GroupAttrName
     */
```

### JavadocDeclaration
`@param cacheControl` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/GroupCacheAccess.java`
#### Snippet
```java
     * Constructor for the GroupCacheAccess object
     * <p>
     * @param cacheControl
     */
    public GroupCacheAccess( final CompositeCache<GroupAttrName<K>, V> cacheControl )
```

### JavadocDeclaration
`@param group` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/GroupCacheAccess.java`
#### Snippet
```java
     * Gets the set of keys of objects currently in the group.
     * <p>
     * @param group
     * @return A Set of keys.
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/GroupCacheAccess.java`
#### Snippet
```java
     * @param attr
     *            The objects attributes.
     * @throws CacheException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/ICacheAccessManagement.java`
#### Snippet
```java
     * <p>
     * @return The elementAttributes value
     * @throws CacheException
     */
    IElementAttributes getDefaultElementAttributes()
```

### JavadocDeclaration
`@param numberToFree` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/ICacheAccessManagement.java`
#### Snippet
```java
     * used items. These will be spooled to disk if a disk auxiliary is available.
     * <p>
     * @param numberToFree
     * @return the number that were removed. if you ask to free 5, but there are only 3, you will
     *         get 3.
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/ICacheAccessManagement.java`
#### Snippet
```java
     * @return the number that were removed. if you ask to free 5, but there are only 3, you will
     *         get 3.
     * @throws CacheException
     */
    int freeMemoryElements( int numberToFree )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/ICacheAccessManagement.java`
#### Snippet
```java
     * Removes all of the elements from a region.
     * <p>
     * @throws CacheException
     */
    void clear() throws CacheException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/AbstractCacheAccess.java`
#### Snippet
```java
     * Removes all of the elements from a region.
     * <p>
     * @throws CacheException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/AbstractCacheAccess.java`
#### Snippet
```java
     * <p>
     * @return the default element attributes used by this region.
     * @throws CacheException
     */
    @Override
```

### JavadocDeclaration
`@param numberToFree` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/AbstractCacheAccess.java`
#### Snippet
```java
     * used items. These will be spooled to disk if a disk auxiliary is available.
     * <p>
     * @param numberToFree
     * @return the number that were removed. if you ask to free 5, but there are only 3, you will
     *         get 3.
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/AbstractCacheAccess.java`
#### Snippet
```java
     * @return the number that were removed. if you ask to free 5, but there are only 3, you will
     *         get 3.
     * @throws CacheException
     */
    @Override
```

### JavadocDeclaration
`@param service` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryReceiver.java`
#### Snippet
```java
     * Constructor for the UDPDiscoveryReceiver object.
     * <p>
     * @param service
     * @param multicastInterfaceString
     * @param multicastAddress
```

### JavadocDeclaration
`@param multicastInterfaceString` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryReceiver.java`
#### Snippet
```java
     * <p>
     * @param service
     * @param multicastInterfaceString
     * @param multicastAddress
     * @param multicastPort
```

### JavadocDeclaration
`@param multicastAddress` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryReceiver.java`
#### Snippet
```java
     * @param service
     * @param multicastInterfaceString
     * @param multicastAddress
     * @param multicastPort
     * @throws IOException
```

### JavadocDeclaration
`@param multicastPort` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryReceiver.java`
#### Snippet
```java
     * @param multicastInterfaceString
     * @param multicastAddress
     * @param multicastPort
     * @throws IOException
     * @since 3.1
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryReceiver.java`
#### Snippet
```java
     * @param multicastAddress
     * @param multicastPort
     * @throws IOException
     * @since 3.1
     */
```

### JavadocDeclaration
`@param multicastInterfaceString` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryReceiver.java`
#### Snippet
```java
     * Creates the socket for this class.
     * <p>
     * @param multicastInterfaceString
     * @param multicastAddress
     * @param multicastPort
```

### JavadocDeclaration
`@param multicastAddress` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryReceiver.java`
#### Snippet
```java
     * <p>
     * @param multicastInterfaceString
     * @param multicastAddress
     * @param multicastPort
     * @throws IOException
```

### JavadocDeclaration
`@param multicastPort` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryReceiver.java`
#### Snippet
```java
     * @param multicastInterfaceString
     * @param multicastAddress
     * @param multicastPort
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryReceiver.java`
#### Snippet
```java
     * @param multicastAddress
     * @param multicastPort
     * @throws IOException
     */
    private void createSocket( final String multicastInterfaceString, final InetAddress multicastAddress,
```

### JavadocDeclaration
`@param service` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryReceiver.java`
#### Snippet
```java
     * We determine out own host using InetAddress
     *<p>
     * @param service
     * @param multicastInterfaceString
     * @param multicastAddressString
```

### JavadocDeclaration
`@param multicastInterfaceString` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryReceiver.java`
#### Snippet
```java
     *<p>
     * @param service
     * @param multicastInterfaceString
     * @param multicastAddressString
     * @param multicastPort
```

### JavadocDeclaration
`@param multicastAddressString` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryReceiver.java`
#### Snippet
```java
     * @param service
     * @param multicastInterfaceString
     * @param multicastAddressString
     * @param multicastPort
     * @throws IOException
```

### JavadocDeclaration
`@param multicastPort` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryReceiver.java`
#### Snippet
```java
     * @param multicastInterfaceString
     * @param multicastAddressString
     * @param multicastPort
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryReceiver.java`
#### Snippet
```java
     * @param multicastAddressString
     * @param multicastPort
     * @throws IOException
     */
    public UDPDiscoveryReceiver( final UDPDiscoveryService service,
```

### JavadocDeclaration
`@param message` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryReceiver.java`
#### Snippet
```java

        /**
         * @param message
         */
        public MessageHandler( final UDPDiscoveryMessage message )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryReceiver.java`
#### Snippet
```java
     *
     * @return the object message
     * @throws IOException
     * @deprecated no longer used
     */
```

### JavadocDeclaration
`@param group` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/IGroupCacheAccess.java`
#### Snippet
```java
     * Invalidates a group
     * <p>
     * @param group
     */
    void invalidateGroup( String group );
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/IGroupCacheAccess.java`
#### Snippet
```java
     * Put in the cache associated with this group using these attributes.
     * <p>
     * @param key
     * @param group
     * @param obj
```

### JavadocDeclaration
`@param group` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/IGroupCacheAccess.java`
#### Snippet
```java
     * <p>
     * @param key
     * @param group
     * @param obj
     * @param attr
```

### JavadocDeclaration
`@param obj` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/IGroupCacheAccess.java`
#### Snippet
```java
     * @param key
     * @param group
     * @param obj
     * @param attr
     * @throws CacheException
```

### JavadocDeclaration
`@param attr` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/IGroupCacheAccess.java`
#### Snippet
```java
     * @param group
     * @param obj
     * @param attr
     * @throws CacheException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/IGroupCacheAccess.java`
#### Snippet
```java
     * @param obj
     * @param attr
     * @throws CacheException
     */
    void putInGroup( K key, String group, V obj, IElementAttributes attr )
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/IGroupCacheAccess.java`
#### Snippet
```java
     * Puts an item in the cache associated with this group.
     * <p>
     * @param key
     * @param group
     * @param obj
```

### JavadocDeclaration
`@param group` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/IGroupCacheAccess.java`
#### Snippet
```java
     * <p>
     * @param key
     * @param group
     * @param obj
     * @throws CacheException
```

### JavadocDeclaration
`@param obj` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/IGroupCacheAccess.java`
#### Snippet
```java
     * @param key
     * @param group
     * @param obj
     * @throws CacheException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/IGroupCacheAccess.java`
#### Snippet
```java
     * @param group
     * @param obj
     * @throws CacheException
     */
    void putInGroup( K key, String group, V obj )
```

### JavadocDeclaration
`@param name` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/IGroupCacheAccess.java`
#### Snippet
```java
     * Gets the g attribute of the IGroupCacheAccess object
     * <p>
     * @param name
     * @param group
     *            the name of the group to associate this with.
```

### JavadocDeclaration
`@param group` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/IGroupCacheAccess.java`
#### Snippet
```java
     * Gets the set of keys of objects currently in the group
     * <p>
     * @param group
     * @return the set of group keys.
     */
```

### JavadocDeclaration
`@param name` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/IGroupCacheAccess.java`
#### Snippet
```java
     * Remove the item from this group in this region by this name.
     * <p>
     * @param name
     * @param group
     */
```

### JavadocDeclaration
`@param group` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/behavior/IGroupCacheAccess.java`
#### Snippet
```java
     * <p>
     * @param name
     * @param group
     */
    void removeFromGroup( K name, String group );
```

### JavadocDeclaration
`@param message` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/exception/ObjectNotFoundException.java`
#### Snippet
```java
    /**
     * Constructor for the ObjectNotFoundException object
     * @param message
     */
    public ObjectNotFoundException( final String message )
```

### JavadocDeclaration
`@param message` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/exception/ConfigurationException.java`
#### Snippet
```java
     * Constructor for the ConfigurationException object.
     * <p>
     * @param message
     */
    public ConfigurationException( final String message )
```

### JavadocDeclaration
`@param message` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/exception/InvalidHandleException.java`
#### Snippet
```java
     * Constructor for the InvalidHandleException object.
     * <p>
     * @param message
     */
    public InvalidHandleException( final String message )
```

### JavadocDeclaration
`@param message` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/exception/ObjectExistsException.java`
#### Snippet
```java
    /**
     * Constructor for the ObjectExistsException object
     * @param message
     */
    public ObjectExistsException( final String message )
```

### JavadocDeclaration
`@param name` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/threadpool/ThreadPoolManager.java`
#### Snippet
```java
     * Services are lazily created.
     * <p>
     * @param name
     * @return The executor service configured for the name.
     */
```

### JavadocDeclaration
`@param message` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/exception/InvalidArgumentException.java`
#### Snippet
```java
     * Constructor for the InvalidArgumentException object.
     * <p>
     * @param message
     */
    public InvalidArgumentException( final String message )
```

### JavadocDeclaration
`@param name` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/threadpool/ThreadPoolManager.java`
#### Snippet
```java
     * Pools are lazily created.
     * <p>
     * @param name
     * @return The scheduler pool configured for the name.
     */
```

### JavadocDeclaration
`@param message` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/exception/InvalidGroupException.java`
#### Snippet
```java
     * Constructor for the InvalidGroupException object
     * <p>
     * @param message
     */
    public InvalidGroupException( final String message )
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/struct/AbstractLRUMap.java`
#### Snippet
```java

    /**
     * @param key
     * @return Object removed
     */
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/struct/AbstractLRUMap.java`
#### Snippet
```java
     * will still be the last time in the list.
     * <p>
     * @param key
     * @return Object
     */
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/struct/AbstractLRUMap.java`
#### Snippet
```java

    /**
     * @param key
     * @return Object
     */
```

### JavadocDeclaration
`@param source` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/struct/AbstractLRUMap.java`
#### Snippet
```java

    /**
     * @param source
     */
    @Override
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/struct/AbstractLRUMap.java`
#### Snippet
```java

    /**
     * @param key
     * @param value
     * @return Object
```

### JavadocDeclaration
`@param value` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/struct/AbstractLRUMap.java`
#### Snippet
```java
    /**
     * @param key
     * @param value
     * @return Object
     */
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/struct/AbstractLRUMap.java`
#### Snippet
```java
     * <p>
     * Children can implement this method for special behavior.
     * @param key
     * @param value
     */
```

### JavadocDeclaration
`@param value` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/struct/AbstractLRUMap.java`
#### Snippet
```java
     * Children can implement this method for special behavior.
     * @param key
     * @param value
     */
    protected void processRemovedLRU(final K key, final V value )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryService.java`
#### Snippet
```java
     * Adds a region to the list that is participating in discovery.
     * <p>
     * @param cacheName
     */
    public void addParticipatingCacheName( final String cacheName )
```

### JavadocDeclaration
`@param listener` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryService.java`
#### Snippet
```java
     * Removes a listener.
     * <p>
     * @param listener
     * @return true if it was in the set
     */
```

### JavadocDeclaration
`@param service` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryService.java`
#### Snippet
```java
     * Removes the discovered service from the list and calls the discovery listener.
     * <p>
     * @param service
     */
    public void removeDiscoveredService( final DiscoveredService service )
```

### JavadocDeclaration
`@param listener` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryService.java`
#### Snippet
```java
     * Adds a listener.
     * <p>
     * @param listener
     * @return true if it wasn't already in the set
     */
```

### JavadocDeclaration
`@param listener` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheEventQueueFactory.java`
#### Snippet
```java
     * Fully configured event queue.
     * <p>
     * @param listener
     * @param listenerId
     * @param cacheName
```

### JavadocDeclaration
`@param listenerId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheEventQueueFactory.java`
#### Snippet
```java
     * <p>
     * @param listener
     * @param listenerId
     * @param cacheName
     * @param maxFailure
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheEventQueueFactory.java`
#### Snippet
```java
     * @param listener
     * @param listenerId
     * @param cacheName
     * @param maxFailure
     * @param waitBeforeRetry
```

### JavadocDeclaration
`@param maxFailure` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheEventQueueFactory.java`
#### Snippet
```java
     * @param listenerId
     * @param cacheName
     * @param maxFailure
     * @param waitBeforeRetry
     * @param threadPoolName null is OK, if not a pooled event queue this is ignored
```

### JavadocDeclaration
`@param waitBeforeRetry` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheEventQueueFactory.java`
#### Snippet
```java
     * @param cacheName
     * @param maxFailure
     * @param waitBeforeRetry
     * @param threadPoolName null is OK, if not a pooled event queue this is ignored
     * @param poolType single or pooled
```

### JavadocDeclaration
`@param listener` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheEventQueueFactory.java`
#### Snippet
```java
     * The most commonly used factory method.
     * <p>
     * @param listener
     * @param listenerId
     * @param cacheName
```

### JavadocDeclaration
`@param listenerId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheEventQueueFactory.java`
#### Snippet
```java
     * <p>
     * @param listener
     * @param listenerId
     * @param cacheName
     * @param threadPoolName
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheEventQueueFactory.java`
#### Snippet
```java
     * @param listener
     * @param listenerId
     * @param cacheName
     * @param threadPoolName
     * @param poolType - SINGLE, POOLED
```

### JavadocDeclaration
`@param threadPoolName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheEventQueueFactory.java`
#### Snippet
```java
     * @param listenerId
     * @param cacheName
     * @param threadPoolName
     * @param poolType - SINGLE, POOLED
     * @return ICacheEventQueue
```

### JavadocDeclaration
`@param threadPoolName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheEventQueue.java`
#### Snippet
```java
     * Create the thread pool.
     * <p>
     * @param threadPoolName
     * @since 3.1
     */
```

### JavadocDeclaration
`@param listener` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheEventQueue.java`
#### Snippet
```java
     * Constructor for the CacheEventQueue object
     * <p>
     * @param listener
     * @param listenerId
     * @param cacheName
```

### JavadocDeclaration
`@param listenerId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheEventQueue.java`
#### Snippet
```java
     * <p>
     * @param listener
     * @param listenerId
     * @param cacheName
     * @param maxFailure
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheEventQueue.java`
#### Snippet
```java
     * @param listener
     * @param listenerId
     * @param cacheName
     * @param maxFailure
     * @param waitBeforeRetry
```

### JavadocDeclaration
`@param maxFailure` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheEventQueue.java`
#### Snippet
```java
     * @param listenerId
     * @param cacheName
     * @param maxFailure
     * @param waitBeforeRetry
     */
```

### JavadocDeclaration
`@param waitBeforeRetry` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheEventQueue.java`
#### Snippet
```java
     * @param cacheName
     * @param maxFailure
     * @param waitBeforeRetry
     */
    public CacheEventQueue( final ICacheListener<K, V> listener, final long listenerId, final String cacheName, final int maxFailure,
```

### JavadocDeclaration
`@param listener` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheEventQueue.java`
#### Snippet
```java
     * Constructs with the specified listener and the cache name.
     * <p>
     * @param listener
     * @param listenerId
     * @param cacheName
```

### JavadocDeclaration
`@param listenerId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheEventQueue.java`
#### Snippet
```java
     * <p>
     * @param listener
     * @param listenerId
     * @param cacheName
     */
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheEventQueue.java`
#### Snippet
```java
     * @param listener
     * @param listenerId
     * @param cacheName
     */
    public CacheEventQueue( final ICacheListener<K, V> listener, final long listenerId, final String cacheName )
```

### JavadocDeclaration
`@param name` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/CacheAccess.java`
#### Snippet
```java
     * calling the supplier and subsequently storing it in the cache.
     * <p>
     * @param name
     * @param supplier supplier to be called if the value is not found
     * @return Object.
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheAdaptor.java`
#### Snippet
```java
     * <p>
     * @return The listenerId value
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheAdaptor.java`
#### Snippet
```java
     * Shutdown call.
     * <p>
     * @param cacheName
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheAdaptor.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheAdaptor.java`
#### Snippet
```java
     * Clears the region.
     * <p>
     * @param cacheName
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheAdaptor.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheAdaptor.java`
#### Snippet
```java
     * @param id
     *            The new listenerId value
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheAdaptor.java`
#### Snippet
```java
     * Removes an item.
     * <p>
     * @param cacheName
     * @param key
     * @throws IOException
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheAdaptor.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheAdaptor.java`
#### Snippet
```java
     * @param cacheName
     * @param key
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param obj` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ZombieCacheWatch.java`
#### Snippet
```java

    /**
     * @param obj
     */
    @Override
```

### JavadocDeclaration
`@param item` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheAdaptor.java`
#### Snippet
```java
     * Puts an item into the cache.
     * <p>
     * @param item
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheAdaptor.java`
#### Snippet
```java
     * <p>
     * @param item
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cache` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheAdaptor.java`
#### Snippet
```java
     * Constructor for the CacheAdaptor object
     * <p>
     * @param cache
     */
    public CacheAdaptor( final ICache<K, V> cache )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ZombieCacheWatch.java`
#### Snippet
```java

    /**
     * @param cacheName
     * @param obj
     */
```

### JavadocDeclaration
`@param obj` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ZombieCacheWatch.java`
#### Snippet
```java
    /**
     * @param cacheName
     * @param obj
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ZombieCacheServiceNonLocal.java`
#### Snippet
```java
    {
        /**
         * @param cacheName
         * @param requesterId
         */
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ZombieCacheServiceNonLocal.java`
#### Snippet
```java
        /**
         * @param cacheName
         * @param requesterId
         */
        public RemoveAllEvent( final String cacheName, final long requesterId )
```

### JavadocDeclaration
`@param element` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ZombieCacheServiceNonLocal.java`
#### Snippet
```java
        /**
         * Set the element
         * @param element
         * @param requesterId
         */
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ZombieCacheServiceNonLocal.java`
#### Snippet
```java
         * Set the element
         * @param element
         * @param requesterId
         */
        public PutEvent( final ICacheElement<K, V> element, final long requesterId )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ZombieCacheServiceNonLocal.java`
#### Snippet
```java
        /**
         * Set the element
         * @param cacheName
         * @param key
         * @param requesterId
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ZombieCacheServiceNonLocal.java`
#### Snippet
```java
         * Set the element
         * @param cacheName
         * @param key
         * @param requesterId
         */
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ZombieCacheServiceNonLocal.java`
#### Snippet
```java
         * @param cacheName
         * @param key
         * @param requesterId
         */
        public RemoveEvent( final String cacheName, final K key, final long requesterId )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ZombieCacheServiceNonLocal.java`
#### Snippet
```java
     * @param requesterId - identifies the caller.
     * @return null
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param service` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ZombieCacheServiceNonLocal.java`
#### Snippet
```java
     * Walk the queue, calling the service for each queue operation.
     * <p>
     * @param service
     * @throws Exception
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ZombieCacheServiceNonLocal.java`
#### Snippet
```java
     * <p>
     * @param service
     * @throws Exception
     */
    public synchronized void propagateEvents( final ICacheServiceNonLocal<K, V> service )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ZombieCacheServiceNonLocal.java`
#### Snippet
```java
     * Does nothing.
     * <p>
     * @param cacheName
     * @param pattern
     * @param requesterId
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ZombieCacheServiceNonLocal.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param pattern
     * @param requesterId
     * @return empty map
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ZombieCacheServiceNonLocal.java`
#### Snippet
```java
     * @param cacheName
     * @param pattern
     * @param requesterId
     * @return empty map
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ZombieCacheServiceNonLocal.java`
#### Snippet
```java
     * @param requesterId
     * @return empty map
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param maxQueueSize` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ZombieCacheServiceNonLocal.java`
#### Snippet
```java
     * Sets the maximum number of items that will be allowed on the queue.
     * <p>
     * @param maxQueueSize
     */
    public ZombieCacheServiceNonLocal( final int maxQueueSize )
```

### JavadocDeclaration
`@param attr` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ElementAttributes.java`
#### Snippet
```java
     * Constructor for the IElementAttributes object
     * <p>
     * @param attr
     */
    protected ElementAttributes( final ElementAttributes attr )
```

### JavadocDeclaration
`@param spoolChunkSize` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CompositeCacheAttributes.java`
#### Snippet
```java
     * Number to send to disk at a time.
     * <p>
     * @param spoolChunkSize
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheWatchRepairable.java`
#### Snippet
```java
     * @param cacheName The feature to be added to the CacheListener attribute
     * @param obj The feature to be added to the CacheListener attribute
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param obj` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheWatchRepairable.java`
#### Snippet
```java

    /**
     * @param obj
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheWatchRepairable.java`
#### Snippet
```java
    /**
     * @param obj
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheElement.java`
#### Snippet
```java
     * Constructor for the CacheElement object
     * <p>
     * @param cacheName
     * @param key
     * @param val
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheElement.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @param val
     */
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheWatchRepairable.java`
#### Snippet
```java
     * Tell the server to release us.
     * <p>
     * @param cacheName
     * @param obj
     * @throws IOException
```

### JavadocDeclaration
`@param val` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheElement.java`
#### Snippet
```java
     * @param cacheName
     * @param key
     * @param val
     */
    public CacheElement( final String cacheName, final K key, final V val )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheElement.java`
#### Snippet
```java
     * Constructor for the CacheElement object
     * <p>
     * @param cacheName
     * @param key
     * @param val
```

### JavadocDeclaration
`@param obj` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheWatchRepairable.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param obj
     * @throws IOException
     */
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheElement.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @param val
     * @param attrArg
```

### JavadocDeclaration
`@param val` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheElement.java`
#### Snippet
```java
     * @param cacheName
     * @param key
     * @param val
     * @param attrArg
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheWatchRepairable.java`
#### Snippet
```java
     * @param cacheName
     * @param obj
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param attrArg` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheElement.java`
#### Snippet
```java
     * @param key
     * @param val
     * @param attrArg
     */
    public CacheElement( final String cacheName, final K key, final V val, final IElementAttributes attrArg )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheWatchRepairable.java`
#### Snippet
```java
     * <p>
     * @param obj The feature to be added to the CacheListener attribute
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ZombieCacheService.java`
#### Snippet
```java

    /**
     * @param cacheName
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ZombieCacheService.java`
#### Snippet
```java

    /**
     * @param cacheName
     */
    @Override
```

### JavadocDeclaration
`@param item` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ZombieCacheService.java`
#### Snippet
```java

    /**
     * @param item
     */
    public void put( final ICacheElement<K, V> item )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ZombieCacheService.java`
#### Snippet
```java

    /**
     * @param cacheName
     * @param key
     */
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ZombieCacheService.java`
#### Snippet
```java
    /**
     * @param cacheName
     * @param key
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ZombieCacheService.java`
#### Snippet
```java
     * Returns an empty map. Zombies have no internal data.
     * <p>
     * @param cacheName
     * @param keys
     * @return Collections.EMPTY_MAP
```

### JavadocDeclaration
`@param keys` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ZombieCacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param keys
     * @return Collections.EMPTY_MAP
     */
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ZombieCacheService.java`
#### Snippet
```java

    /**
     * @param cacheName
     * @param key
     * @return null. zombies have no internal data
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ZombieCacheService.java`
#### Snippet
```java
    /**
     * @param cacheName
     * @param key
     * @return null. zombies have no internal data
     */
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ZombieCacheService.java`
#### Snippet
```java
     * Logs the get to debug, but always balks.
     * <p>
     * @param cacheName
     * @param key
     * @param container
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ZombieCacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @param container
     * @return null always
```

### JavadocDeclaration
`@param container` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ZombieCacheService.java`
#### Snippet
```java
     * @param cacheName
     * @param key
     * @param container
     * @return null always
     */
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ZombieCacheService.java`
#### Snippet
```java
     * Returns an empty map. Zombies have no internal data.
     * <p>
     * @param cacheName
     * @param pattern
     * @return Collections.EMPTY_MAP
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ZombieCacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param pattern
     * @return Collections.EMPTY_MAP
     */
```

### JavadocDeclaration
`@param item` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ZombieCacheService.java`
#### Snippet
```java
     * Does nothing.
     * <p>
     * @param item
     */
    @Override
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/match/behavior/IKeyMatcher.java`
#### Snippet
```java
     * Creates a pattern and find matches on the array.
     * <p>
     * @param pattern
     * @param keyArray
     * @return Set of the matching keys
```

### JavadocDeclaration
`@param keyArray` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/match/behavior/IKeyMatcher.java`
#### Snippet
```java
     * <p>
     * @param pattern
     * @param keyArray
     * @return Set of the matching keys
     */
```

### JavadocDeclaration
`@param cache` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheListeners.java`
#### Snippet
```java
     * Constructs with the given cache.
     * <p>
     * @param cache
     */
    public CacheListeners( final ICache<K, V> cache )
```

### JavadocDeclaration
`@param name` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/stats/behavior/ICacheStats.java`
#### Snippet
```java

    /**
     * @param name
     */
    void setRegionName( String name );
```

### JavadocDeclaration
`@param stats` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/stats/behavior/ICacheStats.java`
#### Snippet
```java

    /**
     * @param stats
     */
    void setAuxiliaryCacheStats( List<IStats> stats );
```

### JavadocDeclaration
`@param data` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/stats/StatElement.java`
#### Snippet
```java
     * Set the data for this element.
     * <p>
     * @param data
     */
    @Override
```

### JavadocDeclaration
`@param name` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/stats/StatElement.java`
#### Snippet
```java
     * Constructor
     *
     * @param name
     * @param data
     */
```

### JavadocDeclaration
`@param data` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/stats/StatElement.java`
#### Snippet
```java
     *
     * @param name
     * @param data
     */
    public StatElement(final String name, final V data)
```

### JavadocDeclaration
`@param name` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/stats/StatElement.java`
#### Snippet
```java

    /**
     * @param name
     */
    @Override
```

### JavadocDeclaration
`@param cacheNameArg` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheElementSerialized.java`
#### Snippet
```java
     * Constructs a usable wrapper.
     * <p>
     * @param cacheNameArg
     * @param keyArg
     * @param serializedValueArg
```

### JavadocDeclaration
`@param keyArg` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheElementSerialized.java`
#### Snippet
```java
     * <p>
     * @param cacheNameArg
     * @param keyArg
     * @param serializedValueArg
     * @param elementAttributesArg
```

### JavadocDeclaration
`@param serializedValueArg` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheElementSerialized.java`
#### Snippet
```java
     * @param cacheNameArg
     * @param keyArg
     * @param serializedValueArg
     * @param elementAttributesArg
     */
```

### JavadocDeclaration
`@param elementAttributesArg` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheElementSerialized.java`
#### Snippet
```java
     * @param keyArg
     * @param serializedValueArg
     * @param elementAttributesArg
     */
    public CacheElementSerialized( final String cacheNameArg, final K keyArg, final byte[] serializedValueArg,
```

### JavadocDeclaration
`@param name` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/stats/behavior/IStatElement.java`
#### Snippet
```java

    /**
     * @param name
     */
    void setName( String name );
```

### JavadocDeclaration
`@param data` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/stats/behavior/IStatElement.java`
#### Snippet
```java
     * Set the data for this element.
     * <p>
     * @param data
     */
    void setData( V data );
```

### JavadocDeclaration
`@param stats` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/stats/behavior/IStats.java`
#### Snippet
```java
     * Set the generic statistical or historical data.
     *
     * @param stats
     */
    void setStatElements( List<IStatElement<?>> stats );
```

### JavadocDeclaration
`@param name` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/stats/behavior/IStats.java`
#### Snippet
```java
     * If we need formal types, we can use the cachetype param
     *
     * @param name
     */
    void setTypeName( String name );
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/match/KeyMatcherPatternImpl.java`
#### Snippet
```java
     * Creates a pattern and find matches on the array.
     * <p>
     * @param pattern
     * @param keyArray
     * @return Set of the matching keys
```

### JavadocDeclaration
`@param stats` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/stats/CacheStats.java`
#### Snippet
```java

    /**
     * @param stats
     */
    @Override
```

### JavadocDeclaration
`@param keyArray` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/match/KeyMatcherPatternImpl.java`
#### Snippet
```java
     * <p>
     * @param pattern
     * @param keyArray
     * @return Set of the matching keys
     */
```

### JavadocDeclaration
`@param name` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/stats/Stats.java`
#### Snippet
```java

    /**
     * @param name
     */
    @Override
```

### JavadocDeclaration
`@param stats` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/stats/Stats.java`
#### Snippet
```java

    /**
     * @param stats
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/AbstractCacheEventQueue.java`
#### Snippet
```java
         * Call removeAll on the listener.
         * <p>
         * @throws IOException
         */
        @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/AbstractCacheEventQueue.java`
#### Snippet
```java
         * Call put on the listener.
         * <p>
         * @throws IOException
         */
        @Override
```

### JavadocDeclaration
`@param b` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/AbstractCacheEventQueue.java`
#### Snippet
```java
     * is marked as non functional and will never work again.
     * <p>
     * @param b
     */
    public void setWorking( final boolean b )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/AbstractCacheEventQueue.java`
#### Snippet
```java
         * Called when gets to the end of the queue
         *
         * @throws IOException
         */
        @Override
```

### JavadocDeclaration
`@param ice` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/AbstractCacheEventQueue.java`
#### Snippet
```java
         * Constructor for the PutEvent object.
         * <p>
         * @param ice
         */
        PutEvent( final ICacheElement<K, V> ice )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/AbstractCacheEventQueue.java`
#### Snippet
```java
         * Call remove on the listener.
         * <p>
         * @throws IOException
         */
        @Override
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/AbstractCacheEventQueue.java`
#### Snippet
```java
         * Constructor for the RemoveEvent object
         * <p>
         * @param key
         */
        RemoveEvent( final K key )
```

### JavadocDeclaration
`@param listener` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/AbstractCacheEventQueue.java`
#### Snippet
```java
     * Initializes the queue.
     * <p>
     * @param listener
     * @param listenerId
     * @param cacheName
```

### JavadocDeclaration
`@param listenerId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/AbstractCacheEventQueue.java`
#### Snippet
```java
     * <p>
     * @param listener
     * @param listenerId
     * @param cacheName
     * @param maxFailure
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/AbstractCacheEventQueue.java`
#### Snippet
```java
     * @param listener
     * @param listenerId
     * @param cacheName
     * @param maxFailure
     * @param waitBeforeRetry
```

### JavadocDeclaration
`@param maxFailure` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/AbstractCacheEventQueue.java`
#### Snippet
```java
     * @param listenerId
     * @param cacheName
     * @param maxFailure
     * @param waitBeforeRetry
     */
```

### JavadocDeclaration
`@param waitBeforeRetry` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/AbstractCacheEventQueue.java`
#### Snippet
```java
     * @param cacheName
     * @param maxFailure
     * @param waitBeforeRetry
     */
    protected void initialize( final ICacheListener<K, V> listener, final long listenerId, final String cacheName, final int maxFailure,
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/AbstractCacheEventQueue.java`
#### Snippet
```java

        /**
         * @throws IOException
         */
        protected abstract void doRun()
```

### JavadocDeclaration
`@param event` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/AbstractCacheEventQueue.java`
#### Snippet
```java
     * Adds an event to the queue.
     * <p>
     * @param event
     */
    protected abstract void put( AbstractCacheEvent event );
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/AbstractCacheEventQueue.java`
#### Snippet
```java
     * <p>
     * @param key The feature to be added to the RemoveEvent attribute
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
IOException is not declared to be thrown by method addRemoveEvent
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/AbstractCacheEventQueue.java`
#### Snippet
```java
     * <p>
     * @param key The feature to be added to the RemoveEvent attribute
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/AbstractCacheEventQueue.java`
#### Snippet
```java
     * <p>
     * @param ce The feature to be added to the PutEvent attribute
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
IOException is not declared to be thrown by method addPutEvent
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/AbstractCacheEventQueue.java`
#### Snippet
```java
     * <p>
     * @param ce The feature to be added to the PutEvent attribute
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param listener` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/PooledCacheEventQueue.java`
#### Snippet
```java
     * Initializes the queue.
     * <p>
     * @param listener
     * @param listenerId
     * @param cacheName
```

### JavadocDeclaration
`@param listenerId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/PooledCacheEventQueue.java`
#### Snippet
```java
     * <p>
     * @param listener
     * @param listenerId
     * @param cacheName
     * @param maxFailure
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/PooledCacheEventQueue.java`
#### Snippet
```java
     * @param listener
     * @param listenerId
     * @param cacheName
     * @param maxFailure
     * @param waitBeforeRetry
```

### JavadocDeclaration
`@param maxFailure` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/PooledCacheEventQueue.java`
#### Snippet
```java
     * @param listenerId
     * @param cacheName
     * @param maxFailure
     * @param waitBeforeRetry
     * @param threadPoolName
```

### JavadocDeclaration
`@param waitBeforeRetry` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/PooledCacheEventQueue.java`
#### Snippet
```java
     * @param cacheName
     * @param maxFailure
     * @param waitBeforeRetry
     * @param threadPoolName
     */
```

### JavadocDeclaration
`@param threadPoolName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/PooledCacheEventQueue.java`
#### Snippet
```java
     * @param maxFailure
     * @param waitBeforeRetry
     * @param threadPoolName
     */
    protected void initialize( final ICacheListener<K, V> listener, final long listenerId, final String cacheName, final int maxFailure,
```

### JavadocDeclaration
`@param listener` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/PooledCacheEventQueue.java`
#### Snippet
```java
     * Constructor for the CacheEventQueue object
     * <p>
     * @param listener
     * @param listenerId
     * @param cacheName
```

### JavadocDeclaration
`@param listenerId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/PooledCacheEventQueue.java`
#### Snippet
```java
     * <p>
     * @param listener
     * @param listenerId
     * @param cacheName
     * @param maxFailure
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/PooledCacheEventQueue.java`
#### Snippet
```java
     * @param listener
     * @param listenerId
     * @param cacheName
     * @param maxFailure
     * @param waitBeforeRetry
```

### JavadocDeclaration
`@param maxFailure` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/PooledCacheEventQueue.java`
#### Snippet
```java
     * @param listenerId
     * @param cacheName
     * @param maxFailure
     * @param waitBeforeRetry
     * @param threadPoolName
```

### JavadocDeclaration
`@param waitBeforeRetry` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/PooledCacheEventQueue.java`
#### Snippet
```java
     * @param cacheName
     * @param maxFailure
     * @param waitBeforeRetry
     * @param threadPoolName
     */
```

### JavadocDeclaration
`@param threadPoolName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/PooledCacheEventQueue.java`
#### Snippet
```java
     * @param maxFailure
     * @param waitBeforeRetry
     * @param threadPoolName
     */
    public PooledCacheEventQueue( final ICacheListener<K, V> listener, final long listenerId, final String cacheName, final int maxFailure,
```

### JavadocDeclaration
`@param threadPoolName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/PooledCacheEventQueue.java`
#### Snippet
```java
     * Create the thread pool.
     * <p>
     * @param threadPoolName
     * @since 3.1
     */
```

### JavadocDeclaration
`@param event` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/PooledCacheEventQueue.java`
#### Snippet
```java
     * Adds an event to the queue.
     * <p>
     * @param event
     */
    @Override
```

### JavadocDeclaration
`@param me` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/fifo/FIFOMemoryCache.java`
#### Snippet
```java
     * Does nothing.
     * <p>
     * @param me
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/fifo/FIFOMemoryCache.java`
#### Snippet
```java
     * @param ce The cache element, or entry wrapper
     * @return MemoryElementDescriptor the new node
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param me` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/lru/LRUMemoryCache.java`
#### Snippet
```java
     * Makes the item the first in the list.
     * <p>
     * @param me
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/lru/LRUMemoryCache.java`
#### Snippet
```java
     * @param ce The cache element, or entry wrapper
     * @return MemoryElementDescriptor the new node
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param me` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/mru/MRUMemoryCache.java`
#### Snippet
```java
     * Makes the item the last in the list.
     * <p>
     * @param me
     */
    @Override
```

### JavadocDeclaration
`@param ce` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/mru/MRUMemoryCache.java`
#### Snippet
```java
     * if full, and then put.
     * <p>
     * @param ce
     * @return MemoryElementDescriptor the new node
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/mru/MRUMemoryCache.java`
#### Snippet
```java
     * @param ce
     * @return MemoryElementDescriptor the new node
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param ce` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/util/MemoryElementDescriptor.java`
#### Snippet
```java
     * Constructs a usable MemoryElementDescriptor.
     * <p>
     * @param ce
     */
    public MemoryElementDescriptor( final ICacheElement<K, V> ce )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/behavior/IMemoryCache.java`
#### Snippet
```java
     * Destroy the memory cache
     * <p>
     * @throws IOException
     */
    void dispose()
```

### JavadocDeclaration
`@param numberToFree` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/behavior/IMemoryCache.java`
#### Snippet
```java
     * spooled to disk if a disk auxiliary is available.
     * <p>
     * @param numberToFree
     * @return the number that were removed. if you ask to free 5, but there are
     *         only 3, you will get 3.
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/behavior/IMemoryCache.java`
#### Snippet
```java
     * @return the number that were removed. if you ask to free 5, but there are
     *         only 3, you will get 3.
     * @throws IOException
     */
    int freeElements( int numberToFree )
```

### JavadocDeclaration
`@param keys` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/behavior/IMemoryCache.java`
#### Snippet
```java
     * Gets multiple items from the cache based on the given set of keys.
     * <p>
     * @param keys
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map
     * if there is no data in cache for any of these keys
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/behavior/IMemoryCache.java`
#### Snippet
```java
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map
     * if there is no data in cache for any of these keys
     * @throws IOException
     */
    Map<K, ICacheElement<K, V>> getMultiple( Set<K> keys )
```

### JavadocDeclaration
`@param ce` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/util/SoftReferenceElementDescriptor.java`
#### Snippet
```java
     * Constructs a usable MemoryElementDescriptor.
     * <p>
     * @param ce
     */
    public SoftReferenceElementDescriptor( final ICacheElement<K, V> ce )
```

### JavadocDeclaration
`@param numberToFree` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/lru/LHMLRUMemoryCache.java`
#### Snippet
```java
     * This can't be implemented.
     * <p>
     * @param numberToFree
     * @return 0
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/lru/LHMLRUMemoryCache.java`
#### Snippet
```java
     * @param numberToFree
     * @return 0
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param eldest` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/lru/LHMLRUMemoryCache.java`
#### Snippet
```java
         * Remove eldest. Automatically called by LinkedHashMap.
         * <p>
         * @param eldest
         * @return true if removed
         */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/lru/LHMLRUMemoryCache.java`
#### Snippet
```java
     * <p>
     * @param ce Description of the Parameter
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param hub` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/lru/LHMLRUMemoryCache.java`
#### Snippet
```java
     * For post reflection creation initialization
     * <p>
     * @param hub
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/event/behavior/IElementEventQueue.java`
#### Snippet
```java
     * @param event
     *            The IElementEventHandler IElementEvent event
     * @throws IOException
     */
    <T> void addElementEvent( IElementEventHandler hand, IElementEvent<T> event )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/event/ElementEventQueue.java`
#### Snippet
```java
         * This will do the work or trigger the work to be done.
         * <p>
         * @throws IOException
         */
        protected abstract void doRun()
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/event/ElementEventQueue.java`
#### Snippet
```java
     * @param hand The IElementEventHandler
     * @param event The IElementEventHandler IElementEvent event
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param hub` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/soft/SoftReferenceMemoryCache.java`
#### Snippet
```java
     * For post reflection creation initialization
     * <p>
     * @param hub
     */
    @Override
```

### JavadocDeclaration
`@param numberToFree` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/soft/SoftReferenceMemoryCache.java`
#### Snippet
```java
     * This can't be implemented.
     * <p>
     * @param numberToFree
     * @return 0
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/soft/SoftReferenceMemoryCache.java`
#### Snippet
```java
     * @param numberToFree
     * @return 0
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param obj` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/group/GroupId.java`
#### Snippet
```java

    /**
     * @param obj
     * @return cacheName.equals( g.cacheName ) &amp;&amp;groupName.equals( g.groupName );
     */
```

### JavadocDeclaration
`@param groupId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/group/GroupAttrName.java`
#### Snippet
```java
    /**
     * Constructor for the GroupAttrName object
     * @param groupId
     * @param attrName
     */
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/group/GroupId.java`
#### Snippet
```java
     * Constructor for the GroupId object
     * <p>
     * @param cacheName
     * @param groupName
     */
```

### JavadocDeclaration
`@param attrName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/group/GroupAttrName.java`
#### Snippet
```java
     * Constructor for the GroupAttrName object
     * @param groupId
     * @param attrName
     */
    public GroupAttrName( final GroupId groupId, final T attrName )
```

### JavadocDeclaration
`@param groupName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/group/GroupId.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param groupName
     */
    public GroupId( final String cacheName, final String groupName )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/AbstractMemoryCache.java`
#### Snippet
```java
     * Removes all cached items from the cache.
     * <p>
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param keys` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/AbstractMemoryCache.java`
#### Snippet
```java
     * Gets multiple items from the cache based on the given set of keys.
     * <p>
     * @param keys
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/AbstractMemoryCache.java`
#### Snippet
```java
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/AbstractMemoryCache.java`
#### Snippet
```java
     * Prepares for shutdown. Reset statistics
     * <p>
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/AbstractMemoryCache.java`
#### Snippet
```java
     * @param key Identifies item to find
     * @return Element matching key if found, or null
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/AbstractMemoryCache.java`
#### Snippet
```java
     * <p>
     *
     * @param key
     * @return true if the removal was successful
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/AbstractMemoryCache.java`
#### Snippet
```java
     * @param key
     * @return true if the removal was successful
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param hub` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/AbstractMemoryCache.java`
#### Snippet
```java
     * For post reflection creation initialization
     * <p>
     * @param hub
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/AbstractMemoryCache.java`
#### Snippet
```java
     * @param key Identifies item to find
     * @return ICacheElement&lt;K, V&gt; if found, else null
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICompositeCacheManager.java`
#### Snippet
```java
     * Gets the cache attribute of the CacheHub object
     *
     * @param cacheName
     * @return CompositeCache
     */
```

### JavadocDeclaration
`@param auxName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICompositeCacheManager.java`
#### Snippet
```java
     * Gets the auxiliary cache attribute of the CacheHub object
     *
     * @param auxName
     * @param cacheName
     * @return AuxiliaryCache
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICompositeCacheManager.java`
#### Snippet
```java
     *
     * @param auxName
     * @param cacheName
     * @return AuxiliaryCache
     */
```

### JavadocDeclaration
`@param source` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/logging/CacheEventLoggerDebugLogger.java`
#### Snippet
```java

    /**
     * @param source
     * @param eventName
     * @param errorMessage
```

### JavadocDeclaration
`@param eventName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/logging/CacheEventLoggerDebugLogger.java`
#### Snippet
```java
    /**
     * @param source
     * @param eventName
     * @param errorMessage
     */
```

### JavadocDeclaration
`@param errorMessage` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/logging/CacheEventLoggerDebugLogger.java`
#### Snippet
```java
     * @param source
     * @param eventName
     * @param errorMessage
     */
    @Override
```

### JavadocDeclaration
`@param event` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/logging/CacheEventLoggerDebugLogger.java`
#### Snippet
```java

    /**
     * @param event
     */
    @Override
```

### JavadocDeclaration
`@param source` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/logging/CacheEventLoggerDebugLogger.java`
#### Snippet
```java

    /**
     * @param source
     * @param region
     * @param eventName
```

### JavadocDeclaration
`@param region` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/logging/CacheEventLoggerDebugLogger.java`
#### Snippet
```java
    /**
     * @param source
     * @param region
     * @param eventName
     * @param optionalDetails
```

### JavadocDeclaration
`@param eventName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/logging/CacheEventLoggerDebugLogger.java`
#### Snippet
```java
     * @param source
     * @param region
     * @param eventName
     * @param optionalDetails
     * @param key
```

### JavadocDeclaration
`@param optionalDetails` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/logging/CacheEventLoggerDebugLogger.java`
#### Snippet
```java
     * @param region
     * @param eventName
     * @param optionalDetails
     * @param key
     * @return ICacheEvent
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/logging/CacheEventLoggerDebugLogger.java`
#### Snippet
```java
     * @param eventName
     * @param optionalDetails
     * @param key
     * @return ICacheEvent
     */
```

### JavadocDeclaration
`@param logCategoryName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/logging/CacheEventLoggerDebugLogger.java`
#### Snippet
```java

    /**
     * @param logCategoryName
     */
    public synchronized void setLogCategoryName( final String logCategoryName )
```

### JavadocDeclaration
`@param source` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/logging/CacheEventLoggerDebugLogger.java`
#### Snippet
```java

    /**
     * @param source
     * @param eventName
     * @param optionalDetails
```

### JavadocDeclaration
`@param eventName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/logging/CacheEventLoggerDebugLogger.java`
#### Snippet
```java
    /**
     * @param source
     * @param eventName
     * @param optionalDetails
     */
```

### JavadocDeclaration
`@param optionalDetails` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/logging/CacheEventLoggerDebugLogger.java`
#### Snippet
```java
     * @param source
     * @param eventName
     * @param optionalDetails
     */
    @Override
```

### JavadocDeclaration
`@param scheduledExecutor` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/IRequireScheduler.java`
#### Snippet
```java
    /**
     * Inject an instance of a central ScheduledExecutorService
     * @param scheduledExecutor
     */
    void setScheduledExecutorService( ScheduledExecutorService scheduledExecutor );
```

### JavadocDeclaration
`@param observer` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/IShutdownObservable.java`
#### Snippet
```java
     * Deregister the observer with the observable.
     *
     * @param observer
     */
    void deregisterShutdownObserver( IShutdownObserver observer );
```

### JavadocDeclaration
`@param observer` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/IShutdownObservable.java`
#### Snippet
```java
    /**
     * Registers an observer with the observable object.
     * @param observer
     */
    void registerShutdownObserver( IShutdownObserver observer );
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheObserver.java`
#### Snippet
```java
    /**
     * Unsubscribes from the specified cache.
     * @param cacheName
     *
     * @param obj
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheObserver.java`
#### Snippet
```java
     * @param obj
     *            existing subscriber.
     * @throws IOException
     */
    <K, V> void removeCacheListener( String cacheName, ICacheListener<K, V> obj )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheObserver.java`
#### Snippet
```java
     * @param obj
     *            existing subscriber.
     * @throws IOException
     */
    <K, V> void removeCacheListener( ICacheListener<K, V> obj )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheObserver.java`
#### Snippet
```java
     * @param obj
     *            object to notify for all cache changes.
     * @throws IOException
     */
    <K, V> void addCacheListener( ICacheListener<K, V> obj )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheObserver.java`
#### Snippet
```java
     * @param obj
     *            object to notify for cache changes.
     * @throws IOException
     */
    <K, V> void addCacheListener( String cacheName, ICacheListener<K, V> obj )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheEventQueue.java`
#### Snippet
```java
     * @param key
     *            The feature to be added to the RemoveEvent attribute
     * @throws IOException
     */
    void addRemoveEvent( K key )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheEventQueue.java`
#### Snippet
```java
     * @param ce
     *            The feature to be added to the PutEvent attribute
     * @throws IOException
     */
    void addPutEvent( ICacheElement<K, V> ce )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheEventQueue.java`
#### Snippet
```java
     * object
     * <p>
     * @throws IOException
     */
    void addRemoveAllEvent()
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheEventQueue.java`
#### Snippet
```java
     * object
     * <p>
     * @throws IOException
     */
    void addDisposeEvent()
```

### JavadocDeclaration
`@param item` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheListener.java`
#### Snippet
```java
     * Notifies the subscribers for a cache entry update.
     * <p>
     * @param item
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheListener.java`
#### Snippet
```java
     * <p>
     * @param item
     * @throws IOException
     */
    void handlePut( ICacheElement<K, V> item )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheListener.java`
#### Snippet
```java
     * Notifies the subscribers for freeing up the named cache.
     * <p>
     * @param cacheName
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheListener.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @throws IOException
     */
    void handleDispose( String cacheName )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheListener.java`
#### Snippet
```java
     * <p>
     * @param id The new listenerId value
     * @throws IOException
     */
    void setListenerId( long id )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheListener.java`
#### Snippet
```java
     * Notifies the subscribers for a cache remove-all.
     * <p>
     * @param cacheName
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheListener.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @throws IOException
     */
    void handleRemoveAll( String cacheName )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheListener.java`
#### Snippet
```java
     * <p>
     * @return The listenerId value
     * @throws IOException
     */
    long getListenerId()
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheListener.java`
#### Snippet
```java
     * Notifies the subscribers for a cache entry removal.
     * <p>
     * @param cacheName
     * @param key
     * @throws IOException
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheServiceNonLocal.java`
#### Snippet
```java
     * Gets multiple items from the cache based on the given set of keys.
     * <p>
     * @param cacheName
     * @param keys
     * @param requesterId
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheListener.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @throws IOException
     */
```

### JavadocDeclaration
`@param keys` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheServiceNonLocal.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param keys
     * @param requesterId
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheListener.java`
#### Snippet
```java
     * @param cacheName
     * @param key
     * @throws IOException
     */
    void handleRemove( String cacheName, K key )
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheServiceNonLocal.java`
#### Snippet
```java
     * @param cacheName
     * @param keys
     * @param requesterId
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheServiceNonLocal.java`
#### Snippet
```java
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
     * @throws IOException
     */
    Map<K, ICacheElement<K, V>> getMultiple( String cacheName, Set<K> keys, long requesterId )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheServiceNonLocal.java`
#### Snippet
```java
     * Adding the requester id, allows the cache to determine the source of the get.
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheServiceNonLocal.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
     * @return ICacheElement
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheServiceNonLocal.java`
#### Snippet
```java
     * @param cacheName
     * @param key
     * @param requesterId
     * @return ICacheElement
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheServiceNonLocal.java`
#### Snippet
```java
     * @param requesterId
     * @return ICacheElement
     * @throws IOException
     */
    ICacheElement<K, V> get( String cacheName, K key, long requesterId )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheServiceNonLocal.java`
#### Snippet
```java
     * Gets multiple items from the cache matching the pattern.
     * <p>
     * @param cacheName
     * @param pattern
     * @param requesterId
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheServiceNonLocal.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param pattern
     * @param requesterId
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheServiceNonLocal.java`
#### Snippet
```java
     * @param cacheName
     * @param pattern
     * @param requesterId
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache matching the pattern.
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheServiceNonLocal.java`
#### Snippet
```java
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache matching the pattern.
     * @throws IOException
     */
    Map<K, ICacheElement<K, V>> getMatching( String cacheName, String pattern, long requesterId )
```

### JavadocDeclaration
`@param item` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheServiceNonLocal.java`
#### Snippet
```java
     * Puts a cache item to the cache.
     * <p>
     * @param item
     * @param requesterId
     * @throws IOException
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheServiceNonLocal.java`
#### Snippet
```java
     * <p>
     * @param item
     * @param requesterId
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheServiceNonLocal.java`
#### Snippet
```java
     * @param item
     * @param requesterId
     * @throws IOException
     */
    void update( ICacheElement<K, V> item, long requesterId )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheServiceNonLocal.java`
#### Snippet
```java
     * Removes the given key from the specified cache.
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheServiceNonLocal.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
     * @throws IOException
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheServiceNonLocal.java`
#### Snippet
```java
     * @param cacheName
     * @param key
     * @param requesterId
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheServiceNonLocal.java`
#### Snippet
```java
     * @param key
     * @param requesterId
     * @throws IOException
     */
    void remove( String cacheName, K key, long requesterId )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheServiceNonLocal.java`
#### Snippet
```java
     * Remove all keys from the specified cache.
     * <p>
     * @param cacheName
     * @param requesterId
     * @throws IOException
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheServiceNonLocal.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param requesterId
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheServiceNonLocal.java`
#### Snippet
```java
     * @param cacheName
     * @param requesterId
     * @throws IOException
     */
    void removeAll( String cacheName, long requesterId )
```

### JavadocDeclaration
`@param spoolChunkSize` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICompositeCacheAttributes.java`
#### Snippet
```java
     * Number to send to disk at a time.
     * <p>
     * @param spoolChunkSize
     */
    void setSpoolChunkSize( int spoolChunkSize );
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheServiceAdmin.java`
#### Snippet
```java
     *
     * @return The stats value
     * @throws IOException
     */
    String getStats()
```

### JavadocDeclaration
`@param host` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheServiceAdmin.java`
#### Snippet
```java

    /** Description of the Method
     * @param host
     * @param port
     * @throws IOException*/
```

### JavadocDeclaration
`@param port` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheServiceAdmin.java`
#### Snippet
```java
    /** Description of the Method
     * @param host
     * @param port
     * @throws IOException*/
    void shutdown( String host, int port )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheServiceAdmin.java`
#### Snippet
```java
     * @param host
     * @param port
     * @throws IOException*/
    void shutdown( String host, int port )
        throws IOException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheServiceAdmin.java`
#### Snippet
```java

    /** Description of the Method
     * @throws IOException*/
    void shutdown()
        throws IOException;
```

### JavadocDeclaration
`@param me` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/AbstractDoubleLinkedListMemoryCache.java`
#### Snippet
```java
     * <p>
     *
     * @param me
     */
    protected abstract void adjustListForGet(MemoryElementDescriptor<K, V> me);
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/AbstractDoubleLinkedListMemoryCache.java`
#### Snippet
```java
     * @param ce
     *            The cache element, or entry wrapper
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param numberToFree` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/AbstractDoubleLinkedListMemoryCache.java`
#### Snippet
```java
     * <p>
     *
     * @param numberToFree
     * @return the number that were removed. if you ask to free 5, but there are only 3, you will
     *         get 3.
```

### JavadocDeclaration
`@param ce` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/AbstractDoubleLinkedListMemoryCache.java`
#### Snippet
```java
     * <p>
     *
     * @param ce
     * @return MemoryElementDescriptor the new node
     * @throws IOException
```

### JavadocDeclaration
`@param props` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCacheConfigurator.java`
#### Snippet
```java
     * Any property values will be replaced with system property values that match the key.
     * <p>
     * @param props
     */
    protected static void overrideWithSystemProperties( final Properties props )
```

### JavadocDeclaration
`@param props` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCacheConfigurator.java`
#### Snippet
```java
     * Creates a custom key matcher if one is defined.  Else, it uses the default.
     * <p>
     * @param props
     * @param auxPrefix - ex. AUXILIARY_PREFIX + auxName
     * @return IKeyMatcher
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/AbstractDoubleLinkedListMemoryCache.java`
#### Snippet
```java
     * @param ce
     * @return MemoryElementDescriptor the new node
     * @throws IOException
     */
    protected abstract MemoryElementDescriptor<K, V> adjustListForUpdate(ICacheElement<K, V> ce) throws IOException;
```

### JavadocDeclaration
`@param hub` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/AbstractDoubleLinkedListMemoryCache.java`
#### Snippet
```java
     * <p>
     *
     * @param hub
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/AbstractDoubleLinkedListMemoryCache.java`
#### Snippet
```java
     *
     * @return ICacheElement&lt;K, V&gt; if there was a last element, else null.
     * @throws Error
     */
    private ICacheElement<K, V> spoolLastElement() throws Error
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/AbstractDoubleLinkedListMemoryCache.java`
#### Snippet
```java
     * <p>
     *
     * @param key
     */
    private void verifyCache(final K key)
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/AbstractDoubleLinkedListMemoryCache.java`
#### Snippet
```java
     * <p>
     *
     * @throws Error
     */
    private void spoolIfNeeded() throws Error
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheService.java`
#### Snippet
```java
     * Frees the specified cache.
     * <p>
     * @param cacheName
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @throws IOException
     */
    void dispose( String cacheName )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheService.java`
#### Snippet
```java
    /**
     * Frees all caches.
     * @throws IOException
     */
    void release()
```

### JavadocDeclaration
`@param item` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheService.java`
#### Snippet
```java
     * Puts a cache item to the cache.
     * <p>
     * @param item
     * @throws ObjectExistsException
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheService.java`
#### Snippet
```java
     * <p>
     * @param item
     * @throws ObjectExistsException
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheService.java`
#### Snippet
```java
     * @param item
     * @throws ObjectExistsException
     * @throws IOException
     */
    void update( ICacheElement<K, V> item )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheService.java`
#### Snippet
```java
     * Gets multiple items from the cache matching the pattern.
     * <p>
     * @param cacheName
     * @param pattern
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param pattern
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache matching the pattern.
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheService.java`
#### Snippet
```java
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache matching the pattern.
     * @throws IOException
     */
    Map<K, ICacheElement<K, V>> getMatching( String cacheName, String pattern )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheService.java`
#### Snippet
```java
    /**
     * Remove all keys from the specified cache.
     * @param cacheName
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheService.java`
#### Snippet
```java
     * Remove all keys from the specified cache.
     * @param cacheName
     * @throws IOException
     */
    void removeAll( String cacheName )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheService.java`
#### Snippet
```java
     * Returns a cache bean from the specified cache; or null if the key does not exist.
     * <p>
     * @param cacheName
     * @param key
     * @return the ICacheElement&lt;K, V&gt; or null if not found
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @return the ICacheElement&lt;K, V&gt; or null if not found
     * @throws ObjectNotFoundException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheService.java`
#### Snippet
```java
     * @param key
     * @return the ICacheElement&lt;K, V&gt; or null if not found
     * @throws ObjectNotFoundException
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheService.java`
#### Snippet
```java
     * @return the ICacheElement&lt;K, V&gt; or null if not found
     * @throws ObjectNotFoundException
     * @throws IOException
     */
    ICacheElement<K, V> get( String cacheName, K key )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheService.java`
#### Snippet
```java
     * Gets multiple items from the cache based on the given set of keys.
     * <p>
     * @param cacheName
     * @param keys
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
```

### JavadocDeclaration
`@param keys` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param keys
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheService.java`
#### Snippet
```java
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
     * @throws ObjectNotFoundException
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheService.java`
#### Snippet
```java
     *         data in cache for any of these keys
     * @throws ObjectNotFoundException
     * @throws IOException
     */
    Map<K, ICacheElement<K, V>> getMultiple( String cacheName, Set<K> keys )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheService.java`
#### Snippet
```java
     * Removes the given key from the specified cache.
     * <p>
     * @param cacheName
     * @param key
     * @throws IOException
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICacheService.java`
#### Snippet
```java
     * @param cacheName
     * @param key
     * @throws IOException
     */
    void remove( String cacheName, K key )
```

### JavadocDeclaration
`@param attr` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AuxiliaryCacheFactory.java`
#### Snippet
```java
     * Creates an auxiliary using the supplied attributes. Adds it to the composite cache manager.
     *
     * @param attr
     * @param cacheMgr This allows auxiliaries to reference the manager without assuming that it is
     *            a singleton. This will allow JCS to be a non-singleton. Also, it makes it easier to
```

### JavadocDeclaration
`@param cacheEventLogger` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AuxiliaryCacheFactory.java`
#### Snippet
```java
     *            a singleton. This will allow JCS to be a non-singleton. Also, it makes it easier to
     *            test.
     * @param cacheEventLogger
     * @param elementSerializer
     * @return AuxiliaryCache
```

### JavadocDeclaration
`@param elementSerializer` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AuxiliaryCacheFactory.java`
#### Snippet
```java
     *            test.
     * @param cacheEventLogger
     * @param elementSerializer
     * @return AuxiliaryCache
     * @throws Exception if cache instance could not be created
```

### JavadocDeclaration
`@param cacheEventLogger` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AuxiliaryCache.java`
#### Snippet
```java
     * Every Auxiliary must allow for the use of an event logger.
     * <p>
     * @param cacheEventLogger
     */
    void setCacheEventLogger( ICacheEventLogger cacheEventLogger );
```

### JavadocDeclaration
`@param elementSerializer` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AuxiliaryCache.java`
#### Snippet
```java
     * serializer.
     * <p>
     * @param elementSerializer
     */
    void setElementSerializer( IElementSerializer elementSerializer );
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICache.java`
#### Snippet
```java
     * Gets an item from the cache.
     *
     * @param key
     * @return a cache element, or null if there is no data in cache for this key
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICache.java`
#### Snippet
```java
     * @param key
     * @return a cache element, or null if there is no data in cache for this key
     * @throws IOException
     */
    ICacheElement<K, V> get( K key )
```

### JavadocDeclaration
`@param element` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICache.java`
#### Snippet
```java
     * Puts an item to the cache.
     *
     * @param element
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICache.java`
#### Snippet
```java
     *
     * @param element
     * @throws IOException
     */
    void update( ICacheElement<K, V> element )
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICache.java`
#### Snippet
```java
     * Auxiliaries will do their best to handle simple expressions.  For instance, the JDBC disk cache will convert * to % and . to _
     *
     * @param pattern
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no data matching the pattern.
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICache.java`
#### Snippet
```java
     * @param pattern
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no data matching the pattern.
     * @throws IOException
     */
    Map<K, ICacheElement<K, V>> getMatching(String pattern)
```

### JavadocDeclaration
`@param keyMatcher` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICache.java`
#### Snippet
```java
     * Sets the key matcher used by get matching.
     *
     * @param keyMatcher
     */
    void setKeyMatcher( IKeyMatcher<K> keyMatcher );
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICache.java`
#### Snippet
```java
     * Removes all cached items from the cache.
     *
     * @throws IOException
     */
    void removeAll()
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICache.java`
#### Snippet
```java
     * Removes an item from the cache.
     *
     * @param key
     * @return false if there was an error in removal
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICache.java`
#### Snippet
```java
     * @param key
     * @return false if there was an error in removal
     * @throws IOException
     */
    boolean remove( K key )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICache.java`
#### Snippet
```java
    /**
     * Prepares for shutdown.
     * @throws IOException
     */
    void dispose()
```

### JavadocDeclaration
`@param keys` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICache.java`
#### Snippet
```java
     * Gets multiple items from the cache based on the given set of keys.
     *
     * @param keys
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no data in cache for any of these keys
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/behavior/ICache.java`
#### Snippet
```java
     * @param keys
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no data in cache for any of these keys
     * @throws IOException
     */
    Map<K, ICacheElement<K, V>> getMultiple(Set<K> keys)
```

### JavadocDeclaration
`@param props` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AuxiliaryCacheConfigurator.java`
#### Snippet
```java
     * Parses the event logger config, if there is any for the auxiliary.
     * <p>
     * @param props
     * @param auxPrefix - ex. AUXILIARY_PREFIX + auxName
     * @return cacheEventLogger
```

### JavadocDeclaration
`@param props` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AuxiliaryCacheConfigurator.java`
#### Snippet
```java
     * Parses the element config, if there is any for the auxiliary.
     * <p>
     * @param props
     * @param auxPrefix - ex. AUXILIARY_PREFIX + auxName
     * @return cacheEventLogger
```

### JavadocDeclaration
`@param name` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheAttributes.java`
#### Snippet
```java

    /**
     * @param name
     */
    @Override
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     * Implementation of get.
     *
     * @param key
     * @return ICacheElement, a wrapper around the key, value, and attributes
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     * @param key
     * @return ICacheElement, a wrapper around the key, value, and attributes
     * @throws IOException
     */
    protected abstract ICacheElement<K, V> processGet( K key )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     * Removes all from the region. Wraps the removeAll in event logs.
     *
     * @throws IOException
     */
    protected final void removeAllWithEventLogging()
```

### JavadocDeclaration
`@param attr` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/PurgatoryElement.java`
#### Snippet
```java

    /**
     * @param attr
     * @see ICacheElement#setElementAttributes
     */
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     * Specific implementation of remove.
     *
     * @param key
     * @return boolean, whether or not the item was removed
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     * @param key
     * @return boolean, whether or not the item was removed
     * @throws IOException
     */
    protected abstract boolean processRemove( K key )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     * Specific implementation of dispose.
     *
     * @throws IOException
     */
    protected abstract void processDispose()
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     * cache will convert * to % and . to _
     *
     * @param pattern
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data matching the pattern.
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data matching the pattern.
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     * Gets matching items from the cache based on the given pattern.
     *
     * @param pattern
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data matching the pattern.
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data matching the pattern.
     * @throws IOException
     */
    protected final Map<K, ICacheElement<K, V>> getMatchingWithEventLogging( final String pattern )
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     * Gets the item from the cache. Wrapped in logging.
     *
     * @param key
     * @return ICacheElement, a wrapper around the key, value, and attributes
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     * @param key
     * @return ICacheElement, a wrapper around the key, value, and attributes
     * @throws IOException
     */
    protected final ICacheElement<K, V> getWithEventLogging( final K key )
```

### JavadocDeclaration
`@param cacheElement` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     * Implementation of put.
     *
     * @param cacheElement
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     *
     * @param cacheElement
     * @throws IOException
     */
    protected abstract void processUpdate( ICacheElement<K, V> cacheElement )
```

### JavadocDeclaration
`@param cacheElement` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     * Puts an item into the cache. Wrapped in logging.
     *
     * @param cacheElement
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     *
     * @param cacheElement
     * @throws IOException
     */
    protected final void updateWithEventLogging( final ICacheElement<K, V> cacheElement )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     * Synchronously dispose the remote cache; if failed, replace the remote handle with a zombie.
     *
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     * Removes the item from the cache. Wraps the remove in event logs.
     *
     * @param key
     * @return boolean, whether or not the item was removed
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     * @param key
     * @return boolean, whether or not the item was removed
     * @throws IOException
     */
    protected final boolean removeWithEventLogging( final K key )
```

### JavadocDeclaration
`@param keys` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     * Gets multiple items from the cache based on the given set of keys.
     *
     * @param keys
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
     * @throws IOException
     */
    protected final Map<K, ICacheElement<K, V>> getMultipleWithEventLogging(final Set<K> keys )
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     * Gets the item from the cache.
     *
     * @param key
     * @return ICacheElement, a wrapper around the key, value, and attributes
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     * @param key
     * @return ICacheElement, a wrapper around the key, value, and attributes
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     * Wraps the removeAll in event logs.
     *
     * @throws IOException
     */
    protected final void disposeWithEventLogging()
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     * Specific implementation of removeAll.
     *
     * @throws IOException
     */
    protected abstract void processRemoveAll()
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     * Implementation of getMatching.
     *
     * @param pattern
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data matching the pattern.
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data matching the pattern.
     * @throws IOException
     */
    protected abstract Map<K, ICacheElement<K, V>> processGetMatching( String pattern )
```

### JavadocDeclaration
`@param keys` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     * Gets multiple items from the cache based on the given set of keys.
     *
     * @param keys
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     * Removes all from the region. Wraps the removeAll in event logs.
     *
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     * Removes the item from the cache. Wraps the remove in event logs.
     *
     * @param key
     * @return boolean, whether or not the item was removed
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     * @param key
     * @return boolean, whether or not the item was removed
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheElement` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     * Puts an item into the cache.
     *
     * @param cacheElement
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheEventLogging.java`
#### Snippet
```java
     *
     * @param cacheElement
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param tableName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/TableState.java`
#### Snippet
```java
     * Construct a usable table state.
     * <p>
     * @param tableName
     */
    public TableState( final String tableName )
```

### JavadocDeclaration
`@param diskCache` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/ShrinkerThread.java`
#### Snippet
```java
     * Adds a JDBC disk cache to the set of disk cache to shrink.
     * <p>
     * @param diskCache
     */
    public void addDiskCacheToShrinkList( final JDBCDiskCache<?, ?> diskCache )
```

### JavadocDeclaration
`@param cacheEventLogger` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCache.java`
#### Snippet
```java
     * Allows it to be injected.
     * <p>
     * @param cacheEventLogger
     */
    @Override
```

### JavadocDeclaration
`@param source` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCache.java`
#### Snippet
```java
     * Logs an event if an event logger is configured.
     * <p>
     * @param source
     * @param eventName
     * @param optionalDetails
```

### JavadocDeclaration
`@param eventName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCache.java`
#### Snippet
```java
     * <p>
     * @param source
     * @param eventName
     * @param optionalDetails
     */
```

### JavadocDeclaration
`@param optionalDetails` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCache.java`
#### Snippet
```java
     * @param source
     * @param eventName
     * @param optionalDetails
     */
    protected void logApplicationEvent( final String source, final String eventName, final String optionalDetails )
```

### JavadocDeclaration
`@param keyMatcher` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCache.java`
#### Snippet
```java
     * Sets the key matcher used by get matching.
     * <p>
     * @param keyMatcher
     */
    @Override
```

### JavadocDeclaration
`@param item` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCache.java`
#### Snippet
```java
     * Logs an event if an event logger is configured.
     * <p>
     * @param item
     * @param eventName
     * @return ICacheEvent
```

### JavadocDeclaration
`@param eventName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCache.java`
#### Snippet
```java
     * <p>
     * @param item
     * @param eventName
     * @return ICacheEvent
     */
```

### JavadocDeclaration
`@param source` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCache.java`
#### Snippet
```java
     * Logs an event if an event logger is configured.
     * <p>
     * @param source
     * @param eventName
     * @param errorMessage
```

### JavadocDeclaration
`@param eventName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCache.java`
#### Snippet
```java
     * <p>
     * @param source
     * @param eventName
     * @param errorMessage
     */
```

### JavadocDeclaration
`@param errorMessage` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCache.java`
#### Snippet
```java
     * @param source
     * @param eventName
     * @param errorMessage
     */
    protected void logError( final String source, final String eventName, final String errorMessage )
```

### JavadocDeclaration
`@param regionName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCache.java`
#### Snippet
```java
     * Logs an event if an event logger is configured.
     * <p>
     * @param regionName
     * @param key
     * @param eventName
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCache.java`
#### Snippet
```java
     * <p>
     * @param regionName
     * @param key
     * @param eventName
     * @return ICacheEvent
```

### JavadocDeclaration
`@param eventName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCache.java`
#### Snippet
```java
     * @param regionName
     * @param key
     * @param eventName
     * @return ICacheEvent
     */
```

### JavadocDeclaration
`@param cacheEvent` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCache.java`
#### Snippet
```java
     * Logs an event if an event logger is configured.
     * <p>
     * @param cacheEvent
     */
    protected <T> void logICacheEvent( final ICacheEvent<T> cacheEvent )
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCache.java`
#### Snippet
```java
     * Gets the item from the cache.
     *
     * @param key
     * @return ICacheElement, a wrapper around the key, value, and attributes
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCache.java`
#### Snippet
```java
     * @param key
     * @return ICacheElement, a wrapper around the key, value, and attributes
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param keys` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCache.java`
#### Snippet
```java
     * Gets multiple items from the cache based on the given set of keys.
     *
     * @param keys
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
```

### JavadocDeclaration
`@param elementSerializer` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCache.java`
#### Snippet
```java
     * Does not allow you to set it to null.
     * <p>
     * @param elementSerializer
     */
    @Override
```

### JavadocDeclaration
`@param cConn` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/hsql/HSQLDiskCacheFactory.java`
#### Snippet
```java
     * SETUP TABLE FOR CACHE
     * <p>
     * @param cConn
     * @param tableName
     */
```

### JavadocDeclaration
`@param tableName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/hsql/HSQLDiskCacheFactory.java`
#### Snippet
```java
     * <p>
     * @param cConn
     * @param tableName
     */
    protected synchronized void setupTable( final Connection cConn, final String tableName ) throws SQLException
```

### JavadocDeclaration
`@param rawAttr` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/hsql/HSQLDiskCacheFactory.java`
#### Snippet
```java
     * This factory method should create an instance of the hsqlcache.
     * <p>
     * @param rawAttr
     * @param compositeCacheManager
     * @param cacheEventLogger
```

### JavadocDeclaration
`@param compositeCacheManager` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/hsql/HSQLDiskCacheFactory.java`
#### Snippet
```java
     * <p>
     * @param rawAttr
     * @param compositeCacheManager
     * @param cacheEventLogger
     * @param elementSerializer
```

### JavadocDeclaration
`@param cacheEventLogger` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/hsql/HSQLDiskCacheFactory.java`
#### Snippet
```java
     * @param rawAttr
     * @param compositeCacheManager
     * @param cacheEventLogger
     * @param elementSerializer
     * @return JDBCDiskCache
```

### JavadocDeclaration
`@param elementSerializer` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/hsql/HSQLDiskCacheFactory.java`
#### Snippet
```java
     * @param compositeCacheManager
     * @param cacheEventLogger
     * @param elementSerializer
     * @return JDBCDiskCache
     * @throws SQLException if the creation of the cache instance fails
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/hsql/HSQLDiskCacheFactory.java`
#### Snippet
```java
     * @param ds Data Source
     * @param attributes Cache region configuration
     * @throws SQLException
     */
    protected void setupDatabase( final DataSource ds, final JDBCDiskCacheAttributes attributes )
```

### JavadocDeclaration
`@param tableName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/JDBCDiskCacheFactory.java`
#### Snippet
```java
     * Get a table state for a given table name
     *
     * @param tableName
     * @return a cached instance of the table state
     */
```

### JavadocDeclaration
`@param cattr` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/JDBCDiskCacheFactory.java`
#### Snippet
```java
     * If UseDiskShrinker is true then we will create a shrinker daemon if necessary.
     * <p>
     * @param cattr
     * @param raf
     */
```

### JavadocDeclaration
`@param raf` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/JDBCDiskCacheFactory.java`
#### Snippet
```java
     * <p>
     * @param cattr
     * @param raf
     */
    protected void createShrinkerWhenNeeded( final JDBCDiskCacheAttributes cattr, final JDBCDiskCache<?, ?> raf )
```

### JavadocDeclaration
`@param optimizer` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/mysql/MySQLDiskCacheFactory.java`
#### Snippet
```java
     * <p>
     * @param startTime -- HH:MM:SS format
     * @param optimizer
     */
    protected void scheduleOptimization( final Date startTime, final MySQLTableOptimizer optimizer )
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/mysql/MySQLDiskCache.java`
#### Snippet
```java

    /**
     * @param pattern
     * @return String to use in the like query.
     */
```

### JavadocDeclaration
`@param element` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/mysql/MySQLDiskCache.java`
#### Snippet
```java
     * method will balk and do nothing.
     * <p>
     * @param element
     */
    @Override
```

### JavadocDeclaration
`@param props` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCacheManager.java`
#### Snippet
```java
     * with the argument: -Djcs.auxiliary.LTCP.attributes.TcpListenerPort=1111
     * <p>
     * @param props
     * @param useSystemProperties -- if true, values starting with jcs will be put into the props
     *            file prior to configuring the cache.
```

### JavadocDeclaration
`@param auxFac` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCacheManager.java`
#### Snippet
```java

    /**
     * @param auxFac
     */
    public void registryFacPut( final AuxiliaryCacheFactory auxFac )
```

### JavadocDeclaration
`@param observer` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCacheManager.java`
#### Snippet
```java

    /**
     * @param observer
     */
    @Override
```

### JavadocDeclaration
`@param auxAttr` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCacheManager.java`
#### Snippet
```java

    /**
     * @param auxAttr
     */
    public void registryAttrPut( final AuxiliaryCacheAttributes auxAttr )
```

### JavadocDeclaration
`@param name` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCacheManager.java`
#### Snippet
```java

    /**
     * @param name
     * @param fromRemote
     */
```

### JavadocDeclaration
`@param fromRemote` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCacheManager.java`
#### Snippet
```java
    /**
     * @param name
     * @param fromRemote
     */
    public void freeCache( final String name, final boolean fromRemote )
```

### JavadocDeclaration
`@param cattr` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCacheManager.java`
#### Snippet
```java
     * Gets the cache attribute of the CacheHub object
     * <p>
     * @param cattr
     * @return CompositeCache
     */
```

### JavadocDeclaration
`@param name` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCacheManager.java`
#### Snippet
```java

    /**
     * @param name
     * @return AuxiliaryCacheAttributes
     */
```

### JavadocDeclaration
`@param props` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCacheManager.java`
#### Snippet
```java
     * with the argument: -Djcs.auxiliary.LTCP.attributes.TcpListenerPort=1111
     * <p>
     * @param props
     * @param useSystemProperties -- if true, values starting with jcs will be put into the props
     *            file prior to configuring the cache.
```

### JavadocDeclaration
`@param props` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCacheManager.java`
#### Snippet
```java
     * <p>
     * This method will call configure, instructing it to use system properties as a default.
     * @param props
     */
    public void configure( final Properties props )
```

### JavadocDeclaration
`@param name` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCacheManager.java`
#### Snippet
```java

    /**
     * @param name
     */
    public void freeCache( final String name )
```

### JavadocDeclaration
`@param fromRemote` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCacheManager.java`
#### Snippet
```java

    /**
     * @param fromRemote
     */
    private void release( final boolean fromRemote )
```

### JavadocDeclaration
`@param name` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCacheManager.java`
#### Snippet
```java

    /**
     * @param name
     * @return AuxiliaryCacheFactory
     */
```

### JavadocDeclaration
`@param propsFilename` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCacheManager.java`
#### Snippet
```java
     * Initializes the cache manager using the props file for the given name.
     * <p>
     * @param propsFilename
     * @return CompositeCacheManager configured from the give propsFileName
     * @throws CacheException if the configuration cannot be loaded
```

### JavadocDeclaration
`@param cattr` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCacheManager.java`
#### Snippet
```java
     * want to create separate method for creating/getting. . .
     * <p>
     * @param cattr
     * @param attr
     * @return CompositeCache
```

### JavadocDeclaration
`@param attr` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCacheManager.java`
#### Snippet
```java
     * <p>
     * @param cattr
     * @param attr
     * @return CompositeCache
     */
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCacheManager.java`
#### Snippet
```java
     * Gets the cache attribute of the CacheHub object
     * <p>
     * @param cacheName
     * @param cattr
     * @param attr
```

### JavadocDeclaration
`@param cattr` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCacheManager.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param cattr
     * @param attr
     * @return CompositeCache
```

### JavadocDeclaration
`@param attr` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCacheManager.java`
#### Snippet
```java
     * @param cacheName
     * @param cattr
     * @param attr
     * @return CompositeCache
     */
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCacheManager.java`
#### Snippet
```java
     * Gets the cache attribute of the CacheHub object
     * <p>
     * @param cacheName
     * @param cattr
     * @return CompositeCache
```

### JavadocDeclaration
`@param cattr` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCacheManager.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param cattr
     * @return CompositeCache
     */
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCacheManager.java`
#### Snippet
```java
     * Gets the cache attribute of the CacheHub object
     * <p>
     * @param cacheName
     * @return CompositeCache -- the cache region controller
     */
```

### JavadocDeclaration
`@param observer` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCacheManager.java`
#### Snippet
```java
     * closing the socket with a lateral.
     * <p>
     * @param observer
     */
    @Override
```

### JavadocDeclaration
`@param cacheElement` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCache.java`
#### Snippet
```java
     * abstract process* methods. The children implement the process methods.
     *
     * @param cacheElement
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCache.java`
#### Snippet
```java
     *
     * @param cacheElement
     * @throws IOException
     */
    protected final void doUpdate( final ICacheElement<K, V> cacheElement )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCache.java`
#### Snippet
```java

    /**
     * @throws IOException
     * @see org.apache.commons.jcs3.engine.behavior.ICache#removeAll
     */
```

### JavadocDeclaration
`@param element` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCache.java`
#### Snippet
```java

        /**
         * @param element
         * @throws IOException
         * @see ICacheListener#handlePut NOTE: This checks if the element is a puratory element and
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCache.java`
#### Snippet
```java
        /**
         * @param element
         * @throws IOException
         * @see ICacheListener#handlePut NOTE: This checks if the element is a puratory element and
         *      behaves differently depending. However since we have control over how elements are
```

### JavadocDeclaration
`@param id` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCache.java`
#### Snippet
```java

        /**
         * @param id
         * @throws IOException
         * @see ICacheListener#setListenerId
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCache.java`
#### Snippet
```java
        /**
         * @param id
         * @throws IOException
         * @see ICacheListener#setListenerId
         */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCache.java`
#### Snippet
```java
     * @param key Key to locate value for.
     * @return An object matching key, or null.
     * @throws IOException
     */
    protected final ICacheElement<K, V> doGet( final K key )
```

### JavadocDeclaration
`@param cacheElement` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCache.java`
#### Snippet
```java
     * defined here. The handlePut method calls the implemented doPut on the child.
     *
     * @param cacheElement
     * @throws IOException
     * @see org.apache.commons.jcs3.engine.behavior.ICache#update
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCache.java`
#### Snippet
```java
     *
     * @param cacheElement
     * @throws IOException
     * @see org.apache.commons.jcs3.engine.behavior.ICache#update
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCache.java`
#### Snippet
```java
        /**
         * @return cacheElement.getElementAttributes();
         * @throws IOException
         * @see ICacheListener#getListenerId
         */
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCache.java`
#### Snippet
```java
     * it on disk.
     *
     * @param key
     * @return ICacheElement&lt;K, V&gt; or null
     * @see AuxiliaryCache#get
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCache.java`
#### Snippet
```java
     * <li>Call doDispose on the concrete impl.</li>
     * </ol>
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCache.java`
#### Snippet
```java
     * @param pattern Used to match keys.
     * @return A map of matches..
     * @throws IOException
     */
    protected final Map<K, ICacheElement<K, V>> doGetMatching( final String pattern )
```

### JavadocDeclaration
`@param attr` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCache.java`
#### Snippet
```java
     * set the alive flag to true after they are initialized.
     *
     * @param attr
     */
    protected AbstractDiskCache( final IDiskCacheAttributes attr )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCache.java`
#### Snippet
```java
     * abstract process* methods. The children implement the process methods.
     *
     * @throws IOException
     */
    protected final void doDispose()
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCache.java`
#### Snippet
```java
     * @param key Key of object to remove.
     * @return whether or no the item was present when removed
     * @throws IOException
     */
    protected final boolean doRemove( final K key )
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCache.java`
#### Snippet
```java
     * cache will convert * to % and . to _
     *
     * @param pattern
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data matching the pattern.
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCache.java`
#### Snippet
```java
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data matching the pattern.
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCache.java`
#### Snippet
```java
     * Removes are not queued. A call to remove is immediate.
     *
     * @param key
     * @return whether the item was present to be removed.
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCache.java`
#### Snippet
```java
     * @param key
     * @return whether the item was present to be removed.
     * @throws IOException
     * @see org.apache.commons.jcs3.engine.behavior.ICache#remove
     */
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCache.java`
#### Snippet
```java

        /**
         * @param cacheName
         * @throws IOException
         * @see ICacheListener#handleDispose
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCache.java`
#### Snippet
```java
        /**
         * @param cacheName
         * @throws IOException
         * @see ICacheListener#handleDispose
         */
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCache.java`
#### Snippet
```java

        /**
         * @param cacheName
         * @throws IOException
         * @see ICacheListener#handleRemoveAll
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCache.java`
#### Snippet
```java
        /**
         * @param cacheName
         * @throws IOException
         * @see ICacheListener#handleRemoveAll
         */
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCache.java`
#### Snippet
```java

        /**
         * @param cacheName
         * @param key
         * @throws IOException
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCache.java`
#### Snippet
```java
        /**
         * @param cacheName
         * @param key
         * @throws IOException
         * @see ICacheListener#handleRemove
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCache.java`
#### Snippet
```java
         * @param cacheName
         * @param key
         * @throws IOException
         * @see ICacheListener#handleRemove
         */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCache.java`
#### Snippet
```java
     * abstract process* methods. The children implement the process methods.
     *
     * @throws IOException
     */
    protected final void doRemoveAll()
```

### JavadocDeclaration
`@param cacheEventLogger` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskCacheFactory.java`
#### Snippet
```java
     *            a singleton. This will allow JCS to be a non-singleton. Also, it makes it easier
     *            to test.
     * @param cacheEventLogger
     * @param elementSerializer
     * @return BlockDiskCache
```

### JavadocDeclaration
`@param elementSerializer` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskCacheFactory.java`
#### Snippet
```java
     *            to test.
     * @param cacheEventLogger
     * @param elementSerializer
     * @return BlockDiskCache
     */
```

### JavadocDeclaration
`@param schedule` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/mysql/util/ScheduleParser.java`
#### Snippet
```java
     * OptimizationSchedule, create a date and add it to an array of dates.
     * <p>
     * @param schedule
     * @return Date[]
     * @throws ParseException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/mysql/util/ScheduleParser.java`
#### Snippet
```java
     * @param schedule
     * @return Date[]
     * @throws ParseException
     */
    public static Date[] createDatesForSchedule( final String schedule )
```

### JavadocDeclaration
`@param startTime` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/mysql/util/ScheduleParser.java`
#### Snippet
```java
     * combo will be seen.
     * <p>
     * @param startTime
     * @return Date
     * @throws ParseException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/mysql/util/ScheduleParser.java`
#### Snippet
```java
     * @param startTime
     * @return Date
     * @throws ParseException
     */
    public static Date getDateForSchedule( final String startTime )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/dsfactory/JndiDataSourceFactory.java`
#### Snippet
```java
     *
     * @param ctx the context
     * @throws NamingException
     */
    private static void debugCtx(final Context ctx) throws NamingException
```

### JavadocDeclaration
`@param attributes` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/mysql/MySQLTableOptimizer.java`
#### Snippet
```java
     * This constructs an optimizer with the disk can properties.
     * <p>
     * @param attributes
     * @param tableState We mark the table status as optimizing when this is happening.
     * @param dataSource access to the database
```

### JavadocDeclaration
`@param sStatement` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/mysql/MySQLTableOptimizer.java`
#### Snippet
```java
     * This calls show table status and returns the result as a String.
     * <p>
     * @param sStatement
     * @return String
     * @throws SQLException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/mysql/MySQLTableOptimizer.java`
#### Snippet
```java
     * @param sStatement
     * @return String
     * @throws SQLException
     */
    protected String getTableStatus( final Statement sStatement )
```

### JavadocDeclaration
`@param sStatement` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/mysql/MySQLTableOptimizer.java`
#### Snippet
```java
     * true. Otherwise we assume that the repair failed.
     * <p>
     * @param sStatement
     * @return true if successful
     * @throws SQLException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/mysql/MySQLTableOptimizer.java`
#### Snippet
```java
     * @param sStatement
     * @return true if successful
     * @throws SQLException
     */
    protected boolean repairTable( final Statement sStatement )
```

### JavadocDeclaration
`@param pos` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskElementDescriptor.java`
#### Snippet
```java
     * Constructs a usable disk element descriptor.
     * <p>
     * @param pos
     * @param len
     */
```

### JavadocDeclaration
`@param len` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskElementDescriptor.java`
#### Snippet
```java
     * <p>
     * @param pos
     * @param len
     */
    public IndexedDiskElementDescriptor( final long pos, final int len )
```

### JavadocDeclaration
`@param cacheEventLogger` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCacheFactory.java`
#### Snippet
```java
     *            a singleton. This will allow JCS to be a non-singleton. Also, it makes it easier to
     *            test.
     * @param cacheEventLogger
     * @param elementSerializer
     * @return IndexedDiskCache
```

### JavadocDeclaration
`@param elementSerializer` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCacheFactory.java`
#### Snippet
```java
     *            test.
     * @param cacheEventLogger
     * @param elementSerializer
     * @return IndexedDiskCache
     */
```

### JavadocDeclaration
`@param elementsFromAuxiliary` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * <p>
     * @param aux the auxiliary cache instance
     * @param elementsFromAuxiliary
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * @param aux the auxiliary cache instance
     * @param elementsFromAuxiliary
     * @throws IOException
     */
    private void processRetrievedElements(final AuxiliaryCache<K, V> aux, final Map<K, ICacheElement<K, V>> elementsFromAuxiliary)
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * Build a map of all the matching elements in all of the auxiliaries and memory.
     * <p>
     * @param pattern
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any matching keys
```

### JavadocDeclaration
`@param attr` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * Sets the default element attribute of the Cache object.
     * <p>
     * @param attr
     */
    public void setElementAttributes(final IElementAttributes attr)
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * remote or lateral if such an auxiliary is configured for this region.
     * <p>
     * @param pattern
     * @param localOnly
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
```

### JavadocDeclaration
`@param localOnly` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * <p>
     * @param pattern
     * @param localOnly
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any matching keys
```

### JavadocDeclaration
`@param fromRemote` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * overflow channel to disk. After the auxiliaries are disposed, the memory cache is disposed.
     * <p>
     * @param fromRemote
     */
    public void dispose(final boolean fromRemote)
```

### JavadocDeclaration
`@param keyMatcher` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * Sets the key matcher used by get matching.
     * <p>
     * @param keyMatcher
     */
    @Override
```

### JavadocDeclaration
`@param queue` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * Injector for Element event queue
     *
     * @param queue
     */
    public void setElementEventQueue(final IElementEventQueue queue)
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * Will not pass the remove message remotely.
     * <p>
     * @throws IOException
     */
    public void localRemoveAll()
```

### JavadocDeclaration
`@param keys` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * If local invocation look in aux caches, even if not local look in disk auxiliaries.
     * <p>
     * @param keys
     * @param localOnly
     * @return the elements found in the auxiliary caches
```

### JavadocDeclaration
`@param localOnly` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * <p>
     * @param keys
     * @param localOnly
     * @return the elements found in the auxiliary caches
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * @param localOnly
     * @return the elements found in the auxiliary caches
     * @throws IOException
     */
    private Map<K, ICacheElement<K, V>> getMultipleFromAuxiliaryCaches(final Set<K> keys, final boolean localOnly)
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * Removes an item from the cache.
     * <p>
     * @param key
     * @return true is it was removed
     * @see org.apache.commons.jcs3.engine.behavior.ICache#remove(Object)
```

### JavadocDeclaration
`@param keys` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * Gets items for the keys in the set. Returns a map: key -> result.
     * <p>
     * @param keys
     * @return the elements found in the memory cache
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * @param keys
     * @return the elements found in the memory cache
     * @throws IOException
     */
    private Map<K, ICacheElement<K, V>> getMultipleFromMemory(final Set<K> keys)
```

### JavadocDeclaration
`@param auxCaches` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * It filters out null caches
     * <p>
     * @param auxCaches
     * @since 3.1
     */
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * Do not propagate removeall laterally or remotely.
     * <p>
     * @param key
     * @return true if the item was already in the cache.
     */
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * Gets an item from the cache.
     * <p>
     * @param key
     * @return element from the cache, or null if not present
     * @see org.apache.commons.jcs3.engine.behavior.ICache#get(Object)
```

### JavadocDeclaration
`@param ce` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * Standard update method.
     * <p>
     * @param ce
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * <p>
     * @param ce
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cattr` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * TODO: might want to create a memory cache config file separate from that of the hub -- ICompositeCacheAttributes
     * <p>
     * @param cattr
     */
    private void createMemoryCache(final ICompositeCacheAttributes cattr)
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * @param cacheElement the ICacheElement&lt;K, V&gt;
     * @param localOnly Whether the operation should be restricted to local auxiliaries.
     * @throws IOException
     */
    protected void update(final ICacheElement<K, V> cacheElement, final boolean localOnly)
```

### JavadocDeclaration
`@param keys` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * laterally for this data.
     * <p>
     * @param keys
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
```

### JavadocDeclaration
`@param auxCaches` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * This sets the list of auxiliary caches for this region.
     * <p>
     * @param auxCaches
     * @deprecated Use List method
     */
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * go remote or laterally for this data.
     * <p>
     * @param pattern
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any matching keys
```

### JavadocDeclaration
`@param cacheElement` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * This is protected to make it testable.
     * <p>
     * @param cacheElement
     * @param localOnly
     * @throws IOException
```

### JavadocDeclaration
`@param localOnly` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * <p>
     * @param cacheElement
     * @param localOnly
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * @param cacheElement
     * @param localOnly
     * @throws IOException
     */
    protected void updateAuxiliaries(final ICacheElement<K, V> cacheElement, final boolean localOnly)
```

### JavadocDeclaration
`@param manager` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * Injector for cache manager
     *
     * @param manager
     */
    public void setCompositeCacheManager(final CompositeCacheManager manager)
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * Gets the elementAttributes attribute of the Cache object.
     * <p>
     * @param key
     * @return The elementAttributes value
     * @throws CacheException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * @param key
     * @return The elementAttributes value
     * @throws CacheException
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * @return The elementAttributes value
     * @throws CacheException
     * @throws IOException
     */
    public IElementAttributes getElementAttributes(final K key)
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * @param localOnly must pass in false to get remote and lateral aux's updated. This prevents
     *            looping.
     * @throws IOException
     */
    protected void removeAll(final boolean localOnly)
```

### JavadocDeclaration
`@param keys` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * remote or lateral if such an auxiliary is configured for this region.
     * <p>
     * @param keys
     * @param localOnly
     * @return ICacheElement
```

### JavadocDeclaration
`@param localOnly` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * <p>
     * @param keys
     * @param localOnly
     * @return ICacheElement
     */
```

### JavadocDeclaration
`@param keys` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * Returns a set of keys that were not found.
     * <p>
     * @param keys
     * @param foundElements
     * @return the original set of cache keys, minus any cache keys present in the map keys of the
```

### JavadocDeclaration
`@param foundElements` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * <p>
     * @param keys
     * @param foundElements
     * @return the original set of cache keys, minus any cache keys present in the map keys of the
     *         foundElements map
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * remote with those on disk.
     * <p>
     * @param pattern
     * @param localOnly
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
```

### JavadocDeclaration
`@param localOnly` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * <p>
     * @param pattern
     * @param localOnly
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any matching keys
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any matching keys
     * @throws IOException
     */
    private Map<K, ICacheElement<K, V>> getMatchingFromAuxiliaryCaches(final String pattern, final boolean localOnly)
```

### JavadocDeclaration
`@param keys` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * Gets multiple items from the cache based on the given set of keys.
     * <p>
     * @param keys
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
```

### JavadocDeclaration
`@param element` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * cache size is greater than 0, else the item will immediately get put into purgatory.
     * <p>
     * @param element
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * <p>
     * @param element
     * @throws IOException
     */
    private void copyAuxiliaryRetrievedItemToMemory(final ICacheElement<K, V> element)
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * set. Returns a map: key -&gt; result.
     * <p>
     * @param pattern
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any matching keys
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any matching keys
     * @throws IOException
     */
    protected Map<K, ICacheElement<K, V>> getMatchingFromMemory(final String pattern)
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * Do not try to go remote or laterally for this get.
     * <p>
     * @param key
     * @return ICacheElement
     */
```

### JavadocDeclaration
`@param ce` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * Standard update method.
     * <p>
     * @param ce
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * <p>
     * @param ce
     * @throws IOException
     */
    public void localUpdate(final ICacheElement<K, V> ce)
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * removal.
     * <p>
     * @param key
     * @param localOnly
     * @return true if the item was in the cache, else false
```

### JavadocDeclaration
`@param localOnly` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * <p>
     * @param key
     * @param localOnly
     * @return true if the item was in the cache, else false
     */
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * remote or lateral if such an auxiliary is configured for this region.
     * <p>
     * @param key
     * @param localOnly
     * @return ICacheElement
```

### JavadocDeclaration
`@param localOnly` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCache.java`
#### Snippet
```java
     * <p>
     * @param key
     * @param localOnly
     * @return ICacheElement
     */
```

### JavadocDeclaration
`@param diskLimitTypeName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/behavior/IDiskCacheAttributes.java`
#### Snippet
```java
     *
     * Allowed values: "COUNT" and "SIZE"
     * @param diskLimitTypeName
     */
    void setDiskLimitTypeName(String diskLimitTypeName);
```

### JavadocDeclaration
`@param allowRemoveAll` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/behavior/IDiskCacheAttributes.java`
#### Snippet
```java
     * This provides a safety mechanism for the persistent store.
     * <p>
     * @param allowRemoveAll
     */
    void setAllowRemoveAll( boolean allowRemoveAll );
```

### JavadocDeclaration
`@param ded` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDisk.java`
#### Snippet
```java
     * <p>
     * @return Serializable
     * @param ded
     * @throws IOException
     * @throws ClassNotFoundException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDisk.java`
#### Snippet
```java
     * @return Serializable
     * @param ded
     * @throws IOException
     * @throws ClassNotFoundException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDisk.java`
#### Snippet
```java
     * @param ded
     * @throws IOException
     * @throws ClassNotFoundException
     */
    protected <T> T readObject(final IndexedDiskElementDescriptor ded)
```

### JavadocDeclaration
`@param file` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDisk.java`
#### Snippet
```java
     * Constructor for the Disk object
     * <p>
     * @param file
     * @param elementSerializer
     * @throws IOException
```

### JavadocDeclaration
`@param elementSerializer` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDisk.java`
#### Snippet
```java
     * <p>
     * @param file
     * @param elementSerializer
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDisk.java`
#### Snippet
```java
     * @param file
     * @param elementSerializer
     * @throws IOException
     */
    public IndexedDisk(final File file, final IElementSerializer elementSerializer)
```

### JavadocDeclaration
`@param obj` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDisk.java`
#### Snippet
```java
     * <p>
     * TODO: make this take a ded as well.
     * @param obj
     * @param pos
     * @throws IOException
```

### JavadocDeclaration
`@param pos` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDisk.java`
#### Snippet
```java
     * TODO: make this take a ded as well.
     * @param obj
     * @param pos
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDisk.java`
#### Snippet
```java
     * @param obj
     * @param pos
     * @throws IOException
     */
    protected <T> void writeObject(final T obj, final long pos)
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDisk.java`
#### Snippet
```java
     * Sets the raf to empty.
     * <p>
     * @throws IOException
     */
    protected synchronized void reset()
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDisk.java`
#### Snippet
```java
     * <p>
     * @param length the new length of the file
     * @throws IOException
     */
    protected void truncate(final long length)
```

### JavadocDeclaration
`@param ded` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDisk.java`
#### Snippet
```java
     * Moves the data stored from one position to another. The descriptor's position is updated.
     * <p>
     * @param ded
     * @param newPosition
     * @throws IOException
```

### JavadocDeclaration
`@param newPosition` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDisk.java`
#### Snippet
```java
     * <p>
     * @param ded
     * @param newPosition
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDisk.java`
#### Snippet
```java
     * @param ded
     * @param newPosition
     * @throws IOException
     */
    protected void move(final IndexedDiskElementDescriptor ded, final long newPosition)
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDisk.java`
#### Snippet
```java
     * Closes the raf.
     * <p>
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param data` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDisk.java`
#### Snippet
```java
     * Writes the given byte array to the Disk at the specified position.
     * <p>
     * @param data
     * @param ded
     * @return true if we wrote successfully
```

### JavadocDeclaration
`@param ded` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDisk.java`
#### Snippet
```java
     * <p>
     * @param data
     * @param ded
     * @return true if we wrote successfully
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDisk.java`
#### Snippet
```java
     * @param ded
     * @return true if we wrote successfully
     * @throws IOException
     */
    protected boolean write(final IndexedDiskElementDescriptor ded, final byte[] data)
```

### JavadocDeclaration
`@param host` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteLocation.java`
#### Snippet
```java
     * Constructor for the Location object
     * <p>
     * @param host
     * @param port
     */
```

### JavadocDeclaration
`@param port` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteLocation.java`
#### Snippet
```java
     * <p>
     * @param host
     * @param port
     */
    public RemoteLocation( final String host, final int port )
```

### JavadocDeclaration
`@param obj` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteLocation.java`
#### Snippet
```java

    /**
     * @param obj
     * @return true if the host and port are equal
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
     * Closes the file.
     * <p>
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param data` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
     * The number of blocks needed.
     * <p>
     * @param data
     * @return the number of blocks needed to store the byte array
     */
```

### JavadocDeclaration
`@param object` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
     * <li>If the process fails we should decrement the block count if we took from it.</li>
     * </ol>
     * @param object
     * @return the blocks we used.
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
     * @param object
     * @return the blocks we used.
     * @throws IOException
     */
    protected <T> int[] write(final T object)
```

### JavadocDeclaration
`@param file` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
     * Constructor for the Disk object
     * <p>
     * @param file
     * @param elementSerializer
     * @throws IOException
```

### JavadocDeclaration
`@param elementSerializer` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
     * <p>
     * @param file
     * @param elementSerializer
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
     * @param file
     * @param elementSerializer
     * @throws IOException
     */
    public BlockDisk(final File file, final IElementSerializer elementSerializer)
```

### JavadocDeclaration
`@param file` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
     * Creates the file and set the block size in bytes.
     * <p>
     * @param file
     * @param blockSizeBytes
     * @throws IOException
```

### JavadocDeclaration
`@param blockSizeBytes` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
     * <p>
     * @param file
     * @param blockSizeBytes
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
     * @param file
     * @param blockSizeBytes
     * @throws IOException
     */
    public BlockDisk(final File file, final int blockSizeBytes)
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
     * <p>
     * @return the size of the file.
     * @throws IOException
     */
    protected long length()
```

### JavadocDeclaration
`@param block` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
     * <p>
     * @return byte[]
     * @param block
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
     * @return byte[]
     * @param block
     * @throws IOException
     */
    private ByteBuffer readBlock(final int block)
```

### JavadocDeclaration
`@param numBlocksNeeded` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
     * Allocate a given number of blocks from the available set
     *
     * @param numBlocksNeeded
     * @return an array of allocated blocks
     */
```

### JavadocDeclaration
`@param file` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
     * Creates the file and set the block size in bytes.
     * <p>
     * @param file
     * @param blockSizeBytes
     * @param elementSerializer
```

### JavadocDeclaration
`@param blockSizeBytes` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
     * <p>
     * @param file
     * @param blockSizeBytes
     * @param elementSerializer
     * @throws IOException
```

### JavadocDeclaration
`@param elementSerializer` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
     * @param file
     * @param blockSizeBytes
     * @param elementSerializer
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
     * @param blockSizeBytes
     * @param elementSerializer
     * @throws IOException
     */
    public BlockDisk(final File file, final int blockSizeBytes, final IElementSerializer elementSerializer)
```

### JavadocDeclaration
`@param blockNumbers` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
     * Reads an object that is located in the specified blocks.
     * <p>
     * @param blockNumbers
     * @return the object instance
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
     * @param blockNumbers
     * @return the object instance
     * @throws IOException
     * @throws ClassNotFoundException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
     * @return the object instance
     * @throws IOException
     * @throws ClassNotFoundException
     */
    protected <T> T read(final int[] blockNumbers)
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
     * Resets the file.
     * <p>
     * @throws IOException
     */
    protected synchronized void reset()
```

### JavadocDeclaration
`@param blocksToFree` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
     * Add these blocks to the emptyBlock list.
     * <p>
     * @param blocksToFree
     */
    protected void freeBlocks(final int[] blocksToFree)
```

### JavadocDeclaration
`@param complete` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
     * Return the amount to put in each block. Fill them all the way, minus the header.
     * <p>
     * @param complete
     * @param numBlocksNeeded
     * @return byte[][]
```

### JavadocDeclaration
`@param numBlocksNeeded` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
     * <p>
     * @param complete
     * @param numBlocksNeeded
     * @return byte[][]
     */
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskKeyStore.java`
#### Snippet
```java
     * <p>
     *
     * @param key
     * @return BlockDiskElementDescriptor if it was present, else null
     */
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskKeyStore.java`
#### Snippet
```java
         * <p>
         *
         * @param key
         * @param value
         */
```

### JavadocDeclaration
`@param value` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskKeyStore.java`
#### Snippet
```java
         *
         * @param key
         * @param value
         */
        @Override
```

### JavadocDeclaration
`@param cacheAttributes` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskKeyStore.java`
#### Snippet
```java
     * <p>
     *
     * @param cacheAttributes
     * @param blockDiskCache
     *            used for freeing
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskKeyStore.java`
#### Snippet
```java
     * <p>
     *
     * @param key
     * @return Object
     */
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskKeyStore.java`
#### Snippet
```java
         * <p>
         *
         * @param key
         * @param value
         */
```

### JavadocDeclaration
`@param value` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskKeyStore.java`
#### Snippet
```java
         *
         * @param key
         * @param value
         */
        @Override
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskKeyStore.java`
#### Snippet
```java
     * <p>
     *
     * @param key
     * @param value
     */
```

### JavadocDeclaration
`@param value` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskKeyStore.java`
#### Snippet
```java
     *
     * @param key
     * @param value
     */
    public void put(final K key, final int[] value)
```

### JavadocDeclaration
`@param ex` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCache.java`
#### Snippet
```java
     * the form of an IOException.
     * <p>
     * @param ex
     * @param msg
     * @param eventName
```

### JavadocDeclaration
`@param msg` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCache.java`
#### Snippet
```java
     * <p>
     * @param ex
     * @param msg
     * @param eventName
     * @throws IOException
```

### JavadocDeclaration
`@param eventName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCache.java`
#### Snippet
```java
     * @param ex
     * @param msg
     * @param eventName
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCache.java`
#### Snippet
```java
     * @param msg
     * @param eventName
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/JDBCDiskCache.java`
#### Snippet
```java

    /**
     * @param pattern
     * @return String to use in the like query.
     */
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/JDBCDiskCache.java`
#### Snippet
```java
     * implementation always results in a disk orphan.
     * <p>
     * @param key
     * @return boolean
     */
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/JDBCDiskCache.java`
#### Snippet
```java
     * implementations will be needed to adjust the syntax.
     * <p>
     * @param pattern
     * @return key,value map
     */
```

### JavadocDeclaration
`@param ce` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/JDBCDiskCache.java`
#### Snippet
```java
     * update.
     * <p>
     * @param ce
     * @param con
     * @param element
```

### JavadocDeclaration
`@param con` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/JDBCDiskCache.java`
#### Snippet
```java
     * <p>
     * @param ce
     * @param con
     * @param element
     */
```

### JavadocDeclaration
`@param element` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/JDBCDiskCache.java`
#### Snippet
```java
     * @param ce
     * @param con
     * @param element
     */
    private void insertOrUpdate( final ICacheElement<K, V> ce, final Connection con, final byte[] element )
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/JDBCDiskCache.java`
#### Snippet
```java
     * Queries the database for the value. If it gets a result, the value is deserialized.
     * <p>
     * @param key
     * @return ICacheElement
     * @see org.apache.commons.jcs3.auxiliary.disk.AbstractDiskCache#get(Object)
```

### JavadocDeclaration
`@param ce` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/JDBCDiskCache.java`
#### Snippet
```java
     * This updates a row in the database.
     * <p>
     * @param ce
     * @param con
     * @param element
```

### JavadocDeclaration
`@param con` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/JDBCDiskCache.java`
#### Snippet
```java
     * <p>
     * @param ce
     * @param con
     * @param element
     */
```

### JavadocDeclaration
`@param element` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/JDBCDiskCache.java`
#### Snippet
```java
     * @param ce
     * @param con
     * @param element
     */
    private void updateRow( final ICacheElement<K, V> ce, final Connection con, final byte[] element )
```

### JavadocDeclaration
`@param ce` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/JDBCDiskCache.java`
#### Snippet
```java
     * check before inserting.
     * <p>
     * @param ce
     */
    @Override
```

### JavadocDeclaration
`@param ce` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/JDBCDiskCache.java`
#### Snippet
```java
     * This inserts a new row in the database.
     * <p>
     * @param ce
     * @param con
     * @param element
```

### JavadocDeclaration
`@param con` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/JDBCDiskCache.java`
#### Snippet
```java
     * <p>
     * @param ce
     * @param con
     * @param element
     * @return true if the insertion fails because the record exists.
```

### JavadocDeclaration
`@param element` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/JDBCDiskCache.java`
#### Snippet
```java
     * @param ce
     * @param con
     * @param element
     * @return true if the insertion fails because the record exists.
     */
```

### JavadocDeclaration
`@param noWaits` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheNoWaitFacade.java`
#### Snippet
```java
     * Constructs with the given remote cache, and fires events to any listeners.
     * <p>
     * @param noWaits
     * @param rca
     * @param cacheEventLogger
```

### JavadocDeclaration
`@param rca` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheNoWaitFacade.java`
#### Snippet
```java
     * <p>
     * @param noWaits
     * @param rca
     * @param cacheEventLogger
     * @param elementSerializer
```

### JavadocDeclaration
`@param cacheEventLogger` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheNoWaitFacade.java`
#### Snippet
```java
     * @param noWaits
     * @param rca
     * @param cacheEventLogger
     * @param elementSerializer
     * @param cacheFactory
```

### JavadocDeclaration
`@param elementSerializer` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheNoWaitFacade.java`
#### Snippet
```java
     * @param rca
     * @param cacheEventLogger
     * @param elementSerializer
     * @param cacheFactory
     */
```

### JavadocDeclaration
`@param cacheFactory` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheNoWaitFacade.java`
#### Snippet
```java
     * @param cacheEventLogger
     * @param elementSerializer
     * @param cacheFactory
     */
    public RemoteCacheNoWaitFacade( final List<RemoteCacheNoWait<K,V>> noWaits,
```

### JavadocDeclaration
`@param cattr` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheManager.java`
#### Snippet
```java
     * created if one isn't already registered with the remote cache for this region.
     * <p>
     * @param cattr
     * @return The cache value
     */
```

### JavadocDeclaration
`@param cacheEventLogger` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheManager.java`
#### Snippet
```java
     * @param cacheMgr the cache hub
     * @param monitor the cache monitor thread for error notifications
     * @param cacheEventLogger
     * @param elementSerializer
     */
```

### JavadocDeclaration
`@param elementSerializer` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheManager.java`
#### Snippet
```java
     * @param monitor the cache monitor thread for error notifications
     * @param cacheEventLogger
     * @param elementSerializer
     */
    protected RemoteCacheManager( final IRemoteCacheAttributes cattr, final ICompositeCacheManager cacheMgr,
```

### JavadocDeclaration
`@param cattr` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheManager.java`
#### Snippet
```java
     * one regions failover act as another servers primary is not currently supported.
     * <p>
     * @param cattr
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheManager.java`
#### Snippet
```java
     * <p>
     * @param cattr
     * @throws IOException
     */
    public void removeRemoteCacheListener( final IRemoteCacheAttributes cattr )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheManager.java`
#### Snippet
```java
     * @param cattr The feature to be added to the RemoteCacheListener attribute
     * @param listener The feature to be added to the RemoteCacheListener attribute
     * @throws IOException
     */
    public <K, V> void addRemoteCacheListener( final IRemoteCacheAttributes cattr, final IRemoteCacheListener<K, V> listener )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteCacheListener.java`
#### Snippet
```java
     * <p>
     * @return The listenerId value
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param remote` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheNoWait.java`
#### Snippet
```java
     * starting up a new instance.
     * <p>
     * @param remote
     */
    public void fixCache( final ICacheServiceNonLocal<?, ?> remote )
```

### JavadocDeclaration
`@param keys` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheNoWait.java`
#### Snippet
```java
     * request on to the server rather than looping through the requested keys.
     * <p>
     * @param keys
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheNoWait.java`
#### Snippet
```java
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheNoWait.java`
#### Snippet
```java
     * Adds a remove request to the remote cache.
     * <p>
     * @param key
     * @return if this was successful
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheNoWait.java`
#### Snippet
```java
     * @param key
     * @return if this was successful
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheNoWait.java`
#### Snippet
```java

    /**
     * @param pattern
     * @return Map
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheNoWait.java`
#### Snippet
```java
     * @param pattern
     * @return Map
     * @throws IOException
     *
     */
```

### JavadocDeclaration
`@param element` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheNoWait.java`
#### Snippet
```java
     * Adds a put event to the queue.
     * <p>
     * @param element
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheNoWait.java`
#### Snippet
```java
     * <p>
     * @param element
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cache` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheNoWait.java`
#### Snippet
```java
     * processing.
     * <p>
     * @param cache
     */
    public RemoteCacheNoWait( final IRemoteCacheClient<K, V> cache )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheNoWait.java`
#### Snippet
```java
     * Adds a removeAll request to the remote cache.
     * <p>
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheNoWait.java`
#### Snippet
```java
     * Synchronously reads from the remote cache.
     * <p>
     * @param key
     * @return element from the remote cache, or null if not present
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheNoWait.java`
#### Snippet
```java
     * @param key
     * @return element from the remote cache, or null if not present
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteCacheListener.java`
#### Snippet
```java
     * Calls localRemove on the CompositeCache.
     * <p>
     * @param cacheName
     * @param key
     * @throws IOException
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteCacheListener.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteCacheListener.java`
#### Snippet
```java
     * @param cacheName
     * @param key
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteCacheListener.java`
#### Snippet
```java
     * <p>
     * @param id The new listenerId value
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteCacheListener.java`
#### Snippet
```java

    /**
     * @param cacheName
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteCacheListener.java`
#### Snippet
```java
    /**
     * @param cacheName
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cb` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteCacheListener.java`
#### Snippet
```java
     * <p>
     * If remove on put is not configured, then update the item.
     * @param cb
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteCacheListener.java`
#### Snippet
```java
     * If remove on put is not configured, then update the item.
     * @param cb
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteCacheListener.java`
#### Snippet
```java
     * Calls localRemoveAll on the CompositeCache.
     * <p>
     * @param cacheName
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteCacheListener.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteCacheListener.java`
#### Snippet
```java
     * <p>
     * @return The remoteType value
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteCacheListener.java`
#### Snippet
```java
     * <p>
     * @return String
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheListener.java`
#### Snippet
```java
     * Deregister itself.
     * <p>
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cattr` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheFactory.java`
#### Snippet
```java
     * Host and Port uniquely identify a manager instance.
     * <p>
     * @param cattr
     *
     * @return The instance value or null if no such manager exists
```

### JavadocDeclaration
`@param iaca` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheFactory.java`
#### Snippet
```java
     * tell the manager for the failover to deregister the listener.
     * <p>
     * @param iaca
     * @param cacheMgr
     * @param cacheEventLogger
```

### JavadocDeclaration
`@param cacheMgr` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheFactory.java`
#### Snippet
```java
     * <p>
     * @param iaca
     * @param cacheMgr
     * @param cacheEventLogger
     * @param elementSerializer
```

### JavadocDeclaration
`@param cacheEventLogger` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheFactory.java`
#### Snippet
```java
     * @param iaca
     * @param cacheMgr
     * @param cacheEventLogger
     * @param elementSerializer
     * @return AuxiliaryCache
```

### JavadocDeclaration
`@param elementSerializer` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheFactory.java`
#### Snippet
```java
     * @param cacheMgr
     * @param cacheEventLogger
     * @param elementSerializer
     * @return AuxiliaryCache
     */
```

### JavadocDeclaration
`@param name` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheAttributes.java`
#### Snippet
```java

    /**
     * @param name
     */
    @Override
```

### JavadocDeclaration
`@param receive` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheAttributes.java`
#### Snippet
```java
     * removes from the remote server.
     * <p>
     * @param receive
     */
    @Override
```

### JavadocDeclaration
`@param millis` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheAttributes.java`
#### Snippet
```java

    /**
     * @param millis
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/AbstractHttpClient.java`
#### Snippet
```java
     * @param httpState result of execution
     *
     * @throws IOException
     */
    protected abstract void postProcessWebserviceCall( HttpUriRequest request, HttpResponse httpState )
```

### JavadocDeclaration
`@param remoteHttpCacheAttributes` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/AbstractHttpClient.java`
#### Snippet
```java
     * manager.
     * <p>
     * @param remoteHttpCacheAttributes
     */
    public AbstractHttpClient( final RemoteHttpCacheAttributes remoteHttpCacheAttributes )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/AbstractHttpClient.java`
#### Snippet
```java
     * @param requestBuilder http method request builder
     *
     * @throws IOException
     */
    protected abstract void preProcessWebserviceCall( RequestBuilder requestBuilder )
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskCache.java`
#### Snippet
```java
     * implementation always result in a disk orphan.
     * <p>
     * @param key
     * @return true if removed anything
     * @see org.apache.commons.jcs3.auxiliary.disk.AbstractDiskCache#remove(Object)
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskCache.java`
#### Snippet
```java
     * <p>
     *
     * @param key
     * @return true if an element was removed
     */
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskCache.java`
#### Snippet
```java
     * Gets matching items from the cache.
     * <p>
     * @param pattern
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache matching keys
```

### JavadocDeclaration
`@param element` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskCache.java`
#### Snippet
```java
     * lock.</li>
     * </ol>
     * @param element
     * @see org.apache.commons.jcs3.auxiliary.disk.AbstractDiskCache#update(ICacheElement)
     */
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskCache.java`
#### Snippet
```java
     * <p>
     *
     * @param key
     * @return true if there was a match
     */
```

### JavadocDeclaration
`@param blocksToFree` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskCache.java`
#### Snippet
```java
     * Add these blocks to the emptyBlock list.
     * <p>
     * @param blocksToFree
     */
    protected void freeBlocks( final int[] blocksToFree )
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskCache.java`
#### Snippet
```java
     * blocks..</li> <li>Release the lock.</li>
     * </ol>
     * @param key
     * @return ICacheElement
     * @see org.apache.commons.jcs3.auxiliary.disk.AbstractDiskCache#get(Object)
```

### JavadocDeclaration
`@param cacheAttributes` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskCache.java`
#### Snippet
```java
     * Constructs the BlockDisk after setting up the root directory.
     * <p>
     * @param cacheAttributes
     */
    public BlockDiskCache( final BlockDiskCacheAttributes cacheAttributes )
```

### JavadocDeclaration
`@param cacheAttributes` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskCache.java`
#### Snippet
```java
     * Constructs the BlockDisk after setting up the root directory.
     * <p>
     * @param cacheAttributes
     * @param elementSerializer used if supplied, the super's super will not set a null
     */
```

### JavadocDeclaration
`@param remoteCache` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheMonitor.java`
#### Snippet
```java
     * Notifies the cache monitor that an error occurred, and kicks off the error recovery process.
     * <p>
     * @param remoteCache
     */
    public void notifyError( final RemoteHttpCache<?, ?> remoteCache )
```

### JavadocDeclaration
`@param iaca` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheFactory.java`
#### Snippet
```java
     * tell the manager for the failover to deregister the listener.
     * <p>
     * @param iaca
     * @param cacheMgr
     * @param cacheEventLogger
```

### JavadocDeclaration
`@param cacheMgr` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheFactory.java`
#### Snippet
```java
     * <p>
     * @param iaca
     * @param cacheMgr
     * @param cacheEventLogger
     * @param elementSerializer
```

### JavadocDeclaration
`@param cacheEventLogger` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheFactory.java`
#### Snippet
```java
     * @param iaca
     * @param cacheMgr
     * @param cacheEventLogger
     * @param elementSerializer
     * @return AuxiliaryCache
```

### JavadocDeclaration
`@param elementSerializer` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheFactory.java`
#### Snippet
```java
     * @param cacheMgr
     * @param cacheEventLogger
     * @param elementSerializer
     * @return AuxiliaryCache
     */
```

### JavadocDeclaration
`@param remoteHttpCacheAttributes` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheDispatcher.java`
#### Snippet
```java

    /**
     * @param remoteHttpCacheAttributes
     */
    public RemoteHttpCacheDispatcher( final RemoteHttpCacheAttributes remoteHttpCacheAttributes )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheDispatcher.java`
#### Snippet
```java
     * @param httpState result of execution
     *
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param remoteCacheRequest` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheDispatcher.java`
#### Snippet
```java
     * TODO consider taking in a URL instead of using the one in the configuration.
     * <p>
     * @param remoteCacheRequest
     * @return RemoteCacheResponse
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheDispatcher.java`
#### Snippet
```java
     * @param remoteCacheRequest
     * @return RemoteCacheResponse
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheDispatcher.java`
#### Snippet
```java
     * @return byte[] - the response
     *
     * @throws IOException
     * @throws HttpException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheDispatcher.java`
#### Snippet
```java
     *
     * @throws IOException
     * @throws HttpException
     */
    protected <K, V> byte[] processRequest( final byte[] requestAsByteArray,
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheDispatcher.java`
#### Snippet
```java
     * @param requestBuilder http method request builder
     *
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param attributes` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/behavior/IRemoteHttpCacheClient.java`
#### Snippet
```java
     * here is the place to do it.
     * <p>
     * @param attributes
     */
    void initialize( RemoteHttpCacheAttributes attributes );
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/behavior/IRemoteHttpCacheClient.java`
#### Snippet
```java
     * <p>
     * @return true if we make a successful alive request.
     * @throws IOException
     */
    boolean isAlive()
```

### JavadocDeclaration
`@param ex` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCache.java`
#### Snippet
```java
     * Nothing right now. This should setup a zombie and initiate recovery.
     * <p>
     * @param ex
     * @param msg
     * @param eventName
```

### JavadocDeclaration
`@param msg` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCache.java`
#### Snippet
```java
     * <p>
     * @param ex
     * @param msg
     * @param eventName
     * @throws IOException
```

### JavadocDeclaration
`@param eventName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCache.java`
#### Snippet
```java
     * @param ex
     * @param msg
     * @param eventName
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCache.java`
#### Snippet
```java
     * @param msg
     * @param eventName
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param remoteHttpCacheAttributes` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCache.java`
#### Snippet
```java
     * allows this object to know the listener id assigned by the remote cache.
     * <p>
     * @param remoteHttpCacheAttributes
     * @param remote
     * @param listener
```

### JavadocDeclaration
`@param remote` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCache.java`
#### Snippet
```java
     * <p>
     * @param remoteHttpCacheAttributes
     * @param remote
     * @param listener
     * @param monitor the cache monitor
```

### JavadocDeclaration
`@param listener` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCache.java`
#### Snippet
```java
     * @param remoteHttpCacheAttributes
     * @param remote
     * @param listener
     * @param monitor the cache monitor
     */
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteAuxiliaryCache.java`
#### Snippet
```java
     * This allows gets to timeout in case of remote server machine shutdown.
     * <p>
     * @param key
     * @return ICacheElement
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteAuxiliaryCache.java`
#### Snippet
```java
     * @param key
     * @return ICacheElement
     * @throws IOException
     */
    public ICacheElement<K, V> getUsingPool( final K key )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteAuxiliaryCache.java`
#### Snippet
```java
     * zombie.
     * <p>
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteAuxiliaryCache.java`
#### Snippet
```java
     * Calls get matching on the server. Each entry in the result is unwrapped.
     * <p>
     * @param pattern
     * @return Map
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteAuxiliaryCache.java`
#### Snippet
```java
     * @param pattern
     * @return Map
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cattr` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteAuxiliaryCache.java`
#### Snippet
```java
     * Creates the base.
     * <p>
     * @param cattr
     * @param remote
     * @param listener
```

### JavadocDeclaration
`@param remote` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteAuxiliaryCache.java`
#### Snippet
```java
     * <p>
     * @param cattr
     * @param remote
     * @param listener
     */
```

### JavadocDeclaration
`@param listener` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteAuxiliaryCache.java`
#### Snippet
```java
     * @param cattr
     * @param remote
     * @param listener
     */
    public AbstractRemoteAuxiliaryCache( final IRemoteCacheAttributes cattr, final ICacheServiceNonLocal<K, V> remote,
```

### JavadocDeclaration
`@param ce` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteAuxiliaryCache.java`
#### Snippet
```java
     * without any knowledge of caches classes.
     * <p>
     * @param ce
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteAuxiliaryCache.java`
#### Snippet
```java
     * <p>
     * @param ce
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param ex` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteAuxiliaryCache.java`
#### Snippet
```java
     * Custom exception handling some children.  This should be used to initiate failover.
     * <p>
     * @param ex
     * @param msg
     * @param eventName
```

### JavadocDeclaration
`@param msg` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteAuxiliaryCache.java`
#### Snippet
```java
     * <p>
     * @param ex
     * @param msg
     * @param eventName
     * @throws IOException
```

### JavadocDeclaration
`@param eventName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteAuxiliaryCache.java`
#### Snippet
```java
     * @param ex
     * @param msg
     * @param eventName
     * @throws IOException
     */
```

### JavadocDeclaration
`@param port` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteUtils.java`
#### Snippet
```java
     * <p>
     *
     * @param port
     * @return the registry
     */
```

### JavadocDeclaration
`@param propFile` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteUtils.java`
#### Snippet
```java
     * <p>
     *
     * @param propFile
     * @return The properties object for the file, never null
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteAuxiliaryCache.java`
#### Snippet
```java
     * @param msg
     * @param eventName
     * @throws IOException
     */
    protected abstract void handleException( Exception ex, String msg, String eventName )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteAuxiliaryCache.java`
#### Snippet
```java
     * Synchronously dispose the remote cache; if failed, replace the remote handle with a zombie.
     * <p>
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteUtils.java`
#### Snippet
```java
     * @param propFile
     * @return The properties object for the file, never null
     * @throws IOException
     */
    public static Properties loadProps(final String propFile)
```

### JavadocDeclaration
`@param timeoutMillis` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteUtils.java`
#### Snippet
```java
     * <p>
     *
     * @param timeoutMillis
     */
    public static void configureGlobalCustomSocketFactory(final int timeoutMillis)
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteAuxiliaryCache.java`
#### Snippet
```java
     * zombie.
     * <p>
     * @param key
     * @return boolean, whether or not the item was removed
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteAuxiliaryCache.java`
#### Snippet
```java
     * @param key
     * @return boolean, whether or not the item was removed
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteAuxiliaryCache.java`
#### Snippet
```java
     * other remote servers.
     * <p>
     * @param key
     * @return ICacheElement, a wrapper around the key, value, and attributes
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteAuxiliaryCache.java`
#### Snippet
```java
     * @param key
     * @return ICacheElement, a wrapper around the key, value, and attributes
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteCacheNoWaitFacade.java`
#### Snippet
```java
     * Synchronously read from the remote cache.
     * <p>
     * @param pattern
     * @return map
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteCacheNoWaitFacade.java`
#### Snippet
```java
     * @param pattern
     * @return map
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param keys` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteCacheNoWaitFacade.java`
#### Snippet
```java
     * Gets multiple items from the cache based on the given set of keys.
     * <p>
     * @param keys
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
```

### JavadocDeclaration
`@param ce` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteCacheNoWaitFacade.java`
#### Snippet
```java
     * Put an element in the cache.
     * <p>
     * @param ce
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteCacheNoWaitFacade.java`
#### Snippet
```java
     * <p>
     * @param ce
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteCacheNoWaitFacade.java`
#### Snippet
```java
     * Adds a remove request to the remote cache.
     * <p>
     * @param key
     * @return whether or not it was removed, right now it return false.
     */
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteCacheNoWaitFacade.java`
#### Snippet
```java
     * Synchronously reads from the remote cache.
     * <p>
     * @param key
     * @return Either an ICacheElement&lt;K, V&gt; or null if it is not found.
     */
```

### JavadocDeclaration
`@param noWaits` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteCacheNoWaitFacade.java`
#### Snippet
```java
     * Constructs with the given remote cache, and fires events to any listeners.
     * <p>
     * @param noWaits
     * @param rca
     * @param cacheEventLogger
```

### JavadocDeclaration
`@param rca` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteCacheNoWaitFacade.java`
#### Snippet
```java
     * <p>
     * @param noWaits
     * @param rca
     * @param cacheEventLogger
     * @param elementSerializer
```

### JavadocDeclaration
`@param cacheEventLogger` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteCacheNoWaitFacade.java`
#### Snippet
```java
     * @param noWaits
     * @param rca
     * @param cacheEventLogger
     * @param elementSerializer
     */
```

### JavadocDeclaration
`@param elementSerializer` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteCacheNoWaitFacade.java`
#### Snippet
```java
     * @param rca
     * @param cacheEventLogger
     * @param elementSerializer
     */
    public AbstractRemoteCacheNoWaitFacade( final List<RemoteCacheNoWait<K,V>> noWaits, final IRemoteCacheAttributes rca,
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheService.java`
#### Snippet
```java
     * This is called by the event log.
     * <p>
     * @param requesterId
     * @return requesterId + ""
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheService.java`
#### Snippet
```java
     * This general method should be deprecated.
     * <p>
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheService.java`
#### Snippet
```java
     * Processes a shutdown request.
     * <p>
     * @param cacheName
     * @param requesterId
     * @throws IOException
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param requesterId
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheService.java`
#### Snippet
```java
     * @param cacheName
     * @param requesterId
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheService.java`
#### Snippet
```java
     * origination.
     * <p>
     * @param cacheName
     * @param requesterId
     * @throws IOException
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param requesterId
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheService.java`
#### Snippet
```java
     * @param cacheName
     * @param requesterId
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param item` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheService.java`
#### Snippet
```java
     * origination.
     * <p>
     * @param item
     * @param requesterId
     * @throws IOException
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheService.java`
#### Snippet
```java
     * <p>
     * @param item
     * @param requesterId
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheService.java`
#### Snippet
```java
     * @param item
     * @param requesterId
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheManager` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheService.java`
#### Snippet
```java
     * Create a process with a cache manager.
     * <p>
     * @param cacheManager
     * @param remoteHttpCacheServerAttributes
     * @param cacheEventLogger
```

### JavadocDeclaration
`@param remoteHttpCacheServerAttributes` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheManager
     * @param remoteHttpCacheServerAttributes
     * @param cacheEventLogger
     */
```

### JavadocDeclaration
`@param cacheEventLogger` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheService.java`
#### Snippet
```java
     * @param cacheManager
     * @param remoteHttpCacheServerAttributes
     * @param cacheEventLogger
     */
    public RemoteHttpCacheService( final ICompositeCacheManager cacheManager,
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheService.java`
#### Snippet
```java
     * origination.
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
     * @throws IOException
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheService.java`
#### Snippet
```java
     * @param cacheName
     * @param key
     * @param requesterId
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheService.java`
#### Snippet
```java
     * @param key
     * @param requesterId
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheService.java`
#### Snippet
```java
     * If isAllowClusterGet is enabled we will treat this as a normal request or non-remote origins.
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
     * @return ICacheElement
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheService.java`
#### Snippet
```java
     * @param cacheName
     * @param key
     * @param requesterId
     * @return ICacheElement
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheService.java`
#### Snippet
```java
     * @param requesterId
     * @return ICacheElement
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheService.java`
#### Snippet
```java
     * origination.
     * <p>
     * @param cacheName
     * @param pattern
     * @param requesterId
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param pattern
     * @param requesterId
     * @return Map
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheService.java`
#### Snippet
```java
     * @param cacheName
     * @param pattern
     * @param requesterId
     * @return Map
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheService.java`
#### Snippet
```java
     * @param requesterId
     * @return Map
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheService.java`
#### Snippet
```java
     * origination.
     * <p>
     * @param cacheName
     * @param keys
     * @param requesterId
```

### JavadocDeclaration
`@param keys` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param keys
     * @param requesterId
     * @return Map
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheService.java`
#### Snippet
```java
     * @param cacheName
     * @param keys
     * @param requesterId
     * @return Map
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheService.java`
#### Snippet
```java
     * @param requesterId
     * @return Map
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/util/RemoteCacheRequestFactory.java`
#### Snippet
```java
     * Creates a removeAll Request.
     * <p>
     * @param cacheName
     * @param requesterId
     * @return RemoteHttpCacheRequest
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/util/RemoteCacheRequestFactory.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param requesterId
     * @return RemoteHttpCacheRequest
     */
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/util/RemoteCacheRequestFactory.java`
#### Snippet
```java
     * Creates an alive check Request.
     * <p>
     * @param requesterId
     * @return RemoteHttpCacheRequest
     */
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/util/RemoteCacheRequestFactory.java`
#### Snippet
```java
     * Creates a get Request.
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/util/RemoteCacheRequestFactory.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
     * @return RemoteHttpCacheRequest
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/util/RemoteCacheRequestFactory.java`
#### Snippet
```java
     * @param cacheName
     * @param key
     * @param requesterId
     * @return RemoteHttpCacheRequest
     */
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/util/RemoteCacheRequestFactory.java`
#### Snippet
```java
     * Creates a remove Request.
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/util/RemoteCacheRequestFactory.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
     * @return RemoteHttpCacheRequest
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/util/RemoteCacheRequestFactory.java`
#### Snippet
```java
     * @param cacheName
     * @param key
     * @param requesterId
     * @return RemoteHttpCacheRequest
     */
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/util/RemoteCacheRequestFactory.java`
#### Snippet
```java
     * Creates a dispose Request.
     * <p>
     * @param cacheName
     * @param requesterId
     * @return RemoteHttpCacheRequest
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/util/RemoteCacheRequestFactory.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param requesterId
     * @return RemoteHttpCacheRequest
     */
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/util/RemoteCacheRequestFactory.java`
#### Snippet
```java
     * Creates a getMultiple Request.
     * <p>
     * @param cacheName
     * @param keys
     * @param requesterId
```

### JavadocDeclaration
`@param keys` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/util/RemoteCacheRequestFactory.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param keys
     * @param requesterId
     * @return RemoteHttpCacheRequest
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/util/RemoteCacheRequestFactory.java`
#### Snippet
```java
     * @param cacheName
     * @param keys
     * @param requesterId
     * @return RemoteHttpCacheRequest
     */
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/util/RemoteCacheRequestFactory.java`
#### Snippet
```java
     * Creates a getMatching Request.
     * <p>
     * @param cacheName
     * @param pattern
     * @param requesterId
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/util/RemoteCacheRequestFactory.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param pattern
     * @param requesterId
     * @return RemoteHttpCacheRequest
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/util/RemoteCacheRequestFactory.java`
#### Snippet
```java
     * @param cacheName
     * @param pattern
     * @param requesterId
     * @return RemoteHttpCacheRequest
     */
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/util/RemoteCacheRequestFactory.java`
#### Snippet
```java
     * Creates a GetKeySet Request.
     * <p>
     * @param cacheName
     * @param requesterId
     * @return RemoteHttpCacheRequest
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/util/RemoteCacheRequestFactory.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param requesterId
     * @return RemoteHttpCacheRequest
     */
```

### JavadocDeclaration
`@param cacheElement` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/util/RemoteCacheRequestFactory.java`
#### Snippet
```java
     * Creates an Update Request.
     * <p>
     * @param cacheElement
     * @param requesterId
     * @return RemoteHttpCacheRequest
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/util/RemoteCacheRequestFactory.java`
#### Snippet
```java
     * <p>
     * @param cacheElement
     * @param requesterId
     * @return RemoteHttpCacheRequest
     */
```

### JavadocDeclaration
`@param port` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/TimeoutConfigurableRMISocketFactory.java`
#### Snippet
```java

    /**
     * @param port
     * @return ServerSocket
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/TimeoutConfigurableRMISocketFactory.java`
#### Snippet
```java
     * @param port
     * @return ServerSocket
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param host` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/TimeoutConfigurableRMISocketFactory.java`
#### Snippet
```java

    /**
     * @param host
     * @param port
     * @return Socket
```

### JavadocDeclaration
`@param port` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/TimeoutConfigurableRMISocketFactory.java`
#### Snippet
```java
    /**
     * @param host
     * @param port
     * @return Socket
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/TimeoutConfigurableRMISocketFactory.java`
#### Snippet
```java
     * @param port
     * @return Socket
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheEventLogger` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RegistryKeepAliveRunner.java`
#### Snippet
```java
     * Allows it to be injected.
     * <p>
     * @param cacheEventLogger
     */
    public void setCacheEventLogger( final ICacheEventLogger cacheEventLogger )
```

### JavadocDeclaration
`@param serviceName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RegistryKeepAliveRunner.java`
#### Snippet
```java
     * @param registryHost - Hostname of the registry
     * @param registryPort - the port on which to start the registry
     * @param serviceName
     */
    public RegistryKeepAliveRunner( final String registryHost, final int registryPort, final String serviceName )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * Gets the set of keys of objects currently in the cache.
     * <p>
     * @param cacheName
     * @return Set
     */
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * Gets multiple items from the cache based on the given set of keys.
     * <p>
     * @param cacheName
     * @param keys
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
```

### JavadocDeclaration
`@param keys` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param keys
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param item` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * Logs an event if an event logger is configured.
     * <p>
     * @param item
     * @param requesterId
     * @param eventName
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * <p>
     * @param item
     * @param requesterId
     * @param eventName
     * @return ICacheEvent
```

### JavadocDeclaration
`@param eventName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * @param item
     * @param requesterId
     * @param eventName
     * @return ICacheEvent
     */
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * Gets all matching items.
     * <p>
     * @param cacheName
     * @param pattern
     * @return Map of keys and wrapped objects
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param pattern
     * @return Map of keys and wrapped objects
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * @param pattern
     * @return Map of keys and wrapped objects
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * Frees the specified remote cache.
     * <p>
     * @param cacheName
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * The internal processing is wrapped in event logging calls.
     * <p>
     * @param cacheName
     * @param keys
     * @param requesterId
```

### JavadocDeclaration
`@param keys` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param keys
     * @param requesterId
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * @param cacheName
     * @param keys
     * @param requesterId
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheEvent` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * Logs an event if an event logger is configured.
     * <p>
     * @param cacheEvent
     */
    protected <T> void logICacheEvent( final ICacheEvent<T> cacheEvent )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * Removes the given key from the specified remote cache. Defaults the listener id to 0.
     * <p>
     * @param cacheName
     * @param key
     * @throws IOException
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * @param cacheName
     * @param key
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * Remove all keys from the specified remote cache.
     * <p>
     * @param cacheName
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * The internal processing is wrapped in event logging calls.
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
     * @return ICacheElement
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * @param cacheName
     * @param key
     * @param requesterId
     * @return ICacheElement
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * @param requesterId
     * @return ICacheElement
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param source` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * Logs an event if an event logger is configured.
     * <p>
     * @param source
     * @param eventName
     * @param optionalDetails
```

### JavadocDeclaration
`@param eventName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * <p>
     * @param source
     * @param eventName
     * @param optionalDetails
     */
```

### JavadocDeclaration
`@param optionalDetails` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * @param source
     * @param eventName
     * @param optionalDetails
     */
    protected void logApplicationEvent( final String source, final String eventName, final String optionalDetails )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * <p>
     * @return The stats value
     * @throws IOException
     */
    public String getStats()
```

### JavadocDeclaration
`@param item` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * Log some details.
     * <p>
     * @param item
     */
    private void logUpdateInfo( final ICacheElement<K, V> item )
```

### JavadocDeclaration
`@param item` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * The internal processing is wrapped in event logging calls.
     * <p>
     * @param item
     * @param requesterId
     * @throws IOException
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * <p>
     * @param item
     * @param requesterId
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * @param item
     * @param requesterId
     * @throws IOException
     */
    abstract void processUpdate( ICacheElement<K, V> item, long requesterId )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * Adding the requestor id, allows the cache to determine the source of the get.
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
     * @return ICacheElement
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * @param cacheName
     * @param key
     * @param requesterId
     * @return ICacheElement
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * @param requesterId
     * @return ICacheElement
     * @throws IOException
     */
    abstract ICacheElement<K, V> processGet( String cacheName, K key, long requesterId )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * The internal processing is wrapped in event logging calls.
     * <p>
     * @param cacheName
     * @param requesterId
     * @throws IOException
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param requesterId
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * @param cacheName
     * @param requesterId
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * Retrieves all matching keys.
     * <p>
     * @param cacheName
     * @param pattern
     * @param requesterId
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param pattern
     * @param requesterId
     * @return Map of keys and wrapped objects
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * @param cacheName
     * @param pattern
     * @param requesterId
     * @return Map of keys and wrapped objects
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * @param requesterId
     * @return Map of keys and wrapped objects
     * @throws IOException
     */
    abstract Map<K, ICacheElement<K, V>> processGetMatching( String cacheName, String pattern, long requesterId )
```

### JavadocDeclaration
`@param item` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java

    /**
     * @param item
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
    /**
     * @param item
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * Remove the key from the cache region and don't tell the source listener about it.
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
     * @throws IOException
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * @param cacheName
     * @param key
     * @param requesterId
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * @param key
     * @param requesterId
     * @throws IOException
     */
    abstract void processRemove( String cacheName, K key, long requesterId )
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * Protected for testing.
     * <p>
     * @param requesterId
     * @return String
     */
```

### JavadocDeclaration
`@param cacheManager` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * Creates the super with the needed items.
     * <p>
     * @param cacheManager
     * @param cacheEventLogger
     */
```

### JavadocDeclaration
`@param cacheEventLogger` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheManager
     * @param cacheEventLogger
     */
    public AbstractRemoteCacheService( final ICompositeCacheManager cacheManager, final ICacheEventLogger cacheEventLogger )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * exist.
     * <p>
     * @param cacheName
     * @param key
     * @return ICacheElement
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @return ICacheElement
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * @param key
     * @return ICacheElement
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java

    /**
     * @param cacheName
     * @param requesterId
     * @throws IOException
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
    /**
     * @param cacheName
     * @param requesterId
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * @param cacheName
     * @param requesterId
     * @throws IOException
     */
    abstract void processDispose( String cacheName, long requesterId )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * Logs an event if an event logger is configured.
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
     * @param eventName
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * @param cacheName
     * @param key
     * @param requesterId
     * @param eventName
     * @return ICacheEvent
```

### JavadocDeclaration
`@param eventName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * @param key
     * @param requesterId
     * @param eventName
     * @return ICacheEvent
     */
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * Gets multiple items from the cache based on the given set of keys.
     * <p>
     * @param cacheName
     * @param keys
     * @param requesterId
```

### JavadocDeclaration
`@param keys` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param keys
     * @param requesterId
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * @param cacheName
     * @param keys
     * @param requesterId
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
     * @throws IOException
     */
    abstract Map<K, ICacheElement<K, V>> processGetMultiple( String cacheName, Set<K> keys, long requesterId )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * Frees the specified remote cache.
     * <p>
     * @param cacheName
     * @param requesterId
     * @throws IOException
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param requesterId
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * @param cacheName
     * @param requesterId
     * @throws IOException
     */
    public void dispose( final String cacheName, final long requesterId )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * The internal processing is wrapped in event logging calls.
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
     * @throws IOException
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * @param cacheName
     * @param key
     * @param requesterId
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * @param key
     * @param requesterId
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * Retrieves all matching keys.
     * <p>
     * @param cacheName
     * @param pattern
     * @param requesterId
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param pattern
     * @param requesterId
     * @return Map of keys and wrapped objects
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * @param cacheName
     * @param pattern
     * @param requesterId
     * @return Map of keys and wrapped objects
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * @param requesterId
     * @return Map of keys and wrapped objects
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param item` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * The internal processing is wrapped in event logging calls.
     * <p>
     * @param item
     * @param requesterId
     * @throws IOException
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * <p>
     * @param item
     * @param requesterId
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * @param item
     * @param requesterId
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheEventLogger` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * Allows it to be injected.
     * <p>
     * @param cacheEventLogger
     */
    public void setCacheEventLogger( final ICacheEventLogger cacheEventLogger )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * Remove all keys from the specified remote cache.
     * <p>
     * @param cacheName
     * @param requesterId
     * @throws IOException
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param requesterId
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
     * @param cacheName
     * @param requesterId
     * @throws IOException
     */
    abstract void processRemoveAll( String cacheName, long requesterId )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * <p>
     * @return true if we make a successful alive request.
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * Gets multiple items from the cache matching the pattern.
     * <p>
     * @param cacheName
     * @param pattern
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param pattern
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache matching the pattern.
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache matching the pattern.
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * Gets multiple items from the cache based on the given set of keys.
     * <p>
     * @param cacheName
     * @param keys
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
```

### JavadocDeclaration
`@param keys` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param keys
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param item` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * Puts a cache item to the cache.
     * <p>
     * @param item
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * <p>
     * @param item
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * Removes the given key from the specified cache.
     * <p>
     * @param cacheName
     * @param key
     * @throws IOException
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * @param cacheName
     * @param key
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * Remove all keys from the specified cache.
     * <p>
     * @param cacheName
     * @param requesterId
     * @throws IOException
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param requesterId
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * @param cacheName
     * @param requesterId
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * Remove all keys from the specified cache.
     * <p>
     * @param cacheName
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * Frees the specified cache.
     * <p>
     * @param cacheName
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * Removes the given key from the specified cache.
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
     * @throws IOException
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * @param cacheName
     * @param key
     * @param requesterId
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * @param key
     * @param requesterId
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * Frees the specified cache.
     * <p>
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * Create a request, process, extract the payload.
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
     * @return ICacheElement
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * @param cacheName
     * @param key
     * @param requesterId
     * @return ICacheElement
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * @param requesterId
     * @return ICacheElement
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * Create a request, process, extract the payload.
     * <p>
     * @param cacheName
     * @param key
     * @return ICacheElement
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @return ICacheElement
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * @param key
     * @return ICacheElement
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * Gets multiple items from the cache matching the pattern.
     * <p>
     * @param cacheName
     * @param pattern
     * @param requesterId
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param pattern
     * @param requesterId
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * @param cacheName
     * @param pattern
     * @param requesterId
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache matching the pattern.
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache matching the pattern.
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheElement` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * Puts a cache item to the cache.
     * <p>
     * @param cacheElement
     * @param requesterId
     * @throws IOException
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * <p>
     * @param cacheElement
     * @param requesterId
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * @param cacheElement
     * @param requesterId
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * Gets multiple items from the cache based on the given set of keys.
     * <p>
     * @param cacheName
     * @param keys
     * @param requesterId
```

### JavadocDeclaration
`@param keys` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param keys
     * @param requesterId
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * @param cacheName
     * @param keys
     * @param requesterId
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param attributes` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * here is the place to do it.
     * <p>
     * @param attributes
     */
    @Override
```

### JavadocDeclaration
`@param attributes` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheClient.java`
#### Snippet
```java
     * Constructs a client.
     * <p>
     * @param attributes
     */
    public RemoteHttpCacheClient( final RemoteHttpCacheAttributes attributes )
```

### JavadocDeclaration
`@param remoteCacheRequest` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/behavior/IRemoteCacheDispatcher.java`
#### Snippet
```java
     * remotely.
     * <p>
     * @param remoteCacheRequest
     * @return RemoteCacheResponse
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/behavior/IRemoteCacheDispatcher.java`
#### Snippet
```java
     * @param remoteCacheRequest
     * @return RemoteCacheResponse
     * @throws IOException
     */
    <K, V, T>
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/behavior/IRemoteCacheListener.java`
#### Snippet
```java
     * <p>
     * @return the local host address.
     * @throws IOException
     */
    String getLocalHostAddress()
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/behavior/IRemoteCacheListener.java`
#### Snippet
```java
     * <p>
     * @return The remoteType value
     * @throws IOException
     */
    RemoteType getRemoteType()
```

### JavadocDeclaration
`@param id` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/behavior/IRemoteCacheListener.java`
#### Snippet
```java
     * The value will be set by the server through the remote cache listener.
     * <p>
     * @param id
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/behavior/IRemoteCacheListener.java`
#### Snippet
```java
     * <p>
     * @param id
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/behavior/IRemoteCacheListener.java`
#### Snippet
```java
     * <p>
     * @return long
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/behavior/IRemoteCacheListener.java`
#### Snippet
```java
     * Deregistered itself.
     * <p>
     * @throws IOException
     */
    void dispose()
```

### JavadocDeclaration
`@param millis` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/behavior/IRemoteCacheAttributes.java`
#### Snippet
```java
     * used. If the timeout is greater than 0 a threadpool will be used for get requests.
     * <p>
     * @param millis
     */
    void setGetTimeoutMillis( int millis );
```

### JavadocDeclaration
`@param name` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/behavior/IRemoteCacheAttributes.java`
#### Snippet
```java
     * Set the name of the pool to use. Pools should be defined in the cache.ccf.
     * <p>
     * @param name
     */
    void setThreadPoolName( String name );
```

### JavadocDeclaration
`@param receive` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/behavior/IRemoteCacheAttributes.java`
#### Snippet
```java
     * removes from the remote server.
     * <p>
     * @param receive
     */
    void setReceive( boolean receive );
```

### JavadocDeclaration
`@param rmiSocketFactoryTimeoutMillis` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/behavior/ICommonRemoteCacheAttributes.java`
#### Snippet
```java
     * block forever.
     * <p>
     * @param rmiSocketFactoryTimeoutMillis
     */
    void setRmiSocketFactoryTimeoutMillis( int rmiSocketFactoryTimeoutMillis );
```

### JavadocDeclaration
`@param portS` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheStartupServlet.java`
#### Snippet
```java
     * value is used
     *
     * @param portS
     */
    private void setRegistryPort(final String portS)
```

### JavadocDeclaration
`@param request` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheStartupServlet.java`
#### Snippet
```java
     * <p>
     *
     * @param request
     * @param response
     * @throws ServletException
```

### JavadocDeclaration
`@param response` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheStartupServlet.java`
#### Snippet
```java
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheStartupServlet.java`
#### Snippet
```java
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheStartupServlet.java`
#### Snippet
```java
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheStartupServlet.java`
#### Snippet
```java
     * <p>
     *
     * @throws ServletException
     */
    @Override
```

### JavadocDeclaration
`@param response` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheServlet.java`
#### Snippet
```java
     * Write the response to the output stream.
     * <p>
     * @param response
     * @param cacheResponse
     */
```

### JavadocDeclaration
`@param cacheResponse` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheServlet.java`
#### Snippet
```java
     * <p>
     * @param response
     * @param cacheResponse
     */
    protected void writeResponse( final HttpServletResponse response, final RemoteCacheResponse<Object> cacheResponse )
```

### JavadocDeclaration
`@param prop` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheServlet.java`
#### Snippet
```java
     * jcs.remotehttpcache.serverattributes.ATTRIBUTENAME=ATTRIBUTEVALUE
     * <p>
     * @param prop
     * @return RemoteCacheServerAttributesconfigureRemoteCacheServerAttributes
     */
```

### JavadocDeclaration
`@param request` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheServlet.java`
#### Snippet
```java
     * Read the request, call the processor, write the response.
     * <p>
     * @param request
     * @param response
     * @throws ServletException
```

### JavadocDeclaration
`@param response` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheServlet.java`
#### Snippet
```java
     * <p>
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheServlet.java`
#### Snippet
```java
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheServlet.java`
#### Snippet
```java
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param request` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheServlet.java`
#### Snippet
```java
     * Processes the request. It will call the appropriate method on the service
     * <p>
     * @param request
     * @return RemoteHttpCacheResponse, never null
     */
```

### JavadocDeclaration
`@param config` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheServlet.java`
#### Snippet
```java
     * This provides an easy extension point. Simply extend this servlet and override the init
     * method to change the way the properties are loaded.
     * @param config
     * @throws ServletException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheServlet.java`
#### Snippet
```java
     * method to change the way the properties are loaded.
     * @param config
     * @throws ServletException
     */
    @Override
```

### JavadocDeclaration
`@param props` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheServlet.java`
#### Snippet
```java
     * Tries to get the event logger.
     * <p>
     * @param props
     * @return ICacheEventLogger
     */
```

### JavadocDeclaration
`@param request` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheServlet.java`
#### Snippet
```java
     * Read the request from the input stream.
     * <p>
     * @param request
     * @return RemoteHttpCacheRequest
     */
```

### JavadocDeclaration
`@param cacheManager` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheServlet.java`
#### Snippet
```java
     * Configures the attributes and the event logger and constructs a service.
     * <p>
     * @param cacheManager
     * @return RemoteHttpCacheService
     */
```

### JavadocDeclaration
`@param inputStream` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheServlet.java`
#### Snippet
```java
     * Reads the response from the stream and then closes it.
     * <p>
     * @param inputStream
     * @return RemoteHttpCacheRequest
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheServlet.java`
#### Snippet
```java
     * @param inputStream
     * @return RemoteHttpCacheRequest
     * @throws IOException
     * @throws ClassNotFoundException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheServlet.java`
#### Snippet
```java
     * @return RemoteHttpCacheRequest
     * @throws IOException
     * @throws ClassNotFoundException
     */
    protected RemoteCacheRequest<Serializable, Serializable> readRequestFromStream( final InputStream inputStream )
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java
         * <p>
         *
         * @param key
         * @param value
         */
```

### JavadocDeclaration
`@param value` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java
         *
         * @param key
         * @param value
         */
        @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java
     *
     * @return the length of the data file.
     * @throws IOException
     */
    protected long getDataFileSize() throws IOException
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java
         * <p>
         *
         * @param key
         * @param value
         */
```

### JavadocDeclaration
`@param value` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java
         *
         * @param key
         * @param value
         */
        @Override
```

### JavadocDeclaration
`@param host` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServerFactory.java`
#### Snippet
```java
     * Unbinds the remote server.
     * <p>
     * @param host
     * @param port
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java
     * <p>
     *
     * @throws IOException
     */
    private void initializeStoreFromPersistedData() throws IOException
```

### JavadocDeclaration
`@param port` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServerFactory.java`
#### Snippet
```java
     * <p>
     * @param host
     * @param port
     * @throws IOException
     */
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java
     * <p>
     *
     * @param pattern
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache matching keys
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServerFactory.java`
#### Snippet
```java
     * @param host
     * @param port
     * @throws IOException
     */
    static void shutdownImpl( final String host, final int port )
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java
     * <p>
     *
     * @param key
     * @return ICacheElement&lt;K, V&gt; or null
     * @see AbstractDiskCache#doGet
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServerFactory.java`
#### Snippet
```java
     * <p>
     * @param args The command line arguments
     * @throws Exception
     */
    public static void main( final String[] args )
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java
     * <p>
     *
     * @param key
     * @return true if an element was removed
     */
```

### JavadocDeclaration
`@param host` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServerFactory.java`
#### Snippet
```java
     * A remote cache is either a local cache or a cluster cache.
     * <p>
     * @param host
     * @param port
     * @param props
```

### JavadocDeclaration
`@param port` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServerFactory.java`
#### Snippet
```java
     * <p>
     * @param host
     * @param port
     * @param props
     * @throws IOException
```

### JavadocDeclaration
`@param sortedDescriptors` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java
     * <p>
     *
     * @param sortedDescriptors
     * @return false if there are overlaps.
     */
```

### JavadocDeclaration
`@param props` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServerFactory.java`
#### Snippet
```java
     * @param host
     * @param port
     * @param props
     * @throws IOException
     */
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java
     * <p>
     *
     * @param key
     * @return true if an item was removed.
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServerFactory.java`
#### Snippet
```java
     * @param port
     * @param props
     * @throws IOException
     */
    public static void startup( String host, final int port, final Properties props)
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java
     * <p>
     *
     * @param key
     * @return ICacheElement
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServerFactory.java`
#### Snippet
```java
     * @param serviceName the name of the service
     * @param server the server object to bind
     * @throws RemoteException
     */
    protected static void registerServer(final String serviceName, final Remote server )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java
     * @param key
     * @return ICacheElement
     * @throws IOException
     */
    private ICacheElement<K, V> readElement(final K key) throws IOException
```

### JavadocDeclaration
`@param props` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServerFactory.java`
#### Snippet
```java
     * object in the registry. This can be null.
     * <p>
     * @param props
     * @return RMISocketFactory
     */
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java
     * <p>
     *
     * @param key
     * @return true if there was a match
     */
```

### JavadocDeclaration
`@param prop` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServerFactory.java`
#### Snippet
```java
     * jcs.remotecache.serverattributes.ATTRIBUTENAME=ATTRIBUTEVALUE
     * <p>
     * @param prop
     * @return RemoteCacheServerAttributesconfigureRemoteCacheServerAttributes
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java
     * <p>
     *
     * @throws IOException
     */
    private void initializeEmptyStore() throws IOException
```

### JavadocDeclaration
`@param ded` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java
     * <p>
     *
     * @param ded
     * @param add
     */
```

### JavadocDeclaration
`@param add` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java
     *
     * @param ded
     * @param add
     */
    private void adjustBytesFree(final IndexedDiskElementDescriptor ded, final boolean add)
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java
     *
     * @return true if at least one item was removed.
     * @param key
     */
    @Override
```

### JavadocDeclaration
`@param cattr` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java
     * <p>
     *
     * @param cattr
     */
    private void initializeFileSystem(final IndexedDiskCacheAttributes cattr)
```

### JavadocDeclaration
`@param ded` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java
     * <p>
     *
     * @param ded
     */
    protected void addToRecycleBin(final IndexedDiskElementDescriptor ded)
```

### JavadocDeclaration
`@param maxKeySize` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java

        /**
         * @param maxKeySize
         */
        public LRUMapSizeLimited(final int maxKeySize)
```

### JavadocDeclaration
`@param cacheAttributes` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java
     * <p>
     *
     * @param cacheAttributes
     */
    public IndexedDiskCache(final IndexedDiskCacheAttributes cacheAttributes)
```

### JavadocDeclaration
`@param cattr` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java
     * <p>
     *
     * @param cattr
     * @param elementSerializer
     *            used if supplied, the super's super will not set a null
```

### JavadocDeclaration
`@param cattr` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java
     * <p>
     *
     * @param cattr
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java
     *
     * @param cattr
     * @throws IOException
     */
    private void initializeKeysAndData(final IndexedDiskCacheAttributes cattr) throws IOException
```

### JavadocDeclaration
`@param idlePeriod` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCacheMonitor.java`
#### Snippet
```java
     * Allows close classes, ie testers to set the idle period to something testable.
     * <p>
     * @param idlePeriod
     * 
     * @deprecated Use setIdlePeriod()
```

### JavadocDeclaration
`@param led` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPSender.java`
#### Snippet
```java
     * Sends commands to the lateral cache listener.
     * <p>
     * @param led
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPSender.java`
#### Snippet
```java
     * <p>
     * @param led
     * @throws IOException
     */
    public <K, V> void send( final LateralElementDescriptor<K, V> led )
```

### JavadocDeclaration
`@param host` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPSender.java`
#### Snippet
```java
     * Creates a connection to a TCP server.
     * <p>
     * @param host
     * @param port
     * @throws IOException
```

### JavadocDeclaration
`@param port` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPSender.java`
#### Snippet
```java
     * <p>
     * @param host
     * @param port
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPSender.java`
#### Snippet
```java
     * @param host
     * @param port
     * @throws IOException
     */
    protected void init( final String host, final int port )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPSender.java`
#### Snippet
```java
     * service will then call this method.
     * <p>
     * @throws IOException
     */
    public void dispose()
```

### JavadocDeclaration
`@param lca` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPSender.java`
#### Snippet
```java
     * Constructor for the LateralTCPSender object.
     * <p>
     * @param lca
     * @throws IOException
     * @deprecated Specify serializer
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPSender.java`
#### Snippet
```java
     * <p>
     * @param lca
     * @throws IOException
     * @deprecated Specify serializer
     */
```

### JavadocDeclaration
`@param led` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPSender.java`
#### Snippet
```java
     * laterals, then you have to make 10 failed gets to find out none of the caches have the item.
     * <p>
     * @param led
     * @return ICacheElement
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPSender.java`
#### Snippet
```java
     * @param led
     * @return ICacheElement
     * @throws IOException
     */
    public <K, V> Object sendAndReceive( final LateralElementDescriptor<K, V> led )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPSender.java`
#### Snippet
```java
     * @param lca the configuration object
     * @param serializer the serializer to use when sending
     * @throws IOException
     * @since 3.1
     */
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCacheNoWait.java`
#### Snippet
```java
     * Synchronously reads from the lateral cache.
     * <p>
     * @param pattern
     * @return ICacheElement&lt;K, V&gt; if found, else empty
     */
```

### JavadocDeclaration
`@param keys` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCacheNoWait.java`
#### Snippet
```java
     * Gets multiple items from the cache based on the given set of keys.
     * <p>
     * @param keys
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCacheNoWait.java`
#### Snippet
```java
     * Adds a remove request to the lateral cache.
     * <p>
     * @param key
     * @return always false
     */
```

### JavadocDeclaration
`@param ce` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCacheNoWait.java`
#### Snippet
```java

    /**
     * @param ce
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCacheNoWait.java`
#### Snippet
```java
    /**
     * @param ce
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param lateral` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCacheNoWait.java`
#### Snippet
```java
     * starting up a new instance.
     * <p>
     * @param lateral
     */
    public void fixCache( final ICacheServiceNonLocal<K, V> lateral )
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCacheNoWait.java`
#### Snippet
```java
     * Synchronously reads from the lateral cache.
     * <p>
     * @param key
     * @return ICacheElement&lt;K, V&gt; if found, else null
     */
```

### JavadocDeclaration
`@param cache` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCacheNoWait.java`
#### Snippet
```java
     * processing.
     * <p>
     * @param cache
     */
    public LateralCacheNoWait( final LateralCache<K, V> cache )
```

### JavadocDeclaration
`@param ce` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCache.java`
#### Snippet
```java
     * Update lateral.
     * <p>
     * @param ce
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCache.java`
#### Snippet
```java
     * <p>
     * @param ce
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param ex` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCache.java`
#### Snippet
```java
     * Not yet sure what to do here.
     * <p>
     * @param ex
     * @param msg
     * @throws IOException
```

### JavadocDeclaration
`@param msg` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCache.java`
#### Snippet
```java
     * <p>
     * @param ex
     * @param msg
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCache.java`
#### Snippet
```java
     * @param ex
     * @param msg
     * @throws IOException
     */
    private void handleException( final Exception ex, final String msg )
```

### JavadocDeclaration
`@param restoredLateral` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCache.java`
#### Snippet
```java
     * Replaces the current remote cache service handle with the given handle.
     * <p>
     * @param restoredLateral
     */
    public void fixCache( final ICacheServiceNonLocal<K, V> restoredLateral )
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCache.java`
#### Snippet
```java
     * zombie.
     * <p>
     * @param key
     * @return false always
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCache.java`
#### Snippet
```java
     * @param key
     * @return false always
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCache.java`
#### Snippet
```java
     * Synchronously dispose the cache. Not sure we want this.
     * <p>
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cattr` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCache.java`
#### Snippet
```java
     * Constructor for the LateralCache object
     * <p>
     * @param cattr
     *
     * @deprecated Causes NPE
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCache.java`
#### Snippet
```java

    /**
     * @param pattern
     * @return A map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCache.java`
#### Snippet
```java
     * @return A map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cattr` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCache.java`
#### Snippet
```java
     * Constructor for the LateralCache object
     * <p>
     * @param cattr
     * @param lateral
     * @param monitor
```

### JavadocDeclaration
`@param lateral` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCache.java`
#### Snippet
```java
     * <p>
     * @param cattr
     * @param lateral
     * @param monitor
     */
```

### JavadocDeclaration
`@param monitor` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCache.java`
#### Snippet
```java
     * @param cattr
     * @param lateral
     * @param monitor
     */
    public LateralCache( final ILateralCacheAttributes cattr, final ICacheServiceNonLocal<K, V> lateral, final LateralCacheMonitor monitor )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCache.java`
#### Snippet
```java
     * zombie.
     * <p>
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCache.java`
#### Snippet
```java
     * The performance costs are too great. It is not recommended that you enable lateral gets.
     * <p>
     * @param key
     * @return ICacheElement&lt;K, V&gt; or null
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCache.java`
#### Snippet
```java
     * @param key
     * @return ICacheElement&lt;K, V&gt; or null
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param issueRemoveOnPut` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/TCPLateralCacheAttributes.java`
#### Snippet
```java
     * objects.
     * <p>
     * @param issueRemoveOnPut
     */
    @Override
```

### JavadocDeclaration
`@param allowGet` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/TCPLateralCacheAttributes.java`
#### Snippet
```java
     * This replaces the old putOnlyMode
     * <p>
     * @param allowGet
     */
    @Override
```

### JavadocDeclaration
`@param filter` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/TCPLateralCacheAttributes.java`
#### Snippet
```java
     * the same type.
     * <p>
     * @param filter
     */
    @Override
```

### JavadocDeclaration
`@param allowPut` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/TCPLateralCacheAttributes.java`
#### Snippet
```java
     * Is the lateral allowed to put objects to other laterals.
     * <p>
     * @param allowPut
     */
    @Override
```

### JavadocDeclaration
`@param service` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPDiscoveryListener.java`
#### Snippet
```java
     * comes back.
     * <p>
     * @param service
     */
    @Override
```

### JavadocDeclaration
`@param facade` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPDiscoveryListener.java`
#### Snippet
```java
     * Remove the item from the no wait list.
     * <p>
     * @param facade
     * @param cacheName
     * @param tcpServer
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPDiscoveryListener.java`
#### Snippet
```java
     * <p>
     * @param facade
     * @param cacheName
     * @param tcpServer
     * @return true if we found the no wait and removed it. False if the no wait was not present.
```

### JavadocDeclaration
`@param tcpServer` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPDiscoveryListener.java`
#### Snippet
```java
     * @param facade
     * @param cacheName
     * @param tcpServer
     * @return true if we found the no wait and removed it. False if the no wait was not present.
     * @since 3.1
```

### JavadocDeclaration
`@param service` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPDiscoveryListener.java`
#### Snippet
```java
     * shouldn't happen with discovery.
     * <p>
     * @param service
     */
    @Override
```

### JavadocDeclaration
`@param noWait` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPDiscoveryListener.java`
#### Snippet
```java
     * use with the lateral cache. If it is present, remove the item from the no wait list.
     * <p>
     * @param noWait
     * @return true if we found the no wait and removed it. False if the no wait was not present.
     */
```

### JavadocDeclaration
`@param noWait` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPDiscoveryListener.java`
#### Snippet
```java
     * services.
     * <p>
     * @param noWait
     * @return true if we found the no wait and added it. False if the no wait was not present or if
     *         we already had it.
```

### JavadocDeclaration
`@param allowGet` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/behavior/ITCPLateralCacheAttributes.java`
#### Snippet
```java
     * This replaces the old putOnlyMode
     * <p>
     * @param allowGet
     */
    void setAllowGet( boolean allowGet );
```

### JavadocDeclaration
`@param allowPut` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/behavior/ITCPLateralCacheAttributes.java`
#### Snippet
```java
     * Is the lateral allowed to put objects to other laterals.
     * <p>
     * @param allowPut
     */
    void setAllowPut( boolean allowPut );
```

### JavadocDeclaration
`@param filter` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/behavior/ITCPLateralCacheAttributes.java`
#### Snippet
```java
     * objects of the same type.
     * <p>
     * @param filter
     */
    void setFilterRemoveByHashCode( boolean filter );
```

### JavadocDeclaration
`@param issueRemoveOnPut` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/behavior/ITCPLateralCacheAttributes.java`
#### Snippet
```java
     * to prevent the lateral from serializing objects.
     * <p>
     * @param issueRemoveOnPut
     */
    void setIssueRemoveOnPut( boolean issueRemoveOnPut );
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPCacheFactory.java`
#### Snippet
```java
     * @param cacheName The feature to be added to the LateralCacheListener attribute
     * @param listener The feature to be added to the LateralCacheListener attribute
     * @throws IOException
     */
    private <K, V> void addLateralCacheListener( final String cacheName, final ILateralCacheListener<K, V> listener )
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCacheNoWaitFacade.java`
#### Snippet
```java
     * Adds a remove request to the lateral cache.
     * <p>
     * @param key
     * @return always false.
     */
```

### JavadocDeclaration
`@param noWait` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCacheNoWaitFacade.java`
#### Snippet
```java
     * Removes a no wait from the list if it is already there.
     * <p>
     * @param noWait
     * @return true if it was already in the array
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCacheNoWaitFacade.java`
#### Snippet
```java
     * Update the cache element in all lateral caches
     * @param ce the cache element
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param noWait` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCacheNoWaitFacade.java`
#### Snippet
```java
     * Adds a no wait to the list if it isn't already in the list.
     * <p>
     * @param noWait
     * @return true if it wasn't already contained
     */
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCacheNoWaitFacade.java`
#### Snippet
```java
     * Merge them.
     * <p>
     * @param pattern
     * @return ICacheElement
     */
```

### JavadocDeclaration
`@param noWait` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCacheNoWaitFacade.java`
#### Snippet
```java
     * Tells you if the no wait is in the list or not.
     * <p>
     * @param noWait
     * @return true if the noWait is in the list.
     */
```

### JavadocDeclaration
`@param keys` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCacheNoWaitFacade.java`
#### Snippet
```java
     * Gets multiple items from the cache based on the given set of keys.
     * <p>
     * @param keys
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCacheNoWaitFacade.java`
#### Snippet
```java
     * Synchronously reads from the lateral cache.
     * <p>
     * @param key
     * @return ICacheElement
     */
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * TODO may be able to remove this
     * @param cacheName
     * @return The clusterListeners value
     */
```

### JavadocDeclaration
`@param item` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * get load on a remote server can be reduced.
     * <p>
     * @param item
     * @param requesterId
     */
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * @param item
     * @param requesterId
     */
    private void processUpdate( final ICacheElement<K, V> item, final long requesterId )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * @return The stats value
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * Shuts down the remote server.
     * <p>
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * from the event queue map list.
     * <p>
     * @param cacheName
     * @param listener
     * @throws IOException
```

### JavadocDeclaration
`@param listener` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param listener
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param cacheName
     * @param listener
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * The internal processing is wrapped in event logging calls.
     * <p>
     * @param cacheName
     * @param keys
     * @param requesterId
```

### JavadocDeclaration
`@param keys` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param keys
     * @param requesterId
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param cacheName
     * @param keys
     * @param requesterId
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * from the event queue map list.
     * <p>
     * @param cacheName
     * @param listenerId
     */
```

### JavadocDeclaration
`@param listenerId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param listenerId
     */
    public void removeCacheListener( final String cacheName, final long listenerId )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java

    /**
     * @param cacheName
     * @param requesterId
     * @throws IOException
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
    /**
     * @param cacheName
     * @param requesterId
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param cacheName
     * @param requesterId
     * @throws IOException
     */
    private void processDispose( final String cacheName, final long requesterId )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * Gets multiple items from the cache based on the given set of keys.
     * <p>
     * @param cacheName
     * @param keys
     * @param requesterId
```

### JavadocDeclaration
`@param keys` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param keys
     * @param requesterId
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param cacheName
     * @param keys
     * @param requesterId
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
```

### JavadocDeclaration
`@param cacheListeners` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * listener id, does not result in a call to that same listener.
     * <p>
     * @param cacheListeners
     * @param requesterId
     * @return The eventQList value
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * @param cacheListeners
     * @param requesterId
     * @return The eventQList value
     */
```

### JavadocDeclaration
`@param rcsa` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * from the properties object.
     * <p>
     * @param rcsa
     * @param config cache hub configuration
     * @param customRMISocketFactory
```

### JavadocDeclaration
`@param customRMISocketFactory` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param rcsa
     * @param config cache hub configuration
     * @param customRMISocketFactory
     * @throws RemoteException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param config cache hub configuration
     * @param customRMISocketFactory
     * @throws RemoteException
     */
    protected RemoteCacheServer( final IRemoteCacheServerAttributes rcsa, final Properties config, final RMISocketFactory customRMISocketFactory )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * Remove the key from the cache region and don't tell the source listener about it.
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
     * @throws IOException
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param cacheName
     * @param key
     * @param requesterId
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param key
     * @param requesterId
     * @throws IOException
     */
    private void processRemove( final String cacheName, final K key, final long requesterId )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * Adding the requester id, allows the cache to determine the source of the get.
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
     * @return ICacheElement
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param cacheName
     * @param key
     * @param requesterId
     * @return ICacheElement
     */
```

### JavadocDeclaration
`@param item` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * </ol>
     * <p>
     * @param item
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * @param item
     * @throws IOException
     */
    public void put( final ICacheElement<K, V> item )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * descriptor if they do not already exist.
     * <p>
     * @param cacheName
     * @return The cacheListeners value
     */
```

### JavadocDeclaration
`@param host` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * itself.
     * <p>
     * @param host
     * @param port
     * @throws IOException
```

### JavadocDeclaration
`@param port` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * @param host
     * @param port
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param host
     * @param port
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param listener object to notify for cache changes. must be synchronized since there are
     *            remote calls involved.
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * Removes the given key from the specified remote cache. Defaults the listener id to 0.
     * <p>
     * @param cacheName
     * @param key
     * @throws IOException
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param cacheName
     * @param key
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * Protected for testing.
     * <p>
     * @param requesterId
     * @return String
     */
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * cluster or a normal client. It will assume that it is a normal client.
     * <p>
     * @param requesterId
     * @return true is from a cluster.
     */
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * Retrieves all matching keys.
     * <p>
     * @param cacheName
     * @param pattern
     * @param requesterId
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param pattern
     * @param requesterId
     * @return Map of keys and wrapped objects
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param cacheName
     * @param pattern
     * @param requesterId
     * @return Map of keys and wrapped objects
     */
```

### JavadocDeclaration
`@param listener` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * Unsubscribes from all remote caches.
     * <p>
     * @param listener
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * @param listener
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * Frees the specified remote cache.
     * <p>
     * @param cacheName
     * @param requesterId
     * @throws IOException
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param requesterId
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param cacheName
     * @param requesterId
     * @throws IOException
     */
    public void dispose( final String cacheName, final long requesterId )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * Gets multiple items from the cache based on the given set of keys.
     * <p>
     * @param cacheName
     * @param keys
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
```

### JavadocDeclaration
`@param keys` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param keys
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * The internal processing is wrapped in event logging calls.
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
     * @return ICacheElement
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param cacheName
     * @param key
     * @param requesterId
     * @return ICacheElement
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param requesterId
     * @return ICacheElement
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * @param listener The feature to be added to the CacheListener attribute
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param item` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * Logs an event if an event logger is configured.
     * <p>
     * @param item
     * @param requesterId
     * @param eventName
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * @param item
     * @param requesterId
     * @param eventName
     * @return ICacheEvent
```

### JavadocDeclaration
`@param eventName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param item
     * @param requesterId
     * @param eventName
     * @return ICacheEvent
     */
```

### JavadocDeclaration
`@param source` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * Logs an event if an event logger is configured.
     * <p>
     * @param source
     * @param eventName
     * @param optionalDetails
```

### JavadocDeclaration
`@param eventName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * @param source
     * @param eventName
     * @param optionalDetails
     */
```

### JavadocDeclaration
`@param optionalDetails` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param source
     * @param eventName
     * @param optionalDetails
     */
    protected void logApplicationEvent( final String source, final String eventName, final String optionalDetails )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * Logs an event if an event logger is configured.
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
     * @param eventName
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param cacheName
     * @param key
     * @param requesterId
     * @param eventName
     * @return ICacheEvent
```

### JavadocDeclaration
`@param eventName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param key
     * @param requesterId
     * @param eventName
     * @return ICacheEvent
     */
```

### JavadocDeclaration
`@param keys` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * Gets the items from the associated cache listeners.
     * <p>
     * @param keys
     * @param elements
     * @param fromCluster
```

### JavadocDeclaration
`@param elements` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * @param keys
     * @param elements
     * @param fromCluster
     * @param cacheDesc
```

### JavadocDeclaration
`@param fromCluster` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param keys
     * @param elements
     * @param fromCluster
     * @param cacheDesc
     * @return Map
```

### JavadocDeclaration
`@param cacheDesc` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param elements
     * @param fromCluster
     * @param cacheDesc
     * @return Map
     */
```

### JavadocDeclaration
`@param cacheEvent` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * Logs an event if an event logger is configured.
     * <p>
     * @param cacheEvent
     */
    protected <T> void logICacheEvent( final ICacheEvent<T> cacheEvent )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * Remove all keys from the specified remote cache.
     * <p>
     * @param cacheName
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param rcsa` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * from the properties object.
     * <p>
     * @param rcsa
     * @param config cache hub configuration
     * @throws RemoteException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param rcsa
     * @param config cache hub configuration
     * @throws RemoteException
     */
    protected RemoteCacheServer( final IRemoteCacheServerAttributes rcsa, final Properties config )
```

### JavadocDeclaration
`@param eventQMap` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * Removes dead event queues. Should clean out deregistered listeners.
     * <p>
     * @param eventQMap
     */
    private static <KK, VV> void cleanupEventQMap( final Map<Long, ICacheEventQueue<KK, VV>> eventQMap )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * exist.
     * <p>
     * @param cacheName
     * @param key
     * @return ICacheElement
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @return ICacheElement
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param key
     * @return ICacheElement
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param item` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * Log some details.
     * <p>
     * @param item
     */
    private void logUpdateInfo( final ICacheElement<K, V> item )
```

### JavadocDeclaration
`@param item` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java

    /**
     * @param item
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
    /**
     * @param item
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * Gets all matching items.
     * <p>
     * @param cacheName
     * @param pattern
     * @return Map of keys and wrapped objects
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param pattern
     * @return Map of keys and wrapped objects
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param pattern
     * @return Map of keys and wrapped objects
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * Retrieves all matching keys.
     * <p>
     * @param cacheName
     * @param pattern
     * @param requesterId
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param pattern
     * @param requesterId
     * @return Map of keys and wrapped objects
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param cacheName
     * @param pattern
     * @param requesterId
     * @return Map of keys and wrapped objects
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param requesterId
     * @return Map of keys and wrapped objects
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * Gets the item from the associated cache listeners.
     * <p>
     * @param key
     * @param fromCluster
     * @param cacheDesc
```

### JavadocDeclaration
`@param fromCluster` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * @param key
     * @param fromCluster
     * @param cacheDesc
     * @param element
```

### JavadocDeclaration
`@param cacheDesc` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param key
     * @param fromCluster
     * @param cacheDesc
     * @param element
     * @return ICacheElement
```

### JavadocDeclaration
`@param element` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param fromCluster
     * @param cacheDesc
     * @param element
     * @return ICacheElement
     */
```

### JavadocDeclaration
`@param cacheEventLogger` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * Allows it to be injected.
     * <p>
     * @param cacheEventLogger
     */
    public void setCacheEventLogger( final ICacheEventLogger cacheEventLogger )
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * Frees the specified remote cache.
     * <p>
     * @param cacheName
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * The internal processing is wrapped in event logging calls.
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
     * @throws IOException
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param cacheName
     * @param key
     * @param requesterId
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param key
     * @param requesterId
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * Frees all remote caches.
     * <p>
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * The internal processing is wrapped in event logging calls.
     * <p>
     * @param cacheName
     * @param requesterId
     * @throws IOException
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param requesterId
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param cacheName
     * @param requesterId
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * Gets the set of keys of objects currently in the cache.
     * <p>
     * @param cacheName
     * @return Set
     */
```

### JavadocDeclaration
`@param item` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * The internal processing is wrapped in event logging calls.
     * <p>
     * @param item
     * @param requesterId
     * @throws IOException
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * @param item
     * @param requesterId
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param item
     * @param requesterId
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * Remove all keys from the specified remote cache.
     * <p>
     * @param cacheName
     * @param requesterId
     * @throws IOException
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param requesterId
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param cacheName
     * @param requesterId
     * @throws IOException
     */
    private void processRemoveAll( final String cacheName, final long requesterId )
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * Gets the item from the associated cache listeners.
     * <p>
     * @param pattern
     * @param fromCluster
     * @param cacheDesc
```

### JavadocDeclaration
`@param fromCluster` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * <p>
     * @param pattern
     * @param fromCluster
     * @param cacheDesc
     * @return Map of keys to results
```

### JavadocDeclaration
`@param cacheDesc` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
     * @param pattern
     * @param fromCluster
     * @param cacheDesc
     * @return Map of keys to results
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java
     * Does nothing.
     * <p>
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java

    /**
     * @param cacheName
     * @param requesterId
     * @throws IOException
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java
    /**
     * @param cacheName
     * @param requesterId
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java
     * @param cacheName
     * @param requesterId
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java

    /**
     * @param cacheName
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java
    /**
     * @param cacheName
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java
     * TODO We should change this. It should issue one request.
     * <p>
     * @param cacheName
     * @param keys
     * @param requesterId
```

### JavadocDeclaration
`@param keys` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param keys
     * @param requesterId
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java
     * @param cacheName
     * @param keys
     * @param requesterId
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java
     * If get is allowed, we will issues a get request.
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @param requesterId
     * @return ICacheElement&lt;K, V&gt; if found.
```

### JavadocDeclaration
`@param requesterId` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java
     * @param cacheName
     * @param key
     * @param requesterId
     * @return ICacheElement&lt;K, V&gt; if found.
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java
     * @param requesterId
     * @return ICacheElement&lt;K, V&gt; if found.
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java
     * If allow get is true, we will issue a getmatching query.
     * <p>
     * @param cacheName
     * @param pattern
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param pattern
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache matching the pattern.
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache matching the pattern.
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java
     * <p>
     * @param lca ITCPLateralCacheAttributes the configuration object
     * @throws IOException
     *
     * @deprecated Specify serializer
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java
     * Will close the connection.
     * <p>
     * @param cacheName
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param args` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java
    /**
     * Test
     * @param args
     *
     * @deprecated Use unit tests
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java
     * @param lca ITCPLateralCacheAttributes the configuration object
     * @param serializer the serializer to use when sending
     * @throws IOException
     * @since 3.1
     */
```

### JavadocDeclaration
`@param item` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java

    /**
     * @param item
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java
    /**
     * @param item
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java
     * If allow get is true, we will issue a getmatching query.
     * <p>
     * @param cacheName
     * @param pattern
     * @param requesterId - our identity
```

### JavadocDeclaration
`@param pattern` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param pattern
     * @param requesterId - our identity
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache matching the pattern.
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java
     * Gets multiple items from the cache based on the given set of keys.
     * <p>
     * @param cacheName
     * @param keys
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
```

### JavadocDeclaration
`@param keys` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param keys
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java
     * @return a map of K key to ICacheElement&lt;K, V&gt; element, or an empty map if there is no
     *         data in cache for any of these keys
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java

    /**
     * @param cacheName
     * @param key
     * @return ICacheElement&lt;K, V&gt; if found.
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java
    /**
     * @param cacheName
     * @param key
     * @return ICacheElement&lt;K, V&gt; if found.
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java
     * @param key
     * @return ICacheElement&lt;K, V&gt; if found.
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheName` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPListener.java`
#### Snippet
```java
     * Gets the cache that was injected by the lateral factory. Calls get on the cache.
     * <p>
     * @param cacheName
     * @param key
     * @return a ICacheElement
```

### JavadocDeclaration
`@param key` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPListener.java`
#### Snippet
```java
     * <p>
     * @param cacheName
     * @param key
     * @return a ICacheElement
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPListener.java`
#### Snippet
```java
     * @param key
     * @return a ICacheElement
     * @throws IOException
     */
    public ICacheElement<K, V> handleGet( final String cacheName, final K key )
```

### JavadocDeclaration
`@param ilca` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPListener.java`
#### Snippet
```java
     * Only need one since it does work for all regions, just reference by multiple region names.
     * <p>
     * @param ilca
     * @param serializer the serializer to use when receiving
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPListener.java`
#### Snippet
```java
     * @param led the lateral element
     * @return a possible response
     * @throws IOException
     */
    private Object handleElement(final LateralElementDescriptor<K, V> led) throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPListener.java`
#### Snippet
```java
     * <p>
     * @return The listenerId value
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param serverSocket` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPListener.java`
#### Snippet
```java
         * Constructor
         *
         * @param serverSocket
         */
        public ListenerThread(final ServerSocket serverSocket)
```

### JavadocDeclaration
`@param socket` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPListener.java`
#### Snippet
```java
        /**
         * Construct for a given socket
         * @param socket
         */
        public ConnectionHandler( final Socket socket )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPListener.java`
#### Snippet
```java
     * @param cacheName the name of the cache
     * @return a set of keys
     * @throws IOException
     */
    public Set<K> handleGetKeySet( final String cacheName ) throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPListener.java`
#### Snippet
```java
     * @param pattern the matching pattern
     * @return Map
     * @throws IOException
     */
    public Map<K, ICacheElement<K, V>> handleGetMatching( final String cacheName, final String pattern )
```

### JavadocDeclaration
`@throws` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPListener.java`
#### Snippet
```java
     * <p>
     * @param id The new listenerId value
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param cacheMgr` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPListener.java`
#### Snippet
```java
     * <p>
     * @param ilca ITCPLateralCacheAttributes
     * @param cacheMgr
     * @return The instance value
     * @deprecated Specify serializer
```

### JavadocDeclaration
`@param cacheMgr` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPListener.java`
#### Snippet
```java
     * <p>
     * @param ilca ITCPLateralCacheAttributes
     * @param cacheMgr
     * @param serializer the serializer to use when receiving
     * @return The instance value
```

### JavadocDeclaration
`@param name` tag description is missing
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPListener.java`
#### Snippet
```java
     * singleton behavior of the cache manager.
     * <p>
     * @param name
     * @return CompositeCache
     */
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `disposed` may be 'final'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheListener.java`
#### Snippet
```java

    /** Has this client been shutdown. */
    private AtomicBoolean disposed;

    /**
```

### FieldMayBeFinal
Field `monitor` may be 'final'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCache.java`
#### Snippet
```java

    /** Monitors the connection. */
    private LateralCacheMonitor monitor;

    /**
```

### FieldMayBeFinal
Field `serializer` may be 'final'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPListener.java`
#### Snippet
```java
     * Serializer for reading and writing
     */
    private IElementSerializer serializer;

    /** put count */
```

## RuleId[id=CaughtExceptionImmediatelyRethrown]
### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/AbstractRemoteCacheListener.java`
#### Snippet
```java
                    log.debug( "Deserialized result = {0}", cb );
                }
                catch ( final IOException e )
                {
                    throw e;
```

### CaughtExceptionImmediatelyRethrown
Caught exception `ex` is immediately rethrown
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheNoWait.java`
#### Snippet
```java
            }
        }
        catch ( final IOException ex )
        {
            // We don't want to destroy the queue on a get failure.
```

### CaughtExceptionImmediatelyRethrown
Caught exception `ex` is immediately rethrown
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheNoWait.java`
#### Snippet
```java
            }
        }
        catch ( final IOException ex )
        {
            // We don't want to destroy the queue on a get failure.
```

### CaughtExceptionImmediatelyRethrown
Caught exception `ex` is immediately rethrown
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheNoWait.java`
#### Snippet
```java
            }
        }
        catch ( final IOException ex )
        {
            // We don't want to destroy the queue on a get failure.
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `helper`
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/access/JCSWorker.java`
#### Snippet
```java
        if ( helper != null )
        {
            synchronized ( helper )
            {
                logger.debug( "Found a worker already doing this work ({0}:{1}).",
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `aHelper`
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/access/JCSWorker.java`
#### Snippet
```java
                map.remove( getRegion() + aKey );
            }
            synchronized ( aHelper )
            {
                aHelper.setFinished( true );
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `regionName`
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCacheConfigurator.java`
#### Snippet
```java
                final String auxiliaries = OptionConverter.findAndSubst( key, props );
                final ICache<?, ?> cache;
                synchronized ( regionName )
                {
                    cache = parseRegion( props, ccm, regionName, auxiliaries, null, SYSTEM_REGION_PREFIX );
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `regionName`
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCacheConfigurator.java`
#### Snippet
```java
                final String auxiliaries = OptionConverter.findAndSubst( key, props );
                final ICache<?, ?> cache;
                synchronized ( regionName )
                {
                    cache = parseRegion( props, ccm, regionName, auxiliaries );
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `cacheDesc`
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java

            // ordered cache item update and notification.
            synchronized ( cacheDesc )
            {
                try
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `cacheDesc`
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
            // best attempt to achieve ordered cache item removal and
            // notification.
            synchronized ( cacheDesc )
            {
                boolean removeSuccess = false;
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `cacheDesc`
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
            // best attempt to achieve ordered cache item removal and
            // notification.
            synchronized ( cacheDesc )
            {
                // No need to broadcast, or notify if it was not cached.
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `cacheDesc`
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
        {
            // best attempt to achieve ordered free-cache-op and notification.
            synchronized ( cacheDesc )
            {
                final ICacheEventQueue<K, V>[] qlist = getEventQList( cacheDesc, requesterId );
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `valueOf` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/config/PropertySetter.java`
#### Snippet
```java
        else if( type.isEnum() )
        {
            Enum<?> valueOf = Enum.valueOf(type.asSubclass(Enum.class), v);
            return valueOf;
        }
```

## RuleId[id=FuseStreamOperations]
### FuseStreamOperations
Stream may be extended replacing 'toArray'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCacheManager.java`
#### Snippet
```java
            .filter(Objects::nonNull)
            .map(cache -> ((CompositeCache<?, ?>)cache).getStatistics() )
            .collect(Collectors.toList());

        return cacheStats.toArray( new CacheStats[0] );
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/AbstractCacheEventQueue.java`
#### Snippet
```java
                try
                {
                    Thread.sleep( waitBeforeRetry );
                }
                catch ( final InterruptedException ie )
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/AbstractAuxiliaryCacheMonitor.java`
#### Snippet
```java
                log.debug( "Cache monitor sleeping for {0} between runs.", idlePeriod );

                Thread.sleep( idlePeriod );
            }
            catch ( final InterruptedException ex )
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/ShrinkerThread.java`
#### Snippet
```java
                try
                {
                    Thread.sleep( this.getPauseBetweenRegionCallsMillis() );
                }
                catch ( final InterruptedException e )
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCache.java`
#### Snippet
```java
            try
            {
                Thread.sleep(100);
                shutdownSpoolTime -= 100;
            }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheNoWaitFacade.java`
#### Snippet
```java
                            + "Cache failover runner is going to sleep for "
                            + "{0} milliseconds.", idlePeriod );
                    Thread.sleep( idlePeriod );
                }
                catch ( final InterruptedException ex )
```

## RuleId[id=CopyConstructorMissesField]
### CopyConstructorMissesField
Copy constructor does not copy fields 'createTime', 'lastAccessTime' and 'timeFactor'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/ElementAttributes.java`
#### Snippet
```java
     * @param attr
     */
    protected ElementAttributes( final ElementAttributes attr )
    {
        IS_ETERNAL = attr.IS_ETERNAL;
```

## RuleId[id=IntegerDivisionInFloatingPointContext]
### IntegerDivisionInFloatingPointContext
`timeTaken / gets`: integer division in floating-point context
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/jmx/JCSCacheStatisticsMXBean.java`
#### Snippet
```java
            return 0;
        }
        return timeTaken / gets;
    }
}
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `index` initializer `-1` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/zip/CompressionUtil.java`
#### Snippet
```java
        final byte[] buffer = new byte[bufferlength];

        int index = -1;

        while ( ( index = compressedStream.read( buffer ) ) != -1 )
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/access/JCSWorker.java`
#### Snippet
```java
        throws Exception
    {
        V result = null;
        // long start = 0;
        // long dbTime = 0;
```

### UnusedAssignment
Variable `ice` initializer `null` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/admin/JCSAdminBean.java`
#### Snippet
```java
        for (final K key : memCache.getKeySet())
        {
            ICacheElement<K, V> ice = null;
			try
			{
```

### UnusedAssignment
Variable `cacheNames` initializer `new ArrayList<>()` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoverySenderThread.java`
#### Snippet
```java

    /** List of known regions. */
    private ArrayList<String> cacheNames = new ArrayList<>();

    /**
```

### UnusedAssignment
Variable `multicastInterface` initializer `null` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoverySender.java`
#### Snippet
```java

            // Use dedicated interface if specified
            NetworkInterface multicastInterface = null;
            if (mcastInterface != null)
            {
```

### UnusedAssignment
Variable `threadPriority` initializer `Thread.NORM_PRIORITY` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/threadpool/DaemonThreadFactory.java`
#### Snippet
```java
    private final String prefix;
    private final static boolean THREAD_IS_DAEMON = true;
    private int threadPriority = Thread.NORM_PRIORITY;

    /**
```

### UnusedAssignment
Variable `serializedValue` initializer `null` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/serialization/SerializationConversionUtil.java`
#### Snippet
```java
        }

        byte[] serializedValue = null;

        // if it has already been serialized, don't do it again.
```

### UnusedAssignment
Variable `deSerializedValue` initializer `null` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/serialization/SerializationConversionUtil.java`
#### Snippet
```java
        }

        V deSerializedValue = null;

        if ( elementSerializer == null ) {
```

### UnusedAssignment
Variable `numFreed` initializer `-1` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/AbstractCacheAccess.java`
#### Snippet
```java
        throws CacheException
    {
        int numFreed = -1;
        try
        {
```

### UnusedAssignment
Variable `multicastInterface` initializer `null` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryReceiver.java`
#### Snippet
```java
        {
            // Use dedicated interface if specified
            NetworkInterface multicastInterface = null;
            if (multicastInterfaceString != null)
            {
```

### UnusedAssignment
Variable `queue` initializer `null` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/threadpool/ThreadPoolManager.java`
#### Snippet
```java
    public ExecutorService createPool( final PoolConfiguration config, final String threadNamePrefix, final int threadPriority )
    {
        BlockingQueue<Runnable> queue = null;
        if ( config.isUseBoundary() )
        {
```

### UnusedAssignment
Variable `old` initializer `null` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/struct/AbstractLRUMap.java`
#### Snippet
```java
        putCnt++;

        LRUElementDescriptor<K, V> old = null;
        final LRUElementDescriptor<K, V> me = new LRUElementDescriptor<>(key, value);

```

### UnusedAssignment
Variable `serviceInterface` initializer `null` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryService.java`
#### Snippet
```java
            {
                // Use same interface as for multicast
                NetworkInterface serviceInterface = null;
                if (getUdpDiscoveryAttributes().getUdpDiscoveryInterface() != null)
                {
```

### UnusedAssignment
Variable `attr` initializer `null` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/access/CacheAccess.java`
#### Snippet
```java
    public IElementAttributes getElementAttributes( final K name ) throws CacheException
    {
        IElementAttributes attr = null;

        try
```

### UnusedAssignment
Variable `elementEvent` initializer `ElementEventType.EXCEEDED_MAXLIFE_BACKGROUND` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/event/ElementEvent.java`
#### Snippet
```java

    /** default event code */
    private ElementEventType elementEvent = ElementEventType.EXCEEDED_MAXLIFE_BACKGROUND;

    /**
```

### UnusedAssignment
Variable `found` initializer `false` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/AbstractDoubleLinkedListMemoryCache.java`
#### Snippet
```java
    private void verifyCache()
    {
        boolean found = false;
        log.trace("verifycache[{0}]: map contains {1} elements, linked list "
                + "contains {2} elements", getCacheName(), map.size(),
```

### UnusedAssignment
Variable `poolName` initializer `null` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/JDBCDiskCacheFactory.java`
#### Snippet
```java
                                                      final Properties configProps ) throws SQLException
    {
    	String poolName = null;

    	if (cattr.getConnectionPoolName() == null)
```

### UnusedAssignment
Variable `observer` initializer `null` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/control/CompositeCacheManager.java`
#### Snippet
```java

        // notify any observers
        IShutdownObserver observer = null;
        while ((observer = shutdownObservers.poll()) != null)
        {
```

### UnusedAssignment
Variable `datalen` initializer `0` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
        throws IOException
    {
        int datalen = 0;

        String message = null;
```

### UnusedAssignment
Variable `diskLimitType` initializer `DiskLimitType.COUNT` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskKeyStore.java`
#### Snippet
```java
    protected final BlockDiskCache<K, ?> blockDiskCache;

    private DiskLimitType diskLimitType = DiskLimitType.COUNT;

    private final int blockSize;
```

### UnusedAssignment
Variable `keyArray` initializer `null` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskCache.java`
#### Snippet
```java
    public Map<K, ICacheElement<K, V>> processGetMatching( final String pattern )
    {
        Set<K> keyArray = null;
        storageLock.readLock().lock();
        try
```

### UnusedAssignment
Variable `alright` initializer `false` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskCache.java`
#### Snippet
```java
    protected boolean verifyDisk()
    {
        boolean alright = false;
        // simply try to read a few. If it works, then the file is probably ok.
        // TODO add more.
```

### UnusedAssignment
Variable `element` initializer `null` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/AbstractRemoteCacheService.java`
#### Snippet
```java
        throws IOException
    {
        ICacheElement<K, V> element = null;
        final ICacheEvent<K> cacheEvent = createICacheEvent( cacheName, key, requesterId, ICacheEventLogger.GET_EVENT );
        try
```

### UnusedAssignment
Variable `defragList` initializer `null` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java

        // CREATE SNAPSHOT
        IndexedDiskElementDescriptor[] defragList = null;

        storageLock.writeLock().lock();
```

### UnusedAssignment
Variable `stats` initializer `""` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheStartupServlet.java`
#### Snippet
```java
            throws ServletException, IOException
    {
        String stats = "";

        try
```

### UnusedAssignment
Variable `ded` initializer `null` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java
        try
        {
            IndexedDiskElementDescriptor ded = null;
            final byte[] data = getElementSerializer().serialize(ce);

```

### UnusedAssignment
Variable `removed` initializer `false` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java
        }

        boolean removed = false;
        try
        {
```

### UnusedAssignment
Variable `keyArray` initializer `null` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java
    {
        final Map<K, ICacheElement<K, V>> elements = new HashMap<>();
        Set<K> keyArray = null;
        storageLock.readLock().lock();
        try
```

### UnusedAssignment
Variable `isRealTimeOptimizationEnabled` initializer `true` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java

    /** Should we optimize real time */
    private boolean isRealTimeOptimizationEnabled = true;

    /** Should we optimize on shutdown. */
```

### UnusedAssignment
Variable `isShutdownOptimizationEnabled` initializer `true` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java

    /** Should we optimize on shutdown. */
    private boolean isShutdownOptimizationEnabled = true;

    /** are we currently optimizing the files */
```

### UnusedAssignment
Variable `keyMap` initializer `null` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java
    private Map<K, IndexedDiskElementDescriptor> createInitialKeyMap()
    {
        Map<K, IndexedDiskElementDescriptor> keyMap = null;
        if (maxKeySize >= 0)
        {
```

### UnusedAssignment
Variable `diskLimitType` initializer `DiskLimitType.COUNT` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java

    /** mode we are working on (size or count limited **/
    private DiskLimitType diskLimitType = DiskLimitType.COUNT;

    /** simple stat */
```

### UnusedAssignment
Variable `response` initializer `null` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPSender.java`
#### Snippet
```java
        // This may not be necessary.
        // Normal puts, etc to laterals do not have to be synchronized.
        Object response = null;

        lock.lock();
```

### UnusedAssignment
Variable `discovery` initializer `null` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPCacheFactory.java`
#### Snippet
```java
            final IElementSerializer elementSerializer )
    {
        UDPDiscoveryService discovery = null;

        // create the UDP discovery for the TCP lateral
```

### UnusedAssignment
Variable `element` initializer `null` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
        throws IOException
    {
        ICacheElement<K, V> element = null;
        final ICacheEvent<K> cacheEvent = createICacheEvent( cacheName, key, requesterId, ICacheEventLogger.GET_EVENT );
        try
```

### UnusedAssignment
Variable `removeSuccess` initializer `false` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
            synchronized ( cacheDesc )
            {
                boolean removeSuccess = false;

                // No need to notify if it was not cached.
```

### UnusedAssignment
Variable `id` initializer `0` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
    private long nextListenerId()
    {
        long id = 0;
        if ( listenerId[0] == Integer.MAX_VALUE )
        {
```

### UnusedAssignment
Variable `cacheDesc` initializer `null` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
        final boolean isClusterListener = isRequestFromCluster( listenerId );

        CacheListeners<K, V> cacheDesc = null;

        if ( isClusterListener )
```

### UnusedAssignment
Variable `message` initializer `null` is redundant
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/socket/tcp/LateralTCPService.java`
#### Snippet
```java
            // process user input till done
            boolean notDone = true;
            String message = null;
            // wait to dispose
            final BufferedReader br = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
```

### UnusedAssignment
Variable `v` initializer `null` is redundant
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/JCSCache.java`
#### Snippet
```java
    private V doLoad(final K key, final boolean update, final long now, final boolean propagateLoadException)
    {
        V v = null;
        try
        {
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `CacheProviderBean.class.isInstance(bean)` is always `false` when reached
in `commons-jcs-jcache-extras/src/main/java/org/apache/commons/jcs3/jcache/extras/cdi/ExtraJCacheExtension.java`
#### Snippet
```java

        final Bean<A> bean = processBeanEvent.getBean();
        if (CacheManagerBean.class.isInstance(bean) || CacheProviderBean.class.isInstance(bean))
        {
            return;
```

### ConstantValue
Value `bean` is always 'null'
in `commons-jcs-jcache-extras/src/main/java/org/apache/commons/jcs3/jcache/extras/cdi/ExtraJCacheExtension.java`
#### Snippet
```java

        final Bean<A> bean = processBeanEvent.getBean();
        if (CacheManagerBean.class.isInstance(bean) || CacheProviderBean.class.isInstance(bean))
        {
            return;
```

### ConstantValue
Condition `spoolCount >= this.maxSpoolPerRun` is always `true` when reached
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/memory/shrinking/ShrinkerThread.java`
#### Snippet
```java

                        // stop processing if limit has been reached.
                        if ( spoolLimit && spoolCount >= this.maxSpoolPerRun )
                        {
                            return;
```

### ConstantValue
Condition `fromCluster` is always `true` when reached
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
                // UPDATE LOCALS IF A REQUEST COMES FROM A CLUSTER
                // IF LOCAL CLUSTER CONSISTENCY IS CONFIGURED
                if (!fromCluster || fromCluster && remoteCacheServerAttributes.isLocalClusterConsistency())
                {
                    final ICacheEventQueue<K, V>[] qlist = getEventQList( cacheDesc, requesterId );
```

### ConstantValue
Condition `fromCluster` is always `true` when reached
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
                // UPDATE LOCALS IF A REQUEST COMES FROM A CLUSTER
                // IF LOCAL CLUSTER CONSISTENCY IS CONFIGURED
                if (!fromCluster || fromCluster && remoteCacheServerAttributes.isLocalClusterConsistency())
                {
                    final ICacheEventQueue<K, V>[] qlist = getEventQList( cacheDesc, requesterId );
```

### ConstantValue
Value `fromCluster` is always 'false'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
            {
                log.debug( "NonLocalGetMultiple. fromCluster [{0}] AllowClusterGet [{1}]",
                        fromCluster, this.remoteCacheServerAttributes.isAllowClusterGet() );

                returnElements = c.getMultiple( keys );
```

### ConstantValue
Condition `fromCluster` is always `true` when reached
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java

                // update registered listeners
                if (!fromCluster || fromCluster && remoteCacheServerAttributes.isLocalClusterConsistency())
                {
                    final ICacheEventQueue<K, V>[] qlist = getEventQList( cacheDesc, requesterId );
```

### ConstantValue
Value `fromCluster` is always 'false'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
            {
                log.debug( "NonLocalGetMatching. fromCluster [{0}] AllowClusterGet [{1}]",
                        fromCluster, this.remoteCacheServerAttributes.isAllowClusterGet() );
                elements = c.getMatching( pattern );
            }
```

### ConstantValue
Value `fromCluster` is always 'false'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServer.java`
#### Snippet
```java
            {
                log.debug( "NonLocalGet. fromCluster [{0}] AllowClusterGet [{1}]",
                        fromCluster, this.remoteCacheServerAttributes.isAllowClusterGet() );
                returnElement = c.get( key );
            }
```

### ConstantValue
Value `cache` is always 'null'
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/proxy/ClassLoaderAwareCache.java`
#### Snippet
```java
            return (JCSCache<K, V>) cache;
        }
        return ((ClassLoaderAwareCache<K, V>) cache).delegate;
    }
}
```

### ConstantValue
Value `ex` is always 'null'
in `commons-jcs-jcache/src/main/java/org/apache/commons/jcs3/jcache/JCSCache.java`
#### Snippet
```java
            throw EntryProcessorException.class.cast(ex);
        }
        throw new EntryProcessorException(ex);
    }

```

## RuleId[id=NonAtomicOperationOnVolatileField]
### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `currentOptimizationThread`
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCache.java`
#### Snippet
```java
                    if (currentOptimizationThread == null)
                    {
                        currentOptimizationThread = new Thread(() -> {
                            optimizeFile();
                            currentOptimizationThread = null;
```

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'ic' to 'RemoteCacheNoWait'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheNoWaitFacade.java`
#### Snippet
```java
                            // may need to do this more gracefully
                            log.debug( "resetting no wait" );
                            restorePrimaryServer((RemoteCacheNoWait<K, V>) ic);
                            rca0.setFailoverIndex(failoverIndex);

```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'ic' to 'RemoteCacheNoWait'
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheNoWaitFacade.java`
#### Snippet
```java

                // swap in a new one
                restorePrimaryServer((RemoteCacheNoWait<K, V>) ic);
                rca0.setFailoverIndex( 0 );

```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/admin/CacheRegionInfo.java`
#### Snippet
```java
        if ( cacheName != null )
        {
            buf.append( "\n CacheName [" + cacheName + "]" );
            buf.append( "\n Status [" + cacheStatus + "]" );
        }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/admin/CacheRegionInfo.java`
#### Snippet
```java
        {
            buf.append( "\n CacheName [" + cacheName + "]" );
            buf.append( "\n Status [" + cacheStatus + "]" );
        }
        buf.append( "\n ByteCount [" + getByteCount() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/admin/CacheRegionInfo.java`
#### Snippet
```java
            buf.append( "\n Status [" + cacheStatus + "]" );
        }
        buf.append( "\n ByteCount [" + getByteCount() + "]" );

        return buf.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/DiscoveredService.java`
#### Snippet
```java
        final StringBuilder buf = new StringBuilder();
        buf.append( "\n DiscoveredService" );
        buf.append( "\n CacheNames = [" + getCacheNames() + "]" );
        buf.append( "\n ServiceAddress = [" + getServiceAddress() + "]" );
        buf.append( "\n ServicePort = [" + getServicePort() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/DiscoveredService.java`
#### Snippet
```java
        buf.append( "\n DiscoveredService" );
        buf.append( "\n CacheNames = [" + getCacheNames() + "]" );
        buf.append( "\n ServiceAddress = [" + getServiceAddress() + "]" );
        buf.append( "\n ServicePort = [" + getServicePort() + "]" );
        buf.append( "\n LastHearFromTime = [" + getLastHearFromTime() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/DiscoveredService.java`
#### Snippet
```java
        buf.append( "\n CacheNames = [" + getCacheNames() + "]" );
        buf.append( "\n ServiceAddress = [" + getServiceAddress() + "]" );
        buf.append( "\n ServicePort = [" + getServicePort() + "]" );
        buf.append( "\n LastHearFromTime = [" + getLastHearFromTime() + "]" );
        return buf.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/DiscoveredService.java`
#### Snippet
```java
        buf.append( "\n ServiceAddress = [" + getServiceAddress() + "]" );
        buf.append( "\n ServicePort = [" + getServicePort() + "]" );
        buf.append( "\n LastHearFromTime = [" + getLastHearFromTime() + "]" );
        return buf.toString();
    }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryAttributes.java`
#### Snippet
```java
        final StringBuilder buf = new StringBuilder();
        buf.append( "\n UDPDiscoveryAttributes" );
        buf.append( "\n ServiceName = [" + getServiceName() + "]" );
        buf.append( "\n ServiceAddress = [" + getServiceAddress() + "]" );
        buf.append( "\n ServicePort = [" + getServicePort() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryAttributes.java`
#### Snippet
```java
        buf.append( "\n UDPDiscoveryAttributes" );
        buf.append( "\n ServiceName = [" + getServiceName() + "]" );
        buf.append( "\n ServiceAddress = [" + getServiceAddress() + "]" );
        buf.append( "\n ServicePort = [" + getServicePort() + "]" );
        buf.append( "\n UdpDiscoveryAddr = [" + getUdpDiscoveryAddr() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryAttributes.java`
#### Snippet
```java
        buf.append( "\n ServiceName = [" + getServiceName() + "]" );
        buf.append( "\n ServiceAddress = [" + getServiceAddress() + "]" );
        buf.append( "\n ServicePort = [" + getServicePort() + "]" );
        buf.append( "\n UdpDiscoveryAddr = [" + getUdpDiscoveryAddr() + "]" );
        buf.append( "\n UdpDiscoveryPort = [" + getUdpDiscoveryPort() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryAttributes.java`
#### Snippet
```java
        buf.append( "\n ServiceAddress = [" + getServiceAddress() + "]" );
        buf.append( "\n ServicePort = [" + getServicePort() + "]" );
        buf.append( "\n UdpDiscoveryAddr = [" + getUdpDiscoveryAddr() + "]" );
        buf.append( "\n UdpDiscoveryPort = [" + getUdpDiscoveryPort() + "]" );
        buf.append( "\n SendDelaySec = [" + getSendDelaySec() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryAttributes.java`
#### Snippet
```java
        buf.append( "\n ServicePort = [" + getServicePort() + "]" );
        buf.append( "\n UdpDiscoveryAddr = [" + getUdpDiscoveryAddr() + "]" );
        buf.append( "\n UdpDiscoveryPort = [" + getUdpDiscoveryPort() + "]" );
        buf.append( "\n SendDelaySec = [" + getSendDelaySec() + "]" );
        buf.append( "\n MaxIdleTimeSec = [" + getMaxIdleTimeSec() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryAttributes.java`
#### Snippet
```java
        buf.append( "\n UdpDiscoveryAddr = [" + getUdpDiscoveryAddr() + "]" );
        buf.append( "\n UdpDiscoveryPort = [" + getUdpDiscoveryPort() + "]" );
        buf.append( "\n SendDelaySec = [" + getSendDelaySec() + "]" );
        buf.append( "\n MaxIdleTimeSec = [" + getMaxIdleTimeSec() + "]" );
        buf.append( "\n IsDark = [" + isDark() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryAttributes.java`
#### Snippet
```java
        buf.append( "\n UdpDiscoveryPort = [" + getUdpDiscoveryPort() + "]" );
        buf.append( "\n SendDelaySec = [" + getSendDelaySec() + "]" );
        buf.append( "\n MaxIdleTimeSec = [" + getMaxIdleTimeSec() + "]" );
        buf.append( "\n IsDark = [" + isDark() + "]" );
        return buf.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryAttributes.java`
#### Snippet
```java
        buf.append( "\n SendDelaySec = [" + getSendDelaySec() + "]" );
        buf.append( "\n MaxIdleTimeSec = [" + getMaxIdleTimeSec() + "]" );
        buf.append( "\n IsDark = [" + isDark() + "]" );
        return buf.toString();
    }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryMessage.java`
#### Snippet
```java
    {
        final StringBuilder buf = new StringBuilder();
        buf.append( "\n host = [" + host + "]" );
        buf.append( "\n port = [" + port + "]" );
        buf.append( "\n requesterId = [" + requesterId + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryMessage.java`
#### Snippet
```java
        final StringBuilder buf = new StringBuilder();
        buf.append( "\n host = [" + host + "]" );
        buf.append( "\n port = [" + port + "]" );
        buf.append( "\n requesterId = [" + requesterId + "]" );
        buf.append( "\n messageType = [" + messageType + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryMessage.java`
#### Snippet
```java
        buf.append( "\n host = [" + host + "]" );
        buf.append( "\n port = [" + port + "]" );
        buf.append( "\n requesterId = [" + requesterId + "]" );
        buf.append( "\n messageType = [" + messageType + "]" );
        buf.append( "\n Cache Names" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryMessage.java`
#### Snippet
```java
        buf.append( "\n port = [" + port + "]" );
        buf.append( "\n requesterId = [" + requesterId + "]" );
        buf.append( "\n messageType = [" + messageType + "]" );
        buf.append( "\n Cache Names" );
        for (final String name : cacheNames)
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/discovery/UDPDiscoveryMessage.java`
#### Snippet
```java
        for (final String name : cacheNames)
        {
            buf.append( " cacheName = [" + name + "]" );
        }
        return buf.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/threadpool/PoolConfiguration.java`
#### Snippet
```java
    {
        final StringBuilder buf = new StringBuilder();
        buf.append( "useBoundary = [" + isUseBoundary() + "] " );
        buf.append( "boundarySize = [" + boundarySize + "] " );
        buf.append( "maximumPoolSize = [" + maximumPoolSize + "] " );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/threadpool/PoolConfiguration.java`
#### Snippet
```java
        final StringBuilder buf = new StringBuilder();
        buf.append( "useBoundary = [" + isUseBoundary() + "] " );
        buf.append( "boundarySize = [" + boundarySize + "] " );
        buf.append( "maximumPoolSize = [" + maximumPoolSize + "] " );
        buf.append( "minimumPoolSize = [" + minimumPoolSize + "] " );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/threadpool/PoolConfiguration.java`
#### Snippet
```java
        buf.append( "useBoundary = [" + isUseBoundary() + "] " );
        buf.append( "boundarySize = [" + boundarySize + "] " );
        buf.append( "maximumPoolSize = [" + maximumPoolSize + "] " );
        buf.append( "minimumPoolSize = [" + minimumPoolSize + "] " );
        buf.append( "keepAliveTime = [" + keepAliveTime + "] " );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/threadpool/PoolConfiguration.java`
#### Snippet
```java
        buf.append( "boundarySize = [" + boundarySize + "] " );
        buf.append( "maximumPoolSize = [" + maximumPoolSize + "] " );
        buf.append( "minimumPoolSize = [" + minimumPoolSize + "] " );
        buf.append( "keepAliveTime = [" + keepAliveTime + "] " );
        buf.append( "whenBlockedPolicy = [" + getWhenBlockedPolicy() + "] " );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/threadpool/PoolConfiguration.java`
#### Snippet
```java
        buf.append( "maximumPoolSize = [" + maximumPoolSize + "] " );
        buf.append( "minimumPoolSize = [" + minimumPoolSize + "] " );
        buf.append( "keepAliveTime = [" + keepAliveTime + "] " );
        buf.append( "whenBlockedPolicy = [" + getWhenBlockedPolicy() + "] " );
        buf.append( "startUpSize = [" + startUpSize + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/threadpool/PoolConfiguration.java`
#### Snippet
```java
        buf.append( "minimumPoolSize = [" + minimumPoolSize + "] " );
        buf.append( "keepAliveTime = [" + keepAliveTime + "] " );
        buf.append( "whenBlockedPolicy = [" + getWhenBlockedPolicy() + "] " );
        buf.append( "startUpSize = [" + startUpSize + "]" );
        return buf.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/utils/threadpool/PoolConfiguration.java`
#### Snippet
```java
        buf.append( "keepAliveTime = [" + keepAliveTime + "] " );
        buf.append( "whenBlockedPolicy = [" + getWhenBlockedPolicy() + "] " );
        buf.append( "startUpSize = [" + startUpSize + "]" );
        return buf.toString();
    }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheListeners.java`
#### Snippet
```java
        final StringBuilder buffer = new StringBuilder();
        buffer.append( "\n CacheListeners" );
        buffer.append( "\n Region = " + cache.getCacheName() );
        buffer.append( "\n Event Queue Map " );
        buffer.append( "\n size = " + eventQMap.size() );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheListeners.java`
#### Snippet
```java
        buffer.append( "\n Region = " + cache.getCacheName() );
        buffer.append( "\n Event Queue Map " );
        buffer.append( "\n size = " + eventQMap.size() );
        eventQMap.forEach((key, value)
                -> buffer.append( "\n Entry: key: ").append(key)
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheElementSerialized.java`
#### Snippet
```java
        final StringBuilder buf = new StringBuilder();
        buf.append( "\n CacheElementSerialized: " );
        buf.append( "\n CacheName = [" + getCacheName() + "]" );
        buf.append( "\n Key = [" + getKey() + "]" );
        buf.append( "\n SerializedValue = " + Arrays.toString(getSerializedValue()) );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheElementSerialized.java`
#### Snippet
```java
        buf.append( "\n CacheElementSerialized: " );
        buf.append( "\n CacheName = [" + getCacheName() + "]" );
        buf.append( "\n Key = [" + getKey() + "]" );
        buf.append( "\n SerializedValue = " + Arrays.toString(getSerializedValue()) );
        buf.append( "\n ElementAttributes = " + getElementAttributes() );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheElementSerialized.java`
#### Snippet
```java
        buf.append( "\n CacheName = [" + getCacheName() + "]" );
        buf.append( "\n Key = [" + getKey() + "]" );
        buf.append( "\n SerializedValue = " + Arrays.toString(getSerializedValue()) );
        buf.append( "\n ElementAttributes = " + getElementAttributes() );
        return buf.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/CacheElementSerialized.java`
#### Snippet
```java
        buf.append( "\n Key = [" + getKey() + "]" );
        buf.append( "\n SerializedValue = " + Arrays.toString(getSerializedValue()) );
        buf.append( "\n ElementAttributes = " + getElementAttributes() );
        return buf.toString();
    }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/engine/stats/CacheStats.java`
#### Snippet
```java
        final StringBuilder buf = new StringBuilder();

        buf.append( "Region Name = " + regionName );

        if ( getStatElements() != null )
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/PurgatoryElement.java`
#### Snippet
```java
        final StringBuilder buf = new StringBuilder();
        buf.append( "[PurgatoryElement: " );
        buf.append( " isSpoolable = " + isSpoolable() );
        buf.append( " CacheElement = " + getCacheElement() );
        buf.append( " CacheName = " + getCacheName() );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/PurgatoryElement.java`
#### Snippet
```java
        buf.append( "[PurgatoryElement: " );
        buf.append( " isSpoolable = " + isSpoolable() );
        buf.append( " CacheElement = " + getCacheElement() );
        buf.append( " CacheName = " + getCacheName() );
        buf.append( " Key = " + getKey() );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/PurgatoryElement.java`
#### Snippet
```java
        buf.append( " isSpoolable = " + isSpoolable() );
        buf.append( " CacheElement = " + getCacheElement() );
        buf.append( " CacheName = " + getCacheName() );
        buf.append( " Key = " + getKey() );
        buf.append( " Value = " + getVal() );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/PurgatoryElement.java`
#### Snippet
```java
        buf.append( " CacheElement = " + getCacheElement() );
        buf.append( " CacheName = " + getCacheName() );
        buf.append( " Key = " + getKey() );
        buf.append( " Value = " + getVal() );
        buf.append( " ElementAttributes = " + getElementAttributes() );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/PurgatoryElement.java`
#### Snippet
```java
        buf.append( " CacheName = " + getCacheName() );
        buf.append( " Key = " + getKey() );
        buf.append( " Value = " + getVal() );
        buf.append( " ElementAttributes = " + getElementAttributes() );
        buf.append( "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/PurgatoryElement.java`
#### Snippet
```java
        buf.append( " Key = " + getKey() );
        buf.append( " Value = " + getVal() );
        buf.append( " ElementAttributes = " + getElementAttributes() );
        buf.append( "]" );
        return buf.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCacheAttributes.java`
#### Snippet
```java
        final StringBuilder str = new StringBuilder();
        str.append("AbstractDiskCacheAttributes ");
        str.append("\n diskPath = " + getDiskPath());
        str.append("\n maxPurgatorySize   = " + getMaxPurgatorySize());
        str.append("\n allowRemoveAll   = " + isAllowRemoveAll());
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCacheAttributes.java`
#### Snippet
```java
        str.append("AbstractDiskCacheAttributes ");
        str.append("\n diskPath = " + getDiskPath());
        str.append("\n maxPurgatorySize   = " + getMaxPurgatorySize());
        str.append("\n allowRemoveAll   = " + isAllowRemoveAll());
        str.append("\n ShutdownSpoolTimeLimit   = " + getShutdownSpoolTimeLimit());
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCacheAttributes.java`
#### Snippet
```java
        str.append("\n diskPath = " + getDiskPath());
        str.append("\n maxPurgatorySize   = " + getMaxPurgatorySize());
        str.append("\n allowRemoveAll   = " + isAllowRemoveAll());
        str.append("\n ShutdownSpoolTimeLimit   = " + getShutdownSpoolTimeLimit());
        return str.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/AbstractDiskCacheAttributes.java`
#### Snippet
```java
        str.append("\n maxPurgatorySize   = " + getMaxPurgatorySize());
        str.append("\n allowRemoveAll   = " + isAllowRemoveAll());
        str.append("\n ShutdownSpoolTimeLimit   = " + getShutdownSpoolTimeLimit());
        return str.toString();
    }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/TableState.java`
#### Snippet
```java
        final StringBuilder str = new StringBuilder();
        str.append( "TableState " );
        str.append( "\n TableName = " + getTableName() );
        str.append( "\n State = " + getState() );
        return str.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/TableState.java`
#### Snippet
```java
        str.append( "TableState " );
        str.append( "\n TableName = " + getTableName() );
        str.append( "\n State = " + getState() );
        return str.toString();
    }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/JDBCDiskCacheAttributes.java`
#### Snippet
```java
        final StringBuilder buf = new StringBuilder();
        buf.append( "\nJDBCCacheAttributes" );
        buf.append( "\n UserName [" + getUserName() + "]" );
        buf.append( "\n Url [" + getUrl() + "]" );
        buf.append( "\n Database [" + getDatabase() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/JDBCDiskCacheAttributes.java`
#### Snippet
```java
        buf.append( "\nJDBCCacheAttributes" );
        buf.append( "\n UserName [" + getUserName() + "]" );
        buf.append( "\n Url [" + getUrl() + "]" );
        buf.append( "\n Database [" + getDatabase() + "]" );
        buf.append( "\n DriverClassName [" + getDriverClassName() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/JDBCDiskCacheAttributes.java`
#### Snippet
```java
        buf.append( "\n UserName [" + getUserName() + "]" );
        buf.append( "\n Url [" + getUrl() + "]" );
        buf.append( "\n Database [" + getDatabase() + "]" );
        buf.append( "\n DriverClassName [" + getDriverClassName() + "]" );
        buf.append( "\n TableName [" + getTableName() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/JDBCDiskCacheAttributes.java`
#### Snippet
```java
        buf.append( "\n Url [" + getUrl() + "]" );
        buf.append( "\n Database [" + getDatabase() + "]" );
        buf.append( "\n DriverClassName [" + getDriverClassName() + "]" );
        buf.append( "\n TableName [" + getTableName() + "]" );
        buf.append( "\n TestBeforeInsert [" + isTestBeforeInsert() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/JDBCDiskCacheAttributes.java`
#### Snippet
```java
        buf.append( "\n Database [" + getDatabase() + "]" );
        buf.append( "\n DriverClassName [" + getDriverClassName() + "]" );
        buf.append( "\n TableName [" + getTableName() + "]" );
        buf.append( "\n TestBeforeInsert [" + isTestBeforeInsert() + "]" );
        buf.append( "\n MaxActive [" + getMaxTotal() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/JDBCDiskCacheAttributes.java`
#### Snippet
```java
        buf.append( "\n DriverClassName [" + getDriverClassName() + "]" );
        buf.append( "\n TableName [" + getTableName() + "]" );
        buf.append( "\n TestBeforeInsert [" + isTestBeforeInsert() + "]" );
        buf.append( "\n MaxActive [" + getMaxTotal() + "]" );
        buf.append( "\n AllowRemoveAll [" + isAllowRemoveAll() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/JDBCDiskCacheAttributes.java`
#### Snippet
```java
        buf.append( "\n TableName [" + getTableName() + "]" );
        buf.append( "\n TestBeforeInsert [" + isTestBeforeInsert() + "]" );
        buf.append( "\n MaxActive [" + getMaxTotal() + "]" );
        buf.append( "\n AllowRemoveAll [" + isAllowRemoveAll() + "]" );
        buf.append( "\n ShrinkerIntervalSeconds [" + getShrinkerIntervalSeconds() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/JDBCDiskCacheAttributes.java`
#### Snippet
```java
        buf.append( "\n TestBeforeInsert [" + isTestBeforeInsert() + "]" );
        buf.append( "\n MaxActive [" + getMaxTotal() + "]" );
        buf.append( "\n AllowRemoveAll [" + isAllowRemoveAll() + "]" );
        buf.append( "\n ShrinkerIntervalSeconds [" + getShrinkerIntervalSeconds() + "]" );
        buf.append( "\n useDiskShrinker [" + isUseDiskShrinker() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/JDBCDiskCacheAttributes.java`
#### Snippet
```java
        buf.append( "\n MaxActive [" + getMaxTotal() + "]" );
        buf.append( "\n AllowRemoveAll [" + isAllowRemoveAll() + "]" );
        buf.append( "\n ShrinkerIntervalSeconds [" + getShrinkerIntervalSeconds() + "]" );
        buf.append( "\n useDiskShrinker [" + isUseDiskShrinker() + "]" );
        return buf.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/JDBCDiskCacheAttributes.java`
#### Snippet
```java
        buf.append( "\n AllowRemoveAll [" + isAllowRemoveAll() + "]" );
        buf.append( "\n ShrinkerIntervalSeconds [" + getShrinkerIntervalSeconds() + "]" );
        buf.append( "\n useDiskShrinker [" + isUseDiskShrinker() + "]" );
        return buf.toString();
    }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/mysql/MySQLDiskCacheAttributes.java`
#### Snippet
```java
        final StringBuilder buf = new StringBuilder();
        buf.append( "\nMySQLDiskCacheAttributes" );
        buf.append( "\n OptimizationSchedule [" + getOptimizationSchedule() + "]" );
        buf.append( "\n BalkDuringOptimization [" + isBalkDuringOptimization() + "]" );
        buf.append( super.toString() );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/jdbc/mysql/MySQLDiskCacheAttributes.java`
#### Snippet
```java
        buf.append( "\nMySQLDiskCacheAttributes" );
        buf.append( "\n OptimizationSchedule [" + getOptimizationSchedule() + "]" );
        buf.append( "\n BalkDuringOptimization [" + isBalkDuringOptimization() + "]" );
        buf.append( super.toString() );
        return buf.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskCacheAttributes.java`
#### Snippet
```java
        final StringBuilder str = new StringBuilder();
        str.append( "\nBlockDiskAttributes " );
        str.append( "\n DiskPath [" + this.getDiskPath() + "]" );
        str.append( "\n MaxKeySize [" + this.getMaxKeySize() + "]" );
        str.append( "\n MaxPurgatorySize [" + this.getMaxPurgatorySize() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskCacheAttributes.java`
#### Snippet
```java
        str.append( "\nBlockDiskAttributes " );
        str.append( "\n DiskPath [" + this.getDiskPath() + "]" );
        str.append( "\n MaxKeySize [" + this.getMaxKeySize() + "]" );
        str.append( "\n MaxPurgatorySize [" + this.getMaxPurgatorySize() + "]" );
        str.append( "\n BlockSizeBytes [" + this.getBlockSizeBytes() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskCacheAttributes.java`
#### Snippet
```java
        str.append( "\n DiskPath [" + this.getDiskPath() + "]" );
        str.append( "\n MaxKeySize [" + this.getMaxKeySize() + "]" );
        str.append( "\n MaxPurgatorySize [" + this.getMaxPurgatorySize() + "]" );
        str.append( "\n BlockSizeBytes [" + this.getBlockSizeBytes() + "]" );
        str.append( "\n KeyPersistenceIntervalSeconds [" + this.getKeyPersistenceIntervalSeconds() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskCacheAttributes.java`
#### Snippet
```java
        str.append( "\n MaxKeySize [" + this.getMaxKeySize() + "]" );
        str.append( "\n MaxPurgatorySize [" + this.getMaxPurgatorySize() + "]" );
        str.append( "\n BlockSizeBytes [" + this.getBlockSizeBytes() + "]" );
        str.append( "\n KeyPersistenceIntervalSeconds [" + this.getKeyPersistenceIntervalSeconds() + "]" );
        str.append( "\n DiskLimitType [" + this.getDiskLimitType() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskCacheAttributes.java`
#### Snippet
```java
        str.append( "\n MaxPurgatorySize [" + this.getMaxPurgatorySize() + "]" );
        str.append( "\n BlockSizeBytes [" + this.getBlockSizeBytes() + "]" );
        str.append( "\n KeyPersistenceIntervalSeconds [" + this.getKeyPersistenceIntervalSeconds() + "]" );
        str.append( "\n DiskLimitType [" + this.getDiskLimitType() + "]" );
        return str.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskCacheAttributes.java`
#### Snippet
```java
        str.append( "\n BlockSizeBytes [" + this.getBlockSizeBytes() + "]" );
        str.append( "\n KeyPersistenceIntervalSeconds [" + this.getKeyPersistenceIntervalSeconds() + "]" );
        str.append( "\n DiskLimitType [" + this.getDiskLimitType() + "]" );
        return str.toString();
    }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDiskElementDescriptor.java`
#### Snippet
```java
        final StringBuilder buf = new StringBuilder();
        buf.append( "\nBlockDiskElementDescriptor" );
        buf.append( "\n key [" + this.getKey() + "]" );
        buf.append( "\n blocks [" );
        if ( this.getBlocks() != null )
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskElementDescriptor.java`
#### Snippet
```java
        final StringBuilder buf = new StringBuilder();
        buf.append( "[DED: " );
        buf.append( " pos = " + pos );
        buf.append( " len = " + len );
        buf.append( "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskElementDescriptor.java`
#### Snippet
```java
        buf.append( "[DED: " );
        buf.append( " pos = " + pos );
        buf.append( " len = " + len );
        buf.append( "]" );
        return buf.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCacheAttributes.java`
#### Snippet
```java
        final StringBuilder str = new StringBuilder();
        str.append( "IndexedDiskCacheAttributes " );
        str.append( "\n diskPath = " + super.getDiskPath() );
        str.append( "\n maxPurgatorySize   = " + super.getMaxPurgatorySize() );
        str.append( "\n maxKeySize  = " + maxKeySize );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCacheAttributes.java`
#### Snippet
```java
        str.append( "IndexedDiskCacheAttributes " );
        str.append( "\n diskPath = " + super.getDiskPath() );
        str.append( "\n maxPurgatorySize   = " + super.getMaxPurgatorySize() );
        str.append( "\n maxKeySize  = " + maxKeySize );
        str.append( "\n optimizeAtRemoveCount  = " + optimizeAtRemoveCount );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCacheAttributes.java`
#### Snippet
```java
        str.append( "\n diskPath = " + super.getDiskPath() );
        str.append( "\n maxPurgatorySize   = " + super.getMaxPurgatorySize() );
        str.append( "\n maxKeySize  = " + maxKeySize );
        str.append( "\n optimizeAtRemoveCount  = " + optimizeAtRemoveCount );
        str.append( "\n shutdownSpoolTimeLimit  = " + super.getShutdownSpoolTimeLimit() );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCacheAttributes.java`
#### Snippet
```java
        str.append( "\n maxPurgatorySize   = " + super.getMaxPurgatorySize() );
        str.append( "\n maxKeySize  = " + maxKeySize );
        str.append( "\n optimizeAtRemoveCount  = " + optimizeAtRemoveCount );
        str.append( "\n shutdownSpoolTimeLimit  = " + super.getShutdownSpoolTimeLimit() );
        str.append( "\n optimizeOnShutdown  = " + optimizeOnShutdown );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCacheAttributes.java`
#### Snippet
```java
        str.append( "\n maxKeySize  = " + maxKeySize );
        str.append( "\n optimizeAtRemoveCount  = " + optimizeAtRemoveCount );
        str.append( "\n shutdownSpoolTimeLimit  = " + super.getShutdownSpoolTimeLimit() );
        str.append( "\n optimizeOnShutdown  = " + optimizeOnShutdown );
        str.append( "\n clearDiskOnStartup  = " + clearDiskOnStartup );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCacheAttributes.java`
#### Snippet
```java
        str.append( "\n optimizeAtRemoveCount  = " + optimizeAtRemoveCount );
        str.append( "\n shutdownSpoolTimeLimit  = " + super.getShutdownSpoolTimeLimit() );
        str.append( "\n optimizeOnShutdown  = " + optimizeOnShutdown );
        str.append( "\n clearDiskOnStartup  = " + clearDiskOnStartup );
        return str.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/indexed/IndexedDiskCacheAttributes.java`
#### Snippet
```java
        str.append( "\n shutdownSpoolTimeLimit  = " + super.getShutdownSpoolTimeLimit() );
        str.append( "\n optimizeOnShutdown  = " + optimizeOnShutdown );
        str.append( "\n clearDiskOnStartup  = " + clearDiskOnStartup );
        return str.toString();
    }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
        final StringBuilder buf = new StringBuilder();
        buf.append("\nBlock Disk ");
        buf.append("\n  Filepath [" + filepath + "]");
        buf.append("\n  NumberOfBlocks [" + this.numberOfBlocks.get() + "]");
        buf.append("\n  BlockSizeBytes [" + this.blockSizeBytes + "]");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
        buf.append("\nBlock Disk ");
        buf.append("\n  Filepath [" + filepath + "]");
        buf.append("\n  NumberOfBlocks [" + this.numberOfBlocks.get() + "]");
        buf.append("\n  BlockSizeBytes [" + this.blockSizeBytes + "]");
        buf.append("\n  Put Bytes [" + this.putBytes + "]");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
        buf.append("\n  Filepath [" + filepath + "]");
        buf.append("\n  NumberOfBlocks [" + this.numberOfBlocks.get() + "]");
        buf.append("\n  BlockSizeBytes [" + this.blockSizeBytes + "]");
        buf.append("\n  Put Bytes [" + this.putBytes + "]");
        buf.append("\n  Put Count [" + this.putCount + "]");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
        buf.append("\n  NumberOfBlocks [" + this.numberOfBlocks.get() + "]");
        buf.append("\n  BlockSizeBytes [" + this.blockSizeBytes + "]");
        buf.append("\n  Put Bytes [" + this.putBytes + "]");
        buf.append("\n  Put Count [" + this.putCount + "]");
        buf.append("\n  Average Size [" + getAveragePutSizeBytes() + "]");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
        buf.append("\n  BlockSizeBytes [" + this.blockSizeBytes + "]");
        buf.append("\n  Put Bytes [" + this.putBytes + "]");
        buf.append("\n  Put Count [" + this.putCount + "]");
        buf.append("\n  Average Size [" + getAveragePutSizeBytes() + "]");
        buf.append("\n  Empty Blocks [" + this.getEmptyBlocks() + "]");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
        buf.append("\n  Put Bytes [" + this.putBytes + "]");
        buf.append("\n  Put Count [" + this.putCount + "]");
        buf.append("\n  Average Size [" + getAveragePutSizeBytes() + "]");
        buf.append("\n  Empty Blocks [" + this.getEmptyBlocks() + "]");
        try
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
        buf.append("\n  Put Count [" + this.putCount + "]");
        buf.append("\n  Average Size [" + getAveragePutSizeBytes() + "]");
        buf.append("\n  Empty Blocks [" + this.getEmptyBlocks() + "]");
        try
        {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/disk/block/BlockDisk.java`
#### Snippet
```java
        try
        {
            buf.append("\n  Length [" + length() + "]");
        }
        catch (final IOException e)
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/CommonRemoteCacheAttributes.java`
#### Snippet
```java
        if (this.location != null)
        {
            buf.append( "\n remoteHost = [" + this.location.getHost() + "]" );
            buf.append( "\n remotePort = [" + this.location.getPort() + "]" );
        }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/CommonRemoteCacheAttributes.java`
#### Snippet
```java
        {
            buf.append( "\n remoteHost = [" + this.location.getHost() + "]" );
            buf.append( "\n remotePort = [" + this.location.getPort() + "]" );
        }
        buf.append( "\n cacheName = [" + getCacheName() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/CommonRemoteCacheAttributes.java`
#### Snippet
```java
            buf.append( "\n remotePort = [" + this.location.getPort() + "]" );
        }
        buf.append( "\n cacheName = [" + getCacheName() + "]" );
        buf.append( "\n remoteType = [" + remoteType + "]" );
        buf.append( "\n removeUponRemotePut = [" + this.removeUponRemotePut + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/CommonRemoteCacheAttributes.java`
#### Snippet
```java
        }
        buf.append( "\n cacheName = [" + getCacheName() + "]" );
        buf.append( "\n remoteType = [" + remoteType + "]" );
        buf.append( "\n removeUponRemotePut = [" + this.removeUponRemotePut + "]" );
        buf.append( "\n getOnly = [" + getOnly + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/CommonRemoteCacheAttributes.java`
#### Snippet
```java
        buf.append( "\n cacheName = [" + getCacheName() + "]" );
        buf.append( "\n remoteType = [" + remoteType + "]" );
        buf.append( "\n removeUponRemotePut = [" + this.removeUponRemotePut + "]" );
        buf.append( "\n getOnly = [" + getOnly + "]" );
        return buf.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/CommonRemoteCacheAttributes.java`
#### Snippet
```java
        buf.append( "\n remoteType = [" + remoteType + "]" );
        buf.append( "\n removeUponRemotePut = [" + this.removeUponRemotePut + "]" );
        buf.append( "\n getOnly = [" + getOnly + "]" );
        return buf.toString();
    }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheAttributes.java`
#### Snippet
```java
    {
        final StringBuilder buf = new StringBuilder(super.toString());
        buf.append( "\n receive = [" + isReceive() + "]" );
        buf.append( "\n getTimeoutMillis = [" + getGetTimeoutMillis() + "]" );
        buf.append( "\n threadPoolName = [" + getThreadPoolName() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheAttributes.java`
#### Snippet
```java
        final StringBuilder buf = new StringBuilder(super.toString());
        buf.append( "\n receive = [" + isReceive() + "]" );
        buf.append( "\n getTimeoutMillis = [" + getGetTimeoutMillis() + "]" );
        buf.append( "\n threadPoolName = [" + getThreadPoolName() + "]" );
        buf.append( "\n localClusterConsistency = [" + isLocalClusterConsistency() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheAttributes.java`
#### Snippet
```java
        buf.append( "\n receive = [" + isReceive() + "]" );
        buf.append( "\n getTimeoutMillis = [" + getGetTimeoutMillis() + "]" );
        buf.append( "\n threadPoolName = [" + getThreadPoolName() + "]" );
        buf.append( "\n localClusterConsistency = [" + isLocalClusterConsistency() + "]" );
        buf.append( "\n zombieQueueMaxSize = [" + getZombieQueueMaxSize() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheAttributes.java`
#### Snippet
```java
        buf.append( "\n getTimeoutMillis = [" + getGetTimeoutMillis() + "]" );
        buf.append( "\n threadPoolName = [" + getThreadPoolName() + "]" );
        buf.append( "\n localClusterConsistency = [" + isLocalClusterConsistency() + "]" );
        buf.append( "\n zombieQueueMaxSize = [" + getZombieQueueMaxSize() + "]" );
        return buf.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/RemoteCacheAttributes.java`
#### Snippet
```java
        buf.append( "\n threadPoolName = [" + getThreadPoolName() + "]" );
        buf.append( "\n localClusterConsistency = [" + isLocalClusterConsistency() + "]" );
        buf.append( "\n zombieQueueMaxSize = [" + getZombieQueueMaxSize() + "]" );
        return buf.toString();
    }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheAttributes.java`
#### Snippet
```java
        final StringBuilder buf = new StringBuilder();
        buf.append( "\n RemoteHttpCacheAttributes" );
        buf.append( "\n maxConnectionsPerHost = [" + getMaxConnectionsPerHost() + "]" );
        buf.append( "\n socketTimeoutMillis = [" + getSocketTimeoutMillis() + "]" );
        buf.append( "\n httpVersion = [" + getHttpVersion() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheAttributes.java`
#### Snippet
```java
        buf.append( "\n RemoteHttpCacheAttributes" );
        buf.append( "\n maxConnectionsPerHost = [" + getMaxConnectionsPerHost() + "]" );
        buf.append( "\n socketTimeoutMillis = [" + getSocketTimeoutMillis() + "]" );
        buf.append( "\n httpVersion = [" + getHttpVersion() + "]" );
        buf.append( "\n connectionTimeoutMillis = [" + getConnectionTimeoutMillis() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheAttributes.java`
#### Snippet
```java
        buf.append( "\n maxConnectionsPerHost = [" + getMaxConnectionsPerHost() + "]" );
        buf.append( "\n socketTimeoutMillis = [" + getSocketTimeoutMillis() + "]" );
        buf.append( "\n httpVersion = [" + getHttpVersion() + "]" );
        buf.append( "\n connectionTimeoutMillis = [" + getConnectionTimeoutMillis() + "]" );
        buf.append( "\n includeCacheNameAsParameter = [" + isIncludeCacheNameAsParameter() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheAttributes.java`
#### Snippet
```java
        buf.append( "\n socketTimeoutMillis = [" + getSocketTimeoutMillis() + "]" );
        buf.append( "\n httpVersion = [" + getHttpVersion() + "]" );
        buf.append( "\n connectionTimeoutMillis = [" + getConnectionTimeoutMillis() + "]" );
        buf.append( "\n includeCacheNameAsParameter = [" + isIncludeCacheNameAsParameter() + "]" );
        buf.append( "\n includeKeysAndPatternsAsParameter = [" + isIncludeKeysAndPatternsAsParameter() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheAttributes.java`
#### Snippet
```java
        buf.append( "\n httpVersion = [" + getHttpVersion() + "]" );
        buf.append( "\n connectionTimeoutMillis = [" + getConnectionTimeoutMillis() + "]" );
        buf.append( "\n includeCacheNameAsParameter = [" + isIncludeCacheNameAsParameter() + "]" );
        buf.append( "\n includeKeysAndPatternsAsParameter = [" + isIncludeKeysAndPatternsAsParameter() + "]" );
        buf.append( "\n includeRequestTypeasAsParameter = [" + isIncludeRequestTypeasAsParameter() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheAttributes.java`
#### Snippet
```java
        buf.append( "\n connectionTimeoutMillis = [" + getConnectionTimeoutMillis() + "]" );
        buf.append( "\n includeCacheNameAsParameter = [" + isIncludeCacheNameAsParameter() + "]" );
        buf.append( "\n includeKeysAndPatternsAsParameter = [" + isIncludeKeysAndPatternsAsParameter() + "]" );
        buf.append( "\n includeRequestTypeasAsParameter = [" + isIncludeRequestTypeasAsParameter() + "]" );
        buf.append( "\n url = [" + getUrl() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheAttributes.java`
#### Snippet
```java
        buf.append( "\n includeCacheNameAsParameter = [" + isIncludeCacheNameAsParameter() + "]" );
        buf.append( "\n includeKeysAndPatternsAsParameter = [" + isIncludeKeysAndPatternsAsParameter() + "]" );
        buf.append( "\n includeRequestTypeasAsParameter = [" + isIncludeRequestTypeasAsParameter() + "]" );
        buf.append( "\n url = [" + getUrl() + "]" );
        buf.append( "\n remoteHttpClientClassName = [" + getRemoteHttpClientClassName() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheAttributes.java`
#### Snippet
```java
        buf.append( "\n includeKeysAndPatternsAsParameter = [" + isIncludeKeysAndPatternsAsParameter() + "]" );
        buf.append( "\n includeRequestTypeasAsParameter = [" + isIncludeRequestTypeasAsParameter() + "]" );
        buf.append( "\n url = [" + getUrl() + "]" );
        buf.append( "\n remoteHttpClientClassName = [" + getRemoteHttpClientClassName() + "]" );
        buf.append( super.toString() );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/client/RemoteHttpCacheAttributes.java`
#### Snippet
```java
        buf.append( "\n includeRequestTypeasAsParameter = [" + isIncludeRequestTypeasAsParameter() + "]" );
        buf.append( "\n url = [" + getUrl() + "]" );
        buf.append( "\n remoteHttpClientClassName = [" + getRemoteHttpClientClassName() + "]" );
        buf.append( super.toString() );
        return buf.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheServerAttributes.java`
#### Snippet
```java
        final StringBuilder buf = new StringBuilder();
        buf.append( "\nRemoteHttpCacheServiceAttributes" );
        buf.append( "\n cacheName = [" + this.getCacheName() + "]" );
        buf.append( "\n allowClusterGet = [" + this.isAllowClusterGet() + "]" );
        buf.append( "\n localClusterConsistency = [" + this.isLocalClusterConsistency() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheServerAttributes.java`
#### Snippet
```java
        buf.append( "\nRemoteHttpCacheServiceAttributes" );
        buf.append( "\n cacheName = [" + this.getCacheName() + "]" );
        buf.append( "\n allowClusterGet = [" + this.isAllowClusterGet() + "]" );
        buf.append( "\n localClusterConsistency = [" + this.isLocalClusterConsistency() + "]" );
        buf.append( "\n eventQueueType = [" + this.getEventQueueType() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheServerAttributes.java`
#### Snippet
```java
        buf.append( "\n cacheName = [" + this.getCacheName() + "]" );
        buf.append( "\n allowClusterGet = [" + this.isAllowClusterGet() + "]" );
        buf.append( "\n localClusterConsistency = [" + this.isLocalClusterConsistency() + "]" );
        buf.append( "\n eventQueueType = [" + this.getEventQueueType() + "]" );
        buf.append( "\n eventQueuePoolName = [" + this.getEventQueuePoolName() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheServerAttributes.java`
#### Snippet
```java
        buf.append( "\n allowClusterGet = [" + this.isAllowClusterGet() + "]" );
        buf.append( "\n localClusterConsistency = [" + this.isLocalClusterConsistency() + "]" );
        buf.append( "\n eventQueueType = [" + this.getEventQueueType() + "]" );
        buf.append( "\n eventQueuePoolName = [" + this.getEventQueuePoolName() + "]" );
        return buf.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/http/server/RemoteHttpCacheServerAttributes.java`
#### Snippet
```java
        buf.append( "\n localClusterConsistency = [" + this.isLocalClusterConsistency() + "]" );
        buf.append( "\n eventQueueType = [" + this.getEventQueueType() + "]" );
        buf.append( "\n eventQueuePoolName = [" + this.getEventQueuePoolName() + "]" );
        return buf.toString();
    }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/value/RemoteCacheResponse.java`
#### Snippet
```java
        final StringBuilder buf = new StringBuilder();
        buf.append( "\nRemoteHttpCacheResponse" );
        buf.append( "\n success [" + isSuccess() + "]" );
        buf.append( "\n payload [" + getPayload() + "]" );
        buf.append( "\n errorMessage [" + getErrorMessage() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/value/RemoteCacheResponse.java`
#### Snippet
```java
        buf.append( "\nRemoteHttpCacheResponse" );
        buf.append( "\n success [" + isSuccess() + "]" );
        buf.append( "\n payload [" + getPayload() + "]" );
        buf.append( "\n errorMessage [" + getErrorMessage() + "]" );
        return buf.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/value/RemoteCacheResponse.java`
#### Snippet
```java
        buf.append( "\n success [" + isSuccess() + "]" );
        buf.append( "\n payload [" + getPayload() + "]" );
        buf.append( "\n errorMessage [" + getErrorMessage() + "]" );
        return buf.toString();
    }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/value/RemoteCacheRequest.java`
#### Snippet
```java
        final StringBuilder buf = new StringBuilder();
        buf.append( "\nRemoteHttpCacheRequest" );
        buf.append( "\n requesterId [" + getRequesterId() + "]" );
        buf.append( "\n requestType [" + getRequestType() + "]" );
        buf.append( "\n cacheName [" + getCacheName() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/value/RemoteCacheRequest.java`
#### Snippet
```java
        buf.append( "\nRemoteHttpCacheRequest" );
        buf.append( "\n requesterId [" + getRequesterId() + "]" );
        buf.append( "\n requestType [" + getRequestType() + "]" );
        buf.append( "\n cacheName [" + getCacheName() + "]" );
        buf.append( "\n key [" + getKey() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/value/RemoteCacheRequest.java`
#### Snippet
```java
        buf.append( "\n requesterId [" + getRequesterId() + "]" );
        buf.append( "\n requestType [" + getRequestType() + "]" );
        buf.append( "\n cacheName [" + getCacheName() + "]" );
        buf.append( "\n key [" + getKey() + "]" );
        buf.append( "\n keySet [" + getKeySet() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/value/RemoteCacheRequest.java`
#### Snippet
```java
        buf.append( "\n requestType [" + getRequestType() + "]" );
        buf.append( "\n cacheName [" + getCacheName() + "]" );
        buf.append( "\n key [" + getKey() + "]" );
        buf.append( "\n keySet [" + getKeySet() + "]" );
        buf.append( "\n pattern [" + getPattern() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/value/RemoteCacheRequest.java`
#### Snippet
```java
        buf.append( "\n cacheName [" + getCacheName() + "]" );
        buf.append( "\n key [" + getKey() + "]" );
        buf.append( "\n keySet [" + getKeySet() + "]" );
        buf.append( "\n pattern [" + getPattern() + "]" );
        buf.append( "\n cacheElement [" + getCacheElement() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/value/RemoteCacheRequest.java`
#### Snippet
```java
        buf.append( "\n key [" + getKey() + "]" );
        buf.append( "\n keySet [" + getKeySet() + "]" );
        buf.append( "\n pattern [" + getPattern() + "]" );
        buf.append( "\n cacheElement [" + getCacheElement() + "]" );
        return buf.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/value/RemoteCacheRequest.java`
#### Snippet
```java
        buf.append( "\n keySet [" + getKeySet() + "]" );
        buf.append( "\n pattern [" + getPattern() + "]" );
        buf.append( "\n cacheElement [" + getCacheElement() + "]" );
        return buf.toString();
    }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServerAttributes.java`
#### Snippet
```java
    {
        final StringBuilder buf = new StringBuilder(super.toString());
        buf.append( "\n servicePort = [" + this.getServicePort() + "]" );
        buf.append( "\n allowClusterGet = [" + this.isAllowClusterGet() + "]" );
        buf.append( "\n configFileName = [" + this.getConfigFileName() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServerAttributes.java`
#### Snippet
```java
        final StringBuilder buf = new StringBuilder(super.toString());
        buf.append( "\n servicePort = [" + this.getServicePort() + "]" );
        buf.append( "\n allowClusterGet = [" + this.isAllowClusterGet() + "]" );
        buf.append( "\n configFileName = [" + this.getConfigFileName() + "]" );
        buf.append( "\n rmiSocketFactoryTimeoutMillis = [" + this.getRmiSocketFactoryTimeoutMillis() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServerAttributes.java`
#### Snippet
```java
        buf.append( "\n servicePort = [" + this.getServicePort() + "]" );
        buf.append( "\n allowClusterGet = [" + this.isAllowClusterGet() + "]" );
        buf.append( "\n configFileName = [" + this.getConfigFileName() + "]" );
        buf.append( "\n rmiSocketFactoryTimeoutMillis = [" + this.getRmiSocketFactoryTimeoutMillis() + "]" );
        buf.append( "\n useRegistryKeepAlive = [" + this.isUseRegistryKeepAlive() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServerAttributes.java`
#### Snippet
```java
        buf.append( "\n allowClusterGet = [" + this.isAllowClusterGet() + "]" );
        buf.append( "\n configFileName = [" + this.getConfigFileName() + "]" );
        buf.append( "\n rmiSocketFactoryTimeoutMillis = [" + this.getRmiSocketFactoryTimeoutMillis() + "]" );
        buf.append( "\n useRegistryKeepAlive = [" + this.isUseRegistryKeepAlive() + "]" );
        buf.append( "\n registryKeepAliveDelayMillis = [" + this.getRegistryKeepAliveDelayMillis() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServerAttributes.java`
#### Snippet
```java
        buf.append( "\n configFileName = [" + this.getConfigFileName() + "]" );
        buf.append( "\n rmiSocketFactoryTimeoutMillis = [" + this.getRmiSocketFactoryTimeoutMillis() + "]" );
        buf.append( "\n useRegistryKeepAlive = [" + this.isUseRegistryKeepAlive() + "]" );
        buf.append( "\n registryKeepAliveDelayMillis = [" + this.getRegistryKeepAliveDelayMillis() + "]" );
        buf.append( "\n eventQueueType = [" + this.getEventQueueType() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServerAttributes.java`
#### Snippet
```java
        buf.append( "\n rmiSocketFactoryTimeoutMillis = [" + this.getRmiSocketFactoryTimeoutMillis() + "]" );
        buf.append( "\n useRegistryKeepAlive = [" + this.isUseRegistryKeepAlive() + "]" );
        buf.append( "\n registryKeepAliveDelayMillis = [" + this.getRegistryKeepAliveDelayMillis() + "]" );
        buf.append( "\n eventQueueType = [" + this.getEventQueueType() + "]" );
        buf.append( "\n eventQueuePoolName = [" + this.getEventQueuePoolName() + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServerAttributes.java`
#### Snippet
```java
        buf.append( "\n useRegistryKeepAlive = [" + this.isUseRegistryKeepAlive() + "]" );
        buf.append( "\n registryKeepAliveDelayMillis = [" + this.getRegistryKeepAliveDelayMillis() + "]" );
        buf.append( "\n eventQueueType = [" + this.getEventQueueType() + "]" );
        buf.append( "\n eventQueuePoolName = [" + this.getEventQueuePoolName() + "]" );
        return buf.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/remote/server/RemoteCacheServerAttributes.java`
#### Snippet
```java
        buf.append( "\n registryKeepAliveDelayMillis = [" + this.getRegistryKeepAliveDelayMillis() + "]" );
        buf.append( "\n eventQueueType = [" + this.getEventQueueType() + "]" );
        buf.append( "\n eventQueuePoolName = [" + this.getEventQueuePoolName() + "]" );
        return buf.toString();
    }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCacheAttributes.java`
#### Snippet
```java
        //buf.append( "transmissionType=" + transmissionType + "\n" );
        //buf.append( "tcpServer=" + tcpServer + "\n" );
        buf.append( transmissionType.toString() + httpServer + udpMulticastAddr + String.valueOf( udpMulticastPort ) );
        return buf.toString();
    }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralElementDescriptor.java`
#### Snippet
```java
        final StringBuilder buf = new StringBuilder();
        buf.append( "\n LateralElementDescriptor " );
        buf.append( "\n command = [" + this.command + "]" );
        buf.append( "\n valHashCode = [" + this.valHashCode + "]" );
        buf.append( "\n ICacheElement = [" + this.ce + "]" );
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralElementDescriptor.java`
#### Snippet
```java
        buf.append( "\n LateralElementDescriptor " );
        buf.append( "\n command = [" + this.command + "]" );
        buf.append( "\n valHashCode = [" + this.valHashCode + "]" );
        buf.append( "\n ICacheElement = [" + this.ce + "]" );
        return buf.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralElementDescriptor.java`
#### Snippet
```java
        buf.append( "\n command = [" + this.command + "]" );
        buf.append( "\n valHashCode = [" + this.valHashCode + "]" );
        buf.append( "\n ICacheElement = [" + this.ce + "]" );
        return buf.toString();
    }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCacheNoWait.java`
#### Snippet
```java
        final StringBuilder buf = new StringBuilder();
        buf.append( " LateralCacheNoWait " );
        buf.append( " Status = " + this.getStatus() );
        buf.append( " cache = [" + cache.toString() + "]" );
        return buf.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCacheNoWait.java`
#### Snippet
```java
        buf.append( " LateralCacheNoWait " );
        buf.append( " Status = " + this.getStatus() );
        buf.append( " cache = [" + cache.toString() + "]" );
        return buf.toString();
    }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCache.java`
#### Snippet
```java
        final StringBuilder buf = new StringBuilder();
        buf.append( "\n LateralCache " );
        buf.append( "\n Cache Name [" + lateralCacheAttributes.getCacheName() + "]" );
        buf.append( "\n cattr =  [" + lateralCacheAttributes + "]" );
        return buf.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `commons-jcs-core/src/main/java/org/apache/commons/jcs3/auxiliary/lateral/LateralCache.java`
#### Snippet
```java
        buf.append( "\n LateralCache " );
        buf.append( "\n Cache Name [" + lateralCacheAttributes.getCacheName() + "]" );
        buf.append( "\n cattr =  [" + lateralCacheAttributes + "]" );
        return buf.toString();
    }
```

