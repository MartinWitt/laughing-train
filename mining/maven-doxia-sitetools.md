# maven-doxia-sitetools 
 
# Bad smells
I found 100 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 36 | false |
| ReturnNull | 19 | false |
| DynamicRegexReplaceableByCompiledPattern | 8 | false |
| AssignmentToMethodParameter | 6 | false |
| IgnoreResultOfCall | 5 | false |
| DataFlowIssue | 4 | false |
| ConstantValue | 4 | false |
| UnusedAssignment | 3 | false |
| StringOperationCanBeSimplified | 2 | false |
| DeprecatedIsStillUsed | 2 | false |
| SizeReplaceableByIsEmpty | 2 | true |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| UnnecessarySuperQualifier | 1 | false |
| RedundantCollectionOperation | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| BoundedWildcard | 1 | false |
| UseBulkOperation | 1 | false |
| StringEqualsEmptyString | 1 | false |
| RedundantSuppression | 1 | false |
| UnnecessaryInitCause | 1 | false |
## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `SiteUtils` has only 'static' members, and lacks a 'private' constructor
in `doxia-site-model/src/main/java/org/apache/maven/doxia/site/SiteUtils.java`
#### Snippet
```java
 * @since 1.7
 */
public class SiteUtils {
    public static boolean isLink(String href) {
        return StringUtils.isNotBlank(href)
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java
                StringWriter sw = new StringWriter();
                template.merge(context, sw);
                writer.write(sw.toString().replaceAll("\r?\n", SystemUtils.LINE_SEPARATOR));
            } catch (VelocityException ve) {
                throw new RendererException("Velocity error while merging site template.", ve);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
                    // we're going to parse this back in as XML so we need to escape XML markup
                    return value.toString()
                            .replace("&", "&amp;")
                            .replace("<", "&lt;")
                            .replace(">", "&gt;")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
                    return value.toString()
                            .replace("&", "&amp;")
                            .replace("<", "&lt;")
                            .replace(">", "&gt;")
                            .replace("\"", "&quot;")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
                            .replace("&", "&amp;")
                            .replace("<", "&lt;")
                            .replace(">", "&gt;")
                            .replace("\"", "&quot;")
                            .replace("'", "&apos;");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
                            .replace("<", "&lt;")
                            .replace(">", "&gt;")
                            .replace("\"", "&quot;")
                            .replace("'", "&apos;");
                }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
                            .replace(">", "&gt;")
                            .replace("\"", "&quot;")
                            .replace("'", "&apos;");
                }
                return null;
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java

        // strip any leading slashes if its a windows path
        if (toPath.matches("^\\[a-zA-Z]:")) {
            toPath = toPath.substring(1);
        }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
            toPath = toPath.substring(1);
        }
        if (fromPath.matches("^\\[a-zA-Z]:")) {
            fromPath = fromPath.substring(1);
        }
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/sink/SiteRendererSink.java`
#### Snippet
```java

        /* the template is expected to have used the main tag, which can be used only once */
        super.contentStack.push(HtmlMarkup.MAIN);
    }

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getParentFile` may produce `NullPointerException`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
                String siteRelativePath = getRelativeFilePath(
                        project.getBasedir().getAbsolutePath(),
                        siteDescriptor.getParentFile().getAbsolutePath());

                parentSiteDirectory = new File(parentProject.getBasedir(), siteRelativePath);
```

### DataFlowIssue
Argument `siteRelativePath` might be null
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
                        siteDescriptor.getParentFile().getAbsolutePath());

                parentSiteDirectory = new File(parentProject.getBasedir(), siteRelativePath);
                // notice: using same siteRelativePath for parent as current project; may be wrong if site plugin
                // has different configuration. But this is a rare case (this only has impact if parent is from reactor)
```

### DataFlowIssue
Argument `getNormalizedPath(to)` might be null
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
        } catch (MalformedURLException e) {
            try {
                toUrl = new File(getNormalizedPath(to)).toURI().toURL();
            } catch (MalformedURLException e1) {
                LOGGER.warn("Unable to load a URL for '" + to + "'", e);
```

### DataFlowIssue
Argument `getNormalizedPath(from)` might be null
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
        } catch (MalformedURLException e) {
            try {
                fromUrl = new File(getNormalizedPath(from)).toURI().toURL();
            } catch (MalformedURLException e1) {
                LOGGER.warn("Unable to load a URL for '" + from + "'", e);
```

## RuleId[id=UnnecessaryFullyQualifiedName]
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
    void renderDocument(Writer writer, SiteRenderer siteRenderer, SiteRenderingContext siteRenderingContext)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DocumentRenderingContext.java`
#### Snippet
```java
     * <p>Getter for the field <code>basedir</code>.</p>
     *
     * @return a {@link java.io.File} object.
     */
    public File getBasedir() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DocumentRenderingContext.java`
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
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DocumentRenderingContext.java`
#### Snippet
```java
     *
     * @param key a {@link java.lang.String} object.
     * @param value a {@link java.lang.String} object.
     */
    public void setAttribute(String key, String value) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DocumentRenderingContext.java`
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
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DocumentRenderingContext.java`
#### Snippet
```java
     *
     * @param key a {@link java.lang.String} object.
     * @return a {@link java.lang.String} object.
     */
    public String getAttribute(String key) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DocumentRenderingContext.java`
#### Snippet
```java
     * <p>Getter for the field <code>inputName</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getInputName() {
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
     * Reset text buffer, since text content before title mustn't be in title.
     * @see org.apache.maven.doxia.module.xhtml5.Xhtml5Sink#title()
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/SiteRenderer.java`
#### Snippet
```java
     * @return a SiteRenderingContext.
     * @throws RendererException if it bombs.
     * @throws java.io.IOException if it bombs.
     * @since 1.7.3 was previously with skin as File instead of Artifact
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `doxia-site-model/src/main/java/org/apache/maven/doxia/site/inheritance/URIPathDescriptor.java`
#### Snippet
```java
     *
     * @return the resolved link. This is equivalent to calling
     *      {@link #getBaseURI()}.{@link URI#resolve(java.net.URI) resolve}( {@link #getLink()} ).
     */
    public URI resolveLink() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `doxia-site-model/src/main/java/org/apache/maven/doxia/site/inheritance/URIPathDescriptor.java`
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
in `doxia-site-model/src/main/java/org/apache/maven/doxia/site/inheritance/URIPathDescriptor.java`
#### Snippet
```java
     *      or newBase is not parsable as a URI,
     *      or newBase and this {@link #getBaseURI()} do not share the
     *      {@link #sameSite(java.net.URI) same site}.
     *
     * @param newBase the new base URI. Has to be parsable as a URI.
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
    public void setTemplateClassLoader(ClassLoader templateClassLoader) {
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
    public void setModuleExcludes(Map<String, String> moduleExcludes) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/SiteRenderingContext.java`
#### Snippet
```java
     * <p>Getter for the field <code>defaultTitle</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getDefaultTitle() {
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
    public List<Locale> getSiteLocales() {
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
    public List<Locale> getSiteLocales() {
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
    public String getInputEncoding() {
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
    public void setTemplateName(String templateName) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/SiteRenderingContext.java`
#### Snippet
```java
     * <p>Setter for the field <code>defaultTitle</code>.</p>
     *
     * @param defaultTitle a {@link java.lang.String} object.
     */
    public void setDefaultTitle(String defaultTitle) {
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
    public void addSiteLocales(List<Locale> locales) {
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
    public String getOutputEncoding() {
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
    public Locale getLocale() {
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
    public void setInputEncoding(String inputEncoding) {
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
    public void setLocale(Locale locale) {
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
    public void setTemplateProperties(Map<String, ?> templateProperties) {
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
    public Map<String, ?> getTemplateProperties() {
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
    public void setOutputEncoding(String outputEncoding) {
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
    public ClassLoader getTemplateClassLoader() {
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
    public String getTemplateName() {
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
    public void addSiteDirectory(File siteDirectory) {
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
    protected void copyDirectory(File source, File destination) throws IOException {
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
        final String relativePath = buildRelativePath(toPath, fromPath, File.separatorChar);

        return relativePath.toString();
    }

```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
        }

        if (LOGGER.isDebugEnabled() && !relativePath.toString().equals(to)) {
            LOGGER.debug("Mapped url: " + to + " to relative path: " + relativePath);
        }
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'Renderer' is still used
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/Renderer.java`
#### Snippet
```java
 */
@Deprecated
public interface Renderer extends SiteRenderer {}

```

### DeprecatedIsStillUsed
Deprecated member 'getRelativePath' is still used
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
     */
    @Deprecated
    public String getRelativePath(String to, String from) {
        Objects.requireNonNull(to, "to cannot be null");
        Objects.requireNonNull(from, "from cannot be null");
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `document`
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DocumentRenderingContext.java`
#### Snippet
```java
        this.attributes = new HashMap<String, String>();

        document = document.replace('\\', '/');
        this.inputName = document;

```

### AssignmentToMethodParameter
Assignment to method parameter `document`
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DocumentRenderingContext.java`
#### Snippet
```java
            // - download.apt.vm --> download.html
            if (DefaultSiteRenderer.endsWithIgnoreCase(document, ".vm")) {
                document = document.substring(0, document.length() - 3);
            }
            String fileNameWithoutExt = document.substring(0, document.length() - extension.length() - 1);
```

### AssignmentToMethodParameter
Assignment to method parameter `custom`
in `doxia-site-model/src/main/java/org/apache/maven/doxia/site/SiteUtils.java`
#### Snippet
```java
                return null;
            }
            custom = custom.getChild(element);
        }
        return custom;
```

### AssignmentToMethodParameter
Assignment to method parameter `custom`
in `doxia-site-model/src/main/java/org/apache/maven/doxia/site/SiteUtils.java`
#### Snippet
```java
     */
    public static String getCustomValue(Xpp3Dom custom, String path, String defaultValue) {
        custom = getCustomChild(custom, path);
        return (custom == null) ? defaultValue : custom.getValue();
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `custom`
in `doxia-site-model/src/main/java/org/apache/maven/doxia/site/SiteUtils.java`
#### Snippet
```java
     */
    public static String getCustomValue(Xpp3Dom custom, String path) {
        custom = getCustomChild(custom, path);
        return (custom == null) ? null : custom.getValue();
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `depth`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
        // 4. merge with parent project SiteModel
        if (parentProject != null && (siteModel == null || siteModel.isMergeParent())) {
            depth++;
            LOGGER.debug("Looking for site descriptor of level " + depth + " parent project: " + parentProject.getId());

```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
Unnecessary 'Arrays.asList()' call
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java
            scanner.scan();

            List<String> includedFiles = Arrays.asList(scanner.getIncludedFiles());

            for (String name : includedFiles) {
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DocumentRenderingContext.java`
#### Snippet
```java
     */
    public String getDoxiaSourcePath() {
        return isDoxiaSource() ? (basedirRelativePath + '/' + inputName) : null;
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
in `doxia-site-model/src/main/java/org/apache/maven/doxia/site/SiteUtils.java`
#### Snippet
```java
        for (String element : elements) {
            if (custom == null) {
                return null;
            }
            custom = custom.getChild(element);
```

### ReturnNull
Return of `null`
in `doxia-site-model/src/main/java/org/apache/maven/doxia/site/SiteUtils.java`
#### Snippet
```java
    public static String getCustomValue(Xpp3Dom custom, String path) {
        custom = getCustomChild(custom, path);
        return (custom == null) ? null : custom.getValue();
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
    private Locale codeToLocale(String localeCode) {
        if (localeCode == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
                LOGGER.warn("Invalid java.util.Locale format for '" + localeCode + "' entry - IGNORING");
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
    private static Plugin getPlugin(MavenProject project, String pluginId) {
        if ((project.getBuild() == null) || (project.getBuild().getPluginsAsMap() == null)) {
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
            if (siteDescriptor == null) {
                LOGGER.debug("Site descriptor not found");
                return null;
            } else {
                return siteDescriptor;
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
    private static String urlEncode(final String url) {
        if (url == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
                            .replace("'", "&apos;");
                }
                return null;
            }
        });
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
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
                if (e.getResult().getExceptions().stream().anyMatch(re -> re instanceof ArtifactNotFoundException)) {
                    LOGGER.debug("No site descriptor found for '" + project.getId() + "' with default locale");
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
        return (normalized == null) ? null : normalized.replace('\\', '/');
    }

```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-21-15-06-45.914.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=SizeReplaceableByIsEmpty]
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

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends MavenProject`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
    }

    private MavenProject getModuleFromReactor(MavenProject project, List<MavenProject> reactorProjects, String module)
            throws IOException {
        File moduleBasedir = new File(project.getBasedir(), module).getCanonicalFile();
```

## RuleId[id=UnusedAssignment]
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

### UnusedAssignment
Variable `localeStr` initializer `null` is redundant
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
        String language = locale.getLanguage();

        String localeStr = null;
        File siteDescriptor = null;
        boolean found = false;
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `resourcesDirectory != null` is always `true`
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java
            File resourcesDirectory = new File(siteDirectory, "resources");

            if (resourcesDirectory != null && resourcesDirectory.exists()) {
                copyDirectory(resourcesDirectory, outputDirectory);
            }
```

### ConstantValue
Condition `toUrl != null` is always `true`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
        }

        if (toUrl != null && fromUrl != null) {
            // URLs, determine if they share protocol and domain info

```

### ConstantValue
Condition `toUrl != null && fromUrl != null` is always `true`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
        }

        if (toUrl != null && fromUrl != null) {
            // URLs, determine if they share protocol and domain info

```

### ConstantValue
Condition `fromUrl != null` is always `true` when reached
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
        }

        if (toUrl != null && fromUrl != null) {
            // URLs, determine if they share protocol and domain info

```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `doxia-site-model/src/main/java/org/apache/maven/doxia/site/inheritance/DefaultSiteModelInheritanceAssembler.java`
#### Snippet
```java

        for (Menu menu : childMenus) {
            menus.add(menu);
        }

```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `doxia-site-model/src/main/java/org/apache/maven/doxia/site/inheritance/URIPathDescriptor.java`
#### Snippet
```java

    private static String correctRelativePath(final String relativePath) {
        if ("".equals(relativePath) || "/".equals(relativePath)) {
            return "./";
        } else {
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java
            } else {
                // only singular versions ever have a recommendedVersion
                @SuppressWarnings("unchecked")
                int compareTo = recommendedVersion.compareTo(v);
                matched = (compareTo <= 0);
            }
```

## RuleId[id=UnnecessaryInitCause]
### UnnecessaryInitCause
Unnecessary `Throwable.initCause()` call
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java
        } catch (ZipException ex) {
            IOException ioe = new IOException("Error opening ZipFile: " + file.getAbsolutePath());
            ioe.initCause(ex);
            throw ioe;
        }
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java
            throws IOException {
        if (!siteContext.getProcessedContentOutput().exists()) {
            siteContext.getProcessedContentOutput().mkdirs();
        }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java
        File outputParent = outputFile.getParentFile();
        if (!outputParent.exists()) {
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

                        copyFileFromZip(file, entry, destFile);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java
                        copyFileFromZip(file, entry, destFile);
                    } else {
                        destFile.mkdirs();
                    }
                }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java
            if (modified || docRenderer.isOverwrite()) {
                if (!outputFile.getParentFile().exists()) {
                    outputFile.getParentFile().mkdirs();
                }

```

