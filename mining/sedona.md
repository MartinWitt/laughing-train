# sedona 
 
# Bad smells
I found 85 bad smells with 85 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 85 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/common/src/main/java/org/apache/sedona/common/Functions.java`
#### Snippet
```java
writer.write(geometry).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/common/src/main/java/org/apache/sedona/common/raster/Functions.java`
#### Snippet
```java
raster.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/common/src/main/java/org/apache/sedona/common/raster/Outputs.java`
#### Snippet
```java
AbstractGridFormat.GEOTOOLS_WRITE_PARAMS.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/common/src/main/java/org/apache/sedona/common/raster/Outputs.java`
#### Snippet
```java
AbstractGridFormat.GEOTOOLS_WRITE_PARAMS.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/common/src/main/java/org/apache/sedona/common/utils/FormatUtils.java`
#### Snippet
```java
feature.getId().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/core/src/main/java/org/apache/sedona/core/formatMapper/RddReader.java`
#### Snippet
```java
rawTextRDD.take(1).get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/core/src/test/java/org/apache/sedona/core/formatMapper/GeoJsonIOTest.java`
#### Snippet
```java
initGeom.getUserData().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/core/src/test/java/org/apache/sedona/core/formatMapper/GeoJsonIOTest.java`
#### Snippet
```java
newGeom.getUserData().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/boundary/BoundaryInputFormat.java`
#### Snippet
```java
paths[i].toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/fieldname/FieldnameInputFormat.java`
#### Snippet
```java
paths[i].toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/shapes/CombineShapeReader.java`
#### Snippet
```java
paths[i].toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/core/src/test/java/org/apache/sedona/core/formatMapper/shapefileParser/shapes/ShapefileReaderTest.java`
#### Snippet
```java
hdfsFileIterator.next().getPath().getParent().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/core/src/test/java/org/apache/sedona/core/formatMapper/shapefileParser/shapes/ShapefileReaderTest.java`
#### Snippet
```java
spatialRDD.fieldNames.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/core/src/test/java/org/apache/sedona/core/spatialOperator/LineStringKnnTest.java`
#### Snippet
```java
result.get(0).getUserData().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/core/src/test/java/org/apache/sedona/core/spatialOperator/LineStringKnnTest.java`
#### Snippet
```java
result.get(0).getUserData().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/core/src/test/java/org/apache/sedona/core/spatialOperator/LineStringRangeTest.java`
#### Snippet
```java
RangeQuery.SpatialRangeQuery(spatialRDD, queryEnvelope, false, false).take(10).get(1).getUserData().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/core/src/test/java/org/apache/sedona/core/spatialOperator/LineStringRangeTest.java`
#### Snippet
```java
RangeQuery.SpatialRangeQuery(spatialRDD, queryEnvelope, false, true).take(10).get(1).getUserData().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/core/src/test/java/org/apache/sedona/core/spatialOperator/PolygonKnnTest.java`
#### Snippet
```java
result.get(0).getUserData().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/core/src/test/java/org/apache/sedona/core/spatialOperator/PolygonKnnTest.java`
#### Snippet
```java
result.get(0).getUserData().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/core/src/test/java/org/apache/sedona/core/spatialOperator/PolygonRangeTest.java`
#### Snippet
```java
RangeQuery.SpatialRangeQuery(spatialRDD, queryEnvelope, false, false).take(10).get(1).getUserData().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/core/src/test/java/org/apache/sedona/core/spatialOperator/PolygonRangeTest.java`
#### Snippet
```java
RangeQuery.SpatialRangeQuery(spatialRDD, queryEnvelope, false, true).take(10).get(1).getUserData().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/core/src/test/java/org/apache/sedona/core/spatialOperator/RectangleKnnTest.java`
#### Snippet
```java
result.get(0).getUserData().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/core/src/test/java/org/apache/sedona/core/spatialOperator/RectangleKnnTest.java`
#### Snippet
```java
result.get(0).getUserData().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/core/src/test/java/org/apache/sedona/core/spatialOperator/RectangleRangeTest.java`
#### Snippet
```java
RangeQuery.SpatialRangeQuery(spatialRDD, queryEnvelope, false, false).take(10).get(1).getUserData().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/core/src/test/java/org/apache/sedona/core/spatialOperator/RectangleRangeTest.java`
#### Snippet
```java
RangeQuery.SpatialRangeQuery(spatialRDD, queryEnvelope, false, true).take(10).get(1).getUserData().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/core/src/main/java/org/apache/sedona/core/spatialRDD/LineStringRDD.java`
#### Snippet
```java
rawTextRDD.take(1).get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/core/src/main/java/org/apache/sedona/core/spatialRDD/PointRDD.java`
#### Snippet
```java
rawTextRDD.take(1).get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/core/src/main/java/org/apache/sedona/core/spatialRDD/PolygonRDD.java`
#### Snippet
```java
rawTextRDD.take(1).get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/core/src/main/java/org/apache/sedona/core/spatialRDD/SpatialRDD.java`
#### Snippet
```java
spatialObject.getUserData().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/core/src/main/java/org/apache/sedona/core/spatialRDD/SpatialRDD.java`
#### Snippet
```java
jsonFeature.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/core/src/test/java/org/apache/sedona/core/utils/CRSTransformationTest.java`
#### Snippet
```java
RangeQuery.SpatialRangeQuery(spatialRDD, queryEnvelope, false, false).take(10).get(1).getUserData().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/core/src/test/java/org/apache/sedona/core/utils/CRSTransformationTest.java`
#### Snippet
```java
RangeQuery.SpatialRangeQuery(spatialRDD, queryEnvelope, false, true).take(10).get(1).getUserData().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/core/src/test/java/org/apache/sedona/core/utils/CRSTransformationTest.java`
#### Snippet
```java
result.get(0).getUserData().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/core/src/test/java/org/apache/sedona/core/utils/CRSTransformationTest.java`
#### Snippet
```java
result.get(0).getUserData().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/AdapterTest.java`
#### Snippet
```java
data.get(data.size() - 1).getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/AdapterTest.java`
#### Snippet
```java
result.getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/AdapterTest.java`
#### Snippet
```java
data.get(0).getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/AdapterTest.java`
#### Snippet
```java
geomStream.executeAndCollect(1).get(0).getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/AdapterTest.java`
#### Snippet
```java
data.get(data.size() - 1).getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/AdapterTest.java`
#### Snippet
```java
result.getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/AggregatorTest.java`
#### Snippet
```java
last.getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/ConstructorTest.java`
#### Snippet
```java
first(geomTable).getFieldAs(colNames[2]).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/ConstructorTest.java`
#### Snippet
```java
data.get(data.size() - 1).getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/ConstructorTest.java`
#### Snippet
```java
result.getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/ConstructorTest.java`
#### Snippet
```java
data.get(data.size() - 1).getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/ConstructorTest.java`
#### Snippet
```java
result.getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/ConstructorTest.java`
#### Snippet
```java
data.get(data.size() - 1).getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/ConstructorTest.java`
#### Snippet
```java
result.getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/ConstructorTest.java`
#### Snippet
```java
data.get(data.size() - 1).getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/ConstructorTest.java`
#### Snippet
```java
result.getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/ConstructorTest.java`
#### Snippet
```java
data.get(data.size() - 1).getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/ConstructorTest.java`
#### Snippet
```java
result.getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/ConstructorTest.java`
#### Snippet
```java
data.get(data.size() - 1).getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/ConstructorTest.java`
#### Snippet
```java
result.getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/ConstructorTest.java`
#### Snippet
```java
last(tableEnv.sqlQuery("SELECT ST_PolygonFromEnvelope(1, 100, 2, 200)")).getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/ConstructorTest.java`
#### Snippet
```java
last(tableEnv.sqlQuery("SELECT ST_PolygonFromEnvelope(1.0, 100.0, 2.0, 200.0)")).getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/ConstructorTest.java`
#### Snippet
```java
last(geomTable).getFieldAs(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/ConstructorTest.java`
#### Snippet
```java
first(geomTable).getFieldAs(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/ConstructorTest.java`
#### Snippet
```java
first(geomTable).getFieldAs(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/ConstructorTest.java`
#### Snippet
```java
first(geomTable).getFieldAs(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/ConstructorTest.java`
#### Snippet
```java
data.get(data.size() - 1).getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/ConstructorTest.java`
#### Snippet
```java
result.getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/ConstructorTest.java`
#### Snippet
```java
first(geomTable).getFieldAs(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/FunctionTest.java`
#### Snippet
```java
first(linestringTable).getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/FunctionTest.java`
#### Snippet
```java
first(transformedTable).getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/FunctionTest.java`
#### Snippet
```java
first(transformedTable_SRC).getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/FunctionTest.java`
#### Snippet
```java
first(transformedTable_TGT).getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/FunctionTest.java`
#### Snippet
```java
first(transformedTable_SRC_TGT).getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/FunctionTest.java`
#### Snippet
```java
first(transformedTable_SRC_TGT_lenient).getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/FunctionTest.java`
#### Snippet
```java
first(pointTable).getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/FunctionTest.java`
#### Snippet
```java
first(pointTable).getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/FunctionTest.java`
#### Snippet
```java
first(pointTable).getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/FunctionTest.java`
#### Snippet
```java
first(pointTable).getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/FunctionTest.java`
#### Snippet
```java
first(pointTable).getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/FunctionTest.java`
#### Snippet
```java
first(pointTable).getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/FunctionTest.java`
#### Snippet
```java
first(pointTable).getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/FunctionTest.java`
#### Snippet
```java
Objects.requireNonNull(r.getField(1)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/PredicateTest.java`
#### Snippet
```java
createPolygonWKT(testDataSize).get(0).getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/PredicateTest.java`
#### Snippet
```java
createPolygonWKT(testDataSize).get(0).getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/PredicateTest.java`
#### Snippet
```java
createPolygonWKT(testDataSize).get(0).getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/PredicateTest.java`
#### Snippet
```java
createPolygonWKT(testDataSize).get(0).getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/PredicateTest.java`
#### Snippet
```java
createPolygonWKT(testDataSize).get(0).getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/PredicateTest.java`
#### Snippet
```java
createPolygonWKT(testDataSize).get(0).getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/PredicateTest.java`
#### Snippet
```java
createLineStringWKT(testDataSize).get(0).getField(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-sedona-364024596352875424110398241097820937790/flink/src/test/java/org/apache/sedona/flink/TestBase.java`
#### Snippet
```java
writer.write(polygon).toString()
```

