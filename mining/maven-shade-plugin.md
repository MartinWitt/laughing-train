# maven-shade-plugin 
 
# Bad smells
I found 165 bad smells with 58 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 50 | false |
| SizeReplaceableByIsEmpty | 33 | true |
| UnnecessaryLocalVariable | 18 | true |
| DynamicRegexReplaceableByCompiledPattern | 8 | false |
| AssignmentToMethodParameter | 8 | false |
| IOResource | 5 | false |
| ReplaceAssignmentWithOperatorAssignment | 4 | false |
| UseOfPropertiesAsHashtable | 4 | false |
| ReturnNull | 4 | false |
| NonShortCircuitBoolean | 3 | false |
| NonStrictComparisonCanBeEquality | 3 | true |
| UnnecessarySuperQualifier | 3 | false |
| Convert2Lambda | 3 | false |
| UtilityClassWithoutPrivateConstructor | 2 | true |
| UnnecessaryToStringCall | 2 | true |
| RedundantSuppression | 2 | false |
| MissingDeprecatedAnnotation | 2 | false |
| RedundantClassCall | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| RegExpSimplifiable | 1 | false |
| StringEqualsEmptyString | 1 | false |
| NestedAssignment | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| Java8MapApi | 1 | false |
| RedundantFieldInitialization | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
| UnusedAssignment | 1 | false |
## RuleId[id=IOResource]
### IOResource
'Scanner' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/org/apache/maven/plugins/shade/resource/SisuIndexResourceTransformer.java`
#### Snippet
```java
            final String resource, final InputStream is, final List<Relocator> relocators, long time)
            throws IOException {
        Scanner scanner = new Scanner(is, StandardCharsets.UTF_8.name());
        while (scanner.hasNextLine()) {
            String relContent = scanner.nextLine();
```

### IOResource
'Scanner' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/org/apache/maven/plugins/shade/resource/ServicesResourceTransformer.java`
#### Snippet
```java
        Set<String> out = serviceEntries.computeIfAbsent(resource, k -> new LinkedHashSet<>());

        Scanner scanner = new Scanner(is, StandardCharsets.UTF_8.name());
        while (scanner.hasNextLine()) {
            String relContent = scanner.nextLine();
```

### IOResource
'OutputStreamWriter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/org/apache/maven/plugins/shade/resource/ApacheNoticeResourceTransformer.java`
#### Snippet
```java
        Writer writer;
        if (StringUtils.isNotEmpty(encoding)) {
            writer = new OutputStreamWriter(jos, encoding);
        } else {
            writer = new OutputStreamWriter(jos);
```

### IOResource
'OutputStreamWriter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/org/apache/maven/plugins/shade/resource/ApacheNoticeResourceTransformer.java`
#### Snippet
```java
            writer = new OutputStreamWriter(jos, encoding);
        } else {
            writer = new OutputStreamWriter(jos);
        }

```

### IOResource
'OutputStreamWriter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/org/apache/maven/plugins/shade/DefaultShader.java`
#### Snippet
```java
        }

        final Writer writer = new OutputStreamWriter(jos, StandardCharsets.UTF_8);
        writer.write(sourceContent);
        writer.flush();
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `PomWriter` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/maven/plugins/shade/pom/PomWriter.java`
#### Snippet
```java
 * @author Jason van Zyl
 */
public class PomWriter {
    public static void write(Writer w, Model newModel) throws IOException {
        write(w, newModel, false);
```

### UtilityClassWithoutPrivateConstructor
Class `UseDependencyReducedPom` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/maven/plugins/shade/resource/UseDependencyReducedPom.java`
#### Snippet
```java
 * the dependency-reduced-pom.xml in its place in the shaded JAR.
 */
public class UseDependencyReducedPom {
    public static List<ResourceTransformer> createPomReplaceTransformers(
            MavenProject project, File dependencyReducedPomLocation) {
```

## RuleId[id=RedundantClassCall]
### RedundantClassCall
Redundant call to `cast()`
in `src/main/java/org/apache/maven/plugins/shade/DefaultShader.java`
#### Snippet
```java

            // use this to enrich relocators impl with "remapped" logic
            LazyInitRemapper.class.cast(remapper).relocators = this;
        }

```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'SimpleFilter' is still used
in `src/main/java/org/apache/maven/plugins/shade/filter/SimpleFilter.java`
#### Snippet
```java
     */
    @Deprecated
    public SimpleFilter(Set<File> jars, Set<String> includes, Set<String> excludes) {
        this(jars, includes, excludes, true);
    }
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[/]` can be simplified to '/'
in `src/main/java/org/apache/maven/plugins/shade/relocation/SimpleRelocator.java`
#### Snippet
```java
                if (exclude.startsWith(pathPattern)) {
                    sourcePathExcludes.add(
                            exclude.substring(pathPattern.length()).replaceFirst("[/][*]$", ""));
                }
            }
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`id.length() > 0` can be replaced with '!id.isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/mojo/ArtifactId.java`
#### Snippet
```java
    ArtifactId(String id) {
        String[] tokens = new String[0];
        if (id != null && id.length() > 0) {
            tokens = id.split(":", -1);
        }
```

### SizeReplaceableByIsEmpty
`groupPrefix.length() > 0` can be replaced with '!groupPrefix.isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/mojo/ArtifactSelector.java`
#### Snippet
```java
        this.excludes = toIds(excludes);

        if (groupPrefix != null && groupPrefix.length() > 0) {
            this.includes.add(new ArtifactId(groupPrefix + "*", "*", "*", "*"));
        }
```

### SizeReplaceableByIsEmpty
`extensionClassesList.size() > 0` can be replaced with '!extensionClassesList.isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/resource/GroovyResourceTransformer.java`
#### Snippet
```java
            desc.put("moduleName", extModuleName);
            desc.put("moduleVersion", extModuleVersion);
            if (extensionClassesList.size() > 0) {
                desc.put("extensionClasses", join(extensionClassesList));
            }
```

### SizeReplaceableByIsEmpty
`staticExtensionClassesList.size() > 0` can be replaced with '!staticExtensionClassesList.isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/resource/GroovyResourceTransformer.java`
#### Snippet
```java
                desc.put("extensionClasses", join(extensionClassesList));
            }
            if (staticExtensionClassesList.size() > 0) {
                desc.put("staticExtensionClasses", join(staticExtensionClassesList));
            }
```

### SizeReplaceableByIsEmpty
`extensionClasses.length() > 0` can be replaced with '!extensionClasses.isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/resource/GroovyResourceTransformer.java`
#### Snippet
```java
        }
        String extensionClasses = out.getProperty("extensionClasses", "").trim();
        if (extensionClasses.length() > 0) {
            append(extensionClasses, extensionClassesList);
        }
```

### SizeReplaceableByIsEmpty
`staticExtensionClasses.length() > 0` can be replaced with '!staticExtensionClasses.isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/resource/GroovyResourceTransformer.java`
#### Snippet
```java
        String staticExtensionClasses =
                out.getProperty("staticExtensionClasses", "").trim();
        if (staticExtensionClasses.length() > 0) {
            append(staticExtensionClasses, staticExtensionClassesList);
        }
```

### SizeReplaceableByIsEmpty
`extensionClassesList.size() > 0` can be replaced with '!extensionClassesList.isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/resource/GroovyResourceTransformer.java`
#### Snippet
```java
    @Override
    public boolean hasTransformedResource() {
        return extensionClassesList.size() > 0 && staticExtensionClassesList.size() > 0;
    }

```

### SizeReplaceableByIsEmpty
`staticExtensionClassesList.size() > 0` can be replaced with '!staticExtensionClassesList.isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/resource/GroovyResourceTransformer.java`
#### Snippet
```java
    @Override
    public boolean hasTransformedResource() {
        return extensionClassesList.size() > 0 && staticExtensionClassesList.size() > 0;
    }

```

### SizeReplaceableByIsEmpty
`className.length() > 0` can be replaced with '!className.isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/resource/PluginXmlResourceTransformer.java`
#### Snippet
```java

    private String getRelocatedClass(String className, List<Relocator> relocators) {
        if (className != null && className.length() > 0 && relocators != null) {
            for (Relocator relocator : relocators) {
                if (relocator.canRelocateClass(className)) {
```

### SizeReplaceableByIsEmpty
`className.length() > 0` can be replaced with '!className.isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/resource/ComponentsXmlResourceTransformer.java`
#### Snippet
```java

    private String getRelocatedClass(String className, List<Relocator> relocators) {
        if (className != null && className.length() > 0 && relocators != null) {
            for (Relocator relocator : relocators) {
                if (relocator.canRelocateClass(className)) {
```

### SizeReplaceableByIsEmpty
`trimedLine.length() > 0` can be replaced with '!trimedLine.isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/resource/ApacheNoticeResourceTransformer.java`
#### Snippet
```java

            if (!trimedLine.startsWith("//")) {
                if (trimedLine.length() > 0) {
                    if (trimedLine.startsWith("- ")) {
                        // resource-bundle 1.3 mode
```

### SizeReplaceableByIsEmpty
`configOrderString.length() > 0` can be replaced with '!configOrderString.isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/resource/properties/PropertiesTransformer.java`
#### Snippet
```java
        }
        final String configOrderString = p.getProperty(ordinalKey);
        if (configOrderString != null && configOrderString.length() > 0) {
            return Integer.parseInt(configOrderString);
        }
```

### SizeReplaceableByIsEmpty
`list.size() > 0` can be replaced with '!list.isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
    protected Element findAndReplaceSimpleLists(
            Counter counter, Element parent, Collection<String> list, String parentName, String childName) {
        boolean shouldExist = list != null && list.size() > 0;
        Element element = updateElement(counter, parent, parentName, shouldExist);
        if (shouldExist) {
```

### SizeReplaceableByIsEmpty
`list.size() > 0` can be replaced with '!list.isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
    protected void iterateProfile(
            Counter counter, Element parent, Collection<Profile> list, String parentTag, String childTag) {
        boolean shouldExist = list != null && list.size() > 0;
        Element element = updateElement(counter, parent, parentTag, shouldExist);
        if (shouldExist) {
```

### SizeReplaceableByIsEmpty
`list.size() > 0` can be replaced with '!list.isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
    protected void iterateDeveloper(
            Counter counter, Element parent, Collection<Developer> list, String parentTag, String childTag) {
        boolean shouldExist = list != null && list.size() > 0;
        Element element = updateElement(counter, parent, parentTag, shouldExist);
        if (shouldExist) {
```

### SizeReplaceableByIsEmpty
`list.size() > 0` can be replaced with '!list.isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
    protected void iterateReportPlugin(
            Counter counter, Element parent, Collection<ReportPlugin> list, String parentTag, String childTag) {
        boolean shouldExist = list != null && list.size() > 0;
        Element element = updateElement(counter, parent, parentTag, shouldExist);
        if (shouldExist) {
```

### SizeReplaceableByIsEmpty
`txt.getTextTrim().length() == 0` can be replaced with 'txt.getTextTrim().isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
                if (previous instanceof Text) {
                    Text txt = (Text) previous;
                    if (txt.getTextTrim().length() == 0) {
                        parent.removeContent(txt);
                    }
```

### SizeReplaceableByIsEmpty
`list.size() > 0` can be replaced with '!list.isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
    protected void iteratePluginExecution(
            Counter counter, Element parent, Collection<PluginExecution> list, String parentTag, String childTag) {
        boolean shouldExist = list != null && list.size() > 0;
        Element element = updateElement(counter, parent, parentTag, shouldExist);
        if (shouldExist) {
```

### SizeReplaceableByIsEmpty
`list.size() > 0` can be replaced with '!list.isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
    protected void iterateMailingList(
            Counter counter, Element parent, Collection<MailingList> list, String parentTag, String childTag) {
        boolean shouldExist = list != null && list.size() > 0;
        Element element = updateElement(counter, parent, parentTag, shouldExist);
        if (shouldExist) {
```

### SizeReplaceableByIsEmpty
`list.size() > 0` can be replaced with '!list.isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
    protected void iterateExtension(
            Counter counter, Element parent, Collection<Extension> list, String parentTag, String childTag) {
        boolean shouldExist = list != null && list.size() > 0;
        Element element = updateElement(counter, parent, parentTag, shouldExist);
        if (shouldExist) {
```

### SizeReplaceableByIsEmpty
`text.trim().length() > 0` can be replaced with '!text.trim().isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
            }
        }
        boolean shouldExist = text != null && text.trim().length() > 0;
        Element element = updateElement(counter, parent, name, shouldExist);
        if (shouldExist) {
```

### SizeReplaceableByIsEmpty
`list.size() > 0` can be replaced with '!list.isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
    protected void iterateResource(
            Counter counter, Element parent, Collection<Resource> list, String parentTag, String childTag) {
        boolean shouldExist = list != null && list.size() > 0;
        Element element = updateElement(counter, parent, parentTag, shouldExist);
        if (shouldExist) {
```

### SizeReplaceableByIsEmpty
`list.size() > 0` can be replaced with '!list.isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
    protected void iterateReportSet(
            Counter counter, Element parent, Collection<ReportSet> list, String parentTag, String childTag) {
        boolean shouldExist = list != null && list.size() > 0;
        Element element = updateElement(counter, parent, parentTag, shouldExist);
        if (shouldExist) {
```

### SizeReplaceableByIsEmpty
`list.size() > 0` can be replaced with '!list.isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
    protected void iterateDependency(
            Counter counter, Element parent, Collection<Dependency> list, String parentTag, String childTag) {
        boolean shouldExist = list != null && list.size() > 0;
        Element element = updateElement(counter, parent, parentTag, shouldExist);
        if (shouldExist) {
```

### SizeReplaceableByIsEmpty
`list.size() > 0` can be replaced with '!list.isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
    protected void iterateExclusion(
            Counter counter, Element parent, Collection<Exclusion> list, String parentTag, String childTag) {
        boolean shouldExist = list != null && list.size() > 0;
        Element element = updateElement(counter, parent, parentTag, shouldExist);
        if (shouldExist) {
```

### SizeReplaceableByIsEmpty
`list.size() > 0` can be replaced with '!list.isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
    protected void iterateRepository(
            Counter counter, Element parent, Collection<Repository> list, String parentTag, String childTag) {
        boolean shouldExist = list != null && list.size() > 0;
        Element element = updateElement(counter, parent, parentTag, shouldExist);
        if (shouldExist) {
```

### SizeReplaceableByIsEmpty
`list.size() > 0` can be replaced with '!list.isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
    protected void iterateNotifier(
            Counter counter, Element parent, Collection<Notifier> list, String parentTag, String childTag) {
        boolean shouldExist = list != null && list.size() > 0;
        Element element = updateElement(counter, parent, parentTag, shouldExist);
        if (shouldExist) {
```

### SizeReplaceableByIsEmpty
`list.size() > 0` can be replaced with '!list.isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
    protected void iteratePlugin(
            Counter counter, Element parent, Collection<Plugin> list, String parentTag, String childTag) {
        boolean shouldExist = list != null && list.size() > 0;
        Element element = updateElement(counter, parent, parentTag, shouldExist);
        if (shouldExist) {
```

### SizeReplaceableByIsEmpty
`list.size() > 0` can be replaced with '!list.isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
    protected void iterateLicense(
            Counter counter, Element parent, Collection<License> list, String parentTag, String childTag) {
        boolean shouldExist = list != null && list.size() > 0;
        Element element = updateElement(counter, parent, parentTag, shouldExist);
        if (shouldExist) {
```

### SizeReplaceableByIsEmpty
`lastText.getTextTrim().length() == 0` can be replaced with 'lastText.getTextTrim().isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
            }
        }
        if (lastText != null && lastText.getTextTrim().length() == 0) {
            lastText = lastText.clone();
        } else {
```

### SizeReplaceableByIsEmpty
`list.size() > 0` can be replaced with '!list.isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
    protected void iterateContributor(
            Counter counter, Element parent, Collection<Contributor> list, String parentTag, String childTag) {
        boolean shouldExist = list != null && list.size() > 0;
        Element element = updateElement(counter, parent, parentTag, shouldExist);
        if (shouldExist) {
```

### SizeReplaceableByIsEmpty
`finalName.length() > 0` can be replaced with '!finalName.isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/mojo/ShadeMojo.java`
#### Snippet
```java
                // because this will be handled implicitly later
                if (finalName != null
                        && finalName.length() > 0 //
                        && !finalName.equals(project.getBuild().getFinalName())) {
                    String finalFileName = finalName + "."
```

### SizeReplaceableByIsEmpty
`overlapping.keySet().size() > 0` can be replaced with '!overlapping.keySet().isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/DefaultShader.java`
#### Snippet
```java
            logSummaryOfDuplicates(overlapping);

            if (overlapping.keySet().size() > 0) {
                showOverlappingWarning();
            }
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `repeatScan |= scanServiceProviderConfigFile(cp, configFileReader)`
in `src/main/java/org/apache/maven/plugins/shade/filter/MinijarFilter.java`
#### Snippet
```java
                    new BufferedReader(new InputStreamReader(new FileInputStream(serviceProviderConfigFile), UTF_8))) {
                // check whether the found classes use services in turn
                repeatScan |= scanServiceProviderConfigFile(cp, configFileReader);
            } catch (final IOException e) {
                log.warn(e.getMessage());
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `repeatScan |= removeServicesFromDir(cp, neededClasses, fileName)`
in `src/main/java/org/apache/maven/plugins/shade/filter/MinijarFilter.java`
#### Snippet
```java
                for (final String fileName : project.getRuntimeClasspathElements()) {
                    if (new File(fileName).isDirectory()) {
                        repeatScan |= removeServicesFromDir(cp, neededClasses, fileName);
                    } else {
                        repeatScan |= removeServicesFromJar(cp, neededClasses, fileName);
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `repeatScan |= removeServicesFromJar(cp, neededClasses, fileName)`
in `src/main/java/org/apache/maven/plugins/shade/filter/MinijarFilter.java`
#### Snippet
```java
                        repeatScan |= removeServicesFromDir(cp, neededClasses, fileName);
                    } else {
                        repeatScan |= removeServicesFromJar(cp, neededClasses, fileName);
                    }
                }
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/shade/filter/MinijarFilter.java`
#### Snippet
```java
                    + " could not be unpacked/read for minimization; dependency is probably malformed.");
            IOException ioe = new IOException(
                    "Dependency " + dependency.toString() + " in file " + dependency.getFile()
                            + " could not be unpacked. File is probably corrupt",
                    e);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/maven/plugins/shade/filter/MinijarFilter.java`
#### Snippet
```java
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            // trap ArrayIndexOutOfBoundsExceptions caused by malformed dependency classes (MSHADE-107)
            log.warn(dependency.toString()
                    + " could not be analyzed for minimization; dependency is probably malformed.");
        }
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Relocator`
in `src/main/java/org/apache/maven/plugins/shade/resource/SisuIndexResourceTransformer.java`
#### Snippet
```java
    @Override
    public void processResource(
            final String resource, final InputStream is, final List<Relocator> relocators, long time)
            throws IOException {
        Scanner scanner = new Scanner(is, StandardCharsets.UTF_8.name());
```

### BoundedWildcard
Can generalize to `? extends ArtifactId`
in `src/main/java/org/apache/maven/plugins/shade/mojo/ArtifactSelector.java`
#### Snippet
```java
    }

    private boolean matches(Collection<ArtifactId> patterns, ArtifactId id) {
        for (ArtifactId pattern : patterns) {
            if (id.matches(pattern)) {
```

### BoundedWildcard
Can generalize to `? extends Relocator`
in `src/main/java/org/apache/maven/plugins/shade/resource/ServicesResourceTransformer.java`
#### Snippet
```java
    }

    public void processResource(String resource, InputStream is, final List<Relocator> relocators, long time)
            throws IOException {
        resource = resource.substring(SERVICES_PATH.length() + 1);
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/maven/plugins/shade/resource/GroovyResourceTransformer.java`
#### Snippet
```java
    }

    private void append(String entry, List<String> list) {
        if (entry != null) {
            Collections.addAll(list, entry.split("\\s*,\\s*"));
```

### BoundedWildcard
Can generalize to `? extends Relocator`
in `src/main/java/org/apache/maven/plugins/shade/resource/PluginXmlResourceTransformer.java`
#### Snippet
```java
    }

    private String getRelocatedClass(String className, List<Relocator> relocators) {
        if (className != null && className.length() > 0 && relocators != null) {
            for (Relocator relocator : relocators) {
```

### BoundedWildcard
Can generalize to `? extends Relocator`
in `src/main/java/org/apache/maven/plugins/shade/resource/ComponentsXmlResourceTransformer.java`
#### Snippet
```java
    }

    private String getRelocatedClass(String className, List<Relocator> relocators) {
        if (className != null && className.length() > 0 && relocators != null) {
            for (Relocator relocator : relocators) {
```

### BoundedWildcard
Can generalize to `? extends Relocator`
in `src/main/java/org/apache/maven/plugins/shade/resource/ManifestResourceTransformer.java`
#### Snippet
```java
    }

    private String relocate(String originalValue, List<Relocator> relocators) {
        String newValue = originalValue;
        for (Relocator relocator : relocators) {
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/maven/plugins/shade/filter/MinijarFilter.java`
#### Snippet
```java
    }

    private void removePackages(Set<Clazz> clazzes, Set<String> packageNames) {
        for (Clazz clazz : clazzes) {
            String name = clazz.getName();
```

### BoundedWildcard
Can generalize to `? extends SimpleFilter`
in `src/main/java/org/apache/maven/plugins/shade/filter/MinijarFilter.java`
#### Snippet
```java
    }

    private void removeSpecificallyIncludedClasses(MavenProject project, List<SimpleFilter> simpleFilters)
            throws IOException {
        // remove classes specifically included in filters
```

### BoundedWildcard
Can generalize to `? extends Properties`
in `src/main/java/org/apache/maven/plugins/shade/resource/properties/PropertiesTransformer.java`
#### Snippet
```java
    }

    private static Properties mergeProperties(final List<Properties> sortedProperties) {
        final Properties mergedProperties = new SortedProperties();
        for (final Properties p : sortedProperties) {
```

### BoundedWildcard
Can generalize to `? extends File`
in `src/main/java/org/apache/maven/plugins/shade/filter/SimpleFilter.java`
#### Snippet
```java
     */
    private SimpleFilter(
            final Set<File> jars,
            final Set<String> includes,
            final Set<String> excludes,
```

### BoundedWildcard
Can generalize to `? extends Profile`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void iterateProfile(
            Counter counter, Element parent, Collection<Profile> list, String parentTag, String childTag) {
        boolean shouldExist = list != null && list.size() > 0;
        Element element = updateElement(counter, parent, parentTag, shouldExist);
```

### BoundedWildcard
Can generalize to `? extends Developer`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void iterateDeveloper(
            Counter counter, Element parent, Collection<Developer> list, String parentTag, String childTag) {
        boolean shouldExist = list != null && list.size() > 0;
        Element element = updateElement(counter, parent, parentTag, shouldExist);
```

### BoundedWildcard
Can generalize to `? extends ReportPlugin`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void iterateReportPlugin(
            Counter counter, Element parent, Collection<ReportPlugin> list, String parentTag, String childTag) {
        boolean shouldExist = list != null && list.size() > 0;
        Element element = updateElement(counter, parent, parentTag, shouldExist);
```

### BoundedWildcard
Can generalize to `? extends PluginExecution`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void iteratePluginExecution(
            Counter counter, Element parent, Collection<PluginExecution> list, String parentTag, String childTag) {
        boolean shouldExist = list != null && list.size() > 0;
        Element element = updateElement(counter, parent, parentTag, shouldExist);
```

### BoundedWildcard
Can generalize to `? extends MailingList`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void iterateMailingList(
            Counter counter, Element parent, Collection<MailingList> list, String parentTag, String childTag) {
        boolean shouldExist = list != null && list.size() > 0;
        Element element = updateElement(counter, parent, parentTag, shouldExist);
```

### BoundedWildcard
Can generalize to `? extends Extension`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void iterateExtension(
            Counter counter, Element parent, Collection<Extension> list, String parentTag, String childTag) {
        boolean shouldExist = list != null && list.size() > 0;
        Element element = updateElement(counter, parent, parentTag, shouldExist);
```

### BoundedWildcard
Can generalize to `? extends Resource`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void iterateResource(
            Counter counter, Element parent, Collection<Resource> list, String parentTag, String childTag) {
        boolean shouldExist = list != null && list.size() > 0;
        Element element = updateElement(counter, parent, parentTag, shouldExist);
```

### BoundedWildcard
Can generalize to `? extends ReportSet`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void iterateReportSet(
            Counter counter, Element parent, Collection<ReportSet> list, String parentTag, String childTag) {
        boolean shouldExist = list != null && list.size() > 0;
        Element element = updateElement(counter, parent, parentTag, shouldExist);
```

### BoundedWildcard
Can generalize to `? extends Dependency`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void iterateDependency(
            Counter counter, Element parent, Collection<Dependency> list, String parentTag, String childTag) {
        boolean shouldExist = list != null && list.size() > 0;
        Element element = updateElement(counter, parent, parentTag, shouldExist);
```

### BoundedWildcard
Can generalize to `? extends Exclusion`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void iterateExclusion(
            Counter counter, Element parent, Collection<Exclusion> list, String parentTag, String childTag) {
        boolean shouldExist = list != null && list.size() > 0;
        Element element = updateElement(counter, parent, parentTag, shouldExist);
```

### BoundedWildcard
Can generalize to `? extends Repository`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void iterateRepository(
            Counter counter, Element parent, Collection<Repository> list, String parentTag, String childTag) {
        boolean shouldExist = list != null && list.size() > 0;
        Element element = updateElement(counter, parent, parentTag, shouldExist);
```

### BoundedWildcard
Can generalize to `? extends Notifier`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void iterateNotifier(
            Counter counter, Element parent, Collection<Notifier> list, String parentTag, String childTag) {
        boolean shouldExist = list != null && list.size() > 0;
        Element element = updateElement(counter, parent, parentTag, shouldExist);
```

### BoundedWildcard
Can generalize to `? extends Plugin`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void iteratePlugin(
            Counter counter, Element parent, Collection<Plugin> list, String parentTag, String childTag) {
        boolean shouldExist = list != null && list.size() > 0;
        Element element = updateElement(counter, parent, parentTag, shouldExist);
```

### BoundedWildcard
Can generalize to `? extends License`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void iterateLicense(
            Counter counter, Element parent, Collection<License> list, String parentTag, String childTag) {
        boolean shouldExist = list != null && list.size() > 0;
        Element element = updateElement(counter, parent, parentTag, shouldExist);
```

### BoundedWildcard
Can generalize to `? extends Contributor`
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void iterateContributor(
            Counter counter, Element parent, Collection<Contributor> list, String parentTag, String childTag) {
        boolean shouldExist = list != null && list.size() > 0;
        Element element = updateElement(counter, parent, parentTag, shouldExist);
```

### BoundedWildcard
Can generalize to `? super Dependency`
in `src/main/java/org/apache/maven/plugins/shade/mojo/ShadeMojo.java`
#### Snippet
```java

    private void addSystemScopedDependencyFromNonInterpolatedPom(
            List<Dependency> dependencies, List<Dependency> originalDependencies) {
        for (Dependency dependency : originalDependencies) {
            if (dependency.getScope() != null && dependency.getScope().equalsIgnoreCase("system")) {
```

### BoundedWildcard
Can generalize to `? extends Dependency`
in `src/main/java/org/apache/maven/plugins/shade/mojo/ShadeMojo.java`
#### Snippet
```java

    private void addSystemScopedDependencyFromNonInterpolatedPom(
            List<Dependency> dependencies, List<Dependency> originalDependencies) {
        for (Dependency dependency : originalDependencies) {
            if (dependency.getScope() != null && dependency.getScope().equalsIgnoreCase("system")) {
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/maven/plugins/shade/mojo/ShadeMojo.java`
#### Snippet
```java
    }

    private void removeSystemScopedDependencies(Set<String> artifactsToRemove, List<Dependency> originalDependencies) {
        for (Dependency dependency : originalDependencies) {
            if (dependency.getScope() != null && dependency.getScope().equalsIgnoreCase("system")) {
```

### BoundedWildcard
Can generalize to `? extends Dependency`
in `src/main/java/org/apache/maven/plugins/shade/mojo/ShadeMojo.java`
#### Snippet
```java
    }

    private void removeSystemScopedDependencies(Set<String> artifactsToRemove, List<Dependency> originalDependencies) {
        for (Dependency dependency : originalDependencies) {
            if (dependency.getScope() != null && dependency.getScope().equalsIgnoreCase("system")) {
```

### BoundedWildcard
Can generalize to `? super File`
in `src/main/java/org/apache/maven/plugins/shade/mojo/ShadeMojo.java`
#### Snippet
```java

    private void processArtifactSelectors(
            Set<File> artifacts,
            Set<String> artifactIds,
            Set<File> sourceArtifacts,
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/maven/plugins/shade/mojo/ShadeMojo.java`
#### Snippet
```java
    private void processArtifactSelectors(
            Set<File> artifacts,
            Set<String> artifactIds,
            Set<File> sourceArtifacts,
            Set<File> testArtifacts,
```

### BoundedWildcard
Can generalize to `? super File`
in `src/main/java/org/apache/maven/plugins/shade/mojo/ShadeMojo.java`
#### Snippet
```java
            Set<File> artifacts,
            Set<String> artifactIds,
            Set<File> sourceArtifacts,
            Set<File> testArtifacts,
            Set<File> testSourceArtifacts,
```

### BoundedWildcard
Can generalize to `? super File`
in `src/main/java/org/apache/maven/plugins/shade/mojo/ShadeMojo.java`
#### Snippet
```java
            Set<String> artifactIds,
            Set<File> sourceArtifacts,
            Set<File> testArtifacts,
            Set<File> testSourceArtifacts,
            ArtifactSelector artifactSelector) {
```

### BoundedWildcard
Can generalize to `? super File`
in `src/main/java/org/apache/maven/plugins/shade/mojo/ShadeMojo.java`
#### Snippet
```java
            Set<File> sourceArtifacts,
            Set<File> testArtifacts,
            Set<File> testSourceArtifacts,
            ArtifactSelector artifactSelector) {

```

### BoundedWildcard
Can generalize to `? extends Dependency`
in `src/main/java/org/apache/maven/plugins/shade/mojo/ShadeMojo.java`
#### Snippet
```java

    public boolean updateExcludesInDeps(
            MavenProject project, List<Dependency> dependencies, List<Dependency> transitiveDeps)
            throws DependencyGraphBuilderException {
        MavenProject original = session.getProjectBuildingRequest().getProject();
```

### BoundedWildcard
Can generalize to `? extends Dependency`
in `src/main/java/org/apache/maven/plugins/shade/mojo/ShadeMojo.java`
#### Snippet
```java

    public boolean updateExcludesInDeps(
            MavenProject project, List<Dependency> dependencies, List<Dependency> transitiveDeps)
            throws DependencyGraphBuilderException {
        MavenProject original = session.getProjectBuildingRequest().getProject();
```

### BoundedWildcard
Can generalize to `? extends ResourceTransformer`
in `src/main/java/org/apache/maven/plugins/shade/mojo/ShadeMojo.java`
#### Snippet
```java

    private List<ResourceTransformer> toResourceTransformers(
            String shade, List<ResourceTransformer> resourceTransformers) {
        List<ResourceTransformer> forShade = new ArrayList<>();
        ManifestResourceTransformer lastMt = null;
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/maven/plugins/shade/DefaultShader.java`
#### Snippet
```java

    private void addJavaSource(
            Set<String> resources,
            JarOutputStream jos,
            String name,
```

### BoundedWildcard
Can generalize to `? extends Relocator`
in `src/main/java/org/apache/maven/plugins/shade/DefaultShader.java`
#### Snippet
```java
            long time,
            InputStream is,
            List<Relocator> relocators)
            throws IOException {
        JarEntry entry = new JarEntry(name);
```

### BoundedWildcard
Can generalize to `? extends Relocator`
in `src/main/java/org/apache/maven/plugins/shade/DefaultShader.java`
#### Snippet
```java
        private final List<Relocator> relocators;

        private DefaultPackageMapper(final List<Relocator> relocators) {
            this.relocators = relocators;
        }
```

### BoundedWildcard
Can generalize to `? extends Filter`
in `src/main/java/org/apache/maven/plugins/shade/DefaultShader.java`
#### Snippet
```java
    }

    private boolean isFiltered(List<Filter> filters, String name) {
        for (Filter filter : filters) {
            if (filter.isFiltered(name)) {
```

### BoundedWildcard
Can generalize to `? extends ResourceTransformer`
in `src/main/java/org/apache/maven/plugins/shade/DefaultShader.java`
#### Snippet
```java

    private boolean resourceTransformed(
            List<ResourceTransformer> resourceTransformers,
            String name,
            InputStream is,
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/maven/plugins/shade/DefaultShader.java`
#### Snippet
```java
    }

    private void addDirectory(Set<String> resources, JarOutputStream jos, String name, long time) throws IOException {
        if (name.lastIndexOf('/') > 0) {
            String parent = name.substring(0, name.lastIndexOf('/'));
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/maven/plugins/shade/DefaultShader.java`
#### Snippet
```java
    private void goThroughAllJarEntriesForManifestTransformer(
            ShadeRequest shadeRequest,
            Set<String> resources,
            ManifestResourceTransformer manifestTransformer,
            JarOutputStream jos)
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/maven/plugins/shade/DefaultShader.java`
#### Snippet
```java
            DefaultPackageMapper packageMapper,
            JarOutputStream jos,
            MultiValuedMap<String, File> duplicates,
            File jar,
            Callable<InputStream> inputProvider,
```

### BoundedWildcard
Can generalize to `? super File`
in `src/main/java/org/apache/maven/plugins/shade/DefaultShader.java`
#### Snippet
```java
            DefaultPackageMapper packageMapper,
            JarOutputStream jos,
            MultiValuedMap<String, File> duplicates,
            File jar,
            Callable<InputStream> inputProvider,
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/maven/plugins/shade/DefaultShader.java`
#### Snippet
```java

    private void addResource(
            Set<String> resources, JarOutputStream jos, String name, Callable<InputStream> input, long time, int method)
            throws Exception {
        ZipHeaderPeekInputStream inputStream = new ZipHeaderPeekInputStream(input.call());
```

### BoundedWildcard
Can generalize to `? extends InputStream`
in `src/main/java/org/apache/maven/plugins/shade/DefaultShader.java`
#### Snippet
```java

    private void addResource(
            Set<String> resources, JarOutputStream jos, String name, Callable<InputStream> input, long time, int method)
            throws Exception {
        ZipHeaderPeekInputStream inputStream = new ZipHeaderPeekInputStream(input.call());
```

### BoundedWildcard
Can generalize to `? extends Filter`
in `src/main/java/org/apache/maven/plugins/shade/DefaultShader.java`
#### Snippet
```java
    }

    private List<Filter> getFilters(File jar, List<Filter> filters) {
        List<Filter> list = new ArrayList<>();

```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/org/apache/maven/plugins/shade/mojo/RelativizePath.java`
#### Snippet
```java
        List<String> results = new ArrayList<>();
        for (File p = of.getParentFile(); p != null; p = p.getParentFile()) {
            if (!"".equals(p.getName())) {
                results.add(p.getName());
            }
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/maven/plugins/shade/mojo/ShadeMojo.java`
#### Snippet
```java
    @SuppressWarnings("MismatchedReadAndWriteOfArray")
    @Parameter
    private PackageRelocation[] relocations;

    /**
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/maven/plugins/shade/mojo/ShadeMojo.java`
#### Snippet
```java
    @SuppressWarnings("MismatchedReadAndWriteOfArray")
    @Parameter
    private ArchiveFilter[] filters;

    /**
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/org/apache/maven/plugins/shade/resource/PluginXmlResourceTransformer.java`
#### Snippet
```java
        String attr = dom.getAttribute(attribute);

        if (attr == null || value == null || value.length() <= 0) {
            return;
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/org/apache/maven/plugins/shade/resource/PluginXmlResourceTransformer.java`
#### Snippet
```java
        Xpp3Dom child = dom.getChild(element);

        if (child == null || value == null || value.length() <= 0) {
            return;
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/org/apache/maven/plugins/shade/resource/ComponentsXmlResourceTransformer.java`
#### Snippet
```java
        Xpp3Dom child = dom.getChild(element);

        if (child == null || value == null || value.length() <= 0) {
            return;
        }
```

## RuleId[id=MissingDeprecatedAnnotation]
### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `src/main/java/org/apache/maven/plugins/shade/resource/ResourceTransformer.java`
#### Snippet
```java
     * @deprecated prefer ReproducibleResourceTransformer
     */
    void processResource(String resource, InputStream is, List<Relocator> relocators) throws IOException;

    boolean hasTransformedResource();
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     * @throws IOException in case of an error.
     */
    public void write(Model project, Document document, OutputStream stream) throws IOException {
        updateModel(project, "project", new Counter(0), document.getRootElement());
        XMLOutputter outputter = new XMLOutputter();
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/maven/plugins/shade/resource/properties/SortedProperties.java`
#### Snippet
```java
            {
        final List<String> keys = new LinkedList<>();
        for (Object k : super.keySet()) {
            keys.add((String) k);
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/maven/plugins/shade/DefaultShader.java`
#### Snippet
```java
        public boolean hasZipHeader() throws IOException {
            final byte[] header = new byte[HEADER_LEN];
            int len = super.read(header, 0, HEADER_LEN);
            if (len != -1) {
                super.unread(header, 0, len);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/maven/plugins/shade/DefaultShader.java`
#### Snippet
```java
            int len = super.read(header, 0, HEADER_LEN);
            if (len != -1) {
                super.unread(header, 0, len);
            }
            return Arrays.equals(header, ZIP_HEADER);
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/maven/plugins/shade/resource/GroovyResourceTransformer.java`
#### Snippet
```java
    private void append(String entry, List<String> list) {
        if (entry != null) {
            Collections.addAll(list, entry.split("\\s*,\\s*"));
        }
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/maven/plugins/shade/filter/MinijarFilter.java`
#### Snippet
```java
    @Override
    public boolean isFiltered(String classFile) {
        String className = classFile.replace('/', '.').replaceFirst("\\.class$", "");
        Clazz clazz = new Clazz(className);

```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/maven/plugins/shade/relocation/SimpleRelocator.java`
#### Snippet
```java
                if (exclude.startsWith(pattern)) {
                    sourcePackageExcludes.add(
                            exclude.substring(pattern.length()).replaceFirst("[.][*]$", ""));
                }
                // Excludes should be subpackages of the global pattern
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/maven/plugins/shade/relocation/SimpleRelocator.java`
#### Snippet
```java
                if (exclude.startsWith(pathPattern)) {
                    sourcePathExcludes.add(
                            exclude.substring(pathPattern.length()).replaceFirst("[/][*]$", ""));
                }
            }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/maven/plugins/shade/relocation/SimpleRelocator.java`
#### Snippet
```java
        boolean isFirstSnippet = true;
        // Make sure that search pattern starts at word boundary and we look for literal ".", not regex jokers
        String[] snippets = sourceContent.split("\\b" + patternFrom.replace(".", "[.]") + "\\b");
        for (int i = 0, snippetsLength = snippets.length; i < snippetsLength; i++) {
            String snippet = snippets[i];
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/maven/plugins/shade/relocation/SimpleRelocator.java`
#### Snippet
```java
                isFirstSnippet = false;
            } else {
                String previousSnippetOneLine = previousSnippet.replaceAll("\\s+", " ");
                boolean afterDotSlashSpace = RX_ENDS_WITH_DOT_SLASH_SPACE
                        .matcher(previousSnippetOneLine)
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/maven/plugins/shade/DefaultShader.java`
#### Snippet
```java
            for (String name : overlapping.get(jarz)) {
                if (name.endsWith(".class")) {
                    classes.add(name.replace(".class", "").replace("/", "."));
                } else {
                    resources.add(name);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/maven/plugins/shade/DefaultShader.java`
#### Snippet
```java
            for (String name : overlapping.get(jarz)) {
                if (name.endsWith(".class")) {
                    classes.add(name.replace(".class", "").replace("/", "."));
                } else {
                    resources.add(name);
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/maven/plugins/shade/DefaultShader.java`
#### Snippet
```java
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                this.crc.update(buffer, 0, bytesRead);
                this.size += bytesRead;
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`currentIndex = currentIndex + 1` could be simplified to 'currentIndex += 1'
in `src/main/java/org/apache/maven/plugins/shade/pom/Counter.java`
#### Snippet
```java
     */
    public void increaseCount() {
        currentIndex = currentIndex + 1;
    } // -- void increaseCount()
}
```

### ReplaceAssignmentWithOperatorAssignment
`offset = offset + 1` could be simplified to 'offset += 1'
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
        while (it.hasNext() && elementCounter <= counter.getCurrentIndex()) {
            Object next = it.next();
            offset = offset + 1;
            if (next instanceof Element) {
                elementCounter = elementCounter + 1;
```

### ReplaceAssignmentWithOperatorAssignment
`elementCounter = elementCounter + 1` could be simplified to 'elementCounter += 1'
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
            offset = offset + 1;
            if (next instanceof Element) {
                elementCounter = elementCounter + 1;
                contentIndex = contentIndex + offset;
                offset = 0;
```

### ReplaceAssignmentWithOperatorAssignment
`contentIndex = contentIndex + offset` could be simplified to 'contentIndex += offset'
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
            if (next instanceof Element) {
                elementCounter = elementCounter + 1;
                contentIndex = contentIndex + offset;
                offset = 0;
            }
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `shaders` are queried, but never updated
in `src/main/java/org/apache/maven/plugins/shade/mojo/ShadeMojo.java`
#### Snippet
```java
     */
    @Inject
    private Map<String, Shader> shaders;

    /**
```

## RuleId[id=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `src/main/java/org/apache/maven/plugins/shade/resource/ApacheNoticeResourceTransformer.java`
#### Snippet
```java
                                && sb.toString().contains("This product includes/uses software(s) developed by")) {
                            currentOrg = organizationEntries.get(sb.toString().trim());
                            if (currentOrg == null) {
                                currentOrg = new TreeSet<>();
                                organizationEntries.put(sb.toString().trim(), currentOrg);
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Comparator\>() can be replaced with lambda
in `src/main/java/org/apache/maven/plugins/shade/resource/properties/SortedProperties.java`
#### Snippet
```java
    public Set<Map.Entry<Object, Object>> entrySet() {
        final List<Map.Entry<Object, Object>> entries = new ArrayList<>(super.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<Object, Object>>() {
            @Override
            public int compare(Map.Entry<Object, Object> o1, Map.Entry<Object, Object> o2) {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/main/java/org/apache/maven/plugins/shade/DefaultShader.java`
#### Snippet
```java
                            duplicates,
                            jar,
                            new Callable<InputStream>() {
                                @Override
                                public InputStream call() throws Exception {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `src/main/java/org/apache/maven/plugins/shade/DefaultShader.java`
#### Snippet
```java
                        duplicates,
                        jar,
                        new Callable<InputStream>() {
                            @Override
                            public InputStream call() throws Exception {
```

## RuleId[id=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `src/main/java/org/apache/maven/plugins/shade/resource/GroovyResourceTransformer.java`
#### Snippet
```java

            Properties desc = new Properties();
            desc.put("moduleName", extModuleName);
            desc.put("moduleVersion", extModuleVersion);
            if (extensionClassesList.size() > 0) {
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `src/main/java/org/apache/maven/plugins/shade/resource/GroovyResourceTransformer.java`
#### Snippet
```java
            Properties desc = new Properties();
            desc.put("moduleName", extModuleName);
            desc.put("moduleVersion", extModuleVersion);
            if (extensionClassesList.size() > 0) {
                desc.put("extensionClasses", join(extensionClassesList));
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `src/main/java/org/apache/maven/plugins/shade/resource/GroovyResourceTransformer.java`
#### Snippet
```java
            desc.put("moduleVersion", extModuleVersion);
            if (extensionClassesList.size() > 0) {
                desc.put("extensionClasses", join(extensionClassesList));
            }
            if (staticExtensionClassesList.size() > 0) {
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `src/main/java/org/apache/maven/plugins/shade/resource/GroovyResourceTransformer.java`
#### Snippet
```java
            }
            if (staticExtensionClassesList.size() > 0) {
                desc.put("staticExtensionClasses", join(staticExtensionClassesList));
            }
            desc.store(os, null);
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/Counter.java`
#### Snippet
```java
     * Field currentIndex
     */
    private int currentIndex = 0;

    /**
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `resource`
in `src/main/java/org/apache/maven/plugins/shade/resource/ServicesResourceTransformer.java`
#### Snippet
```java
    public void processResource(String resource, InputStream is, final List<Relocator> relocators, long time)
            throws IOException {
        resource = resource.substring(SERVICES_PATH.length() + 1);
        for (Relocator relocator : relocators) {
            if (relocator.canRelocateClass(resource)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `resource`
in `src/main/java/org/apache/maven/plugins/shade/resource/ServicesResourceTransformer.java`
#### Snippet
```java
        for (Relocator relocator : relocators) {
            if (relocator.canRelocateClass(resource)) {
                resource = relocator.relocateClass(resource);
                break;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `resource`
in `src/main/java/org/apache/maven/plugins/shade/resource/ServicesResourceTransformer.java`
#### Snippet
```java
            }
        }
        resource = SERVICES_PATH + '/' + resource;

        Set<String> out = serviceEntries.computeIfAbsent(resource, k -> new LinkedHashSet<>());
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `src/main/java/org/apache/maven/plugins/shade/relocation/SimpleRelocator.java`
#### Snippet
```java

        if (path.endsWith(".class")) {
            path = path.substring(0, path.length() - 6);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `src/main/java/org/apache/maven/plugins/shade/relocation/SimpleRelocator.java`
#### Snippet
```java
        // getClass().getResource("/a/b/c.properties").
        if (!path.isEmpty() && path.charAt(0) == '/') {
            path = path.substring(1);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `sourceContent`
in `src/main/java/org/apache/maven/plugins/shade/relocation/SimpleRelocator.java`
#### Snippet
```java
            return sourceContent;
        }
        sourceContent = shadeSourceWithExcludes(sourceContent, pattern, shadedPattern, sourcePackageExcludes);
        return shadeSourceWithExcludes(sourceContent, pathPattern, shadedPathPattern, sourcePathExcludes);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `modified`
in `src/main/java/org/apache/maven/plugins/shade/mojo/ShadeMojo.java`
#### Snippet
```java

                getLog().debug("updateExcludesInDeps()");
                modified = updateExcludesInDeps(result.getProject(), dependencies, transitiveDeps);
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `entityName`
in `src/main/java/org/apache/maven/plugins/shade/DefaultShader.java`
#### Snippet
```java
                prefix = m.group(1) + "L";
                suffix = ";";
                entityName = m.group(2);
            }

```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-27-22-40-40.584.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/shade/mojo/RelativizePath.java`
#### Snippet
```java
            return relativePath.toString();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/shade/filter/SimpleFilter.java`
#### Snippet
```java

    private String normalizePath(String path) {
        return (path != null) ? path.replace(File.separatorChar == '/' ? '\\' : '/', File.separatorChar) : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/shade/mojo/ShadeMojo.java`
#### Snippet
```java
        } catch (ArtifactResolutionException e) {
            getLog().warn("Could not get " + classifier + " for " + artifact);
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/maven/plugins/shade/mojo/ShadeMojo.java`
#### Snippet
```java
            return resolvedArtifact.getFile();
        }
        return null;
    }

```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `ioe` is redundant
in `src/main/java/org/apache/maven/plugins/shade/filter/MinijarFilter.java`
#### Snippet
```java
            log.warn(dependency.getFile()
                    + " could not be unpacked/read for minimization; dependency is probably malformed.");
            IOException ioe = new IOException(
                    "Dependency " + dependency.toString() + " in file " + dependency.getFile()
                            + " could not be unpacked. File is probably corrupt",
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void updateReportPlugin(ReportPlugin value, String xmlTag, Counter counter, Element element) {
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        findAndReplaceSimpleElement(innerCount, root, "groupId", value.getGroupId(), "org.apache.maven.plugins");
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void updateDeveloper(Developer value, String xmlTag, Counter counter, Element element) {
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        findAndReplaceSimpleElement(innerCount, root, "id", value.getId(), null);
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void updateRepository(Repository value, String xmlTag, Counter counter, Element element) {
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        updateRepositoryPolicy(value.getReleases(), "releases", innerCount, root);
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void updateExtension(Extension value, String xmlTag, Counter counter, Element element) {
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        findAndReplaceSimpleElement(innerCount, root, "groupId", value.getGroupId(), null);
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void updateResource(Resource value, String xmlTag, Counter counter, Element element) {
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        findAndReplaceSimpleElement(innerCount, root, "targetPath", value.getTargetPath(), null);
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void updateExclusion(Exclusion value, String xmlTag, Counter counter, Element element) {
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        findAndReplaceSimpleElement(innerCount, root, "artifactId", value.getArtifactId(), null);
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void updateLicense(License value, String xmlTag, Counter counter, Element element) {
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        findAndReplaceSimpleElement(innerCount, root, "name", value.getName(), null);
```

### UnnecessaryLocalVariable
Local variable `properties` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected Element findAndReplaceProperties(Counter counter, Element parent, String name, Map props) {
        Map<String, String> properties = props;
        boolean shouldExist = properties != null && !properties.isEmpty();
        Element element = updateElement(counter, parent, name, shouldExist);
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void updatePlugin(Plugin value, String xmlTag, Counter counter, Element element) {
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        findAndReplaceSimpleElement(innerCount, root, "groupId", value.getGroupId(), "org.apache.maven.plugins");
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void updateContributor(Contributor value, String xmlTag, Counter counter, Element element) {
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        findAndReplaceSimpleElement(innerCount, root, "name", value.getName(), null);
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void updateProfile(Profile value, String xmlTag, Counter counter, Element element) {
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        findAndReplaceSimpleElement(innerCount, root, "id", value.getId(), "default");
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void updateModel(Model value, String xmlTag, Counter counter, Element element) {
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        updateParent(value.getParent(), "parent", innerCount, root);
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void updatePluginExecution(PluginExecution value, String xmlTag, Counter counter, Element element) {
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        findAndReplaceSimpleElement(innerCount, root, "id", value.getId(), "default");
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
    // CHECKSTYLE_OFF: LineLength
    protected void updateNotifier(Notifier value, String xmlTag, Counter counter, Element element) {
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        findAndReplaceSimpleElement(innerCount, root, "type", value.getType(), "mail");
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void updateMailingList(MailingList value, String xmlTag, Counter counter, Element element) {
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        findAndReplaceSimpleElement(innerCount, root, "name", value.getName(), null);
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void updateReportSet(ReportSet value, String xmlTag, Counter counter, Element element) {
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        findAndReplaceSimpleElement(innerCount, root, "id", value.getId(), "default");
```

### UnnecessaryLocalVariable
Local variable `root` is redundant
in `src/main/java/org/apache/maven/plugins/shade/pom/MavenJDOMWriter.java`
#### Snippet
```java
     */
    protected void updateDependency(Dependency value, String xmlTag, Counter counter, Element element) {
        Element root = element;
        Counter innerCount = new Counter(counter.getDepth() + 1);
        findAndReplaceSimpleElement(innerCount, root, "groupId", value.getGroupId(), null);
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/maven/plugins/shade/mojo/ArtifactId.java`
#### Snippet
```java

    ArtifactId(String id) {
        String[] tokens = new String[0];
        if (id != null && id.length() > 0) {
            tokens = id.split(":", -1);
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `excludeDefaults` initializer `true` is redundant
in `src/main/java/org/apache/maven/plugins/shade/filter/SimpleFilter.java`
#### Snippet
```java
    private Set<String> excludes;

    private boolean excludeDefaults = true;

    /**
```

