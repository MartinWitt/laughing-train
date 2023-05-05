# maven-artifact-plugin 
 
# Bad smells
I found 27 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ConstantValue | 6 | false |
| IOStreamConstructor | 4 | false |
| JavadocDeclaration | 4 | false |
| JavadocReference | 3 | false |
| IgnoreResultOfCall | 3 | false |
| DataFlowIssue | 2 | false |
| MismatchedCollectionQueryUpdate | 2 | false |
| DuplicatedCode | 1 | false |
| FieldMayBeFinal | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/AbstractBuildinfoMojo.java`
#### Snippet
```java
            if (getLog().isDebugEnabled()) {
                getLog().debug("project.build.outputTimestamp = \"" + outputTimestamp + "\" => "
                        + new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").format(timestamp));
            }

            // check if timestamp well defined in a project from reactor
            boolean parentInReactor = false;
            MavenProject reactorParent = project;
            while (reactorProjects.contains(reactorParent.getParent())) {
                parentInReactor = true;
                reactorParent = reactorParent.getParent();
            }
            String prop = reactorParent.getOriginalModel().getProperties().getProperty("project.build.outputTimestamp");
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/AbstractBuildinfoMojo.java`
#### Snippet
```java
     * @return a Map of artifacts added to the build info with their associated property key prefix
     *         (<code>outputs.[#module.].#artifact</code>)
     * @throws MojoExecutionException
     */
    protected Map<Artifact, String> generateBuildinfo(boolean mono) throws MojoExecutionException {
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/CompareMojo.java`
#### Snippet
```java
     * @artifacts a Map of artifacts added to the build info with their associated property key prefix
     *            (<code>outputs.[#module.].#artifact</code>)
     * @throws MojoExecutionException
     */
    private void checkAgainstReference(Map<Artifact, String> artifacts, boolean mono) throws MojoExecutionException {
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/BuildInfoWriter.java`
#### Snippet
```java
     * @param buildinfo the build info file
     * @return output properties
     * @throws MojoExecutionException
     */
    static Properties loadOutputProperties(File buildinfo) throws MojoExecutionException {
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/AbstractBuildinfoMojo.java`
#### Snippet
```java

        try (PrintWriter p = new PrintWriter(new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(buildinfoFile), StandardCharsets.UTF_8)))) {
            BuildInfoWriter bi = new BuildInfoWriter(getLog(), p, mono, artifactHandlerManager, rtInformation);
            bi.setIgnoreJavadoc(ignoreJavadoc);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/CheckBuildPlanMojo.java`
#### Snippet
```java
        try (InputStream in = (pluginIssues == null)
                ? getClass().getResourceAsStream("not-reproducible-plugins.properties")
                : new FileInputStream(pluginIssues)) {
            Properties prop = new Properties();
            prop.load(in);
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/ReferenceBuildinfoUtil.java`
#### Snippet
```java
            referenceBuildinfo = getReference(null, buildinfoFile);
            try (PrintWriter p = new PrintWriter(new BufferedWriter(
                    new OutputStreamWriter(new FileOutputStream(referenceBuildinfo), StandardCharsets.UTF_8)))) {
                BuildInfoWriter bi = new BuildInfoWriter(log, p, mono, artifactHandlerManager, rtInformation);

```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/CompareMojo.java`
#### Snippet
```java
                buildinfoFile.getParentFile(), buildinfoFile.getName().replaceFirst(".buildinfo$", ".buildcompare"));
        try (PrintWriter p = new PrintWriter(new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(buildcompare), StandardCharsets.UTF_8)))) {
            p.println("version=" + project.getVersion());
            p.println("ok=" + ok);
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `last` might be null
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/AbstractBuildinfoMojo.java`
#### Snippet
```java
            MavenProject last = getLastProject();
            if (project != last) {
                skip(last);
                return;
            }
```

### DataFlowIssue
Dereference of `currentEnv` may produce `NullPointerException`
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/ReferenceBuildinfoUtil.java`
#### Snippet
```java

                            ReproducibleEnv currentEnv = extractEnv(artifact.getFile(), artifact);
                            currentJavaVersion = currentEnv.javaVersion;
                            currentOsName = currentEnv.osName;
                        }
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/AbstractBuildinfoMojo.java`
#### Snippet
```java
     * @return a Map of artifacts added to the build info with their associated property key prefix
     *         (<code>outputs.[#module.].#artifact</code>)
     * @throws MojoExecutionException
     */
    protected Map<Artifact, String> generateBuildinfo(boolean mono) throws MojoExecutionException {
```

### JavadocDeclaration
Wrong tag `artifacts`
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/CompareMojo.java`
#### Snippet
```java
     * Check current build result with reference.
     *
     * @artifacts a Map of artifacts added to the build info with their associated property key prefix
     *            (<code>outputs.[#module.].#artifact</code>)
     * @throws MojoExecutionException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/CompareMojo.java`
#### Snippet
```java
     * @artifacts a Map of artifacts added to the build info with their associated property key prefix
     *            (<code>outputs.[#module.].#artifact</code>)
     * @throws MojoExecutionException
     */
    private void checkAgainstReference(Map<Artifact, String> artifacts, boolean mono) throws MojoExecutionException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/BuildInfoWriter.java`
#### Snippet
```java
     * @param buildinfo the build info file
     * @return output properties
     * @throws MojoExecutionException
     */
    static Properties loadOutputProperties(File buildinfo) throws MojoExecutionException {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `lines` may be 'final'
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/JdkToolchainUtil.java`
#### Snippet
```java

    private static class LineConsumer implements StreamConsumer {
        private List<String> lines = new ArrayList<>();

        @Override
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `referenceBuildinfo == null` is always `true`
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/ReferenceBuildinfoUtil.java`
#### Snippet
```java
        }

        if (referenceBuildinfo == null) {
            // download reference artifacts and guess Java version and OS
            String javaVersion = null;
```

### ConstantValue
Condition `osName != null` is always `false` when reached
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/ReferenceBuildinfoUtil.java`
#### Snippet
```java
                BuildInfoWriter bi = new BuildInfoWriter(log, p, mono, artifactHandlerManager, rtInformation);

                if (javaVersion != null || osName != null) {
                    p.println("# effective build environment information");
                    if (javaVersion != null) {
```

### ConstantValue
Condition `javaVersion != null` is always `true`
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/ReferenceBuildinfoUtil.java`
#### Snippet
```java
                if (javaVersion != null || osName != null) {
                    p.println("# effective build environment information");
                    if (javaVersion != null) {
                        p.println("java.version=" + javaVersion);
                        log.info("Reference build java.version: " + javaVersion);
```

### ConstantValue
Condition `reference == null` is always `false` when reached
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/CompareMojo.java`
#### Snippet
```java
        // reference file name is taken from repository format
        File reference = new File(new File(referenceDir, a.getGroupId()), getRepositoryFilename(a));
        if ((actual == null) || (reference == null)) {
            return "missing file for " + a.getId() + " reference = "
                    + (reference == null ? "null" : relative(reference)) + " actual = "
```

### ConstantValue
Condition `reference == null` is always `false`
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/CompareMojo.java`
#### Snippet
```java
        if ((actual == null) || (reference == null)) {
            return "missing file for " + a.getId() + " reference = "
                    + (reference == null ? "null" : relative(reference)) + " actual = "
                    + (actual == null ? "null" : relative(actual));
        }
```

### ConstantValue
Condition `actual == null` is always `true`
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/CompareMojo.java`
#### Snippet
```java
            return "missing file for " + a.getId() + " reference = "
                    + (reference == null ? "null" : relative(reference)) + " actual = "
                    + (actual == null ? "null" : relative(actual));
        }
        return "diffoscope " + relative(reference) + " " + relative(actual);
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `reactorProjects` are queried, but never updated
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/CheckBuildPlanMojo.java`
#### Snippet
```java
public class CheckBuildPlanMojo extends AbstractMojo {
    @Parameter(defaultValue = "${reactorProjects}", required = true, readonly = true)
    private List<MavenProject> reactorProjects;

    @Parameter(defaultValue = "${project}", readonly = true)
```

### MismatchedCollectionQueryUpdate
Contents of collection `remoteRepos` are queried, but never updated
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/CompareMojo.java`
#### Snippet
```java
     */
    @Parameter(defaultValue = "${project.remoteProjectRepositories}", readonly = true)
    private List<RemoteRepository> remoteRepos;

    @Component
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/ReferenceBuildinfoUtil.java`
#### Snippet
```java
        value = attr.getValue("Build-Jdk");
        if (value != null) {
            return String.valueOf(value) + " (from MANIFEST.MF Build-Jdk)";
        }

```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/AbstractBuildinfoMojo.java`
#### Snippet
```java
        MavenProject root = mono ? project : getExecutionRoot();

        buildinfoFile.getParentFile().mkdirs();

        try (PrintWriter p = new PrintWriter(new BufferedWriter(
```

### IgnoreResultOfCall
Result of `File.mkdir()` is ignored
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/ReferenceBuildinfoUtil.java`
#### Snippet
```java
            dir = new File(referenceDir, groupId);
            if (!dir.isDirectory()) {
                dir.mkdir();
            }
        }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/plugins/artifact/buildinfo/CompareMojo.java`
#### Snippet
```java
        MavenProject root = mono ? project : getExecutionRoot();
        File referenceDir = new File(root.getBuild().getDirectory(), "reference");
        referenceDir.mkdirs();

        // download or create reference buildinfo
```

