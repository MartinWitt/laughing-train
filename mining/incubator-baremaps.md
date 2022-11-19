# incubator-baremaps 
 
# Bad smells
I found 350 bad smells with 21 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=BoundedWildcard] | 62 | false |
| RuleId[ruleID=AssignmentToMethodParameter] | 32 | false |
| RuleId[ruleID=ReturnNull] | 26 | false |
| RuleId[ruleID=DuplicateBranchesInSwitch] | 21 | false |
| RuleId[ruleID=EnhancedSwitchMigration] | 19 | false |
| RuleId[ruleID=UnstableApiUsage] | 19 | false |
| RuleId[ruleID=ClassCanBeRecord] | 16 | false |
| RuleId[ruleID=RedundantFieldInitialization] | 13 | false |
| RuleId[ruleID=DataFlowIssue] | 9 | false |
| RuleId[ruleID=UnnecessaryFullyQualifiedName] | 9 | false |
| RuleId[ruleID=FieldMayBeStatic] | 8 | false |
| RuleId[ruleID=UtilityClassWithoutPrivateConstructor] | 8 | false |
| RuleId[ruleID=PatternVariableCanBeUsed] | 8 | false |
| RuleId[ruleID=Convert2MethodRef] | 7 | false |
| RuleId[ruleID=UNUSED_IMPORT] | 6 | false |
| RuleId[ruleID=SystemOutErr] | 6 | false |
| RuleId[ruleID=SizeReplaceableByIsEmpty] | 5 | true |
| RuleId[ruleID=TextBlockMigration] | 5 | false |
| RuleId[ruleID=SimplifyStreamApiCallChains] | 4 | false |
| RuleId[ruleID=ProtectedMemberInFinalClass] | 4 | true |
| RuleId[ruleID=UnnecessaryLocalVariable] | 4 | true |
| RuleId[ruleID=OverwrittenKey] | 4 | false |
| RuleId[ruleID=StaticCallOnSubclass] | 3 | false |
| RuleId[ruleID=LongLiteralsEndingWithLowercaseL] | 3 | false |
| RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment] | 3 | false |
| RuleId[ruleID=NestedAssignment] | 3 | false |
| RuleId[ruleID=ZeroLengthArrayInitialization] | 3 | false |
| RuleId[ruleID=ConstantValue] | 3 | false |
| RuleId[ruleID=ObviousNullCheck] | 3 | false |
| RuleId[ruleID=StringEqualsEmptyString] | 3 | false |
| RuleId[ruleID=NonProtectedConstructorInAbstractClass] | 3 | true |
| RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument] | 2 | true |
| RuleId[ruleID=StringBufferReplaceableByString] | 2 | false |
| RuleId[ruleID=AccessStaticViaInstance] | 2 | false |
| RuleId[ruleID=OptionalGetWithoutIsPresent] | 2 | false |
| RuleId[ruleID=UnnecessarySemicolon] | 2 | false |
| RuleId[ruleID=UnnecessaryModifier] | 1 | true |
| RuleId[ruleID=MagicConstant] | 1 | false |
| RuleId[ruleID=EmptyTryBlock] | 1 | false |
| RuleId[ruleID=EmptyStatementBody] | 1 | false |
| RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod] | 1 | false |
| RuleId[ruleID=ManualArrayCopy] | 1 | false |
| RuleId[ruleID=UnnecessaryReturn] | 1 | true |
| RuleId[ruleID=IgnoreResultOfCall] | 1 | false |
| RuleId[ruleID=MismatchedCollectionQueryUpdate] | 1 | false |
| RuleId[ruleID=UseOfPropertiesAsHashtable] | 1 | false |
| RuleId[ruleID=RedundantImplements] | 1 | false |
| RuleId[ruleID=NullArgumentToVariableArgMethod] | 1 | false |
| RuleId[ruleID=UnusedAssignment] | 1 | false |
| RuleId[ruleID=AbstractMethodCallInConstructor] | 1 | false |
| RuleId[ruleID=CatchMayIgnoreException] | 1 | false |
| RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern] | 1 | false |
| RuleId[ruleID=PointlessBooleanExpression] | 1 | true |
| RuleId[ruleID=ThreadStartInConstruction] | 1 | false |
## RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
### RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
Call to `toArray()` with pre-sized array argument 'new Coordinate\[list.size()\]'
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/function/CreateGeometryConsumer.java`
#### Snippet
```java
    try {
      List<Coordinate> list = way.getNodes().stream().map(coordinates::get).toList();
      Coordinate[] array = list.toArray(new Coordinate[list.size()]);
      LineString line = geometryFactory.createLineString(array);
      if (!line.isEmpty()) {
```

### RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
Call to `toArray()` with pre-sized array argument 'new Coordinate\[coords.size()\]'
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/function/CreateGeometryConsumer.java`
#### Snippet
```java
      List<Long> refs = this.references.get(member.getRef());
      List<Coordinate> coords = refs.stream().map(coordinates::get).toList();
      Coordinate[] array = coords.toArray(new Coordinate[coords.size()]);
      return geometryFactory.createLineString(array);
    } catch (Exception e) {
```

## RuleId[ruleID=UnnecessaryModifier]
### RuleId[ruleID=UnnecessaryModifier]
Modifier `private` is redundant for enum constructors
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapeType.java`
#### Snippet
```java
  private int value;

  private ShapeType(int value) {
    this.value = value;
  }
```

## RuleId[ruleID=MagicConstant]
### RuleId[ruleID=MagicConstant]
Should be one of: Calendar.JANUARY, Calendar.FEBRUARY, Calendar.MARCH, Calendar.APRIL, Calendar.MAY, ...
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DbaseByteReader.java`
#### Snippet
```java

    @SuppressWarnings("deprecation") // But everything is deprecated in DBF files...
    Date date = new Date(year, month, day);
    return date;
  }
```

## RuleId[ruleID=EmptyTryBlock]
### RuleId[ruleID=EmptyTryBlock]
Empty `try` block
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileReader.java`
#### Snippet
```java
  public void loadDescriptors() throws IOException {
    // Doing a simple query will init the internal descriptors.
    try (InputFeatureStream is = read()) {
    }
  }
```

## RuleId[ruleID=StaticCallOnSubclass]
### RuleId[ruleID=StaticCallOnSubclass]
Static method `escape()` declared in class 'org.apache.lucene.queryparser.classic.QueryParserBase' but referenced via subclass 'org.apache.lucene.queryparser.classic.QueryParser'
in `baremaps-core/src/main/java/org/apache/baremaps/geocoder/geonames/GeonamesGeocoder.java`
#### Snippet
```java
  protected Query query(Analyzer analyzer, Request request) throws ParseException {
    BooleanQuery.Builder builder = new Builder();
    String query = QueryParser.escape(request.query());
    if (!query.isBlank()) {
      SimpleQueryParser nameQueryParser = new SimpleQueryParser(analyzer, "name");
```

### RuleId[ruleID=StaticCallOnSubclass]
Static method `escape()` declared in class 'org.apache.lucene.queryparser.classic.QueryParserBase' but referenced via subclass 'org.apache.lucene.queryparser.classic.QueryParser'
in `baremaps-core/src/main/java/org/apache/baremaps/geocoder/geonames/GeonamesGeocoder.java`
#### Snippet
```java
      if (request.countryCode() != null) {
        builder.add(
            new TermQuery(new Term("countryCode", QueryParser.escape(request.countryCode()))),
            Occur.MUST);
      }
```

### RuleId[ruleID=StaticCallOnSubclass]
Static method `open()` declared in class 'org.apache.lucene.store.FSDirectory' but referenced via subclass 'org.apache.lucene.store.MMapDirectory'
in `baremaps-core/src/main/java/org/apache/baremaps/geocoder/Geocoder.java`
#### Snippet
```java

  public Geocoder(Path index) throws IOException {
    this.directory = MMapDirectory.open(index);
  }

```

## RuleId[ruleID=EmptyStatementBody]
### RuleId[ruleID=EmptyStatementBody]
`while` statement has empty body
in `baremaps-core/src/main/java/org/apache/baremaps/stream/BatchedSpliterator.java`
#### Snippet
```java
  public Spliterator<T> trySplit() {
    List<T> batch = new ArrayList<>();
    while (batch.size() < batchSize && tryAdvance(batch::add)) {
    }

```

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
Assignment to static field `ApiResource.openapiPath` from instance context
in `baremaps-ogcapi/src/main/java/org/apache/baremaps/ogcapi/ApiResource.java`
#### Snippet
```java

  public ApiResource(String openapiPath) {
    ApiResource.openapiPath = openapiPath;
  }

```

## RuleId[ruleID=ManualArrayCopy]
### RuleId[ruleID=ManualArrayCopy]
Manual array copy
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DbaseByteReader.java`
#### Snippet
```java
        byte[] dataTrimmed = new byte[length];

        for (int index = 0; index < length; index++) {
          dataTrimmed[index] = data[index];
        }
```

## RuleId[ruleID=LongLiteralsEndingWithLowercaseL]
### RuleId[ruleID=LongLiteralsEndingWithLowercaseL]
'long' literal `1l` ends with lowercase 'l'
in `baremaps-core/src/main/java/org/apache/baremaps/collection/memory/Memory.java`
#### Snippet
```java
    this.segmentSize = segmentSize;
    this.segmentShift = (long) (Math.log(this.segmentSize) / Math.log(2));
    this.segmentMask = this.segmentSize - 1l;
  }

```

### RuleId[ruleID=LongLiteralsEndingWithLowercaseL]
'long' literal `10l` ends with lowercase 'l'
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/UnzipFile.java`
#### Snippet
```java

  private static final long THRESHOLD_ENTRIES = 10000;
  private static final long THRESHOLD_SIZE = 10l << 30;
  private static final double THRESHOLD_RATIO = 100;

```

### RuleId[ruleID=LongLiteralsEndingWithLowercaseL]
'long' literal `0l` ends with lowercase 'l'
in `baremaps-core/src/main/java/org/apache/baremaps/collection/sort/DataStack.java`
#### Snippet
```java
  private DataList<T> list;

  private Long index = 0l;

  private T cache;
```

## RuleId[ruleID=DuplicateBranchesInSwitch]
### RuleId[ruleID=DuplicateBranchesInSwitch]
Duplicate branch in 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileByteReader.java`
#### Snippet
```java
        case Currency -> Double.class;
        case Integer -> Integer.class;
        case Double -> Double.class;
        case AutoIncrement -> Integer.class;

```

### RuleId[ruleID=DuplicateBranchesInSwitch]
Duplicate branch in 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileByteReader.java`
#### Snippet
```java
        case Integer -> Integer.class;
        case Double -> Double.class;
        case AutoIncrement -> Integer.class;

        // TODO: Implement the following types
```

### RuleId[ruleID=DuplicateBranchesInSwitch]
Duplicate branch in 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileByteReader.java`
#### Snippet
```java
        // TODO: Implement the following types
        case Logical -> String.class;
        case Date -> String.class;
        case Memo -> String.class;
        case FloatingPoint -> String.class;
```

### RuleId[ruleID=DuplicateBranchesInSwitch]
Duplicate branch in 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileByteReader.java`
#### Snippet
```java
        case Logical -> String.class;
        case Date -> String.class;
        case Memo -> String.class;
        case FloatingPoint -> String.class;
        case Picture -> String.class;
```

### RuleId[ruleID=DuplicateBranchesInSwitch]
Duplicate branch in 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileByteReader.java`
#### Snippet
```java
        case Date -> String.class;
        case Memo -> String.class;
        case FloatingPoint -> String.class;
        case Picture -> String.class;
        case VariField -> String.class;
```

### RuleId[ruleID=DuplicateBranchesInSwitch]
Duplicate branch in 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileByteReader.java`
#### Snippet
```java
        case Memo -> String.class;
        case FloatingPoint -> String.class;
        case Picture -> String.class;
        case VariField -> String.class;
        case Variant -> String.class;
```

### RuleId[ruleID=DuplicateBranchesInSwitch]
Duplicate branch in 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileByteReader.java`
#### Snippet
```java
        case FloatingPoint -> String.class;
        case Picture -> String.class;
        case VariField -> String.class;
        case Variant -> String.class;
        case TimeStamp -> String.class;
```

### RuleId[ruleID=DuplicateBranchesInSwitch]
Duplicate branch in 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileByteReader.java`
#### Snippet
```java
        case Picture -> String.class;
        case VariField -> String.class;
        case Variant -> String.class;
        case TimeStamp -> String.class;
        case DateTime -> String.class;
```

### RuleId[ruleID=DuplicateBranchesInSwitch]
Duplicate branch in 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileByteReader.java`
#### Snippet
```java
        case VariField -> String.class;
        case Variant -> String.class;
        case TimeStamp -> String.class;
        case DateTime -> String.class;
      };
```

### RuleId[ruleID=DuplicateBranchesInSwitch]
Duplicate branch in 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileByteReader.java`
#### Snippet
```java
        case Variant -> String.class;
        case TimeStamp -> String.class;
        case DateTime -> String.class;
      };

```

### RuleId[ruleID=DuplicateBranchesInSwitch]
Duplicate branch in 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DbaseByteReader.java`
#### Snippet
```java
        case Currency -> Double.parseDouble(value.trim());
        case Integer -> Integer.parseInt(value.trim());
        case Double -> Double.parseDouble(value.trim());
        case AutoIncrement -> Integer.parseInt(value.trim());
        case Logical -> value;
```

### RuleId[ruleID=DuplicateBranchesInSwitch]
Duplicate branch in 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DbaseByteReader.java`
#### Snippet
```java
        case Integer -> Integer.parseInt(value.trim());
        case Double -> Double.parseDouble(value.trim());
        case AutoIncrement -> Integer.parseInt(value.trim());
        case Logical -> value;
        case Date -> value;
```

### RuleId[ruleID=DuplicateBranchesInSwitch]
Duplicate branch in 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DbaseByteReader.java`
#### Snippet
```java
        case Double -> Double.parseDouble(value.trim());
        case AutoIncrement -> Integer.parseInt(value.trim());
        case Logical -> value;
        case Date -> value;
        case Memo -> value;
```

### RuleId[ruleID=DuplicateBranchesInSwitch]
Duplicate branch in 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DbaseByteReader.java`
#### Snippet
```java
        case AutoIncrement -> Integer.parseInt(value.trim());
        case Logical -> value;
        case Date -> value;
        case Memo -> value;
        case FloatingPoint -> value;
```

### RuleId[ruleID=DuplicateBranchesInSwitch]
Duplicate branch in 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DbaseByteReader.java`
#### Snippet
```java
        case Logical -> value;
        case Date -> value;
        case Memo -> value;
        case FloatingPoint -> value;
        case Picture -> value;
```

### RuleId[ruleID=DuplicateBranchesInSwitch]
Duplicate branch in 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DbaseByteReader.java`
#### Snippet
```java
        case Date -> value;
        case Memo -> value;
        case FloatingPoint -> value;
        case Picture -> value;
        case VariField -> value;
```

### RuleId[ruleID=DuplicateBranchesInSwitch]
Duplicate branch in 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DbaseByteReader.java`
#### Snippet
```java
        case Memo -> value;
        case FloatingPoint -> value;
        case Picture -> value;
        case VariField -> value;
        case Variant -> value;
```

### RuleId[ruleID=DuplicateBranchesInSwitch]
Duplicate branch in 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DbaseByteReader.java`
#### Snippet
```java
        case FloatingPoint -> value;
        case Picture -> value;
        case VariField -> value;
        case Variant -> value;
        case TimeStamp -> value;
```

### RuleId[ruleID=DuplicateBranchesInSwitch]
Duplicate branch in 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DbaseByteReader.java`
#### Snippet
```java
        case Picture -> value;
        case VariField -> value;
        case Variant -> value;
        case TimeStamp -> value;
        case DateTime -> value;
```

### RuleId[ruleID=DuplicateBranchesInSwitch]
Duplicate branch in 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DbaseByteReader.java`
#### Snippet
```java
        case VariField -> value;
        case Variant -> value;
        case TimeStamp -> value;
        case DateTime -> value;
      };
```

### RuleId[ruleID=DuplicateBranchesInSwitch]
Duplicate branch in 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DbaseByteReader.java`
#### Snippet
```java
        case Variant -> value;
        case TimeStamp -> value;
        case DateTime -> value;
      };

```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### RuleId[ruleID=SizeReplaceableByIsEmpty]
`key.length() > 0` can be replaced with '!key.isEmpty()'
in `baremaps-core/src/main/java/org/apache/baremaps/iploc/nic/NicSpliterator.java`
#### Snippet
```java

  private void addAttribute(List<NicAttribute> attributes, StringBuilder key, StringBuilder val) {
    if (key.length() > 0) {
      attributes.add(new NicAttribute(key.toString(), val.toString()));
    }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`response.results().size() > 0` can be replaced with '!response.results().isEmpty()'
in `baremaps-core/src/main/java/org/apache/baremaps/iploc/IpLoc.java`
#### Snippet
```java
  private Optional<Location> findLocation(Request request) throws IOException, ParseException {
    Response response = geocoder.search(request);
    if (response.results().size() > 0) {
      if (response.topDocs().scoreDocs[0].score > SCORE_THRESHOLD) {
        double latitude = Double.parseDouble(response.results().get(0).document().get("latitude"));
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`queue.size() > 0` can be replaced with '!queue.isEmpty()'
in `baremaps-core/src/main/java/org/apache/baremaps/collection/sort/ExternalMergeSort.java`
#### Snippet
```java
    long counter = 0;
    if (!distinct) {
      while (queue.size() > 0) {
        DataStack<T> stack = queue.poll();
        T value = stack.pop();
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`queue.size() > 0` can be replaced with '!queue.isEmpty()'
in `baremaps-core/src/main/java/org/apache/baremaps/collection/sort/ExternalMergeSort.java`
#### Snippet
```java
    } else {
      T last = null;
      if (queue.size() > 0) {
        DataStack<T> stack = queue.poll();
        last = stack.pop();
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`queue.size() > 0` can be replaced with '!queue.isEmpty()'
in `baremaps-core/src/main/java/org/apache/baremaps/collection/sort/ExternalMergeSort.java`
#### Snippet
```java
        }
      }
      while (queue.size() > 0) {
        DataStack<T> stack = queue.poll();
        T value = stack.pop();
```

## RuleId[ruleID=StringBufferReplaceableByString]
### RuleId[ruleID=StringBufferReplaceableByString]
`StringBuilder builder` can be replaced with 'String'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/postgres/PostgresDatabase.java`
#### Snippet
```java

  private String copyTable(FeatureType featureType) {
    StringBuilder builder = new StringBuilder();
    builder.append("COPY ");
    builder.append(featureType.getName());
```

### RuleId[ruleID=StringBufferReplaceableByString]
`StringBuilder builder` can be replaced with 'String'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/postgres/PostgresDatabase.java`
#### Snippet
```java

  private String createTable(FeatureType featureType) {
    StringBuilder builder = new StringBuilder();
    builder.append("CREATE TABLE ");
    builder.append(featureType.getName());
```

## RuleId[ruleID=UnnecessaryReturn]
### RuleId[ruleID=UnnecessaryReturn]
`return` is unnecessary as the last statement in a 'void' method
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlEntitySpliterator.java`
#### Snippet
```java
      default:
        readUnknownElement();
        return;
    }
  }
```

## RuleId[ruleID=TextBlockMigration]
### RuleId[ruleID=TextBlockMigration]
Concatenation can be replaced with text block
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/iploc/Init.java`
#### Snippet
```java

      logger.info(String.format(
          "IpLoc stats\n" + "-----------\n" + "inetnumInsertedByAddress : %s\n"
              + "inetnumInsertedByDescr : %s\n" + "inetnumInsertedByCountry : %s\n"
              + "inetnumInsertedByCountryCode : %s\n" + "inetnumInsertedByGeoloc : %s\n"
```

### RuleId[ruleID=TextBlockMigration]
Concatenation can be replaced with text block
in `baremaps-core/src/main/java/org/apache/baremaps/iploc/database/InetnumLocationDaoSqliteImpl.java`
#### Snippet
```java
          + "longitude, \n" + "network, \n" + "country \n" + " FROM inetnum_locations;";

  private static final String SELECT_ALL_BY_IP_SQL = "SELECT " + "id, \n" + "address, \n"
      + "ip_start, \n" + "ip_end, \n" + "latitude, \n" + "longitude, \n" + "network, \n"
      + "country FROM inetnum_locations WHERE ip_start <= ? AND ip_end >= ?;";
```

### RuleId[ruleID=TextBlockMigration]
Concatenation can be replaced with text block
in `baremaps-core/src/main/java/org/apache/baremaps/iploc/database/InetnumLocationDaoSqliteImpl.java`
#### Snippet
```java

  private static final String SELECT_ALL_SQL =
      "SELECT " + "id, \n" + "address, \n" + "ip_start, \n" + "ip_end, \n" + "latitude, \n"
          + "longitude, \n" + "network, \n" + "country \n" + " FROM inetnum_locations;";

```

### RuleId[ruleID=TextBlockMigration]
Concatenation can be replaced with text block
in `baremaps-core/src/main/java/org/apache/baremaps/database/tile/PostgresQuery.java`
#### Snippet
```java
      plainSelect = (PlainSelect) select.getSelectBody();
    } catch (JSQLParserException e) {
      String message = String.format("The query is malformed.\n" + "\tQuery:\n\t\t%s", query);
      throw new IllegalArgumentException(message, e);
    }
```

### RuleId[ruleID=TextBlockMigration]
Concatenation can be replaced with text block
in `baremaps-core/src/main/java/org/apache/baremaps/database/tile/PostgresQuery.java`
#### Snippet
```java
    // Check the number of columns
    if (plainSelect.getSelectItems().size() != 3) {
      String message = String.format("The query is malformed.\n"
          + "\tExpected format:\n\t\tSELECT c1::bigint, c2::jsonb, c3::geometry FROM t WHERE c\n"
          + "\tActual query:\n\t\t%s", query);
```

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Path`
in `baremaps-server/src/main/java/org/apache/baremaps/server/DirectoryWatcher.java`
#### Snippet
```java
  private final Consumer<Path> consumer;

  public DirectoryWatcher(Set<Path> directories, Consumer<Path> consumer) {
    this.directories = directories;
    this.consumer = consumer;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Path`
in `baremaps-server/src/main/java/org/apache/baremaps/server/DirectoryWatcher.java`
#### Snippet
```java
  private final Consumer<Path> consumer;

  public DirectoryWatcher(Set<Path> directories, Consumer<Path> consumer) {
    this.directories = directories;
    this.consumer = consumer;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Long`
in `baremaps-benchmark/src/main/java/org/apache/baremaps/benchmarks/LongDataMapBenchmark.java`
#### Snippet
```java
  private static final long N = 1 << 25;

  private void benchmark(AlignedDataList<Long> store, long n) {
    for (long i = 0; i < n; i++) {
      store.add(i);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Long`
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/progress/StreamProgress.java`
#### Snippet
```java
   * @param listener the progress listener
   */
  public StreamProgress(Consumer<Long> listener) {
    this.listener = listener;
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `baremaps-core/src/main/java/org/apache/baremaps/stream/PartitionedSpliterator.java`
#### Snippet
```java
   * @param partitionSize the partition size
   */
  public PartitionedSpliterator(Spliterator<T> spliterator, int partitionSize) {
    this.spliterator = spliterator;
    this.partitionSize = partitionSize;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CompletableFuture`
in `baremaps-core/src/main/java/org/apache/baremaps/stream/BufferedSpliterator.java`
#### Snippet
```java
   * @param completionOrder the completion order
   */
  public BufferedSpliterator(Spliterator<CompletableFuture<T>> spliterator, int bufferSize,
      CompletionOrder completionOrder) {
    this.spliterator = spliterator;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super CompletableFuture`
in `baremaps-core/src/main/java/org/apache/baremaps/stream/BufferedSpliterator.java`
#### Snippet
```java
    @Override
    public <T> void registerCompletion(CompletableFuture<T> future,
        Consumer<CompletableFuture<T>> resultConsumer) {
      resultConsumer.accept(future);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super CompletableFuture`
in `baremaps-core/src/main/java/org/apache/baremaps/stream/BufferedSpliterator.java`
#### Snippet
```java
    @Override
    public <T> void registerCompletion(CompletableFuture<T> future,
        Consumer<CompletableFuture<T>> resultConsumer) {
      future.thenAccept(result -> resultConsumer.accept(future));
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   * @return a ordered sequential stream.
   */
  public static <T> Stream<T> stream(Iterator<T> iterator) {
    return StreamSupport.stream(Spliterators.spliteratorUnknownSize(iterator, Spliterator.ORDERED),
        false);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   * @return a buffered stream
   */
  private static <T, U> Stream<U> buffer(Stream<T> stream, Function<T, U> asyncMapper,
      CompletionOrder completionOrder, int bufferSize) {
    Stream<CompletableFuture<U>> asyncStream =
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   * @return a buffered stream
   */
  private static <T, U> Stream<U> buffer(Stream<T> stream, Function<T, U> asyncMapper,
      CompletionOrder completionOrder, int bufferSize) {
    Stream<CompletableFuture<U>> asyncStream =
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends U`
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   * @return a buffered stream
   */
  private static <T, U> Stream<U> buffer(Stream<T> stream, Function<T, U> asyncMapper,
      CompletionOrder completionOrder, int bufferSize) {
    Stream<CompletableFuture<U>> asyncStream =
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Long`
in `baremaps-core/src/main/java/org/apache/baremaps/database/SaveChangeConsumer.java`
#### Snippet
```java
   * @param relationRepository the relation table
   */
  public SaveChangeConsumer(Repository<Long, Node> nodeRepository,
      Repository<Long, Way> wayRepository, Repository<Long, Relation> relationRepository) {
    this.nodeRepository = nodeRepository;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Node`
in `baremaps-core/src/main/java/org/apache/baremaps/database/SaveChangeConsumer.java`
#### Snippet
```java
   * @param relationRepository the relation table
   */
  public SaveChangeConsumer(Repository<Long, Node> nodeRepository,
      Repository<Long, Way> wayRepository, Repository<Long, Relation> relationRepository) {
    this.nodeRepository = nodeRepository;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Long`
in `baremaps-core/src/main/java/org/apache/baremaps/database/SaveChangeConsumer.java`
#### Snippet
```java
   */
  public SaveChangeConsumer(Repository<Long, Node> nodeRepository,
      Repository<Long, Way> wayRepository, Repository<Long, Relation> relationRepository) {
    this.nodeRepository = nodeRepository;
    this.wayRepository = wayRepository;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Way`
in `baremaps-core/src/main/java/org/apache/baremaps/database/SaveChangeConsumer.java`
#### Snippet
```java
   */
  public SaveChangeConsumer(Repository<Long, Node> nodeRepository,
      Repository<Long, Way> wayRepository, Repository<Long, Relation> relationRepository) {
    this.nodeRepository = nodeRepository;
    this.wayRepository = wayRepository;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Long`
in `baremaps-core/src/main/java/org/apache/baremaps/database/SaveChangeConsumer.java`
#### Snippet
```java
   */
  public SaveChangeConsumer(Repository<Long, Node> nodeRepository,
      Repository<Long, Way> wayRepository, Repository<Long, Relation> relationRepository) {
    this.nodeRepository = nodeRepository;
    this.wayRepository = wayRepository;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Relation`
in `baremaps-core/src/main/java/org/apache/baremaps/database/SaveChangeConsumer.java`
#### Snippet
```java
   */
  public SaveChangeConsumer(Repository<Long, Node> nodeRepository,
      Repository<Long, Way> wayRepository, Repository<Long, Relation> relationRepository) {
    this.nodeRepository = nodeRepository;
    this.wayRepository = wayRepository;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends List`
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/function/CreateGeometryConsumer.java`
#### Snippet
```java
   */
  public CreateGeometryConsumer(LongDataMap<Coordinate> coordinates,
      LongDataMap<List<Long>> references) {
    this.geometryFactory = new GeometryFactory(new PrecisionModel(), 4326);
    this.coordinates = coordinates;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Polygon`
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/function/CreateGeometryConsumer.java`
#### Snippet
```java
  }

  private Set<Polygon> mergeInnerPolygons(Set<Polygon> innerPolygons) {
    Set<Polygon> usedPolygons = new HashSet<>();
    Set<Polygon> mergedPolygons = new HashSet<>();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Polygon`
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/function/CreateGeometryConsumer.java`
#### Snippet
```java
  }

  private List<Polygon> mergeOuterAndInnerPolygons(Set<Polygon> outerPolygons,
      Set<Polygon> innerPolygons) {
    List<Polygon> polygons = new ArrayList<>();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Entity`
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/function/ChangeEntityConsumer.java`
#### Snippet
```java
   * @param consumer
   */
  public ChangeEntityConsumer(Consumer<Entity> consumer) {
    this.consumer = consumer;
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Long`
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/progress/InputStreamProgress.java`
#### Snippet
```java
   * @param listener the progress listener
   */
  public InputStreamProgress(InputStream inputStream, Consumer<Long> listener) {
    super(inputStream);
    this.listener = listener;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Header`
in `baremaps-core/src/main/java/org/apache/baremaps/database/SaveBlockConsumer.java`
#### Snippet
```java
   * @param relationRepository the relation table
   */
  public SaveBlockConsumer(Repository<Long, Header> headerRepository,
      Repository<Long, Node> nodeRepository, Repository<Long, Way> wayRepository,
      Repository<Long, Relation> relationRepository) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends InetnumLocation`
in `baremaps-core/src/main/java/org/apache/baremaps/iploc/database/InetnumLocationDaoSqliteImpl.java`
#### Snippet
```java
  /** {@inheritDoc} */
  @Override
  public void save(List<InetnumLocation> inetnumLocations) {
    try (Connection connection = getWriteConnection();
        PreparedStatement stmt = connection.prepareStatement(INSERT_SQL);) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super NicAttribute`
in `baremaps-core/src/main/java/org/apache/baremaps/iploc/nic/NicSpliterator.java`
#### Snippet
```java
  }

  private void addAttribute(List<NicAttribute> attributes, StringBuilder key, StringBuilder val) {
    if (key.length() > 0) {
      attributes.add(new NicAttribute(key.toString(), val.toString()));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/sort/DataStack.java`
#### Snippet
```java
  private T cache;

  public DataStack(DataList<T> list) {
    this.list = list;
    reload();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends NicAttribute`
in `baremaps-core/src/main/java/org/apache/baremaps/iploc/nic/NicObject.java`
#### Snippet
```java
   * @param attributes a list of NIC attributes
   */
  public NicObject(List<NicAttribute> attributes) {
    checkNotNull(attributes);
    checkArgument(!attributes.isEmpty());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends NicObject`
in `baremaps-core/src/main/java/org/apache/baremaps/iploc/IpLoc.java`
#### Snippet
```java
   * @param nicObjects the stream of nic objects to import
   */
  public void insertNicObjects(Stream<NicObject> nicObjects) {
    StreamUtils.partition(nicObjects.filter(this::isInetnum).map(this::nicObjectToInetnumLocation)
        // TODO: we should probably not filter, i.e., even in the worst case we should have
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Coordinate`
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/store/DataStoreConsumer.java`
#### Snippet
```java
   * @param references the map of references
   */
  public DataStoreConsumer(LongDataMap<Coordinate> coordinates,
      LongDataMap<List<Long>> references) {
    this.coordinates = coordinates;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super List`
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/store/DataStoreConsumer.java`
#### Snippet
```java
   */
  public DataStoreConsumer(LongDataMap<Coordinate> coordinates,
      LongDataMap<List<Long>> references) {
    this.coordinates = coordinates;
    this.references = references;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Entity`
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/function/BlockEntityConsumer.java`
#### Snippet
```java
   * @param consumer the entity consumer
   */
  public BlockEntityConsumer(Consumer<Entity> consumer) {
    this.consumer = consumer;
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `baremaps-core/src/main/java/org/apache/baremaps/stream/BatchedSpliterator.java`
#### Snippet
```java
   * @param batchSize the batch size.
   */
  public BatchedSpliterator(Spliterator<T> spliterator, int batchSize) {
    this.spliterator = spliterator;
    this.batchSize = batchSize;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `baremaps-core/src/main/java/org/apache/baremaps/stream/ConsumerUtils.java`
#### Snippet
```java
   * @return the function
   */
  public static <T> Function<T, T> consumeThenReturn(Consumer<T> consumer) {
    return t -> {
      consumer.accept(t);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Member`
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlChangeSpliterator.java`
#### Snippet
```java
  }

  private void readRelationMember(List<Member> members) throws XMLStreamException {
    long id = Long.parseLong(reader.getAttributeValue(null, ATTRIBUTE_NAME_REF));
    Member.MemberType type = Member.MemberType
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlChangeSpliterator.java`
#### Snippet
```java
  }

  private void readTag(Map<String, String> tags) throws XMLStreamException {
    String name = reader.getAttributeValue(null, ATTRIBUTE_NAME_KEY);
    String value = reader.getAttributeValue(null, ATTRIBUTE_NAME_VALUE);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlChangeSpliterator.java`
#### Snippet
```java
  }

  private void readTag(Map<String, String> tags) throws XMLStreamException {
    String name = reader.getAttributeValue(null, ATTRIBUTE_NAME_KEY);
    String value = reader.getAttributeValue(null, ATTRIBUTE_NAME_VALUE);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Long`
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlChangeSpliterator.java`
#### Snippet
```java
  }

  private void readWayMember(List<Long> members) throws XMLStreamException {
    Long member = Long.parseLong(reader.getAttributeValue(null, ATTRIBUTE_NAME_REF));
    members.add(member);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlEntitySpliterator.java`
#### Snippet
```java
  }

  private void readTag(Map<String, String> tags) throws XMLStreamException {
    String name = reader.getAttributeValue(null, ATTRIBUTE_NAME_KEY);
    String value = reader.getAttributeValue(null, ATTRIBUTE_NAME_VALUE);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlEntitySpliterator.java`
#### Snippet
```java
  }

  private void readTag(Map<String, String> tags) throws XMLStreamException {
    String name = reader.getAttributeValue(null, ATTRIBUTE_NAME_KEY);
    String value = reader.getAttributeValue(null, ATTRIBUTE_NAME_VALUE);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Member`
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlEntitySpliterator.java`
#### Snippet
```java
  }

  private void readRelationMember(List<Member> members) throws XMLStreamException {
    long id = Long.parseLong(reader.getAttributeValue(null, ATTRIBUTE_NAME_REF));
    Member.MemberType type = Member.MemberType
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Long`
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlEntitySpliterator.java`
#### Snippet
```java
  }

  private void readWayMember(List<Long> members) throws XMLStreamException {
    Long member = Long.parseLong(reader.getAttributeValue(null, ATTRIBUTE_NAME_REF));
    members.add(member);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Entity`
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/pbf/DataBlockReader.java`
#### Snippet
```java
   * @param consumer the consumer
   */
  public void readEntities(Consumer<Entity> consumer) {
    readDenseNodes(consumer::accept);
    readNodes(consumer::accept);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Header`
in `baremaps-core/src/main/java/org/apache/baremaps/database/repository/PostgresHeaderRepository.java`
#### Snippet
```java
  /** {@inheritDoc} */
  @Override
  public void put(List<Header> values) throws RepositoryException {
    if (values.isEmpty()) {
      return;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Header`
in `baremaps-core/src/main/java/org/apache/baremaps/database/repository/PostgresHeaderRepository.java`
#### Snippet
```java
  /** {@inheritDoc} */
  @Override
  public void copy(List<Header> values) throws RepositoryException {
    if (values.isEmpty()) {
      return;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/sort/ExternalMergeSort.java`
#### Snippet
```java
   * @throws IOException
   */
  public static <T> DataList<T> sortBatch(List<T> batch, Comparator<T> comparator,
      Supplier<DataList<T>> supplier, boolean distinct, boolean parallel) throws IOException {
    DataList<T> output = supplier.get();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends DataList`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/sort/ExternalMergeSort.java`
#### Snippet
```java
   */
  public static <T> DataList<T> sortBatch(List<T> batch, Comparator<T> comparator,
      Supplier<DataList<T>> supplier, boolean distinct, boolean parallel) throws IOException {
    DataList<T> output = supplier.get();
    Stream<T> tmpStream = batch.stream().sorted(comparator);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends DataList`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/sort/ExternalMergeSort.java`
#### Snippet
```java
   * @throws IOException
   */
  private static <T> long mergeSortedBatches(List<DataList<T>> batches, DataList<T> output,
      Comparator<T> comparator, boolean distinct) throws IOException {
    PriorityQueue<DataStack<T>> queue =
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/sort/ExternalMergeSort.java`
#### Snippet
```java
   * @throws IOException
   */
  private static <T> long mergeSortedBatches(List<DataList<T>> batches, DataList<T> output,
      Comparator<T> comparator, boolean distinct) throws IOException {
    PriorityQueue<DataStack<T>> queue =
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/sort/ExternalMergeSort.java`
#### Snippet
```java
   */
  private static <T> long mergeSortedBatches(List<DataList<T>> batches, DataList<T> output,
      Comparator<T> comparator, boolean distinct) throws IOException {
    PriorityQueue<DataStack<T>> queue =
        new PriorityQueue<>(batches.size(), (i, j) -> comparator.compare(i.peek(), j.peek()));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/sort/ExternalMergeSort.java`
#### Snippet
```java
   * @throws IOException
   */
  public static <T> List<DataList<T>> sortInBatch(final DataList<T> input,
      final Comparator<T> comparator, Supplier<DataList<T>> supplier, long batchSize,
      final boolean distinct, final boolean parallel) throws IOException {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `baremaps-core/src/main/java/org/apache/baremaps/stream/SupplierUtils.java`
#### Snippet
```java
   * @return the memoized supplier
   */
  public static <T> Supplier<T> memoize(Supplier<T> supplier) {
    T value = supplier.get();
    return () -> value;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `baremaps-core/src/main/java/org/apache/baremaps/stream/SupplierUtils.java`
#### Snippet
```java
   * @return the resulting supplier
   */
  public static <T, R> Supplier<R> convert(Supplier<T> supplier, Function<T, R> function) {
    return () -> function.apply(supplier.get());
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `baremaps-core/src/main/java/org/apache/baremaps/stream/SupplierUtils.java`
#### Snippet
```java
   * @return the resulting supplier
   */
  public static <T, R> Supplier<R> convert(Supplier<T> supplier, Function<T, R> function) {
    return () -> function.apply(supplier.get());
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends R`
in `baremaps-core/src/main/java/org/apache/baremaps/stream/SupplierUtils.java`
#### Snippet
```java
   * @return the resulting supplier
   */
  public static <T, R> Supplier<R> convert(Supplier<T> supplier, Function<T, R> function) {
    return () -> function.apply(supplier.get());
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `baremaps-core/src/main/java/org/apache/baremaps/stream/SupplierUtils.java`
#### Snippet
```java
   * @return the memoized supplier
   */
  public static <T> Supplier<T> memoize(Supplier<T> supplier, int timeToLiveMillis) {
    return new Supplier() {
      long t1 = System.currentTimeMillis();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PostgresQuery`
in `baremaps-core/src/main/java/org/apache/baremaps/database/tile/PostgresTileStore.java`
#### Snippet
```java
   * @return the common table expression
   */
  protected String cte(PostgresGroup group, List<PostgresQuery> queries) {
    String alias = group.getAlias();
    String geom = group.getSelectItems().get(2).toString();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PostgresQuery`
in `baremaps-core/src/main/java/org/apache/baremaps/database/tile/PostgresTileStore.java`
#### Snippet
```java
   * @return the statements
   */
  protected String layerStatements(List<PostgresQuery> queries, String layer) {
    return String.format(STATEMENT_QUERY, layer, queries.stream()
        .map(queryValue -> layerStatement(queryValue)).collect(Collectors.joining(UNION)));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MappedByteBuffer`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/utils/MappedByteBufferUtils.java`
#### Snippet
```java
   * @throws IOException If any error occurs unmapping the segment
   */
  public static void unmap(List<MappedByteBuffer> segments) throws IOException {
    try {
      // attempt to force-unmap the file, so we can delete it later
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Long`
in `baremaps-core/src/main/java/org/apache/baremaps/database/DiffService.java`
#### Snippet
```java

  public DiffService(LongDataMap<Coordinate> coordinates, LongDataMap<List<Long>> references,
      HeaderRepository headerRepository, Repository<Long, Node> nodeRepository,
      Repository<Long, Way> wayRepository, Repository<Long, Relation> relationRepository, int srid,
      int zoom) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Long`
in `baremaps-core/src/main/java/org/apache/baremaps/database/DiffService.java`
#### Snippet
```java
  public DiffService(LongDataMap<Coordinate> coordinates, LongDataMap<List<Long>> references,
      HeaderRepository headerRepository, Repository<Long, Node> nodeRepository,
      Repository<Long, Way> wayRepository, Repository<Long, Relation> relationRepository, int srid,
      int zoom) {
    this.coordinates = coordinates;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Long`
in `baremaps-core/src/main/java/org/apache/baremaps/database/DiffService.java`
#### Snippet
```java
  public DiffService(LongDataMap<Coordinate> coordinates, LongDataMap<List<Long>> references,
      HeaderRepository headerRepository, Repository<Long, Node> nodeRepository,
      Repository<Long, Way> wayRepository, Repository<Long, Relation> relationRepository, int srid,
      int zoom) {
    this.coordinates = coordinates;
```

## RuleId[ruleID=IgnoreResultOfCall]
### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.delete()` is ignored
in `baremaps-core/src/main/java/org/apache/baremaps/collection/utils/FileUtils.java`
#### Snippet
```java
  public static void deleteRecursively(Path path) throws IOException {
    try (Stream<Path> files = Files.walk(path)) {
      files.sorted(Comparator.reverseOrder()).map(Path::toFile).forEach(File::delete);
    }
  }
```

## RuleId[ruleID=AccessStaticViaInstance]
### RuleId[ruleID=AccessStaticViaInstance]
Static member 'java.net.HttpURLConnection.setFollowRedirects(boolean)' accessed via instance reference
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/DownloadUrl.java`
#### Snippet
```java
    if (Files.exists(targetPath) && !replaceExisting) {
      var head = (HttpURLConnection) targetUrl.openConnection();
      head.setFollowRedirects(true);
      head.setRequestMethod("HEAD");
      var contentLength = head.getContentLengthLong();
```

### RuleId[ruleID=AccessStaticViaInstance]
Static member 'java.net.HttpURLConnection.setFollowRedirects(boolean)' accessed via instance reference
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/DownloadUrl.java`
#### Snippet
```java

    var connection = (HttpURLConnection) targetUrl.openConnection();
    connection.setFollowRedirects(true);
    connection.setRequestMethod("GET");
    try (var inputStream = connection.getInputStream()) {
```

## RuleId[ruleID=UNUSED_IMPORT]
### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.io.IOException;`
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/ExecuteCommand.java`
#### Snippet
```java

import org.apache.baremaps.workflow.Task;
import java.io.IOException;

import org.apache.baremaps.workflow.WorkflowContext;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.util.List;`
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/ExportVectorTiles.java`
#### Snippet
```java
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.nio.file.StandardCopyOption;`
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/UnzipFile.java`
#### Snippet
```java
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.Enumeration;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.util.Enumeration;`
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/UnzipFile.java`
#### Snippet
```java
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.util.zip.ZipEntry;`
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/UnzipFile.java`
#### Snippet
```java
import java.nio.file.StandardOpenOption;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import java.util.zip.ZipInputStream;`
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/UnzipFile.java`
#### Snippet
```java
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

import org.slf4j.Logger;
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`segmentIndex = segmentIndex + 1` could be simplified to 'segmentIndex += 1'
in `baremaps-core/src/main/java/org/apache/baremaps/collection/DataStore.java`
#### Snippet
```java
    if (segmentOffset + valueSize > segmentSize) {
      segmentOffset = 0;
      segmentIndex = segmentIndex + 1;
      position = segmentIndex * segmentSize;
    }
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`nid = nid + way.getRefs(index)` could be simplified to 'nid += way.getRefs(index)'
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/pbf/DataBlockReader.java`
#### Snippet
```java
        List<Long> nodes = new ArrayList<>();
        for (int index = 0; index < way.getRefsCount(); index++) {
          nid = nid + way.getRefs(index);
          nodes.add(nid);
        }
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`mid = mid + relation.getMemids(j)` could be simplified to 'mid += relation.getMemids(j)'
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/pbf/DataBlockReader.java`
#### Snippet
```java
        List<Member> members = new ArrayList<>();
        for (int j = 0; j < relation.getMemidsCount(); j++) {
          mid = mid + relation.getMemids(j);
          String role = getString(relation.getRolesSid(j));
          Member.MemberType type = type(relation.getTypes(j));
```

## RuleId[ruleID=NestedAssignment]
### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `baremaps-server/src/main/java/org/apache/baremaps/server/DirectoryWatcher.java`
#### Snippet
```java
      }
      WatchKey key;
      while ((key = watchService.take()) != null) {
        Path dir = (Path) key.watchable();
        for (WatchEvent<?> event : key.pollEvents()) {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/UnzipFile.java`
#### Snippet
```java
          long totalSizeEntry = 0;

          while ((nBytes = input.read(buffer)) > 0) {
            output.write(buffer, 0, nBytes);
            totalSizeEntry += nBytes;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `baremaps-core/src/main/java/org/apache/baremaps/iploc/nic/NicSpliterator.java`
#### Snippet
```java

    boolean tryAdvance;
    while ((tryAdvance = lineSpliterator.tryAdvance(this::acceptLine)) && !"".equals(line)) {
      // handle multiline values
      if (line.startsWith(" ")) {
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### RuleId[ruleID=MismatchedCollectionQueryUpdate]
Contents of collection `recordsLengths` are updated, but never queried
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileByteReader.java`
#### Snippet
```java

  /** Shapefile records lengths (loaded from .SHX file, if any found). */
  private ArrayList<Integer> recordsLengths;

  /** JTS geometry factory. */
```

## RuleId[ruleID=UseOfPropertiesAsHashtable]
### RuleId[ruleID=UseOfPropertiesAsHashtable]
Call to `Hashtable.get()` on properties object
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DbaseByteReader.java`
#### Snippet
```java
      // Sometimes, DBF files have a wrong charset, or more often : none, and you have to specify
      // it.
      String recordCharset = (String) this.info.get("record_charset");

      if (recordCharset != null) {
```

## RuleId[ruleID=RedundantFieldInitialization]
### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/map/Export.java`
#### Snippet
```java
  @Option(names = {"--batch-array-index"}, paramLabel = "READER",
      description = "The index of the batch in the array.")
  private int batchArrayIndex = 0;

  @Option(names = {"--mbtiles"}, paramLabel = "MBTILES",
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/map/Export.java`
#### Snippet
```java
  @Option(names = {"--mbtiles"}, paramLabel = "MBTILES",
      description = "The repository is in the MBTiles format.")
  private boolean mbtiles = false;

  @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/CommonByteReader.java`
#### Snippet
```java

  /** Indicates if the byte buffer is closed. */
  private boolean isClosed = false;

  /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `baremaps-core/src/main/java/org/apache/baremaps/stream/BufferedSpliterator.java`
#### Snippet
```java
  private final BlockingQueue<CompletableFuture<T>> buffer;

  private int pending = 0;

  /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/pbf/PbfBlockReader.java`
#### Snippet
```java
  private int buffer = Runtime.getRuntime().availableProcessors();

  private boolean geometry = false;

  private int srid = 4326;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/progress/InputStreamProgress.java`
#### Snippet
```java
  private final Consumer<Long> listener;

  private long position = 0;

  /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `baremaps-core/src/main/java/org/apache/baremaps/iploc/data/IpLocStats.java`
#### Snippet
```java
  private int insertedByCountryCount = 0;
  private int insertedByGeolocCount = 0;
  private int notInsertedCount = 0;
  private int insertedByCountryCodeCount = 0;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `baremaps-core/src/main/java/org/apache/baremaps/iploc/data/IpLocStats.java`
#### Snippet
```java
  private int insertedByAddressCount = 0;
  private int insertedByDescrCount = 0;
  private int insertedByCountryCount = 0;
  private int insertedByGeolocCount = 0;
  private int notInsertedCount = 0;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `baremaps-core/src/main/java/org/apache/baremaps/iploc/data/IpLocStats.java`
#### Snippet
```java
  private int insertedByGeolocCount = 0;
  private int notInsertedCount = 0;
  private int insertedByCountryCodeCount = 0;

  public IpLocStats() {}
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `baremaps-core/src/main/java/org/apache/baremaps/iploc/data/IpLocStats.java`
#### Snippet
```java
  private int insertedByDescrCount = 0;
  private int insertedByCountryCount = 0;
  private int insertedByGeolocCount = 0;
  private int notInsertedCount = 0;
  private int insertedByCountryCodeCount = 0;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `baremaps-core/src/main/java/org/apache/baremaps/iploc/data/IpLocStats.java`
#### Snippet
```java
public class IpLocStats {
  private int insertedByAddressCount = 0;
  private int insertedByDescrCount = 0;
  private int insertedByCountryCount = 0;
  private int insertedByGeolocCount = 0;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `baremaps-core/src/main/java/org/apache/baremaps/iploc/data/IpLocStats.java`
#### Snippet
```java
/** Store stats related to the geneation of the IpLoc database from the RIR's files */
public class IpLocStats {
  private int insertedByAddressCount = 0;
  private int insertedByDescrCount = 0;
  private int insertedByCountryCount = 0;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `baremaps-core/src/main/java/org/apache/baremaps/collection/LongSizedDataSparseMap.java`
#### Snippet
```java
  private final AlignedDataList<T> values;
  private int lastChunk = -1;
  private int lastOffset = 0;

  /**
```

## RuleId[ruleID=RedundantImplements]
### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `AutoCloseable`
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DbaseByteReader.java`
#### Snippet
```java
 * @author Marc Le Bihan
 */
public class DbaseByteReader extends CommonByteReader implements AutoCloseable {

  /** First data record position, in bytes. */
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/UnzipFile.java`
#### Snippet
```java

        Files.createDirectories(file.getParent());
        Files.write(file, new byte[]{}, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

        try(var input = new BufferedInputStream(zipFile.getInputStream(ze));
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/function/CreateGeometryConsumer.java`
#### Snippet
```java
      } else if (polygons.size() > 1) {
        MultiPolygon multiPolygon =
            geometryFactory.createMultiPolygon(polygons.toArray(new Polygon[0]));
        relation.setGeometry(multiPolygon);
      }
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/function/CreateGeometryConsumer.java`
#### Snippet
```java
        }
      }
      Polygon polygon = geometryFactory.createPolygon(shell, holes.toArray(new LinearRing[0]));
      polygons.add(polygon);
    }
```

## RuleId[ruleID=NullArgumentToVariableArgMethod]
### RuleId[ruleID=NullArgumentToVariableArgMethod]
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `baremaps-core/src/main/java/org/apache/baremaps/database/tile/PostgresQueryGenerator.java`
#### Snippet
```java
   */
  public PostgresQueryGenerator(DataSource dataSource) {
    this(dataSource, null, null, null, null, null);
  }

```

## RuleId[ruleID=UnusedAssignment]
### RuleId[ruleID=UnusedAssignment]
Variable `nBytes` initializer `-1` is redundant
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/UnzipFile.java`
#### Snippet
```java
          totalEntryArchive++;

          int nBytes = -1;
          byte[] buffer = new byte[4096];
          long totalSizeEntry = 0;
```

## RuleId[ruleID=OptionalGetWithoutIsPresent]
### RuleId[ruleID=OptionalGetWithoutIsPresent]
`OptionalInt.getAsInt()` without 'isPresent()' check
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/ExportVectorTiles.java`
#### Snippet
```java
            map.put(
              "minzoom",
              layer.getQueries().stream().mapToInt(TilesetQuery::getMinzoom).min().getAsInt()
            );
            map.put(
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`OptionalInt.getAsInt()` without 'isPresent()' check
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/ExportVectorTiles.java`
#### Snippet
```java
            map.put(
              "maxzoom",
              layer.getQueries().stream().mapToInt(TilesetQuery::getMaxzoom).max().getAsInt()
            );
            return map;
```

## RuleId[ruleID=ConstantValue]
### RuleId[ruleID=ConstantValue]
Value `dbfSuffix` is always 'null'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileReader.java`
#### Snippet
```java

    String dbfSuffix = null;
    dbfSuffix = shapefile.endsWith("shp") ? "dbf" : dbfSuffix;
    dbfSuffix = shapefile.endsWith("SHP") ? "DBF" : dbfSuffix;
    dbfSuffix = shapefile.endsWith("Shp") ? "Dbf" : dbfSuffix;
```

### RuleId[ruleID=ConstantValue]
Value `shapeFileIndexSuffix` is always 'null'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileReader.java`
#### Snippet
```java

    String shapeFileIndexSuffix = null;
    shapeFileIndexSuffix = shapefile.endsWith("shp") ? "shx" : shapeFileIndexSuffix;
    shapeFileIndexSuffix = shapefile.endsWith("SHP") ? "SHX" : shapeFileIndexSuffix;
    shapeFileIndexSuffix = shapefile.endsWith("Shp") ? "Shx" : shapeFileIndexSuffix;
```

### RuleId[ruleID=ConstantValue]
Condition `s != -1` is always `true`
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/progress/InputStreamProgress.java`
#### Snippet
```java
  public long skip(long n) throws IOException {
    long s = super.skip(n);
    if (s != -1) {
      position += s;
      listener.accept(position);
```

## RuleId[ruleID=FieldMayBeStatic]
### RuleId[ruleID=FieldMayBeStatic]
Field `SCORE_THRESHOLD` may be 'static'
in `baremaps-core/src/main/java/org/apache/baremaps/iploc/IpLoc.java`
#### Snippet
```java
public class IpLoc {

  private final float SCORE_THRESHOLD = 0.1f;

  private final InetnumLocationDao inetnumLocationDao;
```

### RuleId[ruleID=FieldMayBeStatic]
Field `VARY` may be 'static'
in `baremaps-server/src/main/java/org/apache/baremaps/server/CorsFilter.java`
#### Snippet
```java
  private final String ACCESS_CONTROL_EXPOSE_HEADERS = "Access-Control-Expose-Headers";
  private final String ORIGIN = "Origin";
  private final String VARY = "Vary";

  @Override
```

### RuleId[ruleID=FieldMayBeStatic]
Field `ACCESS_CONTROL_EXPOSE_HEADERS` may be 'static'
in `baremaps-server/src/main/java/org/apache/baremaps/server/CorsFilter.java`
#### Snippet
```java
  private final String ACCESS_CONTROL_ALLOW_METHODS = "Access-Control-Allow-Methods";
  private final String ACCESS_CONTROL_ALLOW_HEADERS = "Access-Control-Allow-Headers";
  private final String ACCESS_CONTROL_EXPOSE_HEADERS = "Access-Control-Expose-Headers";
  private final String ORIGIN = "Origin";
  private final String VARY = "Vary";
```

### RuleId[ruleID=FieldMayBeStatic]
Field `ACCESS_CONTROL_ALLOW_METHODS` may be 'static'
in `baremaps-server/src/main/java/org/apache/baremaps/server/CorsFilter.java`
#### Snippet
```java
  private final String ACCESS_CONTROL_ALLOW_ORIGIN = "Access-Control-Allow-Origin";
  private final String ACCESS_CONTROL_ALLOW_CREDENTIALS = "Access-Control-Allow-Credentials";
  private final String ACCESS_CONTROL_ALLOW_METHODS = "Access-Control-Allow-Methods";
  private final String ACCESS_CONTROL_ALLOW_HEADERS = "Access-Control-Allow-Headers";
  private final String ACCESS_CONTROL_EXPOSE_HEADERS = "Access-Control-Expose-Headers";
```

### RuleId[ruleID=FieldMayBeStatic]
Field `ACCESS_CONTROL_ALLOW_HEADERS` may be 'static'
in `baremaps-server/src/main/java/org/apache/baremaps/server/CorsFilter.java`
#### Snippet
```java
  private final String ACCESS_CONTROL_ALLOW_CREDENTIALS = "Access-Control-Allow-Credentials";
  private final String ACCESS_CONTROL_ALLOW_METHODS = "Access-Control-Allow-Methods";
  private final String ACCESS_CONTROL_ALLOW_HEADERS = "Access-Control-Allow-Headers";
  private final String ACCESS_CONTROL_EXPOSE_HEADERS = "Access-Control-Expose-Headers";
  private final String ORIGIN = "Origin";
```

### RuleId[ruleID=FieldMayBeStatic]
Field `ACCESS_CONTROL_ALLOW_ORIGIN` may be 'static'
in `baremaps-server/src/main/java/org/apache/baremaps/server/CorsFilter.java`
#### Snippet
```java
public class CorsFilter implements ContainerRequestFilter, ContainerResponseFilter {

  private final String ACCESS_CONTROL_ALLOW_ORIGIN = "Access-Control-Allow-Origin";
  private final String ACCESS_CONTROL_ALLOW_CREDENTIALS = "Access-Control-Allow-Credentials";
  private final String ACCESS_CONTROL_ALLOW_METHODS = "Access-Control-Allow-Methods";
```

### RuleId[ruleID=FieldMayBeStatic]
Field `ORIGIN` may be 'static'
in `baremaps-server/src/main/java/org/apache/baremaps/server/CorsFilter.java`
#### Snippet
```java
  private final String ACCESS_CONTROL_ALLOW_HEADERS = "Access-Control-Allow-Headers";
  private final String ACCESS_CONTROL_EXPOSE_HEADERS = "Access-Control-Expose-Headers";
  private final String ORIGIN = "Origin";
  private final String VARY = "Vary";

```

### RuleId[ruleID=FieldMayBeStatic]
Field `ACCESS_CONTROL_ALLOW_CREDENTIALS` may be 'static'
in `baremaps-server/src/main/java/org/apache/baremaps/server/CorsFilter.java`
#### Snippet
```java

  private final String ACCESS_CONTROL_ALLOW_ORIGIN = "Access-Control-Allow-Origin";
  private final String ACCESS_CONTROL_ALLOW_CREDENTIALS = "Access-Control-Allow-Credentials";
  private final String ACCESS_CONTROL_ALLOW_METHODS = "Access-Control-Allow-Methods";
  private final String ACCESS_CONTROL_ALLOW_HEADERS = "Access-Control-Allow-Headers";
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `FileUtils` has only 'static' members, and lacks a 'private' constructor
in `baremaps-core/src/main/java/org/apache/baremaps/collection/utils/FileUtils.java`
#### Snippet
```java
import java.util.stream.Stream;

public class FileUtils {

  public static void deleteRecursively(Path path) throws IOException {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `BenchmarkRunner` has only 'static' members, and lacks a 'private' constructor
in `baremaps-benchmark/src/main/java/org/apache/baremaps/benchmarks/BenchmarkRunner.java`
#### Snippet
```java
import java.io.IOException;

public class BenchmarkRunner {

  public static void main(String[] args) throws IOException {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `DefaultObjectMapper` has only 'static' members, and lacks a 'private' constructor
in `baremaps-server/src/main/java/org/apache/baremaps/server/DefaultObjectMapper.java`
#### Snippet
```java
import com.fasterxml.jackson.databind.ObjectMapper;

public class DefaultObjectMapper {

  public static ObjectMapper defaultObjectMapper() {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `StreamUtils` has only 'static' members, and lacks a 'private' constructor
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java

/** Utility methods for creating parallel, buffered and batched streams of unknown size. */
public class StreamUtils {

  /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `SqliteUtils` has only 'static' members, and lacks a 'private' constructor
in `baremaps-core/src/main/java/org/apache/baremaps/iploc/database/SqliteUtils.java`
#### Snippet
```java

/** A helper class for creating executing sql scripts onto a SQLite database */
public final class SqliteUtils {

  /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `OsmReaders` has only 'static' members, and lacks a 'private' constructor
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/OsmReaders.java`
#### Snippet
```java

/** Utility methods for creating OpenStreetMap parsers. */
public class OsmReaders {

  public static StateReader state() {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ExternalMergeSort` has only 'static' members, and lacks a 'private' constructor
in `baremaps-core/src/main/java/org/apache/baremaps/collection/sort/ExternalMergeSort.java`
#### Snippet
```java
 * domain).
 */
public class ExternalMergeSort {

  /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `MappedByteBufferUtils` has only 'static' members, and lacks a 'private' constructor
in `baremaps-core/src/main/java/org/apache/baremaps/collection/utils/MappedByteBufferUtils.java`
#### Snippet
```java

/** Utilities for working with memory-mapped files. */
public class MappedByteBufferUtils {

  /**
```

## RuleId[ruleID=UnnecessarySemicolon]
### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `baremaps-core/src/main/java/org/apache/baremaps/iploc/database/InetnumLocationDaoSqliteImpl.java`
#### Snippet
```java
  public void save(List<InetnumLocation> inetnumLocations) {
    try (Connection connection = getWriteConnection();
        PreparedStatement stmt = connection.prepareStatement(INSERT_SQL);) {
      connection.setAutoCommit(false);
      for (InetnumLocation inetnumLocation : inetnumLocations) {
```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `baremaps-core/src/main/java/org/apache/baremaps/iploc/database/InetnumLocationDaoSqliteImpl.java`
#### Snippet
```java
      stmt.setBytes(1, ip);
      stmt.setBytes(2, ip);
      try (ResultSet rs = stmt.executeQuery();) {
        while (rs.next()) {
          results.add(new InetnumLocation(rs.getString("address"),
```

## RuleId[ruleID=DataFlowIssue]
### RuleId[ruleID=DataFlowIssue]
Method invocation `readAllBytes` may produce `NullPointerException`
in `baremaps-server/src/main/java/org/apache/baremaps/server/ServerResources.java`
#### Snippet
```java
    path = String.format("server/%s", path);
    try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(path)) {
      var bytes = inputStream.readAllBytes();
      return Response.ok().entity(bytes).build();
    } catch (IOException e) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `readAllBytes` may produce `NullPointerException`
in `baremaps-server/src/main/java/org/apache/baremaps/server/DevResources.java`
#### Snippet
```java
    path = String.format("viewer/%s", path);
    try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(path)) {
      var bytes = inputStream.readAllBytes();
      return Response.ok().entity(bytes).build();
    } catch (IOException e) {
```

### RuleId[ruleID=DataFlowIssue]
Switch label `"OSMHeader"` is unreachable
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/pbf/PbfBlockReader.java`
#### Snippet
```java
  public Block read(Blob blob) {
    switch (blob.header().getType()) {
      case "OSMHeader":
        return HeaderBlockReader.read(blob);
      case "OSMData":
```

### RuleId[ruleID=DataFlowIssue]
Switch label `"OSMData"` is unreachable
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/pbf/PbfBlockReader.java`
#### Snippet
```java
      case "OSMHeader":
        return HeaderBlockReader.read(blob);
      case "OSMData":
        return DataBlockReader.read(blob);
      default:
```

### RuleId[ruleID=DataFlowIssue]
Unboxing of `Ints.tryParse(versionValue)` may produce `NullPointerException`
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlEntitySpliterator.java`
#### Snippet
```java
  private Info readInfo() {
    String versionValue = reader.getAttributeValue(null, ATTRIBUTE_NAME_VERSION);
    int version = versionValue != null ? Ints.tryParse(versionValue) : 0;
    String timestampValue = reader.getAttributeValue(null, ATTRIBUTE_NAME_TIMESTAMP);
    LocalDateTime timestamp =
```

### RuleId[ruleID=DataFlowIssue]
Unboxing of `Longs.tryParse(changesetValue)` may produce `NullPointerException`
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlEntitySpliterator.java`
#### Snippet
```java
        timestampValue != null ? LocalDateTime.parse(timestampValue, format) : null;
    String changesetValue = reader.getAttributeValue(null, ATTRIBUTE_NAME_CHANGESET_ID);
    long changeset = changesetValue != null ? Longs.tryParse(changesetValue) : -1;
    String uidValue = reader.getAttributeValue(null, ATTRIBUTE_NAME_USER_ID);
    int uid = uidValue != null && Ints.tryParse(uidValue) != null ? Ints.tryParse(uidValue) : -1;
```

### RuleId[ruleID=DataFlowIssue]
Unboxing of `Ints.tryParse(uidValue)` may produce `NullPointerException`
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlEntitySpliterator.java`
#### Snippet
```java
    long changeset = changesetValue != null ? Longs.tryParse(changesetValue) : -1;
    String uidValue = reader.getAttributeValue(null, ATTRIBUTE_NAME_USER_ID);
    int uid = uidValue != null && Ints.tryParse(uidValue) != null ? Ints.tryParse(uidValue) : -1;
    return new Info(version, timestamp, changeset, uid);
  }
```

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/ExecuteSql.java`
#### Snippet
```java
    var queries = Arrays.stream(Files.readString(Paths.get(file)).split(";"));
    if (parallel) {
      queries = queries.parallel();
    }
    queries.forEach(
```

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `baremaps-core/src/main/java/org/apache/baremaps/collection/sort/ExternalMergeSort.java`
#### Snippet
```java
    Stream<T> tmpStream = batch.stream().sorted(comparator);
    if (parallel) {
      tmpStream = tmpStream.parallel();
    }
    if (distinct) {
```

## RuleId[ruleID=SimplifyStreamApiCallChains]
### RuleId[ruleID=SimplifyStreamApiCallChains]
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/function/CreateGeometryConsumer.java`
#### Snippet
```java
          }
        });
    lineMerger.getMergedLineStrings().stream().forEach(geometry -> {
      LineString line = (LineString) geometry;
      if (line.isClosed()) {
```

### RuleId[ruleID=SimplifyStreamApiCallChains]
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/store/DataStoreConsumer.java`
#### Snippet
```java
  @Override
  public void match(DataBlock dataBlock) throws Exception {
    dataBlock.getDenseNodes().stream().forEach(
        node -> coordinates.put(node.getId(), new Coordinate(node.getLon(), node.getLat())));
    dataBlock.getNodes().stream().forEach(
```

### RuleId[ruleID=SimplifyStreamApiCallChains]
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/store/DataStoreConsumer.java`
#### Snippet
```java
    dataBlock.getDenseNodes().stream().forEach(
        node -> coordinates.put(node.getId(), new Coordinate(node.getLon(), node.getLat())));
    dataBlock.getNodes().stream().forEach(
        node -> coordinates.put(node.getId(), new Coordinate(node.getLon(), node.getLat())));
    dataBlock.getWays().stream().forEach(way -> references.put(way.getId(), way.getNodes()));
```

### RuleId[ruleID=SimplifyStreamApiCallChains]
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/store/DataStoreConsumer.java`
#### Snippet
```java
    dataBlock.getNodes().stream().forEach(
        node -> coordinates.put(node.getId(), new Coordinate(node.getLon(), node.getLat())));
    dataBlock.getWays().stream().forEach(way -> references.put(way.getId(), way.getNodes()));
  }
}
```

## RuleId[ruleID=Convert2MethodRef]
### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/ShapefileDirectory.java`
#### Snippet
```java
    try (var list = Files.list(directory)) {
      return list.filter(file -> file.toString().toLowerCase().endsWith(".shp"))
          .map(file -> new ShapefileFeatureSet(file)).collect(Collectors.toList());
    } catch (IOException e) {
      throw new DataStoreException(e);
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/ShapefileFeatureSet.java`
#### Snippet
```java
      var input = shapeFile.read();
      return StreamSupport.stream(new FeatureSpliterator(shapeFile.read()), false)
          .onClose(() -> input.close());
    } catch (Exception e) {
      throw new DataStoreException(e);
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileByteReader.java`
#### Snippet
```java
    // Compute the difference between shells and holes
    var shellsMultiPolygon =
        geometryFactory.createMultiPolygon(shells.toArray(size -> new Polygon[size]));
    var holesMultiPolygon =
        geometryFactory.createMultiPolygon(holes.toArray(size -> new Polygon[size]));
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileByteReader.java`
#### Snippet
```java
        geometryFactory.createMultiPolygon(shells.toArray(size -> new Polygon[size]));
    var holesMultiPolygon =
        geometryFactory.createMultiPolygon(holes.toArray(size -> new Polygon[size]));
    return shellsMultiPolygon.difference(holesMultiPolygon);
  }
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowExecutor.java`
#### Snippet
```java
    this.executorService = executorService;
    this.context = new WorkflowContext();
    this.steps = workflow.getSteps().stream().collect(Collectors.toMap(s -> s.getId(), s -> s));
    this.futures = new ConcurrentHashMap<>();

```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowContext.java`
#### Snippet
```java
   */
  public DataSource getDataSource(String database) {
    return dataSources.computeIfAbsent(database, d -> PostgresUtils.dataSource(d));
  }

```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `baremaps-core/src/main/java/org/apache/baremaps/database/tile/PostgresTileStore.java`
#### Snippet
```java
  protected String layerStatements(List<PostgresQuery> queries, String layer) {
    return String.format(STATEMENT_QUERY, layer, queries.stream()
        .map(queryValue -> layerStatement(queryValue)).collect(Collectors.joining(UNION)));
  }

```

## RuleId[ruleID=ObviousNullCheck]
### RuleId[ruleID=ObviousNullCheck]
Redundant null-check: a value of primitive type 'byte' is never null
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DbaseByteReader.java`
#### Snippet
```java
    }

    Objects.requireNonNull(yymmdd[0], "the year byte cannot be null");
    Objects.requireNonNull(yymmdd[1], "the month byte cannot be null");
    Objects.requireNonNull(yymmdd[2], "the day byte cannot be null");
```

### RuleId[ruleID=ObviousNullCheck]
Redundant null-check: a value of primitive type 'byte' is never null
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DbaseByteReader.java`
#### Snippet
```java

    Objects.requireNonNull(yymmdd[0], "the year byte cannot be null");
    Objects.requireNonNull(yymmdd[1], "the month byte cannot be null");
    Objects.requireNonNull(yymmdd[2], "the day byte cannot be null");

```

### RuleId[ruleID=ObviousNullCheck]
Redundant null-check: a value of primitive type 'byte' is never null
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DbaseByteReader.java`
#### Snippet
```java
    Objects.requireNonNull(yymmdd[0], "the year byte cannot be null");
    Objects.requireNonNull(yymmdd[1], "the month byte cannot be null");
    Objects.requireNonNull(yymmdd[2], "the day byte cannot be null");

    int year = yymmdd[0] < 70 ? 100 + yymmdd[0] : yymmdd[0];
```

## RuleId[ruleID=PatternVariableCanBeUsed]
### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'header' can be replaced with pattern variable
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/model/Header.java`
#### Snippet
```java
      return false;
    }
    Header header = (Header) o;
    return Objects.equals(replicationTimestamp, header.replicationTimestamp)
        && Objects.equals(replicationSequenceNumber, header.replicationSequenceNumber)
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'info' can be replaced with pattern variable
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/model/Info.java`
#### Snippet
```java
      return false;
    }
    Info info = (Info) o;
    return version == info.version && changeset == info.changeset && uid == info.uid
        && Objects.equals(timestamp, info.timestamp);
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'pair' can be replaced with pattern variable
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/PairDataType.java`
#### Snippet
```java
      }

      Pair<?, ?> pair = (Pair<?, ?>) o;

      if (!Objects.equals(left, pair.left)) {
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'element' can be replaced with pattern variable
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/model/Element.java`
#### Snippet
```java
      return false;
    }
    Element element = (Element) o;
    return id == element.id && Objects.equals(info, element.info)
        && Objects.equals(tags, element.tags) && Objects.equals(geometry, element.geometry);
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'way' can be replaced with pattern variable
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/model/Way.java`
#### Snippet
```java
      return false;
    }
    Way way = (Way) o;
    return Objects.equals(nodes, way.nodes);
  }
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'bound' can be replaced with pattern variable
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/model/Bound.java`
#### Snippet
```java
      return false;
    }
    Bound bound = (Bound) o;
    return Double.compare(bound.maxLat, maxLat) == 0 && Double.compare(bound.maxLon, maxLon) == 0
        && Double.compare(bound.minLat, minLat) == 0 && Double.compare(bound.minLon, minLon) == 0;
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'relation' can be replaced with pattern variable
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/model/Relation.java`
#### Snippet
```java
      return false;
    }
    Relation relation = (Relation) o;
    return Objects.equals(members, relation.members);
  }
```

### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'node' can be replaced with pattern variable
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/model/Node.java`
#### Snippet
```java
      return false;
    }
    Node node = (Node) o;
    return Double.compare(node.lon, lon) == 0 && Double.compare(node.lat, lat) == 0;
  }
```

## RuleId[ruleID=AbstractMethodCallInConstructor]
### RuleId[ruleID=AbstractMethodCallInConstructor]
Call to 'abstract' method `analyzer()` during object construction
in `baremaps-core/src/main/java/org/apache/baremaps/geocoder/Geocoder.java`
#### Snippet
```java
  private final Directory directory;
  private SearcherManager searcherManager;
  private Analyzer analyzer = analyzer();

  public Geocoder(Path index) throws IOException {
```

## RuleId[ruleID=CatchMayIgnoreException]
### RuleId[ruleID=CatchMayIgnoreException]
Empty `catch` block
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileByteReader.java`
#### Snippet
```java
        try {
          databaseReader.close();
        } catch (IOException e) {
        }
      }
```

## RuleId[ruleID=ProtectedMemberInFinalClass]
### RuleId[ruleID=ProtectedMemberInFinalClass]
Class member declared `protected` in 'final' class
in `baremaps-core/src/main/java/org/apache/baremaps/database/tile/Tile.java`
#### Snippet
```java
  }

  protected static Tile min(Envelope envelope, int zoom) {
    return Tile.fromLonLat(envelope.getMinX(), envelope.getMaxY(), zoom);
  }
```

### RuleId[ruleID=ProtectedMemberInFinalClass]
Class member declared `protected` in 'final' class
in `baremaps-core/src/main/java/org/apache/baremaps/database/tile/Tile.java`
#### Snippet
```java
  }

  protected static Tile max(Envelope envelope, int zoom) {
    return Tile.fromLonLat(envelope.getMaxX() - EPSILON, envelope.getMinY() + EPSILON, zoom);
  }
```

### RuleId[ruleID=ProtectedMemberInFinalClass]
Class member declared `protected` in 'final' class
in `baremaps-core/src/main/java/org/apache/baremaps/database/tile/Tile.java`
#### Snippet
```java
  }

  protected static double tile2lat(int y, int z) {
    double n = Math.PI - (2.0 * Math.PI * y) / Math.pow(2.0, z);
    return Math.toDegrees(Math.atan(Math.sinh(n)));
```

### RuleId[ruleID=ProtectedMemberInFinalClass]
Class member declared `protected` in 'final' class
in `baremaps-core/src/main/java/org/apache/baremaps/database/tile/Tile.java`
#### Snippet
```java
  }

  protected static double tile2lon(int x, int z) {
    return x / Math.pow(2.0, z) * 360.0 - 180;
  }
```

## RuleId[ruleID=EnhancedSwitchMigration]
### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileByteReader.java`
#### Snippet
```java
    }

    switch (type) {
      case Point:
        loadPointFeature(feature);
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/database/SaveChangeConsumer.java`
#### Snippet
```java
        @Override
        public void match(Relation relation) throws Exception {
          switch (change.getType()) {
            case CREATE:
            case MODIFY:
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/database/SaveChangeConsumer.java`
#### Snippet
```java
        @Override
        public void match(Node node) throws Exception {
          switch (change.getType()) {
            case CREATE:
            case MODIFY:
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/database/SaveChangeConsumer.java`
#### Snippet
```java
        @Override
        public void match(Way way) throws Exception {
          switch (change.getType()) {
            case CREATE:
            case MODIFY:
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/pbf/PbfBlockReader.java`
#### Snippet
```java

  public Block read(Blob blob) {
    switch (blob.header().getType()) {
      case "OSMHeader":
        return HeaderBlockReader.read(blob);
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/model/Member.java`
#### Snippet
```java

    public static MemberType forNumber(int value) {
      switch (value) {
        case 0:
          return NODE;
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlChangeSpliterator.java`
#### Snippet
```java

  private Element readElement() throws XMLStreamException {
    switch (reader.getLocalName()) {
      case ELEMENT_NAME_NODE:
        return readNode();
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlChangeSpliterator.java`
#### Snippet
```java
    reader.nextTag();
    while (reader.getEventType() == XMLStreamConstants.START_ELEMENT) {
      switch (reader.getLocalName()) {
        case ELEMENT_NAME_TAG:
          readTag(tags);
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlChangeSpliterator.java`
#### Snippet
```java
    reader.nextTag();
    while (reader.getEventType() == XMLStreamConstants.START_ELEMENT) {
      switch (reader.getLocalName()) {
        case ELEMENT_NAME_TAG:
          readTag(tags);
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlChangeSpliterator.java`
#### Snippet
```java
    reader.nextTag();
    while (reader.getEventType() == XMLStreamConstants.START_ELEMENT) {
      switch (reader.getLocalName()) {
        case ELEMENT_NAME_TAG:
          readTag(tags);
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlChangeSpliterator.java`
#### Snippet
```java
      if (reader.hasNext()) {
        int event = reader.next();
        switch (event) {
          case START_ELEMENT:
            if (ELEMENT_NAME_OSMCHANGE.equals(reader.getLocalName())) {
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlChangeSpliterator.java`
#### Snippet
```java

  private Change readChange() throws XMLStreamException {
    switch (reader.getLocalName()) {
      case ELEMENT_NAME_CREATE:
      case ELEMENT_NAME_DELETE:
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlEntitySpliterator.java`
#### Snippet
```java
    reader.nextTag();
    while (reader.getEventType() == XMLStreamConstants.START_ELEMENT) {
      switch (reader.getLocalName()) {
        case ELEMENT_NAME_TAG:
          readTag(tags);
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlEntitySpliterator.java`
#### Snippet
```java

  private void readEntity(Consumer<? super Entity> consumer) throws XMLStreamException {
    switch (reader.getLocalName()) {
      case ELEMENT_NAME_OSM:
        consumer.accept(readHeader());
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlEntitySpliterator.java`
#### Snippet
```java
    reader.nextTag();
    while (reader.getEventType() == XMLStreamConstants.START_ELEMENT) {
      switch (reader.getLocalName()) {
        case ELEMENT_NAME_TAG:
          readTag(tags);
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlEntitySpliterator.java`
#### Snippet
```java
    reader.nextTag();
    while (reader.getEventType() == XMLStreamConstants.START_ELEMENT) {
      switch (reader.getLocalName()) {
        case ELEMENT_NAME_TAG:
          readTag(tags);
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlEntitySpliterator.java`
#### Snippet
```java
      if (reader.hasNext()) {
        int event = reader.next();
        switch (event) {
          case START_ELEMENT:
            readEntity(consumer);
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/pbf/DataBlockReader.java`
#### Snippet
```java

  private Member.MemberType type(Osmformat.Relation.MemberType type) {
    switch (type) {
      case NODE:
        return Member.MemberType.NODE;
```

### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/database/DiffService.java`
#### Snippet
```java

  private Stream<Geometry> geometriesForChange(Change change) {
    switch (change.getType()) {
      case CREATE:
        return geometriesForNextVersion(change);
```

## RuleId[ruleID=StringEqualsEmptyString]
### RuleId[ruleID=StringEqualsEmptyString]
`equals("")` can be replaced with 'isEmpty()'
in `baremaps-server/src/main/java/org/apache/baremaps/server/ServerResources.java`
#### Snippet
```java
  @javax.ws.rs.Path("{path:.*}")
  public Response get(@PathParam("path") String path) throws IOException {
    if (path.equals("") || path.endsWith("/")) {
      path += "index.html";
    }
```

### RuleId[ruleID=StringEqualsEmptyString]
`equals("")` can be replaced with 'isEmpty()'
in `baremaps-server/src/main/java/org/apache/baremaps/server/DevResources.java`
#### Snippet
```java
  @javax.ws.rs.Path("{path:.*}")
  public Response get(@PathParam("path") String path) throws IOException {
    if (path.equals("") || path.endsWith("/")) {
      path += "index.html";
    }
```

### RuleId[ruleID=StringEqualsEmptyString]
`equals("")` can be replaced with 'isEmpty()'
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/Baremaps.java`
#### Snippet
```java
        level = arg.substring(12).strip();
      }
      if (!"".equals(level)) {
        LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
        Configuration config = ctx.getConfiguration();
```

## RuleId[ruleID=SystemOutErr]
### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/map/Map.java`
#### Snippet
```java
  @Override
  public void run() {
    CommandLine.usage(this, System.out);
  }
}
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/iploc/IpLoc.java`
#### Snippet
```java
  @Override
  public void run() {
    CommandLine.usage(this, System.out);
  }
}
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/geocoder/Geocoder.java`
#### Snippet
```java
  @Override
  public void run() {
    CommandLine.usage(this, System.out);
  }
}
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/Baremaps.java`
#### Snippet
```java
  @Override
  public Integer call() {
    CommandLine.usage(this, System.out);
    return 0;
  }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/database/Database.java`
#### Snippet
```java
  @Override
  public void run() {
    CommandLine.usage(this, System.out);
  }
}
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/workflow/Workflow.java`
#### Snippet
```java
  @Override
  public void run() {
    CommandLine.usage(this, System.out);
  }
}
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `baremaps-core/src/main/java/org/apache/baremaps/storage/postgres/PostgresDatabase.java`
#### Snippet
```java
  public FeatureType createFeatureType(FeatureType featureType) {
    var featureTypeBuilder = new FeatureTypeBuilder();
    featureTypeBuilder.setName(featureType.getName().toString().replaceAll("[^a-zA-Z0-9]", "_"));
    for (var attribute : featureType.getProperties(false)) {
      if (attribute instanceof AttributeType attributeType
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileDescriptor.java`
#### Snippet
```java
  }

  /** @see java.lang.Object#toString() */
  @Override
  public String toString() {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.openjdk.jmh.runner.options` is unnecessary, and can be replaced with an import
in `baremaps-benchmark/src/main/java/org/apache/baremaps/benchmarks/LongDataMapBenchmark.java`
#### Snippet
```java

  public static void main(String[] args) throws RunnerException {
    org.openjdk.jmh.runner.options.Options opt =
        new OptionsBuilder().include(LongDataMapBenchmark.class.getSimpleName()).forks(1).build();
    new Runner(opt).run();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.nio` is unnecessary and can be removed
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileByteReader.java`
#### Snippet
```java

/**
 * Reader of a Shapefile Binary content by the way of a {@link java.nio.MappedByteBuffer}
 *
 * @author Marc Le Bihan
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.openjdk.jmh` is unnecessary, and can be replaced with an import
in `baremaps-benchmark/src/main/java/org/apache/baremaps/benchmarks/BenchmarkRunner.java`
#### Snippet
```java

  public static void main(String[] args) throws IOException {
    org.openjdk.jmh.Main.main(args);
  }
}
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/InputFeatureStream.java`
#### Snippet
```java
  }

  /** @see java.io.InputStream#close() */
  @Override
  public void close() {}
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/InputFeatureStream.java`
#### Snippet
```java
  }

  /** @see java.io.InputStream#available() */
  @Override
  public int available() {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/InputFeatureStream.java`
#### Snippet
```java
  }

  /** @see java.io.InputStream#read() */
  @Override
  public int read() {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.sqlite` is unnecessary, and can be replaced with an import
in `baremaps-core/src/main/java/org/apache/baremaps/database/tile/MBTiles.java`
#### Snippet
```java
   * @param dataSource the SQLite datasource
   */
  public MBTiles(org.sqlite.SQLiteDataSource dataSource) {
    this.dataSource = dataSource;
  }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.sqlite` is unnecessary, and can be replaced with an import
in `baremaps-core/src/main/java/org/apache/baremaps/database/tile/MBTiles.java`
#### Snippet
```java
  private static final String DELETE_METADATA = "DELETE FROM metadata";

  private final org.sqlite.SQLiteDataSource dataSource;

  /**
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `Geocoder()` of an abstract class should not be declared 'public'
in `baremaps-core/src/main/java/org/apache/baremaps/geocoder/Geocoder.java`
#### Snippet
```java
  private Analyzer analyzer = analyzer();

  public Geocoder(Path index) throws IOException {
    this.directory = MMapDirectory.open(index);
  }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `CommonByteReader()` of an abstract class should not be declared 'public'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/CommonByteReader.java`
#### Snippet
```java
   * @param f File.
   */
  public CommonByteReader(File f) throws IOException {
    Objects.requireNonNull(f, "The file cannot be null.");
    this.file = f;
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `BaseArgumentFactory()` of an abstract class should not be declared 'public'
in `baremaps-ogcapi/src/main/java/org/apache/baremaps/ogcapi/PostgisPlugin.java`
#### Snippet
```java
  abstract static class BaseArgumentFactory<T extends Geometry> extends AbstractArgumentFactory<T> {

    public BaseArgumentFactory() {
      super(Types.OTHER);
    }
```

## RuleId[ruleID=AssignmentToMethodParameter]
### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `path`
in `baremaps-server/src/main/java/org/apache/baremaps/server/ServerResources.java`
#### Snippet
```java
  public Response get(@PathParam("path") String path) throws IOException {
    if (path.equals("") || path.endsWith("/")) {
      path += "index.html";
    }
    path = String.format("server/%s", path);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `path`
in `baremaps-server/src/main/java/org/apache/baremaps/server/ServerResources.java`
#### Snippet
```java
      path += "index.html";
    }
    path = String.format("server/%s", path);
    try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(path)) {
      var bytes = inputStream.readAllBytes();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `path`
in `baremaps-server/src/main/java/org/apache/baremaps/server/DevResources.java`
#### Snippet
```java
  public Response get(@PathParam("path") String path) throws IOException {
    if (path.equals("") || path.endsWith("/")) {
      path += "index.html";
    }
    path = String.format("viewer/%s", path);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `path`
in `baremaps-server/src/main/java/org/apache/baremaps/server/DevResources.java`
#### Snippet
```java
      path += "index.html";
    }
    path = String.format("viewer/%s", path);
    try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(path)) {
      var bytes = inputStream.readAllBytes();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `position`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/ListDataType.java`
#### Snippet
```java
  public List<T> read(ByteBuffer buffer, int position) {
    int size = buffer.getInt(position);
    position += 4;
    List<T> list = new ArrayList<>(size);
    for (int i = 0; i < size; i++) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `position`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/ListDataType.java`
#### Snippet
```java
    for (int i = 0; i < size; i++) {
      T value = dataType.read(buffer, position);
      position += dataType.size(value);
      list.add(value);
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `position`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/ListDataType.java`
#### Snippet
```java
    buffer.putInt(position, values.size());
    for (T value : values) {
      position += dataType.size(value);
      dataType.write(buffer, position, value);
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `position`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/ShortListDataType.java`
#### Snippet
```java
  public List<Short> read(ByteBuffer buffer, int position) {
    int size = buffer.getInt(position);
    position += 4;
    List<Short> list = new ArrayList<>(size);
    for (int i = 0; i < size; i++) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `position`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/ShortListDataType.java`
#### Snippet
```java
    for (int i = 0; i < size; i++) {
      list.add(buffer.getShort(position));
      position += 2;
    }
    return list;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `position`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/ShortListDataType.java`
#### Snippet
```java
  public void write(ByteBuffer buffer, int position, List<Short> values) {
    buffer.putInt(position, values.size());
    position += 4;
    for (Short value : values) {
      buffer.putShort(position, value);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `position`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/ShortListDataType.java`
#### Snippet
```java
    for (Short value : values) {
      buffer.putShort(position, value);
      position += 2;
    }
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `position`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/LongListDataType.java`
#### Snippet
```java
  public void write(ByteBuffer buffer, int position, List<Long> values) {
    buffer.putInt(position, values.size());
    position += Integer.BYTES;
    for (Long value : values) {
      buffer.putLong(position, value);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `position`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/LongListDataType.java`
#### Snippet
```java
    for (Long value : values) {
      buffer.putLong(position, value);
      position += Long.BYTES;
    }
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `position`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/LongListDataType.java`
#### Snippet
```java
  public List<Long> read(ByteBuffer buffer, int position) {
    int size = buffer.getInt(position);
    position += Integer.BYTES;
    List<Long> list = new ArrayList<>(size);
    for (int i = 0; i < size; i++) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `position`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/LongListDataType.java`
#### Snippet
```java
    for (int i = 0; i < size; i++) {
      list.add(buffer.getLong(position));
      position += Long.BYTES;
    }
    return list;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `position`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/DoubleListDataType.java`
#### Snippet
```java
  public List<Double> read(ByteBuffer buffer, int position) {
    int size = buffer.getInt(position);
    position += 4;
    List<Double> list = new ArrayList<>(size);
    for (int i = 0; i < size; i++) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `position`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/DoubleListDataType.java`
#### Snippet
```java
    for (int i = 0; i < size; i++) {
      list.add(buffer.getDouble(position));
      position += 8;
    }
    return list;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `position`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/DoubleListDataType.java`
#### Snippet
```java
  public void write(ByteBuffer buffer, int position, List<Double> values) {
    buffer.putInt(position, values.size());
    position += 4;
    for (Double value : values) {
      buffer.putDouble(position, value);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `position`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/DoubleListDataType.java`
#### Snippet
```java
    for (Double value : values) {
      buffer.putDouble(position, value);
      position += 8;
    }
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `position`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/ByteListDataType.java`
#### Snippet
```java
  public void write(ByteBuffer buffer, int position, List<Byte> values) {
    buffer.putInt(position, values.size());
    position += 4;
    for (Byte value : values) {
      buffer.put(position, value);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `position`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/ByteListDataType.java`
#### Snippet
```java
    for (Byte value : values) {
      buffer.put(position, value);
      position++;
    }
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `position`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/ByteListDataType.java`
#### Snippet
```java
  public List<Byte> read(ByteBuffer buffer, int position) {
    int size = buffer.getInt(position);
    position += 4;
    List<Byte> list = new ArrayList<>(size);
    for (int i = 0; i < size; i++) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `position`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/ByteListDataType.java`
#### Snippet
```java
    for (int i = 0; i < size; i++) {
      list.add(buffer.get(position));
      position++;
    }
    return list;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `template`
in `baremaps-core/src/main/java/org/apache/baremaps/database/tile/VariableUtils.java`
#### Snippet
```java
  public static String interpolate(Map<String, String> variables, String template) {
    for (Entry<String, String> entry : variables.entrySet()) {
      template = template.replace(String.format("$%s", entry.getKey()), entry.getValue());
    }
    return template;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `position`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/FloatListDataType.java`
#### Snippet
```java
  public List<Float> read(ByteBuffer buffer, int position) {
    int size = buffer.getInt(position);
    position += 4;
    List<Float> list = new ArrayList<>(size);
    for (int i = 0; i < size; i++) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `position`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/FloatListDataType.java`
#### Snippet
```java
    for (int i = 0; i < size; i++) {
      list.add(buffer.getFloat(position));
      position += 4;
    }
    return list;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `position`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/FloatListDataType.java`
#### Snippet
```java
  public void write(ByteBuffer buffer, int position, List<Float> values) {
    buffer.putInt(position, values.size());
    position += 4;
    for (Float value : values) {
      buffer.putFloat(position, value);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `position`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/FloatListDataType.java`
#### Snippet
```java
    for (Float value : values) {
      buffer.putFloat(position, value);
      position += 4;
    }
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `position`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/IntegerListDataType.java`
#### Snippet
```java
  public void write(ByteBuffer buffer, int position, List<Integer> values) {
    buffer.putInt(position, values.size());
    position += 4;
    for (Integer value : values) {
      buffer.putInt(position, value);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `position`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/IntegerListDataType.java`
#### Snippet
```java
    for (Integer value : values) {
      buffer.putInt(position, value);
      position += 4;
    }
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `position`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/IntegerListDataType.java`
#### Snippet
```java
  public List<Integer> read(ByteBuffer buffer, int position) {
    int size = buffer.getInt(position);
    position += 4;
    List<Integer> list = new ArrayList<>(size);
    for (int i = 0; i < size; i++) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `position`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/IntegerListDataType.java`
#### Snippet
```java
    for (int i = 0; i < size; i++) {
      list.add(buffer.getInt(position));
      position += 4;
    }
    return list;
```

## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
Return of `null`
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/ShapefileFeatureSet.java`
#### Snippet
```java
    @Override
    public Spliterator<Feature> trySplit() {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `baremaps-core/src/main/java/org/apache/baremaps/storage/postgres/PostgresTable.java`
#### Snippet
```java
  @Override
  public Stream<Feature> features(boolean parallel) throws DataStoreException {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `baremaps-core/src/main/java/org/apache/baremaps/storage/postgres/PostgresTable.java`
#### Snippet
```java
  @Override
  public FeatureType getType() throws DataStoreException {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `baremaps-core/src/main/java/org/apache/baremaps/storage/postgres/PostgresDatabase.java`
#### Snippet
```java
        }

        return null;
      } catch (Exception e) {
        throw new DataStoreException(e);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/InputFeatureStream.java`
#### Snippet
```java
  private AbstractFeature internalReadFeature() throws ShapefileException {
    if (!this.dbaseReader.nextRowAvailable()) {
      return null;
    }
    AbstractFeature feature = (AbstractFeature) this.featuresType.newInstance();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `baremaps-core/src/main/java/org/apache/baremaps/database/collection/PostgresCoordinateMap.java`
#### Snippet
```java
          return new Coordinate(lon, lat);
        } else {
          return null;
        }
      }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `baremaps-core/src/main/java/org/apache/baremaps/stream/BufferedSpliterator.java`
#### Snippet
```java
  @Override
  public Spliterator<CompletableFuture<T>> trySplit() {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `baremaps-core/src/main/java/org/apache/baremaps/database/tile/TileCache.java`
#### Snippet
```java
      } catch (TileStoreException e) {
        logger.error("Unable to read the tile.", e);
        return null;
      }
    });
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/LongSizedDataSortedMap.java`
#### Snippet
```java
    long chunk = key >>> 8;
    if (chunk >= offsets.size()) {
      return null;
    }
    long lo = offsets.get(chunk);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/LongSizedDataSortedMap.java`
#### Snippet
```java
      }
    }
    return null;
  }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `baremaps-core/src/main/java/org/apache/baremaps/iploc/nic/NicSpliterator.java`
#### Snippet
```java

  public Spliterator<NicObject> trySplit() {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/LongDataSortedMap.java`
#### Snippet
```java
    long chunk = key >>> 8;
    if (chunk >= offsets.size()) {
      return null;
    }
    long lo = offsets.get(chunk);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/LongDataSortedMap.java`
#### Snippet
```java
      }
    }
    return null;
  }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `baremaps-core/src/main/java/org/apache/baremaps/database/repository/PostgresNodeRepository.java`
#### Snippet
```java
          return getValue(result);
        } else {
          return null;
        }
      }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/geometry/GeometryUtils.java`
#### Snippet
```java
  public static byte[] serialize(Geometry geometry) {
    if (geometry == null) {
      return null;
    }
    WKBWriter writer = new WKBWriter(2, wkbNDR, true);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/geometry/GeometryUtils.java`
#### Snippet
```java
  public static Geometry deserialize(byte[] wkb) {
    if (wkb == null) {
      return null;
    }
    try {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `baremaps-core/src/main/java/org/apache/baremaps/stream/BatchedSpliterator.java`
#### Snippet
```java
      return Spliterators.spliterator(batch, characteristics());
    } else {
      return null;
    }
  }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlChangeSpliterator.java`
#### Snippet
```java
  @Override
  public Spliterator<Change> trySplit() {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlEntitySpliterator.java`
#### Snippet
```java
  @Override
  public Spliterator<Entity> trySplit() {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `baremaps-core/src/main/java/org/apache/baremaps/database/repository/PostgresHeaderRepository.java`
#### Snippet
```java
          return getValue(result);
        } else {
          return null;
        }
      }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/LongSizedDataSparseMap.java`
#### Snippet
```java
    int offset = (int) (key & 255);
    if (chunk >= offsets.size()) {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `baremaps-core/src/main/java/org/apache/baremaps/collection/LongSizedDataSparseMap.java`
#### Snippet
```java

    if (index > hi || index < lo) {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `baremaps-core/src/main/java/org/apache/baremaps/database/tile/PostgresTileStore.java`
#### Snippet
```java
        return ByteBuffer.wrap(data.toByteArray());
      } else {
        return null;
      }
    } catch (SQLException | IOException e) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `baremaps-core/src/main/java/org/apache/baremaps/database/repository/PostgresRelationRepository.java`
#### Snippet
```java
          return getValue(result);
        } else {
          return null;
        }
      }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `baremaps-core/src/main/java/org/apache/baremaps/storage/geopackage/GeoPackageTable.java`
#### Snippet
```java
    } else {
      // Unknown geometries are discarded
      return null;
    }
  }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `baremaps-core/src/main/java/org/apache/baremaps/database/repository/PostgresWayRepository.java`
#### Snippet
```java
          return getValue(result);
        } else {
          return null;
        }
      }
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `object` is redundant
in `baremaps-server/src/main/java/org/apache/baremaps/server/DevResources.java`
#### Snippet
```java
  public Tileset getTileset() throws IOException {
    var config = configReader.read(tileset);
    var object = objectMapper.readValue(config, Tileset.class);
    return object;
  }
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `object` is redundant
in `baremaps-server/src/main/java/org/apache/baremaps/server/DevResources.java`
#### Snippet
```java
  public Style getStyle() throws IOException {
    var config = configReader.read(style);
    var object = objectMapper.readValue(config, Style.class);
    return object;
  }
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `config` is redundant
in `baremaps-server/src/main/java/org/apache/baremaps/server/ConfigReader.java`
#### Snippet
```java
  public String read(Path path) throws IOException {
    var extension = com.google.common.io.Files.getFileExtension(path.toString());
    var config = switch (extension) {
      case "js" -> eval(path);
      default -> Files.readString(path);
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `recordNumber` is redundant
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DbaseByteReader.java`
#### Snippet
```java
  public int getRowNum() {
    int position = getByteBuffer().position();
    int recordNumber = (position - Short.toUnsignedInt(this.firstRecordPosition))
        / Short.toUnsignedInt(this.recordLength);
    return recordNumber;
```

## RuleId[ruleID=ClassCanBeRecord]
### RuleId[ruleID=ClassCanBeRecord]
Class can be a record
in `baremaps-core/src/main/java/org/apache/baremaps/geocoder/Result.java`
#### Snippet
```java
import org.apache.lucene.search.ScoreDoc;

public class Result {

  private final ScoreDoc scoreDoc;
```

### RuleId[ruleID=ClassCanBeRecord]
Class can be a record
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/ListDataType.java`
#### Snippet
```java

/** A {@link DataType} for reading and writing lists of objects in {@link ByteBuffer}s. */
public class ListDataType<T> implements DataType<List<T>> {

  public final DataType<T> dataType;
```

### RuleId[ruleID=ClassCanBeRecord]
Class can be a record
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/model/Header.java`
#### Snippet
```java

/** Represents a header entity in an OpenStreetMap dataset. */
public class Header implements Entity {

  private final Long replicationSequenceNumber;
```

### RuleId[ruleID=ClassCanBeRecord]
Class can be a record
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/model/Info.java`
#### Snippet
```java

/** Represents all the metadata associated to an element in an OpenStreetMap dataset. */
public class Info {

  protected final int version;
```

### RuleId[ruleID=ClassCanBeRecord]
Class can be a record
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/model/Member.java`
#### Snippet
```java

/** Represents a member of a relation in an OpenStreetMap dataset. */
public final class Member {

  public enum MemberType {
```

### RuleId[ruleID=ClassCanBeRecord]
Class can be a record
in `baremaps-core/src/main/java/org/apache/baremaps/iploc/nic/NicAttribute.java`
#### Snippet
```java

/** Represents a NIC attribute. */
public class NicAttribute {

  private final String name;
```

### RuleId[ruleID=ClassCanBeRecord]
Class can be a record
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/PairDataType.java`
#### Snippet
```java
  }

  public static class Pair<L, R> {

    private final L left;
```

### RuleId[ruleID=ClassCanBeRecord]
Class can be a record
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/model/State.java`
#### Snippet
```java

/** Represents the state of an OpenStreetMap dataset, enabling its replication. */
public class State {

  private final long sequenceNumber;
```

### RuleId[ruleID=ClassCanBeRecord]
Class can be a record
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/model/Change.java`
#### Snippet
```java

/** Represents a change in an OpenStreetMap dataset. */
public final class Change {

  public enum ChangeType {
```

### RuleId[ruleID=ClassCanBeRecord]
Class can be a record
in `baremaps-core/src/main/java/org/apache/baremaps/iploc/nic/NicObject.java`
#### Snippet
```java

/** Represents a NIC Object. */
public class NicObject {

  private final List<NicAttribute> attributes;
```

### RuleId[ruleID=ClassCanBeRecord]
Class can be a record
in `baremaps-core/src/main/java/org/apache/baremaps/iploc/data/InetnumLocation.java`
#### Snippet
```java

/** Contains an IP range along with its position in the world */
public class InetnumLocation {
  private final String address;
  private final Ipv4Range ipv4Range;
```

### RuleId[ruleID=ClassCanBeRecord]
Class can be a record
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/model/Bound.java`
#### Snippet
```java

/** Represents the bounds of an OpenStreetMap dataset. */
public class Bound implements Entity {

  private final double maxLat;
```

### RuleId[ruleID=ClassCanBeRecord]
Class can be a record
in `baremaps-core/src/main/java/org/apache/baremaps/database/tile/PostgresQuery.java`
#### Snippet
```java

/** Models the input queries of a {@code PostgresTileStore}. */
public class PostgresQuery {

  private final String layer;
```

### RuleId[ruleID=ClassCanBeRecord]
Class can be a record
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/model/User.java`
#### Snippet
```java

/** Represents the author of an objet in an OpenStreetMap dataset. */
public final class User {

  public static final User NO_USER = new User(-1, "");
```

### RuleId[ruleID=ClassCanBeRecord]
Class can be a record
in `baremaps-core/src/main/java/org/apache/baremaps/database/tile/PostgresGroup.java`
#### Snippet
```java
 * are used to form common table expressions (CTE).
 */
class PostgresGroup {

  private final List<SelectItem> selectItems;
```

### RuleId[ruleID=ClassCanBeRecord]
Class can be a record
in `baremaps-core/src/main/java/org/apache/baremaps/geocoder/Response.java`
#### Snippet
```java
import org.apache.lucene.search.TopDocs;

public class Response {

  private final TopDocs topDocs;
```

## RuleId[ruleID=PointlessBooleanExpression]
### RuleId[ruleID=PointlessBooleanExpression]
`getByteBuffer().hasRemaining() == false` can be simplified to '!getByteBuffer().hasRemaining()'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DbaseByteReader.java`
#### Snippet
```java
  public boolean nextRowAvailable() {
    // 1) Check for remaining bytes.
    if (getByteBuffer().hasRemaining() == false) {
      return false;
    }
```

## RuleId[ruleID=ThreadStartInConstruction]
### RuleId[ruleID=ThreadStartInConstruction]
Call to `start()` during object construction
in `baremaps-server/src/main/java/org/apache/baremaps/server/DevResources.java`
#### Snippet
```java
    // Observe the file system for changes
    Set<Path> directories = new HashSet<>(Arrays.asList(tileset.getParent(), style.getParent()));
    new Thread(new DirectoryWatcher(directories, this::broadcastChanges)).start();
  }

```

## RuleId[ruleID=UnstableApiUsage]
### RuleId[ruleID=UnstableApiUsage]
'com.google.common.graph.Graph' is marked unstable with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowExecutor.java`
#### Snippet
```java
  private final Map<String, CompletableFuture<Void>> futures;

  private final Graph<String> graph;

  /**
```

### RuleId[ruleID=UnstableApiUsage]
'successors(N)' is declared in unstable interface 'com.google.common.graph.Graph' marked with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowExecutor.java`
#### Snippet
```java

  private boolean isEndStep(String step) {
    return graph.successors(step).isEmpty();
  }

```

### RuleId[ruleID=UnstableApiUsage]
'predecessors(N)' is declared in unstable interface 'com.google.common.graph.Graph' marked with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowExecutor.java`
#### Snippet
```java

  private CompletableFuture<Void> previousSteps(String step) {
    var predecessors = graph.predecessors(step).stream().toList();
    if (predecessors.isEmpty()) {
      return CompletableFuture.completedFuture(null);
```

### RuleId[ruleID=UnstableApiUsage]
'nodes()' is declared in unstable interface 'com.google.common.graph.Graph' marked with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowExecutor.java`
#### Snippet
```java
   */
  public CompletableFuture<Void> execute() {
    var endSteps = graph.nodes().stream().filter(this::isEndStep).map(this::getStep)
        .toArray(CompletableFuture[]::new);
    return CompletableFuture.allOf(endSteps);
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.graph.ImmutableGraph' is marked unstable with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowExecutor.java`
#### Snippet
```java

    // Build the execution graph
    ImmutableGraph.Builder<String> graphBuilder = GraphBuilder.directed().immutable();
    for (String id : this.steps.keySet()) {
      graphBuilder.addNode(id);
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.graph.ImmutableGraph.Builder' is declared in unstable class 'com.google.common.graph.ImmutableGraph' marked with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowExecutor.java`
#### Snippet
```java

    // Build the execution graph
    ImmutableGraph.Builder<String> graphBuilder = GraphBuilder.directed().immutable();
    for (String id : this.steps.keySet()) {
      graphBuilder.addNode(id);
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.graph.GraphBuilder' is marked unstable with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowExecutor.java`
#### Snippet
```java

    // Build the execution graph
    ImmutableGraph.Builder<String> graphBuilder = GraphBuilder.directed().immutable();
    for (String id : this.steps.keySet()) {
      graphBuilder.addNode(id);
```

### RuleId[ruleID=UnstableApiUsage]
'directed()' is declared in unstable class 'com.google.common.graph.GraphBuilder' marked with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowExecutor.java`
#### Snippet
```java

    // Build the execution graph
    ImmutableGraph.Builder<String> graphBuilder = GraphBuilder.directed().immutable();
    for (String id : this.steps.keySet()) {
      graphBuilder.addNode(id);
```

### RuleId[ruleID=UnstableApiUsage]
'immutable()' is declared in unstable class 'com.google.common.graph.GraphBuilder' marked with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowExecutor.java`
#### Snippet
```java

    // Build the execution graph
    ImmutableGraph.Builder<String> graphBuilder = GraphBuilder.directed().immutable();
    for (String id : this.steps.keySet()) {
      graphBuilder.addNode(id);
```

### RuleId[ruleID=UnstableApiUsage]
'addNode(N)' is declared in unstable class 'com.google.common.graph.ImmutableGraph' marked with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowExecutor.java`
#### Snippet
```java
    ImmutableGraph.Builder<String> graphBuilder = GraphBuilder.directed().immutable();
    for (String id : this.steps.keySet()) {
      graphBuilder.addNode(id);
    }
    for (Step step : this.steps.values()) {
```

### RuleId[ruleID=UnstableApiUsage]
'putEdge(N, N)' is declared in unstable class 'com.google.common.graph.ImmutableGraph' marked with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowExecutor.java`
#### Snippet
```java
      if (step.getNeeds() != null) {
        for (String stepNeeded : step.getNeeds()) {
          graphBuilder.putEdge(stepNeeded, step.getId());
        }
      }
```

### RuleId[ruleID=UnstableApiUsage]
'build()' is declared in unstable class 'com.google.common.graph.ImmutableGraph' marked with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowExecutor.java`
#### Snippet
```java
      }
    }
    this.graph = graphBuilder.build();
    if (Graphs.hasCycle(graph)) {
      throw new WorkflowException("The workflow must be a directed acyclic graph");
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.graph.Graphs' is marked unstable with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowExecutor.java`
#### Snippet
```java
    }
    this.graph = graphBuilder.build();
    if (Graphs.hasCycle(graph)) {
      throw new WorkflowException("The workflow must be a directed acyclic graph");
    }
```

### RuleId[ruleID=UnstableApiUsage]
'hasCycle(com.google.common.graph.Graph)' is declared in unstable class 'com.google.common.graph.Graphs' marked with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowExecutor.java`
#### Snippet
```java
    }
    this.graph = graphBuilder.build();
    if (Graphs.hasCycle(graph)) {
      throw new WorkflowException("The workflow must be a directed acyclic graph");
    }
```

### RuleId[ruleID=UnstableApiUsage]
'readLines(java.lang.Readable)' is marked unstable with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/state/StateReader.java`
#### Snippet
```java
    InputStreamReader reader = new InputStreamReader(input, StandardCharsets.UTF_8);
    Map<String, String> map = new HashMap<>();
    for (String line : CharStreams.readLines(reader)) {
      String[] array = line.split("=");
      if (array.length == 2) {
```

### RuleId[ruleID=UnstableApiUsage]
'tryParse(java.lang.String)' is marked unstable with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlEntitySpliterator.java`
#### Snippet
```java
  private Info readInfo() {
    String versionValue = reader.getAttributeValue(null, ATTRIBUTE_NAME_VERSION);
    int version = versionValue != null ? Ints.tryParse(versionValue) : 0;
    String timestampValue = reader.getAttributeValue(null, ATTRIBUTE_NAME_TIMESTAMP);
    LocalDateTime timestamp =
```

### RuleId[ruleID=UnstableApiUsage]
'tryParse(java.lang.String)' is marked unstable with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlEntitySpliterator.java`
#### Snippet
```java
        timestampValue != null ? LocalDateTime.parse(timestampValue, format) : null;
    String changesetValue = reader.getAttributeValue(null, ATTRIBUTE_NAME_CHANGESET_ID);
    long changeset = changesetValue != null ? Longs.tryParse(changesetValue) : -1;
    String uidValue = reader.getAttributeValue(null, ATTRIBUTE_NAME_USER_ID);
    int uid = uidValue != null && Ints.tryParse(uidValue) != null ? Ints.tryParse(uidValue) : -1;
```

### RuleId[ruleID=UnstableApiUsage]
'tryParse(java.lang.String)' is marked unstable with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlEntitySpliterator.java`
#### Snippet
```java
    long changeset = changesetValue != null ? Longs.tryParse(changesetValue) : -1;
    String uidValue = reader.getAttributeValue(null, ATTRIBUTE_NAME_USER_ID);
    int uid = uidValue != null && Ints.tryParse(uidValue) != null ? Ints.tryParse(uidValue) : -1;
    return new Info(version, timestamp, changeset, uid);
  }
```

### RuleId[ruleID=UnstableApiUsage]
'tryParse(java.lang.String)' is marked unstable with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlEntitySpliterator.java`
#### Snippet
```java
    long changeset = changesetValue != null ? Longs.tryParse(changesetValue) : -1;
    String uidValue = reader.getAttributeValue(null, ATTRIBUTE_NAME_USER_ID);
    int uid = uidValue != null && Ints.tryParse(uidValue) != null ? Ints.tryParse(uidValue) : -1;
    return new Info(version, timestamp, changeset, uid);
  }
```

## RuleId[ruleID=OverwrittenKey]
### RuleId[ruleID=OverwrittenKey]
Duplicate Map key
in `baremaps-core/src/main/java/org/apache/baremaps/storage/postgres/PostgresDatabase.java`
#### Snippet
```java
    typeToName.put(Double.class, "float8");
    typeToName.put(Geometry.class, "geometry");
    typeToName.put(Point.class, "geometry");
    typeToName.put(MultiPoint.class, "geometry");
    typeToName.put(Point.class, "geometry");
```

### RuleId[ruleID=OverwrittenKey]
Duplicate Map key
in `baremaps-core/src/main/java/org/apache/baremaps/storage/postgres/PostgresDatabase.java`
#### Snippet
```java
    typeToName.put(Point.class, "geometry");
    typeToName.put(MultiPoint.class, "geometry");
    typeToName.put(Point.class, "geometry");
    typeToName.put(LineString.class, "geometry");
    typeToName.put(MultiLineString.class, "geometry");
```

### RuleId[ruleID=OverwrittenKey]
Duplicate Map key
in `baremaps-core/src/main/java/org/apache/baremaps/storage/postgres/PostgresDatabase.java`
#### Snippet
```java
    typeToHandler.put(Double.class, new DoubleValueHandler());
    typeToHandler.put(Geometry.class, new PostgisGeometryValueHandler());
    typeToHandler.put(Point.class, new PostgisGeometryValueHandler());
    typeToHandler.put(MultiPoint.class, new PostgisGeometryValueHandler());
    typeToHandler.put(Point.class, new PostgisGeometryValueHandler());
```

### RuleId[ruleID=OverwrittenKey]
Duplicate Map key
in `baremaps-core/src/main/java/org/apache/baremaps/storage/postgres/PostgresDatabase.java`
#### Snippet
```java
    typeToHandler.put(Point.class, new PostgisGeometryValueHandler());
    typeToHandler.put(MultiPoint.class, new PostgisGeometryValueHandler());
    typeToHandler.put(Point.class, new PostgisGeometryValueHandler());
    typeToHandler.put(LineString.class, new PostgisGeometryValueHandler());
    typeToHandler.put(MultiLineString.class, new PostgisGeometryValueHandler());
```

