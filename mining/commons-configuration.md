# commons-configuration 
 
# Bad smells
I found 118 bad smells with 6 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 48 | false |
| UNCHECKED_WARNING | 14 | false |
| JavadocLinkAsPlainText | 9 | false |
| RedundantTypeArguments | 7 | false |
| DataFlowIssue | 3 | false |
| UnnecessaryToStringCall | 3 | true |
| UnusedAssignment | 3 | false |
| ToArrayCallWithZeroLengthArrayArgument | 2 | true |
| RedundantOperationOnEmptyContainer | 2 | false |
| UnnecessaryCallToStringValueOf | 2 | false |
| RedundantCollectionOperation | 2 | false |
| DuplicatedCode | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| JavadocDeclaration | 2 | false |
| UnnecessaryContinue | 2 | false |
| UnnecessaryUnicodeEscape | 2 | false |
| StringOperationCanBeSimplified | 1 | false |
| UnnecessaryStringEscape | 1 | true |
| MismatchedJavadocCode | 1 | false |
| CollectionContainsUrl | 1 | false |
| RegExpSimplifiable | 1 | false |
| DanglingJavadoc | 1 | false |
| FieldCanBeLocal | 1 | false |
| IgnoreResultOfCall | 1 | false |
| AutoCloseableResource | 1 | false |
| RedundantCast | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| JavaReflectionInvocation | 1 | false |
| CopyConstructorMissesField | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[keys.size()\]'
in `src/main/java/org/apache/commons/configuration2/spring/ConfigurationPropertySource.java`
#### Snippet
```java
            keys.add(keysIterator.next());
        }
        return keys.toArray(new String[keys.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new BuilderParameters\[params.size()\]'
in `src/main/java/org/apache/commons/configuration2/builder/combined/BaseConfigurationBuilderProvider.java`
#### Snippet
```java
    protected void configureBuilder(final BasicConfigurationBuilder<? extends Configuration> builder, final ConfigurationDeclaration decl,
        final Collection<BuilderParameters> params) throws Exception {
        builder.configure(params.toArray(new BuilderParameters[params.size()]));
    }

```

## RuleId[id=RedundantOperationOnEmptyContainer]
### RedundantOperationOnEmptyContainer
Collection `new ArrayList`() is always empty
in `src/main/java/org/apache/commons/configuration2/JNDIConfiguration.java`
#### Snippet
```java
        } catch (final NameNotFoundException e) {
            // expected exception, no need to log it
            return new ArrayList<String>().iterator();
        } catch (final NamingException e) {
            fireError(ConfigurationErrorEvent.READ, ConfigurationErrorEvent.READ, null, null, e);
```

### RedundantOperationOnEmptyContainer
Collection `new ArrayList`() is always empty
in `src/main/java/org/apache/commons/configuration2/JNDIConfiguration.java`
#### Snippet
```java
        } catch (final NamingException e) {
            fireError(ConfigurationErrorEvent.READ, ConfigurationErrorEvent.READ, null, null, e);
            return new ArrayList<String>().iterator();
        }
    }
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'org.apache.commons.configuration2.builder.INIBuilderProperties' to 'T'
in `src/main/java/org/apache/commons/configuration2/builder/INIBuilderProperties.java`
#### Snippet
```java
    default T setSeparatorUsedInInput(final String separator) {
        // NoOp
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.commons.configuration2.builder.INIBuilderProperties' to 'T'
in `src/main/java/org/apache/commons/configuration2/builder/INIBuilderProperties.java`
#### Snippet
```java
    default T setCommentLeadingCharsUsedInInput(final String separator) {
        // NoOp
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Vector' to 'java.util.Vector'
in `src/main/java/org/apache/commons/configuration2/resolver/CatalogResolver.java`
#### Snippet
```java

            // This is safe because the catalog manager returns a vector of strings.
            final Vector<String> catalogs = catalogManager.getCatalogFiles();
            if (catalogs != null) {
                for (int count = 0; count < catalogs.size(); count++) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map\>' to 'java.util.Map'
in `src/main/java/org/apache/commons/configuration2/MapConfiguration.java`
#### Snippet
```java
     */
    public MapConfiguration(final Map<String, ?> map) {
        this.map = (Map<String, Object>) map;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `src/main/java/org/apache/commons/configuration2/MapConfiguration.java`
#### Snippet
```java
            // the value is added to the existing list
            // Note: This is problematic. See header comment!
            ((List<Object>) previousValue).add(value);
        } else {
            // the previous value is replaced by a list containing the previous value and the new value
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Enumeration' to 'java.util.Enumeration'
in `src/main/java/org/apache/commons/configuration2/web/ServletContextConfiguration.java`
#### Snippet
```java
        // According to the documentation of getInitParameterNames() the
        // enumeration is of type String.
        final Enumeration<String> en = context.getInitParameterNames();
        return Collections.list(en).iterator();
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.commons.configuration2.tree.QueryResult' to 'org.apache.commons.configuration2.tree.QueryResult'
in `src/main/java/org/apache/commons/configuration2/tree/xpath/XPathExpressionEngine.java`
#### Snippet
```java
     */
    private static <T> List<QueryResult<T>> convertResults(final List<?> results) {
        return results.stream().map(res -> (QueryResult<T>) createResult(res)).collect(Collectors.toList());
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.commons.configuration2.builder.PropertiesBuilderProperties' to 'T'
in `src/main/java/org/apache/commons/configuration2/builder/PropertiesBuilderProperties.java`
#### Snippet
```java
     */
    default T setIncludeListener(final ConfigurationConsumer<ConfigurationException> includeListener) {
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `src/main/java/org/apache/commons/configuration2/AbstractYAMLBasedConfiguration.java`
#### Snippet
```java
    private static List<ImmutableNode> constructHierarchy(final String key, final Object elem) {
        if (elem instanceof Map) {
            return parseMap((Map<String, Object>) elem, key);
        }
        if (elem instanceof Collection) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Collection'
in `src/main/java/org/apache/commons/configuration2/AbstractYAMLBasedConfiguration.java`
#### Snippet
```java
        }
        if (elem instanceof Collection) {
            return parseCollection((Collection<Object>) elem, key);
        }
        return Collections.singletonList(new ImmutableNode.Builder().name(key).value(elem).create());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `src/main/java/org/apache/commons/configuration2/web/ServletRequestConfiguration.java`
#### Snippet
```java
    protected Iterator<String> getKeysInternal() {
        // According to the documentation of getParameterMap(), keys are Strings.
        final Map<String, ?> parameterMap = request.getParameterMap();
        return parameterMap.keySet().iterator();
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Enumeration' to 'java.util.Enumeration'
in `src/main/java/org/apache/commons/configuration2/web/ServletConfiguration.java`
#### Snippet
```java
        // According to the documentation of getInitParameterNames() the
        // enumeration is of type String.
        final Enumeration<String> en = config.getInitParameterNames();
        return Collections.list(en).iterator();
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Enumeration' to 'java.util.Enumeration'
in `src/main/java/org/apache/commons/configuration2/web/ServletFilterConfiguration.java`
#### Snippet
```java
        // According to the documentation of getInitParameterNames() the
        // enumeration is of type String.
        final Enumeration<String> en = config.getInitParameterNames();
        return Collections.list(en).iterator();
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Collection'
in `src/main/java/org/apache/commons/configuration2/beanutils/BeanHelper.java`
#### Snippet
```java
                    if (prop instanceof Collection) {
                        final Collection<Object> beanCollection = createPropertyCollection(propName, defaultClass);
                        ((Collection<BeanDeclaration>) prop).forEach(elemDef -> beanCollection.add(createBean(elemDef)));
                        initProperty(bean, propName, beanCollection);
                    } else {
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `StringLookupFactory`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for file content, accessed using the prefix {@code "file"}.
     *
     * @see StringLookupFactory#fileStringLookup()
     * @since 2.4
     */
```

### JavadocReference
Cannot resolve symbol `fileStringLookup()`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for file content, accessed using the prefix {@code "file"}.
     *
     * @see StringLookupFactory#fileStringLookup()
     * @since 2.4
     */
```

### JavadocReference
Cannot resolve symbol `StringLookupFactory`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for XML content, accessed using the prefix {@code "xml"}.
     *
     * @see StringLookupFactory#xmlStringLookup()
     * @since 2.4
     */
```

### JavadocReference
Cannot resolve symbol `xmlStringLookup()`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for XML content, accessed using the prefix {@code "xml"}.
     *
     * @see StringLookupFactory#xmlStringLookup()
     * @since 2.4
     */
```

### JavadocReference
Cannot resolve symbol `StringLookupFactory`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for environment properties, accessed using the prefix {@code "env"}.
     *
     * @see StringLookupFactory#environmentVariableStringLookup()
     */
    ENVIRONMENT(StringLookupFactory.KEY_ENV, new StringLookupAdapter(StringLookupFactory.INSTANCE.environmentVariableStringLookup())),
```

### JavadocReference
Cannot resolve symbol `environmentVariableStringLookup()`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for environment properties, accessed using the prefix {@code "env"}.
     *
     * @see StringLookupFactory#environmentVariableStringLookup()
     */
    ENVIRONMENT(StringLookupFactory.KEY_ENV, new StringLookupAdapter(StringLookupFactory.INSTANCE.environmentVariableStringLookup())),
```

### JavadocReference
Cannot resolve symbol `StringLookupFactory`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for resource bundles, accessed using the prefix {@code "resourceBundle"}.
     *
     * @see StringLookupFactory#resourceBundleStringLookup()
     * @since 2.4
     */
```

### JavadocReference
Cannot resolve symbol `resourceBundleStringLookup()`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for resource bundles, accessed using the prefix {@code "resourceBundle"}.
     *
     * @see StringLookupFactory#resourceBundleStringLookup()
     * @since 2.4
     */
```

### JavadocReference
Cannot resolve symbol `StringLookupFactory`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for localhost information, accessed using the prefix {@code "localhost"}.
     *
     * @see StringLookupFactory#localHostStringLookup()
     * @since 2.4
     */
```

### JavadocReference
Cannot resolve symbol `localHostStringLookup()`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for localhost information, accessed using the prefix {@code "localhost"}.
     *
     * @see StringLookupFactory#localHostStringLookup()
     * @since 2.4
     */
```

### JavadocReference
Cannot resolve symbol `StringLookupFactory`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for system properties, accessed using the prefix {@code "sys"}.
     *
     * @see StringLookupFactory#systemPropertyStringLookup()
     */
    SYSTEM_PROPERTIES(StringLookupFactory.KEY_SYS, new StringLookupAdapter(StringLookupFactory.INSTANCE.systemPropertyStringLookup())),
```

### JavadocReference
Cannot resolve symbol `systemPropertyStringLookup()`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for system properties, accessed using the prefix {@code "sys"}.
     *
     * @see StringLookupFactory#systemPropertyStringLookup()
     */
    SYSTEM_PROPERTIES(StringLookupFactory.KEY_SYS, new StringLookupAdapter(StringLookupFactory.INSTANCE.systemPropertyStringLookup())),
```

### JavadocReference
Cannot resolve symbol `StringLookupFactory`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for properties, accessed using the prefix {@code "properties"}.
     *
     * @see StringLookupFactory#propertiesStringLookup()
     * @since 2.4
     */
```

### JavadocReference
Cannot resolve symbol `propertiesStringLookup()`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for properties, accessed using the prefix {@code "properties"}.
     *
     * @see StringLookupFactory#propertiesStringLookup()
     * @since 2.4
     */
```

### JavadocReference
Cannot resolve symbol `StringLookupFactory`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for scripts, accessed using the prefix {@code "script"}.
     *
     * @see StringLookupFactory#scriptStringLookup()
     * @since 2.4
     */
```

### JavadocReference
Cannot resolve symbol `scriptStringLookup()`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for scripts, accessed using the prefix {@code "script"}.
     *
     * @see StringLookupFactory#scriptStringLookup()
     * @since 2.4
     */
```

### JavadocReference
Cannot resolve symbol `StringLookupFactory`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for Java constants, accessed using the prefix {@code "const"}.
     *
     * @see StringLookupFactory#constantStringLookup()
     * @since 2.4
     */
```

### JavadocReference
Cannot resolve symbol `constantStringLookup()`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for Java constants, accessed using the prefix {@code "const"}.
     *
     * @see StringLookupFactory#constantStringLookup()
     * @since 2.4
     */
```

### JavadocReference
Cannot resolve symbol `StringLookupFactory`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for DNS, accessed using the prefix {@code "dns"}.
     *
     * @see StringLookupFactory#dnsStringLookup()
     * @since 2.6
     */
```

### JavadocReference
Cannot resolve symbol `dnsStringLookup()`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for DNS, accessed using the prefix {@code "dns"}.
     *
     * @see StringLookupFactory#dnsStringLookup()
     * @since 2.6
     */
```

### JavadocReference
Cannot resolve symbol `StringLookupFactory`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for URL encoding, accessed using the prefix {@code "urlEncoder"}.
     *
     * @see StringLookupFactory#urlEncoderStringLookup()
     * @since 2.4
     */
```

### JavadocReference
Cannot resolve symbol `urlEncoderStringLookup()`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for URL encoding, accessed using the prefix {@code "urlEncoder"}.
     *
     * @see StringLookupFactory#urlEncoderStringLookup()
     * @since 2.4
     */
```

### JavadocReference
Cannot resolve symbol `StringLookupFactory`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for Base64 decoding, accessed using the prefix {@code "base64Decoder"}.
     *
     * @see StringLookupFactory#base64DecoderStringLookup()
     * @since 2.4
     */
```

### JavadocReference
Cannot resolve symbol `base64DecoderStringLookup()`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for Base64 decoding, accessed using the prefix {@code "base64Decoder"}.
     *
     * @see StringLookupFactory#base64DecoderStringLookup()
     * @since 2.4
     */
```

### JavadocReference
Cannot resolve symbol `StringLookupFactory`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for Java platform information, accessed using the prefix {@code "java"}.
     *
     * @see StringLookupFactory#javaPlatformStringLookup()
     * @since 2.4
     */
```

### JavadocReference
Cannot resolve symbol `javaPlatformStringLookup()`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for Java platform information, accessed using the prefix {@code "java"}.
     *
     * @see StringLookupFactory#javaPlatformStringLookup()
     * @since 2.4
     */
```

### JavadocReference
Cannot resolve symbol `StringLookupFactory`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for URLs, accessed using the prefix {@code "url"}.
     *
     * @see StringLookupFactory#urlStringLookup()
     * @since 2.4
     */
```

### JavadocReference
Cannot resolve symbol `urlStringLookup()`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for URLs, accessed using the prefix {@code "url"}.
     *
     * @see StringLookupFactory#urlStringLookup()
     * @since 2.4
     */
```

### JavadocReference
Cannot resolve symbol `StringLookupFactory`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for URL decoding, accessed using the prefix {@code "urlDecoder"}.
     *
     * @see StringLookupFactory#urlDecoderStringLookup()
     * @since 2.4
     */
```

### JavadocReference
Cannot resolve symbol `urlDecoderStringLookup()`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for URL decoding, accessed using the prefix {@code "urlDecoder"}.
     *
     * @see StringLookupFactory#urlDecoderStringLookup()
     * @since 2.4
     */
```

### JavadocReference
Cannot resolve symbol `StringLookupFactory`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for the current date in a specified format, accessed using the prefix {@code "date"}.
     *
     * @see StringLookupFactory#dateStringLookup()
     * @since 2.4
     */
```

### JavadocReference
Cannot resolve symbol `dateStringLookup()`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for the current date in a specified format, accessed using the prefix {@code "date"}.
     *
     * @see StringLookupFactory#dateStringLookup()
     * @since 2.4
     */
```

### JavadocReference
Cannot resolve symbol `StringLookupFactory`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for Base64 encoding, accessed using the prefix {@code "base64Encoder"}.
     *
     * @see StringLookupFactory#base64EncoderStringLookup()
     * @since 2.4
     */
```

### JavadocReference
Cannot resolve symbol `base64EncoderStringLookup()`
in `src/main/java/org/apache/commons/configuration2/interpol/DefaultLookups.java`
#### Snippet
```java
     * The lookup for Base64 encoding, accessed using the prefix {@code "base64Encoder"}.
     *
     * @see StringLookupFactory#base64EncoderStringLookup()
     * @since 2.4
     */
```

### JavadocReference
Cannot resolve symbol `org.springframework.beans.factory.FactoryBean`
in `src/main/java/org/apache/commons/configuration2/spring/ConfigurationPropertiesFactoryBean.java`
#### Snippet
```java

    /**
     * @see org.springframework.beans.factory.FactoryBean#getObject()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getObject()`
in `src/main/java/org/apache/commons/configuration2/spring/ConfigurationPropertiesFactoryBean.java`
#### Snippet
```java

    /**
     * @see org.springframework.beans.factory.FactoryBean#getObject()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.springframework.beans.factory.FactoryBean`
in `src/main/java/org/apache/commons/configuration2/spring/ConfigurationPropertiesFactoryBean.java`
#### Snippet
```java

    /**
     * @see org.springframework.beans.factory.FactoryBean#isSingleton()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `isSingleton()`
in `src/main/java/org/apache/commons/configuration2/spring/ConfigurationPropertiesFactoryBean.java`
#### Snippet
```java

    /**
     * @see org.springframework.beans.factory.FactoryBean#isSingleton()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.springframework.core.io.support.PropertiesLoaderSupport`
in `src/main/java/org/apache/commons/configuration2/spring/ConfigurationPropertiesFactoryBean.java`
#### Snippet
```java
 *
 * @see java.util.Properties
 * @see org.springframework.core.io.support.PropertiesLoaderSupport
 */
public class ConfigurationPropertiesFactoryBean implements InitializingBean, FactoryBean<Properties> {
```

### JavadocReference
Symbol `throwExceptionOnMissing` is inaccessible from here
in `src/main/java/org/apache/commons/configuration2/spring/ConfigurationPropertiesFactoryBean.java`
#### Snippet
```java
    private Resource[] locations;

    /** @see org.apache.commons.configuration2.AbstractConfiguration#throwExceptionOnMissing **/
    private boolean throwExceptionOnMissing = true;

```

### JavadocReference
Cannot resolve symbol `org.springframework.beans.factory.FactoryBean`
in `src/main/java/org/apache/commons/configuration2/spring/ConfigurationPropertiesFactoryBean.java`
#### Snippet
```java

    /**
     * @see org.springframework.beans.factory.FactoryBean#getObjectType()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `getObjectType()`
in `src/main/java/org/apache/commons/configuration2/spring/ConfigurationPropertiesFactoryBean.java`
#### Snippet
```java

    /**
     * @see org.springframework.beans.factory.FactoryBean#getObjectType()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.springframework.beans.factory.InitializingBean`
in `src/main/java/org/apache/commons/configuration2/spring/ConfigurationPropertiesFactoryBean.java`
#### Snippet
```java

    /**
     * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `afterPropertiesSet()`
in `src/main/java/org/apache/commons/configuration2/spring/ConfigurationPropertiesFactoryBean.java`
#### Snippet
```java

    /**
     * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `StringLookup`
in `src/main/java/org/apache/commons/configuration2/interpol/StringLookupAdapter.java`
#### Snippet
```java

/**
 * Wraps an Apache Commons Text {@link StringLookup} as an Apache Commons Configuration {@link Lookup}.
 *
 * @since 2.4
```

### JavadocReference
Cannot resolve symbol `ParseException`
in `src/main/java/org/apache/commons/configuration2/plist/PropertyListConfiguration.java`
#### Snippet
```java
     * @param s the string with the date to be parsed
     * @return the parsed date
     * @throws ParseException if an error occurred while parsing the string
     */
    static Date parseDate(final String s) throws ParseException {
```

### JavadocReference
Cannot resolve symbol `ParseException`
in `src/main/java/org/apache/commons/configuration2/plist/PropertyListConfiguration.java`
#### Snippet
```java
         * @param cal the calendar where to store the result
         * @return the length of the processed component
         * @throws ParseException if the component cannot be extracted
         */
        public abstract int parseComponent(String s, int index, Calendar cal) throws ParseException;
```

### JavadocReference
Cannot resolve symbol `ParseException`
in `src/main/java/org/apache/commons/configuration2/plist/PropertyListConfiguration.java`
#### Snippet
```java
         * @param index the current index
         * @param length the minimum length after the index
         * @throws ParseException if the string is too short
         */
        protected void checkLength(final String s, final int index, final int length) throws ParseException {
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/configuration2/PropertiesConfiguration.java`
#### Snippet
```java
                        unicode.setLength(0);
                        inUnicode = false;
                        hadSlash = false;
                    } catch (final NumberFormatException nfe) {
                        throw new ConfigurationRuntimeException("Unable to parse unicode value: " + unicode, nfe);
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/configuration2/tree/DefaultConfigurationKey.java`
#### Snippet
```java
                }
            } catch (final NumberFormatException nfe) {
                result = false;
            }

```

### DataFlowIssue
Argument `array` might be null
in `src/main/java/org/apache/commons/configuration2/plist/XMLPropertyListConfiguration.java`
#### Snippet
```java
                } else if ("array".equals(qName)) {
                    final ArrayNodeBuilder array = (ArrayNodeBuilder) pop();
                    peekNE().addList(array);
                }

```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary string length argument
in `src/main/java/org/apache/commons/configuration2/tree/xpath/XPathExpressionEngine.java`
#### Snippet
```java
     */
    private <T> String generateKeyForAdd(final T root, final String key, final NodeHandler<T> handler) {
        int pos = key.lastIndexOf(PATH_DELIMITER, key.length());

        while (pos >= 0) {
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/main/java/org/apache/commons/configuration2/PropertiesConfiguration.java`
#### Snippet
```java
     * {@code java.util.Properties} escapes these characters when writing out a properties file.
     */
    private static final String UNESCAPE_CHARACTERS = ":#=!\\\'\"";

    /**
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/commons/configuration2/event/Event.java`
#### Snippet
```java
     */
    protected void appendPropertyRepresentation(final StringBuilder buf, final String property, final Object value) {
        buf.append(String.format(FMT_PROPERTY, property, String.valueOf(value)));
    }
}
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/commons/configuration2/AbstractConfiguration.java`
#### Snippet
```java
        } catch (final ConversionException cex) {
            // improve error message
            throw new ConversionException(String.format("Key '%s' cannot be converted to class %s. Value is: '%s'.", key, cls.getName(), String.valueOf(value)),
                cex.getCause());
        }
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
`iterator` can be replaced with 'Collections.emptyIterator()'
in `src/main/java/org/apache/commons/configuration2/JNDIConfiguration.java`
#### Snippet
```java
        } catch (final NameNotFoundException e) {
            // expected exception, no need to log it
            return new ArrayList<String>().iterator();
        } catch (final NamingException e) {
            fireError(ConfigurationErrorEvent.READ, ConfigurationErrorEvent.READ, null, null, e);
```

### RedundantCollectionOperation
`iterator` can be replaced with 'Collections.emptyIterator()'
in `src/main/java/org/apache/commons/configuration2/JNDIConfiguration.java`
#### Snippet
```java
        } catch (final NamingException e) {
            fireError(ConfigurationErrorEvent.READ, ConfigurationErrorEvent.READ, null, null, e);
            return new ArrayList<String>().iterator();
        }
    }
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/configuration2/StrictConfigurationComparator.java`
#### Snippet
```java
        for (final Iterator<String> keys = a.getKeys(); keys.hasNext();) {
            final String key = keys.next();
            final Object value = a.getProperty(key);
            if (!value.equals(b.getProperty(key))) {
                return false;
            }
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/configuration2/convert/DefaultListDelimiterHandler.java`
#### Snippet
```java
            final char c = s.charAt(i);
            if (inEscape) {
                // last character was the escape marker
                // can current character be escaped?
                if (c != getDelimiter() && c != ESCAPE) {
                    // no, also add escape character
                    token.append(ESCAPE);
                }
                token.append(c);
                inEscape = false;
            } else if (c == getDelimiter()) {
                // found a list delimiter -> add token and
                // reset buffer
                String t = token.toString();
                if (trim) {
                    t = t.trim();
                }
                list.add(t);
                token = new StringBuilder();
            } else if (c == ESCAPE) {
                // potentially escape next character
                inEscape = true;
            } else {
                token.append(c);
            }
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return list but the return type is set
in `src/main/java/org/apache/commons/configuration2/AbstractHierarchicalConfiguration.java`
#### Snippet
```java
         * Gets the list with all defined keys.
         *
         * @return the list with the defined keys
         */
        public Set<String> getKeyList() {
```

## RuleId[id=CollectionContainsUrl]
### CollectionContainsUrl
Map `registeredEntities` may contain URL objects
in `src/main/java/org/apache/commons/configuration2/resolver/DefaultEntityResolver.java`
#### Snippet
```java
public class DefaultEntityResolver implements EntityResolver, EntityRegistry {
    /** Stores a map with the registered public IDs. */
    private final Map<String, URL> registeredEntities = new HashMap<>();

    /**
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[\\S&&[^\\\\missingValue]]` can be simplified to '\\S\&\&\[\^\\\\missingValue\]'
in `src/main/java/org/apache/commons/configuration2/PropertiesConfiguration.java`
#### Snippet
```java
        /** The regular expression to parse the key and the value of a property. */
        private static final Pattern PROPERTY_PATTERN = Pattern
            .compile("(([\\S&&[^\\\\" + new String(SEPARATORS) + "]]|\\\\.)*)(\\s*(\\s+|[" + new String(SEPARATORS) + "])\\s*)?(.*)");

        /** Constant for the index of the group for the key. */
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder buf` can be replaced with 'String'
in `src/main/java/org/apache/commons/configuration2/DatabaseConfiguration.java`
#### Snippet
```java
            final String statement;
            if (nameCol && configurationNameColumn != null) {
                final StringBuilder buf = new StringBuilder(sql);
                buf.append(" AND ").append(configurationNameColumn).append("=?");
                statement = buf.toString();
```

### StringBufferReplaceableByString
`StringBuilder buf` can be replaced with 'String'
in `src/main/java/org/apache/commons/configuration2/tree/xpath/XPathExpressionEngine.java`
#### Snippet
```java
            final String keyExisting = key.substring(0, pos);
            if (!query(root, keyExisting, handler).isEmpty()) {
                final StringBuilder buf = new StringBuilder(key.length() + 1);
                buf.append(keyExisting).append(SPACE);
                buf.append(key.substring(pos + 1));
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/configuration2/tree/TreeUtils.java`
#### Snippet
```java
        result.getAttributes().forEach((k, v) -> buffer.append(' ').append(k).append("='").append(v).append("'"));
        buffer.append(">");
        stream.print(buffer.toString());
        if (result.getValue() != null) {
            stream.print(result.getValue());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/configuration2/plist/XMLPropertyListConfiguration.java`
#### Snippet
```java
        } else if (value instanceof Number) {
            if (value instanceof Double || value instanceof Float || value instanceof BigDecimal) {
                out.println(padding + "<real>" + value.toString() + "</real>");
            } else {
                out.println(padding + "<integer>" + value.toString() + "</integer>");
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/configuration2/plist/XMLPropertyListConfiguration.java`
#### Snippet
```java
                out.println(padding + "<real>" + value.toString() + "</real>");
            } else {
                out.println(padding + "<integer>" + value.toString() + "</integer>");
            }
        } else if (value instanceof Boolean) {
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/commons/configuration2/XMLPropertiesConfiguration.java`
#### Snippet
```java
        @Override
        public void characters(final char[] chars, final int start, final int length) {
            /**
             * We're currently processing an element. All character data from now until the next endElement() call will be the data
             * for this element.
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/commons/configuration2/tree/ReferenceTracker.java`
#### Snippet
```java
     */
    public ReferenceTracker() {
        this(Collections.<ImmutableNode, Object>emptyMap(), Collections.emptyList());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/commons/configuration2/tree/ModelTransaction.java`
#### Snippet
```java
         */
        private Map<ImmutableNode, ImmutableNode> fetchReplacementMap() {
            return nodesToReplace != null ? nodesToReplace : Collections.<ImmutableNode, ImmutableNode>emptyMap();
        }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/commons/configuration2/tree/ModelTransaction.java`
#### Snippet
```java
         */
        private Set<ImmutableNode> fetchRemovalSet() {
            return nodesToRemove != null ? nodesToRemove : Collections.<ImmutableNode>emptySet();
        }
    }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/commons/configuration2/tree/InMemoryNodeModel.java`
#### Snippet
```java
     */
    private TreeData createTreeDataForRootAndTracker(final ImmutableNode root, final NodeTracker newTracker) {
        return new TreeData(root, createParentMapping(root), Collections.<ImmutableNode, ImmutableNode>emptyMap(), newTracker, new ReferenceTracker());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/commons/configuration2/tree/InMemoryNodeModel.java`
#### Snippet
```java
     * A dummy node handler instance used in operations which require only a limited functionality.
     */
    private static final NodeHandler<ImmutableNode> DUMMY_HANDLER = new TreeData(null, Collections.<ImmutableNode, ImmutableNode>emptyMap(),
        Collections.<ImmutableNode, ImmutableNode>emptyMap(), null, new ReferenceTracker());

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/commons/configuration2/tree/InMemoryNodeModel.java`
#### Snippet
```java
     */
    private static final NodeHandler<ImmutableNode> DUMMY_HANDLER = new TreeData(null, Collections.<ImmutableNode, ImmutableNode>emptyMap(),
        Collections.<ImmutableNode, ImmutableNode>emptyMap(), null, new ReferenceTracker());

    /** Stores information about the current nodes structure. */
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/commons/configuration2/tree/NodeTracker.java`
#### Snippet
```java
     */
    public NodeTracker() {
        this(Collections.<NodeSelector, TrackedNodeData>emptyMap());
    }

```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/configuration2/io/FileUtils.java`
#### Snippet
```java
/**
 * This class is a subset of org.apache.commons.io.FileUtils, git-svn-id:
 * https://svn.apache.org/repos/asf/commons/proper/io/trunk@1423916 13f79535-47bb-0310-9956-ffa450edef68. The subset is
 * determined by {@link FileLocatorUtils}. The copied constants and methods are <em>literally</em> copied.<br />
 *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/configuration2/PropertiesConfiguration.java`
#### Snippet
```java

    /**
     * The default encoding (ISO-8859-1 as specified by http://java.sun.com/j2se/1.5.0/docs/api/java/util/Properties.html)
     */
    public static final String DEFAULT_ENCODING = "ISO-8859-1";
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/configuration2/io/FileLocatorUtils.java`
#### Snippet
```java

    /**
     * Return the path without the file name, for example http://xyz.net/foo/bar.xml results in http://xyz.net/foo/
     *
     * @param url the URL from which to extract the path
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/configuration2/io/FileLocatorUtils.java`
#### Snippet
```java

    /**
     * Return the path without the file name, for example http://xyz.net/foo/bar.xml results in http://xyz.net/foo/
     *
     * @param url the URL from which to extract the path
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/configuration2/XMLPropertiesConfiguration.java`
#### Snippet
```java
    /**
     * Parses a DOM element containing the properties. The DOM element has to follow the XML properties format introduced in
     * Java 5.0, see http://java.sun.com/j2se/1.5.0/docs/api/java/util/Properties.html
     *
     * @param element The DOM element
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/configuration2/XMLPropertiesConfiguration.java`
#### Snippet
```java
public class XMLPropertiesConfiguration extends BaseConfiguration implements FileBasedConfiguration, FileLocatorAware {
    /**
     * The default encoding (UTF-8 as specified by http://java.sun.com/j2se/1.5.0/docs/api/java/util/Properties.html)
     */
    public static final String DEFAULT_ENCODING = "UTF-8";
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/configuration2/XMLPropertiesConfiguration.java`
#### Snippet
```java
/**
 * This configuration implements the XML properties format introduced in Java 5.0, see
 * http://java.sun.com/j2se/1.5.0/docs/api/java/util/Properties.html. An XML properties file looks like this:
 *
 * <pre>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/configuration2/XMLPropertiesConfiguration.java`
#### Snippet
```java
 * <pre>
 * &lt;?xml version="1.0"?&gt;
 * &lt;!DOCTYPE properties SYSTEM "http://java.sun.com/dtd/properties.dtd"&gt;
 * &lt;properties&gt;
 *   &lt;comment&gt;Description of the property list&lt;/comment&gt;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/configuration2/plist/XMLPropertyListConfiguration.java`
#### Snippet
```java

/**
 * Property list file (plist) in XML FORMAT as used by Mac OS X (http://www.apple.com/DTDs/PropertyList-1.0.dtd). This
 * configuration doesn't support the binary FORMAT used in OS X 10.4.
 *
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/configuration2/io/VFSFileSystem.java`
#### Snippet
```java
    private static class VFSURLStreamHandler extends URLStreamHandler {
        /** The Protocol used */
        private final String protocol;

        public VFSURLStreamHandler(final FileName file) {
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `InputStream.available()` is ignored
in `src/main/java/org/apache/commons/configuration2/io/DefaultFileSystem.java`
#### Snippet
```java
            try (InputStream in = url.openStream()) {
                // nothing
                in.available();
            }
            return url;
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'PreparedStatement' used without 'try'-with-resources statement
in `src/main/java/org/apache/commons/configuration2/DatabaseConfiguration.java`
#### Snippet
```java
         */
        protected ResultSet openResultSet(final String sql, final boolean nameCol, final Object... params) throws SQLException {
            return resultSet = initStatement(sql, nameCol, params).executeQuery();
        }

```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `value.toString()` to `Object` is redundant
in `src/main/java/org/apache/commons/configuration2/AbstractConfiguration.java`
#### Snippet
```java
            return Arrays.asList((Object[]) value);
        } else if (isScalarValue(value)) {
            return Collections.singletonList((Object) value.toString());
        } else {
            throw new ConversionException('\'' + key + "' doesn't map to a List object: " + value + ", a " + value.getClass().getName());
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Exception is not declared to be thrown by method handleConfigurationInvocation
in `src/main/java/org/apache/commons/configuration2/builder/BuilderConfigurationWrapperFactory.java`
#### Snippet
```java
         * @param args method arguments
         * @return the return value of the method
         * @throws Exception if an error occurs
         */
        private Object handleConfigurationInvocation(final Method method, final Object[] args) throws ReflectiveOperationException, ConfigurationException {
```

### JavadocDeclaration
Exception is not declared to be thrown by method createParameterObject
in `src/main/java/org/apache/commons/configuration2/builder/combined/BaseConfigurationBuilderProvider.java`
#### Snippet
```java
     * @param paramcls the parameter class
     * @return the newly created instance
     * @throws Exception if an error occurs
     */
    private static BuilderParameters createParameterObject(final String paramcls) throws ReflectiveOperationException {
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `childParameters` are queried, but never updated
in `src/main/java/org/apache/commons/configuration2/builder/combined/CombinedBuilderParametersImpl.java`
#### Snippet
```java

    /** A list with default parameters for child configuration sources. */
    private final Collection<BuilderParameters> childParameters;

    /** The manager for default handlers. */
```

## RuleId[id=JavaReflectionInvocation]
### JavaReflectionInvocation
Argument is not assignable to 'java.lang.String'
in `src/main/java/org/apache/commons/configuration2/convert/PropertyConverter.java`
#### Snippet
```java
        try {
            final Constructor<?> ctor = Class.forName(targetClassName).getConstructor(String.class);
            return ctor.newInstance(value);
        } catch (final Exception e) {
            throw new ConversionException("The value " + value + " can't be converted to an InternetAddress", e);
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `src/main/java/org/apache/commons/configuration2/resolver/CatalogResolver.java`
#### Snippet
```java
                    }
                    // try again!
                    continue;
                } finally {
                    try {
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `src/main/java/org/apache/commons/configuration2/io/VFSFileSystem.java`
#### Snippet
```java
                } catch (final Exception ex) {
                    // Ignore an incorrect property.
                    continue;
                }
            }
```

## RuleId[id=UnnecessaryUnicodeEscape]
### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0020` can be replaced with ' '
in `src/main/java/org/apache/commons/configuration2/PropertiesConfiguration.java`
#### Snippet
```java

        /**
         * Whether characters less than {@code \u0020} and characters greater than {@code \u007E} in property keys or values
         * should be escaped using Unicode escape sequences. Not necessary when e.g. writing as UTF-8.
         */
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u007E` can be replaced with '\~'
in `src/main/java/org/apache/commons/configuration2/PropertiesConfiguration.java`
#### Snippet
```java

        /**
         * Whether characters less than {@code \u0020} and characters greater than {@code \u007E} in property keys or values
         * should be escaped using Unicode escape sequences. Not necessary when e.g. writing as UTF-8.
         */
```

## RuleId[id=CopyConstructorMissesField]
### CopyConstructorMissesField
Copy constructor does not copy fields 'globalSeparator', 'lineSeparator' and 'forceSingleLine'
in `src/main/java/org/apache/commons/configuration2/PropertiesConfigurationLayout.java`
#### Snippet
```java
     * @param c the layout object to be copied
     */
    public PropertiesConfigurationLayout(final PropertiesConfigurationLayout c) {
        loadCounter = new AtomicInteger();
        layoutData = new LinkedHashMap<>();
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `msg` initializer `"Unable to monitor " + getFileHandler().getURL().toString()` is redundant
in `src/main/java/org/apache/commons/configuration2/reloading/VFSFileHandlerReloadingDetector.java`
#### Snippet
```java
            return fsManager.resolveFile(uri);
        } catch (final FileSystemException fse) {
            final String msg = "Unable to monitor " + getFileHandler().getURL().toString();
            log.error(msg);
            throw new ConfigurationRuntimeException(msg, fse);
```

### UnusedAssignment
The value `null` assigned to `inputStream` is never used
in `src/main/java/org/apache/commons/configuration2/resolver/CatalogResolver.java`
#### Snippet
```java
                    } catch (final IOException ioe) {
                        // Ignore the exception.
                        inputStream = null;
                    }
                }
```

### UnusedAssignment
Variable `modifiedKey` initializer `null` is redundant
in `src/main/java/org/apache/commons/configuration2/SubsetConfiguration.java`
#### Snippet
```java
            throw new IllegalArgumentException("The parent key '" + key + "' is not in the subset.");
        }
        String modifiedKey = null;
        if (key.length() == prefix.length()) {
            modifiedKey = "";
```

