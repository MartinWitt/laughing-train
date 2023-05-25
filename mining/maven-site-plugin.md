# maven-site-plugin 
 
# Bad smells
I found 72 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 23 | false |
| FieldMayBeFinal | 15 | false |
| ConstantValue | 12 | false |
| IgnoreResultOfCall | 6 | false |
| DuplicatedCode | 4 | false |
| JavadocDeclaration | 4 | false |
| UNCHECKED_WARNING | 2 | false |
| UnnecessaryStringEscape | 2 | true |
| ConditionCoveredByFurtherCondition | 1 | false |
| DataFlowIssue | 1 | false |
| RedundantCast | 1 | false |
| UnusedAssignment | 1 | false |
## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/it/projects/MSITE-484/parent-usage-test/src/main/javadoc/stylesheet.css`
#### Snippet
```java
/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/maven/plugins/site/render/AbstractSiteRenderingMojo.java`
#### Snippet
```java
            DocumentRenderer docRenderer = new CategorySummaryDocumentRenderer(
                    subMojoExecution, docRenderingContext, title, desc1, desc2, i18n, categoryReports, getLog());

            String filename = docRenderer.getOutputName();
            if (!documents.containsKey(filename)) {
                documents.put(filename, docRenderer);
            } else {
                getLog().info("Skipped \"" + title + "\" report; file \"" + filename + "\" already exists.");
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/maven/plugins/site/render/CategorySummaryDocumentRenderer.java`
#### Snippet
```java
        String msg = "Generating \"" + buffer().strong(title) + "\" report";
        // CHECKSTYLE_OFF: MagicNumber
        log.info((StringUtils.rightPad(msg, 40) + buffer().strong(" --- ").mojo(reportMojoInfo)));
        // CHECKSTYLE_ON: MagicNumber

        SiteRendererSink sink = new SiteRendererSink(docRenderingContext);

        sink.head();

        sink.title();

        sink.text(title);

        sink.title_();

        sink.head_();

        sink.body();

        sink.section1();
        sink.sectionTitle1();
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/maven/plugins/site/run/DoxiaFilter.java`
#### Snippet
```java
                DocumentRenderer docRenderer = documents.get(path);
                logDocumentRenderer(path, localeWanted, docRenderer);
                String outputName = docRenderer.getOutputName();
                String contentType = MimeTypes.getDefaultMimeByExtension(outputName);
                if (contentType != null) {
                    servletResponse.setContentType(contentType);
                }
                docRenderer.renderDocument(servletResponse.getWriter(), siteRenderer, context);
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `src/main/java/org/apache/maven/plugins/site/run/DoxiaFilter.java`
#### Snippet
```java
        siteRenderer = (SiteRenderer) servletContext.getAttribute(SITE_RENDERER_KEY);

        i18nDoxiaContexts = (Map<String, DoxiaBean>) servletContext.getAttribute(I18N_DOXIA_CONTEXTS_KEY);

        localesList = (List<Locale>) servletContext.getAttribute(LOCALES_LIST_KEY);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `src/main/java/org/apache/maven/plugins/site/run/DoxiaFilter.java`
#### Snippet
```java
        i18nDoxiaContexts = (Map<String, DoxiaBean>) servletContext.getAttribute(I18N_DOXIA_CONTEXTS_KEY);

        localesList = (List<Locale>) servletContext.getAttribute(LOCALES_LIST_KEY);
    }

```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'doc instanceof ReportDocumentRenderer' covered by subsequent condition 'doc instanceof SitePluginReportDocumentRenderer'
in `src/main/java/org/apache/maven/plugins/site/render/SiteMojo.java`
#### Snippet
```java
        for (DocumentRenderer doc : documents) {
            String type;
            if (doc instanceof ReportDocumentRenderer || doc instanceof SitePluginReportDocumentRenderer) {
                type = "report";
            } else {
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `org.apache.maven.project.MavenProject`
in `src/main/java/org/apache/maven/plugins/site/deploy/SiteStageDeployMojo.java`
#### Snippet
```java
     * This climbs up the project hierarchy and returns the site of the top most
     * project for which
     * {@link #getStagingSiteURL(org.apache.maven.project.MavenProject)} returns
     * same URL as actual.
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.plugin.Mojo`
in `src/main/java/org/apache/maven/plugins/site/render/SiteJarMojo.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.Mojo#execute()
     */
    public void execute() throws MojoExecutionException, MojoFailureException {
```

### JavadocReference
Cannot resolve symbol `execute()`
in `src/main/java/org/apache/maven/plugins/site/render/SiteJarMojo.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.Mojo#execute()
     */
    public void execute() throws MojoExecutionException, MojoFailureException {
```

### JavadocReference
Cannot resolve symbol `ArchiverException`
in `src/main/java/org/apache/maven/plugins/site/render/SiteJarMojo.java`
#### Snippet
```java
     * @param jarFilename   the filename of the created jar file
     * @return a File object that contains the created jar file
     * @throws ArchiverException
     * @throws IOException
     * @throws ManifestException
```

### JavadocReference
Cannot resolve symbol `ManifestException`
in `src/main/java/org/apache/maven/plugins/site/render/SiteJarMojo.java`
#### Snippet
```java
     * @throws ArchiverException
     * @throws IOException
     * @throws ManifestException
     * @throws DependencyResolutionRequiredException
     */
```

### JavadocReference
Cannot resolve symbol `DependencyResolutionRequiredException`
in `src/main/java/org/apache/maven/plugins/site/render/SiteJarMojo.java`
#### Snippet
```java
     * @throws IOException
     * @throws ManifestException
     * @throws DependencyResolutionRequiredException
     */
    private File createArchive(File siteDirectory, String jarFilename)
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.plugin.AbstractMojo`
in `src/main/java/org/apache/maven/plugins/site/run/SiteRunMojo.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.AbstractMojo#execute()
     */
    public void execute() throws MojoExecutionException, MojoFailureException {
```

### JavadocReference
Cannot resolve symbol `execute()`
in `src/main/java/org/apache/maven/plugins/site/run/SiteRunMojo.java`
#### Snippet
```java

    /**
     * @see org.apache.maven.plugin.AbstractMojo#execute()
     */
    public void execute() throws MojoExecutionException, MojoFailureException {
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.doxia.siterenderer.DoxiaDocumentRenderer`
in `src/main/java/org/apache/maven/plugins/site/render/ReportDocumentRenderer.java`
#### Snippet
```java
 *
 * @author <a href="mailto:brett@apache.org">Brett Porter</a>
 * @see org.apache.maven.doxia.siterenderer.DoxiaDocumentRenderer
 */
public class ReportDocumentRenderer implements DocumentRenderer {
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/site/deploy/AbstractDeployMojo.java`
#### Snippet
```java
     *
     * @return the site for deployment
     * @throws MojoExecutionException in case of issue
     * @see #determineDeploySite()
     */
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/site/deploy/AbstractDeployMojo.java`
#### Snippet
```java
     *
     * @return the relative path or "./" if the two URLs are the same.
     * @throws MojoExecutionException in case of issue
     */
    protected String getDeployModuleDirectory() throws MojoExecutionException {
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/site/deploy/AbstractDeployMojo.java`
#### Snippet
```java
     *
     * @return the site for deployment
     * @throws MojoExecutionException in case of issue
     * @see #determineTopDistributionManagementSiteUrl()
     */
```

### JavadocReference
Cannot resolve symbol `Repository`
in `src/main/java/org/apache/maven/plugins/site/deploy/AbstractDeployMojo.java`
#### Snippet
```java
     *
     * @param repository the repository to deploy to.
     *                   This needs to contain a valid, non-null {@link Repository#getId() id}
     *                   to look up credentials for the deploy, and a valid, non-null
     *                   {@link Repository#getUrl() scm url} to deploy to.
```

### JavadocReference
Cannot resolve symbol `getId()`
in `src/main/java/org/apache/maven/plugins/site/deploy/AbstractDeployMojo.java`
#### Snippet
```java
     *
     * @param repository the repository to deploy to.
     *                   This needs to contain a valid, non-null {@link Repository#getId() id}
     *                   to look up credentials for the deploy, and a valid, non-null
     *                   {@link Repository#getUrl() scm url} to deploy to.
```

### JavadocReference
Cannot resolve symbol `Repository`
in `src/main/java/org/apache/maven/plugins/site/deploy/AbstractDeployMojo.java`
#### Snippet
```java
     *                   This needs to contain a valid, non-null {@link Repository#getId() id}
     *                   to look up credentials for the deploy, and a valid, non-null
     *                   {@link Repository#getUrl() scm url} to deploy to.
     * @throws MojoExecutionException if the deploy fails.
     */
```

### JavadocReference
Cannot resolve symbol `getUrl()`
in `src/main/java/org/apache/maven/plugins/site/deploy/AbstractDeployMojo.java`
#### Snippet
```java
     *                   This needs to contain a valid, non-null {@link Repository#getId() id}
     *                   to look up credentials for the deploy, and a valid, non-null
     *                   {@link Repository#getUrl() scm url} to deploy to.
     * @throws MojoExecutionException if the deploy fails.
     */
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/site/deploy/AbstractDeployMojo.java`
#### Snippet
```java
     *                   to look up credentials for the deploy, and a valid, non-null
     *                   {@link Repository#getUrl() scm url} to deploy to.
     * @throws MojoExecutionException if the deploy fails.
     */
    private void deployTo(final Repository repository) throws MojoExecutionException {
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.project.MavenProject`
in `src/main/java/org/apache/maven/plugins/site/deploy/AbstractDeployMojo.java`
#### Snippet
```java
     * Extract the distributionManagement site of the top level parent of the given MavenProject.
     * This climbs up the project hierarchy and returns the site of the last project
     * for which {@link #getSite(org.apache.maven.project.MavenProject)} returns a site that resides in the
     * same site. Notice that it doesn't take into account if the parent is in the reactor or not.
     *
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/site/deploy/AbstractDeployMojo.java`
#### Snippet
```java
     * @return the top level site. Not <code>null</code>.
     *         Also site.getUrl() and site.getId() are guaranteed to be not <code>null</code>.
     * @throws MojoExecutionException if no site info is found in the tree.
     * @see URIPathDescriptor#sameSite(java.net.URI)
     */
```

### JavadocReference
Cannot resolve symbol `URIPathDescriptor`
in `src/main/java/org/apache/maven/plugins/site/deploy/AbstractDeployMojo.java`
#### Snippet
```java
     *         Also site.getUrl() and site.getId() are guaranteed to be not <code>null</code>.
     * @throws MojoExecutionException if no site info is found in the tree.
     * @see URIPathDescriptor#sameSite(java.net.URI)
     */
    protected MavenProject getTopLevelProject(MavenProject project) throws MojoExecutionException {
```

### JavadocReference
Cannot resolve symbol `sameSite(java.net.URI)`
in `src/main/java/org/apache/maven/plugins/site/deploy/AbstractDeployMojo.java`
#### Snippet
```java
     *         Also site.getUrl() and site.getId() are guaranteed to be not <code>null</code>.
     * @throws MojoExecutionException if no site info is found in the tree.
     * @see URIPathDescriptor#sameSite(java.net.URI)
     */
    protected MavenProject getTopLevelProject(MavenProject project) throws MojoExecutionException {
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/site/deploy/AbstractDeployMojo.java`
#### Snippet
```java
     * @return the project site. Not null.
     *         Also site.getUrl() and site.getId() are guaranteed to be not null.
     * @throws MojoExecutionException if any of the site info is missing.
     */
    protected static Site getSite(final MavenProject project) throws MojoExecutionException {
```

### JavadocReference
Cannot resolve symbol `RendererException`
in `src/main/java/org/apache/maven/plugins/site/render/AbstractSiteRenderingMojo.java`
#### Snippet
```java
     * @return the documents and their renderers
     * @throws IOException in case of file reading issue
     * @throws RendererException in case of Doxia rendering issue
     * @see CategorySummaryDocumentRenderer
     */
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getRenderingContext` will produce `NullPointerException`
in `src/main/java/org/apache/maven/plugins/site/run/DoxiaFilter.java`
#### Snippet
```java
            source = ((SitePluginReportDocumentRenderer) docRenderer).getReportMojoInfo();
        } else {
            source = docRenderer.getRenderingContext().getGenerator() != null
                    ? docRenderer.getRenderingContext().getGenerator()
                    : docRenderer.getClass().getName();
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/main/java/org/apache/maven/plugins/site/descriptor/EffectiveSiteMojo.java`
#### Snippet
```java
        effectiveSite = effectiveSite.substring(effectiveSite.indexOf("<project ")); // remove "<?xml" header

        writeComment(writer, "Effective site descriptor for project \'" + project.getId() + "\'");

        writer.writeMarkup(effectiveSite);
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/main/java/org/apache/maven/plugins/site/descriptor/EffectiveSiteMojo.java`
#### Snippet
```java
        effectiveSite = effectiveSite.substring(effectiveSite.indexOf("<project ")); // remove "<?xml" header

        writeComment(writer, "Effective site descriptor for project \'" + project.getId() + "\'");

        writer.writeMarkup(effectiveSite);
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `c` to `int` is redundant
in `src/main/java/org/apache/maven/plugins/site/deploy/AbstractDeployMojo.java`
#### Snippet
```java
                } else {
                    uri.append('%');
                    uri.append(Integer.toHexString((int) c));
                }
            }
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/maven/plugins/site/render/SiteJarMojo.java`
#### Snippet
```java
     * @param jarFilename   the filename of the created jar file
     * @return a File object that contains the created jar file
     * @throws ArchiverException
     * @throws IOException
     * @throws ManifestException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/maven/plugins/site/render/SiteJarMojo.java`
#### Snippet
```java
     * @return a File object that contains the created jar file
     * @throws ArchiverException
     * @throws IOException
     * @throws ManifestException
     * @throws DependencyResolutionRequiredException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/maven/plugins/site/render/SiteJarMojo.java`
#### Snippet
```java
     * @throws ArchiverException
     * @throws IOException
     * @throws ManifestException
     * @throws DependencyResolutionRequiredException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/maven/plugins/site/render/SiteJarMojo.java`
#### Snippet
```java
     * @throws IOException
     * @throws ManifestException
     * @throws DependencyResolutionRequiredException
     */
    private File createArchive(File siteDirectory, String jarFilename)
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `outputName` initializer `""` is redundant
in `src/main/java/org/apache/maven/plugins/site/render/ReportDocumentRenderer.java`
#### Snippet
```java

        // render sub-sinks, eventually created by multi-page reports
        String outputName = "";
        List<MultiPageSubSink> sinks = multiPageSinkFactory.sinks();

```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `docRenderingContext` may be 'final'
in `src/main/java/org/apache/maven/plugins/site/render/SitemapDocumentRenderer.java`
#### Snippet
```java
 */
public class SitemapDocumentRenderer implements SitePluginReportDocumentRenderer {
    private DocumentRenderingContext docRenderingContext;

    private final String reportMojoInfo;
```

### FieldMayBeFinal
Field `i18n` may be 'final'
in `src/main/java/org/apache/maven/plugins/site/render/SitemapDocumentRenderer.java`
#### Snippet
```java
    private SiteModel siteModel;

    private I18N i18n;

    private final Log log;
```

### FieldMayBeFinal
Field `siteModel` may be 'final'
in `src/main/java/org/apache/maven/plugins/site/render/SitemapDocumentRenderer.java`
#### Snippet
```java
    String title;

    private SiteModel siteModel;

    private I18N i18n;
```

### FieldMayBeFinal
Field `archive` may be 'final'
in `src/main/java/org/apache/maven/plugins/site/render/SiteJarMojo.java`
#### Snippet
```java
     */
    @Parameter
    private MavenArchiveConfiguration archive = new MavenArchiveConfiguration();

    /**
```

### FieldMayBeFinal
Field `categoryReports` may be 'final'
in `src/main/java/org/apache/maven/plugins/site/render/CategorySummaryDocumentRenderer.java`
#### Snippet
```java
    private I18N i18n;

    private List<MavenReport> categoryReports;

    private final Log log;
```

### FieldMayBeFinal
Field `title` may be 'final'
in `src/main/java/org/apache/maven/plugins/site/render/CategorySummaryDocumentRenderer.java`
#### Snippet
```java
    private final String reportMojoInfo;

    private String title;

    private String desc1;
```

### FieldMayBeFinal
Field `desc2` may be 'final'
in `src/main/java/org/apache/maven/plugins/site/render/CategorySummaryDocumentRenderer.java`
#### Snippet
```java
    private String desc1;

    private String desc2;

    private I18N i18n;
```

### FieldMayBeFinal
Field `desc1` may be 'final'
in `src/main/java/org/apache/maven/plugins/site/render/CategorySummaryDocumentRenderer.java`
#### Snippet
```java
    private String title;

    private String desc1;

    private String desc2;
```

### FieldMayBeFinal
Field `docRenderingContext` may be 'final'
in `src/main/java/org/apache/maven/plugins/site/render/CategorySummaryDocumentRenderer.java`
#### Snippet
```java
 */
public class CategorySummaryDocumentRenderer implements SitePluginReportDocumentRenderer {
    private DocumentRenderingContext docRenderingContext;

    private final String reportMojoInfo;
```

### FieldMayBeFinal
Field `i18n` may be 'final'
in `src/main/java/org/apache/maven/plugins/site/render/CategorySummaryDocumentRenderer.java`
#### Snippet
```java
    private String desc2;

    private I18N i18n;

    private List<MavenReport> categoryReports;
```

### FieldMayBeFinal
Field `docRenderingContext` may be 'final'
in `src/main/java/org/apache/maven/plugins/site/render/ReportDocumentRenderer.java`
#### Snippet
```java
         * The main DocumentRenderingContext, which is the base for the DocumentRenderingContext of subpages
         */
        private DocumentRenderingContext docRenderingContext;

        /**
```

### FieldMayBeFinal
Field `outputDir` may be 'final'
in `src/main/java/org/apache/maven/plugins/site/render/ReportDocumentRenderer.java`
#### Snippet
```java

    private static class MultiPageSubSink extends SiteRendererSink {
        private File outputDir;

        private String outputName;
```

### FieldMayBeFinal
Field `outputName` may be 'final'
in `src/main/java/org/apache/maven/plugins/site/render/ReportDocumentRenderer.java`
#### Snippet
```java
        private File outputDir;

        private String outputName;

        MultiPageSubSink(File outputDir, String outputName, DocumentRenderingContext docRenderingContext) {
```

### FieldMayBeFinal
Field `sinks` may be 'final'
in `src/main/java/org/apache/maven/plugins/site/render/ReportDocumentRenderer.java`
#### Snippet
```java
         * List of sinks (subpages) associated to this report
         */
        private List<MultiPageSubSink> sinks = new ArrayList<MultiPageSubSink>();

        MultiPageSinkFactory(MavenReport report, DocumentRenderingContext docRenderingContext) {
```

### FieldMayBeFinal
Field `report` may be 'final'
in `src/main/java/org/apache/maven/plugins/site/render/ReportDocumentRenderer.java`
#### Snippet
```java
         * The report that is (maybe) generating multiple pages
         */
        private MavenReport report;

        /**
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `docRenderer` is always 'null'
in `src/main/java/org/apache/maven/plugins/site/run/DoxiaFilter.java`
#### Snippet
```java
        if (docRenderer instanceof DoxiaDocumentRenderer) {
            source = docRenderer.getRenderingContext().getDoxiaSourcePath();
        } else if (docRenderer instanceof ReportDocumentRenderer) {
            source = ((ReportDocumentRenderer) docRenderer).getReportMojoInfo();
            if (source == null) {
```

### ConstantValue
Value `docRenderer` is always 'null'
in `src/main/java/org/apache/maven/plugins/site/run/DoxiaFilter.java`
#### Snippet
```java
                source = "(unknown)";
            }
        } else if (docRenderer instanceof SitePluginReportDocumentRenderer) {
            source = ((SitePluginReportDocumentRenderer) docRenderer).getReportMojoInfo();
        } else {
```

### ConstantValue
Condition `classLoader != null` is always `true`
in `src/main/java/org/apache/maven/plugins/site/render/ReportDocumentRenderer.java`
#### Snippet
```java
                    e);
        } finally {
            if (classLoader != null) {
                Thread.currentThread().setContextClassLoader(originalClassLoader);
            }
```

### ConstantValue
Value `doc` is always 'null'
in `src/main/java/org/apache/maven/plugins/site/render/SiteMojo.java`
#### Snippet
```java
        for (DocumentRenderer doc : documents) {
            String type;
            if (doc instanceof ReportDocumentRenderer || doc instanceof SitePluginReportDocumentRenderer) {
                type = "report";
            } else {
```

### ConstantValue
Value `doc` is always 'null'
in `src/main/java/org/apache/maven/plugins/site/render/SiteMojo.java`
#### Snippet
```java
                counts.put(parserId, count);
            } else {
                nonDoxiaDocuments.add(doc);
            }
        }
```

### ConstantValue
Condition `nonProxyHostPrefix != null` is always `true`
in `src/main/java/org/apache/maven/plugins/site/deploy/AbstractDeployMojo.java`
#### Snippet
```java
                String nonProxyHostSuffix = nonProxyHost.substring(pos + 1);
                // prefix*
                if ((nonProxyHostPrefix != null && !nonProxyHostPrefix.isEmpty())
                        && host.startsWith(nonProxyHostPrefix)
                        && (nonProxyHostSuffix == null || nonProxyHostSuffix.isEmpty())) {
```

### ConstantValue
Condition `nonProxyHostSuffix == null` is always `false`
in `src/main/java/org/apache/maven/plugins/site/deploy/AbstractDeployMojo.java`
#### Snippet
```java
                if ((nonProxyHostPrefix != null && !nonProxyHostPrefix.isEmpty())
                        && host.startsWith(nonProxyHostPrefix)
                        && (nonProxyHostSuffix == null || nonProxyHostSuffix.isEmpty())) {
                    return null;
                }
```

### ConstantValue
Condition `nonProxyHostPrefix == null` is always `false`
in `src/main/java/org/apache/maven/plugins/site/deploy/AbstractDeployMojo.java`
#### Snippet
```java
                }
                // *suffix
                if ((nonProxyHostPrefix == null || nonProxyHostPrefix.isEmpty())
                        && (nonProxyHostSuffix != null && !nonProxyHostSuffix.isEmpty())
                        && host.endsWith(nonProxyHostSuffix)) {
```

### ConstantValue
Condition `nonProxyHostSuffix != null` is always `true`
in `src/main/java/org/apache/maven/plugins/site/deploy/AbstractDeployMojo.java`
#### Snippet
```java
                // *suffix
                if ((nonProxyHostPrefix == null || nonProxyHostPrefix.isEmpty())
                        && (nonProxyHostSuffix != null && !nonProxyHostSuffix.isEmpty())
                        && host.endsWith(nonProxyHostSuffix)) {
                    return null;
```

### ConstantValue
Condition `nonProxyHostPrefix != null` is always `true`
in `src/main/java/org/apache/maven/plugins/site/deploy/AbstractDeployMojo.java`
#### Snippet
```java
                }
                // prefix*suffix
                if ((nonProxyHostPrefix != null && !nonProxyHostPrefix.isEmpty())
                        && host.startsWith(nonProxyHostPrefix)
                        && (nonProxyHostSuffix != null && !nonProxyHostSuffix.isEmpty())
```

### ConstantValue
Condition `nonProxyHostSuffix != null` is always `true`
in `src/main/java/org/apache/maven/plugins/site/deploy/AbstractDeployMojo.java`
#### Snippet
```java
                if ((nonProxyHostPrefix != null && !nonProxyHostPrefix.isEmpty())
                        && host.startsWith(nonProxyHostPrefix)
                        && (nonProxyHostSuffix != null && !nonProxyHostSuffix.isEmpty())
                        && host.endsWith(nonProxyHostSuffix)) {
                    return null;
```

### ConstantValue
Condition `proxyInfo == null` is always `true`
in `src/main/java/org/apache/maven/plugins/site/deploy/AbstractDeployMojo.java`
#### Snippet
```java
                getLog().debug("connect with proxyInfo");
                wagon.connect(repository, authenticationInfo, proxyInfo);
            } else if (proxyInfo == null && authenticationInfo != null) {
                getLog().debug("connect with authenticationInfo and without proxyInfo");
                wagon.connect(repository, authenticationInfo);
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/plugins/site/deploy/SiteStageMojo.java`
#### Snippet
```java
        // Safety
        if (!outputDirectory.exists()) {
            outputDirectory.mkdirs();
        }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/plugins/site/run/SiteRunMojo.java`
#### Snippet
```java
    private WebAppContext createWebApplication() throws MojoExecutionException {
        File webXml = new File(tempWebappDirectory, "WEB-INF/web.xml");
        webXml.getParentFile().mkdirs();

        try (InputStream inStream = getClass().getResourceAsStream("/run/web.xml"); //
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/plugins/site/descriptor/SiteDescriptorArtifactMetadata.java`
#### Snippet
```java
                localRepository.getBasedir(), localRepository.pathOfLocalRepositoryMetadata(this, remoteRepository));

        destination.getParentFile().mkdirs();

        try (Writer writer = WriterFactory.newXmlWriter(destination)) {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/plugins/site/render/ReportDocumentRenderer.java`
#### Snippet
```java
            // Create directories if necessary
            if (!mySink.getOutputDir().exists()) {
                mySink.getOutputDir().mkdirs();
            }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/plugins/site/render/SiteMojo.java`
#### Snippet
```java
        // Safety
        if (!file.exists()) {
            file.mkdirs();
        }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/plugins/site/descriptor/EffectiveSiteMojo.java`
#### Snippet
```java
    protected static void writeXmlFile(File output, String content) throws IOException {
        try (Writer out = WriterFactory.newXmlWriter(output)) {
            output.getParentFile().mkdirs();

            out.write(content);
```

