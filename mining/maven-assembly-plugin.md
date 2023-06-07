# maven-assembly-plugin 
 
# Bad smells
I found 92 bad smells with 8 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SpringHandlersSchemasHighlighting | 18 | false |
| UNCHECKED_WARNING | 9 | false |
| IOStreamConstructor | 9 | false |
| JavadocReference | 8 | false |
| FieldMayBeFinal | 8 | false |
| CdiInjectionPointsInspection | 7 | false |
| JavadocDeclaration | 4 | false |
| RedundantCast | 3 | false |
| UnnecessaryLocalVariable | 3 | true |
| UnnecessaryToStringCall | 3 | true |
| FieldCanBeLocal | 3 | false |
| DataFlowIssue | 2 | false |
| UnnecessaryStringEscape | 2 | true |
| WebProperties | 2 | false |
| UnusedAssignment | 2 | false |
| RedundantLengthCheck | 1 | false |
| CommentedOutCode | 1 | false |
| JavaReflectionInvocation | 1 | false |
| DuplicatedCode | 1 | false |
| Deprecation | 1 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 1 | false |
| TrivialStringConcatenation | 1 | false |
| ArraysAsListWithZeroOrOneArgument | 1 | false |
| RedundantTypeArguments | 1 | false |
## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashSet' to 'java.util.Set'
in `src/main/java/org/apache/maven/plugins/assembly/utils/ProjectUtils.java`
#### Snippet
```java
        final Set<MavenProject> singleParentSet = Collections.singleton(project);

        final Set<MavenProject> moduleCandidates = new LinkedHashSet<>(reactorProjects);

        final Set<MavenProject> modules = new LinkedHashSet<>();
```

### UNCHECKED_WARNING
Unchecked call to 'LinkedHashSet(Collection)' as a member of raw type 'java.util.LinkedHashSet'
in `src/main/java/org/apache/maven/plugins/assembly/utils/ProjectUtils.java`
#### Snippet
```java
        final Set<MavenProject> singleParentSet = Collections.singleton(project);

        final Set<MavenProject> moduleCandidates = new LinkedHashSet<>(reactorProjects);

        final Set<MavenProject> modules = new LinkedHashSet<>();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashSet' to 'java.util.Set'
in `src/main/java/org/apache/maven/plugins/assembly/utils/ProjectUtils.java`
#### Snippet
```java
                Set<MavenProject> currentPotentialParents;
                if (includeSubModules) {
                    currentPotentialParents = new LinkedHashSet<>(modules);
                } else {
                    currentPotentialParents = singleParentSet;
```

### UNCHECKED_WARNING
Unchecked call to 'LinkedHashSet(Collection)' as a member of raw type 'java.util.LinkedHashSet'
in `src/main/java/org/apache/maven/plugins/assembly/utils/ProjectUtils.java`
#### Snippet
```java
                Set<MavenProject> currentPotentialParents;
                if (includeSubModules) {
                    currentPotentialParents = new LinkedHashSet<>(modules);
                } else {
                    currentPotentialParents = singleParentSet;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `src/main/java/org/apache/maven/plugins/assembly/archive/task/AddFileSetsTask.java`
#### Snippet
```java
                    configSource,
                    fileSet.isFiltered(),
                    new HashSet<>(fileSet.getNonFilteredFileExtensions()),
                    fileSet.getLineEnding());
            if (fileSetTransformers == null) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/org/apache/maven/plugins/assembly/archive/phase/FileItemAssemblyPhase.java`
#### Snippet
```java
                if (!fileItem.getSources().isEmpty()) {
                    List<InputStream> content =
                            new ArrayList<>(fileItem.getSources().size());
                    for (String contentSourcePath : fileItem.getSources()) {
                        File contentSource = new File(contentSourcePath);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `src/main/java/org/apache/maven/plugins/assembly/archive/task/AddDependencySetsTask.java`
#### Snippet
```java
                        configSource,
                        unpackOptions.isFiltered(),
                        new HashSet<>(unpackOptions.getNonFilteredFileExtensions()),
                        unpackOptions.getLineEnding())
                : null;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashSet' to 'java.util.Set'
in `src/main/java/org/apache/maven/plugins/assembly/archive/phase/ModuleSetAssemblyPhase.java`
#### Snippet
```java
        if (moduleSet.isUseAllReactorProjects()) {
            if (!moduleSet.isIncludeSubModules()) {
                moduleProjects = new LinkedHashSet<>(configSource.getReactorProjects());
            }

```

### UNCHECKED_WARNING
Unchecked call to 'LinkedHashSet(Collection)' as a member of raw type 'java.util.LinkedHashSet'
in `src/main/java/org/apache/maven/plugins/assembly/archive/phase/ModuleSetAssemblyPhase.java`
#### Snippet
```java
        if (moduleSet.isUseAllReactorProjects()) {
            if (!moduleSet.isIncludeSubModules()) {
                moduleProjects = new LinkedHashSet<>(configSource.getReactorProjects());
            }

```

## RuleId[id=RedundantLengthCheck]
### RedundantLengthCheck
Redundant array length check
in `src/main/java/org/apache/maven/plugins/assembly/utils/FilterUtils.java`
#### Snippet
```java
        final AndArtifactFilter filter = new AndArtifactFilter();

        if (additionalFilters != null && additionalFilters.length > 0) {
            for (final ArtifactFilter additionalFilter : additionalFilters) {
                if (additionalFilter != null) {
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `org.codehaus.plexus.archiver.Archiver`
in `src/main/java/org/apache/maven/plugins/assembly/archive/AssemblyArchiver.java`
#### Snippet
```java
     * <li>Calculate the output directory/file for the assembly</li>
     * <li>Setup any handler components for special descriptor files we may encounter</li>
     * <li>Lookup and configure the {@link org.codehaus.plexus.archiver.Archiver} to be used</li>
     * <li>Determine what, if any, dependency resolution will be required, and resolve any dependency-version conflicts
     * up front to produce a managed-version map for the whole assembly process.</li>
```

### JavadocReference
Cannot resolve symbol `Assembly`
in `src/main/java/org/apache/maven/plugins/assembly/archive/AssemblyArchiver.java`
#### Snippet
```java
     * </ol>
     *
     * @param assembly              The {@link Assembly}
     * @param fullName              The full name.
     * @param format                The format.
```

### JavadocReference
Cannot resolve symbol `PlexusIoResourceCollection`
in `src/main/java/org/apache/maven/plugins/assembly/internal/SarPlexusIoResourceCollection.java`
#### Snippet
```java

/**
 * Provider for "sar" {@link PlexusIoResourceCollection}.
 */
@Singleton
```

### JavadocReference
Cannot resolve symbol `UnArchiver`
in `src/main/java/org/apache/maven/plugins/assembly/internal/SarUnArchiverProvider.java`
#### Snippet
```java

/**
 * Provider for "sar" {@link UnArchiver}.
 */
@Singleton
```

### JavadocReference
Cannot resolve symbol `org.apache.maven.plugin.DebugConfigurationListener`
in `src/main/java/org/apache/maven/plugins/assembly/internal/DebugConfigurationListener.java`
#### Snippet
```java

/**
 * Copy of deprecated {@link org.apache.maven.plugin.DebugConfigurationListener} updated to Slf4j.
 */
public class DebugConfigurationListener implements ConfigurationListener {
```

### JavadocReference
Cannot resolve symbol `org.codehaus.plexus.archiver.ArchiverException`
in `src/main/java/org/apache/maven/plugins/assembly/archive/DefaultAssemblyArchiver.java`
#### Snippet
```java
     * @param mergeManifestMode     how to handle already existing Manifest files
     * @return archiver Archiver generated
     * @throws org.codehaus.plexus.archiver.ArchiverException
     * @throws org.codehaus.plexus.archiver.manager.NoSuchArchiverException
     */
```

### JavadocReference
Cannot resolve symbol `org.codehaus.plexus.archiver.manager.NoSuchArchiverException`
in `src/main/java/org/apache/maven/plugins/assembly/archive/DefaultAssemblyArchiver.java`
#### Snippet
```java
     * @return archiver Archiver generated
     * @throws org.codehaus.plexus.archiver.ArchiverException
     * @throws org.codehaus.plexus.archiver.manager.NoSuchArchiverException
     */
    protected Archiver createArchiver(
```

### JavadocReference
Cannot resolve symbol `Archiver`
in `src/main/java/org/apache/maven/plugins/assembly/archive/DefaultAssemblyArchiver.java`
#### Snippet
```java
/**
 * Controller component designed to organize the many activities involved in creating an assembly archive. This includes
 * locating and configuring {@link Archiver} instances, executing multiple {@link org.apache.maven.plugins.assembly
 * .archive.phase.AssemblyArchiverPhase} instances to
 * interpret the various sections of the assembly descriptor and determine which files to add, and other associated
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Condition `e.getCause() instanceof ComponentConfigurationException` is redundant and can be replaced with a null check
in `src/main/java/org/apache/maven/plugins/assembly/archive/DefaultAssemblyArchiver.java`
#### Snippet
```java
            throw new RuntimeException(e);
        } catch (final InvocationTargetException e) {
            if (e.getCause() instanceof ComponentConfigurationException) {
                throw (ComponentConfigurationException) e.getCause();
            }
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `src/main/java/org/apache/maven/plugins/assembly/archive/DefaultAssemblyArchiver.java`
#### Snippet
```java
            for (final ContainerDescriptorHandlerConfig config : requestedContainerDescriptorHandlers) {
                final String hint = config.getHandlerName();
                final ContainerDescriptorHandler handler = containerDescriptorHandlers.get(hint);

                if (handler == null) {
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/main/java/org/apache/maven/plugins/assembly/utils/TypeConversionUtils.java`
#### Snippet
```java
            return value;
        } catch (final NumberFormatException e) {
            throw new AssemblyFormattingException("Failed to parse mode as an octal number: \'" + mode + "\'.", e);
        }
    }
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/main/java/org/apache/maven/plugins/assembly/utils/TypeConversionUtils.java`
#### Snippet
```java
            return value;
        } catch (final NumberFormatException e) {
            throw new AssemblyFormattingException("Failed to parse mode as an octal number: \'" + mode + "\'.", e);
        }
    }
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/maven/plugins/assembly/io/DefaultAssemblyReader.java`
#### Snippet
```java
     * @param assemblyDir the assembly directory
     * @param transformer the component interpolator
     * @throws AssemblyReadException
     */
    protected void mergeComponentsWithMainAssembly(
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/maven/plugins/assembly/utils/LineEndingsUtils.java`
#### Snippet
```java
     *                   see org.apache.maven.plugin.assembly.utils.LineEndings#valueOf
     * @return The proper line ending characters
     * @throws AssemblyFormattingException
     */
    public static String getLineEndingCharacters(/* nullable */ String lineEnding) throws AssemblyFormattingException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/maven/plugins/assembly/archive/DefaultAssemblyArchiver.java`
#### Snippet
```java
     * @param mergeManifestMode     how to handle already existing Manifest files
     * @return archiver Archiver generated
     * @throws org.codehaus.plexus.archiver.ArchiverException
     * @throws org.codehaus.plexus.archiver.manager.NoSuchArchiverException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/maven/plugins/assembly/archive/DefaultAssemblyArchiver.java`
#### Snippet
```java
     * @return archiver Archiver generated
     * @throws org.codehaus.plexus.archiver.ArchiverException
     * @throws org.codehaus.plexus.archiver.manager.NoSuchArchiverException
     */
    protected Archiver createArchiver(
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `LEVEL_NAMES.get(...)` to `String` is redundant
in `src/main/java/org/apache/maven/plugins/assembly/io/MessageLevels.java`
#### Snippet
```java
    static String getLevelLabel(int messageLevel) {
        if (messageLevel > -1 && LEVEL_NAMES.size() > messageLevel) {
            return (String) LEVEL_NAMES.get(messageLevel);
        }

```

### RedundantCast
Casting `it.next()` to `LocatorStrategy` is redundant
in `src/main/java/org/apache/maven/plugins/assembly/io/Locator.java`
#### Snippet
```java

        for (Iterator<LocatorStrategy> it = strategies.iterator(); location == null && it.hasNext(); ) {
            LocatorStrategy strategy = (LocatorStrategy) it.next();

            location = strategy.resolve(locationSpecification, messageHolder);
```

### RedundantCast
Casting `it.next()` to `Message` is redundant
in `src/main/java/org/apache/maven/plugins/assembly/io/DefaultMessageHolder.java`
#### Snippet
```java
        int counter = 1;
        for (Iterator<Message> it = messages.iterator(); it.hasNext(); ) {
            Message message = (Message) it.next();

            int ml = message.getMessageLevel();
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `tempFileSuffix` may be 'final'
in `src/main/java/org/apache/maven/plugins/assembly/io/ClasspathResourceLocatorStrategy.java`
#### Snippet
```java
    private String tempFilePrefix = "location.";

    private String tempFileSuffix = ".cpurl";

    private boolean tempFileDeleteOnExit = true;
```

### FieldMayBeFinal
Field `tempFilePrefix` may be 'final'
in `src/main/java/org/apache/maven/plugins/assembly/io/ClasspathResourceLocatorStrategy.java`
#### Snippet
```java
class ClasspathResourceLocatorStrategy implements LocatorStrategy {

    private String tempFilePrefix = "location.";

    private String tempFileSuffix = ".cpurl";
```

### FieldMayBeFinal
Field `tempFileDeleteOnExit` may be 'final'
in `src/main/java/org/apache/maven/plugins/assembly/io/ClasspathResourceLocatorStrategy.java`
#### Snippet
```java
    private String tempFileSuffix = ".cpurl";

    private boolean tempFileDeleteOnExit = true;

    /**
```

### FieldMayBeFinal
Field `strategies` may be 'final'
in `src/main/java/org/apache/maven/plugins/assembly/io/Locator.java`
#### Snippet
```java
final class Locator {

    private List<LocatorStrategy> strategies;
    private final MessageHolder messageHolder;

```

### FieldMayBeFinal
Field `defaultMessageLevel` may be 'final'
in `src/main/java/org/apache/maven/plugins/assembly/io/DefaultMessageHolder.java`
#### Snippet
```java
    private Message currentMessage;

    private int defaultMessageLevel = MessageLevels.LEVEL_INFO;

    private boolean[] messageLevelStates;
```

### FieldMayBeFinal
Field `messages` may be 'final'
in `src/main/java/org/apache/maven/plugins/assembly/io/DefaultMessageHolder.java`
#### Snippet
```java
class DefaultMessageHolder implements MessageHolder {

    private List<Message> messages = new ArrayList<Message>();

    private Message currentMessage;
```

### FieldMayBeFinal
Field `message` may be 'final'
in `src/main/java/org/apache/maven/plugins/assembly/io/DefaultMessageHolder.java`
#### Snippet
```java

    private static final class Message {
        private StringBuffer message = new StringBuffer();

        private Throwable error;
```

### FieldMayBeFinal
Field `messageLevelStates` may be 'final'
in `src/main/java/org/apache/maven/plugins/assembly/io/DefaultMessageHolder.java`
#### Snippet
```java
    private int defaultMessageLevel = MessageLevels.LEVEL_INFO;

    private boolean[] messageLevelStates;

    private MessageSink onDemandSink;
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/apache/maven/plugins/assembly/utils/FilterUtils.java`
#### Snippet
```java

        // FIXME: Why is this added twice??
        // if ( additionalFilters != null && !additionalFilters.isEmpty() )
        // {
        // allFilters.addAll( additionalFilters );
```

## RuleId[id=JavaReflectionInvocation]
### JavaReflectionInvocation
Argument is not assignable to 'PlexusConfiguration'
in `src/main/java/org/apache/maven/plugins/assembly/archive/DefaultAssemblyArchiver.java`
#### Snippet
```java

            configureComponent.invoke(
                    configurator, component, configuration, expressionEvaluator, containerRealm[0], listener);
        } catch (final NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
```

## RuleId[id=WebProperties]
### WebProperties
Cannot resolve class or package 'foo'
in `src/it/projects/dependency-sets/dependencySet-projectArtifactNotIncluded/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>foobar</servlet-name>
        <servlet-class>foo.Foo</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
```

### WebProperties
Cannot resolve class 'Foo'
in `src/it/projects/dependency-sets/dependencySet-projectArtifactNotIncluded/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <servlet>
        <servlet-name>foobar</servlet-name>
        <servlet-class>foo.Foo</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/maven/plugins/assembly/archive/phase/ModuleSetAssemblyPhase.java`
#### Snippet
```java
        final int dirMode = TypeConversionUtils.modeToInt(binaries.getDirectoryMode(), LOGGER);
        if (dirMode != -1) {
            task.setDirectoryMode(dirMode);
        }

        final int fileMode = TypeConversionUtils.modeToInt(binaries.getFileMode(), LOGGER);
        if (fileMode != -1) {
            task.setFileMode(fileMode);
        }
```

## RuleId[id=SpringHandlersSchemasHighlighting]
### SpringHandlersSchemasHighlighting
Cannot resolve directory 'org'
in `src/it/projects/container-descriptors/metaInf-spring-aggregation/child1/src/main/resources/META-INF/spring.schemas`
#### Snippet
```java
http\://www.springframework.org/schema/aop/spring-aop-2.0.xsd=org/springframework/aop/config/spring-aop-3.0.xsd

```

### SpringHandlersSchemasHighlighting
Cannot resolve directory 'springframework'
in `src/it/projects/container-descriptors/metaInf-spring-aggregation/child1/src/main/resources/META-INF/spring.schemas`
#### Snippet
```java
http\://www.springframework.org/schema/aop/spring-aop-2.0.xsd=org/springframework/aop/config/spring-aop-3.0.xsd

```

### SpringHandlersSchemasHighlighting
Cannot resolve directory 'aop'
in `src/it/projects/container-descriptors/metaInf-spring-aggregation/child1/src/main/resources/META-INF/spring.schemas`
#### Snippet
```java
http\://www.springframework.org/schema/aop/spring-aop-2.0.xsd=org/springframework/aop/config/spring-aop-3.0.xsd

```

### SpringHandlersSchemasHighlighting
Cannot resolve directory 'config'
in `src/it/projects/container-descriptors/metaInf-spring-aggregation/child1/src/main/resources/META-INF/spring.schemas`
#### Snippet
```java
http\://www.springframework.org/schema/aop/spring-aop-2.0.xsd=org/springframework/aop/config/spring-aop-3.0.xsd

```

### SpringHandlersSchemasHighlighting
Cannot resolve file 'spring-aop-3.0.xsd'
in `src/it/projects/container-descriptors/metaInf-spring-aggregation/child1/src/main/resources/META-INF/spring.schemas`
#### Snippet
```java
http\://www.springframework.org/schema/aop/spring-aop-2.0.xsd=org/springframework/aop/config/spring-aop-3.0.xsd

```

### SpringHandlersSchemasHighlighting
Cannot resolve directory 'org'
in `src/it/projects/container-descriptors/metaInf-spring-aggregation/child2/src/main/resources/META-INF/spring.schemas`
#### Snippet
```java
http\://www.springframework.org/schema/aop/spring-aop-2.0.xsd=org/springframework/aop/config/spring-aop-4.0.xsd

```

### SpringHandlersSchemasHighlighting
Cannot resolve directory 'springframework'
in `src/it/projects/container-descriptors/metaInf-spring-aggregation/child2/src/main/resources/META-INF/spring.schemas`
#### Snippet
```java
http\://www.springframework.org/schema/aop/spring-aop-2.0.xsd=org/springframework/aop/config/spring-aop-4.0.xsd

```

### SpringHandlersSchemasHighlighting
Cannot resolve directory 'aop'
in `src/it/projects/container-descriptors/metaInf-spring-aggregation/child2/src/main/resources/META-INF/spring.schemas`
#### Snippet
```java
http\://www.springframework.org/schema/aop/spring-aop-2.0.xsd=org/springframework/aop/config/spring-aop-4.0.xsd

```

### SpringHandlersSchemasHighlighting
Cannot resolve directory 'config'
in `src/it/projects/container-descriptors/metaInf-spring-aggregation/child2/src/main/resources/META-INF/spring.schemas`
#### Snippet
```java
http\://www.springframework.org/schema/aop/spring-aop-2.0.xsd=org/springframework/aop/config/spring-aop-4.0.xsd

```

### SpringHandlersSchemasHighlighting
Cannot resolve file 'spring-aop-4.0.xsd'
in `src/it/projects/container-descriptors/metaInf-spring-aggregation/child2/src/main/resources/META-INF/spring.schemas`
#### Snippet
```java
http\://www.springframework.org/schema/aop/spring-aop-2.0.xsd=org/springframework/aop/config/spring-aop-4.0.xsd

```

### SpringHandlersSchemasHighlighting
Cannot resolve class or package 'springframework'
in `src/it/projects/container-descriptors/metaInf-spring-aggregation/child2/src/main/resources/META-INF/spring.handlers`
#### Snippet
```java
http\://www.springframework.org/schema/context=org.springframework.context.config.ContextNamespaceHandler1

```

### SpringHandlersSchemasHighlighting
Cannot resolve class or package 'context'
in `src/it/projects/container-descriptors/metaInf-spring-aggregation/child2/src/main/resources/META-INF/spring.handlers`
#### Snippet
```java
http\://www.springframework.org/schema/context=org.springframework.context.config.ContextNamespaceHandler1

```

### SpringHandlersSchemasHighlighting
Cannot resolve class or package 'config'
in `src/it/projects/container-descriptors/metaInf-spring-aggregation/child2/src/main/resources/META-INF/spring.handlers`
#### Snippet
```java
http\://www.springframework.org/schema/context=org.springframework.context.config.ContextNamespaceHandler1

```

### SpringHandlersSchemasHighlighting
Cannot resolve class or package 'springframework'
in `src/it/projects/container-descriptors/metaInf-spring-aggregation/child1/src/main/resources/META-INF/spring.handlers`
#### Snippet
```java
http\://www.springframework.org/schema/aop=org.springframework.aop.config.AopNamespaceHandler1

```

### SpringHandlersSchemasHighlighting
Cannot resolve class 'ContextNamespaceHandler1'
in `src/it/projects/container-descriptors/metaInf-spring-aggregation/child2/src/main/resources/META-INF/spring.handlers`
#### Snippet
```java
http\://www.springframework.org/schema/context=org.springframework.context.config.ContextNamespaceHandler1

```

### SpringHandlersSchemasHighlighting
Cannot resolve class or package 'aop'
in `src/it/projects/container-descriptors/metaInf-spring-aggregation/child1/src/main/resources/META-INF/spring.handlers`
#### Snippet
```java
http\://www.springframework.org/schema/aop=org.springframework.aop.config.AopNamespaceHandler1

```

### SpringHandlersSchemasHighlighting
Cannot resolve class or package 'config'
in `src/it/projects/container-descriptors/metaInf-spring-aggregation/child1/src/main/resources/META-INF/spring.handlers`
#### Snippet
```java
http\://www.springframework.org/schema/aop=org.springframework.aop.config.AopNamespaceHandler1

```

### SpringHandlersSchemasHighlighting
Cannot resolve class 'AopNamespaceHandler1'
in `src/it/projects/container-descriptors/metaInf-spring-aggregation/child1/src/main/resources/META-INF/spring.handlers`
#### Snippet
```java
http\://www.springframework.org/schema/aop=org.springframework.aop.config.AopNamespaceHandler1

```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/org/apache/maven/plugins/assembly/utils/LineEndingsUtils.java`
#### Snippet
```java
        if (encoding == null) {
            // platform encoding
            return new BufferedReader(new InputStreamReader(new FileInputStream(source)));
        } else {
            // MASSEMBLY-371
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/org/apache/maven/plugins/assembly/utils/LineEndingsUtils.java`
#### Snippet
```java
        } else {
            // MASSEMBLY-371
            return new BufferedReader(new InputStreamReader(new FileInputStream(source), encoding));
        }
    }
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `src/main/java/org/apache/maven/plugins/assembly/utils/LineEndingsUtils.java`
#### Snippet
```java
        if (encoding == null) {
            // platform encoding
            return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dest)));
        } else {
            // MASSEMBLY-371
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `src/main/java/org/apache/maven/plugins/assembly/utils/LineEndingsUtils.java`
#### Snippet
```java
        } else {
            // MASSEMBLY-371
            return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dest), encoding));
        }
    }
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `src/main/java/org/apache/maven/plugins/assembly/filter/SimpleAggregatingDescriptorHandler.java`
#### Snippet
```java
        Writer writer;
        writer = AssemblyFileUtils.isPropertyFile(f)
                ? new OutputStreamWriter(new FileOutputStream(f), StandardCharsets.ISO_8859_1)
                : new OutputStreamWriter(new FileOutputStream(f)); // Still platform encoding
        return writer;
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `src/main/java/org/apache/maven/plugins/assembly/filter/SimpleAggregatingDescriptorHandler.java`
#### Snippet
```java
        writer = AssemblyFileUtils.isPropertyFile(f)
                ? new OutputStreamWriter(new FileOutputStream(f), StandardCharsets.ISO_8859_1)
                : new OutputStreamWriter(new FileOutputStream(f)); // Still platform encoding
        return writer;
    }
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `src/main/java/org/apache/maven/plugins/assembly/filter/AbstractLineAggregatingHandler.java`
#### Snippet
```java

                try (PrintWriter writer =
                        new PrintWriter(new OutputStreamWriter(new FileOutputStream(f), getEncoding()))) {
                    for (final String line : entry.getValue()) {
                        writer.println(line);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/org/apache/maven/plugins/assembly/archive/phase/FileItemAssemblyPhase.java`
#### Snippet
```java
                            contentSource = new File(basedir, contentSourcePath);
                        }
                        content.add(new FileInputStream(contentSource));
                    }

```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/org/apache/maven/plugins/assembly/archive/archiver/AssemblyProxyArchiver.java`
#### Snippet
```java
        @Override
        public InputStream getContents() throws IOException {
            return new FileInputStream(inputFile);
        }

```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `ioe` is redundant
in `src/main/java/org/apache/maven/plugins/assembly/format/ReaderFormatter.java`
#### Snippet
```java
            return configSource.getMavenReaderFilter().filter(filterRequest);
        } catch (MavenFilteringException e) {
            IOException ioe = new IOException("Error filtering file '" + source + "': " + e.getMessage(), e);
            throw ioe;
        }
```

### UnnecessaryLocalVariable
Local variable `error` is redundant
in `src/main/java/org/apache/maven/plugins/assembly/filter/ComponentsXmlArchiverFileFilter.java`
#### Snippet
```java
                    addComponentsXml(reader);
                } catch (final XmlPullParserException e) {
                    final IOException error =
                            new IOException("Error finalizing component-set for archive. Reason: " + e.getMessage(), e);

```

### UnnecessaryLocalVariable
Local variable `selectors1` is redundant
in `src/main/java/org/apache/maven/plugins/assembly/archive/archiver/PrefixedFileSet.java`
#### Snippet
```java
    public FileSelector[] getFileSelectors() {
        FileSelector[] sel = fileSet.getFileSelectors();
        final FileSelector[] selectors1 = selectors;
        return combineSelectors(sel, selectors1);
    }
```

## RuleId[id=Deprecation]
### Deprecation
'ReaderInputStream(java.io.Reader)' is deprecated
in `src/main/java/org/apache/maven/plugins/assembly/format/ReaderFormatter.java`
#### Snippet
```java
                        result = encoding != null
                                ? new ReaderInputStream(filtered, encoding)
                                : new ReaderInputStream(filtered);
                    }
                    if (transformLineEndings) {
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/main/java/org/apache/maven/plugins/assembly/utils/AssemblyFormatUtils.java`
#### Snippet
```java
            if (value.contains("." + sep)) {
                List<String> parts = new ArrayList<>();
                parts.addAll(Arrays.asList(value.split(sep.replace("\\", "\\\\"))));

                for (ListIterator<String> it = parts.listIterator(); it.hasNext(); ) {
```

## RuleId[id=CdiInjectionPointsInspection]
### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `src/main/java/org/apache/maven/plugins/assembly/archive/phase/DependencySetAssemblyPhase.java`
#### Snippet
```java
    @Inject
    public DependencySetAssemblyPhase(
            final ProjectBuilder projectBuilder, final DependencyResolver dependencyResolver) {
        this.projectBuilder = requireNonNull(projectBuilder);
        this.dependencyResolver = requireNonNull(dependencyResolver);
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `src/main/java/org/apache/maven/plugins/assembly/artifact/DefaultDependencyResolver.java`
#### Snippet
```java

    @Inject
    public DefaultDependencyResolver(ArtifactHandlerManager artifactHandlerManager) {
        this.artifactHandlerManager = requireNonNull(artifactHandlerManager);
    }
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `src/main/java/org/apache/maven/plugins/assembly/archive/phase/ModuleSetAssemblyPhase.java`
#### Snippet
```java
     */
    @Inject
    public ModuleSetAssemblyPhase(final ProjectBuilder projectBuilder, final DependencyResolver dependencyResolver) {
        this.projectBuilder = requireNonNull(projectBuilder);
        this.dependencyResolver = requireNonNull(dependencyResolver);
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `src/main/java/org/apache/maven/plugins/assembly/archive/DefaultAssemblyArchiver.java`
#### Snippet
```java
    @Inject
    public DefaultAssemblyArchiver(
            ArchiverManager archiverManager,
            List<AssemblyArchiverPhase> assemblyPhases,
            Map<String, ContainerDescriptorHandler> containerDescriptorHandlers,
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `src/main/java/org/apache/maven/plugins/assembly/archive/DefaultAssemblyArchiver.java`
#### Snippet
```java
    public DefaultAssemblyArchiver(
            ArchiverManager archiverManager,
            List<AssemblyArchiverPhase> assemblyPhases,
            Map<String, ContainerDescriptorHandler> containerDescriptorHandlers,
            PlexusContainer container) {
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `src/main/java/org/apache/maven/plugins/assembly/archive/DefaultAssemblyArchiver.java`
#### Snippet
```java
            ArchiverManager archiverManager,
            List<AssemblyArchiverPhase> assemblyPhases,
            Map<String, ContainerDescriptorHandler> containerDescriptorHandlers,
            PlexusContainer container) {
        this.archiverManager = requireNonNull(archiverManager);
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `src/main/java/org/apache/maven/plugins/assembly/archive/DefaultAssemblyArchiver.java`
#### Snippet
```java
            List<AssemblyArchiverPhase> assemblyPhases,
            Map<String, ContainerDescriptorHandler> containerDescriptorHandlers,
            PlexusContainer container) {
        this.archiverManager = requireNonNull(archiverManager);
        this.assemblyPhases = requireNonNull(assemblyPhases);
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/apache/maven/plugins/assembly/archive/DefaultAssemblyArchiver.java`
#### Snippet
```java
                + (containerDescriptorHandlers == null
                        ? "none; map is null."
                        : "" + containerDescriptorHandlers.keySet()));

        if (requestedContainerDescriptorHandlers == null) {
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/assembly/io/DefaultAssemblyReader.java`
#### Snippet
```java
        }

        LOGGER.debug(message + "\n\n" + sWriter.toString() + "\n\n");
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/assembly/io/DefaultMessageHolder.java`
#### Snippet
```java
            if (content.length() > label.length() + 3) {
                buffer.append('[').append(counter++).append("] ");
                buffer.append(content.toString());

                if (it.hasNext()) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/assembly/io/DefaultMessageHolder.java`
#### Snippet
```java
                error.printStackTrace(pw);

                buffer.append(sw.toString());
            }

```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/org/apache/maven/plugins/assembly/archive/task/AddFileSetsTask.java`
#### Snippet
```java

    public AddFileSetsTask(final FileSet... fileSets) {
        this.fileSets = new ArrayList<>(Arrays.asList(fileSets));
    }

```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/maven/plugins/assembly/io/DefaultAssemblyReader.java`
#### Snippet
```java
        if ((descriptorSourceDirectory != null) && descriptorSourceDirectory.isDirectory()) {
            // CHECKSTYLE_OFF: LineLength
            locator.setStrategies(Collections.<LocatorStrategy>singletonList(
                    new RelativeFileLocatorStrategy(descriptorSourceDirectory)));
            // CHECKSTYLE_ON: LineLength
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `component` initializer `null` is redundant
in `src/main/java/org/apache/maven/plugins/assembly/io/DefaultAssemblyReader.java`
#### Snippet
```java
            }

            Component component = null;
            try (Reader reader = new InputStreamReader(resolvedLocation.getInputStream())) {
                component = new ComponentXpp3Reader(transformer).read(reader);
```

### UnusedAssignment
Variable `dependencyArtifacts` initializer `null` is redundant
in `src/main/java/org/apache/maven/plugins/assembly/artifact/DefaultDependencyResolver.java`
#### Snippet
```java
            }

            Set<Artifact> dependencyArtifacts = null;
            if (set.isUseTransitiveDependencies()) {
                dependencyArtifacts = project.getArtifacts();
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/maven/plugins/assembly/io/ClasspathResourceLocatorStrategy.java`
#### Snippet
```java
    private String tempFilePrefix = "location.";

    private String tempFileSuffix = ".cpurl";

    private boolean tempFileDeleteOnExit = true;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/maven/plugins/assembly/io/ClasspathResourceLocatorStrategy.java`
#### Snippet
```java
class ClasspathResourceLocatorStrategy implements LocatorStrategy {

    private String tempFilePrefix = "location.";

    private String tempFileSuffix = ".cpurl";
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/maven/plugins/assembly/io/ClasspathResourceLocatorStrategy.java`
#### Snippet
```java
    private String tempFileSuffix = ".cpurl";

    private boolean tempFileDeleteOnExit = true;

    /**
```

