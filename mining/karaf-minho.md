# karaf-minho 
 
# Bad smells
I found 116 bad smells with 21 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| CodeBlock2Expr | 12 | true |
| DynamicRegexReplaceableByCompiledPattern | 11 | false |
| MissortedModifiers | 9 | false |
| SystemOutErr | 7 | false |
| SizeReplaceableByIsEmpty | 6 | true |
| UseOfPropertiesAsHashtable | 6 | false |
| RedundantFieldInitialization | 6 | false |
| IOResource | 5 | false |
| AssignmentToMethodParameter | 5 | false |
| UnusedAssignment | 5 | false |
| NonSynchronizedMethodOverridesSynchronizedMethod | 4 | false |
| UNUSED_IMPORT | 4 | false |
| ConstantValue | 4 | false |
| NestedAssignment | 3 | false |
| ReturnNull | 3 | false |
| DuplicateThrows | 3 | false |
| UtilityClassWithoutPrivateConstructor | 2 | true |
| DataFlowIssue | 2 | false |
| SimplifyStreamApiCallChains | 2 | false |
| StringOperationCanBeSimplified | 2 | false |
| IgnoreResultOfCall | 2 | false |
| ZeroLengthArrayInitialization | 2 | false |
| Java8MapForEach | 1 | false |
| ClassGetClass | 1 | false |
| AssignmentToStaticFieldFromInstanceMethod | 1 | false |
| FinalStaticMethod | 1 | false |
| StringEqualsEmptyString | 1 | false |
| UnnecessaryFullyQualifiedName | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| SuspiciousToArrayCall | 1 | false |
| EmptyMethod | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
## RuleId[id=IOResource]
### IOResource
'InputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `services/minho-config-json/src/main/java/org/apache/karaf/minho/config/json/JsonConfigLoaderService.java`
#### Snippet
```java
            log.info("Loading JSON configuration from " + System.getProperty("minho.config"));
            config = loadJson(new FileInputStream(System.getProperty("minho.config")));
        } else if (JsonConfigLoaderService.class.getResourceAsStream("/META-INF/minho.json") != null) {
            log.info("Loading JSON configuration from classpath META-INF/minho.json");
            config = loadJson(JsonConfigLoaderService.class.getResourceAsStream("/META-INF/minho.json"));
```

### IOResource
'InputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `services/minho-config-json/src/main/java/org/apache/karaf/minho/config/json/JsonConfigLoaderService.java`
#### Snippet
```java
            log.info("Loading JSON configuration from classpath META-INF/minho.json");
            config = loadJson(JsonConfigLoaderService.class.getResourceAsStream("/META-INF/minho.json"));
        } else if (JsonConfigLoaderService.class.getResourceAsStream("/minho.json") != null) {
            log.info("Loading JSON configuration from classpath minho.json");
            config = loadJson(JsonConfigLoaderService.class.getResourceAsStream("/minho.json"));
```

### IOResource
'InputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `services/minho-config-properties/src/main/java/org/apache/karaf/minho/config/properties/PropertiesConfigLoaderService.java`
#### Snippet
```java
            log.info("Loading configuration from " + System.getProperty("minho.config"));
            properties.load(new FileInputStream(System.getProperty("minho.config")));
        } else if (PropertiesConfigLoaderService.class.getResourceAsStream("/META-INF/minho.properties") != null) {
            log.info("Loading configuration from classpath META-INF/minho.properties");
            properties.load(PropertiesConfigLoaderService.class.getResourceAsStream("/META-INF/minho.properties"));
```

### IOResource
'InputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `services/minho-config-properties/src/main/java/org/apache/karaf/minho/config/properties/PropertiesConfigLoaderService.java`
#### Snippet
```java
            log.info("Loading configuration from classpath META-INF/minho.properties");
            properties.load(PropertiesConfigLoaderService.class.getResourceAsStream("/META-INF/minho.properties"));
        } else if (PropertiesConfigLoaderService.class.getResourceAsStream("/minho.properties") != null) {
            log.info("Loading configuration from classpath minho.properties");
            properties.load(PropertiesConfigLoaderService.class.getResourceAsStream("/minho.properties"));
```

### IOResource
'InputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `services/minho-banner/src/main/java/org/apache/karaf/minho/banner/WelcomeBannerService.java`
#### Snippet
```java
        }

        if (WelcomeBannerService.class.getResourceAsStream("/banner.txt") != null) {
            try {
                log.info("\n" + readBanner(new InputStreamReader(WelcomeBannerService.class.getResourceAsStream("/banner.txt"))));
```

## RuleId[id=Java8MapForEach]
### Java8MapForEach
Can be replaced with 'Map.forEach()'
in `services/minho-config-properties/src/main/java/org/apache/karaf/minho/config/properties/PropertiesConfigLoaderService.java`
#### Snippet
```java
                    return local.substring(0, local.indexOf("."));
                }));
        groupBy.entrySet().forEach(entry -> {
            Application application = new Application();
            String appName = (String) entry.getKey();
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Main` has only 'static' members, and lacks a 'private' constructor
in `boot/src/main/java/org/apache/karaf/minho/boot/Main.java`
#### Snippet
```java

@Log
public class Main {

    public static final void main(String[] args) throws Exception {
```

### UtilityClassWithoutPrivateConstructor
Class `Main` has only 'static' members, and lacks a 'private' constructor
in `tooling/cli/src/main/java/org/apache/karaf/minho/tooling/cli/Main.java`
#### Snippet
```java
import java.io.FileInputStream;

public class Main {

    public static void main(String[] args) throws Exception {
```

## RuleId[id=DataFlowIssue]
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

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `boot/src/main/java/org/apache/karaf/minho/boot/service/ClassLoaderService.java`
#### Snippet
```java
    public void onRegister(ServiceRegistry serviceRegistry) throws Exception {
        Config configService = serviceRegistry.get(Config.class);
        configService.getProfiles().stream().forEach(profile -> {
            URLClassLoader profileClassLoader = new URLClassLoader(profile.getUrls().toArray(new URL[]{}), this.getClass().getClassLoader());
            profiles.put(profile.getName(), profileClassLoader);
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

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `instance` from instance context
in `boot/src/main/java/org/apache/karaf/minho/boot/Minho.java`
#### Snippet
```java
        (this.loader == null ? loadServices() : this.loader.load()).forEach(serviceRegistry::add);
        serviceRegistry.start();
        instance = this;
        return instance;
    }
```

## RuleId[id=NonSynchronizedMethodOverridesSynchronizedMethod]
### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `getSoTimeout()` overrides synchronized method
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/ConnectorServerFactory.java`
#### Snippet
```java

        @Override
        public int getSoTimeout() throws IOException {
            return ss.getSoTimeout();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `setSoTimeout()` overrides synchronized method
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/ConnectorServerFactory.java`
#### Snippet
```java

        @Override
        public void setSoTimeout(int timeout) throws SocketException {
            ss.setSoTimeout(timeout);
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `getReceiveBufferSize()` overrides synchronized method
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/ConnectorServerFactory.java`
#### Snippet
```java

        @Override
        public int getReceiveBufferSize() throws SocketException {
            return ss.getReceiveBufferSize();
        }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `setReceiveBufferSize()` overrides synchronized method
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/ConnectorServerFactory.java`
#### Snippet
```java

        @Override
        public void setReceiveBufferSize(int size) throws SocketException {
            ss.setReceiveBufferSize(size);
        }
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`servers.size() > 0` can be replaced with '!servers.isEmpty()'
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/MBeanServerFactory.java`
#### Snippet
```java
            try {
                List servers = javax.management.MBeanServerFactory.findMBeanServer(agentId);
                if (servers != null && servers.size() > 0) {
                    this.server = (MBeanServer) servers.get(0);
                }
```

### SizeReplaceableByIsEmpty
`m_group.trim().length() == 0` can be replaced with 'm_group.trim().isEmpty()'
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/maven/Parser.java`
#### Snippet
```java
        // we must have a valid group
        m_group = segments[ 0 ];
        if( m_group.trim().length() == 0 )
        {
            throw new MalformedURLException( "Invalid groupId. Syntax " + SYNTAX );
```

### SizeReplaceableByIsEmpty
`m_artifact.trim().length() == 0` can be replaced with 'm_artifact.trim().isEmpty()'
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/maven/Parser.java`
#### Snippet
```java
        // valid artifact
        m_artifact = segments[ 1 ];
        if( m_artifact.trim().length() == 0 )
        {
            throw new MalformedURLException( "Invalid artifactId. Syntax " + SYNTAX );
```

### SizeReplaceableByIsEmpty
`segments[ 2 ].trim().length() > 0` can be replaced with '!segments\[ 2 \].trim().isEmpty()'
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/maven/Parser.java`
#### Snippet
```java
        // version is optional but we have a default value 
        m_version = VERSION_LATEST;
        if( segments.length >= 3 && segments[ 2 ].trim().length() > 0 )
        {
            m_version = segments[ 2 ];
```

### SizeReplaceableByIsEmpty
`segments[ 3 ].trim().length() > 0` can be replaced with '!segments\[ 3 \].trim().isEmpty()'
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/maven/Parser.java`
#### Snippet
```java
        // type is optional but we have a default value
        m_type = TYPE_JAR;
        if( segments.length >= 4 && segments[ 3 ].trim().length() > 0 )
        {
            m_type = segments[ 3 ];
```

### SizeReplaceableByIsEmpty
`segments[ 4 ].trim().length() > 0` can be replaced with '!segments\[ 4 \].trim().isEmpty()'
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/maven/Parser.java`
#### Snippet
```java
        // classifier is optional (if not present or empty we will have a null classifier
        m_fullClassifier = "";
        if( segments.length >= 5 && segments[ 4 ].trim().length() > 0 )
        {
            m_classifier = segments[ 4 ];
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

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `services/minho-rest/src/main/java/org/apache/karaf/minho/rest/jersey/JerseyRestService.java`
#### Snippet
```java

    public final static String REST_PATH = "rest.path";
    public final static String REST_PACKAGES = "rest.packages";

    private String restPath;
```

### MissortedModifiers
Missorted modifiers `final static`
in `services/minho-rest/src/main/java/org/apache/karaf/minho/rest/jersey/JerseyRestService.java`
#### Snippet
```java
public class JerseyRestService implements Service {

    public final static String REST_PATH = "rest.path";
    public final static String REST_PACKAGES = "rest.packages";

```

### MissortedModifiers
Missorted modifiers `final static`
in `services/minho-osgi/src/main/java/org/apache/karaf/minho/osgi/OsgiModuleManagerService.java`
#### Snippet
```java
    private final static String PREFIX = "osgi.";

    private final static String STORAGE_PROPERTY = "storageDirectory";
    private final static String CLEAR_CACHE_PROPERTY = "clearCache";
    private final static String START_LEVEL_PROPERTY = "startLevel";
```

### MissortedModifiers
Missorted modifiers `final static`
in `services/minho-osgi/src/main/java/org/apache/karaf/minho/osgi/OsgiModuleManagerService.java`
#### Snippet
```java
public class OsgiModuleManagerService implements Service {

    private final static String PREFIX = "osgi.";

    private final static String STORAGE_PROPERTY = "storageDirectory";
```

### MissortedModifiers
Missorted modifiers `final static`
in `services/minho-osgi/src/main/java/org/apache/karaf/minho/osgi/OsgiModuleManagerService.java`
#### Snippet
```java

    private final static String STORAGE_PROPERTY = "storageDirectory";
    private final static String CLEAR_CACHE_PROPERTY = "clearCache";
    private final static String START_LEVEL_PROPERTY = "startLevel";
    private final static String BUNDLE_START_LEVEL_PROPERTY = "bundleStartLevel";
```

### MissortedModifiers
Missorted modifiers `final static`
in `services/minho-osgi/src/main/java/org/apache/karaf/minho/osgi/OsgiModuleManagerService.java`
#### Snippet
```java
    private final static String START_LEVEL_PROPERTY = "startLevel";
    private final static String BUNDLE_START_LEVEL_PROPERTY = "bundleStartLevel";
    private final static String LOG_LEVEL_PROPERTY = "logLevel";
    private final static String CACHE_PROPERTY = "cache";

```

### MissortedModifiers
Missorted modifiers `final static`
in `services/minho-osgi/src/main/java/org/apache/karaf/minho/osgi/OsgiModuleManagerService.java`
#### Snippet
```java
    private final static String BUNDLE_START_LEVEL_PROPERTY = "bundleStartLevel";
    private final static String LOG_LEVEL_PROPERTY = "logLevel";
    private final static String CACHE_PROPERTY = "cache";

    private Framework framework = null;
```

### MissortedModifiers
Missorted modifiers `final static`
in `services/minho-osgi/src/main/java/org/apache/karaf/minho/osgi/OsgiModuleManagerService.java`
#### Snippet
```java
    private final static String CLEAR_CACHE_PROPERTY = "clearCache";
    private final static String START_LEVEL_PROPERTY = "startLevel";
    private final static String BUNDLE_START_LEVEL_PROPERTY = "bundleStartLevel";
    private final static String LOG_LEVEL_PROPERTY = "logLevel";
    private final static String CACHE_PROPERTY = "cache";
```

### MissortedModifiers
Missorted modifiers `final static`
in `services/minho-osgi/src/main/java/org/apache/karaf/minho/osgi/OsgiModuleManagerService.java`
#### Snippet
```java
    private final static String STORAGE_PROPERTY = "storageDirectory";
    private final static String CLEAR_CACHE_PROPERTY = "clearCache";
    private final static String START_LEVEL_PROPERTY = "startLevel";
    private final static String BUNDLE_START_LEVEL_PROPERTY = "bundleStartLevel";
    private final static String LOG_LEVEL_PROPERTY = "logLevel";
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/maven/Parser.java`
#### Snippet
```java
            sb.append(ARTIFACT_SEPARATOR).append(m_type);
        }
        if (m_classifier != null && !"".equals(m_classifier)) {
            if (TYPE_JAR.equals(m_type)) {
                sb.append(ARTIFACT_SEPARATOR).append(m_type);
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

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `tooling/cli/src/main/java/org/apache/karaf/minho/tooling/cli/Main.java`
#### Snippet
```java

        if (!minhoBuild.exists()) {
            System.err.println("minho-build.json file not found");
            System.exit(1);
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `tooling/cli/src/main/java/org/apache/karaf/minho/tooling/cli/Main.java`
#### Snippet
```java
            Runtime.createArchive(new FileInputStream(minhoBuild));
        } else {
            System.err.println("Build action argument is not valid. It should be package|jar|archive");
            System.exit(1);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `boot/src/main/java/org/apache/karaf/minho/boot/Main.java`
#### Snippet
```java
            // try to load classpath
            String minhoLib = (System.getProperty("minho.lib") != null) ? System.getProperty("minho.lib") : System.getProperty("user.dir");
            System.out.println("Minho lib: " + minhoLib);
            Path libFolder = Paths.get(minhoLib);
            ArrayList<URL> urls = new ArrayList<URL>();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `boot/src/main/java/org/apache/karaf/minho/boot/Main.java`
#### Snippet
```java
            Path libFolder = Paths.get(minhoLib);
            ArrayList<URL> urls = new ArrayList<URL>();
            System.out.print("Loaded libraries: ");
            System.out.print(libFolder.toFile().toURI().toURL() + ":");
            urls.add(libFolder.toFile().toURI().toURL());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `boot/src/main/java/org/apache/karaf/minho/boot/Main.java`
#### Snippet
```java
            ArrayList<URL> urls = new ArrayList<URL>();
            System.out.print("Loaded libraries: ");
            System.out.print(libFolder.toFile().toURI().toURL() + ":");
            urls.add(libFolder.toFile().toURI().toURL());
            Files.walkFileTree(libFolder, new SimpleFileVisitor<>() {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `boot/src/main/java/org/apache/karaf/minho/boot/Main.java`
#### Snippet
```java
                }
            });
            System.out.println();
            URLClassLoader classLoader = new URLClassLoader(urls.toArray(new URL[]{}));
            Thread.currentThread().setContextClassLoader(classLoader);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `boot/src/main/java/org/apache/karaf/minho/boot/Main.java`
#### Snippet
```java
                public FileVisitResult visitFile(Path file, BasicFileAttributes attributes) throws IOException {
                    if (!Files.isDirectory(file)) {
                        System.out.print(file.toFile().toURI().toURL() + ":");
                        urls.add(file.toFile().toURI().toURL());
                    }
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `boot/src/main/java/org/apache/karaf/minho/boot/spi/Service.java`
#### Snippet
```java
     */
    default String name() {
        return getClass().getSimpleName().toLowerCase(Locale.ROOT).replaceAll("Service", "");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/ConnectorServerFactory.java`
#### Snippet
```java
        try {
            if (urlPath.startsWith("/jndi/")) {
                return new URI(urlPath.substring(6)).getPath().replaceAll("^/+", "").replaceAll("/+$", "");
            }
        } catch (URISyntaxException e) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/ConnectorServerFactory.java`
#### Snippet
```java
        try {
            if (urlPath.startsWith("/jndi/")) {
                return new URI(urlPath.substring(6)).getPath().replaceAll("^/+", "").replaceAll("/+$", "");
            }
        } catch (URISyntaxException e) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/maven/Parser.java`
#### Snippet
```java
    public String getVersionLocalMetadataPath( final String version )
    {
        return m_group.replaceAll(GROUP_SEPARATOR, FILE_SEPARATOR)
                + FILE_SEPARATOR
                + m_artifact
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/maven/Parser.java`
#### Snippet
```java
    public String getSnapshotPath( final String version, final String timestamp, final String buildnumber )
    {
        return m_group.replaceAll(GROUP_SEPARATOR, FILE_SEPARATOR)
                + FILE_SEPARATOR
                + m_artifact
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/maven/Parser.java`
#### Snippet
```java
        {
            this.m_version = m.group( 1 ) + "-" + "SNAPSHOT";
            String ret = m_group.replaceAll(GROUP_SEPARATOR, FILE_SEPARATOR)
                    + FILE_SEPARATOR
                    + m_artifact
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/maven/Parser.java`
#### Snippet
```java
            return ret;
        } else {
            String ret = m_group.replaceAll(GROUP_SEPARATOR, FILE_SEPARATOR)
                    + FILE_SEPARATOR
                    + m_artifact
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/maven/Parser.java`
#### Snippet
```java
        if (resolved != null) {
            String grp = FILE_SEPARATOR
                    + parser.getGroup().replaceAll(GROUP_SEPARATOR, FILE_SEPARATOR)
                    + FILE_SEPARATOR
                    + parser.getArtifact()
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/maven/Parser.java`
#### Snippet
```java
    public String getArtifactMetdataPath()
    {
        return m_group.replaceAll(GROUP_SEPARATOR, FILE_SEPARATOR)
                + FILE_SEPARATOR
                + m_artifact
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/maven/Parser.java`
#### Snippet
```java
    public String getArtifactLocalMetdataPath()
    {
        return m_group.replaceAll(GROUP_SEPARATOR, FILE_SEPARATOR)
                + FILE_SEPARATOR
                + m_artifact
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/maven/Parser.java`
#### Snippet
```java
    public String getVersionMetadataPath( final String version )
    {
        return m_group.replaceAll(GROUP_SEPARATOR, FILE_SEPARATOR)
                + FILE_SEPARATOR
                + m_artifact
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `sun.rmi.registry` is unnecessary, and can be replaced with an import
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/ConnectorServerFactory.java`
#### Snippet
```java

    @SuppressWarnings("restriction")
    private class JmxRegistry extends sun.rmi.registry.RegistryImpl {
        private final String lookupName;

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
Unused import `import lombok.Data;`
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/JmxService.java`
#### Snippet
```java
package org.apache.karaf.minho.jmx;

import lombok.Data;
import lombok.extern.java.Log;
import org.apache.karaf.minho.boot.service.ConfigService;
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

### UNUSED_IMPORT
Unused import `import lombok.Data;`
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/MBeanServerFactory.java`
#### Snippet
```java
package org.apache.karaf.minho.jmx;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `services/minho-banner/src/main/java/org/apache/karaf/minho/banner/WelcomeBannerService.java`
#### Snippet
```java
            String line;
            StringBuilder builder = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                builder.append(line).append("\n");
            }
```

### NestedAssignment
Result of assignment expression used
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/Runtime.java`
#### Snippet
```java
                                    try (BufferedReader reader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(entry)))) {
                                        String line = null;
                                        while ((line = reader.readLine()) != null) {
                                            if (!line.startsWith("#")) {
                                                writer.write(line + "\n");
```

### NestedAssignment
Result of assignment expression used
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/Runtime.java`
#### Snippet
```java
                                        byte[] buffer = new byte[1024];
                                        int readCount = 0;
                                        while ((readCount = is.read(buffer)) >= 0) {
                                            os.write(buffer, 0, readCount);
                                        }
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `services/minho-extractor/src/main/java/org/apache/karaf/minho/extractor/ExtractorService.java`
#### Snippet
```java
                                } catch (Exception e) {
                                    log.warning("Can't copy " + path.toAbsolutePath() + " to " + finalTarget);
                                    e.printStackTrace();
                                }
                            });
```

## RuleId[id=SuspiciousToArrayCall]
### SuspiciousToArrayCall
Array of type 'java.lang.String\[\]' expected, 'java.net.URL\[\]' found
in `boot/src/main/java/org/apache/karaf/minho/boot/service/ClassLoaderService.java`
#### Snippet
```java
        Config configService = serviceRegistry.get(Config.class);
        configService.getProfiles().stream().forEach(profile -> {
            URLClassLoader profileClassLoader = new URLClassLoader(profile.getUrls().toArray(new URL[]{}), this.getClass().getClassLoader());
            profiles.put(profile.getName(), profileClassLoader);
        });
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `tooling/maven/src/main/java/org/apache/karaf/minho/tooling/maven/ArchiveMojo.java`
#### Snippet
```java
            try {
                Runtime runtime = new Runtime(name, version, properties);
                dependencies.forEach(dependency -> {
                    runtime.getDependencies().add(dependency);
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `tooling/maven/src/main/java/org/apache/karaf/minho/tooling/maven/PackageMojo.java`
#### Snippet
```java
            try {
                Runtime runtime = new Runtime(name, version, properties);
                dependencies.forEach(dependency -> {
                    runtime.getDependencies().add(dependency);
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `services/minho-camel/src/main/java/org/apache/karaf/minho/camel/CamelService.java`
#### Snippet
```java
        });
        LifeCycleService lifeCycleService = serviceRegistry.get(LifeCycleService.class);
        lifeCycleService.onStart(() -> {
            camelContext.start();
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `services/minho-camel/src/main/java/org/apache/karaf/minho/camel/CamelService.java`
#### Snippet
```java
            camelContext.start();
        });
        lifeCycleService.onShutdown(() -> {
            camelContext.stop();
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `services/minho-config-properties/src/main/java/org/apache/karaf/minho/config/properties/PropertiesConfigLoaderService.java`
#### Snippet
```java

        properties.keySet().stream().filter(key -> !((String) key).startsWith("application."))
                .forEach(key -> {
                    config.getProperties().put(((String) key), properties.get(key).toString());
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `tooling/maven/src/main/java/org/apache/karaf/minho/tooling/maven/JarMojo.java`
#### Snippet
```java
            try {
                Runtime runtime = new Runtime(name, version, properties);
                dependencies.forEach(dependency -> {
                    runtime.getDependencies().add(dependency);
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `services/minho-spring-boot/src/main/java/org/apache/karaf/minho/springboot/SpringBootApplicationManagerService.java`
#### Snippet
```java
        ClassLoaderService classLoaderService = serviceRegistry.get(ClassLoaderService.class);
        LifeCycleService lifeCycleService = serviceRegistry.get(LifeCycleService.class);
        lifeCycleService.onStart(() -> {
            getApplications(serviceRegistry.get(ConfigService.class)).forEach(application -> {
                try {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `services/minho-osgi/src/main/java/org/apache/karaf/minho/osgi/OsgiModuleManagerService.java`
#### Snippet
```java
        log.info("Registering service into lifecycle service");
        LifeCycleService lifeCycleService = serviceRegistry.get(LifeCycleService.class);
        lifeCycleService.onStart(() -> {
            serviceRegistry.get(Config.class).getApplications().forEach(application -> {
                try {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `services/minho-osgi/src/main/java/org/apache/karaf/minho/osgi/OsgiModuleManagerService.java`
#### Snippet
```java
            });
        });
        lifeCycleService.onShutdown(() -> {
            store.keySet().forEach(id -> {
                try {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/Runtime.java`
#### Snippet
```java
        MinhoBuild build = MinhoBuild.load(minhoBuild);
        Runtime runtime = new Runtime(build.getName(), build.getVersion(), build.getProperties());
        build.getDependencies().forEach(dependency -> {
            runtime.getDependencies().add(dependency);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/Runtime.java`
#### Snippet
```java
        MinhoBuild build = MinhoBuild.load(minhoBuild);
        Runtime runtime = new Runtime(build.getName(), build.getVersion(), build.getProperties());
        build.getDependencies().forEach(dependency -> {
            runtime.getDependencies().add(dependency);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/Runtime.java`
#### Snippet
```java
        MinhoBuild build = MinhoBuild.load(minhoBuild);
        Runtime runtime = new Runtime(build.getName(), build.getVersion(), build.getProperties());
        build.getDependencies().forEach(dependency -> {
            runtime.getDependencies().add(dependency);
        });
```

## RuleId[id=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `services/minho-http/src/main/java/org/apache/karaf/minho/web/jetty/JettyWebContainerService.java`
#### Snippet
```java
                } else {
                    Servlet servlet = (Servlet) service;
                    String contextPath = service.properties().get("contextPath").toString();
                    log.info("Adding servlet " + servlet.getClass().getName() + " with context " + contextPath);
                    servlets.addServlet(servlet.getClass(), contextPath);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `services/minho-config-properties/src/main/java/org/apache/karaf/minho/config/properties/PropertiesConfigLoaderService.java`
#### Snippet
```java
        properties.keySet().stream().filter(key -> !((String) key).startsWith("application."))
                .forEach(key -> {
                    config.getProperties().put(((String) key), properties.get(key).toString());
                });

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `services/minho-config-properties/src/main/java/org/apache/karaf/minho/config/properties/PropertiesConfigLoaderService.java`
#### Snippet
```java
            entry.getValue().forEach(value -> {
                if (value.equals("application." + appName + ".type")) {
                    application.setType((String) properties.get(value));
                } else if (value.equals("application." + appName + ".url")) {
                    application.setUrl((String) properties.get(value));
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `services/minho-config-properties/src/main/java/org/apache/karaf/minho/config/properties/PropertiesConfigLoaderService.java`
#### Snippet
```java
                    application.setType((String) properties.get(value));
                } else if (value.equals("application." + appName + ".url")) {
                    application.setUrl((String) properties.get(value));
                } else if (value.equals("application." + appName + ".profile")) {
                    application.setProfile((String) properties.get(value));
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `services/minho-config-properties/src/main/java/org/apache/karaf/minho/config/properties/PropertiesConfigLoaderService.java`
#### Snippet
```java
                    application.setUrl((String) properties.get(value));
                } else if (value.equals("application." + appName + ".profile")) {
                    application.setProfile((String) properties.get(value));
                } else {
                    application.getProperties().put(((String) value).substring(("application." + appName).length() + 1), properties.get(value).toString());
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `services/minho-config-properties/src/main/java/org/apache/karaf/minho/config/properties/PropertiesConfigLoaderService.java`
#### Snippet
```java
                    application.setProfile((String) properties.get(value));
                } else {
                    application.getProperties().put(((String) value).substring(("application." + appName).length() + 1), properties.get(value).toString());
                }
            });
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `services/minho-spring-boot/src/main/java/org/apache/karaf/minho/springboot/SpringBootApplicationManagerService.java`
#### Snippet
```java
    }

    private void stop(String id) throws Exception {
        // TODO
    }
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `services/minho-config-json/src/main/java/org/apache/karaf/minho/config/json/JsonConfigLoaderService.java`
#### Snippet
```java
public class JsonConfigLoaderService implements Service {

    private Jsonb jsonb = null;

    @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/MBeanServerFactory.java`
#### Snippet
```java
public class MBeanServerFactory {

    private boolean locateExistingServerIfPossible = false;
    private String defaultDomain;
    private String agentId;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/MBeanServerFactory.java`
#### Snippet
```java
    private String agentId;
    private boolean registerWithFactory = true;
    private boolean newlyRegistered = false;
    private MBeanServer server;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/ConnectorServerFactory.java`
#### Snippet
```java
    private ObjectName objectName;
    private boolean threaded = false;
    private boolean daemon = false;

    public void init() throws Exception {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/ConnectorServerFactory.java`
#### Snippet
```java
    private RMIJRMPServerImpl rmiServer;
    private ObjectName objectName;
    private boolean threaded = false;
    private boolean daemon = false;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `services/minho-osgi/src/main/java/org/apache/karaf/minho/osgi/OsgiModuleManagerService.java`
#### Snippet
```java
    private final static String CACHE_PROPERTY = "cache";

    private Framework framework = null;

    private final Map<String, String> store = new ConcurrentHashMap<>();
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `path`
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/maven/Parser.java`
#### Snippet
```java
        }
        if (path.startsWith("mvn:")) {
            path = path.substring("mvn:".length());
        }
        if( path.startsWith( REPOSITORY_SEPARATOR ) || path.endsWith( REPOSITORY_SEPARATOR ) )
```

### AssignmentToMethodParameter
Assignment to method parameter `location`
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/Runtime.java`
#### Snippet
```java
        if (!location.startsWith("file:") && !location.startsWith("http:") && !location.startsWith("https:") && !location.startsWith("mvn:")) {
            if (location.startsWith("minho:")) {
                location = location.substring("minho:".length());
            }
            location = "mvn:org.apache.karaf.minho/" + location + "/" + version;
```

### AssignmentToMethodParameter
Assignment to method parameter `location`
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/Runtime.java`
#### Snippet
```java
                location = location.substring("minho:".length());
            }
            location = "mvn:org.apache.karaf.minho/" + location + "/" + version;
        }
        // copy service jar in working dir
```

### AssignmentToMethodParameter
Assignment to method parameter `location`
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/Runtime.java`
#### Snippet
```java
            // resolve artifact
            File file = Parser.resolve(location);
            location = "file:" + file.getAbsolutePath();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `location`
in `tooling/common/src/main/java/org/apache/karaf/minho/tooling/common/Runtime.java`
#### Snippet
```java
        } else {
            if (location.startsWith("file:")) {
                location = location.substring("file:".length());
            }
            Path servicePath = Paths.get(location);
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-10-21-43-23.192.html`
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
in `services/minho-classpath/src/main/java/org/apache/karaf/minho/classpathprotocolhandler/ClasspathURLStreamHandlerFactory.java`
#### Snippet
```java
            return new ClasspathURLStreamHandler();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `boot/src/main/java/org/apache/karaf/minho/boot/service/ServiceRegistry.java`
#### Snippet
```java
                    switch (selected.size()) {
                        case 0:
                            return null;
                        case 1:
                            return selected.iterator().next();
```

### ReturnNull
Return of `null`
in `services/minho-jmx/src/main/java/org/apache/karaf/minho/jmx/ConnectorServerFactory.java`
#### Snippet
```java
        @Override
        public Remote lookup(String s) throws RemoteException, NotBoundException {
            return lookupName.equals(s) ? remoteServerStub : null;
        }

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
        public void unbind(String s) throws RemoteException, NotBoundException, AccessException {
        }

```

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
        public void rebind(String s, Remote remote) throws RemoteException, AccessException {
        }

```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `boot/src/main/java/org/apache/karaf/minho/boot/Main.java`
#### Snippet
```java
            });
            System.out.println();
            URLClassLoader classLoader = new URLClassLoader(urls.toArray(new URL[]{}));
            Thread.currentThread().setContextClassLoader(classLoader);
        } else {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `boot/src/main/java/org/apache/karaf/minho/boot/service/ClassLoaderService.java`
#### Snippet
```java
        Config configService = serviceRegistry.get(Config.class);
        configService.getProfiles().stream().forEach(profile -> {
            URLClassLoader profileClassLoader = new URLClassLoader(profile.getUrls().toArray(new URL[]{}), this.getClass().getClassLoader());
            profiles.put(profile.getName(), profileClassLoader);
        });
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

## RuleId[id=ConstantValue]
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

