# microprofile-starter 
 
# Bad smells
I found 130 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldMayBeFinal | 41 | false |
| NonFinalFieldInEnum | 30 | false |
| DuplicateBranchesInSwitch | 29 | false |
| DataFlowIssue | 6 | false |
| DuplicatedCode | 5 | false |
| JavadocDeclaration | 4 | false |
| UastIncorrectHttpHeaderInspection | 2 | false |
| UnstableApiUsage | 2 | false |
| WrapperTypeMayBePrimitive | 1 | false |
| SlowListContainsAll | 1 | false |
| RegExpSingleCharAlternation | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| RegExpRedundantEscape | 1 | false |
| SlowAbstractSetRemoveAll | 1 | false |
| CatchMayIgnoreException | 1 | false |
| OctalLiteral | 1 | false |
| RedundantStringFormatCall | 1 | false |
| ArraysAsListWithZeroOrOneArgument | 1 | false |
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

## RuleId[id=DataFlowIssue]
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
Argument `FilesLocator.class.getClassLoader().getResourceAsStream("/files.lst")` might be null
in `src/main/java/org/eclipse/microprofile/starter/core/files/FilesLocator.java`
#### Snippet
```java
        Set<String> resources = new HashSet<>();

        try (Scanner scanner = new Scanner(FilesLocator.class.getClassLoader().getResourceAsStream("/files.lst"))) {

            while (scanner.hasNext()) {
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

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/org/eclipse/microprofile/starter/spi/JessieAlternativesProvider.java`
#### Snippet
```java
     * If no alternatives, must return empty Set.
     *
     * @return
     */
    Set<String> alternativesNames(JessieModel model);
```

### JavadocDeclaration
`@param model` tag description is missing
in `src/main/java/org/eclipse/microprofile/starter/core/model/ModelManager.java`
#### Snippet
```java

    /**
     * @param model
     * @param localExecution Is the generation run on local machine and thus need real directories.
     */
```

### JavadocDeclaration
`@param project` tag description is missing
in `src/main/java/org/eclipse/microprofile/starter/rest/APIService.java`
#### Snippet
```java
     * MicroProfileSpec codes are correctly moved to the StandaloneMPSpec property.
     *
     * @param project
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/org/eclipse/microprofile/starter/rest/APIService.java`
#### Snippet
```java
     *
     * @param project
     * @return
     */
    private List<String> defineIncorrectSpecCodes(Project project) {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `engineData` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/log/LoggingTask.java`
#### Snippet
```java
public class LoggingTask implements Runnable {

    private EngineData engineData;

    public LoggingTask(EngineData engineData) {
```

### FieldMayBeFinal
Field `filesLocator` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/core/files/JessieFileTemplateResolver.java`
#### Snippet
```java
public class JessieFileTemplateResolver extends AbstractConfigurableTemplateResolver {

    private FilesLocator filesLocator;

    public JessieFileTemplateResolver(FilesLocator filesLocator) {
```

### FieldMayBeFinal
Field `jarParameters` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/SupportedServer.java`
#### Snippet
```java
    private List<MicroProfileVersion> mpVersions;
    private String jarFileName;
    private String jarParameters;
    private String portServiceA;
    private String portServiceB;
```

### FieldMayBeFinal
Field `gradleSupport` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/SupportedServer.java`
#### Snippet
```java
    private String portServiceB;
    private String homePage;
    private boolean gradleSupport;

    SupportedServer(String code, String displayName, List<MicroProfileVersion> mpVersions, String jarFileName
```

### FieldMayBeFinal
Field `portServiceA` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/SupportedServer.java`
#### Snippet
```java
    private String jarFileName;
    private String jarParameters;
    private String portServiceA;
    private String portServiceB;
    private String homePage;
```

### FieldMayBeFinal
Field `mpVersions` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/SupportedServer.java`
#### Snippet
```java
    private String code;
    private String displayName;
    private List<MicroProfileVersion> mpVersions;
    private String jarFileName;
    private String jarParameters;
```

### FieldMayBeFinal
Field `displayName` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/SupportedServer.java`
#### Snippet
```java

    private String code;
    private String displayName;
    private List<MicroProfileVersion> mpVersions;
    private String jarFileName;
```

### FieldMayBeFinal
Field `code` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/SupportedServer.java`
#### Snippet
```java
    // @formatter:on

    private String code;
    private String displayName;
    private List<MicroProfileVersion> mpVersions;
```

### FieldMayBeFinal
Field `homePage` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/SupportedServer.java`
#### Snippet
```java
    private String portServiceA;
    private String portServiceB;
    private String homePage;
    private boolean gradleSupport;

```

### FieldMayBeFinal
Field `jarFileName` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/SupportedServer.java`
#### Snippet
```java
    private String displayName;
    private List<MicroProfileVersion> mpVersions;
    private String jarFileName;
    private String jarParameters;
    private String portServiceA;
```

### FieldMayBeFinal
Field `portServiceB` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/SupportedServer.java`
#### Snippet
```java
    private String jarParameters;
    private String portServiceA;
    private String portServiceB;
    private String homePage;
    private boolean gradleSupport;
```

### FieldMayBeFinal
Field `pattern` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/core/validation/PackageNameValidator.java`
#### Snippet
```java
    public static final String VALID_REGEX = "^(?:\\w+|\\w+[\\.-]\\w+)+$";
    public static final int MAX_LENGTH = 200;
    private Pattern pattern = Pattern.compile(VALID_REGEX, Pattern.CASE_INSENSITIVE);

    public boolean isValidPackageName(String name) {
```

### FieldMayBeFinal
Field `code` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/core/model/MicroProfileVersion.java`
#### Snippet
```java
    // @formatter:on

    private String code;
    private String depVersion;
    private String label;
```

### FieldMayBeFinal
Field `depVersion` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/core/model/MicroProfileVersion.java`
#### Snippet
```java

    private String code;
    private String depVersion;
    private String label;
    private Set<String> alternatives;
```

### FieldMayBeFinal
Field `alternatives` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/core/model/MicroProfileVersion.java`
#### Snippet
```java
    private String depVersion;
    private String label;
    private Set<String> alternatives;

    MicroProfileVersion(String code, String label) {
```

### FieldMayBeFinal
Field `label` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/core/model/MicroProfileVersion.java`
#### Snippet
```java
    private String code;
    private String depVersion;
    private String label;
    private Set<String> alternatives;

```

### FieldMayBeFinal
Field `artifactId` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/StandaloneMPSpec.java`
#### Snippet
```java
    private List<ServerMPVersion> serverRestrictions;
    private String groupId;
    private String artifactId;

    StandaloneMPSpec(String code,
```

### FieldMayBeFinal
Field `code` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/StandaloneMPSpec.java`
#### Snippet
```java
    ;

    private String code;
    private String label;
    private String tagURL;
```

### FieldMayBeFinal
Field `label` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/StandaloneMPSpec.java`
#### Snippet
```java

    private String code;
    private String label;
    private String tagURL;
    private String description;
```

### FieldMayBeFinal
Field `groupId` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/StandaloneMPSpec.java`
#### Snippet
```java
    private String description;
    private List<ServerMPVersion> serverRestrictions;
    private String groupId;
    private String artifactId;

```

### FieldMayBeFinal
Field `serverRestrictions` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/StandaloneMPSpec.java`
#### Snippet
```java
    private String tagURL;
    private String description;
    private List<ServerMPVersion> serverRestrictions;
    private String groupId;
    private String artifactId;
```

### FieldMayBeFinal
Field `tagURL` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/StandaloneMPSpec.java`
#### Snippet
```java
    private String code;
    private String label;
    private String tagURL;
    private String description;
    private List<ServerMPVersion> serverRestrictions;
```

### FieldMayBeFinal
Field `description` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/StandaloneMPSpec.java`
#### Snippet
```java
    private String label;
    private String tagURL;
    private String description;
    private List<ServerMPVersion> serverRestrictions;
    private String groupId;
```

### FieldMayBeFinal
Field `mpVersions` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/MicroprofileSpec.java`
#### Snippet
```java
    private String tagURL;
    private String description;
    private List<MicroProfileVersion> mpVersions;

    MicroprofileSpec(String code, String label, String description, String tagURL, List<MicroProfileVersion> mpVersions) {
```

### FieldMayBeFinal
Field `label` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/MicroprofileSpec.java`
#### Snippet
```java

    private String code;
    private String label;
    private String tagURL;
    private String description;
```

### FieldMayBeFinal
Field `tagURL` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/MicroprofileSpec.java`
#### Snippet
```java
    private String code;
    private String label;
    private String tagURL;
    private String description;
    private List<MicroProfileVersion> mpVersions;
```

### FieldMayBeFinal
Field `description` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/MicroprofileSpec.java`
#### Snippet
```java
    private String label;
    private String tagURL;
    private String description;
    private List<MicroProfileVersion> mpVersions;

```

### FieldMayBeFinal
Field `code` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/MicroprofileSpec.java`
#### Snippet
```java
    // @formatter:on

    private String code;
    private String label;
    private String tagURL;
```

### FieldMayBeFinal
Field `parent` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/exception/CustomExceptionHandlerFactory.java`
#### Snippet
```java
public class CustomExceptionHandlerFactory extends ExceptionHandlerFactory {

    private ExceptionHandlerFactory parent;

    @SuppressWarnings("deprecation")
```

### FieldMayBeFinal
Field `wrapped` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/exception/CustomExceptionHandler.java`
#### Snippet
```java
public class CustomExceptionHandler extends ExceptionHandlerWrapper {

    private ExceptionHandler wrapped;

    @SuppressWarnings("deprecation")
```

### FieldMayBeFinal
Field `mode` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/core/model/BeansXMLMode.java`
#### Snippet
```java
    IMPLICIT("implicit"), ANNOTATED("annotated"), ALL("all");

    private String mode;

    BeansXMLMode(String mode) {
```

### FieldMayBeFinal
Field `values` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/core/model/OptionValue.java`
#### Snippet
```java
public class OptionValue {

    private List<String> values;

    public OptionValue() {
```

### FieldMayBeFinal
Field `label` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/core/model/JavaSEVersion.java`
#### Snippet
```java

    private String code;
    private String label;

    JavaSEVersion(String code, String label) {
```

### FieldMayBeFinal
Field `code` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/core/model/JavaSEVersion.java`
#### Snippet
```java
    // @formatter:on

    private String code;
    private String label;

```

### FieldMayBeFinal
Field `templates` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/core/templates/TemplateModelLoader.java`
#### Snippet
```java
    private YAMLReader yamlReader;

    private List<String> templates = new ArrayList<>();

    @PostConstruct
```

### FieldMayBeFinal
Field `code` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/core/model/ViewType.java`
#### Snippet
```java
    JSF("jsf", "JSF"), REST("rest", "JAX-RS");

    private String code;
    private String label;

```

### FieldMayBeFinal
Field `label` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/core/model/ViewType.java`
#### Snippet
```java

    private String code;
    private String label;

    ViewType(String code, String label) {
```

### FieldMayBeFinal
Field `minimalMPVersion` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/ServerMPVersion.java`
#### Snippet
```java

    private SupportedServer supportedServer;
    private MicroProfileVersion minimalMPVersion;  // minimal MP Version required to show checkbox.
    // Can be null meaning that there is no restriction on the MP Version, only on the Runtime.

```

### FieldMayBeFinal
Field `supportedServer` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/ServerMPVersion.java`
#### Snippet
```java
public class ServerMPVersion {

    private SupportedServer supportedServer;
    private MicroProfileVersion minimalMPVersion;  // minimal MP Version required to show checkbox.
    // Can be null meaning that there is no restriction on the MP Version, only on the Runtime.
```

### FieldMayBeFinal
Field `name` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/core/files/FilesLocator.java`
#### Snippet
```java
        private static final Pattern FILE_PATH_PATTERN_SPLIT = Pattern.compile("\\\\|/");
        private Set<String> alternatives;
        private String name;

        public FileIdentification(String fileName, String root) {
```

### FieldMayBeFinal
Field `alternatives` may be 'final'
in `src/main/java/org/eclipse/microprofile/starter/core/files/FilesLocator.java`
#### Snippet
```java
    private static class FileIdentification {
        private static final Pattern FILE_PATH_PATTERN_SPLIT = Pattern.compile("\\\\|/");
        private Set<String> alternatives;
        private String name;

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

## RuleId[id=UastIncorrectHttpHeaderInspection]
### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `src/main/java/org/eclipse/microprofile/starter/view/HeaderFilter.java`
#### Snippet
```java
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse servletResponse = (HttpServletResponse) response;
        servletResponse.setHeader("X-XSS-Protection", "1; mode=block");
        servletResponse.setHeader("Strict-Transport-Security", "max-age=31536000; includeSubDomains");
        servletResponse.setHeader("X-Content-Type-Options", "nosniff");
```

### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `src/main/java/org/eclipse/microprofile/starter/view/HeaderFilter.java`
#### Snippet
```java
        servletResponse.setHeader("X-Content-Type-Options", "nosniff");
        servletResponse.setHeader("X-Frame-Options", "DENY");
        servletResponse.setHeader("Content-Security-Policy", "default-src: https: font-src 'https://fonts.googleapis.com';" +
                "img-src 'self' https://microprofile.io; style-src 'self'; frame-ancestors 'none';");
        chain.doFilter(request, response);
```

## RuleId[id=DuplicateBranchesInSwitch]
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

## RuleId[id=SlowAbstractSetRemoveAll]
### SlowAbstractSetRemoveAll
Call to 'set.removeAll(list)' may work slowly
in `src/main/java/org/eclipse/microprofile/starter/core/model/ModelManager.java`
#### Snippet
```java
        List<String> addons = allAddons.stream().map(JessieAddon::addonName).collect(Collectors.toList());

        dependents.removeAll(addons);

        if (!dependents.isEmpty()) {
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `jarParameters` in enum 'SupportedServer'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/SupportedServer.java`
#### Snippet
```java
    private List<MicroProfileVersion> mpVersions;
    private String jarFileName;
    private String jarParameters;
    private String portServiceA;
    private String portServiceB;
```

### NonFinalFieldInEnum
Non-final field `gradleSupport` in enum 'SupportedServer'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/SupportedServer.java`
#### Snippet
```java
    private String portServiceB;
    private String homePage;
    private boolean gradleSupport;

    SupportedServer(String code, String displayName, List<MicroProfileVersion> mpVersions, String jarFileName
```

### NonFinalFieldInEnum
Non-final field `portServiceA` in enum 'SupportedServer'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/SupportedServer.java`
#### Snippet
```java
    private String jarFileName;
    private String jarParameters;
    private String portServiceA;
    private String portServiceB;
    private String homePage;
```

### NonFinalFieldInEnum
Non-final field `mpVersions` in enum 'SupportedServer'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/SupportedServer.java`
#### Snippet
```java
    private String code;
    private String displayName;
    private List<MicroProfileVersion> mpVersions;
    private String jarFileName;
    private String jarParameters;
```

### NonFinalFieldInEnum
Non-final field `displayName` in enum 'SupportedServer'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/SupportedServer.java`
#### Snippet
```java

    private String code;
    private String displayName;
    private List<MicroProfileVersion> mpVersions;
    private String jarFileName;
```

### NonFinalFieldInEnum
Non-final field `code` in enum 'SupportedServer'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/SupportedServer.java`
#### Snippet
```java
    // @formatter:on

    private String code;
    private String displayName;
    private List<MicroProfileVersion> mpVersions;
```

### NonFinalFieldInEnum
Non-final field `homePage` in enum 'SupportedServer'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/SupportedServer.java`
#### Snippet
```java
    private String portServiceA;
    private String portServiceB;
    private String homePage;
    private boolean gradleSupport;

```

### NonFinalFieldInEnum
Non-final field `jarFileName` in enum 'SupportedServer'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/SupportedServer.java`
#### Snippet
```java
    private String displayName;
    private List<MicroProfileVersion> mpVersions;
    private String jarFileName;
    private String jarParameters;
    private String portServiceA;
```

### NonFinalFieldInEnum
Non-final field `portServiceB` in enum 'SupportedServer'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/SupportedServer.java`
#### Snippet
```java
    private String jarParameters;
    private String portServiceA;
    private String portServiceB;
    private String homePage;
    private boolean gradleSupport;
```

### NonFinalFieldInEnum
Non-final field `code` in enum 'MicroProfileVersion'
in `src/main/java/org/eclipse/microprofile/starter/core/model/MicroProfileVersion.java`
#### Snippet
```java
    // @formatter:on

    private String code;
    private String depVersion;
    private String label;
```

### NonFinalFieldInEnum
Non-final field `depVersion` in enum 'MicroProfileVersion'
in `src/main/java/org/eclipse/microprofile/starter/core/model/MicroProfileVersion.java`
#### Snippet
```java

    private String code;
    private String depVersion;
    private String label;
    private Set<String> alternatives;
```

### NonFinalFieldInEnum
Non-final field `alternatives` in enum 'MicroProfileVersion'
in `src/main/java/org/eclipse/microprofile/starter/core/model/MicroProfileVersion.java`
#### Snippet
```java
    private String depVersion;
    private String label;
    private Set<String> alternatives;

    MicroProfileVersion(String code, String label) {
```

### NonFinalFieldInEnum
Non-final field `label` in enum 'MicroProfileVersion'
in `src/main/java/org/eclipse/microprofile/starter/core/model/MicroProfileVersion.java`
#### Snippet
```java
    private String code;
    private String depVersion;
    private String label;
    private Set<String> alternatives;

```

### NonFinalFieldInEnum
Non-final field `artifactId` in enum 'StandaloneMPSpec'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/StandaloneMPSpec.java`
#### Snippet
```java
    private List<ServerMPVersion> serverRestrictions;
    private String groupId;
    private String artifactId;

    StandaloneMPSpec(String code,
```

### NonFinalFieldInEnum
Non-final field `code` in enum 'StandaloneMPSpec'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/StandaloneMPSpec.java`
#### Snippet
```java
    ;

    private String code;
    private String label;
    private String tagURL;
```

### NonFinalFieldInEnum
Non-final field `label` in enum 'StandaloneMPSpec'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/StandaloneMPSpec.java`
#### Snippet
```java

    private String code;
    private String label;
    private String tagURL;
    private String description;
```

### NonFinalFieldInEnum
Non-final field `groupId` in enum 'StandaloneMPSpec'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/StandaloneMPSpec.java`
#### Snippet
```java
    private String description;
    private List<ServerMPVersion> serverRestrictions;
    private String groupId;
    private String artifactId;

```

### NonFinalFieldInEnum
Non-final field `serverRestrictions` in enum 'StandaloneMPSpec'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/StandaloneMPSpec.java`
#### Snippet
```java
    private String tagURL;
    private String description;
    private List<ServerMPVersion> serverRestrictions;
    private String groupId;
    private String artifactId;
```

### NonFinalFieldInEnum
Non-final field `tagURL` in enum 'StandaloneMPSpec'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/StandaloneMPSpec.java`
#### Snippet
```java
    private String code;
    private String label;
    private String tagURL;
    private String description;
    private List<ServerMPVersion> serverRestrictions;
```

### NonFinalFieldInEnum
Non-final field `description` in enum 'StandaloneMPSpec'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/StandaloneMPSpec.java`
#### Snippet
```java
    private String label;
    private String tagURL;
    private String description;
    private List<ServerMPVersion> serverRestrictions;
    private String groupId;
```

### NonFinalFieldInEnum
Non-final field `mpVersions` in enum 'MicroprofileSpec'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/MicroprofileSpec.java`
#### Snippet
```java
    private String tagURL;
    private String description;
    private List<MicroProfileVersion> mpVersions;

    MicroprofileSpec(String code, String label, String description, String tagURL, List<MicroProfileVersion> mpVersions) {
```

### NonFinalFieldInEnum
Non-final field `label` in enum 'MicroprofileSpec'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/MicroprofileSpec.java`
#### Snippet
```java

    private String code;
    private String label;
    private String tagURL;
    private String description;
```

### NonFinalFieldInEnum
Non-final field `tagURL` in enum 'MicroprofileSpec'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/MicroprofileSpec.java`
#### Snippet
```java
    private String code;
    private String label;
    private String tagURL;
    private String description;
    private List<MicroProfileVersion> mpVersions;
```

### NonFinalFieldInEnum
Non-final field `description` in enum 'MicroprofileSpec'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/MicroprofileSpec.java`
#### Snippet
```java
    private String label;
    private String tagURL;
    private String description;
    private List<MicroProfileVersion> mpVersions;

```

### NonFinalFieldInEnum
Non-final field `code` in enum 'MicroprofileSpec'
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/MicroprofileSpec.java`
#### Snippet
```java
    // @formatter:on

    private String code;
    private String label;
    private String tagURL;
```

### NonFinalFieldInEnum
Non-final field `mode` in enum 'BeansXMLMode'
in `src/main/java/org/eclipse/microprofile/starter/core/model/BeansXMLMode.java`
#### Snippet
```java
    IMPLICIT("implicit"), ANNOTATED("annotated"), ALL("all");

    private String mode;

    BeansXMLMode(String mode) {
```

### NonFinalFieldInEnum
Non-final field `label` in enum 'JavaSEVersion'
in `src/main/java/org/eclipse/microprofile/starter/core/model/JavaSEVersion.java`
#### Snippet
```java

    private String code;
    private String label;

    JavaSEVersion(String code, String label) {
```

### NonFinalFieldInEnum
Non-final field `code` in enum 'JavaSEVersion'
in `src/main/java/org/eclipse/microprofile/starter/core/model/JavaSEVersion.java`
#### Snippet
```java
    // @formatter:on

    private String code;
    private String label;

```

### NonFinalFieldInEnum
Non-final field `code` in enum 'ViewType'
in `src/main/java/org/eclipse/microprofile/starter/core/model/ViewType.java`
#### Snippet
```java
    JSF("jsf", "JSF"), REST("rest", "JAX-RS");

    private String code;
    private String label;

```

### NonFinalFieldInEnum
Non-final field `label` in enum 'ViewType'
in `src/main/java/org/eclipse/microprofile/starter/core/model/ViewType.java`
#### Snippet
```java

    private String code;
    private String label;

    ViewType(String code, String label) {
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/server/ThorntailServer.java`
#### Snippet
```java
            String resourceDirectory = getResourceDirectory(model, false);
            directoryCreator.createDirectory(resourceDirectory);
            templateEngine.processTemplateFile(resourceDirectory, "project-defaults.yml", alternatives, variables);
            templateEngine.processTemplateFile(resourceDirectory, "jwt-roles.properties", alternatives, variables);

            String metaInfDirectory = getResourceDirectory(model, false) + "/META-INF";

            directoryCreator.createDirectory(metaInfDirectory);
            templateEngine.processTemplateFile(metaInfDirectory, "publicKey.pem", "MP-JWT-SIGNER", alternatives, variables);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/eclipse/microprofile/starter/core/artifacts/CDICreator.java`
#### Snippet
```java
        BeansXMLMode mode = getMode(model);
        if (mode == BeansXMLMode.IMPLICIT) {
            // implicit means no beans.xml
            return;
        }
        Set<String> alternatives = model.getParameter(JessieModel.Parameter.ALTERNATIVES);
        Map<String, String> variables = model.getVariables();
        variables.put("beans_xml_mode", mode.getMode());
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/eclipse/microprofile/starter/rest/APIService.java`
#### Snippet
```java
        if (StringUtils.isBlank(p.getGroupId())) {
            p.setGroupId(EngineData.DEFAULT_GROUP_ID);
        }
        if (StringUtils.isBlank(p.getArtifactId())) {
            p.setArtifactId(EngineData.DEFAULT_ARTIFACT_ID);
        }
        if (p.getMpVersion() == null || p.getMpVersion() == MicroProfileVersion.NONE) {
            p.setMpVersion(
                    p.getSupportedServer().getMpVersions().get(p.getSupportedServer().getMpVersions().size() - 1));
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/eclipse/microprofile/starter/rest/APIService.java`
#### Snippet
```java
        JessieModel model = new JessieModel();
        model.setDirectory(ed.getMavenData().getArtifactId());

        JessieMaven mavenModel = new JessieMaven();
        mavenModel.setGroupId(ed.getMavenData().getGroupId());
        mavenModel.setArtifactId(ed.getMavenData().getArtifactId());
        model.setMaven(mavenModel);

        JessieSpecification specifications = new JessieSpecification();
```

### DuplicatedCode
Duplicated code
in `src/main/webapp/resources/css/starter-1.4.css`
#### Snippet
```java
.ui-chkbox-box .ui-icon::before {
    content: '\f00c';
    font-family: FontAwesome;
    font-weight: 400;
    font-style: normal;
    color: #FFF;
    text-decoration: inherit;
    line-height: 1em;
    font-size: 13px;
    position: absolute;
    left: 2px;
    top: 2px;
}
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

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/org/eclipse/microprofile/starter/addon/microprofile/servers/model/StandaloneMPSpec.java`
#### Snippet
```java
            "https://github.com/eclipse/microprofile-graphql/releases/tag/%s",
            "GraphQL - GraphQL is a query language for APIs and a library for fulfilling those queries with your existing data.",
            Arrays.asList(ServerMPVersion.of(SupportedServer.LIBERTY)),
            "org.eclipse.microprofile.graphql",
            "microprofile-graphql-api"
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

