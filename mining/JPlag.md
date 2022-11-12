# jplag/JPlag
# Bad smells
I found 264 bad smells with 5 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=EmptyMethod] | 47 | false |
| RuleId[ruleID=BoundedWildcard] | 40 | false |
| RuleId[ruleID=OptionalUsedAsFieldOrParameterType] | 22 | false |
| RuleId[ruleID=ConstantValue] | 21 | false |
| RuleId[ruleID=ClassNameSameAsAncestorName] | 13 | false |
| RuleId[ruleID=DataFlowIssue] | 11 | false |
| RuleId[ruleID=RedundantFieldInitialization] | 11 | false |
| RuleId[ruleID=ReturnNull] | 11 | false |
| RuleId[ruleID=NonSerializableFieldInSerializableClass] | 9 | false |
| RuleId[ruleID=CommentedOutCode] | 8 | false |
| RuleId[ruleID=AssignmentToMethodParameter] | 7 | false |
| RuleId[ruleID=ObsoleteCollection] | 6 | false |
| RuleId[ruleID=AbstractClassNeverImplemented] | 6 | false |
| RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator] | 6 | false |
| RuleId[ruleID=UtilityClassWithoutPrivateConstructor] | 5 | false |
| RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern] | 5 | false |
| RuleId[ruleID=IgnoreResultOfCall] | 3 | false |
| RuleId[ruleID=FieldMayBeStatic] | 2 | false |
| RuleId[ruleID=SimplifyStreamApiCallChains] | 2 | false |
| RuleId[ruleID=OptionalContainsCollection] | 2 | false |
| RuleId[ruleID=SizeReplaceableByIsEmpty] | 2 | true |
| RuleId[ruleID=UnnecessaryFullyQualifiedName] | 2 | false |
| RuleId[ruleID=UnnecessaryLocalVariable] | 2 | true |
| RuleId[ruleID=ZeroLengthArrayInitialization] | 2 | false |
| RuleId[ruleID=MarkedForRemoval] | 1 | false |
| RuleId[ruleID=UnnecessarySemicolon] | 1 | false |
| RuleId[ruleID=DeprecatedIsStillUsed] | 1 | false |
| RuleId[ruleID=ComparatorCombinators] | 1 | false |
| RuleId[ruleID=PatternVariableCanBeUsed] | 1 | false |
| RuleId[ruleID=EnhancedSwitchMigration] | 1 | false |
| RuleId[ruleID=AssignmentToForLoopParameter] | 1 | false |
| RuleId[ruleID=ConstantMathCall] | 1 | false |
| RuleId[ruleID=UnnecessaryToStringCall] | 1 | true |
| RuleId[ruleID=SynchronizeOnNonFinalField] | 1 | false |
| RuleId[ruleID=SystemOutErr] | 1 | false |
| RuleId[ruleID=RedundantStreamOptionalCall] | 1 | false |
| RuleId[ruleID=ConditionCoveredByFurtherCondition] | 1 | false |
| RuleId[ruleID=NestedAssignment] | 1 | false |
| RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized] | 1 | false |
| RuleId[ruleID=HtmlWrongAttributeValue] | 1 | false |
| RuleId[ruleID=RedundantUnmodifiable] | 1 | false |
| RuleId[ruleID=OptionalGetWithoutIsPresent] | 1 | false |
| RuleId[ruleID=StringConcatenationInsideStringBufferAppend] | 1 | false |
## RuleId[ruleID=FieldMayBeStatic]
### RuleId[ruleID=FieldMayBeStatic]
Field `currentLogLevel` may be 'static'
in `cli/src/main/java/de/jplag/logger/CollectedLogger.java`
#### Snippet
```java
    private static final int LOG_LEVEL_ERROR = LocationAwareLogger.ERROR_INT;

    private final int currentLogLevel = LOG_LEVEL_INFO;

    /**
```

### RuleId[ruleID=FieldMayBeStatic]
Field `SIMILARITY_DISTRIBUTION_SIZE` may be 'static'
in `core/src/main/java/de/jplag/JPlagResult.java`
#### Snippet
```java

    private List<ClusteringResult<Submission>> clusteringResult;
    private final int SIMILARITY_DISTRIBUTION_SIZE = 10;

    public JPlagResult(List<JPlagComparison> comparisons, SubmissionSet submissions, long durationInMillis, JPlagOptions options) {
```

## RuleId[ruleID=MarkedForRemoval]
### RuleId[ruleID=MarkedForRemoval]
'withBaseCodeSubmissionName(java.lang.String)' is deprecated and marked for removal
in `cli/src/main/java/de/jplag/CLI.java`
#### Snippet
```java
        } else {
            logger.warn("Using legacy partial base code API. Please migrate to new full path base code API.");
            return options.withBaseCodeSubmissionName(baseCodePath);
        }
    }
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `SwiftSupport` has only 'static' members, and lacks a 'private' constructor
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
// Taken from https://github.com/antlr/grammars-v4/tree/master/swift/swift5 Commit
// 2f6c19cc742c60541227b19c45ac2acc844d9b1a
public class SwiftSupport {
    /*
     * TODO There is one caveat to the rules above. If the ! or ? predefined operator has no whitespace on the left, it is
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ClusteringFactory` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/de/jplag/clustering/ClusteringFactory.java`
#### Snippet
```java
 * Runs the clustering according to an options object.
 */
public class ClusteringFactory {
    private static final String CLUSTER_PATTERN = " cluster strength: {}, avg similarity: {}%, members: {}";
    private static final String CLUSTERING_RESULT = "{} clusters were found:";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `DirectoryManager` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/de/jplag/reporting/jsonfactory/DirectoryManager.java`
#### Snippet
```java
 * Provides Methods for creating directories.
 */
public class DirectoryManager {
    private static final Logger logger = LoggerFactory.getLogger(DirectoryManager.class);

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `SubmissionNameToIdMapper` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/de/jplag/reporting/reportobject/mapper/SubmissionNameToIdMapper.java`
#### Snippet
```java
 * the sanitized version of the {@link Submission#getName()} serves as report viewer id.
 */
public class SubmissionNameToIdMapper {

    private static final String FILE_SEPARATOR_REPLACEMENT = "_";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `BFGS` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/de/jplag/clustering/algorithm/BFGS.java`
#### Snippet
```java
 * @author Haifeng Li
 */
public class BFGS {
    // private static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(BFGS.class);
    /** A number close to zero, between machine epsilon and its square root. */
```

## RuleId[ruleID=UnnecessarySemicolon]
### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `languages/emf-metamodel/src/main/java/de/jplag/emf/util/MetamodelTreeView.java`
#### Snippet
```java
    public void writeToFile(String suffix) {
        File treeViewFile = new File(file + suffix);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(treeViewFile));) {
            if (!treeViewFile.createNewFile()) {
                logger.warn("Overwriting tree view file: {}", treeViewFile);
```

## RuleId[ruleID=DataFlowIssue]
### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
Dereference of `files` may produce `NullPointerException`
in `endtoend-testing/src/main/java/de/jplag/endtoend/helper/FileHelper.java`
#### Snippet
```java
    public static String[] loadAllTestFileNames(Path resourcenPaths) {
        var files = resourcenPaths.toFile().listFiles();
        String[] fileNames = new String[files.length];
        for (int i = 0; i < files.length; i++) {
            fileNames[i] = files[i].getName();
```

### RuleId[ruleID=DataFlowIssue]
Passing a non-null argument to `Optional`
in `core/src/main/java/de/jplag/SubmissionSetBuilder.java`
#### Snippet
```java
        Submission baseCodeSubmission = processSubmission(baseCodeSubmissionDirectory.getName(), baseCodeSubmissionDirectory, false);
        logger.info("Basecode directory \"{}\" will be used.", baseCodeSubmission.getName());
        return Optional.ofNullable(baseCodeSubmission);
    }

```

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
Condition `context instanceof RustParser.ExpressionContext` is redundant and can be replaced with a null check
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java
    @Override
    public void exitEveryRule(ParserRuleContext context) {
        if (context instanceof RustParser.ExpressionContext && context.parent instanceof RustParser.ClosureExpressionContext) {
            transformToken(CLOSURE_BODY_END, context.getStop());

```

### RuleId[ruleID=DataFlowIssue]
Condition `context.parent instanceof RustParser.ClosureExpressionContext` is redundant and can be replaced with a null check
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java
    @Override
    public void exitEveryRule(ParserRuleContext context) {
        if (context instanceof RustParser.ExpressionContext && context.parent instanceof RustParser.ClosureExpressionContext) {
            transformToken(CLOSURE_BODY_END, context.getStop());

```

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
Condition `maybeFunctionBlock instanceof RustParser.StatementsContext` is redundant and can be replaced with a null check
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java
        // may be return value
        RuleContext maybeFunctionBlock = context.parent.parent;
        boolean isImplicitReturnValue = maybeFunctionBlock instanceof RustParser.StatementsContext && (maybeFunctionBlock.getChildCount() == 1)
                && (state.getCurrentContext() == RustContext.FUNCTION_BODY) && !(context.getChild(0) instanceof RustParser.ReturnExpressionContext);

```

## RuleId[ruleID=SimplifyStreamApiCallChains]
### RuleId[ruleID=SimplifyStreamApiCallChains]
'List.of().stream()' can be replaced with 'Stream.of()'
in `endtoend-testing/src/main/java/de/jplag/endtoend/helper/TestSuiteHelper.java`
#### Snippet
```java
    public static String getTestIdentifier(JPlagComparison jPlagComparison) {

        return List.of(jPlagComparison.firstSubmission(), jPlagComparison.secondSubmission()).stream().map(Submission::getFiles)
                .map(FileHelper::getEnclosedFileNamesFromCollection).sorted().collect(Collectors.joining("-"));

```

### RuleId[ruleID=SimplifyStreamApiCallChains]
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

## RuleId[ruleID=DeprecatedIsStillUsed]
### RuleId[ruleID=DeprecatedIsStillUsed]
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

## RuleId[ruleID=OptionalContainsCollection]
### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `Collection`
in `cli/src/main/java/de/jplag/CommandLineArgument.java`
#### Snippet
```java
        private final Class<?> type;
        private Optional<Object> defaultValue = Optional.empty();
        private Optional<Collection<String>> choices = Optional.empty();
        private Optional<String> argumentGroup = Optional.empty();
        private Optional<String> mutuallyExclusiveGroup = Optional.empty();
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `Collection`
in `cli/src/main/java/de/jplag/CommandLineArgument.java`
#### Snippet
```java
    private final String description;
    private final Optional<Object> defaultValue;
    private final Optional<Collection<String>> choices;
    private final Optional<String> argumentGroup;
    private final Optional<String> mutuallyExclusiveGroup;
```

## RuleId[ruleID=CommentedOutCode]
### RuleId[ruleID=CommentedOutCode]
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

### RuleId[ruleID=CommentedOutCode]
Commented out code (2 lines)
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
    public static boolean isSeparatedStatement(TokenStream tokens, int indexOfPreviousStatement) {
        SwiftSupport.fillUp(tokens);
        // System.out.println("------");
        // System.out.println("indexOfPreviousStatement: " + indexOfPreviousStatement);

```

### RuleId[ruleID=CommentedOutCode]
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

### RuleId[ruleID=CommentedOutCode]
Commented out code (4 lines)
in `languages/swift/src/main/java/de/jplag/swift/grammar/SwiftSupport.java`
#### Snippet
```java
        int start = tokens.index();
        String text = tokens.getText(Interval.of(start, stop));
        // System.out.println("text: '"+text+"', op: '"+op+"', text.equals(op): '"+text.equals(op)+"'");

        // for (int i = 0; i <= stop; i++) {
```

### RuleId[ruleID=CommentedOutCode]
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

### RuleId[ruleID=CommentedOutCode]
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

### RuleId[ruleID=CommentedOutCode]
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

### RuleId[ruleID=CommentedOutCode]
Commented out code (2 lines)
in `core/src/main/java/de/jplag/clustering/algorithm/BFGS.java`
#### Snippet
```java
            }

            // logger.debug("L-BFGS-B iteration {} moves from {} to {} where f(x) = {}", iter, Arrays.toString(x_old),
            // Arrays.toString(x), f);

```

## RuleId[ruleID=ComparatorCombinators]
### RuleId[ruleID=ComparatorCombinators]
Can be replaced with 'Comparator.comparing'
in `languages/emf-metamodel/src/main/java/de/jplag/emf/util/AbstractMetamodelVisitor.java`
#### Snippet
```java
        var children = new ArrayList<>(eObject.eContents());
        if (sortContainmentsByType) {
            children.sort((first, second) -> first.eClass().getName().compareTo(second.eClass().getName()));
        }

```

## RuleId[ruleID=ObsoleteCollection]
### RuleId[ruleID=ObsoleteCollection]
Obsolete collection type `Stack` used
in `languages/csharp/src/main/java/de/jplag/csharp/grammar/CSharpLexerBase.java`
#### Snippet
```java
    protected int interpolatedStringLevel;
    protected Stack<Boolean> interpolatedVerbatiums = new Stack<>();
    protected Stack<Integer> curlyLevels = new Stack<>();
    protected boolean verbatium;

```

### RuleId[ruleID=ObsoleteCollection]
Obsolete collection type `Stack<>` used
in `languages/csharp/src/main/java/de/jplag/csharp/grammar/CSharpLexerBase.java`
#### Snippet
```java
    protected int interpolatedStringLevel;
    protected Stack<Boolean> interpolatedVerbatiums = new Stack<>();
    protected Stack<Integer> curlyLevels = new Stack<>();
    protected boolean verbatium;

```

### RuleId[ruleID=ObsoleteCollection]
Obsolete collection type `Stack` used
in `languages/csharp/src/main/java/de/jplag/csharp/grammar/CSharpLexerBase.java`
#### Snippet
```java

    protected int interpolatedStringLevel;
    protected Stack<Boolean> interpolatedVerbatiums = new Stack<>();
    protected Stack<Integer> curlyLevels = new Stack<>();
    protected boolean verbatium;
```

### RuleId[ruleID=ObsoleteCollection]
Obsolete collection type `Stack<>` used
in `languages/csharp/src/main/java/de/jplag/csharp/grammar/CSharpLexerBase.java`
#### Snippet
```java

    protected int interpolatedStringLevel;
    protected Stack<Boolean> interpolatedVerbatiums = new Stack<>();
    protected Stack<Integer> curlyLevels = new Stack<>();
    protected boolean verbatium;
```

### RuleId[ruleID=ObsoleteCollection]
Obsolete collection type `Stack` used
in `languages/csharp/src/main/java/de/jplag/csharp/grammar/CSharpPreprocessorParserBase.java`
#### Snippet
```java
    private static final String DEBUG = "DEBUG";

    private final Stack<Boolean> conditions = new Stack<>();
    private final HashSet<String> conditionalSymbols = new HashSet<>();

```

### RuleId[ruleID=ObsoleteCollection]
Obsolete collection type `Stack<>` used
in `languages/csharp/src/main/java/de/jplag/csharp/grammar/CSharpPreprocessorParserBase.java`
#### Snippet
```java
    private static final String DEBUG = "DEBUG";

    private final Stack<Boolean> conditions = new Stack<>();
    private final HashSet<String> conditionalSymbols = new HashSet<>();

```

## RuleId[ruleID=PatternVariableCanBeUsed]
### RuleId[ruleID=PatternVariableCanBeUsed]
Variable 'fileObject' can be replaced with pattern variable
in `languages/java/src/main/java/de/jplag/java/JavacAdapter.java`
#### Snippet
```java
            File file = null;
            if (diagnosticItem.getSource() instanceof JavaFileObject) {
                JavaFileObject fileObject = (JavaFileObject) diagnosticItem.getSource();
                file = new File(fileObject.toUri());
            }
```

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'metaVar' in a Serializable class
in `cli/src/main/java/de/jplag/CommandLineArgument.java`
#### Snippet
```java
    private final Optional<String> mutuallyExclusiveGroup;
    private final Optional<ArgumentAction> action;
    private final Optional<String> metaVar;
    private final Class<?> type;
    private final boolean hidden;
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'mutuallyExclusiveGroup' in a Serializable class
in `cli/src/main/java/de/jplag/CommandLineArgument.java`
#### Snippet
```java
    private final Optional<Collection<String>> choices;
    private final Optional<String> argumentGroup;
    private final Optional<String> mutuallyExclusiveGroup;
    private final Optional<ArgumentAction> action;
    private final Optional<String> metaVar;
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'action' in a Serializable class
in `cli/src/main/java/de/jplag/CommandLineArgument.java`
#### Snippet
```java
    private final Optional<String> argumentGroup;
    private final Optional<String> mutuallyExclusiveGroup;
    private final Optional<ArgumentAction> action;
    private final Optional<String> metaVar;
    private final Class<?> type;
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'argumentGroup' in a Serializable class
in `cli/src/main/java/de/jplag/CommandLineArgument.java`
#### Snippet
```java
    private final Optional<Object> defaultValue;
    private final Optional<Collection<String>> choices;
    private final Optional<String> argumentGroup;
    private final Optional<String> mutuallyExclusiveGroup;
    private final Optional<ArgumentAction> action;
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'choices' in a Serializable class
in `cli/src/main/java/de/jplag/CommandLineArgument.java`
#### Snippet
```java
    private final String description;
    private final Optional<Object> defaultValue;
    private final Optional<Collection<String>> choices;
    private final Optional<String> argumentGroup;
    private final Optional<String> mutuallyExclusiveGroup;
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'defaultValue' in a Serializable class
in `cli/src/main/java/de/jplag/CommandLineArgument.java`
#### Snippet
```java
    private final NumberOfArgumentValues numberOfValues;
    private final String description;
    private final Optional<Object> defaultValue;
    private final Optional<Collection<String>> choices;
    private final Optional<String> argumentGroup;
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'endType' in a Serializable class
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java

        private final Optional<RustTokenType> startType;
        private final Optional<RustTokenType> endType;

        RustContext() {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'startType' in a Serializable class
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java
        STRUCT_INITIALISATION();

        private final Optional<RustTokenType> startType;
        private final Optional<RustTokenType> endType;

```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'elementTokenType' in a Serializable class
in `languages/golang/src/main/java/de/jplag/golang/JPlagGoListener.java`
#### Snippet
```java
        private final GoTokenType beginTokenType;
        private final GoTokenType endTokenType;
        private final Optional<GoTokenType> elementTokenType;

        GoBlockContext(GoTokenType beginTokenType, GoTokenType endTokenType, Optional<GoTokenType> elementTokenType) {
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### RuleId[ruleID=SizeReplaceableByIsEmpty]
`interpolatedVerbatiums.size() > 0` can be replaced with '!interpolatedVerbatiums.isEmpty()'
in `languages/csharp/src/main/java/de/jplag/csharp/grammar/CSharpLexerBase.java`
#### Snippet
```java
        interpolatedStringLevel--;
        interpolatedVerbatiums.pop();
        verbatium = (interpolatedVerbatiums.size() > 0 ? interpolatedVerbatiums.peek() : false);
    }

```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`node.getTypeArguments().size() > 0` can be replaced with '!node.getTypeArguments().isEmpty()'
in `languages/java/src/main/java/de/jplag/java/TokenGeneratingTreeScanner.java`
#### Snippet
```java
    public Object visitNewClass(NewClassTree node, Object p) {
        long start = positions.getStartPosition(ast, node);
        if (node.getTypeArguments().size() > 0) {
            addToken(JavaTokenType.J_GENERIC, start, 3 + node.getIdentifier().toString().length());
        }
```

## RuleId[ruleID=EnhancedSwitchMigration]
### RuleId[ruleID=EnhancedSwitchMigration]
Switch statement can be replaced with enhanced 'switch'
in `language-api/src/main/java/de/jplag/ParsingException.java`
#### Snippet
```java
     */
    public static ParsingException wrappingExceptions(Collection<ParsingException> exceptions) {
        switch (exceptions.size()) {
            case 0:
                return null;
```

## RuleId[ruleID=AssignmentToForLoopParameter]
### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `i`
in `languages/text/src/main/java/de/jplag/text/ParserAdapter.java`
#### Snippet
```java
            } else if (content.charAt(i) == CR) {
                if (i + 1 < content.length() && content.charAt(i + 1) == LF) { // CRLF
                    i++; // skip following LF
                }
                currentLine++;
```

## RuleId[ruleID=ConstantMathCall]
### RuleId[ruleID=ConstantMathCall]
Constant call to `sqrt()` can be simplified
in `core/src/main/java/de/jplag/clustering/algorithm/GaussianProcess.java`
#### Snippet
```java
    }

    private static final double SQRT_5 = Math.sqrt(5);

    /**
```

## RuleId[ruleID=UnnecessaryToStringCall]
### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `cli/src/main/java/de/jplag/CommandLineArgument.java`
#### Snippet
```java
            builder.append(substring.substring(1));
        }
        return Messages.getString(getClass().getSimpleName() + "." + builder.toString());
    }

```

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends File`
in `languages/csharp/src/main/java/de/jplag/csharp/CSharpParserAdapter.java`
#### Snippet
```java
     * @return the list of parsed tokens.
     */
    public List<Token> parse(Set<File> files) throws ParsingException {
        tokens = new ArrayList<>();
        for (File file : files) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends File`
in `languages/kotlin/src/main/java/de/jplag/kotlin/KotlinParserAdapter.java`
#### Snippet
```java
     * @return a list containing all tokens of all files.
     */
    public List<Token> parse(Set<File> files) throws ParsingException {
        tokens = new ArrayList<>();
        for (File file : files) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends File`
in `languages/rlang/src/main/java/de/jplag/rlang/RParserAdapter.java`
#### Snippet
```java
     * @return a list containing all tokens of all files.
     */
    public List<Token> parse(Set<File> files) throws ParsingException {
        tokens = new ArrayList<>();
        for (File file : files) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends File`
in `languages/python-3/src/main/java/de/jplag/python3/Parser.java`
#### Snippet
```java
    }

    public List<Token> parse(Set<File> files) throws ParsingException {
        tokens = new ArrayList<>();
        for (File file : files) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends File`
in `languages/swift/src/main/java/de/jplag/swift/SwiftParserAdapter.java`
#### Snippet
```java
     * @return a list containing all tokens of all files.
     */
    public List<Token> parse(Set<File> files) throws ParsingException {
        tokens = new ArrayList<>();
        for (File file : files) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends File`
in `languages/emf-metamodel/src/main/java/de/jplag/emf/parser/EcoreParser.java`
#### Snippet
```java
     * @return the list of parsed tokens.
     */
    public List<Token> parse(Set<File> files) throws ParsingException {
        tokens = new ArrayList<>();
        for (File file : files) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Submission`
in `core/src/main/java/de/jplag/reporting/reportobject/mapper/ClusteringResultMapper.java`
#### Snippet
```java
    }

    private Cluster convertCluster(de.jplag.clustering.Cluster<Submission> from) {
        var strength = from.getCommunityStrength();
        var avgSimilarity = from.getAverageSimilarity();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Submission`
in `core/src/main/java/de/jplag/reporting/reportobject/mapper/ClusteringResultMapper.java`
#### Snippet
```java
    private final Function<Submission, String> submissionToIdFunction;

    public ClusteringResultMapper(Function<Submission, String> submissionToIdFunction) {
        this.submissionToIdFunction = submissionToIdFunction;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends File`
in `languages/java/src/main/java/de/jplag/java/JavacAdapter.java`
#### Snippet
```java
    private static final JavaCompiler javac = ToolProvider.getSystemJavaCompiler();

    public void parseFiles(Set<File> files, final Parser parser) throws ParsingException {
        var listener = new DiagnosticCollector<>();

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends File`
in `languages/golang/src/main/java/de/jplag/golang/GoParserAdapter.java`
#### Snippet
```java
    private List<Token> tokens;

    public List<Token> parse(Set<File> files) throws ParsingException {
        tokens = new ArrayList<>();
        for (File file : files) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends File`
in `languages/rust/src/main/java/de/jplag/rust/RustParserAdapter.java`
#### Snippet
```java
     * @return a list containing all tokens of all files.
     */
    public List<Token> parse(Set<File> files) throws ParsingException {
        tokens = new ArrayList<>();
        for (File file : files) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Collection`
in `core/src/main/java/de/jplag/clustering/ClusteringResult.java`
#### Snippet
```java
     * it's clusters.
     */
    public static ClusteringResult<Integer> fromIntegerCollections(List<Collection<Integer>> clustering, RealMatrix similarity) {
        int numberOfSubmissions = similarity.getRowDimension();
        Map<Integer, Integer> clusterIndicesOfSubmissionIndices = new HashMap<>();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends File`
in `endtoend-testing/src/main/java/de/jplag/endtoend/helper/FileHelper.java`
#### Snippet
```java
     * @return merged filenames
     */
    public static String getEnclosedFileNamesFromCollection(Collection<File> files) {

        return files.stream().map(File::getName).map(fileName -> fileName.substring(0, fileName.lastIndexOf('.'))).collect(Collectors.joining());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ParsingException`
in `language-api/src/main/java/de/jplag/ParsingException.java`
#### Snippet
```java
     * the provided exception if only one was provided.
     */
    public static ParsingException wrappingExceptions(Collection<ParsingException> exceptions) {
        switch (exceptions.size()) {
            case 0:
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super JPlagComparison`
in `core/src/main/java/de/jplag/options/SimilarityMetric.java`
#### Snippet
```java
    private final ToDoubleFunction<JPlagComparison> similarityFunction;

    SimilarityMetric(ToDoubleFunction<JPlagComparison> similarityFunction) {
        this.similarityFunction = similarityFunction;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends File`
in `core/src/main/java/de/jplag/SubmissionSetBuilder.java`
#### Snippet
```java
     * Verify that the given root directories exist and have no duplicate entries.
     */
    private Set<File> verifyRootDirectories(Set<File> rootDirectoryNames, boolean areNewDirectories) throws ExitException {
        if (areNewDirectories && rootDirectoryNames.isEmpty()) {
            throw new RootDirectoryException("No root directories specified with submissions to check for plagiarism!");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends File`
in `core/src/main/java/de/jplag/SubmissionSetBuilder.java`
#### Snippet
```java
     * Verify that the new and old directory sets are disjunct and modify the old submissions set if necessary.
     */
    private void checkForNonOverlappingRootDirectories(Set<File> submissionDirectories, Set<File> oldSubmissionDirectories) {

        Set<File> commonRootdirectories = new HashSet<>(submissionDirectories);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super File`
in `core/src/main/java/de/jplag/SubmissionSetBuilder.java`
#### Snippet
```java
     * @param isNew states whether submissions found in the root directory must be checked for plagiarism.
     */
    private void processRootDirectoryEntries(File rootDirectory, boolean multipleRoots, Map<File, Submission> foundSubmissions, boolean isNew)
            throws ExitException {
        for (String fileName : listSubmissionFiles(rootDirectory)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Submission`
in `core/src/main/java/de/jplag/SubmissionSetBuilder.java`
#### Snippet
```java
     * @param isNew states whether submissions found in the root directory must be checked for plagiarism.
     */
    private void processRootDirectoryEntries(File rootDirectory, boolean multipleRoots, Map<File, Submission> foundSubmissions, boolean isNew)
            throws ExitException {
        for (String fileName : listSubmissionFiles(rootDirectory)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Exception`
in `core/src/main/java/de/jplag/SubmissionSetBuilder.java`
#### Snippet
```java
     * Computes the canonical file of a file, if an exception is thrown it is wrapped accordingly and re-thrown.
     */
    private File makeCanonical(File file, Function<Exception, ExitException> exceptionWrapper) throws ExitException {
        try {
            return file.getCanonicalFile();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExitException`
in `core/src/main/java/de/jplag/SubmissionSetBuilder.java`
#### Snippet
```java
     * Computes the canonical file of a file, if an exception is thrown it is wrapped accordingly and re-thrown.
     */
    private File makeCanonical(File file, Function<Exception, ExitException> exceptionWrapper) throws ExitException {
        try {
            return file.getCanonicalFile();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Submission`
in `core/src/main/java/de/jplag/reporting/jsonfactory/ComparisonReportWriter.java`
#### Snippet
```java
    private final Map<String, AtomicInteger> fileNameCollisions = new ConcurrentHashMap<>();

    public ComparisonReportWriter(Function<Submission, String> submissionToIdFunction, FileWriter fileWriter) {
        this.submissionToIdFunction = submissionToIdFunction;
        this.fileWriter = fileWriter;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super JPlagComparison`
in `core/src/main/java/de/jplag/JPlagResult.java`
#### Snippet
```java
    }

    private int[] calculateDistributionFor(List<JPlagComparison> comparisons, ToDoubleFunction<JPlagComparison> similarityExtractor) {
        int[] similarityDistribution = new int[SIMILARITY_DISTRIBUTION_SIZE];
        for (JPlagComparison comparison : comparisons) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super RealVector`
in `core/src/main/java/de/jplag/clustering/algorithm/BayesianOptimization.java`
#### Snippet
```java
     * @return result
     */
    public <T> OptimizationResult<T> maximize(Function<RealVector, OptimizationResult<T>> objectiveFunction) {
        List<Double> observations = new ArrayList<>(maxEvaluations);
        List<RealVector> testedCoordinates = new ArrayList<>(maxEvaluations);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `core/src/main/java/de/jplag/clustering/algorithm/BayesianOptimization.java`
#### Snippet
```java
    }

    private static <T> Optional<T> getNext(Spliterator<T> spliterator) {
        final List<T> result = new ArrayList<>(1);

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends RealVector`
in `core/src/main/java/de/jplag/clustering/algorithm/BayesianOptimization.java`
#### Snippet
```java
     * Numerically optimize acquisition function
     */
    private RealVector maxAcq(GaussianProcess gaussianProcess, double yMax, Spliterator<RealVector> samples, double[] randomPicks) {
        double bestScore = Double.NEGATIVE_INFINITY;
        double[] bestSolution = getNext(samples).orElseThrow().toArray();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ClusteringOptions`
in `core/src/main/java/de/jplag/clustering/Preprocessing.java`
#### Snippet
```java
    private final Function<ClusteringOptions, ClusteringPreprocessor> constructor;

    Preprocessing(Function<ClusteringOptions, ClusteringPreprocessor> constructor) {
        this.constructor = constructor;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ClusteringPreprocessor`
in `core/src/main/java/de/jplag/clustering/Preprocessing.java`
#### Snippet
```java
    private final Function<ClusteringOptions, ClusteringPreprocessor> constructor;

    Preprocessing(Function<ClusteringOptions, ClusteringPreprocessor> constructor) {
        this.constructor = constructor;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends List`
in `cli/src/main/java/de/jplag/CLI.java`
#### Snippet
```java
    }

    private void addAllMultiValueArgument(List<List<String>> argumentValues, List<String> destinationRootDirectories) {
        if (argumentValues == null) {
            return;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `cli/src/main/java/de/jplag/CLI.java`
#### Snippet
```java
    }

    private void addAllMultiValueArgument(List<List<String>> argumentValues, List<String> destinationRootDirectories) {
        if (argumentValues == null) {
            return;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends EPackage`
in `languages/emf-metamodel/src/main/java/de/jplag/emf/util/EMFUtil.java`
#### Snippet
```java
     * @param ePackages are the EPackages to register.
     */
    public static void registerEPackageURIs(Collection<EPackage> ePackages) {
        ePackages.forEach(it -> EPackage.Registry.INSTANCE.put(it.getNsURI(), it));
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `core/src/main/java/de/jplag/clustering/Cluster.java`
#### Snippet
```java
     * @return average similarity
     */
    private double averageSimilarity(BiFunction<T, T, Double> similarity) {
        List<T> members = new ArrayList<>(this.members);
        if (members.size() < 2) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `core/src/main/java/de/jplag/clustering/Cluster.java`
#### Snippet
```java
     * @return average similarity
     */
    private double averageSimilarity(BiFunction<T, T, Double> similarity) {
        List<T> members = new ArrayList<>(this.members);
        if (members.size() < 2) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends RealVector`
in `core/src/main/java/de/jplag/clustering/algorithm/GaussianProcess.java`
#### Snippet
```java
    }

    private static RealVector maternKernel(List<RealVector> observedCoordinates, RealVector vector, RealVector lengthScale) {
        RealVector out = new ArrayRealVector(observedCoordinates.size());
        for (int i = 0; i < observedCoordinates.size(); i++) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends RealVector`
in `core/src/main/java/de/jplag/clustering/algorithm/GaussianProcess.java`
#### Snippet
```java
     * Matern kernel for nu=2.5 (we get a twice differentiable gp)
     */
    private static RealMatrix maternKernel(List<RealVector> observedCoordinates, RealVector lengthScale) {
        RealMatrix k = new Array2DRowRealMatrix(observedCoordinates.size(), observedCoordinates.size());
        for (int i = 0; i < observedCoordinates.size(); i++) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends File`
in `languages/text/src/main/java/de/jplag/text/ParserAdapter.java`
#### Snippet
```java
    }

    public List<Token> parse(Set<File> files) throws ParsingException {
        tokens = new ArrayList<>();
        for (File file : files) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Submission`
in `core/src/main/java/de/jplag/reporting/reportobject/mapper/MetricMapper.java`
#### Snippet
```java
    private final Function<Submission, String> submissionToIdFunction;

    public MetricMapper(Function<Submission, String> submissionToIdFunction) {
        this.submissionToIdFunction = submissionToIdFunction;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super JPlagComparison`
in `core/src/main/java/de/jplag/reporting/reportobject/mapper/MetricMapper.java`
#### Snippet
```java
    }

    private List<TopComparison> getTopComparisons(List<JPlagComparison> comparisons, Function<JPlagComparison, Double> similarityExtractor) {
        return comparisons.stream().sorted(Comparator.comparing(similarityExtractor).reversed())
                .map(comparison -> new TopComparison(submissionToIdFunction.apply(comparison.firstSubmission()),
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Token`
in `language-api/src/main/java/de/jplag/TokenPrinter.java`
#### Snippet
```java
    }

    private static Map<File, List<Token>> groupTokensByFile(List<Token> tokens) {
        return tokens.stream().collect(Collectors.groupingBy(Token::getFile));
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Token`
in `language-api/src/main/java/de/jplag/TokenPrinter.java`
#### Snippet
```java
    }

    private static List<LineData> getLineData(List<Token> fileTokens, Optional<String> suffix) {
        // We expect that all fileTokens share the same Token.file!
        File file = fileTokens.get(0).getFile();
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `RustParserBase` has no concrete subclass
in `languages/rust/src/main/java/de/jplag/rust/grammar/RustParserBase.java`
#### Snippet
```java
import org.antlr.v4.runtime.TokenStream;

public abstract class RustParserBase extends Parser {
    protected RustParserBase(TokenStream input) {
        super(input);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `CSharpParserBase` has no concrete subclass
in `languages/csharp/src/main/java/de/jplag/csharp/grammar/CSharpParserBase.java`
#### Snippet
```java
 * was originally written by Ken Domino. Note that this class is licensed under Eclipse Public License - v 1.0.
 */
public abstract class CSharpParserBase extends Parser {
    protected CSharpParserBase(TokenStream input) {
        super(input);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `RustLexerBase` has no concrete subclass
in `languages/rust/src/main/java/de/jplag/rust/grammar/RustLexerBase.java`
#### Snippet
```java
import org.antlr.v4.runtime.Token;

public abstract class RustLexerBase extends Lexer {
    private Token currentToken;
    private Token previousToken;
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `CSharpLexerBase` has no concrete subclass
in `languages/csharp/src/main/java/de/jplag/csharp/grammar/CSharpLexerBase.java`
#### Snippet
```java
 * was originally written by Ken Domino. Note that this class is licensed under Eclipse Public License - v 1.0.
 */
abstract class CSharpLexerBase extends Lexer {
    protected CSharpLexerBase(CharStream input) {
        super(input);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `GoParserBase` has no concrete subclass
in `languages/golang/src/main/java/de/jplag/golang/grammar/GoParserBase.java`
#### Snippet
```java
 * grammars repository</a>. Licenced under BSD-3.
 */
public abstract class GoParserBase extends Parser {
    protected GoParserBase(TokenStream input) {
        super(input);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `CSharpPreprocessorParserBase` has no concrete subclass
in `languages/csharp/src/main/java/de/jplag/csharp/grammar/CSharpPreprocessorParserBase.java`
#### Snippet
```java
 * was originally written by Ken Domino. Note that this class is licensed under Eclipse Public License - v 1.0.
 */
abstract class CSharpPreprocessorParserBase extends Parser {
    private static final String FALSE = Boolean.toString(false);
    private static final String TRUE = Boolean.toString(true);
```

## RuleId[ruleID=IgnoreResultOfCall]
### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.mkdirs()` is ignored
in `endtoend-testing/src/main/java/de/jplag/endtoend/helper/FileHelper.java`
#### Snippet
```java
            File directory = new File(copyPath.toString());
            if (!directory.exists()) {
                directory.mkdirs();
            }
            Files.copy(originalPath, copyPath, StandardCopyOption.REPLACE_EXISTING);
```

### RuleId[ruleID=IgnoreResultOfCall]
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

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.mkdirs()` is ignored
in `core/src/main/java/de/jplag/Submission.java`
#### Snippet
```java
        }
        if (!subdirectory.exists()) {
            subdirectory.mkdirs();
        }
        return subdirectory;
```

## RuleId[ruleID=SynchronizeOnNonFinalField]
### RuleId[ruleID=SynchronizeOnNonFinalField]
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

## RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'action'
in `cli/src/main/java/de/jplag/CommandLineArgument.java`
#### Snippet
```java
        private Optional<String> argumentGroup = Optional.empty();
        private Optional<String> mutuallyExclusiveGroup = Optional.empty();
        private Optional<ArgumentAction> action = Optional.empty();
        private Optional<String> metaVar = Optional.empty();
        private Optional<NumberOfArgumentValues> nargs = Optional.empty();
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional`> used as type for field 'choices'
in `cli/src/main/java/de/jplag/CommandLineArgument.java`
#### Snippet
```java
        private final Class<?> type;
        private Optional<Object> defaultValue = Optional.empty();
        private Optional<Collection<String>> choices = Optional.empty();
        private Optional<String> argumentGroup = Optional.empty();
        private Optional<String> mutuallyExclusiveGroup = Optional.empty();
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'metaVar'
in `cli/src/main/java/de/jplag/CommandLineArgument.java`
#### Snippet
```java
    private final Optional<String> mutuallyExclusiveGroup;
    private final Optional<ArgumentAction> action;
    private final Optional<String> metaVar;
    private final Class<?> type;
    private final boolean hidden;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'mutuallyExclusiveGroup'
in `cli/src/main/java/de/jplag/CommandLineArgument.java`
#### Snippet
```java
    private final Optional<Collection<String>> choices;
    private final Optional<String> argumentGroup;
    private final Optional<String> mutuallyExclusiveGroup;
    private final Optional<ArgumentAction> action;
    private final Optional<String> metaVar;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'nargs'
in `cli/src/main/java/de/jplag/CommandLineArgument.java`
#### Snippet
```java
        private Optional<ArgumentAction> action = Optional.empty();
        private Optional<String> metaVar = Optional.empty();
        private Optional<NumberOfArgumentValues> nargs = Optional.empty();
        private boolean hidden;

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'action'
in `cli/src/main/java/de/jplag/CommandLineArgument.java`
#### Snippet
```java
    private final Optional<String> argumentGroup;
    private final Optional<String> mutuallyExclusiveGroup;
    private final Optional<ArgumentAction> action;
    private final Optional<String> metaVar;
    private final Class<?> type;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'metaVar'
in `cli/src/main/java/de/jplag/CommandLineArgument.java`
#### Snippet
```java
        private Optional<String> mutuallyExclusiveGroup = Optional.empty();
        private Optional<ArgumentAction> action = Optional.empty();
        private Optional<String> metaVar = Optional.empty();
        private Optional<NumberOfArgumentValues> nargs = Optional.empty();
        private boolean hidden;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'argumentGroup'
in `cli/src/main/java/de/jplag/CommandLineArgument.java`
#### Snippet
```java
    private final Optional<Object> defaultValue;
    private final Optional<Collection<String>> choices;
    private final Optional<String> argumentGroup;
    private final Optional<String> mutuallyExclusiveGroup;
    private final Optional<ArgumentAction> action;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'argumentGroup'
in `cli/src/main/java/de/jplag/CommandLineArgument.java`
#### Snippet
```java
        private Optional<Object> defaultValue = Optional.empty();
        private Optional<Collection<String>> choices = Optional.empty();
        private Optional<String> argumentGroup = Optional.empty();
        private Optional<String> mutuallyExclusiveGroup = Optional.empty();
        private Optional<ArgumentAction> action = Optional.empty();
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional`> used as type for field 'choices'
in `cli/src/main/java/de/jplag/CommandLineArgument.java`
#### Snippet
```java
    private final String description;
    private final Optional<Object> defaultValue;
    private final Optional<Collection<String>> choices;
    private final Optional<String> argumentGroup;
    private final Optional<String> mutuallyExclusiveGroup;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'defaultValue'
in `cli/src/main/java/de/jplag/CommandLineArgument.java`
#### Snippet
```java
    private final NumberOfArgumentValues numberOfValues;
    private final String description;
    private final Optional<Object> defaultValue;
    private final Optional<Collection<String>> choices;
    private final Optional<String> argumentGroup;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'mutuallyExclusiveGroup'
in `cli/src/main/java/de/jplag/CommandLineArgument.java`
#### Snippet
```java
        private Optional<Collection<String>> choices = Optional.empty();
        private Optional<String> argumentGroup = Optional.empty();
        private Optional<String> mutuallyExclusiveGroup = Optional.empty();
        private Optional<ArgumentAction> action = Optional.empty();
        private Optional<String> metaVar = Optional.empty();
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'defaultValue'
in `cli/src/main/java/de/jplag/CommandLineArgument.java`
#### Snippet
```java
        private final String flag;
        private final Class<?> type;
        private Optional<Object> defaultValue = Optional.empty();
        private Optional<Collection<String>> choices = Optional.empty();
        private Optional<String> argumentGroup = Optional.empty();
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'eObject'
in `languages/emf-metamodel/src/main/java/de/jplag/emf/MetamodelToken.java`
#### Snippet
```java
public class MetamodelToken extends Token {

    private final Optional<EObject> eObject;

    /**
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
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

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'targetType'
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java
    }

    private void transformToken(Optional<RustTokenType> targetType, Token token) {
        targetType.ifPresent(type -> transformToken(type, token));
    }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'endType'
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java

        private final Optional<RustTokenType> startType;
        private final Optional<RustTokenType> endType;

        RustContext() {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'startType'
in `languages/rust/src/main/java/de/jplag/rust/JPlagRustListener.java`
#### Snippet
```java
        STRUCT_INITIALISATION();

        private final Optional<RustTokenType> startType;
        private final Optional<RustTokenType> endType;

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'elementTokenType'
in `languages/golang/src/main/java/de/jplag/golang/JPlagGoListener.java`
#### Snippet
```java
        private final Optional<GoTokenType> elementTokenType;

        GoBlockContext(GoTokenType beginTokenType, GoTokenType endTokenType, Optional<GoTokenType> elementTokenType) {
            this.beginTokenType = beginTokenType;
            this.endTokenType = endTokenType;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'elementTokenType'
in `languages/golang/src/main/java/de/jplag/golang/JPlagGoListener.java`
#### Snippet
```java
        private final GoTokenType beginTokenType;
        private final GoTokenType endTokenType;
        private final Optional<GoTokenType> elementTokenType;

        GoBlockContext(GoTokenType beginTokenType, GoTokenType endTokenType, Optional<GoTokenType> elementTokenType) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
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

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'suffix'
in `language-api/src/main/java/de/jplag/TokenPrinter.java`
#### Snippet
```java
    }

    private static List<LineData> getLineData(List<Token> fileTokens, Optional<String> suffix) {
        // We expect that all fileTokens share the same Token.file!
        File file = fileTokens.get(0).getFile();
```

## RuleId[ruleID=SystemOutErr]
### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/de/jplag/logger/CollectedLogger.java`
#### Snippet
```java
    @SuppressWarnings("java:S106")
    void write(StringBuilder buf, Throwable throwable) {
        PrintStream targetStream = System.out;

        targetStream.println(buf.toString());
```

## RuleId[ruleID=RedundantStreamOptionalCall]
### RuleId[ruleID=RedundantStreamOptionalCall]
Redundant 'map()' call
in `endtoend-testing/src/main/java/de/jplag/endtoend/helper/FileHelper.java`
#### Snippet
```java
     */
    public static List<String> getLanguageOptionsFromPath(String[] directoryNames) {
        return Arrays.stream(directoryNames).map(language -> language).filter(Objects::nonNull).toList();
    }

```

## RuleId[ruleID=ClassNameSameAsAncestorName]
### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Language` is the same as one of its superclass' names
in `languages/emf-metamodel-dynamic/src/main/java/de/jplag/emf/dynamic/Language.java`
#### Snippet
```java
 */
@MetaInfServices(de.jplag.Language.class)
public class Language extends de.jplag.emf.Language {
    private static final String NAME = "EMF metamodels (dynamically created token set)";
    public static final String IDENTIFIER = "emf-dynamic";
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Language` is the same as one of its superclass' names
in `languages/kotlin/src/main/java/de/jplag/kotlin/Language.java`
#### Snippet
```java
 */
@MetaInfServices(de.jplag.Language.class)
public class Language implements de.jplag.Language {

    private static final String NAME = "Kotlin Parser";
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Language` is the same as one of its superclass' names
in `languages/csharp/src/main/java/de/jplag/csharp/Language.java`
#### Snippet
```java
 */
@MetaInfServices(de.jplag.Language.class)
public class Language implements de.jplag.Language {
    private static final String NAME = "C# 6 Parser";
    private static final String IDENTIFIER = "csharp";
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Language` is the same as one of its superclass' names
in `languages/java/src/main/java/de/jplag/java/Language.java`
#### Snippet
```java
 */
@MetaInfServices(de.jplag.Language.class)
public class Language implements de.jplag.Language {
    public static final String IDENTIFIER = "java";

```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Language` is the same as one of its superclass' names
in `languages/swift/src/main/java/de/jplag/swift/Language.java`
#### Snippet
```java
 */
@MetaInfServices(de.jplag.Language.class)
public class Language implements de.jplag.Language {

    private static final String NAME = "Swift Parser";
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Language` is the same as one of its superclass' names
in `languages/emf-metamodel/src/main/java/de/jplag/emf/Language.java`
#### Snippet
```java
 */
@MetaInfServices(de.jplag.Language.class)
public class Language implements de.jplag.Language {
    public static final String VIEW_FILE_SUFFIX = ".TreeView";
    public static final String FILE_ENDING = "." + EcorePackage.eNAME;
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Language` is the same as one of its superclass' names
in `languages/cpp/src/main/java/de/jplag/cpp/Language.java`
#### Snippet
```java

@MetaInfServices(de.jplag.Language.class)
public class Language implements de.jplag.Language {
    public static final String IDENTIFIER = "cpp";

```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Language` is the same as one of its superclass' names
in `languages/python-3/src/main/java/de/jplag/python3/Language.java`
#### Snippet
```java

@MetaInfServices(de.jplag.Language.class)
public class Language implements de.jplag.Language {

    public static final String IDENTIFIER = "python3";
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Language` is the same as one of its superclass' names
in `languages/scheme/src/main/java/de/jplag/scheme/Language.java`
#### Snippet
```java

@MetaInfServices(de.jplag.Language.class)
public class Language implements de.jplag.Language {

    public static final String IDENTIFIER = "scheme";
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Language` is the same as one of its superclass' names
in `languages/text/src/main/java/de/jplag/text/Language.java`
#### Snippet
```java
 */
@MetaInfServices(de.jplag.Language.class)
public class Language implements de.jplag.Language {

    public static final String IDENTIFIER = "text";
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Language` is the same as one of its superclass' names
in `languages/golang/src/main/java/de/jplag/golang/Language.java`
#### Snippet
```java

@MetaInfServices(de.jplag.Language.class)
public class Language implements de.jplag.Language {

    private static final String NAME = "Go Parser";
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Language` is the same as one of its superclass' names
in `languages/rlang/src/main/java/de/jplag/rlang/Language.java`
#### Snippet
```java
 */
@MetaInfServices(de.jplag.Language.class)
public class Language implements de.jplag.Language {

    private static final String NAME = "R Parser";
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Language` is the same as one of its superclass' names
in `languages/rust/src/main/java/de/jplag/rust/Language.java`
#### Snippet
```java
 */
@MetaInfServices(de.jplag.Language.class)
public class Language implements de.jplag.Language {

    protected static final String[] FILE_EXTENSIONS = {".rs"};
```

## RuleId[ruleID=ConditionCoveredByFurtherCondition]
### RuleId[ruleID=ConditionCoveredByFurtherCondition]
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

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `cli/src/main/java/de/jplag/CommandLineArgument.java`
#### Snippet
```java
     */
    public String flagWithoutDash() {
        return flag.replaceAll("^-+", "").replaceAll("-", "_");
    }

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `cli/src/main/java/de/jplag/CommandLineArgument.java`
#### Snippet
```java
     */
    public String flagWithoutDash() {
        return flag.replaceAll("^-+", "").replaceAll("-", "_");
    }

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `cli/src/main/java/de/jplag/CLI.java`
#### Snippet
```java
        String[] fileSuffixes = new String[] {};
        if (fileSuffixString != null) {
            fileSuffixes = fileSuffixString.replaceAll("\\s+", "").split(",");
        }

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `language-api/src/main/java/de/jplag/TokenPrinter.java`
#### Snippet
```java
                    .replace(TAB, REPLACE_TABS ? TAB_REPLACEMENT : TAB)
                    // NON_WHITESPACE is a pattern, so use replaceAll
                    .replaceAll(NON_WHITESPACE, SPACE);
            append(padding);

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `language-api/src/main/java/de/jplag/TokenPrinter.java`
#### Snippet
```java
            // Code line
            if (REPLACE_TABS) {
                currentLine = currentLine.replaceAll(TAB, TAB_REPLACEMENT);
            }

```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.tools` is unnecessary, and can be replaced with an import
in `languages/java/src/main/java/de/jplag/java/JavacAdapter.java`
#### Snippet
```java

    private List<ParsingException> processErrors(Logger logger, DiagnosticCollector<Object> listener) {
        return listener.getDiagnostics().stream().filter(it -> it.getKind() == javax.tools.Diagnostic.Kind.ERROR).map(diagnosticItem -> {
            File file = null;
            if (diagnosticItem.getSource() instanceof JavaFileObject) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `de.jplag.scheme` is unnecessary and can be removed
in `languages/scheme/src/main/java/de/jplag/scheme/Language.java`
#### Snippet
```java

    public static final String IDENTIFIER = "scheme";
    private final de.jplag.scheme.Parser parser;

    public Language() {
```

## RuleId[ruleID=NestedAssignment]
### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `core/src/main/java/de/jplag/SubmissionSet.java`
#### Snippet
```java
            currentSubmissionName = submission.getName();

            if (!(ok = submission.parse(options.debugParser()))) {
                errors++;
            }
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `tokenTypeValues` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/de/jplag/GreedyStringTiling.java`
#### Snippet
```java

    private final int minimumMatchLength;
    private ConcurrentMap<TokenType, Integer> tokenTypeValues;
    private final Map<Submission, Set<Token>> baseCodeMarkings = new IdentityHashMap<>();

```

## RuleId[ruleID=EmptyMethod]
### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/emf-metamodel/src/main/java/de/jplag/emf/util/AbstractMetamodelVisitor.java`
#### Snippet
```java
    }

    protected void visitENamedElement(ENamedElement eNamedElement) {
    }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/emf-metamodel/src/main/java/de/jplag/emf/util/AbstractMetamodelVisitor.java`
#### Snippet
```java
    }

    protected void visitEClassifier(EClassifier eClassifier) {
    }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/emf-metamodel/src/main/java/de/jplag/emf/util/AbstractMetamodelVisitor.java`
#### Snippet
```java
    }

    protected void visitEFactory(EFactory eFactory) {
    }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/emf-metamodel/src/main/java/de/jplag/emf/util/AbstractMetamodelVisitor.java`
#### Snippet
```java
    }

    protected void visitEGenericType(EGenericType eGenericType) {
    }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/emf-metamodel/src/main/java/de/jplag/emf/util/AbstractMetamodelVisitor.java`
#### Snippet
```java
    }

    protected void visitEStructuralFeature(EStructuralFeature eStructuralFeature) {
    }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java
public abstract class RCombinedBaseListener implements RListener, RFilterListener {
    @Override
    public void enterStream(RFilter.StreamContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void exitStream(RFilter.StreamContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void enterEat(RFilter.EatContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void exitEat(RFilter.EatContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void enterElement(RFilter.ElementContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void exitElement(RFilter.ElementContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void enterAtom(RFilter.AtomContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void exitAtom(RFilter.AtomContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void enterOp(RFilter.OpContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void exitOp(RFilter.OpContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void enterProg(RParser.ProgContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void exitProg(RParser.ProgContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void enterExpr(RParser.ExprContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void exitExpr(RParser.ExprContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void exitIndex_statement(RParser.Index_statementContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void exitAccess_package(RParser.Access_packageContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void exitFunction_call(RParser.Function_callContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void enterConstant(RParser.ConstantContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void exitConstant(RParser.ConstantContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void exitConstant_number(RParser.Constant_numberContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void exitConstant_string(RParser.Constant_stringContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void exitConstant_bool(RParser.Constant_boolContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void exitHelp(RParser.HelpContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void exitNext_statement(RParser.Next_statementContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void exitBreak_statement(RParser.Break_statementContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void enterExprlist(RParser.ExprlistContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void exitExprlist(RParser.ExprlistContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void enterFormlist(RParser.FormlistContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void exitFormlist(RParser.FormlistContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void enterForm(RParser.FormContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void exitForm(RParser.FormContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void enterSublist(RParser.SublistContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void exitSublist(RParser.SublistContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void enterSub(RParser.SubContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void exitSub(RParser.SubContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void exitAssign_value(RParser.Assign_valueContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void exitAssign_func_declaration(RParser.Assign_func_declarationContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void exitAssign_value_list(RParser.Assign_value_listContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void visitTerminal(TerminalNode node) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void visitErrorNode(ErrorNode node) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void enterEveryRule(ParserRuleContext context) {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `languages/rlang/src/main/java/de/jplag/rlang/RCombinedBaseListener.java`
#### Snippet
```java

    @Override
    public void exitEveryRule(ParserRuleContext context) {

    }
```

## RuleId[ruleID=RedundantFieldInitialization]
### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `core/src/main/java/de/jplag/clustering/preprocessors/PercentileThresholdProcessor.java`
#### Snippet
```java
        similarity.walkInOptimizedOrder(new DefaultRealMatrixPreservingVisitor() {

            int index = 0;

            @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `core/src/main/java/de/jplag/clustering/preprocessors/CumulativeDistributionFunctionPreprocessor.java`
#### Snippet
```java
        similarity.walkInOptimizedOrder(new DefaultRealMatrixPreservingVisitor() {

            int index = 0;

            @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `languages/cpp/src/main/java/de/jplag/cpp/NewlineStream.java`
#### Snippet
```java
 */
public class NewlineStream extends InputStream {
    private int endOfFile = 0;
    private final InputStream stream;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `core/src/main/java/de/jplag/clustering/IntegerMapping.java`
#### Snippet
```java
    private final Map<T, Integer> mapping;
    private final List<T> backMapping;
    private int size = 0;

    public IntegerMapping(int initialCapacity) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `cli/src/main/java/de/jplag/logger/CollectedLogger.java`
#### Snippet
```java
     * @see #printAllErrorsForLogger()
     */
    private transient boolean isFinalizing = false;

    private final transient SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-hh:mm:ss_SSS");
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `cli/src/main/java/de/jplag/logger/CollectedLogger.java`
#### Snippet
```java
     * The short name of this simple log instance
     */
    private transient String shortLogName = null;

    /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `core/src/main/java/de/jplag/SubmissionSet.java`
#### Snippet
```java

    private final JPlagOptions options;
    private int errors = 0;
    private String currentSubmissionName;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `core/src/main/java/de/jplag/clustering/algorithm/BayesianOptimization.java`
#### Snippet
```java
    private final double noise;
    private final RealVector lengthScale;
    private boolean debug = false;

    /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `language-api/src/main/java/de/jplag/LanguageLoader.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger("JPlag");

    private static Map<String, Language> cachedLanguageInstances = null;

    private LanguageLoader() {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `core/src/main/java/de/jplag/clustering/Cluster.java`
#### Snippet
```java
    private final double communityStrength;
    private final Collection<T> members;
    private ClusteringResult<T> clusteringResult = null;
    private final double averageSimilarity;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `language-api/src/main/java/de/jplag/TokenPrinter.java`
#### Snippet
```java
        private int columnIndex = 1;
        private int lineNumber;
        private int trailingLineSeparators = 0;

        /**
```

## RuleId[ruleID=AssignmentToMethodParameter]
### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `windowSize`
in `core/src/main/java/de/jplag/SubsequenceHashLookupTable.java`
#### Snippet
```java
     */
    SubsequenceHashLookupTable(int windowSize, int[] values, Set<Integer> markedIndexes) {
        windowSize = Math.max(1, windowSize);
        windowSize = Math.min(MAX_HASH_LENGTH, windowSize);
        this.windowSize = windowSize;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `windowSize`
in `core/src/main/java/de/jplag/SubsequenceHashLookupTable.java`
#### Snippet
```java
    SubsequenceHashLookupTable(int windowSize, int[] values, Set<Integer> markedIndexes) {
        windowSize = Math.max(1, windowSize);
        windowSize = Math.min(MAX_HASH_LENGTH, windowSize);
        this.windowSize = windowSize;
        this.values = values;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `submissionFile`
in `core/src/main/java/de/jplag/SubmissionSetBuilder.java`
#### Snippet
```java
        if (submissionFile.isDirectory() && options.subdirectoryName() != null) {
            // Use subdirectory instead
            submissionFile = new File(submissionFile, options.subdirectoryName());

            if (!submissionFile.exists()) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `submissionFile`
in `core/src/main/java/de/jplag/SubmissionSetBuilder.java`
#### Snippet
```java
        }

        submissionFile = makeCanonical(submissionFile, it -> new SubmissionException("Cannot create submission: " + submissionName, it));
        return new Submission(submissionName, submissionFile, isNew, parseFilesRecursively(submissionFile), language);
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `i`
in `core/src/main/java/de/jplag/clustering/algorithm/BFGS.java`
#### Snippet
```java
         */
        public double[] row(int i) {
            i = i < 0 ? m + i : i;
            return d.getRow(i);
        }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `targetPosition`
in `language-api/src/main/java/de/jplag/TokenPrinter.java`
#### Snippet
```java
         */
        PrinterOutputBuilder advanceToTokenPosition(String currentLine, int targetPosition, boolean breakLine) {
            targetPosition = Math.min(targetPosition, currentLine.length());
            if (!positionBeforeOrEqualTo(targetPosition)) {
                if (!breakLine) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `currentLine`
in `language-api/src/main/java/de/jplag/TokenPrinter.java`
#### Snippet
```java
            // Code line
            if (REPLACE_TABS) {
                currentLine = currentLine.replaceAll(TAB, TAB_REPLACEMENT);
            }

```

## RuleId[ruleID=HtmlWrongAttributeValue]
### RuleId[ruleID=HtmlWrongAttributeValue]
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2022-11-12-13-20-47.099.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `core/src/main/java/de/jplag/reporting/jsonfactory/DirectoryManager.java`
#### Snippet
```java
     */
    public static File createDirectory(String path, String name) throws IOException {
        File directory = new File(path.concat(File.separator).concat(name));
        if (!directory.exists() && !directory.mkdirs()) {
            throw new IOException("Failed to create dir.");
```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `core/src/main/java/de/jplag/reporting/jsonfactory/DirectoryManager.java`
#### Snippet
```java
     */
    public static File createDirectory(String path, String name) throws IOException {
        File directory = new File(path.concat(File.separator).concat(name));
        if (!directory.exists() && !directory.mkdirs()) {
            throw new IOException("Failed to create dir.");
```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `core/src/main/java/de/jplag/reporting/jsonfactory/ComparisonReportWriter.java`
#### Snippet
```java

    private String concatenate(String firstSubmissionId, String secondSubmissionId, long index) {
        return firstSubmissionId.concat("-").concat(secondSubmissionId).concat(index > 0 ? "-" + index : "").concat(".json");
    }

```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `core/src/main/java/de/jplag/reporting/jsonfactory/ComparisonReportWriter.java`
#### Snippet
```java

    private String concatenate(String firstSubmissionId, String secondSubmissionId, long index) {
        return firstSubmissionId.concat("-").concat(secondSubmissionId).concat(index > 0 ? "-" + index : "").concat(".json");
    }

```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `core/src/main/java/de/jplag/reporting/jsonfactory/ComparisonReportWriter.java`
#### Snippet
```java

    private String concatenate(String firstSubmissionId, String secondSubmissionId, long index) {
        return firstSubmissionId.concat("-").concat(secondSubmissionId).concat(index > 0 ? "-" + index : "").concat(".json");
    }

```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `core/src/main/java/de/jplag/reporting/jsonfactory/ComparisonReportWriter.java`
#### Snippet
```java

    private String concatenate(String firstSubmissionId, String secondSubmissionId, long index) {
        return firstSubmissionId.concat("-").concat(secondSubmissionId).concat(index > 0 ? "-" + index : "").concat(".json");
    }

```

## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
Return of `null`
in `language-api/src/main/java/de/jplag/ParsingException.java`
#### Snippet
```java
        switch (exceptions.size()) {
            case 0:
                return null;
            case 1:
                return exceptions.iterator().next();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/de/jplag/SubmissionSetBuilder.java`
#### Snippet
```java
            return "Ignore submission with invalid suffix: " + submissionEntry.getName();
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/de/jplag/Submission.java`
#### Snippet
```java
     */
    public List<Token> getTokenList() {
        return tokenList == null ? null : Collections.unmodifiableList(tokenList);
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/de/jplag/clustering/Preprocessing.java`
#### Snippet
```java
 */
public enum Preprocessing {
    NONE(options -> null),
    /** {@link CumulativeDistributionFunctionPreprocessor} */
    CUMULATIVE_DISTRIBUTION_FUNCTION(options -> new CumulativeDistributionFunctionPreprocessor()),
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/de/jplag/reporting/reportobject/ReportObjectFactory.java`
#### Snippet
```java
        } catch (IOException e) {
            logger.error("Could not create directory " + path + " for report viewer generation", e);
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/de/jplag/reporting/reportobject/ReportObjectFactory.java`
#### Snippet
```java
        } catch (IOException e) {
            logger.error("Could not create directory " + path + " for report viewer generation", e);
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `cli/src/main/java/de/jplag/CLI.java`
#### Snippet
```java
            System.exit(1);
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `languages/emf-metamodel/src/main/java/de/jplag/emf/util/EMFUtil.java`
#### Snippet
```java
            logger.error("Could not load {}: {}", file, exception.getCause().getMessage());
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `languages/java/src/main/java/de/jplag/java/TokenGeneratingTreeScanner.java`
#### Snippet
```java
        }
        addToken(JavaTokenType.J_IF_END, end, 1);
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/de/jplag/options/JPlagOptions.java`
#### Snippet
```java
    private static File convertLegacyBaseCodeToFile(String baseCodeSubmissionName, File submissionDirectory) throws BasecodeException {
        if (baseCodeSubmissionName == null) {
            return null;
        }
        File baseCodeAsAbsolutePath = new File(baseCodeSubmissionName);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/de/jplag/options/JPlagOptions.java`
#### Snippet
```java
        if ((fileSuffixes == null || fileSuffixes.isEmpty()) && language != null)
            return Arrays.stream(language.suffixes()).toList();
        return fileSuffixes == null ? null : Collections.unmodifiableList(fileSuffixes);
    }

```

## RuleId[ruleID=UnnecessaryLocalVariable]
### RuleId[ruleID=UnnecessaryLocalVariable]
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

### RuleId[ruleID=UnnecessaryLocalVariable]
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

## RuleId[ruleID=ZeroLengthArrayInitialization]
### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `core/src/main/java/de/jplag/clustering/PreprocessorHelper.java`
#### Snippet
```java
        int[] preservedRows = rowList.stream().mapToInt(Integer::intValue).toArray();
        if (preservedRows.length == 0) {
            return new double[0][];
        }
        similarity = similarity.getSubMatrix(preservedRows, preservedRows);
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `cli/src/main/java/de/jplag/CLI.java`
#### Snippet
```java
    public JPlagOptions buildOptionsFromArguments(Namespace namespace) {
        String fileSuffixString = SUFFIXES.getFrom(namespace);
        String[] fileSuffixes = new String[] {};
        if (fileSuffixString != null) {
            fileSuffixes = fileSuffixString.replaceAll("\\s+", "").split(",");
```

## RuleId[ruleID=RedundantUnmodifiable]
### RuleId[ruleID=RedundantUnmodifiable]
Redundant usage of the 'unmodifiableList' wrapper
in `core/src/main/java/de/jplag/clustering/ClusteringResult.java`
#### Snippet
```java

    public Collection<Cluster<T>> getClusters() {
        return Collections.unmodifiableList(clusters);
    }

```

## RuleId[ruleID=ConstantValue]
### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

## RuleId[ruleID=OptionalGetWithoutIsPresent]
### RuleId[ruleID=OptionalGetWithoutIsPresent]
`OptionalDouble.getAsDouble()` without 'isPresent()' check
in `core/src/main/java/de/jplag/clustering/ClusteringResult.java`
#### Snippet
```java
    public double getWorth(BiFunction<T, T, Double> similarity) {
        return getClusters().stream().mapToDouble(c -> c.getWorth(similarity)).map(worth -> Double.isFinite(worth) ? worth : 0).average()
                .getAsDouble();
    }

```

## RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
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

