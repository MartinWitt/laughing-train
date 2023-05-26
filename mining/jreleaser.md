# jreleaser 
 
# Bad smells
I found 653 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UNCHECKED_WARNING | 158 | false |
| DuplicatedCode | 146 | false |
| Deprecation | 69 | false |
| UnusedAssignment | 37 | false |
| IOStreamConstructor | 32 | false |
| NullableProblems | 28 | false |
| AutoCloseableResource | 25 | false |
| RegExpRedundantEscape | 21 | false |
| DataFlowIssue | 15 | false |
| IgnoreResultOfCall | 15 | false |
| TrivialStringConcatenation | 14 | false |
| ConstantValue | 11 | false |
| UnstableApiUsage | 10 | false |
| JavadocLinkAsPlainText | 9 | false |
| DuplicateExpressions | 8 | false |
| RedundantEscapeInRegexReplacement | 8 | false |
| OctalLiteral | 6 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 6 | false |
| RedundantLengthCheck | 5 | false |
| RedundantMethodOverride | 4 | false |
| DeprecatedIsStillUsed | 3 | false |
| RegExpSimplifiable | 3 | false |
| EqualsWhichDoesntCheckParameterClass | 3 | false |
| CharsetObjectCanBeUsed | 2 | false |
| RegExpUnnecessaryNonCapturingGroup | 2 | false |
| OptionalIsPresent | 1 | false |
| MagicConstant | 1 | false |
| CommentedOutCode | 1 | false |
| RegExpRedundantClassElement | 1 | false |
| CatchMayIgnoreException | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| ManualMinMaxCalculation | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| DefaultAnnotationParam | 1 | false |
| SlowListContainsAll | 1 | false |
| ExcessiveLambdaUsage | 1 | false |
| FieldMayBeFinal | 1 | false |
| DuplicateThrows | 1 | false |
## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/GitlabReleaser.java`
#### Snippet
```java
        for (Map.Entry<String, String> e : gitlab.getUploadLinks().entrySet()) {
            Optional<? extends Uploader> uploader = context.getModel().getUpload().getActiveUploader(e.getKey(), e.getValue());
            if (uploader.isPresent()) {
                collectUploadLinks(uploader.get(), links);
            }
```

## RuleId[id=RedundantLengthCheck]
### RedundantLengthCheck
Redundant array length check
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/AbstractModelCommand.java`
#### Snippet
```java
        Properties props = new Properties();

        if (null != properties && properties.length > 0) {
            for (String property : properties) {
                if (property.contains("=")) {
```

### RedundantLengthCheck
Redundant array length check
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/AbstractLoggingCommand.java`
#### Snippet
```java
    protected List<String> collectEntries(String[] input, boolean lowerCase) {
        List<String> list = new ArrayList<>();
        if (null != input && input.length > 0) {
            for (String s : input) {
                if (isNotBlank(s)) {
```

### RedundantLengthCheck
Redundant array length check
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Release.java`
#### Snippet
```java
    private Set<UpdateSection> collectUpdateSections() {
        Set<UpdateSection> set = new LinkedHashSet<>();
        if (null != composite.autoConfig.updateSections && composite.autoConfig.updateSections.length > 0) {
            for (String updateSection : composite.autoConfig.updateSections) {
                set.add(UpdateSection.of(updateSection.trim()));
```

### RedundantLengthCheck
Redundant array length check
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/JReleaserAutoConfigReleaseMojo.java`
#### Snippet
```java
    private Set<org.jreleaser.model.UpdateSection> collectUpdateSections() {
        Set<org.jreleaser.model.UpdateSection> set = new LinkedHashSet<>();
        if (null != updateSections && updateSections.length > 0) {
            for (UpdateSection updateSection : updateSections) {
                set.add(org.jreleaser.model.UpdateSection.of(updateSection.name()));
```

### RedundantLengthCheck
Redundant array length check
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/AbstractJReleaserMojo.java`
#### Snippet
```java
    protected List<String> collectEntries(String[] input, boolean lowerCase) {
        List<String> list = new ArrayList<>();
        if (null != input && input.length > 0) {
            for (String s : input) {
                if (isNotBlank(s)) {
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'V'
in `api/jreleaser-model-api/src/main/java/org/jreleaser/mustache/TemplateContext.java`
#### Snippet
```java

    public <V> V set(String key, V value, V defaultValue) {
        V previousValue = (V) properties.get(key);
        if (null != value && null != defaultValue) properties.put(key, value);
        return previousValue;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'V'
in `api/jreleaser-model-api/src/main/java/org/jreleaser/mustache/TemplateContext.java`
#### Snippet
```java

    public <V> V remove(String key) {
        return (V) properties.remove(key);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'V'
in `api/jreleaser-model-api/src/main/java/org/jreleaser/mustache/TemplateContext.java`
#### Snippet
```java

    public <V> V get(String key) {
        return (V) properties.get(key);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'V'
in `api/jreleaser-model-api/src/main/java/org/jreleaser/mustache/TemplateContext.java`
#### Snippet
```java

    public <V> V set(String key, V value) {
        V previousValue = (V) properties.get(key);
        if (null != value) properties.put(key, value);
        return previousValue;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map\>'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/deploy/maven/ArtifactDeployers.java`
#### Snippet
```java

    public static <A extends org.jreleaser.model.api.deploy.maven.MavenDeployer, D extends org.jreleaser.model.internal.deploy.maven.MavenDeployer<A>> MavenDeployer<A, D> findMavenDeployer(JReleaserContext context, D deployer) {
        Map<String, MavenDeployer<?, ?>> deployers = StreamSupport.stream(ServiceLoader.load(MavenDeployerFactory.class,
                ArtifactDeployers.class.getClassLoader()).spliterator(), false)
            .collect(Collectors.toMap(MavenDeployerFactory::getName, factory -> factory.getMavenDeployer(context)));

        if (deployers.containsKey(deployer.getType())) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.stream.Collector' to 'java.util.stream.Collector\>\>'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/deploy/maven/ArtifactDeployers.java`
#### Snippet
```java
        Map<String, MavenDeployer<?, ?>> deployers = StreamSupport.stream(ServiceLoader.load(MavenDeployerFactory.class,
                ArtifactDeployers.class.getClassLoader()).spliterator(), false)
            .collect(Collectors.toMap(MavenDeployerFactory::getName, factory -> factory.getMavenDeployer(context)));

        if (deployers.containsKey(deployer.getType())) {
```

### UNCHECKED_WARNING
Unchecked call to 'setDeployer(D)' as a member of raw type 'org.jreleaser.model.spi.deploy.maven.MavenDeployer'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/deploy/maven/ArtifactDeployers.java`
#### Snippet
```java
        if (deployers.containsKey(deployer.getType())) {
            MavenDeployer artifactMavenDeployer = deployers.get(deployer.getType());
            artifactMavenDeployer.setDeployer(deployer);
            return artifactMavenDeployer;
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.jreleaser.model.spi.deploy.maven.MavenDeployer' to 'org.jreleaser.model.spi.deploy.maven.MavenDeployer'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/deploy/maven/ArtifactDeployers.java`
#### Snippet
```java
            MavenDeployer artifactMavenDeployer = deployers.get(deployer.getType());
            artifactMavenDeployer.setDeployer(deployer);
            return artifactMavenDeployer;
        }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map\>'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/upload/ArtifactUploaders.java`
#### Snippet
```java

    public static <A extends org.jreleaser.model.api.upload.Uploader, U extends Uploader<A>> ArtifactUploader<A, U> findUploader(JReleaserContext context, U uploader) {
        Map<String, ArtifactUploader<?, ?>> uploaders = StreamSupport.stream(ServiceLoader.load(ArtifactUploaderFactory.class,
                ArtifactUploaders.class.getClassLoader()).spliterator(), false)
            .collect(Collectors.toMap(ArtifactUploaderFactory::getName, factory -> factory.getArtifactUploader(context)));

        if (uploaders.containsKey(uploader.getType())) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.stream.Collector' to 'java.util.stream.Collector\>\>'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/upload/ArtifactUploaders.java`
#### Snippet
```java
        Map<String, ArtifactUploader<?, ?>> uploaders = StreamSupport.stream(ServiceLoader.load(ArtifactUploaderFactory.class,
                ArtifactUploaders.class.getClassLoader()).spliterator(), false)
            .collect(Collectors.toMap(ArtifactUploaderFactory::getName, factory -> factory.getArtifactUploader(context)));

        if (uploaders.containsKey(uploader.getType())) {
```

### UNCHECKED_WARNING
Unchecked call to 'setUploader(U)' as a member of raw type 'org.jreleaser.model.spi.upload.ArtifactUploader'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/upload/ArtifactUploaders.java`
#### Snippet
```java
        if (uploaders.containsKey(uploader.getType())) {
            ArtifactUploader artifactUploader = uploaders.get(uploader.getType());
            artifactUploader.setUploader(uploader);
            return artifactUploader;
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.jreleaser.model.spi.upload.ArtifactUploader' to 'org.jreleaser.model.spi.upload.ArtifactUploader'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/upload/ArtifactUploaders.java`
#### Snippet
```java
            ArtifactUploader artifactUploader = uploaders.get(uploader.getType());
            artifactUploader.setUploader(uploader);
            return artifactUploader;
        }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map\>'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/catalog/sbom/ProjectSbomCatalogers.java`
#### Snippet
```java

    public static <A extends org.jreleaser.model.api.catalog.sbom.SbomCataloger, C extends org.jreleaser.model.internal.catalog.sbom.SbomCataloger<A>> SbomCatalogerProcessor<A, C> findSbomCataloger(JReleaserContext context, C cataloger) {
        Map<String, SbomCatalogerProcessor<?, ?>> catalogers = StreamSupport.stream(ServiceLoader.load(SbomCatalogerProcessorFactory.class,
                ProjectSbomCatalogers.class.getClassLoader()).spliterator(), false)
            .collect(Collectors.toMap(SbomCatalogerProcessorFactory::getName, factory -> factory.getSbomCataloger(context)));

        if (catalogers.containsKey(cataloger.getType())) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.stream.Collector' to 'java.util.stream.Collector\>\>'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/catalog/sbom/ProjectSbomCatalogers.java`
#### Snippet
```java
        Map<String, SbomCatalogerProcessor<?, ?>> catalogers = StreamSupport.stream(ServiceLoader.load(SbomCatalogerProcessorFactory.class,
                ProjectSbomCatalogers.class.getClassLoader()).spliterator(), false)
            .collect(Collectors.toMap(SbomCatalogerProcessorFactory::getName, factory -> factory.getSbomCataloger(context)));

        if (catalogers.containsKey(cataloger.getType())) {
```

### UNCHECKED_WARNING
Unchecked call to 'setCataloger(C)' as a member of raw type 'org.jreleaser.model.spi.catalog.sbom.SbomCatalogerProcessor'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/catalog/sbom/ProjectSbomCatalogers.java`
#### Snippet
```java
        if (catalogers.containsKey(cataloger.getType())) {
            SbomCatalogerProcessor sbomCataloger = catalogers.get(cataloger.getType());
            sbomCataloger.setCataloger(cataloger);
            return sbomCataloger;
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.jreleaser.model.spi.catalog.sbom.SbomCatalogerProcessor' to 'org.jreleaser.model.spi.catalog.sbom.SbomCatalogerProcessor'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/catalog/sbom/ProjectSbomCatalogers.java`
#### Snippet
```java
            SbomCatalogerProcessor sbomCataloger = catalogers.get(cataloger.getType());
            sbomCataloger.setCataloger(cataloger);
            return sbomCataloger;
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Collection\>' to 'java.util.Collection'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/hooks/HookExecutor.java`
#### Snippet
```java
        switch (event.getType()) {
            case BEFORE:
                hooks.addAll((Collection<CommandHook>) filter(commandHooks.getBefore(), event));
                break;
            case SUCCESS:
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Collection\>' to 'java.util.Collection'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/hooks/HookExecutor.java`
#### Snippet
```java
                break;
            case SUCCESS:
                hooks.addAll((Collection<CommandHook>) filter(commandHooks.getSuccess(), event));
                break;
            case FAILURE:
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Collection\>' to 'java.util.Collection'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/hooks/HookExecutor.java`
#### Snippet
```java
                break;
            case FAILURE:
                hooks.addAll((Collection<CommandHook>) filter(commandHooks.getFailure(), event));
                break;
        }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Collection\>' to 'java.util.Collection'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/hooks/HookExecutor.java`
#### Snippet
```java
        switch (event.getType()) {
            case BEFORE:
                hooks.addAll((Collection<ScriptHook>) filter(scriptHooks.getBefore(), event));
                break;
            case SUCCESS:
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Collection\>' to 'java.util.Collection'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/hooks/HookExecutor.java`
#### Snippet
```java
                break;
            case SUCCESS:
                hooks.addAll((Collection<ScriptHook>) filter(scriptHooks.getSuccess(), event));
                break;
            case FAILURE:
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Collection\>' to 'java.util.Collection'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/hooks/HookExecutor.java`
#### Snippet
```java
                break;
            case FAILURE:
                hooks.addAll((Collection<ScriptHook>) filter(scriptHooks.getFailure(), event));
                break;
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map\>'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/release/Releasers.java`
#### Snippet
```java

    private static <T extends ReleaserBuilder<?>> T findReleaser(JReleaserContext context) {
        Map<String, ReleaserBuilder<?>> builders = StreamSupport.stream(ServiceLoader.load(ReleaserBuilderFactory.class,
                Releasers.class.getClassLoader()).spliterator(), false)
            .collect(Collectors.toMap(ReleaserBuilderFactory::getName, ReleaserBuilderFactory::getBuilder));

        if (null != context.getModel().getRelease().getGithub()) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.stream.Collector' to 'java.util.stream.Collector\>\>'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/release/Releasers.java`
#### Snippet
```java
        Map<String, ReleaserBuilder<?>> builders = StreamSupport.stream(ServiceLoader.load(ReleaserBuilderFactory.class,
                Releasers.class.getClassLoader()).spliterator(), false)
            .collect(Collectors.toMap(ReleaserBuilderFactory::getName, ReleaserBuilderFactory::getBuilder));

        if (null != context.getModel().getRelease().getGithub()) {
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.spi.release.ReleaserBuilder\>' to 'T'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/release/Releasers.java`
#### Snippet
```java

        if (null != context.getModel().getRelease().getGithub()) {
            return (T) builders.get(GithubReleaser.TYPE);
        }
        if (null != context.getModel().getRelease().getGitlab()) {
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.spi.release.ReleaserBuilder\>' to 'T'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/release/Releasers.java`
#### Snippet
```java
        }
        if (null != context.getModel().getRelease().getGitlab()) {
            return (T) builders.get(GitlabReleaser.TYPE);
        }
        if (null != context.getModel().getRelease().getGitea()) {
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.spi.release.ReleaserBuilder\>' to 'T'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/release/Releasers.java`
#### Snippet
```java
        }
        if (null != context.getModel().getRelease().getGitea()) {
            return (T) builders.get(GiteaReleaser.TYPE);
        }
        if (null != context.getModel().getRelease().getCodeberg()) {
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.spi.release.ReleaserBuilder\>' to 'T'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/release/Releasers.java`
#### Snippet
```java
        }
        if (null != context.getModel().getRelease().getCodeberg()) {
            return (T) builders.get(CodebergReleaser.TYPE);
        }
        if (null != context.getModel().getRelease().getGeneric()) {
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.spi.release.ReleaserBuilder\>' to 'T'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/release/Releasers.java`
#### Snippet
```java
        }
        if (null != context.getModel().getRelease().getGeneric()) {
            return (T) builders.get(GenericGitReleaser.TYPE);
        }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map\>'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/assemble/AssemblerProcessors.java`
#### Snippet
```java

    public static <A extends org.jreleaser.model.api.assemble.Assembler, S extends Assembler<A>> AssemblerProcessor<A, S> findProcessor(JReleaserContext context, S assembler) {
        Map<String, AssemblerProcessor<?, ?>> processors = StreamSupport.stream(ServiceLoader.load(AssemblerProcessorFactory.class,
                AssemblerProcessors.class.getClassLoader()).spliterator(), false)
            .collect(Collectors.toMap(AssemblerProcessorFactory::getName, factory -> factory.getAssemblerProcessor(context)));

        if (processors.containsKey(assembler.getType())) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.stream.Collector' to 'java.util.stream.Collector\>\>'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/assemble/AssemblerProcessors.java`
#### Snippet
```java
        Map<String, AssemblerProcessor<?, ?>> processors = StreamSupport.stream(ServiceLoader.load(AssemblerProcessorFactory.class,
                AssemblerProcessors.class.getClassLoader()).spliterator(), false)
            .collect(Collectors.toMap(AssemblerProcessorFactory::getName, factory -> factory.getAssemblerProcessor(context)));

        if (processors.containsKey(assembler.getType())) {
```

### UNCHECKED_WARNING
Unchecked call to 'setAssembler(S)' as a member of raw type 'org.jreleaser.model.spi.assemble.AssemblerProcessor'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/assemble/AssemblerProcessors.java`
#### Snippet
```java
        if (processors.containsKey(assembler.getType())) {
            AssemblerProcessor assemblerProcessor = processors.get(assembler.getType());
            assemblerProcessor.setAssembler(assembler);
            return assemblerProcessor;
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.jreleaser.model.spi.assemble.AssemblerProcessor' to 'org.jreleaser.model.spi.assemble.AssemblerProcessor'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/assemble/AssemblerProcessors.java`
#### Snippet
```java
            AssemblerProcessor assemblerProcessor = processors.get(assembler.getType());
            assemblerProcessor.setAssembler(assembler);
            return assemblerProcessor;
        }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map\>'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/announce/Announcers.java`
#### Snippet
```java
        JReleaserModel model = context.getModel();

        Map<String, AnnouncerBuilder<?>> builders = StreamSupport.stream(ServiceLoader.load(AnnouncerBuilderFactory.class,
                Announcers.class.getClassLoader()).spliterator(), false)
            .collect(Collectors.toMap(AnnouncerBuilderFactory::getName, AnnouncerBuilderFactory::getBuilder));

        Map<String, Announcer<?>> announcers = new TreeMap<>();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.stream.Collector' to 'java.util.stream.Collector\>\>'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/announce/Announcers.java`
#### Snippet
```java
        Map<String, AnnouncerBuilder<?>> builders = StreamSupport.stream(ServiceLoader.load(AnnouncerBuilderFactory.class,
                Announcers.class.getClassLoader()).spliterator(), false)
            .collect(Collectors.toMap(AnnouncerBuilderFactory::getName, AnnouncerBuilderFactory::getBuilder));

        Map<String, Announcer<?>> announcers = new TreeMap<>();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map\>'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/download/ArtifactDownloaders.java`
#### Snippet
```java

    public static <A extends org.jreleaser.model.api.download.Downloader, D extends Downloader<A>> ArtifactDownloader<A, D> findDownloader(JReleaserContext context, D downloader) {
        Map<String, ArtifactDownloader<?, ?>> downloaders = StreamSupport.stream(ServiceLoader.load(ArtifactDownloaderFactory.class,
                ArtifactDownloaders.class.getClassLoader()).spliterator(), false)
            .collect(Collectors.toMap(ArtifactDownloaderFactory::getName, factory -> factory.getArtifactDownloader(context)));

        if (downloaders.containsKey(downloader.getType())) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.stream.Collector' to 'java.util.stream.Collector\>\>'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/download/ArtifactDownloaders.java`
#### Snippet
```java
        Map<String, ArtifactDownloader<?, ?>> downloaders = StreamSupport.stream(ServiceLoader.load(ArtifactDownloaderFactory.class,
                ArtifactDownloaders.class.getClassLoader()).spliterator(), false)
            .collect(Collectors.toMap(ArtifactDownloaderFactory::getName, factory -> factory.getArtifactDownloader(context)));

        if (downloaders.containsKey(downloader.getType())) {
```

### UNCHECKED_WARNING
Unchecked call to 'setDownloader(D)' as a member of raw type 'org.jreleaser.model.spi.download.ArtifactDownloader'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/download/ArtifactDownloaders.java`
#### Snippet
```java
        if (downloaders.containsKey(downloader.getType())) {
            ArtifactDownloader artifactDownloader = downloaders.get(downloader.getType());
            artifactDownloader.setDownloader(downloader);
            return artifactDownloader;
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.jreleaser.model.spi.download.ArtifactDownloader' to 'org.jreleaser.model.spi.download.ArtifactDownloader'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/download/ArtifactDownloaders.java`
#### Snippet
```java
            ArtifactDownloader artifactDownloader = downloaders.get(downloader.getType());
            artifactDownloader.setDownloader(downloader);
            return artifactDownloader;
        }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.jreleaser.model.spi.packagers.PackagerProcessor' to 'org.jreleaser.model.spi.packagers.PackagerProcessor'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/distribution/PackagerProcessors.java`
#### Snippet
```java

        if (processors.containsKey(packager.getType())) {
            PackagerProcessor<T> packagerProcessor = processors.get(packager.getType());
            packagerProcessor.setPackager(packager);
            return packagerProcessor;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Set' to 'java.util.Set'
in `core/jreleaser-engine/src/main/java/org/jreleaser/extensions/internal/DefaultExtensionManager.java`
#### Snippet
```java
    @Override
    public <T extends ExtensionPoint> Set<T> findExtensionPoints(Class<T> extensionPointType) {
        return (Set<T>) extensionPoints.computeIfAbsent(extensionPointType.getName(), k -> {
            Set<T> set = new LinkedHashSet<>();

            for (ExtensionPoint extensionPoint : allExtensionPoints) {
                if (extensionPointType.isAssignableFrom(extensionPoint.getClass())) {
                    set.add((T) extensionPoint);
                }
            }

            return Collections.unmodifiableSet(set);
        });
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.extensions.api.ExtensionPoint' to 'T'
in `core/jreleaser-engine/src/main/java/org/jreleaser/extensions/internal/DefaultExtensionManager.java`
#### Snippet
```java
            for (ExtensionPoint extensionPoint : allExtensionPoints) {
                if (extensionPointType.isAssignableFrom(extensionPoint.getClass())) {
                    set.add((T) extensionPoint);
                }
            }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModelPrinter.java`
#### Snippet
```java
                    if (!((Map) value).isEmpty()) {
                        out.println(multiply("    ", offset) + key + ":");
                        doPrintMap((Map) value, offset + 1);
                    }
                } else if (value instanceof Collection) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModelPrinter.java`
#### Snippet
```java
    public void print(Object value, int offset) {
        if (value instanceof Map) {
            doPrintMap((Map<String, ?>) value, offset);
        } else if (value instanceof Collection) {
            doPrintCollection((Collection<?>) value, offset);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModelPrinter.java`
#### Snippet
```java
                if (value instanceof Map) {
                    if (!((Map) value).isEmpty()) {
                        doPrintMap((Map) value, offset);
                    }
                } else if (value instanceof Collection) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModelPrinter.java`
#### Snippet
```java
                if (value instanceof Map) {
                    if (!((Map) value).isEmpty()) {
                        doPrintMap((Map) value, offset);
                    }
                } else if (value instanceof Collection) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModelPrinter.java`
#### Snippet
```java
    private void doPrintMapEntry(String key, Object value, int offset) {
        if (value instanceof Map) {
            doPrintMap(key, (Map) value, offset);
        } else if (value instanceof Collection) {
            doPrintCollection(key, (Collection<?>) value, offset);
```

### UNCHECKED_WARNING
Unchecked call to 'merge(S)' as a member of raw type 'org.jreleaser.model.internal.packagers.Packagers'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModel.java`
#### Snippet
```java

    public void setPackagers(Packagers packagers) {
        this.packagers.merge(packagers);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map' to 'java.util.Map'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/deploy/maven/Maven.java`
#### Snippet
```java
        switch (deployerType) {
            case org.jreleaser.model.api.deploy.maven.ArtifactoryMavenDeployer.TYPE:
                return (Map<String, A>) artifactory;
            case org.jreleaser.model.api.deploy.maven.AzureMavenDeployer.TYPE:
                return (Map<String, A>) azure;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map' to 'java.util.Map'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/deploy/maven/Maven.java`
#### Snippet
```java
                return (Map<String, A>) artifactory;
            case org.jreleaser.model.api.deploy.maven.AzureMavenDeployer.TYPE:
                return (Map<String, A>) azure;
            case org.jreleaser.model.api.deploy.maven.GiteaMavenDeployer.TYPE:
                return (Map<String, A>) gitea;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map' to 'java.util.Map'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/deploy/maven/Maven.java`
#### Snippet
```java
                return (Map<String, A>) azure;
            case org.jreleaser.model.api.deploy.maven.GiteaMavenDeployer.TYPE:
                return (Map<String, A>) gitea;
            case org.jreleaser.model.api.deploy.maven.GithubMavenDeployer.TYPE:
                return (Map<String, A>) github;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map' to 'java.util.Map'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/deploy/maven/Maven.java`
#### Snippet
```java
                return (Map<String, A>) gitea;
            case org.jreleaser.model.api.deploy.maven.GithubMavenDeployer.TYPE:
                return (Map<String, A>) github;
            case org.jreleaser.model.api.deploy.maven.GitlabMavenDeployer.TYPE:
                return (Map<String, A>) gitlab;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map' to 'java.util.Map'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/deploy/maven/Maven.java`
#### Snippet
```java
                return (Map<String, A>) github;
            case org.jreleaser.model.api.deploy.maven.GitlabMavenDeployer.TYPE:
                return (Map<String, A>) gitlab;
            case org.jreleaser.model.api.deploy.maven.Nexus2MavenDeployer.TYPE:
                return (Map<String, A>) nexus2;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map' to 'java.util.Map'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/deploy/maven/Maven.java`
#### Snippet
```java
                return (Map<String, A>) gitlab;
            case org.jreleaser.model.api.deploy.maven.Nexus2MavenDeployer.TYPE:
                return (Map<String, A>) nexus2;
            default:
                return Collections.emptyMap();
```

### UNCHECKED_WARNING
Unchecked call to 'addAll(Collection)' as a member of raw type 'java.util.List'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/deploy/maven/Maven.java`
#### Snippet
```java
    public List<? extends MavenDeployer> getActiveDeployers() {
        List list = new ArrayList<>();
        list.addAll(getActiveArtifactories());
        list.addAll(getActiveAzures());
        list.addAll(getActiveGiteas());
```

### UNCHECKED_WARNING
Unchecked call to 'addAll(Collection)' as a member of raw type 'java.util.List'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/deploy/maven/Maven.java`
#### Snippet
```java
        List list = new ArrayList<>();
        list.addAll(getActiveArtifactories());
        list.addAll(getActiveAzures());
        list.addAll(getActiveGiteas());
        list.addAll(getActiveGithubs());
```

### UNCHECKED_WARNING
Unchecked call to 'addAll(Collection)' as a member of raw type 'java.util.List'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/deploy/maven/Maven.java`
#### Snippet
```java
        list.addAll(getActiveArtifactories());
        list.addAll(getActiveAzures());
        list.addAll(getActiveGiteas());
        list.addAll(getActiveGithubs());
        list.addAll(getActiveGitlabs());
```

### UNCHECKED_WARNING
Unchecked call to 'addAll(Collection)' as a member of raw type 'java.util.List'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/deploy/maven/Maven.java`
#### Snippet
```java
        list.addAll(getActiveAzures());
        list.addAll(getActiveGiteas());
        list.addAll(getActiveGithubs());
        list.addAll(getActiveGitlabs());
        list.addAll(getActiveNexus2s());
```

### UNCHECKED_WARNING
Unchecked call to 'addAll(Collection)' as a member of raw type 'java.util.List'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/deploy/maven/Maven.java`
#### Snippet
```java
        list.addAll(getActiveGiteas());
        list.addAll(getActiveGithubs());
        list.addAll(getActiveGitlabs());
        list.addAll(getActiveNexus2s());
        return list;
```

### UNCHECKED_WARNING
Unchecked call to 'addAll(Collection)' as a member of raw type 'java.util.List'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/deploy/maven/Maven.java`
#### Snippet
```java
        list.addAll(getActiveGithubs());
        list.addAll(getActiveGitlabs());
        list.addAll(getActiveNexus2s());
        return list;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/deploy/maven/Maven.java`
#### Snippet
```java
        list.addAll(getActiveGitlabs());
        list.addAll(getActiveNexus2s());
        return list;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.List' to 'java.util.List'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/deploy/maven/Maven.java`
#### Snippet
```java
    public <A extends MavenDeployer<?>> List<A> findAllActiveMavenDeployers() {
        List<A> deployers = new ArrayList<>();
        deployers.addAll((List<A>) getActiveArtifactories());
        deployers.addAll((List<A>) getActiveAzures());
        deployers.addAll((List<A>) getActiveGiteas());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.List' to 'java.util.List'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/deploy/maven/Maven.java`
#### Snippet
```java
        List<A> deployers = new ArrayList<>();
        deployers.addAll((List<A>) getActiveArtifactories());
        deployers.addAll((List<A>) getActiveAzures());
        deployers.addAll((List<A>) getActiveGiteas());
        deployers.addAll((List<A>) getActiveGithubs());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.List' to 'java.util.List'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/deploy/maven/Maven.java`
#### Snippet
```java
        deployers.addAll((List<A>) getActiveArtifactories());
        deployers.addAll((List<A>) getActiveAzures());
        deployers.addAll((List<A>) getActiveGiteas());
        deployers.addAll((List<A>) getActiveGithubs());
        deployers.addAll((List<A>) getActiveGitlabs());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.List' to 'java.util.List'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/deploy/maven/Maven.java`
#### Snippet
```java
        deployers.addAll((List<A>) getActiveAzures());
        deployers.addAll((List<A>) getActiveGiteas());
        deployers.addAll((List<A>) getActiveGithubs());
        deployers.addAll((List<A>) getActiveGitlabs());
        deployers.addAll((List<A>) getActiveNexus2s());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.List' to 'java.util.List'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/deploy/maven/Maven.java`
#### Snippet
```java
        deployers.addAll((List<A>) getActiveGiteas());
        deployers.addAll((List<A>) getActiveGithubs());
        deployers.addAll((List<A>) getActiveGitlabs());
        deployers.addAll((List<A>) getActiveNexus2s());
        return deployers;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.List' to 'java.util.List'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/deploy/maven/Maven.java`
#### Snippet
```java
        deployers.addAll((List<A>) getActiveGithubs());
        deployers.addAll((List<A>) getActiveGitlabs());
        deployers.addAll((List<A>) getActiveNexus2s());
        return deployers;
    }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/catalog/sbom/Sbom.java`
#### Snippet
```java
    public List<? extends SbomCataloger<?>> findAllActiveSbomCatalogers() {
        List list = new ArrayList<>();
        if (cyclonedx.isEnabled()) list.add(getCyclonedx());
        if (syft.isEnabled()) list.add(getSyft());
        return list;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/catalog/sbom/Sbom.java`
#### Snippet
```java
        List list = new ArrayList<>();
        if (cyclonedx.isEnabled()) list.add(getCyclonedx());
        if (syft.isEnabled()) list.add(getSyft());
        return list;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List\>'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/catalog/sbom/Sbom.java`
#### Snippet
```java
        if (cyclonedx.isEnabled()) list.add(getCyclonedx());
        if (syft.isEnabled()) list.add(getSyft());
        return list;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.catalog.sbom.CyclonedxSbomCataloger' to 'A'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/catalog/sbom/Sbom.java`
#### Snippet
```java
        switch (name.toLowerCase(Locale.ENGLISH).trim()) {
            case org.jreleaser.model.api.catalog.sbom.CyclonedxSbomCataloger.TYPE:
                return (A) getCyclonedx();
            case org.jreleaser.model.api.catalog.sbom.SyftSbomCataloger.TYPE:
                return (A) getSyft();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.catalog.sbom.SyftSbomCataloger' to 'A'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/catalog/sbom/Sbom.java`
#### Snippet
```java
                return (A) getCyclonedx();
            case org.jreleaser.model.api.catalog.sbom.SyftSbomCataloger.TYPE:
                return (A) getSyft();
            default:
                throw new JReleaserException(RB.$("ERROR_unsupported_cataloger", name));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map' to 'java.util.Map'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/Upload.java`
#### Snippet
```java
        switch (uploaderType) {
            case org.jreleaser.model.api.upload.ArtifactoryUploader.TYPE:
                return (Map<String, A>) artifactory;
            case org.jreleaser.model.api.upload.FtpUploader.TYPE:
                return (Map<String, A>) ftp;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map' to 'java.util.Map'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/Upload.java`
#### Snippet
```java
                return (Map<String, A>) artifactory;
            case org.jreleaser.model.api.upload.FtpUploader.TYPE:
                return (Map<String, A>) ftp;
            case org.jreleaser.model.api.upload.GiteaUploader.TYPE:
                return (Map<String, A>) gitea;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map' to 'java.util.Map'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/Upload.java`
#### Snippet
```java
                return (Map<String, A>) ftp;
            case org.jreleaser.model.api.upload.GiteaUploader.TYPE:
                return (Map<String, A>) gitea;
            case org.jreleaser.model.api.upload.GitlabUploader.TYPE:
                return (Map<String, A>) gitlab;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map' to 'java.util.Map'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/Upload.java`
#### Snippet
```java
                return (Map<String, A>) gitea;
            case org.jreleaser.model.api.upload.GitlabUploader.TYPE:
                return (Map<String, A>) gitlab;
            case org.jreleaser.model.api.upload.HttpUploader.TYPE:
                return (Map<String, A>) http;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map' to 'java.util.Map'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/Upload.java`
#### Snippet
```java
                return (Map<String, A>) gitlab;
            case org.jreleaser.model.api.upload.HttpUploader.TYPE:
                return (Map<String, A>) http;
            case org.jreleaser.model.api.upload.S3Uploader.TYPE:
                return (Map<String, A>) s3;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map' to 'java.util.Map'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/Upload.java`
#### Snippet
```java
                return (Map<String, A>) http;
            case org.jreleaser.model.api.upload.S3Uploader.TYPE:
                return (Map<String, A>) s3;
            case org.jreleaser.model.api.upload.ScpUploader.TYPE:
                return (Map<String, A>) scp;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map' to 'java.util.Map'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/Upload.java`
#### Snippet
```java
                return (Map<String, A>) s3;
            case org.jreleaser.model.api.upload.ScpUploader.TYPE:
                return (Map<String, A>) scp;
            case org.jreleaser.model.api.upload.SftpUploader.TYPE:
                return (Map<String, A>) sftp;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map' to 'java.util.Map'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/Upload.java`
#### Snippet
```java
                return (Map<String, A>) scp;
            case org.jreleaser.model.api.upload.SftpUploader.TYPE:
                return (Map<String, A>) sftp;
            default:
                return Collections.emptyMap();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.List' to 'java.util.List'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/Upload.java`
#### Snippet
```java
    public <A extends Uploader<?>> List<A> findAllActiveUploaders() {
        List<A> uploaders = new ArrayList<>();
        uploaders.addAll((List<A>) getActiveArtifactories());
        uploaders.addAll((List<A>) getActiveFtps());
        uploaders.addAll((List<A>) getActiveGiteas());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.List' to 'java.util.List'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/Upload.java`
#### Snippet
```java
        List<A> uploaders = new ArrayList<>();
        uploaders.addAll((List<A>) getActiveArtifactories());
        uploaders.addAll((List<A>) getActiveFtps());
        uploaders.addAll((List<A>) getActiveGiteas());
        uploaders.addAll((List<A>) getActiveGitlabs());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.List' to 'java.util.List'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/Upload.java`
#### Snippet
```java
        uploaders.addAll((List<A>) getActiveArtifactories());
        uploaders.addAll((List<A>) getActiveFtps());
        uploaders.addAll((List<A>) getActiveGiteas());
        uploaders.addAll((List<A>) getActiveGitlabs());
        uploaders.addAll((List<A>) getActiveHttps());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.List' to 'java.util.List'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/Upload.java`
#### Snippet
```java
        uploaders.addAll((List<A>) getActiveFtps());
        uploaders.addAll((List<A>) getActiveGiteas());
        uploaders.addAll((List<A>) getActiveGitlabs());
        uploaders.addAll((List<A>) getActiveHttps());
        uploaders.addAll((List<A>) getActiveS3s());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.List' to 'java.util.List'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/Upload.java`
#### Snippet
```java
        uploaders.addAll((List<A>) getActiveGiteas());
        uploaders.addAll((List<A>) getActiveGitlabs());
        uploaders.addAll((List<A>) getActiveHttps());
        uploaders.addAll((List<A>) getActiveS3s());
        uploaders.addAll((List<A>) getActiveScps());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.List' to 'java.util.List'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/Upload.java`
#### Snippet
```java
        uploaders.addAll((List<A>) getActiveGitlabs());
        uploaders.addAll((List<A>) getActiveHttps());
        uploaders.addAll((List<A>) getActiveS3s());
        uploaders.addAll((List<A>) getActiveScps());
        uploaders.addAll((List<A>) getActiveSftps());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.List' to 'java.util.List'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/Upload.java`
#### Snippet
```java
        uploaders.addAll((List<A>) getActiveHttps());
        uploaders.addAll((List<A>) getActiveS3s());
        uploaders.addAll((List<A>) getActiveScps());
        uploaders.addAll((List<A>) getActiveSftps());
        return uploaders;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.List' to 'java.util.List'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/Upload.java`
#### Snippet
```java
        uploaders.addAll((List<A>) getActiveS3s());
        uploaders.addAll((List<A>) getActiveScps());
        uploaders.addAll((List<A>) getActiveSftps());
        return uploaders;
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.announce.ArticleAnnouncer' to 'A'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
        switch (name.toLowerCase(Locale.ENGLISH).trim()) {
            case org.jreleaser.model.api.announce.ArticleAnnouncer.TYPE:
                return (A) getArticle();
            case org.jreleaser.model.api.announce.BlueskyAnnouncer.TYPE:
                return (A) getBluesky();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.announce.BlueskyAnnouncer' to 'A'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
                return (A) getArticle();
            case org.jreleaser.model.api.announce.BlueskyAnnouncer.TYPE:
                return (A) getBluesky();
            case org.jreleaser.model.api.announce.DiscordAnnouncer.TYPE:
                return (A) getDiscord();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.announce.DiscordAnnouncer' to 'A'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
                return (A) getBluesky();
            case org.jreleaser.model.api.announce.DiscordAnnouncer.TYPE:
                return (A) getDiscord();
            case org.jreleaser.model.api.announce.DiscourseAnnouncer.TYPE:
                return (A) getDiscourse();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.announce.DiscourseAnnouncer' to 'A'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
                return (A) getDiscord();
            case org.jreleaser.model.api.announce.DiscourseAnnouncer.TYPE:
                return (A) getDiscourse();
            case org.jreleaser.model.api.announce.DiscussionsAnnouncer.TYPE:
                return (A) getDiscussions();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.announce.DiscussionsAnnouncer' to 'A'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
                return (A) getDiscourse();
            case org.jreleaser.model.api.announce.DiscussionsAnnouncer.TYPE:
                return (A) getDiscussions();
            case org.jreleaser.model.api.announce.GitterAnnouncer.TYPE:
                return (A) getGitter();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.announce.GitterAnnouncer' to 'A'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
                return (A) getDiscussions();
            case org.jreleaser.model.api.announce.GitterAnnouncer.TYPE:
                return (A) getGitter();
            case org.jreleaser.model.api.announce.GoogleChatAnnouncer.TYPE:
                return (A) getGoogleChat();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.announce.GoogleChatAnnouncer' to 'A'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
                return (A) getGitter();
            case org.jreleaser.model.api.announce.GoogleChatAnnouncer.TYPE:
                return (A) getGoogleChat();
            case org.jreleaser.model.api.announce.LinkedinAnnouncer.TYPE:
                return (A) getLinkedin();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.announce.LinkedinAnnouncer' to 'A'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
                return (A) getGoogleChat();
            case org.jreleaser.model.api.announce.LinkedinAnnouncer.TYPE:
                return (A) getLinkedin();
            case org.jreleaser.model.api.announce.HttpAnnouncers.TYPE:
                return (A) getConfiguredHttp();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.announce.HttpAnnouncers' to 'A'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
                return (A) getLinkedin();
            case org.jreleaser.model.api.announce.HttpAnnouncers.TYPE:
                return (A) getConfiguredHttp();
            case org.jreleaser.model.api.announce.SmtpAnnouncer.TYPE:
            case org.jreleaser.model.api.announce.SmtpAnnouncer.TYPE_LEGACY:
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.announce.SmtpAnnouncer' to 'A'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
            case org.jreleaser.model.api.announce.SmtpAnnouncer.TYPE:
            case org.jreleaser.model.api.announce.SmtpAnnouncer.TYPE_LEGACY:
                return (A) getSmtp();
            case org.jreleaser.model.api.announce.MastodonAnnouncer.TYPE:
                return (A) getMastodon();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.announce.MastodonAnnouncer' to 'A'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
                return (A) getSmtp();
            case org.jreleaser.model.api.announce.MastodonAnnouncer.TYPE:
                return (A) getMastodon();
            case org.jreleaser.model.api.announce.MattermostAnnouncer.TYPE:
                return (A) getMattermost();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.announce.MattermostAnnouncer' to 'A'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
                return (A) getMastodon();
            case org.jreleaser.model.api.announce.MattermostAnnouncer.TYPE:
                return (A) getMattermost();
            case org.jreleaser.model.api.announce.OpenCollectiveAnnouncer.TYPE:
                return (A) getOpenCollective();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.announce.OpenCollectiveAnnouncer' to 'A'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
                return (A) getMattermost();
            case org.jreleaser.model.api.announce.OpenCollectiveAnnouncer.TYPE:
                return (A) getOpenCollective();
            case org.jreleaser.model.api.announce.SdkmanAnnouncer.TYPE:
                return (A) getSdkman();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.announce.SdkmanAnnouncer' to 'A'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
                return (A) getOpenCollective();
            case org.jreleaser.model.api.announce.SdkmanAnnouncer.TYPE:
                return (A) getSdkman();
            case org.jreleaser.model.api.announce.SlackAnnouncer.TYPE:
                return (A) getSlack();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.announce.SlackAnnouncer' to 'A'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
                return (A) getSdkman();
            case org.jreleaser.model.api.announce.SlackAnnouncer.TYPE:
                return (A) getSlack();
            case org.jreleaser.model.api.announce.TeamsAnnouncer.TYPE:
                return (A) getTeams();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.announce.TeamsAnnouncer' to 'A'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
                return (A) getSlack();
            case org.jreleaser.model.api.announce.TeamsAnnouncer.TYPE:
                return (A) getTeams();
            case org.jreleaser.model.api.announce.TelegramAnnouncer.TYPE:
                return (A) getTelegram();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.announce.TelegramAnnouncer' to 'A'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
                return (A) getTeams();
            case org.jreleaser.model.api.announce.TelegramAnnouncer.TYPE:
                return (A) getTelegram();
            case org.jreleaser.model.api.announce.TwitterAnnouncer.TYPE:
                return (A) getTwitter();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.announce.TwitterAnnouncer' to 'A'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
                return (A) getTelegram();
            case org.jreleaser.model.api.announce.TwitterAnnouncer.TYPE:
                return (A) getTwitter();
            case org.jreleaser.model.api.announce.WebhooksAnnouncer.TYPE:
                return (A) getConfiguredWebhooks();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.announce.WebhooksAnnouncer' to 'A'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
                return (A) getTwitter();
            case org.jreleaser.model.api.announce.WebhooksAnnouncer.TYPE:
                return (A) getConfiguredWebhooks();
            case org.jreleaser.model.api.announce.ZulipAnnouncer.TYPE:
                return (A) getZulip();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.announce.ZulipAnnouncer' to 'A'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
                return (A) getConfiguredWebhooks();
            case org.jreleaser.model.api.announce.ZulipAnnouncer.TYPE:
                return (A) getZulip();
            default:
                throw new JReleaserException(RB.$("ERROR_unsupported_announcer", name));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.List' to 'java.util.List'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/Assemble.java`
#### Snippet
```java
    public <A extends Assembler<?>> Collection<A> findAllAssemblers() {
        List<A> assemblers = new ArrayList<>();
        assemblers.addAll((List<A>) getActiveArchives());
        assemblers.addAll((List<A>) getActiveJavaArchives());
        assemblers.addAll((List<A>) getActiveJlinks());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.List' to 'java.util.List'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/Assemble.java`
#### Snippet
```java
        List<A> assemblers = new ArrayList<>();
        assemblers.addAll((List<A>) getActiveArchives());
        assemblers.addAll((List<A>) getActiveJavaArchives());
        assemblers.addAll((List<A>) getActiveJlinks());
        assemblers.addAll((List<A>) getActiveJpackages());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.List' to 'java.util.List'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/Assemble.java`
#### Snippet
```java
        assemblers.addAll((List<A>) getActiveArchives());
        assemblers.addAll((List<A>) getActiveJavaArchives());
        assemblers.addAll((List<A>) getActiveJlinks());
        assemblers.addAll((List<A>) getActiveJpackages());
        assemblers.addAll((List<A>) getActiveNativeImages());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.List' to 'java.util.List'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/Assemble.java`
#### Snippet
```java
        assemblers.addAll((List<A>) getActiveJavaArchives());
        assemblers.addAll((List<A>) getActiveJlinks());
        assemblers.addAll((List<A>) getActiveJpackages());
        assemblers.addAll((List<A>) getActiveNativeImages());
        return assemblers;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.List' to 'java.util.List'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/Assemble.java`
#### Snippet
```java
        assemblers.addAll((List<A>) getActiveJlinks());
        assemblers.addAll((List<A>) getActiveJpackages());
        assemblers.addAll((List<A>) getActiveNativeImages());
        return assemblers;
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map' to 'java.util.Map'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/Assemble.java`
#### Snippet
```java
        switch (assemblerName) {
            case org.jreleaser.model.api.assemble.ArchiveAssembler.TYPE:
                return (Map<String, A>) archive;
            case org.jreleaser.model.api.assemble.JavaArchiveAssembler.TYPE:
                return (Map<String, A>) javaArchive;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map' to 'java.util.Map'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/Assemble.java`
#### Snippet
```java
                return (Map<String, A>) archive;
            case org.jreleaser.model.api.assemble.JavaArchiveAssembler.TYPE:
                return (Map<String, A>) javaArchive;
            case org.jreleaser.model.api.assemble.JlinkAssembler.TYPE:
                return (Map<String, A>) jlink;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map' to 'java.util.Map'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/Assemble.java`
#### Snippet
```java
                return (Map<String, A>) javaArchive;
            case org.jreleaser.model.api.assemble.JlinkAssembler.TYPE:
                return (Map<String, A>) jlink;
            case org.jreleaser.model.api.assemble.JpackageAssembler.TYPE:
                return (Map<String, A>) jpackage;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map' to 'java.util.Map'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/Assemble.java`
#### Snippet
```java
                return (Map<String, A>) jlink;
            case org.jreleaser.model.api.assemble.JpackageAssembler.TYPE:
                return (Map<String, A>) jpackage;
            case org.jreleaser.model.api.assemble.NativeImageAssembler.TYPE:
                return (Map<String, A>) nativeImage;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map' to 'java.util.Map'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/Assemble.java`
#### Snippet
```java
                return (Map<String, A>) jpackage;
            case org.jreleaser.model.api.assemble.NativeImageAssembler.TYPE:
                return (Map<String, A>) nativeImage;
            default:
                return Collections.emptyMap();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.List' to 'java.util.List'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/download/Download.java`
#### Snippet
```java
    public <A extends Downloader<?>> List<A> findAllActiveDownloaders() {
        List<A> downloaders = new ArrayList<>();
        downloaders.addAll((List<A>) getActiveFtps());
        downloaders.addAll((List<A>) getActiveHttps());
        downloaders.addAll((List<A>) getActiveScps());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.List' to 'java.util.List'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/download/Download.java`
#### Snippet
```java
        List<A> downloaders = new ArrayList<>();
        downloaders.addAll((List<A>) getActiveFtps());
        downloaders.addAll((List<A>) getActiveHttps());
        downloaders.addAll((List<A>) getActiveScps());
        downloaders.addAll((List<A>) getActiveSftps());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.List' to 'java.util.List'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/download/Download.java`
#### Snippet
```java
        downloaders.addAll((List<A>) getActiveFtps());
        downloaders.addAll((List<A>) getActiveHttps());
        downloaders.addAll((List<A>) getActiveScps());
        downloaders.addAll((List<A>) getActiveSftps());
        return downloaders;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.List' to 'java.util.List'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/download/Download.java`
#### Snippet
```java
        downloaders.addAll((List<A>) getActiveHttps());
        downloaders.addAll((List<A>) getActiveScps());
        downloaders.addAll((List<A>) getActiveSftps());
        return downloaders;
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map' to 'java.util.Map'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/download/Download.java`
#### Snippet
```java
        switch (downloaderType) {
            case org.jreleaser.model.api.download.FtpDownloader.TYPE:
                return (Map<String, A>) ftp;
            case org.jreleaser.model.api.download.HttpDownloader.TYPE:
                return (Map<String, A>) http;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map' to 'java.util.Map'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/download/Download.java`
#### Snippet
```java
                return (Map<String, A>) ftp;
            case org.jreleaser.model.api.download.HttpDownloader.TYPE:
                return (Map<String, A>) http;
            case org.jreleaser.model.api.download.ScpDownloader.TYPE:
                return (Map<String, A>) scp;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map' to 'java.util.Map'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/download/Download.java`
#### Snippet
```java
                return (Map<String, A>) http;
            case org.jreleaser.model.api.download.ScpDownloader.TYPE:
                return (Map<String, A>) scp;
            case org.jreleaser.model.api.download.SftpDownloader.TYPE:
                return (Map<String, A>) sftp;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Map' to 'java.util.Map'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/download/Download.java`
#### Snippet
```java
                return (Map<String, A>) scp;
            case org.jreleaser.model.api.download.SftpDownloader.TYPE:
                return (Map<String, A>) sftp;
            default:
                return Collections.emptyMap();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.packagers.AppImagePackager' to 'T'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
        switch (name.toLowerCase(Locale.ENGLISH).trim()) {
            case org.jreleaser.model.api.packagers.AppImagePackager.TYPE:
                return (T) getAppImage();
            case org.jreleaser.model.api.packagers.AsdfPackager.TYPE:
                return (T) getAsdf();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.packagers.AsdfPackager' to 'T'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
                return (T) getAppImage();
            case org.jreleaser.model.api.packagers.AsdfPackager.TYPE:
                return (T) getAsdf();
            case org.jreleaser.model.api.packagers.BrewPackager.TYPE:
                return (T) getBrew();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.packagers.BrewPackager' to 'T'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
                return (T) getAsdf();
            case org.jreleaser.model.api.packagers.BrewPackager.TYPE:
                return (T) getBrew();
            case org.jreleaser.model.api.packagers.ChocolateyPackager.TYPE:
                return (T) getChocolatey();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.packagers.ChocolateyPackager' to 'T'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
                return (T) getBrew();
            case org.jreleaser.model.api.packagers.ChocolateyPackager.TYPE:
                return (T) getChocolatey();
            case org.jreleaser.model.api.packagers.DockerConfiguration.TYPE:
                return (T) getDocker();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.packagers.DockerPackager' to 'T'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
                return (T) getChocolatey();
            case org.jreleaser.model.api.packagers.DockerConfiguration.TYPE:
                return (T) getDocker();
            case org.jreleaser.model.api.packagers.FlatpakPackager.TYPE:
                return (T) getFlatpak();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.packagers.FlatpakPackager' to 'T'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
                return (T) getDocker();
            case org.jreleaser.model.api.packagers.FlatpakPackager.TYPE:
                return (T) getFlatpak();
            case org.jreleaser.model.api.packagers.GofishPackager.TYPE:
                return (T) getGofish();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.packagers.GofishPackager' to 'T'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
                return (T) getFlatpak();
            case org.jreleaser.model.api.packagers.GofishPackager.TYPE:
                return (T) getGofish();
            case org.jreleaser.model.api.packagers.JbangPackager.TYPE:
                return (T) getJbang();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.packagers.JbangPackager' to 'T'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
                return (T) getGofish();
            case org.jreleaser.model.api.packagers.JbangPackager.TYPE:
                return (T) getJbang();
            case org.jreleaser.model.api.packagers.JibConfiguration.TYPE:
                return (T) getJib();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.packagers.JibPackager' to 'T'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
                return (T) getJbang();
            case org.jreleaser.model.api.packagers.JibConfiguration.TYPE:
                return (T) getJib();
            case org.jreleaser.model.api.packagers.MacportsPackager.TYPE:
                return (T) getMacports();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.packagers.MacportsPackager' to 'T'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
                return (T) getJib();
            case org.jreleaser.model.api.packagers.MacportsPackager.TYPE:
                return (T) getMacports();
            case org.jreleaser.model.api.packagers.ScoopPackager.TYPE:
                return (T) getScoop();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.packagers.ScoopPackager' to 'T'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
                return (T) getMacports();
            case org.jreleaser.model.api.packagers.ScoopPackager.TYPE:
                return (T) getScoop();
            case org.jreleaser.model.api.packagers.SdkmanPackager.TYPE:
                return (T) getSdkman();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.packagers.SdkmanPackager' to 'T'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
                return (T) getScoop();
            case org.jreleaser.model.api.packagers.SdkmanPackager.TYPE:
                return (T) getSdkman();
            case org.jreleaser.model.api.packagers.SnapPackager.TYPE:
                return (T) getSnap();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.packagers.SnapPackager' to 'T'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
                return (T) getSdkman();
            case org.jreleaser.model.api.packagers.SnapPackager.TYPE:
                return (T) getSnap();
            case org.jreleaser.model.api.packagers.SpecPackager.TYPE:
                return (T) getSpec();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.packagers.SpecPackager' to 'T'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
                return (T) getSnap();
            case org.jreleaser.model.api.packagers.SpecPackager.TYPE:
                return (T) getSpec();
            case org.jreleaser.model.api.packagers.WingetPackager.TYPE:
                return (T) getWinget();
```

### UNCHECKED_WARNING
Unchecked cast: 'org.jreleaser.model.internal.packagers.WingetPackager' to 'T'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
                return (T) getSpec();
            case org.jreleaser.model.api.packagers.WingetPackager.TYPE:
                return (T) getWinget();
            default:
                throw new JReleaserException(RB.$("ERROR_unsupported_packager", name));
```

### UNCHECKED_WARNING
Unchecked call to 'compareTo(T)' as a member of raw type 'java.lang.Comparable'
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/ChangelogGenerator.java`
#### Snippet
```java
            Version v1 = version(context, tag1, versionPattern);
            Version v2 = version(context, tag2, versionPattern);
            return v2.compareTo(v1);
        });

```

### UNCHECKED_WARNING
Unchecked call to 'equalsSpec(T)' as a member of raw type 'org.jreleaser.version.Version'
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/ChangelogGenerator.java`
#### Snippet
```java
                            .filter(ref -> !extractTagName(ref).equals(effectiveTagName))
                            .filter(ref -> versionPattern.matcher(extractTagName(ref)).matches())
                            .filter(ref -> currentVersion.equalsSpec(version(context, ref, versionPattern, true)))
                            .filter(ref -> !defaultVersion.equals(version(context, ref, versionPattern, true)))
                            .findFirst();
```

### UNCHECKED_WARNING
Unchecked method 'lessThan(T, T)' invocation
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/ChangelogGenerator.java`
#### Snippet
```java
                        .filter(ref -> extractTagName(ref).matches(tagPattern))
                        .filter(ref -> !defaultVersion.equals(version(context, ref, versionPattern, true)))
                        .filter(ref -> lessThan(version(context, ref, versionPattern, true), currentVersion))
                        .findFirst();

```

### UNCHECKED_WARNING
Unchecked call to 'equalsSpec(T)' as a member of raw type 'org.jreleaser.version.Version'
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/ChangelogGenerator.java`
#### Snippet
```java
                    .filter(ref -> !extractTagName(ref).equals(effectiveTagName))
                    .filter(ref -> versionPattern.matcher(extractTagName(ref)).matches())
                    .filter(ref -> currentVersion.equalsSpec(version(context, ref, versionPattern, true)))
                    .filter(ref -> !defaultVersion.equals(version(context, ref, versionPattern, true)))
                    .findFirst();
```

### UNCHECKED_WARNING
Unchecked method 'lessThan(T, T)' invocation
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/ChangelogGenerator.java`
#### Snippet
```java
                .filter(ref -> extractTagName(ref).matches(tagPattern))
                .filter(ref -> !defaultVersion.equals(version(context, ref, versionPattern, true)))
                .filter(ref -> lessThan(version(context, ref, versionPattern, true), currentVersion))
                .findFirst();
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `sdks/jreleaser-gitea-java-sdk/src/main/java/org/jreleaser/sdk/gitea/Gitea.java`
#### Snippet
```java
        logger.debug(RB.$("git.user.lookup"), name, email);

        GtSearchUser search = api.searchUser(CollectionUtils.<String, String>mapOf("q", email));
        if (null != search.getData() && !search.getData().isEmpty()) {
            GtUser user = search.getData().get(0);
```

### UNCHECKED_WARNING
Unchecked call to 'compareTo(T)' as a member of raw type 'java.lang.Comparable'
in `sdks/jreleaser-gitea-java-sdk/src/main/java/org/jreleaser/sdk/gitea/GiteaReleaser.java`
#### Snippet
```java
        }

        releases.sort((r1, r2) -> r2.getVersion().compareTo(r1.getVersion()));

        return releases;
```

### UNCHECKED_WARNING
Unchecked call to 'compareTo(T)' as a member of raw type 'java.lang.Comparable'
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/GithubReleaser.java`
#### Snippet
```java
        }

        releases.sort((r1, r2) -> r2.getVersion().compareTo(r1.getVersion()));

        return releases;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
        logger.debug(RB.$("git.user.lookup"), name, email);

        List<GlUser> users = api.searchUser(CollectionUtils.<String, String>mapOf("scope", "users", "search", email));
        if (null != users && !users.isEmpty()) {
            GlUser user = users.get(0);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
        logger.debug(RB.$("git.user.lookup"), name, email);

        List<GlUser> users = api.searchUser(CollectionUtils.<String, String>mapOf("scope", "users", "search", email));
        if (null != users && !users.isEmpty()) {
            GlUser user = users.get(0);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
        }

        users = api.searchUser(CollectionUtils.<String, String>mapOf("scope", "users", "search", name));
        if (null != users && !users.isEmpty()) {
            GlUser user = users.get(0);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
        }

        users = api.searchUser(CollectionUtils.<String, String>mapOf("scope", "users", "search", name));
        if (null != users && !users.isEmpty()) {
            GlUser user = users.get(0);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java

        Map<String, Object> params = new LinkedHashMap<>();
        List<String> list = (List<String>) params.computeIfAbsent("labels", k -> new ArrayList<>());
        list.addAll(issue.getLabels());
        list.add(label.getName());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/Github.java`
#### Snippet
```java
        }

        GhSearchUser search = api.searchUser(CollectionUtils.<String, String>mapOf("q", email));
        if (search.getTotalCount() > 0) {
            GhUser user = search.getItems().get(0);
```

### UNCHECKED_WARNING
Unchecked call to 'compareTo(T)' as a member of raw type 'java.lang.Comparable'
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/GitlabReleaser.java`
#### Snippet
```java
        }

        releases.sort((r1, r2) -> r2.getVersion().compareTo(r1.getVersion()));

        return releases;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Collection\>' to 'java.util.List'
in `sdks/jreleaser-twitter-java-sdk/src/main/java/org/jreleaser/sdk/twitter/UpdateStatusTwitterCommand.java`
#### Snippet
```java

        public Builder statuses(List<String> statuses) {
            this.statuses = (List<String>) requireNonEmpty(statuses, "'statuses' must not be empty");
            return this;
        }
```

### UNCHECKED_WARNING
Unchecked call to 'compareTo(T)' as a member of raw type 'java.lang.Comparable'
in `sdks/jreleaser-codeberg-java-sdk/src/main/java/org/jreleaser/sdk/codeberg/CodebergReleaser.java`
#### Snippet
```java
        }

        releases.sort((r1, r2) -> r2.getVersion().compareTo(r1.getVersion()));

        return releases;
```

## RuleId[id=MagicConstant]
### MagicConstant
Should be one of: ZipEntry.STORED, ZipEntry.DEFLATED
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
                if (null != fileTime) archiveEntry.setTime(fileTime);

                archiveEntry.setMethod(ZipOutputStream.DEFLATED);
                if (inputFile.isFile() && Files.isExecutable(path)) {
                    archiveEntry.setUnixMode(0100755);
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `fileType` might be null
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
        try (InputStream fi = Files.newInputStream(src);
             InputStream bi = new BufferedInputStream(fi);
             InputStream gzi = resolveCompressorInputStream(fileType, bi);
             ArchiveInputStream in = new TarArchiveInputStream(gzi)) {
            return inspectArchive(in);
```

### DataFlowIssue
Argument `fileType` might be null
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
        try (InputStream fi = Files.newInputStream(src);
             InputStream bi = new BufferedInputStream(fi);
             InputStream gzi = resolveCompressorInputStream(fileType, bi);
             ArchiveInputStream in = new TarArchiveInputStream(gzi)) {
            return resolveRootEntryName(in);
```

### DataFlowIssue
Argument `fileType` might be null
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
        try (InputStream fi = Files.newInputStream(src);
             InputStream bi = new BufferedInputStream(fi);
             InputStream gzi = resolveCompressorInputStream(fileType, bi);
             ArchiveInputStream in = new TarArchiveInputStream(gzi)) {
            unpackArchive(removeRootEntry ? artifactFileName + "/" : "", destinationDir, in);
```

### DataFlowIssue
Dereference of `inputDirectoryFile.listFiles()` may produce `NullPointerException`
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/templates/TemplateEvaluator.java`
#### Snippet
```java
        try {
            File inputDirectoryFile = inputDirectory.toFile();
            if (null == inputDirectoryFile.listFiles() || inputDirectoryFile.listFiles().length == 0) {
                throw fail(RB.$("validation_directory_is_empty", "inputDirectory", inputDirectory));
            }
```

### DataFlowIssue
Method invocation `extension` may produce `NullPointerException`
in `core/jreleaser-engine/src/main/java/org/jreleaser/assemblers/NativeImageAssemblerProcessor.java`
#### Snippet
```java
            Archive.Format archiveFormat = Archive.Format.of(str);

            Path imageArchive = assembleDirectory.resolve(finalImageName + "." + archiveFormat.extension());
            FileUtils.packArchive(tempDirectory, imageArchive, assembler.getOptions().toOptions());

```

### DataFlowIssue
Dereference of `templateDirectoryFile.listFiles()` may produce `NullPointerException`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/ArticleAnnouncerValidator.java`
#### Snippet
```java
        }

        if (null == templateDirectoryFile.listFiles() || templateDirectoryFile.listFiles().length == 0) {
            errors.configuration(RB.$("validation_directory_is_empty", "announce.article.templateDirectory", announcer.getTemplateDirectory()));
        }
```

### DataFlowIssue
Method invocation `extension` may produce `NullPointerException`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/assemble/NativeImageAssemblerResolver.java`
#### Snippet
```java

            Path image = baseOutputDirectory
                .resolve(imageName + "-" + platformReplaced + "." + archiveFormat.extension())
                .toAbsolutePath();

```

### DataFlowIssue
Method invocation `extension` may produce `NullPointerException`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/assemble/JlinkAssemblerResolver.java`
#### Snippet
```java

            Path image = baseOutputDirectory
                .resolve(imageName + "-" + platformReplaced + "." + archiveFormat.extension())
                .toAbsolutePath();

```

### DataFlowIssue
Method invocation `storeFile` may produce `NullPointerException`
in `sdks/jreleaser-ftp-java-sdk/src/main/java/org/jreleaser/sdk/ftp/FtpArtifactUploader.java`
#### Snippet
```java
                        String uploadPath = uploader.getResolvedPath(context, artifact);
                        context.getLogger().debug("   " + RB.$("uploader.uploading.to", uploadPath));
                        ftp.storeFile(uploadPath, in);
                    } catch (IOException e) {
                        context.getLogger().trace(e);
```

### DataFlowIssue
Argument `basedir` might be null
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/GitSdk.java`
#### Snippet
```java
        }

        throw new RepositoryNotFoundException(basedir);
    }

```

### DataFlowIssue
Dereference of `assets.toFile().listFiles()` may produce `NullPointerException`
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/release/AbstractReleaserBuilder.java`
#### Snippet
```java
    public ReleaserBuilder<R> addReleaseAssets(Path assets) {
        if (assets.toFile().exists()) {
            for (File asset : assets.toFile().listFiles()) {
                addReleaseAsset(Asset.file(Artifact.of(asset.toPath().toAbsolutePath())));
            }
```

### DataFlowIssue
Argument `ssh` might be null
in `sdks/jreleaser-ssh-java-sdk/src/main/java/org/jreleaser/sdk/ssh/ScpArtifactUploader.java`
#### Snippet
```java
                        String uploadPath = uploader.getResolvedPath(context, artifact);
                        context.getLogger().debug("   " + RB.$("uploader.uploading.to", uploadPath));
                        createDirectories(context, uploader, ssh, Paths.get(uploadPath).getParent());
                        ssh.newSCPFileTransfer().upload(path.toAbsolutePath().toString(), uploadPath);
                    } catch (IOException e) {
```

### DataFlowIssue
Argument `ssh` might be null
in `sdks/jreleaser-ssh-java-sdk/src/main/java/org/jreleaser/sdk/ssh/SftpArtifactUploader.java`
#### Snippet
```java
                        String uploadPath = uploader.getResolvedPath(context, artifact);
                        context.getLogger().debug("   " + RB.$("uploader.uploading.to", uploadPath));
                        createDirectories(context, uploader, ssh, Paths.get(uploadPath).getParent());
                        sftp.put(path.toAbsolutePath().toString(), uploadPath);
                    } catch (IOException e) {
```

### DataFlowIssue
Method invocation `put` may produce `NullPointerException`
in `sdks/jreleaser-ssh-java-sdk/src/main/java/org/jreleaser/sdk/ssh/SftpArtifactUploader.java`
#### Snippet
```java
                        context.getLogger().debug("   " + RB.$("uploader.uploading.to", uploadPath));
                        createDirectories(context, uploader, ssh, Paths.get(uploadPath).getParent());
                        sftp.put(path.toAbsolutePath().toString(), uploadPath);
                    } catch (IOException e) {
                        context.getLogger().trace(e);
```

### DataFlowIssue
Method invocation `urn` may produce `NullPointerException`
in `sdks/jreleaser-linkedin-java-sdk/src/main/java/org/jreleaser/sdk/linkedin/LinkedinSdk.java`
#### Snippet
```java
        } else {
            Profile profile = wrap(api::getProfile);
            text = text.replace("{{" + KEY_LINKEDIN_OWNER + "}}", profile.urn());
        }

```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (4 lines)
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/distributions/DistributionsValidator.java`
#### Snippet
```java
        boolean valid = true;
        // TODO: activate in 2.0.0
        // if (isBlank(distribution.getJava().getVersion())) {
        //     errors.warning(RB.$("validation_is_missing", "distribution." + distribution.getName() + ".java.version"));
        //     valid = false;
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'getDocsUrl' is still used
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/project/Project.java`
#### Snippet
```java
    @Deprecated
    @JsonPropertyDescription("project.docsUrl is deprecated since 1.2.0 and will be removed in 2.0.0. Use project.links.documentation instead")
    public String getDocsUrl() {
        return links.getDocumentation();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getLicenseUrl' is still used
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/project/Project.java`
#### Snippet
```java
    @Deprecated
    @JsonPropertyDescription("project.licenseUrl is deprecated since 1.2.0 and will be removed in 2.0.0. Use project.links.license instead")
    public String getLicenseUrl() {
        return links.getLicense();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getWebsite' is still used
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/project/Project.java`
#### Snippet
```java
    @Deprecated
    @JsonPropertyDescription("project.website is deprecated since 1.2.0 and will be removed in 2.0.0. Use project.links.homepage instead")
    public String getWebsite() {
        return links.getHomepage();
    }
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\-` in RegExp
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaRuntimeVersion.java`
#### Snippet
```java
public class JavaRuntimeVersion implements Version<JavaRuntimeVersion> {
    private static final Pattern PBO = Pattern.compile("(?:\\-([a-zA-Z0-9]+))?\\+(0|[1-9]\\d*)(?:\\-([\\-a-zA-Z0-9\\.]+))?");
    private static final Pattern PO = Pattern.compile("\\-([a-zA-Z0-9]+)(?:\\-([-a-zA-Z0-9.]+))?");
    private static final Pattern O = Pattern.compile("\\+\\-([-a-zA-Z0-9.]+)");

```

### RegExpRedundantEscape
Redundant character escape `\\-` in RegExp
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaRuntimeVersion.java`
#### Snippet
```java
public class JavaRuntimeVersion implements Version<JavaRuntimeVersion> {
    private static final Pattern PBO = Pattern.compile("(?:\\-([a-zA-Z0-9]+))?\\+(0|[1-9]\\d*)(?:\\-([\\-a-zA-Z0-9\\.]+))?");
    private static final Pattern PO = Pattern.compile("\\-([a-zA-Z0-9]+)(?:\\-([-a-zA-Z0-9.]+))?");
    private static final Pattern O = Pattern.compile("\\+\\-([-a-zA-Z0-9.]+)");

```

### RegExpRedundantEscape
Redundant character escape `\\-` in RegExp
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaRuntimeVersion.java`
#### Snippet
```java
    private static final Pattern PBO = Pattern.compile("(?:\\-([a-zA-Z0-9]+))?\\+(0|[1-9]\\d*)(?:\\-([\\-a-zA-Z0-9\\.]+))?");
    private static final Pattern PO = Pattern.compile("\\-([a-zA-Z0-9]+)(?:\\-([-a-zA-Z0-9.]+))?");
    private static final Pattern O = Pattern.compile("\\+\\-([-a-zA-Z0-9.]+)");

    private final String version;
```

### RegExpRedundantEscape
Redundant character escape `\\-` in RegExp
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaRuntimeVersion.java`
#### Snippet
```java
 */
public class JavaRuntimeVersion implements Version<JavaRuntimeVersion> {
    private static final Pattern PBO = Pattern.compile("(?:\\-([a-zA-Z0-9]+))?\\+(0|[1-9]\\d*)(?:\\-([\\-a-zA-Z0-9\\.]+))?");
    private static final Pattern PO = Pattern.compile("\\-([a-zA-Z0-9]+)(?:\\-([-a-zA-Z0-9.]+))?");
    private static final Pattern O = Pattern.compile("\\+\\-([-a-zA-Z0-9.]+)");
```

### RegExpRedundantEscape
Redundant character escape `\\-` in RegExp
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaRuntimeVersion.java`
#### Snippet
```java
 */
public class JavaRuntimeVersion implements Version<JavaRuntimeVersion> {
    private static final Pattern PBO = Pattern.compile("(?:\\-([a-zA-Z0-9]+))?\\+(0|[1-9]\\d*)(?:\\-([\\-a-zA-Z0-9\\.]+))?");
    private static final Pattern PO = Pattern.compile("\\-([a-zA-Z0-9]+)(?:\\-([-a-zA-Z0-9.]+))?");
    private static final Pattern O = Pattern.compile("\\+\\-([-a-zA-Z0-9.]+)");
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaRuntimeVersion.java`
#### Snippet
```java
 */
public class JavaRuntimeVersion implements Version<JavaRuntimeVersion> {
    private static final Pattern PBO = Pattern.compile("(?:\\-([a-zA-Z0-9]+))?\\+(0|[1-9]\\d*)(?:\\-([\\-a-zA-Z0-9\\.]+))?");
    private static final Pattern PO = Pattern.compile("\\-([a-zA-Z0-9]+)(?:\\-([-a-zA-Z0-9.]+))?");
    private static final Pattern O = Pattern.compile("\\+\\-([-a-zA-Z0-9.]+)");
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/SemanticVersion.java`
#### Snippet
```java
public class SemanticVersion implements Version<SemanticVersion> {
    private static final Pattern FULL_SEMVER_PATTERN = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:([\\.\\-])((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$");
    private static final Pattern MAJOR_MINOR_PATTERN = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:([\\.\\-])((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$");
    private static final Pattern MAJOR_PATTERN = Pattern.compile("^(0|[1-9]\\d*)(?:([\\.\\-])((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$");

```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/SemanticVersion.java`
#### Snippet
```java
 */
public class SemanticVersion implements Version<SemanticVersion> {
    private static final Pattern FULL_SEMVER_PATTERN = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:([\\.\\-])((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$");
    private static final Pattern MAJOR_MINOR_PATTERN = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:([\\.\\-])((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$");
    private static final Pattern MAJOR_PATTERN = Pattern.compile("^(0|[1-9]\\d*)(?:([\\.\\-])((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$");
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/SemanticVersion.java`
#### Snippet
```java
    private static final Pattern FULL_SEMVER_PATTERN = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:([\\.\\-])((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$");
    private static final Pattern MAJOR_MINOR_PATTERN = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:([\\.\\-])((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$");
    private static final Pattern MAJOR_PATTERN = Pattern.compile("^(0|[1-9]\\d*)(?:([\\.\\-])((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$");

    private final int major;
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/assemble/JpackageAssemblerValidator.java`
#### Snippet
```java
 */
public final class JpackageAssemblerValidator {
    private static final String MAC_IDENTIFIER = "[a-zA-Z0-9][a-zA-Z0-9\\.\\-]*";
    private static final Pattern MAC_IDENTIFIER_PATTERN = Pattern.compile(MAC_IDENTIFIER);

```

### RegExpRedundantEscape
Redundant character escape `\\*` in RegExp
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/WingetPackagerValidator.java`
#### Snippet
```java
public final class WingetPackagerValidator {
    private static final Pattern PATTERN_PACKAGE_IDENTIFIER = Pattern.compile("^[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}(\\.[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}){1,3}$");
    private static final Pattern PATTERN_PACKAGE_VERSION = Pattern.compile("^[^\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]+$");
    private static final Pattern PATTERN_LOCALE = Pattern.compile("^([a-zA-Z]{2,3}|[iI]-[a-zA-Z]+|[xX]-[a-zA-Z]{1,8})(-[a-zA-Z]{1,8})*$");
    private static final Pattern PATTERN_MINIMUM_OS_VERSION = Pattern.compile("^(0|[1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5])(\\.(0|[1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5])){0,3}$");
```

### RegExpRedundantEscape
Redundant character escape `\\?` in RegExp
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/WingetPackagerValidator.java`
#### Snippet
```java
public final class WingetPackagerValidator {
    private static final Pattern PATTERN_PACKAGE_IDENTIFIER = Pattern.compile("^[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}(\\.[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}){1,3}$");
    private static final Pattern PATTERN_PACKAGE_VERSION = Pattern.compile("^[^\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]+$");
    private static final Pattern PATTERN_LOCALE = Pattern.compile("^([a-zA-Z]{2,3}|[iI]-[a-zA-Z]+|[xX]-[a-zA-Z]{1,8})(-[a-zA-Z]{1,8})*$");
    private static final Pattern PATTERN_MINIMUM_OS_VERSION = Pattern.compile("^(0|[1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5])(\\.(0|[1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5])){0,3}$");
```

### RegExpRedundantEscape
Redundant character escape `\\|` in RegExp
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/WingetPackagerValidator.java`
#### Snippet
```java
public final class WingetPackagerValidator {
    private static final Pattern PATTERN_PACKAGE_IDENTIFIER = Pattern.compile("^[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}(\\.[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}){1,3}$");
    private static final Pattern PATTERN_PACKAGE_VERSION = Pattern.compile("^[^\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]+$");
    private static final Pattern PATTERN_LOCALE = Pattern.compile("^([a-zA-Z]{2,3}|[iI]-[a-zA-Z]+|[xX]-[a-zA-Z]{1,8})(-[a-zA-Z]{1,8})*$");
    private static final Pattern PATTERN_MINIMUM_OS_VERSION = Pattern.compile("^(0|[1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5])(\\.(0|[1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5])){0,3}$");
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/WingetPackagerValidator.java`
#### Snippet
```java
 */
public final class WingetPackagerValidator {
    private static final Pattern PATTERN_PACKAGE_IDENTIFIER = Pattern.compile("^[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}(\\.[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}){1,3}$");
    private static final Pattern PATTERN_PACKAGE_VERSION = Pattern.compile("^[^\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]+$");
    private static final Pattern PATTERN_LOCALE = Pattern.compile("^([a-zA-Z]{2,3}|[iI]-[a-zA-Z]+|[xX]-[a-zA-Z]{1,8})(-[a-zA-Z]{1,8})*$");
```

### RegExpRedundantEscape
Redundant character escape `\\*` in RegExp
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/WingetPackagerValidator.java`
#### Snippet
```java
 */
public final class WingetPackagerValidator {
    private static final Pattern PATTERN_PACKAGE_IDENTIFIER = Pattern.compile("^[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}(\\.[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}){1,3}$");
    private static final Pattern PATTERN_PACKAGE_VERSION = Pattern.compile("^[^\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]+$");
    private static final Pattern PATTERN_LOCALE = Pattern.compile("^([a-zA-Z]{2,3}|[iI]-[a-zA-Z]+|[xX]-[a-zA-Z]{1,8})(-[a-zA-Z]{1,8})*$");
```

### RegExpRedundantEscape
Redundant character escape `\\?` in RegExp
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/WingetPackagerValidator.java`
#### Snippet
```java
 */
public final class WingetPackagerValidator {
    private static final Pattern PATTERN_PACKAGE_IDENTIFIER = Pattern.compile("^[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}(\\.[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}){1,3}$");
    private static final Pattern PATTERN_PACKAGE_VERSION = Pattern.compile("^[^\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]+$");
    private static final Pattern PATTERN_LOCALE = Pattern.compile("^([a-zA-Z]{2,3}|[iI]-[a-zA-Z]+|[xX]-[a-zA-Z]{1,8})(-[a-zA-Z]{1,8})*$");
```

### RegExpRedundantEscape
Redundant character escape `\\|` in RegExp
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/WingetPackagerValidator.java`
#### Snippet
```java
 */
public final class WingetPackagerValidator {
    private static final Pattern PATTERN_PACKAGE_IDENTIFIER = Pattern.compile("^[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}(\\.[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}){1,3}$");
    private static final Pattern PATTERN_PACKAGE_VERSION = Pattern.compile("^[^\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]+$");
    private static final Pattern PATTERN_LOCALE = Pattern.compile("^([a-zA-Z]{2,3}|[iI]-[a-zA-Z]+|[xX]-[a-zA-Z]{1,8})(-[a-zA-Z]{1,8})*$");
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/WingetPackagerValidator.java`
#### Snippet
```java
 */
public final class WingetPackagerValidator {
    private static final Pattern PATTERN_PACKAGE_IDENTIFIER = Pattern.compile("^[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}(\\.[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}){1,3}$");
    private static final Pattern PATTERN_PACKAGE_VERSION = Pattern.compile("^[^\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]+$");
    private static final Pattern PATTERN_LOCALE = Pattern.compile("^([a-zA-Z]{2,3}|[iI]-[a-zA-Z]+|[xX]-[a-zA-Z]{1,8})(-[a-zA-Z]{1,8})*$");
```

### RegExpRedundantEscape
Redundant character escape `\\*` in RegExp
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/WingetPackagerValidator.java`
#### Snippet
```java
 */
public final class WingetPackagerValidator {
    private static final Pattern PATTERN_PACKAGE_IDENTIFIER = Pattern.compile("^[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}(\\.[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}){1,3}$");
    private static final Pattern PATTERN_PACKAGE_VERSION = Pattern.compile("^[^\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]+$");
    private static final Pattern PATTERN_LOCALE = Pattern.compile("^([a-zA-Z]{2,3}|[iI]-[a-zA-Z]+|[xX]-[a-zA-Z]{1,8})(-[a-zA-Z]{1,8})*$");
```

### RegExpRedundantEscape
Redundant character escape `\\?` in RegExp
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/WingetPackagerValidator.java`
#### Snippet
```java
 */
public final class WingetPackagerValidator {
    private static final Pattern PATTERN_PACKAGE_IDENTIFIER = Pattern.compile("^[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}(\\.[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}){1,3}$");
    private static final Pattern PATTERN_PACKAGE_VERSION = Pattern.compile("^[^\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]+$");
    private static final Pattern PATTERN_LOCALE = Pattern.compile("^([a-zA-Z]{2,3}|[iI]-[a-zA-Z]+|[xX]-[a-zA-Z]{1,8})(-[a-zA-Z]{1,8})*$");
```

### RegExpRedundantEscape
Redundant character escape `\\|` in RegExp
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/WingetPackagerValidator.java`
#### Snippet
```java
 */
public final class WingetPackagerValidator {
    private static final Pattern PATTERN_PACKAGE_IDENTIFIER = Pattern.compile("^[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}(\\.[^\\.\\s\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]{1,32}){1,3}$");
    private static final Pattern PATTERN_PACKAGE_VERSION = Pattern.compile("^[^\\\\/:\\*\\?\"<>\\|\\x01-\\x1f]+$");
    private static final Pattern PATTERN_LOCALE = Pattern.compile("^([a-zA-Z]{2,3}|[iI]-[a-zA-Z]+|[xX]-[a-zA-Z]{1,8})(-[a-zA-Z]{1,8})*$");
```

## RuleId[id=RegExpRedundantClassElement]
### RegExpRedundantClassElement
Redundant '\\\\d' in RegExp
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
        StringBuilder buf = new StringBuilder();
        if (null != name && name.length() > 0) {
            String[] tokens = name.split("[^\\w\\d]");
            for (String token1 : tokens) {
                String token = token1.trim();
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/catalog/sbom/CyclonedxSbomCataloger.java`
#### Snippet
```java
            if (isBlank(str)) return null;

            String value = str.replace(" ", "")
                .replace("-", ".")
                .replace("_", ".")
                .toUpperCase(Locale.ENGLISH).trim();

            // try alias
            for (Format type : Format.values()) {
                if (type.alias.toLowerCase(Locale.ENGLISH).equals(value)) {
                    return type;
                }
            }

            return Format.valueOf(value
                .replace(".", "_")
                .toUpperCase(Locale.ENGLISH).trim());
```

### DuplicatedCode
Duplicated code
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/common/ExtraProperties.java`
#### Snippet
```java
        Map<String, Object> props = new LinkedHashMap<>();

        getExtraProperties().forEach((key, value) -> {
            if (null == value) return;

            boolean split = key.endsWith("_split");
            String k = key;
            Object v = value;

            if (split) {
                k = key.substring(0, key.length() - "_split".length());
                v = splitValue(String.valueOf(value));
            }

            if (key.startsWith(prefix)) {
                props.put(k, v);
            } else {
                props.put(prefix + StringUtils.capitalize(k), v);
            }
        });

        return props;
```

### DuplicatedCode
Duplicated code
in `api/jreleaser-model-api/src/main/java/org/jreleaser/mustache/MustacheUtils.java`
#### Snippet
```java
            Object value = e.getValue();

            if (value instanceof CharSequence) {
                String val = String.valueOf(value);
                if (val.contains("{{") && val.contains("}}")) {
                    value = applyTemplate(val, props);
                }
            }

            props.set(e.getKey(), value);
```

### DuplicatedCode
Duplicated code
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaModuleVersion.java`
#### Snippet
```java
        int n = Math.min(t1.length, t2.length);
        for (int i = 0; i < n; i++) {
            String s1 = t1[i];
            String s2 = t2[i];

            try {
                int c = compareAsNumbers(s1, s2);
                if (0 != c) return c;
            } catch (NumberFormatException e) {
                int c = s1.compareTo(s2);
                if (0 != c) return c;
            }
        }

        String[] rest = t1.length > t2.length ? t1 : t2;
        int e = rest.length;
        for (int i = n; i < e; i++) {
            String o = rest[i];
            if ("0".equals(o)) continue;
            return t1.length - t2.length;
        }

        return 0;
```

### DuplicatedCode
Duplicated code
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaModuleVersion.java`
#### Snippet
```java
        requireNonBlank(version, "Argument 'version' must not be blank");

        char c = version.charAt(0);
        if (!(c >= '0' && c <= '9')) {
            throw new IllegalArgumentException("Version does not start with a digit: '" + version + "'");
        }

        String v = take(version, 0, listOf('-', '+'));
        String p = null;
        String b = null;
```

### DuplicatedCode
Duplicated code
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaModuleVersion.java`
#### Snippet
```java
        StringBuilder b = new StringBuilder();

        for (int i = index; i < str.length(); i++) {
            char c = str.charAt(i);
            if (delims.contains(c)) {
                break;
            }
            b.append(c);
        }

        return b.toString();
```

### DuplicatedCode
Duplicated code
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
            if (!in.canReadEntryData(entry)) {
                // log something?
                continue;
            }

            String entryName = entry.getName();
            if (isNotBlank(basename) && entryName.startsWith(basename) && entryName.length() > basename.length() + 1) {
                entryName = entryName.substring(basename.length());
            }

            File file = new File(destinationDir, entryName);
            String destDirPath = destinationDir.getCanonicalPath();
            String destFilePath = file.getCanonicalPath();
            if (!destFilePath.startsWith(destDirPath + File.separator)) {
                throw new IOException(RB.$("ERROR_files_unpack_outside_target", entry.getName()));
            }
```

### DuplicatedCode
Duplicated code
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
        if (null == path) {
            return null;
        }

        int extIndex = path.lastIndexOf(".");
        if (extIndex == -1) {
            return null;
        }

        int folderIndex = path.lastIndexOf(File.separator);
        if (folderIndex > extIndex) {
            return null;
        }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-engine/src/main/java/org/jreleaser/announcers/ArticleAnnouncer.java`
#### Snippet
```java
            Git git = Git.cloneRepository()
                .setCredentialsProvider(credentialsProvider)
                .setBranch(pullBranch)
                .setDirectory(directory.toFile())
                .setURI(repository.getHttpUrl())
                .call();

            boolean emptyRepository = true;
            try {
                for (RevCommit commit : git.log().call()) {
                    emptyRepository = false;
                    break;
                }
            } catch (NoHeadException ignored) {
                // ok
            }

            boolean mustBranch = !pushBranch.equals(pullBranch);
            if (mustBranch && !emptyRepository) {
                context.getLogger().debug(RB.$("repository.branching", pushBranch));
                git.checkout()
                    .setName(pushBranch)
                    .setCreateBranch(true)
                    .call();
            }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-engine/src/main/java/org/jreleaser/assemblers/AbstractAssemblerProcessor.java`
#### Snippet
```java
        if (assembler.getSkipTemplates().contains(filename)) return true;
        // check using string contains
        if (assembler.getSkipTemplates().stream()
            .anyMatch(filename::contains)) return true;
        // check using regex
        if (assembler.getSkipTemplates().stream()
            .anyMatch(filename::matches)) return true;

        // remove .tpl and check again
        String fname = trimTplExtension(filename);

        // check explicit match
        if (assembler.getSkipTemplates().contains(fname)) return true;
        // check using string contains
        if (assembler.getSkipTemplates().stream()
            .anyMatch(fname::contains)) return true;
        // check using regex
        return assembler.getSkipTemplates().stream()
            .anyMatch(fname::matches);
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-engine/src/main/java/org/jreleaser/assemblers/ArchiveAssemblerProcessor.java`
#### Snippet
```java
        String archiveName = assembler.getResolvedArchiveName(context);

        Path workDirectory = assembleDirectory.resolve(WORK_DIRECTORY);
        Path archiveDirectory = workDirectory.resolve(archiveName);

        try {
            FileUtils.deleteFiles(workDirectory);
            Files.createDirectories(archiveDirectory);
        } catch (IOException e) {
            throw new AssemblerProcessingException(RB.$("ERROR_assembler_delete_archive", archiveName), e);
        }

        // copy templates
        copyTemplates(context, props, archiveDirectory);

        // copy fileSets
        context.getLogger().debug(RB.$("assembler.copy.files"), context.relativizeToBasedir(archiveDirectory));
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-engine/src/main/java/org/jreleaser/assemblers/ArchiveAssemblerProcessor.java`
#### Snippet
```java
        String finalArchiveName = archiveName + "." + format.extension();
        context.getLogger().info("- {}", finalArchiveName);

        try {
            Path archiveFile = assembleDirectory.resolve(finalArchiveName);
            FileUtils.packArchive(workDirectory, archiveFile, assembler.getOptions().toOptions());
        } catch (IOException e) {
            throw new AssemblerProcessingException(RB.$("ERROR_unexpected_error"), e);
        }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-engine/src/main/java/org/jreleaser/catalogers/CyclonedxSbomCatalogerProcessor.java`
#### Snippet
```java
        boolean executed = false;
        for (Artifact artifact : artifacts) {
            if (generateSbom(cyclonedx, artifact)) executed = true;
        }

        Path archivePath = cataloger.resolveArchivePath(context);
        if (executed || !Files.exists(archivePath)) {
            pack(artifacts, archivePath);
        }

        return executed ? Result.EXECUTED : Result.UPTODATE;
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-engine/src/main/java/org/jreleaser/catalogers/CyclonedxSbomCatalogerProcessor.java`
#### Snippet
```java
        if (!cataloger.getPack().isEnabled()) return;

        context.getLogger().info(RB.$("catalog.sbom.pack", archivePath.getFileName()));

        String archiveFileName = getFilename(archivePath.getFileName().toString());

        try {
            Path tmp = Files.createTempDirectory(getType());
            Path workingDirectory = tmp.resolve(archiveFileName);
            Files.createDirectories(workingDirectory);
            for (Artifact artifact : doResolveArtifacts(candidates)) {
                Files.copy(artifact.getEffectivePath(), workingDirectory.resolve(artifact.getEffectivePath().getFileName()),
                    REPLACE_EXISTING, COPY_ATTRIBUTES);
            }
            FileUtils.zip(workingDirectory, archivePath);
        } catch (IOException e) {
            throw new CatalogProcessingException(RB.$("ERROR_catalog_unexpected_error_packing", archivePath.getFileName()), e);
        }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-engine/src/main/java/org/jreleaser/catalogers/CyclonedxSbomCatalogerProcessor.java`
#### Snippet
```java
            args.add(artifactFile);

            if (!Files.exists(targetPath)) {
                context.getLogger().debug(RB.$("catalog.sbom.not.exist"), context.relativizeToBasedir(targetPath));
                generateSbom(cyclonedx, artifactPath.getParent(), targetPath.getFileName(), args);
                executed = true;
            } else if (artifactPath.toFile().lastModified() > targetPath.toFile().lastModified()) {
                context.getLogger().debug(RB.$("checksum.file.newer"),
                    context.relativizeToBasedir(artifactPath),
                    context.relativizeToBasedir(targetPath));
                generateSbom(cyclonedx, artifactPath.getParent(), targetPath.getFileName(), args);
                executed = true;
            }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/assemble/Assemblers.java`
#### Snippet
```java
        } catch (WorkflowListenerException e) {
            context.getLogger().error(RB.$("listener.failure", e.getListener().getClass().getName()));
            context.getLogger().trace(e);
            if (event.getType() != ExecutionEvent.Type.FAILURE && !e.getListener().isContinueOnError()) {
                if (e.getCause() instanceof RuntimeException) {
                    throw (RuntimeException) e.getCause();
                } else {
                    throw new JReleaserException(RB.$("ERROR_unexpected_error"), e.getCause());
                }
            }
        }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/distribution/Distributions.java`
#### Snippet
```java
        } catch (WorkflowListenerException e) {
            context.getLogger().error(RB.$("listener.failure", e.getListener().getClass().getName()));
            context.getLogger().trace(e);
            if (!e.getListener().isContinueOnError()) {
                if (e.getCause() instanceof RuntimeException) {
                    throw (RuntimeException) e.getCause();
                } else {
                    throw new JReleaserException(RB.$("ERROR_unexpected_error"), e.getCause());
                }
            }
        }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/environment/Environment.java`
#### Snippet
```java
        Path configDirectory = null;

        String home = System.getenv(XDG_CONFIG_HOME);
        if (isNotBlank(home) && Files.exists(Paths.get(home).resolve("jreleaser"))) {
            configDirectory = Paths.get(home).resolve("jreleaser");
        }

        if (null == configDirectory) {
            home = System.getenv(JRELEASER_USER_HOME);
            if (isBlank(home)) {
                home = System.getProperty("user.home") + File.separator + ".jreleaser";
            }
            configDirectory = Paths.get(home);
        }

        loadVariables(logger, resolveConfigFileAt(configDirectory)
            .orElse(configDirectory.resolve("config.properties")));
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/environment/Environment.java`
#### Snippet
```java
        ServiceLoader<JReleaserConfigParser> parsers = ServiceLoader.load(JReleaserConfigParser.class,
            JReleaserConfigParser.class.getClassLoader());

        for (JReleaserConfigParser parser : parsers) {
            Path file = directory.resolve("config." + parser.getPreferredFileExtension());
            if (Files.exists(file)) {
                return Optional.of(file);
            }
        }

        return Optional.empty();
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/sign/Signer.java`
#### Snippet
```java
        if (files.isEmpty()) {
            context.getLogger().info(RB.$("signing.no.match"));
            return;
        }

        files = files.stream()
            .filter(SigningUtils.FilePair::isInvalid)
            .collect(toList());

        if (files.isEmpty()) {
            context.getLogger().info(RB.$("signing.up.to.date"));
            return;
        }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/sign/Signer.java`
#### Snippet
```java
            PGPObjectFactory pgpObjFactory = new PGPObjectFactory(sigInputStream, keyring.getKeyFingerPrintCalculator());
            Iterable<?> pgpSigList = null;

            Object obj = pgpObjFactory.nextObject();
            if (obj instanceof PGPCompressedData) {
                PGPCompressedData c1 = (PGPCompressedData) obj;
                pgpObjFactory = new PGPObjectFactory(c1.getDataStream(), keyring.getKeyFingerPrintCalculator());
                pgpSigList = (Iterable<?>) pgpObjFactory.nextObject();
            } else {
                pgpSigList = (Iterable<?>) obj;
            }

            PGPSignature sig = (PGPSignature) pgpSigList.iterator().next();
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/sign/Signer.java`
#### Snippet
```java
                    Path input = artifact.getEffectivePath(context);
                    Path output = signaturesDirectory.resolve(input.getFileName().toString().concat(extension));
                    SigningUtils.FilePair pair = new SigningUtils.FilePair(input, output);
                    if (!forceSign) pair.setValid(validator.test(pair));
                    files.add(pair);
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/templates/TemplateEvaluator.java`
#### Snippet
```java
            Path targetTemplate = targetDirectory.resolve(trimTplExtension(key));
            if (template.isReader()) {
                context.getLogger().info(RB.$("templates.evaluate"), key);
                String content = applyTemplate(template.getReader(), props, key);
                context.getLogger().info(RB.$("templates.writing.file"), targetTemplate);
                writeFile(context.getLogger(), content, targetTemplate, overwrite);
            } else {
                context.getLogger().info(RB.$("templates.writing.file"), targetTemplate);
                writeFile(context.getLogger(), IOUtils.toByteArray(template.getInputStream()), targetTemplate, overwrite);
            }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/AbstractPackagerProcessor.java`
#### Snippet
```java
            String distributionName = distribution.getName();
            context.getLogger().debug(RB.$("packager.create.properties"), distributionName, getPackagerName());
            TemplateContext newProps = fillProps(distribution, props);
            if (newProps.isEmpty()) {
                context.getLogger().warn(RB.$("packager.skip.distribution"), distributionName);
                return;
            }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/AbstractPackagerProcessor.java`
#### Snippet
```java
        try {
            Command.Result result = new CommandExecutor(context.getLogger())
                .executeCommand(directory, command);
            if (result.getExitValue() != 0) {
                throw new CommandException(RB.$("ERROR_command_execution_exit_value", result.getExitValue()));
            }
            return result;
        } catch (CommandException e) {
            throw new PackagerProcessingException(RB.$("ERROR_unexpected_error"), e);
        }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/AbstractPackagerProcessor.java`
#### Snippet
```java
            safePut(props, ARTIFACT + artifactPlatform + NAME, artifactName);
            safePut(props, ARTIFACT + artifactPlatform + VERSION, artifactVersion);
            safePut(props, ARTIFACT + artifactPlatform + OS, artifactOs);
            safePut(props, ARTIFACT + artifactPlatform + ARCH, artifactArch);
            safePut(props, ARTIFACT + artifactPlatform + FILE, artifactFile);
            safePut(props, ARTIFACT + artifactPlatform + SIZE, artifactSize);
            safePut(props, ARTIFACT + artifactPlatform + FILE_NAME, artifactFileName);
            safePut(props, ARTIFACT + artifactPlatform + ROOT_ENTRY_NAME, artifactRootEntryName);
            safePut(props, ARTIFACT + artifactPlatform + FILE_EXTENSION, artifactFileExtension);
            safePut(props, ARTIFACT + artifactPlatform + FILE_FORMAT, artifactFileFormat);
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/AbstractPackagerProcessor.java`
#### Snippet
```java
                safePut(props, KEY_DISTRIBUTION_ARTIFACT_PLATFORM, platform);
                safePut(props, KEY_DISTRIBUTION_ARTIFACT_PLATFORM_REPLACED, platformReplaced);
                safePut(props, KEY_DISTRIBUTION_ARTIFACT_NAME, artifactName);
                safePut(props, KEY_DISTRIBUTION_ARTIFACT_VERSION, artifactVersion);
                safePut(props, KEY_DISTRIBUTION_ARTIFACT_OS, artifactOs);
                safePut(props, KEY_DISTRIBUTION_ARTIFACT_ARCH, artifactArch);
                safePut(props, KEY_DISTRIBUTION_ARTIFACT_SIZE, artifactSize);
                safePut(props, KEY_DISTRIBUTION_ARTIFACT_FILE, artifactFile);
                safePut(props, KEY_DISTRIBUTION_ARTIFACT_FILE_NAME, artifactFileName);
                safePut(props, KEY_DISTRIBUTION_ARTIFACT_ROOT_ENTRY_NAME, artifactRootEntryName);
                safePut(props, KEY_DISTRIBUTION_ARTIFACT_FILE_EXTENSION, artifactFileExtension);
                safePut(props, KEY_DISTRIBUTION_ARTIFACT_FILE_FORMAT, artifactFileFormat);
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/AppImagePackagerProcessor.java`
#### Snippet
```java
        BaseReleaser<?, ?> releaser = context.getModel().getRelease().getReleaser();

        try {
            props.set(KEY_APPIMAGE_RELEASES, Releasers.releaserFor(context)
                .listReleases(releaser.getOwner(), releaser.getName()).stream()
                .filter(r -> isReleaseIncluded(packager.getSkipReleases(), r.getVersion().toString()))
                .map(r -> AppdataUtils.Release.of(r.getUrl(), r.getVersion().toString(), r.getPublishedAt()))
                .collect(toList()));
        } catch (IOException e) {
            throw new PackagerProcessingException(RB.$("ERROR_unexpected_error"), e);
        }

        props.set(KEY_APPIMAGE_SCREENSHOTS, packager.getScreenshots().stream()
            .map(Screenshot::asScreenshotTemplate)
            .collect(toList()));

        context.getLogger().debug(RB.$("packager.fetch.icons"));
        props.set(KEY_APPIMAGE_ICONS, packager.getIcons());
        resolveIcons(context, packager, distribution, props, packager.getIcons());
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/AppImagePackagerProcessor.java`
#### Snippet
```java
        Releaser<?> gitService = context.getModel().getRelease().getReleaser();
        if (fileName.contains("github") && !(gitService instanceof GithubReleaser)) {
            // skip
            return;
        } else if (fileName.contains("-github")) {
            fileName = StringUtils.remove(fileName, "-github");
        }

        fileName = trimTplExtension(fileName);
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/DockerPackagerProcessor.java`
#### Snippet
```java
        verifyAndAddArtifacts(newProps, distribution, artifacts);
        Path prepareDirectory = newProps.get(KEY_DISTRIBUTION_PREPARE_DIRECTORY);
        newProps.set(KEY_DISTRIBUTION_PREPARE_DIRECTORY, prepareDirectory.resolve(spec.getName()));
        Path packageDirectory = newProps.get(KEY_DISTRIBUTION_PACKAGE_DIRECTORY);
        newProps.set(KEY_DISTRIBUTION_PACKAGE_DIRECTORY, packageDirectory.resolve(spec.getName()));
        return newProps;
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/DockerPackagerProcessor.java`
#### Snippet
```java
        if (!cmd.hasArg("-q") && !cmd.hasArg("--quiet")) {
            cmd.arg("--quiet");
        }
        cmd.arg("--file");
        cmd.arg(workingDirectory.resolve("Dockerfile").toAbsolutePath().toString());
        for (String tag : tags) {
            cmd.arg("--tag");
            cmd.arg(tag);
        }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/DockerPackagerProcessor.java`
#### Snippet
```java
        for (int i = 0; i < docker.getBuildArgs().size(); i++) {
            String arg = docker.getBuildArgs().get(i);
            if (arg.contains("{{")) {
                cmd.arg(resolveTemplate(arg, props).trim());
            } else {
                cmd.arg(arg.trim());
            }
        }
        return cmd;
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/DockerPackagerProcessor.java`
#### Snippet
```java
        Path destination = directory;

        String[] parts = imageName.split("/");
        parts = parts[parts.length - 1].split(":");
        if (isSpec) {
            destination = directory.resolve(parts[0]);
        }

        if (packager.getPackagerRepository().isVersionedSubfolders()) {
            destination = directory.resolve(parts[1]);
        }

        Path assembly = destination.resolve("assembly");
        FileUtils.deleteFiles(assembly);

        Files.createDirectories(destination);
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserContext.java`
#### Snippet
```java
        safePut(project.prefix() + capitalize(KEY_VERSION_MAJOR), resolvedExtraProperties, props);
        safePut(project.prefix() + capitalize(KEY_VERSION_MINOR), resolvedExtraProperties, props);
        safePut(project.prefix() + capitalize(KEY_VERSION_PATCH), resolvedExtraProperties, props);
        safePut(project.prefix() + capitalize(KEY_VERSION_NUMBER), resolvedExtraProperties, props);
        safePut(project.prefix() + capitalize(KEY_VERSION_PRERELEASE), resolvedExtraProperties, props);
        safePut(project.prefix() + capitalize(KEY_VERSION_TAG), resolvedExtraProperties, props);
        safePut(project.prefix() + capitalize(KEY_VERSION_BUILD), resolvedExtraProperties, props);
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModel.java`
#### Snippet
```java
        String osName = PlatformUtils.getDetectedOs();
        String osArch = PlatformUtils.getDetectedArch();
        props.set(Constants.KEY_OS_NAME, osName);
        props.set(Constants.KEY_OS_ARCH, osArch);
        props.set(Constants.KEY_OS_VERSION, PlatformUtils.getDetectedVersion());
        props.set(Constants.KEY_OS_PLATFORM, PlatformUtils.getCurrentFull());
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModel.java`
#### Snippet
```java
        props.set(Constants.KEY_PROJECT_NAME, project.getName());
        props.set(Constants.KEY_PROJECT_NAME_CAPITALIZED, getCapitalizedName(project.getName()));
        props.set(Constants.KEY_PROJECT_VERSION, project.getVersion());
        props.set(Constants.KEY_PROJECT_STEREOTYPE, project.getStereotype());
        props.set(Constants.KEY_PROJECT_EFFECTIVE_VERSION, project.getEffectiveVersion());
        props.set(Constants.KEY_PROJECT_SNAPSHOT, String.valueOf(project.isSnapshot()));
        if (isNotBlank(project.getDescription())) {
            props.set(Constants.KEY_PROJECT_DESCRIPTION, MustacheUtils.passThrough(project.getDescription()));
        }
        if (isNotBlank(project.getLongDescription())) {
            props.set(Constants.KEY_PROJECT_LONG_DESCRIPTION, MustacheUtils.passThrough(project.getLongDescription()));
        }
        if (isNotBlank(project.getLicense())) {
            props.set(Constants.KEY_PROJECT_LICENSE, project.getLicense());
        }
        if (null != project.getInceptionYear()) {
            props.set(Constants.KEY_PROJECT_INCEPTION_YEAR, project.getInceptionYear());
        }
        if (isNotBlank(project.getCopyright())) {
            props.set(Constants.KEY_PROJECT_COPYRIGHT, project.getCopyright());
        }
        if (isNotBlank(project.getVendor())) {
            props.set(Constants.KEY_PROJECT_VENDOR, project.getVendor());
        }
        project.getLinks().fillProps(props);
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/release/BaseReleaser.java`
#### Snippet
```java
        props.set(Constants.KEY_PROJECT_VERSION, project.getVersion());
        props.set(Constants.KEY_PROJECT_STEREOTYPE, project.getStereotype());
        props.set(Constants.KEY_PROJECT_EFFECTIVE_VERSION, project.getEffectiveVersion());
        props.set(Constants.KEY_PROJECT_SNAPSHOT, String.valueOf(project.isSnapshot()));
        if (isNotBlank(project.getDescription())) {
            props.set(Constants.KEY_PROJECT_DESCRIPTION, MustacheUtils.passThrough(project.getDescription()));
        }
        if (isNotBlank(project.getLongDescription())) {
            props.set(Constants.KEY_PROJECT_LONG_DESCRIPTION, MustacheUtils.passThrough(project.getLongDescription()));
        }
        if (isNotBlank(project.getLicense())) {
            props.set(Constants.KEY_PROJECT_LICENSE, project.getLicense());
        }
        if (null != project.getInceptionYear()) {
            props.set(Constants.KEY_PROJECT_INCEPTION_YEAR, project.getInceptionYear());
        }
        if (isNotBlank(project.getCopyright())) {
            props.set(Constants.KEY_PROJECT_COPYRIGHT, project.getCopyright());
        }
        if (isNotBlank(project.getVendor())) {
            props.set(Constants.KEY_PROJECT_VENDOR, project.getVendor());
        }
        project.getLinks().fillProps(props);
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/project/Project.java`
#### Snippet
```java
            props.set(Constants.KEY_PROJECT_SNAPSHOT, String.valueOf(project.isSnapshot()));
            if (isNotBlank(project.getDescription())) {
                props.set(Constants.KEY_PROJECT_DESCRIPTION, MustacheUtils.passThrough(project.getDescription()));
            }
            if (isNotBlank(project.getLongDescription())) {
                props.set(Constants.KEY_PROJECT_LONG_DESCRIPTION, MustacheUtils.passThrough(project.getLongDescription()));
            }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModel.java`
#### Snippet
```java
        if (project.getJava().isEnabled()) {
            props.setAll(project.getJava().resolvedExtraProperties());
            props.set(Constants.KEY_PROJECT_JAVA_GROUP_ID, project.getJava().getGroupId());
            props.set(Constants.KEY_PROJECT_JAVA_ARTIFACT_ID, project.getJava().getArtifactId());
            String javaVersion = project.getJava().getVersion();
            props.set(Constants.KEY_PROJECT_JAVA_VERSION, javaVersion);
            props.set(Constants.KEY_PROJECT_JAVA_MAIN_CLASS, project.getJava().getMainClass());
            if (isNotBlank(javaVersion)) {
                SemanticVersion jv = SemanticVersion.of(javaVersion);
                props.set(Constants.KEY_PROJECT_JAVA_VERSION_MAJOR, jv.getMajor());
                if (jv.hasMinor()) props.set(Constants.KEY_PROJECT_JAVA_VERSION_MINOR, jv.getMinor());
                if (jv.hasPatch()) props.set(Constants.KEY_PROJECT_JAVA_VERSION_PATCH, jv.getPatch());
                if (jv.hasTag()) props.set(Constants.KEY_PROJECT_JAVA_VERSION_TAG, jv.getTag());
                if (jv.hasBuild()) props.set(Constants.KEY_PROJECT_JAVA_VERSION_BUILD, jv.getBuild());
            }
        }

        project.parseVersion();
        props.setAll(project.resolvedExtraProperties());
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModelPrinter.java`
#### Snippet
```java
            collection.forEach(value -> {
                if (value instanceof Map) {
                    if (!((Map) value).isEmpty()) {
                        doPrintMap((Map) value, offset);
                    }
                } else if (value instanceof Collection) {
                    if (!((Collection) value).isEmpty()) {
                        doPrintCollection((Collection) value, offset + 1);
                    }
                } else if (null != value && value.getClass().isArray()) {
                    if (((Object[]) value).length > 0) {
                        doPrintArray((Object[]) value, offset + 1);
                    }
                } else if (isNotNullNorBlank(value)) {
                    doPrintElement(value, offset);
                }
            });
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/AbstractAnnouncer.java`
#### Snippet
```java
        if (!full && !isEnabled()) return Collections.emptyMap();

        Map<String, Object> props = new LinkedHashMap<>();
        props.put("enabled", isEnabled());
        props.put("active", getActive());
        props.put("connectTimeout", connectTimeout);
        props.put("readTimeout", readTimeout);
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/AbstractMessageAnnouncer.java`
#### Snippet
```java
        TemplateContext props = context.fullProps();
        context.getChangelog().apply(props);
        applyTemplates(props, resolvedExtraProperties());
        props.set(KEY_TAG_NAME, context.getModel().getRelease().getReleaser()
            .getEffectiveTagName(context.getModel()));
        props.set(Constants.KEY_PREVIOUS_TAG_NAME,
            context.getModel().getRelease().getReleaser()
                .getResolvedPreviousTagName(context.getModel()));
        props.setAll(extraProps);

        Path templatePath = context.getBasedir().resolve(messageTemplate);
        try {
            Reader reader = java.nio.file.Files.newBufferedReader(templatePath);
            return applyTemplate(reader, props);
        } catch (IOException e) {
            throw new JReleaserException(RB.$("ERROR_unexpected_error_reading_template",
                context.relativizeToBasedir(templatePath)));
        }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
        map.putAll(discord.asMap(full));
        map.putAll(discourse.asMap(full));
        map.putAll(discussions.asMap(full));
        map.putAll(gitter.asMap(full));
        map.putAll(googleChat.asMap(full));
        map.putAll(linkedin.asMap(full));
        map.putAll(httpAnnouncers.asMap(full));
        map.putAll(smtp.asMap(full));
        map.putAll(mastodon.asMap(full));
        map.putAll(mattermost.asMap(full));
        map.putAll(openCollective.asMap(full));
        map.putAll(sdkman.asMap(full));
        map.putAll(slack.asMap(full));
        map.putAll(teams.asMap(full));
        map.putAll(telegram.asMap(full));
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/BlueskyAnnouncer.java`
#### Snippet
```java
        TemplateContext props = context.fullProps();
        context.getChangelog().apply(props);
        applyTemplates(props, resolvedExtraProperties());
        props.set(KEY_TAG_NAME, context.getModel().getRelease().getReleaser().getEffectiveTagName(context.getModel()));
        props.set(KEY_PREVIOUS_TAG_NAME, context.getModel().getRelease().getReleaser().getResolvedPreviousTagName(context.getModel()));
        props.setAll(extraProps);

        Path templatePath = context.getBasedir().resolve(statusTemplate);
        try {
            Reader reader = java.nio.file.Files.newBufferedReader(templatePath);
            return applyTemplate(reader, props);
        } catch (IOException e) {
            throw new JReleaserException(RB.$("ERROR_unexpected_error_reading_template",
                context.relativizeToBasedir(templatePath)));
        }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/DiscordAnnouncer.java`
#### Snippet
```java
        super.merge(source);
        this.webhook = merge(this.webhook, source.webhook);
        this.message = merge(this.message, source.message);
        this.messageTemplate = merge(this.messageTemplate, source.messageTemplate);

        if (isSet()) {
            nag("announce." + getName() + " is deprecated since 1.4.0 and will be removed in 2.0.0. Use announce.webhooks instead");
        }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/DiscordAnnouncer.java`
#### Snippet
```java
        TemplateContext props = context.fullProps();
        applyTemplates(props, resolvedExtraProperties());
        props.set(KEY_TAG_NAME, context.getModel().getRelease().getReleaser()
            .getEffectiveTagName(context.getModel()));
        props.set(Constants.KEY_PREVIOUS_TAG_NAME,
            context.getModel().getRelease().getReleaser()
                .getResolvedPreviousTagName(context.getModel()));
        props.setAll(extraProps);

        Path templatePath = context.getBasedir().resolve(messageTemplate);
        try {
            Reader reader = java.nio.file.Files.newBufferedReader(templatePath);
            return applyTemplate(reader, props);
        } catch (IOException e) {
            throw new JReleaserException(RB.$("ERROR_unexpected_error_reading_template",
                context.relativizeToBasedir(templatePath)));
        }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/HttpAnnouncers.java`
#### Snippet
```java
        if (!full && !isEnabled()) return Collections.emptyMap();

        Map<String, Object> props = new LinkedHashMap<>();
        asMap(full, props);

        Map<String, Object> map = new LinkedHashMap<>();
        map.put(getName(), props);
        return map;
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/AbstractJavaAssembler.java`
#### Snippet
```java
        Map<String, Map<String, Object>> mappedJars = new LinkedHashMap<>();
        for (int i = 0; i < jars.size(); i++) {
            mappedJars.put("glob " + i, jars.get(i).asMap(full));
        }
        props.put("jars", mappedJars);
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/common/Artifact.java`
#### Snippet
```java
        if (null == resolvedPath) {
            path = Artifacts.resolveForArtifact(path, context, this, distribution);
            resolvedPath = context.getBasedir().resolve(Paths.get(path)).normalize();
            if (context.getMode().validatePaths() && !isOptional(context) && !exists(resolvedPath)) {
                throw new JReleaserException(RB.$("ERROR_path_does_not_exist", context.relativizeToBasedir(resolvedPath)));
            }
        }
        return resolvedPath;
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
        Map<String, Map<String, Object>> mappedArtifacts = new LinkedHashMap<>();
        int i = 0;
        for (Artifact artifact : getArtifacts()) {
            mappedArtifacts.put("artifact " + (i++), artifact.asMap(full));
        }
        props.put("artifacts", mappedArtifacts);
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/download/Download.java`
#### Snippet
```java
        List<Map<String, Object>> scp = this.scp.values()
            .stream()
            .filter(d -> full || d.isEnabled())
            .map(d -> d.asMap(full))
            .collect(toList());
        if (!scp.isEmpty()) map.put("scp", scp);

        List<Map<String, Object>> sftp = this.sftp.values()
            .stream()
            .filter(d -> full || d.isEnabled())
            .map(d -> d.asMap(full))
            .collect(toList());
        if (!sftp.isEmpty()) map.put("sftp", sftp);

        return map;
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/hooks/CommandHooks.java`
#### Snippet
```java
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("enabled", isEnabled());
        map.put("active", getActive());
        map.put("environment", environment);

        Map<String, Map<String, Object>> m = new LinkedHashMap<>();
        int i = 0;
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/AbstractAppdataPackager.java`
#### Snippet
```java
        Map<String, Map<String, Object>> sm = new LinkedHashMap<>();
        int i = 0;
        for (Screenshot screenshot : screenshots) {
            sm.put("screenshot " + (i++), screenshot.asMap(full));
        }
        props.put("screenshots", sm);
        sm = new LinkedHashMap<>();
        i = 0;
        for (Icon icon : icons) {
            sm.put("icon " + (i++), icon.asMap(full));
        }
        props.put("icons", sm);
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/AbstractDockerConfiguration.java`
#### Snippet
```java
        if (!full && !isEnabled()) return Collections.emptyMap();

        Map<String, Object> props = new LinkedHashMap<>();
        props.put("enabled", isEnabled());
        props.put("active", getActive());
        props.put("templateDirectory", templateDirectory);
        props.put("skipTemplates", skipTemplates);
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/AbstractDockerConfiguration.java`
#### Snippet
```java
        asMap(full, props);

        Map<String, Map<String, Object>> m = new LinkedHashMap<>();
        int i = 0;
        for (Registry registry : this.registries) {
            m.put("registry " + (i++), registry.asMap(full));
        }
        props.put("registries", m);

        props.put("extraProperties", getExtraProperties());

        return props;
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/AbstractPackager.java`
#### Snippet
```java
        if (distribution.getType() == FLAT_BINARY && supportsDistribution(distribution.getType())) {
            return distribution.getArtifacts().stream()
                .filter(Artifact::isActiveAndSelected)
                .filter(artifact -> supportsPlatform(artifact.getPlatform()))
                .filter(this::isNotSkipped)
                .sorted(Artifact.comparatorByPlatform())
                .collect(toList());
        }

        List<String> fileExtensions = new ArrayList<>(getSupportedFileExtensions(distribution.getType()));
        fileExtensions.sort(naturalOrder());

        return distribution.getArtifacts().stream()
            .filter(Artifact::isActiveAndSelected)
            .filter(artifact -> fileExtensions.stream().anyMatch(ext -> artifact.getResolvedPath(context, distribution).toString().endsWith(ext)))
            .filter(artifact -> supportsPlatform(artifact.getPlatform()))
            .filter(this::isNotSkipped)
            .sorted(Artifact.comparatorByPlatform().thenComparingInt(artifact -> {
                String ext = FileType.getExtension(artifact.getResolvedPath(context, distribution));
                return fileExtensions.indexOf(ext);
            }))
            .collect(toList());
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/DockerPackager.java`
#### Snippet
```java
        props.put("commitAuthor", commitAuthor.asMap(full));
        props.put("repository", repository.asMap(full));
        props.put("downloadUrl", downloadUrl);
        props.put("continueOnError", isContinueOnError());
        List<Map<String, Object>> specs = this.specs.values()
            .stream()
            .filter(d -> full || d.isEnabled())
            .map(d -> d.asMap(full))
            .collect(Collectors.toList());
        if (!specs.isEmpty()) props.put("specs", specs);
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/DockerSpec.java`
#### Snippet
```java
        Map<String, Object> props = super.asMap(full);

        if (!props.isEmpty()) {
            Map<String, Object> map = new LinkedHashMap<>();
            map.put(name, props);
            return map;
        }

        return props;
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/DockerSpec.java`
#### Snippet
```java
        boolean matched = true;

        for (Map.Entry<String, Object> e : matchers.entrySet()) {
            String key = e.getKey();
            if (KEY_PLATFORM.equals(key)) {
                matched &= isNotBlank(artifact.getPlatform()) && PlatformUtils.isCompatible(String.valueOf(e.getValue()), artifact.getPlatform());
            } else if (artifact.getExtraProperties().containsKey(key)) {
                matched &= e.getValue().equals(artifact.getExtraProperties().get(key));
            }
        }

        return matched;
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/project/Project.java`
#### Snippet
```java
            TemplateContext props = new TemplateContext();
            Project project = model.getProject();
            props.setAll(model.getEnvironment().getProperties());
            props.setAll(model.getEnvironment().getSourcedProperties());
            props.set(Constants.KEY_PROJECT_NAME, project.getName());
            props.set(Constants.KEY_PROJECT_NAME_CAPITALIZED, getCapitalizedName(project.getName()));
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/project/Project.java`
#### Snippet
```java
project.getLinks().fillProps(props);

            if (project.getJava().isEnabled()) {
                props.setAll(project.getJava().resolvedExtraProperties());
                props.set(Constants.KEY_PROJECT_JAVA_GROUP_ID, project.getJava().getGroupId());
                props.set(Constants.KEY_PROJECT_JAVA_ARTIFACT_ID, project.getJava().getArtifactId());
                String javaVersion = project.getJava().getVersion();
                props.set(Constants.KEY_PROJECT_JAVA_VERSION, javaVersion);
                props.set(Constants.KEY_PROJECT_JAVA_MAIN_CLASS, project.getJava().getMainClass());
                if (isNotBlank(javaVersion)) {
                    SemanticVersion jv = SemanticVersion.of(javaVersion);
                    props.set(Constants.KEY_PROJECT_JAVA_VERSION_MAJOR, jv.getMajor());
                    if (jv.hasMinor()) props.set(Constants.KEY_PROJECT_JAVA_VERSION_MINOR, jv.getMinor());
                    if (jv.hasPatch()) props.set(Constants.KEY_PROJECT_JAVA_VERSION_PATCH, jv.getPatch());
                    if (jv.hasTag()) props.set(Constants.KEY_PROJECT_JAVA_VERSION_TAG, jv.getTag());
                    if (jv.hasBuild()) props.set(Constants.KEY_PROJECT_JAVA_VERSION_BUILD, jv.getBuild());
                }
            }

            project.parseVersion();
            props.setAll(project.resolvedExtraProperties());

            String osName = PlatformUtils.getDetectedOs();
            String osArch = PlatformUtils.getDetectedArch();
            props.set(Constants.KEY_OS_NAME, osName);
            props.set(Constants.KEY_OS_ARCH, osArch);
            props.set(Constants.KEY_OS_VERSION, PlatformUtils.getDetectedVersion());
            props.set(Constants.KEY_OS_PLATFORM, PlatformUtils.getCurrentFull());
            props.set(Constants.KEY_OS_PLATFORM_REPLACED, model.getPlatform().applyReplacements(PlatformUtils.getCurrentFull()));
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/release/Changelog.java`
#### Snippet
```java
        if (isNotBlank(content)) {
            return new StringReader(content);
        }

        Path templatePath = context.getBasedir().resolve(contentTemplate);
        try {
            return java.nio.file.Files.newBufferedReader(templatePath);
        } catch (IOException e) {
            throw new JReleaserException(RB.$("ERROR_unexpected_error_reading_template",
                context.relativizeToBasedir(templatePath)));
        }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/util/Artifacts.java`
#### Snippet
```java
        if (isBlank(downloadUrl)) {
            downloadUrl = packager.getDownloadUrl();
        }

        if (isBlank(downloadUrl)) {
            downloadUrl = distribution.getExtraProperty(packagerName + DOWNLOAD_URL_SUFFIX);
        }
        if (isBlank(downloadUrl)) {
            downloadUrl = distribution.getExtraProperty(DOWNLOAD_URL_KEY);
        }

        BaseReleaser<?, ?> service = context.getModel().getRelease().getReleaser();
        if (isBlank(downloadUrl) && !service.isSkipRelease() && service.isArtifacts() && service.resolveUploadAssetsEnabled(context.getModel().getProject())) {
            downloadUrl = service.getDownloadUrl();
        }

        if (isBlank(downloadUrl)) {
            downloadUrl = resolveDownloadUrlFromUploader(context, artifact, artifact);
        }
        if (isBlank(downloadUrl)) {
            downloadUrl = resolveDownloadUrlFromUploader(context, packager, artifact);
        }
        if (isBlank(downloadUrl)) {
            downloadUrl = resolveDownloadUrlFromUploader(context, distribution, artifact);
        }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/util/Artifacts.java`
#### Snippet
```java
            for (Uploader<?> up : upload.findAllActiveUploaders()) {
                List<String> keys = up.resolveSkipKeys();
                String key = up.getType() + capitalize(up.getName()) + "Path";
                if (artifact.getExtraProperties().containsKey(key) && !isSkip(props, keys)) {
                    return up.getResolvedDownloadUrl(context, artifact);
                }
            }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/HttpAnnouncerValidator.java`
#### Snippet
```java
        if (!announcer.resolveEnabledWithSnapshot(context.getModel().getProject())) {
            context.getLogger().debug(RB.$("validation.disabled"));
            return false;
        }
        if (isBlank(announcer.getName())) {
            context.getLogger().debug(RB.$("validation.disabled"));
            announcer.disable();
            return false;
        }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/assemble/AssemblersValidator.java`
#### Snippet
```java
        Project project = context.getModel().getProject();

        if (!assembler.getJava().isEnabledSet() && project.getJava().isEnabledSet()) {
            assembler.getJava().setEnabled(project.getJava().isEnabled());
        }
        if (!assembler.getJava().isEnabledSet()) {
            assembler.getJava().setEnabled(assembler.getJava().isSet());
        }

        if (!assembler.getJava().isEnabled()) return false;

        if (isBlank(assembler.getJava().getArtifactId())) {
            assembler.getJava().setArtifactId(project.getJava().getArtifactId());
        }
        if (isBlank(assembler.getJava().getGroupId())) {
            assembler.getJava().setGroupId(project.getJava().getGroupId());
        }
        if (isBlank(assembler.getJava().getVersion())) {
            assembler.getJava().setVersion(project.getJava().getVersion());
        }
        if (isBlank(assembler.getJava().getMainModule())) {
            assembler.getJava().setMainModule(project.getJava().getMainModule());
        }
        if (isBlank(assembler.getJava().getMainClass())) {
            assembler.getJava().setMainClass(project.getJava().getMainClass());
        }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/distributions/DistributionsValidator.java`
#### Snippet
```java
        if (isBlank(distribution.getJava().getGroupId())) {
            distribution.getJava().setGroupId(project.getJava().getGroupId());
        }
        if (isBlank(distribution.getJava().getVersion())) {
            distribution.getJava().setVersion(project.getJava().getVersion());
        }
        if (isBlank(distribution.getJava().getMainModule())) {
            distribution.getJava().setMainModule(project.getJava().getMainModule());
        }
        if (isBlank(distribution.getJava().getMainClass())) {
            distribution.getJava().setMainClass(project.getJava().getMainClass());
        }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/assemble/JlinkAssemblerResolver.java`
#### Snippet
```java
            if (!targetJdk.isActiveAndSelected()) continue;

            String platform = targetJdk.getPlatform();
            String platformReplaced = assembler.getPlatform().applyReplacements(platform);
            String str = targetJdk.getExtraProperties()
                .getOrDefault(KEY_ARCHIVE_FORMAT, assembler.getArchiveFormat())
                .toString();
            Archive.Format archiveFormat = Archive.Format.of(str);

            Path image = baseOutputDirectory
                .resolve(imageName + "-" + platformReplaced + "." + archiveFormat.extension())
                .toAbsolutePath();

            if (!Files.exists(image)) {
                errors.assembly(RB.$("validation_missing_assembly",
                    assembler.getType(), assembler.getName(), assembler.getName()));
            } else {
                Artifact artifact = Artifact.of(image, platform);
                artifact.resolveActiveAndSelected(context);
                artifact.setExtraProperties(assembler.getExtraProperties());
                assembler.addOutput(artifact);
            }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/common/TemplateValidator.java`
#### Snippet
```java
            if (isNotBlank(packager.getTemplateDirectory()) &&
                !defaultTemplateDirectory.equals(packager.getTemplateDirectory().trim()) &&
                !Files.exists(context.getBasedir().resolve(packager.getTemplateDirectory().trim()))) {
                errors.configuration(RB.$("validation_directory_not_exist",
                    "distribution." + distribution.getName() + "." + packager.getType() + ".template", packager.getTemplateDirectory()));
            }
            if (isBlank(packager.getTemplateDirectory())) {
                packager.setTemplateDirectory(defaultTemplateDirectory);
            }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/deploy/maven/GiteaMavenDeployerValidator.java`
#### Snippet
```java
validateMavenDeployer(context, mavenDeployer, errors);
        if (!mavenDeployer.isEnabled()) return;

        BaseReleaser<?, ?> service = context.getModel().getRelease().getReleaser();

        mavenDeployer.setUsername(
            checkProperty(context,
                listOf(
                    "deploy.maven." + mavenDeployer.getType() + "." + mavenDeployer.getName() + ".username",
                    "deploy.maven." + mavenDeployer.getType() + ".username",
                    mavenDeployer.getType() + "." + mavenDeployer.getName() + ".username",
                    mavenDeployer.getType() + ".username"),
                "deploy.maven." + mavenDeployer.getType() + "." + mavenDeployer.getName() + ".username",
                mavenDeployer.getUsername(),
                service.getUsername()));

        mavenDeployer.setPassword(
            checkProperty(context,
                listOf(
                    "deploy.maven." + mavenDeployer.getType() + "." + mavenDeployer.getName() + ".password",
                    "deploy.maven." + mavenDeployer.getType() + "." + mavenDeployer.getName() + ".token",
                    "deploy.maven." + mavenDeployer.getType() + ".password",
                    "deploy.maven." + mavenDeployer.getType() + ".token",
                    mavenDeployer.getType() + "." + mavenDeployer.getName() + ".password",
                    mavenDeployer.getType() + "." + mavenDeployer.getName() + ".token",
                    mavenDeployer.getType() + ".password",
                    mavenDeployer.getType() + ".token"),
                "deploy.maven." + mavenDeployer.getType() + "." + mavenDeployer.getName() + ".password",
                mavenDeployer.getPassword(),
                service.getToken()));

        if (isBlank(mavenDeployer.getUsername())) {
            mavenDeployer.setUsername(context.getModel().getRelease().getReleaser().getUsername());
        }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/deploy/maven/MavenDeployersValidator.java`
#### Snippet
```java
                mavenDeployer.setPassword(
                    checkProperty(context,
                        listOf(
                            "deploy.maven." + mavenDeployer.getType() + "." + mavenDeployer.getName() + ".password",
                            "deploy.maven." + mavenDeployer.getType() + "." + mavenDeployer.getName() + ".token",
                            "deploy.maven." + mavenDeployer.getType() + ".password",
                            "deploy.maven." + mavenDeployer.getType() + ".token",
                            mavenDeployer.getType() + "." + mavenDeployer.getName() + ".password",
                            mavenDeployer.getType() + "." + mavenDeployer.getName() + ".token",
                            mavenDeployer.getType() + ".password",
                            mavenDeployer.getType() + ".token"),
                        "deploy.maven." + mavenDeployer.getType() + "." + mavenDeployer.getName() + ".password",
                        mavenDeployer.getPassword(),
                        service.getToken()));
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/hooks/CommandHooksValidator.java`
#### Snippet
```java
        if (hooks.isEnabled()) {
            boolean enabled = hooks.getBefore().stream().anyMatch(CommandHook::isEnabled) ||
                hooks.getSuccess().stream().anyMatch(CommandHook::isEnabled) ||
                hooks.getFailure().stream().anyMatch(CommandHook::isEnabled);

            if (!activeSet && !enabled) {
                context.getLogger().debug(RB.$("validation.disabled"));
                hooks.disable();
            }
        }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/AppImagePackagerValidator.java`
#### Snippet
```java
        resolveActivatable(context, packager, "distributions." + distribution.getName() + "." + packager.getType(), parentPackager);
        if (!packager.resolveEnabled(context.getModel().getProject(), distribution)) {
            context.getLogger().debug(RB.$("validation.disabled"));
            return;
        }
        Releaser<?> service = model.getRelease().getReleaser();
        if (!service.isReleaseSupported()) {
            context.getLogger().debug(RB.$("validation.disabled.release"));
            packager.disable();
            return;
        }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/ChocolateyPackagerValidator.java`
#### Snippet
```java
        Releaser<?> service = model.getRelease().getReleaser();
        if (!service.isReleaseSupported()) {
            context.getLogger().debug(RB.$("validation.disabled.release"));
            packager.disable();
            return;
        }

        List<Artifact> candidateArtifacts = packager.resolveCandidateArtifacts(context, distribution);
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/BrewPackagerValidator.java`
#### Snippet
```java
        List<Artifact> candidateArtifacts = packager.resolveCandidateArtifacts(context, distribution);
        if (candidateArtifacts.isEmpty()) {
            context.getLogger().debug(RB.$("validation.disabled.no.artifacts"));
            errors.warning(RB.$("WARNING.validation.packager.no.artifacts", distribution.getName(),
                packager.getType(), packager.getSupportedFileExtensions(distribution.getType())));
            packager.disable();
            return;
        }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/DockerPackagerValidator.java`
#### Snippet
```java
        resolveActivatable(context, packager, "distributions." + distribution.getName() + "." + packager.getType(), parentPackager);
        if (!packager.resolveEnabled(context.getModel().getProject())) {
            context.getLogger().debug(RB.$("validation.disabled"));
            return;
        }

        List<Artifact> candidateArtifacts = packager.resolveCandidateArtifacts(context, distribution);
        if (candidateArtifacts.isEmpty()) {
            context.getLogger().debug(RB.$("validation.disabled.no.artifacts"));
            errors.warning(RB.$("WARNING.validation.packager.no.artifacts", distribution.getName(),
                packager.getType(), packager.getSupportedFileExtensions(distribution.getType())));
            packager.disable();
            return;
        }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/DockerPackagerValidator.java`
#### Snippet
```java
        if (isBlank(packager.getBaseImage())) {
            packager.setBaseImage(parentPackager.getBaseImage());
        }
        validateBaseImage(distribution, packager, errors);

        if (packager.getImageNames().isEmpty()) {
            packager.setImageNames(parentPackager.getImageNames());
        }

        if (packager.getImageNames().isEmpty()) {
            packager.addImageName("{{repoOwner}}/{{distributionName}}:{{tagName}}");
        }

        if (context.getModel().getProject().isSnapshot()) {
            // find the 1st image that ends with :{{tagName}}
            Optional<String> imageName = packager.getImageNames().stream()
                .filter(n -> n.endsWith(":{{tagName}}") || n.endsWith(":{{ tagName }}"))
                .findFirst();
            // use the first finding or the first imageName
            packager.setImageNames(singleton(imageName.orElse(packager.getImageNames().iterator().next())));
        }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/DockerPackagerValidator.java`
#### Snippet
```java
        packager.setLabels(labels);

        if (!packager.getLabels().containsKey(LABEL_OCI_IMAGE_TITLE)) {
            packager.getLabels().put(LABEL_OCI_IMAGE_TITLE, "{{distributionName}}");
        }
        validateLabels(packager);

        validateArtifactPlatforms(distribution, packager, candidateArtifacts, errors);

        validateRegistries(context, packager, parentPackager, errors, element);
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/DockerPackagerValidator.java`
#### Snippet
```java
        if (!packager.isUseLocalArtifactSet() && parentPackager.isUseLocalArtifactSet()) {
            packager.setUseLocalArtifact(parentPackager.isUseLocalArtifact());
        }
        if (distribution.getType() == org.jreleaser.model.Distribution.DistributionType.SINGLE_JAR) {
            packager.setUseLocalArtifact(true);
        }

        validateBuildx(context, distribution, packager, packager.getBuildx(), parentPackager.getBuildx(), errors);
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/DockerPackagerValidator.java`
#### Snippet
```java
            if (distribution.getType() == org.jreleaser.model.Distribution.DistributionType.JAVA_BINARY ||
                distribution.getType() == org.jreleaser.model.Distribution.DistributionType.SINGLE_JAR ||
                isGraalVMDistribution(distribution)) {
                // TODO: remove in 2.0.0
                if (isBlank(distribution.getJava().getVersion())) {
                    errors.configuration(RB.$("validation_is_missing", "distribution." + distribution.getName() + ".java.version"));
                    return;
                }
                int version = Integer.parseInt(distribution.getJava().getVersion());
                boolean ltsmts = version == 8 || version % 2 == 1;
                docker.setBaseImage("azul/zulu-openjdk-alpine:{{distributionJavaVersion}}" + (ltsmts ? "-jre" : ""));
            } else if (distribution.getType() == org.jreleaser.model.Distribution.DistributionType.JLINK) {
                if (isAlpineCompatible(distribution, docker)) {
                    docker.setBaseImage("alpine:latest");
                } else {
                    docker.setBaseImage("ubuntu:latest");
                }
            } else {
                docker.setBaseImage("scratch");
            }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/DockerPackagerValidator.java`
#### Snippet
```java
        if (!self.getLabels().containsKey(LABEL_OCI_IMAGE_DESCRIPTION)) {
            self.getLabels().put(LABEL_OCI_IMAGE_DESCRIPTION, "{{projectDescription}}");
        }
        if (!self.getLabels().containsKey(LABEL_OCI_IMAGE_URL)) {
            self.getLabels().put(LABEL_OCI_IMAGE_URL, "{{projectWebsite}}");
        }
        if (!self.getLabels().containsKey(LABEL_OCI_IMAGE_LICENSES)) {
            self.getLabels().put(LABEL_OCI_IMAGE_LICENSES, "{{projectLicense}}");
        }
        if (!self.getLabels().containsKey(LABEL_OCI_IMAGE_VERSION)) {
            self.getLabels().put(LABEL_OCI_IMAGE_VERSION, "{{projectVersion}}");
        }
        if (!self.getLabels().containsKey(LABEL_OCI_IMAGE_REVISION)) {
            self.getLabels().put(LABEL_OCI_IMAGE_REVISION, "{{commitFullHash}}");
        }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/JbangPackagerValidator.java`
#### Snippet
```java
        resolveActivatable(context, packager, "distributions." + distribution.getName() + "." + packager.getType(), parentPackager);
        if (!packager.resolveEnabled(context.getModel().getProject(), distribution)) {
            context.getLogger().debug(RB.$("validation.disabled"));
            return;
        }
        BaseReleaser<?, ?> service = model.getRelease().getReleaser();
        if (!service.isReleaseSupported()) {
            context.getLogger().debug(RB.$("validation.disabled.release"));
            packager.disable();
            return;
        }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/JibPackagerValidator.java`
#### Snippet
```java
        if (isBlank(packager.getCreationTime())) {
            packager.setCreationTime(parentPackager.getCreationTime());
        }
        if (isBlank(packager.getUser())) {
            packager.setUser(parentPackager.getUser());
        }
        if (null == packager.getFormat()) {
            packager.setFormat(parentPackager.getFormat());
        }
        if (null == packager.getFormat()) {
            packager.setFormat(org.jreleaser.model.api.packagers.JibConfiguration.Format.DOCKER);
        }
        if (isBlank(packager.getWorkingDirectory())) {
            packager.setWorkingDirectory(parentPackager.getWorkingDirectory());
        }
        if (isBlank(packager.getWorkingDirectory())) {
            packager.setWorkingDirectory("/workspace");
        }
        if (packager.getVolumes().isEmpty()) {
            packager.setVolumes(parentPackager.getVolumes());
        }
        if (packager.getExposedPorts().isEmpty()) {
            packager.setExposedPorts(parentPackager.getExposedPorts());
        }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/JibPackagerValidator.java`
#### Snippet
```java
        Map<String, String> environment = new LinkedHashMap<>();
        environment.putAll(parentPackager.getEnvironment());
        environment.putAll(packager.getEnvironment());
        packager.setEnvironment(environment);

        Map<String, String> labels = new LinkedHashMap<>();
        labels.putAll(parentPackager.getLabels());
        labels.putAll(packager.getLabels());
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/SnapPackagerValidator.java`
#### Snippet
```java
            if (null != tp) {
                cp.getAttributes().putAll(tp.getAttributes());
                Set<String> tmp = new LinkedHashSet<>(cp.getReads());
                tmp.addAll(tp.getReads());
                cp.setReads(new ArrayList<>(tmp));
                tmp = new LinkedHashSet<>(cp.getWrites());
                tmp.addAll(tp.getWrites());
                cp.setWrites(new ArrayList<>(tmp));
            }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/release/GiteaReleaserValidator.java`
#### Snippet
```java
        if (!service.getUpdate().isEnabled()) {
            if (!service.getPrerelease().isEnabledSet()) {
                service.getPrerelease().setEnabled(false);
            }
            if (!service.isDraftSet()) {
                service.setDraft(false);
            }
        }

        if (service.isDraft()) {
            service.getMilestone().setClose(false);
        }

        return service.isEnabled();
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/upload/ArtifactoryUploaderValidator.java`
#### Snippet
```java
        if (!uploader.resolveEnabledWithSnapshot(context.getModel().getProject())) {
            context.getLogger().debug(RB.$("validation.disabled"));
            return;
        }

        if (!uploader.isArtifacts() && !uploader.isFiles() && !uploader.isSignatures()) {
            errors.warning(RB.$("WARNING.validation.uploader.no.artifacts", uploader.getType(), uploader.getName()));
            context.getLogger().debug(RB.$("validation.disabled.no.artifacts"));
            uploader.disable();
            return;
        }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/upload/GiteaUploaderValidator.java`
#### Snippet
```java
        uploader.setToken(
            checkProperty(context,
                listOf(
                    baseKey1 + ".token",
                    baseKey2 + ".token",
                    baseKey3 + ".token",
                    baseKey4 + ".token"),
                baseKey1 + ".token",
                uploader.getToken(),
                errors,
                context.isDryrun()));

        uploader.setHost(
            checkProperty(context,
                listOf(
                    baseKey1 + ".host",
                    baseKey2 + ".host",
                    baseKey3 + ".host",
                    baseKey4 + ".host"),
                baseKey1 + ".host",
                uploader.getHost(),
                errors,
                context.isDryrun()));

        if (isBlank(uploader.getPackageName())) {
            uploader.setPackageName(uploader.getName());
        }
        if (isBlank(uploader.getPackageVersion())) {
            uploader.setPackageVersion("{{projectVersion}}");
        }
```

### DuplicatedCode
Duplicated code
in `core/jreleaser-templates/src/main/java/org/jreleaser/templates/TemplateGenerator.java`
#### Snippet
```java
        try (Writer fileWriter = Files.newBufferedWriter(outputFile, overwrite ? CREATE : CREATE_NEW, WRITE, TRUNCATE_EXISTING);
             BufferedWriter decoratedWriter = new VersionDecoratingWriter(fileWriter)) {
            IOUtils.copy(value.getReader(), decoratedWriter);
        } catch (FileAlreadyExistsException e) {
            logger.error(RB.$("templates.file_exists.error"), outputFile.toAbsolutePath());
            return null;
        } catch (Exception e) {
            throw fail(e);
        }
```

### DuplicatedCode
Duplicated code
in `plugins/jdks-gradle-plugin/src/main/groovy/org/jreleaser/jdks/gradle/plugin/Banner.java`
#### Snippet
```java
        if (checkIfVisited(project)) return;

        ResourceBundle bundle = ResourceBundle.getBundle(Banner.class.getName());
        productVersion = bundle.getString("product.version");
        productId = bundle.getString("product.id");
        String productName = bundle.getString("product.name");
        String banner = MessageFormat.format(bundle.getString("product.banner"), productName, productVersion);

        boolean printBanner = null == System.getProperty(ORG_JRELEASER_BANNER) || Boolean.getBoolean(ORG_JRELEASER_BANNER);

        File parent = new File(project.getGradle().getGradleUserHomeDir(), "caches");
        File markerFile = getMarkerFile(parent);
        if (!markerFile.exists()) {
            if (printBanner) System.err.println(banner);
            markerFile.getParentFile().mkdirs();
            writeQuietly(markerFile, "1");
        } else {
            try {
                int count = Integer.parseInt(readQuietly(markerFile));
                if (count < 3) {
                    if (printBanner) System.err.println(banner);
                }
                writeQuietly(markerFile, (count + 1) + "");
            } catch (NumberFormatException e) {
                if (printBanner) System.err.println(banner);
                writeQuietly(markerFile, "1");
            }
        }
```

### DuplicatedCode
Duplicated code
in `plugins/jdks-maven-plugin/src/main/java/org/jreleaser/jdks/maven/plugin/AbstractDiscoMojo.java`
#### Snippet
```java
        Errors errors = new Errors();
        pkgs.forEach(pkg -> pkg.validate(errors));

        if (errors.hasErrors()) {
            StringWriter s = new StringWriter();
            PrintWriter w = new PrintWriter(s, true);
            errors.logErrors(w);
            throw new MojoFailureException(s.toString());
        }
```

### DuplicatedCode
Duplicated code
in `plugins/jdks-maven-plugin/src/main/java/org/jreleaser/jdks/maven/plugin/Banner.java`
#### Snippet
```java
        if (INSTANCE.visited.contains(project.getName())) {
            return;
        }

        INSTANCE.visited.add(project.getName());

        boolean quiet = log.isErrorEnabled() &&
            !log.isWarnEnabled() &&
            !log.isInfoEnabled() &&
            !log.isDebugEnabled();

        try {
            File parent = new File(System.getProperty("user.home"), "/.m2/caches");
            File markerFile = getMarkerFile(parent);
            if (!markerFile.exists()) {
                if (!quiet) log.info(INSTANCE.message);
                markerFile.getParentFile().mkdirs();
                PrintStream out = newPrintStream(new FileOutputStream(markerFile));
                out.println("1");
                out.close();
                writeQuietly(markerFile, "1");
            } else {
                try {
                    int count = Integer.parseInt(readQuietly(markerFile));
                    if (count < 3 && !quiet) log.info(INSTANCE.message);
                    writeQuietly(markerFile, (count + 1) + "");
                } catch (NumberFormatException e) {
                    writeQuietly(markerFile, "1");
                    if (!quiet) log.info(INSTANCE.message);
                }
            }
        } catch (IOException ignored) {
            // noop
        }
```

### DuplicatedCode
Duplicated code
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/AbstractJReleaserTask.java`
#### Snippet
```java
        if (!values.isEmpty()) return values;
        String resolvedValue = Env.resolve(key, "");
        if (isBlank(resolvedValue)) return Collections.emptyList();
        return Arrays.stream(resolvedValue.trim().split(","))
            .map(String::trim)
            .filter(StringUtils::isNotBlank)
            .collect(toList());
```

### DuplicatedCode
Duplicated code
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/AbstractJReleaserTask.java`
#### Snippet
```java
        Set<String> extensions = new LinkedHashSet<>();

        ServiceLoader<JReleaserConfigParser> parsers = ServiceLoader.load(JReleaserConfigParser.class,
            JReleaserConfigParser.class.getClassLoader());

        for (JReleaserConfigParser parser : parsers) {
            extensions.add("." + parser.getPreferredFileExtension());
        }

        return extensions;
```

### DuplicatedCode
Duplicated code
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/JReleaserFullReleaseTask.java`
#### Snippet
```java
        context.setIncludedDeployerTypes(collectEntries(deployerTypes, true));
        context.setExcludedDeployerTypes(collectEntries(excludedDeployerTypes, true));
        context.setIncludedDeployerNames(deployerNames);
        context.setExcludedDeployerNames(excludedDeployerNames);
        context.setIncludedUploaderTypes(collectEntries(uploaderTypes, true));
        context.setExcludedUploaderTypes(collectEntries(excludedUploaderTypes, true));
        context.setIncludedUploaderNames(uploaderNames);
        context.setExcludedUploaderNames(excludedUploaderNames);
```

### DuplicatedCode
Duplicated code
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/internal/JReleaserProjectConfigurer.groovy`
#### Snippet
```java
                    t.outputDirectory.set(outputDirectory)
                    t.dryrun.set(extension.dryrun)
                    t.gitRootSearch.set(extension.gitRootSearch)
                    t.strict.set(extension.strict)
                    t.model.set(model)
                    t.jlogger.set(loggerProvider)
                    t.usesService(loggerProvider)
```

### DuplicatedCode
Duplicated code
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/internal/dsl/announce/DiscourseAnnouncerImpl.groovy`
#### Snippet
```java
    DiscourseAnnouncerImpl(ObjectFactory objects) {
        super(objects)
        host = objects.property(String).convention(Providers.<String> notDefined())
        username = objects.property(String).convention(Providers.<String> notDefined())
        apiKey = objects.property(String).convention(Providers.<String> notDefined())
        categoryName = objects.property(String).convention(Providers.<String> notDefined())
        title = objects.property(String).convention(Providers.<String> notDefined())
        message = objects.property(String).convention(Providers.<String> notDefined())
        messageTemplate = objects.fileProperty().convention(Providers.notDefined())
    }
```

### DuplicatedCode
Duplicated code
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/internal/dsl/announce/DiscussionsAnnouncerImpl.groovy`
#### Snippet
```java
    DiscussionsAnnouncerImpl(ObjectFactory objects) {
        super(objects)
        organization = objects.property(String).convention(Providers.<String> notDefined())
        team = objects.property(String).convention(Providers.<String> notDefined())
        title = objects.property(String).convention(Providers.<String> notDefined())
        message = objects.property(String).convention(Providers.<String> notDefined())
        messageTemplate = objects.fileProperty().convention(Providers.notDefined())
    }
```

### DuplicatedCode
Duplicated code
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/internal/dsl/announce/SdkmanAnnouncerImpl.groovy`
#### Snippet
```java
        fillProperties(announcer)
        if (consumerKey.present) announcer.consumerKey = consumerKey.get()
        if (consumerToken.present) announcer.consumerToken = consumerToken.get()
        if (candidate.present) announcer.candidate = candidate.get()
        if (releaseNotesUrl.present) announcer.releaseNotesUrl = releaseNotesUrl.get()
```

### DuplicatedCode
Duplicated code
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/internal/dsl/distributions/DistributionImpl.groovy`
#### Snippet
```java
        if (appImage.isSet()) distribution.appImage = appImage.toModel()
        if (asdf.isSet()) distribution.asdf = asdf.toModel()
        if (brew.isSet()) distribution.brew = brew.toModel()
        if (chocolatey.isSet()) distribution.chocolatey = chocolatey.toModel()
        if (docker.isSet()) distribution.docker = docker.toModel()
        if (flatpak.isSet()) distribution.flatpak = flatpak.toModel()
        if (gofish.isSet()) distribution.gofish = gofish.toModel()
        if (jbang.isSet()) distribution.jbang = jbang.toModel()
        if (jib.isSet()) distribution.jib = jib.toModel()
        if (macports.isSet()) distribution.macports = macports.toModel()
        if (scoop.isSet()) distribution.scoop = scoop.toModel()
        if (sdkman.isSet()) distribution.sdkman = sdkman.toModel()
        if (snap.isSet()) distribution.snap = snap.toModel()
        if (spec.isSet()) distribution.spec = spec.toModel()
        if (winget.isSet()) distribution.winget = winget.toModel()
        distribution
```

### DuplicatedCode
Duplicated code
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/internal/dsl/download/AbstractSshDownloader.groovy`
#### Snippet
```java
        if (port.present) downloader.port = port.get()
        if (knownHostsFile.present) {
            downloader.knownHostsFile = knownHostsFile.asFile.get().absolutePath
        }
        downloader.publicKey = publicKey.orNull
        downloader.privateKey = privateKey.orNull
        downloader.passphrase = passphrase.orNull
        downloader.fingerprint = fingerprint.orNull
```

### DuplicatedCode
Duplicated code
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/internal/dsl/packagers/AbstractDockerConfiguration.groovy`
#### Snippet
```java
        if (active.present) docker.active = active.get()
        if (templateDirectory.present) {
            docker.templateDirectory = templateDirectory.get().asFile.toPath().toAbsolutePath().toString()
        }
        docker.skipTemplates = (List<String>) skipTemplates.getOrElse([])
        if (extraProperties.present) docker.extraProperties.putAll(extraProperties.get())
        if (baseImage.present) docker.baseImage = baseImage.get()
```

### DuplicatedCode
Duplicated code
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/internal/dsl/packagers/AppImagePackagerImpl.groovy`
#### Snippet
```java
        packager.skipReleases = (Set<String>) skipReleases.getOrElse(new LinkedHashSet<String>())
        for (ScreenshotImpl screenshot : screenshots) {
            packager.addScreenshot(screenshot.toModel())
        }
        for (IconImpl icon : icons) {
            packager.addIcon(icon.toModel())
        }
        packager
```

### DuplicatedCode
Duplicated code
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/internal/dsl/packagers/DockerPackagerImpl.groovy`
#### Snippet
```java
        DockerRepositoryImpl(ObjectFactory objects) {
            active = objects.property(Active).convention(Providers.<Active> notDefined())
            repoOwner = objects.property(String).convention(Providers.<String> notDefined())
            name = objects.property(String).convention(Providers.<String> notDefined())
            tagName = objects.property(String).convention(Providers.<String> notDefined())
            branch = objects.property(String).convention(Providers.<String> notDefined())
            branchPush = objects.property(String).convention(Providers.<String> notDefined())
            username = objects.property(String).convention(Providers.<String> notDefined())
            token = objects.property(String).convention(Providers.<String> notDefined())
            commitMessage = objects.property(String).convention(Providers.<String> notDefined())
            versionedSubfolders = objects.property(Boolean).convention(Providers.<Boolean> notDefined())
        }
```

### DuplicatedCode
Duplicated code
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/internal/dsl/packagers/DockerPackagerImpl.groovy`
#### Snippet
```java
            if (active.present) tap.active = active.get()
            if (repoOwner.present) tap.owner = repoOwner.get()
            if (name.present) tap.name = name.get()
            if (tagName.present) tap.tagName = tagName.get()
            if (branch.present) tap.branch = branch.get()
            if (branchPush.present) tap.branchPush = branchPush.get()
```

### DuplicatedCode
Duplicated code
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/internal/dsl/release/CodebergReleaserImpl.groovy`
#### Snippet
```java
        toModel(service)
        if (draft.present) service.draft = draft.get()
        service.prerelease = prerelease.toModel()
        service.changelog = changelog.toModel()
        if (milestone.isSet()) service.milestone = milestone.toModel()
        if (commitAuthor.isSet()) service.commitAuthor = commitAuthor.toModel()
        service
```

### DuplicatedCode
Duplicated code
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/internal/dsl/upload/GiteaUploaderImpl.groovy`
#### Snippet
```java
    GiteaUploaderImpl(ObjectFactory objects) {
        super(objects)
        host = objects.property(String).convention(Providers.<String> notDefined())
        owner = objects.property(String).convention(Providers.<String> notDefined())
        token = objects.property(String).convention(Providers.<String> notDefined())
        packageName = objects.property(String).convention(Providers.<String> notDefined())
        packageVersion = objects.property(String).convention(Providers.<String> notDefined())
    }
```

### DuplicatedCode
Duplicated code
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/tasks/AbstractJReleaserTask.groovy`
#### Snippet
```java
    protected List<String> resolveCollection(String key, List<String> values) {
        if (!values.isEmpty()) return values
        String resolvedValue = Env.resolve(key, '')
        if (isBlank(resolvedValue)) return Collections.emptyList()
        return Arrays.stream(resolvedValue.trim().split(','))
            .map({ s -> s.trim() })
            .filter({ s -> isNotBlank(s) })
            .collect(toList())
    }
```

### DuplicatedCode
Duplicated code
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/tasks/JReleaserConfigTask.groovy`
#### Snippet
```java
        if (download.get()) {
            mode = DOWNLOAD
        } else if (announce.get()) {
            mode = ANNOUNCE
        } else if (assembly.get()) {
            mode = ASSEMBLE
        } else if (changelog.get()) {
            mode = CHANGELOG
        } else {
            mode = CONFIG
        }

        JReleaserContext context = createContext()
        ModelValidator.validate(context)
```

### DuplicatedCode
Duplicated code
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/tasks/JReleaserReleaseTask.groovy`
#### Snippet
```java
        ctx.includedDeployerTypes = deployerTypes.orNull
        ctx.excludedDeployerTypes = excludedDeployerTypes.orNull
        ctx.includedDeployerNames = deployerNames.orNull
        ctx.excludedDeployerNames = excludedDeployerNames.orNull
        ctx.includedUploaderTypes = uploaderTypes.orNull
        ctx.excludedUploaderTypes = excludedUploaderTypes.orNull
        ctx.includedUploaderNames = uploaderNames.orNull
        ctx.excludedUploaderNames = excludedUploaderNames.orNull
```

### DuplicatedCode
Duplicated code
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/AbstractJReleaserMojo.java`
#### Snippet
```java
        List<String> list = new ArrayList<>();
        if (null != input && input.length > 0) {
            for (String s : input) {
                if (isNotBlank(s)) {
                    if (!s.contains("-") && lowerCase) {
                        s = StringUtils.getHyphenatedName(s);
                    }
                    list.add(lowerCase ? s.toLowerCase(Locale.ENGLISH) : s);
                }
            }
        }
        return list;
```

### DuplicatedCode
Duplicated code
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/AbstractPlatformAwareMojo.java`
#### Snippet
```java
        boolean resolvedSelectCurrentPlatform = resolveBoolean(org.jreleaser.model.api.JReleaserContext.SELECT_CURRENT_PLATFORM, selectCurrentPlatform);
        if (resolvedSelectCurrentPlatform) return Collections.singletonList(PlatformUtils.getCurrentFull());

        List<String> list = new ArrayList<>();
        if (null != selectPlatforms && selectPlatforms.length > 0) {
            Collections.addAll(list, selectPlatforms);
        }
        return resolveCollection(org.jreleaser.model.api.JReleaserContext.SELECT_PLATFORMS, list);
```

### DuplicatedCode
Duplicated code
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/JReleaserFullReleaseMojo.java`
#### Snippet
```java
        context.setIncludedCatalogers(collectEntries(includedCatalogers, true));
        context.setExcludedDeployerTypes(collectEntries(excludedDeployers, true));
        context.setExcludedDeployerNames(collectEntries(excludedDeployerNames));
        context.setExcludedUploaderTypes(collectEntries(excludedUploaders, true));
        context.setExcludedUploaderNames(collectEntries(excludedUploaderNames));
        context.setExcludedDistributions(collectEntries(excludedDistributions));
```

### DuplicatedCode
Duplicated code
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Catalog.java`
#### Snippet
```java
        super.collectCandidateDeprecatedArgs(args);
        args.add(new DeprecatedArg("-y", "--deployer", "1.5.0"));
        args.add(new DeprecatedArg("-yn", "--deployer-name", "1.5.0"));
        args.add(new DeprecatedArg("-xy", "--exclude-deployer", "1.5.0"));
        args.add(new DeprecatedArg("-xyn", "--exclude-deployer-name", "1.5.0"));
```

### DuplicatedCode
Duplicated code
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/FullRelease.java`
#### Snippet
```java
        args.add(new DeprecatedArg("-y", "--deployer", "1.5.0"));
        args.add(new DeprecatedArg("-yn", "--deployer-name", "1.5.0"));
        args.add(new DeprecatedArg("-xy", "--exclude-deployer", "1.5.0"));
        args.add(new DeprecatedArg("-xyn", "--exclude-deployer-name", "1.5.0"));
        args.add(new DeprecatedArg("-u", "--uploader", "1.5.0"));
        args.add(new DeprecatedArg("-un", "--uploader-name", "1.5.0"));
        args.add(new DeprecatedArg("-xu", "--exclude-uploader", "1.5.0"));
        args.add(new DeprecatedArg("-xun", "--exclude-uploader-name", "1.5.0"));
```

### DuplicatedCode
Duplicated code
in `sdks/jreleaser-artifactory-java-sdk/src/main/java/org/jreleaser/sdk/artifactory/ArtifactoryArtifactUploader.java`
#### Snippet
```java
                    FormData data = ClientUtils.toFormData(path);

                    Map<String, String> headers = new LinkedHashMap<>();
                    switch (uploader.resolveAuthorization()) {
                        case BASIC:
                            String auth = username + ":" + password;
                            byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(UTF_8));
                            auth = new String(encodedAuth, UTF_8);
                            headers.put("Authorization", "Basic " + auth);
                            break;
                        case BEARER:
                            headers.put("Authorization", "Bearer " + password);
                            break;
                        default:
                            // noop
                    }
```

### DuplicatedCode
Duplicated code
in `sdks/jreleaser-artifactory-java-sdk/src/main/java/org/jreleaser/sdk/artifactory/ArtifactoryMavenDeployer.java`
#### Snippet
```java
        Set<Deployable> deployables = collectDeployables();
        if (deployables.isEmpty()) {
            context.getLogger().info(RB.$("artifacts.no.match"));
        }

        String baseUrl = deployer.getResolvedUrl(context.fullProps());
        String username = deployer.getUsername();
        String password = deployer.getPassword();

        if (!baseUrl.endsWith("/")) {
            baseUrl += "/";
        }
```

### DuplicatedCode
Duplicated code
in `sdks/jreleaser-bluesky-java-sdk/src/main/java/org/jreleaser/sdk/bluesky/BlueskyAnnouncer.java`
#### Snippet
```java
        List<String> statuses = new ArrayList<>();

        if (isNotBlank(bluesky.getStatusTemplate())) {
            TemplateContext props = new TemplateContext();
            context.getModel().getRelease().getReleaser().fillProps(props, context.getModel());
            Arrays.stream(bluesky.getResolvedStatusTemplate(context, props)
                    .split(System.lineSeparator()))
                .filter(StringUtils::isNotBlank)
                .map(String::trim)
                .forEach(statuses::add);
        }
        if (statuses.isEmpty() && !bluesky.getStatuses().isEmpty()) {
            bluesky.getStatuses().stream()
                .filter(StringUtils::isNotBlank)
                .map(String::trim)
                .forEach(statuses::add);
        }
        if (statuses.isEmpty()) {
            statuses.add(bluesky.getStatus());
        }
```

### DuplicatedCode
Duplicated code
in `sdks/jreleaser-bluesky-java-sdk/src/main/java/org/jreleaser/sdk/bluesky/BlueskyAnnouncer.java`
#### Snippet
```java
        TemplateContext props = context.fullProps();
        applyTemplates(props, context.getModel().getAnnounce().getTwitter().resolvedExtraProperties());
        props.set(KEY_TAG_NAME, context.getModel().getRelease().getReleaser().getEffectiveTagName(context.getModel()));
        props.set(KEY_PREVIOUS_TAG_NAME, context.getModel().getRelease().getReleaser().getResolvedPreviousTagName(context.getModel()));
        return resolveTemplate(message, props);
```

### DuplicatedCode
Duplicated code
in `sdks/jreleaser-codeberg-java-sdk/src/main/java/org/jreleaser/sdk/codeberg/CodebergReleaser.java`
#### Snippet
```java
        String pullBranch = codeberg.getBranch();
        String pushBranch = codeberg.getResolvedBranchPush(context.getModel());
        boolean mustCheckoutBranch = !pushBranch.equals(pullBranch);
        context.getLogger().info(RB.$("git.releaser.releasing"), codeberg.getResolvedRepoUrl(context.getModel()), pushBranch);
        String tagName = codeberg.getEffectiveTagName(context.getModel());
```

### DuplicatedCode
Duplicated code
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/GithubReleaser.java`
#### Snippet
```java
            if (!context.isDryrun()) {
                List<String> branchNames = api.listBranches(github.getOwner(), github.getName());
                if (mustCheckoutBranch) {
                    GitSdk.of(context).checkoutBranch(github, pushBranch, !branchNames.contains(pushBranch));
                }
            }

            String changelog = context.getChangelog().getResolvedChangelog();

            context.getLogger().debug(RB.$("git.releaser.release.lookup"), tagName, github.getCanonicalRepoName());
```

### DuplicatedCode
Duplicated code
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/GithubReleaser.java`
#### Snippet
```java
                    context.getLogger().debug(RB.$("git.releaser.release.delete"), tagName);
                    if (!context.isDryrun()) {
                        api.deleteRelease(github.getOwner(), github.getName(), tagName, release.getId());
                    }
                    context.getLogger().debug(RB.$("git.releaser.release.create"), tagName);
                    createRelease(api, tagName, changelog, github.isMatch());
```

### DuplicatedCode
Duplicated code
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/GithubReleaser.java`
#### Snippet
```java
                        if (github.getPrerelease().isEnabledSet()) {
                            updater.setPrerelease(github.getPrerelease().isEnabled());
                        }
                        if (github.isDraftSet()) {
                            updater.setDraft(github.isDraft());
                        }
                        if (github.getUpdate().getSections().contains(UpdateSection.TITLE)) {
                            context.getLogger().info(RB.$("git.releaser.release.update.title"), github.getEffectiveReleaseName());
                            updater.setName(github.getEffectiveReleaseName());
                        }
                        if (github.getUpdate().getSections().contains(UpdateSection.BODY)) {
                            context.getLogger().info(RB.$("git.releaser.release.update.body"));
                            updater.setBody(changelog);
                        }
                        api.updateRelease(github.getOwner(), github.getName(), release.getId(), updater);

                        if (github.getUpdate().getSections().contains(UpdateSection.ASSETS)) {
                            updateAssets(api, release);
                        }
```

### DuplicatedCode
Duplicated code
in `sdks/jreleaser-codeberg-java-sdk/src/main/java/org/jreleaser/sdk/codeberg/CodebergReleaser.java`
#### Snippet
```java
        context.getLogger().debug(RB.$("git.repository.lookup"), owner, repo);

        Gitea api = new Gitea(context.getLogger(),
            codeberg.getApiEndpoint(),
            password,
            codeberg.getConnectTimeout(),
            codeberg.getReadTimeout());
        GtRepository repository = api.findRepository(owner, repo);
        if (null == repository) {
            repository = api.createRepository(owner, repo);
        }

        return new Repository(
            resolveRepositoryKind(),
            owner,
            repo,
            repository.getHtmlUrl(),
            repository.getCloneUrl());
```

### DuplicatedCode
Duplicated code
in `sdks/jreleaser-codeberg-java-sdk/src/main/java/org/jreleaser/sdk/codeberg/CodebergReleaser.java`
#### Snippet
```java
        try {
            String host = codeberg.getHost();
            String endpoint = codeberg.getApiEndpoint();
            if (endpoint.startsWith("https")) {
                host = "https://" + host;
            } else {
                host = "http://" + host;
            }
            if (!host.endsWith("/")) {
                host += "/";
            }

            return new Gitea(context.getLogger(),
                codeberg.getApiEndpoint(),
                codeberg.getToken(),
                codeberg.getConnectTimeout(),
                codeberg.getReadTimeout())
                .findUser(email, name, host);
        } catch (RestAPIException e) {
            context.getLogger().trace(e);
            context.getLogger().debug(RB.$("git.releaser.user.not.found"), email);
        }

        return Optional.empty();
```

### DuplicatedCode
Duplicated code
in `sdks/jreleaser-codeberg-java-sdk/src/main/java/org/jreleaser/sdk/codeberg/CodebergReleaser.java`
#### Snippet
```java
        Gitea api = new Gitea(context.getLogger(),
            codeberg.getApiEndpoint(),
            codeberg.getToken(),
            codeberg.getConnectTimeout(),
            codeberg.getReadTimeout());

        List<Release> releases = api.listReleases(owner, repo);

        VersionUtils.clearUnparseableTags();
        Pattern versionPattern = VersionUtils.resolveVersionPattern(context);
        for (Release release : releases) {
            release.setVersion(VersionUtils.version(context, release.getTagName(), versionPattern));
        }

        releases.sort((r1, r2) -> r2.getVersion().compareTo(r1.getVersion()));

        return releases;
```

### DuplicatedCode
Duplicated code
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/GithubReleaser.java`
#### Snippet
```java
        List<Release> releases = api.listReleases(owner, repo);

        VersionUtils.clearUnparseableTags();
        Pattern versionPattern = VersionUtils.resolveVersionPattern(context);
        for (Release release : releases) {
            release.setVersion(VersionUtils.version(context, release.getTagName(), versionPattern));
        }

        releases.sort((r1, r2) -> r2.getVersion().compareTo(r1.getVersion()));

        return releases;
```

### DuplicatedCode
Duplicated code
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/GitlabReleaser.java`
#### Snippet
```java
        VersionUtils.clearUnparseableTags();
        Pattern versionPattern = VersionUtils.resolveVersionPattern(context);
        for (Release release : releases) {
            release.setVersion(VersionUtils.version(context, release.getTagName(), versionPattern));
        }

        releases.sort((r1, r2) -> r2.getVersion().compareTo(r1.getVersion()));

        return releases;
```

### DuplicatedCode
Duplicated code
in `sdks/jreleaser-codeberg-java-sdk/src/main/java/org/jreleaser/sdk/codeberg/CodebergReleaser.java`
#### Snippet
```java
        if (context.isDryrun()) {
            for (Asset asset : assets) {
                if (0 == Files.size(asset.getPath()) || !Files.exists(asset.getPath())) {
                    // do not upload empty or non existent files
                    continue;
                }

                context.getLogger().info(" " + RB.$("git.upload.asset"), asset.getFilename());
            }
            updateIssues(codeberg, api);
            return;
        }

        if (deleteTags) {
            deleteTags(api, codeberg.getOwner(), codeberg.getName(), tagName);
        }

        // local tag
        if (deleteTags || !codeberg.isSkipTag()) {
            context.getLogger().debug(RB.$("git.releaser.repository.tag"), tagName);
            GitSdk.of(context).tag(tagName, true, context);
        }
```

### DuplicatedCode
Duplicated code
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/GithubReleaser.java`
#### Snippet
```java
        release.setName(github.getEffectiveReleaseName());
        release.setTagName(tagName);
        release.setTargetCommitish(github.getResolvedBranchPush(context.getModel()));
        release.setBody(changelog);
        if (github.getPrerelease().isEnabledSet()) {
            release.setPrerelease(github.getPrerelease().isEnabled());
        }
        if (github.isDraftSet()) {
            release.setDraft(github.isDraft());
        }
```

### DuplicatedCode
Duplicated code
in `sdks/jreleaser-codeberg-java-sdk/src/main/java/org/jreleaser/sdk/codeberg/CodebergReleaser.java`
#### Snippet
```java
        if (!codeberg.getIssues().isEnabled()) return;

        List<String> issueNumbers = ChangelogProvider.getIssues(context);

        if (!issueNumbers.isEmpty()) {
            context.getLogger().info(RB.$("git.issue.release.mark", issueNumbers.size()));
        }

        if (context.isDryrun()) {
            for (String issueNumber : issueNumbers) {
                context.getLogger().debug(RB.$("git.issue.release", issueNumber));
            }
            return;
        }
```

### DuplicatedCode
Duplicated code
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/GitlabReleaser.java`
#### Snippet
```java
        String labelName = gitlab.getIssues().getLabel().getName();
        String labelColor = gitlab.getIssues().getLabel().getColor();
        TemplateContext props = gitlab.props(context.getModel());
        gitlab.fillProps(props, context.getModel());
        String comment = resolveTemplate(gitlab.getIssues().getComment(), props);
```

### DuplicatedCode
Duplicated code
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/GithubReleaser.java`
#### Snippet
```java
        Apply applyMilestone = github.getIssues().getApplyMilestone();
        if (github.getMilestone().isClose() && !context.getModel().getProject().isSnapshot()) {
            milestone = api.findMilestoneByName(
                github.getOwner(),
                github.getName(),
                github.getMilestone().getEffectiveName());

            if (!milestone.isPresent()) {
                milestone = api.findClosedMilestoneByName(
                    github.getOwner(),
                    github.getName(),
                    github.getMilestone().getEffectiveName());
            }
        }
```

### DuplicatedCode
Duplicated code
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/GithubReleaser.java`
#### Snippet
```java
            if ("closed".equals(ghIssue.getState()) && ghIssue.getLabels().stream().noneMatch(l -> l.getName().equals(labelName))) {
                context.getLogger().debug(RB.$("git.issue.release", issueNumber));
                api.addLabelToIssue(github.getOwner(), github.getName(), ghIssue, ghLabel);
                api.commentOnIssue(github.getOwner(), github.getName(), ghIssue, comment);

                milestone.ifPresent(ghMilestone -> applyMilestone(github, api, issueNumber, ghIssue, applyMilestone, ghMilestone));
            }
```

### DuplicatedCode
Duplicated code
in `sdks/jreleaser-codeberg-java-sdk/src/main/java/org/jreleaser/sdk/codeberg/CodebergReleaser.java`
#### Snippet
```java
        GtMilestone issueMilestone = gtIssue.getMilestone();
        String targetMilestoneTitle = targetMilestone.getTitle();

        if (null == issueMilestone) {
            context.getLogger().debug(RB.$("git.issue.milestone.apply", targetMilestoneTitle, issueNumber));
            api.setMilestoneOnIssue(codeberg.getOwner(), codeberg.getName(), gtIssue, targetMilestone);
        } else {
            String milestoneTitle = issueMilestone.getTitle();

            if (applyMilestone == Apply.ALWAYS) {
                context.getLogger().debug(uncapitalize(RB.$("git.issue.milestone.warn", issueNumber, milestoneTitle)));
            } else if (applyMilestone == Apply.WARN) {
                if (!milestoneTitle.equals(targetMilestoneTitle)) {
                    context.getLogger().warn(RB.$("git.issue.milestone.warn", issueNumber, milestoneTitle));
                }
            } else if (applyMilestone == Apply.FORCE) {
                if (!milestoneTitle.equals(targetMilestoneTitle)) {
                    context.getLogger().warn(RB.$("git.issue.milestone.force", targetMilestoneTitle, issueNumber, milestoneTitle));
                    api.setMilestoneOnIssue(codeberg.getOwner(), codeberg.getName(), gtIssue, targetMilestone);
                } else {
                    context.getLogger().debug(uncapitalize(RB.$("git.issue.milestone.warn", issueNumber, milestoneTitle)));
                }
            }
        }
```

### DuplicatedCode
Duplicated code
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/GithubReleaser.java`
#### Snippet
```java
        String targetMilestoneTitle = targetMilestone.getTitle();

        if (null == issueMilestone) {
            context.getLogger().debug(RB.$("git.issue.milestone.apply", targetMilestoneTitle, issueNumber));
            api.setMilestoneOnIssue(github.getOwner(), github.getName(), ghIssue, targetMilestone);
        } else {
            String milestoneTitle = issueMilestone.getTitle();

            if (applyMilestone == Apply.ALWAYS) {
                context.getLogger().debug(uncapitalize(RB.$("git.issue.milestone.warn", issueNumber, milestoneTitle)));
            } else if (applyMilestone == Apply.WARN) {
                if (!milestoneTitle.equals(targetMilestoneTitle)) {
                    context.getLogger().warn(RB.$("git.issue.milestone.warn", issueNumber, milestoneTitle));
                }
            } else if (applyMilestone == Apply.FORCE) {
                if (!milestoneTitle.equals(targetMilestoneTitle)) {
                    context.getLogger().warn(RB.$("git.issue.milestone.force", targetMilestoneTitle, issueNumber, milestoneTitle));
                    api.setMilestoneOnIssue(github.getOwner(), github.getName(), ghIssue, targetMilestone);
                } else {
                    context.getLogger().debug(uncapitalize(RB.$("git.issue.milestone.warn", issueNumber, milestoneTitle)));
                }
            }
        }
```

### DuplicatedCode
Duplicated code
in `sdks/jreleaser-codeberg-java-sdk/src/main/java/org/jreleaser/sdk/codeberg/CodebergReleaser.java`
#### Snippet
```java
        Set<Asset> assetsToBeUpdated = new TreeSet<>();
        Set<Asset> assetsToBeUploaded = new TreeSet<>();

        Map<String, GtAsset> existingAssets = api.listAssets(codeberg.getOwner(), codeberg.getName(), release);
        Map<String, Asset> assetsToBePublished = new LinkedHashMap<>();
        assets.forEach(asset -> assetsToBePublished.put(asset.getFilename(), asset));

        assetsToBePublished.keySet().forEach(name -> {
            if (existingAssets.containsKey(name)) {
                assetsToBeUpdated.add(assetsToBePublished.get(name));
            } else {
                assetsToBeUploaded.add(assetsToBePublished.get(name));
            }
        });

        api.updateAssets(codeberg.getOwner(), codeberg.getName(), release, assetsToBeUpdated, existingAssets);
        api.uploadAssets(codeberg.getOwner(), codeberg.getName(), release, assetsToBeUploaded);
```

### DuplicatedCode
Duplicated code
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/GithubReleaser.java`
#### Snippet
```java
        Map<String, Asset> assetsToBePublished = new LinkedHashMap<>();
        assets.forEach(asset -> assetsToBePublished.put(asset.getFilename(), asset));

        assetsToBePublished.keySet().forEach(name -> {
            if (existingAssets.containsKey(name)) {
                assetsToBeUpdated.add(assetsToBePublished.get(name));
            } else {
                assetsToBeUploaded.add(assetsToBePublished.get(name));
            }
        });
```

### DuplicatedCode
Duplicated code
in `sdks/jreleaser-discourse-java-sdk/src/main/java/org/jreleaser/sdk/discourse/DiscourseAnnouncer.java`
#### Snippet
```java
        String message = "";
        if (isNotBlank(discourse.getMessage())) {
            message = discourse.getResolvedMessage(context);
        } else {
            TemplateContext props = new TemplateContext();
            context.getModel().getRelease().getReleaser().fillProps(props, context.getModel());
            message = discourse.getResolvedMessageTemplate(context, props);
        }
```

### DuplicatedCode
Duplicated code
in `sdks/jreleaser-ftp-java-sdk/src/main/java/org/jreleaser/sdk/ftp/FtpArtifactDownloader.java`
#### Snippet
```java
        String input = asset.getResolvedInput(context, downloader);
        String output = asset.getResolvedOutput(context, downloader, Paths.get(input).getFileName().toString());

        if (isBlank(output)) {
            output = Paths.get(input).getFileName().toString();
        }

        Path outputPath = context.getDownloadDirectory().resolve(name).resolve(output);
        context.getLogger().info("{} -> {}", input, context.relativizeToBasedir(outputPath));
```

### DuplicatedCode
Duplicated code
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/ChangelogGenerator.java`
#### Snippet
```java
                    if (previousTag.isPresent()) {
                        tag = previousTag;
                    }

                    if (!tag.isPresent()) {
                        context.getLogger().debug(RB.$("changelog.generator.lookup.matching.tag"), tagPattern, effectiveTagName);

                        tag = tags.stream()
                            .filter(ref -> !extractTagName(ref).equals(effectiveTagName))
                            .filter(ref -> versionPattern.matcher(extractTagName(ref)).matches())
                            .filter(ref -> currentVersion.equalsSpec(version(context, ref, versionPattern, true)))
                            .filter(ref -> !defaultVersion.equals(version(context, ref, versionPattern, true)))
                            .findFirst();
                    }
```

### DuplicatedCode
Duplicated code
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/JReleaserGpgSigner.java`
#### Snippet
```java
                cmd.setExecutable(signing.getCommand().getExecutable());
                cmd.setPassphrase(signing.getPassphrase());
                cmd.setHomeDir(signing.getCommand().getHomeDir());
                cmd.setKeyName(signing.getCommand().getKeyName());
                cmd.setPublicKeyring(signing.getCommand().getPublicKeyring());
                cmd.setDefaultKeyring(signing.getCommand().isDefaultKeyring());
                cmd.setArgs(signing.getCommand().getArgs());
```

### DuplicatedCode
Duplicated code
in `sdks/jreleaser-gitea-java-sdk/src/main/java/org/jreleaser/sdk/gitea/internal/PaginatingDecoder.java`
#### Snippet
```java
        if (type instanceof ParameterizedType) {
            ParameterizedType pt = (ParameterizedType) type;
            if (pt.getRawType().getTypeName().equals(Page.class.getName())) {
                return new Page<>(response.headers(), super.decode(response, pt.getActualTypeArguments()[0]));
            }
        }
        return super.decode(response, type);
```

### DuplicatedCode
Duplicated code
in `sdks/jreleaser-java-sdk-commons/src/main/java/org/jreleaser/sdk/commons/ClientUtils.java`
#### Snippet
```java
            logger.debug(RB.$("webhook.connection.open"));
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            // set options
            logger.debug(RB.$("webhook.connection.configure"));
            connection.setConnectTimeout(connectTimeout * 1000);
            connection.setReadTimeout(readTimeout * 1000);
            connection.setAllowUserInteraction(false);
            connection.setInstanceFollowRedirects(true);
```

### DuplicatedCode
Duplicated code
in `sdks/jreleaser-sdkman-java-sdk/src/main/java/org/jreleaser/sdk/sdkman/MajorReleaseSdkmanCommand.java`
#### Snippet
```java
            requireNonBlank(apiHost, "'apiHost' must not be blank");
            requireNonBlank(consumerKey, "'consumerKey' must not be blank");
            requireNonBlank(consumerToken, "'consumerToken' must not be blank");
            requireNonBlank(candidate, "'candidate' must not be blank");
            requireNonBlank(version, "'version' must not be blank");

            // url is required if platforms is empty
            if ((platforms.isEmpty()) && isBlank(url)) {
                throw new IllegalArgumentException("Missing url");
            }
            if (isNotBlank(url)) {
                platforms.put("UNIVERSAL", url);
            }
```

### DuplicatedCode
Duplicated code
in `sdks/jreleaser-signing-java-sdk/src/main/java/org/jreleaser/sdk/signing/SigningUtils.java`
#### Snippet
```java
        if (Files.notExists(pair.getSignatureFile())) {
            context.getLogger().debug(RB.$("signing.signature.not.exist"),
                context.relativizeToBasedir(pair.getSignatureFile()));
            return false;
        }

        if (pair.inputFile.toFile().lastModified() > pair.signatureFile.toFile().lastModified()) {
            context.getLogger().debug(RB.$("signing.file.newer"),
                context.relativizeToBasedir(pair.inputFile),
                context.relativizeToBasedir(pair.signatureFile));
            return false;
        }
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
'catch' parameter named `ignored` is used
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/AbstractPackagerProcessor.java`
#### Snippet
```java
            try {
                artifactSize = Files.size(artifactPath);
            } catch (IOException ignored) {
                // this would be strange
                context.getLogger().trace(ignored);
```

## RuleId[id=OctalLiteral]
### OctalLiteral
Octal integer `0777`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java

    private static int getEntryMode(ArchiveEntry entry, int mode, File file) {
        int unixMode = mode & 0777;
        if (unixMode == 0) {
            if (entry.isDirectory()) {
```

### OctalLiteral
Octal integer `0755`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
        if (unixMode == 0) {
            if (entry.isDirectory()) {
                unixMode = 0755;
            } else if ("bin".equalsIgnoreCase(file.getParentFile().getName())) {
                // zipEntry.unixMode returns 0 most times even if the entry is executable
```

### OctalLiteral
Octal integer `0777`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
                // zipEntry.unixMode returns 0 most times even if the entry is executable
                // force executable bit only if parent dir == 'bin'
                unixMode = 0777;
            } else {
                unixMode = 0644;
```

### OctalLiteral
Octal integer `0644`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
                unixMode = 0777;
            } else {
                unixMode = 0644;
            }
        }
```

### OctalLiteral
Octal integer `0100755`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
                archiveEntry.setMethod(ZipOutputStream.DEFLATED);
                if (inputFile.isFile() && Files.isExecutable(path)) {
                    archiveEntry.setUnixMode(0100755);
                }

```

### OctalLiteral
Octal integer `0100755`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java

            if (inputFile.isFile() && Files.isExecutable(path)) {
                archiveEntry.setMode(0100755);
            }

```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[\\w]` can be simplified to '\\w'
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
    private static final String PROPERTY_SET_PREFIX = "set";
    private static final String PROPERTY_GET_PREFIX = "get";
    private static final Pattern GETTER_PATTERN_1 = Pattern.compile("^get[A-Z][\\w]*$");
    private static final Pattern GETTER_PATTERN_2 = Pattern.compile("^is[A-Z][\\w]*$");
    private static final Pattern SETTER_PATTERN = Pattern.compile("^set[A-Z][\\w]*$");
```

### RegExpSimplifiable
`[\\w]` can be simplified to '\\w'
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
    private static final String PROPERTY_GET_PREFIX = "get";
    private static final Pattern GETTER_PATTERN_1 = Pattern.compile("^get[A-Z][\\w]*$");
    private static final Pattern GETTER_PATTERN_2 = Pattern.compile("^is[A-Z][\\w]*$");
    private static final Pattern SETTER_PATTERN = Pattern.compile("^set[A-Z][\\w]*$");
    private static final String ERROR_METHOD_NULL = "Argument 'method' must not be null";
```

### RegExpSimplifiable
`[\\w]` can be simplified to '\\w'
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
    private static final Pattern GETTER_PATTERN_1 = Pattern.compile("^get[A-Z][\\w]*$");
    private static final Pattern GETTER_PATTERN_2 = Pattern.compile("^is[A-Z][\\w]*$");
    private static final Pattern SETTER_PATTERN = Pattern.compile("^set[A-Z][\\w]*$");
    private static final String ERROR_METHOD_NULL = "Argument 'method' must not be null";
    private static final Pattern REGEX_CHARS = Pattern.compile("[{}()\\[\\].+*?^$\\\\|/]");
```

## RuleId[id=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `v.length() + 1 + p.length() + 1`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaModuleVersion.java`
#### Snippet
```java
            if (version.charAt(v.length()) == '-') {
                p = take(version, v.length() + 1, listOf('+'));
                if (v.length() + 1 + p.length() + 1 < version.length()) {
                    b = take(version, v.length() + 1 + p.length() + 1, emptyList());
                }
```

### DuplicateExpressions
Multiple occurrences of `v.length() + 1 + p.length() + 1`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaModuleVersion.java`
#### Snippet
```java
                p = take(version, v.length() + 1, listOf('+'));
                if (v.length() + 1 + p.length() + 1 < version.length()) {
                    b = take(version, v.length() + 1 + p.length() + 1, emptyList());
                }
            } else {
```

### DuplicateExpressions
Multiple occurrences of `Paths.get(input)`
in `sdks/jreleaser-ftp-java-sdk/src/main/java/org/jreleaser/sdk/ftp/FtpArtifactDownloader.java`
#### Snippet
```java
    private void downloadAsset(String name, FTPClient ftp, Downloader.Asset asset) throws DownloadException {
        String input = asset.getResolvedInput(context, downloader);
        String output = asset.getResolvedOutput(context, downloader, Paths.get(input).getFileName().toString());

        if (isBlank(output)) {
```

### DuplicateExpressions
Multiple occurrences of `Paths.get(input)`
in `sdks/jreleaser-ftp-java-sdk/src/main/java/org/jreleaser/sdk/ftp/FtpArtifactDownloader.java`
#### Snippet
```java

        if (isBlank(output)) {
            output = Paths.get(input).getFileName().toString();
        }

```

### DuplicateExpressions
Multiple occurrences of `Paths.get(input)`
in `sdks/jreleaser-ssh-java-sdk/src/main/java/org/jreleaser/sdk/ssh/ScpArtifactDownloader.java`
#### Snippet
```java
    private void downloadAsset(String name, SSHClient ssh, Downloader.Asset asset) throws DownloadException {
        String input = asset.getResolvedInput(context, downloader);
        String output = asset.getResolvedOutput(context, downloader, Paths.get(input).getFileName().toString());

        if (isBlank(output)) {
```

### DuplicateExpressions
Multiple occurrences of `Paths.get(input)`
in `sdks/jreleaser-ssh-java-sdk/src/main/java/org/jreleaser/sdk/ssh/ScpArtifactDownloader.java`
#### Snippet
```java

        if (isBlank(output)) {
            output = Paths.get(input).getFileName().toString();
        }

```

### DuplicateExpressions
Multiple occurrences of `Paths.get(input)`
in `sdks/jreleaser-ssh-java-sdk/src/main/java/org/jreleaser/sdk/ssh/SftpArtifactDownloader.java`
#### Snippet
```java
    private void downloadAsset(String name, SFTPClient sftp, Downloader.Asset asset) throws DownloadException {
        String input = asset.getResolvedInput(context, downloader);
        String output = asset.getResolvedOutput(context, downloader, Paths.get(input).getFileName().toString());

        if (isBlank(output)) {
```

### DuplicateExpressions
Multiple occurrences of `Paths.get(input)`
in `sdks/jreleaser-ssh-java-sdk/src/main/java/org/jreleaser/sdk/ssh/SftpArtifactDownloader.java`
#### Snippet
```java

        if (isBlank(output)) {
            output = Paths.get(input).getFileName().toString();
        }

```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java
        @Override
        public InputStream readFile(String fileName) throws IOException {
            return new FileInputStream(fileName);
        }
    }
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/sign/Signer.java`
#### Snippet
```java
        try (InputStream sigInputStream = PGPUtil.getDecoderStream(
            new BufferedInputStream(
                new FileInputStream(filePair.getSignatureFile().toFile())))) {
            PGPObjectFactory pgpObjFactory = new PGPObjectFactory(sigInputStream, keyring.getKeyFingerPrintCalculator());
            Iterable<?> pgpSigList = null;
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/sign/Signer.java`
#### Snippet
```java

            PGPSignature sig = (PGPSignature) pgpSigList.iterator().next();
            try (InputStream fileInputStream = new BufferedInputStream(new FileInputStream(filePair.getInputFile().toFile()))) {
                PGPPublicKey pubKey = keyring.readPublicKey();
                sig.init(new JcaPGPContentVerifierBuilderProvider()
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `core/jreleaser-templates/src/main/java/org/jreleaser/templates/TemplateGenerator.java`
#### Snippet
```java
                }
            } else {
                try (OutputStream outputStream = new FileOutputStream(outputFile.toFile())) {
                    IOUtils.copy(value.getInputStream(), outputStream);
                } catch (FileAlreadyExistsException e) {
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `sdks/jreleaser-signing-java-sdk/src/main/java/org/jreleaser/sdk/signing/SigningUtils.java`
#### Snippet
```java
        try (InputStream sigInputStream = PGPUtil.getDecoderStream(
            new BufferedInputStream(
                new FileInputStream(filePair.signatureFile.toFile())))) {

            PGPObjectFactory pgpObjFactory = new PGPObjectFactory(sigInputStream, keyring.getKeyFingerPrintCalculator());
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `sdks/jreleaser-signing-java-sdk/src/main/java/org/jreleaser/sdk/signing/SigningUtils.java`
#### Snippet
```java

            PGPSignature sig = (PGPSignature) pgpSigList.iterator().next();
            try (InputStream fileInputStream = new BufferedInputStream(new FileInputStream(filePair.inputFile.toFile()))) {
                PGPPublicKey pubKey = keyring.readPublicKey();
                sig.init(new JcaPGPContentVerifierBuilderProvider()
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `sdks/jreleaser-signing-java-sdk/src/main/java/org/jreleaser/sdk/signing/SigningUtils.java`
#### Snippet
```java

    private static OutputStream createOutputStream(JReleaserContext context, Path output) throws FileNotFoundException {
        OutputStream out = new BufferedOutputStream(new FileOutputStream(output.toFile()));
        if (context.getModel().getSigning().isArmored()) {
            out = new ArmoredOutputStream(out);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Banner.java`
#### Snippet
```java

    private static String readQuietly(File file) {
        try (Scanner in = newScanner(new FileInputStream(file))) {
            return in.next();
        } catch (Exception ignored) {
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Banner.java`
#### Snippet
```java
    private static void writeQuietly(File file, String text) {
        try {
            PrintStream out = newPrintStream(new FileOutputStream(file));
            out.println(text);
            out.close();
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/AbstractLoggingCommand.java`
#### Snippet
```java
        try {
            Files.createDirectories(getOutputDirectory());
            return newPrintWriter(new FileOutputStream(
                    getOutputDirectory().resolve("trace.log").toFile()));
        } catch (IOException e) {
            throw new IllegalStateException($("ERROR_trace_file_init"), e);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `plugins/jdks-maven-plugin/src/main/java/org/jreleaser/jdks/maven/plugin/Banner.java`
#### Snippet
```java

    private static String readQuietly(File file) {
        try (Scanner in = newScanner(new FileInputStream(file))) {
            return in.next();
        } catch (Exception ignored) {
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `plugins/jdks-maven-plugin/src/main/java/org/jreleaser/jdks/maven/plugin/Banner.java`
#### Snippet
```java
                if (!quiet) log.info(INSTANCE.message);
                markerFile.getParentFile().mkdirs();
                PrintStream out = newPrintStream(new FileOutputStream(markerFile));
                out.println("1");
                out.close();
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `plugins/jdks-maven-plugin/src/main/java/org/jreleaser/jdks/maven/plugin/Banner.java`
#### Snippet
```java
    private static void writeQuietly(File file, String text) {
        try {
            PrintStream out = newPrintStream(new FileOutputStream(file));
            out.println(text);
            out.close();
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `plugins/jdks-gradle-plugin/src/main/groovy/org/jreleaser/jdks/gradle/plugin/Banner.java`
#### Snippet
```java
    private static void writeQuietly(File file, String text) {
        try {
            PrintStream out = newPrintStream(new FileOutputStream(file));
            out.println(text);
            out.close();
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `plugins/jdks-gradle-plugin/src/main/groovy/org/jreleaser/jdks/gradle/plugin/Banner.java`
#### Snippet
```java

    private static String readQuietly(File file) {
        try (Scanner in = newScanner(new FileInputStream(file))) {
            return in.next();
        } catch (Exception ignored) {
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/JReleaserTemplateGenerateTask.java`
#### Snippet
```java
                .resolve("jreleaser");
            Files.createDirectories(outputDirectory);
            return newPrintWriter(new FileOutputStream(
                outputDirectory
                    .resolve("trace.log").toFile()));
        } catch (IOException e) {
            throw new IllegalStateException("Could not initialize trace file", e);
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/Banner.java`
#### Snippet
```java
                writer.println(INSTANCE.message);
                markerFile.getParentFile().mkdirs();
                PrintStream out = newPrintStream(new FileOutputStream(markerFile));
                out.println("1");
                out.close();
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/Banner.java`
#### Snippet
```java
    private static void writeQuietly(File file, String text) {
        try {
            PrintStream out = newPrintStream(new FileOutputStream(file));
            out.println(text);
            out.close();
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/Banner.java`
#### Snippet
```java

    private static String readQuietly(File file) {
        try (Scanner in = newScanner(new FileInputStream(file))) {
            return in.next();
        } catch (Exception ignored) {
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/JReleaserInitTask.java`
#### Snippet
```java
                .resolve("jreleaser");
            Files.createDirectories(outputDirectory);
            return newPrintWriter(new FileOutputStream(
                outputDirectory.resolve("trace.log").toFile()));
        } catch (IOException e) {
            throw new IllegalStateException("Could not initialize trace file", e);
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/AbstractJReleaserTask.java`
#### Snippet
```java
        try {
            Files.createDirectories(getOutputDirectory());
            return newPrintWriter(new FileOutputStream(
                getOutputDirectory().resolve("trace.log").toFile()));
        } catch (IOException e) {
            throw new IllegalStateException("Could not initialize trace file", e);
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/JReleaserTemplateGenerateMojo.java`
#### Snippet
```java
        try {
            java.nio.file.Files.createDirectories(outputDirectory.toPath());
            return newPrintWriter(new FileOutputStream(outputDirectory.toPath().resolve("trace.log").toFile()));
        } catch (IOException e) {
            throw new MojoExecutionException("Could not initialize trace file", e);
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/Banner.java`
#### Snippet
```java
    private static void writeQuietly(File file, String text) {
        try {
            PrintStream out = newPrintStream(new FileOutputStream(file));
            out.println(text);
            out.close();
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/Banner.java`
#### Snippet
```java

    private static String readQuietly(File file) {
        try (Scanner in = newScanner(new FileInputStream(file))) {
            return in.next();
        } catch (Exception ignored) {
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/Banner.java`
#### Snippet
```java
                if (!quiet) log.info(INSTANCE.message);
                markerFile.getParentFile().mkdirs();
                PrintStream out = newPrintStream(new FileOutputStream(markerFile));
                out.println("1");
                out.close();
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/JReleaserAutoConfigReleaseTask.java`
#### Snippet
```java
        try {
            Files.createDirectories(getOutputDirectory());
            return newPrintWriter(new FileOutputStream(
                getOutputDirectory().resolve("trace.log").toFile()));
        } catch (IOException e) {
            throw new IllegalStateException("Could not initialize trace file", e);
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/JReleaserInitMojo.java`
#### Snippet
```java
        try {
            java.nio.file.Files.createDirectories(outputDirectory.toPath());
            return newPrintWriter(new FileOutputStream(outputDirectory.toPath().resolve("trace.log").toFile()));
        } catch (IOException e) {
            throw new MojoExecutionException("Could not initialize trace file", e);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/Banner.java`
#### Snippet
```java

    private static String readQuietly(File file) {
        try (Scanner in = newScanner(new FileInputStream(file))) {
            return in.next();
        } catch (Exception ignored) {
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/Banner.java`
#### Snippet
```java
    private static void writeQuietly(File file, String text) {
        try {
            PrintStream out = newPrintStream(new FileOutputStream(file));
            out.println(text);
            out.close();
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/JReleaserAutoConfigReleaseMojo.java`
#### Snippet
```java
        try {
            java.nio.file.Files.createDirectories(outputDirectory.toPath());
            return newPrintWriter(new FileOutputStream(
                outputDirectory.toPath().resolve("trace.log").toFile()));
        } catch (IOException e) {
            throw new MojoExecutionException("Could not initialize trace file", e);
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/AbstractJReleaserMojo.java`
#### Snippet
```java
        try {
            java.nio.file.Files.createDirectories(outputDirectory.toPath());
            return newPrintWriter(new FileOutputStream(
                outputDirectory.toPath().resolve("trace.log").toFile()));
        } catch (IOException e) {
            throw new MojoExecutionException("Could not initialize trace file", e);
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/internal/JReleaserLoggerService.java`
#### Snippet
```java
            Files.createDirectories(outputDirectoryPath);
            File traceLogFile = outputDirectoryPath.resolve("trace.log").toFile();
            PrintWriter tracer = IoUtils.newPrintWriter(new FileOutputStream(traceLogFile));

            logger = new JReleaserLoggerAdapter(getParameters().getConsole().get(),
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `sdks/jreleaser-java-sdk-commons/src/main/java/org/jreleaser/sdk/commons/Links.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Links[");
        sb.append("first='").append(first).append('\'');
        sb.append(", next='").append(next).append('\'');
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/GitlabMavenDeployer.java`
#### Snippet
```java
        if (!context.isDryrun()) {
            try {
                glPackages.addAll(api.listPackages(Integer.parseInt(deployer.getProjectIdentifier()), "maven"));
            } catch (IOException e) {
                context.getLogger().trace(e);
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
        List<GlPackage> packages = new ArrayList<>();
        Page<List<GlPackage>> page = api.listPackages0(projectIdentifier, params);
        packages.addAll(page.getContent());

        if (page.hasLinks() && page.getLinks().hasNext()) {
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
        List<GlLabel> labels = new ArrayList<>();
        Page<List<GlLabel>> page = api.listLabels0(projectIdentifier);
        labels.addAll(page.getContent());

        if (page.hasLinks() && page.getLinks().hasNext()) {
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
        List<GlLink> links = new ArrayList<>();
        Page<List<GlLink>> page = api.listLinks0(projectIdentifier, tagName);
        links.addAll(page.getContent());

        if (page.hasLinks() && page.getLinks().hasNext()) {
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
        List<GlIssue> issues = new ArrayList<>();
        Page<List<GlIssue>> page = api.listIssues0(projectIdentifier);
        issues.addAll(page.getContent());

        if (page.hasLinks() && page.getLinks().hasNext()) {
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/Github.java`
#### Snippet
```java
        List<GhPackageVersion> issues = new ArrayList<>();
        Page<List<GhPackageVersion>> page = api.listPackageVersions0(packageType, packageName);
        issues.addAll(page.getContent());

        if (page.hasLinks() && page.getLinks().hasNext()) {
```

## RuleId[id=Deprecation]
### Deprecation
'org.jreleaser.model.api.packagers.GofishPackager' is deprecated
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/packagers/Packagers.java`
#### Snippet
```java
    DockerPackager getDocker();

    GofishPackager getGofish();

    FlatpakPackager getFlatpak();
```

### Deprecation
'org.jreleaser.model.api.packagers.GofishPackager' is deprecated
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/GofishPackagerProcessorFactory.java`
#### Snippet
```java
    @Override
    public String getName() {
        return org.jreleaser.model.api.packagers.GofishPackager.TYPE;
    }

```

### Deprecation
'org.jreleaser.model.api.packagers.GofishPackager' is deprecated
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/GofishPackagerProcessor.java`
#### Snippet
```java
            packageChecksum = artifact.getHash(Algorithm.SHA_256);

            String url = Artifacts.resolveDownloadUrl(context, org.jreleaser.model.api.packagers.GofishPackager.TYPE, distribution, artifact);
            packageUrl = url.replace(executable, "\" .. name .. \"")
                .replace(projectVersion, "\" .. version .. \"");
```

### Deprecation
'org.jreleaser.model.api.packagers.GofishPackager' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.packagers.DockerConfiguration.TYPE);
        set.add(org.jreleaser.model.api.packagers.FlatpakPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.GofishPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.JbangPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.JibConfiguration.TYPE);
```

### Deprecation
'org.jreleaser.model.internal.announce.TeamsAnnouncer' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java

    @JsonPropertyDescription("announce.teams is deprecated since 1.4.0 and will be removed in 2.0.0")
    public TeamsAnnouncer getTeams() {
        return teams;
    }
```

### Deprecation
'org.jreleaser.model.internal.announce.DiscordAnnouncer' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
    private final ArticleAnnouncer article = new ArticleAnnouncer();
    private final BlueskyAnnouncer bluesky = new BlueskyAnnouncer();
    private final DiscordAnnouncer discord = new DiscordAnnouncer();
    private final DiscourseAnnouncer discourse = new DiscourseAnnouncer();
    private final DiscussionsAnnouncer discussions = new DiscussionsAnnouncer();
```

### Deprecation
'org.jreleaser.model.internal.announce.DiscordAnnouncer' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
    private final ArticleAnnouncer article = new ArticleAnnouncer();
    private final BlueskyAnnouncer bluesky = new BlueskyAnnouncer();
    private final DiscordAnnouncer discord = new DiscordAnnouncer();
    private final DiscourseAnnouncer discourse = new DiscourseAnnouncer();
    private final DiscussionsAnnouncer discussions = new DiscussionsAnnouncer();
```

### Deprecation
'org.jreleaser.model.internal.announce.TeamsAnnouncer' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
    private final SdkmanAnnouncer sdkman = new SdkmanAnnouncer();
    private final SlackAnnouncer slack = new SlackAnnouncer();
    private final TeamsAnnouncer teams = new TeamsAnnouncer();
    private final TelegramAnnouncer telegram = new TelegramAnnouncer();
    private final TwitterAnnouncer twitter = new TwitterAnnouncer();
```

### Deprecation
'org.jreleaser.model.internal.announce.TeamsAnnouncer' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
    private final SdkmanAnnouncer sdkman = new SdkmanAnnouncer();
    private final SlackAnnouncer slack = new SlackAnnouncer();
    private final TeamsAnnouncer teams = new TeamsAnnouncer();
    private final TelegramAnnouncer telegram = new TelegramAnnouncer();
    private final TwitterAnnouncer twitter = new TwitterAnnouncer();
```

### Deprecation
'org.jreleaser.model.internal.announce.MattermostAnnouncer' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java

    @JsonPropertyDescription("announce.mattermost is deprecated since 1.4.0 and will be removed in 2.0.0")
    public MattermostAnnouncer getMattermost() {
        return mattermost;
    }
```

### Deprecation
'org.jreleaser.model.internal.announce.MattermostAnnouncer' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
    }

    public void setMattermost(MattermostAnnouncer mattermost) {
        this.mattermost.merge(mattermost);
    }
```

### Deprecation
'org.jreleaser.model.internal.announce.TeamsAnnouncer' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
    }

    public void setTeams(TeamsAnnouncer teams) {
        this.teams.merge(teams);
    }
```

### Deprecation
'org.jreleaser.model.internal.announce.GoogleChatAnnouncer' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java

    @JsonPropertyDescription("announce.googleChat is deprecated since 1.4.0 and will be removed in 2.0.0")
    public GoogleChatAnnouncer getGoogleChat() {
        return googleChat;
    }
```

### Deprecation
'org.jreleaser.model.internal.announce.GitterAnnouncer' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
    private final DiscourseAnnouncer discourse = new DiscourseAnnouncer();
    private final DiscussionsAnnouncer discussions = new DiscussionsAnnouncer();
    private final GitterAnnouncer gitter = new GitterAnnouncer();
    private final GoogleChatAnnouncer googleChat = new GoogleChatAnnouncer();
    private final LinkedinAnnouncer linkedin = new LinkedinAnnouncer();
```

### Deprecation
'org.jreleaser.model.internal.announce.GitterAnnouncer' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
    private final DiscourseAnnouncer discourse = new DiscourseAnnouncer();
    private final DiscussionsAnnouncer discussions = new DiscussionsAnnouncer();
    private final GitterAnnouncer gitter = new GitterAnnouncer();
    private final GoogleChatAnnouncer googleChat = new GoogleChatAnnouncer();
    private final LinkedinAnnouncer linkedin = new LinkedinAnnouncer();
```

### Deprecation
'org.jreleaser.model.internal.announce.DiscordAnnouncer' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java

    @JsonPropertyDescription("announce.discord is deprecated since 1.4.0 and will be removed in 2.0.0")
    public DiscordAnnouncer getDiscord() {
        return discord;
    }
```

### Deprecation
'org.jreleaser.model.internal.announce.GoogleChatAnnouncer' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
    private final DiscussionsAnnouncer discussions = new DiscussionsAnnouncer();
    private final GitterAnnouncer gitter = new GitterAnnouncer();
    private final GoogleChatAnnouncer googleChat = new GoogleChatAnnouncer();
    private final LinkedinAnnouncer linkedin = new LinkedinAnnouncer();
    private final SmtpAnnouncer smtp = new SmtpAnnouncer();
```

### Deprecation
'org.jreleaser.model.internal.announce.GoogleChatAnnouncer' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
    private final DiscussionsAnnouncer discussions = new DiscussionsAnnouncer();
    private final GitterAnnouncer gitter = new GitterAnnouncer();
    private final GoogleChatAnnouncer googleChat = new GoogleChatAnnouncer();
    private final LinkedinAnnouncer linkedin = new LinkedinAnnouncer();
    private final SmtpAnnouncer smtp = new SmtpAnnouncer();
```

### Deprecation
'org.jreleaser.model.internal.announce.MattermostAnnouncer' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
    private final SmtpAnnouncer smtp = new SmtpAnnouncer();
    private final MastodonAnnouncer mastodon = new MastodonAnnouncer();
    private final MattermostAnnouncer mattermost = new MattermostAnnouncer();
    private final OpenCollectiveAnnouncer openCollective = new OpenCollectiveAnnouncer();
    private final SdkmanAnnouncer sdkman = new SdkmanAnnouncer();
```

### Deprecation
'org.jreleaser.model.internal.announce.MattermostAnnouncer' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
    private final SmtpAnnouncer smtp = new SmtpAnnouncer();
    private final MastodonAnnouncer mastodon = new MastodonAnnouncer();
    private final MattermostAnnouncer mattermost = new MattermostAnnouncer();
    private final OpenCollectiveAnnouncer openCollective = new OpenCollectiveAnnouncer();
    private final SdkmanAnnouncer sdkman = new SdkmanAnnouncer();
```

### Deprecation
'org.jreleaser.model.internal.announce.GoogleChatAnnouncer' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
    }

    public void setGoogleChat(GoogleChatAnnouncer googleChat) {
        this.googleChat.merge(googleChat);
    }
```

### Deprecation
'org.jreleaser.model.internal.announce.GitterAnnouncer' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java

    @JsonPropertyDescription("announce.gitter is deprecated since 1.4.0 and will be removed in 2.0.0")
    public GitterAnnouncer getGitter() {
        return gitter;
    }
```

### Deprecation
'org.jreleaser.model.internal.announce.GitterAnnouncer' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
    }

    public void setGitter(GitterAnnouncer gitter) {
        this.gitter.merge(gitter);
    }
```

### Deprecation
'org.jreleaser.model.internal.announce.DiscordAnnouncer' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/Announce.java`
#### Snippet
```java
    }

    public void setDiscord(DiscordAnnouncer discord) {
        this.discord.merge(discord);
    }
```

### Deprecation
'NATIVE_IMAGE' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/ScoopPackager.java`
#### Snippet
```java
import static org.jreleaser.model.Distribution.DistributionType.JAVA_BINARY;
import static org.jreleaser.model.Distribution.DistributionType.JLINK;
import static org.jreleaser.model.Distribution.DistributionType.NATIVE_IMAGE;
import static org.jreleaser.model.Distribution.DistributionType.NATIVE_PACKAGE;
import static org.jreleaser.model.Distribution.DistributionType.SINGLE_JAR;
```

### Deprecation
'NATIVE_IMAGE' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/ScoopPackager.java`
#### Snippet
```java
    static {
        Set<String> extensions = setOf(ZIP.extension());
        SUPPORTED.put(NATIVE_IMAGE, extensions);
        SUPPORTED.put(BINARY, extensions);
        SUPPORTED.put(JAVA_BINARY, extensions);
```

### Deprecation
'NATIVE_IMAGE' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/ChocolateyPackager.java`
#### Snippet
```java
    static {
        Set<String> extensions = setOf(ZIP.extension());
        SUPPORTED.put(NATIVE_IMAGE, extensions);
        SUPPORTED.put(BINARY, extensions);
        SUPPORTED.put(JAVA_BINARY, extensions);
```

### Deprecation
'NATIVE_IMAGE' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/ChocolateyPackager.java`
#### Snippet
```java
import static org.jreleaser.model.Distribution.DistributionType.JAVA_BINARY;
import static org.jreleaser.model.Distribution.DistributionType.JLINK;
import static org.jreleaser.model.Distribution.DistributionType.NATIVE_IMAGE;
import static org.jreleaser.model.Distribution.DistributionType.NATIVE_PACKAGE;
import static org.jreleaser.model.api.packagers.ChocolateyPackager.SKIP_CHOCOLATEY;
```

### Deprecation
'NATIVE_IMAGE' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/AppImagePackager.java`
#### Snippet
```java
            ZIP.extension());

        SUPPORTED.put(NATIVE_IMAGE, extensions);
        SUPPORTED.put(BINARY, extensions);
        SUPPORTED.put(JAVA_BINARY, extensions);
```

### Deprecation
'NATIVE_IMAGE' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/AppImagePackager.java`
#### Snippet
```java
import static org.jreleaser.model.Distribution.DistributionType.JAVA_BINARY;
import static org.jreleaser.model.Distribution.DistributionType.JLINK;
import static org.jreleaser.model.Distribution.DistributionType.NATIVE_IMAGE;
import static org.jreleaser.model.Distribution.DistributionType.SINGLE_JAR;
import static org.jreleaser.model.api.packagers.AppImagePackager.SKIP_APPIMAGE;
```

### Deprecation
'NATIVE_IMAGE' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/FlatpakPackager.java`
#### Snippet
```java
            ZIP.extension());

        SUPPORTED.put(NATIVE_IMAGE, extensions);
        SUPPORTED.put(BINARY, extensions);
        SUPPORTED.put(JAVA_BINARY, extensions);
```

### Deprecation
'NATIVE_IMAGE' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/FlatpakPackager.java`
#### Snippet
```java
import static org.jreleaser.model.Distribution.DistributionType.JAVA_BINARY;
import static org.jreleaser.model.Distribution.DistributionType.JLINK;
import static org.jreleaser.model.Distribution.DistributionType.NATIVE_IMAGE;
import static org.jreleaser.model.api.packagers.FlatpakPackager.SKIP_FLATPAK;
import static org.jreleaser.model.api.packagers.FlatpakPackager.TYPE;
```

### Deprecation
'NATIVE_IMAGE' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/AsdfPackager.java`
#### Snippet
```java
            ZIP.extension());

        SUPPORTED.put(NATIVE_IMAGE, extensions);
        SUPPORTED.put(BINARY, extensions);
        SUPPORTED.put(JAVA_BINARY, extensions);
```

### Deprecation
'NATIVE_IMAGE' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/AsdfPackager.java`
#### Snippet
```java
import static org.jreleaser.model.Distribution.DistributionType.JAVA_BINARY;
import static org.jreleaser.model.Distribution.DistributionType.JLINK;
import static org.jreleaser.model.Distribution.DistributionType.NATIVE_IMAGE;
import static org.jreleaser.model.api.packagers.AsdfPackager.SKIP_ASDF;
import static org.jreleaser.model.api.packagers.AsdfPackager.TYPE;
```

### Deprecation
'org.jreleaser.model.api.packagers.GofishPackager' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/GofishPackager.java`
#### Snippet
```java

    @JsonIgnore
    private final org.jreleaser.model.api.packagers.GofishPackager immutable = new org.jreleaser.model.api.packagers.GofishPackager() {
        private static final long serialVersionUID = 7575986906210858224L;

```

### Deprecation
'org.jreleaser.model.api.packagers.GofishPackager' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/GofishPackager.java`
#### Snippet
```java

    @Override
    public org.jreleaser.model.api.packagers.GofishPackager asImmutable() {
        return immutable;
    }
```

### Deprecation
'org.jreleaser.model.api.packagers.GofishPackager' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/GofishPackager.java`
#### Snippet
```java

    @JsonIgnore
    private final org.jreleaser.model.api.packagers.GofishPackager immutable = new org.jreleaser.model.api.packagers.GofishPackager() {
        private static final long serialVersionUID = 7575986906210858224L;

```

### Deprecation
'org.jreleaser.model.api.packagers.GofishPackager' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/GofishPackager.java`
#### Snippet
```java
import static org.jreleaser.model.Distribution.DistributionType.JAVA_BINARY;
import static org.jreleaser.model.Distribution.DistributionType.JLINK;
import static org.jreleaser.model.api.packagers.GofishPackager.SKIP_GOFISH;
import static org.jreleaser.model.api.packagers.GofishPackager.TYPE;
import static org.jreleaser.util.CollectionUtils.setOf;
```

### Deprecation
'org.jreleaser.model.api.packagers.GofishPackager' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/GofishPackager.java`
#### Snippet
```java
import static org.jreleaser.model.Distribution.DistributionType.JLINK;
import static org.jreleaser.model.api.packagers.GofishPackager.SKIP_GOFISH;
import static org.jreleaser.model.api.packagers.GofishPackager.TYPE;
import static org.jreleaser.util.CollectionUtils.setOf;
import static org.jreleaser.util.FileType.TAR;
```

### Deprecation
'org.jreleaser.model.api.packagers.GofishPackager' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/GofishPackager.java`
#### Snippet
```java
 * @since 0.10.0
 */
public final class GofishPackager extends AbstractRepositoryPackager<org.jreleaser.model.api.packagers.GofishPackager, GofishPackager> {
    private static final Map<org.jreleaser.model.Distribution.DistributionType, Set<String>> SUPPORTED = new LinkedHashMap<>();
    private static final long serialVersionUID = -4053286282850852250L;
```

### Deprecation
'NATIVE_IMAGE' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/DockerPackager.java`
#### Snippet
```java
import static org.jreleaser.model.Distribution.DistributionType.JAVA_BINARY;
import static org.jreleaser.model.Distribution.DistributionType.JLINK;
import static org.jreleaser.model.Distribution.DistributionType.NATIVE_IMAGE;
import static org.jreleaser.model.Distribution.DistributionType.SINGLE_JAR;
import static org.jreleaser.model.api.packagers.DockerPackager.SKIP_DOCKER;
```

### Deprecation
'NATIVE_IMAGE' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/DockerPackager.java`
#### Snippet
```java
    static {
        Set<String> extensions = setOf(ZIP.extension());
        SUPPORTED.put(NATIVE_IMAGE, extensions);
        SUPPORTED.put(BINARY, extensions);
        SUPPORTED.put(JAVA_BINARY, extensions);
```

### Deprecation
'NATIVE_IMAGE' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/MacportsPackager.java`
#### Snippet
```java
import static org.jreleaser.model.Distribution.DistributionType.JAVA_BINARY;
import static org.jreleaser.model.Distribution.DistributionType.JLINK;
import static org.jreleaser.model.Distribution.DistributionType.NATIVE_IMAGE;
import static org.jreleaser.model.Distribution.DistributionType.NATIVE_PACKAGE;
import static org.jreleaser.model.Distribution.DistributionType.SINGLE_JAR;
```

### Deprecation
'NATIVE_IMAGE' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/MacportsPackager.java`
#### Snippet
```java
    static {
        Set<String> extensions = setOf(ZIP.extension());
        SUPPORTED.put(NATIVE_IMAGE, extensions);
        SUPPORTED.put(BINARY, extensions);
        SUPPORTED.put(JAVA_BINARY, extensions);
```

### Deprecation
'NATIVE_IMAGE' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/BrewPackager.java`
#### Snippet
```java
    static {
        Set<String> extensions = setOf(ZIP.extension());
        SUPPORTED.put(NATIVE_IMAGE, extensions);
        SUPPORTED.put(BINARY, extensions);
        SUPPORTED.put(JAVA_BINARY, extensions);
```

### Deprecation
'NATIVE_IMAGE' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/BrewPackager.java`
#### Snippet
```java
import static org.jreleaser.model.Distribution.DistributionType.JAVA_BINARY;
import static org.jreleaser.model.Distribution.DistributionType.JLINK;
import static org.jreleaser.model.Distribution.DistributionType.NATIVE_IMAGE;
import static org.jreleaser.model.Distribution.DistributionType.NATIVE_PACKAGE;
import static org.jreleaser.model.Distribution.DistributionType.SINGLE_JAR;
```

### Deprecation
'org.jreleaser.model.api.packagers.GofishPackager' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/Packagers.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.packagers.GofishPackager getGofish() {
            return gofish.asImmutable();
        }
```

### Deprecation
'NATIVE_IMAGE' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/WingetPackager.java`
#### Snippet
```java

    static {
        SUPPORTED.put(NATIVE_IMAGE, setOf(ZIP.extension()));
        SUPPORTED.put(BINARY, setOf(ZIP.extension()));
        SUPPORTED.put(JAVA_BINARY, setOf(ZIP.extension()));
```

### Deprecation
'NATIVE_IMAGE' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/WingetPackager.java`
#### Snippet
```java
import static org.jreleaser.model.Distribution.DistributionType.JAVA_BINARY;
import static org.jreleaser.model.Distribution.DistributionType.JLINK;
import static org.jreleaser.model.Distribution.DistributionType.NATIVE_IMAGE;
import static org.jreleaser.model.Distribution.DistributionType.NATIVE_PACKAGE;
import static org.jreleaser.model.api.packagers.WingetPackager.SKIP_WINGET;
```

### Deprecation
'NATIVE_IMAGE' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/JibPackager.java`
#### Snippet
```java
    static {
        Set<String> extensions = setOf(ZIP.extension());
        SUPPORTED.put(NATIVE_IMAGE, extensions);
        SUPPORTED.put(BINARY, extensions);
        SUPPORTED.put(JAVA_BINARY, extensions);
```

### Deprecation
'NATIVE_IMAGE' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/JibPackager.java`
#### Snippet
```java
import static org.jreleaser.model.Distribution.DistributionType.JAVA_BINARY;
import static org.jreleaser.model.Distribution.DistributionType.JLINK;
import static org.jreleaser.model.Distribution.DistributionType.NATIVE_IMAGE;
import static org.jreleaser.model.Distribution.DistributionType.SINGLE_JAR;
import static org.jreleaser.model.api.packagers.JibPackager.SKIP_JIB;
```

### Deprecation
'NATIVE_IMAGE' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/SpecPackager.java`
#### Snippet
```java
            ZIP.extension());

        SUPPORTED.put(NATIVE_IMAGE, extensions);
        SUPPORTED.put(BINARY, extensions);
        SUPPORTED.put(JAVA_BINARY, extensions);
```

### Deprecation
'NATIVE_IMAGE' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/SpecPackager.java`
#### Snippet
```java
import static org.jreleaser.model.Distribution.DistributionType.JAVA_BINARY;
import static org.jreleaser.model.Distribution.DistributionType.JLINK;
import static org.jreleaser.model.Distribution.DistributionType.NATIVE_IMAGE;
import static org.jreleaser.model.api.packagers.SpecPackager.SKIP_SPEC;
import static org.jreleaser.model.api.packagers.SpecPackager.TYPE;
```

### Deprecation
'NATIVE_IMAGE' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/SnapPackager.java`
#### Snippet
```java
import static org.jreleaser.model.Distribution.DistributionType.JAVA_BINARY;
import static org.jreleaser.model.Distribution.DistributionType.JLINK;
import static org.jreleaser.model.Distribution.DistributionType.NATIVE_IMAGE;
import static org.jreleaser.model.Distribution.DistributionType.NATIVE_PACKAGE;
import static org.jreleaser.model.Distribution.DistributionType.SINGLE_JAR;
```

### Deprecation
'NATIVE_IMAGE' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/SnapPackager.java`
#### Snippet
```java
            TAR.extension());

        SUPPORTED.put(NATIVE_IMAGE, extensions);
        SUPPORTED.put(BINARY, extensions);
        SUPPORTED.put(JAVA_BINARY, extensions);
```

### Deprecation
'org.jreleaser.model.internal.announce.GitterAnnouncer' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/GitterAnnouncerValidator.java`
#### Snippet
```java
    }

    public static void validateGitter(JReleaserContext context, GitterAnnouncer announcer, Errors errors) {
        context.getLogger().debug("announce.gitter");
        resolveActivatable(context, announcer, "announce.gitter", "NEVER");
```

### Deprecation
'org.jreleaser.model.internal.announce.DiscordAnnouncer' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/DiscordAnnouncerValidator.java`
#### Snippet
```java
    }

    public static void validateDiscord(JReleaserContext context, DiscordAnnouncer announcer, Errors errors) {
        context.getLogger().debug("announce.discord");
        resolveActivatable(context, announcer, "announce.discord", "NEVER");
```

### Deprecation
'org.jreleaser.model.internal.announce.TeamsAnnouncer' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/TeamsAnnouncerValidator.java`
#### Snippet
```java
    }

    public static void validateTeams(JReleaserContext context, TeamsAnnouncer announcer, Errors errors) {
        context.getLogger().debug("announce.teams");
        resolveActivatable(context, announcer, "announce.teams", "NEVER");
```

### Deprecation
'org.jreleaser.model.internal.announce.GoogleChatAnnouncer' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/GoogleChatAnnouncerValidator.java`
#### Snippet
```java
    }

    public static void validateGoogleChat(JReleaserContext context, GoogleChatAnnouncer announcer, Errors errors) {
        context.getLogger().debug("announce.googleChat");
        resolveActivatable(context, announcer, "announce.google.chat", "NEVER");
```

### Deprecation
'org.jreleaser.model.internal.announce.MattermostAnnouncer' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/MattermostAnnouncerValidator.java`
#### Snippet
```java
    }

    public static void validateMattermost(JReleaserContext context, MattermostAnnouncer announcer, Errors errors) {
        context.getLogger().debug("announce.mattermost");
        resolveActivatable(context, announcer, "announce.mattermost", "NEVER");
```

### Deprecation
'NATIVE_IMAGE' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/WingetPackagerValidator.java`
#### Snippet
```java
        }

        if (distribution.getType() == org.jreleaser.model.Distribution.DistributionType.NATIVE_IMAGE ||
            distribution.getType() == org.jreleaser.model.Distribution.DistributionType.BINARY ||
            distribution.getType() == org.jreleaser.model.Distribution.DistributionType.JAVA_BINARY ||
```

### Deprecation
'NATIVE_IMAGE' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java

    public void setType(org.jreleaser.model.Distribution.DistributionType type) {
        if (type == org.jreleaser.model.Distribution.DistributionType.NATIVE_IMAGE) {
            nag("NATIVE_IMAGE is deprecated since 1.4.0 and will be removed in 2.0.0. Use BINARY instead");
            this.type = org.jreleaser.model.Distribution.DistributionType.BINARY;
```

### Deprecation
'org.jreleaser.model.api.packagers.GofishPackager' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.packagers.GofishPackager getGofish() {
            return gofish.asImmutable();
        }
```

### Deprecation
'org.jreleaser.model.api.packagers.GofishPackager' is deprecated
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
            case org.jreleaser.model.api.packagers.FlatpakPackager.TYPE:
                return (T) getFlatpak();
            case org.jreleaser.model.api.packagers.GofishPackager.TYPE:
                return (T) getGofish();
            case org.jreleaser.model.api.packagers.JbangPackager.TYPE:
```

### Deprecation
'org.jreleaser.model.internal.announce.TeamsAnnouncer' is deprecated
in `sdks/jreleaser-teams-java-sdk/src/main/java/org/jreleaser/sdk/teams/TeamsAnnouncer.java`
#### Snippet
```java
public class TeamsAnnouncer implements Announcer<org.jreleaser.model.api.announce.TeamsAnnouncer> {
    private final JReleaserContext context;
    private final org.jreleaser.model.internal.announce.TeamsAnnouncer teams;

    public TeamsAnnouncer(JReleaserContext context) {
```

### Deprecation
'org.jreleaser.model.internal.announce.GitterAnnouncer' is deprecated
in `sdks/jreleaser-gitter-java-sdk/src/main/java/org/jreleaser/sdk/gitter/GitterAnnouncer.java`
#### Snippet
```java
public class GitterAnnouncer implements Announcer<org.jreleaser.model.api.announce.GitterAnnouncer> {
    private final JReleaserContext context;
    private final org.jreleaser.model.internal.announce.GitterAnnouncer gitter;

    public GitterAnnouncer(JReleaserContext context) {
```

### Deprecation
'org.jreleaser.model.internal.announce.DiscordAnnouncer' is deprecated
in `sdks/jreleaser-discord-java-sdk/src/main/java/org/jreleaser/sdk/discord/DiscordAnnouncer.java`
#### Snippet
```java
public class DiscordAnnouncer implements Announcer<org.jreleaser.model.api.announce.DiscordAnnouncer> {
    private final JReleaserContext context;
    private final org.jreleaser.model.internal.announce.DiscordAnnouncer discord;

    public DiscordAnnouncer(JReleaserContext context) {
```

### Deprecation
'org.jreleaser.model.internal.announce.MattermostAnnouncer' is deprecated
in `sdks/jreleaser-mattermost-java-sdk/src/main/java/org/jreleaser/sdk/mattermost/MattermostAnnouncer.java`
#### Snippet
```java
public class MattermostAnnouncer implements Announcer<org.jreleaser.model.api.announce.MattermostAnnouncer> {
    private final JReleaserContext context;
    private final org.jreleaser.model.internal.announce.MattermostAnnouncer mattermost;

    public MattermostAnnouncer(JReleaserContext context) {
```

### Deprecation
'org.jreleaser.model.internal.announce.GoogleChatAnnouncer' is deprecated
in `sdks/jreleaser-google-chat-java-sdk/src/main/java/org/jreleaser/sdk/googlechat/GoogleChatAnnouncer.java`
#### Snippet
```java
public class GoogleChatAnnouncer implements Announcer<org.jreleaser.model.api.announce.GoogleChatAnnouncer> {
    private final JReleaserContext context;
    private final org.jreleaser.model.internal.announce.GoogleChatAnnouncer googleChat;

    public GoogleChatAnnouncer(JReleaserContext context) {
```

## RuleId[id=RedundantEscapeInRegexReplacement]
### RedundantEscapeInRegexReplacement
Redundant escape of '('
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/util/VersionUtils.java`
#### Snippet
```java
        BaseReleaser<?, ?> gitService = context.getModel().getRelease().getReleaser();
        String tagName = gitService.getTagName();
        Pattern vp = Pattern.compile(tagName.replaceAll("\\{\\{.*}}", "\\(\\.\\*\\)"));
        if (!tagName.contains("{{")) {
            vp = Pattern.compile("(.*)");
```

### RedundantEscapeInRegexReplacement
Redundant escape of '.'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/util/VersionUtils.java`
#### Snippet
```java
        BaseReleaser<?, ?> gitService = context.getModel().getRelease().getReleaser();
        String tagName = gitService.getTagName();
        Pattern vp = Pattern.compile(tagName.replaceAll("\\{\\{.*}}", "\\(\\.\\*\\)"));
        if (!tagName.contains("{{")) {
            vp = Pattern.compile("(.*)");
```

### RedundantEscapeInRegexReplacement
Redundant escape of '\*'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/util/VersionUtils.java`
#### Snippet
```java
        BaseReleaser<?, ?> gitService = context.getModel().getRelease().getReleaser();
        String tagName = gitService.getTagName();
        Pattern vp = Pattern.compile(tagName.replaceAll("\\{\\{.*}}", "\\(\\.\\*\\)"));
        if (!tagName.contains("{{")) {
            vp = Pattern.compile("(.*)");
```

### RedundantEscapeInRegexReplacement
Redundant escape of ')'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/util/VersionUtils.java`
#### Snippet
```java
        BaseReleaser<?, ?> gitService = context.getModel().getRelease().getReleaser();
        String tagName = gitService.getTagName();
        Pattern vp = Pattern.compile(tagName.replaceAll("\\{\\{.*}}", "\\(\\.\\*\\)"));
        if (!tagName.contains("{{")) {
            vp = Pattern.compile("(.*)");
```

### RedundantEscapeInRegexReplacement
Redundant escape of '.'
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/ChangelogGenerator.java`
#### Snippet
```java
        String effectiveTagName = releaser.getEffectiveTagName(context.getModel());
        String tagName = releaser.getTagName();
        String tagPattern = tagName.replaceAll("\\{\\{.*}}", "\\.\\*");

        Pattern versionPattern = VersionUtils.resolveVersionPattern(context);
```

### RedundantEscapeInRegexReplacement
Redundant escape of '\*'
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/ChangelogGenerator.java`
#### Snippet
```java
        String effectiveTagName = releaser.getEffectiveTagName(context.getModel());
        String tagName = releaser.getTagName();
        String tagPattern = tagName.replaceAll("\\{\\{.*}}", "\\.\\*");

        Pattern versionPattern = VersionUtils.resolveVersionPattern(context);
```

### RedundantEscapeInRegexReplacement
Redundant escape of 'n'
in `infra/jreleaser-test-support/src/main/java/org/jreleaser/test/WireMockStubs.java`
#### Snippet
```java

    public static void verifyJsonRequestContains(RequestPatternBuilder builder, String maybeJson) {
        maybeJson = maybeJson.trim().replaceAll("\\r\\n", "\\n");
        verify(builder.withHeader("Content-Type", containing("application/json"))
            .withHeader("Accept", or(equalTo("*/*"), equalTo("application/json")))
```

### RedundantEscapeInRegexReplacement
Redundant escape of 'n'
in `infra/jreleaser-test-support/src/main/java/org/jreleaser/test/WireMockStubs.java`
#### Snippet
```java

    public static void verifyRequestContains(RequestPatternBuilder builder, String maybeJson) {
        maybeJson = maybeJson.trim().replaceAll("\\r\\n", "\\n");
        verify(builder.withHeader("Content-Type", containing("application/x-www-form-urlencoded"))
            .withHeader("Accept", equalTo("*/*"))
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java
        setProperty(props, DETECTED_NAME, detectedName);
        setProperty(props, DETECTED_ARCH, detectedArch);
        setProperty(props, DETECTED_BITNESS, "" + detectedBitness);

        final Matcher versionMatcher = VERSION_REGEX.matcher(osVersion);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java

    private static String getPadding(String padding, int length) {
        return padding.length() < length ? times(padding, length / padding.length() + 1).substring(0, length) : "" + padding.subSequence(0, length);
    }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
                return "\\" + character;
            default:
                return "" + character;
        }
    }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/init/Init.java`
#### Snippet
```java
            String content = IOUtils.toString(template.getReader());
            LocalDate now = LocalDate.now();
            content = content.replace("@year@", now.getYear() + "");

            logger.info($("jreleaser.init.TEXT_writing_file"), outputFile.toAbsolutePath());
```

### TrivialStringConcatenation
Empty string used in concatenation
in `sdks/jreleaser-java-sdk-commons/src/main/java/org/jreleaser/sdk/commons/ClientUtils.java`
#### Snippet
```java
            }
            connection.addRequestProperty("User-Agent", "JReleaser/" + JReleaserVersion.getPlainVersion());
            connection.addRequestProperty("Content-Length", data.getData().length + "");
            connection.setRequestProperty("Content-Type", data.getContentType());
            headers.forEach(connection::setRequestProperty);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `infra/jreleaser-nativeimage-processor/src/main/java/org/jreleaser/infra/nativeimage/processor/ReflectConfigGenerator.java`
#### Snippet
```java

    private String formatEnum(String name) {
        return String.format("" +
            "  {%n" +
            "    \"name\": \"%s\",%n" +
```

### TrivialStringConcatenation
Empty string used in concatenation
in `infra/jreleaser-nativeimage-processor/src/main/java/org/jreleaser/infra/nativeimage/processor/ReflectConfigGenerator.java`
#### Snippet
```java

    private String formatInterface(String name) {
        return String.format("" +
            "  {%n" +
            "    \"name\": \"%s\",%n" +
```

### TrivialStringConcatenation
Empty string used in concatenation
in `infra/jreleaser-nativeimage-processor/src/main/java/org/jreleaser/infra/nativeimage/processor/ReflectConfigGenerator.java`
#### Snippet
```java

    private String formatClass(String name) {
        return String.format("" +
            "  {%n" +
            "    \"name\": \"%s\",%n" +
```

### TrivialStringConcatenation
Empty string used in concatenation
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Banner.java`
#### Snippet
```java
                int count = Integer.parseInt(readQuietly(markerFile));
                if (count < 3 && !JReleaserOutput.isQuiet()) out.println(INSTANCE.message);
                writeQuietly(markerFile, (count + 1) + "");
            } catch (NumberFormatException e) {
                writeQuietly(markerFile, "1");
```

### TrivialStringConcatenation
Empty string used in concatenation
in `plugins/jdks-maven-plugin/src/main/java/org/jreleaser/jdks/maven/plugin/Banner.java`
#### Snippet
```java
                    int count = Integer.parseInt(readQuietly(markerFile));
                    if (count < 3 && !quiet) log.info(INSTANCE.message);
                    writeQuietly(markerFile, (count + 1) + "");
                } catch (NumberFormatException e) {
                    writeQuietly(markerFile, "1");
```

### TrivialStringConcatenation
Empty string used in concatenation
in `plugins/jdks-gradle-plugin/src/main/groovy/org/jreleaser/jdks/gradle/plugin/Banner.java`
#### Snippet
```java
                    if (printBanner) System.err.println(banner);
                }
                writeQuietly(markerFile, (count + 1) + "");
            } catch (NumberFormatException e) {
                if (printBanner) System.err.println(banner);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/Banner.java`
#### Snippet
```java
                        writer.println(INSTANCE.message);
                    }
                    writeQuietly(markerFile, (count + 1) + "");
                } catch (NumberFormatException e) {
                    writeQuietly(markerFile, "1");
```

### TrivialStringConcatenation
Empty string used in concatenation
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/Banner.java`
#### Snippet
```java
                    int count = Integer.parseInt(readQuietly(markerFile));
                    if (count < 3 && !quiet) log.info(INSTANCE.message);
                    writeQuietly(markerFile, (count + 1) + "");
                } catch (NumberFormatException e) {
                    writeQuietly(markerFile, "1");
```

### TrivialStringConcatenation
Empty string used in concatenation
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/Banner.java`
#### Snippet
```java
                    if (printBanner) System.err.println(banner);
                }
                writeQuietly(markerFile, (count + 1) + "");
            } catch (NumberFormatException e) {
                if (printBanner) System.err.println(banner);
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
        }

        folderIndex = folderIndex < 0 ? 0 : folderIndex;

        return path.substring(folderIndex, extIndex);
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java

        @Override
        public boolean containsAll(Collection<?> objects) {
            return delegate.containsAll(objects);
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java

        @Override
        public <T> T[] toArray(T[] ts) {
            return delegate.toArray(ts);
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java

        @Override
        public void putAll(Map<? extends K, ? extends V> map) {
            delegate.putAll(map);
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java

        @Override
        public boolean addAll(Collection<? extends E> es) {
            return delegate.addAll(es);
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java

        @Override
        public boolean addAll(int i, Collection<? extends E> es) {
            return delegate.addAll(i, es);
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java

        @Override
        public boolean retainAll(Collection<?> objects) {
            return delegate.retainAll(objects);
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java

        @Override
        public <T> T[] toArray(T[] ts) {
            return delegate.toArray(ts);
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java

        @Override
        public boolean addAll(Collection<? extends E> es) {
            return delegate.addAll(es);
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java

        @Override
        public boolean retainAll(Collection<?> objects) {
            return delegate.retainAll(objects);
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java

        @Override
        public boolean containsAll(Collection<?> objects) {
            return delegate.containsAll(objects);
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java

        @Override
        public boolean removeAll(Collection<?> objects) {
            return delegate.removeAll(objects);
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java

        @Override
        public boolean removeAll(Collection<?> objects) {
            return delegate.removeAll(objects);
        }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java

        @Override
        public Collection<Object> values() {
            return map.values();
        }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java

        @Override
        public Set<Map.Entry<Object, Object>> entrySet() {
            Set<Map.Entry<Object, Object>> set = new LinkedHashSet<>((Set) map.entrySet());
            return new LinkedHashSet<>(set);
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java

        @Override
        public Set<Object> keySet() {
            return new LinkedHashSet<>(map.keySet());
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/ChronVer.java`
#### Snippet
```java

        @Override
        public int compareTo(Changeset other) {
            if (null == other) return -1;
            if (isEmpty() && other.isEmpty()) return 0;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/catalog/Slsa.java`
#### Snippet
```java

        @Override
        public int compareTo(Subject o) {
            if (null == o) return -1;
            return this.name.compareTo(o.name);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/jreleaser-templates/src/main/java/org/jreleaser/templates/VersionDecoratingWriter.java`
#### Snippet
```java

    @Override
    public void write(final String str) throws IOException {
        if (needsVersionReplacement(str)) {
            super.write(str.replace(VERSION_MARKER, VERSION_BANNER));
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/spi/deploy/maven/Deployable.java`
#### Snippet
```java

    @Override
    public int compareTo(Deployable o) {
        if (null == o) return -1;
        return getFullDeployPath().compareTo(o.getFullDeployPath());
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/spi/release/Asset.java`
#### Snippet
```java

    @Override
    public int compareTo(Asset o) {
        if (null == o) return -1;
        return this.filename.compareTo(o.filename);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/common/Artifact.java`
#### Snippet
```java

    @Override
    public int compareTo(Artifact o) {
        if (null == o) return -1;
        return path.compareTo(o.path);
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserContext.java`
#### Snippet
```java
        // Java 11 calls entrySet() when storing properties
        @Override
        public Set<Map.Entry<Object, Object>> entrySet() {
            int javaMajorVersion = SemanticVersion.javaMajorVersion();
            if (javaMajorVersion < 11) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/DockerConfiguration.java`
#### Snippet
```java

            @Override
            public int compareTo(org.jreleaser.model.api.packagers.DockerConfiguration.Registry o) {
                if (null == o) return -1;
                return serverName.compareTo(o.getServerName());
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/DockerConfiguration.java`
#### Snippet
```java

        @Override
        public int compareTo(Registry o) {
            if (null == o) return -1;
            String sn1 = serverName.equals(DEFAULT_NAME) ? DOCKER_IO : serverName;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/JibConfiguration.java`
#### Snippet
```java

            @Override
            public int compareTo(org.jreleaser.model.api.packagers.JibConfiguration.Registry o) {
                if (null == o) return -1;
                return name.compareTo(o.getName());
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/JibConfiguration.java`
#### Snippet
```java

        @Override
        public int compareTo(Registry o) {
            if (null == o) return -1;
            return server.compareTo(o.server);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `sdks/jreleaser-command-java-sdk/src/main/java/org/jreleaser/sdk/command/CommandExecutor.java`
#### Snippet
```java
            private final AtomicInteger counter = new AtomicInteger(1);

            public Thread newThread(Runnable r) {
                Thread t = Executors.defaultThreadFactory().newThread(r);
                t.setDaemon(true);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/AbstractCommand.java`
#### Snippet
```java

        @Override
        public int compareTo(DeprecatedArg o) {
            return Comparator.comparing(DeprecatedArg::getDeprecated)
                .compare(this, o);
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `sdks/jreleaser-sdkman-java-sdk/src/main/java/org/jreleaser/sdk/sdkman/ReleaseSdkmanCommand.java`
#### Snippet
```java
         * Example:
         * <pre>
         *     "MAC_OSX"   :"https://host/micronaut-x.y.z-macosx.zip"
         *     "LINUX_64"  :"https://host/micronaut-x.y.z-linux64.zip"
         *     "WINDOWS_64":"https://host/micronaut-x.y.z-win.zip"
```

### JavadocLinkAsPlainText
Link specified as plain text
in `sdks/jreleaser-sdkman-java-sdk/src/main/java/org/jreleaser/sdk/sdkman/ReleaseSdkmanCommand.java`
#### Snippet
```java
         * <pre>
         *     "MAC_OSX"   :"https://host/micronaut-x.y.z-macosx.zip"
         *     "LINUX_64"  :"https://host/micronaut-x.y.z-linux64.zip"
         *     "WINDOWS_64":"https://host/micronaut-x.y.z-win.zip"
         * </pre>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `sdks/jreleaser-sdkman-java-sdk/src/main/java/org/jreleaser/sdk/sdkman/ReleaseSdkmanCommand.java`
#### Snippet
```java
         *     "MAC_OSX"   :"https://host/micronaut-x.y.z-macosx.zip"
         *     "LINUX_64"  :"https://host/micronaut-x.y.z-linux64.zip"
         *     "WINDOWS_64":"https://host/micronaut-x.y.z-win.zip"
         * </pre>
         */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `sdks/jreleaser-sdkman-java-sdk/src/main/java/org/jreleaser/sdk/sdkman/MajorReleaseSdkmanCommand.java`
#### Snippet
```java
         * Example:
         * <pre>
         *     "MAC_OSX"   :"https://host/micronaut-x.y.z-macosx.zip"
         *     "LINUX_64"  :"https://host/micronaut-x.y.z-linux64.zip"
         *     "WINDOWS_64":"https://host/micronaut-x.y.z-win.zip"
```

### JavadocLinkAsPlainText
Link specified as plain text
in `sdks/jreleaser-sdkman-java-sdk/src/main/java/org/jreleaser/sdk/sdkman/MajorReleaseSdkmanCommand.java`
#### Snippet
```java
         * <pre>
         *     "MAC_OSX"   :"https://host/micronaut-x.y.z-macosx.zip"
         *     "LINUX_64"  :"https://host/micronaut-x.y.z-linux64.zip"
         *     "WINDOWS_64":"https://host/micronaut-x.y.z-win.zip"
         * </pre>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `sdks/jreleaser-sdkman-java-sdk/src/main/java/org/jreleaser/sdk/sdkman/MajorReleaseSdkmanCommand.java`
#### Snippet
```java
         *     "MAC_OSX"   :"https://host/micronaut-x.y.z-macosx.zip"
         *     "LINUX_64"  :"https://host/micronaut-x.y.z-linux64.zip"
         *     "WINDOWS_64":"https://host/micronaut-x.y.z-win.zip"
         * </pre>
         */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `sdks/jreleaser-sdkman-java-sdk/src/main/java/org/jreleaser/sdk/sdkman/MinorReleaseSdkmanCommand.java`
#### Snippet
```java
         * Example:
         * <pre>
         *     "MAC_OSX"   :"https://host/micronaut-x.y.z-macosx.zip"
         *     "LINUX_64"  :"https://host/micronaut-x.y.z-linux64.zip"
         *     "WINDOWS_64":"https://host/micronaut-x.y.z-win.zip"
```

### JavadocLinkAsPlainText
Link specified as plain text
in `sdks/jreleaser-sdkman-java-sdk/src/main/java/org/jreleaser/sdk/sdkman/MinorReleaseSdkmanCommand.java`
#### Snippet
```java
         * <pre>
         *     "MAC_OSX"   :"https://host/micronaut-x.y.z-macosx.zip"
         *     "LINUX_64"  :"https://host/micronaut-x.y.z-linux64.zip"
         *     "WINDOWS_64":"https://host/micronaut-x.y.z-win.zip"
         * </pre>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `sdks/jreleaser-sdkman-java-sdk/src/main/java/org/jreleaser/sdk/sdkman/MinorReleaseSdkmanCommand.java`
#### Snippet
```java
         *     "MAC_OSX"   :"https://host/micronaut-x.y.z-macosx.zip"
         *     "LINUX_64"  :"https://host/micronaut-x.y.z-linux64.zip"
         *     "WINDOWS_64":"https://host/micronaut-x.y.z-win.zip"
         * </pre>
         */
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.setReadable()` is ignored
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
            Files.setPosixFilePermissions(path, perms);
        } else if (accessRights.contains("r")) {
            path.toFile().setReadable(true);
        } else if (accessRights.contains("w")) {
            path.toFile().setWritable(true);
```

### IgnoreResultOfCall
Result of `File.setWritable()` is ignored
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
            path.toFile().setReadable(true);
        } else if (accessRights.contains("w")) {
            path.toFile().setWritable(true);
        } else if (accessRights.contains("x")) {
            path.toFile().setExecutable(true);
```

### IgnoreResultOfCall
Result of `File.setExecutable()` is ignored
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
            path.toFile().setWritable(true);
        } else if (accessRights.contains("x")) {
            path.toFile().setExecutable(true);
        }
    }
```

### IgnoreResultOfCall
Result of `File.setExecutable()` is ignored
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
            fileAttributeView.setPermissions(convertToPermissionsSet(mode));
        } else {
            path.toFile().setExecutable(true);
        }
    }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
                    .sorted(Comparator.reverseOrder())
                    .map(Path::toFile)
                    .forEach(File::delete);
            }
            if (!keepRoot) Files.deleteIfExists(path);
```

### IgnoreResultOfCall
Result of `File.setReadable()` is ignored
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
            File s = src.toFile();
            File d = dest.toFile();
            d.setReadable(s.canRead());
            d.setWritable(s.canWrite());
            d.setExecutable(s.canExecute());
```

### IgnoreResultOfCall
Result of `File.setWritable()` is ignored
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
            File d = dest.toFile();
            d.setReadable(s.canRead());
            d.setWritable(s.canWrite());
            d.setExecutable(s.canExecute());
        }
```

### IgnoreResultOfCall
Result of `File.setExecutable()` is ignored
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
            d.setReadable(s.canRead());
            d.setWritable(s.canWrite());
            d.setExecutable(s.canExecute());
        }
    }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/checksum/Checksum.java`
#### Snippet
```java
            context.getLogger().info("{}.{}", context.relativizeToBasedir(input), algorithm.formatted());
            String hashcode = ChecksumUtils.checksum(algorithm, Files.readAllBytes(input));
            output.toFile().getParentFile().mkdirs();
            Files.write(output, hashcode.getBytes(UTF_8));
            return hashcode;
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Banner.java`
#### Snippet
```java
        if (!markerFile.exists()) {
            if (!JReleaserOutput.isQuiet()) out.println(INSTANCE.message);
            markerFile.getParentFile().mkdirs();
            writeQuietly(markerFile, "1");
        } else {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `plugins/jdks-maven-plugin/src/main/java/org/jreleaser/jdks/maven/plugin/Banner.java`
#### Snippet
```java
            if (!markerFile.exists()) {
                if (!quiet) log.info(INSTANCE.message);
                markerFile.getParentFile().mkdirs();
                PrintStream out = newPrintStream(new FileOutputStream(markerFile));
                out.println("1");
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `plugins/jdks-gradle-plugin/src/main/groovy/org/jreleaser/jdks/gradle/plugin/Banner.java`
#### Snippet
```java
        if (!markerFile.exists()) {
            if (printBanner) System.err.println(banner);
            markerFile.getParentFile().mkdirs();
            writeQuietly(markerFile, "1");
        } else {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/Banner.java`
#### Snippet
```java
            if (!markerFile.exists()) {
                writer.println(INSTANCE.message);
                markerFile.getParentFile().mkdirs();
                PrintStream out = newPrintStream(new FileOutputStream(markerFile));
                out.println("1");
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/Banner.java`
#### Snippet
```java
            if (!markerFile.exists()) {
                if (!quiet) log.info(INSTANCE.message);
                markerFile.getParentFile().mkdirs();
                PrintStream out = newPrintStream(new FileOutputStream(markerFile));
                out.println("1");
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/Banner.java`
#### Snippet
```java
        if (!markerFile.exists()) {
            if (printBanner) System.err.println(banner);
            markerFile.getParentFile().mkdirs();
            writeQuietly(markerFile, "1");
        } else {
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java
        if (value.startsWith("os400")) {
            // Avoid the names such as os4000
            if (value.length() <= 5 || !Character.isDigit(value.charAt(5))) {
                return "os400";
            }
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java
        try {
            InputStream in = fileOperationProvider.readFile(fileName);
            reader = new BufferedReader(new InputStreamReader(in, "utf-8"));

            // There is only a single line in this file.
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `api/jreleaser-utils/src/main/java/org/jreleaser/dependencies/os/Detector.java`
#### Snippet
```java
        try {
            InputStream in = fileOperationProvider.readFile(fileName);
            reader = new BufferedReader(new InputStreamReader(in, "utf-8"));

            String id = null;
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/TemplateGenerate.java`
#### Snippet
```java
@CommandLine.Command(name = "generate")
public class TemplateGenerate extends AbstractLoggingCommand<Template> {
    @CommandLine.ArgGroup(exclusive = true, multiplicity = "1")
    Composite composite;

```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `isSnapshotSupported()` is identical to its super method
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/AbstractUploader.java`
#### Snippet
```java

    @Override
    public boolean isSnapshotSupported() {
        return true;
    }
```

### RedundantMethodOverride
Method `isSnapshotSupported()` is identical to its super method
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/AbstractAnnouncer.java`
#### Snippet
```java

    @Override
    public boolean isSnapshotSupported() {
        return true;
    }
```

### RedundantMethodOverride
Method `isSnapshotSupported()` is identical to its super method
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/DockerPackager.java`
#### Snippet
```java

    @Override
    public boolean isSnapshotSupported() {
        return true;
    }
```

### RedundantMethodOverride
Method `isSnapshotSupported()` is identical to its super method
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/JibPackager.java`
#### Snippet
```java

    @Override
    public boolean isSnapshotSupported() {
        return true;
    }
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'TemplateResource' used without 'try'-with-resources statement
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/init/Init.java`
#### Snippet
```java
            Path outputFile = outputDirectory.resolve("jreleaser." + format);

            TemplateResource template = TemplateUtils.resolveTemplate(logger, "init/jreleaser." + format + ".tpl");

            String content = IOUtils.toString(template.getReader());
```

### AutoCloseableResource
'TemplateResource' used without 'try'-with-resources statement
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/templates/TemplateEvaluator.java`
#### Snippet
```java
            Files.createDirectories(targetDirectory);

            TemplateResource template = resolveTemplate(templatePath);
            TemplateContext props = setupTemplateContext(context);

```

### AutoCloseableResource
'Git' used without 'try'-with-resources statement
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/AbstractRepositoryPackagerProcessor.java`
#### Snippet
```java
                .setDirectory(directory.toFile())
                .setURI(repository.getHttpUrl())
                .call();

            boolean emptyRepository = true;
```

### AutoCloseableResource
'Git' used without 'try'-with-resources statement
in `core/jreleaser-engine/src/main/java/org/jreleaser/announcers/ArticleAnnouncer.java`
#### Snippet
```java
                .setDirectory(directory.toFile())
                .setURI(repository.getHttpUrl())
                .call();

            boolean emptyRepository = true;
```

### AutoCloseableResource
'TemplateResource' used without 'try'-with-resources statement
in `core/jreleaser-engine/src/main/java/org/jreleaser/extensions/internal/DefaultExtensionManager.java`
#### Snippet
```java
            Path pom = Files.createTempFile("jreleaser-extensions", "pom.xml");

            TemplateResource template = TemplateUtils.resolveTemplate(context.getLogger(), "extensions/pom.xml.tpl");

            String[] gav = extensionDef.getGav().split(":");
```

### AutoCloseableResource
'TemplateResource' used without 'try'-with-resources statement
in `core/jreleaser-templates/src/main/java/org/jreleaser/templates/TemplateGenerator.java`
#### Snippet
```java
        }

        TemplateResource value = TemplateUtils.resolveTemplate(logger, "announcers/" + announcerName + ".tpl");

        Path outputFile = outputDirectory.resolve(announcerName + ".tpl");
```

### AutoCloseableResource
'Git' used without 'try'-with-resources statement
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/GitSdk.java`
#### Snippet
```java

    public Repository getRemote() throws IOException {
        Git git = open();

        String remote = resolveDefaultGitRemoteName();
```

### AutoCloseableResource
'Git' used without 'try'-with-resources statement
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/GitSdk.java`
#### Snippet
```java

    public Commit head() throws IOException {
        Git git = open();

        RevWalk walk = new RevWalk(git.getRepository());
```

### AutoCloseableResource
'Git' used without 'try'-with-resources statement
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/GitSdk.java`
#### Snippet
```java

    public List<String> getRemoteBranches() throws IOException {
        Git git = open();

        try {
```

### AutoCloseableResource
'Git' used without 'try'-with-resources statement
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/GitSdk.java`
#### Snippet
```java

    public void deleteTag(String tagName) throws IOException {
        Git git = open();

        try {
```

### AutoCloseableResource
'Git' used without 'try'-with-resources statement
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/GitSdk.java`
#### Snippet
```java

    public boolean findTag(String tagName) throws IOException {
        Git git = open();

        try {
```

### AutoCloseableResource
'Git' used without 'try'-with-resources statement
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/GitSdk.java`
#### Snippet
```java

    public void tag(String tagName, boolean force, JReleaserContext context) throws IOException {
        Git git = open();

        try {
```

### AutoCloseableResource
'Git' used without 'try'-with-resources statement
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/GitSdk.java`
#### Snippet
```java

    public List<String> getLocalBranchNames() throws IOException {
        Git git = open();

        try {
```

### AutoCloseableResource
'Reader' used without 'try'-with-resources statement
in `sdks/jreleaser-http-java-sdk/src/main/java/org/jreleaser/sdk/http/HttpArtifactUploader.java`
#### Snippet
```java

                    if (uploader.getMethod() == Http.Method.POST) {
                        ClientUtils.postFile(context.getLogger(),
                            uploader.getResolvedUploadUrl(context, artifact),
                            uploader.getConnectTimeout(),
```

### AutoCloseableResource
'Reader' used without 'try'-with-resources statement
in `sdks/jreleaser-http-java-sdk/src/main/java/org/jreleaser/sdk/http/HttpArtifactUploader.java`
#### Snippet
```java
                            headers);
                    } else {
                        ClientUtils.putFile(context.getLogger(),
                            uploader.getResolvedUploadUrl(context, artifact),
                            uploader.getConnectTimeout(),
```

### AutoCloseableResource
'Reader' used without 'try'-with-resources statement
in `sdks/jreleaser-http-java-sdk/src/main/java/org/jreleaser/sdk/http/HttpAnnouncer.java`
#### Snippet
```java

            if (announcer.getMethod() == Http.Method.POST) {
                ClientUtils.postFile(context.getLogger(),
                    resolvedUrl,
                    announcer.getConnectTimeout(),
```

### AutoCloseableResource
'Reader' used without 'try'-with-resources statement
in `sdks/jreleaser-http-java-sdk/src/main/java/org/jreleaser/sdk/http/HttpAnnouncer.java`
#### Snippet
```java
                    headers);
            } else {
                ClientUtils.putFile(context.getLogger(),
                    resolvedUrl,
                    announcer.getConnectTimeout(),
```

### AutoCloseableResource
'Reader' used without 'try'-with-resources statement
in `sdks/jreleaser-azure-java-sdk/src/main/java/org/jreleaser/sdk/azure/AzureMavenDeployer.java`
#### Snippet
```java

                    String url = baseUrl + deployable.getFullDeployPath();
                    ClientUtils.putFile(context.getLogger(),
                        url,
                        deployer.getConnectTimeout(),
```

### AutoCloseableResource
'Reader' used without 'try'-with-resources statement
in `sdks/jreleaser-gitea-java-sdk/src/main/java/org/jreleaser/sdk/gitea/GiteaArtifactUploader.java`
#### Snippet
```java
                    FormData data = ClientUtils.toFormData(path);

                    ClientUtils.putFile(context.getLogger(),
                        uploader.getResolvedUploadUrl(context, artifact),
                        uploader.getConnectTimeout(),
```

### AutoCloseableResource
'Reader' used without 'try'-with-resources statement
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/GitlabArtifactUploader.java`
#### Snippet
```java
                    FormData data = ClientUtils.toFormData(path);

                    ClientUtils.putFile(context.getLogger(),
                        uploader.getResolvedUploadUrl(context, artifact),
                        uploader.getConnectTimeout(),
```

### AutoCloseableResource
'Reader' used without 'try'-with-resources statement
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
                payload);

            ClientUtils.postFile(logger,
                graphQlEndpoint,
                connectTimeout,
```

### AutoCloseableResource
'Reader' used without 'try'-with-resources statement
in `sdks/jreleaser-nexus2-java-sdk/src/main/java/org/jreleaser/sdk/nexus2/Nexus2.java`
#### Snippet
```java
                .append(filename);

            ClientUtils.putFile(logger,
                url.toString(),
                connectTimeout,
```

### AutoCloseableResource
'Reader' used without 'try'-with-resources statement
in `sdks/jreleaser-artifactory-java-sdk/src/main/java/org/jreleaser/sdk/artifactory/ArtifactoryArtifactUploader.java`
#### Snippet
```java
                    headers.put("X-Checksum", ChecksumUtils.checksum(Algorithm.MD5, data.getData()));

                    ClientUtils.putFile(context.getLogger(),
                        uploader.getResolvedUploadUrl(context, artifact),
                        uploader.getConnectTimeout(),
```

### AutoCloseableResource
'Reader' used without 'try'-with-resources statement
in `sdks/jreleaser-artifactory-java-sdk/src/main/java/org/jreleaser/sdk/artifactory/ArtifactoryMavenDeployer.java`
#### Snippet
```java

                    String url = baseUrl + deployable.getFullDeployPath();
                    ClientUtils.putFile(context.getLogger(),
                        url,
                        deployer.getConnectTimeout(),
```

### AutoCloseableResource
'Reader' used without 'try'-with-resources statement
in `sdks/jreleaser-java-sdk-commons/src/main/java/org/jreleaser/sdk/commons/AbstractMavenDeployer.java`
#### Snippet
```java

                    String url = baseUrl + deployable.getFullDeployPath();
                    ClientUtils.putFile(context.getLogger(),
                        url,
                        deployer.getConnectTimeout(),
```

## RuleId[id=SlowListContainsAll]
### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java
        @Override
        public boolean containsAll(Collection<?> objects) {
            return delegate.containsAll(objects);
        }

```

## RuleId[id=ExcessiveLambdaUsage]
### ExcessiveLambdaUsage
Excessive lambda usage
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/signing/SigningValidator.java`
#### Snippet
```java
            .filter(b -> b)
            .findAny()
            .orElseGet(() -> false);

        if (!checkSign) {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `distributionType` may be 'final'
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/JReleaserTemplateGenerateMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "jreleaser.template.distribution.type", defaultValue = "JAVA_BINARY")
    private org.jreleaser.model.Distribution.DistributionType distributionType = org.jreleaser.model.Distribution.DistributionType.JAVA_BINARY;

    /**
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'feign.FeignException', in the throws list already.
in `sdks/jreleaser-nexus2-java-sdk/src/main/java/org/jreleaser/sdk/nexus2/Nexus2.java`
#### Snippet
```java

        @Override
        public Object decode(Response response, Type type) throws IOException, DecodeException, FeignException {
            try {
                return xml.decode(response, type);
```

## RuleId[id=RegExpUnnecessaryNonCapturingGroup]
### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[1-9]\\d*)`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/ChronVer.java`
#### Snippet
```java
 */
public class ChronVer implements Version<ChronVer> {
    private static final Pattern VERSION_PATTERN = Pattern.compile("^([2-9]\\d{3})\\.(0[1-9]|1[0-2])\\.(0[1-9]|[1-2]\\d|3[0-1])(?:\\.((?:[1-9]\\d*)(?:(?:-[a-zA-Z0-9]+)+(?:\\.[1-9]\\d*)?)?))?(?:-[a-zA-Z0-9]+)?$");
    private static final Pattern CHANGESET_PATTERN = Pattern.compile("^(?:((?:[1-9]\\d*))(?:-([a-zA-Z0-9-]+[a-zA-Z0-9]?)(?:\\.([1-9]\\d*))?)?)?$");

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[1-9]\\d*)`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/ChronVer.java`
#### Snippet
```java
public class ChronVer implements Version<ChronVer> {
    private static final Pattern VERSION_PATTERN = Pattern.compile("^([2-9]\\d{3})\\.(0[1-9]|1[0-2])\\.(0[1-9]|[1-2]\\d|3[0-1])(?:\\.((?:[1-9]\\d*)(?:(?:-[a-zA-Z0-9]+)+(?:\\.[1-9]\\d*)?)?))?(?:-[a-zA-Z0-9]+)?$");
    private static final Pattern CHANGESET_PATTERN = Pattern.compile("^(?:((?:[1-9]\\d*))(?:-([a-zA-Z0-9-]+[a-zA-Z0-9]?)(?:\\.([1-9]\\d*))?)?)?$");

    private final int year;
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `entry` initializer `null` is redundant
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java

    private static void unpackArchive(String basename, File destinationDir, ArchiveInputStream in) throws IOException {
        ArchiveEntry entry = null;
        while (null != (entry = in.getNextEntry())) {
            if (!in.canReadEntryData(entry)) {
```

### UnusedAssignment
Variable `entry` initializer `null` is redundant
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
        List<String> entries = new ArrayList<>();

        ArchiveEntry entry = null;
        while (null != (entry = in.getNextEntry())) {
            if (!in.canReadEntryData(entry)) {
```

### UnusedAssignment
Variable `entry` initializer `null` is redundant
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java

    private static String resolveRootEntryName(ArchiveInputStream in) throws IOException {
        ArchiveEntry entry = null;
        while (null != (entry = in.getNextEntry())) {
            if (!in.canReadEntryData(entry)) {
```

### UnusedAssignment
Variable `y` initializer `null` is redundant
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
        List<Character> delims = listOf('.', '_', '-', '[');
        String f = format.trim();
        String y = null;
        String m = null;
        String w = null;
```

### UnusedAssignment
Variable `o` initializer `null` is redundant
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
        String n = null;
        String r = null;
        String o = null;
        int i = 0;

```

### UnusedAssignment
Variable `done` initializer `false` is redundant
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java

        boolean micro = false;
        boolean done = false;
        if (binarySearch(NUMBERS, s.token) >= 0) {
            tokens.add(s.token);
```

### UnusedAssignment
Variable `commandLine` initializer `null` is redundant
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/hooks/HookExecutor.java`
#### Snippet
```java

    private void executeCommandLine(Map<String, String> localEnv, Hook hook, String cmd, String resolvedCmd, String errorKey) {
        List<String> commandLine = null;

        Map<String, String> hookEnv = new LinkedHashMap<>(localEnv);
```

### UnusedAssignment
Variable `scriptFile` initializer `null` is redundant
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/hooks/HookExecutor.java`
#### Snippet
```java
        try {
            for (ScriptHook hook : hooks) {
                Path scriptFile = null;

                try {
```

### UnusedAssignment
Variable `pgpSigList` initializer `null` is redundant
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/sign/Signer.java`
#### Snippet
```java
                new FileInputStream(filePair.getSignatureFile().toFile())))) {
            PGPObjectFactory pgpObjFactory = new PGPObjectFactory(sigInputStream, keyring.getKeyFingerPrintCalculator());
            Iterable<?> pgpSigList = null;

            Object obj = pgpObjFactory.nextObject();
```

### UnusedAssignment
Variable `newContent` initializer `null` is redundant
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/catalog/Slsa.java`
#### Snippet
```java
        }

        String newContent = null;
        try {
            Attestations attestations = new Attestations();
```

### UnusedAssignment
Variable `fullChangelog` initializer `null` is redundant
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/release/ChangelogResolver.java`
#### Snippet
```java

        Path target = context.getBasedir().resolve(append.getTarget());
        String fullChangelog = null;
        try {
            fullChangelog = Files.exists(target) ? new String(Files.readAllBytes(target), UTF_8) : "";
```

### UnusedAssignment
Variable `repository` initializer `null` is redundant
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/context/ModelConfigurer.java`
#### Snippet
```java
        }

        Repository repository = null;
        try {
            repository = GitSdk.of(context).getRemote();
```

### UnusedAssignment
Variable `service` initializer `null` is redundant
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/context/ModelAutoConfigurer.java`
#### Snippet
```java
            boolean grs = resolveBoolean(org.jreleaser.model.api.JReleaserContext.GIT_ROOT_SEARCH, gitRootSearch);
            Repository repository = GitSdk.of(basedir, grs).getRemote();
            BaseReleaser<?, ?> service = null;
            switch (repository.getKind()) {
                case GITHUB:
```

### UnusedAssignment
Variable `jars` initializer `null` is redundant
in `core/jreleaser-engine/src/main/java/org/jreleaser/extensions/internal/DefaultExtensionManager.java`
#### Snippet
```java
        }

        List<Path> jars = null;
        try (Stream<Path> jarPaths = Files.list(directoryPath)) {
            jars = jarPaths
```

### UnusedAssignment
Variable `artifactFile` initializer `""` is redundant
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModel.java`
#### Snippet
```java
        public String apply(String input) {
            String format = MARKDOWN;
            String artifactFile = "";
            String linkName = "";
            String[] parts = input.split(":");
```

### UnusedAssignment
Variable `linkName` initializer `""` is redundant
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModel.java`
#### Snippet
```java
            String format = MARKDOWN;
            String artifactFile = "";
            String linkName = "";
            String[] parts = input.split(":");
            if (parts.length == 1) {
```

### UnusedAssignment
Variable `commit` initializer `null` is redundant
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/GitSdk.java`
#### Snippet
```java
        RevWalk walk = new RevWalk(git.getRepository());
        ObjectId head = git.getRepository().resolve(Constants.HEAD);
        RevCommit commit = null;

        try {
```

### UnusedAssignment
Variable `config` initializer `null` is redundant
in `core/jreleaser-config-yaml/src/main/java/org/jreleaser/config/yaml/YamlJReleaserConfigParser.java`
#### Snippet
```java
    @Override
    public void validate(Path configFile) throws IOException {
        YamlLintConfig config = null;
        try {
            config = new YamlLintConfig(YAML_LINT_CONFIG);
```

### UnusedAssignment
Variable `message` initializer `""` is redundant
in `sdks/jreleaser-smtp-java-sdk/src/main/java/org/jreleaser/sdk/smtp/SmtpAnnouncer.java`
#### Snippet
```java
    @Override
    public void announce() throws AnnounceException {
        String message = "";
        if (isNotBlank(smtp.getMessage())) {
            message = smtp.getResolvedMessage(context);
```

### UnusedAssignment
Variable `payload` initializer `""` is redundant
in `sdks/jreleaser-http-java-sdk/src/main/java/org/jreleaser/sdk/http/HttpAnnouncer.java`
#### Snippet
```java

    public void announce(org.jreleaser.model.internal.announce.HttpAnnouncer announcer) throws AnnounceException {
        String payload = "";
        if (isNotBlank(announcer.getPayload())) {
            payload = announcer.getResolvedPayload(context);
```

### UnusedAssignment
Variable `url` initializer `null` is redundant
in `sdks/jreleaser-gitea-java-sdk/src/main/java/org/jreleaser/sdk/gitea/GiteaMavenDeployer.java`
#### Snippet
```java

    private void deletePackage(String baseUrl, String token, Deployable deployable) throws DeployException {
        URL url = null;

        try {
```

### UnusedAssignment
Variable `message` initializer `""` is redundant
in `sdks/jreleaser-slack-java-sdk/src/main/java/org/jreleaser/sdk/slack/SlackAnnouncer.java`
#### Snippet
```java
    @Override
    public void announce() throws AnnounceException {
        String message = "";
        if (isNotBlank(slack.getMessage())) {
            message = slack.getResolvedMessage(context);
```

### UnusedAssignment
Variable `message` initializer `""` is redundant
in `sdks/jreleaser-zulip-java-sdk/src/main/java/org/jreleaser/sdk/zulip/ZulipAnnouncer.java`
#### Snippet
```java
    @Override
    public void announce() throws AnnounceException {
        String message = "";
        if (isNotBlank(zulip.getMessage())) {
            message = zulip.getResolvedMessage(context);
```

### UnusedAssignment
Variable `message` initializer `""` is redundant
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/DiscussionsAnnouncer.java`
#### Snippet
```java
        GithubReleaser github = context.getModel().getRelease().getGithub();

        String message = "";
        if (isNotBlank(discussions.getMessage())) {
            message = discussions.getResolvedMessage(context);
```

### UnusedAssignment
Variable `gtLabel` initializer `null` is redundant
in `sdks/jreleaser-gitea-java-sdk/src/main/java/org/jreleaser/sdk/gitea/GiteaReleaser.java`
#### Snippet
```java
        }

        GtLabel gtLabel = null;

        try {
```

### UnusedAssignment
Variable `url` initializer `null` is redundant
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/GitlabMavenDeployer.java`
#### Snippet
```java

    private Gitlab createApi(String baseUrl, String token) throws DeployException {
        URL url = null;

        try {
```

### UnusedAssignment
Variable `ghLabel` initializer `null` is redundant
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/GithubReleaser.java`
#### Snippet
```java
        }

        GhLabel ghLabel = null;

        try {
```

### UnusedAssignment
Variable `glLabel` initializer `null` is redundant
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/GitlabReleaser.java`
#### Snippet
```java
        }

        GlLabel glLabel = null;

        try {
```

### UnusedAssignment
Variable `text` initializer `""` is redundant
in `sdks/jreleaser-linkedin-java-sdk/src/main/java/org/jreleaser/sdk/linkedin/LinkedinAnnouncer.java`
#### Snippet
```java

        Message message = null;
        String text = "";
        if (isNotBlank(linkedin.getMessage())) {
            text = linkedin.getResolvedMessage(context);
```

### UnusedAssignment
Variable `length` initializer `0` is redundant
in `sdks/jreleaser-signing-java-sdk/src/main/java/org/jreleaser/sdk/signing/SigningUtils.java`
#### Snippet
```java

            byte[] buffer = new byte[8192];
            int length = 0;
            while ((length = in.read(buffer)) >= 0) {
                signatureGenerator.update(buffer, 0, length);
```

### UnusedAssignment
Variable `pgpSigList` initializer `null` is redundant
in `sdks/jreleaser-signing-java-sdk/src/main/java/org/jreleaser/sdk/signing/SigningUtils.java`
#### Snippet
```java

            PGPObjectFactory pgpObjFactory = new PGPObjectFactory(sigInputStream, keyring.getKeyFingerPrintCalculator());
            Iterable<?> pgpSigList = null;

            Object obj = pgpObjFactory.nextObject();
```

### UnusedAssignment
Variable `message` initializer `""` is redundant
in `sdks/jreleaser-telegram-java-sdk/src/main/java/org/jreleaser/sdk/telegram/TelegramAnnouncer.java`
#### Snippet
```java
    @Override
    public void announce() throws AnnounceException {
        String message = "";
        if (isNotBlank(telegram.getMessage())) {
            message = telegram.getResolvedMessage(context);
```

### UnusedAssignment
Variable `message` initializer `""` is redundant
in `sdks/jreleaser-discourse-java-sdk/src/main/java/org/jreleaser/sdk/discourse/DiscourseAnnouncer.java`
#### Snippet
```java
    @Override
    public void announce() throws AnnounceException {
        String message = "";
        if (isNotBlank(discourse.getMessage())) {
            message = discourse.getResolvedMessage(context);
```

### UnusedAssignment
Variable `message` initializer `""` is redundant
in `sdks/jreleaser-webhooks-java-sdk/src/main/java/org/jreleaser/sdk/webhooks/WebhooksAnnouncer.java`
#### Snippet
```java

    public static void announce(JReleaserContext context, WebhookAnnouncer webhook, boolean discreet) throws AnnounceException {
        String message = "";
        if (isNotBlank(webhook.getMessage())) {
            message = webhook.getResolvedMessage(context);
```

### UnusedAssignment
Variable `gtLabel` initializer `null` is redundant
in `sdks/jreleaser-codeberg-java-sdk/src/main/java/org/jreleaser/sdk/codeberg/CodebergReleaser.java`
#### Snippet
```java
        }

        GtLabel gtLabel = null;

        try {
```

### UnusedAssignment
Variable `publicKeyID` initializer `Optional.empty()` is redundant
in `sdks/jreleaser-java-sdk-commons/src/main/java/org/jreleaser/sdk/commons/AbstractMavenDeployer.java`
#### Snippet
```java

    private void verifyKeyIsPublished() {
        Optional<String> publicKeyID = Optional.empty();

        try {
```

### UnusedAssignment
Variable `message` initializer `""` is redundant
in `sdks/jreleaser-opencollective-java-sdk/src/main/java/org/jreleaser/sdk/opencollective/OpenCollectiveAnnouncer.java`
#### Snippet
```java
    @Override
    public void announce() throws AnnounceException {
        String message = "";
        if (isNotBlank(openCollective.getMessage())) {
            message = openCollective.getResolvedMessage(context);
```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java

        @Override
        public boolean equals(Object o) {
            return delegate.equals(o);
        }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java

        @Override
        public boolean equals(Object o) {
            return delegate.equals(o);
        }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java

        @Override
        public boolean equals(Object o) {
            return delegate.equals(o);
        }
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `algorithm` is always 'null'
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/ChecksumUtils.java`
#### Snippet
```java
    public static String checksum(Algorithm algorithm, byte[] data) throws IOException {
        if (null == algorithm) {
            throw new IOException(RB.$("ERROR_unsupported_algorithm", algorithm));
        }
        if (null == data || data.length == 0) {
```

### ConstantValue
Value `p` is always 'null'
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaRuntimeVersion.java`
#### Snippet
```java
            Matcher m = O.matcher(s);
            if (m.matches()) {
                return new JavaRuntimeVersion(v, p, b, m.group(1), O);
            }

```

### ConstantValue
Value `b` is always 'null'
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaRuntimeVersion.java`
#### Snippet
```java
            Matcher m = O.matcher(s);
            if (m.matches()) {
                return new JavaRuntimeVersion(v, p, b, m.group(1), O);
            }

```

### ConstantValue
Value `b` is always 'null'
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaRuntimeVersion.java`
#### Snippet
```java
            m = PO.matcher(s);
            if (m.matches()) {
                return new JavaRuntimeVersion(v, m.group(1), b, m.group(2), PO);
            }

```

### ConstantValue
Value `b` is always 'true'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModelPrinter.java`
#### Snippet
```java
        if ("true".equalsIgnoreCase(s) || "false".equalsIgnoreCase(s)) {
            boolean b = Boolean.parseBoolean(s);
            return b ? green(String.valueOf(b)) : red(String.valueOf(b));
        } else {
            return null;
```

### ConstantValue
Value `b` is always 'false'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModelPrinter.java`
#### Snippet
```java
        if ("true".equalsIgnoreCase(s) || "false".equalsIgnoreCase(s)) {
            boolean b = Boolean.parseBoolean(s);
            return b ? green(String.valueOf(b)) : red(String.valueOf(b));
        } else {
            return null;
```

### ConstantValue
Value `b` is always 'true'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModelPrinter.java`
#### Snippet
```java
        if (value instanceof Boolean) {
            Boolean b = (Boolean) value;
            return b ? green(String.valueOf(b)) : red(String.valueOf(b));
        } else if (value instanceof Number) {
            return cyan(String.valueOf(value));
```

### ConstantValue
Value `b` is always 'false'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModelPrinter.java`
#### Snippet
```java
        if (value instanceof Boolean) {
            Boolean b = (Boolean) value;
            return b ? green(String.valueOf(b)) : red(String.valueOf(b));
        } else if (value instanceof Number) {
            return cyan(String.valueOf(value));
```

### ConstantValue
Value `value` is always 'null'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModelPrinter.java`
#### Snippet
```java
        }

        return String.valueOf(value);
    }

```

### ConstantValue
Result of `isPrimary()` is always 'true'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/common/Screenshot.java`
#### Snippet
```java
        map.put("type", type);
        map.put("url", url);
        if (isPrimary()) map.put("primary", isPrimary());
        map.put("caption", caption);
        map.put("width", width);
```

### ConstantValue
Value `set` is always 'true'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/SdkmanPackagerValidator.java`
#### Snippet
```java
                    boolean set = (boolean) distribution.getSdkman().getExtraProperties().remove(MAGIC_SET);
                    if (set) {
                        context.getModel().getAnnounce().getSdkman().getExtraProperties().put(MAGIC_SET, set);
                    }
                }
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'org.gradle.api.services.BuildServiceParameters' is declared in unstable package 'org.gradle.api.services' marked with @Incubating
in `plugins/jdks-gradle-plugin/src/main/groovy/org/jreleaser/jdks/gradle/plugin/Banner.java`
#### Snippet
```java
    private final List<String> projectNames = new ArrayList<>();

    interface Params extends BuildServiceParameters {
    }

```

### UnstableApiUsage
'org.gradle.api.services.BuildService' is declared in unstable package 'org.gradle.api.services' marked with @Incubating
in `plugins/jdks-gradle-plugin/src/main/groovy/org/jreleaser/jdks/gradle/plugin/Banner.java`
#### Snippet
```java
 * @author Andres Almiray
 */
public abstract class Banner implements BuildService<Banner.Params> {
    private static final String ORG_JRELEASER_BANNER = "org.jreleaser.banner";

```

### UnstableApiUsage
'org.gradle.api.services.BuildServiceParameters' is declared in unstable package 'org.gradle.api.services' marked with @Incubating
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/Banner.java`
#### Snippet
```java
    private final List<String> projectNames = new ArrayList<>();

    interface Params extends BuildServiceParameters {
    }

```

### UnstableApiUsage
'org.gradle.api.services.BuildService' is declared in unstable package 'org.gradle.api.services' marked with @Incubating
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/Banner.java`
#### Snippet
```java
 * @author Andres Almiray
 */
public abstract class Banner implements BuildService<Banner.Params> {
    private static final String ORG_JRELEASER_BANNER = "org.jreleaser.banner";

```

### UnstableApiUsage
'because' is declared in unstable annotation 'org.gradle.api.tasks.UntrackedTask' marked with @Incubating
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/tasks/JReleaserInitTask.groovy`
#### Snippet
```java
 */
@CompileStatic
@UntrackedTask(because = 'writes to project.basedir')
abstract class JReleaserInitTask extends DefaultTask {
    static final String NAME = 'jreleaserInit'
```

### UnstableApiUsage
'org.gradle.api.services.BuildServiceParameters' is declared in unstable package 'org.gradle.api.services' marked with @Incubating
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/internal/JReleaserLoggerService.java`
#### Snippet
```java
    private final JReleaserLogger logger;

    public interface Params extends BuildServiceParameters {
        Property<AnsiConsole> getConsole();

```

### UnstableApiUsage
'org.gradle.api.services.BuildService' is declared in unstable package 'org.gradle.api.services' marked with @Incubating
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/internal/JReleaserLoggerService.java`
#### Snippet
```java
 * @since 1.4.0
 */
public abstract class JReleaserLoggerService implements BuildService<JReleaserLoggerService.Params>, AutoCloseable {
    private final JReleaserLogger logger;

```

### UnstableApiUsage
'getParameters()' is declared in unstable package 'org.gradle.api.services' marked with @Incubating
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/internal/JReleaserLoggerService.java`
#### Snippet
```java
    public JReleaserLoggerService() {
        try {
            Path outputDirectoryPath = getParameters().getOutputDirectory().get().getAsFile().toPath();
            Files.createDirectories(outputDirectoryPath);
            File traceLogFile = outputDirectoryPath.resolve("trace.log").toFile();
```

### UnstableApiUsage
'getParameters()' is declared in unstable package 'org.gradle.api.services' marked with @Incubating
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/internal/JReleaserLoggerService.java`
#### Snippet
```java
            PrintWriter tracer = IoUtils.newPrintWriter(new FileOutputStream(traceLogFile));

            logger = new JReleaserLoggerAdapter(getParameters().getConsole().get(),
                getParameters().getLogLevel().get(), tracer);
        } catch (IOException e) {
```

### UnstableApiUsage
'getParameters()' is declared in unstable package 'org.gradle.api.services' marked with @Incubating
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/internal/JReleaserLoggerService.java`
#### Snippet
```java

            logger = new JReleaserLoggerAdapter(getParameters().getConsole().get(),
                getParameters().getLogLevel().get(), tracer);
        } catch (IOException e) {
            throw new IllegalStateException(e);
```

