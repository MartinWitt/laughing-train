# maven-doxia-sitetools 
 
# Bad smells
I found 100 bad smells with 5 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 37 | false |
| ReturnNull | 15 | false |
| IgnoreResultOfCall | 13 | false |
| AssignmentToMethodParameter | 5 | false |
| DataFlowIssue | 4 | false |
| ConstantValue | 4 | false |
| DynamicRegexReplaceableByCompiledPattern | 3 | false |
| SizeReplaceableByIsEmpty | 3 | true |
| UnusedAssignment | 3 | false |
| StringOperationCanBeSimplified | 2 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| UnnecessarySuperQualifier | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| RedundantCollectionOperation | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| BoundedWildcard | 1 | false |
| UseBulkOperation | 1 | false |
| StringEqualsEmptyString | 1 | false |
| RedundantSuppression | 1 | false |
| UnnecessaryInitCause | 1 | false |
## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
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
### DynamicRegexReplaceableByCompiledPattern
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

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java

        // strip any leading slashes if its a windows path
        if ( toPath.matches( "^\\[a-zA-Z]:" ) )
        {
            toPath = toPath.substring( 1 );
```

### DynamicRegexReplaceableByCompiledPattern
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
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/sink/SiteRendererSink.java`
#### Snippet
```java

        /* the template is expected to have used the main tag, which can be used only once */
        super.contentStack.push( HtmlMarkup.MAIN );
    }

```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Method invocation `getParentFile` may produce `NullPointerException`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
                // extrapolate parent project site directory
                String siteRelativePath = getRelativeFilePath( project.getBasedir().getAbsolutePath(),
                                                               siteDescriptor.getParentFile().getAbsolutePath() );

                parentSiteDirectory = new File( parentProject.getBasedir(), siteRelativePath );
```

### DataFlowIssue
Argument `siteRelativePath` might be null
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
                                                               siteDescriptor.getParentFile().getAbsolutePath() );

                parentSiteDirectory = new File( parentProject.getBasedir(), siteRelativePath );
                // notice: using same siteRelativePath for parent as current project; may be wrong if site plugin
                // has different configuration. But this is a rare case (this only has impact if parent is from reactor)
```

### DataFlowIssue
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

### DataFlowIssue
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

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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

### UnnecessaryFullyQualifiedName
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
### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
        final String relativePath = buildRelativePath( toPath, fromPath, File.separatorChar );

        return relativePath.toString();
    }

```

### StringOperationCanBeSimplified
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
### DeprecatedIsStillUsed
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
### AssignmentToMethodParameter
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

### AssignmentToMethodParameter
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

### AssignmentToMethodParameter
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

### AssignmentToMethodParameter
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

### AssignmentToMethodParameter
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
### RedundantCollectionOperation
Unnecessary 'Arrays.asList()' call
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java
            scanner.scan();

            List<String> includedFiles = Arrays.asList( scanner.getIncludedFiles() );

            for ( String name : includedFiles )
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/RenderingContext.java`
#### Snippet
```java
    public String getDoxiaSourcePath()
    {
        return isDoxiaSource() ? ( basedirRelativePath + '/' + inputName ) : null;
    }

```

### ReturnNull
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

### ReturnNull
Return of `null`
in `doxia-decoration-model/src/main/java/org/apache/maven/doxia/site/decoration/DecorationUtils.java`
#### Snippet
```java
    {
        custom = getCustomChild( custom, path );
        return ( custom == null ) ? null : custom.getValue();
    }

```

### ReturnNull
Return of `null`
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/sink/SiteRendererSink.java`
#### Snippet
```java
        String head = headWriter.toString();

        return head.length() > 0 ? head : null;
    }

```

### ReturnNull
Return of `null`
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/sink/SiteRendererSink.java`
#### Snippet
```java
        String body = writer.toString();

        return body.length() > 0 ? body : null;
    }

```

### ReturnNull
Return of `null`
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
            // relative path

            return null;
        }

```

### ReturnNull
Return of `null`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
            // path.

            return null;

        }
```

### ReturnNull
Return of `null`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
        if ( url == null )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java

        // module not found in reactor
        return null;
    }

```

### ReturnNull
Return of `null`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
            normalized = path;
        }
        return ( normalized == null ) ? null : normalized.replace( '\\', '/' );
    }

```

### ReturnNull
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

### ReturnNull
Return of `null`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
        if ( localeCode == null )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
                LOGGER.warn( "Invalid java.util.Locale format for '" + localeCode + "' entry - IGNORING" );
            }
            return null;
        }

```

## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2022-11-30-03-29-38.498.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`head.length() > 0` can be replaced with '!head.isEmpty()'
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/sink/SiteRendererSink.java`
#### Snippet
```java
        String head = headWriter.toString();

        return head.length() > 0 ? head : null;
    }

```

### SizeReplaceableByIsEmpty
`body.length() > 0` can be replaced with '!body.isEmpty()'
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/sink/SiteRendererSink.java`
#### Snippet
```java
        String body = writer.toString();

        return body.length() > 0 ? body : null;
    }

```

### SizeReplaceableByIsEmpty
`project.getModules().size() > 0` can be replaced with '!project.getModules().isEmpty()'
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java

        // we require child modules and reactors to process module menu
        if ( project.getModules().size() > 0 )
        {
            if ( menu.getName() == null )
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `localeStr` is redundant
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
        if ( !found && !language.isEmpty() )
        {
            String localeStr = language;
            // TODO: this is a bit crude - proper type, or proper handling as metadata rather than an artifact in 2.1?
            artifact = artifactFactory.createArtifactWithClassifier( project.getGroupId(),
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
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
### UnusedAssignment
Variable `artifact` initializer `null` is redundant
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
        String language = locale.getLanguage();

        Artifact artifact = null;
        File siteDescriptor = null;
        boolean found = false;
```

### UnusedAssignment
Variable `toUrl` initializer `null` is redundant
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
        }

        URL toUrl = null;
        URL fromUrl = null;

```

### UnusedAssignment
Variable `fromUrl` initializer `null` is redundant
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java

        URL toUrl = null;
        URL fromUrl = null;

        String toPath = to;
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `resourcesDirectory != null` is always `true`
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java
            File resourcesDirectory = new File( siteDirectory, "resources" );

            if ( resourcesDirectory != null && resourcesDirectory.exists() )
            {
                copyDirectory( resourcesDirectory, outputDirectory );
```

### ConstantValue
Condition `toUrl != null` is always `true`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
        }

        if ( toUrl != null && fromUrl != null )
        {
            // URLs, determine if they share protocol and domain info
```

### ConstantValue
Condition `toUrl != null && fromUrl != null` is always `true`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
        }

        if ( toUrl != null && fromUrl != null )
        {
            // URLs, determine if they share protocol and domain info
```

### ConstantValue
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
### UseBulkOperation
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
### StringEqualsEmptyString
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
### RedundantSuppression
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
### UnnecessaryInitCause
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
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java
        if ( !siteContext.getProcessedContentOutput().exists() )
        {
            siteContext.getProcessedContentOutput().mkdirs();
        }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java
        if ( !outputParent.exists() )
        {
            outputParent.mkdirs();
        }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java
                        }

                        destFile.getParentFile().mkdirs();

                        copyFileFromZip( file, entry, destFile );
```

### IgnoreResultOfCall
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

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java
                if ( !outputFile.getParentFile().exists() )
                {
                    outputFile.getParentFile().mkdirs();
                }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
                // automatically if changed)
                siteDescriptor = new File( localRepository.getBasedir(), localRepository.pathOf( artifact ) );
                siteDescriptor.getParentFile().mkdirs();
                siteDescriptor.createNewFile();
            }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
                siteDescriptor = new File( localRepository.getBasedir(), localRepository.pathOf( artifact ) );
                siteDescriptor.getParentFile().mkdirs();
                siteDescriptor.createNewFile();
            }
        }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
                // automatically if changed)
                siteDescriptor = new File( localRepository.getBasedir(), localRepository.pathOf( artifact ) );
                siteDescriptor.getParentFile().mkdirs();
                siteDescriptor.createNewFile();
            }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
                siteDescriptor = new File( localRepository.getBasedir(), localRepository.pathOf( artifact ) );
                siteDescriptor.getParentFile().mkdirs();
                siteDescriptor.createNewFile();
            }
        }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
                // automatically if changed)
                siteDescriptor = new File( localRepository.getBasedir(), localRepository.pathOf( artifact ) );
                siteDescriptor.getParentFile().mkdirs();
                siteDescriptor.createNewFile();
            }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
                siteDescriptor = new File( localRepository.getBasedir(), localRepository.pathOf( artifact ) );
                siteDescriptor.getParentFile().mkdirs();
                siteDescriptor.createNewFile();
            }
        }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
                // see above regarding this zero length file
                siteDescriptor = new File( localRepository.getBasedir(), localRepository.pathOf( artifact ) );
                siteDescriptor.getParentFile().mkdirs();
                siteDescriptor.createNewFile();

```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
                siteDescriptor = new File( localRepository.getBasedir(), localRepository.pathOf( artifact ) );
                siteDescriptor.getParentFile().mkdirs();
                siteDescriptor.createNewFile();

                throw e;
```

