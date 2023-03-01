# microprofile-graphql 
 
# Bad smells
I found 118 bad smells with 29 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryBoxing | 23 | false |
| UnnecessaryModifier | 17 | true |
| BoundedWildcard | 10 | false |
| DynamicRegexReplaceableByCompiledPattern | 8 | false |
| AssignmentToMethodParameter | 5 | false |
| ReturnNull | 5 | false |
| CodeBlock2Expr | 4 | true |
| RedundantFieldInitialization | 4 | false |
| UnnecessaryLocalVariable | 4 | true |
| ZeroLengthArrayInitialization | 4 | false |
| SizeReplaceableByIsEmpty | 3 | true |
| SystemOutErr | 3 | false |
| UseOfPropertiesAsHashtable | 3 | false |
| UnnecessaryFullyQualifiedName | 2 | false |
| NestedAssignment | 2 | false |
| DuplicateThrows | 2 | false |
| NonFinalFieldOfException | 2 | false |
| ManualArrayToCollectionCopy | 1 | false |
| DataFlowIssue | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| NonSerializableFieldInSerializableClass | 1 | false |
| OnlyOneElementUsed | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| SetReplaceableByEnumSet | 1 | false |
| MissortedModifiers | 1 | false |
| OptionalUsedAsFieldOrParameterType | 1 | false |
| AccessStaticViaInstance | 1 | false |
| CharsetObjectCanBeUsed | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| Convert2Lambda | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| UnusedAssignment | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[ruleID=UnnecessaryModifier]
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
Modifier `static` is redundant for inner enums
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/execution/GraphQLTestDataProvider.java`
#### Snippet
```java
    private static final Logger LOG = Logger.getLogger(GraphQLTestDataProvider.class.getName());

    private static enum DataFrom {
        implementation,specification
    }
```

## RuleId[ruleID=ManualArrayToCollectionCopy]
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

## RuleId[ruleID=DataFlowIssue]
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

## RuleId[ruleID=SimplifyStreamApiCallChains]
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

## RuleId[ruleID=StringOperationCanBeSimplified]
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

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'partialResults' in a Serializable class
in `server/api/src/main/java/org/eclipse/microprofile/graphql/GraphQLException.java`
#### Snippet
```java
    private ExceptionType type; 

    private Object partialResults;

    public GraphQLException() {
```

## RuleId[ruleID=OnlyOneElementUsed]
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

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`schema.length() > 0` can be replaced with '!schema.isEmpty()'
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/SchemaDynamicValidityTest.java`
#### Snippet
```java
        
        // Check that there is some content
        Assert.assertTrue(schema.length() > 0, "No Content in the GraphQL Schema downloaded from [" + uri + "]");
    }

```

### SizeReplaceableByIsEmpty
`testData.getInput().size() > 0` can be replaced with '!testData.getInput().isEmpty()'
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/execution/GraphQLTestDataProvider.java`
#### Snippet
```java
                try {
                    TestData testData = toTestData(testFolder);
                    if(!testData.shouldIgnore() && testData.getInput().size() > 0){
                        testDataList.add(testData);
                    }
```

### SizeReplaceableByIsEmpty
`members.size() > 0` can be replaced with '!members.isEmpty()'
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/superhero/api/HeroFinder.java`
#### Snippet
```java
        List<SuperHero> members = newTeam.getMembers();
        Team team = heroDB.createNewTeam(newTeam.getName());
        if (members != null && members.size() > 0) {
            team.setMembers(members);
        }
```

## RuleId[ruleID=UnnecessaryToStringCall]
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

## RuleId[ruleID=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/execution/GraphQLTestDataProvider.java`
#### Snippet
```java
    private static TestData toTestData(Path folder) throws IOException {
        TestData testData = new TestData(folder.getFileName().toString().replace("/", ""));
        Files.walkFileTree(folder,new HashSet<>(), 1, new FileVisitor<Path>() {

            @Override
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Sidekick`
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/superhero/db/SidekickDatabase.java`
#### Snippet
```java
    }

    public int addSidekicks(Collection<Sidekick> sidekicks) {
        int count = 0;
        for (Sidekick sidekick : sidekicks) {
```

### BoundedWildcard
Can generalize to `? extends SuperHero`
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/superhero/db/HeroDatabase.java`
#### Snippet
```java
    }

    public int addHeroes(Collection<SuperHero> heroes) {
        int count = 0;
        for (SuperHero hero : heroes) {
```

### BoundedWildcard
Can generalize to `? extends Path`
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/schema/SchemaTestDataProvider.java`
#### Snippet
```java
    }
    
    private static List<Path> toListOfPaths(DirectoryStream<Path> directoryStream){
        List<Path> files = new ArrayList<>();
        for(Path p: directoryStream){
```

### BoundedWildcard
Can generalize to `? extends Path`
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/schema/SchemaTestDataProvider.java`
#### Snippet
```java
    }
    
    private static List<TestData> toListOfTestData(List<Path> testFolders){
        List<TestData> testDataList = new LinkedList<>();
        for (Path testFile : testFolders) {
```

### BoundedWildcard
Can generalize to `? extends TestData`
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/execution/GraphQLTestDataProvider.java`
#### Snippet
```java
    }

    private static void sort(List<TestData> testDataList){
        Collections.sort(testDataList, new Comparator<TestData>() {
            @Override
```

### BoundedWildcard
Can generalize to `? extends Path`
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/execution/GraphQLTestDataProvider.java`
#### Snippet
```java
    }
    
    private static List<TestData> toListOfTestData(Set<Path> testFolders){
        List<TestData> testDataList = new ArrayList<>();
        for (Path testFolder : testFolders) {
```

### BoundedWildcard
Can generalize to `? extends Path`
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/execution/GraphQLTestDataProvider.java`
#### Snippet
```java
    }

    private static Set<Path> toListOfPaths(DirectoryStream<Path> directoryStream){
        Set<Path> directories = new HashSet<>();
        for(Path p: directoryStream){
```

### BoundedWildcard
Can generalize to `? extends TestData`
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/execution/GraphQLTestDataProvider.java`
#### Snippet
```java
    }

    private static Object[][] toObjectArray(List<TestData> testDataList){
        Object[][] testParameters = new Object[testDataList.size()][1];
        for (int row = 0; row < testDataList.size(); row++) {
```

### BoundedWildcard
Can generalize to `? extends Throwable`
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/ExecutionDynamicTest.java`
#### Snippet
```java
    }

    private String getErrorMessages(ArrayList<Throwable> listExceptions){
        StringBuilder sb = new StringBuilder();
        listExceptions.forEach(ex -> sb.append(ex.getMessage()).append('\n'));
```

### BoundedWildcard
Can generalize to `? super SuperHero`
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/superhero/api/HeroFinder.java`
#### Snippet
```java
    }
    
    private Collection<SuperHero> allHeroesByFilter(Predicate<SuperHero> predicate) {
        return heroDB.getAllHeroes()
                .stream()
```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/superhero/model/Item.java`
#### Snippet
```java
    private OffsetDateTime dateLastUsed;
    
    public final static String CAPE =
        "{" +
        "   \"id\": 1000," +
```

## RuleId[ruleID=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/execution/TestData.java`
#### Snippet
```java
    public int getExpectedHttpStatusCode() {
        if(properties!=null && !properties.isEmpty() && properties.containsKey("expectedHttpStatusCode")){
            return Integer.valueOf(properties.getProperty("expectedHttpStatusCode"));
        }
        return 200; // default
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/schema/SchemaTestDataProvider.java`
#### Snippet
```java

    private static boolean disableSpecificationTests(){
        return Boolean.valueOf(System.getProperty("disableSpecificationTests", "false"));
    }
    
```

### UnnecessaryBoxing
Unnecessary boxing
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/basic/api/ScalarTestApi.java`
#### Snippet
```java
        // Short
        short s = 123;
        sh.setShortObject(new Short(s));
        sh.setFormattedShortObject(new Short(s));
        sh.setShortPrimitive(s);
```

### UnnecessaryBoxing
Unnecessary boxing
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/basic/api/ScalarTestApi.java`
#### Snippet
```java
        short s = 123;
        sh.setShortObject(new Short(s));
        sh.setFormattedShortObject(new Short(s));
        sh.setShortPrimitive(s);

```

### UnnecessaryBoxing
Unnecessary boxing
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/basic/api/ScalarTestApi.java`
#### Snippet
```java
        // Integer
        int i = 123456789;
        sh.setIntObject(new Integer(i));
        sh.setFormattedIntObject(new Integer(i));
        sh.setIntPrimitive(i);
```

### UnnecessaryBoxing
Unnecessary boxing
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/basic/api/ScalarTestApi.java`
#### Snippet
```java
        int i = 123456789;
        sh.setIntObject(new Integer(i));
        sh.setFormattedIntObject(new Integer(i));
        sh.setIntPrimitive(i);

```

### UnnecessaryBoxing
Unnecessary boxing
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/basic/api/ScalarTestApi.java`
#### Snippet
```java
        // Long
        long l = 123456789L;
        sh.setLongObject(new Long(l));
        sh.setFormattedLongObject(new Long(l));
        sh.setLongPrimitive(l);
```

### UnnecessaryBoxing
Unnecessary boxing
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/basic/api/ScalarTestApi.java`
#### Snippet
```java
        long l = 123456789L;
        sh.setLongObject(new Long(l));
        sh.setFormattedLongObject(new Long(l));
        sh.setLongPrimitive(l);
        sh.setFormattedLongPrimitive(l);
```

### UnnecessaryBoxing
Unnecessary boxing
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/basic/api/ScalarTestApi.java`
#### Snippet
```java
        // Float
        float f = 123456.789F;
        sh.setFloatObject(new Float(f));
        sh.setFormattedFloatObject(new Float(f));
        sh.setFloatPrimitive(f);
```

### UnnecessaryBoxing
Unnecessary boxing
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/basic/api/ScalarTestApi.java`
#### Snippet
```java
        float f = 123456.789F;
        sh.setFloatObject(new Float(f));
        sh.setFormattedFloatObject(new Float(f));
        sh.setFloatPrimitive(f);

```

### UnnecessaryBoxing
Unnecessary boxing
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/basic/api/ScalarTestApi.java`
#### Snippet
```java
        // Double
        double d = 123456.789;
        sh.setDoubleObject(new Double(d));
        sh.setFormattedDoubleObject(new Double(d));
        sh.setDoublePrimitive(d);
```

### UnnecessaryBoxing
Unnecessary boxing
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/basic/api/ScalarTestApi.java`
#### Snippet
```java
        double d = 123456.789;
        sh.setDoubleObject(new Double(d));
        sh.setFormattedDoubleObject(new Double(d));
        sh.setDoublePrimitive(d);

```

### UnnecessaryBoxing
Unnecessary boxing
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/basic/api/ScalarTestApi.java`
#### Snippet
```java

        // Boolean
        sh.setBooleanObject(Boolean.valueOf(false));
        sh.setBooleanPrimitive(false);

```

### UnnecessaryBoxing
Unnecessary boxing
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/basic/api/ScalarTestApi.java`
#### Snippet
```java
        // Character
        char c = "c".charAt(0);
        sh.setCharObject(new Character(c));
        sh.setCharPrimitive(c);

```

### UnnecessaryBoxing
Unnecessary boxing
in `client/tck/src/main/java/org/eclipse/microprofile/graphql/client/tck/core/ScalarsTest.java`
#### Snippet
```java
                                        arg("scalarHolder", inputObject(
                                                prop("booleanPrimitive", false),
                                                prop("booleanObject", Boolean.valueOf(true)),

                                                prop("bytePrimitive", Byte.MIN_VALUE),
```

### UnnecessaryBoxing
Unnecessary boxing
in `client/tck/src/main/java/org/eclipse/microprofile/graphql/client/tck/core/ScalarsTest.java`
#### Snippet
```java

                                                prop("bytePrimitive", Byte.MIN_VALUE),
                                                prop("byteObject", Byte.valueOf(Byte.MAX_VALUE)),

                                                prop("shortPrimitive", Short.MIN_VALUE),
```

### UnnecessaryBoxing
Unnecessary boxing
in `client/tck/src/main/java/org/eclipse/microprofile/graphql/client/tck/core/ScalarsTest.java`
#### Snippet
```java

                                                prop("shortPrimitive", Short.MIN_VALUE),
                                                prop("shortObject", Short.valueOf(Short.MAX_VALUE)),

                                                prop("intPrimitive", Integer.MIN_VALUE + 1),
```

### UnnecessaryBoxing
Unnecessary boxing
in `client/tck/src/main/java/org/eclipse/microprofile/graphql/client/tck/core/ScalarsTest.java`
#### Snippet
```java

                                                prop("intPrimitive", Integer.MIN_VALUE + 1),
                                                prop("intObject", Integer.valueOf(Integer.MAX_VALUE)),

                                                prop("longPrimitive", Long.MIN_VALUE),
```

### UnnecessaryBoxing
Unnecessary boxing
in `client/tck/src/main/java/org/eclipse/microprofile/graphql/client/tck/core/ScalarsTest.java`
#### Snippet
```java

                                                prop("longPrimitive", Long.MIN_VALUE),
                                                prop("longObject", Long.valueOf(Long.MAX_VALUE)),

                                                prop("floatPrimitive", Float.MIN_VALUE),
```

### UnnecessaryBoxing
Unnecessary boxing
in `client/tck/src/main/java/org/eclipse/microprofile/graphql/client/tck/core/ScalarsTest.java`
#### Snippet
```java

                                                prop("floatPrimitive", Float.MIN_VALUE),
                                                prop("floatObject", Float.valueOf(Float.MAX_VALUE)),

                                                prop("doublePrimitive", Double.MIN_VALUE),
```

### UnnecessaryBoxing
Unnecessary boxing
in `client/tck/src/main/java/org/eclipse/microprofile/graphql/client/tck/core/ScalarsTest.java`
#### Snippet
```java

                                                prop("doublePrimitive", Double.MIN_VALUE),
                                                prop("doubleObject", Double.valueOf(Double.MAX_VALUE)),

                                                prop("bigInteger", BigInteger.TEN),
```

### UnnecessaryBoxing
Unnecessary boxing
in `client/tck/src/main/java/org/eclipse/microprofile/graphql/client/tck/core/ScalarsTest.java`
#### Snippet
```java

                                                prop("charPrimitive", 'a'),
                                                prop("charObject", Character.valueOf('Z')),

                                                prop("stringObject", "Hello World !")
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/execution/GraphQLTestDataProvider.java`
#### Snippet
```java
    
    private static boolean disableSpecificationTests(){
        return Boolean.valueOf(System.getProperty("disableSpecificationTests", "false"));
    }
}
```

## RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'value'
in `client/api/src/main/java/org/eclipse/microprofile/graphql/client/core/Variable.java`
#### Snippet
```java
    Optional<Object> getDefaultValue();

    void setDefaultValue(Optional<Object> value);
}

```

## RuleId[ruleID=AccessStaticViaInstance]
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

## RuleId[ruleID=CharsetObjectCanBeUsed]
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

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `client/tck/src/main/java/org/eclipse/microprofile/graphql/client/tck/helper/AssertGraphQL.java`
#### Snippet
```java
            parser.parseDocument(request);
        } catch (InvalidSyntaxException e) {
            System.err.println(request);
            throw (e);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/superhero/db/SidekickDatabase.java`
#### Snippet
```java
                count++;
            } catch (DuplicateSidekickException ex) {
                System.out.println("Already added : " + sidekick.getName());
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/superhero/db/HeroDatabase.java`
#### Snippet
```java
                count++;
            } catch (DuplicateSuperHeroException ex) {
                System.out.println("Already added : " + hero.getName());
            }
        }
```

## RuleId[ruleID=ConditionCoveredByFurtherCondition]
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

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `client/tck/src/main/java/org/eclipse/microprofile/graphql/client/tck/helper/AssertGraphQL.java`
#### Snippet
```java
        return request
                .trim()
                .replaceAll("\\s+", "")
                .replaceAll(System.getProperty("line.separator"), "")
                .replaceAll(",", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `client/tck/src/main/java/org/eclipse/microprofile/graphql/client/tck/helper/AssertGraphQL.java`
#### Snippet
```java
                .replaceAll("\\s+", "")
                .replaceAll(System.getProperty("line.separator"), "")
                .replaceAll(",", "");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/schema/CsvParser.java`
#### Snippet
```java
        }
        if (containsString.contains(OR)) {
            String[] containsStrings = containsString.split(OR);
            for (String oneOf : containsStrings) {
                testData.addContainsString(oneOf.trim());
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/schema/CsvParser.java`
#### Snippet
```java
            testData.setCondition(TestData.Condition.OR);
        } else if (containsString.contains(AND)) {
            String[] containsStrings = containsString.split(AND);
            for (String oneOf : containsStrings) {
                testData.addContainsString(oneOf.trim());
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/execution/GraphQLTestDataProvider.java`
#### Snippet
```java
                    String filename = file.getFileName().toString();

                    if (filename.matches("output.*\\.json")){
                        // Special case to cater for multiple output*.json files where the
                        // test will pass on the first file content that matches.
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/execution/GraphQLTestDataProvider.java`
#### Snippet
```java
                        String content = getFileContent(file);
                        testData.addOutput(content);
                    } else if (filename.matches("input.*\\.graphql")){
                        // Special case to cater for multiple input*.graphql files where the
                        // test will pass on the first file input content which is successful.
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/execution/GraphQLTestDataProvider.java`
#### Snippet
```java

    private static TestData toTestData(Path folder) throws IOException {
        TestData testData = new TestData(folder.getFileName().toString().replace("/", ""));
        Files.walkFileTree(folder,new HashSet<>(), 1, new FileVisitor<Path>() {

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/superhero/api/HeroFinder.java`
#### Snippet
```java
        String uuid = UUID.randomUUID().toString();
        if(maskFirstPart){
            return new Token(uuid.substring(0,uuid.length()-4).replaceAll("[A-Za-z0-9]", "*") + uuid.substring(uuid.length()-4,uuid.length()));
        }else{
            return new Token(uuid);
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `server/api/src/main/java/org/eclipse/microprofile/graphql/GraphQLException.java`
#### Snippet
```java
    }

    public java.lang.Object getPartialResults() {
        return partialResults;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `server/api/src/main/java/org/eclipse/microprofile/graphql/package-info.java`
#### Snippet
```java
 * @since 1.0
 */
@org.osgi.annotation.versioning.Version("1.0")
package org.eclipse.microprofile.graphql;

```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/SchemaDynamicValidityTest.java`
#### Snippet
```java
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            String inputLine;
            while ((inputLine = in.readLine()) != null){
                sw.write(inputLine);
                sw.write("\n");
```

### NestedAssignment
Result of assignment expression used
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/ExecutionDynamicTest.java`
#### Snippet
```java
                StringBuilder response = new StringBuilder();
                String responseLine;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
```

## RuleId[ruleID=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/superhero/api/HeroFinder.java`
#### Snippet
```java
        }
        hero.getEquipment().removeIf(i -> {
            return i.getId() == itemID;
        });
        return hero;
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/superhero/api/HeroFinder.java`
#### Snippet
```java
        LOG.log(Level.INFO, "allHeroesIn invoked [{0}]", city);
        return allHeroesByFilter(hero -> {
            return city.equals(hero.getPrimaryLocation());
        });
    }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/superhero/api/HeroFinder.java`
#### Snippet
```java
        return heroLocator.getHeroLocation(heroName)
                .orElseThrow(() -> {
                    return new GraphQLException("Cannot find location for " + heroName,
                            GraphQLException.ExceptionType.DataFetchingException);
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/superhero/api/HeroFinder.java`
#### Snippet
```java
        LOG.log(Level.INFO, "allHeroesWithPower invoked [{0}]", power);
        return allHeroesByFilter(hero -> {
            return hero.getSuperPowers().contains(power);
        });
    }
```

## RuleId[ruleID=Convert2Lambda]
### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/execution/GraphQLTestDataProvider.java`
#### Snippet
```java

    private static void sort(List<TestData> testDataList){
        Collections.sort(testDataList, new Comparator<TestData>() {
            @Override
            public int compare(TestData u1, TestData u2) {
```

## RuleId[ruleID=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/DeployableUnit.java`
#### Snippet
```java
    private static final Properties PROPERTIES = new Properties();
    static {
        PROPERTIES.put(ConfigKey.DEFAULT_ERROR_MESSAGE, "Unexpected failure in the system. Jarvis is working to fix it.");
        PROPERTIES.put(ConfigKey.EXCEPTION_HIDE_ERROR_MESSAGE_LIST, "java.io.IOException,java.util.concurrent.TimeoutException");
        PROPERTIES.put(ConfigKey.EXCEPTION_SHOW_ERROR_MESSAGE_LIST, 
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/DeployableUnit.java`
#### Snippet
```java
    static {
        PROPERTIES.put(ConfigKey.DEFAULT_ERROR_MESSAGE, "Unexpected failure in the system. Jarvis is working to fix it.");
        PROPERTIES.put(ConfigKey.EXCEPTION_HIDE_ERROR_MESSAGE_LIST, "java.io.IOException,java.util.concurrent.TimeoutException");
        PROPERTIES.put(ConfigKey.EXCEPTION_SHOW_ERROR_MESSAGE_LIST, 
                       "org.eclipse.microprofile.graphql.tck.apps.superhero.api.WeaknessNotFoundException");
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/DeployableUnit.java`
#### Snippet
```java
        PROPERTIES.put(ConfigKey.DEFAULT_ERROR_MESSAGE, "Unexpected failure in the system. Jarvis is working to fix it.");
        PROPERTIES.put(ConfigKey.EXCEPTION_HIDE_ERROR_MESSAGE_LIST, "java.io.IOException,java.util.concurrent.TimeoutException");
        PROPERTIES.put(ConfigKey.EXCEPTION_SHOW_ERROR_MESSAGE_LIST, 
                       "org.eclipse.microprofile.graphql.tck.apps.superhero.api.WeaknessNotFoundException");
    }
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/schema/TestData.java`
#### Snippet
```java
    private String snippetSearchTerm;
    private List<String> containsString = new ArrayList<>();
    private Condition condition = null;
    private String errorMessage;
    
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/ExecutionDynamicTest.java`
#### Snippet
```java

    private HttpMethod currentHttpMethod = null;
    private TestData currentTestData = null;
    private String currentOutput = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/ExecutionDynamicTest.java`
#### Snippet
```java
    private HttpMethod currentHttpMethod = null;
    private TestData currentTestData = null;
    private String currentOutput = null;

    @ArquillianResource
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/ExecutionDynamicTest.java`
#### Snippet
```java
    private static final int READ_TIMEOUT = Integer.getInteger("mp.tck.read.timeout", 5000);

    private HttpMethod currentHttpMethod = null;
    private TestData currentTestData = null;
    private String currentOutput = null;
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `expectedRequest`
in `client/tck/src/main/java/org/eclipse/microprofile/graphql/client/tck/helper/AssertGraphQL.java`
#### Snippet
```java
        to actually be able to compare them without taking into account insignificant differences.
         */
        expectedRequest = unformatRequest(expectedRequest);
        actualRequest = unformatRequest(actualRequest);

```

### AssignmentToMethodParameter
Assignment to method parameter `actualRequest`
in `client/tck/src/main/java/org/eclipse/microprofile/graphql/client/tck/helper/AssertGraphQL.java`
#### Snippet
```java
         */
        expectedRequest = unformatRequest(expectedRequest);
        actualRequest = unformatRequest(actualRequest);

        assertEquals(expectedRequest, actualRequest);
```

### AssignmentToMethodParameter
Assignment to method parameter `single`
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/SchemaDynamicValidityTest.java`
#### Snippet
```java
    private boolean matchSingle(String single,String snippet){
        if(single.startsWith("!")){
            single = single.substring(1);
            return !snippet.contains(single);
        }else{
```

### AssignmentToMethodParameter
Assignment to method parameter `emptyJsonErrorPatchBuilder`
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/ExecutionDynamicTest.java`
#### Snippet
```java
    private JsonPatchBuilder remove(JsonPatchBuilder emptyJsonErrorPatchBuilder,JsonObject errorJsonObject, String key){
        if(errorJsonObject.containsKey(key)){
            emptyJsonErrorPatchBuilder = emptyJsonErrorPatchBuilder.remove("/" + key);
        }
        return emptyJsonErrorPatchBuilder;
```

### AssignmentToMethodParameter
Assignment to method parameter `httpMethod`
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/ExecutionDynamicTest.java`
#### Snippet
```java
        // We can only do Queries over GET
        if(testData.isMutation()){
            httpMethod = HttpMethod.POST;
        }

```

## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-01-01-39-25.117.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/execution/PrintUtil.java`
#### Snippet
```java
    private static String prettyJson(String text) {
        if (text == null) {
            return null;
        }
        if(isJson(text)) {
```

### ReturnNull
Return of `null`
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/execution/PrintUtil.java`
#### Snippet
```java
            return sw.toString();
        }
        return null;
    }
    
```

### ReturnNull
Return of `null`
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/superhero/db/HeroDatabase.java`
#### Snippet
```java
        SuperHero hero = allHeroes.remove(heroName);
        if (hero == null) {
            return null;
        }
        for (Team team : getAllTeams()) {
```

### ReturnNull
Return of `null`
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/execution/GraphQLTestDataProvider.java`
#### Snippet
```java
    private static JsonObject toJsonObject(String jsonString){
        if(jsonString==null || jsonString.isEmpty()) {
            return null;
        }
        try (JsonReader jsonReader = Json.createReader(new StringReader(jsonString))) {
```

### ReturnNull
Return of `null`
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/superhero/api/HeroFinder.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

## RuleId[ruleID=UnnecessaryLocalVariable]
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

## RuleId[ruleID=DuplicateThrows]
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

## RuleId[ruleID=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `partialResults` of exception class
in `server/api/src/main/java/org/eclipse/microprofile/graphql/GraphQLException.java`
#### Snippet
```java
    private ExceptionType type; 

    private Object partialResults;

    public GraphQLException() {
```

### NonFinalFieldOfException
Non-final field `type` of exception class
in `server/api/src/main/java/org/eclipse/microprofile/graphql/GraphQLException.java`
#### Snippet
```java
    }

    private ExceptionType type; 

    private Object partialResults;
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `client/tck/src/main/java/org/eclipse/microprofile/graphql/client/tck/core/NestedObjectsTest.java`
#### Snippet
```java
                prop("level", 0),
                prop("name", "level 0"),
                prop("levelLineage", new byte[]{}),
                prop("nestedObjectLineage", new InputObject[]{})
        );
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `client/tck/src/main/java/org/eclipse/microprofile/graphql/client/tck/core/NestedObjectsTest.java`
#### Snippet
```java
                prop("name", "level 0"),
                prop("levelLineage", new byte[]{}),
                prop("nestedObjectLineage", new InputObject[]{})
        );
        InputObject baseObject1 = inputObject(
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/apps/superhero/db/HeroDatabase.java`
#### Snippet
```java

    public Team removeHeroesFromTeam(Team team, Collection<SuperHero> heroes) {
        return removeHeroesFromTeam(team, heroes.toArray(new SuperHero[]{}));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `server/tck/src/main/java/org/eclipse/microprofile/graphql/tck/dynamic/execution/GraphQLTestDataProvider.java`
#### Snippet
```java
        } catch (Exception ex) {
            LOG.log(Level.INFO, "No " + dataFrom.name() + " specific tests found [{0}]", ex.getMessage());
            return new Object[][]{};
        }
    }
```

## RuleId[ruleID=UnusedAssignment]
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

## RuleId[ruleID=UseBulkOperation]
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

