# incubator-baremaps 
 
# Bad smells
I found 477 bad smells with 19 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocDeclaration | 189 | false |
| FieldMayBeFinal | 80 | false |
| FieldCanBeLocal | 27 | false |
| DuplicatedCode | 25 | false |
| UnstableApiUsage | 25 | false |
| DuplicateBranchesInSwitch | 21 | false |
| UNCHECKED_WARNING | 14 | false |
| DataFlowIssue | 11 | false |
| Deprecation | 7 | false |
| UnnecessaryLocalVariable | 7 | true |
| OptionalGetWithoutIsPresent | 6 | false |
| LongLiteralsEndingWithLowercaseL | 5 | false |
| UnnecessaryModifier | 4 | true |
| ProtectedMemberInFinalClass | 4 | true |
| SuspiciousMethodCalls | 4 | false |
| ConstantValue | 4 | false |
| UnnecessarySemicolon | 3 | false |
| ObviousNullCheck | 3 | false |
| SwitchStatementWithTooFewBranches | 3 | false |
| ToArrayCallWithZeroLengthArrayArgument | 2 | true |
| PointlessArithmeticExpression | 2 | false |
| SimplifyStreamApiCallChains | 2 | false |
| EmptyStatementBody | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| IgnoreResultOfCall | 2 | false |
| AccessStaticViaInstance | 2 | false |
| DefaultAnnotationParam | 2 | false |
| UNUSED_IMPORT | 2 | false |
| MismatchedCollectionQueryUpdate | 2 | false |
| MagicConstant | 1 | false |
| EmptyTryBlock | 1 | false |
| ManualArrayCopy | 1 | false |
| NonFinalFieldInEnum | 1 | false |
| CatchMayIgnoreException | 1 | false |
| UnnecessaryReturn | 1 | true |
| DanglingJavadoc | 1 | false |
| NullableProblems | 1 | false |
| TrivialIf | 1 | false |
| SuspiciousToArrayCall | 1 | false |
| DuplicateThrows | 1 | false |
| ArraysAsListWithZeroOrOneArgument | 1 | false |
| NullArgumentToVariableArgMethod | 1 | false |
| PointlessBooleanExpression | 1 | true |
| UnusedAssignment | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Coordinate\[list.size()\]'
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/function/WayGeometryBuilder.java`
#### Snippet
```java
    try {
      List<Coordinate> list = way.getNodes().stream().map(coordinateMap::get).toList();
      Coordinate[] array = list.toArray(new Coordinate[list.size()]);
      LineString line = GEOMETRY_FACTORY_WGS84.createLineString(array);
      if (!line.isEmpty()) {
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Coordinate\[coords.size()\]'
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/function/RelationGeometryBuilder.java`
#### Snippet
```java
      List<Long> refs = referenceMap.get(member.getRef());
      List<Coordinate> coords = refs.stream().map(coordinateMap::get).toList();
      Coordinate[] array = coords.toArray(new Coordinate[coords.size()]);
      return GEOMETRY_FACTORY_WGS84.createLineString(array);
    } catch (Exception e) {
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileGeometryType.java`
#### Snippet
```java
  private int value;

  private ShapefileGeometryType(int value) {
    this.value = value;
  }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `baremaps-core/src/main/java/org/apache/baremaps/collection/DataCollection.java`
#### Snippet
```java
   * @return the number of values
   */
  public abstract long sizeAsLong();

  /** {@inheritDoc} */
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `baremaps-core/src/main/java/org/apache/baremaps/collection/DataCollection.java`
#### Snippet
```java
   * @return the number of values
   */
  public abstract long sizeAsLong();

  /** {@inheritDoc} */
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `baremaps-core/src/main/java/org/apache/baremaps/vectortile/expression/Expressions.java`
#### Snippet
```java
  }

  public static Module jacksonModule() {
    var simpleModule = new SimpleModule("SimpleModule", new Version(1, 0, 0, null));
    simpleModule.addDeserializer(Expression.class, new ExpressionDeserializer());
```

## RuleId[id=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`0 - buffer` can be replaced with '- buffer'
in `baremaps-core/src/main/java/org/apache/baremaps/vectortile/VectorTileUtils.java`
#### Snippet
```java
  private static Geometry clipToTile(Geometry geometry, int extent, int buffer) {
    Envelope envelope =
        new Envelope((0 - buffer), (extent + buffer), (0 - buffer), (extent + buffer));
    GeometryFactory geometryFactory = new GeometryFactory();
    Geometry tile = geometryFactory.toGeometry(envelope);
```

### PointlessArithmeticExpression
`0 - buffer` can be replaced with '- buffer'
in `baremaps-core/src/main/java/org/apache/baremaps/vectortile/VectorTileUtils.java`
#### Snippet
```java
  private static Geometry clipToTile(Geometry geometry, int extent, int buffer) {
    Envelope envelope =
        new Envelope((0 - buffer), (extent + buffer), (0 - buffer), (extent + buffer));
    GeometryFactory geometryFactory = new GeometryFactory();
    Geometry tile = geometryFactory.toGeometry(envelope);
```

## RuleId[id=MagicConstant]
### MagicConstant
Should be one of: Calendar.JANUARY, Calendar.FEBRUARY, Calendar.MARCH, Calendar.APRIL, Calendar.MAY, ...
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DbaseByteReader.java`
#### Snippet
```java

    @SuppressWarnings("deprecation") // But everything is deprecated in DBF files...
    Date date = new Date(year, month, day);
    return date;
  }
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked call to 'set(int, E)' as a member of raw type 'java.util.List'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/RowImpl.java`
#### Snippet
```java
    for (int i = 0; i < schema().columns().size(); i++) {
      if (schema().columns().get(i).name().equals(column)) {
        values.set(i, value);
        return;
      }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.function.Supplier' to 'java.util.function.Supplier'
in `baremaps-core/src/main/java/org/apache/baremaps/stream/SupplierUtils.java`
#### Snippet
```java
   */
  public static <T> Supplier<T> memoize(Supplier<T> supplier, int timeToLiveMillis) {
    return new Supplier() {
      long t1 = System.currentTimeMillis();
      T value = supplier.get();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'geometryCollection' has raw type, so result of getGeometries is erased
in `baremaps-core/src/main/java/org/apache/baremaps/storage/geopackage/GeoPackageTable.java`
#### Snippet
```java
  private GeometryCollection asJstGeometryCollection(
      mil.nga.sf.GeometryCollection geometryCollection) {
    List<mil.nga.sf.Geometry> geometries = geometryCollection.getGeometries();
    return geometryFactory.createGeometryCollection(
        geometries.stream().map(this::asJtsGeometry).toArray(Geometry[]::new));
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/flatgeobuf/internal/TableConversions.java`
#### Snippet
```java
    var geometryBuffer = feature.geometry();
    var geometry = GeometryConversions.deserialize(geometryBuffer, geometryBuffer.type());
    values.add(geometry);

    if (feature.propertiesLength() > 0) {
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/flatgeobuf/internal/TableConversions.java`
#### Snippet
```java
        var column = headerMeta.columns.get(type);
        var value = readValue(propertiesBuffer, column);
        values.add(value);
      }
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'de.bytefish.pgbulkinsert.pgsql.handlers.BaseValueHandler' to 'de.bytefish.pgbulkinsert.pgsql.handlers.BaseValueHandler'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/postgres/PostgresStore.java`
#### Snippet
```java
              writer.writeNull();
            } else {
              writer.write(handler, value);
            }
          }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/Entity.java`
#### Snippet
```java
  public List<Object> values() {
    var map = new ArrayList();
    map.add(id);
    map.add(geometry);
    map.addAll(tags.values());
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/Entity.java`
#### Snippet
```java
    var map = new ArrayList();
    map.add(id);
    map.add(geometry);
    map.addAll(tags.values());
    return map;
```

### UNCHECKED_WARNING
Unchecked call to 'addAll(Collection)' as a member of raw type 'java.util.ArrayList'
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/Entity.java`
#### Snippet
```java
    map.add(id);
    map.add(geometry);
    map.addAll(tags.values());
    return map;
  }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/Entity.java`
#### Snippet
```java
    map.add(geometry);
    map.addAll(tags.values());
    return map;
  }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.stream.Stream' to 'java.util.stream.Stream'. Reason: 'mergedGeometries' has raw type, so result of stream is erased
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/TransformEntityCollection.java`
#### Snippet
```java
    var mergedGeometries = lineMerger.getMergedLineStrings();

    return mergedGeometries.stream();
  }

```

### UNCHECKED_WARNING
Unchecked call to 'DataStack(DataList)' as a member of raw type 'org.apache.baremaps.collection.algorithm.ExternalMergeSort.DataStack'
in `baremaps-core/src/main/java/org/apache/baremaps/collection/algorithm/ExternalMergeSort.java`
#### Snippet
```java
        continue;
      }
      DataStack stack = new DataStack(input);
      if (!stack.empty()) {
        queue.add(stack);
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.baremaps.collection.algorithm.ExternalMergeSort.DataStack' to 'org.apache.baremaps.collection.algorithm.ExternalMergeSort.DataStack'
in `baremaps-core/src/main/java/org/apache/baremaps/collection/algorithm/ExternalMergeSort.java`
#### Snippet
```java
      DataStack stack = new DataStack(input);
      if (!stack.empty()) {
        queue.add(stack);
      }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'forEach(Consumer)' as a member of raw type 'java.util.stream.Stream'
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/function/RelationGeometryBuilder.java`
#### Snippet
```java
          }
        });
    lineMerger.getMergedLineStrings().stream().forEach(geometry -> {
      LineString line = (LineString) geometry;
      if (line.isClosed()) {
```

## RuleId[id=EmptyTryBlock]
### EmptyTryBlock
Empty `try` block
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileReader.java`
#### Snippet
```java
  public void loadDescriptors() throws IOException {
    // Doing a simple query will init the internal descriptors.
    try (ShapefileInputStream is = read()) {
    }
  }
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `baremaps-core/src/main/java/org/apache/baremaps/iploc/IpLocRepository.java`
#### Snippet
```java
      statement.setBytes(1, inetAddress.getAddress());
      statement.setBytes(2, inetAddress.getAddress());
      try (var resultSet = statement.executeQuery();) {
        while (resultSet.next()) {
          ipLocObjects.add(new IpLocObject(
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `baremaps-core/src/main/java/org/apache/baremaps/iploc/IpLocRepository.java`
#### Snippet
```java
  public void save(List<IpLocObject> ipLocObjects) {
    try (var connection = dataSource.getConnection();
        var statement = connection.prepareStatement(INSERT_SQL);) {
      connection.setAutoCommit(false);
      for (IpLocObject ipLocObject : ipLocObjects) {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `baremaps-core/src/main/java/org/apache/baremaps/storage/flatgeobuf/internal/TableConversions.java`
#### Snippet
```java
      default -> {
      }
    };
  }

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `readAllBytes` may produce `NullPointerException`
in `baremaps-server/src/main/java/org/apache/baremaps/server/ServerResources.java`
#### Snippet
```java
    path = String.format("assets/%s", path);
    try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(path)) {
      var bytes = inputStream.readAllBytes();
      return Response.ok().entity(bytes).build();
    } catch (NullPointerException | IOException e) {
```

### DataFlowIssue
Method invocation `readAllBytes` may produce `NullPointerException`
in `baremaps-server/src/main/java/org/apache/baremaps/server/GeocoderResources.java`
#### Snippet
```java
    path = String.format("geocoder/%s", path);
    try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(path)) {
      var bytes = inputStream.readAllBytes();
      return Response.ok().entity(bytes).build();
    } catch (NullPointerException | IOException e) {
```

### DataFlowIssue
Method invocation `readAllBytes` may produce `NullPointerException`
in `baremaps-server/src/main/java/org/apache/baremaps/server/DevResources.java`
#### Snippet
```java
    path = String.format("assets/%s", path);
    try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(path)) {
      var bytes = inputStream.readAllBytes();
      return Response.ok().entity(bytes).build();
    } catch (NullPointerException | IOException e) {
```

### DataFlowIssue
Method invocation `readAllBytes` may produce `NullPointerException`
in `baremaps-server/src/main/java/org/apache/baremaps/server/IpLocResources.java`
#### Snippet
```java
    path = String.format("iploc/%s", path);
    try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(path)) {
      var bytes = inputStream.readAllBytes();
      return Response.ok().entity(bytes).build();
    } catch (NullPointerException | IOException e) {
```

### DataFlowIssue
Variable is already assigned to this value
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/ExecuteSql.java`
#### Snippet
```java
    var queries = Arrays.stream(sql.split(";"));
    if (parallel) {
      queries = queries.parallel();
    }
    queries.forEach(
```

### DataFlowIssue
Variable is already assigned to this value
in `baremaps-core/src/main/java/org/apache/baremaps/collection/algorithm/ExternalMergeSort.java`
#### Snippet
```java
    Stream<T> tmpStream = batch.stream().sorted(comparator);
    if (parallel) {
      tmpStream = tmpStream.parallel();
    }
    if (distinct) {
```

### DataFlowIssue
Switch label `"OSMHeader"` is unreachable
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/function/BlobToBlockMapper.java`
#### Snippet
```java
    try {
      switch (blob.header().getType()) {
        case "OSMHeader":
          return new HeaderBlockReader(blob).read();
        case "OSMData":
```

### DataFlowIssue
Switch label `"OSMData"` is unreachable
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/function/BlobToBlockMapper.java`
#### Snippet
```java
        case "OSMHeader":
          return new HeaderBlockReader(blob).read();
        case "OSMData":
          return new DataBlockReader(blob).read();
        default:
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `baremaps-core/src/main/java/org/apache/baremaps/vectortile/VectorTileEncoder.java`
#### Snippet
```java
    // Encode the features
    layer.getFeatures().stream()
        .forEach(feature -> encodeFeature(feature, builder::addFeatures));

    // Encode the keys and values
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/function/RelationGeometryBuilder.java`
#### Snippet
```java
          }
        });
    lineMerger.getMergedLineStrings().stream().forEach(geometry -> {
      LineString line = (LineString) geometry;
      if (line.isClosed()) {
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`while` statement has empty body
in `baremaps-core/src/main/java/org/apache/baremaps/stream/BatchedSpliterator.java`
#### Snippet
```java
  public Spliterator<T> trySplit() {
    List<T> batch = new ArrayList<>();
    while (batch.size() < batchSize && tryAdvance(batch::add)) {
    }

```

### EmptyStatementBody
`if` statement has empty body
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/function/OpenstreetmapDocumentMapper.java`
#### Snippet
```java
      document.add(LatLonShape.createDocValueField("geometry",
          new org.apache.lucene.geo.Polygon(lats, lons)));
    } else if (geometry instanceof MultiPolygon) {
      // TODO: Implement MultiPolygon
    }
```

## RuleId[id=ManualArrayCopy]
### ManualArrayCopy
Manual array copy
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DbaseByteReader.java`
#### Snippet
```java
        byte[] dataTrimmed = new byte[length];

        for (int index = 0; index < length; index++) {
          dataTrimmed[index] = data[index];
        }
```

## RuleId[id=LongLiteralsEndingWithLowercaseL]
### LongLiteralsEndingWithLowercaseL
'long' literal `10l` ends with lowercase 'l'
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/UnzipFile.java`
#### Snippet
```java

  private static final long THRESHOLD_ENTRIES = 10000;
  private static final long THRESHOLD_SIZE = 10l << 30;
  private static final double THRESHOLD_RATIO = 100;

```

### LongLiteralsEndingWithLowercaseL
'long' literal `1l` ends with lowercase 'l'
in `baremaps-core/src/main/java/org/apache/baremaps/collection/memory/Memory.java`
#### Snippet
```java
    this.segmentSize = segmentSize;
    this.segmentShift = (long) (Math.log(this.segmentSize) / Math.log(2));
    this.segmentMask = this.segmentSize - 1l;
  }

```

### LongLiteralsEndingWithLowercaseL
'long' literal `1l` ends with lowercase 'l'
in `baremaps-core/src/main/java/org/apache/baremaps/collection/algorithm/BinarySearch.java`
#### Snippet
```java
      Comparator<A> comparator) {
    long lo = 0;
    long hi = list.sizeAsLong() - 1l;
    while (lo <= hi) {
      long mi = (lo + hi) >>> 1;
```

### LongLiteralsEndingWithLowercaseL
'long' literal `1l` ends with lowercase 'l'
in `baremaps-core/src/main/java/org/apache/baremaps/collection/algorithm/BinarySearch.java`
#### Snippet
```java
   */
  public static <E> Long binarySearch(DataList<E> list, E value, Comparator<E> comparator) {
    return binarySearch(list, value, comparator, 0, list.sizeAsLong() - 1l);
  }

```

### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `baremaps-core/src/main/java/org/apache/baremaps/collection/algorithm/ExternalMergeSort.java`
#### Snippet
```java
    private DataList<T> list;

    private Long index = 0l;

    private T cache;
```

## RuleId[id=ObviousNullCheck]
### ObviousNullCheck
Redundant null-check: a value of primitive type 'byte' is never null
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DbaseByteReader.java`
#### Snippet
```java
    }

    Objects.requireNonNull(yymmdd[0], "the year byte cannot be null");
    Objects.requireNonNull(yymmdd[1], "the month byte cannot be null");
    Objects.requireNonNull(yymmdd[2], "the day byte cannot be null");
```

### ObviousNullCheck
Redundant null-check: a value of primitive type 'byte' is never null
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DbaseByteReader.java`
#### Snippet
```java

    Objects.requireNonNull(yymmdd[0], "the year byte cannot be null");
    Objects.requireNonNull(yymmdd[1], "the month byte cannot be null");
    Objects.requireNonNull(yymmdd[2], "the day byte cannot be null");

```

### ObviousNullCheck
Redundant null-check: a value of primitive type 'byte' is never null
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DbaseByteReader.java`
#### Snippet
```java
    Objects.requireNonNull(yymmdd[0], "the year byte cannot be null");
    Objects.requireNonNull(yymmdd[1], "the month byte cannot be null");
    Objects.requireNonNull(yymmdd[2], "the day byte cannot be null");

    int year = yymmdd[0] < 70 ? 100 + yymmdd[0] : yymmdd[0];
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileByteReader.java`
#### Snippet
```java
        case Currency -> Double.class;
        case Integer -> Integer.class;
        case Double -> Double.class;
        case AutoIncrement -> Integer.class;

```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileByteReader.java`
#### Snippet
```java
        case Integer -> Integer.class;
        case Double -> Double.class;
        case AutoIncrement -> Integer.class;

        // TODO: Implement the following types
```

### DuplicateBranchesInSwitch
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

### DuplicateBranchesInSwitch
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

### DuplicateBranchesInSwitch
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

### DuplicateBranchesInSwitch
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

### DuplicateBranchesInSwitch
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

### DuplicateBranchesInSwitch
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

### DuplicateBranchesInSwitch
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

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileByteReader.java`
#### Snippet
```java
        case Variant -> String.class;
        case TimeStamp -> String.class;
        case DateTime -> String.class;
      };

```

### DuplicateBranchesInSwitch
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

### DuplicateBranchesInSwitch
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

### DuplicateBranchesInSwitch
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

### DuplicateBranchesInSwitch
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

### DuplicateBranchesInSwitch
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

### DuplicateBranchesInSwitch
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

### DuplicateBranchesInSwitch
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

### DuplicateBranchesInSwitch
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

### DuplicateBranchesInSwitch
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

### DuplicateBranchesInSwitch
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

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DbaseByteReader.java`
#### Snippet
```java
        case Variant -> value;
        case TimeStamp -> value;
        case DateTime -> value;
      };

```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `value` in enum 'ShapefileGeometryType'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileGeometryType.java`
#### Snippet
```java

  // used for initializing the enumeration
  private int value;

  private ShapefileGeometryType(int value) {
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' expression has too few case labels (1), and should probably be replaced with an 'if' statement or conditional operator
in `baremaps-core/src/main/java/org/apache/baremaps/config/ConfigReader.java`
#### Snippet
```java
  public String read(Path path) throws IOException {
    var extension = com.google.common.io.Files.getFileExtension(path.toString());
    var config = switch (extension) {
      case "js" -> eval(path);
      default -> Files.readString(path);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlChangeSpliterator.java`
#### Snippet
```java
    reader.nextTag();
    while (reader.getEventType() == XMLStreamConstants.START_ELEMENT) {
      switch (reader.getLocalName()) {
        case ELEMENT_NAME_TAG:
          readTag(tags);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlEntitySpliterator.java`
#### Snippet
```java
    reader.nextTag();
    while (reader.getEventType() == XMLStreamConstants.START_ELEMENT) {
      switch (reader.getLocalName()) {
        case ELEMENT_NAME_TAG:
          readTag(tags);
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `baremaps-benchmark/src/main/java/org/apache/baremaps/benchmarks/DataMapBenchmark.java`
#### Snippet
```java
    for (long i = 0; i < n; i++) {
      store.put(i, i);
    }
    for (long i = 0; i < n; i++) {
      long v = store.get(i);
      if (v != i) {
        throw new RuntimeException("Invalid value");
      }
    }
```

### DuplicatedCode
Duplicated code
in `baremaps-core/src/main/java/org/apache/baremaps/collection/DataList.java`
#### Snippet
```java
    return new Iterator<>() {

      private long index = 0;

      private long size = sizeAsLong();

      @Override
      public boolean hasNext() {
        return index < size;
      }

      @Override
      public E next() {
        if (!hasNext()) {
          throw new NoSuchElementException();
        }
        return get(index++);
      }
    };
```

### DuplicatedCode
Duplicated code
in `baremaps-core/src/main/java/org/apache/baremaps/collection/MonotonicDataMap.java`
#### Snippet
```java
    long key = (long) keyObject;
    long chunk = key >>> 8;
    if (chunk >= offsets.sizeAsLong()) {
      return null;
    }
    long lo = offsets.get(chunk);
    long hi =
        Math.min(
            keys.sizeAsLong(),
            chunk >= offsets.sizeAsLong() - 1
                ? keys.sizeAsLong()
                : offsets.get(chunk + 1))
            - 1;
```

### DuplicatedCode
Duplicated code
in `baremaps-core/src/main/java/org/apache/baremaps/collection/algorithm/BinarySearch.java`
#### Snippet
```java
    while (lo <= hi) {
      long mi = (lo + hi) >>> 1;
      E e = list.get(mi);
      A a = extractor.apply(e);
      int cmp = comparator.compare(a, value);
      if (cmp < 0) {
        lo = mi + 1;
      } else if (cmp > 0) {
        hi = mi - 1;
      } else {
        return e; // key found
      }
    }
    return null; // key not found.
```

### DuplicatedCode
Duplicated code
in `baremaps-core/src/main/java/org/apache/baremaps/iploc/IpLocRepository.java`
#### Snippet
```java
      statement.setString(1, ipLocObject.address());
      statement.setBytes(2, ipLocObject.inetRange().start().getAddress());
      statement.setBytes(3, ipLocObject.inetRange().end().getAddress());
      statement.setDouble(4, ipLocObject.coordinate().getX());
      statement.setDouble(5, ipLocObject.coordinate().getY());
      statement.setString(6, ipLocObject.network());
      statement.setString(7, ipLocObject.country());
```

### DuplicatedCode
Duplicated code
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/function/OpenstreetmapDocumentMapper.java`
#### Snippet
```java
      var coordinates = lineString.getCoordinates();
      var lats = new double[coordinates.length];
      var lons = new double[coordinates.length];
      for (int i = 0; i < coordinates.length; i++) {
        lats[i] = coordinates[i].y;
        lons[i] = coordinates[i].x;
      }
```

### DuplicatedCode
Duplicated code
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/pbf/DataBlockReader.java`
#### Snippet
```java
        long id = way.getId();
        int version = way.getInfo().getVersion();
        LocalDateTime timestamp = getTimestamp(way.getInfo().getTimestamp());
        long changeset = way.getInfo().getChangeset();
        int uid = way.getInfo().getUid();
        Map<String, Object> tags = getTags(way.getKeysList(), way.getValsList());
        long nid = 0;
```

### DuplicatedCode
Duplicated code
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresCoordinateMap.java`
#### Snippet
```java
    try (Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(SELECT_SIZE)) {
      try (ResultSet result = statement.executeQuery()) {
        if (result.next()) {
          return result.getLong(1);
        } else {
          throw new DataCollectionException();
        }
      }
    } catch (SQLException e) {
      throw new DataCollectionException(e);
    }
```

### DuplicatedCode
Duplicated code
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresCoordinateMap.java`
#### Snippet
```java
    try (Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(SELECT_CONTAINS_KEY)) {
      statement.setLong(1, (Long) key);
      try (ResultSet result = statement.executeQuery()) {
        return result.next();
      }
    } catch (SQLException e) {
      throw new DataCollectionException(e);
    }
```

### DuplicatedCode
Duplicated code
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresCoordinateMap.java`
#### Snippet
```java
    try (Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(SELECT_CONTAINS_VALUE)) {
      statement.setArray(1, connection.createArrayOf("int8", (Long[]) value));
      try (ResultSet result = statement.executeQuery()) {
        return result.next();
      }
    } catch (SQLException e) {
      throw new DataCollectionException(e);
    }
```

### DuplicatedCode
Duplicated code
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresHeaderRepository.java`
#### Snippet
```java
    if (keys.isEmpty()) {
      return;
    }
    try (Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(delete)) {
      for (Long key : keys) {
        statement.clearParameters();
        statement.setObject(1, key);
        statement.addBatch();
      }
      statement.executeBatch();
    } catch (SQLException e) {
      throw new RepositoryException(e);
    }
```

### DuplicatedCode
Duplicated code
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresNodeRepository.java`
#### Snippet
```java
    try (Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(select)) {
      statement.setObject(1, key);
      try (ResultSet result = statement.executeQuery()) {
        if (result.next()) {
          return getValue(result);
        } else {
          return null;
        }
      }
    } catch (SQLException | JsonProcessingException e) {
      throw new RepositoryException(e);
    }
```

### DuplicatedCode
Duplicated code
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresNodeRepository.java`
#### Snippet
```java
          writer.writeLong(value.id());
          writer.writeInteger(value.getInfo().getVersion());
          writer.writeInteger(value.getInfo().getUid());
          writer.writeLocalDateTime(value.getInfo().getTimestamp());
          writer.writeLong(value.getInfo().getChangeset());
          writer.writeJsonb(PostgresJsonbMapper.toJson(value.getTags()));
```

### DuplicatedCode
Duplicated code
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresNodeRepository.java`
#### Snippet
```java
    long id = resultSet.getLong(1);
    int version = resultSet.getInt(2);
    int uid = resultSet.getInt(3);
    LocalDateTime timestamp = resultSet.getObject(4, LocalDateTime.class);
    long changeset = resultSet.getLong(5);
    Map<String, Object> tags = PostgresJsonbMapper.toMap(resultSet.getString(6));
```

### DuplicatedCode
Duplicated code
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresNodeRepository.java`
#### Snippet
```java
    statement.setObject(1, value.id());
    statement.setObject(2, value.getInfo().getVersion());
    statement.setObject(3, value.getInfo().getUid());
    statement.setObject(4, value.getInfo().getTimestamp());
    statement.setObject(5, value.getInfo().getChangeset());
    statement.setObject(6, PostgresJsonbMapper.toJson(value.getTags()));
```

### DuplicatedCode
Duplicated code
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlChangeSpliterator.java`
#### Snippet
```java
    long id = Long.parseLong(reader.getAttributeValue(null, ATTRIBUTE_NAME_ID));
    Info info = readInfo();
    double latitude = Double.parseDouble(reader.getAttributeValue(null, ATTRIBUTE_NAME_LATITUDE));
    double longitude = Double.parseDouble(reader.getAttributeValue(null, ATTRIBUTE_NAME_LONGITUDE));

    // read the content of the node
    Map<String, Object> tags = new HashMap<>();
    reader.nextTag();
    while (reader.getEventType() == XMLStreamConstants.START_ELEMENT) {
      switch (reader.getLocalName()) {
        case ELEMENT_NAME_TAG:
          readTag(tags);
          break;
        default:
          readUnknownElement();
          break;
      }
    }

    return new Node(id, info, tags, latitude, longitude);
```

### DuplicatedCode
Duplicated code
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlChangeSpliterator.java`
#### Snippet
```java
    long id = Long.parseLong(reader.getAttributeValue(null, ATTRIBUTE_NAME_ID));
    Info info = readInfo();

    // read the content of the node
    Map<String, Object> tags = new HashMap<>();
    List<Long> members = new ArrayList<>();
    reader.nextTag();
    while (reader.getEventType() == XMLStreamConstants.START_ELEMENT) {
      switch (reader.getLocalName()) {
        case ELEMENT_NAME_TAG:
          readTag(tags);
          break;
        case ELEMENT_NAME_NODE_REFERENCE:
          readWayMember(members);
          break;
        default:
          readUnknownElement();
          break;
      }
    }

    return new Way(id, info, tags, members);
```

### DuplicatedCode
Duplicated code
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlChangeSpliterator.java`
#### Snippet
```java
    long id = Long.parseLong(reader.getAttributeValue(null, ATTRIBUTE_NAME_ID));
    Info info = readInfo();

    // read the content of the node
    Map<String, Object> tags = new HashMap<>();
    List<Member> members = new ArrayList<>();
    reader.nextTag();
    while (reader.getEventType() == XMLStreamConstants.START_ELEMENT) {
      switch (reader.getLocalName()) {
        case ELEMENT_NAME_TAG:
          readTag(tags);
          break;
        case ELEMENT_NAME_MEMBER:
          readRelationMember(members);
          break;
        default:
          readUnknownElement();
          break;
      }
    }

    return new Relation(id, info, tags, members);
```

### DuplicatedCode
Duplicated code
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlChangeSpliterator.java`
#### Snippet
```java
    long id = Long.parseLong(reader.getAttributeValue(null, ATTRIBUTE_NAME_REF));
    Member.MemberType type = Member.MemberType
        .valueOf(reader.getAttributeValue(null, ATTRIBUTE_NAME_TYPE).toUpperCase());
    String role = reader.getAttributeValue(null, ATTRIBUTE_NAME_ROLE);
    members.add(new Member(id, type, role));
    reader.nextTag();
    reader.nextTag();
```

### DuplicatedCode
Duplicated code
in `baremaps-core/src/main/java/org/apache/baremaps/storage/postgres/PostgresTable.java`
#### Snippet
```java
      for (int i = 1; i <= schema.columns().size(); i++) {
        var value = row.get(schema.columns().get(i - 1).name());
        if (value instanceof Geometry geometry) {
          statement.setBytes(i, GeometryUtils.serialize(geometry));
        } else {
          statement.setObject(i, value);
        }
      }
```

### DuplicatedCode
Duplicated code
in `baremaps-core/src/main/java/org/apache/baremaps/vectortile/VectorTileDecoder.java`
#### Snippet
```java
        i++;

        int length = count * 2;
        for (int j = 0; j < length; j += 2) {
          // Decode the parameters and move the cursor
          cx += parameter(encoding.get(i + j));
          cy += parameter(encoding.get(i + j + 1));

          // Start a new linear ring
          if (command == MOVE_TO) {
            coordinates.clear();
            coordinates.add(new Coordinate(cx, cy));
          }

          // Add the coordinate to the current linear ring
          else if (command == LINE_TO) {
            coordinates.add(new Coordinate(cx, cy));
          }
        }
```

### DuplicatedCode
Duplicated code
in `baremaps-core/src/main/java/org/apache/baremaps/vectortile/VectorTileDecoder.java`
#### Snippet
```java
      for (int j = 0; j < length; j += 2) {
        // Decode the parameters and move the cursor
        cx += parameter(encoding.get(i + j));
        cy += parameter(encoding.get(i + j + 1));

        // Start a new linestring
        if (command == MOVE_TO) {
          coordinates.clear();
          coordinates.add(new Coordinate(cx, cy));
        }

        // Add the coordinate to the current linestring
        else if (command == LINE_TO) {
          coordinates.add(new Coordinate(cx, cy));
        }
      }
```

### DuplicatedCode
Duplicated code
in `baremaps-core/src/main/java/org/apache/baremaps/vectortile/VectorTileEncoder.java`
#### Snippet
```java
    int dx = (int) Math.round(coordinate.getX()) - cx;
    int dy = (int) Math.round(coordinate.getY()) - cy;
    encoding.accept(parameter(dx));
    encoding.accept(parameter(dy));
    cx += dx;
    cy += dy;
```

### DuplicatedCode
Duplicated code
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/CreateEntityCollection.java`
#### Snippet
```java
    var referencesKeysFile = Files.createFile(cacheDir.resolve("references_keys"));
    var referencesValuesFile = Files.createFile(cacheDir.resolve("references_vals"));
    var referenceMap = new MonotonicDataMap<>(
        new MemoryAlignedDataList<>(new PairDataType<>(new LongDataType(), new LongDataType()),
            new MemoryMappedFile(referencesKeysFile)),
        new AppendOnlyBuffer<>(new LongListDataType(), new MemoryMappedFile(referencesValuesFile)));
```

### DuplicatedCode
Duplicated code
in `baremaps-server/src/main/java/org/apache/baremaps/server/DevResources.java`
#### Snippet
```java
    path = String.format("assets/%s", path);
    try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(path)) {
      var bytes = inputStream.readAllBytes();
      return Response.ok().entity(bytes).build();
    } catch (NullPointerException | IOException e) {
      return Response.status(404).build();
    }
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
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

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/model/Info.java`
#### Snippet
```java
  protected final long changeset;

  protected final int uid;

  /**
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/model/Info.java`
#### Snippet
```java
public final class Info {

  protected final int version;

  protected final LocalDateTime timestamp;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/model/Info.java`
#### Snippet
```java
  protected final int version;

  protected final LocalDateTime timestamp;

  protected final long changeset;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/model/Info.java`
#### Snippet
```java
  protected final LocalDateTime timestamp;

  protected final long changeset;

  protected final int uid;
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/postgres/PostgresStore.java`
#### Snippet
```java
   */
  protected String createTable(Schema schema) {
    StringBuilder builder = new StringBuilder();
    builder.append("CREATE TABLE \"");
    builder.append(schema.name());
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/postgres/PostgresStore.java`
#### Snippet
```java
   */
  protected String copy(Schema schema) {
    var builder = new StringBuilder();
    builder.append("COPY \"");
    builder.append(schema.name());
```

## RuleId[id=Deprecation]
### Deprecation
'contextResolverFor(com.fasterxml.jackson.databind.ObjectMapper)' is deprecated
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/map/Dev.java`
#### Snippet
```java
      // Configure the application
      var application = new ResourceConfig().register(CorsFilter.class).register(DevResources.class)
          .register(contextResolverFor(objectMapper)).register(new AbstractBinder() {
            @Override
            protected void configure() {
```

### Deprecation
'contextResolverFor(com.fasterxml.jackson.databind.ObjectMapper)' is deprecated
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/map/Serve.java`
#### Snippet
```java
    var application =
        new ResourceConfig().register(CorsFilter.class).register(ServerResources.class)
            .register(contextResolverFor(objectMapper)).register(new AbstractBinder() {
              @Override
              protected void configure() {
```

### Deprecation
'stream(java.util.Collection)' is deprecated
in `baremaps-core/src/main/java/org/apache/baremaps/collection/DataMap.java`
#### Snippet
```java
   */
  public List<E> getAll(List<Long> keys) {
    return Streams.stream(keys).map(this::get).toList();
  }

```

### Deprecation
'createMultiPoint(org.locationtech.jts.geom.Coordinate\[\])' is deprecated
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/geometry/MultiPointDataType.java`
#### Snippet
```java
  public MultiPoint read(ByteBuffer buffer, int position) {
    var coordinates = coordinateArrayDataType.read(buffer, position);
    return geometryFactory.createMultiPoint(coordinates);
  }
}
```

### Deprecation
'Version(int, int, int, java.lang.String)' is deprecated
in `baremaps-core/src/main/java/org/apache/baremaps/vectortile/expression/Expressions.java`
#### Snippet
```java
  static String write(Expression expression) throws IOException {
    var mapper = new ObjectMapper();
    var simpleModule = new SimpleModule("SimpleModule", new Version(1, 0, 0, null));
    simpleModule.addSerializer(Expression.class, new ExpressionSerializer());
    mapper.registerModule(simpleModule);
```

### Deprecation
'Version(int, int, int, java.lang.String)' is deprecated
in `baremaps-core/src/main/java/org/apache/baremaps/vectortile/expression/Expressions.java`
#### Snippet
```java

  public static Module jacksonModule() {
    var simpleModule = new SimpleModule("SimpleModule", new Version(1, 0, 0, null));
    simpleModule.addDeserializer(Expression.class, new ExpressionDeserializer());
    return simpleModule;
```

### Deprecation
'Version(int, int, int, java.lang.String)' is deprecated
in `baremaps-core/src/main/java/org/apache/baremaps/vectortile/expression/Expressions.java`
#### Snippet
```java
  static Expression read(String json) throws IOException {
    var mapper = new ObjectMapper();
    var simpleModule = new SimpleModule("SimpleModule", new Version(1, 0, 0, null));
    simpleModule.addDeserializer(Expression.class, new ExpressionDeserializer());
    mapper.registerModule(simpleModule);
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
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

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Collection.contains()'
in `baremaps-core/src/main/java/org/apache/baremaps/collection/MemoryAlignedDataMap.java`
#### Snippet
```java
  @Override
  public boolean containsValue(Object value) {
    return values().contains(value);
  }

```

### SuspiciousMethodCalls
Suspicious call to 'AbstractCollection.contains()'
in `baremaps-core/src/main/java/org/apache/baremaps/collection/MonotonicDataMap.java`
#### Snippet
```java
  @Override
  public boolean containsValue(Object value) {
    return values.contains(value);
  }

```

### SuspiciousMethodCalls
Suspicious call to 'AbstractCollection.contains()'
in `baremaps-core/src/main/java/org/apache/baremaps/collection/MonotonicFixedSizeDataMap.java`
#### Snippet
```java
  @Override
  public boolean containsValue(Object value) {
    return values.contains(value);
  }

```

### SuspiciousMethodCalls
Suspicious call to 'AbstractCollection.contains()'
in `baremaps-core/src/main/java/org/apache/baremaps/collection/MonotonicFixedSizeDataMap.java`
#### Snippet
```java
  @Override
  public boolean containsKey(Object key) {
    return keys.contains(key);
  }

```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileByteReader.java`
#### Snippet
```java
   */
  private Geometry readMultiplePolygon(int numParts, int numPoints) {
    /**
     * From ESRI Specification : Parts : 0 5 (meaning : 0 designs the first v1, 5 designs the first
     * v5 on the points list below). Points : v1 v2 v3 v4 v1 v5 v8 v7 v6 v5
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/TransformEntityCollection.java`
#### Snippet
```java

      @Override
      public Iterator<Row> iterator() {
        return groups.entrySet().stream().flatMap(entry -> {
          var tags = IntStream.range(0, recipe.groupBy.size()).boxed()
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/map/Export.java`
#### Snippet
```java
  @Option(names = {"--batch-array-index"}, paramLabel = "READER",
      description = "The index of the batch in the array.")
  private int batchArrayIndex = 0;

  @Option(names = {"--mbtiles"}, paramLabel = "MBTILES",
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/map/Export.java`
#### Snippet
```java
  @Option(names = {"--mbtiles"}, paramLabel = "MBTILES",
      description = "The repository is in the MBTiles format.")
  private boolean mbtiles = false;

  @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/map/Export.java`
#### Snippet
```java
  @Option(names = {"--batch-array-size"}, paramLabel = "BATCH_ARRAY_SIZE",
      description = "The size of the batch array.")
  private int batchArraySize = 1;

  @Option(names = {"--batch-array-index"}, paramLabel = "READER",
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/database/UpdateOpenStreetMap.java`
#### Snippet
```java
  @Option(names = {"--srid"}, paramLabel = "SRID",
      description = "The projection used by the database.")
  private int srid = 3857;

  @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/database/ImportOpenStreetMap.java`
#### Snippet
```java
  @Option(names = {"--srid"}, paramLabel = "SRID",
      description = "The projection used by the database.")
  private int srid = 3857;

  @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baremaps-server/src/main/java/org/apache/baremaps/server/DevResources.java`
#### Snippet
```java
  private final ObjectMapper objectMapper;

  private final Sse sse;

  private final SseBroadcaster sseBroadcaster;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/geocoder/Search.java`
#### Snippet
```java
      names = {"--country"}, paramLabel = "COUNTRY", description = "The country code filter.",
      required = false)
  private String countryCode = "";

  @Option(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/geocoder/Search.java`
#### Snippet
```java
      names = {"--limit"}, paramLabel = "LIMIT",
      description = "The number of result to return.", required = false)
  private Integer limit = 10;

  @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/map/Dev.java`
#### Snippet
```java

  @Option(names = {"--port"}, paramLabel = "PORT", description = "The port of the server.")
  private int port = 9000;

  @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/geocoder/Serve.java`
#### Snippet
```java

  @Option(names = {"--port"}, paramLabel = "PORT", description = "The port of the server.")
  private int port = 9000;

  @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/iploc/Serve.java`
#### Snippet
```java

  @Option(names = {"--port"}, paramLabel = "PORT", description = "The port of the server.")
  private int port = 9000;

  @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/ogcapi/OgcApi.java`
#### Snippet
```java

  @Option(names = {"--port"}, paramLabel = "PORT", description = "The port of the server.")
  private int port = 9000;

  @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/ogcapi/OgcApi.java`
#### Snippet
```java

  @Option(names = {"--cache"}, paramLabel = "CACHE", description = "The caffeine cache directive.")
  private String cache = "";

  @Option(names = {"--tileset"}, paramLabel = "TILESET", description = "The tileset file.",
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/map/Serve.java`
#### Snippet
```java

  @Option(names = {"--port"}, paramLabel = "PORT", description = "The port of the server.")
  private int port = 9000;

  @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/map/Serve.java`
#### Snippet
```java

  @Option(names = {"--cache"}, paramLabel = "CACHE", description = "The caffeine cache directive.")
  private String cache = "";

  @Option(names = {"--tileset"}, paramLabel = "TILESET", description = "The tileset file.",
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baremaps-core/src/main/java/org/apache/baremaps/iploc/IpLocMapper.java`
#### Snippet
```java
  private static final Logger logger = LoggerFactory.getLogger(IpLocMapper.class);

  private final float SCORE_THRESHOLD = 0.1f;

  private final SearcherManager searcherManager;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DBaseFieldDescriptor.java`
#### Snippet
```java

  /** Field address (Field data address (address is set in memory; not useful on disk). */
  private byte[] fieldAddress = new byte[4];

  /** Field length. */
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DBaseFieldDescriptor.java`
#### Snippet
```java
  /** Undocumented use. */
  @SuppressWarnings("unused") // Kept in case of later ALTER TABLE sql calls.
  private byte setFields;

  /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DBaseFieldDescriptor.java`
#### Snippet
```java

  /** Reserved 3. */
  private byte[] dbasePlusLanReserved3 = new byte[2];

  /** Undocumented use. */
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DBaseFieldDescriptor.java`
#### Snippet
```java
  /** Work area id. */
  @SuppressWarnings("unused") // Kept in case of later ALTER TABLE sql calls.
  private byte workAreaID;

  /** Reserved 3. */
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DBaseFieldDescriptor.java`
#### Snippet
```java

  /** Reserved 2. */
  private byte[] dbasePlusLanReserved2 = new byte[2];

  /** Work area id. */
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileInputStream.java`
#### Snippet
```java

  /** Database file. */
  private File databaseFile;

  /** Shapefile index. */
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileInputStream.java`
#### Snippet
```java

  /** Shapefile. */
  private File shapefile;

  /** Database file. */
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileByteReader.java`
#### Snippet
```java

  /** Shapefile records lengths (loaded from .SHX file, if any found). */
  private ArrayList<Integer> recordsLengths;

  /** JTS geometry factory. */
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DbaseByteReader.java`
#### Snippet
```java

  /** Connection properties. */
  private Properties info;

  /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baremaps-core/src/main/java/org/apache/baremaps/tilestore/TileCoordIterator.java`
#### Snippet
```java
  private final Envelope envelope;

  private final int minZoom;

  private final int maxZoom;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baremaps-core/src/main/java/org/apache/baremaps/tilestore/postgres/PostgresQueryGenerator.java`
#### Snippet
```java
  private final String schemaPattern;
  private final String tableNamePattern;
  private final String columnNamePattern;
  private final String[] types;

```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `baremaps-core/src/main/java/org/apache/baremaps/tilestore/TileCache.java`
#### Snippet
```java
      try {
        var buffer = tileStore.read(t);
        if (buffer == null) {
          return null;
        } else {
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `baremaps-core/src/main/java/org/apache/baremaps/utils/FileUtils.java`
#### Snippet
```java
  public static void deleteRecursively(Path path) throws IOException {
    try (Stream<Path> files = Files.walk(path)) {
      files.sorted(Comparator.reverseOrder()).map(Path::toFile).forEach(File::delete);
    }
  }
```

### IgnoreResultOfCall
Result of `FileChannel.write()` is ignored
in `baremaps-core/src/main/java/org/apache/baremaps/storage/flatgeobuf/FlatGeoBufTable.java`
#### Snippet
```java
        ByteBuffer data = featureBuilder.dataBuffer();
        while (data.hasRemaining()) {
          channel.write(data);
        }
      }
```

## RuleId[id=AccessStaticViaInstance]
### AccessStaticViaInstance
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

### AccessStaticViaInstance
Static member 'java.net.HttpURLConnection.setFollowRedirects(boolean)' accessed via instance reference
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/DownloadUrl.java`
#### Snippet
```java

    var get = (HttpURLConnection) targetUrl.openConnection();
    get.setFollowRedirects(true);
    get.setRequestMethod("GET");
    try (var inputStream = get.getInputStream()) {
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/geocoder/Search.java`
#### Snippet
```java
  @Option(
      names = {"--country"}, paramLabel = "COUNTRY", description = "The country code filter.",
      required = false)
  private String countryCode = "";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/geocoder/Search.java`
#### Snippet
```java
  @Option(
      names = {"--limit"}, paramLabel = "LIMIT",
      description = "The number of result to return.", required = false)
  private Integer limit = 10;

```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import org.apache.baremaps.openstreetmap.repository.BlockImporter;`
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/ImportOpenStreetMap.java`
#### Snippet
```java
import org.apache.baremaps.openstreetmap.postgres.PostgresWayRepository;
import org.apache.baremaps.openstreetmap.repository.*;
import org.apache.baremaps.openstreetmap.repository.BlockImporter;
import org.apache.baremaps.stream.StreamUtils;
import org.apache.baremaps.utils.FileUtils;
```

### UNUSED_IMPORT
Unused import `import org.apache.baremaps.openstreetmap.repository.ChangeImporter;`
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/UpdateOpenStreetMap.java`
#### Snippet
```java
import org.apache.baremaps.openstreetmap.postgres.PostgresWayRepository;
import org.apache.baremaps.openstreetmap.repository.*;
import org.apache.baremaps.openstreetmap.repository.ChangeImporter;
import org.apache.baremaps.openstreetmap.state.StateReader;
import org.apache.baremaps.openstreetmap.xml.XmlChangeReader;
```

## RuleId[id=SuspiciousToArrayCall]
### SuspiciousToArrayCall
Array of type 'org.locationtech.jts.geom.LineString\[\]' expected, 'org.locationtech.jts.geom.LinearRing\[\]' found
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/geometry/PolygonDataType.java`
#### Snippet
```java
    }

    return geometryFactory.createPolygon(exteriorRing, interiorRings.toArray(LinearRing[]::new));
  }
}
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param nicObject` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/iploc/NicUtils.java`
#### Snippet
```java
   * Returns true if the NIC object is an inetnum.
   *
   * @param nicObject
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/iploc/NicUtils.java`
#### Snippet
```java
   *
   * @param nicObject
   * @return
   */
  public static boolean isInetnum(NicObject nicObject) {
```

### JavadocDeclaration
`@param geometry` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/utils/GeometryUtils.java`
#### Snippet
```java
   * Serializes a geometry in the WKB format.
   *
   * @param geometry
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/utils/GeometryUtils.java`
#### Snippet
```java
   *
   * @param geometry
   * @return
   */
  public static byte[] serialize(Geometry geometry) {
```

### JavadocDeclaration
`@param wkb` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/utils/GeometryUtils.java`
#### Snippet
```java
   * Deserializes a geometry in the WKB format.
   *
   * @param wkb
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/utils/GeometryUtils.java`
#### Snippet
```java
   *
   * @param wkb
   * @return
   */
  public static Geometry deserialize(byte[] wkb) {
```

### JavadocDeclaration
`@return` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/iploc/NicObject.java`
#### Snippet
```java
   * Return the attributes as a map
   *
   * @return
   */
  public Map<String, String> toMap() {
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/utils/SqliteUtils.java`
#### Snippet
```java
   * @param databaseUrl the JDBC url
   * @param resource the path of the resource file
   * @throws SQLException
   */
  public static void executeResource(String databaseUrl, String resource)
```

### JavadocDeclaration
`@return` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/ConsumerUtils.java`
#### Snippet
```java
   *
   * @param type the type of the input
   * @return
   * @param <T>
   */
```

### JavadocDeclaration
`@param ` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/ConsumerUtils.java`
#### Snippet
```java
   * @param type the type of the input
   * @return
   * @param <T>
   */
  public static <T> Consumer<T> chain(Class<T> type) {
```

### JavadocDeclaration
`@param asyncStream` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   * Buffer the completion of the provided asynchronous stream according to a buffer size.
   *
   * @param asyncStream
   * @param bufferSize
   * @param <T>
```

### JavadocDeclaration
`@param bufferSize` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   *
   * @param asyncStream
   * @param bufferSize
   * @param <T>
   * @return a buffered stream
```

### JavadocDeclaration
`@param ` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   * @param asyncStream
   * @param bufferSize
   * @param <T>
   * @return a buffered stream
   */
```

### JavadocDeclaration
`@param iterator` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   * Create an ordered sequential stream from an iterator of unknown size.
   *
   * @param iterator
   * @param <T>
   * @return a ordered sequential stream.
```

### JavadocDeclaration
`@param ` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   *
   * @param iterator
   * @param <T>
   * @return a ordered sequential stream.
   */
```

### JavadocDeclaration
`@param stream` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   * Buffer the asynchronous mapping of the provided stream according to a buffer size.
   *
   * @param stream
   * @param asyncMapper
   * @param bufferSize
```

### JavadocDeclaration
`@param asyncMapper` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   *
   * @param stream
   * @param asyncMapper
   * @param bufferSize
   * @param <T>
```

### JavadocDeclaration
`@param bufferSize` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   * @param stream
   * @param asyncMapper
   * @param bufferSize
   * @param <T>
   * @return a buffered stream
```

### JavadocDeclaration
`@param ` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   * @param asyncMapper
   * @param bufferSize
   * @param <T>
   * @return a buffered stream
   */
```

### JavadocDeclaration
`@param asyncStream` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   * and a buffer size.
   *
   * @param asyncStream
   * @param completionOrder
   * @param <T>
```

### JavadocDeclaration
`@param completionOrder` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   *
   * @param asyncStream
   * @param completionOrder
   * @param <T>
   * @return a buffered stream
```

### JavadocDeclaration
`@param ` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   * @param asyncStream
   * @param completionOrder
   * @param <T>
   * @return a buffered stream
   */
```

### JavadocDeclaration
`@param asyncStream` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   * and a buffer size.
   *
   * @param asyncStream
   * @param completionOrder
   * @param bufferSize
```

### JavadocDeclaration
`@param completionOrder` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   *
   * @param asyncStream
   * @param completionOrder
   * @param bufferSize
   * @param <T>
```

### JavadocDeclaration
`@param bufferSize` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   * @param asyncStream
   * @param completionOrder
   * @param bufferSize
   * @param <T>
   * @return a buffered stream
```

### JavadocDeclaration
`@param ` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   * @param completionOrder
   * @param bufferSize
   * @param <T>
   * @return a buffered stream
   */
```

### JavadocDeclaration
`@param stream` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   * Buffer the asynchronous mapping of the provided stream according to a buffer size.
   *
   * @param stream
   * @param asyncMapper
   * @param bufferSize
```

### JavadocDeclaration
`@param asyncMapper` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   *
   * @param stream
   * @param asyncMapper
   * @param bufferSize
   * @param <T>
```

### JavadocDeclaration
`@param bufferSize` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   * @param stream
   * @param asyncMapper
   * @param bufferSize
   * @param <T>
   * @return a buffered stream
```

### JavadocDeclaration
`@param ` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   * @param asyncMapper
   * @param bufferSize
   * @param <T>
   * @return a buffered stream
   */
```

### JavadocDeclaration
`@param asyncStream` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   * Buffer the completion of the provided asynchronous stream according to a buffer size.
   *
   * @param asyncStream
   * @param bufferSize
   * @param <T>
```

### JavadocDeclaration
`@param bufferSize` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   *
   * @param asyncStream
   * @param bufferSize
   * @param <T>
   * @return a buffered stream
```

### JavadocDeclaration
`@param ` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   * @param asyncStream
   * @param bufferSize
   * @param <T>
   * @return a buffered stream
   */
```

### JavadocDeclaration
`@param stream` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   * Parallelize the provided stream of unknown size and split it according to the batch size.
   *
   * @param stream
   * @param batchSize
   * @param <T>
```

### JavadocDeclaration
`@param batchSize` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   *
   * @param stream
   * @param batchSize
   * @param <T>
   * @return a parallel stream
```

### JavadocDeclaration
`@param ` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   * @param stream
   * @param batchSize
   * @param <T>
   * @return a parallel stream
   */
```

### JavadocDeclaration
`@param stream` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   * Buffer the asynchronous mapping of the provided stream according to a buffer size.
   *
   * @param stream
   * @param asyncMapper
   * @param bufferSize
```

### JavadocDeclaration
`@param asyncMapper` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   *
   * @param stream
   * @param asyncMapper
   * @param bufferSize
   * @param <T>
```

### JavadocDeclaration
`@param bufferSize` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   * @param stream
   * @param asyncMapper
   * @param bufferSize
   * @param <T>
   * @return a buffered stream
```

### JavadocDeclaration
`@param ` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   * @param asyncMapper
   * @param bufferSize
   * @param <T>
   * @return a buffered stream
   */
```

### JavadocDeclaration
`@param stream` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   * Parallelize the provided stream of unknown size.
   *
   * @param stream
   * @param <T>
   * @return a parallel stream
```

### JavadocDeclaration
`@param ` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/stream/StreamUtils.java`
#### Snippet
```java
   *
   * @param stream
   * @param <T>
   * @return a parallel stream
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/PostgresUtils.java`
#### Snippet
```java
   * @param connection the JDBC connection
   * @param resource the path of the resource file
   * @throws IOException
   * @throws SQLException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/PostgresUtils.java`
#### Snippet
```java
   * @param resource the path of the resource file
   * @throws IOException
   * @throws SQLException
   */
  public static void executeResource(Connection connection, String resource)
```

### JavadocDeclaration
`@param value` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   * Writes a list of short values.
   *
   * @param value
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   *
   * @param value
   * @throws IOException
   */
  public void writeShortList(List<Short> value) throws IOException {
```

### JavadocDeclaration
`@param value` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   * Writes a list of date values.
   *
   * @param value
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   *
   * @param value
   * @throws IOException
   */
  public void writeLocalDateTime(LocalDateTime value) throws IOException {
```

### JavadocDeclaration
`@param value` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   * Writes a float value.
   *
   * @param value
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   *
   * @param value
   * @throws IOException
   */
  public void writeFloat(Float value) throws IOException {
```

### JavadocDeclaration
`@param value` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   * Writes a jsonb array
   *
   * @param value
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   *
   * @param value
   * @throws IOException
   */
  public void writeJsonb(String value) throws IOException {
```

### JavadocDeclaration
`@param value` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   * Writes an inet adress value.
   *
   * @param value
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   *
   * @param value
   * @throws IOException
   */
  public void writeInet4Adress(Inet4Address value) throws IOException {
```

### JavadocDeclaration
`@param value` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   * Writes a list of long values.
   *
   * @param value
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   *
   * @param value
   * @throws IOException
   */
  public void writeLongList(List<Long> value) throws IOException {
```

### JavadocDeclaration
`@param value` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   * Writes a double value.
   *
   * @param value
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   *
   * @param value
   * @throws IOException
   */
  public void writeDouble(Double value) throws IOException {
```

### JavadocDeclaration
`@param value` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   * Writes a map value.
   *
   * @param value
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   *
   * @param value
   * @throws IOException
   */
  public void writeHstore(Map<String, String> value) throws IOException {
```

### JavadocDeclaration
`@param value` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   * Writes a long value.
   *
   * @param value
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   *
   * @param value
   * @throws IOException
   */
  public void writeLong(Long value) throws IOException {
```

### JavadocDeclaration
`@param columns` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   * Writes the number of columns affected by the query.
   *
   * @param columns
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   *
   * @param columns
   * @throws IOException
   */
  public void startRow(int columns) throws IOException {
```

### JavadocDeclaration
`@param value` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   * Writes a list of float values.
   *
   * @param value
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   *
   * @param value
   * @throws IOException
   */
  public void writeFloatList(List<Float> value) throws IOException {
```

### JavadocDeclaration
`@param value` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   * Writes a list of string values.
   *
   * @param value
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   *
   * @param value
   * @throws IOException
   */
  public void write(List<String> value) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   * Writes a null value.
   *
   * @throws IOException
   */
  public void writeNull() throws IOException {
```

### JavadocDeclaration
`@param value` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   * Writes a date value.
   *
   * @param value
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   *
   * @param value
   * @throws IOException
   */
  public void writeLocalDate(LocalDate value) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   * Writes the header of the query.
   *
   * @throws IOException
   */
  public void writeHeader() throws IOException {
```

### JavadocDeclaration
`@param value` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   * Writes a list of integer values.
   *
   * @param value
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   *
   * @param value
   * @throws IOException
   */
  public void writeIntegerList(List<Integer> value) throws IOException {
```

### JavadocDeclaration
`@param value` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   * Writes a list of double values.
   *
   * @param value
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   *
   * @param value
   * @throws IOException
   */
  public void writeDoubleArray(List<Double> value) throws IOException {
```

### JavadocDeclaration
`@param value` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   * Writes a list of boolean values.
   *
   * @param value
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   *
   * @param value
   * @throws IOException
   */
  public void writeBooleanList(List<Boolean> value) throws IOException {
```

### JavadocDeclaration
`@param value` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   * Writes a short value.
   *
   * @param value
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   *
   * @param value
   * @throws IOException
   */
  public void writeShort(Short value) throws IOException {
```

### JavadocDeclaration
`@param value` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   * Writes a byte value.
   *
   * @param value
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   *
   * @param value
   * @throws IOException
   */
  public void writeByte(Byte value) throws IOException {
```

### JavadocDeclaration
`@param value` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   * Writes a list of inet adress values.
   *
   * @param value
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   *
   * @param value
   * @throws IOException
   */
  public void writeInet6Adress(Inet6Address value) throws IOException {
```

### JavadocDeclaration
`@param value` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   * Writes a boolean value.
   *
   * @param value
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   *
   * @param value
   * @throws IOException
   */
  public void writeBoolean(Boolean value) throws IOException {
```

### JavadocDeclaration
`@param value` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   * Writes a string value.
   *
   * @param value
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   *
   * @param value
   * @throws IOException
   */
  public void write(String value) throws IOException {
```

### JavadocDeclaration
`@param value` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   * Writes a byte array value.
   *
   * @param value
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   *
   * @param value
   * @throws IOException
   */
  public void writeByteArray(byte[] value) throws IOException {
```

### JavadocDeclaration
`@param value` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   * Writes an integer value.
   *
   * @param value
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   *
   * @param value
   * @throws IOException
   */
  public void writeInteger(Integer value) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   * Writes a null value.
   *
   * @throws IOException
   */
  public <T> void write(BaseValueHandler<T> handler, T value) throws IOException {
```

### JavadocDeclaration
`@param value` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   * Writes a geometry value.
   *
   * @param value
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   *
   * @param value
   * @throws IOException
   */
  public void writeGeometry(Geometry value) throws IOException {
```

### JavadocDeclaration
`@param data` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/postgres/copy/CopyWriter.java`
#### Snippet
```java
   * Copyright (c) The PgBulkInsert Team.
   *
   * @param data
   */
  public CopyWriter(PGCopyOutputStream data) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/tilestore/TileStore.java`
#### Snippet
```java
   * @param tileCoord the tile coordinate
   * @return the content of the tile
   * @throws TileStoreException
   */
  ByteBuffer read(TileCoord tileCoord) throws TileStoreException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/tilestore/TileStore.java`
#### Snippet
```java
   *
   * @param tileCoord the tile coordinate
   * @throws TileStoreException
   */
  void delete(TileCoord tileCoord) throws TileStoreException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/tilestore/TileStore.java`
#### Snippet
```java
   * @param tileCoord the tile coordinate
   * @param blob the content of the tile
   * @throws TileStoreException
   */
  void write(TileCoord tileCoord, ByteBuffer blob) throws TileStoreException;
```

### JavadocDeclaration
`@param tileStore` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/tilestore/TileCache.java`
#### Snippet
```java
   * Decorates the TileStore with a cache.
   *
   * @param tileStore
   * @param spec
   */
```

### JavadocDeclaration
`@param spec` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/tilestore/TileCache.java`
#### Snippet
```java
   *
   * @param tileStore
   * @param spec
   */
  public TileCache(TileStore tileStore, CaffeineSpec spec) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/tilestore/mbtiles/MBTiles.java`
#### Snippet
```java
   * Initializes the SQLite database.
   *
   * @throws TileStoreException
   */
  public void initializeDatabase() throws TileStoreException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/tilestore/mbtiles/MBTiles.java`
#### Snippet
```java
   *
   * @return the metadata
   * @throws IOException
   */
  public Map<String, String> readMetadata() throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/tilestore/mbtiles/MBTiles.java`
#### Snippet
```java
   *
   * @param metadata the metadata
   * @throws IOException
   */
  public void writeMetadata(Map<String, String> metadata) throws IOException {
```

### JavadocDeclaration
`@param size` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/MemoryAlignedDataType.java`
#### Snippet
```java
   * Constructs a {@link MemoryAlignedDataType}.
   *
   * @param size
   */
  public MemoryAlignedDataType(int size) {
```

### JavadocDeclaration
`@param geometryFactory` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/geometry/GeometryDataType.java`
#### Snippet
```java
   * Constructs a {@code GeometryDataType} with a specified {@code GeometryFactory}.
   *
   * @param geometryFactory
   */
  public GeometryDataType(GeometryFactory geometryFactory) {
```

### JavadocDeclaration
`@param minX` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/collection/algorithm/Hilbert.java`
#### Snippet
```java
     * Constructs a new Hilbert comparator.
     * 
     * @param minX
     * @param minY
     * @param width
```

### JavadocDeclaration
`@param minY` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/collection/algorithm/Hilbert.java`
#### Snippet
```java
     * 
     * @param minX
     * @param minY
     * @param width
     * @param height
```

### JavadocDeclaration
`@param width` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/collection/algorithm/Hilbert.java`
#### Snippet
```java
     * @param minX
     * @param minY
     * @param width
     * @param height
     */
```

### JavadocDeclaration
`@param height` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/collection/algorithm/Hilbert.java`
#### Snippet
```java
     * @param minY
     * @param width
     * @param height
     */
    public HilberComparator(double minX, double minY, double width, double height) {
```

### JavadocDeclaration
`@param ` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/collection/algorithm/ExternalMergeSort.java`
#### Snippet
```java
   * @param distinct The flag indicating if duplicates should be discarded
   * @param parallel The flag indicating if parallelism should be used
   * @param <T>
   * @return the sorted batches
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/collection/algorithm/ExternalMergeSort.java`
#### Snippet
```java
   * @param distinct The flag indicating if duplicates should be discarded
   * @param parallel The flag indicating if parallelism should be used
   * @throws IOException
   */
  public static <T> void sort(
```

### JavadocDeclaration
`@param ` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/collection/algorithm/ExternalMergeSort.java`
#### Snippet
```java
   * @param distinct The flag indicating if duplicates should be discarded
   * @param parallel The flag indicating if parallelism should be used
   * @param <T>
   * @return the sorted batch
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/collection/algorithm/ExternalMergeSort.java`
#### Snippet
```java
   * @param distinct The flag indicating if duplicates should be discarded
   * @return the number of data sorted
   * @throws IOException
   */
  private static <T> long mergeSortedBatches(
```

### JavadocDeclaration
`@param input` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/pbf/BlobIterator.java`
#### Snippet
```java
   * Constructs a {@code BlobIterator} with the specified {@code InputStream}.
   *
   * @param input
   */
  public BlobIterator(InputStream input) {
```

### JavadocDeclaration
`@param input` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlChangeReader.java`
#### Snippet
```java
   * Creates an ordered stream of OSM changes from an XML file.
   *
   * @param input
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlChangeReader.java`
#### Snippet
```java
   *
   * @param input
   * @return
   */
  public Stream<Change> stream(InputStream input) {
```

### JavadocDeclaration
`@param input` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlEntityReader.java`
#### Snippet
```java
   * Creates an ordered stream of OSM entities from a XML file.
   *
   * @param input
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/xml/XmlEntityReader.java`
#### Snippet
```java
   *
   * @param input
   * @return
   */
  public Stream<Entity> stream(InputStream input) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/pbf/HeaderBlockReader.java`
#### Snippet
```java
   *
   * @param blob the blob
   * @throws DataFormatException
   * @throws InvalidProtocolBufferException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/pbf/HeaderBlockReader.java`
#### Snippet
```java
   * @param blob the blob
   * @throws DataFormatException
   * @throws InvalidProtocolBufferException
   */
  public HeaderBlockReader(Blob blob) throws DataFormatException, InvalidProtocolBufferException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/pbf/DataBlockReader.java`
#### Snippet
```java
   *
   * @param blob the blob
   * @throws DataFormatException
   * @throws InvalidProtocolBufferException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/pbf/DataBlockReader.java`
#### Snippet
```java
   * @param blob the blob
   * @throws DataFormatException
   * @throws InvalidProtocolBufferException
   */
  public DataBlockReader(Blob blob) throws DataFormatException, InvalidProtocolBufferException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/model/Blob.java`
#### Snippet
```java
   *
   * @return the data
   * @throws DataFormatException
   * @throws InvalidProtocolBufferException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/model/Blob.java`
#### Snippet
```java
   * @return the data
   * @throws DataFormatException
   * @throws InvalidProtocolBufferException
   */
  public ByteString data() throws DataFormatException, InvalidProtocolBufferException {
```

### JavadocDeclaration
`@param consumer` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/function/ChangeEntitiesHandler.java`
#### Snippet
```java
   * Change}.
   *
   * @param consumer
   */
  public ChangeEntitiesHandler(Consumer<Entity> consumer) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresJsonbMapper.java`
#### Snippet
```java
   * @param input a valid json object
   * @return a map with the entry of the objects
   * @throws JsonProcessingException
   */
  public static Map<String, Object> toMap(String input) throws JsonProcessingException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresJsonbMapper.java`
#### Snippet
```java
   * @param input a map with the entry of the object
   * @return a Json string representing the object
   * @throws JsonProcessingException
   */
  public static String toJson(Map<String, Object> input) throws JsonProcessingException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/repository/HeaderRepository.java`
#### Snippet
```java
   * Selects the latest header.
   *
   * @throws RepositoryException
   */
  Header selectLatest() throws RepositoryException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/repository/HeaderRepository.java`
#### Snippet
```java
   * Selects all the headers.
   *
   * @throws RepositoryException
   */
  List<Header> selectAll() throws RepositoryException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/repository/Repository.java`
#### Snippet
```java
   *
   * @param key the key of the value to delete
   * @throws RepositoryException
   */
  void delete(K key) throws RepositoryException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/repository/Repository.java`
#### Snippet
```java
   *
   * @param values a list of the values to put
   * @throws RepositoryException
   */
  void put(List<V> values) throws RepositoryException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/repository/Repository.java`
#### Snippet
```java
   * @param keys a list of keys
   * @return a list of values
   * @throws RepositoryException
   */
  List<V> get(List<K> keys) throws RepositoryException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/repository/Repository.java`
#### Snippet
```java
   *
   * @param keys the list of keys
   * @throws RepositoryException
   */
  void delete(List<K> keys) throws RepositoryException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/repository/Repository.java`
#### Snippet
```java
   *
   * @param value the value to put
   * @throws RepositoryException
   */
  void put(V value) throws RepositoryException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/repository/Repository.java`
#### Snippet
```java
   * @param key the id of the value
   * @return the selected value if it exists, null otherwise
   * @throws RepositoryException
   */
  V get(K key) throws RepositoryException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/repository/Repository.java`
#### Snippet
```java
   * Truncate the repository.
   *
   * @throws RepositoryException
   */
  void truncate() throws RepositoryException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/repository/Repository.java`
#### Snippet
```java
   * Drops the repository.
   *
   * @throws RepositoryException
   */
  void drop() throws RepositoryException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/repository/Repository.java`
#### Snippet
```java
   * Creates the repository.
   *
   * @throws RepositoryException
   */
  void create() throws RepositoryException;
```

### JavadocDeclaration
`@param style` tag description is missing
in `baremaps-ogcapi/src/main/java/org/apache/baremaps/ogcapi/StylesResource.java`
#### Snippet
```java
   * Constructs a {@code StylesResource}.
   *
   * @param style
   * @param objectMapper
   * @throws IOException
```

### JavadocDeclaration
`@param objectMapper` tag description is missing
in `baremaps-ogcapi/src/main/java/org/apache/baremaps/ogcapi/StylesResource.java`
#### Snippet
```java
   *
   * @param style
   * @param objectMapper
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-ogcapi/src/main/java/org/apache/baremaps/ogcapi/StylesResource.java`
#### Snippet
```java
   * @param style
   * @param objectMapper
   * @throws IOException
   */
  @Inject
```

### JavadocDeclaration
`@param dataSource` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresHeaderRepository.java`
#### Snippet
```java
   * Constructs a {@code PostgresHeaderRepository}.
   *
   * @param dataSource
   */
  public PostgresHeaderRepository(DataSource dataSource) {
```

### JavadocDeclaration
`@param dataSource` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresHeaderRepository.java`
#### Snippet
```java
   * Constructs a {@code PostgresHeaderRepository} with custom parameters.
   *
   * @param dataSource
   * @param tableName
   * @param replicationSequenceNumberColumn
```

### JavadocDeclaration
`@param tableName` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresHeaderRepository.java`
#### Snippet
```java
   *
   * @param dataSource
   * @param tableName
   * @param replicationSequenceNumberColumn
   * @param replicationTimestampColumn
```

### JavadocDeclaration
`@param replicationSequenceNumberColumn` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresHeaderRepository.java`
#### Snippet
```java
   * @param dataSource
   * @param tableName
   * @param replicationSequenceNumberColumn
   * @param replicationTimestampColumn
   * @param replicationUrlColumn
```

### JavadocDeclaration
`@param replicationTimestampColumn` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresHeaderRepository.java`
#### Snippet
```java
   * @param tableName
   * @param replicationSequenceNumberColumn
   * @param replicationTimestampColumn
   * @param replicationUrlColumn
   * @param sourceColumn
```

### JavadocDeclaration
`@param replicationUrlColumn` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresHeaderRepository.java`
#### Snippet
```java
   * @param replicationSequenceNumberColumn
   * @param replicationTimestampColumn
   * @param replicationUrlColumn
   * @param sourceColumn
   * @param writingProgramColumn
```

### JavadocDeclaration
`@param sourceColumn` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresHeaderRepository.java`
#### Snippet
```java
   * @param replicationTimestampColumn
   * @param replicationUrlColumn
   * @param sourceColumn
   * @param writingProgramColumn
   */
```

### JavadocDeclaration
`@param writingProgramColumn` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresHeaderRepository.java`
#### Snippet
```java
   * @param replicationUrlColumn
   * @param sourceColumn
   * @param writingProgramColumn
   */
  public PostgresHeaderRepository(DataSource dataSource, String tableName,
```

### JavadocDeclaration
`@param dataSource` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresWayRepository.java`
#### Snippet
```java
   * Constructs a {@code PostgresWayRepository} with custom parameters.
   *
   * @param dataSource
   * @param tableName
   * @param idColumn
```

### JavadocDeclaration
`@param tableName` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresWayRepository.java`
#### Snippet
```java
   *
   * @param dataSource
   * @param tableName
   * @param idColumn
   * @param versionColumn
```

### JavadocDeclaration
`@param idColumn` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresWayRepository.java`
#### Snippet
```java
   * @param dataSource
   * @param tableName
   * @param idColumn
   * @param versionColumn
   * @param uidColumn
```

### JavadocDeclaration
`@param versionColumn` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresWayRepository.java`
#### Snippet
```java
   * @param tableName
   * @param idColumn
   * @param versionColumn
   * @param uidColumn
   * @param timestampColumn
```

### JavadocDeclaration
`@param uidColumn` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresWayRepository.java`
#### Snippet
```java
   * @param idColumn
   * @param versionColumn
   * @param uidColumn
   * @param timestampColumn
   * @param changesetColumn
```

### JavadocDeclaration
`@param timestampColumn` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresWayRepository.java`
#### Snippet
```java
   * @param versionColumn
   * @param uidColumn
   * @param timestampColumn
   * @param changesetColumn
   * @param tagsColumn
```

### JavadocDeclaration
`@param changesetColumn` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresWayRepository.java`
#### Snippet
```java
   * @param uidColumn
   * @param timestampColumn
   * @param changesetColumn
   * @param tagsColumn
   * @param nodesColumn
```

### JavadocDeclaration
`@param tagsColumn` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresWayRepository.java`
#### Snippet
```java
   * @param timestampColumn
   * @param changesetColumn
   * @param tagsColumn
   * @param nodesColumn
   * @param geometryColumn
```

### JavadocDeclaration
`@param nodesColumn` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresWayRepository.java`
#### Snippet
```java
   * @param changesetColumn
   * @param tagsColumn
   * @param nodesColumn
   * @param geometryColumn
   */
```

### JavadocDeclaration
`@param geometryColumn` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresWayRepository.java`
#### Snippet
```java
   * @param tagsColumn
   * @param nodesColumn
   * @param geometryColumn
   */
  public PostgresWayRepository(DataSource dataSource, String tableName, String idColumn,
```

### JavadocDeclaration
`@param dataSource` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresNodeRepository.java`
#### Snippet
```java
   * Constructs a {@code PostgresNodeRepository} with custom parameters.
   *
   * @param dataSource
   * @param tableName
   * @param idColumn
```

### JavadocDeclaration
`@param tableName` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresNodeRepository.java`
#### Snippet
```java
   *
   * @param dataSource
   * @param tableName
   * @param idColumn
   * @param versionColumn
```

### JavadocDeclaration
`@param idColumn` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresNodeRepository.java`
#### Snippet
```java
   * @param dataSource
   * @param tableName
   * @param idColumn
   * @param versionColumn
   * @param uidColumn
```

### JavadocDeclaration
`@param versionColumn` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresNodeRepository.java`
#### Snippet
```java
   * @param tableName
   * @param idColumn
   * @param versionColumn
   * @param uidColumn
   * @param timestampColumn
```

### JavadocDeclaration
`@param uidColumn` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresNodeRepository.java`
#### Snippet
```java
   * @param idColumn
   * @param versionColumn
   * @param uidColumn
   * @param timestampColumn
   * @param changesetColumn
```

### JavadocDeclaration
`@param timestampColumn` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresNodeRepository.java`
#### Snippet
```java
   * @param versionColumn
   * @param uidColumn
   * @param timestampColumn
   * @param changesetColumn
   * @param tagsColumn
```

### JavadocDeclaration
`@param changesetColumn` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresNodeRepository.java`
#### Snippet
```java
   * @param uidColumn
   * @param timestampColumn
   * @param changesetColumn
   * @param tagsColumn
   * @param longitudeColumn
```

### JavadocDeclaration
`@param tagsColumn` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresNodeRepository.java`
#### Snippet
```java
   * @param timestampColumn
   * @param changesetColumn
   * @param tagsColumn
   * @param longitudeColumn
   * @param latitudeColumn
```

### JavadocDeclaration
`@param longitudeColumn` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresNodeRepository.java`
#### Snippet
```java
   * @param changesetColumn
   * @param tagsColumn
   * @param longitudeColumn
   * @param latitudeColumn
   * @param geometryColumn
```

### JavadocDeclaration
`@param latitudeColumn` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresNodeRepository.java`
#### Snippet
```java
   * @param tagsColumn
   * @param longitudeColumn
   * @param latitudeColumn
   * @param geometryColumn
   */
```

### JavadocDeclaration
`@param geometryColumn` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresNodeRepository.java`
#### Snippet
```java
   * @param longitudeColumn
   * @param latitudeColumn
   * @param geometryColumn
   */
  public PostgresNodeRepository(DataSource dataSource, String tableName, String idColumn,
```

### JavadocDeclaration
`@param dataSource` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresNodeRepository.java`
#### Snippet
```java
   * Constructs a {@code PostgresNodeRepository}.
   *
   * @param dataSource
   */
  public PostgresNodeRepository(DataSource dataSource) {
```

### JavadocDeclaration
`@param uriInfo` tag description is missing
in `baremaps-ogcapi/src/main/java/org/apache/baremaps/ogcapi/TilesResource.java`
#### Snippet
```java
   * Constructs a {@code StylesResource}.
   *
   * @param uriInfo
   * @param tilesetPath
   * @param objectMapper
```

### JavadocDeclaration
`@param tilesetPath` tag description is missing
in `baremaps-ogcapi/src/main/java/org/apache/baremaps/ogcapi/TilesResource.java`
#### Snippet
```java
   *
   * @param uriInfo
   * @param tilesetPath
   * @param objectMapper
   * @throws IOException
```

### JavadocDeclaration
`@param objectMapper` tag description is missing
in `baremaps-ogcapi/src/main/java/org/apache/baremaps/ogcapi/TilesResource.java`
#### Snippet
```java
   * @param uriInfo
   * @param tilesetPath
   * @param objectMapper
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `baremaps-ogcapi/src/main/java/org/apache/baremaps/ogcapi/TilesResource.java`
#### Snippet
```java
   * @param tilesetPath
   * @param objectMapper
   * @throws IOException
   */
  @Inject
```

### JavadocDeclaration
`@param dataSource` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresRelationRepository.java`
#### Snippet
```java
   * Constructs a {@code PostgresRelationRepository}.
   *
   * @param dataSource
   */
  public PostgresRelationRepository(DataSource dataSource) {
```

### JavadocDeclaration
`@param dataSource` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresRelationRepository.java`
#### Snippet
```java
   * Constructs a {@code PostgresRelationRepository} with custom parameters.
   *
   * @param dataSource
   * @param tableName
   * @param idColumn
```

### JavadocDeclaration
`@param tableName` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresRelationRepository.java`
#### Snippet
```java
   *
   * @param dataSource
   * @param tableName
   * @param idColumn
   * @param versionColumn
```

### JavadocDeclaration
`@param idColumn` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresRelationRepository.java`
#### Snippet
```java
   * @param dataSource
   * @param tableName
   * @param idColumn
   * @param versionColumn
   * @param uidColumn
```

### JavadocDeclaration
`@param versionColumn` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresRelationRepository.java`
#### Snippet
```java
   * @param tableName
   * @param idColumn
   * @param versionColumn
   * @param uidColumn
   * @param timestampColumn
```

### JavadocDeclaration
`@param uidColumn` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresRelationRepository.java`
#### Snippet
```java
   * @param idColumn
   * @param versionColumn
   * @param uidColumn
   * @param timestampColumn
   * @param changesetColumn
```

### JavadocDeclaration
`@param timestampColumn` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresRelationRepository.java`
#### Snippet
```java
   * @param versionColumn
   * @param uidColumn
   * @param timestampColumn
   * @param changesetColumn
   * @param tagsColumn
```

### JavadocDeclaration
`@param changesetColumn` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresRelationRepository.java`
#### Snippet
```java
   * @param uidColumn
   * @param timestampColumn
   * @param changesetColumn
   * @param tagsColumn
   * @param memberRefs
```

### JavadocDeclaration
`@param tagsColumn` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresRelationRepository.java`
#### Snippet
```java
   * @param timestampColumn
   * @param changesetColumn
   * @param tagsColumn
   * @param memberRefs
   * @param memberTypes
```

### JavadocDeclaration
`@param memberRefs` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresRelationRepository.java`
#### Snippet
```java
   * @param changesetColumn
   * @param tagsColumn
   * @param memberRefs
   * @param memberTypes
   * @param memberRoles
```

### JavadocDeclaration
`@param memberTypes` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresRelationRepository.java`
#### Snippet
```java
   * @param tagsColumn
   * @param memberRefs
   * @param memberTypes
   * @param memberRoles
   * @param geometryColumn
```

### JavadocDeclaration
`@param memberRoles` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresRelationRepository.java`
#### Snippet
```java
   * @param memberRefs
   * @param memberTypes
   * @param memberRoles
   * @param geometryColumn
   */
```

### JavadocDeclaration
`@param geometryColumn` tag description is missing
in `baremaps-core/src/main/java/org/apache/baremaps/openstreetmap/postgres/PostgresRelationRepository.java`
#### Snippet
```java
   * @param memberTypes
   * @param memberRoles
   * @param geometryColumn
   */
  public PostgresRelationRepository(DataSource dataSource, String tableName, String idColumn,
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `batchArrayIndex` may be 'final'
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/map/Export.java`
#### Snippet
```java
  @Option(names = {"--batch-array-index"}, paramLabel = "READER",
      description = "The index of the batch in the array.")
  private int batchArrayIndex = 0;

  @Option(names = {"--mbtiles"}, paramLabel = "MBTILES",
```

### FieldMayBeFinal
Field `mbtiles` may be 'final'
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/map/Export.java`
#### Snippet
```java
  @Option(names = {"--mbtiles"}, paramLabel = "MBTILES",
      description = "The repository is in the MBTiles format.")
  private boolean mbtiles = false;

  @Override
```

### FieldMayBeFinal
Field `batchArraySize` may be 'final'
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/map/Export.java`
#### Snippet
```java
  @Option(names = {"--batch-array-size"}, paramLabel = "BATCH_ARRAY_SIZE",
      description = "The size of the batch array.")
  private int batchArraySize = 1;

  @Option(names = {"--batch-array-index"}, paramLabel = "READER",
```

### FieldMayBeFinal
Field `srid` may be 'final'
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/database/UpdateOpenStreetMap.java`
#### Snippet
```java
  @Option(names = {"--srid"}, paramLabel = "SRID",
      description = "The projection used by the database.")
  private int srid = 3857;

  @Override
```

### FieldMayBeFinal
Field `srid` may be 'final'
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/database/ImportOpenStreetMap.java`
#### Snippet
```java
  @Option(names = {"--srid"}, paramLabel = "SRID",
      description = "The projection used by the database.")
  private int srid = 3857;

  @Override
```

### FieldMayBeFinal
Field `countryCode` may be 'final'
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/geocoder/Search.java`
#### Snippet
```java
      names = {"--country"}, paramLabel = "COUNTRY", description = "The country code filter.",
      required = false)
  private String countryCode = "";

  @Option(
```

### FieldMayBeFinal
Field `limit` may be 'final'
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/geocoder/Search.java`
#### Snippet
```java
      names = {"--limit"}, paramLabel = "LIMIT",
      description = "The number of result to return.", required = false)
  private Integer limit = 10;

  @Override
```

### FieldMayBeFinal
Field `cache` may be 'final'
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/map/Dev.java`
#### Snippet
```java
  private Options options;
  @Option(names = {"--cache"}, paramLabel = "CACHE", description = "The caffeine cache directive.")
  private String cache = "";

  @Option(names = {"--tileset"}, paramLabel = "TILESET", description = "The tileset file.",
```

### FieldMayBeFinal
Field `host` may be 'final'
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/map/Dev.java`
#### Snippet
```java

  @Option(names = {"--host"}, paramLabel = "HOST", description = "The host of the server.")
  private String host = "localhost";

  @Option(names = {"--port"}, paramLabel = "PORT", description = "The port of the server.")
```

### FieldMayBeFinal
Field `port` may be 'final'
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/map/Dev.java`
#### Snippet
```java

  @Option(names = {"--port"}, paramLabel = "PORT", description = "The port of the server.")
  private int port = 9000;

  @Override
```

### FieldMayBeFinal
Field `port` may be 'final'
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/geocoder/Serve.java`
#### Snippet
```java

  @Option(names = {"--port"}, paramLabel = "PORT", description = "The port of the server.")
  private int port = 9000;

  @Override
```

### FieldMayBeFinal
Field `host` may be 'final'
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/geocoder/Serve.java`
#### Snippet
```java

  @Option(names = {"--host"}, paramLabel = "HOST", description = "The host of the server.")
  private String host = "localhost";

  @Option(names = {"--port"}, paramLabel = "PORT", description = "The port of the server.")
```

### FieldMayBeFinal
Field `host` may be 'final'
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/iploc/Serve.java`
#### Snippet
```java

  @Option(names = {"--host"}, paramLabel = "HOST", description = "The host of the server.")
  private String host = "localhost";

  @Option(names = {"--port"}, paramLabel = "PORT", description = "The port of the server.")
```

### FieldMayBeFinal
Field `port` may be 'final'
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/iploc/Serve.java`
#### Snippet
```java

  @Option(names = {"--port"}, paramLabel = "PORT", description = "The port of the server.")
  private int port = 9000;

  @Override
```

### FieldMayBeFinal
Field `port` may be 'final'
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/ogcapi/OgcApi.java`
#### Snippet
```java

  @Option(names = {"--port"}, paramLabel = "PORT", description = "The port of the server.")
  private int port = 9000;

  @Override
```

### FieldMayBeFinal
Field `host` may be 'final'
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/ogcapi/OgcApi.java`
#### Snippet
```java

  @Option(names = {"--host"}, paramLabel = "HOST", description = "The host of the server.")
  private String host = "localhost";

  @Option(names = {"--port"}, paramLabel = "PORT", description = "The port of the server.")
```

### FieldMayBeFinal
Field `cache` may be 'final'
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/ogcapi/OgcApi.java`
#### Snippet
```java

  @Option(names = {"--cache"}, paramLabel = "CACHE", description = "The caffeine cache directive.")
  private String cache = "";

  @Option(names = {"--tileset"}, paramLabel = "TILESET", description = "The tileset file.",
```

### FieldMayBeFinal
Field `port` may be 'final'
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/map/Serve.java`
#### Snippet
```java

  @Option(names = {"--port"}, paramLabel = "PORT", description = "The port of the server.")
  private int port = 9000;

  @Override
```

### FieldMayBeFinal
Field `host` may be 'final'
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/map/Serve.java`
#### Snippet
```java

  @Option(names = {"--host"}, paramLabel = "HOST", description = "The host of the server.")
  private String host = "localhost";

  @Option(names = {"--port"}, paramLabel = "PORT", description = "The port of the server.")
```

### FieldMayBeFinal
Field `cache` may be 'final'
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/map/Serve.java`
#### Snippet
```java

  @Option(names = {"--cache"}, paramLabel = "CACHE", description = "The caffeine cache directive.")
  private String cache = "";

  @Option(names = {"--tileset"}, paramLabel = "TILESET", description = "The tileset file.",
```

### FieldMayBeFinal
Field `max` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/utils/ProjectionTransformer.java`
#### Snippet
```java
  private ProjCoordinate min;

  private ProjCoordinate max;

  /**
```

### FieldMayBeFinal
Field `min` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/utils/ProjectionTransformer.java`
#### Snippet
```java
  private final CoordinateTransform transform;

  private ProjCoordinate min;

  private ProjCoordinate max;
```

### FieldMayBeFinal
Field `version` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileDescriptor.java`
#### Snippet
```java

  /** File version. */
  private int version; // little

  /** Shapefile type. */
```

### FieldMayBeFinal
Field `mmax` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileDescriptor.java`
#### Snippet
```java

  /** M Max. */
  private double mmax; // little

  /**
```

### FieldMayBeFinal
Field `ymin` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileDescriptor.java`
#### Snippet
```java

  /** Y Min. */
  private double ymin; // little

  /** X Max. */
```

### FieldMayBeFinal
Field `shapefileGeometryType` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileDescriptor.java`
#### Snippet
```java

  /** Shapefile type. */
  private ShapefileGeometryType shapefileGeometryType; // little

  /** X Min. */
```

### FieldMayBeFinal
Field `ymax` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileDescriptor.java`
#### Snippet
```java

  /** Y Max. */
  private double ymax; // little

  /** Z Min. */
```

### FieldMayBeFinal
Field `xmax` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileDescriptor.java`
#### Snippet
```java

  /** X Max. */
  private double xmax; // little

  /** Y Max. */
```

### FieldMayBeFinal
Field `zmin` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileDescriptor.java`
#### Snippet
```java

  /** Z Min. */
  private double zmin; // little

  /** Z Max. */
```

### FieldMayBeFinal
Field `xmin` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileDescriptor.java`
#### Snippet
```java

  /** X Min. */
  private double xmin; // little

  /** Y Min. */
```

### FieldMayBeFinal
Field `fileLength` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileDescriptor.java`
#### Snippet
```java

  /** File length. */
  private int fileLength; // big // The value for file length is the total length of the file in
                          // 16-bit
  // words
```

### FieldMayBeFinal
Field `fileCode` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileDescriptor.java`
#### Snippet
```java
public class ShapefileDescriptor {
  /** File code. */
  private int fileCode; // big

  /** File length. */
```

### FieldMayBeFinal
Field `mmin` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileDescriptor.java`
#### Snippet
```java

  /** M Min. */
  private double mmin; // little

  /** M Max. */
```

### FieldMayBeFinal
Field `zmax` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileDescriptor.java`
#### Snippet
```java

  /** Z Max. */
  private double zmax; // little

  /** M Min. */
```

### FieldMayBeFinal
Field `byteBuffer` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/CommonByteReader.java`
#### Snippet
```java

  /** Buffer reader. */
  private MappedByteBuffer byteBuffer;

  /** Indicates if the byte buffer is closed. */
```

### FieldMayBeFinal
Field `fis` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/CommonByteReader.java`
#### Snippet
```java

  /** Input Stream on the DBF. */
  private FileInputStream fis;

  /** File channel on the file. */
```

### FieldMayBeFinal
Field `fc` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/CommonByteReader.java`
#### Snippet
```java

  /** File channel on the file. */
  private FileChannel fc;

  /** Buffer reader. */
```

### FieldMayBeFinal
Field `file` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/CommonByteReader.java`
#### Snippet
```java

  /** The File. */
  private File file;

  /** Input Stream on the DBF. */
```

### FieldMayBeFinal
Field `fieldAddress` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DBaseFieldDescriptor.java`
#### Snippet
```java

  /** Field address (Field data address (address is set in memory; not useful on disk). */
  private byte[] fieldAddress = new byte[4];

  /** Field length. */
```

### FieldMayBeFinal
Field `fieldLength` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DBaseFieldDescriptor.java`
#### Snippet
```java

  /** Field length. */
  private byte fieldLength;

  /** Decimal count. */
```

### FieldMayBeFinal
Field `setFields` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DBaseFieldDescriptor.java`
#### Snippet
```java
  /** Undocumented use. */
  @SuppressWarnings("unused") // Kept in case of later ALTER TABLE sql calls.
  private byte setFields;

  /**
```

### FieldMayBeFinal
Field `fieldName` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DBaseFieldDescriptor.java`
#### Snippet
```java
public class DBaseFieldDescriptor {
  /** Field name. */
  private byte[] fieldName = new byte[11];

  /** Field name as String, for performance issues. */
```

### FieldMayBeFinal
Field `dbasePlusLanReserved3` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DBaseFieldDescriptor.java`
#### Snippet
```java

  /** Reserved 3. */
  private byte[] dbasePlusLanReserved3 = new byte[2];

  /** Undocumented use. */
```

### FieldMayBeFinal
Field `workAreaID` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DBaseFieldDescriptor.java`
#### Snippet
```java
  /** Work area id. */
  @SuppressWarnings("unused") // Kept in case of later ALTER TABLE sql calls.
  private byte workAreaID;

  /** Reserved 3. */
```

### FieldMayBeFinal
Field `fieldType` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DBaseFieldDescriptor.java`
#### Snippet
```java

  /** Field type. */
  private DBaseDataType fieldType;

  /** Field address (Field data address (address is set in memory; not useful on disk). */
```

### FieldMayBeFinal
Field `dbasePlusLanReserved2` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DBaseFieldDescriptor.java`
#### Snippet
```java

  /** Reserved 2. */
  private byte[] dbasePlusLanReserved2 = new byte[2];

  /** Work area id. */
```

### FieldMayBeFinal
Field `fieldDecimalCount` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DBaseFieldDescriptor.java`
#### Snippet
```java

  /** Decimal count. */
  private byte fieldDecimalCount;

  /** Reserved 2. */
```

### FieldMayBeFinal
Field `shapefileReader` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileInputStream.java`
#### Snippet
```java

  /** Shapefile reader. */
  private ShapefileByteReader shapefileReader;

  /**
```

### FieldMayBeFinal
Field `databaseFile` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileInputStream.java`
#### Snippet
```java

  /** Database file. */
  private File databaseFile;

  /** Shapefile index. */
```

### FieldMayBeFinal
Field `value` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileGeometryType.java`
#### Snippet
```java

  // used for initializing the enumeration
  private int value;

  private ShapefileGeometryType(int value) {
```

### FieldMayBeFinal
Field `schema` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileInputStream.java`
#### Snippet
```java

  /** Schema of the features contained in this shapefile. */
  private Schema schema;

  /** Shapefile reader. */
```

### FieldMayBeFinal
Field `hasShapefileIndex` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileInputStream.java`
#### Snippet
```java

  /** Indicates that the shape file has a valid index provided with it. */
  private boolean hasShapefileIndex;

  /** Schema of the features contained in this shapefile. */
```

### FieldMayBeFinal
Field `shapefile` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileInputStream.java`
#### Snippet
```java

  /** Shapefile. */
  private File shapefile;

  /** Database file. */
```

### FieldMayBeFinal
Field `dbaseReader` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileInputStream.java`
#### Snippet
```java
public class ShapefileInputStream extends InputStream {

  private DbaseByteReader dbaseReader;

  /** Shapefile. */
```

### FieldMayBeFinal
Field `statement` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/postgres/PostgresTable.java`
#### Snippet
```java

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private boolean hasNext;
```

### FieldMayBeFinal
Field `connection` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/postgres/PostgresTable.java`
#### Snippet
```java
  public class PostgresIterator implements Iterator<Row>, AutoCloseable {

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
```

### FieldMayBeFinal
Field `resultSet` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/postgres/PostgresTable.java`
#### Snippet
```java
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private boolean hasNext;

```

### FieldMayBeFinal
Field `shapefile` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileReader.java`
#### Snippet
```java
public class ShapefileReader {
  /** Shapefile. */
  private File shapefile;

  /** Database file. */
```

### FieldMayBeFinal
Field `databaseFile` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileReader.java`
#### Snippet
```java

  /** Database file. */
  private File databaseFile;

  /** Shapefile index, if any. */
```

### FieldMayBeFinal
Field `geometryFactory` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileByteReader.java`
#### Snippet
```java

  /** JTS geometry factory. */
  private GeometryFactory geometryFactory = new GeometryFactory();

  /**
```

### FieldMayBeFinal
Field `schema` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileByteReader.java`
#### Snippet
```java

  /** Schema of the rows contained in this shapefile. */
  private Schema schema;

  /** Shapefile index. */
```

### FieldMayBeFinal
Field `schema` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/flatgeobuf/FlatGeoBufTable.java`
#### Snippet
```java
  private final Path file;

  private Schema schema;

  /**
```

### FieldMayBeFinal
Field `info` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DbaseByteReader.java`
#### Snippet
```java

  /** Connection properties. */
  private Properties info;

  /**
```

### FieldMayBeFinal
Field `fieldsDescriptors` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/DbaseByteReader.java`
#### Snippet
```java
  protected byte[] dbaseLastUpdate = new byte[3];
  /** List of field descriptors. */
  private List<DBaseFieldDescriptor> fieldsDescriptors = new ArrayList<>();

  /** Connection properties. */
```

### FieldMayBeFinal
Field `dataSources` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowContext.java`
#### Snippet
```java
public class WorkflowContext {

  private Map<String, DataSource> dataSources = new ConcurrentHashMap<>() {};

  /**
```

### FieldMayBeFinal
Field `geometryType` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/EntityDataType.java`
#### Snippet
```java
      new MapDataType<>(new StringDataType(), new StringDataType());

  private GeometryDataType geometryType = new GeometryDataType();

  @Override
```

### FieldMayBeFinal
Field `idType` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/EntityDataType.java`
#### Snippet
```java
public class EntityDataType implements DataType<Entity> {

  private LongDataType idType = new LongDataType();

  private MapDataType<String, String> tagsType =
```

### FieldMayBeFinal
Field `tagsType` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/EntityDataType.java`
#### Snippet
```java
  private LongDataType idType = new LongDataType();

  private MapDataType<String, String> tagsType =
      new MapDataType<>(new StringDataType(), new StringDataType());

```

### FieldMayBeFinal
Field `tags` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/Entity.java`
#### Snippet
```java
  private long id;

  private Map<String, String> tags;

  private Geometry geometry;
```

### FieldMayBeFinal
Field `id` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/Entity.java`
#### Snippet
```java
public class Entity implements Row {

  private long id;

  private Map<String, String> tags;
```

### FieldMayBeFinal
Field `geometry` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/Entity.java`
#### Snippet
```java
  private Map<String, String> tags;

  private Geometry geometry;

  public Entity(long id, Map<String, String> tags, Geometry geometry) {
```

### FieldMayBeFinal
Field `size` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/collection/MemoryAlignedDataList.java`
#### Snippet
```java
  private final long segmentMask;

  private AtomicLong size;

  /**
```

### FieldMayBeFinal
Field `size` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/collection/DataList.java`
#### Snippet
```java
      private long index = 0;

      private long size = sizeAsLong();

      @Override
```

### FieldMayBeFinal
Field `size` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/collection/MemoryAlignedDataMap.java`
#### Snippet
```java
      private long index = 0;

      private long size = sizeAsLong();

      @Override
```

### FieldMayBeFinal
Field `size` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/collection/MemoryAlignedDataMap.java`
#### Snippet
```java
      private long index = 0;

      private long size = sizeAsLong();

      @Override
```

### FieldMayBeFinal
Field `size` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/collection/MemoryAlignedDataMap.java`
#### Snippet
```java
      private long index = 0;

      private long size = sizeAsLong();

      @Override
```

### FieldMayBeFinal
Field `size` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/collection/FixedSizeDataList.java`
#### Snippet
```java
  private final Memory memory;

  private AtomicLong size;

  /**
```

### FieldMayBeFinal
Field `lock` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/collection/AppendOnlyBuffer.java`
#### Snippet
```java
  private long size;

  private Lock lock = new ReentrantLock();

  /**
```

### FieldMayBeFinal
Field `geometryDataType` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/collection/type/geometry/GeometryCollectionDataType.java`
#### Snippet
```java
  private final GeometryFactory geometryFactory;

  private GeometryDataType geometryDataType;

  /**
```

### FieldMayBeFinal
Field `list` may be 'final'
in `baremaps-core/src/main/java/org/apache/baremaps/collection/algorithm/ExternalMergeSort.java`
#### Snippet
```java
  static final class DataStack<T> implements AutoCloseable {

    private DataList<T> list;

    private Long index = 0l;
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `flatGeoBufTable` are queried, but never updated
in `baremaps-core/src/main/java/org/apache/baremaps/storage/flatgeobuf/FlatGeoBufStore.java`
#### Snippet
```java
      Files.deleteIfExists(path);
      Files.createFile(path);
      var flatGeoBufTable = new FlatGeoBufTable(path, table.schema());
      flatGeoBufTable.write(table);
    } catch (IOException e) {
```

### MismatchedCollectionQueryUpdate
Contents of collection `recordsLengths` are updated, but never queried
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileByteReader.java`
#### Snippet
```java

  /** Shapefile records lengths (loaded from .SHX file, if any found). */
  private ArrayList<Integer> recordsLengths;

  /** JTS geometry factory. */
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
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

### UnnecessaryLocalVariable
Local variable `object` is redundant
in `baremaps-server/src/main/java/org/apache/baremaps/server/DevResources.java`
#### Snippet
```java
  public TileJSON getTileset() throws IOException {
    var config = configReader.read(tileset);
    var object = objectMapper.readValue(config, TileJSON.class);
    return object;
  }
```

### UnnecessaryLocalVariable
Local variable `config` is redundant
in `baremaps-core/src/main/java/org/apache/baremaps/config/ConfigReader.java`
#### Snippet
```java
  public String read(Path path) throws IOException {
    var extension = com.google.common.io.Files.getFileExtension(path.toString());
    var config = switch (extension) {
      case "js" -> eval(path);
      default -> Files.readString(path);
```

### UnnecessaryLocalVariable
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

### UnnecessaryLocalVariable
Local variable `future` is redundant
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowExecutor.java`
#### Snippet
```java

    // Create a future that logs the stepMeasures when all the futures are completed
    var future = CompletableFuture.allOf(endSteps).thenRun(this::logStepMeasures);

    return future;
```

### UnnecessaryLocalVariable
Local variable `scaledGeometry` is redundant
in `baremaps-core/src/main/java/org/apache/baremaps/vectortile/VectorTileUtils.java`
#### Snippet
```java
    affineTransformation.scale(1 / scaleX, -1 / scaleY);
    affineTransformation.translate(envelope.getMinX(), envelope.getMinY());
    Geometry scaledGeometry = affineTransformation.transform(geometry);

    // Build the final geometry
```

### UnnecessaryLocalVariable
Local variable `value` is redundant
in `baremaps-core/src/main/java/org/apache/baremaps/collection/algorithm/Hilbert.java`
#### Snippet
```java
    i1 = (i1 | (i1 << 1)) & 0x55555555;

    long value = ((i1 << 1) | i0);

    return value;
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `baremaps-core/src/main/java/org/apache/baremaps/vectortile/expression/Expressions.java`
#### Snippet
```java
    @Override
    public Expression deserialize(JsonParser jsonParser,
        DeserializationContext deserializationContext) throws IOException, JacksonException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return deserializeJsonNode(node);
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `baremaps-cli/src/main/java/org/apache/baremaps/cli/map/Init.java`
#### Snippet
```java
      tilesetObject.setTilejson("2.2.0");
      tilesetObject.setName("Baremaps");
      tilesetObject.setTiles(Arrays.asList("http://localhost:9000/tiles.json"));
      Files.write(tileset,
          objectMapper().writerWithDefaultPrettyPrinter().writeValueAsBytes(tilesetObject));
```

## RuleId[id=NullArgumentToVariableArgMethod]
### NullArgumentToVariableArgMethod
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `baremaps-core/src/main/java/org/apache/baremaps/tilestore/postgres/PostgresQueryGenerator.java`
#### Snippet
```java
   */
  public PostgresQueryGenerator(DataSource dataSource) {
    this(dataSource, null, null, null, null, null);
  }

```

## RuleId[id=PointlessBooleanExpression]
### PointlessBooleanExpression
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

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `nBytes` initializer `-1` is redundant
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/UnzipFile.java`
#### Snippet
```java
          totalEntryArchive++;

          int nBytes = -1;
          byte[] buffer = new byte[4096];
          long totalSizeEntry = 0;
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`OptionalInt.getAsInt()` without 'isPresent()' check
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/ExportVectorTiles.java`
#### Snippet
```java
                      "minzoom",
                      layer.getQueries().stream().mapToInt(TilesetQuery::getMinzoom).min()
                          .getAsInt());
                  map.put(
                      "maxzoom",
```

### OptionalGetWithoutIsPresent
`OptionalInt.getAsInt()` without 'isPresent()' check
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/tasks/ExportVectorTiles.java`
#### Snippet
```java
                      "maxzoom",
                      layer.getQueries().stream().mapToInt(TilesetQuery::getMaxzoom).max()
                          .getAsInt());
                  return map;
                })
```

### OptionalGetWithoutIsPresent
`OptionalLong.getAsLong()` without 'isPresent()' check
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowExecutor.java`
#### Snippet
```java
        .mapToLong(measures -> measures.stepMeasures.stream()
            .mapToLong(measure -> measure.start)
            .min().getAsLong())
        .min().getAsLong();
    var workflowEnd = stepMeasures.stream()
```

### OptionalGetWithoutIsPresent
`OptionalLong.getAsLong()` without 'isPresent()' check
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowExecutor.java`
#### Snippet
```java
            .mapToLong(measure -> measure.start)
            .min().getAsLong())
        .min().getAsLong();
    var workflowEnd = stepMeasures.stream()
        .mapToLong(measures -> measures.stepMeasures.stream()
```

### OptionalGetWithoutIsPresent
`OptionalLong.getAsLong()` without 'isPresent()' check
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowExecutor.java`
#### Snippet
```java
        .mapToLong(measures -> measures.stepMeasures.stream()
            .mapToLong(measure -> measure.end)
            .max().getAsLong())
        .max().getAsLong();
    var workflowDuration = Duration.ofMillis(workflowEnd - workflowStart);
```

### OptionalGetWithoutIsPresent
`OptionalLong.getAsLong()` without 'isPresent()' check
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowExecutor.java`
#### Snippet
```java
    for (var stepMeasure : this.stepMeasures) {
      var stepStart =
          stepMeasure.stepMeasures.stream().mapToLong(measure -> measure.start).min().getAsLong();
      var stepEnd =
          stepMeasure.stepMeasures.stream().mapToLong(measure -> measure.end).max().getAsLong();
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `dbfSuffix` is always 'null'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileReader.java`
#### Snippet
```java

    String dbfSuffix = null;
    dbfSuffix = shapefile.endsWith("shp") ? "dbf" : dbfSuffix;
    dbfSuffix = shapefile.endsWith("SHP") ? "DBF" : dbfSuffix;
    dbfSuffix = shapefile.endsWith("Shp") ? "Dbf" : dbfSuffix;
```

### ConstantValue
Value `shapeFileIndexSuffix` is always 'null'
in `baremaps-core/src/main/java/org/apache/baremaps/storage/shapefile/internal/ShapefileReader.java`
#### Snippet
```java

    String shapeFileIndexSuffix = null;
    shapeFileIndexSuffix = shapefile.endsWith("shp") ? "shx" : shapeFileIndexSuffix;
    shapeFileIndexSuffix = shapefile.endsWith("SHP") ? "SHX" : shapeFileIndexSuffix;
    shapeFileIndexSuffix = shapefile.endsWith("Shp") ? "Shx" : shapeFileIndexSuffix;
```

### ConstantValue
Condition `command == LINE_TO` is always `true`
in `baremaps-core/src/main/java/org/apache/baremaps/vectortile/VectorTileDecoder.java`
#### Snippet
```java

          // Add the coordinate to the current linear ring
          else if (command == LINE_TO) {
            coordinates.add(new Coordinate(cx, cy));
          }
```

### ConstantValue
Value `landingPage` is always 'null'
in `baremaps-ogcapi/src/main/java/org/apache/baremaps/ogcapi/DefaultResource.java`
#### Snippet
```java
                    .type("text/html")
                    .rel("service-doc")));
    return Response.ok(landingPage).build();
  }
}
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'nodes()' is declared in unstable interface 'com.google.common.graph.Graph' marked with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowExecutor.java`
#### Snippet
```java
  public CompletableFuture<Void> execute() {
    // Create futures for each end step
    var endSteps = graph.nodes().stream()
        .filter(this::isEndStep)
        .map(this::getFutureStep)
```

### UnstableApiUsage
'successors(N)' is declared in unstable interface 'com.google.common.graph.Graph' marked with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowExecutor.java`
#### Snippet
```java
   */
  private boolean isEndStep(String stepId) {
    return graph.successors(stepId).isEmpty();
  }

```

### UnstableApiUsage
'com.google.common.graph.ImmutableGraph' is marked unstable with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowExecutor.java`
#### Snippet
```java

    // Create a graph from the workflow
    ImmutableGraph.Builder<String> graphBuilder = GraphBuilder.directed().immutable();

    // Add the nodes (e.g. steps) to the graph
```

### UnstableApiUsage
'com.google.common.graph.ImmutableGraph.Builder' is declared in unstable class 'com.google.common.graph.ImmutableGraph' marked with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowExecutor.java`
#### Snippet
```java

    // Create a graph from the workflow
    ImmutableGraph.Builder<String> graphBuilder = GraphBuilder.directed().immutable();

    // Add the nodes (e.g. steps) to the graph
```

### UnstableApiUsage
'com.google.common.graph.GraphBuilder' is marked unstable with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowExecutor.java`
#### Snippet
```java

    // Create a graph from the workflow
    ImmutableGraph.Builder<String> graphBuilder = GraphBuilder.directed().immutable();

    // Add the nodes (e.g. steps) to the graph
```

### UnstableApiUsage
'directed()' is declared in unstable class 'com.google.common.graph.GraphBuilder' marked with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowExecutor.java`
#### Snippet
```java

    // Create a graph from the workflow
    ImmutableGraph.Builder<String> graphBuilder = GraphBuilder.directed().immutable();

    // Add the nodes (e.g. steps) to the graph
```

### UnstableApiUsage
'immutable()' is declared in unstable class 'com.google.common.graph.GraphBuilder' marked with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowExecutor.java`
#### Snippet
```java

    // Create a graph from the workflow
    ImmutableGraph.Builder<String> graphBuilder = GraphBuilder.directed().immutable();

    // Add the nodes (e.g. steps) to the graph
```

### UnstableApiUsage
'addNode(N)' is declared in unstable class 'com.google.common.graph.ImmutableGraph' marked with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowExecutor.java`
#### Snippet
```java
    // Add the nodes (e.g. steps) to the graph
    for (String id : this.steps.keySet()) {
      graphBuilder.addNode(id);
    }

```

### UnstableApiUsage
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

### UnstableApiUsage
'build()' is declared in unstable class 'com.google.common.graph.ImmutableGraph' marked with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowExecutor.java`
#### Snippet
```java

    // Build the graph
    this.graph = graphBuilder.build();

    // Check that the graph is acyclic
```

### UnstableApiUsage
'com.google.common.graph.Graphs' is marked unstable with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowExecutor.java`
#### Snippet
```java

    // Check that the graph is acyclic
    if (Graphs.hasCycle(this.graph)) {
      throw new WorkflowException("The workflow must be a directed acyclic graph");
    }
```

### UnstableApiUsage
'hasCycle(com.google.common.graph.Graph)' is declared in unstable class 'com.google.common.graph.Graphs' marked with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowExecutor.java`
#### Snippet
```java

    // Check that the graph is acyclic
    if (Graphs.hasCycle(this.graph)) {
      throw new WorkflowException("The workflow must be a directed acyclic graph");
    }
```

### UnstableApiUsage
'com.google.common.graph.Graph' is marked unstable with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowExecutor.java`
#### Snippet
```java
  private final Map<String, CompletableFuture<Void>> futures;

  private final Graph<String> graph;

  private final List<StepMeasure> stepMeasures;
```

### UnstableApiUsage
'predecessors(N)' is declared in unstable interface 'com.google.common.graph.Graph' marked with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/workflow/WorkflowExecutor.java`
#### Snippet
```java
   */
  private CompletableFuture<Void> getPreviousFutureStep(String stepId) {
    var predecessors = graph.predecessors(stepId).stream().toList();

    // If the step has no predecessor,
```

### UnstableApiUsage
'stream(java.util.Collection)' is marked unstable with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/collection/DataMap.java`
#### Snippet
```java
   */
  public List<E> getAll(List<Long> keys) {
    return Streams.stream(keys).map(this::get).toList();
  }

```

### UnstableApiUsage
'stream(java.util.Iterator)' is marked unstable with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/collection/IndexedDataMap.java`
#### Snippet
```java
  @Override
  protected Iterator<Entry<Long, E>> entryIterator() {
    return Streams.stream(keyIterator()).map(k -> Map.entry(k, get(k))).iterator();
  }

```

### UnstableApiUsage
'stream(java.util.Iterator)' is marked unstable with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/collection/IndexedDataMap.java`
#### Snippet
```java
  @Override
  protected Iterator<E> valueIterator() {
    return Streams.stream(keyIterator()).map(this::get).iterator();
  }

```

### UnstableApiUsage
'zip(java.util.stream.Stream, java.util.stream.Stream**, java.util.function.BiFunction)' is marked unstable with @Beta**
in `baremaps-core/src/main/java/org/apache/baremaps/collection/MonotonicFixedSizeDataMap.java`
#### Snippet
```java
  @Override
  protected Iterator<Entry<Long, E>> entryIterator() {
    return Streams.zip(
        Streams.stream(keyIterator()),
        Streams.stream(valueIterator()),
```

### UnstableApiUsage
'stream(java.util.Iterator)' is marked unstable with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/collection/MonotonicFixedSizeDataMap.java`
#### Snippet
```java
  protected Iterator<Entry<Long, E>> entryIterator() {
    return Streams.zip(
        Streams.stream(keyIterator()),
        Streams.stream(valueIterator()),
        (k, v) -> Map.entry(k, v)).iterator();
```

### UnstableApiUsage
'stream(java.util.Iterator)' is marked unstable with @Beta
in `baremaps-core/src/main/java/org/apache/baremaps/collection/MonotonicFixedSizeDataMap.java`
#### Snippet
```java
    return Streams.zip(
        Streams.stream(keyIterator()),
        Streams.stream(valueIterator()),
        (k, v) -> Map.entry(k, v)).iterator();
  }
```

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

