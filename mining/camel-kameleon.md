# camel-kameleon 
 
# Bad smells
I found 24 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=OptionalGetWithoutIsPresent] | 5 | false |
| RuleId[ruleID=ComparatorResultComparison] | 4 | false |
| RuleId[ruleID=ThrowablePrintStackTrace] | 3 | false |
| RuleId[ruleID=SystemOutErr] | 2 | false |
| RuleId[ruleID=NonProtectedConstructorInAbstractClass] | 2 | true |
| RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern] | 1 | false |
| RuleId[ruleID=DataFlowIssue] | 1 | false |
| RuleId[ruleID=UNUSED_IMPORT] | 1 | false |
| RuleId[ruleID=SimplifyStreamApiCallChains] | 1 | false |
| RuleId[ruleID=SamePackageImport] | 1 | false |
| RuleId[ruleID=Convert2MethodRef] | 1 | false |
| RuleId[ruleID=HtmlWrongAttributeValue] | 1 | false |
| RuleId[ruleID=InnerClassMayBeStatic] | 1 | true |
## RuleId[ruleID=SystemOutErr]
### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/camel/kameleon/generator/RestDslGeneratorService.java`
#### Snippet
```java

    public String generate(String filename, String openapi) throws Exception {
        System.out.println(filename);
        System.out.println(openapi);
        final JsonNode node = filename.endsWith("json") ? readNodeFromJson(openapi) : readNodeFromYaml(openapi);
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/camel/kameleon/generator/RestDslGeneratorService.java`
#### Snippet
```java
    public String generate(String filename, String openapi) throws Exception {
        System.out.println(filename);
        System.out.println(openapi);
        final JsonNode node = filename.endsWith("json") ? readNodeFromJson(openapi) : readNodeFromYaml(openapi);
        OasDocument document = (OasDocument) Library.readDocument(node);
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/camel/kameleon/component/KameletComponentService.java`
#### Snippet
```java
                        e.getValue().getMetadata().getName(),
                        e.getValue().getSpec().getDefinition().getTitle(),
                        e.getValue().getSpec().getDefinition().getDescription().split("\\r?\\n")[0],
                        e.getValue().getMetadata().getAnnotations().get("camel.apache.org/kamelet.support.level"),
                        List.of(e.getValue().getMetadata().getLabels().get("camel.apache.org/kamelet.type")),
```

## RuleId[ruleID=DataFlowIssue]
### RuleId[ruleID=DataFlowIssue]
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

## RuleId[ruleID=UNUSED_IMPORT]
### RuleId[ruleID=UNUSED_IMPORT]
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

## RuleId[ruleID=SimplifyStreamApiCallChains]
### RuleId[ruleID=SimplifyStreamApiCallChains]
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

## RuleId[ruleID=ThrowablePrintStackTrace]
### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/apache/camel/kameleon/config/ConfigurationResource.java`
#### Snippet
```java
                kc = objectMapper.readValue(configuration, KameleonConfiguration.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/apache/camel/kameleon/generator/ProjectGeneratorService.java`
#### Snippet
```java
                        archive.closeArchiveEntry();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/apache/camel/kameleon/generator/ProjectGeneratorService.java`
#### Snippet
```java
            archive.finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

## RuleId[ruleID=SamePackageImport]
### RuleId[ruleID=SamePackageImport]
Unnecessary import from the same package `import org.apache.camel.kameleon.model.CamelType;`
in `src/main/java/org/apache/camel/kameleon/model/KameleonConfiguration.java`
#### Snippet
```java
import java.util.List;

import org.apache.camel.kameleon.model.CamelType;

public class KameleonConfiguration {
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractComponent()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/camel/kameleon/model/AbstractComponent.java`
#### Snippet
```java
    }

    public AbstractComponent(String name, String title, String description, String supportLevel, List<String> labels) {
        this.name = name;
        this.title = title;
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractComponent()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/camel/kameleon/model/AbstractComponent.java`
#### Snippet
```java
    protected List<String> labels;

    public AbstractComponent() {
    }

```

## RuleId[ruleID=Convert2MethodRef]
### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `src/main/java/org/apache/camel/kameleon/WarmUpService.java`
#### Snippet
```java
        try {
            JsonArray componentArray = componentResource.components(type, version);
            List<String> componentList = componentArray.stream().map(o -> o.toString()).collect(Collectors.toList());
            String components = componentList.stream().limit(5).collect(Collectors.joining(","));
            projectGeneratorService.generate(type, version, "org.apache.camel.kameleon", "demo", "0.0.1", javaVersion, components);
```

## RuleId[ruleID=HtmlWrongAttributeValue]
### RuleId[ruleID=HtmlWrongAttributeValue]
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2022-11-22-02-50-59.323.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=InnerClassMayBeStatic]
### RuleId[ruleID=InnerClassMayBeStatic]
Inner class `WarmupRequest` may be 'static'
in `src/main/java/org/apache/camel/kameleon/WarmUpService.java`
#### Snippet
```java
    }

    public class WarmupRequest {
        public String type;
        public String version;
```

## RuleId[ruleID=OptionalGetWithoutIsPresent]
### RuleId[ruleID=OptionalGetWithoutIsPresent]
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

### RuleId[ruleID=OptionalGetWithoutIsPresent]
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

### RuleId[ruleID=OptionalGetWithoutIsPresent]
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

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/org/apache/camel/kameleon/generator/ProjectGeneratorService.java`
#### Snippet
```java
                                          String groupId, String artifactId, String version)
            throws MavenInvocationException, IOException {
        CamelType camelType = configurationResource.getKc().getTypes().stream().filter(ct -> ct.getName().equals(type)).findFirst().get();
        CamelVersion camelVersion = camelType.getVersions().stream().filter(cv -> cv.getName().equals(archetypeVersion)).findFirst().get();

```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `src/main/java/org/apache/camel/kameleon/generator/ProjectGeneratorService.java`
#### Snippet
```java
            throws MavenInvocationException, IOException {
        CamelType camelType = configurationResource.getKc().getTypes().stream().filter(ct -> ct.getName().equals(type)).findFirst().get();
        CamelVersion camelVersion = camelType.getVersions().stream().filter(cv -> cv.getName().equals(archetypeVersion)).findFirst().get();

        Properties properties = new Properties();
```

## RuleId[ruleID=ComparatorResultComparison]
### RuleId[ruleID=ComparatorResultComparison]
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

### RuleId[ruleID=ComparatorResultComparison]
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

### RuleId[ruleID=ComparatorResultComparison]
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

### RuleId[ruleID=ComparatorResultComparison]
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

