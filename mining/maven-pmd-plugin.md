# maven-pmd-plugin 
 
# Bad smells
I found 58 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 11 | false |
| IgnoreResultOfCall | 6 | false |
| RegExpRedundantEscape | 5 | false |
| SystemOutErr | 4 | false |
| UnnecessaryFullyQualifiedName | 4 | false |
| ReturnNull | 4 | false |
| DynamicRegexReplaceableByCompiledPattern | 3 | false |
| DefaultAnnotationParam | 2 | false |
| MismatchedCollectionQueryUpdate | 2 | false |
| Convert2Lambda | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| StringEqualsEmptyString | 2 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| NestedAssignment | 1 | false |
| CommentedOutCode | 1 | false |
| Java8MapApi | 1 | false |
| AssignmentToMethodParameter | 1 | false |
| MismatchedJavadocCode | 1 | false |
| NonStaticFinalLogger | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
| RedundantFileCreation | 1 | false |
| UnusedAssignment | 1 | false |
## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/maven/plugins/pmd/exec/CpdExecutor.java`
#### Snippet
```java
            // Note: can't use pb.inheritIO(), since System.out/System.err has been modified after process start
            // and inheritIO would only inherit file handles, not the changed streams.
            ProcessStreamHandler.start( p.getInputStream(), System.out );
            ProcessStreamHandler.start( p.getErrorStream(), System.err );
            int exit = p.waitFor();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/maven/plugins/pmd/exec/CpdExecutor.java`
#### Snippet
```java
            // and inheritIO would only inherit file handles, not the changed streams.
            ProcessStreamHandler.start( p.getInputStream(), System.out );
            ProcessStreamHandler.start( p.getErrorStream(), System.err );
            int exit = p.waitFor();
            LOG.debug( "CpdExecutor exit code: {}", exit );
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/maven/plugins/pmd/exec/PmdExecutor.java`
#### Snippet
```java
            // Note: can't use pb.inheritIO(), since System.out/System.err has been modified after process start
            // and inheritIO would only inherit file handles, not the changed streams.
            ProcessStreamHandler.start( p.getInputStream(), System.out );
            ProcessStreamHandler.start( p.getErrorStream(), System.err );
            int exit = p.waitFor();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/maven/plugins/pmd/exec/PmdExecutor.java`
#### Snippet
```java
            // and inheritIO would only inherit file handles, not the changed streams.
            ProcessStreamHandler.start( p.getInputStream(), System.out );
            ProcessStreamHandler.start( p.getErrorStream(), System.err );
            int exit = p.waitFor();
            LOG.debug( "PmdExecutor exit code: {}", exit );
```

## RuleId[ruleID=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/apache/maven/plugins/pmd/AbstractPmdReport.java`
#### Snippet
```java
     * @since 3.7
     */
    @Parameter( property = "pmd.excludeFromFailureFile", defaultValue = "" )
    protected String excludeFromFailureFile;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/apache/maven/plugins/pmd/AbstractPmdViolationCheckMojo.java`
#### Snippet
```java
     * @since 3.0
     */
    @Parameter( property = "pmd.excludeFromFailureFile", defaultValue = "" )
    private String excludeFromFailureFile;

```

## RuleId[ruleID=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'c != -1' covered by subsequent condition 'c == BOM'
in `src/main/java/org/apache/maven/plugins/pmd/exec/PmdResult.java`
#### Snippet
```java
            }

            while ( c != -1 && c == BOM )
            {
                c = super.read();
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/maven/plugins/pmd/CpdReportGenerator.java`
#### Snippet
```java
        if ( xrefLocation != null )
        {
            sink.link( xrefLocation + "/" + filename.replaceAll( "\\.java$", ".html" ).replace( '\\', '/' ) + "#L"
                + line );
        }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/maven/plugins/pmd/PmdReportGenerator.java`
#### Snippet
```java
        if ( xrefLocation != null )
        {
            sink.link( xrefLocation + "/" + currentFilename.replaceAll( "\\.java$", ".html" ) + "#L" + line );
        }
        sink.text( String.valueOf( line ) );
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/maven/plugins/pmd/PmdReport.java`
#### Snippet
```java
        // used in filenames on disk or produce ackward filenames.
        // replace all occurrences of the following characters: ? : & = %
        loc = loc.replaceAll( "[\\?\\:\\&\\=\\%]", "_" );

        if ( !loc.endsWith( ".xml" ) )
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.reporting` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/pmd/CpdReport.java`
#### Snippet
```java
     *
     * @return the renderer based on the configured output
     * @throws org.apache.maven.reporting.MavenReportException if no renderer found for the output type
     * @deprecated Use {@link CpdExecutor#createRenderer(String, String)} instead.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.reporting` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/pmd/exec/CpdExecutor.java`
#### Snippet
```java
     *
     * @return the renderer based on the configured output
     * @throws org.apache.maven.reporting.MavenReportException if no renderer found for the output type
     */
    public static CPDRenderer createRenderer( String format, String outputEncoding )
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.reporting` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/pmd/PmdReport.java`
#### Snippet
```java
     *
     * @return the renderer based on the configured output
     * @throws org.apache.maven.reporting.MavenReportException if no renderer found for the output type
     * @deprecated Use {@link PmdExecutor#createRenderer(String, String)} instead.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.reporting` is unnecessary and can be removed
in `src/main/java/org/apache/maven/plugins/pmd/exec/PmdExecutor.java`
#### Snippet
```java
     *
     * @return the renderer based on the configured output
     * @throws org.apache.maven.reporting.MavenReportException
     *             if no renderer found for the output type
     */
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`loc = loc + ".xml"` could be simplified to 'loc += ".xml"'
in `src/main/java/org/apache/maven/plugins/pmd/PmdReport.java`
#### Snippet
```java
        if ( !loc.endsWith( ".xml" ) )
        {
            loc = loc + ".xml";
        }

```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/maven/plugins/pmd/ExcludeDuplicationsFromFile.java`
#### Snippet
```java
        {
            String line;
            while ( ( line = reader.readLine() ) != null )
            {
                if ( !line.startsWith( "#" ) )
```

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (9 lines)
in `src/main/java/org/apache/maven/plugins/pmd/PmdReportGenerator.java`
#### Snippet
```java
    }

    // public List<Metric> getMetrics()
    // {
    // return metrics;
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `excludes` are queried, but never updated
in `src/main/java/org/apache/maven/plugins/pmd/AbstractPmdReport.java`
#### Snippet
```java
     */
    @Parameter
    private List<String> excludes;

    /**
```

### MismatchedCollectionQueryUpdate
Contents of collection `includes` are queried, but never updated
in `src/main/java/org/apache/maven/plugins/pmd/AbstractPmdReport.java`
#### Snippet
```java
     */
    @Parameter
    private List<String> includes;

    /**
```

## RuleId[ruleID=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\?` in RegExp
in `src/main/java/org/apache/maven/plugins/pmd/PmdReport.java`
#### Snippet
```java
        // used in filenames on disk or produce ackward filenames.
        // replace all occurrences of the following characters: ? : & = %
        loc = loc.replaceAll( "[\\?\\:\\&\\=\\%]", "_" );

        if ( !loc.endsWith( ".xml" ) )
```

### RegExpRedundantEscape
Redundant character escape `\\:` in RegExp
in `src/main/java/org/apache/maven/plugins/pmd/PmdReport.java`
#### Snippet
```java
        // used in filenames on disk or produce ackward filenames.
        // replace all occurrences of the following characters: ? : & = %
        loc = loc.replaceAll( "[\\?\\:\\&\\=\\%]", "_" );

        if ( !loc.endsWith( ".xml" ) )
```

### RegExpRedundantEscape
Redundant character escape `\\&` in RegExp
in `src/main/java/org/apache/maven/plugins/pmd/PmdReport.java`
#### Snippet
```java
        // used in filenames on disk or produce ackward filenames.
        // replace all occurrences of the following characters: ? : & = %
        loc = loc.replaceAll( "[\\?\\:\\&\\=\\%]", "_" );

        if ( !loc.endsWith( ".xml" ) )
```

### RegExpRedundantEscape
Redundant character escape `\\=` in RegExp
in `src/main/java/org/apache/maven/plugins/pmd/PmdReport.java`
#### Snippet
```java
        // used in filenames on disk or produce ackward filenames.
        // replace all occurrences of the following characters: ? : & = %
        loc = loc.replaceAll( "[\\?\\:\\&\\=\\%]", "_" );

        if ( !loc.endsWith( ".xml" ) )
```

### RegExpRedundantEscape
Redundant character escape `\\%` in RegExp
in `src/main/java/org/apache/maven/plugins/pmd/PmdReport.java`
#### Snippet
```java
        // used in filenames on disk or produce ackward filenames.
        // replace all occurrences of the following characters: ? : & = %
        loc = loc.replaceAll( "[\\?\\:\\&\\=\\%]", "_" );

        if ( !loc.endsWith( ".xml" ) )
```

## RuleId[ruleID=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `src/main/java/org/apache/maven/plugins/pmd/PmdReportGenerator.java`
#### Snippet
```java
            RulePriority priority = RulePriority.valueOf( violation.getPriority() );
            List<Violation> violationSegment = violationsByPriority.get( priority );
            if ( violationSegment == null )
            {
                violationSegment = new ArrayList<>();
```

## RuleId[ruleID=Convert2Lambda]
### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `src/main/java/org/apache/maven/plugins/pmd/PmdReportGenerator.java`
#### Snippet
```java
        sink.sectionTitle1_();

        Collections.sort( suppressedViolations, new Comparator<SuppressedViolation>()
        {
            @Override
            public int compare( SuppressedViolation o1, SuppressedViolation o2 )
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `src/main/java/org/apache/maven/plugins/pmd/PmdReportGenerator.java`
#### Snippet
```java
        // sort the problem by filename first, since PMD is executed multi-threaded
        // and might reports the results unsorted
        Collections.sort( processingErrors, new Comparator<ProcessingError>()
        {
            @Override
            public int compare( ProcessingError e1, ProcessingError e2 )
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `pkg`
in `src/main/java/org/apache/maven/plugins/pmd/PmdViolationCheckMojo.java`
#### Snippet
```java
                break;
            }
            pkg = pkg.substring( dot + 1 );
        }

```

## RuleId[ruleID=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return list but the return type is map
in `src/main/java/org/apache/maven/plugins/pmd/AbstractPmdReport.java`
#### Snippet
```java
     * Convenience method to get the list of files where the PMD tool will be executed
     *
     * @return a List of the files where the PMD tool will be executed
     * @throws IOException If an I/O error occurs during construction of the
     *                     canonical pathnames of the files
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/pmd/PmdCollectingRenderer.java`
#### Snippet
```java
    public String defaultFileExtension()
    {
        return null;
    }
    @Override
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/pmd/exec/CpdExecutor.java`
#### Snippet
```java
        if ( r == null )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/pmd/exec/PmdExecutor.java`
#### Snippet
```java
        if ( r == null )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/pmd/exec/PmdExecutor.java`
#### Snippet
```java
        if ( report == null )
        {
            return null;
        }

```

## RuleId[ruleID=NonStaticFinalLogger]
### NonStaticFinalLogger
Non-constant logger field `julLogger`
in `src/main/java/org/apache/maven/plugins/pmd/exec/Executor.java`
#### Snippet
```java
     * the logger might be garbage collected and the redirect to slf4j is gone.
     */
    private java.util.logging.Logger julLogger;

    protected void setupPmdLogging( boolean showPmdLog, String logLevel )
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `fileName` is redundant
in `src/main/java/org/apache/maven/plugins/pmd/ExcludeViolationsFromFile.java`
#### Snippet
```java
        else
        {
            final String fileName = fullPath;
            final int javaIdx = fileName.indexOf( File.separator + "java" + File.separator );
            return fileName.substring( javaIdx >= 0 ? javaIdx + 6 : 0, fileName.length() - 5 ).replace(
```

### UnnecessaryLocalVariable
Local variable `path` is redundant
in `src/main/java/org/apache/maven/plugins/pmd/PmdReport.java`
#### Snippet
```java
                getLog().debug( "Using aux classpath: " + classpath );
            }
            String path = StringUtils.join( classpath.iterator(), File.pathSeparator );
            return path;
        }
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/maven/plugins/pmd/AbstractPmdReport.java`
#### Snippet
```java
        if ( excludeRoots == null )
        {
            excludeRoots = new File[0];
        }

```

## RuleId[ruleID=RedundantFileCreation]
### RedundantFileCreation
`new File` is redundant
in `src/main/java/org/apache/maven/plugins/pmd/ExcludeViolationsFromFile.java`
#### Snippet
```java
        }
        final Properties props = new Properties();
        try ( FileInputStream fileInputStream = new FileInputStream( new File( excludeFromFailureFile ) ) )
        {
            props.load( fileInputStream );
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends File`
in `src/main/java/org/apache/maven/plugins/pmd/exec/CpdRequest.java`
#### Snippet
```java
    }

    public void addFiles( Collection<File> files )
    {
        this.files.addAll( files );
```

### BoundedWildcard
Can generalize to `? extends File`
in `src/main/java/org/apache/maven/plugins/pmd/AbstractPmdReport.java`
#### Snippet
```java
    }

    private boolean isDirectoryExcluded( Collection<File> excludeRootFiles, File sourceDirectoryToCheck )
    {
        boolean returnVal = false;
```

### BoundedWildcard
Can generalize to `? extends MavenProject`
in `src/main/java/org/apache/maven/plugins/pmd/AbstractPmdReport.java`
#### Snippet
```java
     */
    private Set<MavenProject> modulesForAggregatedProject( MavenProject aggregatedProject,
                                                           Map<Path, MavenProject> reactorProjectsMap )
    {
        // Maven does not supply an easy way to get the projects representing
```

### BoundedWildcard
Can generalize to `? extends D`
in `src/main/java/org/apache/maven/plugins/pmd/AbstractPmdViolationCheckMojo.java`
#### Snippet
```java
     * @param warnings list of warnings
     */
    protected void printErrors( final List<D> failures, final List<D> warnings )
    {
        for ( final D warning : warnings )
```

### BoundedWildcard
Can generalize to `? extends D`
in `src/main/java/org/apache/maven/plugins/pmd/AbstractPmdViolationCheckMojo.java`
#### Snippet
```java
     * @param warnings list of warnings
     */
    protected void printErrors( final List<D> failures, final List<D> warnings )
    {
        for ( final D warning : warnings )
```

### BoundedWildcard
Can generalize to `? super D`
in `src/main/java/org/apache/maven/plugins/pmd/AbstractPmdViolationCheckMojo.java`
#### Snippet
```java
     * @param excludeFromFile the needed helper, for the specific violation type
     */
    protected AbstractPmdViolationCheckMojo( ExcludeFromFile<D> excludeFromFile )
    {
        this.excludeFromFile = excludeFromFile;
```

### BoundedWildcard
Can generalize to `? extends File`
in `src/main/java/org/apache/maven/plugins/pmd/exec/PmdRequest.java`
#### Snippet
```java
    }

    public void addFiles( Collection<File> files )
    {
        this.files.addAll( files );
```

### BoundedWildcard
Can generalize to `? extends PmdFileInfo`
in `src/main/java/org/apache/maven/plugins/pmd/PmdReportGenerator.java`
#### Snippet
```java
    }

    public void setFiles( Map<File, PmdFileInfo> files )
    {
        this.files = files;
```

### BoundedWildcard
Can generalize to `? extends Match`
in `src/main/java/org/apache/maven/plugins/pmd/exec/CpdExecutor.java`
#### Snippet
```java
    }

    private Iterator<Match> filterMatches( Iterator<Match> matches )
    {
        LOG.debug( "Filtering duplications. Using " + excludeDuplicationsFromFile.countExclusions()
```

### BoundedWildcard
Can generalize to `? extends File`
in `src/main/java/org/apache/maven/plugins/pmd/exec/PmdExecutor.java`
#### Snippet
```java
    }

    private Report processFilesWithPMD( PMDConfiguration pmdConfiguration, List<File> files )
            throws MavenReportException
    {
```

### BoundedWildcard
Can generalize to `? extends Report.ProcessingError`
in `src/main/java/org/apache/maven/plugins/pmd/exec/PmdExecutor.java`
#### Snippet
```java
     * @return the errors as string
     */
    private String getErrorsAsString( List<Report.ProcessingError> errors, boolean withDetails )
    {
        List<String> errorsAsString = new ArrayList<>( errors.size() );
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
Variable `languageVersion` initializer `null` is redundant
in `src/main/java/org/apache/maven/plugins/pmd/exec/PmdExecutor.java`
#### Snippet
```java

        PMDConfiguration configuration = new PMDConfiguration();
        LanguageVersion languageVersion = null;
        Language language = LanguageRegistry
                .findLanguageByTerseName( request.getLanguage() != null ? request.getLanguage() : "java" );
```

## RuleId[ruleID=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/org/apache/maven/plugins/pmd/exec/CpdExecutor.java`
#### Snippet
```java
            renderer = new SimpleRenderer();
        }
        else if ( !"".equals( format ) && !"none".equals( format ) )
        {
            try
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/org/apache/maven/plugins/pmd/exec/PmdExecutor.java`
#### Snippet
```java
            result = new HTMLRenderer();
        }
        else if ( !"".equals( format ) && !"none".equals( format ) )
        {
            try
```

## RuleId[ruleID=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/plugins/pmd/exec/CpdExecutor.java`
#### Snippet
```java
        {
            File siteDir = new File( request.getReportOutputDirectory() );
            siteDir.mkdirs();
            try
            {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/plugins/pmd/exec/CpdExecutor.java`
#### Snippet
```java
    {
        File basePmdDir = new File ( request.getTargetDirectory(), "pmd" );
        basePmdDir.mkdirs();
        File cpdRequestFile = new File( basePmdDir, "cpdrequest.bin" );
        try ( ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream( cpdRequestFile ) ) )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/plugins/pmd/exec/CpdExecutor.java`
#### Snippet
```java

        File targetDir = new File( request.getTargetDirectory() );
        targetDir.mkdirs();
        File targetFile = new File( targetDir, "cpd." + extension );
        try ( Writer writer = new OutputStreamWriter( new FileOutputStream( targetFile ),
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/plugins/pmd/exec/PmdExecutor.java`
#### Snippet
```java

        File targetDir = new File( request.getTargetDirectory() );
        targetDir.mkdirs();
        String extension = r.defaultFileExtension();
        File targetFile = new File( targetDir, "pmd." + extension );
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/plugins/pmd/exec/PmdExecutor.java`
#### Snippet
```java
    {
        File basePmdDir = new File ( request.getTargetDirectory(), "pmd" );
        basePmdDir.mkdirs();
        File pmdRequestFile = new File( basePmdDir, "pmdrequest.bin" );
        try ( ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream( pmdRequestFile ) ) )
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/plugins/pmd/exec/PmdExecutor.java`
#### Snippet
```java
        {
            File siteDir = new File( request.getReportOutputDirectory() );
            siteDir.mkdirs();
            try
            {
```

