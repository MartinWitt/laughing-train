# opennlp-addons 
 
# Bad smells
I found 165 bad smells with 8 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocDeclaration | 59 | false |
| ConstantValue | 16 | false |
| FieldMayBeFinal | 9 | false |
| UnusedAssignment | 9 | false |
| FieldCanBeLocal | 8 | false |
| UnnecessaryLocalVariable | 7 | true |
| PointlessArithmeticExpression | 6 | false |
| DuplicatedCode | 6 | false |
| ManualMinMaxCalculation | 6 | false |
| DataFlowIssue | 4 | false |
| TrivialIf | 4 | false |
| MismatchedCollectionQueryUpdate | 4 | false |
| WrapperTypeMayBePrimitive | 3 | false |
| CommentedOutCode | 3 | false |
| CStyleArrayDeclaration | 2 | false |
| TrivialStringConcatenation | 2 | false |
| DanglingJavadoc | 2 | false |
| SuspiciousMethodCalls | 2 | false |
| UNUSED_IMPORT | 2 | false |
| UNCHECKED_WARNING | 1 | false |
| JavadocReference | 1 | false |
| EmptyStatementBody | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| IgnoreResultOfCall | 1 | false |
| CharsetObjectCanBeUsed | 1 | false |
| RegExpSingleCharAlternation | 1 | false |
| DuplicateThrows | 1 | false |
| StringConcatenationInLoops | 1 | false |
## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/GeoEntityLinker.java`
#### Snippet
```java
        if (!spans.isEmpty()) {

          Double maxscore = 0d;
          for (BaseLink gazetteerEntry : geoNamesEntries) {
            Double deNormScore = gazetteerEntry.getScoreMap().get("lucene");
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/PointClustering.java`
#### Snippet
```java

  public void scoreClusters(Map<String, List<GazetteerEntry>> clusters) {
    Double min = 0d;
    Double max = -1d;
    for (String key : clusters.keySet()) {
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/PointClustering.java`
#### Snippet
```java
  public void scoreClusters(Map<String, List<GazetteerEntry>> clusters) {
    Double min = 0d;
    Double max = -1d;
    for (String key : clusters.keySet()) {
      int size = clusters.get(key).size();
```

## RuleId[id=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`1 - 0` can be replaced with '1'
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/GeoEntityLinker.java`
#### Snippet
```java
   */
  private Double normalize(Double valueToNormalize, double minimum, double maximum) {
    double d = ((1 - 0) * (valueToNormalize - minimum)) / (maximum - minimum) + 0;
    d = Double.isNaN(d) ? 0d : d;
    return d;
```

### PointlessArithmeticExpression
`1 - 0` can be replaced with '1'
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/PointClustering.java`
#### Snippet
```java

  private Double normalize(Double valueToNormalize, double minimum, double maximum) {
    return ((1 - 0) * (valueToNormalize - minimum)) / (maximum - minimum) + 0;
  }
}
```

### PointlessArithmeticExpression
`(1 - 0) * (valueToNormalize - minimum)` can be replaced with '(valueToNormalize - minimum)'
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/CountryProximityScorer.java`
#### Snippet
```java
   */
  private Double normalize(int valueToNormalize, int minimum, int maximum) {
    Double d = (double) ((1 - 0) * (valueToNormalize - minimum)) / (maximum - minimum) + 0;
    d = d == null ? 0d : d;
    return d;
```

### PointlessArithmeticExpression
`1 - 0` can be replaced with '1'
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/CountryProximityScorer.java`
#### Snippet
```java
   */
  private Double normalize(int valueToNormalize, int minimum, int maximum) {
    Double d = (double) ((1 - 0) * (valueToNormalize - minimum)) / (maximum - minimum) + 0;
    d = d == null ? 0d : d;
    return d;
```

### PointlessArithmeticExpression
`(1 - 0) * (valueToNormalize - minimum)` can be replaced with '(valueToNormalize - minimum)'
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/ProvinceProximityScorer.java`
#### Snippet
```java
   */
  private Double normalize(int valueToNormalize, int minimum, int maximum) {
    Double d = (double) ((1 - 0) * (valueToNormalize - minimum)) / (maximum - minimum) + 0;
    d = d == null ? 0d : d;
    return d;
```

### PointlessArithmeticExpression
`1 - 0` can be replaced with '1'
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/ProvinceProximityScorer.java`
#### Snippet
```java
   */
  private Double normalize(int valueToNormalize, int minimum, int maximum) {
    Double d = (double) ((1 - 0) * (valueToNormalize - minimum)) / (maximum - minimum) + 0;
    d = d == null ? 0d : d;
    return d;
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked call to 'score(List, String, Span\[\], EntityLinkerProperties, T)' as a member of raw type 'opennlp.addons.geoentitylinker.scoring.LinkedEntityScorer'
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/GeoEntityLinker.java`
#### Snippet
```java
    if (!scorers.isEmpty()) {
      for (LinkedEntityScorer scorer : scorers) {
        scorer.score(spans, doctext, sentences, linkerProperties, context);
      }
    }
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `SimpleTokenizer`
in `japanese-addon/src/main/java/opennlp/tools/util/featuregen/lang/jpn/TokenPatternFeatureGenerator.java`
#### Snippet
```java
  /**
   * Initializes a new instance.
   * For tokinization the {@link SimpleTokenizer} is used.
   */
  public TokenPatternFeatureGenerator() {
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getFileName` may produce `NullPointerException`
in `morfologik-addon/src/main/java/opennlp/morfologik/tagdict/MorfologikPOSTaggerFactory.java`
#### Snippet
```java
    
    if(dictionaryMeta == null || !dictionaryMeta.toFile().canRead()) {
      throw new FileNotFoundException("Could not read dictionary metadata: " + dictionaryMeta.getFileName());
    }
    
```

### DataFlowIssue
Variable is already assigned to this value
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/CountryProximityScorer.java`
#### Snippet
```java
    for (LinkedSpan<BaseLink> linkedspan : linkedData) {

      linkedspan = simpleProximityAnalysis(sentences, countryHits, linkedspan, maxAllowedDist);
    }
    return linkedData;
```

### DataFlowIssue
Variable is already assigned to this value
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/ProvinceProximityScorer.java`
#### Snippet
```java
    for (LinkedSpan<BaseLink> linkedspan : linkedData) {

      linkedspan = simpleProximityAnalysis(sentences, countryHits, linkedspan, maxAllowedDist);
    }
    return linkedData;
```

### DataFlowIssue
Method invocation `toLowerCase` may produce `NullPointerException`
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/indexing/GeonamesProcessor.java`
#### Snippet
```java
      doc.add(new StringField("loctype", dsg, Field.Store.YES));
      doc.add(new StringField("admincode", (ccode + "." + admincode).toLowerCase(), Field.Store.YES));
      doc.add(new StringField("countrycode", ccode.toLowerCase(), Field.Store.YES));
      doc.add(new StringField("countycode", "", Field.Store.YES));
      doc.add(new StringField("locid", id, Field.Store.YES));
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/indexing/RegionProcessor.java`
#### Snippet
```java

      String[] values = line.split("\t");
      if (counter == 0) {

      } else {
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `jwnl-addon/src/main/java/opennlp/jwnl/lemmatizer/JWNLLemmatizer.java`
#### Snippet
```java
      baseForm = morphy.lookupBaseForm(pos, word);
      if (baseForm != null) {
        lemma = baseForm.getLemma().toString();
      }
      else if (baseForm == null && postag.startsWith(constantTag)) {
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (4 lines)
in `modelbuilder-addon/src/main/java/opennlp/addons/modelbuilder/impls/FileModelValidatorImpl.java`
#### Snippet
```java
      getBlackList();
    }
//
//    Pattern p = Pattern.compile("[0-9]", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
//    if (p.matcher(namedEntity).find()) {
```

### CommentedOutCode
Commented out code (10 lines)
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/AdminBoundaryContext.java`
#### Snippet
```java
      Map<String, String> provs = new HashMap<>();

//      if (!provsForCountry.isEmpty()) {
//        for (String pcode : provsForCountry.keySet()) {
//          if (this.getProvHits().contains(pcode)) {
```

### CommentedOutCode
Commented out code (2 lines)
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/indexing/GeonamesProcessor.java`
#### Snippet
```java
      doc.add(new TextField("hierarchy", concatIndexEntry, Field.Store.YES));
      doc.add(new TextField("placename", placeName, Field.Store.YES));
      // doc.add(new TextField("countryname", countryname, Field.Store.YES));
      //System.out.println(placeName);

```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `outcomes`
in `liblinear-addon/src/main/java/LiblinearTrainer.java`
#### Snippet
```java

    // outcomes
    int outcomes[] = indexer.getOutcomeList();

    int max_index = 0;
```

### CStyleArrayDeclaration
C-style array declaration of local variable `toolArguments`
in `morfologik-addon/src/main/java/opennlp/morfologik/cmdline/CLI.java`
#### Snippet
```java
	    }

	    String toolArguments[] = new String[args.length -1];
	    System.arraycopy(args, 1, toolArguments, 0, toolArguments.length);

```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/GazetteerSearcher.java`
#### Snippet
```java

      String cutoff = properties.getProperty("opennlp.geoentitylinker.gaz.lucenescore.min", String.valueOf(scoreCutoff));
      String usehierarchy = properties.getProperty("opennlp.geoentitylinker.gaz.hierarchyfield", String.valueOf("0"));
      if (cutoff != null && !cutoff.isEmpty()) {
        scoreCutoff = Double.parseDouble(cutoff);
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/GazetteerSearcher.java`
#### Snippet
```java
      Map<String, Analyzer> analyMap = new HashMap<>();

      analyMap.put("countrycode", new KeywordAnalyzer());
      analyMap.put("admincode", new KeywordAnalyzer());
      analyMap.put("loctype", new KeywordAnalyzer());
      analyMap.put("countycode", new KeywordAnalyzer());
      analyMap.put("gazsource", new KeywordAnalyzer());
```

### DuplicatedCode
Duplicated code
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/indexing/GeonamesProcessor.java`
#### Snippet
```java
      doc.add(new TextField("hierarchy", concatIndexEntry, Field.Store.YES));
      doc.add(new TextField("placename", placeName, Field.Store.YES));
      // doc.add(new TextField("countryname", countryname, Field.Store.YES));
      //System.out.println(placeName);

      doc.add(new TextField("latitude", lat, Field.Store.YES));
      doc.add(new TextField("longitude", lon, Field.Store.YES));
      doc.add(new StringField("loctype", dsg, Field.Store.YES));
```

### DuplicatedCode
Duplicated code
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/CountryProximityScorer.java`
#### Snippet
```java
Double score = 0.0;
    /*
     * get the index of the actual span, beginning of sentence //should generate
     * tokens from sentence and create a char offset... //could have large
     * sentences due to poor sentence detection or wonky doc text
     */
    int sentenceIdx = span.getSentenceid();
    int sentIndexInDoc = sentences[sentenceIdx].getStart();
    /*
     * create a map of all the span's proximal country mentions in the document
     * Map< countrycode, set of <distances from this NamedEntity>>
     */
    Map<String, Set<Integer>> distancesFromCodeMap = new HashMap<>();
    //map = Map<countrycode, Set <of distances this span is from all the mentions of the code>>
    for (String cCode : countryHits.keySet()) {
      // iterate over all the regex start values and calculate an offset
      for (Integer cHit : countryHits.get(cCode)) {
        Integer absDist = Math.abs(sentIndexInDoc - cHit);
        //only include near mentions based on a heuristic
        //TODO make this a property
        //  if (absDist < maxAllowedDistance) {
        if (distancesFromCodeMap.containsKey(cCode)) {
          distancesFromCodeMap.get(cCode).add(absDist);
        } else {
          HashSet<Integer> newset = new HashSet<>();
          newset.add(absDist);
          distancesFromCodeMap.put(cCode, newset);
        }
      }
    }
    //we now know how far this named entity is from every country mention in the document

    /*
     * the gaz matches that have a country code that have mentions in the doc
     * that are closest to the Named Entity should return the best score.
     * Analyzemap generates a likelihood score that the toponym from the gaz is
     * referring to one of the countries, i.e, Map<countrycode, prob that this
     * span is referring to the toponym form this code key>
     */
    Map<String, Double> scoreMap = analyzeMap(distancesFromCodeMap, sentences, span);
```

### DuplicatedCode
Duplicated code
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/CountryProximityScorer.java`
#### Snippet
```java
    Map<String, Double> scoreMap = new HashMap<>();
    if (distanceMap.isEmpty()) {
      return scoreMap;
    }
    TreeSet<Integer> all = new TreeSet<>();
    for (String key : distanceMap.keySet()) {
      all.addAll(distanceMap.get(key));
    }

    // get min max for normalization, this could be more efficient
    int min = all.first();
    int max = all.last();
    if (min == max) {
      min = 0;
    }

    for (String key : distanceMap.keySet()) {
      TreeSet<Double> normalizedDistances = new TreeSet<>();
      for (Integer i : distanceMap.get(key)) {
        Double norm = normalize(i, min, max);
        //reverse the normed distance so low numbers (closer) are better
        //this could be improved with a "decaying " function using an imcreaseing negative exponent
        Double reverse = Math.abs(norm - 1);
        normalizedDistances.add(reverse);
      }

      List<Double> doubles = new ArrayList<>(normalizedDistances);
      scoreMap.put(key, slidingDistanceAverage(doubles));
    }
    return scoreMap;
```

### DuplicatedCode
Duplicated code
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/CountryProximityScorer.java`
#### Snippet
```java
    List<Double> windowOfAverages = new ArrayList<>();

    if (normDis.size() < 3) {
      windowOfAverages.addAll(normDis);
    } else {

      for (int i = 0; i < normDis.size() - 1; i++) {
        double a = normDis.get(i);
        double b = normDis.get(i + 1);
        windowOfAverages.add((a + b) / 2);

      }
    }
    double sum = 0d;
    for (double d : windowOfAverages) {
      sum += d;
    }
    double result = sum / windowOfAverages.size();
    //TODO: ++ prob when large amounts of mentions for a code
    //System.out.println("avg of window:" + result);
    return result;
```

### DuplicatedCode
Duplicated code
in `jwnl-addon/src/main/java/opennlp/jwnl/lemmatizer/JWNLLemmatizer.java`
#### Snippet
```java
    List<String> lemmas = new ArrayList<>();
    for (int i = 0; i < tokens.length; i++) {
      lemmas.add(this.lemmatize(tokens[i], postags[i]));
    }
    return lemmas.toArray(new String[0]);
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/indexing/USGSProcessor.java`
#### Snippet
```java
      doc.add(new TextField("placename", state, Field.Store.YES));
      //calculate a centroid for all the points that were in the state
      doc.add(new TextField("latitude", (get.latSum / get.count) + "", Field.Store.YES));
      doc.add(new TextField("longitude", (get.longSum / get.count) + "", Field.Store.YES));
      doc.add(new StringField("loctype", "adm1", Field.Store.YES));
```

### TrivialStringConcatenation
Empty string used in concatenation
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/indexing/USGSProcessor.java`
#### Snippet
```java
      //calculate a centroid for all the points that were in the state
      doc.add(new TextField("latitude", (get.latSum / get.count) + "", Field.Store.YES));
      doc.add(new TextField("longitude", (get.longSum / get.count) + "", Field.Store.YES));
      doc.add(new StringField("loctype", "adm1", Field.Store.YES));
      doc.add(new StringField("admincode", get.statecode, Field.Store.YES));
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `japanese-addon/src/main/java/opennlp/tools/util/featuregen/lang/jpn/TokenPatternFeatureGenerator.java`
#### Snippet
```java
    }

    feats.add("pta=" + pattern.toString());
  }
}
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/ModelBasedScorer.java`
#### Snippet
```java
    int docSize = docText.length();
    int left = 0, right = 0;
    left = (mentionIdx - radius < 0) ? 0 : mentionIdx - radius;
    right = (mentionIdx + radius > docSize) ? docSize : mentionIdx + radius;
    String chunk = "";
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/ModelBasedScorer.java`
#### Snippet
```java
    int left = 0, right = 0;
    left = (mentionIdx - radius < 0) ? 0 : mentionIdx - radius;
    right = (mentionIdx + radius > docSize) ? docSize : mentionIdx + radius;
    String chunk = "";
    if (right <= left) {
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/CountryProximityScorer.java`
#### Snippet
```java
          if (nameCodesMap.get(link.getItemName().toLowerCase()).contains(link.getItemParentID())) {
            //boost the score because it is likely that this is the location in the text, so add 50% to the score or set to 1
            score = (score + .75) > 1.0 ? 1d : (score + .75);

            if (link.getItemParentID().equals(dominantCode)) {
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/CountryProximityScorer.java`
#### Snippet
```java

            if (link.getItemParentID().equals(dominantCode)) {
              score = (score + .25) > 1.0 ? 1d : (score + .25);
            }
          }
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/ProvinceProximityScorer.java`
#### Snippet
```java
            //boost the score becuase it is likely that this is the location in the text, so add 50% to the score or set to 1
            //TODO: make this smarter
            score = (score + .75) > 1.0 ? 1d : (score + .75);

            if (entry.getProvinceCode().equals(dominantCode)) {
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/ProvinceProximityScorer.java`
#### Snippet
```java

            if (entry.getProvinceCode().equals(dominantCode)) {
              score = (score + .25) > 1.0 ? 1d : (score + .25);
            }
          }
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/ProvinceProximityScorer.java`
#### Snippet
```java
    int sentenceIdx = span.getSentenceid();
    int sentIndexInDoc = sentences[sentenceIdx].getStart();
    /**
     * create a map of all the span's proximal country mentions in the document
     * Map< countrycode, set of <distances from this NamedEntity>>
```

### DanglingJavadoc
Dangling Javadoc comment
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/ProvinceProximityScorer.java`
#### Snippet
```java
    //we now know how far this named entity is from every country mention in the document

    /**
     * the gaz matches that have a country code that have mentions in the doc
     * that are closest to the Named Entity should return the best score.
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
'ArrayList' may not contain objects of type 'GazetteerEntry'
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/GeoEntityLinker.java`
#### Snippet
```java
            ArrayList<GazetteerEntry> find = gazateerSearcher.find(matches[i], topN, whereclause);
            for (GazetteerEntry gazetteerEntry : find) {
              if (!geoNamesEntries.contains(gazetteerEntry)) {
                geoNamesEntries.add(gazetteerEntry);
              }
```

### SuspiciousMethodCalls
'ArrayList' may not contain objects of type 'GazetteerEntry'
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/GeoEntityLinker.java`
#### Snippet
```java
          ArrayList<GazetteerEntry> find = gazateerSearcher.find(matches[i], topN, " gaztype:usgs geonames regions ");
          for (GazetteerEntry gazetteerEntry : find) {
            if (!geoNamesEntries.contains(gazetteerEntry)) {
              geoNamesEntries.add(gazetteerEntry);
            }
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `jwnl-addon/src/main/java/opennlp/jwnl/lemmatizer/JWNLLemmatizer.java`
#### Snippet
```java
public class JWNLLemmatizer implements Lemmatizer {

  private net.didion.jwnl.dictionary.Dictionary dict;
  private MorphologicalProcessor morphy;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/GazetteerSearcher.java`
#### Snippet
```java
public class GazetteerSearcher {

  private final String REGEX_CLEAN = "[^\\p{L}\\p{Nd}]";
  private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
  private double scoreCutoff = .70;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/GazetteerSearcher.java`
#### Snippet
```java

  private Directory opennlpIndex;//= new MMapDirectory(new File(indexloc));
  private IndexReader opennlpReader;// = DirectoryReader.open(geonamesIndex);
  private IndexSearcher opennlpSearcher;// = new IndexSearcher(geonamesReader);
  private Analyzer opennlpAnalyzer;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/GazetteerSearcher.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
  private double scoreCutoff = .70;
  private final boolean doubleQuoteAllSearchTerms = false;
  private boolean useHierarchyField = false;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/GeoHashBinningScorer.java`
#### Snippet
```java

  private final PointClustering CLUSTERER = new PointClustering();
  private int PRECISION = 3;

  @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `modelbuilder-addon/src/main/java/opennlp/addons/modelbuilder/impls/GenericModelGenerator.java`
#### Snippet
```java
public class GenericModelGenerator implements SemiSupervisedModelGenerator {

  private Map<String, String> params = new HashMap<>();

  @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/AdminBoundaryContextGenerator.java`
#### Snippet
```java

  private final Set<CountryContextEntry> countryHits = new HashSet<>();
  private final EntityLinkerProperties properties;
  private final List<AdminBoundary> adminBoundaryData= new ArrayList<>();
  private final Set<AdminBoundary> adminBoundaryHits = new HashSet<>();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/AdminBoundaryContextGenerator.java`
#### Snippet
```java
  private final List<AdminBoundary> adminBoundaryData= new ArrayList<>();
  private final Set<AdminBoundary> adminBoundaryHits = new HashSet<>();
  private AdminBoundaryContext context;

  public AdminBoundaryContext getContext(String text) {
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `DataInputStream.read()` is ignored
in `liblinear-addon/src/main/java/LiblinearModel.java`
#### Snippet
```java

      byte[] modelBytes = new byte[modelByteLength];
      di.read(modelBytes);

      int outcomeLabelLength = di.readInt();
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/CountryContextEntry.java`
#### Snippet
```java
      return false;
    }
    if (!Objects.equals(this.dsg, other.dsg)) {
      return false;
    }
```

### TrivialIf
`if` statement can be simplified
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/GazetteerEntry.java`
#### Snippet
```java
      return false;
    }
    if (!Objects.equals(this.indexID, other.indexID)) {
      return false;
    }
```

### TrivialIf
`if` statement can be simplified
in `modelbuilder-addon/src/main/java/opennlp/addons/modelbuilder/impls/FileModelValidatorImpl.java`
#### Snippet
```java
//    }
    boolean b = true;
    if (badentities.contains(namedEntity.toLowerCase())) {
      b = false;
    }
```

### TrivialIf
`if` statement can be simplified
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/AdminBoundary.java`
#### Snippet
```java
      return false;
    }
    if (!Objects.equals(this.countyCode, other.countyCode)) {
      return false;
    }
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `modelbuilder-addon/src/main/java/opennlp/addons/modelbuilder/impls/FileKnownEntityProvider.java`
#### Snippet
```java

        fis = new FileInputStream(params.getKnownEntitiesFile());
        br = new BufferedReader(new InputStreamReader(fis, Charset.forName("UTF-8")));
        while ((line = br.readLine()) != null) {
          knownEntities.add(line);
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.io.IOException;`
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/indexing/GazetteerIndexer.java`
#### Snippet
```java
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
```

### UNUSED_IMPORT
Unused import `import java.io.FileNotFoundException;`
in `modelbuilder-addon/src/main/java/opennlp/addons/modelbuilder/impls/FileKnownEntityProvider.java`
#### Snippet
```java
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
```

## RuleId[id=RegExpSingleCharAlternation]
### RegExpSingleCharAlternation
Single character alternation in RegExp
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/AdminBoundaryContextGenerator.java`
#### Snippet
```java
          Integer start = rs.start();
          String hit = rs.group().toLowerCase().trim();
          hit = hit.replaceAll("\\.|,|;|\\?|!|\\\\|/|\"|'|=|-|&", "");
          if (mentions.containsKey(code)) {
            mentions.get(code).add(start);
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@return` tag description is missing
in `modelbuilder-addon/src/main/java/opennlp/addons/modelbuilder/KnownEntityProvider.java`
#### Snippet
```java
  /**
   * defines the type of entity that the set contains, ie person, location, organization.
   * @return
   */
  String getKnownEntitiesType();
```

### JavadocDeclaration
`@param unambiguousEntity` tag description is missing
in `modelbuilder-addon/src/main/java/opennlp/addons/modelbuilder/KnownEntityProvider.java`
#### Snippet
```java
  /**
   * adds to the set of known entities. Overriding classes should hold this list in a class level set.
   * @param unambiguousEntity
   */
  void addKnownEntity(String unambiguousEntity);
```

### JavadocDeclaration
`@param searchString` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/GazetteerSearchCache.java`
#### Snippet
```java
/**
 * returns the cached entries. Returns null if the query does not exist in the cache
 * @param searchString
 * @return
 */
```

### JavadocDeclaration
`@return` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/GazetteerSearchCache.java`
#### Snippet
```java
 * returns the cached entries. Returns null if the query does not exist in the cache
 * @param searchString
 * @return
 */
  public static synchronized ArrayList<GazetteerEntry> get(String searchString) {
```

### JavadocDeclaration
IOException is not declared to be thrown by method MorfologikTagDictionary
in `morfologik-addon/src/main/java/opennlp/morfologik/tagdict/MorfologikTagDictionary.java`
#### Snippet
```java
   * @throws IllegalArgumentException
   *           if FSA's root node cannot be acquired (dictionary is empty).
   * @throws IOException
   *           could not read dictionary from dictURL
   */
```

### JavadocDeclaration
IOException is not declared to be thrown by method MorfologikTagDictionary
in `morfologik-addon/src/main/java/opennlp/morfologik/tagdict/MorfologikTagDictionary.java`
#### Snippet
```java
   * @throws IllegalArgumentException
   *           if FSA's root node cannot be acquired (dictionary is empty).
   * @throws IOException
   *           could not read dictionary from dictURL
   */
```

### JavadocDeclaration
`@param longitude` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/GazetteerEntry.java`
#### Snippet
```java
   * sets the longitude from the gaz
   *
   * @param longitude
   */
  public void setLongitude(Double longitude) {
```

### JavadocDeclaration
`@param source` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/GazetteerEntry.java`
#### Snippet
```java
   * sets the source (the source of the gazetteer data)
   *
   * @param source
   */
  public void setSource(String source) {
```

### JavadocDeclaration
`@param word` tag description is missing
in `jwnl-addon/src/main/java/opennlp/jwnl/lemmatizer/JWNLLemmatizer.java`
#### Snippet
```java
   * It takes a word and a POS tag and obtains a word's lemma from WordNet.
   * 
   * @param word
   * @param postag
   * @return lemma
```

### JavadocDeclaration
`@param postag` tag description is missing
in `jwnl-addon/src/main/java/opennlp/jwnl/lemmatizer/JWNLLemmatizer.java`
#### Snippet
```java
   * 
   * @param word
   * @param postag
   * @return lemma
   */
```

### JavadocDeclaration
`@param wnDirectory` tag description is missing
in `jwnl-addon/src/main/java/opennlp/jwnl/lemmatizer/JWNLLemmatizer.java`
#### Snippet
```java
   * Constructor code based on Apache OpenNLP JWNLDictionary class. 
   * 
   * @param wnDirectory
   * @throws IOException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `jwnl-addon/src/main/java/opennlp/jwnl/lemmatizer/JWNLLemmatizer.java`
#### Snippet
```java
   * 
   * @param wnDirectory
   * @throws IOException
   */
  public JWNLLemmatizer(String wnDirectory) throws IOException {
```

### JavadocDeclaration
`@param input` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/GazetteerSearcher.java`
#### Snippet
```java
   * double quotes to the string
   *
   * @param input
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/GazetteerSearcher.java`
#### Snippet
```java
   *
   * @param input
   * @return
   */
  private String cleanInput(String input) {
```

### JavadocDeclaration
`@return` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/GazetteerSearcher.java`
#### Snippet
```java
   * @param whereClause the conditional statement that defines the index type
   * and the country oode.
   * @return
   */
  public ArrayList<GazetteerEntry> find(String searchString, int rowsReturned, String whereClause) {
```

### JavadocDeclaration
`@return` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/GeoEntityLinker.java`
#### Snippet
```java
   * @param minimum the min of the set to be transposed
   * @param maximum the max of the set to be transposed
   * @return
   */
  private Double normalize(Double valueToNormalize, double minimum, double maximum) {
```

### JavadocDeclaration
`@param geohash` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/PointClustering.java`
#### Snippet
```java
   * element 1 is the Y (latitude)
   *
   * @param geohash
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/PointClustering.java`
#### Snippet
```java
   *
   * @param geohash
   * @return
   */
  public double[] geoHashToPoint(String geohash) {
```

### JavadocDeclaration
`@param entries` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/PointClustering.java`
#### Snippet
```java
   * toponym is to be accurate
   *
   * @param entries
   * @param precision
   * @return
```

### JavadocDeclaration
`@param precision` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/PointClustering.java`
#### Snippet
```java
   *
   * @param entries
   * @param precision
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/PointClustering.java`
#### Snippet
```java
   * @param entries
   * @param precision
   * @return
   */
  public Map<String, List<GazetteerEntry>> cluster(List<GazetteerEntry> entries, int precision) {
```

### JavadocDeclaration
`@param geohash` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/PointClustering.java`
#### Snippet
```java
   * element 1 is the Y (latitude)
   *
   * @param geohash
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/PointClustering.java`
#### Snippet
```java
   *
   * @param geohash
   * @return
   */
  public String geoHashToPointStr(String geohash) {
```

### JavadocDeclaration
`@return` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/PointClustering.java`
#### Snippet
```java
   * @param lat the input latitude Y
   * @param lon the input longitude X
   * @return
   */
  public String geoHash(Double lat, Double lon) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/indexing/GazetteerIndexer.java`
#### Snippet
```java
   * as the longitude, and index 2 as the latitude
   *
   * @throws Exception
   */
  public void index(File geonamesData, File geoNamesCountryInfo, File geonamesAdmin1CodesASCII, File usgsDataFile,
```

### JavadocDeclaration
`@param linkedSpans` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/ModelBasedScorer.java`
#### Snippet
```java
   * radius of a mention within the doctext
   *
   * @param linkedSpans
   * @param sentenceSpans
   * @param docText
```

### JavadocDeclaration
`@param sentenceSpans` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/ModelBasedScorer.java`
#### Snippet
```java
   *
   * @param linkedSpans
   * @param sentenceSpans
   * @param docText
   * @param radius
```

### JavadocDeclaration
`@param docText` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/ModelBasedScorer.java`
#### Snippet
```java
   * @param linkedSpans
   * @param sentenceSpans
   * @param docText
   * @param radius
   * @return a map of the index of the linked span to the string of surrounding
```

### JavadocDeclaration
`@param radius` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/ModelBasedScorer.java`
#### Snippet
```java
   * @param sentenceSpans
   * @param docText
   * @param radius
   * @return a map of the index of the linked span to the string of surrounding
   * text: Map&lt;indexofspan,surrounding text&gt;
```

### JavadocDeclaration
`@throws` tag description is missing
in `morfologik-addon/src/main/java/opennlp/morfologik/builder/MorfologikDictionayBuilder.java`
#### Snippet
```java
   * @return the dictionary path
   * 
   * @throws Exception
   */
  public Path build(Path input, boolean overwrite, boolean validate,
```

### JavadocDeclaration
`@throws` tag description is missing
in `morfologik-addon/src/main/java/opennlp/morfologik/builder/MorfologikDictionayBuilder.java`
#### Snippet
```java
   *  @return the dictionary path
   * 
   * @throws Exception
   */
  public Path build(Path input) throws Exception {
```

### JavadocDeclaration
`@param sentences` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/CountryProximityScorer.java`
#### Snippet
```java
   * are resolved to the correct country and coordinate.
   *
   * @param sentences
   * @param countryHits
   * @param span
```

### JavadocDeclaration
`@param countryHits` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/CountryProximityScorer.java`
#### Snippet
```java
   *
   * @param sentences
   * @param countryHits
   * @param span
   * @return
```

### JavadocDeclaration
`@param span` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/CountryProximityScorer.java`
#### Snippet
```java
   * @param sentences
   * @param countryHits
   * @param span
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/CountryProximityScorer.java`
#### Snippet
```java
   * @param countryHits
   * @param span
   * @return
   */
  private LinkedSpan<BaseLink> simpleProximityAnalysis(Span[] sentences, Map<String, Set<Integer>> countryHits, LinkedSpan<BaseLink> span, Integer maxAllowedDistance) {
```

### JavadocDeclaration
`@param distanceMap` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/CountryProximityScorer.java`
#### Snippet
```java
   * to the overall list.
   *
   * @param distanceMap
   * @param sentences
   * @param span
```

### JavadocDeclaration
`@param sentences` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/CountryProximityScorer.java`
#### Snippet
```java
   *
   * @param distanceMap
   * @param sentences
   * @param span
   * @return
```

### JavadocDeclaration
`@param span` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/CountryProximityScorer.java`
#### Snippet
```java
   * @param distanceMap
   * @param sentences
   * @param span
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/CountryProximityScorer.java`
#### Snippet
```java
   * @param sentences
   * @param span
   * @return
   */
  private Map<String, Double> analyzeMap(Map<String, Set<Integer>> distanceMap, Span[] sentences, LinkedSpan<BaseLink> span) {
```

### JavadocDeclaration
`@return` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/CountryProximityScorer.java`
#### Snippet
```java
   * @param minimum the min of the set to be transposed
   * @param maximum the max of the set to be transposed
   * @return
   */
  private Double normalize(int valueToNormalize, int minimum, int maximum) {
```

### JavadocDeclaration
`@param countryHits` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/CountryProximityScorer.java`
#### Snippet
```java
   * sets class level variable to a code based on the number of mentions
   *
   * @param countryHits
   */
  private void setDominantCode(Map<String, Set<Integer>> countryHits) {
```

### JavadocDeclaration
`@return` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/CountryProximityScorer.java`
#### Snippet
```java
   * mentions, based on proximity within the text, should be used to score the
   * Named Entity.
   * @return
   */
  public List<LinkedSpan> score(List<LinkedSpan> linkedData, Map<String, Set<Integer>> countryHits, Map<String, Set<String>> nameCodesMap, String docText, Span[] sentences, Integer maxAllowedDist) {
```

### JavadocDeclaration
`@return` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/CountryProximityScorer.java`
#### Snippet
```java
   *
   * @param normDis the normalized and sorted set of distances as a list
   * @return
   */
  private Double slidingDistanceAverage(List<Double> normDis) {
```

### JavadocDeclaration
`@param sentences` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/ProvinceProximityScorer.java`
#### Snippet
```java
   * are resolved to the correct country and coordinate.
   *
   * @param sentences
   * @param countryHits
   * @param span
```

### JavadocDeclaration
`@param countryHits` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/ProvinceProximityScorer.java`
#### Snippet
```java
   *
   * @param sentences
   * @param countryHits
   * @param span
   * @return
```

### JavadocDeclaration
`@param span` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/ProvinceProximityScorer.java`
#### Snippet
```java
   * @param sentences
   * @param countryHits
   * @param span
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/ProvinceProximityScorer.java`
#### Snippet
```java
   * @param countryHits
   * @param span
   * @return
   */
  private LinkedSpan<BaseLink> simpleProximityAnalysis(Span[] sentences, Map<String, Set<Integer>> countryHits, LinkedSpan<BaseLink> span, Integer maxAllowedDistance) {
```

### JavadocDeclaration
`@param countryHits` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/ProvinceProximityScorer.java`
#### Snippet
```java
   * sets class level variable to a code based on the number of mentions
   *
   * @param countryHits
   */
  private void setDominantCode(Map<String, Set<Integer>> countryHits) {
```

### JavadocDeclaration
`@return` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/ProvinceProximityScorer.java`
#### Snippet
```java
   * @param minimum the min of the set to be transposed
   * @param maximum the max of the set to be transposed
   * @return
   */
  private Double normalize(int valueToNormalize, int minimum, int maximum) {
```

### JavadocDeclaration
`@param distanceMap` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/ProvinceProximityScorer.java`
#### Snippet
```java
   * score is added to the overall list.
   *
   * @param distanceMap
   * @param sentences
   * @param span
```

### JavadocDeclaration
`@param sentences` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/ProvinceProximityScorer.java`
#### Snippet
```java
   *
   * @param distanceMap
   * @param sentences
   * @param span
   * @return
```

### JavadocDeclaration
`@param span` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/ProvinceProximityScorer.java`
#### Snippet
```java
   * @param distanceMap
   * @param sentences
   * @param span
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/ProvinceProximityScorer.java`
#### Snippet
```java
   * @param sentences
   * @param span
   * @return
   */
  private Map<String, Double> analyzeMap(Map<String, Set<Integer>> distanceMap, Span[] sentences, LinkedSpan<BaseLink> span) {
```

### JavadocDeclaration
`@return` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/ProvinceProximityScorer.java`
#### Snippet
```java
   *
   * @param normDis the normalized and sorted set of distances as a list
   * @return
   */
  private Double slidingDistanceAverage(List<Double> normDis) {
```

### JavadocDeclaration
`@return` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/ProvinceProximityScorer.java`
#### Snippet
```java
   * mentions, based on proximity within the text, should be used to score the
   * Named Entity.
   * @return
   */
  public List<LinkedSpan> score(List<LinkedSpan> linkedData, Map<String, Set<Integer>> countryHits, Map<String, Set<String>> nameCodesMap, String docText, Span[] sentences, Integer maxAllowedDist) {
```

### JavadocDeclaration
`@param w` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/indexing/RegionProcessor.java`
#### Snippet
```java
   * @param outputCountryContextfile this is the country context files shared by
   * all indexing processors
   * @param w
   */
  public static void process(File regionsFile, File outputCountryContextfile, IndexWriter w) {
```

### JavadocDeclaration
`@return` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/FuzzyStringMatchScorer.java`
#### Snippet
```java
   * @param s2 second string
   * @param nGrams number of chars in each gram
   * @return
   */
  public double getDiceCoefficient(String s1, String s2, int nGrams) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/indexing/GeonamesProcessor.java`
#### Snippet
```java
   * @param countrycodes the country code info
   * @param w the lucene index writer
   * @throws Exception
   */
  public static void readFile(File gazateerInputData, GazetteerIndexer.GazType type, Map<String, AdminBoundary> adms, Map<String, String> countrycodes, IndexWriter w) throws Exception {
```

### JavadocDeclaration
`@param supportTokenizer` tag description is missing
in `japanese-addon/src/main/java/opennlp/tools/util/featuregen/lang/jpn/TokenPatternFeatureGenerator.java`
#### Snippet
```java
   * Initializes a new instance.
   *
   * @param supportTokenizer
   */
  public TokenPatternFeatureGenerator(Tokenizer supportTokenizer) {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `gazCache` may be 'final'
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/GazetteerSearchCache.java`
#### Snippet
```java
public class GazetteerSearchCache {

  private static Map<String, ArrayList<GazetteerEntry>> gazCache = new HashMap<>();

/**
```

### FieldMayBeFinal
Field `dictLookup` may be 'final'
in `morfologik-addon/src/main/java/opennlp/morfologik/lemmatizer/MorfologikLemmatizer.java`
#### Snippet
```java
public class MorfologikLemmatizer implements Lemmatizer {

  private IStemmer dictLookup;
  public final Set<String> constantTags = new HashSet<>(Arrays.asList("NNP", "NP00000"));

```

### FieldMayBeFinal
Field `dict` may be 'final'
in `jwnl-addon/src/main/java/opennlp/jwnl/lemmatizer/JWNLLemmatizer.java`
#### Snippet
```java
public class JWNLLemmatizer implements Lemmatizer {

  private net.didion.jwnl.dictionary.Dictionary dict;
  private MorphologicalProcessor morphy;

```

### FieldMayBeFinal
Field `boosetedTypes` may be 'final'
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/PlacetypeScorer.java`
#### Snippet
```java

  private static final String[] boosts = "ADM1 ADM1H ADM2 ADM2H ADM3 ADM3H ADM4 ADM4H ADM5 ADMD ADMDH PCLD PCLH PCLI PCLIX TERR PCLIX PPL PPLA PPLA2 PPLA3 PPLA4 PPLC PPLCH PPLF PPLG PPLH PPLL PPLQ PPLR PPLS PPLX STLMT civil Populated_Place".split(" ");
  private Map<String, Double> boosetedTypes = new HashMap<>();

  public PlacetypeScorer() {
```

### FieldMayBeFinal
Field `PRECISION` may be 'final'
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/GeoHashBinningScorer.java`
#### Snippet
```java

  private final PointClustering CLUSTERER = new PointClustering();
  private int PRECISION = 3;

  @Override
```

### FieldMayBeFinal
Field `brownLexicon` may be 'final'
in `japanese-addon/src/main/java/opennlp/tools/util/featuregen/lang/jpn/BrownTokenClassFeatureGenerator.java`
#### Snippet
```java
public class BrownTokenClassFeatureGenerator implements AdaptiveFeatureGenerator {

  private BrownCluster brownLexicon;

  public BrownTokenClassFeatureGenerator(BrownCluster dict) {
```

### FieldMayBeFinal
Field `generateWordAndClassFeature` may be 'final'
in `japanese-addon/src/main/java/opennlp/tools/util/featuregen/lang/jpn/TokenClassFeatureGenerator.java`
#### Snippet
```java
  private static final String TOKEN_AND_CLASS_PREFIX = "w&c";

  private boolean generateWordAndClassFeature;

  public TokenClassFeatureGenerator() {
```

### FieldMayBeFinal
Field `tokenizer` may be 'final'
in `japanese-addon/src/main/java/opennlp/tools/util/featuregen/lang/jpn/TokenPatternFeatureGenerator.java`
#### Snippet
```java

  private Pattern noLetters = Pattern.compile("[^a-zA-Z]");
  private Tokenizer tokenizer;

  /**
```

### FieldMayBeFinal
Field `noLetters` may be 'final'
in `japanese-addon/src/main/java/opennlp/tools/util/featuregen/lang/jpn/TokenPatternFeatureGenerator.java`
#### Snippet
```java
public class TokenPatternFeatureGenerator implements AdaptiveFeatureGenerator {

  private Pattern noLetters = Pattern.compile("[^a-zA-Z]");
  private Tokenizer tokenizer;

```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `fields` are queried, but never updated
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/indexing/RegionProcessor.java`
#### Snippet
```java
    List<String> ccfileentries = new ArrayList<>();
    BufferedReader reader = new BufferedReader(new FileReader(gazateerInputData));
    List<String> fields = new ArrayList<>();
    int counter = 0;
    System.out.println("reading gazetteer data from Regions file...........");
```

### MismatchedCollectionQueryUpdate
Contents of collection `provs` are queried, but never updated
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/AdminBoundaryContext.java`
#### Snippet
```java
        provsForCountry = new HashMap<>();
      }
      Map<String, String> provs = new HashMap<>();

//      if (!provsForCountry.isEmpty()) {
```

### MismatchedCollectionQueryUpdate
Contents of collection `boostMap` are updated, but never queried
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/indexing/GeonamesProcessor.java`
#### Snippet
```java
    BufferedReader reader = new BufferedReader(new FileReader(gazateerInputData));
    String[] boosts = "ADM1 ADM1H ADM2 ADM2H ADM3 ADM3H ADM4 ADM4H ADM5 ADMD ADMDH PCLD PCLH PCLI PCLIX TERR PCLIX PPL PPLA PPLA2 PPLA3 PPLA4 PPLC PPLCH PPLF PPLG PPLH PPLL PPLQ PPLR PPLS PPLX STLMT".split(" ");
    Map<String, Float> boostMap = new HashMap<>();
    for (String boost : boosts) {
      boostMap.put(boost.toLowerCase(), 10f);
```

### MismatchedCollectionQueryUpdate
Contents of collection `adminBoundaryHits` are updated, but never queried
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/AdminBoundaryContextGenerator.java`
#### Snippet
```java
  private final EntityLinkerProperties properties;
  private final List<AdminBoundary> adminBoundaryData= new ArrayList<>();
  private final Set<AdminBoundary> adminBoundaryHits = new HashSet<>();
  private AdminBoundaryContext context;

```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `entry` is redundant
in `morfologik-addon/src/main/java/opennlp/morfologik/cmdline/builder/XMLDictionaryToTableTool.java`
#### Snippet
```java
  private String createEntry(String word, String tag) {
    
    String entry = SEPARATOR +// base
        word + SEPARATOR +
        tag;
```

### UnnecessaryLocalVariable
Local variable `coords` is redundant
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/PointClustering.java`
#### Snippet
```java
  public double[] geoHashToPoint(String geohash) {
    Point decode = GeohashUtils.decode(geohash, SpatialContext.GEO);
    double[] coords = new double[]{decode.getX(), decode.getY()};
    return coords;
  }
```

### UnnecessaryLocalVariable
Local variable `point` is redundant
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/PointClustering.java`
#### Snippet
```java
  public String geoHashToPointStr(String geohash) {
    Point decode = GeohashUtils.decode(geohash, SpatialContext.GEO);
    String point = decode.getX() + "," + decode.getY();
    return point;
  }
```

### UnnecessaryLocalVariable
Local variable `encodeLatLon` is redundant
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/PointClustering.java`
#### Snippet
```java
   */
  public String geoHash(Double lat, Double lon) {
    String encodeLatLon = GeohashUtils.encodeLatLon(lat, lon);
    return encodeLatLon;
  }
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/CountryProximityScorer.java`
#### Snippet
```java
      sum += d;
    }
    double result = sum / windowOfAverages.size();
    //TODO: ++ prob when large amounts of mentions for a code
    //System.out.println("avg of window:" + result);
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/ProvinceProximityScorer.java`
#### Snippet
```java
      sum += d;
    }
    double result = sum / windowOfAverages.size();
    //TODO: ++ prob when large amounts of mentions for a code
    //System.out.println("avg of window:" + result);
```

### UnnecessaryLocalVariable
Local variable `hierarchy` is redundant
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/indexing/RegionProcessor.java`
#### Snippet
```java
        String id = "rg" + counter;

        String hierarchy = placeName;

        doc.add(new TextField("hierarchy", hierarchy, Field.Store.YES));
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `morfologik-addon/src/main/java/opennlp/morfologik/builder/MorfologikDictionayBuilder.java`
#### Snippet
```java

  Properties createProperties(Charset encoding, String separator,
      EncoderType encoderType) throws FileNotFoundException, IOException {

    Properties properties = new Properties();
```

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+=` in loop
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/GazetteerSearcher.java`
#### Snippet
```java
    if (parts.length != 0) {
      for (String string : parts) {
        out += string + " AND ";
      }
      out = out.substring(0, out.lastIndexOf(" AND "));
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
The value `null` assigned to `br` is never used
in `modelbuilder-addon/src/main/java/opennlp/addons/modelbuilder/impls/FileKnownEntityProvider.java`
#### Snippet
```java
        // Done with the file
        br.close();
        br = null;
        fis = null;
      } catch (IOException ex) {
```

### UnusedAssignment
The value `null` assigned to `fis` is never used
in `modelbuilder-addon/src/main/java/opennlp/addons/modelbuilder/impls/FileKnownEntityProvider.java`
#### Snippet
```java
        br.close();
        br = null;
        fis = null;
      } catch (IOException ex) {
        Logger.getLogger(FileKnownEntityProvider.class.getName()).log(Level.SEVERE, null, ex);
```

### UnusedAssignment
Variable `left` initializer `0` is redundant
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/ModelBasedScorer.java`
#### Snippet
```java
  public String getTextChunk(int mentionIdx, String docText, int radius) {
    int docSize = docText.length();
    int left = 0, right = 0;
    left = (mentionIdx - radius < 0) ? 0 : mentionIdx - radius;
    right = (mentionIdx + radius > docSize) ? docSize : mentionIdx + radius;
```

### UnusedAssignment
Variable `right` initializer `0` is redundant
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/ModelBasedScorer.java`
#### Snippet
```java
  public String getTextChunk(int mentionIdx, String docText, int radius) {
    int docSize = docText.length();
    int left = 0, right = 0;
    left = (mentionIdx - radius < 0) ? 0 : mentionIdx - radius;
    right = (mentionIdx + radius > docSize) ? docSize : mentionIdx + radius;
```

### UnusedAssignment
Variable `chunk` initializer `""` is redundant
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/ModelBasedScorer.java`
#### Snippet
```java
    left = (mentionIdx - radius < 0) ? 0 : mentionIdx - radius;
    right = (mentionIdx + radius > docSize) ? docSize : mentionIdx + radius;
    String chunk = "";
    if (right <= left) {
      chunk = "";
```

### UnusedAssignment
The value `simpleProximityAnalysis(sentences, countryHits, linkedspan, maxAllowedDist)` assigned to `linkedspan` is never used
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/CountryProximityScorer.java`
#### Snippet
```java
    for (LinkedSpan<BaseLink> linkedspan : linkedData) {

      linkedspan = simpleProximityAnalysis(sentences, countryHits, linkedspan, maxAllowedDist);
    }
    return linkedData;
```

### UnusedAssignment
The value `simpleProximityAnalysis(sentences, countryHits, linkedspan, maxAllowedDist)` assigned to `linkedspan` is never used
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/ProvinceProximityScorer.java`
#### Snippet
```java
    for (LinkedSpan<BaseLink> linkedspan : linkedData) {

      linkedspan = simpleProximityAnalysis(sentences, countryHits, linkedspan, maxAllowedDist);
    }
    return linkedData;
```

### UnusedAssignment
The value `new HashMap<>()` assigned to `provsForCountry` is never used
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/AdminBoundaryContext.java`
#### Snippet
```java
      Map<String, String> provsForCountry = this.getProvRefMap().get(countryCode);
      if (provsForCountry == null) {
        provsForCountry = new HashMap<>();
      }
      Map<String, String> provs = new HashMap<>();
```

### UnusedAssignment
The value `values` assigned to `fields` is never used
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/indexing/USGSProcessor.java`
#### Snippet
```java
        String[] values = line.split(type.getSeparator());
        if (i == 0) {
          fields = values;
          i++;
          continue;
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `tags.size() > 0` is always `true`
in `morfologik-addon/src/main/java/opennlp/morfologik/tagdict/MorfologikTagDictionary.java`
#### Snippet
```java
        tags.add(datum.getTag().toString());
      }
      if (tags.size() > 0)
        return tags.toArray(new String[0]);
      return null;
```

### ConstantValue
Condition `keyValue == null` is always `true`
in `morfologik-addon/src/main/java/opennlp/morfologik/lemmatizer/MorfologikLemmatizer.java`
#### Snippet
```java
    if (keyValue != null) {
      lemma = keyValue;
    } else if (keyValue == null && constantTags.contains(postag)) {
      lemma = word;
    } else if (keyValue == null && word.toUpperCase().equals(word)) {
```

### ConstantValue
Condition `keyValue == null` is always `true`
in `morfologik-addon/src/main/java/opennlp/morfologik/lemmatizer/MorfologikLemmatizer.java`
#### Snippet
```java
    } else if (keyValue == null && constantTags.contains(postag)) {
      lemma = word;
    } else if (keyValue == null && word.toUpperCase().equals(word)) {
      lemma = word;
    } else {
```

### ConstantValue
Condition `baseForm == null` is always `true`
in `jwnl-addon/src/main/java/opennlp/jwnl/lemmatizer/JWNLLemmatizer.java`
#### Snippet
```java
        lemma = baseForm.getLemma().toString();
      }
      else if (baseForm == null && postag.startsWith(constantTag)) {
          lemma = word;
        }
```

### ConstantValue
Condition `!type.equals("PCLI")` is always `true` when reached
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/PlacetypeScorer.java`
#### Snippet
```java
        if (type.equals("PCLI")) {
          boosetedTypes.put(type.toLowerCase(), 1d);
        } else if ((type.startsWith("PC")|| type.startsWith("PP")) && !type.equals("PCLI")) {
          boosetedTypes.put(type.toLowerCase(), .5d);
        } else if (type.startsWith("ADM")) {
```

### ConstantValue
Condition `score == null` is always `false`
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/PlacetypeScorer.java`
#### Snippet
```java
        String type = gazetteerEntry.getItemType().toLowerCase();
        Double score = getScore(type);
        if (score == null) {
          score = 0d;
        }
```

### ConstantValue
Condition `d == null` is always `false`
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/CountryProximityScorer.java`
#### Snippet
```java
  private Double normalize(int valueToNormalize, int minimum, int maximum) {
    Double d = (double) ((1 - 0) * (valueToNormalize - minimum)) / (maximum - minimum) + 0;
    d = d == null ? 0d : d;
    return d;
  }
```

### ConstantValue
Condition `d == null` is always `false`
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/scoring/ProvinceProximityScorer.java`
#### Snippet
```java
  private Double normalize(int valueToNormalize, int minimum, int maximum) {
    Double d = (double) ((1 - 0) * (valueToNormalize - minimum)) / (maximum - minimum) + 0;
    d = d == null ? 0d : d;
    return d;
  }
```

### ConstantValue
Condition `i < fields.size() - 1` is always `false`
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/indexing/RegionProcessor.java`
#### Snippet
```java
      } else {
        Document doc = new Document();
        for (int i = 0; i < fields.size() - 1; i++) {
          doc.add(new TextField(fields.get(i), values[i].trim(), Field.Store.YES));
        }
```

### ConstantValue
Result of `fields.size()` is always '0'
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/indexing/RegionProcessor.java`
#### Snippet
```java
      } else {
        Document doc = new Document();
        for (int i = 0; i < fields.size() - 1; i++) {
          doc.add(new TextField(fields.get(i), values[i].trim(), Field.Store.YES));
        }
```

### ConstantValue
Condition `provs.isEmpty()` is always `true`
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/AdminBoundaryContext.java`
#### Snippet
```java
//        }
//      }
      if (provs.isEmpty()) {
        //got a country with no mentioned provs
        clauses.add(" countrycode:" + countryCode + gazType);
```

### ConstantValue
Condition `name == null` is always `false`
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/AdminBoundaryContextGenerator.java`
#### Snippet
```java

        String name = lookupMap.get(entry).toLowerCase();
        if (name == null) {
          continue;
        }
```

### ConstantValue
Condition `countrydata == null` is always `true`
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/AdminBoundaryContextGenerator.java`
#### Snippet
```java
  public AdminBoundaryContextGenerator(EntityLinkerProperties properties) throws IOException {
    this.properties = properties;
    if (countrydata == null) {
      String path = this.properties.getProperty("opennlp.geoentitylinker.countrycontext.filepath", "");
      if (path == null || path.trim().isEmpty()) {
```

### ConstantValue
Condition `countryContextFile == null` is always `false`
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/AdminBoundaryContextGenerator.java`
#### Snippet
```java
      }
      File countryContextFile = new File(path);
      if (countryContextFile == null || !countryContextFile.exists()) {
        throw new IOException("missing country context file");
      }
```

### ConstantValue
Condition `this.adminBoundaryData != null` is always `true`
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/AdminBoundaryContextGenerator.java`
#### Snippet
```java

  private void getContextFromFile(File countryContextFile) {
    if (this.adminBoundaryData != null && !this.adminBoundaryData.isEmpty()) {
      return;
    }
```

### ConstantValue
Condition `provMentions != null` is always `true`
in `geoentitylinker-addon/src/main/java/opennlp/addons/geoentitylinker/AdminBoundaryContextGenerator.java`
#### Snippet
```java
          if (provsForCc != null) {
            provMentions = regexfind(text, provsForCc, provHits, "province");
            if (provMentions != null) {
              for (String prov : provMentions.keySet()) {
                //fake a country hit based on a province hit... this gets fuzzy
```

