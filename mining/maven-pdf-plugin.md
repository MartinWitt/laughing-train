# maven-pdf-plugin 
 
# Bad smells
I found 37 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SynchronizeOnThis | 10 | false |
| IgnoreResultOfCall | 8 | false |
| ReturnNull | 6 | false |
| UnnecessaryFullyQualifiedName | 2 | false |
| AssignmentToMethodParameter | 2 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| UnnecessarySuperQualifier | 1 | false |
| DataFlowIssue | 1 | false |
| CommentedOutCode | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 1 | false |
| CallToStringConcatCanBeReplacedByOperator | 1 | false |
| SizeReplaceableByIsEmpty | 1 | true |
| ZeroLengthArrayInitialization | 1 | false |
## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `TocFileHelper` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/maven/plugins/pdf/TocFileHelper.java`
#### Snippet
```java
 * @since 1.5
 */
class TocFileHelper {
    private static final String FILENAME = "toc.json";

```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/maven/plugins/pdf/PdfMojo.java`
#### Snippet
```java
                tableRows(null, false);
            }
            super.tableRow(null);
        }
    }
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.plugin` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/pdf/PdfMojo.java`
#### Snippet
```java
     * @param locale used to set the language.
     * @return the DocumentModel read from the configured document descriptor.
     * @throws org.apache.maven.plugin.MojoExecutionException if the model could not be read.
     */
    private DocumentModel getDocumentModelFromDescriptor(Locale locale) throws MojoExecutionException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.doxia.sink` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/maven/plugins/pdf/PdfMojo.java`
#### Snippet
```java
     * @since 1.1
     */
    private static class PdfXdocSink extends XdocSink implements org.codehaus.doxia.sink.Sink {
        protected PdfXdocSink(Writer writer) {
            super(writer);
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

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `date` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/maven/plugins/pdf/DateBean.java`
#### Snippet
```java
    }

    private Date date;

    /**
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `p`
in `src/main/java/org/apache/maven/plugins/pdf/PdfAggregateMojo.java`
#### Snippet
```java
        projectPath.addFirst(p.getArtifactId());
        while (p.getParent() != null) {
            p = p.getParent();
            projectPath.addFirst(p.getArtifactId());
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `docDescriptor`
in `src/main/java/org/apache/maven/plugins/pdf/DocumentDescriptorReader.java`
#### Snippet
```java

            if (localizedDocDescriptor.exists()) {
                docDescriptor = localizedDocDescriptor;
            }
        }
```

## RuleId[id=CallToStringConcatCanBeReplacedByOperator]
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `src/main/java/org/apache/maven/plugins/pdf/PdfMojo.java`
#### Snippet
```java
        String outputName = getDocumentModel(getDefaultLocale()).getOutputName().trim();
        if (!outputName.endsWith(".pdf")) {
            outputName = outputName.concat(".pdf");
        }

```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/pdf/DocumentModelBuilder.java`
#### Snippet
```java
    private static String getProjectModelEncoding(MavenProject project) {
        if (project == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/pdf/DocumentModelBuilder.java`
#### Snippet
```java
    private static String getProjectName(MavenProject project) {
        if (project == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/pdf/DocumentModelBuilder.java`
#### Snippet
```java
    private static List<DocumentAuthor> getAuthors(MavenProject project) {
        if (project == null || project.getDevelopers() == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/pdf/PdfMojo.java`
#### Snippet
```java
            getLog().error("ParseException: " + e.getMessage());
            getLog().debug(e);
            return null;
        } catch (ParserNotFoundException e) {
            getLog().error("ParserNotFoundException: " + e.getMessage());
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/pdf/PdfMojo.java`
#### Snippet
```java
            getLog().error("ParserNotFoundException: " + e.getMessage());
            getLog().debug(e);
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/pdf/DocumentDescriptorReader.java`
#### Snippet
```java
                    }

                    return null;
                }
            });
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`files.size() != 0` can be replaced with '!files.isEmpty()'
in `src/main/java/org/apache/maven/plugins/pdf/PdfMojo.java`
#### Snippet
```java
            }

            if (files.size() != 0) {
                String displayLanguage = locale.getDisplayLanguage(Locale.ENGLISH);

```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/maven/plugins/pdf/PdfMojo.java`
#### Snippet
```java
            reportingPlugins.add(mpir);
        }
        return reportingPlugins.toArray(new ReportPlugin[0]);
    }

```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/maven/plugins/pdf/DateBean.java`
#### Snippet
```java
     */
    public String getDay() {
        synchronized (this) {
            return DAY.format(date);
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/maven/plugins/pdf/DateBean.java`
#### Snippet
```java
     */
    public String getHour() {
        synchronized (this) {
            return HOUR.format(date);
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/maven/plugins/pdf/DateBean.java`
#### Snippet
```java
     */
    public String getMillisecond() {
        synchronized (this) {
            return MILLI_SECOND.format(date);
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/maven/plugins/pdf/DateBean.java`
#### Snippet
```java
     */
    public String getDateTime() {
        synchronized (this) {
            return DATE_TIME.format(date);
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/maven/plugins/pdf/DateBean.java`
#### Snippet
```java
     */
    public String getTime() {
        synchronized (this) {
            return TIME.format(date);
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/maven/plugins/pdf/DateBean.java`
#### Snippet
```java
     */
    public String getYear() {
        synchronized (this) {
            return YEAR.format(date);
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/maven/plugins/pdf/DateBean.java`
#### Snippet
```java
     */
    public String getDate() {
        synchronized (this) {
            return DATE.format(date);
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/maven/plugins/pdf/DateBean.java`
#### Snippet
```java
     */
    public String getMinute() {
        synchronized (this) {
            return MINUTE.format(date);
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/maven/plugins/pdf/DateBean.java`
#### Snippet
```java
     */
    public String getSecond() {
        synchronized (this) {
            return SECOND.format(date);
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/maven/plugins/pdf/DateBean.java`
#### Snippet
```java
     */
    public String getMonth() {
        synchronized (this) {
            return MONTH.format(date);
        }
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
            outDir = new File(new File(getGeneratedSiteDirectoryTmp(), locale.getLanguage()), "xdoc");
        }
        outDir.mkdirs();

        File generatedReport = new File(outDir, report.getOutputName() + ".xml");
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

