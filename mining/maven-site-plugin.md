# maven-site-plugin 
 
# Bad smells
I found 56 bad smells with 6 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 17 | false |
| UnnecessaryFullyQualifiedName | 9 | false |
| BoundedWildcard | 7 | false |
| IgnoreResultOfCall | 6 | false |
| UnnecessaryStringEscape | 2 | true |
| Java8MapApi | 2 | false |
| SizeReplaceableByIsEmpty | 2 | true |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| MissingDeprecatedAnnotation | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| DataFlowIssue | 1 | false |
| NestedAssignment | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| CodeBlock2Expr | 1 | true |
| GroovyUnusedAssignment | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| StringEqualsEmptyString | 1 | false |
| ConstantValue | 1 | false |
## RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new ReportPlugin\[reportingPlugins.size()\]'
in `src/main/java/org/apache/maven/plugins/site/render/AbstractSiteRenderingMojo.java`
#### Snippet
```java
            reportingPlugins.add(mpir);
        }
        return reportingPlugins.toArray(new ReportPlugin[reportingPlugins.size()]);
    }

```

## RuleId[ruleID=MissingDeprecatedAnnotation]
### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `src/main/java/org/apache/maven/plugins/site/render/AbstractSiteRenderingMojo.java`
#### Snippet
```java
     */
    @Parameter(defaultValue = "${basedir}/xdocs")
    private File xdocDirectory;

    /**
```

## RuleId[ruleID=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `src/main/java/org/apache/maven/plugins/site/run/SiteRunMojo.java`
#### Snippet
```java
                Map<String, DocumentRenderer> i18nDocuments = locateDocuments(i18nContext, reports, locale);
                DoxiaBean doxiaBean;
                if (defaultLocale.equals(locale)) {
                    i18nGeneratedSiteContext.addSiteDirectory(generatedSiteDirectory);
                    doxiaBean = new DoxiaBean(i18nContext, i18nDocuments, i18nGeneratedSiteContext);
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Argument `inStream` might be null
in `src/main/java/org/apache/maven/plugins/site/run/SiteRunMojo.java`
#### Snippet
```java
        try (InputStream inStream = getClass().getResourceAsStream("/run/web.xml"); //
                FileOutputStream outStream = new FileOutputStream(webXml)) {
            IOUtil.copy(inStream, outStream);
        } catch (IOException e) {
            throw new MojoExecutionException("Unable to construct temporary webapp for running site", e);
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.project` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/site/deploy/SiteStageDeployMojo.java`
#### Snippet
```java
     * This climbs up the project hierarchy and returns the site of the top most
     * project for which
     * {@link #getStagingSiteURL(org.apache.maven.project.MavenProject)} returns
     * same URL as actual.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/site/run/DoxiaFilter.java`
#### Snippet
```java

    /**
     * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
     */
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/site/run/DoxiaFilter.java`
#### Snippet
```java

    /**
     * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
     */
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/site/run/DoxiaFilter.java`
#### Snippet
```java

    /**
     * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
     */
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/site/run/DoxiaFilter.java`
#### Snippet
```java

    /**
     * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
     */
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/site/run/DoxiaFilter.java`
#### Snippet
```java

    /**
     * @see javax.servlet.Filter#destroy()
     */
    public void destroy() {}
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/site/run/DoxiaFilter.java`
#### Snippet
```java

    /**
     * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
     */
    public void init(FilterConfig filterConfig) throws ServletException {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.servlet` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/site/run/DoxiaFilter.java`
#### Snippet
```java

    /**
     * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
     */
    public void init(FilterConfig filterConfig) throws ServletException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.project` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/site/deploy/AbstractDeployMojo.java`
#### Snippet
```java
     * Extract the distributionManagement site of the top level parent of the given MavenProject.
     * This climbs up the project hierarchy and returns the site of the last project
     * for which {@link #getSite(org.apache.maven.project.MavenProject)} returns a site that resides in the
     * same site. Notice that it doesn't take into account if the parent is in the reactor or not.
     *
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/maven/plugins/site/deploy/SiteStageDeployMojo.java`
#### Snippet
```java
        // CHECKSTYLE_OFF: InnerAssignment
        while ( // MSITE-585, MNG-1943
        (parent = siteTool.getParentProject(current, reactorProjects, localRepository)) != null
                && stagingSiteURL.equals(getStagingSiteURL(parent))) {
            current = parent;
```

## RuleId[ruleID=UnnecessaryStringEscape]
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

## RuleId[ruleID=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'xdocDirectory' is still used
in `src/main/java/org/apache/maven/plugins/site/render/AbstractSiteRenderingMojo.java`
#### Snippet
```java
     */
    @Parameter(defaultValue = "${basedir}/xdocs")
    private File xdocDirectory;

    /**
```

## RuleId[ruleID=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/org/apache/maven/plugins/site/render/AbstractSiteRenderingMojo.java`
#### Snippet
```java
        MavenProject p = attributes.get("project") != null ? (MavenProject) attributes.get("project") : project;
        String outputTimestamp = p.getProperties().getProperty("project.build.outputTimestamp");
        MavenArchiver.parseBuildOutputTimestamp(outputTimestamp).ifPresent(v -> {
            context.setPublishDate(Date.from(v));
        });
```

## RuleId[ruleID=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `src/main/java/org/apache/maven/plugins/site/render/AbstractSiteRenderingMojo.java`
#### Snippet
```java
        for (MavenReport report : reports) {
            List<MavenReport> categoryReports = categories.get(report.getCategoryName());
            if (categoryReports == null) {
                categoryReports = new ArrayList<>();
                categories.put(report.getCategoryName(), categoryReports);
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `src/main/java/org/apache/maven/plugins/site/render/AbstractSiteRenderingMojo.java`
#### Snippet
```java
        }

        if (attributes.get("project") == null) {
            attributes.put("project", project);
        }
```

## RuleId[ruleID=GroovyUnusedAssignment]
### GroovyUnusedAssignment
Assignment is not used
in `src/it/projects/full-reporting/verify.groovy`
#### Snippet
```java
    index1 = i1;
    index2 = i2;
    previousReportLink = link;
}

```

## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-02-24-09-23-05.189.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/site/deploy/SiteStageMojo.java`
#### Snippet
```java
    private static MavenProject getExecutionRootProject(List<MavenProject> reactorProjects) {
        if (reactorProjects == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/site/deploy/SiteStageMojo.java`
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
in `src/main/java/org/apache/maven/plugins/site/deploy/SiteStageDeployMojo.java`
#### Snippet
```java

        if (project == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/site/deploy/SiteStageDeployMojo.java`
#### Snippet
```java
        final Build build = project.getBuild();
        if (build == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/site/deploy/SiteStageDeployMojo.java`
#### Snippet
```java
            final PluginManagement buildPluginManagement = build.getPluginManagement();
            if (buildPluginManagement == null) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/site/deploy/SiteStageDeployMojo.java`
#### Snippet
```java

        if (sitePlugin == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/site/deploy/SiteStageDeployMojo.java`
#### Snippet
```java
        final Xpp3Dom sitePluginConfiguration = (Xpp3Dom) sitePlugin.getConfiguration();
        if (sitePluginConfiguration == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/site/deploy/SiteStageDeployMojo.java`
#### Snippet
```java
        final Xpp3Dom child = sitePluginConfiguration.getChild("stagingSiteURL");
        if (child == null) {
            return null;
        } else {
            return child.getValue();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/site/render/ReportDocumentRenderer.java`
#### Snippet
```java
        public Sink createSink(OutputStream arg0) throws IOException {
            // Not used
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/site/render/ReportDocumentRenderer.java`
#### Snippet
```java
        public Sink createSink(File arg0, String arg1, String arg2) throws IOException {
            // Not used
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/site/render/ReportDocumentRenderer.java`
#### Snippet
```java
        public Sink createSink(OutputStream arg0, String arg1) throws IOException {
            // Not used
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/site/deploy/AbstractDeployMojo.java`
#### Snippet
```java

        if (proxyInfo == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/site/deploy/AbstractDeployMojo.java`
#### Snippet
```java
                        && host.startsWith(nonProxyHostPrefix)
                        && StringUtils.isEmpty(nonProxyHostSuffix)) {
                    return null;
                }
                // *suffix
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/site/deploy/AbstractDeployMojo.java`
#### Snippet
```java
                        && StringUtils.isNotEmpty(nonProxyHostSuffix)
                        && host.endsWith(nonProxyHostSuffix)) {
                    return null;
                }
                // prefix*suffix
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/site/deploy/AbstractDeployMojo.java`
#### Snippet
```java
                        && StringUtils.isNotEmpty(nonProxyHostSuffix)
                        && host.endsWith(nonProxyHostSuffix)) {
                    return null;
                }
            } else if (host.equals(nonProxyHost)) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/site/deploy/AbstractDeployMojo.java`
#### Snippet
```java
                }
            } else if (host.equals(nonProxyHost)) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/site/deploy/AbstractDeployMojo.java`
#### Snippet
```java
        }
        getLog().debug("getProxy 'protocol': " + protocol + " no ProxyInfo found");
        return null;
    }

```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`doxiaDocuments.size() > 0` can be replaced with '!doxiaDocuments.isEmpty()'
in `src/main/java/org/apache/maven/plugins/site/render/SiteMojo.java`
#### Snippet
```java
        }

        if (doxiaDocuments.size() > 0) {
            MessageBuilder mb = buffer();
            mb.a("Rendering ");
```

### SizeReplaceableByIsEmpty
`item.getHref().length() == 0` can be replaced with 'item.getHref().isEmpty()'
in `src/main/java/org/apache/maven/plugins/site/render/AbstractSiteRenderingMojo.java`
#### Snippet
```java
                    }

                    if (item.getHref() == null || item.getHref().length() == 0) {
                        item.setHref(report.getOutputName() + ".html");
                    }
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends MavenProject`
in `src/main/java/org/apache/maven/plugins/site/deploy/SiteStageMojo.java`
#### Snippet
```java
     * @return The execution root project in the reactor, or <code>null</code> if none can be found
     */
    private static MavenProject getExecutionRootProject(List<MavenProject> reactorProjects) {
        if (reactorProjects == null) {
            return null;
```

### BoundedWildcard
Can generalize to `? extends MenuItem`
in `src/main/java/org/apache/maven/plugins/site/render/SiteMap.java`
#### Snippet
```java
    }

    private static void extractItems(List<MenuItem> items, Sink sink) {
        if (items == null || items.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends MavenReport`
in `src/main/java/org/apache/maven/plugins/site/render/AbstractSiteRenderingMojo.java`
#### Snippet
```java
     * @return A map keyed category having the report itself as value
     */
    protected Map<String, List<MavenReport>> categoriseReports(Collection<MavenReport> reports) {
        Map<String, List<MavenReport>> categories = new LinkedHashMap<>();
        for (MavenReport report : reports) {
```

### BoundedWildcard
Can generalize to `? extends MavenReport`
in `src/main/java/org/apache/maven/plugins/site/render/AbstractSiteRenderingMojo.java`
#### Snippet
```java
    }

    private void populateItemRefs(List<MenuItem> items, Locale locale, Map<String, MavenReport> reportsByOutputName) {
        for (Iterator<MenuItem> i = items.iterator(); i.hasNext(); ) {
            MenuItem item = i.next();
```

### BoundedWildcard
Can generalize to `? extends MavenReportExecution`
in `src/main/java/org/apache/maven/plugins/site/render/AbstractSiteRenderingMojo.java`
#### Snippet
```java
     */
    protected Map<String, MavenReport> locateReports(
            List<MavenReportExecution> reports, Map<String, DocumentRenderer> documents, Locale locale) {
        Map<String, MavenReport> reportsByOutputName = new LinkedHashMap<>();
        for (MavenReportExecution mavenReportExecution : reports) {
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/maven/plugins/site/render/AbstractSiteRenderingMojo.java`
#### Snippet
```java
     */
    protected Map<String, MavenReport> locateReports(
            List<MavenReportExecution> reports, Map<String, DocumentRenderer> documents, Locale locale) {
        Map<String, MavenReport> reportsByOutputName = new LinkedHashMap<>();
        for (MavenReportExecution mavenReportExecution : reports) {
```

### BoundedWildcard
Can generalize to `? super DocumentRenderer`
in `src/main/java/org/apache/maven/plugins/site/render/AbstractSiteRenderingMojo.java`
#### Snippet
```java
     */
    protected Map<String, MavenReport> locateReports(
            List<MavenReportExecution> reports, Map<String, DocumentRenderer> documents, Locale locale) {
        Map<String, MavenReport> reportsByOutputName = new LinkedHashMap<>();
        for (MavenReportExecution mavenReportExecution : reports) {
```

## RuleId[ruleID=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/org/apache/maven/plugins/site/deploy/AbstractDeployMojo.java`
#### Snippet
```java
        relative = relative.replace('\\', '/');

        return ("".equals(relative)) ? "./" : relative;
    }

```

## RuleId[ruleID=ConstantValue]
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

## RuleId[ruleID=IgnoreResultOfCall]
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
in `src/main/java/org/apache/maven/plugins/site/descriptor/EffectiveSiteMojo.java`
#### Snippet
```java
    protected static void writeXmlFile(File output, String content) throws IOException {
        try (Writer out = WriterFactory.newXmlWriter(output)) {
            output.getParentFile().mkdirs();

            out.write(content);
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

