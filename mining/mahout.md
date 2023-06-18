# mahout 
 
# Bad smells
I found 137 bad smells with 137 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 137 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/community-engines/h2o/src/main/java/org/apache/mahout/h2obindings/H2OHdfs.java`
#### Snippet
```java
labels.atStr(vstr, r).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/community-engines/h2o/src/main/java/org/apache/mahout/h2obindings/H2OHelper.java`
#### Snippet
```java
labels.atStr(vstr, i).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/cf/taste/impl/model/mongodb/MongoDBDataModel.java`
#### Snippet
```java
collection.remove(query).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/cf/taste/impl/model/mongodb/MongoDBDataModel.java`
#### Snippet
```java
collection.update(query, update).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr-examples/src/main/java/org/apache/mahout/cf/taste/example/TasteOptionParser.java`
#### Snippet
```java
cmdLine.getValue(inputOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr-examples/src/main/java/org/apache/mahout/cf/taste/example/email/EmailUtility.java`
#### Snippet
```java
record.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/cf/taste/hadoop/als/ParallelALSFactorizationJob.java`
#### Snippet
```java
part.getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr-examples/src/main/java/org/apache/mahout/classifier/NewsgroupHelper.java`
#### Snippet
```java
ts.getAttribute(CharTermAttribute.class).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr-examples/src/main/java/org/apache/mahout/classifier/sgd/TestASFEmail.java`
#### Snippet
```java
next.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr-examples/src/main/java/org/apache/mahout/classifier/sgd/TestASFEmail.java`
#### Snippet
```java
next.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr-examples/src/main/java/org/apache/mahout/classifier/sgd/TrainASFEmail.java`
#### Snippet
```java
next.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr-examples/src/main/java/org/apache/mahout/classifier/sgd/TrainASFEmail.java`
#### Snippet
```java
next.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr-examples/src/test/java/org/apache/mahout/classifier/sgd/TrainLogisticTest.java`
#### Snippet
```java
Sets.newTreeSet(csv.getPredictors()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/classifier/df/mapreduce/Classifier.java`
#### Snippet
```java
record.getSecond().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/classifier/df/tools/Describe.java`
#### Snippet
```java
cmdLine.getValue(pathOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/classifier/df/tools/Describe.java`
#### Snippet
```java
cmdLine.getValue(descPathOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/classifier/df/tools/ForestVisualizer.java`
#### Snippet
```java
cmdLine.getValue(datasetOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/classifier/df/tools/ForestVisualizer.java`
#### Snippet
```java
cmdLine.getValue(modelOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/classifier/df/tools/Frequencies.java`
#### Snippet
```java
cmdLine.getValue(dataOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/classifier/df/tools/Frequencies.java`
#### Snippet
```java
cmdLine.getValue(datasetOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/classifier/df/tools/UDistrib.java`
#### Snippet
```java
cmdLine.getValue(dataOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/classifier/df/tools/UDistrib.java`
#### Snippet
```java
cmdLine.getValue(datasetOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/classifier/df/tools/UDistrib.java`
#### Snippet
```java
cmdLine.getValue(partitionsOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/classifier/df/tools/UDistrib.java`
#### Snippet
```java
cmdLine.getValue(outputOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/classifier/naivebayes/BayesUtils.java`
#### Snippet
```java
record.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/classifier/naivebayes/BayesUtils.java`
#### Snippet
```java
entry.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/classifier/naivebayes/BayesUtils.java`
#### Snippet
```java
pair.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/classifier/naivebayes/BayesUtils.java`
#### Snippet
```java
entry.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/classifier/naivebayes/BayesUtils.java`
#### Snippet
```java
entry.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/classifier/naivebayes/test/TestNaiveBayesDriver.java`
#### Snippet
```java
pair.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/classifier/naivebayes/test/TestNaiveBayesDriver.java`
#### Snippet
```java
pair.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/clustering/conversion/InputDriver.java`
#### Snippet
```java
cmdLine.getValue(inputOpt, "testdata").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/clustering/conversion/InputDriver.java`
#### Snippet
```java
cmdLine.getValue(outputOpt, "output").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/clustering/conversion/InputDriver.java`
#### Snippet
```java
cmdLine.getValue(vectorOpt, "org.apache.mahout.math.RandomAccessSparseVector").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/clustering/lda/LDAPrintTopics.java`
#### Snippet
```java
cmdLine.getValue(inputOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/clustering/lda/LDAPrintTopics.java`
#### Snippet
```java
cmdLine.getValue(dictOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/clustering/lda/LDAPrintTopics.java`
#### Snippet
```java
cmdLine.getValue(wordOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/clustering/lda/LDAPrintTopics.java`
#### Snippet
```java
cmdLine.getValue(dictTypeOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/clustering/lda/LDAPrintTopics.java`
#### Snippet
```java
cmdLine.getValue(outOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/clustering/lda/cvb/CVB0Driver.java`
#### Snippet
```java
statuses[i].getPath().toUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/clustering/lda/cvb/InMemoryCollapsedVariationalBayes0.java`
#### Snippet
```java
record.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/clustering/classify/ClusterClassificationDriver.java`
#### Snippet
```java
vw.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/clustering/classify/ClusterClassificationDriver.java`
#### Snippet
```java
clustersIn.toUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/clustering/classify/WeightedPropertyVectorWritable.java`
#### Snippet
```java
entry.getKey().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/clustering/classify/WeightedPropertyVectorWritable.java`
#### Snippet
```java
entry.getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/clustering/classify/WeightedPropertyVectorWritable.java`
#### Snippet
```java
entry.getKey().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/clustering/classify/WeightedPropertyVectorWritable.java`
#### Snippet
```java
entry.getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/text/SequenceFilesFromMailArchivesTest.java`
#### Snippet
```java
record.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/text/SequenceFilesFromMailArchivesTest.java`
#### Snippet
```java
record.getSecond().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/text/SequenceFilesFromMailArchivesTest.java`
#### Snippet
```java
record.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/text/SequenceFilesFromMailArchivesTest.java`
#### Snippet
```java
record.getSecond().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/text/SequenceFilesFromMailArchivesTest.java`
#### Snippet
```java
record.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/text/SequenceFilesFromMailArchivesTest.java`
#### Snippet
```java
record.getSecond().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/text/SequenceFilesFromMailArchivesTest.java`
#### Snippet
```java
record.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/text/SequenceFilesFromMailArchivesTest.java`
#### Snippet
```java
record.getSecond().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/text/SequenceFilesFromMailArchivesTest.java`
#### Snippet
```java
record.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/text/SequenceFilesFromMailArchivesTest.java`
#### Snippet
```java
record.getSecond().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/text/SequenceFilesFromMailArchivesTest.java`
#### Snippet
```java
record.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/text/SequenceFilesFromMailArchivesTest.java`
#### Snippet
```java
record.getSecond().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/text/SequenceFilesFromMailArchivesTest.java`
#### Snippet
```java
record.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/text/SequenceFilesFromMailArchivesTest.java`
#### Snippet
```java
record.getSecond().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/text/SequenceFilesFromMailArchivesTest.java`
#### Snippet
```java
record.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/text/SequenceFilesFromMailArchivesTest.java`
#### Snippet
```java
record.getSecond().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/text/TestSequenceFilesFromDirectory.java`
#### Snippet
```java
record.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/text/TestSequenceFilesFromDirectory.java`
#### Snippet
```java
record.getSecond().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/text/TestSequenceFilesFromDirectory.java`
#### Snippet
```java
record.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/text/TestSequenceFilesFromDirectory.java`
#### Snippet
```java
record.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/text/TestSequenceFilesFromDirectory.java`
#### Snippet
```java
record.getSecond().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/text/TestSequenceFilesFromDirectory.java`
#### Snippet
```java
record.getSecond().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/text/TestSequenceFilesFromDirectory.java`
#### Snippet
```java
record.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/text/TestSequenceFilesFromDirectory.java`
#### Snippet
```java
record.getSecond().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/text/TestSequenceFilesFromDirectory.java`
#### Snippet
```java
record.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/text/TestSequenceFilesFromDirectory.java`
#### Snippet
```java
record.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/text/TestSequenceFilesFromDirectory.java`
#### Snippet
```java
record.getSecond().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/text/TestSequenceFilesFromDirectory.java`
#### Snippet
```java
record.getSecond().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/text/TestSequenceFilesFromDirectory.java`
#### Snippet
```java
record.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/text/TestSequenceFilesFromDirectory.java`
#### Snippet
```java
record.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/text/TestSequenceFilesFromDirectory.java`
#### Snippet
```java
record.getSecond().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/text/wikipedia/WikipediaDatasetCreatorDriver.java`
#### Snippet
```java
cmdLine.getValue(analyzerOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/utils/clustering/ClusterDumperWriter.java`
#### Snippet
```java
entry.getKey().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/utils/clustering/ClusterDumperWriter.java`
#### Snippet
```java
entry.getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/utils/regex/RegexMapperTest.java`
#### Snippet
```java
value.get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/utils/regex/RegexMapperTest.java`
#### Snippet
```java
value.get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/test/java/org/apache/mahout/utils/regex/RegexMapperTest.java`
#### Snippet
```java
value.get(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/utils/vectors/VectorHelper.java`
#### Snippet
```java
record.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/utils/vectors/arff/Driver.java`
#### Snippet
```java
cmdLine.getValue(inputOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/utils/vectors/arff/Driver.java`
#### Snippet
```java
cmdLine.getValue(maxOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/utils/vectors/arff/Driver.java`
#### Snippet
```java
cmdLine.getValue(outputOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/utils/vectors/arff/Driver.java`
#### Snippet
```java
cmdLine.getValue(delimiterOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/utils/vectors/arff/Driver.java`
#### Snippet
```java
cmdLine.getValue(dictOutOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/utils/vectors/lucene/ClusterLabels.java`
#### Snippet
```java
cmdLine.getValue(seqOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/utils/vectors/lucene/ClusterLabels.java`
#### Snippet
```java
cmdLine.getValue(pointsOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/utils/vectors/lucene/ClusterLabels.java`
#### Snippet
```java
cmdLine.getValue(indexOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/utils/vectors/lucene/ClusterLabels.java`
#### Snippet
```java
cmdLine.getValue(fieldOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/utils/vectors/lucene/ClusterLabels.java`
#### Snippet
```java
cmdLine.getValue(idFieldOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/utils/vectors/lucene/ClusterLabels.java`
#### Snippet
```java
cmdLine.getValue(outputOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/utils/vectors/lucene/ClusterLabels.java`
#### Snippet
```java
cmdLine.getValue(maxLabelsOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/utils/vectors/lucene/ClusterLabels.java`
#### Snippet
```java
cmdLine.getValue(minClusterSizeOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/utils/vectors/lucene/Driver.java`
#### Snippet
```java
cmdLine.getValue(inputOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/utils/vectors/lucene/Driver.java`
#### Snippet
```java
cmdLine.getValue(maxOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/utils/vectors/lucene/Driver.java`
#### Snippet
```java
cmdLine.getValue(weightOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/utils/vectors/lucene/Driver.java`
#### Snippet
```java
cmdLine.getValue(fieldOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/utils/vectors/lucene/Driver.java`
#### Snippet
```java
cmdLine.getValue(minDFOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/utils/vectors/lucene/Driver.java`
#### Snippet
```java
cmdLine.getValue(maxDFPercentOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/utils/vectors/lucene/Driver.java`
#### Snippet
```java
cmdLine.getValue(powerOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/utils/vectors/lucene/Driver.java`
#### Snippet
```java
cmdLine.getValue(idFieldOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/utils/vectors/lucene/Driver.java`
#### Snippet
```java
cmdLine.getValue(maxPercentErrorDocsOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/utils/vectors/lucene/Driver.java`
#### Snippet
```java
cmdLine.getValue(outputOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/utils/vectors/lucene/Driver.java`
#### Snippet
```java
cmdLine.getValue(delimiterOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/utils/vectors/lucene/Driver.java`
#### Snippet
```java
cmdLine.getValue(dictOutOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/integration/src/main/java/org/apache/mahout/utils/vectors/lucene/Driver.java`
#### Snippet
```java
cmdLine.getValue(seqDictOutOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/common/AbstractJob.java`
#### Snippet
```java
cmdLine.getValue(inputOption).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/common/AbstractJob.java`
#### Snippet
```java
cmdLine.getValue(inputOption).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/common/AbstractJob.java`
#### Snippet
```java
cmdLine.getValue(outputOption).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/common/AbstractJob.java`
#### Snippet
```java
cmdLine.getValue(outputOption).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/common/HadoopUtil.java`
#### Snippet
```java
fst.getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/common/distance/MahalanobisDistanceMeasure.java`
#### Snippet
```java
inverseCovarianceFile.get().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/common/distance/MahalanobisDistanceMeasure.java`
#### Snippet
```java
meanVectorFile.get().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/common/distance/WeightedDistanceMeasure.java`
#### Snippet
```java
weightsFile.get().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/common/iterator/sequencefile/SequenceFileDirIterator.java`
#### Snippet
```java
from.getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/common/iterator/sequencefile/SequenceFileDirValueIterator.java`
#### Snippet
```java
from.getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/common/lucene/TokenStreamIterator.java`
#### Snippet
```java
tokenStream.getAttribute(CharTermAttribute.class).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/math/MatrixUtils.java`
#### Snippet
```java
record.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/vectorizer/SparseVectorsFromSequenceFiles.java`
#### Snippet
```java
cmdLine.getValue(maxNGramSizeOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/vectorizer/SparseVectorsFromSequenceFiles.java`
#### Snippet
```java
cmdLine.getValue(minLLROpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/vectorizer/SparseVectorsFromSequenceFiles.java`
#### Snippet
```java
cmdLine.getValue(numReduceTasksOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/vectorizer/SparseVectorsFromSequenceFiles.java`
#### Snippet
```java
cmdLine.getValue(analyzerNameOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/vectorizer/SparseVectorsFromSequenceFiles.java`
#### Snippet
```java
cmdLine.getValue(weightOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/vectorizer/SparseVectorsFromSequenceFiles.java`
#### Snippet
```java
cmdLine.getValue(minDFOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/vectorizer/SparseVectorsFromSequenceFiles.java`
#### Snippet
```java
cmdLine.getValue(maxDFPercentOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/vectorizer/SparseVectorsFromSequenceFiles.java`
#### Snippet
```java
cmdLine.getValue(maxDFSigmaOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/vectorizer/SparseVectorsFromSequenceFiles.java`
#### Snippet
```java
cmdLine.getValue(powerOpt).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/test/java/org/apache/mahout/vectorizer/DictionaryVectorizerTest.java`
#### Snippet
```java
value.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/test/java/org/apache/mahout/vectorizer/HighDFWordsPrunerTest.java`
#### Snippet
```java
record.getFirst().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/vectorizer/collocations/llr/CollocMapper.java`
#### Snippet
```java
sf.getAttribute(CharTermAttribute.class).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/vectorizer/term/TFPartialVectorReducer.java`
#### Snippet
```java
sf.getAttribute(CharTermAttribute.class).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-mahout-464413939987377380010104835221085656888/community/mahout-mr/mr/src/main/java/org/apache/mahout/vectorizer/term/TFPartialVectorReducer.java`
#### Snippet
```java
record.getFirst().toString()
```

