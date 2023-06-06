# sedona 
 
# Bad smells
I found 617 bad smells with 45 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocDeclaration | 172 | false |
| UnusedAssignment | 62 | false |
| ConstantValue | 59 | false |
| UNCHECKED_WARNING | 55 | false |
| DataFlowIssue | 25 | false |
| DuplicatedCode | 25 | false |
| UnnecessaryLocalVariable | 25 | true |
| FieldMayBeFinal | 21 | false |
| CommentedOutCode | 18 | false |
| PointlessBooleanExpression | 16 | true |
| Deprecation | 13 | false |
| JavadocReference | 12 | false |
| StringConcatenationInLoops | 10 | false |
| IgnoreResultOfCall | 8 | false |
| UNUSED_IMPORT | 8 | false |
| DeprecatedIsStillUsed | 8 | false |
| MathRoundingWithIntArgument | 7 | false |
| IntegerDivisionInFloatingPointContext | 7 | false |
| DanglingJavadoc | 5 | false |
| ConditionCoveredByFurtherCondition | 5 | false |
| WrapperTypeMayBePrimitive | 4 | false |
| RedundantOperationOnEmptyContainer | 4 | false |
| TrivialIf | 4 | false |
| ArraysAsListWithZeroOrOneArgument | 4 | false |
| UseBulkOperation | 4 | false |
| ToArrayCallWithZeroLengthArrayArgument | 3 | true |
| BoxingBoxedValue | 3 | false |
| SuspiciousToArrayCall | 3 | false |
| StringEquality | 2 | false |
| TrivialStringConcatenation | 2 | false |
| FieldCanBeLocal | 2 | false |
| IntegerMultiplicationImplicitCastToLong | 2 | false |
| AutoCloseableResource | 2 | false |
| UnnecessaryStringEscape | 1 | true |
| SortedCollectionWithNonComparableKeys | 1 | false |
| LongLiteralsEndingWithLowercaseL | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| NumberEquality | 1 | false |
| JavadocLinkAsPlainText | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| ReturnFromFinallyBlock | 1 | false |
| StringConcatenationInsideStringBufferAppend | 1 | false |
| SuspiciousNameCombination | 1 | false |
| ManualArrayToCollectionCopy | 1 | false |
| TypeParameterHidesVisibleType | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| FinallyBlockCannotCompleteNormally | 1 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| MismatchedJavadocCode | 1 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Coordinate\[result.size()\]'
in `viz/src/main/java/org/apache/sedona/viz/utils/RasterizationUtils.java`
#### Snippet
```java
            result.add(new Coordinate(pixelCoordinate._1(), pixelCoordinate._2()));
        }
        Coordinate[] arrayResult = result.toArray(new Coordinate[result.size()]);
        return arrayResult;
    }
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Coordinate\[coordinatesList.size()\]'
in `viz/src/main/java/org/apache/sedona/viz/utils/RasterizationUtils.java`
#### Snippet
```java

        coordinatesList.add(coordinatesList.get(0));
        linear = geometryfactory.createLinearRing(coordinatesList.toArray(new Coordinate[coordinatesList.size()]));
        Polygon polygon = new Polygon(linear, null, geometryfactory);
        int minPixelX = (int) polygon.getEnvelopeInternal().getMinX();
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Point\[subSampleList.size()\]'
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/VoronoiPartitioning.java`
#### Snippet
```java
        }

        mp = fact.createMultiPoint(subSampleList.toArray(new Point[subSampleList.size()]));
        VoronoiDiagramBuilder voronoiBuilder = new VoronoiDiagramBuilder();
        voronoiBuilder.setSites(mp);
```

## RuleId[id=StringEquality]
### StringEquality
String values are compared using `!=`, not 'equals()'
in `common/src/main/java/org/apache/sedona/common/geometryObjects/Circle.java`
#### Snippet
```java
        double radius2 = ((Circle) g).radius;

        if (type1 != type2) { return false; }
        if (radius1 != radius2) { return false; }
        return GeomUtils.equalsTopoGeom(this.centerGeometry, ((Circle) g).centerGeometry);
```

### StringEquality
String values are compared using `!=`, not 'equals()'
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/shapes/ShapeInputFormat.java`
#### Snippet
```java
                fileSplitSizeParts.add(filePathSizePair.get(filePath));

                if (prevfilename != "" && !prevfilename.equals(filename)
                        && (suffix.equals(SHX_SUFFIX) || suffix.equals(DBF_SUFFIX) || suffix.equals(SHP_SUFFIX))) {
                    // compare file name and if it is different then all same filename is into CombileFileSplit
```

## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationOperator.java`
#### Snippet
```java
                    currentPixelCount = maxWeight;
                }
                Double normalizedPixelCount = (currentPixelCount - minWeight) * 255 / (maxWeight - minWeight);
                Integer pixelColor = EncodeToRGB(normalizedPixelCount.intValue());
                return pixelColor;
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/dbf/DbfParseUtil.java`
#### Snippet
```java
            buffer.get(fldBytes, 0, fldBytes.length);
            String charset = System.getProperty("sedona.global.charset", "default");
            Boolean utf8flag = charset.equalsIgnoreCase("utf8");
            byte[] attr = utf8flag ? fldBytes : fastParse(fldBytes, 0, fldBytes.length).trim().getBytes();
            if (i > 0) {
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/EqualPartitioning.java`
#### Snippet
```java
    {
        //Local variable should be declared here
        Double root = Math.sqrt(partitions);
        int partitionsAxis;
        double intervalX;
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/HilbertPartitioning.java`
#### Snippet
```java
    public static int locationMapping(double axisMin, double axisLocation, double axisMax)
    {
        Double gridLocation = (axisLocation - axisMin) * GRID_RESOLUTION / (axisMax - axisMin);
        return gridLocation.intValue();
    }
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `common/src/main/java/org/apache/sedona/common/enums/FileDataSplitter.java`
#### Snippet
```java
    QUESTIONMARK("?"),

    SINGLEQUOTE("\'"),

    QUOTE("\""),
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationPartitioner.java`
#### Snippet
```java
        newPixel.setDuplicate(false);
        duplicatePixelList.add(new Tuple2<Pixel, Double>(newPixel, pixelDoubleTuple2._2()));
        //existingPartitionIds.add(partitionId);

        //Tuple2<Integer,Integer> pixelCoordinateInPartition = new Tuple2<Integer, Integer>(pixelDoubleTuple2._1().getX()%partitionIntervalX,pixelDoubleTuple2._1().getY()%partitionIntervalY);
```

### CommentedOutCode
Commented out code (29 lines)
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationPartitioner.java`
#### Snippet
```java
        }

		/*
		// Check whether this pixel may have impact on neighbors

```

### CommentedOutCode
Commented out code (2 lines)
in `viz/src/main/java/org/apache/sedona/viz/core/ImageStitcher.java`
#### Snippet
```java
            int partitionMinX = partitionCoordinate._1 * Math.round(resolutionX / partitionOnX);
            int partitionMinY = partitionCoordinate._2 * Math.round(resolutionY / partitionOnY);
            //if(partitionMinX!=0){partitionMinX--;}
            //if(partitionMinY!=0){partitionMinY--;}
            int[] rgbArray = imageTile.getRGB(0, 0, imageTile.getWidth(), imageTile.getHeight(), null, 0, imageTile.getWidth());
```

### CommentedOutCode
Commented out code (2 lines)
in `viz/src/main/java/org/apache/sedona/viz/core/ImageStitcher.java`
#### Snippet
```java
            int partitionMinX = partitionCoordinate._1 * Math.round(resolutionX / partitionOnX);
            int partitionMinY = partitionCoordinate._2 * Math.round(resolutionY / partitionOnY);
            //if(partitionMinX!=0){partitionMinX--;}
            //if(partitionMinY!=0){partitionMinY--;}
            int[] rgbArray = imageTile.getRGB(0, 0, imageTile.getWidth(), imageTile.getHeight(), null, 0, imageTile.getWidth());
```

### CommentedOutCode
Commented out code (2 lines)
in `viz/src/main/java/org/apache/sedona/viz/core/ImageStitcher.java`
#### Snippet
```java
            int partitionMinX = partitionCoordinate._1 * Math.round(resolutionX / partitionOnX);
            int partitionMinY = partitionCoordinate._2 * Math.round(resolutionY / partitionOnY);
            //if(partitionMinX!=0){partitionMinX--;}
            //if(partitionMinY!=0){partitionMinY--;}
            int[] rgbArray = imageTile.getRGB(0, 0, imageTile.getWidth(), imageTile.getHeight(), null, 0, imageTile.getWidth());
```

### CommentedOutCode
Commented out code (344 lines)
in `viz/src/main/java/org/apache/sedona/viz/extension/imageGenerator/SedonaVizImageGenerator.java`
#### Snippet
```java
    final static Logger logger = Logger.getLogger(SedonaVizImageGenerator.class);

//    /**
//     * Save raster image as local file.
//     *
```

### CommentedOutCode
Commented out code (29 lines)
in `viz/src/main/java/org/apache/sedona/viz/extension/visualizationEffect/ChoroplethMap.java`
#### Snippet
```java
    }
	
	/*
	@Override
	protected JavaPairRDD<Integer, Color> GenerateColorMatrix()
```

### CommentedOutCode
Commented out code (2 lines)
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationOperator.java`
#### Snippet
```java
            }
        });
        //JavaPairRDD<Integer, Double> originalImage = sparkContext.parallelizePairs(this.countMatrix);
        //spatialRDDwithPixelId = spatialRDDwithPixelId.union(originalImage);
        spatialRDDwithPixelId = spatialRDDwithPixelId.filter(new Function<Tuple2<Pixel, Double>, Boolean>()
```

### CommentedOutCode
Commented out code (16 lines)
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationOperator.java`
#### Snippet
```java
        });

		/*
        spatialRDDwithPixelId = spatialRDDwithPixelId.reduceByKey(new Function2<Double,Double,Double>()
		{
```

### CommentedOutCode
Commented out code (23 lines)
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationOperator.java`
#### Snippet
```java
     * @return true, if successful
     */
    /*
    public boolean stitchImagePartitions() throws Exception
    {
```

### CommentedOutCode
Commented out code (9 lines)
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationOperator.java`
#### Snippet
```java
            List<Tuple2<Integer, ImageSerializableWrapper>> imageList = this.distributedRasterImage.collect();
            this.rasterImage = imageList.get(0)._2().image;
			/*
			BufferedImage renderedImage = new BufferedImage(this.resolutionX,this.resolutionY,BufferedImage.TYPE_INT_ARGB);
			List<Tuple2<Pixel,Integer>> colorMatrix = this.distributedRasterColorMatrix.collect();
```

### CommentedOutCode
Commented out code (34 lines)
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationOperator.java`
#### Snippet
```java
        }
        else {
            /*
            List<Tuple2<Pixel,Double>> collectedCountMatrix = this.distributedRasterCountMatrix.collect();
            HashMap<Pixel,Double> hashCountMatrix = new HashMap<Pixel,Double>();
```

### CommentedOutCode
Commented out code (2 lines)
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationOperator.java`
#### Snippet
```java
            }
        });
        //JavaPairRDD<Pixel, Double> originalImage = sparkContext.parallelizePairs(this.countMatrix);
        //JavaPairRDD<Integer,Double> completeSpatialRDDwithPixelId = spatialRDDwithPixelId.union(originalImage);

```

### CommentedOutCode
Commented out code (13 lines)
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationOperator.java`
#### Snippet
```java
        });

            /*
			spatialRDDwithPixelId = spatialRDDwithPixelId.reduceByKey(new Function2<Double,Double,Double>()
			{
```

### CommentedOutCode
Commented out code (4 lines)
in `viz/src/main/java/org/apache/sedona/viz/utils/RasterizationUtils.java`
#### Snippet
```java
            throw new Exception("[RasterizationUtils][Encode2DTo1DId] This given 2 dimension coordinate is " + twoDimensionIdX + " " + twoDimensionIdY + ". This coordinate is out of the given boundary and will be dropped.");
        }
		/*
		if((twoDimensionIdX+twoDimensionIdY*resolutionX)<0 ||(twoDimensionIdX+twoDimensionIdY*resolutionX)>(resolutionX*resolutionY-1))
		{
```

### CommentedOutCode
Commented out code (8 lines)
in `viz/src/main/java/org/apache/sedona/viz/utils/RasterizationUtils.java`
#### Snippet
```java
            datasetBoundary = datasetBoundaryOriginal;
        }
		/*
		 if(spatialCoordinate.x < datasetBoundary.getMinX() || spatialCoordinate.x > datasetBoundary.getMaxX())
		{
```

### CommentedOutCode
Commented out code (5 lines)
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/quadtree/QuadRectangle.java`
#### Snippet
```java
                && r.y >= this.y && r.y + r.height <= this.y + this.height;
    }
    /*
    public boolean contains(int x, int y) {
        return this.width > 0 && this.height > 0
```

### CommentedOutCode
Commented out code (7 lines)
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/quadtree/QuadRectangle.java`
#### Snippet
```java
    public int getUniqueId()
    {
        /*
        Long uniqueId = Long.valueOf(-1);
        try {
```

## RuleId[id=SortedCollectionWithNonComparableKeys]
### SortedCollectionWithNonComparableKeys
Construction of sorted collection with non-comparable elements
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/shapes/ShapeInputFormat.java`
#### Snippet
```java

            // sort by Path name and size using TreeMap
            Map<Path, Long> filePathSizePair = new TreeMap<Path, Long>();
            int i = 0;
            while (i < filePaths.length) {
```

## RuleId[id=LongLiteralsEndingWithLowercaseL]
### LongLiteralsEndingWithLowercaseL
'long' literal `0l` ends with lowercase 'l'
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/shapes/ShapeKey.java`
#### Snippet
```java
     * record id
     */
    Long index = 0l;

    public void write(DataOutput dataOutput)
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `common/src/main/java/org/apache/sedona/common/utils/FormatUtils.java`
#### Snippet
```java
        switch (geometryType) {
            case POINT:
                geometry = geometryFactory.createPoint(coordinates[0]);
                break;
            case POLYGON:
```

## RuleId[id=Deprecation]
### Deprecation
'org.apache.sedona.core.spatialRDD.RectangleRDD' is deprecated
in `viz/src/main/java/org/apache/sedona/viz/showcase/Example.java`
#### Snippet
```java
    {
        try {
            RectangleRDD spatialRDD = new RectangleRDD(sparkContext, RectangleInputLocation, RectangleSplitter, false, RectangleNumPartitions, StorageLevel.MEMORY_ONLY());
            HeatMap visualizationOperator = new HeatMap(1000, 600, USMainLandBoundary, false, 2, 4, 4, true, true);
            visualizationOperator.Visualize(sparkContext, spatialRDD);
```

### Deprecation
'org.apache.sedona.core.spatialRDD.RectangleRDD' is deprecated
in `viz/src/main/java/org/apache/sedona/viz/showcase/Example.java`
#### Snippet
```java
    {
        try {
            RectangleRDD spatialRDD = new RectangleRDD(sparkContext, RectangleInputLocation, RectangleSplitter, false, RectangleNumPartitions, StorageLevel.MEMORY_ONLY());
            HeatMap visualizationOperator = new HeatMap(1000, 600, USMainLandBoundary, false, 2, 4, 4, true, true);
            visualizationOperator.Visualize(sparkContext, spatialRDD);
```

### Deprecation
'org.apache.sedona.core.spatialRDD.RectangleRDD' is deprecated
in `viz/src/main/java/org/apache/sedona/viz/showcase/Example.java`
#### Snippet
```java
    {
        try {
            RectangleRDD spatialRDD = new RectangleRDD(sparkContext, RectangleInputLocation, RectangleSplitter, false, RectangleNumPartitions, StorageLevel.MEMORY_ONLY());
            HeatMap visualizationOperator = new HeatMap(1000, 600, USMainLandBoundary, false, 2, 4, 4, true, true);
            visualizationOperator.Visualize(sparkContext, spatialRDD);
```

### Deprecation
'org.apache.sedona.core.spatialRDD.RectangleRDD' is deprecated
in `viz/src/main/java/org/apache/sedona/viz/showcase/Example.java`
#### Snippet
```java
    {
        try {
            RectangleRDD spatialRDD = new RectangleRDD(sparkContext, RectangleInputLocation, RectangleSplitter, false, RectangleNumPartitions, StorageLevel.MEMORY_ONLY());
            HeatMap visualizationOperator = new HeatMap(1000, 600, USMainLandBoundary, false, 2, 4, 4, true, true);
            visualizationOperator.Visualize(sparkContext, spatialRDD);
```

### Deprecation
'org.apache.sedona.core.spatialRDD.RectangleRDD' is deprecated
in `viz/src/main/java/org/apache/sedona/viz/showcase/Example.java`
#### Snippet
```java
    {
        try {
            RectangleRDD spatialRDD = new RectangleRDD(sparkContext, RectangleInputLocation, RectangleSplitter, false, RectangleNumPartitions, StorageLevel.MEMORY_ONLY());
            HeatMap visualizationOperator = new HeatMap(1000, 600, USMainLandBoundary, false, 2);
            visualizationOperator.Visualize(sparkContext, spatialRDD);
```

### Deprecation
'org.apache.sedona.core.spatialRDD.RectangleRDD' is deprecated
in `viz/src/main/java/org/apache/sedona/viz/showcase/Example.java`
#### Snippet
```java
    {
        try {
            RectangleRDD spatialRDD = new RectangleRDD(sparkContext, RectangleInputLocation, RectangleSplitter, false, RectangleNumPartitions, StorageLevel.MEMORY_ONLY());
            HeatMap visualizationOperator = new HeatMap(1000, 600, USMainLandBoundary, false, 2);
            visualizationOperator.Visualize(sparkContext, spatialRDD);
```

### Deprecation
'org.apache.sedona.core.spatialRDD.RectangleRDD' is deprecated
in `core/src/main/java/org/apache/sedona/core/spatialRDD/CircleRDD.java`
#### Snippet
```java
     * @return the center rectangle RDD as spatial RDD
     */
    public RectangleRDD getCenterRectangleRDDAsSpatialRDD()
    {
        return new RectangleRDD(this.rawSpatialRDD.map(new Function<Circle, Polygon>()
```

### Deprecation
'org.apache.sedona.core.spatialRDD.RectangleRDD' is deprecated
in `core/src/main/java/org/apache/sedona/core/spatialRDD/CircleRDD.java`
#### Snippet
```java
    public RectangleRDD getCenterRectangleRDDAsSpatialRDD()
    {
        return new RectangleRDD(this.rawSpatialRDD.map(new Function<Circle, Polygon>()
        {

```

### Deprecation
'org.apache.sedona.core.formatMapper.shapefileParser.ShapefileRDD' is deprecated
in `core/src/main/java/org/apache/sedona/core/showcase/Example.java`
#### Snippet
```java
            throws Exception
    {
        ShapefileRDD shapefileRDD = new ShapefileRDD(sc, ShapeFileInputLocation);
        PolygonRDD spatialRDD = new PolygonRDD(shapefileRDD.getPolygonRDD());
        try {
```

### Deprecation
'org.apache.sedona.core.formatMapper.shapefileParser.ShapefileRDD' is deprecated
in `core/src/main/java/org/apache/sedona/core/showcase/Example.java`
#### Snippet
```java
            throws Exception
    {
        ShapefileRDD shapefileRDD = new ShapefileRDD(sc, ShapeFileInputLocation);
        PolygonRDD spatialRDD = new PolygonRDD(shapefileRDD.getPolygonRDD());
        try {
```

### Deprecation
'NetcdfDataset(ucar.nc2.NetcdfFile)' is deprecated
in `core/src/main/java/org/apache/sedona/core/formatMapper/netcdfParser/SerNetCDFUtils.java`
#### Snippet
```java
        try {
            HDFSRandomAccessFile raf = new HDFSRandomAccessFile(dfsUri, location, bufferSize);
            dataset = new NetcdfDataset(NetcdfFile.open(raf, location, null, null));
        }
        catch (IOException e) {
```

### Deprecation
'open(ucar.unidata.io.RandomAccessFile, java.lang.String, ucar.nc2.util.CancelTask, java.lang.Object)' is deprecated
in `core/src/main/java/org/apache/sedona/core/formatMapper/netcdfParser/SerNetCDFUtils.java`
#### Snippet
```java
        try {
            HDFSRandomAccessFile raf = new HDFSRandomAccessFile(dfsUri, location, bufferSize);
            dataset = new NetcdfDataset(NetcdfFile.open(raf, location, null, null));
        }
        catch (IOException e) {
```

### Deprecation
'getDimensions()' is deprecated
in `core/src/main/java/org/apache/sedona/core/formatMapper/netcdfParser/SerNetCDFUtils.java`
#### Snippet
```java
    {
        int dimSize = -1;
        Iterator<Dimension> it = netcdfFile.getDimensions().iterator();
        while (it.hasNext()) {
            Dimension d = it.next();
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `viz/src/main/java/org/apache/sedona/viz/core/ImageStitcher.java`
#### Snippet
```java
            BufferedImage imageTile = null;
            try {
                imageTile = ImageIO.read(new File("" + imageTilePath + "-" + RasterizationUtils.getImageTileName(zoomLevel, partitionOnX, partitionOnY, i) + ".png"));
            }
            catch (IOException e) {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/quadtree/QuadRectangle.java`
#### Snippet
```java
    public int hashCode()
    {
        String stringId = "" + x + y + width + height;
        return stringId.hashCode();
    }
```

## RuleId[id=NumberEquality]
### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/quadtree/QuadRectangle.java`
#### Snippet
```java
        return this.x == other.x && this.y == other.y
                && this.width == other.width && this.height == other.height
                && this.partitionId == other.partitionId;
    }

```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/KDB.java`
#### Snippet
```java

/**
 * see https://en.wikipedia.org/wiki/K-D-B-tree
 */
public class KDB extends PartitioningUtils
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `common/src/main/java/org/apache/sedona/common/utils/PointGeoHashEncoder.java`
#### Snippet
```java

public class PointGeoHashEncoder {
    private static String base32 = "0123456789bcdefghjkmnpqrstuvwxyz";
    private static int[] bits = new int[] { 16, 8, 4, 2, 1 };

```

### FieldCanBeLocal
Field can be converted to a local variable
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileRDD.java`
#### Snippet
```java
     * bounding box.
     */
    private BoundBox boundBox = null;

    /**
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `Input.read()` is ignored
in `viz/src/main/java/org/apache/sedona/viz/core/Serde/ImageWrapperSerializer.java`
#### Snippet
```java
            int length = input.readInt();
            byte[] inputData = new byte[length];
            input.read(inputData);
            return new ImageSerializableWrapper(ImageIO.read(new ByteArrayInputStream(inputData)));
        }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `viz/src/main/java/org/apache/sedona/viz/core/ImageGenerator.java`
#### Snippet
```java

            // tries to delete a non-existing file
            file.delete();
        }
        catch (Exception e) {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `viz/src/main/java/org/apache/sedona/viz/core/ImageGenerator.java`
#### Snippet
```java
        logger.info("[Sedona-Viz][SaveRasterImageAsLocalFile][Start]");
        File outputImage = new File(outputPath + "." + imageType.getTypeName());
        outputImage.getParentFile().mkdirs();
        try {
            ImageIO.write(rasterImage, imageType.getTypeName(), outputImage);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `viz/src/main/java/org/apache/sedona/viz/core/ImageGenerator.java`
#### Snippet
```java
        logger.info("[Sedona-Viz][SaveVectorImageAsLocalFile][Start]");
        File outputImage = new File(outputPath + "." + imageType.getTypeName());
        outputImage.getParentFile().mkdirs();

        BufferedWriter bw = null;
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `viz/src/main/java/org/apache/sedona/viz/core/BigBufferedImage.java`
#### Snippet
```java
            if (files != null) {
                for (File file : files) {
                    file.delete();
                }
                files = null;
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `viz/src/main/java/org/apache/sedona/viz/core/BigBufferedImage.java`
#### Snippet
```java
            }
            if (path != null) {
                new File(path).delete();
                path = null;
            }
```

### IgnoreResultOfCall
Result of `File.mkdir()` is ignored
in `viz/src/main/java/org/apache/sedona/viz/core/BigBufferedImage.java`
#### Snippet
```java
            path = dir.getPath() + "/" + id;
            File subDir = new File(path);
            subDir.mkdir();
            buffer = new MappedByteBuffer[banks];
            accessFiles = new RandomAccessFile[banks];
```

### IgnoreResultOfCall
Result of `Input.read()` is ignored
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/shp/ShapeReaderFactory.java`
#### Snippet
```java
    {
        byte[] bytes = new byte[numBytes];
        input.read(bytes);
        return ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN);
    }
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
2 \* (contentLength + 4): integer multiplication implicitly cast to long
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/shp/ShpFileParser.java`
#### Snippet
```java
        // get length of record content
        int contentLength = reader.readInt();
        long recordLength = 2 * (contentLength + 4);
        remainLength -= recordLength;
        int typeID = EndianUtils.swapInteger(reader.readInt());
```

### IntegerMultiplicationImplicitCastToLong
2 \* (contentLength + 4): integer multiplication implicitly cast to long
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/shp/ShpFileParser.java`
#### Snippet
```java
        // get length of record content
        int contentLength = reader.readInt();
        long recordLength = 2 * (contentLength + 4);
        remainLength -= recordLength;
        int typeID = EndianUtils.swapInteger(reader.readInt());
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/shapes/ShapeFileReader.java`
#### Snippet
```java
            throws IOException, InterruptedException
    {
        if (useIndex) {
            /**
             * with index, iterate until end and extract bytes with information from indexes
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.util.Optional;`
in `common/src/main/java/org/apache/sedona/common/utils/GeometryGeoHashEncoder.java`
#### Snippet
```java
package org.apache.sedona.common.utils;

import java.util.Optional;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Envelope;
```

### UNUSED_IMPORT
Unused import `import javax.swing.*;`
in `common/src/main/java/org/apache/sedona/common/utils/S2Utils.java`
#### Snippet
```java
import org.locationtech.jts.geom.*;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;
```

### UNUSED_IMPORT
Unused import `import org.apache.sedona.core.formatMapper.FormatMapper;`
in `core/src/main/java/org/apache/sedona/core/enums/GridType.java`
#### Snippet
```java

import org.apache.log4j.Logger;
import org.apache.sedona.core.formatMapper.FormatMapper;

import java.io.Serializable;
```

### UNUSED_IMPORT
Unused import `import javax.annotation.Nullable;`
in `core/src/main/java/org/apache/sedona/core/joinJudgement/DynamicIndexLookupJudgement.java`
#### Snippet
```java
import org.locationtech.jts.index.strtree.STRtree;

import javax.annotation.Nullable;

import java.io.Serializable;
```

### UNUSED_IMPORT
Unused import `import javax.annotation.Nullable;`
in `core/src/main/java/org/apache/sedona/core/joinJudgement/LeftIndexLookupJudgement.java`
#### Snippet
```java
import org.locationtech.jts.index.SpatialIndex;

import javax.annotation.Nullable;

import java.io.Serializable;
```

### UNUSED_IMPORT
Unused import `import javax.annotation.Nullable;`
in `core/src/main/java/org/apache/sedona/core/joinJudgement/NestedLoopJudgement.java`
#### Snippet
```java
import org.locationtech.jts.geom.Geometry;

import javax.annotation.Nullable;

import java.io.Serializable;
```

### UNUSED_IMPORT
Unused import `import javax.annotation.Nullable;`
in `core/src/main/java/org/apache/sedona/core/joinJudgement/RightIndexLookupJudgement.java`
#### Snippet
```java
import org.locationtech.jts.index.SpatialIndex;

import javax.annotation.Nullable;

import java.io.Serializable;
```

### UNUSED_IMPORT
Unused import `import java.util.Arrays;`
in `core/src/main/java/org/apache/sedona/core/spatialRDD/SpatialRDD.java`
#### Snippet
```java
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
```

## RuleId[id=ReturnFromFinallyBlock]
### ReturnFromFinallyBlock
'return' inside 'finally' block
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileRDD.java`
#### Snippet
```java
            }
            finally {
                return shape;
            }
        }
```

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+=` in loop
in `common/src/main/java/org/apache/sedona/common/utils/FormatUtils.java`
#### Snippet
```java
            for (int i = 0; i < this.startOffset; i++) {
                if (firstColumnFlag) {
                    otherAttributes += columns[i];
                    firstColumnFlag = false;
                }
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `common/src/main/java/org/apache/sedona/common/utils/FormatUtils.java`
#### Snippet
```java
                    firstColumnFlag = false;
                }
                else { otherAttributes += "\t" + columns[i]; }
            }
            for (int i = actualEndOffset + 1; i < columns.length; i++) {
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `common/src/main/java/org/apache/sedona/common/utils/FormatUtils.java`
#### Snippet
```java
            for (int i = actualEndOffset + 1; i < columns.length; i++) {
                if (firstColumnFlag) {
                    otherAttributes += columns[i];
                    firstColumnFlag = false;
                }
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `common/src/main/java/org/apache/sedona/common/utils/FormatUtils.java`
#### Snippet
```java
                    firstColumnFlag = false;
                }
                else { otherAttributes += "\t" + columns[i]; }
            }
        }
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `viz/src/main/java/org/apache/sedona/viz/core/ImageStitcher.java`
#### Snippet
```java
        String localPath = "";
        for (int i = 1; i < portAndPath.length; i++) {
            localPath += "/" + portAndPath[i];
        }

```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `viz/src/main/java/org/apache/sedona/viz/core/ImageGenerator.java`
#### Snippet
```java
        String localPath = "";
        for (int i = 1; i < portAndPath.length; i++) {
            localPath += "/" + portAndPath[i];
        }
        localPath += "." + imageType.getTypeName();
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `viz/src/main/java/org/apache/sedona/viz/core/ImageGenerator.java`
#### Snippet
```java
        String localPath = "";
        for (int i = 1; i < portAndPath.length; i++) {
            localPath += "/" + portAndPath[i];
        }
        localPath += "." + imageType.getTypeName();
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `core/src/main/java/org/apache/sedona/core/utils/SedonaConf.java`
#### Snippet
```java
                String name = field.getName();
                Object value = field.get(this);
                sb += name + ": " + value.toString() + "\n";
            }
            return sb;
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `core/src/main/java/org/apache/sedona/core/formatMapper/EarthdataHDFPointMapper.java`
#### Snippet
```java

                    for (int k = 0; k < dataVariableList.length - 1; k++) {
                        userData += SerNetCDFUtils.getDataAsym(dataArrayList[k], j, i, offset, increment) + " ";
                    }
                    userData += SerNetCDFUtils.getDataAsym(dataArrayList[dataVariableList.length - 1], j, i, offset, increment);
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/fieldname/FieldnameRecordReader.java`
#### Snippet
```java
                fieldNames += fieldDescriptors.get(i).getFieldName();
            }
            else {fieldNames += "\t" + fieldDescriptors.get(i).getFieldName();}
        }
        return fieldNames;
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `updatedBbox` initializer `null` is redundant
in `common/src/main/java/org/apache/sedona/common/utils/PointGeoHashEncoder.java`
#### Snippet
```java
        }
        
        BBox updatedBbox = null;
        int updatedCh = -1;
        if (isEven) {
```

### UnusedAssignment
Variable `updatedCh` initializer `-1` is redundant
in `common/src/main/java/org/apache/sedona/common/utils/PointGeoHashEncoder.java`
#### Snippet
```java
        
        BBox updatedBbox = null;
        int updatedCh = -1;
        if (isEven) {
            double mid = (bbox.startLon + bbox.endLon) / 2.0;
```

### UnusedAssignment
Variable `geometryType` initializer `null` is redundant
in `common/src/main/java/org/apache/sedona/common/utils/FormatUtils.java`
#### Snippet
```java
     */
    protected String otherAttributes = "";
    protected GeometryType geometryType = null;
    /**
     * The factory.
```

### UnusedAssignment
Variable `geometry` initializer `null` is redundant
in `common/src/main/java/org/apache/sedona/common/utils/FormatUtils.java`
#### Snippet
```java
    {
        GeometryFactory geometryFactory = new GeometryFactory();
        Geometry geometry = null;
        switch (geometryType) {
            case POINT:
```

### UnusedAssignment
Variable `distance_sqr` initializer `0.0` is redundant
in `common/src/main/java/org/apache/sedona/common/simplify/CoordinateSplitter.java`
#### Snippet
```java
        for (int itk = itFirst + 1; itk < itLast; itk++){
            Coordinate c = geom[itk];
            double distance_sqr = 0.0;
            double ca_x = c.x - pointA.x;
            double ca_y = c.y - pointA.y;
```

### UnusedAssignment
Variable `geometryBboxAligned` initializer `null` is redundant
in `common/src/main/java/org/apache/sedona/common/subDivide/GeometrySubDivider.java`
#### Snippet
```java
        double width = geometryBbox.getWidth();
        double height = geometryBbox.getHeight();
        Envelope geometryBboxAligned = null;
        if (width == 0) {
            geometryBboxAligned = new Envelope(
```

### UnusedAssignment
Variable `circle` initializer `null` is redundant
in `common/src/main/java/org/apache/sedona/common/Functions.java`
#### Snippet
```java
        Coordinate centre = minimumBoundingCircle.getCentre();
        double radius = minimumBoundingCircle.getRadius();
        Geometry circle = null;
        if (centre == null) {
            circle = geometry.getFactory().createPolygon();
```

### UnusedAssignment
Variable `generateDistributedImage` initializer `false` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/VectorOverlayOperator.java`
#### Snippet
```java
     * The generate distributed image.
     */
    public boolean generateDistributedImage = false;

    /**
```

### UnusedAssignment
Variable `generateDistributedImage` initializer `false` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/RasterOverlayOperator.java`
#### Snippet
```java
     * The generate distributed image.
     */
    public boolean generateDistributedImage = false;

    /**
```

### UnusedAssignment
Variable `imageTile` initializer `null` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/ImageStitcher.java`
#### Snippet
```java
        //Stitch all image partitions together
        for (int i = 0; i < partitionOnX * partitionOnY; i++) {
            BufferedImage imageTile = null;
            try {
                imageTile = ImageIO.read(new File("" + imageTilePath + "-" + RasterizationUtils.getImageTileName(zoomLevel, partitionOnX, partitionOnY, i) + ".png"));
```

### UnusedAssignment
Variable `imageTile` initializer `null` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/ImageStitcher.java`
#### Snippet
```java
        //Stitch all image partitions together
        for (int i = 0; i < partitionOnX * partitionOnY; i++) {
            BufferedImage imageTile = null;
            try {
                imageTile = s3Operator.getImage(bucketName, imageTilePath + "-" + RasterizationUtils.getImageTileName(zoomLevel, partitionOnX, partitionOnY, i) + ".png");
```

### UnusedAssignment
Variable `imageTile` initializer `null` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/ImageStitcher.java`
#### Snippet
```java
        //Stitch all image partitions together
        for (int i = 0; i < partitionOnX * partitionOnY; i++) {
            BufferedImage imageTile = null;
            try {
                if (hdfs.exists(new org.apache.hadoop.fs.Path(localPath + "-" + RasterizationUtils.getImageTileName(zoomLevel, partitionOnX, partitionOnY, i) + ".png"))) {
```

### UnusedAssignment
Variable `file` initializer `null` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/ImageGenerator.java`
#### Snippet
```java
    public boolean deleteLocalFile(String originalOutputPath, ImageType imageType)
    {
        File file = null;
        try {

```

### UnusedAssignment
Variable `drawOutlineOnly` initializer `false` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/GlobalParameter.java`
#### Snippet
```java
     * The draw outline only.
     */
    public boolean drawOutlineOnly = false;

    /**
```

### UnusedAssignment
Variable `samplingFraction` initializer `0.01` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/GlobalParameter.java`
#### Snippet
```java
     */
    // Coloring rule parameters: 6
    public double samplingFraction = 0.01;

    /**
```

### UnusedAssignment
Variable `colorAlpha` initializer `255` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/GlobalParameter.java`
#### Snippet
```java
     * The color alpha.
     */
    public int colorAlpha = 255;

    /**
```

### UnusedAssignment
Variable `controlColorChannel` initializer `Color.GREEN` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/GlobalParameter.java`
#### Snippet
```java
     * The control color channel.
     */
    public Color controlColorChannel = Color.GREEN;

    /**
```

### UnusedAssignment
Variable `useInverseRatioForControlColorChannel` initializer `false` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/GlobalParameter.java`
#### Snippet
```java
     * The use inverse ratio for control color channel.
     */
    public boolean useInverseRatioForControlColorChannel = false;

    /**
```

### UnusedAssignment
Variable `filterRadius` initializer `0` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/GlobalParameter.java`
#### Snippet
```java
     */
    // Photo filter parameters: 2
    public int filterRadius = 0;

    /**
```

### UnusedAssignment
Variable `datasetBoundary` initializer `new Envelope(-20026376.39, 20026376.39, -20048966.10, 20048966.10)` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/GlobalParameter.java`
#### Snippet
```java
     */
    // Dataset boundary: 1
    public Envelope datasetBoundary = new Envelope(-20026376.39, 20026376.39, -20048966.10, 20048966.10);

    /**
```

### UnusedAssignment
Variable `maxPixelWeight` initializer `-1` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/GlobalParameter.java`
#### Snippet
```java
     * The max pixel weight.
     */
    public int maxPixelWeight = -1;

    /**
```

### UnusedAssignment
Variable `reverseSpatialCoordinate` initializer `false` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/GlobalParameter.java`
#### Snippet
```java
     * The reverse spatial coordinate.
     */
    public boolean reverseSpatialCoordinate = false;

    /**
```

### UnusedAssignment
Variable `overwriteExistingImages` initializer `true` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/GlobalParameter.java`
#### Snippet
```java
     * The overwrite existing images.
     */
    public boolean overwriteExistingImages = true;

    private GlobalParameter(int resolutionX, int resolutionY, boolean reverseSpatialCoordinate, boolean drawOutlineOnly, int minTreeLevel,
```

### UnusedAssignment
Variable `partitionsOnSingleAxis` initializer `-1` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/GlobalParameter.java`
#### Snippet
```java
     */
    // Indirect parameters: 3
    public int partitionsOnSingleAxis = -1;

    /**
```

### UnusedAssignment
Variable `partitionIntervalY` initializer `-1.0` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/GlobalParameter.java`
#### Snippet
```java
     * The partition interval Y.
     */
    public double partitionIntervalY = -1.0;

    /**
```

### UnusedAssignment
Variable `resolutionX` initializer `-1` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/GlobalParameter.java`
#### Snippet
```java
     */
    // Pixelize parameters: 5
    public int resolutionX = -1;

    /**
```

### UnusedAssignment
Variable `maxPartitionTreeLevel` initializer `9` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/GlobalParameter.java`
#### Snippet
```java
     * The max partition tree level.
     */
    public int maxPartitionTreeLevel = 9;

    /**
```

### UnusedAssignment
Variable `useUserSuppliedResolution` initializer `false` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/GlobalParameter.java`
#### Snippet
```java
     * The use user supplied resolution.
     */
    public boolean useUserSuppliedResolution = false;

    /**
```

### UnusedAssignment
Variable `resolutionY` initializer `-1` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/GlobalParameter.java`
#### Snippet
```java
     * The resolution Y.
     */
    public int resolutionY = -1;

    /**
```

### UnusedAssignment
Variable `minTreeLevel` initializer `0` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/GlobalParameter.java`
#### Snippet
```java
     * The min tree level.
     */
    public int minTreeLevel = 0;

    /**
```

### UnusedAssignment
Variable `partitionIntervalX` initializer `-1.0` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/GlobalParameter.java`
#### Snippet
```java
     * The partition interval X.
     */
    public double partitionIntervalX = -1.0;

    /**
```

### UnusedAssignment
Variable `spatialObject` initializer `null` is redundant
in `core/src/main/java/org/apache/sedona/core/showcase/UserSuppliedPolygonMapper.java`
#### Snippet
```java
        while (stringIterator.hasNext()) {
            String line = stringIterator.next();
            Geometry spatialObject = null;
            MultiPolygon multiSpatialObjects = null;
            List<String> lineSplitList;
```

### UnusedAssignment
Variable `multiSpatialObjects` initializer `null` is redundant
in `core/src/main/java/org/apache/sedona/core/showcase/UserSuppliedPolygonMapper.java`
#### Snippet
```java
            String line = stringIterator.next();
            Geometry spatialObject = null;
            MultiPolygon multiSpatialObjects = null;
            List<String> lineSplitList;
            lineSplitList = Arrays.asList(line.split("\t"));
```

### UnusedAssignment
Variable `spatialObject` initializer `null` is redundant
in `core/src/main/java/org/apache/sedona/core/showcase/UserSuppliedLineStringMapper.java`
#### Snippet
```java
        while (stringIterator.hasNext()) {
            String line = stringIterator.next();
            Geometry spatialObject = null;
            MultiLineString multiSpatialObjects = null;
            List<String> lineSplitList;
```

### UnusedAssignment
Variable `multiSpatialObjects` initializer `null` is redundant
in `core/src/main/java/org/apache/sedona/core/showcase/UserSuppliedLineStringMapper.java`
#### Snippet
```java
            String line = stringIterator.next();
            Geometry spatialObject = null;
            MultiLineString multiSpatialObjects = null;
            List<String> lineSplitList;
            lineSplitList = Arrays.asList(line.split("\t"));
```

### UnusedAssignment
Variable `parallelRenderImage` initializer `false` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationOperator.java`
#### Snippet
```java
     * The parallel render image.
     */
    protected boolean parallelRenderImage = false;

    /**
```

### UnusedAssignment
Variable `colorizeOption` initializer `ColorizeOption.NORMAL` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationOperator.java`
#### Snippet
```java
     * The colorize option.
     */
    protected ColorizeOption colorizeOption = ColorizeOption.NORMAL;
    /**
     * The max pixel count.
```

### UnusedAssignment
Variable `pixelCountValue` initializer `0.0` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationOperator.java`
#### Snippet
```java
                            int neighborPixelX = centerPixelCoordinate._1 + x;
                            int neighborPixelY = centerPixelCoordinate._2 + y;
                            Double pixelCountValue = 0.0;
                            if (neighborPixelX >= resolutionX || neighborPixelX < 0 || neighborPixelY >= resolutionY || neighborPixelY < 0) {
                                continue;
```

### UnusedAssignment
Variable `parallelPhotoFilter` initializer `false` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationOperator.java`
#### Snippet
```java
     * The parallel photo filter.
     */
    protected boolean parallelPhotoFilter = false;

    /*
```

### UnusedAssignment
Variable `colorModel` initializer `null` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/BigBufferedImage.java`
#### Snippet
```java
    {
        FileDataBuffer buffer = new FileDataBuffer(tempDir, width * height, 4);
        ColorModel colorModel = null;
        BandedSampleModel sampleModel = null;
        switch (imageType) {
```

### UnusedAssignment
Variable `sampleModel` initializer `null` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/BigBufferedImage.java`
#### Snippet
```java
        FileDataBuffer buffer = new FileDataBuffer(tempDir, width * height, 4);
        ColorModel colorModel = null;
        BandedSampleModel sampleModel = null;
        switch (imageType) {
            case TYPE_INT_RGB:
```

### UnusedAssignment
Variable `spatialObject` initializer `null` is redundant
in `core/src/main/java/org/apache/sedona/core/showcase/UserSuppliedRectangleMapper.java`
#### Snippet
```java
        while (stringIterator.hasNext()) {
            String line = stringIterator.next();
            Geometry spatialObject = null;
            MultiPolygon multiSpatialObjects = null;
            List<String> lineSplitList;
```

### UnusedAssignment
Variable `multiSpatialObjects` initializer `null` is redundant
in `core/src/main/java/org/apache/sedona/core/showcase/UserSuppliedRectangleMapper.java`
#### Snippet
```java
            String line = stringIterator.next();
            Geometry spatialObject = null;
            MultiPolygon multiSpatialObjects = null;
            List<String> lineSplitList;
            lineSplitList = Arrays.asList(line.split("\t"));
```

### UnusedAssignment
Variable `pixelCoordinate1` initializer `null` is redundant
in `viz/src/main/java/org/apache/sedona/viz/utils/RasterizationUtils.java`
#### Snippet
```java
        List<Tuple2<Pixel, Double>> result = new ArrayList<Tuple2<Pixel, Double>>();
        for (int i = 0; i < spatialObject.getCoordinates().length - 1; i++) {
            Tuple2<Integer, Integer> pixelCoordinate1 = null;
            Tuple2<Integer, Integer> pixelCoordinate2 = null;
            try {
```

### UnusedAssignment
Variable `pixelCoordinate2` initializer `null` is redundant
in `viz/src/main/java/org/apache/sedona/viz/utils/RasterizationUtils.java`
#### Snippet
```java
        for (int i = 0; i < spatialObject.getCoordinates().length - 1; i++) {
            Tuple2<Integer, Integer> pixelCoordinate1 = null;
            Tuple2<Integer, Integer> pixelCoordinate2 = null;
            try {
                pixelCoordinate1 = FindOnePixelCoordinate(resolutionX, resolutionY, datasetBoundary, spatialObject.getCoordinates()[i], reverseSpatialCoordinate);
```

### UnusedAssignment
Variable `pixelCoordinate` initializer `null` is redundant
in `viz/src/main/java/org/apache/sedona/viz/utils/RasterizationUtils.java`
#### Snippet
```java
    {
        List<Tuple2<Pixel, Double>> result = new ArrayList<Tuple2<Pixel, Double>>();
        Tuple2<Integer, Integer> pixelCoordinate = null;
        try {
            pixelCoordinate = FindOnePixelCoordinate(resolutionX, resolutionY, datasetBoundary, spatialObject.getCoordinate(), reverseSpatialCoordinate);
```

### UnusedAssignment
Variable `pixelCoordinate1` initializer `null` is redundant
in `viz/src/main/java/org/apache/sedona/viz/utils/RasterizationUtils.java`
#### Snippet
```java
        List<Tuple2<Pixel, Double>> result = new ArrayList<Tuple2<Pixel, Double>>();
        for (int i = 0; i < spatialObject.getCoordinates().length - 1; i++) {
            Tuple2<Integer, Integer> pixelCoordinate1 = null;
            Tuple2<Integer, Integer> pixelCoordinate2 = null;
            try {
```

### UnusedAssignment
Variable `pixelCoordinate2` initializer `null` is redundant
in `viz/src/main/java/org/apache/sedona/viz/utils/RasterizationUtils.java`
#### Snippet
```java
        for (int i = 0; i < spatialObject.getCoordinates().length - 1; i++) {
            Tuple2<Integer, Integer> pixelCoordinate1 = null;
            Tuple2<Integer, Integer> pixelCoordinate2 = null;
            try {
                pixelCoordinate1 = FindOnePixelCoordinate(resolutionX, resolutionY, datasetBoundary, spatialObject.getCoordinates()[i], reverseSpatialCoordinate);
```

### UnusedAssignment
Variable `pixelCoordinate` initializer `null` is redundant
in `viz/src/main/java/org/apache/sedona/viz/utils/RasterizationUtils.java`
#### Snippet
```java
        LinearRing linear;
        for (int i = 0; i < spatialObject.getCoordinates().length; i++) {
            Tuple2<Integer, Integer> pixelCoordinate = null;
            pixelCoordinate = FindOnePixelCoordinate(resolutionX, resolutionY, datasetBoundary, spatialObject.getCoordinates()[i], reverseSpatialCoordinate);

```

### UnusedAssignment
Variable `bytes` initializer `null` is redundant
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/shapes/ShpRecord.java`
#### Snippet
```java
     * primitive byte contents
     */
    private BytesWritable bytes = null;

    /**
```

### UnusedAssignment
Variable `typeID` initializer `-1` is redundant
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/shapes/ShpRecord.java`
#### Snippet
```java
     * shape type
     */
    private int typeID = -1;

    /**
```

### UnusedAssignment
Variable `coordinate` initializer `null` is redundant
in `core/src/main/java/org/apache/sedona/core/formatMapper/EarthdataHDFPointMapper.java`
#### Snippet
```java
                for (int i = 0; i < geolocationShape[1]; i++) {
                    // We probably need to switch longitude and latitude if needed.
                    Coordinate coordinate = null;
                    if (switchCoordinateXY) {
                        coordinate = new Coordinate(SerNetCDFUtils.getDataSym(longitudeArray, j, i),
```

### UnusedAssignment
Variable `dataVariableName` initializer `"LST"` is redundant
in `core/src/main/java/org/apache/sedona/core/formatMapper/EarthdataHDFPointMapper.java`
#### Snippet
```java
     * The data variable name.
     */
    private String dataVariableName = "LST";
    /**
     * The longitude path.
```

### UnusedAssignment
Variable `rootGroupName` initializer `"MOD_Swath_LST"` is redundant
in `core/src/main/java/org/apache/sedona/core/formatMapper/EarthdataHDFPointMapper.java`
#### Snippet
```java
     * The root group name.
     */
    private String rootGroupName = "MOD_Swath_LST";
    /**
     * The data variable name.
```

### UnusedAssignment
Variable `increment` initializer `1` is redundant
in `core/src/main/java/org/apache/sedona/core/formatMapper/EarthdataHDFPointMapper.java`
#### Snippet
```java
     * The increment.
     */
    private int increment = 1;
    /**
     * The root group name.
```

### UnusedAssignment
Variable `dataPath` initializer `""` is redundant
in `core/src/main/java/org/apache/sedona/core/formatMapper/EarthdataHDFPointMapper.java`
#### Snippet
```java
     * The data path.
     */
    private String dataPath = "";
    /**
     * The switch coordinate XY. By default, longitude is X, latitude is Y
```

### UnusedAssignment
Variable `latitudePath` initializer `""` is redundant
in `core/src/main/java/org/apache/sedona/core/formatMapper/EarthdataHDFPointMapper.java`
#### Snippet
```java
     * The latitude path.
     */
    private String latitudePath = "";
    /**
     * The data path.
```

### UnusedAssignment
Variable `offset` initializer `0` is redundant
in `core/src/main/java/org/apache/sedona/core/formatMapper/EarthdataHDFPointMapper.java`
#### Snippet
```java
     * The offset.
     */
    private int offset = 0;
    /**
     * The increment.
```

### UnusedAssignment
Variable `longitudePath` initializer `""` is redundant
in `core/src/main/java/org/apache/sedona/core/formatMapper/EarthdataHDFPointMapper.java`
#### Snippet
```java
     * The longitude path.
     */
    private String longitudePath = "";
    /**
     * The latitude path.
```

### UnusedAssignment
Variable `bounds` initializer `null` is redundant
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/boundary/BoundBox.java`
#### Snippet
```java
     * bounds of 8 numbers. Xmin, Ymin, Xmax, Ymax, Zmin, Zmax, Mmin, Mmax
     */
    double[] bounds = null;

    /**
```

### UnusedAssignment
Variable `boundBox` initializer `null` is redundant
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileRDD.java`
#### Snippet
```java
     * bounding box.
     */
    private BoundBox boundBox = null;

    /**
```

### UnusedAssignment
Variable `shapeRDD` initializer `null` is redundant
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileRDD.java`
#### Snippet
```java
     * shape collection.
     */
    private JavaRDD<Geometry> shapeRDD = null;
    /**
     * bounding box.
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `geom` is always 'null'
in `common/src/main/java/org/apache/sedona/common/utils/S2Utils.java`
#### Snippet
```java
        if (geom instanceof Polygon) {
            return S2Utils.toS2Polygon((Polygon) geom);
        } else if (geom instanceof LineString) {
            return S2Utils.toS2PolyLine((LineString) geom);
        }
```

### ConstantValue
Value `geom` is always 'null'
in `common/src/main/java/org/apache/sedona/common/simplify/GeometrySimplifier.java`
#### Snippet
```java
        if (geom instanceof Circle) {
            return CircleSimplifier.simplify((Circle) geom, preserveCollapsed, epsilon);
        } else if (geom instanceof GeometryCollection) {
            return GeometryCollectionSimplifier.simplify((GeometryCollection) geom, preserveCollapsed, epsilon);
        } else if (geom instanceof LineString) {
```

### ConstantValue
Value `geom` is always 'null'
in `common/src/main/java/org/apache/sedona/common/simplify/GeometrySimplifier.java`
#### Snippet
```java
        } else if (geom instanceof GeometryCollection) {
            return GeometryCollectionSimplifier.simplify((GeometryCollection) geom, preserveCollapsed, epsilon);
        } else if (geom instanceof LineString) {
            return LineStringSimplifier.simplify(geom, preserveCollapsed, epsilon);
        } else if (geom instanceof Polygon) {
```

### ConstantValue
Value `geom` is always 'null'
in `common/src/main/java/org/apache/sedona/common/simplify/GeometrySimplifier.java`
#### Snippet
```java
        } else if (geom instanceof LineString) {
            return LineStringSimplifier.simplify(geom, preserveCollapsed, epsilon);
        } else if (geom instanceof Polygon) {
            return PolygonSimplifier.simplify((Polygon) geom, preserveCollapsed, epsilon);
        }else {
```

### ConstantValue
Value `geom` is always 'null'
in `common/src/main/java/org/apache/sedona/common/simplify/GeometrySimplifier.java`
#### Snippet
```java
            return PolygonSimplifier.simplify((Polygon) geom, preserveCollapsed, epsilon);
        }else {
            return geom;
        }
    }
```

### ConstantValue
Value `subGeom` is always 'null'
in `common/src/main/java/org/apache/sedona/common/simplify/GeometryCollectionSimplifier.java`
#### Snippet
```java
                        return CircleSimplifier.simplify( (Circle) subGeom, preserveCollapsed, epsilon);
                    }
                    else if (subGeom instanceof LineString) {
                        return LineStringSimplifier.simplify((LineString) subGeom, preserveCollapsed, epsilon);
                    }
```

### ConstantValue
Value `subGeom` is always 'null'
in `common/src/main/java/org/apache/sedona/common/simplify/GeometryCollectionSimplifier.java`
#### Snippet
```java
                        return LineStringSimplifier.simplify((LineString) subGeom, preserveCollapsed, epsilon);
                    }
                    else if (subGeom instanceof Point) {
                        return subGeom;
                    }
```

### ConstantValue
Value `subGeom` is always 'null'
in `common/src/main/java/org/apache/sedona/common/simplify/GeometryCollectionSimplifier.java`
#### Snippet
```java
                        return subGeom;
                    }
                    else if (subGeom instanceof Polygon) {
                        return PolygonSimplifier.simplify((Polygon) subGeom, preserveCollapsed, epsilon);
                    }
```

### ConstantValue
Value `subGeom` is always 'null'
in `common/src/main/java/org/apache/sedona/common/simplify/GeometryCollectionSimplifier.java`
#### Snippet
```java
                        return PolygonSimplifier.simplify((Polygon) subGeom, preserveCollapsed, epsilon);
                    }
                    else if (subGeom instanceof GeometryCollection) {
                        return simplify((GeometryCollection) subGeom, preserveCollapsed, epsilon);
                    } else {
```

### ConstantValue
Value `geometry` is always 'null'
in `common/src/main/java/org/apache/sedona/common/utils/GeomUtils.java`
#### Snippet
```java
        if (geometry instanceof Lineal) {
            return true;
        } else if (geometryIsHomogeneous(geometry) && geometry.getDimension() == 1) {
            return true;
        }
```

### ConstantValue
Value `geometry` is always 'null'
in `common/src/main/java/org/apache/sedona/common/utils/GeomUtils.java`
#### Snippet
```java
        if (geometry instanceof Polygonal) {
            return true;
        } else if (geometryIsHomogeneous(geometry) && geometry.getDimension() == 2) {
            return true;
        }
```

### ConstantValue
Value `geometry` is always 'null'
in `common/src/main/java/org/apache/sedona/common/utils/GeomUtils.java`
#### Snippet
```java
        if (geometry instanceof Puntal) {
            return true;
        } else if (geometryIsHomogeneous(geometry) && geometry.getDimension() == 0) {
            return true;
        }
```

### ConstantValue
Condition `o instanceof STRtree` is always `false`
in `common/src/main/java/org/apache/sedona/common/geometrySerde/SpatialIndexSerde.java`
#### Snippet
```java
            indexSerde.write(kryo, output, tree);
        }
        else if (o instanceof STRtree) {
            //serialize rtree index
            writeType(output, Type.RTREE);
```

### ConstantValue
Condition `object instanceof Point` is always `false`
in `common/src/main/java/org/apache/sedona/common/geometrySerde/GeometrySerde.java`
#### Snippet
```java
            writeUserData(kryo, out, circle);
        }
        else if (object instanceof Point || object instanceof LineString
                || object instanceof Polygon || object instanceof GeometryCollection) {
            writeType(out, Type.SHAPE);
```

### ConstantValue
Condition `object instanceof Point || object instanceof LineString || object instanceof Polygon...` is always `false`
in `common/src/main/java/org/apache/sedona/common/geometrySerde/GeometrySerde.java`
#### Snippet
```java
            writeUserData(kryo, out, circle);
        }
        else if (object instanceof Point || object instanceof LineString
                || object instanceof Polygon || object instanceof GeometryCollection) {
            writeType(out, Type.SHAPE);
            writeGeometry(kryo, out, (Geometry) object);
```

### ConstantValue
Condition `object instanceof LineString` is always `false`
in `common/src/main/java/org/apache/sedona/common/geometrySerde/GeometrySerde.java`
#### Snippet
```java
            writeUserData(kryo, out, circle);
        }
        else if (object instanceof Point || object instanceof LineString
                || object instanceof Polygon || object instanceof GeometryCollection) {
            writeType(out, Type.SHAPE);
```

### ConstantValue
Condition `object instanceof Polygon` is always `false`
in `common/src/main/java/org/apache/sedona/common/geometrySerde/GeometrySerde.java`
#### Snippet
```java
        }
        else if (object instanceof Point || object instanceof LineString
                || object instanceof Polygon || object instanceof GeometryCollection) {
            writeType(out, Type.SHAPE);
            writeGeometry(kryo, out, (Geometry) object);
```

### ConstantValue
Condition `object instanceof GeometryCollection` is always `false`
in `common/src/main/java/org/apache/sedona/common/geometrySerde/GeometrySerde.java`
#### Snippet
```java
        }
        else if (object instanceof Point || object instanceof LineString
                || object instanceof Polygon || object instanceof GeometryCollection) {
            writeType(out, Type.SHAPE);
            writeGeometry(kryo, out, (Geometry) object);
```

### ConstantValue
Condition `object instanceof Envelope` is always `false`
in `common/src/main/java/org/apache/sedona/common/geometrySerde/GeometrySerde.java`
#### Snippet
```java
            writeGeometry(kryo, out, (Geometry) object);
        }
        else if (object instanceof Envelope) {
            Envelope envelope = (Envelope) object;
            writeType(out, Type.ENVELOPE);
```

### ConstantValue
Value `geometry` is always 'null'
in `common/src/main/java/org/apache/sedona/common/Functions.java`
#### Snippet
```java

    public static boolean isClosed(Geometry geometry) {
        if (geometry instanceof Circle || geometry instanceof MultiPoint || geometry instanceof MultiPolygon || geometry instanceof Point || geometry instanceof Polygon) {
            return true;
        } else if (geometry instanceof LineString) {
```

### ConstantValue
Value `geometry` is always 'null'
in `common/src/main/java/org/apache/sedona/common/Functions.java`
#### Snippet
```java

    public static boolean isClosed(Geometry geometry) {
        if (geometry instanceof Circle || geometry instanceof MultiPoint || geometry instanceof MultiPolygon || geometry instanceof Point || geometry instanceof Polygon) {
            return true;
        } else if (geometry instanceof LineString) {
```

### ConstantValue
Value `geometry` is always 'null'
in `common/src/main/java/org/apache/sedona/common/Functions.java`
#### Snippet
```java

    public static boolean isClosed(Geometry geometry) {
        if (geometry instanceof Circle || geometry instanceof MultiPoint || geometry instanceof MultiPolygon || geometry instanceof Point || geometry instanceof Polygon) {
            return true;
        } else if (geometry instanceof LineString) {
```

### ConstantValue
Value `geometry` is always 'null'
in `common/src/main/java/org/apache/sedona/common/Functions.java`
#### Snippet
```java

    public static boolean isClosed(Geometry geometry) {
        if (geometry instanceof Circle || geometry instanceof MultiPoint || geometry instanceof MultiPolygon || geometry instanceof Point || geometry instanceof Polygon) {
            return true;
        } else if (geometry instanceof LineString) {
```

### ConstantValue
Value `geometry` is always 'null'
in `common/src/main/java/org/apache/sedona/common/Functions.java`
#### Snippet
```java
        if (geometry instanceof Circle || geometry instanceof MultiPoint || geometry instanceof MultiPolygon || geometry instanceof Point || geometry instanceof Polygon) {
            return true;
        } else if (geometry instanceof LineString) {
            return ((LineString) geometry).isClosed();
        } else if (geometry instanceof MultiLineString) {
```

### ConstantValue
Value `geometry` is always 'null'
in `common/src/main/java/org/apache/sedona/common/Functions.java`
#### Snippet
```java
        } else if (geometry instanceof LineString) {
            return ((LineString) geometry).isClosed();
        } else if (geometry instanceof MultiLineString) {
            return ((MultiLineString) geometry).isClosed();
        } else if (geometry instanceof GeometryCollection) {
```

### ConstantValue
Value `geometry` is always 'null'
in `common/src/main/java/org/apache/sedona/common/Functions.java`
#### Snippet
```java
        } else if (geometry instanceof MultiLineString) {
            return ((MultiLineString) geometry).isClosed();
        } else if (geometry instanceof GeometryCollection) {
            return false;
        }
```

### ConstantValue
Value `geometry` is always 'null'
in `common/src/main/java/org/apache/sedona/common/Functions.java`
#### Snippet
```java
        if (geometry instanceof Circle) {
            return GEOMETRY_FACTORY.createGeometryCollection(new Circle[] {(Circle) geometry});
        } else if (geometry instanceof GeometryCollection) {
            return geometry;
        } else if (geometry instanceof  LineString) {
```

### ConstantValue
Value `geometry` is always 'null'
in `common/src/main/java/org/apache/sedona/common/Functions.java`
#### Snippet
```java
        } else if (geometry instanceof GeometryCollection) {
            return geometry;
        } else if (geometry instanceof  LineString) {
            return GEOMETRY_FACTORY.createMultiLineString(new LineString[]{(LineString) geometry});
        } else if (geometry instanceof Point) {
```

### ConstantValue
Value `geometry` is always 'null'
in `common/src/main/java/org/apache/sedona/common/Functions.java`
#### Snippet
```java
        } else if (geometry instanceof  LineString) {
            return GEOMETRY_FACTORY.createMultiLineString(new LineString[]{(LineString) geometry});
        } else if (geometry instanceof Point) {
            return GEOMETRY_FACTORY.createMultiPoint(new Point[] {(Point) geometry});
        } else if (geometry instanceof Polygon) {
```

### ConstantValue
Value `geometry` is always 'null'
in `common/src/main/java/org/apache/sedona/common/Functions.java`
#### Snippet
```java
        } else if (geometry instanceof Point) {
            return GEOMETRY_FACTORY.createMultiPoint(new Point[] {(Point) geometry});
        } else if (geometry instanceof Polygon) {
            return GEOMETRY_FACTORY.createMultiPolygon(new Polygon[] {(Polygon) geometry});
        } else {
```

### ConstantValue
Value `geometry` is always 'null'
in `common/src/main/java/org/apache/sedona/common/geometrySerde/GeometrySerializer.java`
#### Snippet
```java
        if (geometry instanceof Point) {
            buffer = serializePoint((Point) geometry);
        } else if (geometry instanceof MultiPoint) {
            buffer = serializeMultiPoint((MultiPoint) geometry);
        } else if (geometry instanceof LineString) {
```

### ConstantValue
Value `geometry` is always 'null'
in `common/src/main/java/org/apache/sedona/common/geometrySerde/GeometrySerializer.java`
#### Snippet
```java
        } else if (geometry instanceof MultiPoint) {
            buffer = serializeMultiPoint((MultiPoint) geometry);
        } else if (geometry instanceof LineString) {
            buffer = serializeLineString((LineString) geometry);
        } else if (geometry instanceof MultiLineString) {
```

### ConstantValue
Value `geometry` is always 'null'
in `common/src/main/java/org/apache/sedona/common/geometrySerde/GeometrySerializer.java`
#### Snippet
```java
        } else if (geometry instanceof LineString) {
            buffer = serializeLineString((LineString) geometry);
        } else if (geometry instanceof MultiLineString) {
            buffer = serializeMultiLineString((MultiLineString) geometry);
        } else if (geometry instanceof Polygon) {
```

### ConstantValue
Value `geometry` is always 'null'
in `common/src/main/java/org/apache/sedona/common/geometrySerde/GeometrySerializer.java`
#### Snippet
```java
        } else if (geometry instanceof MultiLineString) {
            buffer = serializeMultiLineString((MultiLineString) geometry);
        } else if (geometry instanceof Polygon) {
            buffer = serializePolygon((Polygon) geometry);
        } else if (geometry instanceof MultiPolygon) {
```

### ConstantValue
Value `geometry` is always 'null'
in `common/src/main/java/org/apache/sedona/common/geometrySerde/GeometrySerializer.java`
#### Snippet
```java
        } else if (geometry instanceof Polygon) {
            buffer = serializePolygon((Polygon) geometry);
        } else if (geometry instanceof MultiPolygon) {
            buffer = serializeMultiPolygon((MultiPolygon) geometry);
        } else if (geometry instanceof GeometryCollection) {
```

### ConstantValue
Value `geometry` is always 'null'
in `common/src/main/java/org/apache/sedona/common/geometrySerde/GeometrySerializer.java`
#### Snippet
```java
        } else if (geometry instanceof MultiPolygon) {
            buffer = serializeMultiPolygon((MultiPolygon) geometry);
        } else if (geometry instanceof GeometryCollection) {
            buffer = serializeGeometryCollection((GeometryCollection) geometry);
        } else {
```

### ConstantValue
Value `spatialObject` is always 'null'
in `core/src/main/java/org/apache/sedona/core/showcase/UserSuppliedPolygonMapper.java`
#### Snippet
```java
            }
            else {
                result.add(spatialObject);
            }
        }
```

### ConstantValue
Value `spatialObject` is always 'null'
in `core/src/main/java/org/apache/sedona/core/showcase/UserSuppliedLineStringMapper.java`
#### Snippet
```java
            }
            else {
                result.add(spatialObject);
            }
        }
```

### ConstantValue
Condition `spatialObject instanceof Polygon` is always `false`
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationOperator.java`
#### Snippet
```java
                    return RasterizationUtils.FindPixelCoordinates(resolutionX, resolutionY, datasetBoundary, (Point) spatialObject, colorizeOption, reverseSpatialCoordinate).iterator();
                }
                else if (spatialObject instanceof Polygon) {
                    return RasterizationUtils.FindPixelCoordinates(resolutionX, resolutionY, datasetBoundary, (Polygon) spatialObject, reverseSpatialCoordinate).iterator();
                }
```

### ConstantValue
Condition `spatialObject instanceof LineString` is always `false`
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationOperator.java`
#### Snippet
```java
                    return RasterizationUtils.FindPixelCoordinates(resolutionX, resolutionY, datasetBoundary, (Polygon) spatialObject, reverseSpatialCoordinate).iterator();
                }
                else if (spatialObject instanceof LineString) {
                    return RasterizationUtils.FindPixelCoordinates(resolutionX, resolutionY, datasetBoundary, (LineString) spatialObject, reverseSpatialCoordinate).iterator();
                }
```

### ConstantValue
Value `this.parallelRenderImage` is always 'false'
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationOperator.java`
#### Snippet
```java
            //logger.debug("[Sedona-VizViz][Render]output count "+this.distributedRasterImage.count());
        }
        else if (this.parallelRenderImage == false) {
            // Draw full size image in parallel
            this.distributedRasterImage = this.distributedRasterColorMatrix.mapPartitionsToPair(
```

### ConstantValue
Condition `result.size() > -1` is always `true`
in `core/src/main/java/org/apache/sedona/core/showcase/Example.java`
#### Snippet
```java
        for (int i = 0; i < eachQueryLoopTimes; i++) {
            List<Point> result = KNNQuery.SpatialKnnQuery(objectRDD, kNNQueryPoint, 1000, true);
            assert result.size() > -1;
        }
    }
```

### ConstantValue
Condition `result.size() > -1` is always `true`
in `core/src/main/java/org/apache/sedona/core/showcase/Example.java`
#### Snippet
```java
        for (int i = 0; i < eachQueryLoopTimes; i++) {
            List<Point> result = KNNQuery.SpatialKnnQuery(objectRDD, kNNQueryPoint, 1000, false);
            assert result.size() > -1;
        }
    }
```

### ConstantValue
Value `spatialObject` is always 'null'
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
                            }
                        }
                        else if (spatialObject instanceof Point) {
                            result.add((Point) spatialObject);
                        }
```

### ConstantValue
Value `spatialObject` is always 'null'
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
                            }
                        }
                        else if (spatialObject instanceof LineString) {
                            result.add((LineString) spatialObject);
                        }
```

### ConstantValue
Value `spatialObject` is always 'null'
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
                    }
                }
                else if (spatialObject instanceof Polygon) {
                    result.add((Polygon) spatialObject);
                }
```

### ConstantValue
Condition `shell != null` is always `true`
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/shp/PolygonParser.java`
#### Snippet
```java
            }
            else {
                if (shell != null) {
                    Polygon polygon = geometryFactory.createPolygon(shell, GeometryFactory.toLinearRingArray(holes));
                    polygons.add(polygon);
```

### ConstantValue
Value `geometry` is always 'null'
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/shp/ShapeSerde.java`
#### Snippet
```java
        }

        if (geometry instanceof MultiPoint) {
            return serialize((MultiPoint) geometry);
        }
```

### ConstantValue
Value `geometry` is always 'null'
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/shp/ShapeSerde.java`
#### Snippet
```java
        }

        if (geometry instanceof LineString) {
            return serialize((LineString) geometry);
        }
```

### ConstantValue
Value `geometry` is always 'null'
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/shp/ShapeSerde.java`
#### Snippet
```java
        }

        if (geometry instanceof MultiLineString) {
            return serialize((MultiLineString) geometry);
        }
```

### ConstantValue
Value `geometry` is always 'null'
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/shp/ShapeSerde.java`
#### Snippet
```java
        }

        if (geometry instanceof Polygon) {
            return serialize((Polygon) geometry);
        }
```

### ConstantValue
Value `geometry` is always 'null'
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/shp/ShapeSerde.java`
#### Snippet
```java
        }

        if (geometry instanceof MultiPolygon) {
            return serialize((MultiPolygon) geometry);
        }
```

### ConstantValue
Value `spatialObject` is always 'null'
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileRDD.java`
#### Snippet
```java
                    }
                }
                else if (spatialObject instanceof Point) {
                    result.add((Point) spatialObject);
                }
```

### ConstantValue
Value `spatialObject` is always 'null'
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileRDD.java`
#### Snippet
```java
                    }
                }
                else if (spatialObject instanceof LineString) {
                    result.add((LineString) spatialObject);
                }
```

### ConstantValue
Value `spatialObject` is always 'null'
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileRDD.java`
#### Snippet
```java
                    }
                }
                else if (spatialObject instanceof Polygon) {
                    result.add((Polygon) spatialObject);
                }
```

### ConstantValue
Condition `point != null` is always `true`
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/KDB.java`
#### Snippet
```java
        for (KDB leaf : matchedPartitions) {
            // For points, make sure to return only one partition
            if (point != null && !(new HalfOpenRectangle(leaf.getExtent())).contains(point)) {
                continue;
            }
```

### ConstantValue
Condition `point != null` is always `true`
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/KDB.java`
#### Snippet
```java
        for (KDB leaf : matchedPartitions) {
            // For points, make sure to return only one partition
            if (point != null && !(new HalfOpenRectangle(leaf.getExtent())).contains(point)) {
                continue;
            }
```

### ConstantValue
Condition `point != null` is always `true`
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/quadtree/StandardQuadTree.java`
#### Snippet
```java
        for (QuadRectangle rectangle : matchedPartitions) {
            // For points, make sure to return only one partition
            if (point != null && !(new HalfOpenRectangle(rectangle.getEnvelope())).contains(point)) {
                continue;
            }
```

### ConstantValue
Condition `point != null` is always `true`
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/quadtree/StandardQuadTree.java`
#### Snippet
```java
        for (QuadRectangle rectangle : matchedPartitions) {
            // For points, make sure to return only one partition
            if (point != null && !(new HalfOpenRectangle(rectangle.getEnvelope())).contains(point)) {
                continue;
            }
```

## RuleId[id=MathRoundingWithIntArgument]
### MathRoundingWithIntArgument
`round()` with argument of type 'int'
in `viz/src/main/java/org/apache/sedona/viz/core/ImageStitcher.java`
#### Snippet
```java
            }
            Tuple2<Integer, Integer> partitionCoordinate = RasterizationUtils.Decode1DTo2DId(partitionOnX, partitionOnY, i);
            int partitionMinX = partitionCoordinate._1 * Math.round(resolutionX / partitionOnX);
            int partitionMinY = partitionCoordinate._2 * Math.round(resolutionY / partitionOnY);
            //if(partitionMinX!=0){partitionMinX--;}
```

### MathRoundingWithIntArgument
`round()` with argument of type 'int'
in `viz/src/main/java/org/apache/sedona/viz/core/ImageStitcher.java`
#### Snippet
```java
            Tuple2<Integer, Integer> partitionCoordinate = RasterizationUtils.Decode1DTo2DId(partitionOnX, partitionOnY, i);
            int partitionMinX = partitionCoordinate._1 * Math.round(resolutionX / partitionOnX);
            int partitionMinY = partitionCoordinate._2 * Math.round(resolutionY / partitionOnY);
            //if(partitionMinX!=0){partitionMinX--;}
            //if(partitionMinY!=0){partitionMinY--;}
```

### MathRoundingWithIntArgument
`round()` with argument of type 'int'
in `viz/src/main/java/org/apache/sedona/viz/core/ImageStitcher.java`
#### Snippet
```java
            }
            Tuple2<Integer, Integer> partitionCoordinate = RasterizationUtils.Decode1DTo2DId(partitionOnX, partitionOnY, i);
            int partitionMinX = partitionCoordinate._1 * Math.round(resolutionX / partitionOnX);
            int partitionMinY = partitionCoordinate._2 * Math.round(resolutionY / partitionOnY);
            //if(partitionMinX!=0){partitionMinX--;}
```

### MathRoundingWithIntArgument
`round()` with argument of type 'int'
in `viz/src/main/java/org/apache/sedona/viz/core/ImageStitcher.java`
#### Snippet
```java
            Tuple2<Integer, Integer> partitionCoordinate = RasterizationUtils.Decode1DTo2DId(partitionOnX, partitionOnY, i);
            int partitionMinX = partitionCoordinate._1 * Math.round(resolutionX / partitionOnX);
            int partitionMinY = partitionCoordinate._2 * Math.round(resolutionY / partitionOnY);
            //if(partitionMinX!=0){partitionMinX--;}
            //if(partitionMinY!=0){partitionMinY--;}
```

### MathRoundingWithIntArgument
`round()` with argument of type 'int'
in `viz/src/main/java/org/apache/sedona/viz/core/ImageStitcher.java`
#### Snippet
```java
            }
            Tuple2<Integer, Integer> partitionCoordinate = RasterizationUtils.Decode1DTo2DId(partitionOnX, partitionOnY, i);
            int partitionMinX = partitionCoordinate._1 * Math.round(resolutionX / partitionOnX);
            int partitionMinY = partitionCoordinate._2 * Math.round(resolutionY / partitionOnY);
            //if(partitionMinX!=0){partitionMinX--;}
```

### MathRoundingWithIntArgument
`round()` with argument of type 'int'
in `viz/src/main/java/org/apache/sedona/viz/core/ImageStitcher.java`
#### Snippet
```java
            Tuple2<Integer, Integer> partitionCoordinate = RasterizationUtils.Decode1DTo2DId(partitionOnX, partitionOnY, i);
            int partitionMinX = partitionCoordinate._1 * Math.round(resolutionX / partitionOnX);
            int partitionMinY = partitionCoordinate._2 * Math.round(resolutionY / partitionOnY);
            //if(partitionMinX!=0){partitionMinX--;}
            //if(partitionMinY!=0){partitionMinY--;}
```

### MathRoundingWithIntArgument
`floor()` with argument of type 'int'
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/KDB.java`
#### Snippet
```java
        final Envelope[] splits;
        final Splitter splitter;
        Envelope middleItem = items.get((int) Math.floor(items.size() / 2));
        if (splitX) {
            double x = middleItem.getMinX();
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/boundary/BoundBox.java`
#### Snippet
```java
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < bounds.length; ++i) {
            strBuilder.append(bounds[i] + ", ");
        }
        return strBuilder.toString();
```

## RuleId[id=SuspiciousNameCombination]
### SuspiciousNameCombination
'y' should probably not be assigned to 'x'
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/HilbertPartitioning.java`
#### Snippet
```java
                //Swap x and y
                int t = x;
                x = y;
                y = t;
            }
```

## RuleId[id=RedundantOperationOnEmptyContainer]
### RedundantOperationOnEmptyContainer
Collection `result` is always empty
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationOperator.java`
#### Snippet
```java
                            if (pixelColor == null) {
                                // No pixels in this partition. Skip this subimage
                                return result.iterator();
                            }
                            logger.info("[Sedona-VizViz][Render]add a image partition into result set " + pixelColor._1().getCurrentPartitionId());
```

### RedundantOperationOnEmptyContainer
Collection `result` is always empty
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationOperator.java`
#### Snippet
```java
                            if (pixelColor == null) {
                                // No pixels in this partition. Skip this subimage
                                return result.iterator();
                            }
                            result.add(new Tuple2<Integer, ImageSerializableWrapper>(1, new ImageSerializableWrapper(imagePartition)));
```

### RedundantOperationOnEmptyContainer
Collection `result` is always empty
in `core/src/main/java/org/apache/sedona/core/joinJudgement/LeftIndexLookupJudgement.java`
#### Snippet
```java

        if (!indexIterator.hasNext() || !streamShapes.hasNext()) {
            return result.iterator();
        }

```

### RedundantOperationOnEmptyContainer
Collection `result` is always empty
in `core/src/main/java/org/apache/sedona/core/joinJudgement/RightIndexLookupJudgement.java`
#### Snippet
```java

        if (!indexIterator.hasNext() || !streamShapes.hasNext()) {
            return result.iterator();
        }

```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `common/src/main/java/org/locationtech/jts/index/strtree/IndexSerde.java`
#### Snippet
```java
        if (isLeaf) {
            for (int i = 0; i < childrenSize; ++i) {
                children.add(readItemBoundable(kryo, input));
            }
        }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `common/src/main/java/org/locationtech/jts/index/strtree/IndexSerde.java`
#### Snippet
```java
        else {
            for (int i = 0; i < childrenSize; ++i) {
                children.add(readSTRtreeNode(kryo, input));
            }
        }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `common/src/main/java/org/locationtech/jts/index/strtree/IndexSerde.java`
#### Snippet
```java
                int itemSize = input.readInt();
                for (int i = 0; i < itemSize; ++i) {
                    itemBoundables.add(readItemBoundable(kryo, input));
                }
                STRtree index = new STRtree(nodeCapacity, itemBoundables);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `common/src/main/java/org/locationtech/jts/index/quadtree/IndexSerde.java`
#### Snippet
```java
        List items = new ArrayList();
        for (int i = 0; i < itemSize; ++i) {
            items.add(geometrySerde.read(kryo, input, Geometry.class));
        }
        index.getRoot().items = items;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `common/src/main/java/org/locationtech/jts/index/quadtree/IndexSerde.java`
#### Snippet
```java
        List items = new ArrayList();
        for (int i = 0; i < itemSize; ++i) {
            items.add(geometrySerde.read(kryo, input, Geometry.class));
        }
        node.items = items;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `common/src/main/java/org/apache/sedona/common/geometrySerde/GeometrySerde.java`
#### Snippet
```java
        if (input.readBoolean()) {
            Registration clazz = kryo.readClass(input);
            userData = kryo.readObject(input, clazz.getType());
        }
        return userData;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `common/src/main/java/org/apache/sedona/common/Functions.java`
#### Snippet
```java
    public static Geometry addPoint(Geometry linestring, Geometry point, int position) {
        if (linestring instanceof LineString && point instanceof Point) {
            List<Coordinate> coordinates = new ArrayList<>(Arrays.asList(linestring.getCoordinates()));
            if (-1 <= position && position <= coordinates.size()) {
                if (position < 0) {
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `common/src/main/java/org/apache/sedona/common/Functions.java`
#### Snippet
```java
    public static Geometry addPoint(Geometry linestring, Geometry point, int position) {
        if (linestring instanceof LineString && point instanceof Point) {
            List<Coordinate> coordinates = new ArrayList<>(Arrays.asList(linestring.getCoordinates()));
            if (-1 <= position && position <= coordinates.size()) {
                if (position < 0) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `common/src/main/java/org/apache/sedona/common/Functions.java`
#### Snippet
```java
    public static Geometry removePoint(Geometry linestring, int position) {
        if (linestring instanceof LineString) {
            List<Coordinate> coordinates = new ArrayList<>(Arrays.asList(linestring.getCoordinates()));
            if (2 < coordinates.size() && position < coordinates.size()) {
                if (position == -1) {
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `common/src/main/java/org/apache/sedona/common/Functions.java`
#### Snippet
```java
    public static Geometry removePoint(Geometry linestring, int position) {
        if (linestring instanceof LineString) {
            List<Coordinate> coordinates = new ArrayList<>(Arrays.asList(linestring.getCoordinates()));
            if (2 < coordinates.size() && position < coordinates.size()) {
                if (position == -1) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `common/src/main/java/org/apache/sedona/common/Functions.java`
#### Snippet
```java
    public static Geometry setPoint(Geometry linestring, int position, Geometry point) {
        if (linestring instanceof LineString) {
            List<Coordinate> coordinates = new ArrayList<>(Arrays.asList(linestring.getCoordinates()));
            if (-coordinates.size() <= position && position < coordinates.size()) {
                if (position < 0) {
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `common/src/main/java/org/apache/sedona/common/Functions.java`
#### Snippet
```java
    public static Geometry setPoint(Geometry linestring, int position, Geometry point) {
        if (linestring instanceof LineString) {
            List<Coordinate> coordinates = new ArrayList<>(Arrays.asList(linestring.getCoordinates()));
            if (-coordinates.size() <= position && position < coordinates.size()) {
                if (position < 0) {
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `core/src/main/java/org/apache/sedona/core/showcase/UserSuppliedPolygonMapper.java`
#### Snippet
```java
                for (int i = 0; i < multiSpatialObjects.getNumGeometries(); i++) {
                    spatialObject = multiSpatialObjects.getGeometryN(i);
                    result.add(spatialObject);
                }
            }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `core/src/main/java/org/apache/sedona/core/showcase/UserSuppliedPolygonMapper.java`
#### Snippet
```java
            }
            else {
                result.add(spatialObject);
            }
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Iterator' to 'java.util.Iterator'. Reason: 'result' has raw type, so result of iterator is erased
in `core/src/main/java/org/apache/sedona/core/showcase/UserSuppliedPolygonMapper.java`
#### Snippet
```java
            }
        }
        return result.iterator();
    }
}
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `core/src/main/java/org/apache/sedona/core/showcase/UserSuppliedLineStringMapper.java`
#### Snippet
```java
                for (int i = 0; i < multiSpatialObjects.getNumGeometries(); i++) {
                    spatialObject = multiSpatialObjects.getGeometryN(i);
                    result.add(spatialObject);
                }
            }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `core/src/main/java/org/apache/sedona/core/showcase/UserSuppliedLineStringMapper.java`
#### Snippet
```java
            }
            else {
                result.add(spatialObject);
            }
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Iterator' to 'java.util.Iterator'. Reason: 'result' has raw type, so result of iterator is erased
in `core/src/main/java/org/apache/sedona/core/showcase/UserSuppliedLineStringMapper.java`
#### Snippet
```java
            }
        }
        return result.iterator();
    }
}
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `core/src/main/java/org/apache/sedona/core/showcase/UserSuppliedRectangleMapper.java`
#### Snippet
```java
                for (int i = 0; i < multiSpatialObjects.getNumGeometries(); i++) {
                    spatialObject = multiSpatialObjects.getGeometryN(i);
                    result.add(spatialObject.getEnvelopeInternal());
                }
            }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `core/src/main/java/org/apache/sedona/core/showcase/UserSuppliedRectangleMapper.java`
#### Snippet
```java
            }
            else {
                result.add(spatialObject.getEnvelopeInternal());
            }
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Iterator' to 'java.util.Iterator'. Reason: 'result' has raw type, so result of iterator is erased
in `core/src/main/java/org/apache/sedona/core/showcase/UserSuppliedRectangleMapper.java`
#### Snippet
```java
            }
        }
        return result.iterator();
    }
}
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.sedona.core.spatialRDD.SpatialRDD' to 'org.apache.sedona.core.spatialRDD.SpatialRDD'
in `core/src/main/java/org/apache/sedona/core/formatMapper/RddReader.java`
#### Snippet
```java
        spatialRDD.rawSpatialRDD = rawTextRDD.mapPartitions(formatMapper);
        spatialRDD.fieldNames = formatMapper.readPropertyNames(rawTextRDD.take(1).get(0).toString());
        return spatialRDD;
    }
}
```

### UNCHECKED_WARNING
Unchecked call to 'addGeometry(Geometry, List)' as a member of raw type 'org.apache.sedona.common.utils.FormatUtils'
in `core/src/main/java/org/apache/sedona/core/formatMapper/FormatMapper.java`
#### Snippet
```java
        while (stringIterator.hasNext()) {
            String line = stringIterator.next();
            addGeometry(readGeometry(line), result);
        }
        return result.iterator();
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.sedona.core.spatialRDD.SpatialRDD' to 'org.apache.sedona.core.spatialRDD.SpatialRDD'
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
    public static SpatialRDD<Geometry> readToGeometryRDD(JavaSparkContext sc, String inputPath, final GeometryFactory geometryFactory)
    {
        SpatialRDD<Geometry> spatialRDD = new SpatialRDD();
        spatialRDD.rawSpatialRDD = readShapefile(sc, inputPath, geometryFactory);
        try {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
                })
        );
        pointRDD.fieldNames = geometryRDD.fieldNames;
        return pointRDD;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
            }
        }));
        polygonRDD.fieldNames = geometryRDD.fieldNames;
        return polygonRDD;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
                })
        );
        lineStringRDD.fieldNames = geometryRDD.fieldNames;
        return lineStringRDD;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.sedona.core.spatialPartitioning.quadtree.StandardQuadTree' to 'org.apache.sedona.core.spatialPartitioning.quadtree.StandardQuadTree'
in `core/src/main/java/org/apache/sedona/core/spatialRDD/SpatialRDD.java`
#### Snippet
```java
                        numPartitions, minLevel);
                StandardQuadTree tree = quadtreePartitioning.getPartitionTree();
                partitioner = new QuadTreePartitioner(tree);
                break;
            }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.sedona.core.spatialPartitioning.quadtree.StandardQuadTree' to 'org.apache.sedona.core.spatialPartitioning.quadtree.StandardQuadTree'
in `core/src/main/java/org/apache/sedona/core/spatialRDD/SpatialRDD.java`
#### Snippet
```java
                QuadtreePartitioning quadtreePartitioning = new QuadtreePartitioning(samples, paddedBoundary, numPartitions);
                StandardQuadTree tree = quadtreePartitioning.getPartitionTree();
                partitioner = new QuadTreePartitioner(tree);
                break;
            }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.ArrayList'
in `core/src/main/java/org/apache/sedona/core/spatialRDD/SpatialRDD.java`
#### Snippet
```java
    {
        this.rawSpatialRDD.mapPartitions((FlatMapFunction<Iterator<T>, String>) iterator -> {
            ArrayList<String> result = new ArrayList();
            GeoJSONWriter writer = new GeoJSONWriter();
            while (iterator.hasNext()) {
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.HashSet'
in `core/src/main/java/org/apache/sedona/core/spatialRDD/SpatialRDD.java`
#### Snippet
```java
        HashSet resultWithoutDuplicates = new HashSet();
        for (int i = 0; i < collectedResult.size(); i++) {
            resultWithoutDuplicates.add(collectedResult.get(i));
        }
        return resultWithoutDuplicates.size();
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.sedona.core.spatialPartitioning.quadtree.StandardQuadTree' to 'org.apache.sedona.core.spatialPartitioning.quadtree.StandardQuadTree'
in `core/src/main/java/org/apache/sedona/core/spatialRDD/SpatialRDD.java`
#### Snippet
```java
            throws Exception
    {
        this.partitioner = new QuadTreePartitioner(partitionTree);
        this.spatialPartitionedRDD = partition(partitioner);
        return true;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.HashSet'
in `core/src/main/java/org/apache/sedona/core/spatialRDD/SpatialRDD.java`
#### Snippet
```java
        HashSet resultWithoutDuplicates = new HashSet();
        for (int i = 0; i < collectedResult.size(); i++) {
            resultWithoutDuplicates.add(collectedResult.get(i));
        }
        return resultWithoutDuplicates.size();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `core/src/main/java/org/apache/sedona/core/knnJudgement/KnnJudgementUsingIndex.java`
#### Snippet
```java
            throw new Exception("[KnnJudgementUsingIndex][Call] QuadTree index doesn't support KNN search.");
        }
        List<T> result = new ArrayList();
        for (int i = 0; i < localK.length; i++) {
            result.add((T) localK[i]);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `core/src/main/java/org/apache/sedona/core/knnJudgement/KnnJudgementUsingIndex.java`
#### Snippet
```java
        List<T> result = new ArrayList();
        for (int i = 0; i < localK.length; i++) {
            result.add((T) localK[i]);
        }
        return result.iterator();
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.sedona.core.knnJudgement.GeometryDistanceComparator' to 'java.util.Comparator'
in `core/src/main/java/org/apache/sedona/core/knnJudgement/KnnJudgement.java`
#### Snippet
```java
            throws Exception
    {
        PriorityQueue<T> pq = new PriorityQueue<T>(k, new GeometryDistanceComparator(queryCenter, false));
        while (input.hasNext()) {
            if (pq.size() < k) {
```

### UNCHECKED_WARNING
Unchecked call to 'GeometryDistanceComparator(T, boolean)' as a member of raw type 'org.apache.sedona.core.knnJudgement.GeometryDistanceComparator'
in `core/src/main/java/org/apache/sedona/core/knnJudgement/KnnJudgement.java`
#### Snippet
```java
            throws Exception
    {
        PriorityQueue<T> pq = new PriorityQueue<T>(k, new GeometryDistanceComparator(queryCenter, false));
        while (input.hasNext()) {
            if (pq.size() < k) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.collections.iterators.FilterIterator' to 'java.util.Iterator\>'
in `core/src/main/java/org/apache/sedona/core/joinJudgement/DuplicatesFilter.java`
#### Snippet
```java
        if (partitionId < partitionExtents.size()) {
            HalfOpenRectangle extent = new HalfOpenRectangle(partitionExtents.get(partitionId));
            return new FilterIterator(geometryPair, p -> !GeomUtils.isDuplicate(((Pair<U, T>) p).getLeft(), ((Pair<U, T>) p).getRight(), extent));
        }
        else {
```

### UNCHECKED_WARNING
Unchecked call to 'JudgementBase(U, boolean, boolean)' as a member of raw type 'org.apache.sedona.core.rangeJudgement.JudgementBase'
in `core/src/main/java/org/apache/sedona/core/rangeJudgement/RangeFilter.java`
#### Snippet
```java
    public RangeFilter(U queryWindow, boolean considerBoundaryIntersection, boolean leftCoveredByRight)
    {
        super(queryWindow, considerBoundaryIntersection, leftCoveredByRight);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'JudgementBase(U, SpatialPredicate)' as a member of raw type 'org.apache.sedona.core.rangeJudgement.JudgementBase'
in `core/src/main/java/org/apache/sedona/core/rangeJudgement/RangeFilter.java`
#### Snippet
```java
    public RangeFilter(U queryWindow, SpatialPredicate spatialPredicate)
    {
        super(queryWindow, spatialPredicate);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `core/src/main/java/org/apache/sedona/core/spatialRddTool/IndexBuilder.java`
#### Snippet
```java
            spatialIndex.insert(spatialObject.getEnvelopeInternal(), spatialObject);
        }
        Set<SpatialIndex> result = new HashSet();
        spatialIndex.query(new Envelope(0.0, 0.0, 0.0, 0.0));
        result.add(spatialIndex);
```

### UNCHECKED_WARNING
Unchecked call to 'KnnJudgementUsingIndex(U, int)' as a member of raw type 'org.apache.sedona.core.knnJudgement.KnnJudgementUsingIndex'
in `core/src/main/java/org/apache/sedona/core/spatialOperator/KNNQuery.java`
#### Snippet
```java
                throw new NullPointerException("Need to invoke buildIndex() first, indexedRDDNoId is null");
            }
            JavaRDD<T> tmp = spatialRDD.indexedRawRDD.mapPartitions(new KnnJudgementUsingIndex(queryCenter, k));
            List<T> result = tmp.takeOrdered(k, new GeometryDistanceComparator(queryCenter, true));
            // Take the top k
```

### UNCHECKED_WARNING
Unchecked call to 'GeometryDistanceComparator(T, boolean)' as a member of raw type 'org.apache.sedona.core.knnJudgement.GeometryDistanceComparator'
in `core/src/main/java/org/apache/sedona/core/spatialOperator/KNNQuery.java`
#### Snippet
```java
            }
            JavaRDD<T> tmp = spatialRDD.indexedRawRDD.mapPartitions(new KnnJudgementUsingIndex(queryCenter, k));
            List<T> result = tmp.takeOrdered(k, new GeometryDistanceComparator(queryCenter, true));
            // Take the top k
            return result;
```

### UNCHECKED_WARNING
Unchecked call to 'KnnJudgement(U, int)' as a member of raw type 'org.apache.sedona.core.knnJudgement.KnnJudgement'
in `core/src/main/java/org/apache/sedona/core/spatialOperator/KNNQuery.java`
#### Snippet
```java
        }
        else {
            JavaRDD<T> tmp = spatialRDD.getRawSpatialRDD().mapPartitions(new KnnJudgement(queryCenter, k));
            List<T> result = tmp.takeOrdered(k, new GeometryDistanceComparator(queryCenter, true));
            // Take the top k
```

### UNCHECKED_WARNING
Unchecked call to 'GeometryDistanceComparator(T, boolean)' as a member of raw type 'org.apache.sedona.core.knnJudgement.GeometryDistanceComparator'
in `core/src/main/java/org/apache/sedona/core/spatialOperator/KNNQuery.java`
#### Snippet
```java
        else {
            JavaRDD<T> tmp = spatialRDD.getRawSpatialRDD().mapPartitions(new KnnJudgement(queryCenter, k));
            List<T> result = tmp.takeOrdered(k, new GeometryDistanceComparator(queryCenter, true));
            // Take the top k
            return result;
```

### UNCHECKED_WARNING
Unchecked call to 'JudgementBase(U, SpatialPredicate)' as a member of raw type 'org.apache.sedona.core.rangeJudgement.JudgementBase'
in `core/src/main/java/org/apache/sedona/core/rangeJudgement/RangeFilterUsingIndex.java`
#### Snippet
```java
    public RangeFilterUsingIndex(U queryWindow, SpatialPredicate spatialPredicate)
    {
        super(queryWindow, spatialPredicate);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'JudgementBase(U, boolean, boolean)' as a member of raw type 'org.apache.sedona.core.rangeJudgement.JudgementBase'
in `core/src/main/java/org/apache/sedona/core/rangeJudgement/RangeFilterUsingIndex.java`
#### Snippet
```java
    public RangeFilterUsingIndex(U queryWindow, boolean considerBoundaryIntersection, boolean leftCoveredByRight)
    {
        super(queryWindow, considerBoundaryIntersection, leftCoveredByRight);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'RangeFilterUsingIndex(U, SpatialPredicate)' as a member of raw type 'org.apache.sedona.core.rangeJudgement.RangeFilterUsingIndex'
in `core/src/main/java/org/apache/sedona/core/spatialOperator/RangeQuery.java`
#### Snippet
```java
                throw new Exception("[RangeQuery][SpatialRangeQuery] Index doesn't exist. Please build index on rawSpatialRDD.");
            }
            return spatialRDD.indexedRawRDD.mapPartitions(new RangeFilterUsingIndex(queryGeometry, spatialPredicate));
        }
        else {
```

### UNCHECKED_WARNING
Unchecked call to 'RangeFilter(U, SpatialPredicate)' as a member of raw type 'org.apache.sedona.core.rangeJudgement.RangeFilter'
in `core/src/main/java/org/apache/sedona/core/spatialOperator/RangeQuery.java`
#### Snippet
```java
        }
        else {
            return spatialRDD.getRawSpatialRDD().filter(new RangeFilter(queryGeometry, spatialPredicate));
        }
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/RtreePartitioning.java`
#### Snippet
```java
            strtree.insert(sample, sample);
        }
        List<Envelope> envelopes = findLeafBounds(strtree);
        for (Envelope envelope : envelopes) {
            grids.add(envelope);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/RtreePartitioning.java`
#### Snippet
```java
        if(flagLeafnode)
        {
            boundaries.add(node.getBounds());
        }
        else
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.sedona.core.spatialPartitioning.quadtree.StandardQuadTree' to 'org.apache.sedona.core.spatialPartitioning.quadtree.StandardQuadTree'
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/QuadtreePartitioning.java`
#### Snippet
```java
        int maxLevel = partitions;
        int maxItemsPerNode = samples.size() / partitions;
        partitionTree = new StandardQuadTree(new QuadRectangle(boundary), 0,
                maxItemsPerNode, maxLevel);
        if (minTreeLevel > 0) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set\>'
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/EqualPartitioning.java`
#### Snippet
```java
        final Envelope envelope = geometry.getEnvelopeInternal();

        Set<Tuple2<Integer, Geometry>> result = new HashSet();
        boolean containFlag = false;
        for (int i = 0; i < grids.size(); i++) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/EqualPartitioning.java`
#### Snippet
```java
        final Envelope envelope = geometry.getEnvelopeInternal();

        Set<Integer> result = new HashSet();
        boolean containFlag = false;
        for (int i = 0; i < grids.size(); i++) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.sedona.core.spatialPartitioning.quadtree.StandardQuadTree\[\]' to 'org.apache.sedona.core.spatialPartitioning.quadtree.StandardQuadTree\[\]'
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/quadtree/StandardQuadTree.java`
#### Snippet
```java
    {

        regions = new StandardQuadTree[4];

        double newWidth = zone.width / 2;
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `StreamExecutionEnvironment`
in `flink/src/main/java/org/apache/sedona/flink/SedonaFlinkRegistrator.java`
#### Snippet
```java

    /**
     * @deprecated use {@link SedonaContext#create(StreamExecutionEnvironment, StreamTableEnvironment)}
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `StreamTableEnvironment`
in `flink/src/main/java/org/apache/sedona/flink/SedonaFlinkRegistrator.java`
#### Snippet
```java

    /**
     * @deprecated use {@link SedonaContext#create(StreamExecutionEnvironment, StreamTableEnvironment)}
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `StreamExecutionEnvironment`
in `flink/src/main/java/org/apache/sedona/flink/SedonaFlinkRegistrator.java`
#### Snippet
```java
    }
    /**
     * @deprecated use {@link SedonaContext#create(StreamExecutionEnvironment, StreamTableEnvironment)}
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `StreamTableEnvironment`
in `flink/src/main/java/org/apache/sedona/flink/SedonaFlinkRegistrator.java`
#### Snippet
```java
    }
    /**
     * @deprecated use {@link SedonaContext#create(StreamExecutionEnvironment, StreamTableEnvironment)}
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `splitLines`
in `common/src/main/java/org/apache/sedona/common/utils/GeometrySplitter.java`
#### Snippet
```java
     * can also be used as an input but it must be homogeneous.
     * For lineal geometry refer to the
     * {@link splitLines(Geometry, Geometry) splitLines} method for
     * restrictions on the blade. Refer to
     * {@link splitPolygons(Geometry, Geometry) splitPolygons} for
```

### JavadocReference
Cannot resolve symbol `Geometry`
in `common/src/main/java/org/apache/sedona/common/utils/GeometrySplitter.java`
#### Snippet
```java
     * can also be used as an input but it must be homogeneous.
     * For lineal geometry refer to the
     * {@link splitLines(Geometry, Geometry) splitLines} method for
     * restrictions on the blade. Refer to
     * {@link splitPolygons(Geometry, Geometry) splitPolygons} for
```

### JavadocReference
Cannot resolve symbol `Geometry`
in `common/src/main/java/org/apache/sedona/common/utils/GeometrySplitter.java`
#### Snippet
```java
     * can also be used as an input but it must be homogeneous.
     * For lineal geometry refer to the
     * {@link splitLines(Geometry, Geometry) splitLines} method for
     * restrictions on the blade. Refer to
     * {@link splitPolygons(Geometry, Geometry) splitPolygons} for
```

### JavadocReference
Cannot resolve symbol `splitPolygons`
in `common/src/main/java/org/apache/sedona/common/utils/GeometrySplitter.java`
#### Snippet
```java
     * {@link splitLines(Geometry, Geometry) splitLines} method for
     * restrictions on the blade. Refer to
     * {@link splitPolygons(Geometry, Geometry) splitPolygons} for
     * restrictions on the blade for polygonal input geometry.
     * <p>
```

### JavadocReference
Cannot resolve symbol `Geometry`
in `common/src/main/java/org/apache/sedona/common/utils/GeometrySplitter.java`
#### Snippet
```java
     * {@link splitLines(Geometry, Geometry) splitLines} method for
     * restrictions on the blade. Refer to
     * {@link splitPolygons(Geometry, Geometry) splitPolygons} for
     * restrictions on the blade for polygonal input geometry.
     * <p>
```

### JavadocReference
Cannot resolve symbol `Geometry`
in `common/src/main/java/org/apache/sedona/common/utils/GeometrySplitter.java`
#### Snippet
```java
     * {@link splitLines(Geometry, Geometry) splitLines} method for
     * restrictions on the blade. Refer to
     * {@link splitPolygons(Geometry, Geometry) splitPolygons} for
     * restrictions on the blade for polygonal input geometry.
     * <p>
```

### JavadocReference
Symbol `id` is inaccessible from here
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/shp/ShapeSerde.java`
#### Snippet
```java
 * Compatible with the family of {@link ShapeReader} classes.
 * <p>
 * First byte contains {@link ShapeType#id}. The rest is type specific.
 * Point: 8 bytes for X coordinate, followed by 8 bytes for Y coordinate.
 * LineString is serialized as MultiLineString.
```

### JavadocReference
Cannot resolve symbol `org.apache.sedona.core.joinJudgement.JoinConditionMatcher`
in `core/src/main/java/org/apache/sedona/core/spatialOperator/SpatialPredicateEvaluators.java`
#### Snippet
```java
    /**
     * SpatialPredicateEvaluator for evaluating spatial predicates, it also works as a trait which will
     * be mixed into {@link org.apache.sedona.core.joinJudgement.JoinConditionMatcher}.
     */
    public interface SpatialPredicateEvaluator extends Serializable {
```

## RuleId[id=ManualArrayToCollectionCopy]
### ManualArrayToCollectionCopy
Manual array to collection copy
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/HilbertPartitioning.java`
#### Snippet
```java
        }

        for (Envelope envelope : gridWithoutID) {
            this.grids.add(envelope);
        }
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Switch label `0` is unreachable
in `common/src/main/java/org/apache/sedona/common/utils/GeometrySplitter.java`
#### Snippet
```java

                switch (dimension) {
                    case 0:
                        result = (GeometryCollection)geometryFactory.createMultiPoint(validGeometries.toArray(new Point[0]));
                        break;
```

### DataFlowIssue
Switch label `1` is unreachable
in `common/src/main/java/org/apache/sedona/common/utils/GeometrySplitter.java`
#### Snippet
```java
                        result = (GeometryCollection)geometryFactory.createMultiPoint(validGeometries.toArray(new Point[0]));
                        break;
                    case 1:
                        result = (GeometryCollection)geometryFactory.createMultiLineString(validGeometries.toArray(new LineString[0]));
                        break;
```

### DataFlowIssue
Switch label `2` is unreachable
in `common/src/main/java/org/apache/sedona/common/utils/GeometrySplitter.java`
#### Snippet
```java
                        result = (GeometryCollection)geometryFactory.createMultiLineString(validGeometries.toArray(new LineString[0]));
                        break;
                    case 2:
                        result = (GeometryCollection)geometryFactory.createMultiPolygon(validGeometries.toArray(new Polygon[0]));
                        break;
```

### DataFlowIssue
Method invocation `getEnvelopeInternal` will produce `NullPointerException`
in `common/src/main/java/org/apache/sedona/common/utils/GeomUtils.java`
#### Snippet
```java
        // that contains the reference point do all the work.
        Envelope intersection =
                left.getEnvelopeInternal().intersection(right.getEnvelopeInternal());
        if (!intersection.isNull()) {
            final Point referencePoint =
```

### DataFlowIssue
Method invocation `getEnvelopeInternal` will produce `NullPointerException`
in `common/src/main/java/org/apache/sedona/common/utils/GeomUtils.java`
#### Snippet
```java
        // that contains the reference point do all the work.
        Envelope intersection =
                left.getEnvelopeInternal().intersection(right.getEnvelopeInternal());
        if (!intersection.isNull()) {
            final Point referencePoint =
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `common/src/main/java/org/apache/sedona/common/utils/GeomUtils.java`
#### Snippet
```java
        if (geometry instanceof Lineal) {
            return true;
        } else if (geometryIsHomogeneous(geometry) && geometry.getDimension() == 1) {
            return true;
        }
```

### DataFlowIssue
Method invocation `getClass` will produce `NullPointerException`
in `common/src/main/java/org/apache/sedona/common/utils/GeomUtils.java`
#### Snippet
```java
        ArrayList<Geometry> leafs = new ArrayList<>();
        if (!(geom instanceof GeometryCollection)) {
            if (geomType.isAssignableFrom(geom.getClass())) {
                leafs.add(geom);
            }
```

### DataFlowIssue
Method invocation `getClass` will produce `NullPointerException`
in `common/src/main/java/org/apache/sedona/common/utils/GeomUtils.java`
#### Snippet
```java
                    parents.add((GeometryCollection) child);
                } else {
                    if (geomType.isAssignableFrom(child.getClass())) {
                        leafs.add(child);
                    }
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `common/src/main/java/org/apache/sedona/common/utils/GeomUtils.java`
#### Snippet
```java
        if (geometry instanceof Polygonal) {
            return true;
        } else if (geometryIsHomogeneous(geometry) && geometry.getDimension() == 2) {
            return true;
        }
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `common/src/main/java/org/apache/sedona/common/utils/GeomUtils.java`
#### Snippet
```java
        if (geometry instanceof Puntal) {
            return true;
        } else if (geometryIsHomogeneous(geometry) && geometry.getDimension() == 0) {
            return true;
        }
```

### DataFlowIssue
Dereference of `indexType` may produce `NullPointerException`
in `common/src/main/java/org/apache/sedona/common/geometrySerde/SpatialIndexSerde.java`
#### Snippet
```java
        byte typeID = input.readByte();
        Type indexType = Type.fromId(typeID);
        switch (indexType) {
            case QUADTREE: {
                IndexSerde indexSerde = new IndexSerde();
```

### DataFlowIssue
Dereference of `geometryType` may produce `NullPointerException`
in `common/src/main/java/org/apache/sedona/common/geometrySerde/GeometrySerde.java`
#### Snippet
```java
        byte typeId = input.readByte();
        Type geometryType = Type.fromId(typeId);
        switch (geometryType) {
            case SHAPE:
                return readGeometry(kryo, input);
```

### DataFlowIssue
Method invocation `getClass` will produce `NullPointerException`
in `common/src/main/java/org/apache/sedona/common/geometrySerde/GeometrySerializer.java`
#### Snippet
```java
        } else {
            throw new UnsupportedOperationException(
                    "Geometry type is not supported: " + geometry.getClass().getSimpleName());
        }
        return buffer.toByteArray();
```

### DataFlowIssue
Method invocation `getEnvelopeInternal` will produce `NullPointerException`
in `core/src/main/java/org/apache/sedona/core/showcase/UserSuppliedRectangleMapper.java`
#### Snippet
```java
            }
            else {
                result.add(spatialObject.getEnvelopeInternal());
            }
        }
```

### DataFlowIssue
Method invocation `read` may produce `NullPointerException`
in `core/src/main/java/org/apache/sedona/core/formatMapper/netcdfParser/SerNetCDFUtils.java`
#### Snippet
```java
        Array searchVariable = null;
        try {
            searchVariable = netcdfVal.read();
        }
        catch (Exception e) {
```

### DataFlowIssue
Method invocation `getGeometryType` will produce `NullPointerException`
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
                        }
                        else {
                            throw new Exception("[ShapefileRDD][getPointRDD] the object type is not Point or MultiPoint type. It is " + spatialObject.getGeometryType());
                        }
                        return result.iterator();
```

### DataFlowIssue
Method invocation `getGeometryType` will produce `NullPointerException`
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
                        }
                        else {
                            throw new Exception("[ShapefileRDD][getLineStringRDD] the object type is not LineString or MultiLineString type. It is " + spatialObject.getGeometryType());
                        }
                        return result.iterator();
```

### DataFlowIssue
Method invocation `getGeometryType` will produce `NullPointerException`
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
                }
                else {
                    throw new Exception("[ShapefileRDD][getPolygonRDD] the object type is not Polygon or MultiPolygon type. It is " + spatialObject.getGeometryType());
                }
                return result.iterator();
```

### DataFlowIssue
Method invocation `distance` may produce `NullPointerException`
in `core/src/main/java/org/apache/sedona/core/knnJudgement/KnnJudgement.java`
#### Snippet
```java
                T curpoint = input.next();
                double distance = curpoint.distance(queryCenter);
                double largestDistanceInPriQueue = pq.peek().distance(queryCenter);
                if (largestDistanceInPriQueue > distance) {
                    pq.poll();
```

### DataFlowIssue
Method invocation `getClass` will produce `NullPointerException`
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/shp/ShapeSerde.java`
#### Snippet
```java

        throw new UnsupportedOperationException("Geometry type is not supported: " +
                geometry.getClass().getSimpleName());
    }

```

### DataFlowIssue
Method invocation `getGeometryType` will produce `NullPointerException`
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileRDD.java`
#### Snippet
```java
                }
                else {
                    throw new Exception("[ShapefileRDD][getPointRDD] the object type is not Point or MultiPoint type. It is " + spatialObject.getGeometryType());
                }
                return result.iterator();
```

### DataFlowIssue
Method invocation `getGeometryType` will produce `NullPointerException`
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileRDD.java`
#### Snippet
```java
                }
                else {
                    throw new Exception("[ShapefileRDD][getLineStringRDD] the object type is not LineString or MultiLineString type. It is " + spatialObject.getGeometryType());
                }
                return result.iterator();
```

### DataFlowIssue
Method invocation `getGeometryType` will produce `NullPointerException`
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileRDD.java`
#### Snippet
```java
                }
                else {
                    throw new Exception("[ShapefileRDD][getPolygonRDD] the object type is not Polygon or MultiPolygon type. It is " + spatialObject.getGeometryType());
                }
                return result.iterator();
```

### DataFlowIssue
Method invocation `getPartitionTree` may produce `NullPointerException`
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/PartitioningUtils.java`
#### Snippet
```java
                    e.printStackTrace();
                }
                partitioner = quadtreePartitioning.getPartitionTree();
                break;
            }
```

### DataFlowIssue
Method invocation `getPartitionTree` may produce `NullPointerException`
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/PartitioningUtils.java`
#### Snippet
```java
                    e.printStackTrace();
                }
                partitioner = quadtreePartitioning.getPartitionTree();
                break;
            }
```

## RuleId[id=BoxingBoxedValue]
### BoxingBoxedValue
Boxing of already boxed `objectWeight`
in `viz/src/main/java/org/apache/sedona/viz/utils/RasterizationUtils.java`
#### Snippet
```java
                    try {
                        Pixel newPixel = new Pixel(i, j, resolutionX, resolutionY);
                        result.add(new Tuple2<Pixel, Double>(newPixel, new Double(objectWeight)));
                    }
                    catch (Exception e) {
```

### BoxingBoxedValue
Boxing of already boxed `(Double) array.getObject(dataIndex)`
in `core/src/main/java/org/apache/sedona/core/formatMapper/netcdfParser/SerNetCDFUtils.java`
#### Snippet
```java
                return new Double((Float) array.getObject(dataIndex));
            case DOUBLE:
                return new Double((Double) array.getObject(dataIndex));
            case LONG:
                return new Double((Long) array.getObject(dataIndex));
```

### BoxingBoxedValue
Boxing of already boxed `(Double) array.getObject(dataIndex)`
in `core/src/main/java/org/apache/sedona/core/formatMapper/netcdfParser/SerNetCDFUtils.java`
#### Snippet
```java
                return new Double((Float) array.getObject(dataIndex));
            case DOUBLE:
                return new Double((Double) array.getObject(dataIndex));
            case LONG:
                return new Double((Long) array.getObject(dataIndex));
```

## RuleId[id=TypeParameterHidesVisibleType]
### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `common/src/main/java/org/apache/sedona/common/utils/FormatUtils.java`
#### Snippet
```java
    }

    public <T extends Geometry> void addMultiGeometry(GeometryCollection multiGeometry, List<T> result)
    {
        for (int i = 0; i < multiGeometry.getNumGeometries(); i++) {
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'MinimumBoundingRectangle' is still used
in `core/src/main/java/org/apache/sedona/core/spatialRDD/SpatialRDD.java`
#### Snippet
```java
     */
    @Deprecated
    public RectangleRDD MinimumBoundingRectangle()
    {
        JavaRDD<Polygon> rectangleRDD = this.rawSpatialRDD.map(new Function<T, Polygon>()
```

### DeprecatedIsStillUsed
Deprecated member 'ShapefileRDD' is still used
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileRDD.java`
#### Snippet
```java
 */
@Deprecated
public class ShapefileRDD
        implements Serializable
{
```

### DeprecatedIsStillUsed
Deprecated member 'SpatialJoinQueryCountByKey' is still used
in `core/src/main/java/org/apache/sedona/core/spatialOperator/JoinQuery.java`
#### Snippet
```java
     */
    @Deprecated
    public static <U extends Geometry, T extends Geometry> JavaPairRDD<U, Long> SpatialJoinQueryCountByKey(SpatialRDD<T> spatialRDD, SpatialRDD<U> queryRDD, boolean useIndex, boolean considerBoundaryIntersection)
            throws Exception
    {
```

### DeprecatedIsStillUsed
Deprecated member 'DistanceJoinQueryFlat' is still used
in `core/src/main/java/org/apache/sedona/core/spatialOperator/JoinQuery.java`
#### Snippet
```java
     */
    @Deprecated
    public static <T extends Geometry> JavaPairRDD<Geometry, T> DistanceJoinQueryFlat(SpatialRDD<T> spatialRDD, CircleRDD queryRDD, boolean useIndex, boolean considerBoundaryIntersection)
            throws Exception
    {
```

### DeprecatedIsStillUsed
Deprecated member 'JoinParams' is still used
in `core/src/main/java/org/apache/sedona/core/spatialOperator/JoinQuery.java`
#### Snippet
```java

        @Deprecated
        public JoinParams(boolean useIndex, boolean considerBoundaryIntersection, IndexType polygonIndexType, JoinBuildSide joinBuildSide)
        {
            this(useIndex, considerBoundaryIntersection? SpatialPredicate.INTERSECTS: SpatialPredicate.COVERS, polygonIndexType, joinBuildSide);
```

### DeprecatedIsStillUsed
Deprecated member 'DistanceJoinQueryCountByKey' is still used
in `core/src/main/java/org/apache/sedona/core/spatialOperator/JoinQuery.java`
#### Snippet
```java
     */
    @Deprecated
    public static <T extends Geometry> JavaPairRDD<Geometry, Long> DistanceJoinQueryCountByKey(SpatialRDD<T> spatialRDD, CircleRDD queryRDD, boolean useIndex, boolean considerBoundaryIntersection)
            throws Exception
    {
```

### DeprecatedIsStillUsed
Deprecated member 'SpatialJoinQueryFlat' is still used
in `core/src/main/java/org/apache/sedona/core/spatialOperator/JoinQuery.java`
#### Snippet
```java
     */
    @Deprecated
    public static <U extends Geometry, T extends Geometry> JavaPairRDD<U, T> SpatialJoinQueryFlat(SpatialRDD<T> spatialRDD, SpatialRDD<U> queryRDD, boolean useIndex, boolean considerBoundaryIntersection)
            throws Exception
    {
```

### DeprecatedIsStillUsed
Deprecated member 'DistanceJoinQuery' is still used
in `core/src/main/java/org/apache/sedona/core/spatialOperator/JoinQuery.java`
#### Snippet
```java
     */
    @Deprecated
    public static <T extends Geometry> JavaPairRDD<Geometry, List<T>> DistanceJoinQuery(SpatialRDD<T> spatialRDD, CircleRDD queryRDD, boolean useIndex, boolean considerBoundaryIntersection)
            throws Exception
    {
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `common/src/main/java/org/apache/sedona/common/utils/GeomUtils.java`
#### Snippet
```java
        String sridString = "";
        if (srid != 0) {
            sridString = "SRID=" + String.valueOf(srid) + ";";
        }

```

## RuleId[id=FinallyBlockCannotCompleteNormally]
### FinallyBlockCannotCompleteNormally
`finally` block can not complete normally
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileRDD.java`
#### Snippet
```java
                e.printStackTrace();
            }
            finally {
                return shape;
            }
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `common/src/main/java/org/apache/sedona/common/utils/FormatUtils.java`
#### Snippet
```java
    public List<String> readPropertyNames(String geoString)
    {
        switch (splitter) {
            case GEOJSON:
                return readGeoJsonPropertyNames(geoString);
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `common/src/main/java/org/apache/sedona/common/Constructors.java`
#### Snippet
```java
        Coordinate[] coordinates = new Coordinate[5];
        coordinates[0] = new Coordinate(minX, minY);
        coordinates[1] = new Coordinate(minX, maxY);
        coordinates[2] = new Coordinate(maxX, maxY);
        coordinates[3] = new Coordinate(maxX, minY);
        coordinates[4] = coordinates[0];
```

### DuplicatedCode
Duplicated code
in `common/src/main/java/org/apache/sedona/common/geometryObjects/Circle.java`
#### Snippet
```java
        Envelope env = (Envelope) other;
        Envelope mbr = this.MBR;
        // compare based on numerical ordering of ordinates
        if (mbr.getMinX() < env.getMinX()) { return -1; }
        if (mbr.getMinX() > env.getMinX()) { return 1; }
        if (mbr.getMinY() < env.getMinY()) { return -1; }
        if (mbr.getMinY() > env.getMinY()) { return 1; }
        if (mbr.getMaxX() < env.getMaxX()) { return -1; }
        if (mbr.getMaxX() > env.getMaxX()) { return 1; }
        if (mbr.getMaxY() < env.getMaxY()) { return -1; }
        if (mbr.getMaxY() > env.getMaxY()) { return 1; }
        return 0;
```

### DuplicatedCode
Duplicated code
in `common/src/main/java/org/apache/sedona/common/geometrySerde/GeometrySerializer.java`
#### Snippet
```java
        CoordinateType coordType = buffer.getCoordinateType();
        int numCoordinates = getBoundedInt(buffer, 4);
        int coordsOffset = 8;
        int numOffset = 8 + numCoordinates * coordType.bytes;
        GeomPartSerializer serializer = new GeomPartSerializer(buffer, coordsOffset, numOffset);
        int numLineStrings = serializer.checkedReadBoundedInt();
```

### DuplicatedCode
Duplicated code
in `common/src/main/java/org/apache/sedona/common/raster/Outputs.java`
#### Snippet
```java
        GeneralParameterValue[] wps = defaultParams.values().toArray(new GeneralParameterValue[0]);
        try {
            writer.write(raster, wps);
            writer.dispose();
            out.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        return out.toByteArray();
```

### DuplicatedCode
Duplicated code
in `common/src/main/java/org/apache/sedona/common/sphere/Haversine.java`
#### Snippet
```java
        Coordinate coordinate1 = geom1.getGeometryType().equals("Point")? geom1.getCoordinate():geom1.getCentroid().getCoordinate();
        Coordinate coordinate2 = geom2.getGeometryType().equals("Point")? geom2.getCoordinate():geom2.getCentroid().getCoordinate();
        // Calculate the distance between the two points
        double lat1 = coordinate1.getX();
        double lon1 = coordinate1.getY();
        double lat2 = coordinate2.getX();
        double lon2 = coordinate2.getY();
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/sedona/core/formatMapper/netcdfParser/SerNetCDFUtils.java`
#### Snippet
```java
        dataIndex.set(location);
        switch (array.getDataType()) {
            case INT:
                return new Double((Integer) array.getObject(dataIndex));
            case SHORT:
                return new Double((Short) array.getObject(dataIndex));
            case FLOAT:
                return new Double((Float) array.getObject(dataIndex));
            case DOUBLE:
                return new Double((Double) array.getObject(dataIndex));
            case LONG:
                return new Double((Long) array.getObject(dataIndex));
            default:
                return (Double) array.getObject(dataIndex);
        }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileRDD.java`
#### Snippet
```java
        return shapeRDD.flatMap(new FlatMapFunction<Geometry, Point>()
        {
            @Override
            public Iterator<Point> call(Geometry spatialObject)
                    throws Exception
            {
                List<Point> result = new ArrayList<Point>();
                if (spatialObject instanceof MultiPoint) {
                    MultiPoint multiObjects = (MultiPoint) spatialObject;
                    for (int i = 0; i < multiObjects.getNumGeometries(); i++) {
                        Point oneObject = (Point) multiObjects.getGeometryN(i);
                        oneObject.setUserData(multiObjects.getUserData());
                        result.add(oneObject);
                    }
                }
                else if (spatialObject instanceof Point) {
                    result.add((Point) spatialObject);
                }
                else {
                    throw new Exception("[ShapefileRDD][getPointRDD] the object type is not Point or MultiPoint type. It is " + spatialObject.getGeometryType());
                }
                return result.iterator();
            }
        });
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileRDD.java`
#### Snippet
```java
        return shapeRDD.flatMap(new FlatMapFunction<Geometry, Polygon>()
        {
            @Override
            public Iterator<Polygon> call(Geometry spatialObject)
                    throws Exception
            {
                List<Polygon> result = new ArrayList<Polygon>();
                if (spatialObject instanceof MultiPolygon) {
                    MultiPolygon multiObjects = (MultiPolygon) spatialObject;
                    for (int i = 0; i < multiObjects.getNumGeometries(); i++) {
                        Polygon oneObject = (Polygon) multiObjects.getGeometryN(i);
                        oneObject.setUserData(multiObjects.getUserData());
                        result.add(oneObject);
                    }
                }
                else if (spatialObject instanceof Polygon) {
                    result.add((Polygon) spatialObject);
                }
                else {
                    throw new Exception("[ShapefileRDD][getPolygonRDD] the object type is not Polygon or MultiPolygon type. It is " + spatialObject.getGeometryType());
                }
                return result.iterator();
            }
        });
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileRDD.java`
#### Snippet
```java
        return shapeRDD.flatMap(new FlatMapFunction<Geometry, LineString>()
        {
            @Override
            public Iterator<LineString> call(Geometry spatialObject)
                    throws Exception
            {
                List<LineString> result = new ArrayList<LineString>();
                if (spatialObject instanceof MultiLineString) {
                    MultiLineString multiObjects = (MultiLineString) spatialObject;
                    for (int i = 0; i < multiObjects.getNumGeometries(); i++) {
                        LineString oneObject = (LineString) multiObjects.getGeometryN(i);
                        oneObject.setUserData(multiObjects.getUserData());
                        result.add(oneObject);
                    }
                }
                else if (spatialObject instanceof LineString) {
                    result.add((LineString) spatialObject);
                }
                else {
                    throw new Exception("[ShapefileRDD][getLineStringRDD] the object type is not LineString or MultiLineString type. It is " + spatialObject.getGeometryType());
                }
                return result.iterator();
            }
        });
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileRDD.java`
#### Snippet
```java
        JavaPairRDD<Long, BoundBox> bounds = sc.newAPIHadoopFile(
                inputPath,
                BoundaryInputFormat.class,
                Long.class,
                BoundBox.class,
                sc.hadoopConfiguration()
        );
        // merge all into one
        bounds = bounds.reduceByKey(new Function2<BoundBox, BoundBox, BoundBox>()
        {
            @Override
            public BoundBox call(BoundBox box1, BoundBox box2)
                    throws Exception
            {
                return BoundBox.mergeBoundBox(box1, box2);
            }
        });
        // if there is a result assign it to variable : boundBox
        if (bounds.count() > 0) {
            return new BoundBox(bounds.collect().get(0)._2());
        }
        else { return null; }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/boundary/BoundaryInputFormat.java`
#### Snippet
```java
        Path[] shpPaths = new Path[shpIds.size()];
        long[] shpStarts = new long[shpIds.size()];
        long[] shpLengths = new long[shpIds.size()];

        for (int i = 0; i < shpIds.size(); ++i) {
            int id = shpIds.get(i);
            shpPaths[i] = combineSplit.getPath(id);
            shpStarts[i] = combineSplit.getOffset(id);
            shpLengths[i] = combineSplit.getLength(id);
        }

        //combine all .shp splits as one split.
        CombineFileSplit shpSplit = new CombineFileSplit(shpPaths, shpStarts, shpLengths, combineSplit.getLocations());
        List<InputSplit> shpSplits = new ArrayList<>();
        shpSplits.add(shpSplit);
        return shpSplits;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/sedona/core/showcase/Example.java`
#### Snippet
```java
        objectRDD.buildIndex(PointRDDIndexType, false);
        objectRDD.indexedRawRDD.persist(StorageLevel.MEMORY_ONLY());
        for (int i = 0; i < eachQueryLoopTimes; i++) {
            long resultSize = RangeQuery.SpatialRangeQuery(objectRDD, rangeQueryWindow, false, true).count();
            assert resultSize > -1;
        }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/sedona/core/showcase/UserSuppliedPolygonMapper.java`
#### Snippet
```java
            String line = stringIterator.next();
            Geometry spatialObject = null;
            MultiPolygon multiSpatialObjects = null;
            List<String> lineSplitList;
            lineSplitList = Arrays.asList(line.split("\t"));
            String newLine = lineSplitList.get(0).replace("\"", "");
            WKTReader wktreader = new WKTReader();
            spatialObject = wktreader.read(newLine);
```

### DuplicatedCode
Duplicated code
in `flink/src/main/java/org/apache/sedona/flink/SedonaContext.java`
#### Snippet
```java
        GeometrySerde serializer = new GeometrySerde();
        SpatialIndexSerde indexSerializer = new SpatialIndexSerde(serializer);
        env.getConfig().registerTypeWithKryoSerializer(Point.class, serializer);
        env.getConfig().registerTypeWithKryoSerializer(LineString.class, serializer);
        env.getConfig().registerTypeWithKryoSerializer(Polygon.class, serializer);
        env.getConfig().registerTypeWithKryoSerializer(MultiPoint.class, serializer);
        env.getConfig().registerTypeWithKryoSerializer(MultiLineString.class, serializer);
        env.getConfig().registerTypeWithKryoSerializer(MultiPolygon.class, serializer);
        env.getConfig().registerTypeWithKryoSerializer(GeometryCollection.class, serializer);
        env.getConfig().registerTypeWithKryoSerializer(Circle.class, serializer);
        env.getConfig().registerTypeWithKryoSerializer(Envelope.class, serializer);
        env.getConfig().registerTypeWithKryoSerializer(Quadtree.class, indexSerializer);
        env.getConfig().registerTypeWithKryoSerializer(STRtree.class, indexSerializer);
```

### DuplicatedCode
Duplicated code
in `viz/src/main/java/org/apache/sedona/viz/core/ImageGenerator.java`
#### Snippet
```java
        String outputPath = originalOutputPath + "." + imageType.getTypeName();
        String[] splitString = outputPath.split(":");
        String hostName = splitString[0] + ":" + splitString[1];
        String[] portAndPath = splitString[2].split("/");
        String port = portAndPath[0];
        String localPath = "";
        for (int i = 1; i < portAndPath.length; i++) {
            localPath += "/" + portAndPath[i];
        }
        localPath += "." + imageType.getTypeName();
        // Delete existing files
        Configuration hadoopConf = new org.apache.hadoop.conf.Configuration();
        logger.info("[Sedona-Viz][SaveRasterImageAsSparkFile] HDFS URI BASE: " + hostName + ":" + port);
        FileSystem hdfs = FileSystem.get(new URI(hostName + ":" + port), hadoopConf);
        logger.info("[Sedona-Viz][SaveRasterImageAsSparkFile] Check the existence of path: " + localPath);
        if (hdfs.exists(new org.apache.hadoop.fs.Path(localPath))) {
            logger.info("[Sedona-Viz][SaveRasterImageAsSparkFile] Deleting path: " + localPath);
            hdfs.delete(new org.apache.hadoop.fs.Path(localPath), true);
            logger.info("[Sedona-Viz][SaveRasterImageAsSparkFile] Deleted path: " + localPath);
        }
```

### DuplicatedCode
Duplicated code
in `viz/src/main/java/org/apache/sedona/viz/core/ImageStitcher.java`
#### Snippet
```java
        String[] splitString = imageTilePath.split(":");
        String hostName = splitString[0] + ":" + splitString[1];
        String[] portAndPath = splitString[2].split("/");
        String port = portAndPath[0];
        String localPath = "";
        for (int i = 1; i < portAndPath.length; i++) {
            localPath += "/" + portAndPath[i];
        }
```

### DuplicatedCode
Duplicated code
in `viz/src/main/java/org/apache/sedona/viz/core/ImageStitcher.java`
#### Snippet
```java
            Tuple2<Integer, Integer> partitionCoordinate = RasterizationUtils.Decode1DTo2DId(partitionOnX, partitionOnY, i);
            int partitionMinX = partitionCoordinate._1 * Math.round(resolutionX / partitionOnX);
            int partitionMinY = partitionCoordinate._2 * Math.round(resolutionY / partitionOnY);
            //if(partitionMinX!=0){partitionMinX--;}
            //if(partitionMinY!=0){partitionMinY--;}
            int[] rgbArray = imageTile.getRGB(0, 0, imageTile.getWidth(), imageTile.getHeight(), null, 0, imageTile.getWidth());
            int partitionMaxX = partitionMinX + imageTile.getWidth();
            int partitionMaxY = partitionMinY + imageTile.getHeight();
            logger.debug("[Sedona-Viz][stitchImagePartitions] stitching image tile..." + i + " ResolutionX " + resolutionX + " ResolutionY " + resolutionY);
            logger.debug("[Sedona-Viz][stitchImagePartitions] stitching a image tile..." + i + " MinX " + partitionMinX + " MaxX " + partitionMaxX + " MinY " + partitionMinY + " MaxY " + partitionMaxY);
            stitchedImage.setRGB(partitionMinX, partitionMinY, imageTile.getWidth(), imageTile.getHeight(), rgbArray, 0, imageTile.getWidth());
```

### DuplicatedCode
Duplicated code
in `viz/src/main/java/org/apache/sedona/viz/core/RasterOverlayOperator.java`
#### Snippet
```java
                if (backImage.getWidth() != frontImage.getWidth() || backImage.getHeight() != frontImage.getHeight()) {
                    throw new Exception("[OverlayOperator][JoinImage] The two given image don't have the same width or the same height.");
                }
                int w = Math.max(backImage.getWidth(), frontImage.getWidth());
                int h = Math.max(backImage.getHeight(), frontImage.getHeight());
                BufferedImage combinedImage = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
                Graphics graphics = combinedImage.getGraphics();
                graphics.drawImage(backImage, 0, 0, null);
                graphics.drawImage(frontImage, 0, 0, null);
```

### DuplicatedCode
Duplicated code
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationOperator.java`
#### Snippet
```java
        if (controlColorChannel.equals(Color.RED)) {
            red = useInverseRatioForControlColorChannel ? 255 - normailizedCount : normailizedCount;
        }
        else if (controlColorChannel.equals(Color.GREEN)) {
            green = useInverseRatioForControlColorChannel ? 255 - normailizedCount : normailizedCount;
        }
        else if (controlColorChannel.equals(Color.BLUE)) {
            blue = useInverseRatioForControlColorChannel ? 255 - normailizedCount : normailizedCount;
        }
        else { throw new Exception("[Sedona-VizViz][GenerateColor] Unsupported changing color color type. It should be in R,G,B"); }
```

### DuplicatedCode
Duplicated code
in `viz/src/main/java/org/apache/sedona/viz/extension/coloringRule/GenericColoringRule.java`
#### Snippet
```java
        int alpha = 150;
        Color[] colors = new Color[] {new Color(0, 255, 0, alpha), new Color(85, 255, 0, alpha), new Color(170, 255, 0, alpha),
                new Color(255, 255, 0, alpha), new Color(255, 255, 0, alpha), new Color(255, 170, 0, alpha),
                new Color(255, 85, 0, alpha), new Color(255, 0, 0, alpha)};
        if (normailizedCount == 0) {
            return new Color(255, 255, 255, 0).getRGB();
        }
        else if (normailizedCount < 5) {
            return colors[0].getRGB();
        }
        else if (normailizedCount < 15) {
            return colors[1].getRGB();
        }
        else if (normailizedCount < 25) {
            return colors[2].getRGB();
        }
        else if (normailizedCount < 35) {
            return colors[3].getRGB();
        }
        else if (normailizedCount < 45) {
            return colors[4].getRGB();
        }
        else if (normailizedCount < 60) {
            return colors[5].getRGB();
        }
        else if (normailizedCount < 80) {
            return colors[6].getRGB();
        }
        else {
            return colors[7].getRGB();
        }
```

### DuplicatedCode
Duplicated code
in `viz/src/main/java/org/apache/sedona/viz/showcase/Example.java`
#### Snippet
```java
        prop.load(ConfFile);
        RectangleInputLocation = "file://" + System.getProperty("user.dir") + "/" + resourcePath + prop.getProperty("inputLocation");
        RectangleOffset = Integer.parseInt(prop.getProperty("offset"));
        RectangleSplitter = FileDataSplitter.getFileDataSplitter(prop.getProperty("splitter"));
        RectangleNumPartitions = Integer.parseInt(prop.getProperty("numPartitions"));
```

### DuplicatedCode
Duplicated code
in `viz/src/main/java/org/apache/sedona/viz/utils/RasterizationUtils.java`
#### Snippet
```java
        Coordinate spatialCoordinate;
        Envelope datasetBoundary;
        if (reverseSpatialCoordinate) {
            spatialCoordinate = new Coordinate(spatialCoordinateOriginal.y, spatialCoordinateOriginal.x);
            datasetBoundary = new Envelope(datasetBoundaryOriginal.getMinY(), datasetBoundaryOriginal.getMaxY(), datasetBoundaryOriginal.getMinX(), datasetBoundaryOriginal.getMaxX());
        }
        else {
            spatialCoordinate = spatialCoordinateOriginal;
            datasetBoundary = datasetBoundaryOriginal;
        }
		/*
		 if(spatialCoordinate.x < datasetBoundary.getMinX() || spatialCoordinate.x > datasetBoundary.getMaxX())
		{
			throw new Exception("[RasterizationUtils][FindOnePixelCoordinate] This spatial coordinate is out of the given boundary. Should be ignored.");
		}
		if(spatialCoordinate.y < datasetBoundaryOriginal.getMinY() || spatialCoordinate.y > datasetBoundaryOriginal.getMaxY())
		{
			throw new Exception("[RasterizationUtils][FindOnePixelCoordinate] This spatial coordinate is out of the given boundary. Should be ignored.");
		}*/

        Double pixelXDouble = ((spatialCoordinate.x - datasetBoundary.getMinX()) / (datasetBoundary.getMaxX() - datasetBoundary.getMinX())) * resolutionX;
        Double xRemainder = (spatialCoordinate.x - datasetBoundary.getMinX()) % (datasetBoundary.getMaxX() - datasetBoundary.getMinX());
        Double pixelYDouble = ((spatialCoordinate.y - datasetBoundary.getMinY()) / (datasetBoundary.getMaxY() - datasetBoundary.getMinY())) * resolutionY;
```

### DuplicatedCode
Duplicated code
in `viz/src/main/java/org/apache/sedona/viz/utils/RasterizationUtils.java`
#### Snippet
```java
        int pixelX = pixelXDouble.intValue();
        int pixelY = pixelYDouble.intValue();
        if (xRemainder == 0.0 && pixelXDouble != 0.0) {
            pixelX--;
        }
        if (pixelX >= resolutionX) {
            pixelX--;
        }
        if (yRemainder == 0.0 && pixelYDouble != 0) {
            pixelY--;
        }
        if (pixelY >= resolutionY) {
            pixelY--;
        }
```

### DuplicatedCode
Duplicated code
in `viz/src/main/java/org/apache/sedona/viz/utils/RasterizationUtils.java`
#### Snippet
```java
        List<Tuple2<Pixel, Double>> result = new ArrayList<Tuple2<Pixel, Double>>();
        for (int i = 0; i < spatialObject.getCoordinates().length - 1; i++) {
            Tuple2<Integer, Integer> pixelCoordinate1 = null;
            Tuple2<Integer, Integer> pixelCoordinate2 = null;
            try {
                pixelCoordinate1 = FindOnePixelCoordinate(resolutionX, resolutionY, datasetBoundary, spatialObject.getCoordinates()[i], reverseSpatialCoordinate);
                pixelCoordinate2 = FindOnePixelCoordinate(resolutionX, resolutionY, datasetBoundary, spatialObject.getCoordinates()[i + 1], reverseSpatialCoordinate);
            }
            catch (Exception e) {
                // This pixel is out of boundary. Should be ignored.
                continue;
            }
            result.addAll(FindPixelCoordinates(resolutionX, resolutionY, pixelCoordinate1, pixelCoordinate2, reverseSpatialCoordinate));
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `viz/src/main/java/org/apache/sedona/viz/utils/RasterizationUtils.java`
#### Snippet
```java
            for (x = x1; x != x2; x += ux) {
                try {
                    Pixel newPixel = new Pixel(x, y, resolutionX, resolutionY);
                    result.add(new Tuple2<Pixel, Double>(newPixel, 1.0));
                }
                catch (Exception e) {
                    /*
                     * This spatial object is out of the given dataset boudanry. It is ignored here.
                     */
                }
                eps += dy;
                if ((eps << 1) >= dx) {
                    y += uy;
                    eps -= dx;
                }
            }
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `common/src/main/java/org/apache/sedona/common/Functions.java`
#### Snippet
```java
     * @param input Geometry
     * @param level integer, minimum level of cells covering the geometry
     * @return List of coordinates
     */
    public static Long[] s2CellIDs(Geometry input, int level) {
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/quadtree/StandardQuadTree.java`
#### Snippet
```java
            // redispatch the elements
            List<QuadNode<T>> tempNodes = new ArrayList<>();
            tempNodes.addAll(nodes);

            nodes.clear();
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationOperator.java`
#### Snippet
```java
    }

    /**
     * Sets the max pixel count.
     *
```

### DanglingJavadoc
Dangling Javadoc comment
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/shapes/ShapeFileReader.java`
#### Snippet
```java
    {
        if (useIndex) {
            /**
             * with index, iterate until end and extract bytes with information from indexes
             */
```

### DanglingJavadoc
Dangling Javadoc comment
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
    }

    /**
     *
     * Boundary logics
```

### DanglingJavadoc
Dangling Javadoc comment
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
        else { return null; }
    }
    /**
     *
     * Read To SpatialRDD logics
```

### DanglingJavadoc
Dangling Javadoc comment
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/FlatGridPartitioner.java`
#### Snippet
```java
    public DedupParams getDedupParams()
    {
        /**
         * Equal and Hilbert partitioning methods have necessary properties to support de-dup.
         * These methods provide non-overlapping partition extents and not require overflow
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `common/src/main/java/org/apache/sedona/common/utils/GeomUtils.java`
#### Snippet
```java
            final Point referencePoint =
                    left.getFactory().createPoint(new Coordinate(intersection.getMinX(), intersection.getMinY()));
            if (!extent.contains(referencePoint)) {
                return true;
            }
```

### TrivialIf
`if` statement can be simplified
in `common/src/main/java/org/apache/sedona/common/utils/GeomUtils.java`
#### Snippet
```java
        if (geometry instanceof Lineal) {
            return true;
        } else if (geometryIsHomogeneous(geometry) && geometry.getDimension() == 1) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `common/src/main/java/org/apache/sedona/common/utils/GeomUtils.java`
#### Snippet
```java
        if (geometry instanceof Polygonal) {
            return true;
        } else if (geometryIsHomogeneous(geometry) && geometry.getDimension() == 2) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `common/src/main/java/org/apache/sedona/common/utils/GeomUtils.java`
#### Snippet
```java
        if (geometry instanceof Puntal) {
            return true;
        } else if (geometryIsHomogeneous(geometry) && geometry.getDimension() == 0) {
            return true;
        }
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'Output' used without 'try'-with-resources statement
in `viz/src/main/java/org/apache/sedona/viz/core/Serde/ImageWrapperSerializer.java`
#### Snippet
```java
        }
        int arraySize = byteArrayOutputStream.size();
        Output output = new Output(arraySize + 4);
        output.writeInt(arraySize);
        output.write(byteArrayOutputStream.toByteArray());
```

### AutoCloseableResource
'RandomAccessFile' used without 'try'-with-resources statement
in `viz/src/main/java/org/apache/sedona/viz/core/BigBufferedImage.java`
#### Snippet
```java
            for (int i = 0; i < banks; i++) {
                File file = files[i] = new File(path + "/bank" + i + ".dat");
                final RandomAccessFile randomAccessFile = accessFiles[i] = new RandomAccessFile(file, "rw");
                buffer[i] = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_WRITE, 0, getSize());
            }
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'geometry instanceof Circle' covered by subsequent condition 'geometry instanceof MultiPoint'
in `common/src/main/java/org/apache/sedona/common/Functions.java`
#### Snippet
```java

    public static boolean isClosed(Geometry geometry) {
        if (geometry instanceof Circle || geometry instanceof MultiPoint || geometry instanceof MultiPolygon || geometry instanceof Point || geometry instanceof Polygon) {
            return true;
        } else if (geometry instanceof LineString) {
```

### ConditionCoveredByFurtherCondition
Condition 'o == null' covered by subsequent condition '!(o instanceof Pixel)'
in `viz/src/main/java/org/apache/sedona/viz/utils/Pixel.java`
#### Snippet
```java
    public boolean equals(Object o)
    {
        if (o == null || !(o instanceof Pixel)) { return false; }
        return this.hashCode() == o.hashCode();
    }
```

### ConditionCoveredByFurtherCondition
Condition 'o == null' covered by subsequent condition '!(o instanceof QuadTreePartitioner)'
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/QuadTreePartitioner.java`
#### Snippet
```java
    public boolean equals(Object o)
    {
        if (o == null || !(o instanceof QuadTreePartitioner)) {
            return false;
        }
```

### ConditionCoveredByFurtherCondition
Condition 'o == null' covered by subsequent condition '!(o instanceof FlatGridPartitioner)'
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/FlatGridPartitioner.java`
#### Snippet
```java
    public boolean equals(Object o)
    {
        if (o == null || !(o instanceof FlatGridPartitioner)) {
            return false;
        }
```

### ConditionCoveredByFurtherCondition
Condition 'o == null' covered by subsequent condition '!(o instanceof QuadRectangle)'
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/quadtree/QuadRectangle.java`
#### Snippet
```java
    public boolean equals(Object o)
    {
        if (o == null || !(o instanceof QuadRectangle)) {
            return false;
        }
```

## RuleId[id=SuspiciousToArrayCall]
### SuspiciousToArrayCall
Array of type 'Geometry\[\]' expected, 'Point\[\]' found
in `common/src/main/java/org/apache/sedona/common/utils/GeometrySplitter.java`
#### Snippet
```java
                switch (dimension) {
                    case 0:
                        result = (GeometryCollection)geometryFactory.createMultiPoint(validGeometries.toArray(new Point[0]));
                        break;
                    case 1:
```

### SuspiciousToArrayCall
Array of type 'Geometry\[\]' expected, 'LineString\[\]' found
in `common/src/main/java/org/apache/sedona/common/utils/GeometrySplitter.java`
#### Snippet
```java
                        break;
                    case 1:
                        result = (GeometryCollection)geometryFactory.createMultiLineString(validGeometries.toArray(new LineString[0]));
                        break;
                    case 2:
```

### SuspiciousToArrayCall
Array of type 'Geometry\[\]' expected, 'Polygon\[\]' found
in `common/src/main/java/org/apache/sedona/common/utils/GeometrySplitter.java`
#### Snippet
```java
                        break;
                    case 2:
                        result = (GeometryCollection)geometryFactory.createMultiPolygon(validGeometries.toArray(new Polygon[0]));
                        break;
                }
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param env` tag description is missing
in `flink/src/main/java/org/apache/sedona/flink/SedonaContext.java`
#### Snippet
```java
    /**
     * This is the entry point of the entire Sedona system
     * @param env
     * @param tblEnv
     * @return
```

### JavadocDeclaration
`@param tblEnv` tag description is missing
in `flink/src/main/java/org/apache/sedona/flink/SedonaContext.java`
#### Snippet
```java
     * This is the entry point of the entire Sedona system
     * @param env
     * @param tblEnv
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `flink/src/main/java/org/apache/sedona/flink/SedonaContext.java`
#### Snippet
```java
     * @param env
     * @param tblEnv
     * @return
     */
    public static StreamTableEnvironment create(StreamExecutionEnvironment env, StreamTableEnvironment tblEnv)
```

### JavadocDeclaration
`@param acc` tag description is missing
in `flink/src/main/java/org/apache/sedona/flink/expressions/Aggregators.java`
#### Snippet
```java
         * TODO: find an efficient algorithm to incrementally and decrementally update the accumulator
         *
         * @param acc
         * @param o
         */
```

### JavadocDeclaration
`@param o` tag description is missing
in `flink/src/main/java/org/apache/sedona/flink/expressions/Aggregators.java`
#### Snippet
```java
         *
         * @param acc
         * @param o
         */
        public void retract(Accumulators.AccGeometry acc,
```

### JavadocDeclaration
`@param acc` tag description is missing
in `flink/src/main/java/org/apache/sedona/flink/expressions/Aggregators.java`
#### Snippet
```java
         * TODO: find an efficient algorithm to incrementally and decrementally update the accumulator
         *
         * @param acc
         * @param o
         */
```

### JavadocDeclaration
`@param o` tag description is missing
in `flink/src/main/java/org/apache/sedona/flink/expressions/Aggregators.java`
#### Snippet
```java
         *
         * @param acc
         * @param o
         */
        public void retract(Accumulators.Envelope acc,
```

### JavadocDeclaration
`@return` tag description is missing
in `common/src/main/java/org/apache/sedona/common/utils/S2Utils.java`
#### Snippet
```java
    /**
     * @param coord Coordinate: convert a jts coordinate to a S2Point
     * @return
     */
    public static S2Point toS2Point(Coordinate coord) {
```

### JavadocDeclaration
`@param line` tag description is missing
in `common/src/main/java/org/apache/sedona/common/utils/S2Utils.java`
#### Snippet
```java

    /**
     * @param line
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `common/src/main/java/org/apache/sedona/common/utils/S2Utils.java`
#### Snippet
```java
    /**
     * @param line
     * @return
     */
    public static S2Polyline toS2PolyLine(LineString line) {
```

### JavadocDeclaration
`@param geom1` tag description is missing
in `common/src/main/java/org/apache/sedona/common/sphere/Spheroid.java`
#### Snippet
```java
     * This will produce almost identical result to PostGIS ST_DistanceSpheroid and
     * PostGIS ST_Distance(useSpheroid=true)
     * @param geom1
     * @param geom2
     * @return
```

### JavadocDeclaration
`@param geom2` tag description is missing
in `common/src/main/java/org/apache/sedona/common/sphere/Spheroid.java`
#### Snippet
```java
     * PostGIS ST_Distance(useSpheroid=true)
     * @param geom1
     * @param geom2
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `common/src/main/java/org/apache/sedona/common/sphere/Spheroid.java`
#### Snippet
```java
     * @param geom1
     * @param geom2
     * @return
     */
    public static double distance(Geometry geom1, Geometry geom2) {
```

### JavadocDeclaration
`@param geom` tag description is missing
in `common/src/main/java/org/apache/sedona/common/sphere/Spheroid.java`
#### Snippet
```java
     * Equivalent to PostGIS ST_Area(useSpheroid=true)
     * WGS84 ellipsoid is used.
     * @param geom
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `common/src/main/java/org/apache/sedona/common/sphere/Spheroid.java`
#### Snippet
```java
     * WGS84 ellipsoid is used.
     * @param geom
     * @return
     */
    public static double area(Geometry geom) {
```

### JavadocDeclaration
`@param geom` tag description is missing
in `common/src/main/java/org/apache/sedona/common/sphere/Spheroid.java`
#### Snippet
```java
     * Equivalent to PostGIS ST_LengthSpheroid and PostGIS ST_Length(useSpheroid=true)
     * WGS84 ellipsoid is used.
     * @param geom
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `common/src/main/java/org/apache/sedona/common/sphere/Spheroid.java`
#### Snippet
```java
     * WGS84 ellipsoid is used.
     * @param geom
     * @return
     */
    public static double length(Geometry geom) {
```

### JavadocDeclaration
`@return` tag description is missing
in `common/src/main/java/org/apache/sedona/common/sphere/Haversine.java`
#### Snippet
```java
     * @param geom1 The first geometry. Each coordinate is in lat/lon order
     * @param geom2 The second geometry. Each coordinate is in lat/lon order
     * @return
     */
    public static double distance(Geometry geom1, Geometry geom2, double AVG_EARTH_RADIUS)
```

### JavadocDeclaration
`@param splitter` tag description is missing
in `common/src/main/java/org/apache/sedona/common/utils/FormatUtils.java`
#### Snippet
```java
     * Instantiates a new format mapper. This is extensively used in SedonaSQL.
     *
     * @param splitter
     * @param carryInputData
     */
```

### JavadocDeclaration
`@param carryInputData` tag description is missing
in `common/src/main/java/org/apache/sedona/common/utils/FormatUtils.java`
#### Snippet
```java
     *
     * @param splitter
     * @param carryInputData
     */
    public FormatUtils(FileDataSplitter splitter, boolean carryInputData)
```

### JavadocDeclaration
`@param splitter` tag description is missing
in `common/src/main/java/org/apache/sedona/common/utils/FormatUtils.java`
#### Snippet
```java
     * This format mapper is used in SedonaSQL.
     *
     * @param splitter
     * @param carryInputData
     * @param geometryType
```

### JavadocDeclaration
`@param carryInputData` tag description is missing
in `common/src/main/java/org/apache/sedona/common/utils/FormatUtils.java`
#### Snippet
```java
     *
     * @param splitter
     * @param carryInputData
     * @param geometryType
     */
```

### JavadocDeclaration
`@param geometryType` tag description is missing
in `common/src/main/java/org/apache/sedona/common/utils/FormatUtils.java`
#### Snippet
```java
     * @param splitter
     * @param carryInputData
     * @param geometryType
     */
    public FormatUtils(FileDataSplitter splitter, boolean carryInputData, GeometryType geometryType)
```

### JavadocDeclaration
`@param left` tag description is missing
in `common/src/main/java/org/apache/sedona/common/utils/GeomUtils.java`
#### Snippet
```java
     * Checks if the geoemetry pair - <code>left</code> and <code>right</code> - should be handled be the current partition - <code>extent</code>.
     *
     * @param left
     * @param right
     * @param extent
```

### JavadocDeclaration
`@param right` tag description is missing
in `common/src/main/java/org/apache/sedona/common/utils/GeomUtils.java`
#### Snippet
```java
     *
     * @param left
     * @param right
     * @param extent
     * @return
```

### JavadocDeclaration
`@param extent` tag description is missing
in `common/src/main/java/org/apache/sedona/common/utils/GeomUtils.java`
#### Snippet
```java
     * @param left
     * @param right
     * @param extent
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `common/src/main/java/org/apache/sedona/common/utils/GeomUtils.java`
#### Snippet
```java
     * @param right
     * @param extent
     * @return
     */
    public static boolean isDuplicate(Geometry left, Geometry right, HalfOpenRectangle extent) {
```

### JavadocDeclaration
`@param geom1` tag description is missing
in `common/src/main/java/org/apache/sedona/common/utils/GeomUtils.java`
#### Snippet
```java
    /**
     * This is for verifying the correctness of two geometries loaded from geojson
     * @param geom1
     * @param geom2
     * @return
```

### JavadocDeclaration
`@param geom2` tag description is missing
in `common/src/main/java/org/apache/sedona/common/utils/GeomUtils.java`
#### Snippet
```java
     * This is for verifying the correctness of two geometries loaded from geojson
     * @param geom1
     * @param geom2
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `common/src/main/java/org/apache/sedona/common/utils/GeomUtils.java`
#### Snippet
```java
     * @param geom1
     * @param geom2
     * @return
     */
    public static boolean equalsExactGeomUnsortedUserData(Geometry geom1, Object geom2) {
```

### JavadocDeclaration
`@param userData1` tag description is missing
in `common/src/main/java/org/apache/sedona/common/utils/GeomUtils.java`
#### Snippet
```java
     * Use for check if two user data attributes are equal
     * This is mainly used for GeoJSON parser as the column order is uncertain each time
     * @param userData1
     * @param userData2
     * @return
```

### JavadocDeclaration
`@param userData2` tag description is missing
in `common/src/main/java/org/apache/sedona/common/utils/GeomUtils.java`
#### Snippet
```java
     * This is mainly used for GeoJSON parser as the column order is uncertain each time
     * @param userData1
     * @param userData2
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `common/src/main/java/org/apache/sedona/common/utils/GeomUtils.java`
#### Snippet
```java
     * @param userData1
     * @param userData2
     * @return
     */
    public static boolean equalsUserData(Object userData1, Object userData2) {
```

### JavadocDeclaration
`@param resolutionX` tag description is missing
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationPartitioner.java`
#### Snippet
```java
     * Calculate the 2D partition ID, in a <x, y> format
     *
     * @param resolutionX
     * @param resolutionY
     * @param partitionX
```

### JavadocDeclaration
`@param resolutionY` tag description is missing
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationPartitioner.java`
#### Snippet
```java
     *
     * @param resolutionX
     * @param resolutionY
     * @param partitionX
     * @param partitionY
```

### JavadocDeclaration
`@param partitionX` tag description is missing
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationPartitioner.java`
#### Snippet
```java
     * @param resolutionX
     * @param resolutionY
     * @param partitionX
     * @param partitionY
     * @param coordinateX
```

### JavadocDeclaration
`@param partitionY` tag description is missing
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationPartitioner.java`
#### Snippet
```java
     * @param resolutionY
     * @param partitionX
     * @param partitionY
     * @param coordinateX
     * @param coordinateY
```

### JavadocDeclaration
`@param coordinateX` tag description is missing
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationPartitioner.java`
#### Snippet
```java
     * @param partitionX
     * @param partitionY
     * @param coordinateX
     * @param coordinateY
     * @return
```

### JavadocDeclaration
`@param coordinateY` tag description is missing
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationPartitioner.java`
#### Snippet
```java
     * @param partitionY
     * @param coordinateX
     * @param coordinateY
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationPartitioner.java`
#### Snippet
```java
     * @param coordinateX
     * @param coordinateY
     * @return
     */
    public static Tuple2<Integer, Integer> Calculate2DPartitionId(int resolutionX, int resolutionY, int partitionX, int partitionY, int coordinateX, int coordinateY)
```

### JavadocDeclaration
`@param sc` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/WkbReader.java`
#### Snippet
```java
     * Read a SpatialRDD from a file.
     *
     * @param sc
     * @param inputPath
     * @param wkbColumn The column which contains the wkt string. Start from 0.
```

### JavadocDeclaration
`@param inputPath` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/WkbReader.java`
#### Snippet
```java
     *
     * @param sc
     * @param inputPath
     * @param wkbColumn The column which contains the wkt string. Start from 0.
     * @param allowInvalidGeometries whether allows topology-invalid geometries exist in the generated RDD
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/WkbReader.java`
#### Snippet
```java
     * @param allowInvalidGeometries whether allows topology-invalid geometries exist in the generated RDD
     * @param skipSyntacticallyInvalidGeometries whether allows Sedona to automatically skip syntax-invalid geometries, rather than throw errors
     * @return
     */
    public static SpatialRDD<Geometry> readToGeometryRDD(JavaSparkContext sc, String inputPath, int wkbColumn, boolean allowInvalidGeometries, boolean skipSyntacticallyInvalidGeometries)
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/WkbReader.java`
#### Snippet
```java
     * @param allowInvalidGeometries whether allows topology-invalid geometries exist in the generated RDD
     * @param skipSyntacticallyInvalidGeometries whether allows Sedona to automatically skip syntax-invalid geometries, rather than throw errors
     * @return
     */
    public static SpatialRDD<Geometry> readToGeometryRDD(JavaRDD rawTextRDD, int wkbColumn, boolean allowInvalidGeometries, boolean skipSyntacticallyInvalidGeometries)
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/GeoJsonReader.java`
#### Snippet
```java
     *
     * @param rawTextRDD a string type RDD
     * @return
     */
    public static SpatialRDD<Geometry> readToGeometryRDD(JavaRDD rawTextRDD)
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/GeoJsonReader.java`
#### Snippet
```java
     * @param allowInvalidGeometries whether allows topology-invalid geometries exist in the generated RDD
     * @param skipSyntacticallyInvalidGeometries whether allows Sedona to automatically skip syntax-invalid geometries, rather than throw errors
     * @return
     */
    public static SpatialRDD<Geometry> readToGeometryRDD(JavaRDD rawTextRDD, boolean allowInvalidGeometries, boolean skipSyntacticallyInvalidGeometries)
```

### JavadocDeclaration
`@param sc` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/GeoJsonReader.java`
#### Snippet
```java
     * Read a SpatialRDD from a file.
     *
     * @param sc
     * @param inputPath
     * @param allowInvalidGeometries whether allows topology-invalid geometries exist in the generated RDD
```

### JavadocDeclaration
`@param inputPath` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/GeoJsonReader.java`
#### Snippet
```java
     *
     * @param sc
     * @param inputPath
     * @param allowInvalidGeometries whether allows topology-invalid geometries exist in the generated RDD
     * @param skipSyntacticallyInvalidGeometries whether allows Sedona to automatically skip syntax-invalid geometries, rather than throw errors
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/GeoJsonReader.java`
#### Snippet
```java
     * @param allowInvalidGeometries whether allows topology-invalid geometries exist in the generated RDD
     * @param skipSyntacticallyInvalidGeometries whether allows Sedona to automatically skip syntax-invalid geometries, rather than throw errors
     * @return
     */
    public static SpatialRDD<Geometry> readToGeometryRDD(JavaSparkContext sc, String inputPath, boolean allowInvalidGeometries, boolean skipSyntacticallyInvalidGeometries)
```

### JavadocDeclaration
`@param sc` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/GeoJsonReader.java`
#### Snippet
```java
     * Read a SpatialRDD from a file.
     *
     * @param sc
     * @param inputPath
     * @return
```

### JavadocDeclaration
`@param inputPath` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/GeoJsonReader.java`
#### Snippet
```java
     *
     * @param sc
     * @param inputPath
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/GeoJsonReader.java`
#### Snippet
```java
     * @param sc
     * @param inputPath
     * @return
     */
    public static SpatialRDD<Geometry> readToGeometryRDD(JavaSparkContext sc, String inputPath)
```

### JavadocDeclaration
`@param sc` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/WktReader.java`
#### Snippet
```java
     * Read a SpatialRDD from a file.
     *
     * @param sc
     * @param inputPath
     * @param wktColumn The column which contains the wkt string. Start from 0.
```

### JavadocDeclaration
`@param inputPath` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/WktReader.java`
#### Snippet
```java
     *
     * @param sc
     * @param inputPath
     * @param wktColumn The column which contains the wkt string. Start from 0.
     * @param allowInvalidGeometries whether allows topology-invalid geometries exist in the generated RDD
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/WktReader.java`
#### Snippet
```java
     * @param allowInvalidGeometries whether allows topology-invalid geometries exist in the generated RDD
     * @param skipSyntacticallyInvalidGeometries whether allows Sedona to automatically skip syntax-invalid geometries, rather than throw errors
     * @return
     */
    public static SpatialRDD<Geometry> readToGeometryRDD(JavaSparkContext sc, String inputPath, int wktColumn, boolean allowInvalidGeometries, boolean skipSyntacticallyInvalidGeometries)
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/WktReader.java`
#### Snippet
```java
     * @param allowInvalidGeometries whether allows topology-invalid geometries exist in the generated RDD
     * @param skipSyntacticallyInvalidGeometries whether allows Sedona to automatically skip syntax-invalid geometries, rather than throw errors
     * @return
     */
    public static SpatialRDD<Geometry> readToGeometryRDD(JavaRDD rawTextRDD, int wktColumn, boolean allowInvalidGeometries, boolean skipSyntacticallyInvalidGeometries)
```

### JavadocDeclaration
`@param geometryType` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/FormatMapper.java`
#### Snippet
```java
     * @param splitter       the splitter
     * @param carryInputData the carry input data
     * @param geometryType
     */
    public FormatMapper(int startOffset, int endOffset, FileDataSplitter splitter, boolean carryInputData, GeometryType geometryType) {
```

### JavadocDeclaration
`@param splitter` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/FormatMapper.java`
#### Snippet
```java
     * Instantiates a new format mapper. This is extensively used in SedonaSQL.
     *
     * @param splitter
     * @param carryInputData
     */
```

### JavadocDeclaration
`@param carryInputData` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/FormatMapper.java`
#### Snippet
```java
     *
     * @param splitter
     * @param carryInputData
     */
    public FormatMapper(FileDataSplitter splitter, boolean carryInputData) {
```

### JavadocDeclaration
`@param splitter` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/FormatMapper.java`
#### Snippet
```java
     * This format mapper is used in SedonaSQL.
     *
     * @param splitter
     * @param carryInputData
     * @param geometryType
```

### JavadocDeclaration
`@param carryInputData` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/FormatMapper.java`
#### Snippet
```java
     *
     * @param splitter
     * @param carryInputData
     * @param geometryType
     */
```

### JavadocDeclaration
`@param geometryType` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/FormatMapper.java`
#### Snippet
```java
     * @param splitter
     * @param carryInputData
     * @param geometryType
     */
    public FormatMapper(FileDataSplitter splitter, boolean carryInputData, GeometryType geometryType) {
```

### JavadocDeclaration
`@param byteArray` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/shapes/ShpRecord.java`
#### Snippet
```java
     * create a ShpRecord with primitive bytes and shape type id we abstract from .shp file
     *
     * @param byteArray
     * @param shapeTypeID
     */
```

### JavadocDeclaration
`@param shapeTypeID` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/shapes/ShpRecord.java`
#### Snippet
```java
     *
     * @param byteArray
     * @param shapeTypeID
     */
    public ShpRecord(byte[] byteArray, int shapeTypeID)
```

### JavadocDeclaration
`@param context` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/boundary/BoundaryInputFormat.java`
#### Snippet
```java
     * enforce isSplitable to be false so that super.getSplits() combine all files as one split.
     *
     * @param context
     * @param file
     * @return
```

### JavadocDeclaration
`@param indexes` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/shapes/ShapeFileReader.java`
#### Snippet
```java
     * constructor with index
     *
     * @param indexes
     */
    public ShapeFileReader(int[] indexes)
```

### JavadocDeclaration
`@param file` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/boundary/BoundaryInputFormat.java`
#### Snippet
```java
     *
     * @param context
     * @param file
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/boundary/BoundaryInputFormat.java`
#### Snippet
```java
     * @param context
     * @param file
     * @return
     */
    @Override
```

### JavadocDeclaration
`@param job` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/boundary/BoundaryInputFormat.java`
#### Snippet
```java
     * get and combine all splits of .shp files
     *
     * @param job
     * @return
     * @throws IOException
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/boundary/BoundaryInputFormat.java`
#### Snippet
```java
     *
     * @param job
     * @return
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/boundary/BoundaryInputFormat.java`
#### Snippet
```java
     * @param job
     * @return
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param split` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/shapes/CombineShapeReader.java`
#### Snippet
```java
     * cut the combined split into FileSplit for .shp, .shx and .dbf
     *
     * @param split
     * @param context
     * @throws IOException
```

### JavadocDeclaration
`@param context` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/shapes/ShapeInputFormat.java`
#### Snippet
```java
     * enforce isSplitable() to return false so that every getSplits() only return one InputSplit
     *
     * @param context
     * @param file
     * @return
```

### JavadocDeclaration
`@param file` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/shapes/ShapeInputFormat.java`
#### Snippet
```java
     *
     * @param context
     * @param file
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/shapes/ShapeInputFormat.java`
#### Snippet
```java
     * @param context
     * @param file
     * @return
     */
    @Override
```

### JavadocDeclaration
`@param context` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/shapes/CombineShapeReader.java`
#### Snippet
```java
     *
     * @param split
     * @param context
     * @throws IOException
     * @throws InterruptedException
```

### JavadocDeclaration
`@throws` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/shapes/CombineShapeReader.java`
#### Snippet
```java
     * @param split
     * @param context
     * @throws IOException
     * @throws InterruptedException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/shapes/CombineShapeReader.java`
#### Snippet
```java
     * @param context
     * @throws IOException
     * @throws InterruptedException
     */
    public void initialize(InputSplit split, TaskAttemptContext context)
```

### JavadocDeclaration
`@param sc` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     * read shapefile in inputPath with customized GeometryFactory and return an RDD of Geometry.
     *
     * @param sc
     * @param inputPath
     * @param geometryFactory
```

### JavadocDeclaration
`@param inputPath` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     *
     * @param sc
     * @param inputPath
     * @param geometryFactory
     * @return
```

### JavadocDeclaration
`@param geometryFactory` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     * @param sc
     * @param inputPath
     * @param geometryFactory
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     * @param inputPath
     * @param geometryFactory
     * @return
     */
    public static SpatialRDD<Geometry> readToGeometryRDD(JavaSparkContext sc, String inputPath, final GeometryFactory geometryFactory)
```

### JavadocDeclaration
`@param sc` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     * read shapefile and return as an LineStringRDD
     *
     * @param sc
     * @param inputPath
     * @return
```

### JavadocDeclaration
`@param inputPath` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     *
     * @param sc
     * @param inputPath
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     * @param sc
     * @param inputPath
     * @return
     */
    public static LineStringRDD readToLineStringRDD(JavaSparkContext sc, String inputPath)
```

### JavadocDeclaration
`@param geometryRDD` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     * convert geometry rdd to
     *
     * @param geometryRDD
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     *
     * @param geometryRDD
     * @return
     */
    public static PointRDD geometryToPoint(SpatialRDD geometryRDD)
```

### JavadocDeclaration
`@param sc` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     * read shapefile with customized GeometryFactory and return as an PolygonRDD
     *
     * @param sc
     * @param inputPath
     * @param geometryFactory
```

### JavadocDeclaration
`@param inputPath` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     *
     * @param sc
     * @param inputPath
     * @param geometryFactory
     * @return
```

### JavadocDeclaration
`@param geometryFactory` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     * @param sc
     * @param inputPath
     * @param geometryFactory
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     * @param inputPath
     * @param geometryFactory
     * @return
     */
    public static PolygonRDD readToPolygonRDD(JavaSparkContext sc, String inputPath, final GeometryFactory geometryFactory)
```

### JavadocDeclaration
`@param sc` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     * read shapefile in inputPath with default GeometryFactory and return an RDD of Geometry.
     *
     * @param sc
     * @param inputPath
     * @return
```

### JavadocDeclaration
`@param inputPath` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     *
     * @param sc
     * @param inputPath
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     * @param sc
     * @param inputPath
     * @return
     */
    public static SpatialRDD<Geometry> readToGeometryRDD(JavaSparkContext sc, String inputPath)
```

### JavadocDeclaration
`@param geometryRDD` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     * convert geometry rdd to
     *
     * @param geometryRDD
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     *
     * @param geometryRDD
     * @return
     */
    public static LineStringRDD geometryToLineString(SpatialRDD geometryRDD)
```

### JavadocDeclaration
`@param sc` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     * read shapefile and return as an PointRDD
     *
     * @param sc
     * @param inputPath
     * @return
```

### JavadocDeclaration
`@param inputPath` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     *
     * @param sc
     * @param inputPath
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     * @param sc
     * @param inputPath
     * @return
     */
    public static PointRDD readToPointRDD(JavaSparkContext sc, String inputPath)
```

### JavadocDeclaration
`@param sc` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     * read shapefiles in inputPath and return an RDD of Geometry.
     *
     * @param sc
     * @param inputPath
     * @param geometryFactory
```

### JavadocDeclaration
`@param inputPath` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     *
     * @param sc
     * @param inputPath
     * @param geometryFactory
     * @return
```

### JavadocDeclaration
`@param geometryFactory` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     * @param sc
     * @param inputPath
     * @param geometryFactory
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     * @param inputPath
     * @param geometryFactory
     * @return
     */
    private static JavaRDD<Geometry> readShapefile(
```

### JavadocDeclaration
`@param sc` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     * read shapefile with customized GeometryFactory and return as an PointRDD
     *
     * @param sc
     * @param inputPath
     * @param geometryFactory
```

### JavadocDeclaration
`@param inputPath` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     *
     * @param sc
     * @param inputPath
     * @param geometryFactory
     * @return
```

### JavadocDeclaration
`@param geometryFactory` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     * @param sc
     * @param inputPath
     * @param geometryFactory
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     * @param inputPath
     * @param geometryFactory
     * @return
     */
    public static PointRDD readToPointRDD(JavaSparkContext sc, String inputPath, final GeometryFactory geometryFactory)
```

### JavadocDeclaration
`@param sc` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     * read shapefile with customized GeometryFactory and return as an LineStringRDD
     *
     * @param sc
     * @param inputPath
     * @param geometryFactory
```

### JavadocDeclaration
`@param inputPath` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     *
     * @param sc
     * @param inputPath
     * @param geometryFactory
     * @return
```

### JavadocDeclaration
`@param geometryFactory` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     * @param sc
     * @param inputPath
     * @param geometryFactory
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     * @param inputPath
     * @param geometryFactory
     * @return
     */
    public static LineStringRDD readToLineStringRDD(JavaSparkContext sc, String inputPath, final GeometryFactory geometryFactory)
```

### JavadocDeclaration
`@throws` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     * @param inputPath folder which contains shape file with dbf metadata file
     * @return List of Strings if dbf file was found; return null if no dbf file
     * @throws IOException
     */

```

### JavadocDeclaration
`@param geometryRDD` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     * convert geometry rdd to
     *
     * @param geometryRDD
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     *
     * @param geometryRDD
     * @return
     */
    public static PolygonRDD geometryToPolygon(SpatialRDD geometryRDD)
```

### JavadocDeclaration
`@param sc` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     * read shapefile and return as an PolygonRDD
     *
     * @param sc
     * @param inputPath
     * @return
```

### JavadocDeclaration
`@param inputPath` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     *
     * @param sc
     * @param inputPath
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/ShapefileReader.java`
#### Snippet
```java
     * @param sc
     * @param inputPath
     * @return
     */
    public static PolygonRDD readToPolygonRDD(JavaSparkContext sc, String inputPath)
```

### JavadocDeclaration
IOException is not declared to be thrown by method parseShape
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/shp/PolyLineParser.java`
#### Snippet
```java
     * @param reader the reader
     * @return the geometry
     * @throws IOException Signals that an I/O exception has occurred.
     */
    @Override
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/boundary/BoundBox.java`
#### Snippet
```java
     * convert bounds array to string
     *
     * @return
     */
    @Override
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/boundary/BoundBox.java`
#### Snippet
```java
     * return a copy of bounds
     *
     * @return
     */
    public double[] copyBounds()
```

### JavadocDeclaration
`@param otherbox` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/boundary/BoundBox.java`
#### Snippet
```java
     * construct by copy other boundbox
     *
     * @param otherbox
     */
    public BoundBox(BoundBox otherbox)
```

### JavadocDeclaration
`@param bounds` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/boundary/BoundBox.java`
#### Snippet
```java
     * construct bounds with an array
     *
     * @param bounds
     */
    public BoundBox(double[] bounds)
```

### JavadocDeclaration
`@param context` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/fieldname/FieldnameInputFormat.java`
#### Snippet
```java
     * enforce isSplitable to be false so that super.getSplits() combine all files as one split.
     *
     * @param context
     * @param file
     * @return
```

### JavadocDeclaration
`@param i` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/boundary/BoundBox.java`
#### Snippet
```java
     * set tuple at i with value
     *
     * @param i
     * @param value
     */
```

### JavadocDeclaration
`@param file` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/fieldname/FieldnameInputFormat.java`
#### Snippet
```java
     *
     * @param context
     * @param file
     * @return
     */
```

### JavadocDeclaration
`@param value` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/boundary/BoundBox.java`
#### Snippet
```java
     *
     * @param i
     * @param value
     */
    public void set(int i, double value)
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/fieldname/FieldnameInputFormat.java`
#### Snippet
```java
     * @param context
     * @param file
     * @return
     */
    @Override
```

### JavadocDeclaration
`@param box1` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/boundary/BoundBox.java`
#### Snippet
```java
     * calculate the union of two bound box
     *
     * @param box1
     * @param box2
     * @return
```

### JavadocDeclaration
`@param job` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/fieldname/FieldnameInputFormat.java`
#### Snippet
```java
     * get and combine all splits of .shp files
     *
     * @param job
     * @return
     * @throws IOException
```

### JavadocDeclaration
`@param box2` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/boundary/BoundBox.java`
#### Snippet
```java
     *
     * @param box1
     * @param box2
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/boundary/BoundBox.java`
#### Snippet
```java
     * @param box1
     * @param box2
     * @return
     */
    public static BoundBox mergeBoundBox(BoundBox box1, BoundBox box2)
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/fieldname/FieldnameInputFormat.java`
#### Snippet
```java
     *
     * @param job
     * @return
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/fieldname/FieldnameInputFormat.java`
#### Snippet
```java
     * @param job
     * @return
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param inputStream` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/shp/ShpFileParser.java`
#### Snippet
```java
     * create a new shape file parser with a input source that is instance of DataInputStream
     *
     * @param inputStream
     */
    public ShpFileParser(FSDataInputStream inputStream)
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/shp/ShpFileParser.java`
#### Snippet
```java
     * abstract id number from record header
     *
     * @return
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/shp/ShpFileParser.java`
#### Snippet
```java
     *
     * @return
     * @throws IOException
     */
    public int parseRecordHeadID()
```

### JavadocDeclaration
`@throws` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/shp/ShpFileParser.java`
#### Snippet
```java
     * extract and validate information from .shp file header
     *
     * @throws IOException
     */
    public void parseShapeFileHead()
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/shp/ShpFileParser.java`
#### Snippet
```java
     * abstract information from record header and then copy primitive bytes data of record to a primitive record.
     *
     * @return
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/shp/ShpFileParser.java`
#### Snippet
```java
     *
     * @return
     * @throws IOException
     */
    public ShpRecord parseRecordPrimitiveContent(int length)
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/shp/ShpFileParser.java`
#### Snippet
```java
     * get current progress of parsing records.
     *
     * @return
     */
    public float getProgress()
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/shp/ShpFileParser.java`
#### Snippet
```java
     * abstract information from record header and then copy primitive bytes data of record to a primitive record.
     *
     * @return
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/shp/ShpFileParser.java`
#### Snippet
```java
     *
     * @return
     * @throws IOException
     */
    public ShpRecord parseRecordPrimitiveContent()
```

### JavadocDeclaration
IOException is not declared to be thrown by method parseShape
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/shp/ShapeParser.java`
#### Snippet
```java
     * @param reader the reader
     * @return the geometry
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public abstract Geometry parseShape(ShapeReader reader);
```

### JavadocDeclaration
IOException is not declared to be thrown by method readCoordinates
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/shp/ShapeParser.java`
#### Snippet
```java
     * @param numPoints the num points
     * @return the coordinate sequence
     * @throws IOException Signals that an I/O exception has occurred.
     */
    protected CoordinateSequence readCoordinates(ShapeReader reader, int numPoints)
```

### JavadocDeclaration
IOException is not declared to be thrown by method parseShape
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/shp/MultiPointParser.java`
#### Snippet
```java
     * @param reader the reader
     * @return the geometry
     * @throws IOException Signals that an I/O exception has occurred.
     */
    @Override
```

### JavadocDeclaration
Tag `return` is not allowed here
in `core/src/main/java/org/apache/sedona/core/spatialRDD/SpatialRDD.java`
#### Snippet
```java
     *
     * @param gridType the grid type
     * @return true, if successful
     * @throws Exception the exception
     */
```

### JavadocDeclaration
IOException is not declared to be thrown by method parseShape
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/shp/PointParser.java`
#### Snippet
```java
     * @param reader the reader
     * @return the geometry
     * @throws IOException Signals that an I/O exception has occurred.
     */
    @Override
```

### JavadocDeclaration
IOException is not declared to be thrown by method parseShape
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/shp/PolygonParser.java`
#### Snippet
```java
     * @param reader the reader
     * @return the geometry
     * @throws IOException Signals that an I/O exception has occurred.
     */
    @Override
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/shp/ShapeType.java`
#### Snippet
```java
    /**
     * return whether the shape type is supported by Sedona
     * @return
     */
    public boolean isSupported()
```

### JavadocDeclaration
`@param buffer` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/dbf/DbfParseUtil.java`
#### Snippet
```java
     * abstract attributes from primitive bytes according to field descriptors.
     *
     * @param buffer
     * @return
     * @throws IOException
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/dbf/DbfParseUtil.java`
#### Snippet
```java
     *
     * @param buffer
     * @return
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/dbf/DbfParseUtil.java`
#### Snippet
```java
     * @param buffer
     * @return
     * @throws IOException
     */
    public String primitiveToAttributes(ByteBuffer buffer)
```

### JavadocDeclaration
`@param inputStream` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/dbf/DbfParseUtil.java`
#### Snippet
```java
     * parse header of .dbf file and draw information for next step
     *
     * @param inputStream
     * @return
     * @throws IOException
```

### JavadocDeclaration
Tag `return` is not allowed here
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/dbf/DbfParseUtil.java`
#### Snippet
```java
     *
     * @param inputStream
     * @return
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/dbf/DbfParseUtil.java`
#### Snippet
```java
     * @param inputStream
     * @return
     * @throws IOException
     */
    public void parseFileHead(DataInputStream inputStream)
```

### JavadocDeclaration
`@param inputStream` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/dbf/DbfParseUtil.java`
#### Snippet
```java
     * draw raw byte array of effective record
     *
     * @param inputStream
     * @return
     * @throws IOException
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/dbf/DbfParseUtil.java`
#### Snippet
```java
     *
     * @param inputStream
     * @return
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/dbf/DbfParseUtil.java`
#### Snippet
```java
     * @param inputStream
     * @return
     * @throws IOException
     */
    public String parsePrimitiveRecord(DataInputStream inputStream)
```

### JavadocDeclaration
`@param inputStream` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/dbf/DbfParseUtil.java`
#### Snippet
```java
     * abstract attributes from primitive bytes according to field descriptors.
     *
     * @param inputStream
     * @return
     * @throws IOException
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/dbf/DbfParseUtil.java`
#### Snippet
```java
     *
     * @param inputStream
     * @return
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/dbf/DbfParseUtil.java`
#### Snippet
```java
     * @param inputStream
     * @return
     * @throws IOException
     */
    public String primitiveToAttributes(DataInputStream inputStream)
```

### JavadocDeclaration
`@param bytes` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/dbf/DbfParseUtil.java`
#### Snippet
```java
     * is represented with one byte per char
     *
     * @param bytes
     * @param fieldOffset
     * @param fieldLen
```

### JavadocDeclaration
`@param fieldOffset` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/dbf/DbfParseUtil.java`
#### Snippet
```java
     *
     * @param bytes
     * @param fieldOffset
     * @param fieldLen
     * @return
```

### JavadocDeclaration
`@param fieldLen` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/dbf/DbfParseUtil.java`
#### Snippet
```java
     * @param bytes
     * @param fieldOffset
     * @param fieldLen
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/dbf/DbfParseUtil.java`
#### Snippet
```java
     * @param fieldOffset
     * @param fieldLen
     * @return
     */
    private static String fastParse(final byte[] bytes, final int fieldOffset, final int fieldLen)
```

### JavadocDeclaration
`@param boundaryEnvelope` tag description is missing
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/PartitioningUtils.java`
#### Snippet
```java
    /**
     * If the user only provides boundary and numPartitions, use equal grids.
     * @param boundaryEnvelope
     * @param resolution
     * @return
```

### JavadocDeclaration
`@param resolution` tag description is missing
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/PartitioningUtils.java`
#### Snippet
```java
     * If the user only provides boundary and numPartitions, use equal grids.
     * @param boundaryEnvelope
     * @param resolution
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/PartitioningUtils.java`
#### Snippet
```java
     * @param boundaryEnvelope
     * @param resolution
     * @return
     */
    public static PartitioningUtils getPartitioner(Envelope boundaryEnvelope, int resolution) {
```

### JavadocDeclaration
`@param stRtree` tag description is missing
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/RtreePartitioning.java`
#### Snippet
```java
     * This function traverses the boundaries of all leaf nodes.
     * This function should be called after all insertions.
     * @param stRtree
     * @return The list of leaf nodes boundaries
     */
```

### JavadocDeclaration
`@param x` tag description is missing
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/quadtree/StandardQuadTree.java`
#### Snippet
```java
     * Find the zone that fully contains this query point
     *
     * @param x
     * @param y
     * @return
```

### JavadocDeclaration
`@param y` tag description is missing
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/quadtree/StandardQuadTree.java`
#### Snippet
```java
     *
     * @param x
     * @param y
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/quadtree/StandardQuadTree.java`
#### Snippet
```java
     * @param x
     * @param y
     * @return
     */
    public QuadRectangle getZone(int x, int y)
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `geometryFactory` may be 'final'
in `common/src/main/java/org/apache/sedona/common/utils/GeometryGeoHashEncoder.java`
#### Snippet
```java

public class GeometryGeoHashEncoder {
  private static GeometryFactory geometryFactory = new GeometryFactory();

  public static String calculate(Geometry geom, int precision) {
```

### FieldMayBeFinal
Field `base32` may be 'final'
in `common/src/main/java/org/apache/sedona/common/utils/PointGeoHashEncoder.java`
#### Snippet
```java

public class PointGeoHashEncoder {
    private static String base32 = "0123456789bcdefghjkmnpqrstuvwxyz";
    private static int[] bits = new int[] { 16, 8, 4, 2, 1 };

```

### FieldMayBeFinal
Field `bits` may be 'final'
in `common/src/main/java/org/apache/sedona/common/utils/PointGeoHashEncoder.java`
#### Snippet
```java
public class PointGeoHashEncoder {
    private static String base32 = "0123456789bcdefghjkmnpqrstuvwxyz";
    private static int[] bits = new int[] { 16, 8, 4, 2, 1 };

    public static String calculateGeoHash(Point geom, long precision) {
```

### FieldMayBeFinal
Field `split` may be 'final'
in `common/src/main/java/org/apache/sedona/common/simplify/CoordinateSplitter.java`
#### Snippet
```java
        private Coordinate[] geom;

        private int split;

        public SplitInPlace(Coordinate[] geom, int split) {
```

### FieldMayBeFinal
Field `geom` may be 'final'
in `common/src/main/java/org/apache/sedona/common/simplify/CoordinateSplitter.java`
#### Snippet
```java

    public static class SplitInPlace {
        private Coordinate[] geom;

        private int split;
```

### FieldMayBeFinal
Field `geometryFactory` may be 'final'
in `common/src/main/java/org/apache/sedona/common/subDivide/PivotFinder.java`
#### Snippet
```java
    private static final double DBL_MAX = Double.MAX_VALUE;

    private static GeometryFactory geometryFactory = new GeometryFactory();

    public static double findPivot(
```

### FieldMayBeFinal
Field `subBox2` may be 'final'
in `common/src/main/java/org/apache/sedona/common/subDivide/SubBoxes.java`
#### Snippet
```java
    private SubDivideExtent subBox;

    private SubDivideExtent subBox2;

    public SubBoxes(SubDivideExtent subBox, SubDivideExtent subBox2) {
```

### FieldMayBeFinal
Field `subBox` may be 'final'
in `common/src/main/java/org/apache/sedona/common/subDivide/SubBoxes.java`
#### Snippet
```java

public class SubBoxes {
    private SubDivideExtent subBox;

    private SubDivideExtent subBox2;
```

### FieldMayBeFinal
Field `geometryFactory` may be 'final'
in `common/src/main/java/org/apache/sedona/common/subDivide/GeometrySubDivider.java`
#### Snippet
```java

public class GeometrySubDivider {
    private static GeometryFactory geometryFactory = new GeometryFactory();

    private static final double FP_TOLERANCE = 1e-12;
```

### FieldMayBeFinal
Field `EMPTY_POLYGON` may be 'final'
in `common/src/main/java/org/apache/sedona/common/Functions.java`
#### Snippet
```java
public class Functions {
    private static final GeometryFactory GEOMETRY_FACTORY = new GeometryFactory();
    private static Geometry EMPTY_POLYGON = GEOMETRY_FACTORY.createPolygon(null, null);
    private static GeometryCollection EMPTY_GEOMETRY_COLLECTION = GEOMETRY_FACTORY.createGeometryCollection(null);
    private static final double DEFAULT_TOLERANCE = 1e-6;
```

### FieldMayBeFinal
Field `EMPTY_GEOMETRY_COLLECTION` may be 'final'
in `common/src/main/java/org/apache/sedona/common/Functions.java`
#### Snippet
```java
    private static final GeometryFactory GEOMETRY_FACTORY = new GeometryFactory();
    private static Geometry EMPTY_POLYGON = GEOMETRY_FACTORY.createPolygon(null, null);
    private static GeometryCollection EMPTY_GEOMETRY_COLLECTION = GEOMETRY_FACTORY.createGeometryCollection(null);
    private static final double DEFAULT_TOLERANCE = 1e-6;
    private static final int DEFAULT_MAX_ITER = 1000;
```

### FieldMayBeFinal
Field `autoBroadcastJoinThreshold` may be 'final'
in `core/src/main/java/org/apache/sedona/core/utils/SedonaConf.java`
#### Snippet
```java
    private GridType joinGridType;

    private long autoBroadcastJoinThreshold;

    private SpatialJoinOptimizationMode spatialJoinOptimizationMode;
```

### FieldMayBeFinal
Field `joinSparitionDominantSide` may be 'final'
in `core/src/main/java/org/apache/sedona/core/utils/SedonaConf.java`
#### Snippet
```java
    // Parameters for JoinQuery including RangeJoin and DistanceJoin

    private JoinSparitionDominantSide joinSparitionDominantSide;

    private JoinBuildSide joinBuildSide;
```

### FieldMayBeFinal
Field `indexType` may be 'final'
in `core/src/main/java/org/apache/sedona/core/utils/SedonaConf.java`
#### Snippet
```java
    private boolean useIndex;

    private IndexType indexType;

    // Parameters for JoinQuery including RangeJoin and DistanceJoin
```

### FieldMayBeFinal
Field `spatialJoinOptimizationMode` may be 'final'
in `core/src/main/java/org/apache/sedona/core/utils/SedonaConf.java`
#### Snippet
```java
    private long autoBroadcastJoinThreshold;

    private SpatialJoinOptimizationMode spatialJoinOptimizationMode;

    public static SedonaConf fromActiveSession() {
```

### FieldMayBeFinal
Field `joinGridType` may be 'final'
in `core/src/main/java/org/apache/sedona/core/utils/SedonaConf.java`
#### Snippet
```java
    private int fallbackPartitionNum;

    private GridType joinGridType;

    private long autoBroadcastJoinThreshold;
```

### FieldMayBeFinal
Field `fallbackPartitionNum` may be 'final'
in `core/src/main/java/org/apache/sedona/core/utils/SedonaConf.java`
#### Snippet
```java
    private Envelope datasetBoundary;

    private int fallbackPartitionNum;

    private GridType joinGridType;
```

### FieldMayBeFinal
Field `joinBuildSide` may be 'final'
in `core/src/main/java/org/apache/sedona/core/utils/SedonaConf.java`
#### Snippet
```java
    private JoinSparitionDominantSide joinSparitionDominantSide;

    private JoinBuildSide joinBuildSide;

    private long joinApproximateTotalCount;
```

### FieldMayBeFinal
Field `joinApproximateTotalCount` may be 'final'
in `core/src/main/java/org/apache/sedona/core/utils/SedonaConf.java`
#### Snippet
```java
    private JoinBuildSide joinBuildSide;

    private long joinApproximateTotalCount;

    private Envelope datasetBoundary;
```

### FieldMayBeFinal
Field `useIndex` may be 'final'
in `core/src/main/java/org/apache/sedona/core/utils/SedonaConf.java`
#### Snippet
```java
    // Global parameters of Sedona. All these parameters can be initialized through SparkConf.

    private boolean useIndex;

    private IndexType indexType;
```

### FieldMayBeFinal
Field `datasetBoundary` may be 'final'
in `core/src/main/java/org/apache/sedona/core/utils/SedonaConf.java`
#### Snippet
```java
    private long joinApproximateTotalCount;

    private Envelope datasetBoundary;

    private int fallbackPartitionNum;
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `result` is redundant
in `common/src/main/java/org/apache/sedona/common/utils/GeometrySplitter.java`
#### Snippet
```java
        }

        MultiLineString result = (MultiLineString)ensureMultiGeometryOfDimensionN(lineBuilder.getGeometry(), 1);

        return result;
```

### UnnecessaryLocalVariable
Local variable `res` is redundant
in `common/src/main/java/org/apache/sedona/common/subDivide/GeometrySubDivider.java`
#### Snippet
```java
        );
        Geometry intersected = geom.intersection(JTS.toGeometry(subBox));
        Geometry res = GeometrySimplifier.simplify(intersected, true, 0.0);
        return res;
    }
```

### UnnecessaryLocalVariable
Local variable `index` is redundant
in `common/src/main/java/org/locationtech/jts/index/strtree/IndexSerde.java`
#### Snippet
```java
            if (built) {
                // if built, root is not null, set itemBoundables to null
                STRtree index = new STRtree(nodeCapacity, readSTRtreeNode(kryo, input));
                return index;
            }
```

### UnnecessaryLocalVariable
Local variable `index` is redundant
in `common/src/main/java/org/locationtech/jts/index/strtree/IndexSerde.java`
#### Snippet
```java
                    itemBoundables.add(readItemBoundable(kryo, input));
                }
                STRtree index = new STRtree(nodeCapacity, itemBoundables);
                return index;
            }
```

### UnnecessaryLocalVariable
Local variable `subLine` is redundant
in `common/src/main/java/org/apache/sedona/common/Functions.java`
#### Snippet
```java
        double length = geom.getLength();
        LengthIndexedLine indexedLine = new LengthIndexedLine(geom);
        Geometry subLine = indexedLine.extractLine(length * fromFraction, length * toFraction);
        return subLine;
    }
```

### UnnecessaryLocalVariable
Local variable `cloneCircle` is redundant
in `common/src/main/java/org/apache/sedona/common/geometryObjects/Circle.java`
#### Snippet
```java
    public Geometry copy()
    {
        Circle cloneCircle = new Circle(this.centerGeometry.copy(), this.radius);
        return cloneCircle;// return the clone
    }
```

### UnnecessaryLocalVariable
Local variable `newCircle` is redundant
in `common/src/main/java/org/apache/sedona/common/geometryObjects/Circle.java`
#### Snippet
```java
    {
        Geometry g = this.centerGeometry.reverse();
        Circle newCircle = new Circle(g, this.radius);
        return newCircle;
    }
```

### UnnecessaryLocalVariable
Local variable `cloneCircle` is redundant
in `common/src/main/java/org/apache/sedona/common/geometryObjects/Circle.java`
#### Snippet
```java
    protected Geometry copyInternal()
    {
        Circle cloneCircle = new Circle(this.centerGeometry.copy(), this.radius);
        return cloneCircle;
    }
```

### UnnecessaryLocalVariable
Local variable `newCircle` is redundant
in `common/src/main/java/org/apache/sedona/common/geometryObjects/Circle.java`
#### Snippet
```java
    {
        Geometry g = this.centerGeometry.reverse();
        Circle newCircle = new Circle(g, this.radius);
        return newCircle;
    }
```

### UnnecessaryLocalVariable
Local variable `pixel` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/Serde/PixelSerializer.java`
#### Snippet
```java
        boolean isDuplicate = input.readBoolean();
        int currentPartitionId = input.readInt();
        Pixel pixel = new Pixel(X, Y, ResolutionX, ResolutionY, isDuplicate, currentPartitionId);
        return pixel;
    }
```

### UnnecessaryLocalVariable
Local variable `globalParameter` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/GlobalParameter.java`
#### Snippet
```java
    public static GlobalParameter getGlobalParameter()
    {
        GlobalParameter globalParameter = new GlobalParameter(0, 0, false, true, 0,
                0, new GaussianBlur(3), 0.01, -1, new LinearFunction(), Color.GREEN, false, 255, new Envelope(-20026376.39, 20026376.39, -20048966.10, 20048966.10), 9, true);
        return globalParameter;
```

### UnnecessaryLocalVariable
Local variable `pixelColor` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationOperator.java`
#### Snippet
```java
                }
                Double normalizedPixelCount = (currentPixelCount - minWeight) * 255 / (maxWeight - minWeight);
                Integer pixelColor = EncodeToRGB(normalizedPixelCount.intValue());
                return pixelColor;
            }
```

### UnnecessaryLocalVariable
Local variable `newPixelDoubleTuple2` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationOperator.java`
#### Snippet
```java
                newPixel.setDuplicate(false);
                newPixel.setCurrentPartitionId(VisualizationPartitioner.CalculatePartitionId(resolutionX, resolutionY, partitionX, partitionY, (int) pixelDoubleTuple2._1.getX(), (int) pixelDoubleTuple2._1.getY()));
                Tuple2<Pixel, Integer> newPixelDoubleTuple2 = new Tuple2<Pixel, Integer>(newPixel, pixelDoubleTuple2._2());
                return newPixelDoubleTuple2;
            }
```

### UnnecessaryLocalVariable
Local variable `image` is redundant
in `viz/src/main/java/org/apache/sedona/viz/core/BigBufferedImage.java`
#### Snippet
```java
        }
        SimpleRaster raster = new SimpleRaster(sampleModel, buffer, new Point(0, 0));
        BigBufferedImage image = new BigBufferedImage(colorModel, raster, colorModel.isAlphaPremultiplied(), null);
        return image;
    }
```

### UnnecessaryLocalVariable
Local variable `arrayResult` is redundant
in `viz/src/main/java/org/apache/sedona/viz/utils/RasterizationUtils.java`
#### Snippet
```java
            result.add(new Coordinate(pixelCoordinate._1(), pixelCoordinate._2()));
        }
        Coordinate[] arrayResult = result.toArray(new Coordinate[result.size()]);
        return arrayResult;
    }
```

### UnnecessaryLocalVariable
Local variable `x` is redundant
in `viz/src/main/java/org/apache/sedona/viz/utils/RasterizationUtils.java`
#### Snippet
```java
    public static int GetWidthFromHeight(int y, Envelope boundary)
    {
        int x = (int) (y * (boundary.getWidth() / boundary.getHeight()));
        return x;
    }
```

### UnnecessaryLocalVariable
Local variable `n` is redundant
in `core/src/main/java/org/apache/sedona/core/formatMapper/netcdfParser/HDFSRandomAccessFile.java`
#### Snippet
```java
            throws IOException
    {
        int n = hfile.read(pos, b, offset, len);
        return n;
    }
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `core/src/main/java/org/apache/sedona/core/spatialRDD/PolygonRDD.java`
#### Snippet
```java
    public Polygon PolygonUnion()
    {
        Polygon result = this.rawSpatialRDD.reduce(new Function2<Polygon, Polygon, Polygon>()
        {
            public Polygon call(Polygon v1, Polygon v2)
```

### UnnecessaryLocalVariable
Local variable `polygon` is redundant
in `core/src/main/java/org/apache/sedona/core/spatialRDD/PolygonRDD.java`
#### Snippet
```java
                GeometryFactory fact = new GeometryFactory();
                LinearRing linear = new GeometryFactory().createLinearRing(coordinatesClosed);
                Polygon polygon = new Polygon(linear, null, fact);
                //Return the two polygon union result
                return polygon;
```

### UnnecessaryLocalVariable
Local variable `multiPoint` is redundant
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/shp/MultiPointParser.java`
#### Snippet
```java
        int numPoints = reader.readInt();
        CoordinateSequence coordinateSequence = readCoordinates(reader, numPoints);
        MultiPoint multiPoint = geometryFactory.createMultiPoint(coordinateSequence);
        return multiPoint;
    }
```

### UnnecessaryLocalVariable
Local variable `polygonObject` is redundant
in `core/src/main/java/org/apache/sedona/core/spatialRDD/SpatialRDD.java`
#### Snippet
```java
                coordinates[4] = coordinates[0];
                linear = fact.createLinearRing(coordinates);
                Polygon polygonObject = new Polygon(linear, null, fact);
                return polygonObject;
            }
```

### UnnecessaryLocalVariable
Local variable `point` is redundant
in `core/src/main/java/org/apache/sedona/core/formatMapper/shapefileParser/parseUtils/shp/PointParser.java`
#### Snippet
```java
        double x = reader.readDouble();
        double y = reader.readDouble();
        Point point = geometryFactory.createPoint(new Coordinate(x, y));
        return point;
    }
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `core/src/main/java/org/apache/sedona/core/spatialOperator/KNNQuery.java`
#### Snippet
```java
            }
            JavaRDD<T> tmp = spatialRDD.indexedRawRDD.mapPartitions(new KnnJudgementUsingIndex(queryCenter, k));
            List<T> result = tmp.takeOrdered(k, new GeometryDistanceComparator(queryCenter, true));
            // Take the top k
            return result;
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `core/src/main/java/org/apache/sedona/core/spatialOperator/KNNQuery.java`
#### Snippet
```java
        else {
            JavaRDD<T> tmp = spatialRDD.getRawSpatialRDD().mapPartitions(new KnnJudgement(queryCenter, k));
            List<T> result = tmp.takeOrdered(k, new GeometryDistanceComparator(queryCenter, true));
            // Take the top k
            return result;
```

### UnnecessaryLocalVariable
Local variable `maxLevel` is redundant
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/QuadtreePartitioning.java`
#### Snippet
```java
    {
        // Make sure the tree doesn't get too deep in case of data skew
        int maxLevel = partitions;
        int maxItemsPerNode = samples.size() / partitions;
        partitionTree = new StandardQuadTree(new QuadRectangle(boundary), 0,
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `common/src/main/java/org/apache/sedona/common/utils/GeometrySplitter.java`
#### Snippet
```java
        // coords are ordered from left to right, bottom to top
        Arrays.sort(pointCoords);
        coordsDeque.addAll(Arrays.asList(pointCoords));

        return coordsDeque;
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `common/src/main/java/org/apache/sedona/common/subDivide/GeometrySubDivider.java`
#### Snippet
```java
            for (int i = 0; i < geometryCollection.getNumGeometries(); i++) {
                dividedGeoms.addAll(
                        Arrays.asList(
                                subDivideRecursive(
                                        geometryCollection.getGeometryN(i),
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `common/src/main/java/org/apache/sedona/common/Functions.java`
#### Snippet
```java
    public static Geometry createMultiGeometry(Geometry[] geometries) {
        if (geometries.length > 1){
            return GEOMETRY_FACTORY.buildGeometry(Arrays.asList(geometries));
        }
        else if(geometries.length==1){
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `core/src/main/java/org/apache/sedona/core/spatialRDD/PolygonRDD.java`
#### Snippet
```java
                Geometry polygonGeom = p1.union(p2);
                Coordinate[] coordinates = polygonGeom.getCoordinates();
                ArrayList<Coordinate> coordinateList = new ArrayList<Coordinate>(Arrays.asList(coordinates));
                Coordinate lastCoordinate = coordinateList.get(0);
                coordinateList.add(lastCoordinate);
```

## RuleId[id=IntegerDivisionInFloatingPointContext]
### IntegerDivisionInFloatingPointContext
`resolutionX / partitionOnX`: integer division in floating-point context
in `viz/src/main/java/org/apache/sedona/viz/core/ImageStitcher.java`
#### Snippet
```java
            }
            Tuple2<Integer, Integer> partitionCoordinate = RasterizationUtils.Decode1DTo2DId(partitionOnX, partitionOnY, i);
            int partitionMinX = partitionCoordinate._1 * Math.round(resolutionX / partitionOnX);
            int partitionMinY = partitionCoordinate._2 * Math.round(resolutionY / partitionOnY);
            //if(partitionMinX!=0){partitionMinX--;}
```

### IntegerDivisionInFloatingPointContext
`resolutionY / partitionOnY`: integer division in floating-point context
in `viz/src/main/java/org/apache/sedona/viz/core/ImageStitcher.java`
#### Snippet
```java
            Tuple2<Integer, Integer> partitionCoordinate = RasterizationUtils.Decode1DTo2DId(partitionOnX, partitionOnY, i);
            int partitionMinX = partitionCoordinate._1 * Math.round(resolutionX / partitionOnX);
            int partitionMinY = partitionCoordinate._2 * Math.round(resolutionY / partitionOnY);
            //if(partitionMinX!=0){partitionMinX--;}
            //if(partitionMinY!=0){partitionMinY--;}
```

### IntegerDivisionInFloatingPointContext
`resolutionX / partitionOnX`: integer division in floating-point context
in `viz/src/main/java/org/apache/sedona/viz/core/ImageStitcher.java`
#### Snippet
```java
            }
            Tuple2<Integer, Integer> partitionCoordinate = RasterizationUtils.Decode1DTo2DId(partitionOnX, partitionOnY, i);
            int partitionMinX = partitionCoordinate._1 * Math.round(resolutionX / partitionOnX);
            int partitionMinY = partitionCoordinate._2 * Math.round(resolutionY / partitionOnY);
            //if(partitionMinX!=0){partitionMinX--;}
```

### IntegerDivisionInFloatingPointContext
`resolutionY / partitionOnY`: integer division in floating-point context
in `viz/src/main/java/org/apache/sedona/viz/core/ImageStitcher.java`
#### Snippet
```java
            Tuple2<Integer, Integer> partitionCoordinate = RasterizationUtils.Decode1DTo2DId(partitionOnX, partitionOnY, i);
            int partitionMinX = partitionCoordinate._1 * Math.round(resolutionX / partitionOnX);
            int partitionMinY = partitionCoordinate._2 * Math.round(resolutionY / partitionOnY);
            //if(partitionMinX!=0){partitionMinX--;}
            //if(partitionMinY!=0){partitionMinY--;}
```

### IntegerDivisionInFloatingPointContext
`resolutionX / partitionOnX`: integer division in floating-point context
in `viz/src/main/java/org/apache/sedona/viz/core/ImageStitcher.java`
#### Snippet
```java
            }
            Tuple2<Integer, Integer> partitionCoordinate = RasterizationUtils.Decode1DTo2DId(partitionOnX, partitionOnY, i);
            int partitionMinX = partitionCoordinate._1 * Math.round(resolutionX / partitionOnX);
            int partitionMinY = partitionCoordinate._2 * Math.round(resolutionY / partitionOnY);
            //if(partitionMinX!=0){partitionMinX--;}
```

### IntegerDivisionInFloatingPointContext
`resolutionY / partitionOnY`: integer division in floating-point context
in `viz/src/main/java/org/apache/sedona/viz/core/ImageStitcher.java`
#### Snippet
```java
            Tuple2<Integer, Integer> partitionCoordinate = RasterizationUtils.Decode1DTo2DId(partitionOnX, partitionOnY, i);
            int partitionMinX = partitionCoordinate._1 * Math.round(resolutionX / partitionOnX);
            int partitionMinY = partitionCoordinate._2 * Math.round(resolutionY / partitionOnY);
            //if(partitionMinX!=0){partitionMinX--;}
            //if(partitionMinY!=0){partitionMinY--;}
```

### IntegerDivisionInFloatingPointContext
`items.size() / 2`: integer division in floating-point context
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/KDB.java`
#### Snippet
```java
        final Envelope[] splits;
        final Splitter splitter;
        Envelope middleItem = items.get((int) Math.floor(items.size() / 2));
        if (splitX) {
            double x = middleItem.getMinX();
```

## RuleId[id=PointlessBooleanExpression]
### PointlessBooleanExpression
`skipSyntacticallyInvalidGeometries == false` can be simplified to '!skipSyntacticallyInvalidGeometries'
in `common/src/main/java/org/apache/sedona/common/utils/FormatUtils.java`
#### Snippet
```java
        catch (Exception e) {
            logger.error("[Sedona] " + e.getMessage());
            if (skipSyntacticallyInvalidGeometries == false) {
                throw e;
            }
```

### PointlessBooleanExpression
`allowTopologicallyInvalidGeometries == false` can be simplified to '!allowTopologicallyInvalidGeometries'
in `common/src/main/java/org/apache/sedona/common/utils/FormatUtils.java`
#### Snippet
```java
            return null;
        }
        if (allowTopologicallyInvalidGeometries == false) {
            IsValidOp isvalidop = new IsValidOp(geometry);
            if (isvalidop.isValid() == false) {
```

### PointlessBooleanExpression
`this.generateDistributedImage == false` can be simplified to '!this.generateDistributedImage'
in `viz/src/main/java/org/apache/sedona/viz/core/VectorOverlayOperator.java`
#### Snippet
```java
    {
        logger.info("[Sedona-Viz][JoinImage][Start]");
        if (this.generateDistributedImage == false) {
            throw new Exception("[OverlayOperator][JoinImage] The back image is not distributed. Please don't use distributed format.");
        }
```

### PointlessBooleanExpression
`this.generateDistributedImage == true` can be simplified to 'this.generateDistributedImage'
in `viz/src/main/java/org/apache/sedona/viz/core/VectorOverlayOperator.java`
#### Snippet
```java
    {
        logger.info("[Sedona-VizViz][JoinImage][Start]");
        if (this.generateDistributedImage == true) {
            throw new Exception("[OverlayOperator][JoinImage] The back image is distributed. Please don't use centralized format.");
        }
```

### PointlessBooleanExpression
`this.generateDistributedImage == true` can be simplified to 'this.generateDistributedImage'
in `viz/src/main/java/org/apache/sedona/viz/core/RasterOverlayOperator.java`
#### Snippet
```java
            throws Exception
    {
        if (this.generateDistributedImage == true) {
            throw new Exception("[OverlayOperator][JoinImage] The back image is distributed. Please don't use centralized format.");
        }
```

### PointlessBooleanExpression
`this.generateDistributedImage == false` can be simplified to '!this.generateDistributedImage'
in `viz/src/main/java/org/apache/sedona/viz/core/RasterOverlayOperator.java`
#### Snippet
```java
    {
        logger.info("[Sedona-Viz][JoinImage][Start]");
        if (this.generateDistributedImage == false) {
            throw new Exception("[OverlayOperator][JoinImage] The back image is not distributed. Please don't use distributed format.");
        }
```

### PointlessBooleanExpression
`backImageIterator.hasNext() == false` can be simplified to '!backImageIterator.hasNext()'
in `viz/src/main/java/org/apache/sedona/viz/core/RasterOverlayOperator.java`
#### Snippet
```java
                Iterator<ImageSerializableWrapper> backImageIterator = imagePair._2._1.iterator();
                Iterator<ImageSerializableWrapper> frontImageIterator = imagePair._2._2.iterator();
                if (backImageIterator.hasNext() == false) {
                    throw new Exception("[OverlayOperator][JoinImage] The back image iterator didn't get any image partitions.");
                }
```

### PointlessBooleanExpression
`frontImageIterator.hasNext() == false` can be simplified to '!frontImageIterator.hasNext()'
in `viz/src/main/java/org/apache/sedona/viz/core/RasterOverlayOperator.java`
#### Snippet
```java
                    throw new Exception("[OverlayOperator][JoinImage] The back image iterator didn't get any image partitions.");
                }
                if (frontImageIterator.hasNext() == false) {
                    throw new Exception("[OverlayOperator][JoinImage] The front image iterator didn't get any image partitions.");
                }
```

### PointlessBooleanExpression
`this.useUserSuppliedResolution == false` can be simplified to '!this.useUserSuppliedResolution'
in `viz/src/main/java/org/apache/sedona/viz/core/GlobalParameter.java`
#### Snippet
```java
    {
        this.partitionsOnSingleAxis = (int) Math.sqrt(Math.pow(4, this.minTreeLevel));
        if (this.useUserSuppliedResolution == false) {
            this.partitionIntervalX = 256;
            this.partitionIntervalY = 256;
```

### PointlessBooleanExpression
`this.parallelRenderImage == true` can be simplified to 'this.parallelRenderImage'
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationOperator.java`
#### Snippet
```java
    {
        logger.info("[Sedona-VizViz][RenderImage][Start]");
        if (this.parallelRenderImage == true) {
            if (this.hasBeenSpatialPartitioned == false) {
                this.spatialPartitioningWithoutDuplicates();
```

### PointlessBooleanExpression
`this.hasBeenSpatialPartitioned == false` can be simplified to '!this.hasBeenSpatialPartitioned'
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationOperator.java`
#### Snippet
```java
        logger.info("[Sedona-VizViz][RenderImage][Start]");
        if (this.parallelRenderImage == true) {
            if (this.hasBeenSpatialPartitioned == false) {
                this.spatialPartitioningWithoutDuplicates();
                this.hasBeenSpatialPartitioned = true;
```

### PointlessBooleanExpression
`this.parallelRenderImage == false` can be simplified to '!this.parallelRenderImage'
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationOperator.java`
#### Snippet
```java
            //logger.debug("[Sedona-VizViz][Render]output count "+this.distributedRasterImage.count());
        }
        else if (this.parallelRenderImage == false) {
            // Draw full size image in parallel
            this.distributedRasterImage = this.distributedRasterColorMatrix.mapPartitionsToPair(
```

### PointlessBooleanExpression
`this.hasBeenSpatialPartitioned == false` can be simplified to '!this.hasBeenSpatialPartitioned'
in `viz/src/main/java/org/apache/sedona/viz/core/VisualizationOperator.java`
#### Snippet
```java
        logger.info("[Sedona-VizViz][ApplyPhotoFilter][Start]");
        if (this.parallelPhotoFilter) {
            if (this.hasBeenSpatialPartitioned == false) {
                this.spatialPartitioningWithDuplicates();
                this.hasBeenSpatialPartitioned = true;
```

### PointlessBooleanExpression
`buildIndexOnSpatialPartitionedRDD == false` can be simplified to '!buildIndexOnSpatialPartitionedRDD'
in `core/src/main/java/org/apache/sedona/core/spatialRDD/SpatialRDD.java`
#### Snippet
```java
            throws Exception
    {
        if (buildIndexOnSpatialPartitionedRDD == false) {
            //This index is built on top of unpartitioned SRDD
            this.indexedRawRDD = this.rawSpatialRDD.mapPartitions(new IndexBuilder(indexType));
```

### PointlessBooleanExpression
`treeIndexes.hasNext() == true` can be simplified to 'treeIndexes.hasNext()'
in `core/src/main/java/org/apache/sedona/core/rangeJudgement/RangeFilterUsingIndex.java`
#### Snippet
```java
            throws Exception
    {
        assert treeIndexes.hasNext() == true;
        SpatialIndex treeIndex = treeIndexes.next();
        List<T> results = new ArrayList<T>();
```

### PointlessBooleanExpression
`useIndex == true` can be simplified to 'useIndex'
in `core/src/main/java/org/apache/sedona/core/spatialOperator/RangeQuery.java`
#### Snippet
```java
        }

        if (useIndex == true) {
            if (spatialRDD.indexedRawRDD == null) {
                throw new Exception("[RangeQuery][SpatialRangeQuery] Index doesn't exist. Please build index on rawSpatialRDD.");
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `core/src/main/java/org/apache/sedona/core/spatialRDD/SpatialRDD.java`
#### Snippet
```java
        HashSet resultWithoutDuplicates = new HashSet();
        for (int i = 0; i < collectedResult.size(); i++) {
            resultWithoutDuplicates.add(collectedResult.get(i));
        }
        return resultWithoutDuplicates.size();
```

### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `core/src/main/java/org/apache/sedona/core/spatialRDD/SpatialRDD.java`
#### Snippet
```java
        HashSet resultWithoutDuplicates = new HashSet();
        for (int i = 0; i < collectedResult.size(); i++) {
            resultWithoutDuplicates.add(collectedResult.get(i));
        }
        return resultWithoutDuplicates.size();
```

### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/RtreePartitioning.java`
#### Snippet
```java
        List<Envelope> envelopes = findLeafBounds(strtree);
        for (Envelope envelope : envelopes) {
            grids.add(envelope);
        }
    }
```

### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `core/src/main/java/org/apache/sedona/core/spatialPartitioning/HilbertPartitioning.java`
#### Snippet
```java

        for (Envelope envelope : gridWithoutID) {
            this.grids.add(envelope);
        }
    }
```

