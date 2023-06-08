# nifi-maven 
 
# Bad smells
I found 42 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 15 | false |
| UNCHECKED_WARNING | 13 | false |
| CollectionContainsUrl | 4 | false |
| ConstantValue | 3 | false |
| IOStreamConstructor | 2 | false |
| AutoCloseableResource | 1 | false |
| DataFlowIssue | 1 | false |
| UnnecessarySemicolon | 1 | false |
| FieldMayBeFinal | 1 | false |
| SortedCollectionWithNonComparableKeys | 1 | false |
## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'JarFile' used without 'try'-with-resources statement
in `src/main/java/org/apache/nifi/NarMojo.java`
#### Snippet
```java

    private void writeAdditionalDetails(final File file, final Set<String> extensionNames, final File additionalDetailsDir) throws IOException, MojoExecutionException {
        final JarFile jarFile = new JarFile(file);

        for (final Enumeration<JarEntry> jarEnumeration = jarFile.entries(); jarEnumeration.hasMoreElements();) {
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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.Collection'
in `src/main/java/org/apache/nifi/extension/definition/extraction/ExtensionClassLoader.java`
#### Snippet
```java
        this.urls = urls;
        this.narArtifact = narArtifact;
        this.allArtifacts = new ArrayList<>(otherArtifacts);
        if (narArtifact != null) {
            allArtifacts.add(narArtifact);
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/org/apache/nifi/extension/definition/extraction/ExtensionClassLoader.java`
#### Snippet
```java
        this.urls = urls;
        this.narArtifact = narArtifact;
        this.allArtifacts = new ArrayList<>(otherArtifacts);
        if (narArtifact != null) {
            allArtifacts.add(narArtifact);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.Collection'
in `src/main/java/org/apache/nifi/extension/definition/extraction/ExtensionClassLoader.java`
#### Snippet
```java
        this.urls = urls;
        this.narArtifact = narArtifact;
        this.allArtifacts = new ArrayList<>(otherArtifacts);
        if (narArtifact != null) {
            allArtifacts.add(narArtifact);
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/org/apache/nifi/extension/definition/extraction/ExtensionClassLoader.java`
#### Snippet
```java
        this.urls = urls;
        this.narArtifact = narArtifact;
        this.allArtifacts = new ArrayList<>(otherArtifacts);
        if (narArtifact != null) {
            allArtifacts.add(narArtifact);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/org/apache/nifi/NarDuplicateDependenciesMojo.java`
#### Snippet
```java
                    hierarchy.push(artifact);
                    if (NarDependencyUtils.COMPILE_STRING.equals(artifact.getScope()) && !NarDependencyUtils.NAR.equals(artifact.getType())) {
                        directDependencies.put(artifact.toString(), new ArrayList<>(hierarchy));
                        return true;
                    }
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/org/apache/nifi/NarDuplicateDependenciesMojo.java`
#### Snippet
```java
                    hierarchy.push(artifact);
                    if (NarDependencyUtils.COMPILE_STRING.equals(artifact.getScope()) && !NarDependencyUtils.NAR.equals(artifact.getType())) {
                        directDependencies.put(artifact.toString(), new ArrayList<>(hierarchy));
                        return true;
                    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/org/apache/nifi/extension/definition/extraction/ExtensionClassLoaderFactory.java`
#### Snippet
```java
        }

        final List<Artifact> sorted = new ArrayList<>(artifacts);
        Collections.sort(sorted);

```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/org/apache/nifi/extension/definition/extraction/ExtensionClassLoaderFactory.java`
#### Snippet
```java
        }

        final List<Artifact> sorted = new ArrayList<>(artifacts);
        Collections.sort(sorted);

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `src/main/java/org/apache/nifi/extension/definition/extraction/ExtensionClassLoaderFactory.java`
#### Snippet
```java
        this.projectBuilder = builder.projectBuilder;
        this.localRepo = builder.localRepo;
        this.remoteRepos = new ArrayList<>(builder.remoteRepos);
        this.dependencyGraphBuilder = builder.dependencyGraphBuilder;
        this.artifactResolver = builder.artifactResolver;
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/org/apache/nifi/extension/definition/extraction/ExtensionClassLoaderFactory.java`
#### Snippet
```java
        this.projectBuilder = builder.projectBuilder;
        this.localRepo = builder.localRepo;
        this.remoteRepos = new ArrayList<>(builder.remoteRepos);
        this.dependencyGraphBuilder = builder.dependencyGraphBuilder;
        this.artifactResolver = builder.artifactResolver;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `src/main/java/org/apache/nifi/NarMojo.java`
#### Snippet
```java

        final Method writeMethod = extensionClass.getMethod("getPropertyDescriptors");
        final List<Object> propertyDescriptors = (List<Object>) writeMethod.invoke(extensionInstance);

        if (propertyDescriptors == null) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `src/main/java/org/apache/nifi/NarMojo.java`
#### Snippet
```java

        // calculate the skipped artifacts
        Set<Artifact> skippedArtifacts = new HashSet<>(artifacts);
        skippedArtifacts.removeAll(unMarkedArtifacts);

```

### UNCHECKED_WARNING
Unchecked call to 'HashSet(Collection)' as a member of raw type 'java.util.HashSet'
in `src/main/java/org/apache/nifi/NarMojo.java`
#### Snippet
```java

        // calculate the skipped artifacts
        Set<Artifact> skippedArtifacts = new HashSet<>(artifacts);
        skippedArtifacts.removeAll(unMarkedArtifacts);

```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `src/main/java/org/apache/nifi/NarMojo.java`
#### Snippet
```java

            try (final InputStream in = jarFile.getInputStream(jarEntry);
                 final OutputStream out = new FileOutputStream(destinationFile)) {
                copy(in, out);
            }
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `src/main/java/org/apache/nifi/NarMojo.java`
#### Snippet
```java
        createDirectory(additionalDetailsDir);

        try (final OutputStream out = new FileOutputStream(docsFile)) {

            final XMLStreamWriter xmlWriter = XMLOutputFactory.newInstance().createXMLStreamWriter(out, "UTF-8");
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `ArtifactHandlerManager`
in `src/main/java/org/apache/nifi/NarProvidedDependenciesMojo.java`
#### Snippet
```java
    /**
     * *
     * The {@link ArtifactHandlerManager} into which any extension {@link ArtifactHandler} instances should have been injected when the extensions were loaded.
     */
    @Component
```

### JavadocReference
Cannot resolve symbol `ArtifactHandler`
in `src/main/java/org/apache/nifi/NarProvidedDependenciesMojo.java`
#### Snippet
```java
    /**
     * *
     * The {@link ArtifactHandlerManager} into which any extension {@link ArtifactHandler} instances should have been injected when the extensions were loaded.
     */
    @Component
```

### JavadocReference
Cannot resolve symbol `ProjectBuilder`
in `src/main/java/org/apache/nifi/NarProvidedDependenciesMojo.java`
#### Snippet
```java

    /**
     * The {@link ProjectBuilder} used to generate the {@link MavenProject} for the nar artifact the dependency tree is being generated for.
     */
    @Component
```

### JavadocReference
Cannot resolve symbol `MavenProject`
in `src/main/java/org/apache/nifi/NarProvidedDependenciesMojo.java`
#### Snippet
```java

    /**
     * The {@link ProjectBuilder} used to generate the {@link MavenProject} for the nar artifact the dependency tree is being generated for.
     */
    @Component
```

### JavadocReference
Cannot resolve symbol `RepositorySystemSession`
in `src/main/java/org/apache/nifi/NarProvidedDependenciesMojo.java`
#### Snippet
```java

    /**
     * The {@link RepositorySystemSession} used for obtaining the local and remote artifact repositories.
     */
    @Parameter(defaultValue = "${repositorySystemSession}", readonly = true)
```

### JavadocReference
Cannot resolve symbol `RepositorySystemSession`
in `src/main/java/org/apache/nifi/NarDuplicateDependenciesMojo.java`
#### Snippet
```java

    /**
     * The {@link RepositorySystemSession} used for obtaining the local and remote artifact repositories.
     */
    @Parameter(defaultValue = "${repositorySystemSession}", readonly = true)
```

### JavadocReference
Cannot resolve symbol `ProjectBuilder`
in `src/main/java/org/apache/nifi/NarDuplicateDependenciesMojo.java`
#### Snippet
```java

    /**
     * The {@link ProjectBuilder} used to generate the {@link MavenProject} for the nar artifact the dependency tree is being generated for.
     */
    @Component
```

### JavadocReference
Cannot resolve symbol `MavenProject`
in `src/main/java/org/apache/nifi/NarDuplicateDependenciesMojo.java`
#### Snippet
```java

    /**
     * The {@link ProjectBuilder} used to generate the {@link MavenProject} for the nar artifact the dependency tree is being generated for.
     */
    @Component
```

### JavadocReference
Cannot resolve symbol `ArtifactHandlerManager`
in `src/main/java/org/apache/nifi/NarDuplicateDependenciesMojo.java`
#### Snippet
```java
    /**
     * *
     * The {@link ArtifactHandlerManager} into which any extension {@link ArtifactHandler} instances should have been injected when the extensions were loaded.
     */
    @Component
```

### JavadocReference
Cannot resolve symbol `ArtifactHandler`
in `src/main/java/org/apache/nifi/NarDuplicateDependenciesMojo.java`
#### Snippet
```java
    /**
     * *
     * The {@link ArtifactHandlerManager} into which any extension {@link ArtifactHandler} instances should have been injected when the extensions were loaded.
     */
    @Component
```

### JavadocReference
Cannot resolve symbol `ProjectBuilder`
in `src/main/java/org/apache/nifi/NarMojo.java`
#### Snippet
```java

    /**
     * The {@link ProjectBuilder} used to generate the {@link MavenProject} for the nar artifact the dependency tree is being generated for.
     */
    @Component
```

### JavadocReference
Cannot resolve symbol `MavenProject`
in `src/main/java/org/apache/nifi/NarMojo.java`
#### Snippet
```java

    /**
     * The {@link ProjectBuilder} used to generate the {@link MavenProject} for the nar artifact the dependency tree is being generated for.
     */
    @Component
```

### JavadocReference
Cannot resolve symbol `RepositorySystemSession`
in `src/main/java/org/apache/nifi/NarMojo.java`
#### Snippet
```java

    /**
     * The {@link RepositorySystemSession} used for obtaining the local and remote artifact repositories.
     */
    @Parameter(defaultValue = "${repositorySystemSession}", readonly = true)
```

### JavadocReference
Cannot resolve symbol `ArtifactHandlerManager`
in `src/main/java/org/apache/nifi/NarMojo.java`
#### Snippet
```java
    /**
     * *
     * The {@link ArtifactHandlerManager} into which any extension {@link ArtifactHandler} instances should have been injected when the extensions were loaded.
     */
    @Component
```

### JavadocReference
Cannot resolve symbol `ArtifactHandler`
in `src/main/java/org/apache/nifi/NarMojo.java`
#### Snippet
```java
    /**
     * *
     * The {@link ArtifactHandlerManager} into which any extension {@link ArtifactHandler} instances should have been injected when the extensions were loaded.
     */
    @Component
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

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `allArtifacts` may be 'final'
in `src/main/java/org/apache/nifi/extension/definition/extraction/ExtensionClassLoaderFactory.java`
#### Snippet
```java
    private static class ArtifactsHolder {

        private Set<Artifact> allArtifacts = new TreeSet<>();

        public void addArtifacts(final Set<Artifact> artifacts) {
```

## RuleId[id=SortedCollectionWithNonComparableKeys]
### SortedCollectionWithNonComparableKeys
Construction of sorted collection with non-comparable elements
in `src/main/java/org/apache/nifi/extension/definition/extraction/ExtensionClassLoaderFactory.java`
#### Snippet
```java
    private static class ArtifactsHolder {

        private Set<Artifact> allArtifacts = new TreeSet<>();

        public void addArtifacts(final Set<Artifact> artifacts) {
```

## RuleId[id=ConstantValue]
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

