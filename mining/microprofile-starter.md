# microprofile-starter 
 
# Bad smells
I found 109 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DuplicateBranchesInSwitch | 29 | false |
| BoundedWildcard | 11 | false |
| EmptyMethod | 10 | false |
| RedundantFieldInitialization | 9 | false |
| DataFlowIssue | 6 | false |
| NonSerializableFieldInSerializableClass | 6 | false |
| ReturnNull | 6 | false |
| DynamicRegexReplaceableByCompiledPattern | 5 | false |
| MissortedModifiers | 3 | false |
| UtilityClassWithoutPrivateConstructor | 2 | true |
| NestedAssignment | 2 | false |
| ThrowablePrintStackTrace | 2 | false |
| UnstableApiUsage | 2 | false |
| WrapperTypeMayBePrimitive | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| RegExpRedundantEscape | 1 | false |
| CatchMayIgnoreException | 1 | false |
| OctalLiteral | 1 | false |
| NonShortCircuitBoolean | 1 | false |
| SetReplaceableByEnumSet | 1 | false |
| UnnecessaryBoxing | 1 | false |
| SystemOutErr | 1 | false |
| SlowListContainsAll | 1 | false |
| UnnecessaryFullyQualifiedName | 1 | false |
| RegExpSingleCharAlternation | 1 | false |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| RedundantStringFormatCall | 1 | false |
| ConstantValue | 1 | false |
## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/org/eclipse/microprofile/starter/core/model/ModelManager.java`
#### Snippet
```java
        String optionName = addonName + ".disable";
        if (options.containsKey(optionName)) {
            Boolean addonDisabled = Boolean.valueOf(options.get(optionName).getSingleValue());
            if (addonDisabled) {
                result = true;
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/eclipse/microprofile/starter/core/model/MicroProfileVersion.java`
#### Snippet
```java
    }

    public static class Constants {
        public static final String MP3X_ALTERNATIVE = "mp3_x";
        public static final String MP41_ALTERNATIVE = "mp4_1";
```

### UtilityClassWithoutPrivateConstructor
Class `OptionName` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/eclipse/microprofile/starter/core/model/BeansXMLMode.java`
#### Snippet
```java
    }

    public static class OptionName {
        public static final String NAME = BeansXMLMode.class.getSimpleName();
    }
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `close` may produce `NullPointerException`
in `src/main/java/org/eclipse/microprofile/starter/core/templates/TemplateModelLoader.java`
#### Snippet
```java
        List<String> templateFiles = yamlReader.readYAML(resource, List.class);
        try {
            resource.close();  // Should never be null as we have checked if .getResource return something useful.
        } catch (IOException e) {
            throw new TechnicalException(e);
```

### DataFlowIssue
Argument `stream` might be null
in `src/main/java/org/eclipse/microprofile/starter/spi/MavenHelper.java`
#### Snippet
```java
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(stream));
            MavenXpp3Reader reader = new MavenXpp3Reader();
            model = reader.read(in);
```

### DataFlowIssue
Argument `FilesLocator.class.getClassLoader().getResourceAsStream("/files.lst")` might be null
in `src/main/java/org/eclipse/microprofile/starter/core/files/FilesLocator.java`
#### Snippet
```java
        Set<String> resources = new HashSet<>();

        try (Scanner scanner = new Scanner(FilesLocator.class.getClassLoader().getResourceAsStream("/files.lst"))) {

            while (scanner.hasNext()) {
```

### DataFlowIssue
Argument `resource` might be null
in `src/main/java/org/eclipse/microprofile/starter/core/files/FileCopyEngine.java`
#### Snippet
```java

        try {
            ByteStreams.copy(resource, result);
        } catch (IOException e) {
            throw new TechnicalException(e);
```

### DataFlowIssue
Argument `FilesLocator.class.getClassLoader() .getResourceAsStream("/version.txt")` might be null
in `src/main/java/org/eclipse/microprofile/starter/Version.java`
#### Snippet
```java
    @PostConstruct
    public void init() {
        try (Scanner s = new Scanner(FilesLocator.class.getClassLoader()
                .getResourceAsStream("/version.txt")).useDelimiter("\\A")) {
            git = s.hasNext() ? s.next() : "";
        } catch (Exception e) {
```

### DataFlowIssue
Argument `FilesLocator.class.getClassLoader() .getResourceAsStream("/REST-README.md")` might be null
in `src/main/java/org/eclipse/microprofile/starter/rest/APIService.java`
#### Snippet
```java
        serversToOptionsEtag = new EntityTag(Integer.toHexString(
                31 * version.getGit().hashCode() + serversToOptions.hashCode() + specsDescriptions.hashCode()));
        try (Scanner s = new Scanner(FilesLocator.class.getClassLoader()
                .getResourceAsStream("/REST-README.md")).useDelimiter("\\A")) {
            readme = (s.hasNext() ? s.next() : "") + "\n" + version.getGit() + "\n";
            readmeEtag = new EntityTag(Integer.toHexString(readme.hashCode()));
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Inefficient conversion from ByteArrayOutputStream
in `src/main/java/org/eclipse/microprofile/starter/core/artifacts/MavenCreator.java`
#### Snippet
```java
            pomWriter.write(out, pomFile);
            out.close();
            content = new String(out.toByteArray());
        } catch (IOException e) {
            throw new TechnicalException(e);
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `src/main/java/org/eclipse/microprofile/starter/core/validation/PackageNameValidator.java`
#### Snippet
```java
public class PackageNameValidator {

    public static final String VALID_REGEX = "^(?:\\w+|\\w+[\\.-]\\w+)+$";
    public static final int MAX_LENGTH = 200;
    private Pattern pattern = Pattern.compile(VALID_REGEX, Pattern.CASE_INSENSITIVE);
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/PayaraMicroServer.java`
#### Snippet
```java
                break;
            case MP14:
                payaraVersion = "5.183";
                break;
            case MP13:
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/LibertyServer.java`
#### Snippet
```java

            case NONE:
                break;
            case MP40: case MP41: case MP50:
                jaegerClientVersion="1.5.0";
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/WildFlyServer.java`
#### Snippet
```java
                return "20.0.0.Final";
            case MP32:
                return "20.0.0.Final";
            case MP22:
                break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/WildFlyServer.java`
#### Snippet
```java
                return "20.0.0.Final";
            case MP22:
                break;
            case MP21:
                break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/WildFlyServer.java`
#### Snippet
```java
                break;
            case MP21:
                break;
            case MP20:
                break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/WildFlyServer.java`
#### Snippet
```java
                break;
            case MP20:
                break;
            case MP14:
                break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/WildFlyServer.java`
#### Snippet
```java
                break;
            case MP14:
                break;
            case MP13:
                break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/WildFlyServer.java`
#### Snippet
```java
                break;
            case MP13:
                break;
            case MP12:
                break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/WildFlyServer.java`
#### Snippet
```java
                break;
            case MP12:
                break;
            default:
        }
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/HelidonServer.java`
#### Snippet
```java
                break;
            case MP21:
                break;
            case MP20:
                break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/HelidonServer.java`
#### Snippet
```java
                break;
            case MP20:
                break;
            case MP14:
                break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/HelidonServer.java`
#### Snippet
```java
                break;
            case MP14:
                break;
            case MP13:
                break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/HelidonServer.java`
#### Snippet
```java
                break;
            case MP13:
                break;
            case MP12:
                helidonVersion = "1.0.1";
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/QuarkusServer.java`
#### Snippet
```java
                return "2.2.3.Final";
            case MP40:
                break;
            case MP33:
                break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/QuarkusServer.java`
#### Snippet
```java
                break;
            case MP33:
                break;
            case MP32:
                return "1.7.6.Final";
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/QuarkusServer.java`
#### Snippet
```java
                return "1.7.6.Final";
            case MP22:
                break;
            case MP21:
                break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/QuarkusServer.java`
#### Snippet
```java
                break;
            case MP21:
                break;
            case MP20:
                break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/QuarkusServer.java`
#### Snippet
```java
                break;
            case MP20:
                break;
            case MP14:
                break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/QuarkusServer.java`
#### Snippet
```java
                break;
            case MP14:
                break;
            case MP13:
                break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/QuarkusServer.java`
#### Snippet
```java
                break;
            case MP13:
                break;
            case MP12:
                break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/QuarkusServer.java`
#### Snippet
```java
                break;
            case MP12:
                break;
            default:
        }
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/TomeeServer.java`
#### Snippet
```java
                break;
            case MP22:
                break;
            case MP21:
                tomeeVersion = "8.0.0-M3";
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/TomeeServer.java`
#### Snippet
```java
                break;
            case MP20:
                tomeeVersion = "8.0.0-M3";
                break;
            case MP14:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/TomeeServer.java`
#### Snippet
```java
                break;
            case MP14:
                tomeeVersion = "8.0.0-M3";
                break;
            case MP13:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/TomeeServer.java`
#### Snippet
```java
                break;
            case MP13:
                tomeeVersion = "8.0.0-M3";
                break;
            case MP12:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/TomeeServer.java`
#### Snippet
```java
                break;
            case MP12:
                tomeeVersion = "8.0.0-M3";
                break;
            default:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/ThorntailServer.java`
#### Snippet
```java
                break;
            case MP32:
                thorntailVersion = "2.7.0.Final";
                break;
            case MP30:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/ThorntailServer.java`
#### Snippet
```java
                break;
            case MP20:
                break;
            case MP14:
                break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/ThorntailServer.java`
#### Snippet
```java
                break;
            case MP14:
                break;
            case MP13:
                thorntailVersion = "2.1.0.Final";
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'version' in a Serializable class
in `src/main/java/org/eclipse/microprofile/starter/view/GeneratorDataBean.java`
#### Snippet
```java

    @Inject
    private Version version;

    @Inject
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'engineData' in a Serializable class
in `src/main/java/org/eclipse/microprofile/starter/view/GeneratorDataBean.java`
#### Snippet
```java
    private ManagedExecutorService managedExecutorService;

    private EngineData engineData;

    private MicroProfileVersion microProfileVersion;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'errorLogger' in a Serializable class
in `src/main/java/org/eclipse/microprofile/starter/view/GeneratorDataBean.java`
#### Snippet
```java

    @Inject
    private ErrorLogger errorLogger;

    @Resource
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'jdkSelector' in a Serializable class
in `src/main/java/org/eclipse/microprofile/starter/view/GeneratorDataBean.java`
#### Snippet
```java

    @Inject
    private JDKSelector jdkSelector;

    @Inject
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'creator' in a Serializable class
in `src/main/java/org/eclipse/microprofile/starter/view/GeneratorDataBean.java`
#### Snippet
```java

    @Inject
    private Creator creator;

    @Inject
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'modelManager' in a Serializable class
in `src/main/java/org/eclipse/microprofile/starter/view/GeneratorDataBean.java`
#### Snippet
```java

    @Inject
    private ModelManager modelManager;

    @Inject
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/org/eclipse/microprofile/starter/spi/MavenHelper.java`
#### Snippet
```java
                try {
                    in.close();
                } catch (IOException e1) {

                }
```

## RuleId[id=OctalLiteral]
### OctalLiteral
Octal integer `0755`
in `src/main/java/org/eclipse/microprofile/starter/ZipFileCreator.java`
#### Snippet
```java
                ZipArchiveEntry zipEntry = new ZipArchiveEntry(entry.getKey().getLeft());
                if (entry.getKey().getRight()) {
                    zipEntry.setUnixMode(0755);
                }
                archive.putArchiveEntry(zipEntry);
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `supportedServer != SupportedServer.HELIDON & supportedServer != SupportedServer.QUARKUS`
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/MicroprofileServersAddon.java`
#### Snippet
```java
        // Helidon should have it in src/main/resources/WEB
        // Quarkus should have it in src/main/resources/META-INF/resources
        if (supportedServer != SupportedServer.HELIDON & supportedServer != SupportedServer.QUARKUS) {
            // Demo index file to all endpoints
            String webDirectory = model.getDirectory(true) + "/" + MavenCreator.SRC_MAIN_WEBAPP;
```

## RuleId[id=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/org/eclipse/microprofile/starter/core/model/deserializer/ViewTypeDeserializer.java`
#### Snippet
```java
    @Override
    public List<ViewType> deserialize(JsonParser jsonParser, DeserializationContext context) throws IOException {
        Set<ViewType> result = new HashSet<>();

        ObjectMapper mapper = (ObjectMapper) jsonParser.getCodec();
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/eclipse/microprofile/starter/core/addon/AddonManager.java`
#### Snippet
```java
    }

    private <T> List<T> getProviders(Iterator<T> alternativesIterator) {
        List<T> result = new ArrayList<>();
        while (alternativesIterator.hasNext()) {
```

### BoundedWildcard
Can generalize to `? super SupportedServer`
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/JDKSelector.java`
#### Snippet
```java
    }

    private void fillJavaSEVersion(Map<SupportedServer, Map<MicroProfileVersion, List<JavaSEVersion>>> data,
                                   SupportedServer supportedServer,
                                   JavaSEVersion seVersion,
```

### BoundedWildcard
Can generalize to `? extends FileIdentification`
in `src/main/java/org/eclipse/microprofile/starter/core/files/FilesLocator.java`
#### Snippet
```java
    }

    private int selectBasedOnAlternatives(List<FileIdentification> candidates, Set<String> alternatives) {
        int result = -1;
        boolean multipleMatch = false;
```

### BoundedWildcard
Can generalize to `? extends Plugin`
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/TomeeServer.java`
#### Snippet
```java
    }

    private Plugin findMavenPlugin(List<Plugin> plugins) {
        Plugin result = null;
        for (Plugin plugin : plugins) {
```

### BoundedWildcard
Can generalize to `? extends OptionValue`
in `src/main/java/org/eclipse/microprofile/starter/core/model/ModelManager.java`
#### Snippet
```java
    }

    private boolean isAddonDisabled(String addonName, Map<String, OptionValue> options) {
        boolean result = false;
        String optionName = addonName + ".disable";
```

### BoundedWildcard
Can generalize to `? extends JessieAddon`
in `src/main/java/org/eclipse/microprofile/starter/core/model/ModelManager.java`
#### Snippet
```java
    }

    private void setAddonOptions(List<JessieAddon> allAddons, Map<String, OptionValue> options) {

        for (JessieAddon addon : allAddons) {
```

### BoundedWildcard
Can generalize to `? extends JessieAddon`
in `src/main/java/org/eclipse/microprofile/starter/core/model/ModelManager.java`
#### Snippet
```java
    }

    private void orderAddons(List<JessieAddon> allAddons) {
        allAddons.sort(Comparator.comparing(JessieAddon::priority));
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/eclipse/microprofile/starter/core/model/ModelManager.java`
#### Snippet
```java
    }

    private void addDefaultOption(Map<String, OptionValue> options, String key, String value) {
        OptionValue optionValue;
        if (!options.containsKey(key)) {
```

### BoundedWildcard
Can generalize to `? extends JessieAddon`
in `src/main/java/org/eclipse/microprofile/starter/core/model/ModelManager.java`
#### Snippet
```java
    }

    private Set<String> determineAlternatives(JessieModel model, List<JessieAddon> allAddons) {
        Set<String> alternatives = alternativesProvider.determineAlternatives(model);

```

### BoundedWildcard
Can generalize to `? extends ConstraintViolation`
in `src/main/java/org/eclipse/microprofile/starter/core/validation/ModelValidationException.java`
#### Snippet
```java
    }

    private static String defineMessages(Set<ConstraintViolation<Object>> violations) {
        StringBuilder result = new StringBuilder();
        for (ConstraintViolation<Object> violation : violations) {
```

### BoundedWildcard
Can generalize to `? extends ServerMPVersion`
in `src/main/java/org/eclipse/microprofile/starter/view/GeneratorDataBean.java`
#### Snippet
```java
    }

    private boolean standaloneSpecForVersion(List<ServerMPVersion> serverRestrictions) {
        boolean result = false;
        for (ServerMPVersion serverRestriction : serverRestrictions) {
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final private`
in `src/main/java/org/eclipse/microprofile/starter/core/model/JessieModel.java`
#### Snippet
```java

    @JsonIgnore
    final private Map<String, Object> parameters = new HashMap<>();

    @JsonIgnore
```

### MissortedModifiers
Missorted modifiers `final private`
in `src/main/java/org/eclipse/microprofile/starter/core/model/JessieModel.java`
#### Snippet
```java

    @JsonIgnore
    final private Map<String, String> variables = new HashMap<>();

    /**
```

### MissortedModifiers
Missorted modifiers `final private`
in `src/main/java/org/eclipse/microprofile/starter/core/model/JessieModel.java`
#### Snippet
```java

    @JsonDeserialize(using = OptionsDeserializer.class)
    final private Map<String, OptionValue> options = new HashMap<>();

    @JsonIgnore
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `src/main/java/org/eclipse/microprofile/starter/core/files/FilesLocator.java`
#### Snippet
```java

    public String getTemplateFile(String index) {
        return fileNames.get(Integer.valueOf(index));
    }

```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/eclipse/microprofile/starter/log/ErrorLogger.java`
#### Snippet
```java
        }

        System.err.println(String.format("Error during generation of project: \n Model : %s \n Stacktrace %s", json, stacktrace(e)));
    }

```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/eclipse/microprofile/starter/core/artifacts/DirectoryCreator.java`
#### Snippet
```java

    public String createPathForGroupAndArtifact(JessieMaven mavenModel) {
        return (mavenModel.getGroupId() + '.' + mavenModel.getPackage()).replaceAll("\\.", "/");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/eclipse/microprofile/starter/core/TemplateVariableProvider.java`
#### Snippet
```java
        result.put("maven_artifactid", model.getMaven().getArtifactId());

        String artifactId = model.getMaven().getArtifactId().replaceAll("\\.", "");
        result.put("artifact", StringUtils.capitalize(artifactId));
        result.put("application", StringUtils.capitalize(artifactId.replaceAll("-", "")));
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/eclipse/microprofile/starter/core/TemplateVariableProvider.java`
#### Snippet
```java
        String artifactId = model.getMaven().getArtifactId().replaceAll("\\.", "");
        result.put("artifact", StringUtils.capitalize(artifactId));
        result.put("application", StringUtils.capitalize(artifactId.replaceAll("-", "")));

        result.put("mp_version", model.getSpecification().getMicroProfileVersion().getCode());
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/eclipse/microprofile/starter/core/model/JessieMaven.java`
#### Snippet
```java

    public String getPackage() {
        return artifactId.replaceAll("-", ".");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/MicroprofileServersAddon.java`
#### Snippet
```java
        String artifactId = model.getMaven().getArtifactId();
        variables.put("jar_file", defineJarFileName(supportedServer, artifactId));
        variables.put("jar_file_no_suffix", variables.get("jar_file").split("\\.jar")[0]);
        variables.put("jar_parameters", defineJarParameters(supportedServer));
        variables.put("port_service_a", supportedServer.getPortServiceA());
```

## RuleId[id=SlowListContainsAll]
### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `src/main/java/org/eclipse/microprofile/starter/rest/APIService.java`
#### Snippet
```java
        }

        if (!mpvToOptions.get(p.getMpVersion()).getSpecs().containsAll(p.getSelectedSpecEnums())) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .type("application/json")
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/eclipse/microprofile/starter/validation/PackageValidator.java`
#### Snippet
```java
     * in case when there are no or multiple beans which are a candidate for the type.
     *
     * @param classType a {@link java.lang.Class} representing the required type
     * @param <T>       Generic Type argument
     * @return CDI instance matching the class type and qualifiers (if specified).
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/org/eclipse/microprofile/starter/log/DynamoDBLogger.java`
#### Snippet
```java
                    try (BufferedReader reader = new BufferedReader(new InputStreamReader(myURLConnection.getErrorStream()))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            LOG.log(Level.FINE, line);
                        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/eclipse/microprofile/starter/log/DynamoDBLogger.java`
#### Snippet
```java
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(myURLConnection.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    LOG.log(Level.FINE, line);
                }
```

## RuleId[id=RegExpSingleCharAlternation]
### RegExpSingleCharAlternation
Single character alternation in RegExp
in `src/main/java/org/eclipse/microprofile/starter/core/files/FilesLocator.java`
#### Snippet
```java

    private static class FileIdentification {
        private static final Pattern FILE_PATH_PATTERN_SPLIT = Pattern.compile("\\\\|/");
        private Set<String> alternatives;
        private String name;
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`resourceDirectory = resourceDirectory + "/resources/security"` could be simplified to 'resourceDirectory += "/resources/security"'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/LibertyServer.java`
#### Snippet
```java
            if  (microprofileSpecs.contains(MicroprofileSpec.JWT_AUTH)) {

                resourceDirectory = resourceDirectory + "/resources/security";
                directoryCreator.createDirectory(resourceDirectory);
    
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/eclipse/microprofile/starter/ZipFileCreator.java`
#### Snippet
```java
            archive.finish();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            archiveContent.clear();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/eclipse/microprofile/starter/log/ErrorLogger.java`
#### Snippet
```java
            json = mapper.writeValueAsString(model);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }

```

## RuleId[id=EmptyMethod]
### EmptyMethod
Method only calls its super
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/HelidonServer.java`
#### Snippet
```java

    @PostConstruct
    public void init() {
        super.init();
    }
```

### EmptyMethod
Method only calls its super
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/KumuluzeeServer.java`
#### Snippet
```java

    @PostConstruct
    public void init() {
        super.init();
    }
```

### EmptyMethod
Method only calls its super
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/LibertyServer.java`
#### Snippet
```java

    @PostConstruct
    public void init() {
        super.init();
    }
```

### EmptyMethod
Method only calls its super
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/PayaraMicroServer.java`
#### Snippet
```java

    @PostConstruct
    public void init() {
        super.init();
    }
```

### EmptyMethod
Method only calls its super
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/QuarkusServer.java`
#### Snippet
```java

    @PostConstruct
    public void init() {
        super.init();
    }
```

### EmptyMethod
Method only calls its super
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/ThorntailServer.java`
#### Snippet
```java

    @PostConstruct
    public void init() {
        super.init();
    }
```

### EmptyMethod
Method only calls its super
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/TomeeServer.java`
#### Snippet
```java

    @PostConstruct
    public void init() {
        super.init();
    }
```

### EmptyMethod
Method only calls its super
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/WildFlyServer.java`
#### Snippet
```java

    @PostConstruct
    public void init() {
        super.init();
    }
```

### EmptyMethod
Method only calls its super
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/WildflySwarmServer.java`
#### Snippet
```java

    @PostConstruct
    public void init() {
        super.init();
    }
```

### EmptyMethod
All implementations of this method are empty
in `src/main/java/org/eclipse/microprofile/starter/core/artifacts/DirectoryCreator.java`
#### Snippet
```java
public abstract class DirectoryCreator {

    public abstract void createDirectory(String directoryPath);

    public abstract void removeDirectory(String directoryPath);
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/eclipse/microprofile/starter/rest/model/Project.java`
#### Snippet
```java
 */
public class Project {
    private String groupId = null;
    private String artifactId = null;
    private MicroProfileVersion mpVersion = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/eclipse/microprofile/starter/rest/model/Project.java`
#### Snippet
```java
public class Project {
    private String groupId = null;
    private String artifactId = null;
    private MicroProfileVersion mpVersion = null;
    private JavaSEVersion javaSEVersion = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/eclipse/microprofile/starter/rest/model/Project.java`
#### Snippet
```java
    private JavaSEVersion javaSEVersion = null;
    private SupportedServer supportedServer = null;
    private List<String> selectedSpecs = null;
    private List<MicroprofileSpec> selectedSpecEnums;
    private List<StandaloneMPSpec> selectedStandaloneSpecs = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/eclipse/microprofile/starter/rest/model/Project.java`
#### Snippet
```java
    private List<StandaloneMPSpec> selectedStandaloneSpecs = null;
    private BuildTool buildTool = BuildTool.MAVEN;
    private boolean selectAllSpecs = false;

    public String getGroupId() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/eclipse/microprofile/starter/rest/model/Project.java`
#### Snippet
```java
    private String artifactId = null;
    private MicroProfileVersion mpVersion = null;
    private JavaSEVersion javaSEVersion = null;
    private SupportedServer supportedServer = null;
    private List<String> selectedSpecs = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/eclipse/microprofile/starter/rest/model/Project.java`
#### Snippet
```java
    private MicroProfileVersion mpVersion = null;
    private JavaSEVersion javaSEVersion = null;
    private SupportedServer supportedServer = null;
    private List<String> selectedSpecs = null;
    private List<MicroprofileSpec> selectedSpecEnums;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/eclipse/microprofile/starter/rest/model/Project.java`
#### Snippet
```java
    private String groupId = null;
    private String artifactId = null;
    private MicroProfileVersion mpVersion = null;
    private JavaSEVersion javaSEVersion = null;
    private SupportedServer supportedServer = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/eclipse/microprofile/starter/rest/model/Project.java`
#### Snippet
```java
    private List<String> selectedSpecs = null;
    private List<MicroprofileSpec> selectedSpecEnums;
    private List<StandaloneMPSpec> selectedStandaloneSpecs = null;
    private BuildTool buildTool = BuildTool.MAVEN;
    private boolean selectAllSpecs = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/eclipse/microprofile/starter/view/GeneratorDataBean.java`
#### Snippet
```java
    private List<String> selectedStandaloneSpecs = new ArrayList<>();
    private List<SelectItem> javaSEItems;
    private boolean javaSEEnabled = false;

    @PostConstruct
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/WildFlyServer.java`
#### Snippet
```java
            default:
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/microprofile/starter/log/DynamoDBLogger.java`
#### Snippet
```java
        } catch (NoSuchAlgorithmException e) {
            LOG.log(Level.SEVERE, "SHA-256 not available.", e);
            return null;
        }
        digest.update(StandardCharsets.UTF_8.encode(dynamoDBJSON));
```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/microprofile/starter/log/DynamoDBLogger.java`
#### Snippet
```java
        } catch (NoSuchAlgorithmException e) {
            LOG.log(Level.SEVERE, "SHA-1 not available.", e);
            return null;
        }
        final String timestamp = logMessageTimeFormat.format(date);
```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/microprofile/starter/log/DynamoDBLogger.java`
#### Snippet
```java
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            LOG.log(Level.SEVERE, "HmacSHA256 key problem:", e);
            return null;
        }
        final String stringToSign = authHeaderSignatureHash(amzDate, dynamoDBJSON, credentialScope);
```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/microprofile/starter/log/DynamoDBLogger.java`
#### Snippet
```java
        final String stringToSign = authHeaderSignatureHash(amzDate, dynamoDBJSON, credentialScope);
        if (stringToSign == null) {
            return null;
        }
        final byte[] signatureBytes = mac.doFinal(stringToSign.getBytes(StandardCharsets.US_ASCII));
```

### ReturnNull
Return of `null`
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/QuarkusServer.java`
#### Snippet
```java
            default:
        }
        return null;
    }
}
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-15-10-03-56.708.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `src/main/java/org/eclipse/microprofile/starter/log/ErrorLogger.java`
#### Snippet
```java
        }

        System.err.println(String.format("Error during generation of project: \n Model : %s \n Stacktrace %s", json, stacktrace(e)));
    }

```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `in != null` is always `true`
in `src/main/java/org/eclipse/microprofile/starter/spi/MavenHelper.java`
#### Snippet
```java
            in.close();
        } catch (IOException | XmlPullParserException e) {
            if (in != null) {
                try {
                    in.close();
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.io.ByteStreams' is marked unstable with @Beta
in `src/main/java/org/eclipse/microprofile/starter/core/files/FileCopyEngine.java`
#### Snippet
```java

        try {
            ByteStreams.copy(resource, result);
        } catch (IOException e) {
            throw new TechnicalException(e);
```

### UnstableApiUsage
'copy(java.io.InputStream, java.io.OutputStream)' is declared in unstable class 'com.google.common.io.ByteStreams' marked with @Beta
in `src/main/java/org/eclipse/microprofile/starter/core/files/FileCopyEngine.java`
#### Snippet
```java

        try {
            ByteStreams.copy(resource, result);
        } catch (IOException e) {
            throw new TechnicalException(e);
```

