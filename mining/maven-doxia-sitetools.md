# maven-doxia-sitetools 
 
# Bad smells
I found 94 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=UnnecessaryFullyQualifiedName] | 37 | false |
| RuleId[ruleID=ReturnNull] | 15 | false |
| RuleId[ruleID=IgnoreResultOfCall] | 9 | false |
| RuleId[ruleID=AssignmentToMethodParameter] | 5 | false |
| RuleId[ruleID=DataFlowIssue] | 4 | false |
| RuleId[ruleID=ConstantValue] | 4 | false |
| RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern] | 3 | false |
| RuleId[ruleID=SizeReplaceableByIsEmpty] | 3 | true |
| RuleId[ruleID=StringOperationCanBeSimplified] | 2 | false |
| RuleId[ruleID=UnusedAssignment] | 2 | false |
| RuleId[ruleID=UtilityClassWithoutPrivateConstructor] | 1 | false |
| RuleId[ruleID=UnnecessarySuperQualifier] | 1 | false |
| RuleId[ruleID=DeprecatedIsStillUsed] | 1 | false |
| RuleId[ruleID=RedundantCollectionOperation] | 1 | false |
| RuleId[ruleID=HtmlWrongAttributeValue] | 1 | false |
| RuleId[ruleID=BoundedWildcard] | 1 | false |
| RuleId[ruleID=UseBulkOperation] | 1 | false |
| RuleId[ruleID=StringEqualsEmptyString] | 1 | false |
| RuleId[ruleID=RedundantSuppression] | 1 | false |
| RuleId[ruleID=UnnecessaryInitCause] | 1 | false |
## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `DecorationUtils` has only 'static' members, and lacks a 'private' constructor
in `doxia-decoration-model/src/main/java/org/apache/maven/doxia/site/decoration/DecorationUtils.java`
#### Snippet
```java
 * @since 1.7
 */
public class DecorationUtils
{
    public static boolean isLink( String href )
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java
                StringWriter sw = new StringWriter();
                template.merge( context, sw );
                writer.write( sw.toString().replaceAll( "\r?\n", SystemUtils.LINE_SEPARATOR ) );
            }
            catch ( VelocityException ve )
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java

        // strip any leading slashes if its a windows path
        if ( toPath.matches( "^\\[a-zA-Z]:" ) )
        {
            toPath = toPath.substring( 1 );
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
            toPath = toPath.substring( 1 );
        }
        if ( fromPath.matches( "^\\[a-zA-Z]:" ) )
        {
            fromPath = fromPath.substring( 1 );
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/sink/SiteRendererSink.java`
#### Snippet
```java

        /* the template is expected to have used the main tag, which can be used only once */
        super.contentStack.push( HtmlMarkup.MAIN );
    }

```

## RuleId[ruleID=DataFlowIssue]
### RuleId[ruleID=DataFlowIssue]
Argument `getNormalizedPath( to )` might be null
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
            try
            {
                toUrl = new File( getNormalizedPath( to ) ).toURI().toURL();
            }
            catch ( MalformedURLException e1 )
```

### RuleId[ruleID=DataFlowIssue]
Argument `getNormalizedPath( from )` might be null
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
            try
            {
                fromUrl = new File( getNormalizedPath( from ) ).toURI().toURL();
            }
            catch ( MalformedURLException e1 )
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getParentFile` may produce `NullPointerException`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
                // extrapolate parent project site directory
                String siteRelativePath = getRelativeFilePath( project.getBasedir().getAbsolutePath(),
                                                               siteDescriptor.getParentFile().getAbsolutePath() );

                parentSiteDirectory = new File( parentProject.getBasedir(), siteRelativePath );
```

### RuleId[ruleID=DataFlowIssue]
Argument `siteRelativePath` might be null
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
                                                               siteDescriptor.getParentFile().getAbsolutePath() );

                parentSiteDirectory = new File( parentProject.getBasedir(), siteRelativePath );
                // notice: using same siteRelativePath for parent as current project; may be wrong if site plugin
                // has different configuration. But this is a rare case (this only has impact if parent is from reactor)
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/Renderer.java`
#### Snippet
```java
     * @return a SiteRenderingContext.
     * @throws RendererException if it bombs.
     * @throws java.io.IOException if it bombs.
     * @since 1.7.3 was previously with skin as File instead of Artifact
     */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.net` is unnecessary and can be removed
in `doxia-decoration-model/src/main/java/org/apache/maven/doxia/site/decoration/inheritance/URIPathDescriptor.java`
#### Snippet
```java
     *
     * @return the resolved link. This is equivalent to calling
     *      {@link #getBaseURI()}.{@link URI#resolve(java.net.URI) resolve}( {@link #getLink()} ).
     */
    public URI resolveLink()
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.net` is unnecessary and can be removed
in `doxia-decoration-model/src/main/java/org/apache/maven/doxia/site/decoration/inheritance/URIPathDescriptor.java`
#### Snippet
```java
     * The original link is returned if either
     *      link is relative;
     *      or link and base do not share the {@link #sameSite(java.net.URI) same site}.
     *
     * @return the link as a relative URI.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.net` is unnecessary and can be removed
in `doxia-decoration-model/src/main/java/org/apache/maven/doxia/site/decoration/inheritance/URIPathDescriptor.java`
#### Snippet
```java
     *      or newBase is not parsable as a URI,
     *      or newBase and this {@link #getBaseURI()} do not share the
     *      {@link #sameSite(java.net.URI) same site}.
     *
     * @param newBase the new base URI. Has to be parsable as a URI.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.maven.doxia.siterenderer` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DocumentRenderer.java`
#### Snippet
```java
     * @param siteRenderer the site renderer to merge document content to.
     * @param siteRenderingContext the site rendering context.
     * @throws org.apache.maven.doxia.siterenderer.RendererException if it bombs.
     * @throws java.io.FileNotFoundException if it bombs.
     * @throws java.io.UnsupportedEncodingException if it bombs.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DocumentRenderer.java`
#### Snippet
```java
     * @param siteRenderingContext the site rendering context.
     * @throws org.apache.maven.doxia.siterenderer.RendererException if it bombs.
     * @throws java.io.FileNotFoundException if it bombs.
     * @throws java.io.UnsupportedEncodingException if it bombs.
     */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DocumentRenderer.java`
#### Snippet
```java
     * @throws org.apache.maven.doxia.siterenderer.RendererException if it bombs.
     * @throws java.io.FileNotFoundException if it bombs.
     * @throws java.io.UnsupportedEncodingException if it bombs.
     */
    void renderDocument( Writer writer, Renderer siteRenderer, SiteRenderingContext siteRenderingContext )
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/RenderingContext.java`
#### Snippet
```java
     * <p>Getter for the field <code>inputName</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getInputName()
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/RenderingContext.java`
#### Snippet
```java
     * <p>getAttribute.</p>
     *
     * @param key a {@link java.lang.String} object.
     * @return a {@link java.lang.String} object.
     */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/RenderingContext.java`
#### Snippet
```java
     *
     * @param key a {@link java.lang.String} object.
     * @return a {@link java.lang.String} object.
     */
    public String getAttribute( String key )
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/RenderingContext.java`
#### Snippet
```java
     * <p>Getter for the field <code>basedir</code>.</p>
     *
     * @return a {@link java.io.File} object.
     */
    public File getBasedir()
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/RenderingContext.java`
#### Snippet
```java
     * <p>setAttribute.</p>
     *
     * @param key a {@link java.lang.String} object.
     * @param value a {@link java.lang.String} object.
     */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/RenderingContext.java`
#### Snippet
```java
     *
     * @param key a {@link java.lang.String} object.
     * @param value a {@link java.lang.String} object.
     */
    public void setAttribute( String key, String value )
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.maven.doxia.module.xhtml5` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/sink/SiteRendererSink.java`
#### Snippet
```java
     *
     * Reset text buffer, since text content before title mustn't be in title.
     * @see org.apache.maven.doxia.module.xhtml5.Xhtml5Sink#title()
     */
    @Override
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.maven.doxia.module.xhtml5` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/sink/SiteRendererSink.java`
#### Snippet
```java
     *
     * Do nothing.
     * @see org.apache.maven.doxia.module.xhtml5.Xhtml5Sink#body()
     */
    @Override
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.maven.doxia.module.xhtml5` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/sink/SiteRendererSink.java`
#### Snippet
```java
     *
     * Do nothing.
     * @see org.apache.maven.doxia.module.xhtml5.Xhtml5Sink#body_()
     */
    @Override
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/SiteRenderingContext.java`
#### Snippet
```java
     * <p>Getter for the field <code>templateName</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getTemplateName()
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/SiteRenderingContext.java`
#### Snippet
```java
     * <p>Setter for the field <code>defaultWindowTitle</code>.</p>
     *
     * @param defaultWindowTitle a {@link java.lang.String} object.
     */
    public void setDefaultWindowTitle( String defaultWindowTitle )
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/SiteRenderingContext.java`
#### Snippet
```java
     * <p>Getter for the field <code>templateClassLoader</code>.</p>
     *
     * @return a {@link java.lang.ClassLoader} object.
     */
    public ClassLoader getTemplateClassLoader()
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/SiteRenderingContext.java`
#### Snippet
```java
     * <p>Setter for the field <code>inputEncoding</code>.</p>
     *
     * @param inputEncoding a {@link java.lang.String} object.
     */
    public void setInputEncoding( String inputEncoding )
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/SiteRenderingContext.java`
#### Snippet
```java
     * <p>Setter for the field <code>moduleExcludes</code>.</p>
     *
     * @param moduleExcludes a {@link java.util.Map} object.
     */
    public void setModuleExcludes( Map<String, String> moduleExcludes )
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/SiteRenderingContext.java`
#### Snippet
```java
     * <p>Setter for the field <code>locale</code>.</p>
     *
     * @param locale a {@link java.util.Locale} object.
     */
    public void setLocale( Locale locale )
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/SiteRenderingContext.java`
#### Snippet
```java
     * <p>Getter for the field <code>locale</code>.</p>
     *
     * @return a {@link java.util.Locale} object.
     */
    public Locale getLocale()
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/SiteRenderingContext.java`
#### Snippet
```java
     * a list of locales available for this site context.</p>
     *
     * @return a {@link java.util.List} object with {@link java.util.Locale} objects.
     */
    public List<Locale> getSiteLocales()
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/SiteRenderingContext.java`
#### Snippet
```java
     * a list of locales available for this site context.</p>
     *
     * @return a {@link java.util.List} object with {@link java.util.Locale} objects.
     */
    public List<Locale> getSiteLocales()
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/SiteRenderingContext.java`
#### Snippet
```java
     * <p>Getter for the field <code>defaultWindowTitle</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getDefaultWindowTitle()
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/SiteRenderingContext.java`
#### Snippet
```java
     * <p>Getter for the field <code>outputEncoding</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getOutputEncoding()
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/SiteRenderingContext.java`
#### Snippet
```java
     * <p>Setter for the field <code>templateName</code>.</p>
     *
     * @param templateName a {@link java.lang.String} object.
     */
    public void setTemplateName( String templateName )
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/SiteRenderingContext.java`
#### Snippet
```java
     * files with parser extension. Typical values are <code>src/site</code> or <code>target/generated-site</code>.
     *
     * @param siteDirectory a {@link java.io.File} object.
     */
    public void addSiteDirectory( File siteDirectory )
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/SiteRenderingContext.java`
#### Snippet
```java
    * <p>Adds passed locales to the list of site locales.</p>
    *
    * @param locales List of {@link java.util.Locale} objects to add to the site locales list.
    */
    public void addSiteLocales( List<Locale> locales )
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/SiteRenderingContext.java`
#### Snippet
```java
     * <p>Setter for the field <code>templateClassLoader</code>.</p>
     *
     * @param templateClassLoader a {@link java.lang.ClassLoader} object.
     */
    public void setTemplateClassLoader( ClassLoader templateClassLoader )
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/SiteRenderingContext.java`
#### Snippet
```java
     * <p>Setter for the field <code>templateProperties</code>.</p>
     *
     * @param templateProperties a {@link java.util.Map} object.
     */
    public void setTemplateProperties( Map<String, ?> templateProperties )
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/SiteRenderingContext.java`
#### Snippet
```java
     * <p>Getter for the field <code>modules</code>.</p>
     *
     * @return a {@link java.util.List} object.
     */
    public List<ExtraDoxiaModuleReference> getModules()
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/SiteRenderingContext.java`
#### Snippet
```java
     * <p>Getter for the field <code>templateProperties</code>.</p>
     *
     * @return a {@link java.util.Map} object.
     */
    public Map<String, ?> getTemplateProperties()
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/SiteRenderingContext.java`
#### Snippet
```java
     * <p>Setter for the field <code>outputEncoding</code>.</p>
     *
     * @param outputEncoding a {@link java.lang.String} object.
     */
    public void setOutputEncoding( String outputEncoding )
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/SiteRenderingContext.java`
#### Snippet
```java
     * <p>Getter for the field <code>inputEncoding</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getInputEncoding()
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java
     * @param source      source file to be copied
     * @param destination destination file
     * @throws java.io.IOException if any
     */
    protected void copyDirectory( File source, File destination )
```

## RuleId[ruleID=StringOperationCanBeSimplified]
### RuleId[ruleID=StringOperationCanBeSimplified]
Call to `toString()` is redundant
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
        final String relativePath = buildRelativePath( toPath, fromPath, File.separatorChar );

        return relativePath.toString();
    }

```

### RuleId[ruleID=StringOperationCanBeSimplified]
Call to `toString()` is redundant
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
        }

        if ( LOGGER.isDebugEnabled() && !relativePath.toString().equals( to ) )
        {
            LOGGER.debug( "Mapped url: " + to + " to relative path: " + relativePath );
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'getRelativePath' is still used
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
     */
    @Deprecated
    public String getRelativePath( String to, String from )
    {
        Objects.requireNonNull( to, "to cannot be null" );
```

## RuleId[ruleID=AssignmentToMethodParameter]
### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `custom`
in `doxia-decoration-model/src/main/java/org/apache/maven/doxia/site/decoration/DecorationUtils.java`
#### Snippet
```java
    public static String getCustomValue( Xpp3Dom custom, String path, String defaultValue )
    {
        custom = getCustomChild( custom, path );
        return ( custom == null ) ? defaultValue : custom.getValue();
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `custom`
in `doxia-decoration-model/src/main/java/org/apache/maven/doxia/site/decoration/DecorationUtils.java`
#### Snippet
```java
                return null;
            }
            custom = custom.getChild( element );
        }
        return custom;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `custom`
in `doxia-decoration-model/src/main/java/org/apache/maven/doxia/site/decoration/DecorationUtils.java`
#### Snippet
```java
    public static String getCustomValue( Xpp3Dom custom, String path )
    {
        custom = getCustomChild( custom, path );
        return ( custom == null ) ? null : custom.getValue();
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `document`
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/RenderingContext.java`
#### Snippet
```java
            if ( DefaultSiteRenderer.endsWithIgnoreCase( document, ".vm" ) )
            {
                document = document.substring( 0, document.length() - 3 );
            }
            String fileNameWithoutExt = document.substring( 0, document.length() - extension.length() - 1 );
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `depth`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
        if ( parentProject != null && ( decorationModel == null || decorationModel.isMergeParent() ) )
        {
            depth++;
            LOGGER.debug( "Looking for site descriptor of level " + depth + " parent project: "
                + parentProject.getId() );
```

## RuleId[ruleID=RedundantCollectionOperation]
### RuleId[ruleID=RedundantCollectionOperation]
Unnecessary 'Arrays.asList()' call
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java
            scanner.scan();

            List<String> includedFiles = Arrays.asList( scanner.getIncludedFiles() );

            for ( String name : includedFiles )
```

## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
Return of `null`
in `doxia-decoration-model/src/main/java/org/apache/maven/doxia/site/decoration/DecorationUtils.java`
#### Snippet
```java
            if ( custom == null )
            {
                return null;
            }
            custom = custom.getChild( element );
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `doxia-decoration-model/src/main/java/org/apache/maven/doxia/site/decoration/DecorationUtils.java`
#### Snippet
```java
    {
        custom = getCustomChild( custom, path );
        return ( custom == null ) ? null : custom.getValue();
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/RenderingContext.java`
#### Snippet
```java
    public String getDoxiaSourcePath()
    {
        return isDoxiaSource() ? ( basedirRelativePath + '/' + inputName ) : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/sink/SiteRendererSink.java`
#### Snippet
```java
        String body = writer.toString();

        return body.length() > 0 ? body : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/sink/SiteRendererSink.java`
#### Snippet
```java
        String head = headWriter.toString();

        return head.length() > 0 ? head : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
        if ( localeCode == null )
        {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
                LOGGER.warn( "Invalid java.util.Locale format for '" + localeCode + "' entry - IGNORING" );
            }
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
        }

        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
        {
            LOGGER.debug( "Unable to locate site descriptor", e );
            return null;
        }
        catch ( ArtifactResolutionException e )
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
            // relative path

            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
            // path.

            return null;

        }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java

        // module not found in reactor
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
        if ( url == null )
        {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
            normalized = path;
        }
        return ( normalized == null ) ? null : normalized.replace( '\\', '/' );
    }

```

## RuleId[ruleID=HtmlWrongAttributeValue]
### RuleId[ruleID=HtmlWrongAttributeValue]
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2022-11-22-21-11-13.008.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### RuleId[ruleID=SizeReplaceableByIsEmpty]
`body.length() > 0` can be replaced with '!body.isEmpty()'
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/sink/SiteRendererSink.java`
#### Snippet
```java
        String body = writer.toString();

        return body.length() > 0 ? body : null;
    }

```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`head.length() > 0` can be replaced with '!head.isEmpty()'
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/sink/SiteRendererSink.java`
#### Snippet
```java
        String head = headWriter.toString();

        return head.length() > 0 ? head : null;
    }

```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`project.getModules().size() > 0` can be replaced with '!project.getModules().isEmpty()'
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java

        // we require child modules and reactors to process module menu
        if ( project.getModules().size() > 0 )
        {
            if ( menu.getName() == null )
```

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MavenProject`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
    }

    private static MavenProject getModuleFromReactor( MavenProject project, List<MavenProject> reactorProjects,
                                                      String module )
        throws IOException
```

## RuleId[ruleID=UnusedAssignment]
### RuleId[ruleID=UnusedAssignment]
Variable `toUrl` initializer `null` is redundant
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
        }

        URL toUrl = null;
        URL fromUrl = null;

```

### RuleId[ruleID=UnusedAssignment]
Variable `fromUrl` initializer `null` is redundant
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java

        URL toUrl = null;
        URL fromUrl = null;

        String toPath = to;
```

## RuleId[ruleID=ConstantValue]
### RuleId[ruleID=ConstantValue]
Condition `resourcesDirectory != null` is always `true`
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java
            File resourcesDirectory = new File( siteDirectory, "resources" );

            if ( resourcesDirectory != null && resourcesDirectory.exists() )
            {
                copyDirectory( resourcesDirectory, outputDirectory );
```

### RuleId[ruleID=ConstantValue]
Condition `toUrl != null` is always `true`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
        }

        if ( toUrl != null && fromUrl != null )
        {
            // URLs, determine if they share protocol and domain info
```

### RuleId[ruleID=ConstantValue]
Condition `toUrl != null && fromUrl != null` is always `true`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
        }

        if ( toUrl != null && fromUrl != null )
        {
            // URLs, determine if they share protocol and domain info
```

### RuleId[ruleID=ConstantValue]
Condition `fromUrl != null` is always `true` when reached
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
        }

        if ( toUrl != null && fromUrl != null )
        {
            // URLs, determine if they share protocol and domain info
```

## RuleId[ruleID=UseBulkOperation]
### RuleId[ruleID=UseBulkOperation]
Iteration can be replaced with bulk 'Collection.addAll()' call
in `doxia-decoration-model/src/main/java/org/apache/maven/doxia/site/decoration/inheritance/DefaultDecorationModelInheritanceAssembler.java`
#### Snippet
```java
        for ( Menu menu : childMenus )
        {
            menus.add( menu );
        }

```

## RuleId[ruleID=StringEqualsEmptyString]
### RuleId[ruleID=StringEqualsEmptyString]
`equals("")` can be replaced with 'isEmpty()'
in `doxia-decoration-model/src/main/java/org/apache/maven/doxia/site/decoration/inheritance/URIPathDescriptor.java`
#### Snippet
```java
    private static String correctRelativePath( final String relativePath )
    {
        if ( "".equals( relativePath ) || "/".equals( relativePath ) )
        {
            return "./";
```

## RuleId[ruleID=RedundantSuppression]
### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java
            {
                // only singular versions ever have a recommendedVersion
                @SuppressWarnings( "unchecked" )
                int compareTo = recommendedVersion.compareTo( v );
                matched = ( compareTo <= 0 );
            }
```

## RuleId[ruleID=UnnecessaryInitCause]
### RuleId[ruleID=UnnecessaryInitCause]
Unnecessary `Throwable.initCause()` call
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java
        {
            IOException ioe = new IOException( "Error opening ZipFile: " + file.getAbsolutePath() );
            ioe.initCause( ex );
            throw ioe;
        }
```

## RuleId[ruleID=IgnoreResultOfCall]
### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.mkdirs()` is ignored
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java
                if ( !outputFile.getParentFile().exists() )
                {
                    outputFile.getParentFile().mkdirs();
                }

```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.mkdirs()` is ignored
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java
                        }

                        destFile.getParentFile().mkdirs();

                        copyFileFromZip( file, entry, destFile );
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.mkdirs()` is ignored
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java
                    else
                    {
                        destFile.mkdirs();
                    }
                }
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.mkdirs()` is ignored
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java
        if ( !siteContext.getProcessedContentOutput().exists() )
        {
            siteContext.getProcessedContentOutput().mkdirs();
        }

```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.mkdirs()` is ignored
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java
        if ( !outputParent.exists() )
        {
            outputParent.mkdirs();
        }

```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.mkdirs()` is ignored
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
            // repository, because the parent was already released (and snapshots are updated automatically if changed)
            result = new File( localRepository.getBasedir(), localRepository.pathOf( artifact ) );
            result.getParentFile().mkdirs();
            result.createNewFile();
        }
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.createNewFile()` is ignored
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
            result = new File( localRepository.getBasedir(), localRepository.pathOf( artifact ) );
            result.getParentFile().mkdirs();
            result.createNewFile();
        }

```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.mkdirs()` is ignored
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
                // see above regarding this zero length file
                result = new File( localRepository.getBasedir(), localRepository.pathOf( artifact ) );
                result.getParentFile().mkdirs();
                result.createNewFile();

```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.createNewFile()` is ignored
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
                result = new File( localRepository.getBasedir(), localRepository.pathOf( artifact ) );
                result.getParentFile().mkdirs();
                result.createNewFile();

                throw e;
```

