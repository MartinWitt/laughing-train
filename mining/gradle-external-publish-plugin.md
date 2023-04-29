# gradle-external-publish-plugin 
 
# Bad smells
I found 17 bad smells with 11 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| CodeBlock2Expr | 11 | true |
| SimplifyOptionalCallChains | 2 | false |
| AbstractClassNeverImplemented | 2 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| BoundedWildcard | 1 | false |
## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/palantir/gradle/externalpublish/ExternalPublishApplicationDistPlugin.java`
#### Snippet
```java

            String windowsScript = GFileUtils.readFile(createStartScripts.getWindowsScript());
            String modified = windowsScript.replaceFirst("(set CLASSPATH=%APP_HOME%\\\\lib\\\\).*", "$1*");
            GFileUtils.writeFile(modified, createStartScripts.getWindowsScript(), StandardCharsets.UTF_8.toString());
        }
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/java/com/palantir/gradle/externalpublish/CheckSigningKeyTask.java`
#### Snippet
```java
    @TaskAction
    public final void checkSigningKey() {
        if (!GpgSigningKey.fromEnv(getProject()).isPresent()) {
            throw new GradleException("The required environment variables to sign the release could not be found. "
                    + "Check the logs above to find out which ones are missing.");
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/java/com/palantir/gradle/externalpublish/GpgSigningKey.java`
#### Snippet
```java

        boolean onCi = System.getenv("CI") != null;
        if (onCi && !value.isPresent()) {
            log.warn("Could not find environment variable {}, signing will be disabled", envVar);
        }
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super MavenPublication`
in `src/main/java/com/palantir/gradle/externalpublish/ExternalPublishBasePlugin.java`
#### Snippet
```java
    }

    public void addPublication(String publicationName, Action<MavenPublication> publicationConfiguration) {
        sonatypePublicationNames.add(publicationName);

```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `CheckSigningKeyTask` has no concrete subclass
in `src/main/java/com/palantir/gradle/externalpublish/CheckSigningKeyTask.java`
#### Snippet
```java
import org.gradle.api.tasks.TaskAction;

public abstract class CheckSigningKeyTask extends DefaultTask {
    @TaskAction
    public final void checkSigningKey() {
```

### AbstractClassNeverImplemented
Abstract class `CheckVersionTask` has no concrete subclass
in `src/main/java/com/palantir/gradle/externalpublish/CheckVersionTask.java`
#### Snippet
```java
import org.gradle.api.tasks.TaskAction;

public abstract class CheckVersionTask extends DefaultTask {
    @TaskAction
    public final void checkVersion() {
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/palantir/gradle/externalpublish/ExternalPublishJarPlugin.java`
#### Snippet
```java
        project.getPluginManager().apply(JavaLibraryPlugin.class);

        project.getTasks().withType(Jar.class).named("jar").configure(jar -> {
            jar.getManifest()
                    .attributes(
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/palantir/gradle/externalpublish/CircleCiContextDeadlineAvoidance.java`
#### Snippet
```java
            public void execute(Task _ignored) {
                spammerTask.set(CIRCLE_CI_OUTPUT_SPAMMER.scheduleWithFixedDelay(
                        () -> {
                            task.getLogger().lifecycle("Printing output to avoid hitting Circle context deadline");
                        },
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/palantir/gradle/externalpublish/ExternalPublishDistPlugin.java`
#### Snippet
```java
            // Unfortunately need to use afterEvaluate here, since MavenPublication#artifact immediately tries to get
            // the value from the task provider, which will fail if the task has not yet been created.
            project.afterEvaluate(_ignored -> {
                publication.artifact(project.getTasks().named("distTar"));
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/palantir/gradle/externalpublish/ExternalPublishRootPlugin.java`
#### Snippet
```java
        TaskProvider<?> checkSigningKeyTask = rootProject
                .getTasks()
                .register("checkSigningKey", CheckSigningKeyTask.class, checkSigningKey -> {
                    checkSigningKey.onlyIf(_ignored -> !EnvironmentVariables.isFork(rootProject));
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/palantir/gradle/externalpublish/ExternalPublishGradlePluginPlugin.java`
#### Snippet
```java
        project.getTasks().named("publish").configure(publish -> publish.dependsOn(publishPluginsTask));

        publishPluginsTask.configure(publishPlugins -> {
            publishPlugins.onlyIf(_ignored -> EnvironmentVariables.isTagBuild(project));
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/palantir/gradle/externalpublish/ExternalPublishApplicationDistPlugin.java`
#### Snippet
```java
                .configure(distTar -> distTar.setCompression(Compression.GZIP));

        project.getTasks().withType(CreateStartScripts.class).configureEach(createStartScripts -> {
            createStartScripts.doLast(new FixWindowsStartScripts());
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/palantir/gradle/externalpublish/ExternalPublishBasePlugin.java`
#### Snippet
```java

    private void disableOtherPublicationsFromPublishingToSonatype() {
        project.getTasks().withType(PublishToMavenRepository.class).configureEach(publishTask -> {
            publishTask.onlyIf(_ignored -> {
                if (publishTask.getRepository().getName().equals("sonatype")) {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/palantir/gradle/externalpublish/ExternalPublishBasePlugin.java`
#### Snippet
```java
                                + "*before* this plugin is evaluated"));

        rootPlugin.sonatypeFinishingTask().ifPresent(sonatypeFinishingTask -> {
            project.getTasks().named("publish").configure(publish -> {
                publish.dependsOn(sonatypeFinishingTask);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/palantir/gradle/externalpublish/ExternalPublishBasePlugin.java`
#### Snippet
```java

        rootPlugin.sonatypeFinishingTask().ifPresent(sonatypeFinishingTask -> {
            project.getTasks().named("publish").configure(publish -> {
                publish.dependsOn(sonatypeFinishingTask);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/palantir/gradle/externalpublish/ExternalPublishBasePlugin.java`
#### Snippet
```java
            publicationConfiguration.execute(mavenPublication);
            mavenPublication.pom(pom -> {
                pom.licenses(licenses -> {
                    licenses.license(license -> {
                        license.getName().set("The Apache License, Version 2.0");
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `src/main/java/com/palantir/gradle/externalpublish/ExternalPublishBasePlugin.java`
#### Snippet
```java
                    });
                });
                pom.developers(developers -> {
                    developers.developer(developer -> {
                        developer.getId().set("palantir");
```

