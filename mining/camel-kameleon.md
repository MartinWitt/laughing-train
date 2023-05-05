# camel-kameleon 
 
# Bad smells
I found 17 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| OptionalGetWithoutIsPresent | 5 | false |
| ComparatorResultComparison | 4 | false |
| DuplicatedCode | 1 | false |
| AutoCloseableResource | 1 | false |
| Deprecation | 1 | false |
| DataFlowIssue | 1 | false |
| UNUSED_IMPORT | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| RedundantCast | 1 | false |
| FieldCanBeLocal | 1 | false |
## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/camel/kameleon/component/QuarkusComponentService.java`
#### Snippet
```java
        List<CamelComponent> list = new ArrayList<>();

        catalog.findComponentNames().forEach(name -> {
            String json = catalog.componentJSonSchema(name);
            CamelComponent component = getCamelComponent(json, "component");
            if (!component.getDeprecated()) {
                list.add(component);
            }
        });

        catalog.findDataFormatNames().forEach(name -> {
            String json = catalog.dataFormatJSonSchema(name);
            CamelComponent component = getCamelComponent(json, "dataformat");
            if (!component.getDeprecated()) {
                list.add(component);
            }
        });

        catalog.findLanguageNames().forEach(name -> {
            String json = catalog.languageJSonSchema(name);
            CamelComponent component = getCamelComponent(json, "language");
            if (!component.getDeprecated()) {
                list.add(component);
            }
        });

        catalog.findOtherNames().forEach(name -> {
            String json = catalog.otherJSonSchema(name);
            CamelComponent component = getCamelComponent(json, "other");
            if (!component.getDeprecated()) {
                list.add(component);
            }
        });

        return new JsonArray(list);
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `src/main/java/org/apache/camel/kameleon/generator/ProjectGeneratorService.java`
#### Snippet
```java
        try (ZipArchiveOutputStream archive = new ZipArchiveOutputStream(new FileOutputStream(filename))) {
            File folderToZip = new File(folder);
            Files.walk(folderToZip.toPath()).forEach(p -> {
                File file = p.toFile();
                if (!file.isDirectory()) {
```

## RuleId[id=Deprecation]
### Deprecation
'SafeConstructor()' is deprecated
in `src/main/java/org/apache/camel/kameleon/generator/RestDslGeneratorService.java`
#### Snippet
```java
    private JsonNode readNodeFromYaml(String openapi) throws FileNotFoundException {
        final ObjectMapper mapper = new ObjectMapper();
        Yaml loader = new Yaml(new SafeConstructor());
        Map map = loader.load(openapi);
        return mapper.convertValue(map, JsonNode.class);
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `inputStream` might be null
in `src/main/java/org/apache/camel/kameleon/config/ConfigurationResource.java`
#### Snippet
```java
        if (kc == null) {
            try (InputStream inputStream = getClass().getResourceAsStream("/kameleon.json");
                 BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                configuration = reader.lines().collect(Collectors.joining(System.lineSeparator()));
                ObjectMapper objectMapper = new ObjectMapper();
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import org.apache.camel.catalog.quarkus.QuarkusRuntimeProvider;`
in `src/main/java/org/apache/camel/kameleon/component/SpringBootComponentService.java`
#### Snippet
```java
import org.apache.camel.catalog.CamelCatalog;
import org.apache.camel.catalog.DefaultCamelCatalog;
import org.apache.camel.catalog.quarkus.QuarkusRuntimeProvider;
import org.apache.camel.kameleon.model.CamelComponent;
import org.apache.camel.springboot.catalog.SpringBootRuntimeProvider;
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with '.values().stream()'
in `src/main/java/org/apache/camel/kameleon/component/KameletComponentService.java`
#### Snippet
```java
        KameletsCatalog catalog = new KameletsCatalog();
        List<KameletComponent> list = catalog.getKamelets().entrySet().stream()
                .map(e -> new KameletComponent(
                        e.getValue().getMetadata().getName(),
                        e.getValue().getSpec().getDefinition().getTitle(),
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `nf` to `Object` is redundant
in `src/main/java/org/apache/camel/kameleon/generator/GeneratorResource.java`
#### Snippet
```java
        File nf = new File(fileName);
        if (nf.exists()){
            return  Response.ok((Object) nf)
                    .type("application/zip")
                    .header("Content-Disposition", "attachment; filename=" + nf.getName())
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/org/apache/camel/kameleon/generator/ProjectGeneratorService.java`
#### Snippet
```java
            }
        } else {
            CamelType camelType = configurationResource.getKc().getTypes().stream().filter(t -> t.getName().equals("quarkus")).findFirst().get();
            String quarkusVersion = camelType.getVersions().stream().filter(cv -> cv.getName().equals(archetypeVersion)).findFirst().get().getRuntimeVersion();
            generateQuarkusArchetype(temp, quarkusVersion, groupId, artifactId, version, components);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/org/apache/camel/kameleon/generator/ProjectGeneratorService.java`
#### Snippet
```java
        } else {
            CamelType camelType = configurationResource.getKc().getTypes().stream().filter(t -> t.getName().equals("quarkus")).findFirst().get();
            String quarkusVersion = camelType.getVersions().stream().filter(cv -> cv.getName().equals(archetypeVersion)).findFirst().get().getRuntimeVersion();
            generateQuarkusArchetype(temp, quarkusVersion, groupId, artifactId, version, components);
            String folderName = temp.getAbsolutePath() + "/code-with-quarkus";
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/org/apache/camel/kameleon/generator/ProjectGeneratorService.java`
#### Snippet
```java
                                          String groupId, String artifactId, String version)
            throws MavenInvocationException, IOException {
        CamelType camelType = configurationResource.getKc().getTypes().stream().filter(ct -> ct.getName().equals(type)).findFirst().get();
        CamelVersion camelVersion = camelType.getVersions().stream().filter(cv -> cv.getName().equals(archetypeVersion)).findFirst().get();

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/org/apache/camel/kameleon/generator/ProjectGeneratorService.java`
#### Snippet
```java
            throws MavenInvocationException, IOException {
        CamelType camelType = configurationResource.getKc().getTypes().stream().filter(ct -> ct.getName().equals(type)).findFirst().get();
        CamelVersion camelVersion = camelType.getVersions().stream().filter(cv -> cv.getName().equals(archetypeVersion)).findFirst().get();

        Properties properties = new Properties();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/org/apache/camel/kameleon/generator/ProjectGeneratorService.java`
#### Snippet
```java
        Model model = reader.read(new FileReader(pom));
        List<Plugin> plugins = model.getBuild().getPlugins();
        Plugin mavenCompiler = plugins.stream().filter(p -> p.getArtifactId().equals("maven-compiler-plugin")).findFirst().get();
        Xpp3Dom config = (Xpp3Dom) mavenCompiler.getConfiguration();
        if (config.getChild("source") == null) config.addChild(new Xpp3Dom("source"));
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/camel/kameleon/config/ConfigurationResource.java`
#### Snippet
```java
    String version;

    private String configuration;
    private KameleonConfiguration kc;

```

## RuleId[id=ComparatorResultComparison]
### ComparatorResultComparison
Comparison of compare method result with specific constant
in `src/main/java/org/apache/camel/kameleon/component/ClassicComponentService.java`
#### Snippet
```java
            String json = catalog.componentJSonSchema(name);
            CamelComponent component = getCamelComponent(json, "component");
            if (!component.getDeprecated() && new ComparableVersion(component.getFirstVersion()).compareTo(camelVersion) != 1) {
                list.add(component);
            }
```

### ComparatorResultComparison
Comparison of compare method result with specific constant
in `src/main/java/org/apache/camel/kameleon/component/ClassicComponentService.java`
#### Snippet
```java
            String json = catalog.dataFormatJSonSchema(name);
            CamelComponent component = getCamelComponent(json, "dataformat");
            if (!component.getDeprecated() && new ComparableVersion(component.getFirstVersion()).compareTo(camelVersion) != 1) {
                list.add(component);
            }
```

### ComparatorResultComparison
Comparison of compare method result with specific constant
in `src/main/java/org/apache/camel/kameleon/component/ClassicComponentService.java`
#### Snippet
```java
            String json = catalog.languageJSonSchema(name);
            CamelComponent component = getCamelComponent(json, "language");
            if (!component.getDeprecated() && new ComparableVersion(component.getFirstVersion()).compareTo(camelVersion) != 1) {
                list.add(component);
            }
```

### ComparatorResultComparison
Comparison of compare method result with specific constant
in `src/main/java/org/apache/camel/kameleon/component/ClassicComponentService.java`
#### Snippet
```java
            String json = catalog.otherJSonSchema(name);
            CamelComponent component = getCamelComponent(json, "other");
            if (!component.getDeprecated() && new ComparableVersion(component.getFirstVersion()).compareTo(camelVersion) != 1) {
                list.add(component);
            }
```

