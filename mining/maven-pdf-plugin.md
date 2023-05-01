# maven-pdf-plugin 
 
# Bad smells
I found 35 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 16 | false |
| IgnoreResultOfCall | 8 | false |
| UNCHECKED_WARNING | 4 | false |
| JavadocDeclaration | 4 | false |
| DataFlowIssue | 1 | false |
| CommentedOutCode | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `src/main/java/org/apache/maven/plugins/pdf/TocFileHelper.java`
#### Snippet
```java
    static Map<String, Object> loadToc(File workingDirectory) throws IOException {
        try (Reader reader = ReaderFactory.newReader(getTocFile(workingDirectory), "UTF-8")) {
            return (Map) JSONParser.parseJSON(reader);
        }
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List\>'
in `src/main/java/org/apache/maven/plugins/pdf/PdfAggregateMojo.java`
#### Snippet
```java
        tocItem.setRef(stagedId + "/" + item.get("ref"));

        List<Map<String, Object>> items = (List) item.get("items");

        for (Map<String, Object> it : items) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List\>'
in `src/main/java/org/apache/maven/plugins/pdf/PdfAggregateMojo.java`
#### Snippet
```java
        Map<String, Object> toc = loadToc(project);

        List<Map<String, Object>> items = (ArrayList) toc.get("items");

        DocumentTOCItem tocItem = new DocumentTOCItem();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List\>'
in `src/main/java/org/apache/maven/plugins/pdf/PdfAggregateMojo.java`
#### Snippet
```java
        if (items.size() == 1 && "project-info".equals(items.get(0).get("ref"))) {
            // Special case where a sub-project only contains generated reports.
            items = (List) items.get(0).get("items");
        }

```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `Developer`
in `src/main/java/org/apache/maven/plugins/pdf/DocumentModelBuilder.java`
#### Snippet
```java

    /**
     * Wrap the list of project {@link Developer} to a list of {@link DocumentAuthor}.
     *
     * @param project the MavenProject to extract the authors from.
```

### JavadocReference
Cannot resolve symbol `DocumentAuthor`
in `src/main/java/org/apache/maven/plugins/pdf/DocumentModelBuilder.java`
#### Snippet
```java

    /**
     * Wrap the list of project {@link Developer} to a list of {@link DocumentAuthor}.
     *
     * @param project the MavenProject to extract the authors from.
```

### JavadocReference
Cannot resolve symbol `XmlPullParserException`
in `src/main/java/org/apache/maven/plugins/pdf/DocumentDescriptorReader.java`
#### Snippet
```java
     * @param docDescriptor not null, corresponding to non-localized descriptor file.
     * @return a DocumentModel instance.
     * @throws XmlPullParserException if an error occurs during parsing.
     * @throws IOException if an error occurs during reading.
     */
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/pdf/PdfMojo.java`
#### Snippet
```java
     * @param locale not null
     * @throws IOException if any
     * @throws MojoExecutionException if any
     * @since 1.1
     */
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/pdf/PdfMojo.java`
#### Snippet
```java
     * Copy the generated PDF to outputDirectory.
     *
     * @throws MojoExecutionException if any
     * @throws IOException if any
     * @since 1.1
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/pdf/PdfMojo.java`
#### Snippet
```java
     * Generate the PDF.
     *
     * @throws MojoExecutionException if any
     * @throws IOException if any
     * @since 1.1
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/pdf/PdfMojo.java`
#### Snippet
```java
     *
     * @param locale not null
     * @throws MojoExecutionException if any
     * @throws IOException if any
     * @since 1.1
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.plugin.MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/pdf/PdfMojo.java`
#### Snippet
```java
     * @param locale used to set the language.
     * @return the DocumentModel read from the configured document descriptor.
     * @throws org.apache.maven.plugin.MojoExecutionException if the model could not be read.
     */
    private DocumentModel getDocumentModelFromDescriptor(Locale locale) throws MojoExecutionException {
```

### JavadocReference
Cannot resolve symbol `MavenReportException`
in `src/main/java/org/apache/maven/plugins/pdf/PdfMojo.java`
#### Snippet
```java
     * @param locale
     * @param sink
     * @throws MavenReportException
     */
    private void renderReportToSink(MavenReportExecution reportExec, Locale locale, PdfXdocSink sink)
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/pdf/PdfMojo.java`
#### Snippet
```java
    /**
     * @return the DecorationModel instance from <code>site.xml</code>
     * @throws MojoExecutionException if any
     */
    private DecorationModel getDefaultDecorationModel() throws MojoExecutionException {
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.reporting.AbstractMavenReport`
in `src/main/java/org/apache/maven/plugins/pdf/PdfMojo.java`
#### Snippet
```java
     * <br>
     * <b>Note</b>: try also to fix the content due to some issues in
     * {@link org.apache.maven.reporting.AbstractMavenReport}.
     *
     * @param content the given content
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/pdf/PdfMojo.java`
#### Snippet
```java
     * @param locale not null
     * @return DocumentModel.
     * @throws MojoExecutionException if any
     * @see #appendGeneratedReports(DocumentModel, Locale)
     */
```

### JavadocReference
Cannot resolve symbol `DocumentModel`
in `src/main/java/org/apache/maven/plugins/pdf/PdfMojo.java`
#### Snippet
```java
     * @return DocumentModel.
     * @throws MojoExecutionException if any
     * @see #appendGeneratedReports(DocumentModel, Locale)
     */
    private DocumentModel getDocumentModel(Locale locale) throws MojoExecutionException {
```

### JavadocReference
Cannot resolve symbol `FileUtils`
in `src/main/java/org/apache/maven/plugins/pdf/PdfMojo.java`
#### Snippet
```java
     * @param defaultLocale the default locale.
     * @return the comma separated list of default excludes and locales dir.
     * @see FileUtils#getDefaultExcludesAsString()
     * @since 1.1
     */
```

### JavadocReference
Cannot resolve symbol `getDefaultExcludesAsString()`
in `src/main/java/org/apache/maven/plugins/pdf/PdfMojo.java`
#### Snippet
```java
     * @param defaultLocale the default locale.
     * @return the comma separated list of default excludes and locales dir.
     * @see FileUtils#getDefaultExcludesAsString()
     * @since 1.1
     */
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/pdf/PdfMojo.java`
#### Snippet
```java
     *
     * @param locale not null
     * @throws MojoExecutionException if any
     * @see #getDefaultDecorationModel()
     */
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `exists` may produce `NullPointerException`
in `src/main/java/org/apache/maven/plugins/pdf/PdfAggregateMojo.java`
#### Snippet
```java
            getLog().error("unexpected IOException while getting aggregator root tmp site dir", ioe);
        }
        if (!dstSiteTmp.exists()) {
            getLog().error("Top-level project does not have src.tmp directory");
            return;
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param reportExec` tag description is missing
in `src/main/java/org/apache/maven/plugins/pdf/PdfMojo.java`
#### Snippet
```java
     * see org.apache.maven.plugins.site.render.ReportDocumentRenderer#renderDocument(...)
     *
     * @param reportExec
     * @param locale
     * @param sink
```

### JavadocDeclaration
`@param locale` tag description is missing
in `src/main/java/org/apache/maven/plugins/pdf/PdfMojo.java`
#### Snippet
```java
     *
     * @param reportExec
     * @param locale
     * @param sink
     * @throws MavenReportException
```

### JavadocDeclaration
`@param sink` tag description is missing
in `src/main/java/org/apache/maven/plugins/pdf/PdfMojo.java`
#### Snippet
```java
     * @param reportExec
     * @param locale
     * @param sink
     * @throws MavenReportException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/maven/plugins/pdf/PdfMojo.java`
#### Snippet
```java
     * @param locale
     * @param sink
     * @throws MavenReportException
     */
    private void renderReportToSink(MavenReportExecution reportExec, Locale locale, PdfXdocSink sink)
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/maven/plugins/pdf/DocumentModelBuilder.java`
#### Snippet
```java
        // meta.setGenerator( generator );
        meta.setInitialCreator(System.getProperty("user.name"));
        // meta.setLanguage( locale == null ? null : locale.getLanguage() );
        // meta.setPageSize( pageSize );
        meta.setSubject(getProjectName(project));
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `reactorProjects` are queried, but never updated
in `src/main/java/org/apache/maven/plugins/pdf/PdfAggregateMojo.java`
#### Snippet
```java
     */
    @Parameter(defaultValue = "${reactorProjects}", required = true, readonly = true)
    private List<MavenProject> reactorProjects;

    /**
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/plugins/pdf/PdfAggregateMojo.java`
#### Snippet
```java

    protected void prepareTempSiteDirectory(final File tmpSiteDir) {
        tmpSiteDir.mkdirs();
    }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/plugins/pdf/PdfMojo.java`
#### Snippet
```java
            outDir = new File(new File(getGeneratedSiteDirectoryTmp(), locale.getLanguage()), "xdoc");
        }
        outDir.mkdirs();

        File generatedReport = new File(outDir, report.getOutputName() + ".xml");
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/main/java/org/apache/maven/plugins/pdf/PdfMojo.java`
#### Snippet
```java
            if (requireCopy) {
                FileUtils.copyFile(generatedPdfSource, generatedPdfDest);
                generatedPdfSource.delete();
            }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/plugins/pdf/PdfMojo.java`
#### Snippet
```java

            if (!outputDir.exists()) {
                outputDir.mkdirs();
            }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/plugins/pdf/PdfMojo.java`
#### Snippet
```java
                        File in = new File(fromLocale, generatedSiteFile);
                        File out = new File(new File(to, locale.getLanguage()), generatedSiteFile);
                        out.getParentFile().mkdirs();
                        FileUtils.copyFile(in, out);
                    }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/plugins/pdf/PdfMojo.java`
#### Snippet
```java
                    File in = new File(from, generatedSiteFile);
                    File out = new File(to, generatedSiteFile);
                    out.getParentFile().mkdirs();
                    FileUtils.copyFile(in, out);
                }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/plugins/pdf/PdfMojo.java`
#### Snippet
```java
    protected void prepareTempSiteDirectory(final File tmpSiteDir) throws IOException {
        // safety
        tmpSiteDir.mkdirs();

        // copy site
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/main/java/org/apache/maven/plugins/pdf/PdfMojo.java`
#### Snippet
```java
                FileUtils.deleteDirectory(file);
            } else {
                file.delete();
            }
        }
```

