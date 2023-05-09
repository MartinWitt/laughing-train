# maven-doxia-sitetools 
 
# Bad smells
I found 72 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 19 | false |
| JavadocLinkAsPlainText | 10 | false |
| CdiInjectionPointsInspection | 8 | false |
| FieldMayBeFinal | 6 | false |
| IgnoreResultOfCall | 5 | false |
| ConstantValue | 4 | false |
| DataFlowIssue | 3 | false |
| JavadocDeclaration | 3 | false |
| UnusedAssignment | 3 | false |
| StringOperationCanBeSimplified | 2 | false |
| DeprecatedIsStillUsed | 2 | false |
| RedundantCast | 1 | false |
| UnnecessaryUnicodeEscape | 1 | false |
| DuplicatedCode | 1 | false |
| Deprecation | 1 | false |
| SimplifiableConditionalExpression | 1 | false |
| UseBulkOperation | 1 | false |
| UnnecessaryInitCause | 1 | false |
## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `MavenReport`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/SiteTool.java`
#### Snippet
```java
     * See {@link #getSiteDescriptor(File, Locale)} for details.
     * @param reportsPerCategory reports per category to put in "Reports" or "Information" menus, not null.
     * @see MavenReport#CATEGORY_PROJECT_INFORMATION
     * @see MavenReport#CATEGORY_PROJECT_REPORTS
     */
```

### JavadocReference
Cannot resolve symbol `CATEGORY_PROJECT_INFORMATION`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/SiteTool.java`
#### Snippet
```java
     * See {@link #getSiteDescriptor(File, Locale)} for details.
     * @param reportsPerCategory reports per category to put in "Reports" or "Information" menus, not null.
     * @see MavenReport#CATEGORY_PROJECT_INFORMATION
     * @see MavenReport#CATEGORY_PROJECT_REPORTS
     */
```

### JavadocReference
Cannot resolve symbol `MavenReport`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/SiteTool.java`
#### Snippet
```java
     * @param reportsPerCategory reports per category to put in "Reports" or "Information" menus, not null.
     * @see MavenReport#CATEGORY_PROJECT_INFORMATION
     * @see MavenReport#CATEGORY_PROJECT_REPORTS
     */
    void populateReportsMenu(SiteModel siteModel, Locale locale, Map<String, List<MavenReport>> reportsPerCategory);
```

### JavadocReference
Cannot resolve symbol `CATEGORY_PROJECT_REPORTS`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/SiteTool.java`
#### Snippet
```java
     * @param reportsPerCategory reports per category to put in "Reports" or "Information" menus, not null.
     * @see MavenReport#CATEGORY_PROJECT_INFORMATION
     * @see MavenReport#CATEGORY_PROJECT_REPORTS
     */
    void populateReportsMenu(SiteModel siteModel, Locale locale, Map<String, List<MavenReport>> reportsPerCategory);
```

### JavadocReference
Cannot resolve symbol `PathTool`
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DocumentRenderingContext.java`
#### Snippet
```java
     *
     * @return html output name
     * @see PathTool#getRelativePath(String)
     */
    public String getOutputName() {
```

### JavadocReference
Cannot resolve symbol `getRelativePath(String)`
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DocumentRenderingContext.java`
#### Snippet
```java
     *
     * @return html output name
     * @see PathTool#getRelativePath(String)
     */
    public String getOutputName() {
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.doxia.site.SiteModel`
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/SiteRenderingContext.java`
#### Snippet
```java
     * <p>Setter for the field <code>siteModel</code>.</p>
     *
     * @param siteModel a {@link org.apache.maven.doxia.site.SiteModel} object.
     */
    public void setSiteModel(SiteModel siteModel) {
```

### JavadocReference
Cannot resolve symbol `SkinModel`
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/SiteRenderingContext.java`
#### Snippet
```java
     * <p>Setter for the field <code>skinModel</code>.</p>
     *
     * @param skinModel a {@link SkinModel} object.
     */
    public void setSkinModel(SkinModel skinModel) {
```

### JavadocReference
Cannot resolve symbol `SkinModel`
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/SiteRenderingContext.java`
#### Snippet
```java
     * <p>Getter for the field <code>skinModel</code>.</p>
     *
     * @return a {@link SkinModel} object.
     */
    public SkinModel getSkinModel() {
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/SiteRenderingContext.java`
#### Snippet
```java
     * <p>Getter for the field <code>skin</code>.</p>
     *
     * @return a {@link Artifact} object.
     */
    public Artifact getSkin() {
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/SiteRenderingContext.java`
#### Snippet
```java
     * <p>Setter for the field <code>skinJarFile</code>.</p>
     *
     * @param skin an {@link Artifact} object.
     */
    public void setSkin(Artifact skin) {
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.doxia.site.SiteModel`
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/SiteRenderingContext.java`
#### Snippet
```java
     * <p>Getter for the field <code>siteModel</code>.</p>
     *
     * @return a {@link org.apache.maven.doxia.site.SiteModel} object.
     */
    public SiteModel getSiteModel() {
```

### JavadocReference
Cannot resolve symbol `ArtifactResolutionException`
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
     * @param locale not null
     * @return the resolved site descriptor or null if not found in repositories.
     * @throws ArtifactResolutionException if any
     */
    private File resolveSiteDescriptor(
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.doxia.module.xhtml5.Xhtml5Sink`
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/sink/SiteRendererSink.java`
#### Snippet
```java
     *
     * Do nothing.
     * @see org.apache.maven.doxia.module.xhtml5.Xhtml5Sink#body()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `body()`
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/sink/SiteRendererSink.java`
#### Snippet
```java
     *
     * Do nothing.
     * @see org.apache.maven.doxia.module.xhtml5.Xhtml5Sink#body()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.doxia.module.xhtml5.Xhtml5Sink`
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/sink/SiteRendererSink.java`
#### Snippet
```java
     *
     * Reset text buffer, since text content before title mustn't be in title.
     * @see org.apache.maven.doxia.module.xhtml5.Xhtml5Sink#title()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `title()`
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/sink/SiteRendererSink.java`
#### Snippet
```java
     *
     * Reset text buffer, since text content before title mustn't be in title.
     * @see org.apache.maven.doxia.module.xhtml5.Xhtml5Sink#title()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.doxia.module.xhtml5.Xhtml5Sink`
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/sink/SiteRendererSink.java`
#### Snippet
```java
     *
     * Do nothing.
     * @see org.apache.maven.doxia.module.xhtml5.Xhtml5Sink#body_()
     */
    @Override
```

### JavadocReference
Cannot resolve symbol `body_()`
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/sink/SiteRendererSink.java`
#### Snippet
```java
     *
     * Do nothing.
     * @see org.apache.maven.doxia.module.xhtml5.Xhtml5Sink#body_()
     */
    @Override
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

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
     * @param keepInheritedRefs used for inherited references.
     * @throws SiteToolException if any
     * @throws IOException
     */
    private void populateModulesMenu(
```

### JavadocDeclaration
`@param banner` tag description is missing
in `doxia-site-model/src/main/java/org/apache/maven/doxia/site/inheritance/DefaultSiteModelInheritanceAssembler.java`
#### Snippet
```java
     * to the oldBaseUrl, these are changed to the newBannerUrl.
     *
     * @param banner
     * @param baseUrl
     */
```

### JavadocDeclaration
`@param baseUrl` tag description is missing
in `doxia-site-model/src/main/java/org/apache/maven/doxia/site/inheritance/DefaultSiteModelInheritanceAssembler.java`
#### Snippet
```java
     *
     * @param banner
     * @param baseUrl
     */
    private void relativizeBannerPaths(final Banner banner, final String baseUrl) {
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `sink` to `DocumentContent` is redundant
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java
        }

        mergeDocumentIntoSite(writer, (DocumentContent) sink, siteContext);
    }

```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `attributes` may be 'final'
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DocumentRenderingContext.java`
#### Snippet
```java
    private final String extension;

    private Map<String, String> attributes;

    private final boolean editable;
```

### FieldMayBeFinal
Field `docRenderingContext` may be 'final'
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DoxiaDocumentRenderer.java`
#### Snippet
```java
 */
public class DoxiaDocumentRenderer implements DocumentRenderer {
    private DocumentRenderingContext docRenderingContext;

    /**
```

### FieldMayBeFinal
Field `siteLocales` may be 'final'
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/SiteRenderingContext.java`
#### Snippet
```java
    private Locale locale = Locale.ROOT;

    private List<Locale> siteLocales = new ArrayList<Locale>();

    private SiteModel siteModel;
```

### FieldMayBeFinal
Field `siteDirectories` may be 'final'
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/SiteRenderingContext.java`
#### Snippet
```java
    private File rootDirectory;

    private List<File> siteDirectories = new ArrayList<File>();

    private Map<String, String> moduleExcludes;
```

### FieldMayBeFinal
Field `authors` may be 'final'
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/sink/SiteRendererSink.java`
#### Snippet
```java
    private String title;

    private List<String> authors = new ArrayList<String>();

    private final StringWriter headWriter;
```

### FieldMayBeFinal
Field `docRenderingContext` may be 'final'
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/sink/SiteRendererSink.java`
#### Snippet
```java
    private final Writer writer;

    private DocumentRenderingContext docRenderingContext;

    /**
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

## RuleId[id=UnnecessaryUnicodeEscape]
### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2013` can be replaced with '--'
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java

        if (title.length() > 0 && StringUtils.isNotEmpty(content.getTitle())) {
            title.append(" \u2013 "); // Symbol Name: En Dash
        }
        if (StringUtils.isNotEmpty(content.getTitle())) {
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
        try {
            toUrl = new URL(to);
        } catch (MalformedURLException e) {
            try {
                toUrl = new File(getNormalizedPath(to)).toURI().toURL();
            } catch (MalformedURLException e1) {
                LOGGER.warn("Unable to load a URL for '" + to + "'", e);
                return to;
            }
        }
```

## RuleId[id=Deprecation]
### Deprecation
'org.apache.maven.doxia.siterenderer.Renderer' is deprecated
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java
@Singleton
@Named
public class DefaultSiteRenderer implements Renderer {
    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultSiteRenderer.class);

```

## RuleId[id=CdiInjectionPointsInspection]
### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java

    @Inject
    private ParserModuleManager parserModuleManager;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java

    @Inject
    private Doxia doxia;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java

    @Inject
    private VelocityComponent velocity;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `doxia-site-renderer/src/main/java/org/apache/maven/doxia/siterenderer/DefaultSiteRenderer.java`
#### Snippet
```java

    @Inject
    private PlexusContainer plexus;

    private static final String SKIN_TEMPLATE_LOCATION = "META-INF/maven/site.vm";
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
     */
    @Inject
    private ArtifactHandlerManager artifactHandlerManager;

    /**
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
     */
    @Inject
    protected RepositorySystem repositorySystem;

    /**
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
     */
    @Inject
    protected I18N i18n;

    /**
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/DefaultSiteTool.java`
#### Snippet
```java
     */
    @Inject
    protected ProjectBuilder projectBuilder;

    // ----------------------------------------------------------------------
```

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`newBaseURI.getScheme() == null ? false : baseURI.getScheme().equalsIgnoreCase(newBaseURI.getScheme())` can be simplified to 'newBaseURI.getScheme()!=null \&\& baseURI.getScheme().equalsIgnoreCase(newBaseURI.getScheme())'
in `doxia-site-model/src/main/java/org/apache/maven/doxia/site/inheritance/URIPathDescriptor.java`
#### Snippet
```java
    private static boolean sameSite(final URI baseURI, final URI newBaseURI) {
        final boolean sameScheme =
                (newBaseURI.getScheme() == null ? false : baseURI.getScheme().equalsIgnoreCase(newBaseURI.getScheme()));
        final boolean sameHost = (baseURI.getHost() == null
                ? newBaseURI.getHost() == null
```

## RuleId[id=UnusedAssignment]
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

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/SiteTool.java`
#### Snippet
```java
     * For example:
     * <dl>
     * <dt>to = "http://maven.apache.org" and from = "http://maven.apache.org"</dt>
     * <dd>return ""</dd>
     * <dt>to = "http://maven.apache.org" and from = "http://maven.apache.org/plugins/maven-site-plugin/"</dt>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/SiteTool.java`
#### Snippet
```java
     * For example:
     * <dl>
     * <dt>to = "http://maven.apache.org" and from = "http://maven.apache.org"</dt>
     * <dd>return ""</dd>
     * <dt>to = "http://maven.apache.org" and from = "http://maven.apache.org/plugins/maven-site-plugin/"</dt>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/SiteTool.java`
#### Snippet
```java
     * <dt>to = "http://maven.apache.org" and from = "http://maven.apache.org"</dt>
     * <dd>return ""</dd>
     * <dt>to = "http://maven.apache.org" and from = "http://maven.apache.org/plugins/maven-site-plugin/"</dt>
     * <dd>return "../.."</dd>
     * <dt>to = "http://maven.apache.org/plugins/maven-site-plugin/" and from = "http://maven.apache.org"</dt>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/SiteTool.java`
#### Snippet
```java
     * <dt>to = "http://maven.apache.org" and from = "http://maven.apache.org"</dt>
     * <dd>return ""</dd>
     * <dt>to = "http://maven.apache.org" and from = "http://maven.apache.org/plugins/maven-site-plugin/"</dt>
     * <dd>return "../.."</dd>
     * <dt>to = "http://maven.apache.org/plugins/maven-site-plugin/" and from = "http://maven.apache.org"</dt>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/SiteTool.java`
#### Snippet
```java
     * <dt>to = "http://maven.apache.org" and from = "http://maven.apache.org/plugins/maven-site-plugin/"</dt>
     * <dd>return "../.."</dd>
     * <dt>to = "http://maven.apache.org/plugins/maven-site-plugin/" and from = "http://maven.apache.org"</dt>
     * <dd>return "plugins/maven-site-plugin"</dd>
     * <dt>to = "/myproject/myproject-module1" and from = "/myproject/myproject"</dt>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/SiteTool.java`
#### Snippet
```java
     * <dt>to = "http://maven.apache.org" and from = "http://maven.apache.org/plugins/maven-site-plugin/"</dt>
     * <dd>return "../.."</dd>
     * <dt>to = "http://maven.apache.org/plugins/maven-site-plugin/" and from = "http://maven.apache.org"</dt>
     * <dd>return "plugins/maven-site-plugin"</dd>
     * <dt>to = "/myproject/myproject-module1" and from = "/myproject/myproject"</dt>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/SiteTool.java`
#### Snippet
```java
     * </dl>
     * <b>Note</b>: The file separator depends on the system.
     * Maven-specific urls are supported, like <code>dav:https://dav.codehaus.org/</code> or
     * <code>scm:svn:https://svn.apache.org/repos/asf</code>.
     *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `doxia-integration-tools/src/main/java/org/apache/maven/doxia/tools/SiteTool.java`
#### Snippet
```java
     * <b>Note</b>: The file separator depends on the system.
     * Maven-specific urls are supported, like <code>dav:https://dav.codehaus.org/</code> or
     * <code>scm:svn:https://svn.apache.org/repos/asf</code>.
     *
     * @param to the <code>to</code> url of file as string
```

### JavadocLinkAsPlainText
Link specified as plain text
in `doxia-site-model/src/main/java/org/apache/maven/doxia/site/inheritance/URIPathDescriptor.java`
#### Snippet
```java
     * @param baseURI The base URI. Has to be a valid absolute URI.
     *      In addition, the path of the URI should not have any file part,
     *      ie <code>http://maven.apache.org/</code> is valid,
     *      <code>http://maven.apache.org/index.html</code> is not.
     *      Even though the latter form is accepted without warning,
```

### JavadocLinkAsPlainText
Link specified as plain text
in `doxia-site-model/src/main/java/org/apache/maven/doxia/site/inheritance/URIPathDescriptor.java`
#### Snippet
```java
     *      In addition, the path of the URI should not have any file part,
     *      ie <code>http://maven.apache.org/</code> is valid,
     *      <code>http://maven.apache.org/index.html</code> is not.
     *      Even though the latter form is accepted without warning,
     *      the methods in this class will not return what is probably expected,
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
            if (modified || docRenderer.isOverwrite()) {
                if (!outputFile.getParentFile().exists()) {
                    outputFile.getParentFile().mkdirs();
                }

```

