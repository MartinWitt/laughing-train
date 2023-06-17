# maven-help-plugin 
 
# Bad smells
I found 61 bad smells with 15 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 30 | false |
| UnnecessaryToStringCall | 13 | true |
| ConstantValue | 4 | false |
| MismatchedCollectionQueryUpdate | 4 | false |
| NonStrictComparisonCanBeEquality | 2 | true |
| UNCHECKED_WARNING | 2 | false |
| IgnoreResultOfCall | 2 | false |
| SynchronizeOnNonFinalField | 1 | false |
| FieldMayBeFinal | 1 | false |
| EqualsBetweenInconvertibleTypes | 1 | false |
| RegExpRedundantEscape | 1 | false |
## RuleId[id=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `session`
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
            // Maven 3: PluginParameterExpressionEvaluator gets the current project from the session:
            // synchronize in case another thread wants to fetch the real current project in between
            synchronized (session) {
                session.setCurrentProject(project);
                evaluator = new PluginParameterExpressionEvaluator(session, mojoExecution);
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java

            String deprecation = parameter.getDeprecated();
            if (deprecation != null && deprecation.length() <= 0) {
                deprecation = NO_REASON;
            }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java

        String deprecation = md.getDeprecated();
        if (deprecation != null && deprecation.length() <= 0) {
            deprecation = NO_REASON;
        }
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/org/apache/maven/plugins/help/EffectiveSettingsMojo.java`
#### Snippet
```java
        Settings clone = SettingsUtils.copySettings(settings);

        List<Server> clonedServers = new ArrayList<>(settings.getServers().size());
        for (Server server : settings.getServers()) {
            Server clonedServer = new Server();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/org/apache/maven/plugins/help/EffectiveSettingsMojo.java`
#### Snippet
```java
        clone.setServers(clonedServers);

        List<Proxy> clonedProxies = new ArrayList<>(settings.getProxies().size());
        for (Proxy proxy : settings.getProxies()) {
            Proxy clonedProxy = new Proxy();
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/help/AbstractHelpMojo.java`
#### Snippet
```java
     * @param artifactString Coordinates of the Maven project to get.
     * @return New Maven project.
     * @throws MojoExecutionException If there was an error while getting the Maven project.
     */
    protected MavenProject getMavenProject(String artifactString) throws MojoExecutionException {
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/help/AbstractHelpMojo.java`
#### Snippet
```java
     * @param type The extension for the artifact, must not be <code>null</code>.
     * @return the <code>Artifact</code> object for the <code>artifactString</code> parameter.
     * @throws MojoExecutionException if the <code>artifactString</code> doesn't respect the format.
     */
    protected org.eclipse.aether.artifact.Artifact getAetherArtifact(String artifactString, String type)
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/help/EffectiveSettingsMojo.java`
#### Snippet
```java
     * @param settings the settings, not null.
     * @param writer the XML writer used, not null.
     * @throws MojoExecutionException if any
     */
    private static void writeEffectiveSettings(Settings settings, XMLWriter writer) throws MojoExecutionException {
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/help/EffectivePomMojo.java`
#### Snippet
```java
     * @param project the project of the current build, not null.
     * @param writer the XML writer , not null, not null.
     * @throws MojoExecutionException if any
     */
    private void writeEffectivePom(MavenProject project, XMLWriter writer) throws MojoExecutionException {
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
     * @param expr the user expression asked.
     * @param output the file where to write the result, or <code>null</code> to print in standard output.
     * @throws MojoExecutionException if any
     * @throws MojoFailureException if any reflection exceptions occur or missing components.
     */
```

### JavadocReference
Cannot resolve symbol `MojoFailureException`
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
     * @param output the file where to write the result, or <code>null</code> to print in standard output.
     * @throws MojoExecutionException if any
     * @throws MojoFailureException if any reflection exceptions occur or missing components.
     */
    private void handleResponse(String expr, File output) throws MojoExecutionException, MojoFailureException {
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
    /**
     * @return the Maven POM for the current help plugin
     * @throws MojoExecutionException if any
     */
    private MavenProject getHelpPluginPom() throws MojoExecutionException {
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
    /**
     * @return the <code>org.apache.maven: artifactId </code> artifact jar file for this current HelpPlugin pom.
     * @throws MojoExecutionException if any
     */
    private File getArtifactFile(String artifactId) throws MojoExecutionException, RepositoryException {
```

### JavadocReference
Cannot resolve symbol `MojoFailureException`
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
    /**
     * @return a lazy loading evaluator object.
     * @throws MojoFailureException if any reflection exceptions occur or missing components.
     */
    private PluginParameterExpressionEvaluator getEvaluator() throws MojoFailureException {
```

### JavadocReference
Cannot resolve symbol `MojoFailureException`
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
     * @param value  The value associated to the key, could be <code>null</code>.
     * @param indent The base indentation level of each line, must not be negative.
     * @throws MojoFailureException   if any reflection exceptions occur.
     * @throws MojoExecutionException if any
     * @see #toLines(String, int, int, int)
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
     * @param indent The base indentation level of each line, must not be negative.
     * @throws MojoFailureException   if any reflection exceptions occur.
     * @throws MojoExecutionException if any
     * @see #toLines(String, int, int, int)
     */
```

### JavadocReference
Cannot resolve symbol `MojoFailureException`
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
     * @param pd     contains the plugin description
     * @param buffer contains the information to be displayed or printed
     * @throws MojoFailureException   if any reflection exceptions occur.
     * @throws MojoExecutionException if any
     */
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
     * @param buffer contains the information to be displayed or printed
     * @throws MojoFailureException   if any reflection exceptions occur.
     * @throws MojoExecutionException if any
     */
    private void describePlugin(PluginDescriptor pd, StringBuilder buffer)
```

### JavadocReference
Cannot resolve symbol `MojoFailureException`
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
     *
     * @return Plugin info containing information about the plugin whose description is to be retrieved
     * @throws MojoFailureException if <code>plugin<*code> parameter is not conform to
     *                              <code>groupId:artifactId[:version]</code>
     */
```

### JavadocReference
Cannot resolve symbol `MojoFailureException`
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
     * @param md     contains the description of the Plugin Mojo
     * @param buffer the displayed output
     * @throws MojoFailureException   if any reflection exceptions occur.
     * @throws MojoExecutionException if any
     */
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
     * @param buffer the displayed output
     * @throws MojoFailureException   if any reflection exceptions occur.
     * @throws MojoExecutionException if any
     */
    private void describeMojo(MojoDescriptor md, StringBuilder buffer)
```

### JavadocReference
Cannot resolve symbol `MojoFailureException`
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
     * @param md     contains the description of the Plugin Mojo
     * @param buffer contains information to be printed or displayed
     * @throws MojoFailureException   if any reflection exceptions occur.
     * @throws MojoExecutionException if any
     */
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
     * @param buffer contains information to be printed or displayed
     * @throws MojoFailureException   if any reflection exceptions occur.
     * @throws MojoExecutionException if any
     */
    private void describeMojoParameters(MojoDescriptor md, StringBuilder buffer)
```

### JavadocReference
Cannot resolve symbol `MojoFailureException`
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
     * @param description The description, not <code>null</code>.
     * @param indent      The base indentation level of each line, must not be negative.
     * @throws MojoFailureException   if any reflection exceptions occur.
     * @throws MojoExecutionException if any
     * @see #toLines(String, int, int, int)
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
     * @param indent      The base indentation level of each line, must not be negative.
     * @throws MojoFailureException   if any reflection exceptions occur.
     * @throws MojoExecutionException if any
     * @see #toLines(String, int, int, int)
     */
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
     * @param pi holds information of the plugin whose description is to be retrieved
     * @return a PluginDescriptor where the plugin description is to be retrieved
     * @throws MojoExecutionException if the plugin could not be verify
     * @throws MojoFailureException   if groupId or artifactId is empty
     */
```

### JavadocReference
Cannot resolve symbol `MojoFailureException`
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
     * @return a PluginDescriptor where the plugin description is to be retrieved
     * @throws MojoExecutionException if the plugin could not be verify
     * @throws MojoFailureException   if groupId or artifactId is empty
     */
    private PluginDescriptor lookupPluginDescriptor(PluginInfo pi) throws MojoExecutionException, MojoFailureException {
```

### JavadocReference
Cannot resolve symbol `MojoFailureException`
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
     * @param value  The value, could be <code>null</code>.
     * @param indent The base indentation level of each line, must not be negative.
     * @throws MojoFailureException   if any reflection exceptions occur.
     * @throws MojoExecutionException if any
     * @see #toLines(String, int, int, int)
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
     * @param indent The base indentation level of each line, must not be negative.
     * @throws MojoFailureException   if any reflection exceptions occur.
     * @throws MojoExecutionException if any
     * @see #toLines(String, int, int, int)
     */
```

### JavadocReference
Cannot resolve symbol `MojoFailureException`
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
     * @param lineLength The length of the line, must not be negative.
     * @return The sequence of display lines, never <code>null</code>.
     * @throws MojoFailureException   if any can not invoke the method
     * @throws MojoExecutionException if no line was found for <code>text</code>
     */
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
     * @return The sequence of display lines, never <code>null</code>.
     * @throws MojoFailureException   if any can not invoke the method
     * @throws MojoExecutionException if no line was found for <code>text</code>
     */
    private static List<String> toLines(String text, int indent, int indentSize, int lineLength)
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
     * @param descriptionBuffer not null
     * @return <code>true</code> if it implies to describe a plugin, <code>false</code> otherwise.
     * @throws MojoExecutionException if any
     */
    private boolean describeCommand(StringBuilder descriptionBuffer) throws MojoExecutionException {
```

### JavadocReference
Cannot resolve symbol `MojoFailureException`
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
     * @param buffer          contains information to be printed or displayed
     * @param fullDescription specifies whether all the details about the Plugin Mojo is to  be displayed
     * @throws MojoFailureException   if any reflection exceptions occur.
     * @throws MojoExecutionException if any
     */
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
     * @param fullDescription specifies whether all the details about the Plugin Mojo is to  be displayed
     * @throws MojoFailureException   if any reflection exceptions occur.
     * @throws MojoExecutionException if any
     */
    private void describeMojoGuts(MojoDescriptor md, StringBuilder buffer, boolean fullDescription)
```

### JavadocReference
Cannot resolve symbol `MojoExecutionException`
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
     *
     * @param descriptionBuffer contains the description to be written to the file
     * @throws MojoExecutionException if any
     */
    private void writeDescription(StringBuilder descriptionBuffer) throws MojoExecutionException {
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/help/ActiveProfilesMojo.java`
#### Snippet
```java
                    .append(LS)
                    .append(LS);
            sb.append(message.toString());

            try {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/help/SystemMojo.java`
#### Snippet
```java
                    .append(LS)
                    .append(LS);
            sb.append(message.toString());

            try {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
        // handle primitives objects
        else if (obj instanceof String) {
            response.append(obj.toString());
        } else if (obj instanceof Boolean) {
            response.append(obj.toString());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
            response.append(obj.toString());
        } else if (obj instanceof Boolean) {
            response.append(obj.toString());
        } else if (obj instanceof Byte) {
            response.append(obj.toString());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
            response.append(obj.toString());
        } else if (obj instanceof Byte) {
            response.append(obj.toString());
        } else if (obj instanceof Character) {
            response.append(obj.toString());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
            response.append(obj.toString());
        } else if (obj instanceof Character) {
            response.append(obj.toString());
        } else if (obj instanceof Double) {
            response.append(obj.toString());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
            response.append(obj.toString());
        } else if (obj instanceof Double) {
            response.append(obj.toString());
        } else if (obj instanceof Float) {
            response.append(obj.toString());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
            response.append(obj.toString());
        } else if (obj instanceof Float) {
            response.append(obj.toString());
        } else if (obj instanceof Integer) {
            response.append(obj.toString());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
            response.append(obj.toString());
        } else if (obj instanceof Integer) {
            response.append(obj.toString());
        } else if (obj instanceof Long) {
            response.append(obj.toString());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
            response.append(obj.toString());
        } else if (obj instanceof Long) {
            response.append(obj.toString());
        } else if (obj instanceof Short) {
            response.append(obj.toString());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
            response.append(obj.toString());
        } else if (obj instanceof Short) {
            response.append(obj.toString());
        }
        // handle specific objects
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
        } else {
            if (getLog().isInfoEnabled()) {
                getLog().info(LS + response.toString());
            } else {
                if (forceStdout) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
            } else {
                if (forceStdout) {
                    System.out.print(response.toString());
                    System.out.flush();
                }
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `verbose` may be 'final'
in `src/main/java/org/apache/maven/plugins/help/EffectivePomMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "verbose", defaultValue = "false")
    private boolean verbose = false;

    // ----------------------------------------------------------------------
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `obj instanceof MavenProject` is always `false`
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
        }
        // handle Maven pom object
        else if (obj instanceof MavenProject) {
            MavenProject projectAsked = (MavenProject) obj;
            StringWriter sWriter = new StringWriter();
```

### ConstantValue
Condition `obj instanceof Settings` is always `false`
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
        }
        // handle Maven Settings object
        else if (obj instanceof Settings) {
            Settings settingsAsked = (Settings) obj;
            StringWriter sWriter = new StringWriter();
```

### ConstantValue
Condition `!deprecation.isEmpty()` is always `true` when reached
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
            }

            if (deprecation != null && !deprecation.isEmpty()) {
                append(
                        buffer,
```

### ConstantValue
Condition `!deprecation.isEmpty()` is always `true` when reached
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
        }

        if (deprecation != null && !deprecation.isEmpty()) {
            append(
                    buffer,
```

## RuleId[id=EqualsBetweenInconvertibleTypes]
### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Class' and 'Class'
in `src/main/java/org/apache/maven/plugins/help/EvaluateMojo.java`
#### Snippet
```java
                            String alias = StringUtils.lowercaseFirstLetter(clazz.getSimpleName());
                            xstreamObject.alias(alias, clazz);
                            if (!clazz.equals(Model.class)) {
                                xstreamObject.omitField(clazz, "modelEncoding"); // unnecessary field
                            }
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `settingsProfiles` are queried, but never updated
in `src/main/java/org/apache/maven/plugins/help/AllProfilesMojo.java`
#### Snippet
```java
     */
    @Parameter(defaultValue = "${settings.profiles}", readonly = true, required = true)
    private List<org.apache.maven.settings.Profile> settingsProfiles;

    // ----------------------------------------------------------------------
```

### MismatchedCollectionQueryUpdate
Contents of collection `projects` are queried, but never updated
in `src/main/java/org/apache/maven/plugins/help/AllProfilesMojo.java`
#### Snippet
```java
     */
    @Parameter(defaultValue = "${reactorProjects}", required = true, readonly = true)
    private List<MavenProject> projects;

    /**
```

### MismatchedCollectionQueryUpdate
Contents of collection `projects` are queried, but never updated
in `src/main/java/org/apache/maven/plugins/help/ActiveProfilesMojo.java`
#### Snippet
```java
     */
    @Parameter(defaultValue = "${reactorProjects}", required = true, readonly = true)
    private List<MavenProject> projects;

    // ----------------------------------------------------------------------
```

### MismatchedCollectionQueryUpdate
Contents of collection `lifecycleMappings` are queried, but never updated
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
     */
    @Component
    private Map<String, LifecycleMapping> lifecycleMappings;

    // ----------------------------------------------------------------------
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `src/main/java/org/apache/maven/plugins/help/DescribeMojo.java`
#### Snippet
```java
    private static final String NO_REASON = "No reason given";

    private static final Pattern EXPRESSION = Pattern.compile("^\\$\\{([^}]+)\\}$");

    // ----------------------------------------------------------------------
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/plugins/help/AbstractEffectiveMojo.java`
#### Snippet
```java
        }

        output.getParentFile().mkdirs();
        try (Writer out = WriterFactory.newXmlWriter(output)) {
            out.write(content);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/apache/maven/plugins/help/AbstractHelpMojo.java`
#### Snippet
```java
        }

        output.getParentFile().mkdirs();
        try (Writer out = WriterFactory.newPlatformWriter(output)) {
            out.write(content);
```

