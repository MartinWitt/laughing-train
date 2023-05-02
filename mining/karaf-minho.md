# karaf-minho 
 
# Bad smells
I found 82 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldMayBeFinal | 22 | false |
| AutoCloseableResource | 12 | false |
| JavadocDeclaration | 6 | false |
| FieldCanBeLocal | 6 | false |
| UnusedAssignment | 5 | false |
| UNCHECKED_WARNING | 4 | false |
| ConstantValue | 4 | false |
| DataFlowIssue | 3 | false |
| MismatchedCollectionQueryUpdate | 3 | false |
| DuplicatedCode | 3 | false |
| DuplicateThrows | 3 | false |
| UNUSED_IMPORT | 2 | false |
| StringOperationCanBeSimplified | 2 | false |
| IgnoreResultOfCall | 2 | false |
| ClassGetClass | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| RedundantCast | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| FinalStaticMethod | 1 | false |
## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/maven/Parser.java`
#### Snippet
```java
            sb.append("mvn:");
            if (parts != null) {
                parts.put("artifactId", artifactId);
                parts.put("version", version);
                parts.put("classifier", classifier);
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/maven/Parser.java`
#### Snippet
```java
            if (parts != null) {
                parts.put("artifactId", artifactId);
                parts.put("version", version);
                parts.put("classifier", classifier);
                parts.put("type", type);
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/maven/Parser.java`
#### Snippet
```java
                parts.put("artifactId", artifactId);
                parts.put("version", version);
                parts.put("classifier", classifier);
                parts.put("type", type);
            }
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/maven/Parser.java`
#### Snippet
```java
                parts.put("version", version);
                parts.put("classifier", classifier);
                parts.put("type", type);
            }
            for (int j = 0; j < p.length - 3; j++) {
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'InputStream' used without 'try'-with-resources statement
in `services/minho-config-json/src/main/java/org/apache/karaf/minho/config/json/JsonConfigLoaderService.java`
#### Snippet
```java
            log.info("Loading JSON configuration from " + System.getProperty("minho.config"));
            config = loadJson(new FileInputStream(System.getProperty("minho.config")));
        } else if (JsonConfigLoaderService.class.getResourceAsStream("/META-INF/minho.json") != null) {
            log.info("Loading JSON configuration from classpath META-INF/minho.json");
            config = loadJson(JsonConfigLoaderService.class.getResourceAsStream("/META-INF/minho.json"));
```

### AutoCloseableResource
'InputStream' used without 'try'-with-resources statement
in `services/minho-config-json/src/main/java/org/apache/karaf/minho/config/json/JsonConfigLoaderService.java`
#### Snippet
```java
            log.info("Loading JSON configuration from classpath META-INF/minho.json");
            config = loadJson(JsonConfigLoaderService.class.getResourceAsStream("/META-INF/minho.json"));
        } else if (JsonConfigLoaderService.class.getResourceAsStream("/minho.json") != null) {
            log.info("Loading JSON configuration from classpath minho.json");
            config = loadJson(JsonConfigLoaderService.class.getResourceAsStream("/minho.json"));
```

### AutoCloseableResource
'InputStream' used without 'try'-with-resources statement
in `services/minho-banner/src/main/java/org/apache/karaf/minho/banner/WelcomeBannerService.java`
#### Snippet
```java
        }

        if (WelcomeBannerService.class.getResourceAsStream("/banner.txt") != null) {
            try {
                log.info("\n" + readBanner(new InputStreamReader(WelcomeBannerService.class.getResourceAsStream("/banner.txt"))));
```

### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `services/minho-extractor/src/main/java/org/apache/karaf/minho/extractor/ExtractorService.java`
#### Snippet
```java
                try (FileSystem fs = FileSystems.newFileSystem(resource.toURI(), Collections.emptyMap())) {
                    String finalTarget = target;
                    Files.walk(fs.getPath(".")).filter(Files::isRegularFile)
                            .forEach(path -> {
                                try {
```

### AutoCloseableResource
'InputStream' used without 'try'-with-resources statement
in `services/minho-config-properties/src/main/java/org/apache/karaf/minho/config/properties/PropertiesConfigLoaderService.java`
#### Snippet
```java
            log.info("Loading configuration from " + System.getProperty("minho.config"));
            properties.load(new FileInputStream(System.getProperty("minho.config")));
        } else if (PropertiesConfigLoaderService.class.getResourceAsStream("/META-INF/minho.properties") != null) {
            log.info("Loading configuration from classpath META-INF/minho.properties");
            properties.load(PropertiesConfigLoaderService.class.getResourceAsStream("/META-INF/minho.properties"));
```

### AutoCloseableResource
'InputStream' used without 'try'-with-resources statement
in `services/minho-config-properties/src/main/java/org/apache/karaf/minho/config/properties/PropertiesConfigLoaderService.java`
#### Snippet
```java
            log.info("Loading configuration from classpath META-INF/minho.properties");
            properties.load(PropertiesConfigLoaderService.class.getResourceAsStream("/META-INF/minho.properties"));
        } else if (PropertiesConfigLoaderService.class.getResourceAsStream("/minho.properties") != null) {
            log.info("Loading configuration from classpath minho.properties");
            properties.load(PropertiesConfigLoaderService.class.getResourceAsStream("/minho.properties"));
```

### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/Runtime.java`
#### Snippet
```java
        Path zipArchive = baseFolder.resolve(name + ".zip");
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(zipArchive.toFile()))) {
            Files.list(baseFolder).forEach(file -> {
                try {
                    if (!file.equals(zipArchive)) {
```

### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/Runtime.java`
#### Snippet
```java
            target.putNextEntry(entry);
            target.closeEntry();
            Files.list(source).forEach(child -> {
                try {
                    addJarContent(child, base, target);
```

### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/Runtime.java`
#### Snippet
```java
        String minhoLib = (properties != null && properties.get("minho.lib") != null) ? properties.get("minho.lib").toString() : "";
        Path libFolder = baseFolder.resolve(minhoLib);
        Files.list(libFolder).forEach(artifact -> {
            if (artifact.toString().endsWith(".jar")) {

```

### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/Runtime.java`
#### Snippet
```java
        }
        try (JarOutputStream uberJar = new JarOutputStream(new FileOutputStream(uberJarPath.toFile()), manifest)) {
            Files.list(exploded).forEach(file -> {
                log.info("Adding jar entry " + file);
                try {
```

### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/Runtime.java`
#### Snippet
```java
        // cleanup
        if (properties != null && properties.get("minho.cleanup") != null && properties.get("minho.cleanup").toString().equalsIgnoreCase("true")) {
            Files.walk(libFolder).map(Path::toFile).forEach(File::delete);
            Files.delete(libFolder);
        }
```

### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/Runtime.java`
#### Snippet
```java
            target.putNextEntry(entry);
            target.closeEntry();
            Files.list(source).forEach(child -> {
                try {
                    addZipContent(child, base, target);
```

## RuleId[id=ClassGetClass]
### ClassGetClass
'getClass()' is called on Class instance
in `services/minho-http/src/main/java/org/apache/karaf/minho/web/jetty/JettyWebContainerService.java`
#### Snippet
```java

    public ServletHolder addServlet(Class<? extends Servlet> servlet, String contextPath) throws Exception {
        log.info("Adding servlet " + servlet.getClass().getName() + " with context " + contextPath);
        return servlets.addServlet(servlet, contextPath);
    }
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Condition `service instanceof Servlet` is redundant and can be replaced with a null check
in `services/minho-http/src/main/java/org/apache/karaf/minho/web/jetty/JettyWebContainerService.java`
#### Snippet
```java
    private void addServlets(ServiceRegistry serviceRegistry) {
        serviceRegistry.getAll().values().stream().forEach(service -> {
            if (service instanceof Servlet) {
                if (!service.properties().containsKey("contextPath")) {
                    log.warning("Servlet " + service.getClass().getName() + " doesn't have contextPath property");
```

### DataFlowIssue
Argument `WelcomeBannerService.class.getResourceAsStream("/banner.txt")` might be null
in `services/minho-banner/src/main/java/org/apache/karaf/minho/banner/WelcomeBannerService.java`
#### Snippet
```java
        if (WelcomeBannerService.class.getResourceAsStream("/banner.txt") != null) {
            try {
                log.info("\n" + readBanner(new InputStreamReader(WelcomeBannerService.class.getResourceAsStream("/banner.txt"))));
            } catch (Exception e) {
                // no-op
```

### DataFlowIssue
Argument `baseDirectory` might be null
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/Runtime.java`
#### Snippet
```java
        String baseDirectory = (properties != null && properties.get("base.directory") != null) ? properties.get("base.directory").toString() : name;
        log.info("Creating Minho runtime package in folder " + baseDirectory);
        baseFolder = Paths.get(baseDirectory);
        Files.createDirectories(baseFolder);
        workingFolder = Files.createTempDirectory("temp_" + name);
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.io.File;`
in `boot/src/main/java/org/apache/karaf/minho/boot/Main.java`
#### Snippet
```java
import lombok.extern.java.Log;

import java.io.File;
import java.io.IOException;
import java.net.URL;
```

### UNUSED_IMPORT
Unused import `import java.util.Hashtable;`
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/JmxService.java`
#### Snippet
```java
import javax.management.ObjectName;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `services/minho-http/src/main/java/org/apache/karaf/minho/web/jetty/JettyWebContainerService.java`
#### Snippet
```java

    private void addServlets(ServiceRegistry serviceRegistry) {
        serviceRegistry.getAll().values().stream().forEach(service -> {
            if (service instanceof Servlet) {
                if (!service.properties().containsKey("contextPath")) {
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `services/minho-extractor/src/main/java/org/apache/karaf/minho/extractor/ExtractorService.java`
#### Snippet
```java
        String sources = "resources";
        if (config.getProperty("extractor.sources") != null) {
            sources = config.getProperty("extractor.sources").toString();
        }
        String target = ".";
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `services/minho-extractor/src/main/java/org/apache/karaf/minho/extractor/ExtractorService.java`
#### Snippet
```java
        String target = ".";
        if (config.getProperty("extractor.target") != null) {
            target = config.getProperty("extractor.target").toString();
        }

```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param m_classifier` tag description is missing
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/maven/Parser.java`
#### Snippet
```java
    /**
     * Changes parsed classifier - to allow printing mvn: URI with changed classifier
     * @param m_classifier
     */
    public void setClassifier(String m_classifier)
```

### JavadocDeclaration
`@param m_version` tag description is missing
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/maven/Parser.java`
#### Snippet
```java
    /**
     * Changes parsed version - to allow printing mvn: URI with changed version
     * @param m_version
     */
    public void setVersion(String m_version)
```

### JavadocDeclaration
`@param m_group` tag description is missing
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/maven/Parser.java`
#### Snippet
```java
    /**
     * Changes parsed group - to allow printing mvn: URI with changed groupId
     * @param m_group
     */
    public void setGroup(String m_group)
```

### JavadocDeclaration
`@return` tag description is missing
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/maven/Parser.java`
#### Snippet
```java
    /**
     * Prints parsed mvn: URI (after possible change of any component)
     * @return
     */
    public String toMvnURI()
```

### JavadocDeclaration
`@param m_type` tag description is missing
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/maven/Parser.java`
#### Snippet
```java
    /**
     * Changes parsed type - to allow printing mvn: URI with changed type
     * @param m_type
     */
    public void setType(String m_type)
```

### JavadocDeclaration
`@param m_artifact` tag description is missing
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/maven/Parser.java`
#### Snippet
```java
    /**
     * Changes parsed artifact - to allow printing mvn: URI with changed artifactId
     * @param m_artifact
     */
    public void setArtifact(String m_artifact)
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `properties.get(...)` to `String` is redundant
in `services/minho-spring-boot/src/main/java/org/apache/karaf/minho/springboot/SpringBootApplicationManagerService.java`
#### Snippet
```java
            main.setAccessible(true);
            main.invoke(null, (Object)
                    Arrays.stream(Optional.ofNullable((String) properties.get("args")).orElse("").split(" ")).map(String::trim).toArray(String[]::new));
        } finally {
            Thread.currentThread().setContextClassLoader(original);
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `urls` may be 'final'
in `boot/src/main/java/org/apache/karaf/minho/boot/config/Profile.java`
#### Snippet
```java
    private String name;
    private Map<String, String> properties = new HashMap<>();
    private List<String> urls = new ArrayList<>();

    public String getProperty(String key) {
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `boot/src/main/java/org/apache/karaf/minho/boot/config/Profile.java`
#### Snippet
```java

    private String name;
    private Map<String, String> properties = new HashMap<>();
    private List<String> urls = new ArrayList<>();

```

### FieldMayBeFinal
Field `properties` may be 'final'
in `boot/src/main/java/org/apache/karaf/minho/boot/config/Application.java`
#### Snippet
```java
    private String type;
    private String profile;
    private Map<String, String> properties = new HashMap<>();

    public String getProperty(String key) {
```

### FieldMayBeFinal
Field `profiles` may be 'final'
in `boot/src/main/java/org/apache/karaf/minho/boot/config/Config.java`
#### Snippet
```java

    private Map<String, String> properties = new HashMap<>();
    private List<Profile> profiles = new ArrayList<>();
    private List<Application> applications = new ArrayList<>();

```

### FieldMayBeFinal
Field `applications` may be 'final'
in `boot/src/main/java/org/apache/karaf/minho/boot/config/Config.java`
#### Snippet
```java
    private Map<String, String> properties = new HashMap<>();
    private List<Profile> profiles = new ArrayList<>();
    private List<Application> applications = new ArrayList<>();

    public void merge(final Config config) {
```

### FieldMayBeFinal
Field `envKeyPattern` may be 'final'
in `boot/src/main/java/org/apache/karaf/minho/boot/config/Config.java`
#### Snippet
```java
public class Config {

    private static Pattern envKeyPattern = Pattern.compile("\\.");

    private Map<String, String> properties = new HashMap<>();
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `boot/src/main/java/org/apache/karaf/minho/boot/config/Config.java`
#### Snippet
```java
    private static Pattern envKeyPattern = Pattern.compile("\\.");

    private Map<String, String> properties = new HashMap<>();
    private List<Profile> profiles = new ArrayList<>();
    private List<Application> applications = new ArrayList<>();
```

### FieldMayBeFinal
Field `profiles` may be 'final'
in `boot/src/main/java/org/apache/karaf/minho/boot/service/ClassLoaderService.java`
#### Snippet
```java
public class ClassLoaderService implements Service, AutoCloseable {

    private Map<String, URLClassLoader> profiles = new HashMap<>();

    @Override
```

### FieldMayBeFinal
Field `shutdownCallbacks` may be 'final'
in `boot/src/main/java/org/apache/karaf/minho/boot/service/LifeCycleService.java`
#### Snippet
```java

    private List<Runnable> startCallbacks = new ArrayList<>();
    private List<Runnable> shutdownCallbacks = new ArrayList<>();

    @Override
```

### FieldMayBeFinal
Field `startCallbacks` may be 'final'
in `boot/src/main/java/org/apache/karaf/minho/boot/service/LifeCycleService.java`
#### Snippet
```java
public class LifeCycleService implements Service, AutoCloseable {

    private List<Runnable> startCallbacks = new ArrayList<>();
    private List<Runnable> shutdownCallbacks = new ArrayList<>();

```

### FieldMayBeFinal
Field `registerWithFactory` may be 'final'
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/MBeanServerFactory.java`
#### Snippet
```java
    private String defaultDomain;
    private String agentId;
    private boolean registerWithFactory = true;
    private boolean newlyRegistered = false;
    private MBeanServer server;
```

### FieldMayBeFinal
Field `locateExistingServerIfPossible` may be 'final'
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/MBeanServerFactory.java`
#### Snippet
```java
public class MBeanServerFactory {

    private boolean locateExistingServerIfPossible = false;
    private String defaultDomain;
    private String agentId;
```

### FieldMayBeFinal
Field `create` may be 'final'
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/ConnectorServerFactory.java`
#### Snippet
```java
    private String rmiServerHost;
    private boolean locate;
    private boolean create = true;
    private boolean locallyCreated;
    private int port = Registry.REGISTRY_PORT;
```

### FieldMayBeFinal
Field `threaded` may be 'final'
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/ConnectorServerFactory.java`
#### Snippet
```java
    private RMIJRMPServerImpl rmiServer;
    private ObjectName objectName;
    private boolean threaded = false;
    private boolean daemon = false;

```

### FieldMayBeFinal
Field `port` may be 'final'
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/ConnectorServerFactory.java`
#### Snippet
```java
    private boolean create = true;
    private boolean locallyCreated;
    private int port = Registry.REGISTRY_PORT;
    private String host;
    private Remote remoteServerStub;
```

### FieldMayBeFinal
Field `rmiServerHost` may be 'final'
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/ConnectorServerFactory.java`
#### Snippet
```java

    private static class MinhoRMIServerSocketFactory implements RMIServerSocketFactory {
        private String rmiServerHost;

        public MinhoRMIServerSocketFactory(String rmiServerHost) {
```

### FieldMayBeFinal
Field `daemon` may be 'final'
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/ConnectorServerFactory.java`
#### Snippet
```java
    private ObjectName objectName;
    private boolean threaded = false;
    private boolean daemon = false;

    public void init() throws Exception {
```

### FieldMayBeFinal
Field `baseFolder` may be 'final'
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/Runtime.java`
#### Snippet
```java
    private Config config;

    private Path baseFolder;
    private Path workingFolder;

```

### FieldMayBeFinal
Field `workingFolder` may be 'final'
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/Runtime.java`
#### Snippet
```java

    private Path baseFolder;
    private Path workingFolder;

    public Runtime(String name, String version, Map<String, Object> properties) throws Exception {
```

### FieldMayBeFinal
Field `version` may be 'final'
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/Runtime.java`
#### Snippet
```java

    private String name;
    private String version;
    private Map<String, Object> properties = new HashMap<>();
    private List<String> dependencies = new LinkedList<>();
```

### FieldMayBeFinal
Field `dependencies` may be 'final'
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/Runtime.java`
#### Snippet
```java
    private String version;
    private Map<String, Object> properties = new HashMap<>();
    private List<String> dependencies = new LinkedList<>();
    private Config config;

```

### FieldMayBeFinal
Field `name` may be 'final'
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/Runtime.java`
#### Snippet
```java
public class Runtime {

    private String name;
    private String version;
    private Map<String, Object> properties = new HashMap<>();
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `profiles` are updated, but never queried
in `boot/src/main/java/org/apache/karaf/minho/boot/config/Config.java`
#### Snippet
```java

    private Map<String, String> properties = new HashMap<>();
    private List<Profile> profiles = new ArrayList<>();
    private List<Application> applications = new ArrayList<>();

```

### MismatchedCollectionQueryUpdate
Contents of collection `applications` are updated, but never queried
in `boot/src/main/java/org/apache/karaf/minho/boot/config/Config.java`
#### Snippet
```java
    private Map<String, String> properties = new HashMap<>();
    private List<Profile> profiles = new ArrayList<>();
    private List<Application> applications = new ArrayList<>();

    public void merge(final Config config) {
```

### MismatchedCollectionQueryUpdate
Contents of collection `dependencies` are queried, but never updated
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/Runtime.java`
#### Snippet
```java
    private String version;
    private Map<String, Object> properties = new HashMap<>();
    private List<String> dependencies = new LinkedList<>();
    private Config config;

```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/Runtime.java`
#### Snippet
```java
            entry.setTime(Files.getLastModifiedTime(source).toMillis());
            target.putNextEntry(entry);
            try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(source.toFile()))) {
                byte[] buffer = new byte[1024];
                while (true) {
                    int count = in.read(buffer);
                    if (count == -1) {
                        break;
                    }
                    target.write(buffer, 0, count);
                }
                target.closeEntry();
            }
```

### DuplicatedCode
Duplicated code
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/Runtime.java`
#### Snippet
```java
            try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(source.toFile()))) {
                byte[] buffer = new byte[1024];
                while (true) {
                    int count = in.read(buffer);
                    if (count == -1) {
                        break;
                    }
                    target.write(buffer, 0, count);
                }
                target.closeEntry();
            }
```

### DuplicatedCode
Duplicated code
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/maven/Parser.java`
#### Snippet
```java
        DefaultSyncContextFactory syncContextFactory = new DefaultSyncContextFactory();
        DefaultRepositoryEventDispatcher repositoryEventDispatcher = new DefaultRepositoryEventDispatcher();
        DefaultVersionResolver versionResolver = new DefaultVersionResolver();
        DefaultMetadataResolver metadataResolver = new DefaultMetadataResolver();
        metadataResolver.setSyncContextFactory(syncContextFactory);
        metadataResolver.setRepositoryEventDispatcher(repositoryEventDispatcher);
        versionResolver.setMetadataResolver(metadataResolver);
        versionResolver.setSyncContextFactory(syncContextFactory);
        versionResolver.setRepositoryEventDispatcher(repositoryEventDispatcher);

        DefaultRepositorySystem repositorySystem = new DefaultRepositorySystem();
        repositorySystem.setLocalRepositoryProvider(localRepositoryProvider);
        repositorySystem.setVersionResolver(versionResolver);
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `ss` is redundant
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/ConnectorServerFactory.java`
#### Snippet
```java
                return new LocalOnlyServerSocket(ss);
            } else {
                final ServerSocket ss = ServerSocketFactory.getDefault().createServerSocket(port, 50, InetAddress.getByName(rmiServerHost));
                return ss;
            }
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.rmi.RemoteException', in the throws list already.
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/ConnectorServerFactory.java`
#### Snippet
```java

        @Override
        public void bind(String s, Remote remote) throws RemoteException, AlreadyBoundException, AccessException {
        }

```

### DuplicateThrows
There is a more general exception, 'java.rmi.RemoteException', in the throws list already.
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/ConnectorServerFactory.java`
#### Snippet
```java

        @Override
        public void unbind(String s) throws RemoteException, NotBoundException, AccessException {
        }

```

### DuplicateThrows
There is a more general exception, 'java.rmi.RemoteException', in the throws list already.
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/ConnectorServerFactory.java`
#### Snippet
```java

        @Override
        public void rebind(String s, Remote remote) throws RemoteException, AccessException {
        }

```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `boot/src/main/java/org/apache/karaf/minho/boot/Main.java`
#### Snippet
```java
public class Main {

    public static final void main(String[] args) throws Exception {
        boolean minhoJar = false;
        minhoJar = (System.getenv("MINHO_JAR") != null) ? System.getenv("MINHO_JAR").equalsIgnoreCase("true") : minhoJar;
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `classLoader` initializer `null` is redundant
in `services/minho-spring-boot/src/main/java/org/apache/karaf/minho/springboot/SpringBootApplicationManagerService.java`
#### Snippet
```java
    private String start(String url, String profile, ClassLoaderService classLoaderService, Map<String, String> properties) throws Exception {
        log.info("Starting Spring Boot module " + url);
        URLClassLoader classLoader = null;
        if (profile == null) {
            classLoader = new URLClassLoader(new URL[]{new URL(url)}, this.getClass().getClassLoader());
```

### UnusedAssignment
Variable `line` initializer `null` is redundant
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/Runtime.java`
#### Snippet
```java
                                try (BufferedWriter writer = new BufferedWriter(new FileWriter(service.toFile(), true))) {
                                    try (BufferedReader reader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(entry)))) {
                                        String line = null;
                                        while ((line = reader.readLine()) != null) {
                                            if (!line.startsWith("#")) {
```

### UnusedAssignment
Variable `is` initializer `null` is redundant
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/Runtime.java`
#### Snippet
```java
                                }
                            } else {
                                InputStream is = null;
                                try {
                                    is = jarFile.getInputStream(entry);
```

### UnusedAssignment
Variable `readCount` initializer `0` is redundant
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/Runtime.java`
#### Snippet
```java
                                    try (FileOutputStream os = new FileOutputStream(new File(exploded.toFile(), name))) {
                                        byte[] buffer = new byte[1024];
                                        int readCount = 0;
                                        while ((readCount = is.read(buffer)) >= 0) {
                                            os.write(buffer, 0, readCount);
```

### UnusedAssignment
Variable `properties` initializer `new HashMap<>()` is redundant
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/Runtime.java`
#### Snippet
```java
    private String name;
    private String version;
    private Map<String, Object> properties = new HashMap<>();
    private List<String> dependencies = new LinkedList<>();
    private Config config;
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `minhoJar` is always 'false'
in `boot/src/main/java/org/apache/karaf/minho/boot/Main.java`
#### Snippet
```java
    public static final void main(String[] args) throws Exception {
        boolean minhoJar = false;
        minhoJar = (System.getenv("MINHO_JAR") != null) ? System.getenv("MINHO_JAR").equalsIgnoreCase("true") : minhoJar;
        minhoJar = (System.getProperty("minho.jar") != null) ? System.getProperty("minho.jar").equalsIgnoreCase("true") : minhoJar;

```

### ConstantValue
Condition `connectorServerFactory != null` is always `true`
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/JmxService.java`
#### Snippet
```java

        lifeCycleService.onShutdown(() -> {
            if (connectorServerFactory != null) {
                try {
                    connectorServerFactory.destroy();
```

### ConstantValue
Condition `mBeanServerFactory != null` is always `true`
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/JmxService.java`
#### Snippet
```java
                }
            }
            if (mBeanServerFactory != null) {
                try {
                    mBeanServerFactory.destroy();
```

### ConstantValue
Value `includeTransitive` is always 'true'
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/maven/Parser.java`
#### Snippet
```java
                    // recursion
                    File transitivePom = Parser.resolve("mvn:" + dependency.getGroupId() + "/" + dependency.getArtifactId() + "/" + dependency.getVersion() + "/pom");
                    Parser.getDependencies(transitivePom, dependencies, includeTransitive);
                }
            }
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/MBeanServerFactory.java`
#### Snippet
```java
    private String defaultDomain;
    private String agentId;
    private boolean registerWithFactory = true;
    private boolean newlyRegistered = false;
    private MBeanServer server;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/MBeanServerFactory.java`
#### Snippet
```java
public class MBeanServerFactory {

    private boolean locateExistingServerIfPossible = false;
    private String defaultDomain;
    private String agentId;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/ConnectorServerFactory.java`
#### Snippet
```java
    private String rmiServerHost;
    private boolean locate;
    private boolean create = true;
    private boolean locallyCreated;
    private int port = Registry.REGISTRY_PORT;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/ConnectorServerFactory.java`
#### Snippet
```java
    private RMIJRMPServerImpl rmiServer;
    private ObjectName objectName;
    private boolean threaded = false;
    private boolean daemon = false;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/ConnectorServerFactory.java`
#### Snippet
```java
    private boolean create = true;
    private boolean locallyCreated;
    private int port = Registry.REGISTRY_PORT;
    private String host;
    private Remote remoteServerStub;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/ConnectorServerFactory.java`
#### Snippet
```java
    private ObjectName objectName;
    private boolean threaded = false;
    private boolean daemon = false;

    public void init() throws Exception {
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/Runtime.java`
#### Snippet
```java
        // cleanup
        if (properties != null && properties.get("minho.cleanup") != null && properties.get("minho.cleanup").toString().equalsIgnoreCase("true")) {
            Files.walk(libFolder).map(Path::toFile).forEach(File::delete);
            Files.delete(libFolder);
        }
```

### IgnoreResultOfCall
Result of `File.setExecutable()` is ignored
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/Runtime.java`
#### Snippet
```java
        }

        minhoSh.setExecutable(true);
    }

```

