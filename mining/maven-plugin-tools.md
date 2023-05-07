# maven-plugin-tools 
 
# Bad smells
I found 311 bad smells with 6 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocDeclaration | 75 | false |
| JavadocReference | 44 | false |
| OptionalUsedAsFieldOrParameterType | 40 | false |
| FieldMayBeFinal | 26 | false |
| RegExpRedundantEscape | 15 | false |
| ConstantValue | 12 | false |
| StringBufferReplaceableByString | 11 | false |
| DeprecatedIsStillUsed | 10 | false |
| DuplicatedCode | 8 | false |
| IgnoreResultOfCall | 8 | false |
| Deprecation | 7 | false |
| StringConcatenationInsideStringBufferAppend | 7 | false |
| CdiInjectionPointsInspection | 5 | false |
| UNCHECKED_WARNING | 4 | false |
| TrivialIf | 4 | false |
| ExtendsAnnotation | 4 | false |
| ArraysAsListWithZeroOrOneArgument | 4 | false |
| UnnecessaryStringEscape | 3 | true |
| ToArrayCallWithZeroLengthArrayArgument | 2 | true |
| OptionalIsPresent | 2 | false |
| DataFlowIssue | 2 | false |
| RefusedBequest | 2 | false |
| MismatchedJavadocCode | 2 | false |
| IOStreamConstructor | 2 | false |
| JavadocLinkAsPlainText | 2 | false |
| UnusedAssignment | 2 | false |
| StringOperationCanBeSimplified | 1 | false |
| CommentedOutCode | 1 | false |
| RegExpSimplifiable | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| NullableProblems | 1 | false |
| FieldCanBeLocal | 1 | false |
| DuplicateThrows | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[includePatterns.size()\]'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/DefaultMojoAnnotationsScanner.java`
#### Snippet
```java
        scanner.addDefaultExcludes();
        if (includePatterns != null) {
            scanner.setIncludes(includePatterns.toArray(new String[includePatterns.size()]));
        }
        scanner.scan();
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new URL\[urls.size()\]'
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java
            }

            classLoader = new URLClassLoader(urls.toArray(new URL[urls.size()]), classLoader);
        }

```

## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
            throws URISyntaxException {
        StringBuilder link = new StringBuilder();
        if (moduleName.isPresent()) {
            link.append(moduleName.get() + "/");
        }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
            link.append(moduleName.get() + "/");
        }
        if (packageName.isPresent()) {
            link.append(packageName.get().replace('.', '/'));
        }
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `maven-plugin-report-plugin/src/main/java/org/apache/maven/plugins/plugin/descriptor/EnhancedPluginDescriptorBuilder.java`
#### Snippet
```java
        PlexusConfiguration[] parameterConfigurations = c.getChild("parameters").getChildren("parameter");

        List<Parameter> parameters = new ArrayList<>(mojoDescriptor.getParameters());
        Map<String, Parameter> parameterMap = new LinkedHashMap<>(mojoDescriptor.getParameterMap());

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashMap' to 'java.util.Map'
in `maven-plugin-report-plugin/src/main/java/org/apache/maven/plugins/plugin/descriptor/EnhancedPluginDescriptorBuilder.java`
#### Snippet
```java

        List<Parameter> parameters = new ArrayList<>(mojoDescriptor.getParameters());
        Map<String, Parameter> parameterMap = new LinkedHashMap<>(mojoDescriptor.getParameterMap());

        for (PlexusConfiguration d : parameterConfigurations) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashSet' to 'java.util.Set'
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/DescriptorGeneratorMojo.java`
#### Snippet
```java
        Set<Artifact> filteredArtifacts;
        if (mojoDependencies == null) {
            filteredArtifacts = new LinkedHashSet<>(project.getArtifacts());
        } else if (mojoDependencies.isEmpty()) {
            filteredArtifacts = null;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `maven-script/maven-script-ant/src/main/java/org/apache/maven/script/ant/AntMojoWrapper.java`
#### Snippet
```java

    public void setPluginContext(Map pluginContext) {
        this.pluginContext = pluginContext;
    }

```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `ArtifactRepositoryMetadata`
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/metadata/AddPluginArtifactMetadataMojo.java`
#### Snippet
```java
 * </ol>
 *
 * @see ArtifactRepositoryMetadata
 * @see GroupRepositoryMetadata
 *
```

### JavadocReference
Cannot resolve symbol `Parameter`
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugins/plugin/descriptor_old/EnhancedPluginDescriptorBuilder.java`
#### Snippet
```java
 * {@link org.apache.maven.tools.plugin.generator.PluginDescriptorFilesGenerator} and
 * used by {@link PluginReport}.
 * Populates the slightly extended {@link Parameter} object {@link EnhancedParameterWrapper}.
 */
@Deprecated
```

### JavadocReference
Cannot resolve symbol `PlexusConfigurationException`
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugins/plugin/descriptor_old/EnhancedPluginDescriptorBuilder.java`
#### Snippet
```java
     * MNG-6109</a> when using Maven-3.3.9 and before.
     * Method can be removed once Maven 3.5.0 is the prerequisite for this plugin.
     * @throws PlexusConfigurationException
     *
     * @since 3.5.1
```

### JavadocReference
Cannot resolve symbol `Parameter`
in `maven-plugin-report-plugin/src/main/java/org/apache/maven/plugins/plugin/descriptor/EnhancedPluginDescriptorBuilder.java`
#### Snippet
```java
 * {@link org.apache.maven.tools.plugin.generator.PluginDescriptorFilesGenerator} and
 * used by {@link PluginReport}.
 * Populates the slightly extended {@link Parameter} object {@link EnhancedParameterWrapper}.
 * In addition populates all (optional) elements added after Maven Plugin API 3.2.5.
 */
```

### JavadocReference
Cannot resolve symbol `PlexusConfigurationException`
in `maven-plugin-report-plugin/src/main/java/org/apache/maven/plugins/plugin/descriptor/EnhancedPluginDescriptorBuilder.java`
#### Snippet
```java
     * MNG-6109</a> when using Maven-3.3.9 and before.
     * Method can be removed once Maven 3.5.0 is the prerequisite for this plugin.
     * @throws PlexusConfigurationException
     *
     * @since 3.5.1
```

### JavadocReference
Cannot resolve symbol `InvalidPluginDescriptorException`
in `maven-script/maven-plugin-tools-beanshell/src/main/java/org/apache/maven/tools/plugin/extractor/beanshell/BeanshellMojoDescriptorExtractor.java`
#### Snippet
```java
     * @param request  not null
     * @return a new Mojo descriptor instance
     * @throws InvalidPluginDescriptorException
     *          if any
     */
```

### JavadocReference
Cannot resolve symbol `Artifact`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/PluginToolsRequest.java`
#### Snippet
```java

    /**
     * Returns the list of {@link Artifact} used in class path scanning for annotations
     *
     * @return the dependencies
```

### JavadocReference
Cannot resolve symbol `MavenProject`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/PluginToolsRequest.java`
#### Snippet
```java

    /**
     * @param project the current {@link MavenProject}
     * @see PluginToolsRequest#getProject()
     * @return This request.
```

### JavadocReference
Cannot resolve symbol `org.eclipse.aether.version.VersionConstraint`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/PluginToolsRequest.java`
#### Snippet
```java
     *
     * @return the required Java version for this plugin or {@code null} if unknown.
     *  Is a value according to semantics of {@link org.eclipse.aether.version.VersionConstraint}.
     * @since 3.8.0
     */
```

### JavadocReference
Cannot resolve symbol `PluginDescriptor`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/PluginToolsRequest.java`
#### Snippet
```java
    /**
     * @see PluginToolsRequest#getPluginDescriptor()
     * @param pluginDescriptor the {@link PluginDescriptor}
     * @return This request.
     */
```

### JavadocReference
Cannot resolve symbol `org.eclipse.aether.version.VersionConstraint`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/PluginToolsRequest.java`
#### Snippet
```java
     *
     * @param requiredJavaVersion the required Java version for this plugin or {@code null} if unknown.
     *  Must be a value according to semantics of {@link org.eclipse.aether.version.VersionConstraint}.
     * @return This request.
     * @since 3.8.0
```

### JavadocReference
Cannot resolve symbol `PluginDescriptor`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/PluginToolsRequest.java`
#### Snippet
```java

    /**
     * @return Return the {@link PluginDescriptor} currently being populated as part of the build of the
     * current plugin project.
     */
```

### JavadocReference
Cannot resolve symbol `MavenProject`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/PluginToolsRequest.java`
#### Snippet
```java

    /**
     * @return Return the current {@link MavenProject} instance in use.
     */
    MavenProject getProject();
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.plugin.descriptor.MojoDescriptor`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/PluginToolsRequest.java`
#### Snippet
```java
/**
 * Request that encapsulates all information relevant to the process of extracting
 * {@link org.apache.maven.plugin.descriptor.MojoDescriptor MojoDescriptor}
 * instances from metadata for a certain type of mojo.
 *
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.plugin.descriptor.MojoDescriptor`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/DefaultPluginToolsRequest.java`
#### Snippet
```java
/**
 * Default implementation of {@link PluginToolsRequest}, which is used to pass parameters to components used to extract
 * {@link org.apache.maven.plugin.descriptor.MojoDescriptor MojoDescriptor} instances from different types of metadata
 * for a given plugin.
 *
```

### JavadocReference
Cannot resolve symbol `org.apache.tools.ant.PropertyHelper`
in `maven-script/maven-script-ant/src/main/java/org/apache/maven/script/ant/AntPropertyHelper.java`
#### Snippet
```java

    /**
     * @see org.apache.tools.ant.PropertyHelper#getPropertyHook(java.lang.String, java.lang.String, boolean)
     */
    public synchronized Object getPropertyHook(String ns, String name, boolean user) {
```

### JavadocReference
Cannot resolve symbol `getPropertyHook(java.lang.String, java.lang.String, boolean)`
in `maven-script/maven-script-ant/src/main/java/org/apache/maven/script/ant/AntPropertyHelper.java`
#### Snippet
```java

    /**
     * @see org.apache.tools.ant.PropertyHelper#getPropertyHook(java.lang.String, java.lang.String, boolean)
     */
    public synchronized Object getPropertyHook(String ns, String name, boolean user) {
```

### JavadocReference
Cannot resolve symbol `ExpressionEvaluator`
in `maven-script/maven-script-ant/src/main/java/org/apache/maven/script/ant/AntPropertyHelper.java`
#### Snippet
```java

    /**
     * @deprecated use {@link #AntPropertyHelper(ExpressionEvaluator, Set, Log)} to resolve maven.dependency.*
     * properties
     * @param exprEvaluator
```

### JavadocReference
Cannot resolve symbol `Log`
in `maven-script/maven-script-ant/src/main/java/org/apache/maven/script/ant/AntPropertyHelper.java`
#### Snippet
```java

    /**
     * @deprecated use {@link #AntPropertyHelper(ExpressionEvaluator, Set, Log)} to resolve maven.dependency.*
     * properties
     * @param exprEvaluator
```

### JavadocReference
Cannot resolve symbol `javadocLinks`
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/DescriptorGeneratorMojo.java`
#### Snippet
```java

    /**
     * The Maven Settings, for evaluating proxy settings used to access {@link #javadocLinks}
     *
     * @since 3.7.0
```

### JavadocReference
Cannot resolve symbol `getDescription()`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/ExtendedMojoDescriptor.java`
#### Snippet
```java

    /**
     * Indicates if the methods {@link #getDescription()}, {@link #getDeprecated()}, {@link Parameter#getDescription()}
     * and {@link Parameter#getDeprecated()} return XHTML values.
     * @return {@code true} if aforementioned methods return XHTML values, if {@code false} those values contain
```

### JavadocReference
Cannot resolve symbol `getDeprecated()`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/ExtendedMojoDescriptor.java`
#### Snippet
```java

    /**
     * Indicates if the methods {@link #getDescription()}, {@link #getDeprecated()}, {@link Parameter#getDescription()}
     * and {@link Parameter#getDeprecated()} return XHTML values.
     * @return {@code true} if aforementioned methods return XHTML values, if {@code false} those values contain
```

### JavadocReference
Cannot resolve symbol `Parameter`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/ExtendedMojoDescriptor.java`
#### Snippet
```java

    /**
     * Indicates if the methods {@link #getDescription()}, {@link #getDeprecated()}, {@link Parameter#getDescription()}
     * and {@link Parameter#getDeprecated()} return XHTML values.
     * @return {@code true} if aforementioned methods return XHTML values, if {@code false} those values contain
```

### JavadocReference
Cannot resolve symbol `getDescription()`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/ExtendedMojoDescriptor.java`
#### Snippet
```java

    /**
     * Indicates if the methods {@link #getDescription()}, {@link #getDeprecated()}, {@link Parameter#getDescription()}
     * and {@link Parameter#getDeprecated()} return XHTML values.
     * @return {@code true} if aforementioned methods return XHTML values, if {@code false} those values contain
```

### JavadocReference
Cannot resolve symbol `Parameter`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/ExtendedMojoDescriptor.java`
#### Snippet
```java
    /**
     * Indicates if the methods {@link #getDescription()}, {@link #getDeprecated()}, {@link Parameter#getDescription()}
     * and {@link Parameter#getDeprecated()} return XHTML values.
     * @return {@code true} if aforementioned methods return XHTML values, if {@code false} those values contain
     * javadoc (HTML + custom javadoc tags) (for legacy extractors)
```

### JavadocReference
Cannot resolve symbol `getDeprecated()`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/ExtendedMojoDescriptor.java`
#### Snippet
```java
    /**
     * Indicates if the methods {@link #getDescription()}, {@link #getDeprecated()}, {@link Parameter#getDescription()}
     * and {@link Parameter#getDeprecated()} return XHTML values.
     * @return {@code true} if aforementioned methods return XHTML values, if {@code false} those values contain
     * javadoc (HTML + custom javadoc tags) (for legacy extractors)
```

### JavadocReference
Cannot resolve symbol `MojoDescriptor`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/ExtendedMojoDescriptor.java`
#### Snippet
```java

/**
 * Extensions to {@link MojoDescriptor} not supported by Maven 3.2.5.
 *
 * @author Kristian Rosenvold
```

### JavadocReference
Cannot resolve symbol `Parameter`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/EnhancedParameterWrapper.java`
#### Snippet
```java

/**
 * Wrapper around regular {@link Parameter} which adds capability to
 * read/write a type javadoc URL
 */
```

### JavadocReference
Cannot resolve symbol `PluginDescriptor`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/ExtendedPluginDescriptor.java`
#### Snippet
```java

/**
 * Extensions to {@link PluginDescriptor} not supported by Maven 3.2.5.
 * This is a wrapper around an existing PluginDescriptor.
 */
```

### JavadocReference
Cannot resolve symbol `MavenReportException`
in `maven-plugin-report-plugin/src/main/java/org/apache/maven/plugin/plugin/report/PluginReport.java`
#### Snippet
```java
     * @param pluginDescriptor not null
     * @param locale           not null
     * @throws MavenReportException if any
     */
    private void generateMojosDocumentation(PluginDescriptor pluginDescriptor, Locale locale)
```

### JavadocReference
Cannot resolve symbol `Parameter`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/util/PluginUtils.java`
#### Snippet
```java
     *
     * @param parameters The mojo parameters to sort, may be <code>null</code>.
     * @see Parameter#getName()
     * @since 2.4.4
     */
```

### JavadocReference
Cannot resolve symbol `getName()`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/util/PluginUtils.java`
#### Snippet
```java
     *
     * @param parameters The mojo parameters to sort, may be <code>null</code>.
     * @see Parameter#getName()
     * @since 2.4.4
     */
```

### JavadocReference
Cannot resolve symbol `MojoDescriptor`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/util/PluginUtils.java`
#### Snippet
```java
     *
     * @param mojoDescriptors The mojo descriptors to sort, may be <code>null</code>.
     * @see MojoDescriptor#getGoal()
     */
    public static void sortMojos(List<MojoDescriptor> mojoDescriptors) {
```

### JavadocReference
Cannot resolve symbol `getGoal()`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/util/PluginUtils.java`
#### Snippet
```java
     *
     * @param mojoDescriptors The mojo descriptors to sort, may be <code>null</code>.
     * @see MojoDescriptor#getGoal()
     */
    public static void sortMojos(List<MojoDescriptor> mojoDescriptors) {
```

### JavadocReference
Cannot resolve symbol `MavenReportException`
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/report_old/PluginReport.java`
#### Snippet
```java
     * @param pluginDescriptor not null
     * @param locale           not null
     * @throws MavenReportException if any
     */
    private void generateMojosDocumentation(PluginDescriptor pluginDescriptor, Locale locale)
```

### JavadocReference
Cannot resolve symbol `InvalidPluginDescriptorException`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/scanner/MojoScanner.java`
#### Snippet
```java
     * @param request not null
     * @throws ExtractionException if any
     * @throws InvalidPluginDescriptorException if any
     * @since 2.5
     */
```

### JavadocReference
Cannot resolve symbol `InvalidPluginDescriptorException`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/extractor/MojoDescriptorExtractor.java`
#### Snippet
```java
     * @return a list of mojo descriptors. These may return HTML values for some fields.
     * @throws ExtractionException if any
     * @throws InvalidPluginDescriptorException if any
     * @since 2.5
     */
```

### JavadocReference
Cannot resolve symbol `InvalidPluginDescriptorException`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/extractor/AbstractScriptedMojoDescriptorExtractor.java`
#### Snippet
```java
     * @return always null
     * @throws ExtractionException if any
     * @throws InvalidPluginDescriptorException if any
     */
    protected List<MojoDescriptor> extractMojoDescriptorsFromMetadata(
```

### JavadocReference
Cannot resolve symbol `InvalidPluginDescriptorException`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/extractor/AbstractScriptedMojoDescriptorExtractor.java`
#### Snippet
```java
     * @return always null
     * @throws ExtractionException if any
     * @throws InvalidPluginDescriptorException if any
     */
    protected List<MojoDescriptor> extractMojoDescriptors(
```

### JavadocReference
Cannot resolve symbol `InvalidParameterException`
in `maven-plugin-tools-java/src/main/java/org/apache/maven/tools/plugin/extractor/javadoc/JavaJavadocMojoDescriptorExtractor.java`
#### Snippet
```java
    /**
     * @param mojoDescriptor not null
     * @throws InvalidParameterException if any
     */
    protected void validate(MojoDescriptor mojoDescriptor) throws InvalidParameterException {
```

### JavadocReference
Cannot resolve symbol `InvalidPluginDescriptorException`
in `maven-plugin-tools-java/src/main/java/org/apache/maven/tools/plugin/extractor/javadoc/JavaJavadocMojoDescriptorExtractor.java`
#### Snippet
```java
     * @param mojoDescriptor not null
     * @param javaClass not null
     * @throws InvalidPluginDescriptorException if any
     */
    private void extractParameters(MojoDescriptor mojoDescriptor, JavaClass javaClass)
```

### JavadocReference
Cannot resolve symbol `InvalidPluginDescriptorException`
in `maven-plugin-tools-java/src/main/java/org/apache/maven/tools/plugin/extractor/javadoc/JavaJavadocMojoDescriptorExtractor.java`
#### Snippet
```java
     * @param javaClass not null
     * @return a mojo descriptor
     * @throws InvalidPluginDescriptorException if any
     */
    protected MojoDescriptor createMojoDescriptor(JavaClass javaClass) throws InvalidPluginDescriptorException {
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.plugin.descriptor.MojoDescriptor`
in `maven-plugin-tools-java/src/main/java/org/apache/maven/tools/plugin/extractor/javadoc/JavaJavadocMojoDescriptorExtractor.java`
#### Snippet
```java
 * https://maven.apache.org/developers/mojo-api-specification.html</a>
 *
 * @see org.apache.maven.plugin.descriptor.MojoDescriptor
 */
@Named(JavaJavadocMojoDescriptorExtractor.NAME)
```

### JavadocReference
Cannot resolve symbol `InvalidParameterException`
in `maven-plugin-tools-java/src/main/java/org/apache/maven/tools/plugin/extractor/javadoc/JavaJavadocMojoDescriptorExtractor.java`
#### Snippet
```java
     * @param parameter not null
     * @param i positive number
     * @throws InvalidParameterException if any
     */
    protected void validateParameter(Parameter parameter, int i) throws InvalidParameterException {
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `getClass().getResourceAsStream("/extractor.bsh")` might be null
in `maven-script/maven-plugin-tools-beanshell/src/main/java/org/apache/maven/tools/plugin/extractor/beanshell/BeanshellMojoDescriptorExtractor.java`
#### Snippet
```java
            interpreter.set("encoding", "UTF-8");

            interpreter.eval(new InputStreamReader(getClass().getResourceAsStream("/extractor.bsh"), UTF_8));
        } catch (EvalError evalError) {
            throw new InvalidPluginDescriptorException("Error scanning beanshell script", evalError);
```

### DataFlowIssue
Argument `is` might be null
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginHelpGenerator.java`
#### Snippet
```java
                        .getContextClassLoader()
                        .getResourceAsStream(useMaven4Api ? "help-class-source-v4.vm" : "help-class-source.vm"); //
                InputStreamReader isReader = new InputStreamReader(is, UTF_8)) {
            // isReader =
            velocityComponent.getEngine().evaluate(context, stringWriter, "", isReader);
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginXdocGenerator.java`
#### Snippet
```java
            text = text.replace(">", "&gt;");
            text = text.replace("\"", "&quot;");
            text = text.replace("\'", "&apos;");
        }
        return text;
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `maven-script/maven-plugin-tools-model/src/main/java/org/apache/maven/tools/plugin/extractor/model/PluginMetadataParser.java`
#### Snippet
```java
                    throw new PluginMetadataParseException(
                            metadataFile,
                            "Mojo: \'" + mojo.getGoal()
                                    + "\' has a parameter without either property or name attributes. Please specify one.");
                }
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `maven-script/maven-plugin-tools-model/src/main/java/org/apache/maven/tools/plugin/extractor/model/PluginMetadataParser.java`
#### Snippet
```java
                            metadataFile,
                            "Mojo: \'" + mojo.getGoal()
                                    + "\' has a parameter without either property or name attributes. Please specify one.");
                }

```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary string length argument
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
        }
        String packageName = binaryName.substring(0, indexOfDotBetweenPackageAndClass);
        String className = binaryName.substring(indexOfDotBetweenPackageAndClass + 1, binaryName.length());
        return new AbstractMap.SimpleEntry<>(packageName, className);
    }
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/JavaAnnotationsMojoDescriptorExtractor.java`
#### Snippet
```java
            ExtendedMojoDescriptor mojoDescriptor = new ExtendedMojoDescriptor(true);

            // mojoDescriptor.setRole( mojoAnnotatedClass.getClassName() );
            // mojoDescriptor.setRoleHint( "default" );
            mojoDescriptor.setImplementation(mojoAnnotatedClass.getClassName());
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'AntMojoComponentFactory' is still used
in `maven-script/maven-script-ant/src/main/java/org/apache/maven/script/ant/AntMojoComponentFactory.java`
#### Snippet
```java
 */
@Deprecated
public class AntMojoComponentFactory extends AntComponentFactory {

    public Object newInstance(ComponentDescriptor descriptor, ClassRealm realm, PlexusContainer container)
```

### DeprecatedIsStillUsed
Deprecated member 'AntMojoWrapper' is still used
in `maven-script/maven-script-ant/src/main/java/org/apache/maven/script/ant/AntMojoWrapper.java`
#### Snippet
```java
 */
@Deprecated
public class AntMojoWrapper extends AbstractMojo implements ContextEnabled, MapOrientedComponent, LogEnabled {

    private Map<String, Object> pluginContext;
```

### DeprecatedIsStillUsed
Deprecated member 'MAVEN_COMPONENTS' is still used
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/util/PluginUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static final Map<String, String> MAVEN_COMPONENTS;

    static {
```

### DeprecatedIsStillUsed
Deprecated member 'PluginMetadataParseException' is still used
in `maven-script/maven-plugin-tools-model/src/main/java/org/apache/maven/tools/plugin/extractor/model/PluginMetadataParseException.java`
#### Snippet
```java
 */
@Deprecated
public class PluginMetadataParseException extends Exception {
    /** serialVersionUID */
    static final long serialVersionUID = 4022348153707995574L;
```

### DeprecatedIsStillUsed
Deprecated member 'makeHtmlValid' is still used
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static String makeHtmlValid(String description) {

        if (StringUtils.isEmpty(description)) {
```

### DeprecatedIsStillUsed
Deprecated member 'toText' is still used
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static String toText(String html) {
        if (StringUtils.isEmpty(html)) {
            return "";
```

### DeprecatedIsStillUsed
Deprecated member 'PARAMETER_EXPRESSION' is still used
in `maven-plugin-tools-java/src/main/java/org/apache/maven/tools/plugin/extractor/javadoc/JavadocMojoAnnotation.java`
#### Snippet
```java
     */
    @Deprecated
    String PARAMETER_EXPRESSION = "expression";

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'MULTI_EXECUTION_STRATEGY' is still used
in `maven-plugin-tools-java/src/main/java/org/apache/maven/tools/plugin/extractor/javadoc/JavadocMojoAnnotation.java`
#### Snippet
```java
     */
    @Deprecated
    String MULTI_EXECUTION_STRATEGY = "attainAlways";

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'AntMojoDescriptorExtractor' is still used
in `maven-script/maven-plugin-tools-ant/src/main/java/org/apache/maven/tools/plugin/extractor/ant/AntMojoDescriptorExtractor.java`
#### Snippet
```java
@Named(AntMojoDescriptorExtractor.NAME)
@Singleton
public class AntMojoDescriptorExtractor extends AbstractScriptedMojoDescriptorExtractor {
    public static final String NAME = "ant";

```

### DeprecatedIsStillUsed
Deprecated member 'PluginMetadataParser' is still used
in `maven-script/maven-plugin-tools-model/src/main/java/org/apache/maven/tools/plugin/extractor/model/PluginMetadataParser.java`
#### Snippet
```java
 */
@Deprecated
public class PluginMetadataParser {
    /**
     * Default implementation path which will be replaced in
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\(` in RegExp
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocReference.java`
#### Snippet
```java
     */
    private static final Pattern REFERENCE_VALUE_PATTERN =
            Pattern.compile("^\\s*(?:(.+)/)??([^#\\s/]+)?(?:#([^\\s\\(]+(?:\\([^\\)]*\\))?))?(?: +(.*))?$");

    private static final int GROUP_INDEX_MODULE = 1;
```

### RegExpRedundantEscape
Redundant character escape `\\)` in RegExp
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocReference.java`
#### Snippet
```java
     */
    private static final Pattern REFERENCE_VALUE_PATTERN =
            Pattern.compile("^\\s*(?:(.+)/)??([^#\\s/]+)?(?:#([^\\s\\(]+(?:\\([^\\)]*\\))?))?(?: +(.*))?$");

    private static final int GROUP_INDEX_MODULE = 1;
```

### RegExpRedundantEscape
Redundant character escape `\\\"` in RegExp
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
    static Pattern getAnchorPattern(String anchorNameOrId) {
        // javadoc 17 uses"<section ... id=<anchor> >"
        return Pattern.compile(".*(name|NAME|id)=\\\"" + Pattern.quote(anchorNameOrId) + "\\\"");
    }

```

### RegExpRedundantEscape
Redundant character escape `\\\"` in RegExp
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
    static Pattern getAnchorPattern(String anchorNameOrId) {
        // javadoc 17 uses"<section ... id=<anchor> >"
        return Pattern.compile(".*(name|NAME|id)=\\\"" + Pattern.quote(anchorNameOrId) + "\\\"");
    }

```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavadocInlineTagsToXhtmlConverter.java`
#### Snippet
```java
    private final Map<String, JavadocInlineTagToHtmlConverter> converters;

    private static final Pattern INLINE_TAG_PATTERN = Pattern.compile("\\{@([^\\s]*)(?:\\s([^\\}]*))?\\}");
    private static final int GROUP_TAG_NAME = 1;
    private static final int GROUP_REFERENCE = 2;
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavadocInlineTagsToXhtmlConverter.java`
#### Snippet
```java
    private final Map<String, JavadocInlineTagToHtmlConverter> converters;

    private static final Pattern INLINE_TAG_PATTERN = Pattern.compile("\\{@([^\\s]*)(?:\\s([^\\}]*))?\\}");
    private static final int GROUP_TAG_NAME = 1;
    private static final int GROUP_REFERENCE = 2;
```

### RegExpRedundantEscape
Redundant character escape `\\\"` in RegExp
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginXdocGenerator.java`
#### Snippet
```java
     * group 1 = link target, group 2 = link label
     */
    private static final Pattern HTML_LINK_PATTERN = Pattern.compile("<a href=\\\"([^\\\"]*)\\\">(.*?)</a>");

    private static final Logger LOG = LoggerFactory.getLogger(PluginXdocGenerator.class);
```

### RegExpRedundantEscape
Redundant character escape `\\\"` in RegExp
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginXdocGenerator.java`
#### Snippet
```java
     * group 1 = link target, group 2 = link label
     */
    private static final Pattern HTML_LINK_PATTERN = Pattern.compile("<a href=\\\"([^\\\"]*)\\\">(.*?)</a>");

    private static final Logger LOG = LoggerFactory.getLogger(PluginXdocGenerator.class);
```

### RegExpRedundantEscape
Redundant character escape `\\\"` in RegExp
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginXdocGenerator.java`
#### Snippet
```java
     * group 1 = link target, group 2 = link label
     */
    private static final Pattern HTML_LINK_PATTERN = Pattern.compile("<a href=\\\"([^\\\"]*)\\\">(.*?)</a>");

    private static final Logger LOG = LoggerFactory.getLogger(PluginXdocGenerator.class);
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java
        StringBuffer decoded = new StringBuffer(description.length() + 1024);

        Matcher matcher = Pattern.compile("\\{@(\\w+)\\s*([^\\}]*)\\}").matcher(description);
        while (matcher.find()) {
            String tag = matcher.group(1);
```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java
        StringBuffer decoded = new StringBuffer(description.length() + 1024);

        Matcher matcher = Pattern.compile("\\{@(\\w+)\\s*([^\\}]*)\\}").matcher(description);
        while (matcher.find()) {
            String tag = matcher.group(1);
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java
                text = "<code>" + text + "</code>";
            } else if ("link".equals(tag) || "linkplain".equals(tag) || "value".equals(tag)) {
                String pattern = "(([^#\\.\\s]+\\.)*([^#\\.\\s]+))?" + "(#([^\\(\\s]*)(\\([^\\)]*\\))?\\s*(\\S.*)?)?";
                final int label = 7;
                final int clazz = 3;
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java
                text = "<code>" + text + "</code>";
            } else if ("link".equals(tag) || "linkplain".equals(tag) || "value".equals(tag)) {
                String pattern = "(([^#\\.\\s]+\\.)*([^#\\.\\s]+))?" + "(#([^\\(\\s]*)(\\([^\\)]*\\))?\\s*(\\S.*)?)?";
                final int label = 7;
                final int clazz = 3;
```

### RegExpRedundantEscape
Redundant character escape `\\(` in RegExp
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java
                text = "<code>" + text + "</code>";
            } else if ("link".equals(tag) || "linkplain".equals(tag) || "value".equals(tag)) {
                String pattern = "(([^#\\.\\s]+\\.)*([^#\\.\\s]+))?" + "(#([^\\(\\s]*)(\\([^\\)]*\\))?\\s*(\\S.*)?)?";
                final int label = 7;
                final int clazz = 3;
```

### RegExpRedundantEscape
Redundant character escape `\\)` in RegExp
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java
                text = "<code>" + text + "</code>";
            } else if ("link".equals(tag) || "linkplain".equals(tag) || "value".equals(tag)) {
                String pattern = "(([^#\\.\\s]+\\.)*([^#\\.\\s]+))?" + "(#([^\\(\\s]*)(\\([^\\)]*\\))?\\s*(\\S.*)?)?";
                final int label = 7;
                final int clazz = 3;
```

## RuleId[id=RefusedBequest]
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/EnhancedParameterWrapper.java`
#### Snippet
```java
    }

    public Parameter clone() {
        return delegate.clone();
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/ExtendedPluginDescriptor.java`
#### Snippet
```java
    }

    public PluginDescriptor clone() {
        return delegate.clone();
    }
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/report_old/PluginReport.java`
#### Snippet
```java
        try {
            File outputDir = outputDirectory;
            outputDir.mkdirs();

            PluginXdocGenerator generator = new PluginXdocGenerator(
                    getProject(), locale, getReportOutputDirectory(), disableInternalJavadocLinkValidation);
            PluginToolsRequest pluginToolsRequest = new DefaultPluginToolsRequest(getProject(), pluginDescriptor);
            generator.execute(outputDir, pluginToolsRequest);
        } catch (GeneratorException e) {
            throw new MavenReportException("Error writing plugin documentation", e);
        }
```

### DuplicatedCode
Duplicated code
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/report_old/PluginReport.java`
#### Snippet
```java
startSection(getTitle());

            if (!(pluginDescriptor.getMojos() != null
                    && pluginDescriptor.getMojos().size() > 0)) {
                paragraph(getBundle(locale).getString("report.plugin.goals.nogoal"));
                endSection();
                return;
            }

            paragraph(getBundle(locale).getString("report.plugin.goals.intro"));

            boolean hasMavenReport = false;
            for (Iterator<MojoDescriptor> i = pluginDescriptor.getMojos().iterator(); i.hasNext(); ) {
                MojoDescriptor mojo = i.next();

                if (GeneratorUtils.isMavenReport(mojo.getImplementation(), project)) {
                    hasMavenReport = true;
                }
            }

            startTable();

            String goalColumnName = getBundle(locale).getString("report.plugin.goals.column.goal");
            String isMavenReport = getBundle(locale).getString("report.plugin.goals.column.isMavenReport");
            String descriptionColumnName = getBundle(locale).getString("report.plugin.goals.column.description");
            if (hasMavenReport) {
                tableHeader(new String[] {goalColumnName, isMavenReport, descriptionColumnName});
            } else {
                tableHeader(new String[] {goalColumnName, descriptionColumnName});
            }

            List<MojoDescriptor> mojos = new ArrayList<>();
            mojos.addAll(pluginDescriptor.getMojos());
            PluginUtils.sortMojos(mojos);
            for (MojoDescriptor mojo : mojos) {
                String goalName = mojo.getFullGoalName();

                /*
                 * Added ./ to define a relative path
                 * @see AbstractMavenReportRenderer#getValidHref(java.lang.String)
                 */
                String goalDocumentationLink = "./" + mojo.getGoal() + "-mojo.html";

                String description;
                if (StringUtils.isNotEmpty(mojo.getDeprecated())) {
                    description = "<strong>" + getBundle(locale).getString("report.plugin.goal.deprecated")
                            + "</strong> " + mojo.getDeprecated();
                } else if (StringUtils.isNotEmpty(mojo.getDescription())) {
                    description = mojo.getDescription();
                } else {
                    description = getBundle(locale).getString("report.plugin.goal.nodescription");
                }

                sink.tableRow();
                tableCell(createLinkPatternedText(goalName, goalDocumentationLink));
                if (hasMavenReport) {
                    if (GeneratorUtils.isMavenReport(mojo.getImplementation(), project)) {
                        sink.tableCell();
                        sink.text(getBundle(locale).getString("report.plugin.isReport"));
                        sink.tableCell_();
                    } else {
                        sink.tableCell();
                        sink.text(getBundle(locale).getString("report.plugin.isNotReport"));
                        sink.tableCell_();
                    }
                }
                tableCell(description, true);
                sink.tableRow_();
            }

            endTable();

            startSection(getBundle(locale).getString("report.plugin.systemrequirements"));

            paragraph(getBundle(locale).getString("report.plugin.systemrequirements.intro"));

            startTable();

            String maven = discoverMavenRequirement(project, requirements);
            sink.tableRow();
            tableCell(getBundle(locale).getString("report.plugin.systemrequirements.maven"));
            tableCell(
                    (maven != null
                            ? maven
                            : getBundle(locale).getString("report.plugin.systemrequirements.nominimum")));
            sink.tableRow_();

            String jdk = discoverJdkRequirement(project, requirements);
            sink.tableRow();
            tableCell(getBundle(locale).getString("report.plugin.systemrequirements.jdk"));
            tableCell((jdk != null ? jdk : getBundle(locale).getString("report.plugin.systemrequirements.nominimum")));
            sink.tableRow_();
```

### DuplicatedCode
Duplicated code
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/report_old/PluginReport.java`
#### Snippet
```java
            if (requirementsHistories.isEmpty()) {
                return;
            }

            startSection(getBundle(locale).getString("report.plugin.systemrequirements.history"));
            paragraph(getBundle(locale).getString("report.plugin.systemrequirements.history.intro"));

            startTable();
            tableHeader(new String[] {
                getBundle(locale).getString("report.plugin.systemrequirements.history.version"),
                getBundle(locale).getString("report.plugin.systemrequirements.history.maven"),
                getBundle(locale).getString("report.plugin.systemrequirements.history.jdk")
            });

            requirementsHistories.forEach(requirementsHistory -> {
                sink.tableRow();
                tableCell(requirementsHistory.getVersion());
                tableCell(requirementsHistory.getMaven());
                tableCell(requirementsHistory.getJdk());
                sink.tableRow_();
            });
            endTable();

            endSection();
```

### DuplicatedCode
Duplicated code
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/report_old/PluginReport.java`
#### Snippet
```java
startSection(getBundle(locale).getString("report.plugin.usage"));

            // Configuration
            sink.paragraph();
            text(getBundle(locale).getString("report.plugin.usage.intro"));
            sink.paragraph_();

            StringBuilder sb = new StringBuilder();
            sb.append("<project>").append('\n');
            sb.append("  ...").append('\n');
            sb.append("  <build>").append('\n');
            sb.append("    <!-- " + getBundle(locale).getString("report.plugin.usage.pluginManagement") + " -->")
                    .append('\n');
            sb.append("    <pluginManagement>").append('\n');
            sb.append("      <plugins>").append('\n');
            sb.append("        <plugin>").append('\n');
            sb.append("          <groupId>")
                    .append(pluginDescriptor.getGroupId())
                    .append("</groupId>")
                    .append('\n');
            sb.append("          <artifactId>")
                    .append(pluginDescriptor.getArtifactId())
                    .append("</artifactId>")
                    .append('\n');
            sb.append("          <version>")
                    .append(pluginDescriptor.getVersion())
                    .append("</version>")
                    .append('\n');
            if (hasExtensionsToLoad) {
                sb.append("          <extensions>true</extensions>").append('\n');
            }
            sb.append("        </plugin>").append('\n');
            sb.append("        ...").append('\n');
            sb.append("      </plugins>").append('\n');
            sb.append("    </pluginManagement>").append('\n');
            sb.append("    <!-- " + getBundle(locale).getString("report.plugin.usage.plugins") + " -->")
                    .append('\n');
            sb.append("    <plugins>").append('\n');
            sb.append("      <plugin>").append('\n');
            sb.append("        <groupId>")
                    .append(pluginDescriptor.getGroupId())
                    .append("</groupId>")
                    .append('\n');
            sb.append("        <artifactId>")
                    .append(pluginDescriptor.getArtifactId())
                    .append("</artifactId>")
                    .append('\n');
            sb.append("      </plugin>").append('\n');
            sb.append("      ...").append('\n');
            sb.append("    </plugins>").append('\n');
            sb.append("  </build>").append('\n');

            if (hasMavenReport) {
                sb.append("  ...").append('\n');
                sb.append("  <!-- " + getBundle(locale).getString("report.plugin.usage.reporting") + " -->")
                        .append('\n');
                sb.append("  <reporting>").append('\n');
                sb.append("    <plugins>").append('\n');
                sb.append("      <plugin>").append('\n');
                sb.append("        <groupId>")
                        .append(pluginDescriptor.getGroupId())
                        .append("</groupId>")
                        .append('\n');
                sb.append("        <artifactId>")
                        .append(pluginDescriptor.getArtifactId())
                        .append("</artifactId>")
                        .append('\n');
                sb.append("        <version>")
                        .append(pluginDescriptor.getVersion())
                        .append("</version>")
                        .append('\n');
                sb.append("      </plugin>").append('\n');
                sb.append("      ...").append('\n');
                sb.append("    </plugins>").append('\n');
                sb.append("  </reporting>").append('\n');
            }

            sb.append("  ...").append('\n');
            sb.append("</project>").append('\n');

            verbatimText(sb.toString());

            sink.paragraph();
            linkPatternedText(getBundle(locale).getString("report.plugin.configuration.end"));
            sink.paragraph_();

            endSection();
```

### DuplicatedCode
Duplicated code
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/report_old/PluginReport.java`
#### Snippet
```java
            if (jdk != null) {
                return jdk;
            }

            Plugin compiler = getCompilerPlugin(project.getBuild().getPluginsAsMap());
            if (compiler == null) {
                compiler = getCompilerPlugin(project.getPluginManagement().getPluginsAsMap());
            }

            jdk = getPluginParameter(compiler, "release");
            if (jdk != null) {
                return jdk;
            }

            jdk = project.getProperties().getProperty("maven.compiler.release");
            if (jdk != null) {
                return jdk;
            }

            jdk = getPluginParameter(compiler, "target");
            if (jdk != null) {
                return jdk;
            }

            // default value
            jdk = project.getProperties().getProperty("maven.compiler.target");
            if (jdk != null) {
                return jdk;
            }

            // return "1.5" by default?

            String version = (compiler == null) ? null : compiler.getVersion();

            if (version != null) {
                return "Default target for maven-compiler-plugin version " + version;
            }
```

### DuplicatedCode
Duplicated code
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/report_old/PluginReport.java`
#### Snippet
```java
            if (plugin != null) {
                Xpp3Dom pluginConf = (Xpp3Dom) plugin.getConfiguration();

                if (pluginConf != null) {
                    Xpp3Dom target = pluginConf.getChild(parameter);

                    if (target != null) {
                        return target.getValue();
                    }
                }
            }

            return null;
```

### DuplicatedCode
Duplicated code
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/report_old/RequirementsHistory.java`
#### Snippet
```java
        final StringBuilder sb = new StringBuilder("RequirementsHistory{");
        sb.append("version='").append(version).append('\'');
        sb.append(", maven='").append(maven).append('\'');
        sb.append(", jdk='").append(jdk).append('\'');
        sb.append('}');
        return sb.toString();
```

### DuplicatedCode
Duplicated code
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/JavaAnnotationsMojoDescriptorExtractor.java`
#### Snippet
```java
                parameterAnnotationContent.setDescription(getDescriptionFromElement(element, context));

                DocletTag deprecated = element.getTagByName("deprecated");
                if (deprecated != null) {
                    parameterAnnotationContent.setDeprecated(getRawValueFromTaglet(deprecated, context));
                }

                DocletTag since = element.getTagByName("since");
                if (since != null) {
                    parameterAnnotationContent.setSince(getRawValueFromTaglet(since, context));
                }
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[^\\s]` can be simplified to '\\S'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavadocInlineTagsToXhtmlConverter.java`
#### Snippet
```java
    private final Map<String, JavadocInlineTagToHtmlConverter> converters;

    private static final Pattern INLINE_TAG_PATTERN = Pattern.compile("\\{@([^\\s]*)(?:\\s([^\\}]*))?\\}");
    private static final int GROUP_TAG_NAME = 1;
    private static final int GROUP_REFERENCE = 2;
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/util/PluginUtils.java`
#### Snippet
```java
     * @param include not null
     * @param exclude could be null
     * @return list of included files
     */
    public static String[] findSources(String basedir, String include, String exclude) {
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/util/PluginUtils.java`
#### Snippet
```java
     * @param basedir not null
     * @param include not null
     * @return list of included files with default SCM excluded files
     */
    public static String[] findSources(String basedir, String include) {
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/DefaultMojoAnnotationsScanner.java`
#### Snippet
```java

        String zipEntryName = null;
        try (ZipInputStream archiveStream = new ZipInputStream(new FileInputStream(archiveFile))) {
            String archiveFilename = archiveFile.getAbsolutePath();
            for (ZipEntry zipEntry = archiveStream.getNextEntry();
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/DefaultMojoAnnotationsScanner.java`
#### Snippet
```java

            try (InputStream is = //
                    new BufferedInputStream(new FileInputStream(new File(classDirectory, classFile)))) {
                analyzeClassStream(mojoAnnotatedClasses, is, artifact, excludeMojo, classDirname, classFile);
            }
```

## RuleId[id=Deprecation]
### Deprecation
'makeHtmlValid(java.lang.String)' is deprecated
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginDescriptorFilesGenerator.java`
#### Snippet
```java
        if (!containsXhtmlValue) // text comes from legacy extractor
        {
            xhtmlText = GeneratorUtils.makeHtmlValid(text);
        } else {
            xhtmlText = text;
```

### Deprecation
'toURL()' is deprecated
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java
            for (String classPathString : classPathStrings) {
                try {
                    urls.add(new File(classPathString).toURL());
                } catch (MalformedURLException e) {
                    throw new IllegalArgumentException(e);
```

### Deprecation
'MAVEN_COMPONENTS' is deprecated
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/JavaAnnotationsMojoDescriptorExtractor.java`
#### Snippet
```java

                // recognize Maven-injected objects as components annotations instead of parameters
                String expression = PluginUtils.MAVEN_COMPONENTS.get(componentAnnotationContent.getRoleClassName());
                if (expression == null) {
                    // normal component
```

### Deprecation
'MAVEN_COMPONENTS' is deprecated
in `maven-plugin-tools-java/src/main/java/org/apache/maven/tools/plugin/extractor/javadoc/JavaJavadocMojoDescriptorExtractor.java`
#### Snippet
```java
                // Note: the expressions we are looking for, i.e. "${project}", are in the values of the Map,
                // so the lookup mechanism is different here than in maven-plugin-tools-annotations
                boolean isDeprecated = PluginUtils.MAVEN_COMPONENTS.containsValue(role);

                if (!isDeprecated) {
```

### Deprecation
'PARAMETER_EXPRESSION' is deprecated
in `maven-plugin-tools-java/src/main/java/org/apache/maven/tools/plugin/extractor/javadoc/JavaJavadocMojoDescriptorExtractor.java`
#### Snippet
```java
                }

                String expression = parameter.getNamedParameter(JavadocMojoAnnotation.PARAMETER_EXPRESSION);
                String property = parameter.getNamedParameter(JavadocMojoAnnotation.PARAMETER_PROPERTY);

```

### Deprecation
'MULTI_EXECUTION_STRATEGY' is deprecated
in `maven-plugin-tools-java/src/main/java/org/apache/maven/tools/plugin/extractor/javadoc/JavaJavadocMojoDescriptorExtractor.java`
#### Snippet
```java

        // executionStrategy (and deprecated @attainAlways)
        tag = findInClassHierarchy(javaClass, JavadocMojoAnnotation.MULTI_EXECUTION_STRATEGY);
        if (tag != null) {
            getLogger()
```

### Deprecation
'MULTI_EXECUTION_STRATEGY' is deprecated
in `maven-plugin-tools-java/src/main/java/org/apache/maven/tools/plugin/extractor/javadoc/JavaJavadocMojoDescriptorExtractor.java`
#### Snippet
```java
        if (tag != null) {
            getLogger()
                    .warn("@" + JavadocMojoAnnotation.MULTI_EXECUTION_STRATEGY + " in "
                            + javaClass.getFullyQualifiedName() + " is deprecated: please use '@"
                            + JavadocMojoAnnotation.EXECUTION_STATEGY + " always' instead.");
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/report_old/Requirements.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Requirements{");
        sb.append("maven='").append(maven).append('\'');
        sb.append(", jdk='").append(jdk).append('\'');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/report_old/RequirementsHistory.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RequirementsHistory{");
        sb.append("version='").append(version).append('\'');
        sb.append(", maven='").append(maven).append('\'');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `maven-plugin-report-plugin/src/main/java/org/apache/maven/plugin/plugin/report/RequirementsHistory.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RequirementsHistory{");
        sb.append("version='").append(version).append('\'');
        sb.append(", maven='").append(maven).append('\'');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/MojoAnnotatedClass.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("MojoAnnotatedClass");
        sb.append("{className='").append(className).append('\'');
```

### StringBufferReplaceableByString
`StringBuilder shortType` can be replaced with 'String'
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginXdocGenerator.java`
#### Snippet
```java
            return getShortTypeOfSimpleType(type);
        } else {
            StringBuilder shortType = new StringBuilder();
            shortType.append(getShortTypeOfSimpleType(type.substring(0, startTypeArguments)));
            shortType
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/datamodel/AnnotatedField.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("AnnotatedField");
        sb.append("{fieldName='").append(fieldName).append('\'');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/datamodel/ExecuteAnnotationContent.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ExecuteAnnotationContent");
        sb.append("{goal='").append(goal).append('\'');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/datamodel/ComponentAnnotationContent.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("ComponentAnnotationContent");
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/datamodel/MojoAnnotationContent.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("MojoAnnotationContent");
        sb.append("{name='").append(name).append('\'');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/datamodel/ParameterAnnotationContent.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("ParameterAnnotationContent");
```

### StringBufferReplaceableByString
`StringBuilder memberBuilder` can be replaced with 'String'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavaClassConverterContext.java`
#### Snippet
```java
                }
                // reconstruct member with fully qualified names but leaving out the argument names
                StringBuilder memberBuilder = new StringBuilder(methodName);
                memberBuilder.append("(");
                memberBuilder.append(parameterTypes.stream()
```

## RuleId[id=CdiInjectionPointsInspection]
### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/scanner/DefaultMojoScanner.java`
#### Snippet
```java
     */
    @Inject
    public DefaultMojoScanner(Map<String, MojoDescriptorExtractor> extractors) {
        this.mojoDescriptorExtractors = extractors;

```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavadocInlineTagsToXhtmlConverter.java`
#### Snippet
```java

    @Inject
    public JavadocInlineTagsToXhtmlConverter(Map<String, JavadocInlineTagToHtmlConverter> converters) {
        this.converters = converters;
    }
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavadocBlockTagsToXhtmlConverter.java`
#### Snippet
```java
    public JavadocBlockTagsToXhtmlConverter(
            JavadocInlineTagsToXhtmlConverter inlineTagsConverter,
            Map<String, JavadocBlockTagToHtmlConverter> blockTagConverters) {
        this.inlineTagsConverter = inlineTagsConverter;
        this.blockTagConverters = blockTagConverters;
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/JavaAnnotationsMojoDescriptorExtractor.java`
#### Snippet
```java

    @Inject
    private ArchiverManager archiverManager;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/JavaAnnotationsMojoDescriptorExtractor.java`
#### Snippet
```java

    @Inject
    private RepositorySystem repositorySystem;

    @Inject
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `Counter` may be 'static'
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java
         * Holds the index of the current item in a numbered list.
         */
        class Counter {
            int value;
        }
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/extractor/GroupKey.java`
#### Snippet
```java
     */
    @Override
    public int compareTo(final GroupKey o) {
        if (JAVA_GROUP.equals(this.group) && !JAVA_GROUP.equals(o.group)) {
            return -1;
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/DescriptorGeneratorMojo.java`
#### Snippet
```java
     * <pre>
     * &lt;externalJavadocBaseUrls&gt;
     *   &lt;externalJavadocBaseUrl&gt;https://docs.oracle.com/javase/8/docs/api/&lt;/externalJavadocBaseUrl&gt;
     * &lt;externalJavadocBaseUrls&gt;
     * </pre>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/DescriptorGeneratorMojo.java`
#### Snippet
```java
     * &lt;externalJavadocBaseUrls&gt;
     * </pre>
     * is valid because <code>https://docs.oracle.com/javase/8/docs/api/package-list</code> exists.
     * See <a href="https://docs.oracle.com/en/java/javase/17/docs/specs/man/javadoc.html#standard-doclet-options">
     * link option of the javadoc tool</a>.
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/DescriptorGeneratorMojo.java`
#### Snippet
```java
     */
    @Parameter(defaultValue = "true", property = "maven.plugin.checkExpectedProvidedScope")
    private boolean checkExpectedProvidedScope = true;

    /**
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
            if (moduleName.isPresent()) {
                String actualModuleName = containedPackageNamesAndModules.get(packageName.get());
                if (!moduleName.get().equals(actualModuleName)) {
                    return false;
                }
```

### TrivialIf
`if` statement can be simplified
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
                }
            } else {
                if (!containedPackageNamesAndModules.containsKey(packageName.get())) {
                    return false;
                }
```

### TrivialIf
`if` statement can be simplified
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
            }
        } else if (moduleName.isPresent()) {
            if (!containedPackageNamesAndModules.containsValue(moduleName.get())) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/datamodel/ParameterAnnotationContent.java`
#### Snippet
```java
            return false;
        }
        if (!Objects.equals(property, that.property)) {
            return false;
        }
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/DescriptorGeneratorMojo.java`
#### Snippet
```java
            request.setPluginDescriptor(extendPluginDescriptor(request));

            outputDirectory.mkdirs();

            PluginDescriptorFilesGenerator pluginDescriptorGenerator = new PluginDescriptorFilesGenerator();
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `maven-plugin-report-plugin/src/main/java/org/apache/maven/plugin/plugin/report/PluginReport.java`
#### Snippet
```java
        try {
            File outputDir = outputDirectory;
            outputDir.mkdirs();

            PluginXdocGenerator generator = new PluginXdocGenerator(
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/report_old/PluginReport.java`
#### Snippet
```java
        try {
            File outputDir = outputDirectory;
            outputDir.mkdirs();

            PluginXdocGenerator generator = new PluginXdocGenerator(
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/extractor/AbstractScriptedMojoDescriptorExtractor.java`
#### Snippet
```java

        if (!outputDir.exists()) {
            outputDir.mkdirs();
        }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/extractor/AbstractScriptedMojoDescriptorExtractor.java`
#### Snippet
```java

                if (!outputFile.getParentFile().exists()) {
                    outputFile.getParentFile().mkdirs();
                }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginHelpGenerator.java`
#### Snippet
```java

            File helpClass = new File(destinationDirectory, sourcePath);
            helpClass.getParentFile().mkdirs();

            String helpClassSources = getHelpClassSources(getPluginHelpPath(mavenProject));
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginDescriptorFilesGenerator.java`
#### Snippet
```java

        if (!destinationFile.getParentFile().exists()) {
            destinationFile.getParentFile().mkdirs();
        }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/JavaAnnotationsMojoDescriptorExtractor.java`
#### Snippet
```java
                                + sourcesArtifact.getArtifactId() + "/" + sourcesArtifact.getVersion()
                                + "/" + sourcesArtifact.getClassifier());
                extractDirectory.mkdirs();

                UnArchiver unArchiver = archiverManager.getUnArchiver("jar");
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'moduleName'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocReference.java`
#### Snippet
```java

    JavadocReference(
            Optional<String> moduleName,
            Optional<String> packageNameClassName,
            Optional<String> member,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'packageNameClassName'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocReference.java`
#### Snippet
```java
    JavadocReference(
            Optional<String> moduleName,
            Optional<String> packageNameClassName,
            Optional<String> member,
            Optional<String> label) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'member'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocReference.java`
#### Snippet
```java
            Optional<String> moduleName,
            Optional<String> packageNameClassName,
            Optional<String> member,
            Optional<String> label) {
        this.moduleName = moduleName;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'label'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocReference.java`
#### Snippet
```java
            Optional<String> packageNameClassName,
            Optional<String> member,
            Optional<String> label) {
        this.moduleName = moduleName;
        this.packageNameClassName = packageNameClassName;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'moduleName'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocReference.java`
#### Snippet
```java
 */
public class JavadocReference {
    private final Optional<String> moduleName;

    private final Optional<String> packageNameClassName;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'member'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocReference.java`
#### Snippet
```java
    private final Optional<String> packageNameClassName;

    private final Optional<String> member; // optional, but may appear with both className and packageName being null

    private final Optional<String> label;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'packageNameClassName'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocReference.java`
#### Snippet
```java
    private final Optional<String> moduleName;

    private final Optional<String> packageNameClassName;

    private final Optional<String> member; // optional, but may appear with both className and packageName being null
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'label'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocReference.java`
#### Snippet
```java
    private final Optional<String> member; // optional, but may appear with both className and packageName being null

    private final Optional<String> label;

    /*
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'moduleName'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/FullyQualifiedJavadocReference.java`
#### Snippet
```java

    public FullyQualifiedJavadocReference(
            Optional<String> moduleName,
            Optional<String> packageName,
            Optional<String> className,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'packageName'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/FullyQualifiedJavadocReference.java`
#### Snippet
```java
    public FullyQualifiedJavadocReference(
            Optional<String> moduleName,
            Optional<String> packageName,
            Optional<String> className,
            Optional<String> member,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'className'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/FullyQualifiedJavadocReference.java`
#### Snippet
```java
            Optional<String> moduleName,
            Optional<String> packageName,
            Optional<String> className,
            Optional<String> member,
            Optional<MemberType> memberType,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'member'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/FullyQualifiedJavadocReference.java`
#### Snippet
```java
            Optional<String> packageName,
            Optional<String> className,
            Optional<String> member,
            Optional<MemberType> memberType,
            Optional<String> label,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'memberType'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/FullyQualifiedJavadocReference.java`
#### Snippet
```java
            Optional<String> className,
            Optional<String> member,
            Optional<MemberType> memberType,
            Optional<String> label,
            boolean isExternal) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'label'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/FullyQualifiedJavadocReference.java`
#### Snippet
```java
            Optional<String> member,
            Optional<MemberType> memberType,
            Optional<String> label,
            boolean isExternal) {
        super(moduleName, className, member, label);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'label'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/FullyQualifiedJavadocReference.java`
#### Snippet
```java
    }

    public FullyQualifiedJavadocReference(String packageName, Optional<String> label, boolean isExternal) {
        this(packageName, Optional.empty(), Optional.empty(), Optional.empty(), label, isExternal);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'memberType'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/FullyQualifiedJavadocReference.java`
#### Snippet
```java
    private final Optional<String> packageName;

    private final Optional<MemberType> memberType;

    /** The type of the member part of the reference. */
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'packageName'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/FullyQualifiedJavadocReference.java`
#### Snippet
```java
    private final boolean isExternal;

    private final Optional<String> packageName;

    private final Optional<MemberType> memberType;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'className'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/FullyQualifiedJavadocReference.java`
#### Snippet
```java
    public FullyQualifiedJavadocReference(
            String packageName,
            Optional<String> className,
            Optional<String> member,
            Optional<MemberType> memberType,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'member'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/FullyQualifiedJavadocReference.java`
#### Snippet
```java
            String packageName,
            Optional<String> className,
            Optional<String> member,
            Optional<MemberType> memberType,
            Optional<String> label,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'memberType'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/FullyQualifiedJavadocReference.java`
#### Snippet
```java
            Optional<String> className,
            Optional<String> member,
            Optional<MemberType> memberType,
            Optional<String> label,
            boolean isExternal) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'label'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/FullyQualifiedJavadocReference.java`
#### Snippet
```java
            Optional<String> member,
            Optional<MemberType> memberType,
            Optional<String> label,
            boolean isExternal) {
        this(Optional.empty(), Optional.of(packageName), className, member, memberType, label, isExternal);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'moduleName'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java

    static URI createLink(
            URI baseUri, Optional<String> moduleName, Optional<String> packageName, Optional<String> className)
            throws URISyntaxException {
        StringBuilder link = new StringBuilder();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'packageName'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java

    static URI createLink(
            URI baseUri, Optional<String> moduleName, Optional<String> packageName, Optional<String> className)
            throws URISyntaxException {
        StringBuilder link = new StringBuilder();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'className'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java

    static URI createLink(
            URI baseUri, Optional<String> moduleName, Optional<String> packageName, Optional<String> className)
            throws URISyntaxException {
        StringBuilder link = new StringBuilder();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'pathPrefix'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
            URI baseUri,
            BiFunction<URI, FullyQualifiedJavadocReference, URI> fragmentAppender,
            Optional<String> pathPrefix)
            throws IllegalArgumentException {
        try {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optionalMember'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
     */
    // CHECKSTYLE_ON: LineLength
    URI appendMemberAsFragment(URI url, Optional<String> optionalMember, Optional<MemberType> optionalMemberType)
            throws URISyntaxException, IOException {
        if (!optionalMember.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optionalMemberType'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
     */
    // CHECKSTYLE_ON: LineLength
    URI appendMemberAsFragment(URI url, Optional<String> optionalMember, Optional<MemberType> optionalMemberType)
            throws URISyntaxException, IOException {
        if (!optionalMember.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'moduleName'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
    }

    public boolean hasEntryFor(Optional<String> moduleName, Optional<String> packageName) {
        if (containedPackageNamesAndModules.isEmpty()) {
            throw new UnsupportedOperationException(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'packageName'
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
    }

    public boolean hasEntryFor(Optional<String> moduleName, Optional<String> packageName) {
        if (containedPackageNamesAndModules.isEmpty()) {
            throw new UnsupportedOperationException(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'moduleName'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/tag/LinkUtils.java`
#### Snippet
```java

    private static String createLabel(
            Optional<String> moduleName,
            Optional<String> packageName,
            Optional<String> className,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'packageName'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/tag/LinkUtils.java`
#### Snippet
```java
    private static String createLabel(
            Optional<String> moduleName,
            Optional<String> packageName,
            Optional<String> className,
            Optional<String> member) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'className'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/tag/LinkUtils.java`
#### Snippet
```java
            Optional<String> moduleName,
            Optional<String> packageName,
            Optional<String> className,
            Optional<String> member) {
        StringBuilder sb = new StringBuilder();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'member'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/tag/LinkUtils.java`
#### Snippet
```java
            Optional<String> packageName,
            Optional<String> className,
            Optional<String> member) {
        StringBuilder sb = new StringBuilder();
        if (packageName.isPresent() && !"java.lang".equals(packageName.get())) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'member'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavaClassConverterContext.java`
#### Snippet
```java
            String fullyQualifiedPackageNameClassName,
            String nestedClassName,
            Optional<String> member,
            Optional<String> label) {
        JavaClass javaClass = javaProjectBuilder.getClassByName(fullyQualifiedPackageNameClassName);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'label'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavaClassConverterContext.java`
#### Snippet
```java
            String nestedClassName,
            Optional<String> member,
            Optional<String> label) {
        JavaClass javaClass = javaProjectBuilder.getClassByName(fullyQualifiedPackageNameClassName);
        if (!isClassFound(javaClass)) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'member'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavaClassConverterContext.java`
#### Snippet
```java

    private Optional<FullyQualifiedJavadocReference> resolveMember(
            JavaClass javaClass, Optional<String> member, Optional<String> label) {
        final Optional<MemberType> memberType;
        Optional<String> resolvedMember = member;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'label'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavaClassConverterContext.java`
#### Snippet
```java

    private Optional<FullyQualifiedJavadocReference> resolveMember(
            JavaClass javaClass, Optional<String> member, Optional<String> label) {
        final Optional<MemberType> memberType;
        Optional<String> resolvedMember = member;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'javaModule'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavaClassConverterContext.java`
#### Snippet
```java
    final int lineNumber;

    final Optional<JavaModule> javaModule;

    final Map<String, Object> attributes;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'member'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavaClassConverterContext.java`
#### Snippet
```java

    private Optional<FullyQualifiedJavadocReference> resolveMember(
            String fullyQualifiedPackageNameClassName, Optional<String> member, Optional<String> label) {
        return resolveMember(fullyQualifiedPackageNameClassName, "", member, label);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'label'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavaClassConverterContext.java`
#### Snippet
```java

    private Optional<FullyQualifiedJavadocReference> resolveMember(
            String fullyQualifiedPackageNameClassName, Optional<String> member, Optional<String> label) {
        return resolveMember(fullyQualifiedPackageNameClassName, "", member, label);
    }
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugins/plugin/descriptor_old/EnhancedPluginDescriptorBuilder.java`
#### Snippet
```java
     * MNG-6109</a> when using Maven-3.3.9 and before.
     * Method can be removed once Maven 3.5.0 is the prerequisite for this plugin.
     * @throws PlexusConfigurationException
     *
     * @since 3.5.1
```

### JavadocDeclaration
Javadoc pointing to itself
in `maven-plugin-annotations/src/main/java/org/apache/maven/plugins/annotations/Execute.java`
#### Snippet
```java
     * Custom lifecycle phase to fork. Note that specifying a phase overrides specifying a goal.
     * This element should only be used for non-standard phases. For standard phases rather use {@link #phase()}.
     * Only one of {@link #customPhase()} and {@link #phase()} must be set.
     * @return the custom phase id
     * @since 3.8.0
```

### JavadocDeclaration
Javadoc pointing to itself
in `maven-plugin-annotations/src/main/java/org/apache/maven/plugins/annotations/Execute.java`
#### Snippet
```java
     * Lifecycle phase to fork. Note that specifying a phase overrides specifying a goal.
     * For custom lifecycle phase ids use {@link #customPhase()} instead.
     * Only one of {@link #customPhase()} and {@link #phase()} must be set.
     * @return the phase
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `maven-plugin-report-plugin/src/main/java/org/apache/maven/plugins/plugin/descriptor/EnhancedPluginDescriptorBuilder.java`
#### Snippet
```java
     * MNG-6109</a> when using Maven-3.3.9 and before.
     * Method can be removed once Maven 3.5.0 is the prerequisite for this plugin.
     * @throws PlexusConfigurationException
     *
     * @since 3.5.1
```

### JavadocDeclaration
`@param javadocVersion` tag description is missing
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/PluginToolsRequest.java`
#### Snippet
```java
    /**
     *
     * @param javadocVersion
     * @return This request.
     * @since 3.7.0
```

### JavadocDeclaration
`@param javadocLinks` tag description is missing
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/PluginToolsRequest.java`
#### Snippet
```java
    /**
     *
     * @param javadocLinks
     * @return This request.
     * @since 3.7.0
```

### JavadocDeclaration
`@param mavenApiVersion` tag description is missing
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/PluginToolsRequest.java`
#### Snippet
```java
    /**
     *
     * @param mavenApiVersion
     * @return his request.
     * @since 3.8.0
```

### JavadocDeclaration
`@param ns` tag description is missing
in `maven-script/maven-script-ant/src/main/java/org/apache/maven/script/ant/AntPropertyHelper.java`
#### Snippet
```java
    /**
     * @deprecated added to keep backwards compatibility
     * @param ns
     * @param name
     * @param user
```

### JavadocDeclaration
`@param name` tag description is missing
in `maven-script/maven-script-ant/src/main/java/org/apache/maven/script/ant/AntPropertyHelper.java`
#### Snippet
```java
     * @deprecated added to keep backwards compatibility
     * @param ns
     * @param name
     * @param user
     * @param mavenProject
```

### JavadocDeclaration
`@param user` tag description is missing
in `maven-script/maven-script-ant/src/main/java/org/apache/maven/script/ant/AntPropertyHelper.java`
#### Snippet
```java
     * @param ns
     * @param name
     * @param user
     * @param mavenProject
     * @return The property value.
```

### JavadocDeclaration
`@param mavenProject` tag description is missing
in `maven-script/maven-script-ant/src/main/java/org/apache/maven/script/ant/AntPropertyHelper.java`
#### Snippet
```java
     * @param name
     * @param user
     * @param mavenProject
     * @return The property value.
     */
```

### JavadocDeclaration
`@param exprEvaluator` tag description is missing
in `maven-script/maven-script-ant/src/main/java/org/apache/maven/script/ant/AntPropertyHelper.java`
#### Snippet
```java

    /**
     * @param exprEvaluator
     * @param artifacts
     * @param l
```

### JavadocDeclaration
`@param artifacts` tag description is missing
in `maven-script/maven-script-ant/src/main/java/org/apache/maven/script/ant/AntPropertyHelper.java`
#### Snippet
```java
    /**
     * @param exprEvaluator
     * @param artifacts
     * @param l
     */
```

### JavadocDeclaration
`@param l` tag description is missing
in `maven-script/maven-script-ant/src/main/java/org/apache/maven/script/ant/AntPropertyHelper.java`
#### Snippet
```java
     * @param exprEvaluator
     * @param artifacts
     * @param l
     */
    public AntPropertyHelper(ExpressionEvaluator exprEvaluator, Set<Artifact> artifacts, Log l) {
```

### JavadocDeclaration
`@param project` tag description is missing
in `maven-script/maven-script-ant/src/main/java/org/apache/maven/script/ant/AntPropertyHelper.java`
#### Snippet
```java
    /**
     * @deprecated use the other constructor
     * @param project
     * @param l
     */
```

### JavadocDeclaration
`@param l` tag description is missing
in `maven-script/maven-script-ant/src/main/java/org/apache/maven/script/ant/AntPropertyHelper.java`
#### Snippet
```java
     * @deprecated use the other constructor
     * @param project
     * @param l
     */
    public AntPropertyHelper(MavenProject project, Log l) {
```

### JavadocDeclaration
`@param exprEvaluator` tag description is missing
in `maven-script/maven-script-ant/src/main/java/org/apache/maven/script/ant/AntPropertyHelper.java`
#### Snippet
```java
     * @deprecated use {@link #AntPropertyHelper(ExpressionEvaluator, Set, Log)} to resolve maven.dependency.*
     * properties
     * @param exprEvaluator
     * @param l
     */
```

### JavadocDeclaration
`@param l` tag description is missing
in `maven-script/maven-script-ant/src/main/java/org/apache/maven/script/ant/AntPropertyHelper.java`
#### Snippet
```java
     * properties
     * @param exprEvaluator
     * @param l
     */
    public AntPropertyHelper(ExpressionEvaluator exprEvaluator, Log l) {
```

### JavadocDeclaration
`@param containsXhtmlTextValues` tag description is missing
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/ExtendedMojoDescriptor.java`
#### Snippet
```java

    /**
     * @param containsXhtmlTextValues
     * @since 3.7.0
     */
```

### JavadocDeclaration
`@param externalJavadocSiteUrls` tag description is missing
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocLinkGenerator.java`
#### Snippet
```java
     * Constructor for online external sites only.
     *
     * @param externalJavadocSiteUrls
     * @param settings
     */
```

### JavadocDeclaration
`@param settings` tag description is missing
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocLinkGenerator.java`
#### Snippet
```java
     *
     * @param externalJavadocSiteUrls
     * @param settings
     */
    public JavadocLinkGenerator(List<URI> externalJavadocSiteUrls, Settings settings) {
```

### JavadocDeclaration
`@param internalJavadocSiteUrl` tag description is missing
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocLinkGenerator.java`
#### Snippet
```java
     * Constructor for both an internal (offline) and external (online) sites.
     *
     * @param internalJavadocSiteUrl
     * @param internalJavadocVersion
     * @param externalJavadocSiteUrls
```

### JavadocDeclaration
`@param internalJavadocVersion` tag description is missing
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocLinkGenerator.java`
#### Snippet
```java
     *
     * @param internalJavadocSiteUrl
     * @param internalJavadocVersion
     * @param externalJavadocSiteUrls
     * @param settings
```

### JavadocDeclaration
`@param externalJavadocSiteUrls` tag description is missing
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocLinkGenerator.java`
#### Snippet
```java
     * @param internalJavadocSiteUrl
     * @param internalJavadocVersion
     * @param externalJavadocSiteUrls
     * @param settings
     */
```

### JavadocDeclaration
`@param settings` tag description is missing
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocLinkGenerator.java`
#### Snippet
```java
     * @param internalJavadocVersion
     * @param externalJavadocSiteUrls
     * @param settings
     */
    public JavadocLinkGenerator(
```

### JavadocDeclaration
`@param javadocReference` tag description is missing
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocLinkGenerator.java`
#### Snippet
```java
     * Only uses the offline site for references returning {@code false} for
     * {@link FullyQualifiedJavadocReference#isExternal()}.
     * @param javadocReference
     * @return the (deep-) link towards a javadoc page
     * @throws IllegalArgumentException in case no javadoc link could be generated for the given reference
```

### JavadocDeclaration
`@param request` tag description is missing
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/MojoAnnotationsScanner.java`
#### Snippet
```java
     * Scan classes for mojo annotations.
     *
     * @param request
     * @return map of mojo-annotated classes keyed by full class name
     * @throws ExtractionException
```

### JavadocDeclaration
`@throws` tag description is missing
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/MojoAnnotationsScanner.java`
#### Snippet
```java
     * @param request
     * @return map of mojo-annotated classes keyed by full class name
     * @throws ExtractionException
     */
    Map<String, MojoAnnotatedClass> scan(MojoAnnotationsScannerRequest request) throws ExtractionException;
```

### JavadocDeclaration
Parameter name expected
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
     * Generates a link to a javadoc html page below the javadoc site represented by this object.
     * The link is not validated (i.e. might point to a non-existing page)
     * @param
     * @return the (deep-)link towards a javadoc page
     * @throws IllegalArgumentException if no link can be created
```

### JavadocDeclaration
`@param url` tag description is missing
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
    // CHECKSTYLE_OFF: LineLength
    /**
     * @param url
     * @param optionalMember
     * @param optionalMemberType
```

### JavadocDeclaration
`@param optionalMember` tag description is missing
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
    /**
     * @param url
     * @param optionalMember
     * @param optionalMemberType
     * @return
```

### JavadocDeclaration
`@param optionalMemberType` tag description is missing
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
     * @param url
     * @param optionalMember
     * @param optionalMemberType
     * @return
     * @throws URISyntaxException
```

### JavadocDeclaration
`@return` tag description is missing
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
     * @param optionalMember
     * @param optionalMemberType
     * @return
     * @throws URISyntaxException
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
     * @param optionalMemberType
     * @return
     * @throws URISyntaxException
     * @throws IOException
     * @see <a href=
```

### JavadocDeclaration
`@throws` tag description is missing
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
     * @return
     * @throws URISyntaxException
     * @throws IOException
     * @see <a href=
     *      "https://github.com/openjdk/jdk8u-dev/blob/f0ac31998d8396d92b4ce99aa345c05e6fd0f02a/langtools/src/share/classes/com/sun/tools/doclets/formats/html/markup/HtmlDocWriter.java#L154">
```

### JavadocDeclaration
`@param version` tag description is missing
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
     * canonical format given by member is using parentheses and comma.
     *
     * @param version
     * @param member
     * @param isConstructor
```

### JavadocDeclaration
`@param member` tag description is missing
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
     *
     * @param version
     * @param member
     * @param isConstructor
     * @return the anchor
```

### JavadocDeclaration
`@param isConstructor` tag description is missing
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
     * @param version
     * @param member
     * @param isConstructor
     * @return the anchor
     */
```

### JavadocDeclaration
`@param url` tag description is missing
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
    /**
     * Constructor for online sites having an accessible {@code package-list} or {@code element-list}.
     * @param url
     * @param settings
     * @throws IOException
```

### JavadocDeclaration
`@param settings` tag description is missing
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
     * Constructor for online sites having an accessible {@code package-list} or {@code element-list}.
     * @param url
     * @param settings
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
     * @param url
     * @param settings
     * @throws IOException
     */
    JavadocSite(final URI url, final Settings settings) throws IOException {
```

### JavadocDeclaration
`@param access` tag description is missing
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/visitors/MojoClassVisitor.java`
#### Snippet
```java
     * <a href="https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-4.html#jvms-4.3.4">JVMS 4.3.4</a>
     * and returns the type parameters.
     * @param access
     * @param signature
     * @param isField
```

### JavadocDeclaration
`@param signature` tag description is missing
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/visitors/MojoClassVisitor.java`
#### Snippet
```java
     * and returns the type parameters.
     * @param access
     * @param signature
     * @param isField
     * @return the list of type parameters (may be empty)
```

### JavadocDeclaration
`@param isField` tag description is missing
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/visitors/MojoClassVisitor.java`
#### Snippet
```java
     * @param access
     * @param signature
     * @param isField
     * @return the list of type parameters (may be empty)
     */
```

### JavadocDeclaration
`@param type` tag description is missing
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginDescriptorFilesGenerator.java`
#### Snippet
```java
    /**
     *
     * @param type
     * @param containsXhtmlValue
     * @param text
```

### JavadocDeclaration
`@param containsXhtmlValue` tag description is missing
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginDescriptorFilesGenerator.java`
#### Snippet
```java
     *
     * @param type
     * @param containsXhtmlValue
     * @param text
     * @return the normalized text value (i.e. potentially converted to XHTML)
```

### JavadocDeclaration
`@param text` tag description is missing
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginDescriptorFilesGenerator.java`
#### Snippet
```java
     * @param type
     * @param containsXhtmlValue
     * @param text
     * @return the normalized text value (i.e. potentially converted to XHTML)
     */
```

### JavadocDeclaration
`@param w` tag description is missing
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginDescriptorFilesGenerator.java`
#### Snippet
```java
    /**
     * Writes parameter type information and potentially also the related javadoc URL.
     * @param w
     * @param type
     * @param javadocLinkGenerator
```

### JavadocDeclaration
`@param type` tag description is missing
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginDescriptorFilesGenerator.java`
#### Snippet
```java
     * Writes parameter type information and potentially also the related javadoc URL.
     * @param w
     * @param type
     * @param javadocLinkGenerator
     * @param parameter
```

### JavadocDeclaration
`@param javadocLinkGenerator` tag description is missing
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginDescriptorFilesGenerator.java`
#### Snippet
```java
     * @param w
     * @param type
     * @param javadocLinkGenerator
     * @param parameter
     * @param goal
```

### JavadocDeclaration
`@param parameter` tag description is missing
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginDescriptorFilesGenerator.java`
#### Snippet
```java
     * @param type
     * @param javadocLinkGenerator
     * @param parameter
     * @param goal
     */
```

### JavadocDeclaration
`@param goal` tag description is missing
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginDescriptorFilesGenerator.java`
#### Snippet
```java
     * @param javadocLinkGenerator
     * @param parameter
     * @param goal
     */
    protected void writeParameterType(
```

### JavadocDeclaration
`@param ` tag description is missing
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/ConverterContext.java`
#### Snippet
```java
    /**
     * Stores some attribute in the current context
     * @param <T>
     * @param name
     * @param value
```

### JavadocDeclaration
`@param name` tag description is missing
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/ConverterContext.java`
#### Snippet
```java
     * Stores some attribute in the current context
     * @param <T>
     * @param name
     * @param value
     * @return the old attribute value or null.
```

### JavadocDeclaration
`@param value` tag description is missing
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/ConverterContext.java`
#### Snippet
```java
     * @param <T>
     * @param name
     * @param value
     * @return the old attribute value or null.
     */
```

### JavadocDeclaration
`@param ` tag description is missing
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/ConverterContext.java`
#### Snippet
```java
    /**
     * Retrieves some attribute value from the current context.
     * @param <T>
     * @param name
     * @param clazz
```

### JavadocDeclaration
`@param name` tag description is missing
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/ConverterContext.java`
#### Snippet
```java
     * Retrieves some attribute value from the current context.
     * @param <T>
     * @param name
     * @param clazz
     * @param defaultValue
```

### JavadocDeclaration
`@param clazz` tag description is missing
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/ConverterContext.java`
#### Snippet
```java
     * @param <T>
     * @param name
     * @param clazz
     * @param defaultValue
     * @return the value of the attribute with the given name or {@code null} if it does not exist
```

### JavadocDeclaration
`@param defaultValue` tag description is missing
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/ConverterContext.java`
#### Snippet
```java
     * @param name
     * @param clazz
     * @param defaultValue
     * @return the value of the attribute with the given name or {@code null} if it does not exist
     */
```

### JavadocDeclaration
`@param reference` tag description is missing
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/ConverterContext.java`
#### Snippet
```java
    /**
     *
     * @param reference
     * @return true in case either the current container class or any of its super classes are referenced
     */
```

### JavadocDeclaration
`@param archiveFile` tag description is missing
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/DefaultMojoAnnotationsScanner.java`
#### Snippet
```java

    /**
     * @param archiveFile
     * @param artifact
     * @param excludeMojo     for dependencies, we exclude Mojo annotations found
```

### JavadocDeclaration
`@param artifact` tag description is missing
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/DefaultMojoAnnotationsScanner.java`
#### Snippet
```java
    /**
     * @param archiveFile
     * @param artifact
     * @param excludeMojo     for dependencies, we exclude Mojo annotations found
     * @return annotated classes found
```

### JavadocDeclaration
`@throws` tag description is missing
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/DefaultMojoAnnotationsScanner.java`
#### Snippet
```java
     * @param excludeMojo     for dependencies, we exclude Mojo annotations found
     * @return annotated classes found
     * @throws IOException
     * @throws ExtractionException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/DefaultMojoAnnotationsScanner.java`
#### Snippet
```java
     * @return annotated classes found
     * @throws IOException
     * @throws ExtractionException
     */
    protected Map<String, MojoAnnotatedClass> scanArchive(File archiveFile, Artifact artifact, boolean excludeMojo)
```

### JavadocDeclaration
`@param classDirectory` tag description is missing
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/DefaultMojoAnnotationsScanner.java`
#### Snippet
```java

    /**
     * @param classDirectory
     * @param includePatterns
     * @param artifact
```

### JavadocDeclaration
`@param includePatterns` tag description is missing
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/DefaultMojoAnnotationsScanner.java`
#### Snippet
```java
    /**
     * @param classDirectory
     * @param includePatterns
     * @param artifact
     * @param excludeMojo     for dependencies, we exclude Mojo annotations found
```

### JavadocDeclaration
`@param artifact` tag description is missing
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/DefaultMojoAnnotationsScanner.java`
#### Snippet
```java
     * @param classDirectory
     * @param includePatterns
     * @param artifact
     * @param excludeMojo     for dependencies, we exclude Mojo annotations found
     * @return annotated classes found
```

### JavadocDeclaration
`@throws` tag description is missing
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/DefaultMojoAnnotationsScanner.java`
#### Snippet
```java
     * @param excludeMojo     for dependencies, we exclude Mojo annotations found
     * @return annotated classes found
     * @throws IOException
     * @throws ExtractionException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/DefaultMojoAnnotationsScanner.java`
#### Snippet
```java
     * @return annotated classes found
     * @throws IOException
     * @throws ExtractionException
     */
    protected Map<String, MojoAnnotatedClass> scanDirectory(
```

### JavadocDeclaration
`@param text` tag description is missing
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavadocInlineTagsToXhtmlConverter.java`
#### Snippet
```java
    /**
     * Converts the given text containing arbitrarily many inline javadoc tags with their according HTML replacement.
     * @param text
     * @param context
     * @return
```

### JavadocDeclaration
`@param context` tag description is missing
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavadocInlineTagsToXhtmlConverter.java`
#### Snippet
```java
     * Converts the given text containing arbitrarily many inline javadoc tags with their according HTML replacement.
     * @param text
     * @param context
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavadocInlineTagsToXhtmlConverter.java`
#### Snippet
```java
     * @param text
     * @param context
     * @return
     */
    public String convert(String text, ConverterContext context) {
```

### JavadocDeclaration
`@param label` tag description is missing
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/tag/inline/LinkTagToHtmlConverter.java`
#### Snippet
```java
     * Encloses the given label in {@code code} HTML tags.
     *
     * @param label
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/tag/inline/LinkTagToHtmlConverter.java`
#### Snippet
```java
     *
     * @param label
     * @return
     */
    static String decorateLinkLabel(String label) {
```

### JavadocDeclaration
`@param reference` tag description is missing
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavaClassConverterContext.java`
#### Snippet
```java

    /**
     * @param reference
     * @return true in case either the current context class or any of its super classes are referenced
     */
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `packagingTypes` may be 'final'
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/AbstractGeneratorMojo.java`
#### Snippet
```java
     */
    @Parameter
    private List<String> packagingTypes = Collections.singletonList("maven-plugin");

    /**
```

### FieldMayBeFinal
Field `mojo` may be 'final'
in `maven-script/maven-script-beanshell/src/main/java/org/apache/maven/script/beanshell/BeanshellMojoAdapter.java`
#### Snippet
```java
@Deprecated
public class BeanshellMojoAdapter extends AbstractMojo implements BshComponent {
    private Mojo mojo;

    private Interpreter interpreter;
```

### FieldMayBeFinal
Field `interpreter` may be 'final'
in `maven-script/maven-script-beanshell/src/main/java/org/apache/maven/script/beanshell/BeanshellMojoAdapter.java`
#### Snippet
```java
    private Mojo mojo;

    private Interpreter interpreter;

    public BeanshellMojoAdapter(Mojo mojo, Interpreter interpreter) {
```

### FieldMayBeFinal
Field `artifactMap` may be 'final'
in `maven-script/maven-script-ant/src/main/java/org/apache/maven/script/ant/AntPropertyHelper.java`
#### Snippet
```java
    private ExpressionEvaluator exprEvaluator;
    private MavenProject mavenProject;
    private Map<String, String> artifactMap = new HashMap<String, String>();

    /**
```

### FieldMayBeFinal
Field `mavenProject` may be 'final'
in `maven-script/maven-script-ant/src/main/java/org/apache/maven/script/ant/AntPropertyHelper.java`
#### Snippet
```java
    private Log log;
    private ExpressionEvaluator exprEvaluator;
    private MavenProject mavenProject;
    private Map<String, String> artifactMap = new HashMap<String, String>();

```

### FieldMayBeFinal
Field `log` may be 'final'
in `maven-script/maven-script-ant/src/main/java/org/apache/maven/script/ant/AntPropertyHelper.java`
#### Snippet
```java
public class AntPropertyHelper extends PropertyHelper {
    private static final String DEPENDENCY_PREFIX = "maven.dependency.";
    private Log log;
    private ExpressionEvaluator exprEvaluator;
    private MavenProject mavenProject;
```

### FieldMayBeFinal
Field `expectedProvidedScopeGroupIds` may be 'final'
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/DescriptorGeneratorMojo.java`
#### Snippet
```java
     */
    @Parameter
    private List<String> expectedProvidedScopeGroupIds = Collections.singletonList("org.apache.maven");

    /**
```

### FieldMayBeFinal
Field `checkExpectedProvidedScope` may be 'final'
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/DescriptorGeneratorMojo.java`
#### Snippet
```java
     */
    @Parameter(defaultValue = "true", property = "maven.plugin.checkExpectedProvidedScope")
    private boolean checkExpectedProvidedScope = true;

    /**
```

### FieldMayBeFinal
Field `expectedProvidedScopeExclusions` may be 'final'
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/DescriptorGeneratorMojo.java`
#### Snippet
```java
     */
    @Parameter
    private List<String> expectedProvidedScopeExclusions = Arrays.asList(
            "org.apache.maven:maven-archiver", "org.apache.maven:maven-jxr", "org.apache.maven:plexus-utils");

```

### FieldMayBeFinal
Field `mojoDependencies` may be 'final'
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/DescriptorGeneratorMojo.java`
#### Snippet
```java
     */
    @Parameter
    private List<String> mojoDependencies = null;

    /**
```

### FieldMayBeFinal
Field `unconstructedParts` may be 'final'
in `maven-script/maven-script-ant/src/main/java/org/apache/maven/script/ant/AntMojoWrapper.java`
#### Snippet
```java
    private Logger logger;

    private transient List<String> unconstructedParts = new ArrayList<>();

    public AntMojoWrapper(AntScriptInvoker scriptInvoker) {
```

### FieldMayBeFinal
Field `requirementsHistories` may be 'final'
in `maven-plugin-report-plugin/src/main/java/org/apache/maven/plugin/plugin/report/PluginReport.java`
#### Snippet
```java
     */
    @Parameter
    private List<RequirementsHistory> requirementsHistories = new ArrayList<>();

    @Component
```

### FieldMayBeFinal
Field `requirementsHistories` may be 'final'
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/report_old/PluginReport.java`
#### Snippet
```java
     */
    @Parameter
    private List<RequirementsHistory> requirementsHistories = new ArrayList<>();

    /**
```

### FieldMayBeFinal
Field `accum` may be 'final'
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/HtmlToPlainTextConverter.java`
#### Snippet
```java
    // the formatting rules, implemented in a breadth-first DOM traverse
    private static class FormattingVisitor implements NodeVisitor {
        private StringBuilder accum = new StringBuilder(); // holds the accumulated text

        // hit when the node is first seen
```

### FieldMayBeFinal
Field `annotationClassName` may be 'final'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/visitors/MojoAnnotationVisitor.java`
#### Snippet
```java
 */
public class MojoAnnotationVisitor extends AnnotationVisitor {
    private String annotationClassName;

    private Map<String, Object> annotationValues = new HashMap<>();
```

### FieldMayBeFinal
Field `annotationValues` may be 'final'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/visitors/MojoAnnotationVisitor.java`
#### Snippet
```java
    private String annotationClassName;

    private Map<String, Object> annotationValues = new HashMap<>();

    MojoAnnotationVisitor(String annotationClassName) {
```

### FieldMayBeFinal
Field `annotationVisitorMap` may be 'final'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/visitors/MojoFieldVisitor.java`
#### Snippet
```java
    private String fieldName;

    private Map<String, MojoAnnotationVisitor> annotationVisitorMap = new HashMap<>();

    private String className;
```

### FieldMayBeFinal
Field `fieldName` may be 'final'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/visitors/MojoFieldVisitor.java`
#### Snippet
```java
 */
public class MojoFieldVisitor extends FieldVisitor implements MojoParameterVisitor {
    private String fieldName;

    private Map<String, MojoAnnotationVisitor> annotationVisitorMap = new HashMap<>();
```

### FieldMayBeFinal
Field `className` may be 'final'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/visitors/MojoFieldVisitor.java`
#### Snippet
```java
    private Map<String, MojoAnnotationVisitor> annotationVisitorMap = new HashMap<>();

    private String className;

    private final List<String> typeParameters;
```

### FieldMayBeFinal
Field `annotationVisitorMap` may be 'final'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/visitors/MojoMethodVisitor.java`
#### Snippet
```java
    private final String fieldName;
    private final List<String> typeParameters;
    private Map<String, MojoAnnotationVisitor> annotationVisitorMap = new HashMap<>();

    public MojoMethodVisitor(String fieldName, String className, List<String> typeParameters) {
```

### FieldMayBeFinal
Field `fieldVisitors` may be 'final'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/visitors/MojoClassVisitor.java`
#### Snippet
```java
    private Map<String, MojoAnnotationVisitor> annotationVisitorMap = new HashMap<>();

    private List<MojoFieldVisitor> fieldVisitors = new ArrayList<>();

    private List<MojoMethodVisitor> methodVisitors = new ArrayList<>();
```

### FieldMayBeFinal
Field `annotationVisitorMap` may be 'final'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/visitors/MojoClassVisitor.java`
#### Snippet
```java
    private MojoAnnotatedClass mojoAnnotatedClass;

    private Map<String, MojoAnnotationVisitor> annotationVisitorMap = new HashMap<>();

    private List<MojoFieldVisitor> fieldVisitors = new ArrayList<>();
```

### FieldMayBeFinal
Field `methodVisitors` may be 'final'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/visitors/MojoClassVisitor.java`
#### Snippet
```java
    private List<MojoFieldVisitor> fieldVisitors = new ArrayList<>();

    private List<MojoMethodVisitor> methodVisitors = new ArrayList<>();

    private int version;
```

### FieldMayBeFinal
Field `reflector` may be 'final'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/DefaultMojoAnnotationsScanner.java`
#### Snippet
```java
    private static final String EMPTY = "";

    private Reflector reflector = new Reflector();

    @Override
```

### FieldMayBeFinal
Field `numbering` may be 'final'
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java
         * <code>null</code> element denotes an unordered list.
         */
        private Stack<Counter> numbering = new Stack<>();

        /**
```

### FieldMayBeFinal
Field `annotationOnMethod` may be 'final'
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/datamodel/ParameterAnnotationContent.java`
#### Snippet
```java
    private String className;

    private boolean annotationOnMethod;

    private final List<String> typeParameters;
```

## RuleId[id=ExtendsAnnotation]
### ExtendsAnnotation
Class 'ExecuteAnnotationContent' implements annotation interface `Execute`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/datamodel/ExecuteAnnotationContent.java`
#### Snippet
```java
 * @since 3.0
 */
public class ExecuteAnnotationContent implements Execute {
    private String goal;

```

### ExtendsAnnotation
Class 'ComponentAnnotationContent' implements annotation interface `Component`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/datamodel/ComponentAnnotationContent.java`
#### Snippet
```java
 * @since 3.0
 */
public class ComponentAnnotationContent extends AnnotatedField implements Component {
    private String roleClassName;

```

### ExtendsAnnotation
Class 'MojoAnnotationContent' implements annotation interface `Mojo`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/datamodel/MojoAnnotationContent.java`
#### Snippet
```java
 * @since 3.0
 */
public class MojoAnnotationContent extends AnnotatedContent implements Mojo {
    private String name;

```

### ExtendsAnnotation
Class 'ParameterAnnotationContent' implements annotation interface `Parameter`
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/datamodel/ParameterAnnotationContent.java`
#### Snippet
```java
 * @since 3.0
 */
public class ParameterAnnotationContent extends AnnotatedField implements Parameter {

    private String name;
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
    }

    boolean findAnchor(URI uri, String anchorNameOrId) throws MalformedURLException, IOException {
        return findLineContaining(uri, settings, getAnchorPattern(anchorNameOrId));
    }
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/scanner/MojoAnnotationsScannerRequest.java`
#### Snippet
```java
    private Set<Artifact> dependencies = new HashSet<>();

    private List<String> includePatterns = Arrays.asList("**/*.class");

    private List<File> sourceDirectories = new ArrayList<>();
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java

        // Some server reject requests that do not have an Accept header
        builder.setDefaultHeaders(Arrays.asList(new BasicHeader(HttpHeaders.ACCEPT, "*/*")));

        if (settings != null && settings.getActiveProxy() != null) {
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/JavaAnnotationsMojoDescriptorExtractor.java`
#### Snippet
```java

        File output = new File(request.getProject().getBuild().getOutputDirectory());
        mojoAnnotationsScannerRequest.setClassesDirectories(Arrays.asList(output));

        mojoAnnotationsScannerRequest.setDependencies(request.getDependencies());
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/JavaAnnotationsMojoDescriptorExtractor.java`
#### Snippet
```java
                unArchiver.extract();

                extendJavaProjectBuilder(builder, Arrays.asList(extractDirectory), request.getDependencies());
            } else if (sourcesArtifact.getFile().isDirectory()) {
                extendJavaProjectBuilder(builder, Arrays.asList(sourcesArtifact.getFile()), request.getDependencies());
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `relativePath` initializer `null` is redundant
in `maven-script/maven-plugin-tools-beanshell/src/main/java/org/apache/maven/tools/plugin/extractor/beanshell/BeanshellMojoDescriptorExtractor.java`
#### Snippet
```java

            for (File scriptFile : metadataFiles) {
                String relativePath = null;

                if (basedir.endsWith("/")) {
```

### UnusedAssignment
Variable `reader` initializer `null` is redundant
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java

    static BufferedReader getReader(URL url, Settings settings) throws IOException {
        BufferedReader reader = null;

        if ("file".equals(url.getProtocol())) {
```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/EnhancedParameterWrapper.java`
#### Snippet
```java
    }

    public boolean equals(Object other) {
        return delegate.equals(other);
    }
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `maven != null` is always `true`
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/report_old/PluginReport.java`
#### Snippet
```java
            tableCell(getBundle(locale).getString("report.plugin.systemrequirements.maven"));
            tableCell(
                    (maven != null
                            ? maven
                            : getBundle(locale).getString("report.plugin.systemrequirements.nominimum")));
```

### ConstantValue
Condition `jdk != null` is always `true`
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/report_old/PluginReport.java`
#### Snippet
```java
            sink.tableRow();
            tableCell(getBundle(locale).getString("report.plugin.systemrequirements.jdk"));
            tableCell((jdk != null ? jdk : getBundle(locale).getString("report.plugin.systemrequirements.nominimum")));
            sink.tableRow_();

```

### ConstantValue
Condition `httpMethod != null` is always `true`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
                    super.close();

                    if (httpMethod != null) {
                        httpMethod.releaseConnection();
                    }
```

### ConstantValue
Condition `httpClient != null` is always `true`
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
                        httpMethod.releaseConnection();
                    }
                    if (httpClient != null) {
                        httpClient.close();
                    }
```

### ConstantValue
Value `v4Api` is always 'true'
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginDescriptorFilesGenerator.java`
#### Snippet
```java
            boolean v4Api = extendedMojoDescriptor.isV4Api();
            if (v4Api) {
                GeneratorUtils.element(w, "v4Api", String.valueOf(v4Api));
            }
        }
```

### ConstantValue
Condition `type != DescriptorType.LIMITED_FOR_HELP_MOJO` is always `false`
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginDescriptorFilesGenerator.java`
#### Snippet
```java
            w.endElement();

            if (type != DescriptorType.LIMITED_FOR_HELP_MOJO) {
                GeneratorUtils.writeDependencies(w, pluginDescriptor);
            }
```

### ConstantValue
Value `addedUl` is always 'true'
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginXdocGenerator.java`
#### Snippet
```java
            addedUl = true;
        }
        return addedUl;
    }

```

### ConstantValue
Value `addedUl` is always 'false'
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginXdocGenerator.java`
#### Snippet
```java

            boolean addedUl = false;
            addedUl = addUl(w, addedUl, parameter.getType());
            String typeValue = getLinkedType(parameter, false);
            writeDetail(getString("pluginxdoc.mojodescriptor.parameter.type"), typeValue, w);
```

### ConstantValue
Value `addedUl` is always 'false'
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/PluginXdocGenerator.java`
#### Snippet
```java
        String value;
        if (mojoDescriptor.isProjectRequired()) {
            addedUl = addUl(w, addedUl);
            w.startElement("li");
            w.writeMarkup(getString("pluginxdoc.mojodescriptor.projectRequired"));
```

### ConstantValue
Value `pendingNewline` is always 'false'
in `maven-plugin-tools-generators/src/main/java/org/apache/maven/tools/plugin/generator/GeneratorUtils.java`
#### Snippet
```java
                        && numbering.isEmpty()) {
                    pendingNewline = false;
                    newline(pendingNewline);
                } else {
                    newline(true);
```

### ConstantValue
Condition `indexOfOpeningParenthesis >= 0 && indexOfOpeningParenthesis == -1` is always `false` when reached
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavaClassConverterContext.java`
#### Snippet
```java
            signatureArguments = member.substring(indexOfOpeningParenthesis + 1, indexOfClosingParenthesis);
        } else if (indexOfOpeningParenthesis == -1 && indexOfClosingParenthesis >= 0
                || indexOfOpeningParenthesis >= 0 && indexOfOpeningParenthesis == -1) {
            throw new IllegalArgumentException("Found opening without closing parentheses or vice versa in " + member);
        } else {
```

### ConstantValue
Condition `indexOfOpeningParenthesis == -1` is always `false` when reached
in `maven-plugin-tools-annotations/src/main/java/org/apache/maven/tools/plugin/extractor/annotations/converter/JavaClassConverterContext.java`
#### Snippet
```java
            signatureArguments = member.substring(indexOfOpeningParenthesis + 1, indexOfClosingParenthesis);
        } else if (indexOfOpeningParenthesis == -1 && indexOfClosingParenthesis >= 0
                || indexOfOpeningParenthesis >= 0 && indexOfOpeningParenthesis == -1) {
            throw new IllegalArgumentException("Found opening without closing parentheses or vice versa in " + member);
        } else {
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `maven-plugin-report-plugin/src/main/java/org/apache/maven/plugin/plugin/report/PluginReport.java`
#### Snippet
```java
            sb.append("  ...").append('\n');
            sb.append("  <build>").append('\n');
            sb.append("    <!-- " + getBundle(locale).getString("report.plugin.usage.pluginManagement") + " -->")
                    .append('\n');
            sb.append("    <pluginManagement>").append('\n');
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `maven-plugin-report-plugin/src/main/java/org/apache/maven/plugin/plugin/report/PluginReport.java`
#### Snippet
```java
            sb.append("      </plugins>").append('\n');
            sb.append("    </pluginManagement>").append('\n');
            sb.append("    <!-- " + getBundle(locale).getString("report.plugin.usage.plugins") + " -->")
                    .append('\n');
            sb.append("    <plugins>").append('\n');
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `maven-plugin-report-plugin/src/main/java/org/apache/maven/plugin/plugin/report/PluginReport.java`
#### Snippet
```java
            if (hasMavenReport) {
                sb.append("  ...").append('\n');
                sb.append("  <!-- " + getBundle(locale).getString("report.plugin.usage.reporting") + " -->")
                        .append('\n');
                sb.append("  <reporting>").append('\n');
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/report_old/PluginReport.java`
#### Snippet
```java
            sb.append("  ...").append('\n');
            sb.append("  <build>").append('\n');
            sb.append("    <!-- " + getBundle(locale).getString("report.plugin.usage.pluginManagement") + " -->")
                    .append('\n');
            sb.append("    <pluginManagement>").append('\n');
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/report_old/PluginReport.java`
#### Snippet
```java
            sb.append("      </plugins>").append('\n');
            sb.append("    </pluginManagement>").append('\n');
            sb.append("    <!-- " + getBundle(locale).getString("report.plugin.usage.plugins") + " -->")
                    .append('\n');
            sb.append("    <plugins>").append('\n');
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `maven-plugin-plugin/src/main/java/org/apache/maven/plugin/plugin/report_old/PluginReport.java`
#### Snippet
```java
            if (hasMavenReport) {
                sb.append("  ...").append('\n');
                sb.append("  <!-- " + getBundle(locale).getString("report.plugin.usage.reporting") + " -->")
                        .append('\n');
                sb.append("  <reporting>").append('\n');
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `maven-plugin-tools-api/src/main/java/org/apache/maven/tools/plugin/javadoc/JavadocSite.java`
#### Snippet
```java
        StringBuilder link = new StringBuilder();
        if (moduleName.isPresent()) {
            link.append(moduleName.get() + "/");
        }
        if (packageName.isPresent()) {
```

