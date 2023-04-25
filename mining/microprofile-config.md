# microprofile-config 
 
# Bad smells
I found 315 bad smells with 18 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| OptionalGetWithoutIsPresent | 130 | false |
| OptionalContainsCollection | 65 | false |
| UnnecessaryLocalVariable | 18 | true |
| OptionalUsedAsFieldOrParameterType | 17 | false |
| MissortedModifiers | 16 | false |
| UnnecessaryFullyQualifiedName | 14 | false |
| AssertBetweenInconvertibleTypes | 12 | false |
| EmptyMethod | 8 | false |
| CollectionContainsUrl | 7 | false |
| Convert2MethodRef | 6 | false |
| UnnecessaryBoxing | 3 | false |
| ReturnNull | 3 | false |
| DataFlowIssue | 2 | false |
| NestedAssignment | 2 | false |
| RedundantFieldInitialization | 2 | false |
| OptionalIsPresent | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| FinalPrivateMethod | 1 | false |
| FinalStaticMethod | 1 | false |
| AbstractClassNeverImplemented | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| ExtendsAnnotation | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| SynchronizeOnThis | 1 | false |
| UnusedAssignment | 1 | false |
## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `tck/src/main/java/org/eclipse/microprofile/config/tck/converters/convertToNull/ConvertedNullValueTest.java`
#### Snippet
```java

        public Pizza getPizza() {
            return myPizza.isPresent() ? myPizza.get() : null;
        }
    }
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `Thread.currentThread().getContextClassLoader().getResource("internal/" + originalPath)` might be null
in `tck/src/main/java/org/eclipse/microprofile/config/tck/base/AbstractTest.java`
#### Snippet
```java
    public static void addFile(ResourceContainer<?> archive, String originalPath) {
        archive.addAsResource(
                new UrlAsset(Thread.currentThread().getContextClassLoader().getResource("internal/" + originalPath)),
                originalPath);
    }
```

### DataFlowIssue
Argument `Thread.currentThread().getContextClassLoader().getResource(originalFile)` might be null
in `tck/src/main/java/org/eclipse/microprofile/config/tck/base/AbstractTest.java`
#### Snippet
```java

    public static void addFile(ResourceContainer<?> archive, String originalFile, String targetFile) {
        archive.addAsResource(new UrlAsset(Thread.currentThread().getContextClassLoader().getResource(originalFile)),
                targetFile);
    }
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `tck/src/main/java/org/eclipse/microprofile/config/tck/converters/implicit/ConvTestSequenceOfBeforeValueOf.java`
#### Snippet
```java
    public static ConvTestSequenceOfBeforeValueOf of(String val) {
        ConvTestSequenceOfBeforeValueOf o = new ConvTestSequenceOfBeforeValueOf();
        o.val = val.toString();
        return o;
    }
```

## RuleId[id=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains collection `List`
in `api/src/main/java/org/eclipse/microprofile/config/Config.java`
#### Snippet
```java
     *             if the property cannot be converted to the specified type
     */
    default <T> Optional<List<T>> getOptionalValues(String propertyName, Class<T> propertyType) {
        @SuppressWarnings("unchecked")
        Class<T[]> arrayType = (Class<T[]>) Array.newInstance(propertyType, 0).getClass();
```

### OptionalContainsCollection
'Optional' contains array `Instant[]`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testOptionalInstantArrayLookupProgrammatically() {
        Optional<Instant[]> optionalValue =
                config.getOptionalValue("tck.config.test.javaconfig.converter.instantvalues",
                        Instant[].class);
```

### OptionalContainsCollection
'Optional' contains array `Instant[]`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
                Instant.parse("2015-06-02T21:34:33.616Z"),
                Instant.parse("2017-06-02T21:34:33.616Z")});
        Optional<Instant[]> optionalSingle =
                config.getOptionalValue("tck.config.test.javaconfig.converter.instantvalue",
                        Instant[].class);
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testOptionalInstantListLookupProgrammatically() {
        Optional<List<Instant>> optionalValues =
                config.getOptionalValues("tck.config.test.javaconfig.converter.instantvalues",
                        Instant.class);
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
                Instant.parse("2015-06-02T21:34:33.616Z"),
                Instant.parse("2017-06-02T21:34:33.616Z")));
        Optional<List<Instant>> optionalSingle =
                config.getOptionalValues("tck.config.test.javaconfig.converter.instantvalue",
                        Instant.class);
```

### OptionalContainsCollection
'Optional' contains array `Long[]`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testOptionalLongArrayLookupProgrammatically() {
        Optional<Long[]> optionalValue = config.getOptionalValue("tck.config.test.javaconfig.converter.longvalues",
                Long[].class);
        Assert.assertTrue(optionalValue.isPresent());
```

### OptionalContainsCollection
'Optional' contains array `Long[]`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertEquals(value.length, 2);
        Assert.assertEquals(value, new Long[]{1234567890L, 1999999999L});
        Optional<Long[]> optionalSingle = config.getOptionalValue("tck.config.test.javaconfig.converter.longvalue",
                Long[].class);
        Assert.assertTrue(optionalSingle.isPresent());
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testOptionalOffsetTimeListLookupProgrammatically() {
        Optional<List<OffsetTime>> optionalValues =
                config.getOptionalValues("tck.config.test.javaconfig.converter.offsettimevalues",
                        OffsetTime.class);
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
                OffsetTime.parse("13:45:30.123456789+02:00"),
                OffsetTime.parse("13:45:30.123456789+03:00")));
        Optional<List<OffsetTime>> optionalSingle =
                config.getOptionalValues("tck.config.test.javaconfig.converter.offsettimevalue",
                        OffsetTime.class);
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testOptionalCustomTypeListLookupProgrammatically() {
        Optional<List<Pizza>> optionalValues =
                config.getOptionalValues("tck.config.test.javaconfig.converter.array.pizza",
                        Pizza.class);
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
                new Pizza("chicken", "medium"),
                new Pizza("pepperoni", "small")));
        Optional<List<Pizza>> optionalSingle = config.getOptionalValues("tck.config.test.javaconfig.converter.pizza",
                Pizza.class);
        Assert.assertTrue(optionalSingle.isPresent());
```

### OptionalContainsCollection
'Optional' contains array `Pizza[]`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testOptionalCustomTypeArrayLookupProgrammatically() {
        Optional<Pizza[]> optionalValue = config.getOptionalValue("tck.config.test.javaconfig.converter.array.pizza",
                Pizza[].class);
        Assert.assertTrue(optionalValue.isPresent());
```

### OptionalContainsCollection
'Optional' contains array `Pizza[]`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
                new Pizza("chicken", "medium"),
                new Pizza("pepperoni", "small")});
        Optional<Pizza[]> optionalSingle = config.getOptionalValue("tck.config.test.javaconfig.converter.pizza",
                Pizza[].class);
        Assert.assertTrue(optionalSingle.isPresent());
```

### OptionalContainsCollection
'Optional' contains array `Boolean[]`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testOptionalBooleanArrayLookupProgrammatically() {
        Optional<Boolean[]> optionalValue =
                config.getOptionalValue("tck.config.test.javaconfig.converter.booleanvalues",
                        Boolean[].class);
```

### OptionalContainsCollection
'Optional' contains array `Boolean[]`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertEquals(value.length, 3);
        Assert.assertEquals(value, new Boolean[]{true, false, true});
        Optional<Boolean[]> optionalSingle =
                config.getOptionalValue("tck.config.test.javaconfig.configvalue.boolean.true",
                        Boolean[].class);
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testOptionalIntegerListLookupProgrammatically() {
        Optional<List<Integer>> optionalValues =
                config.getOptionalValues("tck.config.test.javaconfig.converter.integervalues",
                        Integer.class);
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertEquals(values.size(), 2);
        Assert.assertEquals(values, Arrays.asList(1234, 9999));
        Optional<List<Integer>> optionalSingle =
                config.getOptionalValues("tck.config.test.javaconfig.converter.integervalue",
                        Integer.class);
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testOptionalDurationListLookupProgrammatically() {
        Optional<List<Duration>> optionalValues =
                config.getOptionalValues("tck.config.test.javaconfig.converter.durationvalues",
                        Duration.class);
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
                Duration.parse("PT15M"),
                Duration.parse("PT20M")));
        Optional<List<Duration>> optionalSingle =
                config.getOptionalValues("tck.config.test.javaconfig.converter.durationvalue",
                        Duration.class);
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testOptionalOffsetDateTimeListLookupProgrammatically() {
        Optional<List<OffsetDateTime>> optionalValues =
                config.getOptionalValues("tck.config.test.javaconfig.converter.offsetdatetimevalues",
                        OffsetDateTime.class);
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
                OffsetDateTime.parse("2007-12-03T10:15:30+01:00"),
                OffsetDateTime.parse("2007-12-03T10:15:30+02:00")));
        Optional<List<OffsetDateTime>> optionalSingle =
                config.getOptionalValues("tck.config.test.javaconfig.converter.offsetdatetimevalue",
                        OffsetDateTime.class);
```

### OptionalContainsCollection
'Optional' contains array `String[]`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testOptionalStringArrayLookupProgrammatically() {
        Optional<String[]> optionalValue = config.getOptionalValue("tck.config.test.javaconfig.converter.stringvalues",
                String[].class);
        Assert.assertTrue(optionalValue.isPresent());
```

### OptionalContainsCollection
'Optional' contains array `String[]`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertEquals(value.length, 4);
        Assert.assertEquals(value, new String[]{"microservice", "microprofile", "m,f", "microservice"});
        Optional<String[]> optionalSingle = config.getOptionalValue("tck.config.test.javaconfig.configvalue.key1",
                String[].class);
        Assert.assertTrue(optionalSingle.isPresent());
```

### OptionalContainsCollection
'Optional' contains array `OffsetDateTime[]`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testOptionalOffsetDateTimeArrayLookupProgrammatically() {
        Optional<OffsetDateTime[]> optionalValue =
                config.getOptionalValue("tck.config.test.javaconfig.converter.offsetdatetimevalues",
                        OffsetDateTime[].class);
```

### OptionalContainsCollection
'Optional' contains array `OffsetDateTime[]`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
                OffsetDateTime.parse("2007-12-03T10:15:30+01:00"),
                OffsetDateTime.parse("2007-12-03T10:15:30+02:00")});
        Optional<OffsetDateTime[]> optionalSingle =
                config.getOptionalValue("tck.config.test.javaconfig.converter.offsetdatetimevalue",
                        OffsetDateTime[].class);
```

### OptionalContainsCollection
'Optional' contains array `Double[]`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testOptionalDoubleArrayLookupProgrammatically() {
        Optional<Double[]> optionalValue = config.getOptionalValue("tck.config.test.javaconfig.converter.doublevalues",
                Double[].class);
        Assert.assertTrue(optionalValue.isPresent());
```

### OptionalContainsCollection
'Optional' contains array `Double[]`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertEquals(value.length, 2);
        Assert.assertEquals(value, new Double[]{12.34d, 99.9999d});
        Optional<Double[]> optionalSingle = config.getOptionalValue("tck.config.test.javaconfig.converter.doublevalue",
                Double[].class);
        Assert.assertTrue(optionalSingle.isPresent());
```

### OptionalContainsCollection
'Optional' contains array `URL[]`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testOptionalUrlArrayLookupProgrammatically() throws MalformedURLException, URISyntaxException {
        Optional<URL[]> optionalValue =
                config.getOptionalValue("tck.config.test.javaconfig.converter.urlvalues", URL[].class);
        Assert.assertTrue(optionalValue.isPresent());
```

### OptionalContainsCollection
'Optional' contains array `URL[]`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
                new URL("http://microprofile.io")};
        assertURLArrayEquals(value, expectedValue);
        Optional<URL[]> optionalSingle =
                config.getOptionalValue("tck.config.test.javaconfig.converter.urlvalue", URL[].class);
        Assert.assertTrue(optionalSingle.isPresent());
```

### OptionalContainsCollection
'Optional' contains array `Duration[]`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testOptionalDurationArrayLookupProgrammatically() {
        Optional<Duration[]> optionalValue =
                config.getOptionalValue("tck.config.test.javaconfig.converter.durationvalues",
                        Duration[].class);
```

### OptionalContainsCollection
'Optional' contains array `Duration[]`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
                Duration.parse("PT15M"),
                Duration.parse("PT20M")});
        Optional<Duration[]> optionalSingle =
                config.getOptionalValue("tck.config.test.javaconfig.converter.durationvalue",
                        Duration[].class);
```

### OptionalContainsCollection
'Optional' contains array `LocalDateTime[]`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testOptionalLocalDateTimeArrayLookupProgrammatically() {
        Optional<LocalDateTime[]> optionalValue =
                config.getOptionalValue("tck.config.test.javaconfig.converter.localdatetimevalues",
                        LocalDateTime[].class);
```

### OptionalContainsCollection
'Optional' contains array `LocalDateTime[]`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
                LocalDateTime.parse("2017-12-24T10:25:30"),
                LocalDateTime.parse("2017-12-24T10:25:33")});
        Optional<LocalDateTime[]> optionalSingle =
                config.getOptionalValue("tck.config.test.javaconfig.converter.localdatetimevalue",
                        LocalDateTime[].class);
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testOptionalUriListLookupProgrammatically() {
        Optional<List<URI>> optionalValues =
                config.getOptionalValues("tck.config.test.javaconfig.converter.urlvalues", URI.class);
        Assert.assertTrue(optionalValues.isPresent());
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
                URI.create("http://openliberty.io"),
                URI.create("http://microprofile.io")));
        Optional<List<URI>> optionalSingle =
                config.getOptionalValues("tck.config.test.javaconfig.converter.urlvalue", URI.class);
        Assert.assertTrue(optionalSingle.isPresent());
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testOptionalLocalDateTimeListLookupProgrammatically() {
        Optional<List<LocalDateTime>> optionalValues =
                config.getOptionalValues("tck.config.test.javaconfig.converter.localdatetimevalues",
                        LocalDateTime.class);
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
                LocalDateTime.parse("2017-12-24T10:25:30"),
                LocalDateTime.parse("2017-12-24T10:25:33")));
        Optional<List<LocalDateTime>> optionalSingle =
                config.getOptionalValues("tck.config.test.javaconfig.converter.localdatetimevalue",
                        LocalDateTime.class);
```

### OptionalContainsCollection
'Optional' contains array `Integer[]`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testOptionalIntegerArrayLookupProgrammatically() {
        Optional<Integer[]> optionalValue =
                config.getOptionalValue("tck.config.test.javaconfig.converter.integervalues",
                        Integer[].class);
```

### OptionalContainsCollection
'Optional' contains array `Integer[]`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertEquals(value.length, 2);
        Assert.assertEquals(value, new Integer[]{1234, 9999});
        Optional<Integer[]> optionalSingle =
                config.getOptionalValue("tck.config.test.javaconfig.converter.integervalue",
                        Integer[].class);
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testOptionalLocalDateListLookupProgrammatically() {
        Optional<List<LocalDate>> optionalValues =
                config.getOptionalValues("tck.config.test.javaconfig.converter.localdatevalues",
                        LocalDate.class);
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
                LocalDate.parse("2017-12-24"),
                LocalDate.parse("2017-11-29")));
        Optional<List<LocalDate>> optionalSingle =
                config.getOptionalValues("tck.config.test.javaconfig.converter.localdatevalue",
                        LocalDate.class);
```

### OptionalContainsCollection
'Optional' contains array `Float[]`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testOptionalFloatArrayLookupProgrammatically() {
        Optional<Float[]> optionalValue = config.getOptionalValue("tck.config.test.javaconfig.converter.floatvalues",
                Float[].class);
        Assert.assertTrue(optionalValue.isPresent());
```

### OptionalContainsCollection
'Optional' contains array `Float[]`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertEquals(value.length, 2);
        Assert.assertEquals(value, new Float[]{12.34f, 99.99f});
        Optional<Float[]> optionalSingle = config.getOptionalValue("tck.config.test.javaconfig.converter.floatvalue",
                Float[].class);
        Assert.assertTrue(optionalSingle.isPresent());
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testOptionalFloatListLookupProgrammatically() {
        Optional<List<Float>> optionalValues =
                config.getOptionalValues("tck.config.test.javaconfig.converter.floatvalues",
                        Float.class);
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertEquals(values.size(), 2);
        Assert.assertEquals(values, Arrays.asList(12.34f, 99.99f));
        Optional<List<Float>> optionalSingle =
                config.getOptionalValues("tck.config.test.javaconfig.converter.floatvalue",
                        Float.class);
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testOptionalUrlListLookupProgrammatically() throws MalformedURLException, URISyntaxException {
        Optional<List<URL>> optionalValues =
                config.getOptionalValues("tck.config.test.javaconfig.converter.urlvalues", URL.class);
        Assert.assertTrue(optionalValues.isPresent());
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
                new URL("http://microprofile.io"));
        assertURLListEquals(values, expectedValue);
        Optional<List<URL>> optionalSingle =
                config.getOptionalValues("tck.config.test.javaconfig.converter.urlvalue", URL.class);
        Assert.assertTrue(optionalSingle.isPresent());
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testOptionalLongListLookupProgrammatically() {
        Optional<List<Long>> optionalValues =
                config.getOptionalValues("tck.config.test.javaconfig.converter.longvalues",
                        Long.class);
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertEquals(values.size(), 2);
        Assert.assertEquals(values, Arrays.asList(1234567890L, 1999999999L));
        Optional<List<Long>> optionalSingle = config.getOptionalValues("tck.config.test.javaconfig.converter.longvalue",
                Long.class);
        Assert.assertTrue(optionalSingle.isPresent());
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testOptionalStringListLookupProgrammatically() {
        Optional<List<String>> optionalValues =
                config.getOptionalValues("tck.config.test.javaconfig.converter.stringvalues",
                        String.class);
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertEquals(values.size(), 4);
        Assert.assertEquals(values, Arrays.asList("microservice", "microprofile", "m,f", "microservice"));
        Optional<List<String>> optionalSingle = config.getOptionalValues("tck.config.test.javaconfig.configvalue.key1",
                String.class);
        Assert.assertTrue(optionalSingle.isPresent());
```

### OptionalContainsCollection
'Optional' contains array `OffsetTime[]`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testOptionalOffsetTimeArrayLookupProgrammatically() {
        Optional<OffsetTime[]> optionalValue =
                config.getOptionalValue("tck.config.test.javaconfig.converter.offsettimevalues",
                        OffsetTime[].class);
```

### OptionalContainsCollection
'Optional' contains array `OffsetTime[]`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
                OffsetTime.parse("13:45:30.123456789+02:00"),
                OffsetTime.parse("13:45:30.123456789+03:00")});
        Optional<OffsetTime[]> optionalSingle =
                config.getOptionalValue("tck.config.test.javaconfig.converter.offsettimevalue",
                        OffsetTime[].class);
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testOptionalBooleanListLookupProgrammatically() {
        Optional<List<Boolean>> optionalValues =
                config.getOptionalValues("tck.config.test.javaconfig.converter.booleanvalues",
                        Boolean.class);
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertEquals(value.size(), 3);
        Assert.assertEquals(value, Arrays.asList(true, false, true));
        Optional<List<Boolean>> optionalSingle =
                config.getOptionalValues("tck.config.test.javaconfig.configvalue.boolean.true",
                        Boolean.class);
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testOptionalLocalTimeListLookupProgrammatically() {
        Optional<List<LocalTime>> optionalValues =
                config.getOptionalValues("tck.config.test.javaconfig.converter.localtimevalues",
                        LocalTime.class);
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
                LocalTime.parse("10:37"),
                LocalTime.parse("11:44")));
        Optional<List<LocalTime>> optionalSingle =
                config.getOptionalValues("tck.config.test.javaconfig.converter.localtimevalue",
                        LocalTime.class);
```

### OptionalContainsCollection
'Optional' contains array `LocalDate[]`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testOptionalLocalDateArrayLookupProgrammatically() {
        Optional<LocalDate[]> optionalValue =
                config.getOptionalValue("tck.config.test.javaconfig.converter.localdatevalues",
                        LocalDate[].class);
```

### OptionalContainsCollection
'Optional' contains array `LocalDate[]`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
                LocalDate.parse("2017-12-24"),
                LocalDate.parse("2017-11-29")});
        Optional<LocalDate[]> optionalSingle =
                config.getOptionalValue("tck.config.test.javaconfig.converter.localdatevalue",
                        LocalDate[].class);
```

### OptionalContainsCollection
'Optional' contains array `LocalTime[]`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testOptionalLocalTimeArrayLookupProgrammatically() {
        Optional<LocalTime[]> optionalValue =
                config.getOptionalValue("tck.config.test.javaconfig.converter.localtimevalues",
                        LocalTime[].class);
```

### OptionalContainsCollection
'Optional' contains array `LocalTime[]`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
                LocalTime.parse("10:37"),
                LocalTime.parse("11:44")});
        Optional<LocalTime[]> optionalSingle =
                config.getOptionalValue("tck.config.test.javaconfig.converter.localtimevalue",
                        LocalTime[].class);
```

### OptionalContainsCollection
'Optional' contains array `URI[]`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testOptionalUriArrayLookupProgrammatically() {
        Optional<URI[]> optionalValue =
                config.getOptionalValue("tck.config.test.javaconfig.converter.urlvalues", URI[].class);
        Assert.assertTrue(optionalValue.isPresent());
```

### OptionalContainsCollection
'Optional' contains array `URI[]`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
                URI.create("http://openliberty.io"),
                URI.create("http://microprofile.io")});
        Optional<URI[]> optionalSingle =
                config.getOptionalValue("tck.config.test.javaconfig.converter.urlvalue", URI[].class);
        Assert.assertTrue(optionalSingle.isPresent());
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testOptionalDoubleListLookupProgrammatically() {
        Optional<List<Double>> optionalValues =
                config.getOptionalValues("tck.config.test.javaconfig.converter.doublevalues",
                        Double.class);
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertEquals(values.size(), 2);
        Assert.assertEquals(values, Arrays.asList(12.34d, 99.9999d));
        Optional<List<Double>> optionalSingle =
                config.getOptionalValues("tck.config.test.javaconfig.converter.doublevalue",
                        Double.class);
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
        Config config1 = ConfigProviderResolver.instance().getBuilder().addDefaultSources()
                .withConverter(Donald.class, 101, (s) -> Donald.iLikeDonald(s.toUpperCase()))
                .withConverter(Donald.class, 100, (s) -> Donald.iLikeDonald(s))
                .build();
        Config config2 = ConfigProviderResolver.instance().getBuilder().addDefaultSources()
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
                .build();
        Config config2 = ConfigProviderResolver.instance().getBuilder().addDefaultSources()
                .withConverter(Donald.class, 100, (s) -> Donald.iLikeDonald(s))
                .withConverter(Donald.class, 101, (s) -> Donald.iLikeDonald(s.toUpperCase()))
                .build();
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
        Config config1 = ConfigProviderResolver.instance().getBuilder().addDefaultSources()
                .withConverter(Donald.class, 101, (s) -> Donald.iLikeDonald(s.toUpperCase()))
                .withConverter(Donald.class, 100, (s) -> Donald.iLikeDonald(s))
                .build();
        Config config2 = ConfigProviderResolver.instance().getBuilder().addDefaultSources()
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
                .build();
        Config config2 = ConfigProviderResolver.instance().getBuilder().addDefaultSources()
                .withConverter(Donald.class, 100, (s) -> Donald.iLikeDonald(s))
                .withConverter(Donald.class, 101, (s) -> Donald.iLikeDonald(s.toUpperCase()))
                .build();
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    public void testDonaldConversionWithLambdaConverter() {
        Config newConfig = ConfigProviderResolver.instance().getBuilder().addDefaultSources()
                .withConverter(Donald.class, 100, (s) -> Donald.iLikeDonald(s))
                .build();
        Donald donald = newConfig.getValue("tck.config.test.javaconfig.converter.donaldname", Donald.class);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    public void testGetDonaldConverterWithLambdaConverter() {
        Config newConfig = ConfigProviderResolver.instance().getBuilder().addDefaultSources()
                .withConverter(Donald.class, 100, (s) -> Donald.iLikeDonald(s))
                .build();
        Donald donald = newConfig.getConverter(Donald.class).get().convert("Duck");
```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/broken/ConfigObserver.java`
#### Snippet
```java
    }

    private static final void onStartup(@Observes @Initialized(ApplicationScoped.class) final Object event,
            @ConfigProperty(name = "this.property.does.not.exist") final String nonExistentConfigurationPropertyValue) {
    }
```

## RuleId[id=CollectionContainsUrl]
### CollectionContainsUrl
Set `valueSet` may contain URL objects
in `tck/src/main/java/org/eclipse/microprofile/config/tck/util/AdditionalAssertions.java`
#### Snippet
```java
    }

    public static void assertURLSetEquals(Set<URL> valueSet, Set<URL> expectedURLSet)
            throws MalformedURLException, URISyntaxException {

```

### CollectionContainsUrl
Set `expectedURLSet` may contain URL objects
in `tck/src/main/java/org/eclipse/microprofile/config/tck/util/AdditionalAssertions.java`
#### Snippet
```java
    }

    public static void assertURLSetEquals(Set<URL> valueSet, Set<URL> expectedURLSet)
            throws MalformedURLException, URISyntaxException {

```

### CollectionContainsUrl
Set `mySingleUrlSet` may contain URL objects
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterBean.java`
#### Snippet
```java
    @Inject
    @ConfigProperty(name = "tck.config.test.javaconfig.converter.urlvalue")
    private Set<URL> mySingleUrlSet;

    @Inject
```

### CollectionContainsUrl
Set `myUrlSet` may contain URL objects
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterBean.java`
#### Snippet
```java
    @Inject
    @ConfigProperty(name = "tck.config.test.javaconfig.converter.urlvalues")
    private Set<URL> myUrlSet;
    @Inject
    @ConfigProperty(name = "tck.config.test.javaconfig.converter.urlvalue")
```

### CollectionContainsUrl
Set `values` may contain URL objects
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testURLSetInjection() throws MalformedURLException, URISyntaxException {
        Set<URL> values = converterBean.getMyUrlSet();
        Assert.assertEquals(values.size(), 2);
        Set<URL> expectedURLSet = new LinkedHashSet<>(Arrays.asList(
```

### CollectionContainsUrl
Set `expectedURLSet` may contain URL objects
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Set<URL> values = converterBean.getMyUrlSet();
        Assert.assertEquals(values.size(), 2);
        Set<URL> expectedURLSet = new LinkedHashSet<>(Arrays.asList(
                new URL("http://openliberty.io"),
                new URL("http://microprofile.io")));
```

### CollectionContainsUrl
Set `expectedSingleUrlSet` may contain URL objects
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java

        Assert.assertEquals(converterBean.getMySingleUrlSet().size(), 1);
        Set<URL> expectedSingleUrlSet = Collections.singleton(new URL("http://microprofile.io"));
        assertURLSetEquals(converterBean.getMySingleUrlSet(), expectedSingleUrlSet);
    }
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/broken/ConfigObserver.java`
#### Snippet
```java
    }

    private static final void onStartup(@Observes @Initialized(ApplicationScoped.class) final Object event,
            @ConfigProperty(name = "this.property.does.not.exist") final String nonExistentConfigurationPropertyValue) {
    }
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `ConfigProviderResolver` has no concrete subclass
in `api/src/main/java/org/eclipse/microprofile/config/spi/ConfigProviderResolver.java`
#### Snippet
```java
 */
@ServiceConsumer(value = ConfigProviderResolver.class, effective = "active")
public abstract class ConfigProviderResolver {
    /**
     * Construct a new instance.
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `private @Inject`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/configsources/DefaultConfigSourceOrdinalTest.java`
#### Snippet
```java
public class DefaultConfigSourceOrdinalTest extends Arquillian {

    private @Inject Config config;

    @Deployment
```

### MissortedModifiers
Missorted modifiers `private @Inject @ConfigProperty(name = "partial.pizza", defaultValue = "medium:chicken")`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/converters/convertToNull/ConvertedNullValueBrokenInjectionBean.java`
#### Snippet
```java
public class ConvertedNullValueBrokenInjectionBean {

    private @Inject @ConfigProperty(name = "partial.pizza", defaultValue = "medium:chicken") Pizza myPizza;

    public Pizza getPizza() {
```

### MissortedModifiers
Missorted modifiers `private @Inject`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/converters/convertToNull/ConvertedNullValueBrokenInjectionTest.java`
#### Snippet
```java
public class ConvertedNullValueBrokenInjectionTest extends Arquillian {
    private @Inject Config config;
    private @Inject ConvertedNullValueBrokenInjectionBean myBean;

    @Deployment
```

### MissortedModifiers
Missorted modifiers `private @Inject`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/converters/convertToNull/ConvertedNullValueBrokenInjectionTest.java`
#### Snippet
```java
 */
public class ConvertedNullValueBrokenInjectionTest extends Arquillian {
    private @Inject Config config;
    private @Inject ConvertedNullValueBrokenInjectionBean myBean;

```

### MissortedModifiers
Missorted modifiers `private @Inject`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/converters/convertToNull/ConvertedNullValueTest.java`
#### Snippet
```java
public class ConvertedNullValueTest extends Arquillian {
    private @Inject Config config;
    private @Inject MyBean myBean;

    @Deployment
```

### MissortedModifiers
Missorted modifiers `private @Inject @ConfigProperty(name = "partial.pizza", defaultValue = "medium:chicken")`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/converters/convertToNull/ConvertedNullValueTest.java`
#### Snippet
```java
    public static class MyBean {

        private @Inject @ConfigProperty(name = "partial.pizza", defaultValue = "medium:chicken") Optional<Pizza> myPizza;

        public Pizza getPizza() {
```

### MissortedModifiers
Missorted modifiers `private @Inject`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/converters/convertToNull/ConvertedNullValueTest.java`
#### Snippet
```java
 */
public class ConvertedNullValueTest extends Arquillian {
    private @Inject Config config;
    private @Inject MyBean myBean;

```

### MissortedModifiers
Missorted modifiers `private @Inject`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConfigProviderTest.java`
#### Snippet
```java
public class ConfigProviderTest extends Arquillian {

    private @Inject Config config;

    @Deployment
```

### MissortedModifiers
Missorted modifiers `private @Inject`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ImplicitConverterTest.java`
#### Snippet
```java
    }

    private @Inject Config config;
    private @Inject ParseConverterInjection parserConverterInjection;

```

### MissortedModifiers
Missorted modifiers `private @Inject`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ImplicitConverterTest.java`
#### Snippet
```java

    private @Inject Config config;
    private @Inject ParseConverterInjection parserConverterInjection;

    @Test
```

### MissortedModifiers
Missorted modifiers `private @Inject`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/CDIPropertyNameMatchingTest.java`
#### Snippet
```java
public class CDIPropertyNameMatchingTest extends Arquillian {

    private @Inject Config config;

    @Deployment
```

### MissortedModifiers
Missorted modifiers `private @Inject`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/CdiOptionalInjectionTest.java`
#### Snippet
```java
public class CdiOptionalInjectionTest extends Arquillian {

    private @Inject OptionalValuesBean optionalValuesBean;

    @Deployment
```

### MissortedModifiers
Missorted modifiers `private @Inject`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/CustomConfigSourceTest.java`
#### Snippet
```java
public class CustomConfigSourceTest extends Arquillian {

    private @Inject Config config;

    @Deployment
```

### MissortedModifiers
Missorted modifiers `private @Inject @ConfigProperty(name = "tck.config.test.javaconfig.converter.implicit.charSequenceParse.yearmonth")`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ParseConverterInjection.java`
#### Snippet
```java
@Dependent
public class ParseConverterInjection {
    private @Inject @ConfigProperty(name = "tck.config.test.javaconfig.converter.implicit.charSequenceParse.yearmonth") YearMonth yearMonth;

    public YearMonth getYearMonth() {
```

### MissortedModifiers
Missorted modifiers `private @Inject`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/CustomConverterTest.java`
#### Snippet
```java

public class CustomConverterTest extends Arquillian {
    private @Inject Config config;

    @Deployment
```

### MissortedModifiers
Missorted modifiers `private @Inject`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
public class ConverterTest extends Arquillian {

    private @Inject Config config;

    @Deployment
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Unnecessary boxing
in `tck/src/main/java/org/eclipse/microprofile/config/tck/CDIPlainInjectionTest.java`
#### Snippet
```java

        assertThat(bean.booleanObjProperty, is(true));
        assertThat(bean.byteObjProperty, is(equalTo(Byte.valueOf((byte) 127))));
        assertThat(bean.shortObjProperty, is(equalTo(Short.valueOf((short) 32767))));
        assertThat(bean.integerProperty, is(equalTo(5)));
```

### UnnecessaryBoxing
Unnecessary boxing
in `tck/src/main/java/org/eclipse/microprofile/config/tck/CDIPlainInjectionTest.java`
#### Snippet
```java
        assertThat(bean.booleanObjProperty, is(true));
        assertThat(bean.byteObjProperty, is(equalTo(Byte.valueOf((byte) 127))));
        assertThat(bean.shortObjProperty, is(equalTo(Short.valueOf((short) 32767))));
        assertThat(bean.integerProperty, is(equalTo(5)));
        assertThat(bean.longObjProperty, is(equalTo(10L)));
```

### UnnecessaryBoxing
Unnecessary boxing
in `tck/src/main/java/org/eclipse/microprofile/config/tck/CDIPlainInjectionTest.java`
#### Snippet
```java
        assertThat(bean.floatObjProperty, is(floatCloseTo(10.5f, 0.1f)));
        assertThat(bean.doubleObjProperty, is(closeTo(11.5, 0.1)));
        assertThat(bean.characterProperty, is(equalTo(Character.valueOf('c'))));

        assertThat(bean.doublePropertyWithDefaultValue, is(closeTo(3.1415, 0.1)));
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'myPizza'
in `tck/src/main/java/org/eclipse/microprofile/config/tck/converters/convertToNull/ConvertedNullValueTest.java`
#### Snippet
```java
    public static class MyBean {

        private @Inject @ConfigProperty(name = "partial.pizza", defaultValue = "medium:chicken") Optional<Pizza> myPizza;

        public Pizza getPizza() {
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for field 'optionalIntProperty'
in `tck/src/main/java/org/eclipse/microprofile/config/tck/OptionalValuesBean.java`
#### Snippet
```java
    @Inject
    @ConfigProperty(name = "my.optional.int.property")
    private OptionalInt optionalIntProperty;
    @Inject
    @ConfigProperty(name = "my.notexisting.property")
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'stringValue'
in `tck/src/main/java/org/eclipse/microprofile/config/tck/OptionalValuesBean.java`
#### Snippet
```java
    private Optional<String> notExistingStringProperty;

    private Optional<String> stringValue;

    @Inject
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'intProperty'
in `tck/src/main/java/org/eclipse/microprofile/config/tck/OptionalValuesBean.java`
#### Snippet
```java
    @Inject
    @ConfigProperty(name = "my.optional.int.property")
    private Optional<Integer> intProperty;

    @Inject
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'notexistingProperty'
in `tck/src/main/java/org/eclipse/microprofile/config/tck/OptionalValuesBean.java`
#### Snippet
```java
    @Inject
    @ConfigProperty(name = "my.notexisting.property")
    private Optional<Integer> notexistingProperty;

    @Inject
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for field 'optionalDoubleProperty'
in `tck/src/main/java/org/eclipse/microprofile/config/tck/OptionalValuesBean.java`
#### Snippet
```java
    @Inject
    @ConfigProperty(name = "my.optional.double.property")
    private OptionalDouble optionalDoubleProperty;
    @Inject
    @ConfigProperty(name = "my.notexisting.property")
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for field 'optionalNotExistingDoubleProperty'
in `tck/src/main/java/org/eclipse/microprofile/config/tck/OptionalValuesBean.java`
#### Snippet
```java
    @Inject
    @ConfigProperty(name = "my.notexisting.property")
    private OptionalDouble optionalNotExistingDoubleProperty;

    @Inject
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for field 'optionalNotExistingIntProperty'
in `tck/src/main/java/org/eclipse/microprofile/config/tck/OptionalValuesBean.java`
#### Snippet
```java
    @Inject
    @ConfigProperty(name = "my.notexisting.property")
    private OptionalInt optionalNotExistingIntProperty;

    @Inject
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'notExistingStringProperty'
in `tck/src/main/java/org/eclipse/microprofile/config/tck/OptionalValuesBean.java`
#### Snippet
```java
    @Inject
    @ConfigProperty(name = "my.notexisting.string.property")
    private Optional<String> notExistingStringProperty;

    private Optional<String> stringValue;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'stringValue'
in `tck/src/main/java/org/eclipse/microprofile/config/tck/OptionalValuesBean.java`
#### Snippet
```java

    @Inject
    public void setStringValue(@ConfigProperty(name = "my.optional.string.property") Optional<String> stringValue) {
        this.stringValue = stringValue;
    }
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'optionalNotExistingLongProperty'
in `tck/src/main/java/org/eclipse/microprofile/config/tck/OptionalValuesBean.java`
#### Snippet
```java
    @Inject
    @ConfigProperty(name = "my.notexisting.property")
    private OptionalLong optionalNotExistingLongProperty;

    @Inject
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'optionalLongProperty'
in `tck/src/main/java/org/eclipse/microprofile/config/tck/OptionalValuesBean.java`
#### Snippet
```java
    @Inject
    @ConfigProperty(name = "my.optional.long.property")
    private OptionalLong optionalLongProperty;
    @Inject
    @ConfigProperty(name = "my.notexisting.property")
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for field 'badExpansionDouble'
in `tck/src/main/java/org/eclipse/microprofile/config/tck/CDIPropertyExpressionsTest.java`
#### Snippet
```java
        @Inject
        @ConfigProperty(name = "bad.property.expression.prop")
        OptionalDouble badExpansionDouble;
        @Inject
        @ConfigProperty(name = "bad.property.expression.prop")
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'badExpansionLong'
in `tck/src/main/java/org/eclipse/microprofile/config/tck/CDIPropertyExpressionsTest.java`
#### Snippet
```java
        @Inject
        @ConfigProperty(name = "bad.property.expression.prop")
        OptionalLong badExpansionLong;
        @Inject
        @ConfigProperty(name = "bad.property.expression.prop")
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for field 'badExpansionInt'
in `tck/src/main/java/org/eclipse/microprofile/config/tck/CDIPropertyExpressionsTest.java`
#### Snippet
```java
        @Inject
        @ConfigProperty(name = "bad.property.expression.prop")
        OptionalInt badExpansionInt;
        @Inject
        @ConfigProperty(name = "bad.property.expression.prop")
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'badExpansion'
in `tck/src/main/java/org/eclipse/microprofile/config/tck/CDIPropertyExpressionsTest.java`
#### Snippet
```java
        @Inject
        @ConfigProperty(name = "bad.property.expression.prop")
        Optional<String> badExpansion;
        @Inject
        @ConfigProperty(name = "bad.property.expression.prop")
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'location'
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConfigPropertiesTest.java`
#### Snippet
```java
            return host;
        }
        public Optional<String> location;
    }

```

## RuleId[id=AssertBetweenInconvertibleTypes]
### AssertBetweenInconvertibleTypes
`assertEquals()` between objects of inconvertible types 'float\[\]' and 'Float\[\]'
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertNotNull(value);
        Assert.assertEquals(value.length, 2);
        Assert.assertEquals(value, new Float[]{12.34f, 99.99f});
        float[] single = config.getConverter(float[].class).get().convert("12.34");
        Assert.assertNotNull(single);
```

### AssertBetweenInconvertibleTypes
`assertEquals()` between objects of inconvertible types 'float\[\]' and 'Float\[\]'
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertNotNull(single);
        Assert.assertEquals(single.length, 1);
        Assert.assertEquals(single, new Float[]{12.34f});
    }

```

### AssertBetweenInconvertibleTypes
`assertEquals()` between objects of inconvertible types 'Integer\[\]' and 'int\[\]'
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    public void testintArrayInjection() {
        Assert.assertEquals(converterBean.getMyintArray().length, 2);
        Assert.assertEquals(converterBean.getMyIntegerArray(), new int[]{1234, 9999});
        Assert.assertEquals(converterBean.getMySingleintArray().length, 1);
        Assert.assertEquals(converterBean.getMySingleIntegerArray(), new int[]{1234});
```

### AssertBetweenInconvertibleTypes
`assertEquals()` between objects of inconvertible types 'Integer\[\]' and 'int\[\]'
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertEquals(converterBean.getMyIntegerArray(), new int[]{1234, 9999});
        Assert.assertEquals(converterBean.getMySingleintArray().length, 1);
        Assert.assertEquals(converterBean.getMySingleIntegerArray(), new int[]{1234});
    }

```

### AssertBetweenInconvertibleTypes
`assertEquals()` between objects of inconvertible types 'double\[\]' and 'Double\[\]'
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertNotNull(value);
        Assert.assertEquals(value.length, 2);
        Assert.assertEquals(value, new Double[]{12.34d, 99.9999d});
        double[] single = config.getConverter(double[].class).get().convert("12.34");
        Assert.assertNotNull(single);
```

### AssertBetweenInconvertibleTypes
`assertEquals()` between objects of inconvertible types 'double\[\]' and 'Double\[\]'
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertNotNull(single);
        Assert.assertEquals(single.length, 1);
        Assert.assertEquals(single, new Double[]{12.34d});
    }

```

### AssertBetweenInconvertibleTypes
`assertEquals()` between objects of inconvertible types 'int\[\]' and 'Integer\[\]'
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertNotNull(value);
        Assert.assertEquals(value.length, 2);
        Assert.assertEquals(value, new Integer[]{1234, 9999});
        int[] single = config.getConverter(int[].class).get().convert("1234");
        Assert.assertNotNull(single);
```

### AssertBetweenInconvertibleTypes
`assertEquals()` between objects of inconvertible types 'int\[\]' and 'Integer\[\]'
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertNotNull(single);
        Assert.assertEquals(single.length, 1);
        Assert.assertEquals(single, new Integer[]{1234});
    }

```

### AssertBetweenInconvertibleTypes
`assertEquals()` between objects of inconvertible types 'long\[\]' and 'Long\[\]'
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertNotNull(value);
        Assert.assertEquals(value.length, 2);
        Assert.assertEquals(value, new Long[]{1234567890L, 1999999999L});
        long[] single = config.getConverter(long[].class).get().convert("1234567890");
        Assert.assertNotNull(single);
```

### AssertBetweenInconvertibleTypes
`assertEquals()` between objects of inconvertible types 'long\[\]' and 'Long\[\]'
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertNotNull(single);
        Assert.assertEquals(single.length, 1);
        Assert.assertEquals(single, new Long[]{1234567890L});
    }

```

### AssertBetweenInconvertibleTypes
`assertEquals()` between objects of inconvertible types 'boolean\[\]' and 'Boolean\[\]'
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertNotNull(value);
        Assert.assertEquals(value.length, 3);
        Assert.assertEquals(value, new Boolean[]{true, false, true});
        boolean[] single = config.getConverter(boolean[].class).get().convert("true");
        Assert.assertNotNull(single);
```

### AssertBetweenInconvertibleTypes
`assertEquals()` between objects of inconvertible types 'boolean\[\]' and 'Boolean\[\]'
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertNotNull(single);
        Assert.assertEquals(single.length, 1);
        Assert.assertEquals(single, new Boolean[]{true});
    }

```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/config/inject/package-info.java`
#### Snippet
```java
 * @author <a href="mailto:emijiang@uk.ibm.com">Emily Jiang</a>
 */
@org.osgi.annotation.versioning.Version("2.0")
package org.eclipse.microprofile.config.inject;

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/config/spi/ConfigSourceProvider.java`
#### Snippet
```java
public interface ConfigSourceProvider {
    /**
     * Return the {@link ConfigSource} instances that are provided by this provider. The {@link java.lang.Iterable
     * Iterable} contains a fixed number of {@linkplain ConfigSource configuration sources}, determined at application
     * start time, and the config sources themselves may be static or dynamic. An empty {@link java.lang.Iterable
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/config/spi/ConfigSourceProvider.java`
#### Snippet
```java
     * Return the {@link ConfigSource} instances that are provided by this provider. The {@link java.lang.Iterable
     * Iterable} contains a fixed number of {@linkplain ConfigSource configuration sources}, determined at application
     * start time, and the config sources themselves may be static or dynamic. An empty {@link java.lang.Iterable
     * Iterable} may be returned if no sources are to be provided.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/config/spi/ConfigBuilder.java`
#### Snippet
```java
 * @author <a href="mailto:emijiang@uk.ibm.com">Emily Jiang</a>
 */
@org.osgi.annotation.versioning.ProviderType
public interface ConfigBuilder {
    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/config/spi/package-info.java`
#### Snippet
```java
 *
 */
@org.osgi.annotation.versioning.Version("3.0")
package org.eclipse.microprofile.config.spi;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.config.spi` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/config/spi/ConfigSource.java`
#### Snippet
```java
 *
 * <p>
 * Configuration sources may also be added by defining {@link org.eclipse.microprofile.config.spi.ConfigSourceProvider}
 * classes which are discoverable in this manner.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/config/Config.java`
#### Snippet
```java
     * @return The resolved property values as an {@code Optional} wrapping a list of the requested type
     *
     * @throws java.lang.IllegalArgumentException
     *             if the property cannot be converted to the specified type
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/config/Config.java`
#### Snippet
```java
     *            The type into which the resolved property values should get converted
     * @return the resolved property values as a list of instances of the requested type
     * @throws java.lang.IllegalArgumentException
     *             if the property values cannot be converted to the specified type
     * @throws java.util.NoSuchElementException
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/config/Config.java`
#### Snippet
```java
     * <p>
     * The returned sources will be sorted by descending ordinal value and name, which can be iterated in a thread-safe
     * manner. The {@link java.lang.Iterable Iterable} contains a fixed number of {@linkplain ConfigSource configuration
     * sources}, determined at application start time, and the config sources themselves may be static or dynamic.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.microprofile.config.spi` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/config/Config.java`
#### Snippet
```java
 * <p>
 * If one or more converters are registered for a class of a requested value then the registered
 * {@link org.eclipse.microprofile.config.spi.Converter} which has the highest {@code @jakarta.annotation.Priority} is
 * used to convert the string value retrieved from the config sources.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/config/Config.java`
#### Snippet
```java
 * @author <a href="mailto:gunnar@hibernate.org">Gunnar Morling</a>
 */
@org.osgi.annotation.versioning.ProviderType
public interface Config {
    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/config/spi/Converter.java`
#### Snippet
```java
 * <li>{@code double}, {@code Double}, and {@code OptionalDouble} accepting (at minimum) all values accepted by the
 * {@link Double#parseDouble(String)} method</li>
 * <li>{@code java.lang.Class} based on the result of {@link java.lang.Class#forName}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `api/src/main/java/org/eclipse/microprofile/config/package-info.java`
#### Snippet
```java
 * @author <a href="mailto:struberg@apache.org">Mark Struberg</a>
 */
@org.osgi.annotation.versioning.Version("3.0.0")
package org.eclipse.microprofile.config;

```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `api/src/main/java/org/eclipse/microprofile/config/spi/ConfigProviderResolver.java`
#### Snippet
```java
 * This class is not intended to be used by end-users.
 * <p>
 * The implementation of this class should register itself via the {@link java.util.ServiceLoader} mechanism.
 *
 * @author <a href="mailto:struberg@apache.org">Mark Struberg</a>
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `tck/src/main/java/org/eclipse/microprofile/config/tck/util/AdditionalAssertions.java`
#### Snippet
```java
                return urlEquals(expectedValue.get(i), value.get(i));
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
            return false;
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `tck/src/main/java/org/eclipse/microprofile/config/tck/util/AdditionalMatchers.java`
#### Snippet
```java
            public boolean matches(Object item) {
                if (item instanceof Float) {
                    return (doubleMatcher = closeTo(value, range)).matches(((Float) item).doubleValue());
                } else {
                    return (doubleMatcher = closeTo(value, range)).matches(item);
```

### NestedAssignment
Result of assignment expression used
in `tck/src/main/java/org/eclipse/microprofile/config/tck/util/AdditionalMatchers.java`
#### Snippet
```java
                    return (doubleMatcher = closeTo(value, range)).matches(((Float) item).doubleValue());
                } else {
                    return (doubleMatcher = closeTo(value, range)).matches(item);
                }
            }
```

## RuleId[id=ExtendsAnnotation]
### ExtendsAnnotation
Class 'Literal' implements annotation interface `ConfigProperties`
in `api/src/main/java/org/eclipse/microprofile/config/inject/ConfigProperties.java`
#### Snippet
```java
     * Support inline instantiation of the {@link ConfigProperties} qualifier.
     */
    final class Literal extends AnnotationLiteral<ConfigProperties> implements ConfigProperties {
        public static final Literal NO_PREFIX = of(UNCONFIGURED_PREFIX);

```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `tck/src/main/java/org/eclipse/microprofile/config/tck/broken/ConfigObserver.java`
#### Snippet
```java
    }

    private static final void onStartup(@Observes @Initialized(ApplicationScoped.class) final Object event,
            @ConfigProperty(name = "this.property.does.not.exist") final String nonExistentConfigurationPropertyValue) {
    }
```

### EmptyMethod
The method is empty
in `tck/src/main/java/org/eclipse/microprofile/config/tck/broken/ConfigPropertiesMissingPropertyInjectionTest.java`
#### Snippet
```java

    @Test
    public void test() {
    }
}
```

### EmptyMethod
The method is empty
in `tck/src/main/java/org/eclipse/microprofile/config/tck/broken/MissingConverterOnInstanceInjectionTest.java`
#### Snippet
```java

    @Test
    public void test() {
    }

```

### EmptyMethod
The method is empty
in `tck/src/main/java/org/eclipse/microprofile/config/tck/broken/MissingValueOnInstanceInjectionTest.java`
#### Snippet
```java

    @Test
    public void test() {
    }

```

### EmptyMethod
The method is empty
in `tck/src/main/java/org/eclipse/microprofile/config/tck/broken/MissingValueOnObserverMethodInjectionTest.java`
#### Snippet
```java

    @Test
    public void test() {
    }

```

### EmptyMethod
The method is empty
in `tck/src/main/java/org/eclipse/microprofile/config/tck/broken/WrongConverterOnInstanceInjectionTest.java`
#### Snippet
```java

    @Test
    public void test() {
    }

```

### EmptyMethod
The method is empty
in `tck/src/main/java/org/eclipse/microprofile/config/tck/converters/convertToNull/ConvertedNullValueBrokenInjectionTest.java`
#### Snippet
```java

    @Test
    public void test() {
    }

```

### EmptyMethod
The method is empty
in `tck/src/main/java/org/eclipse/microprofile/config/tck/emptyvalue/EmptyValuesTest.java`
#### Snippet
```java

    @Test
    public void test() {
    }
}
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tck/src/main/java/org/eclipse/microprofile/config/tck/util/AdditionalMatchers.java`
#### Snippet
```java
        return new BaseMatcher<Float>() {

            private Matcher<Double> doubleMatcher = null;

            @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `api/src/main/java/org/eclipse/microprofile/config/spi/ConfigProviderResolver.java`
#### Snippet
```java
    }

    private static volatile ConfigProviderResolver instance = null;

    /**
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/configsources/SampleYamlConfigSource.java`
#### Snippet
```java
    @Override
    public String getName() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/converters/PizzaConverter.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `tck/src/main/java/org/eclipse/microprofile/config/tck/converters/convertToNull/ConvertedNullValueTest.java`
#### Snippet
```java

        public Pizza getPizza() {
            return myPizza.isPresent() ? myPizza.get() : null;
        }
    }
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-25-06-39-45.526.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `war` is redundant
in `tck/src/main/java/org/eclipse/microprofile/config/tck/configsources/DefaultConfigSourceOrdinalTest.java`
#### Snippet
```java
                .as(JavaArchive.class);

        WebArchive war = ShrinkWrap
                .create(WebArchive.class, "DefaultConfigSourceOrdinalTest.war")
                .addAsLibrary(testJar);
```

### UnnecessaryLocalVariable
Local variable `war` is redundant
in `tck/src/main/java/org/eclipse/microprofile/config/tck/broken/MissingValueOnObserverMethodInjectionTest.java`
#### Snippet
```java
                .as(JavaArchive.class);

        WebArchive war = ShrinkWrap
                .create(WebArchive.class, "missingValueOnObserverMethodInjectionTest.war")
                .addAsLibrary(testJar);
```

### UnnecessaryLocalVariable
Local variable `war` is redundant
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ClassConverterTest.java`
#### Snippet
```java
        addFile(testJar, "META-INF/microprofile-config.properties");

        WebArchive war = ShrinkWrap
                .create(WebArchive.class, archiveName + ".war")
                .addAsLibrary(testJar);
```

### UnnecessaryLocalVariable
Local variable `war` is redundant
in `tck/src/main/java/org/eclipse/microprofile/config/tck/AutoDiscoveredConfigSourceTest.java`
#### Snippet
```java
                .as(JavaArchive.class);

        WebArchive war = ShrinkWrap
                .create(WebArchive.class, "customConfigSourceTest.war")
                .addAsLibrary(testJar);
```

### UnnecessaryLocalVariable
Local variable `war` is redundant
in `tck/src/main/java/org/eclipse/microprofile/config/tck/profile/DevConfigProfileTest.java`
#### Snippet
```java
    @Deployment
    public static WebArchive deployment() {
        WebArchive war = ShrinkWrap
                .create(WebArchive.class, "DevConfigProfileTest.war")
                .addClasses(DevConfigProfileTest.class, ProfilePropertyBean.class)
```

### UnnecessaryLocalVariable
Local variable `war` is redundant
in `tck/src/main/java/org/eclipse/microprofile/config/tck/broken/MissingValueOnInstanceInjectionTest.java`
#### Snippet
```java
                .as(JavaArchive.class);

        WebArchive war = ShrinkWrap
                .create(WebArchive.class, "missingValueOnInstanceInjectionTest.war")
                .addAsLibrary(testJar);
```

### UnnecessaryLocalVariable
Local variable `war` is redundant
in `tck/src/main/java/org/eclipse/microprofile/config/tck/profile/TestConfigProfileTest.java`
#### Snippet
```java
    @Deployment
    public static WebArchive deployment() {
        WebArchive war = ShrinkWrap
                .create(WebArchive.class, "TestConfigProfileTest.war")
                .addClasses(TestConfigProfileTest.class, ProfilePropertyBean.class)
```

### UnnecessaryLocalVariable
Local variable `war` is redundant
in `tck/src/main/java/org/eclipse/microprofile/config/tck/profile/ProdProfileTest.java`
#### Snippet
```java
    @Deployment
    public static WebArchive deployment() {
        WebArchive war = ShrinkWrap
                .create(WebArchive.class, "ProdProfileTest.war")
                .addClasses(ProdProfileTest.class, ProfilePropertyBean.class)
```

### UnnecessaryLocalVariable
Local variable `war` is redundant
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ImplicitConverterTest.java`
#### Snippet
```java
        addFile(testJar, "META-INF/microprofile-config.properties");

        WebArchive war = ShrinkWrap
                .create(WebArchive.class, "implicitConverterTest.war")
                .addAsLibrary(testJar);
```

### UnnecessaryLocalVariable
Local variable `war` is redundant
in `tck/src/main/java/org/eclipse/microprofile/config/tck/CDIPropertyNameMatchingTest.java`
#### Snippet
```java
                .as(JavaArchive.class);

        WebArchive war = ShrinkWrap
                .create(WebArchive.class, "CDIPropertyNameMatchingTest.war")
                .addAsLibrary(testJar);
```

### UnnecessaryLocalVariable
Local variable `war` is redundant
in `tck/src/main/java/org/eclipse/microprofile/config/tck/CdiOptionalInjectionTest.java`
#### Snippet
```java
                .as(JavaArchive.class);

        WebArchive war = ShrinkWrap
                .create(WebArchive.class, "cdiOptionalInjectionTest.war")
                .addAsLibrary(testJar);
```

### UnnecessaryLocalVariable
Local variable `war` is redundant
in `tck/src/main/java/org/eclipse/microprofile/config/tck/CustomConfigSourceTest.java`
#### Snippet
```java
        addFile(testJar, "META-INF/microprofile-config.properties");

        WebArchive war = ShrinkWrap
                .create(WebArchive.class, "customConfigSourceTest.war")
                .addAsLibrary(testJar);
```

### UnnecessaryLocalVariable
Local variable `war` is redundant
in `tck/src/main/java/org/eclipse/microprofile/config/tck/profile/TestCustomConfigProfile.java`
#### Snippet
```java
    @Deployment
    public static WebArchive deployment() {
        WebArchive war = ShrinkWrap
                .create(WebArchive.class, "TestConfigProfileTest.war")
                .addClasses(TestCustomConfigProfile.class, ProfilePropertyBean.class,
```

### UnnecessaryLocalVariable
Local variable `war` is redundant
in `tck/src/main/java/org/eclipse/microprofile/config/tck/broken/WrongConverterOnInstanceInjectionTest.java`
#### Snippet
```java
                .as(JavaArchive.class);

        WebArchive war = ShrinkWrap
                .create(WebArchive.class, "wrongConverterOnInstanceInjectionTest.war")
                .addAsLibrary(testJar);
```

### UnnecessaryLocalVariable
Local variable `war` is redundant
in `tck/src/main/java/org/eclipse/microprofile/config/tck/broken/MissingConverterOnInstanceInjectionTest.java`
#### Snippet
```java
                .as(JavaArchive.class);

        WebArchive war = ShrinkWrap
                .create(WebArchive.class, "missingConverterOnInstanceInjectionTest.war")
                .addAsLibrary(testJar);
```

### UnnecessaryLocalVariable
Local variable `war` is redundant
in `tck/src/main/java/org/eclipse/microprofile/config/tck/profile/ConfigPropertyFileProfileTest.java`
#### Snippet
```java
    public static WebArchive deployment() {

        WebArchive war = ShrinkWrap
                .create(WebArchive.class, "ConfigPropertyFileProfileTest.war")
                .addClasses(ConfigPropertyFileProfileTest.class, ProfilePropertyBean.class)
```

### UnnecessaryLocalVariable
Local variable `war` is redundant
in `tck/src/main/java/org/eclipse/microprofile/config/tck/profile/InvalidConfigProfileTest.java`
#### Snippet
```java
    public static WebArchive deployment() {

        WebArchive war = ShrinkWrap
                .create(WebArchive.class, "InvalidConfigProfileTest.war")
                .addClasses(InvalidConfigProfileTest.class, ProfilePropertyBean.class)
```

### UnnecessaryLocalVariable
Local variable `war` is redundant
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
                .as(JavaArchive.class);
        addFile(testJar, "META-INF/microprofile-config.properties");
        WebArchive war = ShrinkWrap
                .create(WebArchive.class, "arrayConverterTest.war")
                .addAsLibrary(testJar);
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `api/src/main/java/org/eclipse/microprofile/config/spi/ConfigProviderResolver.java`
#### Snippet
```java
    public static ConfigProviderResolver instance() {
        if (instance == null) {
            synchronized (ConfigProviderResolver.class) {
                if (instance != null) {
                    return instance;
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `yamlFiles` initializer `null` is redundant
in `tck/src/main/java/org/eclipse/microprofile/config/tck/configsources/CustomConfigSourceProvider.java`
#### Snippet
```java
        List<ConfigSource> detectedConfigSources = new ArrayList<>();

        Enumeration<URL> yamlFiles = null;
        try {
            yamlFiles = forClassLoader.getResources("sampleconfig.yaml");
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ClassConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetClassConverter() {
        Class<?> testClass = config.getConverter(Class.class).get()
                .convert("org.eclipse.microprofile.config.tck.ClassConverterTest");
        assertEquals(testClass, ClassConverterTest.class);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ClassConverterTest.java`
#### Snippet
```java
                .convert("org.eclipse.microprofile.config.tck.ClassConverterTest");
        assertEquals(testClass, ClassConverterTest.class);
        Class<?>[] testClasses = config.getConverter(Class[].class).get()
                .convert("org.eclipse.microprofile.config.tck.ClassConverterTest,java.lang.String");
        assertEquals(testClasses.length, 2);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ImplicitConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetImplicitConverterSquenceValueOfBeforeParseConverter() {
        ConvTestSequenceValueOfBeforeParse value = config.getConverter(ConvTestSequenceValueOfBeforeParse.class).get()
                .convert("valueOfBeforeParse");
        Assert.assertNotNull(value);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ImplicitConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetImplicitConverterCharSequenceParseJavaTimeConverter() {
        YearMonth value = config.getConverter(YearMonth.class).get().convert("2017-12");
        Assert.assertNotNull(value);
        Assert.assertEquals(value, YearMonth.parse("2017-12"));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ImplicitConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetImplicitConverterStringOfConverter() {
        ConvTestTypeWStringOf value = config.getConverter(ConvTestTypeWStringOf.class).get().convert("stringOf");
        Assert.assertNotNull(value);
        Assert.assertEquals(value.getVal(), "stringOf");
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ImplicitConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetImplicitConverterStringValueOfConverter() {
        ConvTestTypeWStringValueOf value = config.getConverter(ConvTestTypeWStringValueOf.class).get()
                .convert("stringValueOf");
        Assert.assertNotNull(value);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ImplicitConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetImplicitConverterStringCtConverter() {
        ConvTestTypeWStringCt value = config.getConverter(ConvTestTypeWStringCt.class).get().convert("stringCt");
        Assert.assertNotNull(value);
        Assert.assertEquals(value.getVal(), "stringCt");
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ImplicitConverterTest.java`
#### Snippet
```java
    public void testGetImplicitConverterSquenceParseBeforeConstructorConverter() {
        ConvTestSequenceParseBeforeConstructor value =
                config.getConverter(ConvTestSequenceParseBeforeConstructor.class).get()
                        .convert("parseBeforeConstructor");
        Assert.assertNotNull(value);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ImplicitConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetImplicitConverterSquenceOfBeforeValueOfConverter() {
        ConvTestSequenceOfBeforeValueOf value = config.getConverter(ConvTestSequenceOfBeforeValueOf.class).get()
                .convert("ofBeforeValueOf");
        Assert.assertNotNull(value);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ImplicitConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetImplicitConverterCharSequenceParseConverter() {
        ConvTestTypeWCharSequenceParse value = config.getConverter(ConvTestTypeWCharSequenceParse.class).get()
                .convert("charSequenceParse");
        Assert.assertNotNull(value);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ImplicitConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetImplicitConverterEnumValueOfConverter() {
        SomeEnumToConvert value = config.getConverter(SomeEnumToConvert.class).get().convert("BAZ");
        Assert.assertNotNull(value);
        Assert.assertEquals(value, SomeEnumToConvert.BAZ);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/CustomConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetDoubleConverter() {
        Double value = config.getConverter(Double.class).get().convert("1.0");
        Assert.assertEquals(value, new Double(999.9));
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/CustomConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetLongPrimitiveConverter() {
        long value = config.getConverter(long.class).get().convert("1");
        Assert.assertEquals(value, 999);
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/CustomConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetCharacterConverter() {
        Character value = config.getConverter(Character.class).get().convert("c");
        Assert.assertEquals(value, Character.valueOf('r'));
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/CustomConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetIntegerConverter() {
        Integer value = config.getConverter(Integer.class).get().convert("1");
        Assert.assertEquals(value, Integer.valueOf(999));
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/CustomConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetDoublePrimitiveConverter() {
        double value = config.getConverter(double.class).get().convert("1.0");
        Assert.assertEquals(value, 999.9);
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/CustomConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetCharPrimitiveConverter() {
        char value = config.getConverter(char.class).get().convert("c");
        Assert.assertEquals(value, 'r');
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/CustomConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetLongConverter() {
        Long value = config.getConverter(Long.class).get().convert("1");
        Assert.assertEquals(value, Long.valueOf(999));
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/CustomConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetBooleanPrimitiveConverter() {
        boolean value = config.getConverter(boolean.class).get().convert("false");
        Assert.assertTrue(value);
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/CustomConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetBooleanConverter() {
        Boolean value = config.getConverter(Boolean.class).get().convert("false");
        Assert.assertEquals(value, Boolean.TRUE);
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/CustomConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetIntPrimitiveConverter() {
        int value = config.getConverter(int.class).get().convert("1");
        Assert.assertEquals(value, 999);
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/emptyvalue/EmptyValuesTestProgrammaticLookup.java`
#### Snippet
```java
    @Test
    public void testBackslashCommaStringGetOptionalValue() {
        Assert.assertEquals(config.getOptionalValue("backslash.comma.string", String.class).get(), "\\,");
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/emptyvalue/EmptyValuesTestProgrammaticLookup.java`
#### Snippet
```java
    @Test
    public void testCommaStringGetOptionalValue() {
        Assert.assertEquals(config.getOptionalValue("comma.string", String.class).get(), ",");
        assertConfigurationNotPresentForOptionalMultiple("comma.string");
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/emptyvalue/EmptyValuesTestProgrammaticLookup.java`
#### Snippet
```java
    @Test
    public void testBackslashCommaStringGetOptionalValueAsArrayOrList() {
        Assert.assertEquals(config.getOptionalValue("backslash.comma.string", String[].class).get(), new String[]{","});
        Assert.assertEquals(config.getOptionalValues("backslash.comma.string", String.class).get(), Arrays.asList(","));
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/emptyvalue/EmptyValuesTestProgrammaticLookup.java`
#### Snippet
```java
    public void testBackslashCommaStringGetOptionalValueAsArrayOrList() {
        Assert.assertEquals(config.getOptionalValue("backslash.comma.string", String[].class).get(), new String[]{","});
        Assert.assertEquals(config.getOptionalValues("backslash.comma.string", String.class).get(), Arrays.asList(","));
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/emptyvalue/EmptyValuesTestProgrammaticLookup.java`
#### Snippet
```java
    @Test
    public void testFooCommaStringGetOptionalValues() {
        Assert.assertEquals(config.getOptionalValue("foo.comma.string", String.class).get(), "foo,");
        Assert.assertEquals(config.getOptionalValue("foo.comma.string", String[].class).get(), new String[]{"foo"});
        Assert.assertEquals(config.getOptionalValues("foo.comma.string", String.class).get(), Arrays.asList("foo"));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/emptyvalue/EmptyValuesTestProgrammaticLookup.java`
#### Snippet
```java
    public void testFooCommaStringGetOptionalValues() {
        Assert.assertEquals(config.getOptionalValue("foo.comma.string", String.class).get(), "foo,");
        Assert.assertEquals(config.getOptionalValue("foo.comma.string", String[].class).get(), new String[]{"foo"});
        Assert.assertEquals(config.getOptionalValues("foo.comma.string", String.class).get(), Arrays.asList("foo"));
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/emptyvalue/EmptyValuesTestProgrammaticLookup.java`
#### Snippet
```java
        Assert.assertEquals(config.getOptionalValue("foo.comma.string", String.class).get(), "foo,");
        Assert.assertEquals(config.getOptionalValue("foo.comma.string", String[].class).get(), new String[]{"foo"});
        Assert.assertEquals(config.getOptionalValues("foo.comma.string", String.class).get(), Arrays.asList("foo"));
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/emptyvalue/EmptyValuesTestProgrammaticLookup.java`
#### Snippet
```java
    @Test
    public void testSpaceStringGetOptionalValue() {
        Assert.assertEquals(config.getOptionalValue("space.string", String.class).get(), " ");
        Assert.assertEquals(config.getOptionalValue("space.string", String[].class).get(), new String[]{" "});
        Assert.assertEquals(config.getOptionalValues("space.string", String.class).get(), Arrays.asList(" "));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/emptyvalue/EmptyValuesTestProgrammaticLookup.java`
#### Snippet
```java
    public void testSpaceStringGetOptionalValue() {
        Assert.assertEquals(config.getOptionalValue("space.string", String.class).get(), " ");
        Assert.assertEquals(config.getOptionalValue("space.string", String[].class).get(), new String[]{" "});
        Assert.assertEquals(config.getOptionalValues("space.string", String.class).get(), Arrays.asList(" "));
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/emptyvalue/EmptyValuesTestProgrammaticLookup.java`
#### Snippet
```java
        Assert.assertEquals(config.getOptionalValue("space.string", String.class).get(), " ");
        Assert.assertEquals(config.getOptionalValue("space.string", String[].class).get(), new String[]{" "});
        Assert.assertEquals(config.getOptionalValues("space.string", String.class).get(), Arrays.asList(" "));
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/emptyvalue/EmptyValuesTestProgrammaticLookup.java`
#### Snippet
```java
    @Test
    public void testDoubleCommaStringGetOptionalValues() {
        Assert.assertEquals(config.getOptionalValue("double.comma.string", String.class).get(), ",,");
        assertConfigurationNotPresentForOptionalMultiple("double.comma.string");
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/emptyvalue/EmptyValuesTestProgrammaticLookup.java`
#### Snippet
```java
    @Test
    public void testFooBarStringGetOptionalValues() {
        Assert.assertEquals(config.getOptionalValue("foo.bar.string", String.class).get(), "foo,bar");
        Assert.assertEquals(config.getOptionalValue("foo.bar.string", String[].class).get(),
                new String[]{"foo", "bar"});
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/emptyvalue/EmptyValuesTestProgrammaticLookup.java`
#### Snippet
```java
    public void testFooBarStringGetOptionalValues() {
        Assert.assertEquals(config.getOptionalValue("foo.bar.string", String.class).get(), "foo,bar");
        Assert.assertEquals(config.getOptionalValue("foo.bar.string", String[].class).get(),
                new String[]{"foo", "bar"});
        Assert.assertEquals(config.getOptionalValues("foo.bar.string", String.class).get(),
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/emptyvalue/EmptyValuesTestProgrammaticLookup.java`
#### Snippet
```java
        Assert.assertEquals(config.getOptionalValue("foo.bar.string", String[].class).get(),
                new String[]{"foo", "bar"});
        Assert.assertEquals(config.getOptionalValues("foo.bar.string", String.class).get(),
                Arrays.asList("foo", "bar"));

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/emptyvalue/EmptyValuesTestProgrammaticLookup.java`
#### Snippet
```java
    @Test
    public void testCommaBarStringGetOptionalValues() {
        Assert.assertEquals(config.getOptionalValue("comma.bar.string", String.class).get(), ",bar");
        Assert.assertEquals(config.getOptionalValue("comma.bar.string", String[].class).get(), new String[]{"bar"});
        Assert.assertEquals(config.getOptionalValues("comma.bar.string", String.class).get(), Arrays.asList("bar"));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/emptyvalue/EmptyValuesTestProgrammaticLookup.java`
#### Snippet
```java
    public void testCommaBarStringGetOptionalValues() {
        Assert.assertEquals(config.getOptionalValue("comma.bar.string", String.class).get(), ",bar");
        Assert.assertEquals(config.getOptionalValue("comma.bar.string", String[].class).get(), new String[]{"bar"});
        Assert.assertEquals(config.getOptionalValues("comma.bar.string", String.class).get(), Arrays.asList("bar"));
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/emptyvalue/EmptyValuesTestProgrammaticLookup.java`
#### Snippet
```java
        Assert.assertEquals(config.getOptionalValue("comma.bar.string", String.class).get(), ",bar");
        Assert.assertEquals(config.getOptionalValue("comma.bar.string", String[].class).get(), new String[]{"bar"});
        Assert.assertEquals(config.getOptionalValues("comma.bar.string", String.class).get(), Arrays.asList("bar"));
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetCustomConverter() {
        Assert.assertEquals(config.getConverter(Duck.class).get().convert("Hannelore").getName(), "Hannelore");
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetshortConverter() {
        short value = config.getConverter(short.class).get().convert("1234");
        Assert.assertEquals(value, (short) 1234);
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetOffsetDateTimeConverter() {
        OffsetDateTime value = config.getConverter(OffsetDateTime.class).get().convert("2007-12-03T10:15:30+01:00");
        Assert.assertEquals(value, OffsetDateTime.parse("2007-12-03T10:15:30+01:00"));
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetZoneOffsetConverter() {
        ZoneOffset value = config.getConverter(ZoneOffset.class).get().convert("+02:00");
        ZoneOffset parsed = ZoneOffset.of("+02:00");
        Assert.assertEquals(value, parsed);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetIntegerConverter_Broken() {
        config.getConverter(Integer.class).get().convert("xxx");
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
                .withConverter(Donald.class, 100, (s) -> Donald.iLikeDonald(s))
                .build();
        Donald donald = newConfig.getConverter(Donald.class).get().convert("Duck");
        Assert.assertNotNull(donald);
        Assert.assertEquals(donald.getName(), "Duck");
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetLocalDateTimeConverter() {
        LocalDateTime value = config.getConverter(LocalDateTime.class).get().convert("2017-12-24T10:25:30");
        Assert.assertEquals(value, LocalDateTime.parse("2017-12-24T10:25:30"));
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetURLConverterBroken() throws Exception {
        config.getConverter(URL.class).get().convert("tt:--location");
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetURIConverter() {
        URI uri = config.getConverter(URI.class).get().convert("http://microprofile.io");
        Assert.assertEquals(uri, URI.create("http://microprofile.io"));
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetIntegerConverter() {
        Integer value = config.getConverter(Integer.class).get().convert("1234");
        Assert.assertEquals(value, Integer.valueOf(1234));
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    public void testGetConverterSerialization() {
        Converter<Duck> original = config.getConverter(Duck.class).get();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (ObjectOutputStream out = new ObjectOutputStream(byteArrayOutputStream)) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetInstantConverter() {
        Instant value = config.getConverter(Instant.class).get().convert("2015-06-02T21:34:33.616Z");
        Assert.assertEquals(value, Instant.parse("2015-06-02T21:34:33.616Z"));
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
                .build();

        Donald donald = config1.getConverter(Donald.class).get().convert("Duck");
        Assert.assertNotNull(donald);
        Assert.assertEquals(donald.getName(), "DUCK",
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
        Assert.assertEquals(donald.getName(), "DUCK",
                "The converter with the highest priority (using upper case) must be used.");
        donald = config2.getConverter(Donald.class).get().convert("Duck");
        Assert.assertNotNull(donald);
        Assert.assertEquals(donald.getName(), "DUCK",
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetLocalDateTimeConverter_Broken() {
        config.getConverter(LocalDateTime.class).get().convert("alfasdf");
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetcharConverter() {
        char value = config.getConverter(char.class).get().convert("c");
        Assert.assertEquals(value, 'c');
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetCharConverter() {
        Character value = config.getConverter(Character.class).get().convert("c");
        Assert.assertEquals(value, Character.valueOf('c'));
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetDoubleConverter_Broken() {
        config.getConverter(Double.class).get().convert("alfasdf");
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetCharConverter_Broken() {
        config.getConverter(Character.class).get().convert("xxx");
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetOffsetTimeConverter_Broken() {
        config.getConverter(OffsetTime.class).get().convert("alfasdf");
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetLocalTimeConverter() {
        LocalTime value = config.getConverter(LocalTime.class).get().convert("10:37");
        Assert.assertEquals(value, LocalTime.parse("10:37"));
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetdoubleConverter() {
        double value = config.getConverter(double.class).get().convert("12.34");
        Assert.assertEquals(value, 12.34d);
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetBooleanConverter() {
        Converter<Boolean> converter = config.getConverter(Boolean.class).get();
        Converter<Boolean> primitiveConverter = config.getConverter(boolean.class).get();

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    public void testGetBooleanConverter() {
        Converter<Boolean> converter = config.getConverter(Boolean.class).get();
        Converter<Boolean> primitiveConverter = config.getConverter(boolean.class).get();

        Assert.assertTrue(converter.convert("true"));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetfloatConverter() {
        float value = config.getConverter(float.class).get().convert("12.34");
        Assert.assertEquals(value, 12.34f);
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetbyteConverter() {
        byte value = config.getConverter(byte.class).get().convert("123");
        Assert.assertEquals(value, (byte) 123);
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetlongConverter() {
        long primitiveValue = config.getConverter(long.class).get().convert("1234567890");
        Assert.assertEquals(primitiveValue, 1234567890L);
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetInstantConverter_Broken() {
        config.getConverter(Instant.class).get().convert("alfasdf");
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetDurationCoverter() {
        Duration value = config.getConverter(Duration.class).get().convert("PT15M");
        Assert.assertEquals(value, Duration.parse("PT15M"));
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetByteConverter() {
        Byte value = config.getConverter(Byte.class).get().convert("123");
        Assert.assertEquals(value, Byte.valueOf((byte) 123));
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetDurationConverter_Broken() {
        config.getConverter(Duration.class).get().convert("alfasdf");
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetURLConverter() throws MalformedURLException, URISyntaxException {
        URL url = config.getConverter(URL.class).get().convert("http://microprofile.io");
        Assert.assertTrue(urlEquals(url, new URL("http://microprofile.io")));
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetZoneOffsetConverter_Broken() {
        config.getConverter(ZoneOffset.class).get().convert("alfasdf");
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetByteConverter_Broken() {
        config.getConverter(Byte.class).get().convert("xxx");
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetOffsetDateTimeConverter_Broken() {
        config.getConverter(OffsetDateTime.class).get().convert("alfasdf");
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
                .build();

        Duck duck = config1.getConverter(Duck.class).get().convert("Hannelore");
        Assert.assertNotNull(duck);
        Assert.assertEquals(duck.getName(), "HANNELORE",
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
                "The converter with the highest priority (UpperCaseDuckConverter) must be used.");

        duck = config2.getConverter(Duck.class).get().convert("Hannelore");
        Assert.assertNotNull(duck);
        // the UpperCaseDuckConverter has highest priority
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetOffsetTimeConverter() {
        OffsetTime value = config.getConverter(OffsetTime.class).get().convert("13:45:30.123456789+02:00");
        OffsetTime parsed = OffsetTime.parse("13:45:30.123456789+02:00");
        Assert.assertEquals(value, parsed);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetShortConverter() {
        Short value = config.getConverter(Short.class).get().convert("1234");
        Assert.assertEquals(value, Short.valueOf((short) 1234));
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetURIConverterBroken() throws Exception {
        config.getConverter(URI.class).get().convert("space is an illegal uri character");
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetLocalDateConverter() {
        LocalDate value = config.getConverter(LocalDate.class).get().convert("2017-12-24");
        Assert.assertEquals(value, LocalDate.parse("2017-12-24"));
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetLongConverter_Broken() {
        config.getConverter(Long.class).get().convert("alfasdf");
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetDoubleConverter() {
        Double value = config.getConverter(Double.class).get().convert("12.34");
        Assert.assertEquals(value, new Double(12.34d));
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetIntConverter() {
        int value = config.getConverter(int.class).get().convert("1234");
        Assert.assertEquals(value, 1234);
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetLocalTimeConverter_Broken() {
        config.getConverter(LocalTime.class).get().convert("alfasdf");
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetLocalDateConverter_Broken() {
        config.getConverter(LocalDate.class).get().convert("alfasdf");
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetFloatConverter() {
        Float value = config.getConverter(Float.class).get().convert("12.34");
        Assert.assertEquals(value, new Float(12.34f));
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetShortConverter_Broken() {
        config.getConverter(Short.class).get().convert("xxx");
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetLongConverter() {
        Long value = config.getConverter(Long.class).get().convert("1234567890");
        Assert.assertEquals(value, Long.valueOf(1234567890));
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ConverterTest.java`
#### Snippet
```java
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetFloatConverter_Broken() {
        config.getConverter(Float.class).get().convert("alfasdf");
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetCustomTypeArrayConverter() {
        Pizza[] value = config.getConverter(Pizza[].class).get()
                .convert("large:cheese\\,mushroom,medium:chicken,small:pepperoni");
        Assert.assertNotNull(value);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
                new Pizza("chicken", "medium"),
                new Pizza("pepperoni", "small")});
        Pizza[] single = config.getConverter(Pizza[].class).get().convert("large:cheese\\,mushroom");
        Assert.assertNotNull(single);
        Assert.assertEquals(single.length, 1);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetDoubleArrayConverter() {
        Double[] value = config.getConverter(Double[].class).get().convert("12.34,99.9999");
        Assert.assertNotNull(value);
        Assert.assertEquals(value.length, 2);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertEquals(value.length, 2);
        Assert.assertEquals(value, new Double[]{12.34d, 99.9999d});
        Double[] single = config.getConverter(Double[].class).get().convert("12.34");
        Assert.assertNotNull(single);
        Assert.assertEquals(single.length, 1);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetLongArrayCoverter() {
        Long[] value = config.getConverter(Long[].class).get().convert("1234567890,1999999999");
        Assert.assertNotNull(value);
        Assert.assertEquals(value.length, 2);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertEquals(value.length, 2);
        Assert.assertEquals(value, new Long[]{1234567890L, 1999999999L});
        Long[] single = config.getConverter(Long[].class).get().convert("1234567890");
        Assert.assertNotNull(single);
        Assert.assertEquals(single.length, 1);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetIntegerArrayConverter() {
        Integer[] value = config.getConverter(Integer[].class).get().convert("1234,9999");
        Assert.assertNotNull(value);
        Assert.assertEquals(value.length, 2);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertEquals(value.length, 2);
        Assert.assertEquals(value, new Integer[]{1234, 9999});
        Integer[] single = config.getConverter(Integer[].class).get().convert("1234");
        Assert.assertNotNull(single);
        Assert.assertEquals(single.length, 1);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    public void testGetStringArrayConverter() {
        String[] value =
                config.getConverter(String[].class).get().convert("microservice,microprofile,m\\,f,microservice");
        Assert.assertNotNull(value);
        Assert.assertEquals(value.length, 4);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertEquals(value.length, 4);
        Assert.assertEquals(value, new String[]{"microservice", "microprofile", "m,f", "microservice"});
        String[] single = config.getConverter(String[].class).get().convert("value1");
        Assert.assertNotNull(single);
        Assert.assertEquals(single.length, 1);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetdoubleArrayConverter() {
        double[] value = config.getConverter(double[].class).get().convert("12.34,99.9999");
        Assert.assertNotNull(value);
        Assert.assertEquals(value.length, 2);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertEquals(value.length, 2);
        Assert.assertEquals(value, new Double[]{12.34d, 99.9999d});
        double[] single = config.getConverter(double[].class).get().convert("12.34");
        Assert.assertNotNull(single);
        Assert.assertEquals(single.length, 1);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    public void testGetLocalDateTimeArrayConverter() {
        LocalDateTime[] value =
                config.getConverter(LocalDateTime[].class).get().convert("2017-12-24T10:25:30,2017-12-24T10:25:33");
        Assert.assertNotNull(value);
        Assert.assertEquals(value.length, 2);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
                LocalDateTime.parse("2017-12-24T10:25:30"),
                LocalDateTime.parse("2017-12-24T10:25:33")});
        LocalDateTime[] single = config.getConverter(LocalDateTime[].class).get().convert("2017-12-24T10:25:30");
        Assert.assertNotNull(single);
        Assert.assertEquals(single.length, 1);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetOffsetTimeArrayConverter() {
        OffsetTime[] value = config.getConverter(OffsetTime[].class).get()
                .convert("13:45:30.123456789+02:00,13:45:30.123456789+03:00");
        Assert.assertNotNull(value);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
                OffsetTime.parse("13:45:30.123456789+02:00"),
                OffsetTime.parse("13:45:30.123456789+03:00")});
        OffsetTime[] single = config.getConverter(OffsetTime[].class).get().convert("13:45:30.123456789+02:00");
        Assert.assertNotNull(single);
        Assert.assertEquals(single.length, 1);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetDurationArrayConverter() {
        Duration[] value = config.getConverter(Duration[].class).get().convert("PT15M,PT20M");
        Assert.assertNotNull(value);
        Assert.assertEquals(value.length, 2);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
                Duration.parse("PT15M"),
                Duration.parse("PT20M")});
        Duration[] single = config.getConverter(Duration[].class).get().convert("PT15M");
        Assert.assertNotNull(single);
        Assert.assertEquals(single.length, 1);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    public void testGetInstantArrayConverter() {
        Instant[] value =
                config.getConverter(Instant[].class).get().convert("2015-06-02T21:34:33.616Z,2017-06-02T21:34:33.616Z");
        Assert.assertNotNull(value);
        Assert.assertEquals(value.length, 2);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
                Instant.parse("2015-06-02T21:34:33.616Z"),
                Instant.parse("2017-06-02T21:34:33.616Z")});
        Instant[] single = config.getConverter(Instant[].class).get().convert("2015-06-02T21:34:33.616Z");
        Assert.assertNotNull(single);
        Assert.assertEquals(single.length, 1);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetlongArrayCoverter() {
        long[] value = config.getConverter(long[].class).get().convert("1234567890,1999999999");
        Assert.assertNotNull(value);
        Assert.assertEquals(value.length, 2);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertEquals(value.length, 2);
        Assert.assertEquals(value, new Long[]{1234567890L, 1999999999L});
        long[] single = config.getConverter(long[].class).get().convert("1234567890");
        Assert.assertNotNull(single);
        Assert.assertEquals(single.length, 1);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetLocalTimeArrayConverter() {
        LocalTime[] value = config.getConverter(LocalTime[].class).get().convert("10:37,11:44");
        Assert.assertNotNull(value);
        Assert.assertEquals(value.length, 2);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
                LocalTime.parse("10:37"),
                LocalTime.parse("11:44")});
        LocalTime[] single = config.getConverter(LocalTime[].class).get().convert("10:37");
        Assert.assertNotNull(single);
        Assert.assertEquals(single.length, 1);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetUrlArrayConverter() throws MalformedURLException, URISyntaxException {
        URL[] value = config.getConverter(URL[].class).get()
                .convert("http://microprofile.io,http://openliberty.io,http://microprofile.io");
        Assert.assertNotNull(value);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
                new URL("http://microprofile.io")};
        assertURLArrayEquals(value, expectedValue);
        URL[] single = config.getConverter(URL[].class).get().convert("http://microprofile.io");
        Assert.assertNotNull(single);
        Assert.assertEquals(single.length, 1);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetfloatArrayConverter() {
        float[] value = config.getConverter(float[].class).get().convert("12.34,99.99");
        Assert.assertNotNull(value);
        Assert.assertEquals(value.length, 2);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertEquals(value.length, 2);
        Assert.assertEquals(value, new Float[]{12.34f, 99.99f});
        float[] single = config.getConverter(float[].class).get().convert("12.34");
        Assert.assertNotNull(single);
        Assert.assertEquals(single.length, 1);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetOffsetDateTimeArrayConverter() {
        OffsetDateTime[] value = config.getConverter(OffsetDateTime[].class).get()
                .convert("2007-12-03T10:15:30+01:00,2007-12-03T10:15:30+02:00");
        Assert.assertNotNull(value);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
                OffsetDateTime.parse("2007-12-03T10:15:30+02:00")});
        OffsetDateTime[] single =
                config.getConverter(OffsetDateTime[].class).get().convert("2007-12-03T10:15:30+01:00");
        Assert.assertNotNull(single);
        Assert.assertEquals(single.length, 1);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetFloatArrayConverter() {
        Float[] value = config.getConverter(Float[].class).get().convert("12.34,99.99");
        Assert.assertNotNull(value);
        Assert.assertEquals(value.length, 2);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertEquals(value.length, 2);
        Assert.assertEquals(value, new Float[]{12.34f, 99.99f});
        Float[] single = config.getConverter(Float[].class).get().convert("12.34");
        Assert.assertNotNull(single);
        Assert.assertEquals(single.length, 1);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetIntArrayConverter() {
        int[] value = config.getConverter(int[].class).get().convert("1234,9999");
        Assert.assertNotNull(value);
        Assert.assertEquals(value.length, 2);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertEquals(value.length, 2);
        Assert.assertEquals(value, new Integer[]{1234, 9999});
        int[] single = config.getConverter(int[].class).get().convert("1234");
        Assert.assertNotNull(single);
        Assert.assertEquals(single.length, 1);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetLocalDateArrayConverter() {
        LocalDate[] value = config.getConverter(LocalDate[].class).get().convert("2017-12-24,2017-11-29");
        Assert.assertNotNull(value);
        Assert.assertEquals(value.length, 2);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
                LocalDate.parse("2017-12-24"),
                LocalDate.parse("2017-11-29")});
        LocalDate[] single = config.getConverter(LocalDate[].class).get().convert("2017-12-24");
        Assert.assertNotNull(single);
        Assert.assertEquals(single.length, 1);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetbooleanArrayConverter() {
        boolean[] value = config.getConverter(boolean[].class).get().convert("true,false,true");
        Assert.assertNotNull(value);
        Assert.assertEquals(value.length, 3);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertEquals(value.length, 3);
        Assert.assertEquals(value, new Boolean[]{true, false, true});
        boolean[] single = config.getConverter(boolean[].class).get().convert("true");
        Assert.assertNotNull(single);
        Assert.assertEquals(single.length, 1);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetUriArrayConverter() {
        URI[] value = config.getConverter(URI[].class).get()
                .convert("http://microprofile.io,http://openliberty.io,http://microprofile.io");
        Assert.assertNotNull(value);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
                URI.create("http://openliberty.io"),
                URI.create("http://microprofile.io")});
        URI[] single = config.getConverter(URI[].class).get().convert("http://microprofile.io");
        Assert.assertNotNull(single);
        Assert.assertEquals(single.length, 1);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
    @Test
    public void testGetBooleanArrayConverter() {
        Boolean[] value = config.getConverter(Boolean[].class).get().convert("true,false,true");
        Assert.assertNotNull(value);
        Assert.assertEquals(value.length, 3);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `tck/src/main/java/org/eclipse/microprofile/config/tck/ArrayConverterTest.java`
#### Snippet
```java
        Assert.assertEquals(value.length, 3);
        Assert.assertEquals(value, new Boolean[]{true, false, true});
        Boolean[] single = config.getConverter(Boolean[].class).get().convert("true");
        Assert.assertNotNull(single);
        Assert.assertEquals(single.length, 1);
```

