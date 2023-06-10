# microprofile-graphql 
 
# Bad smells
I found 56 bad smells with 22 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 17 | true |
| FieldMayBeFinal | 13 | false |
| UnnecessaryLocalVariable | 4 | true |
| AutoCloseableResource | 3 | false |
| DuplicateThrows | 2 | false |
| TrivialIf | 2 | false |
| OptionalUsedAsFieldOrParameterType | 1 | false |
| AccessStaticViaInstance | 1 | false |
| CharsetObjectCanBeUsed | 1 | false |
| UNCHECKED_WARNING | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| ManualArrayToCollectionCopy | 1 | false |
| DataFlowIssue | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| RedundantCast | 1 | false |
| NonFinalFieldInEnum | 1 | false |
| OnlyOneElementUsed | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| UnusedAssignment | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'value'
in `client/api/src/main/java/org/eclipse/microprofile/graphql/client/core/Variable.java`
#### Snippet
```java
    Optional<Object> getDefaultValue();

    void setDefaultValue(Optional<Object> value);
}

```

## RuleId[id=AccessStaticViaInstance]
### AccessStaticViaInstance
Static member 'org.eclipse.microprofile.graphql.tck.dynamic.ExecutionDynamicTest.HttpMethod.POST' accessed via instance reference
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/ExecutionDynamicTest.java`
#### Snippet
```java
            connection.setDoOutput(true);

            if(httpMethod.POST.equals(httpMethod)){
                JsonObject body = createRequestBody(graphQL, variables);
                postRequest(connection,body);
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/SchemaDynamicValidityTest.java`
#### Snippet
```java
            Path downloadedSchema = Paths.get("target" + FS  + FILENAME);
            Path createFile = Files.createFile(downloadedSchema);
            try(BufferedWriter writer = Files.newBufferedWriter(createFile, Charset.forName("UTF-8"))){
                writer.write(this.schema);
            }
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `server/api/src/main/java/org/eclipse/microprofile/graphql/ConfigKey.java`
#### Snippet
```java

    @Deprecated
    public static final String EXCEPTION_WHITE_LIST = "mp.graphql.exceptionsWhiteList";
    public static final String EXCEPTION_SHOW_ERROR_MESSAGE_LIST = "mp.graphql.showErrorMessage";
}
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `server/api/src/main/java/org/eclipse/microprofile/graphql/ConfigKey.java`
#### Snippet
```java

    @Deprecated
    public static final String EXCEPTION_WHITE_LIST = "mp.graphql.exceptionsWhiteList";
    public static final String EXCEPTION_SHOW_ERROR_MESSAGE_LIST = "mp.graphql.showErrorMessage";
}
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `server/api/src/main/java/org/eclipse/microprofile/graphql/ConfigKey.java`
#### Snippet
```java

    @Deprecated
    public static final String EXCEPTION_WHITE_LIST = "mp.graphql.exceptionsWhiteList";
    public static final String EXCEPTION_SHOW_ERROR_MESSAGE_LIST = "mp.graphql.showErrorMessage";
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `server/api/src/main/java/org/eclipse/microprofile/graphql/ConfigKey.java`
#### Snippet
```java
    @Deprecated
    public static final String EXCEPTION_WHITE_LIST = "mp.graphql.exceptionsWhiteList";
    public static final String EXCEPTION_SHOW_ERROR_MESSAGE_LIST = "mp.graphql.showErrorMessage";
}
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `server/api/src/main/java/org/eclipse/microprofile/graphql/ConfigKey.java`
#### Snippet
```java
    @Deprecated
    public static final String EXCEPTION_WHITE_LIST = "mp.graphql.exceptionsWhiteList";
    public static final String EXCEPTION_SHOW_ERROR_MESSAGE_LIST = "mp.graphql.showErrorMessage";
}
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `server/api/src/main/java/org/eclipse/microprofile/graphql/ConfigKey.java`
#### Snippet
```java
    @Deprecated
    public static final String EXCEPTION_WHITE_LIST = "mp.graphql.exceptionsWhiteList";
    public static final String EXCEPTION_SHOW_ERROR_MESSAGE_LIST = "mp.graphql.showErrorMessage";
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `server/api/src/main/java/org/eclipse/microprofile/graphql/ConfigKey.java`
#### Snippet
```java
    @Deprecated
    public static final String EXCEPTION_BLACK_LIST = "mp.graphql.exceptionsBlackList";
    public static final String EXCEPTION_HIDE_ERROR_MESSAGE_LIST = "mp.graphql.hideErrorMessage";

    @Deprecated
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `server/api/src/main/java/org/eclipse/microprofile/graphql/ConfigKey.java`
#### Snippet
```java
    @Deprecated
    public static final String EXCEPTION_BLACK_LIST = "mp.graphql.exceptionsBlackList";
    public static final String EXCEPTION_HIDE_ERROR_MESSAGE_LIST = "mp.graphql.hideErrorMessage";

    @Deprecated
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `server/api/src/main/java/org/eclipse/microprofile/graphql/ConfigKey.java`
#### Snippet
```java
    @Deprecated
    public static final String EXCEPTION_BLACK_LIST = "mp.graphql.exceptionsBlackList";
    public static final String EXCEPTION_HIDE_ERROR_MESSAGE_LIST = "mp.graphql.hideErrorMessage";

    @Deprecated
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `server/api/src/main/java/org/eclipse/microprofile/graphql/ConfigKey.java`
#### Snippet
```java
 */
public interface ConfigKey {
    public static final String DEFAULT_ERROR_MESSAGE = "mp.graphql.defaultErrorMessage";

    @Deprecated
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `server/api/src/main/java/org/eclipse/microprofile/graphql/ConfigKey.java`
#### Snippet
```java
 */
public interface ConfigKey {
    public static final String DEFAULT_ERROR_MESSAGE = "mp.graphql.defaultErrorMessage";

    @Deprecated
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `server/api/src/main/java/org/eclipse/microprofile/graphql/ConfigKey.java`
#### Snippet
```java
 */
public interface ConfigKey {
    public static final String DEFAULT_ERROR_MESSAGE = "mp.graphql.defaultErrorMessage";

    @Deprecated
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `server/api/src/main/java/org/eclipse/microprofile/graphql/ConfigKey.java`
#### Snippet
```java

    @Deprecated
    public static final String EXCEPTION_BLACK_LIST = "mp.graphql.exceptionsBlackList";
    public static final String EXCEPTION_HIDE_ERROR_MESSAGE_LIST = "mp.graphql.hideErrorMessage";

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `server/api/src/main/java/org/eclipse/microprofile/graphql/ConfigKey.java`
#### Snippet
```java

    @Deprecated
    public static final String EXCEPTION_BLACK_LIST = "mp.graphql.exceptionsBlackList";
    public static final String EXCEPTION_HIDE_ERROR_MESSAGE_LIST = "mp.graphql.hideErrorMessage";

```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `server/api/src/main/java/org/eclipse/microprofile/graphql/ConfigKey.java`
#### Snippet
```java

    @Deprecated
    public static final String EXCEPTION_BLACK_LIST = "mp.graphql.exceptionsBlackList";
    public static final String EXCEPTION_HIDE_ERROR_MESSAGE_LIST = "mp.graphql.hideErrorMessage";

```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `server/api/src/main/java/org/eclipse/microprofile/graphql/GraphQLException.java`
#### Snippet
```java
    private static final long serialVersionUID = -3661091414653921754L;

    public static enum ExceptionType {
        DataFetchingException, OperationNotSupported, ExecutionAborted
    }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/execution/GraphQLTestDataProvider.java`
#### Snippet
```java
    private static final Logger LOG = Logger.getLogger(GraphQLTestDataProvider.class.getName());

    private static enum DataFrom {
        implementation,specification
    }
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/execution/GraphQLTestDataProvider.java`
#### Snippet
```java
            return getTestData(DataFrom.specification);
        }
        return toObjectArray(Collections.EMPTY_LIST);
    }

```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'FileSystem' used without 'try'-with-resources statement
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/DynamicPaths.java`
#### Snippet
```java
        URL jar = DynamicPaths.class.getProtectionDomain().getCodeSource().getLocation();
        Path jarFile = Paths.get(jar.toURI());
        FileSystem fs = FileSystems.newFileSystem(jarFile, (ClassLoader)null);
        return Files.newDirectoryStream(fs.getPath(SPEC));
    }
```

### AutoCloseableResource
'Jsonb' used without 'try'-with-resources statement
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/superhero/db/HeroDatabase.java`
#### Snippet
```java

        try {
            Jsonb jsonb = JsonbBuilder.create();
            String mapJson = getInitalJson();
            addHeroes(jsonb.fromJson(mapJson,
```

### AutoCloseableResource
'Jsonb' used without 'try'-with-resources statement
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/superhero/db/SidekickDatabase.java`
#### Snippet
```java

        try {
            Jsonb jsonb = JsonbBuilder.create();
            String mapJson = getInitalJson();
            addSidekicks(jsonb.fromJson(mapJson,
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition '!ignore.isEmpty()' covered by subsequent condition 'ignore.equalsIgnoreCase(...)'
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/execution/TestData.java`
#### Snippet
```java
        if(properties!=null && !properties.isEmpty() && properties.containsKey(key)){
            String ignore = properties.getProperty(key);
            if(ignore!=null && !ignore.isEmpty() && ignore.equalsIgnoreCase("true")){
                return true;
            }
```

## RuleId[id=ManualArrayToCollectionCopy]
### ManualArrayToCollectionCopy
Manual array to collection copy
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/superhero/model/Team.java`
#### Snippet
```java
            members = new ArrayList<>();
        }
        for (SuperHero hero : heroes) {
            members.add(hero);
        }
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `in` might be null
in `client/tck/src/main/java/org/eclipse/microprofile/graphql/client/tck/helper/Utils.java`
#### Snippet
```java
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream in =classLoader.getResourceAsStream(resourceName);
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String content = reader.lines().collect(Collectors.joining("\n"));

```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/execution/PrintUtil.java`
#### Snippet
```java
            } else {
                sw.write("given multiple inputs = \n");
                testData.getInput().stream().forEach(i -> sw.write(i + "\n"));
            }
            sw.write("\n\n");
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary string length argument
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/superhero/api/HeroFinder.java`
#### Snippet
```java
        String uuid = UUID.randomUUID().toString();
        if(maskFirstPart){
            return new Token(uuid.substring(0,uuid.length()-4).replaceAll("[A-Za-z0-9]", "*") + uuid.substring(uuid.length()-4,uuid.length()));
        }else{
            return new Token(uuid);
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `null` to `ClassLoader` is redundant
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/DynamicPaths.java`
#### Snippet
```java
        URL jar = DynamicPaths.class.getProtectionDomain().getCodeSource().getLocation();
        Path jarFile = Paths.get(jar.toURI());
        FileSystem fs = FileSystems.newFileSystem(jarFile, (ClassLoader)null);
        return Files.newDirectoryStream(fs.getPath(SPEC));
    }
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `type` may be 'final'
in `client/api/src/main/java/org/eclipse/microprofile/graphql/client/core/ScalarType.java`
#### Snippet
```java
    GQL_ID("ID");

    private String type;

    ScalarType(String type) {
```

### FieldMayBeFinal
Field `intObject` may be 'final'
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/basic/api/ArraysHolder.java`
#### Snippet
```java
public class ArraysHolder {

    private Integer[] intObject = {1, 2, 3};

    private List<Integer> intObjectList = Arrays.asList(intObject);
```

### FieldMayBeFinal
Field `formattedIntObjectList` may be 'final'
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/basic/api/ArraysHolder.java`
#### Snippet
```java

    @NumberFormat(value = "¤00", locale = "en-ZA")
    private List<Integer> formattedIntObjectList = Arrays.asList(intObject);

    @NumberFormat(value = "¤00", locale = "en-ZA")
```

### FieldMayBeFinal
Field `intPrimitive` may be 'final'
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/basic/api/ArraysHolder.java`
#### Snippet
```java
    private List<Integer> intObjectList = Arrays.asList(intObject);

    private int[] intPrimitive = {1, 2, 3};

    @NumberFormat(value = "¤00", locale = "en-ZA")
```

### FieldMayBeFinal
Field `formattedIntObject` may be 'final'
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/basic/api/ArraysHolder.java`
#### Snippet
```java

    @NumberFormat(value = "¤00", locale = "en-ZA")
    private Integer[] formattedIntObject = intObject;

    @NumberFormat(value = "¤00", locale = "en-ZA")
```

### FieldMayBeFinal
Field `formattedDateList` may be 'final'
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/basic/api/ArraysHolder.java`
#### Snippet
```java

    @DateFormat(value = "dd.MM.yyyy")
    private List<LocalDate> formattedDateList = Arrays.asList(date);

    public Integer[] getIntObject() {
```

### FieldMayBeFinal
Field `formattedDate` may be 'final'
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/basic/api/ArraysHolder.java`
#### Snippet
```java

    @DateFormat(value = "dd.MM.yyyy")
    private LocalDate[] formattedDate = date;

    @DateFormat(value = "dd.MM.yyyy")
```

### FieldMayBeFinal
Field `date` may be 'final'
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/basic/api/ArraysHolder.java`
#### Snippet
```java
    private int[] formattedIntPrimitive = intPrimitive;

    private LocalDate[] date = {LocalDate.parse("2006-02-01"), LocalDate.parse("2007-03-02")};

    private List<LocalDate> dateList = Arrays.asList(date);
```

### FieldMayBeFinal
Field `dateList` may be 'final'
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/basic/api/ArraysHolder.java`
#### Snippet
```java
    private LocalDate[] date = {LocalDate.parse("2006-02-01"), LocalDate.parse("2007-03-02")};

    private List<LocalDate> dateList = Arrays.asList(date);

    @DateFormat(value = "dd.MM.yyyy")
```

### FieldMayBeFinal
Field `intObjectList` may be 'final'
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/basic/api/ArraysHolder.java`
#### Snippet
```java
    private Integer[] intObject = {1, 2, 3};

    private List<Integer> intObjectList = Arrays.asList(intObject);

    private int[] intPrimitive = {1, 2, 3};
```

### FieldMayBeFinal
Field `formattedIntPrimitive` may be 'final'
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/basic/api/ArraysHolder.java`
#### Snippet
```java

    @NumberFormat(value = "¤00", locale = "en-ZA")
    private int[] formattedIntPrimitive = intPrimitive;

    private LocalDate[] date = {LocalDate.parse("2006-02-01"), LocalDate.parse("2007-03-02")};
```

### FieldMayBeFinal
Field `containsString` may be 'final'
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/schema/TestData.java`
#### Snippet
```java
    private String name;
    private String snippetSearchTerm;
    private List<String> containsString = new ArrayList<>();
    private Condition condition = null;
    private String errorMessage;
```

### FieldMayBeFinal
Field `name` may be 'final'
in `client/api/src/main/java/org/eclipse/microprofile/graphql/client/core/Fragment.java`
#### Snippet
```java
    class FragmentBuilder {

        private String name;

        private String targetType;
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `type` in enum 'ScalarType'
in `client/api/src/main/java/org/eclipse/microprofile/graphql/client/core/ScalarType.java`
#### Snippet
```java
    GQL_ID("ID");

    private String type;

    ScalarType(String type) {
```

## RuleId[id=OnlyOneElementUsed]
### OnlyOneElementUsed
Only one string character is used
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/basic/api/ScalarTestApi.java`
#### Snippet
```java

        // Character
        char c = "c".charAt(0);
        sh.setCharObject(new Character(c));
        sh.setCharPrimitive(c);
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `content` is redundant
in `client/tck/src/main/java/org/eclipse/microprofile/graphql/client/tck/helper/Utils.java`
#### Snippet
```java
        InputStream in =classLoader.getResourceAsStream(resourceName);
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String content = reader.lines().collect(Collectors.joining("\n"));

        return content;
```

### UnnecessaryLocalVariable
Local variable `t` is redundant
in `client/api/src/main/java/org/eclipse/microprofile/graphql/client/core/utils/ServiceUtils.java`
#### Snippet
```java
    public static <T> T getNewInstanceOf(Class<T> clazz) {
        ServiceLoader<T> sl = ServiceLoader.load(clazz);
        T t = sl.iterator().next();

        return t;
```

### UnnecessaryLocalVariable
Local variable `superHero` is redundant
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/superhero/api/HeroFinder.java`
#### Snippet
```java

        try {
            SuperHero superHero = heroDB.getHero(name);
            return superHero;
        } catch (UnknownHeroException e) {
```

### UnnecessaryLocalVariable
Local variable `sidekick` is redundant
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/superhero/api/HeroFinder.java`
#### Snippet
```java
        } catch (UnknownHeroException e) {
            try {
                Sidekick sidekick = sidekickDB.getSidekick(name);
                return sidekick;
            } catch (UnknownSidekickException ex) {
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/SchemaDynamicValidityTest.java`
#### Snippet
```java
    }
    
    private String getSchemaContent() throws MalformedURLException, ProtocolException, IOException {
        URL url = new URL(this.uri + PATH);
        HttpURLConnection connection = null;
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/SchemaDynamicValidityTest.java`
#### Snippet
```java
    }
    
    private String getSchemaContent() throws MalformedURLException, ProtocolException, IOException {
        URL url = new URL(this.uri + PATH);
        HttpURLConnection connection = null;
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/SchemaDynamicValidityTest.java`
#### Snippet
```java
            // Check the response code
            int responseCode = connection.getResponseCode();
            Assert.assertEquals(responseCode, 200, "While testing [" + url.toString() + "]");

            return getContent(connection);
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `directoryStream` initializer `null` is redundant
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/execution/GraphQLTestDataProvider.java`
#### Snippet
```java
    private static Object[][] getTestData(DataFrom dataFrom){
        try {
            DirectoryStream<Path> directoryStream = null;
            if(dataFrom.equals(DataFrom.specification)){
                directoryStream = DynamicPaths.getDataForSpecification();
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/superhero/model/Team.java`
#### Snippet
```java
        }
        for (SuperHero hero : heroes) {
            members.add(hero);
        }
        return this;
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/execution/TestData.java`
#### Snippet
```java
        if(properties!=null && !properties.isEmpty() && properties.containsKey(key)){
            String ignore = properties.getProperty(key);
            if(ignore!=null && !ignore.isEmpty() && ignore.equalsIgnoreCase("true")){
                return true;
            }
```

### TrivialIf
`if` statement can be simplified
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/execution/TestData.java`
#### Snippet
```java
            return false;
        }
        if (!Objects.equals(this.properties, other.properties)) {
            return false;
        }
```

