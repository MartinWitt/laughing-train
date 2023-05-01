# nifi-maven 
 
# Bad smells
I found 37 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 7 | false |
| ObsoleteCollection | 4 | false |
| CollectionContainsUrl | 4 | false |
| RedundantFieldInitialization | 3 | false |
| AssignmentToMethodParameter | 3 | false |
| ReturnNull | 3 | false |
| ConstantValue | 3 | false |
| NestedAssignment | 2 | false |
| IOResource | 1 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| UnnecessaryFullyQualifiedName | 1 | false |
| DataFlowIssue | 1 | false |
| UnnecessarySemicolon | 1 | false |
| SizeReplaceableByIsEmpty | 1 | true |
| ZeroLengthArrayInitialization | 1 | false |
| MissortedModifiers | 1 | false |
## RuleId[id=IOResource]
### IOResource
'JarFile' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/org/apache/nifi/NarMojo.java`
#### Snippet
```java

    private void writeAdditionalDetails(final File file, final Set<String> extensionNames, final File additionalDetailsDir) throws IOException, MojoExecutionException {
        final JarFile jarFile = new JarFile(file);

        for (final Enumeration<JarEntry> jarEnumeration = jarFile.entries(); jarEnumeration.hasMoreElements();) {
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `NarDependencyUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/nifi/utils/NarDependencyUtils.java`
#### Snippet
```java
import java.util.Map;

public class NarDependencyUtils {
    public static final String NAR = "nar";
    public static final String COMPILE_STRING = "compile";
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.archiver` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/nifi/NarMojo.java`
#### Snippet
```java
     * \@\component role="org.codehaus.plexus.archiver.Archiver" roleHint="jar"
     */
    @Component(role = org.codehaus.plexus.archiver.Archiver.class, hint = "jar")
    private JarArchiver jarArchiver;
    /**
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `providedServiceDefinitions` might be null
in `src/main/java/org/apache/nifi/NarMojo.java`
#### Snippet
```java
        } else {
            final Class<?> serviceApiClass = Class.forName("org.apache.nifi.documentation.StandardServiceAPI", false, classLoader);
            final List<Object> providedServices = getDocumentationServiceAPIs(serviceApiClass, providedServiceDefinitions);
            final Map<String,Object> propertyServices = getDocumentationServiceAPIs(serviceApiClass, propertyServiceDefinitions);

```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/org/apache/nifi/extension/definition/ExtensionType.java`
#### Snippet
```java
    CONTROLLER_SERVICE,

    REPORTING_TASK;

}
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/nifi/NarMojo.java`
#### Snippet
```java
        final byte[] buffer = new byte[8192];
        int len;
        while ((len = in.read(buffer)) >= 0) {
            out.write(buffer, 0, len);
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/nifi/extension/definition/extraction/ExtensionDefinitionFactory.java`
#### Snippet
```java

            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();

```

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Stack` used
in `src/main/java/org/apache/nifi/NarDuplicateDependenciesMojo.java`
#### Snippet
```java

            narParent.accept(new DependencyNodeVisitor() {
                final Stack<Artifact> hierarchy = new Stack<>();

                @Override
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `src/main/java/org/apache/nifi/NarDuplicateDependenciesMojo.java`
#### Snippet
```java

            narParent.accept(new DependencyNodeVisitor() {
                final Stack<Artifact> hierarchy = new Stack<>();

                @Override
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `src/main/java/org/apache/nifi/NarDuplicateDependenciesMojo.java`
#### Snippet
```java

            root.accept(new DependencyNodeVisitor() {
                final Stack<Artifact> hierarchy = new Stack<>();

                @Override
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `src/main/java/org/apache/nifi/NarDuplicateDependenciesMojo.java`
#### Snippet
```java

            root.accept(new DependencyNodeVisitor() {
                final Stack<Artifact> hierarchy = new Stack<>();

                @Override
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/nifi/NarMojo.java`
#### Snippet
```java

    @Parameter(property = "narDependencyVersion")
    protected String narDependencyVersion = null;


```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/nifi/NarMojo.java`
#### Snippet
```java

    @Parameter(property = "narDependencyId")
    protected String narDependencyId = null;

    @Parameter(property = "narDependencyVersion")
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/nifi/NarMojo.java`
#### Snippet
```java

    @Parameter(property = "narDependencyGroup")
    protected String narDependencyGroup = null;

    @Parameter(property = "narDependencyId")
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `artifacts`
in `src/main/java/org/apache/nifi/NarMojo.java`
#### Snippet
```java

            // the unskipped artifacts are in the resolved set.
            artifacts = status.getResolvedDependencies();
            unResolvedArtifacts.addAll(artifacts);

```

### AssignmentToMethodParameter
Assignment to method parameter `classifier`
in `src/main/java/org/apache/nifi/NarMojo.java`
#### Snippet
```java
    protected File getNarFile(File basedir, String finalName, String classifier) {
        if (classifier == null) {
            classifier = "";
        } else if (classifier.trim().length() > 0 && !classifier.startsWith("-")) {
            classifier = "-" + classifier;
```

### AssignmentToMethodParameter
Assignment to method parameter `classifier`
in `src/main/java/org/apache/nifi/NarMojo.java`
#### Snippet
```java
            classifier = "";
        } else if (classifier.trim().length() > 0 && !classifier.startsWith("-")) {
            classifier = "-" + classifier;
        }

```

## RuleId[id=CollectionContainsUrl]
### CollectionContainsUrl
Set `resourceUrls` may contain URL objects
in `src/main/java/org/apache/nifi/extension/definition/extraction/ExtensionDefinitionFactory.java`
#### Snippet
```java

    private Set<String> discoverClassNames(final String extensionType) throws IOException {
        final Set<URL> resourceUrls = new HashSet<>();

        final Enumeration<URL> resources = extensionClassLoader.getResources(SERVICES_DIRECTORY + extensionType);
```

### CollectionContainsUrl
Set `urls` may contain URL objects
in `src/main/java/org/apache/nifi/extension/definition/extraction/ExtensionClassLoaderFactory.java`
#### Snippet
```java

    private Set<URL> toURLs(final Artifact artifact) throws MojoExecutionException {
        final Set<URL> urls = new HashSet<>();

        final File artifactFile = artifact.getFile();
```

### CollectionContainsUrl
Set `urls` may contain URL objects
in `src/main/java/org/apache/nifi/extension/definition/extraction/ExtensionClassLoaderFactory.java`
#### Snippet
```java
    /* package visible for testing reasons */
    ExtensionClassLoader createClassLoader(final Set<Artifact> artifacts, final ExtensionClassLoader parent, final Artifact narArtifact) throws MojoExecutionException {
        final Set<URL> urls = new HashSet<>();
        for (final Artifact artifact : artifacts) {
            final Set<URL> artifactUrls = toURLs(artifact);
```

### CollectionContainsUrl
Set `artifactUrls` may contain URL objects
in `src/main/java/org/apache/nifi/extension/definition/extraction/ExtensionClassLoaderFactory.java`
#### Snippet
```java
        final Set<URL> urls = new HashSet<>();
        for (final Artifact artifact : artifacts) {
            final Set<URL> artifactUrls = toURLs(artifact);
            urls.addAll(artifactUrls);
        }
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/apache/nifi/extension/definition/extraction/ExtensionClassLoader.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/nifi/extension/definition/extraction/ExtensionClassLoaderFactory.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/nifi/extension/definition/extraction/ExtensionClassLoaderFactory.java`
#### Snippet
```java
        }

        return null;
    }

```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`classifier.trim().length() > 0` can be replaced with '!classifier.trim().isEmpty()'
in `src/main/java/org/apache/nifi/NarMojo.java`
#### Snippet
```java
        if (classifier == null) {
            classifier = "";
        } else if (classifier.trim().length() > 0 && !classifier.startsWith("-")) {
            classifier = "-" + classifier;
        }
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/nifi/extension/definition/extraction/ExtensionClassLoaderFactory.java`
#### Snippet
```java
        getLog().debug("Creating class loader with following dependencies: " + urls);

        final URL[] urlArray = urls.toArray(new URL[0]);
        if (parent == null) {
            return new ExtensionClassLoader(urlArray, narArtifact, artifacts);
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends ServiceAPIDefinition`
in `src/main/java/org/apache/nifi/NarMojo.java`
#### Snippet
```java
    }

    private List<Object> getDocumentationServiceAPIs(Class<?> serviceApiClass, Set<ServiceAPIDefinition> serviceDefinitions)
            throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        final Constructor<?> ctr = serviceApiClass.getConstructor(String.class, String.class, String.class, String.class);
```

### BoundedWildcard
Can generalize to `? extends ExtensionDefinition`
in `src/main/java/org/apache/nifi/NarMojo.java`
#### Snippet
```java
    }

    private void writeDocumentation(final Set<ExtensionDefinition> extensionDefinitions, final ExtensionClassLoader classLoader,
                                    final Class<?> docWriterClass, final XMLStreamWriter xmlWriter, final File additionalDetailsDir)
        throws InvocationTargetException, NoSuchMethodException, ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
```

### BoundedWildcard
Can generalize to `? super Class`
in `src/main/java/org/apache/nifi/extension/definition/extraction/ExtensionDefinitionFactory.java`
#### Snippet
```java
    }

    private void getInterfaceHierarchy(final Class<?> implementedInterface, final Set<Class<?>> interfaceHierarchy) {
        final Class<?>[] parentInterfaces = implementedInterface.getInterfaces();
        if (parentInterfaces == null) {
```

### BoundedWildcard
Can generalize to `? super ServiceAPIDefinition`
in `src/main/java/org/apache/nifi/extension/definition/extraction/ExtensionDefinitionFactory.java`
#### Snippet
```java
    }

    private void processImplementedInterface(final Class<?> implementedInterface, final Class<?> controllerServiceClass, final Set<ServiceAPIDefinition> serviceApis) {
        if (controllerServiceClass.isAssignableFrom(implementedInterface) && !controllerServiceClass.equals(implementedInterface)) {
            final ClassLoader interfaceClassLoader = implementedInterface.getClassLoader();
```

### BoundedWildcard
Can generalize to `? extends Set`
in `src/main/java/org/apache/nifi/extension/definition/extraction/ExtensionClassLoaderFactory.java`
#### Snippet
```java


    private Set<Artifact> gatherArtifacts(final MavenProject mavenProject, final Supplier<Set<Artifact>> setSupplier) throws MojoExecutionException {
        final Set<Artifact> artifacts = setSupplier.get();
        final DependencyNodeVisitor nodeVisitor = new DependencyNodeVisitor() {
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `src/main/java/org/apache/nifi/extension/definition/extraction/ExtensionClassLoaderFactory.java`
#### Snippet
```java
    }

    private String findProvidedDependencyVersion(final Set<Artifact> artifacts, final String groupId, final String artifactId) {
        final ProjectBuildingRequest projectRequest = new DefaultProjectBuildingRequest();
        projectRequest.setRepositorySession(repoSession);
```

### BoundedWildcard
Can generalize to `? extends Artifact`
in `src/main/java/org/apache/nifi/extension/definition/extraction/ExtensionClassLoaderFactory.java`
#### Snippet
```java
        private Set<Artifact> allArtifacts = new TreeSet<>();

        public void addArtifacts(final Set<Artifact> artifacts) {
            if (artifacts != null) {
                allArtifacts.addAll(artifacts);
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/org/apache/nifi/extension/definition/extraction/ExtensionClassLoaderFactory.java`
#### Snippet
```java
public class ExtensionClassLoaderFactory {

    private final static Set<String> EXCLUDED_ARTIFACT_IDS;
    static {
        final Set<String> excludedArtifactIds = new HashSet<>();
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `propertyServiceDefinitions == null` is always `false` when reached
in `src/main/java/org/apache/nifi/NarMojo.java`
#### Snippet
```java

        if ((providedServiceDefinitions == null || providedServiceDefinitions.isEmpty())
                && (propertyServiceDefinitions == null || propertyServiceDefinitions.isEmpty())) {
            final Method writeMethod = docWriterClass.getMethod("write", configurableComponentClass);
            writeMethod.invoke(docWriter, extensionInstance);
```

### ConstantValue
Condition `extensionInterfaces == null` is always `false`
in `src/main/java/org/apache/nifi/extension/definition/extraction/ExtensionDefinitionFactory.java`
#### Snippet
```java
    private void addProvidedServiceAPIs(final Class<?> controllerServiceClass, final Class<?> extensionClass, final Set<ServiceAPIDefinition> serviceApis) {
        final Class<?>[] extensionInterfaces = extensionClass.getInterfaces();
        if (extensionInterfaces == null) {
            return;
        }
```

### ConstantValue
Condition `parentInterfaces == null` is always `false`
in `src/main/java/org/apache/nifi/extension/definition/extraction/ExtensionDefinitionFactory.java`
#### Snippet
```java
    private void getInterfaceHierarchy(final Class<?> implementedInterface, final Set<Class<?>> interfaceHierarchy) {
        final Class<?>[] parentInterfaces = implementedInterface.getInterfaces();
        if (parentInterfaces == null) {
            return;
        }
```

