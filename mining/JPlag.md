# JPlag 
 
# Bad smells
I found 147 bad smells with 4 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryUnicodeEscape | 34 | false |
| OptionalUsedAsFieldOrParameterType | 22 | false |
| ConstantValue | 21 | false |
| FieldMayBeFinal | 11 | false |
| DataFlowIssue | 10 | false |
| CommentedOutCode | 8 | false |
| FinalMethodInFinalClass | 7 | false |
| JavadocReference | 2 | false |
| EmptyStatementBody | 2 | false |
| SimplifyStreamApiCallChains | 2 | false |
| FinalPrivateMethod | 2 | false |
| JavadocLinkAsPlainText | 2 | false |
| FieldCanBeLocal | 2 | false |
| IgnoreResultOfCall | 2 | false |
| JavadocDeclaration | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| MarkedForRemoval | 1 | false |
| UnnecessarySemicolon | 1 | false |
| PlaceholderCountMatchesArgumentCount | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| DuplicatedCode | 1 | false |
| Deprecation | 1 | false |
| ManualMinMaxCalculation | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| UnnecessaryDefault | 1 | false |
| DanglingJavadoc | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| SynchronizeOnNonFinalField | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| RedundantUnmodifiable | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
| StringConcatenationInsideStringBufferAppend | 1 | false |
## RuleId[id=MarkedForRemoval]
### MarkedForRemoval
'withBaseCodeSubmissionName(java.lang.String)' is deprecated and marked for removal
in `cli/src/main/java/de/jplag/cli/CLI.java`
#### Snippet
```java
        } else {
            logger.warn("Using legacy partial base code API. Please migrate to new full path base code API.");
            return options.withBaseCodeSubmissionName(baseCodePath);
        }
    }
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `RListener`
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

/**
 * Empty base implementation for {@link RListener} and {@link RFilterListener}.
 */
public abstract class RCombinedBaseListener implements RListener, RFilterListener {
```

### JavadocReference
Cannot resolve symbol `RFilterListener`
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

/**
 * Empty base implementation for {@link RListener} and {@link RFilterListener}.
 */
public abstract class RCombinedBaseListener implements RListener, RFilterListener {
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `languages/emf-metamodel/src/main/java/de/jplag/emf/util/AbstractModelView.java`
#### Snippet
```java
    public void writeToFile(String suffix) {
        File treeViewFile = new File(file + suffix);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(treeViewFile));) {
            if (!treeViewFile.createNewFile()) {
                logger.warn("Overwriting tree view file: {}", treeViewFile);
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Dereference of `nearest` may produce `NullPointerException`
in `core/src/main/java/de/jplag/clustering/algorithm/AgglomerativeClustering.java`
#### Snippet
```java
            ClusterConnection nearest = similarities.poll();
            // TODO Check that nearest is never null
            if (!(clusters.contains(nearest.left) && clusters.contains(nearest.right))) {
                // One cluster already part of another cluster
                continue;
```

### DataFlowIssue
Dereference of `ParsingException.wrappingExceptions(parsingExceptions)` may produce `NullPointerException`
in `languages/java/src/main/java/de/jplag/java/JavacAdapter.java`
#### Snippet
```java
        parsingExceptions.addAll(processErrors(parser.logger, listener));
        if (!parsingExceptions.isEmpty()) {
            throw ParsingException.wrappingExceptions(parsingExceptions);
        }
    }
```

### DataFlowIssue
Dereference of `best` may produce `NullPointerException`
in `core/src/main/java/de/jplag/clustering/algorithm/BayesianOptimization.java`
#### Snippet
```java
                    logger.debug(gpr.toString(minima, maxima, 100, 25, 0));
                }
                coordinates = maxAcq(gpr, best.score, poiSampler, zeroAcquisitionsCounter);
                testedCoordinates.add(coordinates);
            }
```

### DataFlowIssue
Passing a non-null argument to `Optional`
in `core/src/main/java/de/jplag/SubmissionSetBuilder.java`
#### Snippet
```java
        Submission baseCodeSubmission = processSubmission(baseCodeSubmissionDirectory.getName(), baseCodeSubmissionDirectory, false);
        logger.info("Basecode directory \"{}\" will be used.", baseCodeSubmission.getName());
        return Optional.ofNullable(baseCodeSubmission);
    }

```

### DataFlowIssue
Condition `parentNode instanceof RustParser.UseTreeContext` is redundant and can be replaced with a null check
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java
        switch (node.getText()) {
            case "*" -> {
                if (parentNode instanceof RustParser.UseTreeContext) {
                    transformToken(USE_ITEM, token);
                }
```

### DataFlowIssue
Condition `parentNode instanceof RustParser.AttrInputContext` is redundant and can be replaced with a null check
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java
            }
            case "=" -> {
                if (!(parentNode instanceof RustParser.AttrInputContext || parentNode instanceof RustParser.MacroPunctuationTokenContext
                        || parentNode instanceof RustParser.TypeParamContext || parentNode instanceof RustParser.GenericArgsBindingContext)
                        && stateContext != RustContext.MACRO_INNER) {
```

### DataFlowIssue
Condition `context instanceof RustParser.ExpressionContext` is redundant and can be replaced with a null check
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java
    @Override
    public void exitEveryRule(ParserRuleContext context) {
        if (context instanceof RustParser.ExpressionContext && context.parent instanceof RustParser.ClosureExpressionContext) {
            transformToken(CLOSURE_BODY_END, context.getStop());

```

### DataFlowIssue
Condition `context.parent instanceof RustParser.ClosureExpressionContext` is redundant and can be replaced with a null check
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java
    @Override
    public void exitEveryRule(ParserRuleContext context) {
        if (context instanceof RustParser.ExpressionContext && context.parent instanceof RustParser.ClosureExpressionContext) {
            transformToken(CLOSURE_BODY_END, context.getStop());

```

### DataFlowIssue
Condition `context.parent instanceof RustParser.ArrayElementsContext` is redundant and can be replaced with a null check
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java
        // used in various 'lists' of elements
        if (context instanceof RustParser.ExpressionContext expression) {
            if (context.parent instanceof RustParser.ArrayElementsContext) {
                transformToken(ARRAY_ELEMENT, expression.getStart());
            } else if (context.parent instanceof RustParser.CallParamsContext) {
```

### DataFlowIssue
Condition `maybeFunctionBlock instanceof RustParser.StatementsContext` is redundant and can be replaced with a null check
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java
        // may be return value
        RuleContext maybeFunctionBlock = context.parent.parent;
        boolean isImplicitReturnValue = maybeFunctionBlock instanceof RustParser.StatementsContext && (maybeFunctionBlock.getChildCount() == 1)
                && (state.getCurrentContext() == RustContext.FUNCTION_BODY) && !(context.getChild(0) instanceof RustParser.ReturnExpressionContext);

```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `core/src/main/java/de/jplag/clustering/algorithm/BFGS.java`
#### Snippet
```java
            }

            if (iter % 100 == 0) {
                // logger.info(String.format("L-BFGS-B: the function value after %3d iterations: %.5f", iter, f));
            }
```

### EmptyStatementBody
`if` statement has empty body
in `core/src/main/java/de/jplag/clustering/algorithm/BFGS.java`
#### Snippet
```java
        }

        if (slope >= 0) {
            // throw new IllegalArgumentException("Line Search: the search direction is not a descent direction, which may be caused
            // by roundoff problem.");
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
'List.of().stream()' can be replaced with 'Stream.of()'
in `endtoend-testing/src/main/java/de/jplag/endtoend/helper/TestSuiteHelper.java`
#### Snippet
```java
     */
    public static String getTestIdentifier(JPlagComparison jPlagComparison) {
        return List.of(jPlagComparison.firstSubmission(), jPlagComparison.secondSubmission()).stream().map(Submission::getRoot)
                .map(FileHelper::getFileNameWithoutFileExtension).sorted().collect(Collectors.joining("-"));

```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `core/src/main/java/de/jplag/clustering/algorithm/BFGS.java`
#### Snippet
```java
    private static int[] sortWithIndex(double[] array) {
        List<Pair<Integer, Double>> sortedPairs = IntStream.range(0, array.length).mapToObj(idx -> Pair.create(idx, array[idx]))
                .sorted(Comparator.comparingDouble(Pair::getValue)).collect(Collectors.toList());
        double[] sortedDoubles = sortedPairs.stream().mapToDouble(Pair::getValue).toArray();
        int[] sortedIndices = sortedPairs.stream().mapToInt(Pair::getKey).toArray();
```

## RuleId[id=PlaceholderCountMatchesArgumentCount]
### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `core/src/main/java/de/jplag/Submission.java`
#### Snippet
```java
            tokenList = language.parse(new HashSet<>(files));
        } catch (ParsingException e) {
            logger.warn("Failed to parse submission {} with error {}", this, e);
            tokenList = null;
            hasErrors = true;
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'withBaseCodeSubmissionName' is still used
in `core/src/main/java/de/jplag/options/JPlagOptions.java`
#### Snippet
```java
     */
    @Deprecated(since = "4.0.0", forRemoval = true)
    public JPlagOptions withBaseCodeSubmissionName(String baseCodeSubmissionName) {
        File baseCodeDirectory = new File(baseCodeSubmissionName);
        if (baseCodeDirectory.exists()) {
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `core/src/main/java/de/jplag/clustering/algorithm/BFGS.java`
#### Snippet
```java
            }

            // logger.debug("L-BFGS-B iteration {} moves from {} to {} where f(x) = {}", iter, Arrays.toString(x_old),
            // Arrays.toString(x), f);

```

### CommentedOutCode
Commented out code (2 lines)
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
        boolean prevIsWS = isLeftOperatorWS(prevToken);
        boolean nextIsWS = isRightOperatorWS(nextToken);
        // String text = tokens.getText(Interval.of(start, stop));
        // System.out.println("isPostfixOp: '"+prevToken+"','"+text+"','"+nextToken+"' is "+result);
        return !prevIsWS && nextIsWS || !prevIsWS && nextToken.getType() == Swift5Parser.DOT;
```

### CommentedOutCode
Commented out code (2 lines)
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
    public static boolean isSeparatedStatement(TokenStream tokens, int indexOfPreviousStatement) {
        SwiftSupport.fillUp(tokens);
        // System.out.println("------");
        // System.out.println("indexOfPreviousStatement: " + indexOfPreviousStatement);

```

### CommentedOutCode
Commented out code (2 lines)
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
            }
            return false;
            // String text = tokens.getText(Interval.of(indexFrom, indexTo));
            // return text.contains("\n") || text.contains(";");
        } else {
```

### CommentedOutCode
Commented out code (2 lines)
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
        boolean prevIsWS = isLeftOperatorWS(prevToken);
        boolean nextIsWS = isRightOperatorWS(nextToken);
        // String text = tokens.getText(Interval.of(start, stop));
        // System.out.println("isPrefixOp: '"+prevToken+"','"+text+"','"+nextToken+"' is "+result);
        return prevIsWS && !nextIsWS;
```

### CommentedOutCode
Commented out code (4 lines)
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
        int start = tokens.index();
        String text = tokens.getText(Interval.of(start, stop));
        // System.out.println("text: '"+text+"', op: '"+op+"', text.equals(op): '"+text.equals(op)+"'");

        // for (int i = 0; i <= stop; i++) {
```

### CommentedOutCode
Commented out code (2 lines)
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
        int stop = getLastOpTokenIndex(tokens);
        return stop != -1;
        // System.out.printf("isOpNext: i=%d t='%s'", start, lt.getText());
        // System.out.printf(", op='%s'\n", tokens.getText(Interval.of(start,stop)));
    }
```

### CommentedOutCode
Commented out code (2 lines)
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
        boolean prevIsWS = isLeftOperatorWS(prevToken);
        boolean nextIsWS = isRightOperatorWS(nextToken);
        // String text = tokens.getText(Interval.of(start, stop));
        // System.out.println("isBinaryOp: '"+prevToken+"','"+text+"','"+nextToken+"' is "+result);
        if (prevIsWS) {
```

## RuleId[id=FinalMethodInFinalClass]
### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/de/jplag/JPlagComparison.java`
#### Snippet
```java
     * @return Maximum similarity in interval [0, 1]. O means no similarity, 1 means maximum similarity.
     */
    public final double maximalSimilarity() {
        return Math.max(similarityOfFirst(), similarityOfSecond());
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/de/jplag/JPlagComparison.java`
#### Snippet
```java
     * @return Similarity of the second submission in interval [0, 1]. O means no similarity, 1 means maximum similarity.
     */
    public final double similarityOfSecond() {
        int divisor = secondSubmission.getSimilarityDivisor(true);
        return similarity(divisor);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/de/jplag/JPlagComparison.java`
#### Snippet
```java
     * @return Similarity of the first submission in interval [0, 1]. O means no similarity, 1 means maximum similarity.
     */
    public final double similarityOfFirst() {
        int divisor = firstSubmission.getSimilarityDivisor(true);
        return similarity(divisor);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/de/jplag/JPlagComparison.java`
#### Snippet
```java
     * @return Average similarity in interval [0, 1]. O means no similarity, 1 means maximum similarity.
     */
    public final double similarity() {
        boolean subtractBaseCode = firstSubmission.hasBaseCodeMatches() && secondSubmission.hasBaseCodeMatches();
        int divisorA = firstSubmission.getSimilarityDivisor(subtractBaseCode);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/de/jplag/JPlagComparison.java`
#### Snippet
```java
     * @return Minimum similarity in interval [0, 1]. O means no similarity, 1 means maximum similarity.
     */
    public final double minimalSimilarity() {
        return Math.min(similarityOfFirst(), similarityOfSecond());
    }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `languages/emf-metamodel/src/main/java/de/jplag/emf/util/EmfaticModelView.java`
#### Snippet
```java
     * Generates Emfatic code from a model resource and splits it into lines with a string builder.
     */
    private final List<String> generateEmfaticCode(StringBuilder builder, Resource modelResource) {
        Writer writer = new Writer();
        String code = writer.write(modelResource, null, null);
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `languages/emf-metamodel/src/main/java/de/jplag/emf/util/EmfaticModelView.java`
#### Snippet
```java
     * elements in subsequently generated Emfatic code while avoiding name collisions.
     */
    private final void replaceElementNamesWithHashes(Resource copiedResource) {
        AbstractMetamodelVisitor renamer = new AbstractMetamodelVisitor(false) {
            @Override
```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `languages/emf-metamodel/src/main/java/de/jplag/emf/util/EmfaticModelView.java`
#### Snippet
```java
     * Generates Emfatic code from a model resource and splits it into lines with a string builder.
     */
    private final List<String> generateEmfaticCode(StringBuilder builder, Resource modelResource) {
        Writer writer = new Writer();
        String code = writer.write(modelResource, null, null);
```

### FinalPrivateMethod
'private' method declared `final`
in `languages/emf-metamodel/src/main/java/de/jplag/emf/util/EmfaticModelView.java`
#### Snippet
```java
     * elements in subsequently generated Emfatic code while avoiding name collisions.
     */
    private final void replaceElementNamesWithHashes(Resource copiedResource) {
        AbstractMetamodelVisitor renamer = new AbstractMetamodelVisitor(false) {
            @Override
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
        SwiftSupport.fillUp(tokens);
        int stop = getLastOpTokenIndex(tokens);
        if (stop == -1)
            return false;

        int start = tokens.index();
        Token prevToken = tokens.get(start - 1); // includes hidden-channel tokens
        Token nextToken = tokens.get(stop + 1);
        boolean prevIsWS = isLeftOperatorWS(prevToken);
        boolean nextIsWS = isRightOperatorWS(nextToken);
```

## RuleId[id=Deprecation]
### Deprecation
'org.slf4j.helpers.MarkerIgnoringBase' is deprecated
in `cli/src/main/java/de/jplag/cli/logger/CollectedLogger.java`
#### Snippet
```java
 * @author Dominik Fuchss
 */
public final class CollectedLogger extends MarkerIgnoringBase {

    @Serial
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `core/src/main/java/de/jplag/reporting/reportobject/ReportObjectFactory.java`
#### Snippet
```java
        int totalComparisons = result.getAllComparisons().size();
        int numberOfMaximumComparisons = result.getOptions().maximumNumberOfComparisons();
        int shownComparisons = totalComparisons > numberOfMaximumComparisons ? numberOfMaximumComparisons : totalComparisons;
        int missingComparisons = totalComparisons > numberOfMaximumComparisons ? (totalComparisons - numberOfMaximumComparisons) : 0;
        logger.info("Total Comparisons: {}. Shown Comparisons: {}. Missing Comparisons: {}.", totalComparisons, shownComparisons, missingComparisons);
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `cli/src/main/java/de/jplag/cli/CommandLineArgument.java`
#### Snippet
```java
            builder.append(substring.substring(1));
        }
        return Messages.getString(getClass().getSimpleName() + "." + builder.toString());
    }

```

## RuleId[id=UnnecessaryDefault]
### UnnecessaryDefault
`default` branch is unnecessary
in `endtoend-testing/src/main/java/de/jplag/endtoend/model/ExpectedResult.java`
#### Snippet
```java
            case MAX -> resultSimilarityMaximum();
            case INTERSECTION -> resultMatchedTokenNumber();
            default -> throw new IllegalArgumentException("Metric not supported!");
        };
    }
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `core/src/main/java/de/jplag/clustering/algorithm/BFGS.java`
#### Snippet
```java
 */

/*******************************************************************************
 * Copyright (c) 2010-2020 Haifeng Li. All rights reserved. Smile is free software: you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License as published by the Free Software Foundation,
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `FormattedDoubleSummaryStatistics` may be 'static'
in `endtoend-testing/src/main/java/de/jplag/endtoend/helper/DeltaSummaryStatistics.java`
#### Snippet
```java
     * Customized implementation of {@link DoubleSummaryStatistics} with a customized textual representation.
     */
    private class FormattedDoubleSummaryStatistics extends DoubleSummaryStatistics {
        @Override
        public String toString() {
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `endtoend-testing/src/main/java/de/jplag/endtoend/model/Options.java`
#### Snippet
```java
/**
 * The object contains required options for the endToEndt tests which are important for the test suite. The options were
 * determined by discussion which can be found at https://github.com/jplag/JPlag/issues/590.
 */
public record Options(@JsonProperty("minimum_token_match") Integer minimumTokenMatch) {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `endtoend-testing/src/main/java/de/jplag/endtoend/model/ExpectedResult.java`
#### Snippet
```java
/**
 * contains the current comparative values for the endToEnd tests. The comparative values were determined by discussion
 * which can be found at https://github.com/jplag/JPlag/issues/548 Here this object is used for serialization and
 * deserialization of the information from json to object or object to json.
 */
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `language-api/src/main/java/de/jplag/Token.java`
#### Snippet
```java
 */
public class Token {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    /** Indicates that the requested field has no value. */
    public static final int NO_VALUE = -1;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `core/src/main/java/de/jplag/JPlagResult.java`
#### Snippet
```java

    private List<ClusteringResult<Submission>> clusteringResult;
    private final int SIMILARITY_DISTRIBUTION_SIZE = 10;

    public JPlagResult(List<JPlagComparison> comparisons, SubmissionSet submissions, long durationInMillis, JPlagOptions options) {
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `core/src/main/java/de/jplag/reporting/jsonfactory/DirectoryManager.java`
#### Snippet
```java
    public static void deleteDirectory(String path) {
        try (var f = Files.walk(Path.of(path))) {
            f.sorted(Comparator.reverseOrder()).map(Path::toFile).forEach(File::delete);
        } catch (IOException e) {
            logger.error("Could not delete folder " + path, e);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core/src/main/java/de/jplag/Submission.java`
#### Snippet
```java
        File subdirectory = Path.of(ERROR_FOLDER, subdirectoryNames).toFile();
        if (!subdirectory.exists()) {
            subdirectory.mkdirs();
        }
        return subdirectory;
```

## RuleId[id=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `tokenTypeValues`
in `core/src/main/java/de/jplag/GreedyStringTiling.java`
#### Snippet
```java
            for (int i = 0; i < tokens.size(); i++) {
                TokenType type = tokens.get(i).getType();
                synchronized (tokenTypeValues) {
                    tokenTypeValues.putIfAbsent(type, tokenTypeValues.size());
                }
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'suffix'
in `language-api/src/main/java/de/jplag/TokenPrinter.java`
#### Snippet
```java
    }

    private static List<LineData> getLineData(List<Token> fileTokens, Optional<String> suffix) {
        // We expect that all fileTokens share the same Token.file!
        File file = fileTokens.get(0).getFile();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'eObject'
in `languages/emf-metamodel/src/main/java/de/jplag/emf/MetamodelToken.java`
#### Snippet
```java
     * @param eObject is the corresponding eObject in the model from which this token was extracted
     */
    public MetamodelToken(TokenType type, File file, int line, int column, int length, Optional<EObject> eObject) {
        super(type, file, line, column, length);
        this.eObject = eObject;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'eObject'
in `languages/emf-metamodel/src/main/java/de/jplag/emf/MetamodelToken.java`
#### Snippet
```java
public class MetamodelToken extends Token {

    private final Optional<EObject> eObject;

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'suffix'
in `language-api/src/main/java/de/jplag/TokenPrinter.java`
#### Snippet
```java
     * @return the string representation.
     */
    public static String printTokens(List<Token> tokenList, File rootDirectory, Optional<String> suffix) {
        PrinterOutputBuilder builder = new PrinterOutputBuilder();
        Map<File, List<Token>> fileToTokens = groupTokensByFile(tokenList);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'targetType'
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java
    }

    private void transformToken(Optional<RustTokenType> targetType, Token token) {
        targetType.ifPresent(type -> transformToken(type, token));
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'startType'
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java
        STRUCT_INITIALISATION();

        private final Optional<RustTokenType> startType;
        private final Optional<RustTokenType> endType;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'endType'
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java

        private final Optional<RustTokenType> startType;
        private final Optional<RustTokenType> endType;

        RustContext() {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'elementTokenType'
in `languages/golang/src/main/java/de/jplag/golang/JPlagGoListener.java`
#### Snippet
```java
        private final Optional<GoTokenType> elementTokenType;

        GoBlockContext(GoTokenType beginTokenType, GoTokenType endTokenType, Optional<GoTokenType> elementTokenType) {
            this.beginTokenType = beginTokenType;
            this.endTokenType = endTokenType;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'elementTokenType'
in `languages/golang/src/main/java/de/jplag/golang/JPlagGoListener.java`
#### Snippet
```java
        private final GoTokenType beginTokenType;
        private final GoTokenType endTokenType;
        private final Optional<GoTokenType> elementTokenType;

        GoBlockContext(GoTokenType beginTokenType, GoTokenType endTokenType, Optional<GoTokenType> elementTokenType) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'defaultValue'
in `cli/src/main/java/de/jplag/cli/CommandLineArgument.java`
#### Snippet
```java
    private final NumberOfArgumentValues numberOfValues;
    private final String description;
    private final Optional<Object> defaultValue;
    private final Optional<Collection<String>> choices;
    private final Optional<String> argumentGroup;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'metaVar'
in `cli/src/main/java/de/jplag/cli/CommandLineArgument.java`
#### Snippet
```java
        private Optional<String> mutuallyExclusiveGroup = Optional.empty();
        private Optional<ArgumentAction> action = Optional.empty();
        private Optional<String> metaVar = Optional.empty();
        private Optional<NumberOfArgumentValues> nargs = Optional.empty();
        private boolean hidden;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'mutuallyExclusiveGroup'
in `cli/src/main/java/de/jplag/cli/CommandLineArgument.java`
#### Snippet
```java
    private final Optional<Collection<String>> choices;
    private final Optional<String> argumentGroup;
    private final Optional<String> mutuallyExclusiveGroup;
    private final Optional<ArgumentAction> action;
    private final Optional<String> metaVar;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'argumentGroup'
in `cli/src/main/java/de/jplag/cli/CommandLineArgument.java`
#### Snippet
```java
    private final Optional<Object> defaultValue;
    private final Optional<Collection<String>> choices;
    private final Optional<String> argumentGroup;
    private final Optional<String> mutuallyExclusiveGroup;
    private final Optional<ArgumentAction> action;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'nargs'
in `cli/src/main/java/de/jplag/cli/CommandLineArgument.java`
#### Snippet
```java
        private Optional<ArgumentAction> action = Optional.empty();
        private Optional<String> metaVar = Optional.empty();
        private Optional<NumberOfArgumentValues> nargs = Optional.empty();
        private boolean hidden;

```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'choices'
in `cli/src/main/java/de/jplag/cli/CommandLineArgument.java`
#### Snippet
```java
        private final Class<?> type;
        private Optional<Object> defaultValue = Optional.empty();
        private Optional<Collection<String>> choices = Optional.empty();
        private Optional<String> argumentGroup = Optional.empty();
        private Optional<String> mutuallyExclusiveGroup = Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'action'
in `cli/src/main/java/de/jplag/cli/CommandLineArgument.java`
#### Snippet
```java
    private final Optional<String> argumentGroup;
    private final Optional<String> mutuallyExclusiveGroup;
    private final Optional<ArgumentAction> action;
    private final Optional<String> metaVar;
    private final Class<?> type;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'metaVar'
in `cli/src/main/java/de/jplag/cli/CommandLineArgument.java`
#### Snippet
```java
    private final Optional<String> mutuallyExclusiveGroup;
    private final Optional<ArgumentAction> action;
    private final Optional<String> metaVar;
    private final Class<?> type;
    private final boolean hidden;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'argumentGroup'
in `cli/src/main/java/de/jplag/cli/CommandLineArgument.java`
#### Snippet
```java
        private Optional<Object> defaultValue = Optional.empty();
        private Optional<Collection<String>> choices = Optional.empty();
        private Optional<String> argumentGroup = Optional.empty();
        private Optional<String> mutuallyExclusiveGroup = Optional.empty();
        private Optional<ArgumentAction> action = Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'action'
in `cli/src/main/java/de/jplag/cli/CommandLineArgument.java`
#### Snippet
```java
        private Optional<String> argumentGroup = Optional.empty();
        private Optional<String> mutuallyExclusiveGroup = Optional.empty();
        private Optional<ArgumentAction> action = Optional.empty();
        private Optional<String> metaVar = Optional.empty();
        private Optional<NumberOfArgumentValues> nargs = Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'defaultValue'
in `cli/src/main/java/de/jplag/cli/CommandLineArgument.java`
#### Snippet
```java
        private final String flag;
        private final Class<?> type;
        private Optional<Object> defaultValue = Optional.empty();
        private Optional<Collection<String>> choices = Optional.empty();
        private Optional<String> argumentGroup = Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'mutuallyExclusiveGroup'
in `cli/src/main/java/de/jplag/cli/CommandLineArgument.java`
#### Snippet
```java
        private Optional<Collection<String>> choices = Optional.empty();
        private Optional<String> argumentGroup = Optional.empty();
        private Optional<String> mutuallyExclusiveGroup = Optional.empty();
        private Optional<ArgumentAction> action = Optional.empty();
        private Optional<String> metaVar = Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'choices'
in `cli/src/main/java/de/jplag/cli/CommandLineArgument.java`
#### Snippet
```java
    private final String description;
    private final Optional<Object> defaultValue;
    private final Optional<Collection<String>> choices;
    private final Optional<String> argumentGroup;
    private final Optional<String> mutuallyExclusiveGroup;
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'parentNode instanceof RustParser.AttrInputContext' covered by subsequent condition 'parentNode instanceof RustParser.MacroPunctuationTokenContext'
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java
            }
            case "=" -> {
                if (!(parentNode instanceof RustParser.AttrInputContext || parentNode instanceof RustParser.MacroPunctuationTokenContext
                        || parentNode instanceof RustParser.TypeParamContext || parentNode instanceof RustParser.GenericArgsBindingContext)
                        && stateContext != RustContext.MACRO_INNER) {
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param context` tag description is missing
in `languages/swift/src/main/java/de/jplag/swift/JPlagSwiftListener.java`
#### Snippet
```java
     * Indicates whether the given context encodes a computed read-only variable getter. An example of this is
     * <code>var example: Int { return 1 }</code>.
     * @param context
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `languages/swift/src/main/java/de/jplag/swift/JPlagSwiftListener.java`
#### Snippet
```java
     * <code>var example: Int { return 1 }</code>.
     * @param context
     * @return
     */
    private boolean isComputedReadOnlyVariableGetterContext(Getter_setter_blockContext context) {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `line` may be 'final'
in `language-api/src/main/java/de/jplag/Token.java`
#### Snippet
```java
    public static final int NO_VALUE = -1;

    private int line;
    private int column;
    private int length;
```

### FieldMayBeFinal
Field `length` may be 'final'
in `language-api/src/main/java/de/jplag/Token.java`
#### Snippet
```java
    private int line;
    private int column;
    private int length;
    private File file;
    private TokenType type;
```

### FieldMayBeFinal
Field `file` may be 'final'
in `language-api/src/main/java/de/jplag/Token.java`
#### Snippet
```java
    private int column;
    private int length;
    private File file;
    private TokenType type;

```

### FieldMayBeFinal
Field `column` may be 'final'
in `language-api/src/main/java/de/jplag/Token.java`
#### Snippet
```java

    private int line;
    private int column;
    private int length;
    private File file;
```

### FieldMayBeFinal
Field `type` may be 'final'
in `language-api/src/main/java/de/jplag/Token.java`
#### Snippet
```java
    private int length;
    private File file;
    private TokenType type;

    /**
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `language-api/src/main/java/de/jplag/Token.java`
#### Snippet
```java
 */
public class Token {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    /** Indicates that the requested field has no value. */
    public static final int NO_VALUE = -1;
```

### FieldMayBeFinal
Field `parsingExceptions` may be 'final'
in `languages/java/src/main/java/de/jplag/java/TokenGeneratingTreeScanner.java`
#### Snippet
```java
    private final CompilationUnitTree ast;

    private List<ParsingException> parsingExceptions = new ArrayList<>();

    public TokenGeneratingTreeScanner(File file, Parser parser, LineMap map, SourcePositions positions, CompilationUnitTree ast) {
```

### FieldMayBeFinal
Field `parser` may be 'final'
in `languages/emf-metamodel/src/main/java/de/jplag/emf/parser/MetamodelTokenGenerator.java`
#### Snippet
```java
 */
public class MetamodelTokenGenerator extends AbstractMetamodelVisitor {
    private EcoreParser parser;

    /**
```

### FieldMayBeFinal
Field `modelCopier` may be 'final'
in `languages/emf-metamodel/src/main/java/de/jplag/emf/util/EmfaticModelView.java`
#### Snippet
```java
    private final Map<ENamedElement, Integer> elementToLine; // maps model elements to Emfatic code line numbers

    private Copier modelCopier; // Allows to trace between original and copied elements
    private int lastLineIndex; // last line given to a token

```

### FieldMayBeFinal
Field `tokenTypeValues` may be 'final'
in `core/src/main/java/de/jplag/GreedyStringTiling.java`
#### Snippet
```java

    private final int minimumMatchLength;
    private ConcurrentMap<TokenType, Integer> tokenTypeValues;
    private final Map<Submission, Set<Token>> baseCodeMarkings = new IdentityHashMap<>();

```

### FieldMayBeFinal
Field `mutuallyExclusiveGroup` may be 'final'
in `cli/src/main/java/de/jplag/cli/CommandLineArgument.java`
#### Snippet
```java
        private Optional<Collection<String>> choices = Optional.empty();
        private Optional<String> argumentGroup = Optional.empty();
        private Optional<String> mutuallyExclusiveGroup = Optional.empty();
        private Optional<ArgumentAction> action = Optional.empty();
        private Optional<String> metaVar = Optional.empty();
```

## RuleId[id=UnnecessaryUnicodeEscape]
### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00A1` can be replaced with '¡'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java

    /*
     * operator-head : / = - + ! * % < > & | ^ ~ ? | [\u00A1-\u00A7] | [\u00A9\u00AB] | [\u00AC\u00AE] |
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00A7` can be replaced with '§'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java

    /*
     * operator-head : / = - + ! * % < > & | ^ ~ ? | [\u00A1-\u00A7] | [\u00A9\u00AB] | [\u00AC\u00AE] |
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00A9` can be replaced with '©'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java

    /*
     * operator-head : / = - + ! * % < > & | ^ ~ ? | [\u00A1-\u00A7] | [\u00A9\u00AB] | [\u00AC\u00AE] |
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00AB` can be replaced with '\<\<'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java

    /*
     * operator-head : / = - + ! * % < > & | ^ ~ ? | [\u00A1-\u00A7] | [\u00A9\u00AB] | [\u00AC\u00AE] |
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00AC` can be replaced with '¬'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java

    /*
     * operator-head : / = - + ! * % < > & | ^ ~ ? | [\u00A1-\u00A7] | [\u00A9\u00AB] | [\u00AC\u00AE] |
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00AE` can be replaced with '®'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java

    /*
     * operator-head : / = - + ! * % < > & | ^ ~ ? | [\u00A1-\u00A7] | [\u00A9\u00AB] | [\u00AC\u00AE] |
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00B0` can be replaced with '°'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
    /*
     * operator-head : / = - + ! * % < > & | ^ ~ ? | [\u00A1-\u00A7] | [\u00A9\u00AB] | [\u00AC\u00AE] |
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
     * [\u3008-\u3030] ;
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00B1` can be replaced with '±'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
    /*
     * operator-head : / = - + ! * % < > & | ^ ~ ? | [\u00A1-\u00A7] | [\u00A9\u00AB] | [\u00AC\u00AE] |
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
     * [\u3008-\u3030] ;
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00B6` can be replaced with '¶'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
    /*
     * operator-head : / = - + ! * % < > & | ^ ~ ? | [\u00A1-\u00A7] | [\u00A9\u00AB] | [\u00AC\u00AE] |
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
     * [\u3008-\u3030] ;
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00BB` can be replaced with '\>\>'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
    /*
     * operator-head : / = - + ! * % < > & | ^ ~ ? | [\u00A1-\u00A7] | [\u00A9\u00AB] | [\u00AC\u00AE] |
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
     * [\u3008-\u3030] ;
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00BF` can be replaced with '¿'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
    /*
     * operator-head : / = - + ! * % < > & | ^ ~ ? | [\u00A1-\u00A7] | [\u00A9\u00AB] | [\u00AC\u00AE] |
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
     * [\u3008-\u3030] ;
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00D7` can be replaced with '×'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
    /*
     * operator-head : / = - + ! * % < > & | ^ ~ ? | [\u00A1-\u00A7] | [\u00A9\u00AB] | [\u00AC\u00AE] |
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
     * [\u3008-\u3030] ;
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00F7` can be replaced with '÷'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
    /*
     * operator-head : / = - + ! * % < > & | ^ ~ ? | [\u00A1-\u00A7] | [\u00A9\u00AB] | [\u00AC\u00AE] |
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
     * [\u3008-\u3030] ;
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2016` can be replaced with '‖'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
    /*
     * operator-head : / = - + ! * % < > & | ^ ~ ? | [\u00A1-\u00A7] | [\u00A9\u00AB] | [\u00AC\u00AE] |
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
     * [\u3008-\u3030] ;
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2017` can be replaced with '‗'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
    /*
     * operator-head : / = - + ! * % < > & | ^ ~ ? | [\u00A1-\u00A7] | [\u00A9\u00AB] | [\u00AC\u00AE] |
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
     * [\u3008-\u3030] ;
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2020` can be replaced with '†'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
    /*
     * operator-head : / = - + ! * % < > & | ^ ~ ? | [\u00A1-\u00A7] | [\u00A9\u00AB] | [\u00AC\u00AE] |
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
     * [\u3008-\u3030] ;
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2027` can be replaced with '‧'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
    /*
     * operator-head : / = - + ! * % < > & | ^ ~ ? | [\u00A1-\u00A7] | [\u00A9\u00AB] | [\u00AC\u00AE] |
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
     * [\u3008-\u3030] ;
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2030` can be replaced with '‰'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
    /*
     * operator-head : / = - + ! * % < > & | ^ ~ ? | [\u00A1-\u00A7] | [\u00A9\u00AB] | [\u00AC\u00AE] |
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
     * [\u3008-\u3030] ;
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u203E` can be replaced with '‾'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
    /*
     * operator-head : / = - + ! * % < > & | ^ ~ ? | [\u00A1-\u00A7] | [\u00A9\u00AB] | [\u00AC\u00AE] |
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
     * [\u3008-\u3030] ;
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2041` can be replaced with '⁁'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
    /*
     * operator-head : / = - + ! * % < > & | ^ ~ ? | [\u00A1-\u00A7] | [\u00A9\u00AB] | [\u00AC\u00AE] |
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
     * [\u3008-\u3030] ;
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2053` can be replaced with '⁓'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
    /*
     * operator-head : / = - + ! * % < > & | ^ ~ ? | [\u00A1-\u00A7] | [\u00A9\u00AB] | [\u00AC\u00AE] |
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
     * [\u3008-\u3030] ;
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2055` can be replaced with '⁕'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
     * operator-head : / = - + ! * % < > & | ^ ~ ? | [\u00A1-\u00A7] | [\u00A9\u00AB] | [\u00AC\u00AE] |
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
     * [\u3008-\u3030] ;
     */
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u205E` can be replaced with '⁞'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
     * operator-head : / = - + ! * % < > & | ^ ~ ? | [\u00A1-\u00A7] | [\u00A9\u00AB] | [\u00AC\u00AE] |
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
     * [\u3008-\u3030] ;
     */
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2190` can be replaced with '←'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
     * operator-head : / = - + ! * % < > & | ^ ~ ? | [\u00A1-\u00A7] | [\u00A9\u00AB] | [\u00AC\u00AE] |
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
     * [\u3008-\u3030] ;
     */
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u23FF` can be replaced with '⏿'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
     * operator-head : / = - + ! * % < > & | ^ ~ ? | [\u00A1-\u00A7] | [\u00A9\u00AB] | [\u00AC\u00AE] |
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
     * [\u3008-\u3030] ;
     */
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2500` can be replaced with '─'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
     * operator-head : / = - + ! * % < > & | ^ ~ ? | [\u00A1-\u00A7] | [\u00A9\u00AB] | [\u00AC\u00AE] |
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
     * [\u3008-\u3030] ;
     */
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2775` can be replaced with '❵'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
     * operator-head : / = - + ! * % < > & | ^ ~ ? | [\u00A1-\u00A7] | [\u00A9\u00AB] | [\u00AC\u00AE] |
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
     * [\u3008-\u3030] ;
     */
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2794` can be replaced with '➔'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
     * operator-head : / = - + ! * % < > & | ^ ~ ? | [\u00A1-\u00A7] | [\u00A9\u00AB] | [\u00AC\u00AE] |
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
     * [\u3008-\u3030] ;
     */
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2BFF` can be replaced with '⯿'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
     * operator-head : / = - + ! * % < > & | ^ ~ ? | [\u00A1-\u00A7] | [\u00A9\u00AB] | [\u00AC\u00AE] |
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
     * [\u3008-\u3030] ;
     */
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2E00` can be replaced with '⸀'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
     * operator-head : / = - + ! * % < > & | ^ ~ ? | [\u00A1-\u00A7] | [\u00A9\u00AB] | [\u00AC\u00AE] |
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
     * [\u3008-\u3030] ;
     */
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u3001` can be replaced with '、'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
     * operator-head : / = - + ! * % < > & | ^ ~ ? | [\u00A1-\u00A7] | [\u00A9\u00AB] | [\u00AC\u00AE] |
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
     * [\u3008-\u3030] ;
     */
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u3003` can be replaced with '〃'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
     * operator-head : / = - + ! * % < > & | ^ ~ ? | [\u00A1-\u00A7] | [\u00A9\u00AB] | [\u00AC\u00AE] |
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
     * [\u3008-\u3030] ;
     */
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u3008` can be replaced with '〈'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
     * [\u3008-\u3030] ;
     */
    public static final BitSet operatorHead = new BitSet(0x10000);
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u3030` can be replaced with '〰'
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
     * [\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7] | [\u2016-\u2017\u2020-\u2027] | [\u2030-\u203E] | [\u2041-\u2053] |
     * [\u2055-\u205E] | [\u2190-\u23FF] | [\u2500-\u2775] | [\u2794-\u2BFF] | [\u2E00-\u2E7F] | [\u3001-\u3003] |
     * [\u3008-\u3030] ;
     */
    public static final BitSet operatorHead = new BitSet(0x10000);
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `c` is redundant
in `core/src/main/java/de/jplag/clustering/algorithm/BFGS.java`
#### Snippet
```java
         */
        public Matrix ata() {
            Matrix c = new Matrix(d.transpose().multiply(d));
            // c.mm(TRANSPOSE, 1this, NO_TRANSPOSE, this);
            // c.uplo(LOWER);
```

### UnnecessaryLocalVariable
Local variable `xtol` is redundant
in `core/src/main/java/de/jplag/clustering/algorithm/BFGS.java`
#### Snippet
```java
        // Termination occurs when the relative width of the interval
        // of uncertainty is at most xtol.
        final double xtol = EPSILON;
        // Tolerance for the sufficient decrease condition.
        final double ftol = 1.0E-4;
```

## RuleId[id=RedundantUnmodifiable]
### RedundantUnmodifiable
Redundant usage of the 'unmodifiableList' wrapper
in `core/src/main/java/de/jplag/clustering/ClusteringResult.java`
#### Snippet
```java

    public Collection<Cluster<T>> getClusters() {
        return Collections.unmodifiableList(clusters);
    }

```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `parentNode instanceof RustParser.MacroPunctuationTokenContext` is always `false`
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java
            }
            case "=" -> {
                if (!(parentNode instanceof RustParser.AttrInputContext || parentNode instanceof RustParser.MacroPunctuationTokenContext
                        || parentNode instanceof RustParser.TypeParamContext || parentNode instanceof RustParser.GenericArgsBindingContext)
                        && stateContext != RustContext.MACRO_INNER) {
```

### ConstantValue
Value `parentNode` is always 'null'
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java
            }
            case "=" -> {
                if (!(parentNode instanceof RustParser.AttrInputContext || parentNode instanceof RustParser.MacroPunctuationTokenContext
                        || parentNode instanceof RustParser.TypeParamContext || parentNode instanceof RustParser.GenericArgsBindingContext)
                        && stateContext != RustContext.MACRO_INNER) {
```

### ConstantValue
Condition `parentNode instanceof RustParser.TypeParamContext` is always `false`
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java
            case "=" -> {
                if (!(parentNode instanceof RustParser.AttrInputContext || parentNode instanceof RustParser.MacroPunctuationTokenContext
                        || parentNode instanceof RustParser.TypeParamContext || parentNode instanceof RustParser.GenericArgsBindingContext)
                        && stateContext != RustContext.MACRO_INNER) {
                    transformToken(ASSIGNMENT, token);
```

### ConstantValue
Value `parentNode` is always 'null'
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java
            case "=" -> {
                if (!(parentNode instanceof RustParser.AttrInputContext || parentNode instanceof RustParser.MacroPunctuationTokenContext
                        || parentNode instanceof RustParser.TypeParamContext || parentNode instanceof RustParser.GenericArgsBindingContext)
                        && stateContext != RustContext.MACRO_INNER) {
                    transformToken(ASSIGNMENT, token);
```

### ConstantValue
Condition `parentNode instanceof RustParser.GenericArgsBindingContext` is always `false`
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java
            case "=" -> {
                if (!(parentNode instanceof RustParser.AttrInputContext || parentNode instanceof RustParser.MacroPunctuationTokenContext
                        || parentNode instanceof RustParser.TypeParamContext || parentNode instanceof RustParser.GenericArgsBindingContext)
                        && stateContext != RustContext.MACRO_INNER) {
                    transformToken(ASSIGNMENT, token);
```

### ConstantValue
Value `parentNode` is always 'null'
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java
            case "=" -> {
                if (!(parentNode instanceof RustParser.AttrInputContext || parentNode instanceof RustParser.MacroPunctuationTokenContext
                        || parentNode instanceof RustParser.TypeParamContext || parentNode instanceof RustParser.GenericArgsBindingContext)
                        && stateContext != RustContext.MACRO_INNER) {
                    transformToken(ASSIGNMENT, token);
```

### ConstantValue
Condition `Objects.nonNull(elements)` is always `false`
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java
        var elements = context.getChild(RustParser.TupleElementsContext.class, 0);
        // one child = exactly one subtree and no trailing comma
        if (Objects.nonNull(elements) && elements.getChildCount() == 1) {
            state.enter(RustContext.REDUNDANT_TUPLE);
        }
```

### ConstantValue
Condition `Objects.nonNull(elements) && elements.getChildCount() == 1` is always `false`
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java
        var elements = context.getChild(RustParser.TupleElementsContext.class, 0);
        // one child = exactly one subtree and no trailing comma
        if (Objects.nonNull(elements) && elements.getChildCount() == 1) {
            state.enter(RustContext.REDUNDANT_TUPLE);
        }
```

### ConstantValue
Value `elements` is always 'null'
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java
        var elements = context.getChild(RustParser.TupleElementsContext.class, 0);
        // one child = exactly one subtree and no trailing comma
        if (Objects.nonNull(elements) && elements.getChildCount() == 1) {
            state.enter(RustContext.REDUNDANT_TUPLE);
        }
```

### ConstantValue
Condition `context.parent instanceof RustParser.CallParamsContext` is always `false`
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java
            if (context.parent instanceof RustParser.ArrayElementsContext) {
                transformToken(ARRAY_ELEMENT, expression.getStart());
            } else if (context.parent instanceof RustParser.CallParamsContext) {
                transformToken(ARGUMENT, expression.getStart(), expression.getStop());
            } else if (context.parent instanceof RustParser.TuplePatternItemsContext || context.parent instanceof RustParser.TupleElementsContext) {
```

### ConstantValue
Value `context.parent` is always 'null'
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java
            if (context.parent instanceof RustParser.ArrayElementsContext) {
                transformToken(ARRAY_ELEMENT, expression.getStart());
            } else if (context.parent instanceof RustParser.CallParamsContext) {
                transformToken(ARGUMENT, expression.getStart(), expression.getStop());
            } else if (context.parent instanceof RustParser.TuplePatternItemsContext || context.parent instanceof RustParser.TupleElementsContext) {
```

### ConstantValue
Condition `context.parent instanceof RustParser.TuplePatternItemsContext` is always `false`
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java
            } else if (context.parent instanceof RustParser.CallParamsContext) {
                transformToken(ARGUMENT, expression.getStart(), expression.getStop());
            } else if (context.parent instanceof RustParser.TuplePatternItemsContext || context.parent instanceof RustParser.TupleElementsContext) {
                if (state.getCurrentContext() == RustContext.REDUNDANT_TUPLE)
                    return;
```

### ConstantValue
Condition `context.parent instanceof RustParser.TuplePatternItemsContext || context.parent instanceof RustParse...` is always `false`
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java
            } else if (context.parent instanceof RustParser.CallParamsContext) {
                transformToken(ARGUMENT, expression.getStart(), expression.getStop());
            } else if (context.parent instanceof RustParser.TuplePatternItemsContext || context.parent instanceof RustParser.TupleElementsContext) {
                if (state.getCurrentContext() == RustContext.REDUNDANT_TUPLE)
                    return;
```

### ConstantValue
Value `context.parent` is always 'null'
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java
            } else if (context.parent instanceof RustParser.CallParamsContext) {
                transformToken(ARGUMENT, expression.getStart(), expression.getStop());
            } else if (context.parent instanceof RustParser.TuplePatternItemsContext || context.parent instanceof RustParser.TupleElementsContext) {
                if (state.getCurrentContext() == RustContext.REDUNDANT_TUPLE)
                    return;
```

### ConstantValue
Condition `context.parent instanceof RustParser.TupleElementsContext` is always `false` when reached
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java
            } else if (context.parent instanceof RustParser.CallParamsContext) {
                transformToken(ARGUMENT, expression.getStart(), expression.getStop());
            } else if (context.parent instanceof RustParser.TuplePatternItemsContext || context.parent instanceof RustParser.TupleElementsContext) {
                if (state.getCurrentContext() == RustContext.REDUNDANT_TUPLE)
                    return;
```

### ConstantValue
Value `context.parent` is always 'null'
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java
            } else if (context.parent instanceof RustParser.CallParamsContext) {
                transformToken(ARGUMENT, expression.getStart(), expression.getStop());
            } else if (context.parent instanceof RustParser.TuplePatternItemsContext || context.parent instanceof RustParser.TupleElementsContext) {
                if (state.getCurrentContext() == RustContext.REDUNDANT_TUPLE)
                    return;
```

### ConstantValue
Condition `context.parent instanceof RustParser.ClosureExpressionContext` is always `false`
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java
                    return;
                transformToken(TUPLE_ELEMENT, expression.getStart());
            } else if (context.parent instanceof RustParser.ClosureExpressionContext) {
                transformToken(CLOSURE_BODY_START, context.getStart());
                transformToken(RETURN, expression.getStart());
```

### ConstantValue
Value `context.parent` is always 'null'
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java
                    return;
                transformToken(TUPLE_ELEMENT, expression.getStart());
            } else if (context.parent instanceof RustParser.ClosureExpressionContext) {
                transformToken(CLOSURE_BODY_START, context.getStart());
                transformToken(RETURN, expression.getStart());
```

### ConstantValue
Condition `caseBlock != null` is always `false`
in `languages/golang/src/main/java/de/jplag/golang/JPlagGoListener.java`
#### Snippet
```java
        transformToken(SWITCH_CASE, context.getStart());
        var caseBlock = context.getChild(GoParser.StatementListContext.class, 0);
        if (caseBlock != null) {
            enterContext(GoBlockContext.CASE_BLOCK);
            transformToken(CASE_BLOCK_BEGIN, caseBlock.getStart());
```

### ConstantValue
Condition `caseBlock != null` is always `false`
in `languages/golang/src/main/java/de/jplag/golang/JPlagGoListener.java`
#### Snippet
```java
        transformToken(SWITCH_CASE, context.getStart());
        var caseBlock = context.getChild(GoParser.StatementListContext.class, 0);
        if (caseBlock != null) {
            enterContext(GoBlockContext.CASE_BLOCK);
            transformToken(CASE_BLOCK_BEGIN, caseBlock.getStart());
```

### ConstantValue
Condition `caseBlock != null` is always `false`
in `languages/golang/src/main/java/de/jplag/golang/JPlagGoListener.java`
#### Snippet
```java
        transformToken(SWITCH_CASE, context.getStart());
        var caseBlock = context.getChild(GoParser.StatementListContext.class, 0);
        if (caseBlock != null) {
            enterContext(GoBlockContext.CASE_BLOCK);
            transformToken(CASE_BLOCK_BEGIN, caseBlock.getStart());
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`OptionalDouble.getAsDouble()` without 'isPresent()' check
in `core/src/main/java/de/jplag/clustering/ClusteringResult.java`
#### Snippet
```java
    public double getWorth(BiFunction<T, T, Double> similarity) {
        return getClusters().stream().mapToDouble(c -> c.getWorth(similarity)).map(worth -> Double.isFinite(worth) ? worth : 0).average()
                .getAsDouble();
    }

```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `languages/emf-metamodel/src/main/java/de/jplag/emf/util/MetamodelTreeView.java`
#### Snippet
```java
                viewBuilder.append(tokenText);
            } else {
                viewBuilder.append(prefix + tokenText);
                columnIndex += prefix.length();
            }
```

