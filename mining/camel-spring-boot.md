# camel-spring-boot 
 
# Bad smells
I found 355 bad smells with 22 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UNUSED_IMPORT | 164 | false |
| DynamicRegexReplaceableByCompiledPattern | 22 | false |
| ReturnNull | 22 | false |
| AssignmentToMethodParameter | 16 | false |
| RedundantEscapeInRegexReplacement | 14 | false |
| BoundedWildcard | 14 | false |
| ReplaceAssignmentWithOperatorAssignment | 9 | false |
| SizeReplaceableByIsEmpty | 8 | true |
| ClassNameSameAsAncestorName | 8 | false |
| IgnoreResultOfCall | 6 | false |
| UnnecessaryFullyQualifiedName | 6 | false |
| DataFlowIssue | 5 | false |
| InnerClassMayBeStatic | 5 | true |
| UnnecessaryBoxing | 5 | false |
| OptionalUsedAsFieldOrParameterType | 5 | false |
| UnnecessaryLocalVariable | 4 | true |
| RegExpRedundantEscape | 3 | false |
| KeySetIterationMayUseEntrySet | 3 | false |
| StringBufferReplaceableByString | 3 | false |
| DefaultAnnotationParam | 3 | false |
| CodeBlock2Expr | 3 | true |
| RedundantExplicitClose | 3 | false |
| ConstantValue | 3 | false |
| UnnecessarySemicolon | 2 | false |
| SimplifyStreamApiCallChains | 2 | false |
| UnnecessaryUnboxing | 2 | false |
| RedundantMethodOverride | 2 | false |
| NestedAssignment | 2 | false |
| EmptyMethod | 2 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| RegExpSimplifiable | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| RegExpRepeatedSpace | 1 | false |
| UnnecessarySuperQualifier | 1 | false |
| Convert2Lambda | 1 | false |
| RedundantFieldInitialization | 1 | false |
| NullArgumentToVariableArgMethod | 1 | false |
| MethodNameSameAsClassName | 1 | false |
## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `JasyptEncryptedPropertiesUtils` has only 'static' members, and lacks a 'private' constructor
in `components-starter/camel-jasypt-starter/src/main/java/org/apache/camel/component/jasypt/springboot/JasyptEncryptedPropertiesUtils.java`
#### Snippet
```java
import static org.apache.camel.util.StringHelper.after;

public class JasyptEncryptedPropertiesUtils {

    private static final String SYSTEM_ENVIRONMENT_PREFIX = "sysenv:";
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Argument `isNotice` might be null
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootStarterMojo.java`
#### Snippet
```java
        try (InputStream isNotice = getClass().getResourceAsStream("/spring-boot-starter-NOTICE.txt");
             InputStream isLicense = getClass().getResourceAsStream("/spring-boot-starter-LICENSE.txt")) {
            notice = IOUtils.toString(isNotice, StandardCharsets.UTF_8);
            license = IOUtils.toString(isLicense, StandardCharsets.UTF_8);
        }
```

### DataFlowIssue
Argument `isLicense` might be null
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootStarterMojo.java`
#### Snippet
```java
             InputStream isLicense = getClass().getResourceAsStream("/spring-boot-starter-LICENSE.txt")) {
            notice = IOUtils.toString(isNotice, StandardCharsets.UTF_8);
            license = IOUtils.toString(isLicense, StandardCharsets.UTF_8);
        }

```

### DataFlowIssue
Argument `is` might be null
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
            try {
                InputStream is = getClass().getClassLoader().getResourceAsStream("license-header.txt");
                String header = PackageHelper.loadText(is);
                String code = sb.toString();
                // add empty new line after header
```

### DataFlowIssue
Argument `is` might be null
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
            String header;
            try (InputStream is = getClass().getClassLoader().getResourceAsStream("license-header-java.txt")) {
                header = PackageHelper.loadText(is);
            }
            String code = header + "\n" + source;
```

### DataFlowIssue
Argument `attributes` might be null
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/util/OnHierarchicalPropertiesCondition.java`
#### Snippet
```java
        List<String> values = new ArrayList<>();

        for (AnnotationAttributes attribute : annotationAttributesFromMultiValueMap(attributes)) {
            String[] vals = (String[]) attribute.get("value");
            if (vals != null) {
```

## RuleId[ruleID=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `components-starter/camel-undertow-spring-security-starter/src/main/java/org/apache/camel/undertow/spring/boot/UndertowSpringSecurityCustomizer.java`
#### Snippet
```java

    private enum ProviderType {
        keycloak;
    }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `components-starter/camel-undertow-spring-security-starter/src/main/java/org/apache/camel/undertow/spring/boot/UndertowSpringSecurityCustomizer.java`
#### Snippet
```java
        final String jwkSetUri = getClientRegistration().getProviderDetails().getJwkSetUri();
        final NimbusJwtDecoder jwtDecoder = NimbusJwtDecoder.withJwkSetUri(jwkSetUri).build();
        jwtDecoder.setClaimSetConverter(new KeycloakUsernameSubClaimAdapter(getProvider().getUserNameAttribute()));;
        return jwtDecoder;
    }
```

## RuleId[ruleID=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cloud/CamelCloudServiceFilterAutoConfiguration.java`
#### Snippet
```java

        configurationProperties.getServiceFilter().getConfigurations().entrySet().stream()
            .forEach(entry -> registerBean(factory, entry.getKey(), entry.getValue()));
    }

```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cloud/CamelCloudServiceDiscoveryAutoConfiguration.java`
#### Snippet
```java

        configurationProperties.getServiceDiscovery().getConfigurations().entrySet().stream()
            .forEach(entry -> registerBean(factory, entry.getKey(), entry.getValue()));
    }

```

## RuleId[ruleID=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\:` in RegExp
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootStarterMojo.java`
#### Snippet
```java

            for (String lib : libsToRemove) {
                String groupIdStr = lib.split("\\:")[0];
                String artifactIdStr = lib.split("\\:")[1];

```

### RegExpRedundantEscape
Redundant character escape `\\:` in RegExp
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootStarterMojo.java`
#### Snippet
```java
            for (String lib : libsToRemove) {
                String groupIdStr = lib.split("\\:")[0];
                String artifactIdStr = lib.split("\\:")[1];

                Element exclusion = pom.createElement("exclusion");
```

### RegExpRedundantEscape
Redundant character escape `\\:` in RegExp
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootStarterMojo.java`
#### Snippet
```java
                    dependencies.appendChild(dependency);

                    String[] comps = dep.split("\\:");
                    String groupIdStr = comps[0];
                    String artifactIdStr = comps[1];
```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `grModels.keySet()` may be replaced with 'values()' iteration
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
            // Group the models by implementing classes
            Map<String, List<LanguageModel>> grModels = allModels.stream().collect(Collectors.groupingBy(LanguageModel::getJavaType));
            for (String languageClass : grModels.keySet()) {
                List<LanguageModel> dfModels = grModels.get(languageClass);
                LanguageModel model = dfModels.get(0); // They should be
```

### KeySetIterationMayUseEntrySet
Iteration over `grModels.keySet()` may be replaced with 'values()' iteration
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
            // Group the models by implementing classes
            Map<String, List<ComponentModel>> grModels = allModels.stream().collect(Collectors.groupingBy(ComponentModel::getJavaType));
            for (String componentClass : grModels.keySet()) {
                List<ComponentModel> compModels = grModels.get(componentClass);
                ComponentModel model = compModels.get(0); // They should be
```

### KeySetIterationMayUseEntrySet
Iteration over `grModels.keySet()` may be replaced with 'values()' iteration
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
            // Group the models by implementing classes
            Map<String, List<DataFormatModel>> grModels = allModels.stream().collect(Collectors.groupingBy(DataFormatModel::getJavaType));
            for (String dataFormatClass : grModels.keySet()) {
                List<DataFormatModel> dfModels = grModels.get(dataFormatClass);
                DataFormatModel model = dfModels.get(0); // They should be
```

## RuleId[ruleID=RegExpSimplifiable]
### RegExpSimplifiable
`[-]` can be simplified to '-'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cluster/TimePatternConverter.java`
#### Snippet
```java
 */
public final class TimePatternConverter {
    private static final Pattern NUMBERS_ONLY_STRING_PATTERN = Pattern.compile("^[-]?(\\d)+$", Pattern.CASE_INSENSITIVE);
    private static final Pattern HOUR_REGEX_PATTERN = Pattern.compile("((\\d)*(\\d))h(our(s)?)?", Pattern.CASE_INSENSITIVE);
    private static final Pattern MINUTES_REGEX_PATTERN
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`artExcl.trim().length() > 0` can be replaced with '!artExcl.trim().isEmpty()'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootStarterMojo.java`
#### Snippet
```java
        String artExcl = properties.getProperty("exclude_" + getMainDepArtifactId());
        getLog().debug("Configured exclusions: " + artExcl);
        if (artExcl != null && artExcl.trim().length() > 0) {
            for (String dep : artExcl.split(",")) {
                getLog().debug("Adding configured exclusion: " + dep);
```

### SizeReplaceableByIsEmpty
`libsToRemove.size() > 0` can be replaced with '!libsToRemove.isEmpty()'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootStarterMojo.java`
#### Snippet
```java
        libsToRemove = filterIncludedArtifacts(libsToRemove);

        if (libsToRemove.size() > 0) {
            getLog().info("Spring-Boot-Starter: the following dependencies will be removed from the starter: " + libsToRemove);

```

### SizeReplaceableByIsEmpty
`csv.trim().length() == 0` can be replaced with 'csv.trim().isEmpty()'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootStarterMojo.java`
#### Snippet
```java

    private Set<String> csvToSet(String csv) {
        if (csv == null || csv.trim().length() == 0) {
            return new TreeSet<>();
        }
```

### SizeReplaceableByIsEmpty
`deps.size() > 0` can be replaced with '!deps.isEmpty()'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootStarterMojo.java`
#### Snippet
```java
        }

        if (deps.size() > 0) {
            getLog().debug("The following dependencies will be added to the starter: " + deps);

```

### SizeReplaceableByIsEmpty
`deps.size() > 0` can be replaced with '!deps.isEmpty()'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootStarterMojo.java`
#### Snippet
```java
            Node dependencies = ((NodeList) xpath.compile("/project/dependencies").evaluate(pom, XPathConstants.NODESET)).item(0);

            if (deps.size() > 0) {
                dependencies.appendChild(pom.createComment(GENERATED_SECTION_START));
                for (String dep : deps) {
```

### SizeReplaceableByIsEmpty
`errors.size() > 0` can be replaced with '!errors.isEmpty()'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/BomDependenciesGeneratorMojo.java`
#### Snippet
```java
        }

        if (errors.size() > 0) {
            StringBuilder msg = new StringBuilder();
            msg.append("Found ").append(errors.size()).append(" conflicts between the current managed dependencies and the external BOMS:\n");
```

### SizeReplaceableByIsEmpty
`sslProperties.size() > 0` can be replaced with '!sslProperties.isEmpty()'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/security/CamelSSLAutoConfiguration.java`
#### Snippet
```java
            Map<String, Object> sslProperties = binder.bind("camel.ssl.config", Bindable.mapOf(String.class, Object.class)).orElse(Collections.emptyMap());
            ConditionMessage.Builder message = ConditionMessage.forCondition("camel.ssl.config");
            if (sslProperties.size() > 0) {
                return ConditionOutcome.match(message.because("enabled"));
            }
```

### SizeReplaceableByIsEmpty
`replaceSource.length() > 0` can be replaced with '!replaceSource.isEmpty()'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cluster/TimePatternConverter.java`
#### Snippet
```java
        replaceSource = matcher.replaceFirst("");

        if (replaceSource.length() > 0) {
            throw new IllegalArgumentException("Illegal characters: " + source);
        }
```

## RuleId[ruleID=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java

    private static String createDataFormatBody(String shortJavaType, String name) {
        return new StringBuilder()
                .append("return new DataFormatCustomizer() {\n")
                .append("    @Override\n")
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java

    private static String createComponentBody(String shortJavaType, String name) {
        return new StringBuilder()
                .append("return new ComponentCustomizer() {\n")
                .append("    @Override\n")
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java

    private static String createLanguageBody(String shortJavaType, String name) {
        return new StringBuilder()
                .append("return new LanguageCustomizer() {\n")
                .append("    @Override\n")
```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/AbstractSpringBootGenerator.java`
#### Snippet
```java
        files = componentJar.stream()
                .filter(je -> je.getName().endsWith(".json"))
                .collect(Collectors.toMap(je -> "jar:" + mainDep.getFile().toURI().toString() + "!" + je.getName(),
                        je -> cache(() -> loadJson(componentJar, je))));
        return files;
```

## RuleId[ruleID=RedundantEscapeInRegexReplacement]
### RedundantEscapeInRegexReplacement
Redundant escape of '?'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootStarterMojo.java`
#### Snippet
```java

        // Fix header formatting problem
        content = content.replaceFirst("-->", "-->\n").replaceFirst("\\?><!--", "\\?>\n<!--");

        writeIfChanged(content, destination);
```

### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        sortImports(javaClass);

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + name + ".java";
        writeSourceIfChanged(javaClass, fileName, false);

```

### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        }

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + name + ".java";
        writeSourceIfChanged(javaClass, fileName, true);
    }
```

### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        sortImports(javaClass);

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + name + ".java";
        writeSourceIfChanged(javaClass, fileName, false);
    }
```

### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        }

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + name + ".java";
        writeSourceIfChanged(javaClass, fileName, true);
    }
```

### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        }

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + className + ".java";
        writeSourceIfChanged(javaClass, fileName, true);
    }
```

### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        }

        writeSourceIfChanged(commonClass, packageName.replaceAll("\\.", "\\/") + "/" + commonName + ".java", true);

        Class commonClazz = generateDummyClass(commonClass.getCanonicalName());
```

### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
            method.setBody("this.enabled = enabled;");

            String fileName = packageName.replaceAll("\\.", "\\/") + "/" + configName + ".java";
            writeSourceIfChanged(configClass, fileName, true);
        }
```

### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        method.addAnnotation(Bean.class);

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + name + ".java";
        writeSourceIfChanged(javaClass, fileName, false);
    }
```

### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        sortImports(javaClass);

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + name + ".java";
        writeSourceIfChanged(javaClass, fileName, false);
    }
```

### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        sortImports(javaClass);

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + name + ".java";
        writeSourceIfChanged(javaClass, fileName, false);
    }
```

### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        sortImports(javaClass);

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + name + ".java";
        writeSourceIfChanged(javaClass, fileName, false);
    }
```

### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        }

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + name + ".java";
        writeSourceIfChanged(javaClass, fileName, true);
    }
```

### RedundantEscapeInRegexReplacement
Redundant escape of '/'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
                + "    definition.setCorsHeaders(target);\n" + "}\n" + "return definition;");

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + name + ".java";
        writeSourceIfChanged(javaClass, fileName, true);
        writeComponentSpringFactorySource(packageName, name);
```

## RuleId[ruleID=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `CustomizerProperties` may be 'static'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/ComponentConfigurationPropertiesCommon.java`
#### Snippet
```java
    // ********************************

    public class CustomizerProperties {
        /**
         * Global option to enable/disable component customizers, default is true.
```

### InnerClassMayBeStatic
Inner class `CustomizerProperties` may be 'static'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/LanguageConfigurationPropertiesCommon.java`
#### Snippet
```java
    // ********************************

    public class CustomizerProperties {
        /**
         * Global option to enable/disable language customizers, default is true.
```

### InnerClassMayBeStatic
Inner class `CustomizerProperties` may be 'static'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/DataFormatConfigurationPropertiesCommon.java`
#### Snippet
```java
    // ********************************

    public class CustomizerProperties {
        /**
         * Global option to enable/disable dataformat customizers, default is true.
```

### InnerClassMayBeStatic
Inner class `ServiceCall` may be 'static'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cloud/CamelCloudConfigurationProperties.java`
#### Snippet
```java
    // *****************************************

    public class ServiceCall {

        /**
```

### InnerClassMayBeStatic
Inner class `CamelHealthCheckIndicatorInitializer` may be 'static'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/health/CamelHealthCheckAutoConfiguration.java`
#### Snippet
```java
    @ConditionalOnClass({CamelContext.class})
    @ConditionalOnMissingBean(CamelHealthCheckIndicator.class)
    protected class CamelHealthCheckIndicatorInitializer {

        @Bean(name = "camelHealth")
```

## RuleId[ruleID=RegExpRepeatedSpace]
### RegExpRepeatedSpace
2 consecutive spaces in RegExp
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
                        lastLine++;
                    }
                    sourceCode = lines.subList(0, lastLine).stream().map(s -> s.replaceAll("  ", " ")).map(String::trim).filter(s -> !s.isEmpty()).collect(Collectors.joining(" "));
                    return sourceCode;
                }
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends T`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/StarterGeneratorMojo.java`
#### Snippet
```java
    }

    private static <T> Stream<T> concat(Stream<T> s1, Stream<T> s2, Stream<T> s3) {
        return Stream.concat(s1, Stream.concat(s2, s3));
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/StarterGeneratorMojo.java`
#### Snippet
```java
    }

    private static <T> Stream<T> concat(Stream<T> s1, Stream<T> s2, Stream<T> s3) {
        return Stream.concat(s1, Stream.concat(s2, s3));
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/StarterGeneratorMojo.java`
#### Snippet
```java
    }

    private static <T> Stream<T> concat(Stream<T> s1, Stream<T> s2, Stream<T> s3) {
        return Stream.concat(s1, Stream.concat(s2, s3));
    }
```

### BoundedWildcard
Can generalize to `? extends Dependency`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/BomGeneratorMojo.java`
#### Snippet
```java


    private void overwriteDependencyManagement(Document pom, List<Dependency> dependencies) throws Exception {
        XPath xpath = XPathFactory.newInstance().newXPath();
        XPathExpression expr = xpath.compile("/project/dependencyManagement/dependencies");
```

### BoundedWildcard
Can generalize to `? super String`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/BomDependenciesGeneratorMojo.java`
#### Snippet
```java
    }

    private Set<String> getProvidedDependencyManagement(String groupId, String artifactId, String version, Set<String> gaChecked) throws Exception {
        String ga = groupId + ":" + artifactId;
        gaChecked.add(ga);
```

### BoundedWildcard
Can generalize to `? extends Dependency`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/BomDependenciesGeneratorMojo.java`
#### Snippet
```java


    private void overwriteDependencyManagement(Document pom, List<Dependency> dependencies) throws Exception {
        XPath xpath = XPathFactory.newInstance().newXPath();
        XPathExpression expr = xpath.compile("/project/dependencyManagement/dependencies");
```

### BoundedWildcard
Can generalize to `? extends Dependency`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/BomDependenciesGeneratorMojo.java`
#### Snippet
```java
    }

    private List<Dependency> enhance(List<Dependency> dependencyList) throws IOException {
        List<Dependency> outDependencies = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? extends Dependency`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/BomDependenciesGeneratorMojo.java`
#### Snippet
```java
    }

    private void checkConflictsWithExternalBoms(Collection<Dependency> dependencies, Set<String> external) throws MojoFailureException {
        Set<String> errors = new TreeSet<>();
        for (Dependency d : dependencies) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/AbstractSpringBootGenerator.java`
#### Snippet
```java
    }

    protected static <T> Supplier<T> cache(Supplier<T> supplier) {
        return new Supplier<T>() {
            T value;
```

### BoundedWildcard
Can generalize to `? super Class`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
    }

    private void addAnnotation(Function<Class<? extends java.lang.annotation.Annotation>, Annotation> creator, java.lang.annotation.Annotation ann) {
        Class<? extends java.lang.annotation.Annotation> ac = ann.annotationType();
        Annotation a = creator.apply(ac);
```

### BoundedWildcard
Can generalize to `? extends Annotation`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
    }

    private void addAnnotation(Function<Class<? extends java.lang.annotation.Annotation>, Annotation> creator, java.lang.annotation.Annotation ann) {
        Class<? extends java.lang.annotation.Annotation> ac = ann.annotationType();
        Annotation a = creator.apply(ac);
```

### BoundedWildcard
Can generalize to `? super String`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
    }

    private void findComponentNames(Set<String> componentNames) {
        componentJar.stream()
                .filter(je -> !je.isDirectory())
```

### BoundedWildcard
Can generalize to `? extends ConversionService`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/SpringTypeConverter.java`
#### Snippet
```java

    @Autowired
    public SpringTypeConverter(List<ConversionService> conversionServices) {
        this.conversionServices = conversionServices;
        this.types = new ConcurrentHashMap<>();
```

### BoundedWildcard
Can generalize to `? extends ConversionService`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/util/CompositeConversionService.java`
#### Snippet
```java
    private final List<ConversionService> delegates;

    public CompositeConversionService(List<ConversionService> delegates) {
        this.delegates = delegates;
    }
```

## RuleId[ruleID=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Long.parseLong()` call can be used instead
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cluster/TimePatternConverter.java`
#### Snippet
```java
            // Note: This will also be used for regular numeric strings.
            //       This String -> long converter will be used for all strings.
            milliseconds = Long.valueOf(source);
        } else {
            matcher = createMatcher(HOUR_REGEX_PATTERN, source);
```

### UnnecessaryBoxing
Redundant boxing, `Long.parseLong()` call can be used instead
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cluster/TimePatternConverter.java`
#### Snippet
```java
            matcher = createMatcher(HOUR_REGEX_PATTERN, source);
            if (matcher.find()) {
                milliseconds = milliseconds + (3600000 * Long.valueOf(matcher.group(1)));
                foundFlag = true;
            }
```

### UnnecessaryBoxing
Redundant boxing, `Long.parseLong()` call can be used instead
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cluster/TimePatternConverter.java`
#### Snippet
```java
            matcher = createMatcher(MINUTES_REGEX_PATTERN, source);
            if (matcher.find()) {
                long minutes = Long.valueOf(matcher.group(1));
                if ((minutes > 59) && foundFlag) {
                    throw new IllegalArgumentException("Minutes should contain a valid value between 0 and 59: " + source);
```

### UnnecessaryBoxing
Redundant boxing, `Long.parseLong()` call can be used instead
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cluster/TimePatternConverter.java`
#### Snippet
```java
            matcher = createMatcher(SECONDS_REGEX_PATTERN, source);
            if (matcher.find()) {
                long seconds = Long.valueOf(matcher.group(1));
                if ((seconds > 59) && foundFlag) {
                    throw new IllegalArgumentException("Seconds should contain a valid value between 0 and 59: " + source);
```

### UnnecessaryBoxing
Redundant boxing, `Long.parseLong()` call can be used instead
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cluster/TimePatternConverter.java`
#### Snippet
```java
            // The source at this point may contain illegal values or special characters
            if (!foundFlag) {
                milliseconds = Long.valueOf(source);
            }
        }
```

## RuleId[ruleID=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/BomGeneratorMojo.java`
#### Snippet
```java
        DOMSource source = new DOMSource(pom);

        targetPom.getParentFile().mkdirs();

        String content;
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/BomGeneratorMojo.java`
#### Snippet
```java
        } else {
            File parent = file.getParentFile();
            parent.mkdirs();
        }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootStarterMojo.java`
#### Snippet
```java

        File outDir = new File(baseDir, "src/main/resources/META-INF");
        outDir.mkdirs();
        File outFile = new File(outDir, "spring.provides");

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/BomDependenciesGeneratorMojo.java`
#### Snippet
```java
        } else {
            File parent = file.getParentFile();
            parent.mkdirs();
        }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/BomDependenciesGeneratorMojo.java`
#### Snippet
```java
        DOMSource source = new DOMSource(pom);

        targetPom.getParentFile().mkdirs();

        String content;
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/AbstractSpringBootGenerator.java`
#### Snippet
```java
            // Create the structure
            File parent = file.getParentFile();
            parent.mkdirs();
        }

```

## RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'timeout'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/endpoint/CamelRoutesEndpoint.java`
#### Snippet
```java
    }

    private void suspendRoute(String id, Optional<Long> timeout, Optional<TimeUnit> timeUnit) {
        try {
            if (timeout.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'timeUnit'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/endpoint/CamelRoutesEndpoint.java`
#### Snippet
```java
    }

    private void suspendRoute(String id, Optional<Long> timeout, Optional<TimeUnit> timeUnit) {
        try {
            if (timeout.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'timeout'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/endpoint/CamelRoutesEndpoint.java`
#### Snippet
```java
    }

    private void stopRoute(String id, Optional<Long> timeout, Optional<TimeUnit> timeUnit, Optional<Boolean> abortAfterTimeout) {
        try {
            if (timeout.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'timeUnit'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/endpoint/CamelRoutesEndpoint.java`
#### Snippet
```java
    }

    private void stopRoute(String id, Optional<Long> timeout, Optional<TimeUnit> timeUnit, Optional<Boolean> abortAfterTimeout) {
        try {
            if (timeout.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'abortAfterTimeout'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/endpoint/CamelRoutesEndpoint.java`
#### Snippet
```java
    }

    private void stopRoute(String id, Optional<Long> timeout, Optional<TimeUnit> timeUnit, Optional<Boolean> abortAfterTimeout) {
        try {
            if (timeout.isPresent()) {
```

## RuleId[ruleID=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `components-starter/camel-opentelemetry-starter/src/main/java/org/apache/camel/opentelemetry/starter/OpenTelemetryAutoConfiguration.java`
#### Snippet
```java
        }
        if (config.getEncoding() != null) {
            ottracer.setEncoding(config.getEncoding().booleanValue());
        }
        ottracer.init(camelContext);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `components-starter/camel-opentracing-starter/src/main/java/org/apache/camel/opentracing/starter/OpenTracingAutoConfiguration.java`
#### Snippet
```java
        }
        if (config.getEncoding() != null) {
            ottracer.setEncoding(config.getEncoding().booleanValue());
        }
        ottracer.init(camelContext);
```

## RuleId[ruleID=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Condition` is the same as one of its superclass' names
in `components-starter/camel-kubernetes-starter/src/main/java/org/apache/camel/component/kubernetes/springboot/cloud/KubernetesServiceDiscoveryAutoConfiguration.java`
#### Snippet
```java
    // *******************************

    public static class Condition extends GroupCondition {
        public Condition() {
            super(
```

### ClassNameSameAsAncestorName
Class name `ZooKeeperServiceRegistryConfiguration` is the same as one of its superclass' names
in `components-starter/camel-zookeeper-starter/src/main/java/org/apache/camel/component/zookeeper/springboot/cloud/ZooKeeperServiceRegistryConfiguration.java`
#### Snippet
```java

@ConfigurationProperties(prefix = "camel.cloud.zookeeper")
public class ZooKeeperServiceRegistryConfiguration extends org.apache.camel.component.zookeeper.cloud.ZooKeeperServiceRegistryConfiguration {
    /**
     * Sets if the zookeeper service registry should be enabled or not, default is false.
```

### ClassNameSameAsAncestorName
Class name `ConsulServiceRegistryConfiguration` is the same as one of its superclass' names
in `components-starter/camel-consul-starter/src/main/java/org/apache/camel/component/consul/springboot/cloud/ConsulServiceRegistryConfiguration.java`
#### Snippet
```java

@ConfigurationProperties(prefix = "camel.cloud.consul")
public class ConsulServiceRegistryConfiguration extends org.apache.camel.component.consul.cloud.ConsulServiceRegistryConfiguration {
    /**
     * Sets if the consul service registry should be enabled or not, default is false.
```

### ClassNameSameAsAncestorName
Class name `Condition` is the same as one of its superclass' names
in `components-starter/camel-consul-starter/src/main/java/org/apache/camel/component/consul/springboot/cloud/ConsulServiceDiscoveryAutoConfiguration.java`
#### Snippet
```java
    // *******************************

    public static class Condition extends GroupCondition {
        public Condition() {
            super(
```

### ClassNameSameAsAncestorName
Class name `Condition` is the same as one of its superclass' names
in `components-starter/camel-dns-starter/src/main/java/org/apache/camel/component/dns/springboot/cloud/DnsCloudAutoConfiguration.java`
#### Snippet
```java
    // *******************************

    public static class Condition extends GroupCondition {
        public Condition() {
            super(
```

### ClassNameSameAsAncestorName
Class name `Condition` is the same as one of its superclass' names
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cloud/CamelCloudServiceFilterAutoConfiguration.java`
#### Snippet
```java
    // *******************************

    public static class Condition extends GroupCondition {
        public Condition() {
            super(
```

### ClassNameSameAsAncestorName
Class name `Condition` is the same as one of its superclass' names
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cloud/CamelCloudServiceDiscoveryAutoConfiguration.java`
#### Snippet
```java
    // *******************************

    public static class Condition extends GroupCondition {
        public Condition() {
            super(
```

### ClassNameSameAsAncestorName
Class name `Condition` is the same as one of its superclass' names
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/security/CamelSSLAutoConfiguration.java`
#### Snippet
```java
    }

    public static class Condition extends SpringBootCondition {
        @Override
        public ConditionOutcome getMatchOutcome(ConditionContext context, AnnotatedTypeMetadata annotatedTypeMetadata) {
```

## RuleId[ruleID=RedundantMethodOverride]
### RedundantMethodOverride
Method `init()` only delegates to its super method
in `components-starter/camel-undertow-spring-security-starter/src/main/java/org/apache/camel/undertow/spring/boot/UndertowSpringSecurityCustomizer.java`
#### Snippet
```java

        @Override
        public void init(WebSecurity web) throws Exception {
            super.init(web);
        }
```

### RedundantMethodOverride
Method `getServerPort()` only delegates to its super method
in `components-starter/camel-platform-http-starter/src/main/java/org/apache/camel/component/platform/http/springboot/ServletPlatformHttpEngine.java`
#### Snippet
```java

	@Override
	public int getServerPort() {
		return PlatformHttpEngine.super.getServerPort();
	}
```

## RuleId[ruleID=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `components-starter/camel-zipkin-starter/src/main/java/org/apache/camel/zipkin/starter/ZipkinAutoConfiguration.java`
#### Snippet
```java
public class ZipkinAutoConfiguration {

    @Bean(initMethod = "", destroyMethod = "")
    // Camel handles the lifecycle of this bean
    @ConditionalOnMissingBean(ZipkinTracer.class)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `components-starter/camel-opentelemetry-starter/src/main/java/org/apache/camel/opentelemetry/starter/OpenTelemetryAutoConfiguration.java`
#### Snippet
```java
    private Tracer tracer;

    @Bean(initMethod = "", destroyMethod = "")
    // Camel handles the lifecycle of this bean
    @ConditionalOnMissingBean(OpenTelemetryTracer.class)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `components-starter/camel-opentracing-starter/src/main/java/org/apache/camel/opentracing/starter/OpenTracingAutoConfiguration.java`
#### Snippet
```java
    private Tracer tracer;

    @Bean(initMethod = "", destroyMethod = "")
    // Camel handles the lifecycle of this bean
    @ConditionalOnMissingBean(OpenTracingTracer.class)
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/DynamicClassLoader.java`
#### Snippet
```java

    public Class defineClass(String name, byte[] data) {
        return super.defineClass(name, data, 0, data.length);
    }

```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/StarterGeneratorMojo.java`
#### Snippet
```java
        Files.write(new File(directory, "pom.xml").toPath(),
                Files.lines(sourcePom.toPath())
                        .map(s -> s.replaceAll("%NAME%", name))
                        .collect(Collectors.toList()));
        Path parent = new File(startersDir, "pom.xml").toPath();
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/BomGeneratorMojo.java`
#### Snippet
```java

        // Fix header formatting problem
        content = content.replaceFirst("-->", "-->\n");
        writeFileIfChanged(content, targetPom);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootStarterMojo.java`
#### Snippet
```java

        // Fix header formatting problem
        content = content.replaceFirst("-->", "-->\n").replaceFirst("\\?><!--", "\\?>\n<!--");

        writeIfChanged(content, destination);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootStarterMojo.java`
#### Snippet
```java

        // Fix header formatting problem
        content = content.replaceFirst("-->", "-->\n").replaceFirst("\\?><!--", "\\?>\n<!--");

        writeIfChanged(content, destination);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/BomDependenciesGeneratorMojo.java`
#### Snippet
```java

        // Fix header formatting problem
        content = content.replaceFirst("-->", "-->\n");
        writeFileIfChanged(content, targetPom);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        pattern = pattern.toLowerCase();
        if (pattern.contains("ms")) {
            pattern = pattern.replaceAll("ms", "");
        }
        try {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        sortImports(javaClass);

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + name + ".java";
        writeSourceIfChanged(javaClass, fileName, false);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        }

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + className + ".java";
        writeSourceIfChanged(javaClass, fileName, true);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        }

        writeSourceIfChanged(commonClass, packageName.replaceAll("\\.", "\\/") + "/" + commonName + ".java", true);

        Class commonClazz = generateDummyClass(commonClass.getCanonicalName());
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
            method.setBody("this.enabled = enabled;");

            String fileName = packageName.replaceAll("\\.", "\\/") + "/" + configName + ".java";
            writeSourceIfChanged(configClass, fileName, true);
        }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        method.addAnnotation(Bean.class);

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + name + ".java";
        writeSourceIfChanged(javaClass, fileName, false);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        sortImports(javaClass);

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + name + ".java";
        writeSourceIfChanged(javaClass, fileName, false);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        sortImports(javaClass);

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + name + ".java";
        writeSourceIfChanged(javaClass, fileName, false);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        }

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + name + ".java";
        writeSourceIfChanged(javaClass, fileName, true);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
                + "    definition.setCorsHeaders(target);\n" + "}\n" + "return definition;");

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + name + ".java";
        writeSourceIfChanged(javaClass, fileName, true);
        writeComponentSpringFactorySource(packageName, name);
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
                List<java.lang.reflect.Method> publicMethods = Stream.of(clazz.getDeclaredMethods()).filter(m -> Modifier.isPublic(m.getModifiers())).collect(Collectors.toList());
                List<java.lang.reflect.Method> allSetters = publicMethods.stream().filter(m -> m.getReturnType() == void.class || m.getReturnType() == clazz)
                        .filter(m -> m.getParameterCount() == 1).filter(m -> m.getName().matches("set[A-Z][a-zA-Z0-9]*")).collect(Collectors.toList());
                List<java.lang.reflect.Method> allGetters = publicMethods.stream().filter(m -> m.getReturnType() != void.class).filter(m -> m.getParameterCount() == 0)
                        .filter(m -> m.getName().matches("(get|is)[A-Z][a-zA-Z0-9]*")).collect(Collectors.toList());
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
                        .filter(m -> m.getParameterCount() == 1).filter(m -> m.getName().matches("set[A-Z][a-zA-Z0-9]*")).collect(Collectors.toList());
                List<java.lang.reflect.Method> allGetters = publicMethods.stream().filter(m -> m.getReturnType() != void.class).filter(m -> m.getParameterCount() == 0)
                        .filter(m -> m.getName().matches("(get|is)[A-Z][a-zA-Z0-9]*")).collect(Collectors.toList());
                allSetters.stream()
                        .sorted(Comparator.<java.lang.reflect.Method>comparingInt(m -> getSetterPosition(sourceCode, m))
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        sortImports(javaClass);

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + name + ".java";
        writeSourceIfChanged(javaClass, fileName, false);

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        }

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + name + ".java";
        writeSourceIfChanged(javaClass, fileName, true);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        }

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + name + ".java";
        writeSourceIfChanged(javaClass, fileName, true);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
                        lastLine++;
                    }
                    sourceCode = lines.subList(0, lastLine).stream().map(s -> s.replaceAll("  ", " ")).map(String::trim).filter(s -> !s.isEmpty()).collect(Collectors.joining(" "));
                    return sourceCode;
                }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        sortImports(javaClass);

        String fileName = packageName.replaceAll("\\.", "\\/") + "/" + name + ".java";
        writeSourceIfChanged(javaClass, fileName, false);
    }
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `io.apicurio.datamodels` is unnecessary, and can be replaced with an import
in `components-starter/camel-springdoc-starter/src/main/java/org/apache/camel/springboot/springdoc/SpringdocAutoConfiguration.java`
#### Snippet
```java
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        final Object dump = io.apicurio.datamodels.Library.writeNode(openApi);
        final byte[] jsonData = mapper.writeValueAsBytes(dump);
        // json to yaml
```

### UnnecessaryFullyQualifiedName
Qualifier `java.time.format` is unnecessary, and can be replaced with an import
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
            Duration d = Duration.parse("PT" + pattern);
            value = String.valueOf(d.toMillis());
        } catch (java.time.format.DateTimeParseException e) {
            value = pattern;
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang.reflect` is unnecessary, and can be replaced with an import
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
                            Type wft;
                            boolean isBoolean;
                            java.lang.reflect.Field field = Stream.of(clazz.getDeclaredFields()).filter(f -> f.getName().equals(fn)).findAny().orElse(null);
                            List<java.lang.reflect.Method> setters = allSetters.stream().filter(m -> m.getName().equals("set" + StringUtils.capitalize(fn))).collect(Collectors.toList());
                            List<java.lang.reflect.Method> getters = allGetters.stream()
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.artifact` is unnecessary, and can be replaced with an import
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
            try {
                classpathElements = project.getTestClasspathElements();
            } catch (org.apache.maven.artifact.DependencyResolutionRequiredException e) {
                throw new RuntimeException(e.getMessage(), e);
            }
```

### UnnecessaryFullyQualifiedName
Qualifier `io.apicurio.datamodels` is unnecessary, and can be replaced with an import
in `components-starter/camel-openapi-java-starter/src/main/java/org/apache/camel/springboot/openapi/OpenApiAutoConfiguration.java`
#### Snippet
```java
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        Object dump = io.apicurio.datamodels.Library.writeNode(openApi);
        byte[] jsonData = mapper.writeValueAsBytes(dump);
        // json to yaml
```

### UnnecessaryFullyQualifiedName
Qualifier `org.ehcache.config` is unnecessary and can be removed
in `components-starter/camel-ehcache-starter/src/main/java/org/apache/camel/component/ehcache/springboot/customizer/CacheConfigurationCustomizer.java`
#### Snippet
```java
/**
 * A simple implementation of {@link ComponentCustomizer} that auto discovers a
 * {@link org.ehcache.config.CacheConfiguration} instance and bind it to the
 * {@link EhcacheComponent} component.
 *
```

## RuleId[ruleID=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import org.apache.camel.component.activemq.ActiveMQComponent;`
in `components-starter/camel-activemq-starter/src/main/java/org/apache/camel/component/activemq/springboot/ActiveMQComponentConfiguration.java`
#### Snippet
```java
import javax.jms.ExceptionListener;
import org.apache.camel.LoggingLevel;
import org.apache.camel.component.activemq.ActiveMQComponent;
import org.apache.camel.component.jms.ConsumerType;
import org.apache.camel.component.jms.DefaultTaskExecutorType;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.amqp.AMQPComponent;`
in `components-starter/camel-amqp-starter/src/main/java/org/apache/camel/component/amqp/springboot/AMQPComponentConfiguration.java`
#### Snippet
```java
import javax.jms.ExceptionListener;
import org.apache.camel.LoggingLevel;
import org.apache.camel.component.amqp.AMQPComponent;
import org.apache.camel.component.jms.ConsumerType;
import org.apache.camel.component.jms.DefaultTaskExecutorType;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-any23-starter/src/main/java/org/apache/camel/dataformat/any23/springboot/Any23DataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.dataformat.any23.Any23DataFormat;`
in `components-starter/camel-any23-starter/src/main/java/org/apache/camel/dataformat/any23/springboot/Any23DataFormatConfiguration.java`
#### Snippet
```java
import java.util.List;
import javax.annotation.Generated;
import org.apache.camel.dataformat.any23.Any23DataFormat;
import org.apache.camel.dataformat.any23.Any23OutputFormat;
import org.apache.camel.model.PropertyDefinition;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-asn1-starter/src/main/java/org/apache/camel/dataformat/asn1/springboot/ASN1DataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-avro-starter/src/main/java/org/apache/camel/dataformat/avro/springboot/AvroDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.aws.cloudtrail.CloudtrailComponent;`
in `components-starter/camel-aws-cloudtrail-starter/src/main/java/org/apache/camel/component/aws/cloudtrail/springboot/CloudtrailComponentConfiguration.java`
#### Snippet
```java

import javax.annotation.Generated;
import org.apache.camel.component.aws.cloudtrail.CloudtrailComponent;
import org.apache.camel.component.aws.cloudtrail.CloudtrailConfiguration;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.aws.secretsmanager.SecretsManagerComponent;`
in `components-starter/camel-aws-secrets-manager-starter/src/main/java/org/apache/camel/component/aws/secretsmanager/springboot/SecretsManagerComponentConfiguration.java`
#### Snippet
```java

import javax.annotation.Generated;
import org.apache.camel.component.aws.secretsmanager.SecretsManagerComponent;
import org.apache.camel.component.aws.secretsmanager.SecretsManagerConfiguration;
import org.apache.camel.component.aws.secretsmanager.SecretsManagerOperations;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.aws2.athena.Athena2Component;`
in `components-starter/camel-aws2-athena-starter/src/main/java/org/apache/camel/component/aws2/athena/springboot/Athena2ComponentConfiguration.java`
#### Snippet
```java

import javax.annotation.Generated;
import org.apache.camel.component.aws2.athena.Athena2Component;
import org.apache.camel.component.aws2.athena.Athena2Configuration;
import org.apache.camel.component.aws2.athena.Athena2Operations;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.aws2.cw.Cw2Component;`
in `components-starter/camel-aws2-cw-starter/src/main/java/org/apache/camel/component/aws2/cw/springboot/Cw2ComponentConfiguration.java`
#### Snippet
```java
import java.time.Instant;
import javax.annotation.Generated;
import org.apache.camel.component.aws2.cw.Cw2Component;
import org.apache.camel.component.aws2.cw.Cw2Configuration;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.aws2.ddb.Ddb2Component;`
in `components-starter/camel-aws2-ddb-starter/src/main/java/org/apache/camel/component/aws2/ddb/springboot/Ddb2ComponentConfiguration.java`
#### Snippet
```java

import javax.annotation.Generated;
import org.apache.camel.component.aws2.ddb.Ddb2Component;
import org.apache.camel.component.aws2.ddb.Ddb2Configuration;
import org.apache.camel.component.aws2.ddb.Ddb2Operations;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.aws2.ddbstream.Ddb2StreamComponent;`
in `components-starter/camel-aws2-ddb-starter/src/main/java/org/apache/camel/component/aws2/ddbstream/springboot/Ddb2StreamComponentConfiguration.java`
#### Snippet
```java

import javax.annotation.Generated;
import org.apache.camel.component.aws2.ddbstream.Ddb2StreamComponent;
import org.apache.camel.component.aws2.ddbstream.Ddb2StreamConfiguration;
import org.apache.camel.component.aws2.ddbstream.Ddb2StreamConfiguration.StreamIteratorType;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.aws2.ec2.AWS2EC2Component;`
in `components-starter/camel-aws2-ec2-starter/src/main/java/org/apache/camel/component/aws2/ec2/springboot/AWS2EC2ComponentConfiguration.java`
#### Snippet
```java

import javax.annotation.Generated;
import org.apache.camel.component.aws2.ec2.AWS2EC2Component;
import org.apache.camel.component.aws2.ec2.AWS2EC2Configuration;
import org.apache.camel.component.aws2.ec2.AWS2EC2Operations;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.aws2.ecs.ECS2Component;`
in `components-starter/camel-aws2-ecs-starter/src/main/java/org/apache/camel/component/aws2/ecs/springboot/ECS2ComponentConfiguration.java`
#### Snippet
```java

import javax.annotation.Generated;
import org.apache.camel.component.aws2.ecs.ECS2Component;
import org.apache.camel.component.aws2.ecs.ECS2Configuration;
import org.apache.camel.component.aws2.ecs.ECS2Operations;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.aws2.eks.EKS2Component;`
in `components-starter/camel-aws2-eks-starter/src/main/java/org/apache/camel/component/aws2/eks/springboot/EKS2ComponentConfiguration.java`
#### Snippet
```java

import javax.annotation.Generated;
import org.apache.camel.component.aws2.eks.EKS2Component;
import org.apache.camel.component.aws2.eks.EKS2Configuration;
import org.apache.camel.component.aws2.eks.EKS2Operations;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.aws2.eventbridge.EventbridgeComponent;`
in `components-starter/camel-aws2-eventbridge-starter/src/main/java/org/apache/camel/component/aws2/eventbridge/springboot/EventbridgeComponentConfiguration.java`
#### Snippet
```java

import javax.annotation.Generated;
import org.apache.camel.component.aws2.eventbridge.EventbridgeComponent;
import org.apache.camel.component.aws2.eventbridge.EventbridgeConfiguration;
import org.apache.camel.component.aws2.eventbridge.EventbridgeOperations;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.aws2.iam.IAM2Component;`
in `components-starter/camel-aws2-iam-starter/src/main/java/org/apache/camel/component/aws2/iam/springboot/IAM2ComponentConfiguration.java`
#### Snippet
```java

import javax.annotation.Generated;
import org.apache.camel.component.aws2.iam.IAM2Component;
import org.apache.camel.component.aws2.iam.IAM2Configuration;
import org.apache.camel.component.aws2.iam.IAM2Operations;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.aws2.firehose.KinesisFirehose2Component;`
in `components-starter/camel-aws2-kinesis-starter/src/main/java/org/apache/camel/component/aws2/firehose/springboot/KinesisFirehose2ComponentConfiguration.java`
#### Snippet
```java

import javax.annotation.Generated;
import org.apache.camel.component.aws2.firehose.KinesisFirehose2Component;
import org.apache.camel.component.aws2.firehose.KinesisFirehose2Configuration;
import org.apache.camel.component.aws2.firehose.KinesisFirehose2Operations;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.aws2.kinesis.Kinesis2Component;`
in `components-starter/camel-aws2-kinesis-starter/src/main/java/org/apache/camel/component/aws2/kinesis/springboot/Kinesis2ComponentConfiguration.java`
#### Snippet
```java

import javax.annotation.Generated;
import org.apache.camel.component.aws2.kinesis.Kinesis2Component;
import org.apache.camel.component.aws2.kinesis.Kinesis2Configuration;
import org.apache.camel.component.aws2.kinesis.Kinesis2ShardClosedStrategyEnum;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.aws2.kms.KMS2Component;`
in `components-starter/camel-aws2-kms-starter/src/main/java/org/apache/camel/component/aws2/kms/springboot/KMS2ComponentConfiguration.java`
#### Snippet
```java

import javax.annotation.Generated;
import org.apache.camel.component.aws2.kms.KMS2Component;
import org.apache.camel.component.aws2.kms.KMS2Configuration;
import org.apache.camel.component.aws2.kms.KMS2Operations;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.aws2.lambda.Lambda2Component;`
in `components-starter/camel-aws2-lambda-starter/src/main/java/org/apache/camel/component/aws2/lambda/springboot/Lambda2ComponentConfiguration.java`
#### Snippet
```java

import javax.annotation.Generated;
import org.apache.camel.component.aws2.lambda.Lambda2Component;
import org.apache.camel.component.aws2.lambda.Lambda2Configuration;
import org.apache.camel.component.aws2.lambda.Lambda2Operations;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.aws2.mq.MQ2Component;`
in `components-starter/camel-aws2-mq-starter/src/main/java/org/apache/camel/component/aws2/mq/springboot/MQ2ComponentConfiguration.java`
#### Snippet
```java

import javax.annotation.Generated;
import org.apache.camel.component.aws2.mq.MQ2Component;
import org.apache.camel.component.aws2.mq.MQ2Configuration;
import org.apache.camel.component.aws2.mq.MQ2Operations;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.aws2.msk.MSK2Component;`
in `components-starter/camel-aws2-msk-starter/src/main/java/org/apache/camel/component/aws2/msk/springboot/MSK2ComponentConfiguration.java`
#### Snippet
```java

import javax.annotation.Generated;
import org.apache.camel.component.aws2.msk.MSK2Component;
import org.apache.camel.component.aws2.msk.MSK2Configuration;
import org.apache.camel.component.aws2.msk.MSK2Operations;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.aws2.s3.AWS2S3Component;`
in `components-starter/camel-aws2-s3-starter/src/main/java/org/apache/camel/component/aws2/s3/springboot/AWS2S3ComponentConfiguration.java`
#### Snippet
```java

import javax.annotation.Generated;
import org.apache.camel.component.aws2.s3.AWS2S3Component;
import org.apache.camel.component.aws2.s3.AWS2S3Configuration;
import org.apache.camel.component.aws2.s3.AWS2S3Operations;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.aws2.ses.Ses2Component;`
in `components-starter/camel-aws2-ses-starter/src/main/java/org/apache/camel/component/aws2/ses/springboot/Ses2ComponentConfiguration.java`
#### Snippet
```java

import javax.annotation.Generated;
import org.apache.camel.component.aws2.ses.Ses2Component;
import org.apache.camel.component.aws2.ses.Ses2Configuration;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.aws2.sns.Sns2Component;`
in `components-starter/camel-aws2-sns-starter/src/main/java/org/apache/camel/component/aws2/sns/springboot/Sns2ComponentConfiguration.java`
#### Snippet
```java

import javax.annotation.Generated;
import org.apache.camel.component.aws2.sns.Sns2Component;
import org.apache.camel.component.aws2.sns.Sns2Configuration;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.aws2.sqs.Sqs2Component;`
in `components-starter/camel-aws2-sqs-starter/src/main/java/org/apache/camel/component/aws2/sqs/springboot/Sqs2ComponentConfiguration.java`
#### Snippet
```java

import javax.annotation.Generated;
import org.apache.camel.component.aws2.sqs.Sqs2Component;
import org.apache.camel.component.aws2.sqs.Sqs2Configuration;
import org.apache.camel.component.aws2.sqs.Sqs2Operations;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.aws2.sts.STS2Component;`
in `components-starter/camel-aws2-sts-starter/src/main/java/org/apache/camel/component/aws2/sts/springboot/STS2ComponentConfiguration.java`
#### Snippet
```java

import javax.annotation.Generated;
import org.apache.camel.component.aws2.sts.STS2Component;
import org.apache.camel.component.aws2.sts.STS2Configuration;
import org.apache.camel.component.aws2.sts.STS2Operations;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.aws2.translate.Translate2Component;`
in `components-starter/camel-aws2-translate-starter/src/main/java/org/apache/camel/component/aws2/translate/springboot/Translate2ComponentConfiguration.java`
#### Snippet
```java

import javax.annotation.Generated;
import org.apache.camel.component.aws2.translate.Translate2Component;
import org.apache.camel.component.aws2.translate.Translate2Configuration;
import org.apache.camel.component.aws2.translate.Translate2Operations;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.azure.cosmosdb.CosmosDbComponent;`
in `components-starter/camel-azure-cosmosdb-starter/src/main/java/org/apache/camel/component/azure/cosmosdb/springboot/CosmosDbComponentConfiguration.java`
#### Snippet
```java
import com.azure.cosmos.models.PartitionKey;
import com.azure.cosmos.models.ThroughputProperties;
import org.apache.camel.component.azure.cosmosdb.CosmosDbComponent;
import org.apache.camel.component.azure.cosmosdb.CosmosDbConfiguration;
import org.apache.camel.component.azure.cosmosdb.CosmosDbOperationsDefinition;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.azure.eventhubs.EventHubsComponent;`
in `components-starter/camel-azure-eventhubs-starter/src/main/java/org/apache/camel/component/azure/eventhubs/springboot/EventHubsComponentConfiguration.java`
#### Snippet
```java
import com.azure.messaging.eventhubs.models.EventPosition;
import com.azure.storage.common.StorageSharedKeyCredential;
import org.apache.camel.component.azure.eventhubs.EventHubsComponent;
import org.apache.camel.component.azure.eventhubs.EventHubsConfiguration;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.azure.servicebus.ServiceBusComponent;`
in `components-starter/camel-azure-servicebus-starter/src/main/java/org/apache/camel/component/azure/servicebus/springboot/ServiceBusComponentConfiguration.java`
#### Snippet
```java
import com.azure.messaging.servicebus.models.ServiceBusReceiveMode;
import com.azure.messaging.servicebus.models.SubQueue;
import org.apache.camel.component.azure.servicebus.ServiceBusComponent;
import org.apache.camel.component.azure.servicebus.ServiceBusConfiguration;
import org.apache.camel.component.azure.servicebus.ServiceBusConsumerOperationDefinition;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.azure.storage.blob.BlobComponent;`
in `components-starter/camel-azure-storage-blob-starter/src/main/java/org/apache/camel/component/azure/storage/blob/springboot/BlobComponentConfiguration.java`
#### Snippet
```java
import com.azure.storage.blob.models.BlockListType;
import com.azure.storage.common.StorageSharedKeyCredential;
import org.apache.camel.component.azure.storage.blob.BlobComponent;
import org.apache.camel.component.azure.storage.blob.BlobConfiguration;
import org.apache.camel.component.azure.storage.blob.BlobOperationsDefinition;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.azure.storage.datalake.DataLakeComponent;`
in `components-starter/camel-azure-storage-datalake-starter/src/main/java/org/apache/camel/component/azure/storage/datalake/springboot/DataLakeComponentConfiguration.java`
#### Snippet
```java
import com.azure.storage.common.StorageSharedKeyCredential;
import com.azure.storage.file.datalake.DataLakeServiceClient;
import org.apache.camel.component.azure.storage.datalake.DataLakeComponent;
import org.apache.camel.component.azure.storage.datalake.DataLakeConfiguration;
import org.apache.camel.component.azure.storage.datalake.DataLakeOperationsDefinition;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-barcode-starter/src/main/java/org/apache/camel/dataformat/barcode/springboot/BarcodeDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-base64-starter/src/main/java/org/apache/camel/dataformat/base64/springboot/Base64DataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.bean.BeanComponent;`
in `components-starter/camel-bean-starter/src/main/java/org/apache/camel/component/bean/springboot/BeanComponentConfiguration.java`
#### Snippet
```java
import javax.annotation.Generated;
import org.apache.camel.BeanScope;
import org.apache.camel.component.bean.BeanComponent;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;
```

### UNUSED_IMPORT
Unused import `import org.springframework.core.convert.converter.GenericConverter;`
in `components-starter/camel-bean-starter/src/main/java/org/apache/camel/component/bean/springboot/BeanComponentConverter.java`
#### Snippet
```java
import org.apache.camel.CamelContext;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.GenericConverter;

/**
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.beanclass.ClassComponent;`
in `components-starter/camel-bean-starter/src/main/java/org/apache/camel/component/beanclass/springboot/ClassComponentConfiguration.java`
#### Snippet
```java
import javax.annotation.Generated;
import org.apache.camel.BeanScope;
import org.apache.camel.component.beanclass.ClassComponent;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;
```

### UNUSED_IMPORT
Unused import `import org.springframework.core.convert.converter.GenericConverter;`
in `components-starter/camel-bean-starter/src/main/java/org/apache/camel/component/beanclass/springboot/ClassComponentConverter.java`
#### Snippet
```java
import org.apache.camel.CamelContext;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.GenericConverter;

/**
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-bean-starter/src/main/java/org/apache/camel/language/bean/springboot/BeanLanguageAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-bindy-starter/src/main/java/org/apache/camel/dataformat/bindy/csv/springboot/BindyCsvDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-bindy-starter/src/main/java/org/apache/camel/dataformat/bindy/fixed/springboot/BindyFixedLengthDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-bindy-starter/src/main/java/org/apache/camel/dataformat/bindy/kvp/springboot/BindyKeyValuePairDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.box.BoxComponent;`
in `components-starter/camel-box-starter/src/main/java/org/apache/camel/component/box/springboot/BoxComponentConfiguration.java`
#### Snippet
```java
import com.box.sdk.EncryptionAlgorithm;
import com.box.sdk.IAccessTokenCache;
import org.apache.camel.component.box.BoxComponent;
import org.apache.camel.component.box.BoxConfiguration;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.caffeine.cache.CaffeineCacheComponent;`
in `components-starter/camel-caffeine-starter/src/main/java/org/apache/camel/component/caffeine/cache/springboot/CaffeineCacheComponentConfiguration.java`
#### Snippet
```java
import org.apache.camel.component.caffeine.CaffeineConfiguration;
import org.apache.camel.component.caffeine.EvictionType;
import org.apache.camel.component.caffeine.cache.CaffeineCacheComponent;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.caffeine.load.CaffeineLoadCacheComponent;`
in `components-starter/camel-caffeine-starter/src/main/java/org/apache/camel/component/caffeine/load/springboot/CaffeineLoadCacheComponentConfiguration.java`
#### Snippet
```java
import org.apache.camel.component.caffeine.CaffeineConfiguration;
import org.apache.camel.component.caffeine.EvictionType;
import org.apache.camel.component.caffeine.load.CaffeineLoadCacheComponent;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-cbor-starter/src/main/java/org/apache/camel/component/cbor/springboot/CBORDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.consul.ConsulComponent;`
in `components-starter/camel-consul-starter/src/main/java/org/apache/camel/component/consul/springboot/ConsulComponentConfiguration.java`
#### Snippet
```java
import com.orbitz.consul.Consul;
import com.orbitz.consul.option.ConsistencyMode;
import org.apache.camel.component.consul.ConsulComponent;
import org.apache.camel.component.consul.ConsulConfiguration;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-core-starter/src/main/java/org/apache/camel/language/constant/springboot/ConstantLanguageAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-core-starter/src/main/java/org/apache/camel/language/csimple/springboot/CSimpleLanguageAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-core-starter/src/main/java/org/apache/camel/language/header/springboot/HeaderLanguageAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-core-starter/src/main/java/org/apache/camel/language/property/springboot/ExchangePropertyLanguageAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-core-starter/src/main/java/org/apache/camel/language/ref/springboot/RefLanguageAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-core-starter/src/main/java/org/apache/camel/language/simple/springboot/FileLanguageAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-core-starter/src/main/java/org/apache/camel/language/simple/springboot/SimpleLanguageAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-core-starter/src/main/java/org/apache/camel/language/tokenizer/springboot/TokenizeLanguageAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.model.rest.RestConfigurationDefinition;`
in `components-starter/camel-core-starter/src/main/java/org/apache/camel/model/rest/springboot/RestConfigurationDefinitionProperties.java`
#### Snippet
```java
import javax.annotation.Generated;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.model.rest.RestConfigurationDefinition;
import org.apache.camel.model.rest.RestHostNameResolver;
import org.springframework.boot.context.properties.ConfigurationProperties;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-crypto-starter/src/main/java/org/apache/camel/converter/crypto/springboot/CryptoDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-crypto-starter/src/main/java/org/apache/camel/converter/crypto/springboot/PGPDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-csv-starter/src/main/java/org/apache/camel/dataformat/csv/springboot/CsvDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-datasonnet-starter/src/main/java/org/apache/camel/language/datasonnet/springboot/DatasonnetLanguageAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.disruptor.DisruptorComponent;`
in `components-starter/camel-disruptor-starter/src/main/java/org/apache/camel/component/disruptor/springboot/DisruptorComponentConfiguration.java`
#### Snippet
```java

import javax.annotation.Generated;
import org.apache.camel.component.disruptor.DisruptorComponent;
import org.apache.camel.component.disruptor.DisruptorProducerType;
import org.apache.camel.component.disruptor.DisruptorWaitStrategy;
```

### UNUSED_IMPORT
Unused import `import org.springframework.core.convert.converter.GenericConverter;`
in `components-starter/camel-disruptor-starter/src/main/java/org/apache/camel/component/disruptor/springboot/DisruptorComponentConverter.java`
#### Snippet
```java
import org.apache.camel.CamelContext;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.GenericConverter;

/**
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.disruptor.vm.DisruptorVmComponent;`
in `components-starter/camel-disruptor-starter/src/main/java/org/apache/camel/component/disruptor/vm/springboot/DisruptorVmComponentConfiguration.java`
#### Snippet
```java
import org.apache.camel.component.disruptor.DisruptorProducerType;
import org.apache.camel.component.disruptor.DisruptorWaitStrategy;
import org.apache.camel.component.disruptor.vm.DisruptorVmComponent;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;
```

### UNUSED_IMPORT
Unused import `import org.springframework.core.convert.converter.GenericConverter;`
in `components-starter/camel-disruptor-starter/src/main/java/org/apache/camel/component/disruptor/vm/springboot/DisruptorVmComponentConverter.java`
#### Snippet
```java
import org.apache.camel.CamelContext;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.GenericConverter;

/**
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.ehcache.EhcacheComponent;`
in `components-starter/camel-ehcache-starter/src/main/java/org/apache/camel/component/ehcache/springboot/EhcacheComponentConfiguration.java`
#### Snippet
```java
import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.component.ehcache.EhcacheComponent;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.ehcache.CacheManager;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.ehcache.springboot.EhcacheComponentAutoConfiguration;`
in `components-starter/camel-ehcache-starter/src/main/java/org/apache/camel/component/ehcache/springboot/customizer/CacheManagerCustomizer.java`
#### Snippet
```java
import org.apache.camel.Ordered;
import org.apache.camel.component.ehcache.EhcacheComponent;
import org.apache.camel.component.ehcache.springboot.EhcacheComponentAutoConfiguration;
import org.apache.camel.spi.ComponentCustomizer;
import org.apache.camel.spi.HasId;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.autoconfigure.AutoConfigureBefore;`
in `components-starter/camel-ehcache-starter/src/main/java/org/apache/camel/component/ehcache/springboot/customizer/CacheManagerCustomizer.java`
#### Snippet
```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-fastjson-starter/src/main/java/org/apache/camel/component/fastjson/springboot/FastjsonDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-fhir-starter/src/main/java/org/apache/camel/component/fhir/springboot/FhirJsonDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-fhir-starter/src/main/java/org/apache/camel/component/fhir/springboot/FhirXmlDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-flatpack-starter/src/main/java/org/apache/camel/dataformat/flatpack/springboot/FlatpackDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-grok-starter/src/main/java/org/apache/camel/component/grok/springboot/GrokDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-groovy-starter/src/main/java/org/apache/camel/language/groovy/springboot/GroovyLanguageAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-gson-starter/src/main/java/org/apache/camel/component/gson/springboot/GsonDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-hl7-starter/src/main/java/org/apache/camel/component/hl7/springboot/HL7DataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-hl7-starter/src/main/java/org/apache/camel/component/hl7/springboot/Hl7TerserLanguageAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-ical-starter/src/main/java/org/apache/camel/component/ical/springboot/ICalDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedComponent;`
in `components-starter/camel-infinispan-embedded-starter/src/main/java/org/apache/camel/component/infinispan/embedded/springboot/InfinispanEmbeddedComponentConfiguration.java`
#### Snippet
```java
import org.apache.camel.component.infinispan.InfinispanOperation;
import org.apache.camel.component.infinispan.InfinispanQueryBuilder;
import org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedComponent;
import org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedConfiguration;
import org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedCustomListener;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.infinispan.remote.InfinispanRemoteComponent;`
in `components-starter/camel-infinispan-starter/src/main/java/org/apache/camel/component/infinispan/remote/springboot/InfinispanRemoteComponentConfiguration.java`
#### Snippet
```java
import org.apache.camel.component.infinispan.InfinispanOperation;
import org.apache.camel.component.infinispan.InfinispanQueryBuilder;
import org.apache.camel.component.infinispan.remote.InfinispanRemoteComponent;
import org.apache.camel.component.infinispan.remote.InfinispanRemoteConfiguration;
import org.apache.camel.component.infinispan.remote.InfinispanRemoteCustomListener;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-jackson-avro-starter/src/main/java/org/apache/camel/component/jackson/avro/springboot/JacksonAvroDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-jackson-protobuf-starter/src/main/java/org/apache/camel/component/jackson/protobuf/springboot/JacksonProtobufDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-jackson-starter/src/main/java/org/apache/camel/component/jackson/springboot/JacksonDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-jacksonxml-starter/src/main/java/org/apache/camel/component/jacksonxml/springboot/JacksonXMLDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-javascript-starter/src/main/java/org/apache/camel/language/js/springboot/JavaScriptLanguageAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-jaxb-starter/src/main/java/org/apache/camel/converter/jaxb/springboot/JaxbDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-johnzon-starter/src/main/java/org/apache/camel/component/johnzon/springboot/JohnzonDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.jooq.JooqComponent;`
in `components-starter/camel-jooq-starter/src/main/java/org/apache/camel/component/jooq/springboot/JooqComponentConfiguration.java`
#### Snippet
```java

import javax.annotation.Generated;
import org.apache.camel.component.jooq.JooqComponent;
import org.apache.camel.component.jooq.JooqConfiguration;
import org.apache.camel.component.jooq.JooqOperation;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-joor-starter/src/main/java/org/apache/camel/language/joor/springboot/JoorLanguageAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-jq-starter/src/main/java/org/apache/camel/language/jq/springboot/JqLanguageAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-jsonapi-starter/src/main/java/org/apache/camel/component/jsonapi/springboot/JsonApiDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-jsonb-starter/src/main/java/org/apache/camel/component/jsonb/springboot/JsonbDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-jsonpath-starter/src/main/java/org/apache/camel/jsonpath/springboot/JsonPathLanguageAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.kafka.KafkaComponent;`
in `components-starter/camel-kafka-starter/src/main/java/org/apache/camel/component/kafka/springboot/KafkaComponentConfiguration.java`
#### Snippet
```java
import javax.annotation.Generated;
import org.apache.camel.component.kafka.KafkaClientFactory;
import org.apache.camel.component.kafka.KafkaComponent;
import org.apache.camel.component.kafka.KafkaConfiguration;
import org.apache.camel.component.kafka.PollExceptionStrategy;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `components-starter/camel-lra-starter/src/main/java/org/apache/camel/service/lra/springboot/LraServiceAutoConfiguration.java`
#### Snippet
```java
package org.apache.camel.service.lra.springboot;

import java.util.HashMap;
import java.util.Map;

```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `components-starter/camel-lra-starter/src/main/java/org/apache/camel/service/lra/springboot/LraServiceAutoConfiguration.java`
#### Snippet
```java

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.spring.boot.util.CamelPropertiesHelper;`
in `components-starter/camel-lra-starter/src/main/java/org/apache/camel/service/lra/springboot/LraServiceAutoConfiguration.java`
#### Snippet
```java
import org.apache.camel.service.lra.LRASagaService;
import org.apache.camel.spring.boot.CamelAutoConfiguration;
import org.apache.camel.spring.boot.util.CamelPropertiesHelper;
import org.apache.camel.spring.boot.util.ConditionalOnCamelContextAndAutoConfigurationBeans;
import org.apache.camel.spring.boot.util.GroupCondition;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.support.IntrospectionSupport;`
in `components-starter/camel-lra-starter/src/main/java/org/apache/camel/service/lra/springboot/LraServiceAutoConfiguration.java`
#### Snippet
```java
import org.apache.camel.spring.boot.util.ConditionalOnCamelContextAndAutoConfigurationBeans;
import org.apache.camel.spring.boot.util.GroupCondition;
import org.apache.camel.support.IntrospectionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-lzf-starter/src/main/java/org/apache/camel/dataformat/lzf/springboot/LZFDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-mail-starter/src/main/java/org/apache/camel/dataformat/mime/multipart/springboot/MimeMultipartDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.mina.MinaComponent;`
in `components-starter/camel-mina-starter/src/main/java/org/apache/camel/component/mina/springboot/MinaComponentConfiguration.java`
#### Snippet
```java
import javax.annotation.Generated;
import org.apache.camel.LoggingLevel;
import org.apache.camel.component.mina.MinaComponent;
import org.apache.camel.component.mina.MinaConfiguration;
import org.apache.camel.component.mina.MinaTextLineDelimiter;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.mllp.MllpComponent;`
in `components-starter/camel-mllp-starter/src/main/java/org/apache/camel/component/mllp/springboot/MllpComponentConfiguration.java`
#### Snippet
```java
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.component.mllp.MllpComponent;
import org.apache.camel.component.mllp.MllpConfiguration;
import org.apache.camel.component.mllp.MllpIdleTimeoutStrategy;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-mvel-starter/src/main/java/org/apache/camel/language/mvel/springboot/MvelLanguageAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.netty.http.NettyHttpComponent;`
in `components-starter/camel-netty-http-starter/src/main/java/org/apache/camel/component/netty/http/springboot/NettyHttpComponentConfiguration.java`
#### Snippet
```java
import org.apache.camel.component.netty.ServerInitializerFactory;
import org.apache.camel.component.netty.http.NettyHttpBinding;
import org.apache.camel.component.netty.http.NettyHttpComponent;
import org.apache.camel.component.netty.http.NettyHttpSecurityConfiguration;
import org.apache.camel.spi.HeaderFilterStrategy;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.netty.NettyComponent;`
in `components-starter/camel-netty-starter/src/main/java/org/apache/camel/component/netty/springboot/NettyComponentConfiguration.java`
#### Snippet
```java
import org.apache.camel.component.netty.ClientInitializerFactory;
import org.apache.camel.component.netty.NettyCamelStateCorrelationManager;
import org.apache.camel.component.netty.NettyComponent;
import org.apache.camel.component.netty.NettyConfiguration;
import org.apache.camel.component.netty.NettyServerBootstrapFactory;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-ognl-starter/src/main/java/org/apache/camel/language/ognl/springboot/OgnlLanguageAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.paho.mqtt5.PahoMqtt5Component;`
in `components-starter/camel-paho-mqtt5-starter/src/main/java/org/apache/camel/component/paho/mqtt5/springboot/PahoMqtt5ComponentConfiguration.java`
#### Snippet
```java
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import org.apache.camel.component.paho.mqtt5.PahoMqtt5Component;
import org.apache.camel.component.paho.mqtt5.PahoMqtt5Configuration;
import org.apache.camel.component.paho.mqtt5.PahoMqtt5Persistence;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.paho.PahoComponent;`
in `components-starter/camel-paho-starter/src/main/java/org/apache/camel/component/paho/springboot/PahoComponentConfiguration.java`
#### Snippet
```java
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import org.apache.camel.component.paho.PahoComponent;
import org.apache.camel.component.paho.PahoConfiguration;
import org.apache.camel.component.paho.PahoPersistence;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-protobuf-starter/src/main/java/org/apache/camel/dataformat/protobuf/springboot/ProtobufDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.pulsar.PulsarComponent;`
in `components-starter/camel-pulsar-starter/src/main/java/org/apache/camel/component/pulsar/springboot/PulsarComponentConfiguration.java`
#### Snippet
```java

import javax.annotation.Generated;
import org.apache.camel.component.pulsar.PulsarComponent;
import org.apache.camel.component.pulsar.PulsarConfiguration;
import org.apache.camel.component.pulsar.PulsarMessageReceiptFactory;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-python-starter/src/main/java/org/apache/camel/language/python/springboot/PythonLanguageAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.reactive.streams.ReactiveStreamsComponent;`
in `components-starter/camel-reactive-streams-starter/src/main/java/org/apache/camel/component/reactive/streams/springboot/ReactiveStreamsComponentConfiguration.java`
#### Snippet
```java
import javax.annotation.Generated;
import org.apache.camel.component.reactive.streams.ReactiveStreamsBackpressureStrategy;
import org.apache.camel.component.reactive.streams.ReactiveStreamsComponent;
import org.apache.camel.component.reactive.streams.engine.ReactiveStreamsEngineConfiguration;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-rss-starter/src/main/java/org/apache/camel/dataformat/rss/springboot/RssDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.salesforce.SalesforceComponent;`
in `components-starter/camel-salesforce-starter/src/main/java/org/apache/camel/component/salesforce/springboot/SalesforceComponentConfiguration.java`
#### Snippet
```java
import org.apache.camel.component.salesforce.AuthenticationType;
import org.apache.camel.component.salesforce.NotFoundBehaviour;
import org.apache.camel.component.salesforce.SalesforceComponent;
import org.apache.camel.component.salesforce.SalesforceEndpointConfig;
import org.apache.camel.component.salesforce.SalesforceHttpClient;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-saxon-starter/src/main/java/org/apache/camel/language/xquery/springboot/XQueryLanguageAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.servicenow.ServiceNowComponent;`
in `components-starter/camel-servicenow-starter/src/main/java/org/apache/camel/component/servicenow/springboot/ServiceNowComponentConfiguration.java`
#### Snippet
```java
import javax.annotation.Generated;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.camel.component.servicenow.ServiceNowComponent;
import org.apache.camel.component.servicenow.ServiceNowConfiguration;
import org.apache.camel.component.servicenow.ServiceNowRelease;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.smpp.SmppComponent;`
in `components-starter/camel-smpp-starter/src/main/java/org/apache/camel/component/smpp/springboot/SmppComponentConfiguration.java`
#### Snippet
```java
import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.component.smpp.SmppComponent;
import org.apache.camel.component.smpp.SmppConfiguration;
import org.apache.camel.component.smpp.SmppSplittingPolicy;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-snakeyaml-starter/src/main/java/org/apache/camel/component/snakeyaml/springboot/SnakeYAMLDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-soap-starter/src/main/java/org/apache/camel/dataformat/soap/springboot/SoapDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-spring-starter/src/main/java/org/apache/camel/language/spel/springboot/SpelLanguageAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-stax-starter/src/main/java/org/apache/camel/language/xtokenizer/springboot/XMLTokenizeLanguageAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.component.stitch.StitchComponent;`
in `components-starter/camel-stitch-starter/src/main/java/org/apache/camel/component/stitch/springboot/StitchComponentConfiguration.java`
#### Snippet
```java

import javax.annotation.Generated;
import org.apache.camel.component.stitch.StitchComponent;
import org.apache.camel.component.stitch.StitchConfiguration;
import org.apache.camel.component.stitch.client.StitchClient;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-swift-starter/src/main/java/org/apache/camel/dataformat/swift/mt/springboot/SwiftMtDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-swift-starter/src/main/java/org/apache/camel/dataformat/swift/mx/springboot/SwiftMxDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-syslog-starter/src/main/java/org/apache/camel/component/syslog/springboot/SyslogDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-tarfile-starter/src/main/java/org/apache/camel/dataformat/tarfile/springboot/TarFileDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-thrift-starter/src/main/java/org/apache/camel/dataformat/thrift/springboot/ThriftDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-univocity-parsers-starter/src/main/java/org/apache/camel/dataformat/univocity/springboot/UniVocityCsvDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-univocity-parsers-starter/src/main/java/org/apache/camel/dataformat/univocity/springboot/UniVocityFixedDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-univocity-parsers-starter/src/main/java/org/apache/camel/dataformat/univocity/springboot/UniVocityTsvDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-xmlsecurity-starter/src/main/java/org/apache/camel/dataformat/xmlsecurity/springboot/XMLSecurityDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-xpath-starter/src/main/java/org/apache/camel/language/xpath/springboot/XPathLanguageAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-xstream-starter/src/main/java/org/apache/camel/dataformat/xstream/springboot/JsonDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-xstream-starter/src/main/java/org/apache/camel/dataformat/xstream/springboot/XStreamDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-zip-deflater-starter/src/main/java/org/apache/camel/dataformat/deflater/springboot/GzipDeflaterDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-zip-deflater-starter/src/main/java/org/apache/camel/dataformat/deflater/springboot/ZipDeflaterDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.convert.ApplicationConversionService;`
in `components-starter/camel-zipfile-starter/src/main/java/org/apache/camel/dataformat/zipfile/springboot/ZipFileDataFormatAutoConfiguration.java`
#### Snippet
```java
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.spring.boot.actuate.endpoint.CamelRouteControllerEndpoint;`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/console/CamelDevConsoleAutoConfiguration.java`
#### Snippet
```java
import org.apache.camel.CamelContext;
import org.apache.camel.spring.boot.CamelAutoConfiguration;
import org.apache.camel.spring.boot.actuate.endpoint.CamelRouteControllerEndpoint;
import org.springframework.boot.actuate.autoconfigure.endpoint.condition.ConditionalOnAvailableEndpoint;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
```

### UNUSED_IMPORT
Unused import `import org.springframework.boot.actuate.autoconfigure.endpoint.condition.ConditionalOnAvailableEndpo...`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/console/CamelDevConsoleAutoConfiguration.java`
#### Snippet
```java
import org.apache.camel.spring.boot.CamelAutoConfiguration;
import org.apache.camel.spring.boot.actuate.endpoint.CamelRouteControllerEndpoint;
import org.springframework.boot.actuate.autoconfigure.endpoint.condition.ConditionalOnAvailableEndpoint;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
```

### UNUSED_IMPORT
Unused import `import java.util.TreeMap;`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/health/CamelHealthHelper.java`
#### Snippet
```java
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

final class CamelHealthHelper {
```

### UNUSED_IMPORT
Unused import `import java.util.concurrent.TimeUnit;`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cloud/CamelCloudServiceDiscovery.java`
#### Snippet
```java

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.camel.cloud.ServiceDefinition;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.spi.Metadata;`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/vault/AzureVaultConfigurationProperties.java`
#### Snippet
```java
package org.apache.camel.spring.boot.vault;

import org.apache.camel.spi.Metadata;
import org.springframework.boot.context.properties.ConfigurationProperties;

```

### UNUSED_IMPORT
Unused import `import org.apache.camel.spi.Metadata;`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/vault/GcpVaultConfigurationProperties.java`
#### Snippet
```java
package org.apache.camel.spring.boot.vault;

import org.apache.camel.spi.Metadata;
import org.springframework.boot.context.properties.ConfigurationProperties;

```

### UNUSED_IMPORT
Unused import `import org.apache.camel.spring.spi.SpringInjector;`
in `core/camel-spring-boot-xml/src/main/java/org/apache/camel/spring/boot/xml/SpringBootXmlCamelContextConfigurer.java`
#### Snippet
```java
import org.apache.camel.spring.boot.CamelAutoConfiguration;
import org.apache.camel.spring.boot.CamelConfigurationProperties;
import org.apache.camel.spring.spi.SpringInjector;
import org.apache.camel.spring.xml.XmlCamelContextConfigurer;
import org.slf4j.Logger;
```

### UNUSED_IMPORT
Unused import `import org.springframework.context.ConfigurableApplicationContext;`
in `core/camel-spring-boot-xml/src/main/java/org/apache/camel/spring/boot/xml/SpringBootXmlCamelContextConfigurer.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

/**
```

### UNUSED_IMPORT
Unused import `import java.io.FileInputStream;`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/UpdateSpringBootAutoConfigurationReadmeMojo.java`
#### Snippet
```java

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
```

### UNUSED_IMPORT
Unused import `import java.io.FileReader;`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/UpdateSpringBootAutoConfigurationReadmeMojo.java`
#### Snippet
```java
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
```

### UNUSED_IMPORT
Unused import `import java.nio.charset.StandardCharsets;`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/UpdateSpringBootAutoConfigurationReadmeMojo.java`
#### Snippet
```java
import java.io.FileInputStream;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.io.IOException;
```

### UNUSED_IMPORT
Unused import `import java.io.IOException;`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/UpdateSpringBootAutoConfigurationReadmeMojo.java`
#### Snippet
```java
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/UpdateSpringBootAutoConfigurationReadmeMojo.java`
#### Snippet
```java
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import java.util.Collections;`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/UpdateSpringBootAutoConfigurationReadmeMojo.java`
#### Snippet
```java
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/UpdateSpringBootAutoConfigurationReadmeMojo.java`
#### Snippet
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.camel.maven.packaging.MvelHelper;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.maven.packaging.MvelHelper;`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/UpdateSpringBootAutoConfigurationReadmeMojo.java`
#### Snippet
```java
import java.util.List;

import org.apache.camel.maven.packaging.MvelHelper;
import org.apache.camel.springboot.maven.model.SpringBootAutoConfigureOptionModel;
import org.apache.camel.springboot.maven.model.SpringBootModel;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.springboot.maven.model.SpringBootAutoConfigureOptionModel;`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/UpdateSpringBootAutoConfigurationReadmeMojo.java`
#### Snippet
```java

import org.apache.camel.maven.packaging.MvelHelper;
import org.apache.camel.springboot.maven.model.SpringBootAutoConfigureOptionModel;
import org.apache.camel.springboot.maven.model.SpringBootModel;
import org.apache.camel.tooling.util.Strings;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.springboot.maven.model.SpringBootModel;`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/UpdateSpringBootAutoConfigurationReadmeMojo.java`
#### Snippet
```java
import org.apache.camel.maven.packaging.MvelHelper;
import org.apache.camel.springboot.maven.model.SpringBootAutoConfigureOptionModel;
import org.apache.camel.springboot.maven.model.SpringBootModel;
import org.apache.camel.tooling.util.Strings;
import org.apache.camel.util.json.DeserializationException;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.tooling.util.Strings;`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/UpdateSpringBootAutoConfigurationReadmeMojo.java`
#### Snippet
```java
import org.apache.camel.springboot.maven.model.SpringBootAutoConfigureOptionModel;
import org.apache.camel.springboot.maven.model.SpringBootModel;
import org.apache.camel.tooling.util.Strings;
import org.apache.camel.util.json.DeserializationException;
import org.apache.camel.util.json.JsonArray;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.util.json.DeserializationException;`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/UpdateSpringBootAutoConfigurationReadmeMojo.java`
#### Snippet
```java
import org.apache.camel.springboot.maven.model.SpringBootModel;
import org.apache.camel.tooling.util.Strings;
import org.apache.camel.util.json.DeserializationException;
import org.apache.camel.util.json.JsonArray;
import org.apache.camel.util.json.JsonObject;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.util.json.JsonArray;`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/UpdateSpringBootAutoConfigurationReadmeMojo.java`
#### Snippet
```java
import org.apache.camel.tooling.util.Strings;
import org.apache.camel.util.json.DeserializationException;
import org.apache.camel.util.json.JsonArray;
import org.apache.camel.util.json.JsonObject;
import org.apache.camel.util.json.Jsoner;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.util.json.JsonObject;`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/UpdateSpringBootAutoConfigurationReadmeMojo.java`
#### Snippet
```java
import org.apache.camel.util.json.DeserializationException;
import org.apache.camel.util.json.JsonArray;
import org.apache.camel.util.json.JsonObject;
import org.apache.camel.util.json.Jsoner;
import org.apache.maven.plugin.AbstractMojo;
```

### UNUSED_IMPORT
Unused import `import org.apache.camel.util.json.Jsoner;`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/UpdateSpringBootAutoConfigurationReadmeMojo.java`
#### Snippet
```java
import org.apache.camel.util.json.JsonArray;
import org.apache.camel.util.json.JsonObject;
import org.apache.camel.util.json.Jsoner;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
```

### UNUSED_IMPORT
Unused import `import org.mvel2.templates.TemplateRuntime;`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/UpdateSpringBootAutoConfigurationReadmeMojo.java`
#### Snippet
```java
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.mvel2.templates.TemplateRuntime;
import org.sonatype.plexus.build.incremental.BuildContext;

```

### UNUSED_IMPORT
Unused import `import static org.apache.camel.tooling.util.PackageHelper.loadText;`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/UpdateSpringBootAutoConfigurationReadmeMojo.java`
#### Snippet
```java


import static org.apache.camel.tooling.util.PackageHelper.loadText;
import static org.apache.camel.tooling.util.PackageHelper.writeText;

```

### UNUSED_IMPORT
Unused import `import static org.apache.camel.tooling.util.PackageHelper.writeText;`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/UpdateSpringBootAutoConfigurationReadmeMojo.java`
#### Snippet
```java

import static org.apache.camel.tooling.util.PackageHelper.loadText;
import static org.apache.camel.tooling.util.PackageHelper.writeText;

/**
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/FatJarPackageScanClassResolver.java`
#### Snippet
```java

            JarEntry entry;
            while ((entry = jarStream.getNextJarEntry()) != null) {
                String name = entry.getName();

```

### NestedAssignment
Result of assignment expression used
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/FatJarPackageScanResourceResolver.java`
#### Snippet
```java

            JarEntry entry;
            while ((entry = jarStream.getNextJarEntry()) != null) {
                String name = entry.getName().trim();
                if (inspectNestedJars && !entry.isDirectory() && isSpringBootNestedJar(name)) {
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`uri = uri + p` could be simplified to 'uri += p'
in `components-starter/camel-micrometer-starter/src/main/java/org/apache/camel/component/micrometer/springboot/MicrometerTagsAutoConfiguration.java`
#### Snippet
```java
                    String p = request.getPathInfo();
                    if (p != null) {
                        uri = uri + p;
                    }
                }
```

### ReplaceAssignmentWithOperatorAssignment
`line = line + ",\\"` could be simplified to 'line += ",\\\\"'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
                        if (!line.trim().isEmpty()) {
                            // adjust existing line so its being continued
                            line = line + ",\\";
                            lines.set(i, line);
                            lastLine = i;
```

### ReplaceAssignmentWithOperatorAssignment
`desc = desc + "."` could be simplified to 'desc += "."'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
                if (complex) {
                    if (!desc.endsWith(".")) {
                        desc = desc + ".";
                    }
                    desc = desc + " The option is a " + option.getJavaType() + " type.";
```

### ReplaceAssignmentWithOperatorAssignment
`value = value + "L"` could be simplified to 'value += "L"'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
                    // duration is either long or int java type
                    if ("long".equals(option.getJavaType()) || "java.lang.Long".equals(option.getJavaType())) {
                        value = value + "L";
                    }
                    prop.getField().setLiteralInitializer(value);
```

### ReplaceAssignmentWithOperatorAssignment
`desc = desc + "."` could be simplified to 'desc += "."'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
                if (complex) {
                    if (!desc.endsWith(".")) {
                        desc = desc + ".";
                    }
                    desc = desc + " The option is a " + option.getJavaType() + " type.";
```

### ReplaceAssignmentWithOperatorAssignment
`desc = desc + "."` could be simplified to 'desc += "."'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
                if (complex) {
                    if (!desc.endsWith(".")) {
                        desc = desc + ".";
                    }
                    desc = desc + " The option is a " + option.getJavaType() + " type.";
```

### ReplaceAssignmentWithOperatorAssignment
`milliseconds = milliseconds + (3600000 * Long.valueOf(matcher.group(1)))` could be simplified to 'milliseconds += (3600000 \* Long.valueOf(matcher.group(1)))'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cluster/TimePatternConverter.java`
#### Snippet
```java
            matcher = createMatcher(HOUR_REGEX_PATTERN, source);
            if (matcher.find()) {
                milliseconds = milliseconds + (3600000 * Long.valueOf(matcher.group(1)));
                foundFlag = true;
            }
```

### ReplaceAssignmentWithOperatorAssignment
`milliseconds = milliseconds + (60000 * minutes)` could be simplified to 'milliseconds += (60000 \* minutes)'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cluster/TimePatternConverter.java`
#### Snippet
```java
                }
                foundFlag = true;
                milliseconds = milliseconds + (60000 * minutes);
            }

```

### ReplaceAssignmentWithOperatorAssignment
`milliseconds = milliseconds + (1000 * seconds)` could be simplified to 'milliseconds += (1000 \* seconds)'
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/cluster/TimePatternConverter.java`
#### Snippet
```java
                }
                foundFlag = true;
                milliseconds = milliseconds + (1000 * seconds);
            }

```

## RuleId[ruleID=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        // we need complex types only which unique types only
        Stream<String> s = model.getOptions().stream().filter(this::isComplexType).map(SpringBootAutoConfigurationMojo::getJavaType).distinct();
        s.forEach(type -> {
            sb.append("    case \"").append(type).append("\": return applicationContext.getBean(ref, ").append(type).append(".class);\n");
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        // we need complex types only which unique types only
        Stream<String> s = model.getOptions().stream().filter(this::isComplexType).map(SpringBootAutoConfigurationMojo::getJavaType).distinct();
        s.forEach(type -> {
            sb.append("    case \"").append(type).append("\": return applicationContext.getBean(ref, ").append(type).append(".class);\n");
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        // we need complex types only which unique types only
        Stream<String> s = model.getComponentOptions().stream().filter(this::isComplexType).map(SpringBootAutoConfigurationMojo::getJavaType).distinct();
        s.forEach(type -> {
            sb.append("    case \"").append(type).append("\": return applicationContext.getBean(ref, ").append(type).append(".class);\n");
        });
```

## RuleId[ruleID=Convert2Lambda]
### Convert2Lambda
Anonymous new ServletContextInitializer() can be replaced with lambda
in `components-starter/camel-websocket-jsr356-starter/src/main/java/org/apache/camel/websocket/jsr356/springboot/JSR356WebSocketContextListenerAutoConfiguration.java`
#### Snippet
```java
    @Bean
    public ServletContextInitializer jsr356ServletContextInitializer() {
        return new ServletContextInitializer() {
            @Override
            public void onStartup(ServletContext servletContext) throws ServletException {
```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
Method only calls its super
in `components-starter/camel-platform-http-starter/src/main/java/org/apache/camel/component/platform/http/springboot/ServletPlatformHttpEngine.java`
#### Snippet
```java

	@Override
	public int getServerPort() {
		return PlatformHttpEngine.super.getServerPort();
	}
```

### EmptyMethod
The method is empty
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
    }

    private static void sortImports(JavaClass importer) {
        // sort imports
        // do nothing, as imports are sorted automatically when displayed
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `components-starter/camel-zookeeper-starter/src/main/java/org/apache/camel/component/zookeeper/springboot/cluster/ZooKeeperClusterServiceConfiguration.java`
#### Snippet
```java
     * Sets if the zookeeper cluster service should be enabled or not, default is false.
     */
    private boolean enabled = false;

    /**
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `contextPath`
in `components-starter/camel-springdoc-starter/src/main/java/org/apache/camel/springboot/springdoc/SpringdocAutoConfiguration.java`
#### Snippet
```java
    private String getBasePath(String springContextPath, Object basePath, String contextPath) {
        if (contextPath == null) {
            contextPath = (String)basePath; // could still be null
        }
        if (contextPath != null && !contextPath.isEmpty()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `version`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/BomDependenciesGeneratorMojo.java`
#### Snippet
```java
                        resolved = resolveVersion(project, resolved);
                    }
                    version = version.substring(0, start) + resolved + version.substring(end + 1);
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `file`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/AbstractSpringBootGenerator.java`
#### Snippet
```java
    protected void writeIfChanged(String content, File file) throws IOException {
        boolean write = true;
        file = file.getCanonicalFile();
        if (file.exists()) {
            try (FileReader fr = new FileReader(file)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `loadClassName`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
                    throw new MojoFailureException(e.getMessage(), e);
                } else {
                    loadClassName = loadClassName.substring(0, dotIndex) + "$" + loadClassName.substring(dotIndex + 1);
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `pattern`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
    private String convertDurationToMills(String pattern) {
        String value;
        pattern = pattern.toLowerCase();
        if (pattern.contains("ms")) {
            pattern = pattern.replaceAll("ms", "");
```

### AssignmentToMethodParameter
Assignment to method parameter `pattern`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        pattern = pattern.toLowerCase();
        if (pattern.contains("ms")) {
            pattern = pattern.replaceAll("ms", "");
        }
        try {
```

### AssignmentToMethodParameter
Assignment to method parameter `sourceCode`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        int idx = sourceCode.indexOf("public void set" + StringUtils.capitalize(name) + "(");
        if (idx > 0) {
            sourceCode = sourceCode.substring(0, idx);
            idx = sourceCode.lastIndexOf("/**");
            if (idx > 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `sourceCode`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
            idx = sourceCode.lastIndexOf("/**");
            if (idx > 0) {
                sourceCode = sourceCode.substring(idx + 3);
                idx = sourceCode.indexOf("*/");
                if (idx > 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `sourceCode`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
                idx = sourceCode.indexOf("*/");
                if (idx > 0) {
                    sourceCode = sourceCode.substring(0, idx);
                    List<String> lines = Stream.of(sourceCode.split("\n")).map(String::trim).map(s -> s.startsWith("*") ? s.substring(1) : s).map(String::trim)
                            .filter(s -> !s.isEmpty()).collect(Collectors.toList());
```

### AssignmentToMethodParameter
Assignment to method parameter `sourceCode`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
                        lastLine++;
                    }
                    sourceCode = lines.subList(0, lastLine).stream().map(s -> s.replaceAll("  ", " ")).map(String::trim).filter(s -> !s.isEmpty()).collect(Collectors.joining(" "));
                    return sourceCode;
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
        String wrapper = PRIMITIVEMAP.get(type);
        if (wrapper != null) {
            type = wrapper;
        }
        return type;
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/FatJarPackageScanClassResolver.java`
#### Snippet
```java
        // Classes inside BOOT-INF/classes will be loaded by the new classloader as if they were in the root
        if (name.startsWith(SPRING_BOOT_BOOT_INF_CLASSES_ROOT)) {
            name = name.substring(SPRING_BOOT_BOOT_INF_CLASSES_ROOT.length());
        }
        if (name.startsWith(SPRING_BOOT_WEB_INF_CLASSES_ROOT)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/FatJarPackageScanClassResolver.java`
#### Snippet
```java
        }
        if (name.startsWith(SPRING_BOOT_WEB_INF_CLASSES_ROOT)) {
            name = name.substring(SPRING_BOOT_WEB_INF_CLASSES_ROOT.length());
        }
        return name;
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/FatJarPackageScanResourceResolver.java`
#### Snippet
```java
        // Classes inside BOOT-INF/classes will be loaded by the new classloader as if they were in the root
        if (name.startsWith(SPRING_BOOT_BOOT_INF_CLASSES_ROOT)) {
            name = name.substring(SPRING_BOOT_BOOT_INF_CLASSES_ROOT.length());
        }
        if (name.startsWith(SPRING_BOOT_WEB_INF_CLASSES_ROOT)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/FatJarPackageScanResourceResolver.java`
#### Snippet
```java
        }
        if (name.startsWith(SPRING_BOOT_WEB_INF_CLASSES_ROOT)) {
            name = name.substring(SPRING_BOOT_WEB_INF_CLASSES_ROOT.length());
        }
        return name;
```

### AssignmentToMethodParameter
Assignment to method parameter `config`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/health/CamelHealthCheckAutoConfiguration.java`
#### Snippet
```java
            }
            if (config == null) {
                config = new CamelHealthCheckConfigurationProperties();
            }

```

## RuleId[ruleID=RedundantExplicitClose]
### RedundantExplicitClose
Redundant 'close()'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/BomGeneratorMojo.java`
#### Snippet
```java
                if (!content.equals(oldContent)) {
                    getLog().info("File: " + file.getAbsolutePath() + " is updated");
                    fr.close();
                } else {
                    getLog().info("File " + file.getAbsolutePath() + " is not changed");
```

### RedundantExplicitClose
Redundant 'close()'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/BomDependenciesGeneratorMojo.java`
#### Snippet
```java
                if (!content.equals(oldContent)) {
                    getLog().info("File: " + file.getAbsolutePath() + " is updated");
                    fr.close();
                } else {
                    getLog().info("File " + file.getAbsolutePath() + " is not changed");
```

### RedundantExplicitClose
Redundant 'close()'
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/AbstractSpringBootGenerator.java`
#### Snippet
```java
                if (!content.equals(oldContent)) {
                    getLog().debug("Writing new file " + file.getAbsolutePath());
                    fr.close();
                } else {
                    getLog().debug("File " + file.getAbsolutePath() + " has been left unchanged");
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `dsl-starter/camel-cli-connector-starter/src/main/java/org/apache/camel/springboot/cli/connector/SpringCliConnectorFactory.java`
#### Snippet
```java
            return new SpringLocalCliConnector(this, applicationContext);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `components-starter/camel-springdoc-starter/src/main/java/org/apache/camel/springboot/springdoc/SpringdocAutoConfiguration.java`
#### Snippet
```java
        final List<RestDefinition> rests = resolver.getRestDefinitions(camelContext, null);
        if (rests == null || rests.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootStarterMojo.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/AbstractSpringBootGenerator.java`
#### Snippet
```java
            return new JarFile(a.getFile());
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/AbstractSpringBootGenerator.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
                Artifact mainDep = project.getArtifactMap().get(getMainDepGroupId() + ":" + getMainDepArtifactId());
                if (url == null || mainDep == null || !url.toString().contains(mainDep.getFile().toURI().toString())) {
                    return null;
                }
                JavaClass nestedType = new JavaClass(getProjectClassLoader()).setPackage(clazz.getPackage().getName()).setName(clazz.getSimpleName()).setEnum(clazz.isEnum())
```

### ReturnNull
Return of `null`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
                return nestedType;
            } catch (ClassNotFoundException e) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootAutoConfigurationMojo.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `components-starter/camel-openapi-java-starter/src/main/java/org/apache/camel/springboot/openapi/OpenApiAutoConfiguration.java`
#### Snippet
```java
        List<RestDefinition> rests = resolver.getRestDefinitions(camelContext, null);
        if (rests == null || rests.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/SpringTypeConverter.java`
#### Snippet
```java
        // do not attempt to convert Camel types
        if (type.getCanonicalName().startsWith("org.apache")) {
            return null;
        }
        
```

### ReturnNull
Return of `null`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/SpringTypeConverter.java`
#### Snippet
```java
        // do not attempt to convert List -> Map. Ognl expression may use this converter as a fallback expecting null
        if (type.isAssignableFrom(Map.class) && isArrayOrCollection(value)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/SpringTypeConverter.java`
#### Snippet
```java
                    //
                    if (e.getCause() instanceof ConverterNotFoundException && isArrayOrCollection(value)) {
                        return null;
                    } else {
                        throw new TypeConversionException(value, type, e);
```

### ReturnNull
Return of `null`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/SpringTypeConverter.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/console/CamelDevConsoleEndpoint.java`
#### Snippet
```java
        DevConsoleRegistry dcr = camelContext.getExtension(DevConsoleRegistry.class);
        if (dcr == null || !dcr.isEnabled()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/console/CamelDevConsoleEndpoint.java`
#### Snippet
```java
        DevConsoleRegistry dcr = camelContext.getExtension(DevConsoleRegistry.class);
        if (dcr == null || !dcr.isEnabled()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/health/CamelHealthCheckAutoConfiguration.java`
#### Snippet
```java
            if (config != null && config.getEnabled() != null && !config.getEnabled()) {
                // health check is disabled
                return null;
            }
            if (config == null) {
```

### ReturnNull
Return of `null`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/health/CamelHealthCheckAutoConfiguration.java`
#### Snippet
```java
                    LOG.warn("Cannot find HealthCheckRegistry from classpath. Add camel-health to classpath.");
                }
                return null;
            }
            // lets signal we are integrated with spring boot
```

### ReturnNull
Return of `null`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/routetemplate/CamelRouteTemplateAutoConfiguration.java`
#### Snippet
```java
    public RouteTemplateParameterSource routeTemplate(CamelContext camelContext, CamelRouteTemplateConfigurationProperties rt) {
        if (rt.getConfig() == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/threadpool/CamelThreadPoolAutoConfiguration.java`
#### Snippet
```java
    public ThreadPoolProfile threadPool(CamelContext camelContext, CamelThreadPoolConfigurationProperties tp) {
        if (tp.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/endpoint/CamelRoutesEndpoint.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `core/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/actuate/endpoint/CamelRoutesEndpoint.java`
#### Snippet
```java
        }

        return null;
    }

```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `ivGenerator` is redundant
in `components-starter/camel-jasypt-starter/src/main/java/org/apache/camel/component/jasypt/springboot/JasyptEncryptedPropertiesUtils.java`
#### Snippet
```java
            return isIVNeeded(algorithm) ? new RandomIvGenerator() : new NoIvGenerator();
        }
        IvGenerator ivGenerator = loadClass(ivGeneratorClassName);
        return ivGenerator;
    }
```

### UnnecessaryLocalVariable
Local variable `componentId` is redundant
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootStarterMojo.java`
#### Snippet
```java
    private String getComponentId() {
        String componentName = getMainDepArtifactId();
        String componentId = componentName.replace("camel-", "");
        return componentId;
    }
```

### UnnecessaryLocalVariable
Local variable `template` is redundant
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootStarterMojo.java`
#### Snippet
```java

        cfg.setDefaultEncoding("UTF-8");
        Template template = cfg.getTemplate(name);
        return template;
    }
```

### UnnecessaryLocalVariable
Local variable `pom` is redundant
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootStarterMojo.java`
#### Snippet
```java

        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document pom = builder.parse(bin);
        return pom;
    }
```

## RuleId[ruleID=NullArgumentToVariableArgMethod]
### NullArgumentToVariableArgMethod
Confusing argument `ProviderType.values()`, unclear if a varargs or non-varargs call is desired
in `components-starter/camel-undertow-spring-security-starter/src/main/java/org/apache/camel/undertow/spring/boot/UndertowSpringSecurityCustomizer.java`
#### Snippet
```java

            if(definedProviders.isEmpty()) {
                throw new IllegalArgumentException(String.format("Properties camel.component.undertow.spring.security.provider.* are not defined. Allowed providers are (%s)", ProviderType.values()));
            }
            if(definedProviders.size() > 1) {
```

## RuleId[ruleID=MethodNameSameAsClassName]
### MethodNameSameAsClassName
Method name `JasyptEncryptedPropertiesAutoconfiguration` is the same as its class name
in `components-starter/camel-jasypt-starter/src/main/java/org/apache/camel/component/jasypt/springboot/JasyptEncryptedPropertiesAutoconfiguration.java`
#### Snippet
```java

    @Bean
    public JasyptEncryptedPropertiesConfiguration JasyptEncryptedPropertiesAutoconfiguration(final ConfigurableEnvironment environment) {
        JasyptEncryptedPropertiesConfiguration config = new JasyptEncryptedPropertiesConfiguration();
        final BindHandler handler = new IgnoreErrorsBindHandler(BindHandler.DEFAULT);
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `definedProviders.size() > 1` is always `false`
in `components-starter/camel-undertow-spring-security-starter/src/main/java/org/apache/camel/undertow/spring/boot/UndertowSpringSecurityCustomizer.java`
#### Snippet
```java
                throw new IllegalArgumentException(String.format("Properties camel.component.undertow.spring.security.provider.* are not defined. Allowed providers are (%s)", ProviderType.values()));
            }
            if(definedProviders.size() > 1) {
                throw new IllegalArgumentException(String.format("Two or more providers are defined (%s)", definedProviders));
            }
```

### ConstantValue
Condition `saltGenerator != null` is always `true`
in `components-starter/camel-jasypt-starter/src/main/java/org/apache/camel/component/jasypt/springboot/JasyptEncryptedPropertiesAutoconfiguration.java`
#### Snippet
```java
        String saltGeneratorClassName = configuration.getSaltGeneratorClassName();
        SaltGenerator saltGenerator = loadClass(saltGeneratorClassName);
        if (saltGenerator != null) {
            return saltGenerator;
        }
```

### ConstantValue
Condition `deps.size() > 0` is always `true`
in `tooling/camel-spring-boot-generator-maven-plugin/src/main/java/org/apache/camel/springboot/maven/SpringBootStarterMojo.java`
#### Snippet
```java
            Node dependencies = ((NodeList) xpath.compile("/project/dependencies").evaluate(pom, XPathConstants.NODESET)).item(0);

            if (deps.size() > 0) {
                dependencies.appendChild(pom.createComment(GENERATED_SECTION_START));
                for (String dep : deps) {
```

